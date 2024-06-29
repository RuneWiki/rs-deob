import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class271 {

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Lcc;")
    public static class327 field3888 = new class327(64);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lij;")
    public class117 field3882;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Lom;")
    public static class144 field3887;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "[I")
    public int[] field3892;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 5)
    public static void method1845(int arg0) {
        field3888 = null;
        if (arg0 != -63361369) {
            method1848(-8, -105, (char) 65472);
        }
        field3887 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([[FIBIII[[FIBBLih;Z[[F[[III)V", line = 22)
    public static final void method1846(float[][] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, float[][] arg6, int arg7, byte arg8, byte arg9, class70 arg10, boolean arg11, float[][] arg12, int[][] arg13, int arg14, int arg15) {
        int var16 = (arg1 << 8) + 255;
        int var17 = (arg7 << 8) + 255;
        field3886++;
        int var18 = (arg5 << 8) + 255;
        int var19 = (arg4 << 8) + 255;
        int var20 = 36 % ((arg2 - 71) / 47);
        int[] var21 = null;
        int[] var22 = class33.field411[arg8];
        int[] var23 = new int[var22.length >> 1];
        for (int var24 = 0; var24 < var23.length; var24++) {
            var23[var24] = class310.method2158(arg6, var22[var24 + var24 + 1], arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, false, 0.0F, arg0, arg9, var22[var24 + var24], 75, var19, var18, var17);
        }
        if (arg11) {
            if (arg8 == 1) {
                var21 = new int[6];
                int var26 = class310.method2158(arg6, 128, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 64, 98, var19, var18, var17);
                int var27 = class310.method2158(arg6, 64, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 128, 81, var19, var18, var17);
                var21[2] = var23[2];
                var21[0] = var27;
                var21[5] = var23[2];
                var21[3] = var26;
                var21[1] = var26;
                var21[4] = var23[0];
            } else if (arg8 == 2) {
                int var43 = class310.method2158(arg6, 128, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 128, 75, var19, var18, var17);
                var21 = new int[6];
                int var44 = class310.method2158(arg6, 0, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 64, 126, var19, var18, var17);
                var21[1] = var44;
                var21[3] = var43;
                var21[4] = var23[1];
                var21[0] = var23[0];
                var21[2] = var43;
                var21[5] = var23[0];
            } else if (arg8 == 3) {
                var21 = new int[6];
                int var41 = class310.method2158(arg6, 128, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 0, 87, var19, var18, var17);
                int var42 = class310.method2158(arg6, 0, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 64, 38, var19, var18, var17);
                var21[1] = var23[1];
                var21[4] = var42;
                var21[0] = var23[2];
                var21[3] = var41;
                var21[2] = var41;
                var21[5] = var23[2];
            } else if (arg8 == 4) {
                var21 = new int[3];
                int var28 = class310.method2158(arg6, 128, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 0, 67, var19, var18, var17);
                var21[0] = var23[3];
                var21[1] = var28;
                var21[2] = var23[0];
            } else if (arg8 == 5) {
                int var29 = class310.method2158(arg6, 128, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 128, 102, var19, var18, var17);
                var21 = new int[] { var23[2], var29, var23[3] };
            } else if (arg8 == 6) {
                var21 = new int[6];
                int var39 = class310.method2158(arg6, 0, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 128, 126, var19, var18, var17);
                int var40 = class310.method2158(arg6, 128, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 128, 108, var19, var18, var17);
                var21[1] = var39;
                var21[0] = var23[3];
                var21[4] = var23[0];
                var21[3] = var40;
                var21[2] = var40;
                var21[5] = var23[3];
            } else if (arg8 == 7) {
                var21 = new int[6];
                int var30 = class310.method2158(arg6, 128, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 0, 80, var19, var18, var17);
                int var31 = class310.method2158(arg6, 0, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 128, 59, var19, var18, var17);
                var21[2] = var30;
                var21[0] = var23[1];
                var21[3] = var30;
                var21[4] = var23[2];
                var21[1] = var31;
                var21[5] = var23[1];
            } else if (arg8 == 8) {
                var21 = new int[3];
                int var32 = class310.method2158(arg6, 0, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 0, 126, var19, var18, var17);
                var21[0] = var23[3];
                var21[1] = var32;
                var21[2] = var23[4];
            } else if (arg8 == 9) {
                int var36 = class310.method2158(arg6, 64, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 128, 117, var19, var18, var17);
                int var37 = class310.method2158(arg6, 32, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 96, 51, var19, var18, var17);
                int var38 = class310.method2158(arg6, 0, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 64, 68, var19, var18, var17);
                var21 = new int[] { var37, var36, var23[4], var37, var23[4], var23[3], var37, var23[3], var23[2], var37, var23[2], var23[1], var37, var23[1], var38 };
            } else if (arg8 == 10) {
                var21 = new int[9];
                int var35 = class310.method2158(arg6, 128, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 0, 22, var19, var18, var17);
                var21[0] = var23[2];
                var21[7] = var35;
                var21[4] = var35;
                var21[6] = var23[4];
                var21[8] = var23[0];
                var21[2] = var23[3];
                var21[1] = var35;
                var21[5] = var23[4];
                var21[3] = var23[3];
            } else if (arg8 == 11) {
                var21 = new int[12];
                int var33 = class310.method2158(arg6, 64, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 0, 32, var19, var18, var17);
                int var34 = class310.method2158(arg6, 64, arg15, arg13, arg12, (int[][]) null, arg10, var16, arg14, true, 0.0F, arg0, arg9, 128, 110, var19, var18, var17);
                var21[0] = var23[3];
                var21[11] = var34;
                var21[3] = var23[3];
                var21[7] = var34;
                var21[1] = var33;
                var21[10] = var23[1];
                var21[5] = var33;
                var21[8] = var33;
                var21[2] = var23[0];
                var21[9] = var23[2];
                var21[4] = var23[2];
                var21[6] = var23[2];
            }
        }
        arg10.method518(arg3, arg14, arg15, var23, var21, false);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZII)I", line = 298)
    public static final int method1847(int arg0, boolean arg1, int arg2, int arg3) {
        field3884++;
        if (class74.field978 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class9.field101[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg0 & 0x7F;
        if (arg1) {
            int var8 = arg2 & 0x7F;
            int var9 = (128 - var8) * class74.field978[var6][var4][var5] + (class74.field978[var6][var4 + 1][var5] * var8) >> 7;
            int var10 = (128 - var8) * class74.field978[var6][var4][var5 + 1] + class74.field978[var6][var4 + 1][var5 + 1] * var8 >> 7;
            return (128 - var7) * var9 + var7 * var10 >> 7;
        } else {
            return 126;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIC)C", line = 349)
    public static final char method1848(int arg0, int arg1, char arg2) {
        field3889++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 == 'Ñ' && arg1 != 0) {
                return 'N';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 == 'ñ' && arg1 != 0) {
                return 'n';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else if (arg2 == 'Ÿ') {
            return 'Y';
        } else {
            int var3 = 81 % ((arg0 - 30) / 55);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIZ)V", line = 434)
    public static final void method1849(int arg0, int arg1, boolean arg2) {
        if (class95.field1235 != arg0) {
            class82.field1062 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class82.field1062[var3] = (var3 << 12) / arg0;
            }
            class245.field3573 = arg0 - 1;
            class95.field1235 = arg0;
            class116.field1505 = arg0 * 32;
        }
        if (class224.field3233 != arg1) {
            if (class95.field1235 == arg1) {
                class274.field3919 = class82.field1062;
            } else {
                class274.field3919 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class274.field3919[var4] = (var4 << 12) / arg1;
                }
            }
            class156.field2165 = arg1 - 1;
            class224.field3233 = arg1;
        }
        field3885++;
        if (arg2) {
            field3887 = (class144) null;
        }
    }
}
