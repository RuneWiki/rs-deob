import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class673 extends class609 {

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field9324 = 0;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "Z")
    public static boolean field9330 = false;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([[ZIIIII[III[ILlr;Z)V")
    private final void method3689(boolean[][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int[] arg9, class312 arg10, boolean arg11) {
        ++field9328;
        int var13 = (-arg3 + arg5) * arg1 / 256;
        arg10.field4044 = false;
        int var14 = arg1 >> 8;
        arg10.field4049 = false;
        int var15 = arg4;
        int var16 = arg7 + var13;
        for (int var17 = arg8; ~var17 > ~arg2; ++var17) {
            for (int var18 = arg3; ~var18 > ~arg5; ++var18) {
                if (arg0[-arg8 + var17][-arg3 + var18]) {
                    if (super.field8235[var17][var18] != null) {
                        class632 var19 = super.field8235[var17][var18];
                        if (var19.field8810 != -1 && ~(2 & var19.field8812) == -1 && ~var19.field8813 == 0) {
                            int var20 = super.field8232.method1178(var19.field8810);
                            arg10.method1821(-var14 + var16, var16 - var14, var16, var15 - -var14, var15, var15 - -var14, class82.method639(3626, var20, 65535 & var19.field8809), class82.method639(3626, var20, var19.field8814 & 65535), class82.method639(3626, var20, 65535 & var19.field8811));
                            arg10.method1821(var16, var16, -var14 + var16, var15, var14 + var15, var15, class82.method639(3626, var20, var19.field8815 & 65535), class82.method639(3626, var20, 65535 & var19.field8811), class82.method639(3626, var20, var19.field8814 & 65535));
                        } else if (var19.field8813 != -1) {
                            int var21 = var19.field8813;
                            arg10.method1821(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var14 + var15, var21, var21, var21);
                            arg10.method1821(var16, var16, -var14 + var16, var15, var14 + var15, var15, var21, var21, var21);
                        } else {
                            arg10.method1821(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var15 - -var14, 65535 & var19.field8809, 65535 & var19.field8814, 65535 & var19.field8811);
                            arg10.method1821(var16, var16, -var14 + var16, var15, var14 + var15, var15, 65535 & var19.field8815, 65535 & var19.field8811, var19.field8814 & 65535);
                        }
                    } else if (super.field8241[var17][var18] != null) {
                        class58 var22 = super.field8241[var17][var18];
                        for (int var23 = 0; ~var22.field790 < ~var23; ++var23) {
                            arg9[var23] = var22.field781[var23] * var14 / super.field1163 + var15;
                            arg6[var23] = var16 - var22.field782[var23] * var14 / super.field1163;
                        }
                        for (int var24 = 0; ~var24 > ~var22.field780; ++var24) {
                            short var25 = var22.field783[var24];
                            short var26 = var22.field785[var24];
                            short var27 = var22.field779[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg9[var27];
                            int var31 = arg6[var25];
                            int var32 = arg6[var26];
                            int var33 = arg6[var27];
                            if (var22.field787 != null && var22.field787[var24] != -1) {
                                int var34 = var22.field787[var24];
                                arg10.method1821(var31, var32, var33, var28, var29, var30, class82.method639(3626, var34, var22.field788[var25]), class82.method639(3626, var34, var22.field788[var26]), class82.method639(3626, var34, var22.field788[var27]));
                            } else if (var22.field786 != null && ~var22.field786[var24] != 0) {
                                int var35 = super.field8232.method1178(var22.field786[var24]);
                                arg10.method1821(var31, var32, var33, var28, var29, var30, class82.method639(3626, var35, var22.field788[var25]), class82.method639(3626, var35, var22.field788[var26]), class82.method639(3626, var35, var22.field788[var27]));
                            } else {
                                int var36 = var22.field784[var24];
                                arg10.method1821(var31, var32, var33, var28, var29, var30, class82.method639(3626, var36, var22.field788[var25]), class82.method639(3626, var36, var22.field788[var26]), class82.method639(3626, var36, var22.field788[var27]));
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg7 + var13;
            var15 += var14;
        }
        arg10.field4044 = arg11;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Llr;I[IIIZ[I[I)V")
    private final void method3690(class312 arg0, int arg1, int[] arg2, int arg3, int arg4, boolean arg5, int[] arg6, int[] arg7) {
        ++field9323;
        if (arg1 == 1071059182) {
            class375 var9 = super.field8231[arg4][arg3];
            if (var9 != null) {
                if ((var9.field4806 & 2) == 0) {
                    int var10 = super.field1163 * arg4;
                    int var11 = super.field1163 + var10;
                    int var12 = super.field1163 * arg3;
                    int var13 = super.field1163 + var12;
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
                    if ((var9.field4806 & 1) != 0 && !arg5) {
                        int var18 = super.field8236[arg4][arg3];
                        if (super.field8227 == -1) {
                            int var19 = super.field8224 * var18;
                            var20 = (super.field8242 * var10 + super.field8233 * var12 + var19 >> 14) + super.field8223;
                            if (~var20 >= ~super.field8232.field2165) {
                                return;
                            }
                            var21 = (super.field8242 * var11 + super.field8233 * var12 + var19 >> 14) + super.field8223;
                            if (var21 <= super.field8232.field2165) {
                                return;
                            }
                            var22 = (super.field8242 * var11 + super.field8233 * var13 + var19 >> 14) + super.field8223;
                            if (super.field8232.field2165 >= var22) {
                                return;
                            }
                            var23 = super.field8223 - -(super.field8242 * var10 + var19 - -(super.field8233 * var13) >> 14);
                            if (var23 <= super.field8232.field2165) {
                                return;
                            }
                        } else {
                            var23 = super.field8227;
                            var22 = super.field8227;
                            var21 = super.field8227;
                            var20 = super.field8227;
                        }
                        if (super.field8232.field2161) {
                            int var24 = var20 - super.field8232.field2152;
                            if (~var24 < -1) {
                                var14 = var24;
                                if (var24 > 255) {
                                    var14 = 255;
                                }
                            }
                            int var25 = -super.field8232.field2152 + var21;
                            if (~var25 < -1) {
                                var15 = var25;
                                if (~var25 < -256) {
                                    var15 = 255;
                                }
                            }
                            int var26 = -super.field8232.field2152 + var22;
                            if (~var26 < -1) {
                                var16 = var26;
                                if (var26 > 255) {
                                    var16 = 255;
                                }
                            }
                            int var27 = -super.field8232.field2152 + var23;
                            if (var27 > 0) {
                                var17 = var27;
                                if (var27 > 255) {
                                    var17 = 255;
                                }
                            }
                        }
                        int var28 = super.field8229 * var18;
                        var29 = (super.field8230 * var10 + super.field8226 * var12 + var28 >> 14) + super.field8240;
                        int var30 = super.field8225 * var18;
                        var31 = super.field8232.field2162 * var29 / var20 + arg0.field4051;
                        var32 = super.field8237 - -(super.field8238 * var10 + var30 - -(super.field8239 * var12) >> 14);
                        var33 = super.field8232.field2171 * var32 / var20 + arg0.field4046;
                        var34 = (super.field8226 * var12 + super.field8230 * var11 + var28 >> 14) + super.field8240;
                        var35 = super.field8232.field2162 * var34 / var21 + arg0.field4051;
                        var36 = (super.field8238 * var11 + super.field8239 * var12 + var30 >> 14) + super.field8237;
                        var37 = super.field8232.field2171 * var36 / var21 + arg0.field4046;
                        var38 = (super.field8226 * var13 + super.field8230 * var11 + var28 >> 14) + super.field8240;
                        var39 = super.field8232.field2162 * var38 / var22 + arg0.field4051;
                        var40 = (super.field8239 * var13 + super.field8238 * var11 + var30 >> 14) + super.field8237;
                        var41 = (super.field8230 * var10 + super.field8226 * var13 + var28 >> 14) + super.field8240;
                        var42 = super.field8232.field2171 * var40 / var22 + arg0.field4046;
                        var43 = (super.field8239 * var13 + super.field8238 * var10 + var30 >> 14) + super.field8237;
                        var44 = arg0.field4051 - -(super.field8232.field2162 * var41 / var23);
                        var45 = arg0.field4046 - -(super.field8232.field2171 * var43 / var23);
                    } else {
                        int var46 = super.field8236[arg4][arg3];
                        int var47 = super.field8236[arg4 - -1][arg3];
                        int var48 = super.field8236[arg4 + 1][arg3 + 1];
                        int var49 = super.field8236[arg4][arg3 + 1];
                        if (super.field8227 == -1) {
                            var20 = (super.field8233 * var12 + super.field8242 * var10 + super.field8224 * var46 >> 14) + super.field8223;
                            if (super.field8232.field2165 >= var20) {
                                return;
                            }
                            var21 = (super.field8224 * var47 + super.field8242 * var11 + super.field8233 * var12 >> 14) + super.field8223;
                            if (~var21 >= ~super.field8232.field2165) {
                                return;
                            }
                            var22 = (super.field8242 * var11 + super.field8233 * var13 - -(super.field8224 * var48) >> 14) + super.field8223;
                            if (var22 <= super.field8232.field2165) {
                                return;
                            }
                            var23 = (super.field8242 * var10 + super.field8224 * var49 - -(super.field8233 * var13) >> 14) + super.field8223;
                            if (~var23 >= ~super.field8232.field2165) {
                                return;
                            }
                        } else {
                            var23 = super.field8227;
                            var22 = super.field8227;
                            var21 = super.field8227;
                            var20 = super.field8227;
                        }
                        if (!arg5) {
                            if (super.field8232.field2161) {
                                int var50 = -super.field8232.field2152 + var20;
                                if (var50 > 0) {
                                    var14 = var50;
                                    if (~var50 < -256) {
                                        var14 = 255;
                                    }
                                }
                                int var51 = -super.field8232.field2152 + var21;
                                if (~var51 < -1) {
                                    var15 = var51;
                                    if (var51 > 255) {
                                        var15 = 255;
                                    }
                                }
                                int var52 = var22 - super.field8232.field2152;
                                if (var52 > 0) {
                                    var16 = var52;
                                    if (~var52 < -256) {
                                        var16 = 255;
                                    }
                                }
                                int var53 = -super.field8232.field2152 + var23;
                                if (var53 > 0) {
                                    var17 = var53;
                                    if (var53 > 255) {
                                        var17 = 255;
                                    }
                                }
                            }
                        } else {
                            int var54 = -super.field8232.field2152 + var20;
                            if (~var54 < -256) {
                                var54 = 255;
                            }
                            if (~var54 < -1) {
                                var14 = var54;
                                int var55 = var9.field4808 * var54 / 255;
                                if (~var55 < -1) {
                                    var46 -= var55;
                                }
                            }
                            int var56 = -super.field8232.field2152 + var21;
                            if (~var56 < -256) {
                                var56 = 255;
                            }
                            if (~var56 < -1) {
                                var15 = var56;
                                int var57 = var9.field4804 * var56 / 255;
                                if (var57 > 0) {
                                    var47 -= var57;
                                }
                            }
                            int var58 = var22 - super.field8232.field2152;
                            if (~var58 < -256) {
                                var58 = 255;
                            }
                            if (var58 > 0) {
                                var16 = var58;
                                int var59 = var9.field4807 * var58 / 255;
                                if (var59 > 0) {
                                    var48 -= var59;
                                }
                            }
                            int var60 = -super.field8232.field2152 + var23;
                            if (~var60 < -256) {
                                var60 = 255;
                            }
                            if (~var60 < -1) {
                                var17 = var60;
                                int var61 = var9.field4812 * var60 / 255;
                                if (var61 > 0) {
                                    var49 -= var61;
                                }
                            }
                        }
                        var29 = (super.field8230 * var10 + super.field8229 * var46 + super.field8226 * var12 >> 14) + super.field8240;
                        var32 = super.field8237 - -(super.field8239 * var12 + super.field8238 * var10 + super.field8225 * var46 >> 14);
                        var31 = super.field8232.field2162 * var29 / var20 + arg0.field4051;
                        var33 = arg0.field4046 - -(super.field8232.field2171 * var32 / var20);
                        var34 = (super.field8226 * var12 + super.field8230 * var11 + super.field8229 * var47 >> 14) + super.field8240;
                        var35 = super.field8232.field2162 * var34 / var21 + arg0.field4051;
                        var36 = (super.field8239 * var12 + super.field8238 * var11 + super.field8225 * var47 >> 14) + super.field8237;
                        var37 = arg0.field4046 - -(super.field8232.field2171 * var36 / var21);
                        var38 = super.field8240 - -(super.field8226 * var13 + super.field8230 * var11 + super.field8229 * var48 >> 14);
                        var39 = arg0.field4051 - -(super.field8232.field2162 * var38 / var22);
                        var40 = (super.field8239 * var13 + super.field8238 * var11 + super.field8225 * var48 >> 14) + super.field8237;
                        var41 = (super.field8229 * var49 + super.field8230 * var10 + super.field8226 * var13 >> 14) + super.field8240;
                        var42 = super.field8232.field2171 * var40 / var22 + arg0.field4046;
                        var44 = super.field8232.field2162 * var41 / var23 + arg0.field4051;
                        var43 = (super.field8238 * var10 + super.field8239 * var13 + super.field8225 * var49 >> 14) + super.field8237;
                        var45 = super.field8232.field2171 * var43 / var23 + arg0.field4046;
                    }
                    boolean var62 = var9.field4809 != -1 && this.method3311(super.field8232.field598.method3162((byte) -104, var9.field4809).field805);
                    int var63 = var15 + var17 - -var16;
                    if (~((-var44 + var39) * (-var45 + var37) - (-var44 + var35) * (-var45 + var42)) < -1) {
                        arg0.field4045 = ~var39 > -1 || var44 < 0 || ~var35 > -1 || var39 > arg0.field4043 || ~var44 < ~arg0.field4043 || arg0.field4043 < var35;
                        if (~var63 > -766) {
                            if (var62) {
                                arg0.field4047 = 100;
                            }
                            if (var63 <= 0) {
                                if (var9.field4809 < 0) {
                                    arg0.method1822(var42, var45, var37, var39, var44, var35, var9.field4802, var9.field4810, var9.field4803);
                                } else {
                                    arg0.method1823(var42, var45, var37, var39, var44, var35, var9.field4802, var9.field4810, var9.field4803, var38, var41, var34, var40, var43, var36, var22, var23, var21, var9.field4809);
                                }
                            } else if (~var9.field4809 <= -1) {
                                arg0.method1825(var42, var45, var37, var39, var44, var35, super.field8232.field2175, var16, var17, var15, var9.field4802, var9.field4810, var9.field4803, var38, var41, var34, var40, var43, var36, var22, var23, var21, var9.field4809);
                            } else {
                                arg0.method1822(var42, var45, var37, var39, var44, var35, class354.method2040(var16 << 24 | super.field8232.field2175, (byte) 100, var9.field4802), class354.method2040(super.field8232.field2175 | var17 << 24, (byte) -86, var9.field4810), class354.method2040(var15 << 24 | super.field8232.field2175, (byte) -126, var9.field4803));
                            }
                            arg0.field4047 = 0;
                        } else {
                            arg0.method1820(var42, var45, var37, var39, var44, var35, super.field8232.field2175);
                        }
                    }
                    int var64 = var14 + var15 + var17;
                    if (~((-var35 + var31) * (-var37 + var45) + -((var33 - var37) * (-var35 + var44))) < -1) {
                        arg0.field4045 = ~var31 > -1 || var35 < 0 || var44 < 0 || ~arg0.field4043 > ~var31 || ~arg0.field4043 > ~var35 || arg0.field4043 < var44;
                        if (var64 < 765) {
                            if (var62) {
                                arg0.field4047 = 100;
                            }
                            if (~var64 < -1) {
                                if (~var9.field4809 <= -1) {
                                    arg0.method1825(var33, var37, var45, var31, var35, var44, super.field8232.field2175, var14, var15, var17, var9.field4805, var9.field4803, var9.field4810, var29, var34, var41, var32, var36, var43, var20, var21, var23, var9.field4809);
                                } else {
                                    arg0.method1822(var33, var37, var45, var31, var35, var44, class354.method2040(super.field8232.field2175 | var14 << 24, (byte) -8, var9.field4805), class354.method2040(super.field8232.field2175 | var15 << 24, (byte) 84, var9.field4803), class354.method2040(var17 << 24 | super.field8232.field2175, (byte) 119, var9.field4810));
                                }
                            } else if (~var9.field4809 <= -1) {
                                arg0.method1823(var33, var37, var45, var31, var35, var44, var9.field4805, var9.field4803, var9.field4810, var29, var34, var41, var32, var36, var43, var20, var21, var23, var9.field4809);
                            } else {
                                arg0.method1822(var33, var37, var45, var31, var35, var44, var9.field4805, var9.field4803, var9.field4810);
                            }
                            arg0.field4047 = 0;
                            return;
                        }
                        arg0.method1820(var33, var37, var45, var31, var35, var44, super.field8232.field2175);
                    }
                }
            } else {
                class624 var65 = super.field8222[arg4][arg3];
                if (var65 != null) {
                    if (~super.field8227 != 0) {
                        for (int var66 = 0; var65.field8731 > var66; ++var66) {
                            int var67 = var65.field8737[var66] - -(arg4 << super.field1168);
                            int var68 = var65.field8733[var66];
                            int var69 = var65.field8734[var66] - -(arg3 << super.field1168);
                            arg6[var66] = 0;
                            if (!arg5) {
                                if (super.field8232.field2161) {
                                    int var70 = -super.field8232.field2152 + super.field8227;
                                    if (~var70 < -1) {
                                        arg6[var66] = var70;
                                        if (~arg6[var66] < -256) {
                                            arg6[var66] = 255;
                                        }
                                    }
                                }
                            } else {
                                int var71 = -super.field8232.field2152 + super.field8227;
                                if (~var71 < -256) {
                                    var71 = 255;
                                }
                                if (var71 > 0) {
                                    arg6[var66] = var71;
                                    int var72 = var65.field8738[var66] * var71 / 255;
                                    if (~var72 < -1) {
                                        var68 -= var72;
                                    }
                                }
                            }
                            int var73 = (super.field8226 * var69 + (super.field8230 * var67 - -(super.field8229 * var68)) >> 14) + super.field8240;
                            int var74 = (super.field8239 * var69 + super.field8238 * var67 + super.field8225 * var68 >> 14) + super.field8237;
                            arg7[var66] = super.field8232.field2162 * var73 / super.field8227 + arg0.field4051;
                            arg2[var66] = super.field8232.field2171 * var74 / super.field8227 + arg0.field4046;
                        }
                    } else {
                        for (int var75 = 0; var75 < var65.field8731; ++var75) {
                            int var115 = var65.field8737[var75] - -(arg4 << super.field1168);
                            int var116 = var65.field8733[var75];
                            int var117 = var65.field8734[var75] - -(arg3 << super.field1168);
                            int var118 = (super.field8242 * var115 + super.field8233 * var117 + super.field8224 * var116 >> 14) + super.field8223;
                            if (var118 <= super.field8232.field2165) {
                                return;
                            }
                            arg6[var75] = 0;
                            if (arg5) {
                                int var119 = -super.field8232.field2152 + var118;
                                if (var119 > 255) {
                                    var119 = 255;
                                }
                                if (var119 > 0) {
                                    arg6[var75] = var119;
                                    int var120 = var65.field8738[var75] * var119 / 255;
                                    if (~var120 < -1) {
                                        var116 -= var120;
                                    }
                                }
                            } else if (super.field8232.field2161) {
                                int var121 = var118 - super.field8232.field2152;
                                if (~var121 < -1) {
                                    arg6[var75] = var121;
                                    if (~arg6[var75] < -256) {
                                        arg6[var75] = 255;
                                    }
                                }
                            }
                            int var122 = (super.field8230 * var115 + (super.field8229 * var116 - -(super.field8226 * var117)) >> 14) + super.field8240;
                            int var123 = (super.field8238 * var115 + super.field8239 * var117 + super.field8225 * var116 >> 14) + super.field8237;
                            arg7[var75] = arg0.field4051 - -(super.field8232.field2162 * var122 / var118);
                            arg2[var75] = arg0.field4046 - -(super.field8232.field2171 * var123 / var118);
                        }
                    }
                    if (var65.field8739 == null) {
                        for (int var76 = 0; var76 < var65.field8732; ++var76) {
                            int var77 = var76 * 3;
                            int var78 = var77 + 1;
                            int var79 = var78 + 1;
                            int var80 = arg7[var77];
                            int var81 = arg7[var78];
                            int var82 = arg7[var79];
                            int var83 = arg2[var77];
                            int var84 = arg2[var78];
                            int var85 = arg2[var79];
                            int var86 = arg6[var78] - -arg6[var79] + arg6[var77];
                            if ((var80 - var81) * (-var84 + var85) - (var83 - var84) * (-var81 + var82) > 0) {
                                arg0.field4045 = ~var80 > -1 || var81 < 0 || var82 < 0 || ~arg0.field4043 > ~var80 || ~arg0.field4043 > ~var81 || var82 > arg0.field4043;
                                if (~var86 > -766) {
                                    if (~var86 < -1) {
                                        if ((16777215 & var65.field8736[var77]) != 0) {
                                            arg0.method1822(var83, var84, var85, var80, var81, var82, class14.method84(super.field8232.field2175, arg6[var77], false, var65.field8736[var77]), class14.method84(super.field8232.field2175, arg6[var78], false, var65.field8736[var78]), class14.method84(super.field8232.field2175, arg6[var79], false, var65.field8736[var79]));
                                        }
                                    } else if (~(16777215 & var65.field8736[var77]) != -1) {
                                        arg0.method1822(var83, var84, var85, var80, var81, var82, var65.field8736[var77], var65.field8736[var78], var65.field8736[var79]);
                                    }
                                } else {
                                    arg0.method1820(var83, var84, var85, var80, var81, var82, super.field8232.field2175);
                                }
                            }
                        }
                    } else {
                        int var87 = super.field8236[arg4][arg3];
                        int var88 = super.field8236[arg4 + 1][arg3];
                        int var89 = super.field8236[arg4][arg3 - -1];
                        int var90 = super.field1163 * arg4;
                        int var91 = super.field1163 + var90;
                        int var92 = super.field1163 * arg3;
                        int var93 = var92 - -super.field1163;
                        int var94 = (super.field8230 * var90 - (-(super.field8229 * var87) + -(super.field8226 * var92)) >> 14) + super.field8240;
                        int var95 = (super.field8239 * var92 + (super.field8238 * var90 - -(super.field8225 * var87)) >> 14) + super.field8237;
                        int var96 = (super.field8242 * var90 + (super.field8224 * var87 - -(super.field8233 * var92)) >> 14) + super.field8223;
                        int var97 = (super.field8230 * var91 + super.field8229 * var88 + super.field8226 * var92 >> 14) + super.field8240;
                        int var98 = (super.field8239 * var92 + super.field8238 * var91 + super.field8225 * var88 >> 14) + super.field8237;
                        int var99 = super.field8223 - -(super.field8233 * var92 + super.field8242 * var91 + super.field8224 * var88 >> 14);
                        int var100 = (super.field8229 * var89 + super.field8230 * var90 + super.field8226 * var93 >> 14) + super.field8240;
                        int var101 = (super.field8239 * var93 + super.field8238 * var90 + super.field8225 * var89 >> 14) + super.field8237;
                        int var102 = (super.field8242 * var90 + super.field8233 * var93 - -(super.field8224 * var89) >> 14) + super.field8223;
                        for (int var103 = 0; var65.field8732 > var103; ++var103) {
                            int var104 = var103 * 3;
                            int var105 = var104 - -1;
                            int var106 = var105 - -1;
                            int var107 = arg7[var104];
                            int var108 = arg7[var105];
                            int var109 = arg7[var106];
                            int var110 = arg2[var104];
                            int var111 = arg2[var105];
                            int var112 = arg2[var106];
                            int var113 = arg6[var104] - -arg6[var105] + arg6[var106];
                            if ((-var108 + var107) * (-var111 + var112) + -((-var108 + var109) * (-var111 + var110)) > 0) {
                                arg0.field4045 = var107 < 0 || var108 < 0 || ~var109 > -1 || arg0.field4043 < var107 || ~var108 < ~arg0.field4043 || ~arg0.field4043 > ~var109;
                                short var114 = var65.field8739[var103];
                                if (~var113 <= -766) {
                                    arg0.method1820(var110, var111, var112, var107, var108, var109, super.field8232.field2175);
                                } else {
                                    if (~var114 != 0 && this.method3311(super.field8232.field598.method3162((byte) -104, var114).field805)) {
                                        arg0.field4047 = 100;
                                    }
                                    if (var113 > 0) {
                                        if (var114 == -1) {
                                            if ((16777215 & var65.field8736[var104]) != 0) {
                                                arg0.method1822(var110, var111, var112, var107, var108, var109, class354.method2040(super.field8232.field2175 | arg6[var104] << 24, (byte) 119, var65.field8736[var104]), class354.method2040(super.field8232.field2175 | arg6[var105] << 24, (byte) -48, var65.field8736[var105]), class354.method2040(arg6[var106] << 24 | super.field8232.field2175, (byte) 104, var65.field8736[var106]));
                                            }
                                        } else {
                                            arg0.method1825(var110, var111, var112, var107, var108, var109, super.field8232.field2175, arg6[var104], arg6[var105], arg6[var106], var65.field8736[var104], var65.field8736[var105], var65.field8736[var106], var94, var97, var100, var95, var98, var101, var96, var99, var102, var114);
                                        }
                                    } else if (~var114 != 0) {
                                        arg0.method1823(var110, var111, var112, var107, var108, var109, var65.field8736[var104], var65.field8736[var105], var65.field8736[var106], var94, var97, var100, var95, var98, var101, var96, var99, var102, var114);
                                    } else if ((var65.field8736[var104] & 16777215) != 0) {
                                        arg0.method1822(var110, var111, var112, var107, var108, var109, var65.field8736[var104], var65.field8736[var105], var65.field8736[var106]);
                                    }
                                    arg0.field4047 = 0;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lql;IIII[[I[[II)V")
    public class673(class173 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([IZ[ILlr;I[II)V")
    private final void method3691(int[] arg0, boolean arg1, int[] arg2, class312 arg3, int arg4, int[] arg5, int arg6) {
        ++field9329;
        if (arg1) {
            this.method670(-11, 2, 95, 62, -87, 66, 122, (boolean[][]) null);
        }
        class632 var8 = super.field8235[arg6][arg4];
        if (var8 != null) {
            if (~(2 & var8.field8812) == -1) {
                int var9 = super.field1163 * arg6;
                int var10 = super.field1163 + var9;
                int var11 = super.field1163 * arg4;
                int var12 = var11 - -super.field1163;
                int var14;
                int var16;
                int var17;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var30;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                if (~(var8.field8812 & 1) != -1) {
                    int var13 = super.field8236[arg6][arg4];
                    int var15;
                    if (super.field8227 != -1) {
                        var14 = super.field8227;
                        var15 = super.field8227;
                        var16 = super.field8227;
                        var17 = super.field8227;
                    } else {
                        int var18 = super.field8224 * var13;
                        var17 = (super.field8233 * var11 + super.field8242 * var9 + var18 >> 14) + super.field8223;
                        if (super.field8232.field2165 >= var17) {
                            return;
                        }
                        var16 = super.field8223 - -(super.field8233 * var11 + (super.field8242 * var10 - -var18) >> 14);
                        if (super.field8232.field2165 >= var16) {
                            return;
                        }
                        var15 = (super.field8233 * var12 + super.field8242 * var10 + var18 >> 14) + super.field8223;
                        if (~var15 >= ~super.field8232.field2165) {
                            return;
                        }
                        var14 = (super.field8242 * var9 - (-(super.field8233 * var12) + -var18) >> 14) + super.field8223;
                        if (~super.field8232.field2165 <= ~var14) {
                            return;
                        }
                    }
                    int var19 = super.field8229 * var13;
                    int var20 = super.field8225 * var13;
                    var21 = (super.field8226 * var11 + super.field8230 * var9 + var19 >> 14) + super.field8240;
                    var22 = (super.field8239 * var11 + super.field8238 * var9 + var20 >> 14) + super.field8237;
                    var23 = super.field8232.field2162 * var21 / var17 + arg3.field4051;
                    var24 = (super.field8226 * var11 + super.field8230 * var10 + var19 >> 14) + super.field8240;
                    var25 = super.field8232.field2171 * var22 / var17 + arg3.field4046;
                    var26 = super.field8232.field2162 * var24 / var16 + arg3.field4051;
                    var27 = (super.field8238 * var10 - -(super.field8239 * var11) + var20 >> 14) + super.field8237;
                    var28 = arg3.field4046 - -(super.field8232.field2171 * var27 / var16);
                    int var29 = (super.field8226 * var12 + super.field8230 * var10 + var19 >> 14) + super.field8240;
                    var30 = arg3.field4051 - -(super.field8232.field2162 * var29 / var15);
                    int var31 = (super.field8238 * var10 - -var20 - -(super.field8239 * var12) >> 14) + super.field8237;
                    var32 = super.field8232.field2171 * var31 / var15 + arg3.field4046;
                    var33 = (super.field8226 * var12 + super.field8230 * var9 + var19 >> 14) + super.field8240;
                    var34 = super.field8232.field2162 * var33 / var14 + arg3.field4051;
                    var35 = (super.field8239 * var12 + super.field8238 * var9 + var20 >> 14) + super.field8237;
                    var36 = super.field8232.field2171 * var35 / var14 + arg3.field4046;
                } else {
                    int var37 = super.field8236[arg6][arg4];
                    int var38 = super.field8236[arg6 + 1][arg4];
                    int var39 = super.field8236[arg6 + 1][arg4 + 1];
                    int var40 = super.field8236[arg6][arg4 + 1];
                    int var41;
                    if (~super.field8227 != 0) {
                        var14 = super.field8227;
                        var41 = super.field8227;
                        var16 = super.field8227;
                        var17 = super.field8227;
                    } else {
                        var17 = (super.field8224 * var37 + super.field8242 * var9 + super.field8233 * var11 >> 14) + super.field8223;
                        if (~super.field8232.field2165 <= ~var17) {
                            return;
                        }
                        var16 = (super.field8233 * var11 + super.field8242 * var10 + super.field8224 * var38 >> 14) + super.field8223;
                        if (super.field8232.field2165 >= var16) {
                            return;
                        }
                        var41 = (super.field8224 * var39 + super.field8242 * var10 + super.field8233 * var12 >> 14) + super.field8223;
                        if (super.field8232.field2165 >= var41) {
                            return;
                        }
                        var14 = (super.field8224 * var40 + (super.field8242 * var9 - -(super.field8233 * var12)) >> 14) + super.field8223;
                        if (~super.field8232.field2165 <= ~var14) {
                            return;
                        }
                    }
                    var21 = (super.field8229 * var37 + (super.field8230 * var9 - -(super.field8226 * var11)) >> 14) + super.field8240;
                    var23 = super.field8232.field2162 * var21 / var17 + arg3.field4051;
                    var22 = super.field8237 - -(super.field8238 * var9 + super.field8239 * var11 + super.field8225 * var37 >> 14);
                    var25 = arg3.field4046 - -(super.field8232.field2171 * var22 / var17);
                    var24 = (super.field8229 * var38 + (super.field8230 * var10 - -(super.field8226 * var11)) >> 14) + super.field8240;
                    var26 = super.field8232.field2162 * var24 / var16 + arg3.field4051;
                    var27 = (super.field8239 * var11 + super.field8238 * var10 + super.field8225 * var38 >> 14) + super.field8237;
                    var28 = super.field8232.field2171 * var27 / var16 + arg3.field4046;
                    int var42 = (super.field8230 * var10 + super.field8226 * var12 - -(super.field8229 * var39) >> 14) + super.field8240;
                    int var43 = super.field8237 - -(super.field8239 * var12 + (super.field8238 * var10 - -(super.field8225 * var39)) >> 14);
                    var30 = super.field8232.field2162 * var42 / var41 + arg3.field4051;
                    var32 = super.field8232.field2171 * var43 / var41 + arg3.field4046;
                    var33 = super.field8240 - -(super.field8229 * var40 + (super.field8230 * var9 - -(super.field8226 * var12)) >> 14);
                    var34 = arg3.field4051 - -(super.field8232.field2162 * var33 / var14);
                    var35 = (super.field8239 * var12 + super.field8238 * var9 + super.field8225 * var40 >> 14) + super.field8237;
                    var36 = super.field8232.field2171 * var35 / var14 + arg3.field4046;
                }
                if ((var30 - var34) * (-var36 + var28) + -((-var34 + var26) * (-var36 + var32)) > 0) {
                    arg3.field4045 = var30 < 0 || var34 < 0 || ~var26 > -1 || var30 > arg3.field4043 || ~var34 < ~arg3.field4043 || var26 > arg3.field4043;
                    if (var8.field8810 < 0) {
                        arg3.method1821(var32, var36, var28, var30, var34, var26, var8.field8809 & 65535, 65535 & var8.field8814, var8.field8811 & 65535);
                    } else {
                        if (this.method3311(super.field8232.field598.method3162((byte) -104, var8.field8810).field805)) {
                            arg3.field4047 = 100;
                        }
                        arg3.method1823(var32, var36, var28, var30, var34, var26, 65535 & var8.field8809, var8.field8814 & 65535, var8.field8811 & 65535, var21, var24, var33, var22, var27, var35, var17, var16, var14, var8.field8810);
                        arg3.field4047 = 0;
                    }
                }
                if (~((-var26 + var23) * (-var28 + var36) + -((-var26 + var34) * (-var28 + var25))) < -1) {
                    arg3.field4045 = var23 < 0 || ~var26 > -1 || var34 < 0 || arg3.field4043 < var23 || ~var26 < ~arg3.field4043 || ~var34 < ~arg3.field4043;
                    if (~var8.field8810 <= -1) {
                        if (this.method3311(super.field8232.field598.method3162((byte) -104, var8.field8810).field805)) {
                            arg3.field4047 = 100;
                        }
                        arg3.method1823(var25, var28, var36, var23, var26, var34, var8.field8815 & 65535, 65535 & var8.field8811, var8.field8814 & 65535, var21, var24, var33, var22, var27, var35, var17, var16, var14, var8.field8810);
                        arg3.field4047 = 0;
                        return;
                    }
                    arg3.method1821(var25, var28, var36, var23, var26, var34, var8.field8815 & 65535, 65535 & var8.field8811, 65535 & var8.field8814);
                }
            }
        } else {
            class58 var44 = super.field8241[arg6][arg4];
            if (var44 != null) {
                if (super.field8227 == -1) {
                    for (int var45 = 0; var44.field790 > var45; ++var45) {
                        int var46 = (arg6 << super.field1168) + var44.field781[var45];
                        short var47 = var44.field789[var45];
                        int var48 = (arg4 << super.field1168) + var44.field782[var45];
                        int var49 = (super.field8242 * var46 - (-(super.field8233 * var48) + -(super.field8224 * var47)) >> 14) + super.field8223;
                        if (var49 <= super.field8232.field2165) {
                            return;
                        }
                        int var50 = super.field8237 - -(super.field8239 * var48 + super.field8238 * var46 + super.field8225 * var47 >> 14);
                        int var51 = (super.field8226 * var48 + (super.field8230 * var46 - -(super.field8229 * var47)) >> 14) + super.field8240;
                        arg5[var45] = super.field8232.field2162 * var51 / var49 + arg3.field4051;
                        arg2[var45] = arg3.field4046 - -(super.field8232.field2171 * var50 / var49);
                    }
                } else {
                    for (int var52 = 0; ~var52 > ~var44.field790; ++var52) {
                        int var92 = var44.field781[var52] - -(arg6 << super.field1168);
                        short var93 = var44.field789[var52];
                        int var94 = (arg4 << super.field1168) + var44.field782[var52];
                        int var95 = (super.field8225 * var93 + super.field8239 * var94 + super.field8238 * var92 >> 14) + super.field8237;
                        int var96 = (super.field8226 * var94 + super.field8230 * var92 + super.field8229 * var93 >> 14) + super.field8240;
                        arg5[var52] = super.field8232.field2162 * var96 / super.field8227 + arg3.field4051;
                        arg2[var52] = arg3.field4046 - -(super.field8232.field2171 * var95 / super.field8227);
                    }
                }
                if (var44.field786 == null) {
                    for (int var53 = 0; ~var44.field780 < ~var53; ++var53) {
                        short var54 = var44.field783[var53];
                        short var55 = var44.field785[var53];
                        short var56 = var44.field779[var53];
                        int var57 = arg5[var54];
                        int var58 = arg5[var55];
                        int var59 = arg5[var56];
                        int var60 = arg2[var54];
                        int var61 = arg2[var55];
                        int var62 = arg2[var56];
                        if ((-var58 + var57) * (-var61 + var62) - (-var58 + var59) * (-var61 + var60) > 0) {
                            int var63 = var44.field784[var53];
                            if (~var63 != 0) {
                                arg3.field4045 = ~var57 > -1 || var58 < 0 || var59 < 0 || ~var57 < ~arg3.field4043 || ~arg3.field4043 > ~var58 || arg3.field4043 < var59;
                                arg3.method1821(var60, var61, var62, var57, var58, var59, class82.method639(3626, var63, var44.field788[var54]), class82.method639(3626, var63, var44.field788[var55]), class82.method639(3626, var63, var44.field788[var56]));
                            }
                        }
                    }
                } else {
                    int var64 = super.field8236[arg6][arg4];
                    int var65 = super.field8236[arg6 + 1][arg4];
                    int var66 = super.field8236[arg6][arg4 + 1];
                    int var67 = super.field1163 * arg6;
                    int var68 = super.field1163 + var67;
                    int var69 = super.field1163 * arg4;
                    int var70 = super.field1163 + var69;
                    int var71 = super.field8240 - -(super.field8226 * var69 + super.field8230 * var67 + super.field8229 * var64 >> 14);
                    int var72 = (super.field8239 * var69 + super.field8238 * var67 + super.field8225 * var64 >> 14) + super.field8237;
                    int var73 = super.field8223 - -(super.field8242 * var67 + super.field8233 * var69 + super.field8224 * var64 >> 14);
                    int var74 = (super.field8230 * var68 + super.field8229 * var65 + super.field8226 * var69 >> 14) + super.field8240;
                    int var75 = (super.field8238 * var68 + super.field8239 * var69 + super.field8225 * var65 >> 14) + super.field8237;
                    int var76 = (super.field8233 * var69 + (super.field8242 * var68 - -(super.field8224 * var65)) >> 14) + super.field8223;
                    int var77 = super.field8240 - -(super.field8226 * var70 + super.field8230 * var67 + super.field8229 * var66 >> 14);
                    int var78 = (super.field8239 * var70 + super.field8238 * var67 + super.field8225 * var66 >> 14) + super.field8237;
                    int var79 = super.field8223 - -(super.field8242 * var67 - -(super.field8224 * var66) - -(super.field8233 * var70) >> 14);
                    for (int var80 = 0; ~var44.field780 < ~var80; ++var80) {
                        short var81 = var44.field783[var80];
                        short var82 = var44.field785[var80];
                        short var83 = var44.field779[var80];
                        int var84 = arg5[var81];
                        int var85 = arg5[var82];
                        int var86 = arg5[var83];
                        int var87 = arg2[var81];
                        int var88 = arg2[var82];
                        int var89 = arg2[var83];
                        if (~((var89 - var88) * (-var85 + var84) - (var87 - var88) * (-var85 + var86)) < -1) {
                            arg3.field4045 = var84 < 0 || ~var85 > -1 || var86 < 0 || arg3.field4043 < var84 || ~var85 < ~arg3.field4043 || ~arg3.field4043 > ~var86;
                            short var90 = var44.field786[var80];
                            if (~var90 != 0) {
                                if (this.method3311(super.field8232.field598.method3162((byte) -104, var90).field805)) {
                                    arg3.field4047 = 100;
                                }
                                arg3.method1823(var87, var88, var89, var84, var85, var86, var44.field788[var81], var44.field788[var82], var44.field788[var83], var71, var74, var77, var72, var75, var78, var73, var76, var79, var90);
                                arg3.field4047 = 0;
                            } else {
                                int var91 = var44.field784[var80];
                                if (~var91 != 0) {
                                    arg3.method1821(var87, var88, var89, var84, var85, var86, class82.method639(3626, var91, var44.field788[var81]), class82.method639(3626, var91, var44.field788[var82]), class82.method639(3626, var91, var44.field788[var83]));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)I")
    public static final int method3692(byte arg0) {
        int var1 = 31 % ((arg0 - 31) / 42);
        ++field9327;
        return 16;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method670(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field9325;
        class669 var9 = (class669) super.field8232.method846(Thread.currentThread());
        class312 var10 = var9.field9291;
        var10.field4047 = 0;
        var10.field4045 = false;
        if (super.field8231 != null) {
            this.method3693(arg6, arg1, arg3, var9.field5613, var9.field5635, arg4, arg5, var10, -1, arg2, arg0, arg7);
        } else if (super.field8235 != null) {
            this.method3689(arg7, arg2, arg5, arg4, arg0, arg6, var9.field5635, arg1, arg3, var9.field5613, var10, true);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III[I[IIILlr;III[[Z)V")
    private final void method3693(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, class312 arg7, int arg8, int arg9, int arg10, boolean[][] arg11) {
        ++field9326;
        if (arg8 != -1) {
            field9330 = true;
        }
        int var13 = (-arg5 + arg0) * arg9 / 256;
        arg7.field4049 = false;
        int var14 = arg9 >> 8;
        arg7.field4044 = false;
        int var15 = arg10;
        int var16 = arg1 + var13;
        for (int var17 = arg2; var17 < arg6; ++var17) {
            for (int var18 = arg5; var18 < arg0; ++var18) {
                if (arg11[-arg2 + var17][-arg5 + var18]) {
                    if (super.field8231[var17][var18] != null) {
                        class375 var19 = super.field8231[var17][var18];
                        if (~var19.field4809 != 0 && ~(var19.field4806 & 2) == -1 && ~var19.field4811 == -1) {
                            int var20 = super.field8232.method1178(var19.field4809);
                            arg7.method1821(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var14 + var15, class82.method639(3626, var20, var19.field4802), class82.method639(3626, var20, var19.field4810), class82.method639(3626, var20, var19.field4803));
                            arg7.method1821(var16, var16, -var14 + var16, var15, var14 + var15, var15, class82.method639(3626, var20, var19.field4805), class82.method639(3626, var20, var19.field4803), class82.method639(3626, var20, var19.field4810));
                        } else if (var19.field4811 == 0) {
                            arg7.method1822(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var15 - -var14, var19.field4802, var19.field4810, var19.field4803);
                            arg7.method1822(var16, var16, -var14 + var16, var15, var15 - -var14, var15, var19.field4805, var19.field4803, var19.field4810);
                        } else {
                            int var21 = var19.field4811;
                            arg7.method1822(-var14 + var16, var16 - var14, var16, var14 + var15, var15, var14 + var15, class354.method2040(var19.field4802 & -16777216, (byte) 119, var21), class354.method2040(-16777216 & var19.field4810, (byte) 117, var21), class354.method2040(-16777216 & var19.field4803, (byte) -31, var21));
                            arg7.method1822(var16, var16, -var14 + var16, var15, var14 + var15, var15, class354.method2040(-16777216 & var19.field4805, (byte) -71, var21), class354.method2040(-16777216 & var19.field4803, (byte) -110, var21), class354.method2040(-16777216 & var19.field4810, (byte) -80, var21));
                        }
                    } else if (super.field8222[var17][var18] != null) {
                        class624 var22 = super.field8222[var17][var18];
                        for (int var23 = 0; var22.field8731 > var23; ++var23) {
                            arg3[var23] = var15 - -(var22.field8737[var23] * var14 / super.field1163);
                            arg4[var23] = -(var22.field8734[var23] * var14 / super.field1163) + var16;
                        }
                        for (int var24 = 0; ~var22.field8732 < ~var24; ++var24) {
                            int var25 = var24 * 3;
                            int var26 = var25 + 1;
                            int var27 = var26 + 1;
                            int var28 = arg3[var25];
                            int var29 = arg3[var26];
                            int var30 = arg3[var27];
                            int var31 = arg4[var25];
                            int var32 = arg4[var26];
                            int var33 = arg4[var27];
                            if (var22.field8735 != null && ~var22.field8735[var24] != -1 && (var22.field8739 == null || var22.field8739 != null && var22.field8739[var24] == -1)) {
                                int var34 = var22.field8735[var24];
                                arg7.method1822(var31, var32, var33, var28, var29, var30, class354.method2040(-(-16777216 & var22.field8736[var25]) + -16777216, (byte) -72, var34), class354.method2040(-16777216 - (var22.field8736[var26] & -16777216), (byte) -90, var34), class354.method2040(-(-16777216 & var22.field8736[var27]) + -16777216, (byte) 75, var34));
                            } else if (var22.field8739 != null && var22.field8739[var24] != -1) {
                                int var35 = super.field8232.method1178(var22.field8739[var24]);
                                arg7.method1821(var31, var32, var33, var28, var29, var30, var35, var35, var35);
                            } else {
                                arg7.method1822(var31, var32, var33, var28, var29, var30, var22.field8736[var25], var22.field8736[var26], var22.field8736[var27]);
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var15 += var14;
            var16 = arg1 + var13;
        }
        arg7.field4044 = true;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    public final void method659(int arg0, int arg1) {
        ++field9322;
        class669 var3 = (class669) super.field8232.method846(Thread.currentThread());
        var3.field9291.field4047 = 0;
        if (super.field8231 == null) {
            if (super.field8235 != null) {
                this.method3691(var3.field5627, false, var3.field5635, var3.field9291, arg1, var3.field5613, arg0);
                return;
            }
        } else {
            this.method3690(var3.field9291, 1071059182, var3.field5635, arg1, arg0, super.field8232.field2156, var3.field5627, var3.field5613);
        }
    }
}
