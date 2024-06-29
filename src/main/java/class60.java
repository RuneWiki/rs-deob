import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class60 extends class37 {

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    private int field777 = -1;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "Lwk;")
    private class128 field784;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    private int field771;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "[[B")
    private byte[][] field782;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[[B")
    private byte[][] field779;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "F")
    private float field765;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "F")
    private float field768;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "F")
    private float field769;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "F")
    private float field770;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "F")
    private float field772;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "F")
    private float field773;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "F")
    private float field775;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "F")
    private float field776;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "F")
    private float field780;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "F")
    private float field781;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "F")
    private float field783;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "F")
    private float field785;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "[[Lfp;")
    private class297[][] field767;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[[Lpga;")
    private class495[][] field774;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[[Lrj;")
    private class552[][] field766;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "[[Ldq;")
    private class648[][] field778;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lha;IIIIZ)Z", line = 3)
    public final boolean method481(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILwi;[I[I[I[I)V", line = 11)
    private final void method672(int arg0, int arg1, class431 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        class648 var8 = this.field778[arg0][arg1];
        if (var8 != null) {
            if ((var8.field9096 & 2) == 0) {
                int var9 = super.field516 * arg0;
                int var10 = super.field516 + var9;
                int var11 = super.field516 * arg1;
                int var12 = super.field516 + var11;
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
                if ((var8.field9096 & 1) != 0) {
                    int var13 = super.field519[arg0][arg1];
                    float var14 = (float) var13 * this.field783;
                    if (this.field777 == -1) {
                        var15 = (float) var11 * this.field781 + (float) var9 * this.field776 + var14 + this.field785;
                        if (var15 <= (float) this.field784.field2084) {
                            return;
                        }
                        var16 = (float) var11 * this.field781 + (float) var10 * this.field776 + var14 + this.field785;
                        if (var16 <= (float) this.field784.field2084) {
                            return;
                        }
                        var17 = (float) var12 * this.field781 + (float) var10 * this.field776 + var14 + this.field785;
                        if (var17 <= (float) this.field784.field2084) {
                            return;
                        }
                        var18 = (float) var12 * this.field781 + (float) var9 * this.field776 + var14 + this.field785;
                        if (var18 <= (float) this.field784.field2084) {
                            return;
                        }
                    } else {
                        var15 = (float) var11 * this.field781 + (float) var9 * this.field776 + var14 + this.field785;
                        var16 = (float) var11 * this.field781 + (float) var10 * this.field776 + var14 + this.field785;
                        var17 = (float) var12 * this.field781 + (float) var10 * this.field776 + var14 + this.field785;
                        var18 = (float) var12 * this.field781 + (float) var9 * this.field776 + var14 + this.field785;
                    }
                    float var19 = (float) var13 * this.field769;
                    float var20 = (float) var13 * this.field765;
                    if (this.field777 == -1) {
                        var21 = (float) var11 * this.field780 + (float) var9 * this.field772 + var19 + this.field770;
                        var22 = (int) ((float) this.field784.field2086 * var21 / var15) + arg2.field6557;
                        var23 = (float) var11 * this.field775 + (float) var9 * this.field773 + var20 + this.field768;
                        var24 = (int) ((float) this.field784.field2083 * var23 / var15) + arg2.field6563;
                        var25 = (float) var11 * this.field780 + (float) var10 * this.field772 + var19 + this.field770;
                        var26 = (int) ((float) this.field784.field2086 * var25 / var16) + arg2.field6557;
                        var27 = (float) var11 * this.field775 + (float) var10 * this.field773 + var20 + this.field768;
                        var28 = (int) ((float) this.field784.field2083 * var27 / var16) + arg2.field6563;
                        float var29 = (float) var12 * this.field780 + (float) var10 * this.field772 + var19 + this.field770;
                        var30 = (int) ((float) this.field784.field2086 * var29 / var17) + arg2.field6557;
                        float var31 = (float) var12 * this.field775 + (float) var10 * this.field773 + var20 + this.field768;
                        var32 = (int) ((float) this.field784.field2083 * var31 / var17) + arg2.field6563;
                        var33 = (float) var12 * this.field780 + (float) var9 * this.field772 + var19 + this.field770;
                        var34 = (int) ((float) this.field784.field2086 * var33 / var18) + arg2.field6557;
                        var35 = (float) var12 * this.field775 + (float) var9 * this.field773 + var20 + this.field768;
                        var36 = (int) ((float) this.field784.field2083 * var35 / var18) + arg2.field6563;
                    } else {
                        var21 = (float) var11 * this.field780 + (float) var9 * this.field772 + var19 + this.field770;
                        var22 = (int) ((float) this.field784.field2086 * var21 / (float) this.field777) + arg2.field6557;
                        var23 = (float) var11 * this.field775 + (float) var9 * this.field773 + var20 + this.field768;
                        var24 = (int) ((float) this.field784.field2083 * var23 / (float) this.field777) + arg2.field6563;
                        var25 = (float) var11 * this.field780 + (float) var10 * this.field772 + var19 + this.field770;
                        var26 = (int) ((float) this.field784.field2086 * var25 / (float) this.field777) + arg2.field6557;
                        var27 = (float) var11 * this.field775 + (float) var10 * this.field773 + var20 + this.field768;
                        var28 = (int) ((float) this.field784.field2083 * var27 / (float) this.field777) + arg2.field6563;
                        float var37 = (float) var12 * this.field780 + (float) var10 * this.field772 + var19 + this.field770;
                        var30 = (int) ((float) this.field784.field2086 * var37 / (float) this.field777) + arg2.field6557;
                        float var38 = (float) var12 * this.field775 + (float) var10 * this.field773 + var20 + this.field768;
                        var32 = (int) ((float) this.field784.field2083 * var38 / (float) this.field777) + arg2.field6563;
                        var33 = (float) var12 * this.field780 + (float) var9 * this.field772 + var19 + this.field770;
                        var34 = (int) ((float) this.field784.field2086 * var33 / (float) this.field777) + arg2.field6557;
                        var35 = (float) var12 * this.field775 + (float) var9 * this.field773 + var20 + this.field768;
                        var36 = (int) ((float) this.field784.field2083 * var35 / (float) this.field777) + arg2.field6563;
                    }
                } else {
                    int var39 = super.field519[arg0][arg1];
                    int var40 = super.field519[arg0 + 1][arg1];
                    int var41 = super.field519[arg0 + 1][arg1 + 1];
                    int var42 = super.field519[arg0][arg1 + 1];
                    if (this.field777 == -1) {
                        var15 = (float) var11 * this.field781 + (float) var9 * this.field776 + (float) var39 * this.field783 + this.field785;
                        if (var15 <= (float) this.field784.field2084) {
                            return;
                        }
                        var16 = (float) var11 * this.field781 + (float) var10 * this.field776 + (float) var40 * this.field783 + this.field785;
                        if (var16 <= (float) this.field784.field2084) {
                            return;
                        }
                        var17 = (float) var12 * this.field781 + (float) var10 * this.field776 + (float) var41 * this.field783 + this.field785;
                        if (var17 <= (float) this.field784.field2084) {
                            return;
                        }
                        var18 = (float) var12 * this.field781 + (float) var9 * this.field776 + (float) var42 * this.field783 + this.field785;
                        if (var18 <= (float) this.field784.field2084) {
                            return;
                        }
                        var21 = (float) var11 * this.field780 + (float) var9 * this.field772 + (float) var39 * this.field769 + this.field770;
                        var22 = (int) ((float) this.field784.field2086 * var21 / var15) + arg2.field6557;
                        var23 = (float) var11 * this.field775 + (float) var9 * this.field773 + (float) var39 * this.field765 + this.field768;
                        var24 = (int) ((float) this.field784.field2083 * var23 / var15) + arg2.field6563;
                        var25 = (float) var11 * this.field780 + (float) var10 * this.field772 + (float) var40 * this.field769 + this.field770;
                        var26 = (int) ((float) this.field784.field2086 * var25 / var16) + arg2.field6557;
                        var27 = (float) var11 * this.field775 + (float) var10 * this.field773 + (float) var40 * this.field765 + this.field768;
                        var28 = (int) ((float) this.field784.field2083 * var27 / var16) + arg2.field6563;
                        float var43 = (float) var12 * this.field780 + (float) var10 * this.field772 + (float) var41 * this.field769 + this.field770;
                        var30 = (int) ((float) this.field784.field2086 * var43 / var17) + arg2.field6557;
                        float var44 = (float) var12 * this.field775 + (float) var10 * this.field773 + (float) var41 * this.field765 + this.field768;
                        var32 = (int) ((float) this.field784.field2083 * var44 / var17) + arg2.field6563;
                        var33 = (float) var12 * this.field780 + (float) var9 * this.field772 + (float) var42 * this.field769 + this.field770;
                        var34 = (int) ((float) this.field784.field2086 * var33 / var18) + arg2.field6557;
                        var35 = (float) var12 * this.field775 + (float) var9 * this.field773 + (float) var42 * this.field765 + this.field768;
                        var36 = (int) ((float) this.field784.field2083 * var35 / var18) + arg2.field6563;
                    } else {
                        var15 = (float) var11 * this.field781 + (float) var9 * this.field776 + (float) var39 * this.field783 + this.field785;
                        var16 = (float) var11 * this.field781 + (float) var10 * this.field776 + (float) var40 * this.field783 + this.field785;
                        var17 = (float) var12 * this.field781 + (float) var10 * this.field776 + (float) var41 * this.field783 + this.field785;
                        var18 = (float) var12 * this.field781 + (float) var9 * this.field776 + (float) var42 * this.field783 + this.field785;
                        var21 = (float) var11 * this.field780 + (float) var9 * this.field772 + (float) var39 * this.field769 + this.field770;
                        var22 = (int) ((float) this.field784.field2086 * var21 / (float) this.field777) + arg2.field6557;
                        var23 = (float) var11 * this.field775 + (float) var9 * this.field773 + (float) var39 * this.field765 + this.field768;
                        var24 = (int) ((float) this.field784.field2083 * var23 / (float) this.field777) + arg2.field6563;
                        var25 = (float) var11 * this.field780 + (float) var10 * this.field772 + (float) var40 * this.field769 + this.field770;
                        var26 = (int) ((float) this.field784.field2086 * var25 / (float) this.field777) + arg2.field6557;
                        var27 = (float) var11 * this.field775 + (float) var10 * this.field773 + (float) var40 * this.field765 + this.field768;
                        var28 = (int) ((float) this.field784.field2083 * var27 / (float) this.field777) + arg2.field6563;
                        float var45 = (float) var12 * this.field780 + (float) var10 * this.field772 + (float) var41 * this.field769 + this.field770;
                        var30 = (int) ((float) this.field784.field2086 * var45 / (float) this.field777) + arg2.field6557;
                        float var46 = (float) var12 * this.field775 + (float) var10 * this.field773 + (float) var41 * this.field765 + this.field768;
                        var32 = (int) ((float) this.field784.field2083 * var46 / (float) this.field777) + arg2.field6563;
                        var33 = (float) var12 * this.field780 + (float) var9 * this.field772 + (float) var42 * this.field769 + this.field770;
                        var34 = (int) ((float) this.field784.field2086 * var33 / (float) this.field777) + arg2.field6557;
                        var35 = (float) var12 * this.field775 + (float) var9 * this.field773 + (float) var42 * this.field765 + this.field768;
                        var36 = (int) ((float) this.field784.field2083 * var35 / (float) this.field777) + arg2.field6563;
                    }
                }
                if (this.field777 == -1) {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field6556 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field6566 || var34 > arg2.field6566 || var26 > arg2.field6566;
                        if (var8.field9095 >= 0) {
                            if (this.method676(this.field784.field2812.method1610(18904, var8.field9095).field4134)) {
                                arg2.field6568 = 100;
                            }
                            arg2.method2736(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field9090 & 65535, var8.field9093 & 65535, var8.field9094 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field9095);
                            arg2.field6568 = 0;
                        } else {
                            arg2.method2729(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field9090 & 65535, var8.field9093 & 65535, var8.field9094 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field6556 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field6566 || var26 > arg2.field6566 || var34 > arg2.field6566;
                        if (var8.field9095 >= 0) {
                            if (this.method676(this.field784.field2812.method1610(18904, var8.field9095).field4134)) {
                                arg2.field6568 = 100;
                            }
                            arg2.method2736(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field9091 & 65535, var8.field9094 & 65535, var8.field9093 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field9095);
                            arg2.field6568 = 0;
                            return;
                        }
                        arg2.method2729(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field9091 & 65535, var8.field9094 & 65535, var8.field9093 & 65535);
                        return;
                    }
                } else {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field6556 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field6566 || var34 > arg2.field6566 || var26 > arg2.field6566;
                        if (var8.field9095 >= 0) {
                            if (this.method676(this.field784.field2812.method1610(18904, var8.field9095).field4134)) {
                                arg2.field6568 = 100;
                            }
                            arg2.method2736(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field9090 & 65535, var8.field9093 & 65535, var8.field9094 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field777, this.field777, this.field777, var8.field9095);
                            arg2.field6568 = 0;
                        } else {
                            arg2.method2729(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field9090 & 65535, var8.field9093 & 65535, var8.field9094 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field6556 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field6566 || var26 > arg2.field6566 || var34 > arg2.field6566;
                        if (var8.field9095 >= 0) {
                            if (this.method676(this.field784.field2812.method1610(18904, var8.field9095).field4134)) {
                                arg2.field6568 = 100;
                            }
                            arg2.method2736(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field9091 & 65535, var8.field9094 & 65535, var8.field9093 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field777, this.field777, this.field777, var8.field9095);
                            arg2.field6568 = 0;
                            return;
                        }
                        arg2.method2729(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field9091 & 65535, var8.field9094 & 65535, var8.field9093 & 65535);
                    }
                }
            }
        } else {
            class297 var47 = this.field767[arg0][arg1];
            if (var47 != null) {
                if (this.field777 == -1) {
                    for (int var48 = 0; var48 < var47.field4646; ++var48) {
                        int var49 = (arg0 << super.field515) + var47.field4648[var48];
                        short var50 = var47.field4643[var48];
                        int var51 = (arg1 << super.field515) + var47.field4642[var48];
                        float var52 = (float) var51 * this.field781 + (float) var49 * this.field776 + (float) var50 * this.field783 + this.field785;
                        if (var52 <= (float) this.field784.field2084) {
                            return;
                        }
                        float var53 = (float) var51 * this.field780 + (float) var49 * this.field772 + (float) var50 * this.field769 + this.field770;
                        float var54 = (float) var51 * this.field775 + (float) var49 * this.field773 + (float) var50 * this.field765 + this.field768;
                        arg3[var48] = (int) ((float) this.field784.field2086 * var53 / var52) + arg2.field6557;
                        arg4[var48] = (int) ((float) this.field784.field2083 * var54 / var52) + arg2.field6563;
                        arg5[var48] = (int) var52;
                    }
                } else {
                    for (int var55 = 0; var55 < var47.field4646; ++var55) {
                        int var107 = (arg0 << super.field515) + var47.field4648[var55];
                        short var108 = var47.field4643[var55];
                        int var109 = (arg1 << super.field515) + var47.field4642[var55];
                        float var110 = (float) var109 * this.field781 + (float) var107 * this.field776 + (float) var108 * this.field783 + this.field785;
                        float var111 = (float) var109 * this.field780 + (float) var107 * this.field772 + (float) var108 * this.field769 + this.field770;
                        float var112 = (float) var109 * this.field775 + (float) var107 * this.field773 + (float) var108 * this.field765 + this.field768;
                        arg3[var55] = (int) ((float) this.field784.field2086 * var111 / (float) this.field777) + arg2.field6557;
                        arg4[var55] = (int) ((float) this.field784.field2083 * var112 / (float) this.field777) + arg2.field6563;
                        arg5[var55] = (int) var110;
                    }
                }
                if (var47.field4650 != null) {
                    int var56 = super.field519[arg0][arg1];
                    int var57 = super.field519[arg0 + 1][arg1];
                    int var58 = super.field519[arg0][arg1 + 1];
                    int var59 = super.field516 * arg0;
                    int var60 = super.field516 + var59;
                    int var61 = super.field516 * arg1;
                    int var62 = super.field516 + var61;
                    float var63 = (float) var61 * this.field780 + (float) var56 * this.field769 + (float) var59 * this.field772 + this.field770;
                    float var64 = (float) var61 * this.field775 + (float) var56 * this.field765 + (float) var59 * this.field773 + this.field768;
                    float var65 = (float) var61 * this.field781 + (float) var56 * this.field783 + (float) var59 * this.field776 + this.field785;
                    float var66 = (float) var61 * this.field780 + (float) var57 * this.field769 + (float) var60 * this.field772 + this.field770;
                    float var67 = (float) var61 * this.field775 + (float) var57 * this.field765 + (float) var60 * this.field773 + this.field768;
                    float var68 = (float) var61 * this.field781 + (float) var57 * this.field783 + (float) var60 * this.field776 + this.field785;
                    float var69 = (float) var62 * this.field780 + (float) var58 * this.field769 + (float) var59 * this.field772 + this.field770;
                    float var70 = (float) var62 * this.field775 + (float) var58 * this.field765 + (float) var59 * this.field773 + this.field768;
                    float var71 = (float) var62 * this.field781 + (float) var58 * this.field783 + (float) var59 * this.field776 + this.field785;
                    if (this.field777 == -1) {
                        for (int var72 = 0; var72 < var47.field4639; ++var72) {
                            short var73 = var47.field4645[var72];
                            short var74 = var47.field4641[var72];
                            short var75 = var47.field4638[var72];
                            int var76 = arg3[var73];
                            int var77 = arg3[var74];
                            int var78 = arg3[var75];
                            int var79 = arg4[var73];
                            int var80 = arg4[var74];
                            int var81 = arg4[var75];
                            if ((var76 - var77) * (var81 - var80) - (var78 - var77) * (var79 - var80) > 0) {
                                arg2.field6556 = var76 < 0 || var77 < 0 || var78 < 0 || var76 > arg2.field6566 || var77 > arg2.field6566 || var78 > arg2.field6566;
                                short var82 = var47.field4650[var72];
                                if (var82 != -1) {
                                    if (this.method676(this.field784.field2812.method1610(18904, var82).field4134)) {
                                        arg2.field6568 = 100;
                                    }
                                    arg2.method2736(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], var47.field4644[var73], var47.field4644[var74], var47.field4644[var75], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, (int) var65, (int) var68, (int) var71, var82);
                                    arg2.field6568 = 0;
                                } else {
                                    int var83 = var47.field4640[var72];
                                    if (var83 != -1) {
                                        arg2.method2729(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], class327.method2205(var47.field4644[var73], -78, var83), class327.method2205(var47.field4644[var74], -120, var83), class327.method2205(var47.field4644[var75], -80, var83));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var84 = 0; var84 < var47.field4639; ++var84) {
                        short var85 = var47.field4645[var84];
                        short var86 = var47.field4641[var84];
                        short var87 = var47.field4638[var84];
                        int var88 = arg3[var85];
                        int var89 = arg3[var86];
                        int var90 = arg3[var87];
                        int var91 = arg4[var85];
                        int var92 = arg4[var86];
                        int var93 = arg4[var87];
                        if ((var88 - var89) * (var93 - var92) - (var90 - var89) * (var91 - var92) > 0) {
                            arg2.field6556 = var88 < 0 || var89 < 0 || var90 < 0 || var88 > arg2.field6566 || var89 > arg2.field6566 || var90 > arg2.field6566;
                            short var94 = var47.field4650[var84];
                            if (var94 != -1) {
                                if (this.method676(this.field784.field2812.method1610(18904, var94).field4134)) {
                                    arg2.field6568 = 100;
                                }
                                arg2.method2736(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], var47.field4644[var85], var47.field4644[var86], var47.field4644[var87], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, this.field777, this.field777, this.field777, var94);
                                arg2.field6568 = 0;
                            } else {
                                int var95 = var47.field4640[var84];
                                if (var95 != -1) {
                                    arg2.method2729(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], class327.method2205(var47.field4644[var85], -81, var95), class327.method2205(var47.field4644[var86], -78, var95), class327.method2205(var47.field4644[var87], -82, var95));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var96 = 0; var96 < var47.field4639; ++var96) {
                    short var97 = var47.field4645[var96];
                    short var98 = var47.field4641[var96];
                    short var99 = var47.field4638[var96];
                    int var100 = arg3[var97];
                    int var101 = arg3[var98];
                    int var102 = arg3[var99];
                    int var103 = arg4[var97];
                    int var104 = arg4[var98];
                    int var105 = arg4[var99];
                    if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                        int var106 = var47.field4640[var96];
                        if (var106 != -1) {
                            arg2.field6556 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg2.field6566 || var101 > arg2.field6566 || var102 > arg2.field6566;
                            arg2.method2729(var103, var104, var105, var100, var101, var102, arg5[var97], arg5[var98], arg5[var99], class327.method2205(var47.field4644[var97], -113, var106), class327.method2205(var47.field4644[var98], -80, var106), class327.method2205(var47.field4644[var99], -112, var106));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZLmf;Lwi;[I[I[I[I)V", line = 511)
    private final void method673(int arg0, int arg1, boolean arg2, class384 arg3, class431 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8) {
        class552 var10 = this.field766[arg0][arg1];
        if (var10 != null) {
            if ((var10.field8008 & 2) == 0) {
                int var11 = super.field516 * arg0;
                int var12 = super.field516 + var11;
                int var13 = super.field516 * arg1;
                int var14 = super.field516 + var13;
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
                if ((var10.field8008 & 1) != 0 && !arg2) {
                    int var19 = super.field519[arg0][arg1];
                    float var20 = (float) var19 * this.field783;
                    if (this.field777 == -1) {
                        var21 = (float) var13 * this.field781 + (float) var11 * this.field776 + var20 + this.field785;
                        if (var21 <= (float) this.field784.field2084) {
                            return;
                        }
                        var22 = (float) var13 * this.field781 + (float) var12 * this.field776 + var20 + this.field785;
                        if (var22 <= (float) this.field784.field2084) {
                            return;
                        }
                        var23 = (float) var14 * this.field781 + (float) var12 * this.field776 + var20 + this.field785;
                        if (var23 <= (float) this.field784.field2084) {
                            return;
                        }
                        var24 = (float) var14 * this.field781 + (float) var11 * this.field776 + var20 + this.field785;
                        if (var24 <= (float) this.field784.field2084) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field781 + (float) var11 * this.field776 + var20 + this.field785;
                        var22 = (float) var13 * this.field781 + (float) var12 * this.field776 + var20 + this.field785;
                        var23 = (float) var14 * this.field781 + (float) var12 * this.field776 + var20 + this.field785;
                        var24 = (float) var14 * this.field781 + (float) var11 * this.field776 + var20 + this.field785;
                    }
                    if (arg3.field5939) {
                        int var25 = (int) (var21 - (float) arg3.field5946);
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = (int) (var22 - (float) arg3.field5946);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field5946);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field5946);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    float var29 = (float) var19 * this.field769;
                    float var30 = (float) var19 * this.field765;
                    if (this.field777 == -1) {
                        var31 = (float) var13 * this.field780 + (float) var11 * this.field772 + var29 + this.field770;
                        var32 = (int) ((float) this.field784.field2086 * var31 / var21) + arg4.field6557;
                        var33 = (float) var13 * this.field775 + (float) var11 * this.field773 + var30 + this.field768;
                        var34 = (int) ((float) this.field784.field2083 * var33 / var21) + arg4.field6563;
                        var35 = (float) var13 * this.field780 + (float) var12 * this.field772 + var29 + this.field770;
                        var36 = (int) ((float) this.field784.field2086 * var35 / var22) + arg4.field6557;
                        var37 = (float) var13 * this.field775 + (float) var12 * this.field773 + var30 + this.field768;
                        var38 = (int) ((float) this.field784.field2083 * var37 / var22) + arg4.field6563;
                        var39 = (float) var14 * this.field780 + (float) var12 * this.field772 + var29 + this.field770;
                        var40 = (int) ((float) this.field784.field2086 * var39 / var23) + arg4.field6557;
                        var41 = (float) var14 * this.field775 + (float) var12 * this.field773 + var30 + this.field768;
                        var42 = (int) ((float) this.field784.field2083 * var41 / var23) + arg4.field6563;
                        var43 = (float) var14 * this.field780 + (float) var11 * this.field772 + var29 + this.field770;
                        var44 = (int) ((float) this.field784.field2086 * var43 / var24) + arg4.field6557;
                        var45 = (float) var14 * this.field775 + (float) var11 * this.field773 + var30 + this.field768;
                        var46 = (int) ((float) this.field784.field2083 * var45 / var24) + arg4.field6563;
                    } else {
                        var31 = (float) var13 * this.field780 + (float) var11 * this.field772 + var29 + this.field770;
                        var32 = (int) ((float) this.field784.field2086 * var31 / (float) this.field777) + arg4.field6557;
                        var33 = (float) var13 * this.field775 + (float) var11 * this.field773 + var30 + this.field768;
                        var34 = (int) ((float) this.field784.field2083 * var33 / (float) this.field777) + arg4.field6563;
                        var35 = (float) var13 * this.field780 + (float) var12 * this.field772 + var29 + this.field770;
                        var36 = (int) ((float) this.field784.field2086 * var35 / (float) this.field777) + arg4.field6557;
                        var37 = (float) var13 * this.field775 + (float) var12 * this.field773 + var30 + this.field768;
                        var38 = (int) ((float) this.field784.field2083 * var37 / (float) this.field777) + arg4.field6563;
                        var39 = (float) var14 * this.field780 + (float) var12 * this.field772 + var29 + this.field770;
                        var40 = (int) ((float) this.field784.field2086 * var39 / (float) this.field777) + arg4.field6557;
                        var41 = (float) var14 * this.field775 + (float) var12 * this.field773 + var30 + this.field768;
                        var42 = (int) ((float) this.field784.field2083 * var41 / (float) this.field777) + arg4.field6563;
                        var43 = (float) var14 * this.field780 + (float) var11 * this.field772 + var29 + this.field770;
                        var44 = (int) ((float) this.field784.field2086 * var43 / (float) this.field777) + arg4.field6557;
                        var45 = (float) var14 * this.field775 + (float) var11 * this.field773 + var30 + this.field768;
                        var46 = (int) ((float) this.field784.field2083 * var45 / (float) this.field777) + arg4.field6563;
                    }
                } else {
                    int var47 = super.field519[arg0][arg1];
                    int var48 = super.field519[arg0 + 1][arg1];
                    int var49 = super.field519[arg0 + 1][arg1 + 1];
                    int var50 = super.field519[arg0][arg1 + 1];
                    if (this.field777 == -1) {
                        var21 = (float) var13 * this.field781 + (float) var11 * this.field776 + (float) var47 * this.field783 + this.field785;
                        if (var21 <= (float) this.field784.field2084) {
                            return;
                        }
                        var22 = (float) var13 * this.field781 + (float) var12 * this.field776 + (float) var48 * this.field783 + this.field785;
                        if (var22 <= (float) this.field784.field2084) {
                            return;
                        }
                        var23 = (float) var14 * this.field781 + (float) var12 * this.field776 + (float) var49 * this.field783 + this.field785;
                        if (var23 <= (float) this.field784.field2084) {
                            return;
                        }
                        var24 = (float) var14 * this.field781 + (float) var11 * this.field776 + (float) var50 * this.field783 + this.field785;
                        if (var24 <= (float) this.field784.field2084) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field781 + (float) var11 * this.field776 + (float) var47 * this.field783 + this.field785;
                        var22 = (float) var13 * this.field781 + (float) var12 * this.field776 + (float) var48 * this.field783 + this.field785;
                        var23 = (float) var14 * this.field781 + (float) var12 * this.field776 + (float) var49 * this.field783 + this.field785;
                        var24 = (float) var14 * this.field781 + (float) var11 * this.field776 + (float) var50 * this.field783 + this.field785;
                    }
                    if (arg2) {
                        int var51 = (int) (var21 - (float) arg3.field5946);
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var15 = var51;
                            int var52 = var10.field8013 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = (int) (var22 - (float) arg3.field5946);
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var16 = var53;
                            int var54 = var10.field8014 * var53 / 255;
                            if (var54 > 0) {
                                var48 -= var54;
                            }
                        }
                        int var55 = (int) (var23 - (float) arg3.field5946);
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field8016 * var55 / 255;
                            if (var56 > 0) {
                                var49 -= var56;
                            }
                        }
                        int var57 = (int) (var24 - (float) arg3.field5946);
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var18 = var57;
                            int var58 = var10.field8012 * var57 / 255;
                            if (var58 > 0) {
                                var50 -= var58;
                            }
                        }
                    } else if (arg3.field5939) {
                        int var59 = (int) (var21 - (float) arg3.field5946);
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = (int) (var22 - (float) arg3.field5946);
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = (int) (var23 - (float) arg3.field5946);
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                        int var62 = (int) (var24 - (float) arg3.field5946);
                        if (var62 > 0) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    if (this.field777 == -1) {
                        var31 = (float) var13 * this.field780 + (float) var11 * this.field772 + (float) var47 * this.field769 + this.field770;
                        var32 = (int) ((float) this.field784.field2086 * var31 / var21) + arg4.field6557;
                        var33 = (float) var13 * this.field775 + (float) var11 * this.field773 + (float) var47 * this.field765 + this.field768;
                        var34 = (int) ((float) this.field784.field2083 * var33 / var21) + arg4.field6563;
                        var35 = (float) var13 * this.field780 + (float) var12 * this.field772 + (float) var48 * this.field769 + this.field770;
                        var36 = (int) ((float) this.field784.field2086 * var35 / var22) + arg4.field6557;
                        var37 = (float) var13 * this.field775 + (float) var12 * this.field773 + (float) var48 * this.field765 + this.field768;
                        var38 = (int) ((float) this.field784.field2083 * var37 / var22) + arg4.field6563;
                        var39 = (float) var14 * this.field780 + (float) var12 * this.field772 + (float) var49 * this.field769 + this.field770;
                        var40 = (int) ((float) this.field784.field2086 * var39 / var23) + arg4.field6557;
                        var41 = (float) var14 * this.field775 + (float) var12 * this.field773 + (float) var49 * this.field765 + this.field768;
                        var42 = (int) ((float) this.field784.field2083 * var41 / var23) + arg4.field6563;
                        var43 = (float) var14 * this.field780 + (float) var11 * this.field772 + (float) var50 * this.field769 + this.field770;
                        var44 = (int) ((float) this.field784.field2086 * var43 / var24) + arg4.field6557;
                        var45 = (float) var14 * this.field775 + (float) var11 * this.field773 + (float) var50 * this.field765 + this.field768;
                        var46 = (int) ((float) this.field784.field2083 * var45 / var24) + arg4.field6563;
                    } else {
                        var31 = (float) var13 * this.field780 + (float) var11 * this.field772 + (float) var47 * this.field769 + this.field770;
                        var32 = (int) ((float) this.field784.field2086 * var31 / (float) this.field777) + arg4.field6557;
                        var33 = (float) var13 * this.field775 + (float) var11 * this.field773 + (float) var47 * this.field765 + this.field768;
                        var34 = (int) ((float) this.field784.field2083 * var33 / (float) this.field777) + arg4.field6563;
                        var35 = (float) var13 * this.field780 + (float) var12 * this.field772 + (float) var48 * this.field769 + this.field770;
                        var36 = (int) ((float) this.field784.field2086 * var35 / (float) this.field777) + arg4.field6557;
                        var37 = (float) var13 * this.field775 + (float) var12 * this.field773 + (float) var48 * this.field765 + this.field768;
                        var38 = (int) ((float) this.field784.field2083 * var37 / (float) this.field777) + arg4.field6563;
                        var39 = (float) var14 * this.field780 + (float) var12 * this.field772 + (float) var49 * this.field769 + this.field770;
                        var40 = (int) ((float) this.field784.field2086 * var39 / (float) this.field777) + arg4.field6557;
                        var41 = (float) var14 * this.field775 + (float) var12 * this.field773 + (float) var49 * this.field765 + this.field768;
                        var42 = (int) ((float) this.field784.field2083 * var41 / (float) this.field777) + arg4.field6563;
                        var43 = (float) var14 * this.field780 + (float) var11 * this.field772 + (float) var50 * this.field769 + this.field770;
                        var44 = (int) ((float) this.field784.field2086 * var43 / (float) this.field777) + arg4.field6557;
                        var45 = (float) var14 * this.field775 + (float) var11 * this.field773 + (float) var50 * this.field765 + this.field768;
                        var46 = (int) ((float) this.field784.field2083 * var45 / (float) this.field777) + arg4.field6563;
                    }
                }
                boolean var63 = var10.field8015 != -1 && this.method676(this.field784.field2812.method1610(18904, var10.field8015).field4134);
                if (this.field777 == -1) {
                    int var64 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field6556 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field6566 || var44 > arg4.field6566 || var36 > arg4.field6566;
                        if (var64 < 765) {
                            if (var63) {
                                arg4.field6568 = 100;
                            }
                            if (var64 > 0) {
                                if (var10.field8015 >= 0) {
                                    arg4.method2725(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field5933, var17, var18, var16, var10.field8009, var10.field8007, var10.field8011, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field8015);
                                } else {
                                    arg4.method2741(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class561.method3334(255, var17 << 24 | arg3.field5933, var10.field8009), class561.method3334(255, var18 << 24 | arg3.field5933, var10.field8007), class561.method3334(255, var16 << 24 | arg3.field5933, var10.field8011));
                                }
                            } else if (var10.field8015 >= 0) {
                                arg4.method2736(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field8009, var10.field8007, var10.field8011, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field8015);
                            } else {
                                arg4.method2741(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field8009, var10.field8007, var10.field8011);
                            }
                            arg4.field6568 = 0;
                        } else {
                            arg4.method2722(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field5933);
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field6556 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field6566 || var36 > arg4.field6566 || var44 > arg4.field6566;
                        if (var65 < 765) {
                            if (var63) {
                                arg4.field6568 = 100;
                            }
                            if (var65 > 0) {
                                if (var10.field8015 >= 0) {
                                    arg4.method2725(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field5933, var15, var16, var18, var10.field8010, var10.field8011, var10.field8007, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field8015);
                                } else {
                                    arg4.method2741(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class561.method3334(255, var15 << 24 | arg3.field5933, var10.field8010), class561.method3334(255, var16 << 24 | arg3.field5933, var10.field8011), class561.method3334(255, var18 << 24 | arg3.field5933, var10.field8007));
                                }
                            } else if (var10.field8015 >= 0) {
                                arg4.method2736(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field8010, var10.field8011, var10.field8007, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field8015);
                            } else {
                                arg4.method2741(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field8010, var10.field8011, var10.field8007);
                            }
                            arg4.field6568 = 0;
                            return;
                        }
                        arg4.method2722(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field5933);
                        return;
                    }
                } else {
                    int var66 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field6556 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field6566 || var44 > arg4.field6566 || var36 > arg4.field6566;
                        if (var66 < 765) {
                            if (var63) {
                                arg4.field6568 = 100;
                            }
                            if (var66 > 0) {
                                if (var10.field8015 >= 0) {
                                    arg4.method2725(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field5933, var17, var18, var16, var10.field8009, var10.field8007, var10.field8011, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field777, this.field777, this.field777, var10.field8015);
                                } else {
                                    arg4.method2741(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class561.method3334(255, var17 << 24 | arg3.field5933, var10.field8009), class561.method3334(255, var18 << 24 | arg3.field5933, var10.field8007), class561.method3334(255, var16 << 24 | arg3.field5933, var10.field8011));
                                }
                            } else if (var10.field8015 >= 0) {
                                arg4.method2736(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field8009, var10.field8007, var10.field8011, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field777, this.field777, this.field777, var10.field8015);
                            } else {
                                arg4.method2741(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field8009, var10.field8007, var10.field8011);
                            }
                            arg4.field6568 = 0;
                        } else {
                            arg4.method2722(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field5933);
                        }
                    }
                    int var67 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field6556 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field6566 || var36 > arg4.field6566 || var44 > arg4.field6566;
                        if (var67 < 765) {
                            if (var63) {
                                arg4.field6568 = 100;
                            }
                            if (var67 > 0) {
                                if (var10.field8015 >= 0) {
                                    arg4.method2725(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field5933, var15, var16, var18, var10.field8010, var10.field8011, var10.field8007, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field777, this.field777, this.field777, var10.field8015);
                                } else {
                                    arg4.method2741(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class561.method3334(255, var15 << 24 | arg3.field5933, var10.field8010), class561.method3334(255, var16 << 24 | arg3.field5933, var10.field8011), class561.method3334(255, var18 << 24 | arg3.field5933, var10.field8007));
                                }
                            } else if (var10.field8015 >= 0) {
                                arg4.method2736(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field8010, var10.field8011, var10.field8007, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field777, this.field777, this.field777, var10.field8015);
                            } else {
                                arg4.method2741(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field8010, var10.field8011, var10.field8007);
                            }
                            arg4.field6568 = 0;
                            return;
                        }
                        arg4.method2722(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field5933);
                    }
                }
            }
        } else {
            class495 var68 = this.field774[arg0][arg1];
            if (var68 != null) {
                if (this.field777 == -1) {
                    for (int var69 = 0; var69 < var68.field7225; ++var69) {
                        int var70 = (arg0 << super.field515) + var68.field7223[var69];
                        int var71 = var68.field7228[var69];
                        int var72 = (arg1 << super.field515) + var68.field7222[var69];
                        float var73 = (float) var72 * this.field781 + (float) var70 * this.field776 + (float) var71 * this.field783 + this.field785;
                        if (var73 <= (float) this.field784.field2084) {
                            return;
                        }
                        arg8[var69] = 0;
                        if (arg2) {
                            int var74 = (int) (var73 - (float) arg3.field5946);
                            if (var74 > 255) {
                                var74 = 255;
                            }
                            if (var74 > 0) {
                                arg8[var69] = var74;
                                int var75 = var68.field7226[var69] * var74 / 255;
                                if (var75 > 0) {
                                    var71 -= var75;
                                }
                            }
                        } else if (arg3.field5939) {
                            int var76 = (int) (var73 - (float) arg3.field5946);
                            if (var76 > 0) {
                                arg8[var69] = var76;
                                if (arg8[var69] > 255) {
                                    arg8[var69] = 255;
                                }
                            }
                        }
                        float var77 = (float) var72 * this.field780 + (float) var70 * this.field772 + (float) var71 * this.field769 + this.field770;
                        float var78 = (float) var72 * this.field775 + (float) var70 * this.field773 + (float) var71 * this.field765 + this.field768;
                        arg5[var69] = (int) ((float) this.field784.field2086 * var77 / var73) + arg4.field6557;
                        arg6[var69] = (int) ((float) this.field784.field2083 * var78 / var73) + arg4.field6563;
                        arg7[var69] = (int) var73;
                    }
                } else {
                    for (int var79 = 0; var79 < var68.field7225; ++var79) {
                        int var131 = (arg0 << super.field515) + var68.field7223[var79];
                        int var132 = var68.field7228[var79];
                        int var133 = (arg1 << super.field515) + var68.field7222[var79];
                        float var134 = (float) var133 * this.field781 + (float) var131 * this.field776 + (float) var132 * this.field783 + this.field785;
                        arg8[var79] = 0;
                        if (arg2) {
                            int var135 = this.field777 - arg3.field5946;
                            if (var135 > 255) {
                                var135 = 255;
                            }
                            if (var135 > 0) {
                                arg8[var79] = var135;
                                int var136 = var68.field7226[var79] * var135 / 255;
                                if (var136 > 0) {
                                    var132 -= var136;
                                }
                            }
                        } else if (arg3.field5939) {
                            int var137 = this.field777 - arg3.field5946;
                            if (var137 > 0) {
                                arg8[var79] = var137;
                                if (arg8[var79] > 255) {
                                    arg8[var79] = 255;
                                }
                            }
                        }
                        float var138 = (float) var133 * this.field780 + (float) var131 * this.field772 + (float) var132 * this.field769 + this.field770;
                        float var139 = (float) var133 * this.field775 + (float) var131 * this.field773 + (float) var132 * this.field765 + this.field768;
                        arg5[var79] = (int) ((float) this.field784.field2086 * var138 / (float) this.field777) + arg4.field6557;
                        arg6[var79] = (int) ((float) this.field784.field2083 * var139 / (float) this.field777) + arg4.field6563;
                        arg7[var79] = (int) var134;
                    }
                }
                if (var68.field7224 != null) {
                    int var80 = super.field519[arg0][arg1];
                    int var81 = super.field519[arg0 + 1][arg1];
                    int var82 = super.field519[arg0][arg1 + 1];
                    int var83 = super.field516 * arg0;
                    int var84 = super.field516 + var83;
                    int var85 = super.field516 * arg1;
                    int var86 = super.field516 + var85;
                    float var87 = (float) var85 * this.field780 + (float) var80 * this.field769 + (float) var83 * this.field772 + this.field770;
                    float var88 = (float) var85 * this.field775 + (float) var80 * this.field765 + (float) var83 * this.field773 + this.field768;
                    float var89 = (float) var85 * this.field781 + (float) var80 * this.field783 + (float) var83 * this.field776 + this.field785;
                    float var90 = (float) var85 * this.field780 + (float) var81 * this.field769 + (float) var84 * this.field772 + this.field770;
                    float var91 = (float) var85 * this.field775 + (float) var81 * this.field765 + (float) var84 * this.field773 + this.field768;
                    float var92 = (float) var85 * this.field781 + (float) var81 * this.field783 + (float) var84 * this.field776 + this.field785;
                    float var93 = (float) var86 * this.field780 + (float) var82 * this.field769 + (float) var83 * this.field772 + this.field770;
                    float var94 = (float) var86 * this.field775 + (float) var82 * this.field765 + (float) var83 * this.field773 + this.field768;
                    float var95 = (float) var86 * this.field781 + (float) var82 * this.field783 + (float) var83 * this.field776 + this.field785;
                    if (this.field777 == -1) {
                        for (int var96 = 0; var96 < var68.field7229; ++var96) {
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
                                arg4.field6556 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg4.field6566 || var101 > arg4.field6566 || var102 > arg4.field6566;
                                short var107 = var68.field7224[var96];
                                if (var106 < 765) {
                                    if (var107 != -1 && this.method676(this.field784.field2812.method1610(18904, var107).field4134)) {
                                        arg4.field6568 = 100;
                                    }
                                    if (var106 > 0) {
                                        if (var107 != -1) {
                                            arg4.method2725(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field5933, arg8[var97], arg8[var98], arg8[var99], var68.field7227[var97], var68.field7227[var98], var68.field7227[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                        } else if ((var68.field7227[var97] & 16777215) != 0) {
                                            arg4.method2741(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], class561.method3334(255, arg8[var97] << 24 | arg3.field5933, var68.field7227[var97]), class561.method3334(255, arg8[var98] << 24 | arg3.field5933, var68.field7227[var98]), class561.method3334(255, arg8[var99] << 24 | arg3.field5933, var68.field7227[var99]));
                                        }
                                    } else if (var107 != -1) {
                                        arg4.method2736(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field7227[var97], var68.field7227[var98], var68.field7227[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                    } else if ((var68.field7227[var97] & 16777215) != 0) {
                                        arg4.method2741(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field7227[var97], var68.field7227[var98], var68.field7227[var99]);
                                    }
                                    arg4.field6568 = 0;
                                } else {
                                    arg4.method2722(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field5933);
                                }
                            }
                        }
                        return;
                    }
                    for (int var108 = 0; var108 < var68.field7229; ++var108) {
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
                            arg4.field6556 = var112 < 0 || var113 < 0 || var114 < 0 || var112 > arg4.field6566 || var113 > arg4.field6566 || var114 > arg4.field6566;
                            short var119 = var68.field7224[var108];
                            if (var118 < 765) {
                                if (var119 != -1 && this.method676(this.field784.field2812.method1610(18904, var119).field4134)) {
                                    arg4.field6568 = 100;
                                }
                                if (var118 > 0) {
                                    if (var119 != -1) {
                                        arg4.method2725(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field5933, arg8[var109], arg8[var110], arg8[var111], var68.field7227[var109], var68.field7227[var110], var68.field7227[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field777, this.field777, this.field777, var119);
                                    } else if ((var68.field7227[var109] & 16777215) != 0) {
                                        arg4.method2741(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], class561.method3334(255, arg8[var109] << 24 | arg3.field5933, var68.field7227[var109]), class561.method3334(255, arg8[var110] << 24 | arg3.field5933, var68.field7227[var110]), class561.method3334(255, arg8[var111] << 24 | arg3.field5933, var68.field7227[var111]));
                                    }
                                } else if (var119 != -1) {
                                    arg4.method2736(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field7227[var109], var68.field7227[var110], var68.field7227[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field777, this.field777, this.field777, var119);
                                } else if ((var68.field7227[var109] & 16777215) != 0) {
                                    arg4.method2741(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field7227[var109], var68.field7227[var110], var68.field7227[var111]);
                                }
                                arg4.field6568 = 0;
                            } else {
                                arg4.method2722(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field5933);
                            }
                        }
                    }
                    return;
                }
                for (int var120 = 0; var120 < var68.field7229; ++var120) {
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
                        arg4.field6556 = var124 < 0 || var125 < 0 || var126 < 0 || var124 > arg4.field6566 || var125 > arg4.field6566 || var126 > arg4.field6566;
                        if (var130 < 765) {
                            if (var130 > 0) {
                                if ((var68.field7227[var121] & 16777215) != 0) {
                                    arg4.method2741(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], class343.method2338((byte) 110, arg3.field5933, var68.field7227[var121], arg8[var121]), class343.method2338((byte) 92, arg3.field5933, var68.field7227[var122], arg8[var122]), class343.method2338((byte) 96, arg3.field5933, var68.field7227[var123], arg8[var123]));
                                }
                            } else if ((var68.field7227[var121] & 16777215) != 0) {
                                arg4.method2741(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], var68.field7227[var121], var68.field7227[var122], var68.field7227[var123]);
                            }
                        } else {
                            arg4.method2722(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], arg3.field5933);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III[[ZZI)V", line = 1355)
    public final void method490(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class243 var7 = this.field784.field2082;
        this.field777 = arg5;
        this.field772 = var7.field3881;
        this.field769 = var7.field3876;
        this.field780 = var7.field3861;
        this.field770 = var7.field3852;
        this.field773 = var7.field3856;
        this.field765 = var7.field3862;
        this.field775 = var7.field3869;
        this.field768 = var7.field3851;
        this.field776 = var7.field3873;
        this.field783 = var7.field3882;
        this.field781 = var7.field3877;
        this.field785 = var7.field3880;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field510 && var11 >= 0 && var11 < super.field513) {
                        this.method489(var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII[[ZLmf;Lwi;[I[I)V", line = 1403)
    private final void method674(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class384 arg8, class431 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field5936;
        this.field784.method334(false);
        arg9.field6558 = false;
        arg9.field6551 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field766[var18][var19] != null) {
                        class552 var20 = this.field766[var18][var19];
                        if (var20.field8015 != -1 && (var20.field8008 & 2) == 0 && var20.field8006 == 0) {
                            int var21 = this.field784.method1120(var20.field8015);
                            arg9.method2729(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class327.method2205(var20.field8009, -99, var21), class327.method2205(var20.field8007, -76, var21), class327.method2205(var20.field8011, -122, var21));
                            arg9.method2729(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class327.method2205(var20.field8010, -94, var21), class327.method2205(var20.field8011, -127, var21), class327.method2205(var20.field8007, -108, var21));
                        } else if (var20.field8006 == 0) {
                            arg9.method2741(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field8009, var20.field8007, var20.field8011);
                            arg9.method2741(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field8010, var20.field8011, var20.field8007);
                        } else {
                            int var22 = var20.field8006;
                            arg9.method2741(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class561.method3334(255, var20.field8009 & -16777216, var22), class561.method3334(255, var20.field8007 & -16777216, var22), class561.method3334(255, var20.field8011 & -16777216, var22));
                            arg9.method2741(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class561.method3334(255, var20.field8010 & -16777216, var22), class561.method3334(255, var20.field8011 & -16777216, var22), class561.method3334(255, var20.field8007 & -16777216, var22));
                        }
                    } else if (this.field774[var18][var19] != null) {
                        class495 var23 = this.field774[var18][var19];
                        for (int var24 = 0; var24 < var23.field7225; ++var24) {
                            arg10[var24] = var23.field7223[var24] * var14 / super.field516 + var16;
                            arg11[var24] = var17 - var23.field7222[var24] * var14 / super.field516;
                        }
                        for (int var25 = 0; var25 < var23.field7229; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field7230 != null && var23.field7230[var25] != 0 && (var23.field7224 == null || var23.field7224 != null && var23.field7224[var25] == -1)) {
                                int var35 = var23.field7230[var25];
                                arg9.method2741(var32, var33, var34, var29, var30, var31, 100, 100, 100, class561.method3334(255, -16777216 - (var23.field7227[var26] & -16777216), var35), class561.method3334(255, -16777216 - (var23.field7227[var27] & -16777216), var35), class561.method3334(255, -16777216 - (var23.field7227[var28] & -16777216), var35));
                            } else if (var23.field7224 != null && var23.field7224[var25] != -1) {
                                int var36 = this.field784.method1120(var23.field7224[var25]);
                                arg9.method2729(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                            } else {
                                arg9.method2741(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field7227[var26], var23.field7227[var27], var23.field7227[var28]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field6558 = true;
        this.field784.method334(var15);
    }

    @OriginalMember(owner = "client!wc", name = "BA", descriptor = "()V", line = 1537)
    public final void method483() {
        this.field782 = null;
        this.field779 = null;
    }

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "(Lha;IIIIZ)V", line = 1540)
    public final void method480(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lcp;[I)V", line = 1546)
    public final void method487(class674 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 1551)
    public final void method489(int arg0, int arg1) {
        class384 var3 = this.field784.method1122(Thread.currentThread());
        var3.field5969.field6568 = 0;
        if (this.field766 != null) {
            this.method673(arg0, arg1, var3.field5935, var3, var3.field5969, var3.field5980, var3.field5957, var3.field5973, var3.field5975);
        } else {
            if (this.field778 != null) {
                this.method672(arg0, arg1, var3.field5969, var3.field5980, var3.field5957, var3.field5973, var3.field5975);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V", line = 1562)
    public final void method476(int arg0, int arg1, int arg2) {
        if (this.field779[arg0][arg1] < arg2) {
            this.field779[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 1568)
    public final void method473(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field778 == null) {
            this.field778 = new class648[super.field510][super.field513];
            this.field767 = new class297[super.field510][super.field513];
        } else if (this.field766 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field516 != var20 || var21 != 0 && super.field516 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class297 var22 = new class297();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field4646 = var23;
            var22.field4644 = new short[var23];
            var22.field4648 = new short[var23];
            var22.field4643 = new short[var23];
            var22.field4642 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field4644[var25] = (short) (this.field782[arg0][arg1] - this.field779[arg0][arg1]);
                } else if (var30 == 0 && super.field516 == var31) {
                    var22.field4644[var25] = (short) (this.field782[arg0][arg1 + 1] - this.field779[arg0][arg1 + 1]);
                } else if (super.field516 == var30 && super.field516 == var31) {
                    var22.field4644[var25] = (short) (this.field782[arg0 + 1][arg1 + 1] - this.field779[arg0 + 1][arg1 + 1]);
                } else if (super.field516 == var30 && var31 == 0) {
                    var22.field4644[var25] = (short) (this.field782[arg0 + 1][arg1] - this.field779[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field782[arg0 + 1][arg1] - this.field779[arg0 + 1][arg1]) * var30 + (this.field782[arg0][arg1] - this.field779[arg0][arg1]) * (super.field516 - var30);
                    int var33 = (this.field782[arg0 + 1][arg1 + 1] - this.field779[arg0 + 1][arg1 + 1]) * var30 + (this.field782[arg0][arg1 + 1] - this.field779[arg0][arg1 + 1]) * (super.field516 - var30);
                    var22.field4644[var25] = (short) ((super.field516 - var31) * var32 + var31 * var33 >> super.field515 * 2);
                }
                int var34 = (arg0 << super.field515) + var30;
                int var35 = (arg1 << super.field515) + var31;
                var22.field4648[var25] = (short) var30;
                var22.field4642[var25] = (short) var31;
                var22.field4643[var25] = (short) (this.method477(-1, var35, var34) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field4644[var25] < 2) {
                    var22.field4644[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field784.field2812.method1610(18904, arg11[var28]).field4117) {
                    var26 = true;
                }
            }
            var22.field4640 = new int[var27];
            if (arg10 != null) {
                var22.field4649 = new int[var27];
            }
            var22.field4645 = new short[var27];
            var22.field4641 = new short[var27];
            var22.field4638 = new short[var27];
            if (var26) {
                var22.field4650 = new short[var27];
                var22.field4647 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field4640[var22.field4639] = class65.method702(92, arg9[var29]);
                    } else {
                        var22.field4640[var22.field4639] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field4649[var22.field4639] = class65.method702(115, arg10[var29]);
                        } else {
                            var22.field4649[var22.field4639] = -1;
                        }
                    }
                    var22.field4645[var22.field4639] = (short) arg6[var29];
                    var22.field4641[var22.field4639] = (short) arg7[var29];
                    var22.field4638[var22.field4639] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field784.field2812.method1610(18904, arg11[var29]).field4117) {
                            var22.field4650[var22.field4639] = (short) arg11[var29];
                            var22.field4647[var22.field4639] = (short) arg12[var29];
                        } else {
                            var22.field4650[var22.field4639] = -1;
                        }
                    }
                    ++var22.field4639;
                }
            }
            this.field767[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class648 var36 = new class648();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field9092 = class327.method2205(this.field782[arg0][arg1] - this.field779[arg0][arg1], -111, class65.method702(73, arg10[0]));
                    if (var37 == -1) {
                        var36.field9096 = (byte) (var36.field9096 | 2);
                    }
                }
                if (super.field519[arg0 + 1][arg1] == super.field519[arg0][arg1] && super.field519[arg0 + 1][arg1 + 1] == super.field519[arg0][arg1] && super.field519[arg0][arg1 + 1] == super.field519[arg0][arg1]) {
                    var36.field9096 = (byte) (var36.field9096 | 1);
                }
                if (var38 != -1 && (var36.field9096 & 2) == 0 && !this.field784.field2812.method1610(18904, var38).field4117) {
                    var36.field9091 = (short) (this.field782[arg0][arg1] - this.field779[arg0][arg1]);
                    var36.field9094 = (short) (this.field782[arg0 + 1][arg1] - this.field779[arg0 + 1][arg1]);
                    var36.field9090 = (short) (this.field782[arg0 + 1][arg1 + 1] - this.field779[arg0 + 1][arg1 + 1]);
                    var36.field9093 = (short) (this.field782[arg0][arg1 + 1] - this.field779[arg0][arg1 + 1]);
                    var36.field9095 = (short) var38;
                } else {
                    short var39 = class65.method702(85, var37);
                    var36.field9091 = (short) class327.method2205(this.field782[arg0][arg1] - this.field779[arg0][arg1], -71, var39);
                    var36.field9094 = (short) class327.method2205(this.field782[arg0 + 1][arg1] - this.field779[arg0 + 1][arg1], -122, var39);
                    var36.field9090 = (short) class327.method2205(this.field782[arg0 + 1][arg1 + 1] - this.field779[arg0 + 1][arg1 + 1], -100, var39);
                    var36.field9093 = (short) class327.method2205(this.field782[arg0][arg1 + 1] - this.field779[arg0][arg1 + 1], -89, var39);
                    var36.field9095 = -1;
                }
                this.field778[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 1797)
    public final void method484(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field766 == null) {
            this.field766 = new class552[super.field510][super.field513];
            this.field774 = new class495[super.field510][super.field513];
        } else if (this.field778 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class444.field6749[class65.method702(62, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class444.field6749[class65.method702(-108, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field516 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field516 && arg4[var22] == super.field516) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field516) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field516 != arg2[var24] && arg2[0] - super.field516 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field516 != arg4[var24] && arg4[0] - super.field516 != arg4[var24]) {
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
                class552 var25 = new class552();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field8006 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field8008 = (byte) (var25.field8008 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (super.field519[arg0 + 1][arg1] == super.field519[arg0][arg1] && super.field519[arg0 + 1][arg1 + 1] == super.field519[arg0][arg1] && super.field519[arg0][arg1 + 1] == super.field519[arg0][arg1]) {
                    var25.field8008 = (byte) (var25.field8008 | 1);
                }
                if (var27 != -1 && (var25.field8008 & 2) == 0 && !this.field784.field2812.method1610(18904, var27).field4117) {
                    var25.field8010 = this.field782[arg0][arg1] - this.field779[arg0][arg1];
                    var25.field8011 = this.field782[arg0 + 1][arg1] - this.field779[arg0 + 1][arg1];
                    var25.field8009 = this.field782[arg0 + 1][arg1 + 1] - this.field779[arg0 + 1][arg1 + 1];
                    var25.field8007 = this.field782[arg0][arg1 + 1] - this.field779[arg0][arg1 + 1];
                    var25.field8015 = (short) var27;
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
                    var25.field8010 = class343.method2338((byte) 115, arg10, method677(arg6[var18] >> 8, this.field782[arg0][arg1] - this.field779[arg0][arg1]), var28);
                    if (var25.field8006 != 0) {
                        var25.field8010 |= 255 - (this.field782[arg0][arg1] - this.field779[arg0][arg1]) << 25;
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
                    var25.field8011 = class343.method2338((byte) 103, arg10, method677(arg6[var19] >> 8, this.field782[arg0 + 1][arg1] - this.field779[arg0 + 1][arg1]), var29);
                    if (var25.field8006 != 0) {
                        var25.field8011 |= 255 - (this.field782[arg0 + 1][arg1] - this.field779[arg0 + 1][arg1]) << 25;
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
                    var25.field8009 = class343.method2338((byte) 88, arg10, method677(arg6[var20] >> 8, this.field782[arg0 + 1][arg1 + 1] - this.field779[arg0 + 1][arg1 + 1]), var30);
                    if (var25.field8006 != 0) {
                        var25.field8009 |= 255 - (this.field782[arg0 + 1][arg1 + 1] - this.field779[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field8007 = class343.method2338((byte) 103, arg10, method677(arg6[var21] >> 8, this.field782[arg0][arg1 + 1] - this.field779[arg0][arg1 + 1]), var31);
                    if (var25.field8006 != 0) {
                        var25.field8007 |= 255 - (this.field782[arg0][arg1 + 1] - this.field779[arg0][arg1 + 1]) << 25;
                    }
                    var25.field8015 = -1;
                }
                if (arg5 != null) {
                    var25.field8016 = (short) arg5[var20];
                    var25.field8012 = (short) arg5[var21];
                    var25.field8014 = (short) arg5[var19];
                    var25.field8013 = (short) arg5[var18];
                }
                this.field766[arg0][arg1] = var25;
            } else {
                class495 var32 = new class495();
                var32.field7225 = (short) arg2.length;
                var32.field7229 = (short) (arg2.length / 3);
                var32.field7223 = new short[var32.field7225];
                var32.field7228 = new short[var32.field7225];
                var32.field7222 = new short[var32.field7225];
                var32.field7227 = new int[var32.field7225];
                if (arg5 != null) {
                    var32.field7226 = new short[var32.field7225];
                }
                for (int var33 = 0; var33 < var32.field7225; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field782[arg0][arg1] - this.field779[arg0][arg1];
                    } else if (var48 == 0 && super.field516 == var49) {
                        var51 = this.field782[arg0][arg1 + 1] - this.field779[arg0][arg1 + 1];
                    } else if (super.field516 == var48 && super.field516 == var49) {
                        var51 = this.field782[arg0 + 1][arg1 + 1] - this.field779[arg0 + 1][arg1 + 1];
                    } else if (super.field516 == var48 && var49 == 0) {
                        var51 = this.field782[arg0 + 1][arg1] - this.field779[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field782[arg0 + 1][arg1] - this.field779[arg0 + 1][arg1]) * var48 + (this.field782[arg0][arg1] - this.field779[arg0][arg1]) * (super.field516 - var48);
                        int var53 = (this.field782[arg0 + 1][arg1 + 1] - this.field779[arg0 + 1][arg1 + 1]) * var48 + (this.field782[arg0][arg1 + 1] - this.field779[arg0][arg1 + 1]) * (super.field516 - var48);
                        var51 = (super.field516 - var49) * var52 + var49 * var53 >> super.field515 * 2;
                    }
                    int var54 = (arg0 << super.field515) + var48;
                    int var55 = (arg1 << super.field515) + var49;
                    var32.field7223[var33] = (short) var48;
                    var32.field7222[var33] = (short) var49;
                    var32.field7228[var33] = (short) (this.method477(-1, var55, var54) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field784.field2812.method1610(18904, arg8[var33]).field4117) {
                        var32.field7227[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field7227[var33] = var51 << 25;
                        } else {
                            var32.field7227[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field7226[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field7227[var33] = class343.method2338((byte) 109, arg10, method677(arg6[var33] >> 8, var51), var56);
                        if (arg7 != null) {
                            var32.field7227[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field7229; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field784.field2812.method1610(18904, arg8[var35 * 3]).field4117) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field7230 = new int[var32.field7229];
                }
                if (var34) {
                    var32.field7224 = new short[var32.field7229];
                    var32.field7221 = new short[var32.field7229];
                }
                for (int var36 = 0; var36 < var32.field7229; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field7230[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field784.field2812.method1610(18904, var42).field4117) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field784.field2812.method1610(18904, var43).field4117) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field784.field2812.method1610(18904, var44).field4117) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field7224[var36] = (short) var44;
                            var32.field7221[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field784.field2812.method1610(18904, var45).field4117) {
                                    var32.field7227[var37] = class444.field6749[class65.method702(85, this.field784.field2812.method1610(18904, var45).field4120 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field784.field2812.method1610(18904, var46).field4117) {
                                    var32.field7227[var38] = class444.field6749[class65.method702(-109, this.field784.field2812.method1610(18904, var46).field4120 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field784.field2812.method1610(18904, var47).field4117) {
                                    var32.field7227[var39] = class444.field6749[class65.method702(-83, this.field784.field2812.method1610(18904, var47).field4120 & 65535) & 65535];
                                }
                            }
                            var32.field7224[var36] = -1;
                        }
                    }
                }
                this.field774[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "(IILha;)Lha;", line = 2291)
    public final class54 method482(int arg0, int arg1, class54 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIIII[[ZLmf;Lwi;[I[I)V", line = 2297)
    private final void method675(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class384 arg8, class431 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field5936;
        this.field784.method334(false);
        arg9.field6558 = false;
        arg9.field6551 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field778[var18][var19] != null) {
                        class648 var20 = this.field778[var18][var19];
                        if (var20.field9095 != -1 && (var20.field9096 & 2) == 0 && var20.field9092 == -1) {
                            int var21 = this.field784.method1120(var20.field9095);
                            arg9.method2729(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class327.method2205(var20.field9090 & 65535, -73, var21), class327.method2205(var20.field9093 & 65535, -110, var21), class327.method2205(var20.field9094 & 65535, -86, var21));
                            arg9.method2729(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class327.method2205(var20.field9091 & 65535, -110, var21), class327.method2205(var20.field9094 & 65535, -80, var21), class327.method2205(var20.field9093 & 65535, -104, var21));
                        } else if (var20.field9092 == -1) {
                            arg9.method2729(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field9090 & 65535, var20.field9093 & 65535, var20.field9094 & 65535);
                            arg9.method2729(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field9091 & 65535, var20.field9094 & 65535, var20.field9093 & 65535);
                        } else {
                            int var22 = var20.field9092;
                            arg9.method2729(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var22, var22, var22);
                            arg9.method2729(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (this.field767[var18][var19] != null) {
                        class297 var23 = this.field767[var18][var19];
                        for (int var24 = 0; var24 < var23.field4646; ++var24) {
                            arg10[var24] = var23.field4648[var24] * var14 / super.field516 + var16;
                            arg11[var24] = var17 - var23.field4642[var24] * var14 / super.field516;
                        }
                        for (int var25 = 0; var25 < var23.field4639; ++var25) {
                            short var26 = var23.field4645[var25];
                            short var27 = var23.field4641[var25];
                            short var28 = var23.field4638[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field4649 != null && var23.field4649[var25] != -1) {
                                int var35 = var23.field4649[var25];
                                arg9.method2729(var32, var33, var34, var29, var30, var31, 100, 100, 100, class327.method2205(var23.field4644[var26], -128, var35), class327.method2205(var23.field4644[var27], -114, var35), class327.method2205(var23.field4644[var28], -121, var35));
                            } else if (var23.field4650 != null && var23.field4650[var25] != -1) {
                                int var36 = this.field784.method1120(var23.field4650[var25]);
                                arg9.method2729(var32, var33, var34, var29, var30, var31, 100, 100, 100, class327.method2205(var23.field4644[var26], -66, var36), class327.method2205(var23.field4644[var27], -83, var36), class327.method2205(var23.field4644[var28], -103, var36));
                            } else {
                                int var37 = var23.field4640[var25];
                                arg9.method2729(var32, var33, var34, var29, var30, var31, 100, 100, 100, class327.method2205(var23.field4644[var26], -66, var37), class327.method2205(var23.field4644[var27], -107, var37), class327.method2205(var23.field4644[var28], -81, var37));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field6558 = true;
        this.field784.method334(var15);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lwk;IIII[[I[[II)V", line = 2434)
    public class60(class128 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field784 = arg0;
        this.field771 = arg2;
        this.field782 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field784.field2090 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field784.field2095 * var18 + this.field784.field2097 * var17 + this.field784.field2080 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field782[var11][var10] = (byte) var20;
            }
        }
        this.field779 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III[[ZZ)V", line = 2486)
    public final void method485(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class243 var6 = this.field784.field2082;
        this.field777 = -1;
        this.field772 = var6.field3881;
        this.field769 = var6.field3876;
        this.field780 = var6.field3861;
        this.field770 = var6.field3852;
        this.field773 = var6.field3856;
        this.field765 = var6.field3862;
        this.field775 = var6.field3869;
        this.field768 = var6.field3851;
        this.field776 = var6.field3873;
        this.field783 = var6.field3882;
        this.field781 = var6.field3877;
        this.field785 = var6.field3880;
        for (int var7 = 0; var7 < arg2 + arg2; ++var7) {
            for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - arg2 + var7;
                    int var10 = arg1 - arg2 + var8;
                    if (var9 >= 0 && var9 < super.field510 && var10 >= 0 && var10 < super.field513) {
                        this.method489(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "DA", descriptor = "(Lha;IIIIZ)V", line = 2530)
    public final void method475(class54 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII[[Z)V", line = 2534)
    public final void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class384 var9 = this.field784.method1122(Thread.currentThread());
        class431 var10 = var9.field5969;
        var10.field6568 = 0;
        var10.field6556 = false;
        this.field784.method136();
        if (this.field766 != null) {
            this.method674(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field5980, var9.field5957);
        } else {
            if (this.field778 != null) {
                this.method675(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field5980, var9.field5957);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)Z", line = 2550)
    private final boolean method676(int arg0) {
        if ((this.field771 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)I", line = 2567)
    private static final int method677(int arg0, int arg1) {
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
}
