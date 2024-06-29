import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class242 extends class135 {

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    private int field4289 = 10;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    private int field4292 = 0;

    @OriginalMember(owner = "client!d", name = "mb", descriptor = "I")
    private int field4303 = 2048;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
    public static int field4296 = -1;

    @OriginalMember(owner = "client!d", name = "X", descriptor = "[I")
    public static int[] field4288 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!d", name = "pb", descriptor = "Lqj;")
    public static class196 field4306 = class80.method502("::clientdrop", -48);

    @OriginalMember(owner = "client!d", name = "lb", descriptor = "I")
    public static int field4302 = 0;

    @OriginalMember(owner = "client!d", name = "sb", descriptor = "Lqj;")
    private static class196 field4309 = class80.method502("Loading )2 please wait)3", -48);

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "Lqj;")
    public static class196 field4300 = field4309;

    @OriginalMember(owner = "client!d", name = "tb", descriptor = "I")
    public static volatile int field4310 = -1;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!d", name = "nb", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!d", name = "ob", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "Lbk;")
    public static class136 field4294;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "[I")
    private int[] field4287;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "[I")
    public static int[] field4301;

    @OriginalMember(owner = "client!d", name = "qb", descriptor = "[I")
    private int[] field4307;

    @OriginalMember(owner = "client!d", name = "rb", descriptor = "[[S")
    public static short[][] field4308;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lp;Z)Ltf;")
    public static final class85 method1643(class56 arg0, boolean arg1) {
        if (!arg1) {
            method1648((byte) -74);
        }
        ++field4295;
        return new class85(arg0.method338((byte) 123), arg0.method338((byte) 119), arg0.method338((byte) 116), arg0.method338((byte) 106), arg0.method328(-1974), arg0.method328(-1974), arg0.method367(1));
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
    public final void method102(byte arg0) {
        this.method1644((byte) -64);
        if (arg0 != -85) {
            this.method99(7, true);
        }
        ++field4304;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V")
    private final void method1644(byte arg0) {
        this.field4307 = new int[this.field4289 + 1];
        ++field4297;
        this.field4287 = new int[this.field4289 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field4289;
        int var4 = this.field4303 * var3 >> 12;
        for (int var5 = 0; ~this.field4289 < ~var5; ++var5) {
            this.field4307[var5] = var2;
            this.field4287[var5] = var2 + var4;
            var2 += var3;
        }
        if (arg0 != -64) {
            method1647(-59);
        }
        this.field4307[this.field4289] = 4096;
        this.field4287[this.field4289] = 4096 - -this.field4287[0];
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg2 != -16231) {
            method1646(-80);
        }
        ++field4293;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4292 = arg0.method367(arg2 ^ -16232);
                }
            } else {
                this.field4303 = arg0.method318(true);
            }
        } else {
            this.field4289 = arg0.method367(1);
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(B)V")
    public static final void method1645(byte arg0) {
        ++field4305;
        if (arg0 == 112) {
            try {
                if (class86.field1275 == 1) {
                    int var1 = class143.field2185.method1060(false);
                    if (var1 > 0 && class143.field2185.method1047((byte) -118)) {
                        int var2 = var1 - class131.field1863;
                        if (~var2 > -1) {
                            var2 = 0;
                        }
                        class143.field2185.method1055(var2, (byte) -118);
                    } else {
                        class143.field2185.method1069(123);
                        class143.field2185.method1039((byte) 117);
                        class103.field1490 = null;
                        if (class23.field298 != null) {
                            class86.field1275 = 2;
                        } else {
                            class86.field1275 = 0;
                        }
                        class95.field1405 = null;
                    }
                }
            } catch (Exception var4) {
                var4.printStackTrace();
                class143.field2185.method1069(arg0 ^ 11);
                class23.field298 = null;
                class95.field1405 = null;
                class103.field1490 = null;
                class86.field1275 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    public static final void method1646(int arg0) {
        class136.field2037 = class150.field2407;
        class106.field1526 = class256.field4504;
        class5.field34 = class41.field473;
        class25.field316 = class249.field4409;
        class70.field978 = class142.field2171;
        class150.field2408 = class10.field119;
        class104.field1510 = class127.field1801;
        class70.field999 = class198.field3510;
        class45.field536 = class129.field1832;
        class209.field3763 = class219.field3925;
        class215.field3881 = class194.field3406;
        class258.field4523 = class88.field1288;
        class146.field2305 = class130.field1856;
        class100.field1443 = class240.field4264;
        class135.field1950 = class3.field25;
        class80.field1150 = class63.field866;
        class214.field3824 = class14.field154;
        class96.field1407 = class85.field1241;
        class27.field338 = class147.field2316;
        class12.field136 = class251.field4436;
        class29.field356 = class10.field118;
        class65.field899 = class51.field608;
        class66.field944 = class45.field535;
        class71.field1000 = class174.field2931;
        class164.field2657 = class210.field3790;
        class225.field4036 = class52.field651;
        class45.field541 = class129.field1832;
        ++field4291;
        class251.field4440 = class251.field4442;
        class244.field4352 = class134.field1937;
        class179.field3160 = class94.field1378;
        class169.field2855 = class101.field1450;
        class22.field274 = class152.field2454;
        class111.field1603 = class238.field4245;
        class47.field560 = class131.field1864;
        class188.field3290 = class230.field4098;
        class122.field1748 = class227.field4064;
        if (arg0 == 7) {
            class220.field3971 = class28.field351;
            class60.field800 = class134.field1923;
            class146.field2301 = class230.field4093;
            class177.field2984 = class28.field344;
            class176.field2965 = class13.field150;
            class229.field4083 = class33.field404;
            class135.field1948 = class58.field790;
            class213.field3821 = class10.field111;
            class220.field3960 = class48.field585;
            class244.field4337 = class134.field1937;
            class70.field995 = class74.field1073;
            class145.field2290 = class174.field2925;
            class29.field358 = class17.field189;
            class136.field1973 = class172.field2896;
            class103.field1494 = class166.field2737;
            class171.field2889 = class84.field1236;
            class237.field4212 = class209.field3765;
            class225.field4037 = class109.field1559;
            class103.field1482 = class229.field4082;
            class35.field428 = class111.field1571;
            class166.field2741 = class197.field3505;
            class227.field4066 = class192.field3368;
            class149.field2389 = class193.field3404;
            class225.field4032 = class221.field3984;
            class216.field3891 = class149.field2394;
            class76.field1091 = class7.field64;
            class220.field3961 = class83.field1209;
            class57.field765 = class22.field285;
            class7.field72 = class90.field1322;
            class44.field503 = class42.field476;
            field4300 = class95.field1400;
            class225.field4030 = class221.field3984;
            class166.field2739 = class220.field3974;
            class238.field4240 = class186.field3267;
            class154.field2497 = class144.field2218;
            class168.field2804 = class88.field1294;
            class125.field1782 = class198.field3506;
            class17.field192 = class240.field4270;
            class238.field4244 = class197.field3501;
            class230.field4096 = class65.field918;
            class243.field4314 = class132.field1892;
            class134.field1934 = class187.field3286;
            class166.field2738 = class158.field2543;
            class258.field4511 = class155.field2506;
            class144.field2215 = class154.field2493;
            class173.field2909 = class23.field296;
            class5.field44 = class31.field390;
            class165.field2698 = class39.field438;
            class230.field4092 = class215.field3863;
            class223.field4007 = class165.field2701;
            class156.field2512 = class194.field3416;
            class171.field2874 = class111.field1588;
            class45.field540 = class41.field474;
            class80.field1153 = class99.field1428;
            class252.field4471 = class156.field2513;
            class31.field398 = class234.field4166;
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V")
    public static final void method1647(int arg0) {
        ++field4298;
        if (class195.field3432 == 212) {
            int var1 = class229.field4077.method343((byte) 125);
            int var2 = (var1 >> 4 & 7) + class110.field1570;
            int var3 = (var1 & 7) + class69.field973;
            int var4 = class229.field4077.method309((byte) 107);
            int var5 = var4 >> 2;
            int var6 = 3 & var4;
            int var7 = class125.field1771[var5];
            if (~var2 <= -1 && ~var3 <= -1 && var2 < 104 && var3 < 104) {
                class201.method1354(var2, 0, var3, var6, -1, -1, var7, var5, true, class27.field335);
            }
        } else if (arg0 < -125) {
            if (class195.field3432 == 209) {
                int var8 = class229.field4077.method367(1);
                int var9 = ((113 & var8) >> 4) + class110.field1570;
                int var10 = (var8 & 7) + class69.field973;
                int var11 = class229.field4077.method318(true);
                int var12 = class229.field4077.method367(1);
                if (~var11 == -65536) {
                    var11 = -1;
                }
                int var13 = 7 & var12;
                int var14 = (250 & var12) >> 4;
                int var15 = class229.field4077.method367(1);
                if (~var9 <= -1 && ~var10 <= -1 && var9 < 104 && var10 < 104) {
                    int var16 = var14 + 1;
                    if (class102.field1477.field2102[0] >= -var16 + var9 && ~class102.field1477.field2102[0] >= ~(var9 + var16) && -var16 + var10 <= class102.field1477.field2046[0] && var10 + var16 >= class102.field1477.field2046[0] && class70.field977 != 0 && ~var13 < -1 && class219.field3933 < 50 && ~var11 != 0) {
                        class82.field1182[class219.field3933] = var11;
                        class129.field1835[class219.field3933] = var13;
                        class146.field2300[class219.field3933] = var15;
                        class11.field130[class219.field3933] = null;
                        class210.field3785[class219.field3933] = (var9 << 16) + (var10 << 8) + var14;
                        ++class219.field3933;
                    }
                }
            } else if (~class195.field3432 == -200) {
                int var17 = class229.field4077.method367(1);
                int var18 = (var17 & 7) + class69.field973;
                int var19 = ((var17 & 121) >> 4) + class110.field1570;
                int var20 = class229.field4077.method318(true);
                int var21 = class229.field4077.method318(true);
                int var22 = class229.field4077.method318(true);
                if (~var19 <= -1 && ~var18 <= -1 && var19 < 104 && var18 < 104) {
                    class243 var23 = class178.field3040[class27.field335][var19][var18];
                    if (var23 != null) {
                        for (class143 var24 = (class143) var23.method1651((byte) -93); var24 != null; var24 = (class143) var23.method1656(-106)) {
                            class88 var25 = var24.field2206;
                            if ((var20 & 32767) == var25.field1298 && ~var25.field1301 == ~var21) {
                                var25.field1301 = var22;
                                break;
                            }
                        }
                        class175.method1140(var19, var18, true);
                    }
                }
            } else if (class195.field3432 == 122) {
                int var26 = class229.field4077.method315(68);
                int var27 = class229.field4077.method315(99);
                int var28 = class229.field4077.method354(true);
                int var29 = class229.field4077.method367(1);
                int var30 = (var29 & 7) + class69.field973;
                int var31 = ((119 & var29) >> 4) + class110.field1570;
                if (~var31 <= -1 && ~var30 <= -1 && ~var31 > -105 && ~var30 > -105 && ~class31.field395 != ~var27) {
                    class88 var32 = new class88();
                    var32.field1298 = var26;
                    var32.field1301 = var28;
                    if (class178.field3040[class27.field335][var31][var30] == null) {
                        class178.field3040[class27.field335][var31][var30] = new class243();
                    }
                    class178.field3040[class27.field335][var31][var30].method1652(26532, new class143(var32));
                    class175.method1140(var31, var30, true);
                }
            } else if (class195.field3432 == 238) {
                int var33 = class229.field4077.method367(1);
                int var34 = class69.field973 - -(var33 & 7);
                int var35 = (var33 >> 4 & 7) + class110.field1570;
                int var36 = class229.field4077.method318(true);
                int var37 = class229.field4077.method367(1);
                int var38 = class229.field4077.method318(true);
                if (var35 >= 0 && ~var34 <= -1 && ~var35 > -105 && var34 < 104) {
                    int var39 = var35 * 128 + 64;
                    int var40 = var34 * 128 - -64;
                    class232 var41 = new class232(var36, class27.field335, var39, var40, class74.method470(var40, class27.field335, 103, var39) - var37, var38, class171.field2879);
                    class198.field3518.method1652(26532, new class169(var41));
                }
            } else if (~class195.field3432 == -16) {
                int var42 = class229.field4077.method367(1);
                int var43 = var42 >> 2;
                int var44 = var42 & 3;
                int var45 = class125.field1771[var43];
                int var46 = class229.field4077.method315(60);
                int var47 = class229.field4077.method336((byte) -127);
                int var48 = class110.field1570 - -((113 & var47) >> 4);
                int var49 = (7 & var47) + class69.field973;
                if (~var48 <= -1 && var49 >= 0 && var48 < 104 && ~var49 > -105) {
                    class201.method1354(var48, 0, var49, var44, var46, -1, var45, var43, true, class27.field335);
                }
            } else {
                if (~class195.field3432 == -121) {
                    byte var50 = class229.field4077.method350(16);
                    int var51 = class229.field4077.method315(124);
                    byte var52 = class229.field4077.method357((byte) -56);
                    int var53 = class229.field4077.method305(true);
                    int var54 = class229.field4077.method343((byte) -41);
                    int var55 = (7 & var54) + class69.field973;
                    int var56 = class110.field1570 - -(var54 >> 4 & 7);
                    int var57 = class229.field4077.method336((byte) -69);
                    int var58 = 3 & var57;
                    int var59 = var57 >> 2;
                    int var60 = class125.field1771[var59];
                    int var61 = class229.field4077.method318(true);
                    byte var62 = class229.field4077.method357((byte) -124);
                    byte var63 = class229.field4077.method317((byte) 118);
                    int var64 = class229.field4077.method318(true);
                    class134 var65;
                    if (class31.field395 == var53) {
                        var65 = class102.field1477;
                    } else {
                        var65 = class247.field4397[var53];
                    }
                    if (var65 != null) {
                        class145 var66 = class83.method521(var51, (byte) 47);
                        int var67;
                        int var68;
                        if (var58 != 1 && var58 != 3) {
                            var67 = var66.field2278;
                            var68 = var66.field2263;
                        } else {
                            var67 = var66.field2263;
                            var68 = var66.field2278;
                        }
                        int var69 = (var67 >> 1) + var55;
                        int var70 = (var68 >> 1) + var56;
                        int[][] var71 = class42.field480[class27.field335];
                        int var72 = (var67 + 1 >> 1) + var55;
                        int var73 = (var68 + 1 >> 1) + var56;
                        int var74 = var71[var70][var69] + var71[var73][var69] + var71[var73][var72] + var71[var70][var72] >> 2;
                        int[][] var75 = null;
                        int var76 = (var55 << 7) + (var67 << 6);
                        int var77 = (var56 << 7) + (var68 << 6);
                        if (~class27.field335 > -4) {
                            var75 = class42.field480[class27.field335 + 1];
                        }
                        class33 var78 = var66.method903(var77, 14213, var74, (class68) null, var59, var71, var58, var75, var76, false, var66.field2252);
                        if (var78 != null) {
                            if (~var63 > ~var62) {
                                byte var79 = var62;
                                var62 = var63;
                                var63 = var79;
                            }
                            class201.method1354(var56, var64 + 1, var55, 0, -1, var61 + 1, var60, 0, true, class27.field335);
                            var65.field1931 = (class119) var78.field407;
                            var65.field1909 = class171.field2879 + var64;
                            var65.field1912 = var56 * 128 - -(var68 * 64);
                            var65.field1922 = var56 + var62;
                            var65.field1933 = var55 * 128 + var67 * 64;
                            var65.field1921 = var56 + var63;
                            var65.field1940 = var61 - -class171.field2879;
                            if (var50 > var52) {
                                byte var80 = var50;
                                var50 = var52;
                                var52 = var80;
                            }
                            var65.field1926 = var74;
                            var65.field1918 = var52 + var55;
                            var65.field1920 = var50 + var55;
                        }
                    }
                }
                if (class195.field3432 != 14) {
                    if (class195.field3432 == 65) {
                        int var87 = class229.field4077.method318(true);
                        if (var87 == 65535) {
                            var87 = -1;
                        }
                        int var88 = class229.field4077.method336((byte) -5);
                        int var89 = var88 >> 2;
                        int var90 = class125.field1771[var89];
                        int var91 = class229.field4077.method336((byte) -49);
                        int var92 = var88 & 3;
                        int var93 = (var91 & 7) + class69.field973;
                        int var94 = (7 & var91 >> 4) + class110.field1570;
                        class109.method655(var94, -17258, var93, var92, var87, var90, class27.field335, var89);
                    } else if (class195.field3432 == 71) {
                        int var95 = class229.field4077.method343((byte) -76);
                        int var96 = class110.field1570 - -(var95 >> 4 & 7);
                        int var97 = class69.field973 - -(var95 & 7);
                        int var98 = class229.field4077.method315(48);
                        int var99 = class229.field4077.method354(true);
                        if (var96 >= 0 && var97 >= 0 && var96 < 104 && ~var97 > -105) {
                            class88 var100 = new class88();
                            var100.field1298 = var98;
                            var100.field1301 = var99;
                            if (class178.field3040[class27.field335][var96][var97] == null) {
                                class178.field3040[class27.field335][var96][var97] = new class243();
                            }
                            class178.field3040[class27.field335][var96][var97].method1652(26532, new class143(var100));
                            class175.method1140(var96, var97, true);
                        }
                    } else if (~class195.field3432 == -175) {
                        int var101 = class229.field4077.method367(1);
                        int var102 = ((248 & var101) >> 4) + class110.field1570 * 2;
                        int var103 = (var101 & 15) + class69.field973 * 2;
                        int var104 = var102 - -class229.field4077.method350(16);
                        int var105 = var103 + class229.field4077.method350(16);
                        int var106 = class229.field4077.method338((byte) 97);
                        int var107 = class229.field4077.method318(true);
                        int var108 = 4 * class229.field4077.method367(1);
                        int var109 = 4 * class229.field4077.method367(1);
                        int var110 = class229.field4077.method318(true);
                        int var111 = class229.field4077.method318(true);
                        int var112 = class229.field4077.method367(1);
                        int var113 = class229.field4077.method367(1);
                        if (~var102 <= -1 && var103 >= 0 && var102 < 208 && ~var103 > -209 && var104 >= 0 && var105 >= 0 && var104 < 208 && var105 < 208 && ~var107 != -65536) {
                            int var114 = var102 * 64;
                            int var115 = var104 * 64;
                            int var116 = var103 * 64;
                            int var117 = var105 * 64;
                            class51 var118 = new class51(var107, class27.field335, var114, var116, -var108 + class74.method470(var116, class27.field335, 103, var114), class171.field2879 + var110, class171.field2879 + var111, var112, var113, var106, var109);
                            var118.method271(var115, -var109 + class74.method470(var117, class27.field335, 103, var115), var110 - -class171.field2879, (byte) -126, var117);
                            class91.field1328.method1652(26532, new class177(var118));
                        }
                    } else if (~class195.field3432 == -193) {
                        int var119 = class229.field4077.method367(1);
                        int var120 = (var119 >> 4 & 7) + class110.field1570;
                        int var121 = (7 & var119) + class69.field973;
                        int var122 = class229.field4077.method350(16) + var120;
                        int var123 = class229.field4077.method350(16) + var121;
                        int var124 = class229.field4077.method338((byte) 101);
                        int var125 = class229.field4077.method318(true);
                        int var126 = 4 * class229.field4077.method367(1);
                        int var127 = class229.field4077.method367(1) * 4;
                        int var128 = class229.field4077.method318(true);
                        int var129 = class229.field4077.method318(true);
                        int var130 = class229.field4077.method367(1);
                        int var131 = class229.field4077.method367(1);
                        if (var120 >= 0 && var121 >= 0 && var120 < 104 && ~var121 > -105 && ~var122 <= -1 && ~var123 <= -1 && ~var122 > -105 && var123 < 104 && ~var125 != -65536) {
                            int var132 = var122 * 128 - -64;
                            int var133 = var121 * 128 + 64;
                            int var134 = var120 * 128 + 64;
                            class51 var135 = new class51(var125, class27.field335, var134, var133, class74.method470(var133, class27.field335, 103, var134) - var126, class171.field2879 + var128, class171.field2879 + var129, var130, var131, var124, var127);
                            int var136 = var123 * 128 + 64;
                            var135.method271(var132, -var127 + class74.method470(var136, class27.field335, 103, var132), class171.field2879 + var128, (byte) -126, var136);
                            class91.field1328.method1652(26532, new class177(var135));
                        }
                    }
                } else {
                    int var81 = class229.field4077.method367(1);
                    int var82 = (7 & var81 >> 4) + class110.field1570;
                    int var83 = (7 & var81) + class69.field973;
                    int var84 = class229.field4077.method305(true);
                    if (var82 >= 0 && ~var83 <= -1 && ~var82 > -105 && ~var83 > -105) {
                        class243 var85 = class178.field3040[class27.field335][var82][var83];
                        if (var85 != null) {
                            for (class143 var86 = (class143) var85.method1651((byte) -13); var86 != null; var86 = (class143) var85.method1656(-127)) {
                                if (~(32767 & var84) == ~var86.field2206.field1298) {
                                    var86.method797((byte) 104);
                                    break;
                                }
                            }
                            if (var85.method1651((byte) -64) == null) {
                                class178.field3040[class27.field335][var82][var83] = null;
                            }
                            class175.method1140(var82, var83, true);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V")
    public class242() {
        super(0, true);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        if (arg1) {
            field4301 = null;
        }
        ++field4290;
        int[] var3 = super.field1954.method110(arg0, -118);
        if (super.field1954.field244) {
            int var4 = class123.field1756[arg0];
            if (~this.field4292 == -1) {
                short var5 = 0;
                for (int var6 = 0; this.field4289 > var6; ++var6) {
                    if (~var4 <= ~this.field4307[var6] && this.field4307[var6 + 1] > var4) {
                        if (var4 < this.field4287[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class37.method186(var3, 0, class131.field1862, var5);
            } else {
                for (int var7 = 0; class131.field1862 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class82.field1189[var7];
                    int var11 = this.field4292;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var8 = 2048 - -(-var4 + var10 >> 1);
                            }
                        } else {
                            var8 = (var4 - 4096 + var10 >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field4289 > var12; ++var12) {
                        if (~var8 <= ~this.field4307[var12] && ~var8 > ~this.field4307[var12 + 1]) {
                            if (~this.field4287[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(B)V")
    public static void method1648(byte arg0) {
        field4294 = null;
        field4300 = null;
        field4288 = null;
        field4306 = null;
        field4308 = null;
        field4309 = null;
        if (arg0 != 52) {
            method1643((class56) null, true);
        }
        field4301 = null;
    }
}
