import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class125 {

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field1967 = 0;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field1965 = 0;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Llm;")
    public static class210 field1966;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[Lwh;")
    public static class60[] field1964;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 19)
    public static void method916(int arg0) {
        field1966 = null;
        int var1 = 6 % ((-arg0 - 16) / 49);
        field1964 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([IIIIII)V", line = 29)
    public static final void method917(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class221 var6 = class158.field2367[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class228 var7 = var6.field3378;
        if (var7 != null) {
            int var8 = var7.field3458;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class99 var10 = var6.field3379;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1584;
        int var12 = var10.field1570;
        int var13 = var10.field1582;
        int var14 = var10.field1586;
        int[] var15 = class250.field3728[var11];
        int[] var16 = class111.field1717[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIZIIIIIII)Z", line = 130)
    public static final boolean method918(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class146.field2209[var12][var13] = 0;
                class145.field2201[var12][var13] = 99999999;
            }
        }
        field1968++;
        class146.field2209[arg2][arg1] = 99;
        int var14 = arg1;
        class145.field2201[arg2][arg1] = 0;
        int var15 = arg2;
        boolean var16 = false;
        int var17 = 0;
        byte var18 = 0;
        class97.field1462[var18] = arg2;
        int var32 = var18 + 1;
        class93.field1399[var18] = arg1;
        int[][] var19 = class325.field4896[class180.field2697].field2857;
        while (var17 != var32) {
            var15 = class97.field1462[var17];
            var14 = class93.field1399[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg11 == var15 && arg3 == var14) {
                var16 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class325.field4896[class180.field2697].method1316(var14, arg3, var15, arg8 - 1, arg11, arg0, 2, 55)) {
                    var16 = true;
                    break;
                }
                if (arg8 < 10 && class325.field4896[class180.field2697].method1312(2, arg8 - 1, arg0, -23731, arg3, arg11, var15, var14)) {
                    var16 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg10 != 0 && class325.field4896[class180.field2697].method1300(arg6, arg11, arg10, var15, arg3, 2, arg9, (byte) 54, var14)) {
                var16 = true;
                break;
            }
            int var20 = class145.field2201[var15][var14] + 1;
            if (var15 > 0 && class146.field2209[var15 - 1][var14] == 0 && (var19[var15 - 1][var14] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + 1] & 0x12C0138) == 0) {
                class97.field1462[var32] = var15 - 1;
                class93.field1399[var32] = var14;
                class146.field2209[var15 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class145.field2201[var15 - 1][var14] = var20;
            }
            if (var15 < 102 && class146.field2209[var15 + 1][var14] == 0 && (var19[var15 + 2][var14] & 0x12C0183) == 0 && (var19[var15 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class97.field1462[var32] = var15 + 1;
                class93.field1399[var32] = var14;
                class146.field2209[var15 + 1][var14] = 8;
                var32 = var32 + 1 & 0xFFF;
                class145.field2201[var15 + 1][var14] = var20;
            }
            if (var14 > 0 && class146.field2209[var15][var14 - 1] == 0 && (var19[var15][var14 - 1] & 0x12C010E) == 0 && (var19[var15 + 1][var14 - 1] & 0x12C0183) == 0) {
                class97.field1462[var32] = var15;
                class93.field1399[var32] = var14 - 1;
                class146.field2209[var15][var14 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class145.field2201[var15][var14 - 1] = var20;
            }
            if (var14 < 102 && class146.field2209[var15][var14 + 1] == 0 && (var19[var15][var14 + 2] & 0x12C0138) == 0 && (var19[var15 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class97.field1462[var32] = var15;
                class93.field1399[var32] = var14 + 1;
                class146.field2209[var15][var14 + 1] = 4;
                class145.field2201[var15][var14 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 > 0 && var14 > 0 && class146.field2209[var15 - 1][var14 - 1] == 0 && (var19[var15 - 1][var14] & 0x12C0138) == 0 && (var19[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15][var14 - 1] & 0x12C0183) == 0) {
                class97.field1462[var32] = var15 - 1;
                class93.field1399[var32] = var14 - 1;
                class146.field2209[var15 - 1][var14 - 1] = 3;
                class145.field2201[var15 - 1][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && var14 > 0 && class146.field2209[var15 + 1][var14 - 1] == 0 && (var19[var15 + 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15 + 2][var14 - 1] & 0x12C0183) == 0 && (var19[var15 + 2][var14] & 0x12C01E0) == 0) {
                class97.field1462[var32] = var15 + 1;
                class93.field1399[var32] = var14 - 1;
                class146.field2209[var15 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class145.field2201[var15 + 1][var14 - 1] = var20;
            }
            if (var15 > 0 && var14 < 102 && class146.field2209[var15 - 1][var14 + 1] == 0 && (var19[var15 - 1][var14 + 1] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + 2] & 0x12C0138) == 0 && (var19[var15][var14 + 2] & 0x12C01E0) == 0) {
                class97.field1462[var32] = var15 - 1;
                class93.field1399[var32] = var14 + 1;
                class146.field2209[var15 - 1][var14 + 1] = 6;
                class145.field2201[var15 - 1][var14 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && var14 < 102 && class146.field2209[var15 + 1][var14 + 1] == 0 && (var19[var15 + 1][var14 + 2] & 0x12C0138) == 0 && (var19[var15 + 2][var14 + 2] & 0x12C01E0) == 0 && (var19[var15 + 2][var14 + 1] & 0x12C0183) == 0) {
                class97.field1462[var32] = var15 + 1;
                class93.field1399[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class146.field2209[var15 + 1][var14 + 1] = 12;
                class145.field2201[var15 + 1][var14 + 1] = var20;
            }
        }
        class20.field237 = 0;
        if (!var16) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg11 - var23; var24 <= arg11 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= (arg3 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class145.field2201[var24][var25] < 100) {
                        int var26 = 0;
                        if (var25 < arg3) {
                            var26 = arg3 - var25;
                        } else if (var25 > arg3 + arg10 - 1) {
                            var26 = var25 - arg3 - (arg10 + -1);
                        }
                        int var27 = 0;
                        if (var24 < arg11) {
                            var27 = arg11 - var24;
                        } else if (var24 > (arg11 + arg6 - 1)) {
                            var27 = var24 + 1 - arg6 - arg11;
                        }
                        int var28 = var27 * var27 + (var26 * var26);
                        if (var21 > var28 || var21 == var28 && class145.field2201[var24][var25] < var22) {
                            var14 = var25;
                            var22 = class145.field2201[var24][var25];
                            var15 = var24;
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg2 == var15 && arg1 == var14) {
                return false;
            }
            class20.field237 = 1;
        }
        byte var29 = 0;
        class97.field1462[var29] = var15;
        int var33 = var29 + 1;
        class93.field1399[var29] = var14;
        int var30;
        int var31 = var30 = class146.field2209[var15][var14];
        while (arg2 != var15 || arg1 != var14) {
            if (var30 != var31) {
                class97.field1462[var33] = var15;
                class93.field1399[var33++] = var14;
                var30 = var31;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = class146.field2209[var15][var14];
        }
        if (var33 > 0) {
            class311.method2152(var33, (byte) 72, arg7);
            return true;
        } else if (arg5 == arg7) {
            return false;
        } else {
            return true;
        }
    }
}
