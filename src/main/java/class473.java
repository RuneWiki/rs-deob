import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public abstract class class473 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lhn;")
    public static class509 field6824 = new class509(76, 7);

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lak;")
    public static class234 field6826 = new class234("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[I")
    public static int[] field6828 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[I")
    public static int[] field6827 = new int[100];

    @OriginalMember(owner = "client!h", name = "g", descriptor = "F")
    public static float field6830 = 0.0F;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 7)
    public static void method2845(int arg0) {
        field6827 = null;
        field6826 = null;
        int var1 = -49 % ((46 - arg0) / 54);
        field6824 = null;
        field6828 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIILpd;IIII)Z", line = 22)
    public static final boolean method2846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class172 arg6, int arg7, int arg8, int arg9, int arg10) {
        field6825++;
        int var11 = arg1;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg1 - var13;
        int var16 = arg4 - var14;
        class237.field3810[var13][var14] = 99;
        class129.field1947[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class53.field661[var17] = arg1;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class349.field5164[var10001] = arg4;
        int[][] var19 = arg6.field2573;
        if (arg2 > -67) {
            field6824 = null;
        }
        while (var26 != var18) {
            var12 = class349.field5164[var18];
            var11 = class53.field661[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - arg6.field2559;
            int var21 = var12 - var16;
            int var22 = var12 - arg6.field2565;
            int var23 = var11 - var15;
            if (arg10 == -4) {
                if (arg0 == var11 && arg9 == var12) {
                    class162.field2406 = var12;
                    class428.field6371 = var11;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class56.method515(var12, 1, arg8, var11, 1, arg3, arg0, 4268, arg9)) {
                    class428.field6371 = var11;
                    class162.field2406 = var12;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg6.method1162(var12, arg3, 1, arg0, arg9, arg8, var11, arg5, 1, (byte) 10)) {
                    class162.field2406 = var12;
                    class428.field6371 = var11;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg6.method1154(var11, arg5, arg3, 1, arg0, (byte) 123, arg9, var12, arg8)) {
                    class428.field6371 = var11;
                    class162.field2406 = var12;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg6.method1156(arg7, var11, arg0, 1, arg10, arg9, -1, var12)) {
                    class428.field6371 = var11;
                    class162.field2406 = var12;
                    return true;
                }
            } else if (arg6.method1160(false, 1, var11, var12, arg7, arg0, arg9, arg10)) {
                class428.field6371 = var11;
                class162.field2406 = var12;
                return true;
            }
            int var25 = class129.field1947[var23][var21] + 1;
            if (var23 > 0 && class237.field3810[var23 - 1][var21] == 0 && (var19[var20 - 1][var22] & 0x42240000) == 0) {
                class53.field661[var26] = var11 - 1;
                class349.field5164[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class237.field3810[var23 - 1][var21] = 2;
                class129.field1947[var23 - 1][var21] = var25;
            }
            if (var23 < 127 && class237.field3810[var23 + 1][var21] == 0 && (var19[var20 + 1][var22] & 0x60240000) == 0) {
                class53.field661[var26] = var11 + 1;
                class349.field5164[var26] = var12;
                class237.field3810[var23 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class129.field1947[var23 + 1][var21] = var25;
            }
            if (var21 > 0 && class237.field3810[var23][var21 - 1] == 0 && (var19[var20][var22 - 1] & 0x40A40000) == 0) {
                class53.field661[var26] = var11;
                class349.field5164[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class237.field3810[var23][var21 - 1] = 1;
                class129.field1947[var23][var21 - 1] = var25;
            }
            if (var21 < 127 && class237.field3810[var23][var21 + 1] == 0 && (var19[var20][var22 + 1] & 0x48240000) == 0) {
                class53.field661[var26] = var11;
                class349.field5164[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class237.field3810[var23][var21 + 1] = 4;
                class129.field1947[var23][var21 + 1] = var25;
            }
            if (var23 > 0 && var21 > 0 && class237.field3810[var23 - 1][var21 - 1] == 0 && (var19[var20 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var22] & 0x42240000) == 0 && (var19[var20][var22 - 1] & 0x40A40000) == 0) {
                class53.field661[var26] = var11 - 1;
                class349.field5164[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class237.field3810[var23 - 1][var21 - 1] = 3;
                class129.field1947[var23 - 1][var21 - 1] = var25;
            }
            if (var23 < 127 && var21 > 0 && class237.field3810[var23 + 1][var21 - 1] == 0 && (var19[var20 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var22] & 0x60240000) == 0 && (var19[var20][var22 - 1] & 0x40A40000) == 0) {
                class53.field661[var26] = var11 + 1;
                class349.field5164[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class237.field3810[var23 + 1][var21 - 1] = 9;
                class129.field1947[var23 + 1][var21 - 1] = var25;
            }
            if (var23 > 0 && var21 < 127 && class237.field3810[var23 - 1][var21 + 1] == 0 && (var19[var20 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var22] & 0x42240000) == 0 && (var19[var20][var22 + 1] & 0x48240000) == 0) {
                class53.field661[var26] = var11 - 1;
                class349.field5164[var26] = var12 + 1;
                class237.field3810[var23 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class129.field1947[var23 - 1][var21 + 1] = var25;
            }
            if (var23 < 127 && var21 < 127 && class237.field3810[var23 + 1][var21 + 1] == 0 && (var19[var20 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var22] & 0x60240000) == 0 && (var19[var20][var22 + 1] & 0x48240000) == 0) {
                class53.field661[var26] = var11 + 1;
                class349.field5164[var26] = var12 + 1;
                class237.field3810[var23 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class129.field1947[var23 + 1][var21 + 1] = var25;
            }
        }
        class428.field6371 = var11;
        class162.field2406 = var12;
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILmk;)Lmk;")
    public abstract class40 method490(int arg0, class40 arg1);
}
