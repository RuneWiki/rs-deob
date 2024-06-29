import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class132 extends RuntimeException {

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Ljava/lang/String;")
    public String field2269;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2268;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
    public static int[] field2266 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[Z")
    public static boolean[] field2265 = new boolean[200];

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field2270 = -1;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "[[B")
    public static byte[][] field2271 = new byte[250][];

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)I", line = 13)
    public static final int method917(int arg0, byte arg1) {
        field2267++;
        if (arg1 != -73) {
            method920(5);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 31)
    public static final void method918(int arg0) {
        field2263++;
        if (arg0 == 0) {
            class110.field1724.method1185(1);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III[[FB[[FII[[FIBBIZ[[ILbi;)V", line = 48)
    public static final void method919(int arg0, int arg1, int arg2, float[][] arg3, byte arg4, float[][] arg5, int arg6, int arg7, float[][] arg8, int arg9, byte arg10, byte arg11, int arg12, boolean arg13, int[][] arg14, class201 arg15) {
        int var16 = (arg1 << 8) + 255;
        int var17 = (arg2 << 8) + 255;
        int var18 = (arg0 << 8) + 255;
        int var19 = -92 % ((arg4 + 48) / 44);
        field2272++;
        int var20 = (arg9 << 8) + 255;
        int[] var21 = class40.field633[arg11];
        int[] var22 = null;
        int[] var23 = new int[var21.length >> 1];
        for (int var24 = 0; var24 < var23.length; var24++) {
            var23[var24] = class190.method1360(arg8, arg7, -117, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, var21[var24 + var24 + 1], var20, var16, arg3, arg10, var21[var24 + var24], false, arg12);
        }
        if (arg13) {
            if (arg11 == 1) {
                var22 = new int[6];
                int var43 = class190.method1360(arg8, arg7, -127, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 128, var20, var16, arg3, arg10, 64, true, arg12);
                int var44 = class190.method1360(arg8, arg7, -105, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 64, var20, var16, arg3, arg10, 128, true, arg12);
                var22[3] = var43;
                var22[0] = var44;
                var22[1] = var43;
                var22[4] = var23[0];
                var22[2] = var23[2];
                var22[5] = var23[2];
            } else if (arg11 == 2) {
                var22 = new int[6];
                int var41 = class190.method1360(arg8, arg7, -97, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 128, var20, var16, arg3, arg10, 128, true, arg12);
                int var42 = class190.method1360(arg8, arg7, -123, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 0, var20, var16, arg3, arg10, 64, true, arg12);
                var22[2] = var41;
                var22[0] = var23[0];
                var22[5] = var23[0];
                var22[1] = var42;
                var22[4] = var23[1];
                var22[3] = var41;
            } else if (arg11 == 3) {
                var22 = new int[6];
                int var39 = class190.method1360(arg8, arg7, -100, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 128, var20, var16, arg3, arg10, 0, true, arg12);
                int var40 = class190.method1360(arg8, arg7, -119, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 0, var20, var16, arg3, arg10, 64, true, arg12);
                var22[4] = var40;
                var22[0] = var23[2];
                var22[3] = var39;
                var22[1] = var23[1];
                var22[2] = var39;
                var22[5] = var23[2];
            } else if (arg11 == 4) {
                var22 = new int[3];
                int var38 = class190.method1360(arg8, arg7, -106, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 128, var20, var16, arg3, arg10, 0, true, arg12);
                var22[0] = var23[3];
                var22[2] = var23[0];
                var22[1] = var38;
            } else if (arg11 == 5) {
                var22 = new int[3];
                int var37 = class190.method1360(arg8, arg7, -109, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 128, var20, var16, arg3, arg10, 128, true, arg12);
                var22[0] = var23[2];
                var22[2] = var23[3];
                var22[1] = var37;
            } else if (arg11 == 6) {
                var22 = new int[6];
                int var26 = class190.method1360(arg8, arg7, -118, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 0, var20, var16, arg3, arg10, 128, true, arg12);
                int var27 = class190.method1360(arg8, arg7, -101, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 128, var20, var16, arg3, arg10, 128, true, arg12);
                var22[1] = var26;
                var22[2] = var27;
                var22[0] = var23[3];
                var22[4] = var23[0];
                var22[3] = var27;
                var22[5] = var23[3];
            } else if (arg11 == 7) {
                var22 = new int[6];
                int var35 = class190.method1360(arg8, arg7, -111, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 128, var20, var16, arg3, arg10, 0, true, arg12);
                int var36 = class190.method1360(arg8, arg7, -121, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 0, var20, var16, arg3, arg10, 128, true, arg12);
                var22[3] = var35;
                var22[0] = var23[1];
                var22[1] = var36;
                var22[5] = var23[1];
                var22[2] = var35;
                var22[4] = var23[2];
            } else if (arg11 == 8) {
                var22 = new int[3];
                int var34 = class190.method1360(arg8, arg7, -121, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 0, var20, var16, arg3, arg10, 0, true, arg12);
                var22[0] = var23[3];
                var22[1] = var34;
                var22[2] = var23[4];
            } else if (arg11 == 9) {
                var22 = new int[15];
                int var31 = class190.method1360(arg8, arg7, -114, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 64, var20, var16, arg3, arg10, 128, true, arg12);
                int var32 = class190.method1360(arg8, arg7, -101, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 32, var20, var16, arg3, arg10, 96, true, arg12);
                int var33 = class190.method1360(arg8, arg7, -108, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 0, var20, var16, arg3, arg10, 64, true, arg12);
                var22[3] = var32;
                var22[14] = var33;
                var22[5] = var23[3];
                var22[6] = var32;
                var22[0] = var32;
                var22[1] = var31;
                var22[7] = var23[3];
                var22[13] = var23[1];
                var22[11] = var23[1];
                var22[2] = var23[4];
                var22[8] = var23[2];
                var22[9] = var32;
                var22[4] = var23[4];
                var22[12] = var32;
                var22[10] = var23[2];
            } else if (arg11 == 10) {
                var22 = new int[9];
                int var30 = class190.method1360(arg8, arg7, -107, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 128, var20, var16, arg3, arg10, 0, true, arg12);
                var22[1] = var30;
                var22[4] = var30;
                var22[6] = var23[4];
                var22[7] = var30;
                var22[0] = var23[2];
                var22[8] = var23[0];
                var22[2] = var23[3];
                var22[3] = var23[3];
                var22[5] = var23[4];
            } else if (arg11 == 11) {
                var22 = new int[12];
                int var28 = class190.method1360(arg8, arg7, -112, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 64, var20, var16, arg3, arg10, 0, true, arg12);
                int var29 = class190.method1360(arg8, arg7, -111, var17, var18, 0.0F, (int[][]) null, arg14, arg5, arg15, 64, var20, var16, arg3, arg10, 128, true, arg12);
                var22[7] = var29;
                var22[8] = var28;
                var22[5] = var28;
                var22[1] = var28;
                var22[10] = var23[1];
                var22[11] = var29;
                var22[0] = var23[3];
                var22[2] = var23[0];
                var22[3] = var23[3];
                var22[6] = var23[2];
                var22[9] = var23[2];
                var22[4] = var23[2];
            }
        }
        arg15.method1420(arg6, arg7, arg12, var23, var22, false);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V", line = 346)
    public static void method920(int arg0) {
        if (arg0 != 2) {
            field2271 = (byte[][]) ((byte[][]) null);
        }
        field2266 = null;
        field2271 = (byte[][]) null;
        field2265 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 357)
    public class132(Throwable arg0, String arg1) {
        this.field2269 = arg1;
        this.field2268 = arg0;
    }
}
