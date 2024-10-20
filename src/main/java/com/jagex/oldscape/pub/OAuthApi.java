package com.jagex.oldscape.pub;

public interface OAuthApi {

    void setRefreshTokenRequester(RefreshAccessTokenRequester arg0);

    void setOtlTokenRequester(OtlTokenRequester arg0);

    boolean isOnLoginScreen();

    long getAccountHash();

    void setClient(int arg0);
}
