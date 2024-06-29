import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class86 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lcb;")
    public static class15 field2155 = new class15(64);

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2161 = 0;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "La;")
    private static class1 field2162 = class113.method934(-11538, "flash1:");

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "La;")
    public static class1 field2160 = field2162;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lpb;")
    public static class92 field2163 = new class92();

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "La;")
    public static class1 field2165 = class113.method934(-11538, "backleft2");

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "La;")
    public static class1 field2168 = class113.method934(-11538, ":");

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field2166 = 0;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2169 = -1;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "La;")
    public static class1 field2167 = class113.method934(-11538, "Schlie-8en");

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(JI)V", line = 5)
    public static final void method756(long arg0, int arg1) {
        field2164++;
        if (arg0 <= 0L) {
            return;
        }
        int var3 = 81 / ((arg1 + 20) / 42);
        if (arg0 % 10L == 0L) {
            class39.method428(arg0 - 1L, -110);
            class39.method428(1L, -110);
        } else {
            class39.method428(arg0, -103);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([Ljava/lang/Object;IILqd;IZ)V", line = 29)
    public static final void method757(Object[] arg0, int arg1, int arg2, class100 arg3, int arg4, boolean arg5) {
        field2156++;
        int var6 = 0;
        class16 var7 = class95.method827((Integer) arg0[0], 76, 27);
        int[] var8 = var7.field510;
        int[] var9 = var7.field520;
        int var10 = 0;
        int var11 = -1;
        boolean var12 = true;
        try {
            class44.field1164 = new int[var7.field519];
            class103.field2609 = new class1[var7.field515];
            int var13 = 0;
            int var14 = 0;
            if (arg5) {
                field2161 = -119;
            }
            for (int var15 = 1; var15 < arg0.length; var15++) {
                if (arg0[var15] instanceof Integer) {
                    int var16 = (Integer) arg0[var15];
                    if (var16 == -2147483647) {
                        var16 = arg4;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg3.field2498;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1;
                    }
                    class44.field1164[var13++] = var16;
                } else if (arg0[var15] instanceof class1) {
                    class103.field2609[var14++] = (class1) arg0[var15];
                }
            }
            while (true) {
                int var17;
                while (true) {
                    var11++;
                    var17 = var9[var11];
                    if (var17 >= 100) {
                        break;
                    }
                    if (var17 == 0) {
                        class133.field3258[var6++] = var8[var11];
                    } else if (var17 == 1) {
                        int var18 = var8[var11];
                        class133.field3258[var6++] = class113.field2806[var18];
                    } else if (var17 == 2) {
                        int var19 = var8[var11];
                        var6--;
                        class113.field2806[var19] = class133.field3258[var6];
                    } else if (var17 == 3) {
                        class119.field2960[var10++] = var7.field518[var11];
                    } else if (var17 == 6) {
                        var11 += var8[var11];
                    } else if (var17 == 7) {
                        var6 -= 2;
                        if (class133.field3258[var6 + 1] != class133.field3258[var6]) {
                            var11 += var8[var11];
                        }
                    } else if (var17 == 8) {
                        var6 -= 2;
                        if (class133.field3258[var6 + 1] == class133.field3258[var6]) {
                            var11 += var8[var11];
                        }
                    } else if (var17 == 9) {
                        var6 -= 2;
                        if (class133.field3258[var6 + 1] > class133.field3258[var6]) {
                            var11 += var8[var11];
                        }
                    } else if (var17 == 10) {
                        var6 -= 2;
                        if (class133.field3258[var6 + 1] < class133.field3258[var6]) {
                            var11 += var8[var11];
                        }
                    } else if (var17 == 21) {
                        if (class66.field1656 == 0) {
                            return;
                        }
                        class121 var20 = class109.field2739[--class66.field1656];
                        class103.field2609 = var20.field3013;
                        class44.field1164 = var20.field3003;
                        var11 = var20.field3016;
                        var7 = var20.field3002;
                        var8 = var7.field510;
                        var9 = var7.field520;
                    } else if (var17 == 25) {
                        int var21 = var8[var11];
                        class133.field3258[var6++] = class46.method482(var21, 1369);
                    } else if (var17 == 27) {
                        int var22 = var8[var11];
                        var6--;
                        class12.method242(class133.field3258[var6], var22, (byte) 118);
                    } else if (var17 == 31) {
                        var6 -= 2;
                        if (class133.field3258[var6] <= class133.field3258[var6 + 1]) {
                            var11 += var8[var11];
                        }
                    } else if (var17 == 32) {
                        var6 -= 2;
                        if (class133.field3258[var6 + 1] <= class133.field3258[var6]) {
                            var11 += var8[var11];
                        }
                    } else if (var17 == 33) {
                        class133.field3258[var6++] = class44.field1164[var8[var11]];
                    } else {
                        int var10001;
                        if (var17 == 34) {
                            var10001 = var8[var11];
                            var6--;
                            class44.field1164[var10001] = class133.field3258[var6];
                        } else if (var17 == 35) {
                            class119.field2960[var10++] = class103.field2609[var8[var11]];
                        } else if (var17 == 36) {
                            var10001 = var8[var11];
                            var10--;
                            class103.field2609[var10001] = class119.field2960[var10];
                        } else if (var17 == 37) {
                            int var23 = var8[var11];
                            var10 -= var23;
                            class1 var24 = class95.method828(63, var23, var10, class119.field2960);
                            class119.field2960[var10++] = var24;
                        } else if (var17 == 38) {
                            var6--;
                        } else if (var17 == 39) {
                            var10--;
                        } else if (var17 == 40) {
                            int var25 = var8[var11];
                            class16 var26 = class95.method827(var25, 73, 65);
                            int[] var27 = new int[var26.field519];
                            class1[] var28 = new class1[var26.field515];
                            for (int var29 = 0; var29 < var26.field511; var29++) {
                                var27[var29] = class133.field3258[var6 + var29 - var26.field511];
                            }
                            for (int var30 = 0; var30 < var26.field514; var30++) {
                                var28[var30] = class119.field2960[var10 + var30 - var26.field514];
                            }
                            var10 -= var26.field514;
                            var6 -= var26.field511;
                            class121 var31 = new class121();
                            var31.field3013 = class103.field2609;
                            var31.field3002 = var7;
                            var31.field3003 = class44.field1164;
                            var7 = var26;
                            var31.field3016 = var11;
                            class109.field2739[class66.field1656++] = var31;
                            var8 = var26.field510;
                            class103.field2609 = var28;
                            var11 = -1;
                            class44.field1164 = var27;
                            var9 = var26.field520;
                        } else if (var17 == 42) {
                            class133.field3258[var6++] = class38.field1021[var8[var11]];
                        } else {
                            if (var17 != 43) {
                                break;
                            }
                            var10001 = var8[var11];
                            var6--;
                            class38.field1021[var10001] = class133.field3258[var6];
                        }
                    }
                }
                boolean var32;
                if (var8[var11] == 1) {
                    var32 = true;
                } else {
                    var32 = false;
                }
                if (var17 < 1000) {
                    if (var17 == 100) {
                        var6 -= 3;
                        int var33 = class133.field3258[var6];
                        int var34 = class133.field3258[var6 + 1];
                        int var35 = class133.field3258[var6 + 2];
                        class100 var36 = class134.method1056(var33, (byte) -108);
                        if (var36.field2522 == null) {
                            var36.field2522 = new class100[var35 + 1];
                        }
                        if (var35 >= var36.field2522.length) {
                            class100[] var37 = new class100[var35 + 1];
                            for (int var38 = 0; var38 < var36.field2522.length; var38++) {
                                var37[var38] = var36.field2522[var38];
                            }
                            var36.field2522 = var37;
                        }
                        class100 var39 = new class100();
                        var39.field2457 = var36.field2498;
                        var39.field2492 = var34;
                        var39.field2498 = ((var36.field2498 & 0xFFFF) << 15) + var35 + Integer.MIN_VALUE;
                        var36.field2522[var35] = var39;
                        if (var32) {
                            class57.field1471 = var39;
                        } else {
                            class123.field3071 = var39;
                        }
                    } else if (var17 == 101) {
                        class100 var40 = var32 ? class57.field1471 : class123.field3071;
                        class100 var41 = class134.method1056(var40.field2457, (byte) -100);
                        var41.field2522[class132.method1034(var40.field2498, 32767)] = null;
                    } else {
                        if (var17 != 102) {
                            break;
                        }
                        var6--;
                        class100 var42 = class134.method1056(class133.field3258[var6], (byte) -83);
                        var42.field2522 = null;
                    }
                } else if (var17 >= 1000 && var17 < 1100 || var17 >= 2000 && var17 < 2100) {
                    class100 var43;
                    if (var17 >= 2000) {
                        var6--;
                        var43 = class134.method1056(class133.field3258[var6], (byte) -64);
                        var17 -= 1000;
                    } else {
                        var43 = var32 ? class57.field1471 : class123.field3071;
                    }
                    if (var17 == 1000) {
                        var6 -= 2;
                        var43.field2465 = class133.field3258[var6];
                        var43.field2505 = class133.field3258[var6 + 1];
                    } else if (var17 == 1001) {
                        var6 -= 2;
                        var43.field2501 = class133.field3258[var6];
                        var43.field2452 = class133.field3258[var6 + 1];
                    } else if (var17 == 1003) {
                        var6--;
                        var43.field2559 = class133.field3258[var6] == 1;
                    } else {
                        if (var17 != 1004) {
                            break;
                        }
                        var6--;
                        var43.field2497 = class133.field3258[var6] == 1;
                    }
                } else if (var17 >= 1100 && var17 < 1200 || var17 >= 2100 && var17 < 2200) {
                    class100 var44;
                    if (var17 < 2000) {
                        var44 = var32 ? class57.field1471 : class123.field3071;
                    } else {
                        var6--;
                        var44 = class134.method1056(class133.field3258[var6], (byte) -65);
                        var17 -= 1000;
                    }
                    if (var17 == 1100) {
                        var6 -= 2;
                        var44.field2555 = class133.field3258[var6];
                        var44.field2540 = class133.field3258[var6 + 1];
                    } else if (var17 == 1101) {
                        var6--;
                        int var45 = class133.field3258[var6];
                        int var46 = var45 >> 10 & 0x1F;
                        int var47 = var45 & 0x1F;
                        int var48 = var45 >> 5 & 0x1F;
                        var44.field2456 = (var46 << 19) + (var48 << 11) + (var47 << 3);
                    } else if (var17 == 1102) {
                        var6--;
                        var44.field2454 = class133.field3258[var6] == 1;
                    } else if (var17 == 1103) {
                        var6--;
                        var44.field2554 = class133.field3258[var6];
                    } else if (var17 == 1104) {
                        var6--;
                    } else if (var17 == 1105) {
                        var6--;
                        var44.field2553 = class133.field3258[var6];
                    } else if (var17 == 1106) {
                        var6--;
                        var44.field2560 = class133.field3258[var6];
                    } else if (var17 == 1107) {
                        var6--;
                        var44.field2450 = class133.field3258[var6] == 1;
                    } else if (var17 == 1108) {
                        var44.field2496 = 1;
                        var6--;
                        var44.field2482 = class133.field3258[var6];
                    } else if (var17 == 1109) {
                        var6 -= 6;
                        var44.field2546 = class133.field3258[var6];
                        var44.field2488 = class133.field3258[var6 + 1];
                        var44.field2499 = class133.field3258[var6 + 2];
                        var44.field2466 = class133.field3258[var6 + 3];
                        var44.field2534 = class133.field3258[var6 + 4];
                        var44.field2537 = class133.field3258[var6 + 5];
                    } else if (var17 == 1110) {
                        var6--;
                        var44.field2468 = class133.field3258[var6];
                    } else if (var17 == 1111) {
                        var6--;
                        var44.field2510 = class133.field3258[var6] == 1;
                    } else if (var17 == 1112) {
                        var10--;
                        var44.field2477 = class119.field2960[var10];
                    } else if (var17 == 1113) {
                        var6--;
                        var44.field2451 = class133.field3258[var6];
                    } else if (var17 == 1114) {
                        var6 -= 3;
                        var44.field2542 = class133.field3258[var6];
                        var44.field2524 = class133.field3258[var6 + 1];
                        var44.field2541 = class133.field3258[var6 + 2];
                    } else {
                        if (var17 != 1115) {
                            break;
                        }
                        var6--;
                        var44.field2474 = class133.field3258[var6] == 1;
                    }
                } else if (var17 >= 1200 && var17 < 1300 || var17 >= 2200 && var17 < 2300) {
                    class100 var131;
                    if (var17 < 2000) {
                        var131 = var32 ? class57.field1471 : class123.field3071;
                    } else {
                        var6--;
                        var131 = class134.method1056(class133.field3258[var6], (byte) -65);
                        var17 -= 1000;
                    }
                    if (var17 == 1200) {
                        var6 -= 3;
                        int var132 = class133.field3258[var6];
                        int var133 = class133.field3258[var6 + 2];
                        if (var132 == -1) {
                            var131.field2496 = 0;
                        } else {
                            class115 var134 = class89.method763(var132, 10);
                            var131.field2496 = 4;
                            var131.field2499 = var134.field2878;
                            var131.field2534 = var134.field2861;
                            var131.field2537 = var134.field2851 * 100 / var133;
                            var131.field2466 = var134.field2864;
                            var131.field2488 = var134.field2844;
                            var131.field2546 = var134.field2840;
                            var131.field2482 = var132;
                        }
                    } else if (var17 == 1201) {
                        var131.field2496 = 2;
                        var6--;
                        var131.field2482 = class133.field3258[var6];
                    } else if (var17 == 1202) {
                        var131.field2496 = 3;
                        var131.field2482 = class104.field2624.field91.method637(-20874);
                    } else {
                        if (var17 != 1203) {
                            break;
                        }
                        class100 var135 = var32 ? class123.field3071 : class57.field1471;
                        var131.field2547 = var135.field2498;
                    }
                } else if (var17 >= 1300 && var17 < 1400 || !(var17 < 2300 || var17 >= 2400)) {
                    class100 var124;
                    if (var17 >= 2000) {
                        var6--;
                        var124 = class134.method1056(class133.field3258[var6], (byte) -81);
                        var17 -= 1000;
                    } else {
                        var124 = var32 ? class57.field1471 : class123.field3071;
                    }
                    if (var17 >= 1300 && var17 <= 1309 || !(var17 < 1314 || var17 > 1317)) {
                        var10--;
                        class1 var125 = class119.field2960[var10];
                        Object[] var126 = new Object[var125.method10(-3136) + 1];
                        for (int var127 = var126.length - 1; var127 >= 1; var127--) {
                            if (var125.method6(var127 - 1, arg5) == 115) {
                                var10--;
                                var126[var127] = class119.field2960[var10];
                            } else {
                                var6--;
                                var126[var127] = Integer.valueOf(class133.field3258[var6]);
                            }
                        }
                        var6--;
                        var126[0] = Integer.valueOf(class133.field3258[var6]);
                        if (var17 == 1303) {
                            var124.field2516 = var126;
                        }
                        if (var17 == 1317) {
                            var124.field2489 = var126;
                        }
                        if (var17 == 1304) {
                            var124.field2467 = var126;
                        }
                        if (var17 == 1302) {
                            var124.field2453 = var126;
                        }
                        if (var17 == 1316) {
                            var124.field2556 = var126;
                        }
                        if (var17 == 1301) {
                            var124.field2490 = var126;
                        }
                        if (var17 == 1300) {
                            var124.field2486 = var126;
                        }
                        if (var17 == 1315) {
                            var124.field2504 = var126;
                        }
                        if (var17 == 1306) {
                            var124.field2478 = var126;
                        }
                        if (var17 == 1305) {
                            var124.field2481 = var126;
                        }
                        if (var17 == 1309) {
                            var124.field2521 = var126;
                        }
                        if (var17 == 1308) {
                            var124.field2459 = var126;
                        }
                    } else if (var17 == 1310) {
                        var6--;
                        int var128 = class133.field3258[var6] - 1;
                        if (var128 >= 0 && var128 <= 9) {
                            if (var124.field2470 == null || var124.field2470.length <= var128) {
                                class1[] var129 = new class1[var128 + 1];
                                if (var124.field2470 != null) {
                                    for (int var130 = 0; var130 < var124.field2470.length; var130++) {
                                        var129[var130] = var124.field2470[var130];
                                    }
                                }
                                var124.field2470 = var129;
                            }
                            var10--;
                            var124.field2470[var128] = class119.field2960[var10];
                        } else {
                            var10--;
                        }
                    } else if (var17 == 1311) {
                        var6--;
                        var124.field2547 = class133.field3258[var6];
                    } else if (var17 == 1312) {
                        var6--;
                        var124.field2503 = class133.field3258[var6] == 1;
                    } else {
                        if (var17 != 1313) {
                            break;
                        }
                        var6--;
                    }
                } else if (var17 < 1500) {
                    if (var17 == 1400) {
                        var6 -= 2;
                        int var49 = class133.field3258[var6 + 1];
                        int var50 = class133.field3258[var6];
                        class100 var51 = class134.method1056(var50, (byte) -75);
                        if (var51.field2522 == null || var51.field2522.length <= var49 || var51.field2522[var49] == null) {
                            class133.field3258[var6++] = 0;
                        } else {
                            class133.field3258[var6++] = 1;
                            if (var32) {
                                class57.field1471 = var51.field2522[var49];
                            } else {
                                class123.field3071 = var51.field2522[var49];
                            }
                        }
                    } else if (var17 == 1401) {
                        var6 -= 3;
                        int var52 = class133.field3258[var6];
                        int var53 = class133.field3258[var6 + 2];
                        int var54 = class133.field3258[var6 + 1];
                        class100 var55 = class63.method610(class117.field2925[var52], var53, true, 0, -1, 0, var54, 398);
                        if (var55 == null) {
                            class133.field3258[var6++] = 0;
                        } else {
                            class133.field3258[var6++] = 1;
                            if (var32) {
                                class57.field1471 = var55;
                            } else {
                                class123.field3071 = var55;
                            }
                        }
                    } else {
                        if (var17 != 1402) {
                            break;
                        }
                        var6 -= 3;
                        class100 var56 = class134.method1056(class133.field3258[var6], (byte) -103);
                        int var57 = class133.field3258[var6 + 2];
                        int var58 = class133.field3258[var6 + 1];
                        class100 var59 = class63.method610(var56.field2522, var57, true, var56.field2540, var56.field2498, var56.field2555, var58, 398);
                        if (var59 == null) {
                            class133.field3258[var6++] = 0;
                        } else {
                            class133.field3258[var6++] = 1;
                            if (var32) {
                                class57.field1471 = var59;
                            } else {
                                class123.field3071 = var59;
                            }
                        }
                    }
                } else if (var17 < 1600) {
                    class100 var60 = var32 ? class57.field1471 : class123.field3071;
                    if (var17 == 1500) {
                        class133.field3258[var6++] = var60.field2465;
                    } else if (var17 == 1501) {
                        class133.field3258[var6++] = var60.field2505;
                    } else if (var17 == 1502) {
                        class133.field3258[var6++] = var60.field2501;
                    } else if (var17 == 1503) {
                        class133.field3258[var6++] = var60.field2452;
                    } else if (var17 == 1504) {
                        class133.field3258[var6++] = var60.field2559 ? 1 : 0;
                    } else {
                        if (var17 != 1505) {
                            break;
                        }
                        class133.field3258[var6++] = var60.field2457;
                    }
                } else if (var17 < 1700) {
                    class100 var123 = var32 ? class57.field1471 : class123.field3071;
                    if (var17 == 1600) {
                        class133.field3258[var6++] = var123.field2555;
                    } else {
                        if (var17 != 1601) {
                            break;
                        }
                        class133.field3258[var6++] = var123.field2540;
                    }
                } else if (var17 < 2500) {
                    if (var17 == 2401) {
                        var6 -= 3;
                        int var61 = class133.field3258[var6 + 1];
                        int var62 = class133.field3258[var6];
                        int var63 = class133.field3258[var6 + 2];
                        class100 var64 = class63.method610(class117.field2925[var62], var63, false, 0, -1, 0, var61, 398);
                        if (var64 == null) {
                            class133.field3258[var6++] = -1;
                        } else {
                            class133.field3258[var6++] = var64.field2498;
                        }
                    } else {
                        if (var17 != 2402) {
                            break;
                        }
                        var6 -= 3;
                        class100 var65 = class134.method1056(class133.field3258[var6], (byte) -113);
                        int var66 = class133.field3258[var6 + 1];
                        int var67 = class133.field3258[var6 + 2];
                        class100 var68 = class63.method610(class117.field2925[var65.field2498 >> 16], var67, false, var65.field2540, var65.field2498 & 0xFFFF, var65.field2555, var66, 398);
                        if (var68 == null) {
                            class133.field3258[var6++] = -1;
                        } else {
                            class133.field3258[var6++] = var68.field2498;
                        }
                    }
                } else if (var17 < 2600) {
                    var6--;
                    class100 var122 = class134.method1056(class133.field3258[var6], (byte) -103);
                    if (var17 == 2500) {
                        class133.field3258[var6++] = var122.field2465;
                    } else if (var17 == 2501) {
                        class133.field3258[var6++] = var122.field2505;
                    } else if (var17 == 2502) {
                        class133.field3258[var6++] = var122.field2501;
                    } else if (var17 == 2503) {
                        class133.field3258[var6++] = var122.field2452;
                    } else if (var17 == 2504) {
                        class133.field3258[var6++] = var122.field2559 ? 1 : 0;
                    } else {
                        if (var17 != 2505) {
                            break;
                        }
                        class133.field3258[var6++] = var122.field2457;
                    }
                } else if (var17 < 2700) {
                    var6--;
                    class100 var69 = class134.method1056(class133.field3258[var6], (byte) -90);
                    if (var17 == 2600) {
                        class133.field3258[var6++] = var69.field2555;
                    } else {
                        if (var17 != 2601) {
                            break;
                        }
                        class133.field3258[var6++] = var69.field2540;
                    }
                } else {
                    if (var17 < 2800) {
                        break;
                    }
                    if (var17 < 3100) {
                        if (var17 == 3000) {
                            var6--;
                            int var70 = class133.field3258[var6];
                            if (class120.field3001 == -1) {
                                class36.method415(0, var70, -9225);
                                class120.field3001 = var70;
                            }
                        } else if (var17 == 3001 || var17 == 3003) {
                            var6 -= 2;
                            int var71 = class133.field3258[var6];
                            int var72 = class133.field3258[var6 + 1];
                            class72.method676(0, var72, var71, -128);
                        } else if (var17 == 3002) {
                            class100 var73 = var32 ? class57.field1471 : class123.field3071;
                            if (class120.field3001 == -1) {
                                class36.method415(var73.field2498 & 0x7FFF, var73.field2457, -9225);
                                class120.field3001 = var73.field2498;
                            }
                        } else {
                            if (var17 != 3003) {
                                break;
                            }
                            class100 var74 = var32 ? class57.field1471 : class123.field3071;
                            var6--;
                            int var75 = class133.field3258[var6];
                            class72.method676(var74.field2498 & 0x7FFF, var75, var74.field2457, -121);
                        }
                    } else if (var17 >= 3200) {
                        if (var17 < 3300) {
                            if (var17 == 3200) {
                                var6 -= 3;
                                class106.method890(class133.field3258[var6], (byte) 55, class133.field3258[var6 + 1], class133.field3258[var6 + 2]);
                            } else if (var17 == 3201) {
                                var6--;
                                class103.method877(257, class133.field3258[var6]);
                            } else {
                                if (var17 != 3202) {
                                    break;
                                }
                                var6 -= 2;
                                class112.method931(class133.field3258[var6 + 1], (byte) 110, class133.field3258[var6]);
                            }
                        } else if (var17 < 3400) {
                            if (var17 != 3300) {
                                break;
                            }
                            class133.field3258[var6++] = class82.field2066;
                        } else if (var17 >= 4100) {
                            if (var17 >= 4200) {
                                break;
                            }
                            if (var17 == 4100) {
                                var10--;
                                class1 var105 = class119.field2960[var10];
                                var6--;
                                int var106 = class133.field3258[var6];
                                class119.field2960[var10++] = class116.method959(118, new class1[] { var105, class48.method504(var106, -1) });
                            } else if (var17 == 4101) {
                                var10 -= 2;
                                class1 var107 = class119.field2960[var10 + 1];
                                class1 var108 = class119.field2960[var10];
                                class119.field2960[var10++] = class116.method959(53, new class1[] { var108, var107 });
                            } else if (var17 == 4102) {
                                var10--;
                                class1 var109 = class119.field2960[var10];
                                var6--;
                                int var110 = class133.field3258[var6];
                                class119.field2960[var10++] = class116.method959(-115, new class1[] { var109, class132.method1037(true, (byte) -85, var110) });
                            } else if (var17 == 4103) {
                                var10--;
                                class1 var111 = class119.field2960[var10];
                                class119.field2960[var10++] = var111.method30(-128);
                            } else if (var17 == 4104) {
                                var6--;
                                int var112 = class133.field3258[var6];
                                long var113 = ((long) var112 + 11745L) * 86400000L;
                                class14.field454.setTime(new Date(var113));
                                int var115 = class14.field454.get(5);
                                int var116 = class14.field454.get(2);
                                int var117 = class14.field454.get(1);
                                class119.field2960[var10++] = class116.method959(-55, new class1[] { class48.method504(var115, -1), class63.field1575, class19.field622[var116], class63.field1575, class48.method504(var117, -1) });
                            } else if (var17 == 4105) {
                                var10 -= 2;
                                class1 var118 = class119.field2960[var10];
                                class1 var119 = class119.field2960[var10 + 1];
                                if (class104.field2624.field91 != null && class104.field2624.field91.field1661) {
                                    class119.field2960[var10++] = var119;
                                } else {
                                    class119.field2960[var10++] = var118;
                                }
                            } else if (var17 == 4106) {
                                var6--;
                                int var120 = class133.field3258[var6];
                                class119.field2960[var10++] = class48.method504(var120, -1);
                            } else {
                                if (var17 != 4107) {
                                    break;
                                }
                                var10 -= 2;
                                class133.field3258[var6++] = class119.field2960[var10].method35(class119.field2960[var10 + 1], (byte) 109);
                            }
                        } else if (var17 == 4000) {
                            var6 -= 2;
                            int var76 = class133.field3258[var6];
                            int var77 = class133.field3258[var6 + 1];
                            class133.field3258[var6++] = var76 + var77;
                        } else if (var17 == 4001) {
                            var6 -= 2;
                            int var78 = class133.field3258[var6 + 1];
                            int var79 = class133.field3258[var6];
                            class133.field3258[var6++] = var79 - var78;
                        } else if (var17 == 4002) {
                            var6 -= 2;
                            int var80 = class133.field3258[var6 + 1];
                            int var81 = class133.field3258[var6];
                            class133.field3258[var6++] = var80 * var81;
                        } else if (var17 == 4003) {
                            var6 -= 2;
                            int var82 = class133.field3258[var6];
                            int var83 = class133.field3258[var6 + 1];
                            class133.field3258[var6++] = var82 / var83;
                        } else if (var17 == 4004) {
                            var6--;
                            int var84 = class133.field3258[var6];
                            class133.field3258[var6++] = (int) (Math.random() * (double) var84);
                        } else if (var17 == 4005) {
                            var6--;
                            int var85 = class133.field3258[var6];
                            class133.field3258[var6++] = (int) ((double) (var85 + 1) * Math.random());
                        } else if (var17 == 4006) {
                            var6 -= 5;
                            int var86 = class133.field3258[var6 + 1];
                            int var87 = class133.field3258[var6];
                            int var88 = class133.field3258[var6 + 3];
                            int var89 = class133.field3258[var6 + 4];
                            int var90 = class133.field3258[var6 + 2];
                            class133.field3258[var6++] = var87 + (var86 - var87) * (-var90 + var89) / (var88 - var90);
                        } else if (var17 == 4007) {
                            var6 -= 2;
                            int var91 = class133.field3258[var6];
                            int var92 = class133.field3258[var6 + 1];
                            class133.field3258[var6++] = var91 * var92 / 100 + var91;
                        } else if (var17 == 4008) {
                            var6 -= 2;
                            int var93 = class133.field3258[var6];
                            int var94 = class133.field3258[var6 + 1];
                            class133.field3258[var6++] = class76.method708(0x1 << var94, var93);
                        } else if (var17 == 4009) {
                            var6 -= 2;
                            int var95 = class133.field3258[var6];
                            int var96 = class133.field3258[var6 + 1];
                            class133.field3258[var6++] = class132.method1034(var95, -(0x1 << var96) - 1);
                        } else if (var17 == 4010) {
                            var6 -= 2;
                            int var97 = class133.field3258[var6];
                            int var98 = class133.field3258[var6 + 1];
                            class133.field3258[var6++] = class132.method1034(0x1 << var98, var97) == 0 ? 0 : 1;
                        } else if (var17 == 4011) {
                            var6 -= 2;
                            int var99 = class133.field3258[var6 + 1];
                            int var100 = class133.field3258[var6];
                            class133.field3258[var6++] = var100 % var99;
                        } else if (var17 == 4012) {
                            var6 -= 2;
                            int var101 = class133.field3258[var6];
                            int var102 = class133.field3258[var6 + 1];
                            if (var101 == 0) {
                                class133.field3258[var6++] = 0;
                            } else {
                                class133.field3258[var6++] = (int) Math.pow((double) var101, (double) var102);
                            }
                        } else {
                            if (var17 != 4013) {
                                break;
                            }
                            var6 -= 2;
                            int var103 = class133.field3258[var6];
                            int var104 = class133.field3258[var6 + 1];
                            if (var103 == 0) {
                                class133.field3258[var6++] = 0;
                            } else if (var104 == 0) {
                                class133.field3258[var6++] = Integer.MAX_VALUE;
                            } else {
                                class133.field3258[var6++] = (int) Math.pow((double) var103, 1.0D / (double) var104);
                            }
                        }
                    } else if (var17 == 3100) {
                        var10--;
                        class1 var121 = class119.field2960[var10];
                        class89.method761(84, 0, var121, class102.field2588);
                    } else {
                        if (var17 != 3101) {
                            break;
                        }
                        var6 -= 2;
                        class42.method451(class133.field3258[var6], class133.field3258[var6 + 1], class104.field2624, -1);
                    }
                }
            }
        } catch (Exception var136) {
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 1478)
    public static final void method758(int arg0) {
        field2158++;
        class79.field1944 = true;
        class121.method989(19655);
        if (class66.field1651 != -1) {
            boolean var1 = class46.method480(0, class66.field1651, 261, (byte) -5, 0, 1, 190);
            if (!var1) {
                class39.field1056 = true;
            }
        } else if (class97.field2400[class9.field331] != -1) {
            boolean var2 = class46.method480(0, class97.field2400[class9.field331], 261, (byte) -5, 0, 1, 190);
            if (!var2) {
                class39.field1056 = true;
            }
        }
        if (class6.field225 && class19.field641 == 1) {
            if (class74.field1841 == 1) {
                class70.method663(-2);
            } else {
                class46.method485(-1);
            }
        }
        if (arg0 >= -22) {
            field2161 = 80;
        }
        class108.method904(40);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 1535)
    public static void method759(byte arg0) {
        if (arg0 <= 104) {
            field2165 = null;
        }
        field2155 = null;
        field2167 = null;
        field2162 = null;
        field2163 = null;
        field2165 = null;
        field2160 = null;
        field2168 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 1551)
    public static final void method760(boolean arg0) {
        field2159++;
        if (class32.field858 != 0) {
            return;
        }
        class102.field2589[0] = class134.field3305;
        class79.field1935[0] = 1005;
        class42.field1105 = 1;
        if (class42.field1144 != -1) {
            class59.field1500 = -1;
            class34.field904 = -1;
            class24.method322((byte) 89, 0, 765, 503, class42.field1144, 0, class24.field742, class102.field2571, 0);
            class115.field2884 = class34.field904;
            class48.field1281 = class59.field1500;
            return;
        }
        class60.method575(9767);
        class59.field1500 = -1;
        class34.field904 = -1;
        boolean var1 = arg0;
        if (class24.field742 > 4 && class102.field2571 > 4 && class24.field742 < 516 && class102.field2571 < 338) {
            if (class132.field3230 == -1) {
                class129.method1022(arg0);
            } else {
                class24.method322((byte) 89, 4, 516, 338, class132.field3230, 4, class24.field742, class102.field2571, 0);
            }
        }
        class48.field1281 = class59.field1500;
        class115.field2884 = class34.field904;
        class59.field1500 = -1;
        class34.field904 = -1;
        if (class24.field742 > 553 && class102.field2571 > 205 && class24.field742 < 743 && class102.field2571 < 466) {
            if (class66.field1651 != -1) {
                class24.method322((byte) 89, 205, 743, 466, class66.field1651, 553, class24.field742, class102.field2571, 1);
            } else if (class97.field2400[class9.field331] != -1) {
                class24.method322((byte) 89, 205, 743, 466, class97.field2400[class9.field331], 553, class24.field742, class102.field2571, 1);
            }
        }
        if (class5.field215 != class34.field904) {
            class39.field1056 = true;
            class5.field215 = class34.field904;
        }
        class34.field904 = -1;
        if (class59.field1500 != class52.field1390) {
            class52.field1390 = class59.field1500;
            class39.field1056 = true;
        }
        class59.field1500 = -1;
        if (class24.field742 > 17 && class102.field2571 > 357 && class24.field742 < 496 && class102.field2571 < 453) {
            if (field2169 != -1) {
                class24.method322((byte) 89, 357, 496, 453, field2169, 17, class24.field742, class102.field2571, 2);
            } else if (class98.field2424 != -1) {
                class24.method322((byte) 89, 357, 496, 453, class98.field2424, 17, class24.field742, class102.field2571, 3);
            } else if (class102.field2571 < 434 && class24.field742 < 426) {
                class119.method977(class24.field742 - 17, class102.field2571 + -357, 45);
            }
        }
        if ((field2169 != -1 || class98.field2424 != -1) && class34.field904 != class108.field2715) {
            class105.field2640 = true;
            class108.field2715 = class34.field904;
        }
        if ((field2169 != -1 || class98.field2424 != -1) && class59.field1500 != class133.field3256) {
            class105.field2640 = true;
            class133.field3256 = class59.field1500;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class42.field1105 - 1; var2++) {
                if (class79.field1935[var2] < 1000 && class79.field1935[var2 + 1] > 1000) {
                    var1 = false;
                    class1 var3 = class102.field2589[var2];
                    class102.field2589[var2] = class102.field2589[var2 + 1];
                    class102.field2589[var2 + 1] = var3;
                    int var4 = class79.field1935[var2];
                    class79.field1935[var2] = class79.field1935[var2 + 1];
                    class79.field1935[var2 + 1] = var4;
                    int var5 = class37.field995[var2];
                    class37.field995[var2] = class37.field995[var2 + 1];
                    class37.field995[var2 + 1] = var5;
                    int var6 = class117.field2928[var2];
                    class117.field2928[var2] = class117.field2928[var2 + 1];
                    class117.field2928[var2 + 1] = var6;
                    int var7 = class72.field1773[var2];
                    class72.field1773[var2] = class72.field1773[var2 + 1];
                    class72.field1773[var2 + 1] = var7;
                }
            }
        }
    }
}
