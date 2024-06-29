import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class195 extends class64 {

    @OriginalMember(owner = "client!vf", name = "kb", descriptor = "I")
    private int field3826 = 16;

    @OriginalMember(owner = "client!vf", name = "nb", descriptor = "I")
    private int field3829 = 0;

    @OriginalMember(owner = "client!vf", name = "fb", descriptor = "I")
    private int field3821 = 4096;

    @OriginalMember(owner = "client!vf", name = "ob", descriptor = "I")
    private int field3830 = 2000;

    @OriginalMember(owner = "client!vf", name = "jb", descriptor = "I")
    private int field3825 = 0;

    @OriginalMember(owner = "client!vf", name = "lb", descriptor = "Lsg;")
    private static class169 field3827 = class165.method1060("We suspect someone knows your password)3", 1536);

    @OriginalMember(owner = "client!vf", name = "ib", descriptor = "Lsg;")
    private static class169 field3824 = class165.method1060("purple:", 1536);

    @OriginalMember(owner = "client!vf", name = "qb", descriptor = "Lsg;")
    public static class169 field3832 = class165.method1060(" zuerst von Ihrer Ignorieren)2Liste(Q", 1536);

    @OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lsg;")
    public static class169 field3822 = field3824;

    @OriginalMember(owner = "client!vf", name = "pb", descriptor = "Lsg;")
    private static class169 field3831 = class165.method1060("Select a world", 1536);

    @OriginalMember(owner = "client!vf", name = "tb", descriptor = "Lsg;")
    public static class169 field3835 = class165.method1060("Diese Betatest)2Welt ist nur f-Ur eingeladene", 1536);

    @OriginalMember(owner = "client!vf", name = "bb", descriptor = "Lsg;")
    public static class169 field3817 = field3824;

    @OriginalMember(owner = "client!vf", name = "vb", descriptor = "Lsg;")
    public static class169 field3837 = field3827;

    @OriginalMember(owner = "client!vf", name = "eb", descriptor = "Lsg;")
    public static class169 field3820 = field3831;

    @OriginalMember(owner = "client!vf", name = "cb", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!vf", name = "hb", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!vf", name = "mb", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!vf", name = "rb", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!vf", name = "sb", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!vf", name = "ub", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!vf", name = "wb", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!vf", name = "xb", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!vf", name = "db", descriptor = "[I")
    public static int[] field3819;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field3818;
        if (arg1 != 19) {
            return null;
        } else {
            int[] var3 = super.field1192.method19((byte) 123, arg0);
            if (super.field1192.field75) {
                int var4 = this.field3821 >> 1;
                int[][] var5 = super.field1192.method25(arg1 + 107);
                Random var6 = new Random((long) this.field3829);
                for (int var7 = 0; this.field3830 > var7; ++var7) {
                    int var8 = this.field3821 <= 0 ? this.field3825 : -var4 + this.field3825 + class45.method283(arg1 + -1838102771, var6, this.field3821);
                    int var9 = (var8 & 4092) >> 4;
                    int var10 = class45.method283(-1838102752, var6, class147.field2715);
                    int var11 = class45.method283(-1838102752, var6, class103.field1895);
                    int var12 = (class148.field2719[var9] * this.field3826 >> 12) + var11;
                    int var13 = (class125.field2292[var9] * this.field3826 >> 12) + var10;
                    int var14 = var12 - var11;
                    int var15 = var13 - var10;
                    if (~var15 != -1 || ~var14 != -1) {
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (~var14 > -1) {
                            var14 = -var14;
                        }
                        boolean var16 = ~var15 > ~var14;
                        if (var16) {
                            int var17 = var10;
                            var10 = var11;
                            var11 = var17;
                            int var18 = var13;
                            var13 = var12;
                            var12 = var18;
                        }
                        if (~var13 > ~var10) {
                            int var19 = var10;
                            var10 = var13;
                            var13 = var19;
                            int var20 = var11;
                            var11 = var12;
                            var12 = var20;
                        }
                        int var21 = var11;
                        int var22 = var13 - var10;
                        int var23 = -var11 + var12;
                        int var24 = -var22 / 2;
                        int var25 = 2048 / var22;
                        if (~var23 > -1) {
                            var23 = -var23;
                        }
                        int var26 = var11 < var12 ? 1 : -1;
                        int var27 = 1024 + -(class45.method283(-1838102752, var6, 4096) >> 2);
                        for (int var28 = var10; ~var13 < ~var28; ++var28) {
                            int var29 = (-var10 + var28) * var25 + var27 + 1024;
                            var24 += var23;
                            int var30 = class8.field217 & var28;
                            int var31 = var21 & class89.field1616;
                            if (~var24 < -1) {
                                var24 -= var22;
                                var21 += var26;
                            }
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)I")
    public static final int method1285(int arg0, int arg1, int arg2) {
        ++field3839;
        class87 var3 = (class87) class3.field59.method1045((long) arg0, (byte) -77);
        if (arg2 < 23) {
            method1286(63, (byte) 58, -117, (class191[]) null, (byte[]) null, 53, -59);
        }
        if (var3 == null) {
            return 0;
        } else {
            return ~arg1 <= -1 && var3.field1599.length > arg1 ? var3.field1599[arg1] : 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        ++field3834;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field3821 = arg1.method785(true);
                        }
                    } else {
                        this.field3825 = arg1.method785(true);
                    }
                } else {
                    this.field3826 = arg1.method819((byte) 22);
                }
            } else {
                this.field3830 = arg1.method785(true);
            }
        } else {
            this.field3829 = arg1.method819((byte) 22);
        }
        int var5 = 76 / ((arg0 - -60) / 36);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI[Lvb;[BII)V")
    public static final void method1286(int arg0, byte arg1, int arg2, class191[] arg3, byte[] arg4, int arg5, int arg6) {
        for (int var7 = 0; ~var7 > -5; ++var7) {
            for (int var12 = 0; var12 < 64; ++var12) {
                for (int var13 = 0; var13 < 64; ++var13) {
                    if (~(arg5 + var12) < -1 && arg5 + var12 < 103 && arg2 + var13 > 0 && ~(arg2 + var13) > -104) {
                        arg3[var7].field3776[arg5 + var12][arg2 + var13] = class150.method984(arg3[var7].field3776[arg5 + var12][arg2 + var13], -16777217);
                    }
                }
            }
        }
        class127 var8 = new class127(arg4);
        if (arg1 != 91) {
            field3831 = null;
        }
        for (int var9 = 0; ~var9 > -5; ++var9) {
            for (int var10 = 0; var10 < 64; ++var10) {
                for (int var11 = 0; var11 < 64; ++var11) {
                    class32.method221(var10 - -arg5, 113, var9, arg2 + var11, var8, 0, arg0, arg6);
                }
            }
        }
        ++field3828;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        if (arg0) {
            this.method17(false);
        }
        ++field3833;
        class145.method956((byte) -10);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class195() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)Lu;")
    public static final class180 method1287(boolean arg0, int arg1) {
        class180 var2 = (class180) class26.field546.method1206((long) arg1, -24742);
        ++field3823;
        if (arg0) {
            field3824 = null;
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class65.field1210.method552(arg1, 3, 0);
            class180 var4 = new class180();
            if (var3 != null) {
                var4.method1198(new class127(var3), -1);
            }
            class26.field546.method1208((long) arg1, -33, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)Z")
    public static final boolean method1288(int arg0) {
        ++field3836;
        if (class2.field37 == null) {
            return false;
        } else {
            try {
                int var1 = class2.field37.method358(-10633);
                if (~var1 == -1) {
                    return false;
                }
                if (class86.field1571 == -1) {
                    --var1;
                    class2.field37.method357(-64, 0, class85.field1559.field2325, 1);
                    class85.field1559.field2346 = 0;
                    class86.field1571 = class85.field1559.method1032(62);
                    class27.field553 = class156.field2995[class86.field1571];
                }
                if (~class27.field553 == 0) {
                    if (var1 <= 0) {
                        return false;
                    }
                    --var1;
                    class2.field37.method357(-123, 0, class85.field1559.field2325, 1);
                    class27.field553 = class85.field1559.field2325[0] & 255;
                }
                if (class27.field553 == -2) {
                    if (var1 <= 1) {
                        return false;
                    }
                    class2.field37.method357(-85, 0, class85.field1559.field2325, 2);
                    var1 -= 2;
                    class85.field1559.field2346 = 0;
                    class27.field553 = class85.field1559.method785(true);
                }
                int var2 = 121 % ((-55 - arg0) / 63);
                if (~var1 > ~class27.field553) {
                    return false;
                }
                class85.field1559.field2346 = 0;
                class2.field37.method357(-64, 0, class85.field1559.field2325, class27.field553);
                class77.field1450 = class61.field1127;
                class46.field853 = 0;
                class61.field1127 = class90.field1647;
                class90.field1647 = class86.field1571;
                if (class86.field1571 == 76) {
                    int var3 = class85.field1559.method791(-111);
                    class169 var4 = class85.field1559.method793((byte) -76);
                    class150 var5 = class62.method385((byte) 41, var3);
                    if (!var4.method1121(var5.field2832, 110)) {
                        var5.field2832 = var4;
                        class64.method404(92, var5);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 32) {
                    int var6 = class27.field553 + class85.field1559.field2346;
                    int var7 = class85.field1559.method785(true);
                    int var8 = class85.field1559.method785(true);
                    if (~class106.field1943 != ~var7) {
                        class106.field1943 = var7;
                        class193.method1275(class106.field1943, (byte) -83);
                        class185.method1230(class106.field1943, (byte) 7);
                        for (int var9 = 0; ~var9 > -101; ++var9) {
                            class118.field2201[var9] = true;
                        }
                    }
                    while (var8-- > 0) {
                        int var10 = class85.field1559.method814(8);
                        int var11 = class85.field1559.method785(true);
                        int var12 = class85.field1559.method819((byte) 22);
                        class80 var13 = (class80) class202.field3948.method1045((long) var10, (byte) -77);
                        if (var13 != null && var13.field1475 != var11) {
                            class15.method88(true, 6, var13);
                            var13 = null;
                        }
                        if (var13 == null) {
                            var13 = class65.method411(var12, var11, -11368, var10);
                        }
                        var13.field1483 = true;
                    }
                    for (class80 var14 = (class80) class202.field3948.method1042((byte) 104); var14 != null; var14 = (class80) class202.field3948.method1047((byte) 64)) {
                        if (!var14.field1483) {
                            class15.method88(true, 6, var14);
                        } else {
                            var14.field1483 = false;
                        }
                    }
                    class204.field4003 = new class163(512);
                    while (~var6 < ~class85.field1559.field2346) {
                        int var15 = class85.field1559.method814(8);
                        int var16 = class85.field1559.method785(true);
                        int var17 = class85.field1559.method785(true);
                        int var18 = class85.field1559.method814(8);
                        for (int var19 = var16; var19 <= var17; ++var19) {
                            long var20 = ((long) var15 << 32) + (long) var19;
                            class204.field4003.method1044(var20, true, new class6(var18));
                        }
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 150) {
                    long var22 = class85.field1559.method778(false);
                    int var24 = class85.field1559.method785(true);
                    int var25 = class85.field1559.method819((byte) 22);
                    class169 var26 = class123.method762(115, var22).method1127((byte) -126);
                    for (int var27 = 0; var27 < class57.field1064; ++var27) {
                        if (class142.field2640[var27] == var22) {
                            if (~class11.field273[var27] != ~var24) {
                                class11.field273[var27] = var24;
                                if (var24 > 0) {
                                    class199.method1307((byte) 122, class45.field838, class165.method1058(0, new class169[] { var26, class152.field2935 }), 5);
                                }
                                if (var24 == 0) {
                                    class199.method1307((byte) 122, class45.field838, class165.method1058(0, new class169[] { var26, class116.field2139 }), 5);
                                }
                            }
                            var26 = null;
                            class192.field3801[var27] = var25;
                            break;
                        }
                    }
                    boolean var28 = false;
                    if (var26 != null && ~class57.field1064 > -201) {
                        class142.field2640[class57.field1064] = var22;
                        class137.field2553[class57.field1064] = var26;
                        class11.field273[class57.field1064] = var24;
                        class192.field3801[class57.field1064] = var25;
                        ++class57.field1064;
                    }
                    class8.field215 = class58.field1078;
                    int var29 = class57.field1064;
                    while (~var29 < -1) {
                        boolean var30 = true;
                        --var29;
                        for (int var31 = 0; ~var29 < ~var31; ++var31) {
                            if (~class11.field273[var31] != ~class80.field1482 && ~class11.field273[var31 + 1] == ~class80.field1482 || ~class11.field273[var31] == -1 && ~class11.field273[var31 + 1] != -1) {
                                var30 = false;
                                int var32 = class11.field273[var31];
                                class11.field273[var31] = class11.field273[var31 + 1];
                                class11.field273[var31 - -1] = var32;
                                class169 var33 = class137.field2553[var31];
                                class137.field2553[var31] = class137.field2553[var31 - -1];
                                class137.field2553[var31 + 1] = var33;
                                long var34 = class142.field2640[var31];
                                class142.field2640[var31] = class142.field2640[var31 + 1];
                                class142.field2640[var31 - -1] = var34;
                                int var36 = class192.field3801[var31];
                                class192.field3801[var31] = class192.field3801[var31 + 1];
                                class192.field3801[var31 + 1] = var36;
                            }
                        }
                        if (var30) {
                            break;
                        }
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 249) {
                    class17.field377 = class85.field1559.method784(127);
                    class94.field1761 = class85.field1559.method809((byte) -116);
                    while (~class27.field553 < ~class85.field1559.field2346) {
                        class86.field1571 = class85.field1559.method819((byte) 22);
                        class26.method183(1152628066);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -187) {
                    int var37 = class85.field1559.method785(true);
                    int var38 = class85.field1559.method795((byte) 26);
                    int var39 = class85.field1559.method827((byte) 56);
                    int var40 = class85.field1559.method805((byte) -117);
                    class150 var41 = class62.method385((byte) 41, var40);
                    if (var41.field2888 != var39 || ~var41.field2863 != ~var38 || ~var41.field2904 != ~var37) {
                        var41.field2888 = var39;
                        var41.field2904 = var37;
                        var41.field2863 = var38;
                        class64.method404(113, var41);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 63) {
                    int var42 = class85.field1559.method780(-7052);
                    class5.field113 = class163.field3134.method680((byte) -110, var42);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 146) {
                    class105.field1933 = 30 * class85.field1559.method785(true);
                    class69.field1298 = class58.field1078;
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 224) {
                    class121.method753(false, (byte) 92);
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -207) {
                    class46.method289((byte) -90);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 59) {
                    long var43 = class85.field1559.method778(false);
                    int var45 = class85.field1559.method785(true);
                    byte var46 = class85.field1559.method824((byte) -76);
                    boolean var47 = false;
                    if (~(Long.MIN_VALUE & var43) != -1L) {
                        var47 = true;
                    }
                    if (!var47) {
                        class70 var48 = new class70();
                        var48.field3543 = var43;
                        var48.field1306 = class123.method762(119, var48.field3543);
                        var48.field1316 = var46;
                        var48.field1309 = var45;
                        int var49;
                        for (var49 = class21.field444 + -1; var49 >= 0; --var49) {
                            int var50 = class35.field696[var49].field1306.method1112((byte) 125, var48.field1306);
                            if (~var50 == -1) {
                                class35.field696[var49].field1309 = var45;
                                class35.field696[var49].field1316 = var46;
                                class86.field1571 = -1;
                                class11.field270 = class58.field1078;
                                if (~class44.field829 == ~var43) {
                                    class202.field3954 = var46;
                                }
                                return true;
                            }
                            if (var50 < 0) {
                                break;
                            }
                        }
                        if (~class21.field444 <= ~class35.field696.length) {
                            class86.field1571 = -1;
                            return true;
                        }
                        for (int var51 = class21.field444 + -1; var51 > var49; --var51) {
                            class35.field696[var51 + 1] = class35.field696[var51];
                        }
                        if (class21.field444 == 0) {
                            class35.field696 = new class70[100];
                        }
                        class35.field696[var49 - -1] = var48;
                        if (~class44.field829 == ~var43) {
                            class202.field3954 = var46;
                        }
                        ++class21.field444;
                    } else {
                        if (class21.field444 == 0) {
                            class86.field1571 = -1;
                            return true;
                        }
                        boolean var52 = false;
                        long var53 = var43 & Long.MAX_VALUE;
                        int var55;
                        for (var55 = 0; ~var55 > ~class21.field444 && (~class35.field696[var55].field3543 != ~var53 || class35.field696[var55].field1309 != var45); ++var55) {
                        }
                        if (var55 < class21.field444) {
                            while (class21.field444 + -1 > var55) {
                                class35.field696[var55] = class35.field696[var55 + 1];
                                ++var55;
                            }
                            --class21.field444;
                            class35.field696[class21.field444] = null;
                        }
                    }
                    class11.field270 = class58.field1078;
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -74) {
                    class95.field1805 = class85.field1559.method819((byte) 22);
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -253) {
                    class121.method753(true, (byte) 111);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 29) {
                    class17.field406 = false;
                    for (int var56 = 0; var56 < 5; ++var56) {
                        class32.field686[var56] = false;
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -161) {
                    class42.field791 = class85.field1559.method819((byte) 22);
                    client.field579 = class85.field1559.method819((byte) 22);
                    class75.field1415 = class85.field1559.method819((byte) 22);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 31 || class86.field1571 == 148 || class86.field1571 == 39 || ~class86.field1571 == -68 || class86.field1571 == 108 || ~class86.field1571 == -152 || class86.field1571 == 15 || ~class86.field1571 == -249 || class86.field1571 == 124 || ~class86.field1571 == -226 || class86.field1571 == 43) {
                    class26.method183(1152628066);
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -51) {
                    class11.field270 = class58.field1078;
                    long var57 = class85.field1559.method778(false);
                    if (var57 == 0L) {
                        class35.field696 = null;
                        class21.field444 = 0;
                        class86.field1571 = -1;
                        class112.field2042 = null;
                        class110.field2007 = null;
                        return true;
                    }
                    long var59 = class85.field1559.method778(false);
                    class110.field2007 = class123.method762(98, var59);
                    class112.field2042 = class123.method762(104, var57);
                    class121.field2226 = class85.field1559.method824((byte) -93);
                    int var61 = class85.field1559.method819((byte) 22);
                    if (var61 == 255) {
                        class86.field1571 = -1;
                        return true;
                    }
                    class21.field444 = var61;
                    class70[] var62 = new class70[100];
                    for (int var63 = 0; class21.field444 > var63; ++var63) {
                        var62[var63] = new class70();
                        var62[var63].field3543 = class85.field1559.method778(false);
                        var62[var63].field1306 = class123.method762(101, var62[var63].field3543);
                        var62[var63].field1309 = class85.field1559.method785(true);
                        var62[var63].field1316 = class85.field1559.method824((byte) -53);
                        if (~class44.field829 == ~var62[var63].field3543) {
                            class202.field3954 = var62[var63].field1316;
                        }
                    }
                    boolean var64 = false;
                    int var65 = class21.field444;
                    while (var65 > 0) {
                        --var65;
                        boolean var66 = true;
                        for (int var67 = 0; ~var65 < ~var67; ++var67) {
                            if (var62[var67].field1306.method1112((byte) 125, var62[var67 + 1].field1306) > 0) {
                                var66 = false;
                                class70 var68 = var62[var67];
                                var62[var67] = var62[var67 + 1];
                                var62[var67 + 1] = var68;
                            }
                        }
                        if (var66) {
                            break;
                        }
                    }
                    class86.field1571 = -1;
                    class35.field696 = var62;
                    return true;
                }
                if (~class86.field1571 == -208) {
                    class17.field406 = true;
                    class164.field3150 = class85.field1559.method819((byte) 22);
                    class138.field2560 = class85.field1559.method819((byte) 22);
                    class143.field2669 = class85.field1559.method785(true);
                    class190.field3750 = class85.field1559.method819((byte) 22);
                    class122.field2247 = class85.field1559.method819((byte) 22);
                    if (class122.field2247 >= 100) {
                        class7.field159 = class164.field3150 * 128 + 64;
                        class138.field2569 = class138.field2560 * 128 - -64;
                        class182.field3559 = class183.method1215(class7.field159, class61.field1132, class138.field2569, 0) + -class143.field2669;
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -80) {
                    class179.method1192((byte) 107);
                    class184.field3574 = class85.field1559.method819((byte) 22);
                    class86.field1571 = -1;
                    class69.field1298 = class58.field1078;
                    return true;
                }
                if (~class86.field1571 == -123) {
                    class169 var69 = class85.field1559.method793((byte) -89);
                    if (!var69.method1113(class134.field2514, 24925)) {
                        if (var69.method1113(class70.field1319, 24925)) {
                            class169 var70 = var69.method1132(0, 112, var69.method1116(-248, class13.field303));
                            boolean var71 = false;
                            long var72 = var70.method1133(false);
                            for (int var74 = 0; ~var74 > ~class206.field4052; ++var74) {
                                if (class82.field1513[var74] == var72) {
                                    var71 = true;
                                    break;
                                }
                            }
                            if (!var71 && class23.field486 == 0) {
                                class199.method1307((byte) 118, var70, class125.field2279, 8);
                            }
                        } else if (var69.method1113(class41.field773, 24925)) {
                            class169 var75 = var69.method1132(0, 124, var69.method1116(-248, class13.field303));
                            long var76 = var75.method1133(false);
                            boolean var78 = false;
                            for (int var79 = 0; ~var79 > ~class206.field4052; ++var79) {
                                if (class82.field1513[var79] == var76) {
                                    var78 = true;
                                    break;
                                }
                            }
                            if (!var78 && class23.field486 == 0) {
                                class169 var80 = var69.method1132(var69.method1116(-248, class13.field303) + 1, 120, -9 + var69.method1134(0));
                                class199.method1307((byte) 120, var75, var80, 8);
                            }
                        } else if (!var69.method1113(class159.field3035, 24925)) {
                            if (var69.method1113(class13.field308, 24925)) {
                                class169 var86 = var69.method1132(0, 110, var69.method1116(-248, class13.field308));
                                class199.method1307((byte) 123, class45.field838, var86, 11);
                            } else if (var69.method1113(class164.field3142, 24925)) {
                                class169 var87 = var69.method1132(0, 123, var69.method1116(-248, class164.field3142));
                                if (class23.field486 == 0) {
                                    class199.method1307((byte) 120, class45.field838, var87, 12);
                                }
                            } else if (!var69.method1113(class152.field2929, 24925)) {
                                class199.method1307((byte) 125, class45.field838, var69, 0);
                            } else {
                                class169 var88 = var69.method1132(0, 126, var69.method1116(-248, class152.field2929));
                                if (~class23.field486 == -1) {
                                    class199.method1307((byte) 124, class45.field838, var88, 13);
                                }
                            }
                        } else {
                            class169 var81 = var69.method1132(0, 104, var69.method1116(-248, class13.field303));
                            long var82 = var81.method1133(false);
                            boolean var84 = false;
                            for (int var85 = 0; ~class206.field4052 < ~var85; ++var85) {
                                if (class82.field1513[var85] == var82) {
                                    var84 = true;
                                    break;
                                }
                            }
                            if (!var84 && ~class23.field486 == -1) {
                                class199.method1307((byte) 126, var81, class45.field838, 10);
                            }
                        }
                    } else {
                        class169 var89 = var69.method1132(0, 121, var69.method1116(-248, class13.field303));
                        long var90 = var89.method1133(false);
                        boolean var92 = false;
                        for (int var93 = 0; class206.field4052 > var93; ++var93) {
                            if (~class82.field1513[var93] == ~var90) {
                                var92 = true;
                                break;
                            }
                        }
                        if (!var92 && class23.field486 == 0) {
                            class199.method1307((byte) 127, var89, class147.field2713, 4);
                        }
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 234) {
                    int var94 = class85.field1559.method796(true);
                    int var95 = class85.field1559.method814(8);
                    int var96 = class85.field1559.method817(16259);
                    class150 var97 = class62.method385((byte) 41, var95);
                    int var98 = var97.field2868 + var94;
                    int var99 = var97.field2794 + var96;
                    if (~var97.field2805 != ~var99 || var97.field2903 != var98) {
                        var97.field2903 = var98;
                        var97.field2805 = var99;
                        class64.method404(104, var97);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 162) {
                    byte var100 = class85.field1559.method782(1);
                    int var101 = class85.field1559.method785(true);
                    class98.field1845[var101] = var100;
                    if (class6.field119[var101] != var100) {
                        class6.field119[var101] = var100;
                        class63.method389(23708, var101);
                    }
                    class68.field1282[class150.method984(31, class118.field2202++)] = var101;
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 117) {
                    int var102 = class85.field1559.method819((byte) 22);
                    int var103 = class85.field1559.method819((byte) 22);
                    int var104 = class85.field1559.method819((byte) 22);
                    int var105 = class85.field1559.method819((byte) 22);
                    int var106 = class85.field1559.method785(true);
                    class32.field686[var102] = true;
                    class143.field2657[var102] = var103;
                    class95.field1811[var102] = var104;
                    class163.field3131[var102] = var105;
                    class136.field2540[var102] = var106;
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -174) {
                    class118.method742((byte) -110, class85.field1559);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 228) {
                    int var107 = class85.field1559.method785(true);
                    if (var107 == 65535) {
                        var107 = -1;
                    }
                    int var108 = class85.field1559.method805((byte) -122);
                    int var109 = class85.field1559.method805((byte) -116);
                    class150 var110 = class62.method385((byte) 41, var108);
                    if (var110.field2778) {
                        var110.field2900 = var109;
                        var110.field2901 = var107;
                        class73 var111 = class180.method1196(var107, 0);
                        var110.field2904 = var111.field1376;
                        if (var110.field2875 > 0) {
                            var110.field2904 = var110.field2904 * 32 / var110.field2875;
                        }
                        var110.field2833 = var111.field1386;
                        var110.field2863 = var111.field1348;
                        var110.field2796 = var111.field1338;
                        var110.field2820 = var111.field1344;
                        var110.field2888 = var111.field1356;
                        class64.method404(118, var110);
                    } else {
                        if (var107 == -1) {
                            class86.field1571 = -1;
                            var110.field2808 = 0;
                            return true;
                        }
                        class73 var112 = class180.method1196(var107, 0);
                        var110.field2863 = var112.field1348;
                        var110.field2904 = var112.field1376 * 100 / var109;
                        var110.field2808 = 4;
                        var110.field2803 = var107;
                        var110.field2888 = var112.field1356;
                        class64.method404(100, var110);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -203) {
                    int var113 = class85.field1559.method814(8);
                    int var114 = class85.field1559.method785(true);
                    if (var113 < -70000) {
                        var114 += 32768;
                    }
                    class150 var115;
                    if (var113 < 0) {
                        var115 = null;
                    } else {
                        var115 = class62.method385((byte) 41, var113);
                    }
                    while (class27.field553 > class85.field1559.field2346) {
                        int var116 = class85.field1559.method812(true);
                        int var117 = 0;
                        int var118 = class85.field1559.method785(true);
                        if (var118 != 0) {
                            var117 = class85.field1559.method819((byte) 22);
                            if (var117 == 255) {
                                var117 = class85.field1559.method814(8);
                            }
                        }
                        if (var115 != null && ~var116 <= -1 && ~var116 > ~var115.field2782.length) {
                            var115.field2782[var116] = var118;
                            var115.field2870[var116] = var117;
                        }
                        class159.method1023(var114, var116, var118 + -1, (byte) -64, var117);
                    }
                    if (var115 != null) {
                        class64.method404(117, var115);
                    }
                    class179.method1192((byte) 126);
                    class137.field2545[class150.method984(class189.field3676++, 31)] = class150.method984(32767, var114);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 87) {
                    int var119 = class85.field1559.method814(8);
                    class80 var120 = (class80) class202.field3948.method1045((long) var119, (byte) -77);
                    if (var120 != null) {
                        class15.method88(true, 6, var120);
                    }
                    if (class55.field999 != null) {
                        class64.method404(106, class55.field999);
                        class55.field999 = null;
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -211) {
                    int var121 = class85.field1559.method791(-115);
                    class150 var122 = class62.method385((byte) 41, var121);
                    for (int var123 = 0; ~var123 > ~var122.field2782.length; ++var123) {
                        var122.field2782[var123] = -1;
                        var122.field2782[var123] = 0;
                    }
                    class64.method404(125, var122);
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -130) {
                    long var124 = class85.field1559.method778(false);
                    class169 var126 = class117.method739(class81.method493(32, class85.field1559).method1109(-2));
                    class199.method1307((byte) 119, class123.method762(121, var124).method1127((byte) 54), var126, 6);
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -29) {
                    long var127 = class85.field1559.method778(false);
                    long var129 = (long) class85.field1559.method785(true);
                    boolean var131 = false;
                    long var132 = (long) class85.field1559.method773((byte) -125);
                    long var134 = (var129 << 32) + var132;
                    int var136 = class85.field1559.method819((byte) 22);
                    for (int var137 = 0; ~var137 > -101; ++var137) {
                        if (~class26.field548[var137] == ~var134) {
                            var131 = true;
                            break;
                        }
                    }
                    if (var136 <= 1) {
                        for (int var138 = 0; class206.field4052 > var138; ++var138) {
                            if (~class82.field1513[var138] == ~var127) {
                                var131 = true;
                                break;
                            }
                        }
                    }
                    if (!var131 && ~class23.field486 == -1) {
                        class26.field548[class115.field2135] = var134;
                        class115.field2135 = (class115.field2135 - -1) % 100;
                        class169 var139 = class117.method739(class81.method493(32, class85.field1559).method1109(-2));
                        if (~var136 != -3 && ~var136 != -4) {
                            if (var136 == 1) {
                                class199.method1307((byte) 121, class165.method1058(0, new class169[] { class199.field3898, class123.method762(124, var127).method1127((byte) -34) }), var139, 7);
                            } else {
                                class199.method1307((byte) 125, class123.method762(104, var127).method1127((byte) -125), var139, 3);
                            }
                        } else {
                            class199.method1307((byte) 123, class165.method1058(0, new class169[] { class158.field3013, class123.method762(82, var127).method1127((byte) 98) }), var139, 7);
                        }
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -71) {
                    for (int var140 = 0; var140 < class65.field1213.length; ++var140) {
                        if (class65.field1213[var140] != null) {
                            class65.field1213[var140].field3697 = -1;
                        }
                    }
                    for (int var141 = 0; var141 < class54.field992.length; ++var141) {
                        if (class54.field992[var141] != null) {
                            class54.field992[var141].field3697 = -1;
                        }
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 254) {
                    int var142 = class85.field1559.method795((byte) 26);
                    class152.method1002(var142, false);
                    class137.field2545[class150.method984(31, class189.field3676++)] = class150.method984(var142, 32767);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 161) {
                    class17.field377 = class85.field1559.method784(126);
                    class94.field1761 = class85.field1559.method809((byte) -111);
                    for (int var143 = class17.field377; class17.field377 + 8 > var143; ++var143) {
                        for (int var144 = class94.field1761; ~(class94.field1761 + 8) < ~var144; ++var144) {
                            if (class60.field1112[class61.field1132][var143][var144] != null) {
                                class60.field1112[class61.field1132][var143][var144] = null;
                                class206.method1345(var143, var144, false);
                            }
                        }
                    }
                    for (class105 var145 = (class105) class57.field1056.method145(0); var145 != null; var145 = (class105) class57.field1056.method152((byte) -128)) {
                        if (~var145.field1921 <= ~class17.field377 && ~var145.field1921 > ~(class17.field377 + 8) && class94.field1761 <= var145.field1932 && ~var145.field1932 > ~(class94.field1761 + 8) && class61.field1132 == var145.field1940) {
                            var145.field1927 = 0;
                        }
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 246) {
                    int var146 = class85.field1559.method827((byte) 120);
                    class106.field1943 = var146;
                    class193.method1275(var146, (byte) 121);
                    class185.method1230(class106.field1943, (byte) 7);
                    for (int var147 = 0; ~var147 > -101; ++var147) {
                        class118.field2201[var147] = true;
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -158) {
                    class21.method143((byte) -70);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 60) {
                    int var148 = class85.field1559.method811(14811);
                    if (~var148 == -65536) {
                        var148 = -1;
                    }
                    class150.method985(true, var148);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 33) {
                    int var149 = class85.field1559.method827((byte) 31);
                    int var150 = class85.field1559.method790((byte) 117);
                    if (~var149 == -65536) {
                        var149 = -1;
                    }
                    class16.method92(var150, var149, -15812);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 169) {
                    class94.field1761 = class85.field1559.method809((byte) -120);
                    class17.field377 = class85.field1559.method809((byte) -123);
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -104) {
                    for (int var151 = 0; class115.field2115 > var151; ++var151) {
                        class93 var152 = class102.method595((byte) 65, var151);
                        if (var152 != null && ~var152.field1739 == -1) {
                            class98.field1845[var151] = 0;
                            class6.field119[var151] = 0;
                        }
                    }
                    class179.method1192((byte) 42);
                    class118.field2202 += 32;
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -212) {
                    int var153 = class85.field1559.method791(-114);
                    class150 var154 = class62.method385((byte) 41, var153);
                    var154.field2808 = 3;
                    var154.field2803 = class4.field79.field3846.method2(34);
                    class64.method404(126, var154);
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -55) {
                    int var155 = class85.field1559.method811(14811);
                    int var156 = class85.field1559.method827((byte) 27);
                    int var157 = class85.field1559.method805((byte) -118);
                    class150 var158 = class62.method385((byte) 41, var157);
                    class86.field1571 = -1;
                    var158.field2790 = (var155 << 16) + var156;
                    return true;
                }
                if (class86.field1571 == 81) {
                    int var159 = class85.field1559.method814(8);
                    int var160 = class85.field1559.method785(true);
                    class150 var161;
                    if (var159 >= 0) {
                        var161 = class62.method385((byte) 41, var159);
                    } else {
                        var161 = null;
                    }
                    if (var161 != null) {
                        for (int var162 = 0; ~var161.field2782.length < ~var162; ++var162) {
                            var161.field2782[var162] = 0;
                            var161.field2870[var162] = 0;
                        }
                    }
                    if (var159 < -70000) {
                        var160 += 32768;
                    }
                    class204.method1323(var160, (byte) 83);
                    int var163 = class85.field1559.method785(true);
                    for (int var164 = 0; var163 > var164; ++var164) {
                        int var165 = class85.field1559.method819((byte) 22);
                        if (var165 == 255) {
                            var165 = class85.field1559.method814(8);
                        }
                        int var166 = class85.field1559.method785(true);
                        if (var161 != null && ~var161.field2782.length < ~var164) {
                            var161.field2782[var164] = var166;
                            var161.field2870[var164] = var165;
                        }
                        class159.method1023(var160, var164, var166 + -1, (byte) -64, var165);
                    }
                    if (var161 != null) {
                        class64.method404(123, var161);
                    }
                    class179.method1192((byte) -109);
                    class137.field2545[class150.method984(31, class189.field3676++)] = class150.method984(var160, 32767);
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -220) {
                    int var167 = class85.field1559.method791(-127);
                    int var168 = class85.field1559.method827((byte) 80);
                    class98.field1845[var168] = var167;
                    if (class6.field119[var168] != var167) {
                        class6.field119[var168] = var167;
                        class63.method389(23708, var168);
                    }
                    class68.field1282[class150.method984(class118.field2202++, 31)] = var168;
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -90) {
                    int var169 = class85.field1559.method805((byte) -117);
                    int var170 = class85.field1559.method811(14811);
                    class150 var171 = class62.method385((byte) 41, var169);
                    if (~var171.field2808 != -2 || var171.field2803 != var170) {
                        var171.field2803 = var170;
                        var171.field2808 = 1;
                        class64.method404(111, var171);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 80) {
                    class44.field827 = class85.field1559.method819((byte) 22);
                    class86.field1571 = -1;
                    class8.field215 = class58.field1078;
                    return true;
                }
                if (~class86.field1571 == -148) {
                    long var172 = class85.field1559.method778(false);
                    class85.field1559.method824((byte) -87);
                    long var174 = class85.field1559.method778(false);
                    long var176 = (long) class85.field1559.method785(true);
                    long var178 = (long) class85.field1559.method773((byte) -128);
                    int var180 = class85.field1559.method819((byte) 22);
                    long var181 = (var176 << 32) + var178;
                    boolean var183 = false;
                    for (int var184 = 0; var184 < 100; ++var184) {
                        if (~class26.field548[var184] == ~var181) {
                            var183 = true;
                            break;
                        }
                    }
                    if (~var180 >= -2) {
                        for (int var185 = 0; var185 < class206.field4052; ++var185) {
                            if (class82.field1513[var185] == var172) {
                                var183 = true;
                                break;
                            }
                        }
                    }
                    if (!var183 && ~class23.field486 == -1) {
                        class26.field548[class115.field2135] = var181;
                        class115.field2135 = (class115.field2135 + 1) % 100;
                        class169 var186 = class117.method739(class81.method493(32, class85.field1559).method1109(-2));
                        if (~var180 != -3 && ~var180 != -4) {
                            if (~var180 == -2) {
                                class112.method690(class165.method1058(0, new class169[] { class199.field3898, class123.method762(111, var172).method1127((byte) -27) }), 9, class123.method762(106, var174).method1127((byte) -126), var186, 0);
                            } else {
                                class112.method690(class123.method762(126, var172).method1127((byte) 7), 9, class123.method762(76, var174).method1127((byte) -125), var186, 0);
                            }
                        } else {
                            class112.method690(class165.method1058(0, new class169[] { class158.field3013, class123.method762(87, var172).method1127((byte) 1) }), 9, class123.method762(124, var174).method1127((byte) -128), var186, 0);
                        }
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -124) {
                    class136.field2543 = class85.field1559.method819((byte) 22);
                    if (class136.field2543 == 1) {
                        class169.field3261 = class85.field1559.method785(true);
                    }
                    if (class136.field2543 >= 2 && class136.field2543 <= 6) {
                        if (class136.field2543 == 2) {
                            class152.field2934 = 64;
                            class67.field1269 = 64;
                        }
                        if (class136.field2543 == 3) {
                            class152.field2934 = 64;
                            class67.field1269 = 0;
                        }
                        if (~class136.field2543 == -5) {
                            class67.field1269 = 128;
                            class152.field2934 = 64;
                        }
                        if (class136.field2543 == 5) {
                            class67.field1269 = 64;
                            class152.field2934 = 0;
                        }
                        if (~class136.field2543 == -7) {
                            class67.field1269 = 64;
                            class152.field2934 = 128;
                        }
                        class136.field2543 = 2;
                        class116.field2146 = class85.field1559.method785(true);
                        class174.field3376 = class85.field1559.method785(true);
                        class152.field2933 = class85.field1559.method819((byte) 22);
                    }
                    if (~class136.field2543 == -11) {
                        class159.field3033 = class85.field1559.method785(true);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -140) {
                    class151.method999(-85);
                    class86.field1571 = -1;
                    return false;
                }
                if (~class86.field1571 == -7) {
                    class179.method1192((byte) -89);
                    int var187 = class85.field1559.method805((byte) -118);
                    int var188 = class85.field1559.method806(1645316808);
                    int var189 = class85.field1559.method819((byte) 22);
                    class128.field2397[var189] = var187;
                    class167.field3195[var189] = var188;
                    class89.field1618[var189] = 1;
                    for (int var190 = 0; var190 < 98; ++var190) {
                        if (~class112.field2037[var190] >= ~var187) {
                            class89.field1618[var189] = var190 + 2;
                        }
                    }
                    class2.field41[class150.method984(class66.field1244++, 31)] = var189;
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -245) {
                    int var191 = class85.field1559.method818(1629612104);
                    int var192 = class85.field1559.method805((byte) -123);
                    class150 var193 = class62.method385((byte) 41, var192);
                    if (~var193.field2836 != ~var191 || var191 == -1) {
                        var193.field2846 = 0;
                        var193.field2836 = var191;
                        var193.field2874 = 0;
                        class64.method404(98, var193);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -121) {
                    int var194 = class85.field1559.method809((byte) -124);
                    int var195 = class85.field1559.method806(1645316808);
                    class169 var196 = class85.field1559.method793((byte) -100);
                    if (~var194 <= -2 && ~var194 >= -9) {
                        if (var196.method1110(class63.field1168, 70)) {
                            var196 = null;
                        }
                        class42.field798[var194 - 1] = var196;
                        class28.field571[var194 + -1] = ~var195 == -1;
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -137) {
                    class179.method1192((byte) 122);
                    class93.field1746 = class85.field1559.method818(1629612104);
                    class86.field1571 = -1;
                    class69.field1298 = class58.field1078;
                    return true;
                }
                if (~class86.field1571 == -205) {
                    int var197 = class85.field1559.method814(8);
                    int var198 = class85.field1559.method827((byte) 39);
                    class150 var199 = class62.method385((byte) 41, var197);
                    if (var199 != null && var199.field2882 == 0) {
                        if (~(-var199.field2770 + var199.field2837) > ~var198) {
                            var198 = var199.field2837 - var199.field2770;
                        }
                        if (var198 < 0) {
                            var198 = 0;
                        }
                        if (var199.field2811 != var198) {
                            var199.field2811 = var198;
                            class64.method404(114, var199);
                        }
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 38) {
                    class206.field4052 = class27.field553 / 8;
                    for (int var200 = 0; class206.field4052 > var200; ++var200) {
                        class82.field1513[var200] = class85.field1559.method778(false);
                        class197.field3874[var200] = class123.method762(82, class82.field1513[var200]);
                    }
                    class86.field1571 = -1;
                    class8.field215 = class58.field1078;
                    return true;
                }
                if (~class86.field1571 == -202) {
                    int var201 = class85.field1559.method809((byte) -121);
                    int var202 = class85.field1559.method809((byte) -119);
                    int var203 = class85.field1559.method809((byte) -112);
                    class61.field1132 = var201 >> 1;
                    class4.field79.method1246(var202, (byte) 55, (1 & var201) == 1, var203);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 141) {
                    if (~class106.field1943 != 0) {
                        class200.method1310(class106.field1943, -7102, 0);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 243) {
                    int var204 = class85.field1559.method785(true);
                    int var205 = class85.field1559.method819((byte) 22);
                    int var206 = class85.field1559.method785(true);
                    class187.method1232(var206, (byte) 85, var205, var204);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 96) {
                    for (int var207 = 0; ~class6.field119.length < ~var207; ++var207) {
                        if (class98.field1845[var207] != class6.field119[var207]) {
                            class6.field119[var207] = class98.field1845[var207];
                            class63.method389(23708, var207);
                            class68.field1282[class150.method984(class118.field2202++, 31)] = var207;
                        }
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -165) {
                    int var208 = class85.field1559.method819((byte) 22);
                    if (class85.field1559.method819((byte) 22) == 0) {
                        class91.field1658[var208] = new class107();
                    } else {
                        --class85.field1559.field2346;
                        class91.field1658[var208] = new class107(class85.field1559);
                    }
                    class86.field1571 = -1;
                    class143.field2670 = class58.field1078;
                    return true;
                }
                if (~class86.field1571 == -216) {
                    class154.field2964 = 0;
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 66) {
                    int var209 = class85.field1559.method780(-7052);
                    boolean var210 = class85.field1559.method806(1645316808) == 1;
                    class150 var211 = class62.method385((byte) 41, var209);
                    if (!var211.field2844 != !var210) {
                        var211.field2844 = var210;
                        class64.method404(125, var211);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -177) {
                    class169 var212 = class85.field1559.method793((byte) -91);
                    Object[] var213 = new Object[var212.method1134(0) + 1];
                    for (int var214 = -1 + var212.method1134(0); var214 >= 0; --var214) {
                        if (var212.method1128(255, var214) != 115) {
                            var213[var214 - -1] = new Integer(class85.field1559.method814(8));
                        } else {
                            var213[var214 + 1] = class85.field1559.method793((byte) -61);
                        }
                    }
                    var213[0] = new Integer(class85.field1559.method814(8));
                    class200 var215 = new class200();
                    var215.field3911 = var213;
                    class172.method1147(-19955, var215);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 1) {
                    int var216 = class85.field1559.method780(-7052);
                    int var217 = class85.field1559.method795((byte) 26);
                    if (~var217 == -65536) {
                        var217 = -1;
                    }
                    int var218 = class85.field1559.method780(-7052);
                    int var219 = class85.field1559.method785(true);
                    if (var219 == 65535) {
                        var219 = -1;
                    }
                    for (int var220 = var219; var220 <= var217; ++var220) {
                        long var221 = ((long) var218 << 32) + (long) var220;
                        class182 var223 = class204.field4003.method1045(var221, (byte) -77);
                        if (var223 != null) {
                            var223.method1213(9104);
                        }
                        class204.field4003.method1044(var221, true, new class6(var216));
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -166) {
                    int var224 = class85.field1559.method814(8);
                    int var225 = class85.field1559.method795((byte) 26);
                    class150 var226 = class62.method385((byte) 41, var224);
                    if (var226.field2808 != 2 || var226.field2803 != var225) {
                        var226.field2808 = 2;
                        var226.field2803 = var225;
                        class64.method404(94, var226);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 200) {
                    class6.method37(class163.field3134, class85.field1559, class27.field553, (byte) 71);
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 214) {
                    class17.field406 = true;
                    class51.field924 = class85.field1559.method819((byte) 22);
                    class196.field3851 = class85.field1559.method819((byte) 22);
                    class175.field3418 = class85.field1559.method785(true);
                    class155.field2977 = class85.field1559.method819((byte) 22);
                    class112.field2050 = class85.field1559.method819((byte) 22);
                    if (~class112.field2050 <= -101) {
                        int var227 = class51.field924 * 128 + 64;
                        int var228 = class196.field3851 * 128 + 64;
                        int var229 = class183.method1215(var227, class61.field1132, var228, 0) - class175.field3418;
                        int var230 = -class182.field3559 + var229;
                        int var231 = var228 - class138.field2569;
                        int var232 = var227 - class7.field159;
                        int var233 = (int) Math.sqrt((double) (var231 * var231 + var232 * var232));
                        class148.field2743 = 2047 & (int) (325.949D * Math.atan2((double) var230, (double) var233));
                        class177.field3468 = 2047 & (int) (-325.949D * Math.atan2((double) var232, (double) var231));
                        if (~class148.field2743 > -129) {
                            class148.field2743 = 128;
                        }
                        if (~class148.field2743 < -384) {
                            class148.field2743 = 383;
                        }
                    }
                    class86.field1571 = -1;
                    return true;
                }
                if (class86.field1571 == 46) {
                    int var234 = class85.field1559.method819((byte) 22);
                    int var235 = class85.field1559.method791(-37);
                    int var236 = class85.field1559.method795((byte) 26);
                    class80 var237 = (class80) class202.field3948.method1045((long) var235, (byte) -77);
                    if (var237 != null) {
                        class15.method88(~var237.field1475 != ~var236, 6, var237);
                    }
                    class65.method411(var234, var236, -11368, var235);
                    class86.field1571 = -1;
                    return true;
                }
                if (~class86.field1571 == -228) {
                    int var238 = class85.field1559.method785(true);
                    int var239 = class85.field1559.method805((byte) -126);
                    int var240 = (var238 & 31746) >> 10;
                    int var241 = var238 & 31;
                    int var242 = var238 >> 5 & 31;
                    class150 var243 = class62.method385((byte) 41, var239);
                    int var244 = (var242 << 11) + ((var240 << 19) - -(var241 << 3));
                    if (var243.field2847 != var244) {
                        var243.field2847 = var244;
                        class64.method404(125, var243);
                    }
                    class86.field1571 = -1;
                    return true;
                }
                class21.method142(124, "T1 - " + class86.field1571 + "," + class61.field1127 + "," + class77.field1450 + " - " + class27.field553, (Throwable) null);
                class151.method999(123);
            } catch (IOException var248) {
                class132.method863((byte) -128);
            } catch (Exception var249) {
                String var246 = "T2 - " + class86.field1571 + "," + class61.field1127 + "," + class77.field1450 + " - " + class27.field553 + "," + (class179.field3489 - -class4.field79.field3734[0]) + "," + (class4.field79.field3729[0] + class191.field3761) + " - ";
                for (int var247 = 0; ~var247 > ~class27.field553 && ~var247 > -51; ++var247) {
                    var246 = var246 + class85.field1559.field2325[var247] + ",";
                }
                class21.method142(92, var246, var249);
                class151.method999(-97);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "(I)V")
    public static void method1289(int arg0) {
        field3817 = null;
        field3835 = null;
        field3822 = null;
        field3824 = null;
        field3827 = null;
        if (arg0 != 0) {
            field3819 = null;
        }
        field3837 = null;
        field3831 = null;
        field3832 = null;
        field3820 = null;
        field3819 = null;
    }
}
