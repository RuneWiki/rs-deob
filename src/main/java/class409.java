import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class409 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Lss;")
    public static class140 field5797 = new class140(9, 15);

    @OriginalMember(owner = "client!an", name = "d", descriptor = "[[B")
    public static byte[][] field5799 = new byte[50][];

    @OriginalMember(owner = "client!an", name = "c", descriptor = "Lss;")
    public static class140 field5798 = new class140(5, 2);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field5796;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)V")
    public static void method2428(byte arg0) {
        field5798 = null;
        field5799 = null;
        if (arg0 <= 38) {
            field5798 = null;
        }
        field5797 = null;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIIILpe;IIIII)Z")
    public static final boolean method2429(int arg0, int arg1, int arg2, int arg3, int arg4, class424 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5796++;
        int var11 = arg2;
        int var12 = arg8;
        byte var13 = 64;
        if (arg3 != -1) {
            field5799 = null;
        }
        byte var14 = 64;
        int var15 = arg2 - var13;
        class223.field3095[var13][var14] = 99;
        int var16 = arg8 - var14;
        class172.field2071[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class334.field4807[var17] = arg2;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class413.field5887[var10001] = arg8;
        int[][] var19 = arg5.field6118;
        while (var26 != var18) {
            var11 = class334.field4807[var18];
            var12 = class413.field5887[var18];
            int var20 = var12 - var16;
            int var21 = var11 - arg5.field6116;
            int var22 = var11 - var15;
            int var23 = var12 - arg5.field6121;
            var18 = var18 + 1 & 0xFFF;
            if (arg1 == -4) {
                if (arg9 == var11 && arg6 == var12) {
                    class312.field4564 = var11;
                    class356.field5113 = var12;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class390.method2348(arg10, arg9, var11, arg6, var12, arg4, 1, 76, 1)) {
                    class312.field4564 = var11;
                    class356.field5113 = var12;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg5.method2529(-107, arg4, 1, arg7, arg6, var12, arg10, var11, arg9, 1)) {
                    class356.field5113 = var12;
                    class312.field4564 = var11;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg5.method2530(var11, arg6, 1, var12, arg7, arg9, arg4, 65, arg10)) {
                    class312.field4564 = var11;
                    class356.field5113 = var12;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg5.method2526(arg0, var12, arg6, arg1, false, arg9, 1, var11)) {
                    class312.field4564 = var11;
                    class356.field5113 = var12;
                    return true;
                }
            } else if (arg5.method2527(var11, arg6, arg0, arg9, (byte) -120, var12, 1, arg1)) {
                class312.field4564 = var11;
                class356.field5113 = var12;
                return true;
            }
            int var25 = class172.field2071[var22][var20] + 1;
            if (var22 > 0 && class223.field3095[var22 - 1][var20] == 0 && (var19[var21 - 1][var23] & 0x42240000) == 0) {
                class334.field4807[var26] = var11 - 1;
                class413.field5887[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class223.field3095[var22 - 1][var20] = 2;
                class172.field2071[var22 - 1][var20] = var25;
            }
            if (var22 < 127 && class223.field3095[var22 + 1][var20] == 0 && (var19[var21 + 1][var23] & 0x60240000) == 0) {
                class334.field4807[var26] = var11 + 1;
                class413.field5887[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class223.field3095[var22 + 1][var20] = 8;
                class172.field2071[var22 + 1][var20] = var25;
            }
            if (var20 > 0 && class223.field3095[var22][var20 - 1] == 0 && (var19[var21][var23 - 1] & 0x40A40000) == 0) {
                class334.field4807[var26] = var11;
                class413.field5887[var26] = var12 - 1;
                class223.field3095[var22][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class172.field2071[var22][var20 - 1] = var25;
            }
            if (var20 < 127 && class223.field3095[var22][var20 + 1] == 0 && (var19[var21][var23 + 1] & 0x48240000) == 0) {
                class334.field4807[var26] = var11;
                class413.field5887[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class223.field3095[var22][var20 + 1] = 4;
                class172.field2071[var22][var20 + 1] = var25;
            }
            if (var22 > 0 && var20 > 0 && class223.field3095[var22 - 1][var20 - 1] == 0 && (var19[var21 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var23] & 0x42240000) == 0 && (var19[var21][var23 - 1] & 0x40A40000) == 0) {
                class334.field4807[var26] = var11 - 1;
                class413.field5887[var26] = var12 - 1;
                class223.field3095[var22 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class172.field2071[var22 - 1][var20 - 1] = var25;
            }
            if (var22 < 127 && var20 > 0 && class223.field3095[var22 + 1][var20 - 1] == 0 && (var19[var21 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var23] & 0x60240000) == 0 && (var19[var21][var23 - 1] & 0x40A40000) == 0) {
                class334.field4807[var26] = var11 + 1;
                class413.field5887[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class223.field3095[var22 + 1][var20 - 1] = 9;
                class172.field2071[var22 + 1][var20 - 1] = var25;
            }
            if (var22 > 0 && var20 < 127 && class223.field3095[var22 - 1][var20 + 1] == 0 && (var19[var21 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var23] & 0x42240000) == 0 && (var19[var21][var23 + 1] & 0x48240000) == 0) {
                class334.field4807[var26] = var11 - 1;
                class413.field5887[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class223.field3095[var22 - 1][var20 + 1] = 6;
                class172.field2071[var22 - 1][var20 + 1] = var25;
            }
            if (var22 < 127 && var20 < 127 && class223.field3095[var22 + 1][var20 + 1] == 0 && (var19[var21 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var23] & 0x60240000) == 0 && (var19[var21][var23 + 1] & 0x48240000) == 0) {
                class334.field4807[var26] = var11 + 1;
                class413.field5887[var26] = var12 + 1;
                class223.field3095[var22 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class172.field2071[var22 + 1][var20 + 1] = var25;
            }
        }
        class312.field4564 = var11;
        class356.field5113 = var12;
        return false;
    }
}
