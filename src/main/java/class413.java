import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class413 extends class748 {

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    private int field5750 = 1;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    private int field5753 = 1;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "[J")
    public static long[] field5757 = new long[32];

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Lqk;")
    public static class148 field5752 = new class148(107, 6);

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "Lqk;")
    public static class148 field5759 = new class148(56, 6);

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class413() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field5754;
        if (!arg1) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        super.field10414 = arg2.method194((byte) 119) == 1;
                    }
                } else {
                    this.field5753 = arg2.method194((byte) 119);
                }
            } else {
                this.field5750 = arg2.method194((byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "(I)V")
    public static void method2517(int arg0) {
        field5752 = null;
        if (arg0 != 512) {
            field5752 = null;
        }
        field5759 = null;
        field5757 = null;
    }

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)V")
    public static final void method2518(int arg0) {
        ++field5755;
        if (~class599.field8597 != 0 && class99.field1429 != -1) {
            if (arg0 <= 45) {
                field5757 = null;
            }
            int var1 = ((-class667.field9397 + class623.field8894) * class704.field9793 >> 16) + class667.field9397;
            class704.field9793 += var1;
            if (~class704.field9793 <= -65536) {
                if (!class233.field3245) {
                    class698.field9719 = true;
                } else {
                    class698.field9719 = false;
                }
                class704.field9793 = 65535;
                class233.field3245 = true;
            } else {
                class698.field9719 = false;
                class233.field3245 = false;
            }
            float var2 = (float) class704.field9793 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class724.field10199 * 2;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = class591.field8479[class599.field8597][var4][var5] * 3;
                int var22 = class591.field8479[class599.field8597][var4 - -1][var5] * 3;
                int var23 = (-class591.field8479[class599.field8597][var4 + 3][var5] - -class591.field8479[class599.field8597][var4 + 2][var5] + class591.field8479[class599.field8597][var4 + 2][var5]) * 3;
                int var24 = class591.field8479[class599.field8597][var4][var5];
                int var25 = var22 - var21;
                int var26 = -(var22 * 2) + var23 + var21;
                int var27 = class591.field8479[class599.field8597][var4 - -2][var5] + -var24 + -var23 + var22;
                var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            }
            class24.field266 = (int) var3[0] - class179.field2535 * 512;
            class57.field798 = (int) var3[1] * -1;
            class235.field3250 = (int) var3[2] + -(class510.field7109 * 512);
            float[] var6 = new float[3];
            int var7 = class48.field710 * 2;
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class591.field8479[class99.field1429][var7][var8] * 3;
                int var15 = class591.field8479[class99.field1429][var7 + 1][var8] * 3;
                int var16 = (class591.field8479[class99.field1429][var7 + 2][var8] - class591.field8479[class99.field1429][var7 + 3][var8] + class591.field8479[class99.field1429][var7 + 2][var8]) * 3;
                int var17 = class591.field8479[class99.field1429][var7][var8];
                int var18 = -var14 + var15;
                int var19 = var14 - var15 * 2 + var16;
                int var20 = class591.field8479[class99.field1429][var7 - -2][var8] + -var17 - (-var15 - -var16);
                var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
            }
            float var9 = var6[0] - var3[0];
            float var10 = (var6[1] + -var3[1]) * -1.0F;
            float var11 = var6[2] - var3[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class403.field5594 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 16383;
            class645.field9148 = (int) (2607.5945876176133D * -Math.atan2((double) var9, (double) var11)) & 16383;
            class520.field7268 = ((class591.field8479[class599.field8597][var4 + 2][3] - class591.field8479[class599.field8597][var4][3]) * class704.field9793 >> 16) + class591.field8479[class599.field8597][var4][3];
        }
    }

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "(I)V")
    public static final void method2519(int arg0) {
        class514.field7178.method3210(false);
        ++field5756;
        if (arg0 != 65536) {
            field5757 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)[[I")
    public final int[][] method445(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field5751;
            int[][] var3 = super.field10420.method930(29784, arg0);
            if (super.field10420.field1979) {
                int var4 = this.field5753 - (-this.field5753 + -1);
                int var5 = 65536 / var4;
                int var6 = this.field5750 - -this.field5750 + 1;
                int var7 = 65536 / var6;
                int[][][] var8 = new int[var4][][];
                for (int var9 = -this.field5753 + arg0; ~var9 >= ~(this.field5753 + arg0); ++var9) {
                    int[][] var19 = this.method4159(0, 0, var9 & class150.field2077);
                    int[][] var20 = new int[3][class424.field5889];
                    int var21 = 0;
                    int var22 = 0;
                    int var23 = 0;
                    int[] var24 = var19[0];
                    int[] var25 = var19[1];
                    int[] var26 = var19[2];
                    for (int var27 = -this.field5750; ~this.field5750 <= ~var27; ++var27) {
                        int var37 = var27 & class354.field4552;
                        var22 += var25[var37];
                        var23 += var26[var37];
                        var21 += var24[var37];
                    }
                    int[] var28 = var20[0];
                    int[] var29 = var20[1];
                    int[] var30 = var20[2];
                    int var31 = 0;
                    while (class424.field5889 > var31) {
                        var28[var31] = var7 * var21 >> 16;
                        var29[var31] = var7 * var22 >> 16;
                        var30[var31] = var7 * var23 >> 16;
                        int var32 = class354.field4552 & -this.field5750 + var31;
                        ++var31;
                        int var33 = var22 - var25[var32];
                        int var34 = var23 - var26[var32];
                        int var35 = var21 - var24[var32];
                        int var36 = var31 - -this.field5750 & class354.field4552;
                        var21 = var24[var36] + var35;
                        var23 = var26[var36] + var34;
                        var22 = var25[var36] + var33;
                    }
                    var8[var9 - -this.field5753 + -arg0] = var20;
                }
                int[] var10 = var3[0];
                int[] var11 = var3[1];
                int[] var12 = var3[2];
                for (int var13 = 0; ~var13 > ~class424.field5889; ++var13) {
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = 0; ~var4 < ~var17; ++var17) {
                        int[][] var18 = var8[var17];
                        var15 += var18[1][var13];
                        var16 += var18[2][var13];
                        var14 += var18[0][var13];
                    }
                    var10[var13] = var5 * var14 >> 16;
                    var11[var13] = var5 * var15 >> 16;
                    var12[var13] = var5 * var16 >> 16;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field5758;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            int var4 = this.field5753 + 1 + this.field5753;
            int var5 = 65536 / var4;
            int var6 = this.field5750 + this.field5750 + 1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field5753 + arg0; this.field5753 + arg0 >= var9; ++var9) {
                int[] var13 = this.method4157(0, (byte) 86, class150.field2077 & var9);
                int[] var14 = new int[class424.field5889];
                int var15 = 0;
                for (int var16 = -this.field5750; var16 <= this.field5750; ++var16) {
                    var15 += var13[class354.field4552 & var16];
                }
                int var17 = 0;
                while (class424.field5889 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class354.field4552 & -this.field5750 + var17];
                    ++var17;
                    var15 = var13[class354.field4552 & this.field5750 + var17] + var18;
                }
                var8[var9 - -this.field5753 + -arg0] = var14;
            }
            for (int var10 = 0; ~var10 > ~class424.field5889; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var4 < ~var12; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        if (arg1 != 255) {
            field5757 = null;
        }
        return var3;
    }
}
