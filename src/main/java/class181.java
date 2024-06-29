import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class181 extends class398 {

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    public static int field2397 = 0;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "[I")
    public static int[] field2393 = new int[13];

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    public static int field2403 = 0;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "F")
    public static float field2400;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "F")
    public static float field2404;

    @OriginalMember(owner = "client!cj", name = "J", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!cj", name = "S", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "Llm;")
    public static class347 field2390;

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "Lle;")
    public static class65 field2398;

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "[Lpc;")
    private class34[] field2401;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "[[I")
    public static int[][] field2391;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Llm;I)I")
    public static final int method1102(class347 arg0, int arg1) {
        ++field2389;
        int var2 = 0;
        if (arg1 != -24566) {
            field2400 = -0.7735172F;
        }
        if (arg0.method2257(true, class367.field5301)) {
            ++var2;
        }
        if (arg0.method2257(true, class125.field1757)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZIIII)V")
    public static final void method1103(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2396;
        if (class395.method2537((byte) -123, arg4)) {
            class38.method277(class365.field5292[arg4], arg3, arg0, 10743, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
    public static void method1104(byte arg0) {
        field2398 = null;
        int var1 = 16 / (arg0 / 50);
        field2390 = null;
        field2391 = null;
        field2393 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lnj;II)V")
    public final void method208(class228 arg0, int arg1, int arg2) {
        ++field2395;
        if (arg1 == 0) {
            this.field2401 = new class34[arg0.method1348(arg2 ^ 13079)];
            for (int var4 = 0; ~var4 > ~this.field2401.length; ++var4) {
                int var5 = arg0.method1348(-118);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field2401[var4] = class70.method471(arg0, -109);
                            }
                        } else {
                            this.field2401[var4] = class30.method205(arg0, (byte) 99);
                        }
                    } else {
                        this.field2401[var4] = class223.method1296((byte) 109, arg0);
                    }
                } else {
                    this.field2401[var4] = class261.method1800(arg0, 0);
                }
            }
        } else if (~arg1 == -2) {
            super.field5931 = ~arg0.method1348(-101) == -2;
        }
        if (arg2 != -13132) {
            this.method99(60, -124);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lcd;I)I")
    public static final int method1105(class43 arg0, int arg1) {
        ++field2388;
        class249 var2 = arg0.field606;
        if (var2.field3375 != null) {
            var2 = var2.method1510(30);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg1 != 3) {
            method1102((class347) null, -111);
        }
        int var3 = var2.field3400;
        class396 var4 = arg0.method2040(false);
        if (arg0.field4285) {
            var3 = var2.field3362;
        } else if (~arg0.field4298 != ~var4.field5859 && arg0.field4298 != var4.field5862 && ~arg0.field4298 != ~var4.field5861 && arg0.field4298 != var4.field5860) {
            if (arg0.field4298 == var4.field5867 || ~arg0.field4298 == ~var4.field5877 || arg0.field4298 == var4.field5885 || ~arg0.field4298 == ~var4.field5844) {
                var3 = var2.field3355;
            }
        } else {
            var3 = var2.field3417;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class181() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[I")
    public final int[] method95(int arg0, int arg1) {
        ++field2402;
        if (arg1 != 0) {
            field2390 = null;
        }
        int[] var3 = super.field5927.method305(arg0, (byte) 73);
        if (super.field5927.field591) {
            this.method1106(super.field5927.method301(arg1), (byte) -121);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)[[I")
    public final int[][] method99(int arg0, int arg1) {
        ++field2392;
        if (arg1 != 2) {
            method1104((byte) 36);
        }
        int[][] var3 = super.field5933.method2205((byte) -114, arg0);
        if (super.field5933.field4847) {
            int var4 = class140.field1922;
            int var5 = class329.field4798;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field5933.method2204((byte) -73);
            this.method1106(var6, (byte) -125);
            for (int var8 = 0; ~var8 > ~class329.field4798; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; class140.field1922 > var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class183.method1117(var15 << 4, 4080);
                    var12[var14] = class183.method1117(var15, 65280) >> 4;
                    var11[var14] = class183.method1117(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([[IB)V")
    private final void method1106(int[][] arg0, byte arg1) {
        ++field2387;
        int var3 = class140.field1922;
        if (arg1 <= -118) {
            int var4 = class329.field4798;
            class135.method847(arg0, true);
            class352.method2316(-98, 0, class411.field6070, class242.field3233, 0);
            if (this.field2401 != null) {
                for (int var5 = 0; var5 < this.field2401.length; ++var5) {
                    class34 var6 = this.field2401[var5];
                    int var7 = var6.field481;
                    int var8 = var6.field479;
                    if (var7 < 0) {
                        if (var8 >= 0) {
                            var6.method224(var4, 512, var3);
                        }
                    } else if (~var8 > -1) {
                        var6.method228(0, var3, var4);
                    } else {
                        var6.method227(75, var3, var4);
                    }
                }
            }
        }
    }
}
