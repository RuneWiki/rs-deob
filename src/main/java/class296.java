import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class296 extends class118 {

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    private int field4488 = 1;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "I")
    private int field4489 = 1;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "Z")
    public static boolean field4492 = false;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "Ljg;")
    public static class241 field4486 = new class241(8);

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public static int field4495 = 0;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "[Z")
    public static boolean[] field4497 = new boolean[8];

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "Liq;")
    public static class134 field4494;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "Liq;")
    public static class134 field4496;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
    public static final void method1835(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4485;
        int var5 = -33 / ((arg1 - -36) / 33);
        for (int var6 = 0; var6 < class174.field2662; ++var6) {
            Rectangle var7 = class247.field3700[var6];
            if (~(var7.x + var7.width) < ~arg2 && var7.x < arg2 - -arg4 && ~arg0 > ~(var7.y + var7.height) && var7.y < arg0 + arg3) {
                class71.field931[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field4491;
        int[][] var3 = super.field1549.method2013(arg1, !arg0);
        if (arg0) {
            this.method24(-64, -5, (class385) null);
        }
        if (super.field1549.field4903) {
            int var4 = this.field4489 + this.field4489 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4488 + this.field4488 - -1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field4489 + arg1; ~(this.field4489 + arg1) <= ~var9; ++var9) {
                int[][] var19 = this.method708(class438.field6441 & var9, (byte) -107, 0);
                int[][] var20 = new int[3][class440.field6474];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field4488; ~var27 >= ~this.field4488; ++var27) {
                    int var37 = var27 & class87.field1230;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class440.field6474 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field4488 + var31 & class87.field1230;
                    int var33 = var22 - var25[var32];
                    ++var31;
                    int var34 = var21 - var24[var32];
                    int var35 = var23 - var26[var32];
                    int var36 = class87.field1230 & var31 - -this.field4488;
                    var21 = var24[var36] + var34;
                    var23 = var26[var36] + var35;
                    var22 = var25[var36] + var33;
                }
                var8[this.field4489 + var9 - arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class440.field6474; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var4 < ~var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
    public static void method1836(int arg0) {
        field4497 = null;
        if (arg0 == -913602128) {
            field4494 = null;
            field4496 = null;
            field4486 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class296() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field4490;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field1552 = ~arg2.method2343(255) == -2;
                }
            } else {
                this.field4489 = arg2.method2343(arg1 + 254);
            }
        } else {
            this.field4488 = arg2.method2343(arg1 + 254);
        }
        if (arg1 != 1) {
            field4495 = 53;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        if (arg0 != 1) {
            return null;
        } else {
            ++field4493;
            int[] var3 = super.field1537.method2395(30963, arg1);
            if (super.field1537.field5756) {
                int var4 = this.field4489 + 1 + this.field4489;
                int var5 = 65536 / var4;
                int var6 = this.field4488 - (-this.field4488 + -1);
                int var7 = 65536 / var6;
                int[][] var8 = new int[var4][];
                for (int var9 = -this.field4489 + arg1; ~var9 >= ~(this.field4489 + arg1); ++var9) {
                    int[] var13 = this.method703(0, class438.field6441 & var9, arg0 + -3);
                    int[] var14 = new int[class440.field6474];
                    int var15 = 0;
                    for (int var16 = -this.field4488; ~var16 >= ~this.field4488; ++var16) {
                        var15 += var13[class87.field1230 & var16];
                    }
                    int var17 = 0;
                    while (~class440.field6474 < ~var17) {
                        var14[var17] = var7 * var15 >> 16;
                        int var18 = var15 - var13[-this.field4488 + var17 & class87.field1230];
                        ++var17;
                        var15 = var13[this.field4488 + var17 & class87.field1230] + var18;
                    }
                    var8[var9 - arg1 + this.field4489] = var14;
                }
                for (int var10 = 0; ~var10 > ~class440.field6474; ++var10) {
                    int var11 = 0;
                    for (int var12 = 0; var4 > var12; ++var12) {
                        var11 += var8[var12][var10];
                    }
                    var3[var10] = var5 * var11 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZII)I")
    public static final int method1837(boolean arg0, int arg1, int arg2) {
        ++field4487;
        if (arg0) {
            return 0;
        } else {
            class148 var3 = class432.method2655((byte) 111, arg0, arg1);
            if (var3 == null) {
                return class355.method2129(-4966, arg1).field4945;
            } else {
                int var4 = 0;
                for (int var5 = 0; var5 < var3.field2045.length; ++var5) {
                    if (var3.field2045[var5] == -1) {
                        ++var4;
                    }
                }
                int var6 = -11 / ((arg2 - 13) / 55);
                return var4 + class355.method2129(-4966, arg1).field4945 + -var3.field2045.length;
            }
        }
    }
}
