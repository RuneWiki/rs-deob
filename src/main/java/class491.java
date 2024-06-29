import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class491 extends class153 {

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "I")
    public static int field6854 = -2;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
    public static int field6853 = -1;

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "[I")
    public static int[] field6857 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "Lvj;")
    public static class373 field6849 = new class373(58, 0);

    @OriginalMember(owner = "client!cr", name = "Q", descriptor = "Lrg;")
    public static class548 field6860 = new class548(69, -1);

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "Lrg;")
    public static class548 field6861 = new class548(17, 0);

    @OriginalMember(owner = "client!cr", name = "E", descriptor = "I")
    public static int field6850;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "I")
    public static int field6851;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "I")
    public static int field6852;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "I")
    public static int field6855;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "I")
    public static int field6858;

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "I")
    public static int field6859;

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!cr", name = "T", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "Ln;")
    public static class17 field6848;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([I[I[IIZIILuv;[I)V")
    private final void method2834(int[] arg0, int[] arg1, int[] arg2, int arg3, boolean arg4, int arg5, int arg6, class304 arg7, int[] arg8) {
        ++field6855;
        class234 var10 = super.field1870[arg6][arg3];
        if (var10 != null) {
            if (~(2 & var10.field2876) == -1) {
                int var11 = super.field2115 * arg6;
                int var12 = var11 - -super.field2115;
                int var13 = super.field2115 * arg3;
                int var14 = super.field2115 + var13;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var21;
                int var22;
                int var23;
                int var24;
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
                if (~(var10.field2876 & 1) != -1 && !arg4) {
                    int var19 = super.field1880[arg6][arg3];
                    if (~super.field1868 == 0) {
                        int var20 = super.field1871 * var19;
                        var21 = (super.field1876 * var13 + super.field1873 * var11 + var20 >> 15) + super.field1877;
                        if (super.field1872.field6149 >= var21) {
                            return;
                        }
                        var22 = (super.field1876 * var13 + super.field1873 * var12 + var20 >> 15) + super.field1877;
                        if (var22 <= super.field1872.field6149) {
                            return;
                        }
                        var23 = super.field1877 - -(super.field1876 * var14 + super.field1873 * var12 + var20 >> 15);
                        if (var23 <= super.field1872.field6149) {
                            return;
                        }
                        var24 = (super.field1876 * var14 + super.field1873 * var11 + var20 >> 15) + super.field1877;
                        if (~super.field1872.field6149 <= ~var24) {
                            return;
                        }
                    } else {
                        var24 = super.field1868;
                        var23 = super.field1868;
                        var22 = super.field1868;
                        var21 = super.field1868;
                    }
                    if (super.field1872.field6181) {
                        int var25 = var21 - super.field1872.field6165;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - super.field1872.field6165;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = var23 - super.field1872.field6165;
                        if (~var27 < -1) {
                            var17 = var27;
                            if (~var27 < -256) {
                                var17 = 255;
                            }
                        }
                        int var28 = var24 - super.field1872.field6165;
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    int var29 = super.field1878 * var19;
                    int var30 = super.field1881 * var19;
                    var31 = (super.field1885 * var13 + (super.field1883 * var11 - -var29) >> 15) + super.field1882;
                    var32 = (super.field1879 * var13 + super.field1866 * var11 + var30 >> 15) + super.field1887;
                    var33 = super.field1872.field6178 * var31 / var21 + arg7.field3882;
                    var34 = (super.field1885 * var13 + super.field1883 * var12 + var29 >> 15) + super.field1882;
                    var35 = super.field1872.field6189 * var32 / var21 + arg7.field3878;
                    var36 = super.field1872.field6178 * var34 / var22 + arg7.field3882;
                    var37 = (super.field1879 * var13 + super.field1866 * var12 + var30 >> 15) + super.field1887;
                    var38 = super.field1872.field6189 * var37 / var22 + arg7.field3878;
                    var39 = super.field1882 - -(super.field1885 * var14 + super.field1883 * var12 + var29 >> 15);
                    var40 = super.field1887 - -(super.field1879 * var14 + super.field1866 * var12 + var30 >> 15);
                    var41 = super.field1872.field6178 * var39 / var23 + arg7.field3882;
                    var42 = arg7.field3878 - -(super.field1872.field6189 * var40 / var23);
                    var43 = super.field1882 - -(super.field1885 * var14 + super.field1883 * var11 + var29 >> 15);
                    var44 = (super.field1866 * var11 + (var30 - -(super.field1879 * var14)) >> 15) + super.field1887;
                    var45 = arg7.field3882 - -(super.field1872.field6178 * var43 / var24);
                    var46 = arg7.field3878 - -(super.field1872.field6189 * var44 / var24);
                } else {
                    int var47 = super.field1880[arg6][arg3];
                    int var48 = super.field1880[arg6 - -1][arg3];
                    int var49 = super.field1880[arg6 - -1][arg3 + 1];
                    int var50 = super.field1880[arg6][arg3 + 1];
                    if (~super.field1868 != 0) {
                        var24 = super.field1868;
                        var23 = super.field1868;
                        var22 = super.field1868;
                        var21 = super.field1868;
                    } else {
                        var21 = (super.field1873 * var11 - -(super.field1871 * var47) - -(super.field1876 * var13) >> 15) + super.field1877;
                        if (var21 <= super.field1872.field6149) {
                            return;
                        }
                        var22 = (super.field1876 * var13 + super.field1873 * var12 - -(super.field1871 * var48) >> 15) + super.field1877;
                        if (~var22 >= ~super.field1872.field6149) {
                            return;
                        }
                        var23 = (super.field1871 * var49 + super.field1876 * var14 + super.field1873 * var12 >> 15) + super.field1877;
                        if (var23 <= super.field1872.field6149) {
                            return;
                        }
                        var24 = (super.field1876 * var14 + super.field1873 * var11 + super.field1871 * var50 >> 15) + super.field1877;
                        if (~super.field1872.field6149 <= ~var24) {
                            return;
                        }
                    }
                    if (!arg4) {
                        if (super.field1872.field6181) {
                            int var51 = -super.field1872.field6165 + var21;
                            if (var51 > 0) {
                                var15 = var51;
                                if (var51 > 255) {
                                    var15 = 255;
                                }
                            }
                            int var52 = -super.field1872.field6165 + var22;
                            if (~var52 < -1) {
                                var16 = var52;
                                if (var52 > 255) {
                                    var16 = 255;
                                }
                            }
                            int var53 = -super.field1872.field6165 + var23;
                            if (~var53 < -1) {
                                var17 = var53;
                                if (var53 > 255) {
                                    var17 = 255;
                                }
                            }
                            int var54 = -super.field1872.field6165 + var24;
                            if (var54 > 0) {
                                var18 = var54;
                                if (var54 > 255) {
                                    var18 = 255;
                                }
                            }
                        }
                    } else {
                        int var55 = -super.field1872.field6165 + var21;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var15 = var55;
                            int var56 = var10.field2877 * var55 / 255;
                            if (~var56 < -1) {
                                var47 -= var56;
                            }
                        }
                        int var57 = -super.field1872.field6165 + var22;
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (~var57 < -1) {
                            var16 = var57;
                            int var58 = var10.field2880 * var57 / 255;
                            if (~var58 < -1) {
                                var48 -= var58;
                            }
                        }
                        int var59 = var23 - super.field1872.field6165;
                        if (var59 > 255) {
                            var59 = 255;
                        }
                        if (var59 > 0) {
                            var17 = var59;
                            int var60 = var10.field2878 * var59 / 255;
                            if (var60 > 0) {
                                var49 -= var60;
                            }
                        }
                        int var61 = -super.field1872.field6165 + var24;
                        if (var61 > 255) {
                            var61 = 255;
                        }
                        if (var61 > 0) {
                            var18 = var61;
                            int var62 = var10.field2883 * var61 / 255;
                            if (~var62 < -1) {
                                var50 -= var62;
                            }
                        }
                    }
                    var31 = super.field1882 - -(super.field1878 * var47 + super.field1885 * var13 + super.field1883 * var11 >> 15);
                    var32 = super.field1887 - -(super.field1879 * var13 + super.field1881 * var47 + super.field1866 * var11 >> 15);
                    var33 = super.field1872.field6178 * var31 / var21 + arg7.field3882;
                    var35 = super.field1872.field6189 * var32 / var21 + arg7.field3878;
                    var34 = (super.field1878 * var48 + super.field1885 * var13 + super.field1883 * var12 >> 15) + super.field1882;
                    var36 = super.field1872.field6178 * var34 / var22 + arg7.field3882;
                    var37 = (super.field1881 * var48 + super.field1866 * var12 - -(super.field1879 * var13) >> 15) + super.field1887;
                    var39 = super.field1882 - -(super.field1885 * var14 + super.field1883 * var12 + super.field1878 * var49 >> 15);
                    var38 = super.field1872.field6189 * var37 / var22 + arg7.field3878;
                    var41 = super.field1872.field6178 * var39 / var23 + arg7.field3882;
                    var40 = (super.field1879 * var14 + super.field1881 * var49 + super.field1866 * var12 >> 15) + super.field1887;
                    var42 = super.field1872.field6189 * var40 / var23 + arg7.field3878;
                    var43 = (super.field1883 * var11 + super.field1885 * var14 + super.field1878 * var50 >> 15) + super.field1882;
                    var45 = super.field1872.field6178 * var43 / var24 + arg7.field3882;
                    var44 = (super.field1879 * var14 + super.field1881 * var50 + super.field1866 * var11 >> 15) + super.field1887;
                    var46 = super.field1872.field6189 * var44 / var24 + arg7.field3878;
                }
                boolean var63 = var10.field2879 != -1 && this.method856(super.field1872.field2481.method119(arg5 + -1659115074, var10.field2879).field2657);
                int var64 = var17 + var18 + var16;
                if (~((-var45 + var41) * (-var46 + var38) - (var36 - var45) * (-var46 + var42)) < -1) {
                    arg7.field3885 = ~var41 > -1 || ~var45 > -1 || var36 < 0 || ~var41 < ~arg7.field3873 || ~var45 < ~arg7.field3873 || var36 > arg7.field3873;
                    if (var64 < 765) {
                        if (var63) {
                            arg7.field3875 = 100;
                        }
                        if (~var64 < -1) {
                            if (~var10.field2879 > -1) {
                                arg7.method1688(var42, var46, var38, var41, var45, var36, var23, var24, var22, class98.method598(super.field1872.field6176 | var17 << 24, var10.field2881, 19099), class98.method598(var18 << 24 | super.field1872.field6176, var10.field2882, 19099), class98.method598(var16 << 24 | super.field1872.field6176, var10.field2875, 19099));
                            } else {
                                arg7.method1690(var42, var46, var38, var41, var45, var36, var23, var24, var22, super.field1872.field6176, var17, var18, var16, var10.field2881, var10.field2882, var10.field2875, var39, var43, var34, var40, var44, var37, var23, var24, var22, var10.field2879);
                            }
                        } else if (var10.field2879 < 0) {
                            arg7.method1688(var42, var46, var38, var41, var45, var36, var23, var24, var22, var10.field2881, var10.field2882, var10.field2875);
                        } else {
                            arg7.method1683(var42, var46, var38, var41, var45, var36, var10.field2881, var10.field2882, var10.field2875, var39, var43, var34, var40, var44, var37, var23, var24, var22, var10.field2879);
                        }
                        arg7.field3875 = 0;
                    } else {
                        arg7.method1687(var42, var46, var38, var41, var45, var36, var23, var24, var22, super.field1872.field6176);
                    }
                }
                int var65 = var15 + var18 - -var16;
                if (~((var46 - var38) * (-var36 + var33) - (-var36 + var45) * (-var38 + var35)) < -1) {
                    arg7.field3885 = var33 < 0 || var36 < 0 || ~var45 > -1 || var33 > arg7.field3873 || ~arg7.field3873 > ~var36 || arg7.field3873 < var45;
                    if (var65 >= 765) {
                        arg7.method1687(var35, var38, var46, var33, var36, var45, var21, var22, var24, super.field1872.field6176);
                        return;
                    }
                    if (var63) {
                        arg7.field3875 = 100;
                    }
                    if (var65 <= 0) {
                        if (~var10.field2879 > -1) {
                            arg7.method1688(var35, var38, var46, var33, var36, var45, var21, var22, var24, var10.field2873, var10.field2875, var10.field2882);
                        } else {
                            arg7.method1683(var35, var38, var46, var33, var36, var45, var10.field2873, var10.field2875, var10.field2882, var31, var34, var43, var32, var37, var44, var21, var22, var24, var10.field2879);
                        }
                    } else if (~var10.field2879 <= -1) {
                        arg7.method1690(var35, var38, var46, var33, var36, var45, var21, var22, var24, super.field1872.field6176, var15, var16, var18, var10.field2873, var10.field2875, var10.field2882, var31, var34, var43, var32, var37, var44, var21, var22, var24, var10.field2879);
                    } else {
                        arg7.method1688(var35, var38, var46, var33, var36, var45, var21, var22, var24, class98.method598(var15 << 24 | super.field1872.field6176, var10.field2873, 19099), class98.method598(super.field1872.field6176 | var16 << 24, var10.field2875, 19099), class98.method598(var18 << 24 | super.field1872.field6176, var10.field2882, 19099));
                    }
                    arg7.field3875 = 0;
                }
            }
        } else {
            if (arg5 != 1659114959) {
                field6854 = 13;
            }
            class100 var66 = super.field1867[arg6][arg3];
            if (var66 != null) {
                if (~super.field1868 != 0) {
                    for (int var67 = 0; ~var67 > ~var66.field1246; ++var67) {
                        int var68 = var66.field1247[var67] - -(arg6 << super.field2111);
                        int var69 = var66.field1239[var67];
                        int var70 = (arg3 << super.field2111) + var66.field1243[var67];
                        arg0[var67] = 0;
                        if (arg4) {
                            int var71 = -super.field1872.field6165 + super.field1868;
                            if (var71 > 255) {
                                var71 = 255;
                            }
                            if (var71 > 0) {
                                arg0[var67] = var71;
                                int var72 = var66.field1240[var67] * var71 / 255;
                                if (~var72 < -1) {
                                    var69 -= var72;
                                }
                            }
                        } else if (super.field1872.field6181) {
                            int var73 = -super.field1872.field6165 + super.field1868;
                            if (var73 > 0) {
                                arg0[var67] = var73;
                                if (~arg0[var67] < -256) {
                                    arg0[var67] = 255;
                                }
                            }
                        }
                        int var74 = super.field1882 - -(super.field1883 * var68 + super.field1878 * var69 - -(super.field1885 * var70) >> 15);
                        int var75 = (super.field1879 * var70 + super.field1881 * var69 + super.field1866 * var68 >> 15) + super.field1887;
                        arg1[var67] = super.field1872.field6178 * var74 / super.field1868 + arg7.field3882;
                        arg8[var67] = super.field1872.field6189 * var75 / super.field1868 + arg7.field3878;
                        arg2[var67] = super.field1868;
                    }
                } else {
                    for (int var76 = 0; ~var66.field1246 < ~var76; ++var76) {
                        int var116 = (arg6 << super.field2111) + var66.field1247[var76];
                        int var117 = var66.field1239[var76];
                        int var118 = (arg3 << super.field2111) + var66.field1243[var76];
                        int var119 = (super.field1876 * var118 + super.field1873 * var116 + super.field1871 * var117 >> 15) + super.field1877;
                        if (super.field1872.field6149 >= var119) {
                            return;
                        }
                        arg0[var76] = 0;
                        if (!arg4) {
                            if (super.field1872.field6181) {
                                int var120 = -super.field1872.field6165 + var119;
                                if (var120 > 0) {
                                    arg0[var76] = var120;
                                    if (~arg0[var76] < -256) {
                                        arg0[var76] = 255;
                                    }
                                }
                            }
                        } else {
                            int var121 = var119 - super.field1872.field6165;
                            if (~var121 < -256) {
                                var121 = 255;
                            }
                            if (var121 > 0) {
                                arg0[var76] = var121;
                                int var122 = var66.field1240[var76] * var121 / 255;
                                if (var122 > 0) {
                                    var117 -= var122;
                                }
                            }
                        }
                        int var123 = (super.field1878 * var117 + super.field1885 * var118 + super.field1883 * var116 >> 15) + super.field1882;
                        int var124 = super.field1887 - -(super.field1866 * var116 + (super.field1881 * var117 - -(super.field1879 * var118)) >> 15);
                        arg1[var76] = super.field1872.field6178 * var123 / var119 + arg7.field3882;
                        arg8[var76] = super.field1872.field6189 * var124 / var119 + arg7.field3878;
                        arg2[var76] = var119;
                    }
                }
                if (var66.field1241 != null) {
                    int var77 = super.field1880[arg6][arg3];
                    int var78 = super.field1880[arg6 + 1][arg3];
                    int var79 = super.field1880[arg6][arg3 + 1];
                    int var80 = super.field2115 * arg6;
                    int var81 = var80 - -super.field2115;
                    int var82 = super.field2115 * arg3;
                    int var83 = var82 - -super.field2115;
                    int var84 = super.field1882 - -(super.field1883 * var80 + super.field1885 * var82 + super.field1878 * var77 >> 15);
                    int var85 = (super.field1881 * var77 + super.field1866 * var80 - -(super.field1879 * var82) >> 15) + super.field1887;
                    int var86 = super.field1877 - -(super.field1871 * var77 + super.field1876 * var82 + super.field1873 * var80 >> 15);
                    int var87 = (super.field1883 * var81 - (-(super.field1885 * var82) + -(super.field1878 * var78)) >> 15) + super.field1882;
                    int var88 = super.field1887 - -(super.field1881 * var78 + super.field1866 * var81 - -(super.field1879 * var82) >> 15);
                    int var89 = (super.field1876 * var82 + (super.field1873 * var81 - -(super.field1871 * var78)) >> 15) + super.field1877;
                    int var90 = (super.field1883 * var80 + super.field1885 * var83 + super.field1878 * var79 >> 15) + super.field1882;
                    int var91 = (super.field1881 * var79 + super.field1879 * var83 + super.field1866 * var80 >> 15) + super.field1887;
                    int var92 = super.field1877 - -(super.field1876 * var83 + super.field1873 * var80 + super.field1871 * var79 >> 15);
                    for (int var93 = 0; var66.field1245 > var93; ++var93) {
                        int var94 = var93 * 3;
                        int var95 = var94 + 1;
                        int var96 = var95 + 1;
                        int var97 = arg1[var94];
                        int var98 = arg1[var95];
                        int var99 = arg1[var96];
                        int var100 = arg8[var94];
                        int var101 = arg8[var95];
                        int var102 = arg8[var96];
                        int var103 = arg0[var94] - (-arg0[var95] - arg0[var96]);
                        if ((var97 - var98) * (-var101 + var102) + -((-var98 + var99) * (-var101 + var100)) > 0) {
                            arg7.field3885 = var97 < 0 || ~var98 > -1 || ~var99 > -1 || ~arg7.field3873 > ~var97 || ~var98 < ~arg7.field3873 || arg7.field3873 < var99;
                            short var104 = var66.field1241[var93];
                            if (var103 < 765) {
                                if (~var104 != 0 && this.method856(super.field1872.field2481.method119(arg5 + -1659115086, var104).field2657)) {
                                    arg7.field3875 = 100;
                                }
                                if (var103 > 0) {
                                    if (var104 == -1) {
                                        if ((16777215 & var66.field1242[var94]) != 0) {
                                            arg7.method1688(var100, var101, var102, var97, var98, var99, arg2[var94], arg2[var95], arg2[var96], class98.method598(arg0[var94] << 24 | super.field1872.field6176, var66.field1242[var94], 19099), class98.method598(super.field1872.field6176 | arg0[var95] << 24, var66.field1242[var95], 19099), class98.method598(super.field1872.field6176 | arg0[var96] << 24, var66.field1242[var96], 19099));
                                        }
                                    } else {
                                        arg7.method1690(var100, var101, var102, var97, var98, var99, arg2[var94], arg2[var95], arg2[var96], super.field1872.field6176, arg0[var94], arg0[var95], arg0[var96], var66.field1242[var94], var66.field1242[var95], var66.field1242[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                    }
                                } else if (~var104 == 0) {
                                    if ((16777215 & var66.field1242[var94]) != 0) {
                                        arg7.method1688(var100, var101, var102, var97, var98, var99, arg2[var94], arg2[var95], arg2[var96], var66.field1242[var94], var66.field1242[var95], var66.field1242[var96]);
                                    }
                                } else {
                                    arg7.method1683(var100, var101, var102, var97, var98, var99, var66.field1242[var94], var66.field1242[var95], var66.field1242[var96], var84, var87, var90, var85, var88, var91, var86, var89, var92, var104);
                                }
                                arg7.field3875 = 0;
                            } else {
                                arg7.method1687(var100, var101, var102, var97, var98, var99, arg2[var94], arg2[var95], arg2[var96], super.field1872.field6176);
                            }
                        }
                    }
                } else {
                    for (int var105 = 0; var66.field1245 > var105; ++var105) {
                        int var106 = var105 * 3;
                        int var107 = var106 + 1;
                        int var108 = var107 + 1;
                        int var109 = arg1[var106];
                        int var110 = arg1[var107];
                        int var111 = arg1[var108];
                        int var112 = arg8[var106];
                        int var113 = arg8[var107];
                        int var114 = arg8[var108];
                        int var115 = arg0[var106] + arg0[var107] + arg0[var108];
                        if (~((var114 - var113) * (-var110 + var109) + -((var111 - var110) * (-var113 + var112))) < -1) {
                            arg7.field3885 = ~var109 > -1 || ~var110 > -1 || var111 < 0 || var109 > arg7.field3873 || arg7.field3873 < var110 || ~var111 < ~arg7.field3873;
                            if (~var115 <= -766) {
                                arg7.method1687(var112, var113, var114, var109, var110, var111, arg2[var106], arg2[var107], arg2[var108], super.field1872.field6176);
                            } else if (~var115 < -1) {
                                if ((16777215 & var66.field1242[var106]) != 0) {
                                    arg7.method1688(var112, var113, var114, var109, var110, var111, arg2[var106], arg2[var107], arg2[var108], class29.method163(var66.field1242[var106], -8552, arg0[var106], super.field1872.field6176), class29.method163(var66.field1242[var107], -8552, arg0[var107], super.field1872.field6176), class29.method163(var66.field1242[var108], -8552, arg0[var108], super.field1872.field6176));
                                }
                            } else if (~(16777215 & var66.field1242[var106]) != -1) {
                                arg7.method1688(var112, var113, var114, var109, var110, var111, arg2[var106], arg2[var107], arg2[var108], var66.field1242[var106], var66.field1242[var107], var66.field1242[var108]);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Luv;IIII[III[II[[ZI)V")
    private final void method2835(class304 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int[] arg8, int arg9, boolean[][] arg10, int arg11) {
        if (arg9 != -16777216) {
            this.method2836(56, 35, 55, -125, (boolean[][]) null, (int[]) null, 1, -82, (int[]) null, 102, -25, (class304) null);
        }
        ++field6856;
        int var13 = (-arg11 + arg2) * arg4 / 256;
        arg0.field3880 = false;
        int var14 = arg4 >> 8;
        arg0.field3884 = false;
        int var15 = arg1;
        int var16 = arg7 + var13;
        for (int var17 = arg6; ~var17 > ~arg3; ++var17) {
            for (int var18 = arg11; ~var18 > ~arg2; ++var18) {
                if (arg10[-arg6 + var17][-arg11 + var18]) {
                    if (super.field1870[var17][var18] != null) {
                        class234 var33 = super.field1870[var17][var18];
                        if (var33.field2879 != -1 && (var33.field2876 & 2) == 0 && var33.field2874 == 0) {
                            int var34 = super.field1872.method2616(var33.field2879);
                            arg0.method1685(-var14 + var16, -var14 + var16, var16, var15 - -var14, var15, var14 + var15, 0, 0, 0, class10.method52(31129, var33.field2881, var34), class10.method52(arg9 + 16808345, var33.field2882, var34), class10.method52(31129, var33.field2875, var34));
                            arg0.method1685(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, class10.method52(31129, var33.field2873, var34), class10.method52(arg9 + 16808345, var33.field2875, var34), class10.method52(31129, var33.field2882, var34));
                        } else if (~var33.field2874 != -1) {
                            int var35 = var33.field2874;
                            arg0.method1688(var16 - var14, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, class98.method598(var33.field2881 & -16777216, var35, 19099), class98.method598(-16777216 & var33.field2882, var35, 19099), class98.method598(-16777216 & var33.field2875, var35, 19099));
                            arg0.method1688(var16, var16, -var14 + var16, var15, var15 - -var14, var15, 0, 0, 0, class98.method598(-16777216 & var33.field2873, var35, 19099), class98.method598(var33.field2875 & -16777216, var35, 19099), class98.method598(var33.field2882 & -16777216, var35, 19099));
                        } else {
                            arg0.method1688(-var14 + var16, -var14 + var16, var16, var14 + var15, var15, var14 + var15, 0, 0, 0, var33.field2881, var33.field2882, var33.field2875);
                            arg0.method1688(var16, var16, -var14 + var16, var15, var14 + var15, var15, 0, 0, 0, var33.field2873, var33.field2875, var33.field2882);
                        }
                    } else if (super.field1867[var17][var18] != null) {
                        class100 var19 = super.field1867[var17][var18];
                        for (int var20 = 0; var20 < var19.field1246; ++var20) {
                            arg5[var20] = var19.field1247[var20] * var14 / super.field2115 + var15;
                            arg8[var20] = -(var19.field1243[var20] * var14 / super.field2115) + var16;
                        }
                        for (int var21 = 0; var19.field1245 > var21; ++var21) {
                            int var22 = var21 * 3;
                            int var23 = var22 + 1;
                            int var24 = var23 + 1;
                            int var25 = arg5[var22];
                            int var26 = arg5[var23];
                            int var27 = arg5[var24];
                            int var28 = arg8[var22];
                            int var29 = arg8[var23];
                            int var30 = arg8[var24];
                            if (var19.field1244 != null && ~var19.field1244[var21] != -1 && (var19.field1241 == null || var19.field1241 != null && ~var19.field1241[var21] == 0)) {
                                int var31 = var19.field1244[var21];
                                arg0.method1688(var28, var29, var30, var25, var26, var27, 0, 0, 0, class98.method598(-(var19.field1242[var22] & -16777216) + -16777216, var31, 19099), class98.method598(-(-16777216 & var19.field1242[var23]) + -16777216, var31, arg9 + 16796315), class98.method598(-(-16777216 & var19.field1242[var24]) + -16777216, var31, arg9 + 16796315));
                            } else if (var19.field1241 != null && var19.field1241[var21] != -1) {
                                int var32 = super.field1872.method2616(var19.field1241[var21]);
                                arg0.method1685(var28, var29, var30, var25, var26, var27, 0, 0, 0, var32, var32, var32);
                            } else {
                                arg0.method1688(var28, var29, var30, var25, var26, var27, 0, 0, 0, var19.field1242[var22], var19.field1242[var23], var19.field1242[var24]);
                            }
                        }
                    }
                }
                var16 -= var14;
            }
            var16 = arg7 - -var13;
            var15 += var14;
        }
        arg0.field3884 = true;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII[[Z[III[IIILuv;)V")
    private final void method2836(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4, int[] arg5, int arg6, int arg7, int[] arg8, int arg9, int arg10, class304 arg11) {
        ++field6851;
        int var13 = (-arg6 + arg3) * arg10 / 256;
        arg11.field3884 = false;
        int var14 = 31 / ((arg9 - 17) / 63);
        arg11.field3880 = false;
        int var15 = arg10 >> 8;
        int var16 = arg1;
        int var17 = arg2 + var13;
        for (int var18 = arg7; ~var18 > ~arg0; ++var18) {
            for (int var19 = arg6; ~var19 > ~arg3; ++var19) {
                if (arg4[var18 - arg7][-arg6 + var19]) {
                    if (super.field1886[var18][var19] != null) {
                        class120 var35 = super.field1886[var18][var19];
                        if (var35.field1514 != -1 && ~(var35.field1511 & 2) == -1 && var35.field1513 == -1) {
                            int var36 = super.field1872.method2616(var35.field1514);
                            arg11.method1685(-var15 + var17, -var15 + var17, var17, var16 - -var15, var16, var15 + var16, 0, 0, 0, class10.method52(31129, 65535 & var35.field1510, var36), class10.method52(31129, var35.field1512 & 65535, var36), class10.method52(31129, 65535 & var35.field1516, var36));
                            arg11.method1685(var17, var17, -var15 + var17, var16, var15 + var16, var16, 0, 0, 0, class10.method52(31129, var35.field1515 & 65535, var36), class10.method52(31129, 65535 & var35.field1516, var36), class10.method52(31129, var35.field1512 & 65535, var36));
                        } else if (~var35.field1513 == 0) {
                            arg11.method1685(-var15 + var17, -var15 + var17, var17, var15 + var16, var16, var15 + var16, 0, 0, 0, var35.field1510 & 65535, var35.field1512 & 65535, var35.field1516 & 65535);
                            arg11.method1685(var17, var17, -var15 + var17, var16, var15 + var16, var16, 0, 0, 0, var35.field1515 & 65535, var35.field1516 & 65535, 65535 & var35.field1512);
                        } else {
                            int var37 = var35.field1513;
                            arg11.method1685(-var15 + var17, -var15 + var17, var17, var15 + var16, var16, var15 + var16, 0, 0, 0, var37, var37, var37);
                            arg11.method1685(var17, var17, -var15 + var17, var16, var16 - -var15, var16, 0, 0, 0, var37, var37, var37);
                        }
                    } else if (super.field1875[var18][var19] != null) {
                        class223 var20 = super.field1875[var18][var19];
                        for (int var21 = 0; var21 < var20.field2746; ++var21) {
                            arg5[var21] = var20.field2743[var21] * var15 / super.field2115 + var16;
                            arg8[var21] = var17 - var20.field2747[var21] * var15 / super.field2115;
                        }
                        for (int var22 = 0; ~var20.field2745 < ~var22; ++var22) {
                            short var23 = var20.field2751[var22];
                            short var24 = var20.field2742[var22];
                            short var25 = var20.field2752[var22];
                            int var26 = arg5[var23];
                            int var27 = arg5[var24];
                            int var28 = arg5[var25];
                            int var29 = arg8[var23];
                            int var30 = arg8[var24];
                            int var31 = arg8[var25];
                            if (var20.field2749 != null && var20.field2749[var22] != -1) {
                                int var32 = var20.field2749[var22];
                                arg11.method1685(var29, var30, var31, var26, var27, var28, 0, 0, 0, class10.method52(31129, var20.field2741[var23], var32), class10.method52(31129, var20.field2741[var24], var32), class10.method52(31129, var20.field2741[var25], var32));
                            } else if (var20.field2744 != null && var20.field2744[var22] != -1) {
                                int var33 = super.field1872.method2616(var20.field2744[var22]);
                                arg11.method1685(var29, var30, var31, var26, var27, var28, 0, 0, 0, class10.method52(31129, var20.field2741[var23], var33), class10.method52(31129, var20.field2741[var24], var33), class10.method52(31129, var20.field2741[var25], var33));
                            } else {
                                int var34 = var20.field2750[var22];
                                arg11.method1685(var29, var30, var31, var26, var27, var28, 0, 0, 0, class10.method52(31129, var20.field2741[var23], var34), class10.method52(31129, var20.field2741[var24], var34), class10.method52(31129, var20.field2741[var25], var34));
                            }
                        }
                    }
                }
                var17 -= var15;
            }
            var16 += var15;
            var17 = arg2 + var13;
        }
        arg11.field3884 = true;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field6850;
        class442 var9 = (class442) super.field1872.method276(Thread.currentThread());
        class304 var10 = var9.field6097;
        var10.field3885 = false;
        var10.field3875 = 0;
        if (super.field1870 != null) {
            this.method2835(var10, arg0, arg6, arg5, arg2, var9.field3401, arg3, arg1, var9.field3416, -16777216, arg7, arg4);
        } else if (super.field1886 != null) {
            this.method2836(arg5, arg0, arg1, arg6, arg7, var9.field3401, arg4, arg3, var9.field3416, 81, arg2, var10);
        }
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(I)V")
    public static void method2837(int arg0) {
        field6861 = null;
        field6860 = null;
        int var1 = -89 / ((arg0 - 42) / 52);
        field6848 = null;
        field6849 = null;
        field6857 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
    public final void method844(int arg0, int arg1) {
        ++field6858;
        class442 var3 = (class442) super.field1872.method276(Thread.currentThread());
        var3.field6097.field3875 = 0;
        if (super.field1870 != null) {
            this.method2834(var3.field3438, var3.field3401, var3.field3427, arg1, super.field1872.field6177, 1659114959, arg0, var3.field6097, var3.field3416);
        } else if (super.field1886 != null) {
            this.method2839(arg1, var3.field3416, (byte) -121, arg0, var3.field3438, var3.field6097, var3.field3427, var3.field3401);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(CBI)C")
    public static final char method2838(char arg0, byte arg1, int arg2) {
        ++field6852;
        if (arg1 <= 79) {
            return ',';
        } else {
            if (~arg0 <= -193 && ~arg0 >= -256) {
                if (arg0 >= 192 && arg0 <= 198) {
                    return 'A';
                }
                if (arg0 == 199) {
                    return 'C';
                }
                if (~arg0 <= -201 && arg0 <= 203) {
                    return 'E';
                }
                if (arg0 >= 204 && arg0 <= 207) {
                    return 'I';
                }
                if (arg0 == 209 && arg2 != 0) {
                    return 'N';
                }
                if (~arg0 <= -211 && arg0 <= 214) {
                    return 'O';
                }
                if (~arg0 <= -218 && ~arg0 >= -221) {
                    return 'U';
                }
                if (arg0 == 221) {
                    return 'Y';
                }
                if (~arg0 == -224) {
                    return 's';
                }
                if (arg0 >= 224 && arg0 <= 230) {
                    return 'a';
                }
                if (arg0 == 231) {
                    return 'c';
                }
                if (arg0 >= 232 && arg0 <= 235) {
                    return 'e';
                }
                if (~arg0 <= -237 && arg0 <= 239) {
                    return 'i';
                }
                if (~arg0 == -242 && arg2 != 0) {
                    return 'n';
                }
                if (~arg0 <= -243 && ~arg0 >= -247) {
                    return 'o';
                }
                if (~arg0 <= -250 && arg0 <= 252) {
                    return 'u';
                }
                if (~arg0 == -254 || ~arg0 == -256) {
                    return 'y';
                }
            }
            if (arg0 == 338) {
                return 'O';
            } else if (arg0 == 339) {
                return 'o';
            } else if (arg0 == 376) {
                return 'Y';
            } else {
                return arg0;
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[IBI[ILuv;[I[I)V")
    private final void method2839(int arg0, int[] arg1, byte arg2, int arg3, int[] arg4, class304 arg5, int[] arg6, int[] arg7) {
        ++field6859;
        class120 var9 = super.field1886[arg3][arg0];
        int var10 = -25 / ((arg2 - -7) / 56);
        if (var9 != null) {
            if ((var9.field1511 & 2) == 0) {
                int var11 = super.field2115 * arg3;
                int var12 = var11 - -super.field2115;
                int var13 = super.field2115 * arg0;
                int var14 = var13 - -super.field2115;
                int var17;
                int var18;
                int var19;
                int var20;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var28;
                int var29;
                int var31;
                int var32;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                if ((1 & var9.field1511) != 0) {
                    int var15 = super.field1880[arg3][arg0];
                    if (super.field1868 == -1) {
                        int var16 = super.field1871 * var15;
                        var17 = (super.field1876 * var13 + super.field1873 * var11 + var16 >> 15) + super.field1877;
                        if (super.field1872.field6149 >= var17) {
                            return;
                        }
                        var18 = (super.field1876 * var13 + super.field1873 * var12 + var16 >> 15) + super.field1877;
                        if (~var18 >= ~super.field1872.field6149) {
                            return;
                        }
                        var19 = (super.field1873 * var12 - -(super.field1876 * var14) + var16 >> 15) + super.field1877;
                        if (super.field1872.field6149 >= var19) {
                            return;
                        }
                        var20 = (super.field1876 * var14 + super.field1873 * var11 - -var16 >> 15) + super.field1877;
                        if (~super.field1872.field6149 <= ~var20) {
                            return;
                        }
                    } else {
                        var20 = super.field1868;
                        var19 = super.field1868;
                        var18 = super.field1868;
                        var17 = super.field1868;
                    }
                    int var21 = super.field1878 * var15;
                    int var22 = super.field1881 * var15;
                    var23 = (super.field1885 * var13 + (super.field1883 * var11 - -var21) >> 15) + super.field1882;
                    var24 = super.field1872.field6178 * var23 / var17 + arg5.field3882;
                    var25 = (super.field1866 * var11 + super.field1879 * var13 + var22 >> 15) + super.field1887;
                    var26 = super.field1872.field6189 * var25 / var17 + arg5.field3878;
                    var27 = (super.field1885 * var13 + super.field1883 * var12 + var21 >> 15) + super.field1882;
                    var28 = super.field1887 - -(super.field1879 * var13 + super.field1866 * var12 + var22 >> 15);
                    var29 = super.field1872.field6178 * var27 / var18 + arg5.field3882;
                    int var30 = (super.field1883 * var12 - -var21 - -(super.field1885 * var14) >> 15) + super.field1882;
                    var31 = arg5.field3878 - -(super.field1872.field6189 * var28 / var18);
                    var32 = arg5.field3882 - -(super.field1872.field6178 * var30 / var19);
                    int var33 = super.field1887 - -(super.field1879 * var14 + super.field1866 * var12 + var22 >> 15);
                    var34 = (super.field1885 * var14 + super.field1883 * var11 + var21 >> 15) + super.field1882;
                    var35 = arg5.field3878 - -(super.field1872.field6189 * var33 / var19);
                    var36 = (super.field1866 * var11 - -(super.field1879 * var14) + var22 >> 15) + super.field1887;
                    var37 = arg5.field3882 - -(super.field1872.field6178 * var34 / var20);
                    var38 = super.field1872.field6189 * var36 / var20 + arg5.field3878;
                } else {
                    int var39 = super.field1880[arg3][arg0];
                    int var40 = super.field1880[arg3 + 1][arg0];
                    int var41 = super.field1880[arg3 + 1][arg0 - -1];
                    int var42 = super.field1880[arg3][arg0 + 1];
                    if (super.field1868 != -1) {
                        var20 = super.field1868;
                        var19 = super.field1868;
                        var18 = super.field1868;
                        var17 = super.field1868;
                    } else {
                        var17 = (super.field1876 * var13 + super.field1873 * var11 - -(super.field1871 * var39) >> 15) + super.field1877;
                        if (~super.field1872.field6149 <= ~var17) {
                            return;
                        }
                        var18 = (super.field1873 * var12 + super.field1871 * var40 - -(super.field1876 * var13) >> 15) + super.field1877;
                        if (~super.field1872.field6149 <= ~var18) {
                            return;
                        }
                        var19 = (super.field1871 * var41 + super.field1876 * var14 + super.field1873 * var12 >> 15) + super.field1877;
                        if (~var19 >= ~super.field1872.field6149) {
                            return;
                        }
                        var20 = (super.field1873 * var11 + super.field1871 * var42 - -(super.field1876 * var14) >> 15) + super.field1877;
                        if (super.field1872.field6149 >= var20) {
                            return;
                        }
                    }
                    var23 = (super.field1883 * var11 - (-(super.field1878 * var39) - super.field1885 * var13) >> 15) + super.field1882;
                    var25 = (super.field1866 * var11 - -(super.field1881 * var39) - -(super.field1879 * var13) >> 15) + super.field1887;
                    var24 = super.field1872.field6178 * var23 / var17 + arg5.field3882;
                    var26 = arg5.field3878 - -(super.field1872.field6189 * var25 / var17);
                    var27 = (super.field1883 * var12 + super.field1878 * var40 - -(super.field1885 * var13) >> 15) + super.field1882;
                    var29 = arg5.field3882 - -(super.field1872.field6178 * var27 / var18);
                    var28 = super.field1887 - -(super.field1866 * var12 + super.field1881 * var40 + super.field1879 * var13 >> 15);
                    var31 = super.field1872.field6189 * var28 / var18 + arg5.field3878;
                    int var43 = (super.field1883 * var12 + super.field1885 * var14 + super.field1878 * var41 >> 15) + super.field1882;
                    var32 = super.field1872.field6178 * var43 / var19 + arg5.field3882;
                    int var44 = super.field1887 - -(super.field1879 * var14 + super.field1881 * var41 + super.field1866 * var12 >> 15);
                    var34 = (super.field1885 * var14 + super.field1883 * var11 - -(super.field1878 * var42) >> 15) + super.field1882;
                    var35 = super.field1872.field6189 * var44 / var19 + arg5.field3878;
                    var36 = (super.field1879 * var14 + super.field1881 * var42 + super.field1866 * var11 >> 15) + super.field1887;
                    var37 = super.field1872.field6178 * var34 / var20 + arg5.field3882;
                    var38 = super.field1872.field6189 * var36 / var20 + arg5.field3878;
                }
                if ((var31 - var38) * (-var37 + var32) + -((-var37 + var29) * (-var38 + var35)) > 0) {
                    arg5.field3885 = var32 < 0 || ~var37 > -1 || var29 < 0 || arg5.field3873 < var32 || var37 > arg5.field3873 || arg5.field3873 < var29;
                    if (~var9.field1514 > -1) {
                        arg5.method1685(var35, var38, var31, var32, var37, var29, var19, var20, var18, 65535 & var9.field1510, var9.field1512 & 65535, var9.field1516 & 65535);
                    } else {
                        if (this.method856(super.field1872.field2481.method119(-114, var9.field1514).field2657)) {
                            arg5.field3875 = 100;
                        }
                        arg5.method1683(var35, var38, var31, var32, var37, var29, var9.field1510 & 65535, var9.field1512 & 65535, 65535 & var9.field1516, var23, var27, var34, var25, var28, var36, var17, var18, var20, var9.field1514);
                        arg5.field3875 = 0;
                    }
                }
                if ((var38 - var31) * (-var29 + var24) + -((-var29 + var37) * (-var31 + var26)) > 0) {
                    arg5.field3885 = var24 < 0 || var29 < 0 || var37 < 0 || var24 > arg5.field3873 || var29 > arg5.field3873 || arg5.field3873 < var37;
                    if (var9.field1514 >= 0) {
                        if (this.method856(super.field1872.field2481.method119(-115, var9.field1514).field2657)) {
                            arg5.field3875 = 100;
                        }
                        arg5.method1683(var26, var31, var38, var24, var29, var37, var9.field1515 & 65535, var9.field1516 & 65535, 65535 & var9.field1512, var23, var27, var34, var25, var28, var36, var17, var18, var20, var9.field1514);
                        arg5.field3875 = 0;
                        return;
                    }
                    arg5.method1685(var26, var31, var38, var24, var29, var37, var17, var18, var20, 65535 & var9.field1515, 65535 & var9.field1516, var9.field1512 & 65535);
                }
            }
        } else {
            class223 var45 = super.field1875[arg3][arg0];
            if (var45 != null) {
                if (~super.field1868 != 0) {
                    for (int var46 = 0; ~var46 > ~var45.field2746; ++var46) {
                        int var47 = var45.field2743[var46] - -(arg3 << super.field2111);
                        short var48 = var45.field2748[var46];
                        int var49 = (arg0 << super.field2111) + var45.field2747[var46];
                        int var50 = (super.field1883 * var47 + super.field1878 * var48 - -(super.field1885 * var49) >> 15) + super.field1882;
                        int var51 = (super.field1879 * var49 + super.field1881 * var48 + super.field1866 * var47 >> 15) + super.field1887;
                        arg7[var46] = arg5.field3882 - -(super.field1872.field6178 * var50 / super.field1868);
                        arg1[var46] = arg5.field3878 - -(super.field1872.field6189 * var51 / super.field1868);
                        arg6[var46] = super.field1868;
                    }
                } else {
                    for (int var52 = 0; ~var45.field2746 < ~var52; ++var52) {
                        int var92 = (arg3 << super.field2111) + var45.field2743[var52];
                        short var93 = var45.field2748[var52];
                        int var94 = var45.field2747[var52] - -(arg0 << super.field2111);
                        int var95 = (super.field1871 * var93 + (super.field1873 * var92 - -(super.field1876 * var94)) >> 15) + super.field1877;
                        if (super.field1872.field6149 >= var95) {
                            return;
                        }
                        int var96 = (super.field1885 * var94 + super.field1883 * var92 - -(super.field1878 * var93) >> 15) + super.field1882;
                        int var97 = (super.field1879 * var94 + super.field1881 * var93 + super.field1866 * var92 >> 15) + super.field1887;
                        arg7[var52] = super.field1872.field6178 * var96 / var95 + arg5.field3882;
                        arg1[var52] = super.field1872.field6189 * var97 / var95 + arg5.field3878;
                        arg6[var52] = var95;
                    }
                }
                if (var45.field2744 == null) {
                    for (int var53 = 0; ~var53 > ~var45.field2745; ++var53) {
                        short var54 = var45.field2751[var53];
                        short var55 = var45.field2742[var53];
                        short var56 = var45.field2752[var53];
                        int var57 = arg7[var54];
                        int var58 = arg7[var55];
                        int var59 = arg7[var56];
                        int var60 = arg1[var54];
                        int var61 = arg1[var55];
                        int var62 = arg1[var56];
                        if (~((-var58 + var57) * (-var61 + var62) + -((-var58 + var59) * (-var61 + var60))) < -1) {
                            int var63 = var45.field2750[var53];
                            if (~var63 != 0) {
                                arg5.field3885 = var57 < 0 || ~var58 > -1 || ~var59 > -1 || ~arg5.field3873 > ~var57 || var58 > arg5.field3873 || ~var59 < ~arg5.field3873;
                                arg5.method1685(var60, var61, var62, var57, var58, var59, arg6[1], arg6[2], arg6[3], class10.method52(31129, var45.field2741[var54], var63), class10.method52(31129, var45.field2741[var55], var63), class10.method52(31129, var45.field2741[var56], var63));
                            }
                        }
                    }
                } else {
                    int var64 = super.field1880[arg3][arg0];
                    int var65 = super.field1880[arg3 + 1][arg0];
                    int var66 = super.field1880[arg3][arg0 + 1];
                    int var67 = super.field2115 * arg3;
                    int var68 = var67 - -super.field2115;
                    int var69 = super.field2115 * arg0;
                    int var70 = super.field2115 + var69;
                    int var71 = (super.field1885 * var69 + super.field1883 * var67 + super.field1878 * var64 >> 15) + super.field1882;
                    int var72 = (super.field1881 * var64 + (super.field1866 * var67 - -(super.field1879 * var69)) >> 15) + super.field1887;
                    int var73 = (super.field1871 * var64 + super.field1876 * var69 + super.field1873 * var67 >> 15) + super.field1877;
                    int var74 = (super.field1885 * var69 + super.field1883 * var68 + super.field1878 * var65 >> 15) + super.field1882;
                    int var75 = (super.field1866 * var68 + super.field1881 * var65 + super.field1879 * var69 >> 15) + super.field1887;
                    int var76 = (super.field1871 * var65 + (super.field1873 * var68 - -(super.field1876 * var69)) >> 15) + super.field1877;
                    int var77 = (super.field1885 * var70 + (super.field1883 * var67 - -(super.field1878 * var66)) >> 15) + super.field1882;
                    int var78 = super.field1887 - -(super.field1881 * var66 + (super.field1866 * var67 - -(super.field1879 * var70)) >> 15);
                    int var79 = super.field1877 - -(super.field1873 * var67 + super.field1871 * var66 - -(super.field1876 * var70) >> 15);
                    for (int var80 = 0; ~var80 > ~var45.field2745; ++var80) {
                        short var81 = var45.field2751[var80];
                        short var82 = var45.field2742[var80];
                        short var83 = var45.field2752[var80];
                        int var84 = arg7[var81];
                        int var85 = arg7[var82];
                        int var86 = arg7[var83];
                        int var87 = arg1[var81];
                        int var88 = arg1[var82];
                        int var89 = arg1[var83];
                        if (~((-var85 + var84) * (-var88 + var89) - (-var85 + var86) * (-var88 + var87)) < -1) {
                            arg5.field3885 = ~var84 > -1 || var85 < 0 || ~var86 > -1 || arg5.field3873 < var84 || arg5.field3873 < var85 || ~var86 < ~arg5.field3873;
                            short var90 = var45.field2744[var80];
                            if (var90 == -1) {
                                int var91 = var45.field2750[var80];
                                if (var91 != -1) {
                                    arg5.method1685(var87, var88, var89, var84, var85, var86, arg6[1], arg6[2], arg6[3], class10.method52(31129, var45.field2741[var81], var91), class10.method52(31129, var45.field2741[var82], var91), class10.method52(31129, var45.field2741[var83], var91));
                                }
                            } else {
                                if (this.method856(super.field1872.field2481.method119(-123, var90).field2657)) {
                                    arg5.field3875 = 100;
                                }
                                arg5.method1683(var87, var88, var89, var84, var85, var86, var45.field2741[var81], var45.field2741[var82], var45.field2741[var83], var71, var74, var77, var72, var75, var78, var73, var76, var79, var90);
                                arg5.field3875 = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lhr;IIII[[I[[II)V")
    public class491(class446 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }
}
