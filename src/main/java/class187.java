import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class187 extends class231 {

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Lbb;")
    public static class49 field2989 = new class49();

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "F")
    public static float field2993 = 128.0F;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
    public static volatile int field2996 = 0;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "Lgg;")
    public static class149 field2995;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "Laj;")
    public static class151 field2997;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lvh;")
    public class187 field2985;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "Lvh;")
    public class187 field2990;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "[Lsj;")
    public static class208[] field2992;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIZIIIIIIB)V")
    public static final void method1350(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var27 = 0; var27 < 104; var27++) {
                class228.field3857[var11][var27] = 0;
                class77.field1308[var11][var27] = 99999999;
            }
        }
        int var12 = arg2;
        field2991++;
        class228.field3857[arg2][arg9] = 99;
        class77.field1308[arg2][arg9] = 0;
        if (arg10 != 30) {
            return;
        }
        int var13 = arg9;
        byte var14 = 0;
        class15.field311[var14] = arg2;
        int var15 = 0;
        int var28 = var14 + 1;
        class69.field1155[var14] = arg9;
        int[][] var16 = class225.field3790[class182.field2898].field5006;
        boolean var17 = false;
        while (var28 != var15) {
            var13 = class69.field1155[var15];
            var12 = class15.field311[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg0 == var12 && arg4 == var13) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class225.field3790[class182.field2898].method2094(arg7, arg0, arg4, var13, 2, var12, (byte) -94, arg5 - 1)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && class225.field3790[class182.field2898].method2105(var12, (byte) 119, arg7, arg4, 2, arg0, arg5 - 1, var13)) {
                    var17 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg1 != 0 && class225.field3790[class182.field2898].method2103(var13, arg1, (byte) 17, arg0, arg4, arg8, 2, arg6, var12)) {
                var17 = true;
                break;
            }
            int var26 = class77.field1308[var12][var13] + 1;
            if (var12 > 0 && class228.field3857[var12 - 1][var13] == 0 && (var16[var12 - 1][var13] & 0x2C010E) == 0 && (var16[var12 - 1][var13 + 1] & 0x2C0138) == 0) {
                class15.field311[var28] = var12 - 1;
                class69.field1155[var28] = var13;
                var28 = var28 + 1 & 0xFFF;
                class228.field3857[var12 - 1][var13] = 2;
                class77.field1308[var12 - 1][var13] = var26;
            }
            if (var12 < 102 && class228.field3857[var12 + 1][var13] == 0 && (var16[var12 + 2][var13] & 0x2C0183) == 0 && (var16[var12 + 2][var13 + 1] & 0x2C01E0) == 0) {
                class15.field311[var28] = var12 + 1;
                class69.field1155[var28] = var13;
                var28 = var28 + 1 & 0xFFF;
                class228.field3857[var12 + 1][var13] = 8;
                class77.field1308[var12 + 1][var13] = var26;
            }
            if (var13 > 0 && class228.field3857[var12][var13 - 1] == 0 && (var16[var12][var13 - 1] & 0x2C010E) == 0 && (var16[var12 + 1][var13 - 1] & 0x2C0183) == 0) {
                class15.field311[var28] = var12;
                class69.field1155[var28] = var13 - 1;
                var28 = var28 + 1 & 0xFFF;
                class228.field3857[var12][var13 - 1] = 1;
                class77.field1308[var12][var13 - 1] = var26;
            }
            if (var13 < 102 && class228.field3857[var12][var13 + 1] == 0 && (var16[var12][var13 + 2] & 0x2C0138) == 0 && (var16[var12 + 1][var13 + 2] & 0x2C01E0) == 0) {
                class15.field311[var28] = var12;
                class69.field1155[var28] = var13 + 1;
                class228.field3857[var12][var13 + 1] = 4;
                class77.field1308[var12][var13 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 > 0 && var13 > 0 && class228.field3857[var12 - 1][var13 - 1] == 0 && (var16[var12 - 1][var13] & 0x2C013E) == 0 && (var16[var12 - 1][var13 - 1] & 0x2C010E) == 0 && (var16[var12][var13 - 1] & 0x2C018F) == 0) {
                class15.field311[var28] = var12 - 1;
                class69.field1155[var28] = var13 - 1;
                class228.field3857[var12 - 1][var13 - 1] = 3;
                class77.field1308[var12 - 1][var13 - 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 < 102 && var13 > 0 && class228.field3857[var12 + 1][var13 - 1] == 0 && (var16[var12 + 1][var13 - 1] & 0x2C018F) == 0 && (var16[var12 + 2][var13 - 1] & 0x2C0183) == 0 && (var16[var12 + 2][var13] & 0x2C01E3) == 0) {
                class15.field311[var28] = var12 + 1;
                class69.field1155[var28] = var13 - 1;
                class228.field3857[var12 + 1][var13 - 1] = 9;
                var28 = var28 + 1 & 0xFFF;
                class77.field1308[var12 + 1][var13 - 1] = var26;
            }
            if (var12 > 0 && var13 < 102 && class228.field3857[var12 - 1][var13 + 1] == 0 && (var16[var12 - 1][var13 + 1] & 0x2C013E) == 0 && (var16[var12 - 1][var13 + 2] & 0x2C0138) == 0 && (var16[var12][var13 + 2] & 0x2C01F8) == 0) {
                class15.field311[var28] = var12 - 1;
                class69.field1155[var28] = var13 + 1;
                class228.field3857[var12 - 1][var13 + 1] = 6;
                class77.field1308[var12 - 1][var13 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 < 102 && var13 < 102 && class228.field3857[var12 + 1][var13 + 1] == 0 && (var16[var12 + 1][var13 + 2] & 0x2C01F8) == 0 && (var16[var12 + 2][var13 + 2] & 0x2C01E0) == 0 && (var16[var12 + 2][var13 + 1] & 0x2C01E3) == 0) {
                class15.field311[var28] = var12 + 1;
                class69.field1155[var28] = var13 + 1;
                class228.field3857[var12 + 1][var13 + 1] = 12;
                class77.field1308[var12 + 1][var13 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
        }
        if (!var17) {
            if (!arg3) {
                return;
            }
            int var18 = 1000;
            int var19 = 100;
            byte var20 = 10;
            for (int var21 = arg0 - var20; var21 <= (arg0 + var20); var21++) {
                for (int var22 = arg4 - var20; var22 <= arg4 + var20; var22++) {
                    if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && class77.field1308[var21][var22] < 100) {
                        int var23 = 0;
                        if (arg0 > var21) {
                            var23 = arg0 - var21;
                        } else if (arg0 + arg8 - 1 < var21) {
                            var23 = var21 - arg8 - (arg0 - 1);
                        }
                        int var24 = 0;
                        if (arg4 > var22) {
                            var24 = arg4 - var22;
                        } else if (arg1 + arg4 - 1 < var22) {
                            var24 = var22 + 1 - (arg1 + arg4);
                        }
                        int var25 = var23 * var23 + var24 * var24;
                        if (var18 > var25 || var18 == var25 && var19 > class77.field1308[var21][var22]) {
                            var13 = var22;
                            var18 = var25;
                            var12 = var21;
                            var19 = class77.field1308[var21][var22];
                        }
                    }
                }
            }
            if (var18 == 1000) {
                return;
            }
            if (arg2 == var12 && arg9 == var13) {
                return;
            }
        }
        class130.field2149 = false;
        class163.field2661 = var13;
        class133.field2194 = var12;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIILhg;BIII)V")
    public static final void method1351(int arg0, int arg1, int arg2, class207 arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2987++;
        if (class179.field2861) {
            class194.field3112 = 32;
        } else {
            class194.field3112 = 0;
        }
        int var8 = 118 % ((arg4 + 62) / 61);
        class179.field2861 = false;
        if (class171.field2763 != 0) {
            if (arg6 <= arg2 && arg2 < (arg6 + 16) && arg7 <= arg5 && arg5 < (arg7 + 16)) {
                arg3.field3374 -= 4;
                class206.method1441(0, arg3);
            } else if (arg2 >= arg6 && arg6 + 16 > arg2 && arg5 >= arg1 + arg7 - 16 && arg1 + arg7 > arg5) {
                arg3.field3374 += 4;
                class206.method1441(0, arg3);
            } else if (arg2 >= arg6 - class194.field3112 && class194.field3112 + arg6 + 16 > arg2 && arg5 >= arg7 + 16 && arg5 < arg1 + arg7 - 16) {
                int var9 = (arg1 - 32) * arg1 / arg0;
                if (var9 < 8) {
                    var9 = 8;
                }
                int var10 = arg5 - arg7 - (var9 / 2) - 16;
                int var11 = arg1 - var9 - 32;
                arg3.field3374 = (arg0 - arg1) * var10 / var11;
                class206.method1441(0, arg3);
                class179.field2861 = true;
            }
        }
        if (class228.field3855 == 0) {
            return;
        }
        int var12 = arg3.field3484;
        if ((arg6 - var12) <= arg2 && arg7 <= arg5 && arg2 < arg6 + 16 && arg5 <= (arg7 + arg1)) {
            arg3.field3374 += class228.field3855 * 45;
            class206.method1441(0, arg3);
            return;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public final void method1352(byte arg0) {
        if (arg0 != -55) {
            return;
        }
        field2986++;
        if (this.field2990 != null) {
            this.field2990.field2985 = this.field2985;
            this.field2985.field2990 = this.field2990;
            this.field2985 = null;
            this.field2990 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
    public static void method1353(int arg0) {
        field2995 = null;
        field2997 = null;
        if (arg0 != -11873) {
            field2994 = 126;
        }
        field2989 = null;
        field2992 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIB)I")
    public static final int method1354(int arg0, int arg1, int arg2, byte arg3) {
        field2988++;
        if ((class67.field1132[arg1][arg2][arg0] & 0x8) == 0) {
            if (arg3 > -103) {
                method1354(95, -40, -93, (byte) -77);
            }
            return arg1 <= 0 || (class67.field1132[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }
}
