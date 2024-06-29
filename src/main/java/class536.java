import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class536 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Z")
    public static boolean field7505 = false;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Lph;")
    public static class598 field7507 = new class598(8, 1);

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lja;")
    public static class254 field7508 = new class254(0, 2, 2, 1);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field7506;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Lf;")
    public static class702 field7509;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static void method3099(boolean arg0) {
        field7507 = null;
        field7508 = null;
        if (arg0) {
            method3099(true);
        }
        field7509 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[BFFIIIIFLss;ZFFI)V")
    public static final void method3100(int arg0, byte[] arg1, float arg2, float arg3, int arg4, int arg5, int arg6, int arg7, float arg8, class400 arg9, boolean arg10, float arg11, float arg12, int arg13) {
        field7506++;
        int var14 = arg6 * arg13;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg5; var16++) {
            arg9.method2176(arg6, arg13, var15, 2015625216, arg11 / (float) arg7, arg7, arg12 / (float) arg6, 0, arg3 * 127.0F, arg0, arg2 / (float) arg13);
            int var19 = arg4;
            arg3 *= arg8;
            arg11 *= 2.0F;
            arg2 *= 2.0F;
            arg12 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg1[var19] = (byte) ((int) ((float) arg1[var19] + var15[var20]));
                var19++;
            }
        }
        int var17 = arg4;
        if (!arg10) {
            for (int var18 = 0; var18 < var14; var18++) {
                arg1[var17] = (byte) (arg1[var17] + 127);
                var17++;
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IBLas;IIIZ)V")
    public static final void method3101(int arg0, byte arg1, class138 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field7504++;
        if (class132.field2373 >= 50 || arg1 < 122 || arg2 == null || arg2.field2430 == null || arg2.field2430.length <= arg0 || arg2.field2430[arg0] == null) {
            return;
        }
        int var7 = arg2.field2430[arg0][0];
        int var8 = var7 >> 8;
        int var9 = var7 >> 5 & 0x7;
        int var10 = var7 & 0x1F;
        if (arg2.field2430[arg0].length > 1) {
            int var11 = (int) (Math.random() * (double) arg2.field2430[arg0].length);
            if (var11 > 0) {
                var8 = arg2.field2430[arg0][var11];
            }
        }
        if (var10 == 0) {
            if (arg6) {
                if (arg2.field2451) {
                    class500.method2982(255, 0, 0, false, var9, var8);
                    return;
                }
                class56.method651(255, -7529, 0, var9, var8);
            }
        } else if (class527.field7429.field2635 != 0) {
            int var12 = arg4 - 256 >> 9;
            int var13 = arg3 - 256 >> 9;
            class286.field4264[class132.field2373++] = new class373((byte) (arg2.field2451 ? 2 : 1), var8, var9, 0, 255, (var13 << 8) + var10 + (arg5 << 24) + (var12 << 16));
        }
    }
}
