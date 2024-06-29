import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class27 extends class220 {

    @OriginalMember(owner = "client!sq", name = "P", descriptor = "I")
    private int field478 = 1;

    @OriginalMember(owner = "client!sq", name = "Z", descriptor = "I")
    private int field488 = 1;

    @OriginalMember(owner = "client!sq", name = "S", descriptor = "[[I")
    public static int[][] field481 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!sq", name = "X", descriptor = "[[S")
    public static short[][] field486 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!sq", name = "W", descriptor = "I")
    public static int field485 = 0;

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!sq", name = "R", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!sq", name = "T", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!sq", name = "U", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!sq", name = "V", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!sq", name = "Y", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V", line = 3)
    public static void method247(boolean arg0) {
        field486 = null;
        if (!arg0) {
            field486 = null;
        }
        field481 = null;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)[[I", line = 18)
    public final int[][] method1(int arg0, int arg1) {
        ++field482;
        int[][] var3 = super.field3135.method1774(arg0, -2);
        if (arg1 != 0) {
            field480 = 100;
        }
        if (super.field3135.field4087) {
            int var4 = this.field478 + this.field478 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field488 + this.field488 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field478 + arg0; this.field478 + arg0 >= var9; ++var9) {
                int[][] var19 = this.method1369(0, (byte) 124, class315.field4510 & var9);
                int[][] var20 = new int[3][class344.field5043];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field488; this.field488 >= var27; ++var27) {
                    int var37 = class392.field5887 & var27;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class344.field5043) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class392.field5887 & var31 - this.field488;
                    int var33 = var21 - var24[var32];
                    ++var31;
                    int var34 = var22 - var25[var32];
                    int var35 = var23 - var26[var32];
                    int var36 = class392.field5887 & this.field488 + var31;
                    var21 = var24[var36] + var33;
                    var23 = var26[var36] + var35;
                    var22 = var25[var36] + var34;
                }
                var8[var9 - (-this.field478 + arg0)] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class344.field5043; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBLil;)V", line = 151)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field3131 = arg2.method1697(97) == 1;
                }
            } else {
                this.field478 = arg2.method1697(arg1 ^ 37);
            }
        } else {
            this.field488 = arg2.method1697(-63);
        }
        if (arg1 != -49) {
            this.method2(-28, (byte) -118, (class265) null);
        }
        ++field487;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)Lkb;", line = 194)
    public static final class80 method248(int arg0, byte arg1) {
        ++field479;
        class80 var2 = (class80) class52.field762.method209(126, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 != 1) {
                field486 = null;
            }
            byte[] var3 = class384.field5744.method1472(arg0, 36, 0);
            class80 var4 = new class80();
            var4.field1090 = arg0;
            if (var3 != null) {
                var4.method506(new class265(var3), -102);
            }
            var4.method503((byte) -48);
            class52.field762.method202(true, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "(II)[I", line = 223)
    public final int[] method43(int arg0, int arg1) {
        ++field484;
        if (arg0 != -11543) {
            method248(-80, (byte) 25);
        }
        int[] var3 = super.field3125.method2005(arg1, (byte) 88);
        if (super.field3125.field4676) {
            int var4 = this.field478 + this.field478 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field488 + this.field488 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field478 + arg1; ~var9 >= ~(this.field478 + arg1); ++var9) {
                int[] var13 = this.method1366(0, (byte) -40, class315.field4510 & var9);
                int[] var14 = new int[class344.field5043];
                int var15 = 0;
                for (int var16 = -this.field488; ~this.field488 <= ~var16; ++var16) {
                    var15 += var13[class392.field5887 & var16];
                }
                int var17 = 0;
                while (var17 < class344.field5043) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field488 + var17 & class392.field5887];
                    ++var17;
                    var15 = var13[this.field488 + var17 & class392.field5887] + var18;
                }
                var8[var9 - -this.field478 + -arg1] = var14;
            }
            for (int var10 = 0; ~class344.field5043 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V", line = 328)
    public class27() {
        super(1, false);
    }
}
