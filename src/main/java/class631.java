import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class631 {

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field8758 = -1;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field8749;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field8750;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lac;I)Lpp;")
    public static final class358 method3534(class501 arg0, int arg1) {
        field8753++;
        int var2 = arg0.method2840(false);
        if (arg1 <= 89) {
            field8757 = -52;
        }
        return new class358(var2);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILnn;IIIIIIII)Z")
    public static final boolean method3535(int arg0, int arg1, class380 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field8754++;
        int var11 = arg5;
        int var12 = arg0;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        class675.field9527[var13][var14] = 99;
        int var16 = arg0 - var14;
        class182.field2634[var13][var14] = 0;
        byte var17 = 0;
        class341.field4577[var17] = arg5;
        if (arg7 != -1) {
            method3536('%', false);
        }
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class72.field957[var10001] = arg0;
        int[][] var19 = arg2.field5064;
        while (var26 != var18) {
            var11 = class341.field4577[var18];
            var12 = class72.field957[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var12 - arg2.field5070;
            int var23 = var11 - arg2.field5069;
            if (arg1 == -4) {
                if (arg4 == var11 && arg8 == var12) {
                    class185.field2683 = var11;
                    class16.field166 = var12;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class576.method3291(arg7 + 77, var11, 1, arg4, 1, arg6, arg10, var12, arg8)) {
                    class185.field2683 = var11;
                    class16.field166 = var12;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg2.method2174(arg4, arg10, var11, var12, arg6, arg9, 1, 84, 1, arg8)) {
                    class185.field2683 = var11;
                    class16.field166 = var12;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg2.method2186(arg9, var12, arg8, arg10, arg6, false, var11, 1, arg4)) {
                    class16.field166 = var12;
                    class185.field2683 = var11;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg2.method2172(var11, arg3, arg1, arg4, arg8, var12, -100, 1)) {
                    class185.field2683 = var11;
                    class16.field166 = var12;
                    return true;
                }
            } else if (arg2.method2185(-127, 1, var12, arg3, arg4, arg1, arg8, var11)) {
                class16.field166 = var12;
                class185.field2683 = var11;
                return true;
            }
            int var25 = class182.field2634[var21][var20] + 1;
            if (var21 > 0 && class675.field9527[var21 - 1][var20] == 0 && (var19[var23 - 1][var22] & 0x42240000) == 0) {
                class341.field4577[var26] = var11 - 1;
                class72.field957[var26] = var12;
                class675.field9527[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class182.field2634[var21 - 1][var20] = var25;
            }
            if (var21 < 127 && class675.field9527[var21 + 1][var20] == 0 && (var19[var23 + 1][var22] & 0x60240000) == 0) {
                class341.field4577[var26] = var11 + 1;
                class72.field957[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class675.field9527[var21 + 1][var20] = 8;
                class182.field2634[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class675.field9527[var21][var20 - 1] == 0 && (var19[var23][var22 - 1] & 0x40A40000) == 0) {
                class341.field4577[var26] = var11;
                class72.field957[var26] = var12 - 1;
                class675.field9527[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class182.field2634[var21][var20 - 1] = var25;
            }
            if (var20 < 127 && class675.field9527[var21][var20 + 1] == 0 && (var19[var23][var22 + 1] & 0x48240000) == 0) {
                class341.field4577[var26] = var11;
                class72.field957[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class675.field9527[var21][var20 + 1] = 4;
                class182.field2634[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class675.field9527[var21 - 1][var20 - 1] == 0 && (var19[var23 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var22] & 0x42240000) == 0 && (var19[var23][var22 - 1] & 0x40A40000) == 0) {
                class341.field4577[var26] = var11 - 1;
                class72.field957[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class675.field9527[var21 - 1][var20 - 1] = 3;
                class182.field2634[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 127 && var20 > 0 && class675.field9527[var21 + 1][var20 - 1] == 0 && (var19[var23 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var22] & 0x60240000) == 0 && (var19[var23][var22 - 1] & 0x40A40000) == 0) {
                class341.field4577[var26] = var11 + 1;
                class72.field957[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class675.field9527[var21 + 1][var20 - 1] = 9;
                class182.field2634[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 127 && class675.field9527[var21 - 1][var20 + 1] == 0 && (var19[var23 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var22] & 0x42240000) == 0 && (var19[var23][var22 + 1] & 0x48240000) == 0) {
                class341.field4577[var26] = var11 - 1;
                class72.field957[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class675.field9527[var21 - 1][var20 + 1] = 6;
                class182.field2634[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 127 && var20 < 127 && class675.field9527[var21 + 1][var20 + 1] == 0 && (var19[var23 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var22] & 0x60240000) == 0 && (var19[var23][var22 + 1] & 0x48240000) == 0) {
                class341.field4577[var26] = var11 + 1;
                class72.field957[var26] = var12 + 1;
                class675.field9527[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class182.field2634[var21 + 1][var20 + 1] = var25;
            }
        }
        class16.field166 = var12;
        class185.field2683 = var11;
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(CZ)B")
    public static final byte method3536(char arg0, boolean arg1) {
        field8749++;
        if (!arg1) {
            return 67;
        }
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3537(boolean arg0, int arg1) {
        field8751++;
        boolean var2 = class334.field4506.method120();
        int var3 = -112 / ((arg1 - 49) / 49);
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class334.field4506.method196();
        } else if (!class334.field4506.method192()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class366.field4875.field9340 = arg0;
            class366.field4875.method543(class543.field7374, (byte) 76);
            return true;
        }
    }
}
