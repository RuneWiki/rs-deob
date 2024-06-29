import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class14 extends class316 {

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "[[S")
    private static short[][] field285 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "[[S")
    private static short[][] field284 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "[[S")
    private static short[][] field283 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "[[[S")
    public static short[][][] field287 = new short[][][] { field284, field283, field285 };

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Ljava/lang/String;")
    private String field281;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILso;)V")
    public final void method148(int arg0, class494 arg1) {
        this.field288 = arg1.method2976(-128);
        field282++;
        if (arg0 == -1001) {
            this.field281 = arg1.method2996(122);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lafa;FIIIIIFI[BFFFI)V")
    public static final void method149(class363 arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, int arg8, byte[] arg9, float arg10, float arg11, float arg12, int arg13) {
        field286++;
        int var14 = arg3 * arg13;
        float[] var15 = new float[var14];
        if (arg5 >= -25) {
            field284 = null;
        }
        for (int var16 = 0; var16 < arg6; var16++) {
            arg0.method1254(arg12 / (float) arg3, arg10 / (float) arg8, -86, arg7 * 127.0F, arg13, arg1 / (float) arg13, arg2, 0, arg8, arg3, var15);
            int var19 = arg4;
            arg12 *= 2.0F;
            arg1 *= 2.0F;
            arg7 *= arg11;
            for (int var20 = 0; var20 < var14; var20++) {
                arg9[var19] = (byte) ((int) ((float) arg9[var19] + var15[var20]));
                var19++;
            }
            arg10 *= 2.0F;
        }
        int var17 = arg4;
        for (int var18 = 0; var18 < var14; var18++) {
            arg9[var17] -= -127;
            var17++;
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public static final void method150(int arg0) {
        field289++;
        if (arg0 != 29867) {
            return;
        }
        if (class378.field5220 != null) {
            class373.method2317(class55.field709, -125);
        } else if (class449.field6142 == -1) {
            class366.method2295(arg0 - 29775, class691.field9661, class55.field709, class694.field9678);
        } else {
            class523.method3151(class55.field709, (byte) 63);
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(B)V")
    public static void method151(byte arg0) {
        field285 = null;
        field287 = null;
        field284 = null;
        int var1 = 32 / ((arg0 + 57) / 57);
        field283 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLmda;)V")
    public final void method152(byte arg0, class276 arg1) {
        arg1.method1805((byte) 124, this.field281, this.field288);
        if (arg0 <= 80) {
            method149(null, 0.69727975F, -118, 104, -57, 108, -45, -0.91452503F, 99, null, 1.1745241F, 0.30777365F, -1.024531F, 52);
        }
        field280++;
    }
}
