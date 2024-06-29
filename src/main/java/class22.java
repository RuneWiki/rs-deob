import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class22 extends class80 {

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Lph;")
    private static class229 field287 = class266.method1858("Close", 0);

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "Lph;")
    public static class229 field295 = field287;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "Lph;")
    public static class229 field292 = class266.method1858("<)4col>", 0);

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "[I")
    public int[] field284;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "[I")
    public int[] field290;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "[I")
    public int[] field293;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[Lii;")
    public class247[] field281;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[Lii;")
    public class247[] field285;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "[[[B")
    public byte[][][] field291;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIIIIZIZ)Z", line = 9)
    public static final boolean method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, boolean arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                class312.field5259[var13][var14] = 0;
                class177.field2926[var13][var14] = 99999999;
            }
        }
        int var15 = arg8;
        class312.field5259[arg8][arg9] = 99;
        field289++;
        int var16 = arg9;
        byte var17 = 0;
        int var18 = 0;
        class177.field2926[arg8][arg9] = 0;
        class1.field33[var17] = arg8;
        int var41 = var17 + 1;
        class311.field5215[var17] = arg9;
        boolean var19 = false;
        int[][] var20 = class160.field2592[class298.field4849].field1828;
        label393: while (var41 != var18) {
            var16 = class311.field5215[var18];
            var15 = class1.field33[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg5 == var15 && arg4 == var16) {
                var19 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class160.field2592[class298.field4849].method817(arg0, arg2, arg4, 0, arg5, var16, var15, arg11 - 1)) {
                    var19 = true;
                    break;
                }
                if (arg11 < 10 && class160.field2592[class298.field4849].method830(arg4, 117, var16, var15, arg0, arg11 - 1, arg2, arg5)) {
                    var19 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg6 != 0 && class160.field2592[class298.field4849].method815(arg0, var15, arg6, var16, -123, arg7, arg3, arg4, arg5)) {
                var19 = true;
                break;
            }
            int var21 = class177.field2926[var15][var16] + 1;
            if (var15 > 0 && class312.field5259[var15 - 1][var16] == 0 && (var20[var15 - 1][var16] & 0x12C010E) == 0 && (var20[var15 - 1][var16 + arg0 - 1] & 0x12C0138) == 0) {
                int var22 = 1;
                while (true) {
                    if (var22 >= arg0 - 1) {
                        class1.field33[var41] = var15 - 1;
                        class311.field5215[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class312.field5259[var15 - 1][var16] = 2;
                        class177.field2926[var15 - 1][var16] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var22] & 0x12C013E) != 0) {
                        break;
                    }
                    var22++;
                }
            }
            if (var15 < 102 && class312.field5259[var15 + 1][var16] == 0 && (var20[arg0 + var15][var16] & 0x12C0183) == 0 && (var20[arg0 + var15][arg0 + var16 - 1] & 0x12C01E0) == 0) {
                int var23 = 1;
                while (true) {
                    if (var23 >= arg0 - 1) {
                        class1.field33[var41] = var15 + 1;
                        class311.field5215[var41] = var16;
                        var41 = var41 + 1 & 0xFFF;
                        class312.field5259[var15 + 1][var16] = 8;
                        class177.field2926[var15 + 1][var16] = var21;
                        break;
                    }
                    if ((var20[arg0 + var15][var16 + var23] & 0x12C01E3) != 0) {
                        break;
                    }
                    var23++;
                }
            }
            if (var16 > 0 && class312.field5259[var15][var16 - 1] == 0 && (var20[var15][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg0 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var24 = 1;
                while (true) {
                    if (var24 >= arg0 - 1) {
                        class1.field33[var41] = var15;
                        class311.field5215[var41] = var16 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class312.field5259[var15][var16 - 1] = 1;
                        class177.field2926[var15][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var24][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var24++;
                }
            }
            if (var16 < 102 && class312.field5259[var15][var16 + 1] == 0 && (var20[var15][arg0 + var16] & 0x12C0138) == 0 && (var20[arg0 + var15 - 1][arg0 + var16] & 0x12C01E0) == 0) {
                int var25 = 1;
                while (true) {
                    if (var25 >= arg0 - 1) {
                        class1.field33[var41] = var15;
                        class311.field5215[var41] = var16 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class312.field5259[var15][var16 + 1] = 4;
                        class177.field2926[var15][var16 + 1] = var21;
                        break;
                    }
                    if ((var20[var15 + var25][arg0 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var25++;
                }
            }
            if (var15 > 0 && var16 > 0 && class312.field5259[var15 - 1][var16 - 1] == 0 && (var20[var15 - 1][arg0 + var16 - 1 - 1] & 0x12C0138) == 0 && (var20[var15 - 1][var16 - 1] & 0x12C010E) == 0 && (var20[var15 + arg0 - 1 - 1][var16 - 1] & 0x12C0183) == 0) {
                int var26 = 1;
                while (true) {
                    if (arg0 - 1 <= var26) {
                        class1.field33[var41] = var15 - 1;
                        class311.field5215[var41] = var16 - 1;
                        class312.field5259[var15 - 1][var16 - 1] = 3;
                        var41 = var41 + 1 & 0xFFF;
                        class177.field2926[var15 - 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var26 - 1] & 0x12C013E) != 0 || (var20[var26 + var15 - 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var26++;
                }
            }
            if (var15 < 102 && var16 > 0 && class312.field5259[var15 + 1][var16 - 1] == 0 && (var20[var15 + 1][var16 - 1] & 0x12C010E) == 0 && (var20[arg0 + var15][var16 - 1] & 0x12C0183) == 0 && (var20[arg0 + var15][var16 + arg0 - 2] & 0x12C01E0) == 0) {
                int var27 = 1;
                while (true) {
                    if (var27 >= (arg0 - 1)) {
                        class1.field33[var41] = var15 + 1;
                        class311.field5215[var41] = var16 - 1;
                        class312.field5259[var15 + 1][var16 - 1] = 9;
                        var41 = var41 + 1 & 0xFFF;
                        class177.field2926[var15 + 1][var16 - 1] = var21;
                        break;
                    }
                    if ((var20[arg0 + var15][var27 + var16 - 1] & 0x12C01E3) != 0 || (var20[var15 + var27 + 1][var16 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var27++;
                }
            }
            if (var15 > 0 && var16 < 102 && class312.field5259[var15 - 1][var16 + 1] == 0 && (var20[var15 - 1][var16 + 1] & 0x12C010E) == 0 && (var20[var15 - 1][arg0 + var16] & 0x12C0138) == 0 && (var20[var15][arg0 + var16] & 0x12C01E0) == 0) {
                int var28 = 1;
                while (true) {
                    if (var28 >= (arg0 - 1)) {
                        class1.field33[var41] = var15 - 1;
                        class311.field5215[var41] = var16 + 1;
                        class312.field5259[var15 - 1][var16 + 1] = 6;
                        class177.field2926[var15 - 1][var16 + 1] = var21;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var20[var15 - 1][var16 + var28 + 1] & 0x12C013E) != 0 || (var20[var15 - (1 - var28)][arg0 + var16] & 0x12C01F8) != 0) {
                        break;
                    }
                    var28++;
                }
            }
            if (var15 < 102 && var16 < 102 && class312.field5259[var15 + 1][var16 + 1] == 0 && (var20[var15 + 1][arg0 + var16] & 0x12C0138) == 0 && (var20[arg0 + var15][var16 + arg0] & 0x12C01E0) == 0 && (var20[arg0 + var15][var16 + 1] & 0x12C0183) == 0) {
                for (int var29 = 1; var29 < (arg0 - 1); var29++) {
                    if ((var20[var15 + var29 + 1][var16 + arg0] & 0x12C01F8) != 0 || (var20[arg0 + var15][var29 + var16 + 1] & 0x12C01E3) != 0) {
                        continue label393;
                    }
                }
                class1.field33[var41] = var15 + 1;
                class311.field5215[var41] = var16 + 1;
                var41 = var41 + 1 & 0xFFF;
                class312.field5259[var15 + 1][var16 + 1] = 12;
                class177.field2926[var15 + 1][var16 + 1] = var21;
            }
        }
        class228.field3746 = 0;
        if (!var19) {
            if (!arg10) {
                return false;
            }
            int var30 = 100;
            byte var31 = 10;
            int var32 = 1000;
            for (int var33 = arg5 - var31; var33 <= arg5 + var31; var33++) {
                for (int var34 = arg4 - var31; var34 <= arg4 + var31; var34++) {
                    if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && class177.field2926[var33][var34] < 100) {
                        int var35 = 0;
                        if (var33 < arg5) {
                            var35 = arg5 - var33;
                        } else if (var33 > arg5 + arg7 - 1) {
                            var35 = var33 - arg5 - (arg7 - 1);
                        }
                        int var36 = 0;
                        if (var34 < arg4) {
                            var36 = arg4 - var34;
                        } else if ((arg4 + arg6 - 1) < var34) {
                            var36 = var34 + 1 - arg6 - arg4;
                        }
                        int var37 = var35 * var35 + var36 * var36;
                        if (var32 > var37 || var32 == var37 && var30 > class177.field2926[var33][var34]) {
                            var16 = var34;
                            var32 = var37;
                            var15 = var33;
                            var30 = class177.field2926[var33][var34];
                        }
                    }
                }
            }
            if (var32 == 1000) {
                return false;
            }
            if (arg8 == var15 && arg9 == var16) {
                return false;
            }
            class228.field3746 = 1;
        }
        byte var38 = 0;
        class1.field33[var38] = var15;
        int var42 = var38 + 1;
        class311.field5215[var38] = var16;
        int var39;
        int var40 = var39 = class312.field5259[var15][var16];
        while (arg8 != var15 || arg9 != var16) {
            if (var39 != var40) {
                var39 = var40;
                class1.field33[var42] = var15;
                class311.field5215[var42++] = var16;
            }
            if ((var40 & 0x1) != 0) {
                var16++;
            } else if ((var40 & 0x4) != 0) {
                var16--;
            }
            if ((var40 & 0x2) != 0) {
                var15++;
            } else if ((var40 & 0x8) != 0) {
                var15--;
            }
            var40 = class312.field5259[var15][var16];
        }
        if (var42 > 0) {
            class233.method1657(var42, arg1, (byte) 12);
            return true;
        } else if (arg1 == 1) {
            return false;
        } else if (arg12) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 522)
    public static final void method130(byte arg0) {
        field288++;
        if (arg0 != 11) {
            method132(-1, -101, -34, 65, 71, 42);
        }
        if ((class263.field4394 > class95.field1604)) {
            class95.field1604 = (float) ((double) class95.field1604 / 30.0D + (double) class95.field1604);
            if (class263.field4394 < class95.field1604) {
                class95.field1604 = class263.field4394;
            }
            class248.method1742((byte) -123);
        } else if (class95.field1604 > class263.field4394) {
            class95.field1604 = (float) ((double) class95.field1604 - (double) class95.field1604 / 30.0D);
            if (class263.field4394 > class95.field1604) {
                class95.field1604 = class263.field4394;
            }
            class248.method1742((byte) 22);
        }
        if (class61.field870 == -1 || class205.field3380 == -1) {
            return;
        }
        int var1 = class205.field3380 - class324.field5534;
        int var2 = class61.field870 - class103.field1767;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class103.field1767 += var2;
        class324.field5534 += var1;
        if (var2 == 0 && var1 == 0) {
            class61.field870 = -1;
            class205.field3380 = -1;
        }
        class248.method1742((byte) -126);
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(I)V", line = 598)
    public static void method131(int arg0) {
        field292 = null;
        field287 = null;
        field295 = null;
        if (arg0 != 1) {
            field279 = 1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V", line = 618)
    public static final void method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 <= 100) {
            return;
        }
        field282++;
        if (class192.field3172 <= arg1 && class77.field1289 >= arg5 && arg4 >= class206.field3398 && arg2 <= class214.field3533) {
            class167.method1222(arg5, arg1, (byte) 76, arg0, arg4, arg2);
        } else {
            class263.method1831(arg1, arg5, false, arg0, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)Lrl;", line = 645)
    public static final class327 method133(byte arg0) {
        field283++;
        int var1 = class36.field597[0] * class288.field4729[0];
        byte[] var2 = class279.field4623[0];
        if (arg0 != 82) {
            return (class327) null;
        }
        class327 var5;
        if (class177.field2922[0]) {
            byte[] var6 = class27.field404[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class201.method1410(class314.field5346[class243.method1696(255, var2[var8])], class243.method1696(255, var6[var8]) << 24);
            }
            var5 = new class284(class266.field4486, class48.field713, class303.field5064[0], class27.field387[0], class36.field597[0], class288.field4729[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class314.field5346[class243.method1696(255, var2[var4])];
            }
            var5 = new class327(class266.field4486, class48.field713, class303.field5064[0], class27.field387[0], class36.field597[0], class288.field4729[0], var3);
        }
        class214.method1517(-25672);
        return var5;
    }
}
