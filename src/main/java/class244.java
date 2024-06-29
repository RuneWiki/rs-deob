import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class244 {

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field3242 = 1;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "Lh;")
    public static class434 field3243 = new class434(13, 5);

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field3245 = 0;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "J")
    public static long field3246;

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "[C")
    public static char[] field3248;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "Lgd;")
    public static class206 field3247;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "[[S")
    public static short[][] field3249;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
    public static void method1359(int arg0) {
        if (arg0 != -29301) {
            field3246 = -80L;
        }
        field3249 = null;
        field3243 = null;
        field3247 = null;
        field3248 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II[Lnk;BIIIIII)V")
    public static final void method1360(int arg0, int arg1, class464[] arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3244++;
        class98.field1432.method1981(arg6, arg4, arg7, arg0);
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class464 var12 = arg2[var10];
            if (var12 != null && (var12.field6362 == arg1 || arg1 == -1412584499 && class385.field5314 == var12)) {
                int var13;
                if (arg8 == -1) {
                    class341.field4560[class318.field4195].setBounds(var12.field6412 + arg9, var12.field6323 - -arg5, var12.field6308, var12.field6340);
                    var13 = class318.field4195++;
                } else {
                    var13 = arg8;
                }
                var12.field6329 = var13;
                var12.field6349 = class70.field968;
                if (!client.method1045(var12)) {
                    if (var12.field6359 != 0) {
                        class324.method1799((byte) 125, var12);
                    }
                    int var14 = var12.field6412 + arg9;
                    int var15 = var12.field6323 + arg5;
                    int var16 = var12.field6425;
                    if (class200.field2704 && (client.method1046(var12).field2954 != 0 || var12.field6358 == 0) && var16 > 127) {
                        var16 = 127;
                    }
                    if (class385.field5314 == var12) {
                        if (arg1 != -1412584499 && (class192.field2608 == var12.field6372 || class162.field2256 == var12.field6372)) {
                            class235.field3114 = arg5;
                            class300.field4013 = arg9;
                            class252.field3366 = arg2;
                            continue;
                        }
                        if (class252.field3365 && class135.field1970) {
                            int var17 = class34.field523.method1916((byte) -21);
                            int var18 = class34.field523.method1925(50);
                            int var19 = var18 - class291.field3910;
                            int var20 = var17 - class200.field2714;
                            if (var20 < class348.field4797) {
                                var20 = class348.field4797;
                            }
                            if (class82.field1084 > var19) {
                                var19 = class82.field1084;
                            }
                            if ((class348.field4797 + class65.field858.field6308) < (var20 + var12.field6308)) {
                                var20 = class348.field4797 + class65.field858.field6308 - var12.field6308;
                            }
                            var14 = var20;
                            if (var19 + var12.field6340 > class82.field1084 - -class65.field858.field6340) {
                                var19 = class82.field1084 + class65.field858.field6340 - var12.field6340;
                            }
                            var15 = var19;
                        }
                        if (class162.field2256 == var12.field6372) {
                            var16 = 128;
                        }
                    }
                    int var23;
                    int var24;
                    int var25;
                    int var26;
                    if (var12.field6358 == 2) {
                        var26 = arg0;
                        var23 = arg4;
                        var24 = arg6;
                        var25 = arg7;
                    } else {
                        int var21 = var12.field6308 + var14;
                        int var22 = var12.field6340 + var15;
                        var23 = var15 > arg4 ? var15 : arg4;
                        var24 = var14 > arg6 ? var14 : arg6;
                        if (var12.field6358 == 9) {
                            var22++;
                            var21++;
                        }
                        var25 = arg7 <= var21 ? arg7 : var21;
                        var26 = arg0 <= var22 ? arg0 : var22;
                    }
                    if (var25 > var24 && var23 < var26) {
                        if (var12.field6359 != 0) {
                            if (class317.field4182 == var12.field6359 || class358.field4943 == var12.field6359) {
                                class60.method422((byte) 101, var15, var14, class358.field4943 == var12.field6359, var12.field6308, var12.field6340);
                                class102.field1468[var13] = true;
                                class98.field1432.method1981(arg6, arg4, arg7, arg0);
                                continue;
                            }
                            if (class92.field1352 == var12.field6359) {
                                if (var12.method2738((byte) 104, class98.field1432) != null) {
                                    class183.method1073(-1);
                                    class142.method861(var12, class98.field1432, var15, var14, (byte) 58);
                                    class385.field5327[var13] = true;
                                    class98.field1432.method1981(arg6, arg4, arg7, arg0);
                                }
                                continue;
                            }
                            if (class134.field1954 == var12.field6359) {
                                if (var12.method2738((byte) 118, class98.field1432) != null) {
                                    class314.method1724(var12, 3, var14, var15);
                                    class385.field5327[var13] = true;
                                    class98.field1432.method1981(arg6, arg4, arg7, arg0);
                                }
                                continue;
                            }
                            if (class491.field6865 == var12.field6359) {
                                class367.method2241(-9274, class248.field3300, var12.field6340, var15, var12.field6308, var14, class98.field1432);
                                class102.field1468[var13] = true;
                                class98.field1432.method1981(arg6, arg4, arg7, arg0);
                                continue;
                            }
                            if (class458.field6220 == var12.field6359) {
                                class203.method1159(var14, var12.field6340, var15, 16776960, var12.field6308, class98.field1432);
                                class102.field1468[var13] = true;
                                class98.field1432.method1981(arg6, arg4, arg7, arg0);
                                continue;
                            }
                            if (class73.field1003 == var12.field6359) {
                                if (!class165.field2286 && !class417.field5672) {
                                    continue;
                                }
                                int var27 = var12.field6308 + var14;
                                int var28 = var15 + 15;
                                if (class165.field2286) {
                                    class284.field3828.method2125(var27, var28, -1, "Fps:" + class437.field5935, 0, -256);
                                    var28 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                    }
                                    class284.field3828.method2125(var27, var28, -1, "Mem:" + var30 + "k", 0, var31);
                                    var28 += 15;
                                    class284.field3828.method2125(var27, var28, -1, "In:" + class346.field4769 + "B/s Out:" + class78.field1057 + "B/s", 0, -256);
                                    var28 += 15;
                                    int var32 = class98.field1432.method2086() / 1024;
                                    class284.field3828.method2125(var27, var28, -1, "Offheap:" + var32 + "k", 0, var32 <= 65536 ? -256 : -65536);
                                    var28 += 15;
                                    int var33 = 0;
                                    int var34 = 0;
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < 29; var36++) {
                                        var33 += class80.field1074[var36].method2511((byte) -120);
                                        var34 += class80.field1074[var36].method2514(20);
                                        var35 += class80.field1074[var36].method2513(false);
                                    }
                                    int var37 = var35 * 100 / var33;
                                    int var38 = var34 * 10000 / var33;
                                    String var39 = "Cache:" + class72.method469((long) var38, 0, false, true, 2) + "% (" + var37 + "%)";
                                    class490.field6832.method2125(var27, var28, -1, var39, 0, -256);
                                    var28 += 12;
                                }
                                if (class169.field2335 > 0) {
                                    class490.field6832.method2125(var27, var28, -1, "Particles: " + class409.field5605 + " / " + class169.field2335, 0, -256);
                                }
                                var28 += 12;
                                if (class417.field5672) {
                                    class490.field6832.method2125(var27, var28, -1, "Polys: " + class98.field1432.method2047() + " Models: " + class98.field1432.method2046(), 0, -256);
                                    var28 += 12;
                                    class490.field6832.method2125(var27, var28, -1, "Ls: " + class18.field259 + " La: " + class272.field3620 + " NPC: " + class182.field2499 + " Pl: " + class114.field1713, 0, -256);
                                    var28 += 12;
                                    class372.method2289(6352);
                                }
                                class102.field1468[var13] = true;
                                continue;
                            }
                        }
                        if (var12.field6358 == 0) {
                            if (class316.field4175 == var12.field6359 && class98.field1432.method2109()) {
                                class98.field1432.method2091(var14, var15, var12.field6308, var12.field6340);
                            }
                            method1360(var26, var12.field6440, arg2, (byte) 48, var23, var15 - var12.field6333, var24, var25, var13, var14 - var12.field6330);
                            if (var12.field6360 != null) {
                                method1360(var26, var12.field6440, var12.field6360, (byte) 84, var23, var15 - var12.field6333, var24, var25, var13, var14 - var12.field6330);
                            }
                            class132 var40 = (class132) class214.field2883.method1528((long) var12.field6440, 121);
                            if (var40 != null) {
                                class317.method1739(var23, var26, var25, -16516, var40.field1939, var13, var15, var24, var14);
                            }
                            if (class316.field4175 == var12.field6359 && class98.field1432.method2109()) {
                                class98.field1432.method2083();
                                class243.field3239 = true;
                            }
                            class98.field1432.method1981(arg6, arg4, arg7, arg0);
                        }
                        if (class42.field595[var13] || class318.field4197 > 1) {
                            if (var12.field6358 == 3) {
                                if (var16 == 0) {
                                    if (var12.field6430) {
                                        class98.field1432.method2003(var14, var15, var12.field6308, var12.field6340, var12.field6382, 0);
                                    } else {
                                        class98.field1432.method1973(var14, var15, var12.field6308, var12.field6340, var12.field6382, 0);
                                    }
                                } else if (var12.field6430) {
                                    class98.field1432.method2003(var14, var15, var12.field6308, var12.field6340, var12.field6382 & 0xFFFFFF | 255 - (var16 & 0xFF) << 24, 1);
                                } else {
                                    class98.field1432.method1973(var14, var15, var12.field6308, var12.field6340, 255 - (var16 & 0xFF) << 24 | var12.field6382 & 0xFFFFFF, 1);
                                }
                            } else if (var12.field6358 == 4) {
                                class345 var41 = var12.method2730(class98.field1432, (byte) 101);
                                if (var41 != null) {
                                    int var42 = var12.field6382;
                                    String var43 = var12.field6439;
                                    if (var12.field6402 != -1) {
                                        class443 var44 = class175.field2385.method1557(var12.field6402, 21992);
                                        var43 = var44.field5996;
                                        if (var43 == null) {
                                            var43 = "null";
                                        }
                                        if ((var44.field6016 == 1 || var12.field6294 != 1) && var12.field6294 != -1) {
                                            var43 = "<col=ff9040>" + var43 + "</col> x" + class68.method452(0, var12.field6294);
                                        }
                                    }
                                    if (class16.field231 == var12) {
                                        var43 = class125.field1819.method1176(class110.field1676, (byte) -94);
                                        var42 = var12.field6382;
                                    }
                                    if (class236.field3120) {
                                        class98.field1432.method1969(var14, var15, var12.field6308 + var14, var12.field6340 + var15);
                                    }
                                    var41.method2120(0, var12.field6409, var14, var12.field6398, var12.field6427 ? 255 - (var16 & 0xFF) << 24 : -1, (int[]) null, 0, (class152) null, var12.field6340, var43, 1, var12.field6391, var15, class471.field6498, var42 | 255 - (var16 & 0xFF) << 24, var12.field6308);
                                    if (class236.field3120) {
                                        class98.field1432.method1981(arg6, arg4, arg7, arg0);
                                    }
                                } else if (class127.field1856) {
                                    class490.method2854(var12, (byte) 102);
                                }
                            } else if (var12.field6358 == 5) {
                                if (var12.field6367 < 0) {
                                    class139 var46;
                                    if (var12.field6402 == -1) {
                                        var46 = var12.method2742(false, class98.field1432);
                                    } else {
                                        class202 var45 = var12.field6297 ? class233.field3103.field6783 : null;
                                        var46 = class175.field2385.method1556(64, var12.field6414, var12.field6402, var45, class98.field1432, var12.field6320 | 0xFF000000, var12.field6366, var12.field6294);
                                    }
                                    if (var46 != null) {
                                        int var47 = var46.method777();
                                        int var48 = var46.method774();
                                        if (var12.field6379) {
                                            class98.field1432.method1969(var14, var15, var12.field6308 + var14, var12.field6340 + var15);
                                            if (var12.field6419 != 0) {
                                                int var49 = (var47 + var12.field6308 - 1) / var47;
                                                int var50 = (var12.field6340 + var48 - 1) / var48;
                                                for (int var51 = 0; var51 < var49; var51++) {
                                                    for (int var52 = 0; var52 < var50; var52++) {
                                                        var46.method837((float) var47 / 2.0F + (float) (var47 * var51 + var14), (float) var48 / 2.0F + (float) (var48 * var52 + var15), 4096, var12.field6419);
                                                    }
                                                }
                                            } else if (var16 == 0) {
                                                var46.method776(var14, var15, var12.field6308, var12.field6340, 0, 0, 1);
                                            } else {
                                                var46.method776(var14, var15, var12.field6308, var12.field6340, 1, 255 - (var16 & 0xFF) << 24 | 0xFFFFFF, 1);
                                            }
                                            class98.field1432.method1981(arg6, arg4, arg7, arg0);
                                        } else if (var16 != 0) {
                                            int var53 = 255 - (var16 & 0xFF) << 24 | 0xFFFFFF;
                                            if (var12.field6419 != 0) {
                                                var46.method844((float) var12.field6308 / 2.0F + (float) var14, (float) var12.field6340 / 2.0F + (float) var15, var12.field6308 * 4096 / var47, var12.field6419, 1, var53, 1);
                                            } else if (var12.field6308 == var47 && var12.field6340 == var48) {
                                                var46.method768(var14, var15, 1, var53, 1);
                                            } else {
                                                var46.method773(var14, var15, var12.field6308, var12.field6340, 1, var53, 1);
                                            }
                                        } else if (var12.field6419 != 0) {
                                            var46.method837((float) var12.field6308 / 2.0F + (float) var14, (float) var12.field6340 / 2.0F + (float) var15, var12.field6308 * 4096 / var47, var12.field6419);
                                        } else if (var12.field6308 == var47 && var12.field6340 == var48) {
                                            var46.method836(var14, var15);
                                        } else {
                                            var46.method838(var14, var15, var12.field6308, var12.field6340);
                                        }
                                    } else if (class127.field1856) {
                                        class490.method2854(var12, (byte) 50);
                                    }
                                } else {
                                    var12.method2740(1, class391.field5430, class135.field1973).method2691(var12.field6406 << 3, 0, class98.field1432, var12.field6340, var12.field6352 << 3, 0, var14, 0, var12.field6308, var15);
                                }
                            } else if (var12.field6358 == 6) {
                                class476.method2781(-60);
                                class456 var54 = null;
                                int var55 = 0;
                                if (var12.field6402 != -1) {
                                    class443 var56 = class175.field2385.method1557(var12.field6402, 21992);
                                    if (var56 != null) {
                                        class443 var57 = var56.method2599(var12.field6294, -1);
                                        class181 var58 = var12.field6401 == -1 ? null : class395.field5477.method266(16107, var12.field6401);
                                        class202 var59 = var12.field6297 ? class233.field3103.field6783 : null;
                                        var54 = var57.method2593(var12.field6370, -1, 1024, var12.field6438, var58, class98.field1432, 1, var59, var12.field6307);
                                        if (var54 == null) {
                                            class490.method2854(var12, (byte) 85);
                                        } else {
                                            var55 = -var54.method1871() / 2;
                                        }
                                    }
                                } else if (var12.field6380 == 5) {
                                    int var60 = var12.field6431;
                                    if (var60 >= 0 && var60 < 2048) {
                                        class487 var61 = class413.field5644[var60];
                                        class181 var62 = var12.field6401 == -1 ? null : class395.field5477.method266(16107, var12.field6401);
                                        if (var61 != null && (class332.field4494 == var60 || class284.method1599(99, var61.field6742) == var12.field6289)) {
                                            var54 = var61.field6783.method1156(var12.field6370, true, class193.field2611, class395.field5477, class28.field366, var62, var12.field6438, 0, 1024, -1, true, 0, (class181) null, class38.field562, class175.field2385, class98.field1432, class150.field2121, (class298[]) null, var12.field6307);
                                        }
                                    }
                                } else if (var12.field6380 == 8 || var12.field6380 == 9) {
                                    class257 var64 = class80.method525(false, -7967, var12.field6431);
                                    class181 var65 = var12.field6401 == -1 ? null : class395.field5477.method266(16107, var12.field6401);
                                    if (var64 != null) {
                                        class202 var66 = var12.field6297 ? class233.field3103.field6783 : null;
                                        var54 = var64.method1446(var12.field6307, var12.field6370, 1024, var12.field6289, var12.field6380 == 9, var65, var12.field6438, -96, var66, class98.field1432);
                                    }
                                } else if (var12.field6401 == -1) {
                                    var54 = var12.method2734(0, -1, class175.field2385, class38.field562, 65535, (class181) null, class193.field2611, class233.field3103.field6783, class150.field2121, -1, class395.field5477, 1024, class28.field366, class98.field1432);
                                    if (var54 == null && class127.field1856) {
                                        class490.method2854(var12, (byte) 33);
                                    }
                                } else {
                                    class181 var63 = class395.field5477.method266(16107, var12.field6401);
                                    var54 = var12.method2734(var12.field6370, var12.field6438, class175.field2385, class38.field562, 65535, var63, class193.field2611, class233.field3103.field6783, class150.field2121, var12.field6307, class395.field5477, 1024, class28.field366, class98.field1432);
                                    if (var54 == null && class127.field1856) {
                                        class490.method2854(var12, (byte) 99);
                                    }
                                }
                                if (var54 != null) {
                                    int var67;
                                    if (var12.field6314 <= 0) {
                                        var67 = 512;
                                    } else {
                                        var67 = (var12.field6308 << 9) / var12.field6314;
                                    }
                                    int var68;
                                    if (var12.field6350 > 0) {
                                        var68 = (var12.field6340 << 9) / var12.field6350;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69 = var12.field6308 / 2 + var14 + (var12.field6416 * var67 >> 9);
                                    int var70 = (var12.field6322 * var68 >> 9) + var12.field6340 / 2 + var15;
                                    class62.field820.method1023();
                                    class98.field1432.method1956(class62.field820);
                                    int var71 = class364.field4994[var12.field6445 << 3] * var12.field6324 >> 15;
                                    int var72 = class364.field4992[var12.field6445 << 3] * var12.field6324 >> 15;
                                    class98.field1432.method1975(var69, var70, var67, var68);
                                    class98.field1432.method1997((float) var12.field6292, var12.field6423 ? (float) var12.field6404 : (float) var12.field6404 * 1.5F);
                                    if (arg1 == -1412584499 || class243.field3239) {
                                        class98.field1432.method2006();
                                        class98.field1432.method2005();
                                        class98.field1432.method1981(arg6, arg4, arg7, arg0);
                                        class243.field3239 = false;
                                    }
                                    if (var12.field6417) {
                                        class98.field1432.method2069(false);
                                    }
                                    class208.field2814.method1028(-var12.field6443 << 3);
                                    class208.field2814.method1032(var12.field6361 << 3);
                                    class208.field2814.method1027(var12.field6365, var12.field6312 + var71 + var55, var12.field6312 + var72);
                                    class208.field2814.method1034(var12.field6445 << 3);
                                    if (class236.field3120) {
                                        class98.field1432.method1969(var14, var15, var12.field6308 + var14, var12.field6340 + var15);
                                    }
                                    if (var12.field6423) {
                                        var54.method1888(class208.field2814, (class478) null, var12.field6324, 1);
                                    } else {
                                        var54.method1880(class208.field2814, (class478) null, 1);
                                    }
                                    if (class236.field3120) {
                                        class98.field1432.method1981(arg6, arg4, arg7, arg0);
                                    }
                                    if (var12.field6417) {
                                        class98.field1432.method2069(true);
                                    }
                                }
                            } else if (var12.field6358 == 9) {
                                int var73;
                                int var74;
                                int var75;
                                int var76;
                                if (var12.field6428) {
                                    var73 = var12.field6308 + var14;
                                    var74 = var15;
                                    var75 = var14;
                                    var76 = var15 + var12.field6340;
                                } else {
                                    var75 = var14;
                                    var73 = var14 + var12.field6308;
                                    var74 = var15 + var12.field6340;
                                    var76 = var15;
                                }
                                if (var12.field6290 == 1) {
                                    class98.field1432.method2031(var75, var76, var73, var74, var12.field6382, 0);
                                } else {
                                    class98.field1432.method2010(var75, var76, var73, var74, var12.field6382, var12.field6290, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var11 = -2 / ((-arg3 - 22) / 62);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V")
    public static final void method1361(int arg0, int arg1, int arg2) {
        class491 var3 = class289.field3897[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field6840 != null) {
            var3.field6840 = null;
        }
        if (var3.field6849 != null) {
            var3.field6849 = null;
        }
    }

    static {
        new class206("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field3246 = 0L;
        field3248 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };
        field3247 = new class206("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");
        field3249 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };
    }
}
