import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class37 extends class302 {

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field448 = 0;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "[I")
    public static int[] field452 = new int[128];

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(CB)Z", line = 7)
    public static final boolean method253(char arg0, byte arg1) {
        field454++;
        if (arg1 > -8) {
            method255(120);
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ljf;F[[F[[F[[FII[[IIZIZIIII[[II)I", line = 28)
    public static final int method254(class86 arg0, float arg1, float[][] arg2, float[][] arg3, float[][] arg4, int arg5, int arg6, int[][] arg7, int arg8, boolean arg9, int arg10, boolean arg11, int arg12, int arg13, int arg14, int arg15, int[][] arg16, int arg17) {
        if (arg5 == 1) {
            int var19 = arg8;
            arg8 = arg14;
            arg14 = 128 - var19;
        } else if (arg5 == 2) {
            arg14 = 128 - arg14;
            arg8 = 128 - arg8;
        } else if (arg5 == 3) {
            int var18 = arg8;
            arg8 = 128 - arg14;
            arg14 = var18;
        }
        field449++;
        if (arg9) {
            method255(44);
        }
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg8 == 0 && arg14 == 0) {
            var20 = arg2[arg10][arg12];
            var21 = arg4[arg10][arg12];
            var22 = arg15;
            var23 = arg3[arg10][arg12];
        } else if (arg8 == 128 && arg14 == 0) {
            var21 = arg4[arg10 + 1][arg12];
            var23 = arg3[arg10 + 1][arg12];
            var22 = arg6;
            var20 = arg2[arg10 + 1][arg12];
        } else if (arg8 == 128 && arg14 == 128) {
            var23 = arg3[arg10 + 1][arg12 + 1];
            var21 = arg4[arg10 + 1][arg12 + 1];
            var22 = arg13;
            var20 = arg2[arg10 + 1][arg12 + 1];
        } else if (arg8 == 0 && arg14 == 128) {
            var23 = arg3[arg10][arg12 + 1];
            var20 = arg2[arg10][arg12 + 1];
            var22 = arg17;
            var21 = arg4[arg10][arg12 + 1];
        } else {
            float var24 = arg3[arg10][arg12];
            float var25 = arg2[arg10][arg12];
            float var26 = arg4[arg10][arg12];
            float var27 = (float) arg14 / 128.0F;
            float var28 = (float) arg8 / 128.0F;
            float var29 = (arg3[arg10 + 1][arg12] - var24) * var28 + var24;
            float var30 = arg2[arg10][arg12 + 1];
            float var31 = (arg2[arg10 + 1][arg12] - var25) * var28 + var25;
            float var32 = (arg4[arg10 + 1][arg12] - var26) * var28 + var26;
            float var33 = arg3[arg10][arg12 + 1];
            float var34 = (arg2[arg10 + 1][arg12 + 1] - var30) * var28 + var30;
            float var35 = arg4[arg10][arg12 + 1];
            var20 = (var34 - var31) * var27 + var31;
            float var36 = (arg4[arg10 + 1][arg12 + 1] - var35) * var28 + var35;
            float var37 = (arg3[arg10 + 1][arg12 + 1] - var33) * var28 + var33;
            var21 = (var36 - var32) * var27 + var32;
            var23 = (var37 - var29) * var27 + var29;
            int var38 = class190.method1298(arg15, arg8, arg6, -16711936);
            int var39 = class190.method1298(arg17, arg8, arg13, -16711936);
            var22 = class190.method1298(var38, arg14, var39, -16711936);
        }
        int var40 = (arg10 << 7) + arg8;
        int var41 = class186.method1277(arg7, arg12, arg10, (byte) 115, arg14, arg8);
        int var42 = (arg12 << 7) + arg14;
        return arg0.method602(var40, var41, var42, var20, var21, var23, arg11 ? var22 & 0xFFFFFF00 : var22, arg16 == null ? 0.0F : (float) (var41 - class186.method1277(arg16, arg12, arg10, (byte) 120, arg14, arg8)) / arg1);
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V", line = 147)
    public static void method255(int arg0) {
        field452 = null;
        if (arg0 != 128) {
            method255(27);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIII)V", line = 158)
    public static final void method256(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -119) {
            method256(-80, -78, 50, -99, 44);
        }
        field450++;
        class169 var5 = class101.method712(arg2, 8, 2089666400);
        var5.method1183(false);
        var5.field2530 = arg4;
        var5.field2542 = arg1;
        var5.field2543 = arg0;
    }
}
