import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SNNOFNNG")
public class class53 {

    @OriginalMember(owner = "client!SNNOFNNG", name = "g", descriptor = "I")
    private int field1463 = 631;

    @OriginalMember(owner = "client!SNNOFNNG", name = "o", descriptor = "B")
    private byte field1471 = -83;

    @OriginalMember(owner = "client!SNNOFNNG", name = "D", descriptor = "Z")
    private boolean field1486 = true;

    @OriginalMember(owner = "client!SNNOFNNG", name = "q", descriptor = "I")
    private int field1473;

    @OriginalMember(owner = "client!SNNOFNNG", name = "r", descriptor = "I")
    private int field1474;

    @OriginalMember(owner = "client!SNNOFNNG", name = "B", descriptor = "[[[I")
    private int[][][] field1484;

    @OriginalMember(owner = "client!SNNOFNNG", name = "z", descriptor = "[[[B")
    private byte[][][] field1482;

    @OriginalMember(owner = "client!SNNOFNNG", name = "h", descriptor = "[[[B")
    private byte[][][] field1464;

    @OriginalMember(owner = "client!SNNOFNNG", name = "j", descriptor = "[[[B")
    private byte[][][] field1466;

    @OriginalMember(owner = "client!SNNOFNNG", name = "v", descriptor = "[[[B")
    private byte[][][] field1478;

    @OriginalMember(owner = "client!SNNOFNNG", name = "n", descriptor = "[[[B")
    private byte[][][] field1470;

    @OriginalMember(owner = "client!SNNOFNNG", name = "y", descriptor = "[[[I")
    private int[][][] field1481;

    @OriginalMember(owner = "client!SNNOFNNG", name = "A", descriptor = "[[[B")
    private byte[][][] field1483;

    @OriginalMember(owner = "client!SNNOFNNG", name = "l", descriptor = "[[I")
    private int[][] field1468;

    @OriginalMember(owner = "client!SNNOFNNG", name = "b", descriptor = "[I")
    private int[] field1458;

    @OriginalMember(owner = "client!SNNOFNNG", name = "c", descriptor = "[I")
    private int[] field1459;

    @OriginalMember(owner = "client!SNNOFNNG", name = "d", descriptor = "[I")
    private int[] field1460;

    @OriginalMember(owner = "client!SNNOFNNG", name = "e", descriptor = "[I")
    private int[] field1461;

    @OriginalMember(owner = "client!SNNOFNNG", name = "f", descriptor = "[I")
    private int[] field1462;

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "I")
    private static int field1457 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!SNNOFNNG", name = "i", descriptor = "[I")
    private static final int[] field1465 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!SNNOFNNG", name = "k", descriptor = "I")
    private static int field1467 = -521;

    @OriginalMember(owner = "client!SNNOFNNG", name = "m", descriptor = "Z")
    public static boolean field1469 = true;

    @OriginalMember(owner = "client!SNNOFNNG", name = "p", descriptor = "I")
    public static int field1472 = 99;

    @OriginalMember(owner = "client!SNNOFNNG", name = "t", descriptor = "[I")
    private static final int[] field1476 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!SNNOFNNG", name = "u", descriptor = "I")
    private static int field1477 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!SNNOFNNG", name = "w", descriptor = "I")
    private static int field1479 = 23;

    @OriginalMember(owner = "client!SNNOFNNG", name = "x", descriptor = "[I")
    private static final int[] field1480 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!SNNOFNNG", name = "E", descriptor = "[I")
    private static final int[] field1487 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!SNNOFNNG", name = "F", descriptor = "I")
    private static int field1488 = 9;

    @OriginalMember(owner = "client!SNNOFNNG", name = "C", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!SNNOFNNG", name = "s", descriptor = "Z")
    private static boolean field1475;

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(II)I")
    private static final int method465(int arg0, int arg1) {
        int var2 = method470(arg0 - 1, arg1 - 1) + method470(arg0 + 1, arg1 - 1) + method470(arg0 - 1, arg1 + 1) + method470(arg0 + 1, arg1 + 1);
        int var3 = method470(arg0 - 1, arg1) + method470(arg0 + 1, arg1) + method470(arg0, arg1 - 1) + method470(arg0, arg1 + 1);
        int var4 = method470(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IBII)I")
    public int method466(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 78) {
            this.field1486 = !this.field1486;
        }
        if ((this.field1482[arg0][arg3][arg2] & 0x8) == 0) {
            return arg0 <= 0 || (this.field1482[1][arg3][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "([LAOKWRKNA;IIIIII[BII)V")
    public final void method467(class1[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg6 + var11 > 0 && arg6 + var11 < 103 && arg1 + var16 > 0 && arg1 + var16 < 103) {
                    arg0[arg4].field7[arg6 + var11][arg1 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        if (arg8 <= 0) {
            this.field1486 = !this.field1486;
        }
        class25 var12 = new class25(arg7, 713);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg5 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg9 && var15 < arg9 + 8) {
                        this.method480(arg1 + class5.method42(true, var14 & 0x7, var15 & 0x7, arg3), arg3, 0, 0, var12, arg6 + class5.method41(var15 & 0x7, arg3, 3, var14 & 0x7), 0, arg4);
                    } else {
                        this.method480(-1, 0, 0, 0, var12, -1, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIIII)V")
    public final void method468(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg1; var6 <= arg0 + arg1; var6++) {
            for (int var7 = arg4; var7 <= arg2 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field1473 && var6 >= 0 && var6 < this.field1474) {
                    this.field1483[0][var7][var6] = 127;
                    if (arg4 == var7 && var7 > 0) {
                        this.field1484[0][var7][var6] = this.field1484[0][var7 - 1][var6];
                    }
                    if (arg2 + arg4 == var7 && var7 < this.field1473 - 1) {
                        this.field1484[0][var7][var6] = this.field1484[0][var7 + 1][var6];
                    }
                    if (arg1 == var6 && var6 > 0) {
                        this.field1484[0][var7][var6] = this.field1484[0][var7][var6 - 1];
                    }
                    if (arg0 + arg1 == var6 && var6 < this.field1474 - 1) {
                        this.field1484[0][var7][var6] = this.field1484[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg3 == -46682) {
            ;
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "b", descriptor = "(II)I")
    private final int method469(int arg0, int arg1) {
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "c", descriptor = "(II)I")
    private static final int method470(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIII)I")
    private static final int method471(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class70.field1712[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(LBISZONYZ;BLIUVBENCV;)V")
    public static final void method472(class4 arg0, byte arg1, class25 arg2) {
        if (arg1 == 3) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        int var5 = -1;
        while (true) {
            int var6 = arg2.method259();
            if (var6 == 0) {
                return;
            }
            var5 += var6;
            class35 var7 = class35.method341(var5);
            var7.method335((byte) 7, arg0);
            while (true) {
                int var8 = arg2.method259();
                if (var8 == 0) {
                    break;
                }
                arg2.method245();
            }
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(I[BIIILPOACSVST;II[LAOKWRKNA;IZ)V")
    public final void method473(int arg0, byte[] arg1, int arg2, int arg3, int arg4, class46 arg5, int arg6, int arg7, class1[] arg8, int arg9, boolean arg10) {
        class25 var12 = new class25(arg1, 713);
        int var13 = -1;
        if (!arg10) {
            return;
        }
        while (true) {
            int var14 = var12.method259();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method259();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method245();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg7 == var19 && var18 >= arg3 && var18 < arg3 + 8 && var17 >= arg6 && var17 < arg6 + 8) {
                    class35 var23 = class35.method341(var13);
                    int var24 = arg0 + class5.method43(var18 & 0x7, var23.field1038, var17 & 0x7, var23.field1071, 498, var22, arg9);
                    int var25 = arg2 + class5.method44(var18 & 0x7, var23.field1071, arg9, 634, var17 & 0x7, var22, var23.field1038);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg4;
                        if ((this.field1482[1][var24][var25] & 0x2) == 2) {
                            var26 = arg4 - 1;
                        }
                        class1 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg8[var26];
                        }
                        this.method483(var13, var25, var21, arg9 + var22 & 0x3, var27, -812, arg4, var24, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "([BI[LAOKWRKNA;IZII)V")
    public final void method474(byte[] arg0, int arg1, class1[] arg2, int arg3, boolean arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg6 + var13 > 0 && arg6 + var13 < 103 && arg1 + var14 > 0 && arg1 + var14 < 103) {
                        arg2[var8].field7[arg6 + var13][arg1 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (arg4) {
            return;
        }
        class25 var9 = new class25(arg0, 713);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method480(arg1 + var12, 0, arg5, 0, var9, arg6 + var11, arg3, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(III)I")
    private static final int method475(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method465(var3, var5);
        int var8 = method465(var3 + 1, var5);
        int var9 = method465(var3, var5 + 1);
        int var10 = method465(var3 + 1, var5 + 1);
        int var11 = method471(var7, var8, var4, arg2);
        int var12 = method471(var9, var10, var4, arg2);
        return method471(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(I[LAOKWRKNA;LPOACSVST;B[BI)V")
    public final void method476(int arg0, class1[] arg1, class46 arg2, byte arg3, byte[] arg4, int arg5) {
        class25 var7 = new class25(arg4, 713);
        if (this.field1471 != arg3) {
            this.field1463 = 346;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method259();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method259();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method245();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg5 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1482[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class1 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg1[var20];
                    }
                    this.method483(var8, var19, var16, var17, var21, -812, var14, var18, arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "d", descriptor = "(II)I")
    private static final int method477(int arg0, int arg1) {
        if (arg0 == -1) {
            return 12345678;
        }
        int var2 = (arg0 & 0x7F) * arg1 / 128;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "b", descriptor = "(IIII)V")
    public final void method478(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var9 = 0; var9 < 8; var9++) {
                this.field1484[arg2][arg0 + var5][arg1 + var9] = 0;
            }
        }
        while (arg3 >= 0) {
            for (int var8 = 1; var8 > 0; var8++) {
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field1484[arg2][arg0][arg1 + var6] = this.field1484[arg2][arg0 - 1][arg1 + var6];
            }
        }
        if (arg1 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1484[arg2][arg0 + var7][arg1] = this.field1484[arg2][arg0 + var7][arg1 - 1];
            }
        }
        if (arg0 > 0 && this.field1484[arg2][arg0 - 1][arg1] != 0) {
            this.field1484[arg2][arg0][arg1] = this.field1484[arg2][arg0 - 1][arg1];
        } else if (arg1 > 0 && this.field1484[arg2][arg0][arg1 - 1] != 0) {
            this.field1484[arg2][arg0][arg1] = this.field1484[arg2][arg0][arg1 - 1];
        } else if (arg0 > 0 && arg1 > 0 && this.field1484[arg2][arg0 - 1][arg1 - 1] != 0) {
            this.field1484[arg2][arg0][arg1] = this.field1484[arg2][arg0 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "b", descriptor = "(III)I")
    private final int method479(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "<init>", descriptor = "([[[I[[[BIIZ)V")
    public class53(int[][][] arg0, byte[][][] arg1, int arg2, int arg3, boolean arg4) {
        field1472 = 99;
        this.field1473 = arg3;
        this.field1474 = arg2;
        this.field1484 = arg0;
        this.field1482 = arg1;
        if (arg4) {
            throw new NullPointerException();
        }
        this.field1464 = new byte[4][this.field1473][this.field1474];
        this.field1466 = new byte[4][this.field1473][this.field1474];
        this.field1478 = new byte[4][this.field1473][this.field1474];
        this.field1470 = new byte[4][this.field1473][this.field1474];
        this.field1481 = new int[4][this.field1473 + 1][this.field1474 + 1];
        this.field1483 = new byte[4][this.field1473 + 1][this.field1474 + 1];
        this.field1468 = new int[this.field1473 + 1][this.field1474 + 1];
        this.field1458 = new int[this.field1474];
        this.field1459 = new int[this.field1474];
        this.field1460 = new int[this.field1474];
        this.field1461 = new int[this.field1474];
        this.field1462 = new int[this.field1474];
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIIILIUVBENCV;III)V")
    private final void method480(int arg0, int arg1, int arg2, int arg3, class25 arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 0) {
            return;
        }
        if (arg5 < 0 || arg5 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var11 = arg4.method245();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg4.method245();
                    return;
                }
                if (var11 <= 49) {
                    arg4.method245();
                }
            }
        }
        this.field1482[arg7][arg5][arg0] = 0;
        while (true) {
            int var9 = arg4.method245();
            if (var9 == 0) {
                if (arg7 == 0) {
                    this.field1484[0][arg5][arg0] = -method482(arg5 + arg2 + 932731, arg0 + 556238 + arg6) * 8;
                    return;
                } else {
                    this.field1484[arg7][arg5][arg0] = this.field1484[arg7 - 1][arg5][arg0] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg4.method245();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg7 == 0) {
                    this.field1484[0][arg5][arg0] = -var10 * 8;
                    return;
                }
                this.field1484[arg7][arg5][arg0] = this.field1484[arg7 - 1][arg5][arg0] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1466[arg7][arg5][arg0] = arg4.method246();
                this.field1478[arg7][arg5][arg0] = (byte) ((var9 - 2) / 4);
                this.field1470[arg7][arg5][arg0] = (byte) (var9 + arg1 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1482[arg7][arg5][arg0] = (byte) (var9 - 49);
            } else {
                this.field1464[arg7][arg5][arg0] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIIIIIILPOACSVST;LAOKWRKNA;[[[II)V")
    public static final void method481(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class46 arg7, class1 arg8, int[][][] arg9, int arg10) {
        int var11 = arg9[arg1][arg3][arg0];
        int var12 = arg9[arg1][arg3 + 1][arg0];
        int var13 = arg9[arg1][arg3 + 1][arg0 + 1];
        int var14 = arg9[arg1][arg3][arg0 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class35 var16 = class35.method341(arg10);
        while (arg4 >= 0) {
            field1479 = 9;
        }
        int var17 = (arg10 << 14) + (arg0 << 7) + arg3 + 1073741824;
        if (!var16.field1060) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg5 << 6) + arg2);
        if (arg2 == 22) {
            class56 var19;
            if (var16.field1078 == -1 && var16.field1046 == null) {
                var19 = var16.method338(22, arg5, var11, var12, var13, var14, -1);
            } else {
                var19 = new class68(var14, var13, (byte) 7, var16.field1078, 22, true, var12, var11, arg10, arg5);
            }
            arg7.method393(-34796, var17, arg0, arg3, arg6, var18, var15, var19);
            if (var16.field1059 && var16.field1060) {
                arg8.method4(arg0, field1467, arg3);
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class56 var39;
            if (var16.field1078 == -1 && var16.field1046 == null) {
                var39 = var16.method338(10, arg5, var11, var12, var13, var14, -1);
            } else {
                var39 = new class68(var14, var13, (byte) 7, var16.field1078, 10, true, var12, var11, arg10, arg5);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg2 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg5 == 1 || arg5 == 3) {
                    var41 = var16.field1071;
                    var42 = var16.field1038;
                } else {
                    var41 = var16.field1038;
                    var42 = var16.field1071;
                }
                arg7.method397(46140, arg0, var39, var40, var17, var41, var42, arg3, arg6, var15, var18);
            }
            if (var16.field1059) {
                arg8.method3(var16.field1038, arg0, arg5, arg3, var16.field1037, 0, var16.field1071);
            }
        } else if (arg2 >= 12) {
            class56 var20;
            if (var16.field1078 == -1 && var16.field1046 == null) {
                var20 = var16.method338(arg2, arg5, var11, var12, var13, var14, -1);
            } else {
                var20 = new class68(var14, var13, (byte) 7, var16.field1078, arg2, true, var12, var11, arg10, arg5);
            }
            arg7.method397(46140, arg0, var20, 0, var17, 1, 1, arg3, arg6, var15, var18);
            if (var16.field1059) {
                arg8.method3(var16.field1038, arg0, arg5, arg3, var16.field1037, 0, var16.field1071);
            }
        } else if (arg2 == 0) {
            class56 var21;
            if (var16.field1078 == -1 && var16.field1046 == null) {
                var21 = var16.method338(0, arg5, var11, var12, var13, var14, -1);
            } else {
                var21 = new class68(var14, var13, (byte) 7, var16.field1078, 0, true, var12, var11, arg10, arg5);
            }
            arg7.method395(field1488, arg6, 0, field1465[arg5], var17, arg0, var18, var21, var15, arg3, null);
            if (var16.field1059) {
                arg8.method2((byte) 61, arg0, arg3, var16.field1037, arg5, arg2);
            }
        } else if (arg2 == 1) {
            class56 var22;
            if (var16.field1078 == -1 && var16.field1046 == null) {
                var22 = var16.method338(1, arg5, var11, var12, var13, var14, -1);
            } else {
                var22 = new class68(var14, var13, (byte) 7, var16.field1078, 1, true, var12, var11, arg10, arg5);
            }
            arg7.method395(field1488, arg6, 0, field1480[arg5], var17, arg0, var18, var22, var15, arg3, null);
            if (var16.field1059) {
                arg8.method2((byte) 61, arg0, arg3, var16.field1037, arg5, arg2);
            }
        } else if (arg2 == 2) {
            int var23 = arg5 + 1 & 0x3;
            class56 var24;
            class56 var25;
            if (var16.field1078 == -1 && var16.field1046 == null) {
                var24 = var16.method338(2, arg5 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method338(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class68(var14, var13, (byte) 7, var16.field1078, 2, true, var12, var11, arg10, arg5 + 4);
                var25 = new class68(var14, var13, (byte) 7, var16.field1078, 2, true, var12, var11, arg10, var23);
            }
            arg7.method395(field1488, arg6, field1465[var23], field1465[arg5], var17, arg0, var18, var24, var15, arg3, var25);
            if (var16.field1059) {
                arg8.method2((byte) 61, arg0, arg3, var16.field1037, arg5, arg2);
            }
        } else if (arg2 == 3) {
            class56 var26;
            if (var16.field1078 == -1 && var16.field1046 == null) {
                var26 = var16.method338(3, arg5, var11, var12, var13, var14, -1);
            } else {
                var26 = new class68(var14, var13, (byte) 7, var16.field1078, 3, true, var12, var11, arg10, arg5);
            }
            arg7.method395(field1488, arg6, 0, field1480[arg5], var17, arg0, var18, var26, var15, arg3, null);
            if (var16.field1059) {
                arg8.method2((byte) 61, arg0, arg3, var16.field1037, arg5, arg2);
            }
        } else if (arg2 == 9) {
            class56 var27;
            if (var16.field1078 == -1 && var16.field1046 == null) {
                var27 = var16.method338(arg2, arg5, var11, var12, var13, var14, -1);
            } else {
                var27 = new class68(var14, var13, (byte) 7, var16.field1078, arg2, true, var12, var11, arg10, arg5);
            }
            arg7.method397(46140, arg0, var27, 0, var17, 1, 1, arg3, arg6, var15, var18);
            if (var16.field1059) {
                arg8.method3(var16.field1038, arg0, arg5, arg3, var16.field1037, 0, var16.field1071);
            }
        } else {
            if (var16.field1075) {
                if (arg5 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg5 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg5 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg2 == 4) {
                class56 var32;
                if (var16.field1078 == -1 && var16.field1046 == null) {
                    var32 = var16.method338(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class68(var14, var13, (byte) 7, var16.field1078, 4, true, var12, var11, arg10, 0);
                }
                arg7.method396(arg0, var15, 0, arg5 * 512, 0, true, var17, var18, arg6, field1465[arg5], var32, arg3);
            } else if (arg2 == 5) {
                int var33 = 16;
                int var34 = arg7.method413(arg6, arg3, arg0);
                if (var34 > 0) {
                    var33 = class35.method341(var34 >> 14 & 0x7FFF).field1081;
                }
                class56 var35;
                if (var16.field1078 == -1 && var16.field1046 == null) {
                    var35 = var16.method338(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class68(var14, var13, (byte) 7, var16.field1078, 4, true, var12, var11, arg10, 0);
                }
                arg7.method396(arg0, var15, field1476[arg5] * var33, arg5 * 512, field1487[arg5] * var33, true, var17, var18, arg6, field1465[arg5], var35, arg3);
            } else if (arg2 == 6) {
                class56 var36;
                if (var16.field1078 == -1 && var16.field1046 == null) {
                    var36 = var16.method338(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class68(var14, var13, (byte) 7, var16.field1078, 4, true, var12, var11, arg10, 0);
                }
                arg7.method396(arg0, var15, 0, arg5, 0, true, var17, var18, arg6, 256, var36, arg3);
            } else if (arg2 == 7) {
                class56 var37;
                if (var16.field1078 == -1 && var16.field1046 == null) {
                    var37 = var16.method338(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class68(var14, var13, (byte) 7, var16.field1078, 4, true, var12, var11, arg10, 0);
                }
                arg7.method396(arg0, var15, 0, arg5, 0, true, var17, var18, arg6, 512, var37, arg3);
            } else if (arg2 == 8) {
                class56 var38;
                if (var16.field1078 == -1 && var16.field1046 == null) {
                    var38 = var16.method338(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class68(var14, var13, (byte) 7, var16.field1078, 4, true, var12, var11, arg10, 0);
                }
                arg7.method396(arg0, var15, 0, arg5, 0, true, var17, var18, arg6, 768, var38, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "e", descriptor = "(II)I")
    private static final int method482(int arg0, int arg1) {
        int var2 = method475(arg0 + 45365, arg1 + 91923, 4) + (method475(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method475(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIIILAOKWRKNA;IIILPOACSVST;)V")
    private final void method483(int arg0, int arg1, int arg2, int arg3, class1 arg4, int arg5, int arg6, int arg7, class46 arg8) {
        if (field1469 && (this.field1482[0][arg7][arg1] & 0x2) == 0) {
            if ((this.field1482[arg6][arg7][arg1] & 0x10) != 0) {
                return;
            }
            if (this.method466(arg6, (byte) 78, arg1, arg7) != field1485) {
                return;
            }
        }
        if (arg6 < field1472) {
            field1472 = arg6;
        }
        int var10 = this.field1484[arg6][arg7][arg1];
        int var11 = this.field1484[arg6][arg7 + 1][arg1];
        int var12 = this.field1484[arg6][arg7 + 1][arg1 + 1];
        int var13 = this.field1484[arg6][arg7][arg1 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class35 var15 = class35.method341(arg0);
        int var16 = (arg0 << 14) + (arg1 << 7) + arg7 + 1073741824;
        if (!var15.field1060) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg3 << 6) + arg2);
        if (arg5 >= 0) {
            return;
        }
        if (arg2 == 22) {
            if (!field1469 || var15.field1060 || var15.field1084) {
                class56 var18;
                if (var15.field1078 == -1 && var15.field1046 == null) {
                    var18 = var15.method338(22, arg3, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class68(var13, var12, (byte) 7, var15.field1078, 22, true, var11, var10, arg0, arg3);
                }
                arg8.method393(-34796, var16, arg1, arg7, arg6, var17, var14, var18);
                if (var15.field1059 && var15.field1060 && arg4 != null) {
                    arg4.method4(arg1, field1467, arg7);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class56 var38;
            if (var15.field1078 == -1 && var15.field1046 == null) {
                var38 = var15.method338(10, arg3, var10, var11, var12, var13, -1);
            } else {
                var38 = new class68(var13, var12, (byte) 7, var15.field1078, 10, true, var11, var10, arg0, arg3);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg2 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg3 == 1 || arg3 == 3) {
                    var40 = var15.field1071;
                    var41 = var15.field1038;
                } else {
                    var40 = var15.field1038;
                    var41 = var15.field1071;
                }
                if (arg8.method397(46140, arg1, var38, var39, var16, var40, var41, arg7, arg6, var14, var17) && var15.field1054) {
                    class29 var42;
                    if (var38 instanceof class29) {
                        var42 = (class29) var38;
                    } else {
                        var42 = var15.method338(10, arg3, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field945 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1483[arg6][arg7 + var43][arg1 + var44]) {
                                    this.field1483[arg6][arg7 + var43][arg1 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1059 && arg4 != null) {
                arg4.method3(var15.field1038, arg1, arg3, arg7, var15.field1037, 0, var15.field1071);
            }
        } else if (arg2 >= 12) {
            class56 var19;
            if (var15.field1078 == -1 && var15.field1046 == null) {
                var19 = var15.method338(arg2, arg3, var10, var11, var12, var13, -1);
            } else {
                var19 = new class68(var13, var12, (byte) 7, var15.field1078, arg2, true, var11, var10, arg0, arg3);
            }
            arg8.method397(46140, arg1, var19, 0, var16, 1, 1, arg7, arg6, var14, var17);
            if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg6 > 0) {
                this.field1481[arg6][arg7][arg1] |= 0x924;
            }
            if (var15.field1059 && arg4 != null) {
                arg4.method3(var15.field1038, arg1, arg3, arg7, var15.field1037, 0, var15.field1071);
            }
        } else if (arg2 == 0) {
            class56 var20;
            if (var15.field1078 == -1 && var15.field1046 == null) {
                var20 = var15.method338(0, arg3, var10, var11, var12, var13, -1);
            } else {
                var20 = new class68(var13, var12, (byte) 7, var15.field1078, 0, true, var11, var10, arg0, arg3);
            }
            arg8.method395(field1488, arg6, 0, field1465[arg3], var16, arg1, var17, var20, var14, arg7, null);
            if (arg3 == 0) {
                if (var15.field1054) {
                    this.field1483[arg6][arg7][arg1] = 50;
                    this.field1483[arg6][arg7][arg1 + 1] = 50;
                }
                if (var15.field1079) {
                    this.field1481[arg6][arg7][arg1] |= 0x249;
                }
            } else if (arg3 == 1) {
                if (var15.field1054) {
                    this.field1483[arg6][arg7][arg1 + 1] = 50;
                    this.field1483[arg6][arg7 + 1][arg1 + 1] = 50;
                }
                if (var15.field1079) {
                    this.field1481[arg6][arg7][arg1 + 1] |= 0x492;
                }
            } else if (arg3 == 2) {
                if (var15.field1054) {
                    this.field1483[arg6][arg7 + 1][arg1] = 50;
                    this.field1483[arg6][arg7 + 1][arg1 + 1] = 50;
                }
                if (var15.field1079) {
                    this.field1481[arg6][arg7 + 1][arg1] |= 0x249;
                }
            } else if (arg3 == 3) {
                if (var15.field1054) {
                    this.field1483[arg6][arg7][arg1] = 50;
                    this.field1483[arg6][arg7 + 1][arg1] = 50;
                }
                if (var15.field1079) {
                    this.field1481[arg6][arg7][arg1] |= 0x492;
                }
            }
            if (var15.field1059 && arg4 != null) {
                arg4.method2((byte) 61, arg1, arg7, var15.field1037, arg3, arg2);
            }
            if (var15.field1081 != 16) {
                arg8.method403(arg1, arg6, (byte) -107, var15.field1081, arg7);
            }
        } else if (arg2 == 1) {
            class56 var21;
            if (var15.field1078 == -1 && var15.field1046 == null) {
                var21 = var15.method338(1, arg3, var10, var11, var12, var13, -1);
            } else {
                var21 = new class68(var13, var12, (byte) 7, var15.field1078, 1, true, var11, var10, arg0, arg3);
            }
            arg8.method395(field1488, arg6, 0, field1480[arg3], var16, arg1, var17, var21, var14, arg7, null);
            if (var15.field1054) {
                if (arg3 == 0) {
                    this.field1483[arg6][arg7][arg1 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field1483[arg6][arg7 + 1][arg1 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field1483[arg6][arg7 + 1][arg1] = 50;
                } else if (arg3 == 3) {
                    this.field1483[arg6][arg7][arg1] = 50;
                }
            }
            if (var15.field1059 && arg4 != null) {
                arg4.method2((byte) 61, arg1, arg7, var15.field1037, arg3, arg2);
            }
        } else if (arg2 == 2) {
            int var22 = arg3 + 1 & 0x3;
            class56 var23;
            class56 var24;
            if (var15.field1078 == -1 && var15.field1046 == null) {
                var23 = var15.method338(2, arg3 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method338(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class68(var13, var12, (byte) 7, var15.field1078, 2, true, var11, var10, arg0, arg3 + 4);
                var24 = new class68(var13, var12, (byte) 7, var15.field1078, 2, true, var11, var10, arg0, var22);
            }
            arg8.method395(field1488, arg6, field1465[var22], field1465[arg3], var16, arg1, var17, var23, var14, arg7, var24);
            if (var15.field1079) {
                if (arg3 == 0) {
                    this.field1481[arg6][arg7][arg1] |= 0x249;
                    this.field1481[arg6][arg7][arg1 + 1] |= 0x492;
                } else if (arg3 == 1) {
                    this.field1481[arg6][arg7][arg1 + 1] |= 0x492;
                    this.field1481[arg6][arg7 + 1][arg1] |= 0x249;
                } else if (arg3 == 2) {
                    this.field1481[arg6][arg7 + 1][arg1] |= 0x249;
                    this.field1481[arg6][arg7][arg1] |= 0x492;
                } else if (arg3 == 3) {
                    this.field1481[arg6][arg7][arg1] |= 0x492;
                    this.field1481[arg6][arg7][arg1] |= 0x249;
                }
            }
            if (var15.field1059 && arg4 != null) {
                arg4.method2((byte) 61, arg1, arg7, var15.field1037, arg3, arg2);
            }
            if (var15.field1081 != 16) {
                arg8.method403(arg1, arg6, (byte) -107, var15.field1081, arg7);
            }
        } else if (arg2 == 3) {
            class56 var25;
            if (var15.field1078 == -1 && var15.field1046 == null) {
                var25 = var15.method338(3, arg3, var10, var11, var12, var13, -1);
            } else {
                var25 = new class68(var13, var12, (byte) 7, var15.field1078, 3, true, var11, var10, arg0, arg3);
            }
            arg8.method395(field1488, arg6, 0, field1480[arg3], var16, arg1, var17, var25, var14, arg7, null);
            if (var15.field1054) {
                if (arg3 == 0) {
                    this.field1483[arg6][arg7][arg1 + 1] = 50;
                } else if (arg3 == 1) {
                    this.field1483[arg6][arg7 + 1][arg1 + 1] = 50;
                } else if (arg3 == 2) {
                    this.field1483[arg6][arg7 + 1][arg1] = 50;
                } else if (arg3 == 3) {
                    this.field1483[arg6][arg7][arg1] = 50;
                }
            }
            if (var15.field1059 && arg4 != null) {
                arg4.method2((byte) 61, arg1, arg7, var15.field1037, arg3, arg2);
            }
        } else if (arg2 == 9) {
            class56 var26;
            if (var15.field1078 == -1 && var15.field1046 == null) {
                var26 = var15.method338(arg2, arg3, var10, var11, var12, var13, -1);
            } else {
                var26 = new class68(var13, var12, (byte) 7, var15.field1078, arg2, true, var11, var10, arg0, arg3);
            }
            arg8.method397(46140, arg1, var26, 0, var16, 1, 1, arg7, arg6, var14, var17);
            if (var15.field1059 && arg4 != null) {
                arg4.method3(var15.field1038, arg1, arg3, arg7, var15.field1037, 0, var15.field1071);
            }
        } else {
            if (var15.field1075) {
                if (arg3 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg3 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg3 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg2 == 4) {
                class56 var31;
                if (var15.field1078 == -1 && var15.field1046 == null) {
                    var31 = var15.method338(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class68(var13, var12, (byte) 7, var15.field1078, 4, true, var11, var10, arg0, 0);
                }
                arg8.method396(arg1, var14, 0, arg3 * 512, 0, true, var16, var17, arg6, field1465[arg3], var31, arg7);
            } else if (arg2 == 5) {
                int var32 = 16;
                int var33 = arg8.method413(arg6, arg7, arg1);
                if (var33 > 0) {
                    var32 = class35.method341(var33 >> 14 & 0x7FFF).field1081;
                }
                class56 var34;
                if (var15.field1078 == -1 && var15.field1046 == null) {
                    var34 = var15.method338(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class68(var13, var12, (byte) 7, var15.field1078, 4, true, var11, var10, arg0, 0);
                }
                arg8.method396(arg1, var14, field1476[arg3] * var32, arg3 * 512, field1487[arg3] * var32, true, var16, var17, arg6, field1465[arg3], var34, arg7);
            } else if (arg2 == 6) {
                class56 var35;
                if (var15.field1078 == -1 && var15.field1046 == null) {
                    var35 = var15.method338(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class68(var13, var12, (byte) 7, var15.field1078, 4, true, var11, var10, arg0, 0);
                }
                arg8.method396(arg1, var14, 0, arg3, 0, true, var16, var17, arg6, 256, var35, arg7);
            } else if (arg2 == 7) {
                class56 var36;
                if (var15.field1078 == -1 && var15.field1046 == null) {
                    var36 = var15.method338(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class68(var13, var12, (byte) 7, var15.field1078, 4, true, var11, var10, arg0, 0);
                }
                arg8.method396(arg1, var14, 0, arg3, 0, true, var16, var17, arg6, 512, var36, arg7);
            } else if (arg2 == 8) {
                class56 var37;
                if (var15.field1078 == -1 && var15.field1046 == null) {
                    var37 = var15.method338(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class68(var13, var12, (byte) 7, var15.field1078, 4, true, var11, var10, arg0, 0);
                }
                arg8.method396(arg1, var14, 0, arg3, 0, true, var16, var17, arg6, 768, var37, arg7);
            }
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method484(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 <= 0) {
            throw new NullPointerException();
        }
        boolean var4 = true;
        class25 var5 = new class25(arg1, 713);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method259();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method259();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method245() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class35 var17 = class35.method341(var6);
                        if (var14 != 22 || !field1469 || var17.field1060 || var17.field1084) {
                            var4 &= var17.method342(false);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method259();
                if (var10 == 0) {
                    break;
                }
                var5.method245();
            }
        }
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method485(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field1475 = !field1475;
        }
        class35 var3 = class35.method341(arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method337((byte) 8, arg0);
    }

    @OriginalMember(owner = "client!SNNOFNNG", name = "a", descriptor = "([LAOKWRKNA;ZLPOACSVST;)V")
    public final void method486(class1[] arg0, boolean arg1, class46 arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1482[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1482[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method4(var111, field1467, var110);
                        }
                    }
                }
            }
        }
        field1457 += (int) (Math.random() * 5.0D) - 2;
        if (field1457 < -8) {
            field1457 = -8;
        }
        if (field1457 > 8) {
            field1457 = 8;
        }
        field1477 += (int) (Math.random() * 5.0D) - 2;
        if (field1477 < -16) {
            field1477 = -16;
        }
        if (field1477 > 16) {
            field1477 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1483[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1474 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1473 - 1; var101++) {
                    int var102 = this.field1484[var5][var101 + 1][var56] - this.field1484[var5][var101 - 1][var56];
                    int var103 = this.field1484[var5][var101][var56 + 1] - this.field1484[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1468[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1474; var57++) {
                this.field1458[var57] = 0;
                this.field1459[var57] = 0;
                this.field1460[var57] = 0;
                this.field1461[var57] = 0;
                this.field1462[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1473 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1474; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1473) {
                        int var96 = this.field1464[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class67 var97 = class67.field1661[var96 - 1];
                            this.field1458[var61] += var97.field1670;
                            this.field1459[var61] += var97.field1668;
                            this.field1460[var61] += var97.field1669;
                            this.field1461[var61] += var97.field1671;
                            var10002 = this.field1462[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1473) {
                        int var99 = this.field1464[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class67 var100 = class67.field1661[var99 - 1];
                            this.field1458[var61] -= var100.field1670;
                            this.field1459[var61] -= var100.field1668;
                            this.field1460[var61] -= var100.field1669;
                            this.field1461[var61] -= var100.field1671;
                            var10002 = this.field1462[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1473 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1474 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1474) {
                            var62 += this.field1458[var68];
                            var63 += this.field1459[var68];
                            var64 += this.field1460[var68];
                            var65 += this.field1461[var68];
                            var66 += this.field1462[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1474) {
                            var62 -= this.field1458[var69];
                            var63 -= this.field1459[var69];
                            var64 -= this.field1460[var69];
                            var65 -= this.field1461[var69];
                            var66 -= this.field1462[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1474 - 1 && (!field1469 || (this.field1482[0][var58][var67] & 0x2) != 0 || (this.field1482[var5][var58][var67] & 0x10) == 0 && this.method466(var5, (byte) 78, var67, var58) == field1485)) {
                            if (var5 < field1472) {
                                field1472 = var5;
                            }
                            int var70 = this.field1464[var5][var58][var67] & 0xFF;
                            int var71 = this.field1466[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1484[var5][var58][var67];
                                int var73 = this.field1484[var5][var58 + 1][var67];
                                int var74 = this.field1484[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1484[var5][var58][var67 + 1];
                                int var76 = this.field1468[var58][var67];
                                int var77 = this.field1468[var58 + 1][var67];
                                int var78 = this.field1468[var58 + 1][var67 + 1];
                                int var79 = this.field1468[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method479(var82, var83, var84);
                                    int var85 = field1457 + var82 & 0xFF;
                                    int var86 = field1477 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method479(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1478[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class67.field1661[var71 - 1].field1666) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1481[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class70.field1723[method477(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg2.method392(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method477(var80, var76), method477(var80, var77), method477(var80, var78), method477(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1478[var5][var58][var67] + 1;
                                    byte var90 = this.field1470[var5][var58][var67];
                                    class67 var91 = class67.field1661[var71 - 1];
                                    int var92 = var91.field1664;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class70.method591(var92, (byte) 3);
                                        var94 = -1;
                                    } else if (var91.field1663 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class70.field1723[this.method469(var91.field1672, 96)];
                                    } else {
                                        var94 = this.method479(var91.field1667, var91.field1668, var91.field1669);
                                        var93 = class70.field1723[this.method469(var91.field1672, 96)];
                                    }
                                    arg2.method392(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method477(var80, var76), method477(var80, var77), method477(var80, var78), method477(var80, var79), this.method469(var94, var76), this.method469(var94, var77), this.method469(var94, var78), this.method469(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1474 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1473 - 1; var60++) {
                    arg2.method391(var5, var60, var59, this.method466(var5, (byte) 78, var59, var60));
                }
            }
        }
        arg2.method418(-50, -38138, -50, -10);
        if (arg1) {
            return;
        }
        for (int var6 = 0; var6 < this.field1473; var6++) {
            for (int var47 = 0; var47 < this.field1474; var47++) {
                if ((this.field1482[1][var6][var47] & 0x2) == 2) {
                    arg2.method389(var47, (byte) -49, var6);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field1474; var12++) {
                    for (int var13 = 0; var13 <= this.field1473; var13++) {
                        if ((this.field1481[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1481[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1474 && (this.field1481[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1481[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1481[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1484[var17][var13][var14] - var21;
                                int var23 = this.field1484[var16][var13][var14];
                                class46.method390(var13 * 128, var13 * 128, var23, var22, var10, 1, var14 * 128, var15 * 128 + 128, field1479);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1481[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1481[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1481[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1473 && (this.field1481[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1481[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1481[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1484[var29][var26][var12] - var33;
                                int var35 = this.field1484[var28][var26][var12];
                                class46.method390(var26 * 128, var27 * 128 + 128, var35, var34, var10, 2, var12 * 128, var12 * 128, field1479);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1481[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1481[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1481[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1474 && (this.field1481[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1481[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1473) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1481[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field1484[var11][var38][var40];
                                class46.method390(var38 * 128, var39 * 128 + 128, var44, var44, var10, 4, var40 * 128, var41 * 128 + 128, field1479);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1481[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
