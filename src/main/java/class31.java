import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class31 {

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field457 = -1;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field461 = 0;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field454 = 0;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field459 = "green:";

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[[[I")
    public static int[][][] field464;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
    public static final void method205(String[] arg0, int arg1, short[] arg2) {
        if (arg1 >= -124) {
            field461 = 116;
        }
        class108.method744(arg0, arg2, arg0.length - 1, 112, 0);
        field465++;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static final void method206(int arg0) {
        if (arg0 > -111) {
            method211('\u0016', (byte) 21);
        }
        field462++;
        class252.field4130.method53(true);
        class188.field3047.method53(true);
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static void method207(int arg0) {
        if (arg0 > 18) {
            field464 = null;
            field459 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
    public static final void method208(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field455++;
        if (class10.field121 != 0 && arg1 != 0 && field461 < 50 && arg0 != -1) {
            class245.field4018[field461] = arg0;
            class169.field2797[field461] = arg1;
            class135.field2360[field461] = arg2;
            class47.field829[field461] = null;
            class25.field386[field461] = 0;
            class56.field981[field461] = arg3;
            field461++;
        }
        if (arg4 > -112) {
            field457 = 10;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILvh;I)Lda;")
    public static final class197 method209(int arg0, class108 arg1, int arg2) {
        field463++;
        if (arg0 < 32) {
            field457 = -106;
        }
        return class60.method375((byte) -39, arg2, arg1) ? class12.method76(255) : null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZIIIIIII[Ldl;)V")
    public static final void method210(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class46[] arg9) {
        field458++;
        if (!arg1) {
            method205((String[]) null, -113, (short[]) null);
        }
        class283.method1858(arg3, arg5, arg0, arg2);
        class287.method1936();
        for (int var10 = 0; var10 < arg9.length; var10++) {
            class46 var11 = arg9[var10];
            if (var11 != null && (var11.field660 == arg7 || arg7 == -1412584499 && class6.field76 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class23.field364[class140.field2406] = var11.field758 + arg8;
                    class88.field1575[class140.field2406] = var11.field806 + arg6;
                    class223.field3754[class140.field2406] = var11.field701;
                    class176.field2884[class140.field2406] = var11.field715;
                    var12 = class140.field2406++;
                } else {
                    var12 = arg4;
                }
                var11.field709 = var12;
                var11.field763 = class266.field4301;
                if (!var11.field734 || !client.method1919(var11)) {
                    if (var11.field777 > 0) {
                        class272.method1783((byte) -20, var11);
                    }
                    int var13 = var11.field758 + arg8;
                    int var14 = var11.field806 + arg6;
                    int var15 = var11.field678;
                    if (class285.field4510 && (client.method1922(var11).field3096 != 0 || var11.field812 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class6.field76 == var11) {
                        if (arg7 != -1412584499 && !var11.field717) {
                            class195.field3154 = arg9;
                            class59.field1028 = arg8;
                            class147.field2499 = arg6;
                            continue;
                        }
                        if (!var11.field717) {
                            var15 = 128;
                        }
                        if (class270.field4344 && class30.field449) {
                            int var16 = class48.field839;
                            int var17 = var16 - class26.field394;
                            if (var17 < class236.field3892) {
                                var17 = class236.field3892;
                            }
                            int var18 = class256.field4182;
                            if (class236.field3892 + class187.field3030.field701 < var17 - -var11.field701) {
                                var17 = class187.field3030.field701 + class236.field3892 - var11.field701;
                            }
                            int var19 = var18 - class290.field4622;
                            if (var19 < class6.field70) {
                                var19 = class6.field70;
                            }
                            var13 = var17;
                            if (var19 + var11.field715 > class6.field70 + class187.field3030.field715) {
                                var19 = class6.field70 + class187.field3030.field715 - var11.field715;
                            }
                            var14 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field812 == 2) {
                        var21 = arg5;
                        var25 = arg0;
                        var24 = arg2;
                        var20 = arg3;
                    } else {
                        var20 = var13 <= arg3 ? arg3 : var13;
                        var21 = var14 > arg5 ? var14 : arg5;
                        int var22 = var11.field701 + var13;
                        int var23 = var14 + var11.field715;
                        if (var11.field812 == 9) {
                            var22++;
                            var23++;
                        }
                        var24 = var23 >= arg2 ? arg2 : var23;
                        var25 = arg0 > var22 ? var22 : arg0;
                    }
                    if (!var11.field734 || var25 > var20 && var24 > var21) {
                        if (var11.field777 != 0) {
                            if (var11.field777 == 1337 || var11.field777 == 1403) {
                                class215.field3624 = var11;
                                class35.field509 = var14;
                                class262.field4275 = var13;
                                class240.method1586(var11.field701, 256, var11.field715, var14, var13, var11.field777 == 1403);
                                class23.field367[var12] = true;
                                class283.method1858(arg3, arg5, arg0, arg2);
                                continue;
                            }
                            if (var11.field777 == 1338) {
                                if (!var11.method284(93)) {
                                    continue;
                                }
                                class188.method1229(-11516, var14, var11, var13, var12);
                                class283.method1858(arg3, arg5, arg0, arg2);
                                if (class264.field4293 != 0 && class264.field4293 != 3 || class248.field4074 || class199.field3266 < var20 || var21 > class147.field2497 || class199.field3266 >= var25 || class147.field2497 >= var24) {
                                    continue;
                                }
                                int var26 = class199.field3266 - var13;
                                int var27 = class147.field2497 - var14;
                                int var28 = var11.field671[var27];
                                if (var26 < var28 || (var11.field714[var27] + var28) < var26) {
                                    continue;
                                }
                                int var29 = var26 - var11.field701 / 2;
                                int var30 = var27 - var11.field715 / 2;
                                int var31 = (int) class106.field1900 + class173.field2833 & 0x7FF;
                                int var32 = class287.field4567[var31];
                                int var33 = class287.field4562[var31];
                                int var34 = (class231.field3871 + 256) * var32 >> 8;
                                int var35 = (class231.field3871 + 256) * var33 >> 8;
                                int var36 = var29 * var35 + var30 * var34 >> 11;
                                int var37 = class273.field4378.field1397 + var36 + 64 - class273.field4378.method528(-28) * 64 >> 7;
                                int var38 = var30 * var35 - (var29 * var34) >> 11;
                                int var39 = class273.field4378.field1458 + 64 - var38 - class273.field4378.method528(124) * 64 >> 7;
                                if (class76.field1241 && (class176.field2898 & 0x40) != 0) {
                                    class46 var40 = class285.method1902(class47.field825, class119.field2108, 5);
                                    if (var40 == null) {
                                        class239.method1581(-24930);
                                    } else {
                                        class37.method247(1L, class6.field67, " ->", 10032, var37, class158.field2640, (short) 16, var39);
                                    }
                                    continue;
                                }
                                if (class185.field3002 == 1) {
                                    class37.method247(1L, class296.field4701, "", 10032, var37, -1, (short) 36, var39);
                                }
                                class37.method247(1L, class66.field1109, "", 10032, var37, -1, (short) 47, var39);
                                continue;
                            }
                            if (var11.field777 == 1339) {
                                if (var11.method284(-127)) {
                                    class78.method505(var14, arg1, var12, var13, var11);
                                    class283.method1858(arg3, arg5, arg0, arg2);
                                }
                                continue;
                            }
                            if (var11.field777 == 1400) {
                                class183.method1202(-113, var14, var11.field715, var13, var11.field701);
                                class23.field367[var12] = true;
                                class239.field3937[var12] = true;
                                class283.method1858(arg3, arg5, arg0, arg2);
                                continue;
                            }
                            if (var11.field777 == 1401) {
                                class53.method330((byte) 103, var13, var11.field701, var11.field715, var14);
                                class23.field367[var12] = true;
                                class239.field3937[var12] = true;
                                class283.method1858(arg3, arg5, arg0, arg2);
                                continue;
                            }
                            if (var11.field777 == 1402) {
                                class17.method94(var13, 114, var14);
                                class23.field367[var12] = true;
                                class239.field3937[var12] = true;
                                continue;
                            }
                            if (var11.field777 == 1405) {
                                if (!class105.field1886) {
                                    continue;
                                }
                                int var41 = var11.field701 + var13;
                                int var42 = var14 + 15;
                                class112.field2018.method1633("Fps:" + class179.field2952, var41, var42, 16776960, -1);
                                Runtime var43 = Runtime.getRuntime();
                                int var131 = var42 + 15;
                                int var44 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                int var45 = 16776960;
                                if (var44 > 65536) {
                                    var45 = 16711680;
                                }
                                int var46 = 0;
                                int var47 = 0;
                                class112.field2018.method1633("Mem:" + var44 + "k", var41, var131, var45, -1);
                                var42 = var131 + 15;
                                int var48 = 16776960;
                                int var49 = 0;
                                for (int var50 = 0; var50 < 29; var50++) {
                                    var46 += class55.field948[var50].method939(false);
                                    var49 += class55.field948[var50].method937((byte) 43);
                                    var47 += class55.field948[var50].method945((byte) 113);
                                }
                                int var51 = var49 * 10000 / var46;
                                int var52 = var47 * 100 / var46;
                                String var53 = "Cache:" + class23.method157(true, 0, (byte) -117, (long) var51, 2) + "% (" + var52 + "%)";
                                class267.field4318.method1633(var53, var41, var42, var48, -1);
                                class23.field367[var12] = true;
                                var42 += 12;
                                class239.field3937[var12] = true;
                                continue;
                            }
                            if (var11.field777 == 1406) {
                                class134.field2315 = var14;
                                class155.field2606 = var11;
                                class21.field333 = var13;
                                continue;
                            }
                        }
                        if (!class248.field4074) {
                            if (var11.field812 == 0 && var11.field652 && class199.field3266 >= var20 && class147.field2497 >= var21 && class199.field3266 < var25 && class147.field2497 < var24 && !class285.field4510) {
                                class93.field1632[0] = class239.field3935;
                                class291.field4653[0] = class198.field3200;
                                class101.field1788[0] = 1006;
                                class275.field4399 = 1;
                                class93.field1636[0] = "";
                            }
                            if (var20 <= class199.field3266 && class147.field2497 >= var21 && class199.field3266 < var25 && var24 > class147.field2497) {
                                class168.method1139(22, class199.field3266 - var13, class147.field2497 - var14, var11);
                            }
                        }
                        if (var11.field812 == 0) {
                            if (!var11.field734 && client.method1919(var11) && class201.field3304 != var11) {
                                continue;
                            }
                            if (!var11.field734) {
                                if (var11.field644 > var11.field666 - var11.field715) {
                                    var11.field644 = var11.field666 - var11.field715;
                                }
                                if (var11.field644 < 0) {
                                    var11.field644 = 0;
                                }
                            }
                            method210(var25, true, var24, var20, var12, var21, var14 - var11.field644, var11.field786, var13 - var11.field733, arg9);
                            if (var11.field785 != null) {
                                method210(var25, arg1, var24, var20, var12, var21, var14 - var11.field644, var11.field786, var13 - var11.field733, var11.field785);
                            }
                            class194 var54 = (class194) class41.field607.method779(82, (long) var11.field786);
                            if (var54 != null) {
                                if (var54.field3137 == 0 && !class248.field4074 && class199.field3266 >= var20 && var21 <= class147.field2497 && var25 > class199.field3266 && class147.field2497 < var24 && !class285.field4510) {
                                    class291.field4653[0] = class198.field3200;
                                    class275.field4399 = 1;
                                    class93.field1632[0] = class239.field3935;
                                    class101.field1788[0] = 1006;
                                    class93.field1636[0] = "";
                                }
                                class225.method1513(var25, var13, var54.field3128, var24, var20, var21, -27680, var12, var14);
                            }
                            class283.method1858(arg3, arg5, arg0, arg2);
                            class287.method1936();
                        }
                        if (class243.field3988[var12] || class161.field2674 > 1) {
                            if (var11.field812 == 0 && !var11.field734 && var11.field666 > var11.field715) {
                                class110.method768(var11.field666, var14, var11.field701 + var13, var11.field715, var11.field644, -1);
                            }
                            if (var11.field812 != 1) {
                                if (var11.field812 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field696; var56++) {
                                        for (int var57 = 0; var57 < var11.field688; var57++) {
                                            int var58 = var14 + ((var11.field810 + 32) * var56);
                                            int var59 = (var11.field805 + 32) * var57 + var13;
                                            if (var55 < 20) {
                                                var59 += var11.field779[var55];
                                                var58 += var11.field791[var55];
                                            }
                                            if (var11.field774[var55] > 0) {
                                                boolean var61 = false;
                                                boolean var62 = false;
                                                int var63 = var11.field774[var55] - 1;
                                                if (arg3 < var59 + 32 && arg0 > var59 && arg5 < (var58 + 32) && var58 < arg2 || class75.field1231 == var11 && class3.field37 == var55) {
                                                    class74 var64;
                                                    if (class183.field2976 == 1 && class175.field2867 == var55 && class76.field1239 == var11.field786) {
                                                        var64 = class80.method519(var63, var11.field776, 0, 2, (class23) null, var11.field711[var55], 112);
                                                    } else {
                                                        var64 = class80.method519(var63, var11.field776, 3153952, 1, (class23) null, var11.field711[var55], 110);
                                                    }
                                                    if (class287.field4565) {
                                                        class23.field367[var12] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class79.method516(-373, var11);
                                                    } else if (class75.field1231 == var11 && class3.field37 == var55) {
                                                        int var65 = class48.field839 - class59.field1024;
                                                        int var66 = class256.field4182 - class178.field2929;
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (class170.field2808 < 5) {
                                                            var65 = 0;
                                                            var66 = 0;
                                                        }
                                                        var64.method453(var59 + var65, var58 + var66, 128);
                                                        if (arg7 != -1) {
                                                            class46 var67 = arg9[arg7 & 0xFFFF];
                                                            int var68 = class283.field4489;
                                                            int var69 = class283.field4486;
                                                            if (var58 + var66 < var69 && var67.field644 > 0) {
                                                                int var70 = (var69 - var58 - var66) * class191.field3087 / 3;
                                                                if (var70 > (class191.field3087 * 10)) {
                                                                    var70 = class191.field3087 * 10;
                                                                }
                                                                if (var70 > var67.field644) {
                                                                    var70 = var67.field644;
                                                                }
                                                                var67.field644 -= var70;
                                                                class178.field2929 += var70;
                                                                class79.method516(-373, var67);
                                                            }
                                                            if ((var66 + var58 + 32) > var68 && (var67.field666 - var67.field715) > var67.field644) {
                                                                int var71 = (var58 + var66 + 32 - var68) * class191.field3087 / 3;
                                                                if (class191.field3087 * 10 < var71) {
                                                                    var71 = class191.field3087 * 10;
                                                                }
                                                                if (var67.field666 - (var67.field715 + var67.field644) < var71) {
                                                                    var71 = var67.field666 - var67.field715 - var67.field644;
                                                                }
                                                                class178.field2929 -= var71;
                                                                var67.field644 += var71;
                                                                class79.method516(-373, var67);
                                                            }
                                                        }
                                                    } else if (class188.field3039 == var11 && class123.field2182 == var55) {
                                                        var64.method453(var59, var58, 128);
                                                    } else {
                                                        var64.method447(var59, var58);
                                                    }
                                                }
                                            } else if (var11.field753 != null && var55 < 20) {
                                                class74 var60 = var11.method287((byte) -21, var55);
                                                if (var60 != null) {
                                                    var60.method447(var59, var58);
                                                } else if (class236.field3891) {
                                                    class79.method516(-373, var11);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field812 == 3) {
                                    int var72;
                                    if (class49.method303(0, var11)) {
                                        var72 = var11.field739;
                                        if (class201.field3304 == var11 && var11.field778 != 0) {
                                            var72 = var11.field778;
                                        }
                                    } else {
                                        var72 = var11.field679;
                                        if (class201.field3304 == var11 && var11.field693 != 0) {
                                            var72 = var11.field693;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field713) {
                                            class283.method1855(var13, var14, var11.field701, var11.field715, var72);
                                        } else {
                                            class283.method1846(var13, var14, var11.field701, var11.field715, var72);
                                        }
                                    } else if (var11.field713) {
                                        class283.method1853(var13, var14, var11.field701, var11.field715, var72, 256 - (var15 & 0xFF));
                                    } else {
                                        class283.method1859(var13, var14, var11.field701, var11.field715, var72, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field812 == 4) {
                                    class244 var73 = var11.method291(3, class189.field3076);
                                    if (var73 != null) {
                                        String var74 = var11.field759;
                                        int var75;
                                        if (class49.method303(0, var11)) {
                                            var75 = var11.field739;
                                            if (class201.field3304 == var11 && var11.field778 != 0) {
                                                var75 = var11.field778;
                                            }
                                            if (var11.field794.length() > 0) {
                                                var74 = var11.field794;
                                            }
                                        } else {
                                            var75 = var11.field679;
                                            if (class201.field3304 == var11 && var11.field693 != 0) {
                                                var75 = var11.field693;
                                            }
                                        }
                                        if (var11.field734 && var11.field767 != -1) {
                                            class199 var76 = class203.method1346(-1, var11.field767);
                                            var74 = var76.field3216;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field3218 == 1 || var11.field685 != 1) && var11.field685 != -1) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class25.method173(var11.field685, (byte) -116);
                                            }
                                        }
                                        if (class139.field2404 == var11) {
                                            var74 = class215.field3631;
                                            var75 = var11.field679;
                                        }
                                        if (!var11.field734) {
                                            var74 = class169.method1144(var11, -126, var74);
                                        }
                                        var73.method1613(var74, var13, var14, var11.field701, var11.field715, var75, var11.field820 ? 0 : -1, var11.field662, var11.field781, var11.field687);
                                    } else if (class236.field3891) {
                                        class79.method516(-373, var11);
                                    }
                                } else if (var11.field812 == 5) {
                                    if (!var11.field734) {
                                        class74 var77 = var11.method290(class49.method303(0, var11), 0);
                                        if (var77 != null) {
                                            var77.method447(var13, var14);
                                        } else if (class236.field3891) {
                                            class79.method516(-373, var11);
                                        }
                                    } else if (var11.field730 >= 0) {
                                        class13 var78 = var11.method289(14457);
                                        var78.method77(0, var13, var14, var11.field701, var11.field715, var11.field641, var11.field756, 0);
                                    } else {
                                        class74 var79;
                                        if (var11.field767 == -1) {
                                            var79 = var11.method290(false, 0);
                                        } else if (var11.field749 && class273.field4378.field4592 != null) {
                                            var79 = class80.method519(var11.field767, var11.field776, var11.field703, var11.field661, class273.field4378.field4592, var11.field685, -114);
                                        } else {
                                            var79 = class80.method519(var11.field767, var11.field776, var11.field703, var11.field661, (class23) null, var11.field685, -53);
                                        }
                                        if (var79 != null) {
                                            int var80 = var79.field1230;
                                            int var81 = var79.field1227;
                                            if (var11.field650) {
                                                int var83 = (-(-var80 - var11.field701) - 1) / var80;
                                                int var84 = (var11.field715 + var81 - 1) / var81;
                                                class283.method1850(var13, var14, var13 + var11.field701, var11.field715 + var14);
                                                for (int var85 = 0; var85 < var83; var85++) {
                                                    for (int var86 = 0; var86 < var84; var86++) {
                                                        if (var11.field762 != 0) {
                                                            var79.method448(var11.field762, 4096, var80 / 2 + var80 * var85 + var13, var81 / 2 + var81 * var86 + var14, (byte) 49);
                                                        } else if (var15 == 0) {
                                                            var79.method447(var80 * var85 + var13, var81 * var86 + var14);
                                                        } else {
                                                            var79.method453(var13 + (var80 * var85), var81 * var86 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class283.method1858(arg3, arg5, arg0, arg2);
                                            } else {
                                                int var82 = var11.field701 * 4096 / var80;
                                                if (var11.field762 != 0) {
                                                    var79.method448(var11.field762, var82, var11.field701 / 2 + var13, var14 - -(var11.field715 / 2), (byte) 49);
                                                } else if (var15 != 0) {
                                                    var79.method450(var13, var14, var11.field701, var11.field715, 256 - (var15 & 0xFF));
                                                } else if (var11.field701 == var80 && var11.field715 == var81) {
                                                    var79.method447(var13, var14);
                                                } else {
                                                    var79.method455(var13, var14, var11.field701, var11.field715);
                                                }
                                            }
                                        } else if (class236.field3891) {
                                            class79.method516(-373, var11);
                                        }
                                    }
                                } else if (var11.field812 == 6) {
                                    boolean var87 = class49.method303(0, var11);
                                    int var88;
                                    if (var87) {
                                        var88 = var11.field783;
                                    } else {
                                        var88 = var11.field708;
                                    }
                                    int var89 = 0;
                                    class279 var90 = null;
                                    if (var11.field767 != -1) {
                                        class199 var91 = class203.method1346(-1, var11.field767);
                                        if (var91 != null) {
                                            class199 var92 = var91.method1333(var11.field685, 0);
                                            class167 var93 = var88 == -1 ? null : class105.method714(var88, (byte) 107);
                                            if (var11.field749 && class273.field4378.field4592 != null) {
                                                var90 = var92.method1329(var93, var11.field643, var11.field760, 255, class273.field4378.field4592, 1, var11.field802);
                                            } else {
                                                var90 = var92.method1329(var93, var11.field643, var11.field760, 255, (class23) null, 1, var11.field802);
                                            }
                                            if (var90 == null) {
                                                class79.method516(-373, var11);
                                            } else {
                                                var89 = -var90.method110() / 2;
                                            }
                                        }
                                    } else if (var11.field748 == 5) {
                                        if (var11.field653 == -1) {
                                            var90 = class57.field987.method151(-1, (class167) null, -1, -1, 122, (class167) null, true, 0, (class56[]) null, -1, 0);
                                        } else {
                                            int var94 = var11.field653 & 0x7FF;
                                            if (class37.field545 == var94) {
                                                var94 = 2047;
                                            }
                                            class288 var95 = class105.field1874[var94];
                                            class167 var96 = var88 == -1 ? null : class105.method714(var88, (byte) 62);
                                            if (var95 != null && (int) class103.method702(arg1, var95.field4601) << 11 == (var11.field653 & 0xFFFFF800)) {
                                                var90 = var95.field4592.method151(-1, (class167) null, var11.field760, -1, 124, var96, true, 0, (class56[]) null, 0, 0);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var90 = var11.method278(var87, -1, 0, (class167) null, -1, class273.field4378.field4592, 76);
                                        if (var90 == null && class236.field3891) {
                                            class79.method516(-373, var11);
                                        }
                                    } else {
                                        class167 var97 = class105.method714(var88, (byte) 11);
                                        var90 = var11.method278(var87, var11.field643, var11.field802, var97, var11.field760, class273.field4378.field4592, 70);
                                        if (var90 == null && class236.field3891) {
                                            class79.method516(-373, var11);
                                        }
                                    }
                                    if (var90 != null) {
                                        int var98;
                                        if (var11.field813 > 0) {
                                            var98 = (var11.field715 << 8) / var11.field813;
                                        } else {
                                            var98 = 256;
                                        }
                                        int var99;
                                        if (var11.field677 <= 0) {
                                            var99 = 256;
                                        } else {
                                            var99 = (var11.field701 << 8) / var11.field677;
                                        }
                                        int var100 = (var11.field787 * var99 >> 8) + var13 + (var11.field701 / 2);
                                        int var101 = var11.field715 / 2 + (var14 + (var11.field689 * var98 >> 8));
                                        class287.method1939(var100, var101);
                                        int var102 = class287.field4562[var11.field741] * var11.field746 >> 16;
                                        int var103 = class287.field4567[var11.field741] * var11.field746 >> 16;
                                        if (!var11.field734) {
                                            var90.method101(0, var11.field816, 0, var11.field741, 0, var103, var102, -1L);
                                        } else if (var11.field690) {
                                            ((class18) var90).method124(0, var11.field816, var11.field803, var11.field741, var11.field819, var89 + var103 + var11.field788, var102 - -var11.field788, var11.field746);
                                        } else {
                                            var90.method101(0, var11.field816, var11.field803, var11.field741, var11.field819, var103 - (-var89 - var11.field788), var11.field788 + var102, -1L);
                                        }
                                        class287.method1931();
                                    }
                                } else {
                                    if (var11.field812 == 7) {
                                        class244 var104 = var11.method291(3, class189.field3076);
                                        if (var104 == null) {
                                            if (class236.field3891) {
                                                class79.method516(-373, var11);
                                            }
                                            continue;
                                        }
                                        int var105 = 0;
                                        for (int var106 = 0; var106 < var11.field696; var106++) {
                                            for (int var107 = 0; var107 < var11.field688; var107++) {
                                                if (var11.field774[var105] > 0) {
                                                    class199 var108 = class203.method1346(-1, var11.field774[var105] - 1);
                                                    String var109;
                                                    if (var108.field3218 != 1 && var11.field711[var105] == 1) {
                                                        var109 = "<col=ff9040>" + var108.field3216 + "</col>";
                                                    } else {
                                                        var109 = "<col=ff9040>" + var108.field3216 + "</col> x" + class25.method173(var11.field711[var105], (byte) -124);
                                                    }
                                                    int var110 = (var11.field810 + 12) * var106 + var14;
                                                    int var111 = (var11.field805 + 115) * var107 + var13;
                                                    if (var11.field662 == 0) {
                                                        var104.method1626(var109, var111, var110, var11.field679, var11.field820 ? 0 : -1);
                                                    } else if (var11.field662 == 1) {
                                                        var104.method1623(var109, var111 + 57, var110, var11.field679, var11.field820 ? 0 : -1);
                                                    } else {
                                                        var104.method1633(var109, var111 + 115 - 1, var110, var11.field679, var11.field820 ? 0 : -1);
                                                    }
                                                }
                                                var105++;
                                            }
                                        }
                                    }
                                    if (var11.field812 == 8 && class79.field1359 == var11 && class263.field4283 == class204.field3338) {
                                        int var112 = 0;
                                        class244 var113 = class112.field2018;
                                        int var114 = 0;
                                        String var115 = var11.field759;
                                        String var116 = class169.method1144(var11, -120, var115);
                                        while (var116.length() > 0) {
                                            int var124 = var116.indexOf("<br>");
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var116;
                                                var116 = "";
                                            } else {
                                                var125 = var116.substring(0, var124);
                                                var116 = var116.substring(var124 + 4);
                                            }
                                            int var126 = var113.method1622(var125);
                                            var114 += var113.field4001 + 1;
                                            if (var126 > var112) {
                                                var112 = var126;
                                            }
                                        }
                                        var112 += 6;
                                        var114 += 7;
                                        int var117 = var11.field701 + var13 - var112 - 5;
                                        int var118 = var11.field715 + var14 + 5;
                                        if (var117 < var13 + 5) {
                                            var117 = var13 + 5;
                                        }
                                        if (arg2 < var118 + var114) {
                                            var118 = arg2 - var114;
                                        }
                                        if (arg0 < var112 + var117) {
                                            var117 = arg0 - var112;
                                        }
                                        class283.method1855(var117, var118, var112, var114, 16777120);
                                        class283.method1846(var117, var118, var112, var114, 0);
                                        String var119 = var11.field759;
                                        int var120 = var113.field4001 + var118 + 2;
                                        String var121 = class169.method1144(var11, -108, var119);
                                        while (var121.length() > 0) {
                                            int var122 = var121.indexOf("<br>");
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = "";
                                            } else {
                                                var123 = var121.substring(0, var122);
                                                var121 = var121.substring(var122 + 4);
                                            }
                                            var113.method1626(var123, var117 + 3, var120, 0, -1);
                                            var120 += var113.field4001 + 1;
                                        }
                                    }
                                    if (var11.field812 == 9) {
                                        int var127;
                                        int var128;
                                        int var129;
                                        int var130;
                                        if (var11.field707) {
                                            var129 = var14;
                                            var130 = var13;
                                            var128 = var11.field701 + var13;
                                            var127 = var11.field715 + var14;
                                        } else {
                                            var127 = var14;
                                            var128 = var11.field701 + var13;
                                            var129 = var11.field715 + var14;
                                            var130 = var13;
                                        }
                                        if (var11.field683 == 1) {
                                            class283.method1854(var130, var127, var128, var129, var11.field679);
                                        } else {
                                            class283.method1856(var130, var127, var128, var129, var11.field679, var11.field683);
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

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(CB)C")
    public static final char method211(char arg0, byte arg1) {
        field466++;
        if (arg0 == 'Æ') {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else {
            if (arg1 != 97) {
                field461 = -34;
            }
            if (arg0 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg0 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lbd;B)V")
    public static final void method212(class81 arg0, byte arg1) {
        field456++;
        arg0.field1432 = false;
        if (arg0.field1421 != -1) {
            class167 var2 = class105.method714(arg0.field1421, (byte) 110);
            if (var2 == null || var2.field2736 == null) {
                arg0.field1421 = -1;
            } else {
                arg0.field1411++;
                if (var2.field2736.length > arg0.field1474 && arg0.field1411 > var2.field2751[arg0.field1474]) {
                    arg0.field1387++;
                    arg0.field1474++;
                    arg0.field1411 = 1;
                    class112.method786(arg0.field1458, var2, arg0.field1474, arg0.field1397, (byte) -123, class273.field4378 == arg0);
                }
                if (arg0.field1474 >= var2.field2736.length) {
                    arg0.field1474 = 0;
                    arg0.field1411 = 0;
                    class112.method786(arg0.field1458, var2, arg0.field1474, arg0.field1397, (byte) -79, class273.field4378 == arg0);
                }
                arg0.field1387 = arg0.field1474 + 1;
                if (var2.field2736.length <= arg0.field1387) {
                    arg0.field1387 = 0;
                }
            }
        }
        if (arg0.field1396 != -1 && class266.field4301 >= arg0.field1385) {
            class121 var3 = class189.method1243(65536, arg0.field1396);
            int var4 = var3.field2138;
            if (var4 == -1) {
                arg0.field1396 = -1;
            } else {
                label296: {
                    class167 var5 = class105.method714(var4, (byte) 100);
                    if (var3.field2139) {
                        if (var5.field2739 == 3) {
                            if (arg0.field1448 > 0 && arg0.field1435 <= class266.field4301 && arg0.field1469 < class266.field4301) {
                                arg0.field1396 = -1;
                                break label296;
                            }
                        } else if (var5.field2739 == 1 && arg0.field1448 > 0 && arg0.field1435 <= class266.field4301 && class266.field4301 > arg0.field1469) {
                            arg0.field1385 = class266.field4301 + 1;
                            break label296;
                        }
                    }
                    if (var5 == null || var5.field2736 == null) {
                        arg0.field1396 = -1;
                    } else {
                        if (arg0.field1482 < 0) {
                            arg0.field1482 = 0;
                            class112.method786(arg0.field1458, var5, 0, arg0.field1397, (byte) -103, class273.field4378 == arg0);
                        }
                        arg0.field1463++;
                        if (arg0.field1482 < var5.field2736.length && arg0.field1463 > var5.field2751[arg0.field1482]) {
                            arg0.field1482++;
                            arg0.field1463 = 1;
                            class112.method786(arg0.field1458, var5, arg0.field1482, arg0.field1397, (byte) -97, class273.field4378 == arg0);
                        }
                        if (var5.field2736.length <= arg0.field1482) {
                            if (var3.field2139) {
                                arg0.field1482 -= var5.field2725;
                                arg0.field1431++;
                                if (arg0.field1431 >= var5.field2740) {
                                    arg0.field1396 = -1;
                                } else if (arg0.field1482 >= 0 && arg0.field1482 < var5.field2736.length) {
                                    class112.method786(arg0.field1458, var5, arg0.field1482, arg0.field1397, (byte) -88, class273.field4378 == arg0);
                                } else {
                                    arg0.field1396 = -1;
                                }
                            } else {
                                arg0.field1396 = -1;
                            }
                        }
                        arg0.field1390 = arg0.field1482 + 1;
                        if (arg0.field1390 >= var5.field2736.length) {
                            if (var3.field2139) {
                                arg0.field1390 -= var5.field2725;
                                if (var5.field2740 <= arg0.field1431 + 1) {
                                    arg0.field1390 = -1;
                                } else if (arg0.field1390 < 0 || var5.field2736.length <= arg0.field1390) {
                                    arg0.field1390 = -1;
                                }
                            } else {
                                arg0.field1390 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg0.field1384 != -1 && arg0.field1393 <= 1) {
            class167 var6 = class105.method714(arg0.field1384, (byte) 118);
            if (var6.field2739 == 3) {
                if (arg0.field1448 > 0 && class266.field4301 >= arg0.field1435 && class266.field4301 > arg0.field1469) {
                    arg0.field1384 = -1;
                }
            } else if (var6.field2739 == 1 && arg0.field1448 > 0 && arg0.field1435 <= class266.field4301 && arg0.field1469 < class266.field4301) {
                arg0.field1393 = 1;
            }
        }
        if (arg0.field1384 != -1 && arg0.field1393 == 0) {
            class167 var7 = class105.method714(arg0.field1384, (byte) 46);
            if (var7 == null || var7.field2736 == null) {
                arg0.field1384 = -1;
            } else {
                arg0.field1420++;
                if (var7.field2736.length > arg0.field1465 && var7.field2751[arg0.field1465] < arg0.field1420) {
                    arg0.field1465++;
                    arg0.field1420 = 1;
                    class112.method786(arg0.field1458, var7, arg0.field1465, arg0.field1397, (byte) -12, class273.field4378 == arg0);
                }
                if (arg0.field1465 >= var7.field2736.length) {
                    arg0.field1440++;
                    arg0.field1465 -= var7.field2725;
                    if (var7.field2740 <= arg0.field1440) {
                        arg0.field1384 = -1;
                    } else if (arg0.field1465 >= 0 && arg0.field1465 < var7.field2736.length) {
                        class112.method786(arg0.field1458, var7, arg0.field1465, arg0.field1397, (byte) -25, class273.field4378 == arg0);
                    } else {
                        arg0.field1384 = -1;
                    }
                }
                arg0.field1400 = arg0.field1465 + 1;
                if (arg0.field1400 >= var7.field2736.length) {
                    arg0.field1400 -= var7.field2725;
                    if (var7.field2740 <= arg0.field1440 + 1) {
                        arg0.field1400 = -1;
                    } else if (arg0.field1400 < 0 || var7.field2736.length <= arg0.field1400) {
                        arg0.field1400 = -1;
                    }
                }
                arg0.field1432 = var7.field2743;
            }
        }
        if (arg0.field1393 > 0) {
            arg0.field1393--;
        }
        for (int var8 = 0; var8 < arg0.field1477.length; var8++) {
            class56 var9 = arg0.field1477[var8];
            if (var9 != null) {
                if (var9.field964 > 0) {
                    var9.field964--;
                } else {
                    class167 var10 = class105.method714(var9.field977, (byte) 3);
                    if (var10 == null || var10.field2736 == null) {
                        arg0.field1477[var8] = null;
                    } else {
                        var9.field971++;
                        if (var10.field2736.length > var9.field969 && var9.field971 > var10.field2751[var9.field969]) {
                            var9.field969++;
                            var9.field971 = 1;
                            class112.method786(arg0.field1458, var10, var9.field969, arg0.field1397, (byte) -68, class273.field4378 == arg0);
                        }
                        if (var10.field2736.length <= var9.field969) {
                            var9.field966++;
                            var9.field969 -= var10.field2725;
                            if (var9.field966 >= var10.field2740) {
                                arg0.field1477[var8] = null;
                            } else if (var9.field969 >= 0 && var9.field969 < var10.field2736.length) {
                                class112.method786(arg0.field1458, var10, var9.field969, arg0.field1397, (byte) -93, class273.field4378 == arg0);
                            } else {
                                arg0.field1477[var8] = null;
                            }
                        }
                        var9.field967 = var9.field969 + 1;
                        if (var10.field2736.length <= var9.field967) {
                            var9.field967 -= var10.field2725;
                            if (var10.field2740 <= var9.field966 + 1) {
                                var9.field967 = -1;
                            } else if (var9.field967 < 0 || var9.field967 >= var10.field2736.length) {
                                var9.field967 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != -94) {
            method205((String[]) null, -81, (short[]) null);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)I")
    public static final int method213(int arg0, int arg1, int arg2) {
        field467++;
        if (arg2 == -2) {
            return 12345678;
        }
        if (arg1 != -3631) {
            field461 = 49;
        }
        if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }
}
