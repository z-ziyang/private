package com.mithra.dialTest.model;

import java.util.ArrayList;
import java.util.List;

public class DialTemplate {
	private String operateName="";
	private String operateBasePath="";
	private String operateHost="";
	private String methodType="";
	private String operateSummary="";
	private List<ParameterInfo> parameterInfos = new ArrayList<ParameterInfo>();
	private List<ResponseInfo> responseInfos = new ArrayList<ResponseInfo>();

	public String getOperateName() {
		return operateName;
	}

	public void setOperateName(String operateName) {
		this.operateName = operateName;
	}

	public String getOperateBasePath() {
		return operateBasePath;
	}

	public void setOperateBasePath(String operateBasePath) {
		this.operateBasePath = operateBasePath;
	}
	
	public String getOperateHost() {
		return operateHost;
	}

	public void setOperateHost(String operateHost) {
		this.operateHost = operateHost;
	}

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public String getOperateSummary() {
		return operateSummary;
	}

	public void setOperateSummary(String operateSummary) {
		this.operateSummary = operateSummary;
	}

	public List<ParameterInfo> getParameterInfos() {
		return parameterInfos;
	}

	public void setParameterInfos(List<ParameterInfo> parameterInfos) {
		this.parameterInfos = parameterInfos;
	}

	public List<ResponseInfo> getResponseInfos() {
		return responseInfos;
	}

	public void setResponseInfos(List<ResponseInfo> responseInfos) {
		this.responseInfos = responseInfos;
	}




}
