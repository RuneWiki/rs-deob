import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class310 {

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field4562 = -1;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "[I")
    public static int[] field4564 = new int[8];

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)I")
    public static final int method2104(int arg0, byte arg1) {
        field4557++;
        if (arg1 != 125) {
            field4562 = 11;
        }
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xEF) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IB)V")
    public static final void method2105(int arg0, byte arg1) {
        class189 var2 = class52.field713;
        synchronized (class52.field713) {
            if (arg1 <= 20) {
                field4564 = null;
            }
            class52.field713.method1142((byte) -101, arg0);
        }
        field4559++;
        class189 var3 = class22.field285;
        synchronized (class22.field285) {
            class22.field285.method1142((byte) -55, arg0);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BLii;)V")
    public static final void method2106(byte arg0, class405 arg1) {
        field4558++;
        if (class124.field1728 < 0 || class323.field4747 < 0 || class63.field848 == 0 || class120.field1680 == 0) {
            return;
        }
        arg1.method1723(class233.field3099, class318.field4655, class63.field848, class120.field1680);
        arg1.method1767(class69.field904, class124.field1733, class63.field848, class120.field1680);
        class177 var2 = arg1.method1645();
        var2.method983(class405.field6019, class273.field3965, class78.field1094, class306.field4504, class250.field3441, class56.field749);
        arg1.method1648(var2);
        if (class63.field844 == 0 && class265.field3846 != null) {
            int var3 = -1;
            int var4 = -1;
            int var5 = arg1.method1771();
            int var6 = (class124.field1728 - class233.field3099) * var5 / class63.field848;
            int var7 = (class323.field4747 - class318.field4655) * var5 / class120.field1680;
            int var8 = arg1.method1647();
            int var9 = (class124.field1728 - class233.field3099) * var8 / class63.field848;
            int var10 = (class323.field4747 - class318.field4655) * var8 / class120.field1680;
            int[] var11 = new int[] { var6, var7, var5 };
            var2.method987(var11);
            int[] var12 = new int[] { var9, var10, var8 };
            var2.method987(var12);
            float var13 = 0.0F;
            int var14 = var12[0] - var11[0];
            int var15 = var12[1] - var11[1];
            int var16 = var12[2] - var11[2];
            while (var13 < 1.0F) {
                int var17 = (int) ((float) var14 * var13 + (float) var11[0]);
                int var18 = var17 >> 7;
                int var19 = (int) ((float) var16 * var13 + (float) var11[2]);
                int var20 = var19 >> 7;
                if (var18 > 0 && var20 > 0 && class192.field2574 > var18 && var20 < class364.field5262) {
                    int var21 = class227.field2981;
                    if (var21 < 3 && (class103.field1430[1][var18][var20] & 0x2) != 0) {
                        var21++;
                    }
                    if ((float) class265.field3846[var21].method745(var17, var19) < (float) var15 * var13 + (float) var11[1]) {
                        var3 = var17 + (class227.field2988.method168(-113) * 64) - 64 >> 7;
                        var4 = var19 + ((class227.field2988.method168(-127) - 1) * 64) >> 7;
                        break;
                    }
                }
                var13 = (float) ((double) var13 + 0.01D);
            }
            if (var3 != -1 && var4 != -1) {
                if (class263.field3821 && (class189.field2547 & 0x40) != 0) {
                    class394 var22 = class388.method2492((byte) 96, class306.field4506, class442.field6471);
                    if (var22 == null) {
                        class151.method946(-83);
                    } else {
                        class41.method299(var4, class445.field6532, class394.field5739, 0L, " ->", 4, false, var3);
                    }
                } else {
                    if (class71.field1017 == 1) {
                        class41.method299(var4, -1, class407.field6037, 0L, "", 11, false, var3);
                    }
                    class346.field4974++;
                    class41.method299(var4, -1, class319.field4669, 0L, "", 60, false, var3);
                }
            }
        }
        int var23 = -80 / (-arg0 / 49);
        class162 var24 = class385.field5587;
        for (class382 var25 = (class382) var24.method1005(119); var25 != null; var25 = (class382) var24.method1009(false)) {
            if (var25.method2470(class124.field1728, 3, class323.field4747, arg1) && class227.field2981 == var25.field5542) {
                if (var25.field5548 instanceof class25) {
                    class25 var26 = (class25) var25.field5548;
                    int var27 = var26.method168(-128);
                    if ((var27 & 0x1) == 0 && (var26.field740 & 0x7F) == 0 && (var26.field734 & 0x7F) == 0 || (var27 & 0x1) == 1 && (var26.field740 & 0x7F) == 64 && (var26.field734 & 0x7F) == 64) {
                        int var28 = var26.field740 + 64 - (var26.method168(-113) * 64);
                        int var29 = var26.field734 - (var26.method168(-121) - 1) * 64;
                        for (int var30 = 0; var30 < class198.field2637; var30++) {
                            class43 var35 = class306.field4496[class398.field5938[var30]];
                            if (var35 != null && class28.field418 != var35.field4277 && var35.field4334) {
                                int var36 = var35.field740 + 64 - (var35.field606.field3363 * 64);
                                int var37 = var35.field734 - ((var35.field606.field3363 - 1) * 64);
                                if (var28 <= var36 && var35.field606.field3363 <= (var26.method168(-122) - (var36 - var28 >> 7)) && var37 >= var29 && var35.field606.field3363 <= (var26.method168(-124) - (var37 - var29 >> 7))) {
                                    class83.method588(var35, (byte) -102);
                                    var35.field4277 = class28.field418;
                                }
                            }
                        }
                        for (int var31 = 0; var31 < class65.field861; var31++) {
                            class25 var32 = class206.field2777[class229.field3071[var31]];
                            if (var32 != null && class28.field418 != var32.field4277 && var26 != var32 && var32.field4334) {
                                int var33 = var32.field740 - (var32.method168(-112) - 1) * 64;
                                int var34 = var32.field734 + 64 - var32.method168(-120) * 64;
                                if (var28 <= var33 && var32.method168(-110) <= (var26.method168(-118) - (var33 - var28 >> 7)) && var29 <= var34 && var32.method168(-122) <= var26.method168(-113) - (var34 - var29 >> 7)) {
                                    class364.method2378((byte) -61, var32);
                                    var32.field4277 = class28.field418;
                                }
                            }
                        }
                    }
                    if (class28.field418 == var26.field4277) {
                        continue;
                    }
                    class364.method2378((byte) -103, var26);
                    var26.field4277 = class28.field418;
                }
                if (var25.field5548 instanceof class43) {
                    class43 var38 = (class43) var25.field5548;
                    if (var38.field606 != null) {
                        if ((var38.field606.field3363 & 0x1) == 0 && (var38.field740 & 0x7F) == 0 && (var38.field734 & 0x7F) == 0 || (var38.field606.field3363 & 0x1) == 1 && (var38.field740 & 0x7F) == 64 && (var38.field734 & 0x7F) == 64) {
                            int var39 = var38.field740 - ((var38.field606.field3363 - 1) * 64);
                            int var40 = var38.field734 + 64 - var38.field606.field3363 * 64;
                            for (int var41 = 0; var41 < class198.field2637; var41++) {
                                class43 var46 = class306.field4496[class398.field5938[var41]];
                                if (var46 != null && class28.field418 != var46.field4277 && var38 != var46 && var46.field4334) {
                                    int var47 = var46.field740 + 64 - (var46.field606.field3363 * 64);
                                    int var48 = var46.field734 + 64 - (var46.field606.field3363 * 64);
                                    if (var39 <= var47 && var46.field606.field3363 <= (var38.field606.field3363 - (var47 - var39 >> 7)) && var48 >= var40 && var46.field606.field3363 <= (var38.field606.field3363 - (var48 - var40 >> 7))) {
                                        class83.method588(var46, (byte) -102);
                                        var46.field4277 = class28.field418;
                                    }
                                }
                            }
                            for (int var42 = 0; var42 < class65.field861; var42++) {
                                class25 var43 = class206.field2777[class229.field3071[var42]];
                                if (var43 != null && class28.field418 != var43.field4277 && var43.field4334) {
                                    int var44 = var43.field740 - (var43.method168(-128) * 64 - 64);
                                    int var45 = var43.field734 + 64 - (var43.method168(-119) * 64);
                                    if (var44 >= var39 && var43.method168(-111) <= var38.field606.field3363 - (var44 - var39 >> 7) && var40 <= var45 && var43.method168(-118) <= var38.field606.field3363 - (var45 - var40 >> 7)) {
                                        class364.method2378((byte) 61, var43);
                                        var43.field4277 = class28.field418;
                                    }
                                }
                            }
                        }
                        if (class28.field418 == var38.field4277) {
                            continue;
                        }
                        class83.method588(var38, (byte) -102);
                        var38.field4277 = class28.field418;
                    }
                }
                if (var25.field5548 instanceof class156) {
                    class38 var49 = (class38) class200.field2656.method384((long) (var25.field5542 << 28 | var25.field5547 << 14 | var25.field5546), true);
                    if (var49 != null) {
                        for (class200 var50 = (class200) var49.field533.method333((byte) 97); var50 != null; var50 = (class200) var49.field533.method342(true)) {
                            class83 var51 = class9.method74(var50.field2658, (byte) -118);
                            if (class63.field844 == 1) {
                                class372.field5416++;
                                class41.method299(var25.field5547, class317.field4628, class384.field5553, (long) var50.field2658, class156.field2125 + " -> <col=ff9040>" + var51.field1193, 3, false, var25.field5546);
                            } else if (class263.field3821) {
                                class99 var52 = class212.field2842 == -1 ? null : class98.method666(class212.field2842, false);
                                if ((class189.field2547 & 0x1) != 0 && (var52 == null || var51.method600(var52.field1380, class212.field2842, -25103) != var52.field1380)) {
                                    class324.field4758++;
                                    class41.method299(var25.field5547, class445.field6532, class394.field5739, (long) var50.field2658, class375.field5454 + " -> <col=ff9040>" + var51.field1193, 45, false, var25.field5546);
                                }
                            } else {
                                String[] var53 = var51.field1182;
                                for (int var54 = 4; var54 >= 0; var54--) {
                                    if (var53 != null && var53[var54] != null) {
                                        byte var55 = 0;
                                        if (var54 == 0) {
                                            var55 = 12;
                                        }
                                        int var56 = class195.field2610;
                                        if (var54 == 1) {
                                            var55 = 48;
                                        }
                                        if (var54 == 2) {
                                            var55 = 44;
                                        }
                                        if (var54 == 3) {
                                            var55 = 57;
                                        }
                                        if (var51.field1143 == var54) {
                                            var56 = var51.field1118;
                                        }
                                        if (var54 == 4) {
                                            var55 = 59;
                                        }
                                        if (var51.field1147 == var54) {
                                            var56 = var51.field1177;
                                        }
                                        class369.field5331++;
                                        class41.method299(var25.field5547, var56, var53[var54], (long) var50.field2658, "<col=ff9040>" + var51.field1193, var55, false, var25.field5546);
                                    }
                                }
                                class89.field1252++;
                                class41.method299(var25.field5547, class284.field4129, class38.field532, (long) var50.field2658, "<col=ff9040>" + var51.field1193, 1005, false, var25.field5546);
                            }
                        }
                    }
                }
                if (var25.field5548 instanceof class425) {
                    class425 var57 = (class425) var25.field5548;
                    class104 var58 = class329.method2190((byte) 63, var57.method121(-15123));
                    if (var58.field1518 != null) {
                        var58 = var58.method708((byte) 59);
                    }
                    if (var58 != null) {
                        if (class63.field844 == 1) {
                            class41.method299(var25.field5547, class317.field4628, class384.field5553, class83.method601(var25.field5547, var57, var25.field5546, false), class156.field2125 + " -> <col=00ffff>" + var58.field1450, 13, false, var25.field5546);
                            class302.field4452++;
                        } else if (class263.field3821) {
                            class99 var59 = class212.field2842 == -1 ? null : class98.method666(class212.field2842, false);
                            if ((class189.field2547 & 0x4) != 0 && (var59 == null || var58.method704(var59.field1380, class212.field2842, 2) != var59.field1380)) {
                                class41.method299(var25.field5547, class445.field6532, class394.field5739, class83.method601(var25.field5547, var57, var25.field5546, false), class375.field5454 + " -> <col=00ffff>" + var58.field1450, 40, false, var25.field5546);
                                class373.field5433++;
                            }
                        } else {
                            String[] var60 = var58.field1458;
                            if (var60 != null) {
                                for (int var61 = 4; var61 >= 0; var61--) {
                                    if (var60[var61] != null) {
                                        short var62 = 0;
                                        int var63 = class195.field2610;
                                        if (var61 == 0) {
                                            var62 = 14;
                                        }
                                        if (var61 == 1) {
                                            var62 = 49;
                                        }
                                        if (var61 == 2) {
                                            var62 = 28;
                                        }
                                        if (var61 == 3) {
                                            var62 = 33;
                                        }
                                        if (var61 == 4) {
                                            var62 = 1006;
                                        }
                                        if (var58.field1497 == var61) {
                                            var63 = var58.field1447;
                                        }
                                        if (var58.field1474 == var61) {
                                            var63 = var58.field1493;
                                        }
                                        class41.method299(var25.field5547, var63, var60[var61], class83.method601(var25.field5547, var57, var25.field5546, false), "<col=00ffff>" + var58.field1450, var62, false, var25.field5546);
                                        class27.field393++;
                                    }
                                }
                            }
                            class35.field500++;
                            class41.method299(var25.field5547, class284.field4129, class38.field532, (long) var58.field1507, "<col=00ffff>" + var58.field1450, 1008, false, var25.field5546);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIILps;III)V")
    public static final void method2107(int arg0, int arg1, int arg2, int arg3, class394 arg4, int arg5, int arg6, int arg7) {
        if (arg4.field5671 == 2) {
            int var8 = 99999;
            int var9 = 0;
            int var10 = 0;
            for (int var11 = 0; var11 < arg4.field5670; var11++) {
                for (int var12 = 0; var12 < arg4.field5813; var12++) {
                    int var13 = arg5 + ((arg4.field5636 + 32) * var12);
                    int var14 = arg1 + ((arg4.field5751 + 32) * var11);
                    if (var10 < 20) {
                        var13 += arg4.field5803[var10];
                        var14 += arg4.field5662[var10];
                    }
                    if (arg4.field5777[var10] > 0 && ((var13 + 32) > arg0 && var13 < arg2 && arg3 < var14 + 32 && arg6 > var14 || class192.field2570 == arg4 && class43.field607 == var10)) {
                        if (var10 < var8) {
                            var8 = var10;
                        }
                        if (var10 > var9) {
                            var9 = var10;
                        }
                    }
                    var10++;
                }
            }
            class313.method2125(arg7 ^ 0x6, var9, var8, class61.field807, arg4);
        } else if (arg4.field5671 == 5 && arg4.field5650 != -1) {
            class317.method2139(1068069799, class61.field807, arg4);
        }
        if (arg7 != 4) {
            method2105(42, (byte) 101);
        }
        field4563++;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V")
    public static void method2108(byte arg0) {
        if (arg0 <= 93) {
            field4561 = 23;
        }
        field4564 = null;
    }

    @OriginalMember(owner = "client!so", name = "c", descriptor = "(IB)V")
    public static final void method2109(int arg0, byte arg1) {
        if (arg1 <= -101) {
            field4556++;
            class263 var2 = class47.method337(11, 0, arg0);
            var2.method1806(false);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Lrk;")
    public static final class426 method2110(int arg0, int arg1) {
        field4560++;
        class426 var2 = (class426) class183.field2482.method2674((long) arg0, 22300);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class420.field6215.method2261(arg0, 5, 74);
        class426 var4 = new class426();
        int var5 = -70 % ((arg1 + 56) / 41);
        if (var3 != null) {
            var4.method2704(true, new class228(var3));
        }
        class183.field2482.method2673((long) arg0, var4, 11465);
        return var4;
    }
}
