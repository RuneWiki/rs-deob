import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class396 {

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "[I")
    public static int[] field5353 = new int[2048];

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IILjw;IIIIIIII)Z", line = 6)
    public static final boolean method2238(int arg0, int arg1, class263 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field5354++;
        int var11 = arg7;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        class106.field1145[var13][var14] = 99;
        int var16 = arg5 - var14;
        if (arg0 != -1) {
            field5353 = null;
        }
        class378.field5119[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class60.field615[var17] = arg7;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class299.field3729[var10001] = arg5;
        int[][] var19 = arg2.field3286;
        while (var26 != var18) {
            var11 = class60.field615[var18];
            var12 = class299.field3729[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var11 - arg2.field3289;
            int var21 = var12 - arg2.field3274;
            int var22 = var12 - var16;
            int var23 = var11 - var15;
            if (arg1 == -4) {
                if (arg6 == var11 && arg3 == var12) {
                    class701.field9839 = var11;
                    class572.field8123 = var12;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class248.method1461(arg4, 1, arg6, arg8, arg3, var12, (byte) 116, 1, var11)) {
                    class701.field9839 = var11;
                    class572.field8123 = var12;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg2.method1552(arg6, var11, arg9, arg3, 1, arg4, arg8, var12, -104, 1)) {
                    class572.field8123 = var12;
                    class701.field9839 = var11;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg2.method1555(arg8, arg4, var11, arg6, 1, 1, arg9, var12, arg3)) {
                    class701.field9839 = var11;
                    class572.field8123 = var12;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg2.method1543(1, arg3, arg1, arg10, var11, 9816, arg6, var12)) {
                    class572.field8123 = var12;
                    class701.field9839 = var11;
                    return true;
                }
            } else if (arg2.method1558(arg10, arg6, -111, arg1, var11, 1, var12, arg3)) {
                class701.field9839 = var11;
                class572.field8123 = var12;
                return true;
            }
            int var25 = class378.field5119[var23][var22] + 1;
            if (var23 > 0 && class106.field1145[var23 - 1][var22] == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0) {
                class60.field615[var26] = var11 - 1;
                class299.field3729[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class106.field1145[var23 - 1][var22] = 2;
                class378.field5119[var23 - 1][var22] = var25;
            }
            if (var23 < 127 && class106.field1145[var23 + 1][var22] == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0) {
                class60.field615[var26] = var11 + 1;
                class299.field3729[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class106.field1145[var23 + 1][var22] = 8;
                class378.field5119[var23 + 1][var22] = var25;
            }
            if (var22 > 0 && class106.field1145[var23][var22 - 1] == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class60.field615[var26] = var11;
                class299.field3729[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1145[var23][var22 - 1] = 1;
                class378.field5119[var23][var22 - 1] = var25;
            }
            if (var22 < 127 && class106.field1145[var23][var22 + 1] == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class60.field615[var26] = var11;
                class299.field3729[var26] = var12 + 1;
                class106.field1145[var23][var22 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class378.field5119[var23][var22 + 1] = var25;
            }
            if (var23 > 0 && var22 > 0 && class106.field1145[var23 - 1][var22 - 1] == 0 && (var19[var20 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class60.field615[var26] = var11 - 1;
                class299.field3729[var26] = var12 - 1;
                class106.field1145[var23 - 1][var22 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class378.field5119[var23 - 1][var22 - 1] = var25;
            }
            if (var23 < 127 && var22 > 0 && class106.field1145[var23 + 1][var22 - 1] == 0 && (var19[var20 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class60.field615[var26] = var11 + 1;
                class299.field3729[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1145[var23 + 1][var22 - 1] = 9;
                class378.field5119[var23 + 1][var22 - 1] = var25;
            }
            if (var23 > 0 && var22 < 127 && class106.field1145[var23 - 1][var22 + 1] == 0 && (var19[var20 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class60.field615[var26] = var11 - 1;
                class299.field3729[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1145[var23 - 1][var22 + 1] = 6;
                class378.field5119[var23 - 1][var22 + 1] = var25;
            }
            if (var23 < 127 && var22 < 127 && class106.field1145[var23 + 1][var22 + 1] == 0 && (var19[var20 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class60.field615[var26] = var11 + 1;
                class299.field3729[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class106.field1145[var23 + 1][var22 + 1] = 12;
                class378.field5119[var23 + 1][var22 + 1] = var25;
            }
        }
        class572.field8123 = var12;
        class701.field9839 = var11;
        return false;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "([[BILuk;)V", line = 254)
    public static final void method2239(byte[][] arg0, int arg1, class476 arg2) {
        for (int var3 = 0; var3 < arg2.field8807; var3++) {
            class530.method2975((byte) 71);
            for (int var4 = 0; var4 < (class142.field1574 >> 3); var4++) {
                for (int var5 = 0; var5 < (class140.field1550 >> 3); var5++) {
                    int var6 = class687.field9668[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = var6 >> 24 & 0x3;
                        if (!arg2.field8821 || var7 == 0) {
                            int var8 = var6 >> 1 & 0x3;
                            int var9 = (var6 & 0xFFC773) >> 14;
                            int var10 = var6 >> 3 & 0x7FF;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class306.field3784.length; var12++) {
                                if (class306.field3784[var12] == var11 && arg0[var12] != null) {
                                    arg2.method2739(var5 * 8, var7, arg1 ^ 0xFF00388C, arg0[var12], class701.field9813, class282.field3534, var4 * 8, (var10 & 0x7) * 8, (var9 & 0x7) * 8, var8, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        field5357++;
        if (arg1 != 16762739) {
            method2239(null, 4, null);
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V", line = 326)
    public static void method2240(byte arg0) {
        if (arg0 > -7) {
            field5353 = null;
        }
        field5353 = null;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)Lvf;", line = 336)
    public static final class76 method2241(int arg0) {
        field5355++;
        class76 var1 = (class76) class34.field322.method1677(-84);
        if (var1 != null) {
            var1.method1922(119);
            var1.method3443(116);
            return var1;
        }
        if (arg0 != -9435) {
            method2241(7);
        }
        class76 var2;
        do {
            var2 = (class76) class495.field7173.method1677(-97);
            if (var2 == null) {
                return null;
            }
            if (var2.method404((byte) 103) > class557.method3157(-82)) {
                return null;
            }
            var2.method1922(102);
            var2.method3443(arg0 + 9550);
        } while ((var2.field8693 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IZ)I", line = 376)
    public static final int method2242(int arg0, boolean arg1) {
        field5356++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg1) {
            return 98;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
