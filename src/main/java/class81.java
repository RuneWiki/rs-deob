import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class81 extends class506 {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[I")
    public static int[] field1151 = new int[1];

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)Lau;")
    public abstract class245 method656(byte arg0);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BIFILqi;IFIIIFFFI)V")
    public static final void method657(byte[] arg0, int arg1, float arg2, int arg3, class291 arg4, int arg5, float arg6, int arg7, int arg8, int arg9, float arg10, float arg11, float arg12, int arg13) {
        field1152++;
        int var14 = arg1 * arg8;
        float[] var15 = new float[var14];
        for (int var16 = arg7; var16 < arg13; var16++) {
            arg4.method1833(arg5, arg10 / (float) arg1, arg1, -117, arg12 / (float) arg8, var15, 0, arg9, arg8, arg6 / (float) arg9, arg2 * 127.0F);
            int var19 = arg3;
            arg12 *= 2.0F;
            arg2 *= arg11;
            arg6 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg0[var19] = (byte) ((int) ((float) arg0[var19] + var15[var20]));
                var19++;
            }
            arg10 *= 2.0F;
        }
        int var17 = arg3;
        for (int var18 = 0; var18 < var14; var18++) {
            arg0[var17] = (byte) (arg0[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method658(int arg0) {
        field1151 = null;
        if (arg0 != -12152) {
            method657(null, 91, 0.76916164F, 126, null, 78, 0.54688996F, -7, -105, 32, 0.46032304F, 0.6121827F, -1.3303491F, -128);
        }
    }
}
