import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class49 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lkd;")
    private static class73 field1302 = class126.method1070((byte) -66, "Login server offline)3");

    @OriginalMember(owner = "client!h", name = "c", descriptor = "Lkd;")
    public static class73 field1303 = field1302;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[I")
    public static int[] field1301 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field1308 = 0;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "[J")
    public static long[] field1305 = new long[200];

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lkd;")
    public static class73 field1306 = class126.method1070((byte) -66, "backright2");

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method393(int arg0) {
        int var1 = -51 / ((arg0 - 15) / 47);
        field1305 = null;
        field1301 = null;
        field1302 = null;
        field1303 = null;
        field1306 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public static final boolean method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        field1310++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class107.field2653[var12][var36] = 0;
                class98.field2451[var12][var36] = 99999999;
            }
        }
        class107.field2653[arg0][arg4] = 99;
        int var13 = arg0;
        byte var14 = 0;
        class98.field2451[arg0][arg4] = 0;
        int var15 = arg4;
        class120.field3070[var14] = arg0;
        int var37 = var14 + 1;
        class55.field1483[var14] = arg4;
        int var16 = 0;
        if (arg5 != -1) {
            return false;
        }
        boolean var17 = false;
        int var18 = class120.field3070.length;
        int[][] var19 = class70.field1780[class11.field320].field1249;
        while (var37 != var16) {
            var13 = class120.field3070[var16];
            var15 = class55.field1483[var16];
            var16 = (var16 + 1) % var18;
            if (arg7 == var13 && arg8 == var15) {
                var17 = true;
                break;
            }
            if (arg2 != 0) {
                if ((arg2 < 5 || arg2 == 10) && class70.field1780[class11.field320].method382(arg1, 12283, var15, arg7, var13, arg2 - 1, arg8)) {
                    var17 = true;
                    break;
                }
                if (arg2 < 10 && class70.field1780[class11.field320].method367(arg7, arg8, arg1, 9313, arg2 - 1, var13, var15)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg10 != 0 && class70.field1780[class11.field320].method375(var13, arg8, var15, -24381, arg9, arg3, arg10, arg7)) {
                var17 = true;
                break;
            }
            int var35 = class98.field2451[var13][var15] + 1;
            if (var13 > 0 && class107.field2653[var13 - 1][var15] == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0) {
                class120.field3070[var37] = var13 - 1;
                class55.field1483[var37] = var15;
                class107.field2653[var13 - 1][var15] = 2;
                class98.field2451[var13 - 1][var15] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && class107.field2653[var13 + 1][var15] == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0) {
                class120.field3070[var37] = var13 + 1;
                class55.field1483[var37] = var15;
                var37 = (var37 + 1) % var18;
                class107.field2653[var13 + 1][var15] = 8;
                class98.field2451[var13 + 1][var15] = var35;
            }
            if (var15 > 0 && class107.field2653[var13][var15 - 1] == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class120.field3070[var37] = var13;
                class55.field1483[var37] = var15 - 1;
                class107.field2653[var13][var15 - 1] = 1;
                class98.field2451[var13][var15 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var15 < 103 && class107.field2653[var13][var15 + 1] == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class120.field3070[var37] = var13;
                class55.field1483[var37] = var15 + 1;
                var37 = (var37 + 1) % var18;
                class107.field2653[var13][var15 + 1] = 4;
                class98.field2451[var13][var15 + 1] = var35;
            }
            if (var13 > 0 && var15 > 0 && class107.field2653[var13 - 1][var15 - 1] == 0 && (var19[var13 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class120.field3070[var37] = var13 - 1;
                class55.field1483[var37] = var15 - 1;
                class107.field2653[var13 - 1][var15 - 1] = 3;
                var37 = (var37 + 1) % var18;
                class98.field2451[var13 - 1][var15 - 1] = var35;
            }
            if (var13 < 103 && var15 > 0 && class107.field2653[var13 + 1][var15 - 1] == 0 && (var19[var13 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class120.field3070[var37] = var13 + 1;
                class55.field1483[var37] = var15 - 1;
                class107.field2653[var13 + 1][var15 - 1] = 9;
                class98.field2451[var13 + 1][var15 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && var15 < 103 && class107.field2653[var13 - 1][var15 + 1] == 0 && (var19[var13 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class120.field3070[var37] = var13 - 1;
                class55.field1483[var37] = var15 + 1;
                class107.field2653[var13 - 1][var15 + 1] = 6;
                var37 = (var37 + 1) % var18;
                class98.field2451[var13 - 1][var15 + 1] = var35;
            }
            if (var13 < 103 && var15 < 103 && class107.field2653[var13 + 1][var15 + 1] == 0 && (var19[var13 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class120.field3070[var37] = var13 + 1;
                class55.field1483[var37] = var15 + 1;
                class107.field2653[var13 + 1][var15 + 1] = 12;
                class98.field2451[var13 + 1][var15 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
        }
        class150.field3710 = 0;
        if (!var17) {
            if (!arg11) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg7 - var21; var23 <= arg7 + var21; var23++) {
                for (int var24 = arg8 - var21; var24 <= arg8 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class98.field2451[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg7 > var23) {
                            var25 = arg7 - var23;
                        } else if (arg7 + arg3 - 1 < var23) {
                            var25 = var23 + 1 - arg7 - arg3;
                        }
                        int var26 = 0;
                        if (arg8 > var24) {
                            var26 = arg8 - var24;
                        } else if (var24 > arg8 + arg10 - 1) {
                            var26 = var24 + 1 - arg10 - arg8;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var22 > class98.field2451[var23][var24]) {
                            var15 = var24;
                            var20 = var27;
                            var22 = class98.field2451[var23][var24];
                            var13 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg0 == var13 && arg4 == var15) {
                return false;
            }
            class150.field3710 = 1;
        }
        byte var28 = 0;
        class120.field3070[var28] = var13;
        int var38 = var28 + 1;
        class55.field1483[var28] = var15;
        int var29;
        int var30 = var29 = class107.field2653[var13][var15];
        while (arg0 != var13 || arg4 != var15) {
            if (var29 != var30) {
                class120.field3070[var38] = var13;
                var29 = var30;
                class55.field1483[var38++] = var15;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class107.field2653[var13][var15];
        }
        if (var38 > 0) {
            int var31 = var38--;
            if (var31 > 25) {
                var31 = 25;
            }
            int var32 = class120.field3070[var38];
            int var33 = class55.field1483[var38];
            if (arg6 == 0) {
                class42.field1107++;
                class121.field3079.method1215(109, 73);
                class121.field3079.method956((byte) 10, var31 + var31 + 3);
            }
            if (arg6 == 1) {
                class121.field3079.method1215(-50, 192);
                class22.field627++;
                class121.field3079.method956((byte) 10, var31 + var31 + 3 + 14);
            }
            if (arg6 == 2) {
                class30.field854++;
                class121.field3079.method1215(-26, 30);
                class121.field3079.method956((byte) 10, var31 + var31 + 3);
            }
            class121.field3079.method949((byte) 61, class73.field1895[82] ? 1 : 0);
            class121.field3079.method965(class80.field2029 + var32, 114);
            class38.field1037 = class120.field3070[0];
            class34.field925 = class55.field1483[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class121.field3079.method971(0, class120.field3070[var38] - var32);
                class121.field3079.method949((byte) 103, class55.field1483[var38] - var33);
            }
            class121.field3079.method947(var33 + class121.field3093, arg5 + 23662);
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IILq;I)Lde;")
    public static final class27 method395(int arg0, int arg1, class111 arg2, int arg3) {
        if (arg3 <= 16) {
            return null;
        } else {
            field1304++;
            return class140.method1142(arg0, arg1, -118, arg2) ? class122.method1043((byte) -81) : null;
        }
    }
}
