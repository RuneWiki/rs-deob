import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class84 {

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public static int field1465 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lkf;")
    public static class97 field1460 = new class97();

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1459;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "Lc;")
    public static class21 field1462;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Ldf;")
    public static final class36 method511(int arg0, int arg1) {
        class36 var2 = (class36) class130.field2469.method222(arg0 + 6177, (long) arg1);
        if (arg0 != -6053) {
            method512(90, (byte) -26);
        }
        field1466++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class68.field1199.method159((byte) -110, arg1, 3);
        class36 var4 = new class36();
        if (var3 != null) {
            var4.method239(24775, new class114(var3));
        }
        class130.field2469.method225(-21284, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Lai;")
    public static final class10 method512(int arg0, byte arg1) {
        class10 var2 = class119.method846(0, arg0);
        field1461++;
        if (arg1 != 36) {
            return null;
        }
        for (int var3 = var2.method40((byte) -73) - 3; var3 > 0; var3 -= 3) {
            var2 = class67.method440(arg1 ^ 0x24, new class10[] { var2.method44(var3, 0, (byte) -127), class131.field2481, var2.method52((byte) -118, var3) });
        }
        if (var2.method40((byte) 98) > 9) {
            return class67.method440(0, new class10[] { class200.field3778, var2.method44(var2.method40((byte) -84) - 8, 0, (byte) -70), class179.field3409, class45.field735, var2, class166.field3178 });
        } else if (var2.method40((byte) -68) > 6) {
            return class67.method440(0, new class10[] { class94.field1748, var2.method44(var2.method40((byte) -77) - 4, 0, (byte) -105), class186.field3550, class45.field735, var2, class166.field3178 });
        } else {
            return class67.method440(0, new class10[] { class159.field3056, var2, class184.field3502 });
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method513(byte arg0) {
        int var1 = -100 / ((-arg0 - 76) / 35);
        field1462 = null;
        field1460 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public static final boolean method514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class98.field1804[var12][var36] = 0;
                class53.field949[var12][var36] = 99999999;
            }
        }
        field1463++;
        class98.field1804[arg8][arg10] = 99;
        int var13 = arg8;
        class53.field949[arg8][arg10] = 0;
        int var14 = arg10;
        byte var15 = 0;
        int var16 = 0;
        class61.field1030[var15] = arg8;
        boolean var17 = false;
        int var37 = var15 + 1;
        class64.field1069[var15] = arg10;
        int var18 = class61.field1030.length;
        int[][] var19 = class58.field1022[class42.field687].field1852;
        while (var37 != var16) {
            var13 = class61.field1030[var16];
            var14 = class64.field1069[var16];
            var16 = (var16 + 1) % var18;
            if (arg0 == var13 && arg4 == var14) {
                var17 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class58.field1022[class42.field687].method656(arg7 - 1, (byte) 102, arg2, var14, arg4, var13, arg0)) {
                    var17 = true;
                    break;
                }
                if (arg7 < 10 && class58.field1022[class42.field687].method658((byte) 32, arg7 - 1, arg0, var13, var14, arg4, arg2)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg5 != 0 && class58.field1022[class42.field687].method652(var13, arg3, (byte) 16, arg0, arg9, var14, arg4, arg5)) {
                var17 = true;
                break;
            }
            int var35 = class53.field949[var13][var14] + 1;
            if (var13 > 0 && class98.field1804[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                class61.field1030[var37] = var13 - 1;
                class64.field1069[var37] = var14;
                var37 = (var37 + 1) % var18;
                class98.field1804[var13 - 1][var14] = 2;
                class53.field949[var13 - 1][var14] = var35;
            }
            if (var13 < 103 && class98.field1804[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                class61.field1030[var37] = var13 + 1;
                class64.field1069[var37] = var14;
                var37 = (var37 + 1) % var18;
                class98.field1804[var13 + 1][var14] = 8;
                class53.field949[var13 + 1][var14] = var35;
            }
            if (var14 > 0 && class98.field1804[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class61.field1030[var37] = var13;
                class64.field1069[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class98.field1804[var13][var14 - 1] = 1;
                class53.field949[var13][var14 - 1] = var35;
            }
            if (var14 < 103 && class98.field1804[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class61.field1030[var37] = var13;
                class64.field1069[var37] = var14 + 1;
                class98.field1804[var13][var14 + 1] = 4;
                class53.field949[var13][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && var14 > 0 && class98.field1804[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class61.field1030[var37] = var13 - 1;
                class64.field1069[var37] = var14 - 1;
                class98.field1804[var13 - 1][var14 - 1] = 3;
                var37 = (var37 + 1) % var18;
                class53.field949[var13 - 1][var14 - 1] = var35;
            }
            if (var13 < 103 && var14 > 0 && class98.field1804[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                class61.field1030[var37] = var13 + 1;
                class64.field1069[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class98.field1804[var13 + 1][var14 - 1] = 9;
                class53.field949[var13 + 1][var14 - 1] = var35;
            }
            if (var13 > 0 && var14 < 103 && class98.field1804[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class61.field1030[var37] = var13 - 1;
                class64.field1069[var37] = var14 + 1;
                class98.field1804[var13 - 1][var14 + 1] = 6;
                var37 = (var37 + 1) % var18;
                class53.field949[var13 - 1][var14 + 1] = var35;
            }
            if (var13 < 103 && var14 < 103 && class98.field1804[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                class61.field1030[var37] = var13 + 1;
                class64.field1069[var37] = var14 + 1;
                class98.field1804[var13 + 1][var14 + 1] = 12;
                var37 = (var37 + 1) % var18;
                class53.field949[var13 + 1][var14 + 1] = var35;
            }
        }
        class63.field1059 = 0;
        if (!var17) {
            if (!arg11) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg0 - var22; var23 <= arg0 + var22; var23++) {
                for (int var24 = arg4 - var22; var24 <= arg4 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class53.field949[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg0 > var23) {
                            var25 = arg0 - var23;
                        } else if (var23 > arg0 + arg3 - 1) {
                            var25 = var23 + 1 - arg3 - arg0;
                        }
                        int var26 = 0;
                        if (arg4 > var24) {
                            var26 = arg4 - var24;
                        } else if (var24 > arg4 + arg5 - 1) {
                            var26 = var24 + 1 - arg5 - arg4;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class53.field949[var23][var24] < var21) {
                            var20 = var27;
                            var21 = class53.field949[var23][var24];
                            var13 = var23;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg8 == var13 && arg10 == var14) {
                return false;
            }
            class63.field1059 = 1;
        }
        byte var28 = 0;
        class61.field1030[var28] = var13;
        int var38 = var28 + 1;
        class64.field1069[var28] = var14;
        int var29;
        int var30 = var29 = class98.field1804[var13][var14];
        while (arg8 != var13 || arg10 != var14) {
            if (var29 != var30) {
                class61.field1030[var38] = var13;
                class64.field1069[var38++] = var14;
                var29 = var30;
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
            var30 = class98.field1804[var13][var14];
        }
        if (var38 > 0) {
            int var31 = var38--;
            int var32 = class61.field1030[var38];
            if (var31 > 25) {
                var31 = 25;
            }
            int var33 = class64.field1069[var38];
            if (arg6 == 0) {
                class76.field1323.method635((byte) -69, 75);
                class76.field1323.method781(0, var31 + var31 + 3);
                class139.field2630++;
            }
            if (arg6 == 1) {
                class96.field1767++;
                class76.field1323.method635((byte) -44, 165);
                class76.field1323.method781(0, var31 + var31 + 14 + 3);
            }
            if (arg6 == 2) {
                class76.field1323.method635((byte) -99, 226);
                class76.field1323.method781(arg1 - 1, var31 + var31 + 3);
                class49.field863++;
            }
            class76.field1323.method796(40, class200.field3767 + var33);
            class76.field1323.method773(class182.field3477[82] ? 1 : 0, (byte) -75);
            class169.field3270 = class61.field1030[0];
            class120.field2314 = class64.field1069[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class76.field1323.method773(class61.field1030[var38] - var32, (byte) 75);
                class76.field1323.method807(class64.field1069[var38] - var33, 105);
            }
            class76.field1323.method768(var32 + class2.field16, -124);
            return true;
        } else if (arg1 == arg6) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Z")
    public static final boolean method515(int arg0, int arg1) {
        field1464++;
        if (arg0 != -2033267842) {
            field1460 = null;
        }
        return (arg1 >> 30 & 0x1) != 0;
    }
}
