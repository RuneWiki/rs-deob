import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class471 extends class26 {

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "[Luo;")
    public static class207[] field6372 = new class207[34];

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
    public static int field6379;

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "I")
    public static int field6380;

    @OriginalMember(owner = "client!ir", name = "L", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!ir", name = "M", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
    public static void method2647(byte arg0) {
        field6372 = null;
        if (arg0 != -7) {
            field6379 = 90;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[ILgd;[II[IZZ[I)V")
    private final void method2648(int arg0, int[] arg1, class406 arg2, int[] arg3, int arg4, int[] arg5, boolean arg6, boolean arg7, int[] arg8) {
        ++field6382;
        class378 var10 = super.field250[arg4][arg0];
        if (!arg7) {
            if (var10 != null) {
                if (~(var10.field5419 & 2) == -1) {
                    int var11 = super.field2210 * arg4;
                    int var12 = var11 - -super.field2210;
                    int var13 = super.field2210 * arg0;
                    int var14 = super.field2210 + var13;
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
                    if ((var10.field5419 & 1) != 0 && !arg6) {
                        int var19 = super.field261[arg4][arg0];
                        if (super.field263 != -1) {
                            var20 = super.field263;
                            var21 = super.field263;
                            var22 = super.field263;
                            var23 = super.field263;
                        } else {
                            int var24 = super.field253 * var19;
                            var23 = super.field256 - -(super.field246 * var11 + var24 - -(super.field245 * var13) >> 14);
                            if (~var23 >= ~super.field254.field8607) {
                                return;
                            }
                            var22 = (super.field246 * var12 - -(super.field245 * var13) + var24 >> 14) + super.field256;
                            if (~super.field254.field8607 <= ~var22) {
                                return;
                            }
                            var21 = (super.field246 * var12 + super.field245 * var14 + var24 >> 14) + super.field256;
                            if (~super.field254.field8607 <= ~var21) {
                                return;
                            }
                            var20 = (super.field245 * var14 + super.field246 * var11 + var24 >> 14) + super.field256;
                            if (~var20 >= ~super.field254.field8607) {
                                return;
                            }
                        }
                        if (super.field254.field8598) {
                            int var25 = -super.field254.field8631 + var23;
                            if (~var25 < -1) {
                                var15 = var25;
                                if (var25 > 255) {
                                    var15 = 255;
                                }
                            }
                            int var26 = -super.field254.field8631 + var22;
                            if (~var26 < -1) {
                                var16 = var26;
                                if (var26 > 255) {
                                    var16 = 255;
                                }
                            }
                            int var27 = -super.field254.field8631 + var21;
                            if (var27 > 0) {
                                var17 = var27;
                                if (~var27 < -256) {
                                    var17 = 255;
                                }
                            }
                            int var28 = var20 - super.field254.field8631;
                            if (~var28 < -1) {
                                var18 = var28;
                                if (~var28 < -256) {
                                    var18 = 255;
                                }
                            }
                        }
                        int var29 = super.field251 * var19;
                        int var30 = super.field260 * var19;
                        var31 = (super.field255 * var13 + super.field258 * var11 + var29 >> 14) + super.field249;
                        var32 = super.field254.field8611 * var31 / var23 + arg2.field5732;
                        var33 = (super.field262 * var13 + super.field243 * var11 - -var30 >> 14) + super.field264;
                        var34 = (super.field255 * var13 + (super.field258 * var12 - -var29) >> 14) + super.field249;
                        var35 = arg2.field5729 - -(super.field254.field8630 * var33 / var23);
                        var36 = (super.field262 * var13 + super.field243 * var12 + var30 >> 14) + super.field264;
                        var37 = super.field254.field8611 * var34 / var22 + arg2.field5732;
                        var38 = super.field254.field8630 * var36 / var22 + arg2.field5729;
                        var39 = (super.field258 * var12 + super.field255 * var14 + var29 >> 14) + super.field249;
                        var40 = (super.field243 * var12 + var30 - -(super.field262 * var14) >> 14) + super.field264;
                        var41 = super.field254.field8611 * var39 / var21 + arg2.field5732;
                        var42 = super.field254.field8630 * var40 / var21 + arg2.field5729;
                        var43 = (super.field255 * var14 + (super.field258 * var11 - -var29) >> 14) + super.field249;
                        var44 = super.field254.field8611 * var43 / var20 + arg2.field5732;
                        var45 = (super.field243 * var11 - -var30 - -(super.field262 * var14) >> 14) + super.field264;
                        var46 = arg2.field5729 - -(super.field254.field8630 * var45 / var20);
                    } else {
                        int var47 = super.field261[arg4][arg0];
                        int var48 = super.field261[arg4 - -1][arg0];
                        int var49 = super.field261[arg4 + 1][arg0 - -1];
                        int var50 = super.field261[arg4][arg0 + 1];
                        if (super.field263 != -1) {
                            var20 = super.field263;
                            var21 = super.field263;
                            var22 = super.field263;
                            var23 = super.field263;
                        } else {
                            var23 = (super.field253 * var47 + (super.field246 * var11 - -(super.field245 * var13)) >> 14) + super.field256;
                            if (var23 <= super.field254.field8607) {
                                return;
                            }
                            var22 = (super.field253 * var48 + super.field246 * var12 + super.field245 * var13 >> 14) + super.field256;
                            if (~var22 >= ~super.field254.field8607) {
                                return;
                            }
                            var21 = (super.field246 * var12 - (-(super.field253 * var49) + -(super.field245 * var14)) >> 14) + super.field256;
                            if (var21 <= super.field254.field8607) {
                                return;
                            }
                            var20 = super.field256 - -(super.field246 * var11 - (-(super.field253 * var50) + -(super.field245 * var14)) >> 14);
                            if (super.field254.field8607 >= var20) {
                                return;
                            }
                        }
                        if (!arg6) {
                            if (super.field254.field8598) {
                                int var51 = var23 - super.field254.field8631;
                                if (var51 > 0) {
                                    var15 = var51;
                                    if (var51 > 255) {
                                        var15 = 255;
                                    }
                                }
                                int var52 = -super.field254.field8631 + var22;
                                if (var52 > 0) {
                                    var16 = var52;
                                    if (~var52 < -256) {
                                        var16 = 255;
                                    }
                                }
                                int var53 = -super.field254.field8631 + var21;
                                if (var53 > 0) {
                                    var17 = var53;
                                    if (var53 > 255) {
                                        var17 = 255;
                                    }
                                }
                                int var54 = var20 - super.field254.field8631;
                                if (var54 > 0) {
                                    var18 = var54;
                                    if (~var54 < -256) {
                                        var18 = 255;
                                    }
                                }
                            }
                        } else {
                            int var55 = -super.field254.field8631 + var23;
                            if (~var55 < -256) {
                                var55 = 255;
                            }
                            if (var55 > 0) {
                                var15 = var55;
                                int var56 = var10.field5425 * var55 / 255;
                                if (~var56 < -1) {
                                    var47 -= var56;
                                }
                            }
                            int var57 = -super.field254.field8631 + var22;
                            if (~var57 < -256) {
                                var57 = 255;
                            }
                            if (var57 > 0) {
                                var16 = var57;
                                int var58 = var10.field5427 * var57 / 255;
                                if (~var58 < -1) {
                                    var48 -= var58;
                                }
                            }
                            int var59 = -super.field254.field8631 + var21;
                            if (~var59 < -256) {
                                var59 = 255;
                            }
                            if (~var59 < -1) {
                                var17 = var59;
                                int var60 = var10.field5426 * var59 / 255;
                                if (~var60 < -1) {
                                    var49 -= var60;
                                }
                            }
                            int var61 = -super.field254.field8631 + var20;
                            if (var61 > 255) {
                                var61 = 255;
                            }
                            if (var61 > 0) {
                                var18 = var61;
                                int var62 = var10.field5422 * var61 / 255;
                                if (var62 > 0) {
                                    var50 -= var62;
                                }
                            }
                        }
                        var31 = (super.field255 * var13 + super.field258 * var11 + super.field251 * var47 >> 14) + super.field249;
                        var33 = super.field264 - -(super.field262 * var13 + super.field243 * var11 - -(super.field260 * var47) >> 14);
                        var32 = super.field254.field8611 * var31 / var23 + arg2.field5732;
                        var35 = arg2.field5729 - -(super.field254.field8630 * var33 / var23);
                        var34 = super.field249 - -(super.field258 * var12 + super.field255 * var13 - -(super.field251 * var48) >> 14);
                        var37 = super.field254.field8611 * var34 / var22 + arg2.field5732;
                        var36 = super.field264 - -(super.field262 * var13 + super.field260 * var48 + super.field243 * var12 >> 14);
                        var38 = super.field254.field8630 * var36 / var22 + arg2.field5729;
                        var39 = (super.field258 * var12 + super.field255 * var14 + super.field251 * var49 >> 14) + super.field249;
                        var40 = super.field264 - -(super.field260 * var49 + super.field262 * var14 + super.field243 * var12 >> 14);
                        var41 = super.field254.field8611 * var39 / var21 + arg2.field5732;
                        var43 = (super.field255 * var14 + super.field258 * var11 + super.field251 * var50 >> 14) + super.field249;
                        var42 = super.field254.field8630 * var40 / var21 + arg2.field5729;
                        var45 = super.field264 - -(super.field260 * var50 + super.field243 * var11 - -(super.field262 * var14) >> 14);
                        var44 = super.field254.field8611 * var43 / var20 + arg2.field5732;
                        var46 = super.field254.field8630 * var45 / var20 + arg2.field5729;
                    }
                    boolean var63 = ~var10.field5420 != 0 && this.method151(super.field254.field9731.method1728(-97, var10.field5420).field7870);
                    int var64 = var16 - (-var17 - var18);
                    if ((var41 - var44) * (-var46 + var38) + -((var37 - var44) * (-var46 + var42)) > 0) {
                        arg2.field5725 = var41 < 0 || ~var44 > -1 || ~var37 > -1 || ~arg2.field5735 > ~var41 || ~arg2.field5735 > ~var44 || ~arg2.field5735 > ~var37;
                        if (var64 >= 765) {
                            arg2.method2396(var42, var46, var38, var41, var44, var37, var21, var20, var22, super.field254.field8605);
                        } else {
                            if (var63) {
                                arg2.field5727 = 100;
                            }
                            if (~var64 >= -1) {
                                if (~var10.field5420 > -1) {
                                    arg2.method2382(var42, var46, var38, var41, var44, var37, var21, var20, var22, var10.field5421, var10.field5428, var10.field5429);
                                } else {
                                    arg2.method2388(var42, var46, var38, var41, var44, var37, var21, var20, var22, var10.field5421, var10.field5428, var10.field5429, var39, var43, var34, var40, var45, var36, var21, var20, var22, var10.field5420);
                                }
                            } else if (var10.field5420 >= 0) {
                                arg2.method2386(var42, var46, var38, var41, var44, var37, var21, var20, var22, super.field254.field8605, var17, var18, var16, var10.field5421, var10.field5428, var10.field5429, var39, var43, var34, var40, var45, var36, var21, var20, var22, var10.field5420);
                            } else {
                                arg2.method2382(var42, var46, var38, var41, var44, var37, var21, var20, var22, class584.method3272(super.field254.field8605 | var17 << 24, var10.field5421, (byte) 96), class584.method3272(super.field254.field8605 | var18 << 24, var10.field5428, (byte) 96), class584.method3272(var16 << 24 | super.field254.field8605, var10.field5429, (byte) 96));
                            }
                            arg2.field5727 = 0;
                        }
                    }
                    int var65 = var15 + var18 - -var16;
                    if (~((-var37 + var32) * (-var38 + var46) + -((-var37 + var44) * (-var38 + var35))) < -1) {
                        arg2.field5725 = ~var32 > -1 || ~var37 > -1 || ~var44 > -1 || ~arg2.field5735 > ~var32 || ~arg2.field5735 > ~var37 || arg2.field5735 < var44;
                        if (~var65 > -766) {
                            if (var63) {
                                arg2.field5727 = 100;
                            }
                            if (~var65 < -1) {
                                if (var10.field5420 < 0) {
                                    arg2.method2382(var35, var38, var46, var32, var37, var44, var23, var22, var20, class584.method3272(super.field254.field8605 | var15 << 24, var10.field5423, (byte) 96), class584.method3272(var16 << 24 | super.field254.field8605, var10.field5429, (byte) 96), class584.method3272(super.field254.field8605 | var18 << 24, var10.field5428, (byte) 96));
                                } else {
                                    arg2.method2386(var35, var38, var46, var32, var37, var44, var23, var22, var20, super.field254.field8605, var15, var16, var18, var10.field5423, var10.field5429, var10.field5428, var31, var34, var43, var33, var36, var45, var23, var22, var20, var10.field5420);
                                }
                            } else if (var10.field5420 >= 0) {
                                arg2.method2388(var35, var38, var46, var32, var37, var44, var23, var22, var20, var10.field5423, var10.field5429, var10.field5428, var31, var34, var43, var33, var36, var45, var23, var22, var20, var10.field5420);
                            } else {
                                arg2.method2382(var35, var38, var46, var32, var37, var44, var23, var22, var20, var10.field5423, var10.field5429, var10.field5428);
                            }
                            arg2.field5727 = 0;
                            return;
                        }
                        arg2.method2396(var35, var38, var46, var32, var37, var44, var23, var22, var20, super.field254.field8605);
                    }
                }
            } else {
                class392 var66 = super.field252[arg4][arg0];
                if (var66 != null) {
                    if (~super.field263 != 0) {
                        for (int var67 = 0; ~var67 > ~var66.field5621; ++var67) {
                            int var68 = var66.field5622[var67] - -(arg4 << super.field2212);
                            int var69 = var66.field5615[var67];
                            int var70 = var66.field5614[var67] - -(arg0 << super.field2212);
                            arg3[var67] = 0;
                            if (!arg6) {
                                if (super.field254.field8598) {
                                    int var71 = -super.field254.field8631 + super.field263;
                                    if (~var71 < -1) {
                                        arg3[var67] = var71;
                                        if (~arg3[var67] < -256) {
                                            arg3[var67] = 255;
                                        }
                                    }
                                }
                            } else {
                                int var72 = super.field263 - super.field254.field8631;
                                if (~var72 < -256) {
                                    var72 = 255;
                                }
                                if (var72 > 0) {
                                    arg3[var67] = var72;
                                    int var73 = var66.field5617[var67] * var72 / 255;
                                    if (~var73 < -1) {
                                        var69 -= var73;
                                    }
                                }
                            }
                            int var74 = (super.field255 * var70 + super.field258 * var68 + super.field251 * var69 >> 14) + super.field249;
                            int var75 = (super.field262 * var70 + super.field260 * var69 + super.field243 * var68 >> 14) + super.field264;
                            arg5[var67] = super.field254.field8611 * var74 / super.field263 + arg2.field5732;
                            arg1[var67] = super.field254.field8630 * var75 / super.field263 + arg2.field5729;
                            arg8[var67] = super.field263;
                        }
                    } else {
                        for (int var76 = 0; var66.field5621 > var76; ++var76) {
                            int var116 = (arg4 << super.field2212) + var66.field5622[var76];
                            int var117 = var66.field5615[var76];
                            int var118 = var66.field5614[var76] - -(arg0 << super.field2212);
                            int var119 = super.field256 - -(super.field253 * var117 + (super.field246 * var116 - -(super.field245 * var118)) >> 14);
                            if (~super.field254.field8607 <= ~var119) {
                                return;
                            }
                            arg3[var76] = 0;
                            if (!arg6) {
                                if (super.field254.field8598) {
                                    int var120 = -super.field254.field8631 + var119;
                                    if (var120 > 0) {
                                        arg3[var76] = var120;
                                        if (arg3[var76] > 255) {
                                            arg3[var76] = 255;
                                        }
                                    }
                                }
                            } else {
                                int var121 = -super.field254.field8631 + var119;
                                if (~var121 < -256) {
                                    var121 = 255;
                                }
                                if (~var121 < -1) {
                                    arg3[var76] = var121;
                                    int var122 = var66.field5617[var76] * var121 / 255;
                                    if (var122 > 0) {
                                        var117 -= var122;
                                    }
                                }
                            }
                            int var123 = (super.field260 * var117 + super.field262 * var118 + super.field243 * var116 >> 14) + super.field264;
                            int var124 = (super.field258 * var116 - (-(super.field251 * var117) - super.field255 * var118) >> 14) + super.field249;
                            arg5[var76] = arg2.field5732 - -(super.field254.field8611 * var124 / var119);
                            arg1[var76] = super.field254.field8630 * var123 / var119 + arg2.field5729;
                            arg8[var76] = var119;
                        }
                    }
                    if (var66.field5618 != null) {
                        int var77 = super.field261[arg4][arg0];
                        int var78 = super.field261[arg4 + 1][arg0];
                        int var79 = super.field261[arg4][arg0 + 1];
                        int var80 = super.field2210 * arg4;
                        int var81 = var80 - -super.field2210;
                        int var82 = super.field2210 * arg0;
                        int var83 = super.field2210 + var82;
                        int var84 = (super.field255 * var82 + (super.field258 * var80 - -(super.field251 * var77)) >> 14) + super.field249;
                        int var85 = (super.field243 * var80 - (-(super.field262 * var82) + -(super.field260 * var77)) >> 14) + super.field264;
                        int var86 = super.field256 - -(super.field246 * var80 + super.field253 * var77 + super.field245 * var82 >> 14);
                        int var87 = (super.field255 * var82 + (super.field258 * var81 - -(super.field251 * var78)) >> 14) + super.field249;
                        int var88 = super.field264 - -(super.field262 * var82 + super.field260 * var78 + super.field243 * var81 >> 14);
                        int var89 = (super.field246 * var81 + super.field253 * var78 + super.field245 * var82 >> 14) + super.field256;
                        int var90 = (super.field255 * var83 + (super.field258 * var80 - -(super.field251 * var79)) >> 14) + super.field249;
                        int var91 = super.field264 - -(super.field260 * var79 + super.field262 * var83 + super.field243 * var80 >> 14);
                        int var92 = (super.field246 * var80 - (-(super.field253 * var79) + -(super.field245 * var83)) >> 14) + super.field256;
                        for (int var93 = 0; var93 < var66.field5619; ++var93) {
                            int var94 = var93 * 3;
                            int var95 = var94 + 1;
                            int var96 = var95 - -1;
                            int var97 = arg5[var94];
                            int var98 = arg5[var95];
                            int var99 = arg5[var96];
                            int var100 = arg1[var94];
                            int var101 = arg1[var95];
                            int var102 = arg1[var96];
                            int var103 = arg3[var95] + arg3[var96] + arg3[var94];
                            if (~((-var98 + var97) * (-var101 + var102) + -((-var98 + var99) * (-var101 + var100))) < -1) {
                                arg2.field5725 = var97 < 0 || var98 < 0 || ~var99 > -1 || arg2.field5735 < var97 || ~arg2.field5735 > ~var98 || ~var99 < ~arg2.field5735;
                                short var104 = var66.field5618[var93];
                                if (var103 >= 765) {
                                    arg2.method2396(var100, var101, var102, var97, var98, var99, arg8[var94], arg8[var95], arg8[var96], super.field254.field8605);
                                } else {
                                    if (~var104 != 0 && this.method151(super.field254.field9731.method1728(-94, var104).field7870)) {
                                        arg2.field5727 = 100;
                                    }
                                    if (~var103 >= -1) {
                                        if (var104 == -1) {
                                            if ((16777215 & var66.field5623[var94]) != 0) {
                                                arg2.method2382(var100, var101, var102, var97, var98, var99, arg8[var94], arg8[var95], arg8[var96], var66.field5623[var94], var66.field5623[var95], var66.field5623[var96]);
                                            }
                                        } else {
                                            arg2.method2388(var100, var101, var102, var97, var98, var99, arg8[var94], arg8[var95], arg8[var96], var66.field5623[var94], var66.field5623[var95], var66.field5623[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                        }
                                    } else if (~var104 != 0) {
                                        arg2.method2386(var100, var101, var102, var97, var98, var99, arg8[var94], arg8[var95], arg8[var96], super.field254.field8605, arg3[var94], arg3[var95], arg3[var96], var66.field5623[var94], var66.field5623[var95], var66.field5623[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                    } else if (~(16777215 & var66.field5623[var94]) != -1) {
                                        arg2.method2382(var100, var101, var102, var97, var98, var99, arg8[var94], arg8[var95], arg8[var96], class584.method3272(arg3[var94] << 24 | super.field254.field8605, var66.field5623[var94], (byte) 96), class584.method3272(super.field254.field8605 | arg3[var95] << 24, var66.field5623[var95], (byte) 96), class584.method3272(super.field254.field8605 | arg3[var96] << 24, var66.field5623[var96], (byte) 96));
                                    }
                                    arg2.field5727 = 0;
                                }
                            }
                        }
                    } else {
                        for (int var105 = 0; var105 < var66.field5619; ++var105) {
                            int var106 = var105 * 3;
                            int var107 = var106 + 1;
                            int var108 = var107 - -1;
                            int var109 = arg5[var106];
                            int var110 = arg5[var107];
                            int var111 = arg5[var108];
                            int var112 = arg1[var106];
                            int var113 = arg1[var107];
                            int var114 = arg1[var108];
                            int var115 = arg3[var106] + arg3[var107] - -arg3[var108];
                            if ((var109 - var110) * (-var113 + var114) + -((-var110 + var111) * (-var113 + var112)) > 0) {
                                arg2.field5725 = var109 < 0 || var110 < 0 || ~var111 > -1 || ~var109 < ~arg2.field5735 || var110 > arg2.field5735 || ~arg2.field5735 > ~var111;
                                if (~var115 <= -766) {
                                    arg2.method2396(var112, var113, var114, var109, var110, var111, arg8[var106], arg8[var107], arg8[var108], super.field254.field8605);
                                } else if (var115 <= 0) {
                                    if ((16777215 & var66.field5623[var106]) != 0) {
                                        arg2.method2382(var112, var113, var114, var109, var110, var111, arg8[var106], arg8[var107], arg8[var108], var66.field5623[var106], var66.field5623[var107], var66.field5623[var108]);
                                    }
                                } else if (~(16777215 & var66.field5623[var106]) != -1) {
                                    arg2.method2382(var112, var113, var114, var109, var110, var111, arg8[var106], arg8[var107], arg8[var108], class548.method3080(var66.field5623[var106], -111, super.field254.field8605, arg3[var106]), class548.method3080(var66.field5623[var107], -116, super.field254.field8605, arg3[var107]), class548.method3080(var66.field5623[var108], -127, super.field254.field8605, arg3[var108]));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III[[ZZ)V")
    public final void method149(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        ++field6373;
        class263 var6 = super.field254.field8617;
        super.field263 = -1;
        super.field243 = var6.field3620;
        super.field245 = var6.field3621;
        super.field262 = var6.field3619;
        super.field255 = var6.field3617;
        super.field264 = var6.field3622;
        super.field260 = var6.field3627;
        super.field249 = var6.field3626;
        super.field256 = var6.field3623;
        super.field253 = var6.field3618;
        super.field251 = var6.field3624;
        super.field246 = var6.field3625;
        super.field258 = var6.field3616;
        for (int var7 = 0; arg2 - -arg2 > var7; ++var7) {
            for (int var8 = 0; ~(arg2 - -arg2) < ~var8; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - (-var7 + arg2);
                    int var10 = -arg2 + arg1 + var8;
                    if (var9 >= 0 && super.field2214 > var9 && var10 >= 0 && ~super.field2215 < ~var10) {
                        this.method155(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
    public final void method155(int arg0, int arg1) {
        ++field6374;
        class388 var3 = (class388) super.field254.method1789(Thread.currentThread());
        var3.field5600.field5727 = 0;
        if (super.field250 != null) {
            this.method2648(arg1, var3.field5342, var3.field5600, var3.field5365, arg0, var3.field5339, super.field254.field8618, false, var3.field5357);
        } else if (super.field257 != null) {
            this.method2650(-1854471730, var3.field5357, arg0, var3.field5342, var3.field5339, arg1, var3.field5365, var3.field5600);
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lkb;IIII[[I[[II)V")
    public class471(class633 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[[ZIIILgd;[IIII[II)V")
    private final void method2649(int arg0, boolean[][] arg1, int arg2, int arg3, int arg4, class406 arg5, int[] arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11) {
        ++field6377;
        int var13 = (-arg2 + arg7) * arg0 / 256;
        int var14 = arg0 >> 8;
        boolean var15 = ((class527) super.field254).field7299;
        super.field254.method1798(false);
        arg5.field5723 = false;
        arg5.field5730 = false;
        int var16 = arg9;
        int var17 = arg4 - -var13;
        if (arg11 != 4995) {
            field6372 = null;
        }
        for (int var18 = arg8; arg3 > var18; ++var18) {
            for (int var19 = arg2; ~var19 > ~arg7; ++var19) {
                if (arg1[-arg8 + var18][-arg2 + var19]) {
                    if (super.field257[var18][var19] != null) {
                        class358 var35 = super.field257[var18][var19];
                        if (var35.field5189 != -1 && (var35.field5193 & 2) == 0 && ~var35.field5192 == 0) {
                            int var36 = super.field254.method3452(var35.field5189);
                            arg5.method2383(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class54.method303(var36, 127, 65535 & var35.field5190), class54.method303(var36, 127, 65535 & var35.field5187), class54.method303(var36, 127, var35.field5191 & 65535));
                            arg5.method2383(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, class54.method303(var36, arg11 ^ 5116, var35.field5188 & 65535), class54.method303(var36, 127, 65535 & var35.field5191), class54.method303(var36, 127, var35.field5187 & 65535));
                        } else if (~var35.field5192 != 0) {
                            int var37 = var35.field5192;
                            arg5.method2383(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var37, var37, var37);
                            arg5.method2383(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, var37, var37, var37);
                        } else {
                            arg5.method2383(-var14 + var17, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, 65535 & var35.field5190, var35.field5187 & 65535, var35.field5191 & 65535);
                            arg5.method2383(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, 65535 & var35.field5188, var35.field5191 & 65535, var35.field5187 & 65535);
                        }
                    } else if (super.field247[var18][var19] != null) {
                        class342 var20 = super.field247[var18][var19];
                        for (int var21 = 0; ~var20.field5026 < ~var21; ++var21) {
                            arg10[var21] = var20.field5030[var21] * var14 / super.field2210 + var16;
                            arg6[var21] = var17 - var20.field5022[var21] * var14 / super.field2210;
                        }
                        for (int var22 = 0; var20.field5025 > var22; ++var22) {
                            short var23 = var20.field5029[var22];
                            short var24 = var20.field5021[var22];
                            short var25 = var20.field5020[var22];
                            int var26 = arg10[var23];
                            int var27 = arg10[var24];
                            int var28 = arg10[var25];
                            int var29 = arg6[var23];
                            int var30 = arg6[var24];
                            int var31 = arg6[var25];
                            if (var20.field5023 != null && var20.field5023[var22] != -1) {
                                int var32 = var20.field5023[var22];
                                arg5.method2383(var29, var30, var31, var26, var27, var28, 100, 100, 100, class54.method303(var32, 127, var20.field5028[var23]), class54.method303(var32, arg11 + -4868, var20.field5028[var24]), class54.method303(var32, 127, var20.field5028[var25]));
                            } else if (var20.field5024 != null && ~var20.field5024[var22] != 0) {
                                int var33 = super.field254.method3452(var20.field5024[var22]);
                                arg5.method2383(var29, var30, var31, var26, var27, var28, 100, 100, 100, class54.method303(var33, 127, var20.field5028[var23]), class54.method303(var33, arg11 ^ 5116, var20.field5028[var24]), class54.method303(var33, 127, var20.field5028[var25]));
                            } else {
                                int var34 = var20.field5019[var22];
                                arg5.method2383(var29, var30, var31, var26, var27, var28, 100, 100, 100, class54.method303(var34, 127, var20.field5028[var23]), class54.method303(var34, 127, var20.field5028[var24]), class54.method303(var34, 127, var20.field5028[var25]));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var16 += var14;
            var17 = arg4 + var13;
        }
        arg5.field5730 = true;
        super.field254.method1798(var15);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[II[I[II[ILgd;)V")
    private final void method2650(int arg0, int[] arg1, int arg2, int[] arg3, int[] arg4, int arg5, int[] arg6, class406 arg7) {
        ++field6381;
        if (arg0 != -1854471730) {
            this.method2652(105, 18, 83, (boolean[][]) null, (class406) null, -57, (int[]) null, -88, 80, -20, -12, (int[]) null);
        }
        class358 var9 = super.field257[arg2][arg5];
        if (var9 != null) {
            if (~(var9.field5193 & 2) == -1) {
                int var10 = super.field2210 * arg2;
                int var11 = super.field2210 + var10;
                int var12 = super.field2210 * arg5;
                int var13 = var12 - -super.field2210;
                int var15;
                int var16;
                int var17;
                int var18;
                int var21;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var29;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                if (~(var9.field5193 & 1) != -1) {
                    int var14 = super.field261[arg2][arg5];
                    if (super.field263 != -1) {
                        var15 = super.field263;
                        var16 = super.field263;
                        var17 = super.field263;
                        var18 = super.field263;
                    } else {
                        int var19 = super.field253 * var14;
                        var18 = super.field256 - -(super.field245 * var12 + super.field246 * var10 + var19 >> 14);
                        if (super.field254.field8607 >= var18) {
                            return;
                        }
                        var17 = super.field256 - -(super.field246 * var11 + super.field245 * var12 + var19 >> 14);
                        if (~var17 >= ~super.field254.field8607) {
                            return;
                        }
                        var16 = (super.field245 * var13 + super.field246 * var11 + var19 >> 14) + super.field256;
                        if (super.field254.field8607 >= var16) {
                            return;
                        }
                        var15 = (super.field246 * var10 + (var19 - -(super.field245 * var13)) >> 14) + super.field256;
                        if (var15 <= super.field254.field8607) {
                            return;
                        }
                    }
                    int var20 = super.field251 * var14;
                    var21 = (super.field258 * var10 + super.field255 * var12 + var20 >> 14) + super.field249;
                    int var22 = super.field260 * var14;
                    var23 = arg7.field5732 - -(super.field254.field8611 * var21 / var18);
                    var24 = super.field264 - -(super.field243 * var10 + super.field262 * var12 + var22 >> 14);
                    var25 = (super.field258 * var11 - -(super.field255 * var12) + var20 >> 14) + super.field249;
                    var26 = arg7.field5729 - -(super.field254.field8630 * var24 / var18);
                    var27 = (super.field262 * var12 + super.field243 * var11 + var22 >> 14) + super.field264;
                    var28 = super.field254.field8611 * var25 / var17 + arg7.field5732;
                    var29 = arg7.field5729 - -(super.field254.field8630 * var27 / var17);
                    int var30 = (super.field258 * var11 + var20 - -(super.field255 * var13) >> 14) + super.field249;
                    int var31 = super.field264 - -(super.field262 * var13 + super.field243 * var11 + var22 >> 14);
                    var32 = super.field254.field8611 * var30 / var16 + arg7.field5732;
                    var33 = (super.field255 * var13 + super.field258 * var10 + var20 >> 14) + super.field249;
                    var34 = super.field254.field8630 * var31 / var16 + arg7.field5729;
                    var35 = (super.field262 * var13 + (super.field243 * var10 - -var22) >> 14) + super.field264;
                    var36 = super.field254.field8611 * var33 / var15 + arg7.field5732;
                    var37 = arg7.field5729 - -(super.field254.field8630 * var35 / var15);
                } else {
                    int var38 = super.field261[arg2][arg5];
                    int var39 = super.field261[arg2 + 1][arg5];
                    int var40 = super.field261[arg2 + 1][arg5 + 1];
                    int var41 = super.field261[arg2][arg5 + 1];
                    if (~super.field263 != 0) {
                        var15 = super.field263;
                        var16 = super.field263;
                        var17 = super.field263;
                        var18 = super.field263;
                    } else {
                        var18 = (super.field245 * var12 + super.field253 * var38 + super.field246 * var10 >> 14) + super.field256;
                        if (super.field254.field8607 >= var18) {
                            return;
                        }
                        var17 = (super.field245 * var12 + super.field253 * var39 + super.field246 * var11 >> 14) + super.field256;
                        if (~super.field254.field8607 <= ~var17) {
                            return;
                        }
                        var16 = super.field256 - -(super.field253 * var40 + (super.field246 * var11 - -(super.field245 * var13)) >> 14);
                        if (~var16 >= ~super.field254.field8607) {
                            return;
                        }
                        var15 = super.field256 - -(super.field245 * var13 + super.field253 * var41 + super.field246 * var10 >> 14);
                        if (super.field254.field8607 >= var15) {
                            return;
                        }
                    }
                    var21 = super.field249 - -(super.field258 * var10 + (super.field251 * var38 - -(super.field255 * var12)) >> 14);
                    var23 = arg7.field5732 - -(super.field254.field8611 * var21 / var18);
                    var24 = (super.field260 * var38 + super.field262 * var12 + super.field243 * var10 >> 14) + super.field264;
                    var26 = super.field254.field8630 * var24 / var18 + arg7.field5729;
                    var25 = (super.field258 * var11 + super.field255 * var12 + super.field251 * var39 >> 14) + super.field249;
                    var28 = arg7.field5732 - -(super.field254.field8611 * var25 / var17);
                    var27 = (super.field262 * var12 + super.field260 * var39 + super.field243 * var11 >> 14) + super.field264;
                    int var42 = super.field249 - -(super.field255 * var13 + super.field258 * var11 + super.field251 * var40 >> 14);
                    var29 = super.field254.field8630 * var27 / var17 + arg7.field5729;
                    int var43 = (super.field262 * var13 + super.field260 * var40 + super.field243 * var11 >> 14) + super.field264;
                    var32 = super.field254.field8611 * var42 / var16 + arg7.field5732;
                    var33 = (super.field255 * var13 + super.field258 * var10 + super.field251 * var41 >> 14) + super.field249;
                    var34 = super.field254.field8630 * var43 / var16 + arg7.field5729;
                    var36 = super.field254.field8611 * var33 / var15 + arg7.field5732;
                    var35 = super.field264 - -(super.field262 * var13 + super.field260 * var41 + super.field243 * var10 >> 14);
                    var37 = super.field254.field8630 * var35 / var15 + arg7.field5729;
                }
                if ((-var36 + var32) * (-var37 + var29) + -((-var36 + var28) * (-var37 + var34)) > 0) {
                    arg7.field5725 = ~var32 > -1 || var36 < 0 || ~var28 > -1 || arg7.field5735 < var32 || var36 > arg7.field5735 || var28 > arg7.field5735;
                    if (~var9.field5189 <= -1) {
                        if (this.method151(super.field254.field9731.method1728(-99, var9.field5189).field7870)) {
                            arg7.field5727 = 100;
                        }
                        arg7.method2388(var34, var37, var29, var32, var36, var28, var16, var15, var17, var9.field5190 & 65535, var9.field5187 & 65535, 65535 & var9.field5191, var21, var25, var33, var24, var27, var35, var18, var17, var15, var9.field5189);
                        arg7.field5727 = 0;
                    } else {
                        arg7.method2383(var34, var37, var29, var32, var36, var28, var16, var15, var17, 65535 & var9.field5190, 65535 & var9.field5187, var9.field5191 & 65535);
                    }
                }
                if (~((var37 - var29) * (-var28 + var23) + -((-var28 + var36) * (-var29 + var26))) < -1) {
                    arg7.field5725 = var23 < 0 || var28 < 0 || var36 < 0 || var23 > arg7.field5735 || var28 > arg7.field5735 || ~arg7.field5735 > ~var36;
                    if (~var9.field5189 > -1) {
                        arg7.method2383(var26, var29, var37, var23, var28, var36, var18, var17, var15, 65535 & var9.field5188, var9.field5191 & 65535, var9.field5187 & 65535);
                        return;
                    }
                    if (this.method151(super.field254.field9731.method1728(arg0 + 1854471624, var9.field5189).field7870)) {
                        arg7.field5727 = 100;
                    }
                    arg7.method2388(var26, var29, var37, var23, var28, var36, var18, var17, var15, 65535 & var9.field5188, var9.field5191 & 65535, 65535 & var9.field5187, var21, var25, var33, var24, var27, var35, var18, var17, var15, var9.field5189);
                    arg7.field5727 = 0;
                }
            }
        } else {
            class342 var44 = super.field247[arg2][arg5];
            if (var44 != null) {
                if (super.field263 == -1) {
                    for (int var45 = 0; var45 < var44.field5026; ++var45) {
                        int var46 = var44.field5030[var45] - -(arg2 << super.field2212);
                        short var47 = var44.field5018[var45];
                        int var48 = (arg5 << super.field2212) + var44.field5022[var45];
                        int var49 = (super.field245 * var48 + super.field253 * var47 + super.field246 * var46 >> 14) + super.field256;
                        if (var49 <= super.field254.field8607) {
                            return;
                        }
                        int var50 = (super.field243 * var46 + super.field262 * var48 + super.field260 * var47 >> 14) + super.field264;
                        int var51 = (super.field251 * var47 + super.field258 * var46 + super.field255 * var48 >> 14) + super.field249;
                        arg4[var45] = super.field254.field8611 * var51 / var49 + arg7.field5732;
                        arg3[var45] = arg7.field5729 - -(super.field254.field8630 * var50 / var49);
                        arg1[var45] = var49;
                    }
                } else {
                    for (int var52 = 0; ~var44.field5026 < ~var52; ++var52) {
                        int var92 = var44.field5030[var52] - -(arg2 << super.field2212);
                        short var93 = var44.field5018[var52];
                        int var94 = var44.field5022[var52] - -(arg5 << super.field2212);
                        int var95 = (super.field262 * var94 + super.field260 * var93 + super.field243 * var92 >> 14) + super.field264;
                        int var96 = super.field249 - -(super.field255 * var94 + super.field258 * var92 + super.field251 * var93 >> 14);
                        arg4[var52] = arg7.field5732 - -(super.field254.field8611 * var96 / super.field263);
                        arg3[var52] = super.field254.field8630 * var95 / super.field263 + arg7.field5729;
                        arg1[var52] = super.field263;
                    }
                }
                if (var44.field5024 == null) {
                    for (int var53 = 0; var53 < var44.field5025; ++var53) {
                        short var54 = var44.field5029[var53];
                        short var55 = var44.field5021[var53];
                        short var56 = var44.field5020[var53];
                        int var57 = arg4[var54];
                        int var58 = arg4[var55];
                        int var59 = arg4[var56];
                        int var60 = arg3[var54];
                        int var61 = arg3[var55];
                        int var62 = arg3[var56];
                        if ((-var58 + var57) * (-var61 + var62) + -((var59 - var58) * (var60 - var61)) > 0) {
                            int var63 = var44.field5019[var53];
                            if (var63 != -1) {
                                arg7.field5725 = var57 < 0 || var58 < 0 || var59 < 0 || ~arg7.field5735 > ~var57 || arg7.field5735 < var58 || ~var59 < ~arg7.field5735;
                                arg7.method2383(var60, var61, var62, var57, var58, var59, arg1[var54], arg1[var55], arg1[var56], class54.method303(var63, arg0 + 1854471857, var44.field5028[var54]), class54.method303(var63, arg0 + 1854471857, var44.field5028[var55]), class54.method303(var63, 127, var44.field5028[var56]));
                            }
                        }
                    }
                } else {
                    int var64 = super.field261[arg2][arg5];
                    int var65 = super.field261[arg2 + 1][arg5];
                    int var66 = super.field261[arg2][arg5 - -1];
                    int var67 = super.field2210 * arg2;
                    int var68 = super.field2210 + var67;
                    int var69 = super.field2210 * arg5;
                    int var70 = super.field2210 + var69;
                    int var71 = (super.field255 * var69 + super.field258 * var67 + super.field251 * var64 >> 14) + super.field249;
                    int var72 = super.field264 - -(super.field243 * var67 - (-(super.field260 * var64) - super.field262 * var69) >> 14);
                    int var73 = (super.field246 * var67 + super.field253 * var64 + super.field245 * var69 >> 14) + super.field256;
                    int var74 = (super.field251 * var65 + (super.field258 * var68 - -(super.field255 * var69)) >> 14) + super.field249;
                    int var75 = (super.field260 * var65 + super.field262 * var69 + super.field243 * var68 >> 14) + super.field264;
                    int var76 = super.field256 - -(super.field246 * var68 + super.field253 * var65 + super.field245 * var69 >> 14);
                    int var77 = super.field249 - -(super.field258 * var67 - (-(super.field251 * var66) - super.field255 * var70) >> 14);
                    int var78 = (super.field262 * var70 + super.field260 * var66 + super.field243 * var67 >> 14) + super.field264;
                    int var79 = super.field256 - -(super.field245 * var70 + super.field253 * var66 + super.field246 * var67 >> 14);
                    for (int var80 = 0; ~var80 > ~var44.field5025; ++var80) {
                        short var81 = var44.field5029[var80];
                        short var82 = var44.field5021[var80];
                        short var83 = var44.field5020[var80];
                        int var84 = arg4[var81];
                        int var85 = arg4[var82];
                        int var86 = arg4[var83];
                        int var87 = arg3[var81];
                        int var88 = arg3[var82];
                        int var89 = arg3[var83];
                        if ((-var85 + var84) * (-var88 + var89) + -((-var85 + var86) * (-var88 + var87)) > 0) {
                            arg7.field5725 = ~var84 > -1 || var85 < 0 || ~var86 > -1 || arg7.field5735 < var84 || ~arg7.field5735 > ~var85 || ~var86 < ~arg7.field5735;
                            short var90 = var44.field5024[var80];
                            if (var90 == -1) {
                                int var91 = var44.field5019[var80];
                                if (var91 != -1) {
                                    arg7.method2383(var87, var88, var89, var84, var85, var86, arg1[var81], arg1[var82], arg1[var83], class54.method303(var91, 127, var44.field5028[var81]), class54.method303(var91, arg0 ^ -1854471759, var44.field5028[var82]), class54.method303(var91, 127, var44.field5028[var83]));
                                }
                            } else {
                                if (this.method151(super.field254.field9731.method1728(arg0 + 1854471629, var90).field7870)) {
                                    arg7.field5727 = 100;
                                }
                                arg7.method2388(var87, var88, var89, var84, var85, var86, arg1[var81], arg1[var82], arg1[var83], var44.field5028[var81], var44.field5028[var82], var44.field5028[var83], var71, var74, var77, var72, var75, var78, var73, var76, var79, var90);
                                arg7.field5727 = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2651(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6380;
        int var8 = arg1 + arg5;
        int var9 = -arg5 + arg3;
        for (int var10 = arg1; ~var8 < ~var10; ++var10) {
            class653.method3620(arg6, arg7, false, arg2, class319.field4673[var10]);
        }
        int var11 = arg5 + arg7;
        int var12 = arg6 - arg5;
        for (int var13 = arg3; ~var13 < ~var9; --var13) {
            class653.method3620(arg6, arg7, false, arg2, class319.field4673[var13]);
        }
        for (int var14 = var8; ~var14 >= ~var9; ++var14) {
            int[] var15 = class319.field4673[var14];
            class653.method3620(var11, arg7, false, arg2, var15);
            class653.method3620(var12, var11, false, arg4, var15);
            class653.method3620(arg6, var12, false, arg2, var15);
        }
        if (arg0 != -31998) {
            field6372 = null;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6378;
        class388 var9 = (class388) super.field254.method1789(Thread.currentThread());
        class406 var10 = var9.field5600;
        var10.field5725 = false;
        var10.field5727 = 0;
        super.field254.method821();
        if (super.field250 == null) {
            if (super.field257 != null) {
                this.method2649(arg2, arg7, arg4, arg5, arg1, var10, var9.field5342, arg6, arg3, arg0, var9.field5339, 4995);
                return;
            }
        } else {
            this.method2652(arg6, arg4, arg3, arg7, var10, 8879, var9.field5339, arg2, arg0, arg1, arg5, var9.field5342);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III[[ZLgd;I[IIIII[I)V")
    private final void method2652(int arg0, int arg1, int arg2, boolean[][] arg3, class406 arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int[] arg11) {
        if (arg5 != 8879) {
            field6372 = null;
        }
        ++field6376;
        int var13 = (-arg1 + arg0) * arg7 / 256;
        int var14 = arg7 >> 8;
        boolean var15 = ((class527) super.field254).field7299;
        super.field254.method1798(false);
        arg4.field5730 = false;
        arg4.field5723 = false;
        int var16 = arg8;
        int var17 = arg9 + var13;
        for (int var18 = arg2; arg10 > var18; ++var18) {
            for (int var19 = arg1; ~var19 > ~arg0; ++var19) {
                if (arg3[var18 - arg2][-arg1 + var19]) {
                    if (super.field250[var18][var19] != null) {
                        class378 var34 = super.field250[var18][var19];
                        if (var34.field5420 != -1 && (2 & var34.field5419) == 0 && var34.field5424 == 0) {
                            int var35 = super.field254.method3452(var34.field5420);
                            arg4.method2383(-var14 + var17, var17 - var14, var17, var14 + var16, var16, var16 - -var14, 100, 100, 100, class54.method303(var35, arg5 + -8752, var34.field5421), class54.method303(var35, arg5 ^ 8912, var34.field5428), class54.method303(var35, arg5 ^ 8912, var34.field5429));
                            arg4.method2383(var17, var17, -var14 + var17, var16, var14 + var16, var16, 100, 100, 100, class54.method303(var35, arg5 + -8752, var34.field5423), class54.method303(var35, 127, var34.field5429), class54.method303(var35, 127, var34.field5428));
                        } else if (~var34.field5424 != -1) {
                            int var36 = var34.field5424;
                            arg4.method2382(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class584.method3272(var34.field5421 & -16777216, var36, (byte) 96), class584.method3272(-16777216 & var34.field5428, var36, (byte) 96), class584.method3272(var34.field5429 & -16777216, var36, (byte) 96));
                            arg4.method2382(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class584.method3272(-16777216 & var34.field5423, var36, (byte) 96), class584.method3272(-16777216 & var34.field5429, var36, (byte) 96), class584.method3272(-16777216 & var34.field5428, var36, (byte) 96));
                        } else {
                            arg4.method2382(-var14 + var17, -var14 + var17, var17, var14 + var16, var16, var16 - -var14, 100, 100, 100, var34.field5421, var34.field5428, var34.field5429);
                            arg4.method2382(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var34.field5423, var34.field5429, var34.field5428);
                        }
                    } else if (super.field252[var18][var19] != null) {
                        class392 var20 = super.field252[var18][var19];
                        for (int var21 = 0; var20.field5621 > var21; ++var21) {
                            arg6[var21] = var16 - -(var20.field5622[var21] * var14 / super.field2210);
                            arg11[var21] = var17 - var20.field5614[var21] * var14 / super.field2210;
                        }
                        for (int var22 = 0; ~var22 > ~var20.field5619; ++var22) {
                            int var23 = var22 * 3;
                            int var24 = var23 + 1;
                            int var25 = var24 + 1;
                            int var26 = arg6[var23];
                            int var27 = arg6[var24];
                            int var28 = arg6[var25];
                            int var29 = arg11[var23];
                            int var30 = arg11[var24];
                            int var31 = arg11[var25];
                            if (var20.field5620 != null && var20.field5620[var22] != 0 && (var20.field5618 == null || var20.field5618 != null && ~var20.field5618[var22] == 0)) {
                                int var32 = var20.field5620[var22];
                                arg4.method2382(var29, var30, var31, var26, var27, var28, 100, 100, 100, class584.method3272(-(-16777216 & var20.field5623[var23]) + -16777216, var32, (byte) 96), class584.method3272(-(var20.field5623[var24] & -16777216) + -16777216, var32, (byte) 96), class584.method3272(-(-16777216 & var20.field5623[var25]) + -16777216, var32, (byte) 96));
                            } else if (var20.field5618 != null && var20.field5618[var22] != -1) {
                                int var33 = super.field254.method3452(var20.field5618[var22]);
                                arg4.method2383(var29, var30, var31, var26, var27, var28, 100, 100, 100, var33, var33, var33);
                            } else {
                                arg4.method2382(var29, var30, var31, var26, var27, var28, 100, 100, 100, var20.field5623[var23], var20.field5623[var24], var20.field5623[var25]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var16 += var14;
            var17 = arg9 + var13;
        }
        arg4.field5730 = true;
        super.field254.method1798(var15);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
    public static final void method2653(int arg0) {
        ++field6375;
        class21.field188.method703(-19014);
        for (int var1 = 0; var1 < 32; ++var1) {
            class265.field3645[var1] = 0L;
        }
        int var2 = 85 / ((31 - arg0) / 47);
        for (int var3 = 0; var3 < 32; ++var3) {
            class476.field6441[var3] = 0L;
        }
        class128.field1627 = 0;
    }
}
