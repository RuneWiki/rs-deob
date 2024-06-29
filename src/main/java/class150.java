import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class150 {

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field2337 = 0;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Ldk;")
    public static class251 field2338;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method1038(int arg0) {
        field2338 = null;
        if (arg0 != -1) {
            method1040(122, -6, 90, 24, -61, -38, false, -38, 67, -88, 84);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)V")
    public static final void method1039(int arg0, boolean arg1) {
        field2340++;
        class292.field4683 = arg1;
        if (arg0 != 4095) {
            method1038(66);
        }
        if (!class292.field4683) {
            int var26 = class131.field2053.method1142(arg0 - 23065);
            int var27 = class131.field2053.method1142(-18970);
            boolean var28 = class55.method381(93, class131.field2053.method1168(65280));
            int var29 = class131.field2053.method1126((byte) 75);
            int var30 = class131.field2053.method1147(arg0 ^ 0xFFFFD3D4);
            int var31 = (class47.field793 - class131.field2053.field2568) / 16;
            class153.field2382 = new int[var31][4];
            for (int var32 = 0; var32 < var31; var32++) {
                for (int var39 = 0; var39 < 4; var39++) {
                    class153.field2382[var32][var39] = class131.field2053.method1151((byte) 100);
                }
            }
            int var33 = class131.field2053.method1145(arg0 ^ 0xFFFFF00D);
            class57.field956 = new byte[var31][];
            class117.field1893 = new byte[var31][];
            class249.field3946 = new int[var31];
            class65.field1080 = new int[var31];
            class180.field2944 = null;
            class115.field1856 = null;
            class120.field1914 = new int[var31];
            class173.field2825 = new int[var31];
            class264.field4231 = new int[var31];
            boolean var34 = false;
            if (((var26 / 8) == 48 || var26 / 8 == 49) && (var30 / 8) == 48) {
                var34 = true;
            }
            int var35 = 0;
            if (var26 / 8 == 48 && var30 / 8 == 148) {
                var34 = true;
            }
            for (int var36 = (var26 - 6) / 8; var36 <= ((var26 + 6) / 8); var36++) {
                for (int var37 = (var30 - 6) / 8; var37 <= ((var30 + 6) / 8); var37++) {
                    int var38 = (var36 << 8) + var37;
                    if (var34 && var37 == 49 || var37 == 149 || var37 == 147 || var36 == 50 || !(var36 != 49 || var37 != 47)) {
                        class120.field1914[var35] = var38;
                        class65.field1080[var35] = -1;
                        class249.field3946[var35] = -1;
                        class264.field4231[var35] = -1;
                        class173.field2825[var35] = -1;
                    } else {
                        class120.field1914[var35] = var38;
                        class65.field1080[var35] = class84.field1393.method1699(0, "m" + var36 + "_" + var37);
                        class249.field3946[var35] = class84.field1393.method1699(0, "l" + var36 + "_" + var37);
                        class264.field4231[var35] = class84.field1393.method1699(class98.method672(arg0, 4095), "um" + var36 + "_" + var37);
                        class173.field2825[var35] = class84.field1393.method1699(0, "ul" + var36 + "_" + var37);
                    }
                    var35++;
                }
            }
            class100.method685(var26, var30, false, var28, var29, var27, var33, false);
            return;
        }
        int var2 = class131.field2053.method1143(65280);
        int var3 = class131.field2053.method1142(arg0 - 23065);
        int var4 = class131.field2053.method1143(65280);
        class131.field2053.method823(false);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var23 = 0; var23 < 13; var23++) {
                for (int var24 = 0; var24 < 13; var24++) {
                    int var25 = class131.field2053.method831(1, true);
                    if (var25 == 1) {
                        class83.field1379[var5][var23][var24] = class131.field2053.method831(26, true);
                    } else {
                        class83.field1379[var5][var23][var24] = -1;
                    }
                }
            }
        }
        class131.field2053.method825(93);
        int var6 = (class47.field793 - class131.field2053.field2568) / 16;
        class153.field2382 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var22 = 0; var22 < 4; var22++) {
                class153.field2382[var7][var22] = class131.field2053.method1141((byte) 111);
            }
        }
        boolean var8 = class55.method381(113, class131.field2053.method1168(65280));
        int var9 = class131.field2053.method1133((byte) 53);
        int var10 = class131.field2053.method1142(-18970);
        class115.field1856 = null;
        class264.field4231 = new int[var6];
        class65.field1080 = new int[var6];
        class249.field3946 = new int[var6];
        class180.field2944 = null;
        class117.field1893 = new byte[var6][];
        class173.field2825 = new int[var6];
        class57.field956 = new byte[var6][];
        class120.field1914 = new int[var6];
        int var11 = 0;
        for (int var12 = 0; var12 < 4; var12++) {
            for (int var13 = 0; var13 < 13; var13++) {
                for (int var14 = 0; var14 < 13; var14++) {
                    int var15 = class83.field1379[var12][var13][var14];
                    if (var15 != -1) {
                        int var16 = (var15 & 0xFFEDEB) >> 14;
                        int var17 = var15 >> 3 & 0x7FF;
                        int var18 = (var16 / 8 << 8) + var17 / 8;
                        for (int var19 = 0; var19 < var11; var19++) {
                            if (class120.field1914[var19] == var18) {
                                var18 = -1;
                                break;
                            }
                        }
                        if (var18 != -1) {
                            class120.field1914[var11] = var18;
                            int var20 = (var18 & 0xFF45) >> 8;
                            int var21 = var18 & 0xFF;
                            class65.field1080[var11] = class84.field1393.method1699(0, "m" + var20 + "_" + var21);
                            class249.field3946[var11] = class84.field1393.method1699(0, "l" + var20 + "_" + var21);
                            class264.field4231[var11] = class84.field1393.method1699(0, "um" + var20 + "_" + var21);
                            class173.field2825[var11] = class84.field1393.method1699(0, "ul" + var20 + "_" + var21);
                            var11++;
                        }
                    }
                }
            }
        }
        class100.method685(var2, var10, false, var8, var9, var4, var3, false);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIIIZIIII)V")
    public static final void method1040(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10) {
        field2339++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var27 = 0; var27 < 104; var27++) {
                class193.field3135[var11][var27] = 0;
                class117.field1887[var11][var27] = 99999999;
            }
        }
        int var12 = arg4;
        if (arg5 != -10280) {
            field2338 = null;
        }
        int var13 = arg1;
        int var14 = 0;
        boolean var15 = false;
        class193.field3135[arg4][arg1] = 99;
        class117.field1887[arg4][arg1] = 0;
        byte var16 = 0;
        class163.field2645[var16] = arg4;
        int var28 = var16 + 1;
        class155.field2425[var16] = arg1;
        int[][] var17 = class131.field2065[class56.field941].field728;
        while (var14 != var28) {
            var13 = class155.field2425[var14];
            var12 = class163.field2645[var14];
            var14 = var14 + 1 & 0xFFF;
            if (arg7 == var12 && arg8 == var13) {
                var15 = true;
                break;
            }
            if (arg10 != 0) {
                if ((arg10 < 5 || arg10 == 10) && class131.field2065[class56.field941].method309(arg8, var12, var13, arg7, arg10 - 1, 2, arg2, -1)) {
                    var15 = true;
                    break;
                }
                if (arg10 < 10 && class131.field2065[class56.field941].method296(arg7, var13, var12, (byte) -106, arg8, 2, arg2, arg10 - 1)) {
                    var15 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg9 != 0 && class131.field2065[class56.field941].method298(arg7, arg0, arg9, 2, var12, arg8, var13, 95, arg3)) {
                var15 = true;
                break;
            }
            int var26 = class117.field1887[var12][var13] + 1;
            if (var12 > 0 && class193.field3135[var12 - 1][var13] == 0 && (var17[var12 - 1][var13] & 0x2C010E) == 0 && (var17[var12 - 1][var13 + 1] & 0x2C0138) == 0) {
                class163.field2645[var28] = var12 - 1;
                class155.field2425[var28] = var13;
                var28 = var28 + 1 & 0xFFF;
                class193.field3135[var12 - 1][var13] = 2;
                class117.field1887[var12 - 1][var13] = var26;
            }
            if (var12 < 102 && class193.field3135[var12 + 1][var13] == 0 && (var17[var12 + 2][var13] & 0x2C0183) == 0 && (var17[var12 + 2][var13 + 1] & 0x2C01E0) == 0) {
                class163.field2645[var28] = var12 + 1;
                class155.field2425[var28] = var13;
                class193.field3135[var12 + 1][var13] = 8;
                class117.field1887[var12 + 1][var13] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var13 > 0 && class193.field3135[var12][var13 - 1] == 0 && (var17[var12][var13 - 1] & 0x2C010E) == 0 && (var17[var12 + 1][var13 - 1] & 0x2C0183) == 0) {
                class163.field2645[var28] = var12;
                class155.field2425[var28] = var13 - 1;
                var28 = var28 + 1 & 0xFFF;
                class193.field3135[var12][var13 - 1] = 1;
                class117.field1887[var12][var13 - 1] = var26;
            }
            if (var13 < 102 && class193.field3135[var12][var13 + 1] == 0 && (var17[var12][var13 + 2] & 0x2C0138) == 0 && (var17[var12 + 1][var13 + 2] & 0x2C01E0) == 0) {
                class163.field2645[var28] = var12;
                class155.field2425[var28] = var13 + 1;
                class193.field3135[var12][var13 + 1] = 4;
                class117.field1887[var12][var13 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 > 0 && var13 > 0 && class193.field3135[var12 - 1][var13 - 1] == 0 && (var17[var12 - 1][var13] & 0x2C013E) == 0 && (var17[var12 - 1][var13 - 1] & 0x2C010E) == 0 && (var17[var12][var13 - 1] & 0x2C018F) == 0) {
                class163.field2645[var28] = var12 - 1;
                class155.field2425[var28] = var13 - 1;
                class193.field3135[var12 - 1][var13 - 1] = 3;
                var28 = var28 + 1 & 0xFFF;
                class117.field1887[var12 - 1][var13 - 1] = var26;
            }
            if (var12 < 102 && var13 > 0 && class193.field3135[var12 + 1][var13 - 1] == 0 && (var17[var12 + 1][var13 - 1] & 0x2C018F) == 0 && (var17[var12 + 2][var13 - 1] & 0x2C0183) == 0 && (var17[var12 + 2][var13] & 0x2C01E3) == 0) {
                class163.field2645[var28] = var12 + 1;
                class155.field2425[var28] = var13 - 1;
                var28 = var28 + 1 & 0xFFF;
                class193.field3135[var12 + 1][var13 - 1] = 9;
                class117.field1887[var12 + 1][var13 - 1] = var26;
            }
            if (var12 > 0 && var13 < 102 && class193.field3135[var12 - 1][var13 + 1] == 0 && (var17[var12 - 1][var13 + 1] & 0x2C013E) == 0 && (var17[var12 - 1][var13 + 2] & 0x2C0138) == 0 && (var17[var12][var13 + 2] & 0x2C01F8) == 0) {
                class163.field2645[var28] = var12 - 1;
                class155.field2425[var28] = var13 + 1;
                class193.field3135[var12 - 1][var13 + 1] = 6;
                class117.field1887[var12 - 1][var13 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 < 102 && var13 < 102 && class193.field3135[var12 + 1][var13 + 1] == 0 && (var17[var12 + 1][var13 + 2] & 0x2C01F8) == 0 && (var17[var12 + 2][var13 + 2] & 0x2C01E0) == 0 && (var17[var12 + 2][var13 + 1] & 0x2C01E3) == 0) {
                class163.field2645[var28] = var12 + 1;
                class155.field2425[var28] = var13 + 1;
                var28 = var28 + 1 & 0xFFF;
                class193.field3135[var12 + 1][var13 + 1] = 12;
                class117.field1887[var12 + 1][var13 + 1] = var26;
            }
        }
        if (!var15) {
            if (!arg6) {
                return;
            }
            int var18 = 1000;
            int var19 = 100;
            byte var20 = 10;
            for (int var21 = arg7 - var20; var21 <= (arg7 + var20); var21++) {
                for (int var22 = arg8 - var20; var22 <= (arg8 + var20); var22++) {
                    if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && class117.field1887[var21][var22] < 100) {
                        int var23 = 0;
                        if (arg8 > var22) {
                            var23 = arg8 - var22;
                        } else if (var22 > arg8 + arg9 - 1) {
                            var23 = var22 + 1 - arg8 - arg9;
                        }
                        int var24 = 0;
                        if (arg7 > var21) {
                            var24 = arg7 - var21;
                        } else if (arg0 + arg7 - 1 < var21) {
                            var24 = var21 + 1 - arg7 - arg0;
                        }
                        int var25 = var23 * var23 + var24 * var24;
                        if (var18 > var25 || var18 == var25 && var19 > class117.field1887[var21][var22]) {
                            var12 = var21;
                            var19 = class117.field1887[var21][var22];
                            var18 = var25;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var18 == 1000) {
                return;
            }
            if (arg4 == var12 && arg1 == var13) {
                return;
            }
        }
        class237.field3804 = var12;
        class130.field2033 = false;
        class86.field1418 = var13;
    }
}
