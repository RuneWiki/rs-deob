import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class62 {

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "Lvd;")
    public static class222 field1149 = class212.method1357("", 10731);

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Lph;")
    public static class166 field1148 = new class166(30);

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "J")
    public static long field1146;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
    public static int[] field1144;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "[I")
    public static int[] field1151;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method430(byte arg0) {
        field1149 = null;
        field1144 = null;
        field1148 = null;
        if (arg0 < -5) {
            field1151 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public static final boolean method431(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1150++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class73.field1457[var12][var36] = 0;
                class14.field381[var12][var36] = 99999999;
            }
        }
        class73.field1457[arg6][arg7] = 99;
        class14.field381[arg6][arg7] = 0;
        int var13 = arg6;
        int var14 = 0;
        byte var15 = 0;
        class10.field197[var15] = arg6;
        boolean var16 = false;
        int var17 = arg7;
        int var37 = var15 + 1;
        class155.field2955[var15] = arg7;
        int[][] var18 = class108.field1993[class217.field4036].field132;
        if (arg11 >= -90) {
            method430((byte) -30);
        }
        int var19 = class10.field197.length;
        while (var14 != var37) {
            var17 = class155.field2955[var14];
            var13 = class10.field197[var14];
            var14 = (var14 + 1) % var19;
            if (arg10 == var13 && arg9 == var17) {
                var16 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class108.field1993[class217.field4036].method81(arg10, var13, arg2 - 1, 1, arg8, var17, arg9)) {
                    var16 = true;
                    break;
                }
                if (arg2 < 10 && class108.field1993[class217.field4036].method75(arg8, arg10, arg2 - 1, 128, var17, arg9, var13)) {
                    var16 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg4 != 0 && class108.field1993[class217.field4036].method78(arg4, 107, var17, arg3, arg10, arg5, var13, arg9)) {
                var16 = true;
                break;
            }
            int var35 = class14.field381[var13][var17] + 1;
            if (var13 > 0 && class73.field1457[var13 - 1][var17] == 0 && (var18[var13 - 1][var17] & 0x12C0108) == 0) {
                class10.field197[var37] = var13 - 1;
                class155.field2955[var37] = var17;
                class73.field1457[var13 - 1][var17] = 2;
                class14.field381[var13 - 1][var17] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 < 103 && class73.field1457[var13 + 1][var17] == 0 && (var18[var13 + 1][var17] & 0x12C0180) == 0) {
                class10.field197[var37] = var13 + 1;
                class155.field2955[var37] = var17;
                class73.field1457[var13 + 1][var17] = 8;
                class14.field381[var13 + 1][var17] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var17 > 0 && class73.field1457[var13][var17 - 1] == 0 && (var18[var13][var17 - 1] & 0x12C0102) == 0) {
                class10.field197[var37] = var13;
                class155.field2955[var37] = var17 - 1;
                class73.field1457[var13][var17 - 1] = 1;
                var37 = (var37 + 1) % var19;
                class14.field381[var13][var17 - 1] = var35;
            }
            if (var17 < 103 && class73.field1457[var13][var17 + 1] == 0 && (var18[var13][var17 + 1] & 0x12C0120) == 0) {
                class10.field197[var37] = var13;
                class155.field2955[var37] = var17 + 1;
                var37 = (var37 + 1) % var19;
                class73.field1457[var13][var17 + 1] = 4;
                class14.field381[var13][var17 + 1] = var35;
            }
            if (var13 > 0 && var17 > 0 && class73.field1457[var13 - 1][var17 - 1] == 0 && (var18[var13 - 1][var17 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var17] & 0x12C0108) == 0 && (var18[var13][var17 - 1] & 0x12C0102) == 0) {
                class10.field197[var37] = var13 - 1;
                class155.field2955[var37] = var17 - 1;
                var37 = (var37 + 1) % var19;
                class73.field1457[var13 - 1][var17 - 1] = 3;
                class14.field381[var13 - 1][var17 - 1] = var35;
            }
            if (var13 < 103 && var17 > 0 && class73.field1457[var13 + 1][var17 - 1] == 0 && (var18[var13 + 1][var17 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var17] & 0x12C0180) == 0 && (var18[var13][var17 - 1] & 0x12C0102) == 0) {
                class10.field197[var37] = var13 + 1;
                class155.field2955[var37] = var17 - 1;
                var37 = (var37 + 1) % var19;
                class73.field1457[var13 + 1][var17 - 1] = 9;
                class14.field381[var13 + 1][var17 - 1] = var35;
            }
            if (var13 > 0 && var17 < 103 && class73.field1457[var13 - 1][var17 + 1] == 0 && (var18[var13 - 1][var17 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var17] & 0x12C0108) == 0 && (var18[var13][var17 + 1] & 0x12C0120) == 0) {
                class10.field197[var37] = var13 - 1;
                class155.field2955[var37] = var17 + 1;
                class73.field1457[var13 - 1][var17 + 1] = 6;
                class14.field381[var13 - 1][var17 + 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 < 103 && var17 < 103 && class73.field1457[var13 + 1][var17 + 1] == 0 && (var18[var13 + 1][var17 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var17] & 0x12C0180) == 0 && (var18[var13][var17 + 1] & 0x12C0120) == 0) {
                class10.field197[var37] = var13 + 1;
                class155.field2955[var37] = var17 + 1;
                class73.field1457[var13 + 1][var17 + 1] = 12;
                class14.field381[var13 + 1][var17 + 1] = var35;
                var37 = (var37 + 1) % var19;
            }
        }
        class39.field868 = 0;
        if (!var16) {
            if (!arg0) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg10 - var21; var23 <= arg10 + var21; var23++) {
                for (int var24 = arg9 - var21; var24 <= arg9 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class14.field381[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (arg10 > var23) {
                            var26 = arg10 - var23;
                        } else if (var23 > arg3 + arg10 - 1) {
                            var26 = var23 + 1 - arg10 - arg3;
                        }
                        if (arg9 > var24) {
                            var25 = arg9 - var24;
                        } else if (var24 > arg4 + arg9 - 1) {
                            var25 = var24 + 1 - arg9 - arg4;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class14.field381[var23][var24] < var22) {
                            var20 = var27;
                            var17 = var24;
                            var13 = var23;
                            var22 = class14.field381[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg6 == var13 && arg7 == var17) {
                return false;
            }
            class39.field868 = 1;
        }
        byte var28 = 0;
        class10.field197[var28] = var13;
        int var38 = var28 + 1;
        class155.field2955[var28] = var17;
        int var29;
        int var30 = var29 = class73.field1457[var13][var17];
        while (arg6 != var13 || arg7 != var17) {
            if (var29 != var30) {
                var29 = var30;
                class10.field197[var38] = var13;
                class155.field2955[var38++] = var17;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var17++;
            } else if ((var30 & 0x4) != 0) {
                var17--;
            }
            var30 = class73.field1457[var13][var17];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class10.field197[var38];
            int var33 = class155.field2955[var38];
            if (arg1 == 0) {
                class42.field895.method1347((byte) -119, 164);
                class222.field4151++;
                class42.field895.method676(var31 + var31 + 3, (byte) -3);
            }
            if (arg1 == 1) {
                class105.field1935++;
                class42.field895.method1347((byte) -79, 232);
                class42.field895.method676(var31 + var31 + 17, (byte) -3);
            }
            if (arg1 == 2) {
                class42.field895.method1347((byte) -78, 19);
                class215.field3987++;
                class42.field895.method676(var31 + var31 + 3, (byte) -3);
            }
            class42.field895.method672(-279704376, class151.field2931 + var33);
            class214.field3973 = class155.field2955[0];
            class131.field2537 = class10.field197[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class42.field895.method687(class10.field197[var38] - var32, true);
                class42.field895.method676(class155.field2955[var38] - var33, (byte) -3);
            }
            class42.field895.method687(class6.field98[82] ? 1 : 0, true);
            class42.field895.method663(-58, class110.field2064 + var32);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
