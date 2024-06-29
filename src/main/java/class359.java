import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class359 {

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public int field5213 = 2048;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public int field5214 = 0;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public int field5209 = 0;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public int field5211 = 2048;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Lqe;")
    public static class469 field5207 = new class469(51, 3);

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public static int field5216 = 0;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "Lfa;")
    public static class235 field5215 = new class235(2, 4, 4, 0);

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "[[Z")
    public static boolean[][] field5217 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
    public static void method2238(boolean arg0) {
        field5217 = null;
        field5215 = null;
        if (arg0) {
            method2240(61, (byte) -123, 98);
        }
        field5207 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILtea;IIIIIIII)Z")
    public static final boolean method2239(int arg0, int arg1, class240 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5206++;
        int var11 = arg7;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        class460.field6788[var13][var14] = 99;
        int var16 = arg9 - var14;
        class211.field3179[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        if (arg5 != -1) {
            field5207 = null;
        }
        class142.field1864[var17] = arg7;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class611.field8637[var10001] = arg9;
        int[][] var19 = arg2.field3488;
        while (var26 != var18) {
            var11 = class142.field1864[var18];
            var12 = class611.field8637[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - var15;
            int var21 = var12 - var16;
            int var22 = var11 - arg2.field3500;
            int var23 = var12 - arg2.field3482;
            if (arg3 == -4) {
                if (arg8 == var11 && arg10 == var12) {
                    class42.field458 = var12;
                    class630.field8796 = var11;
                    return true;
                }
            } else if (arg3 == -3) {
                if (class387.method2493(arg8, 2, arg0, arg4, var11, -53, arg10, 2, var12)) {
                    class630.field8796 = var11;
                    class42.field458 = var12;
                    return true;
                }
            } else if (arg3 == -2) {
                if (arg2.method1592(-10783, 2, var11, arg8, var12, arg10, arg4, 2, arg6, arg0)) {
                    class630.field8796 = var11;
                    class42.field458 = var12;
                    return true;
                }
            } else if (arg3 == -1) {
                if (arg2.method1596(arg8, arg0, arg6, -16001, arg4, arg10, 2, var11, var12)) {
                    class42.field458 = var12;
                    class630.field8796 = var11;
                    return true;
                }
            } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                if (arg2.method1599(var12, arg10, arg3, -16752, arg8, 2, arg1, var11)) {
                    class630.field8796 = var11;
                    class42.field458 = var12;
                    return true;
                }
            } else if (arg2.method1606(2, arg10, var11, arg3, arg8, 671744, var12, arg1)) {
                class42.field458 = var12;
                class630.field8796 = var11;
                return true;
            }
            int var25 = class211.field3179[var20][var21] + 1;
            if (var20 > 0 && class460.field6788[var20 - 1][var21] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class142.field1864[var26] = var11 - 1;
                class611.field8637[var26] = var12;
                class460.field6788[var20 - 1][var21] = 2;
                var26 = var26 + 1 & 0xFFF;
                class211.field3179[var20 - 1][var21] = var25;
            }
            if (var20 < 126 && class460.field6788[var20 + 1][var21] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class142.field1864[var26] = var11 + 1;
                class611.field8637[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class460.field6788[var20 + 1][var21] = 8;
                class211.field3179[var20 + 1][var21] = var25;
            }
            if (var21 > 0 && class460.field6788[var20][var21 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class142.field1864[var26] = var11;
                class611.field8637[var26] = var12 - 1;
                class460.field6788[var20][var21 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class211.field3179[var20][var21 - 1] = var25;
            }
            if (var21 < 126 && class460.field6788[var20][var21 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class142.field1864[var26] = var11;
                class611.field8637[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class460.field6788[var20][var21 + 1] = 4;
                class211.field3179[var20][var21 + 1] = var25;
            }
            if (var20 > 0 && var21 > 0 && class460.field6788[var20 - 1][var21 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class142.field1864[var26] = var11 - 1;
                class611.field8637[var26] = var12 - 1;
                class460.field6788[var20 - 1][var21 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class211.field3179[var20 - 1][var21 - 1] = var25;
            }
            if (var20 < 126 && var21 > 0 && class460.field6788[var20 + 1][var21 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class142.field1864[var26] = var11 + 1;
                class611.field8637[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class460.field6788[var20 + 1][var21 - 1] = 9;
                class211.field3179[var20 + 1][var21 - 1] = var25;
            }
            if (var20 > 0 && var21 < 126 && class460.field6788[var20 - 1][var21 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class142.field1864[var26] = var11 - 1;
                class611.field8637[var26] = var12 + 1;
                class460.field6788[var20 - 1][var21 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class211.field3179[var20 - 1][var21 + 1] = var25;
            }
            if (var20 < 126 && var21 < 126 && class460.field6788[var20 + 1][var21 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class142.field1864[var26] = var11 + 1;
                class611.field8637[var26] = var12 + 1;
                class460.field6788[var20 + 1][var21 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class211.field3179[var20 + 1][var21 + 1] = var25;
            }
        }
        class42.field458 = var12;
        class630.field8796 = var11;
        return false;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBI)V")
    public static final void method2240(int arg0, byte arg1, int arg2) {
        field5208++;
        class302.field4291++;
        class468 var3 = class93.method734(class29.field284, class107.field1496, 8174);
        var3.field6839.method3698(arg1 ^ 0xFFFFFFFC, arg2);
        if (arg1 != -124) {
            method2239(-12, 30, null, 17, 58, -24, -9, -114, -80, 57, 14);
        }
        var3.field6839.method3750(arg0, (byte) -69);
        class120.method872((byte) 105, var3);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lrg;BI)V")
    private final void method2241(class645 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field5209 = arg0.method3745(-6314);
        } else if (arg2 == 2) {
            this.field5213 = arg0.method3712((byte) 101);
        } else if (arg2 == 3) {
            this.field5211 = arg0.method3712((byte) -126);
        } else if (arg2 == 4) {
            this.field5214 = arg0.method3756(arg1 + 65436);
        }
        field5210++;
        if (arg1 != 100) {
            this.method2243(-60, null);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lkb;I)V")
    public static final void method2242(class692 arg0, int arg1) {
        if (arg1 != 5160) {
            method2239(68, 98, null, -25, 6, 20, -98, 57, -37, -8, -5);
        }
        field5212++;
        class69.field979 = arg0;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILrg;)V")
    public final void method2243(int arg0, class645 arg1) {
        while (true) {
            int var3 = arg1.method3745(-6314);
            if (var3 == 0) {
                if (arg0 != 0) {
                    method2238(true);
                }
                field5205++;
                return;
            }
            this.method2241(arg1, (byte) 100, var3);
        }
    }
}
