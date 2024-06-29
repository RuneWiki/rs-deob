import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class272 {

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "Lbv;")
    public static class567 field3990 = new class567("Loaded SW3D", "SW3D geladen", "SW3D chargé", "SW3D carregado");

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIILaea;BIIII)Z", line = 6)
    public static final boolean method1762(int arg0, int arg1, int arg2, int arg3, int arg4, class39 arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        field3989++;
        int var11 = arg4;
        if (arg6 < 66) {
            field3990 = null;
        }
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg4 - var13;
        class552.field7817[var13][var14] = 99;
        int var16 = arg3 - var14;
        class561.field8015[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class374.field5503[var17] = arg4;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class446.field6515[var10001] = arg3;
        int[][] var19 = arg5.field526;
        while (var26 != var18) {
            var11 = class374.field5503[var18];
            var12 = class446.field6515[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var11 - arg5.field531;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var12 - arg5.field530;
            if (arg7 == -4) {
                if (arg10 == var11 && arg9 == var12) {
                    class47.field667 = var12;
                    class492.field6908 = var11;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class181.method1222(var11, 12, arg1, arg8, 1, 1, arg10, var12, arg9)) {
                    class492.field6908 = var11;
                    class47.field667 = var12;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg5.method330(arg0, arg10, arg1, 22700, arg9, arg8, 1, 1, var11, var12)) {
                    class492.field6908 = var11;
                    class47.field667 = var12;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg5.method338(var12, arg0, var11, arg8, -9497, arg1, 1, arg9, arg10)) {
                    class492.field6908 = var11;
                    class47.field667 = var12;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg5.method342(var11, arg9, var12, -21730, arg10, 1, arg2, arg7)) {
                    class47.field667 = var12;
                    class492.field6908 = var11;
                    return true;
                }
            } else if (arg5.method337(arg2, 32, var12, arg7, arg10, var11, 1, arg9)) {
                class47.field667 = var12;
                class492.field6908 = var11;
                return true;
            }
            int var25 = class561.field8015[var21][var20] + 1;
            if (var21 > 0 && class552.field7817[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0) {
                class374.field5503[var26] = var11 - 1;
                class446.field6515[var26] = var12;
                class552.field7817[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class561.field8015[var21 - 1][var20] = var25;
            }
            if (var21 < 127 && class552.field7817[var21 + 1][var20] == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0) {
                class374.field5503[var26] = var11 + 1;
                class446.field6515[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class552.field7817[var21 + 1][var20] = 8;
                class561.field8015[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class552.field7817[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class374.field5503[var26] = var11;
                class446.field6515[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class552.field7817[var21][var20 - 1] = 1;
                class561.field8015[var21][var20 - 1] = var25;
            }
            if (var20 < 127 && class552.field7817[var21][var20 + 1] == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class374.field5503[var26] = var11;
                class446.field6515[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class552.field7817[var21][var20 + 1] = 4;
                class561.field8015[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class552.field7817[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class374.field5503[var26] = var11 - 1;
                class446.field6515[var26] = var12 - 1;
                class552.field7817[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class561.field8015[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 127 && var20 > 0 && class552.field7817[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class374.field5503[var26] = var11 + 1;
                class446.field6515[var26] = var12 - 1;
                class552.field7817[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class561.field8015[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 127 && class552.field7817[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class374.field5503[var26] = var11 - 1;
                class446.field6515[var26] = var12 + 1;
                class552.field7817[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class561.field8015[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 127 && var20 < 127 && class552.field7817[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class374.field5503[var26] = var11 + 1;
                class446.field6515[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class552.field7817[var21 + 1][var20 + 1] = 12;
                class561.field8015[var21 + 1][var20 + 1] = var25;
            }
        }
        class47.field667 = var12;
        class492.field6908 = var11;
        return false;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 259)
    public static void method1763(int arg0) {
        if (arg0 <= 97) {
            field3990 = null;
        }
        field3990 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)V", line = 269)
    public static final void method1764(int arg0, int arg1) {
        int var2 = 82 % ((arg1 - 16) / 59);
        class378.field5562 = -1;
        field3987++;
        class119.field1915 = arg0;
        class378.field5562 = -1;
        class173.method1192(588394986);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BII)Z", line = 282)
    public static final boolean method1765(byte arg0, int arg1, int arg2) {
        if (arg0 != -17) {
            field3990 = null;
        }
        field3988++;
        return (arg1 & 0x21) != 0;
    }
}
