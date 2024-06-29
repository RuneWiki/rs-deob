import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class196 {

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "B")
    private byte field2950;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public int field2947;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public int field2938;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public int field2937;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lrm;")
    public static class5 field2941 = null;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "[I")
    public static int[] field2948 = new int[128];

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lbn;")
    public static class177 field2944;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2943;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)I", line = 5)
    public final int method1323(boolean arg0) {
        field2936++;
        if (arg0) {
            method1325(-76, (class207) null, 122);
        }
        return (this.field2950 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I", line = 16)
    public final int method1324(int arg0) {
        if (arg0 <= 67) {
            this.field2950 = -112;
        }
        field2940++;
        return this.field2950 & 0x7;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjh;I)Ljava/lang/String;", line = 27)
    public static final String method1325(int arg0, class207 arg1, int arg2) {
        field2945++;
        if (!client.method888(arg1).method724((byte) 100, arg2) && arg1.field3238 == null) {
            return null;
        }
        if (arg0 < 87) {
            method1325(127, (class207) null, 67);
        }
        if (arg1.field3157 == null || arg2 >= arg1.field3157.length || arg1.field3157[arg2] == null || arg1.field3157[arg2].trim().length() == 0) {
            return class269.field4149 ? "Hidden-" + arg2 : null;
        } else {
            return arg1.field3157[arg2];
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[[IZ[[FIBIILqa;B[[FIIBI[[F)V", line = 60)
    public static final void method1326(int arg0, int[][] arg1, boolean arg2, float[][] arg3, int arg4, byte arg5, int arg6, int arg7, class217 arg8, byte arg9, float[][] arg10, int arg11, int arg12, byte arg13, int arg14, float[][] arg15) {
        if (arg5 != -105) {
            field2941 = (class5) null;
        }
        int var16 = (arg7 << 8) + 255;
        int var17 = (arg6 << 8) + 255;
        field2946++;
        int var18 = (arg11 << 8) + 255;
        int var19 = (arg12 << 8) + 255;
        int[] var20 = class46.field653[arg13];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class188.method1299(var19, arg4, arg14, false, arg10, 0.0F, var18, arg3, var20[var23 + var23 + 1], var17, arg1, 119, var16, arg8, arg9, arg15, (int[][]) null, var20[var23 + var23]);
        }
        if (arg2) {
            if (arg13 == 1) {
                var21 = new int[6];
                int var42 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 128, var17, arg1, arg5 + 221, var16, arg8, arg9, arg15, (int[][]) null, 64);
                int var43 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 64, var17, arg1, arg5 ^ 0xFFFFFFF8, var16, arg8, arg9, arg15, (int[][]) null, 128);
                var21[2] = var22[2];
                var21[1] = var42;
                var21[5] = var22[2];
                var21[0] = var43;
                var21[4] = var22[0];
                var21[3] = var42;
            } else if (arg13 == 2) {
                var21 = new int[6];
                int var40 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 128, var17, arg1, arg5 + 143, var16, arg8, arg9, arg15, (int[][]) null, 128);
                int var41 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 0, var17, arg1, 77, var16, arg8, arg9, arg15, (int[][]) null, 64);
                var21[1] = var41;
                var21[3] = var40;
                var21[2] = var40;
                var21[4] = var22[1];
                var21[0] = var22[0];
                var21[5] = var22[0];
            } else if (arg13 == 3) {
                var21 = new int[6];
                int var38 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 128, var17, arg1, 96, var16, arg8, arg9, arg15, (int[][]) null, 0);
                int var39 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 0, var17, arg1, 51, var16, arg8, arg9, arg15, (int[][]) null, 64);
                var21[3] = var38;
                var21[1] = var22[1];
                var21[4] = var39;
                var21[0] = var22[2];
                var21[2] = var38;
                var21[5] = var22[2];
            } else if (arg13 == 4) {
                var21 = new int[3];
                int var25 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 128, var17, arg1, arg5 + 159, var16, arg8, arg9, arg15, (int[][]) null, 0);
                var21[1] = var25;
                var21[0] = var22[3];
                var21[2] = var22[0];
            } else if (arg13 == 5) {
                var21 = new int[3];
                int var37 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 128, var17, arg1, 33, var16, arg8, arg9, arg15, (int[][]) null, 128);
                var21[0] = var22[2];
                var21[2] = var22[3];
                var21[1] = var37;
            } else if (arg13 == 6) {
                var21 = new int[6];
                int var26 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 0, var17, arg1, 90, var16, arg8, arg9, arg15, (int[][]) null, 128);
                int var27 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 128, var17, arg1, 78, var16, arg8, arg9, arg15, (int[][]) null, 128);
                var21[0] = var22[3];
                var21[4] = var22[0];
                var21[3] = var27;
                var21[1] = var26;
                var21[2] = var27;
                var21[5] = var22[3];
            } else if (arg13 == 7) {
                var21 = new int[6];
                int var28 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 128, var17, arg1, 120, var16, arg8, arg9, arg15, (int[][]) null, 0);
                int var29 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 0, var17, arg1, 23, var16, arg8, arg9, arg15, (int[][]) null, 128);
                var21[3] = var28;
                var21[0] = var22[1];
                var21[2] = var28;
                var21[1] = var29;
                var21[4] = var22[2];
                var21[5] = var22[1];
            } else if (arg13 == 8) {
                var21 = new int[3];
                int var36 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 0, var17, arg1, 55, var16, arg8, arg9, arg15, (int[][]) null, 0);
                var21[2] = var22[4];
                var21[0] = var22[3];
                var21[1] = var36;
            } else if (arg13 == 9) {
                var21 = new int[15];
                int var30 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 64, var17, arg1, 90, var16, arg8, arg9, arg15, (int[][]) null, 128);
                int var31 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 32, var17, arg1, 52, var16, arg8, arg9, arg15, (int[][]) null, 96);
                int var32 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 0, var17, arg1, arg5 + 163, var16, arg8, arg9, arg15, (int[][]) null, 64);
                var21[0] = var31;
                var21[1] = var30;
                var21[11] = var22[1];
                var21[12] = var31;
                var21[6] = var31;
                var21[3] = var31;
                var21[5] = var22[3];
                var21[14] = var32;
                var21[13] = var22[1];
                var21[7] = var22[3];
                var21[9] = var31;
                var21[2] = var22[4];
                var21[4] = var22[4];
                var21[8] = var22[2];
                var21[10] = var22[2];
            } else if (arg13 == 10) {
                var21 = new int[9];
                int var33 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 128, var17, arg1, 80, var16, arg8, arg9, arg15, (int[][]) null, 0);
                var21[0] = var22[2];
                var21[1] = var33;
                var21[4] = var33;
                var21[5] = var22[4];
                var21[2] = var22[3];
                var21[7] = var33;
                var21[3] = var22[3];
                var21[8] = var22[0];
                var21[6] = var22[4];
            } else if (arg13 == 11) {
                var21 = new int[12];
                int var34 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 64, var17, arg1, 42, var16, arg8, arg9, arg15, (int[][]) null, 0);
                int var35 = class188.method1299(var19, arg4, arg14, true, arg10, 0.0F, var18, arg3, 64, var17, arg1, 79, var16, arg8, arg9, arg15, (int[][]) null, 128);
                var21[11] = var35;
                var21[1] = var34;
                var21[10] = var22[1];
                var21[8] = var34;
                var21[7] = var35;
                var21[0] = var22[3];
                var21[3] = var22[3];
                var21[5] = var34;
                var21[2] = var22[0];
                var21[6] = var22[2];
                var21[4] = var22[2];
                var21[9] = var22[2];
            }
        }
        arg8.method1448(arg0, arg14, arg4, var22, var21, false);
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 336)
    public static void method1327(int arg0) {
        field2943 = null;
        field2941 = null;
        if (arg0 == -25555) {
            field2948 = null;
            field2944 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)I", line = 351)
    public static final int method1328(int arg0, int arg1, int arg2) {
        field2952++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg1 != -30048) {
            return 3;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lwf;IBI)Lng;", line = 402)
    public static final class245 method1329(class306 arg0, int arg1, byte arg2, int arg3) {
        field2939++;
        int var4 = 76 / ((54 - arg2) / 35);
        return class156.method1093(true, arg1, arg3, arg0) ? class311.method2138((byte) 3) : null;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 419)
    public class196() {
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lgn;)V", line = 421)
    public class196(class303 arg0) {
        this.field2950 = arg0.method2001(-3);
        this.field2947 = arg0.method1994(false);
        this.field2949 = arg0.method1996(105);
        this.field2938 = arg0.method1996(-69);
        this.field2942 = arg0.method1996(-45);
        this.field2937 = arg0.method1996(-59);
    }
}
