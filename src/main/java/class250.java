import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class250 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "[I")
    public static int[] field3475 = new int[32];

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "Lla;")
    public static class319 field3476 = new class319(12, -2);

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "[Lvr;")
    public static class91[] field3482 = new class91[14];

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field3478 = -2;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "Lla;")
    public static class319 field3479;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3480;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILkg;IIIIZIIII)Z", line = 3)
    public static final boolean method1618(int arg0, class181 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field3481++;
        int var11 = arg4;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg4 - var13;
        class427.field6483[var13][var14] = 99;
        int var16 = arg3 - var14;
        class478.field7080[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class56.field814[var17] = arg4;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class1.field6[var10001] = arg3;
        int[][] var19 = arg1.field2451;
        while (var26 != var18) {
            var11 = class56.field814[var18];
            var12 = class1.field6[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var11 - arg1.field2433;
            int var23 = var12 - arg1.field2434;
            if (arg7 == -4) {
                if (arg0 == var11 && arg5 == var12) {
                    class106.field1495 = var12;
                    class118.field1621 = var11;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class36.method314(var11, 2, arg9, arg0, var12, (byte) 121, 2, arg5, arg8)) {
                    class118.field1621 = var11;
                    class106.field1495 = var12;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg1.method1223(var12, arg2, arg0, 2, arg8, 0, arg5, 2, var11, arg9)) {
                    class106.field1495 = var12;
                    class118.field1621 = var11;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg1.method1225(arg2, arg8, arg0, 2, arg5, var11, var12, arg9, 20198)) {
                    class106.field1495 = var12;
                    class118.field1621 = var11;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg1.method1222(var12, arg10, var11, arg5, 2, 2, arg7, arg0)) {
                    class118.field1621 = var11;
                    class106.field1495 = var12;
                    return true;
                }
            } else if (arg1.method1228(arg7, var12, 2, arg5, arg10, var11, false, arg0)) {
                class118.field1621 = var11;
                class106.field1495 = var12;
                return true;
            }
            int var25 = class478.field7080[var21][var20] + 1;
            if (var21 > 0 && class427.field6483[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class56.field814[var26] = var11 - 1;
                class1.field6[var26] = var12;
                class427.field6483[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class478.field7080[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class427.field6483[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class56.field814[var26] = var11 + 1;
                class1.field6[var26] = var12;
                class427.field6483[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class478.field7080[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class427.field6483[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class56.field814[var26] = var11;
                class1.field6[var26] = var12 - 1;
                class427.field6483[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class478.field7080[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class427.field6483[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class56.field814[var26] = var11;
                class1.field6[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class427.field6483[var21][var20 + 1] = 4;
                class478.field7080[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class427.field6483[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class56.field814[var26] = var11 - 1;
                class1.field6[var26] = var12 - 1;
                class427.field6483[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class478.field7080[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class427.field6483[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class56.field814[var26] = var11 + 1;
                class1.field6[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class427.field6483[var21 + 1][var20 - 1] = 9;
                class478.field7080[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class427.field6483[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class56.field814[var26] = var11 - 1;
                class1.field6[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class427.field6483[var21 - 1][var20 + 1] = 6;
                class478.field7080[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class427.field6483[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class56.field814[var26] = var11 + 1;
                class1.field6[var26] = var12 + 1;
                class427.field6483[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class478.field7080[var21 + 1][var20 + 1] = var25;
            }
        }
        if (!arg6) {
            field3480 = null;
        }
        class118.field1621 = var11;
        class106.field1495 = var12;
        return false;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 363)
    public static void method1619(int arg0) {
        field3475 = null;
        field3480 = null;
        if (arg0 <= 68) {
            method1619(65);
        }
        field3479 = null;
        field3476 = null;
        field3482 = null;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B", line = 386)
    public static final byte[] method1620(Object arg0, byte arg1, boolean arg2) {
        field3477++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class394.method2453((byte) 80, var3) : var3;
        } else if (arg0 instanceof class434) {
            class434 var4 = (class434) arg0;
            return var4.method1521((byte) 120);
        } else if (arg1 < 26) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
