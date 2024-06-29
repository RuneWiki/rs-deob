import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class291 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field4730 = 1;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Lvm;")
    public static class146 field4732;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Lbq;")
    public static class487 field4734;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 3)
    public static void method1877(byte arg0) {
        field4732 = null;
        field4734 = null;
        int var1 = 41 / ((56 - arg0) / 56);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILap;)I", line = 22)
    public static final int method1878(int arg0, class340 arg1) {
        field4731++;
        int var2 = arg1.method2155(2, 30390);
        int var3;
        if (arg0 == var2) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method2155(5, 30390);
        } else if (var2 == 2) {
            var3 = arg1.method2155(8, 30390);
        } else {
            var3 = arg1.method2155(11, 30390);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIFFFI[BLal;IFIF)V", line = 51)
    public static final void method1879(int arg0, int arg1, int arg2, int arg3, float arg4, float arg5, float arg6, int arg7, byte[] arg8, class127 arg9, int arg10, float arg11, int arg12, float arg13) {
        field4733++;
        int var14 = arg3 * arg12;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg1; var16++) {
            arg9.method988(arg12, arg11 / (float) arg10, 0, arg10, arg2, (byte) -126, arg13 / (float) arg3, var15, arg4 / (float) arg12, arg6 * 127.0F, arg3);
            int var19 = arg7;
            for (int var20 = 0; var20 < var14; var20++) {
                arg8[var19] = (byte) ((int) ((float) arg8[var19] + var15[var20]));
                var19++;
            }
            arg11 *= 2.0F;
            arg4 *= 2.0F;
            arg6 = arg5 * arg6;
            arg13 *= 2.0F;
        }
        int var17 = arg7;
        if (arg0 == 1) {
            for (int var18 = 0; var18 < var14; var18++) {
                arg8[var17] = (byte) (arg8[var17] + 127);
                var17++;
            }
        }
    }
}
