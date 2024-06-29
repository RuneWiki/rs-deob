import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class261 extends class13 {

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    private int field3649 = 3072;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    private int field3656 = 2048;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    private int field3647 = 1024;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "Laq;")
    public static class90 field3648 = new class90();

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "Laq;")
    public static class90 field3657 = new class90();

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
    public static void method1711(int arg0) {
        int var1 = 25 % ((arg0 - -35) / 34);
        field3648 = null;
        field3657 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg1 > 50) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 == 2) {
                        super.field259 = arg0.method172((byte) 52) == 1;
                    }
                } else {
                    this.field3649 = arg0.method174(255);
                }
            } else {
                this.field3647 = arg0.method174(255);
            }
            ++field3654;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public final void method33(int arg0) {
        ++field3646;
        int var2 = -125 / ((arg0 - 2) / 51);
        this.field3656 = this.field3649 - this.field3647;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class261() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(B)V")
    public static final void method1712(byte arg0) {
        if (arg0 >= -118) {
            method1713(52);
        }
        ++field3652;
        if (class200.field2763 != null) {
            while (true) {
                while (~class333.field4589 > ~class198.field2753.length) {
                    class437 var1 = class198.field2753[class333.field4589];
                    if (var1 != null && ~var1.field6145 == 0) {
                        if (class253.field3560 == null) {
                            class253.field3560 = class200.field2763.method1336(24, var1.field6150);
                        }
                        int var2 = class253.field3560.field2078;
                        if (var2 == -1) {
                            return;
                        }
                        class253.field3560 = null;
                        var1.field6145 = var2;
                        ++class333.field4589;
                    } else {
                        ++class333.field4589;
                    }
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[[I")
    public final int[][] method222(int arg0, int arg1) {
        if (arg0 != -27832) {
            this.method33(60);
        }
        ++field3655;
        int[][] var3 = super.field256.method1930(arg1, (byte) 93);
        if (super.field256.field4154) {
            int[][] var4 = this.method227(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class269.field3751; ++var11) {
                var8[var11] = (var5[var11] * this.field3656 >> 12) + this.field3647;
                var9[var11] = this.field3647 - -(var6[var11] * this.field3656 >> 12);
                var10[var11] = (var7[var11] * this.field3656 >> 12) + this.field3647;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field3653;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (!arg0) {
            method1714(-78);
        }
        if (super.field263.field1845) {
            int[] var4 = this.method223(0, -11541, arg1);
            for (int var5 = 0; ~var5 > ~class269.field3751; ++var5) {
                var3[var5] = (var4[var5] * this.field3656 >> 12) + this.field3647;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
    public static final void method1713(int arg0) {
        if (arg0 <= 36) {
            method1714(-86);
        }
        ++field3651;
        class131 var1 = class206.field2830;
        synchronized (class206.field2830) {
            class206.field2830.method905((byte) 114);
        }
        class131 var2 = class113.field1633;
        synchronized (class113.field1633) {
            class113.field1633.method905((byte) 90);
        }
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
    public static final void method1714(int arg0) {
        ++field3650;
        if (class15.field288 == null) {
            class15.field288 = new int[65536];
            double var1 = 0.7D + -0.015D + 0.03D * Math.random();
            int var3 = arg0;
            for (int var4 = 0; ~var4 > -513; ++var4) {
                float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var6 = (float) (var4 & 7) / 8.0F + 0.0625F;
                for (int var7 = 0; ~var7 > -129; ++var7) {
                    float var8 = (float) var7 / 128.0F;
                    float var9 = 0.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = var5 / 60.0F;
                    int var13 = (int) var12;
                    int var14 = var13 % 6;
                    float var15 = (float) (-var13) + var12;
                    float var16 = (-var6 + 1.0F) * var8;
                    float var17 = (1.0F - var6 * var15) * var8;
                    float var18 = (1.0F - (-var15 + 1.0F) * var6) * var8;
                    if (~var14 != -1) {
                        if (var14 == 1) {
                            var11 = var16;
                            var9 = var17;
                            var10 = var8;
                        } else if (~var14 == -3) {
                            var9 = var16;
                            var10 = var8;
                            var11 = var18;
                        } else if (~var14 != -4) {
                            if (var14 == 4) {
                                var9 = var18;
                                var11 = var8;
                                var10 = var16;
                            } else if (var14 == 5) {
                                var11 = var17;
                                var10 = var16;
                                var9 = var8;
                            }
                        } else {
                            var11 = var8;
                            var9 = var16;
                            var10 = var17;
                        }
                    } else {
                        var11 = var16;
                        var9 = var8;
                        var10 = var18;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var23 << 8) + (-16777216 - (-(var22 << 16) - var24));
                    class15.field288[var3++] = var25;
                }
            }
        }
    }
}
