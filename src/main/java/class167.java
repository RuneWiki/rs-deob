import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class167 extends class273 {

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public static int field2626 = 0;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "Lne;")
    public static class235 field2618 = new class235(64);

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public static int field2632 = 0;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "Lwm;")
    private static class152 field2633 = class157.method1048("cyan:", 110);

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "Lwm;")
    public static class152 field2628 = field2633;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "Lwm;")
    public static class152 field2630 = field2633;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public int field2613;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public int field2614;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public int field2615;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public int field2621;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public int field2622;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public int field2625;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V", line = 12)
    public static void method1103(int arg0) {
        int var1 = 1 / ((61 - arg0) / 37);
        field2628 = null;
        field2618 = null;
        field2633 = null;
        field2630 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[[IIZ[[ILaj;IBI[[F[[FII[[FIIIF)I", line = 29)
    public static final int method1104(int arg0, int[][] arg1, int arg2, boolean arg3, int[][] arg4, class1 arg5, int arg6, byte arg7, int arg8, float[][] arg9, float[][] arg10, int arg11, int arg12, float[][] arg13, int arg14, int arg15, int arg16, float arg17) {
        if (arg2 == 1) {
            int var18 = arg16;
            arg16 = arg15;
            arg15 = 128 - var18;
        } else if (arg2 == 2) {
            arg15 = 128 - arg15;
            arg16 = 128 - arg16;
        } else if (arg2 == 3) {
            int var19 = arg16;
            arg16 = 128 - arg15;
            arg15 = var19;
        }
        if (arg7 != 4) {
            method1103(-56);
        }
        field2627++;
        float var20;
        float var21;
        int var22;
        float var23;
        if (arg16 == 0 && arg15 == 0) {
            var20 = arg10[arg6][arg11];
            var21 = arg9[arg6][arg11];
            var22 = arg14;
            var23 = arg13[arg6][arg11];
        } else if (arg16 == 128 && arg15 == 0) {
            var23 = arg13[arg6 + 1][arg11];
            var22 = arg0;
            var21 = arg9[arg6 + 1][arg11];
            var20 = arg10[arg6 + 1][arg11];
        } else if (arg16 == 128 && arg15 == 128) {
            var21 = arg9[arg6 + 1][arg11 + 1];
            var20 = arg10[arg6 + 1][arg11 + 1];
            var22 = arg12;
            var23 = arg13[arg6 + 1][arg11 + 1];
        } else if (arg16 == 0 && arg15 == 128) {
            var21 = arg9[arg6][arg11 + 1];
            var23 = arg13[arg6][arg11 + 1];
            var20 = arg10[arg6][arg11 + 1];
            var22 = arg8;
        } else {
            float var24 = (float) arg16 / 128.0F;
            float var25 = arg13[arg6][arg11];
            float var26 = arg9[arg6][arg11];
            float var27 = (arg13[arg6 + 1][arg11] - var25) * var24 + var25;
            float var28 = (arg9[arg6 + 1][arg11] - var26) * var24 + var26;
            float var29 = arg10[arg6][arg11];
            float var30 = (float) arg15 / 128.0F;
            float var31 = (arg10[arg6 + 1][arg11] - var29) * var24 + var29;
            float var32 = arg13[arg6][arg11 + 1];
            float var33 = arg10[arg6][arg11 + 1];
            float var34 = (arg13[arg6 + 1][arg11 + 1] - var32) * var24 + var32;
            float var35 = (arg10[arg6 + 1][arg11 + 1] - var33) * var24 + var33;
            var23 = (var34 - var27) * var30 + var27;
            var20 = (var35 - var31) * var30 + var31;
            float var36 = arg9[arg6][arg11 + 1];
            float var37 = (arg9[arg6 + 1][arg11 + 1] - var36) * var24 + var36;
            var21 = (var37 - var28) * var30 + var28;
            int var38 = class107.method711(arg16, arg0, 1643, arg14);
            int var39 = class107.method711(arg16, arg12, 1643, arg8);
            var22 = class107.method711(arg15, var39, 1643, var38);
        }
        int var40 = (arg6 << 7) + arg16;
        int var41 = (arg11 << 7) + arg15;
        int var42 = class296.method2045(arg16, arg11, arg7 ^ 0xFFFFFFFB, arg1, arg15, arg6);
        return arg5.method1(var40, var42, var41, var23, var20, var21, arg3 ? var22 & 0xFFFFFF00 : var22, arg4 == null ? 0.0F : (float) (var42 - class296.method2045(arg16, arg11, -1, arg4, arg15, arg6)) / arg17);
    }
}
