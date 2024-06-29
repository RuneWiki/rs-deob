import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class8 extends class248 {

    @OriginalMember(owner = "client!j", name = "z", descriptor = "[B")
    public byte[] field119;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "Lij;")
    public static class50 field123 = class78.method578(125, "overlay2)3dat");

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field114 = 0;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "Lij;")
    private static class50 field122 = class78.method578(125, "flash3:");

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Lij;")
    public static class50 field116 = class78.method578(127, "weiss:");

    @OriginalMember(owner = "client!j", name = "y", descriptor = "Lij;")
    public static class50 field118 = field122;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "Lij;")
    public static class50 field125 = class78.method578(125, "::rect_debug");

    @OriginalMember(owner = "client!j", name = "H", descriptor = "Lij;")
    public static class50 field127 = field122;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Lkh;")
    public static class247 field115 = new class247();

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Lha;")
    public static final class62 method48(int arg0, int arg1) {
        field124++;
        class62 var2 = (class62) class222.field3733.method764((byte) 70, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -21178) {
            method52(-76, -85, (byte) -28, 117, 55, -77, -69, true, 71, -6, -73, -115);
        }
        byte[] var3 = class235.field3928.method190((byte) -30, class175.method1203(arg1, (byte) -125), class133.method933(84, arg1));
        class62 var4 = new class62();
        var4.field1142 = arg1;
        if (var3 != null) {
            var4.method473(-123, new class217(var3));
        }
        var4.method479(126);
        class222.field3733.method765((byte) -127, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLij;)Lbi;")
    public static final class129 method49(boolean arg0, class50 arg1) {
        field126++;
        if (arg1.method396(1) == 0) {
            return null;
        }
        for (class129 var2 = (class129) class172.field2858.method689(1001); var2 != null; var2 = (class129) class172.field2858.method688(-95)) {
            if (var2.field2263.method407(-128, arg1)) {
                return var2;
            }
        }
        if (!arg0) {
            method52(80, -54, (byte) 116, 70, 78, 81, -6, true, -110, 19, -116, 0);
        }
        return null;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)V")
    public static void method50(int arg0) {
        field116 = null;
        field118 = null;
        field123 = null;
        field125 = null;
        field127 = null;
        if (arg0 != 28362) {
            field123 = null;
        }
        field122 = null;
        field115 = null;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "([B)V")
    public class8(byte[] arg0) {
        this.field119 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)V")
    public static final void method51(byte arg0, int arg1) {
        field121++;
        if (arg0 == -127) {
            class222.field3733.method770(true, arg1);
            class109.field1945.method770(true, arg1);
            class5.field62.method770(true, arg1);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIBIIIIZIIII)Z")
    public static final boolean method52(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field117++;
        if (arg2 < 38) {
            return false;
        }
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class229.field3849[var12][var31] = 0;
                class116.field2023[var12][var31] = 99999999;
            }
        }
        class229.field3849[arg10][arg9] = 99;
        int var13 = arg9;
        int var14 = arg10;
        int var15 = 0;
        byte var16 = 0;
        class116.field2023[arg10][arg9] = 0;
        boolean var17 = false;
        class101.field1857[var16] = arg10;
        int var32 = var16 + 1;
        class20.field429[var16] = arg9;
        int[][] var18 = class45.field826[class201.field3312].field814;
        while (var15 != var32) {
            var14 = class101.field1857[var15];
            var13 = class20.field429[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg4 == var14 && arg8 == var13) {
                var17 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class45.field826[class201.field3312].method331(1, arg4, arg11, arg8, arg1 - 1, (byte) -117, var14, var13)) {
                    var17 = true;
                    break;
                }
                if (arg1 < 10 && class45.field826[class201.field3312].method326(var14, arg11, 1, arg8, var13, arg4, arg1 - 1, (byte) 59)) {
                    var17 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg0 != 0 && class45.field826[class201.field3312].method334(arg3, var13, 1, arg8, arg0, 17436672, var14, arg4, arg6)) {
                var17 = true;
                break;
            }
            int var30 = class116.field2023[var14][var13] + 1;
            if (var14 > 0 && class229.field3849[var14 - 1][var13] == 0 && (var18[var14 - 1][var13] & 0x12C0108) == 0) {
                class101.field1857[var32] = var14 - 1;
                class20.field429[var32] = var13;
                var32 = var32 + 1 & 0xFFF;
                class229.field3849[var14 - 1][var13] = 2;
                class116.field2023[var14 - 1][var13] = var30;
            }
            if (var14 < 103 && class229.field3849[var14 + 1][var13] == 0 && (var18[var14 + 1][var13] & 0x12C0180) == 0) {
                class101.field1857[var32] = var14 + 1;
                class20.field429[var32] = var13;
                var32 = var32 + 1 & 0xFFF;
                class229.field3849[var14 + 1][var13] = 8;
                class116.field2023[var14 + 1][var13] = var30;
            }
            if (var13 > 0 && class229.field3849[var14][var13 - 1] == 0 && (var18[var14][var13 - 1] & 0x12C0102) == 0) {
                class101.field1857[var32] = var14;
                class20.field429[var32] = var13 - 1;
                class229.field3849[var14][var13 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class116.field2023[var14][var13 - 1] = var30;
            }
            if (var13 < 103 && class229.field3849[var14][var13 + 1] == 0 && (var18[var14][var13 + 1] & 0x12C0120) == 0) {
                class101.field1857[var32] = var14;
                class20.field429[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class229.field3849[var14][var13 + 1] = 4;
                class116.field2023[var14][var13 + 1] = var30;
            }
            if (var14 > 0 && var13 > 0 && class229.field3849[var14 - 1][var13 - 1] == 0 && (var18[var14 - 1][var13 - 1] & 0x12C010E) == 0 && (var18[var14 - 1][var13] & 0x12C0108) == 0 && (var18[var14][var13 - 1] & 0x12C0102) == 0) {
                class101.field1857[var32] = var14 - 1;
                class20.field429[var32] = var13 - 1;
                class229.field3849[var14 - 1][var13 - 1] = 3;
                class116.field2023[var14 - 1][var13 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && var13 > 0 && class229.field3849[var14 + 1][var13 - 1] == 0 && (var18[var14 + 1][var13 - 1] & 0x12C0183) == 0 && (var18[var14 + 1][var13] & 0x12C0180) == 0 && (var18[var14][var13 - 1] & 0x12C0102) == 0) {
                class101.field1857[var32] = var14 + 1;
                class20.field429[var32] = var13 - 1;
                class229.field3849[var14 + 1][var13 - 1] = 9;
                class116.field2023[var14 + 1][var13 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var13 < 103 && class229.field3849[var14 - 1][var13 + 1] == 0 && (var18[var14 - 1][var13 + 1] & 0x12C0138) == 0 && (var18[var14 - 1][var13] & 0x12C0108) == 0 && (var18[var14][var13 + 1] & 0x12C0120) == 0) {
                class101.field1857[var32] = var14 - 1;
                class20.field429[var32] = var13 + 1;
                class229.field3849[var14 - 1][var13 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class116.field2023[var14 - 1][var13 + 1] = var30;
            }
            if (var14 < 103 && var13 < 103 && class229.field3849[var14 + 1][var13 + 1] == 0 && (var18[var14 + 1][var13 + 1] & 0x12C01E0) == 0 && (var18[var14 + 1][var13] & 0x12C0180) == 0 && (var18[var14][var13 + 1] & 0x12C0120) == 0) {
                class101.field1857[var32] = var14 + 1;
                class20.field429[var32] = var13 + 1;
                class229.field3849[var14 + 1][var13 + 1] = 12;
                class116.field2023[var14 + 1][var13 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class57.field1026 = 0;
        if (!var17) {
            if (!arg7) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg4 - var21; var22 <= (arg4 + var21); var22++) {
                for (int var23 = arg8 - var21; var23 <= arg8 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class116.field2023[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 < arg4) {
                            var24 = arg4 - var22;
                        } else if ((arg6 + arg4 - 1) < var22) {
                            var24 = var22 + 1 - arg4 - arg6;
                        }
                        int var25 = 0;
                        if (arg8 > var23) {
                            var25 = arg8 - var23;
                        } else if (arg0 + arg8 - 1 < var23) {
                            var25 = 1 - (arg8 + arg0 - var23);
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var20 || var20 == var26 && class116.field2023[var22][var23] < var19) {
                            var20 = var26;
                            var14 = var22;
                            var13 = var23;
                            var19 = class116.field2023[var22][var23];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg10 == var14 && arg9 == var13) {
                return false;
            }
            class57.field1026 = 1;
        }
        byte var27 = 0;
        class101.field1857[var27] = var14;
        int var33 = var27 + 1;
        class20.field429[var27] = var13;
        int var28;
        int var29 = var28 = class229.field3849[var14][var13];
        while (arg10 != var14 || arg9 != var13) {
            if (var28 != var29) {
                class101.field1857[var33] = var14;
                var28 = var29;
                class20.field429[var33++] = var13;
            }
            if ((var29 & 0x1) != 0) {
                var13++;
            } else if ((var29 & 0x4) != 0) {
                var13--;
            }
            if ((var29 & 0x2) != 0) {
                var14++;
            } else if ((var29 & 0x8) != 0) {
                var14--;
            }
            var29 = class229.field3849[var14][var13];
        }
        if (var33 > 0) {
            class57.method449(arg5, var33, (byte) -116);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static final void method53(byte arg0) {
        field120++;
        class39 var1 = (class39) class22.field508.method689(1001);
        if (arg0 != 51) {
            return;
        }
        while (var1 != null) {
            class59 var2 = var1.field726;
            if (class201.field3312 != var2.field1052 || var2.field1068 < class244.field4245) {
                var1.method267(arg0 ^ 0xFFFFFFE6);
            } else if (class244.field4245 >= var2.field1085) {
                if (var2.field1074 > 0) {
                    class53 var3 = class41.field764[var2.field1074 - 1];
                    if (var3 != null && var3.field3990 >= 0 && var3.field3990 < 13312 && var3.field4027 >= 0 && var3.field4027 < 13312) {
                        var2.method459((byte) 11, var3.field3990, class244.field4245, class187.method1260((byte) 23, var3.field3990, var3.field4027, var2.field1052) - var2.field1069, var3.field4027);
                    }
                }
                if (var2.field1074 < 0) {
                    int var4 = -var2.field1074 - 1;
                    class187 var5;
                    if (class240.field4124 == var4) {
                        var5 = class239.field4067;
                    } else {
                        var5 = class71.field1370[var4];
                    }
                    if (var5 != null && var5.field3990 >= 0 && var5.field3990 < 13312 && var5.field4027 >= 0 && var5.field4027 < 13312) {
                        var2.method459((byte) 11, var5.field3990, class244.field4245, class187.method1260((byte) 21, var5.field3990, var5.field4027, var2.field1052) - var2.field1069, var5.field4027);
                    }
                }
                var2.method460(class55.field988, 0);
                class61.method470(class201.field3312, (int) var2.field1082, (int) var2.field1050, (int) var2.field1054, 60, var2, var2.field1077, -1L, false);
            }
            var1 = (class39) class22.field508.method688(-60);
        }
    }
}
