import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class123 extends class91 {

    @OriginalMember(owner = "client!re", name = "sb", descriptor = "I")
    private int field2704 = -1;

    @OriginalMember(owner = "client!re", name = "nb", descriptor = "Z")
    private volatile boolean field2699 = false;

    @OriginalMember(owner = "client!re", name = "Xb", descriptor = "Z")
    private boolean field2735 = false;

    @OriginalMember(owner = "client!re", name = "Mb", descriptor = "Lfb;")
    private class38 field2724;

    @OriginalMember(owner = "client!re", name = "Bb", descriptor = "Lfb;")
    private class38 field2713;

    @OriginalMember(owner = "client!re", name = "Ub", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!re", name = "ub", descriptor = "Lpe;")
    private static class109 field2706 = class141.method1120("Loading fonts )2 ", 0);

    @OriginalMember(owner = "client!re", name = "rb", descriptor = "I")
    public static volatile int field2703 = 0;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "Lpe;")
    public static class109 field2698 = null;

    @OriginalMember(owner = "client!re", name = "Lb", descriptor = "I")
    public static int field2723 = 0;

    @OriginalMember(owner = "client!re", name = "Ab", descriptor = "I")
    public static int field2712 = 0;

    @OriginalMember(owner = "client!re", name = "zb", descriptor = "Lpe;")
    public static class109 field2711 = field2706;

    @OriginalMember(owner = "client!re", name = "ob", descriptor = "[I")
    private static int[] field2700 = new int[5];

    @OriginalMember(owner = "client!re", name = "Nb", descriptor = "Lpe;")
    public static class109 field2725 = class141.method1120("(Y<)4col>", 0);

    @OriginalMember(owner = "client!re", name = "Gb", descriptor = "Lpe;")
    public static class109 field2718 = class141.method1120("Zu viele Anmelde)2Versuche von Ihrer Adresse", 0);

    @OriginalMember(owner = "client!re", name = "Db", descriptor = "I")
    public static int field2715 = 0;

    @OriginalMember(owner = "client!re", name = "Pb", descriptor = "Lpe;")
    public static class109 field2727 = class141.method1120("Benutzen Sie die (WPasswort -=ndern(W Option", 0);

    @OriginalMember(owner = "client!re", name = "pb", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!re", name = "qb", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!re", name = "tb", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!re", name = "vb", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!re", name = "wb", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!re", name = "xb", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!re", name = "yb", descriptor = "I")
    private int field2710;

    @OriginalMember(owner = "client!re", name = "Cb", descriptor = "I")
    private int field2714;

    @OriginalMember(owner = "client!re", name = "Eb", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!re", name = "Fb", descriptor = "I")
    public static int field2717;

    @OriginalMember(owner = "client!re", name = "Hb", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!re", name = "Ib", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!re", name = "Jb", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!re", name = "Kb", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!re", name = "Qb", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!re", name = "Rb", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!re", name = "Sb", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!re", name = "Tb", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!re", name = "Vb", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!re", name = "Wb", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!re", name = "Yb", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!re", name = "Ob", descriptor = "[Z")
    private volatile boolean[] field2726;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(II)V")
    public static final void method991(int arg0, int arg1) {
        ++field2717;
        int[] var2 = class136.field2969.field659;
        int var3 = var2.length;
        for (int var4 = 0; ~var4 > ~var3; ++var4) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; ++var5) {
            int var20 = (-var5 + 103) * 4 * 512 + 24628;
            for (int var21 = 1; ~var21 > -104; ++var21) {
                if (~(24 & class107.field2249[arg0][var21][var5]) == -1) {
                    class147.field3201.method696(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && ~(class107.field2249[arg0 + 1][var21][var5] & 8) != -1) {
                    class147.field3201.method696(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class136.field2969.method256();
        int var6 = -10 + (int) (Math.random() * 20.0D) + 238 << 16;
        int var7 = (238 - -((int) (20.0D * Math.random())) + -10 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + -10 + (int) (Math.random() * 20.0D) + 238;
        if (arg1 != -18140) {
            field2711 = null;
        }
        for (int var8 = 1; ~var8 > -104; ++var8) {
            for (int var19 = 1; ~var19 > -104; ++var19) {
                if ((24 & class107.field2249[arg0][var19][var8]) == 0) {
                    class1.method12(var8, var6, -31082, var19, arg0, var7);
                }
                if (arg0 < 3 && ~(class107.field2249[arg0 + 1][var19][var8] & 8) != -1) {
                    class1.method12(var8, var6, arg1 ^ 16306, var19, arg0 + 1, var7);
                }
            }
        }
        class7.field171 = 0;
        for (int var9 = 0; ~var9 > -105; ++var9) {
            for (int var10 = 0; var10 < 104; ++var10) {
                int var11 = class147.field3201.method672(class75.field1513, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 32767;
                    int var13 = class89.method736(var12, 11893).field3267;
                    if (~var13 <= -1) {
                        int var14 = var9;
                        int var15 = var10;
                        if (~var13 != -23 && ~var13 != -30 && var13 != 34 && var13 != 36 && ~var13 != -47 && var13 != 47 && ~var13 != -49) {
                            int[][] var16 = class109.field2318[class75.field1513].field1618;
                            for (int var17 = 0; ~var17 > -11; ++var17) {
                                int var18 = (int) (4.0D * Math.random());
                                if (var18 == 0 && ~var14 < -1 && var9 + -3 < var14 && ~(19661064 & var16[var14 + -1][var15]) == -1) {
                                    --var14;
                                }
                                if (~var18 == -2 && ~var14 > -104 && var14 < var9 - -3 && (var16[var14 - -1][var15] & 19661184) == 0) {
                                    ++var14;
                                }
                                if (var18 == 2 && var15 > 0 && ~var15 < ~(var10 - 3) && ~(var16[var14][var15 - 1] & 19661058) == -1) {
                                    --var15;
                                }
                                if (~var18 == -4 && ~var15 > -104 && ~(var10 + 3) < ~var15 && (19661088 & var16[var14][var15 + 1]) == 0) {
                                    ++var15;
                                }
                            }
                        }
                        class125.field2757[class7.field171] = class128.field2847[var13];
                        class144.field3160[class7.field171] = var14;
                        class3.field73[class7.field171] = var15;
                        ++class7.field171;
                    }
                }
            }
        }
        class75.field1510.method184((byte) 80);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III[B)Z")
    public static final boolean method992(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field2720;
        boolean var4 = true;
        if (arg0 > -101) {
            return false;
        } else {
            int var5 = -1;
            class13 var6 = new class13(arg3);
            label74: while (true) {
                int var7 = var6.method147(false);
                if (var7 == 0) {
                    return var4;
                }
                var5 += var7;
                int var8 = 0;
                boolean var9 = false;
                while (true) {
                    int var12;
                    class148 var16;
                    do {
                        int var14;
                        int var15;
                        do {
                            do {
                                do {
                                    do {
                                        while (var9) {
                                            int var17 = var6.method147(false);
                                            if (~var17 == -1) {
                                                continue label74;
                                            }
                                            var6.method142(27467);
                                        }
                                        int var10 = var6.method147(false);
                                        if (~var10 == -1) {
                                            continue label74;
                                        }
                                        var8 += var10 + -1;
                                        int var11 = (4059 & var8) >> 6;
                                        var12 = var6.method142(27467) >> 2;
                                        int var13 = 63 & var8;
                                        var14 = arg1 + var11;
                                        var15 = arg2 + var13;
                                    } while (~var14 >= -1);
                                } while (~var15 >= -1);
                            } while (var14 >= 103);
                        } while (~var15 <= -104);
                        var16 = class89.method736(var5, 11893);
                    } while (var12 == 22 && class62.field1269 && ~var16.field3226 == -1 && var16.field3278 != 1 && !var16.field3222);
                    if (!var16.method1154((byte) 23)) {
                        var4 = false;
                        ++class122.field2690;
                    }
                    var9 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZII)V")
    public final void method993(boolean arg0, int arg1, int arg2) {
        this.field2710 = arg1;
        ++field2731;
        this.field2714 = arg2;
        if (this.field2713 != null) {
            class151.method1175(this, this.field2713, this.field2732, (byte) -103);
        } else {
            class38.method361(this, (byte) 101, this.field2714, (byte) 0, 255, this.field2732, true);
        }
        if (!arg0) {
            this.method998(-92, (byte[]) null, (byte) -86, false, (class38) null);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
    private final void method994(byte arg0) {
        ++field2721;
        this.field2726 = new boolean[super.field1927.length];
        for (int var2 = 0; var2 < this.field2726.length; ++var2) {
            this.field2726[var2] = false;
        }
        if (this.field2724 == null) {
            this.field2699 = true;
        } else {
            this.field2704 = -1;
            for (int var3 = 0; ~var3 > ~this.field2726.length; ++var3) {
                if (~super.field1942[var3] < -1) {
                    class104.method837(this.field2724, var3, arg0 + -233, this);
                    this.field2704 = var3;
                }
            }
            if (arg0 != 104) {
                field2703 = -127;
            }
            if (this.field2704 == -1) {
                this.field2699 = true;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)I")
    public final int method995(boolean arg0) {
        ++field2705;
        if (this.field2699) {
            return 100;
        } else if (super.field1927 != null) {
            return 99;
        } else {
            int var2 = class126.method1020(arg0, this.field2732, 255);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
    public static final void method996(byte arg0) {
        ++field2716;
        if (class139.field3039 > 0) {
            --class139.field3039;
        }
        if (class112.field2407 > 1) {
            --class112.field2407;
        }
        if (class153.field3370) {
            class153.field3370 = false;
            class15.method177((byte) -38);
        } else {
            for (int var1 = 0; ~var1 > -101 && class149.method1170((byte) 38); ++var1) {
            }
            if (class153.field3373 == 30) {
                class126.method1022(166, class63.field1299, true);
                Object var2 = class19.field477.field1006;
                synchronized (class19.field477.field1006) {
                    if (!class146.field3192) {
                        class19.field477.field1007 = 0;
                    } else if (~class19.field484 != -1 || class19.field477.field1007 >= 40) {
                        class63.field1299.method535(91, -25013);
                        ++class152.field3349;
                        int var3 = 0;
                        class63.field1299.method135(0, (byte) -50);
                        int var4 = class63.field1299.field309;
                        for (int var5 = 0; ~var5 > ~class19.field477.field1007 && class63.field1299.field309 - var4 < 240; ++var5) {
                            int var6 = class19.field477.field1021[var5];
                            ++var3;
                            if (var6 < 0) {
                                var6 = 0;
                            } else if (~var6 < -503) {
                                var6 = 502;
                            }
                            int var7 = class19.field477.field1023[var5];
                            if (~var7 <= -1) {
                                if (var7 > 764) {
                                    var7 = 764;
                                }
                            } else {
                                var7 = 0;
                            }
                            int var8 = var6 * 765 + var7;
                            if (~class19.field477.field1021[var5] == 0 && class19.field477.field1023[var5] == -1) {
                                var6 = -1;
                                var7 = -1;
                                var8 = 524287;
                            }
                            if (~class8.field181 == ~var7 && ~class47.field985 == ~var6) {
                                if (field2712 < 2047) {
                                    ++field2712;
                                }
                            } else {
                                int var9 = var7 - class8.field181;
                                class8.field181 = var7;
                                int var10 = -class47.field985 + var6;
                                class47.field985 = var6;
                                if (~field2712 > -9 && ~var9 <= 31 && var9 <= 31 && ~var10 <= 31 && var10 <= 31) {
                                    var9 += 32;
                                    var10 += 32;
                                    class63.field1299.method134((field2712 << 12) + (var9 << 6) + var10, (byte) -95);
                                    field2712 = 0;
                                } else if (~field2712 > -9) {
                                    class63.field1299.method150(true, (field2712 << 19) + var8 + 8388608);
                                    field2712 = 0;
                                } else {
                                    class63.field1299.method123(-1073741824 - (-(field2712 << 19) - var8), 1375221240);
                                    field2712 = 0;
                                }
                            }
                        }
                        class63.field1299.method154(-1, class63.field1299.field309 - var4);
                        if (class19.field477.field1007 > var3) {
                            class19.field477.field1007 -= var3;
                            for (int var11 = 0; class19.field477.field1007 > var11; ++var11) {
                                class19.field477.field1023[var11] = class19.field477.field1023[var3 + var11];
                                class19.field477.field1021[var11] = class19.field477.field1021[var11 - -var3];
                            }
                        } else {
                            class19.field477.field1007 = 0;
                        }
                    }
                }
                if (~class19.field484 != -1) {
                    ++class46.field966;
                    long var12 = (-class53.field1098 + class144.field3158) / 50L;
                    if (var12 > 4095L) {
                        var12 = 4095L;
                    }
                    int var14 = class120.field2671;
                    if (~var14 > -1) {
                        var14 = 0;
                    } else if (var14 > 502) {
                        var14 = 502;
                    }
                    class53.field1098 = class144.field3158;
                    byte var15 = 0;
                    if (class19.field484 == 2) {
                        var15 = 1;
                    }
                    int var16 = class115.field2538;
                    class63.field1299.method535(64, -25013);
                    int var17 = (int) var12;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (~var16 < -765) {
                        var16 = 764;
                    }
                    int var18 = var14 * 765 - -var16;
                    class63.field1299.method110((var15 << 19) + ((var17 << 20) - -var18), (byte) 122);
                }
                if (class44.field943[96] || class44.field943[97] || class44.field943[98] || class44.field943[99]) {
                    class2.field48 = true;
                }
                if (class115.field2541 > 0) {
                    --class115.field2541;
                }
                if (class2.field48 && ~class115.field2541 >= -1) {
                    class2.field48 = false;
                    ++class12.field271;
                    class115.field2541 = 20;
                    class63.field1299.method535(154, -25013);
                    class63.field1299.method134(class55.field1120, (byte) -116);
                    class63.field1299.method134(class100.field2104, (byte) 57);
                }
                if (arg0 >= 18) {
                    if (class89.field1886 && !class95.field2045) {
                        ++class13.field311;
                        class95.field2045 = true;
                        class63.field1299.method535(137, -25013);
                        class63.field1299.method135(1, (byte) -50);
                    }
                    if (!class89.field1886 && class95.field2045) {
                        class95.field2045 = false;
                        class63.field1299.method535(137, -25013);
                        ++class13.field311;
                        class63.field1299.method135(0, (byte) -50);
                    }
                    class35.method357(true);
                    if (~class153.field3373 == -31) {
                        class75.method589((byte) 119);
                        class85.method714(-1);
                        ++class92.field1974;
                        if (~class92.field1974 < -751) {
                            class15.method177((byte) -38);
                        } else {
                            class93.method773(7944);
                            class52.method431((byte) 34);
                            class154.method1198(0);
                            ++class139.field3042;
                            if (~class16.field400 != -1) {
                                class16.field408 += 20;
                                if (~class16.field408 <= -401) {
                                    class16.field400 = 0;
                                }
                            }
                            if (class35.field786 != null) {
                                ++class13.field303;
                                if (~class13.field303 <= -16) {
                                    class138.method1092(0, class35.field786);
                                    class35.field786 = null;
                                }
                            }
                            if (class114.field2526 != null) {
                                class138.method1092(0, class114.field2526);
                                if (class82.field1754 > class133.field2898 + 5 || ~class82.field1754 > ~(class133.field2898 - 5) || ~class48.field992 < ~(class60.field1178 + 5) || ~(class60.field1178 + -5) < ~class48.field992) {
                                    class146.field3194 = true;
                                }
                                ++class24.field565;
                                if (~class19.field467 == -1) {
                                    if (class146.field3194 && class24.field565 >= 5) {
                                        if (class122.field2689 == class114.field2526 && class92.field1991 != class88.field1866) {
                                            class154 var19 = class114.field2526;
                                            byte var20 = 0;
                                            ++class67.field1351;
                                            if (class121.field2672 == 1 && ~var19.field3459 == -207) {
                                                var20 = 1;
                                            }
                                            if (~var19.field3496[class92.field1991] >= -1) {
                                                var20 = 0;
                                            }
                                            if (class78.method628((byte) -51, class136.method1084(0, var19))) {
                                                int var21 = class92.field1991;
                                                int var22 = class88.field1866;
                                                var19.field3496[var21] = var19.field3496[var22];
                                                var19.field3450[var21] = var19.field3450[var22];
                                                var19.field3496[var22] = -1;
                                                var19.field3450[var22] = 0;
                                            } else if (~var20 != -2) {
                                                var19.method1185((byte) -103, class88.field1866, class92.field1991);
                                            } else {
                                                int var23 = class88.field1866;
                                                int var24 = class92.field1991;
                                                while (var23 != var24) {
                                                    if (var23 <= var24) {
                                                        if (var23 < var24) {
                                                            var19.method1185((byte) -100, var23, var23 - -1);
                                                            ++var23;
                                                        }
                                                    } else {
                                                        var19.method1185((byte) -114, var23, var23 + -1);
                                                        --var23;
                                                    }
                                                }
                                            }
                                            class63.field1299.method535(143, -25013);
                                            class63.field1299.method138(-51, var20);
                                            class63.field1299.method146(-27303, class88.field1866);
                                            class63.field1299.method129(false, class92.field1991);
                                            class63.field1299.method118(class114.field2526.field3514, 675269912);
                                        }
                                    } else if ((~class127.field2827 == -2 || class23.method221(2000, class63.field1302 + -1)) && ~class63.field1302 < -3) {
                                        class42.method389(0);
                                    } else if (~class63.field1302 < -1) {
                                        class92.method767((byte) -99, class63.field1302 + -1);
                                    }
                                    class19.field484 = 0;
                                    class114.field2526 = null;
                                    class13.field303 = 10;
                                }
                            }
                            class82.field1731 = false;
                            class77.field1619 = 0;
                            class154 var25 = class4.field81;
                            class113.field2482 = false;
                            class154 var26 = class139.field3023;
                            class19.field470 = null;
                            class4.field81 = null;
                            class139.field3023 = null;
                            while (class137.method1088(false) && class77.field1619 < 128) {
                                class136.field2976[class77.field1619] = class86.field1831;
                                class133.field2902[class77.field1619] = class113.field2467;
                                ++class77.field1619;
                            }
                            class91.method747(0, 503, class19.field472, -1, 0, 0, 765, 0);
                            ++class9.field219;
                            while (true) {
                                class93 var27;
                                class154 var28;
                                class154 var29;
                                do {
                                    var27 = (class93) class41.field844.method192(30);
                                    if (var27 == null) {
                                        while (true) {
                                            class93 var30;
                                            class154 var31;
                                            class154 var32;
                                            do {
                                                var30 = (class93) class68.field1377.method192(30);
                                                if (var30 == null) {
                                                    while (true) {
                                                        class93 var33;
                                                        class154 var34;
                                                        class154 var35;
                                                        do {
                                                            var33 = (class93) class116.field2572.method192(30);
                                                            if (var33 == null) {
                                                                if (class66.field1334 != null) {
                                                                    class147.method1145(-10516);
                                                                }
                                                                if (~class81.field1700 != 0) {
                                                                    int var36 = class81.field1700;
                                                                    int var37 = class81.field1690;
                                                                    boolean var38 = class86.method722(var37, 0, 126, 0, 0, class136.field2975.field3120[0], 0, 0, 0, class136.field2975.field3121[0], var36, true);
                                                                    if (var38) {
                                                                        class16.field400 = 1;
                                                                        class16.field408 = 0;
                                                                        class63.field1303 = class115.field2538;
                                                                        class116.field2590 = class120.field2671;
                                                                    }
                                                                    class81.field1700 = -1;
                                                                }
                                                                class68.method532(-32);
                                                                if (class4.field81 != var25) {
                                                                    if (var25 != null) {
                                                                        class138.method1092(0, var25);
                                                                    }
                                                                    if (class4.field81 != null) {
                                                                        class138.method1092(0, class4.field81);
                                                                    }
                                                                }
                                                                if (class139.field3023 != var26 && class135.field2951 == class108.field2259) {
                                                                    if (var26 != null) {
                                                                        class138.method1092(0, var26);
                                                                    }
                                                                    if (class139.field3023 != null) {
                                                                        class138.method1092(0, class139.field3023);
                                                                    }
                                                                }
                                                                if (class139.field3023 != null) {
                                                                    if (class108.field2259 > class135.field2951) {
                                                                        ++class135.field2951;
                                                                        if (~class135.field2951 == ~class108.field2259) {
                                                                            class138.method1092(0, class139.field3023);
                                                                        }
                                                                    }
                                                                } else if (~class135.field2951 < -1) {
                                                                    --class135.field2951;
                                                                }
                                                                class128.method1039((byte) -62);
                                                                if (class47.field984) {
                                                                    class75.method591((byte) 122);
                                                                }
                                                                for (int var39 = 0; var39 < 5; ++var39) {
                                                                    int var10002 = class35.field789[var39]++;
                                                                }
                                                                int var40 = class134.method1071(true);
                                                                int var41 = class151.method1173(0);
                                                                if (var40 > 4500 && var41 > 4500) {
                                                                    class139.field3039 = 250;
                                                                    ++class158.field3648;
                                                                    class122.method990(4000, 0);
                                                                    class63.field1299.method535(167, -25013);
                                                                }
                                                                ++class134.field2932;
                                                                ++class32.field693;
                                                                if (class32.field693 > 500) {
                                                                    class32.field693 = 0;
                                                                    int var42 = (int) (8.0D * Math.random());
                                                                    if (~(1 & var42) == -2) {
                                                                        class102.field2140 += class95.field2047;
                                                                    }
                                                                    if ((var42 & 4) == 4) {
                                                                        class15.field388 += class15.field387;
                                                                    }
                                                                    if (~(2 & var42) == -3) {
                                                                        class4.field109 += class74.field1490;
                                                                    }
                                                                }
                                                                ++class133.field2899;
                                                                if (~class15.field388 > 39) {
                                                                    class15.field387 = 1;
                                                                }
                                                                if (~class102.field2140 > 49) {
                                                                    class95.field2047 = 2;
                                                                }
                                                                if (~class102.field2140 < -51) {
                                                                    class95.field2047 = -2;
                                                                }
                                                                if (class4.field109 < -55) {
                                                                    class74.field1490 = 2;
                                                                }
                                                                if (class134.field2932 > 500) {
                                                                    class134.field2932 = 0;
                                                                    int var43 = (int) (8.0D * Math.random());
                                                                    if (~(var43 & 1) == -2) {
                                                                        class139.field3030 += class75.field1520;
                                                                    }
                                                                    if ((2 & var43) == 2) {
                                                                        class68.field1368 += class4.field115;
                                                                    }
                                                                }
                                                                if (~class4.field109 < -56) {
                                                                    class74.field1490 = -2;
                                                                }
                                                                if (~class139.field3030 > 59) {
                                                                    class75.field1520 = 2;
                                                                }
                                                                if (~class68.field1368 > 19) {
                                                                    class4.field115 = 1;
                                                                }
                                                                if (class68.field1368 > 10) {
                                                                    class4.field115 = -1;
                                                                }
                                                                if (class15.field388 > 40) {
                                                                    class15.field387 = -1;
                                                                }
                                                                if (class139.field3030 > 60) {
                                                                    class75.field1520 = -2;
                                                                }
                                                                if (class133.field2899 > 50) {
                                                                    ++class115.field2553;
                                                                    class63.field1299.method535(7, -25013);
                                                                }
                                                                try {
                                                                    if (class153.field3363 != null && ~class63.field1299.field309 < -1) {
                                                                        class153.field3363.method87(-105, class63.field1299.field279, class63.field1299.field309, 0);
                                                                        class63.field1299.field309 = 0;
                                                                        class133.field2899 = 0;
                                                                        return;
                                                                    }
                                                                    return;
                                                                } catch (IOException var44) {
                                                                    class15.method177((byte) -38);
                                                                    return;
                                                                }
                                                            }
                                                            var34 = var33.field2014;
                                                            if (~var34.field3478 > -1) {
                                                                break;
                                                            }
                                                            var35 = class44.method403(var34.field3458, true);
                                                        } while (var35 == null || var35.field3520 == null || ~var34.field3478 <= ~var35.field3520.length || var35.field3520[var34.field3478] != var34);
                                                        method1003(var33, (byte) 61);
                                                    }
                                                }
                                                var31 = var30.field2014;
                                                if (~var31.field3478 > -1) {
                                                    break;
                                                }
                                                var32 = class44.method403(var31.field3458, true);
                                            } while (var32 == null || var32.field3520 == null || ~var31.field3478 <= ~var32.field3520.length || var32.field3520[var31.field3478] != var31);
                                            method1003(var30, (byte) 117);
                                        }
                                    }
                                    var28 = var27.field2014;
                                    if (var28.field3478 < 0) {
                                        break;
                                    }
                                    var29 = class44.method403(var28.field3458, true);
                                } while (var29 == null || var29.field3520 == null || var29.field3520.length <= var28.field3478 || var29.field3520[var28.field3478] != var28);
                                method1003(var27, (byte) 123);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)V")
    public static void method997(boolean arg0) {
        field2718 = null;
        field2725 = null;
        field2700 = null;
        field2706 = null;
        field2698 = null;
        if (!arg0) {
            field2711 = null;
            field2727 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[BBZLfb;)V")
    public final void method998(int arg0, byte[] arg1, byte arg2, boolean arg3, class38 arg4) {
        ++field2708;
        if (this.field2713 != arg4) {
            if (!arg3 && this.field2704 == arg0) {
                this.field2699 = true;
            }
            if (arg1 == null || ~arg1.length >= -3) {
                this.field2726[arg0] = false;
                if (this.field2735 || arg3) {
                    class38.method361(this, (byte) 98, super.field1937[arg0], (byte) 2, this.field2732, arg0, arg3);
                }
                return;
            }
            class100.field2101.reset();
            class100.field2101.update(arg1, 0, arg1.length + -2);
            int var6 = (int) class100.field2101.getValue();
            int var7 = ((255 & arg1[arg1.length + -2]) << 8) + (arg1[arg1.length + -1] & 255);
            if (~super.field1937[arg0] != ~var6 || super.field1917[arg0] != var7) {
                this.field2726[arg0] = false;
                if (this.field2735 || arg3) {
                    class38.method361(this, (byte) 114, super.field1937[arg0], (byte) 2, this.field2732, arg0, arg3);
                }
                return;
            }
            this.field2726[arg0] = true;
            if (arg3) {
                super.field1927[arg0] = class42.method386(false, arg1, false);
            }
        } else {
            if (this.field2699) {
                throw new RuntimeException();
            }
            if (arg1 == null) {
                class38.method361(this, (byte) 121, this.field2714, (byte) 0, 255, this.field2732, true);
                return;
            }
            class100.field2101.reset();
            class100.field2101.update(arg1, 0, arg1.length);
            int var8 = (int) class100.field2101.getValue();
            class13 var9 = new class13(class134.method1068(arg1, 29));
            int var10 = var9.method142(27467);
            if (var10 != 5 && ~var10 != -7) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var10);
            }
            int var11 = 0;
            if (~var10 <= -7) {
                var11 = var9.method112(false);
            }
            if (~this.field2714 != ~var8 || ~this.field2710 != ~var11) {
                class38.method361(this, (byte) 116, this.field2714, (byte) 0, 255, this.field2732, true);
                return;
            }
            this.method753((byte) 112, arg1);
            this.method994((byte) 104);
        }
        int var12 = 13 % ((arg2 - -33) / 36);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)V")
    public final void method752(int arg0, byte arg1) {
        if (this.field2724 != null && this.field2726 != null && this.field2726[arg0]) {
            class151.method1175(this, this.field2724, arg0, (byte) -107);
        } else {
            class38.method361(this, (byte) 125, super.field1937[arg0], (byte) 2, this.field2732, arg0, true);
        }
        ++field2719;
        if (arg1 > -13) {
            field2698 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)I")
    public final int method999(int arg0) {
        ++field2730;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; ~var4 > ~super.field1927.length; ++var4) {
            if (super.field1942[var4] > 0) {
                var3 += 100;
                var2 += this.method1002((byte) -105, var4);
            }
        }
        if (arg0 != -12541) {
            this.field2699 = false;
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lfb;Lfb;IZZZ)V")
    public class123(class38 arg0, class38 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field2735 = arg5;
        this.field2724 = arg0;
        this.field2713 = arg1;
        this.field2732 = arg2;
        class2.method19(this.field2732, this, (byte) 80);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(ILpe;)Z")
    private static final boolean method1000(int arg0, class109 arg1) {
        ++field2702;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = arg0; var2 < class63.field1295; ++var2) {
                if (arg1.method884(class143.field3155[var2], 107)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public static final void method1001(int arg0) {
        ++field2736;
        class63.field1299.method535(146, -25013);
        ++class16.field404;
        class79 var1 = (class79) class134.field2916.method508(arg0 ^ 115);
        if (arg0 == 1) {
            while (var1 != null) {
                if (var1.field1652 == 0 || ~var1.field1652 == -4) {
                    class15.method178(true, var1, (byte) 5);
                }
                var1 = (class79) class134.field2916.method506((byte) 127);
            }
            if (class121.field2679 != null) {
                class138.method1092(0, class121.field2679);
                class121.field2679 = null;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(BI)I")
    private final int method1002(byte arg0, int arg1) {
        ++field2734;
        if (super.field1927[arg1] != null) {
            return 100;
        } else {
            int var3 = -47 / (arg0 / 55);
            return this.field2726[arg1] ? 100 : class126.method1020(false, arg1, this.field2732);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lnc;B)V")
    public static final void method1003(class93 arg0, byte arg1) {
        ++field2707;
        Object[] var2 = arg0.field2001;
        int var3 = (Integer) var2[0];
        class156 var4 = class63.method499(false, var3);
        if (var4 != null) {
            int var5 = 0;
            int var6 = -1;
            class114.field2528 = 0;
            int[] var7 = var4.field3590;
            byte var8 = -1;
            int var9 = 0;
            if (arg1 > 33) {
                int[] var10 = var4.field3589;
                try {
                    class152.field3337 = new int[var4.field3593];
                    int var11 = 0;
                    client.field529 = new class109[var4.field3596];
                    int var12 = 0;
                    for (int var13 = 1; ~var2.length < ~var13; ++var13) {
                        if (!(var2[var13] instanceof Integer)) {
                            if (var2[var13] instanceof class109) {
                                class109 var14 = (class109) var2[var13];
                                if (var14.method908(class63.field1287, (byte) 123)) {
                                    var14 = arg0.field2017;
                                }
                                client.field529[var11++] = var14;
                            }
                        } else {
                            int var15 = (Integer) var2[var13];
                            if (~var15 == 2147483646) {
                                var15 = arg0.field2016;
                            }
                            if (~var15 == 2147483645) {
                                var15 = arg0.field2009;
                            }
                            if (~var15 == 2147483644) {
                                var15 = arg0.field2014 != null ? arg0.field2014.field3514 : -1;
                            }
                            if (var15 == -2147483644) {
                                var15 = arg0.field2007;
                            }
                            if (~var15 == 2147483642) {
                                var15 = arg0.field2014 == null ? -1 : arg0.field2014.field3478;
                            }
                            if (~var15 == 2147483641) {
                                var15 = arg0.field2018 == null ? -1 : arg0.field2018.field3514;
                            }
                            if (var15 == -2147483641) {
                                var15 = arg0.field2018 == null ? -1 : arg0.field2018.field3478;
                            }
                            if (~var15 == 2147483639) {
                                var15 = arg0.field2013;
                            }
                            if (var15 == -2147483639) {
                                var15 = arg0.field2021;
                            }
                            class152.field3337[var12++] = var15;
                        }
                    }
                    int var16 = 0;
                    label1977: while (true) {
                        ++var16;
                        if (var16 > 200000) {
                            throw new RuntimeException("slow");
                        }
                        ++var6;
                        int var271 = var7[var6];
                        if (~var271 > -101) {
                            if (~var271 == -1) {
                                class13.field326[var9++] = var10[var6];
                                continue;
                            }
                            if (var271 == 1) {
                                int var17 = var10[var6];
                                class13.field326[var9++] = class153.field3376[var17];
                                continue;
                            }
                            if (~var271 == -3) {
                                int var18 = var10[var6];
                                --var9;
                                class153.field3376[var18] = class13.field326[var9];
                                continue;
                            }
                            if (var271 == 3) {
                                class104.field2202[var5++] = var4.field3584[var6];
                                continue;
                            }
                            if (~var271 == -7) {
                                var6 += var10[var6];
                                continue;
                            }
                            if (var271 == 7) {
                                var9 -= 2;
                                if (class13.field326[var9 - -1] != class13.field326[var9]) {
                                    var6 += var10[var6];
                                }
                                continue;
                            }
                            if (var271 == 8) {
                                var9 -= 2;
                                if (~class13.field326[var9 - -1] == ~class13.field326[var9]) {
                                    var6 += var10[var6];
                                }
                                continue;
                            }
                            if (~var271 == -10) {
                                var9 -= 2;
                                if (~class13.field326[var9 - -1] < ~class13.field326[var9]) {
                                    var6 += var10[var6];
                                }
                                continue;
                            }
                            if (~var271 == -11) {
                                var9 -= 2;
                                if (class13.field326[var9 + 1] < class13.field326[var9]) {
                                    var6 += var10[var6];
                                }
                                continue;
                            }
                            if (~var271 == -22) {
                                if (class114.field2528 == 0) {
                                    return;
                                }
                                class151 var19 = class9.field222[--class114.field2528];
                                class152.field3337 = var19.field3330;
                                client.field529 = var19.field3332;
                                var4 = var19.field3318;
                                var7 = var4.field3590;
                                var10 = var4.field3589;
                                var6 = var19.field3326;
                                continue;
                            }
                            if (var271 == 25) {
                                int var20 = var10[var6];
                                class13.field326[var9++] = class120.method975((byte) -99, var20);
                                continue;
                            }
                            if (~var271 == -28) {
                                int var21 = var10[var6];
                                --var9;
                                class95.method783(class13.field326[var9], var21, 4006);
                                continue;
                            }
                            if (var271 == 31) {
                                var9 -= 2;
                                if (~class13.field326[var9] >= ~class13.field326[var9 + 1]) {
                                    var6 += var10[var6];
                                }
                                continue;
                            }
                            if (~var271 == -33) {
                                var9 -= 2;
                                if (class13.field326[var9 + 1] <= class13.field326[var9]) {
                                    var6 += var10[var6];
                                }
                                continue;
                            }
                            if (var271 == 33) {
                                class13.field326[var9++] = class152.field3337[var10[var6]];
                                continue;
                            }
                            int var10001;
                            if (~var271 == -35) {
                                var10001 = var10[var6];
                                --var9;
                                class152.field3337[var10001] = class13.field326[var9];
                                continue;
                            }
                            if (var271 == 35) {
                                class104.field2202[var5++] = client.field529[var10[var6]];
                                continue;
                            }
                            if (var271 == 36) {
                                var10001 = var10[var6];
                                --var5;
                                client.field529[var10001] = class104.field2202[var5];
                                continue;
                            }
                            if (~var271 == -38) {
                                int var22 = var10[var6];
                                var5 -= var22;
                                class109 var23 = class148.method1153(class104.field2202, (byte) -29, var5, var22);
                                class104.field2202[var5++] = var23;
                                continue;
                            }
                            if (var271 == 38) {
                                --var9;
                                continue;
                            }
                            if (var271 == 39) {
                                --var5;
                                continue;
                            }
                            if (var271 == 40) {
                                int var24 = var10[var6];
                                class156 var25 = class63.method499(false, var24);
                                class109[] var26 = new class109[var25.field3596];
                                int[] var27 = new int[var25.field3593];
                                for (int var28 = 0; ~var25.field3586 < ~var28; ++var28) {
                                    var27[var28] = class13.field326[-var25.field3586 + var9 + var28];
                                }
                                for (int var29 = 0; ~var29 > ~var25.field3594; ++var29) {
                                    var26[var29] = class104.field2202[-var25.field3594 + var29 + var5];
                                }
                                var9 -= var25.field3586;
                                var5 -= var25.field3594;
                                class151 var30 = new class151();
                                var30.field3332 = client.field529;
                                var30.field3330 = class152.field3337;
                                var30.field3318 = var4;
                                var4 = var25;
                                var30.field3326 = var6;
                                var6 = -1;
                                class9.field222[class114.field2528++] = var30;
                                client.field529 = var26;
                                class152.field3337 = var27;
                                var10 = var25.field3589;
                                var7 = var25.field3590;
                                continue;
                            }
                            if (~var271 == -43) {
                                class13.field326[var9++] = class143.field3153[var10[var6]];
                                continue;
                            }
                            if (~var271 == -44) {
                                var10001 = var10[var6];
                                --var9;
                                class143.field3153[var10001] = class13.field326[var9];
                                continue;
                            }
                            if (var271 == 44) {
                                int var31 = var10[var6] >> 16;
                                int var32 = 65535 & var10[var6];
                                --var9;
                                int var33 = class13.field326[var9];
                                if (var33 >= 0 && ~var33 >= -5001) {
                                    field2700[var31] = var33;
                                    byte var34 = -1;
                                    if (var32 == 105) {
                                        var34 = 0;
                                    }
                                    int var35 = 0;
                                    while (true) {
                                        if (~var35 <= ~var33) {
                                            continue label1977;
                                        }
                                        class101.field2118[var31][var35] = var34;
                                        ++var35;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            if (var271 == 45) {
                                int var36 = var10[var6];
                                --var9;
                                int var37 = class13.field326[var9];
                                if (var37 >= 0 && var37 < field2700[var36]) {
                                    class13.field326[var9++] = class101.field2118[var36][var37];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (~var271 == -47) {
                                var9 -= 2;
                                int var38 = var10[var6];
                                int var39 = class13.field326[var9];
                                if (var39 >= 0 && ~field2700[var38] < ~var39) {
                                    class101.field2118[var38][var39] = class13.field326[var9 + 1];
                                    continue;
                                }
                                throw new RuntimeException();
                            }
                            if (var271 == 47) {
                                class109 var40 = class12.field262[var10[var6]];
                                if (var40 == null) {
                                    var40 = class55.field1115;
                                }
                                class104.field2202[var5++] = var40;
                                continue;
                            }
                            if (var271 == 48) {
                                var10001 = var10[var6];
                                --var5;
                                class12.field262[var10001] = class104.field2202[var5];
                                continue;
                            }
                        }
                        boolean var41;
                        if (var10[var6] != 1) {
                            var41 = false;
                        } else {
                            var41 = true;
                        }
                        if (var271 < 1000) {
                            if (~var271 == -101) {
                                var9 -= 3;
                                int var253 = class13.field326[var9 + 2];
                                int var254 = class13.field326[var9];
                                int var255 = class13.field326[var9 + 1];
                                if (~var255 == -1) {
                                    throw new RuntimeException();
                                }
                                class154 var256 = class44.method403(var254, true);
                                if (var256.field3520 == null) {
                                    var256.field3520 = new class154[var253 + 1];
                                }
                                if (var253 >= var256.field3520.length) {
                                    class154[] var257 = new class154[var253 + 1];
                                    for (int var258 = 0; var256.field3520.length > var258; ++var258) {
                                        var257[var258] = var256.field3520[var258];
                                    }
                                    var256.field3520 = var257;
                                }
                                if (var253 > 0 && var256.field3520[var253 + -1] == null) {
                                    throw new RuntimeException("Gap at:" + (var253 + -1));
                                }
                                class154 var259 = new class154();
                                var259.field3478 = var253;
                                var259.field3473 = true;
                                var259.field3458 = var259.field3514 = var256.field3514;
                                var259.field3476 = var255;
                                var256.field3520[var253] = var259;
                                if (!var41) {
                                    class100.field2088 = var259;
                                } else {
                                    class135.field2944 = var259;
                                }
                                class138.method1092(0, var256);
                                continue;
                            }
                            if (var271 == 101) {
                                class154 var260 = var41 ? class135.field2944 : class100.field2088;
                                class154 var261 = class44.method403(var260.field3514, true);
                                var261.field3520[var260.field3478] = null;
                                class138.method1092(0, var261);
                                continue;
                            }
                            if (var271 == 102) {
                                --var9;
                                class154 var262 = class44.method403(class13.field326[var9], true);
                                var262.field3520 = null;
                                class138.method1092(0, var262);
                                continue;
                            }
                            if (var271 == 200) {
                                var9 -= 2;
                                int var263 = class13.field326[var9];
                                int var264 = class13.field326[var9 + 1];
                                class154 var265 = class102.method821(var263, true, var264);
                                if (var265 != null && var264 != -1) {
                                    class13.field326[var9++] = 1;
                                    if (var41) {
                                        class135.field2944 = var265;
                                    } else {
                                        class100.field2088 = var265;
                                    }
                                    continue;
                                }
                                class13.field326[var9++] = 0;
                                continue;
                            }
                        } else if (var271 >= 1000 && var271 < 1100 || var271 >= 2000 && ~var271 > -2101) {
                            class154 var251;
                            if (~var271 > -2001) {
                                var251 = var41 ? class135.field2944 : class100.field2088;
                            } else {
                                var271 -= 1000;
                                --var9;
                                var251 = class44.method403(class13.field326[var9], true);
                            }
                            if (var271 == 1000) {
                                var9 -= 2;
                                var251.field3384 = class13.field326[var9];
                                var251.field3390 = class13.field326[var9 + 1];
                                class138.method1092(0, var251);
                                continue;
                            }
                            if (var271 == 1001) {
                                var9 -= 2;
                                var251.field3427 = class13.field326[var9];
                                var251.field3382 = class13.field326[var9 + 1];
                                class138.method1092(0, var251);
                                continue;
                            }
                            if (var271 == 1003) {
                                --var9;
                                boolean var252 = class13.field326[var9] == 1;
                                if (!var252 == var251.field3508) {
                                    var251.field3508 = var252;
                                    class138.method1092(0, var251);
                                }
                                continue;
                            }
                        } else if ((var271 < 1100 || var271 >= 1200) && (var271 < 2100 || var271 >= 2200)) {
                            if (var271 >= 1200 && ~var271 > -1301 || var271 >= 2200 && var271 < 2300) {
                                class154 var247;
                                if (~var271 > -2001) {
                                    var247 = !var41 ? class100.field2088 : class135.field2944;
                                } else {
                                    var271 -= 1000;
                                    --var9;
                                    var247 = class44.method403(class13.field326[var9], true);
                                }
                                class138.method1092(0, var247);
                                if (var271 == 1200) {
                                    var9 -= 2;
                                    int var248 = class13.field326[var9];
                                    int var249 = class13.field326[var9 - -1];
                                    var247.field3474 = var249;
                                    var247.field3386 = var248;
                                    class112 var250 = class4.method43((byte) 94, var248);
                                    var247.field3503 = var250.field2395;
                                    var247.field3487 = var250.field2379;
                                    var247.field3494 = var250.field2406;
                                    var247.field3469 = var250.field2378;
                                    if (var247.field3427 > 0) {
                                        var247.field3494 = var247.field3494 * 32 / var247.field3427;
                                    }
                                    var247.field3464 = var250.field2394;
                                    var247.field3475 = var250.field2410;
                                    continue;
                                }
                                if (~var271 == -1202) {
                                    var247.field3433 = 2;
                                    --var9;
                                    var247.field3505 = class13.field326[var9];
                                    continue;
                                }
                                if (~var271 == -1203) {
                                    var247.field3433 = 3;
                                    var247.field3505 = class136.field2975.field1025.method171((byte) 83);
                                    continue;
                                }
                            } else if (var271 >= 1300 && ~var271 > -1401 || ~var271 <= -2301 && ~var271 > -2401) {
                                class154 var45;
                                if (~var271 > -2001) {
                                    var45 = !var41 ? class100.field2088 : class135.field2944;
                                } else {
                                    var271 -= 1000;
                                    --var9;
                                    var45 = class44.method403(class13.field326[var9], true);
                                }
                                if (~var271 == -1301) {
                                    --var9;
                                    int var46 = -1 + class13.field326[var9];
                                    if (var46 >= 0 && var46 <= 9) {
                                        --var5;
                                        var45.method1189(var46, class104.field2202[var5], -121);
                                        continue;
                                    }
                                    --var5;
                                    continue;
                                }
                                if (var271 == 1301) {
                                    var9 -= 2;
                                    int var47 = class13.field326[var9];
                                    int var48 = class13.field326[var9 - -1];
                                    var45.field3428 = class102.method821(var47, true, var48);
                                    continue;
                                }
                                if (var271 == 1302) {
                                    --var9;
                                    var45.field3396 = ~class13.field326[var9] == -2;
                                    continue;
                                }
                                if (var271 == 1303) {
                                    --var9;
                                    var45.field3400 = class13.field326[var9];
                                    continue;
                                }
                                if (~var271 == -1305) {
                                    --var9;
                                    var45.field3495 = class13.field326[var9];
                                    continue;
                                }
                                if (var271 == 1305) {
                                    --var5;
                                    var45.field3452 = class104.field2202[var5];
                                    continue;
                                }
                                if (~var271 == -1307) {
                                    --var5;
                                    var45.field3403 = class104.field2202[var5];
                                    continue;
                                }
                                if (~var271 == -1308) {
                                    var45.field3445 = null;
                                    continue;
                                }
                            } else {
                                if (var271 >= 1400 && ~var271 > -1501 || var271 >= 2400 && var271 < 2500) {
                                    class154 var240;
                                    if (var271 >= 2000) {
                                        var271 -= 1000;
                                        --var9;
                                        var240 = class44.method403(class13.field326[var9], true);
                                    } else {
                                        var240 = var41 ? class135.field2944 : class100.field2088;
                                    }
                                    --var5;
                                    class109 var241 = class104.field2202[var5];
                                    int[] var242 = null;
                                    if (~var241.method898((byte) 126) < -1 && ~var241.method906(var241.method898((byte) 122) - 1, false) == -90) {
                                        --var9;
                                        int var243 = class13.field326[var9];
                                        if (~var243 < -1) {
                                            var242 = new int[var243];
                                            while (~(var243--) < -1) {
                                                --var9;
                                                var242[var243] = class13.field326[var9];
                                            }
                                        }
                                        var241 = var241.method872(var241.method898((byte) 126) - 1, 5, 0);
                                    }
                                    Object[] var244 = new Object[var241.method898((byte) 122) - -1];
                                    for (int var245 = var244.length + -1; var245 >= 1; --var245) {
                                        if (var241.method906(var245 + -1, false) == 115) {
                                            --var5;
                                            var244[var245] = class104.field2202[var5];
                                        } else {
                                            --var9;
                                            var244[var245] = new Integer(class13.field326[var9]);
                                        }
                                    }
                                    --var9;
                                    int var246 = class13.field326[var9];
                                    if (~var246 == 0) {
                                        var244 = null;
                                    } else {
                                        var244[0] = new Integer(var246);
                                    }
                                    if (~var271 == -1408) {
                                        var240.field3424 = var244;
                                        var240.field3422 = var242;
                                    }
                                    if (~var271 == -1413) {
                                        var240.field3429 = var244;
                                    }
                                    if (~var271 == -1422) {
                                        var240.field3401 = var244;
                                    }
                                    if (var271 == 1415) {
                                        var240.field3443 = var242;
                                        var240.field3413 = var244;
                                    }
                                    if (~var271 == -1419) {
                                        var240.field3393 = var244;
                                    }
                                    if (~var271 == -1402) {
                                        var240.field3395 = var244;
                                    }
                                    if (~var271 == -1425) {
                                        var240.field3453 = var244;
                                    }
                                    if (var271 == 1419) {
                                        var240.field3502 = var244;
                                    }
                                    if (~var271 == -1407) {
                                        var240.field3488 = var244;
                                    }
                                    if (~var271 == -1423) {
                                        var240.field3506 = var244;
                                    }
                                    if (~var271 == -1405) {
                                        var240.field3399 = var244;
                                    }
                                    if (var271 == 1423) {
                                        var240.field3406 = var244;
                                    }
                                    if (var271 == 1416) {
                                        var240.field3499 = var244;
                                    }
                                    if (~var271 == -1418) {
                                        var240.field3398 = var244;
                                    }
                                    if (var271 == 1409) {
                                        var240.field3470 = var244;
                                    }
                                    if (var271 == 1403) {
                                        var240.field3455 = var244;
                                    }
                                    var240.field3465 = true;
                                    if (~var271 == -1406) {
                                        var240.field3454 = var244;
                                    }
                                    if (var271 == 1402) {
                                        var240.field3493 = var244;
                                    }
                                    if (var271 == 1420) {
                                        var240.field3405 = var244;
                                    }
                                    if (var271 == 1408) {
                                        var240.field3421 = var244;
                                    }
                                    if (~var271 == -1401) {
                                        var240.field3448 = var244;
                                    }
                                    if (~var271 == -1412) {
                                        var240.field3387 = var244;
                                    }
                                    if (var271 == 1410) {
                                        var240.field3482 = var244;
                                    }
                                    if (var271 == 1414) {
                                        var240.field3394 = var242;
                                        var240.field3437 = var244;
                                    }
                                    continue;
                                }
                                if (var271 < 1600) {
                                    class154 var49 = var41 ? class135.field2944 : class100.field2088;
                                    if (var271 == 1500) {
                                        class13.field326[var9++] = var49.field3384;
                                        continue;
                                    }
                                    if (~var271 == -1502) {
                                        class13.field326[var9++] = var49.field3390;
                                        continue;
                                    }
                                    if (var271 == 1502) {
                                        class13.field326[var9++] = var49.field3427;
                                        continue;
                                    }
                                    if (var271 == 1503) {
                                        class13.field326[var9++] = var49.field3382;
                                        continue;
                                    }
                                    if (var271 == 1504) {
                                        class13.field326[var9++] = var49.field3508 ? 1 : 0;
                                        continue;
                                    }
                                    if (~var271 == -1506) {
                                        class13.field326[var9++] = var49.field3458;
                                        continue;
                                    }
                                } else if (var271 < 1700) {
                                    class154 var50 = !var41 ? class100.field2088 : class135.field2944;
                                    if (~var271 == -1601) {
                                        class13.field326[var9++] = var50.field3481;
                                        continue;
                                    }
                                    if (var271 == 1601) {
                                        class13.field326[var9++] = var50.field3417;
                                        continue;
                                    }
                                    if (~var271 == -1603) {
                                        class104.field2202[var5++] = var50.field3451;
                                        continue;
                                    }
                                    if (~var271 == -1604) {
                                        class13.field326[var9++] = var50.field3432;
                                        continue;
                                    }
                                    if (~var271 == -1605) {
                                        class13.field326[var9++] = var50.field3425;
                                        continue;
                                    }
                                    if (var271 == 1605) {
                                        class13.field326[var9++] = var50.field3494;
                                        continue;
                                    }
                                    if (var271 == 1606) {
                                        class13.field326[var9++] = var50.field3503;
                                        continue;
                                    }
                                    if (var271 == 1607) {
                                        class13.field326[var9++] = var50.field3469;
                                        continue;
                                    }
                                    if (~var271 == -1609) {
                                        class13.field326[var9++] = var50.field3475;
                                        continue;
                                    }
                                } else if (var271 >= 1800) {
                                    if (~var271 <= -1901) {
                                        if (var271 >= 2600) {
                                            if (var271 >= 2700) {
                                                if (var271 < 2800) {
                                                    if (~var271 == -2701) {
                                                        --var9;
                                                        class154 var51 = class44.method403(class13.field326[var9], true);
                                                        class13.field326[var9++] = var51.field3386;
                                                        continue;
                                                    }
                                                    if (~var271 == -2702) {
                                                        --var9;
                                                        class154 var52 = class44.method403(class13.field326[var9], true);
                                                        if (var52.field3386 != -1) {
                                                            class13.field326[var9++] = var52.field3474;
                                                        } else {
                                                            class13.field326[var9++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                    if (var271 == 2702) {
                                                        --var9;
                                                        int var53 = class13.field326[var9];
                                                        class79 var54 = (class79) class134.field2916.method505((byte) -46, (long) var53);
                                                        if (var54 != null) {
                                                            class13.field326[var9++] = 1;
                                                        } else {
                                                            class13.field326[var9++] = 0;
                                                        }
                                                        continue;
                                                    }
                                                } else if (~var271 > -2901) {
                                                    --var9;
                                                    class154 var55 = class44.method403(class13.field326[var9], true);
                                                    if (~var271 == -2801) {
                                                        class13.field326[var9++] = class101.method817(21599, class136.method1084(0, var55));
                                                        continue;
                                                    }
                                                    if (var271 == 2801) {
                                                        --var9;
                                                        int var56 = class13.field326[var9];
                                                        int var272 = var56 - 1;
                                                        if (var55.field3445 != null && ~var55.field3445.length < ~var272 && var55.field3445[var272] != null) {
                                                            class104.field2202[var5++] = var55.field3445[var272];
                                                            continue;
                                                        }
                                                        class104.field2202[var5++] = class95.field2038;
                                                        continue;
                                                    }
                                                    if (var271 == 2802) {
                                                        if (var55.field3452 != null) {
                                                            class104.field2202[var5++] = var55.field3452;
                                                        } else {
                                                            class104.field2202[var5++] = class95.field2038;
                                                        }
                                                        continue;
                                                    }
                                                } else if (~var271 <= -3201) {
                                                    if (var271 < 3300) {
                                                        if (var271 == 3200) {
                                                            var9 -= 3;
                                                            class63.method501(class13.field326[var9 + 2], -117, class13.field326[var9 + 1], class13.field326[var9]);
                                                            continue;
                                                        }
                                                        if (~var271 == -3202) {
                                                            --var9;
                                                            class53.method435(class13.field326[var9], -106);
                                                            continue;
                                                        }
                                                        if (~var271 == -3203) {
                                                            var9 -= 2;
                                                            class113.method934((byte) 64, class13.field326[var9], class13.field326[var9 + 1]);
                                                            continue;
                                                        }
                                                    } else if (~var271 <= -3401) {
                                                        if (var271 >= 3500) {
                                                            if (~var271 > -3701) {
                                                                if (~var271 == -3601) {
                                                                    if (~class95.field2050 == -1) {
                                                                        class13.field326[var9++] = -2;
                                                                    } else if (~class95.field2050 == -2) {
                                                                        class13.field326[var9++] = -1;
                                                                    } else {
                                                                        class13.field326[var9++] = class110.field2330;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var271 == -3602) {
                                                                    --var9;
                                                                    int var57 = class13.field326[var9];
                                                                    if (class95.field2050 == 2 && class110.field2330 > var57) {
                                                                        class104.field2202[var5++] = class107.field2255[var57];
                                                                        continue;
                                                                    }
                                                                    class104.field2202[var5++] = class95.field2038;
                                                                    continue;
                                                                }
                                                                if (var271 == 3602) {
                                                                    --var9;
                                                                    int var58 = class13.field326[var9];
                                                                    if (class95.field2050 == 2 && ~var58 > ~class110.field2330) {
                                                                        class13.field326[var9++] = class77.field1623[var58];
                                                                        continue;
                                                                    }
                                                                    class13.field326[var9++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var271 == -3604) {
                                                                    --var9;
                                                                    int var59 = class13.field326[var9];
                                                                    if (~class95.field2050 == -3 && ~var59 > ~class110.field2330) {
                                                                        class13.field326[var9++] = class13.field312[var59];
                                                                        continue;
                                                                    }
                                                                    class13.field326[var9++] = 0;
                                                                    continue;
                                                                }
                                                                if (var271 == 3604) {
                                                                    --var9;
                                                                    int var60 = class13.field326[var9];
                                                                    --var5;
                                                                    class109 var61 = class104.field2202[var5];
                                                                    class131.method1058(var60, 0, var61);
                                                                    continue;
                                                                }
                                                                if (var271 == 3605) {
                                                                    --var5;
                                                                    class109 var62 = class104.field2202[var5];
                                                                    class136.method1085(127, var62.method889(true));
                                                                    continue;
                                                                }
                                                                if (~var271 == -3607) {
                                                                    --var5;
                                                                    class109 var63 = class104.field2202[var5];
                                                                    class4.method27((byte) 126, var63.method889(true));
                                                                    continue;
                                                                }
                                                                if (~var271 == -3608) {
                                                                    --var5;
                                                                    class109 var64 = class104.field2202[var5];
                                                                    class57.method449(0, var64.method889(true));
                                                                    continue;
                                                                }
                                                                if (var271 == 3608) {
                                                                    --var5;
                                                                    class109 var65 = class104.field2202[var5];
                                                                    class67.method516((byte) -61, var65.method889(true));
                                                                    continue;
                                                                }
                                                                if (var271 == 3609) {
                                                                    --var5;
                                                                    class109 var66 = class104.field2202[var5];
                                                                    if (var66.method886(class57.field1153, 79) || var66.method886(class139.field3043, 91)) {
                                                                        var66 = var66.method897(false, 7);
                                                                    }
                                                                    class13.field326[var9++] = class41.method380(var66, 0) ? 1 : 0;
                                                                    continue;
                                                                }
                                                                if (var271 == 3611) {
                                                                    if (class133.field2896 != null) {
                                                                        class104.field2202[var5++] = class133.field2896.method902((byte) 42);
                                                                    } else {
                                                                        class104.field2202[var5++] = class95.field2038;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var271 == -3613) {
                                                                    if (class133.field2896 == null) {
                                                                        class13.field326[var9++] = 0;
                                                                    } else {
                                                                        class13.field326[var9++] = class72.field1461;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var271 == -3614) {
                                                                    --var9;
                                                                    int var67 = class13.field326[var9];
                                                                    if (class133.field2896 != null && ~class72.field1461 < ~var67) {
                                                                        class104.field2202[var5++] = class89.field1889[var67].field2843.method902((byte) 42);
                                                                        continue;
                                                                    }
                                                                    class104.field2202[var5++] = class95.field2038;
                                                                    continue;
                                                                }
                                                                if (var271 == 3614) {
                                                                    --var9;
                                                                    int var68 = class13.field326[var9];
                                                                    if (class133.field2896 != null && var68 < class72.field1461) {
                                                                        class13.field326[var9++] = class89.field1889[var68].field2836;
                                                                        continue;
                                                                    }
                                                                    class13.field326[var9++] = 0;
                                                                    continue;
                                                                }
                                                                if (var271 == 3615) {
                                                                    --var9;
                                                                    int var69 = class13.field326[var9];
                                                                    if (class133.field2896 != null && ~class72.field1461 < ~var69) {
                                                                        class13.field326[var9++] = class89.field1889[var69].field2834;
                                                                        continue;
                                                                    }
                                                                    class13.field326[var9++] = 0;
                                                                    continue;
                                                                }
                                                                if (~var271 == -3617) {
                                                                    class13.field326[var9++] = class152.field3355;
                                                                    continue;
                                                                }
                                                                if (~var271 == -3618) {
                                                                    --var5;
                                                                    class109 var70 = class104.field2202[var5];
                                                                    class75.method592(0, var70);
                                                                    continue;
                                                                }
                                                                if (var271 == 3618) {
                                                                    class13.field326[var9++] = class3.field52;
                                                                    continue;
                                                                }
                                                                if (var271 == 3619) {
                                                                    --var5;
                                                                    class109 var71 = class104.field2202[var5];
                                                                    class154.method1197(false, var71.method889(true));
                                                                    continue;
                                                                }
                                                                if (~var271 == -3621) {
                                                                    class42.method390(4);
                                                                    continue;
                                                                }
                                                                if (var271 == 3621) {
                                                                    if (~class95.field2050 == -1) {
                                                                        class13.field326[var9++] = -1;
                                                                    } else {
                                                                        class13.field326[var9++] = class63.field1295;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var271 == 3622) {
                                                                    --var9;
                                                                    int var72 = class13.field326[var9];
                                                                    if (~class95.field2050 != -1 && var72 < class63.field1295) {
                                                                        class104.field2202[var5++] = class72.method582(false, class38.field838[var72]).method902((byte) 42);
                                                                        continue;
                                                                    }
                                                                    class104.field2202[var5++] = class95.field2038;
                                                                    continue;
                                                                }
                                                                if (~var271 == -3624) {
                                                                    --var5;
                                                                    class109 var73 = class104.field2202[var5];
                                                                    if (var73.method886(class57.field1153, 105) || var73.method886(class139.field3043, 127)) {
                                                                        var73 = var73.method897(false, 7);
                                                                    }
                                                                    class13.field326[var9++] = !method1000(0, var73) ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (~var271 == -3625) {
                                                                    --var9;
                                                                    int var74 = class13.field326[var9];
                                                                    if (class89.field1889 != null && class72.field1461 > var74 && class89.field1889[var74].field2843.method884(class136.field2975.field1051, 111)) {
                                                                        class13.field326[var9++] = 1;
                                                                        continue;
                                                                    }
                                                                    class13.field326[var9++] = 0;
                                                                    continue;
                                                                }
                                                                if (var271 == 3625) {
                                                                    if (class148.field3255 != null) {
                                                                        class104.field2202[var5++] = class148.field3255.method902((byte) 42);
                                                                    } else {
                                                                        class104.field2202[var5++] = class95.field2038;
                                                                    }
                                                                    continue;
                                                                }
                                                            } else if (var271 >= 4100) {
                                                                if (~var271 <= -4201) {
                                                                    if (var271 < 4300) {
                                                                        if (~var271 == -4201) {
                                                                            --var9;
                                                                            int var75 = class13.field326[var9];
                                                                            class104.field2202[var5++] = class4.method43((byte) 94, var75).field2381;
                                                                            continue;
                                                                        }
                                                                        if (var271 == 4201) {
                                                                            var9 -= 2;
                                                                            int var76 = class13.field326[var9];
                                                                            int var77 = class13.field326[var9 - -1];
                                                                            class112 var78 = class4.method43((byte) 94, var76);
                                                                            if (~var77 <= -2 && var77 <= 5 && var78.field2419[var77 + -1] != null) {
                                                                                class104.field2202[var5++] = var78.field2419[var77 - 1];
                                                                                continue;
                                                                            }
                                                                            class104.field2202[var5++] = class95.field2038;
                                                                            continue;
                                                                        }
                                                                        if (~var271 == -4203) {
                                                                            var9 -= 2;
                                                                            int var79 = class13.field326[var9 - -1];
                                                                            int var80 = class13.field326[var9];
                                                                            class112 var81 = class4.method43((byte) 94, var80);
                                                                            if (~var79 <= -2 && var79 <= 5 && var81.field2442[var79 + -1] != null) {
                                                                                class104.field2202[var5++] = var81.field2442[var79 + -1];
                                                                                continue;
                                                                            }
                                                                            class104.field2202[var5++] = class95.field2038;
                                                                            continue;
                                                                        }
                                                                        if (~var271 == -4204) {
                                                                            --var9;
                                                                            int var82 = class13.field326[var9];
                                                                            class13.field326[var9++] = class4.method43((byte) 94, var82).field2432;
                                                                            continue;
                                                                        }
                                                                        if (var271 == 4204) {
                                                                            --var9;
                                                                            int var83 = class13.field326[var9];
                                                                            class13.field326[var9++] = ~class4.method43((byte) 94, var83).field2399 == -2 ? 1 : 0;
                                                                            continue;
                                                                        }
                                                                        if (~var271 == -4206) {
                                                                            --var9;
                                                                            int var84 = class13.field326[var9];
                                                                            class112 var85 = class4.method43((byte) 94, var84);
                                                                            if (var85.field2427 == -1 && ~var85.field2439 <= -1) {
                                                                                class13.field326[var9++] = var85.field2439;
                                                                                continue;
                                                                            }
                                                                            class13.field326[var9++] = var84;
                                                                            continue;
                                                                        }
                                                                        if (~var271 == -4207) {
                                                                            --var9;
                                                                            int var86 = class13.field326[var9];
                                                                            class112 var87 = class4.method43((byte) 94, var86);
                                                                            if (~var87.field2427 <= -1 && var87.field2439 >= 0) {
                                                                                class13.field326[var9++] = var87.field2439;
                                                                                continue;
                                                                            }
                                                                            class13.field326[var9++] = var86;
                                                                            continue;
                                                                        }
                                                                        if (~var271 == -4208) {
                                                                            --var9;
                                                                            int var88 = class13.field326[var9];
                                                                            class13.field326[var9++] = !class4.method43((byte) 94, var88).field2401 ? 0 : 1;
                                                                            continue;
                                                                        }
                                                                    } else if (var271 < 5100) {
                                                                        if (~var271 == -5001) {
                                                                            class13.field326[var9++] = class52.field1075;
                                                                            continue;
                                                                        }
                                                                        if (~var271 == -5002) {
                                                                            ++class61.field1209;
                                                                            var9 -= 3;
                                                                            class52.field1075 = class13.field326[var9];
                                                                            class7.field175 = class13.field326[var9 + 1];
                                                                            class74.field1493 = class13.field326[var9 + 2];
                                                                            class63.field1299.method535(184, -25013);
                                                                            class63.field1299.method135(class52.field1075, (byte) -50);
                                                                            class63.field1299.method135(class7.field175, (byte) -50);
                                                                            class63.field1299.method135(class74.field1493, (byte) -50);
                                                                            continue;
                                                                        }
                                                                        if (~var271 == -5003) {
                                                                            ++class146.field3190;
                                                                            var9 -= 2;
                                                                            --var5;
                                                                            class109 var89 = class104.field2202[var5];
                                                                            int var90 = class13.field326[var9 + 1];
                                                                            int var91 = class13.field326[var9];
                                                                            class63.field1299.method535(30, -25013);
                                                                            class63.field1299.method157((byte) 56, var89.method889(true));
                                                                            class63.field1299.method135(var91 - 1, (byte) -50);
                                                                            class63.field1299.method135(var90, (byte) -50);
                                                                            continue;
                                                                        }
                                                                        if (var271 == 5003) {
                                                                            --var9;
                                                                            int var92 = class13.field326[var9];
                                                                            class109 var93 = null;
                                                                            if (~var92 > -101) {
                                                                                var93 = class121.field2677[var92];
                                                                            }
                                                                            if (var93 == null) {
                                                                                var93 = class95.field2038;
                                                                            }
                                                                            class104.field2202[var5++] = var93;
                                                                            continue;
                                                                        }
                                                                        if (~var271 == -5005) {
                                                                            int var94 = -1;
                                                                            --var9;
                                                                            int var95 = class13.field326[var9];
                                                                            if (var95 < 100 && class121.field2677[var95] != null) {
                                                                                var94 = class156.field3605[var95];
                                                                            }
                                                                            class13.field326[var9++] = var94;
                                                                            continue;
                                                                        }
                                                                        if (~var271 == -5006) {
                                                                            class13.field326[var9++] = class7.field175;
                                                                            continue;
                                                                        }
                                                                        if (var271 == 5008) {
                                                                            --var5;
                                                                            class109 var96 = class104.field2202[var5];
                                                                            if (var96.method886(class15.field396, 116)) {
                                                                                class144.method1137(true, var96);
                                                                            } else {
                                                                                ++class137.field2989;
                                                                                class109 var97 = var96.method882((byte) -89);
                                                                                byte var98 = 0;
                                                                                if (!var97.method886(class110.field2335, 124)) {
                                                                                    if (var97.method886(class110.field2351, 88)) {
                                                                                        var98 = 1;
                                                                                        var96 = var96.method897(false, class110.field2351.method898((byte) 126));
                                                                                    } else if (!var97.method886(class86.field1846, 122)) {
                                                                                        if (var97.method886(class113.field2477, 92)) {
                                                                                            var98 = 3;
                                                                                            var96 = var96.method897(false, class113.field2477.method898((byte) 121));
                                                                                        } else if (!var97.method886(class42.field864, 118)) {
                                                                                            if (!var97.method886(class8.field210, 113)) {
                                                                                                if (var97.method886(class121.field2680, 95)) {
                                                                                                    var98 = 6;
                                                                                                    var96 = var96.method897(false, class121.field2680.method898((byte) 126));
                                                                                                } else if (!var97.method886(class145.field3182, 101)) {
                                                                                                    if (!var97.method886(class76.field1586, 82)) {
                                                                                                        if (!var97.method886(class152.field3358, 89)) {
                                                                                                            if (var97.method886(class93.field1996, 88)) {
                                                                                                                var96 = var96.method897(false, class93.field1996.method898((byte) 121));
                                                                                                                var98 = 10;
                                                                                                            } else if (var97.method886(client.field521, 80)) {
                                                                                                                var96 = var96.method897(false, client.field521.method898((byte) 126));
                                                                                                                var98 = 11;
                                                                                                            } else if (~class89.field1887 != -1) {
                                                                                                                if (!var97.method886(class110.field2332, 93)) {
                                                                                                                    if (var97.method886(class110.field2341, 119)) {
                                                                                                                        var98 = 1;
                                                                                                                        var96 = var96.method897(false, class110.field2341.method898((byte) 121));
                                                                                                                    } else if (!var97.method886(class86.field1836, 119)) {
                                                                                                                        if (!var97.method886(class113.field2473, 109)) {
                                                                                                                            if (!var97.method886(class42.field888, 95)) {
                                                                                                                                if (!var97.method886(class8.field207, 110)) {
                                                                                                                                    if (!var97.method886(class121.field2681, 85)) {
                                                                                                                                        if (var97.method886(class145.field3181, 91)) {
                                                                                                                                            var96 = var96.method897(false, class145.field3181.method898((byte) 123));
                                                                                                                                            var98 = 7;
                                                                                                                                        } else if (!var97.method886(class76.field1543, 107)) {
                                                                                                                                            if (!var97.method886(class152.field3359, 87)) {
                                                                                                                                                if (!var97.method886(class93.field1994, 92)) {
                                                                                                                                                    if (var97.method886(client.field533, 82)) {
                                                                                                                                                        var96 = var96.method897(false, client.field533.method898((byte) 126));
                                                                                                                                                        var98 = 11;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    var96 = var96.method897(false, class93.field1994.method898((byte) 127));
                                                                                                                                                    var98 = 10;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                var98 = 9;
                                                                                                                                                var96 = var96.method897(false, class152.field3359.method898((byte) 126));
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            var98 = 8;
                                                                                                                                            var96 = var96.method897(false, class76.field1543.method898((byte) 127));
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        var98 = 6;
                                                                                                                                        var96 = var96.method897(false, class121.field2681.method898((byte) 127));
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    var98 = 5;
                                                                                                                                    var96 = var96.method897(false, class8.field207.method898((byte) 125));
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                var96 = var96.method897(false, class42.field888.method898((byte) 123));
                                                                                                                                var98 = 4;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            var98 = 3;
                                                                                                                            var96 = var96.method897(false, class113.field2473.method898((byte) 121));
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        var96 = var96.method897(false, class86.field1836.method898((byte) 121));
                                                                                                                        var98 = 2;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    var96 = var96.method897(false, class110.field2332.method898((byte) 121));
                                                                                                                    var98 = 0;
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            var98 = 9;
                                                                                                            var96 = var96.method897(false, class152.field3358.method898((byte) 121));
                                                                                                        }
                                                                                                    } else {
                                                                                                        var96 = var96.method897(false, class76.field1586.method898((byte) 126));
                                                                                                        var98 = 8;
                                                                                                    }
                                                                                                } else {
                                                                                                    var96 = var96.method897(false, class145.field3182.method898((byte) 124));
                                                                                                    var98 = 7;
                                                                                                }
                                                                                            } else {
                                                                                                var98 = 5;
                                                                                                var96 = var96.method897(false, class8.field210.method898((byte) 123));
                                                                                            }
                                                                                        } else {
                                                                                            var98 = 4;
                                                                                            var96 = var96.method897(false, class42.field864.method898((byte) 125));
                                                                                        }
                                                                                    } else {
                                                                                        var96 = var96.method897(false, class86.field1846.method898((byte) 126));
                                                                                        var98 = 2;
                                                                                    }
                                                                                } else {
                                                                                    var96 = var96.method897(false, class110.field2335.method898((byte) 125));
                                                                                    var98 = 0;
                                                                                }
                                                                                byte var99 = 0;
                                                                                class109 var100 = var96.method882((byte) -89);
                                                                                if (!var100.method886(class79.field1653, 85)) {
                                                                                    if (!var100.method886(class41.field851, 127)) {
                                                                                        if (!var100.method886(class66.field1336, 126)) {
                                                                                            if (var100.method886(class35.field761, 81)) {
                                                                                                var99 = 4;
                                                                                                var96 = var96.method897(false, class35.field761.method898((byte) 127));
                                                                                            } else if (!var100.method886(class32.field697, 107)) {
                                                                                                if (~class89.field1887 != -1) {
                                                                                                    if (var100.method886(class79.field1662, 107)) {
                                                                                                        var99 = 1;
                                                                                                        var96 = var96.method897(false, class79.field1662.method898((byte) 124));
                                                                                                    } else if (!var100.method886(class41.field854, 120)) {
                                                                                                        if (!var100.method886(class66.field1329, 124)) {
                                                                                                            if (var100.method886(class35.field782, 117)) {
                                                                                                                var96 = var96.method897(false, class35.field782.method898((byte) 121));
                                                                                                                var99 = 4;
                                                                                                            } else if (var100.method886(class32.field695, 112)) {
                                                                                                                var96 = var96.method897(false, class32.field695.method898((byte) 121));
                                                                                                                var99 = 5;
                                                                                                            }
                                                                                                        } else {
                                                                                                            var96 = var96.method897(false, class66.field1329.method898((byte) 126));
                                                                                                            var99 = 3;
                                                                                                        }
                                                                                                    } else {
                                                                                                        var96 = var96.method897(false, class41.field854.method898((byte) 121));
                                                                                                        var99 = 2;
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                var99 = 5;
                                                                                                var96 = var96.method897(false, class32.field697.method898((byte) 121));
                                                                                            }
                                                                                        } else {
                                                                                            var99 = 3;
                                                                                            var96 = var96.method897(false, class66.field1336.method898((byte) 125));
                                                                                        }
                                                                                    } else {
                                                                                        var99 = 2;
                                                                                        var96 = var96.method897(false, class41.field851.method898((byte) 127));
                                                                                    }
                                                                                } else {
                                                                                    var96 = var96.method897(false, class79.field1653.method898((byte) 124));
                                                                                    var99 = 1;
                                                                                }
                                                                                class63.field1299.method535(27, -25013);
                                                                                class63.field1299.method135(0, (byte) -50);
                                                                                int var101 = class63.field1299.field309;
                                                                                class63.field1299.method135(var98, (byte) -50);
                                                                                class63.field1299.method135(var99, (byte) -50);
                                                                                class133.method1065(0, var96, class63.field1299);
                                                                                class63.field1299.method154(-1, -var101 + class63.field1299.field309);
                                                                            }
                                                                            continue;
                                                                        }
                                                                        if (~var271 == -5010) {
                                                                            ++class152.field3343;
                                                                            var5 -= 2;
                                                                            class109 var102 = class104.field2202[var5 + 1];
                                                                            class109 var103 = class104.field2202[var5];
                                                                            class63.field1299.method535(224, -25013);
                                                                            class63.field1299.method135(0, (byte) -50);
                                                                            int var104 = class63.field1299.field309;
                                                                            class63.field1299.method157((byte) 26, var103.method889(true));
                                                                            class133.method1065(0, var102, class63.field1299);
                                                                            class63.field1299.method154(-1, -var104 + class63.field1299.field309);
                                                                            continue;
                                                                        }
                                                                        if (var271 == 5010) {
                                                                            class109 var105 = null;
                                                                            --var9;
                                                                            int var106 = class13.field326[var9];
                                                                            if (var106 < 100) {
                                                                                var105 = class116.field2573[var106];
                                                                            }
                                                                            if (var105 == null) {
                                                                                var105 = class95.field2038;
                                                                            }
                                                                            class104.field2202[var5++] = var105;
                                                                            continue;
                                                                        }
                                                                        if (var271 == 5011) {
                                                                            --var9;
                                                                            int var107 = class13.field326[var9];
                                                                            class109 var108 = null;
                                                                            if (var107 < 100) {
                                                                                var108 = class146.field3193[var107];
                                                                            }
                                                                            if (var108 == null) {
                                                                                var108 = class95.field2038;
                                                                            }
                                                                            class104.field2202[var5++] = var108;
                                                                            continue;
                                                                        }
                                                                        if (var271 == 5015) {
                                                                            class109 var109;
                                                                            if (class136.field2975 != null && class136.field2975.field1051 != null) {
                                                                                var109 = class136.field2975.field1051;
                                                                            } else {
                                                                                var109 = class72.field1468;
                                                                            }
                                                                            class104.field2202[var5++] = var109;
                                                                            continue;
                                                                        }
                                                                        if (var271 == 5016) {
                                                                            class13.field326[var9++] = class74.field1493;
                                                                            continue;
                                                                        }
                                                                        if (var271 == 5017) {
                                                                            class13.field326[var9++] = class76.field1593;
                                                                            continue;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (~var271 == -4101) {
                                                                        --var5;
                                                                        class109 var110 = class104.field2202[var5];
                                                                        --var9;
                                                                        int var111 = class13.field326[var9];
                                                                        class104.field2202[var5++] = class44.method405(new class109[] { var110, class143.method1132(var111, 114) }, (byte) -74);
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4102) {
                                                                        var5 -= 2;
                                                                        class109 var112 = class104.field2202[var5 + 1];
                                                                        class109 var113 = class104.field2202[var5];
                                                                        class104.field2202[var5++] = class44.method405(new class109[] { var113, var112 }, (byte) -74);
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4102) {
                                                                        --var5;
                                                                        class109 var114 = class104.field2202[var5];
                                                                        --var9;
                                                                        int var115 = class13.field326[var9];
                                                                        class104.field2202[var5++] = class44.method405(new class109[] { var114, class100.method802(10325, true, var115) }, (byte) -74);
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4104) {
                                                                        --var5;
                                                                        class109 var116 = class104.field2202[var5];
                                                                        class104.field2202[var5++] = var116.method882((byte) -89);
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4105) {
                                                                        --var9;
                                                                        int var117 = class13.field326[var9];
                                                                        long var118 = (long) var117 * 86400000L + 1014768000000L;
                                                                        class104.field2192.setTime(new Date(var118));
                                                                        int var120 = class104.field2192.get(5);
                                                                        int var121 = class104.field2192.get(2);
                                                                        int var122 = class104.field2192.get(1);
                                                                        class104.field2202[var5++] = class44.method405(new class109[] { class143.method1132(var120, 95), class91.field1960, class35.field787[var121], class91.field1960, class143.method1132(var122, 84) }, (byte) -74);
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4106) {
                                                                        var5 -= 2;
                                                                        class109 var123 = class104.field2202[var5 + 1];
                                                                        class109 var124 = class104.field2202[var5];
                                                                        if (class136.field2975.field1025 != null && class136.field2975.field1025.field378) {
                                                                            class104.field2202[var5++] = var123;
                                                                            continue;
                                                                        }
                                                                        class104.field2202[var5++] = var124;
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4107) {
                                                                        --var9;
                                                                        int var125 = class13.field326[var9];
                                                                        class104.field2202[var5++] = class143.method1132(var125, 100);
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4108) {
                                                                        var5 -= 2;
                                                                        class13.field326[var9++] = class104.field2202[var5].method901(class104.field2202[var5 - -1], 12);
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4108) {
                                                                        --var5;
                                                                        class109 var126 = class104.field2202[var5];
                                                                        var9 -= 2;
                                                                        int var127 = class13.field326[var9];
                                                                        int var128 = class13.field326[var9 + 1];
                                                                        byte[] var129 = class104.field2207.method742(0, 56, var128);
                                                                        class159 var130 = new class159(var129);
                                                                        class13.field326[var9++] = var130.method555(var126, var127);
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4109) {
                                                                        var9 -= 2;
                                                                        --var5;
                                                                        class109 var131 = class104.field2202[var5];
                                                                        int var132 = class13.field326[var9];
                                                                        int var133 = class13.field326[var9 - -1];
                                                                        byte[] var134 = class104.field2207.method742(0, -121, var133);
                                                                        class159 var135 = new class159(var134);
                                                                        class13.field326[var9++] = var135.method541(var131, var132);
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4110) {
                                                                        var5 -= 2;
                                                                        class109 var136 = class104.field2202[var5];
                                                                        class109 var137 = class104.field2202[var5 + 1];
                                                                        --var9;
                                                                        if (~class13.field326[var9] == -2) {
                                                                            class104.field2202[var5++] = var136;
                                                                        } else {
                                                                            class104.field2202[var5++] = var137;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4111) {
                                                                        --var5;
                                                                        class109 var138 = class104.field2202[var5];
                                                                        class104.field2202[var5++] = class70.method550(var138);
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4113) {
                                                                        --var9;
                                                                        int var139 = class13.field326[var9];
                                                                        --var5;
                                                                        class109 var140 = class104.field2202[var5];
                                                                        class104.field2202[var5++] = var140.method871(false, var139);
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4113) {
                                                                        --var9;
                                                                        int var141 = class13.field326[var9];
                                                                        class13.field326[var9++] = !class77.method610(false, var141) ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4114) {
                                                                        --var9;
                                                                        int var142 = class13.field326[var9];
                                                                        class13.field326[var9++] = !class114.method945(-28, var142) ? 0 : 1;
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4115) {
                                                                        --var9;
                                                                        int var143 = class13.field326[var9];
                                                                        class13.field326[var9++] = class15.method176(false, var143) ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4117) {
                                                                        --var9;
                                                                        int var144 = class13.field326[var9];
                                                                        class13.field326[var9++] = class53.method434((byte) 111, var144) ? 1 : 0;
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4118) {
                                                                        --var5;
                                                                        class109 var145 = class104.field2202[var5];
                                                                        if (var145 != null) {
                                                                            class13.field326[var9++] = var145.method898((byte) 125);
                                                                        } else {
                                                                            class13.field326[var9++] = 0;
                                                                        }
                                                                        continue;
                                                                    }
                                                                    if (~var271 == -4119) {
                                                                        var9 -= 2;
                                                                        int var146 = class13.field326[var9];
                                                                        --var5;
                                                                        class109 var147 = class104.field2202[var5];
                                                                        int var148 = class13.field326[var9 + 1];
                                                                        class104.field2202[var5++] = var147.method872(var148, -124, var146);
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4119) {
                                                                        --var5;
                                                                        class109 var149 = class104.field2202[var5];
                                                                        class109 var150 = class157.method1228(92, var149.method898((byte) 123));
                                                                        boolean var151 = false;
                                                                        for (int var152 = 0; var149.method898((byte) 125) > var152; ++var152) {
                                                                            int var153 = var149.method906(var152, false);
                                                                            if (~var153 != -61) {
                                                                                if (~var153 == -63) {
                                                                                    var151 = false;
                                                                                } else if (!var151) {
                                                                                    var150.method888(var153, (byte) -65);
                                                                                }
                                                                            } else {
                                                                                var151 = true;
                                                                            }
                                                                        }
                                                                        var150.method881(false);
                                                                        class104.field2202[var5++] = var150;
                                                                        continue;
                                                                    }
                                                                    if (var271 == 4120) {
                                                                        --var5;
                                                                        class109 var154 = class104.field2202[var5];
                                                                        --var9;
                                                                        int var155 = class13.field326[var9];
                                                                        class13.field326[var9++] = var154.method879((byte) 123, var155);
                                                                        continue;
                                                                    }
                                                                }
                                                            } else {
                                                                if (var271 == 4000) {
                                                                    var9 -= 2;
                                                                    int var156 = class13.field326[var9 - -1];
                                                                    int var157 = class13.field326[var9];
                                                                    class13.field326[var9++] = var156 + var157;
                                                                    continue;
                                                                }
                                                                if (var271 == 4001) {
                                                                    var9 -= 2;
                                                                    int var158 = class13.field326[var9];
                                                                    int var159 = class13.field326[var9 + 1];
                                                                    class13.field326[var9++] = -var159 + var158;
                                                                    continue;
                                                                }
                                                                if (var271 == 4002) {
                                                                    var9 -= 2;
                                                                    int var160 = class13.field326[var9];
                                                                    int var161 = class13.field326[var9 + 1];
                                                                    class13.field326[var9++] = var160 * var161;
                                                                    continue;
                                                                }
                                                                if (~var271 == -4004) {
                                                                    var9 -= 2;
                                                                    int var162 = class13.field326[var9];
                                                                    int var163 = class13.field326[var9 + 1];
                                                                    class13.field326[var9++] = var162 / var163;
                                                                    continue;
                                                                }
                                                                if (var271 == 4004) {
                                                                    --var9;
                                                                    int var164 = class13.field326[var9];
                                                                    class13.field326[var9++] = (int) (Math.random() * (double) var164);
                                                                    continue;
                                                                }
                                                                if (~var271 == -4006) {
                                                                    --var9;
                                                                    int var165 = class13.field326[var9];
                                                                    class13.field326[var9++] = (int) ((double) (var165 - -1) * Math.random());
                                                                    continue;
                                                                }
                                                                if (~var271 == -4007) {
                                                                    var9 -= 5;
                                                                    int var166 = class13.field326[var9];
                                                                    int var167 = class13.field326[var9 - -1];
                                                                    int var168 = class13.field326[var9 - -3];
                                                                    int var169 = class13.field326[var9 + 2];
                                                                    int var170 = class13.field326[var9 + 4];
                                                                    class13.field326[var9++] = (var167 - var166) * (var170 - var169) / (-var169 + var168) + var166;
                                                                    continue;
                                                                }
                                                                if (var271 == 4007) {
                                                                    var9 -= 2;
                                                                    int var171 = class13.field326[var9 + 1];
                                                                    int var172 = class13.field326[var9];
                                                                    class13.field326[var9++] = var171 * var172 / 100 + var172;
                                                                    continue;
                                                                }
                                                                if (var271 == 4008) {
                                                                    var9 -= 2;
                                                                    int var173 = class13.field326[var9 + 1];
                                                                    int var174 = class13.field326[var9];
                                                                    class13.field326[var9++] = class137.method1089(1 << var173, var174);
                                                                    continue;
                                                                }
                                                                if (~var271 == -4010) {
                                                                    var9 -= 2;
                                                                    int var175 = class13.field326[var9 + 1];
                                                                    int var176 = class13.field326[var9];
                                                                    class13.field326[var9++] = class4.method34(-(1 << var175) + -1, var176);
                                                                    continue;
                                                                }
                                                                if (~var271 == -4011) {
                                                                    var9 -= 2;
                                                                    int var177 = class13.field326[var9];
                                                                    int var178 = class13.field326[var9 + 1];
                                                                    class13.field326[var9++] = ~class4.method34(1 << var178, var177) == -1 ? 0 : 1;
                                                                    continue;
                                                                }
                                                                if (~var271 == -4012) {
                                                                    var9 -= 2;
                                                                    int var179 = class13.field326[var9];
                                                                    int var180 = class13.field326[var9 - -1];
                                                                    class13.field326[var9++] = var179 % var180;
                                                                    continue;
                                                                }
                                                                if (~var271 == -4013) {
                                                                    var9 -= 2;
                                                                    int var181 = class13.field326[var9];
                                                                    int var182 = class13.field326[var9 + 1];
                                                                    if (var181 == 0) {
                                                                        class13.field326[var9++] = 0;
                                                                    } else {
                                                                        class13.field326[var9++] = (int) Math.pow((double) var181, (double) var182);
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var271 == -4014) {
                                                                    var9 -= 2;
                                                                    int var183 = class13.field326[var9 + 1];
                                                                    int var184 = class13.field326[var9];
                                                                    if (var184 != 0) {
                                                                        if (var183 == 0) {
                                                                            class13.field326[var9++] = Integer.MAX_VALUE;
                                                                        } else {
                                                                            class13.field326[var9++] = (int) Math.pow((double) var184, 1.0D / (double) var183);
                                                                        }
                                                                    } else {
                                                                        class13.field326[var9++] = 0;
                                                                    }
                                                                    continue;
                                                                }
                                                                if (~var271 == -4015) {
                                                                    var9 -= 2;
                                                                    int var185 = class13.field326[var9 + 1];
                                                                    int var186 = class13.field326[var9];
                                                                    class13.field326[var9++] = class4.method34(var186, var185);
                                                                    continue;
                                                                }
                                                                if (var271 == 4015) {
                                                                    var9 -= 2;
                                                                    int var187 = class13.field326[var9 + 1];
                                                                    int var188 = class13.field326[var9];
                                                                    class13.field326[var9++] = class137.method1089(var188, var187);
                                                                    continue;
                                                                }
                                                            }
                                                        } else {
                                                            if (~var271 == -3401) {
                                                                var9 -= 2;
                                                                int var189 = class13.field326[var9 + 1];
                                                                int var190 = class13.field326[var9];
                                                                class138 var191 = class27.method240(var190, (byte) 90);
                                                                for (int var192 = 0; var191.field3007 > var192; ++var192) {
                                                                    if (~var191.field3000[var192] == ~var189) {
                                                                        class104.field2202[var5++] = var191.field3003[var192];
                                                                        var191 = null;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var191 != null) {
                                                                    class104.field2202[var5++] = var191.field3014;
                                                                }
                                                                continue;
                                                            }
                                                            if (var271 == 3408) {
                                                                var9 -= 4;
                                                                int var193 = class13.field326[var9];
                                                                int var194 = class13.field326[var9 + 1];
                                                                int var195 = class13.field326[var9 + 2];
                                                                int var196 = class13.field326[var9 + 3];
                                                                class138 var197 = class27.method240(var195, (byte) 95);
                                                                if (~var197.field3005 == ~var193 && var197.field3015 == var194) {
                                                                    for (int var198 = 0; ~var197.field3007 < ~var198; ++var198) {
                                                                        if (var197.field3000[var198] == var196) {
                                                                            if (var194 != 115) {
                                                                                class13.field326[var9++] = var197.field3002[var198];
                                                                            } else {
                                                                                class104.field2202[var5++] = var197.field3003[var198];
                                                                            }
                                                                            var197 = null;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var197 != null) {
                                                                        if (~var194 != -116) {
                                                                            class13.field326[var9++] = var197.field3010;
                                                                        } else {
                                                                            class104.field2202[var5++] = var197.field3014;
                                                                        }
                                                                    }
                                                                    continue;
                                                                }
                                                                if (var194 != 115) {
                                                                    class13.field326[var9++] = 0;
                                                                } else {
                                                                    class104.field2202[var5++] = class55.field1115;
                                                                }
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        if (~var271 == -3301) {
                                                            class13.field326[var9++] = class12.field264;
                                                            continue;
                                                        }
                                                        if (var271 == 3301) {
                                                            var9 -= 2;
                                                            int var199 = class13.field326[var9 + 1];
                                                            int var200 = class13.field326[var9];
                                                            class13.field326[var9++] = class12.method104(var199, -21094, var200);
                                                            continue;
                                                        }
                                                        if (~var271 == -3303) {
                                                            var9 -= 2;
                                                            int var201 = class13.field326[var9 + 1];
                                                            int var202 = class13.field326[var9];
                                                            class13.field326[var9++] = class135.method1076(var201, var202, 0);
                                                            continue;
                                                        }
                                                        if (var271 == 3303) {
                                                            var9 -= 2;
                                                            int var203 = class13.field326[var9];
                                                            int var204 = class13.field326[var9 + 1];
                                                            class13.field326[var9++] = class131.method1056((byte) 96, var203, var204);
                                                            continue;
                                                        }
                                                        if (var271 == 3304) {
                                                            --var9;
                                                            int var205 = class13.field326[var9];
                                                            class13.field326[var9++] = class120.method979(5, var205).field1127;
                                                            continue;
                                                        }
                                                        if (var271 == 3305) {
                                                            --var9;
                                                            int var206 = class13.field326[var9];
                                                            class13.field326[var9++] = class76.field1530[var206];
                                                            continue;
                                                        }
                                                        if (var271 == 3306) {
                                                            --var9;
                                                            int var207 = class13.field326[var9];
                                                            class13.field326[var9++] = class14.field375[var207];
                                                            continue;
                                                        }
                                                        if (var271 == 3307) {
                                                            --var9;
                                                            int var208 = class13.field326[var9];
                                                            class13.field326[var9++] = class92.field1968[var208];
                                                            continue;
                                                        }
                                                        if (~var271 == -3309) {
                                                            int var209 = class75.field1513;
                                                            int var210 = (class136.field2975.field3094 >> 7) + class43.field917;
                                                            int var211 = (class136.field2975.field3106 >> 7) + class82.field1736;
                                                            class13.field326[var9++] = (var210 << 14) + (var209 << 28) + var211;
                                                            continue;
                                                        }
                                                        if (var271 == 3309) {
                                                            --var9;
                                                            int var212 = class13.field326[var9];
                                                            class13.field326[var9++] = class4.method34(268433259, var212) >> 14;
                                                            continue;
                                                        }
                                                        if (~var271 == -3311) {
                                                            --var9;
                                                            int var213 = class13.field326[var9];
                                                            class13.field326[var9++] = var213 >> 28;
                                                            continue;
                                                        }
                                                        if (~var271 == -3312) {
                                                            --var9;
                                                            int var214 = class13.field326[var9];
                                                            class13.field326[var9++] = class4.method34(var214, 16383);
                                                            continue;
                                                        }
                                                        if (~var271 == -3313) {
                                                            class13.field326[var9++] = class63.field1291 ? 1 : 0;
                                                            continue;
                                                        }
                                                        if (var271 == 3313) {
                                                            var9 -= 2;
                                                            int var215 = class13.field326[var9 + 1];
                                                            int var216 = class13.field326[var9] - -32768;
                                                            class13.field326[var9++] = class12.method104(var215, -21094, var216);
                                                            continue;
                                                        }
                                                        if (var271 == 3314) {
                                                            var9 -= 2;
                                                            int var217 = class13.field326[var9] + 32768;
                                                            int var218 = class13.field326[var9 - -1];
                                                            class13.field326[var9++] = class135.method1076(var218, var217, 0);
                                                            continue;
                                                        }
                                                        if (var271 == 3315) {
                                                            var9 -= 2;
                                                            int var219 = class13.field326[var9] - -32768;
                                                            int var220 = class13.field326[var9 + 1];
                                                            class13.field326[var9++] = class131.method1056((byte) 84, var219, var220);
                                                            continue;
                                                        }
                                                        if (var271 == 3316) {
                                                            if (~class4.field87 <= -3) {
                                                                class13.field326[var9++] = class4.field87;
                                                            } else {
                                                                class13.field326[var9++] = 0;
                                                            }
                                                            continue;
                                                        }
                                                        if (var271 == 3317) {
                                                            class13.field326[var9++] = class112.field2407;
                                                            continue;
                                                        }
                                                        if (var271 == 3318) {
                                                            class13.field326[var9++] = class19.field474;
                                                            continue;
                                                        }
                                                        if (~var271 == -3322) {
                                                            class13.field326[var9++] = class102.field2147;
                                                            continue;
                                                        }
                                                        if (var271 == 3322) {
                                                            class13.field326[var9++] = class120.field2669;
                                                            continue;
                                                        }
                                                        if (~var271 == -3324) {
                                                            if (class4.field87 != 1) {
                                                                class13.field326[var9++] = 0;
                                                            } else {
                                                                class13.field326[var9++] = 1;
                                                            }
                                                            continue;
                                                        }
                                                    }
                                                } else {
                                                    if (var271 == 3100) {
                                                        --var5;
                                                        class109 var221 = class104.field2202[var5];
                                                        class75.method593(0, class95.field2038, -8870, var221);
                                                        continue;
                                                    }
                                                    if (~var271 == -3102) {
                                                        var9 -= 2;
                                                        class24.method231(class136.field2975, class13.field326[var9], (byte) 15, class13.field326[var9 + 1]);
                                                        continue;
                                                    }
                                                    if (var271 == 3103) {
                                                        method1001(1);
                                                        continue;
                                                    }
                                                    if (var271 == 3104) {
                                                        ++class156.field3604;
                                                        int var222 = 0;
                                                        --var5;
                                                        class109 var223 = class104.field2202[var5];
                                                        if (var223.method875(-72)) {
                                                            var222 = var223.method893(48);
                                                        }
                                                        class63.field1299.method535(89, -25013);
                                                        class63.field1299.method123(var222, 1375221240);
                                                        continue;
                                                    }
                                                    if (var271 == 3105) {
                                                        ++class71.field1433;
                                                        --var5;
                                                        class109 var224 = class104.field2202[var5];
                                                        class63.field1299.method535(39, -25013);
                                                        class63.field1299.method157((byte) 99, var224.method889(true));
                                                        continue;
                                                    }
                                                    if (var271 == 3106) {
                                                        ++class52.field1069;
                                                        --var5;
                                                        class109 var225 = class104.field2202[var5];
                                                        class63.field1299.method535(40, -25013);
                                                        class63.field1299.method135(var225.method898((byte) 127) + 1, (byte) -50);
                                                        class63.field1299.method152(9166, var225);
                                                        continue;
                                                    }
                                                    if (~var271 == -3108) {
                                                        --var9;
                                                        int var226 = class13.field326[var9];
                                                        --var5;
                                                        class109 var227 = class104.field2202[var5];
                                                        class95.method782(var227, (byte) 123, var226);
                                                        continue;
                                                    }
                                                    if (var271 == 3108) {
                                                        var9 -= 3;
                                                        int var228 = class13.field326[var9];
                                                        int var229 = class13.field326[var9 + 1];
                                                        int var230 = class13.field326[var9 + 2];
                                                        class154 var231 = class44.method403(var230, true);
                                                        class43.method395(var228, var231, var229, -82);
                                                        continue;
                                                    }
                                                    if (~var271 == -3110) {
                                                        class154 var232 = !var41 ? class100.field2088 : class135.field2944;
                                                        var9 -= 2;
                                                        int var233 = class13.field326[var9 - -1];
                                                        int var234 = class13.field326[var9];
                                                        class43.method395(var234, var232, var233, 29);
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                --var9;
                                                class154 var235 = class44.method403(class13.field326[var9], true);
                                                if (var271 == 2600) {
                                                    class13.field326[var9++] = var235.field3481;
                                                    continue;
                                                }
                                                if (~var271 == -2602) {
                                                    class13.field326[var9++] = var235.field3417;
                                                    continue;
                                                }
                                                if (var271 == 2602) {
                                                    class104.field2202[var5++] = var235.field3451;
                                                    continue;
                                                }
                                                if (var271 == 2603) {
                                                    class13.field326[var9++] = var235.field3432;
                                                    continue;
                                                }
                                                if (var271 == 2604) {
                                                    class13.field326[var9++] = var235.field3425;
                                                    continue;
                                                }
                                                if (~var271 == -2606) {
                                                    class13.field326[var9++] = var235.field3494;
                                                    continue;
                                                }
                                                if (~var271 == -2607) {
                                                    class13.field326[var9++] = var235.field3503;
                                                    continue;
                                                }
                                                if (var271 == 2607) {
                                                    class13.field326[var9++] = var235.field3469;
                                                    continue;
                                                }
                                                if (~var271 == -2609) {
                                                    class13.field326[var9++] = var235.field3475;
                                                    continue;
                                                }
                                            }
                                        } else {
                                            --var9;
                                            class154 var236 = class44.method403(class13.field326[var9], true);
                                            if (var271 == 2500) {
                                                class13.field326[var9++] = var236.field3384;
                                                continue;
                                            }
                                            if (var271 == 2501) {
                                                class13.field326[var9++] = var236.field3390;
                                                continue;
                                            }
                                            if (~var271 == -2503) {
                                                class13.field326[var9++] = var236.field3427;
                                                continue;
                                            }
                                            if (~var271 == -2504) {
                                                class13.field326[var9++] = var236.field3382;
                                                continue;
                                            }
                                            if (~var271 == -2505) {
                                                class13.field326[var9++] = var236.field3508 ? 1 : 0;
                                                continue;
                                            }
                                            if (var271 == 2505) {
                                                class13.field326[var9++] = var236.field3458;
                                                continue;
                                            }
                                        }
                                    } else {
                                        class154 var237 = var41 ? class135.field2944 : class100.field2088;
                                        if (var271 == 1800) {
                                            class13.field326[var9++] = class101.method817(21599, class136.method1084(0, var237));
                                            continue;
                                        }
                                        if (var271 == 1801) {
                                            --var9;
                                            int var238 = class13.field326[var9];
                                            int var273 = var238 - 1;
                                            if (var237.field3445 != null && ~var273 > ~var237.field3445.length && var237.field3445[var273] != null) {
                                                class104.field2202[var5++] = var237.field3445[var273];
                                                continue;
                                            }
                                            class104.field2202[var5++] = class95.field2038;
                                            continue;
                                        }
                                        if (~var271 == -1803) {
                                            if (var237.field3452 != null) {
                                                class104.field2202[var5++] = var237.field3452;
                                            } else {
                                                class104.field2202[var5++] = class95.field2038;
                                            }
                                            continue;
                                        }
                                    }
                                } else {
                                    class154 var239 = !var41 ? class100.field2088 : class135.field2944;
                                    if (~var271 == -1701) {
                                        class13.field326[var9++] = var239.field3386;
                                        continue;
                                    }
                                    if (~var271 == -1702) {
                                        if (var239.field3386 != -1) {
                                            class13.field326[var9++] = var239.field3474;
                                        } else {
                                            class13.field326[var9++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var271 == 1702) {
                                        class13.field326[var9++] = var239.field3478;
                                        continue;
                                    }
                                }
                            }
                        } else {
                            class154 var42;
                            if (var271 >= 2000) {
                                var271 -= 1000;
                                --var9;
                                var42 = class44.method403(class13.field326[var9], true);
                            } else {
                                var42 = !var41 ? class100.field2088 : class135.field2944;
                            }
                            if (~var271 == -1101) {
                                var9 -= 2;
                                var42.field3481 = class13.field326[var9];
                                if (~var42.field3481 < ~(-var42.field3427 + var42.field3432)) {
                                    var42.field3481 = -var42.field3427 + var42.field3432;
                                }
                                if (var42.field3481 < 0) {
                                    var42.field3481 = 0;
                                }
                                var42.field3417 = class13.field326[var9 + 1];
                                if (var42.field3417 > -var42.field3382 + var42.field3425) {
                                    var42.field3417 = -var42.field3382 + var42.field3425;
                                }
                                if (~var42.field3417 > -1) {
                                    var42.field3417 = 0;
                                }
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (var271 == 1101) {
                                --var9;
                                var42.field3439 = class13.field326[var9];
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (var271 == 1102) {
                                --var9;
                                var42.field3391 = class13.field326[var9] == 1;
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (~var271 == -1104) {
                                --var9;
                                var42.field3462 = class13.field326[var9];
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (~var271 == -1105) {
                                --var9;
                                var42.field3513 = class13.field326[var9];
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (var271 == 1105) {
                                --var9;
                                var42.field3426 = class13.field326[var9];
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (~var271 == -1107) {
                                --var9;
                                var42.field3484 = class13.field326[var9];
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (~var271 == -1108) {
                                --var9;
                                var42.field3442 = class13.field326[var9] == 1;
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (~var271 == -1109) {
                                var42.field3433 = 1;
                                --var9;
                                var42.field3505 = class13.field326[var9];
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (var271 == 1109) {
                                var9 -= 6;
                                var42.field3464 = class13.field326[var9];
                                var42.field3487 = class13.field326[var9 + 1];
                                var42.field3503 = class13.field326[var9 - -2];
                                var42.field3475 = class13.field326[var9 + 3];
                                var42.field3469 = class13.field326[var9 - -4];
                                var42.field3494 = class13.field326[var9 - -5];
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (~var271 == -1111) {
                                --var9;
                                int var43 = class13.field326[var9];
                                if (~var42.field3479 != ~var43) {
                                    var42.field3504 = 0;
                                    var42.field3479 = var43;
                                    var42.field3392 = 0;
                                    class138.method1092(0, var42);
                                }
                                continue;
                            }
                            if (~var271 == -1112) {
                                --var9;
                                var42.field3383 = ~class13.field326[var9] == -2;
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (var271 == 1112) {
                                --var5;
                                class109 var44 = class104.field2202[var5];
                                if (!var44.method908(var42.field3451, (byte) 60)) {
                                    var42.field3451 = var44;
                                    class138.method1092(0, var42);
                                }
                                continue;
                            }
                            if (~var271 == -1114) {
                                --var9;
                                var42.field3501 = class13.field326[var9];
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (~var271 == -1115) {
                                var9 -= 3;
                                var42.field3457 = class13.field326[var9];
                                var42.field3449 = class13.field326[var9 - -1];
                                var42.field3409 = class13.field326[var9 - -2];
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (~var271 == -1116) {
                                --var9;
                                var42.field3434 = class13.field326[var9] == 1;
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (~var271 == -1117) {
                                --var9;
                                var42.field3515 = class13.field326[var9];
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (~var271 == -1118) {
                                --var9;
                                var42.field3509 = class13.field326[var9];
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (var271 == 1118) {
                                --var9;
                                var42.field3500 = class13.field326[var9] == 1;
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (var271 == 1119) {
                                --var9;
                                var42.field3498 = ~class13.field326[var9] == -2;
                                class138.method1092(0, var42);
                                continue;
                            }
                            if (~var271 == -1121) {
                                var9 -= 2;
                                var42.field3432 = class13.field326[var9];
                                var42.field3425 = class13.field326[var9 + 1];
                                class138.method1092(0, var42);
                                continue;
                            }
                        }
                        throw new IllegalStateException();
                    }
                } catch (Exception var270) {
                    if (var4.field3591 == null) {
                        if (~class83.field1774 != -1) {
                            class75.method593(0, class95.field2038, -8870, class112.field2397);
                        }
                        class112.method921("CS2 - scr:" + var4.field267 + " op:" + var8, false, var270);
                    } else {
                        class109 var267 = class157.method1228(96, 30);
                        var267.method900((byte) -98, class156.field3601).method900((byte) -98, var4.field3591);
                        for (int var268 = class114.field2528 - 1; ~var268 <= -1; --var268) {
                            var267.method900((byte) -98, class153.field3366).method900((byte) -98, class9.field222[var268].field3318.field3591);
                        }
                        if (var8 == 40) {
                            int var269 = var10[var6];
                            var267.method900((byte) -98, class138.field3011).method900((byte) -98, class143.method1132(var269, 126));
                        }
                        if (class83.field1774 != 0) {
                            class75.method593(0, class95.field2038, -8870, class44.method405(new class109[] { class107.field2243, var4.field3591 }, (byte) -74));
                        }
                        class112.method921("CS2 - scr:" + var4.field267 + " op:" + var8 + new String(var267.method874(92)), false, var270);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(II)V")
    public final void method763(int arg0, int arg1) {
        int var3 = -46 % ((arg1 - 17) / 60);
        ++field2729;
        class92.method771(arg0, -761237296, this.field2732);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BIILna;Lna;)Lwf;")
    public static final class159 method1004(byte arg0, int arg1, int arg2, class91 arg3, class91 arg4) {
        if (arg0 > -91) {
            field2725 = null;
        }
        ++field2728;
        return !class12.method100(arg3, arg2, true, arg1) ? null : class135.method1073(arg4.method742(arg1, -122, arg2), true);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z[BBIZ)V")
    public final void method1005(boolean arg0, byte[] arg1, byte arg2, int arg3, boolean arg4) {
        int var6 = 110 / ((arg2 - -67) / 55);
        ++field2709;
        if (arg4) {
            if (this.field2699) {
                throw new RuntimeException();
            } else {
                if (this.field2713 != null) {
                    class25.method234(this.field2732, -70, this.field2713, arg1);
                }
                this.method753((byte) 77, arg1);
                this.method994((byte) 104);
            }
        } else {
            arg1[arg1.length - 2] = (byte) (super.field1917[arg3] >> 8);
            arg1[arg1.length + -1] = (byte) super.field1917[arg3];
            if (this.field2724 != null) {
                class25.method234(arg3, -108, this.field2724, arg1);
                this.field2726[arg3] = true;
            }
            if (arg0) {
                super.field1927[arg3] = class42.method386(false, arg1, false);
            }
        }
    }
}
