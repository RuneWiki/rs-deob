import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class71 extends class26 {

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!qp", name = "D", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!qp", name = "E", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!qp", name = "F", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!qp", name = "G", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!qp", name = "H", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Loa;I)V", line = 3)
    public static final void method421(class689 arg0, int arg1) {
        ++field927;
        arg0.method1908(0, 0, class303.field4059, 350);
        arg0.method1926(0, 0, class303.field4059, 350, class69.field912 << 24 | 3351159, 1);
        int var2 = 350 / class473.field6390;
        if (class541.field7402 > 0) {
            int var3 = -class473.field6390 + 342;
            int var4 = var2 * var3 / (var2 - 1 + class541.field7402);
            int var5 = 4;
            if (class541.field7402 > 1) {
                var5 += (class541.field7402 + -1 + -class443.field6117) * (-var4 + var3) / (class541.field7402 + -1);
            }
            arg0.method1926(class303.field4059 + -16, var5, 12, var4, class69.field912 << 24 | 3351159, 2);
            for (int var6 = class443.field6117; ~(class443.field6117 - -var2) < ~var6 && class541.field7402 > var6; ++var6) {
                String[] var7 = class105.method562(class603.field8242[var6], '\b', true);
                int var8 = (class303.field4059 + -24) / var7.length;
                for (int var9 = 0; var9 < var7.length; ++var9) {
                    int var10 = 8 - -(var8 * var9);
                    arg0.method1908(var10, 0, var8 + var10 + -8, 350);
                    class395.field5658.method1815(var7[var9], arg1 ^ 16777116, var10, -1, -class442.field6096 + 350 + -2 + -((-class443.field6117 + var6) * class473.field6390) + -class278.field3769.field8190, -16777216);
                }
            }
        }
        arg0.method1908(0, 0, class303.field4059, 350);
        arg0.method3814(arg1 + 16777217, class303.field4059, -class442.field6096 + 350, -1, 0);
        class622.field8452.method1815("--> " + class427.field5933, arg1 + 16777121, 10, -1, -class446.field6129.field8190 + 350 + -1, arg1);
        if (class594.field8144) {
            int var11 = -1;
            if (~(class430.field5984 % 30) < -16) {
                var11 = 16777215;
            }
            arg0.method3815(class446.field6129.method3312(-23728, "--> " + class427.field5933.substring(0, class557.field7603)) + 10, -108, 350 - (class446.field6129.field8190 + 11), var11, 12);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "([I[IZLce;II[II)V", line = 67)
    private final void method422(int[] arg0, int[] arg1, boolean arg2, class295 arg3, int arg4, int arg5, int[] arg6, int arg7) {
        ++field928;
        class378 var9 = super.field250[arg7][arg5];
        if (var9 != null) {
            if (~(var9.field5419 & 2) == -1) {
                int var10 = super.field2210 * arg7;
                int var11 = var10 - -super.field2210;
                int var12 = super.field2210 * arg5;
                int var13 = super.field2210 + var12;
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
                if (~(1 & var9.field5419) != -1 && !arg2) {
                    int var18 = super.field261[arg7][arg5];
                    if (~super.field263 == 0) {
                        int var19 = super.field253 * var18;
                        var20 = (super.field246 * var10 + (var19 - -(super.field245 * var12)) >> 14) + super.field256;
                        if (~var20 >= ~super.field254.field8607) {
                            return;
                        }
                        var21 = (super.field246 * var11 + super.field245 * var12 - -var19 >> 14) + super.field256;
                        if (~super.field254.field8607 <= ~var21) {
                            return;
                        }
                        var22 = (super.field245 * var13 + (super.field246 * var11 - -var19) >> 14) + super.field256;
                        if (super.field254.field8607 >= var22) {
                            return;
                        }
                        var23 = super.field256 - -(super.field246 * var10 - -(super.field245 * var13) + var19 >> 14);
                        if (~var23 >= ~super.field254.field8607) {
                            return;
                        }
                    } else {
                        var23 = super.field263;
                        var22 = super.field263;
                        var21 = super.field263;
                        var20 = super.field263;
                    }
                    if (super.field254.field8598) {
                        int var24 = -super.field254.field8631 + var20;
                        if (~var24 < -1) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - super.field254.field8631;
                        if (~var25 < -1) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = -super.field254.field8631 + var22;
                        if (~var26 < -1) {
                            var16 = var26;
                            if (~var26 < -256) {
                                var16 = 255;
                            }
                        }
                        int var27 = var23 - super.field254.field8631;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (~var27 < -256) {
                                var17 = 255;
                            }
                        }
                    }
                    int var28 = super.field251 * var18;
                    var29 = (super.field258 * var10 - (-var28 - super.field255 * var12) >> 14) + super.field249;
                    int var30 = super.field260 * var18;
                    var31 = (super.field243 * var10 - -(super.field262 * var12) + var30 >> 14) + super.field264;
                    var32 = arg3.field3961 - -(super.field254.field8611 * var29 / var20);
                    var33 = super.field254.field8630 * var31 / var20 + arg3.field3964;
                    var34 = (super.field258 * var11 + super.field255 * var12 - -var28 >> 14) + super.field249;
                    var35 = (super.field243 * var11 + super.field262 * var12 + var30 >> 14) + super.field264;
                    var36 = super.field254.field8611 * var34 / var21 + arg3.field3961;
                    var37 = (super.field258 * var11 + super.field255 * var13 - -var28 >> 14) + super.field249;
                    var38 = super.field254.field8630 * var35 / var21 + arg3.field3964;
                    var39 = (super.field243 * var11 + super.field262 * var13 + var30 >> 14) + super.field264;
                    var40 = arg3.field3961 - -(super.field254.field8611 * var37 / var22);
                    var41 = arg3.field3964 - -(super.field254.field8630 * var39 / var22);
                    var42 = (super.field258 * var10 - -var28 - -(super.field255 * var13) >> 14) + super.field249;
                    var43 = super.field254.field8611 * var42 / var23 + arg3.field3961;
                    var44 = (super.field262 * var13 + super.field243 * var10 - -var30 >> 14) + super.field264;
                    var45 = super.field254.field8630 * var44 / var23 + arg3.field3964;
                } else {
                    int var46 = super.field261[arg7][arg5];
                    int var47 = super.field261[arg7 + 1][arg5];
                    int var48 = super.field261[arg7 + 1][arg5 + 1];
                    int var49 = super.field261[arg7][arg5 + 1];
                    if (~super.field263 == 0) {
                        var20 = (super.field246 * var10 - -(super.field253 * var46) - -(super.field245 * var12) >> 14) + super.field256;
                        if (super.field254.field8607 >= var20) {
                            return;
                        }
                        var21 = (super.field246 * var11 + super.field245 * var12 - -(super.field253 * var47) >> 14) + super.field256;
                        if (~var21 >= ~super.field254.field8607) {
                            return;
                        }
                        var22 = (super.field246 * var11 + super.field253 * var48 + super.field245 * var13 >> 14) + super.field256;
                        if (~super.field254.field8607 <= ~var22) {
                            return;
                        }
                        var23 = (super.field245 * var13 + super.field253 * var49 + super.field246 * var10 >> 14) + super.field256;
                        if (var23 <= super.field254.field8607) {
                            return;
                        }
                    } else {
                        var23 = super.field263;
                        var22 = super.field263;
                        var21 = super.field263;
                        var20 = super.field263;
                    }
                    if (arg2) {
                        int var50 = -super.field254.field8631 + var20;
                        if (~var50 < -256) {
                            var50 = 255;
                        }
                        if (~var50 < -1) {
                            var14 = var50;
                            int var51 = var9.field5425 * var50 / 255;
                            if (~var51 < -1) {
                                var46 -= var51;
                            }
                        }
                        int var52 = -super.field254.field8631 + var21;
                        if (~var52 < -256) {
                            var52 = 255;
                        }
                        if (var52 > 0) {
                            var15 = var52;
                            int var53 = var9.field5427 * var52 / 255;
                            if (~var53 < -1) {
                                var47 -= var53;
                            }
                        }
                        int var54 = -super.field254.field8631 + var22;
                        if (var54 > 255) {
                            var54 = 255;
                        }
                        if (~var54 < -1) {
                            var16 = var54;
                            int var55 = var9.field5426 * var54 / 255;
                            if (var55 > 0) {
                                var48 -= var55;
                            }
                        }
                        int var56 = var23 - super.field254.field8631;
                        if (~var56 < -256) {
                            var56 = 255;
                        }
                        if (var56 > 0) {
                            var17 = var56;
                            int var57 = var9.field5422 * var56 / 255;
                            if (var57 > 0) {
                                var49 -= var57;
                            }
                        }
                    } else if (super.field254.field8598) {
                        int var58 = var20 - super.field254.field8631;
                        if (var58 > 0) {
                            var14 = var58;
                            if (~var58 < -256) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - super.field254.field8631;
                        if (~var59 < -1) {
                            var15 = var59;
                            if (~var59 < -256) {
                                var15 = 255;
                            }
                        }
                        int var60 = -super.field254.field8631 + var22;
                        if (var60 > 0) {
                            var16 = var60;
                            if (~var60 < -256) {
                                var16 = 255;
                            }
                        }
                        int var61 = -super.field254.field8631 + var23;
                        if (~var61 < -1) {
                            var17 = var61;
                            if (~var61 < -256) {
                                var17 = 255;
                            }
                        }
                    }
                    var29 = (super.field258 * var10 + super.field255 * var12 - -(super.field251 * var46) >> 14) + super.field249;
                    var31 = super.field264 - -(super.field260 * var46 + (super.field243 * var10 - -(super.field262 * var12)) >> 14);
                    var32 = super.field254.field8611 * var29 / var20 + arg3.field3961;
                    var34 = (super.field258 * var11 + super.field255 * var12 - -(super.field251 * var47) >> 14) + super.field249;
                    var33 = super.field254.field8630 * var31 / var20 + arg3.field3964;
                    var36 = super.field254.field8611 * var34 / var21 + arg3.field3961;
                    var35 = (super.field262 * var12 + super.field260 * var47 + super.field243 * var11 >> 14) + super.field264;
                    var38 = super.field254.field8630 * var35 / var21 + arg3.field3964;
                    var37 = super.field249 - -(super.field258 * var11 + (super.field251 * var48 - -(super.field255 * var13)) >> 14);
                    var40 = super.field254.field8611 * var37 / var22 + arg3.field3961;
                    var39 = (super.field260 * var48 + super.field262 * var13 + super.field243 * var11 >> 14) + super.field264;
                    var41 = super.field254.field8630 * var39 / var22 + arg3.field3964;
                    var42 = (super.field255 * var13 + super.field258 * var10 + super.field251 * var49 >> 14) + super.field249;
                    var44 = super.field264 - -(super.field262 * var13 + (super.field243 * var10 - -(super.field260 * var49)) >> 14);
                    var43 = arg3.field3961 - -(super.field254.field8611 * var42 / var23);
                    var45 = super.field254.field8630 * var44 / var23 + arg3.field3964;
                }
                boolean var62 = var9.field5420 != -1 && this.method151(super.field254.field9731.method1728(arg4 + -9020, var9.field5420).field7870);
                int var63 = var15 + var17 + var16;
                if ((-var43 + var40) * (-var45 + var38) + -((-var43 + var36) * (-var45 + var41)) > 0) {
                    arg3.field3966 = var40 < 0 || var43 < 0 || ~var36 > -1 || ~arg3.field3956 > ~var40 || arg3.field3956 < var43 || ~var36 < ~arg3.field3956;
                    if (var63 >= 765) {
                        arg3.method1764(var41, var45, var38, var40, var43, var36, super.field254.field8605);
                    } else {
                        if (var62) {
                            arg3.field3954 = 100;
                        }
                        if (var63 <= 0) {
                            if (var9.field5420 < 0) {
                                arg3.method1757(var41, var45, var38, var40, var43, var36, var9.field5421, var9.field5428, var9.field5429);
                            } else {
                                arg3.method1758(var41, var45, var38, var40, var43, var36, var9.field5421, var9.field5428, var9.field5429, var37, var42, var34, var39, var44, var35, var22, var23, var21, var9.field5420);
                            }
                        } else if (var9.field5420 >= 0) {
                            arg3.method1760(var41, var45, var38, var40, var43, var36, super.field254.field8605, var16, var17, var15, var9.field5421, var9.field5428, var9.field5429, var37, var42, var34, var39, var44, var35, var22, var23, var21, var9.field5420);
                        } else {
                            arg3.method1757(var41, var45, var38, var40, var43, var36, class584.method3272(var16 << 24 | super.field254.field8605, var9.field5421, (byte) 96), class584.method3272(super.field254.field8605 | var17 << 24, var9.field5428, (byte) 96), class584.method3272(super.field254.field8605 | var15 << 24, var9.field5429, (byte) 96));
                        }
                        arg3.field3954 = 0;
                    }
                }
                int var64 = var14 - -var15 + var17;
                if ((var45 - var38) * (-var36 + var32) - (var33 - var38) * (-var36 + var43) > 0) {
                    arg3.field3966 = var32 < 0 || var36 < 0 || ~var43 > -1 || var32 > arg3.field3956 || arg3.field3956 < var36 || ~var43 < ~arg3.field3956;
                    if (~var64 <= -766) {
                        arg3.method1764(var33, var38, var45, var32, var36, var43, super.field254.field8605);
                        return;
                    }
                    if (var62) {
                        arg3.field3954 = 100;
                    }
                    if (var64 > 0) {
                        if (var9.field5420 < 0) {
                            arg3.method1757(var33, var38, var45, var32, var36, var43, class584.method3272(super.field254.field8605 | var14 << 24, var9.field5423, (byte) 96), class584.method3272(var15 << 24 | super.field254.field8605, var9.field5429, (byte) 96), class584.method3272(super.field254.field8605 | var17 << 24, var9.field5428, (byte) 96));
                        } else {
                            arg3.method1760(var33, var38, var45, var32, var36, var43, super.field254.field8605, var14, var15, var17, var9.field5423, var9.field5429, var9.field5428, var29, var34, var42, var31, var35, var44, var20, var21, var23, var9.field5420);
                        }
                    } else if (var9.field5420 < 0) {
                        arg3.method1757(var33, var38, var45, var32, var36, var43, var9.field5423, var9.field5429, var9.field5428);
                    } else {
                        arg3.method1758(var33, var38, var45, var32, var36, var43, var9.field5423, var9.field5429, var9.field5428, var29, var34, var42, var31, var35, var44, var20, var21, var23, var9.field5420);
                    }
                    arg3.field3954 = 0;
                }
            }
        } else {
            class392 var65 = super.field252[arg7][arg5];
            if (var65 != null) {
                if (super.field263 == -1) {
                    for (int var66 = 0; var65.field5621 > var66; ++var66) {
                        int var67 = var65.field5622[var66] - -(arg7 << super.field2212);
                        int var68 = var65.field5615[var66];
                        int var69 = var65.field5614[var66] - -(arg5 << super.field2212);
                        int var70 = (super.field246 * var67 + super.field245 * var69 - -(super.field253 * var68) >> 14) + super.field256;
                        if (var70 <= super.field254.field8607) {
                            return;
                        }
                        arg0[var66] = 0;
                        if (!arg2) {
                            if (super.field254.field8598) {
                                int var71 = -super.field254.field8631 + var70;
                                if (~var71 < -1) {
                                    arg0[var66] = var71;
                                    if (~arg0[var66] < -256) {
                                        arg0[var66] = 255;
                                    }
                                }
                            }
                        } else {
                            int var72 = -super.field254.field8631 + var70;
                            if (var72 > 255) {
                                var72 = 255;
                            }
                            if (var72 > 0) {
                                arg0[var66] = var72;
                                int var73 = var65.field5617[var66] * var72 / 255;
                                if (var73 > 0) {
                                    var68 -= var73;
                                }
                            }
                        }
                        int var74 = (super.field258 * var67 + super.field251 * var68 - -(super.field255 * var69) >> 14) + super.field249;
                        int var75 = (super.field260 * var68 + super.field243 * var67 - -(super.field262 * var69) >> 14) + super.field264;
                        arg1[var66] = super.field254.field8611 * var74 / var70 + arg3.field3961;
                        arg6[var66] = arg3.field3964 - -(super.field254.field8630 * var75 / var70);
                    }
                } else {
                    for (int var76 = 0; ~var76 > ~var65.field5621; ++var76) {
                        int var116 = var65.field5622[var76] - -(arg7 << super.field2212);
                        int var117 = var65.field5615[var76];
                        int var118 = (arg5 << super.field2212) + var65.field5614[var76];
                        arg0[var76] = 0;
                        if (arg2) {
                            int var119 = -super.field254.field8631 + super.field263;
                            if (var119 > 255) {
                                var119 = 255;
                            }
                            if (~var119 < -1) {
                                arg0[var76] = var119;
                                int var120 = var65.field5617[var76] * var119 / 255;
                                if (var120 > 0) {
                                    var117 -= var120;
                                }
                            }
                        } else if (super.field254.field8598) {
                            int var121 = -super.field254.field8631 + super.field263;
                            if (~var121 < -1) {
                                arg0[var76] = var121;
                                if (arg0[var76] > 255) {
                                    arg0[var76] = 255;
                                }
                            }
                        }
                        int var122 = (super.field255 * var118 + (super.field258 * var116 - -(super.field251 * var117)) >> 14) + super.field249;
                        int var123 = (super.field243 * var116 + super.field262 * var118 + super.field260 * var117 >> 14) + super.field264;
                        arg1[var76] = super.field254.field8611 * var122 / super.field263 + arg3.field3961;
                        arg6[var76] = arg3.field3964 - -(super.field254.field8630 * var123 / super.field263);
                    }
                }
                if (var65.field5618 == null) {
                    for (int var77 = 0; var77 < var65.field5619; ++var77) {
                        int var78 = var77 * 3;
                        int var79 = var78 + 1;
                        int var80 = var79 + 1;
                        int var81 = arg1[var78];
                        int var82 = arg1[var79];
                        int var83 = arg1[var80];
                        int var84 = arg6[var78];
                        int var85 = arg6[var79];
                        int var86 = arg6[var80];
                        int var87 = arg0[var78] + arg0[var80] - -arg0[var79];
                        if (~((-var82 + var81) * (-var85 + var86) + -((-var82 + var83) * (-var85 + var84))) < -1) {
                            arg3.field3966 = var81 < 0 || var82 < 0 || var83 < 0 || arg3.field3956 < var81 || var82 > arg3.field3956 || ~var83 < ~arg3.field3956;
                            if (~var87 <= -766) {
                                arg3.method1764(var84, var85, var86, var81, var82, var83, super.field254.field8605);
                            } else if (var87 <= 0) {
                                if ((16777215 & var65.field5623[var78]) != 0) {
                                    arg3.method1757(var84, var85, var86, var81, var82, var83, var65.field5623[var78], var65.field5623[var79], var65.field5623[var80]);
                                }
                            } else if ((16777215 & var65.field5623[var78]) != 0) {
                                arg3.method1757(var84, var85, var86, var81, var82, var83, class548.method3080(var65.field5623[var78], -88, super.field254.field8605, arg0[var78]), class548.method3080(var65.field5623[var79], arg4 ^ -8849, super.field254.field8605, arg0[var79]), class548.method3080(var65.field5623[var80], -123, super.field254.field8605, arg0[var80]));
                            }
                        }
                    }
                } else {
                    int var88 = super.field261[arg7][arg5];
                    int var89 = super.field261[arg7 + 1][arg5];
                    int var90 = super.field261[arg7][arg5 + 1];
                    int var91 = super.field2210 * arg7;
                    int var92 = super.field2210 + var91;
                    int var93 = super.field2210 * arg5;
                    int var94 = super.field2210 + var93;
                    int var95 = (super.field255 * var93 + (super.field258 * var91 - -(super.field251 * var88)) >> 14) + super.field249;
                    int var96 = super.field264 - -(super.field262 * var93 + super.field260 * var88 + super.field243 * var91 >> 14);
                    int var97 = (super.field246 * var91 + super.field253 * var88 + super.field245 * var93 >> 14) + super.field256;
                    int var98 = (super.field255 * var93 + super.field258 * var92 + super.field251 * var89 >> 14) + super.field249;
                    int var99 = super.field264 - -(super.field260 * var89 + super.field243 * var92 - -(super.field262 * var93) >> 14);
                    int var100 = super.field256 - -(super.field253 * var89 + (super.field246 * var92 - -(super.field245 * var93)) >> 14);
                    int var101 = (super.field251 * var90 + super.field258 * var91 + super.field255 * var94 >> 14) + super.field249;
                    int var102 = (super.field262 * var94 + super.field260 * var90 + super.field243 * var91 >> 14) + super.field264;
                    int var103 = (super.field246 * var91 + super.field253 * var90 + super.field245 * var94 >> 14) + super.field256;
                    for (int var104 = 0; ~var65.field5619 < ~var104; ++var104) {
                        int var105 = var104 * 3;
                        int var106 = var105 + 1;
                        int var107 = var106 + 1;
                        int var108 = arg1[var105];
                        int var109 = arg1[var106];
                        int var110 = arg1[var107];
                        int var111 = arg6[var105];
                        int var112 = arg6[var106];
                        int var113 = arg6[var107];
                        int var114 = arg0[var105] + arg0[var106] + arg0[var107];
                        if ((-var109 + var108) * (-var112 + var113) + -((-var109 + var110) * (-var112 + var111)) > 0) {
                            arg3.field3966 = var108 < 0 || var109 < 0 || var110 < 0 || ~var108 < ~arg3.field3956 || arg3.field3956 < var109 || var110 > arg3.field3956;
                            short var115 = var65.field5618[var104];
                            if (var114 >= 765) {
                                arg3.method1764(var111, var112, var113, var108, var109, var110, super.field254.field8605);
                            } else {
                                if (var115 != -1 && this.method151(super.field254.field9731.method1728(arg4 + -9003, var115).field7870)) {
                                    arg3.field3954 = 100;
                                }
                                if (var114 <= 0) {
                                    if (~var115 == 0) {
                                        if (~(var65.field5623[var105] & 16777215) != -1) {
                                            arg3.method1757(var111, var112, var113, var108, var109, var110, var65.field5623[var105], var65.field5623[var106], var65.field5623[var107]);
                                        }
                                    } else {
                                        arg3.method1758(var111, var112, var113, var108, var109, var110, var65.field5623[var105], var65.field5623[var106], var65.field5623[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                    }
                                } else if (var115 == -1) {
                                    if ((var65.field5623[var105] & 16777215) != 0) {
                                        arg3.method1757(var111, var112, var113, var108, var109, var110, class584.method3272(super.field254.field8605 | arg0[var105] << 24, var65.field5623[var105], (byte) 96), class584.method3272(arg0[var106] << 24 | super.field254.field8605, var65.field5623[var106], (byte) 96), class584.method3272(arg0[var107] << 24 | super.field254.field8605, var65.field5623[var107], (byte) 96));
                                    }
                                } else {
                                    arg3.method1760(var111, var112, var113, var108, var109, var110, super.field254.field8605, arg0[var105], arg0[var106], arg0[var107], var65.field5623[var105], var65.field5623[var106], var65.field5623[var107], var95, var98, var101, var96, var99, var102, var97, var100, var103, var115);
                                }
                                arg3.field3954 = 0;
                            }
                        }
                    }
                }
            }
            if (arg4 == 8901) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILce;III[I[I[[ZIII)V", line = 756)
    private final void method423(int arg0, int arg1, class295 arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, boolean[][] arg8, int arg9, int arg10, int arg11) {
        ++field931;
        int var13 = (-arg11 + arg1) * arg0 / 256;
        int var14 = arg0 >> 8;
        arg2.field3960 = false;
        arg2.field3953 = false;
        int var15 = arg5;
        int var16 = arg9 - -var13;
        int var17 = arg10;
        if (arg4 == -571884402) {
            while (~arg3 < ~var17) {
                for (int var18 = arg11; arg1 > var18; ++var18) {
                    if (arg8[-arg10 + var17][-arg11 + var18]) {
                        if (super.field257[var17][var18] != null) {
                            class358 var19 = super.field257[var17][var18];
                            if (var19.field5189 != -1 && (var19.field5193 & 2) == 0 && ~var19.field5192 == 0) {
                                int var20 = super.field254.method3452(var19.field5189);
                                arg2.method1759(var16 - var14, var16 - var14, var16, var15 - -var14, var15, var14 + var15, class54.method303(var20, arg4 ^ -571884303, var19.field5190 & 65535), class54.method303(var20, arg4 ^ -571884303, var19.field5187 & 65535), class54.method303(var20, arg4 + 571884529, 65535 & var19.field5191));
                                arg2.method1759(var16, var16, -var14 + var16, var15, var14 + var15, var15, class54.method303(var20, 127, 65535 & var19.field5188), class54.method303(var20, 127, var19.field5191 & 65535), class54.method303(var20, 127, 65535 & var19.field5187));
                            } else if (var19.field5192 != -1) {
                                int var21 = var19.field5192;
                                arg2.method1759(var16 - var14, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, var21, var21, var21);
                                arg2.method1759(var16, var16, -var14 + var16, var15, var14 + var15, var15, var21, var21, var21);
                            } else {
                                arg2.method1759(var16 - var14, var16 - var14, var16, var14 + var15, var15, var14 + var15, 65535 & var19.field5190, 65535 & var19.field5187, var19.field5191 & 65535);
                                arg2.method1759(var16, var16, var16 - var14, var15, var14 + var15, var15, 65535 & var19.field5188, var19.field5191 & 65535, var19.field5187 & 65535);
                            }
                        } else if (super.field247[var17][var18] != null) {
                            class342 var22 = super.field247[var17][var18];
                            for (int var23 = 0; var23 < var22.field5026; ++var23) {
                                arg7[var23] = var22.field5030[var23] * var14 / super.field2210 + var15;
                                arg6[var23] = -(var22.field5022[var23] * var14 / super.field2210) + var16;
                            }
                            for (int var24 = 0; var24 < var22.field5025; ++var24) {
                                short var25 = var22.field5029[var24];
                                short var26 = var22.field5021[var24];
                                short var27 = var22.field5020[var24];
                                int var28 = arg7[var25];
                                int var29 = arg7[var26];
                                int var30 = arg7[var27];
                                int var31 = arg6[var25];
                                int var32 = arg6[var26];
                                int var33 = arg6[var27];
                                if (var22.field5023 != null && ~var22.field5023[var24] != 0) {
                                    int var34 = var22.field5023[var24];
                                    arg2.method1759(var31, var32, var33, var28, var29, var30, class54.method303(var34, 127, var22.field5028[var25]), class54.method303(var34, 127, var22.field5028[var26]), class54.method303(var34, arg4 + 571884529, var22.field5028[var27]));
                                } else if (var22.field5024 != null && var22.field5024[var24] != -1) {
                                    int var35 = super.field254.method3452(var22.field5024[var24]);
                                    arg2.method1759(var31, var32, var33, var28, var29, var30, class54.method303(var35, 127, var22.field5028[var25]), class54.method303(var35, 127, var22.field5028[var26]), class54.method303(var35, arg4 ^ -571884303, var22.field5028[var27]));
                                } else {
                                    int var36 = var22.field5019[var24];
                                    arg2.method1759(var31, var32, var33, var28, var29, var30, class54.method303(var36, 127, var22.field5028[var25]), class54.method303(var36, 127, var22.field5028[var26]), class54.method303(var36, 127, var22.field5028[var27]));
                                }
                            }
                        }
                    }
                    var16 -= var14;
                }
                var16 = arg9 + var13;
                var15 += var14;
                ++var17;
            }
            arg2.field3953 = true;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V", line = 897)
    public final void method155(int arg0, int arg1) {
        ++field930;
        class644 var3 = (class644) super.field254.method1789(Thread.currentThread());
        var3.field9124.field3954 = 0;
        if (super.field250 != null) {
            this.method422(var3.field5365, var3.field5339, super.field254.field8618, var3.field9124, 8901, arg1, var3.field5342, arg0);
        } else if (super.field257 != null) {
            this.method425(arg1, var3.field5339, var3.field5365, arg0, var3.field9124, 0, var3.field5342);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III[IIILce;B[I[[ZII)V", line = 915)
    private final void method424(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, class295 arg6, byte arg7, int[] arg8, boolean[][] arg9, int arg10, int arg11) {
        ++field925;
        int var13 = (-arg4 + arg1) * arg5 / 256;
        if (arg7 > 48) {
            int var14 = arg5 >> 8;
            arg6.field3960 = false;
            arg6.field3953 = false;
            int var15 = arg2;
            int var16 = arg0 + var13;
            for (int var17 = arg10; var17 < arg11; ++var17) {
                for (int var18 = arg4; ~var18 > ~arg1; ++var18) {
                    if (arg9[-arg10 + var17][-arg4 + var18]) {
                        if (super.field250[var17][var18] != null) {
                            class378 var19 = super.field250[var17][var18];
                            if (~var19.field5420 != 0 && ~(2 & var19.field5419) == -1 && var19.field5424 == 0) {
                                int var20 = super.field254.method3452(var19.field5420);
                                arg6.method1759(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, class54.method303(var20, 127, var19.field5421), class54.method303(var20, 127, var19.field5428), class54.method303(var20, 127, var19.field5429));
                                arg6.method1759(var16, var16, -var14 + var16, var15, var14 + var15, var15, class54.method303(var20, 127, var19.field5423), class54.method303(var20, 127, var19.field5429), class54.method303(var20, 127, var19.field5428));
                            } else if (~var19.field5424 != -1) {
                                int var21 = var19.field5424;
                                arg6.method1757(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, class584.method3272(-16777216 & var19.field5421, var21, (byte) 96), class584.method3272(-16777216 & var19.field5428, var21, (byte) 96), class584.method3272(var19.field5429 & -16777216, var21, (byte) 96));
                                arg6.method1757(var16, var16, -var14 + var16, var15, var14 + var15, var15, class584.method3272(var19.field5423 & -16777216, var21, (byte) 96), class584.method3272(-16777216 & var19.field5429, var21, (byte) 96), class584.method3272(var19.field5428 & -16777216, var21, (byte) 96));
                            } else {
                                arg6.method1757(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, var19.field5421, var19.field5428, var19.field5429);
                                arg6.method1757(var16, var16, -var14 + var16, var15, var14 + var15, var15, var19.field5423, var19.field5429, var19.field5428);
                            }
                        } else if (super.field252[var17][var18] != null) {
                            class392 var22 = super.field252[var17][var18];
                            for (int var23 = 0; var23 < var22.field5621; ++var23) {
                                arg3[var23] = var22.field5622[var23] * var14 / super.field2210 + var15;
                                arg8[var23] = -(var22.field5614[var23] * var14 / super.field2210) + var16;
                            }
                            for (int var24 = 0; ~var24 > ~var22.field5619; ++var24) {
                                int var25 = var24 * 3;
                                int var26 = var25 + 1;
                                int var27 = var26 - -1;
                                int var28 = arg3[var25];
                                int var29 = arg3[var26];
                                int var30 = arg3[var27];
                                int var31 = arg8[var25];
                                int var32 = arg8[var26];
                                int var33 = arg8[var27];
                                if (var22.field5620 == null || var22.field5620[var24] == 0 || var22.field5618 != null && (var22.field5618 == null || var22.field5618[var24] != -1)) {
                                    if (var22.field5618 != null && ~var22.field5618[var24] != 0) {
                                        int var35 = super.field254.method3452(var22.field5618[var24]);
                                        arg6.method1759(var31, var32, var33, var28, var29, var30, var35, var35, var35);
                                    } else {
                                        arg6.method1757(var31, var32, var33, var28, var29, var30, var22.field5623[var25], var22.field5623[var26], var22.field5623[var27]);
                                    }
                                } else {
                                    int var34 = var22.field5620[var24];
                                    arg6.method1757(var31, var32, var33, var28, var29, var30, class584.method3272(-16777216 - (var22.field5623[var25] & -16777216), var34, (byte) 96), class584.method3272(-16777216 - (-16777216 & var22.field5623[var26]), var34, (byte) 96), class584.method3272(-(-16777216 & var22.field5623[var27]) + -16777216, var34, (byte) 96));
                                }
                            }
                        }
                    }
                    var16 -= var14;
                }
                var15 += var14;
                var16 = arg0 + var13;
            }
            arg6.field3953 = true;
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIIIIII[[Z)V", line = 1055)
    public final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field926;
        class644 var9 = (class644) super.field254.method1789(Thread.currentThread());
        class295 var10 = var9.field9124;
        var10.field3954 = 0;
        var10.field3966 = false;
        if (super.field250 != null) {
            this.method424(arg1, arg6, arg0, var9.field5339, arg4, arg2, var10, (byte) 104, var9.field5342, arg7, arg3, arg5);
        } else if (super.field257 != null) {
            this.method423(arg2, arg6, var10, arg5, -571884402, arg0, var9.field5342, var9.field5339, arg7, arg1, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I[I[IILce;I[I)V", line = 1075)
    private final void method425(int arg0, int[] arg1, int[] arg2, int arg3, class295 arg4, int arg5, int[] arg6) {
        ++field929;
        class358 var8 = super.field257[arg3][arg0];
        if (arg5 == 0) {
            if (var8 != null) {
                if ((var8.field5193 & 2) == 0) {
                    int var9 = super.field2210 * arg3;
                    int var10 = super.field2210 + var9;
                    int var11 = super.field2210 * arg0;
                    int var12 = super.field2210 + var11;
                    int var17;
                    int var18;
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    int var26;
                    int var27;
                    int var28;
                    int var31;
                    int var32;
                    int var33;
                    int var34;
                    int var35;
                    int var36;
                    if ((var8.field5193 & 1) == 0) {
                        int var13 = super.field261[arg3][arg0];
                        int var14 = super.field261[arg3 - -1][arg0];
                        int var15 = super.field261[arg3 - -1][arg0 + 1];
                        int var16 = super.field261[arg3][arg0 + 1];
                        int var19;
                        if (~super.field263 == 0) {
                            var17 = (super.field245 * var11 + super.field253 * var13 + super.field246 * var9 >> 14) + super.field256;
                            if (~var17 >= ~super.field254.field8607) {
                                return;
                            }
                            var18 = (super.field246 * var10 + super.field245 * var11 - -(super.field253 * var14) >> 14) + super.field256;
                            if (super.field254.field8607 >= var18) {
                                return;
                            }
                            var19 = (super.field245 * var12 + super.field253 * var15 + super.field246 * var10 >> 14) + super.field256;
                            if (var19 <= super.field254.field8607) {
                                return;
                            }
                            var20 = super.field256 - -(super.field246 * var9 + super.field253 * var16 + super.field245 * var12 >> 14);
                            if (~var20 >= ~super.field254.field8607) {
                                return;
                            }
                        } else {
                            var20 = super.field263;
                            var19 = super.field263;
                            var18 = super.field263;
                            var17 = super.field263;
                        }
                        var21 = (super.field258 * var9 + super.field255 * var11 + super.field251 * var13 >> 14) + super.field249;
                        var22 = (super.field260 * var13 + super.field262 * var11 + super.field243 * var9 >> 14) + super.field264;
                        var23 = super.field254.field8611 * var21 / var17 + arg4.field3961;
                        var24 = super.field254.field8630 * var22 / var17 + arg4.field3964;
                        var25 = (super.field258 * var10 + super.field255 * var11 + super.field251 * var14 >> 14) + super.field249;
                        var26 = super.field254.field8611 * var25 / var18 + arg4.field3961;
                        var27 = (super.field243 * var10 - -(super.field260 * var14) - -(super.field262 * var11) >> 14) + super.field264;
                        var28 = arg4.field3964 - -(super.field254.field8630 * var27 / var18);
                        int var29 = (super.field258 * var10 + super.field255 * var12 + super.field251 * var15 >> 14) + super.field249;
                        int var30 = super.field264 - -(super.field262 * var12 + super.field260 * var15 + super.field243 * var10 >> 14);
                        var31 = super.field254.field8611 * var29 / var19 + arg4.field3961;
                        var32 = (super.field258 * var9 + super.field251 * var16 - -(super.field255 * var12) >> 14) + super.field249;
                        var33 = super.field254.field8630 * var30 / var19 + arg4.field3964;
                        var34 = super.field264 - -(super.field262 * var12 + super.field260 * var16 + super.field243 * var9 >> 14);
                        var35 = super.field254.field8611 * var32 / var20 + arg4.field3961;
                        var36 = arg4.field3964 - -(super.field254.field8630 * var34 / var20);
                    } else {
                        int var37 = super.field261[arg3][arg0];
                        int var39;
                        if (~super.field263 == 0) {
                            int var38 = super.field253 * var37;
                            var17 = (super.field245 * var11 + (super.field246 * var9 - -var38) >> 14) + super.field256;
                            if (var17 <= super.field254.field8607) {
                                return;
                            }
                            var18 = (super.field246 * var10 + super.field245 * var11 + var38 >> 14) + super.field256;
                            if (~super.field254.field8607 <= ~var18) {
                                return;
                            }
                            var39 = (super.field245 * var12 + super.field246 * var10 + var38 >> 14) + super.field256;
                            if (super.field254.field8607 >= var39) {
                                return;
                            }
                            var20 = super.field256 - -(super.field246 * var9 + var38 - -(super.field245 * var12) >> 14);
                            if (~super.field254.field8607 <= ~var20) {
                                return;
                            }
                        } else {
                            var20 = super.field263;
                            var39 = super.field263;
                            var18 = super.field263;
                            var17 = super.field263;
                        }
                        int var40 = super.field251 * var37;
                        int var41 = super.field260 * var37;
                        var21 = (super.field258 * var9 - -var40 - -(super.field255 * var11) >> 14) + super.field249;
                        var22 = (super.field262 * var11 + (super.field243 * var9 - -var41) >> 14) + super.field264;
                        var23 = arg4.field3961 - -(super.field254.field8611 * var21 / var17);
                        var25 = (super.field255 * var11 + super.field258 * var10 + var40 >> 14) + super.field249;
                        var24 = arg4.field3964 - -(super.field254.field8630 * var22 / var17);
                        var27 = (super.field243 * var10 + super.field262 * var11 + var41 >> 14) + super.field264;
                        var26 = arg4.field3961 - -(super.field254.field8611 * var25 / var18);
                        var28 = arg4.field3964 - -(super.field254.field8630 * var27 / var18);
                        int var42 = super.field249 - -(super.field258 * var10 - (-(super.field255 * var12) + -var40) >> 14);
                        int var43 = super.field264 - -(super.field262 * var12 + super.field243 * var10 + var41 >> 14);
                        var31 = super.field254.field8611 * var42 / var39 + arg4.field3961;
                        var32 = (super.field255 * var12 + super.field258 * var9 + var40 >> 14) + super.field249;
                        var33 = super.field254.field8630 * var43 / var39 + arg4.field3964;
                        var34 = (super.field262 * var12 + super.field243 * var9 - -var41 >> 14) + super.field264;
                        var35 = super.field254.field8611 * var32 / var20 + arg4.field3961;
                        var36 = super.field254.field8630 * var34 / var20 + arg4.field3964;
                    }
                    if ((var28 - var36) * (-var35 + var31) - (var33 - var36) * (-var35 + var26) > 0) {
                        arg4.field3966 = var31 < 0 || var35 < 0 || ~var26 > -1 || arg4.field3956 < var31 || ~var35 < ~arg4.field3956 || arg4.field3956 < var26;
                        if (var8.field5189 >= 0) {
                            if (this.method151(super.field254.field9731.method1728(-126, var8.field5189).field7870)) {
                                arg4.field3954 = 100;
                            }
                            arg4.method1758(var33, var36, var28, var31, var35, var26, 65535 & var8.field5190, 65535 & var8.field5187, var8.field5191 & 65535, var21, var25, var32, var22, var27, var34, var17, var18, var20, var8.field5189);
                            arg4.field3954 = 0;
                        } else {
                            arg4.method1759(var33, var36, var28, var31, var35, var26, var8.field5190 & 65535, var8.field5187 & 65535, 65535 & var8.field5191);
                        }
                    }
                    if (~((var36 - var28) * (-var26 + var23) + -((-var26 + var35) * (-var28 + var24))) < -1) {
                        arg4.field3966 = ~var23 > -1 || ~var26 > -1 || var35 < 0 || arg4.field3956 < var23 || arg4.field3956 < var26 || arg4.field3956 < var35;
                        if (var8.field5189 < 0) {
                            arg4.method1759(var24, var28, var36, var23, var26, var35, 65535 & var8.field5188, var8.field5191 & 65535, 65535 & var8.field5187);
                            return;
                        }
                        if (this.method151(super.field254.field9731.method1728(arg5 ^ -126, var8.field5189).field7870)) {
                            arg4.field3954 = 100;
                        }
                        arg4.method1758(var24, var28, var36, var23, var26, var35, var8.field5188 & 65535, var8.field5191 & 65535, var8.field5187 & 65535, var21, var25, var32, var22, var27, var34, var17, var18, var20, var8.field5189);
                        arg4.field3954 = 0;
                    }
                }
            } else {
                class342 var44 = super.field247[arg3][arg0];
                if (var44 != null) {
                    if (~super.field263 != 0) {
                        for (int var45 = 0; var45 < var44.field5026; ++var45) {
                            int var46 = var44.field5030[var45] - -(arg3 << super.field2212);
                            short var47 = var44.field5018[var45];
                            int var48 = var44.field5022[var45] - -(arg0 << super.field2212);
                            int var49 = (super.field260 * var47 + super.field262 * var48 + super.field243 * var46 >> 14) + super.field264;
                            int var50 = (super.field258 * var46 + super.field255 * var48 + super.field251 * var47 >> 14) + super.field249;
                            arg1[var45] = super.field254.field8611 * var50 / super.field263 + arg4.field3961;
                            arg6[var45] = super.field254.field8630 * var49 / super.field263 + arg4.field3964;
                        }
                    } else {
                        for (int var51 = 0; ~var44.field5026 < ~var51; ++var51) {
                            int var91 = var44.field5030[var51] - -(arg3 << super.field2212);
                            short var92 = var44.field5018[var51];
                            int var93 = var44.field5022[var51] - -(arg0 << super.field2212);
                            int var94 = (super.field245 * var93 + super.field253 * var92 + super.field246 * var91 >> 14) + super.field256;
                            if (var94 <= super.field254.field8607) {
                                return;
                            }
                            int var95 = (super.field262 * var93 + super.field260 * var92 + super.field243 * var91 >> 14) + super.field264;
                            int var96 = (super.field255 * var93 + super.field258 * var91 + super.field251 * var92 >> 14) + super.field249;
                            arg1[var51] = super.field254.field8611 * var96 / var94 + arg4.field3961;
                            arg6[var51] = super.field254.field8630 * var95 / var94 + arg4.field3964;
                        }
                    }
                    if (var44.field5024 == null) {
                        for (int var52 = 0; ~var44.field5025 < ~var52; ++var52) {
                            short var53 = var44.field5029[var52];
                            short var54 = var44.field5021[var52];
                            short var55 = var44.field5020[var52];
                            int var56 = arg1[var53];
                            int var57 = arg1[var54];
                            int var58 = arg1[var55];
                            int var59 = arg6[var53];
                            int var60 = arg6[var54];
                            int var61 = arg6[var55];
                            if (~((var56 - var57) * (-var60 + var61) + -((-var57 + var58) * (-var60 + var59))) < -1) {
                                int var62 = var44.field5019[var52];
                                if (var62 != -1) {
                                    arg4.field3966 = ~var56 > -1 || var57 < 0 || var58 < 0 || arg4.field3956 < var56 || var57 > arg4.field3956 || ~arg4.field3956 > ~var58;
                                    arg4.method1759(var59, var60, var61, var56, var57, var58, class54.method303(var62, 127, var44.field5028[var53]), class54.method303(var62, 127, var44.field5028[var54]), class54.method303(var62, 127, var44.field5028[var55]));
                                }
                            }
                        }
                    } else {
                        int var63 = super.field261[arg3][arg0];
                        int var64 = super.field261[arg3 - -1][arg0];
                        int var65 = super.field261[arg3][arg0 + 1];
                        int var66 = super.field2210 * arg3;
                        int var67 = super.field2210 + var66;
                        int var68 = super.field2210 * arg0;
                        int var69 = super.field2210 + var68;
                        int var70 = (super.field258 * var66 + super.field255 * var68 + super.field251 * var63 >> 14) + super.field249;
                        int var71 = super.field264 - -(super.field262 * var68 + super.field260 * var63 + super.field243 * var66 >> 14);
                        int var72 = (super.field253 * var63 + super.field246 * var66 - -(super.field245 * var68) >> 14) + super.field256;
                        int var73 = (super.field255 * var68 + (super.field258 * var67 - -(super.field251 * var64)) >> 14) + super.field249;
                        int var74 = (super.field262 * var68 + (super.field243 * var67 - -(super.field260 * var64)) >> 14) + super.field264;
                        int var75 = (super.field245 * var68 + (super.field246 * var67 - -(super.field253 * var64)) >> 14) + super.field256;
                        int var76 = (super.field251 * var65 + super.field258 * var66 + super.field255 * var69 >> 14) + super.field249;
                        int var77 = super.field264 - -(super.field260 * var65 + (super.field243 * var66 - -(super.field262 * var69)) >> 14);
                        int var78 = (super.field245 * var69 + (super.field246 * var66 - -(super.field253 * var65)) >> 14) + super.field256;
                        for (int var79 = 0; ~var44.field5025 < ~var79; ++var79) {
                            short var80 = var44.field5029[var79];
                            short var81 = var44.field5021[var79];
                            short var82 = var44.field5020[var79];
                            int var83 = arg1[var80];
                            int var84 = arg1[var81];
                            int var85 = arg1[var82];
                            int var86 = arg6[var80];
                            int var87 = arg6[var81];
                            int var88 = arg6[var82];
                            if ((-var84 + var83) * (-var87 + var88) + -((-var84 + var85) * (-var87 + var86)) > 0) {
                                arg4.field3966 = ~var83 > -1 || var84 < 0 || ~var85 > -1 || arg4.field3956 < var83 || arg4.field3956 < var84 || ~var85 < ~arg4.field3956;
                                short var89 = var44.field5024[var79];
                                if (~var89 == 0) {
                                    int var90 = var44.field5019[var79];
                                    if (~var90 != 0) {
                                        arg4.method1759(var86, var87, var88, var83, var84, var85, class54.method303(var90, 127, var44.field5028[var80]), class54.method303(var90, 127, var44.field5028[var81]), class54.method303(var90, 127, var44.field5028[var82]));
                                    }
                                } else {
                                    if (this.method151(super.field254.field9731.method1728(arg5 + -120, var89).field7870)) {
                                        arg4.field3954 = 100;
                                    }
                                    arg4.method1758(var86, var87, var88, var83, var84, var85, var44.field5028[var80], var44.field5028[var81], var44.field5028[var82], var70, var73, var76, var71, var74, var77, var72, var75, var78, var89);
                                    arg4.field3954 = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lkb;IIII[[I[[II)V", line = 1451)
    public class71(class633 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
}
