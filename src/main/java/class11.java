import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class11 {

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Z")
    public static boolean field165 = true;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field166 = 0;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[[I")
    public static int[][] field167;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method67(byte arg0, int arg1) {
        field160++;
        if (class86.field1550 == arg1) {
            return;
        }
        if (class86.field1550 == 0) {
            class148.method1083(28119);
        }
        if (arg1 == 40) {
            class270.method1864(-1);
        }
        if (arg1 != 40 && class166.field2949 != null) {
            class166.field2949.method1627(109);
            class166.field2949 = null;
        }
        if (arg0 != 74) {
            return;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 25 || arg1 == 28) {
            class274.field4744 = 1;
            class73.field1330 = 0;
            class29.field414 = 0;
            class284.field4925 = 0;
            class57.field1053 = 1;
            class148.method1082(true, arg0 ^ 0x3A);
        }
        if (arg1 == 25 || arg1 == 10) {
            class76.method580((byte) -123);
        }
        if (arg1 == 5) {
            class165.method1209(class153.field2743, (byte) 111);
        } else {
            class284.method1983(arg0 ^ 0xFFFFC373);
        }
        boolean var3 = class86.field1550 == 5 || class86.field1550 == 10 || class86.field1550 == 28;
        if (var2 != var3) {
            if (var2) {
                class250.field4248 = class105.field1890;
                if (class38.field694 == 0) {
                    class267.method1855(2, arg0 - 74);
                } else {
                    class54.method431(0, false, 255, arg0 ^ 0x74A, 2, class21.field277, class105.field1890);
                }
                class201.field3665.method868(72, false);
            } else {
                class267.method1855(2, 0);
                class201.field3665.method868(84, true);
            }
        }
        if (class253.field4323 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class253.method1707();
        }
        class86.field1550 = arg1;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[Lla;IIIIII)V", line = 86)
    public static final void method68(int arg0, int arg1, int arg2, class188[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class253.field4323) {
            class60.method470(arg5, arg1, arg2, arg9);
        } else {
            class178.method1302(arg5, arg1, arg2, arg9);
            class136.method975();
        }
        field162++;
        int var10 = -88 / ((arg6 + 80) / 42);
        for (int var11 = 0; var11 < arg3.length; var11++) {
            class188 var12 = arg3[var11];
            if (var12 != null && (var12.field3468 == arg4 || arg4 == -1412584499 && class240.field4096 == var12)) {
                int var13;
                if (arg8 == -1) {
                    class163.field2892[class138.field2396] = var12.field3400 + arg7;
                    class56.field1017[class138.field2396] = var12.field3333 + arg0;
                    class102.field1840[class138.field2396] = var12.field3391;
                    class255.field4366[class138.field2396] = var12.field3343;
                    var13 = class138.field2396++;
                } else {
                    var13 = arg8;
                }
                var12.field3312 = class45.field840;
                var12.field3462 = var13;
                if (!var12.field3396 || !client.method827(var12)) {
                    if (var12.field3357 > 0) {
                        class72.method546(var12, (byte) 121);
                    }
                    int var14 = var12.field3307;
                    int var15 = var12.field3333 + arg0;
                    int var16 = var12.field3400 + arg7;
                    if (class37.field654 && (client.method828(var12) != 0 || var12.field3467 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class240.field4096 == var12) {
                        if (arg4 != -1412584499 && !var12.field3436) {
                            class206.field3726 = arg3;
                            class267.field4571 = arg0;
                            class167.field2958 = arg7;
                            continue;
                        }
                        if (class292.field5056 && class320.field5491) {
                            int var17 = class208.field3762;
                            int var18 = class286.field4963;
                            int var19 = var17 - class75.field1426;
                            if (var19 < class208.field3754) {
                                var19 = class208.field3754;
                            }
                            int var20 = var18 - class117.field2047;
                            if ((class208.field3754 + class260.field4492.field3343) < (var12.field3343 + var19)) {
                                var19 = class208.field3754 + class260.field4492.field3343 - var12.field3343;
                            }
                            var15 = var19;
                            if (class76.field1445 > var20) {
                                var20 = class76.field1445;
                            }
                            if (class76.field1445 + class260.field4492.field3391 < var12.field3391 + var20) {
                                var20 = class76.field1445 + class260.field4492.field3391 - var12.field3391;
                            }
                            var16 = var20;
                        }
                        if (!var12.field3436) {
                            var14 = 128;
                        }
                    }
                    int var21;
                    int var22;
                    int var25;
                    int var26;
                    if (var12.field3467 == 2) {
                        var22 = arg1;
                        var21 = arg5;
                        var25 = arg2;
                        var26 = arg9;
                    } else {
                        var21 = arg5 < var16 ? var16 : arg5;
                        var22 = arg1 < var15 ? var15 : arg1;
                        int var23 = var12.field3391 + var16;
                        int var24 = var12.field3343 + var15;
                        if (var12.field3467 == 9) {
                            var24++;
                            var23++;
                        }
                        var25 = arg2 <= var23 ? arg2 : var23;
                        var26 = arg9 <= var24 ? arg9 : var24;
                    }
                    if (!var12.field3396 || var21 < var25 && var22 < var26) {
                        if (var12.field3357 != 0) {
                            if (var12.field3357 == 1337 || var12.field3357 == 1403 && class253.field4323) {
                                class204.field3695 = var12;
                                class40.field727 = var15;
                                class255.field4364 = var16;
                                class78.method589(var12.field3343, var12.field3357 == 1403, var16, 0, var15, var12.field3391);
                                if (class253.field4323) {
                                    class60.method470(arg5, arg1, arg2, arg9);
                                } else {
                                    class178.method1302(arg5, arg1, arg2, arg9);
                                }
                                continue;
                            }
                            if (var12.field3357 == 1338) {
                                if (!var12.method1356(-128)) {
                                    continue;
                                }
                                class182.method1331(var12, var13, true, var15, var16);
                                if (class253.field4323) {
                                    class60.method470(arg5, arg1, arg2, arg9);
                                } else {
                                    class178.method1302(arg5, arg1, arg2, arg9);
                                }
                                if (class321.field5495 != 0 && class321.field5495 != 3 || class73.field1341 || class104.field1862 < var21 || var22 > class318.field5479 || var25 <= class104.field1862 || var26 <= class318.field5479) {
                                    continue;
                                }
                                int var42 = class318.field5479 - var15;
                                int var43 = class104.field1862 - var16;
                                int var44 = var12.field3359[var42];
                                if (var43 < var44 || var43 > var44 + var12.field3386[var42]) {
                                    continue;
                                }
                                int var45 = var43 - var12.field3391 / 2;
                                int var46 = class289.field5001 + class215.field3839 & 0x7FF;
                                int var47 = class136.field2366[var46];
                                int var48 = (class162.field2880 + 256) * var47 >> 8;
                                int var49 = class136.field2372[var46];
                                int var50 = var42 - var12.field3343 / 2;
                                int var51 = (class162.field2880 + 256) * var49 >> 8;
                                int var52 = var50 * var51 - var45 * var48 >> 11;
                                int var53 = var45 * var51 + var48 * var50 >> 11;
                                int var54 = class121.field2124.field1192 + var53 >> 7;
                                int var55 = class121.field2124.field1197 - var52 >> 7;
                                if (class320.field5489 && (class173.field3079 & 0x40) != 0) {
                                    class188 var56 = client.method832(class170.field3024, 25767, class96.field1710);
                                    if (var56 == null) {
                                        class9.method60(128);
                                    } else {
                                        class144.method1057(class233.field3990, var55, (short) 5, 98, var54, class261.field4511, -1, 1L);
                                    }
                                    continue;
                                }
                                if (class206.field3735 == 1) {
                                    class144.method1057(class46.field844, var55, (short) 33, 113, var54, class282.field4908, -1, 1L);
                                }
                                class144.method1057(class46.field844, var55, (short) 17, -63, var54, class177.field3138, -1, 1L);
                                continue;
                            }
                            if (var12.field3357 == 1339) {
                                if (var12.method1356(-127)) {
                                    class35.method248(var12, var13, var16, 2, var15);
                                    if (class253.field4323) {
                                        class60.method470(arg5, arg1, arg2, arg9);
                                    } else {
                                        class178.method1302(arg5, arg1, arg2, arg9);
                                    }
                                }
                                continue;
                            }
                            if (var12.field3357 == 1400) {
                                class255.method1759(var15, var16, 9179409, var12.field3391, var12.field3343);
                                class53.field974[var13] = true;
                                class302.field5220[var13] = true;
                                if (class253.field4323) {
                                    class60.method470(arg5, arg1, arg2, arg9);
                                } else {
                                    class178.method1302(arg5, arg1, arg2, arg9);
                                }
                                continue;
                            }
                            if (var12.field3357 == 1401) {
                                class146.method1070(false, var12.field3343, var12.field3391, var15, var16);
                                class53.field974[var13] = true;
                                class302.field5220[var13] = true;
                                if (class253.field4323) {
                                    class60.method470(arg5, arg1, arg2, arg9);
                                } else {
                                    class178.method1302(arg5, arg1, arg2, arg9);
                                }
                                continue;
                            }
                            if (var12.field3357 == 1402) {
                                if (!class253.field4323) {
                                    class191.method1384(-256, var16, var15);
                                    class53.field974[var13] = true;
                                    class302.field5220[var13] = true;
                                }
                                continue;
                            }
                            if (var12.field3357 == 1405) {
                                if (!class40.field728) {
                                    continue;
                                }
                                int var27 = var16 + var12.field3391;
                                int var28 = var15 + 15;
                                class280.field4875.method2035(class30.method214(new class256[] { class67.field1229, class305.method2125((byte) 77, class255.field4373) }, 29784), var27, var28, 16776960, -1);
                                int var142 = var28 + 15;
                                Runtime var29 = Runtime.getRuntime();
                                int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                int var31 = 16776960;
                                if (var30 > 65536) {
                                    var31 = 16711680;
                                }
                                class280.field4875.method2035(class30.method214(new class256[] { class98.field1759, class305.method2125((byte) 123, var30), class90.field1654 }, 29784), var27, var142, var31, -1);
                                var28 = var142 + 15;
                                if (class253.field4323) {
                                    int var32 = 16776960;
                                    int var33 = (class221.field3872 + class221.field3869 + class221.field3867) / 1024;
                                    if (var33 > 65536) {
                                        var32 = 16711680;
                                    }
                                    class280.field4875.method2035(class30.method214(new class256[] { class66.field1169, class305.method2125((byte) 35, var33), class90.field1654 }, 29784), var27, var28, var32, -1);
                                    var28 += 15;
                                }
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 16776960;
                                int var37 = 0;
                                for (int var38 = 0; var38 < 28; var38++) {
                                    var34 += class234.field4006[var38].method2111(0);
                                    var35 += class234.field4006[var38].method2112(-92);
                                    var37 += class234.field4006[var38].method2117(255);
                                }
                                int var39 = var37 * 100 / var34;
                                int var40 = var35 * 10000 / var34;
                                class256 var41 = class30.method214(new class256[] { class163.field2887, class65.method505(2, 0, (byte) -128, (long) var40, true), class137.field2384, class305.method2125((byte) 50, var39), class24.field315 }, 29784);
                                class159.field2838.method2035(var41, var27, var28, var36, -1);
                                var28 += 12;
                                class53.field974[var13] = true;
                                class302.field5220[var13] = true;
                                continue;
                            }
                            if (var12.field3357 == 1406) {
                                class172.field3063 = var12;
                                class284.field4924 = var15;
                                class183.field3250 = var16;
                                continue;
                            }
                        }
                        if (!class73.field1341) {
                            if (var12.field3467 == 0 && var12.field3350 && class104.field1862 >= var21 && var22 <= class318.field5479 && class104.field1862 < var25 && var26 > class318.field5479 && !class37.field654) {
                                class261.field4510[0] = class56.field1022;
                                class310.field5352[0] = class159.field2841;
                                class303.field5243[0] = 1002;
                                class17.field244 = 1;
                                class130.field2271[0] = class46.field844;
                            }
                            if (var21 <= class104.field1862 && class318.field5479 >= var22 && var25 > class104.field1862 && class318.field5479 < var26) {
                                class207.method1468(class104.field1862 - var16, -var15 + class318.field5479, var12, (byte) -94);
                            }
                        }
                        if (var12.field3467 == 0) {
                            if (!var12.field3396 && client.method827(var12) && class7.field112 != var12) {
                                continue;
                            }
                            if (!var12.field3396) {
                                if ((var12.field3393 - var12.field3343) < var12.field3463) {
                                    var12.field3463 = var12.field3393 - var12.field3343;
                                }
                                if (var12.field3463 < 0) {
                                    var12.field3463 = 0;
                                }
                            }
                            method68(var15 - var12.field3463, var22, var25, arg3, var12.field3342, var21, -124, var16 - var12.field3442, var13, var26);
                            if (var12.field3368 != null) {
                                method68(var15 - var12.field3463, var22, var25, var12.field3368, var12.field3342, var21, -16, var16 - var12.field3442, var13, var26);
                            }
                            class316 var57 = (class316) class62.field1098.method1744((byte) 123, (long) var12.field3342);
                            if (var57 != null) {
                                if (var57.field5456 == 0 && !class73.field1341 && var21 <= class104.field1862 && var22 <= class318.field5479 && var25 > class104.field1862 && var26 > class318.field5479 && !class37.field654) {
                                    class17.field244 = 1;
                                    class303.field5243[0] = 1002;
                                    class261.field4510[0] = class56.field1022;
                                    class130.field2271[0] = class46.field844;
                                    class310.field5352[0] = class159.field2841;
                                }
                                class102.method738(var25, var13, var26, true, var15, var16, var57.field5453, var21, var22);
                            }
                            if (class253.field4323) {
                                class60.method470(arg5, arg1, arg2, arg9);
                            } else {
                                class178.method1302(arg5, arg1, arg2, arg9);
                                class136.method975();
                            }
                        }
                        if (class308.field5331[var13] || class255.field4369 > 1) {
                            if (var12.field3467 == 0 && !var12.field3396 && var12.field3343 < var12.field3393) {
                                class17.method98(var12.field3463, var12.field3393, var12.field3343, var15, false, var12.field3391 + var16);
                            }
                            if (var12.field3467 != 1) {
                                if (var12.field3467 == 2) {
                                    int var125 = 0;
                                    for (int var126 = 0; var126 < var12.field3390; var126++) {
                                        for (int var127 = 0; var127 < var12.field3364; var127++) {
                                            int var128 = (var12.field3367 + 32) * var127 + var16;
                                            int var129 = var15 + ((var12.field3373 + 32) * var126);
                                            if (var125 < 20) {
                                                var129 += var12.field3456[var125];
                                                var128 += var12.field3310[var125];
                                            }
                                            if (var12.field3347[var125] > 0) {
                                                boolean var131 = false;
                                                boolean var132 = false;
                                                int var133 = var12.field3347[var125] - 1;
                                                if ((var128 + 32) > arg5 && arg2 > var128 && arg1 < var129 + 32 && arg9 > var129 || class242.field4123 == var12 && class83.field1510 == var125) {
                                                    class135 var134;
                                                    if (class21.field273 == 1 && class233.field3993 == var125 && class254.field4352 == var12.field3342) {
                                                        var134 = class15.method85(114, var12.field3351[var125], 0, 2, var12.field3365, var133);
                                                    } else {
                                                        var134 = class15.method85(124, var12.field3351[var125], 3153952, 1, var12.field3365, var133);
                                                    }
                                                    if (class136.field2376) {
                                                        class53.field974[var13] = true;
                                                    }
                                                    if (var134 == null) {
                                                        class64.method500(var12, (byte) -117);
                                                    } else if (class242.field4123 == var12 && class83.field1510 == var125) {
                                                        int var135 = class286.field4963 - class251.field4258;
                                                        int var136 = class208.field3762 - class216.field3844;
                                                        if (var136 < 5 && var136 > -5) {
                                                            var136 = 0;
                                                        }
                                                        if (var135 < 5 && var135 > -5) {
                                                            var135 = 0;
                                                        }
                                                        if (class71.field1300 < 5) {
                                                            var135 = 0;
                                                            var136 = 0;
                                                        }
                                                        var134.method649(var128 + var135, var129 + var136, 128);
                                                        if (arg4 != -1) {
                                                            class188 var137 = arg3[arg4 & 0xFFFF];
                                                            int var138;
                                                            int var139;
                                                            if (class253.field4323) {
                                                                var139 = class60.field1083;
                                                                var138 = class60.field1085;
                                                            } else {
                                                                var138 = class178.field3142;
                                                                var139 = class178.field3143;
                                                            }
                                                            if (var138 > (var129 + var136) && var137.field3463 > 0) {
                                                                int var140 = (var138 - var129 - var136) * class29.field398 / 3;
                                                                if (class29.field398 * 10 < var140) {
                                                                    var140 = class29.field398 * 10;
                                                                }
                                                                if (var140 > var137.field3463) {
                                                                    var140 = var137.field3463;
                                                                }
                                                                class216.field3844 += var140;
                                                                var137.field3463 -= var140;
                                                                class64.method500(var137, (byte) -117);
                                                            }
                                                            if ((var129 + var136 + 32) > var139 && var137.field3463 < var137.field3393 - var137.field3343) {
                                                                int var141 = (var129 + var136 + 32 - var139) * class29.field398 / 3;
                                                                if (class29.field398 * 10 < var141) {
                                                                    var141 = class29.field398 * 10;
                                                                }
                                                                if (var141 > (var137.field3393 - var137.field3343 - var137.field3463)) {
                                                                    var141 = var137.field3393 - var137.field3463 - var137.field3343;
                                                                }
                                                                var137.field3463 += var141;
                                                                class216.field3844 -= var141;
                                                                class64.method500(var137, (byte) -117);
                                                            }
                                                        }
                                                    } else if (class316.field5451 == var12 && class264.field4538 == var125) {
                                                        var134.method649(var128, var129, 128);
                                                    } else {
                                                        var134.method637(var128, var129);
                                                    }
                                                }
                                            } else if (var12.field3445 != null && var125 < 20) {
                                                class135 var130 = var12.method1365(var125, (byte) -84);
                                                if (var130 != null) {
                                                    var130.method637(var128, var129);
                                                } else if (class42.field806) {
                                                    class64.method500(var12, (byte) -117);
                                                }
                                            }
                                            var125++;
                                        }
                                    }
                                } else if (var12.field3467 == 3) {
                                    int var124;
                                    if (class248.method1676((byte) -77, var12)) {
                                        var124 = var12.field3384;
                                        if (class7.field112 == var12 && var12.field3408 != 0) {
                                            var124 = var12.field3408;
                                        }
                                    } else {
                                        var124 = var12.field3332;
                                        if (class7.field112 == var12 && var12.field3422 != 0) {
                                            var124 = var12.field3422;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var12.field3427) {
                                            if (class253.field4323) {
                                                class60.method482(var16, var15, var12.field3391, var12.field3343, var124);
                                            } else {
                                                class178.method1299(var16, var15, var12.field3391, var12.field3343, var124);
                                            }
                                        } else if (class253.field4323) {
                                            class60.method474(var16, var15, var12.field3391, var12.field3343, var124);
                                        } else {
                                            class178.method1301(var16, var15, var12.field3391, var12.field3343, var124);
                                        }
                                    } else if (var12.field3427) {
                                        if (class253.field4323) {
                                            class60.method467(var16, var15, var12.field3391, var12.field3343, var124, 256 - (var14 & 0xFF));
                                        } else {
                                            class178.method1290(var16, var15, var12.field3391, var12.field3343, var124, 256 - (var14 & 0xFF));
                                        }
                                    } else if (class253.field4323) {
                                        class60.method480(var16, var15, var12.field3391, var12.field3343, var124, 256 - (var14 & 0xFF));
                                    } else {
                                        class178.method1296(var16, var15, var12.field3391, var12.field3343, var124, 256 - (var14 & 0xFF));
                                    }
                                } else if (var12.field3467 == 4) {
                                    class293 var58 = var12.method1357(class102.field1846, 65535);
                                    if (var58 != null) {
                                        class256 var59 = var12.field3423;
                                        int var60;
                                        if (class248.method1676((byte) -77, var12)) {
                                            var60 = var12.field3384;
                                            if (class7.field112 == var12 && var12.field3408 != 0) {
                                                var60 = var12.field3408;
                                            }
                                            if (var12.field3355.method1799(127) > 0) {
                                                var59 = var12.field3355;
                                            }
                                        } else {
                                            var60 = var12.field3332;
                                            if (class7.field112 == var12 && var12.field3422 != 0) {
                                                var60 = var12.field3422;
                                            }
                                        }
                                        if (var12.field3396 && var12.field3326 != -1) {
                                            class36 var61 = class254.method1753(var12.field3326, true);
                                            var59 = var61.field591;
                                            if (var59 == null) {
                                                var59 = class261.field4513;
                                            }
                                            if ((var61.field595 == 1 || var12.field3430 != 1) && var12.field3430 != -1) {
                                                var59 = class30.method214(new class256[] { class119.field2107, var59, class156.field2776, class122.method814(-122, var12.field3430) }, 29784);
                                            }
                                        }
                                        if (class278.field4815 == var12) {
                                            var60 = var12.field3332;
                                            var59 = class308.field5323;
                                        }
                                        if (!var12.field3396) {
                                            var59 = method71(10539, var12, var59);
                                        }
                                        var58.method2049(var59, var16, var15, var12.field3391, var12.field3343, var60, var12.field3376 ? 0 : -1, var12.field3381, var12.field3319, var12.field3354);
                                    } else if (class42.field806) {
                                        class64.method500(var12, (byte) -117);
                                    }
                                } else if (var12.field3467 == 5) {
                                    if (var12.field3396) {
                                        class135 var62;
                                        if (var12.field3326 == -1) {
                                            var62 = var12.method1359(false, (byte) -106);
                                        } else {
                                            var62 = class15.method85(119, var12.field3430, var12.field3411, var12.field3419, var12.field3365, var12.field3326);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field2351;
                                            int var64 = var62.field2354;
                                            if (var12.field3309) {
                                                int var66 = (var12.field3391 + var63 - 1) / var63;
                                                int var67 = (var12.field3343 + var64 - 1) / var64;
                                                if (class253.field4323) {
                                                    class60.method468(var16, var15, var12.field3391 + var16, var12.field3343 + var15);
                                                    boolean var68 = class267.method1857(0, var62.field2343);
                                                    boolean var69 = class267.method1857(0, var62.field2348);
                                                    class87 var70 = (class87) var62;
                                                    if (var68 && var69) {
                                                        if (var14 == 0) {
                                                            var70.method644(var16, var15, var66, var67);
                                                        } else {
                                                            var70.method639(var16, var15, 256 - (var14 & 0xFF), var66, var67);
                                                        }
                                                    } else if (var68) {
                                                        for (int var71 = 0; var71 < var67; var71++) {
                                                            if (var14 == 0) {
                                                                var70.method644(var16, var64 * var71 + var15, var66, 1);
                                                            } else {
                                                                var70.method639(var16, var15 + (var64 * var71), -(var14 & 0xFF) + 256, var66, 1);
                                                            }
                                                        }
                                                    } else if (var69) {
                                                        for (int var72 = 0; var72 < var66; var72++) {
                                                            if (var14 == 0) {
                                                                var70.method644(var63 * var72 + var16, var15, 1, var67);
                                                            } else {
                                                                var70.method639(var63 * var72 + var16, var15, 256 - (var14 & 0xFF), 1, var67);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var73 = 0; var73 < var66; var73++) {
                                                            for (int var74 = 0; var74 < var67; var74++) {
                                                                if (var14 == 0) {
                                                                    var62.method637(var63 * var73 + var16, var15 - -(var64 * var74));
                                                                } else {
                                                                    var62.method649(var63 * var73 + var16, var64 * var74 + var15, 256 - (var14 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class60.method470(arg5, arg1, arg2, arg9);
                                                } else {
                                                    class178.method1289(var16, var15, var16 + var12.field3391, var15 - -var12.field3343);
                                                    for (int var75 = 0; var75 < var66; var75++) {
                                                        for (int var76 = 0; var76 < var67; var76++) {
                                                            if (var12.field3433 != 0) {
                                                                var62.method963((byte) -49, 4096, var63 / 2 + var63 * var75 + var16, var12.field3433, var15 - (-(var64 * var76) - var64 / 2));
                                                            } else if (var14 == 0) {
                                                                var62.method637(var63 * var75 + var16, var64 * var76 + var15);
                                                            } else {
                                                                var62.method649(var16 + (var63 * var75), var64 * var76 + var15, 256 - (var14 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class178.method1302(arg5, arg1, arg2, arg9);
                                                }
                                            } else {
                                                int var65 = var12.field3391 * 4096 / var63;
                                                if (var12.field3433 != 0) {
                                                    var62.method963((byte) 103, var65, var16 + (var12.field3391 / 2), var12.field3433, var12.field3343 / 2 + var15);
                                                } else if (var14 != 0) {
                                                    var62.method643(var16, var15, var12.field3391, var12.field3343, 256 - (var14 & 0xFF));
                                                } else if (var12.field3391 == var63 && var12.field3343 == var64) {
                                                    var62.method637(var16, var15);
                                                } else {
                                                    var62.method648(var16, var15, var12.field3391, var12.field3343);
                                                }
                                            }
                                        } else if (class42.field806) {
                                            class64.method500(var12, (byte) -117);
                                        }
                                    } else {
                                        class135 var77 = var12.method1359(class248.method1676((byte) -77, var12), (byte) -104);
                                        if (var77 != null) {
                                            var77.method637(var16, var15);
                                        } else if (class42.field806) {
                                            class64.method500(var12, (byte) -117);
                                        }
                                    }
                                } else if (var12.field3467 == 6) {
                                    boolean var78 = class248.method1676((byte) -77, var12);
                                    class26 var79 = null;
                                    int var80;
                                    if (var78) {
                                        var80 = var12.field3432;
                                    } else {
                                        var80 = var12.field3318;
                                    }
                                    int var81 = 0;
                                    if (var12.field3326 != -1) {
                                        class36 var82 = class254.method1753(var12.field3326, true);
                                        if (var82 != null) {
                                            class36 var83 = var82.method267(0, var12.field3430);
                                            class117 var84 = var80 == -1 ? null : class250.method1682(var80, true);
                                            var79 = var83.method262(1, var84, false, var12.field3394);
                                            if (var79 == null) {
                                                class64.method500(var12, (byte) -117);
                                            } else {
                                                var81 = -var79.method154() / 2;
                                            }
                                        }
                                    } else if (var12.field3434 == 5) {
                                        if (var12.field3306 == -1) {
                                            var79 = class13.field176.method398(-1, (byte) -71, (class117) null, true, -1, (class117) null);
                                        } else {
                                            int var85 = var12.field3306 & 0x7FF;
                                            if (class104.field1852 == var85) {
                                                var85 = 2047;
                                            }
                                            class144 var86 = class300.field5172[var85];
                                            class117 var87 = var80 == -1 ? null : class250.method1682(var80, true);
                                            if (var86 != null && (int) var86.field2532.method1780(true) << 11 == (var12.field3306 & 0xFFFFF800)) {
                                                var79 = var86.field2552.method398(var12.field3394, (byte) 91, var87, true, 0, (class117) null);
                                            }
                                        }
                                    } else if (var80 == -1) {
                                        var79 = var12.method1369(class121.field2124.field2552, -1, 0, (class117) null, var78);
                                        if (var79 == null && class42.field806) {
                                            class64.method500(var12, (byte) -117);
                                        }
                                    } else {
                                        class117 var88 = class250.method1682(var80, true);
                                        var79 = var12.method1369(class121.field2124.field2552, var12.field3394, 0, var88, var78);
                                        if (var79 == null && class42.field806) {
                                            class64.method500(var12, (byte) -117);
                                        }
                                    }
                                    if (var79 != null) {
                                        int var89;
                                        if (var12.field3335 > 0) {
                                            var89 = (var12.field3391 << 8) / var12.field3335;
                                        } else {
                                            var89 = 256;
                                        }
                                        int var90;
                                        if (var12.field3457 <= 0) {
                                            var90 = 256;
                                        } else {
                                            var90 = (var12.field3343 << 8) / var12.field3457;
                                        }
                                        int var91 = (var12.field3431 * var90 >> 8) + var12.field3343 / 2 + var15;
                                        int var92 = var16 - (-(var12.field3402 * var89 >> 8) - (var12.field3391 / 2));
                                        if (class253.field4323) {
                                            if (var12.field3458) {
                                                class253.method1711(var92, var91, var12.field3450, var12.field3320, var89, var90);
                                            } else {
                                                class253.method1738(var92, var91, var89, var90);
                                                class253.method1739((float) var12.field3441, (float) var12.field3320 * 1.5F);
                                            }
                                            class253.method1721();
                                            class253.method1730(true);
                                            class253.method1716(false);
                                            class139.method1027(class106.field1895, 118);
                                            if (class28.field380) {
                                                class60.method479();
                                                class253.method1720();
                                                class60.method470(arg5, arg1, arg2, arg9);
                                                class28.field380 = false;
                                            }
                                            if (var12.field3352) {
                                                class253.method1709();
                                            }
                                            int var95 = class136.field2366[var12.field3353] * var12.field3450 >> 16;
                                            int var96 = class136.field2372[var12.field3353] * var12.field3450 >> 16;
                                            if (var12.field3396) {
                                                var79.method162(0, var12.field3313, var12.field3466, var12.field3353, var12.field3317, var81 + var95 + var12.field3395, var12.field3395 + var96, -1L);
                                            } else {
                                                var79.method162(0, var12.field3313, 0, var12.field3353, 0, var95, var96, -1L);
                                            }
                                            if (var12.field3352) {
                                                class253.method1728();
                                            }
                                        } else {
                                            class136.method980(var92, var91);
                                            int var93 = class136.field2372[var12.field3353] * var12.field3450 >> 16;
                                            int var94 = class136.field2366[var12.field3353] * var12.field3450 >> 16;
                                            if (!var12.field3396) {
                                                var79.method162(0, var12.field3313, 0, var12.field3353, 0, var94, var93, -1L);
                                            } else if (var12.field3458) {
                                                ((class89) var79).method659(0, var12.field3313, var12.field3466, var12.field3353, var12.field3317, var81 + var94 + var12.field3395, var12.field3395 + var93, var12.field3450);
                                            } else {
                                                var79.method162(0, var12.field3313, var12.field3466, var12.field3353, var12.field3317, var81 + var12.field3395 + var94, var12.field3395 + var93, -1L);
                                            }
                                            class136.method969();
                                        }
                                    }
                                } else {
                                    if (var12.field3467 == 7) {
                                        class293 var97 = var12.method1357(class102.field1846, 65535);
                                        if (var97 == null) {
                                            if (class42.field806) {
                                                class64.method500(var12, (byte) -117);
                                            }
                                            continue;
                                        }
                                        int var98 = 0;
                                        for (int var99 = 0; var99 < var12.field3390; var99++) {
                                            for (int var100 = 0; var100 < var12.field3364; var100++) {
                                                if (var12.field3347[var98] > 0) {
                                                    class36 var101 = class254.method1753(var12.field3347[var98] - 1, true);
                                                    class256 var102;
                                                    if (var101.field595 != 1 && var12.field3351[var98] == 1) {
                                                        var102 = class30.method214(new class256[] { class119.field2107, var101.field591, class164.field2911 }, 29784);
                                                    } else {
                                                        var102 = class30.method214(new class256[] { class119.field2107, var101.field591, class156.field2776, class122.method814(-124, var12.field3351[var98]) }, 29784);
                                                    }
                                                    int var103 = var15 + ((var12.field3373 + 12) * var99);
                                                    int var104 = (var12.field3367 + 115) * var100 + var16;
                                                    if (var12.field3381 == 0) {
                                                        var97.method2042(var102, var104, var103, var12.field3332, var12.field3376 ? 0 : -1);
                                                    } else if (var12.field3381 == 1) {
                                                        var97.method2056(var102, var104 + 57, var103, var12.field3332, var12.field3376 ? 0 : -1);
                                                    } else {
                                                        var97.method2035(var102, var104 + 115 - 1, var103, var12.field3332, var12.field3376 ? 0 : -1);
                                                    }
                                                }
                                                var98++;
                                            }
                                        }
                                    }
                                    if (var12.field3467 == 8 && class233.field3984 == var12 && class28.field384 == class200.field3656) {
                                        int var105 = 0;
                                        int var106 = 0;
                                        class293 var107 = class280.field4875;
                                        class256 var108 = var12.field3423;
                                        class256 var109 = method71(10539, var12, var108);
                                        while (var109.method1799(127) > 0) {
                                            int var110 = var109.method1779(class17.field230, (byte) -116);
                                            class256 var111;
                                            if (var110 == -1) {
                                                var111 = var109;
                                                var109 = class46.field844;
                                            } else {
                                                var111 = var109.method1777(var110, 25163, 0);
                                                var109 = var109.method1788(25610, var110 + 4);
                                            }
                                            int var112 = var107.method2045(var111);
                                            if (var106 < var112) {
                                                var106 = var112;
                                            }
                                            var105 += var107.field5094 + 1;
                                        }
                                        var106 += 6;
                                        int var113 = var15 + var12.field3343 + 5;
                                        var105 += 7;
                                        int var114 = var16 + var12.field3391 - var106 - 5;
                                        if (var105 + var113 > arg9) {
                                            var113 = arg9 - var105;
                                        }
                                        if (var16 + 5 > var114) {
                                            var114 = var16 + 5;
                                        }
                                        if (arg2 < (var114 + var106)) {
                                            var114 = arg2 - var106;
                                        }
                                        if (class253.field4323) {
                                            class60.method482(var114, var113, var106, var105, 16777120);
                                            class60.method474(var114, var113, var106, var105, 0);
                                        } else {
                                            class178.method1299(var114, var113, var106, var105, 16777120);
                                            class178.method1301(var114, var113, var106, var105, 0);
                                        }
                                        int var115 = var107.field5094 + var113 + 2;
                                        class256 var116 = var12.field3423;
                                        class256 var117 = method71(10539, var12, var116);
                                        while (var117.method1799(127) > 0) {
                                            int var118 = var117.method1779(class17.field230, (byte) -116);
                                            class256 var119;
                                            if (var118 == -1) {
                                                var119 = var117;
                                                var117 = class46.field844;
                                            } else {
                                                var119 = var117.method1777(var118, 25163, 0);
                                                var117 = var117.method1788(25610, var118 + 4);
                                            }
                                            var107.method2042(var119, var114 + 3, var115, 0, -1);
                                            var115 += var107.field5094 + 1;
                                        }
                                    }
                                    if (var12.field3467 == 9) {
                                        int var120;
                                        int var121;
                                        int var122;
                                        int var123;
                                        if (var12.field3374) {
                                            var120 = var12.field3391 + var16;
                                            var121 = var15;
                                            var122 = var12.field3343 + var15;
                                            var123 = var16;
                                        } else {
                                            var123 = var16;
                                            var122 = var15;
                                            var121 = var12.field3343 + var15;
                                            var120 = var12.field3391 + var16;
                                        }
                                        if (var12.field3383 == 1) {
                                            if (class253.field4323) {
                                                class60.method472(var123, var122, var120, var121, var12.field3332);
                                            } else {
                                                class178.method1306(var123, var122, var120, var121, var12.field3332);
                                            }
                                        } else if (class253.field4323) {
                                            class60.method473(var123, var122, var120, var121, var12.field3332, var12.field3383);
                                        } else {
                                            class178.method1293(var123, var122, var120, var121, var12.field3332, var12.field3383);
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

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BZ)V", line = 1360)
    public static final void method69(byte arg0, boolean arg1) {
        class257.field4455 = arg1;
        if (arg0 != -113) {
            method72(true);
        }
        field164++;
        class132.field2307 = !class216.method1512(arg0 + 241);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I", line = 1375)
    public static final int method70(int arg0, int arg1, int arg2) {
        field161++;
        if (arg2 != 2) {
            method72(false);
        }
        class185 var3 = (class185) class254.field4355.method1744((byte) 123, (long) arg1);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field3254.length > arg0) {
            return var3.field3254[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILla;Lke;)Lke;", line = 1399)
    private static final class256 method71(int arg0, class188 arg1, class256 arg2) {
        if (arg0 != 10539) {
            field165 = false;
        }
        field163++;
        if (arg2.method1779(class36.field648, (byte) -116) == -1) {
            return arg2;
        }
        while (true) {
            int var3 = arg2.method1779(class44.field820, (byte) -116);
            if (var3 == -1) {
                while (true) {
                    int var4 = arg2.method1779(class277.field4767, (byte) -116);
                    if (var4 == -1) {
                        while (true) {
                            int var5 = arg2.method1779(class67.field1234, (byte) -116);
                            if (var5 == -1) {
                                while (true) {
                                    int var6 = arg2.method1779(class214.field3823, (byte) -116);
                                    if (var6 == -1) {
                                        while (true) {
                                            int var7 = arg2.method1779(class119.field2106, (byte) -116);
                                            if (var7 == -1) {
                                                while (true) {
                                                    int var8 = arg2.method1779(class204.field3710, (byte) -116);
                                                    if (var8 == -1) {
                                                        return arg2;
                                                    }
                                                    class256 var9 = class46.field844;
                                                    if (class288.field4980 != null) {
                                                        var9 = class102.method737(16739446, class288.field4980.field1497);
                                                        try {
                                                            if (class288.field4980.field1499 != null) {
                                                                byte[] var10 = ((String) class288.field4980.field1499).getBytes("ISO-8859-1");
                                                                var9 = class49.method392(var10, (byte) 96, 0, var10.length);
                                                            }
                                                        } catch (UnsupportedEncodingException var12) {
                                                        }
                                                    }
                                                    arg2 = class30.method214(new class256[] { arg2.method1777(var8, 25163, 0), var9, arg2.method1788(25610, var8 + 4) }, 29784);
                                                }
                                            }
                                            arg2 = class30.method214(new class256[] { arg2.method1777(var7, 25163, 0), class244.method1641(class233.method1580(4, arg1, -4), (byte) 89), arg2.method1788(25610, var7 + 2) }, 29784);
                                        }
                                    }
                                    arg2 = class30.method214(new class256[] { arg2.method1777(var6, arg0 ^ 0x4B60, 0), class244.method1641(class233.method1580(3, arg1, -4), (byte) 89), arg2.method1788(25610, var6 + 2) }, 29784);
                                }
                            }
                            arg2 = class30.method214(new class256[] { arg2.method1777(var5, 25163, 0), class244.method1641(class233.method1580(2, arg1, -4), (byte) 89), arg2.method1788(25610, var5 + 2) }, 29784);
                        }
                    }
                    arg2 = class30.method214(new class256[] { arg2.method1777(var4, 25163, 0), class244.method1641(class233.method1580(1, arg1, -4), (byte) 89), arg2.method1788(25610, var4 + 2) }, arg0 + 19245);
                }
            }
            arg2 = class30.method214(new class256[] { arg2.method1777(var3, 25163, 0), class244.method1641(class233.method1580(0, arg1, -4), (byte) 89), arg2.method1788(arg0 ^ 0x4D21, var3 + 2) }, 29784);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V", line = 1505)
    public static void method72(boolean arg0) {
        if (!arg0) {
            field167 = (int[][]) ((int[][]) null);
        }
        field167 = (int[][]) null;
    }
}
