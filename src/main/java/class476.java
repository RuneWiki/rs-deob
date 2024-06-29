import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class476 extends class43 {

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    private int field7053;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    private int field7046;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    private int field7054;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    private int field7052;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    private int field7042;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lur;")
    private class377 field7041;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    private int field7056;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Lhn;")
    public static class509 field7043 = new class509(64);

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "[I")
    public static int[] field7051 = new int[4096];

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "[I")
    public static int[] field7055 = new int[14];

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Lsa;")
    private class139 field7044;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lgb;")
    public static class145 field7047;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lfo;")
    public static class361 field7045;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method2905(int arg0) {
        field7045 = null;
        field7051 = null;
        field7055 = null;
        field7043 = null;
        if (arg0 != 2) {
            method2906(false, 0.1668565F, 95, 60, -2.7853906F, -0.9081483F, 49, 106, 74, 54, null, 71, 112);
        }
        field7047 = null;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(B)Lsa;")
    public final class139 method251(byte arg0) {
        field7048++;
        if (arg0 >= -121) {
            return null;
        }
        if (this.field7044 == null) {
            class531.field7823[2] = this.field7046;
            class531.field7823[5] = this.field7052;
            class16 var2 = this.field7041.field3772;
            class531.field7823[3] = this.field7042;
            class531.field7823[4] = this.field7053;
            class531.field7823[1] = this.field7054;
            class531.field7823[0] = this.field7056;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method91(class531.field7823[var5], -1221)) {
                    return null;
                }
                class433 var7 = var2.method94(class531.field7823[var5], (byte) -72);
                int var8 = var7.field6302 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field6323 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class454.field6798[var6] = var2.method90(1.0F, false, false, class531.field7823[var6], var4, var4);
            }
            this.field7044 = new class139(this.field7041, 6407, var4, var3 != 0, class454.field6798);
        }
        return this.field7044;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZFIIFFIIII[FII)V")
    public static final void method2906(boolean arg0, float arg1, int arg2, int arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10, int arg11, int arg12) {
        int var13 = arg12 - arg9;
        field7050++;
        if (!arg0) {
            field7047 = null;
        }
        int var14 = arg2 - arg8;
        int var15 = arg6 - arg3;
        float var16 = arg10[2] * (float) var13 + arg10[0] * (float) var14 + arg10[1] * (float) var15;
        float var17 = arg10[5] * (float) var13 + arg10[3] * (float) var14 + arg10[4] * (float) var15;
        float var18 = arg10[8] * (float) var13 + arg10[7] * (float) var15 + arg10[6] * (float) var14;
        float var19;
        float var20;
        if (arg11 == 0) {
            var19 = arg5 + 0.5F - var18;
            var20 = arg4 + var16 + 0.5F;
        } else if (arg11 == 1) {
            var20 = arg4 + var16 + 0.5F;
            var19 = arg5 + var18 + 0.5F;
        } else if (arg11 == 2) {
            var19 = arg1 + 0.5F - var17;
            var20 = arg4 + 0.5F - var16;
        } else if (arg11 == 3) {
            var20 = arg4 + var16 + 0.5F;
            var19 = arg1 + 0.5F - var17;
        } else if (arg11 == 4) {
            var20 = arg5 + var18 + 0.5F;
            var19 = arg1 + 0.5F - var17;
        } else {
            var20 = arg5 + 0.5F - var18;
            var19 = arg1 + 0.5F - var17;
        }
        if (arg7 == 1) {
            float var21 = var20;
            var20 = -var19;
            var19 = var21;
        } else if (arg7 == 2) {
            var20 = -var20;
            var19 = -var19;
        } else if (arg7 == 3) {
            float var22 = var20;
            var20 = var19;
            var19 = -var22;
        }
        class179.field2322 = var20;
        class234.field3130 = var19;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(III[II)V")
    public static final void method2907(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        arg4--;
        if (arg1 < 28) {
            method2905(-77);
        }
        field7049++;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg3[var7] = arg2;
            int var8 = var7 + 1;
            arg3[var8] = arg2;
            int var9 = var8 + 1;
            arg3[var9] = arg2;
            int var10 = var9 + 1;
            arg3[var10] = arg2;
            int var11 = var10 + 1;
            arg3[var11] = arg2;
            int var12 = var11 + 1;
            arg3[var12] = arg2;
            int var13 = var12 + 1;
            arg3[var13] = arg2;
            arg4 = var13 + 1;
            arg3[arg4] = arg2;
        }
        while (arg4 < var6) {
            arg4++;
            arg3[arg4] = arg2;
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lur;IIIIII)V")
    public class476(class377 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7053 = arg5;
        this.field7046 = arg3;
        this.field7054 = arg2;
        this.field7052 = arg6;
        this.field7042 = arg4;
        this.field7041 = arg0;
        this.field7056 = arg1;
    }
}
