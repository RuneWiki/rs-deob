import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class370 extends IOException {

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "Lu;")
    public static class80 field5372;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "[I")
    public static int[] field5371;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "[Lvr;")
    public static class147[] field5368;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
    public static final void method2300(byte arg0) {
        if (class385.field5623 > 1) {
            class385.field5623--;
            class706.field9907 = class194.field2598;
        }
        field5369++;
        if (class539.field7334) {
            class539.field7334 = false;
            class299.method1894((byte) -54);
            return;
        }
        if (!class526.field7216) {
            class700.method3903(1024);
        }
        for (int var1 = 0; var1 < 100 && class24.method195((byte) 120); var1++) {
        }
        if (class458.field6355 != 10) {
            return;
        }
        while (class108.method819((byte) -14)) {
            class267 var2 = class545.method3099((byte) 57, class269.field3966, class626.field8551);
            var2.field3938.method2380(65280, 0);
            int var3 = var2.field3938.field5459;
            class338.method2148(var2.field3938, 56);
            var2.field3938.method2394(87, var2.field3938.field5459 - var3);
            class617.method3392(var2, true);
        }
        if (class126.field1902 == null) {
            if (class302.method1910(0) >= class18.field272) {
                class126.field1902 = class414.field5944.method2530(class369.field5359.field1141, true);
            }
        } else if (class126.field1902.field3102 != -1) {
            class267 var4 = class545.method3099((byte) 60, class269.field3966, class641.field8895);
            var4.field3938.method2415(false, class126.field1902.field3102);
            class617.method3392(var4, true);
            class126.field1902 = null;
            class18.field272 = class302.method1910(0) + 30000L;
        }
        class504 var5 = (class504) class289.field4242.method2551((byte) -108);
        if (var5 != null || class735.field10180 < class302.method1910(0) - 2000L) {
            class267 var6 = null;
            int var7 = 0;
            for (class504 var8 = (class504) class561.field7533.method2551((byte) -108); var8 != null && (var6 == null || var6.field3938.field5459 - var7 < 240); var8 = (class504) class561.field7533.method2542(-105)) {
                var8.method792((byte) -113);
                int var9 = var8.method1036(5);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method1038(8);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class300.field4338 != var10 || class546.field7399 != var9) {
                    if (var6 == null) {
                        class260.field3865++;
                        var6 = class545.method3099((byte) 40, class269.field3966, class523.field7173);
                        var6.field3938.method2380(65280, 0);
                        var7 = var6.field3938.field5459;
                    }
                    int var11 = var10 - class300.field4338;
                    class300.field4338 = var10;
                    int var12 = var9 - class546.field7399;
                    class546.field7399 = var9;
                    int var13 = (int) ((var8.method1039(-4) - class735.field10180) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field3938.method2415(false, (var11 << 6) + (var13 << 12) + var12);
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var6.field3938.method2380(65280, var13 + 128);
                        var12 += 128;
                        var6.field3938.method2415(false, (var11 << 8) + var12);
                    } else if (var13 >= 32) {
                        var6.field3938.method2415(false, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field3938.method2354(Integer.MIN_VALUE, (byte) 98);
                        } else {
                            var6.field3938.method2354(var9 << 16 | var10, (byte) 117);
                        }
                    } else {
                        var6.field3938.method2380(65280, var13 + 192);
                        if (var10 == 1 || var9 == -1) {
                            var6.field3938.method2354(Integer.MIN_VALUE, (byte) 106);
                        } else {
                            var6.field3938.method2354(var9 << 16 | var10, (byte) 85);
                        }
                    }
                    class735.field10180 = var8.method1039(-4);
                }
            }
            if (var6 != null) {
                var6.field3938.method2394(104, var6.field3938.field5459 - var7);
                class617.method3392(var6, true);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method1039(-4) - class356.field5220) / 50L;
            class356.field5220 = var5.method1039(-4);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method1036(5);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method1038(8);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method1037(-5) == 2) {
                var18 = 1;
            }
            int var19 = (int) var14;
            class767.field10585++;
            class267 var20 = class545.method3099((byte) 62, class269.field3966, class293.field4278);
            var20.field3938.method2361(-863995992, var16 << 16 | var17);
            var20.field3938.method2362((byte) -69, var19 | var18 << 15);
            class617.method3392(var20, true);
        }
        if (class494.field6839 > 0) {
            class179.field2379++;
            class267 var21 = class545.method3099((byte) 117, class269.field3966, class564.field7560);
            var21.field3938.method2380(65280, class494.field6839 * 3);
            for (int var22 = 0; var22 < class494.field6839; var22++) {
                class313 var23 = class353.field5180[var22];
                long var24 = (var23.method1977(116) - class404.field5859) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class404.field5859 = var23.method1977(107);
                var21.field3938.method2380(65280, var23.method1975(-117));
                var21.field3938.method2415(false, (int) var24);
            }
            class617.method3392(var21, true);
        }
        if (class644.field8935 > 0) {
            class644.field8935--;
        }
        if (class757.field10501 && class644.field8935 <= 0) {
            class757.field10501 = false;
            class644.field8935 = 20;
            class495.field6851++;
            class267 var26 = class545.method3099((byte) 47, class269.field3966, class774.field10665);
            var26.field3938.method2362((byte) -90, (int) class135.field1974 >> 3);
            var26.field3938.method2415(false, (int) class282.field4151 >> 3);
            class617.method3392(var26, true);
        }
        if (class9.field126 != class59.field807) {
            class9.field126 = class59.field807;
            class184.field2475++;
            class267 var27 = class545.method3099((byte) 45, class269.field3966, class729.field10118);
            var27.field3938.method2380(65280, class59.field807 ? 1 : 0);
            class617.method3392(var27, true);
        }
        if (!class747.field10301) {
            class464.field6445++;
            class267 var28 = class545.method3099((byte) 92, class269.field3966, class441.field6211);
            var28.field3938.method2380(65280, 0);
            int var29 = var28.field3938.field5459;
            class376 var30 = class712.field9959.method734((byte) -10);
            var28.field3938.method2403(var30.field5518, var30.field5459, 128, 0);
            var28.field3938.method2394(83, var28.field3938.field5459 - var29);
            class617.method3392(var28, true);
            class747.field10301 = true;
        }
        if (class626.field8501 != null) {
            if (class502.field6938 == 2) {
                class21.method165(98);
            } else if (class502.field6938 == 3) {
                class306.method1939(3);
            }
        }
        if (class589.field7912) {
            class589.field7912 = false;
        } else {
            class281.field4142 /= 2.0F;
        }
        if (class574.field7712) {
            class574.field7712 = false;
        } else {
            class282.field4157 /= 2.0F;
        }
        class312.method1960((byte) 53);
        if (class458.field6355 != 10) {
            return;
        }
        class122.method999(1204339692);
        class788.method4354(6594);
        class220.method1458(false);
        class584.field7797++;
        if (class584.field7797 > 750) {
            class299.method1894((byte) -54);
            return;
        }
        class504.method2926(0);
        class85.method703((byte) -100);
        class758.method4215(86);
        for (int var31 = class382.field5602.method2266(true, (byte) 89); var31 != -1; var31 = class382.field5602.method2266(false, (byte) -120)) {
            class39.method275(6, var31);
            class662.field9144[class440.method2643(31, class56.field782++)] = var31;
        }
        for (class16 var32 = class445.method2669((byte) 123); var32 != null; var32 = class445.method2669((byte) 127)) {
            int var33 = var32.method120(-3356);
            long var34 = var32.method121(71);
            if (var33 == 1) {
                class700.field9825[(int) var34] = var32.field237;
                class79.field1138 |= class197.field2639[(int) var34];
                class586.field7815[class440.method2643(31, class77.field1105++)] = (int) var34;
            } else if (var33 == 2) {
                class41.field642[(int) var34] = var32.field236;
                class267.field3936[class440.method2643(31, class743.field10252++)] = (int) var34;
            } else if (var33 == 3) {
                class668 var63 = class536.method3067((int) var34, 0);
                if (!var32.field236.equals(var63.field9339)) {
                    var63.field9339 = var32.field236;
                    class763.method4242(var63, true);
                }
            } else if (var33 == 4) {
                class668 var59 = class536.method3067((int) var34, 0);
                int var60 = var32.field237;
                int var61 = var32.field244;
                int var62 = var32.field245;
                if (var59.field9230 != var60 || var59.field9348 != var61 || var59.field9273 != var62) {
                    var59.field9230 = var60;
                    var59.field9273 = var62;
                    var59.field9348 = var61;
                    class763.method4242(var59, true);
                }
            } else if (var33 == 5) {
                class668 var57 = class536.method3067((int) var34, 0);
                if (var32.field237 != var57.field9218 || var32.field237 == -1) {
                    var57.field9218 = var32.field237;
                    var57.field9264 = 0;
                    var57.field9315 = 1;
                    var57.field9323 = 0;
                    class489 var58 = var57.field9218 == -1 ? null : class6.field65.method1034(var57.field9218, 0);
                    if (var58 != null) {
                        class291.method1842(0, var57.field9264, var58);
                    }
                    class763.method4242(var57, true);
                }
            } else if (var33 == 6) {
                int var51 = var32.field237;
                int var52 = var51 >> 10 & 0x1F;
                int var53 = (var51 & 0x3F1) >> 5;
                int var54 = var51 & 0x1F;
                int var55 = (var54 << 3) + (var52 << 19) + (var53 << 11);
                class668 var56 = class536.method3067((int) var34, 0);
                if (var56.field9290 != var55) {
                    var56.field9290 = var55;
                    class763.method4242(var56, true);
                }
            } else if (var33 == 7) {
                class668 var36 = class536.method3067((int) var34, 0);
                boolean var37 = var32.field237 == 1;
                if (var37 != var36.field9265) {
                    var36.field9265 = var37;
                    class763.method4242(var36, true);
                }
            } else if (var33 == 8) {
                class668 var38 = class536.method3067((int) var34, 0);
                if (var32.field237 != var38.field9300 || var32.field244 != var38.field9299 || var32.field245 != var38.field9324) {
                    var38.field9324 = var32.field245;
                    var38.field9299 = var32.field244;
                    var38.field9300 = var32.field237;
                    if (var38.field9283 != -1) {
                        if (var38.field9301 > 0) {
                            var38.field9324 = var38.field9324 * 32 / var38.field9301;
                        } else if (var38.field9223 > 0) {
                            var38.field9324 = var38.field9324 * 32 / var38.field9223;
                        }
                    }
                    class763.method4242(var38, true);
                }
            } else if (var33 == 9) {
                class668 var39 = class536.method3067((int) var34, 0);
                if (var32.field237 != var39.field9283 || var32.field244 != var39.field9343) {
                    var39.field9283 = var32.field237;
                    var39.field9343 = var32.field244;
                    class763.method4242(var39, true);
                }
            } else if (var33 == 10) {
                class668 var40 = class536.method3067((int) var34, 0);
                if (var32.field237 != var40.field9356 || var32.field244 != var40.field9217 || var32.field245 != var40.field9246) {
                    var40.field9246 = var32.field245;
                    var40.field9217 = var32.field244;
                    var40.field9356 = var32.field237;
                    class763.method4242(var40, true);
                }
            } else if (var33 == 11) {
                class668 var50 = class536.method3067((int) var34, 0);
                var50.field9242 = var50.field9225 = var32.field237;
                var50.field9392 = 0;
                var50.field9257 = var50.field9328 = var32.field244;
                var50.field9359 = 0;
                class763.method4242(var50, true);
            } else if (var33 == 12) {
                class668 var41 = class536.method3067((int) var34, 0);
                int var42 = var32.field237;
                if (var41 != null && var41.field9353 == 0) {
                    if (var41.field9296 - var41.field9297 < var42) {
                        var42 = var41.field9296 - var41.field9297;
                    }
                    if (var42 < 0) {
                        var42 = 0;
                    }
                    if (var41.field9247 != var42) {
                        var41.field9247 = var42;
                        class763.method4242(var41, true);
                    }
                }
            } else if (var33 == 14) {
                class668 var43 = class536.method3067((int) var34, 0);
                var43.field9277 = var32.field237;
            } else if (var33 == 15) {
                class768.field10595 = true;
                class692.field9714 = var32.field244;
                class779.field10689 = var32.field237;
            } else if (var33 == 16) {
                class668 var44 = class536.method3067((int) var34, 0);
                var44.field9302 = var32.field237;
            } else if (var33 == 17) {
                class668 var49 = class536.method3067((int) var34, 0);
                var49.field9241 = var32.field237;
            } else if (var33 == 18) {
                class668 var45 = class536.method3067((int) var34, 0);
                int var46 = (int) (var34 >> 32);
                var45.method3698(var46, (short) var32.field244, (byte) 121, (short) var32.field237);
            } else if (var33 == 19) {
                class668 var47 = class536.method3067((int) var34, 0);
                int var48 = (int) (var34 >> 32);
                var47.method3711(var48, (short) var32.field244, false, (short) var32.field237);
            }
        }
        class303.field4368++;
        if (class729.field10119 != 0) {
            class452.field6294 += 20;
            if (class452.field6294 >= 400) {
                class729.field10119 = 0;
            }
        }
        if (class117.field1686 != null) {
            class441.field6219++;
            if (class441.field6219 >= 15) {
                class763.method4242(class117.field1686, true);
                class117.field1686 = null;
            }
        }
        class474.field6605 = null;
        class662.field9134 = false;
        class729.field10122 = null;
        class277.field4113 = false;
        class289.method1837(-1, -1, 55, null);
        class483.method2808(-1, -85, null, -1);
        if (!class497.field6870) {
            class660.field9129 = -1;
        }
        class139.method1073(-1);
        class194.field2598++;
        if (class597.field8131) {
            class224.field3069++;
            class267 var64 = class545.method3099((byte) 42, class269.field3966, class202.field2678);
            var64.field3938.method2396(1662353656, class492.field6824 << 28 | class502.field6936 << 14 | class537.field7307);
            class617.method3392(var64, true);
            class597.field8131 = false;
        }
        while (true) {
            class12 var65;
            class668 var66;
            class668 var67;
            do {
                var65 = (class12) class327.field4754.method2543(-15114);
                if (var65 == null) {
                    while (true) {
                        class12 var68;
                        class668 var69;
                        class668 var70;
                        do {
                            var68 = (class12) class553.field7471.method2543(-15114);
                            if (var68 == null) {
                                while (true) {
                                    class12 var71;
                                    class668 var72;
                                    class668 var73;
                                    do {
                                        var71 = (class12) class374.field5403.method2543(-15114);
                                        if (var71 == null) {
                                            if (class474.field6605 == null) {
                                                class348.field5120 = 0;
                                            }
                                            if (class437.field6161 != null) {
                                                class601.method3341(-125);
                                            }
                                            if (class712.field9963 > 0 && class469.field6507.method828(-2, 82) && class469.field6507.method828(-2, 81) && class491.field6815 != 0) {
                                                int var74 = class551.field7456.field2250 - class491.field6815;
                                                if (var74 < 0) {
                                                    var74 = 0;
                                                } else if (var74 > 3) {
                                                    var74 = 3;
                                                }
                                                class306.method1941(var74, 14328, class551.field7456.field1884[0] + class230.field3147, class551.field7456.field1890[0] + class121.field1765);
                                            }
                                            class195.method1342(2);
                                            for (int var75 = 0; var75 < 5; var75++) {
                                                int var10002 = class314.field4525[var75]++;
                                            }
                                            if (arg0 <= 77) {
                                                field5371 = null;
                                            }
                                            if (class79.field1138 && class790.field10868 < class302.method1910(0) - 60000L) {
                                                class454.method2696((byte) 9);
                                            }
                                            for (class565 var76 = (class565) class596.field8125.method109(0); var76 != null; var76 = (class565) class596.field8125.method115((byte) 79)) {
                                                if ((class302.method1910(0) / 1000L - 5L) > ((long) var76.field7563)) {
                                                    if (var76.field7566 > 0) {
                                                        class746.method4129(5, "", "", var76.field7564 + class474.field6558.method2780(101, class38.field589), 0, "", 16773);
                                                    }
                                                    if (var76.field7566 == 0) {
                                                        class746.method4129(5, "", "", var76.field7564 + class474.field6559.method2780(94, class38.field589), 0, "", 16773);
                                                    }
                                                    var76.method2922((byte) -76);
                                                }
                                            }
                                            class227.field3103++;
                                            if (class227.field3103 > 500) {
                                                class227.field3103 = 0;
                                                int var77 = (int) (Math.random() * 8.0D);
                                                if ((var77 & 0x1) == 1) {
                                                    class15.field232 += class353.field5166;
                                                }
                                                if ((var77 & 0x4) == 4) {
                                                    class344.field5063 += class503.field6962;
                                                }
                                                if ((var77 & 0x2) == 2) {
                                                    class783.field10792 += class597.field8133;
                                                }
                                            }
                                            if (class15.field232 < -50) {
                                                class353.field5166 = 2;
                                            }
                                            if (class15.field232 > 50) {
                                                class353.field5166 = -2;
                                            }
                                            if (class783.field10792 < -55) {
                                                class597.field8133 = 2;
                                            }
                                            if (class344.field5063 < -40) {
                                                class503.field6962 = 1;
                                            }
                                            if (class783.field10792 > 55) {
                                                class597.field8133 = -2;
                                            }
                                            class122.field1785++;
                                            if (class344.field5063 > 40) {
                                                class503.field6962 = -1;
                                            }
                                            if (class122.field1785 > 500) {
                                                class122.field1785 = 0;
                                                int var78 = (int) (Math.random() * 8.0D);
                                                if ((var78 & 0x2) == 2) {
                                                    class299.field4334 += class305.field4403;
                                                }
                                                if ((var78 & 0x1) == 1) {
                                                    class594.field8116 += class556.field7493;
                                                }
                                            }
                                            if (class594.field8116 < -60) {
                                                class556.field7493 = 2;
                                            }
                                            if (class594.field8116 > 60) {
                                                class556.field7493 = -2;
                                            }
                                            if (class299.field4334 < -20) {
                                                class305.field4403 = 1;
                                            }
                                            class88.field1232++;
                                            if (class299.field4334 > 10) {
                                                class305.field4403 = -1;
                                            }
                                            if (class88.field1232 > 50) {
                                                class359.field5251++;
                                                class267 var79 = class545.method3099((byte) 37, class269.field3966, class393.field5802);
                                                class617.method3392(var79, true);
                                            }
                                            if (class696.field9755) {
                                                class352.method2221(-65);
                                                class696.field9755 = false;
                                            }
                                            try {
                                                class101.method793((byte) 125);
                                                return;
                                            } catch (IOException var80) {
                                                class299.method1894((byte) -54);
                                                return;
                                            }
                                        }
                                        var72 = var71.field190;
                                        if (var72.field9318 < 0) {
                                            break;
                                        }
                                        var73 = class536.method3067(var72.field9336, 0);
                                    } while (var73 == null || var73.field9289 == null || var72.field9318 >= var73.field9289.length || var73.field9289[var72.field9318] != var72);
                                    class173.method1235(var71);
                                }
                            }
                            var69 = var68.field190;
                            if (var69.field9318 < 0) {
                                break;
                            }
                            var70 = class536.method3067(var69.field9336, 0);
                        } while (var70 == null || var70.field9289 == null || var69.field9318 >= var70.field9289.length || var70.field9289[var69.field9318] != var69);
                        class173.method1235(var68);
                    }
                }
                var66 = var65.field190;
                if (var66.field9318 < 0) {
                    break;
                }
                var67 = class536.method3067(var66.field9336, 0);
            } while (var67 == null || var67.field9289 == null || var66.field9318 >= var67.field9289.length || var67.field9289[var66.field9318] != var66);
            class173.method1235(var65);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public static void method2301(int arg0) {
        field5371 = null;
        int var1 = -68 / ((arg0 + 64) / 43);
        field5368 = null;
        field5372 = null;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class370(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)I")
    public static final int method2302(int arg0, byte arg1) {
        if (arg1 == 35) {
            field5373++;
            return arg0 & 0x3FF;
        } else {
            return 20;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2303(String arg0, int arg1) {
        field5370++;
        if (arg1 != -1) {
            method2302(-101, (byte) 21);
        }
        for (int var2 = 0; var2 < class179.field2383.length; var2++) {
            if (class179.field2383[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }
}
