import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class365 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lmba;")
    public static class646 field5189 = new class646();

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 6)
    public static void method2309(int arg0) {
        field5189 = null;
        int var1 = -112 / ((arg0 - 55) / 63);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILnfa;IIIIIIIII)Z", line = 15)
    public static final boolean method2310(int arg0, class228 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5190++;
        int var11 = arg2;
        int var12 = arg3;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg2 - var13;
        int var16 = arg3 - var14;
        class202.field2678[var13][var14] = 99;
        class229.field3070[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class748.field10296[var17] = arg2;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class633.field8514[var10001] = arg3;
        int[][] var19 = arg1.field3049;
        if (arg7 != -1) {
            return true;
        }
        while (var26 != var18) {
            var11 = class748.field10296[var18];
            var12 = class633.field8514[var18];
            int var20 = var11 - var15;
            int var21 = var12 - arg1.field3052;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var12 - var16;
            int var23 = var11 - arg1.field3063;
            if (arg6 == -4) {
                if (arg0 == var11 && arg10 == var12) {
                    class633.field8520 = var12;
                    class750.field10323 = var11;
                    return true;
                }
            } else if (arg6 == -3) {
                if (class80.method581(arg4, var11, arg10, arg0, 1, arg8, 1, 32660, var12)) {
                    class633.field8520 = var12;
                    class750.field10323 = var11;
                    return true;
                }
            } else if (arg6 == -2) {
                if (arg1.method1352(arg4, 1, var12, 1, arg9, arg10, arg8, -25945, arg0, var11)) {
                    class750.field10323 = var11;
                    class633.field8520 = var12;
                    return true;
                }
            } else if (arg6 == -1) {
                if (arg1.method1346(-4794, arg4, arg9, var11, 1, var12, arg0, arg8, arg10)) {
                    class750.field10323 = var11;
                    class633.field8520 = var12;
                    return true;
                }
            } else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
                if (arg1.method1345(arg10, arg6, arg5, 2883842, arg0, var12, 1, var11)) {
                    class750.field10323 = var11;
                    class633.field8520 = var12;
                    return true;
                }
            } else if (arg1.method1353(arg0, 1, arg10, var11, arg6, var12, (byte) -127, arg5)) {
                class633.field8520 = var12;
                class750.field10323 = var11;
                return true;
            }
            int var25 = class229.field3070[var20][var22] + 1;
            if (var20 > 0 && class202.field2678[var20 - 1][var22] == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0) {
                class748.field10296[var26] = var11 - 1;
                class633.field8514[var26] = var12;
                class202.field2678[var20 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class229.field3070[var20 - 1][var22] = var25;
            }
            if (var20 < 127 && class202.field2678[var20 + 1][var22] == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0) {
                class748.field10296[var26] = var11 + 1;
                class633.field8514[var26] = var12;
                class202.field2678[var20 + 1][var22] = 8;
                var26 = var26 + 1 & 0xFFF;
                class229.field3070[var20 + 1][var22] = var25;
            }
            if (var22 > 0 && class202.field2678[var20][var22 - 1] == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class748.field10296[var26] = var11;
                class633.field8514[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class202.field2678[var20][var22 - 1] = 1;
                class229.field3070[var20][var22 - 1] = var25;
            }
            if (var22 < 127 && class202.field2678[var20][var22 + 1] == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class748.field10296[var26] = var11;
                class633.field8514[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class202.field2678[var20][var22 + 1] = 4;
                class229.field3070[var20][var22 + 1] = var25;
            }
            if (var20 > 0 && var22 > 0 && class202.field2678[var20 - 1][var22 - 1] == 0 && (var19[var23 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class748.field10296[var26] = var11 - 1;
                class633.field8514[var26] = var12 - 1;
                class202.field2678[var20 - 1][var22 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class229.field3070[var20 - 1][var22 - 1] = var25;
            }
            if (var20 < 127 && var22 > 0 && class202.field2678[var20 + 1][var22 - 1] == 0 && (var19[var23 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 - 1] & 0x40A40000) == 0) {
                class748.field10296[var26] = var11 + 1;
                class633.field8514[var26] = var12 - 1;
                class202.field2678[var20 + 1][var22 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class229.field3070[var20 + 1][var22 - 1] = var25;
            }
            if (var20 > 0 && var22 < 127 && class202.field2678[var20 - 1][var22 + 1] == 0 && (var19[var23 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var21] & 0x42240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class748.field10296[var26] = var11 - 1;
                class633.field8514[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class202.field2678[var20 - 1][var22 + 1] = 6;
                class229.field3070[var20 - 1][var22 + 1] = var25;
            }
            if (var20 < 127 && var22 < 127 && class202.field2678[var20 + 1][var22 + 1] == 0 && (var19[var23 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var21] & 0x60240000) == 0 && (var19[var23][var21 + 1] & 0x48240000) == 0) {
                class748.field10296[var26] = var11 + 1;
                class633.field8514[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class202.field2678[var20 + 1][var22 + 1] = 12;
                class229.field3070[var20 + 1][var22 + 1] = var25;
            }
        }
        class750.field10323 = var11;
        class633.field8520 = var12;
        return false;
    }
}
