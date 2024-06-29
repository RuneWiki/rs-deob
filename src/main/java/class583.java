import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class583 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "Lnha;")
    public static class684 field8319;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILfe;IIIIIIIII)Z", line = 4)
    public static final boolean method3430(int arg0, class635 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field8318++;
        int var11 = arg10;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg10 - var13;
        class489.field7046[var13][var14] = 99;
        int var16 = arg6 - var14;
        class616.field8775[var13][var14] = 0;
        if (arg4 < 57) {
            return false;
        }
        byte var17 = 0;
        int var18 = 0;
        class216.field3240[var17] = arg10;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class563.field8152[var10001] = arg6;
        int[][] var19 = arg1.field8956;
        while (var26 != var18) {
            var11 = class216.field3240[var18];
            var12 = class563.field8152[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg1.field8950;
            int var23 = var12 - arg1.field8968;
            if (arg3 == -4) {
                if (arg2 == var11 && arg8 == var12) {
                    class501.field7283 = var12;
                    class265.field3795 = var11;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class176.method1270(arg2, 0, 2, arg7, 2, arg8, arg0, var12, var11)) {
                    class265.field3795 = var11;
                    class501.field7283 = var12;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg1.method3640(2, arg9, 2, 2, arg8, arg7, var11, var12, arg0, arg2)) {
                    class501.field7283 = var12;
                    class265.field3795 = var11;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg1.method3636(arg8, var11, arg2, var12, 2, true, arg7, arg9, arg0)) {
                    class501.field7283 = var12;
                    class265.field3795 = var11;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg1.method3637(arg3, arg2, var11, arg8, var12, 2, -120, arg5)) {
                    class501.field7283 = var12;
                    class265.field3795 = var11;
                    return true;
                }
            } else if (arg1.method3647(arg8, arg5, arg2, arg3, var12, var11, 2, -100)) {
                class501.field7283 = var12;
                class265.field3795 = var11;
                return true;
            }
            int var25 = class616.field8775[var20][var21] + 1;
            if (var20 > 0 && class489.field7046[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class216.field3240[var26] = var11 - 1;
                class563.field8152[var26] = var12;
                class489.field7046[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class616.field8775[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class489.field7046[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class216.field3240[var26] = var11 + 1;
                class563.field8152[var26] = var12;
                class489.field7046[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class616.field8775[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class489.field7046[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class216.field3240[var26] = var11;
                class563.field8152[var26] = var12 - 1;
                class489.field7046[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class616.field8775[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class489.field7046[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class216.field3240[var26] = var11;
                class563.field8152[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class489.field7046[var20][var21 + 1] = 4;
                class616.field8775[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class489.field7046[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class216.field3240[var26] = var11 - 1;
                class563.field8152[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class489.field7046[var20 - 1][var21 - 1] = 3;
                class616.field8775[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class489.field7046[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class216.field3240[var26] = var11 + 1;
                class563.field8152[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class489.field7046[var20 + 1][var21 - 1] = 9;
                class616.field8775[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class489.field7046[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class216.field3240[var26] = var11 - 1;
                class563.field8152[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class489.field7046[var20 - 1][var21 + 1] = 6;
                class616.field8775[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class489.field7046[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class216.field3240[var26] = var11 + 1;
                class563.field8152[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class489.field7046[var20 + 1][var21 + 1] = 12;
                class616.field8775[var20 + 1][var21 + 1] = var25;
            }
        }
        class265.field3795 = var11;
        class501.field7283 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIZFIIII)[[I", line = 359)
    public static final int[][] method3431(int arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5, int arg6, int arg7, int arg8) {
        field8314++;
        int[][] var9 = new int[arg7][arg1];
        class511 var10 = new class511();
        var10.field7406 = arg8;
        var10.field7409 = arg3;
        var10.field7408 = arg2;
        var10.field7413 = arg6;
        var10.field7401 = (int) (arg4 * 4096.0F);
        var10.method628(63);
        class148.method1039(arg1, arg7, -8540);
        int var11 = 54 / ((-arg5 - 28) / 56);
        for (int var12 = 0; var12 < arg7; var12++) {
            var10.method3105(var9[var12], var12, -11110);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;)I", line = 391)
    public static final int method3432(String arg0, int arg1, byte arg2, String arg3) {
        field8317++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        if (arg2 <= 26) {
            method3434(5);
        }
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var7 - var9 < var5) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if (var5 <= (var7 - var9)) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class160.method1137(var22, (byte) -92);
            var9 = class160.method1137(var24, (byte) -72);
            char var26 = class277.method1782(var22, 126, arg1);
            char var27 = class277.method1782(var24, 112, arg1);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class185.method1311(var28, arg1, true) - class185.method1311(var29, arg1, true);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class185.method1311(var20, arg1, true) - class185.method1311(var21, arg1, true);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class185.method1311(var14, arg1, true) - class185.method1311(var15, arg1, true);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIIII)Z", line = 515)
    public static final boolean method3433(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field8320++;
        if ((class160.field2297[0][arg4][arg3] & 0x2) != 0) {
            return true;
        } else if ((class160.field2297[arg2][arg4][arg3] & 0x10) != 0) {
            return false;
        } else if (arg1 == class296.method1851(arg2, arg3, arg4, 8)) {
            return true;
        } else {
            return arg0 != 16;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 537)
    public static void method3434(int arg0) {
        if (arg0 != 20521) {
            method3430(-65, null, 106, 25, 44, 64, -98, -50, -10, 60, 51);
        }
        field8319 = null;
    }
}
