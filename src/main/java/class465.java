import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class465 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "[Lxa;")
    public static class424[] field6344;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III[Lfca;IIIIII)V", line = 3)
    public static final void method2633(int arg0, int arg1, int arg2, class188[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 >= -39) {
            return;
        }
        field6345++;
        class9.field103.method1908(arg1, arg6, arg7, arg8);
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class188 var11 = arg3[var10];
            if (var11 != null && (var11.field2414 == arg5 || arg5 == -1412584499 && class377.field5414 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class121.field1564[class264.field3629].setBounds(var11.field2305 + arg2, var11.field2428 - -arg9, var11.field2438, var11.field2371);
                    var12 = class264.field3629++;
                } else {
                    var12 = arg0;
                }
                var11.field2366 = class430.field5984;
                var11.field2467 = var12;
                if (!client.method1409(var11)) {
                    if (var11.field2412 != 0) {
                        class634.method3459(var11, (byte) -8);
                    }
                    int var13 = var11.field2305 + arg2;
                    int var14 = var11.field2428 + arg9;
                    int var15 = var11.field2396;
                    if (class380.field5455 && (client.method1411(var11).field3648 != 0 || var11.field2304 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class377.field5414 == var11) {
                        if (arg5 != -1412584499 && (class80.field1017 == var11.field2402 || class241.field3155 == var11.field2402)) {
                            class630.field8569 = arg2;
                            class518.field7141 = arg9;
                            class303.field4055 = arg3;
                            continue;
                        }
                        if (class299.field3998 && class172.field2156) {
                            int var16 = class592.field8107.method268((byte) -100);
                            int var17 = class592.field8107.method269((byte) -25);
                            int var18 = var17 - class223.field2895;
                            int var19 = var16 - class363.field5238;
                            if (class497.field6716 > var19) {
                                var19 = class497.field6716;
                            }
                            if (class632.field8579 > var18) {
                                var18 = class632.field8579;
                            }
                            if ((var19 + var11.field2438) > (class497.field6716 + class278.field3766.field2438)) {
                                var19 = class278.field3766.field2438 + class497.field6716 - var11.field2438;
                            }
                            var13 = var19;
                            if ((var11.field2371 + var18) > (class632.field8579 + class278.field3766.field2371)) {
                                var18 = class632.field8579 + class278.field3766.field2371 - var11.field2371;
                            }
                            var14 = var18;
                        }
                        if (class241.field3155 == var11.field2402) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field2304 == 2) {
                        var22 = arg6;
                        var24 = arg8;
                        var25 = arg7;
                        var23 = arg1;
                    } else {
                        int var20 = var11.field2438 + var13;
                        int var21 = var11.field2371 + var14;
                        var22 = arg6 < var14 ? var14 : arg6;
                        if (var11.field2304 == 9) {
                            var21++;
                            var20++;
                        }
                        var23 = var13 <= arg1 ? arg1 : var13;
                        var24 = arg8 <= var21 ? arg8 : var21;
                        var25 = arg7 > var20 ? var20 : arg7;
                    }
                    if (var23 < var25 && var22 < var24) {
                        if (var11.field2412 != 0) {
                            if (class668.field9502 == var11.field2412 || class659.field9288 == var11.field2412) {
                                class166.method1107(var11.field2371, var13, var11.field2438, var14, class659.field9288 == var11.field2412, (byte) -118);
                                class200.field2630[var12] = true;
                                class9.field103.method1908(arg1, arg6, arg7, arg8);
                                continue;
                            }
                            if (class327.field4781 == var11.field2412) {
                                if (var11.method1207(class9.field103, 8) != null) {
                                    class155.method1031(-127);
                                    class523.method2983(var11, class9.field103, 4, var14, var13);
                                    class224.field2912[var12] = true;
                                    class9.field103.method1908(arg1, arg6, arg7, arg8);
                                }
                                continue;
                            }
                            if (class484.field6543 == var11.field2412) {
                                if (var11.method1207(class9.field103, 8) != null) {
                                    class628.method3426(var11, false, var13, var14);
                                    class224.field2912[var12] = true;
                                    class9.field103.method1908(arg1, arg6, arg7, arg8);
                                }
                                continue;
                            }
                            if (class350.field5115 == var11.field2412) {
                                class671.method3717(var13, var11.field2438, class9.field103, class576.field7965, 4096, var11.field2371, var14);
                                class200.field2630[var12] = true;
                                class9.field103.method1908(arg1, arg6, arg7, arg8);
                                continue;
                            }
                            if (class9.field87 == var11.field2412) {
                                class2.method7(75, var11.field2371, var11.field2438, var14, var13, class9.field103);
                                class200.field2630[var12] = true;
                                class9.field103.method1908(arg1, arg6, arg7, arg8);
                                continue;
                            }
                            if (class15.field129 == var11.field2412) {
                                if (!class150.field1885 && !class19.field174) {
                                    continue;
                                }
                                int var26 = var13 + var11.field2438;
                                int var27 = var14 + 15;
                                if (class150.field1885) {
                                    int var28 = -256;
                                    if (class59.field826 < 20) {
                                        var28 = -65536;
                                    }
                                    class395.field5658.method1803("Fps:" + class59.field826, -1, var27, var26, (byte) 6, var28);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        if (class52.field683) {
                                            class202.method1274(-26555);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class365.method2239(4, 19074, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                        var31 = -65536;
                                    }
                                    class395.field5658.method1803("Mem:" + var30 + "k", -1, var27, var26, (byte) 123, var31);
                                    var27 += 15;
                                    class395.field5658.method1803("In:" + class659.field9295 + "B/s Out:" + class61.field844 + "B/s", -1, var27, var26, (byte) -85, -256);
                                    var27 += 15;
                                    int var33 = class9.field103.method1950() / 1024;
                                    class395.field5658.method1803("Offheap:" + var33 + "k", -1, var27, var26, (byte) 112, var33 > 65536 ? -65536 : -256);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 34; var37++) {
                                        var34 += class352.field5145[var37].method1612((byte) 127);
                                        var35 += class352.field5145[var37].method1614((byte) 1);
                                        var36 += class352.field5145[var37].method1606((byte) -54);
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class436.method2512((long) var39, -8426, 0, 2, true) + "% (" + var38 + "%)";
                                    class426.field5926.method1803(var40, -1, var27, var26, (byte) -88, -256);
                                    var27 += 12;
                                }
                                if (class443.field6116 > 0) {
                                    class426.field5926.method1803("Particles: " + class84.field1036 + " / " + class443.field6116, -1, var27, var26, (byte) -90, -256);
                                }
                                var27 += 12;
                                if (class19.field174) {
                                    class426.field5926.method1803("Polys: " + class9.field103.method791() + " Models: " + class9.field103.method1889(), -1, var27, var26, (byte) 116, -256);
                                    var27 += 12;
                                    class426.field5926.method1803("Ls: " + class332.field4851 + " La: " + class488.field6586 + " NPC: " + class257.field3565 + " Pl: " + class96.field1186, -1, var27, var26, (byte) -91, -256);
                                    var27 += 12;
                                    class123.method755(-16646);
                                }
                                class200.field2630[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field2304 == 0) {
                            if (class496.field6706 == var11.field2412 && class9.field103.method811()) {
                                class9.field103.method834(var13, var14, var11.field2438, var11.field2371);
                            }
                            method2633(var12, var23, var13 - var11.field2315, arg3, -79, var11.field2387, var22, var25, var24, var14 - var11.field2431);
                            if (var11.field2352 != null) {
                                method2633(var12, var23, var13 - var11.field2315, var11.field2352, -125, var11.field2387, var22, var25, var24, var14 - var11.field2431);
                            }
                            class524 var41 = (class524) class54.field742.method2506(16, (long) var11.field2387);
                            if (var41 != null) {
                                class335.method2137(var14, var41.field7256, var23, var24, var25, var22, true, var13, var12);
                            }
                            if (class496.field6706 == var11.field2412 && class9.field103.method811()) {
                                class9.field103.method829();
                                class187.field2296 = true;
                            }
                            class9.field103.method1908(arg1, arg6, arg7, arg8);
                        }
                        if (class643.field9112[var12] || class664.field9418 > 1) {
                            if (var11.field2304 == 3) {
                                if (var15 == 0) {
                                    if (var11.field2375) {
                                        class9.field103.method1926(var13, var14, var11.field2438, var11.field2371, var11.field2464, 0);
                                    } else {
                                        class9.field103.method1975(var13, var14, var11.field2438, var11.field2371, var11.field2464, 0);
                                    }
                                } else if (var11.field2375) {
                                    class9.field103.method1926(var13, var14, var11.field2438, var11.field2371, 255 - (var15 & 0xFF) << 24 | var11.field2464 & 0xFFFFFF, 1);
                                } else {
                                    class9.field103.method1975(var13, var14, var11.field2438, var11.field2371, 255 - (var15 & 0xFF) << 24 | var11.field2464 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field2304 == 4) {
                                class301 var42 = var11.method1208(class9.field103, -4616);
                                if (var42 != null) {
                                    int var43 = var11.field2464;
                                    String var44 = var11.field2399;
                                    if (var11.field2324 != -1) {
                                        class660 var45 = class237.field3088.method1349(-1, var11.field2324);
                                        var44 = var45.field9309;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field9331 == 1 || var11.field2424 != 1) && var11.field2424 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class603.method3333((byte) 105, var11.field2424);
                                        }
                                    }
                                    if (class12.field114 == var11) {
                                        var44 = class243.field3242.method1491(class350.field5121, (byte) 125);
                                        var43 = var11.field2464;
                                    }
                                    if (class460.field6269) {
                                        class9.field103.method1970(var13, var14, var13 + var11.field2438, var14 - -var11.field2371);
                                    }
                                    var42.method1806(var11.field2349, null, var11.field2318, 0, var11.field2355, 0, null, class615.field8391, var44, var11.field2371, var14, var13, (byte) -50, var11.field2353 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field2338, var43 | 255 - (var15 & 0xFF) << 24, var11.field2438);
                                    if (class460.field6269) {
                                        class9.field103.method1908(arg1, arg6, arg7, arg8);
                                    }
                                } else if (class649.field9203) {
                                    class553.method3100(var11, 0);
                                }
                            } else if (var11.field2304 == 5) {
                                if (var11.field2310 >= 0) {
                                    var11.method1217(class603.field8243, (byte) 57, class502.field6772).method999(0, var11.field2438, var13, class9.field103, var11.field2371, 0, var11.field2359 << 3, 0, var11.field2391 << 3, var14);
                                } else {
                                    class424 var47;
                                    if (var11.field2324 == -1) {
                                        var47 = var11.method1216((byte) 109, class9.field103);
                                    } else {
                                        class351 var46 = var11.field2298 ? class596.field8164.field7193 : null;
                                        var47 = class237.field3088.method1346(var11.field2324, var11.field2424, class9.field103, var11.field2383, var11.field2430, 98, var11.field2362 | 0xFF000000, var46);
                                    }
                                    if (var47 != null) {
                                        int var48 = var47.method1160();
                                        int var49 = var47.method1157();
                                        int var50 = 255 - (var15 & 0xFF) << 24 | (var11.field2464 == 0 ? 16777215 : var11.field2464 & 0xFFFFFF);
                                        if (var11.field2461) {
                                            class9.field103.method1970(var13, var14, var13 + var11.field2438, var11.field2371 + var14);
                                            if (var11.field2357 != 0) {
                                                int var51 = (var11.field2438 - (1 - var48)) / var48;
                                                int var52 = (-(-var49 - var11.field2371) - 1) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field2464 == 0) {
                                                            var47.method2448((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field2357);
                                                        } else {
                                                            var47.method2451((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field2357, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field2464 == 0 && var15 == 0) {
                                                var47.method2452(var13, var14, var11.field2438, var11.field2371);
                                            } else {
                                                var47.method1161(var13, var14, var11.field2438, var11.field2371, 0, var50, 1);
                                            }
                                            class9.field103.method1908(arg1, arg6, arg7, arg8);
                                        } else if (var11.field2464 == 0 && var15 == 0) {
                                            if (var11.field2357 != 0) {
                                                var47.method2448((float) var11.field2438 / 2.0F + (float) var13, (float) var11.field2371 / 2.0F + (float) var14, var11.field2438 * 4096 / var48, var11.field2357);
                                            } else if (var11.field2438 == var48 && var11.field2371 == var49) {
                                                var47.method2450(var13, var14);
                                            } else {
                                                var47.method2446(var13, var14, var11.field2438, var11.field2371);
                                            }
                                        } else if (var11.field2357 != 0) {
                                            var47.method2451((float) var11.field2438 / 2.0F + (float) var13, (float) var11.field2371 / 2.0F + (float) var14, var11.field2438 * 4096 / var48, var11.field2357, 0, var50, 1);
                                        } else if (var11.field2438 == var48 && var11.field2371 == var49) {
                                            var47.method67(var13, var14, 0, var50, 1);
                                        } else {
                                            var47.method65(var13, var14, var11.field2438, var11.field2371, 0, var50, 1);
                                        }
                                    } else if (class649.field9203) {
                                        class553.method3100(var11, 0);
                                    }
                                }
                            } else if (var11.field2304 == 6) {
                                class290.method1724(true);
                                class629 var55 = null;
                                int var56 = 0;
                                if (var11.field2324 != -1) {
                                    class660 var64 = class237.field3088.method1349(-1, var11.field2324);
                                    if (var64 != null) {
                                        class660 var65 = var64.method3656(true, var11.field2424);
                                        class463 var66 = var11.field2386 == -1 ? null : class77.field971.method776(var11.field2386, (byte) -77);
                                        class351 var67 = var11.field2298 ? class596.field8164.field7193 : null;
                                        var55 = var65.method3653(2048, class9.field103, 1, var11.field2368, var11.field2343, -4039, var11.field2316, var67, var66);
                                        if (var55 == null) {
                                            class553.method3100(var11, 0);
                                        } else {
                                            var56 = -var55.method686() >> 1;
                                        }
                                    }
                                } else if (var11.field2301 == 5) {
                                    int var57 = var11.field2302;
                                    if (var57 >= 0 && var57 < 2048) {
                                        class519 var58 = class292.field3912[var57];
                                        class463 var59 = var11.field2386 == -1 ? null : class77.field971.method776(var11.field2386, (byte) 105);
                                        if (var58 != null && (class224.field2907 == var57 || class304.method1828(-91, var58.field7191) == var11.field2317)) {
                                            var55 = var58.field7193.method2200(class327.field4771, 0, class77.field971, -1, (byte) 84, var11.field2343, null, null, class318.field4640, class34.field336, class9.field103, var59, 0, 2048, var11.field2316, class613.field8364, class237.field3088, true, var11.field2368);
                                        }
                                    }
                                } else if (var11.field2301 == 8 || var11.field2301 == 9) {
                                    class149 var61 = class255.method1597(var11.field2302, false, 27628);
                                    class463 var62 = var11.field2386 == -1 ? null : class77.field971.method776(var11.field2386, (byte) -113);
                                    if (var61 != null) {
                                        class351 var63 = var11.field2298 ? class596.field8164.field7193 : null;
                                        var55 = var61.method1006(var11.field2368, class9.field103, 2048, -12876, ~var11.field2301 == -10, var63, var11.field2316, var11.field2343, var62, var11.field2317);
                                    }
                                } else if (var11.field2386 == -1) {
                                    var55 = var11.method1215(class237.field3088, class77.field971, 0, null, class318.field4640, class596.field8164.field7193, class327.field4771, (byte) -100, class613.field8364, -1, -1, 2048, class9.field103, class34.field336);
                                    if (var55 == null && class649.field9203) {
                                        class553.method3100(var11, 0);
                                    }
                                } else {
                                    class463 var60 = class77.field971.method776(var11.field2386, (byte) 91);
                                    var55 = var11.method1215(class237.field3088, class77.field971, var11.field2316, var60, class318.field4640, class596.field8164.field7193, class327.field4771, (byte) -100, class613.field8364, var11.field2368, var11.field2343, 2048, class9.field103, class34.field336);
                                    if (var55 == null && class649.field9203) {
                                        class553.method3100(var11, 0);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field2401 > 0) {
                                        var68 = (var11.field2438 << 9) / var11.field2401;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69;
                                    if (var11.field2350 <= 0) {
                                        var69 = 512;
                                    } else {
                                        var69 = (var11.field2371 << 9) / var11.field2350;
                                    }
                                    int var70 = (var11.field2330 * var68 >> 9) + (var13 + (var11.field2438 / 2));
                                    int var71 = (var11.field2462 * var69 >> 9) + var11.field2371 / 2 + var14;
                                    class488.field6582.method600();
                                    class9.field103.method1887(class488.field6582);
                                    class9.field103.method1875(var70, var71, var68, var69);
                                    class9.field103.method1957((float) (var11.field2334 << 2), var11.field2370 ? (float) (var11.field2421 << 2) : (float) (var11.field2421 << 2) * 1.5F);
                                    if (arg5 == -1412584499 || class187.field2296) {
                                        class9.field103.method1984();
                                        class9.field103.method821();
                                        class9.field103.method1908(arg1, arg6, arg7, arg8);
                                        class187.field2296 = false;
                                    }
                                    if (var11.field2458) {
                                        class9.field103.method1798(false);
                                    }
                                    int var72 = (var11.field2389 << 2) * class654.field9259[var11.field2408 << 3] >> 14;
                                    int var73 = (var11.field2389 << 2) * class654.field9260[var11.field2408 << 3] >> 14;
                                    class108.field1302.method605(-var11.field2463 << 3);
                                    class108.field1302.method601(var11.field2329 << 3);
                                    class108.field1302.method595(var11.field2309 << 2, (var11.field2429 << 2) + var56 + var72, (var11.field2429 << 2) + var73);
                                    class108.field1302.method606(var11.field2408 << 3);
                                    var11.method1205(class108.field1302, var55, class430.field5984, false, class9.field103);
                                    if (class460.field6269) {
                                        class9.field103.method1970(var13, var14, var11.field2438 + var13, var11.field2371 + var14);
                                    }
                                    if (var11.field2370) {
                                        var55.method672(class108.field1302, null, var11.field2389 << 2, 1);
                                    } else if (var11.field2376 == null) {
                                        var55.method665(class108.field1302, null, 1);
                                    } else {
                                        class9.field103.method1892(var55, var11.field2376.method714(), class108.field1302, null, 1);
                                    }
                                    if (class460.field6269) {
                                        class9.field103.method1908(arg1, arg6, arg7, arg8);
                                    }
                                    if (var11.field2458) {
                                        class9.field103.method1798(true);
                                    }
                                    class9.field103.method1957(0.0F, 0.0F);
                                }
                            } else if (var11.field2304 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field2453) {
                                    var74 = var13;
                                    var75 = var11.field2371 + var14;
                                    var76 = var11.field2438 + var13;
                                    var77 = var14;
                                } else {
                                    var74 = var13;
                                    var76 = var11.field2438 + var13;
                                    var77 = var11.field2371 + var14;
                                    var75 = var14;
                                }
                                if (var11.field2456 == 1) {
                                    class9.field103.method2010(var74, var75, var76, var77, var11.field2464, 0);
                                } else {
                                    class9.field103.method1800(var74, var75, var76, var77, var11.field2464, var11.field2456, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZI)I", line = 693)
    public static final int method2634(boolean arg0, int arg1) {
        field6347++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        }
        if (!arg0) {
            field6344 = null;
        }
        if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Llb;Lmaa;ILoa;II)Z", line = 722)
    public static final boolean method2635(class679 arg0, class588 arg1, int arg2, class689 arg3, int arg4, int arg5) {
        field6346++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg0.field9641 != null) {
            var7 = (arg0.field9635 + arg1.field8075 - class561.field7665) * (class561.field7664 - class561.field7663) / (class561.field7666 - class561.field7665) + class561.field7663;
            var9 = class561.field7660 - (arg0.field9646 + arg1.field8074 - class561.field7678) * (class561.field7660 - class561.field7670) / (class561.field7662 - class561.field7678);
            var6 = (class561.field7664 - class561.field7663) * (arg1.field8075 + arg0.field9647 - class561.field7665) / (class561.field7666 - class561.field7665) + class561.field7663;
            var8 = class561.field7660 - ((class561.field7660 - class561.field7670) * (arg0.field9640 + arg1.field8074 - class561.field7678) / (class561.field7662 - class561.field7678));
        }
        class424 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg0.field9626 != -1) {
            if (arg1.field8073 && arg0.field9651 != -1) {
                var10 = arg0.method3749(arg3, true, (byte) -80);
            } else {
                var10 = arg0.method3749(arg3, false, (byte) -114);
            }
            if (var10 != null) {
                var11 = arg1.field8077 - (var10.method1160() + 1 >> 1);
                var12 = arg1.field8077 + (var10.method1160() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var13 = arg1.field8081 - (var10.method1157() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var14 = arg1.field8081 + (var10.method1157() + 1 >> 1);
                if (var8 > var13) {
                    var8 = var13;
                }
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class540 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg0.field9633 != null) {
            var15 = class306.method1838(arg0.field9643, (byte) -103);
            if (var15 != null) {
                var16 = class641.field8904.method3311(arg0.field9633, class411.field5759, null, null, 112);
                int var23 = arg1.field8081;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method3044() / 2;
                } else {
                    var17 = var23 - ((var10.method1157() >> 1) + var16 * var15.method3041());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class411.field5759[var24];
                    if (var16 - 1 > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method3046(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg5 + arg1.field8077 - (var18 / 2);
                var20 = var18 / 2 + arg1.field8077 + arg5;
                if (var19 < var6) {
                    var6 = var19;
                }
                var21 = arg4 + var17;
                if (var7 < var20) {
                    var7 = var20;
                }
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = var16 * var15.method3041() + (var17 + arg4);
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class561.field7663 || var6 > class561.field7664 || var9 < class561.field7670 || var8 > class561.field7660) {
            return true;
        }
        if (arg0.field9641 != null) {
            int[] var27 = new int[arg0.field9641.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg0.field9641[var28 * 2] + arg1.field8075;
                int var31 = arg0.field9641[var28 * 2 + 1] + arg1.field8074;
                var27[var28 * 2] = (var30 - class561.field7665) * (class561.field7664 - class561.field7663) / (class561.field7666 - class561.field7665) + class561.field7663;
                var27[var28 * 2 + 1] = class561.field7660 - (var31 - class561.field7678) * (class561.field7660 - class561.field7670) / (class561.field7662 - class561.field7678);
            }
            class508.method2875(arg3, var27, arg0.field9623);
            for (int var29 = 0; var29 < (var27.length / 2 - 1); var29++) {
                arg3.method3817(true, arg0.field9632, var27[(var29 + 1) * 2], var27[(var29 + 1) * 2 + 1], var27[var29 * 2 + 1], var27[var29 * 2]);
            }
            arg3.method3817(true, arg0.field9632, var27[0], var27[1], var27[var27.length - 1], var27[var27.length - 2]);
        }
        if (var10 != null) {
            if (class235.field3067 > 0 && (class613.field8375 != -1 && class613.field8375 == arg1.field8076 || class341.field5013 != -1 && class341.field5013 == arg0.field9630)) {
                int var32;
                if (class514.field7002 > 50) {
                    var32 = (100 - class514.field7002) * 2;
                } else {
                    var32 = class514.field7002 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg3.method3810(var33, arg1.field8077, arg1.field8081, 5, var10.method1159() / 2 + 7);
                arg3.method3810(var33, arg1.field8077, arg1.field8081, arg2 ^ 0x1263, var10.method1159() / 2 + 5);
                arg3.method3810(var33, arg1.field8077, arg1.field8081, 5, var10.method1159() / 2 + 3);
                arg3.method3810(var33, arg1.field8077, arg1.field8081, 5, var10.method1159() / 2 + 1);
                arg3.method3810(var33, arg1.field8077, arg1.field8081, arg2 - 4705, var10.method1159() / 2);
            }
            var10.method2450(arg1.field8077 - (var10.method1160() >> 1), arg1.field8081 + -(var10.method1157() >> 1));
        }
        if (arg0.field9633 != null && var15 != null) {
            class532.method3018(var18, var16, arg3, arg0, arg1, var17, var15, true);
        }
        if (arg0.field9626 != -1 || arg0.field9633 != null) {
            class91 var34 = new class91(arg1);
            var34.field1124 = var20;
            var34.field1110 = var11;
            var34.field1118 = var22;
            var34.field1125 = var19;
            var34.field1122 = var14;
            var34.field1121 = var13;
            var34.field1120 = var12;
            var34.field1119 = var21;
            class626.field8524.method378(var34, arg2 ^ 0x6832);
        }
        if (arg2 != 4710) {
            field6344 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 933)
    public static void method2636(int arg0) {
        field6344 = null;
        if (arg0 != 2048) {
            field6344 = null;
        }
    }
}
