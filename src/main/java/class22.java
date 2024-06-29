import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class22 extends class106 {

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "[I")
    public static int[] field262 = new int[5];

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "Loa;")
    public static class99 field258 = class221.method1463(2844, "Hierhin drehen");

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "I")
    public static int field265 = 5063219;

    @OriginalMember(owner = "client!wd", name = "jb", descriptor = "Loa;")
    private static class99 field267 = class221.method1463(2844, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "Loa;")
    public static class99 field257 = field267;

    @OriginalMember(owner = "client!wd", name = "nb", descriptor = "S")
    public static short field271 = 256;

    @OriginalMember(owner = "client!wd", name = "kb", descriptor = "B")
    public byte field268;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
    public int field263;

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!wd", name = "mb", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!wd", name = "ib", descriptor = "Lbj;")
    public static class155 field266;

    @OriginalMember(owner = "client!wd", name = "lb", descriptor = "Lik;")
    public class261 field269;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "Li;")
    public static class56 field259;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "[[[S")
    public static short[][][] field256;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "(I)V")
    public static void method128(int arg0) {
        field262 = null;
        int var1 = 103 % ((16 - arg0) / 39);
        field258 = null;
        field267 = null;
        field256 = null;
        field257 = null;
        field266 = null;
        field259 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V")
    public static final void method129(int arg0, int arg1) {
        ++field254;
        class9 var2 = (class9) class277.field4868.method1550(true, (long) arg0);
        if (arg1 != -6) {
            field262 = null;
        }
        if (var2 != null) {
            var2.method828((byte) -60);
        }
    }

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "(I)V")
    public static final void method130(int arg0) {
        if (~class187.field3313 < -1) {
            --class187.field3313;
        }
        if (~class77.field1364 < -2) {
            --class77.field1364;
            class21.field244 = class28.field514;
        }
        ++field270;
        if (class79.field1398) {
            class79.field1398 = false;
            class230.method1507(-118);
        } else {
            for (int var1 = 0; ~var1 > -101 && class196.method1319(-124); ++var1) {
            }
            if (~class156.field2808 == -31) {
                class138.method945(class131.field2277, arg0 + 2046862473, 13);
                Object var2 = class278.field4888.field2595;
                synchronized (class278.field4888.field2595) {
                    if (!class261.field4597) {
                        class278.field4888.field2596 = 0;
                    } else if (class21.field243 != 0 || ~class278.field4888.field2596 <= -41) {
                        ++class40.field672;
                        int var3 = 0;
                        class131.field2277.method966((byte) 49, 65);
                        class131.field2277.method1691(0, (byte) 53);
                        int var4 = class131.field2277.field4587;
                        for (int var5 = 0; class278.field4888.field2596 > var5 && ~(class131.field2277.field4587 - var4) > -241; ++var5) {
                            ++var3;
                            int var6 = class278.field4888.field2598[var5];
                            if (~var6 <= -1) {
                                if (var6 > 65534) {
                                    var6 = 65534;
                                }
                            } else {
                                var6 = 0;
                            }
                            int var7 = class278.field4888.field2597[var5];
                            boolean var8 = false;
                            if (~var7 > -1) {
                                var7 = 0;
                            } else if (~var7 < -65535) {
                                var7 = 65534;
                            }
                            if (class278.field4888.field2598[var5] == -1 && ~class278.field4888.field2597[var5] == 0) {
                                var7 = -1;
                                var6 = -1;
                                var8 = true;
                            }
                            if (~class227.field3929 == ~var7 && ~class214.field3721 == ~var6) {
                                if (class193.field3404 < 2047) {
                                    ++class193.field3404;
                                }
                            } else {
                                int var9 = -class227.field3929 + var7;
                                class227.field3929 = var7;
                                int var10 = var6 - class214.field3721;
                                class214.field3721 = var6;
                                if (~class193.field3404 > -9 && ~var9 <= 31 && var9 <= 31 && var10 >= -32 && ~var10 >= -32) {
                                    var10 += 32;
                                    var9 += 32;
                                    class131.field2277.method1745((var9 << 6) + (class193.field3404 << 12) + var10, (byte) 5);
                                    class193.field3404 = 0;
                                } else if (~class193.field3404 > -33 && var9 >= -128 && ~var9 >= -128 && var10 >= -128 && ~var10 >= -128) {
                                    var10 += 128;
                                    var9 += 128;
                                    class131.field2277.method1691(class193.field3404 + 128, (byte) 53);
                                    class131.field2277.method1745((var9 << 8) + var10, (byte) 5);
                                    class193.field3404 = 0;
                                } else if (~class193.field3404 > -33) {
                                    class131.field2277.method1691(class193.field3404 + 192, (byte) 53);
                                    if (var8) {
                                        class131.field2277.method1701(Integer.MIN_VALUE, 4994);
                                    } else {
                                        class131.field2277.method1701(var7 | var6 << 16, 4994);
                                    }
                                    class193.field3404 = 0;
                                } else {
                                    class131.field2277.method1745(class193.field3404 + 57344, (byte) 5);
                                    if (!var8) {
                                        class131.field2277.method1701(var7 | var6 << 16, 4994);
                                    } else {
                                        class131.field2277.method1701(Integer.MIN_VALUE, 4994);
                                    }
                                    class193.field3404 = 0;
                                }
                            }
                        }
                        class131.field2277.method1724(-var4 + class131.field2277.field4587, (byte) 79);
                        if (var3 >= class278.field4888.field2596) {
                            class278.field4888.field2596 = 0;
                        } else {
                            class278.field4888.field2596 -= var3;
                            for (int var11 = 0; ~var11 > ~class278.field4888.field2596; ++var11) {
                                class278.field4888.field2597[var11] = class278.field4888.field2597[var3 + var11];
                                class278.field4888.field2598[var11] = class278.field4888.field2598[var11 - -var3];
                            }
                        }
                    }
                }
                if (class21.field243 != 0) {
                    ++class156.field2800;
                    long var12 = (-class127.field2217 + class247.field4249) / 50L;
                    class127.field2217 = class247.field4249;
                    if (var12 > 32767L) {
                        var12 = 32767L;
                    }
                    int var14 = class11.field97;
                    int var15 = class122.field2133;
                    if (var15 < 0) {
                        var15 = 0;
                    } else if (var15 > 65535) {
                        var15 = 65535;
                    }
                    byte var16 = 0;
                    if (~class21.field243 == -3) {
                        var16 = 1;
                    }
                    if (~var14 <= -1) {
                        if (~var14 < -65536) {
                            var14 = 65535;
                        }
                    } else {
                        var14 = 0;
                    }
                    class131.field2277.method966((byte) 49, 19);
                    int var17 = (int) var12;
                    class131.field2277.method1750(var14 | var15 << 16, 8248);
                    class131.field2277.method1745(var17 | var16 << 15, (byte) 5);
                }
                if (~class12.field109 < -1) {
                    --class12.field109;
                }
                if (class3.field34) {
                    for (int var18 = 0; ~class124.field2176 < ~var18; ++var18) {
                        int var19 = class180.field3131[var18];
                        if (~var19 == -99 || ~var19 == -100 || var19 == 96 || var19 == 97) {
                            class73.field1226 = true;
                            break;
                        }
                    }
                } else if (class51.field839[96] || class51.field839[97] || class51.field839[98] || class51.field839[99]) {
                    class73.field1226 = true;
                }
                if (class73.field1226 && ~class12.field109 >= -1) {
                    class73.field1226 = false;
                    ++class21.field245;
                    class12.field109 = 20;
                    class131.field2277.method966((byte) 49, 3);
                    class131.field2277.method1726(arg0 + -1648604744, class239.field4129);
                    class131.field2277.method1723(class160.field2843, arg0 ^ -2046870911);
                }
                if (class179.field3116 && !class149.field2618) {
                    ++class204.field3550;
                    class149.field2618 = true;
                    class131.field2277.method966((byte) 49, 244);
                    class131.field2277.method1691(1, (byte) 53);
                }
                if (!class179.field3116 && class149.field2618) {
                    ++class204.field3550;
                    class149.field2618 = false;
                    class131.field2277.method966((byte) 49, 244);
                    class131.field2277.method1691(0, (byte) 53);
                }
                if (!class58.field968) {
                    ++class58.field973;
                    class131.field2277.method966((byte) 49, 94);
                    class131.field2277.method1734(class57.method389(1456470531), (byte) -100);
                    class58.field968 = true;
                }
                class125.method824((byte) -115);
                if (class156.field2808 == 30) {
                    class190.method1294(117);
                    class119.method799(arg0 + 2046862606);
                    ++class240.field4133;
                    if (~class240.field4133 < -751) {
                        class230.method1507(-117);
                    } else {
                        class230.method1510(-86);
                        class141.method960(false);
                        class267.method1769(arg0 ^ 2046862576);
                        if (class76.field1351 != null) {
                            class124.method817((byte) -128);
                        }
                        for (int var20 = class206.method1385(0, true); var20 != -1; var20 = class206.method1385(0, false)) {
                            class127.method838(var20, -58);
                            class21.field239[class71.method502(31, class211.field3663++)] = var20;
                        }
                        for (class65 var21 = class103.method719(arg0 ^ 2046862566); var21 != null; var21 = class103.method719(-114)) {
                            int var22 = var21.method429(arg0 + 1408102128);
                            int var23 = var21.method432(false);
                            if (var22 == 1) {
                                class117.field2070[var23] = var21.field1094;
                                class43.field751[class71.method502(31, class191.field3362++)] = var23;
                            } else if (~var22 != -3) {
                                if (var22 == 3) {
                                    class107 var24 = method131(var23, 1538872048);
                                    if (!var21.field1091.method679((byte) -120, var24.field1847)) {
                                        var24.field1847 = var21.field1091;
                                        class238.method1555(var24, 10555);
                                    }
                                } else if (~var22 != -5) {
                                    if (~var22 != -6) {
                                        if (~var22 == -7) {
                                            int var25 = var21.field1094;
                                            int var26 = var25 & 31;
                                            int var27 = 31 & var25 >> 5;
                                            int var28 = var25 >> 10 & 31;
                                            int var29 = (var28 << 19) + ((var27 << 11) - -(var26 << 3));
                                            class107 var30 = method131(var23, 1538872048);
                                            if (~var30.field1881 != ~var29) {
                                                var30.field1881 = var29;
                                                class238.method1555(var30, 10555);
                                            }
                                        } else if (var22 == 7) {
                                            class107 var31 = method131(var23, 1538872048);
                                            boolean var32 = var21.field1094 == 1;
                                            if (!var32 == var31.field1934) {
                                                var31.field1934 = var32;
                                                class238.method1555(var31, 10555);
                                            }
                                        } else if (~var22 == -9) {
                                            class107 var33 = method131(var23, arg0 ^ -565835328);
                                            if (~var21.field1094 != ~var33.field1788 || var21.field1092 != var33.field1781 || var21.field1085 != var33.field1867) {
                                                var33.field1781 = var21.field1092;
                                                var33.field1867 = var21.field1085;
                                                var33.field1788 = var21.field1094;
                                                if (var33.field1789 != -1) {
                                                    if (var33.field1816 > 0) {
                                                        var33.field1867 = var33.field1867 * 32 / var33.field1816;
                                                    } else if (var33.field1825 > 0) {
                                                        var33.field1867 = var33.field1867 * 32 / var33.field1825;
                                                    }
                                                }
                                                class238.method1555(var33, arg0 ^ -2046856693);
                                            }
                                        } else if (~var22 != -10) {
                                            if (var22 != 10) {
                                                if (~var22 == -12) {
                                                    class107 var34 = method131(var23, 1538872048);
                                                    var34.field1856 = var34.field1914 = var21.field1092;
                                                    var34.field1921 = var34.field1916 = var21.field1094;
                                                    var34.field1932 = 0;
                                                    var34.field1887 = 0;
                                                    class238.method1555(var34, arg0 + 2046873099);
                                                } else if (~var22 != -13) {
                                                    if (~var22 == -14) {
                                                        class107 var35 = method131(var23, 1538872048);
                                                        var35.field1830 = var21.field1094;
                                                    }
                                                } else {
                                                    class107 var36 = method131(var23, arg0 + -709232704);
                                                    int var37 = var21.field1094;
                                                    if (var36 != null && ~var36.field1814 == -1) {
                                                        if (~var37 < ~(-var36.field1793 + var36.field1803)) {
                                                            var37 = -var36.field1793 + var36.field1803;
                                                        }
                                                        if (var37 < 0) {
                                                            var37 = 0;
                                                        }
                                                        if (~var36.field1832 != ~var37) {
                                                            var36.field1832 = var37;
                                                            class238.method1555(var36, 10555);
                                                        }
                                                    }
                                                }
                                            } else {
                                                class107 var38 = method131(var23, 1538872048);
                                                if (~var21.field1094 != ~var38.field1804 || var21.field1092 != var38.field1942 || ~var21.field1085 != ~var38.field1917) {
                                                    var38.field1917 = var21.field1085;
                                                    var38.field1804 = var21.field1094;
                                                    var38.field1942 = var21.field1092;
                                                    class238.method1555(var38, arg0 ^ -2046856693);
                                                }
                                            }
                                        } else {
                                            class107 var39 = method131(var23, arg0 ^ -565835328);
                                            if (~var21.field1094 != ~var39.field1789 || var21.field1092 != var39.field1877) {
                                                var39.field1877 = var21.field1092;
                                                var39.field1789 = var21.field1094;
                                                class238.method1555(var39, 10555);
                                            }
                                        }
                                    } else {
                                        class107 var40 = method131(var23, 1538872048);
                                        if (~var21.field1094 != ~var40.field1928 || ~var21.field1094 == 0) {
                                            var40.field1929 = 0;
                                            var40.field1911 = 0;
                                            var40.field1928 = var21.field1094;
                                            class238.method1555(var40, 10555);
                                        }
                                    }
                                } else {
                                    class107 var41 = method131(var23, 1538872048);
                                    int var42 = var21.field1094;
                                    int var43 = var21.field1092;
                                    if (~var41.field1851 != ~var42 || ~var41.field1939 != ~var43) {
                                        var41.field1851 = var42;
                                        var41.field1939 = var43;
                                        class238.method1555(var41, 10555);
                                    }
                                }
                            } else {
                                class251.field4344[var23] = var21.field1091;
                                class77.field1370[class71.method502(31, class180.field3128++)] = var23;
                            }
                        }
                        ++class224.field3889;
                        if (~class268.field4716 != -1) {
                            class209.field3616 += 20;
                            if (class209.field3616 >= 400) {
                                class268.field4716 = 0;
                            }
                        }
                        if (class238.field4116 != null) {
                            ++class259.field4514;
                            if (~class259.field4514 <= -16) {
                                class238.method1555(class238.field4116, arg0 ^ -2046856693);
                                class238.field4116 = null;
                            }
                        }
                        if (class289.field5058 != null) {
                            class238.method1555(class289.field5058, arg0 + 2046873099);
                            if (class218.field3798 + 5 < class172.field3054 || class218.field3798 - 5 > class172.field3054 || class276.field4864 - -5 < class38.field656 || class276.field4864 + -5 > class38.field656) {
                                class144.field2543 = true;
                            }
                            ++class95.field1601;
                            if (~class51.field849 == -1) {
                                if (class144.field2543 && ~class95.field1601 <= -6) {
                                    if (class79.field1392 == class289.field5058 && ~class204.field3545 != ~class167.field2975) {
                                        ++class71.field1202;
                                        class107 var44 = class289.field5058;
                                        byte var45 = 0;
                                        if (class54.field892 == 1 && ~var44.field1937 == -207) {
                                            var45 = 1;
                                        }
                                        if (var44.field1805[class167.field2975] <= 0) {
                                            var45 = 0;
                                        }
                                        if (!class256.method1654((byte) 104, client.method1066(var44))) {
                                            if (~var45 != -2) {
                                                var44.method742(true, class167.field2975, class204.field3545);
                                            } else {
                                                int var46 = class204.field3545;
                                                int var47 = class167.field2975;
                                                while (~var46 != ~var47) {
                                                    if (~var46 < ~var47) {
                                                        var44.method742(true, var46 + -1, var46);
                                                        --var46;
                                                    } else if (~var47 < ~var46) {
                                                        var44.method742(true, var46 + 1, var46);
                                                        ++var46;
                                                    }
                                                }
                                            }
                                        } else {
                                            int var48 = class167.field2975;
                                            int var49 = class204.field3545;
                                            var44.field1805[var48] = var44.field1805[var49];
                                            var44.field1923[var48] = var44.field1923[var49];
                                            var44.field1805[var49] = -1;
                                            var44.field1923[var49] = 0;
                                        }
                                        class131.field2277.method966((byte) 49, 223);
                                        class131.field2277.method1732(var45, true);
                                        class131.field2277.method1723(class167.field2975, 25009);
                                        class131.field2277.method1701(class289.field5058.field1873, 4994);
                                        class131.field2277.method1726(arg0 ^ -1505427496, class204.field3545);
                                    }
                                } else if ((~class143.field2522 == -2 || class132.method887((byte) 47, class258.field4497 + -1)) && class258.field4497 > 2) {
                                    class78.method549(99);
                                } else if (~class258.field4497 < -1) {
                                    class216.method1442(-22297);
                                }
                                class259.field4514 = 10;
                                class289.field5058 = null;
                                class21.field243 = 0;
                            }
                        }
                        class107 var50 = class192.field3382;
                        class192.field3382 = null;
                        class214.field3722 = null;
                        class260.field4537 = false;
                        class107 var51 = class277.field4870;
                        class277.field4870 = null;
                        class209.field3632 = false;
                        for (class124.field2176 = 0; class174.method1171((byte) -125) && class124.field2176 < 128; ++class124.field2176) {
                            class180.field3131[class124.field2176] = class47.field792;
                            class30.field552[class124.field2176] = class110.field1971;
                        }
                        class76.field1351 = null;
                        if (class9.field75 != -1) {
                            class37.method291(0, class24.field373, 0, class9.field75, true, 0, class199.field3458, 0);
                        }
                        ++class28.field514;
                        while (true) {
                            class260 var52;
                            class107 var53;
                            class107 var54;
                            do {
                                var52 = (class260) class44.field772.method528(1);
                                if (var52 == null) {
                                    while (true) {
                                        class260 var55;
                                        class107 var56;
                                        class107 var57;
                                        do {
                                            var55 = (class260) class101.field1730.method528(1);
                                            if (var55 == null) {
                                                while (true) {
                                                    class260 var58;
                                                    class107 var59;
                                                    class107 var60;
                                                    do {
                                                        var58 = (class260) class34.field612.method528(1);
                                                        if (var58 == null) {
                                                            if (class56.field918 && class76.field1351 == null) {
                                                                class56.field918 = false;
                                                            }
                                                            if (class42.field717 != null) {
                                                                class186.method1274(0);
                                                            }
                                                            if (class103.field1751 > 0 && class51.field839[82] && class51.field839[81] && class156.field2801 != 0) {
                                                                int var61 = -class156.field2801 + class255.field4407;
                                                                if (var61 >= 0) {
                                                                    if (var61 > 3) {
                                                                        var61 = 3;
                                                                    }
                                                                } else {
                                                                    var61 = 0;
                                                                }
                                                                class278.method1836((byte) 95, class168.field3006.field1317[0] + class280.field4910, var61, class215.field3731 - -class168.field3006.field1259[0]);
                                                            }
                                                            if (~class206.field3570 != 0) {
                                                                int var62 = class261.field4598;
                                                                int var63 = class206.field3570;
                                                                if (~class103.field1751 < -1 && class51.field839[82] && class51.field839[81]) {
                                                                    class278.method1836((byte) 95, class280.field4910 + var63, class255.field4407, class215.field3731 + var62);
                                                                } else if (!class145.field2561) {
                                                                    if (class257.field4475) {
                                                                        ++class260.field4549;
                                                                        class131.field2277.method966((byte) 49, 133);
                                                                        class131.field2277.method1697(class280.field4910 - -var63, -77);
                                                                        class131.field2277.method1723(class215.field3731 + var62, 25009);
                                                                        class209.field3616 = 0;
                                                                        class43.field730 = class11.field97;
                                                                        class268.field4716 = 1;
                                                                        class263.field4658 = class122.field2133;
                                                                    } else {
                                                                        boolean var64 = class95.method637(0, 0, 0, 0, arg0 ^ -2046862542, var63, 0, class168.field3006.field1259[0], var62, 0, true, class168.field3006.field1317[0]);
                                                                        if (var64) {
                                                                            class209.field3616 = 0;
                                                                            class268.field4716 = 1;
                                                                            class43.field730 = class11.field97;
                                                                            class263.field4658 = class122.field2133;
                                                                        }
                                                                    }
                                                                } else {
                                                                    class131.field2277.method966((byte) 49, 110);
                                                                    class131.field2277.method1697(class280.field4910 - -var63, -69);
                                                                    ++class37.field651;
                                                                    class131.field2277.method1697(class239.field4132, arg0 + 2046862499);
                                                                    class131.field2277.method1701(class103.field1750, 4994);
                                                                    class131.field2277.method1745(class215.field3731 + var62, (byte) 5);
                                                                    class209.field3616 = 0;
                                                                    class268.field4716 = 1;
                                                                    class263.field4658 = class122.field2133;
                                                                    class43.field730 = class11.field97;
                                                                }
                                                                class257.field4475 = false;
                                                                class145.field2561 = false;
                                                                class206.field3570 = -1;
                                                            }
                                                            class240.method1564(38);
                                                            if (class192.field3382 != var50) {
                                                                if (var50 != null) {
                                                                    class238.method1555(var50, 10555);
                                                                }
                                                                if (class192.field3382 != null) {
                                                                    class238.method1555(class192.field3382, 10555);
                                                                }
                                                            }
                                                            if (class277.field4870 != var51 && ~class9.field70 == ~class202.field3522) {
                                                                if (var51 != null) {
                                                                    class238.method1555(var51, 10555);
                                                                }
                                                                if (class277.field4870 != null) {
                                                                    class238.method1555(class277.field4870, arg0 ^ -2046856693);
                                                                }
                                                            }
                                                            if (class277.field4870 == null) {
                                                                if (~class202.field3522 < -1) {
                                                                    --class202.field3522;
                                                                }
                                                            } else if (class9.field70 > class202.field3522) {
                                                                ++class202.field3522;
                                                                if (class9.field70 == class202.field3522) {
                                                                    class238.method1555(class277.field4870, arg0 + 2046873099);
                                                                }
                                                            }
                                                            if (~class141.field2481 == -2) {
                                                                class127.method843((byte) 55);
                                                            } else if (class141.field2481 != 2) {
                                                                class19.method109((byte) -107);
                                                            } else {
                                                                class138.method944(40);
                                                            }
                                                            for (int var65 = 0; ~var65 > -6; ++var65) {
                                                                int var10002 = class197.field3430[var65]++;
                                                            }
                                                            int var66 = class262.method1753(arg0 ^ -2046862521);
                                                            int var67 = class168.method1142(-3082);
                                                            if (~var66 < -4501 && ~var67 < -4501) {
                                                                ++class53.field877;
                                                                class187.field3313 = 250;
                                                                client.method1056(4000, -42);
                                                                class131.field2277.method966((byte) 49, 182);
                                                            }
                                                            if (class11.field96 != null && ~class11.field96.field4844 == -2) {
                                                                if (class11.field96.field4843 != null) {
                                                                    class177.method1185(class261.field4585, class193.field3401, (byte) 126);
                                                                }
                                                                class193.field3401 = null;
                                                                class261.field4585 = false;
                                                                class11.field96 = null;
                                                            }
                                                            ++class251.field4343;
                                                            ++class166.field2937;
                                                            if (~class251.field4343 < -501) {
                                                                class251.field4343 = 0;
                                                                int var68 = (int) (8.0D * Math.random());
                                                                if (~(var68 & 4) == -5) {
                                                                    class223.field3880 += class63.field1070;
                                                                }
                                                                if (~(2 & var68) == -3) {
                                                                    class229.field3963 += class130.field2267;
                                                                }
                                                                if ((var68 & 1) == 1) {
                                                                    class79.field1399 += class221.field3847;
                                                                }
                                                            }
                                                            if (class166.field2937 > 500) {
                                                                class166.field2937 = 0;
                                                                int var69 = (int) (8.0D * Math.random());
                                                                if ((var69 & 2) == 2) {
                                                                    class260.field4542 += class112.field2028;
                                                                }
                                                                if ((1 & var69) == 1) {
                                                                    class124.field2178 += class216.field3734;
                                                                }
                                                            }
                                                            if (class260.field4542 < -20) {
                                                                class112.field2028 = 1;
                                                            }
                                                            if (class229.field3963 < -55) {
                                                                class130.field2267 = 2;
                                                            }
                                                            if (~class79.field1399 > 49) {
                                                                class221.field3847 = 2;
                                                            }
                                                            if (class223.field3880 < -40) {
                                                                class63.field1070 = 1;
                                                            }
                                                            if (arg0 != -2046862544) {
                                                                field258 = null;
                                                            }
                                                            if (class223.field3880 > 40) {
                                                                class63.field1070 = -1;
                                                            }
                                                            ++class30.field556;
                                                            if (class79.field1399 > 50) {
                                                                class221.field3847 = -2;
                                                            }
                                                            if (~class229.field3963 < -56) {
                                                                class130.field2267 = -2;
                                                            }
                                                            if (class124.field2178 < -60) {
                                                                class216.field3734 = 2;
                                                            }
                                                            if (~class260.field4542 < -11) {
                                                                class112.field2028 = -1;
                                                            }
                                                            if (class124.field2178 > 60) {
                                                                class216.field3734 = -2;
                                                            }
                                                            if (~class30.field556 < -51) {
                                                                ++class221.field3851;
                                                                class131.field2277.method966((byte) 49, 203);
                                                            }
                                                            if (class202.field3524) {
                                                                class51.method356(-83);
                                                                class202.field3524 = false;
                                                            }
                                                            try {
                                                                if (class133.field2322 != null && ~class131.field2277.field4587 < -1) {
                                                                    class133.field2322.method55(class131.field2277.field4619, (byte) -86, 0, class131.field2277.field4587);
                                                                    class30.field556 = 0;
                                                                    class131.field2277.field4587 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var70) {
                                                                class230.method1507(-102);
                                                                return;
                                                            }
                                                        }
                                                        var59 = var58.field4553;
                                                        if (~var59.field1922 > -1) {
                                                            break;
                                                        }
                                                        var60 = method131(var59.field1801, arg0 + -709232704);
                                                    } while (var60 == null || var60.field1837 == null || ~var59.field1922 <= ~var60.field1837.length || var60.field1837[var59.field1922] != var59);
                                                    class56.method385(200000, var58);
                                                }
                                            }
                                            var56 = var55.field4553;
                                            if (var56.field1922 < 0) {
                                                break;
                                            }
                                            var57 = method131(var56.field1801, 1538872048);
                                        } while (var57 == null || var57.field1837 == null || var57.field1837.length <= var56.field1922 || var57.field1837[var56.field1922] != var56);
                                        class56.method385(200000, var55);
                                    }
                                }
                                var53 = var52.field4553;
                                if (~var53.field1922 > -1) {
                                    break;
                                }
                                var54 = method131(var53.field1801, 1538872048);
                            } while (var54 == null || var54.field1837 == null || ~var53.field1922 <= ~var54.field1837.length || var54.field1837[var53.field1922] != var53);
                            class56.method385(arg0 ^ -2047060368, var52);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)Ltf;")
    public static final class107 method131(int arg0, int arg1) {
        int var2 = arg0 >> 16;
        if (arg1 != 1538872048) {
            field267 = null;
        }
        ++field264;
        int var3 = arg0 & 65535;
        if (class125.field2188[var2] == null || class125.field2188[var2][var3] == null) {
            boolean var4 = method134(var2, (byte) 69);
            if (!var4) {
                return null;
            }
        }
        return class125.field2188[var2][var3];
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILpg;)V")
    public static final void method132(int arg0, class75 arg1) {
        arg1.field1309 = false;
        if (~arg1.field1282 != 0) {
            class270 var2 = class38.method297(132, arg1.field1282);
            if (var2 != null && var2.field4740 != null) {
                ++arg1.field1327;
                if (~arg1.field1299 > ~var2.field4740.length && ~var2.field4749[arg1.field1299] > ~arg1.field1327) {
                    arg1.field1327 = 1;
                    ++arg1.field1299;
                    class250.method1621(arg1.field1325, arg1.field1299, arg1.field1301, arg0 ^ 32514, class168.field3006 == arg1, var2);
                }
                if (~arg1.field1299 <= ~var2.field4740.length) {
                    arg1.field1299 = 0;
                    arg1.field1327 = 0;
                    class250.method1621(arg1.field1325, arg1.field1299, arg1.field1301, arg0 ^ 32577, class168.field3006 == arg1, var2);
                }
            } else {
                arg1.field1282 = -1;
            }
        }
        if (arg0 != 32545) {
            field258 = null;
        }
        ++field250;
        if (~arg1.field1313 != 0 && class56.field926 >= arg1.field1262) {
            int var3 = class90.method610(arg1.field1313, true).field3137;
            if (var3 != -1) {
                class270 var4 = class38.method297(132, var3);
                if (var4 != null && var4.field4740 != null) {
                    if (~arg1.field1295 > -1) {
                        arg1.field1295 = 0;
                        class250.method1621(arg1.field1325, 0, arg1.field1301, 61, class168.field3006 == arg1, var4);
                    }
                    ++arg1.field1312;
                    if (var4.field4740.length > arg1.field1295 && var4.field4749[arg1.field1295] < arg1.field1312) {
                        ++arg1.field1295;
                        arg1.field1312 = 1;
                        class250.method1621(arg1.field1325, arg1.field1295, arg1.field1301, 46, class168.field3006 == arg1, var4);
                    }
                    if (~arg1.field1295 <= ~var4.field4740.length) {
                        arg1.field1313 = -1;
                    }
                } else {
                    arg1.field1313 = -1;
                }
            } else {
                arg1.field1313 = -1;
            }
        }
        if (~arg1.field1284 != 0 && ~arg1.field1297 >= -2) {
            class270 var5 = class38.method297(132, arg1.field1284);
            if (~var5.field4772 == -2 && ~arg1.field1326 < -1 && ~arg1.field1314 >= ~class56.field926 && arg1.field1334 < class56.field926) {
                arg1.field1297 = 1;
                return;
            }
        }
        if (arg1.field1284 != -1 && ~arg1.field1297 == -1) {
            class270 var6 = class38.method297(132, arg1.field1284);
            if (var6 != null && var6.field4740 != null) {
                ++arg1.field1303;
                if (~arg1.field1321 > ~var6.field4740.length && arg1.field1303 > var6.field4749[arg1.field1321]) {
                    arg1.field1303 = 1;
                    ++arg1.field1321;
                    class250.method1621(arg1.field1325, arg1.field1321, arg1.field1301, arg0 + -32526, class168.field3006 == arg1, var6);
                }
                if (~var6.field4740.length >= ~arg1.field1321) {
                    ++arg1.field1266;
                    arg1.field1321 -= var6.field4771;
                    if (arg1.field1266 >= var6.field4760) {
                        arg1.field1284 = -1;
                    } else if (~arg1.field1321 <= -1 && var6.field4740.length > arg1.field1321) {
                        class250.method1621(arg1.field1325, arg1.field1321, arg1.field1301, 113, class168.field3006 == arg1, var6);
                    } else {
                        arg1.field1284 = -1;
                    }
                }
                arg1.field1309 = var6.field4764;
            } else {
                arg1.field1284 = -1;
            }
        }
        if (~arg1.field1297 < -1) {
            --arg1.field1297;
        }
    }

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "(I)I")
    public final int method133(int arg0) {
        if (arg0 != -108) {
            return -57;
        } else {
            ++field252;
            return this.field269 == null ? 0 : this.field269.field4587 * 100 / (this.field269.field4619.length + -this.field268);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)Z")
    public static final boolean method134(int arg0, byte arg1) {
        ++field255;
        if (class250.field4312[arg0]) {
            return true;
        } else if (!class41.field701.method1251(arg0, 0)) {
            return false;
        } else {
            int var2 = class41.field701.method1233(arg0, false);
            if (var2 == 0) {
                class250.field4312[arg0] = true;
                return true;
            } else {
                if (class125.field2188[arg0] == null) {
                    class125.field2188[arg0] = new class107[var2];
                }
                if (arg1 <= 41) {
                    method131(57, -64);
                }
                for (int var3 = 0; var3 < var2; ++var3) {
                    if (class125.field2188[arg0][var3] == null) {
                        byte[] var4 = class41.field701.method1242(var3, arg0, 6801);
                        if (var4 != null) {
                            class125.field2188[arg0][var3] = new class107();
                            class125.field2188[arg0][var3].field1873 = (arg0 << 16) + var3;
                            if (~var4[0] == 0) {
                                class125.field2188[arg0][var3].method732((byte) -111, new class261(var4));
                            } else {
                                class125.field2188[arg0][var3].method736(102, new class261(var4));
                            }
                        }
                    }
                }
                class250.field4312[arg0] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ltg;I)V")
    public static final void method135(class182 arg0, int arg1) {
        if (arg1 != 0) {
            method128(81);
        }
        class99.field1663 = arg0;
        ++field253;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)[B")
    public final byte[] method136(int arg0) {
        ++field260;
        if (arg0 != 100) {
            method135((class182) null, -24);
        }
        if (!super.field1766 && this.field269.field4619.length - this.field268 <= this.field269.field4587) {
            return this.field269.field4619;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)I")
    public static final int method137(int arg0, boolean arg1) {
        ++field251;
        if (arg1) {
            field267 = null;
        }
        return arg0 >>> 7;
    }
}
