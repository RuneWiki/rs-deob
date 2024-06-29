import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class235 extends class264 {

    @OriginalMember(owner = "client!jda", name = "p", descriptor = "Z")
    public static boolean field3401 = true;

    @OriginalMember(owner = "client!jda", name = "u", descriptor = "I")
    public static int field3406 = 0;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "Lke;")
    public static class622 field3398 = new class622(29, -2);

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!jda", name = "o", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!jda", name = "r", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!jda", name = "s", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!jda", name = "t", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!jda", name = "v", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!jda", name = "q", descriptor = "Leh;")
    public static class378 field3402;

    @OriginalMember(owner = "client!jda", name = "w", descriptor = "Lcb;")
    public static class544 field3408;

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(Lmfa;)V", line = 3)
    public class235(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(B)V", line = 8)
    public static void method1618(byte arg0) {
        field3408 = null;
        int var1 = -51 / ((-44 - arg0) / 61);
        field3402 = null;
        field3398 = null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BI)I", line = 20)
    public final int method666(byte arg0, int arg1) {
        ++field3397;
        if (arg0 != 112) {
            field3408 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(I)V", line = 36)
    public final void method660(int arg0) {
        if (~super.field3733 != -2 && ~super.field3733 != -1) {
            super.field3733 = this.method663((byte) -38);
        }
        ++field3399;
        int var2 = 2 % ((arg0 - 1) / 41);
    }

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "(B)I", line = 49)
    public final int method1619(byte arg0) {
        if (arg0 > -31) {
            method1621(108, (class176[]) null, false, 38, 27, 62, -84, -70, -15, -99, 57);
        }
        ++field3400;
        return super.field3733;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)I", line = 60)
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            return -25;
        } else {
            ++field3407;
            return 0;
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(ILmfa;)V", line = 72)
    public class235(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILnba;)V", line = 78)
    public static final void method1620(int arg0, class312 arg1) {
        ++field3405;
        if (arg0 >= -90) {
            field3398 = null;
        }
        if (arg1 != null) {
            class551.field7826.method2510(arg1, false);
            ++class543.field7608;
            Object var2 = null;
            class4 var5;
            if (!arg1.field4642 && !"".equals(arg1.field4633)) {
                long var3 = arg1.field4635;
                for (var5 = (class4) class634.field8942.method380((byte) -3, var3); var5 != null && !var5.field48.equals(arg1.field4633); var5 = (class4) class634.field8942.method383(-1)) {
                }
                if (var5 == null) {
                    var5 = (class4) class648.field9117.method2373(var3, 103);
                    if (var5 != null && !var5.field48.equals(arg1.field4633)) {
                        var5 = null;
                    }
                    if (var5 == null) {
                        var5 = new class4(arg1.field4633);
                    }
                    class634.field8942.method384(var3, var5, false);
                    ++class27.field394;
                }
            } else {
                var5 = new class4(arg1.field4633);
                ++class27.field394;
            }
            if (var5.method28(arg1, true)) {
                class28.method206(var5, (byte) -72);
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(I[Lwq;ZIIIIIIII)V", line = 141)
    public static final void method1621(int arg0, class176[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class638.field8979.method455(arg7, arg10, arg4, arg8);
        ++field3404;
        if (arg5 != 12) {
            field3402 = null;
        }
        for (int var11 = 0; arg1.length > var11; ++var11) {
            class176 var12 = arg1[var11];
            if (var12 != null && (~var12.field2661 == ~arg3 || arg3 == -1412584499 && class169.field2433 == var12)) {
                int var13 = var12.field2599 + arg0;
                int var14 = var12.field2578 + arg9;
                int var15 = var12.field2673 + 1 + var13;
                int var16 = var12.field2664 + 1 + var14;
                int var17;
                if (~arg6 != 0) {
                    var17 = arg6;
                } else {
                    class667.field9385[class351.field5115].setBounds(var12.field2599 + arg0, var12.field2578 + arg9, var12.field2673, var12.field2664);
                    var17 = class351.field5115++;
                }
                var12.field2610 = class673.field9441;
                var12.field2512 = var17;
                if (!client.method2063(var12)) {
                    if (var12.field2551 != 0) {
                        class289.method1932(var12, -2167);
                    }
                    int var18 = var12.field2599 + arg0;
                    int var19 = var12.field2578 + arg9;
                    int var20 = 0;
                    int var21 = 0;
                    if (class607.field8578) {
                        var20 = class17.method143(-128);
                        var21 = class638.method3629(19728);
                    }
                    int var22 = var12.field2538;
                    if (class52.field744 && (~client.method2049(var12).field9229 != -1 || var12.field2560 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class169.field2433 == var12) {
                        if (arg3 != -1412584499 && (~class157.field2308 == ~var12.field2626 || class31.field421 == var12.field2626)) {
                            class502.field7188 = arg9;
                            class709.field9993 = arg1;
                            class249.field3538 = arg0;
                            continue;
                        }
                        if (class763.field10506 && class595.field8382) {
                            int var23 = var20 + class694.field9812.method3201((byte) 95);
                            int var24 = var21 + class694.field9812.method3197((byte) -125);
                            int var25 = var23 - class655.field9236;
                            int var26 = var24 - class117.field1461;
                            if (~var25 > ~class157.field2327) {
                                var25 = class157.field2327;
                            }
                            if (class374.field5400 > var26) {
                                var26 = class374.field5400;
                            }
                            if (var12.field2673 + var25 > class157.field2327 + class731.field10218.field2673) {
                                var25 = class731.field10218.field2673 - var12.field2673 + class157.field2327;
                            }
                            var18 = var25;
                            if (~(class374.field5400 + class731.field10218.field2664) > ~(var12.field2664 + var26)) {
                                var26 = -var12.field2664 + class731.field10218.field2664 + class374.field5400;
                            }
                            var19 = var26;
                        }
                        if (~class31.field421 == ~var12.field2626) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field2560 != 2) {
                        int var27 = var12.field2673 + var18;
                        int var28 = var12.field2664 + var19;
                        var29 = ~arg10 <= ~var19 ? arg10 : var19;
                        var30 = ~var18 < ~arg7 ? var18 : arg7;
                        if (var12.field2560 == 9) {
                            ++var27;
                            ++var28;
                        }
                        var31 = ~var28 <= ~arg8 ? arg8 : var28;
                        var32 = var27 >= arg4 ? arg4 : var27;
                    } else {
                        var32 = arg4;
                        var30 = arg7;
                        var29 = arg10;
                        var31 = arg8;
                    }
                    if (~var32 < ~var30 && ~var31 < ~var29) {
                        if (~var12.field2551 != -1) {
                            if (class11.field239 == var12.field2551 || ~class331.field4939 == ~var12.field2551) {
                                class145.method998(95, var12, var18, var19);
                                if (!class607.field8578) {
                                    class583.method3383(var12.field2664, -1428115959, ~class331.field4939 == ~var12.field2551, var19, var12.field2673, var18);
                                    class638.field8979.method455(arg7, arg10, arg4, arg8);
                                }
                                class397.field5653[var17] = true;
                                continue;
                            }
                            if (class574.field8117 == var12.field2551) {
                                if (var12.method1323(-21340, class638.field8979) != null) {
                                    class84.method611(126);
                                    class609.method3509(var19, class638.field8979, var18, var12, arg5 + 30469);
                                    class89.field1151[var17] = true;
                                    class638.field8979.method455(arg7, arg10, arg4, arg8);
                                    if (class607.field8578) {
                                        if (!arg2) {
                                            class609.method3508(var13, var14, var15, (byte) -60, var16);
                                        } else {
                                            class651.method3726(var14, 78, var16, var13, var15);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (~class239.field3443 == ~var12.field2551) {
                                class332.method2148(var18, var19, class638.field8979, 63, var12);
                                continue;
                            }
                            if (~class610.field8619 == ~var12.field2551) {
                                class784.method4296(-77, var18, class638.field8979, var12, var19, var12.field2573 % 64);
                                continue;
                            }
                            if (~class183.field2771 == ~var12.field2551) {
                                if (var12.method1323(-21340, class638.field8979) != null) {
                                    class297.method1987(var18, -16777216, var12, var19);
                                    class89.field1151[var17] = true;
                                    class638.field8979.method455(arg7, arg10, arg4, arg8);
                                    if (class607.field8578) {
                                        if (!arg2) {
                                            class609.method3508(var13, var14, var15, (byte) -60, var16);
                                        } else {
                                            class651.method3726(var14, 69, var16, var13, var15);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (~class451.field6497 == ~var12.field2551) {
                                class430.method2584(var18, arg5 ^ 124, var19, class413.field5837, var12.field2664, var12.field2673, class638.field8979);
                                class397.field5653[var17] = true;
                                class638.field8979.method455(arg7, arg10, arg4, arg8);
                                continue;
                            }
                            if (~class411.field5803 == ~var12.field2551) {
                                class93.method662(0, var12.field2673, var18, var12.field2664, class638.field8979, var19);
                                class397.field5653[var17] = true;
                                class638.field8979.method455(arg7, arg10, arg4, arg8);
                                continue;
                            }
                            if (class503.field7196 == var12.field2551) {
                                if (!class558.field7931 && !class665.field9353) {
                                    continue;
                                }
                                int var33 = var12.field2673 + var18;
                                if (class607.field8578) {
                                    if (!arg2) {
                                        class609.method3508(var13, var14, var15, (byte) -60, var16);
                                    } else {
                                        class651.method3726(var14, 68, var16, var13, var15);
                                    }
                                }
                                int var34 = var19 + 15;
                                if (class558.field7931) {
                                    int var35 = -256;
                                    if (class100.field1260 < 20) {
                                        var35 = -65536;
                                    }
                                    class564.field8008.method527("Fps:" + class100.field1260, -1, var35, var34, 96, var33);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        var38 = -65536;
                                        if (class733.field10237) {
                                            class785.method4300((byte) 118);
                                            for (int var39 = 0; var39 < 10; ++var39) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (~var37 < -65537) {
                                                class64.method386("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 4, false);
                                            }
                                        }
                                    }
                                    class564.field8008.method527("Mem:" + var37 + "k", -1, var38, var34, 95, var33);
                                    var34 += 15;
                                    class564.field8008.method527("In:" + class725.field10181 + "B/s Out:" + class757.field10458 + "B/s", -1, -256, var34, 92, var33);
                                    var34 += 15;
                                    int var40 = class638.field8979.method466() / 1024;
                                    class564.field8008.method527("Offheap:" + var40 + "k", -1, var40 <= 65536 ? -256 : -65536, var34, arg5 ^ 99, var33);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; ++var44) {
                                        if (class656.field9245[var44] != null) {
                                            var41 += class656.field9245[var44].method1713(0);
                                            var42 += class656.field9245[var44].method1719(true);
                                            var43 += class656.field9245[var44].method1715(true);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class241.method1643(2, 0, true, (long) var46, 0) + "% (" + var45 + "%)";
                                    class79.field1047.method527(var47, -1, -256, var34, arg5 ^ 113, var33);
                                    var34 += 12;
                                }
                                if (class428.field6016 > 0) {
                                    class79.field1047.method527("Particles: " + class569.field8056 + " / " + class428.field6016, -1, -256, var34, 102, var33);
                                }
                                var34 += 12;
                                if (class665.field9353) {
                                    class79.field1047.method527("Polys: " + class638.field8979.method404() + " Models: " + class638.field8979.method432(), -1, -256, var34, arg5 + 105, var33);
                                    var34 += 12;
                                    class79.field1047.method527("Ls: " + class562.field7993 + " La: " + class587.field8313 + " NPC: " + class170.field2439 + " Pl: " + class388.field5525, -1, -256, var34, 107, var33);
                                    class737.method4130(0);
                                    var34 += 12;
                                }
                                class397.field5653[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field2560 == 0) {
                            if (class640.field9001 == var12.field2551 && class638.field8979.method448()) {
                                class638.field8979.method401(var18, var19, var12.field2673, var12.field2664);
                            }
                            method1621(-var12.field2620 + var18, arg1, arg2, var12.field2588, var32, 12, var17, var30, var31, var19 - var12.field2508, var29);
                            if (var12.field2543 != null) {
                                method1621(-var12.field2620 + var18, var12.field2543, arg2, var12.field2588, var32, 12, var17, var30, var31, -var12.field2508 + var19, var29);
                            }
                            class329 var48 = (class329) class251.field3547.method380((byte) -3, (long) var12.field2588);
                            if (var48 != null) {
                                class581.method3380(var17, var30, var19, var32, var48.field4912, var29, var31, var18, arg5 ^ 12);
                            }
                            if (class640.field9001 == var12.field2551 && class638.field8979.method448()) {
                                class638.field8979.method443();
                            }
                            class638.field8979.method455(arg7, arg10, arg4, arg8);
                        }
                        if (class73.field987[var17] || ~class566.field8013 < -2) {
                            if (var12.field2560 == 3) {
                                if (~var22 != -1) {
                                    if (var12.field2511) {
                                        class638.field8979.method474(var18, var19, var12.field2673, var12.field2664, -(255 & var22) + 255 << 24 | 16777215 & var12.field2573, 1);
                                    } else {
                                        class638.field8979.method457(var18, var19, var12.field2673, var12.field2664, 16777215 & var12.field2573 | -(255 & var22) + 255 << 24, 1);
                                    }
                                } else if (!var12.field2511) {
                                    class638.field8979.method457(var18, var19, var12.field2673, var12.field2664, var12.field2573, 0);
                                } else {
                                    class638.field8979.method474(var18, var19, var12.field2673, var12.field2664, var12.field2573, 0);
                                }
                                if (class607.field8578) {
                                    if (arg2) {
                                        class651.method3726(var14, 112, var16, var13, var15);
                                    } else {
                                        class609.method3508(var13, var14, var15, (byte) -60, var16);
                                    }
                                }
                            } else if (var12.field2560 == 4) {
                                class67 var49 = var12.method1333((byte) -115, class638.field8979);
                                if (var49 == null) {
                                    if (class495.field7023) {
                                        class288.method1923((byte) -19, var12);
                                    }
                                } else {
                                    int var50 = var12.field2573;
                                    String var51 = var12.field2672;
                                    if (~var12.field2540 != 0) {
                                        class501 var52 = class526.field7490.method3567(var12.field2540, true);
                                        var51 = var52.field7108;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field7176 == 1 || ~var12.field2648 != -2) && var12.field2648 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class662.method3776(false, var12.field2648);
                                        }
                                    }
                                    if (var12.field2592 != -1) {
                                        var51 = class223.method1544(var12.field2592, (byte) 109);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class273.field3815 == var12) {
                                        var51 = class674.field9582.method3825((byte) -10, class526.field7494);
                                        var50 = var12.field2573;
                                    }
                                    if (class661.field9282) {
                                        class638.field8979.method453(var18, var19, var12.field2673 + var18, var19 - -var12.field2664);
                                    }
                                    var49.method517(0, (class510) null, var12.field2619, var12.field2664, var19, !var12.field2575 ? -1 : 255 - (var22 & 255) << 24, var51, var12.field2603, var12.field2673, arg5 + -80, class541.field7591, var12.field2566, (int[]) null, 0, var50 | -(255 & var22) + 255 << 24, var18, var12.field2639);
                                    if (class661.field9282) {
                                        class638.field8979.method455(arg7, arg10, arg4, arg8);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class661.field9282) {
                                            class263 var53 = class514.method2995(0, class638.field8979, var12.field2654);
                                            int var54 = var53.method1736(var12.field2673, class541.field7591, var51, arg5 ^ 12);
                                            int var55 = var53.method1734(var12.field2673, var12.field2619, 0, var51, class541.field7591);
                                            if (class607.field8578) {
                                                if (arg2) {
                                                    class651.method3726(var19, 112, var19 + var55, var18, var18 + var54);
                                                } else {
                                                    class609.method3508(var18, var19, var18 + var54, (byte) -60, var19 + var55);
                                                }
                                            }
                                        } else if (class607.field8578) {
                                            if (!arg2) {
                                                class609.method3508(var13, var14, var15, (byte) -60, var16);
                                            } else {
                                                class651.method3726(var14, 12, var16, var13, var15);
                                            }
                                        }
                                    }
                                }
                            } else if (var12.field2560 == 5) {
                                if (var12.field2585 >= 0) {
                                    var12.method1334(class510.field7302, arg5 + 113, class684.field9714).method3848(var18, (byte) 40, var19, var12.field2673, 0, var12.field2549 << 3, 0, var12.field2664, class638.field8979, var12.field2550 << 3);
                                } else {
                                    class112 var56;
                                    if (var12.field2540 == -1) {
                                        if (~var12.field2592 == 0) {
                                            var56 = var12.method1324(class638.field8979, (byte) -99);
                                        } else {
                                            var56 = class522.method3044(class638.field8979, 111, var12.field2592);
                                        }
                                    } else {
                                        class515 var57 = !var12.field2640 ? null : class251.field3549.field7933;
                                        var56 = class526.field7490.method3569(var57, -98, var12.field2501, class638.field8979, var12.field2615, var12.field2648, var12.field2515 | -16777216, var12.field2540);
                                    }
                                    if (var56 == null) {
                                        if (class495.field7023) {
                                            class288.method1923((byte) -19, var12);
                                        }
                                    } else {
                                        int var58 = var56.method781();
                                        int var59 = var56.method792();
                                        int var60 = (var12.field2573 != 0 ? var12.field2573 & 16777215 : 16777215) | -(var22 & 255) + 255 << 24;
                                        if (var12.field2518) {
                                            class638.field8979.method453(var18, var19, var12.field2673 + var18, var12.field2664 + var19);
                                            if (~var12.field2652 == -1) {
                                                if (var12.field2573 == 0 && var22 == 0) {
                                                    var56.method791(var18, var19, var12.field2673, var12.field2664);
                                                } else {
                                                    var56.method788(var18, var19, var12.field2673, var12.field2664, 0, var60, 1);
                                                }
                                            } else {
                                                int var61 = (var58 - 1 + var12.field2673) / var58;
                                                int var62 = (var12.field2664 + var59 - 1) / var59;
                                                for (int var63 = 0; ~var63 > ~var61; ++var63) {
                                                    for (int var64 = 0; var64 < var62; ++var64) {
                                                        if (~var12.field2573 != -1) {
                                                            var56.method796((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var19 - -(var59 * var64)), 4096, var12.field2652, 0, var60, 1);
                                                        } else {
                                                            var56.method799((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field2652);
                                                        }
                                                    }
                                                }
                                            }
                                            class638.field8979.method455(arg7, arg10, arg4, arg8);
                                        } else if (var12.field2573 == 0 && var22 == 0) {
                                            if (var12.field2652 != 0) {
                                                var56.method799((float) var12.field2673 / 2.0F + (float) var18, (float) var12.field2664 / 2.0F + (float) var19, var12.field2673 * 4096 / var58, var12.field2652);
                                            } else if (~var12.field2673 == ~var58 && var12.field2664 == var59) {
                                                var56.method785(var18, var19);
                                            } else {
                                                var56.method783(var18, var19, var12.field2673, var12.field2664);
                                            }
                                        } else if (var12.field2652 == 0) {
                                            if (~var12.field2673 == ~var58 && var12.field2664 == var59) {
                                                var56.method795(var18, var19, 0, var60, 1);
                                            } else {
                                                var56.method786(var18, var19, var12.field2673, var12.field2664, 0, var60, 1);
                                            }
                                        } else {
                                            var56.method796((float) var12.field2673 / 2.0F + (float) var18, (float) var12.field2664 / 2.0F + (float) var19, var12.field2673 * 4096 / var58, var12.field2652, 0, var60, 1);
                                        }
                                    }
                                }
                                if (class607.field8578) {
                                    if (arg2) {
                                        class651.method3726(var14, 89, var16, var13, var15);
                                    } else {
                                        class609.method3508(var13, var14, var15, (byte) -60, var16);
                                    }
                                }
                            } else if (var12.field2560 != 6) {
                                if (var12.field2560 == 9) {
                                    int var85;
                                    int var86;
                                    int var87;
                                    int var88;
                                    if (!var12.field2564) {
                                        var85 = var12.field2664 + var19;
                                        var86 = var12.field2673 + var18;
                                        var87 = var19;
                                        var88 = var18;
                                    } else {
                                        var86 = var12.field2673 + var18;
                                        var88 = var18;
                                        var85 = var19;
                                        var87 = var12.field2664 + var19;
                                    }
                                    if (var12.field2667 == 1) {
                                        class638.field8979.method438(var88, var87, var86, var85, var12.field2573, 0);
                                    } else {
                                        class638.field8979.method415(var88, var87, var86, var85, var12.field2573, var12.field2667, 0);
                                    }
                                    if (class607.field8578) {
                                        if (!arg2) {
                                            class609.method3508(var13, var14, var15, (byte) -60, var16);
                                        } else {
                                            class651.method3726(var14, 90, var16, var13, var15);
                                        }
                                    }
                                }
                            } else {
                                class739.method4139(-200);
                                Object var65 = null;
                                class495 var66 = null;
                                int var67 = 0;
                                if (var12.field2540 != -1) {
                                    class501 var68 = class526.field7490.method3567(var12.field2540, true);
                                    if (var68 != null) {
                                        class501 var69 = var68.method2925(var12.field2648, (byte) -87);
                                        class129 var70 = ~var12.field2609 == 0 ? null : class203.field2975.method1931((byte) -81, var12.field2609);
                                        class515 var71 = !var12.field2640 ? null : class251.field3549.field7933;
                                        var66 = var69.method2919(2048, var12.field2506, arg5 ^ -107, 1, var12.field2668, var12.field2670, class638.field8979, var70, var71);
                                        if (var66 != null) {
                                            var67 = -var66.method75() >> 1;
                                        } else {
                                            class288.method1923((byte) -19, var12);
                                        }
                                    }
                                } else if (~var12.field2569 == -6) {
                                    int var72 = var12.field2656;
                                    if (~var72 <= -1 && var72 < 2048) {
                                        class559 var73 = class581.field8250[var72];
                                        class129 var74 = ~var12.field2609 == 0 ? null : class203.field2975.method1931((byte) -81, var12.field2609);
                                        if (var73 != null && (class223.field3199 == var72 || ~class338.method2167(var73.field7955, arg5 ^ 12) == ~var12.field2525)) {
                                            var66 = var73.field7933.method2998(-1, (int[]) null, (class129) null, 0, (byte) -86, true, class176.field2677, class203.field2975, var74, 0, 2048, class21.field322, class526.field7490, 0, class549.field7742, class271.field3796, class638.field8979, var12.field2506, var12.field2670, var12.field2668, (class61[]) null);
                                        }
                                    }
                                } else if (var12.field2569 != 8 && ~var12.field2569 != -10) {
                                    if (var12.field2609 != -1) {
                                        class129 var75 = class203.field2975.method1931((byte) -81, var12.field2609);
                                        var66 = var12.method1330(class526.field7490, var12.field2670, class549.field7742, class251.field3549.field7933, (class304) var65, var12.field2668, var75, false, class271.field3796, 2048, class203.field2975, class638.field8979, var12.field2506, class21.field322, class176.field2677);
                                        if (var66 == null && class495.field7023) {
                                            class288.method1923((byte) -19, var12);
                                        }
                                    } else {
                                        var66 = var12.method1330(class526.field7490, -1, class549.field7742, class251.field3549.field7933, (class304) var65, 0, (class129) null, false, class271.field3796, 2048, class203.field2975, class638.field8979, -1, class21.field322, class176.field2677);
                                        if (var66 == null && class495.field7023) {
                                            class288.method1923((byte) -19, var12);
                                        }
                                    }
                                } else {
                                    class685 var76 = class26.method198(false, (byte) -19, var12.field2656);
                                    class129 var77 = ~var12.field2609 == 0 ? null : class203.field2975.method1931((byte) -81, var12.field2609);
                                    if (var76 != null) {
                                        class515 var78 = var12.field2640 ? class251.field3549.field7933 : null;
                                        var66 = var76.method3864(var77, var78, var12.field2670, var12.field2525, var12.field2668, ~var12.field2569 == -10, class638.field8979, var12.field2506, 2048, -7864);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field2514 <= 0) {
                                        var79 = 512;
                                    } else {
                                        var79 = (var12.field2673 << 9) / var12.field2514;
                                    }
                                    int var80;
                                    if (~var12.field2623 < -1) {
                                        var80 = (var12.field2664 << 9) / var12.field2623;
                                    } else {
                                        var80 = 512;
                                    }
                                    int var81 = var12.field2673 / 2 + var18;
                                    int var82 = var12.field2664 / 2 + var19;
                                    if (!var12.field2614) {
                                        var82 += var12.field2539 * var80 >> 9;
                                        var81 += var12.field2523 * var79 >> 9;
                                    }
                                    class13.field256.method1956();
                                    class638.field8979.method445(class13.field256);
                                    class638.field8979.method409(var81, var82, var79, var80);
                                    class638.field8979.method449();
                                    if (var12.field2554) {
                                        class638.field8979.method408(false);
                                    }
                                    if (!var12.field2614) {
                                        int var83 = (var12.field2636 << 2) * class601.field8476[var12.field2597 << 3] >> 14;
                                        int var84 = (var12.field2636 << 2) * class601.field8473[var12.field2597 << 3] >> 14;
                                        field3402.method1940(-var12.field2632 << 3);
                                        field3402.method1937(var12.field2520 << 3);
                                        field3402.method1952(var12.field2548 << 2, var67 + var83 - -(var12.field2547 << 2), (var12.field2547 << 2) + var84);
                                        field3402.method1957(var12.field2597 << 3);
                                    } else {
                                        field3402.method1966(var12.field2597);
                                        field3402.method1937(var12.field2520);
                                        field3402.method1942(var12.field2632);
                                        field3402.method1952(var12.field2523, var12.field2539, var12.field2513);
                                    }
                                    var12.method1335(field3402, var66, (byte) -67, class673.field9441, class638.field8979);
                                    if (class661.field9282) {
                                        class638.field8979.method453(var18, var19, var18 - -var12.field2673, var12.field2664 + var19);
                                    }
                                    if (var12.field2614) {
                                        if (var12.field2557) {
                                            var66.method91(field3402, (class660) null, var12.field2636, 1);
                                        } else {
                                            var66.method108(field3402, (class660) null, 1);
                                            if (var12.field2593 != null) {
                                                class638.field8979.method437(var12.field2593.method177());
                                            }
                                        }
                                    } else if (!var12.field2557) {
                                        var66.method108(field3402, (class660) null, 1);
                                        if (var12.field2593 != null) {
                                            class638.field8979.method437(var12.field2593.method177());
                                        }
                                    } else {
                                        var66.method91(field3402, (class660) null, var12.field2636 << 2, 1);
                                    }
                                    if (class661.field9282) {
                                        class638.field8979.method455(arg7, arg10, arg4, arg8);
                                    }
                                    if (var12.field2554) {
                                        class638.field8979.method408(true);
                                    }
                                }
                                if (class607.field8578) {
                                    if (arg2) {
                                        class651.method3726(var14, arg5 + 11, var16, var13, var15);
                                    } else {
                                        class609.method3508(var13, var14, var15, (byte) -60, var16);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(BI)V", line = 1025)
    public final void method659(byte arg0, int arg1) {
        ++field3403;
        super.field3733 = arg1;
        if (arg0 > -114) {
            this.method663((byte) -112);
        }
    }
}
