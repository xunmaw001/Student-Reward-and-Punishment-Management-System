package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 成绩
 *
 * @author 
 * @email
 */
@TableName("chengji")
public class ChengjiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChengjiEntity() {

	}

	public ChengjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 成绩编号
     */
    @TableField(value = "chengji_uuid_number")

    private String chengjiUuidNumber;


    /**
     * 成绩名称
     */
    @TableField(value = "chengji_name")

    private String chengjiName;


    /**
     * 成绩类型
     */
    @TableField(value = "chengji_types")

    private Integer chengjiTypes;


    /**
     * 成绩详情
     */
    @TableField(value = "chengji_content")

    private String chengjiContent;


    /**
     * 成绩分数
     */
    @TableField(value = "chengji_fenshu")

    private Integer chengjiFenshu;


    /**
     * 所得分数
     */
    @TableField(value = "chengji_dedao_fenshu")

    private Integer chengjiDedaoFenshu;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }
    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：成绩编号
	 */
    public String getChengjiUuidNumber() {
        return chengjiUuidNumber;
    }
    /**
	 * 获取：成绩编号
	 */

    public void setChengjiUuidNumber(String chengjiUuidNumber) {
        this.chengjiUuidNumber = chengjiUuidNumber;
    }
    /**
	 * 设置：成绩名称
	 */
    public String getChengjiName() {
        return chengjiName;
    }
    /**
	 * 获取：成绩名称
	 */

    public void setChengjiName(String chengjiName) {
        this.chengjiName = chengjiName;
    }
    /**
	 * 设置：成绩类型
	 */
    public Integer getChengjiTypes() {
        return chengjiTypes;
    }
    /**
	 * 获取：成绩类型
	 */

    public void setChengjiTypes(Integer chengjiTypes) {
        this.chengjiTypes = chengjiTypes;
    }
    /**
	 * 设置：成绩详情
	 */
    public String getChengjiContent() {
        return chengjiContent;
    }
    /**
	 * 获取：成绩详情
	 */

    public void setChengjiContent(String chengjiContent) {
        this.chengjiContent = chengjiContent;
    }
    /**
	 * 设置：成绩分数
	 */
    public Integer getChengjiFenshu() {
        return chengjiFenshu;
    }
    /**
	 * 获取：成绩分数
	 */

    public void setChengjiFenshu(Integer chengjiFenshu) {
        this.chengjiFenshu = chengjiFenshu;
    }
    /**
	 * 设置：所得分数
	 */
    public Integer getChengjiDedaoFenshu() {
        return chengjiDedaoFenshu;
    }
    /**
	 * 获取：所得分数
	 */

    public void setChengjiDedaoFenshu(Integer chengjiDedaoFenshu) {
        this.chengjiDedaoFenshu = chengjiDedaoFenshu;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Chengji{" +
            "id=" + id +
            ", xueshengId=" + xueshengId +
            ", chengjiUuidNumber=" + chengjiUuidNumber +
            ", chengjiName=" + chengjiName +
            ", chengjiTypes=" + chengjiTypes +
            ", chengjiContent=" + chengjiContent +
            ", chengjiFenshu=" + chengjiFenshu +
            ", chengjiDedaoFenshu=" + chengjiDedaoFenshu +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
