import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class177 extends class139 {

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    private int field2536 = 1;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    private int field2537 = 1;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "Lus;")
    public static class1 field2535 = new class1(85, -1);

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "Z")
    public static boolean field2543 = false;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "Lbh;")
    public static class27 field2544;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "[[[B")
    public static byte[][][] field2545;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "[[[I")
    public static int[][][] field2542;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static void method1084(int arg0) {
        field2535 = null;
        field2544 = null;
        if (arg0 == 1) {
            field2542 = null;
            field2545 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field2541;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (arg0 >= -67) {
            field2543 = false;
        }
        if (super.field1835.field2395) {
            int var4 = this.field2537 + this.field2537 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2536 + this.field2536 - -1;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field2537 + arg1; ~var9 >= ~(this.field2537 + arg1); ++var9) {
                int[][] var19 = this.method882(0, var9 & class388.field5511, 1);
                int[][] var20 = new int[3][class356.field5147];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2536; ~var27 >= ~this.field2536; ++var27) {
                    int var37 = var27 & class414.field5822;
                    var22 += var25[var37];
                    var23 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~class356.field5147 < ~var31) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field2536 + var31 & class414.field5822;
                    int var33 = var23 - var26[var32];
                    int var34 = var22 - var25[var32];
                    ++var31;
                    int var35 = var21 - var24[var32];
                    int var36 = this.field2536 + var31 & class414.field5822;
                    var21 = var24[var36] + var35;
                    var22 = var25[var36] + var34;
                    var23 = var26[var36] + var33;
                }
                var8[this.field2537 + var9 - arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; ~class356.field5147 < ~var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var4 > var17; ++var17) {
                    int[][] var18 = var8[var17];
                    var14 += var18[0][var13];
                    var15 += var18[1][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field2539;
        int[] var3 = super.field1844.method2176(arg0, arg1 ^ arg1);
        if (super.field1844.field5045) {
            int var4 = this.field2537 + 1 + this.field2537;
            int var5 = 65536 / var4;
            int var6 = this.field2536 + this.field2536 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field2537 + arg0; arg0 - -this.field2537 >= var9; ++var9) {
                int[] var13 = this.method879((byte) -29, class388.field5511 & var9, 0);
                int[] var14 = new int[class356.field5147];
                int var15 = 0;
                for (int var16 = -this.field2536; ~var16 >= ~this.field2536; ++var16) {
                    var15 += var13[var16 & class414.field5822];
                }
                int var17 = 0;
                while (var17 < class356.field5147) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class414.field5822 & -this.field2536 + var17];
                    ++var17;
                    var15 = var13[this.field2536 + var17 & class414.field5822] + var18;
                }
                var8[-arg0 + var9 + this.field2537] = var14;
            }
            for (int var10 = 0; class356.field5147 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field1841 = ~arg0.method1701(arg1 ^ 23164) == -2;
                }
            } else {
                this.field2537 = arg0.method1701(arg1 + -23076);
            }
        } else {
            this.field2536 = arg0.method1701(-23121);
        }
        if (arg1 != -45) {
            field2544 = null;
        }
        ++field2540;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
    public class177() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "(B)Z")
    public static final boolean method1085(byte arg0) {
        ++field2538;
        if (class370.field5341) {
            try {
                class429.method2520(class252.field3718.field6021, (byte) 107, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 35) {
            field2544 = null;
        }
        return false;
    }
}
