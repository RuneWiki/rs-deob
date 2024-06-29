import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class62 extends class132 {

    @OriginalMember(owner = "client!r", name = "R", descriptor = "I")
    public static int field636 = 0;

    @OriginalMember(owner = "client!r", name = "L", descriptor = "B")
    public byte field630;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    public int field639;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "Lib;")
    public static class247 field635;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "Ltq;")
    public class250 field628;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "Lam;")
    public static class286 field633;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "[[[B")
    public static byte[][][] field629;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZII)V", line = 3)
    public static final void method333(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field641;
        if (arg2) {
            class40 var5 = class162.method872(arg4, (byte) 92, 10);
            var5.method190(0);
            var5.field413 = arg0;
            var5.field410 = arg1;
            var5.field418 = arg3;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lfd;IIBIIIII)V", line = 19)
    public static final void method334(int arg0, class194[] arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field637;
        int var10 = -89 % ((arg4 - -27) / 61);
        class88.field1003.method1648(arg3, arg9, arg7, arg5);
        for (int var11 = 0; var11 < arg1.length; ++var11) {
            class194 var12 = arg1[var11];
            if (var12 != null && (~var12.field2470 == ~arg8 || arg8 == -1412584499 && class106.field1313 == var12)) {
                int var13;
                if (~arg2 != 0) {
                    var13 = arg2;
                } else {
                    class128.field1651[class274.field3694].setBounds(var12.field2562 - -arg0, var12.field2553 + arg6, var12.field2501, var12.field2460);
                    var13 = class274.field3694++;
                }
                var12.field2555 = var13;
                var12.field2506 = class234.field3224;
                if (!var12.field2575 || !client.method1420(var12)) {
                    if (var12.field2455 > 0) {
                        class151.method808(64, var12);
                    }
                    int var14 = var12.field2562 + arg0;
                    int var15 = var12.field2553 + arg6;
                    int var16 = var12.field2537;
                    if (class318.field4237 && (~client.method1410(var12).field2940 != -1 || var12.field2492 == 0) && ~var16 < -128) {
                        var16 = 127;
                    }
                    if (class106.field1313 == var12) {
                        if (~arg8 != 1412584498 && !var12.field2597) {
                            class444.field6495 = arg1;
                            class110.field1361 = arg6;
                            class172.field2164 = arg0;
                            continue;
                        }
                        if (class104.field1280 && class256.field3503) {
                            int var17 = class337.field4493;
                            int var18 = class306.field4146;
                            int var19 = var17 - class279.field3800;
                            if (~var19 > ~class12.field117) {
                                var19 = class12.field117;
                            }
                            int var20 = var18 - class36.field379;
                            if (class12.field117 + class428.field6290.field2501 < var12.field2501 + var19) {
                                var19 = -var12.field2501 + class12.field117 + class428.field6290.field2501;
                            }
                            if (class272.field3678 > var20) {
                                var20 = class272.field3678;
                            }
                            if (~(class272.field3678 + class428.field6290.field2460) > ~(var12.field2460 + var20)) {
                                var20 = -var12.field2460 + class272.field3678 + class428.field6290.field2460;
                            }
                            var14 = var19;
                            var15 = var20;
                        }
                        if (!var12.field2597) {
                            var16 = 128;
                        }
                    }
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    if (~var12.field2492 == -3) {
                        var21 = arg7;
                        var22 = arg5;
                        var23 = arg3;
                        var24 = arg9;
                    } else {
                        int var25 = var14 - -var12.field2501;
                        int var26 = var15 - -var12.field2460;
                        var23 = ~arg3 > ~var14 ? var14 : arg3;
                        var24 = arg9 >= var15 ? arg9 : var15;
                        if (~var12.field2492 == -10) {
                            ++var26;
                            ++var25;
                        }
                        var22 = arg5 <= var26 ? arg5 : var26;
                        var21 = ~arg7 >= ~var25 ? arg7 : var25;
                    }
                    if (!var12.field2575 || var23 < var21 && var22 > var24) {
                        if (~var12.field2455 != -1) {
                            if (var12.field2455 == 1337 || ~var12.field2455 == -1404) {
                                class201.method1097(~var12.field2455 == -1404, var15, -16596, var12.field2501, var14, var12.field2460);
                                class321.field4290[var13] = true;
                                class88.field1003.method1648(arg3, arg9, arg7, arg5);
                                continue;
                            }
                            if (~var12.field2455 == -1339) {
                                if (var12.method1043(class88.field1003, (byte) -96) != null) {
                                    class449.method2771(-32);
                                    class259.method1451(class88.field1003, var12, var15, var14, 48);
                                    class405.field5895[var13] = true;
                                    class88.field1003.method1648(arg3, arg9, arg7, arg5);
                                }
                                continue;
                            }
                            if (var12.field2455 == 1339) {
                                if (var12.method1043(class88.field1003, (byte) -114) != null) {
                                    class246.method1315(var15, var12, 126, var14);
                                    class405.field5895[var13] = true;
                                    class88.field1003.method1648(arg3, arg9, arg7, arg5);
                                }
                                continue;
                            }
                            if (~var12.field2455 == -1401) {
                                class96.method527(var12.field2460, class88.field1003, class293.field3985, var15, -23101, var12.field2501, var14);
                                class321.field4290[var13] = true;
                                class88.field1003.method1648(arg3, arg9, arg7, arg5);
                                continue;
                            }
                            if (var12.field2455 == 1401) {
                                class268.method1491(var14, false, var12.field2460, var15, var12.field2501, class88.field1003);
                                class321.field4290[var13] = true;
                                class88.field1003.method1648(arg3, arg9, arg7, arg5);
                                continue;
                            }
                            if (~var12.field2455 == -1406) {
                                if (!class327.field4346 && !class424.field6224) {
                                    continue;
                                }
                                int var27 = var12.field2501 + var14;
                                int var28 = var15 + 15;
                                if (class327.field4346) {
                                    class105.field1296.method1750(var27, 255, -256, -1, var28, "Fps:" + class452.field6584);
                                    var28 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (~var30 < -65537) {
                                        var31 = -65536;
                                    }
                                    class105.field1296.method1750(var27, 255, var31, -1, var28, "Mem:" + var30 + "k");
                                    var28 += 15;
                                    int var32 = class88.field1003.method1567() / 1024;
                                    class105.field1296.method1750(var27, 255, var32 <= 65536 ? -256 : -65536, -1, var28, "Offheap:" + var32 + "k");
                                    var28 += 15;
                                    int var33 = 0;
                                    int var34 = 0;
                                    int var35 = 0;
                                    for (int var36 = 0; ~var36 > -30; ++var36) {
                                        var33 += class382.field5435[var36].method179(true);
                                        var34 += class382.field5435[var36].method168(-64);
                                        var35 += class382.field5435[var36].method177((byte) -108);
                                    }
                                    int var37 = var35 * 100 / var33;
                                    int var38 = var34 * 10000 / var33;
                                    String var39 = "Cache:" + class318.method1833(true, (long) var38, 0, 2, -20112) + "% (" + var37 + "%)";
                                    class115.field1436.method1750(var27, 255, -256, -1, var28, var39);
                                    var28 += 12;
                                }
                                if (class260.field3531 > 0) {
                                    class115.field1436.method1750(var27, 255, -256, -1, var28, "Particles: " + class182.field2320 + " / " + class260.field3531);
                                }
                                var28 += 12;
                                if (class424.field6224) {
                                    class115.field1436.method1750(var27, 255, -256, -1, var28, "Polys: " + class88.field1003.method1596() + " Models: " + class88.field1003.method1573());
                                    var28 += 12;
                                    class115.field1436.method1750(var27, 255, -256, -1, var28, "Ls: " + class116.field1440 + " La: " + class389.field5574 + " NPC: " + class376.field5278 + " Pl: " + class449.field6522);
                                    var28 += 12;
                                    class386.method2393((byte) -51);
                                }
                                class321.field4290[var13] = true;
                                continue;
                            }
                        }
                        if (~var12.field2492 == -1) {
                            if (!var12.field2575 && client.method1420(var12) && class222.field2972 != var12) {
                                continue;
                            }
                            if (!var12.field2575) {
                                if (~var12.field2565 < ~(-var12.field2460 + var12.field2445)) {
                                    var12.field2565 = -var12.field2460 + var12.field2445;
                                }
                                if (~var12.field2565 > -1) {
                                    var12.field2565 = 0;
                                }
                            }
                            if (var12.field2455 == 1407 && class88.field1003.method1636()) {
                                class88.field1003.method1616(var14, var15, var12.field2501, var12.field2460);
                            }
                            method334(-var12.field2522 + var14, arg1, var13, var23, (byte) -92, var22, -var12.field2565 + var15, var21, var12.field2502, var24);
                            if (var12.field2620 != null) {
                                method334(-var12.field2522 + var14, var12.field2620, var13, var23, (byte) -121, var22, -var12.field2565 + var15, var21, var12.field2502, var24);
                            }
                            class141 var40 = (class141) class337.field4495.method308((long) var12.field2502, (byte) 27);
                            if (var40 != null) {
                                class122.method648(var13, 115, var40.field1802, var15, var23, var22, var14, var24, var21);
                            }
                            if (var12.field2455 == 1407 && class88.field1003.method1636()) {
                                class88.field1003.method1605();
                                class1.field2 = true;
                            }
                            class88.field1003.method1648(arg3, arg9, arg7, arg5);
                        }
                        if (class175.field2194[var13] || ~class126.field1632 < -2) {
                            if (~var12.field2492 == -1 && !var12.field2575 && var12.field2445 > var12.field2460) {
                                class449.method2768(var15, var12.field2565, var12.field2445, (byte) -109, var12.field2460, var12.field2501 + var14);
                            }
                            if (var12.field2492 != 1) {
                                if (var12.field2492 == 2) {
                                    int var41 = 0;
                                    for (int var42 = 0; var42 < var12.field2450; ++var42) {
                                        for (int var43 = 0; ~var43 > ~var12.field2495; ++var43) {
                                            int var44 = (var12.field2602 + 32) * var43 + var14;
                                            int var45 = (var12.field2538 + 32) * var42 + var15;
                                            if (~var41 > -21) {
                                                var44 += var12.field2532[var41];
                                                var45 += var12.field2618[var41];
                                            }
                                            if (~var12.field2473[var41] >= -1) {
                                                if (var12.field2540 != null && ~var41 > -21) {
                                                    class20 var58 = var12.method1052(class88.field1003, var41, 0);
                                                    if (var58 == null) {
                                                        if (class398.field5732) {
                                                            class204.method1107(var12, (byte) -100);
                                                        }
                                                    } else {
                                                        var58.method93(var44, var45);
                                                    }
                                                }
                                            } else {
                                                boolean var46 = false;
                                                boolean var47 = false;
                                                int var48 = var12.field2473[var41] - 1;
                                                if (~(var44 + 32) < ~arg3 && ~arg7 < ~var44 && ~arg9 > ~(var45 + 32) && ~var45 > ~arg5 || class123.field1558 == var12 && ~class192.field2421 == ~var41) {
                                                    class20 var49;
                                                    if (class171.field2155 == 1 && ~class6.field57 == ~var41 && ~class108.field1325 == ~var12.field2502) {
                                                        var49 = class281.method1657(class88.field1003, 0, (class335) null, -10094, var12.field2489[var41], var12.field2466, 2, var48);
                                                    } else {
                                                        var49 = class281.method1657(class88.field1003, -13623264, (class335) null, -10094, var12.field2489[var41], var12.field2466, 1, var48);
                                                    }
                                                    if (var49 != null) {
                                                        if (class123.field1558 == var12 && ~class192.field2421 == ~var41) {
                                                            int var50 = -class87.field985 + class306.field4146;
                                                            int var51 = -class200.field2689 + class337.field4493;
                                                            if (var51 < 5 && var51 > -5) {
                                                                var51 = 0;
                                                            }
                                                            if (var50 < 5 && var50 > -5) {
                                                                var50 = 0;
                                                            }
                                                            if (class398.field5743 < 5) {
                                                                var51 = 0;
                                                                var50 = 0;
                                                            }
                                                            var49.method100(var44 - -var51, var45 + var50, 0, -2013265920, 1);
                                                            if (~arg8 != 0) {
                                                                class194 var52 = arg1[arg8 & 65535];
                                                                int[] var53 = new int[4];
                                                                class88.field1003.method1629(var53);
                                                                int var54 = var53[1];
                                                                int var55 = var53[3];
                                                                if (var45 + var50 < var54 && var52.field2565 > 0) {
                                                                    int var56 = (var54 - (var45 - -var50)) * class259.field3526 / 3;
                                                                    if (~var56 < ~(class259.field3526 * 10)) {
                                                                        var56 = class259.field3526 * 10;
                                                                    }
                                                                    if (var56 > var52.field2565) {
                                                                        var56 = var52.field2565;
                                                                    }
                                                                    class87.field985 += var56;
                                                                    var52.field2565 -= var56;
                                                                    class204.method1107(var52, (byte) -105);
                                                                }
                                                                if (~var55 > ~(var45 + var50 + 32) && -var52.field2460 + var52.field2445 > var52.field2565) {
                                                                    int var57 = (var45 - -var50 + 32 + -var55) * class259.field3526 / 3;
                                                                    if (~(class259.field3526 * 10) > ~var57) {
                                                                        var57 = class259.field3526 * 10;
                                                                    }
                                                                    if (~(-var52.field2460 + var52.field2445 + -var52.field2565) > ~var57) {
                                                                        var57 = -var52.field2565 + var52.field2445 - var52.field2460;
                                                                    }
                                                                    class87.field985 -= var57;
                                                                    var52.field2565 += var57;
                                                                    class204.method1107(var52, (byte) -116);
                                                                }
                                                            }
                                                        } else if (class283.field3873 == var12 && class236.field3260 == var41) {
                                                            var49.method100(var44, var45, 0, -2013265920, 1);
                                                        } else {
                                                            var49.method93(var44, var45);
                                                        }
                                                    } else {
                                                        class204.method1107(var12, (byte) -105);
                                                    }
                                                }
                                            }
                                            ++var41;
                                        }
                                    }
                                } else if (var12.field2492 == 3) {
                                    int var59;
                                    if (!class392.method2438((byte) -90, var12)) {
                                        var59 = var12.field2563;
                                        if (class222.field2972 == var12 && ~var12.field2584 != -1) {
                                            var59 = var12.field2584;
                                        }
                                    } else {
                                        var59 = var12.field2611;
                                        if (class222.field2972 == var12 && ~var12.field2561 != -1) {
                                            var59 = var12.field2561;
                                        }
                                    }
                                    if (var16 == 0) {
                                        if (!var12.field2580) {
                                            class88.field1003.method1575(var14, var15, var12.field2501, var12.field2460, var59, 0);
                                        } else {
                                            class88.field1003.method1614(var14, var15, var12.field2501, var12.field2460, var59, 0);
                                        }
                                    } else if (!var12.field2580) {
                                        class88.field1003.method1575(var14, var15, var12.field2501, var12.field2460, 16777215 & var59 | -(var16 & 255) + 255 << 24, 1);
                                    } else {
                                        class88.field1003.method1614(var14, var15, var12.field2501, var12.field2460, var59 & 16777215 | -(var16 & 255) + 255 << 24, 1);
                                    }
                                } else if (var12.field2492 == 4) {
                                    class298 var60 = var12.method1048(true, class88.field1003);
                                    if (var60 == null) {
                                        if (class398.field5732) {
                                            class204.method1107(var12, (byte) -96);
                                        }
                                    } else {
                                        String var61 = var12.field2569;
                                        int var62;
                                        if (class392.method2438((byte) -90, var12)) {
                                            var62 = var12.field2611;
                                            if (class222.field2972 == var12 && var12.field2561 != 0) {
                                                var62 = var12.field2561;
                                            }
                                            if (var12.field2572.length() > 0) {
                                                var61 = var12.field2572;
                                            }
                                        } else {
                                            var62 = var12.field2563;
                                            if (class222.field2972 == var12 && ~var12.field2584 != -1) {
                                                var62 = var12.field2584;
                                            }
                                        }
                                        if (var12.field2575 && var12.field2507 != -1) {
                                            class123 var63 = class65.method368(var12.field2507, -112);
                                            var61 = var63.field1519;
                                            if (var61 == null) {
                                                var61 = "null";
                                            }
                                            if ((var63.field1517 == 1 || var12.field2461 != 1) && ~var12.field2461 != 0) {
                                                var61 = "<col=ff9040>" + var61 + "</col> x" + class289.method1715(var12.field2461, 3272);
                                            }
                                        }
                                        if (class203.field2717 == var12) {
                                            var62 = var12.field2563;
                                            var61 = class8.field72;
                                        }
                                        if (!var12.field2575) {
                                            var61 = class333.method1896(4, var12, var61);
                                        }
                                        if (class227.field3095) {
                                            class88.field1003.method1580(var14, var15, var12.field2501 + var14, var15 - -var12.field2460);
                                        }
                                        var60.method1762(var12.field2501, 0, !var12.field2541 ? -1 : -16777216, (int[]) null, true, var14, var12.field2483, var61, var15, var12.field2460, 0, class88.field999, (class175) null, var12.field2591, var12.field2560, -16777216 | var62);
                                        if (class227.field3095) {
                                            class88.field1003.method1648(arg3, arg9, arg7, arg5);
                                        }
                                    }
                                } else if (~var12.field2492 == -6) {
                                    if (!var12.field2575) {
                                        class20 var64 = var12.method1046(class392.method2438((byte) -90, var12), -30431, class88.field1003);
                                        if (var64 == null) {
                                            if (class398.field5732) {
                                                class204.method1107(var12, (byte) -115);
                                            }
                                        } else {
                                            var64.method93(var14, var15);
                                        }
                                    } else if (var12.field2576 >= 0) {
                                        var12.method1051(4106).method1190(var14, class88.field1003, var12.field2627 << 3, (byte) 51, 0, var12.field2460, var12.field2501, var12.field2594 << 3, var15, 0);
                                    } else {
                                        class20 var65;
                                        if (~var12.field2507 == 0) {
                                            var65 = var12.method1046(false, -30431, class88.field1003);
                                        } else {
                                            class335 var66 = !var12.field2515 ? null : class427.field6264.field2017;
                                            var65 = class281.method1657(class88.field1003, -16777216 | var12.field2590, var66, -10094, var12.field2461, var12.field2466, var12.field2523, var12.field2507);
                                        }
                                        if (var65 == null) {
                                            if (class398.field5732) {
                                                class204.method1107(var12, (byte) -102);
                                            }
                                        } else {
                                            int var67 = var65.method101();
                                            int var68 = var65.method109();
                                            if (!var12.field2480) {
                                                if (~var16 == -1) {
                                                    if (~var12.field2517 != -1) {
                                                        var65.method103((float) var12.field2501 / 2.0F + (float) var14, (float) var12.field2460 / 2.0F + (float) var15, var12.field2501 * 4096 / var67, var12.field2517);
                                                    } else if (var12.field2501 == var67 && var12.field2460 == var68) {
                                                        var65.method93(var14, var15);
                                                    } else {
                                                        var65.method106(var14, var15, var12.field2501, var12.field2460);
                                                    }
                                                } else {
                                                    int var69 = 16777215 | -(255 & var16) + 255 << 24;
                                                    if (var12.field2517 != 0) {
                                                        var65.method99((float) var12.field2501 / 2.0F + (float) var14, (float) var12.field2460 / 2.0F + (float) var15, var12.field2501 * 4096 / var67, var12.field2517, 1, var69, 1);
                                                    } else if (var12.field2501 == var67 && ~var12.field2460 == ~var68) {
                                                        var65.method100(var14, var15, 1, var69, 1);
                                                    } else {
                                                        var65.method110(var14, var15, var12.field2501, var12.field2460, 1, var69, 1);
                                                    }
                                                }
                                            } else {
                                                class88.field1003.method1580(var14, var15, var14 - -var12.field2501, var12.field2460 + var15);
                                                if (var12.field2517 == 0) {
                                                    if (var16 == 0) {
                                                        var65.method107(var14, var15, var12.field2501, var12.field2460, 0, 0, 1);
                                                    } else {
                                                        var65.method107(var14, var15, var12.field2501, var12.field2460, 1, -(255 & var16) + 255 << 24 | 16777215, 1);
                                                    }
                                                } else {
                                                    int var70 = (var67 + -1 + var12.field2501) / var67;
                                                    int var71 = (-1 - (-var68 - var12.field2460)) / var68;
                                                    for (int var72 = 0; var70 > var72; ++var72) {
                                                        for (int var73 = 0; ~var73 > ~var71; ++var73) {
                                                            var65.method103((float) var67 / 2.0F + (float) (var67 * var72 + var14), (float) var68 / 2.0F + (float) (var68 * var73 + var15), 4096, var12.field2517);
                                                        }
                                                    }
                                                }
                                                class88.field1003.method1648(arg3, arg9, arg7, arg5);
                                            }
                                        }
                                    }
                                } else if (var12.field2492 == 6) {
                                    boolean var74 = class392.method2438((byte) -90, var12);
                                    int var75;
                                    if (!var74) {
                                        var75 = var12.field2516;
                                    } else {
                                        var75 = var12.field2578;
                                    }
                                    class57.method300(-60);
                                    class396 var76 = null;
                                    int var77 = 0;
                                    if (var12.field2507 == -1) {
                                        if (~var12.field2444 == -6) {
                                            if (var12.field2599 == -1) {
                                                var76 = class17.field151.method1912(-1, true, (class208) null, -1, -1, -1, class88.field1003, (class208) null, (class395[]) null, 0, 0, 0, 1024);
                                            } else {
                                                int var78 = var12.field2599;
                                                class158 var79;
                                                if (class324.field4325 == var78) {
                                                    var79 = class427.field6264;
                                                } else {
                                                    var79 = class85.field957[var78];
                                                }
                                                class208 var80 = var75 != -1 ? class193.method1037(76, var75) : null;
                                                if (var79 != null && (var78 == 2047 || class339.method1975(var79.field2034, 0) == var12.field2487)) {
                                                    var76 = var79.field2017.method1912(var12.field2463, true, var80, -1, 0, var12.field2486, class88.field1003, (class208) null, (class395[]) null, 0, var12.field2508, 0, 1024);
                                                }
                                            }
                                        } else if (var12.field2444 != 8 && ~var12.field2444 != -10) {
                                            if (~var75 != 0) {
                                                class208 var81 = class193.method1037(37, var75);
                                                var76 = var12.method1042(var74, class427.field6264.field2017, class88.field1003, 1024, (byte) 95, var12.field2508, var12.field2463, var81, var12.field2486);
                                                if (var76 == null && class398.field5732) {
                                                    class204.method1107(var12, (byte) -97);
                                                }
                                            } else {
                                                var76 = var12.method1042(var74, class427.field6264.field2017, class88.field1003, 1024, (byte) 95, 0, -1, (class208) null, -1);
                                                if (var76 == null && class398.field5732) {
                                                    class204.method1107(var12, (byte) -97);
                                                }
                                            }
                                        } else {
                                            class367 var82 = class182.method979(60, var12.field2599);
                                            class208 var83 = ~var75 == 0 ? null : class193.method1037(45, var75);
                                            if (var82 != null) {
                                                class335 var84 = var12.field2515 ? class427.field6264.field2017 : null;
                                                var76 = var82.method2224(var12.field2463, 1024, var12.field2487, var84, var12.field2508, ~var12.field2444 == -10, (byte) -87, class88.field1003, var12.field2486, var83);
                                            }
                                        }
                                    } else {
                                        class123 var85 = class65.method368(var12.field2507, -114);
                                        if (var85 != null) {
                                            class123 var86 = var85.method655(-11, var12.field2461);
                                            class208 var87 = ~var75 == 0 ? null : class193.method1037(8, var75);
                                            class335 var88 = var12.field2515 ? class427.field6264.field2017 : null;
                                            var76 = var86.method657(var12.field2508, class88.field1003, var12.field2486, 1, var88, false, 1024, var87, var12.field2463);
                                            if (var76 == null) {
                                                class204.method1107(var12, (byte) -102);
                                            } else {
                                                var77 = -var76.method2299() / 2;
                                            }
                                        }
                                    }
                                    if (var76 != null) {
                                        int var89;
                                        if (~var12.field2626 < -1) {
                                            var89 = (var12.field2501 << 9) / var12.field2626;
                                        } else {
                                            var89 = 512;
                                        }
                                        int var90;
                                        if (~var12.field2588 >= -1) {
                                            var90 = 512;
                                        } else {
                                            var90 = (var12.field2460 << 9) / var12.field2588;
                                        }
                                        int var91 = var12.field2501 / 2 - -(var12.field2476 * var89 >> 9) + var14;
                                        int var92 = (var12.field2543 * var90 >> 9) + var12.field2460 / 2 + var15;
                                        field635.method746();
                                        class88.field1003.method1611(field635);
                                        int var93 = class356.field5037[var12.field2479 << 3] * var12.field2598 >> 15;
                                        int var94 = class356.field5025[var12.field2479 << 3] * var12.field2598 >> 15;
                                        class88.field1003.method1589(var91, var92, var89, var90);
                                        class88.field1003.method1583((float) var12.field2605, !var12.field2612 ? (float) var12.field2617 * 1.5F : (float) var12.field2617);
                                        if (class1.field2) {
                                            class88.field1003.method1584();
                                            class88.field1003.method1613();
                                            class88.field1003.method1648(arg3, arg9, arg7, arg5);
                                            class1.field2 = false;
                                        }
                                        if (var12.field2551) {
                                            class88.field1003.method1571(false);
                                        }
                                        if (!var12.field2575) {
                                            class143.field1834.method751(var12.field2583 << 3);
                                            class143.field1834.method742(0, var93, var94);
                                        } else {
                                            class143.field1834.method744(-var12.field2557 << 3);
                                            class143.field1834.method749(var12.field2583 << 3);
                                            class143.field1834.method742(var12.field2548, var77 + var93 + var12.field2448, var12.field2448 + var94);
                                        }
                                        class143.field1834.method743(var12.field2479 << 3);
                                        if (class227.field3095) {
                                            class88.field1003.method1580(var14, var15, var14 - -var12.field2501, var15 - -var12.field2460);
                                        }
                                        if (!var12.field2612) {
                                            var76.method2284(class143.field1834, (class447) null, 1);
                                        } else {
                                            var76.method2303(class143.field1834, (class447) null, var12.field2598, 1);
                                        }
                                        if (class227.field3095) {
                                            class88.field1003.method1648(arg3, arg9, arg7, arg5);
                                        }
                                        if (var12.field2551) {
                                            class88.field1003.method1571(true);
                                        }
                                    }
                                } else {
                                    if (var12.field2492 == 7) {
                                        class298 var95 = var12.method1048(true, class88.field1003);
                                        if (var95 == null) {
                                            if (class398.field5732) {
                                                class204.method1107(var12, (byte) -125);
                                            }
                                            continue;
                                        }
                                        int var96 = 0;
                                        for (int var97 = 0; ~var97 > ~var12.field2450; ++var97) {
                                            for (int var98 = 0; ~var98 > ~var12.field2495; ++var98) {
                                                if (~var12.field2473[var96] < -1) {
                                                    class123 var99 = class65.method368(var12.field2473[var96] - 1, -116);
                                                    String var100;
                                                    if (var99.field1517 != 1 && ~var12.field2489[var96] == -2) {
                                                        var100 = "<col=ff9040>" + var99.field1519 + "</col>";
                                                    } else {
                                                        var100 = "<col=ff9040>" + var99.field1519 + "</col> x" + class289.method1715(var12.field2489[var96], 3272);
                                                    }
                                                    int var101 = (var12.field2602 + 115) * var98 + var14;
                                                    int var102 = var15 - -((12 - -var12.field2538) * var97);
                                                    if (var12.field2560 != 0) {
                                                        if (var12.field2560 != 1) {
                                                            var95.method1755(var102, var100, 0, (int[]) null, var101 + -1 + 115, class88.field999, var12.field2563 | -16777216, var12.field2541 ? -16777216 : -1);
                                                        } else {
                                                            var95.method1758((byte) -56, var102, !var12.field2541 ? -1 : -16777216, -16777216 | var12.field2563, (int[]) null, var100, class88.field999, var101 - -57);
                                                        }
                                                    } else {
                                                        var95.method1752(-16777216 | var12.field2563, class88.field999, var12.field2541 ? -16777216 : -1, var100, var101, -33, var102, (int[]) null);
                                                    }
                                                }
                                                ++var96;
                                            }
                                        }
                                    }
                                    if (var12.field2492 == 8 && class24.field225 == var12 && class203.field2723 == class195.field2631) {
                                        int var103 = 0;
                                        int var104 = 0;
                                        class298 var105 = class105.field1296;
                                        String var106 = var12.field2569;
                                        String var107 = class333.method1896(4, var12, var106);
                                        while (~var107.length() < -1) {
                                            int var115 = var107.indexOf("<br>");
                                            String var116;
                                            if (var115 == -1) {
                                                var116 = var107;
                                                var107 = "";
                                            } else {
                                                var116 = var107.substring(0, var115);
                                                var107 = var107.substring(var115 + 4);
                                            }
                                            int var117 = class383.field5461.method2526(var116, 160);
                                            if (~var117 < ~var103) {
                                                var103 = var117;
                                            }
                                            var104 += class383.field5461.field5874 + 1;
                                        }
                                        var104 += 7;
                                        var103 += 6;
                                        int var108 = -5 - var103 + var14 + var12.field2501;
                                        if (var14 + 5 > var108) {
                                            var108 = var14 + 5;
                                        }
                                        int var109 = var12.field2460 + var15 - -5;
                                        if (var104 + var109 > arg5) {
                                            var109 = -var104 + arg5;
                                        }
                                        if (arg7 < var103 + var108) {
                                            var108 = -var103 + arg7;
                                        }
                                        class88.field1003.method1614(var108, var109, var103, var104, -96, 0);
                                        class88.field1003.method1575(var108, var109, var103, var104, -16777216, 0);
                                        String var110 = var12.field2569;
                                        int var111 = var109 - -2 + class383.field5461.field5874;
                                        String var112 = class333.method1896(4, var12, var110);
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
                                            var105.method1746(-16777216, var114, var108 + 3, (byte) -125, -1, var111);
                                            var111 += class383.field5461.field5874 - -1;
                                        }
                                    }
                                    if (~var12.field2492 == -10) {
                                        int var118;
                                        int var119;
                                        int var120;
                                        int var121;
                                        if (var12.field2513) {
                                            var118 = var15;
                                            var119 = var12.field2460 + var15;
                                            var120 = var12.field2501 + var14;
                                            var121 = var14;
                                        } else {
                                            var120 = var12.field2501 + var14;
                                            var121 = var14;
                                            var119 = var15;
                                            var118 = var12.field2460 + var15;
                                        }
                                        if (~var12.field2601 == -2) {
                                            class88.field1003.method1592(var121, var119, var120, var118, var12.field2563, 0);
                                        } else {
                                            class88.field1003.method1652(var121, var119, var120, var118, var12.field2563, var12.field2601, 0);
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

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)I", line = 1078)
    public final int method335(int arg0) {
        ++field634;
        if (arg0 != 26655) {
            field636 = -62;
        }
        return this.field628 == null ? 0 : this.field628.field3389 * 100 / (this.field628.field3406.length + -this.field630);
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V", line = 1092)
    public static void method336(int arg0) {
        field635 = null;
        if (arg0 != 1743061097) {
            field633 = null;
        }
        field629 = null;
        field633 = null;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)[B", line = 1105)
    public final byte[] method337(int arg0) {
        if (arg0 != -3695) {
            field635 = null;
        }
        ++field640;
        if (!super.field1708 && this.field628.field3389 >= this.field628.field3406.length + -this.field630) {
            return this.field628.field3406;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(CI)B", line = 1124)
    public static final byte method338(char arg0, int arg1) {
        ++field631;
        if (arg1 > -125) {
            return 74;
        } else {
            byte var2;
            if ((arg0 <= 0 || arg0 >= 128) && (arg0 < 160 || ~arg0 < -256)) {
                if (arg0 != 8364) {
                    if (~arg0 != -8219) {
                        if (arg0 != 402) {
                            if (arg0 == 8222) {
                                var2 = -124;
                            } else if (~arg0 == -8231) {
                                var2 = -123;
                            } else if (~arg0 == -8225) {
                                var2 = -122;
                            } else if (~arg0 == -8226) {
                                var2 = -121;
                            } else if (arg0 == 710) {
                                var2 = -120;
                            } else if (arg0 != 8240) {
                                if (arg0 != 352) {
                                    if (arg0 == 8249) {
                                        var2 = -117;
                                    } else if (~arg0 == -339) {
                                        var2 = -116;
                                    } else if (arg0 != 381) {
                                        if (~arg0 == -8217) {
                                            var2 = -111;
                                        } else if (arg0 != 8217) {
                                            if (arg0 == 8220) {
                                                var2 = -109;
                                            } else if (arg0 == 8221) {
                                                var2 = -108;
                                            } else if (~arg0 != -8227) {
                                                if (arg0 != 8211) {
                                                    if (~arg0 != -8213) {
                                                        if (~arg0 == -733) {
                                                            var2 = -104;
                                                        } else if (~arg0 == -8483) {
                                                            var2 = -103;
                                                        } else if (~arg0 == -354) {
                                                            var2 = -102;
                                                        } else if (~arg0 != -8251) {
                                                            if (~arg0 == -340) {
                                                                var2 = -100;
                                                            } else if (arg0 != 382) {
                                                                if (~arg0 == -377) {
                                                                    var2 = -97;
                                                                } else {
                                                                    var2 = 63;
                                                                }
                                                            } else {
                                                                var2 = -98;
                                                            }
                                                        } else {
                                                            var2 = -101;
                                                        }
                                                    } else {
                                                        var2 = -105;
                                                    }
                                                } else {
                                                    var2 = -106;
                                                }
                                            } else {
                                                var2 = -107;
                                            }
                                        } else {
                                            var2 = -110;
                                        }
                                    } else {
                                        var2 = -114;
                                    }
                                } else {
                                    var2 = -118;
                                }
                            } else {
                                var2 = -119;
                            }
                        } else {
                            var2 = -125;
                        }
                    } else {
                        var2 = -126;
                    }
                } else {
                    var2 = -128;
                }
            } else {
                var2 = (byte) arg0;
            }
            return var2;
        }
    }
}
