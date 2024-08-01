import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sf")
public class class172 extends class85 {

    @OriginalMember(owner = "sf", name = "U", descriptor = "Llf;")
    private static class109 field3225 = class35.method275("This world is full)3", 2);

    @OriginalMember(owner = "sf", name = "W", descriptor = "Llf;")
    public static class109 field3227 = class35.method275(":tradereq:", 2);

    @OriginalMember(owner = "sf", name = "R", descriptor = "Llf;")
    public static class109 field3222 = field3225;

    @OriginalMember(owner = "sf", name = "V", descriptor = "I")
    public static int field3226 = 0;

    @OriginalMember(owner = "sf", name = "S", descriptor = "Llf;")
    private static class109 field3223 = class35.method275("Please enter your password)3", 2);

    @OriginalMember(owner = "sf", name = "Q", descriptor = "Llf;")
    public static class109 field3221 = field3223;

    @OriginalMember(owner = "sf", name = "T", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "sf", name = "X", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "sf", name = "<init>", descriptor = "()V")
    public class172() {
        super(1, true);
    }

    @OriginalMember(owner = "sf", name = "e", descriptor = "(I)V")
    public static void method1153(int arg0) {
        field3225 = null;
        if (arg0 != -2) {
            field3227 = null;
        }
        field3223 = null;
        field3222 = null;
        field3221 = null;
        field3227 = null;
    }

    @OriginalMember(owner = "sf", name = "a", descriptor = "(II)[I")
    public final int[] method87(int arg0, int arg1) {
        if (arg0 > -49) {
            field3225 = null;
        }
        ++field3224;
        int[] var3 = super.field1736.method835(-314, arg1);
        if (super.field1736.field2253) {
            int[][] var4 = this.method544(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class57.field1152; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "sf", name = "a", descriptor = "(IIIIIIII[Lvg;I)V")
    public static final void method1154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class200[] arg8, int arg9) {
        class11.method71(arg9, arg0, arg7, arg2);
        class124.method888();
        ++field3228;
        if (arg5 < -6) {
            for (int var10 = 0; ~var10 > ~arg8.length; ++var10) {
                class200 var11 = arg8[var10];
                if (var11 != null && (var11.field3868 == arg1 || arg1 == -1412584499 && class182.field3431 == var11)) {
                    int var12;
                    if (~arg3 != 0) {
                        var12 = arg3;
                    } else {
                        class60.field1176[class113.field2239] = var11.field3825 + arg6;
                        class27.field587[class113.field2239] = var11.field3936 + arg4;
                        class200.field3956[class113.field2239] = var11.field3881;
                        class68.field1317[class113.field2239] = var11.field3901;
                        var12 = class113.field2239++;
                    }
                    var11.field3920 = class143.field2754;
                    var11.field3855 = var12;
                    if (!var11.field3946 || !class113.method834((byte) 4, var11)) {
                        if (~var11.field3916 < -1) {
                            class147.method1027(-1753, var11);
                        }
                        int var13 = var11.field3854;
                        int var14 = var11.field3825 - -arg6;
                        int var15 = var11.field3936 + arg4;
                        if (class182.field3431 == var11) {
                            if (~arg1 != 1412584498 && !var11.field3886) {
                                class115.field2271 = arg4;
                                class21.field472 = arg6;
                                class145.field2792 = arg8;
                                continue;
                            }
                            if (!var11.field3886) {
                                var13 = 128;
                            }
                            if (class139.field2701 && class27.field596) {
                                int var16 = class21.field479;
                                int var17 = var16 - class161.field3013;
                                int var18 = class109.field2134;
                                int var19 = var18 - class147.field2842;
                                if (var19 < class193.field3688) {
                                    var19 = class193.field3688;
                                }
                                if (class193.field3688 + class46.field955.field3901 < var11.field3901 + var19) {
                                    var19 = class193.field3688 + class46.field955.field3901 - var11.field3901;
                                }
                                var15 = var19;
                                if (class21.field473 > var17) {
                                    var17 = class21.field473;
                                }
                                if (~(var11.field3881 + var17) < ~(class21.field473 + class46.field955.field3881)) {
                                    var17 = -var11.field3881 + class21.field473 + class46.field955.field3881;
                                }
                                var14 = var17;
                            }
                        }
                        int var25;
                        int var27;
                        int var28;
                        int var29;
                        if (var11.field3875 != 2) {
                            if (var11.field3875 == 9) {
                                int var20 = var14;
                                int var21 = var15;
                                int var22 = var14 - -var11.field3881;
                                if (~var22 > ~var14) {
                                    var20 = var22;
                                    var22 = var14;
                                }
                                int var24 = var11.field3901 + var15;
                                ++var22;
                                var25 = ~var20 >= ~arg9 ? arg9 : var20;
                                if (var24 < var15) {
                                    var21 = var24;
                                    var24 = var15;
                                }
                                var27 = ~var22 <= ~arg7 ? arg7 : var22;
                                var28 = arg0 < var21 ? var21 : arg0;
                                ++var24;
                                var29 = arg2 <= var24 ? arg2 : var24;
                            } else {
                                var28 = ~arg0 > ~var15 ? var15 : arg0;
                                int var30 = var11.field3881 + var14;
                                var25 = ~var14 < ~arg9 ? var14 : arg9;
                                var27 = arg7 <= var30 ? arg7 : var30;
                                int var31 = var11.field3901 + var15;
                                var29 = var31 >= arg2 ? arg2 : var31;
                            }
                        } else {
                            var27 = arg7;
                            var28 = arg0;
                            var29 = arg2;
                            var25 = arg9;
                        }
                        if (!var11.field3946 || ~var27 < ~var25 && ~var28 > ~var29) {
                            if (~var11.field3916 != -1) {
                                if (var11.field3916 == 1337) {
                                    class134.field2566 = var14;
                                    class68.field1331 = var15;
                                    class156.method1067(var15, var11.field3881, var11.field3901, false, var14);
                                    class11.method71(arg9, arg0, arg7, arg2);
                                    continue;
                                }
                                if (var11.field3916 == 1338) {
                                    if (var11.method1314(122)) {
                                        class55.method362(var12, var14, var11, var15, (byte) 38);
                                        class11.method71(arg9, arg0, arg7, arg2);
                                    }
                                    continue;
                                }
                                if (~var11.field3916 == -1340) {
                                    if (var11.method1314(126)) {
                                        class77.method491(true, var12, var14, var15, var11);
                                        class11.method71(arg9, arg0, arg7, arg2);
                                    }
                                    continue;
                                }
                            }
                            int var32 = class21.field479;
                            int var33 = class109.field2134;
                            if (!class51.field1041 && var25 <= var32 && ~var33 <= ~var28 && ~var32 > ~var27 && ~var33 > ~var29) {
                                class202.method1332(100, var11, -var15 + var33, -var14 + var32);
                            }
                            if (var11.field3875 == 0) {
                                if (!var11.field3946 && class113.method834((byte) -124, var11) && class209.field4069 != var11) {
                                    continue;
                                }
                                if (!var11.field3946) {
                                    if (~(-var11.field3901 + var11.field3847) > ~var11.field3945) {
                                        var11.field3945 = -var11.field3901 + var11.field3847;
                                    }
                                    if (var11.field3945 < 0) {
                                        var11.field3945 = 0;
                                    }
                                }
                                method1154(var28, var11.field3866, var29, var12, -var11.field3945 + var15, -114, -var11.field3817 + var14, var27, arg8, var25);
                                if (var11.field3898 != null) {
                                    method1154(var28, var11.field3866, var29, var12, var15 - var11.field3945, -25, -var11.field3817 + var14, var27, var11.field3898, var25);
                                }
                                class60 var34 = (class60) class113.field2236.method337((long) var11.field3866, (byte) -111);
                                if (var34 != null) {
                                    if (var34.field1184 == 0 && ~class21.field479 <= ~var25 && ~var28 >= ~class109.field2134 && class21.field479 < var27 && ~var29 < ~class109.field2134 && !class51.field1041 && !class158.field2973) {
                                        class31.field726[0] = 1001;
                                        class149.field2882 = 1;
                                        class115.field2282[0] = class57.field1154;
                                        class183.field3438[0] = class174.field3306;
                                    }
                                    class45.method316(var15, var27, var12, var34.field1174, var25, (byte) 16, var28, var14, var29);
                                }
                                class11.method71(arg9, arg0, arg7, arg2);
                                class124.method888();
                            }
                            if (class130.field2518[var12] || ~class173.field3229 < -2) {
                                if (var11.field3875 == 0 && !var11.field3946 && var11.field3847 > var11.field3901) {
                                    class163.method1107(var15, var11.field3945, var11.field3847, var11.field3881 + var14, (byte) 89, var11.field3901);
                                }
                                if (~var11.field3875 != -2) {
                                    if (~var11.field3875 == -3) {
                                        int var35 = 0;
                                        for (int var36 = 0; var11.field3901 > var36; ++var36) {
                                            for (int var37 = 0; ~var11.field3881 < ~var37; ++var37) {
                                                int var38 = (var11.field3948 + 32) * var36 + var15;
                                                int var39 = (var11.field3827 + 32) * var37 + var14;
                                                if (~var35 > -21) {
                                                    var38 += var11.field3884[var35];
                                                    var39 += var11.field3870[var35];
                                                }
                                                if (var11.field3925[var35] <= 0) {
                                                    if (var11.field3926 != null && var35 < 20) {
                                                        class100 var51 = var11.method1323(var35, true);
                                                        if (var51 == null) {
                                                            if (class76.field1469) {
                                                                class115.method851(var11, -23101);
                                                            }
                                                        } else {
                                                            var51.method704(var39, var38);
                                                        }
                                                    }
                                                } else {
                                                    boolean var40 = false;
                                                    boolean var41 = false;
                                                    int var42 = var11.field3925[var35] - 1;
                                                    if (~(var39 - -32) < ~arg9 && ~arg7 < ~var39 && ~arg0 > ~(var38 + 32) && arg2 > var38 || class174.field3296 == var11 && class10.field158 == var35) {
                                                        class100 var43;
                                                        if (class140.field2725 == 1 && class47.field973 == var35 && class96.field1959 == var11.field3866) {
                                                            var43 = class14.method91(var11.field3913[var35], var42, 0, (byte) 126, 2, false);
                                                        } else {
                                                            var43 = class14.method91(var11.field3913[var35], var42, 3153952, (byte) 123, 1, false);
                                                        }
                                                        if (var43 != null) {
                                                            if (class174.field3296 == var11 && class10.field158 == var35) {
                                                                int var44 = -class62.field1200 + class21.field479;
                                                                int var45 = -class41.field870 + class109.field2134;
                                                                if (var44 < 5 && var44 > -5) {
                                                                    var44 = 0;
                                                                }
                                                                if (~var45 > -6 && var45 > -5) {
                                                                    var45 = 0;
                                                                }
                                                                if (~class164.field3070 > -6) {
                                                                    var44 = 0;
                                                                    var45 = 0;
                                                                }
                                                                var43.method729(var39 + var44, var38 - -var45, 128);
                                                                if (~arg1 != 0) {
                                                                    class200 var46 = arg8[arg1 & 65535];
                                                                    int var47 = class11.field170;
                                                                    int var48 = class11.field174;
                                                                    if (~var47 < ~(var38 - -var45) && var46.field3945 > 0) {
                                                                        int var49 = (-var45 + var47 - var38) * class193.field3694 / 3;
                                                                        if (~var49 < ~(class193.field3694 * 10)) {
                                                                            var49 = class193.field3694 * 10;
                                                                        }
                                                                        if (~var46.field3945 > ~var49) {
                                                                            var49 = var46.field3945;
                                                                        }
                                                                        var46.field3945 -= var49;
                                                                        class41.field870 += var49;
                                                                        class115.method851(var46, -23101);
                                                                    }
                                                                    if (var48 < var38 - -32 + var45 && var46.field3945 < -var46.field3901 + var46.field3847) {
                                                                        int var50 = (var38 + 32 - var48 + var45) * class193.field3694 / 3;
                                                                        if (var50 > class193.field3694 * 10) {
                                                                            var50 = class193.field3694 * 10;
                                                                        }
                                                                        if (~(var46.field3847 - var46.field3901 + -var46.field3945) > ~var50) {
                                                                            var50 = var46.field3847 - (var46.field3901 - -var46.field3945);
                                                                        }
                                                                        var46.field3945 += var50;
                                                                        class41.field870 -= var50;
                                                                        class115.method851(var46, -23101);
                                                                    }
                                                                }
                                                            } else if (class106.field2107 == var11 && ~class77.field1495 == ~var35) {
                                                                var43.method729(var39, var38, 128);
                                                            } else {
                                                                var43.method704(var39, var38);
                                                            }
                                                        } else {
                                                            class115.method851(var11, -23101);
                                                        }
                                                    }
                                                }
                                                ++var35;
                                            }
                                        }
                                    } else if (var11.field3875 == 3) {
                                        int var52;
                                        if (!class23.method207(var11, 0)) {
                                            var52 = var11.field3843;
                                            if (class209.field4069 == var11 && var11.field3839 != 0) {
                                                var52 = var11.field3839;
                                            }
                                        } else {
                                            var52 = var11.field3865;
                                            if (class209.field4069 == var11 && ~var11.field3909 != -1) {
                                                var52 = var11.field3909;
                                            }
                                        }
                                        if (var13 != 0) {
                                            if (var11.field3932) {
                                                class11.method65(var14, var15, var11.field3881, var11.field3901, var52, -(255 & var13) + 256);
                                            } else {
                                                class11.method75(var14, var15, var11.field3881, var11.field3901, var52, -(255 & var13) + 256);
                                            }
                                        } else if (!var11.field3932) {
                                            class11.method69(var14, var15, var11.field3881, var11.field3901, var52);
                                        } else {
                                            class11.method76(var14, var15, var11.field3881, var11.field3901, var52);
                                        }
                                    } else if (var11.field3875 == 4) {
                                        class33 var53 = var11.method1322(false, class145.field2798);
                                        if (var53 == null) {
                                            if (class76.field1469) {
                                                class115.method851(var11, -23101);
                                            }
                                        } else {
                                            class109 var54 = var11.field3950;
                                            int var55;
                                            if (class23.method207(var11, 0)) {
                                                var55 = var11.field3865;
                                                if (class209.field4069 == var11 && var11.field3909 != 0) {
                                                    var55 = var11.field3909;
                                                }
                                                if (~var11.field3894.method786(-30593) < -1) {
                                                    var54 = var11.field3894;
                                                }
                                            } else {
                                                var55 = var11.field3843;
                                                if (class209.field4069 == var11 && ~var11.field3839 != -1) {
                                                    var55 = var11.field3839;
                                                }
                                            }
                                            if (var11.field3946 && ~var11.field3824 != 0) {
                                                class83 var56 = class128.method926(var11.field3824, -4);
                                                var54 = var56.field1644;
                                                if (var54 == null) {
                                                    var54 = class34.field760;
                                                }
                                                if ((~var56.field1635 == -2 || var11.field3816 != 1) && var11.field3816 != -1) {
                                                    var54 = class36.method279(new class109[] { class79.field1559, var54, class174.field3292, class206.method1349(27, var11.field3816) }, 120);
                                                }
                                            }
                                            if (class159.field2980 == var11) {
                                                var54 = class137.field2651;
                                                var55 = var11.field3843;
                                            }
                                            if (!var11.field3946) {
                                                var54 = class125.method911(var11, 1024, var54);
                                            }
                                            var53.method142(var54, var14, var15, var11.field3881, var11.field3901, var55, !var11.field3910 ? -1 : 0, var11.field3828, var11.field3836, var11.field3942);
                                        }
                                    } else if (~var11.field3875 == -6) {
                                        if (!var11.field3946) {
                                            class100 var57 = var11.method1320(126, class23.method207(var11, 0));
                                            if (var57 != null) {
                                                var57.method704(var14, var15);
                                            } else if (class76.field1469) {
                                                class115.method851(var11, -23101);
                                            }
                                        } else {
                                            class100 var58;
                                            if (var11.field3824 != -1) {
                                                var58 = class14.method91(var11.field3816, var11.field3824, var11.field3927, (byte) 127, var11.field3929, false);
                                            } else {
                                                var58 = var11.method1320(122, false);
                                            }
                                            if (var58 == null) {
                                                if (class76.field1469) {
                                                    class115.method851(var11, -23101);
                                                }
                                            } else {
                                                int var59 = var58.field2012;
                                                int var60 = var58.field2010;
                                                if (!var11.field3845) {
                                                    int var65 = var11.field3881 * 4096 / var59;
                                                    if (var11.field3862 != 0) {
                                                        var58.method726(var11.field3881 / 2 + var14, var11.field3901 / 2 + var15, var11.field3862, var65);
                                                    } else if (~var13 == -1) {
                                                        if (~var11.field3881 == ~var59 && var11.field3901 == var60) {
                                                            var58.method704(var14, var15);
                                                        } else {
                                                            var58.method721(var14, var15, var11.field3881, var11.field3901);
                                                        }
                                                    } else {
                                                        var58.method728(var14, var15, var11.field3881, var11.field3901, -(var13 & 255) + 256);
                                                    }
                                                } else {
                                                    class11.method74(var14, var15, var11.field3881 + var14, var11.field3901 + var15);
                                                    int var61 = (var11.field3881 + -1 + var59) / var59;
                                                    int var62 = (var60 + -1 + var11.field3901) / var60;
                                                    for (int var63 = 0; var61 > var63; ++var63) {
                                                        for (int var64 = 0; ~var64 > ~var62; ++var64) {
                                                            if (var11.field3862 == 0) {
                                                                if (var13 == 0) {
                                                                    var58.method704(var59 * var63 + var14, var15 - -(var60 * var64));
                                                                } else {
                                                                    var58.method729(var14 - -(var59 * var63), var60 * var64 + var15, -(255 & var13) + 256);
                                                                }
                                                            } else {
                                                                var58.method726(var59 / 2 + var59 * var63 + var14, var60 / 2 + var60 * var64 + var15, var11.field3862, 4096);
                                                            }
                                                        }
                                                    }
                                                    class11.method71(arg9, arg0, arg7, arg2);
                                                }
                                            }
                                        }
                                    } else if (var11.field3875 == 6) {
                                        boolean var66 = class23.method207(var11, 0);
                                        class189 var67 = null;
                                        int var68;
                                        if (!var66) {
                                            var68 = var11.field3896;
                                        } else {
                                            var68 = var11.field3857;
                                        }
                                        int var69 = 0;
                                        if (var11.field3824 == -1) {
                                            if (~var11.field3897 == -6) {
                                                if (var11.field3931 != -1) {
                                                    int var70 = 2047 & var11.field3931;
                                                    if (class59.field1168 == var70) {
                                                        var70 = 2047;
                                                    }
                                                    class184 var71 = class202.field3975[var70];
                                                    class20 var72 = var68 != -1 ? client.method246(12, var68) : null;
                                                    if (var71 != null && (int) var71.field3455.method784(false) << 11 == (-2048 & var11.field3931)) {
                                                        var67 = var71.field3486.method102(0, var11.field3939, var72, (class20) null, (byte) 48);
                                                    }
                                                } else {
                                                    var67 = class144.field2773.method102(-1, -1, (class20) null, (class20) null, (byte) 48);
                                                }
                                            } else if (~var68 == 0) {
                                                var67 = var11.method1313(var66, -1, class157.field2955.field3486, (byte) 124, (class20) null);
                                                if (var67 == null && class76.field1469) {
                                                    class115.method851(var11, -23101);
                                                }
                                            } else {
                                                class20 var73 = client.method246(12, var68);
                                                var67 = var11.method1313(var66, var11.field3939, class157.field2955.field3486, (byte) 101, var73);
                                                if (var67 == null && class76.field1469) {
                                                    class115.method851(var11, -23101);
                                                }
                                            }
                                        } else {
                                            class83 var74 = class128.method926(var11.field3824, -4);
                                            if (var74 != null) {
                                                class83 var75 = var74.method523(var11.field3816, 10);
                                                var67 = var75.method524(-83, (class20) null, 0, 1);
                                                if (var67 == null) {
                                                    class115.method851(var11, -23101);
                                                } else {
                                                    var67.method1274();
                                                    var69 = -var67.field1945 / 2;
                                                }
                                            }
                                        }
                                        if (var67 != null) {
                                            class124.method905(var11.field3881 / 2 + var11.field3823 + var14, var11.field3901 / 2 + var15 + var11.field3867);
                                            int var76 = class124.field2383[var11.field3873] * var11.field3912 >> 16;
                                            int var77 = class124.field2387[var11.field3873] * var11.field3912 >> 16;
                                            if (var11.field3946) {
                                                if (var11.field3853) {
                                                    var67.method430(0, var11.field3893, var11.field3907, var11.field3873, var11.field3877, var69 + var76 + var11.field3856, var11.field3856 + var77, var11.field3912);
                                                } else {
                                                    var67.method423(0, var11.field3893, var11.field3907, var11.field3873, var11.field3877, var69 + var76 + var11.field3856, var77 - -var11.field3856);
                                                }
                                            } else {
                                                var67.method423(0, var11.field3893, 0, var11.field3873, 0, var76, var77);
                                            }
                                            class124.method900();
                                        }
                                    } else {
                                        if (var11.field3875 == 7) {
                                            class33 var78 = var11.method1322(false, class145.field2798);
                                            if (var78 == null) {
                                                if (class76.field1469) {
                                                    class115.method851(var11, -23101);
                                                }
                                                continue;
                                            }
                                            int var79 = 0;
                                            for (int var80 = 0; ~var80 > ~var11.field3901; ++var80) {
                                                for (int var81 = 0; ~var11.field3881 < ~var81; ++var81) {
                                                    if (~var11.field3925[var79] < -1) {
                                                        class83 var82 = class128.method926(var11.field3925[var79] + -1, -4);
                                                        class109 var83;
                                                        if (var82.field1635 != 1 && ~var11.field3913[var79] == -2) {
                                                            var83 = class36.method279(new class109[] { class79.field1559, var82.field1644, class72.field1402 }, 118);
                                                        } else {
                                                            var83 = class36.method279(new class109[] { class79.field1559, var82.field1644, class174.field3292, class206.method1349(117, var11.field3913[var79]) }, -21);
                                                        }
                                                        int var84 = (12 - -var11.field3948) * var80 + var15;
                                                        int var85 = (var11.field3827 + 115) * var81 + var14;
                                                        if (~var11.field3828 != -1) {
                                                            if (~var11.field3828 != -2) {
                                                                var78.method129(var83, var11.field3881 + var85 + -1, var84, var11.field3843, !var11.field3910 ? -1 : 0);
                                                            } else {
                                                                var78.method140(var83, var85 - -(var11.field3881 / 2), var84, var11.field3843, !var11.field3910 ? -1 : 0);
                                                            }
                                                        } else {
                                                            var78.method119(var83, var85, var84, var11.field3843, !var11.field3910 ? -1 : 0);
                                                        }
                                                    }
                                                    ++var79;
                                                }
                                            }
                                        }
                                        if (~var11.field3875 == -9 && class92.field1889 == var11 && ~class185.field3524 == ~class174.field3294) {
                                            int var86 = 0;
                                            int var87 = 0;
                                            class33 var88 = class92.field1891;
                                            class109 var89 = var11.field3950;
                                            class109 var90 = class125.method911(var11, 1024, var89);
                                            while (var90.method786(-30593) > 0) {
                                                int var98 = var90.method799(class210.field4092, 87);
                                                class109 var99;
                                                if (~var98 != 0) {
                                                    var99 = var90.method794(var98, 0, 73);
                                                    var90 = var90.method798(-41, var98 - -4);
                                                } else {
                                                    var99 = var90;
                                                    var90 = class174.field3306;
                                                }
                                                int var100 = var88.method123(var99);
                                                var87 += var88.field326 + 1;
                                                if (~var100 < ~var86) {
                                                    var86 = var100;
                                                }
                                            }
                                            var87 += 7;
                                            var86 += 6;
                                            int var91 = var11.field3881 + -5 + -var86 + var14;
                                            int var92 = var15 + 5 - -var11.field3901;
                                            if (~(var87 + var92) < ~arg2) {
                                                var92 = -var87 + arg2;
                                            }
                                            if (~(var14 + 5) < ~var91) {
                                                var91 = var14 - -5;
                                            }
                                            if (~arg7 > ~(var86 + var91)) {
                                                var91 = -var86 + arg7;
                                            }
                                            class11.method76(var91, var92, var86, var87, 16777120);
                                            class11.method69(var91, var92, var86, var87, 0);
                                            int var93 = var88.field326 + var92 + 2;
                                            class109 var94 = var11.field3950;
                                            class109 var95 = class125.method911(var11, 1024, var94);
                                            while (var95.method786(-30593) > 0) {
                                                int var96 = var95.method799(class210.field4092, 116);
                                                class109 var97;
                                                if (var96 != -1) {
                                                    var97 = var95.method794(var96, 0, 49);
                                                    var95 = var95.method798(-41, var96 + 4);
                                                } else {
                                                    var97 = var95;
                                                    var95 = class174.field3306;
                                                }
                                                var88.method119(var97, var91 + 3, var93, 0, -1);
                                                var93 += var88.field326 + 1;
                                            }
                                        }
                                        if (var11.field3875 == 9) {
                                            if (var11.field3938 == 1) {
                                                class11.method63(var14, var15, var11.field3881 + var14, var11.field3901 + var15, var11.field3843);
                                            } else {
                                                int var101 = var11.field3901 < 0 ? -var11.field3901 : var11.field3901;
                                                int var102 = var11.field3881 >= 0 ? var11.field3881 : -var11.field3881;
                                                int var103 = var102;
                                                if (var101 > var102) {
                                                    var103 = var101;
                                                }
                                                if (var103 != 0) {
                                                    int var104 = (var11.field3881 << 16) / var103;
                                                    int var105 = (var11.field3901 << 16) / var103;
                                                    if (var104 >= var105) {
                                                        var104 = -var104;
                                                    } else {
                                                        var105 = -var105;
                                                    }
                                                    int var106 = var11.field3938 * var105 >> 17;
                                                    int var107 = var11.field3938 * var105 - -1 >> 17;
                                                    int var108 = var11.field3938 * var104 >> 17;
                                                    int var109 = var11.field3938 * var104 + 1 >> 17;
                                                    int var110 = -arg9 + var14;
                                                    int var111 = -var107 + var110 - -var11.field3881;
                                                    int var112 = var106 + var110;
                                                    int var113 = -arg0 + var15;
                                                    int var114 = var11.field3881 + var110 + var106;
                                                    int var115 = var108 + var113;
                                                    int var116 = -var107 + var110;
                                                    int var117 = -var109 + var113;
                                                    int var118 = var11.field3901 - var109 + var113;
                                                    int var119 = var108 + var113 + var11.field3901;
                                                    class124.method898(var112, var116, var111);
                                                    class124.method894(var115, var117, var118, var112, var116, var111, var11.field3843);
                                                    class124.method898(var112, var111, var114);
                                                    class124.method894(var115, var118, var119, var112, var111, var114, var11.field3843);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
