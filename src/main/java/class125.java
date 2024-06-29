import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class125 {

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "Lkaa;")
    public static class47 field2071 = new class47(4, 1);

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method988(int arg0) {
        if (arg0 != 13334) {
            field2071 = null;
        }
        field2071 = null;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILjava/lang/String;)[B")
    public static final byte[] method989(int arg0, String arg1) {
        field2073++;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var2 <= (var3 - 2) || class6.method82(arg1.charAt(var3 - 2), 5041) == -1) {
            var4 -= 2;
        } else if (var2 <= var3 - 1 || class6.method82(arg1.charAt(var3 - 1), 5041) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class427.method2462(var5, arg1, 0, arg0);
        return var5;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public static final void method990(byte arg0) {
        class687[] var1 = class690.field9596;
        synchronized (class690.field9596) {
            int var2 = 0;
            if (arg0 > -69) {
                field2072 = 113;
            }
            while (true) {
                if (class690.field9596.length <= var2) {
                    break;
                }
                class690.field9596[var2] = new class687();
                class596.field7752[var2] = 0;
                var2++;
            }
        }
        field2070++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lkb;IIIIBIIIII)Z")
    public static final boolean method991(class691 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2069++;
        if (arg5 <= 38) {
            method990((byte) 42);
        }
        int var11 = arg4;
        int var12 = arg6;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg4 - var13;
        int var16 = arg6 - var14;
        class372.field5176[var13][var14] = 99;
        class8.field155[var13][var14] = 0;
        byte var17 = 0;
        class50.field638[var17] = arg4;
        int var18 = 0;
        int var26 = var17 + 1;
        class10.field169[var17] = arg6;
        int[][] var19 = arg0.field9639;
        while (var26 != var18) {
            var11 = class50.field638[var18];
            var12 = class10.field169[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg0.field9624;
            int var23 = var12 - arg0.field9640;
            if (arg3 == -4) {
                if (arg2 == var11 && arg8 == var12) {
                    class524.field6955 = var12;
                    class156.field2385 = var11;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class287.method1780(1, arg9, var12, arg8, 1, arg1, arg2, var11, true)) {
                    class524.field6955 = var12;
                    class156.field2385 = var11;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg0.method3899(1, arg1, arg9, arg8, var11, -104, arg2, arg10, 1, var12)) {
                    class156.field2385 = var11;
                    class524.field6955 = var12;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg0.method3894(arg2, arg1, 1, -1, arg8, var12, arg9, var11, arg10)) {
                    class156.field2385 = var11;
                    class524.field6955 = var12;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg0.method3901(arg7, (byte) -119, var12, arg3, 1, arg2, var11, arg8)) {
                    class156.field2385 = var11;
                    class524.field6955 = var12;
                    return true;
                }
            } else if (arg0.method3893(1, 1, arg7, arg3, var11, arg8, arg2, var12)) {
                class524.field6955 = var12;
                class156.field2385 = var11;
                return true;
            }
            int var25 = class8.field155[var21][var20] + 1;
            if (var21 > 0 && class372.field5176[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0) {
                class50.field638[var26] = var11 - 1;
                class10.field169[var26] = var12;
                class372.field5176[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class8.field155[var21 - 1][var20] = var25;
            }
            if (var21 < 127 && class372.field5176[var21 + 1][var20] == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0) {
                class50.field638[var26] = var11 + 1;
                class10.field169[var26] = var12;
                class372.field5176[var21 + 1][var20] = 8;
                var26 = var26 + 1 & 0xFFF;
                class8.field155[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class372.field5176[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class50.field638[var26] = var11;
                class10.field169[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class372.field5176[var21][var20 - 1] = 1;
                class8.field155[var21][var20 - 1] = var25;
            }
            if (var20 < 127 && class372.field5176[var21][var20 + 1] == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class50.field638[var26] = var11;
                class10.field169[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class372.field5176[var21][var20 + 1] = 4;
                class8.field155[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class372.field5176[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class50.field638[var26] = var11 - 1;
                class10.field169[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class372.field5176[var21 - 1][var20 - 1] = 3;
                class8.field155[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 127 && var20 > 0 && class372.field5176[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0 && (var19[var22][var23 - 1] & 0x40A40000) == 0) {
                class50.field638[var26] = var11 + 1;
                class10.field169[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class372.field5176[var21 + 1][var20 - 1] = 9;
                class8.field155[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 127 && class372.field5176[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0 && (var19[var22 - 1][var23] & 0x42240000) == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class50.field638[var26] = var11 - 1;
                class10.field169[var26] = var12 + 1;
                class372.field5176[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class8.field155[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 127 && var20 < 127 && class372.field5176[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 1] & 0x78240000) == 0 && (var19[var22 + 1][var23] & 0x60240000) == 0 && (var19[var22][var23 + 1] & 0x48240000) == 0) {
                class50.field638[var26] = var11 + 1;
                class10.field169[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class372.field5176[var21 + 1][var20 + 1] = 12;
                class8.field155[var21 + 1][var20 + 1] = var25;
            }
        }
        class524.field6955 = var12;
        class156.field2385 = var11;
        return false;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZIZIB)V")
    public static final void method992(boolean arg0, int arg1, boolean arg2, int arg3, byte arg4) {
        field2074++;
        if (arg4 == 28) {
            class434.method2495(arg3, arg0, arg1, 69, arg2, class721.field10045.length - 1, 0);
            class469.field6435 = 0;
            class193.field2914 = null;
        }
    }
}
