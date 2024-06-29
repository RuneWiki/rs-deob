import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class125 extends class102 {

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    private int field2301 = 4;

    @OriginalMember(owner = "client!lf", name = "bb", descriptor = "I")
    private int field2312 = 4;

    @OriginalMember(owner = "client!lf", name = "V", descriptor = "Lqe;")
    public static class179 field2306 = class206.method1380("mod_icons", (byte) 126);

    @OriginalMember(owner = "client!lf", name = "T", descriptor = "[I")
    public static int[] field2304 = new int[2000];

    @OriginalMember(owner = "client!lf", name = "W", descriptor = "Lqe;")
    private static class179 field2307 = class206.method1380(" from your friend list first)3", (byte) 117);

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "Lqe;")
    public static class179 field2302 = field2307;

    @OriginalMember(owner = "client!lf", name = "Z", descriptor = "Lsg;")
    public static class201 field2310 = new class201(30);

    @OriginalMember(owner = "client!lf", name = "cb", descriptor = "Lqe;")
    public static class179 field2313 = class206.method1380("Sie befinden sich in einem Mitglieder)2Gebiet(Q", (byte) 55);

    @OriginalMember(owner = "client!lf", name = "db", descriptor = "Lqe;")
    public static class179 field2314 = class206.method1380(")3runescape)3com", (byte) 21);

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!lf", name = "S", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!lf", name = "X", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!lf", name = "Y", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!lf", name = "ab", descriptor = "Lnb;")
    public static class143 field2311;

    @OriginalMember(owner = "client!lf", name = "U", descriptor = "[I")
    public static int[] field2305;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V")
    public static final void method787(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg1 != 3496) {
            method789(-15, -100);
        }
        while (class160.field2907 > var5) {
            if (class99.field1845[var5] + class84.field1636[var5] > arg2 && class99.field1845[var5] < arg0 + arg2 && ~(class15.field401[var5] + class116.field2185[var5]) < ~arg4 && arg3 + arg4 > class116.field2185[var5]) {
                class186.field3455[var5] = true;
            }
            ++var5;
        }
        ++field2297;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(B)V")
    public static final void method788(byte arg0) {
        ++field2303;
        int var1 = class183.field3378;
        int var2 = class202.field3749;
        int var3 = class49.field1051;
        int var4 = 6116423;
        int var5 = class186.field3459;
        class145.method937(var2, var3, var5, var1, var4);
        class145.method937(var2 - -1, var3 + 1, var5 - 2, 16, 0);
        class145.method919(var2 + 1, var3 - -18, var5 + -2, var1 + -19, 0);
        if (arg0 <= -101) {
            class71.field1422.method1015(class136.field2510, var2 + 3, var3 + 14, var4, -1);
            int var6 = class4.field61;
            int var7 = class139.field2559;
            for (int var8 = 0; var8 < class113.field2118; ++var8) {
                int var9 = (class113.field2118 - (1 - -var8)) * 15 + var3 + 31;
                int var10 = 16777215;
                if (var6 > var2 && ~(var2 + var5) < ~var6 && ~var7 < ~(var9 - 13) && var7 < var9 + 3) {
                    var10 = 16776960;
                }
                class71.field1422.method1015(class215.method1411(-17116, var8), var2 + 3, var9, var10, 0);
            }
            method787(class186.field3459, 3496, class202.field3749, class183.field3378, class49.field1051);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field2312 = arg0.method1243(3);
            }
        } else {
            this.field2301 = arg0.method1243(3);
        }
        if (arg2) {
            method788((byte) -66);
        }
        ++field2298;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)[I")
    public final int[] method11(boolean arg0, int arg1) {
        if (!arg0) {
            method788((byte) -117);
        }
        ++field2308;
        int[] var3 = super.field1960.method699((byte) -74, arg1);
        if (super.field1960.field2007) {
            int var4 = class117.field2216 / this.field2312;
            int var5 = class155.field2796 / this.field2301;
            int[] var7;
            if (var4 > 0) {
                int var6 = arg1 % var4;
                var7 = this.method679(class117.field2216 * var6 / var4, 0, (byte) -109);
            } else {
                var7 = this.method679(0, 0, (byte) -109);
            }
            for (int var8 = 0; ~var8 > ~class155.field2796; ++var8) {
                if (var5 > 0) {
                    int var9 = var8 % var5;
                    var3[var8] = var7[class155.field2796 * var9 / var5];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)I")
    public static final int method789(int arg0, int arg1) {
        int var7 = arg1 - 1;
        ++field2300;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        if (arg0 > -115) {
            field2314 = null;
        }
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field2309;
        if (arg1 != 64) {
            return null;
        } else {
            int[][] var3 = super.field1950.method598((byte) -37, arg0);
            if (super.field1950.field1724) {
                int var4 = class155.field2796 / this.field2301;
                int var5 = class117.field2216 / this.field2312;
                int[][] var6;
                if (var5 <= 0) {
                    var6 = this.method677(114, 0, 0);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method677(arg1 + 25, class117.field2216 * var7 / var5, 0);
                }
                int[] var8 = var6[0];
                int[] var9 = var6[1];
                int[] var10 = var6[2];
                int[] var11 = var3[0];
                int[] var12 = var3[2];
                int[] var13 = var3[1];
                for (int var14 = 0; var14 < class155.field2796; ++var14) {
                    int var15;
                    if (~var4 >= -1) {
                        var15 = 0;
                    } else {
                        int var16 = var14 % var4;
                        var15 = class155.field2796 * var16 / var4;
                    }
                    var11[var14] = var8[var15];
                    var13[var14] = var9[var15];
                    var12[var14] = var10[var15];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)I")
    public static int method790(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
    public class125() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V")
    public static void method791(int arg0) {
        field2310 = null;
        if (arg0 != 24748) {
            field2314 = null;
        }
        field2307 = null;
        field2311 = null;
        field2306 = null;
        field2313 = null;
        field2304 = null;
        field2302 = null;
        field2314 = null;
        field2305 = null;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZB)I")
    public static final int method792(boolean arg0, boolean arg1, byte arg2) {
        ++field2299;
        int var3 = 0;
        if (arg2 < 126) {
            method789(38, 92);
        }
        if (arg0) {
            var3 += class80.field1543 + class47.field1022;
        }
        if (arg1) {
            var3 += class91.field1738 + class191.field3569;
        }
        return var3;
    }
}
