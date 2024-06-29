import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class82 {

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Z")
    public static boolean field1372 = false;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "Lwa;")
    public static class75 field1370 = class66.method560("overlay", false);

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Lwa;")
    public static class75 field1369 = class66.method560("details", false);

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field1367 = 0;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "[I")
    public static int[] field1375;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "[I")
    public static int[] field1376;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "[S")
    public static short[] field1373;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 13)
    public static void method683(int arg0) {
        field1373 = null;
        if (arg0 < 58) {
            field1374 = -124;
        }
        field1369 = null;
        field1375 = null;
        field1376 = null;
        field1370 = null;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ[[F[[IF[[FIILcg;I[[FIII[[IIII)I", line = 31)
    public static final int method684(int arg0, boolean arg1, float[][] arg2, int[][] arg3, float arg4, float[][] arg5, int arg6, int arg7, class38 arg8, int arg9, float[][] arg10, int arg11, int arg12, int arg13, int[][] arg14, int arg15, int arg16, int arg17) {
        field1371++;
        if (arg15 == 1) {
            int var19 = arg12;
            arg12 = arg0;
            arg0 = 128 - var19;
        } else if (arg15 == 2) {
            arg0 = 128 - arg0;
            arg12 = 128 - arg12;
        } else if (arg15 == 3) {
            int var18 = arg12;
            arg12 = 128 - arg0;
            arg0 = var18;
        }
        if (arg6 != 14613) {
            field1370 = (class75) null;
        }
        float var20;
        float var21;
        float var22;
        int var23;
        if (arg12 == 0 && arg0 == 0) {
            var20 = arg10[arg13][arg16];
            var21 = arg2[arg13][arg16];
            var22 = arg5[arg13][arg16];
            var23 = arg11;
        } else if (arg12 == 128 && arg0 == 0) {
            var20 = arg10[arg13 + 1][arg16];
            var22 = arg5[arg13 + 1][arg16];
            var21 = arg2[arg13 + 1][arg16];
            var23 = arg17;
        } else if (arg12 == 128 && arg0 == 128) {
            var22 = arg5[arg13 + 1][arg16 + 1];
            var23 = arg9;
            var20 = arg10[arg13 + 1][arg16 + 1];
            var21 = arg2[arg13 + 1][arg16 + 1];
        } else if (arg12 == 0 && arg0 == 128) {
            var21 = arg2[arg13][arg16 + 1];
            var20 = arg10[arg13][arg16 + 1];
            var23 = arg7;
            var22 = arg5[arg13][arg16 + 1];
        } else {
            float var24 = arg2[arg13][arg16];
            float var25 = arg10[arg13][arg16];
            float var26 = arg5[arg13][arg16];
            float var27 = (float) arg12 / 128.0F;
            float var28 = (arg5[arg13 + 1][arg16] - var26) * var27 + var26;
            float var29 = (arg2[arg13 + 1][arg16] - var24) * var27 + var24;
            float var30 = (float) arg0 / 128.0F;
            float var31 = arg2[arg13][arg16 + 1];
            float var32 = arg5[arg13][arg16 + 1];
            float var33 = arg10[arg13][arg16 + 1];
            float var34 = (arg5[arg13 + 1][arg16 + 1] - var32) * var27 + var32;
            float var35 = (arg10[arg13 + 1][arg16] - var25) * var27 + var25;
            float var36 = (arg2[arg13 + 1][arg16 + 1] - var31) * var27 + var31;
            var22 = (var34 - var28) * var30 + var28;
            float var37 = (arg10[arg13 + 1][arg16 + 1] - var33) * var27 + var33;
            var20 = (var37 - var35) * var30 + var35;
            int var38 = class14.method75(1794751303, arg17, arg12, arg11);
            int var39 = class14.method75(1794751303, arg9, arg12, arg7);
            var21 = (var36 - var29) * var30 + var29;
            var23 = class14.method75(1794751303, var39, arg0, var38);
        }
        int var40 = (arg13 << 7) + arg12;
        int var41 = (arg16 << 7) + arg0;
        int var42 = class121.method918(arg0, arg16, arg14, arg12, arg6 ^ 0x6F3D, arg13);
        return arg8.method257(var40, var42, var41, var22, var21, var20, arg1 ? var23 & 0xFFFFFF00 : var23, arg3 == null ? 0.0F : (float) (var42 - class121.method918(arg0, arg16, arg3, arg12, 22056, arg13)) / arg4);
    }
}
