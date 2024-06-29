import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class264 extends class111 {

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Z")
    public static boolean field3879 = false;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public int field3883;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public int field3885;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public int field3886;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Ltj;")
    public static class108 field3888;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "Lbr;")
    public static class223 field3884;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Ljava/lang/String;")
    public String field3887;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BILqr;IIIIIIII)Z")
    public static final boolean method1814(byte arg0, int arg1, class41 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3880++;
        int var11 = arg9;
        int var12 = arg10;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        class87.field1132[var13][var14] = 99;
        int var16 = arg10 - var14;
        class399.field5612[var13][var14] = 0;
        byte var17 = 0;
        class287.field4187[var17] = arg9;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class451.field6468[var10001] = arg10;
        int[][] var19 = arg2.field572;
        while (var26 != var18) {
            var11 = class287.field4187[var18];
            var12 = class451.field6468[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg2.field565;
            int var23 = var12 - arg2.field570;
            if (arg4 == -4) {
                if (arg1 == var11 && arg5 == var12) {
                    class88.field1154 = var11;
                    class418.field6003 = var12;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class253.method1763(arg6, 2, arg1, 2, arg3, arg5, var12, (byte) -7, var11)) {
                    class418.field6003 = var12;
                    class88.field1154 = var11;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg2.method270(0, arg8, arg3, arg6, 2, arg1, 2, var12, var11, arg5)) {
                    class88.field1154 = var11;
                    class418.field6003 = var12;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg2.method271(arg8, (byte) 74, var12, arg6, arg5, arg1, var11, 2, arg3)) {
                    class418.field6003 = var12;
                    class88.field1154 = var11;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg2.method269(arg7, arg5, arg4, -3, var12, arg1, var11, 2)) {
                    class418.field6003 = var12;
                    class88.field1154 = var11;
                    return true;
                }
            } else if (arg2.method283(arg4, false, var12, arg7, arg1, 2, arg5, var11)) {
                class88.field1154 = var11;
                class418.field6003 = var12;
                return true;
            }
            int var25 = class399.field5612[var20][var21] + 1;
            if (var20 > 0 && class87.field1132[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class287.field4187[var26] = var11 - 1;
                class451.field6468[var26] = var12;
                class87.field1132[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class399.field5612[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class87.field1132[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class287.field4187[var26] = var11 + 1;
                class451.field6468[var26] = var12;
                class87.field1132[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class399.field5612[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class87.field1132[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class287.field4187[var26] = var11;
                class451.field6468[var26] = var12 - 1;
                class87.field1132[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class399.field5612[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class87.field1132[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class287.field4187[var26] = var11;
                class451.field6468[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class87.field1132[var20][var21 + 1] = 4;
                class399.field5612[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class87.field1132[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class287.field4187[var26] = var11 - 1;
                class451.field6468[var26] = var12 - 1;
                class87.field1132[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class399.field5612[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class87.field1132[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class287.field4187[var26] = var11 + 1;
                class451.field6468[var26] = var12 - 1;
                class87.field1132[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class399.field5612[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class87.field1132[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class287.field4187[var26] = var11 - 1;
                class451.field6468[var26] = var12 + 1;
                class87.field1132[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class399.field5612[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class87.field1132[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class287.field4187[var26] = var11 + 1;
                class451.field6468[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class87.field1132[var20 + 1][var21 + 1] = 12;
                class399.field5612[var20 + 1][var21 + 1] = var25;
            }
        }
        class88.field1154 = var11;
        class418.field6003 = var12;
        if (arg0 < 2) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static final void method1815(int arg0) {
        field3891++;
        if (!class341.field4938) {
            return;
        }
        class231.field3418 = null;
        if (arg0 != 1) {
            field3879 = false;
        }
        class341.field4938 = false;
        class25.field317 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BII)Lso;")
    public static final class276 method1816(byte arg0, int arg1, int arg2) {
        field3881++;
        class276 var3 = (class276) class320.field4687.method1373((long) arg1 | (long) arg2 << 32, 116);
        if (var3 == null) {
            var3 = new class276(arg2, arg1);
            class320.field4687.method1376(var3, var3.field6070, 97);
        }
        if (arg0 > -86) {
            method1817((byte) 36);
        }
        return var3;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method1817(byte arg0) {
        field3888 = null;
        if (arg0 >= 17) {
            field3884 = null;
        }
    }
}
