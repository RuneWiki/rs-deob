import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class153 {

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "[I")
    public static int[] field2307 = new int[32];

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "I")
    public static int field2308 = 0;

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "Lada;")
    public static class144 field2309;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lte;IZ[BIZII)Lrp;")
    public static final class371 method1114(class527 arg0, int arg1, boolean arg2, byte[] arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field2304++;
        if (arg2) {
            return null;
        } else if (!arg0.field7806 && (!class452.method2749(arg1, arg2) || !class452.method2749(arg6, arg2))) {
            return arg0.field7814 ? new class371(arg0, 34037, arg7, arg1, arg6, arg5, arg3, arg4) : new class371(arg0, arg7, arg1, arg6, class322.method1938(arg1, 36), class322.method1938(arg6, 106), arg3, arg4);
        } else {
            return new class371(arg0, 3553, arg7, arg1, arg6, arg5, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(IFIBIF[FIIIIIF)V")
    public static final void method1115(int arg0, float arg1, int arg2, byte arg3, int arg4, float arg5, float[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, float arg12) {
        int var13 = 105 % ((-arg3 - 72) / 52);
        field2305++;
        int var14 = arg0 - arg2;
        int var15 = arg7 - arg4;
        int var16 = arg8 - arg9;
        float var17 = arg6[2] * (float) var16 + arg6[0] * (float) var15 + arg6[1] * (float) var14;
        float var18 = arg6[5] * (float) var16 + arg6[3] * (float) var15 + arg6[4] * (float) var14;
        float var19 = arg6[8] * (float) var16 + arg6[6] * (float) var15 + arg6[7] * (float) var14;
        float var20;
        float var21;
        if (arg11 == 0) {
            var20 = arg1 + var17 + 0.5F;
            var21 = arg5 + 0.5F - var19;
        } else if (arg11 == 1) {
            var21 = arg5 + var19 + 0.5F;
            var20 = arg1 + var17 + 0.5F;
        } else if (arg11 == 2) {
            var20 = arg1 + 0.5F - var17;
            var21 = arg12 + 0.5F - var18;
        } else if (arg11 == 3) {
            var20 = arg1 + var17 + 0.5F;
            var21 = arg12 + 0.5F - var18;
        } else if (arg11 == 4) {
            var21 = arg12 + 0.5F - var18;
            var20 = arg5 + var19 + 0.5F;
        } else {
            var21 = arg12 + 0.5F - var18;
            var20 = arg5 + 0.5F - var19;
        }
        if (arg10 == 1) {
            float var22 = var20;
            var20 = -var21;
            var21 = var22;
        } else if (arg10 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg10 == 3) {
            float var23 = var20;
            var20 = var21;
            var21 = -var23;
        }
        class289.field4020 = var20;
        class427.field5747 = var21;
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(FI)F")
    public static final float method1116(float arg0, int arg1) {
        field2303++;
        int var2 = 36 / ((26 - arg1) / 58);
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(II)Lvp;")
    public static final class162 method1117(int arg0, int arg1) {
        field2306++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class302.field4135[var2] == null || class302.field4135[var2][var3] == null) {
            boolean var4 = class325.method1953(var2, (byte) -35);
            if (!var4) {
                return null;
            }
        }
        if (arg1 != -30170) {
            field2308 = -79;
        }
        return class302.field4135[var2][var3];
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(B)V")
    public static void method1118(byte arg0) {
        field2307 = null;
        field2309 = null;
        if (arg0 != -120) {
            method1114(null, -32, true, null, 116, false, -67, 27);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2307[var1] = var0 - 1;
            var0 += var0;
        }
        field2309 = new class144(23, 3);
    }
}
