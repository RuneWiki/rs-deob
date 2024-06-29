import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class196 extends class159 {

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "I")
    private int field3003;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "I")
    public int field2997;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    private int field3014;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "I")
    private int field3005;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    public int field3011;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    private int field2995;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "I")
    public int field3000;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "I")
    private int field3013;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "[I")
    public static int[] field3002 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!un", name = "o", descriptor = "[I")
    public static int[] field2998 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field3001 = 100;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "I")
    public static int field3009 = -1;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field3019 = -1;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "Lmi;")
    public static class227 field3006 = new class227(64);

    @OriginalMember(owner = "client!un", name = "N", descriptor = "[I")
    public static int[] field3020 = new int[14];

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "Lah;")
    public static class176 field3015;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII)Z", line = 6)
    public final boolean method1335(int arg0, int arg1, int arg2, int arg3) {
        int var5 = -31 % ((arg2 - 11) / 40);
        field3017++;
        return this.field3005 == arg1 && arg3 >= this.field3012 && arg3 <= this.field3013 && arg0 >= this.field3014 && arg0 <= this.field3003;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIB)Z", line = 23)
    public final boolean method1336(int arg0, int arg1, byte arg2) {
        field2996++;
        if (arg2 >= -72) {
            return false;
        } else {
            return this.field2997 <= arg1 && arg1 <= this.field2999 && arg0 >= this.field3000 && arg0 <= this.field3011;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(III)Z", line = 54)
    public final boolean method1337(int arg0, int arg1, int arg2) {
        field3004++;
        if (arg2 <= 75) {
            method1340(120, (float[][]) ((float[][]) null), false, (class226) null, (float[][]) ((float[][]) null), 101, -35, 5, (float[][]) ((float[][]) null), 3, (int[][]) ((int[][]) null), 0.29562387F, 109, -53, 41, 59, -51, (int[][]) ((int[][]) null));
        }
        return arg0 >= this.field3012 && this.field3013 >= arg0 && arg1 >= this.field3014 && this.field3003 >= arg1;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III[I)V", line = 86)
    public final void method1338(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = this.field3005;
        if (arg0 <= 65) {
            this.field3012 = 80;
        }
        field3010++;
        arg3[1] = -this.field2997 - (-this.field3012 - arg2);
        arg3[2] = this.field3014 + arg1 - this.field3000;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 99)
    public class196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field2999 = arg8;
        this.field3003 = arg5;
        this.field2997 = arg6;
        this.field3012 = arg2;
        this.field3014 = arg3;
        this.field3005 = arg0;
        this.field3011 = arg9;
        this.field2995 = arg1;
        this.field3000 = arg7;
        this.field3013 = arg4;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V", line = 118)
    public static void method1339(byte arg0) {
        if (arg0 <= 60) {
            method1340(112, (float[][]) ((float[][]) null), false, (class226) null, (float[][]) ((float[][]) null), -6, -109, -95, (float[][]) ((float[][]) null), 123, (int[][]) ((int[][]) null), 0.9146294F, -60, -88, 2, -37, -118, (int[][]) ((int[][]) null));
        }
        field3015 = null;
        field3006 = null;
        field3020 = null;
        field2998 = null;
        field3002 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I[[FZLjb;[[FIII[[FI[[IFIIIII[[I)I", line = 132)
    public static final int method1340(int arg0, float[][] arg1, boolean arg2, class226 arg3, float[][] arg4, int arg5, int arg6, int arg7, float[][] arg8, int arg9, int[][] arg10, float arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int[][] arg17) {
        field3007++;
        if (arg0 == 1) {
            int var18 = arg15;
            arg15 = arg16;
            arg16 = 128 - var18;
        } else if (arg0 == 2) {
            arg15 = 128 - arg15;
            arg16 = 128 - arg16;
        } else if (arg0 == 3) {
            int var19 = arg15;
            arg15 = 128 - arg16;
            arg16 = var19;
        }
        if (arg7 != -22095) {
            return 27;
        }
        int var20;
        float var21;
        float var22;
        float var23;
        if (arg15 == 0 && arg16 == 0) {
            var20 = arg9;
            var21 = arg1[arg6][arg12];
            var22 = arg4[arg6][arg12];
            var23 = arg8[arg6][arg12];
        } else if (arg15 == 128 && arg16 == 0) {
            var20 = arg13;
            var21 = arg1[arg6 + 1][arg12];
            var23 = arg8[arg6 + 1][arg12];
            var22 = arg4[arg6 + 1][arg12];
        } else if (arg15 == 128 && arg16 == 128) {
            var23 = arg8[arg6 + 1][arg12 + 1];
            var20 = arg14;
            var22 = arg4[arg6 + 1][arg12 + 1];
            var21 = arg1[arg6 + 1][arg12 + 1];
        } else if (arg15 == 0 && arg16 == 128) {
            var23 = arg8[arg6][arg12 + 1];
            var22 = arg4[arg6][arg12 + 1];
            var20 = arg5;
            var21 = arg1[arg6][arg12 + 1];
        } else {
            float var24 = arg1[arg6][arg12];
            float var25 = arg4[arg6][arg12];
            float var26 = arg8[arg6][arg12];
            float var27 = arg4[arg6][arg12 + 1];
            float var28 = (float) arg15 / 128.0F;
            float var29 = (arg8[arg6 + 1][arg12] - var26) * var28 + var26;
            float var30 = arg1[arg6][arg12 + 1];
            float var31 = (arg4[arg6 + 1][arg12 + 1] - var27) * var28 + var27;
            float var32 = arg8[arg6][arg12 + 1];
            float var33 = (arg1[arg6 + 1][arg12] - var24) * var28 + var24;
            float var34 = (arg4[arg6 + 1][arg12] - var25) * var28 + var25;
            float var35 = (arg1[arg6 + 1][arg12 + 1] - var30) * var28 + var30;
            float var36 = (arg8[arg6 + 1][arg12 + 1] - var32) * var28 + var32;
            float var37 = (float) arg16 / 128.0F;
            var23 = (var36 - var29) * var37 + var29;
            int var38 = class345.method2430(arg9, (byte) -122, arg15, arg13);
            var22 = (var31 - var34) * var37 + var34;
            var21 = (var35 - var33) * var37 + var33;
            int var39 = class345.method2430(arg5, (byte) -122, arg15, arg14);
            var20 = class345.method2430(var38, (byte) -122, arg16, var39);
        }
        int var40 = (arg6 << 7) + arg15;
        int var41 = (arg12 << 7) + arg16;
        int var42 = class117.method760(arg12, arg16, arg10, 1, arg15, arg6);
        return arg3.method1536(var40, var42, var41, var22, var21, var23, arg2 ? var20 & 0xFFFFFF00 : var20, arg17 == null ? 0.0F : (float) (var42 - class117.method760(arg12, arg16, arg17, 1, arg15, arg6)) / arg11);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IZ[II)V", line = 243)
    public final void method1341(int arg0, boolean arg1, int[] arg2, int arg3) {
        arg2[1] = arg3 + this.field2997 - this.field3012;
        if (!arg1) {
            this.field2999 = 38;
        }
        arg2[2] = arg0 - (this.field3014 - this.field3000);
        arg2[0] = this.field2995;
        field3018++;
    }
}
