import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class278 extends class134 {

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Luj;")
    public static class132 field4624 = new class132(16);

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public int field4623;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "Laj;")
    public static class151 field4625;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Lod;")
    public static class18 field4627;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
    public static final void method1943(int arg0) {
        class205.field3296++;
        class236.field3980.method640((byte) 97, 61);
        if (arg0 <= 23) {
            field4624 = null;
        }
        class236.field3980.method1771(class227.field3845, (byte) 30);
        field4626++;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIIIIIIZIII)V")
    public static final void method1944(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class228.field3857[var12][var36] = 0;
                class77.field1308[var12][var36] = 99999999;
            }
        }
        int var13 = arg4;
        if (!arg1) {
            method1944(-38, false, -49, 98, -33, -62, -114, 106, true, 40, 27, 119);
        }
        int var14 = arg3;
        byte var15 = 0;
        field4628++;
        class228.field3857[arg4][arg3] = 99;
        class77.field1308[arg4][arg3] = 0;
        class15.field311[var15] = arg4;
        int var16 = 0;
        boolean var17 = false;
        int var37 = var15 + 1;
        class69.field1155[var15] = arg3;
        int[][] var18 = class225.field3790[class182.field2898].field5006;
        label317: while (var37 != var16) {
            var13 = class15.field311[var16];
            var14 = class69.field1155[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg5 == var13 && arg10 == var14) {
                var17 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class225.field3790[class182.field2898].method2094(arg6, arg5, arg10, var14, arg7, var13, (byte) -94, arg9 - 1)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class225.field3790[class182.field2898].method2105(var13, (byte) 124, arg6, arg10, arg7, arg5, arg9 - 1, var14)) {
                    var17 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg2 != 0 && class225.field3790[class182.field2898].method2103(var14, arg2, (byte) 17, arg5, arg10, arg0, arg7, arg11, var13)) {
                var17 = true;
                break;
            }
            int var27 = class77.field1308[var13][var14] + 1;
            if (var13 > 0 && class228.field3857[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x2C010E) == 0 && (var18[var13 - 1][arg7 + var14 - 1] & 0x2C0138) == 0) {
                int var28 = 1;
                while (true) {
                    if ((arg7 - 1) <= var28) {
                        class15.field311[var37] = var13 - 1;
                        class69.field1155[var37] = var14;
                        class228.field3857[var13 - 1][var14] = 2;
                        class77.field1308[var13 - 1][var14] = var27;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[var13 - 1][var14 + var28] & 0x2C013E) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var13 < 102 && class228.field3857[var13 + 1][var14] == 0 && (var18[var13 + arg7][var14] & 0x2C0183) == 0 && (var18[arg7 + var13][var14 + arg7 - 1] & 0x2C01E0) == 0) {
                int var29 = 1;
                while (true) {
                    if (var29 >= (arg7 - 1)) {
                        class15.field311[var37] = var13 + 1;
                        class69.field1155[var37] = var14;
                        class228.field3857[var13 + 1][var14] = 8;
                        var37 = var37 + 1 & 0xFFF;
                        class77.field1308[var13 + 1][var14] = var27;
                        break;
                    }
                    if ((var18[arg7 + var13][var14 + var29] & 0x2C01E3) != 0) {
                        break;
                    }
                    var29++;
                }
            }
            if (var14 > 0 && class228.field3857[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x2C010E) == 0 && (var18[arg7 + var13 - 1][var14 - 1] & 0x2C0183) == 0) {
                int var30 = 1;
                while (true) {
                    if ((arg7 - 1) <= var30) {
                        class15.field311[var37] = var13;
                        class69.field1155[var37] = var14 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class228.field3857[var13][var14 - 1] = 1;
                        class77.field1308[var13][var14 - 1] = var27;
                        break;
                    }
                    if ((var18[var13 + var30][var14 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var30++;
                }
            }
            if (var14 < 102 && class228.field3857[var13][var14 + 1] == 0 && (var18[var13][arg7 + var14] & 0x2C0138) == 0 && (var18[arg7 + var13 - 1][arg7 + var14] & 0x2C01E0) == 0) {
                int var31 = 1;
                while (true) {
                    if ((arg7 - 1) <= var31) {
                        class15.field311[var37] = var13;
                        class69.field1155[var37] = var14 + 1;
                        class228.field3857[var13][var14 + 1] = 4;
                        var37 = var37 + 1 & 0xFFF;
                        class77.field1308[var13][var14 + 1] = var27;
                        break;
                    }
                    if ((var18[var13 + var31][var14 + arg7] & 0x2C01F8) != 0) {
                        break;
                    }
                    var31++;
                }
            }
            if (var13 > 0 && var14 > 0 && class228.field3857[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x2C010E) == 0) {
                int var32 = 1;
                while (true) {
                    if (var32 >= arg7) {
                        class15.field311[var37] = var13 - 1;
                        class69.field1155[var37] = var14 - 1;
                        class228.field3857[var13 - 1][var14 - 1] = 3;
                        class77.field1308[var13 - 1][var14 - 1] = var27;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[var13 - 1][var14 + var32 - 1] & 0x2C013E) != 0 || (var18[var13 + var32 - 1][var14 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var13 < 102 && var14 > 0 && class228.field3857[var13 + 1][var14 - 1] == 0 && (var18[arg7 + var13][var14 - 1] & 0x2C0183) == 0) {
                int var33 = 1;
                while (true) {
                    if (arg7 <= var33) {
                        class15.field311[var37] = var13 + 1;
                        class69.field1155[var37] = var14 - 1;
                        var37 = var37 + 1 & 0xFFF;
                        class228.field3857[var13 + 1][var14 - 1] = 9;
                        class77.field1308[var13 + 1][var14 - 1] = var27;
                        break;
                    }
                    if ((var18[arg7 + var13][var14 + var33 - 1] & 0x2C01E3) != 0 || (var18[var13 + var33][var14 - 1] & 0x2C018F) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var13 > 0 && var14 < 102 && class228.field3857[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + arg7] & 0x2C0138) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg7 <= var34) {
                        class15.field311[var37] = var13 - 1;
                        class69.field1155[var37] = var14 + 1;
                        class228.field3857[var13 - 1][var14 + 1] = 6;
                        class77.field1308[var13 - 1][var14 + 1] = var27;
                        var37 = var37 + 1 & 0xFFF;
                        break;
                    }
                    if ((var18[var13 - 1][var14 + var34] & 0x2C013E) != 0 || (var18[var13 + var34 - 1][var14 + arg7] & 0x2C01F8) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var13 < 102 && var14 < 102 && class228.field3857[var13 + 1][var14 + 1] == 0 && (var18[var13 + arg7][var14 + arg7] & 0x2C01E0) == 0) {
                for (int var35 = 1; var35 < arg7; var35++) {
                    if ((var18[var13 + var35][arg7 + var14] & 0x2C01F8) != 0 || (var18[arg7 + var13][var14 + var35] & 0x2C01E3) != 0) {
                        continue label317;
                    }
                }
                class15.field311[var37] = var13 + 1;
                class69.field1155[var37] = var14 + 1;
                class228.field3857[var13 + 1][var14 + 1] = 12;
                class77.field1308[var13 + 1][var14 + 1] = var27;
                var37 = var37 + 1 & 0xFFF;
            }
        }
        if (!var17) {
            if (!arg8) {
                return;
            }
            int var19 = 1000;
            byte var20 = 10;
            int var21 = 100;
            for (int var22 = arg5 - var20; var22 <= arg5 + var20; var22++) {
                for (int var23 = arg10 - var20; var23 <= arg10 + var20; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class77.field1308[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg5 > var22) {
                            var24 = arg5 - var22;
                        } else if ((arg0 + arg5 - 1) < var22) {
                            var24 = var22 + 1 - (arg5 + arg0);
                        }
                        int var25 = 0;
                        if (var23 < arg10) {
                            var25 = arg10 - var23;
                        } else if ((arg2 + arg10 - 1) < var23) {
                            var25 = var23 + 1 - arg2 - arg10;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || var19 == var26 && class77.field1308[var22][var23] < var21) {
                            var14 = var23;
                            var21 = class77.field1308[var22][var23];
                            var19 = var26;
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return;
            }
            if (arg4 == var13 && arg3 == var14) {
                return;
            }
        }
        class130.field2149 = false;
        class163.field2661 = var14;
        class133.field2194 = var13;
    }

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
    public static void method1945(int arg0) {
        field4625 = null;
        field4627 = null;
        if (arg0 > -103) {
            method1944(69, false, -112, -26, -80, 95, -41, -59, false, -79, 59, 1);
        }
        field4624 = null;
    }
}
