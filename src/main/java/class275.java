import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class275 extends class287 {

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "Lpe;")
    public static class524 field3809;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILft;[I[III[I[I)V")
    private final void method1773(int arg0, class4 arg1, int[] arg2, int[] arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        ++field3806;
        class616 var9 = super.field3942[arg4][arg5];
        if (var9 != null) {
            if (~(2 & var9.field8843) == -1) {
                int var10 = super.field2504 * arg4;
                int var11 = super.field2504 + var10;
                int var12 = super.field2504 * arg5;
                int var13 = super.field2504 + var12;
                int var18;
                int var19;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var30;
                int var31;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                if ((var9.field8843 & 1) == 0) {
                    int var14 = super.field3945[arg4][arg5];
                    int var15 = super.field3945[arg4 + 1][arg5];
                    int var16 = super.field3945[arg4 + 1][arg5 - -1];
                    int var17 = super.field3945[arg4][arg5 + 1];
                    if (~super.field3954 != 0) {
                        var18 = super.field3954;
                        var19 = super.field3954;
                        var20 = super.field3954;
                        var21 = super.field3954;
                    } else {
                        var21 = super.field3938 - -(super.field3949 * var12 + super.field3958 * var14 + super.field3951 * var10 >> 15);
                        if (~super.field3940.field7153 <= ~var21) {
                            return;
                        }
                        var20 = (super.field3951 * var11 + (super.field3958 * var15 - -(super.field3949 * var12)) >> 15) + super.field3938;
                        if (var20 <= super.field3940.field7153) {
                            return;
                        }
                        var19 = super.field3938 - -(super.field3958 * var16 + super.field3951 * var11 + super.field3949 * var13 >> 15);
                        if (~super.field3940.field7153 <= ~var19) {
                            return;
                        }
                        var18 = super.field3938 - -(super.field3949 * var13 + (super.field3951 * var10 - -(super.field3958 * var17)) >> 15);
                        if (var18 <= super.field3940.field7153) {
                            return;
                        }
                    }
                    var22 = (super.field3955 * var10 + super.field3956 * var14 + super.field3939 * var12 >> 15) + super.field3950;
                    var23 = (super.field3943 * var14 + super.field3947 * var10 + super.field3944 * var12 >> 15) + super.field3948;
                    var24 = super.field3940.field7176 * var22 / var21 + arg1.field49;
                    var25 = super.field3950 - -(super.field3955 * var11 + super.field3939 * var12 - -(super.field3956 * var15) >> 15);
                    var26 = super.field3940.field7167 * var23 / var21 + arg1.field52;
                    var27 = (super.field3947 * var11 - -(super.field3943 * var15) - -(super.field3944 * var12) >> 15) + super.field3948;
                    var28 = super.field3940.field7176 * var25 / var20 + arg1.field49;
                    int var29 = (super.field3939 * var13 + super.field3956 * var16 + super.field3955 * var11 >> 15) + super.field3950;
                    var30 = super.field3940.field7167 * var27 / var20 + arg1.field52;
                    var31 = super.field3940.field7176 * var29 / var19 + arg1.field49;
                    int var32 = (super.field3947 * var11 + (super.field3943 * var16 - -(super.field3944 * var13)) >> 15) + super.field3948;
                    var33 = super.field3950 - -(super.field3939 * var13 + super.field3956 * var17 + super.field3955 * var10 >> 15);
                    var34 = super.field3940.field7167 * var32 / var19 + arg1.field52;
                    var35 = (super.field3943 * var17 + super.field3947 * var10 + super.field3944 * var13 >> 15) + super.field3948;
                    var36 = super.field3940.field7176 * var33 / var18 + arg1.field49;
                    var37 = super.field3940.field7167 * var35 / var18 + arg1.field52;
                } else {
                    int var38 = super.field3945[arg4][arg5];
                    if (super.field3954 == -1) {
                        int var39 = super.field3958 * var38;
                        var21 = (super.field3949 * var12 + super.field3951 * var10 + var39 >> 15) + super.field3938;
                        if (~super.field3940.field7153 <= ~var21) {
                            return;
                        }
                        var20 = (super.field3949 * var12 + (super.field3951 * var11 - -var39) >> 15) + super.field3938;
                        if (~var20 >= ~super.field3940.field7153) {
                            return;
                        }
                        var19 = (super.field3951 * var11 + var39 - -(super.field3949 * var13) >> 15) + super.field3938;
                        if (super.field3940.field7153 >= var19) {
                            return;
                        }
                        var18 = (super.field3951 * var10 + super.field3949 * var13 + var39 >> 15) + super.field3938;
                        if (super.field3940.field7153 >= var18) {
                            return;
                        }
                    } else {
                        var18 = super.field3954;
                        var19 = super.field3954;
                        var20 = super.field3954;
                        var21 = super.field3954;
                    }
                    int var40 = super.field3956 * var38;
                    int var41 = super.field3943 * var38;
                    var22 = (super.field3939 * var12 + super.field3955 * var10 + var40 >> 15) + super.field3950;
                    var24 = super.field3940.field7176 * var22 / var21 + arg1.field49;
                    var23 = (super.field3947 * var10 + var41 - -(super.field3944 * var12) >> 15) + super.field3948;
                    var26 = super.field3940.field7167 * var23 / var21 + arg1.field52;
                    var25 = (super.field3939 * var12 + (super.field3955 * var11 - -var40) >> 15) + super.field3950;
                    var28 = super.field3940.field7176 * var25 / var20 + arg1.field49;
                    var27 = (super.field3947 * var11 + super.field3944 * var12 + var41 >> 15) + super.field3948;
                    var30 = arg1.field52 - -(super.field3940.field7167 * var27 / var20);
                    int var42 = (super.field3939 * var13 + super.field3955 * var11 + var40 >> 15) + super.field3950;
                    int var43 = (super.field3944 * var13 + (super.field3947 * var11 - -var41) >> 15) + super.field3948;
                    var31 = super.field3940.field7176 * var42 / var19 + arg1.field49;
                    var33 = (super.field3939 * var13 + super.field3955 * var10 + var40 >> 15) + super.field3950;
                    var34 = arg1.field52 - -(super.field3940.field7167 * var43 / var19);
                    var35 = (super.field3947 * var10 + var41 - -(super.field3944 * var13) >> 15) + super.field3948;
                    var36 = super.field3940.field7176 * var33 / var18 + arg1.field49;
                    var37 = super.field3940.field7167 * var35 / var18 + arg1.field52;
                }
                if ((var31 - var36) * (-var37 + var30) + -((-var36 + var28) * (-var37 + var34)) > 0) {
                    arg1.field54 = ~var31 > -1 || ~var36 > -1 || var28 < 0 || ~var31 < ~arg1.field55 || ~arg1.field55 > ~var36 || arg1.field55 < var28;
                    if (~var9.field8844 <= -1) {
                        if (this.method1831(super.field3940.field2924.method190((byte) -89, var9.field8844).field2984)) {
                            arg1.field58 = 100;
                        }
                        arg1.method22(var34, var37, var30, var31, var36, var28, var9.field8847 & 65535, 65535 & var9.field8845, var9.field8841 & 65535, var22, var25, var33, var23, var27, var35, var21, var20, var18, var9.field8844);
                        arg1.field58 = 0;
                    } else {
                        arg1.method25(var34, var37, var30, var31, var36, var28, var19, var18, var20, var9.field8847 & 65535, var9.field8845 & 65535, 65535 & var9.field8841);
                    }
                }
                if ((-var28 + var24) * (-var30 + var37) + -((var26 - var30) * (-var28 + var36)) > 0) {
                    arg1.field54 = var24 < 0 || ~var28 > -1 || var36 < 0 || var24 > arg1.field55 || ~var28 < ~arg1.field55 || arg1.field55 < var36;
                    if (var9.field8844 >= 0) {
                        if (this.method1831(super.field3940.field2924.method190((byte) -89, var9.field8844).field2984)) {
                            arg1.field58 = 100;
                        }
                        arg1.method22(var26, var30, var37, var24, var28, var36, 65535 & var9.field8842, 65535 & var9.field8841, var9.field8845 & 65535, var22, var25, var33, var23, var27, var35, var21, var20, var18, var9.field8844);
                        arg1.field58 = 0;
                        return;
                    }
                    arg1.method25(var26, var30, var37, var24, var28, var36, var21, var20, var18, 65535 & var9.field8842, 65535 & var9.field8841, 65535 & var9.field8845);
                }
            }
        } else {
            class292 var44 = super.field3946[arg4][arg5];
            if (var44 != null) {
                if (~super.field3954 != 0) {
                    for (int var45 = 0; var45 < var44.field4022; ++var45) {
                        int var46 = (arg4 << super.field2506) + var44.field4014[var45];
                        short var47 = var44.field4020[var45];
                        int var48 = var44.field4019[var45] - -(arg5 << super.field2506);
                        int var49 = super.field3950 - -(super.field3955 * var46 - (-(super.field3956 * var47) + -(super.field3939 * var48)) >> 15);
                        int var50 = super.field3948 - -(super.field3944 * var48 + super.field3947 * var46 + super.field3943 * var47 >> 15);
                        arg7[var45] = super.field3940.field7176 * var49 / super.field3954 + arg1.field49;
                        arg2[var45] = arg1.field52 - -(super.field3940.field7167 * var50 / super.field3954);
                        arg3[var45] = super.field3954;
                    }
                } else {
                    for (int var51 = 0; var44.field4022 > var51; ++var51) {
                        int var91 = (arg4 << super.field2506) + var44.field4014[var51];
                        short var92 = var44.field4020[var51];
                        int var93 = var44.field4019[var51] - -(arg5 << super.field2506);
                        int var94 = (super.field3949 * var93 + (super.field3951 * var91 - -(super.field3958 * var92)) >> 15) + super.field3938;
                        if (~super.field3940.field7153 <= ~var94) {
                            return;
                        }
                        int var95 = (super.field3956 * var92 + super.field3955 * var91 - -(super.field3939 * var93) >> 15) + super.field3950;
                        int var96 = super.field3948 - -(super.field3944 * var93 + super.field3947 * var91 + super.field3943 * var92 >> 15);
                        arg7[var51] = arg1.field49 - -(super.field3940.field7176 * var95 / var94);
                        arg2[var51] = arg1.field52 - -(super.field3940.field7167 * var96 / var94);
                        arg3[var51] = var94;
                    }
                }
                if (var44.field4016 == null) {
                    for (int var52 = 0; ~var44.field4018 < ~var52; ++var52) {
                        short var53 = var44.field4023[var52];
                        short var54 = var44.field4024[var52];
                        short var55 = var44.field4025[var52];
                        int var56 = arg7[var53];
                        int var57 = arg7[var54];
                        int var58 = arg7[var55];
                        int var59 = arg2[var53];
                        int var60 = arg2[var54];
                        int var61 = arg2[var55];
                        if (~((var56 - var57) * (-var60 + var61) + -((var59 - var60) * (-var57 + var58))) < -1) {
                            int var62 = var44.field4026[var52];
                            if (var62 != -1) {
                                arg1.field54 = var56 < 0 || ~var57 > -1 || ~var58 > -1 || var56 > arg1.field55 || var57 > arg1.field55 || ~var58 < ~arg1.field55;
                                arg1.method25(var59, var60, var61, var56, var57, var58, arg3[1], arg3[2], arg3[3], class306.method1937(var62, 127, var44.field4021[var53]), class306.method1937(var62, 127, var44.field4021[var54]), class306.method1937(var62, 127, var44.field4021[var55]));
                            }
                        }
                    }
                } else {
                    int var63 = super.field3945[arg4][arg5];
                    int var64 = super.field3945[arg4 + 1][arg5];
                    int var65 = super.field3945[arg4][arg5 - -1];
                    int var66 = super.field2504 * arg4;
                    int var67 = super.field2504 + var66;
                    int var68 = super.field2504 * arg5;
                    int var69 = super.field2504 + var68;
                    int var70 = (super.field3956 * var63 + super.field3955 * var66 + super.field3939 * var68 >> 15) + super.field3950;
                    int var71 = super.field3948 - -(super.field3947 * var66 + (super.field3943 * var63 - -(super.field3944 * var68)) >> 15);
                    int var72 = (super.field3949 * var68 + super.field3958 * var63 + super.field3951 * var66 >> 15) + super.field3938;
                    int var73 = (super.field3939 * var68 + super.field3956 * var64 + super.field3955 * var67 >> 15) + super.field3950;
                    int var74 = (super.field3943 * var64 + super.field3947 * var67 + super.field3944 * var68 >> 15) + super.field3948;
                    int var75 = (super.field3949 * var68 + super.field3958 * var64 + super.field3951 * var67 >> 15) + super.field3938;
                    int var76 = (super.field3955 * var66 + (super.field3956 * var65 - -(super.field3939 * var69)) >> 15) + super.field3950;
                    int var77 = (super.field3944 * var69 + (super.field3947 * var66 - -(super.field3943 * var65)) >> 15) + super.field3948;
                    int var78 = (super.field3949 * var69 + super.field3958 * var65 + super.field3951 * var66 >> 15) + super.field3938;
                    for (int var79 = 0; var79 < var44.field4018; ++var79) {
                        short var80 = var44.field4023[var79];
                        short var81 = var44.field4024[var79];
                        short var82 = var44.field4025[var79];
                        int var83 = arg7[var80];
                        int var84 = arg7[var81];
                        int var85 = arg7[var82];
                        int var86 = arg2[var80];
                        int var87 = arg2[var81];
                        int var88 = arg2[var82];
                        if (~((var83 - var84) * (-var87 + var88) + -((-var84 + var85) * (-var87 + var86))) < -1) {
                            arg1.field54 = ~var83 > -1 || ~var84 > -1 || var85 < 0 || ~arg1.field55 > ~var83 || ~var84 < ~arg1.field55 || ~var85 < ~arg1.field55;
                            short var89 = var44.field4016[var79];
                            if (var89 != -1) {
                                if (this.method1831(super.field3940.field2924.method190((byte) -89, var89).field2984)) {
                                    arg1.field58 = 100;
                                }
                                arg1.method22(var86, var87, var88, var83, var84, var85, var44.field4021[var80], var44.field4021[var81], var44.field4021[var82], var70, var73, var76, var71, var74, var77, var72, var75, var78, var89);
                                arg1.field58 = 0;
                            } else {
                                int var90 = var44.field4026[var79];
                                if (var90 != -1) {
                                    arg1.method25(var86, var87, var88, var83, var84, var85, arg3[1], arg3[2], arg3[3], class306.method1937(var90, 127, var44.field4021[var80]), class306.method1937(var90, 127, var44.field4021[var81]), class306.method1937(var90, arg0 ^ -402499920, var44.field4021[var82]));
                                }
                            }
                        }
                    }
                }
            }
            if (arg0 != -402499889) {
                field3809 = null;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([I[IB[IILft;[IIZ)V")
    private final void method1774(int[] arg0, int[] arg1, byte arg2, int[] arg3, int arg4, class4 arg5, int[] arg6, int arg7, boolean arg8) {
        ++field3811;
        class102 var10 = super.field3937[arg7][arg4];
        if (var10 != null) {
            if (~(var10.field1548 & 2) == -1) {
                int var11 = super.field2504 * arg7;
                int var12 = super.field2504 + var11;
                int var13 = super.field2504 * arg4;
                int var14 = var13 - -super.field2504;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var20;
                int var21;
                int var22;
                int var23;
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
                int var46;
                if ((1 & var10.field1548) != 0 && !arg8) {
                    int var19 = super.field3945[arg7][arg4];
                    if (super.field3954 != -1) {
                        var20 = super.field3954;
                        var21 = super.field3954;
                        var22 = super.field3954;
                        var23 = super.field3954;
                    } else {
                        int var24 = super.field3958 * var19;
                        var23 = (super.field3949 * var13 + super.field3951 * var11 + var24 >> 15) + super.field3938;
                        if (super.field3940.field7153 >= var23) {
                            return;
                        }
                        var22 = (super.field3949 * var13 + (super.field3951 * var12 - -var24) >> 15) + super.field3938;
                        if (var22 <= super.field3940.field7153) {
                            return;
                        }
                        var21 = super.field3938 - -(super.field3949 * var14 + super.field3951 * var12 + var24 >> 15);
                        if (var21 <= super.field3940.field7153) {
                            return;
                        }
                        var20 = (super.field3949 * var14 + super.field3951 * var11 + var24 >> 15) + super.field3938;
                        if (~var20 >= ~super.field3940.field7153) {
                            return;
                        }
                    }
                    if (super.field3940.field7171) {
                        int var25 = -super.field3940.field7166 + var23;
                        if (var25 > 0) {
                            var15 = var25;
                            if (~var25 < -256) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - super.field3940.field7166;
                        if (~var26 < -1) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = -super.field3940.field7166 + var21;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (~var27 < -256) {
                                var17 = 255;
                            }
                        }
                        int var28 = var20 - super.field3940.field7166;
                        if (~var28 < -1) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    int var29 = super.field3956 * var19;
                    int var30 = super.field3943 * var19;
                    var31 = super.field3950 - -(super.field3955 * var11 + super.field3939 * var13 + var29 >> 15);
                    var32 = arg5.field49 - -(super.field3940.field7176 * var31 / var23);
                    var33 = (super.field3947 * var11 + super.field3944 * var13 + var30 >> 15) + super.field3948;
                    var34 = (super.field3939 * var13 + (super.field3955 * var12 - -var29) >> 15) + super.field3950;
                    var35 = super.field3940.field7167 * var33 / var23 + arg5.field52;
                    var36 = (super.field3944 * var13 + super.field3947 * var12 + var30 >> 15) + super.field3948;
                    var37 = arg5.field49 - -(super.field3940.field7176 * var34 / var22);
                    var38 = super.field3940.field7167 * var36 / var22 + arg5.field52;
                    var39 = super.field3950 - -(super.field3955 * var12 - -(super.field3939 * var14) + var29 >> 15);
                    var40 = super.field3940.field7176 * var39 / var21 + arg5.field49;
                    var41 = (super.field3944 * var14 + super.field3947 * var12 + var30 >> 15) + super.field3948;
                    var42 = super.field3940.field7167 * var41 / var21 + arg5.field52;
                    var43 = (super.field3939 * var14 + (super.field3955 * var11 - -var29) >> 15) + super.field3950;
                    var44 = (super.field3947 * var11 + super.field3944 * var14 + var30 >> 15) + super.field3948;
                    var45 = super.field3940.field7176 * var43 / var20 + arg5.field49;
                    var46 = super.field3940.field7167 * var44 / var20 + arg5.field52;
                } else {
                    int var47 = super.field3945[arg7][arg4];
                    int var48 = super.field3945[arg7 - -1][arg4];
                    int var49 = super.field3945[arg7 + 1][arg4 + 1];
                    int var50 = super.field3945[arg7][arg4 + 1];
                    if (super.field3954 == -1) {
                        var23 = (super.field3949 * var13 + super.field3958 * var47 + super.field3951 * var11 >> 15) + super.field3938;
                        if (var23 <= super.field3940.field7153) {
                            return;
                        }
                        var22 = (super.field3949 * var13 + super.field3958 * var48 + super.field3951 * var12 >> 15) + super.field3938;
                        if (var22 <= super.field3940.field7153) {
                            return;
                        }
                        var21 = (super.field3951 * var12 + super.field3949 * var14 - -(super.field3958 * var49) >> 15) + super.field3938;
                        if (super.field3940.field7153 >= var21) {
                            return;
                        }
                        var20 = (super.field3951 * var11 + super.field3949 * var14 - -(super.field3958 * var50) >> 15) + super.field3938;
                        if (super.field3940.field7153 >= var20) {
                            return;
                        }
                    } else {
                        var20 = super.field3954;
                        var21 = super.field3954;
                        var22 = super.field3954;
                        var23 = super.field3954;
                    }
                    if (arg8) {
                        int var51 = -super.field3940.field7166 + var23;
                        if (~var51 < -256) {
                            var51 = 255;
                        }
                        if (~var51 < -1) {
                            var15 = var51;
                            int var52 = var10.field1546 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = -super.field3940.field7166 + var22;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var16 = var53;
                            int var54 = var10.field1550 * var53 / 255;
                            if (var54 > 0) {
                                var48 -= var54;
                            }
                        }
                        int var55 = -super.field3940.field7166 + var21;
                        if (~var55 < -256) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field1552 * var55 / 255;
                            if (~var56 < -1) {
                                var49 -= var56;
                            }
                        }
                        int var57 = -super.field3940.field7166 + var20;
                        if (~var57 < -256) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var18 = var57;
                            int var58 = var10.field1547 * var57 / 255;
                            if (~var58 < -1) {
                                var50 -= var58;
                            }
                        }
                    } else if (super.field3940.field7171) {
                        int var59 = -super.field3940.field7166 + var23;
                        if (~var59 < -1) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = -super.field3940.field7166 + var22;
                        if (~var60 < -1) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = -super.field3940.field7166 + var21;
                        if (~var61 < -1) {
                            var17 = var61;
                            if (~var61 < -256) {
                                var17 = 255;
                            }
                        }
                        int var62 = var20 - super.field3940.field7166;
                        if (~var62 < -1) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    var31 = (super.field3956 * var47 + super.field3955 * var11 + super.field3939 * var13 >> 15) + super.field3950;
                    var33 = (super.field3943 * var47 + super.field3947 * var11 + super.field3944 * var13 >> 15) + super.field3948;
                    var32 = arg5.field49 - -(super.field3940.field7176 * var31 / var23);
                    var34 = (super.field3956 * var48 + super.field3955 * var12 - -(super.field3939 * var13) >> 15) + super.field3950;
                    var35 = arg5.field52 - -(super.field3940.field7167 * var33 / var23);
                    var37 = arg5.field49 - -(super.field3940.field7176 * var34 / var22);
                    var36 = (super.field3944 * var13 + super.field3947 * var12 + super.field3943 * var48 >> 15) + super.field3948;
                    var38 = super.field3940.field7167 * var36 / var22 + arg5.field52;
                    var39 = (super.field3939 * var14 + (super.field3955 * var12 - -(super.field3956 * var49)) >> 15) + super.field3950;
                    var40 = super.field3940.field7176 * var39 / var21 + arg5.field49;
                    var41 = (super.field3944 * var14 + (super.field3947 * var12 - -(super.field3943 * var49)) >> 15) + super.field3948;
                    var42 = super.field3940.field7167 * var41 / var21 + arg5.field52;
                    var43 = (super.field3939 * var14 + super.field3956 * var50 + super.field3955 * var11 >> 15) + super.field3950;
                    var45 = arg5.field49 - -(super.field3940.field7176 * var43 / var20);
                    var44 = (super.field3947 * var11 + super.field3944 * var14 - -(super.field3943 * var50) >> 15) + super.field3948;
                    var46 = arg5.field52 - -(super.field3940.field7167 * var44 / var20);
                }
                boolean var63 = var10.field1545 != -1 && this.method1831(super.field3940.field2924.method190((byte) -89, var10.field1545).field2984);
                int var64 = var16 + var17 + var18;
                if ((-var45 + var40) * (-var46 + var38) + -((-var45 + var37) * (-var46 + var42)) > 0) {
                    arg5.field54 = var40 < 0 || var45 < 0 || ~var37 > -1 || ~var40 < ~arg5.field55 || arg5.field55 < var45 || ~var37 < ~arg5.field55;
                    if (var64 >= 765) {
                        arg5.method24(var42, var46, var38, var40, var45, var37, var21, var20, var22, super.field3940.field7180);
                    } else {
                        if (var63) {
                            arg5.field58 = 100;
                        }
                        if (var64 <= 0) {
                            if (var10.field1545 < 0) {
                                arg5.method26(var42, var46, var38, var40, var45, var37, var21, var20, var22, var10.field1553, var10.field1551, var10.field1555);
                            } else {
                                arg5.method22(var42, var46, var38, var40, var45, var37, var10.field1553, var10.field1551, var10.field1555, var39, var43, var34, var41, var44, var36, var21, var20, var22, var10.field1545);
                            }
                        } else if (~var10.field1545 <= -1) {
                            arg5.method20(var42, var46, var38, var40, var45, var37, var21, var20, var22, super.field3940.field7180, var17, var18, var16, var10.field1553, var10.field1551, var10.field1555, var39, var43, var34, var41, var44, var36, var21, var20, var22, var10.field1545);
                        } else {
                            arg5.method26(var42, var46, var38, var40, var45, var37, var21, var20, var22, class211.method1383(-126, super.field3940.field7180 | var17 << 24, var10.field1553), class211.method1383(arg2 + -28, super.field3940.field7180 | var18 << 24, var10.field1551), class211.method1383(-117, var16 << 24 | super.field3940.field7180, var10.field1555));
                        }
                        arg5.field58 = 0;
                    }
                }
                int var65 = var15 + var16 + var18;
                if (~((-var37 + var32) * (-var38 + var46) + -((var45 - var37) * (-var38 + var35))) < -1) {
                    arg5.field54 = ~var32 > -1 || ~var37 > -1 || var45 < 0 || ~var32 < ~arg5.field55 || ~var37 < ~arg5.field55 || ~arg5.field55 > ~var45;
                    if (var65 >= 765) {
                        arg5.method24(var35, var38, var46, var32, var37, var45, var23, var22, var20, super.field3940.field7180);
                        return;
                    }
                    if (var63) {
                        arg5.field58 = 100;
                    }
                    if (~var65 < -1) {
                        if (var10.field1545 >= 0) {
                            arg5.method20(var35, var38, var46, var32, var37, var45, var23, var22, var20, super.field3940.field7180, var15, var16, var18, var10.field1549, var10.field1555, var10.field1551, var31, var34, var43, var33, var36, var44, var23, var22, var20, var10.field1545);
                        } else {
                            arg5.method26(var35, var38, var46, var32, var37, var45, var23, var22, var20, class211.method1383(-118, super.field3940.field7180 | var15 << 24, var10.field1549), class211.method1383(-113, var16 << 24 | super.field3940.field7180, var10.field1555), class211.method1383(-117, var18 << 24 | super.field3940.field7180, var10.field1551));
                        }
                    } else if (~var10.field1545 > -1) {
                        arg5.method26(var35, var38, var46, var32, var37, var45, var23, var22, var20, var10.field1549, var10.field1555, var10.field1551);
                    } else {
                        arg5.method22(var35, var38, var46, var32, var37, var45, var10.field1549, var10.field1555, var10.field1551, var31, var34, var43, var33, var36, var44, var23, var22, var20, var10.field1545);
                    }
                    arg5.field58 = 0;
                }
            }
        } else {
            class605 var66 = super.field3941[arg7][arg4];
            if (arg2 != -91) {
                field3809 = null;
            }
            if (var66 != null) {
                if (~super.field3954 == 0) {
                    for (int var67 = 0; var67 < var66.field8718; ++var67) {
                        int var68 = var66.field8722[var67] - -(arg7 << super.field2506);
                        int var69 = var66.field8720[var67];
                        int var70 = var66.field8714[var67] - -(arg4 << super.field2506);
                        int var71 = super.field3938 - -(super.field3949 * var70 + (super.field3951 * var68 - -(super.field3958 * var69)) >> 15);
                        if (var71 <= super.field3940.field7153) {
                            return;
                        }
                        arg1[var67] = 0;
                        if (arg8) {
                            int var72 = -super.field3940.field7166 + var71;
                            if (~var72 < -256) {
                                var72 = 255;
                            }
                            if (var72 > 0) {
                                arg1[var67] = var72;
                                int var73 = var66.field8721[var67] * var72 / 255;
                                if (var73 > 0) {
                                    var69 -= var73;
                                }
                            }
                        } else if (super.field3940.field7171) {
                            int var74 = -super.field3940.field7166 + var71;
                            if (~var74 < -1) {
                                arg1[var67] = var74;
                                if (arg1[var67] > 255) {
                                    arg1[var67] = 255;
                                }
                            }
                        }
                        int var75 = (super.field3955 * var68 - (-(super.field3956 * var69) + -(super.field3939 * var70)) >> 15) + super.field3950;
                        int var76 = (super.field3947 * var68 - (-(super.field3944 * var70) + -(super.field3943 * var69)) >> 15) + super.field3948;
                        arg0[var67] = super.field3940.field7176 * var75 / var71 + arg5.field49;
                        arg6[var67] = arg5.field52 - -(super.field3940.field7167 * var76 / var71);
                        arg3[var67] = var71;
                    }
                } else {
                    for (int var77 = 0; ~var66.field8718 < ~var77; ++var77) {
                        int var117 = var66.field8722[var77] - -(arg7 << super.field2506);
                        int var118 = var66.field8720[var77];
                        int var119 = (arg4 << super.field2506) + var66.field8714[var77];
                        arg1[var77] = 0;
                        if (arg8) {
                            int var120 = -super.field3940.field7166 + super.field3954;
                            if (var120 > 255) {
                                var120 = 255;
                            }
                            if (~var120 < -1) {
                                arg1[var77] = var120;
                                int var121 = var66.field8721[var77] * var120 / 255;
                                if (var121 > 0) {
                                    var118 -= var121;
                                }
                            }
                        } else if (super.field3940.field7171) {
                            int var122 = -super.field3940.field7166 + super.field3954;
                            if (var122 > 0) {
                                arg1[var77] = var122;
                                if (~arg1[var77] < -256) {
                                    arg1[var77] = 255;
                                }
                            }
                        }
                        int var123 = (super.field3944 * var119 + (super.field3947 * var117 - -(super.field3943 * var118)) >> 15) + super.field3948;
                        int var124 = super.field3950 - -(super.field3939 * var119 + (super.field3955 * var117 - -(super.field3956 * var118)) >> 15);
                        arg0[var77] = super.field3940.field7176 * var124 / super.field3954 + arg5.field49;
                        arg6[var77] = super.field3940.field7167 * var123 / super.field3954 + arg5.field52;
                        arg3[var77] = super.field3954;
                    }
                }
                if (var66.field8715 != null) {
                    int var78 = super.field3945[arg7][arg4];
                    int var79 = super.field3945[arg7 - -1][arg4];
                    int var80 = super.field3945[arg7][arg4 - -1];
                    int var81 = super.field2504 * arg7;
                    int var82 = var81 - -super.field2504;
                    int var83 = super.field2504 * arg4;
                    int var84 = var83 - -super.field2504;
                    int var85 = (super.field3939 * var83 + super.field3956 * var78 + super.field3955 * var81 >> 15) + super.field3950;
                    int var86 = super.field3948 - -(super.field3944 * var83 + (super.field3947 * var81 - -(super.field3943 * var78)) >> 15);
                    int var87 = (super.field3949 * var83 + super.field3958 * var78 + super.field3951 * var81 >> 15) + super.field3938;
                    int var88 = (super.field3955 * var82 + super.field3956 * var79 + super.field3939 * var83 >> 15) + super.field3950;
                    int var89 = (super.field3947 * var82 - (-(super.field3943 * var79) - super.field3944 * var83) >> 15) + super.field3948;
                    int var90 = (super.field3951 * var82 + super.field3958 * var79 + super.field3949 * var83 >> 15) + super.field3938;
                    int var91 = (super.field3939 * var84 + (super.field3955 * var81 - -(super.field3956 * var80)) >> 15) + super.field3950;
                    int var92 = (super.field3947 * var81 + super.field3944 * var84 + super.field3943 * var80 >> 15) + super.field3948;
                    int var93 = super.field3938 - -(super.field3958 * var80 + super.field3951 * var81 - -(super.field3949 * var84) >> 15);
                    for (int var94 = 0; ~var94 > ~var66.field8719; ++var94) {
                        int var95 = var94 * 3;
                        int var96 = var95 + 1;
                        int var97 = var96 - -1;
                        int var98 = arg0[var95];
                        int var99 = arg0[var96];
                        int var100 = arg0[var97];
                        int var101 = arg6[var95];
                        int var102 = arg6[var96];
                        int var103 = arg6[var97];
                        int var104 = arg1[var95] - -arg1[var96] + arg1[var97];
                        if (~((-var99 + var98) * (-var102 + var103) + -((-var99 + var100) * (-var102 + var101))) < -1) {
                            arg5.field54 = ~var98 > -1 || ~var99 > -1 || var100 < 0 || ~arg5.field55 > ~var98 || ~arg5.field55 > ~var99 || var100 > arg5.field55;
                            short var105 = var66.field8715[var94];
                            if (~var104 <= -766) {
                                arg5.method24(var101, var102, var103, var98, var99, var100, arg3[var95], arg3[var96], arg3[var97], super.field3940.field7180);
                            } else {
                                if (~var105 != 0 && this.method1831(super.field3940.field2924.method190((byte) -89, var105).field2984)) {
                                    arg5.field58 = 100;
                                }
                                if (~var104 < -1) {
                                    if (~var105 != 0) {
                                        arg5.method20(var101, var102, var103, var98, var99, var100, arg3[var95], arg3[var96], arg3[var97], super.field3940.field7180, arg1[var95], arg1[var96], arg1[var97], var66.field8713[var95], var66.field8713[var96], var66.field8713[var97], var85, var88, var91, var86, var89, var92, var87, var90, var93, var105);
                                    } else if ((var66.field8713[var95] & 16777215) != 0) {
                                        arg5.method26(var101, var102, var103, var98, var99, var100, arg3[var95], arg3[var96], arg3[var97], class211.method1383(arg2 ^ 39, arg1[var95] << 24 | super.field3940.field7180, var66.field8713[var95]), class211.method1383(-115, arg1[var96] << 24 | super.field3940.field7180, var66.field8713[var96]), class211.method1383(-120, arg1[var97] << 24 | super.field3940.field7180, var66.field8713[var97]));
                                    }
                                } else if (var105 != -1) {
                                    arg5.method22(var101, var102, var103, var98, var99, var100, var66.field8713[var95], var66.field8713[var96], var66.field8713[var97], var85, var88, var91, var86, var89, var92, var87, var90, var93, var105);
                                } else if ((var66.field8713[var95] & 16777215) != 0) {
                                    arg5.method26(var101, var102, var103, var98, var99, var100, arg3[var95], arg3[var96], arg3[var97], var66.field8713[var95], var66.field8713[var96], var66.field8713[var97]);
                                }
                                arg5.field58 = 0;
                            }
                        }
                    }
                } else {
                    for (int var106 = 0; var66.field8719 > var106; ++var106) {
                        int var107 = var106 * 3;
                        int var108 = var107 + 1;
                        int var109 = var108 + 1;
                        int var110 = arg0[var107];
                        int var111 = arg0[var108];
                        int var112 = arg0[var109];
                        int var113 = arg6[var107];
                        int var114 = arg6[var108];
                        int var115 = arg6[var109];
                        int var116 = arg1[var107] - -arg1[var109] + arg1[var108];
                        if (~((var115 - var114) * (-var111 + var110) + -((var113 - var114) * (-var111 + var112))) < -1) {
                            arg5.field54 = var110 < 0 || ~var111 > -1 || var112 < 0 || ~var110 < ~arg5.field55 || ~arg5.field55 > ~var111 || arg5.field55 < var112;
                            if (~var116 > -766) {
                                if (~var116 >= -1) {
                                    if ((var66.field8713[var107] & 16777215) != 0) {
                                        arg5.method26(var113, var114, var115, var110, var111, var112, arg3[var107], arg3[var108], arg3[var109], var66.field8713[var107], var66.field8713[var108], var66.field8713[var109]);
                                    }
                                } else if (~(16777215 & var66.field8713[var107]) != -1) {
                                    arg5.method26(var113, var114, var115, var110, var111, var112, arg3[var107], arg3[var108], arg3[var109], class15.method176(var66.field8713[var107], (byte) -59, super.field3940.field7180, arg1[var107]), class15.method176(var66.field8713[var108], (byte) -59, super.field3940.field7180, arg1[var108]), class15.method176(var66.field8713[var109], (byte) -59, super.field3940.field7180, arg1[var109]));
                                }
                            } else {
                                arg5.method24(var113, var114, var115, var110, var111, var112, arg3[var107], arg3[var108], arg3[var109], super.field3940.field7180);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Let;IIII[[I[[II)V")
    public class275(class511 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
    public final void method1101(int arg0, int arg1) {
        ++field3812;
        class282 var3 = (class282) super.field3940.method1372(Thread.currentThread());
        var3.field3897.field58 = 0;
        if (super.field3937 == null) {
            if (super.field3942 != null) {
                this.method1773(-402499889, var3.field3897, var3.field5605, var3.field5602, arg0, arg1, var3.field5598, var3.field5595);
                return;
            }
        } else {
            this.method1774(var3.field5595, var3.field5598, (byte) -91, var3.field5602, arg1, var3.field3897, var3.field5605, arg0, super.field3940.field7152);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static void method1775(int arg0) {
        if (arg0 == 12868) {
            field3809 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field3810;
        class282 var9 = (class282) super.field3940.method1372(Thread.currentThread());
        class4 var10 = var9.field3897;
        var10.field54 = false;
        var10.field58 = 0;
        if (super.field3937 != null) {
            this.method1776(arg7, arg0, arg4, var9.field5605, var9.field5595, arg5, (byte) 100, var10, arg2, arg6, arg1, arg3);
        } else if (super.field3942 != null) {
            this.method1777(arg3, arg5, var9.field5605, arg0, arg4, var9.field5595, arg7, (byte) -90, arg6, arg1, var10, arg2);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([[ZII[I[IIBLft;IIII)V")
    private final void method1776(boolean[][] arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, byte arg6, class4 arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field3808;
        if (arg6 != 100) {
            method1775(-126);
        }
        int var13 = (arg9 - arg2) * arg8 / 256;
        int var14 = arg8 >> 8;
        arg7.field53 = false;
        arg7.field50 = false;
        int var15 = arg1;
        int var16 = arg10 + var13;
        for (int var17 = arg11; ~arg5 < ~var17; ++var17) {
            for (int var18 = arg2; var18 < arg9; ++var18) {
                if (arg0[var17 - arg11][-arg2 + var18]) {
                    if (super.field3937[var17][var18] != null) {
                        class102 var33 = super.field3937[var17][var18];
                        if (~var33.field1545 != 0 && ~(2 & var33.field1548) == -1 && ~var33.field1554 == -1) {
                            int var34 = super.field3940.method2953(var33.field1545);
                            arg7.method25(var16 - var14, var16 - var14, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, class306.method1937(var34, 127, var33.field1553), class306.method1937(var34, 127, var33.field1551), class306.method1937(var34, 127, var33.field1555));
                            arg7.method25(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class306.method1937(var34, 127, var33.field1549), class306.method1937(var34, 127, var33.field1555), class306.method1937(var34, arg6 ^ 27, var33.field1551));
                        } else if (var33.field1554 != 0) {
                            int var35 = var33.field1554;
                            arg7.method26(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, class211.method1383(-118, -16777216 & var33.field1553, var35), class211.method1383(arg6 + -221, var33.field1551 & -16777216, var35), class211.method1383(-113, -16777216 & var33.field1555, var35));
                            arg7.method26(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class211.method1383(arg6 ^ -22, -16777216 & var33.field1549, var35), class211.method1383(-122, -16777216 & var33.field1555, var35), class211.method1383(-126, -16777216 & var33.field1551, var35));
                        } else {
                            arg7.method26(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, var33.field1553, var33.field1551, var33.field1555);
                            arg7.method26(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, var33.field1549, var33.field1555, var33.field1551);
                        }
                    } else if (super.field3941[var17][var18] != null) {
                        class605 var19 = super.field3941[var17][var18];
                        for (int var20 = 0; ~var20 > ~var19.field8718; ++var20) {
                            arg4[var20] = var15 - -(var19.field8722[var20] * var14 / super.field2504);
                            arg3[var20] = var16 - var19.field8714[var20] * var14 / super.field2504;
                        }
                        for (int var21 = 0; var21 < var19.field8719; ++var21) {
                            int var22 = var21 * 3;
                            int var23 = var22 + 1;
                            int var24 = var23 + 1;
                            int var25 = arg4[var22];
                            int var26 = arg4[var23];
                            int var27 = arg4[var24];
                            int var28 = arg3[var22];
                            int var29 = arg3[var23];
                            int var30 = arg3[var24];
                            if (var19.field8716 != null && var19.field8716[var21] != 0 && (var19.field8715 == null || var19.field8715 != null && var19.field8715[var21] == -1)) {
                                int var31 = var19.field8716[var21];
                                arg7.method26(var28, var29, var30, var25, var26, var27, 0, 0, 0, class211.method1383(-113, -16777216 - (-16777216 & var19.field8713[var22]), var31), class211.method1383(-114, -(-16777216 & var19.field8713[var23]) + -16777216, var31), class211.method1383(-115, -(-16777216 & var19.field8713[var24]) + -16777216, var31));
                            } else if (var19.field8715 != null && ~var19.field8715[var21] != 0) {
                                int var32 = super.field3940.method2953(var19.field8715[var21]);
                                arg7.method25(var28, var29, var30, var25, var26, var27, 0, 0, 0, var32, var32, var32);
                            } else {
                                arg7.method26(var28, var29, var30, var25, var26, var27, 0, 0, 0, var19.field8713[var22], var19.field8713[var23], var19.field8713[var24]);
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg10 + var13;
            var15 += var14;
        }
        arg7.field53 = true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[III[I[[ZBIILft;I)V")
    private final void method1777(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, boolean[][] arg6, byte arg7, int arg8, int arg9, class4 arg10, int arg11) {
        ++field3807;
        int var13 = (-arg4 + arg8) * arg11 / 256;
        int var14 = arg11 >> 8;
        arg10.field53 = false;
        arg10.field50 = false;
        int var15 = arg3;
        int var16 = arg9 + var13;
        for (int var17 = arg0; ~var17 > ~arg1; ++var17) {
            for (int var19 = arg4; ~arg8 < ~var19; ++var19) {
                if (arg6[-arg0 + var17][-arg4 + var19]) {
                    if (super.field3942[var17][var19] != null) {
                        class616 var35 = super.field3942[var17][var19];
                        if (var35.field8844 != -1 && ~(var35.field8843 & 2) == -1 && var35.field8846 == -1) {
                            int var36 = super.field3940.method2953(var35.field8844);
                            arg10.method25(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, class306.method1937(var36, 127, 65535 & var35.field8847), class306.method1937(var36, 127, var35.field8845 & 65535), class306.method1937(var36, 127, 65535 & var35.field8841));
                            arg10.method25(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class306.method1937(var36, 127, 65535 & var35.field8842), class306.method1937(var36, 127, 65535 & var35.field8841), class306.method1937(var36, 127, 65535 & var35.field8845));
                        } else if (var35.field8846 == -1) {
                            arg10.method25(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, 0, 0, 0, 65535 & var35.field8847, 65535 & var35.field8845, var35.field8841 & 65535);
                            arg10.method25(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, var35.field8842 & 65535, 65535 & var35.field8841, var35.field8845 & 65535);
                        } else {
                            int var37 = var35.field8846;
                            arg10.method25(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, 0, 0, 0, var37, var37, var37);
                            arg10.method25(var16, var16, var16 - var14, var15, var14 + var15, var15, 0, 0, 0, var37, var37, var37);
                        }
                    } else if (super.field3946[var17][var19] != null) {
                        class292 var20 = super.field3946[var17][var19];
                        for (int var21 = 0; var21 < var20.field4022; ++var21) {
                            arg5[var21] = var20.field4014[var21] * var14 / super.field2504 + var15;
                            arg2[var21] = -(var20.field4019[var21] * var14 / super.field2504) + var16;
                        }
                        for (int var22 = 0; ~var20.field4018 < ~var22; ++var22) {
                            short var23 = var20.field4023[var22];
                            short var24 = var20.field4024[var22];
                            short var25 = var20.field4025[var22];
                            int var26 = arg5[var23];
                            int var27 = arg5[var24];
                            int var28 = arg5[var25];
                            int var29 = arg2[var23];
                            int var30 = arg2[var24];
                            int var31 = arg2[var25];
                            if (var20.field4017 != null && var20.field4017[var22] != -1) {
                                int var32 = var20.field4017[var22];
                                arg10.method25(var29, var30, var31, var26, var27, var28, 0, 0, 0, class306.method1937(var32, 127, var20.field4021[var23]), class306.method1937(var32, 127, var20.field4021[var24]), class306.method1937(var32, 127, var20.field4021[var25]));
                            } else if (var20.field4016 != null && ~var20.field4016[var22] != 0) {
                                int var33 = super.field3940.method2953(var20.field4016[var22]);
                                arg10.method25(var29, var30, var31, var26, var27, var28, 0, 0, 0, class306.method1937(var33, 127, var20.field4021[var23]), class306.method1937(var33, 127, var20.field4021[var24]), class306.method1937(var33, 127, var20.field4021[var25]));
                            } else {
                                int var34 = var20.field4026[var22];
                                arg10.method25(var29, var30, var31, var26, var27, var28, 0, 0, 0, class306.method1937(var34, 127, var20.field4021[var23]), class306.method1937(var34, 127, var20.field4021[var24]), class306.method1937(var34, 127, var20.field4021[var25]));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var15 += var14;
            var16 = arg9 + var13;
        }
        int var18 = 45 / ((-29 - arg7) / 44);
        arg10.field53 = true;
    }
}
