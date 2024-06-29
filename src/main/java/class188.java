import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class188 extends class397 {

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    private int field2677 = 1;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    private int field2682 = 1;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "Loi;")
    public static class49 field2681;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        if (arg0 <= 81) {
            return null;
        } else {
            ++field2678;
            int[][] var3 = super.field5848.method1692(arg1, 116);
            if (super.field5848.field3939) {
                int var4 = this.field2677 + 1 + this.field2677;
                int var5 = 65536 / var4;
                int var6 = this.field2682 - (-this.field2682 + -1);
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field2677 + arg1; ~(arg1 - -this.field2677) <= ~var9; ++var9) {
                    int[][] var19 = this.method2377(class340.field4948 & var9, -68, 0);
                    int[][] var20 = new int[3][class164.field2152];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field2682; ~this.field2682 <= ~var27; ++var27) {
                        int var37 = class107.field1429 & var27;
                        var22 += var25[var37];
                        var21 += var24[var37];
                        var23 += var26[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (var31 < class164.field2152) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = -this.field2682 + var31 & class107.field1429;
                        int var33 = var23 - var26[var32];
                        ++var31;
                        int var34 = var21 - var24[var32];
                        int var35 = var22 - var25[var32];
                        int var36 = var31 - -this.field2682 & class107.field1429;
                        var21 = var24[var36] + var34;
                        var23 = var26[var36] + var33;
                        var22 = var25[var36] + var35;
                    }
                    var8[this.field2677 + var9 + -arg1] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~class164.field2152 < ~var13; ++var13) {
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

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        if (arg0 != -780833076) {
            this.field2677 = 119;
        }
        ++field2679;
        int[] var3 = super.field5854.method465(arg1, 111);
        if (super.field5854.field991) {
            int var4 = this.field2677 - -1 + this.field2677;
            int var5 = 65536 / var4;
            int var6 = this.field2682 + this.field2682 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field2677 + arg1; ~(this.field2677 + arg1) <= ~var9; ++var9) {
                int[] var13 = this.method2376(78, 0, var9 & class340.field4948);
                int[] var14 = new int[class164.field2152];
                int var15 = 0;
                for (int var16 = -this.field2682; ~this.field2682 <= ~var16; ++var16) {
                    var15 += var13[class107.field1429 & var16];
                }
                int var17 = 0;
                while (~class164.field2152 < ~var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field2682 + var17 & class107.field1429];
                    ++var17;
                    var15 = var13[class107.field1429 & var17 - -this.field2682] + var18;
                }
                var8[-arg1 + this.field2677 + var9] = var14;
            }
            for (int var10 = 0; class164.field2152 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
    public class188() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)V")
    public static void method1194(boolean arg0) {
        field2681 = null;
        if (!arg0) {
            method1194(true);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field5859 = arg2.method941((byte) 124) == 1;
                }
            } else {
                this.field2677 = arg2.method941((byte) 125);
            }
        } else {
            this.field2682 = arg2.method941((byte) 124);
        }
        if (arg1 != 80) {
            field2681 = null;
        }
        ++field2676;
    }
}
