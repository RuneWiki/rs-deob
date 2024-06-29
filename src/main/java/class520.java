import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class520 extends class287 {

    @OriginalMember(owner = "client!ou", name = "E", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!ou", name = "F", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!ou", name = "G", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!ou", name = "H", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!ou", name = "I", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!ou", name = "J", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!ou", name = "K", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!ou", name = "L", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!ou", name = "M", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!ou", name = "N", descriptor = "[I")
    public static int[] field7329;

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Let;IIII[[I[[II)V")
    public class520(class511 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I[ILvba;[II[II)V")
    private final void method2999(int arg0, int[] arg1, class36 arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        if (arg4 != 1) {
            this.method1100(16, 93, -96, -14, -9, -44, 114, (boolean[][]) null);
        }
        ++field7323;
        class616 var8 = super.field3942[arg6][arg0];
        if (var8 != null) {
            if (~(var8.field8843 & 2) == -1) {
                int var9 = super.field2504 * arg6;
                int var10 = super.field2504 + var9;
                int var11 = super.field2504 * arg0;
                int var12 = super.field2504 + var11;
                int var15;
                int var16;
                int var18;
                int var20;
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
                int var36;
                if ((var8.field8843 & 1) != 0) {
                    int var13 = super.field3945[arg6][arg0];
                    int var17;
                    if (~super.field3954 == 0) {
                        int var14 = super.field3958 * var13;
                        var15 = (super.field3949 * var11 + super.field3951 * var9 + var14 >> 15) + super.field3938;
                        if (super.field3940.field7153 >= var15) {
                            return;
                        }
                        var16 = super.field3938 - -(super.field3951 * var10 - -(super.field3949 * var11) + var14 >> 15);
                        if (super.field3940.field7153 >= var16) {
                            return;
                        }
                        var17 = (super.field3949 * var12 + super.field3951 * var10 + var14 >> 15) + super.field3938;
                        if (~var17 >= ~super.field3940.field7153) {
                            return;
                        }
                        var18 = (super.field3951 * var9 - (-(super.field3949 * var12) + -var14) >> 15) + super.field3938;
                        if (~super.field3940.field7153 <= ~var18) {
                            return;
                        }
                    } else {
                        var18 = super.field3954;
                        var17 = super.field3954;
                        var16 = super.field3954;
                        var15 = super.field3954;
                    }
                    int var19 = super.field3956 * var13;
                    var20 = (super.field3955 * var9 + super.field3939 * var11 + var19 >> 15) + super.field3950;
                    int var21 = super.field3943 * var13;
                    var22 = super.field3940.field7176 * var20 / var15 + arg2.field760;
                    var23 = (super.field3944 * var11 + super.field3947 * var9 + var21 >> 15) + super.field3948;
                    var24 = super.field3940.field7167 * var23 / var15 + arg2.field754;
                    var25 = super.field3950 - -(super.field3939 * var11 + super.field3955 * var10 + var19 >> 15);
                    var26 = (super.field3944 * var11 + (super.field3947 * var10 - -var21) >> 15) + super.field3948;
                    var27 = super.field3940.field7176 * var25 / var16 + arg2.field760;
                    int var28 = (super.field3955 * var10 + super.field3939 * var12 - -var19 >> 15) + super.field3950;
                    var29 = super.field3940.field7167 * var26 / var16 + arg2.field754;
                    int var30 = super.field3948 - -(super.field3947 * var10 + super.field3944 * var12 + var21 >> 15);
                    var31 = super.field3940.field7176 * var28 / var17 + arg2.field760;
                    var32 = super.field3940.field7167 * var30 / var17 + arg2.field754;
                    var33 = (super.field3939 * var12 + (super.field3955 * var9 - -var19) >> 15) + super.field3950;
                    var34 = super.field3948 - -(super.field3944 * var12 + super.field3947 * var9 + var21 >> 15);
                    var35 = super.field3940.field7176 * var33 / var18 + arg2.field760;
                    var36 = arg2.field754 - -(super.field3940.field7167 * var34 / var18);
                } else {
                    int var37 = super.field3945[arg6][arg0];
                    int var38 = super.field3945[arg6 + 1][arg0];
                    int var39 = super.field3945[arg6 + 1][arg0 + 1];
                    int var40 = super.field3945[arg6][arg0 + 1];
                    int var41;
                    if (super.field3954 != -1) {
                        var18 = super.field3954;
                        var41 = super.field3954;
                        var16 = super.field3954;
                        var15 = super.field3954;
                    } else {
                        var15 = (super.field3951 * var9 + (super.field3958 * var37 - -(super.field3949 * var11)) >> 15) + super.field3938;
                        if (~super.field3940.field7153 <= ~var15) {
                            return;
                        }
                        var16 = (super.field3958 * var38 + super.field3951 * var10 + super.field3949 * var11 >> 15) + super.field3938;
                        if (~super.field3940.field7153 <= ~var16) {
                            return;
                        }
                        var41 = (super.field3949 * var12 + super.field3958 * var39 + super.field3951 * var10 >> 15) + super.field3938;
                        if (super.field3940.field7153 >= var41) {
                            return;
                        }
                        var18 = (super.field3951 * var9 + super.field3958 * var40 + super.field3949 * var12 >> 15) + super.field3938;
                        if (~var18 >= ~super.field3940.field7153) {
                            return;
                        }
                    }
                    var20 = (super.field3955 * var9 + super.field3956 * var37 + super.field3939 * var11 >> 15) + super.field3950;
                    var23 = (super.field3947 * var9 + super.field3944 * var11 + super.field3943 * var37 >> 15) + super.field3948;
                    var22 = arg2.field760 - -(super.field3940.field7176 * var20 / var15);
                    var25 = (super.field3939 * var11 + super.field3956 * var38 + super.field3955 * var10 >> 15) + super.field3950;
                    var24 = super.field3940.field7167 * var23 / var15 + arg2.field754;
                    var26 = (super.field3947 * var10 - (-(super.field3944 * var11) + -(super.field3943 * var38)) >> 15) + super.field3948;
                    var27 = super.field3940.field7176 * var25 / var16 + arg2.field760;
                    int var42 = (super.field3956 * var39 + super.field3955 * var10 + super.field3939 * var12 >> 15) + super.field3950;
                    var29 = arg2.field754 - -(super.field3940.field7167 * var26 / var16);
                    var31 = arg2.field760 - -(super.field3940.field7176 * var42 / var41);
                    int var43 = (super.field3944 * var12 + super.field3947 * var10 + super.field3943 * var39 >> 15) + super.field3948;
                    var32 = super.field3940.field7167 * var43 / var41 + arg2.field754;
                    var33 = (super.field3955 * var9 + (super.field3956 * var40 - -(super.field3939 * var12)) >> 15) + super.field3950;
                    var35 = super.field3940.field7176 * var33 / var18 + arg2.field760;
                    var34 = (super.field3947 * var9 + super.field3944 * var12 + super.field3943 * var40 >> 15) + super.field3948;
                    var36 = super.field3940.field7167 * var34 / var18 + arg2.field754;
                }
                if ((var31 - var35) * (-var36 + var29) + -((-var35 + var27) * (-var36 + var32)) > 0) {
                    arg2.field759 = var31 < 0 || ~var35 > -1 || ~var27 > -1 || var31 > arg2.field757 || ~var35 < ~arg2.field757 || ~var27 < ~arg2.field757;
                    if (~var8.field8844 > -1) {
                        arg2.method384(var32, var36, var29, var31, var35, var27, var8.field8847 & 65535, var8.field8845 & 65535, var8.field8841 & 65535);
                    } else {
                        if (this.method1831(super.field3940.field2924.method190((byte) -89, var8.field8844).field2984)) {
                            arg2.field753 = 100;
                        }
                        arg2.method380(var32, var36, var29, var31, var35, var27, var8.field8847 & 65535, 65535 & var8.field8845, var8.field8841 & 65535, var20, var25, var33, var23, var26, var34, var15, var16, var18, var8.field8844);
                        arg2.field753 = 0;
                    }
                }
                if (~((var22 - var27) * (-var29 + var36) + -((var24 - var29) * (-var27 + var35))) < -1) {
                    arg2.field759 = var22 < 0 || var27 < 0 || ~var35 > -1 || var22 > arg2.field757 || ~arg2.field757 > ~var27 || arg2.field757 < var35;
                    if (var8.field8844 >= 0) {
                        if (this.method1831(super.field3940.field2924.method190((byte) -89, var8.field8844).field2984)) {
                            arg2.field753 = 100;
                        }
                        arg2.method380(var24, var29, var36, var22, var27, var35, 65535 & var8.field8842, 65535 & var8.field8841, 65535 & var8.field8845, var20, var25, var33, var23, var26, var34, var15, var16, var18, var8.field8844);
                        arg2.field753 = 0;
                        return;
                    }
                    arg2.method384(var24, var29, var36, var22, var27, var35, 65535 & var8.field8842, 65535 & var8.field8841, 65535 & var8.field8845);
                }
            }
        } else {
            class292 var44 = super.field3946[arg6][arg0];
            if (var44 != null) {
                if (~super.field3954 != 0) {
                    for (int var45 = 0; ~var44.field4022 < ~var45; ++var45) {
                        int var46 = var44.field4014[var45] - -(arg6 << super.field2506);
                        short var47 = var44.field4020[var45];
                        int var48 = (arg0 << super.field2506) + var44.field4019[var45];
                        int var49 = super.field3948 - -(super.field3947 * var46 - (-(super.field3943 * var47) - super.field3944 * var48) >> 15);
                        int var50 = (super.field3955 * var46 - (-(super.field3956 * var47) - super.field3939 * var48) >> 15) + super.field3950;
                        arg3[var45] = super.field3940.field7176 * var50 / super.field3954 + arg2.field760;
                        arg5[var45] = arg2.field754 - -(super.field3940.field7167 * var49 / super.field3954);
                    }
                } else {
                    for (int var51 = 0; ~var51 > ~var44.field4022; ++var51) {
                        int var91 = var44.field4014[var51] - -(arg6 << super.field2506);
                        short var92 = var44.field4020[var51];
                        int var93 = (arg0 << super.field2506) + var44.field4019[var51];
                        int var94 = super.field3938 - -(super.field3951 * var91 + super.field3958 * var92 + super.field3949 * var93 >> 15);
                        if (var94 <= super.field3940.field7153) {
                            return;
                        }
                        int var95 = (super.field3956 * var92 + super.field3955 * var91 + super.field3939 * var93 >> 15) + super.field3950;
                        int var96 = (super.field3947 * var91 + super.field3944 * var93 + super.field3943 * var92 >> 15) + super.field3948;
                        arg3[var51] = arg2.field760 - -(super.field3940.field7176 * var95 / var94);
                        arg5[var51] = super.field3940.field7167 * var96 / var94 + arg2.field754;
                    }
                }
                if (var44.field4016 != null) {
                    int var52 = super.field3945[arg6][arg0];
                    int var53 = super.field3945[arg6 + 1][arg0];
                    int var54 = super.field3945[arg6][arg0 + 1];
                    int var55 = super.field2504 * arg6;
                    int var56 = var55 - -super.field2504;
                    int var57 = super.field2504 * arg0;
                    int var58 = var57 - -super.field2504;
                    int var59 = (super.field3939 * var57 + (super.field3955 * var55 - -(super.field3956 * var52)) >> 15) + super.field3950;
                    int var60 = (super.field3944 * var57 + super.field3947 * var55 + super.field3943 * var52 >> 15) + super.field3948;
                    int var61 = (super.field3958 * var52 + super.field3951 * var55 - -(super.field3949 * var57) >> 15) + super.field3938;
                    int var62 = (super.field3955 * var56 - (-(super.field3956 * var53) + -(super.field3939 * var57)) >> 15) + super.field3950;
                    int var63 = super.field3948 - -(super.field3944 * var57 + super.field3947 * var56 + super.field3943 * var53 >> 15);
                    int var64 = (super.field3951 * var56 + super.field3958 * var53 + super.field3949 * var57 >> 15) + super.field3938;
                    int var65 = (super.field3939 * var58 + (super.field3955 * var55 - -(super.field3956 * var54)) >> 15) + super.field3950;
                    int var66 = (super.field3944 * var58 + super.field3947 * var55 + super.field3943 * var54 >> 15) + super.field3948;
                    int var67 = super.field3938 - -(super.field3949 * var58 + super.field3958 * var54 + super.field3951 * var55 >> 15);
                    for (int var68 = 0; ~var44.field4018 < ~var68; ++var68) {
                        short var69 = var44.field4023[var68];
                        short var70 = var44.field4024[var68];
                        short var71 = var44.field4025[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg5[var69];
                        int var76 = arg5[var70];
                        int var77 = arg5[var71];
                        if ((var77 - var76) * (-var73 + var72) + -((-var73 + var74) * (-var76 + var75)) > 0) {
                            arg2.field759 = ~var72 > -1 || var73 < 0 || ~var74 > -1 || var72 > arg2.field757 || arg2.field757 < var73 || ~arg2.field757 > ~var74;
                            short var78 = var44.field4016[var68];
                            if (var78 == -1) {
                                int var79 = var44.field4026[var68];
                                if (~var79 != 0) {
                                    arg2.method384(var75, var76, var77, var72, var73, var74, class306.method1937(var79, arg4 + 126, var44.field4021[var69]), class306.method1937(var79, 127, var44.field4021[var70]), class306.method1937(var79, 127, var44.field4021[var71]));
                                }
                            } else {
                                if (this.method1831(super.field3940.field2924.method190((byte) -89, var78).field2984)) {
                                    arg2.field753 = 100;
                                }
                                arg2.method380(var75, var76, var77, var72, var73, var74, var44.field4021[var69], var44.field4021[var70], var44.field4021[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field753 = 0;
                            }
                        }
                    }
                } else {
                    for (int var80 = 0; var80 < var44.field4018; ++var80) {
                        short var81 = var44.field4023[var80];
                        short var82 = var44.field4024[var80];
                        short var83 = var44.field4025[var80];
                        int var84 = arg3[var81];
                        int var85 = arg3[var82];
                        int var86 = arg3[var83];
                        int var87 = arg5[var81];
                        int var88 = arg5[var82];
                        int var89 = arg5[var83];
                        if (~((-var85 + var84) * (-var88 + var89) + -((-var85 + var86) * (-var88 + var87))) < -1) {
                            int var90 = var44.field4026[var80];
                            if (var90 != -1) {
                                arg2.field759 = ~var84 > -1 || var85 < 0 || ~var86 > -1 || ~var84 < ~arg2.field757 || arg2.field757 < var85 || var86 > arg2.field757;
                                arg2.method384(var87, var88, var89, var84, var85, var86, class306.method1937(var90, arg4 ^ 126, var44.field4021[var81]), class306.method1937(var90, 127, var44.field4021[var82]), class306.method1937(var90, arg4 + 126, var44.field4021[var83]));
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "([I[IIIIII[[ZLvba;III)V")
    private final void method3000(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class36 arg8, int arg9, int arg10, int arg11) {
        if (arg3 <= 76) {
            field7329 = null;
        }
        ++field7321;
        int var13 = (-arg4 + arg9) * arg6 / 256;
        arg8.field750 = false;
        arg8.field762 = false;
        int var14 = arg6 >> 8;
        int var15 = arg11;
        int var16 = arg5 + var13;
        for (int var17 = arg2; ~var17 > ~arg10; ++var17) {
            for (int var18 = arg4; ~arg9 < ~var18; ++var18) {
                if (arg7[-arg2 + var17][-arg4 + var18]) {
                    if (super.field3937[var17][var18] != null) {
                        class102 var33 = super.field3937[var17][var18];
                        if (var33.field1545 != -1 && ~(2 & var33.field1548) == -1 && var33.field1554 == 0) {
                            int var34 = super.field3940.method2953(var33.field1545);
                            arg8.method384(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class306.method1937(var34, 127, var33.field1553), class306.method1937(var34, 127, var33.field1551), class306.method1937(var34, 127, var33.field1555));
                            arg8.method384(var16, var16, -var14 + var16, var15, var14 + var15, var15, class306.method1937(var34, 127, var33.field1549), class306.method1937(var34, 127, var33.field1555), class306.method1937(var34, 127, var33.field1551));
                        } else if (var33.field1554 == 0) {
                            arg8.method372(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, var33.field1553, var33.field1551, var33.field1555);
                            arg8.method372(var16, var16, -var14 + var16, var15, var14 + var15, var15, var33.field1549, var33.field1555, var33.field1551);
                        } else {
                            int var35 = var33.field1554;
                            arg8.method372(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, class211.method1383(-114, -16777216 & var33.field1553, var35), class211.method1383(-123, -16777216 & var33.field1551, var35), class211.method1383(-124, -16777216 & var33.field1555, var35));
                            arg8.method372(var16, var16, -var14 + var16, var15, var15 - -var14, var15, class211.method1383(-114, var33.field1549 & -16777216, var35), class211.method1383(-121, var33.field1555 & -16777216, var35), class211.method1383(-112, var33.field1551 & -16777216, var35));
                        }
                    } else if (super.field3941[var17][var18] != null) {
                        class605 var19 = super.field3941[var17][var18];
                        for (int var20 = 0; var19.field8718 > var20; ++var20) {
                            arg1[var20] = var19.field8722[var20] * var14 / super.field2504 + var15;
                            arg0[var20] = -(var19.field8714[var20] * var14 / super.field2504) + var16;
                        }
                        for (int var21 = 0; var21 < var19.field8719; ++var21) {
                            int var22 = var21 * 3;
                            int var23 = var22 - -1;
                            int var24 = var23 - -1;
                            int var25 = arg1[var22];
                            int var26 = arg1[var23];
                            int var27 = arg1[var24];
                            int var28 = arg0[var22];
                            int var29 = arg0[var23];
                            int var30 = arg0[var24];
                            if (var19.field8716 != null && var19.field8716[var21] != 0 && (var19.field8715 == null || var19.field8715 != null && var19.field8715[var21] == -1)) {
                                int var31 = var19.field8716[var21];
                                arg8.method372(var28, var29, var30, var25, var26, var27, class211.method1383(-128, -(var19.field8713[var22] & -16777216) + -16777216, var31), class211.method1383(-119, -(-16777216 & var19.field8713[var23]) + -16777216, var31), class211.method1383(-123, -(-16777216 & var19.field8713[var24]) + -16777216, var31));
                            } else if (var19.field8715 != null && var19.field8715[var21] != -1) {
                                int var32 = super.field3940.method2953(var19.field8715[var21]);
                                arg8.method384(var28, var29, var30, var25, var26, var27, var32, var32, var32);
                            } else {
                                arg8.method372(var28, var29, var30, var25, var26, var27, var19.field8713[var22], var19.field8713[var23], var19.field8713[var24]);
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var15 += var14;
            var16 = arg5 - -var13;
        }
        arg8.field762 = true;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field7324;
        class16 var9 = (class16) super.field3940.method1372(Thread.currentThread());
        class36 var10 = var9.field211;
        var10.field759 = false;
        var10.field753 = 0;
        if (super.field3937 == null) {
            if (super.field3942 != null) {
                this.method3005(arg1, arg5, arg7, arg0, arg6, false, var9.field5595, var9.field5605, var10, arg4, arg2, arg3);
                return;
            }
        } else {
            this.method3000(var9.field5605, var9.field5595, arg3, 102, arg4, arg1, arg2, arg7, var10, arg6, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V")
    public static void method3001(byte arg0) {
        if (arg0 == 90) {
            field7329 = null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3002(int arg0, int arg1, byte arg2) {
        if (arg2 != 103) {
            return false;
        } else {
            ++field7325;
            return class100.method717(arg1, -5569, arg0) || class191.method1190((byte) -25, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "([IIZ[I[IBILvba;)V")
    private final void method3003(int[] arg0, int arg1, boolean arg2, int[] arg3, int[] arg4, byte arg5, int arg6, class36 arg7) {
        ++field7328;
        class102 var9 = super.field3937[arg6][arg1];
        if (var9 != null) {
            if ((var9.field1548 & 2) == 0) {
                int var10 = super.field2504 * arg6;
                int var11 = super.field2504 + var10;
                int var12 = super.field2504 * arg1;
                int var13 = var12 - -super.field2504;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var20;
                int var21;
                int var22;
                int var23;
                int var29;
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
                int var45;
                if (~(1 & var9.field1548) != -1 && !arg2) {
                    int var18 = super.field3945[arg6][arg1];
                    if (~super.field3954 == 0) {
                        int var19 = super.field3958 * var18;
                        var20 = super.field3938 - -(super.field3949 * var12 + super.field3951 * var10 + var19 >> 15);
                        if (super.field3940.field7153 >= var20) {
                            return;
                        }
                        var21 = (super.field3951 * var11 + var19 - -(super.field3949 * var12) >> 15) + super.field3938;
                        if (var21 <= super.field3940.field7153) {
                            return;
                        }
                        var22 = (super.field3951 * var11 - -(super.field3949 * var13) + var19 >> 15) + super.field3938;
                        if (~super.field3940.field7153 <= ~var22) {
                            return;
                        }
                        var23 = (super.field3951 * var10 + super.field3949 * var13 + var19 >> 15) + super.field3938;
                        if (~var23 >= ~super.field3940.field7153) {
                            return;
                        }
                    } else {
                        var23 = super.field3954;
                        var22 = super.field3954;
                        var21 = super.field3954;
                        var20 = super.field3954;
                    }
                    if (super.field3940.field7171) {
                        int var24 = -super.field3940.field7166 + var20;
                        if (~var24 < -1) {
                            var14 = var24;
                            if (~var24 < -256) {
                                var14 = 255;
                            }
                        }
                        int var25 = -super.field3940.field7166 + var21;
                        if (var25 > 0) {
                            var15 = var25;
                            if (~var25 < -256) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field3940.field7166 + var22;
                        if (var26 > 0) {
                            var16 = var26;
                            if (~var26 < -256) {
                                var16 = 255;
                            }
                        }
                        int var27 = var23 - super.field3940.field7166;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field3956 * var18;
                    var29 = super.field3950 - -(super.field3955 * var10 + var28 - -(super.field3939 * var12) >> 15);
                    int var30 = super.field3943 * var18;
                    var31 = super.field3948 - -(super.field3947 * var10 + var30 - -(super.field3944 * var12) >> 15);
                    var32 = super.field3940.field7176 * var29 / var20 + arg7.field760;
                    var33 = super.field3940.field7167 * var31 / var20 + arg7.field754;
                    var34 = (super.field3955 * var11 + var28 - -(super.field3939 * var12) >> 15) + super.field3950;
                    var35 = super.field3940.field7176 * var34 / var21 + arg7.field760;
                    var36 = (super.field3947 * var11 - (-var30 - super.field3944 * var12) >> 15) + super.field3948;
                    var37 = super.field3940.field7167 * var36 / var21 + arg7.field754;
                    var38 = (super.field3939 * var13 + super.field3955 * var11 + var28 >> 15) + super.field3950;
                    var39 = super.field3940.field7176 * var38 / var22 + arg7.field760;
                    var40 = (super.field3947 * var11 + var30 - -(super.field3944 * var13) >> 15) + super.field3948;
                    var41 = arg7.field754 - -(super.field3940.field7167 * var40 / var22);
                    var42 = (super.field3955 * var10 + (var28 - -(super.field3939 * var13)) >> 15) + super.field3950;
                    var43 = (super.field3947 * var10 - -(super.field3944 * var13) + var30 >> 15) + super.field3948;
                    var44 = super.field3940.field7176 * var42 / var23 + arg7.field760;
                    var45 = arg7.field754 - -(super.field3940.field7167 * var43 / var23);
                } else {
                    int var46 = super.field3945[arg6][arg1];
                    int var47 = super.field3945[arg6 + 1][arg1];
                    int var48 = super.field3945[arg6 + 1][arg1 + 1];
                    int var49 = super.field3945[arg6][arg1 + 1];
                    if (~super.field3954 == 0) {
                        var20 = (super.field3958 * var46 + super.field3951 * var10 + super.field3949 * var12 >> 15) + super.field3938;
                        if (super.field3940.field7153 >= var20) {
                            return;
                        }
                        var21 = (super.field3951 * var11 - (-(super.field3958 * var47) + -(super.field3949 * var12)) >> 15) + super.field3938;
                        if (var21 <= super.field3940.field7153) {
                            return;
                        }
                        var22 = (super.field3949 * var13 + super.field3958 * var48 + super.field3951 * var11 >> 15) + super.field3938;
                        if (var22 <= super.field3940.field7153) {
                            return;
                        }
                        var23 = super.field3938 - -(super.field3958 * var49 + (super.field3951 * var10 - -(super.field3949 * var13)) >> 15);
                        if (~var23 >= ~super.field3940.field7153) {
                            return;
                        }
                    } else {
                        var23 = super.field3954;
                        var22 = super.field3954;
                        var21 = super.field3954;
                        var20 = super.field3954;
                    }
                    if (!arg2) {
                        if (super.field3940.field7171) {
                            int var50 = -super.field3940.field7166 + var20;
                            if (var50 > 0) {
                                var14 = var50;
                                if (var50 > 255) {
                                    var14 = 255;
                                }
                            }
                            int var51 = -super.field3940.field7166 + var21;
                            if (var51 > 0) {
                                var15 = var51;
                                if (~var51 < -256) {
                                    var15 = 255;
                                }
                            }
                            int var52 = -super.field3940.field7166 + var22;
                            if (~var52 < -1) {
                                var16 = var52;
                                if (var52 > 255) {
                                    var16 = 255;
                                }
                            }
                            int var53 = -super.field3940.field7166 + var23;
                            if (~var53 < -1) {
                                var17 = var53;
                                if (var53 > 255) {
                                    var17 = 255;
                                }
                            }
                        }
                    } else {
                        int var54 = -super.field3940.field7166 + var20;
                        if (var54 > 255) {
                            var54 = 255;
                        }
                        if (var54 > 0) {
                            var14 = var54;
                            int var55 = var9.field1546 * var54 / 255;
                            if (var55 > 0) {
                                var46 -= var55;
                            }
                        }
                        int var56 = -super.field3940.field7166 + var21;
                        if (~var56 < -256) {
                            var56 = 255;
                        }
                        if (~var56 < -1) {
                            var15 = var56;
                            int var57 = var9.field1550 * var56 / 255;
                            if (var57 > 0) {
                                var47 -= var57;
                            }
                        }
                        int var58 = -super.field3940.field7166 + var22;
                        if (var58 > 255) {
                            var58 = 255;
                        }
                        if (~var58 < -1) {
                            var16 = var58;
                            int var59 = var9.field1552 * var58 / 255;
                            if (~var59 < -1) {
                                var48 -= var59;
                            }
                        }
                        int var60 = -super.field3940.field7166 + var23;
                        if (~var60 < -256) {
                            var60 = 255;
                        }
                        if (var60 > 0) {
                            var17 = var60;
                            int var61 = var9.field1547 * var60 / 255;
                            if (~var61 < -1) {
                                var49 -= var61;
                            }
                        }
                    }
                    var29 = super.field3950 - -(super.field3955 * var10 + (super.field3956 * var46 - -(super.field3939 * var12)) >> 15);
                    var31 = (super.field3944 * var12 + super.field3947 * var10 + super.field3943 * var46 >> 15) + super.field3948;
                    var32 = super.field3940.field7176 * var29 / var20 + arg7.field760;
                    var33 = super.field3940.field7167 * var31 / var20 + arg7.field754;
                    var34 = (super.field3955 * var11 + super.field3956 * var47 + super.field3939 * var12 >> 15) + super.field3950;
                    var35 = super.field3940.field7176 * var34 / var21 + arg7.field760;
                    var36 = (super.field3944 * var12 + (super.field3947 * var11 - -(super.field3943 * var47)) >> 15) + super.field3948;
                    var38 = (super.field3939 * var13 + super.field3956 * var48 + super.field3955 * var11 >> 15) + super.field3950;
                    var37 = super.field3940.field7167 * var36 / var21 + arg7.field754;
                    var40 = super.field3948 - -(super.field3943 * var48 + super.field3947 * var11 + super.field3944 * var13 >> 15);
                    var39 = super.field3940.field7176 * var38 / var22 + arg7.field760;
                    var42 = (super.field3939 * var13 + (super.field3955 * var10 - -(super.field3956 * var49)) >> 15) + super.field3950;
                    var41 = super.field3940.field7167 * var40 / var22 + arg7.field754;
                    var43 = super.field3948 - -(super.field3947 * var10 + (super.field3943 * var49 - -(super.field3944 * var13)) >> 15);
                    var44 = super.field3940.field7176 * var42 / var23 + arg7.field760;
                    var45 = super.field3940.field7167 * var43 / var23 + arg7.field754;
                }
                boolean var62 = var9.field1545 != -1 && this.method1831(super.field3940.field2924.method190((byte) -89, var9.field1545).field2984);
                int var63 = var16 + var17 + var15;
                if ((-var44 + var39) * (-var45 + var37) + -((-var44 + var35) * (-var45 + var41)) > 0) {
                    arg7.field759 = ~var39 > -1 || var44 < 0 || ~var35 > -1 || ~arg7.field757 > ~var39 || var44 > arg7.field757 || var35 > arg7.field757;
                    if (var63 < 765) {
                        if (var62) {
                            arg7.field753 = 100;
                        }
                        if (var63 > 0) {
                            if (var9.field1545 < 0) {
                                arg7.method372(var41, var45, var37, var39, var44, var35, class211.method1383(-112, super.field3940.field7180 | var16 << 24, var9.field1553), class211.method1383(-126, super.field3940.field7180 | var17 << 24, var9.field1551), class211.method1383(-115, super.field3940.field7180 | var15 << 24, var9.field1555));
                            } else {
                                arg7.method377(var41, var45, var37, var39, var44, var35, super.field3940.field7180, var16, var17, var15, var9.field1553, var9.field1551, var9.field1555, var38, var42, var34, var40, var43, var36, var22, var23, var21, var9.field1545);
                            }
                        } else if (var9.field1545 >= 0) {
                            arg7.method380(var41, var45, var37, var39, var44, var35, var9.field1553, var9.field1551, var9.field1555, var38, var42, var34, var40, var43, var36, var22, var23, var21, var9.field1545);
                        } else {
                            arg7.method372(var41, var45, var37, var39, var44, var35, var9.field1553, var9.field1551, var9.field1555);
                        }
                        arg7.field753 = 0;
                    } else {
                        arg7.method373(var41, var45, var37, var39, var44, var35, super.field3940.field7180);
                    }
                }
                int var64 = var14 - -var17 + var15;
                if ((-var35 + var32) * (-var37 + var45) + -((-var35 + var44) * (-var37 + var33)) > 0) {
                    arg7.field759 = var32 < 0 || var35 < 0 || var44 < 0 || ~arg7.field757 > ~var32 || var35 > arg7.field757 || var44 > arg7.field757;
                    if (~var64 <= -766) {
                        arg7.method373(var33, var37, var45, var32, var35, var44, super.field3940.field7180);
                        return;
                    }
                    if (var62) {
                        arg7.field753 = 100;
                    }
                    if (~var64 >= -1) {
                        if (var9.field1545 >= 0) {
                            arg7.method380(var33, var37, var45, var32, var35, var44, var9.field1549, var9.field1555, var9.field1551, var29, var34, var42, var31, var36, var43, var20, var21, var23, var9.field1545);
                        } else {
                            arg7.method372(var33, var37, var45, var32, var35, var44, var9.field1549, var9.field1555, var9.field1551);
                        }
                    } else if (~var9.field1545 > -1) {
                        arg7.method372(var33, var37, var45, var32, var35, var44, class211.method1383(-119, super.field3940.field7180 | var14 << 24, var9.field1549), class211.method1383(-123, var15 << 24 | super.field3940.field7180, var9.field1555), class211.method1383(-117, super.field3940.field7180 | var17 << 24, var9.field1551));
                    } else {
                        arg7.method377(var33, var37, var45, var32, var35, var44, super.field3940.field7180, var14, var15, var17, var9.field1549, var9.field1555, var9.field1551, var29, var34, var42, var31, var36, var43, var20, var21, var23, var9.field1545);
                    }
                    arg7.field753 = 0;
                }
            }
        } else {
            class605 var65 = super.field3941[arg6][arg1];
            if (var65 != null) {
                if (~super.field3954 != 0) {
                    for (int var66 = 0; ~var66 > ~var65.field8718; ++var66) {
                        int var67 = (arg6 << super.field2506) + var65.field8722[var66];
                        int var68 = var65.field8720[var66];
                        int var69 = (arg1 << super.field2506) + var65.field8714[var66];
                        arg4[var66] = 0;
                        if (!arg2) {
                            if (super.field3940.field7171) {
                                int var70 = -super.field3940.field7166 + super.field3954;
                                if (~var70 < -1) {
                                    arg4[var66] = var70;
                                    if (arg4[var66] > 255) {
                                        arg4[var66] = 255;
                                    }
                                }
                            }
                        } else {
                            int var71 = -super.field3940.field7166 + super.field3954;
                            if (~var71 < -256) {
                                var71 = 255;
                            }
                            if (~var71 < -1) {
                                arg4[var66] = var71;
                                int var72 = var65.field8721[var66] * var71 / 255;
                                if (~var72 < -1) {
                                    var68 -= var72;
                                }
                            }
                        }
                        int var73 = (super.field3944 * var69 + (super.field3947 * var67 - -(super.field3943 * var68)) >> 15) + super.field3948;
                        int var74 = (super.field3956 * var68 + (super.field3955 * var67 - -(super.field3939 * var69)) >> 15) + super.field3950;
                        arg0[var66] = arg7.field760 - -(super.field3940.field7176 * var74 / super.field3954);
                        arg3[var66] = super.field3940.field7167 * var73 / super.field3954 + arg7.field754;
                    }
                } else {
                    for (int var75 = 0; ~var75 > ~var65.field8718; ++var75) {
                        int var115 = (arg6 << super.field2506) + var65.field8722[var75];
                        int var116 = var65.field8720[var75];
                        int var117 = (arg1 << super.field2506) + var65.field8714[var75];
                        int var118 = (super.field3951 * var115 + super.field3958 * var116 + super.field3949 * var117 >> 15) + super.field3938;
                        if (super.field3940.field7153 >= var118) {
                            return;
                        }
                        arg4[var75] = 0;
                        if (arg2) {
                            int var119 = -super.field3940.field7166 + var118;
                            if (~var119 < -256) {
                                var119 = 255;
                            }
                            if (~var119 < -1) {
                                arg4[var75] = var119;
                                int var120 = var65.field8721[var75] * var119 / 255;
                                if (~var120 < -1) {
                                    var116 -= var120;
                                }
                            }
                        } else if (super.field3940.field7171) {
                            int var121 = -super.field3940.field7166 + var118;
                            if (~var121 < -1) {
                                arg4[var75] = var121;
                                if (arg4[var75] > 255) {
                                    arg4[var75] = 255;
                                }
                            }
                        }
                        int var122 = (super.field3956 * var116 + super.field3955 * var115 + super.field3939 * var117 >> 15) + super.field3950;
                        int var123 = (super.field3943 * var116 + super.field3947 * var115 + super.field3944 * var117 >> 15) + super.field3948;
                        arg0[var75] = super.field3940.field7176 * var122 / var118 + arg7.field760;
                        arg3[var75] = super.field3940.field7167 * var123 / var118 + arg7.field754;
                    }
                }
                if (var65.field8715 != null) {
                    int var76 = super.field3945[arg6][arg1];
                    int var77 = super.field3945[arg6 + 1][arg1];
                    int var78 = super.field3945[arg6][arg1 + 1];
                    int var79 = super.field2504 * arg6;
                    int var80 = var79 - -super.field2504;
                    int var81 = super.field2504 * arg1;
                    int var82 = super.field2504 + var81;
                    int var83 = (super.field3956 * var76 + super.field3955 * var79 - -(super.field3939 * var81) >> 15) + super.field3950;
                    int var84 = (super.field3944 * var81 + super.field3947 * var79 + super.field3943 * var76 >> 15) + super.field3948;
                    int var85 = (super.field3949 * var81 + (super.field3951 * var79 - -(super.field3958 * var76)) >> 15) + super.field3938;
                    int var86 = (super.field3955 * var80 + super.field3956 * var77 + super.field3939 * var81 >> 15) + super.field3950;
                    int var87 = super.field3948 - -(super.field3947 * var80 + super.field3944 * var81 - -(super.field3943 * var77) >> 15);
                    int var88 = super.field3938 - -(super.field3949 * var81 + (super.field3951 * var80 - -(super.field3958 * var77)) >> 15);
                    int var89 = (super.field3955 * var79 + (super.field3956 * var78 - -(super.field3939 * var82)) >> 15) + super.field3950;
                    int var90 = super.field3948 - -(super.field3947 * var79 - -(super.field3943 * var78) - -(super.field3944 * var82) >> 15);
                    int var91 = (super.field3949 * var82 + super.field3958 * var78 + super.field3951 * var79 >> 15) + super.field3938;
                    for (int var92 = 0; ~var92 > ~var65.field8719; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg0[var93];
                        int var97 = arg0[var94];
                        int var98 = arg0[var95];
                        int var99 = arg3[var93];
                        int var100 = arg3[var94];
                        int var101 = arg3[var95];
                        int var102 = arg4[var94] + arg4[var95] + arg4[var93];
                        if (~((-var97 + var96) * (-var100 + var101) - (-var97 + var98) * (-var100 + var99)) < -1) {
                            arg7.field759 = var96 < 0 || ~var97 > -1 || ~var98 > -1 || arg7.field757 < var96 || arg7.field757 < var97 || ~var98 < ~arg7.field757;
                            short var103 = var65.field8715[var92];
                            if (var102 < 765) {
                                if (~var103 != 0 && this.method1831(super.field3940.field2924.method190((byte) -89, var103).field2984)) {
                                    arg7.field753 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 == -1) {
                                        if ((16777215 & var65.field8713[var93]) != 0) {
                                            arg7.method372(var99, var100, var101, var96, var97, var98, class211.method1383(-114, super.field3940.field7180 | arg4[var93] << 24, var65.field8713[var93]), class211.method1383(-118, arg4[var94] << 24 | super.field3940.field7180, var65.field8713[var94]), class211.method1383(-123, super.field3940.field7180 | arg4[var95] << 24, var65.field8713[var95]));
                                        }
                                    } else {
                                        arg7.method377(var99, var100, var101, var96, var97, var98, super.field3940.field7180, arg4[var93], arg4[var94], arg4[var95], var65.field8713[var93], var65.field8713[var94], var65.field8713[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    }
                                } else if (~var103 != 0) {
                                    arg7.method380(var99, var100, var101, var96, var97, var98, var65.field8713[var93], var65.field8713[var94], var65.field8713[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var65.field8713[var93] & 16777215) != 0) {
                                    arg7.method372(var99, var100, var101, var96, var97, var98, var65.field8713[var93], var65.field8713[var94], var65.field8713[var95]);
                                }
                                arg7.field753 = 0;
                            } else {
                                arg7.method373(var99, var100, var101, var96, var97, var98, super.field3940.field7180);
                            }
                        }
                    }
                } else {
                    for (int var104 = 0; var65.field8719 > var104; ++var104) {
                        int var105 = var104 * 3;
                        int var106 = var105 + 1;
                        int var107 = var106 - -1;
                        int var108 = arg0[var105];
                        int var109 = arg0[var106];
                        int var110 = arg0[var107];
                        int var111 = arg3[var105];
                        int var112 = arg3[var106];
                        int var113 = arg3[var107];
                        int var114 = arg4[var105] - (-arg4[var106] - arg4[var107]);
                        if ((-var109 + var108) * (-var112 + var113) - (var110 - var109) * (var111 - var112) > 0) {
                            arg7.field759 = var108 < 0 || var109 < 0 || ~var110 > -1 || var108 > arg7.field757 || ~arg7.field757 > ~var109 || ~arg7.field757 > ~var110;
                            if (~var114 > -766) {
                                if (~var114 < -1) {
                                    if (~(var65.field8713[var105] & 16777215) != -1) {
                                        arg7.method372(var111, var112, var113, var108, var109, var110, class15.method176(var65.field8713[var105], (byte) -59, super.field3940.field7180, arg4[var105]), class15.method176(var65.field8713[var106], (byte) -59, super.field3940.field7180, arg4[var106]), class15.method176(var65.field8713[var107], (byte) -59, super.field3940.field7180, arg4[var107]));
                                    }
                                } else if (~(var65.field8713[var105] & 16777215) != -1) {
                                    arg7.method372(var111, var112, var113, var108, var109, var110, var65.field8713[var105], var65.field8713[var106], var65.field8713[var107]);
                                }
                            } else {
                                arg7.method373(var111, var112, var113, var108, var109, var110, super.field3940.field7180);
                            }
                        }
                    }
                }
            }
            if (arg5 <= 31) {
                field7329 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II)V")
    public final void method1101(int arg0, int arg1) {
        ++field7326;
        class16 var3 = (class16) super.field3940.method1372(Thread.currentThread());
        var3.field211.field753 = 0;
        if (super.field3937 != null) {
            this.method3003(var3.field5595, arg1, super.field3940.field7152, var3.field5605, var3.field5598, (byte) 69, arg0, var3.field211);
        } else if (super.field3942 != null) {
            this.method2999(arg1, var3.field5598, var3.field211, var3.field5595, 1, var3.field5605, arg0);
        }
    }

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "(II)Z")
    public static final boolean method3004(int arg0, int arg1) {
        class219.field3143 = true;
        if (arg1 != 504757583) {
            method3004(7, 39);
        }
        ++field7327;
        class467.field6578 = arg0 + 1 & 65535;
        return true;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(II[[ZIIZ[I[ILvba;III)V")
    private final void method3005(int arg0, int arg1, boolean[][] arg2, int arg3, int arg4, boolean arg5, int[] arg6, int[] arg7, class36 arg8, int arg9, int arg10, int arg11) {
        ++field7320;
        int var13 = (-arg9 + arg4) * arg10 / 256;
        arg8.field762 = arg5;
        int var14 = arg10 >> 8;
        arg8.field750 = false;
        int var15 = arg3;
        int var16 = arg0 - -var13;
        for (int var17 = arg11; arg1 > var17; ++var17) {
            for (int var18 = arg9; arg4 > var18; ++var18) {
                if (arg2[var17 - arg11][-arg9 + var18]) {
                    if (super.field3942[var17][var18] != null) {
                        class616 var19 = super.field3942[var17][var18];
                        if (~var19.field8844 != 0 && (var19.field8843 & 2) == 0 && ~var19.field8846 == 0) {
                            int var20 = super.field3940.method2953(var19.field8844);
                            arg8.method384(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var15 - -var14, class306.method1937(var20, 127, 65535 & var19.field8847), class306.method1937(var20, 127, 65535 & var19.field8845), class306.method1937(var20, 127, 65535 & var19.field8841));
                            arg8.method384(var16, var16, -var14 + var16, var15, var14 + var15, var15, class306.method1937(var20, 127, 65535 & var19.field8842), class306.method1937(var20, 127, 65535 & var19.field8841), class306.method1937(var20, 127, 65535 & var19.field8845));
                        } else if (~var19.field8846 != 0) {
                            int var21 = var19.field8846;
                            arg8.method384(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var21, var21, var21);
                            arg8.method384(var16, var16, -var14 + var16, var15, var14 + var15, var15, var21, var21, var21);
                        } else {
                            arg8.method384(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var15 - -var14, 65535 & var19.field8847, 65535 & var19.field8845, 65535 & var19.field8841);
                            arg8.method384(var16, var16, -var14 + var16, var15, var14 + var15, var15, var19.field8842 & 65535, 65535 & var19.field8841, var19.field8845 & 65535);
                        }
                    } else if (super.field3946[var17][var18] != null) {
                        class292 var22 = super.field3946[var17][var18];
                        for (int var23 = 0; var23 < var22.field4022; ++var23) {
                            arg6[var23] = var22.field4014[var23] * var14 / super.field2504 + var15;
                            arg7[var23] = -(var22.field4019[var23] * var14 / super.field2504) + var16;
                        }
                        for (int var24 = 0; ~var22.field4018 < ~var24; ++var24) {
                            short var25 = var22.field4023[var24];
                            short var26 = var22.field4024[var24];
                            short var27 = var22.field4025[var24];
                            int var28 = arg6[var25];
                            int var29 = arg6[var26];
                            int var30 = arg6[var27];
                            int var31 = arg7[var25];
                            int var32 = arg7[var26];
                            int var33 = arg7[var27];
                            if (var22.field4017 != null && var22.field4017[var24] != -1) {
                                int var34 = var22.field4017[var24];
                                arg8.method384(var31, var32, var33, var28, var29, var30, class306.method1937(var34, 127, var22.field4021[var25]), class306.method1937(var34, 127, var22.field4021[var26]), class306.method1937(var34, 127, var22.field4021[var27]));
                            } else if (var22.field4016 != null && var22.field4016[var24] != -1) {
                                int var35 = super.field3940.method2953(var22.field4016[var24]);
                                arg8.method384(var31, var32, var33, var28, var29, var30, class306.method1937(var35, 127, var22.field4021[var25]), class306.method1937(var35, 127, var22.field4021[var26]), class306.method1937(var35, 127, var22.field4021[var27]));
                            } else {
                                int var36 = var22.field4026[var24];
                                arg8.method384(var31, var32, var33, var28, var29, var30, class306.method1937(var36, 127, var22.field4021[var25]), class306.method1937(var36, 127, var22.field4021[var26]), class306.method1937(var36, 127, var22.field4021[var27]));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg0 + var13;
            var15 += var14;
        }
        arg8.field762 = true;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V")
    public static final void method3006(int arg0) {
        ++field7322;
        if (!class310.field4181) {
            if (arg0 == 22783) {
                if (!class491.field6875.field3369) {
                    class301.field4121 += (-class301.field4121 + -12.0F) / 2.0F;
                } else {
                    class18.field224 = (float) (-16 & (int) class18.field224 + -17);
                }
                class494.field6921 = true;
                class310.field4181 = true;
            }
        }
    }
}
