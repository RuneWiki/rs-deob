import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class148 {

    @OriginalMember(owner = "client!ft", name = "K", descriptor = "I")
    private int field47 = 1;

    @OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
    private int field51 = 1;

    @OriginalMember(owner = "client!ft", name = "Q", descriptor = "[I")
    public static int[] field53 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!ft", name = "L", descriptor = "Lri;")
    public static class73 field48 = new class73(58, 8);

    @OriginalMember(owner = "client!ft", name = "S", descriptor = "I")
    public static int field55 = 0;

    @OriginalMember(owner = "client!ft", name = "J", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!ft", name = "M", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ft", name = "N", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ft", name = "R", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!ft", name = "U", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!ft", name = "T", descriptor = "Lwp;")
    public static class118 field56;

    @OriginalMember(owner = "client!ft", name = "P", descriptor = "[[S")
    public static short[][] field52;

    @OriginalMember(owner = "client!ft", name = "V", descriptor = "[[[I")
    public static int[][][] field58;

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
    public class4() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2183 = ~arg1.method1428(32122) == -2;
                }
            } else {
                this.field47 = arg1.method1428(32122);
            }
        } else {
            this.field51 = arg1.method1428(32122);
        }
        int var5 = -120 % ((-88 - arg2) / 33);
        ++field49;
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(I)V")
    public static void method24(int arg0) {
        field48 = null;
        field58 = null;
        field56 = null;
        if (arg0 == 19783) {
            field52 = null;
            field53 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field50;
        if (arg0 > -65) {
            field52 = null;
        }
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int var4 = this.field47 - -this.field47 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field51 - -1 + this.field51;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field47 + arg1; ~(this.field47 + arg1) <= ~var9; ++var9) {
                int[] var13 = this.method971(false, class39.field569 & var9, 0);
                int[] var14 = new int[class320.field4579];
                int var15 = 0;
                for (int var16 = -this.field51; ~this.field51 <= ~var16; ++var16) {
                    var15 += var13[var16 & class304.field4339];
                }
                int var17 = 0;
                while (~var17 > ~class320.field4579) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[var17 - this.field51 & class304.field4339];
                    ++var17;
                    var15 = var13[class304.field4339 & this.field51 + var17] + var18;
                }
                var8[-arg1 + this.field47 + var9] = var14;
            }
            for (int var10 = 0; var10 < class320.field4579; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "(B)V")
    public static final void method26(byte arg0) {
        if (arg0 < -40) {
            ++field54;
            class29.field302.method1540(0);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method27(boolean arg0, int arg1) {
        ++field46;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033) {
            int var4 = this.field47 + this.field47 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field51 + 1 + this.field51;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field47 + arg1; var9 <= arg1 - -this.field47; ++var9) {
                int[][] var19 = this.method974(true, 0, class39.field569 & var9);
                int[][] var20 = new int[3][class320.field4579];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field51; var27 <= this.field51; ++var27) {
                    int var37 = var27 & class304.field4339;
                    var23 += var26[var37];
                    var22 += var25[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class320.field4579 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class304.field4339 & var31 - this.field51;
                    int var33 = var23 - var26[var32];
                    int var34 = var21 - var24[var32];
                    ++var31;
                    int var35 = var22 - var25[var32];
                    int var36 = this.field51 + var31 & class304.field4339;
                    var21 = var24[var36] + var34;
                    var23 = var26[var36] + var33;
                    var22 = var25[var36] + var35;
                }
                var8[this.field47 + var9 - arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class320.field4579 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
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
        if (!arg0) {
            this.field47 = -69;
        }
        return var3;
    }
}
