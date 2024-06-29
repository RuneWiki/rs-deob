import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class217 extends class71 {

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
    public static int field2826 = 0;

    @OriginalMember(owner = "client!fw", name = "o", descriptor = "Lhca;")
    public static class244 field2831 = new class244();

    @OriginalMember(owner = "client!fw", name = "p", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!fw", name = "s", descriptor = "I")
    public int field2835;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "Ltga;")
    public static class258 field2829;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "[I")
    public int[] field2827;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "[I")
    public int[] field2828;

    @OriginalMember(owner = "client!fw", name = "q", descriptor = "[I")
    public int[] field2833;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "[Ljg;")
    public class246[] field2830;

    @OriginalMember(owner = "client!fw", name = "t", descriptor = "[Ljg;")
    public class246[] field2836;

    @OriginalMember(owner = "client!fw", name = "u", descriptor = "[[[B")
    public byte[][][] field2837;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIIIIZII[Luv;I)V")
    public static final void method1276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class755[] arg9, int arg10) {
        field2832++;
        class129.field1802.method1544(arg4, arg5, arg10, arg1);
        if (arg7 != -1412584499) {
            field2826 = 86;
        }
        for (int var11 = 0; var11 < arg9.length; var11++) {
            class755 var12 = arg9[var11];
            if (var12 != null && (var12.field10552 == arg8 || arg8 == -1412584499 && class731.field10159 == var12)) {
                int var13 = var12.field10443 + arg3;
                int var14 = var12.field10447 + arg0;
                int var15 = var12.field10393 + var13 + 1;
                int var16 = var12.field10501 + var14 + 1;
                int var17;
                if (arg2 == -1) {
                    class210.field2741[class381.field5461].setBounds(var12.field10443 + arg3, var12.field10447 + arg0, var12.field10393, var12.field10501);
                    var17 = class381.field5461++;
                } else {
                    var17 = arg2;
                }
                var12.field10476 = var17;
                var12.field10534 = class483.field6741;
                if (!client.method2751(var12)) {
                    if (var12.field10507 != 0) {
                        class416.method2588(var12, 5);
                    }
                    int var18 = var12.field10443 + arg3;
                    int var19 = var12.field10447 + arg0;
                    int var20 = 0;
                    int var21 = 0;
                    if (class222.field3009) {
                        var20 = class580.method3374(arg7 + 1412608687);
                        var21 = class721.method4038(true);
                    }
                    int var22 = var12.field10510;
                    if (class498.field6966 && (client.method2738(var12).field3970 != 0 || var12.field10416 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class731.field10159 == var12) {
                        if (arg8 != -1412584499 && (class701.field9772 == var12.field10419 || class520.field7252 == var12.field10419)) {
                            class697.field9741 = arg3;
                            class57.field825 = arg9;
                            class715.field9976 = arg0;
                            continue;
                        }
                        if (class650.field8720 && class416.field5880) {
                            int var23 = var20 + class103.field1419.method1553((byte) 118);
                            int var24 = class103.field1419.method1556(20) + var21;
                            int var25 = var24 - class481.field6706;
                            int var26 = var23 - class445.field6184;
                            if (class178.field2453 > var26) {
                                var26 = class178.field2453;
                            }
                            if (class728.field10133 > var25) {
                                var25 = class728.field10133;
                            }
                            if (var12.field10393 + var26 > class178.field2453 + class344.field4904.field10393) {
                                var26 = class344.field4904.field10393 + class178.field2453 - var12.field10393;
                            }
                            if (var12.field10501 + var25 > class728.field10133 + class344.field4904.field10501) {
                                var25 = class344.field4904.field10501 + class728.field10133 - var12.field10501;
                            }
                            var18 = var26;
                            var19 = var25;
                        }
                        if (class520.field7252 == var12.field10419) {
                            var22 = 128;
                        }
                    }
                    int var29;
                    int var30;
                    int var31;
                    int var32;
                    if (var12.field10416 == 2) {
                        var29 = arg5;
                        var32 = arg1;
                        var31 = arg10;
                        var30 = arg4;
                    } else {
                        int var27 = var12.field10393 + var18;
                        int var28 = var12.field10501 + var19;
                        if (var12.field10416 == 9) {
                            var28++;
                            var27++;
                        }
                        var29 = var19 <= arg5 ? arg5 : var19;
                        var30 = arg4 < var18 ? var18 : arg4;
                        var31 = arg10 > var27 ? var27 : arg10;
                        var32 = arg1 <= var28 ? arg1 : var28;
                    }
                    if (var30 < var31 && var29 < var32) {
                        if (var12.field10507 != 0) {
                            if (class629.field8447 == var12.field10507 || class622.field8324 == var12.field10507) {
                                class583.method3385((byte) 36, var19, var12, var18);
                                if (!class222.field3009) {
                                    class8.method39(class622.field8324 == var12.field10507, var12.field10501, 717339721, var19, var18, var12.field10393);
                                    class129.field1802.method1544(arg4, arg5, arg10, arg1);
                                }
                                class669.field9236[var17] = true;
                                continue;
                            }
                            if (class237.field3529 == var12.field10507) {
                                if (var12.method4186(class129.field1802, 54) != null) {
                                    class11.method51(98);
                                    class1.method3(class129.field1802, var19, var18, false, var12);
                                    class514.field7098[var17] = true;
                                    class129.field1802.method1544(arg4, arg5, arg10, arg1);
                                    if (class222.field3009) {
                                        if (arg6) {
                                            class483.method2944(var15, var16, var13, var14, -1);
                                        } else {
                                            class390.method2451(var14, true, var13, var16, var15);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class398.field5727 == var12.field10507) {
                                if (var12.method4186(class129.field1802, 13) != null) {
                                    class238.method1604(var19, var18, arg7 ^ 0x36B8528F, var12);
                                    class514.field7098[var17] = true;
                                    class129.field1802.method1544(arg4, arg5, arg10, arg1);
                                    if (class222.field3009) {
                                        if (arg6) {
                                            class483.method2944(var15, var16, var13, var14, -1);
                                        } else {
                                            class390.method2451(var14, true, var13, var16, var15);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class38.field478 == var12.field10507) {
                                class154.method973(-10231, var19, var12.field10501, var12.field10393, class129.field1802, var18, class267.field3902);
                                class669.field9236[var17] = true;
                                class129.field1802.method1544(arg4, arg5, arg10, arg1);
                                continue;
                            }
                            if (class726.field10069 == var12.field10507) {
                                class130.method813(var12.field10501, var19, class129.field1802, false, var12.field10393, var18);
                                class669.field9236[var17] = true;
                                class129.field1802.method1544(arg4, arg5, arg10, arg1);
                                continue;
                            }
                            if (class28.field352 == var12.field10507) {
                                if (!class702.field9788 && !class108.field1446) {
                                    continue;
                                }
                                int var33 = var18 + var12.field10393;
                                int var34 = var19 + 15;
                                if (class222.field3009) {
                                    if (arg6) {
                                        class483.method2944(var15, var16, var13, var14, -1);
                                    } else {
                                        class390.method2451(var14, true, var13, var16, var15);
                                    }
                                }
                                if (class702.field9788) {
                                    int var35 = -256;
                                    if (class494.field6926 < 20) {
                                        var35 = -65536;
                                    }
                                    class272.field3950.method2506(var33, var35, -106, var34, "Fps:" + class494.field6926, -1);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        if (class630.field8467) {
                                            class17.method82((byte) 125);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class75.method566(4, true, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                        var38 = -65536;
                                    }
                                    class272.field3950.method2506(var33, var38, -124, var34, "Mem:" + var37 + "k", -1);
                                    var34 += 15;
                                    class272.field3950.method2506(var33, -256, -100, var34, "In:" + class318.field4423 + "B/s Out:" + class559.field7769 + "B/s", -1);
                                    var34 += 15;
                                    int var40 = class129.field1802.method1509() / 1024;
                                    class272.field3950.method2506(var33, var40 <= 65536 ? -256 : -65536, arg7 + 1412584414, var34, "Offheap:" + var40 + "k", -1);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class114.field1524[var44] != null) {
                                            var41 += class114.field1524[var44].method2960((byte) -125);
                                            var42 += class114.field1524[var44].method2972(true);
                                            var43 += class114.field1524[var44].method2973(0);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class10.method48(2, true, 0, 1, (long) var46) + "% (" + var45 + "%)";
                                    class1.field14.method2506(var33, -256, -99, var34, var47, -1);
                                    var34 += 12;
                                }
                                if (class331.field4700 > 0) {
                                    class1.field14.method2506(var33, -256, -90, var34, "Particles: " + class549.field7637 + " / " + class331.field4700, -1);
                                }
                                var34 += 12;
                                if (class108.field1446) {
                                    class1.field14.method2506(var33, -256, -96, var34, "Polys: " + class129.field1802.method277() + " Models: " + class129.field1802.method1482(), -1);
                                    var34 += 12;
                                    class1.field14.method2506(var33, -256, -121, var34, "Ls: " + class540.field7510 + " La: " + class393.field5648 + " NPC: " + class157.field2204 + " Pl: " + class316.field4389, -1);
                                    class645.method3605(arg7 ^ 0x5432545F);
                                    var34 += 12;
                                }
                                class669.field9236[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field10416 == 0) {
                            if (class610.field8215 == var12.field10507 && class129.field1802.method289()) {
                                class129.field1802.method284(var18, var19, var12.field10393, var12.field10501);
                            }
                            method1276(var19 - var12.field10532, var32, var17, var18 - var12.field10535, var30, var29, arg6, -1412584499, var12.field10445, arg9, var31);
                            if (var12.field10503 != null) {
                                method1276(var19 - var12.field10532, var32, var17, var18 - var12.field10535, var30, var29, arg6, -1412584499, var12.field10445, var12.field10503, var31);
                            }
                            class654 var48 = (class654) class259.field3747.method812(106, (long) var12.field10445);
                            if (var48 != null) {
                                class485.method2950(var32, var17, var18, var31, var48.field8745, var19, var29, var30, arg7 + 1412584499);
                            }
                            if (class610.field8215 == var12.field10507 && class129.field1802.method289()) {
                                class129.field1802.method315();
                            }
                            class129.field1802.method1544(arg4, arg5, arg10, arg1);
                        }
                        if (class531.field7369[var17] || class51.field750 > 1) {
                            if (var12.field10416 == 3) {
                                if (var22 == 0) {
                                    if (var12.field10449) {
                                        class129.field1802.method1412(var18, var19, var12.field10393, var12.field10501, var12.field10388, 0);
                                    } else {
                                        class129.field1802.method1534(var18, var19, var12.field10393, var12.field10501, var12.field10388, 0);
                                    }
                                } else if (var12.field10449) {
                                    class129.field1802.method1412(var18, var19, var12.field10393, var12.field10501, 255 - (var22 & 0xFF) << 24 | var12.field10388 & 0xFFFFFF, 1);
                                } else {
                                    class129.field1802.method1534(var18, var19, var12.field10393, var12.field10501, 255 - (var22 & 0xFF) << 24 | var12.field10388 & 0xFFFFFF, 1);
                                }
                                if (class222.field3009) {
                                    if (arg6) {
                                        class483.method2944(var15, var16, var13, var14, -1);
                                    } else {
                                        class390.method2451(var14, true, var13, var16, var15);
                                    }
                                }
                            } else if (var12.field10416 == 4) {
                                class402 var49 = var12.method4197(class129.field1802, true);
                                if (var49 != null) {
                                    int var50 = var12.field10388;
                                    String var51 = var12.field10542;
                                    if (var12.field10441 != -1) {
                                        class671 var52 = class291.field4179.method1313(var12.field10441, true);
                                        var51 = var52.field9281;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field9316 == 1 || var12.field10439 != 1) && var12.field10439 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class231.method1382(-65, var12.field10439);
                                        }
                                    }
                                    if (var12.field10391 != -1) {
                                        var51 = class745.method4149(var12.field10391, 0);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class13.field127 == var12) {
                                        var51 = class155.field2150.method978(class120.field1576, (byte) -125);
                                        var50 = var12.field10388;
                                    }
                                    if (class370.field5231) {
                                        class129.field1802.method1415(var18, var19, var12.field10393 + var18, var12.field10501 + var19);
                                    }
                                    var49.method2513(var12.field10501, -4, var12.field10517, class113.field1513, var12.field10399 ? 255 - (var22 & 0xFF) << 24 : -1, var18, var51, null, var12.field10444, var12.field10411, var19, var12.field10407, var12.field10393, 0, null, 0, var50 | 255 - (var22 & 0xFF) << 24);
                                    if (class370.field5231) {
                                        class129.field1802.method1544(arg4, arg5, arg10, arg1);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class370.field5231) {
                                            class179 var53 = class145.method941(class129.field1802, (byte) 87, var12.field10400);
                                            int var54 = var53.method1134(class113.field1513, var51, 1839, var12.field10393);
                                            int var55 = var53.method1132(var12.field10393, var12.field10411, var51, 6379, class113.field1513);
                                            if (class222.field3009) {
                                                if (arg6) {
                                                    class483.method2944(var18 + var54, var19 - -var55, var18, var19, -1);
                                                } else {
                                                    class390.method2451(var19, true, var18, var19 + var55, var18 + var54);
                                                }
                                            }
                                        } else if (class222.field3009) {
                                            if (arg6) {
                                                class483.method2944(var15, var16, var13, var14, -1);
                                            } else {
                                                class390.method2451(var14, true, var13, var16, var15);
                                            }
                                        }
                                    }
                                } else if (class316.field4382) {
                                    class27.method159((byte) -105, var12);
                                }
                            } else if (var12.field10416 == 5) {
                                if (var12.field10451 >= 0) {
                                    var12.method4201((byte) -120, class463.field6453, class560.field7796).method3395(var12.field10482 << 3, var18, 0, var19, var12.field10393, 0, class129.field1802, var12.field10501, 0, var12.field10440 << 3);
                                } else {
                                    class298 var57;
                                    if (var12.field10441 != -1) {
                                        class41 var56 = var12.field10526 ? class388.field5601.field1366 : null;
                                        var57 = class291.field4179.method1308(var56, -77, var12.field10472, class129.field1802, var12.field10441, var12.field10439, var12.field10495 | 0xFF000000, var12.field10533);
                                    } else if (var12.field10391 == -1) {
                                        var57 = var12.method4191(class129.field1802, arg7 ^ 0xABCDABA6);
                                    } else {
                                        var57 = class667.method3768(arg7 + 1412601612, var12.field10391, class129.field1802);
                                    }
                                    if (var57 != null) {
                                        int var58 = var57.method1963();
                                        int var59 = var57.method1961();
                                        int var60 = (var12.field10388 == 0 ? 16777215 : var12.field10388 & 0xFFFFFF) | 255 - (var22 & 0xFF) << 24;
                                        if (var12.field10412) {
                                            class129.field1802.method1415(var18, var19, var12.field10393 + var18, var19 - -var12.field10501);
                                            if (var12.field10466 != 0) {
                                                int var61 = (var58 + var12.field10393 - 1) / var58;
                                                int var62 = (var12.field10501 + var59 - 1) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field10388 == 0) {
                                                            var57.method1960((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field10466);
                                                        } else {
                                                            var57.method1968((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var19 - -(var59 * var64)), 4096, var12.field10466, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field10388 == 0 && var22 == 0) {
                                                var57.method1964(var18, var19, var12.field10393, var12.field10501);
                                            } else {
                                                var57.method1965(var18, var19, var12.field10393, var12.field10501, 0, var60, 1);
                                            }
                                            class129.field1802.method1544(arg4, arg5, arg10, arg1);
                                        } else if (var12.field10388 == 0 && var22 == 0) {
                                            if (var12.field10466 != 0) {
                                                var57.method1960((float) var12.field10393 / 2.0F + (float) var18, (float) var12.field10501 / 2.0F + (float) var19, var12.field10393 * 4096 / var58, var12.field10466);
                                            } else if (var12.field10393 == var58 && var12.field10501 == var59) {
                                                var57.method1970(var18, var19);
                                            } else {
                                                var57.method1959(var18, var19, var12.field10393, var12.field10501);
                                            }
                                        } else if (var12.field10466 != 0) {
                                            var57.method1968((float) var12.field10393 / 2.0F + (float) var18, (float) var12.field10501 / 2.0F + (float) var19, var12.field10393 * 4096 / var58, var12.field10466, 0, var60, 1);
                                        } else if (var12.field10393 == var58 && var12.field10501 == var59) {
                                            var57.method1013(var18, var19, 0, var60, 1);
                                        } else {
                                            var57.method1969(var18, var19, var12.field10393, var12.field10501, 0, var60, 1);
                                        }
                                    } else if (class316.field4382) {
                                        class27.method159((byte) -105, var12);
                                    }
                                }
                                if (class222.field3009) {
                                    if (arg6) {
                                        class483.method2944(var15, var16, var13, var14, -1);
                                    } else {
                                        class390.method2451(var14, true, var13, var16, var15);
                                    }
                                }
                            } else if (var12.field10416 == 6) {
                                class694.method3917(-1);
                                Object var65 = null;
                                class284 var66 = null;
                                int var67 = 0;
                                if (var12.field10441 != -1) {
                                    class671 var68 = class291.field4179.method1313(var12.field10441, true);
                                    if (var68 != null) {
                                        class671 var69 = var68.method3790(var12.field10439, 10);
                                        class57 var70 = var12.field10498 == -1 ? null : class607.field8188.method3001(arg7 + 1412571924, var12.field10498);
                                        class41 var71 = var12.field10526 ? class388.field5601.field1366 : null;
                                        var66 = var69.method3797(var70, var12.field10549, 1, class129.field1802, 27, var71, 2048, var12.field10465, var12.field10425);
                                        if (var66 == null) {
                                            class27.method159((byte) -105, var12);
                                        } else {
                                            var67 = -var66.method1668() >> 1;
                                        }
                                    }
                                } else if (var12.field10516 == 5) {
                                    int var76 = var12.field10406;
                                    if (var76 >= 0 && var76 < 2048) {
                                        class96 var77 = class251.field3675[var76];
                                        class57 var78 = var12.field10498 == -1 ? null : class607.field8188.method3001(-12575, var12.field10498);
                                        if (var77 != null && (class145.field2037 == var76 || class645.method3600(var77.field1313, 0) == var12.field10504)) {
                                            var66 = var77.field1366.method229(class607.field8188, var78, class291.field4179, class129.field1802, 0, (byte) -50, 2048, var12.field10465, class145.field2041, var12.field10549, null, -1, null, 0, 0, class464.field6461, class525.field7291, null, var12.field10425, class124.field1712, true);
                                        }
                                    }
                                } else if (var12.field10516 == 8 || var12.field10516 == 9) {
                                    class169 var73 = class170.method1090(false, (byte) -94, var12.field10406);
                                    class57 var74 = var12.field10498 == -1 ? null : class607.field8188.method3001(-12575, var12.field10498);
                                    if (var73 != null) {
                                        class41 var75 = var12.field10526 ? class388.field5601.field1366 : null;
                                        var66 = var73.method1082(var12.field10504, var12.field10549, 2048, var74, var12.field10516 == 9, var12.field10465, class129.field1802, var75, true, var12.field10425);
                                    }
                                } else if (var12.field10498 == -1) {
                                    var66 = var12.method4200(class525.field7291, -1, arg7 ^ -1412584452, class291.field4179, class607.field8188, (class688) var65, 0, 2048, class129.field1802, -1, class388.field5601.field1366, class464.field6461, class145.field2041, class124.field1712, null);
                                    if (var66 == null && class316.field4382) {
                                        class27.method159((byte) -105, var12);
                                    }
                                } else {
                                    class57 var72 = class607.field8188.method3001(arg7 + 1412571924, var12.field10498);
                                    var66 = var12.method4200(class525.field7291, var12.field10465, -124, class291.field4179, class607.field8188, (class688) var65, var12.field10425, 2048, class129.field1802, var12.field10549, class388.field5601.field1366, class464.field6461, class145.field2041, class124.field1712, var72);
                                    if (var66 == null && class316.field4382) {
                                        class27.method159((byte) -105, var12);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field10468 > 0) {
                                        var79 = (var12.field10393 << 9) / var12.field10468;
                                    } else {
                                        var79 = 512;
                                    }
                                    int var80;
                                    if (var12.field10524 > 0) {
                                        var80 = (var12.field10501 << 9) / var12.field10524;
                                    } else {
                                        var80 = 512;
                                    }
                                    int var81 = var12.field10393 / 2 + var18;
                                    int var82 = var12.field10501 / 2 + var19;
                                    if (!var12.field10437) {
                                        var82 += var12.field10456 * var80 >> 9;
                                        var81 += var12.field10543 * var79 >> 9;
                                    }
                                    class243.field3618.method889();
                                    class129.field1802.method1444(class243.field3618);
                                    class129.field1802.method1421(var81, var82, var79, var80);
                                    class129.field1802.method346();
                                    if (var12.field10497) {
                                        class129.field1802.method1529(false);
                                    }
                                    if (var12.field10437) {
                                        class723.field10036.method880(var12.field10514);
                                        class723.field10036.method890(var12.field10522);
                                        class723.field10036.method898(var12.field10520);
                                        class723.field10036.method882(var12.field10543, var12.field10456, var12.field10457);
                                    } else {
                                        int var83 = (var12.field10544 << 2) * class24.field312[var12.field10514 << 3] >> 14;
                                        int var84 = (var12.field10544 << 2) * class24.field308[var12.field10514 << 3] >> 14;
                                        class723.field10036.method896(-var12.field10520 << 3);
                                        class723.field10036.method890(var12.field10522 << 3);
                                        class723.field10036.method882(var12.field10446 << 2, (var12.field10481 << 2) + var67 + var83, var84 - -(var12.field10481 << 2));
                                        class723.field10036.method902(var12.field10514 << 3);
                                    }
                                    var12.method4187(class723.field10036, (byte) 3, class129.field1802, class483.field6741, var66);
                                    if (class370.field5231) {
                                        class129.field1802.method1415(var18, var19, var12.field10393 + var18, var19 - -var12.field10501);
                                    }
                                    if (var12.field10437) {
                                        if (var12.field10402) {
                                            var66.method1682(class723.field10036, null, var12.field10544, 1);
                                        } else {
                                            var66.method1686(class723.field10036, null, 1);
                                            if (var12.field10545 != null) {
                                                class129.field1802.method1413(var12.field10545.method3885());
                                            }
                                        }
                                    } else if (var12.field10402) {
                                        var66.method1682(class723.field10036, null, var12.field10544 << 2, 1);
                                    } else {
                                        var66.method1686(class723.field10036, null, 1);
                                        if (var12.field10545 != null) {
                                            class129.field1802.method1413(var12.field10545.method3885());
                                        }
                                    }
                                    if (class370.field5231) {
                                        class129.field1802.method1544(arg4, arg5, arg10, arg1);
                                    }
                                    if (var12.field10497) {
                                        class129.field1802.method1529(true);
                                    }
                                }
                                if (class222.field3009) {
                                    if (arg6) {
                                        class483.method2944(var15, var16, var13, var14, arg7 ^ 0x54325432);
                                    } else {
                                        class390.method2451(var14, true, var13, var16, var15);
                                    }
                                }
                            } else if (var12.field10416 == 9) {
                                int var85;
                                int var86;
                                int var87;
                                int var88;
                                if (var12.field10486) {
                                    var88 = var18;
                                    var87 = var12.field10393 + var18;
                                    var86 = var12.field10501 + var19;
                                    var85 = var19;
                                } else {
                                    var85 = var12.field10501 + var19;
                                    var86 = var19;
                                    var87 = var12.field10393 + var18;
                                    var88 = var18;
                                }
                                if (var12.field10410 == 1) {
                                    class129.field1802.method1434(var88, var86, var87, var85, var12.field10388, 0);
                                } else {
                                    class129.field1802.method1442(var88, var86, var87, var85, var12.field10388, var12.field10410, 0);
                                }
                                if (class222.field3009) {
                                    if (arg6) {
                                        class483.method2944(var15, var16, var13, var14, arg7 + 1412584498);
                                    } else {
                                        class390.method2451(var14, true, var13, var16, var15);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
    public static void method1277(int arg0) {
        field2829 = null;
        if (arg0 == 0) {
            field2831 = null;
        }
    }
}
