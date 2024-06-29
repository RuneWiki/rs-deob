import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class608 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "Lst;")
    public static class335 field8190 = new class335(63, 3);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field8189;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field8191;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field8192;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[[[B")
    public static byte[][][] field8193;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method3455(byte arg0) {
        field8190 = null;
        if (arg0 <= 96) {
            field8193 = null;
        }
        field8193 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZ)V")
    public static final void method3456(int arg0, boolean arg1) {
        field8191++;
        class346 var2 = class299.method1976(0, 9, arg0);
        if (arg1) {
            method3458(0.7042205F, 34, -44, null, -1.1916456F, -28, 1.2531799F, -92, (byte) -46, -45, -35, 12, null, 43);
        }
        var2.method2208(-1719);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZZII)I")
    public static final int method3457(boolean arg0, boolean arg1, int arg2, int arg3) {
        field8192++;
        if (!arg0) {
            return -97;
        }
        class169 var4 = class170.method1090(arg1, (byte) -94, arg2);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && var4.field2352.length > arg3) {
            return var4.field2352[arg3];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(FII[FFIFIBIII[FI)V")
    public static final void method3458(float arg0, int arg1, int arg2, float[] arg3, float arg4, int arg5, float arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, float[] arg12, int arg13) {
        field8189++;
        int var14 = arg1 - arg11;
        int var15 = arg5 - arg10;
        int var16 = arg13 - arg9;
        if (arg8 >= -10) {
            method3457(false, false, 66, -77);
        }
        float var17 = arg3[2] * (float) var16 + arg3[1] * (float) var15 + arg3[0] * (float) var14;
        float var18 = arg3[5] * (float) var16 + arg3[4] * (float) var15 + arg3[3] * (float) var14;
        float var19 = arg3[8] * (float) var16 + arg3[6] * (float) var14 + arg3[7] * (float) var15;
        float var20;
        float var21;
        if (arg2 == 0) {
            var20 = arg0 + var17 + 0.5F;
            var21 = arg6 + 0.5F - var19;
        } else if (arg2 == 1) {
            var20 = arg0 + var17 + 0.5F;
            var21 = arg6 + var19 + 0.5F;
        } else if (arg2 == 2) {
            var21 = arg4 + 0.5F - var18;
            var20 = arg0 + 0.5F - var17;
        } else if (arg2 == 3) {
            var21 = arg4 + 0.5F - var18;
            var20 = arg0 + var17 + 0.5F;
        } else if (arg2 == 4) {
            var21 = arg4 + 0.5F - var18;
            var20 = arg6 + var19 + 0.5F;
        } else {
            var21 = arg4 + 0.5F - var18;
            var20 = arg6 + 0.5F - var19;
        }
        if (arg7 == 1) {
            float var22 = var20;
            var20 = -var21;
            var21 = var22;
        } else if (arg7 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg7 == 3) {
            float var23 = var20;
            var20 = var21;
            var21 = -var23;
        }
        arg12[0] = var20;
        arg12[1] = var21;
    }
}
