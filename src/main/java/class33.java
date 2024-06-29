import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class33 extends class313 {

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
    private int field465 = 409;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "[I")
    private int[] field477 = new int[3];

    @OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
    private int field466 = 4096;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    private int field475 = 4096;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "I")
    private int field480 = 4096;

    @OriginalMember(owner = "client!jb", name = "N", descriptor = "I")
    public static int field467 = 0;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field481 = null;

    @OriginalMember(owner = "client!jb", name = "O", descriptor = "[I")
    public static int[] field468 = new int[32768];

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!jb", name = "P", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!jb", name = "Q", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!jb", name = "R", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!jb", name = "S", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!jb", name = "T", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!jb", name = "U", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IILpi;)V", line = 10)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg1 != -17848) {
            method301(32);
        }
        if (arg0 == 0) {
            this.field465 = arg2.method2339((byte) -46);
        } else if (arg0 == 1) {
            this.field466 = arg2.method2339((byte) -46);
        } else if (arg0 == 2) {
            this.field475 = arg2.method2339((byte) -46);
        } else if (arg0 == 3) {
            this.field480 = arg2.method2339((byte) -46);
        } else if (arg0 == 4) {
            int var5 = arg2.method2317(21803);
            this.field477[0] = class36.method319(16711680, var5) << 4;
            this.field477[1] = class36.method319(4080, var5 >> 4);
            this.field477[2] = class36.method319(var5, 255) >> 12;
        }
        field478++;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZ[Llg;IIIIII)V", line = 77)
    public static final void method298(int arg0, int arg1, boolean arg2, class137[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class43.field680) {
            class169.method1330(arg9, arg6, arg0, arg8);
        } else {
            class47.method420(arg9, arg6, arg0, arg8);
            class62.method575();
        }
        field479++;
        if (!arg2) {
            return;
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class137 var11 = arg3[var10];
            if (var11 != null && (var11.field2465 == arg4 || arg4 == -1412584499 && class204.field3473 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class328.field5227[class215.field3602] = var11.field2456 + arg1;
                    class213.field3579[class215.field3602] = var11.field2444 + arg5;
                    class15.field231[class215.field3602] = var11.field2533;
                    class15.field225[class215.field3602] = var11.field2515;
                    var12 = class215.field3602++;
                } else {
                    var12 = arg7;
                }
                var11.field2494 = class181.field3045;
                var11.field2391 = var12;
                if (!var11.field2402 || !client.method1893(var11)) {
                    if (var11.field2386 > 0) {
                        class67.method644(var11, -2561);
                    }
                    int var13 = var11.field2456 + arg1;
                    int var14 = var11.field2444 + arg5;
                    int var15 = var11.field2478;
                    if (class348.field5537 && (client.method1894(var11).field891 != 0 || var11.field2490 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class204.field3473 == var11) {
                        if (arg4 != -1412584499 && !var11.field2416) {
                            class276.field4399 = arg1;
                            class28.field387 = arg5;
                            class248.field4032 = arg3;
                            continue;
                        }
                        if (class170.field2956 && class332.field5288) {
                            int var16 = class258.field4182;
                            int var17 = class284.field4508;
                            int var18 = var16 - class242.field3958;
                            int var19 = var17 - class291.field4653;
                            if (var19 < class317.field5030) {
                                var19 = class317.field5030;
                            }
                            if ((var11.field2533 + var19) > (class317.field5030 + class272.field4343.field2533)) {
                                var19 = class317.field5030 + class272.field4343.field2533 - var11.field2533;
                            }
                            if (class228.field3831 > var18) {
                                var18 = class228.field3831;
                            }
                            var13 = var19;
                            if (class228.field3831 + class272.field4343.field2515 < var18 - -var11.field2515) {
                                var18 = class228.field3831 + class272.field4343.field2515 - var11.field2515;
                            }
                            var14 = var18;
                        }
                        if (!var11.field2416) {
                            var15 = 128;
                        }
                    }
                    int var21;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field2490 == 2) {
                        var21 = arg9;
                        var22 = arg6;
                        var25 = arg8;
                        var24 = arg0;
                    } else {
                        int var20 = var14 + var11.field2515;
                        var21 = var13 > arg9 ? var13 : arg9;
                        var22 = var14 > arg6 ? var14 : arg6;
                        int var23 = var11.field2533 + var13;
                        if (var11.field2490 == 9) {
                            var23++;
                            var20++;
                        }
                        var24 = arg0 <= var23 ? arg0 : var23;
                        var25 = var20 >= arg8 ? arg8 : var20;
                    }
                    if (!var11.field2402 || var21 < var24 && var25 > var22) {
                        if (var11.field2386 != 0) {
                            if (var11.field2386 == 1337 || var11.field2386 == 1403) {
                                class280.field4435 = var13;
                                class285.field4524 = var11;
                                class104.field1748 = var14;
                                class130.method1076(var14, var11.field2515, (byte) 87, var13, var11.field2533, var11.field2386 == 1403);
                                class272.field4337[var12] = true;
                                if (class43.field680) {
                                    class169.method1330(arg9, arg6, arg0, arg8);
                                } else {
                                    class47.method420(arg9, arg6, arg0, arg8);
                                }
                                continue;
                            }
                            if (var11.field2386 == 1338) {
                                if (!var11.method1122(!arg2)) {
                                    continue;
                                }
                                method306(var14, var13, var12, true, var11);
                                if (class43.field680) {
                                    class169.method1330(arg9, arg6, arg0, arg8);
                                } else {
                                    class47.method420(arg9, arg6, arg0, arg8);
                                }
                                if (class316.field5008 != 0 && class316.field5008 != 3 || class207.field3515 || class172.field2980 < var21 || class67.field1087 < var22 || var24 <= class172.field2980 || var25 <= class67.field1087) {
                                    continue;
                                }
                                int var26 = class172.field2980 - var13;
                                int var27 = class67.field1087 - var14;
                                int var28 = var11.field2469[var27];
                                if (var26 < var28 || var11.field2510[var27] + var28 < var26) {
                                    continue;
                                }
                                int var29 = var26 - var11.field2533 / 2;
                                int var30 = var27 - var11.field2515 / 2;
                                int var31 = (int) class83.field1331 + class243.field3962 & 0x7FF;
                                int var32 = class62.field962[var31];
                                int var33 = (class4.field59 + 256) * var32 >> 8;
                                int var34 = class62.field961[var31];
                                int var35 = (class4.field59 + 256) * var34 >> 8;
                                int var36 = var30 * var35 - (var29 * var33) >> 11;
                                int var37 = var30 * var33 + (var29 * var35) >> 11;
                                int var38 = class218.field3632.field2036 + var37 - ((class218.field3632.method987(3047) - 1) * 64) >> 7;
                                int var39 = class218.field3632.field1985 + 64 - var36 - (class218.field3632.method987(3047) * 64) >> 7;
                                if (class179.field3027 && (class161.field2861 & 0x40) != 0) {
                                    class137 var40 = class60.method557(class230.field3839, 115, class17.field281);
                                    if (var40 == null) {
                                        class20.method200(-94);
                                    } else {
                                        class86.method770((short) 26, " ->", class50.field784, 64, class292.field4681, 1L, var39, var38);
                                    }
                                    continue;
                                }
                                if (class72.field1199 == 1) {
                                    class86.method770((short) 28, "", class104.field1736, 84, -1, 1L, var39, var38);
                                }
                                class86.method770((short) 15, "", class79.field1276, 70, -1, 1L, var39, var38);
                                continue;
                            }
                            if (var11.field2386 == 1339) {
                                if (var11.method1122(false)) {
                                    class226.method1644(var14, var12, var13, var11, true);
                                    if (class43.field680) {
                                        class169.method1330(arg9, arg6, arg0, arg8);
                                    } else {
                                        class47.method420(arg9, arg6, arg0, arg8);
                                    }
                                }
                                continue;
                            }
                            if (var11.field2386 == 1400) {
                                class191.method1449(var11.field2515, var11.field2533, var13, var14, (byte) -26);
                                class272.field4337[var12] = true;
                                class224.field3746[var12] = true;
                                if (class43.field680) {
                                    class169.method1330(arg9, arg6, arg0, arg8);
                                } else {
                                    class47.method420(arg9, arg6, arg0, arg8);
                                }
                                continue;
                            }
                            if (var11.field2386 == 1401) {
                                class154.method1232(var14, var11.field2515, var11.field2533, (byte) -2, var13);
                                class272.field4337[var12] = true;
                                class224.field3746[var12] = true;
                                if (class43.field680) {
                                    class169.method1330(arg9, arg6, arg0, arg8);
                                } else {
                                    class47.method420(arg9, arg6, arg0, arg8);
                                }
                                continue;
                            }
                            if (var11.field2386 == 1402) {
                                if (!class43.field680) {
                                    class126.method1048(var13, 0, var14);
                                    class272.field4337[var12] = true;
                                    class224.field3746[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field2386 == 1405) {
                                if (!class339.field5419) {
                                    continue;
                                }
                                int var127 = var13 + var11.field2533;
                                int var128 = var14 + 15;
                                class241.field3926.method2239("Fps:" + class104.field1747, var127, var128, 16776960, -1);
                                int var142 = var128 + 15;
                                int var129 = 16776960;
                                Runtime var130 = Runtime.getRuntime();
                                int var131 = (int) ((var130.totalMemory() - var130.freeMemory()) / 1024L);
                                if (var131 > 65536) {
                                    var129 = 16711680;
                                }
                                class241.field3926.method2239("Mem:" + var131 + "k", var127, var142, var129, -1);
                                var128 = var142 + 15;
                                if (class43.field680) {
                                    int var132 = 16776960;
                                    int var133 = (class151.field2671 + class151.field2667 + class151.field2670) / 1024;
                                    if (var133 > 65536) {
                                        var132 = 16711680;
                                    }
                                    class241.field3926.method2239("Card:" + var133 + "k", var127, var128, var132, -1);
                                    var128 += 15;
                                }
                                int var134 = 16776960;
                                int var135 = 0;
                                int var136 = 0;
                                int var137 = 0;
                                for (int var138 = 0; var138 < 29; var138++) {
                                    var135 += class134.field2291[var138].method2200(0);
                                    var136 += class134.field2291[var138].method2207(-62);
                                    var137 += class134.field2291[var138].method2209((byte) 0);
                                }
                                int var139 = var137 * 100 / var135;
                                int var140 = var136 * 10000 / var135;
                                String var141 = "Cache:" + class264.method1820((byte) 32, 2, 0, (long) var140, true) + "% (" + var139 + "%)";
                                class99.field1605.method2239(var141, var127, var128, var134, -1);
                                var128 += 12;
                                if (class65.field1023 > 0) {
                                    class99.field1605.method2239("Particles: " + class65.field1017 + " / " + class65.field1023, var127, var128, var134, -1);
                                }
                                var128 += 12;
                                class272.field4337[var12] = true;
                                class224.field3746[var12] = true;
                                continue;
                            }
                            if (var11.field2386 == 1406) {
                                class211.field3566 = var14;
                                class143.field2610 = var13;
                                class51.field800 = var11;
                                continue;
                            }
                        }
                        if (!class207.field3515) {
                            if (var11.field2490 == 0 && var11.field2470 && class172.field2980 >= var21 && class67.field1087 >= var22 && class172.field2980 < var24 && class67.field1087 < var25 && !class348.field5537) {
                                class221.field3691[0] = class321.field5075;
                                class276.field4401[0] = 1004;
                                class166.field2909[0] = class331.field5282;
                                class293.field4708 = 1;
                                class241.field3944[0] = "";
                            }
                            if (var21 <= class172.field2980 && var22 <= class67.field1087 && var24 > class172.field2980 && class67.field1087 < var25) {
                                class155.method1242(var11, 48, class172.field2980 - var13, -var14 + class67.field1087);
                            }
                        }
                        if (var11.field2490 == 0) {
                            if (!var11.field2402 && client.method1893(var11) && class144.field2627 != var11) {
                                continue;
                            }
                            if (!var11.field2402) {
                                if (var11.field2497 - var11.field2515 < var11.field2531) {
                                    var11.field2531 = var11.field2497 - var11.field2515;
                                }
                                if (var11.field2531 < 0) {
                                    var11.field2531 = 0;
                                }
                            }
                            if (class43.field680 && var11.field2386 == 1407) {
                                class16.method161(var13, var14, var11.field2533, var11.field2515);
                            }
                            method298(var24, var13 - var11.field2477, true, arg3, var11.field2462, var14 - var11.field2531, var22, var12, var25, var21);
                            if (var11.field2453 != null) {
                                method298(var24, var13 - var11.field2477, arg2, var11.field2453, var11.field2462, var14 - var11.field2531, var22, var12, var25, var21);
                            }
                            class228 var41 = (class228) class172.field2972.method732((long) var11.field2462, arg2);
                            if (var41 != null) {
                                if (var41.field3824 == 0 && !class207.field3515 && class172.field2980 >= var21 && var22 <= class67.field1087 && var24 > class172.field2980 && class67.field1087 < var25 && !class348.field5537) {
                                    class166.field2909[0] = class331.field5282;
                                    class221.field3691[0] = class321.field5075;
                                    class293.field4708 = 1;
                                    class276.field4401[0] = 1004;
                                    class241.field3944[0] = "";
                                }
                                class113.method964((byte) 125, var22, var24, var12, var14, var21, var13, var25, var41.field3833);
                            }
                            if (class43.field680 && var11.field2386 == 1407) {
                                class16.method167();
                            }
                            if (class43.field680) {
                                class169.method1330(arg9, arg6, arg0, arg8);
                            } else {
                                class47.method420(arg9, arg6, arg0, arg8);
                                class62.method575();
                            }
                        }
                        if (class127.field2211[var12] || class324.field5157 > 1) {
                            if (var11.field2490 == 0 && !var11.field2402 && var11.field2497 > var11.field2515) {
                                class57.method515(var11.field2515, var14, var11.field2533 + var13, (byte) 115, var11.field2531, var11.field2497);
                            }
                            if (var11.field2490 != 1) {
                                if (var11.field2490 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var11.field2443; var43++) {
                                        for (int var44 = 0; var44 < var11.field2435; var44++) {
                                            int var45 = (var11.field2365 + 32) * var44 + var13;
                                            int var46 = (var11.field2544 + 32) * var43 + var14;
                                            if (var42 < 20) {
                                                var46 += var11.field2529[var42];
                                                var45 += var11.field2547[var42];
                                            }
                                            if (var11.field2379[var42] > 0) {
                                                boolean var47 = false;
                                                boolean var48 = false;
                                                int var49 = var11.field2379[var42] - 1;
                                                if (arg9 < var45 + 32 && var45 < arg0 && arg6 < var46 + 32 && arg8 > var46 || class329.field5242 == var11 && class74.field1211 == var42) {
                                                    class171 var50;
                                                    if (class93.field1458 == 1 && class30.field432 == var42 && class162.field2870 == var11.field2462) {
                                                        var50 = class262.method1814(var11.field2519, 2, var49, -7550, (class293) null, 0, var11.field2461[var42]);
                                                    } else {
                                                        var50 = class262.method1814(var11.field2519, 1, var49, -7550, (class293) null, 3153952, var11.field2461[var42]);
                                                    }
                                                    if (class62.field949) {
                                                        class272.field4337[var12] = true;
                                                    }
                                                    if (var50 == null) {
                                                        class258.method1793(var11, 0);
                                                    } else if (class329.field5242 == var11 && class74.field1211 == var42) {
                                                        int var51 = class258.field4182 - class225.field3785;
                                                        if (var51 < 5 && var51 > -5) {
                                                            var51 = 0;
                                                        }
                                                        int var52 = class284.field4508 - class261.field4217;
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        if (class265.field4277 < 5) {
                                                            var52 = 0;
                                                            var51 = 0;
                                                        }
                                                        var50.method1259(var45 + var52, var46 + var51, 128);
                                                        if (arg4 != -1) {
                                                            class137 var53 = arg3[arg4 & 0xFFFF];
                                                            int var54;
                                                            int var55;
                                                            if (class43.field680) {
                                                                var55 = class169.field2938;
                                                                var54 = class169.field2940;
                                                            } else {
                                                                var54 = class47.field723;
                                                                var55 = class47.field727;
                                                            }
                                                            if ((var46 + var51) < var54 && var53.field2531 > 0) {
                                                                int var56 = (var54 - var51 - var46) * class31.field446 / 3;
                                                                if (var56 > (class31.field446 * 10)) {
                                                                    var56 = class31.field446 * 10;
                                                                }
                                                                if (var53.field2531 < var56) {
                                                                    var56 = var53.field2531;
                                                                }
                                                                var53.field2531 -= var56;
                                                                class225.field3785 += var56;
                                                                class258.method1793(var53, 0);
                                                            }
                                                            if ((var51 + var46 + 32) > var55 && (var53.field2497 - var53.field2515) > var53.field2531) {
                                                                int var57 = (var46 + var51 + 32 - var55) * class31.field446 / 3;
                                                                if (class31.field446 * 10 < var57) {
                                                                    var57 = class31.field446 * 10;
                                                                }
                                                                if (var57 > (var53.field2497 - var53.field2515 - var53.field2531)) {
                                                                    var57 = var53.field2497 - var53.field2515 - var53.field2531;
                                                                }
                                                                var53.field2531 += var57;
                                                                class225.field3785 -= var57;
                                                                class258.method1793(var53, 0);
                                                            }
                                                        }
                                                    } else if (class119.field2070 == var11 && class344.field5473 == var42) {
                                                        var50.method1259(var45, var46, 128);
                                                    } else {
                                                        var50.method1248(var45, var46);
                                                    }
                                                }
                                            } else if (var11.field2550 != null && var42 < 20) {
                                                class171 var58 = var11.method1125(var42, (byte) 28);
                                                if (var58 != null) {
                                                    var58.method1248(var45, var46);
                                                } else if (class197.field3370) {
                                                    class258.method1793(var11, 0);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var11.field2490 == 3) {
                                    int var126;
                                    if (class27.method249(var11, -4)) {
                                        var126 = var11.field2466;
                                        if (class144.field2627 == var11 && var11.field2455 != 0) {
                                            var126 = var11.field2455;
                                        }
                                    } else {
                                        var126 = var11.field2505;
                                        if (class144.field2627 == var11 && var11.field2447 != 0) {
                                            var126 = var11.field2447;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field2439) {
                                            if (class43.field680) {
                                                class169.method1337(var13, var14, var11.field2533, var11.field2515, var126);
                                            } else {
                                                class47.method422(var13, var14, var11.field2533, var11.field2515, var126);
                                            }
                                        } else if (class43.field680) {
                                            class169.method1325(var13, var14, var11.field2533, var11.field2515, var126);
                                        } else {
                                            class47.method416(var13, var14, var11.field2533, var11.field2515, var126);
                                        }
                                    } else if (var11.field2439) {
                                        if (class43.field680) {
                                            class169.method1329(var13, var14, var11.field2533, var11.field2515, var126, 256 - (var15 & 0xFF));
                                        } else {
                                            class47.method417(var13, var14, var11.field2533, var11.field2515, var126, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class43.field680) {
                                        class169.method1334(var13, var14, var11.field2533, var11.field2515, var126, 256 - (var15 & 0xFF));
                                    } else {
                                        class47.method402(var13, var14, var11.field2533, var11.field2515, var126, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field2490 == 4) {
                                    class323 var122 = var11.method1123((byte) 23, class12.field187);
                                    if (var122 != null) {
                                        String var123 = var11.field2493;
                                        int var124;
                                        if (class27.method249(var11, -4)) {
                                            var124 = var11.field2466;
                                            if (class144.field2627 == var11 && var11.field2455 != 0) {
                                                var124 = var11.field2455;
                                            }
                                            if (var11.field2417.length() > 0) {
                                                var123 = var11.field2417;
                                            }
                                        } else {
                                            var124 = var11.field2505;
                                            if (class144.field2627 == var11 && var11.field2447 != 0) {
                                                var124 = var11.field2447;
                                            }
                                        }
                                        if (var11.field2402 && var11.field2463 != -1) {
                                            class134 var125 = class5.method31(-1731690365, var11.field2463);
                                            var123 = var125.field2346;
                                            if (var123 == null) {
                                                var123 = "null";
                                            }
                                            if ((var125.field2338 == 1 || var11.field2535 != 1) && var11.field2535 != -1) {
                                                var123 = "<col=ff9040>" + var123 + "</col> x" + class338.method2386(var11.field2535, (byte) 16);
                                            }
                                        }
                                        if (class107.field1783 == var11) {
                                            var123 = class207.field3519;
                                            var124 = var11.field2505;
                                        }
                                        if (!var11.field2402) {
                                            var123 = class60.method554(var11, var123, (byte) -108);
                                        }
                                        var122.method2232(var123, var13, var14, var11.field2533, var11.field2515, var124, var11.field2406 ? 0 : -1, var11.field2450, var11.field2431, var11.field2489);
                                    } else if (class197.field3370) {
                                        class258.method1793(var11, 0);
                                    }
                                } else if (var11.field2490 == 5) {
                                    if (!var11.field2402) {
                                        class171 var105 = var11.method1120(false, class27.method249(var11, -4));
                                        if (var105 != null) {
                                            var105.method1248(var13, var14);
                                        } else if (class197.field3370) {
                                            class258.method1793(var11, 0);
                                        }
                                    } else if (var11.field2412 >= 0) {
                                        class167 var106 = var11.method1129(-6334);
                                        if (class43.field680) {
                                            var106.method1315(0, var13, var14, var11.field2533, var11.field2515, var11.field2541, var11.field2491, 0);
                                        } else {
                                            var106.method1316(0, var13, var14, var11.field2533, var11.field2515, var11.field2541, var11.field2491, 0);
                                        }
                                    } else {
                                        class171 var107;
                                        if (var11.field2463 == -1) {
                                            var107 = var11.method1120(!arg2, false);
                                        } else if (var11.field2540 && class218.field3632.field3477 != null) {
                                            var107 = class262.method1814(var11.field2519, var11.field2448, var11.field2463, -7550, class218.field3632.field3477, var11.field2503, var11.field2535);
                                        } else {
                                            var107 = class262.method1814(var11.field2519, var11.field2448, var11.field2463, -7550, (class293) null, var11.field2503, var11.field2535);
                                        }
                                        if (var107 != null) {
                                            int var108 = var107.field2957;
                                            int var109 = var107.field2969;
                                            if (var11.field2536) {
                                                int var111 = (var11.field2533 + var108 - 1) / var108;
                                                int var112 = (var11.field2515 + var109 - 1) / var109;
                                                if (class43.field680) {
                                                    class169.method1331(var13, var14, var13 + var11.field2533, var14 - -var11.field2515);
                                                    boolean var113 = class147.method1172((byte) -128, var107.field2967);
                                                    boolean var114 = class147.method1172((byte) -128, var107.field2965);
                                                    class157 var115 = (class157) var107;
                                                    if (var113 && var114) {
                                                        if (var15 == 0) {
                                                            var115.method1247(var13, var14, var111, var112);
                                                        } else {
                                                            var115.method1256(var13, var14, 256 - (var15 & 0xFF), var111, var112);
                                                        }
                                                    } else if (var113) {
                                                        for (int var116 = 0; var116 < var112; var116++) {
                                                            if (var15 == 0) {
                                                                var115.method1247(var13, var14 + (var109 * var116), var111, 1);
                                                            } else {
                                                                var115.method1256(var13, var109 * var116 + var14, 256 - (var15 & 0xFF), var111, 1);
                                                            }
                                                        }
                                                    } else if (var114) {
                                                        for (int var119 = 0; var119 < var111; var119++) {
                                                            if (var15 == 0) {
                                                                var115.method1247(var108 * var119 + var13, var14, 1, var112);
                                                            } else {
                                                                var115.method1256(var108 * var119 + var13, var14, 256 - (var15 & 0xFF), 1, var112);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var117 = 0; var117 < var111; var117++) {
                                                            for (int var118 = 0; var118 < var112; var118++) {
                                                                if (var15 == 0) {
                                                                    var107.method1248(var108 * var117 + var13, var109 * var118 + var14);
                                                                } else {
                                                                    var107.method1259(var13 + (var108 * var117), var14 - -(var109 * var118), 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class169.method1330(arg9, arg6, arg0, arg8);
                                                } else {
                                                    class47.method414(var13, var14, var11.field2533 + var13, var14 - -var11.field2515);
                                                    for (int var120 = 0; var120 < var111; var120++) {
                                                        for (int var121 = 0; var121 < var112; var121++) {
                                                            if (var11.field2517 != 0) {
                                                                var107.method1349(var109 * var121 + (var109 / 2) + var14, 4096, var108 / 2 + var108 * var120 + var13, (byte) 84, var11.field2517);
                                                            } else if (var15 == 0) {
                                                                var107.method1248(var13 + (var108 * var120), var109 * var121 + var14);
                                                            } else {
                                                                var107.method1259(var108 * var120 + var13, var109 * var121 + var14, 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class47.method420(arg9, arg6, arg0, arg8);
                                                }
                                            } else {
                                                int var110 = var11.field2533 * 4096 / var108;
                                                if (var11.field2517 != 0) {
                                                    var107.method1349(var14 + (var11.field2515 / 2), var110, var11.field2533 / 2 + var13, (byte) 94, var11.field2517);
                                                } else if (var15 != 0) {
                                                    var107.method1260(var13, var14, var11.field2533, var11.field2515, 256 - (var15 & 0xFF));
                                                } else if (var11.field2533 == var108 && var11.field2515 == var109) {
                                                    var107.method1248(var13, var14);
                                                } else {
                                                    var107.method1251(var13, var14, var11.field2533, var11.field2515);
                                                }
                                            }
                                        } else if (class197.field3370) {
                                            class258.method1793(var11, 0);
                                        }
                                    }
                                } else if (var11.field2490 == 6) {
                                    class10 var59 = null;
                                    boolean var60 = class27.method249(var11, -4);
                                    int var61 = 0;
                                    int var62;
                                    if (var60) {
                                        var62 = var11.field2423;
                                    } else {
                                        var62 = var11.field2385;
                                    }
                                    if (var11.field2463 != -1) {
                                        class134 var67 = class5.method31(-1731690365, var11.field2463);
                                        if (var67 != null) {
                                            class134 var68 = var67.method1102(-1, var11.field2535);
                                            class285 var69 = var62 == -1 ? null : class346.method2428(var62, (byte) -24);
                                            if (var11.field2540 && class218.field3632.field3477 != null) {
                                                var59 = var68.method1106(var69, var11.field2522, (byte) 127, var11.field2380, class218.field3632.field3477, 1, var11.field2511);
                                            } else {
                                                var59 = var68.method1106(var69, var11.field2522, (byte) 127, var11.field2380, (class293) null, 1, var11.field2511);
                                            }
                                            if (var59 == null) {
                                                class258.method1793(var11, 0);
                                            } else {
                                                var61 = -var59.method95() / 2;
                                            }
                                        }
                                    } else if (var11.field2389 == 5) {
                                        if (var11.field2382 == -1) {
                                            var59 = class199.field3398.method2001(true, (class285) null, -1, (class285) null, 0, -1, (class288[]) null, -1, 0, 5, -1);
                                        } else {
                                            int var64 = var11.field2382 & 0x7FF;
                                            if (class316.field5010 == var64) {
                                                var64 = 2047;
                                            }
                                            class205 var65 = class135.field2359[var64];
                                            class285 var66 = var62 == -1 ? null : class346.method2428(var62, (byte) -24);
                                            if (var65 != null && (int) class142.method1151(var65.field3491, -103) << 11 == (var11.field2382 & 0xFFFFF800)) {
                                                var59 = var65.field3477.method2001(true, (class285) null, var11.field2522, var66, 0, -1, (class288[]) null, -1, 0, 5, 0);
                                            }
                                        }
                                    } else if (var62 == -1) {
                                        var59 = var11.method1131(-1, (class285) null, var60, -1, 0, class218.field3632.field3477, false);
                                        if (var59 == null && class197.field3370) {
                                            class258.method1793(var11, 0);
                                        }
                                    } else {
                                        class285 var63 = class346.method2428(var62, (byte) -24);
                                        var59 = var11.method1131(var11.field2380, var63, var60, var11.field2522, var11.field2511, class218.field3632.field3477, false);
                                        if (var59 == null && class197.field3370) {
                                            class258.method1793(var11, 0);
                                        }
                                    }
                                    if (var59 != null) {
                                        int var70;
                                        if (var11.field2437 > 0) {
                                            var70 = (var11.field2533 << 8) / var11.field2437;
                                        } else {
                                            var70 = 256;
                                        }
                                        int var71;
                                        if (var11.field2408 > 0) {
                                            var71 = (var11.field2515 << 8) / var11.field2408;
                                        } else {
                                            var71 = 256;
                                        }
                                        int var72 = var11.field2533 / 2 + (var13 + (var11.field2482 * var70 >> 8));
                                        int var73 = (var11.field2516 * var71 >> 8) + var14 + (var11.field2515 / 2);
                                        if (class43.field680) {
                                            if (var11.field2381) {
                                                class43.method378(var72, var73, var11.field2502, var11.field2467, var70, var71);
                                            } else {
                                                class43.method350(var72, var73, var70, var71);
                                                class43.method375((float) var11.field2398, (float) var11.field2467 * 1.5F);
                                            }
                                            class43.method362();
                                            class43.method366(true);
                                            class43.method392(false);
                                            class133.method1088((byte) -26, class32.field462);
                                            if (class155.field2759) {
                                                class169.method1335();
                                                class43.method360();
                                                class169.method1330(arg9, arg6, arg0, arg8);
                                                class155.field2759 = false;
                                            }
                                            if (var11.field2508) {
                                                class43.method354();
                                            }
                                            int var74 = class62.field962[var11.field2367] * var11.field2502 >> 16;
                                            int var75 = class62.field961[var11.field2367] * var11.field2502 >> 16;
                                            if (var11.field2402) {
                                                var59.method88(0, var11.field2430, var11.field2420, var11.field2367, var11.field2454, var74 + var61 + var11.field2500, var11.field2500 + var75, -1L);
                                            } else {
                                                var59.method88(0, var11.field2430, 0, var11.field2367, 0, var74, var75, -1L);
                                            }
                                            if (var11.field2508) {
                                                class43.method376();
                                            }
                                        } else {
                                            class62.method576(var72, var73);
                                            int var76 = class62.field962[var11.field2367] * var11.field2502 >> 16;
                                            int var77 = class62.field961[var11.field2367] * var11.field2502 >> 16;
                                            if (!var11.field2402) {
                                                var59.method88(0, var11.field2430, 0, var11.field2367, 0, var76, var77, -1L);
                                            } else if (var11.field2381) {
                                                ((class103) var59).method882(0, var11.field2430, var11.field2420, var11.field2367, var11.field2454, var61 + var76 + var11.field2500, var11.field2500 + var77, var11.field2502);
                                            } else {
                                                var59.method88(0, var11.field2430, var11.field2420, var11.field2367, var11.field2454, var61 + var76 + var11.field2500, var11.field2500 + var77, -1L);
                                            }
                                            class62.method578();
                                        }
                                    }
                                } else {
                                    if (var11.field2490 == 7) {
                                        class323 var78 = var11.method1123((byte) 23, class12.field187);
                                        if (var78 == null) {
                                            if (class197.field3370) {
                                                class258.method1793(var11, 0);
                                            }
                                            continue;
                                        }
                                        int var79 = 0;
                                        for (int var80 = 0; var80 < var11.field2443; var80++) {
                                            for (int var81 = 0; var81 < var11.field2435; var81++) {
                                                if (var11.field2379[var79] > 0) {
                                                    class134 var82 = class5.method31(-1731690365, var11.field2379[var79] - 1);
                                                    String var83;
                                                    if (var82.field2338 != 1 && var11.field2461[var79] == 1) {
                                                        var83 = "<col=ff9040>" + var82.field2346 + "</col>";
                                                    } else {
                                                        var83 = "<col=ff9040>" + var82.field2346 + "</col> x" + class338.method2386(var11.field2461[var79], (byte) 16);
                                                    }
                                                    int var84 = var13 + ((var11.field2365 + 115) * var81);
                                                    int var85 = var14 + ((var11.field2544 + 12) * var80);
                                                    if (var11.field2450 == 0) {
                                                        var78.method2240(var83, var84, var85, var11.field2505, var11.field2406 ? 0 : -1);
                                                    } else if (var11.field2450 == 1) {
                                                        var78.method2237(var83, var84 + 57, var85, var11.field2505, var11.field2406 ? 0 : -1);
                                                    } else {
                                                        var78.method2239(var83, var84 + 115 - 1, var85, var11.field2505, var11.field2406 ? 0 : -1);
                                                    }
                                                }
                                                var79++;
                                            }
                                        }
                                    }
                                    if (var11.field2490 == 8 && class85.field1364 == var11 && class205.field3489 == class105.field1758) {
                                        int var86 = 0;
                                        String var87 = var11.field2493;
                                        int var88 = 0;
                                        class323 var89 = class241.field3926;
                                        String var90 = class60.method554(var11, var87, (byte) -86);
                                        while (var90.length() > 0) {
                                            int var91 = var90.indexOf("<br>");
                                            String var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = "";
                                            } else {
                                                var92 = var90.substring(0, var91);
                                                var90 = var90.substring(var91 + 4);
                                            }
                                            int var93 = var89.method2223(var92);
                                            if (var86 < var93) {
                                                var86 = var93;
                                            }
                                            var88 += var89.field5127 + 1;
                                        }
                                        var88 += 7;
                                        var86 += 6;
                                        int var94 = var14 + var11.field2515 + 5;
                                        int var95 = var13 - (-var11.field2533 + var86) - 5;
                                        if (var88 + var94 > arg8) {
                                            var94 = arg8 - var88;
                                        }
                                        if (var95 < (var13 + 5)) {
                                            var95 = var13 + 5;
                                        }
                                        if (var95 + var86 > arg0) {
                                            var95 = arg0 - var86;
                                        }
                                        if (class43.field680) {
                                            class169.method1337(var95, var94, var86, var88, 16777120);
                                            class169.method1325(var95, var94, var86, var88, 0);
                                        } else {
                                            class47.method422(var95, var94, var86, var88, 16777120);
                                            class47.method416(var95, var94, var86, var88, 0);
                                        }
                                        String var96 = var11.field2493;
                                        int var97 = var94 + var89.field5127 + 2;
                                        String var98 = class60.method554(var11, var96, (byte) -105);
                                        while (var98.length() > 0) {
                                            int var99 = var98.indexOf("<br>");
                                            String var100;
                                            if (var99 == -1) {
                                                var100 = var98;
                                                var98 = "";
                                            } else {
                                                var100 = var98.substring(0, var99);
                                                var98 = var98.substring(var99 + 4);
                                            }
                                            var89.method2240(var100, var95 + 3, var97, 0, -1);
                                            var97 += var89.field5127 + 1;
                                        }
                                    }
                                    if (var11.field2490 == 9) {
                                        int var101;
                                        int var102;
                                        int var103;
                                        int var104;
                                        if (var11.field2483) {
                                            var101 = var14;
                                            var102 = var14 + var11.field2515;
                                            var103 = var11.field2533 + var13;
                                            var104 = var13;
                                        } else {
                                            var104 = var13;
                                            var101 = var14 + var11.field2515;
                                            var103 = var11.field2533 + var13;
                                            var102 = var14;
                                        }
                                        if (var11.field2442 == 1) {
                                            if (class43.field680) {
                                                class169.method1321(var104, var102, var103, var101, var11.field2505);
                                            } else {
                                                class47.method405(var104, var102, var103, var101, var11.field2505);
                                            }
                                        } else if (class43.field680) {
                                            class169.method1332(var104, var102, var103, var101, var11.field2505, var11.field2442);
                                        } else {
                                            class47.method413(var104, var102, var103, var101, var11.field2505, var11.field2442);
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

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[[I", line = 1386)
    public final int[][] method299(int arg0, int arg1) {
        int[][] var3 = this.field4958.method2404(arg0, (byte) 120);
        if (this.field4958.field5463) {
            int[][] var4 = this.method2161(0, 4, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class133.field2269; var11++) {
                int var12 = var7[var11];
                int var13 = var12 - this.field477[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field465 >= var13) {
                    int var14 = var5[var11];
                    int var15 = var14 - this.field477[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 <= this.field465) {
                        int var16 = var6[var11];
                        int var17 = var16 - this.field477[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (var17 > this.field465) {
                            var8[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var8[var11] = this.field480 * var12 >> 12;
                            var10[var11] = this.field475 * var14 >> 12;
                            var9[var11] = this.field466 * var16 >> 12;
                        }
                    } else {
                        var8[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var6[var11];
                    }
                } else {
                    var8[var11] = var12;
                    var10[var11] = var5[var11];
                    var9[var11] = var6[var11];
                }
            }
        }
        field464++;
        if (arg1 != 2) {
            this.field475 = 91;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 1476)
    public class33() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V", line = 1480)
    public static final void method300(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field473++;
        if (arg1 != 11314) {
            method306(126, 29, -7, true, (class137) null);
        }
        for (int var5 = 0; var5 < class215.field3602; var5++) {
            if (class328.field5227[var5] + class15.field231[var5] > arg4 && (arg3 + arg4) > class328.field5227[var5] && (class213.field3579[var5] + class15.field225[var5]) > arg2 && (arg2 + arg0) > class213.field3579[var5]) {
                class272.field4337[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "(I)V", line = 1505)
    public static void method301(int arg0) {
        if (arg0 < -35) {
            field468 = null;
            field481 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BI)V", line = 1519)
    public static final void method302(byte arg0, int arg1) {
        field470++;
        if (class88.field1397 == arg1) {
            return;
        }
        int var2 = 41 / ((arg0 - 48) / 33);
        if (class88.field1397 == 0) {
            class191.method1447((byte) 94);
        }
        if (arg1 == 40) {
            class21.method207(115);
        }
        boolean var3 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 != 40 && class203.field3462 != null) {
            class203.field3462.method177(false);
            class203.field3462 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class84.field1352 = 1;
            class28.field381 = 0;
            class21.field323 = 1;
            class329.field5239 = 0;
            class288.field4602 = 0;
            class209.method1553(true, (byte) 96);
        }
        if (arg1 == 25 || arg1 == 10) {
            class66.method633(false);
        }
        if (arg1 == 5) {
            class66.method635((byte) 71, class321.field5091);
        } else {
            class198.method1495(-82);
        }
        boolean var4 = class88.field1397 == 5 || class88.field1397 == 10 || class88.field1397 == 28;
        if (var4 != var3) {
            if (var3) {
                class131.field2254 = class204.field3475;
                if (class51.field796 == 0) {
                    class107.method937(-1, 2);
                } else {
                    class242.method1698(255, 0, false, class179.field3030, -3, 2, class204.field3475);
                }
                class247.field4009.method1975(false, false);
            } else {
                class107.method937(-1, 2);
                class247.field4009.method1975(false, true);
            }
        }
        if (class43.field680 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class43.method363();
        }
        class88.field1397 = arg1;
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V", line = 1597)
    public static final void method303(byte arg0) {
        field471++;
        if (class316.method2180((byte) 79) != 2) {
            return;
        }
        int var1 = class178.field3022 % 104;
        byte var2 = (byte) (class178.field3022 - 4 & 0xFF);
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                class35.field498[var3][var1][var4] = var2;
            }
        }
        if (class205.field3497 == 3) {
            return;
        }
        if (arg0 != -72) {
            field467 = 33;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class193.field3238[var5] = -1000000;
            class300.field4780[var5] = 1000000;
            class100.field1626[var5] = 0;
            class303.field4793[var5] = 1000000;
            class146.field2640[var5] = 0;
        }
        if (class191.field3194 != 1) {
            int var6 = class223.method1627((byte) -121, class32.field454, class269.field4309, class205.field3497);
            if ((var6 - class139.field2563) < 800 && (class152.field2683[class205.field3497][class269.field4309 >> 7][class32.field454 >> 7] & 0x4) != 0) {
                class44.method394(1, -33, class279.field4430, class32.field454 >> 7, class269.field4309 >> 7, false);
            }
            return;
        }
        if ((class152.field2683[class205.field3497][class218.field3632.field2036 >> 7][class218.field3632.field1985 >> 7] & 0x4) != 0) {
            class44.method394(0, -86, class279.field4430, class218.field3632.field1985 >> 7, class218.field3632.field2036 >> 7, false);
        }
        if (class141.field2592 >= 310) {
            return;
        }
        int var7 = class269.field4309 >> 7;
        int var8 = class32.field454 >> 7;
        int var9 = class218.field3632.field2036 >> 7;
        int var10 = class218.field3632.field1985 >> 7;
        int var11;
        if (var9 <= var7) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        int var12;
        if (var10 <= var8) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        if (var11 == 0 && var12 == 0 || var11 <= -104 || var11 >= 104 || var12 <= -104 || var12 >= 104) {
            class88.method775((Throwable) null, "RC: " + var7 + "," + var8 + " " + var9 + "," + var10 + " " + class24.field345 + "," + class34.field484, true);
            return;
        }
        if (var11 > var12) {
            int var15 = 32768;
            int var16 = var12 * 65536 / var11;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var7 > var9) {
                    var7--;
                }
                if ((class152.field2683[class205.field3497][var7][var8] & 0x4) != 0) {
                    class44.method394(1, -48, class279.field4430, var8, var7, false);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var10 > var8) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    if ((class152.field2683[class205.field3497][var7][var8] & 0x4) != 0) {
                        class44.method394(1, -29, class279.field4430, var8, var7, false);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = 32768;
        int var14 = var11 * 65536 / var12;
        while (var8 != var10) {
            if (var8 < var10) {
                var8++;
            } else if (var10 < var8) {
                var8--;
            }
            if ((class152.field2683[class205.field3497][var7][var8] & 0x4) != 0) {
                class44.method394(1, -123, class279.field4430, var8, var7, false);
                break;
            }
            var13 += var14;
            if (var13 >= 65536) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                var13 -= 65536;
                if ((class152.field2683[class205.field3497][var7][var8] & 0x4) != 0) {
                    class44.method394(1, -55, class279.field4430, var8, var7, false);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)V", line = 1790)
    public static final void method304(int arg0) {
        if (arg0 != 15613) {
            return;
        }
        if (class288.field4590 < 128.0F) {
            class288.field4590 = 128.0F;
        }
        field482++;
        while (class83.field1331 >= 2048.0F) {
            class83.field1331 -= 2048.0F;
        }
        while (class83.field1331 < 0.0F) {
            class83.field1331 += 2048.0F;
        }
        int var1 = class53.field833 >> 7;
        if (class288.field4590 > 383.0F) {
            class288.field4590 = 383.0F;
        }
        int var2 = class139.field2556 >> 7;
        int var3 = class223.method1627((byte) -120, class139.field2556, class53.field833, class205.field3497);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class205.field3497;
                    if (var7 < 3 && (class152.field2683[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = ((class41.field615[var7][var5][var6] & 0xFF) * 8) + var3 - class137.field2487[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class138.field2553) {
            class138.field2553 += (var9 - class138.field2553) / 24;
        } else if (var9 < class138.field2553) {
            class138.field2553 += (var9 - class138.field2553) / 80;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lcg;ZLcg;)V", line = 1887)
    public static final void method305(class49 arg0, boolean arg1, class49 arg2) {
        field474++;
        class99.field1605 = class325.method2255(!arg1, arg2, arg0, 0, class91.field1442);
        if (class43.field680) {
            class8.field110 = class163.method1295(0, class91.field1442, arg0, (byte) 38, arg2);
        } else {
            class8.field110 = (class244) class99.field1605;
        }
        class241.field3926 = class325.method2255(true, arg2, arg0, 0, class159.field2815);
        if (!arg1) {
            class177.field3014 = class325.method2255(true, arg2, arg0, 0, class303.field4802);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIZLlg;)V", line = 1906)
    private static final void method306(int arg0, int arg1, int arg2, boolean arg3, class137 arg4) {
        class215.method1587(!arg3);
        field469++;
        if (class43.field680) {
            class169.method1330(arg1, arg0, arg4.field2533 + arg1, arg4.field2515 + arg0);
        } else {
            class47.method420(arg1, arg0, arg1 + arg4.field2533, arg4.field2515 + arg0);
        }
        if (class316.field5008 != 2 && class316.field5008 != 5 && client.field4372 != null) {
            int var5 = (int) class83.field1331 + class243.field3962 & 0x7FF;
            int var6 = (class218.field3632.field2036 / 32) + 48;
            int var7 = 464 - (class218.field3632.field1985 / 32);
            if (class43.field680) {
                ((class157) client.field4372).method1250(arg1, arg0, arg4.field2533, arg4.field2515, var6, var7, var5, class4.field59 + 256, (class157) arg4.method1120(!arg3, false));
            } else {
                ((class309) client.field4372).method1871(arg1, arg0, arg4.field2533, arg4.field2515, var6, var7, var5, class4.field59 + 256, arg4.field2469, arg4.field2510);
            }
            if (class133.field2271 != null) {
                for (int var8 = 0; var8 < class133.field2271.field4814; var8++) {
                    if (class133.field2271.method2098(var8, -30963)) {
                        int var9 = (((class133.field2271.field4822[var8] & 0xFFFDA3F) >> 14) - class24.field345) * 4 + 2 - (class218.field3632.field2036 / 32);
                        int var10 = ((class133.field2271.field4822[var8] & 0x3FFF) - class34.field484) * 4 + (2 - class218.field3632.field1985 / 32);
                        int var11 = class62.field962[var5];
                        int var12 = class62.field961[var5];
                        int var13 = var12 * 256 / (class4.field59 + 256);
                        class323 var14 = class99.field1605;
                        int var15 = var11 * 256 / (class4.field59 + 256);
                        int var16 = var9 * var13 + var10 * var15 >> 16;
                        int var17 = var10 * var13 - (var9 * var15) >> 16;
                        if (class133.field2271.method2093(var8, 3) == 1) {
                            var14 = class241.field3926;
                        }
                        if (class133.field2271.method2093(var8, 3) == 2) {
                            var14 = class177.field3014;
                        }
                        int var18 = var14.method2236(class133.field2271.field4819[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if ((-arg4.field2533) <= var19 && arg4.field2533 >= var19 && -arg4.field2515 <= var17 && arg4.field2515 >= var17) {
                            int var20 = 16777215;
                            if (class133.field2271.field4816[var8] != -1) {
                                var20 = class133.field2271.field4816[var8];
                            }
                            if (class43.field680) {
                                class169.method1336((class157) arg4.method1120(false, false));
                            } else {
                                class47.method404(arg4.field2469, arg4.field2510);
                            }
                            var14.method2238(class133.field2271.field4819[var8], var19 + (arg4.field2533 / 2) + arg1, arg4.field2515 / 2 + arg0 + -var17, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class43.field680) {
                                class169.method1322();
                            } else {
                                class47.method411();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class179.field3032; var21++) {
                int var22 = class272.field4350[var21] * 4 + 2 - (class218.field3632.field2036 / 32);
                int var23 = class139.field2555[var21] * 4 - (class218.field3632.field1985 / 32 - 2);
                class97 var24 = class92.method798((byte) 104, class13.field214[var21]);
                if (var24.field1579 != null) {
                    var24 = var24.method833(false);
                    if (var24 == null || var24.field1568 == -1) {
                        continue;
                    }
                }
                class56.method500(arg1, arg4, arg0, var22, (byte) -96, class238.field3902[var24.field1568], var23);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class331 var27 = class214.field3591[class205.field3497][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class218.field3632.field2036 / 32);
                        int var29 = var26 * 4 - ((class218.field3632.field1985 / 32) - 2);
                        class56.method500(arg1, arg4, arg0, var28, (byte) -31, class269.field4305[0], var29);
                    }
                }
            }
            for (int var30 = 0; var30 < class191.field3200; var30++) {
                class278 var31 = class320.field5071[field468[var30]];
                if (var31 != null && var31.method981((byte) -90)) {
                    class12 var32 = var31.field4413;
                    if (var32 != null && var32.field179 != null) {
                        var32 = var32.method122(113);
                    }
                    if (var32 != null && var32.field200 && var32.field197) {
                        int var33 = var31.field2036 / 32 - (class218.field3632.field2036 / 32);
                        int var34 = var31.field1985 / 32 - (class218.field3632.field1985 / 32);
                        if (var32.field162 == -1) {
                            class56.method500(arg1, arg4, arg0, var33, (byte) 118, class269.field4305[1], var34);
                        } else {
                            class56.method500(arg1, arg4, arg0, var33, (byte) -23, class238.field3902[var32.field162], var34);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class291.field4664; var35++) {
                class205 var36 = class135.field2359[class119.field2064[var35]];
                if (var36 != null && var36.method981((byte) -90)) {
                    int var37 = var36.field2036 / 32 - (class218.field3632.field2036 / 32);
                    boolean var38 = false;
                    int var39 = var36.field1985 / 32 - (class218.field3632.field1985 / 32);
                    long var40 = class142.method1151(var36.field3491, -115);
                    for (int var42 = 0; var42 < class352.field5570; var42++) {
                        if (class339.field5414[var42] == var40 && class67.field1077[var42] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class298.field4746; var44++) {
                        if (class295.field4720[var44].field5062 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class218.field3632.field3490 != 0 && var36.field3490 != 0 && class218.field3632.field3490 == var36.field3490) {
                        var45 = true;
                    }
                    if (var38) {
                        class56.method500(arg1, arg4, arg0, var37, (byte) -18, class269.field4305[3], var39);
                    } else if (var43) {
                        class56.method500(arg1, arg4, arg0, var37, (byte) 91, class269.field4305[5], var39);
                    } else if (var45) {
                        class56.method500(arg1, arg4, arg0, var37, (byte) 117, class269.field4305[4], var39);
                    } else {
                        class56.method500(arg1, arg4, arg0, var37, (byte) 92, class269.field4305[2], var39);
                    }
                }
            }
            class156[] var46 = class311.field4922;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class156 var48 = var46[var47];
                if (var48 != null && var48.field2764 != 0 && class181.field3045 % 20 < 10) {
                    if (var48.field2764 == 1 && var48.field2765 >= 0 && var48.field2765 < class320.field5071.length) {
                        class278 var49 = class320.field5071[var48.field2765];
                        if (var49 != null) {
                            int var50 = var49.field1985 / 32 - (class218.field3632.field1985 / 32);
                            int var51 = var49.field2036 / 32 - class218.field3632.field2036 / 32;
                            class200.method1506(var51, 360000, var48.field2761, (byte) 127, arg0, arg1, arg4, var50);
                        }
                    }
                    if (var48.field2764 == 2) {
                        int var52 = (var48.field2770 - class34.field484) * 4 + 2 - (class218.field3632.field1985 / 32);
                        int var53 = var48.field2772 * 4;
                        int var54 = (var48.field2766 - class24.field345) * 4 - ((class218.field3632.field2036 / 32) - 2);
                        int var55 = var53 * var53;
                        class200.method1506(var54, var55, var48.field2761, (byte) 122, arg0, arg1, arg4, var52);
                    }
                    if (var48.field2764 == 10 && var48.field2765 >= 0 && var48.field2765 < class135.field2359.length) {
                        class205 var56 = class135.field2359[var48.field2765];
                        if (var56 != null) {
                            int var57 = var56.field2036 / 32 - (class218.field3632.field2036 / 32);
                            int var58 = var56.field1985 / 32 - (class218.field3632.field1985 / 32);
                            class200.method1506(var57, 360000, var48.field2761, (byte) 123, arg0, arg1, arg4, var58);
                        }
                    }
                }
            }
            if (class338.field5408 != 0) {
                int var59 = (class338.field5408 * 4 - -((class218.field3632.method987(3047) - 1) * 2)) + 2 - (class218.field3632.field2036 / 32);
                int var60 = class332.field5287 * 4 + class218.field3632.method987(3047) * 2 + 2 - class218.field3632.field1985 / 32 - 2;
                class56.method500(arg1, arg4, arg0, var59, (byte) -109, class72.field1200, var60);
            }
            if (class43.field680) {
                class169.method1337(arg4.field2533 / 2 + (arg1 - 1), arg4.field2515 / 2 + arg0 - 1, 3, 3, 16777215);
            } else {
                class47.method422(arg4.field2533 / 2 + arg1 - 1, arg0 + -1 - -(arg4.field2515 / 2), 3, 3, 16777215);
            }
        } else if (class43.field680) {
            class171 var61 = arg4.method1120(!arg3, false);
            if (var61 != null) {
                var61.method1248(arg1, arg0);
            }
        } else {
            class47.method419(arg1, arg0, 0, arg4.field2469, arg4.field2510);
        }
        class224.field3746[arg2] = arg3;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 2264)
    public static final String method307(String arg0, String arg1, int arg2, String arg3) {
        field472++;
        if (arg2 != -1) {
            field467 = 44;
        }
        for (int var4 = arg0.indexOf(arg1); var4 != -1; var4 = arg0.indexOf(arg1, arg3.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg3 + arg0.substring(arg1.length() + var4);
        }
        return arg0;
    }
}
