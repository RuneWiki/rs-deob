import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class25 extends class40 {

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    private int field312 = 1;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    private int field315 = 1;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "Lub;")
    public static class15 field311 = new class15(200);

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!be", name = "S", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!be", name = "T", descriptor = "Lvj;")
    public static class256 field317;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "[[I")
    public static int[][] field314;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V", line = 3)
    public static void method133(int arg0) {
        field317 = null;
        field314 = null;
        if (arg0 != 1298474736) {
            field314 = null;
        }
        field311 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 18)
    public class25() {
        super(1, false);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILlf;)V", line = 22)
    public final void method43(int arg0, int arg1, class130 arg2) {
        ++field316;
        if (arg1 <= 79) {
            field314 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    super.field550 = arg2.method837(true) == 1;
                }
            } else {
                this.field315 = arg2.method837(true);
            }
        } else {
            this.field312 = arg2.method837(true);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)[I", line = 73)
    public final int[] method44(byte arg0, int arg1) {
        ++field309;
        int[] var3 = super.field551.method185(65280, arg1);
        if (arg0 >= -20) {
            method134(99, (byte) 34, 32);
        }
        if (super.field551.field441) {
            int var4 = this.field315 + this.field315 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field312 + 1 + this.field312;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg1 - this.field315; ~var9 >= ~(arg1 - -this.field315); ++var9) {
                int[] var13 = this.method266((byte) -116, class169.field2395 & var9, 0);
                int[] var14 = new int[class410.field5886];
                int var15 = 0;
                for (int var16 = -this.field312; this.field312 >= var16; ++var16) {
                    var15 += var13[class84.field1067 & var16];
                }
                int var17 = 0;
                while (class410.field5886 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[var17 - this.field312 & class84.field1067];
                    ++var17;
                    var15 = var13[this.field312 + var17 & class84.field1067] + var18;
                }
                var8[-arg1 + this.field315 + var9] = var14;
            }
            for (int var10 = 0; class410.field5886 > var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[[I", line = 167)
    public final int[][] method112(int arg0, int arg1) {
        ++field313;
        if (arg0 != 1) {
            this.method44((byte) -86, -59);
        }
        int[][] var3 = super.field555.method2070(0, arg1);
        if (super.field555.field4489) {
            int var4 = this.field315 + this.field315 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field312 + 1 + this.field312;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field315 + arg1; var9 <= this.field315 + arg1; ++var9) {
                int[][] var19 = this.method261(0, arg0 ^ 28553, var9 & class169.field2395);
                int[][] var20 = new int[3][class410.field5886];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field312; var27 <= this.field312; ++var27) {
                    int var37 = var27 & class84.field1067;
                    var23 += var26[var37];
                    var21 += var24[var37];
                    var22 += var25[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (~var31 > ~class410.field5886) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = -this.field312 + var31 & class84.field1067;
                    int var33 = var23 - var26[var32];
                    int var34 = var22 - var25[var32];
                    int var35 = var21 - var24[var32];
                    ++var31;
                    int var36 = this.field312 + var31 & class84.field1067;
                    var21 = var24[var36] + var35;
                    var22 = var25[var36] + var34;
                    var23 = var26[var36] + var33;
                }
                var8[-arg1 + this.field315 + var9] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; var13 < class410.field5886; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
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
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)I", line = 305)
    public static final int method134(int arg0, byte arg1, int arg2) {
        if (arg1 != 102) {
            field317 = null;
        }
        ++field310;
        int var3 = class450.method2800(arg2 - 1, arg0 + -1, 789221) + class450.method2800(arg2 + -1, arg0 - -1, 789221) - (-class450.method2800(arg2 + 1, arg0 + -1, 789221) + -class450.method2800(arg2 + 1, arg0 + 1, 789221));
        int var4 = class450.method2800(arg2, arg0 + -1, arg1 + 789119) + (class450.method2800(arg2, arg0 - -1, 789221) - -class450.method2800(arg2 + -1, arg0, 789221)) + class450.method2800(arg2 + 1, arg0, 789221);
        int var5 = class450.method2800(arg2, arg0, 789221);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }
}
