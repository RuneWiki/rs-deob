import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class32 extends class627 {

    @OriginalMember(owner = "client!bja", name = "k", descriptor = "I")
    private int field277;

    @OriginalMember(owner = "client!bja", name = "w", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!bja", name = "s", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!bja", name = "u", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!bja", name = "t", descriptor = "I")
    private int field286;

    @OriginalMember(owner = "client!bja", name = "j", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!bja", name = "v", descriptor = "Lac;")
    private class541 field288;

    @OriginalMember(owner = "client!bja", name = "x", descriptor = "[S")
    private static short[] field290 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!bja", name = "q", descriptor = "[S")
    private static short[] field283 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bja", name = "z", descriptor = "[S")
    private static short[] field292 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bja", name = "n", descriptor = "[[S")
    public static short[][] field280 = new short[][] { field290, field292, field283 };

    @OriginalMember(owner = "client!bja", name = "p", descriptor = "F")
    public static float field282;

    @OriginalMember(owner = "client!bja", name = "l", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!bja", name = "m", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!bja", name = "r", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!bja", name = "y", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bja", name = "o", descriptor = "Lhw;")
    private class132 field281;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(B)Lhw;", line = 7)
    public final class132 method145(byte arg0) {
        field291++;
        if (this.field281 == null) {
            class676.field9442[2] = this.field276;
            class676.field9442[0] = this.field287;
            class676.field9442[3] = this.field277;
            class676.field9442[1] = this.field289;
            class152 var2 = this.field288.field636;
            class676.field9442[5] = this.field285;
            class676.field9442[4] = this.field286;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method922(-119, class676.field9442[var5])) {
                    return null;
                }
                class335 var7 = var2.method925(class676.field9442[var5], -28755);
                int var8 = var7.field4524 ? 64 : 128;
                if (var7.field4536 > 0) {
                    var3 = 1;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class148.field1902[var6] = var2.method923(class676.field9442[var6], (byte) -126, var4, 1.0F, false, var4);
            }
            this.field281 = new class132(this.field288, 6407, var4, var3 != 0, class148.field1902);
        }
        if (arg0 < 119) {
            field290 = null;
        }
        return this.field281;
    }

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "(Z)V", line = 68)
    public static void method146(boolean arg0) {
        if (!arg0) {
            field292 = null;
        }
        field290 = null;
        field283 = null;
        field292 = null;
        field280 = null;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(IFIIFIF[FI[FIIII)V", line = 88)
    public static final void method147(int arg0, float arg1, int arg2, int arg3, float arg4, int arg5, float arg6, float[] arg7, int arg8, float[] arg9, int arg10, int arg11, int arg12, int arg13) {
        int var14 = arg11 - arg10;
        int var15 = arg0 - arg3;
        int var16 = arg13 - arg12;
        field278++;
        float var17 = arg7[2] * (float) var14 + arg7[0] * (float) var16 + arg7[1] * (float) var15;
        if (arg5 < 109) {
            method146(false);
        }
        float var18 = arg7[5] * (float) var14 + arg7[3] * (float) var16 + arg7[4] * (float) var15;
        float var19 = arg7[8] * (float) var14 + arg7[7] * (float) var15 + arg7[6] * (float) var16;
        float var20;
        float var21;
        if (arg8 == 0) {
            var21 = arg1 + 0.5F - var19;
            var20 = arg4 + var17 + 0.5F;
        } else if (arg8 == 1) {
            var20 = arg4 + var17 + 0.5F;
            var21 = arg1 + var19 + 0.5F;
        } else if (arg8 == 2) {
            var21 = arg6 + 0.5F - var18;
            var20 = arg4 + 0.5F - var17;
        } else if (arg8 == 3) {
            var20 = arg4 + var17 + 0.5F;
            var21 = arg6 + 0.5F - var18;
        } else if (arg8 == 4) {
            var21 = arg6 + 0.5F - var18;
            var20 = arg1 + var19 + 0.5F;
        } else {
            var20 = arg1 + 0.5F - var19;
            var21 = arg6 + 0.5F - var18;
        }
        if (arg2 == 1) {
            float var23 = var20;
            var20 = -var21;
            var21 = var23;
        } else if (arg2 == 2) {
            var20 = -var20;
            var21 = -var21;
        } else if (arg2 == 3) {
            float var22 = var20;
            var20 = var21;
            var21 = -var22;
        }
        arg9[0] = var20;
        arg9[1] = var21;
    }

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "(II)Z", line = 177)
    public static final boolean method148(int arg0, int arg1) {
        if (arg1 < 125) {
            field280 = null;
        }
        field279++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 198)
    public static final boolean method149(int arg0, String arg1) {
        if (arg0 != -1) {
            field282 = 1.2700646F;
        }
        field284++;
        return class6.field45.containsKey(arg1);
    }

    @OriginalMember(owner = "client!bja", name = "<init>", descriptor = "(Lac;IIIIII)V", line = 208)
    public class32(class541 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field277 = arg4;
        this.field289 = arg2;
        this.field285 = arg6;
        this.field287 = arg1;
        this.field286 = arg5;
        this.field276 = arg3;
        this.field288 = arg0;
    }
}
