import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class76 extends class243 {

    @OriginalMember(owner = "client!fe", name = "lb", descriptor = "I")
    private int field1329 = -1;

    @OriginalMember(owner = "client!fe", name = "jb", descriptor = "Lub;")
    public static class227 field1327 = class257.method1749("Verbindung abgebrochen)3", 17263);

    @OriginalMember(owner = "client!fe", name = "ib", descriptor = "[I")
    public static int[] field1326 = new int[32];

    @OriginalMember(owner = "client!fe", name = "eb", descriptor = "Lub;")
    public static class227 field1322 = class257.method1749("scrollbar", 17263);

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "Z")
    public static boolean field1317 = true;

    @OriginalMember(owner = "client!fe", name = "nb", descriptor = "I")
    public static int field1331 = 0;

    @OriginalMember(owner = "client!fe", name = "ub", descriptor = "Lub;")
    private static class227 field1338 = class257.method1749("glow1:", 17263);

    @OriginalMember(owner = "client!fe", name = "fb", descriptor = "Lub;")
    public static class227 field1323 = field1338;

    @OriginalMember(owner = "client!fe", name = "rb", descriptor = "Z")
    public static boolean field1335 = false;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "Lub;")
    public static class227 field1320 = field1338;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    public int field1318;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!fe", name = "gb", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!fe", name = "hb", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!fe", name = "kb", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!fe", name = "mb", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!fe", name = "pb", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!fe", name = "qb", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!fe", name = "sb", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!fe", name = "tb", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!fe", name = "ob", descriptor = "[I")
    public int[] field1332;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            this.field1329 = arg0.method1447(0);
        }
        ++field1333;
        if (arg1) {
            field1335 = false;
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class76() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B[Lub;)Lub;")
    public static final class227 method445(byte arg0, class227[] arg1) {
        ++field1330;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        } else {
            int var2 = 63 % ((arg0 - -22) / 49);
            return class122.method758(arg1, 0, arg1.length, 0);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[[I")
    public int[][] method80(int arg0, int arg1) {
        int[][] var3 = super.field4213.method1406(arg1, 0);
        if (arg0 != 230) {
            method448(-82);
        }
        ++field1325;
        if (super.field4213.field3771 && this.method450(arg0 + -230)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = (~class193.field3280 == ~this.field1318 ? arg1 : this.field1318 * arg1 / class193.field3280) * this.field1319;
            if (~class212.field3586 != ~this.field1319) {
                for (int var8 = 0; ~class212.field3586 < ~var8; ++var8) {
                    int var9 = this.field1319 * var8 / class212.field3586;
                    int var10 = this.field1332[var7 + var9];
                    var5[var8] = method446(var10 << 4, 4080);
                    var6[var8] = method446(4080, var10 >> 4);
                    var4[var8] = method446(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~var11 > ~class212.field3586; ++var11) {
                    int var12 = this.field1332[var7++];
                    var5[var11] = method446(var12 << 4, 4080);
                    var6[var11] = method446(65280, var12) >> 4;
                    var4[var11] = method446(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(II)I")
    public static int method446(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field1334;
        if (~arg1 <= ~class125.field2234 && ~arg1 >= ~class19.field331 && ~arg4 <= ~class125.field2234 && arg4 <= class19.field331 && ~arg6 <= ~class125.field2234 && ~arg6 >= ~class19.field331 && ~arg0 <= ~class125.field2234 && ~arg0 >= ~class19.field331 && ~class161.field2718 >= ~arg7 && arg7 <= class46.field817 && ~arg8 <= ~class161.field2718 && ~class46.field817 <= ~arg8 && class161.field2718 <= arg2 && arg2 <= class46.field817 && ~class161.field2718 >= ~arg9 && arg9 <= class46.field817) {
            class236.method1576(3, arg9, arg3, arg4, arg8, arg0, arg7, arg1, arg6, arg2);
        } else {
            class165.method1020(arg0, true, arg4, arg6, arg8, arg7, arg2, arg1, arg9, arg3);
        }
        if (arg5 != -1) {
            method447(100, -70, 62, -92, -25, 68, -127, -83, -10, -45);
        }
    }

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "(I)V")
    public static final void method448(int arg0) {
        ++field1321;
        if (class145.field2508 != 0) {
            try {
                if (~(++class70.field1241) < -2001) {
                    if (class9.field172 != null) {
                        class9.field172.method97(arg0 + -2);
                        class9.field172 = null;
                    }
                    if (~class100.field1755 <= -2) {
                        class145.field2508 = 0;
                        class257.field4505 = -5;
                        return;
                    }
                    ++class100.field1755;
                    class70.field1241 = 0;
                    if (~class9.field168 == ~class177.field2945) {
                        class9.field168 = class104.field1822;
                    } else {
                        class9.field168 = class177.field2945;
                    }
                    class145.field2508 = 1;
                }
                if (class145.field2508 == 1) {
                    class221.field3751 = class61.field1123.method1602(class9.field168, false, class123.field2218);
                    class145.field2508 = 2;
                }
                if (~class145.field2508 == -3) {
                    if (class221.field3751.field1302 == 2) {
                        throw new IOException();
                    }
                    if (~class221.field3751.field1302 != -2) {
                        return;
                    }
                    class9.field172 = new class20((Socket) class221.field3751.field1299, class61.field1123);
                    class221.field3751 = null;
                    class9.field172.method94(class176.field2935.field3879, (byte) -24, class176.field2935.field3901, 0);
                    if (class77.field1360 != null) {
                        class77.field1360.method1323((byte) -70);
                    }
                    if (class124.field2229 != null) {
                        class124.field2229.method1323((byte) -81);
                    }
                    int var1 = class9.field172.method98((byte) 82);
                    if (class77.field1360 != null) {
                        class77.field1360.method1323((byte) -72);
                    }
                    if (class124.field2229 != null) {
                        class124.field2229.method1323((byte) -74);
                    }
                    if (var1 != 21) {
                        class145.field2508 = 0;
                        class257.field4505 = var1;
                        class9.field172.method97(arg0 ^ 2);
                        class9.field172 = null;
                        return;
                    }
                    class145.field2508 = 3;
                }
                if (arg0 != 2) {
                    method452((class134[]) null, true, (byte) -1);
                }
                if (class145.field2508 == 3) {
                    if (class9.field172.method93(arg0 + -2) < 1) {
                        return;
                    }
                    class240.field4178 = new class227[class9.field172.method98((byte) 82)];
                    class145.field2508 = 4;
                }
                if (~class145.field2508 == -5) {
                    if (~class9.field172.method93(0) <= ~(class240.field4178.length * 8)) {
                        class32.field512.field3879 = 0;
                        class9.field172.method99(class240.field4178.length * 8, 0, class32.field512.field3901, -56);
                        for (int var2 = 0; var2 < class240.field4178.length; ++var2) {
                            class240.field4178[var2] = class118.method744(class32.field512.method1469((byte) 41), -127);
                        }
                        class145.field2508 = 0;
                        class257.field4505 = 21;
                        class9.field172.method97(0);
                        class9.field172 = null;
                    }
                }
            } catch (IOException var3) {
                if (class9.field172 != null) {
                    class9.field172.method97(0);
                    class9.field172 = null;
                }
                if (~class100.field1755 <= -2) {
                    class145.field2508 = 0;
                    class257.field4505 = -4;
                } else {
                    if (class9.field168 == class177.field2945) {
                        class9.field168 = class104.field1822;
                    } else {
                        class9.field168 = class177.field2945;
                    }
                    class70.field1241 = 0;
                    class145.field2508 = 1;
                    ++class100.field1755;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V")
    public final void method227(int arg0) {
        ++field1336;
        super.method227(arg0);
        this.field1332 = null;
        if (arg0 != 256) {
            this.method227(51);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(B)I")
    public final int method449(byte arg0) {
        if (arg0 != -64) {
            return 93;
        } else {
            ++field1324;
            return this.field1329;
        }
    }

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "(I)Z")
    public final boolean method450(int arg0) {
        ++field1316;
        if (this.field1332 != null) {
            return true;
        } else if (arg0 <= this.field1329) {
            class163 var2 = class176.method1120(class143.field2464, (byte) -114, this.field1329);
            var2.method1011();
            this.field1319 = var2.field3590;
            this.field1332 = var2.field2756;
            this.field1318 = var2.field3604;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "(I)V")
    public static void method451(int arg0) {
        field1338 = null;
        field1327 = null;
        field1326 = null;
        field1323 = null;
        field1322 = null;
        field1320 = null;
        if (arg0 != -17275) {
            method451(-17);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([Ldj;ZB)V")
    public static final void method452(class134[] arg0, boolean arg1, byte arg2) {
        ++field1337;
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg1) {
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var5 = 0; var5 < 104; ++var5) {
                    for (int var6 = 0; var6 < 104; ++var6) {
                        if (~(class40.field654[var4][var5][var6] & 1) == -2) {
                            int var7 = var4;
                            if ((class40.field654[1][var5][var6] & 2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (~var7 <= -1) {
                                arg0[var7].method824(var5, var6, (byte) -22);
                            }
                        }
                    }
                }
            }
            class3.field38 += -2 + (int) (5.0D * Math.random());
            if (class3.field38 < -8) {
                class3.field38 = -8;
            }
            class104.field1813 += -2 + (int) (5.0D * Math.random());
            if (~class104.field1813 > 15) {
                class104.field1813 = -16;
            }
            if (class3.field38 > 8) {
                class3.field38 = 8;
            }
            if (~class104.field1813 < -17) {
                class104.field1813 = 16;
            }
        }
        int var8 = class104.field1813 >> 1;
        int[][] var9 = new int[104][104];
        int[][] var10 = new int[104][104];
        int var11 = class3.field38 >> 2 << 10;
        if (arg2 == 103) {
            for (int var12 = 0; var3 > var12; ++var12) {
                byte[][] var55 = class51.field895[var12];
                int var56 = (int) Math.sqrt(5100.0D);
                int var57 = var56 * 768 >> 8;
                for (int var58 = 1; ~var58 > -104; ++var58) {
                    for (int var106 = 1; var106 < 103; ++var106) {
                        byte var107 = 74;
                        int var108 = class98.field1717[var12][var106 + 1][var58] - class98.field1717[var12][var106 + -1][var58];
                        int var109 = class98.field1717[var12][var106][var58 + 1] - class98.field1717[var12][var106][var58 + -1];
                        int var110 = (int) Math.sqrt((double) (var109 * var109 + var108 * var108 + 65536));
                        int var111 = (var108 << 8) / var110;
                        int var112 = (var109 << 8) / var110;
                        int var113 = (var55[var106][var58] >> 1) + (var55[var106 + -1][var58] >> 2) + (var55[var106][var58 - -1] >> 3) + (var55[var106 + 1][var58] >> 3) - -(var55[var106][var58 - 1] >> 2);
                        int var114 = -65536 / var110;
                        int var115 = (var114 * -10 + (var111 * -50 - -(var112 * -50))) / var57 + var107;
                        var10[var106][var58] = -var113 + var115;
                    }
                }
                for (int var59 = 0; var59 < 104; ++var59) {
                    class40.field650[var59] = 0;
                    class176.field2932[var59] = 0;
                    class119.field2161[var59] = 0;
                    class186.field3171[var59] = 0;
                    class246.field4299[var59] = 0;
                }
                for (int var60 = -5; ~var60 > -105; ++var60) {
                    for (int var91 = 0; ~var91 > -105; ++var91) {
                        int var100 = var60 + 5;
                        int var10002;
                        if (var100 < 104) {
                            int var101 = 255 & class123.field2215[var12][var100][var91];
                            if (var101 > 0) {
                                class187 var102 = class231.method1560(var101 + -1, -98);
                                class40.field650[var91] += var102.field3186;
                                class176.field2932[var91] += var102.field3185;
                                class119.field2161[var91] += var102.field3183;
                                class186.field3171[var91] += var102.field3192;
                                var10002 = class246.field4299[var91]++;
                            }
                        }
                        int var103 = var60 + -5;
                        if (~var103 <= -1) {
                            int var104 = 255 & class123.field2215[var12][var103][var91];
                            if (~var104 < -1) {
                                class187 var105 = class231.method1560(var104 + -1, -96);
                                class40.field650[var91] -= var105.field3186;
                                class176.field2932[var91] -= var105.field3185;
                                class119.field2161[var91] -= var105.field3183;
                                class186.field3171[var91] -= var105.field3192;
                                var10002 = class246.field4299[var91]--;
                            }
                        }
                    }
                    if (var60 >= 0) {
                        int var92 = 0;
                        int var93 = 0;
                        int var94 = 0;
                        int var95 = 0;
                        int var96 = 0;
                        for (int var97 = -5; ~var97 > -105; ++var97) {
                            int var98 = var97 - -5;
                            if (var98 < 104) {
                                var93 += class176.field2932[var98];
                                var94 += class186.field3171[var98];
                                var92 += class40.field650[var98];
                                var96 += class119.field2161[var98];
                                var95 += class246.field4299[var98];
                            }
                            int var99 = var97 - 5;
                            if (~var99 <= -1) {
                                var93 -= class176.field2932[var99];
                                var96 -= class119.field2161[var99];
                                var94 -= class186.field3171[var99];
                                var95 -= class246.field4299[var99];
                                var92 -= class40.field650[var99];
                            }
                            if (~var97 <= -1 && ~var95 < -1) {
                                var9[var60][var97] = class46.method257(var92 * 256 / var94, (byte) 11, var93 / var95, var96 / var95);
                            }
                        }
                    }
                }
                for (int var61 = 1; ~var61 > -104; ++var61) {
                    for (int var64 = 1; var64 < 103; ++var64) {
                        if (arg1 || class34.method178(true) || ~(2 & class40.field654[0][var61][var64]) != -1 || ~(16 & class40.field654[var12][var61][var64]) == -1 && class172.method1103(var12, var61, var64, true) == class14.field269) {
                            if (~class119.field2177 < ~var12) {
                                class119.field2177 = var12;
                            }
                            int var65 = class123.field2215[var12][var61][var64] & 255;
                            int var66 = 255 & class245.field4276[var12][var61][var64];
                            if (var65 > 0 || var66 > 0) {
                                int var67 = class98.field1717[var12][var61][var64];
                                int var68 = class98.field1717[var12][var61 + 1][var64];
                                int var69 = class98.field1717[var12][var61 - -1][var64 + 1];
                                int var70 = class98.field1717[var12][var61][var64 + 1];
                                if (~var12 < -1) {
                                    boolean var71 = true;
                                    if (~var65 == -1 && ~class132.field2302[var12][var61][var64] != -1) {
                                        var71 = false;
                                    }
                                    if (~var66 < -1 && !class109.method675(var66 + -1, true).field2170) {
                                        var71 = false;
                                    }
                                    if (var71 && ~var67 == ~var68 && var67 == var69 && var67 == var70) {
                                        class149.field2612[var12][var61][var64] = class246.method1640(class149.field2612[var12][var61][var64], 2340);
                                    }
                                }
                                int var72;
                                int var75;
                                if (~var65 < -1) {
                                    var72 = var9[var61][var64];
                                    int var73 = (127 & var72) + var8;
                                    if (var73 < 0) {
                                        var73 = 0;
                                    } else if (var73 > 127) {
                                        var73 = 127;
                                    }
                                    int var74 = (64512 & var72 - -var11) + (var72 & 896) + var73;
                                    var75 = class62.field1135[class125.method775((byte) -122, 96, var74)];
                                } else {
                                    var72 = -1;
                                    var75 = 0;
                                }
                                int var76 = var10[var61][var64];
                                int var77 = var10[var61 + 1][var64];
                                int var78 = var10[var61 + 1][var64 + 1];
                                int var79 = var10[var61][var64 - -1];
                                if (var66 == 0) {
                                    class146.method921(var12, var61, var64, 0, 0, -1, var67, var68, var69, var70, class125.method775((byte) -107, var76, var72), class125.method775((byte) -111, var77, var72), class125.method775((byte) -118, var78, var72), class125.method775((byte) -92, var79, var72), 0, 0, 0, 0, var75, 0);
                                } else {
                                    int var80 = class132.field2302[var12][var61][var64] + 1;
                                    byte var81 = class147.field2535[var12][var61][var64];
                                    class119 var82 = class109.method675(var66 + -1, true);
                                    int var83 = var82.field2169;
                                    if (var83 >= 0 && !class62.field1129.method37(119, var83)) {
                                        var83 = -1;
                                    }
                                    int var84;
                                    int var85;
                                    if (var83 >= 0) {
                                        var84 = -1;
                                        var85 = class62.field1135[class3.method10(class62.field1129.method50((byte) -75, var83), 96, (byte) 126)];
                                    } else if (var82.field2165 == -1) {
                                        var85 = 0;
                                        var84 = -2;
                                    } else {
                                        var84 = var82.field2165;
                                        int var86 = (127 & var84) + var8;
                                        if (var86 < 0) {
                                            var86 = 0;
                                        } else if (var86 > 127) {
                                            var86 = 127;
                                        }
                                        int var87 = (var11 + var84 & 64512) + (896 & var84) + var86;
                                        var85 = class62.field1135[class3.method10(var87, 96, (byte) 123)];
                                    }
                                    if (~var82.field2164 <= -1) {
                                        int var88 = var82.field2164;
                                        int var89 = (127 & var88) + var8;
                                        if (var89 < 0) {
                                            var89 = 0;
                                        } else if (var89 > 127) {
                                            var89 = 127;
                                        }
                                        int var90 = (var11 + var88 & 64512) + var89 - -(var88 & 896);
                                        var85 = class62.field1135[class3.method10(var90, 96, (byte) 116)];
                                    }
                                    class146.method921(var12, var61, var64, var80, var81, var83, var67, var68, var69, var70, class125.method775((byte) -114, var76, var72), class125.method775((byte) -97, var77, var72), class125.method775((byte) -122, var78, var72), class125.method775((byte) -92, var79, var72), class3.method10(var84, var76, (byte) 110), class3.method10(var84, var77, (byte) 118), class3.method10(var84, var78, (byte) 126), class3.method10(var84, var79, (byte) 123), var75, var85);
                                }
                            }
                        }
                    }
                }
                if (!arg1) {
                    for (int var62 = 1; var62 < 103; ++var62) {
                        for (int var63 = 1; ~var63 > -104; ++var63) {
                            if ((2 & class40.field654[0][var63][var62]) != 0) {
                                class243.method1620(var12, var63, var62, 0);
                            } else {
                                class243.method1620(var12, var63, var62, class172.method1103(var12, var63, var62, true));
                            }
                        }
                    }
                }
                class123.field2215[var12] = null;
                class245.field4276[var12] = null;
                class132.field2302[var12] = null;
                class147.field2535[var12] = null;
                class51.field895[var12] = null;
            }
            class148.method942(-50, -10, -50);
            if (!arg1) {
                for (int var13 = 0; ~var13 > -105; ++var13) {
                    for (int var54 = 0; var54 < 104; ++var54) {
                        if ((class40.field654[1][var13][var54] & 2) == 2) {
                            class230.method1553(var13, var54);
                        }
                    }
                }
                int var14 = 1;
                int var15 = 2;
                int var16 = 4;
                for (int var17 = 0; var17 < 4; ++var17) {
                    if (~var17 < -1) {
                        var16 <<= 3;
                        var14 <<= 3;
                        var15 <<= 3;
                    }
                    for (int var18 = 0; ~var18 >= ~var17; ++var18) {
                        for (int var19 = 0; ~var19 >= -105; ++var19) {
                            for (int var20 = 0; ~var20 >= -105; ++var20) {
                                if ((var14 & class149.field2612[var18][var20][var19]) != 0) {
                                    int var21;
                                    for (var21 = var19; var21 > 0 && (var14 & class149.field2612[var18][var20][var21 - 1]) != 0; --var21) {
                                    }
                                    int var22 = var18;
                                    int var23;
                                    for (var23 = var19; ~var23 > -105 && (var14 & class149.field2612[var18][var20][var23 + 1]) != 0; ++var23) {
                                    }
                                    int var24 = var18;
                                    label375: while (var22 > 0) {
                                        for (int var25 = var21; ~var23 <= ~var25; ++var25) {
                                            if ((var14 & class149.field2612[var22 + -1][var20][var25]) == 0) {
                                                break label375;
                                            }
                                        }
                                        --var22;
                                    }
                                    label364: while (~var24 > ~var17) {
                                        for (int var26 = var21; var26 <= var23; ++var26) {
                                            if (~(class149.field2612[var24 + 1][var20][var26] & var14) == -1) {
                                                break label364;
                                            }
                                        }
                                        ++var24;
                                    }
                                    int var27 = (var23 - var21 + 1) * (var24 + 1 + -var22);
                                    if (var27 >= 8) {
                                        short var28 = 240;
                                        int var29 = class98.field1717[var22][var20][var21];
                                        int var30 = class98.field1717[var24][var20][var21] - var28;
                                        class182.method1166(var17, 1, var20 * 128, var20 * 128, var21 * 128, var23 * 128 - -128, var30, var29);
                                        for (int var31 = var22; var31 <= var24; ++var31) {
                                            for (int var32 = var21; var32 <= var23; ++var32) {
                                                class149.field2612[var31][var20][var32] = method446(class149.field2612[var31][var20][var32], ~var14);
                                            }
                                        }
                                    }
                                }
                                if (~(var15 & class149.field2612[var18][var20][var19]) != -1) {
                                    int var33;
                                    for (var33 = var20; ~var33 < -1 && ~(var15 & class149.field2612[var18][var33 + -1][var19]) != -1; --var33) {
                                    }
                                    int var34;
                                    for (var34 = var20; var34 < 104 && (var15 & class149.field2612[var18][var34 + 1][var19]) != 0; ++var34) {
                                    }
                                    int var35 = var18;
                                    int var36;
                                    label430: for (var36 = var18; var36 > 0; --var36) {
                                        for (int var37 = var33; ~var37 >= ~var34; ++var37) {
                                            if ((class149.field2612[var36 + -1][var37][var19] & var15) == 0) {
                                                break label430;
                                            }
                                        }
                                    }
                                    label419: while (var17 > var35) {
                                        for (int var38 = var33; ~var34 <= ~var38; ++var38) {
                                            if (~(class149.field2612[var35 + 1][var38][var19] & var15) == -1) {
                                                break label419;
                                            }
                                        }
                                        ++var35;
                                    }
                                    int var39 = (var35 - -1 + -var36) * (-var33 + 1 + var34);
                                    if (var39 >= 8) {
                                        short var40 = 240;
                                        int var41 = class98.field1717[var36][var33][var19];
                                        int var42 = class98.field1717[var35][var33][var19] + -var40;
                                        class182.method1166(var17, 2, var33 * 128, var34 * 128 + 128, var19 * 128, var19 * 128, var42, var41);
                                        for (int var43 = var36; var35 >= var43; ++var43) {
                                            for (int var44 = var33; ~var34 <= ~var44; ++var44) {
                                                class149.field2612[var43][var44][var19] = method446(class149.field2612[var43][var44][var19], ~var15);
                                            }
                                        }
                                    }
                                }
                                if (~(class149.field2612[var18][var20][var19] & var16) != -1) {
                                    int var45 = var20;
                                    int var46 = var20;
                                    int var47 = var19;
                                    int var48;
                                    for (var48 = var19; ~var48 < -1 && (class149.field2612[var18][var20][var48 - 1] & var16) != 0; --var48) {
                                    }
                                    while (~var47 > -105 && (var16 & class149.field2612[var18][var20][var47 + 1]) != 0) {
                                        ++var47;
                                    }
                                    label485: while (~var45 < -1) {
                                        for (int var49 = var48; ~var49 >= ~var47; ++var49) {
                                            if (~(var16 & class149.field2612[var18][var45 + -1][var49]) == -1) {
                                                break label485;
                                            }
                                        }
                                        --var45;
                                    }
                                    label474: while (~var46 > -105) {
                                        for (int var50 = var48; var47 >= var50; ++var50) {
                                            if ((class149.field2612[var18][var46 + 1][var50] & var16) == 0) {
                                                break label474;
                                            }
                                        }
                                        ++var46;
                                    }
                                    if (~((-var48 + var47 - -1) * (var46 + 1 + -var45)) <= -5) {
                                        int var51 = class98.field1717[var18][var45][var48];
                                        class182.method1166(var17, 4, var45 * 128, var46 * 128 + 128, var48 * 128, var47 * 128 + 128, var51, var51);
                                        for (int var52 = var45; var52 <= var46; ++var52) {
                                            for (int var53 = var48; ~var53 >= ~var47; ++var53) {
                                                class149.field2612[var18][var52][var53] = method446(class149.field2612[var18][var52][var53], ~var16);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
