import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class99 extends class445 {

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public int field1439;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "I")
    public int field1446;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "Z")
    public boolean field1443;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public int field1441;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "Lh;")
    public static class434 field1444 = new class434(14, 6);

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "Lr;")
    public static class110 field1449;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "[Ljd;")
    public static class139[] field1442;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
    public static final void method608(int arg0) {
        if (class127.field1869 > 0) {
            class127.field1869--;
        }
        if (class370.field5068 > 1) {
            class370.field5068--;
            class369.field5062 = class236.field3123;
        }
        field1440++;
        if (class330.field4382) {
            class330.field4382 = false;
            class412.method2474((byte) 114);
            return;
        }
        if (!class385.field5334) {
            class358.method2193((byte) 115);
        }
        for (int var1 = 0; var1 < 100 && class148.method880((byte) -16); var1++) {
        }
        if (class18.field258 != 30) {
            return;
        }
        class268.method1526(10, class203.field2751, class67.field909.method516(-5544));
        if (class299.field4003 == null) {
            if (class440.method2583(25267) >= class385.field5339) {
                class299.field4003 = class348.field4795.method2182(class168.field2325, (byte) -118);
            }
        } else if (class299.field4003.field574 != -1) {
            class491.method2861(class326.field4339, 1);
            class203.field2751.method229(class299.field4003.field574, 1309449544);
            class299.field4003 = null;
            class385.field5339 = class440.method2583(25267) + 30000L;
        }
        if (class187.field2569 != null || class11.field136 < (class440.method2583(25267) - 2000L)) {
            boolean var2 = false;
            int var3 = class203.field2751.field456;
            for (class317 var4 = (class317) class270.field3601.method652((byte) 37); var4 != null && (class203.field2751.field456 - var3) < 240; var4 = (class317) class270.field3601.method653(arg0 - 4585)) {
                var4.method2614((byte) -100);
                int var5 = var4.method1549((byte) 108);
                if (var5 < 0) {
                    var5 = 0;
                } else if (var5 > 65534) {
                    var5 = 65534;
                }
                int var6 = var4.method1551(128);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                boolean var7 = false;
                if (var4.method1549((byte) 108) == -1 && var4.method1551(128) == -1) {
                    var6 = -1;
                    var7 = true;
                    var5 = -1;
                }
                if (class19.field268 != var6 || class35.field542 != var5) {
                    if (!var2) {
                        class21.field285++;
                        class491.method2861(class491.field6837, 1);
                        class203.field2751.method228(0, 32);
                        var3 = class203.field2751.field456;
                        var2 = true;
                    }
                    int var8 = var6 - class19.field268;
                    class19.field268 = var6;
                    int var9 = var5 - class35.field542;
                    class35.field542 = var5;
                    int var10 = (int) ((var4.method1554((byte) -15) - class11.field136) / 20L);
                    if (var10 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                        var8 += 32;
                        var9 += 32;
                        class203.field2751.method229((var8 << 6) + (var10 << 12) + var9, arg0 + 1309444864);
                    } else if (var10 < 32 && var8 >= -128 && var8 <= 127 && var9 >= -128 && var9 <= 127) {
                        var9 += 128;
                        var8 += 128;
                        class203.field2751.method228(var10 + 128, 32);
                        class203.field2751.method229((var8 << 8) + var9, 1309449544);
                    } else if (var10 >= 32) {
                        class203.field2751.method229(var10 + 57344, 1309449544);
                        if (var7) {
                            class203.field2751.method199((byte) -117, Integer.MIN_VALUE);
                        } else {
                            class203.field2751.method199((byte) -117, var6 | var5 << 16);
                        }
                    } else {
                        class203.field2751.method228(var10 + 192, arg0 ^ 0x1268);
                        if (var7) {
                            class203.field2751.method199((byte) -117, Integer.MIN_VALUE);
                        } else {
                            class203.field2751.method199((byte) -117, var5 << 16 | var6);
                        }
                    }
                    class11.field136 = var4.method1554((byte) -15);
                }
            }
            if (var2) {
                class203.field2751.method247(true, class203.field2751.field456 - var3);
            }
        }
        if (class187.field2569 != null) {
            long var11 = (class187.field2569.method1554((byte) -15) - class89.field1309) / 50L;
            if (var11 > 32767L) {
                var11 = 32767L;
            }
            class89.field1309 = class187.field2569.method1554((byte) -15);
            int var13 = class187.field2569.method1549((byte) 108);
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var14 = class187.field2569.method1551(128);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var15 = 0;
            if (class187.field2569.method1546(true) == 2) {
                var15 = 1;
            }
            class491.method2861(class94.field1397, 1);
            class190.field2586++;
            int var16 = (int) var11;
            class203.field2751.method229(var15 << 15 | var16, 1309449544);
            class203.field2751.method234((byte) 79, var14 | var13 << 16);
        }
        if (class150.field2120 > 0) {
            int var17 = 0;
            for (int var18 = 0; var18 < class150.field2120; var18++) {
                if (class375.field5173[var18].method146((byte) -119)) {
                    var17++;
                }
            }
            if (var17 > 0) {
                class491.method2861(class469.field6474, 1);
                class222.field2957++;
                if (var17 > 75) {
                    var17 = 75;
                }
                class203.field2751.method228(var17 * 3, arg0 ^ 0x1268);
                for (int var19 = 0; var19 < class150.field2120; var19++) {
                    class25 var20 = class375.field5173[var19];
                    if (var20.method146((byte) 124)) {
                        long var21 = (var20.method144(-22407) - class103.field1498) / 50L;
                        class103.field1498 = var20.method144(arg0 ^ 0xFFFFBA31);
                        if (var21 > 65535L) {
                            var21 = 65535L;
                        }
                        class203.field2751.method228(var20.method148(-26944), 32);
                        class203.field2751.method229((int) var21, arg0 ^ 0x4E0C8F00);
                    }
                }
            }
        }
        if (class79.field1058 > 0) {
            class79.field1058--;
        }
        if (class82.field1094 && class79.field1058 <= 0) {
            class49.field649++;
            class82.field1094 = false;
            class79.field1058 = 20;
            class491.method2861(class161.field2229, 1);
            class203.field2751.method229((int) class270.field3610 >> 3, 1309449544);
            class203.field2751.method216((int) class239.field3186 >> 3, -1);
        }
        if (class39.field569 && !class343.field4602) {
            class343.field4602 = true;
            class246.field3287++;
            class491.method2861(class39.field568, arg0 - 4679);
            class203.field2751.method228(1, 32);
        }
        if (!class39.field569 && class343.field4602) {
            class246.field3287++;
            class343.field4602 = false;
            class491.method2861(class39.field568, 1);
            class203.field2751.method228(0, 32);
        }
        if (!class464.field6399) {
            class491.method2861(class235.field3112, 1);
            class13.field174++;
            class203.field2751.method228(0, 32);
            int var23 = class203.field2751.field456;
            class32 var24 = class488.field6789.method2414(-2);
            class203.field2751.method243((byte) 125, 0, var24.field472, var24.field456);
            class203.field2751.method247(true, class203.field2751.field456 - var23);
            class464.field6399 = true;
        }
        if (class289.field3897 != null) {
            if (class56.field772 == 2) {
                class492.method2868(-13161);
            } else if (class56.field772 == 3) {
                class317.method1740((byte) 85);
            }
        }
        if (class76.field1030) {
            class76.field1030 = false;
        } else {
            class63.field842 /= 2.0F;
        }
        if (class446.field6074) {
            class446.field6074 = false;
        } else {
            class216.field2912 /= 2.0F;
        }
        class51.method357(false);
        if (class18.field258 != 30) {
            return;
        }
        class458.method2690((byte) 86);
        class223.method1262(13116);
        class462.method2719(17477);
        class168.method993(1);
        class475.field6535++;
        if (class475.field6535 > 750) {
            class412.method2474((byte) 114);
            return;
        }
        class247.method1382(0);
        class209.method1193((byte) -112);
        class259.method1459(true);
        for (int var25 = class38.field562.method1946(123, true); var25 != -1; var25 = class38.field562.method1946(arg0 - 4555, false)) {
            class311.method1709(arg0 ^ 0x108E, var25);
            class297.field3981[method612(class413.field5651++, 31)] = var25;
        }
        for (class106 var26 = class450.method2648(-75); var26 != null; var26 = class450.method2648(-80)) {
            int var27 = var26.method654(1509384992);
            int var28 = var26.method656((byte) -128);
            if (var27 == 1) {
                class311.field4102[var28] = var26.field1589;
                class485.field6703 |= class387.field5359[var28];
                class76.field1032[method612(class226.field2977++, 31)] = var28;
            } else if (var27 == 2) {
                class311.field4098[var28] = var26.field1583;
                class26.field343[method612(31, class261.field3468++)] = var28;
            } else if (var27 == 3) {
                class464 var29 = class150.method888((byte) -115, var28);
                if (!var26.field1583.equals(var29.field6439)) {
                    var29.field6439 = var26.field1583;
                    class490.method2854(var29, (byte) 58);
                }
            } else if (var27 == 4) {
                class464 var47 = class150.method888((byte) -115, var28);
                int var48 = var26.field1589;
                int var49 = var26.field1590;
                int var50 = var26.field1584;
                if (var47.field6380 != var48 || var47.field6431 != var49 || var47.field6289 != var50) {
                    var47.field6431 = var49;
                    var47.field6289 = var50;
                    var47.field6380 = var48;
                    class490.method2854(var47, (byte) 109);
                }
            } else if (var27 == 5) {
                class464 var46 = class150.method888((byte) -115, var28);
                if (var26.field1589 != var46.field6401 || var26.field1589 == -1) {
                    var46.field6438 = 1;
                    var46.field6307 = 0;
                    var46.field6401 = var26.field1589;
                    var46.field6370 = 0;
                    class490.method2854(var46, (byte) 64);
                }
            } else if (var27 == 6) {
                int var40 = var26.field1589;
                int var41 = (var40 & 0x7D6E) >> 10;
                int var42 = var40 >> 5 & 0x1F;
                int var43 = var40 & 0x1F;
                int var44 = (var41 << 19) + ((var42 << 11) + (var43 << 3));
                class464 var45 = class150.method888((byte) -115, var28);
                if (var45.field6382 != var44) {
                    var45.field6382 = var44;
                    class490.method2854(var45, (byte) 106);
                }
            } else if (var27 == 7) {
                class464 var38 = class150.method888((byte) -115, var28);
                boolean var39 = var26.field1589 == 1;
                if (var38.field6348 != var39) {
                    var38.field6348 = var39;
                    class490.method2854(var38, (byte) 37);
                }
            } else if (var27 == 8) {
                class464 var37 = class150.method888((byte) -115, var28);
                if (var26.field1589 != var37.field6445 || var26.field1590 != var37.field6361 || var26.field1584 != var37.field6324) {
                    var37.field6324 = var26.field1584;
                    var37.field6361 = var26.field1590;
                    var37.field6445 = var26.field1589;
                    if (var37.field6402 != -1) {
                        if (var37.field6314 > 0) {
                            var37.field6324 = var37.field6324 * 32 / var37.field6314;
                        } else if (var37.field6392 > 0) {
                            var37.field6324 = var37.field6324 * 32 / var37.field6392;
                        }
                    }
                    class490.method2854(var37, (byte) 55);
                }
            } else if (var27 == 9) {
                class464 var30 = class150.method888((byte) -115, var28);
                if (var26.field1589 != var30.field6402 || var26.field1590 != var30.field6294) {
                    var30.field6294 = var26.field1590;
                    var30.field6402 = var26.field1589;
                    class490.method2854(var30, (byte) 82);
                }
            } else if (var27 == 10) {
                class464 var31 = class150.method888((byte) -115, var28);
                if (var26.field1589 != var31.field6365 || var26.field1590 != var31.field6312 || var26.field1584 != var31.field6443) {
                    var31.field6443 = var26.field1584;
                    var31.field6365 = var26.field1589;
                    var31.field6312 = var26.field1590;
                    class490.method2854(var31, (byte) 36);
                }
            } else if (var27 == 11) {
                class464 var36 = class150.method888((byte) -115, var28);
                var36.field6426 = 0;
                var36.field6407 = 0;
                var36.field6323 = var36.field6310 = var26.field1590;
                var36.field6412 = var36.field6298 = var26.field1589;
                class490.method2854(var36, (byte) 92);
            } else if (var27 == 12) {
                class464 var34 = class150.method888((byte) -115, var28);
                int var35 = var26.field1589;
                if (var34 != null && var34.field6358 == 0) {
                    if (var35 > var34.field6346 - var34.field6340) {
                        var35 = var34.field6346 - var34.field6340;
                    }
                    if (var35 < 0) {
                        var35 = 0;
                    }
                    if (var34.field6333 != var35) {
                        var34.field6333 = var35;
                        class490.method2854(var34, (byte) 86);
                    }
                }
            } else if (var27 == 14) {
                class464 var32 = class150.method888((byte) -115, var28);
                var32.field6393 = var26.field1589;
            } else if (var27 == 15) {
                class124.field1817 = var26.field1590;
                class187.field2565 = true;
                class345.field4761 = var26.field1589;
            } else if (var27 == 16) {
                class464 var33 = class150.method888((byte) -115, var28);
                var33.field6441 = var26.field1589;
            }
        }
        if (class369.field5063 != 0) {
            class175.field2392 += 20;
            if (class175.field2392 >= 400) {
                class369.field5063 = 0;
            }
        }
        class448.field6098++;
        if (class3.field41 != null) {
            class106.field1593++;
            if (class106.field1593 >= 15) {
                class490.method2854(class3.field41, (byte) 57);
                class3.field41 = null;
            }
        }
        class181.field2492 = null;
        class114.field1719 = null;
        class135.field1970 = false;
        class65.field866 = false;
        class80.method524(-1, (class464) null, -1, arg0 ^ arg0);
        class453.method2659(-1, 82, (class464) null, -1);
        class428.method2520(-127);
        class236.field3123++;
        if (class177.field2407) {
            class491.method2861(class112.field1691, 1);
            class206.field2792++;
            class203.field2751.method234((byte) 79, class47.field634 << 28 | class296.field3958 << 14 | class348.field4798);
            class177.field2407 = false;
        }
        while (true) {
            class82 var51;
            class464 var52;
            class464 var53;
            do {
                var51 = (class82) class400.field5500.method650((byte) -3);
                if (var51 == null) {
                    while (true) {
                        class82 var54;
                        class464 var55;
                        class464 var56;
                        do {
                            var54 = (class82) class78.field1050.method650((byte) -3);
                            if (var54 == null) {
                                while (true) {
                                    class82 var57;
                                    class464 var58;
                                    class464 var59;
                                    do {
                                        var57 = (class82) class245.field3272.method650((byte) -3);
                                        if (var57 == null) {
                                            if (class181.field2492 == null) {
                                                class23.field308 = 0;
                                            }
                                            if (class385.field5314 != null) {
                                                class434.method2559((byte) -103);
                                            }
                                            if (class348.field4799 > 0 && class449.field6111.method882((byte) 87, 82) && class449.field6111.method882((byte) 68, 81) && class416.field5659 != 0) {
                                                int var60 = class233.field3103.field6502 - class416.field5659;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class150.method889(var60, (byte) 114, class266.field3511 + class233.field3103.field1197[0], class233.field3103.field1193[0] + class162.field2260);
                                            }
                                            class154.method906((byte) -116);
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class409.field5604[var61]++;
                                            }
                                            if (class485.field6703 && class385.field5329 < (class440.method2583(25267) - 60000L)) {
                                                class342.method1940(false);
                                            }
                                            class310.field4097++;
                                            if (class310.field4097 > 500) {
                                                class310.field4097 = 0;
                                                int var62 = (int) (Math.random() * 8.0D);
                                                if ((var62 & 0x4) == 4) {
                                                    class41.field582 += class391.field5427;
                                                }
                                                if ((var62 & 0x1) == 1) {
                                                    class27.field365 += class455.field6173;
                                                }
                                                if ((var62 & 0x2) == 2) {
                                                    class307.field4058 += class484.field6699;
                                                }
                                            }
                                            if (class27.field365 < -50) {
                                                class455.field6173 = 2;
                                            }
                                            if (class307.field4058 < -55) {
                                                class484.field6699 = 2;
                                            }
                                            if (class27.field365 > 50) {
                                                class455.field6173 = -2;
                                            }
                                            if (class41.field582 < -40) {
                                                class391.field5427 = 1;
                                            }
                                            if (class307.field4058 > 55) {
                                                class484.field6699 = -2;
                                            }
                                            class324.field4327++;
                                            if (class41.field582 > 40) {
                                                class391.field5427 = -1;
                                            }
                                            if (class324.field4327 > 500) {
                                                class324.field4327 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x1) == 1) {
                                                    class150.field2119 += class228.field3003;
                                                }
                                                if ((var63 & 0x2) == 2) {
                                                    class429.field5795 += class183.field2515;
                                                }
                                            }
                                            if (class150.field2119 < -60) {
                                                class228.field3003 = 2;
                                            }
                                            if (class150.field2119 > 60) {
                                                class228.field3003 = -2;
                                            }
                                            if (class429.field5795 < -20) {
                                                class183.field2515 = 1;
                                            }
                                            class281.field3784++;
                                            if (class429.field5795 > 10) {
                                                class183.field2515 = -1;
                                            }
                                            if (class281.field3784 > 50) {
                                                class491.method2861(class272.field3616, 1);
                                                class251.field3353++;
                                            }
                                            if (class402.field5525) {
                                                class248.method1391(-123);
                                                class402.field5525 = false;
                                            }
                                            try {
                                                if (class280.field3743 != null && class203.field2751.field456 > 0) {
                                                    class77.field1035 += class203.field2751.field456;
                                                    class280.field3743.method2308(false, 0, class203.field2751.field456, class203.field2751.field472);
                                                    class281.field3784 = 0;
                                                    class203.field2751.field456 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var64) {
                                                class412.method2474((byte) 114);
                                                return;
                                            }
                                        }
                                        var58 = var57.field1086;
                                        if (var58.field6397 < 0) {
                                            break;
                                        }
                                        var59 = class150.method888((byte) -115, var58.field6362);
                                    } while (var59 == null || var59.field6360 == null || var59.field6360.length <= var58.field6397 || var59.field6360[var58.field6397] != var58);
                                    class382.method2340(var57);
                                }
                            }
                            var55 = var54.field1086;
                            if (var55.field6397 < 0) {
                                break;
                            }
                            var56 = class150.method888((byte) -115, var55.field6362);
                        } while (var56 == null || var56.field6360 == null || var56.field6360.length <= var55.field6397 || var56.field6360[var55.field6397] != var55);
                        class382.method2340(var54);
                    }
                }
                var52 = var51.field1086;
                if (var52.field6397 < 0) {
                    break;
                }
                var53 = class150.method888((byte) -115, var52.field6362);
            } while (var53 == null || var53.field6360 == null || var53.field6360.length <= var52.field6397 || var53.field6360[var52.field6397] != var52);
            class382.method2340(var51);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIILed;I)V")
    public static final void method609(int arg0, int arg1, int arg2, class459 arg3, int arg4) {
        field1447++;
        if (arg2 != 30755) {
            method609(-15, -16, -73, (class459) null, 42);
        }
        long var5 = (long) (arg1 | arg4 << 28 | arg0 << 14);
        class223 var7 = (class223) class33.field505.method1528(var5, 60);
        if (var7 == null) {
            class223 var8 = new class223();
            class33.field505.method1525((byte) 19, var8, var5);
            var8.field2963.method641(arg3, (byte) -93);
            return;
        }
        class443 var9 = class175.field2385.method1557(arg3.field6222, 21992);
        int var10 = var9.field5982;
        if (var9.field6016 == 1) {
            var10 = (arg3.field6224 + 1) * var10;
        }
        for (class459 var11 = (class459) var7.field2963.method652((byte) 37); var11 != null; var11 = (class459) var7.field2963.method653(82)) {
            class443 var12 = class175.field2385.method1557(var11.field6222, 21992);
            int var13 = var12.field5982;
            if (var12.field6016 == 1) {
                var13 = (var11.field6224 + 1) * var13;
            }
            if (var10 > var13) {
                class429.method2538(arg3, (byte) 86, var11);
                return;
            }
        }
        var7.field2963.method641(arg3, (byte) -93);
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
    public static void method610(int arg0) {
        field1442 = null;
        int var1 = 97 % ((arg0 - 76) / 49);
        field1449 = null;
        field1444 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V")
    public static final void method611(int arg0, boolean arg1) {
        field1450++;
        class106 var2 = class250.method1400(14, -30, arg0);
        if (!arg1) {
            var2.method659(124);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)I")
    public static int method612(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(IIIIIZ)V")
    public class99(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1439 = arg3;
        this.field1446 = arg1;
        this.field1443 = arg5;
        this.field1441 = arg4;
        this.field1445 = arg2;
        this.field1448 = arg0;
    }
}
