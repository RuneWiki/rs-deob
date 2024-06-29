import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class222 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field3166 = 2;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "Lwj;")
    public static class270 field3165 = new class270(13, 7);

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "Z")
    public static boolean field3169 = true;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lan;")
    public static class20 field3168;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIILeq;IIIII)Z")
    public static final boolean method1379(int arg0, int arg1, int arg2, int arg3, int arg4, class141 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3170++;
        if (arg4 != 23469) {
            field3168 = null;
        }
        int var11 = arg0;
        int var12 = arg1;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg0 - var13;
        class367.field5382[var13][var14] = 99;
        int var16 = arg1 - var14;
        class250.field3452[var13][var14] = 0;
        byte var17 = 0;
        class223.field3172[var17] = arg0;
        int var18 = 0;
        int var26 = var17 + 1;
        class446.field6579[var17] = arg1;
        int[][] var19 = arg5.field2013;
        while (var26 != var18) {
            var11 = class223.field3172[var18];
            var12 = class446.field6579[var18];
            int var20 = var11 - arg5.field1992;
            int var21 = var12 - arg5.field1994;
            int var22 = var12 - var16;
            int var23 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            if (arg8 == -4) {
                if (arg9 == var11 && arg2 == var12) {
                    class64.field871 = var12;
                    class489.field7139 = var11;
                    return true;
                }
            } else if (arg8 == -3) {
                if (class346.method2049(1, arg7, arg10, var12, arg2, var11, arg9, -4, 1)) {
                    class489.field7139 = var11;
                    class64.field871 = var12;
                    return true;
                }
            } else if (arg8 == -2) {
                if (arg5.method953(arg7, var12, arg2, 1, arg10, arg3, false, 1, var11, arg9)) {
                    class64.field871 = var12;
                    class489.field7139 = var11;
                    return true;
                }
            } else if (arg8 == -1) {
                if (arg5.method951(arg3, arg2, var11, true, arg9, var12, 1, arg10, arg7)) {
                    class64.field871 = var12;
                    class489.field7139 = var11;
                    return true;
                }
            } else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
                if (arg5.method943(-1, var11, arg9, arg6, arg2, 1, var12, arg8)) {
                    class489.field7139 = var11;
                    class64.field871 = var12;
                    return true;
                }
            } else if (arg5.method944(arg9, arg6, 1, -1, var11, arg2, var12, arg8)) {
                class64.field871 = var12;
                class489.field7139 = var11;
                return true;
            }
            int var25 = class250.field3452[var23][var22] + 1;
            if (var23 > 0 && class367.field5382[var23 - 1][var22] == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0) {
                class223.field3172[var26] = var11 - 1;
                class446.field6579[var26] = var12;
                class367.field5382[var23 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class250.field3452[var23 - 1][var22] = var25;
            }
            if (var23 < 127 && class367.field5382[var23 + 1][var22] == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0) {
                class223.field3172[var26] = var11 + 1;
                class446.field6579[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class367.field5382[var23 + 1][var22] = 8;
                class250.field3452[var23 + 1][var22] = var25;
            }
            if (var22 > 0 && class367.field5382[var23][var22 - 1] == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class223.field3172[var26] = var11;
                class446.field6579[var26] = var12 - 1;
                class367.field5382[var23][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class250.field3452[var23][var22 - 1] = var25;
            }
            if (var22 < 127 && class367.field5382[var23][var22 + 1] == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class223.field3172[var26] = var11;
                class446.field6579[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class367.field5382[var23][var22 + 1] = 4;
                class250.field3452[var23][var22 + 1] = var25;
            }
            if (var23 > 0 && var22 > 0 && class367.field5382[var23 - 1][var22 - 1] == 0 && (var19[var20 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class223.field3172[var26] = var11 - 1;
                class446.field6579[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class367.field5382[var23 - 1][var22 - 1] = 3;
                class250.field3452[var23 - 1][var22 - 1] = var25;
            }
            if (var23 < 127 && var22 > 0 && class367.field5382[var23 + 1][var22 - 1] == 0 && (var19[var20 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class223.field3172[var26] = var11 + 1;
                class446.field6579[var26] = var12 - 1;
                class367.field5382[var23 + 1][var22 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class250.field3452[var23 + 1][var22 - 1] = var25;
            }
            if (var23 > 0 && var22 < 127 && class367.field5382[var23 - 1][var22 + 1] == 0 && (var19[var20 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class223.field3172[var26] = var11 - 1;
                class446.field6579[var26] = var12 + 1;
                class367.field5382[var23 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class250.field3452[var23 - 1][var22 + 1] = var25;
            }
            if (var23 < 127 && var22 < 127 && class367.field5382[var23 + 1][var22 + 1] == 0 && (var19[var20 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class223.field3172[var26] = var11 + 1;
                class446.field6579[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class367.field5382[var23 + 1][var22 + 1] = 12;
                class250.field3452[var23 + 1][var22 + 1] = var25;
            }
        }
        class489.field7139 = var11;
        class64.field871 = var12;
        return false;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lce;I)Lce;")
    public abstract class202 method1380(class202 arg0, int arg1);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method1381(byte arg0) {
        field3165 = null;
        if (arg0 > 121) {
            field3168 = null;
        }
    }
}
