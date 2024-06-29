import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "Ldk;")
    public static class326 field272 = new class326("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!an", name = "c", descriptor = "Lus;")
    public static class1 field273 = new class1(57, -1);

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "Ljava/lang/String;")
    public static String field274;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public static void method136(int arg0) {
        field274 = null;
        field272 = null;
        field273 = null;
        int var1 = -113 / ((28 - arg0) / 56);
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIILee;IIIIII)Z")
    public static final boolean method137(int arg0, int arg1, int arg2, int arg3, class441 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field271++;
        int var11 = arg5;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        class168.field2448[var13][var14] = 99;
        if (arg3 != 4095) {
            method137(-98, -85, 59, -23, (class441) null, -116, -61, -92, -108, 81, 88);
        }
        int var16 = arg9 - var14;
        class258.field3784[var13][var14] = 0;
        byte var17 = 0;
        class368.field5326[var17] = arg5;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class89.field1098[var10001] = arg9;
        int[][] var19 = arg4.field6121;
        while (var26 != var18) {
            var12 = class89.field1098[var18];
            var11 = class368.field5326[var18];
            int var20 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - arg4.field6099;
            int var23 = var12 - arg4.field6101;
            if (arg10 == -4) {
                if (arg1 == var11 && arg6 == var12) {
                    class245.field3646 = var11;
                    class411.field5763 = var12;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class172.method1061(arg8, arg7, 2, arg1, var11, arg6, var12, 2, -85)) {
                    class245.field3646 = var11;
                    class411.field5763 = var12;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg4.method2583(arg6, arg1, arg7, 2, var11, arg8, 2883968, var12, 2, arg2)) {
                    class411.field5763 = var12;
                    class245.field3646 = var11;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg4.method2599(var11, arg6, 2, true, var12, arg8, arg7, arg1, arg2)) {
                    class411.field5763 = var12;
                    class245.field3646 = var11;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg4.method2591(arg0, var12, arg6, var11, 3981, arg1, 2, arg10)) {
                    class245.field3646 = var11;
                    class411.field5763 = var12;
                    return true;
                }
            } else if (arg4.method2586(arg10, var11, var12, arg0, 2, -19527, arg1, arg6)) {
                class245.field3646 = var11;
                class411.field5763 = var12;
                return true;
            }
            int var25 = class258.field3784[var20][var21] + 1;
            if (var20 > 0 && class168.field2448[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class368.field5326[var26] = var11 - 1;
                class89.field1098[var26] = var12;
                class168.field2448[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class258.field3784[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class168.field2448[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class368.field5326[var26] = var11 + 1;
                class89.field1098[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class168.field2448[var20 + 1][var21] = 8;
                class258.field3784[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class168.field2448[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class368.field5326[var26] = var11;
                class89.field1098[var26] = var12 - 1;
                class168.field2448[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class258.field3784[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class168.field2448[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class368.field5326[var26] = var11;
                class89.field1098[var26] = var12 + 1;
                class168.field2448[var20][var21 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class258.field3784[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class168.field2448[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class368.field5326[var26] = var11 - 1;
                class89.field1098[var26] = var12 - 1;
                class168.field2448[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class258.field3784[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class168.field2448[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class368.field5326[var26] = var11 + 1;
                class89.field1098[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class168.field2448[var20 + 1][var21 - 1] = 9;
                class258.field3784[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class168.field2448[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class368.field5326[var26] = var11 - 1;
                class89.field1098[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class168.field2448[var20 - 1][var21 + 1] = 6;
                class258.field3784[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class168.field2448[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class368.field5326[var26] = var11 + 1;
                class89.field1098[var26] = var12 + 1;
                class168.field2448[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class258.field3784[var20 + 1][var21 + 1] = var25;
            }
        }
        class245.field3646 = var11;
        class411.field5763 = var12;
        return false;
    }
}
