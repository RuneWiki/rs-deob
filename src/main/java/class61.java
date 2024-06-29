import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class61 extends class5 {

    @OriginalMember(owner = "client!ofa", name = "J", descriptor = "I")
    private int field828 = 1;

    @OriginalMember(owner = "client!ofa", name = "P", descriptor = "I")
    private int field834 = 1;

    @OriginalMember(owner = "client!ofa", name = "O", descriptor = "I")
    public static int field833 = -1;

    @OriginalMember(owner = "client!ofa", name = "H", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ofa", name = "K", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ofa", name = "L", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ofa", name = "M", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ofa", name = "N", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ofa", name = "I", descriptor = "Lrn;")
    public static class335 field827;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIB)Lqba;")
    public static final class592 method371(int arg0, int arg1, byte arg2) {
        int var3 = -105 / ((arg2 - 43) / 43);
        ++field830;
        class592 var4 = (class592) class378.field4782.method399(-32748, (long) arg1 | (long) arg0 << 32);
        if (var4 == null) {
            var4 = new class592(arg0, arg1);
            class378.field4782.method402(var4, (byte) -58, var4.field4199);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        ++field832;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field120 = ~arg1.method3501(-9268) == -2;
                }
            } else {
                this.field834 = arg1.method3501(-9268);
            }
        } else {
            this.field828 = arg1.method3501(arg0 ^ -9267);
        }
        if (arg0 != 1) {
            this.method39(119, 34);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BLjava/io/File;)[B")
    public static final byte[] method372(byte arg0, File arg1) {
        if (arg0 != -103) {
            return null;
        } else {
            ++field826;
            return class354.method1939((byte) 53, arg1, (int) arg1.length());
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method44(int arg0, boolean arg1) {
        if (!arg1) {
            return null;
        } else {
            ++field831;
            int[][] var3 = super.field135.method2706(arg0, -126);
            if (super.field135.field6667) {
                int var4 = this.field834 + 1 + this.field834;
                int var5 = 65536 / var4;
                int var6 = this.field828 + this.field828 + 1;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field834 + arg0; this.field834 + arg0 >= var9; ++var9) {
                    int[][] var19 = this.method45(0, var9 & class669.field9431, 0);
                    int[][] var20 = new int[3][class657.field9287];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field828; ~var27 >= ~this.field828; ++var27) {
                        int var37 = var27 & class194.field2440;
                        var22 += var25[var37];
                        var23 += var26[var37];
                        var21 += var24[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (~class657.field9287 < ~var31) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class194.field2440 & var31 - this.field828;
                        int var33 = var22 - var25[var32];
                        int var34 = var23 - var26[var32];
                        int var35 = var21 - var24[var32];
                        ++var31;
                        int var36 = class194.field2440 & this.field828 + var31;
                        var22 = var25[var36] + var33;
                        var23 = var26[var36] + var34;
                        var21 = var24[var36] + var35;
                    }
                    var8[this.field834 + var9 + -arg0] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~class657.field9287 < ~var13; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; var17 < var4; ++var17) {
                        int[][] var18 = var8[var17];
                        var14 += var18[0][var13];
                        var16 += var18[2][var13];
                        var15 += var18[1][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)V")
    public static void method373(boolean arg0) {
        if (arg0) {
            field827 = null;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "()V")
    public class61() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field829;
        int[] var3 = super.field126.method3280(arg1, true);
        int var4 = -24 / ((81 - arg0) / 36);
        if (super.field126.field8392) {
            int var5 = this.field834 + this.field834 + 1;
            int var6 = 65536 / var5;
            int var7 = this.field828 + 1 + this.field828;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = -this.field834 + arg1; var10 <= arg1 - -this.field834; ++var10) {
                int[] var14 = this.method49(class669.field9431 & var10, false, 0);
                int[] var15 = new int[class657.field9287];
                int var16 = 0;
                for (int var17 = -this.field828; var17 <= this.field828; ++var17) {
                    var16 += var14[var17 & class194.field2440];
                }
                int var18 = 0;
                while (~class657.field9287 < ~var18) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[var18 - this.field828 & class194.field2440];
                    ++var18;
                    var16 = var14[class194.field2440 & var18 - -this.field828] + var19;
                }
                var9[-arg1 + var10 + this.field834] = var15;
            }
            for (int var11 = 0; ~class657.field9287 < ~var11; ++var11) {
                int var12 = 0;
                for (int var13 = 0; ~var5 < ~var13; ++var13) {
                    var12 += var9[var13][var11];
                }
                var3[var11] = var6 * var12 >> 16;
            }
        }
        return var3;
    }
}
