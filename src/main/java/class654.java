import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class654 extends class573 {

    @OriginalMember(owner = "client!no", name = "O", descriptor = "I")
    private int field9415 = 4;

    @OriginalMember(owner = "client!no", name = "I", descriptor = "I")
    private int field9409 = 4;

    @OriginalMember(owner = "client!no", name = "J", descriptor = "[I")
    public static int[] field9410 = new int[14];

    @OriginalMember(owner = "client!no", name = "R", descriptor = "F")
    public static float field9418 = 1.0F;

    @OriginalMember(owner = "client!no", name = "K", descriptor = "Lph;")
    public static class598 field9411 = new class598(1, 2);

    @OriginalMember(owner = "client!no", name = "L", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!no", name = "M", descriptor = "I")
    public static int field9413;

    @OriginalMember(owner = "client!no", name = "N", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!no", name = "P", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!no", name = "Q", descriptor = "I")
    public static int field9417;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field9413;
        int[] var3 = super.field8321.method3164(arg0, arg1 ^ -126);
        if (super.field8321.field7825) {
            int var4 = class540.field7555 / this.field9415;
            int var5 = class419.field6037 / this.field9409;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method3292(0, arg1 + -1, class419.field6037 * var6 / var5);
            } else {
                var7 = this.method3292(0, arg1 ^ 1, 0);
            }
            for (int var8 = 0; class540.field7555 > var8; ++var8) {
                if (~var4 < -1) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class540.field7555 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return arg1 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!no", name = "h", descriptor = "(I)Lqj;")
    public static final class473 method3725(int arg0) {
        ++field9417;
        if (class407.field5880 != null && class594.field8549 != null) {
            class594.field8549.method798(-31950, class407.field5880);
            class473 var1 = (class473) class594.field8549.method795((byte) 71);
            if (var1 == null) {
                return null;
            } else {
                class288 var2 = class407.field5864.method3355(var1.field6709, (byte) -128);
                if (arg0 < 87) {
                    field9418 = -0.7871009F;
                }
                return var2 != null && var2.field4303 && var2.method1923(class407.field5870, 31846) ? var1 : class678.method3816(-120);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "()V")
    public class654() {
        super(1, false);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([BIII)[B")
    public static final byte[] method3726(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field9414;
        byte[] var4;
        if (arg2 > 0) {
            var4 = new byte[arg3];
            for (int var5 = 0; arg3 > var5; ++var5) {
                var4[var5] = arg0[arg2 + var5];
            }
        } else {
            var4 = arg0;
        }
        if (arg1 != 64) {
            field9411 = null;
        }
        class657 var6 = new class657();
        var6.method3740(false);
        var6.method3742((byte) 23, (long) (arg3 * 8), var4);
        byte[] var7 = new byte[64];
        var6.method3739(var7, false, 0);
        return var7;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field9409 = arg0.method732(-559537960);
            }
        } else {
            this.field9415 = arg0.method732(-559537960);
        }
        ++field9412;
        if (arg2 != 3) {
            this.field9415 = 12;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(II)[[I")
    public final int[][] method442(int arg0, int arg1) {
        ++field9416;
        int[][] var3 = super.field8320.method1504(arg1, -2);
        if (arg0 > -116) {
            method3727(-32);
        }
        if (super.field8320.field3295) {
            int var4 = class540.field7555 / this.field9415;
            int var5 = class419.field6037 / this.field9409;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method3293(0, -61, class419.field6037 * var6 / var5);
            } else {
                var7 = this.method3293(0, -6, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class540.field7555 < ~var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class540.field7555 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!no", name = "i", descriptor = "(I)V")
    public static void method3727(int arg0) {
        field9411 = null;
        if (arg0 == 16946) {
            field9410 = null;
        }
    }
}
