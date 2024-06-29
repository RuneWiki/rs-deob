import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class73 extends class93 {

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    private int field1536 = 1024;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "I")
    private int field1543 = 2048;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
    private int field1547 = 3072;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    public static int field1539 = -1;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "Ljd;")
    public static class92 field1545 = class202.method1325((byte) 90, "null");

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field1541 = 0;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "Loe;")
    public static class139 field1548 = new class139(64);

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!hc", name = "jb", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "Lnh;")
    public static class133 field1538;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "[Lsc;")
    public static class173[] field1544;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg2 == 0) {
            ++field1552;
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field1885 = ~arg1.method443(arg2 + 255) == -2;
                    }
                } else {
                    this.field1547 = arg1.method442(arg2 + -21351);
                }
            } else {
                this.field1536 = arg1.method442(-21351);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field1551;
        int[] var3 = super.field1887.method916(arg0, -98);
        if (super.field1887.field2757) {
            int[] var4 = this.method648((byte) 62, arg0, 0);
            for (int var5 = 0; ~class150.field2985 < ~var5; ++var5) {
                var3[var5] = this.field1536 - -(var4[var5] * this.field1543 >> 12);
            }
        }
        int var6 = -12 % ((arg1 - 67) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
    public static final void method510(int arg0) {
        ++field1546;
        if (client.field690 > 1) {
            --client.field690;
        }
        if (class140.field2812 > 0) {
            --class140.field2812;
        }
        if (class12.field372) {
            class12.field372 = false;
            class209.method1358(false);
        } else {
            for (int var1 = 0; var1 < 100 && class9.method58(-20); ++var1) {
            }
            if (class159.field3169 == 30) {
                class34.method224(113, (byte) -43, class99.field2000);
                Object var2 = class127.field2570.field290;
                synchronized (class127.field2570.field290) {
                    if (!class77.field1607) {
                        class127.field2570.field295 = 0;
                    } else if (~class74.field1559 != -1 || class127.field2570.field295 >= 40) {
                        ++class168.field3282;
                        class99.field2000.method405(64, 7);
                        class99.field2000.method428(0, 111);
                        int var3 = class99.field2000.field1472;
                        int var4 = 0;
                        for (int var5 = 0; var5 < class127.field2570.field295 && ~(-var3 + class99.field2000.field1472) > -241; ++var5) {
                            ++var4;
                            int var6 = class127.field2570.field299[var5];
                            if (var6 >= 0) {
                                if (var6 > 502) {
                                    var6 = 502;
                                }
                            } else {
                                var6 = 0;
                            }
                            int var7 = class127.field2570.field300[var5];
                            if (var7 >= 0) {
                                if (~var7 < -765) {
                                    var7 = 764;
                                }
                            } else {
                                var7 = 0;
                            }
                            int var8 = var6 * 765 + var7;
                            if (~class127.field2570.field299[var5] == 0 && ~class127.field2570.field300[var5] == 0) {
                                var8 = 524287;
                                var6 = -1;
                                var7 = -1;
                            }
                            if (class205.field3957 == var7 && ~class148.field2939 == ~var6) {
                                if (class9.field333 < 2047) {
                                    ++class9.field333;
                                }
                            } else {
                                int var9 = -class148.field2939 + var6;
                                class148.field2939 = var6;
                                int var10 = -class205.field3957 + var7;
                                class205.field3957 = var7;
                                if (~class9.field333 > -9 && var10 >= -32 && var10 <= 31 && var9 >= -32 && ~var9 >= -32) {
                                    var9 += 32;
                                    var10 += 32;
                                    class99.field2000.method458((class9.field333 << 12) + (var10 << 6) + var9, 9345);
                                    class9.field333 = 0;
                                } else if (class9.field333 < 8) {
                                    class99.field2000.method439(8388608 - -(class9.field333 << 19) - -var8, (byte) 122);
                                    class9.field333 = 0;
                                } else {
                                    class99.field2000.method446((class9.field333 << 19) + -1073741824 + var8, -26751);
                                    class9.field333 = 0;
                                }
                            }
                        }
                        class99.field2000.method421((byte) 78, -var3 + class99.field2000.field1472);
                        if (var4 >= class127.field2570.field295) {
                            class127.field2570.field295 = 0;
                        } else {
                            class127.field2570.field295 -= var4;
                            for (int var11 = 0; ~var11 > ~class127.field2570.field295; ++var11) {
                                class127.field2570.field300[var11] = class127.field2570.field300[var11 - -var4];
                                class127.field2570.field299[var11] = class127.field2570.field299[var4 + var11];
                            }
                        }
                    }
                }
                if (class74.field1559 != 0) {
                    ++class142.field2826;
                    int var12 = class81.field1645;
                    int var13 = class31.field705;
                    if (var13 < 0) {
                        var13 = 0;
                    } else if (var13 > 764) {
                        var13 = 764;
                    }
                    if (var12 >= 0) {
                        if (~var12 < -503) {
                            var12 = 502;
                        }
                    } else {
                        var12 = 0;
                    }
                    long var14 = (class88.field1738 - class124.field2518) / 50L;
                    class124.field2518 = class88.field1738;
                    if (~var14 < -4096L) {
                        var14 = 4095L;
                    }
                    int var16 = (int) var14;
                    byte var17 = 0;
                    if (~class74.field1559 == -3) {
                        var17 = 1;
                    }
                    int var18 = var12 * 765 + var13;
                    class99.field2000.method405(21, 7);
                    class99.field2000.method446((var16 << 20) - (-(var17 << 19) - var18), -26751);
                }
                if (class16.field445[96] || class16.field445[97] || class16.field445[98] || class16.field445[99]) {
                    class114.field2298 = true;
                }
                if (~class129.field2598 < -1) {
                    --class129.field2598;
                }
                if (class114.field2298 && ~class129.field2598 >= -1) {
                    ++class49.field1066;
                    class114.field2298 = false;
                    class129.field2598 = 20;
                    class99.field2000.method405(245, 7);
                    class99.field2000.method450(class129.field2602, (byte) -95);
                    class99.field2000.method464(1361896040, class9.field327);
                }
                if (class207.field3976 && !class89.field1749) {
                    ++class7.field311;
                    class89.field1749 = true;
                    class99.field2000.method405(112, 7);
                    class99.field2000.method428(1, 105);
                }
                if (!class207.field3976 && class89.field1749) {
                    class89.field1749 = false;
                    class99.field2000.method405(112, 7);
                    ++class7.field311;
                    class99.field2000.method428(0, 105);
                }
                class164.method1056(-26019);
                if (~class159.field3169 == -31) {
                    class9.method64(false);
                    class43.method269(-100);
                    ++class119.field2415;
                    if (~class119.field2415 < -751) {
                        class209.method1358(false);
                    } else {
                        class77.method528(true);
                        class210.method1368(32);
                        class18.method106(true);
                        ++class76.field1588;
                        if (field1540 != 0) {
                            class205.field3946 += 20;
                            if (class205.field3946 >= 400) {
                                field1540 = 0;
                            }
                        }
                        if (class49.field1075 != null) {
                            ++class65.field1317;
                            if (~class65.field1317 <= -16) {
                                class3.method21(26702, class49.field1075);
                                class49.field1075 = null;
                            }
                        }
                        if (class115.field2319 != null) {
                            class3.method21(26702, class115.field2319);
                            if (class113.field2276 + 5 < class29.field641 || ~class29.field641 > ~(class113.field2276 + -5) || class192.field3756 > class175.field3381 - -5 || class192.field3756 < class175.field3381 + -5) {
                                class164.field3211 = true;
                            }
                            ++class68.field1384;
                            if (~class202.field3923 == -1) {
                                if (class164.field3211 && class68.field1384 >= 5) {
                                    if (class159.field3163 == class115.field2319 && class179.field3428 != class177.field3414) {
                                        ++class195.field3817;
                                        byte var19 = 0;
                                        class1 var20 = class115.field2319;
                                        if (~class136.field2717 == -2 && ~var20.field120 == -207) {
                                            var19 = 1;
                                        }
                                        if (~var20.field133[class179.field3428] >= -1) {
                                            var19 = 0;
                                        }
                                        if (!class74.method516((byte) 16, class114.method766(103, var20))) {
                                            if (var19 == 1) {
                                                int var21 = class177.field3414;
                                                int var22 = class179.field3428;
                                                while (~var21 != ~var22) {
                                                    if (~var21 < ~var22) {
                                                        var20.method15(var21, -118, var21 + -1);
                                                        --var21;
                                                    } else if (~var22 < ~var21) {
                                                        var20.method15(var21, 104, var21 - -1);
                                                        ++var21;
                                                    }
                                                }
                                            } else {
                                                var20.method15(class177.field3414, 104, class179.field3428);
                                            }
                                        } else {
                                            int var23 = class177.field3414;
                                            int var24 = class179.field3428;
                                            var20.field133[var24] = var20.field133[var23];
                                            var20.field60[var24] = var20.field60[var23];
                                            var20.field133[var23] = -1;
                                            var20.field60[var23] = 0;
                                        }
                                        class99.field2000.method405(0, 7);
                                        class99.field2000.method441(class177.field3414, (byte) -100);
                                        class99.field2000.method455(var19, 1329211912);
                                        class99.field2000.method450(class179.field3428, (byte) -90);
                                        class99.field2000.method426(class115.field2319.field100, (byte) -13);
                                    }
                                } else if ((~class98.field1992 == -2 || class177.method1167(false, class3.field182 + -1)) && class3.field182 > 2) {
                                    class45.method285((byte) -5);
                                } else if (~class3.field182 < -1) {
                                    class131.method865((byte) -82, class3.field182 + -1);
                                }
                                class115.field2319 = null;
                                class74.field1559 = 0;
                                class65.field1317 = 10;
                            }
                        }
                        class15.field424 = false;
                        class189.field3603 = false;
                        class205.field3941 = null;
                        class108.field2224 = 0;
                        class1 var25 = class185.field3506;
                        class1 var26 = class114.field2299;
                        class114.field2299 = null;
                        class185.field3506 = null;
                        while (class101.method698(-12501) && class108.field2224 < 128) {
                            class152.field3015[class108.field2224] = class34.field764;
                            class20.field494[class108.field2224] = class120.field2426;
                            ++class108.field2224;
                        }
                        if (~class197.field3836 != 0) {
                            class212.method1374(765, 0, 0, 0, 0, class197.field3836, -48, 503);
                        }
                        ++class186.field3516;
                        while (true) {
                            class156 var27;
                            class1 var28;
                            class1 var29;
                            do {
                                var27 = (class156) class136.field2723.method105(-123);
                                if (var27 == null) {
                                    while (true) {
                                        class156 var30;
                                        class1 var31;
                                        class1 var32;
                                        do {
                                            var30 = (class156) class66.field1349.method105(-123);
                                            if (var30 == null) {
                                                while (true) {
                                                    class156 var33;
                                                    class1 var34;
                                                    class1 var35;
                                                    do {
                                                        var33 = (class156) class3.field176.method105(-123);
                                                        if (var33 == null) {
                                                            if (class6.field298 != null) {
                                                                class104.method713(-1);
                                                            }
                                                            if (class116.field2353 != -1) {
                                                                int var36 = class116.field2353;
                                                                int var37 = class214.field4190;
                                                                boolean var38 = class186.method1206(class15.field423.field233[0], 0, (byte) 126, class15.field423.field198[0], var36, 0, true, 0, 0, 0, var37, 0);
                                                                if (var38) {
                                                                    class185.field3505 = class31.field705;
                                                                    class205.field3946 = 0;
                                                                    field1540 = 1;
                                                                    class159.field3164 = class81.field1645;
                                                                }
                                                                class116.field2353 = -1;
                                                            }
                                                            class121.method814(10);
                                                            if (class114.field2299 != var26) {
                                                                if (var26 != null) {
                                                                    class3.method21(26702, var26);
                                                                }
                                                                if (class114.field2299 != null) {
                                                                    class3.method21(26702, class114.field2299);
                                                                }
                                                            }
                                                            if (class185.field3506 != var25 && ~class3.field170 == ~class172.field3334) {
                                                                if (var25 != null) {
                                                                    class3.method21(26702, var25);
                                                                }
                                                                if (class185.field3506 != null) {
                                                                    class3.method21(26702, class185.field3506);
                                                                }
                                                            }
                                                            if (class185.field3506 == null) {
                                                                if (class172.field3334 > 0) {
                                                                    --class172.field3334;
                                                                }
                                                            } else if (class3.field170 > class172.field3334) {
                                                                ++class172.field3334;
                                                                if (~class3.field170 == ~class172.field3334) {
                                                                    class3.method21(26702, class185.field3506);
                                                                }
                                                            }
                                                            class97.method681((byte) -107);
                                                            if (class39.field883) {
                                                                class200.method1322(78);
                                                            }
                                                            for (int var39 = 0; var39 < 5; ++var39) {
                                                                int var10002 = class93.field1876[var39]++;
                                                            }
                                                            int var40 = class123.method824((byte) -91);
                                                            int var41 = class110.method749(0);
                                                            if (var40 > 4500 && ~var41 < -4501) {
                                                                class140.field2812 = 250;
                                                                ++class143.field2851;
                                                                class117.method789(4000, -21);
                                                                class99.field2000.method405(239, 7);
                                                            }
                                                            ++class212.field4109;
                                                            if (~class212.field4109 < -501) {
                                                                int var42 = (int) (Math.random() * 8.0D);
                                                                if ((4 & var42) == 4) {
                                                                    class93.field1874 += class45.field1001;
                                                                }
                                                                if (~(2 & var42) == -3) {
                                                                    class92.field1860 += class33.field740;
                                                                }
                                                                class212.field4109 = 0;
                                                                if ((var42 & 1) == 1) {
                                                                    class164.field3204 += class196.field3825;
                                                                }
                                                            }
                                                            ++field1541;
                                                            if (class92.field1860 < -55) {
                                                                class33.field740 = 2;
                                                            }
                                                            if (~class164.field3204 > 49) {
                                                                class196.field3825 = 2;
                                                            }
                                                            if (class92.field1860 > 55) {
                                                                class33.field740 = -2;
                                                            }
                                                            if (arg0 >= -37) {
                                                                return;
                                                            }
                                                            if (class164.field3204 > 50) {
                                                                class196.field3825 = -2;
                                                            }
                                                            if (class93.field1874 < -40) {
                                                                class45.field1001 = 1;
                                                            }
                                                            ++class39.field890;
                                                            if (~class93.field1874 < -41) {
                                                                class45.field1001 = -1;
                                                            }
                                                            if (class39.field890 > 500) {
                                                                class39.field890 = 0;
                                                                int var43 = (int) (Math.random() * 8.0D);
                                                                if (~(2 & var43) == -3) {
                                                                    class127.field2565 += class1.field137;
                                                                }
                                                                if ((var43 & 1) == 1) {
                                                                    class172.field3338 += class5.field271;
                                                                }
                                                            }
                                                            if (~class172.field3338 > 59) {
                                                                class5.field271 = 2;
                                                            }
                                                            if (class127.field2565 < -20) {
                                                                class1.field137 = 1;
                                                            }
                                                            if (~class172.field3338 < -61) {
                                                                class5.field271 = -2;
                                                            }
                                                            if (class127.field2565 > 10) {
                                                                class1.field137 = -1;
                                                            }
                                                            if (field1541 > 50) {
                                                                ++class26.field583;
                                                                class99.field2000.method405(41, 7);
                                                            }
                                                            try {
                                                                if (class66.field1334 != null && class99.field2000.field1472 > 0) {
                                                                    class66.field1334.method324(0, class99.field2000.field1493, class99.field2000.field1472, 2084);
                                                                    field1541 = 0;
                                                                    class99.field2000.field1472 = 0;
                                                                    return;
                                                                }
                                                                return;
                                                            } catch (IOException var44) {
                                                                class209.method1358(false);
                                                                return;
                                                            }
                                                        }
                                                        var34 = var33.field3103;
                                                        if (var34.field90 < 0) {
                                                            break;
                                                        }
                                                        var35 = class175.method1155(var34.field36, (byte) -75);
                                                    } while (var35 == null || var35.field55 == null || ~var34.field90 <= ~var35.field55.length || var35.field55[var34.field90] != var34);
                                                    class2.method18(var33, 6645);
                                                }
                                            }
                                            var31 = var30.field3103;
                                            if (~var31.field90 > -1) {
                                                break;
                                            }
                                            var32 = class175.method1155(var31.field36, (byte) 116);
                                        } while (var32 == null || var32.field55 == null || var31.field90 >= var32.field55.length || var32.field55[var31.field90] != var31);
                                        class2.method18(var30, 6645);
                                    }
                                }
                                var28 = var27.field3103;
                                if (var28.field90 < 0) {
                                    break;
                                }
                                var29 = class175.method1155(var28.field36, (byte) -90);
                            } while (var29 == null || var29.field55 == null || ~var29.field55.length >= ~var28.field90 || var29.field55[var28.field90] != var28);
                            class2.method18(var27, 6645);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
    public static final void method511(int arg0) {
        ++field1537;
        class35.field793.method923(-100);
        if (arg0 != -13501) {
            method510(91);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field1550;
        if (arg1 != 4096) {
            field1545 = null;
        }
        int[][] var3 = super.field1873.method553(arg0, 0);
        if (super.field1873.field1656) {
            int[][] var4 = this.method649(0, true, arg0);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[0];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class150.field2985 < ~var11; ++var11) {
                var7[var11] = (var9[var11] * this.field1543 >> 12) + this.field1536;
                var8[var11] = (var6[var11] * this.field1543 >> 12) + this.field1536;
                var10[var11] = (var5[var11] * this.field1543 >> 12) + this.field1536;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "(B)V")
    public static void method512(byte arg0) {
        if (arg0 != 14) {
            field1540 = 65;
        }
        field1545 = null;
        field1544 = null;
        field1538 = null;
        field1548 = null;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field1542;
        if (arg0 == -85) {
            this.field1543 = -this.field1536 + this.field1547;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class73() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(BII)V")
    public static final void method513(byte arg0, int arg1, int arg2) {
        int[] var3 = new int[4];
        var3[0] = arg1;
        ++field1553;
        int var4 = 1;
        int[] var5 = new int[4];
        var5[0] = arg2;
        for (int var6 = 0; var6 < 4; ++var6) {
            if (class200.field3901[var6] != arg1) {
                var3[var4] = class200.field3901[var6];
                var5[var4] = class166.field3267[var6];
                ++var4;
            }
        }
        int var7 = -103 / ((-34 - arg0) / 41);
        class166.field3267 = var5;
        class200.field3901 = var3;
        class96.method669(0, class148.field2942, class200.field3901, -2, class148.field2942.length + -1, class166.field3267);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILnh;IZLnh;)Lef;")
    public static final class47 method514(int arg0, class133 arg1, int arg2, boolean arg3, class133 arg4) {
        if (arg2 != -1828872888) {
            method511(-55);
        }
        ++field1549;
        boolean var5 = true;
        int[] var6 = arg4.method877(arg0, (byte) -67);
        for (int var7 = 0; var6.length > var7; ++var7) {
            byte[] var8 = arg4.method874(var6[var7], arg0, arg2 ^ -1828855292);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = 65280 & var8[0] << 8 | var8[1] & 255;
                byte[] var10;
                if (arg3) {
                    var10 = arg1.method874(var9, 0, 32588);
                } else {
                    var10 = arg1.method874(0, var9, 32588);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        } else {
            try {
                return new class47(arg4, arg1, arg0, arg3);
            } catch (Exception var11) {
                return null;
            }
        }
    }
}
