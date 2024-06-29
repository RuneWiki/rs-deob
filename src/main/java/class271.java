import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class271 {

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "[I")
    public static int[] field4554 = new int[50];

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "[I")
    public static int[] field4557 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public static int field4556 = 0;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "[[Lji;")
    public static class148[][] field4559 = new class148[13][13];

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Luf;")
    public static class168 field4550 = class148.method1019(-1720, " ");

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field4564 = -1;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Luf;")
    private static class168 field4560 = class148.method1019(-1720, "wave:");

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "Luf;")
    public static class168 field4558 = field4560;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Luf;")
    public static class168 field4552 = field4560;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "Lg;")
    public static class242 field4553;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "[I")
    public static int[] field4562;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "[Luf;")
    public static class168[] field4561;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "[[I")
    public static int[][] field4565;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 7)
    public static void method1874(int arg0) {
        field4559 = (class148[][]) null;
        field4552 = null;
        field4565 = (int[][]) null;
        if (arg0 != -1) {
            method1877(-5, 67, -112, true, 43, 82);
        }
        field4553 = null;
        field4550 = null;
        field4554 = null;
        field4560 = null;
        field4562 = null;
        field4557 = null;
        field4561 = null;
        field4558 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V", line = 35)
    public static final void method1875(int arg0, byte arg1) {
        field4555++;
        class76.method448((byte) 118);
        class289.method1986(true);
        int var2 = class195.method1372(-92, arg0).field4841;
        int var3 = 81 % ((23 - arg1) / 46);
        if (var2 == 0) {
            return;
        }
        int var4 = class122.field1891[arg0];
        if (var2 == 5) {
            class39.field487 = var4;
        }
        if (var2 == 6) {
            class169.field2779 = var4;
        }
        if (var2 == 9) {
            class171.field2795 = var4;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIII[[IIIFZ[[I[[F[[F[[FIILvk;II)I", line = 97)
    public static final int method1876(int arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5, int arg6, float arg7, boolean arg8, int[][] arg9, float[][] arg10, float[][] arg11, float[][] arg12, int arg13, int arg14, class192 arg15, int arg16, int arg17) {
        field4551++;
        if (arg14 == 1) {
            int var19 = arg5;
            arg5 = arg2;
            arg2 = 128 - var19;
        } else if (arg14 == 2) {
            arg5 = 128 - arg5;
            arg2 = 128 - arg2;
        } else if (arg14 == 3) {
            int var18 = arg5;
            arg5 = 128 - arg2;
            arg2 = var18;
        }
        float var20;
        float var21;
        float var22;
        int var23;
        if (arg5 == 0 && arg2 == 0) {
            var20 = arg10[arg3][arg6];
            var21 = arg11[arg3][arg6];
            var22 = arg12[arg3][arg6];
            var23 = arg16;
        } else if (arg5 == 128 && arg2 == 0) {
            var20 = arg10[arg3 + 1][arg6];
            var22 = arg12[arg3 + 1][arg6];
            var23 = arg13;
            var21 = arg11[arg3 + 1][arg6];
        } else if (arg5 == 128 && arg2 == 128) {
            var23 = arg17;
            var21 = arg11[arg3 + 1][arg6 + 1];
            var20 = arg10[arg3 + 1][arg6 + 1];
            var22 = arg12[arg3 + 1][arg6 + 1];
        } else if (arg5 == 0 && arg2 == 128) {
            var23 = arg1;
            var22 = arg12[arg3][arg6 + 1];
            var20 = arg10[arg3][arg6 + 1];
            var21 = arg11[arg3][arg6 + 1];
        } else {
            float var24 = arg12[arg3][arg6];
            float var25 = arg11[arg3][arg6];
            float var26 = (float) arg5 / 128.0F;
            float var27 = (arg12[arg3 + 1][arg6] - var24) * var26 + var24;
            float var28 = arg10[arg3][arg6];
            float var29 = (arg10[arg3 + 1][arg6] - var28) * var26 + var28;
            float var30 = (arg11[arg3 + 1][arg6] - var25) * var26 + var25;
            float var31 = (float) arg2 / 128.0F;
            float var32 = arg11[arg3][arg6 + 1];
            float var33 = arg12[arg3][arg6 + 1];
            float var34 = (arg12[arg3 + 1][arg6 + 1] - var33) * var26 + var33;
            float var35 = arg10[arg3][arg6 + 1];
            float var36 = (arg11[arg3 + 1][arg6 + 1] - var32) * var26 + var32;
            var21 = (var36 - var30) * var31 + var30;
            float var37 = (arg10[arg3 + 1][arg6 + 1] - var35) * var26 + var35;
            var20 = (var37 - var29) * var31 + var29;
            var22 = (var34 - var27) * var31 + var27;
            int var38 = class300.method2052(10, arg13, arg16, arg5);
            int var39 = class300.method2052(arg0 + 11, arg17, arg1, arg5);
            var23 = class300.method2052(10, var39, var38, arg2);
        }
        int var40 = (arg3 << 7) + arg5;
        int var41 = (arg6 << 7) + arg2;
        int var42 = class121.method868(arg6, arg5, arg2, arg4, 0, arg3);
        if (arg0 != -1) {
            method1874(86);
        }
        return arg15.method1356(var40, var42, var41, var20, var21, var22, arg8 ? var23 & 0xFFFFFF00 : var23, arg9 == null ? 0.0F : (float) (var42 - class121.method868(arg6, arg5, arg2, arg9, 0, arg3)) / arg7);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIZII)V", line = 211)
    public static final void method1877(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field4563++;
        if (arg0 == arg5) {
            class21.method109(116, arg2, arg1, arg4, arg5);
            return;
        }
        if (!arg3) {
            method1876(-120, 101, -116, 50, (int[][]) ((int[][]) null), 26, 47, -0.20815954F, false, (int[][]) ((int[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), (float[][]) ((float[][]) null), -119, -114, (class192) null, 10, -76);
        }
        if ((arg1 - arg5) >= class150.field2331 && class65.field874 >= (arg1 + arg5) && class9.field112 <= arg4 - arg0 && class44.field538 >= arg4 + arg0) {
            class2.method4(arg0, arg2, arg5, arg4, arg1, -81);
        } else {
            class199.method1400(arg1, arg4, arg2, arg5, arg0, (byte) 73);
        }
    }
}
