import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class161 {

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Lsf;")
    public static class108 field2884 = class140.method973(255, ":duelstake:");

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Lsf;")
    public static class108 field2887 = class140.method973(255, "M-Bmoire attribu-Be");

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lik;")
    public static class262 field2889;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIII[Lca;II)V", line = 13)
    public static final void method1114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class98[] arg7, int arg8, int arg9) {
        if (class231.field4051) {
            class50.method345(arg4, arg8, arg5, arg3);
        } else {
            class28.method185(arg4, arg8, arg5, arg3);
            class263.method1913();
        }
        if (arg6 != -5) {
            field2889 = (class262) null;
        }
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class98 var11 = arg7[var10];
            if (var11 != null && (var11.field1611 == arg2 || arg2 == -1412584499 && class272.field4776 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class39.field545[class273.field4806] = var11.field1730 + arg1;
                    class242.field4216[class273.field4806] = var11.field1590 + arg9;
                    class26.field399[class273.field4806] = var11.field1673;
                    class313.field5409[class273.field4806] = var11.field1688;
                    var12 = class273.field4806++;
                } else {
                    var12 = arg0;
                }
                var11.field1630 = class116.field2000;
                var11.field1653 = var12;
                if (!var11.field1640 || !client.method1817(var11)) {
                    if (var11.field1698 > 0) {
                        class136.method936(var11, (byte) -16);
                    }
                    int var13 = var11.field1590 + arg9;
                    int var14 = var11.field1730 + arg1;
                    int var15 = var11.field1655;
                    if (class46.field673 && (client.method1815(var11) != 0 || var11.field1677 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class272.field4776 == var11) {
                        if (arg2 != -1412584499 && !var11.field1619) {
                            class282.field4938 = arg1;
                            class14.field186 = arg7;
                            class259.field4570 = arg9;
                            continue;
                        }
                        if (!var11.field1619) {
                            var15 = 128;
                        }
                        if (class311.field5385 && class54.field797) {
                            int var16 = class171.field3116;
                            int var17 = class317.field5456;
                            int var18 = var17 - class206.field3692;
                            if (class239.field4165 > var18) {
                                var18 = class239.field4165;
                            }
                            int var19 = var16 - class286.field5009;
                            if (class42.field558 > var19) {
                                var19 = class42.field558;
                            }
                            if (var11.field1673 + var18 > class239.field4165 + class209.field3736.field1673) {
                                var18 = class239.field4165 + class209.field3736.field1673 - var11.field1673;
                            }
                            if ((class42.field558 + class209.field3736.field1688) < (var11.field1688 + var19)) {
                                var19 = class42.field558 + class209.field3736.field1688 - var11.field1688;
                            }
                            var13 = var19;
                            var14 = var18;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1677 == 2) {
                        var20 = arg8;
                        var21 = arg4;
                        var22 = arg3;
                        var23 = arg5;
                    } else {
                        var21 = var14 > arg4 ? var14 : arg4;
                        var20 = var13 > arg8 ? var13 : arg8;
                        int var24 = var13 + var11.field1688;
                        int var25 = var11.field1673 + var14;
                        if (var11.field1677 == 9) {
                            var25++;
                            var24++;
                        }
                        var22 = var24 >= arg3 ? arg3 : var24;
                        var23 = var25 < arg5 ? var25 : arg5;
                    }
                    if (!var11.field1640 || var23 > var21 && var20 < var22) {
                        if (var11.field1698 != 0) {
                            if (var11.field1698 == 1337 || var11.field1698 == 1403 && class231.field4051) {
                                class157.field2838 = var14;
                                class39.field548 = var13;
                                class122.field2086 = var11;
                                class163.method1128(var11.field1698 == 1403, arg6 + 5, var14, var11.field1688, var13, var11.field1673);
                                if (class231.field4051) {
                                    class50.method345(arg4, arg8, arg5, arg3);
                                } else {
                                    class28.method185(arg4, arg8, arg5, arg3);
                                }
                                continue;
                            }
                            if (var11.field1698 == 1338) {
                                if (!var11.method667((byte) -117)) {
                                    continue;
                                }
                                class98.method663(var13, (byte) 126, var14, var11, var12);
                                if (class231.field4051) {
                                    class50.method345(arg4, arg8, arg5, arg3);
                                } else {
                                    class28.method185(arg4, arg8, arg5, arg3);
                                }
                                if (class157.field2836 != 0 && class157.field2836 != 3 || class62.field989 || var21 > class184.field3382 || var20 > class195.field3537 || var23 <= class184.field3382 || class195.field3537 >= var22) {
                                    continue;
                                }
                                int var41 = class195.field3537 - var13;
                                int var42 = var11.field1618[var41];
                                int var43 = class184.field3382 - var14;
                                if (var42 > var43 || (var11.field1709[var41] + var42) < var43) {
                                    continue;
                                }
                                int var44 = var41 - var11.field1688 / 2;
                                int var45 = class328.field5609 + class186.field3423 & 0x7FF;
                                int var46 = var43 - var11.field1673 / 2;
                                int var47 = class263.field4653[var45];
                                int var48 = class263.field4649[var45];
                                int var49 = (class272.field4775 + 256) * var48 >> 8;
                                int var50 = (class272.field4775 + 256) * var47 >> 8;
                                int var51 = var44 * var49 - (var46 * var50) >> 11;
                                int var52 = var44 * var50 + var46 * var49 >> 11;
                                int var53 = class95.field1513.field4452 + var52 >> 7;
                                int var54 = class95.field1513.field4457 - var51 >> 7;
                                if (class172.field3132 && (class21.field324 & 0x40) != 0) {
                                    class98 var55 = class45.method324(class218.field3873, class163.field2927, (byte) 77);
                                    if (var55 == null) {
                                        class307.method2152(1);
                                    } else {
                                        class62.method428(var53, -120, class72.field1103, class173.field3164, 1L, (short) 10, var54);
                                    }
                                    continue;
                                }
                                if (class223.field3947 == 1) {
                                    class62.method428(var53, -123, class322.field5514, class63.field1016, 1L, (short) 23, var54);
                                }
                                class62.method428(var53, -122, class236.field4143, class63.field1016, 1L, (short) 17, var54);
                                continue;
                            }
                            if (var11.field1698 == 1339) {
                                if (var11.method667((byte) 33)) {
                                    class55.method385(var11, var12, arg6 - 88, var14, var13);
                                    if (class231.field4051) {
                                        class50.method345(arg4, arg8, arg5, arg3);
                                    } else {
                                        class28.method185(arg4, arg8, arg5, arg3);
                                    }
                                }
                                continue;
                            }
                            if (var11.field1698 == 1400) {
                                class170.method1178(var13, var11.field1673, var14, var11.field1688, arg6 + 110);
                                class47.field692[var12] = true;
                                class280.field4910[var12] = true;
                                if (class231.field4051) {
                                    class50.method345(arg4, arg8, arg5, arg3);
                                } else {
                                    class28.method185(arg4, arg8, arg5, arg3);
                                }
                                continue;
                            }
                            if (var11.field1698 == 1401) {
                                class29.method206(var13, 11797, var11.field1673, var11.field1688, var14);
                                class47.field692[var12] = true;
                                class280.field4910[var12] = true;
                                if (class231.field4051) {
                                    class50.method345(arg4, arg8, arg5, arg3);
                                } else {
                                    class28.method185(arg4, arg8, arg5, arg3);
                                }
                                continue;
                            }
                            if (var11.field1698 == 1402) {
                                if (!class231.field4051) {
                                    class54.method378(var13, -256, var14);
                                    class47.field692[var12] = true;
                                    class280.field4910[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field1698 == 1405) {
                                if (!class55.field804) {
                                    continue;
                                }
                                int var26 = var11.field1673 + var14;
                                int var27 = var13 + 15;
                                class158.field2850.method526(class117.method833(new class108[] { class90.field1424, class79.method518(false, class160.field2876) }, false), var26, var27, 16776960, -1);
                                int var141 = var27 + 15;
                                Runtime var28 = Runtime.getRuntime();
                                int var29 = 16776960;
                                int var30 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                if (var30 > 65536) {
                                    var29 = 16711680;
                                }
                                class158.field2850.method526(class117.method833(new class108[] { class94.field1508, class79.method518(false, var30), class103.field1800 }, false), var26, var141, var29, -1);
                                var27 = var141 + 15;
                                if (class231.field4051) {
                                    int var31 = 16776960;
                                    int var32 = (class124.field2101 + class124.field2100 + class124.field2103) / 1024;
                                    if (var32 > 65536) {
                                        var31 = 16711680;
                                    }
                                    class158.field2850.method526(class117.method833(new class108[] { class276.field4830, class79.method518(false, var32), class103.field1800 }, false), var26, var27, var31, -1);
                                    var27 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 28; var37++) {
                                    var34 += class201.field3641[var37].method1998((byte) 81);
                                    var35 += class201.field3641[var37].method2000(arg6 ^ 0x10B8);
                                    var36 += class201.field3641[var37].method1994(-67);
                                }
                                int var38 = var36 * 100 / var34;
                                int var39 = var35 * 10000 / var34;
                                class108 var40 = class117.method833(new class108[] { class2.field46, class17.method113(true, (long) var39, 2, 0, (byte) 44), class252.field4397, class79.method518(false, var38), class114.field1979 }, false);
                                class223.field3953.method526(var40, var26, var27, var33, -1);
                                var27 += 12;
                                if (class165.field2940 > 0) {
                                    class223.field3953.method526(class117.method833(new class108[] { class132.field2265, class79.method518(false, class165.field2941), class9.field106, class79.method518(false, class165.field2940) }, false), var26, var27, var33, -1);
                                }
                                var27 += 12;
                                class47.field692[var12] = true;
                                class280.field4910[var12] = true;
                                continue;
                            }
                            if (var11.field1698 == 1406) {
                                class27.field417 = var11;
                                class298.field5183 = var13;
                                class151.field2742 = var14;
                                continue;
                            }
                        }
                        if (!class62.field989) {
                            if (var11.field1677 == 0 && var11.field1716 && var21 <= class184.field3382 && var20 <= class195.field3537 && class184.field3382 < var23 && class195.field3537 < var22 && !class46.field673) {
                                class311.field5374 = 1;
                                class305.field5299[0] = 1007;
                                class186.field3411[0] = class55.field807;
                                class317.field5454[0] = class63.field1016;
                            }
                            if (class184.field3382 >= var21 && var20 <= class195.field3537 && var23 > class184.field3382 && class195.field3537 < var22) {
                                class143.method991((byte) -123, class195.field3537 - var13, -var14 + class184.field3382, var11);
                            }
                        }
                        if (var11.field1677 == 0) {
                            if (!var11.field1640 && client.method1817(var11) && class60.field967 != var11) {
                                continue;
                            }
                            if (!var11.field1640) {
                                if ((var11.field1703 - var11.field1688) < var11.field1701) {
                                    var11.field1701 = var11.field1703 - var11.field1688;
                                }
                                if (var11.field1701 < 0) {
                                    var11.field1701 = 0;
                                }
                            }
                            method1114(var12, var14 - var11.field1597, var11.field1649, var22, var21, var23, -5, arg7, var20, var13 - var11.field1701);
                            if (var11.field1636 != null) {
                                method1114(var12, var14 - var11.field1597, var11.field1649, var22, var21, var23, -5, var11.field1636, var20, var13 - var11.field1701);
                            }
                            class158 var56 = (class158) class191.field3456.method1676((long) var11.field1649, (byte) -76);
                            if (var56 != null) {
                                if (var56.field2848 == 0 && !class62.field989 && class184.field3382 >= var21 && class195.field3537 >= var20 && var23 > class184.field3382 && var22 > class195.field3537 && !class46.field673) {
                                    class186.field3411[0] = class55.field807;
                                    class311.field5374 = 1;
                                    class317.field5454[0] = class63.field1016;
                                    class305.field5299[0] = 1007;
                                }
                                class280.method2017(var56.field2845, var23, var20, var12, var22, 8619, var14, var13, var21);
                            }
                            if (class231.field4051) {
                                class50.method345(arg4, arg8, arg5, arg3);
                            } else {
                                class28.method185(arg4, arg8, arg5, arg3);
                                class263.method1913();
                            }
                        }
                        if (class183.field3366[var12] || class140.field2465 > 1) {
                            if (var11.field1677 == 0 && !var11.field1640 && var11.field1703 > var11.field1688) {
                                class187.method1340(var13, var11.field1673 + var14, var11.field1701, var11.field1688, var11.field1703, arg6 ^ 0xFFFFFFF4);
                            }
                            if (var11.field1677 != 1) {
                                if (var11.field1677 == 2) {
                                    int var124 = 0;
                                    for (int var125 = 0; var125 < var11.field1648; var125++) {
                                        for (int var126 = 0; var126 < var11.field1733; var126++) {
                                            int var127 = (var11.field1652 + 32) * var126 + var14;
                                            int var128 = var13 + ((var11.field1564 + 32) * var125);
                                            if (var124 < 20) {
                                                var128 += var11.field1706[var124];
                                                var127 += var11.field1725[var124];
                                            }
                                            if (var11.field1575[var124] > 0) {
                                                boolean var129 = false;
                                                int var130 = var11.field1575[var124] - 1;
                                                boolean var131 = false;
                                                if (arg4 < (var127 + 32) && arg5 > var127 && var128 + 32 > arg8 && arg3 > var128 || class295.field5151 == var11 && class236.field4141 == var124) {
                                                    class135 var132;
                                                    if (class84.field1347 == 1 && class14.field160 == var124 && class132.field2262 == var11.field1649) {
                                                        var132 = class289.method2070(arg6 ^ 0x1, var11.field1734, var11.field1671[var124], var130, 2, 0);
                                                    } else {
                                                        var132 = class289.method2070(-48, var11.field1734, var11.field1671[var124], var130, 1, 3153952);
                                                    }
                                                    if (class263.field4659) {
                                                        class47.field692[var12] = true;
                                                    }
                                                    if (var132 == null) {
                                                        class195.method1388(arg6 - 77, var11);
                                                    } else if (class295.field5151 == var11 && class236.field4141 == var124) {
                                                        int var133 = class317.field5456 - class129.field2194;
                                                        if (var133 < 5 && var133 > -5) {
                                                            var133 = 0;
                                                        }
                                                        int var134 = class171.field3116 - class29.field441;
                                                        if (var134 < 5 && var134 > -5) {
                                                            var134 = 0;
                                                        }
                                                        if (class136.field2411 < 5) {
                                                            var134 = 0;
                                                            var133 = 0;
                                                        }
                                                        var132.method61(var127 + var133, var128 - -var134, 128);
                                                        if (arg2 != -1) {
                                                            class98 var135 = arg7[arg2 & 0xFFFF];
                                                            int var136;
                                                            int var137;
                                                            if (class231.field4051) {
                                                                var136 = class50.field715;
                                                                var137 = class50.field719;
                                                            } else {
                                                                var136 = class28.field421;
                                                                var137 = class28.field425;
                                                            }
                                                            if (var137 > var128 + var134 && var135.field1701 > 0) {
                                                                int var138 = (var137 - var128 - var134) * class195.field3534 / 3;
                                                                if ((class195.field3534 * 10) < var138) {
                                                                    var138 = class195.field3534 * 10;
                                                                }
                                                                if (var138 > var135.field1701) {
                                                                    var138 = var135.field1701;
                                                                }
                                                                var135.field1701 -= var138;
                                                                class29.field441 += var138;
                                                                class195.method1388(-82, var135);
                                                            }
                                                            if (var128 + var134 + 32 > var136 && var135.field1703 - var135.field1688 > var135.field1701) {
                                                                int var139 = (var128 - (-var134 - 32) - var136) * class195.field3534 / 3;
                                                                if (class195.field3534 * 10 < var139) {
                                                                    var139 = class195.field3534 * 10;
                                                                }
                                                                if (var139 > (var135.field1703 - var135.field1688 - var135.field1701)) {
                                                                    var139 = var135.field1703 - var135.field1688 - var135.field1701;
                                                                }
                                                                class29.field441 -= var139;
                                                                var135.field1701 += var139;
                                                                class195.method1388(-82, var135);
                                                            }
                                                        }
                                                    } else if (class249.field4321 == var11 && class63.field1020 == var124) {
                                                        var132.method61(var127, var128, 128);
                                                    } else {
                                                        var132.method81(var127, var128);
                                                    }
                                                }
                                            } else if (var11.field1670 != null && var124 < 20) {
                                                class135 var140 = var11.method666(var124, (byte) 98);
                                                if (var140 != null) {
                                                    var140.method81(var127, var128);
                                                } else if (class237.field4154) {
                                                    class195.method1388(-82, var11);
                                                }
                                            }
                                            var124++;
                                        }
                                    }
                                } else if (var11.field1677 == 3) {
                                    int var123;
                                    if (class288.method2057(var11, (byte) 97)) {
                                        var123 = var11.field1678;
                                        if (class60.field967 == var11 && var11.field1694 != 0) {
                                            var123 = var11.field1694;
                                        }
                                    } else {
                                        var123 = var11.field1573;
                                        if (class60.field967 == var11 && var11.field1607 != 0) {
                                            var123 = var11.field1607;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1610) {
                                            if (class231.field4051) {
                                                class50.method348(var14, var13, var11.field1673, var11.field1688, var123);
                                            } else {
                                                class28.method193(var14, var13, var11.field1673, var11.field1688, var123);
                                            }
                                        } else if (class231.field4051) {
                                            class50.method353(var14, var13, var11.field1673, var11.field1688, var123);
                                        } else {
                                            class28.method183(var14, var13, var11.field1673, var11.field1688, var123);
                                        }
                                    } else if (var11.field1610) {
                                        if (class231.field4051) {
                                            class50.method357(var14, var13, var11.field1673, var11.field1688, var123, 256 - (var15 & 0xFF));
                                        } else {
                                            class28.method186(var14, var13, var11.field1673, var11.field1688, var123, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class231.field4051) {
                                        class50.method356(var14, var13, var11.field1673, var11.field1688, var123, 256 - (var15 & 0xFF));
                                    } else {
                                        class28.method179(var14, var13, var11.field1673, var11.field1688, var123, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1677 == 4) {
                                    class80 var57 = var11.method671((byte) 103, class157.field2831);
                                    if (var57 != null) {
                                        class108 var58 = var11.field1604;
                                        int var59;
                                        if (class288.method2057(var11, (byte) -82)) {
                                            var59 = var11.field1678;
                                            if (class60.field967 == var11 && var11.field1694 != 0) {
                                                var59 = var11.field1694;
                                            }
                                            if (var11.field1617.method776(0) > 0) {
                                                var58 = var11.field1617;
                                            }
                                        } else {
                                            var59 = var11.field1573;
                                            if (class60.field967 == var11 && var11.field1607 != 0) {
                                                var59 = var11.field1607;
                                            }
                                        }
                                        if (var11.field1640 && var11.field1614 != -1) {
                                            class145 var60 = class144.method994(true, var11.field1614);
                                            var58 = var60.field2610;
                                            if (var58 == null) {
                                                var58 = class120.field2053;
                                            }
                                            if ((var60.field2615 == 1 || var11.field1682 != 1) && var11.field1682 != -1) {
                                                var58 = class117.method833(new class108[] { class320.field5486, var58, class144.field2535, class114.method809(-126, var11.field1682) }, false);
                                            }
                                        }
                                        if (class175.field3197 == var11) {
                                            var59 = var11.field1573;
                                            var58 = class132.field2268;
                                        }
                                        if (!var11.field1640) {
                                            var58 = class119.method836(var11, (byte) 77, var58);
                                        }
                                        var57.method531(var58, var14, var13, var11.field1673, var11.field1688, var59, var11.field1663 ? 0 : -1, var11.field1568, var11.field1592, var11.field1599);
                                    } else if (class237.field4154) {
                                        class195.method1388(-82, var11);
                                    }
                                } else if (var11.field1677 == 5) {
                                    if (var11.field1640) {
                                        class135 var62;
                                        if (var11.field1614 == -1) {
                                            var62 = var11.method665(false, (byte) 53);
                                        } else {
                                            var62 = class289.method2070(4, var11.field1734, var11.field1682, var11.field1614, var11.field1700, var11.field1687);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field2342;
                                            int var64 = var62.field2336;
                                            if (var11.field1705) {
                                                int var65 = (var11.field1673 + var63 - 1) / var63;
                                                int var66 = (var11.field1688 - (1 - var64)) / var64;
                                                if (class231.field4051) {
                                                    class50.method350(var14, var13, var11.field1673 + var14, var11.field1688 + var13);
                                                    boolean var69 = class36.method249(var62.field2347, 32768);
                                                    class49 var70 = (class49) var62;
                                                    boolean var71 = class36.method249(var62.field2329, 32768);
                                                    if (var69 && var71) {
                                                        if (var15 == 0) {
                                                            var70.method342(var14, var13, var65, var66);
                                                        } else {
                                                            var70.method340(var14, var13, 256 - (var15 & 0xFF), var65, var66);
                                                        }
                                                    } else if (var69) {
                                                        for (int var72 = 0; var72 < var66; var72++) {
                                                            if (var15 == 0) {
                                                                var70.method342(var14, var64 * var72 + var13, var65, 1);
                                                            } else {
                                                                var70.method340(var14, var64 * var72 + var13, 256 - (var15 & 0xFF), var65, 1);
                                                            }
                                                        }
                                                    } else if (var71) {
                                                        for (int var75 = 0; var75 < var65; var75++) {
                                                            if (var15 == 0) {
                                                                var70.method342(var63 * var75 + var14, var13, 1, var66);
                                                            } else {
                                                                var70.method340(var63 * var75 + var14, var13, 256 - (var15 & 0xFF), 1, var66);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var73 = 0; var73 < var65; var73++) {
                                                            for (int var74 = 0; var74 < var66; var74++) {
                                                                if (var15 == 0) {
                                                                    var62.method81(var63 * var73 + var14, var64 * var74 + var13);
                                                                } else {
                                                                    var62.method61(var63 * var73 + var14, var13 - -(var64 * var74), 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class50.method345(arg4, arg8, arg5, arg3);
                                                } else {
                                                    class28.method180(var14, var13, var14 + var11.field1673, var11.field1688 + var13);
                                                    for (int var67 = 0; var67 < var65; var67++) {
                                                        for (int var68 = 0; var68 < var66; var68++) {
                                                            if (var11.field1586 != 0) {
                                                                var62.method922(var63 / 2 + var63 * var67 + var14, arg6 + -53, var11.field1586, 4096, var64 * var68 + var64 / 2 + var13);
                                                            } else if (var15 == 0) {
                                                                var62.method81(var14 + (var63 * var67), var64 * var68 + var13);
                                                            } else {
                                                                var62.method61(var63 * var67 + var14, var64 * var68 + var13, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class28.method185(arg4, arg8, arg5, arg3);
                                                }
                                            } else {
                                                int var76 = var11.field1673 * 4096 / var63;
                                                if (var11.field1586 != 0) {
                                                    var62.method922(var14 + (var11.field1673 / 2), -99, var11.field1586, var76, var11.field1688 / 2 + var13);
                                                } else if (var15 != 0) {
                                                    var62.method63(var14, var13, var11.field1673, var11.field1688, 256 - (var15 & 0xFF));
                                                } else if (var11.field1673 == var63 && var11.field1688 == var64) {
                                                    var62.method81(var14, var13);
                                                } else {
                                                    var62.method72(var14, var13, var11.field1673, var11.field1688);
                                                }
                                            }
                                        } else if (class237.field4154) {
                                            class195.method1388(-82, var11);
                                        }
                                    } else {
                                        class135 var61 = var11.method665(class288.method2057(var11, (byte) 104), (byte) 53);
                                        if (var61 != null) {
                                            var61.method81(var14, var13);
                                        } else if (class237.field4154) {
                                            class195.method1388(-82, var11);
                                        }
                                    }
                                } else if (var11.field1677 == 6) {
                                    boolean var104 = class288.method2057(var11, (byte) 121);
                                    int var105;
                                    if (var104) {
                                        var105 = var11.field1629;
                                    } else {
                                        var105 = var11.field1580;
                                    }
                                    class113 var106 = null;
                                    int var107 = 0;
                                    if (var11.field1614 != -1) {
                                        class145 var112 = class144.method994(true, var11.field1614);
                                        if (var112 != null) {
                                            class145 var113 = var112.method1000(var11.field1682, (byte) -52);
                                            class272 var114 = var105 == -1 ? null : class149.method1063(var105, -18767);
                                            var106 = var113.method1008(-114, var11.field1675, var114, 1);
                                            if (var106 == null) {
                                                class195.method1388(-82, var11);
                                            } else {
                                                var107 = -var106.method95() / 2;
                                            }
                                        }
                                    } else if (var11.field1577 == 5) {
                                        if (var11.field1664 == -1) {
                                            var106 = class143.field2514.method1666((class272) null, -1, arg6 + 4, true, -1, (class272) null);
                                        } else {
                                            int var108 = var11.field1664 & 0x7FF;
                                            if (class185.field3409 == var108) {
                                                var108 = 2047;
                                            }
                                            class51 var109 = class96.field1558[var108];
                                            class272 var110 = var105 == -1 ? null : class149.method1063(var105, -18767);
                                            if (var109 != null && (int) var109.field757.method743(false) << 11 == (var11.field1664 & 0xFFFFF800)) {
                                                var106 = var109.field721.method1666((class272) null, var11.field1675, -1, true, 0, var110);
                                            }
                                        }
                                    } else if (var105 == -1) {
                                        var106 = var11.method672(-1, var104, (class272) null, -125, class95.field1513.field721);
                                        if (var106 == null && class237.field4154) {
                                            class195.method1388(-82, var11);
                                        }
                                    } else {
                                        class272 var111 = class149.method1063(var105, -18767);
                                        var106 = var11.method672(var11.field1675, var104, var111, -45, class95.field1513.field721);
                                        if (var106 == null && class237.field4154) {
                                            class195.method1388(-82, var11);
                                        }
                                    }
                                    if (var106 != null) {
                                        int var115;
                                        if (var11.field1609 <= 0) {
                                            var115 = 256;
                                        } else {
                                            var115 = (var11.field1673 << 8) / var11.field1609;
                                        }
                                        int var116;
                                        if (var11.field1722 > 0) {
                                            var116 = (var11.field1688 << 8) / var11.field1722;
                                        } else {
                                            var116 = 256;
                                        }
                                        int var117 = (var11.field1578 * var116 >> 8) + var11.field1688 / 2 + var13;
                                        int var118 = var11.field1673 / 2 + (var11.field1596 * var115 >> 8) + var14;
                                        if (class231.field4051) {
                                            if (var11.field1602) {
                                                class231.method1605(var118, var117, var11.field1712, var11.field1601, var115, var116);
                                            } else {
                                                class231.method1579(var118, var117, var115, var116);
                                                class231.method1593((float) var11.field1589, (float) var11.field1601 * 1.5F);
                                            }
                                            class231.method1600();
                                            class231.method1604(true);
                                            class231.method1574(false);
                                            class130.method892((byte) -26, class269.field4716);
                                            if (class98.field1735) {
                                                class50.method351();
                                                class231.method1596();
                                                class50.method345(arg4, arg8, arg5, arg3);
                                                class98.field1735 = false;
                                            }
                                            if (var11.field1723) {
                                                class231.method1591();
                                            }
                                            int var119 = class263.field4653[var11.field1672] * var11.field1712 >> 16;
                                            int var120 = class263.field4649[var11.field1672] * var11.field1712 >> 16;
                                            if (var11.field1640) {
                                                var106.method305(0, var11.field1708, var11.field1646, var11.field1672, var11.field1666, var107 + var119 + var11.field1711, var11.field1711 + var120, -1L);
                                            } else {
                                                var106.method305(0, var11.field1708, 0, var11.field1672, 0, var119, var120, -1L);
                                            }
                                            if (var11.field1723) {
                                                class231.method1570();
                                            }
                                        } else {
                                            class263.method1904(var118, var117);
                                            int var121 = class263.field4649[var11.field1672] * var11.field1712 >> 16;
                                            int var122 = class263.field4653[var11.field1672] * var11.field1712 >> 16;
                                            if (!var11.field1640) {
                                                var106.method305(0, var11.field1708, 0, var11.field1672, 0, var122, var121, -1L);
                                            } else if (var11.field1602) {
                                                ((class44) var106).method283(0, var11.field1708, var11.field1646, var11.field1672, var11.field1666, var107 + var122 + var11.field1711, var11.field1711 + var121, var11.field1712);
                                            } else {
                                                var106.method305(0, var11.field1708, var11.field1646, var11.field1672, var11.field1666, var11.field1711 + var107 + var122, var11.field1711 + var121, -1L);
                                            }
                                            class263.method1894();
                                        }
                                    }
                                } else {
                                    if (var11.field1677 == 7) {
                                        class80 var77 = var11.method671((byte) 103, class157.field2831);
                                        if (var77 == null) {
                                            if (class237.field4154) {
                                                class195.method1388(arg6 ^ 0x55, var11);
                                            }
                                            continue;
                                        }
                                        int var78 = 0;
                                        for (int var79 = 0; var79 < var11.field1648; var79++) {
                                            for (int var80 = 0; var80 < var11.field1733; var80++) {
                                                if (var11.field1575[var78] > 0) {
                                                    class145 var81 = class144.method994(true, var11.field1575[var78] - 1);
                                                    class108 var82;
                                                    if (var81.field2615 != 1 && var11.field1671[var78] == 1) {
                                                        var82 = class117.method833(new class108[] { class320.field5486, var81.field2610, class137.field2424 }, false);
                                                    } else {
                                                        var82 = class117.method833(new class108[] { class320.field5486, var81.field2610, class144.field2535, class114.method809(-119, var11.field1671[var78]) }, false);
                                                    }
                                                    int var83 = (var11.field1652 + 115) * var80 + var14;
                                                    int var84 = (var11.field1564 + 12) * var79 + var13;
                                                    if (var11.field1568 == 0) {
                                                        var77.method520(var82, var83, var84, var11.field1573, var11.field1663 ? 0 : -1);
                                                    } else if (var11.field1568 == 1) {
                                                        var77.method545(var82, var83 + 57, var84, var11.field1573, var11.field1663 ? 0 : -1);
                                                    } else {
                                                        var77.method526(var82, var83 + 115 - 1, var84, var11.field1573, var11.field1663 ? 0 : -1);
                                                    }
                                                }
                                                var78++;
                                            }
                                        }
                                    }
                                    if (var11.field1677 == 8 && class93.field1488 == var11 && class55.field810 == class144.field2534) {
                                        int var85 = 0;
                                        int var86 = 0;
                                        class108 var87 = var11.field1604;
                                        class80 var88 = class158.field2850;
                                        class108 var89 = class119.method836(var11, (byte) 77, var87);
                                        while (var89.method776(arg6 ^ -5) > 0) {
                                            int var90 = var89.method762(class207.field3708, 66);
                                            class108 var91;
                                            if (var90 == -1) {
                                                var91 = var89;
                                                var89 = class63.field1016;
                                            } else {
                                                var91 = var89.method750(false, 0, var90);
                                                var89 = var89.method788(var90 + 4, 32299);
                                            }
                                            int var92 = var88.method543(var91);
                                            if (var85 < var92) {
                                                var85 = var92;
                                            }
                                            var86 += var88.field1214 + 1;
                                        }
                                        var86 += 7;
                                        var85 += 6;
                                        int var93 = var11.field1673 + var14 - var85 - 5;
                                        if (var93 < (var14 + 5)) {
                                            var93 = var14 + 5;
                                        }
                                        if (arg5 < var85 + var93) {
                                            var93 = arg5 - var85;
                                        }
                                        int var94 = var13 + var11.field1688 + 5;
                                        if (arg3 < var86 + var94) {
                                            var94 = arg3 - var86;
                                        }
                                        if (class231.field4051) {
                                            class50.method348(var93, var94, var85, var86, 16777120);
                                            class50.method353(var93, var94, var85, var86, 0);
                                        } else {
                                            class28.method193(var93, var94, var85, var86, 16777120);
                                            class28.method183(var93, var94, var85, var86, 0);
                                        }
                                        class108 var95 = var11.field1604;
                                        int var96 = var88.field1214 + var94 + 2;
                                        class108 var97 = class119.method836(var11, (byte) 77, var95);
                                        while (var97.method776(0) > 0) {
                                            int var98 = var97.method762(class207.field3708, 77);
                                            class108 var99;
                                            if (var98 == -1) {
                                                var99 = var97;
                                                var97 = class63.field1016;
                                            } else {
                                                var99 = var97.method750(false, 0, var98);
                                                var97 = var97.method788(var98 + 4, 32299);
                                            }
                                            var88.method520(var99, var93 + 3, var96, 0, -1);
                                            var96 += var88.field1214 + 1;
                                        }
                                    }
                                    if (var11.field1677 == 9) {
                                        int var100;
                                        int var101;
                                        int var102;
                                        int var103;
                                        if (var11.field1695) {
                                            var100 = var14;
                                            var101 = var11.field1688 + var13;
                                            var102 = var13;
                                            var103 = var11.field1673 + var14;
                                        } else {
                                            var102 = var11.field1688 + var13;
                                            var101 = var13;
                                            var103 = var14 + var11.field1673;
                                            var100 = var14;
                                        }
                                        if (var11.field1608 == 1) {
                                            if (class231.field4051) {
                                                class50.method349(var100, var101, var103, var102, var11.field1573);
                                            } else {
                                                class28.method202(var100, var101, var103, var102, var11.field1573);
                                            }
                                        } else if (class231.field4051) {
                                            class50.method347(var100, var101, var103, var102, var11.field1573, var11.field1608);
                                        } else {
                                            class28.method201(var100, var101, var103, var102, var11.field1573, var11.field1608);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        field2888++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lik;B)V", line = 1298)
    public static final void method1115(class262 arg0, byte arg1) {
        int var2 = 109 / ((arg1 - 35) / 40);
        class88.field1388 = arg0;
        field2883++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 1307)
    public static void method1116(byte arg0) {
        field2889 = null;
        if (arg0 != 96) {
            field2887 = (class108) null;
        }
        field2887 = null;
        field2884 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIII)V", line = 1344)
    public static final void method1117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 >= -81) {
            return;
        }
        int var8 = class174.method1236(class266.field4677, arg2, class166.field2984, -6219);
        field2886++;
        int var9 = class174.method1236(class266.field4677, arg3, class166.field2984, -6219);
        int var10 = class174.method1236(class260.field4593, arg6, class79.field1202, -6219);
        int var11 = class174.method1236(class260.field4593, arg5, class79.field1202, -6219);
        int var12 = class174.method1236(class266.field4677, arg2 + arg7, class166.field2984, -6219);
        int var13 = class174.method1236(class266.field4677, arg3 - arg7, class166.field2984, -6219);
        for (int var14 = var8; var14 < var12; var14++) {
            class209.method1452(var11, class106.field1839[var14], 7, var10, arg0);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class209.method1452(var11, class106.field1839[var15], 7, var10, arg0);
        }
        int var16 = class174.method1236(class260.field4593, arg6 + arg7, class79.field1202, -6219);
        int var17 = class174.method1236(class260.field4593, arg5 - arg7, class79.field1202, -6219);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class106.field1839[var18];
            class209.method1452(var16, var19, 7, var10, arg0);
            class209.method1452(var17, var19, 7, var16, arg1);
            class209.method1452(var11, var19, 7, var17, arg0);
        }
    }
}
