import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class135 {

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "Z")
    public static boolean field1794 = false;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field1793 = 1;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIII[Lro;IIII)V", line = 4)
    public static final void method906(int arg0, int arg1, int arg2, int arg3, int arg4, class249[] arg5, int arg6, int arg7, int arg8, int arg9) {
        class35.field574.method2155(arg4, arg2, arg6, arg0);
        field1792++;
        for (int var10 = 0; var10 < arg5.length; var10++) {
            class249 var12 = arg5[var10];
            if (var12 != null && (var12.field3623 == arg8 || arg8 == -1412584499 && class372.field5533 == var12)) {
                int var13;
                if (arg3 == -1) {
                    class94.field1303[class442.field6463].setBounds(var12.field3609 + arg1, var12.field3510 + arg9, var12.field3578, var12.field3604);
                    var13 = class442.field6463++;
                } else {
                    var13 = arg3;
                }
                var12.field3488 = var13;
                var12.field3528 = class50.field698;
                if (!var12.field3522 || !client.method1557(var12)) {
                    if (var12.field3608 > 0) {
                        class190.method1182(var12, -2108);
                    }
                    int var14 = var12.field3609 + arg1;
                    int var15 = var12.field3510 + arg9;
                    int var16 = var12.field3536;
                    if (class381.field5720 && (client.method1572(var12).field2514 != 0 || var12.field3637 == 0) && var16 > 127) {
                        var16 = 127;
                    }
                    if (class372.field5533 == var12) {
                        if (arg8 != -1412584499 && !var12.field3603) {
                            class361.field5287 = arg5;
                            class220.field3127 = arg1;
                            class180.field2391 = arg9;
                            continue;
                        }
                        if (!var12.field3603) {
                            var16 = 128;
                        }
                        if (class17.field206 && class370.field5510) {
                            int var17 = class34.field555;
                            int var18 = class316.field4522;
                            int var19 = var17 - class139.field1858;
                            if (var19 < class73.field992) {
                                var19 = class73.field992;
                            }
                            int var20 = var18 - class58.field837;
                            if (var20 < class54.field803) {
                                var20 = class54.field803;
                            }
                            if (var12.field3578 + var19 > class73.field992 - -class194.field2785.field3578) {
                                var19 = class73.field992 + class194.field2785.field3578 - var12.field3578;
                            }
                            var14 = var19;
                            if (var12.field3604 + var20 > class54.field803 - -class194.field2785.field3604) {
                                var20 = class54.field803 + class194.field2785.field3604 - var12.field3604;
                            }
                            var15 = var20;
                        }
                    }
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    if (var12.field3637 == 2) {
                        var21 = arg6;
                        var22 = arg2;
                        var23 = arg4;
                        var24 = arg0;
                    } else {
                        int var25 = var12.field3578 + var14;
                        int var26 = var12.field3604 + var15;
                        var22 = arg2 >= var15 ? arg2 : var15;
                        if (var12.field3637 == 9) {
                            var26++;
                            var25++;
                        }
                        var23 = arg4 >= var14 ? arg4 : var14;
                        var21 = arg6 <= var25 ? arg6 : var25;
                        var24 = arg0 <= var26 ? arg0 : var26;
                    }
                    if (!var12.field3522 || var23 < var21 && var22 < var24) {
                        if (var12.field3608 != 0) {
                            if (var12.field3608 == 1337 || var12.field3608 == 1403) {
                                class335.method2222(var15, -82, var14, var12.field3604, var12.field3608 == 1403, var12.field3578);
                                class85.field1178[var13] = true;
                                class35.field574.method2155(arg4, arg2, arg6, arg0);
                                continue;
                            }
                            if (var12.field3608 == 1338) {
                                if (var12.method1536(0, class35.field574) != null) {
                                    class87.method540(107);
                                    class315.method1964((byte) 96, var14, class35.field574, var12, var15);
                                    class159.field2084[var13] = true;
                                    class35.field574.method2155(arg4, arg2, arg6, arg0);
                                }
                                continue;
                            }
                            if (var12.field3608 == 1339) {
                                if (var12.method1536(0, class35.field574) != null) {
                                    class85.method531(var15, (byte) -55, var12, var14);
                                    class159.field2084[var13] = true;
                                    class35.field574.method2155(arg4, arg2, arg6, arg0);
                                }
                                continue;
                            }
                            if (var12.field3608 == 1400) {
                                class337.method2237(var12.field3578, var14, var15, -117, class35.field574, class364.field5327, var12.field3604);
                                class85.field1178[var13] = true;
                                class35.field574.method2155(arg4, arg2, arg6, arg0);
                                continue;
                            }
                            if (var12.field3608 == 1401) {
                                class94.method581(-25, class35.field574, var15, var12.field3578, var12.field3604, var14);
                                class85.field1178[var13] = true;
                                class35.field574.method2155(arg4, arg2, arg6, arg0);
                                continue;
                            }
                            if (var12.field3608 == 1405) {
                                if (!class423.field6298 && !class51.field756) {
                                    continue;
                                }
                                int var27 = var12.field3578 + var14;
                                int var28 = var15 + 15;
                                if (class423.field6298) {
                                    class311.field4456.method1328(-1, (byte) -79, var27, "Fps:" + class33.field551, -256, var28);
                                    var28 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                    }
                                    class311.field4456.method1328(-1, (byte) -95, var27, "Mem:" + var30 + "k", var31, var28);
                                    var28 += 15;
                                    int var32 = class35.field574.method2039() / 1024;
                                    class311.field4456.method1328(-1, (byte) -85, var27, "Offheap:" + var32 + "k", var32 <= 65536 ? -256 : -65536, var28);
                                    var28 += 15;
                                    int var33 = 0;
                                    int var34 = 0;
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < 29; var36++) {
                                        var33 += class417.field6209[var36].method2457(0);
                                        var34 += class417.field6209[var36].method2448(true);
                                        var35 += class417.field6209[var36].method2459(49);
                                    }
                                    int var37 = var35 * 100 / var33;
                                    int var38 = var34 * 10000 / var33;
                                    String var39 = "Cache:" + class417.method2690(true, (long) var38, false, 0, 2) + "% (" + var37 + "%)";
                                    class318.field4547.method1328(-1, (byte) -105, var27, var39, -256, var28);
                                    var28 += 12;
                                }
                                if (class6.field58 > 0) {
                                    class318.field4547.method1328(-1, (byte) -102, var27, "Particles: " + class69.field960 + " / " + class6.field58, -256, var28);
                                }
                                var28 += 12;
                                if (class51.field756) {
                                    class318.field4547.method1328(-1, (byte) -71, var27, "Polys: " + class35.field574.method2092() + " Models: " + class35.field574.method2032(), -256, var28);
                                    var28 += 12;
                                    class318.field4547.method1328(-1, (byte) -71, var27, "Ls: " + class81.field1138 + " La: " + class38.field618 + " NPC: " + class235.field3298 + " Pl: " + class256.field3751, -256, var28);
                                    var28 += 12;
                                    class345.method2300(true);
                                }
                                class85.field1178[var13] = true;
                                continue;
                            }
                        }
                        if (var12.field3637 == 0) {
                            if (!var12.field3522 && client.method1557(var12) && class59.field853 != var12) {
                                continue;
                            }
                            if (!var12.field3522) {
                                if (var12.field3582 > (var12.field3646 - var12.field3604)) {
                                    var12.field3582 = var12.field3646 - var12.field3604;
                                }
                                if (var12.field3582 < 0) {
                                    var12.field3582 = 0;
                                }
                            }
                            if (var12.field3608 == 1407 && class35.field574.method2051()) {
                                class35.field574.method2123(var14, var15, var12.field3578, var12.field3604);
                            }
                            method906(var24, var14 - var12.field3594, var22, var13, var23, arg5, var21, 38, var12.field3622, var15 - var12.field3582);
                            if (var12.field3493 != null) {
                                method906(var24, var14 - var12.field3594, var22, var13, var23, var12.field3493, var21, -127, var12.field3622, var15 - var12.field3582);
                            }
                            class158 var40 = (class158) class269.field3933.method954(-72, (long) var12.field3622);
                            if (var40 != null) {
                                class184.method1136(var22, var40.field2075, var13, (byte) -35, var14, var21, var24, var15, var23);
                            }
                            if (var12.field3608 == 1407 && class35.field574.method2051()) {
                                class35.field574.method2174();
                                class411.field6154 = true;
                            }
                            class35.field574.method2155(arg4, arg2, arg6, arg0);
                        }
                        if (class234.field3286[var13] || class224.field3171 > 1) {
                            if (var12.field3637 == 0 && !var12.field3522 && var12.field3604 < var12.field3646) {
                                class34.method282(var12.field3578 + var14, var12.field3604, var15, var12.field3646, -80, var12.field3582);
                            }
                            if (var12.field3637 != 1) {
                                if (var12.field3637 == 2) {
                                    int var41 = 0;
                                    for (int var42 = 0; var42 < var12.field3489; var42++) {
                                        for (int var43 = 0; var43 < var12.field3607; var43++) {
                                            int var44 = (var12.field3499 + 32) * var43 + var14;
                                            int var45 = var15 + ((var12.field3581 + 32) * var42);
                                            if (var41 < 20) {
                                                var45 += var12.field3504[var41];
                                                var44 += var12.field3490[var41];
                                            }
                                            if (var12.field3567[var41] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var12.field3567[var41] - 1;
                                                if ((var44 + 32) > arg4 && arg6 > var44 && arg2 < var45 + 32 && arg0 > var45 || class229.field3246 == var12 && class396.field5948 == var41) {
                                                    class243 var50;
                                                    if (class394.field5921 == 1 && class91.field1248 == var41 && class73.field990 == var12.field3622) {
                                                        var50 = class439.method2778(class35.field574, 1483, var49, 0, (class103) null, var12.field3585[var41], var12.field3641, 2);
                                                    } else {
                                                        var50 = class439.method2778(class35.field574, 1483, var49, -13623264, (class103) null, var12.field3585[var41], var12.field3641, 1);
                                                    }
                                                    if (var50 == null) {
                                                        class392.method2564(-78, var12);
                                                    } else if (class229.field3246 == var12 && class396.field5948 == var41) {
                                                        int var51 = class316.field4522 - class272.field3975;
                                                        int var52 = class34.field555 - class205.field2966;
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        if (class156.field2048 < 5) {
                                                            var51 = 0;
                                                            var52 = 0;
                                                        }
                                                        var50.method35(var44 + var52, var45 + var51, 0, -2013265920, 1);
                                                        if (arg8 != -1) {
                                                            class249 var53 = arg5[arg8 & 0xFFFF];
                                                            int[] var54 = new int[4];
                                                            class35.field574.method2101(var54);
                                                            int var55 = var54[1];
                                                            int var56 = var54[3];
                                                            if (var55 > (var45 + var51) && var53.field3582 > 0) {
                                                                int var57 = (var55 - var45 - var51) * class175.field2280 / 3;
                                                                if (class175.field2280 * 10 < var57) {
                                                                    var57 = class175.field2280 * 10;
                                                                }
                                                                if (var53.field3582 < var57) {
                                                                    var57 = var53.field3582;
                                                                }
                                                                class272.field3975 += var57;
                                                                var53.field3582 -= var57;
                                                                class392.method2564(-122, var53);
                                                            }
                                                            if ((var45 - (-var51 - 32)) > var56 && var53.field3646 - var53.field3604 > var53.field3582) {
                                                                int var58 = (var45 - (-var51 - 32) - var56) * class175.field2280 / 3;
                                                                if (var58 > class175.field2280 * 10) {
                                                                    var58 = class175.field2280 * 10;
                                                                }
                                                                if ((var53.field3646 - var53.field3604 - var53.field3582) < var58) {
                                                                    var58 = var53.field3646 - var53.field3604 - var53.field3582;
                                                                }
                                                                class272.field3975 -= var58;
                                                                var53.field3582 += var58;
                                                                class392.method2564(-114, var53);
                                                            }
                                                        }
                                                    } else if (class416.field6207 == var12 && class367.field5461 == var41) {
                                                        var50.method35(var44, var45, 0, -2013265920, 1);
                                                    } else {
                                                        var50.method1499(var44, var45);
                                                    }
                                                }
                                            } else if (var12.field3598 != null && var41 < 20) {
                                                class243 var46 = var12.method1544(-1, var41, class35.field574);
                                                if (var46 != null) {
                                                    var46.method1499(var44, var45);
                                                } else if (class132.field1768) {
                                                    class392.method2564(-87, var12);
                                                }
                                            }
                                            var41++;
                                        }
                                    }
                                } else if (var12.field3637 == 3) {
                                    int var59;
                                    if (class213.method1322(var12, (byte) 115)) {
                                        var59 = var12.field3591;
                                        if (class59.field853 == var12 && var12.field3644 != 0) {
                                            var59 = var12.field3644;
                                        }
                                    } else {
                                        var59 = var12.field3634;
                                        if (class59.field853 == var12 && var12.field3618 != 0) {
                                            var59 = var12.field3618;
                                        }
                                    }
                                    if (var16 == 0) {
                                        if (var12.field3534) {
                                            class35.field574.method2188(var14, var15, var12.field3578, var12.field3604, var59, 0);
                                        } else {
                                            class35.field574.method2057(var14, var15, var12.field3578, var12.field3604, var59, 0);
                                        }
                                    } else if (var12.field3534) {
                                        class35.field574.method2188(var14, var15, var12.field3578, var12.field3604, 255 - (var16 & 0xFF) << 24 | var59 & 0xFFFFFF, 1);
                                    } else {
                                        class35.field574.method2057(var14, var15, var12.field3578, var12.field3604, var59 & 0xFFFFFF | 255 - (var16 & 0xFF) << 24, 1);
                                    }
                                } else if (var12.field3637 == 4) {
                                    class213 var60 = var12.method1548(false, class35.field574);
                                    if (var60 != null) {
                                        String var61 = var12.field3524;
                                        int var62;
                                        if (class213.method1322(var12, (byte) 121)) {
                                            var62 = var12.field3591;
                                            if (class59.field853 == var12 && var12.field3644 != 0) {
                                                var62 = var12.field3644;
                                            }
                                            if (var12.field3501.length() > 0) {
                                                var61 = var12.field3501;
                                            }
                                        } else {
                                            var62 = var12.field3634;
                                            if (class59.field853 == var12 && var12.field3618 != 0) {
                                                var62 = var12.field3618;
                                            }
                                        }
                                        if (var12.field3522 && var12.field3588 != -1) {
                                            class193 var63 = class166.method1031(var12.field3588, false);
                                            var61 = var63.field2729;
                                            if (var61 == null) {
                                                var61 = "null";
                                            }
                                            if ((var63.field2692 == 1 || var12.field3472 != 1) && var12.field3472 != -1) {
                                                var61 = "<col=ff9040>" + var61 + "</col> x" + class212.method1311(var12.field3472, true);
                                            }
                                        }
                                        if (class371.field5518 == var12) {
                                            var61 = class413.field6172;
                                            var62 = var12.field3634;
                                        }
                                        if (!var12.field3522) {
                                            var61 = class163.method1015(0, var61, var12);
                                        }
                                        if (class226.field3188) {
                                            class35.field574.method2163(var14, var15, var12.field3578 + var14, var12.field3604 + var15);
                                        }
                                        var60.method1323((int[]) null, (class449) null, 0, var12.field3464, var15, var12.field3533 ? -16777216 : -1, 0, var62 | 0xFF000000, var12.field3604, var12.field3531, 23008, var61, class152.field1983, var14, var12.field3578, var12.field3479);
                                        if (class226.field3188) {
                                            class35.field574.method2155(arg4, arg2, arg6, arg0);
                                        }
                                    } else if (class132.field1768) {
                                        class392.method2564(-124, var12);
                                    }
                                } else if (var12.field3637 == 5) {
                                    if (!var12.field3522) {
                                        class243 var64 = var12.method1543(class213.method1322(var12, (byte) 121), class35.field574, 0);
                                        if (var64 != null) {
                                            var64.method1499(var14, var15);
                                        } else if (class132.field1768) {
                                            class392.method2564(-99, var12);
                                        }
                                    } else if (var12.field3620 >= 0) {
                                        var12.method1541((byte) 93).method567(-26367, class35.field574, var12.field3576 << 3, 0, var15, var12.field3467 << 3, 0, var14, var12.field3578, var12.field3604);
                                    } else {
                                        class243 var65;
                                        if (var12.field3588 == -1) {
                                            var65 = var12.method1543(false, class35.field574, 0);
                                        } else {
                                            class103 var66 = var12.field3560 ? class100.field1350.field2778 : null;
                                            var65 = class439.method2778(class35.field574, 1483, var12.field3588, var12.field3492 | 0xFF000000, var66, var12.field3472, var12.field3641, var12.field3600);
                                        }
                                        if (var65 != null) {
                                            int var67 = var65.method1088();
                                            int var68 = var65.method1091();
                                            if (var12.field3601) {
                                                class35.field574.method2163(var14, var15, var12.field3578 + var14, var12.field3604 + var15);
                                                if (var12.field3548 != 0) {
                                                    int var70 = (-(-var67 - var12.field3578) - 1) / var67;
                                                    int var71 = (var12.field3604 - (1 - var68)) / var68;
                                                    for (int var72 = 0; var72 < var70; var72++) {
                                                        for (int var73 = 0; var73 < var71; var73++) {
                                                            var65.method1497((float) var67 / 2.0F + (float) (var67 * var72 + var14), (float) var68 / 2.0F + (float) (var68 * var73 + var15), 4096, var12.field3548);
                                                        }
                                                    }
                                                } else if (var16 == 0) {
                                                    var65.method1087(var14, var15, var12.field3578, var12.field3604, 0, 0, 1);
                                                } else {
                                                    var65.method1087(var14, var15, var12.field3578, var12.field3604, 1, 255 - (var16 & 0xFF) << 24 | 0xFFFFFF, 1);
                                                }
                                                class35.field574.method2155(arg4, arg2, arg6, arg0);
                                            } else if (var16 != 0) {
                                                int var69 = 255 - (var16 & 0xFF) << 24 | 0xFFFFFF;
                                                if (var12.field3548 != 0) {
                                                    var65.method1498((float) var12.field3578 / 2.0F + (float) var14, (float) var12.field3604 / 2.0F + (float) var15, var12.field3578 * 4096 / var67, var12.field3548, 1, var69, 1);
                                                } else if (var12.field3578 == var67 && var12.field3604 == var68) {
                                                    var65.method35(var14, var15, 1, var69, 1);
                                                } else {
                                                    var65.method32(var14, var15, var12.field3578, var12.field3604, 1, var69, 1);
                                                }
                                            } else if (var12.field3548 != 0) {
                                                var65.method1497((float) var12.field3578 / 2.0F + (float) var14, (float) var12.field3604 / 2.0F + (float) var15, var12.field3578 * 4096 / var67, var12.field3548);
                                            } else if (var12.field3578 == var67 && var12.field3604 == var68) {
                                                var65.method1499(var14, var15);
                                            } else {
                                                var65.method1495(var14, var15, var12.field3578, var12.field3604);
                                            }
                                        } else if (class132.field1768) {
                                            class392.method2564(-86, var12);
                                        }
                                    }
                                } else if (var12.field3637 == 6) {
                                    boolean var74 = class213.method1322(var12, (byte) 119);
                                    int var75;
                                    if (var74) {
                                        var75 = var12.field3465;
                                    } else {
                                        var75 = var12.field3610;
                                    }
                                    class60.method403((byte) 57);
                                    class95 var76 = null;
                                    int var77 = 0;
                                    if (var12.field3588 != -1) {
                                        class193 var78 = class166.method1031(var12.field3588, false);
                                        if (var78 != null) {
                                            class193 var79 = var78.method1199(-11674, var12.field3472);
                                            class15 var80 = var75 == -1 ? null : class391.method2551(var75, (byte) -126);
                                            class103 var81 = var12.field3560 ? class100.field1350.field2778 : null;
                                            var76 = var79.method1205((byte) -59, 1, class35.field574, var12.field3505, var12.field3651, 1024, var80, var81, var12.field3648);
                                            if (var76 == null) {
                                                class392.method2564(-90, var12);
                                            } else {
                                                var77 = -var76.method597() / 2;
                                            }
                                        }
                                    } else if (var12.field3583 == 5) {
                                        if (var12.field3526 == -1) {
                                            var76 = class130.field1746.method701(0, -1, -1, -1, class35.field574, (class15) null, -1, (byte) -103, 1024, (class445[]) null, (class15) null, 0, true);
                                        } else {
                                            int var86 = var12.field3526;
                                            class194 var87;
                                            if (class452.field6590 == var86) {
                                                var87 = class100.field1350;
                                            } else {
                                                var87 = class125.field1664[var86];
                                            }
                                            class15 var88 = var75 == -1 ? null : class391.method2551(var75, (byte) -118);
                                            if (var87 != null && (var86 == 2047 || class259.method1628(22, var87.field2756) == var12.field3624)) {
                                                var76 = var87.field2778.method701(0, var12.field3651, -1, var12.field3648, class35.field574, (class15) null, 0, (byte) -103, 1024, (class445[]) null, var88, var12.field3505, true);
                                            }
                                        }
                                    } else if (var12.field3583 == 8 || var12.field3583 == 9) {
                                        class363 var83 = class191.method1188(var12.field3526, 0);
                                        class15 var84 = var75 == -1 ? null : class391.method2551(var75, (byte) -124);
                                        if (var83 != null) {
                                            class103 var85 = var12.field3560 ? class100.field1350.field2778 : null;
                                            var76 = var83.method2378(class35.field574, var12.field3651, var84, var12.field3624, var12.field3583 == 9, var12.field3648, 1024, false, var85, var12.field3505);
                                        }
                                    } else if (var75 == -1) {
                                        var76 = var12.method1538(var74, -1, class100.field1350.field2778, -1, -30345, class35.field574, 0, 1024, (class15) null);
                                        if (var76 == null && class132.field1768) {
                                            class392.method2564(-104, var12);
                                        }
                                    } else {
                                        class15 var82 = class391.method2551(var75, (byte) -128);
                                        var76 = var12.method1538(var74, var12.field3651, class100.field1350.field2778, var12.field3648, -30345, class35.field574, var12.field3505, 1024, var82);
                                        if (var76 == null && class132.field1768) {
                                            class392.method2564(-101, var12);
                                        }
                                    }
                                    if (var76 != null) {
                                        int var89;
                                        if (var12.field3590 > 0) {
                                            var89 = (var12.field3578 << 9) / var12.field3590;
                                        } else {
                                            var89 = 512;
                                        }
                                        int var90;
                                        if (var12.field3564 > 0) {
                                            var90 = (var12.field3604 << 9) / var12.field3564;
                                        } else {
                                            var90 = 512;
                                        }
                                        int var91 = (var12.field3647 * var89 >> 9) + var12.field3578 / 2 + var14;
                                        int var92 = (var12.field3626 * var90 >> 9) + var12.field3604 / 2 + var15;
                                        class81.field1136.method817();
                                        class35.field574.method2059(class81.field1136);
                                        int var93 = class190.field2644[var12.field3628 << 3] * var12.field3570 >> 15;
                                        int var94 = class190.field2635[var12.field3628 << 3] * var12.field3570 >> 15;
                                        class35.field574.method2074(var91, var92, var89, var90);
                                        class35.field574.method2107((float) var12.field3587, var12.field3643 ? (float) var12.field3550 : (float) var12.field3550 * 1.5F);
                                        if (class411.field6154) {
                                            class35.field574.method2034();
                                            class35.field574.method2033();
                                            class35.field574.method2155(arg4, arg2, arg6, arg0);
                                            class411.field6154 = false;
                                        }
                                        if (var12.field3535) {
                                            class35.field574.method2167(false);
                                        }
                                        if (var12.field3522) {
                                            class361.field5294.method803(-var12.field3475 << 3);
                                            class361.field5294.method820(var12.field3649 << 3);
                                            class361.field5294.method802(var12.field3579, var12.field3557 + var93 + var77, var12.field3557 + var94);
                                        } else {
                                            class361.field5294.method805(var12.field3649 << 3);
                                            class361.field5294.method802(0, var93, var94);
                                        }
                                        class361.field5294.method807(var12.field3628 << 3);
                                        if (class226.field3188) {
                                            class35.field574.method2163(var14, var15, var12.field3578 + var14, var15 - -var12.field3604);
                                        }
                                        if (var12.field3643) {
                                            var76.method586(class361.field5294, (class206) null, var12.field3570, 1);
                                        } else {
                                            var76.method602(class361.field5294, (class206) null, 1);
                                        }
                                        if (class226.field3188) {
                                            class35.field574.method2155(arg4, arg2, arg6, arg0);
                                        }
                                        if (var12.field3535) {
                                            class35.field574.method2167(true);
                                        }
                                    }
                                } else {
                                    if (var12.field3637 == 7) {
                                        class213 var95 = var12.method1548(false, class35.field574);
                                        if (var95 == null) {
                                            if (class132.field1768) {
                                                class392.method2564(-125, var12);
                                            }
                                            continue;
                                        }
                                        int var96 = 0;
                                        for (int var97 = 0; var97 < var12.field3489; var97++) {
                                            for (int var98 = 0; var98 < var12.field3607; var98++) {
                                                if (var12.field3567[var96] > 0) {
                                                    class193 var99 = class166.method1031(var12.field3567[var96] - 1, false);
                                                    String var100;
                                                    if (var99.field2692 != 1 && var12.field3585[var96] == 1) {
                                                        var100 = "<col=ff9040>" + var99.field2729 + "</col>";
                                                    } else {
                                                        var100 = "<col=ff9040>" + var99.field2729 + "</col> x" + class212.method1311(var12.field3585[var96], true);
                                                    }
                                                    int var101 = (var12.field3499 + 115) * var98 + var14;
                                                    int var102 = (var12.field3581 + 12) * var97 + var15;
                                                    if (var12.field3479 == 0) {
                                                        var95.method1335(var12.field3634 | 0xFF000000, 4712, var100, class152.field1983, (int[]) null, var101, var12.field3533 ? -16777216 : -1, var102);
                                                    } else if (var12.field3479 == 1) {
                                                        var95.method1333((byte) -103, class152.field1983, var12.field3634 | 0xFF000000, var101 + 57, (int[]) null, var12.field3533 ? -16777216 : -1, var100, var102);
                                                    } else {
                                                        var95.method1334(var100, (int[]) null, var102, (byte) -105, var101 + 115 - 1, var12.field3533 ? -16777216 : -1, var12.field3634 | 0xFF000000, class152.field1983);
                                                    }
                                                }
                                                var96++;
                                            }
                                        }
                                    }
                                    if (var12.field3637 == 8 && class374.field5639 == var12 && class300.field4309 == class133.field1782) {
                                        int var103 = 0;
                                        int var104 = 0;
                                        class213 var105 = class311.field4456;
                                        String var106 = var12.field3524;
                                        String var107 = class163.method1015(0, var106, var12);
                                        while (var107.length() > 0) {
                                            int var115 = var107.indexOf("<br>");
                                            String var116;
                                            if (var115 == -1) {
                                                var116 = var107;
                                                var107 = "";
                                            } else {
                                                var116 = var107.substring(0, var115);
                                                var107 = var107.substring(var115 + 4);
                                            }
                                            int var117 = class231.field3262.method1029((byte) 120, var116);
                                            var104 += class231.field3262.field2156 + 1;
                                            if (var117 > var103) {
                                                var103 = var117;
                                            }
                                        }
                                        var103 += 6;
                                        var104 += 7;
                                        int var108 = var12.field3578 + var14 - var103 - 5;
                                        int var109 = var12.field3604 + var15 + 5;
                                        if (var108 < var14 + 5) {
                                            var108 = var14 + 5;
                                        }
                                        if (arg0 < (var104 + var109)) {
                                            var109 = arg0 - var104;
                                        }
                                        if (arg6 < (var103 + var108)) {
                                            var108 = arg6 - var103;
                                        }
                                        class35.field574.method2188(var108, var109, var103, var104, -96, 0);
                                        class35.field574.method2057(var108, var109, var103, var104, -16777216, 0);
                                        String var110 = var12.field3524;
                                        int var111 = class231.field3262.field2156 + var109 + 2;
                                        String var112 = class163.method1015(0, var110, var12);
                                        while (var112.length() > 0) {
                                            int var113 = var112.indexOf("<br>");
                                            String var114;
                                            if (var113 == -1) {
                                                var114 = var112;
                                                var112 = "";
                                            } else {
                                                var114 = var112.substring(0, var113);
                                                var112 = var112.substring(var113 + 4);
                                            }
                                            var105.method1319(-8219, var114, -16777216, var111, var108 + 3, -1);
                                            var111 += class231.field3262.field2156 + 1;
                                        }
                                    }
                                    if (var12.field3637 == 9) {
                                        int var118;
                                        int var119;
                                        int var120;
                                        int var121;
                                        if (var12.field3473) {
                                            var118 = var15;
                                            var119 = var12.field3604 + var15;
                                            var120 = var14 + var12.field3578;
                                            var121 = var14;
                                        } else {
                                            var118 = var12.field3604 + var15;
                                            var119 = var15;
                                            var121 = var14;
                                            var120 = var12.field3578 + var14;
                                        }
                                        if (var12.field3638 == 1) {
                                            class35.field574.method2030(var121, var119, var120, var118, var12.field3634, 0);
                                        } else {
                                            class35.field574.method2180(var121, var119, var120, var118, var12.field3634, var12.field3638, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int var11 = -100 / ((-arg7 - 48) / 44);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)Llf;", line = 1052)
    public static final class340 method907(int arg0, int arg1) {
        field1796++;
        class340 var2 = (class340) class11.field128.method209(119, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class242.field3395.method1472(arg1, 1, 0);
        class340 var4 = new class340();
        if (var3 != null) {
            var4.method2248(new class265(var3), arg1, true);
        }
        class11.field128.method202(true, var4, (long) arg1);
        if (arg0 >= -112) {
            method909(-92);
        }
        return var4;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 1079)
    public static final void method908(String arg0, byte arg1) {
        if (arg1 != 53) {
            method906(95, 108, 125, 9, 37, (class249[]) null, -84, -92, -9, -121);
        }
        class215.method1352("", 0, -107, "", 0, arg0);
        field1795++;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I", line = 1106)
    public static final int method909(int arg0) {
        field1797++;
        int var1 = 95 / ((arg0 + 15) / 49);
        return class39.field626;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Ls;", line = 1120)
    public static final class381 method910(int arg0, int arg1, int arg2) {
        class10 var3 = class343.field5032[arg0][arg1][arg2];
        return var3 == null || var3.field124 == null ? null : var3.field124;
    }
}
