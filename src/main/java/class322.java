import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class322 {

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field5057 = new String[100];

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "Lfr;")
    public static class231 field5060 = new class231(260);

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Lnk;")
    public static class326 field5061 = new class326(28, 2);

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Lo;")
    public static class138 field5058;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V", line = 4)
    public static void method2034(byte arg0) {
        field5057 = null;
        field5060 = null;
        if (arg0 != -51) {
            method2034((byte) -32);
        }
        field5061 = null;
        field5058 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIILir;IIII)Z", line = 20)
    public static final boolean method2035(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class251 arg6, int arg7, int arg8, int arg9, int arg10) {
        field5059++;
        int var11 = arg4;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg4 - var13;
        class330.field5195[var13][var14] = 99;
        int var16 = arg3 - var14;
        class71.field1218[var13][var14] = 0;
        byte var17 = 0;
        if (arg8 != 4735) {
            return false;
        }
        class194.field3041[var17] = arg4;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class82.field1443[var10001] = arg3;
        int[][] var19 = arg6.field4288;
        while (var26 != var18) {
            var12 = class82.field1443[var18];
            var11 = class194.field3041[var18];
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg6.field4274;
            int var23 = var12 - arg6.field4271;
            if (arg0 == -4) {
                if (arg2 == var11 && arg5 == var12) {
                    class452.field6743 = var12;
                    class347.field5458 = var11;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class239.method1640(2, arg5, var11, var12, arg1, arg2, false, arg9, 2)) {
                    class347.field5458 = var11;
                    class452.field6743 = var12;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg6.method1715(2, arg9, arg5, var11, var12, 2, -80, arg2, arg1, arg7)) {
                    class452.field6743 = var12;
                    class347.field5458 = var11;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg6.method1701(var12, arg9, arg5, var11, 2, arg7, arg2, arg1, false)) {
                    class452.field6743 = var12;
                    class347.field5458 = var11;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg6.method1703(arg2, arg10, arg0, arg5, -112, var11, var12, 2)) {
                    class452.field6743 = var12;
                    class347.field5458 = var11;
                    return true;
                }
            } else if (arg6.method1698(var12, 85, arg5, arg10, 2, var11, arg2, arg0)) {
                class452.field6743 = var12;
                class347.field5458 = var11;
                return true;
            }
            int var25 = class71.field1218[var20][var21] + 1;
            if (var20 > 0 && class330.field5195[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class194.field3041[var26] = var11 - 1;
                class82.field1443[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class330.field5195[var20 - 1][var21] = 2;
                class71.field1218[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class330.field5195[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class194.field3041[var26] = var11 + 1;
                class82.field1443[var26] = var12;
                class330.field5195[var20 + 1][var21] = 8;
                var26 = var26 + 1 & 0xFFF;
                class71.field1218[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class330.field5195[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class194.field3041[var26] = var11;
                class82.field1443[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class330.field5195[var20][var21 - 1] = 1;
                class71.field1218[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class330.field5195[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class194.field3041[var26] = var11;
                class82.field1443[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class330.field5195[var20][var21 + 1] = 4;
                class71.field1218[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class330.field5195[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class194.field3041[var26] = var11 - 1;
                class82.field1443[var26] = var12 - 1;
                class330.field5195[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class71.field1218[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class330.field5195[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class194.field3041[var26] = var11 + 1;
                class82.field1443[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class330.field5195[var20 + 1][var21 - 1] = 9;
                class71.field1218[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class330.field5195[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class194.field3041[var26] = var11 - 1;
                class82.field1443[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class330.field5195[var20 - 1][var21 + 1] = 6;
                class71.field1218[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class330.field5195[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class194.field3041[var26] = var11 + 1;
                class82.field1443[var26] = var12 + 1;
                class330.field5195[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class71.field1218[var20 + 1][var21 + 1] = var25;
            }
        }
        class347.field5458 = var11;
        class452.field6743 = var12;
        return false;
    }
}
