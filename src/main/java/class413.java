import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class413 extends class56 {

    @OriginalMember(owner = "client!pp", name = "M", descriptor = "I")
    private int field5397;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
    public static int field5388 = 0;

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "Z")
    public static boolean field5389 = false;

    @OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
    public static int field5394 = 0;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!pp", name = "H", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!pp", name = "K", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!pp", name = "N", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!pp", name = "O", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(I)V", line = 5)
    public class413(int arg0) {
        super(0, true);
        this.field5397 = 4096;
        this.field5397 = arg0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BIZI)V", line = 16)
    public static final void method2460(byte arg0, int arg1, boolean arg2, int arg3) {
        ++field5399;
        if (class444.field5950.method2121(103, (long) arg1) == null) {
            if (class620.field8389) {
                class318 var4 = new class318(arg1, new class248(4096, class466.field6519, arg1), arg3, arg2);
                var4.field3917.method2248(class433.field5714[class770.field10592], 111);
                class444.field5950.method2112(var4, (byte) 6, (long) arg1);
            } else {
                class713.method4036(arg1, -1, arg2);
            }
        }
        int var5 = 11 % ((arg0 - 57) / 57);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ[Lkq;IIIIIZII)V", line = 40)
    public static final void method2461(int arg0, boolean arg1, class620[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        class363.field4526.method556(arg6, arg9, arg3, arg4);
        ++field5392;
        for (int var11 = 0; var11 < arg2.length; ++var11) {
            class620 var12 = arg2[var11];
            if (var12 != null && (var12.field8400 == arg7 || arg7 == -1412584499 && class634.field8654 == var12)) {
                int var13 = var12.field8383 - -arg5;
                int var14 = var12.field8492 + arg10;
                int var15 = var12.field8506 + var13 + 1;
                int var16 = var14 - -1 + var12.field8416;
                int var17;
                if (arg0 != -1) {
                    var17 = arg0;
                } else {
                    class483.field6743[class104.field1332].setBounds(var12.field8383 + arg5, var12.field8492 - -arg10, var12.field8506, var12.field8416);
                    var17 = class104.field1332++;
                }
                var12.field8510 = class228.field2707;
                var12.field8436 = var17;
                if (!client.method1891(var12)) {
                    if (~var12.field8351 != -1) {
                        class671.method3769(var12, (byte) -67);
                    }
                    int var18 = var12.field8383 + arg5;
                    int var19 = var12.field8492 + arg10;
                    int var20 = 0;
                    int var21 = 0;
                    if (class769.field10572) {
                        var20 = class793.method4373((byte) 49);
                        var21 = class719.method4070((byte) 114);
                    }
                    int var22 = var12.field8491;
                    if (class687.field9373 && (client.method1882(var12).field5126 != 0 || ~var12.field8371 == -1) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class634.field8654 == var12) {
                        if (~arg7 != 1412584498 && (~class704.field9906 == ~var12.field8453 || ~class53.field715 == ~var12.field8453)) {
                            class213.field2515 = arg2;
                            class272.field3205 = arg5;
                            class75.field1038 = arg10;
                            continue;
                        }
                        if (class18.field343 && class410.field5373) {
                            int var23 = var20 + class738.field10291.method109(124);
                            int var24 = var21 + class738.field10291.method117(arg1);
                            int var25 = var23 - class140.field1756;
                            int var26 = var24 - class209.field2481;
                            if (~class90.field1206 < ~var25) {
                                var25 = class90.field1206;
                            }
                            if (class585.field7977 > var26) {
                                var26 = class585.field7977;
                            }
                            if (class90.field1206 + class395.field5122.field8506 < var25 - -var12.field8506) {
                                var25 = -var12.field8506 + class90.field1206 + class395.field5122.field8506;
                            }
                            if (var12.field8416 + var26 > class585.field7977 - -class395.field5122.field8416) {
                                var26 = -var12.field8416 + class395.field5122.field8416 + class585.field7977;
                            }
                            var18 = var25;
                            var19 = var26;
                        }
                        if (~class53.field715 == ~var12.field8453) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field8371 != 2) {
                        int var27 = var18 - -var12.field8506;
                        int var28 = var12.field8416 + var19;
                        var29 = ~var19 >= ~arg9 ? arg9 : var19;
                        if (var12.field8371 == 9) {
                            ++var28;
                            ++var27;
                        }
                        var30 = ~var18 < ~arg6 ? var18 : arg6;
                        var31 = arg4 > var28 ? var28 : arg4;
                        var32 = ~var27 <= ~arg3 ? arg3 : var27;
                    } else {
                        var31 = arg4;
                        var30 = arg6;
                        var32 = arg3;
                        var29 = arg9;
                    }
                    if (~var32 < ~var30 && var29 < var31) {
                        if (~var12.field8351 != -1) {
                            if (class776.field10717 == var12.field8351 || class146.field1831 == var12.field8351) {
                                class453.method2748(var18, var19, true, var12);
                                if (!class769.field10572) {
                                    class159.method1116(var18, var19, var12.field8416, var12.field8506, (byte) 127, ~class146.field1831 == ~var12.field8351);
                                    class363.field4526.method556(arg6, arg9, arg3, arg4);
                                }
                                class255.field2977[var17] = true;
                                continue;
                            }
                            if (class223.field2607 == var12.field8351) {
                                if (var12.method3531((byte) 60, class363.field4526) != null) {
                                    class580.method3339((byte) -58);
                                    class328.method1949(-124, class363.field4526, var19, var12, var18);
                                    class417.field5443[var17] = true;
                                    class363.field4526.method556(arg6, arg9, arg3, arg4);
                                    if (class769.field10572) {
                                        if (!arg8) {
                                            class158.method1109(var15, !arg1, var16, var14, var13);
                                        } else {
                                            class326.method1945(var14, var15, var13, var16, false);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class555.field7728 == var12.field8351) {
                                class656.method3702(var18, class363.field4526, var12, 125, var19);
                                continue;
                            }
                            if (class781.field10784 == var12.field8351) {
                                class260.method1559(class363.field4526, var19, (byte) 45, var18, var12, var12.field8340 % 64);
                                continue;
                            }
                            if (class307.field3800 == var12.field8351) {
                                if (var12.method3531((byte) 17, class363.field4526) != null) {
                                    class319.method1900(var12, var19, 59, var18);
                                    class417.field5443[var17] = true;
                                    class363.field4526.method556(arg6, arg9, arg3, arg4);
                                    if (class769.field10572) {
                                        if (arg8) {
                                            class326.method1945(var14, var15, var13, var16, false);
                                        } else {
                                            class158.method1109(var15, false, var16, var14, var13);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class577.field7873 == var12.field8351) {
                                class594.method3403(var12.field8506, var18, var19, (byte) -57, class363.field4526, var12.field8416, class323.field4014);
                                class255.field2977[var17] = true;
                                class363.field4526.method556(arg6, arg9, arg3, arg4);
                                continue;
                            }
                            if (~class529.field7480 == ~var12.field8351) {
                                class233.method1431(var19, -90, var18, class363.field4526, var12.field8506, var12.field8416);
                                class255.field2977[var17] = true;
                                class363.field4526.method556(arg6, arg9, arg3, arg4);
                                continue;
                            }
                            if (~class790.field10884 == ~var12.field8351) {
                                if (!class23.field368 && !class438.field5769) {
                                    continue;
                                }
                                int var33 = var12.field8506 + var18;
                                int var34 = var19 + 15;
                                if (class769.field10572) {
                                    if (!arg8) {
                                        class158.method1109(var15, false, var16, var14, var13);
                                    } else {
                                        class326.method1945(var14, var15, var13, var16, false);
                                    }
                                }
                                if (class23.field368) {
                                    int var35 = -256;
                                    if (class496.field6902 < 20) {
                                        var35 = -65536;
                                    }
                                    class708.field9946.method660("Fps:" + class496.field6902, var34, var33, var35, -1, -88);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (~var37 < -98305) {
                                        var38 = -65536;
                                        if (class66.field909) {
                                            class47.method422(!arg1);
                                            for (int var39 = 0; var39 < 10; ++var39) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (~var37 < -65537) {
                                                class619.method3512("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 4, false);
                                            }
                                        }
                                    }
                                    class708.field9946.method660("Mem:" + var37 + "k", var34, var33, var38, -1, -74);
                                    var34 += 15;
                                    class708.field9946.method660("In:" + class54.field722 + "B/s Out:" + class381.field4828 + "B/s", var34, var33, -256, -1, -71);
                                    var34 += 15;
                                    int var40 = class363.field4526.method616() / 1024;
                                    class708.field9946.method660("Offheap:" + var40 + "k", var34, var33, ~var40 >= -65537 ? -256 : -65536, -1, -102);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; ++var44) {
                                        if (class267.field3150[var44] != null) {
                                            var41 += class267.field3150[var44].method2233(false);
                                            var42 += class267.field3150[var44].method2229(false);
                                            var43 += class267.field3150[var44].method2231(true);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class41.method342((long) var46, true, 0, (byte) 111, 2) + "% (" + var45 + "%)";
                                    class145.field1820.method660(var47, var34, var33, -256, -1, -78);
                                    var34 += 12;
                                }
                                if (class254.field2962 > 0) {
                                    class145.field1820.method660("Particles: " + class224.field2631 + " / " + class254.field2962, var34, var33, -256, -1, -95);
                                }
                                var34 += 12;
                                if (class438.field5769) {
                                    class145.field1820.method660("Polys: " + class363.field4526.method81() + " Models: " + class363.field4526.method562(), var34, var33, -256, -1, -94);
                                    var34 += 12;
                                    class145.field1820.method660("Ls: " + class491.field6824 + " La: " + class163.field1994 + " NPC: " + class384.field4903 + " Pl: " + class617.field8304, var34, var33, -256, -1, -46);
                                    class686.method3840((byte) -126);
                                    var34 += 12;
                                }
                                class255.field2977[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field8371 == 0) {
                            if (~class371.field4658 == ~var12.field8351 && class363.field4526.method54()) {
                                class363.field4526.method40(var18, var19, var12.field8506, var12.field8416);
                            }
                            method2461(var17, true, arg2, var32, var31, var18 - var12.field8496, var30, var12.field8515, arg8, var29, -var12.field8392 + var19);
                            if (var12.field8343 != null) {
                                method2461(var17, true, var12.field8343, var32, var31, -var12.field8496 + var18, var30, var12.field8515, arg8, var29, -var12.field8392 + var19);
                            }
                            class52 var48 = (class52) class728.field10205.method2121(122, (long) var12.field8515);
                            if (var48 != null) {
                                class368.method2149(var32, var29, -1, var18, var30, var17, var31, var48.field713, var19);
                            }
                            if (~class371.field4658 == ~var12.field8351 && class363.field4526.method54()) {
                                class363.field4526.method32();
                            }
                            class363.field4526.method556(arg6, arg9, arg3, arg4);
                        }
                        if (class704.field9908[var17] || ~class710.field9966 < -2) {
                            if (var12.field8371 == 3) {
                                if (var22 != 0) {
                                    if (var12.field8469) {
                                        class363.field4526.method645(var18, var19, var12.field8506, var12.field8416, 16777215 & var12.field8340 | -(var22 & 255) + 255 << 24, 1);
                                    } else {
                                        class363.field4526.method633(var18, var19, var12.field8506, var12.field8416, 255 - (var22 & 255) << 24 | 16777215 & var12.field8340, 1);
                                    }
                                } else if (var12.field8469) {
                                    class363.field4526.method645(var18, var19, var12.field8506, var12.field8416, var12.field8340, 0);
                                } else {
                                    class363.field4526.method633(var18, var19, var12.field8506, var12.field8416, var12.field8340, 0);
                                }
                                if (class769.field10572) {
                                    if (!arg8) {
                                        class158.method1109(var15, false, var16, var14, var13);
                                    } else {
                                        class326.method1945(var14, var15, var13, var16, false);
                                    }
                                }
                            } else if (~var12.field8371 == -5) {
                                class67 var49 = var12.method3523((byte) 110, class363.field4526);
                                if (var49 == null) {
                                    if (class624.field8566) {
                                        class576.method3330(var12, -1);
                                    }
                                } else {
                                    int var50 = var12.field8340;
                                    String var51 = var12.field8464;
                                    if (var12.field8438 != -1) {
                                        class340 var52 = class121.field1555.method2882(var12.field8438, -22087);
                                        var51 = var52.field4222;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field4259 == 1 || ~var12.field8499 != -2) && ~var12.field8499 != 0) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class191.method1253((byte) 70, var12.field8499);
                                        }
                                    }
                                    if (~var12.field8344 != 0) {
                                        var51 = class461.method2782(var12.field8344, (byte) 39);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class683.field9354 == var12) {
                                        var51 = class637.field8706.method3584(class770.field10592, true);
                                        var50 = var12.field8340;
                                    }
                                    if (class438.field5771) {
                                        class363.field4526.method607(var18, var19, var12.field8506 + var18, var12.field8416 + var19);
                                    }
                                    var49.method666(class388.field5008, -(var22 & 255) + 255 << 24 | var50, var18, var51, 0, var12.field8402, var19, var12.field8432, 0, var12.field8406, var12.field8416, var12.field8407, !var12.field8472 ? -1 : -(255 & var22) + 255 << 24, (int[]) null, (byte) -40, (class513) null, var12.field8506);
                                    if (class438.field5771) {
                                        class363.field4526.method556(arg6, arg9, arg3, arg4);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (class438.field5771) {
                                            if (class769.field10572) {
                                                if (!arg8) {
                                                    class158.method1109(var15, false, var16, var14, var13);
                                                } else {
                                                    class326.method1945(var14, var15, var13, var16, !arg1);
                                                }
                                            }
                                        } else {
                                            class307 var53 = class109.method879(var12.field8398, -24247, class363.field4526);
                                            int var54 = var53.method1815(false, class388.field5008, var51, var12.field8506);
                                            int var55 = var53.method1816(class388.field5008, var12.field8402, var12.field8506, (byte) 116, var51);
                                            if (class769.field10572) {
                                                if (arg8) {
                                                    class326.method1945(var19, var18 + var54, var18, var19 + var55, false);
                                                } else {
                                                    class158.method1109(var18 - -var54, false, var19 + var55, var19, var18);
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var12.field8371 == -6) {
                                if (var12.field8428 < 0) {
                                    class312 var56;
                                    if (~var12.field8438 == 0) {
                                        if (~var12.field8344 != 0) {
                                            var56 = class171.method1165(var12.field8344, class363.field4526, -66);
                                        } else {
                                            var56 = var12.method3513(class363.field4526, (byte) 108);
                                        }
                                    } else {
                                        class316 var57 = var12.field8476 ? class300.field3596.field7387 : null;
                                        var56 = class121.field1555.method2879(class363.field4526, var12.field8499, var12.field8480 | -16777216, var12.field8463, var12.field8502, var57, var12.field8438, (byte) 122);
                                    }
                                    if (var56 == null) {
                                        if (class624.field8566) {
                                            class576.method3330(var12, -1);
                                        }
                                    } else {
                                        int var58 = var56.method1634();
                                        int var59 = var56.method1636();
                                        int var60 = (~var12.field8340 == -1 ? 16777215 : var12.field8340 & 16777215) | 255 - (var22 & 255) << 24;
                                        if (!var12.field8487) {
                                            if (var12.field8340 == 0 && ~var22 == -1) {
                                                if (var12.field8466 == 0) {
                                                    if (var12.field8506 == var58 && ~var12.field8416 == ~var59) {
                                                        var56.method1838(var18, var19);
                                                    } else {
                                                        var56.method1837(var18, var19, var12.field8506, var12.field8416);
                                                    }
                                                } else {
                                                    var56.method1841((float) var12.field8506 / 2.0F + (float) var18, (float) var12.field8416 / 2.0F + (float) var19, var12.field8506 * 4096 / var58, var12.field8466);
                                                }
                                            } else if (var12.field8466 != 0) {
                                                var56.method1846((float) var12.field8506 / 2.0F + (float) var18, (float) var12.field8416 / 2.0F + (float) var19, var12.field8506 * 4096 / var58, var12.field8466, 0, var60, 1);
                                            } else if (~var12.field8506 == ~var58 && ~var12.field8416 == ~var59) {
                                                var56.method240(var18, var19, 0, var60, 1);
                                            } else {
                                                var56.method1843(var18, var19, var12.field8506, var12.field8416, 0, var60, 1);
                                            }
                                        } else {
                                            class363.field4526.method607(var18, var19, var12.field8506 + var18, var19 - -var12.field8416);
                                            if (~var12.field8466 == -1) {
                                                if (var12.field8340 == 0 && var22 == 0) {
                                                    var56.method1844(var18, var19, var12.field8506, var12.field8416);
                                                } else {
                                                    var56.method1635(var18, var19, var12.field8506, var12.field8416, 0, var60, 1);
                                                }
                                            } else {
                                                int var61 = (var58 + -1 + var12.field8506) / var58;
                                                int var62 = (var12.field8416 + -1 + var59) / var59;
                                                for (int var63 = 0; ~var61 < ~var63; ++var63) {
                                                    for (int var64 = 0; var62 > var64; ++var64) {
                                                        if (~var12.field8340 == -1) {
                                                            var56.method1841((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field8466);
                                                        } else {
                                                            var56.method1846((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field8466, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            }
                                            class363.field4526.method556(arg6, arg9, arg3, arg4);
                                        }
                                    }
                                } else {
                                    var12.method3533(class153.field1907, class305.field3675, -121).method2875(var12.field8506, 0, var12.field8447 << 3, var18, var12.field8475 << 3, var12.field8416, var19, class363.field4526, -1, 0);
                                }
                                if (class769.field10572) {
                                    if (!arg8) {
                                        class158.method1109(var15, false, var16, var14, var13);
                                    } else {
                                        class326.method1945(var14, var15, var13, var16, false);
                                    }
                                }
                            } else if (~var12.field8371 != -7) {
                                if (~var12.field8371 == -10) {
                                    int var85;
                                    int var86;
                                    int var87;
                                    int var88;
                                    if (var12.field8349) {
                                        var85 = var19;
                                        var86 = var12.field8416 + var19;
                                        var87 = var18;
                                        var88 = var12.field8506 + var18;
                                    } else {
                                        var88 = var12.field8506 + var18;
                                        var87 = var18;
                                        var86 = var19;
                                        var85 = var12.field8416 + var19;
                                    }
                                    if (var12.field8448 == 1) {
                                        class363.field4526.method592(var87, var86, var88, var85, var12.field8340, 0);
                                    } else {
                                        class363.field4526.method588(var87, var86, var88, var85, var12.field8340, var12.field8448, 0);
                                    }
                                    if (class769.field10572) {
                                        if (!arg8) {
                                            class158.method1109(var15, false, var16, var14, var13);
                                        } else {
                                            class326.method1945(var14, var15, var13, var16, !arg1);
                                        }
                                    }
                                }
                            } else {
                                class243.method1469(-24978);
                                Object var65 = null;
                                class498 var66 = null;
                                int var67 = 0;
                                if (var12.field8438 == -1) {
                                    if (var12.field8512 == 5) {
                                        int var68 = var12.field8354;
                                        if (var68 >= 0 && ~var68 > -2049) {
                                            class521 var69 = class61.field825[var68];
                                            class582 var70 = ~var12.field8337 == 0 ? null : class362.field4504.method3600(-105, var12.field8337);
                                            if (var69 != null && (class782.field10790 == var68 || class569.method3289(var69.field7399, (byte) -102) == var12.field8401)) {
                                                var66 = var69.field7387.method1865(2048, class363.field4526, class362.field4504, var12.field8404, class444.field5956, -1, var12.field8460, (class582) null, 0, (int[]) null, class2.field30, 0, class121.field1555, (byte) -14, 0, var70, (class756[]) null, class692.field9423, var12.field8362, class249.field2932, true);
                                            }
                                        }
                                    } else if (~var12.field8512 != -9 && var12.field8512 != 9) {
                                        if (~var12.field8337 == 0) {
                                            var66 = var12.method3516(-1, 2048, (class782) var65, -1, (class582) null, class2.field30, class121.field1555, 91, class249.field2932, class362.field4504, class363.field4526, class692.field9423, class444.field5956, 0, class300.field3596.field7387);
                                            if (var66 == null && class624.field8566) {
                                                class576.method3330(var12, -1);
                                            }
                                        } else {
                                            class582 var71 = class362.field4504.method3600(-104, var12.field8337);
                                            var66 = var12.method3516(var12.field8460, 2048, (class782) var65, var12.field8404, var71, class2.field30, class121.field1555, 97, class249.field2932, class362.field4504, class363.field4526, class692.field9423, class444.field5956, var12.field8362, class300.field3596.field7387);
                                            if (var66 == null && class624.field8566) {
                                                class576.method3330(var12, -1);
                                            }
                                        }
                                    } else {
                                        class430 var72 = class105.method861(var12.field8354, Integer.MIN_VALUE, false);
                                        class582 var73 = ~var12.field8337 != 0 ? class362.field4504.method3600(-128, var12.field8337) : null;
                                        if (var72 != null) {
                                            class316 var74 = !var12.field8476 ? null : class300.field3596.field7387;
                                            var66 = var72.method2551(var12.field8362, ~var12.field8512 == -10, var12.field8401, var12.field8460, class363.field4526, 1427926600, var73, var12.field8404, var74, 2048);
                                        }
                                    }
                                } else {
                                    class340 var75 = class121.field1555.method2882(var12.field8438, -22087);
                                    if (var75 != null) {
                                        class340 var76 = var75.method2024((byte) -122, var12.field8499);
                                        class582 var77 = var12.field8337 != -1 ? class362.field4504.method3600(-114, var12.field8337) : null;
                                        class316 var78 = var12.field8476 ? class300.field3596.field7387 : null;
                                        var66 = var76.method2006(class363.field4526, var12.field8404, 106, 1, var78, var12.field8362, var12.field8460, var77, 2048);
                                        if (var66 != null) {
                                            var67 = -var66.method404() >> 1;
                                        } else {
                                            class576.method3330(var12, -1);
                                        }
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field8346 > 0) {
                                        var79 = (var12.field8506 << 9) / var12.field8346;
                                    } else {
                                        var79 = 512;
                                    }
                                    int var80;
                                    if (~var12.field8421 < -1) {
                                        var80 = (var12.field8416 << 9) / var12.field8421;
                                    } else {
                                        var80 = 512;
                                    }
                                    int var81 = var12.field8506 / 2 + var18;
                                    int var82 = var19 - -(var12.field8416 / 2);
                                    if (!var12.field8508) {
                                        var82 += var12.field8339 * var80 >> 9;
                                        var81 += var12.field8443 * var79 >> 9;
                                    }
                                    class93.field1234.method128();
                                    class363.field4526.method628(class93.field1234);
                                    class363.field4526.method565(var81, var82, var79, var80);
                                    class363.field4526.method6();
                                    if (var12.field8442) {
                                        class363.field4526.method635(false);
                                    }
                                    if (!var12.field8508) {
                                        int var83 = (var12.field8363 << 2) * class789.field10868[var12.field8382 << 3] >> 14;
                                        int var84 = (var12.field8363 << 2) * class789.field10864[var12.field8382 << 3] >> 14;
                                        class203.field2438.method122(-var12.field8355 << 3);
                                        class203.field2438.method125(var12.field8446 << 3);
                                        class203.field2438.method131(var12.field8397 << 2, (var12.field8478 << 2) + var83 + var67, (var12.field8478 << 2) + var84);
                                        class203.field2438.method123(var12.field8382 << 3);
                                    } else {
                                        class203.field2438.method138(var12.field8382);
                                        class203.field2438.method125(var12.field8446);
                                        class203.field2438.method126(var12.field8355);
                                        class203.field2438.method131(var12.field8443, var12.field8339, var12.field8516);
                                    }
                                    var12.method3517(class228.field2707, var66, -8, class203.field2438, class363.field4526);
                                    if (class438.field5771) {
                                        class363.field4526.method607(var18, var19, var18 - -var12.field8506, var19 - -var12.field8416);
                                    }
                                    if (var12.field8508) {
                                        if (var12.field8426) {
                                            var66.method388(class203.field2438, (class265) null, var12.field8363, 1);
                                        } else {
                                            var66.method355(class203.field2438, (class265) null, 1);
                                            if (var12.field8430 != null) {
                                                class363.field4526.method582(var12.field8430.method4255());
                                            }
                                        }
                                    } else if (var12.field8426) {
                                        var66.method388(class203.field2438, (class265) null, var12.field8363 << 2, 1);
                                    } else {
                                        var66.method355(class203.field2438, (class265) null, 1);
                                        if (var12.field8430 != null) {
                                            class363.field4526.method582(var12.field8430.method4255());
                                        }
                                    }
                                    if (class438.field5771) {
                                        class363.field4526.method556(arg6, arg9, arg3, arg4);
                                    }
                                    if (var12.field8442) {
                                        class363.field4526.method635(true);
                                    }
                                }
                                if (class769.field10572) {
                                    if (!arg8) {
                                        class158.method1109(var15, false, var16, var14, var13);
                                    } else {
                                        class326.method1945(var14, var15, var13, var16, false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg1) {
            method2464((class379) null, (class379) null, -120);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BILes;)V", line = 900)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (arg1 == 0) {
            this.field5397 = (arg2.method2396((byte) 101) << 12) / 255;
        }
        if (arg0 <= -44) {
            ++field5393;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)V", line = 930)
    public static final void method2462(boolean arg0, int arg1) {
        if (arg1 != 19674) {
            method2464((class379) null, (class379) null, 27);
        }
        class135.method998(class705.field9921, class701.field9880, arg0, -93, class131.field1615);
        ++field5398;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIBLbt;)Lbj;", line = 945)
    public static final class257 method2463(int arg0, int arg1, byte arg2, class48 arg3) {
        ++field5391;
        class403 var4 = new class403(arg3.method437(arg0, (byte) 115, arg1));
        class257 var5 = new class257(arg1, var4.method2384(arg2 + -6428), var4.method2384(arg2 + -6428), var4.method2381((byte) 121), var4.method2381((byte) 89), var4.method2396((byte) -81) == 1, var4.method2396((byte) 24), var4.method2396((byte) -108));
        int var6 = var4.method2396((byte) 107);
        if (arg2 != -7) {
            method2460((byte) 52, -54, true, -110);
        }
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            var5.field3047.method2732(new class367(var4.method2396((byte) 42), var4.method2390((byte) 62), var4.method2390((byte) -120), var4.method2390((byte) -108), var4.method2390((byte) 27), var4.method2390((byte) 28), var4.method2390((byte) 26), var4.method2390((byte) -109), var4.method2390((byte) 87)), 21939);
        }
        var5.method1548(116);
        return var5;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Loq;Loq;I)V", line = 974)
    public static final void method2464(class379 arg0, class379 arg1, int arg2) {
        if (arg1.field4808 != null) {
            arg1.method2219(13630);
        }
        if (arg2 == 4096) {
            ++field5395;
            arg1.field4806 = arg0;
            arg1.field4808 = arg0.field4808;
            arg1.field4808.field4806 = arg1;
            arg1.field4806.field4808 = arg1;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(II)[I", line = 997)
    public final int[] method145(int arg0, int arg1) {
        ++field5390;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            field5394 = 125;
        }
        if (super.field752.field2441) {
            class211.method1333(var3, 0, class642.field8759, this.field5397);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V", line = 1027)
    public class413() {
        this(4096);
    }
}
