import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class207 extends class278 {

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    private int field2933 = 1;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    private int field2934 = 1;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "Luf;")
    public static class310 field2936 = new class310(81, 6);

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "[I")
    public static int[] field2940 = new int[2];

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Luf;")
    public static class310 field2937;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "[[B")
    public static byte[][] field2938;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
    public static void method1261(int arg0) {
        if (arg0 > -80) {
            field2938 = null;
        }
        field2937 = null;
        field2938 = null;
        field2936 = null;
        field2940 = null;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class207() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field2935;
        if (arg1 == -30446) {
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        super.field3754 = ~arg0.method2099(arg1 ^ -30227) == -2;
                    }
                } else {
                    this.field2933 = arg0.method2099(255);
                }
            } else {
                this.field2934 = arg0.method2099(255);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        ++field2932;
        int[] var3 = super.field3750.method256(arg1, arg0 + -30350);
        if (super.field3750.field554) {
            int var4 = this.field2933 + 1 + this.field2933;
            int var5 = 65536 / var4;
            int var6 = this.field2934 + 1 + this.field2934;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field2933; var9 <= this.field2933 + arg1; ++var9) {
                int[] var13 = this.method1570(arg0 + 9, 0, var9 & class40.field549);
                int[] var14 = new int[class507.field7456];
                int var15 = 0;
                for (int var16 = -this.field2934; var16 <= this.field2934; ++var16) {
                    var15 += var13[class412.field6045 & var16];
                }
                int var17 = 0;
                while (class507.field7456 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field2934 + var17 & class412.field6045];
                    ++var17;
                    var15 = var13[this.field2934 + var17 & class412.field6045] + var18;
                }
                var8[this.field2933 - arg1 + var9] = var14;
            }
            for (int var10 = 0; ~class507.field7456 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return arg0 != -9 ? null : var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[[I")
    public final int[][] method324(int arg0, int arg1) {
        if (arg0 <= 75) {
            this.method324(106, 99);
        }
        ++field2939;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int var4 = this.field2933 - -this.field2933 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2934 - -this.field2934 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field2933; ~(this.field2933 + arg1) <= ~var9; ++var9) {
                int[][] var19 = this.method1568(5426, 0, class40.field549 & var9);
                int[][] var20 = new int[3][class507.field7456];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2934; this.field2934 >= var27; ++var27) {
                    int var37 = class412.field6045 & var27;
                    var21 += var24[var37];
                    var23 += var26[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (class507.field7456 > var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = var31 - this.field2934 & class412.field6045;
                    int var33 = var21 - var24[var32];
                    int var34 = var23 - var26[var32];
                    int var35 = var22 - var25[var32];
                    ++var31;
                    int var36 = this.field2934 + var31 & class412.field6045;
                    var22 = var25[var36] + var35;
                    var23 = var26[var36] + var34;
                    var21 = var24[var36] + var33;
                }
                var8[this.field2933 - arg1 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class507.field7456 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
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
