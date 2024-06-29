import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class597 {

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public int field8464;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "S")
    public short field8447;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public int field8461;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Z")
    public boolean field8459;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field8450;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public int field8451;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "S")
    public short field8457;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "S")
    public short field8455;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public int field8452;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "B")
    public byte field8463;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Ljo;")
    public static class307 field8454 = new class307("", 16);

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lor;")
    public static class594 field8462 = new class594();

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "[Lpba;")
    public static class304[] field8465 = new class304[2048];

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "Liea;")
    public static class443 field8466 = new class443(8);

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "[Z")
    public static boolean[] field8468 = new boolean[8];

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Lrl;")
    public static class672 field8467 = new class672(45, 8);

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field8449;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field8453;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field8456;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "[Lf;")
    public static class702[] field8469;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(FIIFF)F")
    public static final float method3479(float arg0, int arg1, int arg2, float arg3, float arg4) {
        field8448++;
        float[] var5 = class651.field9121[arg2];
        if (arg1 != 65535) {
            method3481(33);
        }
        return var5[2] * arg3 + var5[0] * arg4 + var5[1] * arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZZB)V")
    public static final void method3480(boolean arg0, boolean arg1, byte arg2) {
        field8449++;
        if (arg1) {
            class473.field7015++;
            class181.method1476(126);
        }
        if (arg0) {
            class659.field9186++;
            class221.method1635(6);
        }
        int var3 = 100 / ((-arg2 - 22) / 34);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static final void method3481(int arg0) {
        field8456++;
        if (class157.field2688 > 1) {
            class158.field2701 = class79.field997;
            class157.field2688--;
        }
        if (class628.field8864) {
            class628.field8864 = false;
            class125.method1104((byte) 28);
            return;
        }
        if (!class453.field6808) {
            class315.method2151((byte) -116);
        }
        for (int var1 = 0; var1 < 100 && class587.method3435((byte) -87); var1++) {
        }
        if (class682.field9564 != 10) {
            return;
        }
        while (class545.method3294(-26978)) {
            class165 var2 = class271.method1917(class420.field6424, (byte) -102, class407.field6278);
            var2.field2776.method65(0, -77);
            int var3 = var2.field2776.field57;
            class644.method3731(0, var2.field2776);
            var2.field2776.method24(var2.field2776.field57 - var3, (byte) 125);
            class642.method3726(-684096285, var2);
        }
        if (class612.field8700 == null) {
            if (class112.method1033(-11752) >= class117.field1823) {
                class612.field8700 = class217.field3566.method1507((byte) -125, class221.field3591.field6959);
            }
        } else if (class612.field8700.field8137 != -1) {
            class165 var4 = class271.method1917(class420.field6424, (byte) -98, class207.field3457);
            var4.field2776.method25(true, class612.field8700.field8137);
            class642.method3726(-684096285, var4);
            class612.field8700 = null;
            class117.field1823 = class112.method1033(-11752) + 30000L;
        }
        class623 var5 = (class623) class655.field9149.method3465((byte) -76);
        if (var5 != null || class304.field4765 < (class112.method1033(-11752) - 2000L)) {
            class165 var6 = null;
            int var7 = 0;
            for (class623 var8 = (class623) class260.field4243.method3465((byte) 112); var8 != null && (var6 == null || (var6.field2776.field57 - var7) < 240); var8 = (class623) class260.field4243.method3469(0)) {
                var8.method707((byte) -15);
                int var9 = var8.method2596(true);
                if (var9 < -1) {
                    var9 = -1;
                } else if (var9 > 65534) {
                    var9 = 65534;
                }
                int var10 = var8.method2600(25);
                if (var10 < -1) {
                    var10 = -1;
                } else if (var10 > 65534) {
                    var10 = 65534;
                }
                if (class143.field2402 != var10 || class695.field9738 != var9) {
                    if (var6 == null) {
                        class116.field1807++;
                        var6 = class271.method1917(class420.field6424, (byte) -62, class56.field731);
                        var6.field2776.method65(0, -77);
                        var7 = var6.field2776.field57;
                    }
                    int var11 = var10 - class143.field2402;
                    class143.field2402 = var10;
                    int var12 = var9 - class695.field9738;
                    class695.field9738 = var9;
                    int var13 = (int) ((var8.method2598(16209) - class304.field4765) / 20L);
                    if (var13 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                        var12 += 32;
                        var11 += 32;
                        var6.field2776.method25(true, (var11 << 6) + ((var13 << 12) + var12));
                    } else if (var13 < 32 && var11 >= -128 && var11 <= 127 && var12 >= -128 && var12 <= 127) {
                        var11 += 128;
                        var12 += 128;
                        var6.field2776.method65(var13 + 128, -77);
                        var6.field2776.method25(true, (var11 << 8) + var12);
                    } else if (var13 >= 32) {
                        var6.field2776.method25(true, var13 + 57344);
                        if (var10 == 1 || var9 == -1) {
                            var6.field2776.method82(false, Integer.MIN_VALUE);
                        } else {
                            var6.field2776.method82(false, var10 | var9 << 16);
                        }
                    } else {
                        var6.field2776.method65(var13 + 192, -77);
                        if (var10 == 1 || var9 == -1) {
                            var6.field2776.method82(false, Integer.MIN_VALUE);
                        } else {
                            var6.field2776.method82(false, var10 | var9 << 16);
                        }
                    }
                    class304.field4765 = var8.method2598(16209);
                }
            }
            if (var6 != null) {
                var6.field2776.method24(var6.field2776.field57 - var7, (byte) 39);
                class642.method3726(-684096285, var6);
            }
        }
        if (var5 != null) {
            long var14 = (var5.method2598(16209) - class181.field3050) / 50L;
            class181.field3050 = var5.method2598(16209);
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var16 = var5.method2596(true);
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            int var17 = var5.method2600(25);
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            byte var18 = 0;
            if (var5.method2594((byte) -124) == 2) {
                var18 = 1;
            }
            class99.field1626++;
            int var19 = (int) var14;
            class165 var20 = class271.method1917(class420.field6424, (byte) -99, class435.field6621);
            var20.field2776.method56(var19 | var18 << 15, true);
            var20.field2776.method59((byte) 81, var16 << 16 | var17);
            class642.method3726(-684096285, var20);
        }
        if (class496.field7236 > 0) {
            class218.field3574++;
            class165 var21 = class271.method1917(class420.field6424, (byte) -76, class25.field415);
            var21.field2776.method65(class496.field7236 * 3, -77);
            for (int var22 = 0; var22 < class496.field7236; var22++) {
                class291 var23 = class307.field4837[var22];
                long var24 = (var23.method2054(49) - class239.field3783) / 50L;
                if (var24 > 65535L) {
                    var24 = 65535L;
                }
                class239.field3783 = var23.method2054(12);
                var21.field2776.method65(var23.method2053(4006), -77);
                var21.field2776.method25(true, (int) var24);
            }
            class642.method3726(-684096285, var21);
        }
        if (class442.field6734 > 0) {
            class442.field6734--;
        }
        if (class328.field5085 && class442.field6734 <= 0) {
            class575.field8203++;
            class442.field6734 = 20;
            class328.field5085 = false;
            class165 var26 = class271.method1917(class420.field6424, (byte) -76, class634.field8900);
            var26.field2776.method51(31557, (int) class37.field514 >> 3);
            var26.field2776.method56((int) class162.field2746 >> 3, true);
            class642.method3726(-684096285, var26);
        }
        if (class146.field2456 != class437.field6669) {
            class188.field3143++;
            class146.field2456 = class437.field6669;
            class165 var27 = class271.method1917(class420.field6424, (byte) -115, class373.field5843);
            var27.field2776.method65(class437.field6669 ? 1 : 0, -77);
            class642.method3726(-684096285, var27);
        }
        if (!class644.field9057) {
            class38.field521++;
            class165 var28 = class271.method1917(class420.field6424, (byte) -103, class301.field4701);
            var28.field2776.method65(0, -77);
            int var29 = var28.field2776.field57;
            class6 var30 = new class6(class641.method3718(false));
            class17.field282.method2130(false, var30);
            var28.field2776.method80(255, var30.field96, var30.field57, 0);
            var28.field2776.method24(var28.field2776.field57 - var29, (byte) -4);
            class642.method3726(-684096285, var28);
            class644.field9057 = true;
        }
        if (class454.field6818 != null) {
            if (class126.field2062 == 2) {
                class244.method1742(-127);
            } else if (class126.field2062 == 3) {
                class661.method3794(-5922);
            }
        }
        if (class623.field8796) {
            class623.field8796 = false;
        } else {
            class254.field4045 /= 2.0F;
        }
        if (class497.field7254) {
            class497.field7254 = false;
        } else {
            class574.field8188 /= 2.0F;
        }
        class305.method2118(-1);
        if (class682.field9564 != 10) {
            return;
        }
        class520.method3138(false);
        class255.method1807((byte) 110);
        class326.method2198(-109);
        class622.field8790++;
        if (class622.field8790 > 750) {
            class125.method1104((byte) 28);
            return;
        }
        class530.method3209(-3140);
        class571.method3367(0);
        class653.method3763((byte) -97);
        for (int var31 = class539.field7869.method3751((byte) 31, true); var31 != -1; var31 = class539.field7869.method3751((byte) 63, false)) {
            class107.method1008(12112, var31);
            class656.field9160[class453.method2846(31, class403.field6230++)] = var31;
        }
        for (class413 var32 = class175.method1422(-3); var32 != null; var32 = class175.method1422(-3)) {
            int var33 = var32.method2629(false);
            int var34 = var32.method2637(true);
            if (var33 == 1) {
                class52.field702[var34] = var32.field6337;
                class40.field565 |= class691.field9687[var34];
                class277.field4484[class453.method2846(class282.field4517++, 31)] = var34;
            } else if (var33 == 2) {
                class248.field3955[var34] = var32.field6339;
                class588.field8349[class453.method2846(class409.field6304++, 31)] = var34;
            } else if (var33 == 3) {
                class665 var35 = class326.method2197(false, var34);
                if (!var32.field6339.equals(var35.field9427)) {
                    var35.field9427 = var32.field6339;
                    class362.method2415(-120, var35);
                }
            } else if (var33 == 4) {
                class665 var54 = class326.method2197(false, var34);
                int var55 = var32.field6337;
                int var56 = var32.field6333;
                int var57 = var32.field6340;
                if (var54.field9414 != var55 || var54.field9307 != var56 || var54.field9292 != var57) {
                    var54.field9307 = var56;
                    var54.field9292 = var57;
                    var54.field9414 = var55;
                    class362.method2415(-127, var54);
                }
            } else if (var33 == 5) {
                class665 var36 = class326.method2197(false, var34);
                if (var32.field6337 != var36.field9376 || var32.field6337 == -1) {
                    var36.field9376 = var32.field6337;
                    var36.field9387 = 0;
                    var36.field9299 = 0;
                    var36.field9383 = 1;
                    class428 var37 = var36.field9376 == -1 ? null : class636.field8942.method2872((byte) 11, var36.field9376);
                    if (var37 != null) {
                        class204.method1577(var36.field9387, var37, -81);
                    }
                    class362.method2415(-122, var36);
                }
            } else if (var33 == 6) {
                int var48 = var32.field6337;
                int var49 = (var48 & 0x7F40) >> 10;
                int var50 = (var48 & 0x3F6) >> 5;
                int var51 = var48 & 0x1F;
                int var52 = (var50 << 11) + (var49 << 19) + (var51 << 3);
                class665 var53 = class326.method2197(false, var34);
                if (var53.field9397 != var52) {
                    var53.field9397 = var52;
                    class362.method2415(-119, var53);
                }
            } else if (var33 == 7) {
                class665 var38 = class326.method2197(false, var34);
                boolean var39 = var32.field6337 == 1;
                if (var38.field9363 != var39) {
                    var38.field9363 = var39;
                    class362.method2415(-126, var38);
                }
            } else if (var33 == 8) {
                class665 var40 = class326.method2197(false, var34);
                if (var32.field6337 != var40.field9350 || var32.field6333 != var40.field9381 || var32.field6340 != var40.field9272) {
                    var40.field9381 = var32.field6333;
                    var40.field9350 = var32.field6337;
                    var40.field9272 = var32.field6340;
                    if (var40.field9354 != -1) {
                        if (var40.field9297 > 0) {
                            var40.field9272 = var40.field9272 * 32 / var40.field9297;
                        } else if (var40.field9264 > 0) {
                            var40.field9272 = var40.field9272 * 32 / var40.field9264;
                        }
                    }
                    class362.method2415(-126, var40);
                }
            } else if (var33 == 9) {
                class665 var41 = class326.method2197(false, var34);
                if (var32.field6337 != var41.field9354 || var32.field6333 != var41.field9341) {
                    var41.field9341 = var32.field6333;
                    var41.field9354 = var32.field6337;
                    class362.method2415(-123, var41);
                }
            } else if (var33 == 10) {
                class665 var47 = class326.method2197(false, var34);
                if (var32.field6337 != var47.field9323 || var32.field6333 != var47.field9365 || var32.field6340 != var47.field9367) {
                    var47.field9367 = var32.field6340;
                    var47.field9365 = var32.field6333;
                    var47.field9323 = var32.field6337;
                    class362.method2415(-119, var47);
                }
            } else if (var33 == 11) {
                class665 var46 = class326.method2197(false, var34);
                var46.field9402 = var46.field9415 = var32.field6333;
                var46.field9270 = 0;
                var46.field9301 = var46.field9288 = var32.field6337;
                var46.field9348 = 0;
                class362.method2415(-127, var46);
            } else if (var33 == 12) {
                class665 var42 = class326.method2197(false, var34);
                int var43 = var32.field6337;
                if (var42 != null && var42.field9309 == 0) {
                    if (var43 > var42.field9260 - var42.field9282) {
                        var43 = var42.field9260 - var42.field9282;
                    }
                    if (var43 < 0) {
                        var43 = 0;
                    }
                    if (var42.field9394 != var43) {
                        var42.field9394 = var43;
                        class362.method2415(-122, var42);
                    }
                }
            } else if (var33 == 14) {
                class665 var45 = class326.method2197(false, var34);
                var45.field9278 = var32.field6337;
            } else if (var33 == 15) {
                class43.field599 = var32.field6337;
                class353.field5615 = true;
                class473.field7005 = var32.field6333;
            } else if (var33 == 16) {
                class665 var44 = class326.method2197(false, var34);
                var44.field9304 = var32.field6337;
            }
        }
        class116.field1805++;
        if (class424.field6447 != 0) {
            class165.field2772 += 20;
            if (class165.field2772 >= 400) {
                class424.field6447 = 0;
            }
        }
        if (class71.field892 != null) {
            class403.field6218++;
            if (class403.field6218 >= 15) {
                class362.method2415(-121, class71.field892);
                class71.field892 = null;
            }
        }
        class672.field9479 = false;
        class260.field4160 = null;
        class602.field8563 = null;
        if (arg0 >= -109) {
            method3479(-1.3282088F, -88, 7, 1.0823555F, 0.107020564F);
        }
        client.field4445 = false;
        class347.method2346(-1, null, 0, -1);
        class155.method1290(null, -1, -1, (byte) 111);
        if (!class145.field2450) {
            class250.field4003 = -1;
        }
        class407.method2608(0);
        class79.field997++;
        if (class38.field526) {
            class441.field6721++;
            class165 var58 = class271.method1917(class420.field6424, (byte) -48, class70.field884);
            var58.field2776.method59((byte) -78, class590.field8386 << 28 | class416.field6369 << 14 | class549.field7988);
            class642.method3726(-684096285, var58);
            class38.field526 = false;
        }
        while (true) {
            class438 var59;
            class665 var60;
            class665 var61;
            do {
                var59 = (class438) class610.field8678.method3471(0);
                if (var59 == null) {
                    while (true) {
                        class438 var62;
                        class665 var63;
                        class665 var64;
                        do {
                            var62 = (class438) class97.field1548.method3471(0);
                            if (var62 == null) {
                                while (true) {
                                    class438 var65;
                                    class665 var66;
                                    class665 var67;
                                    do {
                                        var65 = (class438) class539.field7865.method3471(0);
                                        if (var65 == null) {
                                            if (class260.field4160 == null) {
                                                class301.field4696 = 0;
                                            }
                                            if (class573.field8182 != null) {
                                                class262.method1863(-92);
                                            }
                                            if (class139.field2342 > 0 && class83.field1024.method1515(82, 56) && class83.field1024.method1515(81, 122) && class259.field4142 != 0) {
                                                int var68 = class567.field8141.field9695 - class259.field4142;
                                                if (var68 < 0) {
                                                    var68 = 0;
                                                } else if (var68 > 3) {
                                                    var68 = 3;
                                                }
                                                class432.method2747(class567.field8141.field4264[0] + class612.field8702, class626.field8855 - -class567.field8141.field4265[0], var68, 76);
                                            }
                                            class310.method2125((byte) -91);
                                            for (int var69 = 0; var69 < 5; var69++) {
                                                int var10002 = class97.field1542[var69]++;
                                            }
                                            if (class40.field565 && class112.method1033(-11752) - 60000L > class488.field7153) {
                                                class651.method3757(true);
                                            }
                                            for (class126 var70 = (class126) class397.field6156.method2754((byte) 114); var70 != null; var70 = (class126) class397.field6156.method2759(1486415172)) {
                                                if ((class112.method1033(-11752) / 1000L - 5L) > ((long) var70.field2060)) {
                                                    if (var70.field2065 > 0) {
                                                        class247.method1763("", "", var70.field2061 + class122.field1991.method1091(class135.field2206, 1), false, 0, 5, "");
                                                    }
                                                    if (var70.field2065 == 0) {
                                                        class247.method1763("", "", var70.field2061 + class122.field1992.method1091(class135.field2206, 1), false, 0, 5, "");
                                                    }
                                                    var70.method2648((byte) -25);
                                                }
                                            }
                                            class660.field9195++;
                                            if (class660.field9195 > 500) {
                                                class660.field9195 = 0;
                                                int var71 = (int) (Math.random() * 8.0D);
                                                if ((var71 & 0x2) == 2) {
                                                    class529.field7711 += class192.field3173;
                                                }
                                                if ((var71 & 0x1) == 1) {
                                                    class132.field2156 += class213.field3538;
                                                }
                                                if ((var71 & 0x4) == 4) {
                                                    class373.field5837 += class425.field6467;
                                                }
                                            }
                                            if (class132.field2156 < -50) {
                                                class213.field3538 = 2;
                                            }
                                            if (class529.field7711 < -55) {
                                                class192.field3173 = 2;
                                            }
                                            if (class132.field2156 > 50) {
                                                class213.field3538 = -2;
                                            }
                                            if (class373.field5837 < -40) {
                                                class425.field6467 = 1;
                                            }
                                            if (class529.field7711 > 55) {
                                                class192.field3173 = -2;
                                            }
                                            if (class373.field5837 > 40) {
                                                class425.field6467 = -1;
                                            }
                                            class476.field7056++;
                                            if (class476.field7056 > 500) {
                                                class476.field7056 = 0;
                                                int var72 = (int) (Math.random() * 8.0D);
                                                if ((var72 & 0x1) == 1) {
                                                    class44.field616 += class51.field685;
                                                }
                                                if ((var72 & 0x2) == 2) {
                                                    class64.field820 += class320.field5014;
                                                }
                                            }
                                            if (class44.field616 < -60) {
                                                class51.field685 = 2;
                                            }
                                            if (class44.field616 > 60) {
                                                class51.field685 = -2;
                                            }
                                            if (class64.field820 < -20) {
                                                class320.field5014 = 1;
                                            }
                                            class159.field2722++;
                                            if (class64.field820 > 10) {
                                                class320.field5014 = -1;
                                            }
                                            if (class159.field2722 > 50) {
                                                class162.field2743++;
                                                class165 var73 = class271.method1917(class420.field6424, (byte) -114, class470.field6968);
                                                class642.method3726(-684096285, var73);
                                            }
                                            if (class657.field9163) {
                                                class234.method1697(-21944);
                                                class657.field9163 = false;
                                            }
                                            try {
                                                class132.method1151(0);
                                                return;
                                            } catch (IOException var74) {
                                                class125.method1104((byte) 28);
                                                return;
                                            }
                                        }
                                        var66 = var65.field6677;
                                        if (var66.field9380 < 0) {
                                            break;
                                        }
                                        var67 = class326.method2197(false, var66.field9401);
                                    } while (var67 == null || var67.field9296 == null || var67.field9296.length <= var66.field9380 || var67.field9296[var66.field9380] != var66);
                                    class142.method1201(var65);
                                }
                            }
                            var63 = var62.field6677;
                            if (var63.field9380 < 0) {
                                break;
                            }
                            var64 = class326.method2197(false, var63.field9401);
                        } while (var64 == null || var64.field9296 == null || var64.field9296.length <= var63.field9380 || var64.field9296[var63.field9380] != var63);
                        class142.method1201(var62);
                    }
                }
                var60 = var59.field6677;
                if (var60.field9380 < 0) {
                    break;
                }
                var61 = class326.method2197(false, var60.field9401);
            } while (var61 == null || var61.field9296 == null || var60.field9380 >= var61.field9296.length || var61.field9296[var60.field9380] != var60);
            class142.method1201(var59);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILri;)Lufa;")
    public static final class632 method3482(int arg0, int arg1, class97 arg2) {
        if (arg0 != 32) {
            field8469 = null;
        }
        field8453++;
        byte[] var3 = arg2.method952(124, arg1);
        return var3 == null ? null : new class632(var3);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    public static void method3483(boolean arg0) {
        field8462 = null;
        field8469 = null;
        if (arg0) {
            field8468 = null;
        }
        field8466 = null;
        field8468 = null;
        field8467 = null;
        field8465 = null;
        field8454 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII)V")
    public static final void method3484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8458++;
        int var6 = arg5 - arg4;
        int var7 = arg3 - arg0;
        if (var6 == 0) {
            if (var7 != 0) {
                class516.method3124(arg2 ^ 0xC424F9F4, arg4, arg1, arg0, arg3);
            }
        } else if (var7 == 0) {
            class511.method3100(arg4, -27, arg0, arg5, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (arg4 < class576.field8218) {
                var10 = var9 + (class576.field8218 * var8 >> 12);
                var11 = class576.field8218;
            } else if (arg4 <= class340.field5510) {
                var11 = arg4;
                var10 = arg0;
            } else {
                var10 = (class340.field5510 * var8 >> 12) + var9;
                var11 = class340.field5510;
            }
            int var12;
            int var13;
            if (class576.field8218 > arg5) {
                var12 = class576.field8218;
                var13 = var9 + (class576.field8218 * var8 >> 12);
            } else if (arg5 > class340.field5510) {
                var12 = class340.field5510;
                var13 = (class340.field5510 * var8 >> 12) + var9;
            } else {
                var12 = arg5;
                var13 = arg3;
            }
            if (var13 < class545.field7931) {
                var12 = (class545.field7931 - var9 << 12) / var8;
                var13 = class545.field7931;
            } else if (var13 > class585.field8331) {
                var13 = class585.field8331;
                var12 = (class585.field8331 - var9 << 12) / var8;
            }
            if (class545.field7931 > var10) {
                var11 = (class545.field7931 - var9 << 12) / var8;
                var10 = class545.field7931;
            } else if (var10 > class585.field8331) {
                var10 = class585.field8331;
                var11 = (class585.field8331 - var9 << 12) / var8;
            }
            if (arg2 != -1004229456) {
                method3482(-20, -106, null);
            }
            class165.method1336(var13, var10, var12, 105, var11, arg1);
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field8464 = arg0;
        this.field8447 = (short) arg4;
        this.field8461 = arg11;
        this.field8459 = arg10;
        this.field8450 = arg1;
        this.field8451 = arg3;
        this.field8457 = (short) arg6;
        this.field8455 = (short) arg5;
        this.field8452 = arg2;
        this.field8463 = (byte) arg8;
    }
}
