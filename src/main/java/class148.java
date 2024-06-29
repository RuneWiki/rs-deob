import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class148 {

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    public static int field2665 = -1;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "Lha;")
    private static class46 field2662 = class271.method1828("wave2:", -46);

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Lha;")
    public static class46 field2664 = field2662;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Lha;")
    public static class46 field2660 = field2662;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lpi;")
    public static class181 field2661;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIBIIZIIIII)Z")
    public static final boolean method1095(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var32 = 0; var32 < 104; var32++) {
                class112.field2120[var12][var32] = 0;
                class247.field4370[var12][var32] = 99999999;
            }
        }
        field2659++;
        class112.field2120[arg4][arg0] = 99;
        int var13 = arg4;
        class247.field4370[arg4][arg0] = 0;
        int var14 = arg0;
        int var15 = 69 % (arg3 / 57);
        boolean var16 = false;
        int var17 = 0;
        byte var18 = 0;
        class162.field2877[var18] = arg4;
        int var33 = var18 + 1;
        class96.field1794[var18] = arg0;
        int[][] var19 = class183.field3282[class135.field2450].field2718;
        while (var17 != var33) {
            var13 = class162.field2877[var17];
            var14 = class96.field1794[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg1 == var13 && arg9 == var14) {
                var16 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class183.field3282[class135.field2450].method1127(arg1, false, arg10 - 1, 2, var13, arg9, arg8, var14)) {
                    var16 = true;
                    break;
                }
                if (arg10 < 10 && class183.field3282[class135.field2450].method1121((byte) 31, arg9, var13, var14, arg10 - 1, arg8, arg1, 2)) {
                    var16 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg5 != 0 && class183.field3282[class135.field2450].method1117(arg5, arg2, arg11, 2, false, var13, arg9, arg1, var14)) {
                var16 = true;
                break;
            }
            int var31 = class247.field4370[var13][var14] + 1;
            if (var13 > 0 && class112.field2120[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C010E) == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class162.field2877[var33] = var13 - 1;
                class96.field1794[var33] = var14;
                class112.field2120[var13 - 1][var14] = 2;
                var33 = var33 + 1 & 0xFFF;
                class247.field4370[var13 - 1][var14] = var31;
            }
            if (var13 < 102 && class112.field2120[var13 + 1][var14] == 0 && (var19[var13 + 2][var14] & 0x12C0183) == 0 && (var19[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class162.field2877[var33] = var13 + 1;
                class96.field1794[var33] = var14;
                var33 = var33 + 1 & 0xFFF;
                class112.field2120[var13 + 1][var14] = 8;
                class247.field4370[var13 + 1][var14] = var31;
            }
            if (var14 > 0 && class112.field2120[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C010E) == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class162.field2877[var33] = var13;
                class96.field1794[var33] = var14 - 1;
                var33 = var33 + 1 & 0xFFF;
                class112.field2120[var13][var14 - 1] = 1;
                class247.field4370[var13][var14 - 1] = var31;
            }
            if (var14 < 102 && class112.field2120[var13][var14 + 1] == 0 && (var19[var13][var14 + 2] & 0x12C0138) == 0 && (var19[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class162.field2877[var33] = var13;
                class96.field1794[var33] = var14 + 1;
                class112.field2120[var13][var14 + 1] = 4;
                class247.field4370[var13][var14 + 1] = var31;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 > 0 && class112.field2120[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14] & 0x12C0138) == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13][var14 - 1] & 0x12C0183) == 0) {
                class162.field2877[var33] = var13 - 1;
                class96.field1794[var33] = var14 - 1;
                class112.field2120[var13 - 1][var14 - 1] = 3;
                class247.field4370[var13 - 1][var14 - 1] = var31;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 > 0 && class112.field2120[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 2][var14] & 0x12C01E0) == 0) {
                class162.field2877[var33] = var13 + 1;
                class96.field1794[var33] = var14 - 1;
                var33 = var33 + 1 & 0xFFF;
                class112.field2120[var13 + 1][var14 - 1] = 9;
                class247.field4370[var13 + 1][var14 - 1] = var31;
            }
            if (var13 > 0 && var14 < 102 && class112.field2120[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var19[var13][var14 + 2] & 0x12C01E0) == 0) {
                class162.field2877[var33] = var13 - 1;
                class96.field1794[var33] = var14 + 1;
                class112.field2120[var13 - 1][var14 + 1] = 6;
                class247.field4370[var13 - 1][var14 + 1] = var31;
                var33 = var33 + 1 & 0xFFF;
            }
            if (var13 < 102 && var14 < 102 && class112.field2120[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var19[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var19[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class162.field2877[var33] = var13 + 1;
                class96.field1794[var33] = var14 + 1;
                class112.field2120[var13 + 1][var14 + 1] = 12;
                var33 = var33 + 1 & 0xFFF;
                class247.field4370[var13 + 1][var14 + 1] = var31;
            }
        }
        class200.field3575 = 0;
        if (!var16) {
            if (!arg6) {
                return false;
            }
            byte var20 = 10;
            int var21 = 100;
            int var22 = 1000;
            for (int var23 = arg1 - var20; var23 <= (arg1 + var20); var23++) {
                for (int var24 = arg9 - var20; var24 <= arg9 + var20; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class247.field4370[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg9) {
                            var26 = arg9 - var24;
                        } else if (arg5 + arg9 - 1 < var24) {
                            var26 = var24 + 1 - arg5 - arg9;
                        }
                        if (var23 < arg1) {
                            var25 = arg1 - var23;
                        } else if (arg1 + arg2 - 1 < var23) {
                            var25 = var23 + 1 - arg1 - arg2;
                        }
                        int var27 = var25 * var25 + (var26 * var26);
                        if (var22 > var27 || var22 == var27 && var21 > class247.field4370[var23][var24]) {
                            var21 = class247.field4370[var23][var24];
                            var14 = var24;
                            var13 = var23;
                            var22 = var27;
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (arg4 == var13 && arg0 == var14) {
                return false;
            }
            class200.field3575 = 1;
        }
        byte var28 = 0;
        class162.field2877[var28] = var13;
        int var34 = var28 + 1;
        class96.field1794[var28] = var14;
        int var29;
        int var30 = var29 = class112.field2120[var13][var14];
        while (arg4 != var13 || arg0 != var14) {
            if (var29 != var30) {
                var29 = var30;
                class162.field2877[var34] = var13;
                class96.field1794[var34++] = var14;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            var30 = class112.field2120[var13][var14];
        }
        if (var34 > 0) {
            method1096(arg7, var34, (byte) 56);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIB)V")
    public static final void method1096(int arg0, int arg1, byte arg2) {
        field2663++;
        int var3 = arg1;
        if (arg1 > 25) {
            var3 = 25;
        }
        arg1--;
        int var4 = class96.field1794[arg1];
        int var5 = class162.field2877[arg1];
        if (arg0 == 0) {
            class58.field967.method285((byte) -90, 8);
            class43.field740++;
            class58.field967.method570(var3 + var3 + 3, arg2 ^ 0x3D3B);
        }
        if (arg0 == 1) {
            class58.field967.method285((byte) -90, 99);
            class205.field3686++;
            class58.field967.method570(var3 + var3 + 17, 15619);
        }
        if (arg0 == 2) {
            class48.field828++;
            class58.field967.method285((byte) -90, 122);
            class58.field967.method570(var3 + var3 + 3, arg2 + 15563);
        }
        class48.field832 = class162.field2877[0];
        class124.field2288 = class96.field1794[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg1--;
            class58.field967.method563(class162.field2877[arg1] - var5, 25652);
            class58.field967.method563(class96.field1794[arg1] - var4, arg2 + 25596);
        }
        if (arg2 != 56) {
            field2664 = null;
        }
        class58.field967.method587(class29.field567 + var5, -32389656);
        class58.field967.method570(class162.field2878[82] ? 1 : 0, 15619);
        class58.field967.method547((byte) -67, class77.field1432 + var4);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method1097(int arg0, int arg1, byte[] arg2, int arg3) {
        field2658++;
        boolean var4 = true;
        class75 var5 = new class75(arg2);
        if (arg3 != 1) {
            field2661 = null;
        }
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method573((byte) 110);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method557(-22718);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = (var8 & 0xFDF) >> 6;
                    int var13 = var8 & 0x3F;
                    int var14 = var5.method558(1) >> 2;
                    int var15 = var12 + arg0;
                    int var16 = var13 + arg1;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class236 var17 = class157.method1158(var6, 116);
                        if (var14 != 22 || class268.field4631 || var17.field4133 != 0 || var17.field4157 == 1 || var17.field4172) {
                            if (!var17.method1617(55)) {
                                class155.field2753++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method557(-22718);
                if (var10 == 0) {
                    break;
                }
                var5.method558(1);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
    public static void method1098(int arg0) {
        if (arg0 != -1) {
            method1098(-38);
        }
        field2662 = null;
        field2664 = null;
        field2661 = null;
        field2660 = null;
    }
}
