import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class281 extends class512 {

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "[I")
    public static int[] field4599 = new int[256];

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "[I")
    public static int[] field4598 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    private static int field4603;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "F")
    public static float field4600;

    @OriginalMember(owner = "client!sj", name = "G", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class281() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(III)V")
    public static final void method1841(int arg0, int arg1, int arg2) {
        ++field4597;
        if (class171.field2737 == 1) {
            class48.method347(-2, arg1, class21.field234, arg0);
        } else if (class171.field2737 == 2) {
            class176.method1185(arg0, (byte) -123, arg1);
        }
        if (arg2 > -69) {
            method1841(-2, 67, 4);
        }
        class21.field234 = null;
        class171.field2737 = 0;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
    public static void method1842(int arg0) {
        field4598 = null;
        if (arg0 > -111) {
            field4599 = null;
        }
        field4599 = null;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)V")
    public static final void method1843(byte arg0) {
        ++field4601;
        if (class165.field2609 > 1) {
            class368.field5713 = class78.field1368;
            --class165.field2609;
        }
        if (~class265.field4447 < -1) {
            --class265.field4447;
        }
        if (class318.field5000) {
            class318.field5000 = false;
            class404.method2503((byte) -115);
        } else {
            if (arg0 <= 98) {
                method1842(-76);
            }
            if (!class387.field5967) {
                class423.method2595(-104);
            }
            for (int var1 = 0; var1 < 100 && class74.method523(false); ++var1) {
            }
            if (~class32.field515 == -10) {
                class128.method990(class224.field3872.method2048(false), (byte) -93, class261.field4357);
                if (class57.field897 == null) {
                    if (~class249.field4246 >= ~class19.method91((byte) 99)) {
                        class57.field897 = class491.field7169.method1793(class244.field4183.field7133, 15);
                    }
                } else if (class57.field897.field7108 != -1) {
                    class265.method1775(-2, class406.field6169);
                    class261.field4357.method182(class57.field897.field7108, -121);
                    class57.field897 = null;
                    class249.field4246 = class19.method91((byte) 124) + 30000L;
                }
                class272 var2 = (class272) class216.field3765.method2538(-3);
                if (var2 != null || class19.method91((byte) 103) + -2000L > class237.field4093) {
                    boolean var3 = false;
                    int var4 = class261.field4357.field301;
                    for (class272 var5 = (class272) class91.field1508.method2538(-3); var5 != null && -var4 + class261.field4357.field301 < 240; var5 = (class272) class91.field1508.method2535((byte) -100)) {
                        var5.method1821((byte) -121);
                        int var6 = var5.method386((byte) -117);
                        if (~var6 <= -1) {
                            if (~var6 < -65535) {
                                var6 = 65534;
                            }
                        } else {
                            var6 = 0;
                        }
                        int var7 = var5.method384((byte) -120);
                        if (~var7 > -1) {
                            var7 = 0;
                        } else if (var7 > 65534) {
                            var7 = 65534;
                        }
                        boolean var8 = false;
                        if (~var5.method386((byte) -38) == 0 && var5.method384((byte) -120) == -1) {
                            var8 = true;
                            var6 = -1;
                            var7 = -1;
                        }
                        if (~class160.field2556 != ~var7 || class324.field5082 != var6) {
                            if (!var3) {
                                ++class533.field7830;
                                class265.method1775(-2, class265.field4439);
                                class261.field4357.method163(0, (byte) 49);
                                var3 = true;
                                var4 = class261.field4357.field301;
                            }
                            int var9 = var7 - class160.field2556;
                            class160.field2556 = var7;
                            int var10 = var6 - class324.field5082;
                            class324.field5082 = var6;
                            int var11 = (int) ((var5.method388(0) + -class237.field4093) / 20L);
                            if (var11 < 8 && ~var9 <= 31 && ~var9 >= -32 && ~var10 <= 31 && ~var10 >= -32) {
                                var10 += 32;
                                var9 += 32;
                                class261.field4357.method182((var9 << 6) + (var11 << 12) + var10, 30);
                            } else if (var11 < 32 && ~var9 <= 127 && ~var9 >= -128 && ~var10 <= 127 && ~var10 >= -128) {
                                class261.field4357.method163(var11 + 128, (byte) 49);
                                var9 += 128;
                                var10 += 128;
                                class261.field4357.method182((var9 << 8) + var10, 111);
                            } else if (var11 < 32) {
                                class261.field4357.method163(var11 + 192, (byte) 49);
                                if (var8) {
                                    class261.field4357.method152(Integer.MIN_VALUE, (byte) -38);
                                } else {
                                    class261.field4357.method152(var6 << 16 | var7, (byte) -38);
                                }
                            } else {
                                class261.field4357.method182(57344 - -var11, 122);
                                if (var8) {
                                    class261.field4357.method152(Integer.MIN_VALUE, (byte) -38);
                                } else {
                                    class261.field4357.method152(var7 | var6 << 16, (byte) -38);
                                }
                            }
                            class237.field4093 = var5.method388(0);
                        }
                    }
                    if (var3) {
                        class261.field4357.method140(-var4 + class261.field4357.field301, true);
                    }
                }
                if (var2 != null) {
                    long var12 = (var2.method388(0) - class300.field4811) / 50L;
                    if (var12 > 32767L) {
                        var12 = 32767L;
                    }
                    class300.field4811 = var2.method388(0);
                    int var14 = var2.method386((byte) -48);
                    if (var14 >= 0) {
                        if (var14 > 65535) {
                            var14 = 65535;
                        }
                    } else {
                        var14 = 0;
                    }
                    int var15 = var2.method384((byte) -120);
                    if (var15 >= 0) {
                        if (var15 > 65535) {
                            var15 = 65535;
                        }
                    } else {
                        var15 = 0;
                    }
                    byte var16 = 0;
                    if (var2.method385((byte) -14) == 2) {
                        var16 = 1;
                    }
                    class265.method1775(-2, class379.field5877);
                    int var17 = (int) var12;
                    ++class265.field4419;
                    class261.field4357.method122(30393, var14 << 16 | var15);
                    class261.field4357.method182(var16 << 15 | var17, -119);
                }
                if (class188.field2946 > 0) {
                    int var18 = 0;
                    for (int var19 = 0; ~class188.field2946 < ~var19; ++var19) {
                        if (class447.field6677[var19].method309(0)) {
                            ++var18;
                        }
                    }
                    if (var18 > 0) {
                        class265.method1775(-2, class437.field6526);
                        if (var18 > 75) {
                            var18 = 75;
                        }
                        ++class51.field831;
                        class261.field4357.method163(var18 * 3, (byte) 49);
                        for (int var20 = 0; ~var20 > ~class188.field2946; ++var20) {
                            class472 var21 = class447.field6677[var20];
                            if (var21.method309(0)) {
                                long var22 = (var21.method303(76) - class279.field4580) / 50L;
                                class279.field4580 = var21.method303(122);
                                if (~var22 < -65536L) {
                                    var22 = 65535L;
                                }
                                class261.field4357.method163(var21.method308(123), (byte) 49);
                                class261.field4357.method182((int) var22, -115);
                            }
                        }
                    }
                }
                if (~class29.field471 < -1) {
                    --class29.field471;
                }
                if (class299.field4804 && ~class29.field471 >= -1) {
                    class299.field4804 = false;
                    ++class176.field2797;
                    class29.field471 = 20;
                    class265.method1775(-2, class30.field480);
                    class261.field4357.method139((int) class88.field1483 >> 3, (byte) 122);
                    class261.field4357.method160(-742698264, (int) class509.field7395 >> 3);
                }
                if (class131.field2248 && !class266.field4462) {
                    class266.field4462 = true;
                    ++class394.field6031;
                    class265.method1775(-2, class124.field2167);
                    class261.field4357.method163(1, (byte) 49);
                }
                if (!class131.field2248 && class266.field4462) {
                    ++class394.field6031;
                    class266.field4462 = false;
                    class265.method1775(-2, class124.field2167);
                    class261.field4357.method163(0, (byte) 49);
                }
                if (!class40.field668) {
                    ++class94.field1580;
                    class265.method1775(-2, class328.field5175);
                    class261.field4357.method163(0, (byte) 49);
                    int var24 = class261.field4357.field301;
                    class23 var25 = class510.field7403.method1193((byte) 124);
                    class261.field4357.method136(var25.field302, 866900624, 0, var25.field301);
                    class261.field4357.method140(-var24 + class261.field4357.field301, true);
                    class40.field668 = true;
                }
                if (class66.field977 != null) {
                    if (class190.field2963 != 2) {
                        if (~class190.field2963 == -4) {
                            class532.method3146((byte) -70);
                        }
                    } else {
                        class494.method2900(false);
                    }
                }
                if (!class172.field2763) {
                    class100.field1663 /= 2.0F;
                } else {
                    class172.field2763 = false;
                }
                if (!class337.field5291) {
                    class380.field5886 /= 2.0F;
                } else {
                    class337.field5291 = false;
                }
                class208.method1361(false);
                if (~class32.field515 == -10) {
                    class503.method2969((byte) 6);
                    class140.method1045(-1);
                    class280.method1837(8275);
                    class483.method2836(-12073);
                    ++class345.field5408;
                    if (class345.field5408 > 750) {
                        class404.method2503((byte) -117);
                    } else {
                        class66.method431((byte) -83);
                        class476.method2811(0);
                        class500.method2963(0);
                        for (int var26 = class327.field5160.method1927(true, 0); var26 != -1; var26 = class327.field5160.method1927(false, 0)) {
                            class69.method489(var26, 0);
                            class262.field4369[class344.method2224(class49.field796++, 31)] = var26;
                        }
                        for (class266 var27 = class48.method343((byte) 113); var27 != null; var27 = class48.method343((byte) 108)) {
                            int var28 = var27.method1779(-143924128);
                            int var29 = var27.method1776(-104);
                            if (var28 == 1) {
                                class77.field1320[var29] = var27.field4454;
                                class361.field5604 |= class328.field5178[var29];
                                class222.field3816[class344.method2224(class251.field4292++, 31)] = var29;
                            } else if (~var28 == -3) {
                                class366.field5698[var29] = var27.field4452;
                                class519.field7663[class344.method2224(class420.field6353++, 31)] = var29;
                            } else if (~var28 == -4) {
                                class68 var30 = class22.method115(7521, var29);
                                if (!var27.field4452.equals(var30.field1157)) {
                                    var30.field1157 = var27.field4452;
                                    class396.method2476(var30, 1);
                                }
                            } else if (~var28 != -5) {
                                if (~var28 != -6) {
                                    if (var28 == 6) {
                                        int var31 = var27.field4454;
                                        int var32 = (var31 & 32421) >> 10;
                                        int var33 = var31 >> 5 & 31;
                                        int var34 = 31 & var31;
                                        int var35 = (var34 << 3) + (var32 << 19) + (var33 << 11);
                                        class68 var36 = class22.method115(7521, var29);
                                        if (~var36.field1155 != ~var35) {
                                            var36.field1155 = var35;
                                            class396.method2476(var36, 1);
                                        }
                                    } else if (var28 == 7) {
                                        class68 var37 = class22.method115(7521, var29);
                                        boolean var38 = ~var27.field4454 == -2;
                                        if (var38 == !var37.field1029) {
                                            var37.field1029 = var38;
                                            class396.method2476(var37, 1);
                                        }
                                    } else if (var28 != 8) {
                                        if (var28 == 9) {
                                            class68 var39 = class22.method115(7521, var29);
                                            if (~var27.field4454 != ~var39.field1062 || var27.field4453 != var39.field1007) {
                                                var39.field1062 = var27.field4454;
                                                var39.field1007 = var27.field4453;
                                                class396.method2476(var39, 1);
                                            }
                                        } else if (var28 == 10) {
                                            class68 var40 = class22.method115(7521, var29);
                                            if (var27.field4454 != var40.field1013 || var27.field4453 != var40.field1070 || ~var27.field4457 != ~var40.field1138) {
                                                var40.field1070 = var27.field4453;
                                                var40.field1013 = var27.field4454;
                                                var40.field1138 = var27.field4457;
                                                class396.method2476(var40, 1);
                                            }
                                        } else if (var28 == 11) {
                                            class68 var41 = class22.method115(7521, var29);
                                            var41.field1127 = var41.field1050 = var27.field4453;
                                            var41.field1154 = 0;
                                            var41.field1110 = 0;
                                            var41.field1118 = var41.field1015 = var27.field4454;
                                            class396.method2476(var41, 1);
                                        } else if (~var28 != -13) {
                                            if (~var28 != -15) {
                                                if (var28 != 15) {
                                                    if (var28 == 16) {
                                                        class68 var42 = class22.method115(7521, var29);
                                                        var42.field1141 = var27.field4454;
                                                    }
                                                } else {
                                                    class192.field2991 = true;
                                                    class314.field4946 = var27.field4454;
                                                    class420.field6346 = var27.field4453;
                                                }
                                            } else {
                                                class68 var43 = class22.method115(7521, var29);
                                                var43.field1028 = var27.field4454;
                                            }
                                        } else {
                                            class68 var44 = class22.method115(7521, var29);
                                            int var45 = var27.field4454;
                                            if (var44 != null && var44.field1086 == 0) {
                                                if (-var44.field1081 + var44.field1037 < var45) {
                                                    var45 = -var44.field1081 + var44.field1037;
                                                }
                                                if (~var45 > -1) {
                                                    var45 = 0;
                                                }
                                                if (var44.field1042 != var45) {
                                                    var44.field1042 = var45;
                                                    class396.method2476(var44, 1);
                                                }
                                            }
                                        }
                                    } else {
                                        class68 var46 = class22.method115(7521, var29);
                                        if (var27.field4454 != var46.field1113 || ~var27.field4453 != ~var46.field1031 || ~var27.field4457 != ~var46.field1017) {
                                            var46.field1031 = var27.field4453;
                                            var46.field1113 = var27.field4454;
                                            var46.field1017 = var27.field4457;
                                            if (var46.field1062 != -1) {
                                                if (~var46.field1043 < -1) {
                                                    var46.field1017 = var46.field1017 * 32 / var46.field1043;
                                                } else if (~var46.field1156 < -1) {
                                                    var46.field1017 = var46.field1017 * 32 / var46.field1156;
                                                }
                                            }
                                            class396.method2476(var46, 1);
                                        }
                                    }
                                } else {
                                    class68 var47 = class22.method115(7521, var29);
                                    if (var27.field4454 != var47.field1016 || var27.field4454 == -1) {
                                        var47.field1016 = var27.field4454;
                                        var47.field1084 = 0;
                                        var47.field1025 = 1;
                                        var47.field1046 = 0;
                                        class396.method2476(var47, 1);
                                    }
                                }
                            } else {
                                class68 var48 = class22.method115(7521, var29);
                                int var49 = var27.field4454;
                                int var50 = var27.field4453;
                                int var51 = var27.field4457;
                                if (var48.field1099 != var49 || ~var48.field1129 != ~var50 || var48.field1044 != var51) {
                                    var48.field1129 = var50;
                                    var48.field1044 = var51;
                                    var48.field1099 = var49;
                                    class396.method2476(var48, 1);
                                }
                            }
                        }
                        ++class431.field6455;
                        if (class525.field7722 != 0) {
                            class6.field74 += 20;
                            if (class6.field74 >= 400) {
                                class525.field7722 = 0;
                            }
                        }
                        if (class438.field6546 != null) {
                            ++class321.field5054;
                            if (class321.field5054 >= 15) {
                                class396.method2476(class438.field6546, 1);
                                class438.field6546 = null;
                            }
                        }
                        class228.field3990 = false;
                        class38.field570 = null;
                        class3.field27 = null;
                        class420.field6357 = false;
                        class498.method2953(-1, 120, (class68) null, -1);
                        class386.method2423(-1, (class68) null, (byte) 1, -1);
                        if (!class508.field7386) {
                            class102.field1688 = -1;
                        }
                        class380.method2402(15666);
                        ++class78.field1368;
                        if (class32.field516) {
                            ++class408.field6196;
                            class265.method1775(-2, class371.field5731);
                            class261.field4357.method118(-156051016, class108.field1937 | class498.field7307 << 28 | class251.field4295 << 14);
                            class32.field516 = false;
                        }
                        while (true) {
                            class483 var52;
                            class68 var53;
                            class68 var54;
                            do {
                                var52 = (class483) class15.field180.method2539(0);
                                if (var52 == null) {
                                    while (true) {
                                        class483 var55;
                                        class68 var56;
                                        class68 var57;
                                        do {
                                            var55 = (class483) class498.field7302.method2539(0);
                                            if (var55 == null) {
                                                while (true) {
                                                    class483 var58;
                                                    class68 var59;
                                                    class68 var60;
                                                    do {
                                                        var58 = (class483) class503.field7344.method2539(0);
                                                        if (var58 == null) {
                                                            if (class3.field27 == null) {
                                                                class217.field3778 = 0;
                                                            }
                                                            if (class164.field2598 != null) {
                                                                class359.method2300(90);
                                                            }
                                                            if (class407.field6189 > 0 && class468.field6955.method1369(82, 26) && class468.field6955.method1369(81, 26) && class147.field2394 != 0) {
                                                                int var61 = class302.field4850.field4720 - class147.field2394;
                                                                if (var61 < 0) {
                                                                    var61 = 0;
                                                                } else if (~var61 < -4) {
                                                                    var61 = 3;
                                                                }
                                                                class381.method2407(class302.field4850.field3158[0] + class455.field6794, class302.field4850.field3159[0] + class16.field181, var61, false);
                                                            }
                                                            class5.method21((byte) -2);
                                                            for (int var62 = 0; ~var62 > -6; ++var62) {
                                                                int var10002 = class263.field4399[var62]++;
                                                            }
                                                            if (class361.field5604 && ~(class19.method91((byte) 109) + -60000L) < ~class223.field3856) {
                                                                class249.method1687(false);
                                                            }
                                                            for (class262 var63 = (class262) class55.field888.method573(24037); var63 != null; var63 = (class262) class55.field888.method576(14)) {
                                                                if ((long) var63.field4367 < -5L + class19.method91((byte) 107) / 1000L) {
                                                                    if (var63.field4370 > 0) {
                                                                        class81.method588("", 0, (byte) 98, var63.field4368 + class45.field738.method1954(class300.field4813, -30366), 5, "");
                                                                    }
                                                                    if (~var63.field4370 == -1) {
                                                                        class81.method588("", 0, (byte) 98, var63.field4368 + class120.field2117.method1954(class300.field4813, -30366), 5, "");
                                                                    }
                                                                    var63.method695(-101);
                                                                }
                                                            }
                                                            ++class475.field7039;
                                                            if (class475.field7039 > 500) {
                                                                class475.field7039 = 0;
                                                                int var64 = (int) (8.0D * Math.random());
                                                                if (~(2 & var64) == -3) {
                                                                    class374.field5776 += class440.field6571;
                                                                }
                                                                if (~(var64 & 1) == -2) {
                                                                    class363.field5662 += field4603;
                                                                }
                                                                if ((var64 & 4) == 4) {
                                                                    class515.field7625 += class534.field7857;
                                                                }
                                                            }
                                                            if (class363.field5662 < -50) {
                                                                field4603 = 2;
                                                            }
                                                            if (class374.field5776 < -55) {
                                                                class440.field6571 = 2;
                                                            }
                                                            if (~class363.field5662 < -51) {
                                                                field4603 = -2;
                                                            }
                                                            if (class374.field5776 > 55) {
                                                                class440.field6571 = -2;
                                                            }
                                                            if (~class515.field7625 > 39) {
                                                                class534.field7857 = 1;
                                                            }
                                                            ++class504.field7349;
                                                            if (class515.field7625 > 40) {
                                                                class534.field7857 = -1;
                                                            }
                                                            if (~class504.field7349 < -501) {
                                                                class504.field7349 = 0;
                                                                int var65 = (int) (Math.random() * 8.0D);
                                                                if (~(var65 & 1) == -2) {
                                                                    class227.field3959 += class30.field483;
                                                                }
                                                                if (~(2 & var65) == -3) {
                                                                    class435.field6507 += class311.field4925;
                                                                }
                                                            }
                                                            if (class227.field3959 < -60) {
                                                                class30.field483 = 2;
                                                            }
                                                            if (~class227.field3959 < -61) {
                                                                class30.field483 = -2;
                                                            }
                                                            if (~class435.field6507 > 19) {
                                                                class311.field4925 = 1;
                                                            }
                                                            ++class151.field2424;
                                                            if (~class435.field6507 < -11) {
                                                                class311.field4925 = -1;
                                                            }
                                                            if (~class151.field2424 < -51) {
                                                                ++class93.field1528;
                                                                class265.method1775(-2, class507.field7377);
                                                            }
                                                            if (class199.field3165) {
                                                                class284.method1850(false);
                                                                class199.field3165 = false;
                                                            }
                                                            try {
                                                                if (class463.field6886 != null && class261.field4357.field301 > 0) {
                                                                    class496.field7267 += class261.field4357.field301;
                                                                    class463.field6886.method2795(0, class261.field4357.field301, (byte) 14, class261.field4357.field302);
                                                                    class151.field2424 = 0;
                                                                    class261.field4357.field301 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var66) {
                                                                class404.method2503((byte) -118);
                                                                return;
                                                            }
                                                        }
                                                        var59 = var58.field7100;
                                                        if (var59.field1152 < 0) {
                                                            break;
                                                        }
                                                        var60 = class22.method115(7521, var59.field1047);
                                                    } while (var60 == null || var60.field997 == null || var59.field1152 >= var60.field997.length || var60.field997[var59.field1152] != var59);
                                                    class521.method3073(var58);
                                                }
                                            }
                                            var56 = var55.field7100;
                                            if (~var56.field1152 > -1) {
                                                break;
                                            }
                                            var57 = class22.method115(7521, var56.field1047);
                                        } while (var57 == null || var57.field997 == null || ~var56.field1152 <= ~var57.field997.length || var57.field997[var56.field1152] != var56);
                                        class521.method3073(var55);
                                    }
                                }
                                var53 = var52.field7100;
                                if (~var53.field1152 > -1) {
                                    break;
                                }
                                var54 = class22.method115(7521, var53.field1047);
                            } while (var54 == null || var54.field997 == null || ~var54.field997.length >= ~var53.field1152 || var54.field997[var53.field1152] != var53);
                            class521.method3073(var52);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        int var3 = 5 % ((arg1 - 43) / 48);
        ++field4602;
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            class85.method607(var4, 0, class402.field6113, class412.field6233[arg0]);
        }
        return var4;
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(1 & var1) == -2) {
                    var1 = -306674912 ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field4599[var0] = var1;
        }
        field4603 = 2;
    }
}
