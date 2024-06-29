import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class105 extends class59 {

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "I")
    private int field2049 = 2048;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    private int field2045 = 10;

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "I")
    private int field2056 = 0;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "Lsd;")
    private static class166 field2053 = class135.method935("skill)2", 0);

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "Lsd;")
    public static class166 field2055 = field2053;

    @OriginalMember(owner = "client!lf", name = "gb", descriptor = "Lsd;")
    private static class166 field2059 = class135.method935("Try again in 60 secs)3)3)3", 0);

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "Lsd;")
    public static class166 field2054 = field2059;

    @OriginalMember(owner = "client!lf", name = "eb", descriptor = "Lsd;")
    public static class166 field2057 = class135.method935("<)4col>", 0);

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!lf", name = "ib", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lcb;")
    public static class22 field2052;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "[I")
    private int[] field2050;

    @OriginalMember(owner = "client!lf", name = "fb", descriptor = "[I")
    private int[] field2058;

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIZ)V")
    public static final void method784(int arg0, int arg1, boolean arg2) {
        ++field2047;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var3[0] = arg0;
        if (arg2) {
            method784(-98, 117, false);
        }
        int var5 = 1;
        var4[0] = arg1;
        for (int var6 = 0; ~var6 > -5; ++var6) {
            if (~class12.field220[var6] != ~arg0) {
                var3[var5] = class12.field220[var6];
                var4[var5] = class166.field3148[var6];
                ++var5;
            }
        }
        class12.field220 = var3;
        class166.field3148 = var4;
        class79.method649(class9.field179, class9.field179.length + -1, 0, class166.field3148, 8989, class12.field220);
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        int[] var3 = super.field1219.method721(arg0, -123);
        if (arg1 >= -124) {
            method784(72, -78, false);
        }
        ++field2061;
        if (super.field1219.field1816) {
            int var4 = class136.field2657[arg0];
            if (~this.field2056 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field2045; ++var6) {
                    if (~this.field2050[var6] >= ~var4 && this.field2050[var6 + 1] > var4) {
                        if (~var4 > ~this.field2058[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class71.method568(var3, 0, class98.field1879, var5);
            } else {
                for (int var7 = 0; var7 < class98.field1879; ++var7) {
                    int var8 = 0;
                    int var9 = class187.field3569[var7];
                    short var10 = 0;
                    int var11 = this.field2056;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (var11 == 3) {
                                var8 = 2048 - -(-var4 + var9 >> 1);
                            }
                        } else {
                            var8 = (var9 - (-var4 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var8 = var9;
                    }
                    for (int var12 = 0; ~var12 > ~this.field2045; ++var12) {
                        if (~var8 <= ~this.field2050[var12] && ~var8 > ~this.field2050[var12 + 1]) {
                            if (~this.field2058[var12] < ~var8) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var10;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    private final void method785(int arg0) {
        this.field2050 = new int[this.field2045 - arg0];
        this.field2058 = new int[this.field2045 + 1];
        ++field2051;
        int var2 = 0;
        int var3 = 4096 / this.field2045;
        int var4 = this.field2049 * var3 >> 12;
        for (int var5 = 0; ~this.field2045 < ~var5; ++var5) {
            this.field2050[var5] = var2;
            this.field2058[var5] = var2 + var4;
            var2 += var3;
        }
        this.field2050[this.field2045] = 4096;
        this.field2058[this.field2045] = this.field2058[0] + 4096;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        this.method785(-1);
        if (arg0 != 23459) {
            this.field2056 = 29;
        }
        ++field2048;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field2056 = arg0.method400(255);
                }
            } else {
                this.field2049 = arg0.method405(2);
            }
        } else {
            this.field2045 = arg0.method400(255);
        }
        ++field2046;
        if (arg1 < 18) {
            field2059 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(B)V")
    public static void method786(byte arg0) {
        field2053 = null;
        field2052 = null;
        field2057 = null;
        field2059 = null;
        field2055 = null;
        field2054 = null;
        int var1 = -13 / ((43 - arg0) / 59);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZLhb;Lhb;)V")
    public static final void method787(boolean arg0, class66 arg1, class66 arg2) {
        if (arg0) {
            ++field2060;
            if (class117.field2265) {
                class179.method1213((byte) 15, arg1, arg2);
            } else {
                if (client.field520 == 0 || ~client.field520 == -6) {
                    byte var3 = 20;
                    arg2.method181(class5.field115, 382, -var3 + 245, 16777215, -1);
                    int var4 = 253 - var3;
                    class17.method97(230, var4, 304, 34, 9179409);
                    class17.method97(231, var4 + 1, 302, 32, 0);
                    class17.method91(232, var4 + 2, class150.field2931 * 3, 30, 9179409);
                    class17.method91(class150.field2931 * 3 + 232, var4 - -2, -(class150.field2931 * 3) + 300, 30, 0);
                    arg2.method181(class12.field239, 382, -var3 + 276, 16777215, -1);
                }
                if (client.field520 == 20) {
                    short var5 = 211;
                    class42.field746.method731(-(class42.field746.field1852 / 2) + 382, 271 - class42.field746.field1849 / 2);
                    arg2.method181(class12.field228, 382, var5, 16776960, 0);
                    int var23 = var5 + 15;
                    arg2.method181(class12.field222, 382, var23, 16776960, 0);
                    int var24 = var23 + 15;
                    arg2.method181(class12.field231, 382, var24, 16776960, 0);
                    int var25 = var24 + 15;
                    int var26 = var25 + 10;
                    arg2.method178(class22.method148(new class166[] { class84.field1696, class24.method164(class12.field235) }, 0), 272, var26, 16777215, 0);
                    int var27 = var26 + 15;
                    arg2.method178(class22.method148(new class166[] { class193.field3761, class12.field236.method1136(-94) }, 0), 274, var27, 16777215, 0);
                    int var28 = var27 + 15;
                }
                if (~client.field520 == -11) {
                    class42.field746.method731(202, 171);
                    if (~class172.field3299 == -1) {
                        short var6 = 302;
                        short var7 = 251;
                        arg2.method181(class120.field2346, 382, var7, 16776960, 0);
                        short var8 = 291;
                        int var29 = var7 + 30;
                        class161.field3082.method731(var6 + -73, var8 - 20);
                        arg2.method179(class130.field2547, var6 + -73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                        short var9 = 462;
                        class161.field3082.method731(var9 + -73, var8 + -20);
                        arg2.method179(class57.field1119, var9 + -73, var8 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                    } else if (class172.field3299 == 2) {
                        short var10 = 211;
                        arg2.method181(class12.field228, 382, var10, 16776960, 0);
                        int var30 = var10 + 15;
                        short var11 = 302;
                        arg2.method181(class12.field222, 382, var30, 16776960, 0);
                        int var31 = var30 + 15;
                        short var12 = 321;
                        arg2.method181(class12.field231, 382, var31, 16776960, 0);
                        boolean var13;
                        if (~class153.field2954 == -1 && class49.field910 % 40 < 20 && class172.field3288) {
                            var13 = true;
                        } else {
                            var13 = false;
                        }
                        var30 = var31 + 15;
                        var30 += 10;
                        arg2.method178(class22.method148(new class166[] { class84.field1696, class24.method164(class12.field235), var13 ? class111.field2158 : class12.field225 }, 0), 272, var30, 16777215, 0);
                        var30 += 15;
                        boolean var14;
                        if (class153.field2954 == 1 && class49.field910 % 40 < 20 && class172.field3288) {
                            var14 = true;
                        } else {
                            var14 = false;
                        }
                        arg2.method178(class22.method148(new class166[] { class193.field3761, class12.field236.method1136(-80), !var14 ? class12.field225 : class111.field2158 }, 0), 274, var30, 16777215, 0);
                        class161.field3082.method731(var11 + -73, var12 + -20);
                        arg2.method181(class135.field2637, var11, var12 + 5, 16777215, 0);
                        var30 += 15;
                        short var15 = 462;
                        class161.field3082.method731(var15 - 73, var12 + -20);
                        arg2.method181(class31.field569, var15, var12 + 5, 16777215, 0);
                    } else if (~class172.field3299 == -4) {
                        arg2.method181(class165.field3140, 382, 211, 16776960, 0);
                        short var16 = 382;
                        short var17 = 236;
                        arg2.method181(class51.field932, 382, var17, 16777215, 0);
                        int var32 = var17 + 15;
                        arg2.method181(class64.field1341, 382, var32, 16777215, 0);
                        int var33 = var32 + 15;
                        arg2.method181(class53.field962, 382, var33, 16777215, 0);
                        short var18 = 321;
                        int var34 = var33 + 15;
                        arg2.method181(class59.field1209, 382, var34, 16777215, 0);
                        class161.field3082.method731(var16 + -73, var18 + -20);
                        arg2.method181(class31.field569, var16, var18 - -5, 16777215, 0);
                        int var35 = var34 + 15;
                    }
                }
                if (class179.field3395 != 1) {
                    if (~class46.field821 < -1) {
                        class31.method233(0, class46.field821);
                        class46.field821 = 0;
                    }
                    class175.method1197(16711935);
                }
                class12.field232[class120.field2355 ? 1 : 0].method731(725, 463);
                if (client.field520 > 5 && ~class196.field3877 != -3 && class116.field2246 == 0) {
                    if (class193.field3795 != null) {
                        byte var19 = 5;
                        byte var20 = 35;
                        byte var21 = 100;
                        short var22 = 463;
                        class193.field3795.method731(var19, var22);
                        arg2.method181(class22.method148(new class166[] { class150.field2927, class139.field2724, class174.method1192(false, class106.field2071) }, 0), var21 / 2 + var19, var20 / 2 + var22 + -2, 16777215, 0);
                        if (class86.field1706 == null) {
                            arg1.method181(class48.field899, var19 - -(var21 / 2), var20 / 2 + 12 + var22, 16777215, 0);
                        } else {
                            arg1.method181(class16.field265, var19 - -(var21 / 2), var20 / 2 + 12 + var22, 16777215, 0);
                        }
                    } else {
                        class193.field3795 = class18.method113(class12.field225, class3.field33, class102.field1971, 113);
                    }
                }
            }
        }
    }
}
