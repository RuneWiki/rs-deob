import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class497 extends RuntimeException {

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field7146;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "Ljava/lang/String;")
    public String field7150;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Lob;")
    public static class521 field7145 = new class521(64, -1);

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Z")
    public static boolean field7151 = false;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field7142;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Lwt;")
    public static class205 field7148;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Lul;")
    public static class406 field7149;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V", line = 7)
    public static void method2945(boolean arg0) {
        field7145 = null;
        field7149 = null;
        field7148 = null;
        if (arg0) {
            field7148 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIILya;Luq;)V", line = 20)
    private static final void method2946(int arg0, int arg1, int arg2, class38 arg3, class114 arg4) {
        field7152++;
        class10 var5 = arg4.method871(-107, arg3);
        if (var5 == null || arg2 != -21534) {
            return;
        }
        arg3.method313(arg1, arg0, arg1 + arg4.field1642, arg4.field1627 + arg0);
        if (class364.field5384 == 2 || class364.field5384 == 5 || class488.field7031 == null) {
            arg3.method270(-16777216, var5, arg1, arg0);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class176.field2611 == 4) {
            var6 = class476.field6868;
            var7 = 4096;
            var8 = class222.field3637;
            var9 = (int) (-class473.field6830) & 0x3FFF;
        } else {
            var6 = class398.field5947.field5833;
            var7 = 4096 - (class4.field23 * 16);
            var8 = class398.field5947.field5837;
            var9 = (int) (-class473.field6830) + class162.field2414 & 0x3FFF;
        }
        int var10 = (var8 / 32) + 48 - (class69.field976 + -104) * 2;
        int var11 = class285.field4328 * 4 + 48 - (var6 / 32) - (class285.field4328 - 104) * 2;
        class488.field7031.method122((float) arg4.field1642 / 2.0F + (float) arg1, (float) arg4.field1627 / 2.0F + (float) arg0, (float) var10, (float) var11, var7, var9 << 2, var5, arg1, arg0);
        for (class308 var12 = (class308) class318.field4803.method1004((byte) -97); var12 != null; var12 = (class308) class318.field4803.method996(1)) {
            int var54 = var12.field4638;
            int var55 = ((class130.field1992.field2237[var54] & 0xFFFD7A1) >> 14) - class390.field5842;
            int var56 = (class130.field1992.field2237[var54] & 0x3FFF) - class176.field2613;
            int var57 = var55 * 4 + 2 - var8 / 32;
            int var58 = var56 * 4 + (2 - var6 / 32);
            class474.method2849(class130.field1992.field2239[var54], var5, arg1, arg0, var58, arg4, var57, arg2 ^ 0xFFF0E9DD, arg3);
        }
        for (int var13 = 0; var13 < class407.field6056; var13++) {
            int var51 = class168.field2490[var13] * 4 - (var8 / 32 - 2);
            int var52 = class54.field666[var13] * 4 + 2 - (var6 / 32);
            class69 var53 = class510.field7458.method2973(-126, class460.field6692[var13]);
            if (var53.field906 != null) {
                var53 = var53.method604((byte) -15, class195.field3271);
                if (var53 == null || var53.field903 == -1) {
                    continue;
                }
            }
            class474.method2849(var53.field903, var5, arg1, arg0, var52, arg4, var51, 999999, arg3);
        }
        for (class433 var14 = (class433) class334.field4985.method2592(127); var14 != null; var14 = (class433) class334.field4985.method2589(-1)) {
            int var48 = (int) (var14.field6388 >> 28 & 0x3L);
            if (class296.field4520 == var48) {
                int var49 = (int) (var14.field6388 & 0x3FFFL) * 4 + 2 - (var8 / 32);
                int var50 = (int) (var14.field6388 >> 14 & 0x3FFFL) * 4 + 2 - var6 / 32;
                class283.method1839(class285.field4326[0], arg1, arg0, var50, var49, arg4, var5, -115);
            }
        }
        for (int var15 = 0; var15 < class167.field2471; var15++) {
            class116 var44 = class153.field2265[class470.field6797[var15]];
            if (var44 != null && var44.method881((byte) -67) && class398.field5947.field5826 == var44.field5826) {
                class37 var45 = var44.field1763;
                if (var45 != null && var45.field499 != null) {
                    var45 = var45.method256(125, class195.field3271);
                }
                if (var45 != null && var45.field480 && var45.field465) {
                    int var46 = var44.field5837 / 32 - (var8 / 32);
                    int var47 = var44.field5833 / 32 - (var6 / 32);
                    if (var45.field497 == -1) {
                        class283.method1839(class285.field4326[1], arg1, arg0, var47, var46, arg4, var5, -104);
                    } else {
                        class474.method2849(var45.field497, var5, arg1, arg0, var47, arg4, var46, 999999, arg3);
                    }
                }
            }
        }
        int var16 = class111.field1558;
        int[] var17 = class318.field4804;
        for (int var18 = 0; var18 < var16; var18++) {
            class177 var36 = class26.field319[var17[var18]];
            if (var36 != null && var36.method1183((byte) -67) && class398.field5947 != var36 && class398.field5947.field5826 == var36.field5826) {
                int var37 = var36.field5837 / 32 - (var8 / 32);
                int var38 = var36.field5833 / 32 - (var6 / 32);
                boolean var39 = false;
                for (int var40 = 0; var40 < class64.field785; var40++) {
                    if (var36.field2660.equals(class221.field3622[var40]) && class240.field3837[var40] != 0) {
                        var39 = true;
                        break;
                    }
                }
                boolean var41 = false;
                for (int var42 = 0; var42 < class505.field7375; var42++) {
                    if (var36.field2660.equals(class285.field4333[var42].field7755)) {
                        var41 = true;
                        break;
                    }
                }
                boolean var43 = false;
                if (class398.field5947.field2653 != 0 && var36.field2653 != 0 && class398.field5947.field2653 == var36.field2653) {
                    var43 = true;
                }
                if (var36.field2639) {
                    class283.method1839(class285.field4326[6], arg1, arg0, var38, var37, arg4, var5, -68);
                } else if (var39) {
                    class283.method1839(class285.field4326[3], arg1, arg0, var38, var37, arg4, var5, -119);
                } else if (var41) {
                    class283.method1839(class285.field4326[5], arg1, arg0, var38, var37, arg4, var5, -38);
                } else if (var43) {
                    class283.method1839(class285.field4326[4], arg1, arg0, var38, var37, arg4, var5, arg2 ^ 0x5478);
                } else {
                    class283.method1839(class285.field4326[2], arg1, arg0, var38, var37, arg4, var5, arg2 ^ 0x5463);
                }
            }
        }
        class109[] var19 = class303.field4580;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class109 var23 = var19[var20];
            if (var23 != null && var23.field1523 != 0 && class475.field6854 % 20 < 10) {
                if (var23.field1523 == 1 && var23.field1519 >= 0 && class153.field2265.length > var23.field1519) {
                    class116 var24 = class153.field2265[var23.field1519];
                    if (var24 != null) {
                        int var25 = var24.field5837 / 32 - (var8 / 32);
                        int var26 = var24.field5833 / 32 - (var6 / 32);
                        class96.method785(arg1, arg4, arg0, var5, var25, 360000L, var23.field1518, -79, var26);
                    }
                }
                if (var23.field1523 == 2) {
                    int var27 = var23.field1517 / 32 - var8 / 32;
                    int var28 = var23.field1524 / 32 - (var6 / 32);
                    long var29 = (long) (var23.field1527 << 5);
                    long var31 = var29 * var29;
                    class96.method785(arg1, arg4, arg0, var5, var27, var31, var23.field1518, -126, var28);
                }
                if (var23.field1523 == 10 && var23.field1519 >= 0 && var23.field1519 < class26.field319.length) {
                    class177 var33 = class26.field319[var23.field1519];
                    if (var33 != null) {
                        int var34 = var33.field5837 / 32 - var8 / 32;
                        int var35 = var33.field5833 / 32 - var6 / 32;
                        class96.method785(arg1, arg4, arg0, var5, var34, 360000L, var23.field1518, -74, var35);
                    }
                }
            }
        }
        if (class176.field2611 == 4) {
            return;
        }
        if (class114.field1692 != 0) {
            int var21 = class114.field1692 * 4 + 2 - (var8 / 32 - -2 - class398.field5947.method953(arg2 + 21472) * 2);
            int var22 = class523.field7652 * 4 + ((class398.field5947.method953(-54) - 1) * 2) + 2 - (var6 / 32);
            class283.method1839(class107.field1503[class532.field7839 ? 1 : 0], arg1, arg0, var22, var21, arg4, var5, arg2 ^ 0x5455);
        }
        arg3.method364(arg4.field1627 / 2 + (arg0 - 1), arg2 ^ 0xFFFFABE3, -1, 3, arg4.field1642 / 2 + arg1 - 1, 3);
        return;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lul;I)V", line = 319)
    public static final void method2947(class406 arg0, int arg1) {
        class445.field6530 = arg0;
        if (arg1 < 69) {
            method2945(false);
        }
        field7142++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(III[Luq;IBIIII)V", line = 333)
    public static final void method2948(int arg0, int arg1, int arg2, class114[] arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field7144++;
        class377.field5692.method313(arg1, arg7, arg9, arg4);
        int var10 = -104 / ((39 - arg5) / 37);
        for (int var11 = 0; var11 < arg3.length; var11++) {
            class114 var12 = arg3[var11];
            if (var12 != null && (var12.field1700 == arg0 || arg0 == -1412584499 && class116.field1752 == var12)) {
                int var13;
                if (arg8 == -1) {
                    class273.field4183[class109.field1529].setBounds(var12.field1646 + arg6, var12.field1701 + arg2, var12.field1642, var12.field1627);
                    var13 = class109.field1529++;
                } else {
                    var13 = arg8;
                }
                var12.field1739 = class475.field6854;
                var12.field1717 = var13;
                if (!client.method1389(var12)) {
                    if (var12.field1592 != 0) {
                        class325.method2068((byte) 17, var12);
                    }
                    int var14 = var12.field1646 + arg6;
                    int var15 = var12.field1701 + arg2;
                    int var16 = var12.field1614;
                    if (class64.field780 && (client.method1387(var12).field5805 != 0 || var12.field1585 == 0) && var16 > 127) {
                        var16 = 127;
                    }
                    if (class116.field1752 == var12) {
                        if (arg0 != -1412584499 && (class188.field3001 == var12.field1623 || class338.field5022 == var12.field1623)) {
                            class124.field1852 = arg2;
                            class33.field385 = arg6;
                            class111.field1560 = arg3;
                            continue;
                        }
                        if (class10.field138 && class139.field2127) {
                            int var17 = class184.field2800.method542(false);
                            int var18 = class184.field2800.method543(true);
                            int var19 = var18 - class419.field6264;
                            int var20 = var17 - class447.field6554;
                            if (class81.field1178 > var20) {
                                var20 = class81.field1178;
                            }
                            if (var19 < class18.field235) {
                                var19 = class18.field235;
                            }
                            if (class81.field1178 + class472.field6819.field1642 < var12.field1642 + var20) {
                                var20 = class81.field1178 + class472.field6819.field1642 - var12.field1642;
                            }
                            if ((class18.field235 + class472.field6819.field1627) < (var19 + var12.field1627)) {
                                var19 = class18.field235 + class472.field6819.field1627 - var12.field1627;
                            }
                            var14 = var20;
                            var15 = var19;
                        }
                        if (class338.field5022 == var12.field1623) {
                            var16 = 128;
                        }
                    }
                    int var23;
                    int var24;
                    int var25;
                    int var26;
                    if (var12.field1585 == 2) {
                        var26 = arg4;
                        var24 = arg7;
                        var25 = arg9;
                        var23 = arg1;
                    } else {
                        int var21 = var12.field1642 + var14;
                        int var22 = var12.field1627 + var15;
                        var23 = arg1 < var14 ? var14 : arg1;
                        if (var12.field1585 == 9) {
                            var21++;
                            var22++;
                        }
                        var24 = arg7 >= var15 ? arg7 : var15;
                        var25 = arg9 <= var21 ? arg9 : var21;
                        var26 = arg4 > var22 ? var22 : arg4;
                    }
                    if (var23 < var25 && var24 < var26) {
                        if (var12.field1592 != 0) {
                            if (class396.field5910 == var12.field1592 || class404.field5989 == var12.field1592) {
                                class131.method967(var15, -17713, var12.field1642, class404.field5989 == var12.field1592, var12.field1627, var14);
                                class277.field4219[var13] = true;
                                class377.field5692.method313(arg1, arg7, arg9, arg4);
                                continue;
                            }
                            if (class120.field1813 == var12.field1592) {
                                if (var12.method871(-90, class377.field5692) != null) {
                                    class92.method746(980099212);
                                    method2946(var15, var14, -21534, class377.field5692, var12);
                                    class8.field115[var13] = true;
                                    class377.field5692.method313(arg1, arg7, arg9, arg4);
                                }
                                continue;
                            }
                            if (class364.field5387 == var12.field1592) {
                                if (var12.method871(-111, class377.field5692) != null) {
                                    class94.method753(var14, 116, var15, var12);
                                    class8.field115[var13] = true;
                                    class377.field5692.method313(arg1, arg7, arg9, arg4);
                                }
                                continue;
                            }
                            if (class58.field702 == var12.field1592) {
                                class409.method2573(var14, class475.field6861, class377.field5692, var12.field1642, var12.field1627, (byte) -121, var15);
                                class277.field4219[var13] = true;
                                class377.field5692.method313(arg1, arg7, arg9, arg4);
                                continue;
                            }
                            if (class2.field13 == var12.field1592) {
                                class221.method1587(var12.field1627, 85, var12.field1642, var14, var15, class377.field5692);
                                class277.field4219[var13] = true;
                                class377.field5692.method313(arg1, arg7, arg9, arg4);
                                continue;
                            }
                            if (class52.field655 == var12.field1592) {
                                if (!class470.field6798 && !class23.field285) {
                                    continue;
                                }
                                int var27 = var12.field1642 + var14;
                                int var28 = var15 + 15;
                                if (class470.field6798) {
                                    class313.field4722.method2035(var28, "Fps:" + class309.field4659, 0, -1, var27, -256);
                                    var28 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                    }
                                    class313.field4722.method2035(var28, "Mem:" + var30 + "k", 0, -1, var27, var31);
                                    var28 += 15;
                                    class313.field4722.method2035(var28, "In:" + class358.field5316 + "B/s Out:" + class17.field224 + "B/s", 0, -1, var27, -256);
                                    var28 += 15;
                                    int var32 = class377.field5692.method353() / 1024;
                                    class313.field4722.method2035(var28, "Offheap:" + var32 + "k", 0, -1, var27, var32 > 65536 ? -65536 : -256);
                                    var28 += 15;
                                    int var33 = 0;
                                    int var34 = 0;
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < 30; var36++) {
                                        var33 += class468.field6770[var36].method3129((byte) 25);
                                        var34 += class468.field6770[var36].method3126(126);
                                        var35 += class468.field6770[var36].method3128(-107);
                                    }
                                    int var37 = var35 * 100 / var33;
                                    int var38 = var34 * 10000 / var33;
                                    String var39 = "Cache:" + class402.method2518(true, 0, (long) var38, -105, 2) + "% (" + var37 + "%)";
                                    class45.field585.method2035(var28, var39, 0, -1, var27, -256);
                                    var28 += 12;
                                }
                                if (class233.field3762 > 0) {
                                    class45.field585.method2035(var28, "Particles: " + class100.field1428 + " / " + class233.field3762, 0, -1, var27, -256);
                                }
                                var28 += 12;
                                if (class23.field285) {
                                    class45.field585.method2035(var28, "Polys: " + class377.field5692.method341() + " Models: " + class377.field5692.method315(), 0, -1, var27, -256);
                                    var28 += 12;
                                    class45.field585.method2035(var28, "Ls: " + class177.field2648 + " La: " + class226.field3683 + " NPC: " + class45.field581 + " Pl: " + client.field3297, 0, -1, var27, -256);
                                    class94.method751(8589);
                                    var28 += 12;
                                }
                                class277.field4219[var13] = true;
                                continue;
                            }
                        }
                        if (var12.field1585 == 0) {
                            if (class17.field223 == var12.field1592 && class377.field5692.method340()) {
                                class377.field5692.method287(var14, var15, var12.field1642, var12.field1627);
                            }
                            method2948(var12.field1644, var23, var15 - var12.field1735, arg3, var26, (byte) 93, var14 - var12.field1628, var24, var13, var25);
                            if (var12.field1660 != null) {
                                method2948(var12.field1644, var23, var15 - var12.field1735, var12.field1660, var26, (byte) 94, var14 - var12.field1628, var24, var13, var25);
                            }
                            class293 var40 = (class293) class70.field993.method2585((byte) 114, (long) var12.field1644);
                            if (var40 != null) {
                                class310.method1980(var24, var26, var40.field4454, var13, var23, var25, true, var15, var14);
                            }
                            if (class17.field223 == var12.field1592 && class377.field5692.method340()) {
                                class377.field5692.method343();
                                class477.field6885 = true;
                            }
                            class377.field5692.method313(arg1, arg7, arg9, arg4);
                        }
                        if (class74.field1049[var13] || class190.field3213 > 1) {
                            if (var12.field1585 == 3) {
                                if (var16 == 0) {
                                    if (var12.field1584) {
                                        class377.field5692.method284(var14, var15, var12.field1642, var12.field1627, var12.field1715, 0);
                                    } else {
                                        class377.field5692.method293(var14, var15, var12.field1642, var12.field1627, var12.field1715, 0);
                                    }
                                } else if (var12.field1584) {
                                    class377.field5692.method284(var14, var15, var12.field1642, var12.field1627, 255 - (var16 & 0xFF) << 24 | var12.field1715 & 0xFFFFFF, 1);
                                } else {
                                    class377.field5692.method293(var14, var15, var12.field1642, var12.field1627, var12.field1715 & 0xFFFFFF | 255 - (var16 & 0xFF) << 24, 1);
                                }
                            } else if (var12.field1585 == 4) {
                                class317 var41 = var12.method863(class377.field5692, -1);
                                if (var41 != null) {
                                    int var42 = var12.field1715;
                                    String var43 = var12.field1652;
                                    if (var12.field1670 != -1) {
                                        class532 var44 = class390.field5847.method467((byte) -101, var12.field1670);
                                        var43 = var44.field7806;
                                        if (var43 == null) {
                                            var43 = "null";
                                        }
                                        if ((var44.field7812 == 1 || var12.field1621 != 1) && var12.field1621 != -1) {
                                            var43 = "<col=ff9040>" + var43 + "</col> x" + class457.method2776(-125, var12.field1621);
                                        }
                                    }
                                    if (class226.field3684 == var12) {
                                        var43 = class19.field247.method1635(class224.field3673, (byte) 120);
                                        var42 = var12.field1715;
                                    }
                                    if (class24.field288) {
                                        class377.field5692.method344(var14, var15, var12.field1642 + var14, var12.field1627 + var15);
                                    }
                                    var41.method2032((byte) -127, var43, var12.field1601, 255 - (var16 & 0xFF) << 24 | var42, var15, null, 0, class141.field2146, var14, null, var12.field1706, var12.field1608, var12.field1632 ? 255 - (var16 & 0xFF) << 24 : -1, 0, var12.field1698, var12.field1642, var12.field1627);
                                    if (class24.field288) {
                                        class377.field5692.method313(arg1, arg7, arg9, arg4);
                                    }
                                } else if (class45.field580) {
                                    class262.method1747(20556, var12);
                                }
                            } else if (var12.field1585 == 5) {
                                if (var12.field1667 >= 0) {
                                    var12.method866(class517.field7530, class138.field2098, -20777).method1618(var12.field1627, 0, var15, var12.field1638 << 3, class377.field5692, (byte) -121, var12.field1727 << 3, var12.field1642, var14, 0);
                                } else {
                                    class16 var45;
                                    if (var12.field1670 == -1) {
                                        var45 = var12.method862(-4144, class377.field5692);
                                    } else {
                                        class500 var46 = var12.field1723 ? class398.field5947.field2667 : null;
                                        var45 = class390.field5847.method468(var12.field1621, var46, var12.field1613, var12.field1697, 54, var12.field1664 | 0xFF000000, var12.field1670, class377.field5692);
                                    }
                                    if (var45 != null) {
                                        int var47 = var45.method129();
                                        int var48 = var45.method139();
                                        int var49 = (var12.field1715 == 0 ? 16777215 : var12.field1715 & 0xFFFFFF) | 255 - (var16 & 0xFF) << 24;
                                        if (var12.field1688) {
                                            class377.field5692.method344(var14, var15, var12.field1642 + var14, var15 - -var12.field1627);
                                            if (var12.field1728 != 0) {
                                                int var50 = (-(-var47 - var12.field1642) - 1) / var47;
                                                int var51 = (var12.field1627 + var48 - 1) / var48;
                                                for (int var52 = 0; var52 < var50; var52++) {
                                                    for (int var53 = 0; var53 < var51; var53++) {
                                                        if (var12.field1715 == 0) {
                                                            var45.method128((float) var47 / 2.0F + (float) (var47 * var52 + var14), (float) var48 / 2.0F + (float) (var48 * var53 + var15), 4096, var12.field1728);
                                                        } else {
                                                            var45.method138((float) var47 / 2.0F + (float) (var14 + (var47 * var52)), (float) var48 / 2.0F + (float) (var48 * var53 + var15), 4096, var12.field1728, 0, var49, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field1715 == 0 && var16 == 0) {
                                                var45.method137(var14, var15, var12.field1642, var12.field1627);
                                            } else {
                                                var45.method136(var14, var15, var12.field1642, var12.field1627, 0, var49, 1);
                                            }
                                            class377.field5692.method313(arg1, arg7, arg9, arg4);
                                        } else if (var12.field1715 == 0 && var16 == 0) {
                                            if (var12.field1728 != 0) {
                                                var45.method128((float) var12.field1642 / 2.0F + (float) var14, (float) var12.field1627 / 2.0F + (float) var15, var12.field1642 * 4096 / var47, var12.field1728);
                                            } else if (var12.field1642 == var47 && var12.field1627 == var48) {
                                                var45.method132(var14, var15);
                                            } else {
                                                var45.method126(var14, var15, var12.field1642, var12.field1627);
                                            }
                                        } else if (var12.field1728 != 0) {
                                            var45.method138((float) var12.field1642 / 2.0F + (float) var14, (float) var12.field1627 / 2.0F + (float) var15, var12.field1642 * 4096 / var47, var12.field1728, 0, var49, 1);
                                        } else if (var12.field1642 == var47 && var12.field1627 == var48) {
                                            var45.method141(var14, var15, 0, var49, 1);
                                        } else {
                                            var45.method135(var14, var15, var12.field1642, var12.field1627, 0, var49, 1);
                                        }
                                    } else if (class45.field580) {
                                        class262.method1747(20556, var12);
                                    }
                                }
                            } else if (var12.field1585 == 6) {
                                class364.method2281(-60);
                                class475 var54 = null;
                                int var55 = 0;
                                if (var12.field1670 != -1) {
                                    class532 var63 = class390.field5847.method467((byte) -101, var12.field1670);
                                    if (var63 != null) {
                                        class532 var64 = var63.method3161(var12.field1621, false);
                                        class189 var65 = var12.field1661 == -1 ? null : class242.field3846.method2238(var12.field1661, (byte) 78);
                                        class500 var66 = var12.field1723 ? class398.field5947.field2667 : null;
                                        var54 = var64.method3154(var12.field1699, (byte) -72, var12.field1693, 1, var66, var12.field1695, var65, 2048, class377.field5692);
                                        if (var54 == null) {
                                            class262.method1747(20556, var12);
                                        } else {
                                            var55 = -var54.method427() >> 1;
                                        }
                                    }
                                } else if (var12.field1681 == 5) {
                                    int var60 = var12.field1732;
                                    if (var60 >= 0 && var60 < 2048) {
                                        class177 var61 = class26.field319[var60];
                                        class189 var62 = var12.field1661 == -1 ? null : class242.field3846.method2238(var12.field1661, (byte) 78);
                                        if (var61 != null && (class261.field4008 == var60 || class158.method1085(var61.field2660, 32311) == var12.field1741)) {
                                            var54 = var61.field2667.method2960(class242.field3846, var62, (byte) -73, class175.field2605, 0, var12.field1699, var12.field1693, class377.field5692, class138.field2094, null, 0, class390.field5847, -1, null, class195.field3271, 2048, var12.field1695, class436.field6440, true);
                                        }
                                    }
                                } else if (var12.field1681 == 8 || var12.field1681 == 9) {
                                    class240 var57 = class516.method3061((byte) -30, false, var12.field1732);
                                    class189 var58 = var12.field1661 == -1 ? null : class242.field3846.method2238(var12.field1661, (byte) 78);
                                    if (var57 != null) {
                                        class500 var59 = var12.field1723 ? class398.field5947.field2667 : null;
                                        var54 = var57.method1652(var59, 0, var58, var12.field1699, var12.field1741, var12.field1693, class377.field5692, var12.field1695, var12.field1681 == 9, 2048);
                                    }
                                } else if (var12.field1661 == -1) {
                                    var54 = var12.method860(class195.field3271, null, class436.field6440, class377.field5692, class390.field5847, -1, class175.field2605, class138.field2094, -1, class398.field5947.field2667, class242.field3846, 125, 0, 2048);
                                    if (var54 == null && class45.field580) {
                                        class262.method1747(20556, var12);
                                    }
                                } else {
                                    class189 var56 = class242.field3846.method2238(var12.field1661, (byte) 78);
                                    var54 = var12.method860(class195.field3271, var56, class436.field6440, class377.field5692, class390.field5847, var12.field1699, class175.field2605, class138.field2094, var12.field1693, class398.field5947.field2667, class242.field3846, 122, var12.field1695, 2048);
                                    if (var54 == null && class45.field580) {
                                        class262.method1747(20556, var12);
                                    }
                                }
                                if (var54 != null) {
                                    int var67;
                                    if (var12.field1631 > 0) {
                                        var67 = (var12.field1642 << 9) / var12.field1631;
                                    } else {
                                        var67 = 512;
                                    }
                                    int var68;
                                    if (var12.field1581 > 0) {
                                        var68 = (var12.field1627 << 9) / var12.field1581;
                                    } else {
                                        var68 = 512;
                                    }
                                    int var69 = var14 - (-(var12.field1642 / 2) - (var12.field1649 * var67 >> 9));
                                    int var70 = (var12.field1589 * var68 >> 9) + var12.field1627 / 2 + var15;
                                    class210.field3431.method209();
                                    class377.field5692.method362(class210.field3431);
                                    class377.field5692.method268(var69, var70, var67, var68);
                                    class377.field5692.method365((float) (var12.field1626 << 0), var12.field1640 ? (float) (var12.field1733 << 0) : (float) (var12.field1733 << 0) * 1.5F);
                                    if (arg0 == -1412584499 || class477.field6885) {
                                        class377.field5692.method267();
                                        class377.field5692.method306();
                                        class377.field5692.method313(arg1, arg7, arg9, arg4);
                                        class477.field6885 = false;
                                    }
                                    if (var12.field1602) {
                                        class377.field5692.method282(false);
                                    }
                                    int var71 = (var12.field1673 << 0) * class281.field4278[var12.field1702 << 3] >> 15;
                                    int var72 = (var12.field1673 << 0) * class281.field4279[var12.field1702 << 3] >> 15;
                                    class94.field1324.method211(-var12.field1657 << 3);
                                    class94.field1324.method210(var12.field1674 << 3);
                                    class94.field1324.method207(var12.field1686 << 0, (var12.field1666 << 0) + var55 + var71, (var12.field1666 << 0) + var72);
                                    class94.field1324.method208(var12.field1702 << 3);
                                    if (class24.field288) {
                                        class377.field5692.method344(var14, var15, var14 + var12.field1642, var12.field1627 + var15);
                                    }
                                    if (var12.field1640) {
                                        var54.method437(class94.field1324, null, var12.field1673 << 0, 1);
                                    } else {
                                        var54.method439(class94.field1324, null, 1);
                                    }
                                    if (class24.field288) {
                                        class377.field5692.method313(arg1, arg7, arg9, arg4);
                                    }
                                    if (var12.field1602) {
                                        class377.field5692.method282(true);
                                    }
                                    class377.field5692.method365(0.0F, 0.0F);
                                }
                            } else if (var12.field1585 == 9) {
                                int var73;
                                int var74;
                                int var75;
                                int var76;
                                if (var12.field1578) {
                                    var73 = var14;
                                    var74 = var15;
                                    var75 = var12.field1642 + var14;
                                    var76 = var12.field1627 + var15;
                                } else {
                                    var74 = var15 + var12.field1627;
                                    var76 = var15;
                                    var73 = var14;
                                    var75 = var12.field1642 + var14;
                                }
                                if (var12.field1579 == 1) {
                                    class377.field5692.method352(var73, var76, var75, var74, var12.field1715, 0);
                                } else {
                                    class377.field5692.method319(var73, var76, var75, var74, var12.field1715, var12.field1579, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 994)
    public class497(Throwable arg0, String arg1) {
        this.field7146 = arg0;
        this.field7150 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILjava/awt/Canvas;Lga;)Lya;", line = 1004)
    public static final class38 method2949(int arg0, int arg1, Canvas arg2, class279 arg3) {
        int var4 = 106 / ((60 - arg1) / 45);
        field7143++;
        return new class492(arg0, arg2, arg3);
    }
}
