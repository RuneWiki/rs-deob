import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class150 extends class264 {

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    private int field2632 = 1;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    private int field2633 = 1;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "Lcf;")
    public static class93 field2630 = class147.method1066("Mem:", -48);

    @OriginalMember(owner = "client!v", name = "J", descriptor = "Lcf;")
    public static class93 field2628 = class147.method1066("scape main", -48);

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!v", name = "V", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(JIIZ)Lcf;")
    public static final class93 method1080(long arg0, int arg1, int arg2, boolean arg3) {
        ++field2636;
        if (arg1 >= 2 && ~arg1 >= -37) {
            int var5 = 1;
            long var6 = arg0 / (long) arg1;
            while (~var6 != -1L) {
                var6 /= (long) arg1;
                ++var5;
            }
            int var8 = var5;
            if (~arg0 > -1L || arg3) {
                var8 = var5 + 1;
            }
            byte[] var9 = new byte[var8];
            if (~arg0 <= -1L) {
                if (arg3) {
                    var9[0] = 43;
                }
            } else {
                var9[0] = 45;
            }
            for (int var10 = 0; var5 > var10; ++var10) {
                int var12 = (int) (arg0 % (long) arg1);
                arg0 /= (long) arg1;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var12 < -10) {
                    var12 += 39;
                }
                var9[var8 - var10 + -1] = (byte) (var12 + 48);
            }
            if (arg2 < 115) {
                method1082(-93, -6, 58);
            }
            class93 var11 = new class93();
            var11.field1683 = var9;
            var11.field1629 = var8;
            return var11;
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static final void method1081(boolean arg0) {
        if (!arg0) {
            ++field2640;
            class31.field491.method294(0);
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(III)I")
    public static final int method1082(int arg0, int arg1, int arg2) {
        ++field2638;
        int var3 = class133.method975((byte) 36, arg0 + -1, arg2 - 1) - -class133.method975((byte) 13, arg0 - 1, arg2 - -1) - (-class133.method975((byte) 65, arg0 + 1, arg2 + -1) + -class133.method975((byte) 72, arg0 + 1, arg2 + 1));
        if (arg1 < 98) {
            field2629 = -14;
        }
        int var4 = class133.method975((byte) 110, arg0, arg2 + -1) + class133.method975((byte) 72, arg0, arg2 + 1) + class133.method975((byte) 110, arg0 + -1, arg2) + class133.method975((byte) 104, arg0 - -1, arg2);
        int var5 = class133.method975((byte) 50, arg0, arg2);
        return var5 / 4 + (var3 / 16 - -(var4 / 8));
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        if (arg1) {
            this.field2632 = -116;
        }
        ++field2634;
        int[][] var3 = super.field4705.method1089(arg0, 86);
        if (super.field4705.field2670) {
            int var4 = this.field2633 + this.field2633 + 1;
            int var5 = 65536 / var4;
            int var6 = this.field2632 + 1 + this.field2632;
            int[][][] var7 = new int[var6][][];
            for (int var8 = -this.field2632 + arg0; ~var8 >= ~(this.field2632 + arg0); ++var8) {
                int[][] var19 = this.method1773(-125, 0, var8 & class53.field881);
                int[][] var20 = new int[3][class176.field3060];
                int var21 = 0;
                int var22 = 0;
                int[] var23 = var19[0];
                int var24 = 0;
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2633; var27 <= this.field2633; ++var27) {
                    int var37 = class55.field910 & var27;
                    var24 += var25[var37];
                    var22 += var23[var37];
                    var21 += var26[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class176.field3060) {
                    var28[var31] = var5 * var22 >> 16;
                    var29[var31] = var5 * var24 >> 16;
                    var30[var31] = var5 * var21 >> 16;
                    int var32 = -this.field2633 + var31 & class55.field910;
                    int var33 = var24 - var25[var32];
                    ++var31;
                    int var34 = var21 - var26[var32];
                    int var35 = var22 - var23[var32];
                    int var36 = this.field2633 + var31 & class55.field910;
                    var21 = var26[var36] + var34;
                    var22 = var23[var36] + var35;
                    var24 = var25[var36] + var33;
                }
                var7[this.field2632 + var8 + -arg0] = var20;
            }
            int var9 = 65536 / var6;
            int[] var10 = var3[1];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            for (int var13 = 0; ~var13 > ~class176.field3060; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var6; ++var17) {
                    int[][] var18 = var7[var17];
                    var14 += var18[0][var13];
                    var16 += var18[1][var13];
                    var15 += var18[2][var13];
                }
                var11[var13] = var9 * var14 >> 16;
                var10[var13] = var9 * var16 >> 16;
                var12[var13] = var9 * var15 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static void method1083(byte arg0) {
        int var1 = 96 / ((arg0 - -88) / 37);
        field2628 = null;
        field2630 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field2637;
        if (arg0 < 11) {
            method1083((byte) 97);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field4698 = ~arg2.method1907(16832) == -2;
                }
            } else {
                this.field2632 = arg2.method1907(16832);
            }
        } else {
            this.field2633 = arg2.method1907(16832);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        if (arg1 >= -83) {
            method1081(true);
        }
        ++field2631;
        int[] var3 = super.field4716.method532((byte) 79, arg0);
        if (super.field4716.field1424) {
            int var4 = this.field2632 + this.field2632 - -1;
            int var5 = 65536 / var4;
            int var6 = this.field2633 + this.field2633 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = arg0 - this.field2632; this.field2632 + arg0 >= var9; ++var9) {
                int[] var13 = this.method1767(0, var9 & class53.field881, 21654);
                int[] var14 = new int[class176.field3060];
                int var15 = 0;
                for (int var16 = -this.field2633; ~var16 >= ~this.field2633; ++var16) {
                    var15 += var13[var16 & class55.field910];
                }
                int var17 = 0;
                while (class176.field3060 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class55.field910 & -this.field2633 + var17];
                    ++var17;
                    var15 = var13[this.field2633 + var17 & class55.field910] + var18;
                }
                var8[this.field2632 + var9 + -arg0] = var14;
            }
            for (int var10 = 0; ~class176.field3060 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var4 > var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class150() {
        super(1, false);
    }
}
