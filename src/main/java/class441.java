import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class441 {

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "Lof;")
    public static class575 field6429;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I)V", line = 3)
    public static void method2612(int arg0) {
        if (arg0 != 0) {
            method2612(93);
        }
        field6429 = null;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(I[BFIIFFFFIIILtk;I)V", line = 13)
    public static final void method2613(int arg0, byte[] arg1, float arg2, int arg3, int arg4, float arg5, float arg6, float arg7, float arg8, int arg9, int arg10, int arg11, class312 arg12, int arg13) {
        if (arg0 > -116) {
            method2612(71);
        }
        field6428++;
        int var14 = arg11 * arg13;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg3; var16++) {
            arg12.method1789(-87, arg8 * 127.0F, 0, arg5 / (float) arg4, arg9, var15, arg11, arg13, arg2 / (float) arg11, arg7 / (float) arg13, arg4);
            int var19 = arg10;
            arg7 *= 2.0F;
            arg8 = arg6 * arg8;
            arg5 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg1[var19] = (byte) ((int) ((float) arg1[var19] + var15[var20]));
                var19++;
            }
            arg2 *= 2.0F;
        }
        int var17 = arg10;
        for (int var18 = 0; var18 < var14; var18++) {
            arg1[var17] = (byte) (arg1[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lrga;)V", line = 68)
    public static final void method2614(class215 arg0) {
        class682.field9618.method214(arg0.field3024, arg0.field3018 + (arg0.method1182(-32768) >> 1), arg0.field3029, class492.field7000);
        arg0.field3027 = class492.field7000[0];
        arg0.field3025 = class492.field7000[1];
        arg0.field3026 = class492.field7000[2];
    }
}
