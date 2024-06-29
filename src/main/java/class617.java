import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class617 {

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "[F")
    public static float[] field8331 = new float[16];

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "Ljda;")
    public static class239 field8329 = new class239(20);

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BILoga;IIIIIIII)Z")
    public static final boolean method3387(byte arg0, int arg1, class502 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field8330++;
        int var11 = arg4;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg4 - var13;
        int var16 = -114 % ((-arg0 - 55) / 56);
        class393.field5803[var13][var14] = 99;
        int var17 = arg5 - var14;
        class5.field48[var13][var14] = 0;
        byte var18 = 0;
        class85.field1191[var18] = arg4;
        int var19 = 0;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class23.field363[var10001] = arg5;
        int[][] var20 = arg2.field6957;
        while (var27 != var19) {
            var11 = class85.field1191[var19];
            var12 = class23.field363[var19];
            int var21 = var11 - var15;
            var19 = var19 + 1 & 0xFFF;
            int var22 = var12 - arg2.field6935;
            int var23 = var11 - arg2.field6941;
            int var24 = var12 - var17;
            if (arg3 == -4) {
                if (arg8 == var11 && arg6 == var12) {
                    class275.field4086 = var11;
                    class688.field9676 = var12;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class374.method2322(arg10, arg6, arg8, -1, arg1, var11, 1, 1, var12)) {
                    class688.field9676 = var12;
                    class275.field4086 = var11;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg2.method2906(arg8, var11, 1, arg10, -1, arg6, var12, 1, arg9, arg1)) {
                    class688.field9676 = var12;
                    class275.field4086 = var11;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg2.method2912(var12, arg10, arg1, arg9, arg8, var11, -104, arg6, 1)) {
                    class275.field4086 = var11;
                    class688.field9676 = var12;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg2.method2907(arg3, arg6, (byte) 14, var12, arg8, 1, arg7, var11)) {
                    class275.field4086 = var11;
                    class688.field9676 = var12;
                    return true;
                }
            } else if (arg2.method2915(arg7, arg8, var11, arg3, var12, arg6, 1, (byte) -82)) {
                class275.field4086 = var11;
                class688.field9676 = var12;
                return true;
            }
            int var26 = class5.field48[var21][var24] + 1;
            if (var21 > 0 && class393.field5803[var21 - 1][var24] == 0 && (var20[var23 - 1][var22] & 0x42240000) == 0) {
                class85.field1191[var27] = var11 - 1;
                class23.field363[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class393.field5803[var21 - 1][var24] = 2;
                class5.field48[var21 - 1][var24] = var26;
            }
            if (var21 < 127 && class393.field5803[var21 + 1][var24] == 0 && (var20[var23 + 1][var22] & 0x60240000) == 0) {
                class85.field1191[var27] = var11 + 1;
                class23.field363[var27] = var12;
                class393.field5803[var21 + 1][var24] = 8;
                var27 = var27 + 1 & 0xFFF;
                class5.field48[var21 + 1][var24] = var26;
            }
            if (var24 > 0 && class393.field5803[var21][var24 - 1] == 0 && (var20[var23][var22 - 1] & 0x40A40000) == 0) {
                class85.field1191[var27] = var11;
                class23.field363[var27] = var12 - 1;
                class393.field5803[var21][var24 - 1] = 1;
                var27 = var27 + 1 & 0xFFF;
                class5.field48[var21][var24 - 1] = var26;
            }
            if (var24 < 127 && class393.field5803[var21][var24 + 1] == 0 && (var20[var23][var22 + 1] & 0x48240000) == 0) {
                class85.field1191[var27] = var11;
                class23.field363[var27] = var12 + 1;
                class393.field5803[var21][var24 + 1] = 4;
                var27 = var27 + 1 & 0xFFF;
                class5.field48[var21][var24 + 1] = var26;
            }
            if (var21 > 0 && var24 > 0 && class393.field5803[var21 - 1][var24 - 1] == 0 && (var20[var23 - 1][var22 - 1] & 0x43A40000) == 0 && (var20[var23 - 1][var22] & 0x42240000) == 0 && (var20[var23][var22 - 1] & 0x40A40000) == 0) {
                class85.field1191[var27] = var11 - 1;
                class23.field363[var27] = var12 - 1;
                class393.field5803[var21 - 1][var24 - 1] = 3;
                var27 = var27 + 1 & 0xFFF;
                class5.field48[var21 - 1][var24 - 1] = var26;
            }
            if (var21 < 127 && var24 > 0 && class393.field5803[var21 + 1][var24 - 1] == 0 && (var20[var23 + 1][var22 - 1] & 0x60E40000) == 0 && (var20[var23 + 1][var22] & 0x60240000) == 0 && (var20[var23][var22 - 1] & 0x40A40000) == 0) {
                class85.field1191[var27] = var11 + 1;
                class23.field363[var27] = var12 - 1;
                class393.field5803[var21 + 1][var24 - 1] = 9;
                var27 = var27 + 1 & 0xFFF;
                class5.field48[var21 + 1][var24 - 1] = var26;
            }
            if (var21 > 0 && var24 < 127 && class393.field5803[var21 - 1][var24 + 1] == 0 && (var20[var23 - 1][var22 + 1] & 0x4E240000) == 0 && (var20[var23 - 1][var22] & 0x42240000) == 0 && (var20[var23][var22 + 1] & 0x48240000) == 0) {
                class85.field1191[var27] = var11 - 1;
                class23.field363[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class393.field5803[var21 - 1][var24 + 1] = 6;
                class5.field48[var21 - 1][var24 + 1] = var26;
            }
            if (var21 < 127 && var24 < 127 && class393.field5803[var21 + 1][var24 + 1] == 0 && (var20[var23 + 1][var22 + 1] & 0x78240000) == 0 && (var20[var23 + 1][var22] & 0x60240000) == 0 && (var20[var23][var22 + 1] & 0x48240000) == 0) {
                class85.field1191[var27] = var11 + 1;
                class23.field363[var27] = var12 + 1;
                class393.field5803[var21 + 1][var24 + 1] = 12;
                var27 = var27 + 1 & 0xFFF;
                class5.field48[var21 + 1][var24 + 1] = var26;
            }
        }
        class688.field9676 = var12;
        class275.field4086 = var11;
        return false;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field8325++;
        if (arg2 == arg4 && arg0 == arg9 && arg1 == arg6 && arg3 == arg8) {
            class296.method1879(arg7, true, arg9, arg8, arg1, arg2);
        } else {
            int var10 = arg2;
            int var11 = arg9;
            int var12 = arg2 * 3;
            int var13 = arg9 * 3;
            int var14 = arg4 * 3;
            int var15 = arg0 * 3;
            int var16 = arg6 * 3;
            int var17 = arg3 * 3;
            int var18 = arg1 + var14 - var16 - arg2;
            int var19 = arg8 + var15 - var17 - arg9;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg2;
                int var34 = (var28 + var30 + var32 >> 12) + arg9;
                class296.method1879(arg7, true, var11, var34, var33, var10);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg5 <= 73) {
            field8329 = null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V")
    public static final void method3389(boolean arg0) {
        if (arg0) {
            method3390(-116);
        }
        field8328++;
        class455 var1 = null;
        try {
            class615 var2 = class730.field10124.method617((byte) 84, "", true);
            while (var2.field8321 == 0) {
                class438.method2636(!arg0, 1L);
            }
            if (var2.field8321 == 1) {
                var1 = (class455) var2.field8318;
                class376 var3 = class712.field9959.method734((byte) -10);
                var1.method2700(0, var3.field5518, 1, var3.field5459);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2702(-1);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V")
    public static void method3390(int arg0) {
        field8329 = null;
        field8331 = null;
        if (arg0 != 1) {
            method3387((byte) 112, -61, null, -28, 112, 50, 78, -1, -38, -112, -72);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V")
    public static final void method3391(byte arg0, int[] arg1, Object[] arg2) {
        class186.method1288(arg1, 0, arg2, 62, arg1.length - 1);
        if (arg0 <= 9) {
            method3389(false);
        }
        field8326++;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lkf;Z)V")
    public static final void method3392(class267 arg0, boolean arg1) {
        if (!arg1) {
            method3390(-98);
        }
        field8327++;
        class200.field2655.method2545(-127, arg0);
        arg0.field3940 = arg0.field3938.field5459;
        arg0.field3938.field5459 = 0;
        class718.field10015 += arg0.field3940;
    }
}
