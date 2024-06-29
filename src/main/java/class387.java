import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class387 extends class529 {

    @OriginalMember(owner = "client!sia", name = "J", descriptor = "I")
    private int field5389 = 1;

    @OriginalMember(owner = "client!sia", name = "I", descriptor = "I")
    private int field5388 = 1;

    @OriginalMember(owner = "client!sia", name = "L", descriptor = "I")
    public static int field5391 = 1405;

    @OriginalMember(owner = "client!sia", name = "G", descriptor = "F")
    public static float field5386;

    @OriginalMember(owner = "client!sia", name = "D", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!sia", name = "F", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!sia", name = "H", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!sia", name = "K", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method592(int arg0, int arg1) {
        ++field5384;
        int[][] var3 = super.field7450.method2241(-1, arg0);
        if (arg1 != 2) {
            this.method592(-101, 114);
        }
        if (super.field7450.field5165) {
            int var4 = this.field5389 + 1 + this.field5389;
            int var5 = 65536 / var4;
            int var6 = this.field5388 - -1 + this.field5388;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field5389 + arg0; var9 <= arg0 - -this.field5389; ++var9) {
                int[][] var19 = this.method3026(0, var9 & class33.field516, 18464);
                int[][] var20 = new int[3][class304.field3909];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field5388; var27 <= this.field5388; ++var27) {
                    int var37 = var27 & class404.field5700;
                    var21 += var24[var37];
                    var22 += var25[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class304.field3909) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field5388 & class404.field5700;
                    ++var31;
                    int var33 = var23 - var26[var32];
                    int var34 = var21 - var24[var32];
                    int var35 = var22 - var25[var32];
                    int var36 = class404.field5700 & this.field5388 + var31;
                    var22 = var25[var36] + var35;
                    var21 = var24[var36] + var34;
                    var23 = var26[var36] + var33;
                }
                var8[this.field5389 + var9 + -arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class304.field3909 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
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

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IBLtn;)V", line = 142)
    public final void method190(int arg0, byte arg1, class179 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field7461 = arg2.method1094(255) == 1;
                }
            } else {
                this.field5389 = arg2.method1094(255);
            }
        } else {
            this.field5388 = arg2.method1094(255);
        }
        if (arg1 <= 45) {
            method2318(67);
        }
        ++field5390;
    }

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "(I)V", line = 186)
    public static final void method2318(int arg0) {
        if (arg0 == -3699) {
            ++field5385;
            if (!class86.field1104) {
                class661.field9067 += (24.0F - class661.field9067) / 2.0F;
                class86.field1104 = true;
                class70.field945 = true;
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "<init>", descriptor = "()V", line = 206)
    public class387() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(IB)[I", line = 211)
    public final int[] method191(int arg0, byte arg1) {
        ++field5387;
        int[] var3 = super.field7456.method1635(arg0, -101);
        int var4 = -32 / ((arg1 - 27) / 49);
        if (super.field7456.field3449) {
            int var5 = this.field5389 - (-this.field5389 + -1);
            int var6 = 65536 / var5;
            int var7 = this.field5388 - -this.field5388 + 1;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = -this.field5389 + arg0; this.field5389 + arg0 >= var10; ++var10) {
                int[] var14 = this.method3028((byte) 124, class33.field516 & var10, 0);
                int[] var15 = new int[class304.field3909];
                int var16 = 0;
                for (int var17 = -this.field5388; this.field5388 >= var17; ++var17) {
                    var16 += var14[var17 & class404.field5700];
                }
                int var18 = 0;
                while (var18 < class304.field3909) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[var18 - this.field5388 & class404.field5700];
                    ++var18;
                    var16 = var14[var18 - -this.field5388 & class404.field5700] + var19;
                }
                var9[-arg0 + var10 - -this.field5389] = var15;
            }
            for (int var11 = 0; var11 < class304.field3909; ++var11) {
                int var12 = 0;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var12 += var9[var13][var11];
                }
                var3[var11] = var6 * var12 >> 16;
            }
        }
        return var3;
    }
}
