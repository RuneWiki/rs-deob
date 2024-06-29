import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class741 extends class634 {

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "Ljava/lang/Object;")
    public static volatile Object field10360 = null;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "Lpia;")
    public static class94 field10357 = new class94(37, 2);

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "I")
    public static int field10364 = 0;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "Lvda;")
    public static class181 field10363 = new class181(0, 0);

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "I")
    public static int field10358;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public static int field10359;

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
    public static int field10361;

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
    public static int field10362;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)I")
    private final int method4126(int arg0, int arg1, int arg2) {
        int var4 = -126 % ((arg1 - -30) / 53);
        ++field10361;
        int var5 = arg2 - -(arg0 * 57);
        int var6 = var5 ^ var5 << 1;
        return -(((var6 * 15731 * var6 + 789221) * var6 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IFIIIFI[F[FZII)V")
    public static final void method4127(int arg0, float arg1, int arg2, int arg3, int arg4, float arg5, int arg6, float[] arg7, float[] arg8, boolean arg9, int arg10, int arg11) {
        int var12 = arg3 - arg0;
        int var13 = arg10 - arg6;
        int var14 = arg4 - arg2;
        ++field10358;
        float var15 = arg8[2] * (float) var13 + arg8[1] * (float) var12 + arg8[0] * (float) var14;
        if (!arg9) {
            field10357 = null;
        }
        float var16 = arg8[5] * (float) var13 + arg8[4] * (float) var12 + arg8[3] * (float) var14;
        float var17 = arg8[8] * (float) var13 + arg8[7] * (float) var12 + arg8[6] * (float) var14;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg1 != 1.0F) {
            var18 = arg1 * var18;
        }
        float var19 = var16 + 0.5F + arg5;
        if (arg11 != 1) {
            if (~arg11 == -3) {
                var19 = -var19;
                var18 = -var18;
            } else if (~arg11 == -4) {
                float var20 = var18;
                var18 = var19;
                var19 = -var20;
            }
        } else {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        }
        arg7[1] = var19;
        arg7[0] = var18;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)Lfg;")
    public static final class128 method4128(boolean arg0, int arg1) {
        ++field10359;
        class128 var2 = (class128) class564.field8030.method3538((long) arg1, 0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg0) {
                method4129(122);
            }
            byte[] var3 = class217.field2526.method2481(0, arg1, (byte) 111);
            class128 var4 = new class128();
            if (var3 != null) {
                var4.method811((byte) 105, new class244(var3), arg1);
            }
            class564.field8030.method3537(85, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)V")
    public static void method4129(int arg0) {
        field10360 = null;
        field10363 = null;
        field10357 = null;
        if (arg0 != 0) {
            field10364 = 86;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field10362;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 > -55) {
            return null;
        } else {
            if (super.field9114.field3897) {
                int var4 = class164.field1840[arg1];
                for (int var5 = 0; ~class635.field9139 < ~var5; ++var5) {
                    var3[var5] = this.method4126(var4, 87, class246.field2980[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
    public class741() {
        super(0, true);
    }
}
