import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 extends class30 {

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "Lje;")
    private static class67 field2700 = class85.method592(255, "purple:");

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "Lje;")
    public static class67 field2703 = field2700;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "Lje;")
    public static class67 field2704 = field2700;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field2705 = 3353893;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "[I")
    private static int[] field2702 = new int[4000];

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "Lje;")
    public static class67 field2708 = class85.method592(255, " <col=ffffff>");

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    public static int field2710 = 0;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "B")
    public byte field2706;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "I")
    public int field2707;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "Lua;")
    public class140 field2697;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "[Lkd;")
    public static class73[] field2701;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIZIBIIIIII)Z")
    public static final boolean method949(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class129.field2847[var12][var36] = 0;
                class47.field897[var12][var36] = 99999999;
            }
        }
        field2699++;
        int var13 = arg10;
        class129.field2847[arg10][arg0] = 99;
        if (arg5 != 78) {
            method949(-71, 7, 115, false, 81, (byte) -80, 103, 69, -18, -93, 73, -106);
        }
        int var14 = arg0;
        class47.field897[arg10][arg0] = 0;
        int var15 = 0;
        byte var16 = 0;
        field2702[var16] = arg10;
        int var37 = var16 + 1;
        class106.field2419[var16] = arg0;
        int var17 = field2702.length;
        int[][] var18 = class86.field1900[class128.field2817].field611;
        boolean var19 = false;
        while (var15 != var37) {
            var14 = class106.field2419[var15];
            var13 = field2702[var15];
            var15 = (var15 + 1) % var17;
            if (arg9 == var13 && arg8 == var14) {
                var19 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class86.field1900[class128.field2817].method219(arg8, var13, arg11 - 1, (byte) 117, var14, arg9, arg7)) {
                    var19 = true;
                    break;
                }
                if (arg11 < 10 && class86.field1900[class128.field2817].method216(var14, var13, arg8, (byte) 107, arg7, arg11 - 1, arg9)) {
                    var19 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg6 != 0 && class86.field1900[class128.field2817].method222(var13, arg4, arg1, arg6, arg9, arg8, var14, true)) {
                var19 = true;
                break;
            }
            int var35 = class47.field897[var13][var14] + 1;
            if (var13 > 0 && class129.field2847[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                field2702[var37] = var13 - 1;
                class106.field2419[var37] = var14;
                var37 = (var37 + 1) % var17;
                class129.field2847[var13 - 1][var14] = 2;
                class47.field897[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class129.field2847[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                field2702[var37] = var13 + 1;
                class106.field2419[var37] = var14;
                var37 = (var37 + 1) % var17;
                class129.field2847[var13 + 1][var14] = 8;
                class47.field897[var13 + 1][var14] = var35;
            }
            if (var14 > 0 && class129.field2847[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                field2702[var37] = var13;
                class106.field2419[var37] = var14 - 1;
                var37 = (var37 + 1) % var17;
                class129.field2847[var13][var14 - 1] = 1;
                class47.field897[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class129.field2847[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                field2702[var37] = var13;
                class106.field2419[var37] = var14 + 1;
                var37 = (var37 + 1) % var17;
                class129.field2847[var13][var14 + 1] = 4;
                class47.field897[var13][var14 + 1] = var35;
            }
            if (var13 > 0 && var14 > 0 && class129.field2847[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                field2702[var37] = var13 - 1;
                class106.field2419[var37] = var14 - 1;
                class129.field2847[var13 - 1][var14 - 1] = 3;
                var37 = (var37 + 1) % var17;
                class47.field897[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class129.field2847[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                field2702[var37] = var13 + 1;
                class106.field2419[var37] = var14 - 1;
                class129.field2847[var13 + 1][var14 - 1] = 9;
                class47.field897[var13 + 1][var14 - 1] = var35;
                var37 = (var37 + 1) % var17;
            }
            if (var13 > 0 && var14 < 103 && class129.field2847[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                field2702[var37] = var13 - 1;
                class106.field2419[var37] = var14 + 1;
                var37 = (var37 + 1) % var17;
                class129.field2847[var13 - 1][var14 + 1] = 6;
                class47.field897[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class129.field2847[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                field2702[var37] = var13 + 1;
                class106.field2419[var37] = var14 + 1;
                class129.field2847[var13 + 1][var14 + 1] = 12;
                var37 = (var37 + 1) % var17;
                class47.field897[var13 + 1][var14 + 1] = var35;
            }
        }
        class63.field1233 = 0;
        if (!var19) {
            if (!arg3) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg9 - var22; var23 <= arg9 + var22; var23++) {
                for (int var24 = arg8 - var22; var24 <= arg8 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class47.field897[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg9) {
                            var25 = arg9 - var23;
                        } else if (arg9 + arg4 - 1 < var23) {
                            var25 = var23 + 1 - arg9 - arg4;
                        }
                        int var26 = 0;
                        if (arg8 > var24) {
                            var26 = arg8 - var24;
                        } else if (arg6 + arg8 - 1 < var24) {
                            var26 = var24 + 1 - arg6 - arg8;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class47.field897[var23][var24] < var21) {
                            var21 = class47.field897[var23][var24];
                            var13 = var23;
                            var20 = var27;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg10 == var13 && arg0 == var14) {
                return false;
            }
            class63.field1233 = 1;
        }
        byte var28 = 0;
        field2702[var28] = var13;
        int var38 = var28 + 1;
        class106.field2419[var28] = var14;
        int var29;
        int var30 = var29 = class129.field2847[var13][var14];
        while (arg10 != var13 || arg0 != var14) {
            if (var29 != var30) {
                field2702[var38] = var13;
                class106.field2419[var38++] = var14;
                var29 = var30;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class129.field2847[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = field2702[var38];
            int var33 = class106.field2419[var38];
            if (arg2 == 0) {
                class45.field832++;
                class69.field1399.method285(120, (byte) 64);
                class69.field1399.method653(var31 + var31 + 3, 36);
            }
            if (arg2 == 1) {
                class69.field1399.method285(95, (byte) 64);
                class69.field1399.method653(var31 + var31 + 17, arg5 + 14);
                class122.field2733++;
            }
            if (arg2 == 2) {
                class69.field1399.method285(74, (byte) 64);
                class75.field1608++;
                class69.field1399.method653(var31 + var31 + 3, arg5 + -31);
            }
            class69.field1399.method625(arg5 - 206, var33 - -class35.field647);
            class69.field1399.method654(arg5 + 27466, class130.field2863 + var32);
            class69.field1399.method645(class63.field1242[82] ? 1 : 0, 1);
            class82.field1818 = field2702[0];
            class71.field1432 = class106.field2419[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class69.field1399.method653(field2702[var38] - var32, 35);
                class69.field1399.method645(class106.field2419[var38] - var33, arg5 + -5);
            }
            return true;
        } else if (arg2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public static void method950(int arg0) {
        field2700 = null;
        if (arg0 != 31236) {
            return;
        }
        field2701 = null;
        field2702 = null;
        field2704 = null;
        field2703 = null;
        field2708 = null;
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(III)I")
    public static final int method951(int arg0, int arg1, int arg2) {
        field2698++;
        if (arg0 == -1) {
            return 12345678;
        }
        if (arg1 != -1) {
            method950(-116);
        }
        int var3 = (arg0 & 0x7F) * arg2 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
