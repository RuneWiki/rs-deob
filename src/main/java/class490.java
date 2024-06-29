import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class490 extends class682 {

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    private int field6955 = -1;

    @OriginalMember(owner = "client!wq", name = "D", descriptor = "Lst;")
    private class626 field6972;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    private int field6961;

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "[[B")
    private byte[][] field6958;

    @OriginalMember(owner = "client!wq", name = "E", descriptor = "[[B")
    private byte[][] field6973;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "F")
    private float field6954;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "F")
    private float field6957;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "F")
    private float field6960;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "F")
    private float field6962;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "F")
    private float field6963;

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "F")
    private float field6964;

    @OriginalMember(owner = "client!wq", name = "w", descriptor = "F")
    private float field6965;

    @OriginalMember(owner = "client!wq", name = "x", descriptor = "F")
    private float field6966;

    @OriginalMember(owner = "client!wq", name = "z", descriptor = "F")
    private float field6968;

    @OriginalMember(owner = "client!wq", name = "A", descriptor = "F")
    private float field6969;

    @OriginalMember(owner = "client!wq", name = "B", descriptor = "F")
    private float field6970;

    @OriginalMember(owner = "client!wq", name = "F", descriptor = "F")
    private float field6974;

    @OriginalMember(owner = "client!wq", name = "C", descriptor = "[[Lsca;")
    private class225[][] field6971;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "[[Lij;")
    private class349[][] field6959;

    @OriginalMember(owner = "client!wq", name = "y", descriptor = "[[Ljh;")
    private class499[][] field6967;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "[[Ljl;")
    private class648[][] field6956;

    @OriginalMember(owner = "client!wq", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method2173(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IILwh;[I[I[I[I)V")
    private final void method2800(int arg0, int arg1, class691 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        class225 var8 = this.field6971[arg0][arg1];
        if (var8 != null) {
            if ((var8.field2981 & 2) == 0) {
                int var9 = super.field9629 * arg0;
                int var10 = super.field9629 + var9;
                int var11 = super.field9629 * arg1;
                int var12 = super.field9629 + var11;
                float var15;
                float var16;
                float var17;
                float var18;
                float var21;
                int var22;
                float var23;
                int var24;
                float var25;
                int var26;
                float var27;
                int var28;
                int var30;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                if ((var8.field2981 & 1) != 0) {
                    int var13 = super.field9624[arg0][arg1];
                    float var14 = (float) var13 * this.field6970;
                    if (this.field6955 == -1) {
                        var15 = (float) var11 * this.field6960 + (float) var9 * this.field6962 + var14 + this.field6968;
                        if (var15 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var16 = (float) var11 * this.field6960 + (float) var10 * this.field6962 + var14 + this.field6968;
                        if (var16 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var17 = (float) var12 * this.field6960 + (float) var10 * this.field6962 + var14 + this.field6968;
                        if (var17 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var18 = (float) var12 * this.field6960 + (float) var9 * this.field6962 + var14 + this.field6968;
                        if (var18 <= (float) this.field6972.field9070) {
                            return;
                        }
                    } else {
                        var15 = (float) var11 * this.field6960 + (float) var9 * this.field6962 + var14 + this.field6968;
                        var16 = (float) var11 * this.field6960 + (float) var10 * this.field6962 + var14 + this.field6968;
                        var17 = (float) var12 * this.field6960 + (float) var10 * this.field6962 + var14 + this.field6968;
                        var18 = (float) var12 * this.field6960 + (float) var9 * this.field6962 + var14 + this.field6968;
                    }
                    float var19 = (float) var13 * this.field6963;
                    float var20 = (float) var13 * this.field6965;
                    if (this.field6955 == -1) {
                        var21 = (float) var11 * this.field6957 + (float) var9 * this.field6954 + var19 + this.field6974;
                        var22 = (int) ((float) this.field6972.field9082 * var21 / var15) + arg2.field9747;
                        var23 = (float) var11 * this.field6966 + (float) var9 * this.field6969 + var20 + this.field6964;
                        var24 = (int) ((float) this.field6972.field9083 * var23 / var15) + arg2.field9762;
                        var25 = (float) var11 * this.field6957 + (float) var10 * this.field6954 + var19 + this.field6974;
                        var26 = (int) ((float) this.field6972.field9082 * var25 / var16) + arg2.field9747;
                        var27 = (float) var11 * this.field6966 + (float) var10 * this.field6969 + var20 + this.field6964;
                        var28 = (int) ((float) this.field6972.field9083 * var27 / var16) + arg2.field9762;
                        float var29 = (float) var12 * this.field6957 + (float) var10 * this.field6954 + var19 + this.field6974;
                        var30 = (int) ((float) this.field6972.field9082 * var29 / var17) + arg2.field9747;
                        float var31 = (float) var12 * this.field6966 + (float) var10 * this.field6969 + var20 + this.field6964;
                        var32 = (int) ((float) this.field6972.field9083 * var31 / var17) + arg2.field9762;
                        var33 = (float) var12 * this.field6957 + (float) var9 * this.field6954 + var19 + this.field6974;
                        var34 = (int) ((float) this.field6972.field9082 * var33 / var18) + arg2.field9747;
                        var35 = (float) var12 * this.field6966 + (float) var9 * this.field6969 + var20 + this.field6964;
                        var36 = (int) ((float) this.field6972.field9083 * var35 / var18) + arg2.field9762;
                    } else {
                        var21 = (float) var11 * this.field6957 + (float) var9 * this.field6954 + var19 + this.field6974;
                        var22 = (int) ((float) this.field6972.field9082 * var21 / (float) this.field6955) + arg2.field9747;
                        var23 = (float) var11 * this.field6966 + (float) var9 * this.field6969 + var20 + this.field6964;
                        var24 = (int) ((float) this.field6972.field9083 * var23 / (float) this.field6955) + arg2.field9762;
                        var25 = (float) var11 * this.field6957 + (float) var10 * this.field6954 + var19 + this.field6974;
                        var26 = (int) ((float) this.field6972.field9082 * var25 / (float) this.field6955) + arg2.field9747;
                        var27 = (float) var11 * this.field6966 + (float) var10 * this.field6969 + var20 + this.field6964;
                        var28 = (int) ((float) this.field6972.field9083 * var27 / (float) this.field6955) + arg2.field9762;
                        float var37 = (float) var12 * this.field6957 + (float) var10 * this.field6954 + var19 + this.field6974;
                        var30 = (int) ((float) this.field6972.field9082 * var37 / (float) this.field6955) + arg2.field9747;
                        float var38 = (float) var12 * this.field6966 + (float) var10 * this.field6969 + var20 + this.field6964;
                        var32 = (int) ((float) this.field6972.field9083 * var38 / (float) this.field6955) + arg2.field9762;
                        var33 = (float) var12 * this.field6957 + (float) var9 * this.field6954 + var19 + this.field6974;
                        var34 = (int) ((float) this.field6972.field9082 * var33 / (float) this.field6955) + arg2.field9747;
                        var35 = (float) var12 * this.field6966 + (float) var9 * this.field6969 + var20 + this.field6964;
                        var36 = (int) ((float) this.field6972.field9083 * var35 / (float) this.field6955) + arg2.field9762;
                    }
                } else {
                    int var39 = super.field9624[arg0][arg1];
                    int var40 = super.field9624[arg0 + 1][arg1];
                    int var41 = super.field9624[arg0 + 1][arg1 + 1];
                    int var42 = super.field9624[arg0][arg1 + 1];
                    if (this.field6955 == -1) {
                        var15 = (float) var11 * this.field6960 + (float) var9 * this.field6962 + (float) var39 * this.field6970 + this.field6968;
                        if (var15 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var16 = (float) var11 * this.field6960 + (float) var10 * this.field6962 + (float) var40 * this.field6970 + this.field6968;
                        if (var16 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var17 = (float) var12 * this.field6960 + (float) var10 * this.field6962 + (float) var41 * this.field6970 + this.field6968;
                        if (var17 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var18 = (float) var12 * this.field6960 + (float) var9 * this.field6962 + (float) var42 * this.field6970 + this.field6968;
                        if (var18 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var21 = (float) var11 * this.field6957 + (float) var9 * this.field6954 + (float) var39 * this.field6963 + this.field6974;
                        var22 = (int) ((float) this.field6972.field9082 * var21 / var15) + arg2.field9747;
                        var23 = (float) var11 * this.field6966 + (float) var9 * this.field6969 + (float) var39 * this.field6965 + this.field6964;
                        var24 = (int) ((float) this.field6972.field9083 * var23 / var15) + arg2.field9762;
                        var25 = (float) var11 * this.field6957 + (float) var10 * this.field6954 + (float) var40 * this.field6963 + this.field6974;
                        var26 = (int) ((float) this.field6972.field9082 * var25 / var16) + arg2.field9747;
                        var27 = (float) var11 * this.field6966 + (float) var10 * this.field6969 + (float) var40 * this.field6965 + this.field6964;
                        var28 = (int) ((float) this.field6972.field9083 * var27 / var16) + arg2.field9762;
                        float var43 = (float) var12 * this.field6957 + (float) var10 * this.field6954 + (float) var41 * this.field6963 + this.field6974;
                        var30 = (int) ((float) this.field6972.field9082 * var43 / var17) + arg2.field9747;
                        float var44 = (float) var12 * this.field6966 + (float) var10 * this.field6969 + (float) var41 * this.field6965 + this.field6964;
                        var32 = (int) ((float) this.field6972.field9083 * var44 / var17) + arg2.field9762;
                        var33 = (float) var12 * this.field6957 + (float) var9 * this.field6954 + (float) var42 * this.field6963 + this.field6974;
                        var34 = (int) ((float) this.field6972.field9082 * var33 / var18) + arg2.field9747;
                        var35 = (float) var12 * this.field6966 + (float) var9 * this.field6969 + (float) var42 * this.field6965 + this.field6964;
                        var36 = (int) ((float) this.field6972.field9083 * var35 / var18) + arg2.field9762;
                    } else {
                        var15 = (float) var11 * this.field6960 + (float) var9 * this.field6962 + (float) var39 * this.field6970 + this.field6968;
                        var16 = (float) var11 * this.field6960 + (float) var10 * this.field6962 + (float) var40 * this.field6970 + this.field6968;
                        var17 = (float) var12 * this.field6960 + (float) var10 * this.field6962 + (float) var41 * this.field6970 + this.field6968;
                        var18 = (float) var12 * this.field6960 + (float) var9 * this.field6962 + (float) var42 * this.field6970 + this.field6968;
                        var21 = (float) var11 * this.field6957 + (float) var9 * this.field6954 + (float) var39 * this.field6963 + this.field6974;
                        var22 = (int) ((float) this.field6972.field9082 * var21 / (float) this.field6955) + arg2.field9747;
                        var23 = (float) var11 * this.field6966 + (float) var9 * this.field6969 + (float) var39 * this.field6965 + this.field6964;
                        var24 = (int) ((float) this.field6972.field9083 * var23 / (float) this.field6955) + arg2.field9762;
                        var25 = (float) var11 * this.field6957 + (float) var10 * this.field6954 + (float) var40 * this.field6963 + this.field6974;
                        var26 = (int) ((float) this.field6972.field9082 * var25 / (float) this.field6955) + arg2.field9747;
                        var27 = (float) var11 * this.field6966 + (float) var10 * this.field6969 + (float) var40 * this.field6965 + this.field6964;
                        var28 = (int) ((float) this.field6972.field9083 * var27 / (float) this.field6955) + arg2.field9762;
                        float var45 = (float) var12 * this.field6957 + (float) var10 * this.field6954 + (float) var41 * this.field6963 + this.field6974;
                        var30 = (int) ((float) this.field6972.field9082 * var45 / (float) this.field6955) + arg2.field9747;
                        float var46 = (float) var12 * this.field6966 + (float) var10 * this.field6969 + (float) var41 * this.field6965 + this.field6964;
                        var32 = (int) ((float) this.field6972.field9083 * var46 / (float) this.field6955) + arg2.field9762;
                        var33 = (float) var12 * this.field6957 + (float) var9 * this.field6954 + (float) var42 * this.field6963 + this.field6974;
                        var34 = (int) ((float) this.field6972.field9082 * var33 / (float) this.field6955) + arg2.field9747;
                        var35 = (float) var12 * this.field6966 + (float) var9 * this.field6969 + (float) var42 * this.field6965 + this.field6964;
                        var36 = (int) ((float) this.field6972.field9083 * var35 / (float) this.field6955) + arg2.field9762;
                    }
                }
                if (this.field6955 == -1) {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field9752 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field9748 || var34 > arg2.field9748 || var26 > arg2.field9748;
                        if (var8.field2980 >= 0) {
                            if (this.method2802(this.field6972.field1491.method955(-1330, var8.field2980).field6600)) {
                                arg2.field9750 = 100;
                            }
                            arg2.method3887(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field2977 & 65535, var8.field2979 & 65535, var8.field2978 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field2980);
                            arg2.field9750 = 0;
                        } else {
                            arg2.method3883(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field2977 & 65535, var8.field2979 & 65535, var8.field2978 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field9752 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field9748 || var26 > arg2.field9748 || var34 > arg2.field9748;
                        if (var8.field2980 >= 0) {
                            if (this.method2802(this.field6972.field1491.method955(-1330, var8.field2980).field6600)) {
                                arg2.field9750 = 100;
                            }
                            arg2.method3887(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field2982 & 65535, var8.field2978 & 65535, var8.field2979 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field2980);
                            arg2.field9750 = 0;
                            return;
                        }
                        arg2.method3883(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field2982 & 65535, var8.field2978 & 65535, var8.field2979 & 65535);
                        return;
                    }
                } else {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field9752 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field9748 || var34 > arg2.field9748 || var26 > arg2.field9748;
                        if (var8.field2980 >= 0) {
                            if (this.method2802(this.field6972.field1491.method955(-1330, var8.field2980).field6600)) {
                                arg2.field9750 = 100;
                            }
                            arg2.method3887(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field2977 & 65535, var8.field2979 & 65535, var8.field2978 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field6955, this.field6955, this.field6955, var8.field2980);
                            arg2.field9750 = 0;
                        } else {
                            arg2.method3883(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field2977 & 65535, var8.field2979 & 65535, var8.field2978 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field9752 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field9748 || var26 > arg2.field9748 || var34 > arg2.field9748;
                        if (var8.field2980 >= 0) {
                            if (this.method2802(this.field6972.field1491.method955(-1330, var8.field2980).field6600)) {
                                arg2.field9750 = 100;
                            }
                            arg2.method3887(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field2982 & 65535, var8.field2978 & 65535, var8.field2979 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field6955, this.field6955, this.field6955, var8.field2980);
                            arg2.field9750 = 0;
                            return;
                        }
                        arg2.method3883(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field2982 & 65535, var8.field2978 & 65535, var8.field2979 & 65535);
                    }
                }
            }
        } else {
            class349 var47 = this.field6959[arg0][arg1];
            if (var47 != null) {
                if (this.field6955 == -1) {
                    for (int var48 = 0; var48 < var47.field5164; ++var48) {
                        int var49 = (arg0 << super.field9623) + var47.field5163[var48];
                        short var50 = var47.field5173[var48];
                        int var51 = (arg1 << super.field9623) + var47.field5168[var48];
                        float var52 = (float) var51 * this.field6960 + (float) var49 * this.field6962 + (float) var50 * this.field6970 + this.field6968;
                        if (var52 <= (float) this.field6972.field9070) {
                            return;
                        }
                        float var53 = (float) var51 * this.field6957 + (float) var49 * this.field6954 + (float) var50 * this.field6963 + this.field6974;
                        float var54 = (float) var51 * this.field6966 + (float) var49 * this.field6969 + (float) var50 * this.field6965 + this.field6964;
                        arg3[var48] = (int) ((float) this.field6972.field9082 * var53 / var52) + arg2.field9747;
                        arg4[var48] = (int) ((float) this.field6972.field9083 * var54 / var52) + arg2.field9762;
                        arg5[var48] = (int) var52;
                    }
                } else {
                    for (int var55 = 0; var55 < var47.field5164; ++var55) {
                        int var107 = (arg0 << super.field9623) + var47.field5163[var55];
                        short var108 = var47.field5173[var55];
                        int var109 = (arg1 << super.field9623) + var47.field5168[var55];
                        float var110 = (float) var109 * this.field6960 + (float) var107 * this.field6962 + (float) var108 * this.field6970 + this.field6968;
                        float var111 = (float) var109 * this.field6957 + (float) var107 * this.field6954 + (float) var108 * this.field6963 + this.field6974;
                        float var112 = (float) var109 * this.field6966 + (float) var107 * this.field6969 + (float) var108 * this.field6965 + this.field6964;
                        arg3[var55] = (int) ((float) this.field6972.field9082 * var111 / (float) this.field6955) + arg2.field9747;
                        arg4[var55] = (int) ((float) this.field6972.field9083 * var112 / (float) this.field6955) + arg2.field9762;
                        arg5[var55] = (int) var110;
                    }
                }
                if (var47.field5169 != null) {
                    int var56 = super.field9624[arg0][arg1];
                    int var57 = super.field9624[arg0 + 1][arg1];
                    int var58 = super.field9624[arg0][arg1 + 1];
                    int var59 = super.field9629 * arg0;
                    int var60 = super.field9629 + var59;
                    int var61 = super.field9629 * arg1;
                    int var62 = super.field9629 + var61;
                    float var63 = (float) var61 * this.field6957 + (float) var56 * this.field6963 + (float) var59 * this.field6954 + this.field6974;
                    float var64 = (float) var61 * this.field6966 + (float) var56 * this.field6965 + (float) var59 * this.field6969 + this.field6964;
                    float var65 = (float) var61 * this.field6960 + (float) var56 * this.field6970 + (float) var59 * this.field6962 + this.field6968;
                    float var66 = (float) var61 * this.field6957 + (float) var57 * this.field6963 + (float) var60 * this.field6954 + this.field6974;
                    float var67 = (float) var61 * this.field6966 + (float) var57 * this.field6965 + (float) var60 * this.field6969 + this.field6964;
                    float var68 = (float) var61 * this.field6960 + (float) var57 * this.field6970 + (float) var60 * this.field6962 + this.field6968;
                    float var69 = (float) var62 * this.field6957 + (float) var58 * this.field6963 + (float) var59 * this.field6954 + this.field6974;
                    float var70 = (float) var62 * this.field6966 + (float) var58 * this.field6965 + (float) var59 * this.field6969 + this.field6964;
                    float var71 = (float) var62 * this.field6960 + (float) var58 * this.field6970 + (float) var59 * this.field6962 + this.field6968;
                    if (this.field6955 == -1) {
                        for (int var72 = 0; var72 < var47.field5166; ++var72) {
                            short var73 = var47.field5170[var72];
                            short var74 = var47.field5165[var72];
                            short var75 = var47.field5162[var72];
                            int var76 = arg3[var73];
                            int var77 = arg3[var74];
                            int var78 = arg3[var75];
                            int var79 = arg4[var73];
                            int var80 = arg4[var74];
                            int var81 = arg4[var75];
                            if ((var76 - var77) * (var81 - var80) - (var78 - var77) * (var79 - var80) > 0) {
                                arg2.field9752 = var76 < 0 || var77 < 0 || var78 < 0 || var76 > arg2.field9748 || var77 > arg2.field9748 || var78 > arg2.field9748;
                                short var82 = var47.field5169[var72];
                                if (var82 != -1) {
                                    if (this.method2802(this.field6972.field1491.method955(-1330, var82).field6600)) {
                                        arg2.field9750 = 100;
                                    }
                                    arg2.method3887(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], var47.field5171[var73], var47.field5171[var74], var47.field5171[var75], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, (int) var65, (int) var68, (int) var71, var82);
                                    arg2.field9750 = 0;
                                } else {
                                    int var83 = var47.field5161[var72];
                                    if (var83 != -1) {
                                        arg2.method3883(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], class36.method216(127, var47.field5171[var73], var83), class36.method216(127, var47.field5171[var74], var83), class36.method216(127, var47.field5171[var75], var83));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var84 = 0; var84 < var47.field5166; ++var84) {
                        short var85 = var47.field5170[var84];
                        short var86 = var47.field5165[var84];
                        short var87 = var47.field5162[var84];
                        int var88 = arg3[var85];
                        int var89 = arg3[var86];
                        int var90 = arg3[var87];
                        int var91 = arg4[var85];
                        int var92 = arg4[var86];
                        int var93 = arg4[var87];
                        if ((var88 - var89) * (var93 - var92) - (var90 - var89) * (var91 - var92) > 0) {
                            arg2.field9752 = var88 < 0 || var89 < 0 || var90 < 0 || var88 > arg2.field9748 || var89 > arg2.field9748 || var90 > arg2.field9748;
                            short var94 = var47.field5169[var84];
                            if (var94 != -1) {
                                if (this.method2802(this.field6972.field1491.method955(-1330, var94).field6600)) {
                                    arg2.field9750 = 100;
                                }
                                arg2.method3887(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], var47.field5171[var85], var47.field5171[var86], var47.field5171[var87], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, this.field6955, this.field6955, this.field6955, var94);
                                arg2.field9750 = 0;
                            } else {
                                int var95 = var47.field5161[var84];
                                if (var95 != -1) {
                                    arg2.method3883(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], class36.method216(127, var47.field5171[var85], var95), class36.method216(127, var47.field5171[var86], var95), class36.method216(127, var47.field5171[var87], var95));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var96 = 0; var96 < var47.field5166; ++var96) {
                    short var97 = var47.field5170[var96];
                    short var98 = var47.field5165[var96];
                    short var99 = var47.field5162[var96];
                    int var100 = arg3[var97];
                    int var101 = arg3[var98];
                    int var102 = arg3[var99];
                    int var103 = arg4[var97];
                    int var104 = arg4[var98];
                    int var105 = arg4[var99];
                    if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                        int var106 = var47.field5161[var96];
                        if (var106 != -1) {
                            arg2.field9752 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg2.field9748 || var101 > arg2.field9748 || var102 > arg2.field9748;
                            arg2.method3883(var103, var104, var105, var100, var101, var102, arg5[var97], arg5[var98], arg5[var99], class36.method216(127, var47.field5171[var97], var106), class36.method216(127, var47.field5171[var98], var106), class36.method216(127, var47.field5171[var99], var106));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(II)I")
    private static final int method2801(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[[ZZ)V")
    public final void method2174(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class121 var6 = this.field6972.field9078;
        this.field6955 = -1;
        this.field6954 = var6.field1792;
        this.field6963 = var6.field1801;
        this.field6957 = var6.field1794;
        this.field6974 = var6.field1803;
        this.field6969 = var6.field1787;
        this.field6965 = var6.field1804;
        this.field6966 = var6.field1800;
        this.field6964 = var6.field1784;
        this.field6962 = var6.field1788;
        this.field6970 = var6.field1793;
        this.field6960 = var6.field1806;
        this.field6968 = var6.field1799;
        for (int var7 = 0; var7 < arg2 + arg2; ++var7) {
            for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - arg2 + var7;
                    int var10 = arg1 - arg2 + var8;
                    if (var9 >= 0 && var9 < super.field9628 && var10 >= 0 && var10 < super.field9630) {
                        this.method2182(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "BA", descriptor = "()V")
    public final void method2175() {
        this.field6958 = null;
        this.field6973 = null;
    }

    @OriginalMember(owner = "client!wq", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method2181(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wq", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method2184(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field6967 == null) {
            this.field6967 = new class499[super.field9628][super.field9630];
            this.field6956 = new class648[super.field9628][super.field9630];
        } else if (this.field6971 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class589.field8551[class399.method2479(arg6[var15], false) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class589.field8551[class399.method2479(arg7[var16], false) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field9629 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field9629 && arg4[var22] == super.field9629) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field9629) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field9629 != arg2[var24] && arg2[0] - super.field9629 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field9629 != arg4[var24] && arg4[0] - super.field9629 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class499 var25 = new class499();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field7076 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field7070 = (byte) (var25.field7070 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (super.field9624[arg0 + 1][arg1] == super.field9624[arg0][arg1] && super.field9624[arg0 + 1][arg1 + 1] == super.field9624[arg0][arg1] && super.field9624[arg0][arg1 + 1] == super.field9624[arg0][arg1]) {
                    var25.field7070 = (byte) (var25.field7070 | 1);
                }
                if (var27 != -1 && (var25.field7070 & 2) == 0 && !this.field6972.field1491.method955(-1330, var27).field6612) {
                    var25.field7066 = this.field6958[arg0][arg1] - this.field6973[arg0][arg1];
                    var25.field7071 = this.field6958[arg0 + 1][arg1] - this.field6973[arg0 + 1][arg1];
                    var25.field7069 = this.field6958[arg0 + 1][arg1 + 1] - this.field6973[arg0 + 1][arg1 + 1];
                    var25.field7074 = this.field6958[arg0][arg1 + 1] - this.field6973[arg0][arg1 + 1];
                    var25.field7067 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field7066 = class218.method1375(var28, method2801(arg6[var18] >> 8, this.field6958[arg0][arg1] - this.field6973[arg0][arg1]), arg10, -95);
                    if (var25.field7076 != 0) {
                        var25.field7066 |= 255 - (this.field6958[arg0][arg1] - this.field6973[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field7071 = class218.method1375(var29, method2801(arg6[var19] >> 8, this.field6958[arg0 + 1][arg1] - this.field6973[arg0 + 1][arg1]), arg10, -101);
                    if (var25.field7076 != 0) {
                        var25.field7071 |= 255 - (this.field6958[arg0 + 1][arg1] - this.field6973[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field7069 = class218.method1375(var30, method2801(arg6[var20] >> 8, this.field6958[arg0 + 1][arg1 + 1] - this.field6973[arg0 + 1][arg1 + 1]), arg10, -101);
                    if (var25.field7076 != 0) {
                        var25.field7069 |= 255 - (this.field6958[arg0 + 1][arg1 + 1] - this.field6973[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field7074 = class218.method1375(var31, method2801(arg6[var21] >> 8, this.field6958[arg0][arg1 + 1] - this.field6973[arg0][arg1 + 1]), arg10, -78);
                    if (var25.field7076 != 0) {
                        var25.field7074 |= 255 - (this.field6958[arg0][arg1 + 1] - this.field6973[arg0][arg1 + 1]) << 25;
                    }
                    var25.field7067 = -1;
                }
                if (arg5 != null) {
                    var25.field7068 = (short) arg5[var20];
                    var25.field7072 = (short) arg5[var21];
                    var25.field7075 = (short) arg5[var19];
                    var25.field7073 = (short) arg5[var18];
                }
                this.field6967[arg0][arg1] = var25;
            } else {
                class648 var32 = new class648();
                var32.field9313 = (short) arg2.length;
                var32.field9315 = (short) (arg2.length / 3);
                var32.field9319 = new short[var32.field9313];
                var32.field9312 = new short[var32.field9313];
                var32.field9316 = new short[var32.field9313];
                var32.field9311 = new int[var32.field9313];
                if (arg5 != null) {
                    var32.field9314 = new short[var32.field9313];
                }
                for (int var33 = 0; var33 < var32.field9313; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field6958[arg0][arg1] - this.field6973[arg0][arg1];
                    } else if (var48 == 0 && super.field9629 == var49) {
                        var51 = this.field6958[arg0][arg1 + 1] - this.field6973[arg0][arg1 + 1];
                    } else if (super.field9629 == var48 && super.field9629 == var49) {
                        var51 = this.field6958[arg0 + 1][arg1 + 1] - this.field6973[arg0 + 1][arg1 + 1];
                    } else if (super.field9629 == var48 && var49 == 0) {
                        var51 = this.field6958[arg0 + 1][arg1] - this.field6973[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field6958[arg0 + 1][arg1] - this.field6973[arg0 + 1][arg1]) * var48 + (this.field6958[arg0][arg1] - this.field6973[arg0][arg1]) * (super.field9629 - var48);
                        int var53 = (this.field6958[arg0 + 1][arg1 + 1] - this.field6973[arg0 + 1][arg1 + 1]) * var48 + (this.field6958[arg0][arg1 + 1] - this.field6973[arg0][arg1 + 1]) * (super.field9629 - var48);
                        var51 = (super.field9629 - var49) * var52 + var49 * var53 >> super.field9623 * 2;
                    }
                    int var54 = (arg0 << super.field9623) + var48;
                    int var55 = (arg1 << super.field9623) + var49;
                    var32.field9319[var33] = (short) var48;
                    var32.field9316[var33] = (short) var49;
                    var32.field9312[var33] = (short) (this.method3824(var54, 124, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field6972.field1491.method955(-1330, arg8[var33]).field6612) {
                        var32.field9311[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field9311[var33] = var51 << 25;
                        } else {
                            var32.field9311[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field9314[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field9311[var33] = class218.method1375(var56, method2801(arg6[var33] >> 8, var51), arg10, 100);
                        if (arg7 != null) {
                            var32.field9311[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field9315; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field6972.field1491.method955(-1330, arg8[var35 * 3]).field6612) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field9318 = new int[var32.field9315];
                }
                if (var34) {
                    var32.field9310 = new short[var32.field9315];
                    var32.field9317 = new short[var32.field9315];
                }
                for (int var36 = 0; var36 < var32.field9315; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field9318[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field6972.field1491.method955(-1330, var42).field6612) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field6972.field1491.method955(-1330, var43).field6612) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field6972.field1491.method955(-1330, var44).field6612) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field9310[var36] = (short) var44;
                            var32.field9317[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field6972.field1491.method955(-1330, var45).field6612) {
                                    var32.field9311[var37] = class589.field8551[class399.method2479(this.field6972.field1491.method955(-1330, var45).field6597 & 65535, false) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field6972.field1491.method955(-1330, var46).field6612) {
                                    var32.field9311[var38] = class589.field8551[class399.method2479(this.field6972.field1491.method955(-1330, var46).field6597 & 65535, false) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field6972.field1491.method955(-1330, var47).field6612) {
                                    var32.field9311[var39] = class589.field8551[class399.method2479(this.field6972.field1491.method955(-1330, var47).field6597 & 65535, false) & 65535];
                                }
                            }
                            var32.field9310[var36] = -1;
                        }
                    }
                }
                this.field6956[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)Z")
    private final boolean method2802(int arg0) {
        if ((this.field6961 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIZLqb;Lwh;[I[I[I[I)V")
    private final void method2803(int arg0, int arg1, boolean arg2, class56 arg3, class691 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8) {
        class499 var10 = this.field6967[arg0][arg1];
        if (var10 != null) {
            if ((var10.field7070 & 2) == 0) {
                int var11 = super.field9629 * arg0;
                int var12 = super.field9629 + var11;
                int var13 = super.field9629 * arg1;
                int var14 = super.field9629 + var13;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                float var21;
                float var22;
                float var23;
                float var24;
                float var31;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                float var37;
                int var38;
                float var39;
                int var40;
                float var41;
                int var42;
                float var43;
                int var44;
                float var45;
                int var46;
                if ((var10.field7070 & 1) != 0 && !arg2) {
                    int var19 = super.field9624[arg0][arg1];
                    float var20 = (float) var19 * this.field6970;
                    if (this.field6955 == -1) {
                        var21 = (float) var13 * this.field6960 + (float) var11 * this.field6962 + var20 + this.field6968;
                        if (var21 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var22 = (float) var13 * this.field6960 + (float) var12 * this.field6962 + var20 + this.field6968;
                        if (var22 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var23 = (float) var14 * this.field6960 + (float) var12 * this.field6962 + var20 + this.field6968;
                        if (var23 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var24 = (float) var14 * this.field6960 + (float) var11 * this.field6962 + var20 + this.field6968;
                        if (var24 <= (float) this.field6972.field9070) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field6960 + (float) var11 * this.field6962 + var20 + this.field6968;
                        var22 = (float) var13 * this.field6960 + (float) var12 * this.field6962 + var20 + this.field6968;
                        var23 = (float) var14 * this.field6960 + (float) var12 * this.field6962 + var20 + this.field6968;
                        var24 = (float) var14 * this.field6960 + (float) var11 * this.field6962 + var20 + this.field6968;
                    }
                    if (arg3.field886) {
                        int var25 = (int) (var21 - (float) arg3.field888);
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = (int) (var22 - (float) arg3.field888);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field888);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field888);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    float var29 = (float) var19 * this.field6963;
                    float var30 = (float) var19 * this.field6965;
                    if (this.field6955 == -1) {
                        var31 = (float) var13 * this.field6957 + (float) var11 * this.field6954 + var29 + this.field6974;
                        var32 = (int) ((float) this.field6972.field9082 * var31 / var21) + arg4.field9747;
                        var33 = (float) var13 * this.field6966 + (float) var11 * this.field6969 + var30 + this.field6964;
                        var34 = (int) ((float) this.field6972.field9083 * var33 / var21) + arg4.field9762;
                        var35 = (float) var13 * this.field6957 + (float) var12 * this.field6954 + var29 + this.field6974;
                        var36 = (int) ((float) this.field6972.field9082 * var35 / var22) + arg4.field9747;
                        var37 = (float) var13 * this.field6966 + (float) var12 * this.field6969 + var30 + this.field6964;
                        var38 = (int) ((float) this.field6972.field9083 * var37 / var22) + arg4.field9762;
                        var39 = (float) var14 * this.field6957 + (float) var12 * this.field6954 + var29 + this.field6974;
                        var40 = (int) ((float) this.field6972.field9082 * var39 / var23) + arg4.field9747;
                        var41 = (float) var14 * this.field6966 + (float) var12 * this.field6969 + var30 + this.field6964;
                        var42 = (int) ((float) this.field6972.field9083 * var41 / var23) + arg4.field9762;
                        var43 = (float) var14 * this.field6957 + (float) var11 * this.field6954 + var29 + this.field6974;
                        var44 = (int) ((float) this.field6972.field9082 * var43 / var24) + arg4.field9747;
                        var45 = (float) var14 * this.field6966 + (float) var11 * this.field6969 + var30 + this.field6964;
                        var46 = (int) ((float) this.field6972.field9083 * var45 / var24) + arg4.field9762;
                    } else {
                        var31 = (float) var13 * this.field6957 + (float) var11 * this.field6954 + var29 + this.field6974;
                        var32 = (int) ((float) this.field6972.field9082 * var31 / (float) this.field6955) + arg4.field9747;
                        var33 = (float) var13 * this.field6966 + (float) var11 * this.field6969 + var30 + this.field6964;
                        var34 = (int) ((float) this.field6972.field9083 * var33 / (float) this.field6955) + arg4.field9762;
                        var35 = (float) var13 * this.field6957 + (float) var12 * this.field6954 + var29 + this.field6974;
                        var36 = (int) ((float) this.field6972.field9082 * var35 / (float) this.field6955) + arg4.field9747;
                        var37 = (float) var13 * this.field6966 + (float) var12 * this.field6969 + var30 + this.field6964;
                        var38 = (int) ((float) this.field6972.field9083 * var37 / (float) this.field6955) + arg4.field9762;
                        var39 = (float) var14 * this.field6957 + (float) var12 * this.field6954 + var29 + this.field6974;
                        var40 = (int) ((float) this.field6972.field9082 * var39 / (float) this.field6955) + arg4.field9747;
                        var41 = (float) var14 * this.field6966 + (float) var12 * this.field6969 + var30 + this.field6964;
                        var42 = (int) ((float) this.field6972.field9083 * var41 / (float) this.field6955) + arg4.field9762;
                        var43 = (float) var14 * this.field6957 + (float) var11 * this.field6954 + var29 + this.field6974;
                        var44 = (int) ((float) this.field6972.field9082 * var43 / (float) this.field6955) + arg4.field9747;
                        var45 = (float) var14 * this.field6966 + (float) var11 * this.field6969 + var30 + this.field6964;
                        var46 = (int) ((float) this.field6972.field9083 * var45 / (float) this.field6955) + arg4.field9762;
                    }
                } else {
                    int var47 = super.field9624[arg0][arg1];
                    int var48 = super.field9624[arg0 + 1][arg1];
                    int var49 = super.field9624[arg0 + 1][arg1 + 1];
                    int var50 = super.field9624[arg0][arg1 + 1];
                    if (this.field6955 == -1) {
                        var21 = (float) var13 * this.field6960 + (float) var11 * this.field6962 + (float) var47 * this.field6970 + this.field6968;
                        if (var21 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var22 = (float) var13 * this.field6960 + (float) var12 * this.field6962 + (float) var48 * this.field6970 + this.field6968;
                        if (var22 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var23 = (float) var14 * this.field6960 + (float) var12 * this.field6962 + (float) var49 * this.field6970 + this.field6968;
                        if (var23 <= (float) this.field6972.field9070) {
                            return;
                        }
                        var24 = (float) var14 * this.field6960 + (float) var11 * this.field6962 + (float) var50 * this.field6970 + this.field6968;
                        if (var24 <= (float) this.field6972.field9070) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field6960 + (float) var11 * this.field6962 + (float) var47 * this.field6970 + this.field6968;
                        var22 = (float) var13 * this.field6960 + (float) var12 * this.field6962 + (float) var48 * this.field6970 + this.field6968;
                        var23 = (float) var14 * this.field6960 + (float) var12 * this.field6962 + (float) var49 * this.field6970 + this.field6968;
                        var24 = (float) var14 * this.field6960 + (float) var11 * this.field6962 + (float) var50 * this.field6970 + this.field6968;
                    }
                    if (arg2) {
                        int var51 = (int) (var21 - (float) arg3.field888);
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var15 = var51;
                            int var52 = var10.field7073 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = (int) (var22 - (float) arg3.field888);
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var16 = var53;
                            int var54 = var10.field7075 * var53 / 255;
                            if (var54 > 0) {
                                var48 -= var54;
                            }
                        }
                        int var55 = (int) (var23 - (float) arg3.field888);
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field7068 * var55 / 255;
                            if (var56 > 0) {
                                var49 -= var56;
                            }
                        }
                        int var57 = (int) (var24 - (float) arg3.field888);
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var18 = var57;
                            int var58 = var10.field7072 * var57 / 255;
                            if (var58 > 0) {
                                var50 -= var58;
                            }
                        }
                    } else if (arg3.field886) {
                        int var59 = (int) (var21 - (float) arg3.field888);
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = (int) (var22 - (float) arg3.field888);
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = (int) (var23 - (float) arg3.field888);
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                        int var62 = (int) (var24 - (float) arg3.field888);
                        if (var62 > 0) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    if (this.field6955 == -1) {
                        var31 = (float) var13 * this.field6957 + (float) var11 * this.field6954 + (float) var47 * this.field6963 + this.field6974;
                        var32 = (int) ((float) this.field6972.field9082 * var31 / var21) + arg4.field9747;
                        var33 = (float) var13 * this.field6966 + (float) var11 * this.field6969 + (float) var47 * this.field6965 + this.field6964;
                        var34 = (int) ((float) this.field6972.field9083 * var33 / var21) + arg4.field9762;
                        var35 = (float) var13 * this.field6957 + (float) var12 * this.field6954 + (float) var48 * this.field6963 + this.field6974;
                        var36 = (int) ((float) this.field6972.field9082 * var35 / var22) + arg4.field9747;
                        var37 = (float) var13 * this.field6966 + (float) var12 * this.field6969 + (float) var48 * this.field6965 + this.field6964;
                        var38 = (int) ((float) this.field6972.field9083 * var37 / var22) + arg4.field9762;
                        var39 = (float) var14 * this.field6957 + (float) var12 * this.field6954 + (float) var49 * this.field6963 + this.field6974;
                        var40 = (int) ((float) this.field6972.field9082 * var39 / var23) + arg4.field9747;
                        var41 = (float) var14 * this.field6966 + (float) var12 * this.field6969 + (float) var49 * this.field6965 + this.field6964;
                        var42 = (int) ((float) this.field6972.field9083 * var41 / var23) + arg4.field9762;
                        var43 = (float) var14 * this.field6957 + (float) var11 * this.field6954 + (float) var50 * this.field6963 + this.field6974;
                        var44 = (int) ((float) this.field6972.field9082 * var43 / var24) + arg4.field9747;
                        var45 = (float) var14 * this.field6966 + (float) var11 * this.field6969 + (float) var50 * this.field6965 + this.field6964;
                        var46 = (int) ((float) this.field6972.field9083 * var45 / var24) + arg4.field9762;
                    } else {
                        var31 = (float) var13 * this.field6957 + (float) var11 * this.field6954 + (float) var47 * this.field6963 + this.field6974;
                        var32 = (int) ((float) this.field6972.field9082 * var31 / (float) this.field6955) + arg4.field9747;
                        var33 = (float) var13 * this.field6966 + (float) var11 * this.field6969 + (float) var47 * this.field6965 + this.field6964;
                        var34 = (int) ((float) this.field6972.field9083 * var33 / (float) this.field6955) + arg4.field9762;
                        var35 = (float) var13 * this.field6957 + (float) var12 * this.field6954 + (float) var48 * this.field6963 + this.field6974;
                        var36 = (int) ((float) this.field6972.field9082 * var35 / (float) this.field6955) + arg4.field9747;
                        var37 = (float) var13 * this.field6966 + (float) var12 * this.field6969 + (float) var48 * this.field6965 + this.field6964;
                        var38 = (int) ((float) this.field6972.field9083 * var37 / (float) this.field6955) + arg4.field9762;
                        var39 = (float) var14 * this.field6957 + (float) var12 * this.field6954 + (float) var49 * this.field6963 + this.field6974;
                        var40 = (int) ((float) this.field6972.field9082 * var39 / (float) this.field6955) + arg4.field9747;
                        var41 = (float) var14 * this.field6966 + (float) var12 * this.field6969 + (float) var49 * this.field6965 + this.field6964;
                        var42 = (int) ((float) this.field6972.field9083 * var41 / (float) this.field6955) + arg4.field9762;
                        var43 = (float) var14 * this.field6957 + (float) var11 * this.field6954 + (float) var50 * this.field6963 + this.field6974;
                        var44 = (int) ((float) this.field6972.field9082 * var43 / (float) this.field6955) + arg4.field9747;
                        var45 = (float) var14 * this.field6966 + (float) var11 * this.field6969 + (float) var50 * this.field6965 + this.field6964;
                        var46 = (int) ((float) this.field6972.field9083 * var45 / (float) this.field6955) + arg4.field9762;
                    }
                }
                boolean var63 = var10.field7067 != -1 && this.method2802(this.field6972.field1491.method955(-1330, var10.field7067).field6600);
                if (this.field6955 == -1) {
                    int var64 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field9752 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field9748 || var44 > arg4.field9748 || var36 > arg4.field9748;
                        if (var64 < 765) {
                            if (var63) {
                                arg4.field9750 = 100;
                            }
                            if (var64 > 0) {
                                if (var10.field7067 >= 0) {
                                    arg4.method3889(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field880, var17, var18, var16, var10.field7069, var10.field7074, var10.field7071, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field7067);
                                } else {
                                    arg4.method3872(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class201.method1306(var10.field7069, 3845, var17 << 24 | arg3.field880), class201.method1306(var10.field7074, 3845, var18 << 24 | arg3.field880), class201.method1306(var10.field7071, 3845, var16 << 24 | arg3.field880));
                                }
                            } else if (var10.field7067 >= 0) {
                                arg4.method3887(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field7069, var10.field7074, var10.field7071, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field7067);
                            } else {
                                arg4.method3872(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field7069, var10.field7074, var10.field7071);
                            }
                            arg4.field9750 = 0;
                        } else {
                            arg4.method3882(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field880);
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field9752 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field9748 || var36 > arg4.field9748 || var44 > arg4.field9748;
                        if (var65 < 765) {
                            if (var63) {
                                arg4.field9750 = 100;
                            }
                            if (var65 > 0) {
                                if (var10.field7067 >= 0) {
                                    arg4.method3889(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field880, var15, var16, var18, var10.field7066, var10.field7071, var10.field7074, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field7067);
                                } else {
                                    arg4.method3872(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class201.method1306(var10.field7066, 3845, var15 << 24 | arg3.field880), class201.method1306(var10.field7071, 3845, var16 << 24 | arg3.field880), class201.method1306(var10.field7074, 3845, var18 << 24 | arg3.field880));
                                }
                            } else if (var10.field7067 >= 0) {
                                arg4.method3887(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field7066, var10.field7071, var10.field7074, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field7067);
                            } else {
                                arg4.method3872(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field7066, var10.field7071, var10.field7074);
                            }
                            arg4.field9750 = 0;
                            return;
                        }
                        arg4.method3882(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field880);
                        return;
                    }
                } else {
                    int var66 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field9752 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field9748 || var44 > arg4.field9748 || var36 > arg4.field9748;
                        if (var66 < 765) {
                            if (var63) {
                                arg4.field9750 = 100;
                            }
                            if (var66 > 0) {
                                if (var10.field7067 >= 0) {
                                    arg4.method3889(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field880, var17, var18, var16, var10.field7069, var10.field7074, var10.field7071, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field6955, this.field6955, this.field6955, var10.field7067);
                                } else {
                                    arg4.method3872(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class201.method1306(var10.field7069, 3845, var17 << 24 | arg3.field880), class201.method1306(var10.field7074, 3845, var18 << 24 | arg3.field880), class201.method1306(var10.field7071, 3845, var16 << 24 | arg3.field880));
                                }
                            } else if (var10.field7067 >= 0) {
                                arg4.method3887(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field7069, var10.field7074, var10.field7071, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field6955, this.field6955, this.field6955, var10.field7067);
                            } else {
                                arg4.method3872(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field7069, var10.field7074, var10.field7071);
                            }
                            arg4.field9750 = 0;
                        } else {
                            arg4.method3882(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field880);
                        }
                    }
                    int var67 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field9752 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field9748 || var36 > arg4.field9748 || var44 > arg4.field9748;
                        if (var67 < 765) {
                            if (var63) {
                                arg4.field9750 = 100;
                            }
                            if (var67 > 0) {
                                if (var10.field7067 >= 0) {
                                    arg4.method3889(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field880, var15, var16, var18, var10.field7066, var10.field7071, var10.field7074, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field6955, this.field6955, this.field6955, var10.field7067);
                                } else {
                                    arg4.method3872(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class201.method1306(var10.field7066, 3845, var15 << 24 | arg3.field880), class201.method1306(var10.field7071, 3845, var16 << 24 | arg3.field880), class201.method1306(var10.field7074, 3845, var18 << 24 | arg3.field880));
                                }
                            } else if (var10.field7067 >= 0) {
                                arg4.method3887(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field7066, var10.field7071, var10.field7074, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field6955, this.field6955, this.field6955, var10.field7067);
                            } else {
                                arg4.method3872(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field7066, var10.field7071, var10.field7074);
                            }
                            arg4.field9750 = 0;
                            return;
                        }
                        arg4.method3882(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field880);
                    }
                }
            }
        } else {
            class648 var68 = this.field6956[arg0][arg1];
            if (var68 != null) {
                if (this.field6955 == -1) {
                    for (int var69 = 0; var69 < var68.field9313; ++var69) {
                        int var70 = (arg0 << super.field9623) + var68.field9319[var69];
                        int var71 = var68.field9312[var69];
                        int var72 = (arg1 << super.field9623) + var68.field9316[var69];
                        float var73 = (float) var72 * this.field6960 + (float) var70 * this.field6962 + (float) var71 * this.field6970 + this.field6968;
                        if (var73 <= (float) this.field6972.field9070) {
                            return;
                        }
                        arg8[var69] = 0;
                        if (arg2) {
                            int var74 = (int) (var73 - (float) arg3.field888);
                            if (var74 > 255) {
                                var74 = 255;
                            }
                            if (var74 > 0) {
                                arg8[var69] = var74;
                                int var75 = var68.field9314[var69] * var74 / 255;
                                if (var75 > 0) {
                                    var71 -= var75;
                                }
                            }
                        } else if (arg3.field886) {
                            int var76 = (int) (var73 - (float) arg3.field888);
                            if (var76 > 0) {
                                arg8[var69] = var76;
                                if (arg8[var69] > 255) {
                                    arg8[var69] = 255;
                                }
                            }
                        }
                        float var77 = (float) var72 * this.field6957 + (float) var70 * this.field6954 + (float) var71 * this.field6963 + this.field6974;
                        float var78 = (float) var72 * this.field6966 + (float) var70 * this.field6969 + (float) var71 * this.field6965 + this.field6964;
                        arg5[var69] = (int) ((float) this.field6972.field9082 * var77 / var73) + arg4.field9747;
                        arg6[var69] = (int) ((float) this.field6972.field9083 * var78 / var73) + arg4.field9762;
                        arg7[var69] = (int) var73;
                    }
                } else {
                    for (int var79 = 0; var79 < var68.field9313; ++var79) {
                        int var131 = (arg0 << super.field9623) + var68.field9319[var79];
                        int var132 = var68.field9312[var79];
                        int var133 = (arg1 << super.field9623) + var68.field9316[var79];
                        float var134 = (float) var133 * this.field6960 + (float) var131 * this.field6962 + (float) var132 * this.field6970 + this.field6968;
                        arg8[var79] = 0;
                        if (arg2) {
                            int var135 = this.field6955 - arg3.field888;
                            if (var135 > 255) {
                                var135 = 255;
                            }
                            if (var135 > 0) {
                                arg8[var79] = var135;
                                int var136 = var68.field9314[var79] * var135 / 255;
                                if (var136 > 0) {
                                    var132 -= var136;
                                }
                            }
                        } else if (arg3.field886) {
                            int var137 = this.field6955 - arg3.field888;
                            if (var137 > 0) {
                                arg8[var79] = var137;
                                if (arg8[var79] > 255) {
                                    arg8[var79] = 255;
                                }
                            }
                        }
                        float var138 = (float) var133 * this.field6957 + (float) var131 * this.field6954 + (float) var132 * this.field6963 + this.field6974;
                        float var139 = (float) var133 * this.field6966 + (float) var131 * this.field6969 + (float) var132 * this.field6965 + this.field6964;
                        arg5[var79] = (int) ((float) this.field6972.field9082 * var138 / (float) this.field6955) + arg4.field9747;
                        arg6[var79] = (int) ((float) this.field6972.field9083 * var139 / (float) this.field6955) + arg4.field9762;
                        arg7[var79] = (int) var134;
                    }
                }
                if (var68.field9310 != null) {
                    int var80 = super.field9624[arg0][arg1];
                    int var81 = super.field9624[arg0 + 1][arg1];
                    int var82 = super.field9624[arg0][arg1 + 1];
                    int var83 = super.field9629 * arg0;
                    int var84 = super.field9629 + var83;
                    int var85 = super.field9629 * arg1;
                    int var86 = super.field9629 + var85;
                    float var87 = (float) var85 * this.field6957 + (float) var80 * this.field6963 + (float) var83 * this.field6954 + this.field6974;
                    float var88 = (float) var85 * this.field6966 + (float) var80 * this.field6965 + (float) var83 * this.field6969 + this.field6964;
                    float var89 = (float) var85 * this.field6960 + (float) var80 * this.field6970 + (float) var83 * this.field6962 + this.field6968;
                    float var90 = (float) var85 * this.field6957 + (float) var81 * this.field6963 + (float) var84 * this.field6954 + this.field6974;
                    float var91 = (float) var85 * this.field6966 + (float) var81 * this.field6965 + (float) var84 * this.field6969 + this.field6964;
                    float var92 = (float) var85 * this.field6960 + (float) var81 * this.field6970 + (float) var84 * this.field6962 + this.field6968;
                    float var93 = (float) var86 * this.field6957 + (float) var82 * this.field6963 + (float) var83 * this.field6954 + this.field6974;
                    float var94 = (float) var86 * this.field6966 + (float) var82 * this.field6965 + (float) var83 * this.field6969 + this.field6964;
                    float var95 = (float) var86 * this.field6960 + (float) var82 * this.field6970 + (float) var83 * this.field6962 + this.field6968;
                    if (this.field6955 == -1) {
                        for (int var96 = 0; var96 < var68.field9315; ++var96) {
                            int var97 = var96 * 3;
                            int var98 = var97 + 1;
                            int var99 = var98 + 1;
                            int var100 = arg5[var97];
                            int var101 = arg5[var98];
                            int var102 = arg5[var99];
                            int var103 = arg6[var97];
                            int var104 = arg6[var98];
                            int var105 = arg6[var99];
                            int var106 = arg8[var97] + arg8[var98] + arg8[var99];
                            if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                                arg4.field9752 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg4.field9748 || var101 > arg4.field9748 || var102 > arg4.field9748;
                                short var107 = var68.field9310[var96];
                                if (var106 < 765) {
                                    if (var107 != -1 && this.method2802(this.field6972.field1491.method955(-1330, var107).field6600)) {
                                        arg4.field9750 = 100;
                                    }
                                    if (var106 > 0) {
                                        if (var107 != -1) {
                                            arg4.method3889(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field880, arg8[var97], arg8[var98], arg8[var99], var68.field9311[var97], var68.field9311[var98], var68.field9311[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                        } else if ((var68.field9311[var97] & 16777215) != 0) {
                                            arg4.method3872(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], class201.method1306(var68.field9311[var97], 3845, arg8[var97] << 24 | arg3.field880), class201.method1306(var68.field9311[var98], 3845, arg8[var98] << 24 | arg3.field880), class201.method1306(var68.field9311[var99], 3845, arg8[var99] << 24 | arg3.field880));
                                        }
                                    } else if (var107 != -1) {
                                        arg4.method3887(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field9311[var97], var68.field9311[var98], var68.field9311[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                    } else if ((var68.field9311[var97] & 16777215) != 0) {
                                        arg4.method3872(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field9311[var97], var68.field9311[var98], var68.field9311[var99]);
                                    }
                                    arg4.field9750 = 0;
                                } else {
                                    arg4.method3882(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field880);
                                }
                            }
                        }
                        return;
                    }
                    for (int var108 = 0; var108 < var68.field9315; ++var108) {
                        int var109 = var108 * 3;
                        int var110 = var109 + 1;
                        int var111 = var110 + 1;
                        int var112 = arg5[var109];
                        int var113 = arg5[var110];
                        int var114 = arg5[var111];
                        int var115 = arg6[var109];
                        int var116 = arg6[var110];
                        int var117 = arg6[var111];
                        int var118 = arg8[var109] + arg8[var110] + arg8[var111];
                        if ((var112 - var113) * (var117 - var116) - (var114 - var113) * (var115 - var116) > 0) {
                            arg4.field9752 = var112 < 0 || var113 < 0 || var114 < 0 || var112 > arg4.field9748 || var113 > arg4.field9748 || var114 > arg4.field9748;
                            short var119 = var68.field9310[var108];
                            if (var118 < 765) {
                                if (var119 != -1 && this.method2802(this.field6972.field1491.method955(-1330, var119).field6600)) {
                                    arg4.field9750 = 100;
                                }
                                if (var118 > 0) {
                                    if (var119 != -1) {
                                        arg4.method3889(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field880, arg8[var109], arg8[var110], arg8[var111], var68.field9311[var109], var68.field9311[var110], var68.field9311[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field6955, this.field6955, this.field6955, var119);
                                    } else if ((var68.field9311[var109] & 16777215) != 0) {
                                        arg4.method3872(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], class201.method1306(var68.field9311[var109], 3845, arg8[var109] << 24 | arg3.field880), class201.method1306(var68.field9311[var110], 3845, arg8[var110] << 24 | arg3.field880), class201.method1306(var68.field9311[var111], 3845, arg8[var111] << 24 | arg3.field880));
                                    }
                                } else if (var119 != -1) {
                                    arg4.method3887(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field9311[var109], var68.field9311[var110], var68.field9311[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field6955, this.field6955, this.field6955, var119);
                                } else if ((var68.field9311[var109] & 16777215) != 0) {
                                    arg4.method3872(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field9311[var109], var68.field9311[var110], var68.field9311[var111]);
                                }
                                arg4.field9750 = 0;
                            } else {
                                arg4.method3882(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field880);
                            }
                        }
                    }
                    return;
                }
                for (int var120 = 0; var120 < var68.field9315; ++var120) {
                    int var121 = var120 * 3;
                    int var122 = var121 + 1;
                    int var123 = var122 + 1;
                    int var124 = arg5[var121];
                    int var125 = arg5[var122];
                    int var126 = arg5[var123];
                    int var127 = arg6[var121];
                    int var128 = arg6[var122];
                    int var129 = arg6[var123];
                    int var130 = arg8[var121] + arg8[var122] + arg8[var123];
                    if ((var124 - var125) * (var129 - var128) - (var126 - var125) * (var127 - var128) > 0) {
                        arg4.field9752 = var124 < 0 || var125 < 0 || var126 < 0 || var124 > arg4.field9748 || var125 > arg4.field9748 || var126 > arg4.field9748;
                        if (var130 < 765) {
                            if (var130 > 0) {
                                if ((var68.field9311[var121] & 16777215) != 0) {
                                    arg4.method3872(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], class218.method1375(arg8[var121], var68.field9311[var121], arg3.field880, -85), class218.method1375(arg8[var122], var68.field9311[var122], arg3.field880, 30), class218.method1375(arg8[var123], var68.field9311[var123], arg3.field880, -97));
                                }
                            } else if ((var68.field9311[var121] & 16777215) != 0) {
                                arg4.method3872(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], var68.field9311[var121], var68.field9311[var122], var68.field9311[var123]);
                            }
                        } else {
                            arg4.method3882(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], arg3.field880);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[[ZZI)V")
    public final void method2168(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class121 var7 = this.field6972.field9078;
        this.field6955 = arg5;
        this.field6954 = var7.field1792;
        this.field6963 = var7.field1801;
        this.field6957 = var7.field1794;
        this.field6974 = var7.field1803;
        this.field6969 = var7.field1787;
        this.field6965 = var7.field1804;
        this.field6966 = var7.field1800;
        this.field6964 = var7.field1784;
        this.field6962 = var7.field1788;
        this.field6970 = var7.field1793;
        this.field6960 = var7.field1806;
        this.field6968 = var7.field1799;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field9628 && var11 >= 0 && var11 < super.field9630) {
                        this.method2182(var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lst;IIII[[I[[II)V")
    public class490(class626 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field6972 = arg0;
        this.field6961 = arg2;
        this.field6958 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field6972.field9067 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field6972.field9089 * var18 + this.field6972.field9086 * var16 + this.field6972.field9079 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field6958[var11][var10] = (byte) var20;
            }
        }
        this.field6973 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIII[[ZLqb;Lwh;[I[I)V")
    private final void method2804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class56 arg8, class691 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field882;
        this.field6972.method636(false);
        arg9.field9754 = false;
        arg9.field9759 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field6967[var18][var19] != null) {
                        class499 var20 = this.field6967[var18][var19];
                        if (var20.field7067 != -1 && (var20.field7070 & 2) == 0 && var20.field7076 == 0) {
                            int var21 = this.field6972.method3597(var20.field7067);
                            arg9.method3883(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class36.method216(127, var20.field7069, var21), class36.method216(127, var20.field7074, var21), class36.method216(127, var20.field7071, var21));
                            arg9.method3883(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class36.method216(127, var20.field7066, var21), class36.method216(127, var20.field7071, var21), class36.method216(127, var20.field7074, var21));
                        } else if (var20.field7076 == 0) {
                            arg9.method3872(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field7069, var20.field7074, var20.field7071);
                            arg9.method3872(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field7066, var20.field7071, var20.field7074);
                        } else {
                            int var22 = var20.field7076;
                            arg9.method3872(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class201.method1306(var22, 3845, var20.field7069 & -16777216), class201.method1306(var22, 3845, var20.field7074 & -16777216), class201.method1306(var22, 3845, var20.field7071 & -16777216));
                            arg9.method3872(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class201.method1306(var22, 3845, var20.field7066 & -16777216), class201.method1306(var22, 3845, var20.field7071 & -16777216), class201.method1306(var22, 3845, var20.field7074 & -16777216));
                        }
                    } else if (this.field6956[var18][var19] != null) {
                        class648 var23 = this.field6956[var18][var19];
                        for (int var24 = 0; var24 < var23.field9313; ++var24) {
                            arg10[var24] = var23.field9319[var24] * var14 / super.field9629 + var16;
                            arg11[var24] = var17 - var23.field9316[var24] * var14 / super.field9629;
                        }
                        for (int var25 = 0; var25 < var23.field9315; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field9318 == null || var23.field9318[var25] == 0 || var23.field9310 != null && (var23.field9310 == null || var23.field9310[var25] != -1)) {
                                if (var23.field9310 != null && var23.field9310[var25] != -1) {
                                    int var36 = this.field6972.method3597(var23.field9310[var25]);
                                    arg9.method3883(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                                } else {
                                    arg9.method3872(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field9311[var26], var23.field9311[var27], var23.field9311[var28]);
                                }
                            } else {
                                int var35 = var23.field9318[var25];
                                arg9.method3872(var32, var33, var34, var29, var30, var31, 100, 100, 100, class201.method1306(var35, 3845, -16777216 - (var23.field9311[var26] & -16777216)), class201.method1306(var35, 3845, -16777216 - (var23.field9311[var27] & -16777216)), class201.method1306(var35, 3845, -16777216 - (var23.field9311[var28] & -16777216)));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field9754 = true;
        this.field6972.method636(var15);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(III)V")
    public final void method2183(int arg0, int arg1, int arg2) {
        if (this.field6973[arg0][arg1] < arg2) {
            this.field6973[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method2170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class56 var9 = this.field6972.method3609(Thread.currentThread());
        class691 var10 = var9.field923;
        var10.field9750 = 0;
        var10.field9752 = false;
        this.field6972.method638();
        if (this.field6967 != null) {
            this.method2804(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field913, var9.field914);
        } else {
            if (this.field6971 != null) {
                this.method2805(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field913, var9.field914);
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ltg;[I)V")
    public final void method2185(class334 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)V")
    public final void method2182(int arg0, int arg1) {
        class56 var3 = this.field6972.method3609(Thread.currentThread());
        var3.field923.field9750 = 0;
        if (this.field6967 != null) {
            this.method2803(arg0, arg1, var3.field872, var3, var3.field923, var3.field913, var3.field914, var3.field908, var3.field901);
        } else {
            if (this.field6971 != null) {
                this.method2800(arg0, arg1, var3.field923, var3.field913, var3.field914, var3.field908, var3.field901);
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "(IILha;)Lha;")
    public final class425 method2171(int arg0, int arg1, class425 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method2167(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field6971 == null) {
            this.field6971 = new class225[super.field9628][super.field9630];
            this.field6959 = new class349[super.field9628][super.field9630];
        } else if (this.field6967 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field9629 != var20 || var21 != 0 && super.field9629 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class349 var22 = new class349();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field5164 = var23;
            var22.field5171 = new short[var23];
            var22.field5163 = new short[var23];
            var22.field5173 = new short[var23];
            var22.field5168 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field5171[var25] = (short) (this.field6958[arg0][arg1] - this.field6973[arg0][arg1]);
                } else if (var30 == 0 && super.field9629 == var31) {
                    var22.field5171[var25] = (short) (this.field6958[arg0][arg1 + 1] - this.field6973[arg0][arg1 + 1]);
                } else if (super.field9629 == var30 && super.field9629 == var31) {
                    var22.field5171[var25] = (short) (this.field6958[arg0 + 1][arg1 + 1] - this.field6973[arg0 + 1][arg1 + 1]);
                } else if (super.field9629 == var30 && var31 == 0) {
                    var22.field5171[var25] = (short) (this.field6958[arg0 + 1][arg1] - this.field6973[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field6958[arg0 + 1][arg1] - this.field6973[arg0 + 1][arg1]) * var30 + (this.field6958[arg0][arg1] - this.field6973[arg0][arg1]) * (super.field9629 - var30);
                    int var33 = (this.field6958[arg0 + 1][arg1 + 1] - this.field6973[arg0 + 1][arg1 + 1]) * var30 + (this.field6958[arg0][arg1 + 1] - this.field6973[arg0][arg1 + 1]) * (super.field9629 - var30);
                    var22.field5171[var25] = (short) ((super.field9629 - var31) * var32 + var31 * var33 >> super.field9623 * 2);
                }
                int var34 = (arg0 << super.field9623) + var30;
                int var35 = (arg1 << super.field9623) + var31;
                var22.field5163[var25] = (short) var30;
                var22.field5168[var25] = (short) var31;
                var22.field5173[var25] = (short) (this.method3824(var34, 118, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field5171[var25] < 2) {
                    var22.field5171[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field6972.field1491.method955(-1330, arg11[var28]).field6612) {
                    var26 = true;
                }
            }
            var22.field5161 = new int[var27];
            if (arg10 != null) {
                var22.field5167 = new int[var27];
            }
            var22.field5170 = new short[var27];
            var22.field5165 = new short[var27];
            var22.field5162 = new short[var27];
            if (var26) {
                var22.field5169 = new short[var27];
                var22.field5172 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field5161[var22.field5166] = class399.method2479(arg9[var29], false);
                    } else {
                        var22.field5161[var22.field5166] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field5167[var22.field5166] = class399.method2479(arg10[var29], false);
                        } else {
                            var22.field5167[var22.field5166] = -1;
                        }
                    }
                    var22.field5170[var22.field5166] = (short) arg6[var29];
                    var22.field5165[var22.field5166] = (short) arg7[var29];
                    var22.field5162[var22.field5166] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field6972.field1491.method955(-1330, arg11[var29]).field6612) {
                            var22.field5169[var22.field5166] = (short) arg11[var29];
                            var22.field5172[var22.field5166] = (short) arg12[var29];
                        } else {
                            var22.field5169[var22.field5166] = -1;
                        }
                    }
                    ++var22.field5166;
                }
            }
            this.field6959[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class225 var36 = new class225();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field2976 = class36.method216(127, this.field6958[arg0][arg1] - this.field6973[arg0][arg1], class399.method2479(arg10[0], false));
                    if (var37 == -1) {
                        var36.field2981 = (byte) (var36.field2981 | 2);
                    }
                }
                if (super.field9624[arg0 + 1][arg1] == super.field9624[arg0][arg1] && super.field9624[arg0 + 1][arg1 + 1] == super.field9624[arg0][arg1] && super.field9624[arg0][arg1 + 1] == super.field9624[arg0][arg1]) {
                    var36.field2981 = (byte) (var36.field2981 | 1);
                }
                if (var38 != -1 && (var36.field2981 & 2) == 0 && !this.field6972.field1491.method955(-1330, var38).field6612) {
                    var36.field2982 = (short) (this.field6958[arg0][arg1] - this.field6973[arg0][arg1]);
                    var36.field2978 = (short) (this.field6958[arg0 + 1][arg1] - this.field6973[arg0 + 1][arg1]);
                    var36.field2977 = (short) (this.field6958[arg0 + 1][arg1 + 1] - this.field6973[arg0 + 1][arg1 + 1]);
                    var36.field2979 = (short) (this.field6958[arg0][arg1 + 1] - this.field6973[arg0][arg1 + 1]);
                    var36.field2980 = (short) var38;
                } else {
                    short var39 = class399.method2479(var37, false);
                    var36.field2982 = (short) class36.method216(127, this.field6958[arg0][arg1] - this.field6973[arg0][arg1], var39);
                    var36.field2978 = (short) class36.method216(127, this.field6958[arg0 + 1][arg1] - this.field6973[arg0 + 1][arg1], var39);
                    var36.field2977 = (short) class36.method216(127, this.field6958[arg0 + 1][arg1 + 1] - this.field6973[arg0 + 1][arg1 + 1], var39);
                    var36.field2979 = (short) class36.method216(127, this.field6958[arg0][arg1 + 1] - this.field6973[arg0][arg1 + 1], var39);
                    var36.field2980 = -1;
                }
                this.field6971[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method2176(class425 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(IIIIIII[[ZLqb;Lwh;[I[I)V")
    private final void method2805(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class56 arg8, class691 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field882;
        this.field6972.method636(false);
        arg9.field9754 = false;
        arg9.field9759 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field6971[var18][var19] != null) {
                        class225 var20 = this.field6971[var18][var19];
                        if (var20.field2980 != -1 && (var20.field2981 & 2) == 0 && var20.field2976 == -1) {
                            int var21 = this.field6972.method3597(var20.field2980);
                            arg9.method3883(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class36.method216(127, var20.field2977 & 65535, var21), class36.method216(127, var20.field2979 & 65535, var21), class36.method216(127, var20.field2978 & 65535, var21));
                            arg9.method3883(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class36.method216(127, var20.field2982 & 65535, var21), class36.method216(127, var20.field2978 & 65535, var21), class36.method216(127, var20.field2979 & 65535, var21));
                        } else if (var20.field2976 == -1) {
                            arg9.method3883(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field2977 & 65535, var20.field2979 & 65535, var20.field2978 & 65535);
                            arg9.method3883(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field2982 & 65535, var20.field2978 & 65535, var20.field2979 & 65535);
                        } else {
                            int var22 = var20.field2976;
                            arg9.method3883(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var22, var22, var22);
                            arg9.method3883(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (this.field6959[var18][var19] != null) {
                        class349 var23 = this.field6959[var18][var19];
                        for (int var24 = 0; var24 < var23.field5164; ++var24) {
                            arg10[var24] = var23.field5163[var24] * var14 / super.field9629 + var16;
                            arg11[var24] = var17 - var23.field5168[var24] * var14 / super.field9629;
                        }
                        for (int var25 = 0; var25 < var23.field5166; ++var25) {
                            short var26 = var23.field5170[var25];
                            short var27 = var23.field5165[var25];
                            short var28 = var23.field5162[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field5167 != null && var23.field5167[var25] != -1) {
                                int var35 = var23.field5167[var25];
                                arg9.method3883(var32, var33, var34, var29, var30, var31, 100, 100, 100, class36.method216(127, var23.field5171[var26], var35), class36.method216(127, var23.field5171[var27], var35), class36.method216(127, var23.field5171[var28], var35));
                            } else if (var23.field5169 != null && var23.field5169[var25] != -1) {
                                int var36 = this.field6972.method3597(var23.field5169[var25]);
                                arg9.method3883(var32, var33, var34, var29, var30, var31, 100, 100, 100, class36.method216(127, var23.field5171[var26], var36), class36.method216(127, var23.field5171[var27], var36), class36.method216(127, var23.field5171[var28], var36));
                            } else {
                                int var37 = var23.field5161[var25];
                                arg9.method3883(var32, var33, var34, var29, var30, var31, 100, 100, 100, class36.method216(127, var23.field5171[var26], var37), class36.method216(127, var23.field5171[var27], var37), class36.method216(127, var23.field5171[var28], var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field9754 = true;
        this.field6972.method636(var15);
    }
}
