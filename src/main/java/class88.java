import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class88 extends class74 {

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "Z")
    public static volatile boolean field1437 = true;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
    public static int field1443 = 0;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "[Lkg;")
    private class137[] field1433;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "[[[Lwd;")
    public static class23[][][] field1439;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public static final void method701(byte arg0) {
        if (arg0 < 101) {
            method711(97);
        }
        ++field1432;
        class220.method1471(-1, false);
        System.gc();
        class77.method609(10, 25);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lhg;")
    public static final class181 method702(Throwable arg0, String arg1) {
        ++field1442;
        class181 var2;
        if (arg0 instanceof class181) {
            var2 = (class181) arg0;
            var2.field2696 = var2.field2696 + ' ' + arg1;
        } else {
            var2 = new class181(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lag;III)V")
    public static final void method703(class188 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2982 == 1) {
            class155.method1045("", (short) 28, arg0.field2883, 0, -1, 0L, (byte) 78, arg0.field2977);
            ++class19.field295;
        }
        ++field1435;
        if (~arg0.field2982 == -3 && !class179.field2678) {
            String var4 = class11.method116(arg1 + -35, arg0);
            if (var4 != null) {
                ++class221.field3460;
                class155.method1045("<col=00ff00>" + arg0.field2906, (short) 13, var4, -1, -1, 0L, (byte) 78, arg0.field2977);
            }
        }
        if (arg0.field2982 == 3) {
            class155.method1045("", (short) 33, class143.field2208, 0, -1, 0L, (byte) 78, arg0.field2977);
            ++class297.field4690;
        }
        if (arg0.field2982 == 4) {
            class155.method1045("", (short) 24, arg0.field2883, 0, -1, 0L, (byte) 78, arg0.field2977);
            ++class84.field1389;
        }
        if (arg0.field2982 == 5) {
            ++class156.field2381;
            class155.method1045("", (short) 60, arg0.field2883, 0, -1, 0L, (byte) 78, arg0.field2977);
        }
        if (arg0.field2982 == 6 && class174.field2577 == null) {
            ++class272.field4300;
            class155.method1045("", (short) 30, arg0.field2883, -1, -1, 0L, (byte) 78, arg0.field2977);
        }
        if (arg1 != -1) {
            method704(26);
        }
        if (arg0.field2937 == 2) {
            int var5 = 0;
            for (int var6 = 0; ~var6 > ~arg0.field2893; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field2924; ++var7) {
                    int var8 = (arg0.field2955 + 32) * var7;
                    int var9 = (arg0.field2909 + 32) * var6;
                    if (~var5 > -21) {
                        var9 += arg0.field2904[var5];
                        var8 += arg0.field2920[var5];
                    }
                    if (arg2 >= var8 && ~arg3 <= ~var9 && arg2 < var8 - -32 && ~arg3 > ~(var9 + 32)) {
                        class157.field2417 = arg0;
                        class208.field3225 = var5;
                        if (~arg0.field2944[var5] < -1) {
                            class219 var10 = client.method1063(arg0);
                            class123 var11 = class32.method260(arg0.field2944[var5] + -1, true);
                            if (~class90.field1458 == -2 && var10.method1459((byte) -71)) {
                                if (class149.field2308 != arg0.field2977 || class291.field4583 != var5) {
                                    ++class190.field3026;
                                    class155.method1045(class56.field870 + " -> <col=ff9040>" + var11.field1885, (short) 7, class256.field3920, var5, -1, (long) var11.field1934, (byte) 78, arg0.field2977);
                                }
                            } else if (class179.field2678 && var10.method1459((byte) -77)) {
                                class289 var12 = class258.field3951 != -1 ? class31.method250(class258.field3951, arg1 ^ 88) : null;
                                if ((class71.field1135 & 16) != 0 && (var12 == null || var11.method876(-1, class258.field3951, var12.field4557) != var12.field4557)) {
                                    class155.method1045(class126.field1982 + " -> <col=ff9040>" + var11.field1885, (short) 41, class78.field1316, var5, class87.field1421, (long) var11.field1934, (byte) 78, arg0.field2977);
                                    ++class255.field3908;
                                }
                            } else {
                                ++class130.field2015;
                                String[] var13 = var11.field1926;
                                if (class215.field3316) {
                                    var13 = class296.method1987(var13, arg1 + 115);
                                }
                                if (var10.method1459((byte) -93)) {
                                    for (int var14 = 4; ~var14 <= -4; --var14) {
                                        if (var13 != null && var13[var14] != null) {
                                            ++class203.field3166;
                                            byte var15;
                                            if (~var14 == -4) {
                                                var15 = 1;
                                            } else {
                                                var15 = 8;
                                            }
                                            class155.method1045("<col=ff9040>" + var11.field1885, var15, var13[var14], var5, -1, (long) var11.field1934, (byte) 78, arg0.field2977);
                                        }
                                    }
                                }
                                if (var10.method1467(arg1 + -106)) {
                                    ++class44.field713;
                                    class155.method1045("<col=ff9040>" + var11.field1885, (short) 12, class256.field3920, var5, class86.field1418, (long) var11.field1934, (byte) 78, arg0.field2977);
                                }
                                if (var10.method1459((byte) -119) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; --var16) {
                                        if (var13[var16] != null) {
                                            ++class132.field2036;
                                            byte var17 = 0;
                                            if (~var16 == -1) {
                                                var17 = 34;
                                            }
                                            if (var16 == 1) {
                                                var17 = 57;
                                            }
                                            if (var16 == 2) {
                                                var17 = 29;
                                            }
                                            class155.method1045("<col=ff9040>" + var11.field1885, var17, var13[var16], var5, -1, (long) var11.field1934, (byte) 78, arg0.field2977);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field2938;
                                if (class215.field3316) {
                                    var18 = class296.method1987(var18, 127);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; ~var19 <= -1; --var19) {
                                        if (var18[var19] != null) {
                                            ++class254.field3898;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 32;
                                            }
                                            if (~var19 == -2) {
                                                var20 = 50;
                                            }
                                            if (var19 == 2) {
                                                var20 = 11;
                                            }
                                            if (var19 == 3) {
                                                var20 = 45;
                                            }
                                            if (~var19 == -5) {
                                                var20 = 38;
                                            }
                                            class155.method1045("<col=ff9040>" + var11.field1885, var20, var18[var19], var5, -1, (long) var11.field1934, (byte) 78, arg0.field2977);
                                        }
                                    }
                                }
                                class155.method1045("<col=ff9040>" + var11.field1885, (short) 1003, class117.field1822, var5, class228.field3576, (long) var11.field1934, (byte) 78, arg0.field2977);
                            }
                        }
                    }
                    ++var5;
                }
            }
        }
        if (arg0.field2852) {
            if (class179.field2678) {
                if (client.method1063(arg0).method1460(1) && (32 & class71.field1135) != 0) {
                    ++class63.field1007;
                    class155.method1045(class126.field1982 + " -> " + arg0.field2855, (short) 5, class78.field1316, arg0.field2856, class87.field1421, 0L, (byte) 78, arg0.field2977);
                    return;
                }
                return;
            }
            for (int var21 = 9; var21 >= 5; --var21) {
                String var25 = class229.method1518(arg0, true, var21);
                if (var25 != null) {
                    class155.method1045(arg0.field2855, (short) 1001, var25, arg0.field2856, class191.method1288(arg1, arg0, var21), (long) (var21 + 1), (byte) 78, arg0.field2977);
                    ++class55.field858;
                }
            }
            String var22 = class11.method116(-49, arg0);
            if (var22 != null) {
                ++class221.field3460;
                class155.method1045(arg0.field2855, (short) 13, var22, arg0.field2856, -1, 0L, (byte) 78, arg0.field2977);
            }
            for (int var23 = 4; var23 >= 0; --var23) {
                String var24 = class229.method1518(arg0, true, var23);
                if (var24 != null) {
                    class155.method1045(arg0.field2855, (short) 6, var24, arg0.field2856, class191.method1288(-1, arg0, var23), (long) (var23 - -1), (byte) 78, arg0.field2977);
                    ++class55.field858;
                }
            }
            if (client.method1063(arg0).method1458(7475)) {
                if (arg0.field2975 != null) {
                    class155.method1045("", (short) 30, arg0.field2975, arg0.field2856, -1, 0L, (byte) 78, arg0.field2977);
                } else {
                    class155.method1045("", (short) 30, class169.field2535, arg0.field2856, -1, 0L, (byte) 78, arg0.field2977);
                }
                ++class272.field4300;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
    public static final void method704(int arg0) {
        if (class134.field2075 < class62.field1003) {
            class134.field2075 = (float) ((double) class134.field2075 / 30.0D + (double) class134.field2075);
            if (class134.field2075 > class62.field1003) {
                class134.field2075 = class62.field1003;
            }
            class273.method1840((byte) 118);
        } else if (class62.field1003 < class134.field2075) {
            class134.field2075 = (float) ((double) class134.field2075 - (double) class134.field2075 / 30.0D);
            if (class62.field1003 > class134.field2075) {
                class134.field2075 = class62.field1003;
            }
            class273.method1840((byte) -128);
        }
        if (arg0 < 19) {
            field1446 = 29;
        }
        if (class116.field1808 != -1 && ~class197.field3094 != 0) {
            int var1 = -class140.field2155 + class116.field1808;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 4;
            }
            class140.field2155 += var1;
            int var2 = -class250.field3848 + class197.field3094;
            if (var2 < 2 || ~var2 < -3) {
                var2 >>= 4;
            }
            if (var1 == 0 && ~var2 == -1) {
                class116.field1808 = -1;
                class197.field3094 = -1;
            }
            class250.field3848 += var2;
            class273.method1840((byte) 70);
        }
        ++field1445;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
    public static final void method705(int arg0, boolean arg1) {
        class121.field1859 = arg1;
        ++field1447;
        class270.field4274 = !class223.method1487(110);
        if (arg0 != 32) {
            field1437 = false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
    public static final void method706(int arg0) {
        class35.field565.method1783(0);
        class220.field3438.method1783(0);
        ++field1438;
        if (arg0 >= -54) {
            field1437 = false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([[IB)V")
    private final void method707(int[][] arg0, byte arg1) {
        int var3 = class178.field2662;
        int var4 = 39 % ((arg1 - 45) / 40);
        ++field1441;
        int var5 = class209.field3248;
        class167.method1103(arg0, 108);
        class207.method1381(0, 0, class129.field2012, class218.field3419, -40);
        if (this.field1433 != null) {
            for (int var6 = 0; ~var6 > ~this.field1433.length; ++var6) {
                class137 var7 = this.field1433[var6];
                int var8 = var7.field2126;
                int var9 = var7.field2124;
                if (~var8 <= -1) {
                    if (var9 >= 0) {
                        var7.method542(true, var5, var3);
                    } else {
                        var7.method550(0, var5, var3);
                    }
                } else if (~var9 <= -1) {
                    var7.method549(var3, var5, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(I)V")
    public static void method708(int arg0) {
        field1439 = null;
        if (arg0 != -4) {
            field1443 = -124;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method82(int arg0, byte arg1) {
        if (arg1 >= -112) {
            field1443 = -33;
        }
        int[][] var3 = super.field1248.method269(false, arg0);
        ++field1444;
        if (super.field1248.field550) {
            int var4 = class209.field3248;
            int var5 = class178.field2662;
            int[][][] var6 = super.field1248.method266(0);
            int[][] var7 = new int[var4][var5];
            this.method707(var7, (byte) 116);
            for (int var8 = 0; ~class209.field3248 < ~var8; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class178.field2662; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class3.method48(255, var15) << 4;
                    var12[var14] = class3.method48(var15, 65280) >> 4;
                    var11[var14] = class3.method48(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBII)V")
    public static final void method709(int arg0, byte arg1, int arg2, int arg3) {
        int var4 = class259.field3985 * arg3 >> 8;
        ++field1436;
        if (arg1 <= 50) {
            field1439 = null;
        }
        if (var4 != 0 && arg0 != -1) {
            class266.method1815(false, class146.field2273, 0, arg0, var4, 10000);
            class28.field421 = true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IZ)V")
    public static final void method710(int arg0, boolean arg1) {
        byte[][] var2 = class86.field1417;
        byte var3 = 4;
        for (int var4 = arg0; ~var4 > ~var3; ++var4) {
            class130.method916(-120);
            for (int var5 = 0; ~var5 > -14; ++var5) {
                for (int var6 = 0; var6 < 13; ++var6) {
                    int var7 = class290.field4566[var4][var5][var6];
                    if (~var7 != 0) {
                        int var8 = var7 >> 24 & 3;
                        if (!arg1 || var8 == 0) {
                            int var9 = (6 & var7) >> 1;
                            int var10 = (16775926 & var7) >> 14;
                            int var11 = var7 >> 3 & 2047;
                            int var12 = (var10 / 8 << 8) - -(var11 / 8);
                            for (int var13 = 0; ~class221.field3454.length < ~var13; ++var13) {
                                if (class221.field3454[var13] == var12 && var2[var13] != null) {
                                    class21.method183(var5 * 8, var9, (var11 & 7) * 8, class72.field1142, 0, var2[var13], var8, var4, arg1, (7 & var10) * 8, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        ++field1430;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLf;I)V")
    public final void method80(byte arg0, class37 arg1, int arg2) {
        if (arg0 != -79) {
            method703((class188) null, -102, 21, -4);
        }
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field1245 = arg1.method333((byte) -59) == 1;
            }
        } else {
            this.field1433 = new class137[arg1.method333((byte) -59)];
            for (int var4 = 0; this.field1433.length > var4; ++var4) {
                int var5 = arg1.method333((byte) -59);
                if (~var5 != -1) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field1433[var4] = class255.method1694(arg1, (byte) -85);
                            }
                        } else {
                            this.field1433[var4] = class246.method1661(arg1, -98);
                        }
                    } else {
                        this.field1433[var4] = class280.method1874(0, arg1);
                    }
                } else {
                    this.field1433[var4] = class166.method1101(arg1, 2048);
                }
            }
        }
        ++field1440;
    }

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "(I)V")
    public static final void method711(int arg0) {
        ++field1434;
        int var1 = class123.field1925.method10(class215.field3315);
        for (int var2 = 0; ~class220.field3450 < ~var2; ++var2) {
            int var6 = class123.field1925.method10(class57.method454(15827, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        int var3 = class220.field3450 * 15 - -21;
        int var4 = class287.field4525;
        if (arg0 != 6588) {
            method704(15);
        }
        var1 += 8;
        int var5 = -(var1 / 2) + class155.field2362;
        if (class277.field4369 < var4 - -var3) {
            var4 = -var3 + class277.field4369;
        }
        if (~(var1 + var5) < ~class35.field573) {
            var5 = -var1 + class35.field573;
        }
        if (~var4 > -1) {
            var4 = 0;
        }
        if (~var5 > -1) {
            var5 = 0;
        }
        if (~class227.field3554 == -2) {
            if (~class155.field2362 == ~class135.field2111 && class287.field4525 == class112.field1765) {
                class227.field3554 = 0;
                class64.field1025 = true;
                class92.field1478 = (class23.field336 ? 26 : 22) + class220.field3450 * 15;
                class139.field2139 = var5;
                class154.field2353 = var4;
                class273.field4313 = var1;
                return;
            }
        } else {
            if (class78.field1317 == class155.field2362 && ~class287.field4525 == ~class126.field1985) {
                class92.field1478 = (!class23.field336 ? 22 : 26) + class220.field3450 * 15;
                class227.field3554 = 0;
                class273.field4313 = var1;
                class139.field2139 = var5;
                class64.field1025 = true;
                class154.field2353 = var4;
                return;
            }
            class112.field1765 = class126.field1985;
            class135.field2111 = class78.field1317;
            class227.field3554 = 1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class88() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)[I")
    public final int[] method448(int arg0, int arg1) {
        if (arg0 != 4) {
            field1446 = -97;
        }
        int[] var3 = super.field1254.method1328((byte) -108, arg1);
        if (super.field1254.field3118) {
            this.method707(super.field1254.method1325(0), (byte) 112);
        }
        ++field1431;
        return var3;
    }
}
