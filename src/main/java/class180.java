import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class180 {

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "[I")
    public static int[] field2560 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "[I")
    public static int[] field2561;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lkf;Lkf;IZI)I")
    public static final int method1133(class212 arg0, class212 arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 != 0) {
            return -126;
        }
        field2559++;
        if (arg2 == 1) {
            int var5 = arg1.field4363;
            int var6 = arg0.field4363;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class397.method2373(class173.field2491, arg0.method1387(-17730).field4401, 0, arg1.method1387(-17730).field4401);
        } else if (arg2 == 3) {
            if (arg1.field2992.equals("-")) {
                if (arg0.field2992.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field2992.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class397.method2373(class173.field2491, arg0.field2992, 0, arg1.field2992);
            }
        } else if (arg2 == 4) {
            if (arg1.method2009(-3309)) {
                return arg0.method2009(-3309) ? 0 : 1;
            } else if (arg0.method2009(-3309)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 5) {
            if (arg1.method2010(32)) {
                return arg0.method2010(32) ? 0 : 1;
            } else if (arg0.method2010(arg4 + 32)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 6) {
            if (arg1.method2011(true)) {
                return arg0.method2011(true) ? 0 : 1;
            } else if (arg0.method2011(true)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 7) {
            if (arg1.method2008((byte) -98)) {
                return arg0.method2008((byte) -98) ? 0 : 1;
            } else if (arg0.method2008((byte) -98)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 == 8) {
            int var7 = arg1.field2996;
            int var8 = arg0.field2996;
            if (arg3) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var8 == -1) {
                    var8 = 1000;
                }
                if (var7 == -1) {
                    var7 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg1.field2994 - arg0.field2994;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
    public static void method1134(int arg0) {
        field2561 = null;
        if (arg0 == -28770) {
            field2560 = null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIIILld;IIZII)Z")
    public static final boolean method1135(int arg0, int arg1, int arg2, int arg3, int arg4, class145 arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field2562++;
        int var11 = arg7;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        int var16 = arg6 - var14;
        class418.field5895[var13][var14] = 99;
        class546.field7558[var13][var14] = 0;
        byte var17 = 0;
        if (!arg8) {
            method1133(null, null, 11, true, 112);
        }
        int var18 = 0;
        class335.field4466[var17] = arg7;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class3.field37[var10001] = arg6;
        int[][] var19 = arg5.field2253;
        while (var26 != var18) {
            var11 = class335.field4466[var18];
            var12 = class3.field37[var18];
            int var20 = var11 - arg5.field2243;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var12 - arg5.field2244;
            int var23 = var12 - var16;
            if (arg9 == -4) {
                if (arg4 == var11 && arg10 == var12) {
                    class29.field485 = var12;
                    class640.field9315 = var11;
                    return true;
                }
            } else if (arg9 == -3) {
                if (class120.method839(var11, arg0, (byte) -12, var12, 1, arg4, arg2, 1, arg10)) {
                    class640.field9315 = var11;
                    class29.field485 = var12;
                    return true;
                }
            } else if (arg9 == -2) {
                if (arg5.method969(1, arg1, (byte) 123, arg4, var11, var12, 1, arg10, arg0, arg2)) {
                    class640.field9315 = var11;
                    class29.field485 = var12;
                    return true;
                }
            } else if (arg9 == -1) {
                if (arg5.method965(arg10, var11, arg4, (byte) 61, arg0, 1, arg2, arg1, var12)) {
                    class640.field9315 = var11;
                    class29.field485 = var12;
                    return true;
                }
            } else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
                if (arg5.method957(arg10, arg4, var11, arg3, false, arg9, var12, 1)) {
                    class640.field9315 = var11;
                    class29.field485 = var12;
                    return true;
                }
            } else if (arg5.method963(671744, var12, arg9, arg10, 1, arg3, var11, arg4)) {
                class29.field485 = var12;
                class640.field9315 = var11;
                return true;
            }
            int var25 = class546.field7558[var21][var23] + 1;
            if (var21 > 0 && class418.field5895[var21 - 1][var23] == 0 && (var19[var20 - 1][var22] & 0x42240000) == 0) {
                class335.field4466[var26] = var11 - 1;
                class3.field37[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class418.field5895[var21 - 1][var23] = 2;
                class546.field7558[var21 - 1][var23] = var25;
            }
            if (var21 < 127 && class418.field5895[var21 + 1][var23] == 0 && (var19[var20 + 1][var22] & 0x60240000) == 0) {
                class335.field4466[var26] = var11 + 1;
                class3.field37[var26] = var12;
                class418.field5895[var21 + 1][var23] = 8;
                var26 = var26 + 1 & 0xFFF;
                class546.field7558[var21 + 1][var23] = var25;
            }
            if (var23 > 0 && class418.field5895[var21][var23 - 1] == 0 && (var19[var20][var22 - 1] & 0x40A40000) == 0) {
                class335.field4466[var26] = var11;
                class3.field37[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class418.field5895[var21][var23 - 1] = 1;
                class546.field7558[var21][var23 - 1] = var25;
            }
            if (var23 < 127 && class418.field5895[var21][var23 + 1] == 0 && (var19[var20][var22 + 1] & 0x48240000) == 0) {
                class335.field4466[var26] = var11;
                class3.field37[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class418.field5895[var21][var23 + 1] = 4;
                class546.field7558[var21][var23 + 1] = var25;
            }
            if (var21 > 0 && var23 > 0 && class418.field5895[var21 - 1][var23 - 1] == 0 && (var19[var20 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var22] & 0x42240000) == 0 && (var19[var20][var22 - 1] & 0x40A40000) == 0) {
                class335.field4466[var26] = var11 - 1;
                class3.field37[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class418.field5895[var21 - 1][var23 - 1] = 3;
                class546.field7558[var21 - 1][var23 - 1] = var25;
            }
            if (var21 < 127 && var23 > 0 && class418.field5895[var21 + 1][var23 - 1] == 0 && (var19[var20 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var22] & 0x60240000) == 0 && (var19[var20][var22 - 1] & 0x40A40000) == 0) {
                class335.field4466[var26] = var11 + 1;
                class3.field37[var26] = var12 - 1;
                class418.field5895[var21 + 1][var23 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class546.field7558[var21 + 1][var23 - 1] = var25;
            }
            if (var21 > 0 && var23 < 127 && class418.field5895[var21 - 1][var23 + 1] == 0 && (var19[var20 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var22] & 0x42240000) == 0 && (var19[var20][var22 + 1] & 0x48240000) == 0) {
                class335.field4466[var26] = var11 - 1;
                class3.field37[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class418.field5895[var21 - 1][var23 + 1] = 6;
                class546.field7558[var21 - 1][var23 + 1] = var25;
            }
            if (var21 < 127 && var23 < 127 && class418.field5895[var21 + 1][var23 + 1] == 0 && (var19[var20 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var22] & 0x60240000) == 0 && (var19[var20][var22 + 1] & 0x48240000) == 0) {
                class335.field4466[var26] = var11 + 1;
                class3.field37[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class418.field5895[var21 + 1][var23 + 1] = 12;
                class546.field7558[var21 + 1][var23 + 1] = var25;
            }
        }
        class29.field485 = var12;
        class640.field9315 = var11;
        return false;
    }
}
