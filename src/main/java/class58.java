import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class58 implements Runnable {

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Loc;")
    private static class99 field1516 = class48.method402((byte) -104, "Continue");

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1513 = -1;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Loc;")
    public static class99 field1515 = class48.method402((byte) -104, "::clientdrop");

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "[I")
    public static int[] field1522 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Loc;")
    private static class99 field1530 = class48.method402((byte) -104, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Loc;")
    public static class99 field1517 = field1530;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Loc;")
    private static class99 field1529 = class48.method402((byte) -104, "Ok");

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "Loc;")
    public static class99 field1531 = field1529;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "Loc;")
    private static class99 field1532 = class48.method402((byte) -104, "Please try using a different world)3");

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Loc;")
    public static class99 field1528 = field1532;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "Loc;")
    public static class99 field1539 = field1532;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static volatile int field1527 = 0;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Loc;")
    private static class99 field1536 = class48.method402((byte) -104, "Please wait)3)3)3");

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Loc;")
    public static class99 field1514 = field1536;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Loc;")
    public static class99 field1525 = field1532;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1540 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Loc;")
    public static class99 field1519 = field1516;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "[Lib;")
    public static class57[] field1524 = new class57[2048];

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field1541 = 0;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "Loc;")
    public static class99 field1533 = field1532;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Loc;")
    public static class99 field1518 = field1536;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Loc;")
    public static class99 field1542 = field1532;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Loc;")
    public static class99 field1534 = field1532;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Led;")
    public static class33 field1523;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lqa;I)V")
    public static final void method521(class109 arg0, int arg1) {
        field1521++;
        if (class4.field72) {
            class31.method269(true, arg0);
            return;
        }
        if (class49.field1179 == 1 && class23.field540 >= 715 && class4.field75 >= 453) {
            class148.field3661 = !class148.field3661;
            if (class148.field3661) {
                class49.method410(11244);
            } else {
                class5.method30(class99.field2372, class142.field3519, 1, false, class109.field2703, 255);
            }
        }
        if (class66.field1699 == 5) {
            return;
        }
        class77.field1906++;
        if (class66.field1699 != 10) {
            return;
        }
        if (class60.field1620 != 2 && class77.field1921 == 0) {
            if (class49.field1179 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 100;
                byte var5 = 35;
                if (class23.field540 >= var2 && var2 + var4 >= class23.field540 && class4.field75 >= var3 && class4.field75 <= var3 + var5) {
                    class99.method827(1);
                    return;
                }
            }
            if (class122.field2981 != null) {
                class99.method827(1);
            }
        }
        int var6 = class49.field1179;
        int var7 = class4.field75;
        int var8 = class23.field540;
        if (arg1 >= -49) {
            field1526 = 98;
        }
        if (class121.field2950 == 0) {
            short var9 = 302;
            short var10 = 291;
            if (var6 == 1 && var8 >= var9 - 75 && var9 + 75 >= var8 && var10 - 20 <= var7 && var10 + 20 >= var7) {
                class121.field2950 = 3;
                class3.field66 = 0;
            }
            short var11 = 462;
            if (var6 == 1 && var11 - 75 <= var8 && var8 <= var11 + 75 && var7 >= var10 - 20 && var7 <= var10 + 20) {
                class109.field2711 = class63.field1663;
                class121.field2950 = 2;
                class3.field66 = 0;
                class109.field2707 = class34.field838;
                class109.field2704 = class34.field835;
            }
        } else if (class121.field2950 == 2) {
            short var12 = 231;
            short var13 = 302;
            int var20 = var12 + 30;
            short var14 = 321;
            if (var6 == 1 && var20 - 15 <= var7 && var20 > var7) {
                class3.field66 = 0;
            }
            var20 += 15;
            if (var6 == 1 && var20 - 15 <= var7 && var7 < var20) {
                class3.field66 = 1;
            }
            var20 += 15;
            if (var6 == 1 && var8 >= var13 - 75 && var8 <= var13 + 75 && var14 - 20 <= var7 && var7 <= var14 + 20) {
                class109.field2709 = class109.field2709.method819(109).method849(-123);
                class91.method754(class34.field861, -74, class63.field1668, class34.field853);
                class73.method663(20, (byte) 52);
            } else {
                short var15 = 462;
                if (var6 == 1 && var8 >= var15 - 75 && var15 + 75 >= var8 && var7 >= var14 - 20 && var7 <= var14 + 20) {
                    class109.field2702 = class109.field2703;
                    class109.field2709 = class109.field2703;
                    class121.field2950 = 0;
                }
                while (true) {
                    while (class144.method1184((byte) 75)) {
                        boolean var16 = false;
                        for (int var17 = 0; var17 < class99.field2400.method810(-58); var17++) {
                            if (class11.field261 == class99.field2400.method825(var17, (byte) 73)) {
                                var16 = true;
                                break;
                            }
                        }
                        if (class3.field66 == 0) {
                            if (class68.field1756 == 85 && class109.field2709.method810(-58) > 0) {
                                class109.field2709 = class109.field2709.method840(0, 112, class109.field2709.method810(-58) - 1);
                            }
                            if (class68.field1756 == 84 || class68.field1756 == 80) {
                                class3.field66 = 1;
                            }
                            if (var16 && class109.field2709.method810(-58) < 12) {
                                class109.field2709 = class109.field2709.method831(104, class11.field261);
                            }
                        } else if (class3.field66 == 1) {
                            if (class68.field1756 == 85 && class109.field2702.method810(-58) > 0) {
                                class109.field2702 = class109.field2702.method840(0, 118, class109.field2702.method810(-58) - 1);
                            }
                            if (class68.field1756 == 84 || class68.field1756 == 80) {
                                class3.field66 = 0;
                            }
                            if (var16 && class109.field2702.method810(-58) < 20) {
                                class109.field2702 = class109.field2702.method831(100, class11.field261);
                            }
                        }
                    }
                    return;
                }
            }
        } else if (class121.field2950 == 3) {
            short var18 = 382;
            short var19 = 321;
            if (var6 == 1 && var18 - 75 <= var8 && var8 <= var18 + 75 && var7 >= var19 - 20 && var19 + 20 >= var7) {
                class121.field2950 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIILcb;II)V")
    public static final void method522(int arg0, int arg1, int arg2, class16 arg3, int arg4, int arg5) {
        field1537++;
        class110 var6 = new class110();
        var6.field2730 = arg5;
        var6.field2715 = arg3.field433 * 128;
        var6.field2717 = arg3.field396;
        var6.field2736 = arg3.field384;
        var6.field2733 = arg0 * 128;
        var6.field2723 = arg2 * 128;
        var6.field2732 = arg3.field439;
        var6.field2721 = arg3.field397;
        int var7 = arg3.field376;
        int var8 = arg3.field425;
        if (arg4 == 1 || arg4 == 3) {
            var8 = arg3.field376;
            var7 = arg3.field425;
        }
        var6.field2740 = (arg0 + var8) * 128;
        var6.field2722 = (arg2 + var7) * 128;
        if (arg3.field404 != null) {
            var6.field2739 = arg3;
            var6.method944(1);
        }
        class108.field2638.method720(var6, 0);
        if (arg1 >= -114) {
            method521(null, 111);
        }
        if (var6.field2736 != null) {
            var6.field2727 = var6.field2732 + (int) ((double) (var6.field2721 - var6.field2732) * Math.random());
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method523(int arg0) {
        field1524 = null;
        field1514 = null;
        field1533 = null;
        field1522 = null;
        field1539 = null;
        field1516 = null;
        field1528 = null;
        field1515 = null;
        field1532 = null;
        field1542 = null;
        field1531 = null;
        field1529 = null;
        field1517 = null;
        field1525 = null;
        if (arg0 != -4380) {
            return;
        }
        field1523 = null;
        field1518 = null;
        field1519 = null;
        field1534 = null;
        field1530 = null;
        field1536 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static final void method524(byte arg0) {
        if (class67.field1719 > 1) {
            class67.field1719--;
        }
        field1538++;
        if (class37.field936 > 0) {
            class37.field936--;
        }
        if (class3.field54) {
            class3.field54 = false;
            class148.method1200((byte) 119);
            return;
        }
        int var1 = 0;
        if (arg0 > -117) {
            method521(null, 71);
        }
        while (var1 < 100 && class36.method314(-137)) {
            var1++;
        }
        if (class66.field1699 != 30 && class66.field1699 != 35) {
            return;
        }
        if (class143.field3587 && class66.field1699 == 30) {
            class49.field1179 = 0;
            class43.field1057 = 0;
            while (class144.method1184((byte) 47)) {
            }
            for (int var2 = 0; var2 < class136.field3389.length; var2++) {
                class136.field3389[var2] = false;
            }
        }
        class37.method317(93, (byte) -119, class134.field3276);
        Object var3 = class91.field2243.field3468;
        synchronized (class91.field2243.field3468) {
            if (!class69.field1766) {
                class91.field2243.field3476 = 0;
            } else if (class49.field1179 != 0 || class91.field2243.field3476 >= 40) {
                class87.field2172++;
                int var4 = 0;
                class134.field3276.method869((byte) 11, 150);
                class134.field3276.method514((byte) 73, 0);
                int var5 = class134.field3276.field1477;
                for (int var6 = 0; class91.field2243.field3476 > var6 && class134.field3276.field1477 - var5 < 240; var6++) {
                    var4++;
                    int var7 = class91.field2243.field3474[var6];
                    int var8 = class91.field2243.field3475[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 502) {
                        var8 = 502;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var9 = var8 * 765 + var7;
                    if (class91.field2243.field3475[var6] == -1 && class91.field2243.field3474[var6] == -1) {
                        var9 = 524287;
                        var8 = -1;
                        var7 = -1;
                    }
                    if (class138.field3448 != var7 || class9.field233 != var8) {
                        int var10 = var7 - class138.field3448;
                        int var11 = var8 - class9.field233;
                        class138.field3448 = var7;
                        class9.field233 = var8;
                        if (class132.field3215 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var11 += 32;
                            var10 += 32;
                            class134.field3276.method467((var10 << 6) + ((class132.field3215 << 12) + var11), true);
                            class132.field3215 = 0;
                        } else if (class132.field3215 < 8) {
                            class134.field3276.method477(false, (class132.field3215 << 19) + var9 + 8388608);
                            class132.field3215 = 0;
                        } else {
                            class134.field3276.method507(25135, (class132.field3215 << 19) + var9 - 1073741824);
                            class132.field3215 = 0;
                        }
                    } else if (class132.field3215 < 2047) {
                        class132.field3215++;
                    }
                }
                class134.field3276.method512(60, class134.field3276.field1477 - var5);
                if (var4 >= class91.field2243.field3476) {
                    class91.field2243.field3476 = 0;
                } else {
                    class91.field2243.field3476 -= var4;
                    for (int var12 = 0; var12 < class91.field2243.field3476; var12++) {
                        class91.field2243.field3474[var12] = class91.field2243.field3474[var4 + var12];
                        class91.field2243.field3475[var12] = class91.field2243.field3475[var4 + var12];
                    }
                }
            }
        }
        if (class49.field1179 != 0) {
            class135.field3355++;
            long var13 = (class33.field803 - class48.field1176) / 50L;
            class48.field1176 = class33.field803;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            int var15 = class4.field75;
            int var16 = class23.field540;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            byte var17 = 0;
            int var18 = var15 * 765 + var16;
            if (class49.field1179 == 2) {
                var17 = 1;
            }
            class134.field3276.method869((byte) 11, 122);
            int var19 = (int) var13;
            class134.field3276.method491(-2645, (var19 << 20) + (var17 << 19) + var18);
        }
        if (class136.field3389[96] || class136.field3389[97] || class136.field3389[98] || class136.field3389[99]) {
            class32.field758 = true;
        }
        if (class45.field1083 > 0) {
            class45.field1083--;
        }
        if (class32.field758 && class45.field1083 <= 0) {
            class20.field485++;
            class45.field1083 = 20;
            class32.field758 = false;
            class134.field3276.method869((byte) 11, 253);
            class134.field3276.method476(117, class67.field1717);
            class134.field3276.method468(-1907964752, class140.field3478);
        }
        if (class89.field2207 && !class91.field2226) {
            class16.field377++;
            class91.field2226 = true;
            class134.field3276.method869((byte) 11, 182);
            class134.field3276.method514((byte) 73, 1);
        }
        if (!class89.field2207 && class91.field2226) {
            class91.field2226 = false;
            class134.field3276.method869((byte) 11, 182);
            class134.field3276.method514((byte) 73, 0);
            class16.field377++;
        }
        class3.method15(-11955);
        if (class66.field1699 != 30 && class66.field1699 != 35) {
            return;
        }
        class47.method397(-17132);
        class57.method502(-126);
        class48.field1177++;
        if (class48.field1177 > 750) {
            class148.method1200((byte) 127);
            return;
        }
        class25.method222((byte) 110);
        class109.method933(0);
        class79.method692((byte) 97);
        if (class89.field2201 != 0) {
            class86.field2157++;
            if (class86.field2157 >= 15) {
                if (class89.field2201 == 3) {
                    class113.field2832 = true;
                }
                if (class89.field2201 == 2) {
                    class52.field1243 = true;
                }
                class89.field2201 = 0;
            }
        }
        class143.field3566++;
        if (class52.field1240 != 0) {
            class47.field1137 += 20;
            if (class47.field1137 >= 400) {
                class52.field1240 = 0;
            }
        }
        if (class118.field2915 != 0) {
            if (class47.field1143 + 5 < class148.field3656 || class148.field3656 < class47.field1143 - 5 || class70.field1801 + 5 < class80.field1969 || class70.field1801 - 5 > class80.field1969) {
                class4.field71 = true;
            }
            class42.field1017++;
            if (class43.field1057 == 0) {
                if (class118.field2915 == 3) {
                    class113.field2832 = true;
                }
                if (class118.field2915 == 2) {
                    class52.field1243 = true;
                }
                class118.field2915 = 0;
                if (class4.field71 && class42.field1017 >= 5) {
                    class89.field2193 = -1;
                    class100.method861(false);
                    if (class89.field2193 == class52.field1246 && class68.field1749 != class1.field25) {
                        class17.field445++;
                        class54 var20 = class63.method552(class52.field1246, (byte) 126);
                        byte var21 = 0;
                        if (class109.field2699 == 1 && var20.field1327 == 206) {
                            var21 = 1;
                        }
                        if (var20.field1368[class68.field1749] <= 0) {
                            var21 = 0;
                        }
                        if (class63.method553(1, class20.method188(var20, -604452832))) {
                            int var22 = class1.field25;
                            int var23 = class68.field1749;
                            var20.field1368[var23] = var20.field1368[var22];
                            var20.field1304[var23] = var20.field1304[var22];
                            var20.field1368[var22] = -1;
                            var20.field1304[var22] = 0;
                        } else if (var21 == 1) {
                            int var24 = class68.field1749;
                            int var25 = class1.field25;
                            while (var24 != var25) {
                                if (var24 < var25) {
                                    var20.method454(var25 - 1, (byte) -74, var25);
                                    var25--;
                                } else if (var24 > var25) {
                                    var20.method454(var25 + 1, (byte) -41, var25);
                                    var25++;
                                }
                            }
                        } else {
                            var20.method454(class68.field1749, (byte) -44, class1.field25);
                        }
                        class134.field3276.method869((byte) 11, 29);
                        class134.field3276.method514((byte) 73, var21);
                        class134.field3276.method467(class68.field1749, true);
                        class134.field3276.method467(class1.field25, true);
                        class134.field3276.method508(1, class52.field1246);
                    }
                } else if ((class132.field3211 == 1 || class27.method253(class144.field3601 - 1, true)) && class144.field3601 > 2) {
                    class122.method1015((byte) 90);
                } else if (class144.field3601 > 0) {
                    class99.method848(0, class144.field3601 - 1);
                }
                class49.field1179 = 0;
                class86.field2157 = 10;
            }
        }
        byte var26 = 34;
        if (class119.field2923 == -1) {
            if (class23.field555 != -1) {
                class80.method694(4, (byte) 16, 516, class23.field555, var26, 4, 338);
            } else if (class42.field1015 != -1) {
                class80.method694(4, (byte) 16, 516, class42.field1015, var26, 4, 338);
            }
            if (class27.field679 != -1) {
                class80.method694(553, (byte) 16, 743, class27.field679, var26, 205, 466);
            } else if (class134.field3301[class57.field1473] != -1) {
                class80.method694(553, (byte) 16, 743, class134.field3301[class57.field1473], var26, 205, 466);
            }
            if (class87.field2162 != -1) {
                class80.method694(17, (byte) 16, 496, class87.field2162, var26, 357, 453);
            } else if (class127.field3110 != -1) {
                class80.method694(17, (byte) 16, 496, class127.field3110, var26, 357, 453);
            }
        } else {
            class80.method694(0, (byte) 16, 765, class119.field2923, var26, 0, 503);
            if (class36.field916 != -1) {
                class80.method694(0, (byte) 16, 765, class36.field916, var26, 0, 503);
            }
        }
        if (class119.field2923 == -1) {
            if (class23.field555 != -1) {
                class80.method694(4, (byte) 16, 516, class23.field555, ~var26, 4, 338);
            } else if (class42.field1015 != -1) {
                class80.method694(4, (byte) 16, 516, class42.field1015, ~var26, 4, 338);
            }
            if (class27.field679 != -1) {
                class80.method694(553, (byte) 16, 743, class27.field679, ~var26, 205, 466);
            } else if (class134.field3301[class57.field1473] != -1) {
                class80.method694(553, (byte) 16, 743, class134.field3301[class57.field1473], ~var26, 205, 466);
            }
            if (class87.field2162 != -1) {
                class80.method694(17, (byte) 16, 496, class87.field2162, ~var26, 357, 453);
            } else if (class127.field3110 != -1) {
                class80.method694(17, (byte) 16, 496, class127.field3110, ~var26, 357, 453);
            }
        } else {
            class80.method694(0, (byte) 16, 765, class119.field2923, ~var26, 0, 503);
            if (class36.field916 != -1) {
                class80.method694(0, (byte) 16, 765, class36.field916, ~var26, 0, 503);
            }
        }
        class84.method729(-2);
        if (class6.field162 != -1) {
            int var27 = class6.field162;
            int var28 = class6.field148;
            boolean var29 = class52.method432(true, 0, class69.field1770.field3096[0], 0, var28, 0, 0, var27, class69.field1770.field3100[0], (byte) 110, 0, 0);
            class6.field162 = -1;
            if (var29) {
                class52.field1240 = 1;
                class47.field1137 = 0;
                class97.field2334 = class4.field75;
                class119.field2920 = class23.field540;
            }
        }
        if (class49.field1179 == 1 && class93.field2251 != null) {
            class113.field2832 = true;
            class93.field2251 = null;
            class49.field1179 = 0;
        }
        class30.method266(-8180);
        if (class119.field2923 == -1) {
            class132.method1071((byte) 85);
            class43.method369(0);
            class4.method23(-104);
        }
        if (class61.field1644 == -1 && class46.field1108 == -1 && field1513 == -1) {
            if (class42.field1014 > 0) {
                class42.field1014--;
            }
        } else if (class34.field851 > class42.field1014) {
            class42.field1014++;
            if (class42.field1014 == class34.field851) {
                if (class61.field1644 != -1) {
                    class113.field2832 = true;
                }
                if (class46.field1108 != -1) {
                    class52.field1243 = true;
                }
            }
        }
        if (class43.field1057 == 1 || class49.field1179 == 1) {
            class11.field258++;
        }
        class15.method153((byte) 116);
        if (class122.field2982) {
            class125.method1023((byte) -124);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class47.field1148[var30]++;
        }
        class87.method741(0);
        int var31 = class101.method870(true);
        int var32 = class4.method21(-18717);
        if (var31 > 4500 && var32 > 4500) {
            class37.field936 = 250;
            class143.method1167(4000, true);
            class142.field3517++;
            class134.field3276.method869((byte) 11, 162);
        }
        class108.field2651++;
        if (class108.field2651 > 500) {
            class108.field2651 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x4) == 4) {
                class94.field2296 += class108.field2652;
            }
            if ((var33 & 0x2) == 2) {
                class53.field1274 += class7.field211;
            }
            if ((var33 & 0x1) == 1) {
                class141.field3494 += class39.field977;
            }
        }
        if (class141.field3494 < -50) {
            class39.field977 = 2;
        }
        if (class141.field3494 > 50) {
            class39.field977 = -2;
        }
        if (class94.field2296 < -40) {
            class108.field2652 = 1;
        }
        if (class53.field1274 < -55) {
            class7.field211 = 2;
        }
        class15.field354++;
        if (class94.field2296 > 40) {
            class108.field2652 = -1;
        }
        if (class53.field1274 > 55) {
            class7.field211 = -2;
        }
        class17.field464++;
        if (class17.field464 > 500) {
            class17.field464 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x2) == 2) {
                class23.field556 += class20.field490;
            }
            if ((var34 & 0x1) == 1) {
                class32.field777 += class81.field2007;
            }
        }
        if (class23.field556 < -20) {
            class20.field490 = 1;
        }
        if (class23.field556 > 10) {
            class20.field490 = -1;
        }
        if (class32.field777 < -60) {
            class81.field2007 = 2;
        }
        if (class32.field777 > 60) {
            class81.field2007 = -2;
        }
        if (class15.field354 > 50) {
            class133.field3231++;
            class134.field3276.method869((byte) 11, 36);
        }
        try {
            if (class104.field2536 != null && class134.field3276.field1477 > 0) {
                class104.field2536.method1214(0, true, class134.field3276.field1469, class134.field3276.field1477);
                class15.field354 = 0;
                class134.field3276.field1477 = 0;
            }
        } catch (IOException var35) {
            class148.method1200((byte) 124);
        }
    }

    @OriginalMember(owner = "client!ic", name = "run", descriptor = "()V")
    public final void run() {
        field1520++;
        try {
            while (true) {
                class83 var1 = class21.field510;
                class132 var2;
                synchronized (class21.field510) {
                    var2 = (class132) class21.field510.method722(124);
                }
                if (var2 == null) {
                    class57.method509(-126, 100L);
                    Object var6 = class83.field2072;
                    synchronized (class83.field2072) {
                        if (class60.field1605 <= 1) {
                            class60.field1605 = 0;
                            class83.field2072.notifyAll();
                            return;
                        }
                        class60.field1605--;
                    }
                } else {
                    if (var2.field3218 == 0) {
                        var2.field3212.method1185(var2.field3219, (int) var2.field1138, var2.field3219.length, 1);
                        class83 var3 = class21.field510;
                        synchronized (class21.field510) {
                            var2.method394((byte) 95);
                        }
                    } else if (var2.field3218 == 1) {
                        var2.field3219 = var2.field3212.method1181((int) var2.field1138, (byte) -3);
                        class83 var4 = class21.field510;
                        synchronized (class21.field510) {
                            class52.field1250.method720(var2, 0);
                        }
                    }
                    Object var5 = class83.field2072;
                    synchronized (class83.field2072) {
                        if (class60.field1605 <= 1) {
                            class60.field1605 = 0;
                            class83.field2072.notifyAll();
                            return;
                        }
                        class60.field1605 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class72.method659(var17, (byte) 120, null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static final void method525(byte arg0) {
        field1535++;
        class3.method12(-3);
        if (arg0 <= 36) {
            return;
        }
        if (class52.field1240 == 1) {
            class86.field2159[class47.field1137 / 100].method584(class119.field2920 - 4 - 8, class97.field2334 + -4 + -8);
        }
        if (class52.field1240 == 2) {
            class86.field2159[class47.field1137 / 100 + 4].method584(class119.field2920 - 4 - 8, class97.field2334 + -12);
        }
        if (class42.field1015 != -1) {
            class88.method742(class42.field1015, 123);
            class31.method270(512, 4, 334, -9247, 0, 0, class42.field1015);
        }
        if (class23.field555 != -1) {
            class88.method742(class23.field555, 127);
            class31.method270(512, 0, 334, -9247, 0, 0, class23.field555);
        }
        class23.method207((byte) 117);
        if (!class55.field1432) {
            class100.method861(false);
            class70.method611((byte) -16);
        } else if (class99.field2365 == 0) {
            class126.method1030(false);
        }
        if (class132.field3214 == 1) {
            class37.field946.method584(472, 296);
        }
        if (class100.field2427) {
            short var1 = 507;
            byte var2 = 20;
            client.field529.method979(class20.method189(new class99[] { class23.field557, class5.method31(class32.field779, 10) }, 61), var1, var2, 16776960);
            int var9 = var2 + 15;
            int var3 = 16776960;
            Runtime var4 = Runtime.getRuntime();
            int var5 = (int) ((var4.totalMemory() - var4.freeMemory()) / 1024L);
            if (var5 > 32768 && class27.field684) {
                var3 = 16711680;
            }
            if (var5 > 65536 && !class27.field684) {
                var3 = 16711680;
            }
            client.field529.method979(class20.method189(new class99[] { class55.field1418, class5.method31(var5, 10), class119.field2927 }, 127), var1, var9, var3);
            var9 += 15;
            if (class110.field2745) {
                client.field529.method979(class34.field811, var1, var9, 16711680);
                class110.field2745 = false;
                var9 += 15;
            }
            if (class86.field2154) {
                client.field529.method979(class150.field3705, var1, var9, 16711680);
                var9 += 15;
                class86.field2154 = false;
            }
            if (class121.field2945) {
                client.field529.method979(class67.field1721, var1, var9, 16711680);
                var9 += 15;
                class121.field2945 = false;
            }
        }
        if (class67.field1719 == 0) {
            return;
        }
        int var6 = class67.field1719 / 50;
        int var7 = var6 / 60;
        int var8 = var6 % 60;
        if (var8 >= 10) {
            client.field529.method968(class20.method189(new class99[] { class72.field1834, class5.method31(var7, 10), class97.field2340, class5.method31(var8, 10) }, 68), 4, 329, 16776960);
        } else {
            client.field529.method968(class20.method189(new class99[] { class72.field1834, class5.method31(var7, 10), class15.field353, class5.method31(var8, 10) }, 27), 4, 329, 16776960);
        }
    }
}
