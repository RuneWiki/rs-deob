import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class456 extends class443 {

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "Z")
    public static boolean field6809 = false;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "[I")
    public static int[] field6807 = new int[25];

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "Lao;")
    public static class191 field6806 = new class191(23, 2);

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "[I")
    public static int[] field6811 = new int[16384];

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "[I")
    public static int[] field6812 = new int[16384];

    @OriginalMember(owner = "client!ck", name = "fb", descriptor = "[I")
    public static int[] field6813;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!ck", name = "gb", descriptor = "Lfo;")
    public static class361 field6814;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field6812[var2] = (int) (32768.0D * Math.sin((double) var2 * var0));
            field6811[var2] = (int) (32768.0D * Math.cos((double) var2 * var0));
        }
        field6813 = new int[500];
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZIZIIII)V", line = 7)
    public static final void method2810(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field6805;
        if (arg4 < -82) {
            if (arg3 < arg1) {
                int var7 = (arg3 - -arg1) / 2;
                int var8 = arg3;
                class54 var9 = class55.field637[var7];
                class55.field637[var7] = class55.field637[arg1];
                class55.field637[arg1] = var9;
                for (int var10 = arg3; ~arg1 < ~var10; ++var10) {
                    if (class74.method430(arg6, var9, arg0, arg5, arg2, class55.field637[var10], true) <= 0) {
                        class54 var11 = class55.field637[var10];
                        class55.field637[var10] = class55.field637[var8];
                        class55.field637[var8++] = var11;
                    }
                }
                class55.field637[arg1] = class55.field637[var8];
                class55.field637[var8] = var9;
                method2810(arg0, var8 + -1, arg2, arg3, -96, arg5, arg6);
                method2810(arg0, arg1, arg2, var8 + 1, -123, arg5, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IZ)[[I", line = 70)
    public final int[][] method112(int arg0, boolean arg1) {
        ++field6804;
        if (!arg1) {
            return null;
        } else {
            int[][] var3 = super.field3059.method28((byte) 64, arg0);
            if (super.field3059.field57 && this.method2743((byte) 95)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg0 % super.field6443 * super.field6443;
                for (int var8 = 0; ~class446.field6486 < ~var8; ++var8) {
                    int var9 = super.field6447[var8 % super.field6451 + var7];
                    var6[var8] = class95.method534(255, var9) << 4;
                    var5[var8] = class95.method534(var9 >> 4, 4080);
                    var4[var8] = class95.method534(4080, var9 >> 12);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBIIIII[FIF)V", line = 121)
    public static final void method2811(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9) {
        int var10 = arg3 - arg2;
        int var11 = arg0 - arg5;
        ++field6810;
        int var12 = arg8 - arg4;
        float var13 = arg7[2] * (float) var11 + arg7[0] * (float) var10 + arg7[1] * (float) var12;
        float var14 = arg7[5] * (float) var11 + arg7[4] * (float) var12 + arg7[3] * (float) var10;
        float var15 = arg7[8] * (float) var11 + arg7[6] * (float) var10 + arg7[7] * (float) var12;
        int var16 = -44 / ((-80 - arg1) / 41);
        float var17 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var18 = 0.5F + (float) Math.atan2((double) var13, (double) var15) / 6.2831855F;
        float var19 = arg9 + 0.5F + (float) Math.asin((double) (var14 / var17)) / 3.1415927F;
        if (arg6 != 1) {
            if (~arg6 == -3) {
                var19 = -var19;
                var18 = -var18;
            } else if (~arg6 == -4) {
                float var20 = var18;
                var18 = var19;
                var19 = -var20;
            }
        } else {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        }
        class212.field2855 = var19;
        class361.field4905 = var18;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)V", line = 189)
    public static void method2812(byte arg0) {
        field6814 = null;
        int var1 = -110 / ((arg0 - -50) / 58);
        field6811 = null;
        field6807 = null;
        field6812 = null;
        field6813 = null;
        field6806 = null;
    }
}
