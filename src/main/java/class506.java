import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class506 extends class261 {

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public int field7376;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public int field7375;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Ls;")
    public static class186 field7379 = new class186(75, 5);

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field7382 = 0;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "Llf;")
    public static class160 field7386;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "J")
    public static long field7387;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "F")
    public static float field7378;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field7377;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field7380;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field7384;

    static {
        new class309(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field7385 = 0;
        field7386 = new class160(0);
        field7387 = 0L;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 5)
    public static void method3034(int arg0) {
        field7379 = null;
        int var1 = -32 % ((arg0 + 36) / 41);
        field7386 = null;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(II)V", line = 14)
    public class506(int arg0, int arg1) {
        this.field7376 = arg0;
        this.field7375 = arg1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIILsd;IIIIIIB)Z", line = 28)
    public static final boolean method3035(int arg0, int arg1, int arg2, class63 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field7377++;
        int var11 = arg7;
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        class416.field6275[var13][var14] = 99;
        int var16 = arg4 - var14;
        class290.field4437[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        if (arg10 != 87) {
            method3035(-52, 25, -55, null, -126, 31, -81, -128, 31, -91, (byte) -46);
        }
        class246.field3801[var17] = arg7;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class441.field6555[var10001] = arg4;
        int[][] var19 = arg3.field1283;
        while (var26 != var18) {
            var12 = class441.field6555[var18];
            var11 = class246.field3801[var18];
            int var20 = var12 - var16;
            int var21 = var11 - arg3.field1301;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var12 - arg3.field1286;
            int var23 = var11 - var15;
            if (arg1 == -4) {
                if (arg8 == var11 && arg2 == var12) {
                    class81.field1634 = var12;
                    class129.field2204 = var11;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class202.method1391(25356, arg8, arg6, var12, var11, 1, 1, arg9, arg2)) {
                    class129.field2204 = var11;
                    class81.field1634 = var12;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg3.method561(arg8, 1, arg2, arg5, arg6, arg9, var12, var11, 8388608, 1)) {
                    class129.field2204 = var11;
                    class81.field1634 = var12;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg3.method565(arg5, var11, arg6, false, var12, 1, arg9, arg2, arg8)) {
                    class81.field1634 = var12;
                    class129.field2204 = var11;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg3.method557(arg2, var12, arg1, arg0, arg8, (byte) 115, var11, 1)) {
                    class129.field2204 = var11;
                    class81.field1634 = var12;
                    return true;
                }
            } else if (arg3.method550(1, var12, arg1, arg2, arg8, var11, arg0, (byte) 109)) {
                class81.field1634 = var12;
                class129.field2204 = var11;
                return true;
            }
            int var25 = class290.field4437[var23][var20] + 1;
            if (var23 > 0 && class416.field6275[var23 - 1][var20] == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0) {
                class246.field3801[var26] = var11 - 1;
                class441.field6555[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class416.field6275[var23 - 1][var20] = 2;
                class290.field4437[var23 - 1][var20] = var25;
            }
            if (var23 < 127 && class416.field6275[var23 + 1][var20] == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0) {
                class246.field3801[var26] = var11 + 1;
                class441.field6555[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class416.field6275[var23 + 1][var20] = 8;
                class290.field4437[var23 + 1][var20] = var25;
            }
            if (var20 > 0 && class416.field6275[var23][var20 - 1] == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class246.field3801[var26] = var11;
                class441.field6555[var26] = var12 - 1;
                class416.field6275[var23][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class290.field4437[var23][var20 - 1] = var25;
            }
            if (var20 < 127 && class416.field6275[var23][var20 + 1] == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class246.field3801[var26] = var11;
                class441.field6555[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class416.field6275[var23][var20 + 1] = 4;
                class290.field4437[var23][var20 + 1] = var25;
            }
            if (var23 > 0 && var20 > 0 && class416.field6275[var23 - 1][var20 - 1] == 0 && (var19[var21 - 1][var22 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class246.field3801[var26] = var11 - 1;
                class441.field6555[var26] = var12 - 1;
                class416.field6275[var23 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class290.field4437[var23 - 1][var20 - 1] = var25;
            }
            if (var23 < 127 && var20 > 0 && class416.field6275[var23 + 1][var20 - 1] == 0 && (var19[var21 + 1][var22 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 - 1] & 0x40A40000) == 0) {
                class246.field3801[var26] = var11 + 1;
                class441.field6555[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class416.field6275[var23 + 1][var20 - 1] = 9;
                class290.field4437[var23 + 1][var20 - 1] = var25;
            }
            if (var23 > 0 && var20 < 127 && class416.field6275[var23 - 1][var20 + 1] == 0 && (var19[var21 - 1][var22 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var22] & 0x42240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class246.field3801[var26] = var11 - 1;
                class441.field6555[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class416.field6275[var23 - 1][var20 + 1] = 6;
                class290.field4437[var23 - 1][var20 + 1] = var25;
            }
            if (var23 < 127 && var20 < 127 && class416.field6275[var23 + 1][var20 + 1] == 0 && (var19[var21 + 1][var22 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var22] & 0x60240000) == 0 && (var19[var21][var22 + 1] & 0x48240000) == 0) {
                class246.field3801[var26] = var11 + 1;
                class441.field6555[var26] = var12 + 1;
                class416.field6275[var23 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class290.field4437[var23 + 1][var20 + 1] = var25;
            }
        }
        class129.field2204 = var11;
        class81.field1634 = var12;
        return false;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIII[B)Z", line = 278)
    public static final boolean method3036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field7380++;
        int var7 = arg5 % arg0;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg0 - var7;
        }
        int var9 = -((arg0 + arg2 - 1) / arg0);
        int var10 = -((arg0 + arg5 - 1) / arg0);
        if (arg1 != 21723) {
            return true;
        }
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg4] == 0) {
                    return true;
                }
                arg4 += arg0;
            }
            int var13 = arg4 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg4 = arg3 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)V", line = 330)
    public static final void method3037(int arg0) {
        field7381++;
        if (class198.field3177 != null) {
            return;
        }
        class198.field3177 = new int[65536];
        if (arg0 != 1) {
            return;
        }
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - ((1.0F - var15) * var6)) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var9 = var8;
                    var11 = var16;
                } else if (var14 == 1) {
                    var10 = var8;
                    var9 = var17;
                    var11 = var16;
                } else if (var14 == 2) {
                    var10 = var8;
                    var9 = var16;
                    var11 = var18;
                } else if (var14 == 3) {
                    var11 = var8;
                    var10 = var17;
                    var9 = var16;
                } else if (var14 == 4) {
                    var9 = var18;
                    var10 = var16;
                    var11 = var8;
                } else if (var14 == 5) {
                    var11 = var17;
                    var9 = var8;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class198.field3177[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V", line = 459)
    public static final void method3038(boolean arg0) {
        field7384++;
        class229.field3560 = 0;
        if (!arg0) {
            field7382 = 39;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            class334.field5057[var1] = null;
            class267.field4058[var1] = 1;
            class253.field3890[var1] = null;
        }
    }
}
