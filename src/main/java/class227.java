import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class227 extends class128 {

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "[I")
    public int[] field3664 = new int[1];

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "[I")
    public int[] field3666 = new int[] { -1 };

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3667 = "Hidden";

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "I")
    public static int field3668 = 0;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    public static int field3669 = -1;

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "Lfl;")
    public static class85 field3665;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II[Lag;IIIIIII)V")
    public static final void method1541(int arg0, int arg1, class211[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class127.method904(arg8, arg7, arg0, arg1);
        class302.method2008();
        if (arg4 != 29) {
            field3668 = 27;
        }
        field3663++;
        for (int var10 = 0; var10 < arg2.length; var10++) {
            class211 var11 = arg2[var10];
            if (var11 != null && (var11.field3395 == arg5 || arg5 == -1412584499 && client.field4857 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class74.field1241[class250.field3971] = var11.field3453 + arg6;
                    class132.field2088[class250.field3971] = var11.field3416 + arg9;
                    class15.field164[class250.field3971] = var11.field3430;
                    class190.field3075[class250.field3971] = var11.field3394;
                    var12 = class250.field3971++;
                } else {
                    var12 = arg3;
                }
                var11.field3439 = class29.field360;
                var11.field3406 = var12;
                if (!var11.field3337 || !client.method2017(var11)) {
                    if (var11.field3446 > 0) {
                        class133.method941(arg4 ^ 0xFFFFFEAA, var11);
                    }
                    int var13 = var11.field3453 + arg6;
                    int var14 = var11.field3416 + arg9;
                    int var15 = var11.field3458;
                    if (class176.field2877 && (client.method2015(var11).field3629 != 0 || var11.field3385 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (client.field4857 == var11) {
                        if (arg5 != -1412584499 && !var11.field3344) {
                            class46.field766 = arg9;
                            class49.field817 = arg2;
                            class162.field2584 = arg6;
                            continue;
                        }
                        if (!var11.field3344) {
                            var15 = 128;
                        }
                        if (class182.field2999 && class121.field1926) {
                            int var16 = class269.field4344;
                            int var17 = class77.field1281;
                            int var18 = var17 - class272.field4371;
                            int var19 = var16 - class151.field2371;
                            if (var19 < class66.field1107) {
                                var19 = class66.field1107;
                            }
                            if (var11.field3430 + var19 > class66.field1107 + class277.field4446.field3430) {
                                var19 = class66.field1107 + class277.field4446.field3430 - var11.field3430;
                            }
                            if (var18 < class243.field3864) {
                                var18 = class243.field3864;
                            }
                            if (var11.field3394 + var18 > class243.field3864 + class277.field4446.field3394) {
                                var18 = class277.field4446.field3394 + class243.field3864 - var11.field3394;
                            }
                            var13 = var19;
                            var14 = var18;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field3385 == 2) {
                        var20 = arg8;
                        var21 = arg0;
                        var22 = arg1;
                        var23 = arg7;
                    } else {
                        var20 = var13 > arg8 ? var13 : arg8;
                        var23 = var14 <= arg7 ? arg7 : var14;
                        int var24 = var11.field3430 + var13;
                        int var25 = var11.field3394 + var14;
                        if (var11.field3385 == 9) {
                            var24++;
                            var25++;
                        }
                        var21 = arg0 <= var24 ? arg0 : var24;
                        var22 = var25 >= arg1 ? arg1 : var25;
                    }
                    if (!var11.field3337 || var20 < var21 && var22 > var23) {
                        if (var11.field3446 != 0) {
                            if (var11.field3446 == 1337 || var11.field3446 == 1403) {
                                class121.field1934 = var11;
                                class276.field4441 = var13;
                                class29.field353 = var14;
                                class258.method1737(var11.field3446 == 1403, 126, var14, var11.field3430, var13, var11.field3394);
                                class73.field1227[var12] = true;
                                class127.method904(arg8, arg7, arg0, arg1);
                                continue;
                            }
                            if (var11.field3446 == 1338) {
                                if (!var11.method1470(false)) {
                                    continue;
                                }
                                class271.method1815((byte) -107, var14, var11, var13, var12);
                                class127.method904(arg8, arg7, arg0, arg1);
                                if (class178.field2908 != 0 && class178.field2908 != 3 || class286.field4537 || class236.field3792 < var20 || var23 > class177.field2905 || class236.field3792 >= var21 || var22 <= class177.field2905) {
                                    continue;
                                }
                                int var26 = class177.field2905 - var14;
                                int var27 = var11.field3460[var26];
                                int var28 = class236.field3792 - var13;
                                if (var27 > var28 || var28 > var11.field3505[var26] + var27) {
                                    continue;
                                }
                                int var29 = var28 - var11.field3430 / 2;
                                int var30;
                                if (class120.field1919 == 4) {
                                    var30 = (int) class90.field1456 & 0x7FF;
                                } else {
                                    var30 = (int) class90.field1456 + class173.field2831 & 0x7FF;
                                }
                                int var31 = var26 - var11.field3394 / 2;
                                int var32 = class302.field4823[var30];
                                int var33 = class302.field4824[var30];
                                if (class120.field1919 != 4) {
                                    var33 = (class292.field4687 + 256) * var33 >> 8;
                                    var32 = (class292.field4687 + 256) * var32 >> 8;
                                }
                                int var34 = var29 * var33 + var31 * var32 >> 11;
                                int var35 = var31 * var33 - (var29 * var32) >> 11;
                                int var36;
                                int var37;
                                if (class120.field1919 == 4) {
                                    var37 = class95.field1537 - var35 >> 7;
                                    var36 = class256.field4149 + var34 >> 7;
                                } else {
                                    var36 = class239.field3829.field637 + var34 + 64 - (class239.field3829.method279(23397) * 64) >> 7;
                                    var37 = class239.field3829.field710 - var35 - (class239.field3829.method279(23397) + -1) * 64 >> 7;
                                }
                                if (class139.field2211 && (class258.field4168 & 0x40) != 0) {
                                    class211 var38 = class32.method217(class78.field1310, class251.field3997, arg4 + 98);
                                    if (var38 == null) {
                                        class131.method923((byte) -110);
                                    } else {
                                        class266.method1789(" ->", var36, var37, class19.field230, 1L, class143.field2268, 115, (short) 11);
                                    }
                                    continue;
                                }
                                if (class299.field4792 == 1) {
                                    class266.method1789("", var36, var37, class314.field5007, 1L, -1, -98, (short) 7);
                                }
                                class266.method1789("", var36, var37, class72.field1215, 1L, -1, 115, (short) 50);
                                continue;
                            }
                            if (var11.field3446 == 1339) {
                                if (var11.method1470(false)) {
                                    class259.method1739(false, var12, var11, var13, var14);
                                    class127.method904(arg8, arg7, arg0, arg1);
                                }
                                continue;
                            }
                            if (var11.field3446 == 1400) {
                                class238.method1609(arg4 + 96, var11.field3430, var11.field3394, var13, var14);
                                class73.field1227[var12] = true;
                                class85.field1415[var12] = true;
                                class127.method904(arg8, arg7, arg0, arg1);
                                continue;
                            }
                            if (var11.field3446 == 1401) {
                                class55.method382(var11.field3430, var14, (byte) -97, var11.field3394, var13);
                                class73.field1227[var12] = true;
                                class85.field1415[var12] = true;
                                class127.method904(arg8, arg7, arg0, arg1);
                                continue;
                            }
                            if (var11.field3446 == 1402) {
                                class100.method687(var14, (byte) -128, var13);
                                class73.field1227[var12] = true;
                                class85.field1415[var12] = true;
                                continue;
                            }
                            if (var11.field3446 == 1405) {
                                if (!class119.field1908) {
                                    continue;
                                }
                                int var39 = var14 + 15;
                                int var40 = var11.field3430 + var13;
                                class88.field1443.method647("Fps:" + class269.field4332, var40, var39, 16776960, -1);
                                Runtime var41 = Runtime.getRuntime();
                                int var129 = var39 + 15;
                                int var42 = 16776960;
                                int var43 = 0;
                                int var44 = (int) ((var41.totalMemory() - var41.freeMemory()) / 1024L);
                                int var45 = 0;
                                int var46 = 0;
                                if (var44 > 65536) {
                                    var42 = 16711680;
                                }
                                class88.field1443.method647("Mem:" + var44 + "k", var40, var129, var42, -1);
                                int var47 = 16776960;
                                var39 = var129 + 15;
                                for (int var48 = 0; var48 < 29; var48++) {
                                    var46 += class296.field4735[var48].method214((byte) 112);
                                    var43 += class296.field4735[var48].method210(arg4 ^ 0x2EB2);
                                    var45 += class296.field4735[var48].method205(true);
                                }
                                int var49 = var45 * 100 / var46;
                                int var50 = var43 * 10000 / var46;
                                String var51 = "Cache:" + class84.method577((long) var50, (byte) -100, true, 2, 0) + "% (" + var49 + "%)";
                                class78.field1311.method647(var51, var40, var39, var47, -1);
                                var39 += 12;
                                if (class171.field2790 > 0) {
                                    class78.field1311.method647("Particles: " + class171.field2788 + " / " + class171.field2790, var40, var39, var47, -1);
                                }
                                var39 += 12;
                                class73.field1227[var12] = true;
                                class85.field1415[var12] = true;
                                continue;
                            }
                            if (var11.field3446 == 1406) {
                                class293.field4693 = var13;
                                class133.field2106 = var14;
                                class271.field4359 = var11;
                                continue;
                            }
                        }
                        if (!class286.field4537) {
                            if (var11.field3385 == 0 && var11.field3327 && var20 <= class236.field3792 && class177.field2905 >= var23 && var21 > class236.field3792 && var22 > class177.field2905 && !class176.field2877) {
                                class177.field2904[0] = class92.field1481;
                                class192.field3103[0] = 1008;
                                class249.field3948[0] = class239.field3825;
                                class83.field1384 = 1;
                                class269.field4343[0] = "";
                            }
                            if (class236.field3792 >= var20 && class177.field2905 >= var23 && class236.field3792 < var21 && class177.field2905 < var22) {
                                class143.method1002(class236.field3792 - var13, arg4 + 8016, var11, class177.field2905 - var14);
                            }
                        }
                        if (var11.field3385 == 0) {
                            if (!var11.field3337 && client.method2017(var11) && class161.field2559 != var11) {
                                continue;
                            }
                            if (!var11.field3337) {
                                if (var11.field3369 > (var11.field3414 - var11.field3394)) {
                                    var11.field3369 = var11.field3414 - var11.field3394;
                                }
                                if (var11.field3369 < 0) {
                                    var11.field3369 = 0;
                                }
                            }
                            method1541(var21, var22, arg2, var12, 29, var11.field3375, var13 - var11.field3392, var23, var20, var14 - var11.field3369);
                            if (var11.field3352 != null) {
                                method1541(var21, var22, var11.field3352, var12, arg4, var11.field3375, var13 - var11.field3392, var23, var20, var14 - var11.field3369);
                            }
                            class97 var52 = (class97) class244.field3880.method1059(0, (long) var11.field3375);
                            if (var52 != null) {
                                if (var52.field1554 == 0 && !class286.field4537 && var20 <= class236.field3792 && var23 <= class177.field2905 && class236.field3792 < var21 && class177.field2905 < var22 && !class176.field2877) {
                                    class177.field2904[0] = class92.field1481;
                                    class83.field1384 = 1;
                                    class192.field3103[0] = 1008;
                                    class249.field3948[0] = class239.field3825;
                                    class269.field4343[0] = "";
                                }
                                class136.method955(var13, var52.field1556, var14, var12, var23, var20, true, var21, var22);
                            }
                            class127.method904(arg8, arg7, arg0, arg1);
                            class302.method2008();
                        }
                        if (class177.field2902[var12] || class158.field2505 > 1) {
                            if (var11.field3385 == 0 && !var11.field3337 && var11.field3414 > var11.field3394) {
                                class111.method784(var11.field3369, var11.field3414, var11.field3394, (byte) -116, var14, var11.field3430 + var13);
                            }
                            if (var11.field3385 != 1) {
                                if (var11.field3385 == 2) {
                                    int var53 = 0;
                                    for (int var54 = 0; var54 < var11.field3502; var54++) {
                                        for (int var55 = 0; var55 < var11.field3389; var55++) {
                                            int var56 = (var11.field3432 + 32) * var55 + var13;
                                            int var57 = var14 + ((var11.field3330 + 32) * var54);
                                            if (var53 < 20) {
                                                var57 += var11.field3409[var53];
                                                var56 += var11.field3454[var53];
                                            }
                                            if (var11.field3361[var53] > 0) {
                                                boolean var59 = false;
                                                int var60 = var11.field3361[var53] - 1;
                                                boolean var61 = false;
                                                if (var56 + 32 > arg8 && var56 < arg0 && (var57 + 32) > arg7 && var57 < arg1 || class11.field110 == var11 && class9.field90 == var53) {
                                                    class146 var62;
                                                    if (class46.field778 == 1 && class52.field869 == var53 && class251.field3972 == var11.field3375) {
                                                        var62 = class203.method1425(var11.field3333, 0, (class264) null, 2, false, var60, var11.field3500[var53]);
                                                    } else {
                                                        var62 = class203.method1425(var11.field3333, 3153952, (class264) null, 1, false, var60, var11.field3500[var53]);
                                                    }
                                                    if (class302.field4822) {
                                                        class73.field1227[var12] = true;
                                                    }
                                                    if (var62 == null) {
                                                        class117.method834(var11, (byte) -57);
                                                    } else if (class11.field110 == var11 && class9.field90 == var53) {
                                                        int var63 = class77.field1281 - class3.field39;
                                                        if (var63 < 5 && var63 > -5) {
                                                            var63 = 0;
                                                        }
                                                        int var64 = class269.field4344 - class49.field813;
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        if (class15.field161 < 5) {
                                                            var64 = 0;
                                                            var63 = 0;
                                                        }
                                                        var62.method1028(var56 + var64, var57 + var63, 128);
                                                        if (arg5 != -1) {
                                                            class211 var65 = arg2[arg5 & 0xFFFF];
                                                            int var66 = class127.field2003;
                                                            int var67 = class127.field2008;
                                                            if ((var57 + var63) < var66 && var65.field3369 > 0) {
                                                                int var68 = (var66 - var57 - var63) * class223.field3630 / 3;
                                                                if (var68 > class223.field3630 * 10) {
                                                                    var68 = class223.field3630 * 10;
                                                                }
                                                                if (var68 > var65.field3369) {
                                                                    var68 = var65.field3369;
                                                                }
                                                                class3.field39 += var68;
                                                                var65.field3369 -= var68;
                                                                class117.method834(var65, (byte) -57);
                                                            }
                                                            if (var57 + var63 + 32 > var67 && var65.field3369 < var65.field3414 - var65.field3394) {
                                                                int var69 = (var57 + var63 + 32 - var67) * class223.field3630 / 3;
                                                                if (var69 > (class223.field3630 * 10)) {
                                                                    var69 = class223.field3630 * 10;
                                                                }
                                                                if (var69 > (var65.field3414 - var65.field3394 - var65.field3369)) {
                                                                    var69 = var65.field3414 - var65.field3394 - var65.field3369;
                                                                }
                                                                var65.field3369 += var69;
                                                                class3.field39 -= var69;
                                                                class117.method834(var65, (byte) -57);
                                                            }
                                                        }
                                                    } else if (class274.field4400 == var11 && class313.field4986 == var53) {
                                                        var62.method1028(var56, var57, 128);
                                                    } else {
                                                        var62.method1026(var56, var57);
                                                    }
                                                }
                                            } else if (var11.field3444 != null && var53 < 20) {
                                                class146 var58 = var11.method1473((byte) 105, var53);
                                                if (var58 != null) {
                                                    var58.method1026(var56, var57);
                                                } else if (class125.field1974) {
                                                    class117.method834(var11, (byte) -57);
                                                }
                                            }
                                            var53++;
                                        }
                                    }
                                } else if (var11.field3385 == 3) {
                                    int var70;
                                    if (class90.method612(646599820, var11)) {
                                        var70 = var11.field3363;
                                        if (class161.field2559 == var11 && var11.field3435 != 0) {
                                            var70 = var11.field3435;
                                        }
                                    } else {
                                        var70 = var11.field3393;
                                        if (class161.field2559 == var11 && var11.field3381 != 0) {
                                            var70 = var11.field3381;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field3408) {
                                            class127.method886(var13, var14, var11.field3430, var11.field3394, var70);
                                        } else {
                                            class127.method898(var13, var14, var11.field3430, var11.field3394, var70);
                                        }
                                    } else if (var11.field3408) {
                                        class127.method881(var13, var14, var11.field3430, var11.field3394, var70, 256 - (var15 & 0xFF));
                                    } else {
                                        class127.method895(var13, var14, var11.field3430, var11.field3394, var70, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field3385 == 4) {
                                    class93 var71 = var11.method1476(class42.field611, true);
                                    if (var71 != null) {
                                        String var72 = var11.field3479;
                                        int var73;
                                        if (class90.method612(646599820, var11)) {
                                            var73 = var11.field3363;
                                            if (class161.field2559 == var11 && var11.field3435 != 0) {
                                                var73 = var11.field3435;
                                            }
                                            if (var11.field3328.length() > 0) {
                                                var72 = var11.field3328;
                                            }
                                        } else {
                                            var73 = var11.field3393;
                                            if (class161.field2559 == var11 && var11.field3381 != 0) {
                                                var73 = var11.field3381;
                                            }
                                        }
                                        if (var11.field3337 && var11.field3441 != -1) {
                                            class115 var74 = class81.method562(var11.field3441, -20358);
                                            var72 = var74.field1799;
                                            if (var72 == null) {
                                                var72 = "null";
                                            }
                                            if ((var74.field1794 == 1 || var11.field3496 != 1) && var11.field3496 != -1) {
                                                var72 = "<col=ff9040>" + var72 + "</col> x" + class158.method1089(false, var11.field3496);
                                            }
                                        }
                                        if (class61.field994 == var11) {
                                            var72 = class277.field4459;
                                            var73 = var11.field3393;
                                        }
                                        if (!var11.field3337) {
                                            var72 = class188.method1343(var11, var72, arg4 - 29);
                                        }
                                        var71.method625(var72, var13, var14, var11.field3430, var11.field3394, var73, var11.field3423 ? 0 : -1, var11.field3442, var11.field3425, var11.field3477);
                                    } else if (class125.field1974) {
                                        class117.method834(var11, (byte) -57);
                                    }
                                } else if (var11.field3385 == 5) {
                                    if (!var11.field3337) {
                                        class146 var75 = var11.method1479(arg4 + 15, class90.method612(arg4 ^ 0x268A5491, var11));
                                        if (var75 != null) {
                                            var75.method1026(var13, var14);
                                        } else if (class125.field1974) {
                                            class117.method834(var11, (byte) -57);
                                        }
                                    } else if (var11.field3470 >= 0) {
                                        class21 var84 = var11.method1468(-20755);
                                        var84.method117(0, var13, var14, var11.field3430, var11.field3394, var11.field3357, var11.field3324, 0);
                                    } else {
                                        class146 var76;
                                        if (var11.field3441 == -1) {
                                            var76 = var11.method1479(39, false);
                                        } else if (var11.field3341 && class239.field3829.field4767 != null) {
                                            var76 = class203.method1425(var11.field3333, var11.field3360, class239.field3829.field4767, var11.field3400, false, var11.field3441, var11.field3496);
                                        } else {
                                            var76 = class203.method1425(var11.field3333, var11.field3360, (class264) null, var11.field3400, false, var11.field3441, var11.field3496);
                                        }
                                        if (var76 != null) {
                                            int var77 = var76.field2300;
                                            int var78 = var76.field2309;
                                            if (var11.field3490) {
                                                int var80 = (var77 + var11.field3430 - 1) / var77;
                                                int var81 = (var11.field3394 + var78 - 1) / var78;
                                                class127.method897(var13, var14, var11.field3430 + var13, var11.field3394 + var14);
                                                for (int var82 = 0; var82 < var80; var82++) {
                                                    for (int var83 = 0; var83 < var81; var83++) {
                                                        if (var11.field3478 != 0) {
                                                            var76.method1025((byte) -92, var77 / 2 + var77 * var82 + var13, var78 / 2 + var78 * var83 + var14, 4096, var11.field3478);
                                                        } else if (var15 == 0) {
                                                            var76.method1026(var13 + (var77 * var82), var14 - -(var78 * var83));
                                                        } else {
                                                            var76.method1028(var77 * var82 + var13, var14 - -(var78 * var83), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class127.method904(arg8, arg7, arg0, arg1);
                                            } else {
                                                int var79 = var11.field3430 * 4096 / var77;
                                                if (var11.field3478 != 0) {
                                                    var76.method1025((byte) -92, var13 + (var11.field3430 / 2), var11.field3394 / 2 + var14, var79, var11.field3478);
                                                } else if (var15 != 0) {
                                                    var76.method1024(var13, var14, var11.field3430, var11.field3394, 256 - (var15 & 0xFF));
                                                } else if (var11.field3430 == var77 && var11.field3394 == var78) {
                                                    var76.method1026(var13, var14);
                                                } else {
                                                    var76.method1019(var13, var14, var11.field3430, var11.field3394);
                                                }
                                            }
                                        } else if (class125.field1974) {
                                            class117.method834(var11, (byte) -57);
                                        }
                                    }
                                } else if (var11.field3385 == 6) {
                                    class37 var85 = null;
                                    boolean var86 = class90.method612(646599820, var11);
                                    int var87 = 0;
                                    int var88;
                                    if (var86) {
                                        var88 = var11.field3498;
                                    } else {
                                        var88 = var11.field3427;
                                    }
                                    if (var11.field3441 != -1) {
                                        class115 var89 = class81.method562(var11.field3441, -20358);
                                        if (var89 != null) {
                                            class115 var90 = var89.method803((byte) -27, var11.field3496);
                                            class307 var91 = var88 == -1 ? null : class22.method121(var88, true);
                                            if (var11.field3341 && class239.field3829.field4767 != null) {
                                                var85 = var90.method809(var91, (byte) 114, var11.field3464, var11.field3376, class239.field3829.field4767, 1, var11.field3401);
                                            } else {
                                                var85 = var90.method809(var91, (byte) 115, var11.field3464, var11.field3376, (class264) null, 1, var11.field3401);
                                            }
                                            if (var85 == null) {
                                                class117.method834(var11, (byte) -57);
                                            } else {
                                                var87 = -var85.method15() / 2;
                                            }
                                        }
                                    } else if (var11.field3501 == 5) {
                                        if (var11.field3485 == -1) {
                                            var85 = class121.field1929.method1773(-1, true, -1, false, (class307) null, 0, -1, (class313[]) null, (class307) null, arg4 - 30, -1, 0);
                                        } else {
                                            int var92 = var11.field3485;
                                            class299 var93;
                                            if (class123.field1961 == var92) {
                                                var93 = class239.field3829;
                                            } else {
                                                var93 = class270.field4355[var92];
                                            }
                                            class307 var94 = var88 == -1 ? null : class22.method121(var88, true);
                                            if (var93 != null && (var92 == 2047 || class249.method1658(var93.field4778, (byte) 117) == var11.field3364)) {
                                                var85 = var93.field4767.method1773(var11.field3376, true, -1, false, (class307) null, 0, 0, (class313[]) null, var94, arg4 - 30, -1, 0);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var85 = var11.method1475(var86, -1, (class307) null, 0, -1, class239.field3829.field4767, 0);
                                        if (var85 == null && class125.field1974) {
                                            class117.method834(var11, (byte) -57);
                                        }
                                    } else {
                                        class307 var95 = class22.method121(var88, true);
                                        var85 = var11.method1475(var86, var11.field3376, var95, var11.field3401, var11.field3464, class239.field3829.field4767, arg4 ^ 0x1D);
                                        if (var85 == null && class125.field1974) {
                                            class117.method834(var11, (byte) -57);
                                        }
                                    }
                                    if (var85 != null) {
                                        int var96;
                                        if (var11.field3459 > 0) {
                                            var96 = (var11.field3394 << 8) / var11.field3459;
                                        } else {
                                            var96 = 256;
                                        }
                                        int var97;
                                        if (var11.field3384 <= 0) {
                                            var97 = 256;
                                        } else {
                                            var97 = (var11.field3430 << 8) / var11.field3384;
                                        }
                                        int var98 = var11.field3430 / 2 + (var13 + (var11.field3391 * var97 >> 8));
                                        int var99 = (var11.field3354 * var96 >> 8) + var11.field3394 / 2 + var14;
                                        class302.method1995(var98, var99);
                                        int var100 = class302.field4824[var11.field3343] * var11.field3382 >> 16;
                                        int var101 = class302.field4823[var11.field3343] * var11.field3382 >> 16;
                                        if (!var11.field3337) {
                                            var85.method168(0, var11.field3456, 0, var11.field3343, 0, var101, var100, -1L);
                                        } else if (var11.field3325) {
                                            ((class31) var85).method195(0, var11.field3456, var11.field3387, var11.field3343, var11.field3476, var11.field3372 + var87 + var101, var100 - -var11.field3372, var11.field3382);
                                        } else {
                                            var85.method168(0, var11.field3456, var11.field3387, var11.field3343, var11.field3476, var11.field3372 + var87 + var101, var100 - -var11.field3372, -1L);
                                        }
                                        class302.method2000();
                                    }
                                } else {
                                    if (var11.field3385 == 7) {
                                        class93 var102 = var11.method1476(class42.field611, true);
                                        if (var102 == null) {
                                            if (class125.field1974) {
                                                class117.method834(var11, (byte) -57);
                                            }
                                            continue;
                                        }
                                        int var103 = 0;
                                        for (int var104 = 0; var104 < var11.field3502; var104++) {
                                            for (int var105 = 0; var105 < var11.field3389; var105++) {
                                                if (var11.field3361[var103] > 0) {
                                                    class115 var106 = class81.method562(var11.field3361[var103] - 1, arg4 + -20387);
                                                    String var107;
                                                    if (var106.field1794 != 1 && var11.field3500[var103] == 1) {
                                                        var107 = "<col=ff9040>" + var106.field1799 + "</col>";
                                                    } else {
                                                        var107 = "<col=ff9040>" + var106.field1799 + "</col> x" + class158.method1089(false, var11.field3500[var103]);
                                                    }
                                                    int var108 = (var11.field3330 + 12) * var104 + var14;
                                                    int var109 = var13 + ((var11.field3432 + 115) * var105);
                                                    if (var11.field3442 == 0) {
                                                        var102.method645(var107, var109, var108, var11.field3393, var11.field3423 ? 0 : -1);
                                                    } else if (var11.field3442 == 1) {
                                                        var102.method642(var107, var109 + 57, var108, var11.field3393, var11.field3423 ? 0 : -1);
                                                    } else {
                                                        var102.method647(var107, var109 + 114, var108, var11.field3393, var11.field3423 ? 0 : -1);
                                                    }
                                                }
                                                var103++;
                                            }
                                        }
                                    }
                                    if (var11.field3385 == 8 && class305.field4878 == var11 && class282.field4502 == class115.field1826) {
                                        int var110 = 0;
                                        int var111 = 0;
                                        class93 var112 = class88.field1443;
                                        String var113 = var11.field3479;
                                        String var114 = class188.method1343(var11, var113, 0);
                                        while (var114.length() > 0) {
                                            int var122 = var114.indexOf("<br>");
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var114;
                                                var114 = "";
                                            } else {
                                                var123 = var114.substring(0, var122);
                                                var114 = var114.substring(var122 + 4);
                                            }
                                            int var124 = var112.method634(var123);
                                            var111 += var112.field1497 + 1;
                                            if (var124 > var110) {
                                                var110 = var124;
                                            }
                                        }
                                        var110 += 6;
                                        int var115 = var11.field3430 + var13 - var110 - 5;
                                        var111 += 7;
                                        if ((var13 + 5) > var115) {
                                            var115 = var13 + 5;
                                        }
                                        if ((var115 + var110) > arg0) {
                                            var115 = arg0 - var110;
                                        }
                                        int var116 = var14 + var11.field3394 + 5;
                                        if (var111 + var116 > arg1) {
                                            var116 = arg1 - var111;
                                        }
                                        class127.method886(var115, var116, var110, var111, 16777120);
                                        class127.method898(var115, var116, var110, var111, 0);
                                        String var117 = var11.field3479;
                                        int var118 = var112.field1497 + var116 + 2;
                                        String var119 = class188.method1343(var11, var117, arg4 - 29);
                                        while (var119.length() > 0) {
                                            int var120 = var119.indexOf("<br>");
                                            String var121;
                                            if (var120 == -1) {
                                                var121 = var119;
                                                var119 = "";
                                            } else {
                                                var121 = var119.substring(0, var120);
                                                var119 = var119.substring(var120 + 4);
                                            }
                                            var112.method645(var121, var115 + 3, var118, 0, -1);
                                            var118 += var112.field1497 + 1;
                                        }
                                    }
                                    if (var11.field3385 == 9) {
                                        int var125;
                                        int var126;
                                        int var127;
                                        int var128;
                                        if (var11.field3335) {
                                            var125 = var13;
                                            var126 = var11.field3394 + var14;
                                            var127 = var14;
                                            var128 = var11.field3430 + var13;
                                        } else {
                                            var125 = var13;
                                            var126 = var14;
                                            var128 = var11.field3430 + var13;
                                            var127 = var11.field3394 + var14;
                                        }
                                        if (var11.field3353 == 1) {
                                            class127.method882(var125, var126, var128, var127, var11.field3393);
                                        } else {
                                            class127.method903(var125, var126, var128, var127, var11.field3393, var11.field3353);
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

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)V")
    public static void method1542(int arg0) {
        if (arg0 != -1) {
            method1542(37);
        }
        field3667 = null;
        field3665 = null;
    }
}
