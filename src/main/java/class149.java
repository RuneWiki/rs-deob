import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class149 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2063 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "I")
    public static int field2076 = 1;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[Lhm;")
    public static class22[] field2072 = new class22[4];

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field2068 = 0;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public int field2067;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public int field2077;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Llc;")
    public static class175 field2065;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[I")
    public static int[] field2075;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[[[B")
    public static byte[][][] field2078;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 7)
    public static void method999(int arg0) {
        field2075 = null;
        field2072 = null;
        if (arg0 != 28699) {
            field2064 = 106;
        }
        field2063 = null;
        field2065 = null;
        field2078 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILlc;)V", line = 23)
    public static final void method1000(int arg0, class175 arg1) {
        field2080++;
        class277.field4320 = arg1.method1179((byte) -104, "titlebg");
        class322.field4957 = arg1.method1179((byte) 22, "logo");
        if (arg0 != 0) {
            method1000(-74, (class175) null);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 35)
    public static final void method1001(byte arg0) {
        class195.field2802.method1609((byte) -124);
        field2074++;
        if (arg0 >= -99) {
            method1004(-45, 118, false, -87, (byte) 62, 8, 121, false);
        }
        class283.field4440 = null;
        class281.field4357 = 1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lv;)V", line = 57)
    public static final void method1002(class80 arg0) {
        for (int var1 = arg0.field1015; var1 <= arg0.field1035; var1++) {
            for (int var2 = arg0.field1027; var2 <= arg0.field1028; var2++) {
                class225 var3 = class158.field2184[arg0.field1025][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field3214; var4++) {
                        if (var3.field3199[var4] == arg0) {
                            var3.field3214--;
                            for (int var5 = var4; var5 < var3.field3214; var5++) {
                                var3.field3199[var5] = var3.field3199[var5 + 1];
                                var3.field3201[var5] = var3.field3201[var5 + 1];
                            }
                            var3.field3199[var3.field3214] = null;
                            break;
                        }
                    }
                    var3.field3217 = 0;
                    for (int var6 = 0; var6 < var3.field3214; var6++) {
                        var3.field3217 |= var3.field3201[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILg;)V", line = 114)
    public static final void method1003(int arg0, class170 arg1) {
        field2070++;
        if (arg1.field2360 == 0) {
            return;
        }
        class191 var2 = arg1.method1102((byte) -120);
        if (arg1.field2444 != -1 && arg1.field2444 < 32768) {
            class184 var3 = class223.field3159[arg1.field2444];
            if (var3 != null) {
                int var4 = arg1.field2357 - var3.field2357;
                int var5 = arg1.field2392 - var3.field2392;
                if (var5 != 0 || var4 != 0) {
                    arg1.field2387 = (int) (Math.atan2((double) var5, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2444 >= 32768) {
            int var6 = arg1.field2444 - 32768;
            if (class117.field1655 == var6) {
                var6 = 2047;
            }
            class109 var7 = class328.field5009[var6];
            if (var7 != null) {
                int var8 = arg1.field2392 - var7.field2392;
                int var9 = arg1.field2357 - var7.field2357;
                if (var8 != 0 || var9 != 0) {
                    arg1.field2387 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2410 != arg0 || arg1.field2399 != 0) && (arg1.field2411 == 0 || arg1.field2419 > 0)) {
            int var10 = arg1.field2392 - ((arg1.field2410 - class142.field1992 - class142.field1992) * 64);
            int var11 = arg1.field2357 - ((arg1.field2399 - class118.field1668 - class118.field1668) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field2387 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field2399 = 0;
            arg1.field2410 = 0;
        }
        int var12 = arg1.field2387 - arg1.field2368 & 0x7FF;
        if (var12 == 0) {
            arg1.field2433 = 0;
            arg1.field2391 = 0;
        } else if (var2.field2745 == 0) {
            arg1.field2391++;
            if (var12 > 1024) {
                arg1.field2368 -= arg1.field2360;
                boolean var13 = true;
                if (arg1.field2360 > var12 || 2048 - arg1.field2360 < var12) {
                    var13 = false;
                    arg1.field2368 = arg1.field2387;
                }
                if (arg1.field2391 > 25 || var13) {
                    arg1.field2376 = var2.field2758;
                    if (arg1.field2411 <= 0) {
                        if (var2.field2724 != -1) {
                            arg1.field2376 = var2.field2724;
                        }
                    } else if (arg1.field2406[arg1.field2411 - 1] == 2) {
                        if (var2.field2725 != -1) {
                            arg1.field2376 = var2.field2725;
                        } else if (var2.field2728 != -1) {
                            arg1.field2376 = var2.field2728;
                        }
                    } else if (arg1.field2406[arg1.field2411 - 1] == 0) {
                        if (var2.field2719 != -1) {
                            arg1.field2376 = var2.field2719;
                        } else if (var2.field2739 != -1) {
                            arg1.field2376 = var2.field2739;
                        }
                    } else if (var2.field2735 != -1) {
                        arg1.field2376 = var2.field2735;
                    }
                }
            } else {
                arg1.field2368 += arg1.field2360;
                boolean var14 = true;
                if (var12 < arg1.field2360 || var12 > (2048 - arg1.field2360)) {
                    var14 = false;
                    arg1.field2368 = arg1.field2387;
                }
                if (arg1.field2391 > 25 || var14) {
                    arg1.field2376 = var2.field2758;
                    if (arg1.field2411 <= 0) {
                        if (var2.field2740 != -1) {
                            arg1.field2376 = var2.field2740;
                        }
                    } else if (arg1.field2406[arg1.field2411 - 1] == 2) {
                        if (var2.field2744 != -1) {
                            arg1.field2376 = var2.field2744;
                        } else if (var2.field2728 != -1) {
                            arg1.field2376 = var2.field2728;
                        }
                    } else if (arg1.field2406[arg1.field2411 - 1] == 0) {
                        if (var2.field2741 != -1) {
                            arg1.field2376 = var2.field2741;
                        } else if (var2.field2739 != -1) {
                            arg1.field2376 = var2.field2739;
                        }
                    } else if (var2.field2726 != -1) {
                        arg1.field2376 = var2.field2726;
                    }
                }
            }
            arg1.field2368 &= 0x7FF;
        } else {
            arg1.field2376 = -1;
            int var15 = arg1.field2387 << 5;
            if (arg1.field2371 != var15) {
                int var16 = arg1.field2433 * arg1.field2433 / (var2.field2745 * 2);
                int var17 = var15 - arg1.field2402 & 0xFFFF;
                arg1.field2420 = 0;
                if (arg1.field2433 > 0 && var16 <= var17 && (var17 - var16) < 32768) {
                    arg1.field2395 = var17 / 2;
                    arg1.field2354 = true;
                    int var18 = var2.field2734 * var2.field2734 / (var2.field2745 * 2);
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (var18 < arg1.field2395) {
                        arg1.field2395 = var17 - var18;
                    }
                } else if (arg1.field2433 < 0 && var16 <= 65536 - var17 && 65536 - var16 - var17 < 32768) {
                    arg1.field2395 = (65536 - var17) / 2;
                    int var19 = var2.field2734 * var2.field2734 / (var2.field2745 * 2);
                    arg1.field2354 = true;
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg1.field2395) {
                        arg1.field2395 = 65536 - var17 - var19;
                    }
                } else {
                    arg1.field2354 = false;
                }
                arg1.field2371 = var15;
            }
            if (arg1.field2433 == 0) {
                int var20 = arg1.field2371 - arg1.field2402 & 0xFFFF;
                if (var2.field2745 > var20) {
                    arg1.field2402 = arg1.field2371;
                } else {
                    arg1.field2354 = true;
                    int var21 = var2.field2734 * var2.field2734 / (var2.field2745 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    arg1.field2420 = 0;
                    if (var20 >= 32768) {
                        arg1.field2395 = (65536 - var20) / 2;
                        if (var21 < arg1.field2395) {
                            arg1.field2395 = 65536 - var20 - var21;
                        }
                        arg1.field2433 = -var2.field2745;
                    } else {
                        arg1.field2395 = var20 / 2;
                        arg1.field2433 = var2.field2745;
                        if (arg1.field2395 > var21) {
                            arg1.field2395 = var20 - var21;
                        }
                    }
                }
            } else if (arg1.field2433 > 0) {
                if (arg1.field2420 >= arg1.field2395) {
                    arg1.field2354 = false;
                }
                if (!arg1.field2354) {
                    arg1.field2433 -= var2.field2745;
                    if (arg1.field2433 < 0) {
                        arg1.field2433 = 0;
                    }
                } else if (arg1.field2433 < var2.field2734) {
                    arg1.field2433 += var2.field2745;
                }
            } else {
                if (arg1.field2420 >= arg1.field2395) {
                    arg1.field2354 = false;
                }
                if (!arg1.field2354) {
                    arg1.field2433 += var2.field2745;
                    if (arg1.field2433 > 0) {
                        arg1.field2433 = 0;
                    }
                } else if (-var2.field2734 < arg1.field2433) {
                    arg1.field2433 -= var2.field2745;
                }
            }
            arg1.field2402 += arg1.field2433;
            if (arg1.field2433 <= 0) {
                arg1.field2420 -= arg1.field2433;
            } else {
                arg1.field2420 += arg1.field2433;
            }
            arg1.field2402 &= 0xFFFF;
            arg1.field2368 = arg1.field2402 >> 5;
            if (arg1.field2433 >= 0) {
                if (arg1.field2411 > 0) {
                    if (arg1.field2406[arg1.field2411 - 1] == 2) {
                        if (var2.field2744 != -1) {
                            arg1.field2376 = var2.field2744;
                        } else if (var2.field2728 != -1) {
                            arg1.field2376 = var2.field2728;
                        }
                    } else if (arg1.field2406[arg1.field2411 - 1] == 0) {
                        if (var2.field2741 != -1) {
                            arg1.field2376 = var2.field2741;
                        } else if (var2.field2739 != -1) {
                            arg1.field2376 = var2.field2739;
                        }
                    }
                }
                if (arg1.field2376 == -1) {
                    if (var2.field2726 != -1) {
                        arg1.field2376 = var2.field2726;
                    } else if (var2.field2740 != -1) {
                        arg1.field2376 = var2.field2740;
                    }
                }
            } else {
                if (arg1.field2411 > 0) {
                    if (arg1.field2406[arg1.field2411 - 1] == 2) {
                        if (var2.field2725 != -1) {
                            arg1.field2376 = var2.field2725;
                        } else if (var2.field2728 != -1) {
                            arg1.field2376 = var2.field2728;
                        }
                    } else if (arg1.field2406[arg1.field2411 - 1] == 0) {
                        if (var2.field2719 != -1) {
                            arg1.field2376 = var2.field2719;
                        } else if (var2.field2739 != -1) {
                            arg1.field2376 = var2.field2739;
                        }
                    }
                }
                if (arg1.field2376 == -1) {
                    if (var2.field2735 != -1) {
                        arg1.field2376 = var2.field2735;
                    } else if (var2.field2724 != -1) {
                        arg1.field2376 = var2.field2724;
                    }
                }
            }
            if (arg1.field2376 == -1) {
                arg1.field2376 = var2.field2758;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIZIBIIZ)V", line = 550)
    public static final void method1004(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5, int arg6, boolean arg7) {
        field2079++;
        if (!arg2 && class146.field2033 == arg3 && class328.field4999 == arg5 && class244.field3669 == arg0 || class339.method2348((byte) 69)) {
            return;
        }
        class328.field4999 = arg5;
        class244.field3669 = arg0;
        class146.field2033 = arg3;
        if (class339.method2348((byte) 69)) {
            class244.field3669 = 0;
        }
        if (arg7) {
            class97.method587(-15525, 28);
        } else {
            class97.method587(-15525, 25);
        }
        class23.method154((byte) -32, class163.field2251, true);
        int var8 = class142.field1992;
        int var9 = class118.field1668;
        class118.field1668 = arg5 * 8 - 48;
        class142.field1992 = arg3 * 8 - 48;
        class161.field2213 = class267.method1937(class328.field4999 * 8, class146.field2033 * 8, -105);
        int var10 = class118.field1668 - var9;
        class27.field352 = null;
        int var11 = class118.field1668;
        int var12 = class142.field1992 - var8;
        int var13 = class142.field1992;
        if (arg7) {
            class127.field1735 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class184 var15 = class223.field3159[var14];
                if (var15 != null) {
                    var15.field2357 -= var10 * 128;
                    var15.field2392 -= var12 * 128;
                    if (var15.field2392 >= 0 && var15.field2392 <= 13184 && var15.field2357 >= 0 && var15.field2357 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field2359[var16] -= var12;
                            var15.field2403[var16] -= var10;
                        }
                        class269.field4238[class127.field1735++] = var14;
                    } else {
                        class223.field3159[var14].method1281((class282) null, -24886);
                        class223.field3159[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class184 var18 = class223.field3159[var17];
                if (var18 != null) {
                    for (int var19 = 0; var19 < 10; var19++) {
                        var18.field2359[var19] -= var12;
                        var18.field2403[var19] -= var10;
                    }
                    var18.field2392 -= var12 * 128;
                    var18.field2357 -= var10 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class109 var21 = class328.field5009[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field2359[var22] -= var12;
                    var21.field2403[var22] -= var10;
                }
                var21.field2357 -= var10 * 128;
                var21.field2392 -= var12 * 128;
            }
        }
        class138.field1940 = arg0;
        byte var23 = 0;
        byte var24 = 104;
        byte var25 = 1;
        if (var12 < 0) {
            var25 = -1;
            var23 = 103;
            var24 = -1;
        }
        byte var26 = 0;
        byte var27 = 104;
        byte var28 = 1;
        if (var10 < 0) {
            var28 = -1;
            var27 = -1;
            var26 = 103;
        }
        class118.field1664.method749(0, arg1, arg6, false);
        for (int var29 = var23; var29 != var24; var29 += var25) {
            for (int var30 = var26; var30 != var27; var30 += var28) {
                int var31 = var12 + var29;
                int var32 = var10 + var30;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class269.field4239[var33][var29][var30] = class269.field4239[var33][var31][var32];
                    } else {
                        class269.field4239[var33][var29][var30] = null;
                    }
                }
            }
        }
        if (arg4 <= 122) {
            return;
        }
        for (class7 var34 = (class7) class74.field955.method2331((byte) 15); var34 != null; var34 = (class7) class74.field955.method2332(-42)) {
            var34.field86 -= var12;
            var34.field88 -= var10;
            if (var34.field86 < 0 || var34.field88 < 0 || var34.field86 >= 104 || var34.field88 >= 104) {
                var34.method2285(true);
            }
        }
        if (arg7) {
            class345.field5356 -= var10;
            class130.field1792 -= var12 * 128;
            class329.field5021 -= var10;
            class109.field1506 -= var10 * 128;
            class296.field4621 -= var12;
            class332.field5072 -= var12;
        } else {
            class118.field1671 = 1;
        }
        class1.field6 = 0;
        if (class110.field1538 != 0) {
            class185.field2669 -= var10;
            class110.field1538 -= var12;
        }
        if (class250.field3787 && arg7 && (Math.abs(var12) > 104 || Math.abs(var10) > 104)) {
            class134.method889((byte) 52);
        }
        class22.field305 = -1;
        class104.field1345.method2333(3393);
        class31.field385.method2333(3393);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)V", line = 808)
    public static final void method1005(byte arg0, int arg1) {
        field2073++;
        class62.field770.method1236(-495037017, arg1);
        if (arg0 != -47) {
            method1005((byte) -76, -74);
        }
    }
}
