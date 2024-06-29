import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class425 extends class82 {

    @OriginalMember(owner = "client!is", name = "M", descriptor = "I")
    private int field5471 = 1;

    @OriginalMember(owner = "client!is", name = "Q", descriptor = "I")
    private int field5475 = 1;

    @OriginalMember(owner = "client!is", name = "L", descriptor = "Lvj;")
    public static class373 field5470 = new class373(94, 6);

    @OriginalMember(owner = "client!is", name = "T", descriptor = "Lui;")
    public static class193 field5478 = new class193();

    @OriginalMember(owner = "client!is", name = "V", descriptor = "Z")
    public static boolean field5480 = true;

    @OriginalMember(owner = "client!is", name = "O", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!is", name = "P", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!is", name = "R", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!is", name = "S", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!is", name = "U", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!is", name = "N", descriptor = "[I")
    public static int[] field5472;

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "()V", line = 4)
    public class425() {
        super(1, false);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IILos;)V", line = 18)
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field5474;
        int var4 = -124 / ((-69 - arg1) / 42);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field999 = ~arg2.method2129(-107) == -2;
                }
            } else {
                this.field5475 = arg2.method2129(-68);
            }
        } else {
            this.field5471 = arg2.method2129(-81);
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(II)[[I", line = 63)
    public final int[][] method481(int arg0, int arg1) {
        ++field5473;
        int[][] var3 = super.field992.method3178(arg1, arg0 + -1000);
        if (super.field992.field7962) {
            int var4 = this.field5475 + this.field5475 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field5471 - -this.field5471 + 1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = arg1 - this.field5475; var9 <= this.field5475 + arg1; ++var9) {
                int[][] var19 = this.method488(0, class466.field6523 & var9, arg0 + -999);
                int[][] var20 = new int[3][class629.field9033];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field5471; ~this.field5471 <= ~var27; ++var27) {
                    int var37 = class129.field1590 & var27;
                    var22 += var25[var37];
                    var21 += var24[var37];
                    var23 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class629.field9033 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class129.field1590 & -this.field5471 + var31;
                    ++var31;
                    int var33 = var21 - var24[var32];
                    int var34 = var22 - var25[var32];
                    int var35 = var23 - var26[var32];
                    int var36 = this.field5471 + var31 & class129.field1590;
                    var23 = var26[var36] + var35;
                    var21 = var24[var36] + var33;
                    var22 = var25[var36] + var34;
                }
                var8[var9 - (-this.field5475 + arg1)] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class629.field9033; ++var13) {
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
        if (arg0 != 1000) {
            field5478 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!is", name = "h", descriptor = "(I)V", line = 196)
    public static void method2394(int arg0) {
        if (arg0 == -16294) {
            field5472 = null;
            field5478 = null;
            field5470 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(II)[I", line = 208)
    public final int[] method201(int arg0, int arg1) {
        ++field5477;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (arg1 != 12218) {
            method2395(true);
        }
        if (super.field990.field3641) {
            int var4 = this.field5475 + this.field5475 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field5471 - -this.field5471 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field5475 + arg0; ~var9 >= ~(this.field5475 + arg0); ++var9) {
                int[] var13 = this.method489(false, 0, class466.field6523 & var9);
                int[] var14 = new int[class629.field9033];
                int var15 = 0;
                for (int var16 = -this.field5471; ~this.field5471 <= ~var16; ++var16) {
                    var15 += var13[class129.field1590 & var16];
                }
                int var17 = 0;
                while (class629.field9033 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[-this.field5471 + var17 & class129.field1590];
                    ++var17;
                    var15 = var13[class129.field1590 & this.field5471 + var17] + var18;
                }
                var8[this.field5475 - arg0 + var9] = var14;
            }
            for (int var10 = 0; ~var10 > ~class629.field9033; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Z)V", line = 300)
    public static final void method2395(boolean arg0) {
        ++field5476;
        if (!class605.field8734) {
            class546.method3203(0, class593.field8615);
            if (class292.field3786 != null) {
                class546.method3203(0, class292.field3786);
            }
            class605.field8734 = arg0;
        }
    }
}
