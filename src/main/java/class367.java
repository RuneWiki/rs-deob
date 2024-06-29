import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class367 extends class600 {

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    public int field5090;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    public static int field5093;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "[J")
    public static long[] field5092;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V", line = 6)
    public static void method2202(int arg0) {
        field5092 = null;
        if (arg0 != 1) {
            field5095 = -59;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIZ)I", line = 18)
    public static final int method2203(int arg0, int arg1, int arg2, boolean arg3) {
        field5091++;
        if (!arg3) {
            return 54;
        } else if (arg2 >= arg0) {
            return arg1 >= arg2 ? arg2 : arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIIIII[Lis;III)V", line = 29)
    public static final void method2204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class101[] arg6, int arg7, int arg8, int arg9) {
        class637.field9048.method771(arg3, arg4, arg8, arg5);
        field5093++;
        int var10 = 0;
        if (arg2 != 1024) {
            method2202(97);
        }
        while (arg6.length > var10) {
            class101 var11 = arg6[var10];
            if (var11 != null && (var11.field1539 == arg9 || arg9 == -1412584499 && class512.field7616 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class50.field666[class43.field586].setBounds(var11.field1583 + arg7, var11.field1589 + arg1, var11.field1604, var11.field1651);
                    var12 = class43.field586++;
                } else {
                    var12 = arg0;
                }
                var11.field1575 = class148.field2508;
                var11.field1647 = var12;
                if (!client.method714(var11)) {
                    label602: {
                        if (var11.field1638 != 0) {
                            class341.method2052(var11, (byte) 87);
                        }
                        int var13 = var11.field1583 + arg7;
                        int var14 = var11.field1589 + arg1;
                        int var15 = var11.field1544;
                        if (class88.field1324 && (client.method707(var11).field4572 != 0 || var11.field1584 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class512.field7616 == var11) {
                            if (arg9 != -1412584499 && (class313.field4342 == var11.field1508 || class201.field3105 == var11.field1508)) {
                                class467.field6735 = arg7;
                                class237.field3506 = arg1;
                                class598.field8643 = arg6;
                                break label602;
                            }
                            if (class205.field3169 && class23.field309) {
                                int var16 = class313.field4336.method310(false);
                                int var17 = class313.field4336.method321(arg2 - 899);
                                int var18 = var17 - class655.field9260;
                                int var19 = var16 - class586.field8575;
                                if (var19 < class112.field1794) {
                                    var19 = class112.field1794;
                                }
                                if (var11.field1604 + var19 > class112.field1794 + class456.field6557.field1604) {
                                    var19 = class112.field1794 + class456.field6557.field1604 - var11.field1604;
                                }
                                if (class654.field9236 > var18) {
                                    var18 = class654.field9236;
                                }
                                if ((class654.field9236 + class456.field6557.field1651) < (var11.field1651 + var18)) {
                                    var18 = class654.field9236 + class456.field6557.field1651 - var11.field1651;
                                }
                                var13 = var19;
                                var14 = var18;
                            }
                            if (class201.field3105 == var11.field1508) {
                                var15 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field1584 == 2) {
                            var20 = arg4;
                            var21 = arg3;
                            var22 = arg5;
                            var23 = arg8;
                        } else {
                            int var24 = var13 + var11.field1604;
                            int var25 = var11.field1651 + var14;
                            var21 = arg3 >= var13 ? arg3 : var13;
                            var20 = var14 <= arg4 ? arg4 : var14;
                            if (var11.field1584 == 9) {
                                var24++;
                                var25++;
                            }
                            var22 = arg5 <= var25 ? arg5 : var25;
                            var23 = var24 < arg8 ? var24 : arg8;
                        }
                        if (var23 > var21 && var20 < var22) {
                            label604: {
                                if (var11.field1638 != 0) {
                                    if (class608.field8740 == var11.field1638 || class611.field8775 == var11.field1638) {
                                        class5.method22((byte) -114, class611.field8775 == var11.field1638, var14, var11.field1604, var11.field1651, var13);
                                        class636.field9030[var12] = true;
                                        class637.field9048.method771(arg3, arg4, arg8, arg5);
                                        break label604;
                                    }
                                    if (class571.field8372 == var11.field1638) {
                                        if (var11.method842((byte) 124, class637.field9048) != null) {
                                            class655.method3701((byte) 38);
                                            class643.method3618(var11, var13, arg2 ^ 0x3BFF, class637.field9048, var14);
                                            class221.field3297[var12] = true;
                                            class637.field9048.method771(arg3, arg4, arg8, arg5);
                                        }
                                        break label604;
                                    }
                                    if (class668.field9391 == var11.field1638) {
                                        if (var11.method842((byte) 126, class637.field9048) != null) {
                                            class322.method1927(var13, var11, var14, 3);
                                            class221.field3297[var12] = true;
                                            class637.field9048.method771(arg3, arg4, arg8, arg5);
                                        }
                                        break label604;
                                    }
                                    if (class290.field4073 == var11.field1638) {
                                        class345.method2071((byte) -65, var14, class637.field9048, var11.field1651, var13, var11.field1604, class703.field9939);
                                        class636.field9030[var12] = true;
                                        class637.field9048.method771(arg3, arg4, arg8, arg5);
                                        break label604;
                                    }
                                    if (class123.field2012 == var11.field1638) {
                                        class550.method3228(var13, 0, var14, class637.field9048, var11.field1651, var11.field1604);
                                        class636.field9030[var12] = true;
                                        class637.field9048.method771(arg3, arg4, arg8, arg5);
                                        break label604;
                                    }
                                    if (class270.field3888 == var11.field1638) {
                                        if (!class570.field8319 && !class21.field284) {
                                            break label604;
                                        }
                                        int var26 = var11.field1604 + var13;
                                        int var27 = var14 + 15;
                                        if (class570.field8319) {
                                            int var28 = -256;
                                            if (class327.field4548 < 20) {
                                                var28 = -65536;
                                            }
                                            class335.field4670.method2403(63409608, var28, var27, var26, -1, "Fps:" + class327.field4548);
                                            var27 += 15;
                                            Runtime var29 = Runtime.getRuntime();
                                            int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            int var31 = -256;
                                            if (var30 > 98304) {
                                                var31 = -65536;
                                                if (class196.field3066) {
                                                    class303.method1857((byte) -30);
                                                    for (int var32 = 0; var32 < 10; var32++) {
                                                        System.gc();
                                                    }
                                                    var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                                    if (var30 > 65536) {
                                                        class300.method1846(4, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.", 0);
                                                    }
                                                }
                                            }
                                            class335.field4670.method2403(arg2 + 63408584, var31, var27, var26, -1, "Mem:" + var30 + "k");
                                            var27 += 15;
                                            class335.field4670.method2403(63409608, -256, var27, var26, -1, "In:" + class277.field3931 + "B/s Out:" + class98.field1464 + "B/s");
                                            var27 += 15;
                                            int var33 = class637.field9048.method775() / 1024;
                                            class335.field4670.method2403(arg2 ^ 0x3C789C8, var33 > 65536 ? -65536 : -256, var27, var26, -1, "Offheap:" + var33 + "k");
                                            var27 += 15;
                                            int var34 = 0;
                                            int var35 = 0;
                                            int var36 = 0;
                                            for (int var37 = 0; var37 < 35; var37++) {
                                                if (class53.field688[var37] != null) {
                                                    var34 += class53.field688[var37].method1311((byte) -100);
                                                    var35 += class53.field688[var37].method1315(-128);
                                                    var36 += class53.field688[var37].method1319(true);
                                                }
                                            }
                                            int var38 = var36 * 100 / var34;
                                            int var39 = var35 * 10000 / var34;
                                            String var40 = "Cache:" + class332.method1975(2, 0, true, (long) var39, arg2 ^ 0xFFFFFBEB) + "% (" + var38 + "%)";
                                            class424.field6054.method2403(63409608, -256, var27, var26, -1, var40);
                                            var27 += 12;
                                        }
                                        if (class41.field550 > 0) {
                                            class424.field6054.method2403(arg2 ^ 0x3C789C8, -256, var27, var26, -1, "Particles: " + class433.field6239 + " / " + class41.field550);
                                        }
                                        var27 += 12;
                                        if (class21.field284) {
                                            class424.field6054.method2403(63409608, -256, var27, var26, -1, "Polys: " + class637.field9048.method144() + " Models: " + class637.field9048.method796());
                                            var27 += 12;
                                            class424.field6054.method2403(63409608, -256, var27, var26, -1, "Ls: " + class236.field3495 + " La: " + class452.field6500 + " NPC: " + class47.field622 + " Pl: " + class140.field2346);
                                            var27 += 12;
                                            class286.method1760(99);
                                        }
                                        class636.field9030[var12] = true;
                                        break label604;
                                    }
                                }
                                if (var11.field1584 == 0) {
                                    if (class311.field4320 == var11.field1638 && class637.field9048.method95()) {
                                        class637.field9048.method108(var13, var14, var11.field1604, var11.field1651);
                                    }
                                    method2204(var12, var14 - var11.field1523, arg2, var21, var20, var22, arg6, var13 - var11.field1518, var23, var11.field1577);
                                    if (var11.field1578 != null) {
                                        method2204(var12, var14 - var11.field1523, 1024, var21, var20, var22, var11.field1578, var13 - var11.field1518, var23, var11.field1577);
                                    }
                                    class259 var41 = (class259) class199.field3098.method2818(-22803, (long) var11.field1577);
                                    if (var41 != null) {
                                        class112.method906(var22, var13, false, var12, var20, var41.field3716, var21, var23, var14);
                                    }
                                    if (class311.field4320 == var11.field1638 && class637.field9048.method95()) {
                                        class637.field9048.method137();
                                    }
                                    class637.field9048.method771(arg3, arg4, arg8, arg5);
                                }
                                if (class392.field5701[var12] || class548.field8046 > 1) {
                                    if (var11.field1584 == 3) {
                                        if (var15 == 0) {
                                            if (var11.field1516) {
                                                class637.field9048.method824(var13, var14, var11.field1604, var11.field1651, var11.field1582, 0);
                                            } else {
                                                class637.field9048.method791(var13, var14, var11.field1604, var11.field1651, var11.field1582, 0);
                                            }
                                        } else if (var11.field1516) {
                                            class637.field9048.method824(var13, var14, var11.field1604, var11.field1651, var11.field1582 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                        } else {
                                            class637.field9048.method791(var13, var14, var11.field1604, var11.field1651, var11.field1582 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                        }
                                    } else if (var11.field1584 == 4) {
                                        class395 var42 = var11.method839(class637.field9048, 1);
                                        if (var42 != null) {
                                            int var43 = var11.field1582;
                                            String var44 = var11.field1639;
                                            if (var11.field1565 != -1) {
                                                class432 var45 = class430.field6132.method42(var11.field1565, false);
                                                var44 = var45.field6194;
                                                if (var44 == null) {
                                                    var44 = "null";
                                                }
                                                if ((var45.field6211 == 1 || var11.field1489 != 1) && var11.field1489 != -1) {
                                                    var44 = "<col=ff9040>" + var44 + "</col> x" + class485.method2831(var11.field1489, (byte) 32);
                                                }
                                            }
                                            if (class223.field3353 == var11) {
                                                var44 = class343.field4780.method2059(class238.field3511, true);
                                                var43 = var11.field1582;
                                            }
                                            if (class252.field3653) {
                                                class637.field9048.method818(var13, var14, var11.field1604 + var13, var11.field1651 + var14);
                                            }
                                            var42.method2388(null, var14, var11.field1651, var11.field1646, 255 - (var15 & 0xFF) << 24 | var43, var11.field1625, null, 173, var11.field1562, 0, var11.field1629 ? 255 - (var15 & 0xFF) << 24 : -1, var11.field1554, var44, var11.field1604, var13, 0, class541.field7948);
                                            if (class252.field3653) {
                                                class637.field9048.method771(arg3, arg4, arg8, arg5);
                                            }
                                        } else if (class466.field6734) {
                                            class326.method1948(arg2 ^ 0x401, var11);
                                        }
                                    } else if (var11.field1584 == 5) {
                                        if (var11.field1569 < 0) {
                                            class257 var47;
                                            if (var11.field1565 == -1) {
                                                var47 = var11.method832(class637.field9048, (byte) -106);
                                            } else {
                                                class188 var46 = var11.field1601 ? class103.field1708.field3841 : null;
                                                var47 = class430.field6132.method46(var11.field1494, var11.field1489, (byte) -106, var11.field1635 | 0xFF000000, var46, class637.field9048, var11.field1502, var11.field1565);
                                            }
                                            if (var47 != null) {
                                                int var48 = var47.method11();
                                                int var49 = var47.method9();
                                                int var50 = (var11.field1582 == 0 ? 16777215 : var11.field1582 & 0xFFFFFF) | 255 - (var15 & 0xFF) << 24;
                                                if (var11.field1615) {
                                                    class637.field9048.method818(var13, var14, var11.field1604 + var13, var11.field1651 + var14);
                                                    if (var11.field1644 != 0) {
                                                        int var51 = (var11.field1604 + var48 - 1) / var48;
                                                        int var52 = (var11.field1651 + var49 - 1) / var49;
                                                        for (int var53 = 0; var53 < var51; var53++) {
                                                            for (int var54 = 0; var54 < var52; var54++) {
                                                                if (var11.field1582 == 0) {
                                                                    var47.method1637((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field1644);
                                                                } else {
                                                                    var47.method1633((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field1644, 0, var50, 1);
                                                                }
                                                            }
                                                        }
                                                    } else if (var11.field1582 == 0 && var15 == 0) {
                                                        var47.method1632(var13, var14, var11.field1604, var11.field1651);
                                                    } else {
                                                        var47.method15(var13, var14, var11.field1604, var11.field1651, 0, var50, 1);
                                                    }
                                                    class637.field9048.method771(arg3, arg4, arg8, arg5);
                                                } else if (var11.field1582 == 0 && var15 == 0) {
                                                    if (var11.field1644 != 0) {
                                                        var47.method1637((float) var11.field1604 / 2.0F + (float) var13, (float) var11.field1651 / 2.0F + (float) var14, var11.field1604 * 4096 / var48, var11.field1644);
                                                    } else if (var11.field1604 == var48 && var11.field1651 == var49) {
                                                        var47.method1638(var13, var14);
                                                    } else {
                                                        var47.method1634(var13, var14, var11.field1604, var11.field1651);
                                                    }
                                                } else if (var11.field1644 != 0) {
                                                    var47.method1633((float) var11.field1604 / 2.0F + (float) var13, (float) var11.field1651 / 2.0F + (float) var14, var11.field1604 * 4096 / var48, var11.field1644, 0, var50, 1);
                                                } else if (var11.field1604 == var48 && var11.field1651 == var49) {
                                                    var47.method3(var13, var14, 0, var50, 1);
                                                } else {
                                                    var47.method1636(var13, var14, var11.field1604, var11.field1651, 0, var50, 1);
                                                }
                                            } else if (class466.field6734) {
                                                class326.method1948(1, var11);
                                            }
                                        } else {
                                            var11.method837(31, class111.field1777, class104.field1715).method1478(var11.field1624 << 3, var11.field1649 << 3, var11.field1604, class637.field9048, var11.field1651, 0, var14, var13, 0, false);
                                        }
                                    } else if (var11.field1584 == 6) {
                                        class685.method3869((byte) 126);
                                        class397 var55 = null;
                                        int var56 = 0;
                                        if (var11.field1565 != -1) {
                                            class432 var57 = class430.field6132.method42(var11.field1565, false);
                                            if (var57 != null) {
                                                class432 var58 = var57.method2529(var11.field1489, 0);
                                                class606 var59 = var11.field1603 == -1 ? null : class480.field6871.method1417(-3585, var11.field1603);
                                                class188 var60 = var11.field1601 ? class103.field1708.field3841 : null;
                                                var55 = var58.method2528(var60, var59, var11.field1499, var11.field1551, 2048, 1, class637.field9048, var11.field1545, arg2 + 206349826);
                                                if (var55 == null) {
                                                    class326.method1948(arg2 ^ 0x401, var11);
                                                } else {
                                                    var56 = -var55.method478() >> 1;
                                                }
                                            }
                                        } else if (var11.field1527 == 5) {
                                            int var65 = var11.field1598;
                                            if (var65 >= 0 && var65 < 2048) {
                                                class270 var66 = class76.field1186[var65];
                                                class606 var67 = var11.field1603 == -1 ? null : class480.field6871.method1417(-3585, var11.field1603);
                                                if (var66 != null && (class609.field8749 == var65 || class642.method3611(0, var66.field3848) == var11.field1621)) {
                                                    var55 = var66.field3841.method1333(0, class430.field6132, null, var11.field1551, true, class625.field8919, null, class230.field3404, var11.field1545, -34, var67, 2048, class637.field9048, class564.field8259, var11.field1499, 0, -1, class480.field6871, 0, class235.field3484, null);
                                                }
                                            }
                                        } else if (var11.field1527 == 8 || var11.field1527 == 9) {
                                            class569 var62 = class198.method1392(var11.field1598, false, arg2 ^ 0x80000400);
                                            class606 var63 = var11.field1603 == -1 ? null : class480.field6871.method1417(-3585, var11.field1603);
                                            if (var62 != null) {
                                                class188 var64 = var11.field1601 ? class103.field1708.field3841 : null;
                                                var55 = var62.method3322(var64, var63, class637.field9048, var11.field1527 == 9, (byte) 58, var11.field1551, var11.field1545, var11.field1621, var11.field1499, 2048);
                                            }
                                        } else if (var11.field1603 == -1) {
                                            var55 = var11.method836(class230.field3404, class103.field1708.field3841, class235.field3484, class430.field6132, null, class480.field6871, class625.field8919, 0, -1, class564.field8259, class637.field9048, -1, (byte) 107, 2048);
                                            if (var55 == null && class466.field6734) {
                                                class326.method1948(arg2 - 1023, var11);
                                            }
                                        } else {
                                            class606 var61 = class480.field6871.method1417(arg2 - 4609, var11.field1603);
                                            var55 = var11.method836(class230.field3404, class103.field1708.field3841, class235.field3484, class430.field6132, var61, class480.field6871, class625.field8919, var11.field1545, var11.field1499, class564.field8259, class637.field9048, var11.field1551, (byte) 106, 2048);
                                            if (var55 == null && class466.field6734) {
                                                class326.method1948(arg2 - 1023, var11);
                                            }
                                        }
                                        if (var55 != null) {
                                            int var68;
                                            if (var11.field1645 <= 0) {
                                                var68 = 512;
                                            } else {
                                                var68 = (var11.field1604 << 9) / var11.field1645;
                                            }
                                            int var69;
                                            if (var11.field1605 <= 0) {
                                                var69 = 512;
                                            } else {
                                                var69 = (var11.field1651 << 9) / var11.field1605;
                                            }
                                            int var70 = var11.field1604 / 2 + var13;
                                            int var71 = var11.field1651 / 2 + var14;
                                            if (!var11.field1595) {
                                                var70 += var11.field1617 * var68 >> 9;
                                                var71 += var11.field1493 * var69 >> 9;
                                            }
                                            class410.field5865.method167();
                                            class637.field9048.method755(class410.field5865);
                                            class637.field9048.method819(var70, var71, var68, var69);
                                            class637.field9048.method138();
                                            if (var11.field1580) {
                                                class637.field9048.method770(false);
                                            }
                                            if (var11.field1595) {
                                                class70.field1103.method165(var11.field1570);
                                                class70.field1103.method170(var11.field1609);
                                                class70.field1103.method171(var11.field1619);
                                                class70.field1103.method158(var11.field1617, var11.field1493, var11.field1561);
                                            } else {
                                                int var72 = (var11.field1587 << 2) * class302.field4241[var11.field1570 << 3] >> 14;
                                                int var73 = (var11.field1587 << 2) * class302.field4242[var11.field1570 << 3] >> 14;
                                                class70.field1103.method164(-var11.field1619 << 3);
                                                class70.field1103.method170(var11.field1609 << 3);
                                                class70.field1103.method158(var11.field1552 << 2, (var11.field1612 << 2) + (var72 + var56), var73 - -(var11.field1612 << 2));
                                                class70.field1103.method152(var11.field1570 << 3);
                                            }
                                            var11.method846(class637.field9048, class148.field2508, arg2 - 1023, var55, class70.field1103);
                                            if (class252.field3653) {
                                                class637.field9048.method818(var13, var14, var11.field1604 + var13, var11.field1651 + var14);
                                            }
                                            if (var11.field1595) {
                                                if (var11.field1511) {
                                                    var55.method448(class70.field1103, null, var11.field1587, 1);
                                                } else {
                                                    var55.method460(class70.field1103, null, 1);
                                                    if (var11.field1630 != null) {
                                                        class637.field9048.method737(var11.field1630.method3574());
                                                    }
                                                }
                                            } else if (var11.field1511) {
                                                var55.method448(class70.field1103, null, var11.field1587 << 2, 1);
                                            } else {
                                                var55.method460(class70.field1103, null, 1);
                                                if (var11.field1630 != null) {
                                                    class637.field9048.method737(var11.field1630.method3574());
                                                }
                                            }
                                            if (class252.field3653) {
                                                class637.field9048.method771(arg3, arg4, arg8, arg5);
                                            }
                                            if (var11.field1580) {
                                                class637.field9048.method770(true);
                                            }
                                        }
                                    } else if (var11.field1584 == 9) {
                                        int var74;
                                        int var75;
                                        int var76;
                                        int var77;
                                        if (var11.field1529) {
                                            var77 = var11.field1604 + var13;
                                            var74 = var11.field1651 + var14;
                                            var75 = var13;
                                            var76 = var14;
                                        } else {
                                            var74 = var14;
                                            var75 = var13;
                                            var76 = var11.field1651 + var14;
                                            var77 = var11.field1604 + var13;
                                        }
                                        if (var11.field1503 == 1) {
                                            class637.field9048.method782(var75, var74, var77, var76, var11.field1582, 0);
                                        } else {
                                            class637.field9048.method743(var75, var74, var77, var76, var11.field1582, var11.field1503, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(I)V", line = 741)
    public class367(int arg0) {
        this.field5090 = arg0;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lek;I)Lai;", line = 749)
    public static final class646 method2205(class465 arg0, int arg1) {
        arg0.method2705(-109);
        if (arg1 <= 21) {
            field5092 = null;
        }
        field5094++;
        int var2 = arg0.method2705(-114);
        class646 var3 = class333.method1983(var2, 44);
        var3.field9153 = arg0.method2705(-74);
        int var4 = arg0.method2705(-105);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method2705(-89);
            var3.method295(arg0, var6, (byte) 89);
        }
        var3.method422(-1);
        return var3;
    }
}
