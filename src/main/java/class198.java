import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class198 extends class426 {

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Lsq;")
    private class108 field2890;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    private int field2897;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[[I")
    public int[][] field2880;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    private int field2889;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    private int field2899;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "[[B")
    private byte[][] field2888;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "[[B")
    private byte[][] field2886;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    private int field2878;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    private int field2879;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    private int field2882;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    private int field2883;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    private int field2884;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    private int field2885;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    private int field2887;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    private int field2891;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    private int field2893;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    private int field2894;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    private int field2895;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    private int field2898;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "[[Ll;")
    private class16[][] field2896;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "[[Lnb;")
    private class181[][] field2892;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[[Lcr;")
    private class372[][] field2881;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "[[Lmp;")
    private class493[][] field2900;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII[[ZLqh;[I[I)V")
    private final void method1203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class47 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field652 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field2900[var16][var17] != null) {
                        class493 var18 = this.field2900[var16][var17];
                        if (var18.field6947 != -1 && (var18.field6939 & 2) == 0 && var18.field6940 == 0) {
                            int var19 = this.field2890.method671(var18.field6947);
                            arg8.method299(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class40.method262(var19, var18.field6949, 83), class40.method262(var19, var18.field6945, -117), class40.method262(var19, var18.field6943, 39));
                            arg8.method299(var15, var15, var15 - var13, var14, var13 + var14, var14, class40.method262(var19, var18.field6942, 123), class40.method262(var19, var18.field6943, 122), class40.method262(var19, var18.field6945, -111));
                        } else if (var18.field6940 == 0) {
                            arg8.method307(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field6949, var18.field6945, var18.field6943);
                            arg8.method307(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field6942, var18.field6943, var18.field6945);
                        } else {
                            int var20 = var18.field6940;
                            arg8.method307(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class437.method2573(var20, var18.field6949 & -16777216, 1178896940), class437.method2573(var20, var18.field6945 & -16777216, 1178896940), class437.method2573(var20, var18.field6943 & -16777216, 1178896940));
                            arg8.method307(var15, var15, var15 - var13, var14, var13 + var14, var14, class437.method2573(var20, var18.field6942 & -16777216, 1178896940), class437.method2573(var20, var18.field6943 & -16777216, 1178896940), class437.method2573(var20, var18.field6945 & -16777216, 1178896940));
                        }
                    } else if (this.field2892[var16][var17] != null) {
                        class181 var21 = this.field2892[var16][var17];
                        for (int var22 = 0; var22 < var21.field2634; ++var22) {
                            arg9[var22] = (var21.field2627[var22] - this.field2889 * var16) * var13 / this.field2889 + var14;
                            arg10[var22] = var15 - (var21.field2629[var22] - this.field2889 * var17) * var13 / this.field2889;
                        }
                        for (int var23 = 0; var23 < var21.field2631; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field2625 != null && var21.field2625[var23] != 0 && (var21.field2626 == null || var21.field2626 != null && var21.field2626[var23] == -1)) {
                                int var33 = var21.field2625[var23];
                                arg8.method307(var30, var31, var32, var27, var28, var29, class437.method2573(var33, -16777216 - (var21.field2630[var24] & -16777216), 1178896940), class437.method2573(var33, -16777216 - (var21.field2630[var25] & -16777216), 1178896940), class437.method2573(var33, -16777216 - (var21.field2630[var26] & -16777216), 1178896940));
                            } else if (var21.field2626 != null && var21.field2626[var23] != -1) {
                                int var34 = this.field2890.method671(var21.field2626[var23]);
                                arg8.method299(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method307(var30, var31, var32, var27, var28, var29, var21.field2630[var24], var21.field2630[var25], var21.field2630[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field652 = true;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)I")
    private static final int method1204(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILqh;[I[I[I)V")
    private final void method1205(int arg0, int arg1, class47 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class16 var7 = this.field2896[arg0][arg1];
        if (var7 != null) {
            if ((var7.field203 & 2) == 0) {
                int var8 = this.field2889 * arg0;
                int var9 = this.field2889 + var8;
                int var10 = this.field2889 * arg1;
                int var11 = this.field2889 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field203 & 1) != 0) {
                    int var12 = this.field2880[arg0][arg1];
                    int var13 = this.field2884 * var12;
                    var14 = (this.field2879 * var10 + this.field2891 * var8 + var13 >> 15) + this.field2885;
                    if (var14 <= this.field2890.field1355) {
                        return;
                    }
                    var15 = (this.field2879 * var10 + this.field2891 * var9 + var13 >> 15) + this.field2885;
                    if (var15 <= this.field2890.field1355) {
                        return;
                    }
                    int var16 = (this.field2879 * var11 + this.field2891 * var9 + var13 >> 15) + this.field2885;
                    if (var16 <= this.field2890.field1355) {
                        return;
                    }
                    var17 = (this.field2879 * var11 + this.field2891 * var8 + var13 >> 15) + this.field2885;
                    if (var17 <= this.field2890.field1355) {
                        return;
                    }
                    int var18 = this.field2878 * var12;
                    int var19 = this.field2883 * var12;
                    var20 = (this.field2893 * var10 + this.field2887 * var8 + var18 >> 15) + this.field2894;
                    var21 = this.field2890.field1365 * var20 / var14 + arg2.field651;
                    var22 = (this.field2895 * var10 + this.field2898 * var8 + var19 >> 15) + this.field2882;
                    var23 = this.field2890.field1380 * var22 / var14 + arg2.field656;
                    var24 = (this.field2893 * var10 + this.field2887 * var9 + var18 >> 15) + this.field2894;
                    var25 = this.field2890.field1365 * var24 / var15 + arg2.field651;
                    var26 = (this.field2895 * var10 + this.field2898 * var9 + var19 >> 15) + this.field2882;
                    var27 = this.field2890.field1380 * var26 / var15 + arg2.field656;
                    int var28 = (this.field2893 * var11 + this.field2887 * var9 + var18 >> 15) + this.field2894;
                    var29 = this.field2890.field1365 * var28 / var16 + arg2.field651;
                    int var30 = (this.field2895 * var11 + this.field2898 * var9 + var19 >> 15) + this.field2882;
                    var31 = this.field2890.field1380 * var30 / var16 + arg2.field656;
                    var32 = (this.field2893 * var11 + this.field2887 * var8 + var18 >> 15) + this.field2894;
                    var33 = this.field2890.field1365 * var32 / var17 + arg2.field651;
                    var34 = (this.field2895 * var11 + this.field2898 * var8 + var19 >> 15) + this.field2882;
                    var35 = this.field2890.field1380 * var34 / var17 + arg2.field656;
                } else {
                    int var36 = this.field2880[arg0][arg1];
                    int var37 = this.field2880[arg0 + 1][arg1];
                    int var38 = this.field2880[arg0 + 1][arg1 + 1];
                    int var39 = this.field2880[arg0][arg1 + 1];
                    var14 = (this.field2879 * var10 + this.field2891 * var8 + this.field2884 * var36 >> 15) + this.field2885;
                    if (var14 <= this.field2890.field1355) {
                        return;
                    }
                    var15 = (this.field2879 * var10 + this.field2891 * var9 + this.field2884 * var37 >> 15) + this.field2885;
                    if (var15 <= this.field2890.field1355) {
                        return;
                    }
                    int var40 = (this.field2879 * var11 + this.field2891 * var9 + this.field2884 * var38 >> 15) + this.field2885;
                    if (var40 <= this.field2890.field1355) {
                        return;
                    }
                    var17 = (this.field2879 * var11 + this.field2891 * var8 + this.field2884 * var39 >> 15) + this.field2885;
                    if (var17 <= this.field2890.field1355) {
                        return;
                    }
                    var20 = (this.field2893 * var10 + this.field2887 * var8 + this.field2878 * var36 >> 15) + this.field2894;
                    var21 = this.field2890.field1365 * var20 / var14 + arg2.field651;
                    var22 = (this.field2895 * var10 + this.field2898 * var8 + this.field2883 * var36 >> 15) + this.field2882;
                    var23 = this.field2890.field1380 * var22 / var14 + arg2.field656;
                    var24 = (this.field2893 * var10 + this.field2887 * var9 + this.field2878 * var37 >> 15) + this.field2894;
                    var25 = this.field2890.field1365 * var24 / var15 + arg2.field651;
                    var26 = (this.field2895 * var10 + this.field2898 * var9 + this.field2883 * var37 >> 15) + this.field2882;
                    var27 = this.field2890.field1380 * var26 / var15 + arg2.field656;
                    int var41 = (this.field2893 * var11 + this.field2887 * var9 + this.field2878 * var38 >> 15) + this.field2894;
                    var29 = this.field2890.field1365 * var41 / var40 + arg2.field651;
                    int var42 = (this.field2895 * var11 + this.field2898 * var9 + this.field2883 * var38 >> 15) + this.field2882;
                    var31 = this.field2890.field1380 * var42 / var40 + arg2.field656;
                    var32 = (this.field2893 * var11 + this.field2887 * var8 + this.field2878 * var39 >> 15) + this.field2894;
                    var33 = this.field2890.field1365 * var32 / var17 + arg2.field651;
                    var34 = (this.field2895 * var11 + this.field2898 * var8 + this.field2883 * var39 >> 15) + this.field2882;
                    var35 = this.field2890.field1380 * var34 / var17 + arg2.field656;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field660 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field655 || var33 > arg2.field655 || var25 > arg2.field655;
                    if (var7.field205 >= 0) {
                        if (this.method1207(this.field2890.field4432.method703(12095, var7.field205).field4105)) {
                            arg2.field657 = 100;
                        }
                        arg2.method301(var31, var35, var27, var29, var33, var25, var7.field206 & 65535, var7.field208 & 65535, var7.field204 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field205);
                        arg2.field657 = 0;
                    } else {
                        arg2.method299(var31, var35, var27, var29, var33, var25, var7.field206 & 65535, var7.field208 & 65535, var7.field204 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field660 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field655 || var25 > arg2.field655 || var33 > arg2.field655;
                    if (var7.field205 >= 0) {
                        if (this.method1207(this.field2890.field4432.method703(12095, var7.field205).field4105)) {
                            arg2.field657 = 100;
                        }
                        arg2.method301(var23, var27, var35, var21, var25, var33, var7.field207 & 65535, var7.field204 & 65535, var7.field208 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field205);
                        arg2.field657 = 0;
                        return;
                    }
                    arg2.method299(var23, var27, var35, var21, var25, var33, var7.field207 & 65535, var7.field204 & 65535, var7.field208 & 65535);
                }
            }
        } else {
            class372 var43 = this.field2881[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field5365; ++var44) {
                    int var84 = var43.field5369[var44];
                    int var85 = var43.field5367[var44];
                    int var86 = var43.field5370[var44];
                    int var87 = (this.field2879 * var86 + this.field2891 * var84 + this.field2884 * var85 >> 15) + this.field2885;
                    if (var87 <= this.field2890.field1355) {
                        return;
                    }
                    int var88 = (this.field2893 * var86 + this.field2887 * var84 + this.field2878 * var85 >> 15) + this.field2894;
                    int var89 = (this.field2895 * var86 + this.field2898 * var84 + this.field2883 * var85 >> 15) + this.field2882;
                    arg3[var44] = this.field2890.field1365 * var88 / var87 + arg2.field651;
                    arg4[var44] = this.field2890.field1380 * var89 / var87 + arg2.field656;
                }
                if (var43.field5368 != null) {
                    int var45 = this.field2880[arg0][arg1];
                    int var46 = this.field2880[arg0 + 1][arg1];
                    int var47 = this.field2880[arg0][arg1 + 1];
                    int var48 = this.field2889 * arg0;
                    int var49 = this.field2889 + var48;
                    int var50 = this.field2889 * arg1;
                    int var51 = this.field2889 + var50;
                    int var52 = (this.field2893 * var50 + this.field2887 * var48 + this.field2878 * var45 >> 15) + this.field2894;
                    int var53 = (this.field2895 * var50 + this.field2898 * var48 + this.field2883 * var45 >> 15) + this.field2882;
                    int var54 = (this.field2879 * var50 + this.field2891 * var48 + this.field2884 * var45 >> 15) + this.field2885;
                    int var55 = (this.field2893 * var50 + this.field2887 * var49 + this.field2878 * var46 >> 15) + this.field2894;
                    int var56 = (this.field2895 * var50 + this.field2898 * var49 + this.field2883 * var46 >> 15) + this.field2882;
                    int var57 = (this.field2879 * var50 + this.field2891 * var49 + this.field2884 * var46 >> 15) + this.field2885;
                    int var58 = (this.field2893 * var51 + this.field2887 * var48 + this.field2878 * var47 >> 15) + this.field2894;
                    int var59 = (this.field2895 * var51 + this.field2898 * var48 + this.field2883 * var47 >> 15) + this.field2882;
                    int var60 = (this.field2879 * var51 + this.field2891 * var48 + this.field2884 * var47 >> 15) + this.field2885;
                    for (int var61 = 0; var61 < var43.field5366; ++var61) {
                        short var62 = var43.field5358[var61];
                        short var63 = var43.field5361[var61];
                        short var64 = var43.field5359[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field660 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field655 || var66 > arg2.field655 || var67 > arg2.field655;
                            short var71 = var43.field5368[var61];
                            if (var71 != -1) {
                                if (this.method1207(this.field2890.field4432.method703(12095, var71).field4105)) {
                                    arg2.field657 = 100;
                                }
                                arg2.method301(var68, var69, var70, var65, var66, var67, var43.field5362[var62], var43.field5362[var63], var43.field5362[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field657 = 0;
                            } else {
                                int var72 = var43.field5363[var61];
                                if (var72 != -1) {
                                    arg2.method299(var68, var69, var70, var65, var66, var67, class40.method262(var72, var43.field5362[var62], -112), class40.method262(var72, var43.field5362[var63], -126), class40.method262(var72, var43.field5362[var64], 44));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field5366; ++var73) {
                    short var74 = var43.field5358[var73];
                    short var75 = var43.field5361[var73];
                    short var76 = var43.field5359[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field5363[var73];
                        if (var83 != -1) {
                            arg2.field660 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field655 || var78 > arg2.field655 || var79 > arg2.field655;
                            arg2.method299(var80, var81, var82, var77, var78, var79, class40.method262(var83, var43.field5362[var74], -108), class40.method262(var83, var43.field5362[var75], 73), class40.method262(var83, var43.field5362[var76], 24));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1206(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field2900 == null) {
            this.field2900 = new class493[super.field5967][super.field5970];
            this.field2892 = new class181[super.field5967][super.field5970];
        } else if (this.field2896 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class490.field6909[class385.method2324(-1888289119, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class490.field6909[class385.method2324(-1888289119, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == this.field2889 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == this.field2889 && arg4[var22] == this.field2889) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == this.field2889) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + this.field2889 != arg2[var24] && arg2[0] - this.field2889 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + this.field2889 != arg4[var24] && arg4[0] - this.field2889 != arg4[var24]) {
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
                class493 var25 = new class493();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field6940 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field6939 = (byte) (var25.field6939 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field2880[arg0 + 1][arg1] == this.field2880[arg0][arg1] && this.field2880[arg0 + 1][arg1 + 1] == this.field2880[arg0][arg1] && this.field2880[arg0][arg1 + 1] == this.field2880[arg0][arg1]) {
                    var25.field6939 = (byte) (var25.field6939 | 1);
                }
                if (var27 != -1 && (var25.field6939 & 2) == 0 && !this.field2890.field4432.method703(12095, var27).field4113) {
                    var25.field6942 = this.field2888[arg0][arg1] - this.field2886[arg0][arg1];
                    var25.field6943 = this.field2888[arg0 + 1][arg1] - this.field2886[arg0 + 1][arg1];
                    var25.field6949 = this.field2888[arg0 + 1][arg1 + 1] - this.field2886[arg0 + 1][arg1 + 1];
                    var25.field6945 = this.field2888[arg0][arg1 + 1] - this.field2886[arg0][arg1 + 1];
                    var25.field6947 = (short) var27;
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
                    var25.field6942 = class483.method2821(method1204(arg6[var18] >> 8, this.field2888[arg0][arg1] - this.field2886[arg0][arg1]), (byte) 10, var28, arg10);
                    if (var25.field6940 != 0) {
                        var25.field6942 |= 255 - (this.field2888[arg0][arg1] - this.field2886[arg0][arg1]) << 25;
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
                    var25.field6943 = class483.method2821(method1204(arg6[var19] >> 8, this.field2888[arg0 + 1][arg1] - this.field2886[arg0 + 1][arg1]), (byte) 10, var29, arg10);
                    if (var25.field6940 != 0) {
                        var25.field6943 |= 255 - (this.field2888[arg0 + 1][arg1] - this.field2886[arg0 + 1][arg1]) << 25;
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
                    var25.field6949 = class483.method2821(method1204(arg6[var20] >> 8, this.field2888[arg0 + 1][arg1 + 1] - this.field2886[arg0 + 1][arg1 + 1]), (byte) 10, var30, arg10);
                    if (var25.field6940 != 0) {
                        var25.field6949 |= 255 - (this.field2888[arg0 + 1][arg1 + 1] - this.field2886[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field6945 = class483.method2821(method1204(arg6[var21] >> 8, this.field2888[arg0][arg1 + 1] - this.field2886[arg0][arg1 + 1]), (byte) 10, var31, arg10);
                    if (var25.field6940 != 0) {
                        var25.field6945 |= 255 - (this.field2888[arg0][arg1 + 1] - this.field2886[arg0][arg1 + 1]) << 25;
                    }
                    var25.field6947 = -1;
                }
                if (arg5 != null) {
                    var25.field6948 = (short) arg5[var20];
                    var25.field6941 = (short) arg5[var21];
                    var25.field6944 = (short) arg5[var19];
                    var25.field6946 = (short) arg5[var18];
                }
                this.field2900[arg0][arg1] = var25;
            } else {
                class181 var32 = new class181();
                var32.field2634 = (short) arg2.length;
                var32.field2631 = (short) (arg2.length / 3);
                var32.field2627 = new short[var32.field2634];
                var32.field2633 = new short[var32.field2634];
                var32.field2629 = new short[var32.field2634];
                var32.field2630 = new int[var32.field2634];
                if (arg5 != null) {
                    var32.field2632 = new short[var32.field2634];
                }
                for (int var33 = 0; var33 < var32.field2634; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field2888[arg0][arg1] - this.field2886[arg0][arg1];
                    } else if (var48 == 0 && this.field2889 == var49) {
                        var51 = this.field2888[arg0][arg1 + 1] - this.field2886[arg0][arg1 + 1];
                    } else if (this.field2889 == var48 && this.field2889 == var49) {
                        var51 = this.field2888[arg0 + 1][arg1 + 1] - this.field2886[arg0 + 1][arg1 + 1];
                    } else if (this.field2889 == var48 && var49 == 0) {
                        var51 = this.field2888[arg0 + 1][arg1] - this.field2886[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field2888[arg0 + 1][arg1] - this.field2886[arg0 + 1][arg1]) * var48 + (this.field2888[arg0][arg1] - this.field2886[arg0][arg1]) * (this.field2889 - var48);
                        int var53 = (this.field2888[arg0 + 1][arg1 + 1] - this.field2886[arg0 + 1][arg1 + 1]) * var48 + (this.field2888[arg0][arg1 + 1] - this.field2886[arg0][arg1 + 1]) * (this.field2889 - var48);
                        var51 = (this.field2889 - var49) * var52 + var49 * var53 >> this.field2899 * 2;
                    }
                    short var54 = (short) ((arg0 << this.field2899) + var48);
                    short var55 = (short) ((arg1 << this.field2899) + var49);
                    var32.field2627[var33] = var54;
                    var32.field2629[var33] = var55;
                    var32.field2633[var33] = (short) (this.method1209(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field2890.field4432.method703(12095, arg8[var33]).field4113) {
                        var32.field2630[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field2630[var33] = var51 << 25;
                        } else {
                            var32.field2630[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field2632[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field2630[var33] = class483.method2821(method1204(arg6[var33] >> 8, var51), (byte) 10, var56, arg10);
                        if (arg7 != null) {
                            var32.field2630[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field2631; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field2890.field4432.method703(12095, arg8[var35 * 3]).field4113) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field2625 = new int[var32.field2631];
                }
                if (var34) {
                    var32.field2626 = new short[var32.field2631];
                    var32.field2628 = new short[var32.field2631];
                }
                for (int var36 = 0; var36 < var32.field2631; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field2625[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field2890.field4432.method703(12095, var42).field4113) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field2890.field4432.method703(12095, var43).field4113) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field2890.field4432.method703(12095, var44).field4113) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field2626[var36] = (short) var44;
                            var32.field2628[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field2890.field4432.method703(12095, var45).field4113) {
                                    var32.field2630[var37] = class490.field6909[class385.method2324(-1888289119, this.field2890.field4432.method703(12095, var45).field4111 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field2890.field4432.method703(12095, var46).field4113) {
                                    var32.field2630[var38] = class490.field6909[class385.method2324(-1888289119, this.field2890.field4432.method703(12095, var46).field4111 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field2890.field4432.method703(12095, var47).field4113) {
                                    var32.field2630[var39] = class490.field6909[class385.method2324(-1888289119, this.field2890.field4432.method703(12095, var47).field4111 & 65535) & 65535];
                                }
                            }
                            var32.field2626[var36] = -1;
                        }
                    }
                }
                this.field2892[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)Z")
    private final boolean method1207(int arg0) {
        if ((this.field2897 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIZLqh;[I[I[I)V")
    private final void method1208(int arg0, int arg1, boolean arg2, class47 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class493 var8 = this.field2900[arg0][arg1];
        if (var8 != null) {
            if ((var8.field6939 & 2) == 0) {
                int var9 = this.field2889 * arg0;
                int var10 = this.field2889 + var9;
                int var11 = this.field2889 * arg1;
                int var12 = this.field2889 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field6939 & 1) != 0 && !arg2) {
                    int var17 = this.field2880[arg0][arg1];
                    int var18 = this.field2884 * var17;
                    var19 = (this.field2879 * var11 + this.field2891 * var9 + var18 >> 15) + this.field2885;
                    if (var19 <= this.field2890.field1355) {
                        return;
                    }
                    var20 = (this.field2879 * var11 + this.field2891 * var10 + var18 >> 15) + this.field2885;
                    if (var20 <= this.field2890.field1355) {
                        return;
                    }
                    var21 = (this.field2879 * var12 + this.field2891 * var10 + var18 >> 15) + this.field2885;
                    if (var21 <= this.field2890.field1355) {
                        return;
                    }
                    var22 = (this.field2879 * var12 + this.field2891 * var9 + var18 >> 15) + this.field2885;
                    if (var22 <= this.field2890.field1355) {
                        return;
                    }
                    if (this.field2890.field1354) {
                        int var23 = var19 - this.field2890.field1381;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field2890.field1381;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field2890.field1381;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field2890.field1381;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field2878 * var17;
                    int var28 = this.field2883 * var17;
                    var29 = (this.field2893 * var11 + this.field2887 * var9 + var27 >> 15) + this.field2894;
                    var30 = this.field2890.field1365 * var29 / var19 + arg3.field651;
                    var31 = (this.field2895 * var11 + this.field2898 * var9 + var28 >> 15) + this.field2882;
                    var32 = this.field2890.field1380 * var31 / var19 + arg3.field656;
                    var33 = (this.field2893 * var11 + this.field2887 * var10 + var27 >> 15) + this.field2894;
                    var34 = this.field2890.field1365 * var33 / var20 + arg3.field651;
                    var35 = (this.field2895 * var11 + this.field2898 * var10 + var28 >> 15) + this.field2882;
                    var36 = this.field2890.field1380 * var35 / var20 + arg3.field656;
                    var37 = (this.field2893 * var12 + this.field2887 * var10 + var27 >> 15) + this.field2894;
                    var38 = this.field2890.field1365 * var37 / var21 + arg3.field651;
                    var39 = (this.field2895 * var12 + this.field2898 * var10 + var28 >> 15) + this.field2882;
                    var40 = this.field2890.field1380 * var39 / var21 + arg3.field656;
                    var41 = (this.field2893 * var12 + this.field2887 * var9 + var27 >> 15) + this.field2894;
                    var42 = this.field2890.field1365 * var41 / var22 + arg3.field651;
                    var43 = (this.field2895 * var12 + this.field2898 * var9 + var28 >> 15) + this.field2882;
                    var44 = this.field2890.field1380 * var43 / var22 + arg3.field656;
                } else {
                    int var45 = this.field2880[arg0][arg1];
                    int var46 = this.field2880[arg0 + 1][arg1];
                    int var47 = this.field2880[arg0 + 1][arg1 + 1];
                    int var48 = this.field2880[arg0][arg1 + 1];
                    var19 = (this.field2879 * var11 + this.field2891 * var9 + this.field2884 * var45 >> 15) + this.field2885;
                    if (var19 <= this.field2890.field1355) {
                        return;
                    }
                    var20 = (this.field2879 * var11 + this.field2891 * var10 + this.field2884 * var46 >> 15) + this.field2885;
                    if (var20 <= this.field2890.field1355) {
                        return;
                    }
                    var21 = (this.field2879 * var12 + this.field2891 * var10 + this.field2884 * var47 >> 15) + this.field2885;
                    if (var21 <= this.field2890.field1355) {
                        return;
                    }
                    var22 = (this.field2879 * var12 + this.field2891 * var9 + this.field2884 * var48 >> 15) + this.field2885;
                    if (var22 <= this.field2890.field1355) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field2890.field1381;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field6946 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field2890.field1381;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field6944 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field2890.field1381;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field6948 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field2890.field1381;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field6941 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field2890.field1354) {
                        int var57 = var19 - this.field2890.field1381;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field2890.field1381;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field2890.field1381;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field2890.field1381;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field2893 * var11 + this.field2887 * var9 + this.field2878 * var45 >> 15) + this.field2894;
                    var30 = this.field2890.field1365 * var29 / var19 + arg3.field651;
                    var31 = (this.field2895 * var11 + this.field2898 * var9 + this.field2883 * var45 >> 15) + this.field2882;
                    var32 = this.field2890.field1380 * var31 / var19 + arg3.field656;
                    var33 = (this.field2893 * var11 + this.field2887 * var10 + this.field2878 * var46 >> 15) + this.field2894;
                    var34 = this.field2890.field1365 * var33 / var20 + arg3.field651;
                    var35 = (this.field2895 * var11 + this.field2898 * var10 + this.field2883 * var46 >> 15) + this.field2882;
                    var36 = this.field2890.field1380 * var35 / var20 + arg3.field656;
                    var37 = (this.field2893 * var12 + this.field2887 * var10 + this.field2878 * var47 >> 15) + this.field2894;
                    var38 = this.field2890.field1365 * var37 / var21 + arg3.field651;
                    var39 = (this.field2895 * var12 + this.field2898 * var10 + this.field2883 * var47 >> 15) + this.field2882;
                    var40 = this.field2890.field1380 * var39 / var21 + arg3.field656;
                    var41 = (this.field2893 * var12 + this.field2887 * var9 + this.field2878 * var48 >> 15) + this.field2894;
                    var42 = this.field2890.field1365 * var41 / var22 + arg3.field651;
                    var43 = (this.field2895 * var12 + this.field2898 * var9 + this.field2883 * var48 >> 15) + this.field2882;
                    var44 = this.field2890.field1380 * var43 / var22 + arg3.field656;
                }
                boolean var61 = var8.field6947 != -1 && this.method1207(this.field2890.field4432.method703(12095, var8.field6947).field4105);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field660 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field655 || var42 > arg3.field655 || var34 > arg3.field655;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field657 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field6947 >= 0) {
                                arg3.method305(var40, var44, var36, var38, var42, var34, this.field2890.field1364, var15, var16, var14, var8.field6949, var8.field6945, var8.field6943, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6947);
                            } else {
                                arg3.method307(var40, var44, var36, var38, var42, var34, class437.method2573(var8.field6949, var15 << 24 | this.field2890.field1364, 1178896940), class437.method2573(var8.field6945, var16 << 24 | this.field2890.field1364, 1178896940), class437.method2573(var8.field6943, var14 << 24 | this.field2890.field1364, 1178896940));
                            }
                        } else if (var8.field6947 >= 0) {
                            arg3.method301(var40, var44, var36, var38, var42, var34, var8.field6949, var8.field6945, var8.field6943, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field6947);
                        } else {
                            arg3.method307(var40, var44, var36, var38, var42, var34, var8.field6949, var8.field6945, var8.field6943);
                        }
                        arg3.field657 = 0;
                    } else {
                        arg3.method306(var40, var44, var36, var38, var42, var34, this.field2890.field1364);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field660 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field655 || var34 > arg3.field655 || var42 > arg3.field655;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field657 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field6947 >= 0) {
                                arg3.method305(var32, var36, var44, var30, var34, var42, this.field2890.field1364, var13, var14, var16, var8.field6942, var8.field6943, var8.field6945, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6947);
                            } else {
                                arg3.method307(var32, var36, var44, var30, var34, var42, class437.method2573(var8.field6942, var13 << 24 | this.field2890.field1364, 1178896940), class437.method2573(var8.field6943, var14 << 24 | this.field2890.field1364, 1178896940), class437.method2573(var8.field6945, var16 << 24 | this.field2890.field1364, 1178896940));
                            }
                        } else if (var8.field6947 >= 0) {
                            arg3.method301(var32, var36, var44, var30, var34, var42, var8.field6942, var8.field6943, var8.field6945, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field6947);
                        } else {
                            arg3.method307(var32, var36, var44, var30, var34, var42, var8.field6942, var8.field6943, var8.field6945);
                        }
                        arg3.field657 = 0;
                        return;
                    }
                    arg3.method306(var32, var36, var44, var30, var34, var42, this.field2890.field1364);
                }
            }
        } else {
            class181 var64 = this.field2892[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field2634; ++var65) {
                    short var105 = var64.field2627[var65];
                    int var106 = var64.field2633[var65];
                    short var107 = var64.field2629[var65];
                    int var108 = (this.field2879 * var107 + this.field2891 * var105 + this.field2884 * var106 >> 15) + this.field2885;
                    if (var108 <= this.field2890.field1355) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field2890.field1381;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field2632[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field2890.field1354) {
                        int var111 = var108 - this.field2890.field1381;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field2893 * var107 + this.field2887 * var105 + this.field2878 * var106 >> 15) + this.field2894;
                    int var113 = (this.field2895 * var107 + this.field2898 * var105 + this.field2883 * var106 >> 15) + this.field2882;
                    arg4[var65] = this.field2890.field1365 * var112 / var108 + arg3.field651;
                    arg5[var65] = this.field2890.field1380 * var113 / var108 + arg3.field656;
                }
                if (var64.field2626 != null) {
                    int var66 = this.field2880[arg0][arg1];
                    int var67 = this.field2880[arg0 + 1][arg1];
                    int var68 = this.field2880[arg0][arg1 + 1];
                    int var69 = this.field2889 * arg0;
                    int var70 = this.field2889 + var69;
                    int var71 = this.field2889 * arg1;
                    int var72 = this.field2889 + var71;
                    int var73 = (this.field2893 * var71 + this.field2887 * var69 + this.field2878 * var66 >> 15) + this.field2894;
                    int var74 = (this.field2895 * var71 + this.field2898 * var69 + this.field2883 * var66 >> 15) + this.field2882;
                    int var75 = (this.field2879 * var71 + this.field2891 * var69 + this.field2884 * var66 >> 15) + this.field2885;
                    int var76 = (this.field2893 * var71 + this.field2887 * var70 + this.field2878 * var67 >> 15) + this.field2894;
                    int var77 = (this.field2895 * var71 + this.field2898 * var70 + this.field2883 * var67 >> 15) + this.field2882;
                    int var78 = (this.field2879 * var71 + this.field2891 * var70 + this.field2884 * var67 >> 15) + this.field2885;
                    int var79 = (this.field2893 * var72 + this.field2887 * var69 + this.field2878 * var68 >> 15) + this.field2894;
                    int var80 = (this.field2895 * var72 + this.field2898 * var69 + this.field2883 * var68 >> 15) + this.field2882;
                    int var81 = (this.field2879 * var72 + this.field2891 * var69 + this.field2884 * var68 >> 15) + this.field2885;
                    for (int var82 = 0; var82 < var64.field2631; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field660 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field655 || var87 > arg3.field655 || var88 > arg3.field655;
                            short var93 = var64.field2626[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method1207(this.field2890.field4432.method703(12095, var93).field4105)) {
                                    arg3.field657 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method305(var89, var90, var91, var86, var87, var88, this.field2890.field1364, arg6[var83], arg6[var84], arg6[var85], var64.field2630[var83], var64.field2630[var84], var64.field2630[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field2630[var83] & 16777215) != 0) {
                                        arg3.method307(var89, var90, var91, var86, var87, var88, class437.method2573(var64.field2630[var83], arg6[var83] << 24 | this.field2890.field1364, 1178896940), class437.method2573(var64.field2630[var84], arg6[var84] << 24 | this.field2890.field1364, 1178896940), class437.method2573(var64.field2630[var85], arg6[var85] << 24 | this.field2890.field1364, 1178896940));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method301(var89, var90, var91, var86, var87, var88, var64.field2630[var83], var64.field2630[var84], var64.field2630[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field2630[var83] & 16777215) != 0) {
                                    arg3.method307(var89, var90, var91, var86, var87, var88, var64.field2630[var83], var64.field2630[var84], var64.field2630[var85]);
                                }
                                arg3.field657 = 0;
                            } else {
                                arg3.method306(var89, var90, var91, var86, var87, var88, this.field2890.field1364);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field2631; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field660 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field655 || var99 > arg3.field655 || var100 > arg3.field655;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field2630[var95] & 16777215) != 0) {
                                    arg3.method307(var101, var102, var103, var98, var99, var100, class483.method2821(var64.field2630[var95], (byte) 10, arg6[var95], this.field2890.field1364), class483.method2821(var64.field2630[var96], (byte) 10, arg6[var96], this.field2890.field1364), class483.method2821(var64.field2630[var97], (byte) 10, arg6[var97], this.field2890.field1364));
                                }
                            } else if ((var64.field2630[var95] & 16777215) != 0) {
                                arg3.method307(var101, var102, var103, var98, var99, var100, var64.field2630[var95], var64.field2630[var96], var64.field2630[var97]);
                            }
                        } else {
                            arg3.method306(var101, var102, var103, var98, var99, var100, this.field2890.field1364);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)I")
    public final int method1209(int arg0, int arg1) {
        int var3 = arg0 >> this.field2899;
        int var4 = arg1 >> this.field2899;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field5967 - 1 && var4 <= super.field5970 - 1) {
            int var5 = arg0 & this.field2889 - 1;
            int var6 = arg1 & this.field2889 - 1;
            int var7 = (this.field2889 - var5) * this.field2880[var3][var4] + this.field2880[var3 + 1][var4] * var5 >> this.field2899;
            int var8 = (this.field2889 - var5) * this.field2880[var3][var4 + 1] + this.field2880[var3 + 1][var4 + 1] * var5 >> this.field2899;
            return (this.field2889 - var6) * var7 + var6 * var8 >> this.field2899;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Ltm;IIIIZ)Z")
    public final boolean method1210(class242 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Leo;[I)V")
    public final void method1211(class178 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public final void method1212(int arg0, int arg1, int arg2) {
        if (this.field2886[arg0][arg1] < arg2) {
            this.field2886[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class148 var9 = this.field2890.method638(Thread.currentThread());
        class47 var10 = var9.field2182;
        var10.field657 = 0;
        var10.field660 = false;
        if (this.field2900 != null) {
            this.method1203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2205, var9.field2196);
        } else {
            if (this.field2896 != null) {
                this.method1216(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2205, var9.field2196);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lsq;IIII[[I[[II)V")
    public class198(class108 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field2890 = arg0;
        this.field2897 = arg2;
        this.field2880 = arg5;
        this.field2889 = arg7;
        this.field2899 = 0;
        while (arg7 > 1) {
            ++this.field2899;
            arg7 >>= 1;
        }
        this.field2888 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field2890.field1350 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field2890.field1377 * var18 + this.field2890.field1374 * var17 + this.field2890.field1360 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field2888[var11][var10] = (byte) var20;
            }
        }
        this.field2886 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILtm;)Ltm;")
    public final class242 method1214(int arg0, int arg1, class242 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ltm;IIIIZ)V")
    public final void method1215(class242 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(IIIIIII[[ZLqh;[I[I)V")
    private final void method1216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class47 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field652 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field2896[var16][var17] != null) {
                        class16 var18 = this.field2896[var16][var17];
                        if (var18.field205 != -1 && (var18.field203 & 2) == 0 && var18.field202 == -1) {
                            int var19 = this.field2890.method671(var18.field205);
                            arg8.method299(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class40.method262(var19, var18.field206 & 65535, 31), class40.method262(var19, var18.field208 & 65535, -124), class40.method262(var19, var18.field204 & 65535, 97));
                            arg8.method299(var15, var15, var15 - var13, var14, var13 + var14, var14, class40.method262(var19, var18.field207 & 65535, -116), class40.method262(var19, var18.field204 & 65535, 122), class40.method262(var19, var18.field208 & 65535, 110));
                        } else if (var18.field202 == -1) {
                            arg8.method299(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field206 & 65535, var18.field208 & 65535, var18.field204 & 65535);
                            arg8.method299(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field207 & 65535, var18.field204 & 65535, var18.field208 & 65535);
                        } else {
                            int var20 = var18.field202;
                            arg8.method299(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method299(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field2881[var16][var17] != null) {
                        class372 var21 = this.field2881[var16][var17];
                        for (int var22 = 0; var22 < var21.field5365; ++var22) {
                            arg9[var22] = (var21.field5369[var22] - this.field2889 * var16) * var13 / this.field2889 + var14;
                            arg10[var22] = var15 - (var21.field5370[var22] - this.field2889 * var17) * var13 / this.field2889;
                        }
                        for (int var23 = 0; var23 < var21.field5366; ++var23) {
                            short var24 = var21.field5358[var23];
                            short var25 = var21.field5361[var23];
                            short var26 = var21.field5359[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5364 != null && var21.field5364[var23] != -1) {
                                int var33 = var21.field5364[var23];
                                arg8.method299(var30, var31, var32, var27, var28, var29, class40.method262(var33, var21.field5362[var24], -122), class40.method262(var33, var21.field5362[var25], 31), class40.method262(var33, var21.field5362[var26], -117));
                            } else if (var21.field5368 != null && var21.field5368[var23] != -1) {
                                int var34 = this.field2890.method671(var21.field5368[var23]);
                                arg8.method299(var30, var31, var32, var27, var28, var29, class40.method262(var34, var21.field5362[var24], -118), class40.method262(var34, var21.field5362[var25], -126), class40.method262(var34, var21.field5362[var26], -122));
                            } else {
                                int var35 = var21.field5363[var23];
                                arg8.method299(var30, var31, var32, var27, var28, var29, class40.method262(var35, var21.field5362[var24], 30), class40.method262(var35, var21.field5362[var25], -110), class40.method262(var35, var21.field5362[var26], 81));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field652 = true;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(Ltm;IIIIZ)V")
    public final void method1217(class242 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)I")
    public final int method1218(int arg0, int arg1) {
        return this.field2880[arg0][arg1];
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
    public final void method1219(int arg0, int arg1) {
        class148 var3 = this.field2890.method638(Thread.currentThread());
        var3.field2182.field657 = 0;
        if (this.field2900 != null) {
            this.method1208(arg0, arg1, this.field2890.field1362, var3.field2182, var3.field2205, var3.field2196, var3.field2191);
        } else {
            if (this.field2896 != null) {
                this.method1205(arg0, arg1, var3.field2182, var3.field2205, var3.field2196, var3.field2191);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1220(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field2896 == null) {
            this.field2896 = new class16[super.field5967][super.field5970];
            this.field2881 = new class372[super.field5967][super.field5970];
        } else if (this.field2900 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && this.field2889 != var20 || var21 != 0 && this.field2889 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class372 var22 = new class372();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field5365 = var23;
            var22.field5362 = new short[var23];
            var22.field5369 = new int[var23];
            var22.field5367 = new int[var23];
            var22.field5370 = new int[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field5362[var25] = (short) (this.field2888[arg0][arg1] - this.field2886[arg0][arg1]);
                } else if (var30 == 0 && this.field2889 == var31) {
                    var22.field5362[var25] = (short) (this.field2888[arg0][arg1 + 1] - this.field2886[arg0][arg1 + 1]);
                } else if (this.field2889 == var30 && this.field2889 == var31) {
                    var22.field5362[var25] = (short) (this.field2888[arg0 + 1][arg1 + 1] - this.field2886[arg0 + 1][arg1 + 1]);
                } else if (this.field2889 == var30 && var31 == 0) {
                    var22.field5362[var25] = (short) (this.field2888[arg0 + 1][arg1] - this.field2886[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field2888[arg0 + 1][arg1] - this.field2886[arg0 + 1][arg1]) * var30 + (this.field2888[arg0][arg1] - this.field2886[arg0][arg1]) * (this.field2889 - var30);
                    int var33 = (this.field2888[arg0 + 1][arg1 + 1] - this.field2886[arg0 + 1][arg1 + 1]) * var30 + (this.field2888[arg0][arg1 + 1] - this.field2886[arg0][arg1 + 1]) * (this.field2889 - var30);
                    var22.field5362[var25] = (short) ((this.field2889 - var31) * var32 + var31 * var33 >> this.field2899 * 2);
                }
                int var34 = (arg0 << this.field2899) + var30;
                int var35 = (arg1 << this.field2899) + var31;
                var22.field5369[var25] = var34;
                var22.field5370[var25] = var35;
                var22.field5367[var25] = this.method1209(var34, var35) + (arg3 != null ? arg3[var25] : 0);
                if (var22.field5362[var25] < 2) {
                    var22.field5362[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field2890.field4432.method703(12095, arg11[var28]).field4113) {
                    var26 = true;
                }
            }
            var22.field5363 = new int[var27];
            if (arg10 != null) {
                var22.field5364 = new int[var27];
            }
            var22.field5358 = new short[var27];
            var22.field5361 = new short[var27];
            var22.field5359 = new short[var27];
            if (var26) {
                var22.field5368 = new short[var27];
                var22.field5360 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field5363[var22.field5366] = class385.method2324(-1888289119, arg9[var29]);
                    } else {
                        var22.field5363[var22.field5366] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field5364[var22.field5366] = class385.method2324(-1888289119, arg10[var29]);
                        } else {
                            var22.field5364[var22.field5366] = -1;
                        }
                    }
                    var22.field5358[var22.field5366] = (short) arg6[var29];
                    var22.field5361[var22.field5366] = (short) arg7[var29];
                    var22.field5359[var22.field5366] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field2890.field4432.method703(12095, arg11[var29]).field4113) {
                            var22.field5368[var22.field5366] = (short) arg11[var29];
                            var22.field5360[var22.field5366] = (short) arg12[var29];
                        } else {
                            var22.field5368[var22.field5366] = -1;
                        }
                    }
                    ++var22.field5366;
                }
            }
            this.field2881[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class16 var36 = new class16();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field202 = class40.method262(class385.method2324(-1888289119, arg10[0]), this.field2888[arg0][arg1] - this.field2886[arg0][arg1], 80);
                    if (var37 == -1) {
                        var36.field203 = (byte) (var36.field203 | 2);
                    }
                }
                if (this.field2880[arg0 + 1][arg1] == this.field2880[arg0][arg1] && this.field2880[arg0 + 1][arg1 + 1] == this.field2880[arg0][arg1] && this.field2880[arg0][arg1 + 1] == this.field2880[arg0][arg1]) {
                    var36.field203 = (byte) (var36.field203 | 1);
                }
                if (var38 != -1 && (var36.field203 & 2) == 0 && !this.field2890.field4432.method703(12095, var38).field4113) {
                    var36.field207 = (short) (this.field2888[arg0][arg1] - this.field2886[arg0][arg1]);
                    var36.field204 = (short) (this.field2888[arg0 + 1][arg1] - this.field2886[arg0 + 1][arg1]);
                    var36.field206 = (short) (this.field2888[arg0 + 1][arg1 + 1] - this.field2886[arg0 + 1][arg1 + 1]);
                    var36.field208 = (short) (this.field2888[arg0][arg1 + 1] - this.field2886[arg0][arg1 + 1]);
                    var36.field205 = (short) var38;
                } else {
                    short var39 = class385.method2324(-1888289119, var37);
                    var36.field207 = (short) class40.method262(var39, this.field2888[arg0][arg1] - this.field2886[arg0][arg1], 120);
                    var36.field204 = (short) class40.method262(var39, this.field2888[arg0 + 1][arg1] - this.field2886[arg0 + 1][arg1], -118);
                    var36.field206 = (short) class40.method262(var39, this.field2888[arg0 + 1][arg1 + 1] - this.field2886[arg0 + 1][arg1 + 1], -125);
                    var36.field208 = (short) class40.method262(var39, this.field2888[arg0][arg1 + 1] - this.field2886[arg0][arg1 + 1], -122);
                    var36.field205 = -1;
                }
                this.field2896[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1221(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class162 var6 = this.field2890.field1351;
        this.field2887 = var6.field2405;
        this.field2878 = var6.field2401;
        this.field2893 = var6.field2406;
        this.field2894 = var6.field2397;
        this.field2898 = var6.field2398;
        this.field2883 = var6.field2400;
        this.field2895 = var6.field2402;
        this.field2882 = var6.field2407;
        this.field2891 = var6.field2403;
        this.field2884 = var6.field2396;
        this.field2879 = var6.field2404;
        this.field2885 = var6.field2399;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
    public final void method1222() {
        this.field2888 = null;
        this.field2886 = null;
    }
}
