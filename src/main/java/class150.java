import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class150 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "[S")
    public short[] field1907;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "J")
    public long field1915;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[I")
    public int[] field1913;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "[S")
    public short[] field1914;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[Lae;")
    public static class254[] field1910;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Lkw;", line = 8)
    public static final class252 method916(int arg0, int arg1, int arg2) {
        field1912++;
        class252 var3 = (class252) class479.field6613.method2552((long) arg2 << 32 | (long) arg0, -1);
        if (arg1 >= -17) {
            field1910 = null;
        }
        if (var3 == null) {
            var3 = new class252(arg2, arg0);
            class479.field6613.method2558(var3, var3.field556, -1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 29)
    public static final void method917(byte arg0) {
        field1908++;
        if (class167.field2097 > 1) {
            class585.field8194 = class292.field3876;
            class167.field2097--;
        }
        if (class430.field6054) {
            class430.field6054 = false;
            class445.method2494((byte) 104);
            return;
        }
        if (!class83.field1156) {
            class403.method2331((byte) 85);
        }
        for (int var1 = 0; var1 < 100 && class507.method2820(arg0 - 58); var1++) {
        }
        if (class713.field9949 != 10) {
            return;
        }
        while (class327.method1944(118)) {
            class103 var2 = class752.method4186(arg0 + 313, class3.field22, class449.field6285);
            var2.field1379.method3393(0, arg0 + 138);
            int var3 = var2.field1379.field8520;
            class306.method1850((byte) -61, var2.field1379);
            var2.field1379.method3410((byte) 91, var2.field1379.field8520 - var3);
            class27.method104(false, var2);
        }
        if (class271.field3586 == null) {
            if (class538.method2963(arg0 ^ 0x1A) >= class162.field2035) {
                class271.field3586 = class185.field2255.method81(arg0 ^ 0xFFFFFFF4, class294.field3941.field7975);
            }
        } else if (class271.field3586.field5191 != -1) {
            class103 var4 = class752.method4186(260, class418.field5879, class449.field6285);
            var4.field1379.method3423(class271.field3586.field5191, 1571862888);
            class27.method104(false, var4);
            class271.field3586 = null;
            class162.field2035 = class538.method2963(-47) + 30000L;
        }
        class314 var5 = (class314) class171.field2134.method724(32);
        if (var5 != null || class538.method2963(-47) - 2000L > class750.field10399) {
            class103 var6 = null;
            int var7 = 0;
            for (class314 var8 = (class314) class223.field2881.method724(32); var8 != null && (var6 == null || (var6.field1379.field8520 - var7) < 240); var8 = (class314) class223.field2881.method723(107)) {
                var8.method315(126);
                int var9 = var8.method1875(48);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1879(123);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class104.field1396 != var10 || class131.field1687 != var9) {
                    if (var6 == null) {
                        var6 = class752.method4186(260, class277.field3692, class449.field6285);
                        class111.field1471++;
                        var6.field1379.method3393(0, arg0 ^ 0x4F);
                        var7 = var6.field1379.field8520;
                    }
                    int var11 = var10 - class104.field1396;
                    class104.field1396 = var10;
                    int var12 = var9 - class131.field1687;
                    class131.field1687 = var9;
                    int var13 = (int) ((var8.method1878(true) - class750.field10399) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var11 += 32;
                        var12 += 32;
                        var6.field1379.method3423((var13 << 12) + var12 + (var11 << 6), 1571862888);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var6.field1379.method3393(var13 + 128, -98);
                        var12 += 128;
                        var6.field1379.method3423((var11 << 8) + var12, 1571862888);
                    } else if (var13 >= 32) {
                        var6.field1379.method3423(var13 + 57344, 1571862888);
                        if (var10 == 1 || var9 == -1) {
                            var6.field1379.method3384(1571862888, Integer.MIN_VALUE);
                        } else {
                            var6.field1379.method3384(1571862888, var10 | var9 << 16);
                        }
                    } else {
                        var6.field1379.method3393(var13 + 192, 85);
                        if (var10 == 1 || var9 == -1) {
                            var6.field1379.method3384(1571862888, Integer.MIN_VALUE);
                        } else {
                            var6.field1379.method3384(arg0 ^ 0xA24F46A3, var10 | var9 << 16);
                        }
                    }
                    class750.field10399 = var8.method1878(true);
                }
            }
            if (var6 != null) {
                var6.field1379.method3410((byte) 123, var6.field1379.field8520 - var7);
                class27.method104(false, var6);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1878(true) - class585.field8191) / 50L;
            class585.field8191 = var5.method1878(true);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method1875(89);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1879(122);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1880(-5) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class87.field1200++;
            class103 var20 = class752.method4186(260, class702.field9852, class449.field6285);
            var20.field1379.method3423(var18 << 15 | var19, arg0 + 1571862941);
            var20.field1379.method3384(arg0 + 1571862941, var17 | var16 << 16);
            class27.method104(false, var20);
        }
        if (class77.field948 > 0) {
            class745.field10354++;
            class103 var21 = class752.method4186(260, class753.field10435, class449.field6285);
            var21.field1379.method3393(class77.field948 * 3, 78);
            for (int var22 = 0; var22 < class77.field948; var22++) {
                class326 var23 = class525.field7059[var22];
                long var24 = (var23.method252(-121) - class206.field2477) / 50L;
                class206.field2477 = var23.method252(-84);
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                var21.field1379.method3393(var23.method253(true), 89);
                var21.field1379.method3423((int) var24, arg0 + 1571862941);
            }
            class27.method104(false, var21);
        }
        if (class495.field6746 > 0) {
            class495.field6746--;
        }
        if (class249.field3236 && class495.field6746 <= 0) {
            class249.field3236 = false;
            class495.field6746 = 20;
            class77.field949++;
            class103 var26 = class752.method4186(arg0 + 313, class267.field3531, class449.field6285);
            var26.field1379.method3394((int) class255.field3307 >> 3, 17624);
            var26.field1379.method3423((int) class183.field2237 >> 3, arg0 + 1571862941);
            class27.method104(false, var26);
        }
        if (class51.field539 != class278.field3717) {
            class278.field3717 = class51.field539;
            class15.field106++;
            class103 var27 = class752.method4186(260, class339.field4570, class449.field6285);
            var27.field1379.method3393(class51.field539 ? 1 : 0, -93);
            class27.method104(false, var27);
        }
        if (!class257.field3353) {
            class689.field9655++;
            class103 var28 = class752.method4186(arg0 + 313, class62.field679, class449.field6285);
            var28.field1379.method3393(0, arg0 - 27);
            int var29 = var28.field1379.field8520;
            class611 var30 = class11.field68.method2279(true);
            var28.field1379.method3416(var30.field8529, var30.field8520, -1, 0);
            var28.field1379.method3410((byte) 107, var28.field1379.field8520 - var29);
            class27.method104(false, var28);
            class257.field3353 = true;
        }
        if (class77.field947 != null) {
            if (class8.field57 == 2) {
                class309.method1865(73);
            } else if (class8.field57 == 3) {
                class196.method1087(0);
            }
        }
        if (class51.field534) {
            class51.field534 = false;
        } else {
            class471.field6528 /= 2.0F;
        }
        if (arg0 != -53) {
            field1910 = null;
        }
        if (class436.field6123) {
            class436.field6123 = false;
        } else {
            class285.field3771 /= 2.0F;
        }
        class274.method1631(0);
        if (class713.field9949 != 10) {
            return;
        }
        class28.method106(-1);
        class476.method2680(true);
        class699.method3951(arg0 ^ 0x54BC);
        class182.field2225++;
        if (class182.field2225 > 750) {
            class445.method2494((byte) 104);
            return;
        }
        class346.method2024(37);
        class224.method1273((byte) -85);
        class87.method631(-256);
        for (int var31 = class386.field5455.method3558(-115, true); var31 != -1; var31 = class386.field5455.method3558(-87, false)) {
            class153.method928(var31, 1864);
            class253.field3267[class321.method1919(31, class670.field9318++)] = var31;
        }
        for (class252 var32 = class333.method1980(arg0 ^ 0x4B); var32 != null; var32 = class333.method1980(-46)) {
            int var33 = var32.method1501((byte) -108);
            int var34 = var32.method1499(-101);
            if (var33 == 1) {
                class161.field2024[var34] = var32.field3251;
                class711.field9923 |= class633.field8794[var34];
                class270.field3570[class321.method1919(class295.field3971++, 31)] = var34;
            } else if (var33 == 2) {
                class102.field1367[var34] = var32.field3248;
                class108.field1428[class321.method1919(31, class123.field1612++)] = var34;
            } else if (var33 == 3) {
                class218 var58 = class357.method2056(var34, arg0 - 9767);
                if (!var32.field3248.equals(var58.field2684)) {
                    var58.field2684 = var32.field3248;
                    class277.method1652(arg0 + 54, var58);
                }
            } else if (var33 == 4) {
                class218 var35 = class357.method2056(var34, -9820);
                int var36 = var32.field3251;
                int var37 = var32.field3247;
                int var38 = var32.field3250;
                if (var35.field2692 != var36 || var35.field2820 != var37 || var35.field2668 != var38) {
                    var35.field2692 = var36;
                    var35.field2820 = var37;
                    var35.field2668 = var38;
                    class277.method1652(1, var35);
                }
            } else if (var33 == 5) {
                class218 var56 = class357.method2056(var34, -9820);
                if (var32.field3251 != var56.field2666 || var32.field3251 == -1) {
                    var56.field2666 = var32.field3251;
                    var56.field2772 = 0;
                    var56.field2782 = 0;
                    var56.field2753 = 1;
                    class300 var57 = var56.field2666 == -1 ? null : class460.field6365.method1090(var56.field2666, arg0 + 16436);
                    if (var57 != null) {
                        class268.method1605(var56.field2772, var57, (byte) 118);
                    }
                    class277.method1652(arg0 + 54, var56);
                }
            } else if (var33 == 6) {
                int var50 = var32.field3251;
                int var51 = (var50 & 0x7D21) >> 10;
                int var52 = var50 >> 5 & 0x1F;
                int var53 = var50 & 0x1F;
                int var54 = (var53 << 3) + (var51 << 19) + (var52 << 11);
                class218 var55 = class357.method2056(var34, -9820);
                if (var55.field2695 != var54) {
                    var55.field2695 = var54;
                    class277.method1652(1, var55);
                }
            } else if (var33 == 7) {
                class218 var48 = class357.method2056(var34, arg0 ^ 0x266F);
                boolean var49 = var32.field3251 == 1;
                if (var48.field2762 != var49) {
                    var48.field2762 = var49;
                    class277.method1652(arg0 + 54, var48);
                }
            } else if (var33 == 8) {
                class218 var39 = class357.method2056(var34, arg0 - 9767);
                if (var32.field3251 != var39.field2779 || var32.field3247 != var39.field2676 || var32.field3250 != var39.field2711) {
                    var39.field2779 = var32.field3251;
                    var39.field2711 = var32.field3250;
                    var39.field2676 = var32.field3247;
                    if (var39.field2771 != -1) {
                        if (var39.field2691 > 0) {
                            var39.field2711 = var39.field2711 * 32 / var39.field2691;
                        } else if (var39.field2694 > 0) {
                            var39.field2711 = var39.field2711 * 32 / var39.field2694;
                        }
                    }
                    class277.method1652(1, var39);
                }
            } else if (var33 == 9) {
                class218 var47 = class357.method2056(var34, -9820);
                if (var32.field3251 != var47.field2771 || var32.field3247 != var47.field2826) {
                    var47.field2826 = var32.field3247;
                    var47.field2771 = var32.field3251;
                    class277.method1652(1, var47);
                }
            } else if (var33 == 10) {
                class218 var46 = class357.method2056(var34, -9820);
                if (var32.field3251 != var46.field2729 || var32.field3247 != var46.field2735 || var32.field3250 != var46.field2823) {
                    var46.field2823 = var32.field3250;
                    var46.field2729 = var32.field3251;
                    var46.field2735 = var32.field3247;
                    class277.method1652(1, var46);
                }
            } else if (var33 == 11) {
                class218 var40 = class357.method2056(var34, -9820);
                var40.field2705 = 0;
                var40.field2700 = 0;
                var40.field2824 = var40.field2747 = var32.field3251;
                var40.field2768 = var40.field2688 = var32.field3247;
                class277.method1652(1, var40);
            } else if (var33 == 12) {
                class218 var44 = class357.method2056(var34, -9820);
                int var45 = var32.field3251;
                if (var44 != null && var44.field2832 == 0) {
                    if (var44.field2687 - var44.field2718 < var45) {
                        var45 = var44.field2687 - var44.field2718;
                    }
                    if (var45 < 0) {
                        var45 = 0;
                    }
                    if (var44.field2671 != var45) {
                        var44.field2671 = var45;
                        class277.method1652(1, var44);
                    }
                }
            } else if (var33 == 14) {
                class218 var41 = class357.method2056(var34, arg0 ^ 0x266F);
                var41.field2696 = var32.field3251;
            } else if (var33 == 15) {
                class476.field6576 = var32.field3251;
                class98.field1303 = var32.field3247;
                class50.field530 = true;
            } else if (var33 == 16) {
                class218 var43 = class357.method2056(var34, -9820);
                var43.field2725 = var32.field3251;
            } else if (var33 == 17) {
                class218 var42 = class357.method2056(var34, -9820);
                var42.field2669 = var32.field3251;
            }
        }
        class242.field3146++;
        if (class698.field9826 != 0) {
            class96.field1251 += 20;
            if (class96.field1251 >= 400) {
                class698.field9826 = 0;
            }
        }
        if (class236.field3097 != null) {
            class725.field10128++;
            if (class725.field10128 >= 15) {
                class277.method1652(1, class236.field3097);
                class236.field3097 = null;
            }
        }
        class594.field8283 = null;
        class670.field9313 = false;
        class162.field2034 = null;
        class18.field123 = false;
        class388.method2266(-1, -123, -1, null);
        class622.method3520(-1, null, -1, arg0 ^ -9);
        if (!class595.field8291) {
            class553.field7817 = -1;
        }
        class165.method971(98);
        class292.field3876++;
        if (class549.field7776) {
            class699.field9837++;
            class103 var59 = class752.method4186(260, class287.field3821, class449.field6285);
            var59.field1379.method3431(class181.field2223 | class663.field9258 << 14 | class168.field2100 << 28, (byte) 106);
            class27.method104(false, var59);
            class549.field7776 = false;
        }
        while (true) {
            class404 var60;
            class218 var61;
            class218 var62;
            do {
                var60 = (class404) class136.field1737.method727(arg0 ^ 0xFFFFE695);
                if (var60 == null) {
                    while (true) {
                        class404 var63;
                        class218 var64;
                        class218 var65;
                        do {
                            var63 = (class404) class294.field3953.method727(arg0 ^ 0xFFFFE695);
                            if (var63 == null) {
                                while (true) {
                                    class404 var66;
                                    class218 var67;
                                    class218 var68;
                                    do {
                                        var66 = (class404) class213.field2550.method727(6494);
                                        if (var66 == null) {
                                            if (class162.field2034 == null) {
                                                class259.field3393 = 0;
                                            }
                                            if (class72.field774 != null) {
                                                class648.method3646(19653);
                                            }
                                            if (class596.field8304 > 0 && class290.field3843.method1426(82, 5503) && class290.field3843.method1426(81, 5503) && class619.field8673 != 0) {
                                                int var69 = class653.field9086.field2175 - class619.field8673;
                                                if (var69 < 0) {
                                                    var69 = 0;
                                                } else if (var69 > 3) {
                                                    var69 = 3;
                                                }
                                                class363.method2077(class653.field9086.field899[0] + class133.field1704, class653.field9086.field898[0] + class99.field1313, var69, 52);
                                            }
                                            class514.method2844((byte) 49);
                                            for (int var70 = 0; var70 < 5; var70++) {
                                                int var10002 = class491.field6700[var70]++;
                                            }
                                            if (class711.field9923 && class322.field4325 < (class538.method2963(-47) - 60000L)) {
                                                class115.method762((byte) 118);
                                            }
                                            for (class554 var71 = (class554) class222.field2870.method113((byte) 15); var71 != null; var71 = (class554) class222.field2870.method119(false)) {
                                                if ((class538.method2963(arg0 ^ 0x1A) / 1000L - 5L) > ((long) var71.field7828)) {
                                                    if (var71.field7823 > 0) {
                                                        class270.method1616((byte) 125, 5, var71.field7824 + class755.field10499.method4201(class723.field10095, (byte) 25), 0, "", "", "");
                                                    }
                                                    if (var71.field7823 == 0) {
                                                        class270.method1616((byte) -120, 5, var71.field7824 + class755.field10500.method4201(class723.field10095, (byte) 25), 0, "", "", "");
                                                    }
                                                    var71.method975((byte) 126);
                                                }
                                            }
                                            class492.field6714++;
                                            if (class492.field6714 > 500) {
                                                class492.field6714 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x1) == 1) {
                                                    class622.field8708 += class377.field5245;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class314.field4238 += class424.field5958;
                                                }
                                                if ((var72 & 0x4) == 4) {
                                                    class595.field8285 += class464.field6426;
                                                }
                                            }
                                            if (class622.field8708 < -50) {
                                                class377.field5245 = 2;
                                            }
                                            if (class622.field8708 > 50) {
                                                class377.field5245 = -2;
                                            }
                                            if (class314.field4238 < -55) {
                                                class424.field5958 = 2;
                                            }
                                            if (class595.field8285 < -40) {
                                                class464.field6426 = 1;
                                            }
                                            if (class314.field4238 > 55) {
                                                class424.field5958 = -2;
                                            }
                                            class623.field8721++;
                                            if (class595.field8285 > 40) {
                                                class464.field6426 = -1;
                                            }
                                            if (class623.field8721 > 500) {
                                                class623.field8721 = 0;
                                                int var73 = (int) (Math.random() * 8.0D);
                                                if ((var73 & 0x2) == 2) {
                                                    class283.field3747 += class430.field6048;
                                                }
                                                if ((var73 & 0x1) == 1) {
                                                    class514.field6956 += class239.field3131;
                                                }
                                            }
                                            if (class514.field6956 < -60) {
                                                class239.field3131 = 2;
                                            }
                                            if (class283.field3747 < -20) {
                                                class430.field6048 = 1;
                                            }
                                            if (class514.field6956 > 60) {
                                                class239.field3131 = -2;
                                            }
                                            class303.field4093++;
                                            if (class283.field3747 > 10) {
                                                class430.field6048 = -1;
                                            }
                                            if (class303.field4093 > 50) {
                                                class161.field2027++;
                                                class103 var74 = class752.method4186(260, class450.field6292, class449.field6285);
                                                class27.method104(false, var74);
                                            }
                                            if (class122.field1594) {
                                                class462.method2571(arg0 ^ 0xFFFFFFC3);
                                                class122.field1594 = false;
                                            }
                                            try {
                                                class4.method10((byte) 115);
                                                return;
                                            } catch (IOException var75) {
                                                class445.method2494((byte) 104);
                                                return;
                                            }
                                        }
                                        var67 = var66.field5714;
                                        if (var67.field2769 < 0) {
                                            break;
                                        }
                                        var68 = class357.method2056(var67.field2693, -9820);
                                    } while (var68 == null || var68.field2816 == null || var68.field2816.length <= var67.field2769 || var68.field2816[var67.field2769] != var67);
                                    class498.method2775(var66);
                                }
                            }
                            var64 = var63.field5714;
                            if (var64.field2769 < 0) {
                                break;
                            }
                            var65 = class357.method2056(var64.field2693, -9820);
                        } while (var65 == null || var65.field2816 == null || var64.field2769 >= var65.field2816.length || var65.field2816[var64.field2769] != var64);
                        class498.method2775(var63);
                    }
                }
                var61 = var60.field5714;
                if (var61.field2769 < 0) {
                    break;
                }
                var62 = class357.method2056(var61.field2693, arg0 ^ 0x266F);
            } while (var62 == null || var62.field2816 == null || var61.field2769 >= var62.field2816.length || var62.field2816[var61.field2769] != var61);
            class498.method2775(var60);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIII)V", line = 907)
    public static final void method918(int arg0, int arg1, int arg2, int arg3) {
        field1909++;
        if (arg1 <= -102) {
            class308 var4 = class493.field6722[arg2][arg0];
            class282.method1687(false, arg3, var4 == null ? class518.field6971 : var4);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)V", line = 923)
    public static final void method919(int arg0, int arg1) {
        field1911++;
        class252 var2 = method916(arg1, -29, arg0);
        var2.method1497(0);
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(J[I[S[S)V", line = 933)
    public class150(long arg0, int[] arg1, short[] arg2, short[] arg3) {
        this.field1907 = arg3;
        this.field1915 = arg0;
        this.field1913 = arg1;
        this.field1914 = arg2;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V", line = 944)
    public static void method920(byte arg0) {
        field1910 = null;
        if (arg0 > -6) {
            method918(14, 22, 64, 106);
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "()V", line = 953)
    protected class150() {
    }
}
