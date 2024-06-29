import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class152 extends class67 {

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "Lfp;")
    public static class7 field2186 = null;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "Z")
    public static boolean field2192 = true;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "Lij;")
    public static class316 field2190;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIILbm;IIII)Z", line = 6)
    public static final boolean method1118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class325 arg6, int arg7, int arg8, int arg9, int arg10) {
        field2185++;
        int var11 = arg2;
        if (arg3 != 127) {
            return false;
        }
        int var12 = arg4;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg2 - var13;
        class340.field4600[var13][var14] = 99;
        int var16 = arg4 - var14;
        class34.field459[var13][var14] = 0;
        byte var17 = 0;
        class196.field2841[var17] = arg2;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class215.field3010[var10001] = arg4;
        int[][] var19 = arg6.field4416;
        while (var26 != var18) {
            var12 = class215.field3010[var18];
            var11 = class196.field2841[var18];
            int var20 = var12 - arg6.field4426;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - var15;
            int var22 = var12 - var16;
            int var23 = var11 - arg6.field4427;
            if (arg10 == -4) {
                if (arg1 == var11 && arg0 == var12) {
                    class214.field3002 = var12;
                    class389.field5425 = var11;
                    return true;
                }
            } else if (arg10 == -3) {
                if (class146.method1051(var12, arg5, 1, false, arg1, arg9, var11, arg0, 1)) {
                    class214.field3002 = var12;
                    class389.field5425 = var11;
                    return true;
                }
            } else if (arg10 == -2) {
                if (arg6.method1988(var12, var11, 1, arg9, arg0, arg3 - 126, arg1, 1, arg5, arg7)) {
                    class389.field5425 = var11;
                    class214.field3002 = var12;
                    return true;
                }
            } else if (arg10 == -1) {
                if (arg6.method1989(arg7, var11, arg0, arg9, arg1, var12, -5, arg5, 1)) {
                    class214.field3002 = var12;
                    class389.field5425 = var11;
                    return true;
                }
            } else if (arg10 == 0 || arg10 == 1 || arg10 == 2 || arg10 == 3 || arg10 == 9) {
                if (arg6.method1974(arg0, arg10, 1, arg8, arg1, var11, var12, arg3 - 127)) {
                    class389.field5425 = var11;
                    class214.field3002 = var12;
                    return true;
                }
            } else if (arg6.method1990(arg1, 1, arg0, arg8, 32, var11, var12, arg10)) {
                class214.field3002 = var12;
                class389.field5425 = var11;
                return true;
            }
            int var25 = class34.field459[var21][var22] + 1;
            if (var21 > 0 && class340.field4600[var21 - 1][var22] == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0) {
                class196.field2841[var26] = var11 - 1;
                class215.field3010[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class340.field4600[var21 - 1][var22] = 2;
                class34.field459[var21 - 1][var22] = var25;
            }
            if (var21 < 127 && class340.field4600[var21 + 1][var22] == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0) {
                class196.field2841[var26] = var11 + 1;
                class215.field3010[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class340.field4600[var21 + 1][var22] = 8;
                class34.field459[var21 + 1][var22] = var25;
            }
            if (var22 > 0 && class340.field4600[var21][var22 - 1] == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class196.field2841[var26] = var11;
                class215.field3010[var26] = var12 - 1;
                class340.field4600[var21][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class34.field459[var21][var22 - 1] = var25;
            }
            if (var22 < 127 && class340.field4600[var21][var22 + 1] == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class196.field2841[var26] = var11;
                class215.field3010[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class340.field4600[var21][var22 + 1] = 4;
                class34.field459[var21][var22 + 1] = var25;
            }
            if (var21 > 0 && var22 > 0 && class340.field4600[var21 - 1][var22 - 1] == 0 && (var19[var23 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class196.field2841[var26] = var11 - 1;
                class215.field3010[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class340.field4600[var21 - 1][var22 - 1] = 3;
                class34.field459[var21 - 1][var22 - 1] = var25;
            }
            if (var21 < 127 && var22 > 0 && class340.field4600[var21 + 1][var22 - 1] == 0 && (var19[var23 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0 && (var19[var23][var20 - 1] & 0x40A40000) == 0) {
                class196.field2841[var26] = var11 + 1;
                class215.field3010[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class340.field4600[var21 + 1][var22 - 1] = 9;
                class34.field459[var21 + 1][var22 - 1] = var25;
            }
            if (var21 > 0 && var22 < 127 && class340.field4600[var21 - 1][var22 + 1] == 0 && (var19[var23 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var23 - 1][var20] & 0x42240000) == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class196.field2841[var26] = var11 - 1;
                class215.field3010[var26] = var12 + 1;
                class340.field4600[var21 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class34.field459[var21 - 1][var22 + 1] = var25;
            }
            if (var21 < 127 && var22 < 127 && class340.field4600[var21 + 1][var22 + 1] == 0 && (var19[var23 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var23 + 1][var20] & 0x60240000) == 0 && (var19[var23][var20 + 1] & 0x48240000) == 0) {
                class196.field2841[var26] = var11 + 1;
                class215.field3010[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class340.field4600[var21 + 1][var22 + 1] = 12;
                class34.field459[var21 + 1][var22 + 1] = var25;
            }
        }
        class214.field3002 = var12;
        class389.field5425 = var11;
        return false;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)B", line = 260)
    public static final byte method1119(int arg0, int arg1, int arg2) {
        field2189++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == arg1 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)V", line = 276)
    public static void method1120(boolean arg0) {
        field2190 = null;
        if (!arg0) {
            method1120(true);
        }
        field2186 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLjq;)V", line = 288)
    public static final void method1121(boolean arg0, class185 arg1) {
        if (!arg0) {
            return;
        }
        field2188++;
        boolean var2 = false;
        if (class246.field3467 == arg1.field2612 || arg1.field2619 == -1 || arg1.field2617 != 0) {
            var2 = true;
        } else {
            class83 var3 = class408.method2521((byte) 33, arg1.field2619);
            if (var3.field1146 || arg1.field2626 + 1 > var3.field1144[arg1.field2593]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field2612 - arg1.field2627;
            int var5 = class246.field3467 - arg1.field2627;
            int var6 = arg1.field2623 * 128 + (arg1.method1285(-124) * 64);
            int var7 = arg1.field2642 * 128 + (arg1.method1285(-125) * 64);
            int var8 = arg1.field2628 * 128 + (arg1.method1285(-73) * 64);
            int var9 = arg1.field2646 * 128 + (arg1.method1285(-69) * 64);
            arg1.field40 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field44 = ((var4 - var5) * var7 + (var5 * var9)) / var4;
        }
        arg1.field2664 = 0;
        if (arg1.field2635 == 0) {
            arg1.method1290(8192, 0);
        }
        if (arg1.field2635 == 1) {
            arg1.method1290(12288, 0);
        }
        if (arg1.field2635 == 2) {
            arg1.method1290(0, 0);
        }
        if (arg1.field2635 == 3) {
            arg1.method1290(4096, 0);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lea;IILts;IIIIIII)Lts;", line = 358)
    public static final class116 method1122(class58 arg0, int arg1, int arg2, class116 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg4 <= 120) {
            field2192 = true;
        }
        field2191++;
        long var11 = (long) arg10;
        class116 var13 = (class116) class343.field4628.method2529(0, var11);
        short var14 = 1031;
        if (var13 == null) {
            class98 var15 = class267.method1702((byte) -104, arg10, 0, class294.field3986);
            if (var15 == null) {
                return null;
            }
            var13 = arg0.method254(var15, var14, class447.field6346, 64, 768);
            class343.field4628.method2527(121, var11, var13);
        }
        class116 var16 = var13.method907((byte) 2, var14, true);
        if (arg5 != 0) {
            var16.method867(arg5);
        }
        if (arg7 != 0) {
            var16.method910(arg7);
        }
        if (arg8 != 0) {
            var16.method873(arg8);
        }
        if (arg6 != 0) {
            var16.method882(0, arg6, 0);
        }
        return var16;
    }
}
