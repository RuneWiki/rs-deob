import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class64 extends class273 {

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    private int field1058 = 1;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    private int field1057 = 1;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field1062;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "[[[B")
    public static byte[][][] field1060;

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class64() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lig;II)V")
    public final void method2(class136 arg0, int arg1, int arg2) {
        ++field1062;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field4358 = arg0.method1012(arg2 ^ 1) == 1;
                }
            } else {
                this.field1057 = arg0.method1012(arg2 ^ 1);
            }
        } else {
            this.field1058 = arg0.method1012(arg2 ^ 1);
        }
        if (arg2 != 5) {
            this.method4(true, -52);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)[I")
    public final int[] method4(boolean arg0, int arg1) {
        ++field1059;
        if (arg0) {
            this.field1057 = 49;
        }
        int[] var3 = super.field4359.method387((byte) -90, arg1);
        if (super.field4359.field833) {
            int var4 = this.field1058 + 1 + this.field1058;
            int var5 = this.field1057 + 1 + this.field1057;
            int var6 = 65536 / var5;
            int var7 = 65536 / var4;
            int[][] var8 = new int[var5][];
            for (int var9 = arg1 - this.field1057; ~var9 >= ~(arg1 - -this.field1057); ++var9) {
                int[] var13 = this.method1850(var9 & class145.field2392, 0, (byte) -124);
                int[] var14 = new int[class26.field458];
                int var15 = 0;
                for (int var16 = -this.field1058; ~var16 >= ~this.field1058; ++var16) {
                    var15 += var13[var16 & client.field4573];
                }
                int var17 = 0;
                while (~var17 > ~class26.field458) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field1058 + var17 & client.field4573];
                    ++var17;
                    var15 = var13[var17 - -this.field1058 & client.field4573] + var18;
                }
                var8[var9 - arg1 + this.field1057] = var14;
            }
            for (int var10 = 0; class26.field458 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var5; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var6 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)V")
    public static void method497(byte arg0) {
        if (arg0 <= 90) {
            method497((byte) 57);
        }
        field1060 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[[I")
    public final int[][] method3(int arg0, int arg1) {
        if (arg0 < 122) {
            this.field1058 = 21;
        }
        ++field1061;
        int[][] var3 = super.field4357.method1949(true, arg1);
        if (super.field4357.field4631) {
            int var4 = this.field1057 + this.field1057 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field1058 + this.field1058 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field1057; this.field1057 + arg1 >= var9; ++var9) {
                int[][] var19 = this.method1853(0, class145.field2392 & var9, (byte) 8);
                int var20 = 0;
                int[][] var21 = new int[3][class26.field458];
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[1];
                int[] var25 = var19[0];
                int[] var26 = var19[2];
                for (int var27 = -this.field1058; this.field1058 >= var27; ++var27) {
                    int var37 = client.field4573 & var27;
                    var22 += var26[var37];
                    var23 += var24[var37];
                    var20 += var25[var37];
                }
                int[] var28 = var21[0];
                int[] var29 = var21[1];
                int[] var30 = var21[2];
                int var31 = 0;
                while (class26.field458 > var31) {
                    var28[var31] = var7 * var20 >> 16;
                    var29[var31] = var7 * var23 >> 16;
                    var30[var31] = var7 * var22 >> 16;
                    int var32 = -this.field1058 + var31 & client.field4573;
                    int var33 = var23 - var24[var32];
                    int var34 = var20 - var25[var32];
                    int var35 = var22 - var26[var32];
                    ++var31;
                    int var36 = client.field4573 & this.field1058 + var31;
                    var22 = var26[var36] + var35;
                    var23 = var24[var36] + var33;
                    var20 = var25[var36] + var34;
                }
                var8[this.field1057 - arg1 + var9] = var21;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class26.field458 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[1][var13];
                    var16 += var18[2][var13];
                    var15 += var18[0][var13];
                }
                var10[var13] = var5 * var15 >> 16;
                var11[var13] = var5 * var14 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)I")
    public static int method498(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
