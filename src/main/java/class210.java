import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class210 extends class5 {

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public static int field3211 = 0;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "[Lwm;")
    public static class254[] field3219 = new class254[2048];

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "[I")
    public static int[] field3230 = new int[5];

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "F")
    public static float field3204;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public int field3209;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public int field3210;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public int field3213;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public int field3214;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public int field3216;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public int field3217;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    public int field3218;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public int field3229;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    public int field3233;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "I")
    public int field3234;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "I")
    public int field3235;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "Luf;")
    public class200 field3212;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "Lid;")
    public class266 field3231;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "Lh;")
    public class303 field3232;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "Lhg;")
    public class316 field3223;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "Ljd;")
    public static class95 field3224;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "[[[B")
    public static byte[][][] field3221;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZLjd;)[Lhk;", line = 7)
    public static final class42[] method1501(int arg0, int arg1, boolean arg2, class95 arg3) {
        if (arg2) {
            return (class42[]) null;
        } else {
            field3220++;
            return class31.method233(arg1, 0, arg0, arg3) ? class311.method2134(5) : null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)V", line = 24)
    public final void method1502(byte arg0) {
        this.field3212 = null;
        field3215++;
        if (arg0 != 96) {
            this.field3207 = -21;
        }
        this.field3232 = null;
        this.field3231 = null;
        this.field3223 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lmn;IZ)Ljava/lang/String;", line = 48)
    public static final String method1503(class161 arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1505((byte) 106);
        }
        field3226++;
        if (!client.method1012(arg0).method26(1, arg1) && arg0.field2528 == null) {
            return null;
        } else if (arg0.field2448 == null || arg0.field2448.length <= arg1 || arg0.field2448[arg1] == null || arg0.field2448[arg1].trim().length() == 0) {
            return class335.field5216 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field2448[arg1];
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V", line = 82)
    public static void method1504(byte arg0) {
        field3221 = (byte[][][]) null;
        field3230 = null;
        field3224 = null;
        int var1 = -64 % ((arg0 + 69) / 44);
        field3219 = null;
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)I", line = 111)
    public static final int method1505(byte arg0) {
        field3222++;
        int var1 = -16 / ((-arg0 - 67) / 37);
        return 15;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lfn;[[FII[[FIBBIZ[[FI[[IIII)V", line = 126)
    public static final void method1506(class58 arg0, float[][] arg1, int arg2, int arg3, float[][] arg4, int arg5, byte arg6, byte arg7, int arg8, boolean arg9, float[][] arg10, int arg11, int[][] arg12, int arg13, int arg14, int arg15) {
        int var16 = (arg5 << 8) + 255;
        int var17 = (arg15 << 8) + 255;
        field3228++;
        int[] var18 = class258.field3981[arg6];
        int var19 = (arg2 << 8) + 255;
        if (arg13 != -17395) {
            method1501(-21, -39, false, (class95) null);
        }
        int[] var20 = new int[var18.length >> 1];
        int[] var21 = null;
        int var22 = (arg11 << 8) + 255;
        for (int var23 = 0; var23 < var20.length; var23++) {
            var20[var23] = class142.method1088(var16, arg10, 0.0F, var18[var23 + var23], arg0, arg1, arg14, false, var19, var17, arg8, (int[][]) null, arg7, class181.method1355(arg13, -17839), var18[var23 + var23 + 1], arg4, var22, arg12);
        }
        if (arg9) {
            if (arg6 == 1) {
                int var25 = class142.method1088(var16, arg10, 0.0F, 64, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 128, arg4, var22, arg12);
                int var26 = class142.method1088(var16, arg10, 0.0F, 128, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 64, arg4, var22, arg12);
                var21 = new int[] { var26, var25, var20[2], var25, var20[0], var20[2] };
            } else if (arg6 == 2) {
                int var27 = class142.method1088(var16, arg10, 0.0F, 128, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 128, arg4, var22, arg12);
                int var28 = class142.method1088(var16, arg10, 0.0F, 64, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 0, arg4, var22, arg12);
                var21 = new int[] { var20[0], var28, var27, var27, var20[1], var20[0] };
            } else if (arg6 == 3) {
                var21 = new int[6];
                int var29 = class142.method1088(var16, arg10, 0.0F, 0, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 128, arg4, var22, arg12);
                int var30 = class142.method1088(var16, arg10, 0.0F, 64, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 0, arg4, var22, arg12);
                var21[3] = var29;
                var21[0] = var20[2];
                var21[4] = var30;
                var21[1] = var20[1];
                var21[2] = var29;
                var21[5] = var20[2];
            } else if (arg6 == 4) {
                var21 = new int[3];
                int var31 = class142.method1088(var16, arg10, 0.0F, 0, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 128, arg4, var22, arg12);
                var21[1] = var31;
                var21[0] = var20[3];
                var21[2] = var20[0];
            } else if (arg6 == 5) {
                var21 = new int[3];
                int var32 = class142.method1088(var16, arg10, 0.0F, 128, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 128, arg4, var22, arg12);
                var21[1] = var32;
                var21[0] = var20[2];
                var21[2] = var20[3];
            } else if (arg6 == 6) {
                var21 = new int[6];
                int var33 = class142.method1088(var16, arg10, 0.0F, 128, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 0, arg4, var22, arg12);
                int var34 = class142.method1088(var16, arg10, 0.0F, 128, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 128, arg4, var22, arg12);
                var21[1] = var33;
                var21[0] = var20[3];
                var21[3] = var34;
                var21[5] = var20[3];
                var21[4] = var20[0];
                var21[2] = var34;
            } else if (arg6 == 7) {
                int var42 = class142.method1088(var16, arg10, 0.0F, 0, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 128, arg4, var22, arg12);
                var21 = new int[6];
                int var43 = class142.method1088(var16, arg10, 0.0F, 128, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 0, arg4, var22, arg12);
                var21[0] = var20[1];
                var21[3] = var42;
                var21[2] = var42;
                var21[4] = var20[2];
                var21[1] = var43;
                var21[5] = var20[1];
            } else if (arg6 == 8) {
                var21 = new int[3];
                int var41 = class142.method1088(var16, arg10, 0.0F, 0, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 0, arg4, var22, arg12);
                var21[2] = var20[4];
                var21[0] = var20[3];
                var21[1] = var41;
            } else if (arg6 == 9) {
                var21 = new int[15];
                int var35 = class142.method1088(var16, arg10, 0.0F, 128, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 64, arg4, var22, arg12);
                int var36 = class142.method1088(var16, arg10, 0.0F, 96, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 32, arg4, var22, arg12);
                int var37 = class142.method1088(var16, arg10, 0.0F, 64, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, arg13 + 19023, 0, arg4, var22, arg12);
                var21[14] = var37;
                var21[9] = var36;
                var21[3] = var36;
                var21[1] = var35;
                var21[2] = var20[4];
                var21[8] = var20[2];
                var21[4] = var20[4];
                var21[10] = var20[2];
                var21[0] = var36;
                var21[13] = var20[1];
                var21[7] = var20[3];
                var21[6] = var36;
                var21[12] = var36;
                var21[5] = var20[3];
                var21[11] = var20[1];
            } else if (arg6 == 10) {
                var21 = new int[9];
                int var38 = class142.method1088(var16, arg10, 0.0F, 0, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 128, arg4, var22, arg12);
                var21[0] = var20[2];
                var21[7] = var38;
                var21[4] = var38;
                var21[5] = var20[4];
                var21[2] = var20[3];
                var21[1] = var38;
                var21[8] = var20[0];
                var21[3] = var20[3];
                var21[6] = var20[4];
            } else if (arg6 == 11) {
                var21 = new int[12];
                int var39 = class142.method1088(var16, arg10, 0.0F, 0, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 64, arg4, var22, arg12);
                int var40 = class142.method1088(var16, arg10, 0.0F, 128, arg0, arg1, arg14, true, var19, var17, arg8, (int[][]) null, arg7, 1628, 64, arg4, var22, arg12);
                var21[8] = var39;
                var21[7] = var40;
                var21[1] = var39;
                var21[0] = var20[3];
                var21[11] = var40;
                var21[3] = var20[3];
                var21[2] = var20[0];
                var21[4] = var20[2];
                var21[6] = var20[2];
                var21[9] = var20[2];
                var21[10] = var20[1];
                var21[5] = var39;
            }
        }
        arg0.method412(arg3, arg8, arg14, var20, var21, false);
    }
}
