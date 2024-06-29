import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class235 {

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "J")
    public static volatile long field3931 = 0L;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lok;")
    private static class146 field3932 = method1724(-12908, "glow1:");

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Lok;")
    public static class146 field3926 = field3932;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "[[I")
    public static int[][] field3930 = new int[5][5000];

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lok;")
    public static class146 field3928 = method1724(-12908, " loggt sich ein)3");

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Lok;")
    public static class146 field3933 = field3932;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[I")
    public static int[] field3927;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[[FIZIIIIII[[IIF[[FLhi;I[[I[[F)I", line = 4)
    public static final int method1722(int arg0, float[][] arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int[][] arg10, int arg11, float arg12, float[][] arg13, class286 arg14, int arg15, int[][] arg16, float[][] arg17) {
        field3934++;
        if (arg9 == 1) {
            int var19 = arg7;
            arg7 = arg11;
            arg11 = 128 - var19;
        } else if (arg9 == 2) {
            arg7 = 128 - arg7;
            arg11 = 128 - arg11;
        } else if (arg9 == 3) {
            int var18 = arg7;
            arg7 = 128 - arg11;
            arg11 = var18;
        }
        if (arg8 != 1) {
            return 85;
        }
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg7 == 0 && arg11 == 0) {
            var20 = arg17[arg5][arg15];
            var21 = arg1[arg5][arg15];
            var22 = arg0;
            var23 = arg13[arg5][arg15];
        } else if (arg7 == 128 && arg11 == 0) {
            var22 = arg2;
            var21 = arg1[arg5 + 1][arg15];
            var20 = arg17[arg5 + 1][arg15];
            var23 = arg13[arg5 + 1][arg15];
        } else if (arg7 == 128 && arg11 == 128) {
            var21 = arg1[arg5 + 1][arg15 + 1];
            var22 = arg6;
            var23 = arg13[arg5 + 1][arg15 + 1];
            var20 = arg17[arg5 + 1][arg15 + 1];
        } else if (arg7 == 0 && arg11 == 128) {
            var21 = arg1[arg5][arg15 + 1];
            var22 = arg4;
            var20 = arg17[arg5][arg15 + 1];
            var23 = arg13[arg5][arg15 + 1];
        } else {
            float var24 = arg13[arg5][arg15];
            float var25 = arg1[arg5][arg15];
            float var26 = arg17[arg5][arg15];
            float var27 = (float) arg11 / 128.0F;
            float var28 = (float) arg7 / 128.0F;
            float var29 = (arg1[arg5 + 1][arg15] - var25) * var28 + var25;
            float var30 = arg13[arg5][arg15 + 1];
            float var31 = (arg17[arg5 + 1][arg15] - var26) * var28 + var26;
            float var32 = arg1[arg5][arg15 + 1];
            float var33 = (arg13[arg5 + 1][arg15 + 1] - var30) * var28 + var30;
            float var34 = (arg13[arg5 + 1][arg15] - var24) * var28 + var24;
            var23 = (var33 - var34) * var27 + var34;
            float var35 = (arg1[arg5 + 1][arg15 + 1] - var32) * var28 + var32;
            float var36 = arg17[arg5][arg15 + 1];
            float var37 = (arg17[arg5 + 1][arg15 + 1] - var36) * var28 + var36;
            var20 = (var37 - var31) * var27 + var31;
            var21 = (var35 - var29) * var27 + var29;
            int var38 = class41.method293(arg2, arg8 ^ 0x0, arg0, arg7);
            int var39 = class41.method293(arg6, arg8, arg4, arg7);
            var22 = class41.method293(var39, 1, var38, arg11);
        }
        int var40 = (arg5 << 7) + arg7;
        int var41 = class46.method323(arg16, arg5, -117, arg7, arg15, arg11);
        int var42 = (arg15 << 7) + arg11;
        return arg14.method2057(var40, var41, var42, var23, var21, var20, arg3 ? var22 & 0xFFFFFF00 : var22, arg10 == null ? 0.0F : (float) (var41 - class46.method323(arg10, arg5, arg8 ^ 0xFFFFFFA0, arg7, arg15, arg11)) / arg12);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V", line = 123)
    public static final void method1723(byte arg0) {
        field3935++;
        if (arg0 <= -58) {
            class115.field1854 = new class118(32);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/lang/String;)Lok;", line = 135)
    public static final class146 method1724(int arg0, String arg1) {
        field3929++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class146 var5 = new class146();
        if (arg0 != -12908) {
            field3930 = (int[][]) ((int[][]) null);
        }
        var5.field2462 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field2462[var5.field2461++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field2462[var5.field2461++] = (byte) var6;
            }
        }
        var5.method1098(15651);
        return var5.method1121(31168);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V", line = 179)
    public static void method1725(byte arg0) {
        field3932 = null;
        if (arg0 < 119) {
            field3933 = (class146) null;
        }
        field3930 = (int[][]) null;
        field3927 = null;
        field3928 = null;
        field3933 = null;
        field3926 = null;
    }
}
