import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public abstract class class82 {

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lp;")
    private static class280 field1346 = class18.method140((byte) -126, "Starting 3d Library");

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lp;")
    public static class280 field1343 = class18.method140((byte) -119, "(U4");

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Lp;")
    public static class280 field1339 = class18.method140((byte) -125, "leuchten2:");

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Lp;")
    private static class280 field1351 = class18.method140((byte) -127, "Loading)3)3)3");

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lp;")
    public static class280 field1340 = field1346;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Lp;")
    public static class280 field1348 = field1351;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field1352 = -1;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Lp;")
    public static class280 field1347 = class18.method140((byte) -127, "<img=0>");

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lp;")
    private static class280 field1344 = class18.method140((byte) -120, "Ok");

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Lp;")
    public static class280 field1354 = field1344;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field1341;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field1342;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public int field1345;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field1349;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "I")
    public int field1353;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)V")
    public abstract void method62(int arg0, int arg1);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V")
    public abstract void method60(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method593(int arg0) {
        field1346 = null;
        field1340 = null;
        field1347 = null;
        field1348 = null;
        field1343 = null;
        field1339 = null;
        field1344 = null;
        field1354 = null;
        if (arg0 >= 21) {
            field1351 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static final void method594(byte arg0) {
        if (class230.field3974 > 1) {
            class83.field1380 = class237.field4118;
            class230.field3974--;
        }
        if (arg0 >= -53) {
            return;
        }
        field1350++;
        if (class252.field4406 > 0) {
            class252.field4406--;
        }
        if (class113.field1888) {
            class113.field1888 = false;
            class4.method56(8364);
            return;
        }
        for (int var1 = 0; var1 < 100 && class28.method251(9532); var1++) {
        }
        if (class162.field2858 != 30) {
            return;
        }
        class154.method1090(class34.field627, 71, 217);
        Object var2 = class252.field4400.field2155;
        synchronized (class252.field4400.field2155) {
            if (!class200.field3504) {
                class252.field4400.field2158 = 0;
            } else if (class175.field3034 != 0 || class252.field4400.field2158 >= 40) {
                class62.field1006++;
                class34.field627.method551(4, true);
                class34.field627.method227(-20435, 0);
                int var3 = class34.field627.field481;
                int var4 = 0;
                for (int var5 = 0; class252.field4400.field2158 > var5 && (class34.field627.field481 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class252.field4400.field2157[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class252.field4400.field2156[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class252.field4400.field2157[var5] == -1 && class252.field4400.field2156[var5] == -1) {
                        var8 = true;
                        var6 = -1;
                        var7 = -1;
                    }
                    if (class160.field2794 != var7 || class118.field2118 != var6) {
                        int var9 = var7 - class160.field2794;
                        class160.field2794 = var7;
                        int var10 = var6 - class118.field2118;
                        class118.field2118 = var6;
                        if (class129.field2242 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class34.field627.method214(-3, (class129.field2242 << 12) + (var9 << 6) + var10);
                            class129.field2242 = 0;
                        } else if (class129.field2242 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class34.field627.method227(-20435, class129.field2242 + 128);
                            var9 += 128;
                            var10 += 128;
                            class34.field627.method214(-3, (var9 << 8) + var10);
                            class129.field2242 = 0;
                        } else if (class129.field2242 < 32) {
                            class34.field627.method227(-20435, class129.field2242 + 192);
                            if (var8) {
                                class34.field627.method231(11510, Integer.MIN_VALUE);
                            } else {
                                class34.field627.method231(11510, var6 << 16 | var7);
                            }
                            class129.field2242 = 0;
                        } else {
                            class34.field627.method214(-3, class129.field2242 + 57344);
                            if (var8) {
                                class34.field627.method231(11510, Integer.MIN_VALUE);
                            } else {
                                class34.field627.method231(11510, var7 | var6 << 16);
                            }
                            class129.field2242 = 0;
                        }
                    } else if (class129.field2242 < 2047) {
                        class129.field2242++;
                    }
                }
                class34.field627.method184((byte) 89, class34.field627.field481 - var3);
                if (var4 < class252.field4400.field2158) {
                    class252.field4400.field2158 -= var4;
                    for (int var11 = 0; var11 < class252.field4400.field2158; var11++) {
                        class252.field4400.field2156[var11] = class252.field4400.field2156[var11 + var4];
                        class252.field4400.field2157[var11] = class252.field4400.field2157[var4 + var11];
                    }
                } else {
                    class252.field4400.field2158 = 0;
                }
            }
        }
        if (class175.field3034 != 0) {
            class90.field1453++;
            long var12 = (class185.field3262 - class193.field3404) / 50L;
            class193.field3404 = class185.field3262;
            int var14 = class98.field1572;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var15 = class187.field3268;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            byte var16 = 0;
            int var17 = (int) var12;
            if (class175.field3034 == 2) {
                var16 = 1;
            }
            class34.field627.method551(228, true);
            class34.field627.method223(var17 | var16 << 15, -3339);
            class34.field627.method225(var14 | var15 << 16, -54);
        }
        if (class86.field1428 > 0) {
            class86.field1428--;
        }
        if (class185.field3267) {
            for (int var18 = 0; var18 < class252.field4413; var18++) {
                int var19 = class187.field3280[var18];
                if (var19 == 98 || var19 == 99 || var19 == 96 || var19 == 97) {
                    class112.field1837 = true;
                    break;
                }
            }
        } else if (class88.field1431[96] || class88.field1431[97] || class88.field1431[98] || class88.field1431[99]) {
            class112.field1837 = true;
        }
        if (class112.field1837 && class86.field1428 <= 0) {
            class112.field1837 = false;
            class89.field1446++;
            class86.field1428 = 20;
            class34.field627.method551(125, true);
            class34.field627.method214(-3, class220.field3759);
            class34.field627.method223(class25.field487, -3339);
        }
        if (class31.field578 && !class81.field1333) {
            class81.field1333 = true;
            class229.field3962++;
            class34.field627.method551(39, true);
            class34.field627.method227(-20435, 1);
        }
        if (!class31.field578 && class81.field1333) {
            class81.field1333 = false;
            class229.field3962++;
            class34.field627.method551(39, true);
            class34.field627.method227(-20435, 0);
        }
        if (!class194.field3424) {
            class34.field627.method551(151, true);
            class34.field627.method225(class264.method1783(true), -30);
            class235.field4099++;
            class194.field3424 = true;
        }
        class31.method268((byte) -97);
        if (class162.field2858 != 30) {
            return;
        }
        class24.method182(-1);
        class173.method1195((byte) -99);
        class276.field4785++;
        if (class276.field4785 > 750) {
            class4.method56(8364);
            return;
        }
        class83.method600(880);
        class41.method316(-13732);
        class54.method398(-100);
        if (class145.field2532 != null) {
            class185.method1291(2);
        }
        for (int var20 = class144.method995(true, true); var20 != -1; var20 = class144.method995(false, true)) {
            class2.method44(false, var20);
            class183.field3217[class214.method1432(31, class41.field706++)] = var20;
        }
        for (class157 var21 = class230.method1547(-13594); var21 != null; var21 = class230.method1547(-13594)) {
            int var22 = var21.method1114((byte) 54);
            int var23 = var21.method1117(25);
            if (var22 == 1) {
                class262.field4621[var23] = var21.field2748;
                class233.field4057[class214.method1432(31, class27.field514++)] = var23;
            } else if (var22 == 2) {
                class17.field315[var23] = var21.field2734;
                class49.field810[class214.method1432(class165.field2894++, 31)] = var23;
            } else if (var22 == 3) {
                class113 var24 = class233.method1569(65535, var23);
                if (!var21.field2734.method1888(var24.field2017, 25648)) {
                    var24.field2017 = var21.field2734;
                    class242.method1642((byte) 58, var24);
                }
            } else if (var22 == 4) {
                class113 var41 = class233.method1569(65535, var23);
                int var42 = var21.field2748;
                int var43 = var21.field2751;
                if (var41.field1923 != var42 || var41.field1970 != var43) {
                    var41.field1970 = var43;
                    var41.field1923 = var42;
                    class242.method1642((byte) 59, var41);
                }
            } else if (var22 == 5) {
                class113 var40 = class233.method1569(65535, var23);
                if (var21.field2748 != var40.field2007 || var21.field2748 == -1) {
                    var40.field1884 = 0;
                    var40.field2007 = var21.field2748;
                    var40.field1912 = 0;
                    class242.method1642((byte) 20, var40);
                }
            } else if (var22 == 6) {
                int var34 = var21.field2748;
                int var35 = var34 >> 10 & 0x1F;
                int var36 = var34 & 0x1F;
                int var37 = var34 >> 5 & 0x1F;
                class113 var38 = class233.method1569(65535, var23);
                int var39 = (var37 << 11) + ((var35 << 19) + (var36 << 3));
                if (var38.field1921 != var39) {
                    var38.field1921 = var39;
                    class242.method1642((byte) 80, var38);
                }
            } else if (var22 == 7) {
                class113 var32 = class233.method1569(65535, var23);
                boolean var33 = var21.field2748 == 1;
                if (var33 != var32.field1924) {
                    var32.field1924 = var33;
                    class242.method1642((byte) 70, var32);
                }
            } else if (var22 == 8) {
                class113 var31 = class233.method1569(65535, var23);
                if (var21.field2748 != var31.field1885 || var21.field2751 != var31.field1918 || var21.field2737 != var31.field1947) {
                    var31.field1918 = var21.field2751;
                    var31.field1885 = var21.field2748;
                    var31.field1947 = var21.field2737;
                    if (var31.field1983 != -1) {
                        if (var31.field1949 > 0) {
                            var31.field1947 = var31.field1947 * 32 / var31.field1949;
                        } else if (var31.field2005 > 0) {
                            var31.field1947 = var31.field1947 * 32 / var31.field2005;
                        }
                    }
                    class242.method1642((byte) 105, var31);
                }
            } else if (var22 == 9) {
                class113 var30 = class233.method1569(65535, var23);
                if (var21.field2748 != var30.field1983 || var21.field2751 != var30.field1993) {
                    var30.field1983 = var21.field2748;
                    var30.field1993 = var21.field2751;
                    class242.method1642((byte) 75, var30);
                }
            } else if (var22 == 10) {
                class113 var25 = class233.method1569(65535, var23);
                if (var21.field2748 != var25.field1997 || var21.field2751 != var25.field2015 || var21.field2737 != var25.field1870) {
                    var25.field1997 = var21.field2748;
                    var25.field2015 = var21.field2751;
                    var25.field1870 = var21.field2737;
                    class242.method1642((byte) 50, var25);
                }
            } else if (var22 == 11) {
                class113 var26 = class233.method1569(65535, var23);
                var26.field1900 = var26.field2022 = var21.field2748;
                var26.field1937 = 0;
                var26.field1897 = var26.field1881 = var21.field2751;
                var26.field2000 = 0;
                class242.method1642((byte) 125, var26);
            } else if (var22 == 12) {
                class113 var27 = class233.method1569(65535, var23);
                int var28 = var21.field2748;
                if (var27 != null && var27.field1879 == 0) {
                    if (var28 > var27.field1875 - var27.field1995) {
                        var28 = var27.field1875 - var27.field1995;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                    if (var27.field2025 != var28) {
                        var27.field2025 = var28;
                        class242.method1642((byte) 95, var27);
                    }
                }
            } else if (var22 == 13) {
                class113 var29 = class233.method1569(65535, var23);
                var29.field1910 = var21.field2748;
            }
        }
        class165.field2889++;
        if (class97.field1563 != 0) {
            class34.field632 += 20;
            if (class34.field632 >= 400) {
                class97.field1563 = 0;
            }
        }
        if (class206.field3575 != null) {
            class153.field2651++;
            if (class153.field2651 >= 15) {
                class242.method1642((byte) 40, class206.field3575);
                class206.field3575 = null;
            }
        }
        if (class221.field3837 != null) {
            class242.method1642((byte) 74, class221.field3837);
            class230.field3978++;
            if (class229.field3957 > (class278.field4874 + 5) || class229.field3957 < class278.field4874 - 5 || class128.field2233 + 5 < class154.field2673 || (class128.field2233 - 5) > class154.field2673) {
                class93.field1509 = true;
            }
            if (class74.field1229 == 0) {
                if (class93.field1509 && class230.field3978 >= 5) {
                    if (class33.field612 == class221.field3837 && class44.field732 != class162.field2857) {
                        class81.field1325++;
                        class113 var44 = class221.field3837;
                        byte var45 = 0;
                        if (class24.field441 == 1 && var44.field1899 == 206) {
                            var45 = 1;
                        }
                        if (var44.field1889[class162.field2857] <= 0) {
                            var45 = 0;
                        }
                        if (class254.method1711((byte) -34, client.method1099(var44))) {
                            int var46 = class44.field732;
                            int var47 = class162.field2857;
                            var44.field1889[var47] = var44.field1889[var46];
                            var44.field1951[var47] = var44.field1951[var46];
                            var44.field1889[var46] = -1;
                            var44.field1951[var46] = 0;
                        } else if (var45 == 1) {
                            int var48 = class44.field732;
                            int var49 = class162.field2857;
                            while (var48 != var49) {
                                if (var48 > var49) {
                                    var44.method788((byte) 109, var48 - 1, var48);
                                    var48--;
                                } else if (var48 < var49) {
                                    var44.method788((byte) 56, var48 + 1, var48);
                                    var48++;
                                }
                            }
                        } else {
                            var44.method788((byte) 90, class162.field2857, class44.field732);
                        }
                        class34.field627.method551(149, true);
                        class34.field627.method235(class221.field3837.field1964, true);
                        class34.field627.method233(83, var45);
                        class34.field627.method228(9949, class162.field2857);
                        class34.field627.method224(class44.field732, 61);
                    }
                } else if ((class13.field269 == 1 || class236.method1587(class157.field2745 - 1, (byte) 95)) && class157.field2745 > 2) {
                    class16.method126(0);
                } else if (class157.field2745 > 0) {
                    class169.method1176((byte) 73);
                }
                class153.field2651 = 10;
                class221.field3837 = null;
                class175.field3034 = 0;
            }
        }
        class266.field4677 = false;
        class224.field3864 = false;
        class252.field4413 = 0;
        class113 var50 = class158.field2766;
        class113 var51 = class185.field3251;
        class226.field3901 = null;
        class158.field2766 = null;
        class185.field3251 = null;
        while (class249.method1683(61) && class252.field4413 < 128) {
            class187.field3280[class252.field4413] = class123.field2165;
            class43.field723[class252.field4413] = class244.field4295;
            class252.field4413++;
        }
        class145.field2532 = null;
        if (class246.field4315 != -1) {
            class140.method973(0, 0, 0, class103.field1724, 54, class190.field3328, class246.field4315, 0);
        }
        class237.field4118++;
        while (true) {
            class178 var52;
            class113 var53;
            class113 var54;
            do {
                var52 = (class178) class92.field1498.method642(2);
                if (var52 == null) {
                    while (true) {
                        class178 var55;
                        class113 var56;
                        class113 var57;
                        do {
                            var55 = (class178) class244.field4292.method642(2);
                            if (var55 == null) {
                                while (true) {
                                    class178 var58;
                                    class113 var59;
                                    class113 var60;
                                    do {
                                        var58 = (class178) class43.field722.method642(2);
                                        if (var58 == null) {
                                            if (class167.field2929 && class145.field2532 == null) {
                                                class167.field2929 = false;
                                            }
                                            if (class57.field927 != null) {
                                                class28.method249(false);
                                            }
                                            if (class129.field2238 > 0 && class88.field1431[82] && class88.field1431[81] && class19.field365 != 0) {
                                                int var61 = class231.field4013 - class19.field365;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class207.method1399(class262.field4631.field4837[0] + class49.field806, var61, 29607, class262.field4631.field4792[0] + class91.field1480);
                                            }
                                            if (class129.field2238 > 0 && class88.field1431[82] && class88.field1431[81]) {
                                                if (class115.field2091 != -1) {
                                                    class207.method1399(class49.field806 + class115.field2091, class231.field4013, 29607, class91.field1480 + class147.field2560);
                                                }
                                                class55.field896 = 0;
                                                class176.field3071 = 0;
                                            } else if (class176.field3071 == 2) {
                                                if (class115.field2091 != -1) {
                                                    class197.field3456++;
                                                    class34.field627.method551(7, true);
                                                    class34.field627.method224(class49.field806 + class115.field2091, 52);
                                                    class34.field627.method209(125, class235.field4098);
                                                    class34.field627.method223(class28.field529, -3339);
                                                    class34.field627.method214(-3, class91.field1480 + class147.field2560);
                                                    class22.field401 = class187.field3268;
                                                    class34.field632 = 0;
                                                    class97.field1563 = 1;
                                                    class60.field964 = class98.field1572;
                                                }
                                                class176.field3071 = 0;
                                            } else if (class55.field896 == 2) {
                                                if (class115.field2091 != -1) {
                                                    class17.field313++;
                                                    class34.field627.method551(36, true);
                                                    class34.field627.method224(class49.field806 + class115.field2091, 119);
                                                    class34.field627.method223(class91.field1480 + class147.field2560, -3339);
                                                    class97.field1563 = 1;
                                                    class34.field632 = 0;
                                                    class60.field964 = class98.field1572;
                                                    class22.field401 = class187.field3268;
                                                }
                                                class55.field896 = 0;
                                            } else if (class115.field2091 != -1 && class176.field3071 == 0 && class55.field896 == 0) {
                                                boolean var62 = class49.method362(0, class115.field2091, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 0, class147.field2560, 0, true, 0, 0);
                                                if (var62) {
                                                    class60.field964 = class98.field1572;
                                                    class34.field632 = 0;
                                                    class97.field1563 = 1;
                                                    class22.field401 = class187.field3268;
                                                }
                                            }
                                            class115.field2091 = -1;
                                            class149.method1030(-49);
                                            if (class185.field3251 != var51) {
                                                if (var51 != null) {
                                                    class242.method1642((byte) 42, var51);
                                                }
                                                if (class185.field3251 != null) {
                                                    class242.method1642((byte) 55, class185.field3251);
                                                }
                                            }
                                            if (class158.field2766 != var50 && class30.field572 == class145.field2528) {
                                                if (var50 != null) {
                                                    class242.method1642((byte) 25, var50);
                                                }
                                                if (class158.field2766 != null) {
                                                    class242.method1642((byte) 32, class158.field2766);
                                                }
                                            }
                                            if (class158.field2766 == null) {
                                                if (class145.field2528 > 0) {
                                                    class145.field2528--;
                                                }
                                            } else if (class145.field2528 < class30.field572) {
                                                class145.field2528++;
                                                if (class30.field572 == class145.field2528) {
                                                    class242.method1642((byte) 25, class158.field2766);
                                                }
                                            }
                                            if (class4.field113 == 1) {
                                                class266.method1787(17);
                                            } else if (class4.field113 == 2) {
                                                class104.method731(-29732);
                                            } else {
                                                class148.method1027((byte) 125);
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class245.field4307[var63]++;
                                            }
                                            int var64 = class233.method1571(true);
                                            int var65 = class187.method1309(false);
                                            if (var64 > 15000 && var65 > 15000) {
                                                class65.field1085++;
                                                class252.field4406 = 250;
                                                class262.method1771(111, 14500);
                                                class34.field627.method551(153, true);
                                            }
                                            if (class255.field4509 != null && class255.field4509.field3025 == 1) {
                                                if (class255.field4509.field3028 != null) {
                                                    class199.method1370(class101.field1643, class57.field918, -1);
                                                }
                                                class255.field4509 = null;
                                                class57.field918 = false;
                                                class101.field1643 = null;
                                            }
                                            class1.field2++;
                                            class134.field2378++;
                                            class9.field195++;
                                            if (class1.field2 > 500) {
                                                class1.field2 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x4) == 4) {
                                                    class210.field3615 += class115.field2084;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class277.field4847 += class160.field2798;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class120.field2134 += class55.field901;
                                                }
                                            }
                                            if (class120.field2134 < -50) {
                                                class55.field901 = 2;
                                            }
                                            if (class210.field3615 < -40) {
                                                class115.field2084 = 1;
                                            }
                                            if (class9.field195 > 500) {
                                                class9.field195 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x1) == 1) {
                                                    class273.field4756 += class190.field3330;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class142.field2461 += class177.field3073;
                                                }
                                            }
                                            if (class120.field2134 > 50) {
                                                class55.field901 = -2;
                                            }
                                            if (class210.field3615 > 40) {
                                                class115.field2084 = -1;
                                            }
                                            if (class277.field4847 < -55) {
                                                class160.field2798 = 2;
                                            }
                                            if (class277.field4847 > 55) {
                                                class160.field2798 = -2;
                                            }
                                            if (class142.field2461 < -20) {
                                                class177.field3073 = 1;
                                            }
                                            if (class142.field2461 > 10) {
                                                class177.field3073 = -1;
                                            }
                                            if (class273.field4756 < -60) {
                                                class190.field3330 = 2;
                                            }
                                            if (class273.field4756 > 60) {
                                                class190.field3330 = -2;
                                            }
                                            if (class134.field2378 > 50) {
                                                class34.field627.method551(41, true);
                                                class133.field2365++;
                                            }
                                            if (class47.field776) {
                                                class226.method1523((byte) 46);
                                                class47.field776 = false;
                                            }
                                            try {
                                                if (class44.field727 != null && class34.field627.field481 > 0) {
                                                    class44.field727.method1526(class34.field627.field481, 49, 0, class34.field627.field475);
                                                    class34.field627.field481 = 0;
                                                    class134.field2378 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class4.method56(8364);
                                                return;
                                            }
                                        }
                                        var59 = var58.field3106;
                                        if (var59.field1955 < 0) {
                                            break;
                                        }
                                        var60 = class233.method1569(65535, var59.field1998);
                                    } while (var60 == null || var60.field1865 == null || var59.field1955 >= var60.field1865.length || var60.field1865[var59.field1955] != var59);
                                    class199.method1371(200000, var58);
                                }
                            }
                            var56 = var55.field3106;
                            if (var56.field1955 < 0) {
                                break;
                            }
                            var57 = class233.method1569(65535, var56.field1998);
                        } while (var57 == null || var57.field1865 == null || var56.field1955 >= var57.field1865.length || var57.field1865[var56.field1955] != var56);
                        class199.method1371(200000, var55);
                    }
                }
                var53 = var52.field3106;
                if (var53.field1955 < 0) {
                    break;
                }
                var54 = class233.method1569(65535, var53.field1998);
            } while (var54 == null || var54.field1865 == null || var53.field1955 >= var54.field1865.length || var54.field1865[var53.field1955] != var53);
            class199.method1371(200000, var52);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lua;IIBI)V")
    public static final void method595(class113 arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1338++;
        if (class205.field3563 < 3) {
            ((class223) class182.field3208).method1295(arg4, arg2, arg0.field1869, arg0.field1995, class182.field3208.field1785 / 2, class182.field3208.field1791 / 2, class25.field487, 256, arg0.field1999, arg0.field2011);
        } else {
            class151.method1065(arg4, arg2, 0, arg0.field1999, arg0.field2011);
        }
        if (arg3 == 60) {
            class120.field2130[arg1] = true;
        }
    }
}
