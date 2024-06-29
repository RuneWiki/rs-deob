import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class class381 extends class35 {

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "[I")
    public static int[] field5651 = new int[250];

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "Lsl;")
    public static class422 field5650 = new class422("", 10);

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIIIIIBI[Lje;I)V", line = 4)
    public static final void method2327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, class178[] arg8, int arg9) {
        class138.field1976.method500(arg9, arg4, arg3, arg1);
        field5652++;
        if (arg6 >= -49) {
            method2327(40, -2, -112, 21, -24, 52, (byte) -19, -98, (class178[]) null, -95);
        }
        for (int var10 = 0; var10 < arg8.length; var10++) {
            class178 var11 = arg8[var10];
            if (var11 != null && (var11.field2580 == arg2 || arg2 == -1412584499 && class100.field1419 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class398.field5826[class267.field3959].setBounds(var11.field2593 + arg7, var11.field2648 + arg5, var11.field2595, var11.field2589);
                    var12 = class267.field3959++;
                } else {
                    var12 = arg0;
                }
                var11.field2644 = class452.field6418;
                var11.field2527 = var12;
                if (!client.method2771(var11)) {
                    if (var11.field2577 != 0) {
                        class245.method1561(var11, -11);
                    }
                    int var13 = var11.field2593 + arg7;
                    int var14 = var11.field2648 + arg5;
                    int var15 = var11.field2650;
                    if (class365.field5528 && (client.method2777(var11).field2506 != 0 || var11.field2655 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class100.field1419 == var11) {
                        if (arg2 != -1412584499 && (class275.field4187 == var11.field2544 || class360.field5461 == var11.field2544)) {
                            class314.field4727 = arg5;
                            class143.field2035 = arg7;
                            class345.field5256 = arg8;
                            continue;
                        }
                        if (class53.field756 && class360.field5458) {
                            int var16 = class78.field1105.method1975(127);
                            int var17 = class78.field1105.method1984((byte) -127);
                            int var18 = var16 - class338.field5071;
                            int var19 = var17 - class382.field5658;
                            if (class47.field684 > var18) {
                                var18 = class47.field684;
                            }
                            if ((var11.field2595 + var18) > (class47.field684 + class245.field3509.field2595)) {
                                var18 = class47.field684 - (var11.field2595 - class245.field3509.field2595);
                            }
                            if (class454.field6461 > var19) {
                                var19 = class454.field6461;
                            }
                            if ((class454.field6461 + class245.field3509.field2589) < (var11.field2589 + var19)) {
                                var19 = class454.field6461 + class245.field3509.field2589 - var11.field2589;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (class360.field5461 == var11.field2544) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field2655 == 2) {
                        var20 = arg4;
                        var21 = arg1;
                        var22 = arg9;
                        var23 = arg3;
                    } else {
                        int var24 = var11.field2595 + var13;
                        int var25 = var11.field2589 + var14;
                        if (var11.field2655 == 9) {
                            var24++;
                            var25++;
                        }
                        var20 = arg4 >= var14 ? arg4 : var14;
                        var22 = arg9 < var13 ? var13 : arg9;
                        var23 = var24 < arg3 ? var24 : arg3;
                        var21 = arg1 <= var25 ? arg1 : var25;
                    }
                    if (var22 < var23 && var21 > var20) {
                        if (var11.field2577 != 0) {
                            if (class124.field1701 == var11.field2577 || class387.field5705 == var11.field2577) {
                                class197.method1342(var14, class387.field5705 == var11.field2577, (byte) -108, var11.field2595, var11.field2589, var13);
                                class103.field1442[var12] = true;
                                class138.field1976.method500(arg9, arg4, arg3, arg1);
                                continue;
                            }
                            if (class78.field1091 == var11.field2577) {
                                if (var11.method1235(class138.field1976, (byte) -15) != null) {
                                    class418.method2483((byte) 76);
                                    class429.method2519(93, class138.field1976, var14, var11, var13);
                                    class225.field3270[var12] = true;
                                    class138.field1976.method500(arg9, arg4, arg3, arg1);
                                }
                                continue;
                            }
                            if (class329.field4929 == var11.field2577) {
                                if (var11.method1235(class138.field1976, (byte) -120) != null) {
                                    class360.method2216(var11, var14, -79, var13);
                                    class225.field3270[var12] = true;
                                    class138.field1976.method500(arg9, arg4, arg3, arg1);
                                }
                                continue;
                            }
                            if (class157.field2189 == var11.field2577) {
                                class88.method696(var11.field2595, var11.field2589, var14, class492.field6913, true, class138.field1976, var13);
                                class103.field1442[var12] = true;
                                class138.field1976.method500(arg9, arg4, arg3, arg1);
                                continue;
                            }
                            if (class9.field144 == var11.field2577) {
                                class442.method2572(var11.field2589, var13, 0, var11.field2595, class138.field1976, var14);
                                class103.field1442[var12] = true;
                                class138.field1976.method500(arg9, arg4, arg3, arg1);
                                continue;
                            }
                            if (class156.field2172 == var11.field2577) {
                                if (!class162.field2245 && !class479.field6738) {
                                    continue;
                                }
                                int var26 = var11.field2595 + var13;
                                int var27 = var14 + 15;
                                if (class162.field2245) {
                                    class310.field4690.method1490("Fps:" + class83.field1174, -256, var26, var27, 29729, -1);
                                    var27 += 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = -256;
                                    if (var29 > 65536) {
                                        var30 = -65536;
                                    }
                                    class310.field4690.method1490("Mem:" + var29 + "k", var30, var26, var27, 29729, -1);
                                    var27 += 15;
                                    class310.field4690.method1490("In:" + class187.field2847 + "B/s Out:" + class342.field5117 + "B/s", -256, var26, var27, 29729, -1);
                                    var27 += 15;
                                    int var31 = class138.field1976.method510() / 1024;
                                    class310.field4690.method1490("Offheap:" + var31 + "k", var31 <= 65536 ? -256 : -65536, var26, var27, 29729, -1);
                                    var27 += 15;
                                    int var32 = 0;
                                    int var33 = 0;
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < 29; var35++) {
                                        var32 += class198.field2985[var35].method2807(false);
                                        var33 += class198.field2985[var35].method2805(-54);
                                        var34 += class198.field2985[var35].method2808(-123);
                                    }
                                    int var36 = var34 * 100 / var32;
                                    int var37 = var33 * 10000 / var32;
                                    String var38 = "Cache:" + class262.method1719(2, 107, 0, true, (long) var37) + "% (" + var36 + "%)";
                                    class100.field1430.method1490(var38, -256, var26, var27, 29729, -1);
                                    var27 += 12;
                                }
                                if (class6.field109 > 0) {
                                    class100.field1430.method1490("Particles: " + class143.field2037 + " / " + class6.field109, -256, var26, var27, 29729, -1);
                                }
                                var27 += 12;
                                if (class479.field6738) {
                                    class100.field1430.method1490("Polys: " + class138.field1976.method562() + " Models: " + class138.field1976.method559(), -256, var26, var27, 29729, -1);
                                    var27 += 12;
                                    class100.field1430.method1490("Ls: " + class115.field1604 + " La: " + class488.field6849 + " NPC: " + class121.field1674 + " Pl: " + class449.field6350, -256, var26, var27, 29729, -1);
                                    class75.method645(120);
                                    var27 += 12;
                                }
                                class103.field1442[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field2655 == 0) {
                            if (class190.field2921 == var11.field2577 && class138.field1976.method504()) {
                                class138.field1976.method521(var13, var14, var11.field2595, var11.field2589);
                            }
                            method2327(var12, var21, var11.field2631, var23, var20, var14 - var11.field2620, (byte) -82, var13 - var11.field2530, arg8, var22);
                            if (var11.field2548 != null) {
                                method2327(var12, var21, var11.field2631, var23, var20, var14 - var11.field2620, (byte) -106, var13 - var11.field2530, var11.field2548, var22);
                            }
                            class468 var39 = (class468) class466.field6564.method2305((long) var11.field2631, (byte) 94);
                            if (var39 != null) {
                                class27.method236(var20, (byte) 124, var13, var23, var22, var14, var21, var39.field6584, var12);
                            }
                            if (class190.field2921 == var11.field2577 && class138.field1976.method504()) {
                                class138.field1976.method573();
                                class2.field41 = true;
                            }
                            class138.field1976.method500(arg9, arg4, arg3, arg1);
                        }
                        if (class100.field1424[var12] || class14.field197 > 1) {
                            if (var11.field2655 == 3) {
                                if (var15 == 0) {
                                    if (var11.field2567) {
                                        class138.field1976.method508(var13, var14, var11.field2595, var11.field2589, var11.field2625, 0);
                                    } else {
                                        class138.field1976.method569(var13, var14, var11.field2595, var11.field2589, var11.field2625, 0);
                                    }
                                } else if (var11.field2567) {
                                    class138.field1976.method508(var13, var14, var11.field2595, var11.field2589, 255 - (var15 & 0xFF) << 24 | var11.field2625 & 0xFFFFFF, 1);
                                } else {
                                    class138.field1976.method569(var13, var14, var11.field2595, var11.field2589, 255 - (var15 & 0xFF) << 24 | var11.field2625 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field2655 == 4) {
                                class229 var40 = var11.method1237(class138.field1976, -19010);
                                if (var40 != null) {
                                    int var41 = var11.field2625;
                                    String var42 = var11.field2629;
                                    if (var11.field2605 != -1) {
                                        class184 var43 = class23.field309.method2364((byte) 118, var11.field2605);
                                        var42 = var43.field2722;
                                        if (var42 == null) {
                                            var42 = "null";
                                        }
                                        if ((var43.field2768 == 1 || var11.field2652 != 1) && var11.field2652 != -1) {
                                            var42 = "<col=ff9040>" + var42 + "</col> x" + class473.method2758(120, var11.field2652);
                                        }
                                    }
                                    if (class232.field3403 == var11) {
                                        var42 = class332.field4973.method2036(class4.field85, (byte) -21);
                                        var41 = var11.field2625;
                                    }
                                    if (class294.field4430) {
                                        class138.field1976.method572(var13, var14, var13 + var11.field2595, var11.field2589 + var14);
                                    }
                                    var40.method1492(var11.field2589, var11.field2595, 0, var42, 0, var11.field2562 ? 255 - (var15 & 0xFF) << 24 : -1, (class401) null, (int[]) null, var13, var11.field2607, var11.field2552, -127, class186.field2816, var11.field2662, var41 | 255 - (var15 & 0xFF) << 24, var14);
                                    if (class294.field4430) {
                                        class138.field1976.method500(arg9, arg4, arg3, arg1);
                                    }
                                } else if (class68.field929) {
                                    class205.method1396(124, var11);
                                }
                            } else if (var11.field2655 == 5) {
                                if (var11.field2636 >= 0) {
                                    var11.method1229(class365.field5529, (byte) -51, class431.field6129).method676(var13, class138.field1976, 0, var11.field2531 << 3, var14, 0, var11.field2595, var11.field2586 << 3, false, var11.field2589);
                                } else {
                                    class319 var44;
                                    if (var11.field2605 == -1) {
                                        var44 = var11.method1231(5128, class138.field1976);
                                    } else {
                                        class330 var45 = var11.field2556 ? class472.field6622.field3833 : null;
                                        var44 = class23.field309.method2365(class138.field1976, var11.field2647, var11.field2652, var11.field2576, var11.field2605, 1, var11.field2610 | 0xFF000000, var45);
                                    }
                                    if (var44 != null) {
                                        int var46 = var44.method791();
                                        int var47 = var44.method789();
                                        if (var11.field2628) {
                                            class138.field1976.method572(var13, var14, var11.field2595 + var13, var11.field2589 + var14);
                                            if (var11.field2613 != 0) {
                                                int var49 = (var46 - (1 - var11.field2595)) / var46;
                                                int var50 = (var11.field2589 + var47 - 1) / var47;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        var44.method1961((float) var46 / 2.0F + (float) (var46 * var51 + var13), (float) var47 / 2.0F + (float) (var14 - -(var47 * var52)), 4096, var11.field2613);
                                                    }
                                                }
                                            } else if (var15 == 0) {
                                                var44.method794(var13, var14, var11.field2595, var11.field2589, 0, 0, 1);
                                            } else {
                                                var44.method794(var13, var14, var11.field2595, var11.field2589, 1, 255 - (var15 & 0xFF) << 24 | 0xFFFFFF, 1);
                                            }
                                            class138.field1976.method500(arg9, arg4, arg3, arg1);
                                        } else if (var15 != 0) {
                                            int var48 = 255 - (var15 & 0xFF) << 24 | 0xFFFFFF;
                                            if (var11.field2613 != 0) {
                                                var44.method1964((float) var11.field2595 / 2.0F + (float) var13, (float) var11.field2589 / 2.0F + (float) var14, var11.field2595 * 4096 / var46, var11.field2613, 1, var48, 1);
                                            } else if (var11.field2595 == var46 && var11.field2589 == var47) {
                                                var44.method793(var13, var14, 1, var48, 1);
                                            } else {
                                                var44.method792(var13, var14, var11.field2595, var11.field2589, 1, var48, 1);
                                            }
                                        } else if (var11.field2613 != 0) {
                                            var44.method1961((float) var11.field2595 / 2.0F + (float) var13, (float) var11.field2589 / 2.0F + (float) var14, var11.field2595 * 4096 / var46, var11.field2613);
                                        } else if (var11.field2595 == var46 && var11.field2589 == var47) {
                                            var44.method1958(var13, var14);
                                        } else {
                                            var44.method1962(var13, var14, var11.field2595, var11.field2589);
                                        }
                                    } else if (class68.field929) {
                                        class205.method1396(102, var11);
                                    }
                                }
                            } else if (var11.field2655 == 6) {
                                class1.method6(-50);
                                class57 var53 = null;
                                int var54 = 0;
                                if (var11.field2605 != -1) {
                                    class184 var55 = class23.field309.method2364((byte) 118, var11.field2605);
                                    if (var55 != null) {
                                        class184 var56 = var55.method1264(7034, var11.field2652);
                                        class356 var57 = var11.field2616 == -1 ? null : class170.field2423.method1586(var11.field2616, (byte) 36);
                                        class330 var58 = var11.field2556 ? class472.field6622.field3833 : null;
                                        var53 = var56.method1260(var11.field2568, 1, 64, class138.field1976, var11.field2563, var11.field2535, 1024, var57, var58);
                                        if (var53 == null) {
                                            class205.method1396(71, var11);
                                        } else {
                                            var54 = -var53.method400() / 2;
                                        }
                                    }
                                } else if (var11.field2584 == 5) {
                                    int var63 = var11.field2572;
                                    if (var63 >= 0 && var63 < 2048) {
                                        class257 var64 = class40.field565[var63];
                                        class356 var65 = var11.field2616 == -1 ? null : class170.field2423.method1586(var11.field2616, (byte) 36);
                                        if (var64 != null && (class263.field3910 == var63 || class256.method1688(-29818, var64.field3839) == var11.field2564)) {
                                            var53 = var64.field3833.method2029(var11.field2535, true, 0, class170.field2423, (class356) null, class315.field4736, var65, 0, var11.field2568, 1024, -1, class448.field6339, class138.field1976, class158.field2197, false, (class414[]) null, class297.field4454, class23.field309, var11.field2563);
                                        }
                                    }
                                } else if (var11.field2584 == 8 || var11.field2584 == 9) {
                                    class341 var60 = class271.method1763(false, var11.field2572, false);
                                    class356 var61 = var11.field2616 == -1 ? null : class170.field2423.method1586(var11.field2616, (byte) 36);
                                    if (var60 != null) {
                                        class330 var62 = var11.field2556 ? class472.field6622.field3833 : null;
                                        var53 = var60.method2091(var11.field2584 == 9, var61, var11.field2563, var62, 1024, var11.field2568, var11.field2564, 1317929992, class138.field1976, var11.field2535);
                                    }
                                } else if (var11.field2616 == -1) {
                                    var53 = var11.method1232(class315.field4736, -1, class170.field2423, class138.field1976, 1024, class472.field6622.field3833, class23.field309, (class356) null, class448.field6339, 0, -1, 0, class158.field2197, class297.field4454);
                                    if (var53 == null && class68.field929) {
                                        class205.method1396(99, var11);
                                    }
                                } else {
                                    class356 var59 = class170.field2423.method1586(var11.field2616, (byte) 36);
                                    var53 = var11.method1232(class315.field4736, var11.field2563, class170.field2423, class138.field1976, 1024, class472.field6622.field3833, class23.field309, var59, class448.field6339, var11.field2535, var11.field2568, 0, class158.field2197, class297.field4454);
                                    if (var53 == null && class68.field929) {
                                        class205.method1396(74, var11);
                                    }
                                }
                                if (var53 != null) {
                                    int var66;
                                    if (var11.field2598 > 0) {
                                        var66 = (var11.field2595 << 9) / var11.field2598;
                                    } else {
                                        var66 = 512;
                                    }
                                    int var67;
                                    if (var11.field2573 > 0) {
                                        var67 = (var11.field2589 << 9) / var11.field2573;
                                    } else {
                                        var67 = 512;
                                    }
                                    int var68 = (var11.field2665 * var66 >> 9) + var13 + (var11.field2595 / 2);
                                    int var69 = var11.field2589 / 2 + (var14 + (var11.field2553 * var67 >> 9));
                                    class227.field3321.method488();
                                    class138.field1976.method544(class227.field3321);
                                    int var70 = class172.field2450[var11.field2516 << 3] * var11.field2583 >> 15;
                                    int var71 = class172.field2456[var11.field2516 << 3] * var11.field2583 >> 15;
                                    class138.field1976.method516(var68, var69, var66, var67);
                                    class138.field1976.method501((float) var11.field2542, var11.field2538 ? (float) var11.field2626 : (float) var11.field2626 * 1.5F);
                                    if (arg2 == -1412584499 || class2.field41) {
                                        class138.field1976.method493();
                                        class138.field1976.method563();
                                        class138.field1976.method500(arg9, arg4, arg3, arg1);
                                        class2.field41 = false;
                                    }
                                    if (var11.field2529) {
                                        class138.field1976.method494(false);
                                    }
                                    class263.field3908.method485(-var11.field2667 << 3);
                                    class263.field3908.method487(var11.field2656 << 3);
                                    class263.field3908.method478(var11.field2651, var54 + var70 + var11.field2515, var11.field2515 + var71);
                                    class263.field3908.method477(var11.field2516 << 3);
                                    if (class294.field4430) {
                                        class138.field1976.method572(var13, var14, var11.field2595 + var13, var11.field2589 + var14);
                                    }
                                    if (var11.field2538) {
                                        var53.method405(class263.field3908, (class117) null, var11.field2583, 1);
                                    } else {
                                        var53.method404(class263.field3908, (class117) null, 1);
                                    }
                                    if (class294.field4430) {
                                        class138.field1976.method500(arg9, arg4, arg3, arg1);
                                    }
                                    if (var11.field2529) {
                                        class138.field1976.method494(true);
                                    }
                                }
                            } else if (var11.field2655 == 9) {
                                int var72;
                                int var73;
                                int var74;
                                int var75;
                                if (var11.field2661) {
                                    var72 = var11.field2595 + var13;
                                    var73 = var11.field2589 + var14;
                                    var74 = var14;
                                    var75 = var13;
                                } else {
                                    var72 = var11.field2595 + var13;
                                    var74 = var11.field2589 + var14;
                                    var73 = var14;
                                    var75 = var13;
                                }
                                if (var11.field2659 == 1) {
                                    class138.field1976.method551(var75, var73, var72, var74, var11.field2625, 0);
                                } else {
                                    class138.field1976.method538(var75, var73, var72, var74, var11.field2625, var11.field2659, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)V", line = 662)
    public static void method2328(int arg0) {
        if (arg0 == -1391) {
            field5651 = null;
            field5650 = null;
        }
    }
}
