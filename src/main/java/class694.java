import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class694 extends class646 {

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "I")
    private int field9856 = 32768;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "[I")
    public static int[] field9858 = new int[250];

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "Ljb;")
    public static class666 field9862 = new class666(2);

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "Lkq;")
    public static class696 field9863 = new class696(6, 1);

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "S")
    public static short field9864 = 205;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field9850;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field9851;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field9852;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "I")
    public static int field9855;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    public static int field9861;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "[I")
    public static int[] field9853;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "[I")
    public static int[] field9865;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[[I", line = 5)
    public final int[][] method298(int arg0, int arg1) {
        ++field9851;
        int[][] var3 = super.field9164.method1002(arg0 ^ -12508, arg1);
        if (arg0 != -12424) {
            return null;
        } else {
            if (super.field9164.field2082) {
                int[] var4 = this.method3628(false, 1, arg1);
                int[] var5 = this.method3628(false, 2, arg1);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; var9 < class89.field1330; ++var9) {
                    int var10 = 255 & var4[var9] * 255 >> 12;
                    int var11 = var5[var9] * this.field9856 >> 12;
                    int var12 = class43.field587[var10] * var11 >> 12;
                    int var13 = class609.field8759[var10] * var11 >> 12;
                    int var14 = class156.field2572 & (var12 >> 12) + var9;
                    int var15 = (var13 >> 12) + arg1 & class453.field6525;
                    int[][] var16 = this.method3626(arg0 ^ -12484, var15, 0);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 61)
    public static void method3911(byte arg0) {
        field9853 = null;
        field9858 = null;
        int var1 = -124 / ((arg0 - -2) / 57);
        field9863 = null;
        field9865 = null;
        field9862 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lek;IB)V", line = 74)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field9850;
        if (arg1 != 0) {
            if (~arg1 == -2) {
                super.field9160 = arg0.method2705(-48) == 1;
            }
        } else {
            this.field9856 = arg0.method2755((byte) -127) << 4;
        }
        if (arg2 < 7) {
            method3912((byte) -51, (String) null);
        }
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(I)V", line = 109)
    public final void method422(int arg0) {
        if (arg0 != -1) {
            method3912((byte) 109, (String) null);
        }
        class549.method3223(arg0 + 98);
        ++field9852;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V", line = 120)
    public class694() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IB)[I", line = 124)
    public final int[] method424(int arg0, byte arg1) {
        if (arg1 != -120) {
            this.method298(-122, -68);
        }
        ++field9857;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            int[] var4 = this.method3628(false, 1, arg0);
            int[] var5 = this.method3628(false, 2, arg0);
            for (int var6 = 0; var6 < class89.field1330; ++var6) {
                int var7 = 255 & var4[var6] >> 4;
                int var8 = var5[var6] * this.field9856 >> 12;
                int var9 = class43.field587[var7] * var8 >> 12;
                int var10 = class609.field8759[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class156.field2572;
                int var12 = class453.field6525 & (var10 >> 12) + arg0;
                int[] var13 = this.method3628(false, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLjava/lang/String;)I", line = 184)
    public static final int method3912(byte arg0, String arg1) {
        ++field9859;
        if (arg0 > -19) {
            field9862 = null;
        }
        for (int var2 = 0; class235.field3488.length > var2; ++var2) {
            if (class235.field3488[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(B)V", line = 207)
    public static final void method3913(byte arg0) {
        ++field9855;
        if (arg0 < 49) {
            method3913((byte) 105);
        }
        if (class324.field4520 == null) {
            class324.field4520 = new int[65536];
            double var1 = 0.7D + (Math.random() * 0.03D - 0.015D);
            int var3 = 0;
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
                    float var15 = var12 - (float) var13;
                    float var16 = (-var6 + 1.0F) * var8;
                    float var17 = (-(var6 * var15) + 1.0F) * var8;
                    float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                    if (~var14 != -1) {
                        if (var14 != 1) {
                            if (~var14 == -3) {
                                var11 = var18;
                                var9 = var16;
                                var10 = var8;
                            } else if (var14 == 3) {
                                var10 = var17;
                                var9 = var16;
                                var11 = var8;
                            } else if (~var14 != -5) {
                                if (var14 == 5) {
                                    var10 = var16;
                                    var9 = var8;
                                    var11 = var17;
                                }
                            } else {
                                var11 = var8;
                                var10 = var16;
                                var9 = var18;
                            }
                        } else {
                            var10 = var8;
                            var11 = var16;
                            var9 = var17;
                        }
                    } else {
                        var10 = var18;
                        var9 = var8;
                        var11 = var16;
                    }
                    float var19 = (float) Math.pow((double) var9, var1);
                    float var20 = (float) Math.pow((double) var10, var1);
                    float var21 = (float) Math.pow((double) var11, var1);
                    int var22 = (int) (var19 * 256.0F);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (var22 << 16) + (var23 << 8) - -var24 + -16777216;
                    class324.field4520[var3++] = var25;
                }
            }
        }
    }
}
