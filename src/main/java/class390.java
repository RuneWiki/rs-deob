import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class390 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lhb;")
    public static class629 field5968 = new class629(12, 7);

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Z")
    public static boolean field5969 = false;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method2512(int arg0) {
        field5968 = null;
        if (arg0 < 48) {
            field5968 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIII[Lqf;)V")
    public static final void method2513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class593[] arg9) {
        field5970++;
        class413.field6264.method368(arg4, arg5, arg6, arg7);
        if (arg1 != 1) {
            field5969 = true;
        }
        for (int var10 = 0; var10 < arg9.length; var10++) {
            class593 var11 = arg9[var10];
            if (var11 != null && (var11.field8533 == arg3 || arg3 == -1412584499 && class39.field425 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class288.field3985[class384.field5785].setBounds(var11.field8586 + arg8, var11.field8637 - -arg2, var11.field8570, var11.field8518);
                    var12 = class384.field5785++;
                } else {
                    var12 = arg0;
                }
                var11.field8576 = var12;
                var11.field8612 = class287.field3982;
                if (!client.method1684(var11)) {
                    if (var11.field8603 != 0) {
                        class126.method773(var11, (byte) 98);
                    }
                    int var13 = var11.field8586 + arg8;
                    int var14 = var11.field8637 + arg2;
                    int var15 = var11.field8621;
                    if (class541.field7761 && (client.method1682(var11).field3798 != 0 || var11.field8507 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class39.field425 == var11) {
                        if (arg3 != -1412584499 && (class349.field5004 == var11.field8539 || class428.field6355 == var11.field8539)) {
                            class414.field6281 = arg9;
                            class477.field7039 = arg2;
                            class547.field7836 = arg8;
                            continue;
                        }
                        if (class538.field7748 && class34.field386) {
                            int var16 = class32.field369.method778(6);
                            int var17 = class32.field369.method777((byte) 60);
                            int var18 = var16 - class556.field7893;
                            int var19 = var17 - class87.field994;
                            if (class454.field6781 > var18) {
                                var18 = class454.field6781;
                            }
                            if (class332.field4782 > var19) {
                                var19 = class332.field4782;
                            }
                            if (class454.field6781 + class273.field3821.field8570 < var11.field8570 + var18) {
                                var18 = class454.field6781 + class273.field3821.field8570 - var11.field8570;
                            }
                            var13 = var18;
                            if (var11.field8518 + var19 > class332.field4782 + class273.field3821.field8518) {
                                var19 = class332.field4782 + class273.field3821.field8518 - var11.field8518;
                            }
                            var14 = var19;
                        }
                        if (class428.field6355 == var11.field8539) {
                            var15 = 128;
                        }
                    }
                    int var22;
                    int var23;
                    int var24;
                    int var25;
                    if (var11.field8507 == 2) {
                        var23 = arg4;
                        var22 = arg5;
                        var24 = arg7;
                        var25 = arg6;
                    } else {
                        int var20 = var13 + var11.field8570;
                        int var21 = var14 + var11.field8518;
                        var22 = arg5 >= var14 ? arg5 : var14;
                        var23 = var13 <= arg4 ? arg4 : var13;
                        if (var11.field8507 == 9) {
                            var21++;
                            var20++;
                        }
                        var24 = arg7 <= var21 ? arg7 : var21;
                        var25 = arg6 <= var20 ? arg6 : var20;
                    }
                    if (var23 < var25 && var22 < var24) {
                        if (var11.field8603 != 0) {
                            if (class110.field1355 == var11.field8603 || class276.field3852 == var11.field8603) {
                                class527.method3098(var11.field8570, (byte) 114, var14, class276.field3852 == var11.field8603, var11.field8518, var13);
                                class136.field1692[var12] = true;
                                class413.field6264.method368(arg4, arg5, arg6, arg7);
                                continue;
                            }
                            if (class281.field3923 == var11.field8603) {
                                if (var11.method3456(class413.field6264, true) != null) {
                                    class453.method2798((byte) 98);
                                    class472.method2892(var13, var11, class413.field6264, var14, 128);
                                    class570.field8224[var12] = true;
                                    class413.field6264.method368(arg4, arg5, arg6, arg7);
                                }
                                continue;
                            }
                            if (class418.field6294 == var11.field8603) {
                                if (var11.method3456(class413.field6264, true) != null) {
                                    class544.method3157(var11, true, var14, var13);
                                    class570.field8224[var12] = true;
                                    class413.field6264.method368(arg4, arg5, arg6, arg7);
                                }
                                continue;
                            }
                            if (class301.field4431 == var11.field8603) {
                                class222.method1448(21752, var11.field8518, var11.field8570, class413.field6264, class206.field2762, var13, var14);
                                class136.field1692[var12] = true;
                                class413.field6264.method368(arg4, arg5, arg6, arg7);
                                continue;
                            }
                            if (class56.field656 == var11.field8603) {
                                class332.method2160(arg1 ^ 0xFFFF999A, var11.field8518, var14, class413.field6264, var11.field8570, var13);
                                class136.field1692[var12] = true;
                                class413.field6264.method368(arg4, arg5, arg6, arg7);
                                continue;
                            }
                            if (class444.field6650 == var11.field8603) {
                                if (!class517.field7528 && !class99.field1160) {
                                    continue;
                                }
                                int var26 = var11.field8570 + var13;
                                int var27 = var14 + 15;
                                if (class517.field7528) {
                                    int var28 = -256;
                                    if (class439.field6545 < 20) {
                                        var28 = -65536;
                                    }
                                    class445.field6665.method1042(var28, var26, -1, "Fps:" + class439.field6545, 124, var27);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                        if (class622.field9000) {
                                            class66.method456(arg1 - 121);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class163.method945(true, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 4);
                                            }
                                        }
                                    }
                                    class445.field6665.method1042(var31, var26, -1, "Mem:" + var30 + "k", arg1 + 119, var27);
                                    var27 += 15;
                                    class445.field6665.method1042(-256, var26, -1, "In:" + class427.field6352 + "B/s Out:" + class168.field2056 + "B/s", 107, var27);
                                    var27 += 15;
                                    int var33 = class413.field6264.method381() / 1024;
                                    class445.field6665.method1042(var33 <= 65536 ? -256 : -65536, var26, -1, "Offheap:" + var33 + "k", 108, var27);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 32; var37++) {
                                        var34 += class126.field1561[var37].method3322(arg1);
                                        var35 += class126.field1561[var37].method3325(false);
                                        var36 += class126.field1561[var37].method3324(0);
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class471.method2886(true, (long) var39, 0, (byte) -125, 2) + "% (" + var38 + "%)";
                                    class280.field3903.method1042(-256, var26, -1, var40, 109, var27);
                                    var27 += 12;
                                }
                                if (class73.field779 > 0) {
                                    class280.field3903.method1042(-256, var26, -1, "Particles: " + class403.field6090 + " / " + class73.field779, 110, var27);
                                }
                                var27 += 12;
                                if (class99.field1160) {
                                    class280.field3903.method1042(-256, var26, -1, "Polys: " + class413.field6264.method375() + " Models: " + class413.field6264.method374(), 114, var27);
                                    var27 += 12;
                                    class280.field3903.method1042(-256, var26, -1, "Ls: " + class518.field7541 + " La: " + class22.field231 + " NPC: " + class20.field200 + " Pl: " + class612.field8902, arg1 ^ 0x6E, var27);
                                    var27 += 12;
                                    class156.method906(0);
                                }
                                class136.field1692[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field8507 == 0) {
                            if (class323.field4666 == var11.field8603 && class413.field6264.method359()) {
                                class413.field6264.method332(var13, var14, var11.field8570, var11.field8518);
                            }
                            method2513(var12, 1, var14 - var11.field8662, var11.field8579, var23, var22, var25, var24, var13 - var11.field8598, arg9);
                            if (var11.field8512 != null) {
                                method2513(var12, 1, var14 - var11.field8662, var11.field8579, var23, var22, var25, var24, var13 - var11.field8598, var11.field8512);
                            }
                            class563 var41 = (class563) class234.field3309.method524((byte) 124, (long) var11.field8579);
                            if (var41 != null) {
                                class266.method1751(var24, var23, var41.field8022, var13, var25, var12, var22, var14, -6102);
                            }
                            if (class323.field4666 == var11.field8603 && class413.field6264.method359()) {
                                class413.field6264.method350();
                                class508.field7385 = true;
                            }
                            class413.field6264.method368(arg4, arg5, arg6, arg7);
                        }
                        if (class320.field4635[var12] || class344.field4923 > 1) {
                            if (var11.field8507 == 3) {
                                if (var15 == 0) {
                                    if (var11.field8608) {
                                        class413.field6264.method394(var13, var14, var11.field8570, var11.field8518, var11.field8617, 0);
                                    } else {
                                        class413.field6264.method299(var13, var14, var11.field8570, var11.field8518, var11.field8617, 0);
                                    }
                                } else if (var11.field8608) {
                                    class413.field6264.method394(var13, var14, var11.field8570, var11.field8518, var11.field8617 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                } else {
                                    class413.field6264.method299(var13, var14, var11.field8570, var11.field8518, var11.field8617 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                }
                            } else if (var11.field8507 == 4) {
                                class181 var42 = var11.method3465(false, class413.field6264);
                                if (var42 != null) {
                                    int var43 = var11.field8617;
                                    String var44 = var11.field8548;
                                    if (var11.field8601 != -1) {
                                        class190 var45 = class622.field8999.method25(var11.field8601, -79);
                                        var44 = var45.field2408;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field2363 == 1 || var11.field8624 != 1) && var11.field8624 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class580.method3370((byte) -22, var11.field8624);
                                        }
                                    }
                                    if (class636.field9141 == var11) {
                                        var44 = class501.field7289.method2902(class35.field396, -20139);
                                        var43 = var11.field8617;
                                    }
                                    if (class247.field3509) {
                                        class413.field6264.method333(var13, var14, var11.field8570 + var13, var11.field8518 + var14);
                                    }
                                    var42.method1045(null, var43 | 255 - (var15 & 0xFF) << 24, 0, var11.field8506, var11.field8585, var11.field8545 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field8565, var11.field8518, var11.field8638, null, var13, class603.field8816, var11.field8570, var44, var14, 0, -16777216);
                                    if (class247.field3509) {
                                        class413.field6264.method368(arg4, arg5, arg6, arg7);
                                    }
                                } else if (class535.field7737) {
                                    class33.method187(var11, (byte) -123);
                                }
                            } else if (var11.field8507 == 5) {
                                if (var11.field8541 >= 0) {
                                    var11.method3464(class61.field702, class173.field2125, false).method2046(var11.field8570, var13, var14, var11.field8656 << 3, var11.field8666 << 3, var11.field8518, 0, class413.field6264, arg1 - 1, 0);
                                } else {
                                    class433 var47;
                                    if (var11.field8601 == -1) {
                                        var47 = var11.method3453(119, class413.field6264);
                                    } else {
                                        class274 var46 = var11.field8531 ? class439.field6548.field9470 : null;
                                        var47 = class622.field8999.method23(var46, var11.field8624, 3, var11.field8578, var11.field8527, var11.field8599 | 0xFF000000, var11.field8601, class413.field6264);
                                    }
                                    if (var47 != null) {
                                        int var48 = var47.method1577();
                                        int var49 = var47.method1568();
                                        int var50 = 255 - (var15 & 0xFF) << 24 | (var11.field8617 == 0 ? 16777215 : var11.field8617 & 0xFFFFFF);
                                        if (var11.field8569) {
                                            class413.field6264.method333(var13, var14, var13 + var11.field8570, var14 - -var11.field8518);
                                            if (var11.field8587 != 0) {
                                                int var51 = (var48 + var11.field8570 - 1) / var48;
                                                int var52 = (var11.field8518 - (1 - var49)) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field8617 == 0) {
                                                            var47.method2704((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field8587);
                                                        } else {
                                                            var47.method2703((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var14 - -(var49 * var54)), 4096, var11.field8587, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field8617 == 0 && var15 == 0) {
                                                var47.method2702(var13, var14, var11.field8570, var11.field8518);
                                            } else {
                                                var47.method1574(var13, var14, var11.field8570, var11.field8518, 0, var50, 1);
                                            }
                                            class413.field6264.method368(arg4, arg5, arg6, arg7);
                                        } else if (var11.field8617 == 0 && var15 == 0) {
                                            if (var11.field8587 != 0) {
                                                var47.method2704((float) var11.field8570 / 2.0F + (float) var13, (float) var11.field8518 / 2.0F + (float) var14, var11.field8570 * 4096 / var48, var11.field8587);
                                            } else if (var11.field8570 == var48 && var11.field8518 == var49) {
                                                var47.method2706(var13, var14);
                                            } else {
                                                var47.method2700(var13, var14, var11.field8570, var11.field8518);
                                            }
                                        } else if (var11.field8587 != 0) {
                                            var47.method2703((float) var11.field8570 / 2.0F + (float) var13, (float) var11.field8518 / 2.0F + (float) var14, var11.field8570 * 4096 / var48, var11.field8587, 0, var50, 1);
                                        } else if (var11.field8570 == var48 && var11.field8518 == var49) {
                                            var47.method1571(var13, var14, 0, var50, 1);
                                        } else {
                                            var47.method1582(var13, var14, var11.field8570, var11.field8518, 0, var50, 1);
                                        }
                                    } else if (class535.field7737) {
                                        class33.method187(var11, (byte) -57);
                                    }
                                }
                            } else if (var11.field8507 == 6) {
                                class629.method3604(-200);
                                class327 var55 = null;
                                int var56 = 0;
                                if (var11.field8601 != -1) {
                                    class190 var64 = class622.field8999.method25(var11.field8601, -31);
                                    if (var64 != null) {
                                        class190 var65 = var64.method1126(var11.field8624, -125);
                                        class177 var66 = var11.field8558 == -1 ? null : class259.field3686.method2961(var11.field8558, 8);
                                        class274 var67 = var11.field8531 ? class439.field6548.field9470 : null;
                                        var55 = var65.method1142(var67, false, var66, class413.field6264, 1, 2048, var11.field8571, var11.field8524, var11.field8631);
                                        if (var55 == null) {
                                            class33.method187(var11, (byte) 96);
                                        } else {
                                            var56 = -var55.method1379() >> 1;
                                        }
                                    }
                                } else if (var11.field8577 == 5) {
                                    int var61 = var11.field8555;
                                    if (var61 >= 0 && var61 < 2048) {
                                        class655 var62 = class142.field1749[var61];
                                        class177 var63 = var11.field8558 == -1 ? null : class259.field3686.method2961(var11.field8558, 8);
                                        if (var62 != null && (class244.field3460 == var61 || class407.method2577(arg1 + 126, var62.field9452) == var11.field8641)) {
                                            var55 = var62.field9470.method1788(class622.field8999, null, var63, null, class393.field6020, class224.field3151, arg1 + 255, 0, 2048, class413.field6264, class259.field3686, class23.field243, -1, var11.field8524, var11.field8571, class130.field1626, 0, var11.field8631, true);
                                        }
                                    }
                                } else if (var11.field8577 == 8 || var11.field8577 == 9) {
                                    class594 var58 = class581.method3372(false, var11.field8555, arg1 - 112);
                                    class177 var59 = var11.field8558 == -1 ? null : class259.field3686.method2961(var11.field8558, 8);
                                    if (var58 != null) {
                                        class274 var60 = var11.field8531 ? class439.field6548.field9470 : null;
                                        var55 = var58.method3468(var60, var59, var11.field8524, var11.field8641, class413.field6264, (byte) -37, 2048, var11.field8571, var11.field8631, var11.field8577 == 9);
                                    }
                                } else if (var11.field8558 == -1) {
                                    var55 = var11.method3462(class413.field6264, class130.field1626, class439.field6548.field9470, class622.field8999, 0, -1, class23.field243, null, arg1 - 1, class393.field6020, -1, 2048, class259.field3686, class224.field3151);
                                    if (var55 == null && class535.field7737) {
                                        class33.method187(var11, (byte) -47);
                                    }
                                } else {
                                    class177 var57 = class259.field3686.method2961(var11.field8558, 8);
                                    var55 = var11.method3462(class413.field6264, class130.field1626, class439.field6548.field9470, class622.field8999, var11.field8631, var11.field8524, class23.field243, var57, arg1 - 1, class393.field6020, var11.field8571, 2048, class259.field3686, class224.field3151);
                                    if (var55 == null && class535.field7737) {
                                        class33.method187(var11, (byte) 124);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field8659 <= 0) {
                                        var68 = 512;
                                    } else {
                                        var68 = (var11.field8570 << 9) / var11.field8659;
                                    }
                                    int var69;
                                    if (var11.field8519 > 0) {
                                        var69 = (var11.field8518 << 9) / var11.field8519;
                                    } else {
                                        var69 = 512;
                                    }
                                    int var70 = var11.field8570 / 2 + (var11.field8522 * var68 >> 9) + var13;
                                    int var71 = var11.field8518 / 2 + (var14 + (var11.field8671 * var69 >> 9));
                                    class495.field7240.method2021();
                                    class413.field6264.method382(class495.field7240);
                                    class413.field6264.method309(var70, var71, var68, var69);
                                    class413.field6264.method302((float) (var11.field8526 << 2), var11.field8634 ? (float) (var11.field8521 << 2) : (float) (var11.field8521 << 2) * 1.5F);
                                    if (arg3 == -1412584499 || class508.field7385) {
                                        class413.field6264.method404();
                                        class413.field6264.method349();
                                        class413.field6264.method368(arg4, arg5, arg6, arg7);
                                        class508.field7385 = false;
                                    }
                                    if (var11.field8537) {
                                        class413.field6264.method323(false);
                                    }
                                    int var72 = (var11.field8566 << 2) * class605.field8859[var11.field8618 << 3] >> 14;
                                    int var73 = (var11.field8566 << 2) * class605.field8858[var11.field8618 << 3] >> 14;
                                    class270.field3782.method2011(-var11.field8630 << 3);
                                    class270.field3782.method2002(var11.field8584 << 3);
                                    class270.field3782.method2006(var11.field8600 << 2, var72 - (-(var11.field8661 << 2) - var56), (var11.field8661 << 2) + var73);
                                    class270.field3782.method2007(var11.field8618 << 3);
                                    var11.method3452(class287.field3982, class270.field3782, class413.field6264, 1, var55);
                                    if (class247.field3509) {
                                        class413.field6264.method333(var13, var14, var11.field8570 + var13, var11.field8518 + var14);
                                    }
                                    if (var11.field8634) {
                                        var55.method1365(class270.field3782, null, var11.field8566 << 2, 1);
                                    } else if (var11.field8620 == null) {
                                        var55.method1380(class270.field3782, null, 1);
                                    } else {
                                        class413.field6264.method307(var55, var11.field8620.method1340(), class270.field3782, null, 1);
                                    }
                                    if (class247.field3509) {
                                        class413.field6264.method368(arg4, arg5, arg6, arg7);
                                    }
                                    if (var11.field8537) {
                                        class413.field6264.method323(true);
                                    }
                                    class413.field6264.method302(0.0F, 0.0F);
                                }
                            } else if (var11.field8507 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field8504) {
                                    var75 = var14;
                                    var76 = var13;
                                    var74 = var11.field8570 + var13;
                                    var77 = var11.field8518 + var14;
                                } else {
                                    var74 = var13 + var11.field8570;
                                    var75 = var11.field8518 + var14;
                                    var76 = var13;
                                    var77 = var14;
                                }
                                if (var11.field8602 == 1) {
                                    class413.field6264.method320(var76, var77, var74, var75, var11.field8617, 0);
                                } else {
                                    class413.field6264.method351(var76, var77, var74, var75, var11.field8617, var11.field8602, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
