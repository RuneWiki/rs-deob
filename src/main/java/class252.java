import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class252 {

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[[Z")
    public static boolean[][] field4204 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "[Z")
    public static boolean[] field4211 = new boolean[100];

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Lbd;")
    public static class162 field4215 = class17.method142(0, "<col=ffb000>");

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lbd;")
    public static class162 field4212 = class17.method142(0, "0");

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lbd;")
    public static class162 field4210 = class17.method142(0, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Lbd;")
    public static class162 field4213 = class17.method142(0, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "F")
    public static float field4207;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Lda;")
    public static class143 field4209;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIZIIII)Z", line = 8)
    public static final boolean method1757(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        field4214++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class206.field3484[var12][var13] = 0;
                class72.field1150[var12][var13] = 99999999;
            }
        }
        class206.field3484[arg5][arg0] = 99;
        class72.field1150[arg5][arg0] = 0;
        int var14 = arg0;
        int var15 = arg5;
        if (arg9 <= 116) {
            field4213 = (class162) null;
        }
        byte var16 = 0;
        class112.field2033[var16] = arg5;
        int var32 = var16 + 1;
        class250.field4180[var16] = arg0;
        boolean var17 = false;
        int var18 = 0;
        int[][] var19 = class267.field4473[class157.field2765].field3061;
        while (var32 != var18) {
            var14 = class250.field4180[var18];
            var15 = class112.field2033[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg11 == var15 && arg8 == var14) {
                var17 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class267.field4473[class157.field2765].method1352(arg10, arg11, 2, arg1 - 1, arg8, var14, 1, var15)) {
                    var17 = true;
                    break;
                }
                if (arg1 < 10 && class267.field4473[class157.field2765].method1354(arg1 - 1, arg11, arg8, var15, var14, 128, 2, arg10)) {
                    var17 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg3 != 0 && class267.field4473[class157.field2765].method1366(arg3, arg4, 2, var14, arg6, arg8, (byte) -113, var15, arg11)) {
                var17 = true;
                break;
            }
            int var20 = class72.field1150[var15][var14] + 1;
            if (var15 > 0 && class206.field3484[var15 - 1][var14] == 0 && (var19[var15 - 1][var14] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + 1] & 0x12C0138) == 0) {
                class112.field2033[var32] = var15 - 1;
                class250.field4180[var32] = var14;
                class206.field3484[var15 - 1][var14] = 2;
                class72.field1150[var15 - 1][var14] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && class206.field3484[var15 + 1][var14] == 0 && (var19[var15 + 2][var14] & 0x12C0183) == 0 && (var19[var15 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class112.field2033[var32] = var15 + 1;
                class250.field4180[var32] = var14;
                class206.field3484[var15 + 1][var14] = 8;
                var32 = var32 + 1 & 0xFFF;
                class72.field1150[var15 + 1][var14] = var20;
            }
            if (var14 > 0 && class206.field3484[var15][var14 - 1] == 0 && (var19[var15][var14 - 1] & 0x12C010E) == 0 && (var19[var15 + 1][var14 - 1] & 0x12C0183) == 0) {
                class112.field2033[var32] = var15;
                class250.field4180[var32] = var14 - 1;
                class206.field3484[var15][var14 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class72.field1150[var15][var14 - 1] = var20;
            }
            if (var14 < 102 && class206.field3484[var15][var14 + 1] == 0 && (var19[var15][var14 + 2] & 0x12C0138) == 0 && (var19[var15 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class112.field2033[var32] = var15;
                class250.field4180[var32] = var14 + 1;
                class206.field3484[var15][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class72.field1150[var15][var14 + 1] = var20;
            }
            if (var15 > 0 && var14 > 0 && class206.field3484[var15 - 1][var14 - 1] == 0 && (var19[var15 - 1][var14] & 0x12C0138) == 0 && (var19[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15][var14 - 1] & 0x12C0183) == 0) {
                class112.field2033[var32] = var15 - 1;
                class250.field4180[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class206.field3484[var15 - 1][var14 - 1] = 3;
                class72.field1150[var15 - 1][var14 - 1] = var20;
            }
            if (var15 < 102 && var14 > 0 && class206.field3484[var15 + 1][var14 - 1] == 0 && (var19[var15 + 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15 + 2][var14 - 1] & 0x12C0183) == 0 && (var19[var15 + 2][var14] & 0x12C01E0) == 0) {
                class112.field2033[var32] = var15 + 1;
                class250.field4180[var32] = var14 - 1;
                class206.field3484[var15 + 1][var14 - 1] = 9;
                class72.field1150[var15 + 1][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 > 0 && var14 < 102 && class206.field3484[var15 - 1][var14 + 1] == 0 && (var19[var15 - 1][var14 + 1] & 0x12C010E) == 0 && (var19[var15 - 1][var14 + 2] & 0x12C0138) == 0 && (var19[var15][var14 + 2] & 0x12C01E0) == 0) {
                class112.field2033[var32] = var15 - 1;
                class250.field4180[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class206.field3484[var15 - 1][var14 + 1] = 6;
                class72.field1150[var15 - 1][var14 + 1] = var20;
            }
            if (var15 < 102 && var14 < 102 && class206.field3484[var15 + 1][var14 + 1] == 0 && (var19[var15 + 1][var14 + 2] & 0x12C0138) == 0 && (var19[var15 + 2][var14 + 2] & 0x12C01E0) == 0 && (var19[var15 + 2][var14 + 1] & 0x12C0183) == 0) {
                class112.field2033[var32] = var15 + 1;
                class250.field4180[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class206.field3484[var15 + 1][var14 + 1] = 12;
                class72.field1150[var15 + 1][var14 + 1] = var20;
            }
        }
        class92.field1629 = 0;
        if (!var17) {
            if (!arg7) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg11 - var23; var24 <= (arg11 + var23); var24++) {
                for (int var25 = arg8 - var23; var25 <= arg8 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class72.field1150[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg11 > var24) {
                            var26 = arg11 - var24;
                        } else if (var24 > (arg4 + arg11 - 1)) {
                            var26 = var24 + 1 - arg4 - arg11;
                        }
                        int var27 = 0;
                        if (arg8 > var25) {
                            var27 = arg8 - var25;
                        } else if (var25 > (arg3 + arg8 - 1)) {
                            var27 = var25 + 1 - arg3 - arg8;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var22 > class72.field1150[var24][var25]) {
                            var21 = var28;
                            var15 = var24;
                            var22 = class72.field1150[var24][var25];
                            var14 = var25;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg5 == var15 && arg0 == var14) {
                return false;
            }
            class92.field1629 = 1;
        }
        byte var29 = 0;
        class112.field2033[var29] = var15;
        int var33 = var29 + 1;
        class250.field4180[var29] = var14;
        int var30;
        int var31 = var30 = class206.field3484[var15][var14];
        while (arg5 != var15 || arg0 != var14) {
            if (var30 != var31) {
                class112.field2033[var33] = var15;
                var30 = var31;
                class250.field4180[var33++] = var14;
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
            var31 = class206.field3484[var15][var14];
        }
        if (var33 > 0) {
            class50.method365(98, var33, arg2);
            return true;
        } else if (arg2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 458)
    public static void method1758(byte arg0) {
        field4213 = null;
        field4204 = (boolean[][]) null;
        field4211 = null;
        field4215 = null;
        field4209 = null;
        int var1 = 48 % ((-arg0 - 61) / 55);
        field4212 = null;
        field4210 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLda;IIIZ)V", line = 503)
    public static final void method1759(byte arg0, class143 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field4206++;
        class126.field2295 = arg2;
        class207.field3500 = arg3;
        class9.field105 = 1;
        if (arg0 != -56) {
            field4208 = -96;
        }
        class311.field5199 = 10000;
        class102.field1864 = arg4;
        class314.field5297 = arg5;
        class34.field548 = arg1;
    }
}
