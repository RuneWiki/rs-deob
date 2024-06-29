import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class142 extends class216 {

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "I")
    public static int field2184 = 0;

    @OriginalMember(owner = "client!wb", name = "ob", descriptor = "I")
    public static int field2190 = 0;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!wb", name = "lb", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!wb", name = "mb", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "[I")
    public static int[] field2185;

    @OriginalMember(owner = "client!wb", name = "nb", descriptor = "[Ljava/lang/String;")
    public static String[] field2189;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V", line = 4)
    public static void method1085(int arg0) {
        if (arg0 == 3659) {
            field2189 = null;
            field2185 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V", line = 15)
    public static final void method1086(int arg0) {
        field2188++;
        class165.field2684 = 0;
        class196.field3021 = -1;
        class51.field682 = false;
        class135.field2048 = 0;
        class178.field2833 = 0;
        class59.field787 = 1;
        class184.field2907 = arg0;
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)V", line = 36)
    public static final void method1087(int arg0) {
        class309.field4810.method1713(arg0);
        class170.field2743.method1816(1);
        field2187++;
        class328.field5058.method1816(1);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)[[I", line = 51)
    public final int[][] method75(int arg0, int arg1) {
        field2186++;
        if (arg1 != 0) {
            method1087(-110);
        }
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820 && this.method1547(arg1 ^ 0xFFFFFFC6)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = arg0 % this.field3305 * this.field3305;
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class218.field3333; var8++) {
                int var9 = this.field3317[var6 + (var8 % this.field3319)];
                var7[var8] = class149.method1117(var9 << 4, 4080);
                var5[var8] = class149.method1117(var9 >> 4, 4080);
                var4[var8] = class149.method1117(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[[FFILfn;[[FIZIII[[IIII[[FI[[I)I", line = 105)
    public static final int method1088(int arg0, float[][] arg1, float arg2, int arg3, class58 arg4, float[][] arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int[][] arg11, int arg12, int arg13, int arg14, float[][] arg15, int arg16, int[][] arg17) {
        field2183++;
        if (arg12 == 1) {
            int var18 = arg3;
            arg3 = arg14;
            arg14 = 128 - var18;
        } else if (arg12 == 2) {
            arg14 = 128 - arg14;
            arg3 = 128 - arg3;
        } else if (arg12 == 3) {
            int var19 = arg3;
            arg3 = 128 - arg14;
            arg14 = var19;
        }
        float var20;
        float var21;
        float var22;
        int var23;
        if (arg3 == 0 && arg14 == 0) {
            var20 = arg5[arg10][arg6];
            var21 = arg1[arg10][arg6];
            var22 = arg15[arg10][arg6];
            var23 = arg0;
        } else if (arg3 == 128 && arg14 == 0) {
            var22 = arg15[arg10 + 1][arg6];
            var23 = arg8;
            var20 = arg5[arg10 + 1][arg6];
            var21 = arg1[arg10 + 1][arg6];
        } else if (arg3 == 128 && arg14 == 128) {
            var21 = arg1[arg10 + 1][arg6 + 1];
            var22 = arg15[arg10 + 1][arg6 + 1];
            var23 = arg9;
            var20 = arg5[arg10 + 1][arg6 + 1];
        } else if (arg3 == 0 && arg14 == 128) {
            var20 = arg5[arg10][arg6 + 1];
            var23 = arg16;
            var21 = arg1[arg10][arg6 + 1];
            var22 = arg15[arg10][arg6 + 1];
        } else {
            float var24 = (float) arg3 / 128.0F;
            float var25 = arg1[arg10][arg6];
            float var26 = (arg1[arg10 + 1][arg6] - var25) * var24 + var25;
            float var27 = arg5[arg10][arg6];
            float var28 = arg15[arg10][arg6];
            float var29 = (arg15[arg10 + 1][arg6] - var28) * var24 + var28;
            float var30 = (arg5[arg10 + 1][arg6] - var27) * var24 + var27;
            float var31 = arg15[arg10][arg6 + 1];
            float var32 = (arg15[arg10 + 1][arg6 + 1] - var31) * var24 + var31;
            float var33 = arg5[arg10][arg6 + 1];
            float var34 = arg1[arg10][arg6 + 1];
            float var35 = (arg1[arg10 + 1][arg6 + 1] - var34) * var24 + var34;
            float var36 = (float) arg14 / 128.0F;
            float var37 = (arg5[arg10 + 1][arg6 + 1] - var33) * var24 + var33;
            var21 = (var35 - var26) * var36 + var26;
            var22 = (var32 - var29) * var36 + var29;
            int var38 = class327.method2288((byte) 104, arg8, arg0, arg3);
            int var39 = class327.method2288((byte) -67, arg9, arg16, arg3);
            var20 = (var37 - var30) * var36 + var30;
            var23 = class327.method2288((byte) 79, var39, var38, arg14);
        }
        int var40 = (arg10 << 7) + arg3;
        int var41 = (arg6 << 7) + arg14;
        if (arg13 == 1628) {
            int var42 = class28.method215(arg17, arg3, arg10, arg13 ^ 0x56E7, arg14, arg6);
            return arg4.method414(var40, var42, var41, var21, var22, var20, arg7 ? var23 & 0xFFFFFF00 : var23, arg11 == null ? 0.0F : (float) (var42 - class28.method215(arg11, arg3, arg10, 20667, arg14, arg6)) / arg2);
        } else {
            return -7;
        }
    }
}
