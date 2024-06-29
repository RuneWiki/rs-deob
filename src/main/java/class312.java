import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class312 extends class56 {

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "I")
    private int field4324 = 1;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
    private int field4327 = 1;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
    public static int field4326 = 0;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field4331 = 1;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)[[I", line = 9)
    public final int[][] method5(int arg0, int arg1) {
        ++field4332;
        int[][] var3 = super.field668.method3009(0, arg0);
        if (super.field668.field7292) {
            int var4 = this.field4324 - -1 + this.field4324;
            int var5 = 65536 / var4;
            int var6 = this.field4327 + this.field4327 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field4324 + arg0; ~var9 >= ~(this.field4324 + arg0); ++var9) {
                int[][] var19 = this.method369(class636.field8759 & var9, -54, 0);
                int[][] var20 = new int[3][class328.field4576];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field4327; ~var27 >= ~this.field4327; ++var27) {
                    int var37 = class445.field6318 & var27;
                    var23 += var26[var37];
                    var21 += var24[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class328.field4576 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class445.field6318 & -this.field4327 + var31;
                    int var33 = var21 - var24[var32];
                    int var34 = var22 - var25[var32];
                    int var35 = var23 - var26[var32];
                    ++var31;
                    int var36 = this.field4327 + var31 & class445.field6318;
                    var22 = var25[var36] + var34;
                    var21 = var24[var36] + var33;
                    var23 = var26[var36] + var35;
                }
                var8[var9 - -this.field4324 + -arg0] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class328.field4576; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return arg1 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V", line = 146)
    public class312() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IZ)[I", line = 153)
    public final int[] method24(int arg0, boolean arg1) {
        ++field4325;
        if (!arg1) {
            field4331 = 89;
        }
        int[] var3 = super.field673.method3270(arg0, (byte) -42);
        if (super.field673.field8073) {
            int var4 = this.field4324 - -this.field4324 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field4327 - -1 + this.field4327;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field4324 + arg0; this.field4324 + arg0 >= var9; ++var9) {
                int[] var13 = this.method367(4463, 0, var9 & class636.field8759);
                int[] var14 = new int[class328.field4576];
                int var15 = 0;
                for (int var16 = -this.field4327; this.field4327 >= var16; ++var16) {
                    var15 += var13[class445.field6318 & var16];
                }
                int var17 = 0;
                while (var17 < class328.field4576) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field4327 + var17 & class445.field6318];
                    ++var17;
                    var15 = var13[class445.field6318 & this.field4327 + var17] + var18;
                }
                var8[this.field4324 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; class328.field4576 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([Ljava/awt/Rectangle;IB)V", line = 242)
    public static final void method2024(Rectangle[] arg0, int arg1, byte arg2) throws class76 {
        ++field4333;
        if (arg2 == -66) {
            if (~class221.field2883 != -2) {
                class263.field3799.method375(arg0, arg1, 0, 0);
            } else {
                class263.field3799.method375(arg0, arg1, class143.field2043, class155.field2166);
            }
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILee;I)V", line = 258)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (arg0 != 3731) {
            this.method24(66, false);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field674 = arg1.method3750((byte) 35) == 1;
                }
            } else {
                this.field4324 = arg1.method3750((byte) 35);
            }
        } else {
            this.field4327 = arg1.method3750((byte) 35);
        }
        ++field4329;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(BLee;)Lpj;", line = 308)
    public static final class145 method2025(byte arg0, class675 arg1) {
        ++field4330;
        int var2 = arg1.method3750((byte) 35);
        class3 var3 = class759.method4211(-11911)[arg1.method3750((byte) 35)];
        class120 var4 = class720.method4047(25992)[arg1.method3750((byte) 35)];
        int var5 = arg1.method3706((byte) -89);
        int var6 = arg1.method3706((byte) 75);
        int var7 = arg1.method3757((byte) -65);
        int var8 = arg1.method3757((byte) -65);
        if (arg0 < 16) {
            field4331 = -27;
        }
        int var9 = arg1.method3703(124);
        int var10 = arg1.method3703(101);
        int var11 = arg1.method3703(106);
        boolean var12 = arg1.method3750((byte) 35) == 1;
        return new class145(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }
}
