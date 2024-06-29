import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class693 {

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "[I")
    public static int[] field9749 = new int[2];

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "Ldb;")
    public static class298 field9748 = new class298(8, 6);

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "Ldb;")
    public static class298 field9750 = new class298(34, -1);

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "Lmga;")
    public static class666 field9751 = new class666(20);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
    public static void method3844(boolean arg0) {
        if (!arg0) {
            method3844(false);
        }
        field9751 = null;
        field9750 = null;
        field9748 = null;
        field9749 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(FIF[BIIIIFIIFFLfq;)V")
    public static final void method3845(float arg0, int arg1, float arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, float arg8, int arg9, int arg10, float arg11, float arg12, class189 arg13) {
        field9747++;
        if (arg6 != 2) {
            return;
        }
        int var14 = arg1 * arg9;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg4; var16++) {
            arg13.method1238(arg8 / (float) arg1, arg0 / (float) arg9, arg9, (byte) 113, var15, 0, arg7, arg2 * 127.0F, arg12 / (float) arg10, arg10, arg1);
            int var19 = arg5;
            for (int var20 = 0; var20 < var14; var20++) {
                arg3[var19] = (byte) ((int) ((float) arg3[var19] + var15[var20]));
                var19++;
            }
            arg0 *= 2.0F;
            arg12 *= 2.0F;
            arg2 *= arg11;
            arg8 *= 2.0F;
        }
        int var17 = arg5;
        for (int var18 = 0; var18 < var14; var18++) {
            arg3[var17] = (byte) (arg3[var17] + 127);
            var17++;
        }
    }
}
