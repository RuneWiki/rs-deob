import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class247 {

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public int field3892 = 0;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "[B")
    public byte[] field3890 = new byte[18002];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "[B")
    public byte[] field3889 = new byte[4096];

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "[I")
    public int[] field3895 = new int[257];

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "[I")
    public int[] field3900 = new int[256];

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "[Z")
    public boolean[] field3906 = new boolean[16];

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "[[I")
    public int[][] field3909 = new int[6][258];

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
    public int field3905 = 0;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "[[B")
    public byte[][] field3911 = new byte[6][258];

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "[I")
    public int[] field3903 = new int[6];

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "[B")
    public byte[] field3917 = new byte[256];

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "[[I")
    public int[][] field3919 = new int[6][258];

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "[B")
    public byte[] field3910 = new byte[18002];

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "[Z")
    public boolean[] field3920 = new boolean[256];

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "[[I")
    public int[][] field3926 = new int[6][258];

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "[I")
    public int[] field3930 = new int[16];

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field3902 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3916 = "Checking for updates - ";

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "[Ltf;")
    public static class284[] field3913 = new class284[50];

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "[Lne;")
    public static class262[] field3914 = new class262[4];

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3918 = "Loaded interfaces";

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field3928 = 0;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "B")
    public byte field3897;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public int field3896;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public int field3898;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public int field3904;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    public int field3907;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public int field3921;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public int field3923;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lqb;")
    public static class117 field3901;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[B")
    public byte[] field3891;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[B")
    public byte[] field3893;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V", line = 12)
    public static final void method1754(int arg0, boolean arg1) {
        field3922++;
        class274.field4338 = new int[arg0];
        class238.field3664 = new int[arg0];
        if (!arg1) {
            method1756(-47);
        }
        class187.field2828 = new int[arg0];
        class201.field3054 = new int[arg0];
        class131.field1894 = new int[arg0];
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([[FII[[FI[[IBII[[FFILwb;ZI[[III)I", line = 39)
    public static final int method1755(float[][] arg0, int arg1, int arg2, float[][] arg3, int arg4, int[][] arg5, byte arg6, int arg7, int arg8, float[][] arg9, float arg10, int arg11, class175 arg12, boolean arg13, int arg14, int[][] arg15, int arg16, int arg17) {
        if (arg1 == 1) {
            int var19 = arg4;
            arg4 = arg14;
            arg14 = 128 - var19;
        } else if (arg1 == 2) {
            arg4 = 128 - arg4;
            arg14 = 128 - arg14;
        } else if (arg1 == 3) {
            int var18 = arg4;
            arg4 = 128 - arg14;
            arg14 = var18;
        }
        field3929++;
        if (arg6 <= 73) {
            method1756(10);
        }
        float var20;
        float var21;
        float var22;
        int var23;
        if (arg4 == 0 && arg14 == 0) {
            var20 = arg3[arg11][arg17];
            var21 = arg9[arg11][arg17];
            var22 = arg0[arg11][arg17];
            var23 = arg2;
        } else if (arg4 == 128 && arg14 == 0) {
            var22 = arg0[arg11 + 1][arg17];
            var23 = arg7;
            var21 = arg9[arg11 + 1][arg17];
            var20 = arg3[arg11 + 1][arg17];
        } else if (arg4 == 128 && arg14 == 128) {
            var22 = arg0[arg11 + 1][arg17 + 1];
            var21 = arg9[arg11 + 1][arg17 + 1];
            var20 = arg3[arg11 + 1][arg17 + 1];
            var23 = arg8;
        } else if (arg4 == 0 && arg14 == 128) {
            var20 = arg3[arg11][arg17 + 1];
            var21 = arg9[arg11][arg17 + 1];
            var22 = arg0[arg11][arg17 + 1];
            var23 = arg16;
        } else {
            float var24 = arg3[arg11][arg17];
            float var25 = arg0[arg11][arg17];
            float var26 = arg9[arg11][arg17];
            float var27 = (float) arg4 / 128.0F;
            float var28 = (arg3[arg11 + 1][arg17] - var24) * var27 + var24;
            float var29 = (arg9[arg11 + 1][arg17] - var26) * var27 + var26;
            float var30 = (float) arg14 / 128.0F;
            float var31 = arg3[arg11][arg17 + 1];
            float var32 = (arg3[arg11 + 1][arg17 + 1] - var31) * var27 + var31;
            var20 = (var32 - var28) * var30 + var28;
            float var33 = (arg0[arg11 + 1][arg17] - var25) * var27 + var25;
            float var34 = arg0[arg11][arg17 + 1];
            float var35 = arg9[arg11][arg17 + 1];
            float var36 = (arg9[arg11 + 1][arg17 + 1] - var35) * var27 + var35;
            float var37 = (arg0[arg11 + 1][arg17 + 1] - var34) * var27 + var34;
            var22 = (var37 - var33) * var30 + var33;
            int var38 = class44.method274(-13109, arg4, arg2, arg7);
            var21 = (var36 - var29) * var30 + var29;
            int var39 = class44.method274(-13109, arg4, arg16, arg8);
            var23 = class44.method274(-13109, arg14, var38, var39);
        }
        int var40 = (arg11 << 7) + arg4;
        int var41 = (arg17 << 7) + arg14;
        int var42 = class178.method1231(arg11, arg17, (byte) -92, arg4, arg5, arg14);
        return arg12.method1215(var40, var42, var41, var20, var22, var21, arg13 ? var23 & 0xFFFFFF00 : var23, arg15 == null ? 0.0F : (float) (var42 - class178.method1231(arg11, arg17, (byte) -92, arg4, arg15, arg14)) / arg10);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 174)
    public static void method1756(int arg0) {
        field3902 = null;
        field3901 = null;
        field3916 = null;
        field3913 = null;
        field3918 = null;
        if (arg0 != 1) {
            method1755((float[][]) ((float[][]) null), 110, -123, (float[][]) ((float[][]) null), 6, (int[][]) ((int[][]) null), (byte) 62, 70, -82, (float[][]) ((float[][]) null), -3.042382F, -39, (class175) null, true, 81, (int[][]) ((int[][]) null), 52, 50);
        }
        field3914 = null;
    }
}
