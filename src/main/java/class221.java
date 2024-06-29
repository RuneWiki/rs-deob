import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class221 {

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "I")
    public static int field2544 = 16777215;

    @OriginalMember(owner = "client!rha", name = "e", descriptor = "[I")
    public static int[] field2548 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "Lcu;")
    public static class219 field2545 = new class219();

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!rha", name = "d", descriptor = "[S")
    public static short[] field2547;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(ILrp;FIIFI[BIFIFFI)V", line = 3)
    public static final void method1287(int arg0, class435 arg1, float arg2, int arg3, int arg4, float arg5, int arg6, byte[] arg7, int arg8, float arg9, int arg10, float arg11, float arg12, int arg13) {
        int var14 = 82 % ((arg13 - 45) / 60);
        field2546++;
        int var15 = arg0 * arg6;
        float[] var16 = new float[var15];
        for (int var17 = 0; var17 < arg4; var17++) {
            int var20 = arg8;
            arg1.method2717(arg3, arg9 / (float) arg3, arg5 * 127.0F, arg10, arg6, arg11 / (float) arg0, 0, var16, arg2 / (float) arg6, arg0, 17834);
            arg11 *= 2.0F;
            for (int var21 = 0; var21 < var15; var21++) {
                arg7[var20] = (byte) ((int) ((float) arg7[var20] + var16[var21]));
                var20++;
            }
            arg9 *= 2.0F;
            arg5 *= arg12;
            arg2 *= 2.0F;
        }
        int var18 = arg8;
        for (int var19 = 0; var19 < var15; var19++) {
            arg7[var18] = (byte) (arg7[var18] + 127);
            var18++;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)V", line = 57)
    public static void method1288(int arg0) {
        field2548 = null;
        field2547 = null;
        field2545 = null;
        if (arg0 != -28224) {
            field2545 = null;
        }
    }
}
