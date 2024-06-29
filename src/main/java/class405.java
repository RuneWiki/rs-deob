import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class405 extends class346 {

    @OriginalMember(owner = "client!ng", name = "L", descriptor = "I")
    private int field5890 = 1;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    private int field5893 = 1;

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!ng", name = "J", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!ng", name = "K", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!ng", name = "M", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field5888;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field5151 = arg0.method2233((byte) 104) == 1;
                }
            } else {
                this.field5890 = arg0.method2233((byte) 104);
            }
        } else {
            this.field5893 = arg0.method2233((byte) 104);
        }
        if (arg1) {
            this.method38((class341) null, true, -112);
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class405() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 3) {
            this.field5893 = -61;
        }
        ++field5891;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int var4 = this.field5890 + 1 + this.field5890;
            int var5 = 65536 / var4;
            int var6 = this.field5893 - (-this.field5893 + -1);
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field5890 + arg0; ~var9 >= ~(this.field5890 + arg0); ++var9) {
                int[] var13 = this.method2294((byte) 54, var9 & class215.field3000, 0);
                int[] var14 = new int[class134.field1753];
                int var15 = 0;
                for (int var16 = -this.field5893; this.field5893 >= var16; ++var16) {
                    var15 += var13[class188.field2572 & var16];
                }
                int var17 = 0;
                while (~class134.field1753 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class188.field2572 & -this.field5893 + var17];
                    ++var17;
                    var15 = var13[class188.field2572 & this.field5893 + var17] + var18;
                }
                var8[var9 - -this.field5890 + -arg0] = var14;
            }
            for (int var10 = 0; var10 < class134.field1753; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)[[I")
    public final int[][] method287(int arg0, int arg1) {
        ++field5886;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (super.field5170.field6288) {
            int var4 = this.field5890 + 1 + this.field5890;
            int var5 = 65536 / var4;
            int var6 = this.field5893 + this.field5893 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg0 - this.field5890; ~var9 >= ~(this.field5890 + arg0); ++var9) {
                int[][] var19 = this.method2293(0, 0, class215.field3000 & var9);
                int[][] var20 = new int[3][class134.field1753];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field5893; var27 <= this.field5893; ++var27) {
                    int var37 = class188.field2572 & var27;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class134.field1753 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field5893 + var31 & class188.field2572;
                    int var33 = var23 - var26[var32];
                    int var34 = var22 - var25[var32];
                    int var35 = var21 - var24[var32];
                    ++var31;
                    int var36 = class188.field2572 & this.field5893 + var31;
                    var21 = var24[var36] + var35;
                    var22 = var25[var36] + var34;
                    var23 = var26[var36] + var33;
                }
                var8[-arg0 + var9 + this.field5890] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class134.field1753; ++var13) {
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
        return arg1 > -3 ? null : var3;
    }
}
