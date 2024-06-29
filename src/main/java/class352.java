import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class352 extends class320 {

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "[[B")
    public static byte[][] field5393;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    public int field5390;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    public int field5391;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "Lbu;")
    public static class17 field5394;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field5392;

    static {
        new class342("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        new class342("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field5393 = new byte[1000][];
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z[I[Ljava/lang/Object;)V", line = 6)
    public static final void method2238(boolean arg0, int[] arg1, Object[] arg2) {
        field5388++;
        class438.method2618(arg1.length - 1, arg2, arg1, 0, (byte) 52);
        if (arg0) {
            field5393 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 17)
    public static void method2239(byte arg0) {
        field5392 = null;
        field5394 = null;
        field5393 = null;
        if (arg0 < 107) {
            method2238(true, null, null);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lbr;ZIIIIIIIII)Z", line = 29)
    public static final boolean method2240(class268 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5389++;
        int var11 = arg4;
        int var12 = arg3;
        byte var13 = 64;
        if (arg1) {
            return false;
        }
        byte var14 = 64;
        int var15 = arg4 - var13;
        class129.field2058[var13][var14] = 99;
        int var16 = arg3 - var14;
        class357.field5436[var13][var14] = 0;
        byte var17 = 0;
        class353.field5403[var17] = arg4;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class49.field897[var10001] = arg3;
        int[][] var19 = arg0.field3853;
        while (var26 != var18) {
            var11 = class353.field5403[var18];
            var12 = class49.field897[var18];
            int var20 = var11 - arg0.field3862;
            int var21 = var11 - var15;
            int var22 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var12 - arg0.field3869;
            if (arg7 == -4) {
                if (arg8 == var11 && arg2 == var12) {
                    class400.field6022 = var11;
                    class11.field165 = var12;
                    return true;
                }
            } else if (arg7 == -3) {
                if (class283.method1806(1, 1, 1, var11, arg9, arg10, arg2, arg8, var12)) {
                    class11.field165 = var12;
                    class400.field6022 = var11;
                    return true;
                }
            } else if (arg7 == -2) {
                if (arg0.method1719(arg8, arg6, (byte) 108, arg9, 1, var11, 1, var12, arg2, arg10)) {
                    class400.field6022 = var11;
                    class11.field165 = var12;
                    return true;
                }
            } else if (arg7 == -1) {
                if (arg0.method1732(var11, -118, 1, arg6, arg2, var12, arg10, arg9, arg8)) {
                    class11.field165 = var12;
                    class400.field6022 = var11;
                    return true;
                }
            } else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
                if (arg0.method1723(arg7, arg8, var12, 1, var11, 0, arg5, arg2)) {
                    class11.field165 = var12;
                    class400.field6022 = var11;
                    return true;
                }
            } else if (arg0.method1722(true, arg5, 1, arg2, var12, arg7, var11, arg8)) {
                class400.field6022 = var11;
                class11.field165 = var12;
                return true;
            }
            int var25 = class357.field5436[var21][var22] + 1;
            if (var21 > 0 && class129.field2058[var21 - 1][var22] == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0) {
                class353.field5403[var26] = var11 - 1;
                class49.field897[var26] = var12;
                class129.field2058[var21 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class357.field5436[var21 - 1][var22] = var25;
            }
            if (var21 < 127 && class129.field2058[var21 + 1][var22] == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0) {
                class353.field5403[var26] = var11 + 1;
                class49.field897[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class129.field2058[var21 + 1][var22] = 8;
                class357.field5436[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && class129.field2058[var21][var22 - 1] == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class353.field5403[var26] = var11;
                class49.field897[var26] = var12 - 1;
                class129.field2058[var21][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class357.field5436[var21][var22 - 1] = var25;
            }
            if (var22 < 127 && class129.field2058[var21][var22 + 1] == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class353.field5403[var26] = var11;
                class49.field897[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class129.field2058[var21][var22 + 1] = 4;
                class357.field5436[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && var22 > 0 && class129.field2058[var21 - 1][var22 - 1] == 0 && (var19[var20 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class353.field5403[var26] = var11 - 1;
                class49.field897[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class129.field2058[var21 - 1][var22 - 1] = 3;
                class357.field5436[var21 - 1][var22 - 1] = var25;
            }
            if (var21 < 127 && var22 > 0 && class129.field2058[var21 + 1][var22 - 1] == 0 && (var19[var20 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 - 1] & 0x40A40000) == 0) {
                class353.field5403[var26] = var11 + 1;
                class49.field897[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class129.field2058[var21 + 1][var22 - 1] = 9;
                class357.field5436[var21 + 1][var22 - 1] = var25;
            }
            if (var21 > 0 && var22 < 127 && class129.field2058[var21 - 1][var22 + 1] == 0 && (var19[var20 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var23] & 0x42240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class353.field5403[var26] = var11 - 1;
                class49.field897[var26] = var12 + 1;
                class129.field2058[var21 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class357.field5436[var21 - 1][var22 + 1] = var25;
            }
            if (var21 < 127 && var22 < 127 && class129.field2058[var21 + 1][var22 + 1] == 0 && (var19[var20 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var23] & 0x60240000) == 0 && (var19[var20][var23 + 1] & 0x48240000) == 0) {
                class353.field5403[var26] = var11 + 1;
                class49.field897[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class129.field2058[var21 + 1][var22 + 1] = 12;
                class357.field5436[var21 + 1][var22 + 1] = var25;
            }
        }
        class11.field165 = var12;
        class400.field6022 = var11;
        return false;
    }
}
