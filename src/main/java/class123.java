import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class123 extends class617 {

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
    public int[] field2042;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "[I")
    public int[] field2044;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Ldca;")
    public static class161 field2045 = new class161();

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2046 = 0;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IFFFILss;[BIIIIFIF)V")
    public static final void method1096(int arg0, float arg1, float arg2, float arg3, int arg4, class397 arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10, float arg11, int arg12, float arg13) {
        field2041++;
        int var14 = arg7 * arg9;
        float[] var15 = new float[var14];
        if (arg8 != 785) {
            field2046 = 70;
        }
        for (int var16 = 0; var16 < arg0; var16++) {
            int var19 = arg12;
            arg5.method1585(var15, arg10, arg7, arg2 * 127.0F, arg1 / (float) arg10, arg8 - 846, arg4, arg9, arg11 / (float) arg7, 0, arg3 / (float) arg9);
            arg3 *= 2.0F;
            arg2 *= arg13;
            arg11 *= 2.0F;
            arg1 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg6[var19] = (byte) ((int) ((float) arg6[var19] + var15[var20]));
                var19++;
            }
        }
        int var17 = arg12;
        for (int var18 = 0; var18 < var14; var18++) {
            arg6[var17] -= -127;
            var17++;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method1097(int arg0) {
        field2045 = null;
        if (arg0 != 15) {
            field2046 = 87;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)V")
    public static final void method1098(byte arg0, int arg1, int arg2) {
        if (arg0 != 88) {
            method1097(-74);
        }
        field2043++;
        class413 var3 = class674.method3852(15, 0, arg0 ^ 0x26);
        var3.method2633(16777215);
        var3.field6333 = arg2;
        var3.field6337 = arg1;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II[I[I)V")
    public class123(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2042 = arg3;
        this.field2044 = arg2;
    }
}
