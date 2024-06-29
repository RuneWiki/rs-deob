import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class157 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Lch;")
    public static class151 field2234 = new class151("Continue", "Weiter", "Continuer", "Continuar");

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "[[I")
    public static int[][] field2238 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2236++;
        int var7 = class67.method630(0, arg4, class151.field2091, class444.field6338);
        int var8 = class67.method630(0, arg1, class151.field2091, class444.field6338);
        int var9 = 9 / ((arg0 + 21) / 38);
        int var10 = class67.method630(0, arg6, class103.field1457, class295.field4153);
        int var11 = class67.method630(0, arg3, class103.field1457, class295.field4153);
        int var12 = class67.method630(0, arg4 + arg2, class151.field2091, class444.field6338);
        int var13 = class67.method630(0, arg1 - arg2, class151.field2091, class444.field6338);
        for (int var14 = var7; var14 < var12; var14++) {
            class61.method558(var11, -10647, class373.field5141[var14], var10, arg5);
        }
        for (int var15 = var8; var15 > var13; var15--) {
            class61.method558(var11, -10647, class373.field5141[var15], var10, arg5);
        }
        int var16 = class67.method630(0, arg2 + arg6, class103.field1457, class295.field4153);
        int var17 = class67.method630(0, arg3 - arg2, class103.field1457, class295.field4153);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class373.field5141[var18];
            class61.method558(var16, -10647, var19, var10, arg5);
            class61.method558(var11, -10647, var19, var17, arg5);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZZ)V")
    public static final void method1126(int arg0, boolean arg1, boolean arg2) {
        field2235++;
        int var3 = -15 / ((arg0 + 6) / 61);
        if (arg2) {
            class86.field1216++;
            class271.method1828((byte) 124);
        }
        if (arg1) {
            class227.field3263++;
            class212.method1439(-16086);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
    public static void method1127(boolean arg0) {
        if (arg0) {
            method1126(17, true, true);
        }
        field2238 = null;
        field2234 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILpf;IIIIIIIII)Z")
    public static final boolean method1128(int arg0, class18 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2237++;
        int var11 = arg9;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg9 - var13;
        class313.field4424[var13][var14] = 99;
        int var16 = arg5 - var14;
        class432.field6113[var13][var14] = 0;
        if (arg0 != 1) {
            method1127(false);
        }
        byte var17 = 0;
        int var18 = 0;
        class270.field3936[var17] = arg9;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class35.field374[var10001] = arg5;
        int[][] var19 = arg1.field176;
        while (var26 != var18) {
            var11 = class270.field3936[var18];
            var12 = class35.field374[var18];
            int var20 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var12 - var16;
            int var22 = var11 - arg1.field182;
            int var23 = var12 - arg1.field187;
            if (arg4 == -4) {
                if (arg6 == var11 && arg2 == var12) {
                    class437.field6219 = var11;
                    class341.field4716 = var12;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class312.method1987(2, 2, arg3, arg6, (byte) -108, arg10, var12, arg2, var11)) {
                    class437.field6219 = var11;
                    class341.field4716 = var12;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg1.method114(arg10, arg2, 2, (byte) -37, 2, arg6, arg8, arg3, var11, var12)) {
                    class341.field4716 = var12;
                    class437.field6219 = var11;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg1.method127(arg8, arg6, arg2, arg3, var11, (byte) 11, var12, 2, arg10)) {
                    class341.field4716 = var12;
                    class437.field6219 = var11;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg1.method121(arg6, 2, var12, arg4, (byte) -113, var11, arg7, arg2)) {
                    class341.field4716 = var12;
                    class437.field6219 = var11;
                    return true;
                }
            } else if (arg1.method129(var11, 2, arg6, arg2, arg7, arg0 ^ 0xFFFFFFFE, var12, arg4)) {
                class437.field6219 = var11;
                class341.field4716 = var12;
                return true;
            }
            int var25 = class432.field6113[var20][var21] + 1;
            if (var20 > 0 && class313.field4424[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class270.field3936[var26] = var11 - 1;
                class35.field374[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class313.field4424[var20 - 1][var21] = 2;
                class432.field6113[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class313.field4424[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class270.field3936[var26] = var11 + 1;
                class35.field374[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class313.field4424[var20 + 1][var21] = 8;
                class432.field6113[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class313.field4424[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class270.field3936[var26] = var11;
                class35.field374[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class313.field4424[var20][var21 - 1] = 1;
                class432.field6113[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class313.field4424[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class270.field3936[var26] = var11;
                class35.field374[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class313.field4424[var20][var21 + 1] = 4;
                class432.field6113[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class313.field4424[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class270.field3936[var26] = var11 - 1;
                class35.field374[var26] = var12 - 1;
                class313.field4424[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class432.field6113[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class313.field4424[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class270.field3936[var26] = var11 + 1;
                class35.field374[var26] = var12 - 1;
                class313.field4424[var20 + 1][var21 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class432.field6113[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class313.field4424[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class270.field3936[var26] = var11 - 1;
                class35.field374[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class313.field4424[var20 - 1][var21 + 1] = 6;
                class432.field6113[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class313.field4424[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class270.field3936[var26] = var11 + 1;
                class35.field374[var26] = var12 + 1;
                class313.field4424[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class432.field6113[var20 + 1][var21 + 1] = var25;
            }
        }
        class437.field6219 = var11;
        class341.field4716 = var12;
        return false;
    }
}
