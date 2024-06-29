import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class86 extends class292 {

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field1395 = new String[100];

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field1402 = -1;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Lbm;")
    public static class323 field1397 = new class323(0, 0);

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field1399;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Lqo;")
    public static class127 field1394;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "Lof;")
    public static class421 field1401;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILc;BIIIIII)Z", line = 18)
    public static final boolean method654(int arg0, int arg1, int arg2, class158 arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1398++;
        int var11 = arg8;
        int var12 = arg7;
        byte var13 = 64;
        if (arg4 != 125) {
            return false;
        }
        byte var14 = 64;
        int var15 = arg8 - var13;
        class323.field4657[var13][var14] = 99;
        int var16 = arg7 - var14;
        class415.field6012[var13][var14] = 0;
        byte var17 = 0;
        class26.field390[var17] = arg8;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class253.field3656[var10001] = arg7;
        int[][] var19 = arg3.field2405;
        while (var26 != var18) {
            var11 = class26.field390[var18];
            var12 = class253.field3656[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var11 - arg3.field2424;
            int var23 = var12 - arg3.field2411;
            if (arg10 == -4) {
                if (arg0 == var11 && arg5 == var12) {
                    class223.field3312 = var12;
                    class218.field3224 = var11;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class372.method2372(arg0, arg5, arg6, 2, -7247, var12, arg9, 2, var11)) {
                    class223.field3312 = var12;
                    class218.field3224 = var11;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg3.method1244(123, var11, arg9, var12, 2, arg6, arg2, 2, arg5, arg0)) {
                    class223.field3312 = var12;
                    class218.field3224 = var11;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg3.method1238(var11, (byte) -19, arg0, arg2, arg9, 2, arg6, var12, arg5)) {
                    class223.field3312 = var12;
                    class218.field3224 = var11;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg3.method1242(var11, arg5, var12, 2, (byte) 7, arg1, arg0, arg10)) {
                    class223.field3312 = var12;
                    class218.field3224 = var11;
                    return true;
                }
            } else if (arg3.method1251(arg5, var12, 2, arg0, 2, arg10, var11, arg1)) {
                class218.field3224 = var11;
                class223.field3312 = var12;
                return true;
            }
            int var25 = class415.field6012[var21][var20] + 1;
            if (var21 > 0 && class323.field4657[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class26.field390[var26] = var11 - 1;
                class253.field3656[var26] = var12;
                class323.field4657[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class415.field6012[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class323.field4657[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class26.field390[var26] = var11 + 1;
                class253.field3656[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class323.field4657[var21 + 1][var20] = 8;
                class415.field6012[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class323.field4657[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class26.field390[var26] = var11;
                class253.field3656[var26] = var12 - 1;
                class323.field4657[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class415.field6012[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class323.field4657[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class26.field390[var26] = var11;
                class253.field3656[var26] = var12 + 1;
                class323.field4657[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class415.field6012[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class323.field4657[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class26.field390[var26] = var11 - 1;
                class253.field3656[var26] = var12 - 1;
                class323.field4657[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class415.field6012[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class323.field4657[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class26.field390[var26] = var11 + 1;
                class253.field3656[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class323.field4657[var21 + 1][var20 - 1] = 9;
                class415.field6012[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class323.field4657[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class26.field390[var26] = var11 - 1;
                class253.field3656[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class323.field4657[var21 - 1][var20 + 1] = 6;
                class415.field6012[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class323.field4657[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class26.field390[var26] = var11 + 1;
                class253.field3656[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class323.field4657[var21 + 1][var20 + 1] = 12;
                class415.field6012[var21 + 1][var20 + 1] = var25;
            }
        }
        class223.field3312 = var12;
        class218.field3224 = var11;
        return false;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 374)
    public static final void method655(int arg0) {
        if (arg0 > -33) {
            method654(-79, 87, 108, (class158) null, (byte) 2, 52, -8, -33, -42, -18, -62);
        }
        field1400++;
        class41.field628.method106((byte) -103);
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V", line = 386)
    public static void method656(int arg0) {
        field1394 = null;
        if (arg0 >= -15) {
            method654(123, -118, 23, (class158) null, (byte) 10, 52, -35, 55, 9, 88, 71);
        }
        field1397 = null;
        field1395 = null;
        field1401 = null;
    }
}
