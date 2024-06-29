import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dia")
public class class231 extends class715 {

    @OriginalMember(owner = "client!dia", name = "o", descriptor = "Z")
    private boolean field3282 = false;

    @OriginalMember(owner = "client!dia", name = "u", descriptor = "Z")
    private boolean field3288;

    @OriginalMember(owner = "client!dia", name = "m", descriptor = "[Lsaa;")
    private class326[] field3280;

    @OriginalMember(owner = "client!dia", name = "r", descriptor = "Z")
    public static boolean field3285 = false;

    @OriginalMember(owner = "client!dia", name = "q", descriptor = "Lqaa;")
    public static class27 field3284 = new class27(58, 16);

    @OriginalMember(owner = "client!dia", name = "y", descriptor = "Lqe;")
    public static class465 field3292 = new class465(54, 3);

    @OriginalMember(owner = "client!dia", name = "A", descriptor = "Lee;")
    public static class673 field3294 = new class673("LIVE", 0);

    @OriginalMember(owner = "client!dia", name = "n", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!dia", name = "p", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!dia", name = "s", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!dia", name = "t", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!dia", name = "v", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!dia", name = "w", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!dia", name = "x", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!dia", name = "z", descriptor = "Leq;")
    public static class209 field3293;

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)Z")
    public final boolean method690(byte arg0) {
        ++field3287;
        if (arg0 != -3) {
            this.method687(52, 34, 98);
        }
        return true;
    }

    @OriginalMember(owner = "client!dia", name = "c", descriptor = "(I)V")
    public final void method689(int arg0) {
        if (this.field3282) {
            super.field9979.method2753((byte) -17, 1);
            super.field9979.method2732(-72, (class355) null);
            super.field9979.method1040((byte) -123, class686.field9674);
            super.field9979.method2763((byte) -110);
            if (!this.field3288) {
                super.field9979.method2769(class571.field8118, class571.field8118, 18721);
                super.field9979.method2767(0, 25103, class68.field1225);
                super.field9979.method2753((byte) -17, 2);
                super.field9979.method2769(class571.field8118, class571.field8118, 18721);
                super.field9979.method2767(0, 25103, class68.field1225);
                super.field9979.method2767(1, 25103, class44.field665);
                super.field9979.method2755(false, 0, class68.field1225);
                super.field9979.method2732(-117, (class355) null);
            } else {
                super.field9979.method2769(class571.field8118, class571.field8118, 18721);
                super.field9979.method2767(0, 25103, class68.field1225);
                super.field9979.method2755(false, 0, class68.field1225);
            }
            super.field9979.method2753((byte) -17, 0);
            this.field3282 = false;
        } else {
            super.field9979.method2755(false, 0, class68.field1225);
        }
        int var2 = 34 % ((-71 - arg0) / 42);
        ++field3281;
        super.field9979.method2769(class571.field8118, class571.field8118, 18721);
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ILdu;I)V")
    public final void method693(int arg0, class355 arg1, int arg2) {
        ++field3291;
        super.field9979.method2732(-103, arg1);
        int var4 = 73 / ((arg0 - 31) / 50);
        super.field9979.method2721(arg2, true);
    }

    @OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Lgt;)V")
    public class231(class453 arg0) {
        super(arg0);
        if (arg0.field6518) {
            this.field3288 = arg0.field6546 < 3;
            int var2 = !this.field3288 ? 127 : 48;
            int[][] var3 = new int[6][4096];
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int var6 = 0;
            for (int var7 = 0; var7 < 64; ++var7) {
                for (int var8 = 0; var8 < 64; ++var8) {
                    float var9 = (float) var7 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var8 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var9 * var9 + var10 * var10 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (var14 == 0) {
                            var15 = -var12;
                        } else if (~var14 != -2) {
                            if (var14 == 2) {
                                var15 = var13;
                            } else if (~var14 != -4) {
                                if (var14 != 4) {
                                    var15 = -var11;
                                } else {
                                    var15 = var11;
                                }
                            } else {
                                var15 = -var13;
                            }
                        } else {
                            var15 = var12;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = var18 << 24;
                        var5[var14][var6] = var17 << 24;
                        var3[var14][var6] = var16 << 24;
                    }
                    ++var6;
                }
            }
            this.field3280 = new class326[3];
            this.field3280[0] = super.field9979.method1015(false, 64, false, var4);
            this.field3280[1] = super.field9979.method1015(false, 64, false, var5);
            this.field3280[2] = super.field9979.method1015(false, 64, false, var3);
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(ZI)V")
    public final void method691(boolean arg0, int arg1) {
        if (arg1 != 4) {
            field3293 = null;
        }
        if (this.field3280 != null && arg0) {
            super.field9979.method2753((byte) -17, 1);
            super.field9979.method1040((byte) -123, class521.field7381);
            class25 var3 = super.field9979.method2773((byte) -30);
            var3.method172(1024);
            super.field9979.method2699(class8.field128, 122);
            if (this.field3288) {
                super.field9979.method2769(class140.field2165, class316.field4492, 18721);
                super.field9979.method1020(false, true, (byte) 65, 0, class68.field1225);
                super.field9979.method2755(false, 0, class165.field2440);
            } else {
                super.field9979.method2769(class571.field8118, class140.field2165, arg1 ^ 18725);
                super.field9979.method2767(0, 25103, class44.field665);
                super.field9979.method2753((byte) -17, 2);
                super.field9979.method2769(class140.field2165, class316.field4492, 18721);
                super.field9979.method2767(0, 25103, class44.field665);
                super.field9979.method1020(false, true, (byte) 65, 1, class44.field665);
                super.field9979.method2755(false, 0, class165.field2440);
                super.field9979.method2732(-127, super.field9979.field6529);
            }
            super.field9979.method2753((byte) -17, 0);
            this.field3282 = true;
        } else {
            super.field9979.method2755(false, 0, class165.field2440);
        }
        ++field3289;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "([SII)[S")
    public static final short[] method1583(short[] arg0, int arg1, int arg2) {
        if (arg1 != 25077) {
            method1584(-51);
        }
        ++field3283;
        short[] var3 = new short[arg2];
        class622.method3593(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(BZ)V")
    public final void method686(byte arg0, boolean arg1) {
        if (arg0 < -105) {
            super.field9979.method2769(class140.field2165, class571.field8118, 18721);
            ++field3290;
        }
    }

    @OriginalMember(owner = "client!dia", name = "a", descriptor = "(III)V")
    public final void method687(int arg0, int arg1, int arg2) {
        if (arg1 != 1782) {
            field3285 = true;
        }
        ++field3286;
        if (this.field3282) {
            super.field9979.method2753((byte) -17, 1);
            super.field9979.method2732(-114, this.field3280[arg0 + -1]);
            super.field9979.method2753((byte) -17, 0);
        }
    }

    @OriginalMember(owner = "client!dia", name = "f", descriptor = "(I)V")
    public static void method1584(int arg0) {
        field3284 = null;
        field3294 = null;
        field3292 = null;
        field3293 = null;
        if (arg0 != -24973) {
            field3292 = null;
        }
    }
}
