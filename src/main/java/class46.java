import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RQCEQFSS")
public class class46 {

    @OriginalMember(owner = "client!RQCEQFSS", name = "i", descriptor = "Z")
    private boolean field1303 = false;

    @OriginalMember(owner = "client!RQCEQFSS", name = "D", descriptor = "I")
    private int field1324 = 953;

    @OriginalMember(owner = "client!RQCEQFSS", name = "x", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!RQCEQFSS", name = "y", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client!RQCEQFSS", name = "o", descriptor = "[[[I")
    private int[][][] field1309;

    @OriginalMember(owner = "client!RQCEQFSS", name = "u", descriptor = "[[[B")
    private byte[][][] field1315;

    @OriginalMember(owner = "client!RQCEQFSS", name = "m", descriptor = "[[[B")
    private byte[][][] field1307;

    @OriginalMember(owner = "client!RQCEQFSS", name = "l", descriptor = "[[[B")
    private byte[][][] field1306;

    @OriginalMember(owner = "client!RQCEQFSS", name = "n", descriptor = "[[[B")
    private byte[][][] field1308;

    @OriginalMember(owner = "client!RQCEQFSS", name = "A", descriptor = "[[[B")
    private byte[][][] field1321;

    @OriginalMember(owner = "client!RQCEQFSS", name = "v", descriptor = "[[[I")
    private int[][][] field1316;

    @OriginalMember(owner = "client!RQCEQFSS", name = "C", descriptor = "[[[B")
    private byte[][][] field1323;

    @OriginalMember(owner = "client!RQCEQFSS", name = "d", descriptor = "[[I")
    private int[][] field1298;

    @OriginalMember(owner = "client!RQCEQFSS", name = "p", descriptor = "[I")
    private int[] field1310;

    @OriginalMember(owner = "client!RQCEQFSS", name = "q", descriptor = "[I")
    private int[] field1311;

    @OriginalMember(owner = "client!RQCEQFSS", name = "r", descriptor = "[I")
    private int[] field1312;

    @OriginalMember(owner = "client!RQCEQFSS", name = "s", descriptor = "[I")
    private int[] field1313;

    @OriginalMember(owner = "client!RQCEQFSS", name = "t", descriptor = "[I")
    private int[] field1314;

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "Z")
    public static boolean field1295 = true;

    @OriginalMember(owner = "client!RQCEQFSS", name = "c", descriptor = "[I")
    private static final int[] field1297 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!RQCEQFSS", name = "f", descriptor = "[I")
    private static final int[] field1300 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!RQCEQFSS", name = "h", descriptor = "[I")
    private static final int[] field1302 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!RQCEQFSS", name = "j", descriptor = "I")
    private static int field1304 = 7;

    @OriginalMember(owner = "client!RQCEQFSS", name = "k", descriptor = "I")
    private static int field1305 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!RQCEQFSS", name = "w", descriptor = "I")
    public static int field1317 = 99;

    @OriginalMember(owner = "client!RQCEQFSS", name = "z", descriptor = "[I")
    private static final int[] field1320 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!RQCEQFSS", name = "B", descriptor = "I")
    private static int field1322 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!RQCEQFSS", name = "b", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!RQCEQFSS", name = "e", descriptor = "I")
    private int field1299;

    @OriginalMember(owner = "client!RQCEQFSS", name = "g", descriptor = "Z")
    private static boolean field1301;

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIII)V")
    public final void method461(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var9 = 0; var9 < 8; var9++) {
                this.field1309[arg1][arg0 + var5][arg3 + var9] = 0;
            }
        }
        if (arg2 <= 0) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        if (arg0 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1309[arg1][arg0][arg3 + var7] = this.field1309[arg1][arg0 - 1][arg3 + var7];
            }
        }
        if (arg3 > 0) {
            for (int var8 = 1; var8 < 8; var8++) {
                this.field1309[arg1][arg0 + var8][arg3] = this.field1309[arg1][arg0 + var8][arg3 - 1];
            }
        }
        if (arg0 > 0 && this.field1309[arg1][arg0 - 1][arg3] != 0) {
            this.field1309[arg1][arg0][arg3] = this.field1309[arg1][arg0 - 1][arg3];
        } else if (arg3 > 0 && this.field1309[arg1][arg0][arg3 - 1] != 0) {
            this.field1309[arg1][arg0][arg3] = this.field1309[arg1][arg0][arg3 - 1];
        } else if (arg0 > 0 && arg3 > 0 && this.field1309[arg1][arg0 - 1][arg3 - 1] != 0) {
            this.field1309[arg1][arg0][arg3] = this.field1309[arg1][arg0 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIIIZ)V")
    public final void method462(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var6 = arg2; var6 <= arg0 + arg2; var6++) {
            for (int var7 = arg3; var7 <= arg1 + arg3; var7++) {
                if (var7 >= 0 && var7 < this.field1318 && var6 >= 0 && var6 < this.field1319) {
                    this.field1323[0][var7][var6] = 127;
                    if (arg3 == var7 && var7 > 0) {
                        this.field1309[0][var7][var6] = this.field1309[0][var7 - 1][var6];
                    }
                    if (arg1 + arg3 == var7 && var7 < this.field1318 - 1) {
                        this.field1309[0][var7][var6] = this.field1309[0][var7 + 1][var6];
                    }
                    if (arg2 == var6 && var6 > 0) {
                        this.field1309[0][var7][var6] = this.field1309[0][var7][var6 - 1];
                    }
                    if (arg0 + arg2 == var6 && var6 < this.field1319 - 1) {
                        this.field1309[0][var7][var6] = this.field1309[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (!arg4) {
            ;
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "<init>", descriptor = "([[[B[[[IIII)V")
    public class46(byte[][][] arg0, int[][][] arg1, int arg2, int arg3, int arg4) {
        field1317 = 99;
        this.field1318 = arg4;
        this.field1319 = arg2;
        this.field1309 = arg1;
        this.field1315 = arg0;
        this.field1307 = new byte[4][this.field1318][this.field1319];
        this.field1306 = new byte[4][this.field1318][this.field1319];
        this.field1308 = new byte[4][this.field1318][this.field1319];
        this.field1321 = new byte[4][this.field1318][this.field1319];
        this.field1316 = new int[4][this.field1318 + 1][this.field1319 + 1];
        this.field1323 = new byte[4][this.field1318 + 1][this.field1319 + 1];
        int var6 = 5 / arg3;
        this.field1298 = new int[this.field1318 + 1][this.field1319 + 1];
        this.field1310 = new int[this.field1319];
        this.field1311 = new int[this.field1319];
        this.field1312 = new int[this.field1319];
        this.field1313 = new int[this.field1319];
        this.field1314 = new int[this.field1319];
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "([BII[LRUPQNTVM;III)V")
    public final void method463(byte[] arg0, int arg1, int arg2, class47[] arg3, int arg4, int arg5, int arg6) {
        if (arg4 < 1 || arg4 > 1) {
            this.field1299 = -360;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg5 + var13 > 0 && arg5 + var13 < 103 && arg6 + var14 > 0 && arg6 + var14 < 103) {
                        arg3[var8].field1336[arg5 + var13][arg6 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class3 var9 = new class3(arg0, -990);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method470(0, arg5 + var11, arg2, var10, arg6 + var12, arg1, var9, -15415);
                }
            }
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIILPJTXDRVG;[B[LRUPQNTVM;)V")
    public final void method464(int arg0, int arg1, int arg2, class41 arg3, byte[] arg4, class47[] arg5) {
        class3 var7 = new class3(arg4, -990);
        if (arg1 < 3 || arg1 > 3) {
            return;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method68();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method68();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method54();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg2 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1315[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class47 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg5[var20];
                    }
                    this.method478(false, var14, var18, arg3, var8, var19, var17, var21, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(III)I")
    private static final int method465(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method480(var3, var5);
        int var8 = method480(var3 + 1, var5);
        int var9 = method480(var3, var5 + 1);
        int var10 = method480(var3 + 1, var5 + 1);
        int var11 = method479(var7, var8, var4, arg2);
        int var12 = method479(var9, var10, var4, arg2);
        return method479(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(ZI[BI)Z")
    public static final boolean method466(boolean arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        boolean var5 = true;
        class3 var6 = new class3(arg2, -990);
        int var7 = -1;
        label55: while (true) {
            int var8 = var6.method68();
            if (var8 == 0) {
                return var5;
            }
            var7 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var6.method68();
                    if (var12 == 0) {
                        continue label55;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var6.method54() >> 2;
                    int var16 = arg3 + var14;
                    int var17 = arg1 + var13;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class68 var18 = class68.method575(var7);
                        if (var15 != 22 || !field1295 || var18.field1700 || var18.field1719) {
                            var5 &= var18.method579(-740);
                            var10 = true;
                        }
                    }
                }
                int var11 = var6.method68();
                if (var11 == 0) {
                    break;
                }
                var6.method54();
            }
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIII[B[LRUPQNTVM;IIII)V")
    public final void method467(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class47[] arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg6 + var11 > 0 && arg6 + var11 < 103 && arg2 + var16 > 0 && arg2 + var16 < 103) {
                    arg5[arg3].field1336[arg6 + var11][arg2 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class3 var12 = new class3(arg4, -990);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg8 == var13 && var14 >= arg1 && var14 < arg1 + 8 && var15 >= arg7 && var15 < arg7 + 8) {
                        this.method470(arg0, arg6 + class35.method344(var14 & 0x7, var15 & 0x7, arg0, 0), 0, arg3, arg2 + class35.method345(var15 & 0x7, arg0, var14 & 0x7, 1), 0, var12, -15415);
                    } else {
                        this.method470(0, -1, 0, 0, -1, 0, var12, -15415);
                    }
                }
            }
        }
        while (arg9 >= 0) {
            this.field1303 = !this.field1303;
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(II)I")
    private static final int method468(int arg0, int arg1) {
        int var2 = method465(arg0 + 45365, arg1 + 91923, 4) + (method465(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method465(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "b", descriptor = "(III)Z")
    public static final boolean method469(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field1301 = !field1301;
        }
        class68 var3 = class68.method575(arg1);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method585(arg2, 226);
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIIIIILBFQIDHPO;I)V")
    private final void method470(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class3 arg6, int arg7) {
        if (arg7 != -15415) {
            for (int var9 = 1; var9 > 0; var9++) {
            }
        }
        if (arg1 < 0 || arg1 >= 104 || arg4 < 0 || arg4 >= 104) {
            while (true) {
                int var12 = arg6.method54();
                if (var12 == 0) {
                    return;
                }
                if (var12 == 1) {
                    arg6.method54();
                    return;
                }
                if (var12 <= 49) {
                    arg6.method54();
                }
            }
        }
        this.field1315[arg3][arg1][arg4] = 0;
        while (true) {
            int var10 = arg6.method54();
            if (var10 == 0) {
                if (arg3 == 0) {
                    this.field1309[0][arg1][arg4] = -method468(arg1 + arg2 + 932731, arg4 + 556238 + arg5) * 8;
                    return;
                } else {
                    this.field1309[arg3][arg1][arg4] = this.field1309[arg3 - 1][arg1][arg4] - 240;
                    return;
                }
            }
            if (var10 == 1) {
                int var11 = arg6.method54();
                if (var11 == 1) {
                    var11 = 0;
                }
                if (arg3 == 0) {
                    this.field1309[0][arg1][arg4] = -var11 * 8;
                    return;
                }
                this.field1309[arg3][arg1][arg4] = this.field1309[arg3 - 1][arg1][arg4] - var11 * 8;
                return;
            }
            if (var10 <= 49) {
                this.field1306[arg3][arg1][arg4] = arg6.method55();
                this.field1308[arg3][arg1][arg4] = (byte) ((var10 - 2) / 4);
                this.field1321[arg3][arg1][arg4] = (byte) (var10 + arg0 - 2 & 0x3);
            } else if (var10 <= 81) {
                this.field1315[arg3][arg1][arg4] = (byte) (var10 - 49);
            } else {
                this.field1307[arg3][arg1][arg4] = (byte) (var10 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "b", descriptor = "(II)I")
    private static final int method471(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(BII[[[IIIIIILRUPQNTVM;LPJTXDRVG;)V")
    public static final void method472(byte arg0, int arg1, int arg2, int[][][] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class47 arg9, class41 arg10) {
        if (arg0 != 1) {
            field1304 = -31;
        }
        int var11 = arg3[arg1][arg8][arg6];
        int var12 = arg3[arg1][arg8 + 1][arg6];
        int var13 = arg3[arg1][arg8 + 1][arg6 + 1];
        int var14 = arg3[arg1][arg8][arg6 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class68 var16 = class68.method575(arg4);
        int var17 = (arg4 << 14) + (arg6 << 7) + arg8 + 1073741824;
        if (!var16.field1700) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg7 << 6) + arg5);
        if (arg5 == 22) {
            class31 var19;
            if (var16.field1737 == -1 && var16.field1695 == null) {
                var19 = var16.method580(22, arg7, var11, var12, var13, var14, -1);
            } else {
                var19 = new class62(var14, arg4, field1304, true, var11, arg7, var12, var13, 22, var16.field1737);
            }
            arg10.method379(11875, var19, var18, var15, arg6, arg8, arg2, var17);
            if (var16.field1735 && var16.field1700) {
                arg9.method486(arg8, false, arg6);
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class31 var39;
            if (var16.field1737 == -1 && var16.field1695 == null) {
                var39 = var16.method580(10, arg7, var11, var12, var13, var14, -1);
            } else {
                var39 = new class62(var14, arg4, field1304, true, var11, arg7, var12, var13, 10, var16.field1737);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg5 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg7 == 1 || arg7 == 3) {
                    var41 = var16.field1715;
                    var42 = var16.field1707;
                } else {
                    var41 = var16.field1707;
                    var42 = var16.field1715;
                }
                arg10.method383(arg8, var40, 999, arg2, var18, var42, var41, var17, var15, arg6, var39);
            }
            if (var16.field1735) {
                arg9.method485(arg8, var16.field1707, var16.field1704, arg7, var16.field1715, arg6, 0);
            }
        } else if (arg5 >= 12) {
            class31 var20;
            if (var16.field1737 == -1 && var16.field1695 == null) {
                var20 = var16.method580(arg5, arg7, var11, var12, var13, var14, -1);
            } else {
                var20 = new class62(var14, arg4, field1304, true, var11, arg7, var12, var13, arg5, var16.field1737);
            }
            arg10.method383(arg8, 0, 999, arg2, var18, 1, 1, var17, var15, arg6, var20);
            if (var16.field1735) {
                arg9.method485(arg8, var16.field1707, var16.field1704, arg7, var16.field1715, arg6, 0);
            }
        } else if (arg5 == 0) {
            class31 var21;
            if (var16.field1737 == -1 && var16.field1695 == null) {
                var21 = var16.method580(0, arg7, var11, var12, var13, var14, -1);
            } else {
                var21 = new class62(var14, arg4, field1304, true, var11, arg7, var12, var13, 0, var16.field1737);
            }
            arg10.method381(null, (byte) 33, var17, field1297[arg7], 0, var15, arg2, var21, arg8, var18, arg6);
            if (var16.field1735) {
                arg9.method484(arg8, arg7, false, var16.field1704, arg5, arg6);
            }
        } else if (arg5 == 1) {
            class31 var22;
            if (var16.field1737 == -1 && var16.field1695 == null) {
                var22 = var16.method580(1, arg7, var11, var12, var13, var14, -1);
            } else {
                var22 = new class62(var14, arg4, field1304, true, var11, arg7, var12, var13, 1, var16.field1737);
            }
            arg10.method381(null, (byte) 33, var17, field1302[arg7], 0, var15, arg2, var22, arg8, var18, arg6);
            if (var16.field1735) {
                arg9.method484(arg8, arg7, false, var16.field1704, arg5, arg6);
            }
        } else if (arg5 == 2) {
            int var23 = arg7 + 1 & 0x3;
            class31 var24;
            class31 var25;
            if (var16.field1737 == -1 && var16.field1695 == null) {
                var24 = var16.method580(2, arg7 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method580(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class62(var14, arg4, field1304, true, var11, arg7 + 4, var12, var13, 2, var16.field1737);
                var25 = new class62(var14, arg4, field1304, true, var11, var23, var12, var13, 2, var16.field1737);
            }
            arg10.method381(var25, (byte) 33, var17, field1297[arg7], field1297[var23], var15, arg2, var24, arg8, var18, arg6);
            if (var16.field1735) {
                arg9.method484(arg8, arg7, false, var16.field1704, arg5, arg6);
            }
        } else if (arg5 == 3) {
            class31 var26;
            if (var16.field1737 == -1 && var16.field1695 == null) {
                var26 = var16.method580(3, arg7, var11, var12, var13, var14, -1);
            } else {
                var26 = new class62(var14, arg4, field1304, true, var11, arg7, var12, var13, 3, var16.field1737);
            }
            arg10.method381(null, (byte) 33, var17, field1302[arg7], 0, var15, arg2, var26, arg8, var18, arg6);
            if (var16.field1735) {
                arg9.method484(arg8, arg7, false, var16.field1704, arg5, arg6);
            }
        } else if (arg5 == 9) {
            class31 var27;
            if (var16.field1737 == -1 && var16.field1695 == null) {
                var27 = var16.method580(arg5, arg7, var11, var12, var13, var14, -1);
            } else {
                var27 = new class62(var14, arg4, field1304, true, var11, arg7, var12, var13, arg5, var16.field1737);
            }
            arg10.method383(arg8, 0, 999, arg2, var18, 1, 1, var17, var15, arg6, var27);
            if (var16.field1735) {
                arg9.method485(arg8, var16.field1707, var16.field1704, arg7, var16.field1715, arg6, 0);
            }
        } else {
            if (var16.field1694) {
                if (arg7 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg7 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg7 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg5 == 4) {
                class31 var32;
                if (var16.field1737 == -1 && var16.field1695 == null) {
                    var32 = var16.method580(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class62(var14, arg4, field1304, true, var11, 0, var12, var13, 4, var16.field1737);
                }
                arg10.method382(var15, var32, false, var17, arg2, var18, field1297[arg7], arg6, 0, arg7 * 512, 0, arg8);
            } else if (arg5 == 5) {
                int var33 = 16;
                int var34 = arg10.method399(arg2, arg8, arg6);
                if (var34 > 0) {
                    var33 = class68.method575(var34 >> 14 & 0x7FFF).field1724;
                }
                class31 var35;
                if (var16.field1737 == -1 && var16.field1695 == null) {
                    var35 = var16.method580(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class62(var14, arg4, field1304, true, var11, 0, var12, var13, 4, var16.field1737);
                }
                arg10.method382(var15, var35, false, var17, arg2, var18, field1297[arg7], arg6, field1320[arg7] * var33, arg7 * 512, field1300[arg7] * var33, arg8);
            } else if (arg5 == 6) {
                class31 var36;
                if (var16.field1737 == -1 && var16.field1695 == null) {
                    var36 = var16.method580(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class62(var14, arg4, field1304, true, var11, 0, var12, var13, 4, var16.field1737);
                }
                arg10.method382(var15, var36, false, var17, arg2, var18, 256, arg6, 0, arg7, 0, arg8);
            } else if (arg5 == 7) {
                class31 var37;
                if (var16.field1737 == -1 && var16.field1695 == null) {
                    var37 = var16.method580(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class62(var14, arg4, field1304, true, var11, 0, var12, var13, 4, var16.field1737);
                }
                arg10.method382(var15, var37, false, var17, arg2, var18, 512, arg6, 0, arg7, 0, arg8);
            } else if (arg5 == 8) {
                class31 var38;
                if (var16.field1737 == -1 && var16.field1695 == null) {
                    var38 = var16.method580(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class62(var14, arg4, field1304, true, var11, 0, var12, var13, 4, var16.field1737);
                }
                arg10.method382(var15, var38, false, var17, arg2, var18, 768, arg6, 0, arg7, 0, arg8);
            }
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "c", descriptor = "(II)I")
    private static final int method473(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(LPJTXDRVG;[LRUPQNTVM;I)V")
    public final void method474(class41 arg0, class47[] arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1315[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1315[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method486(var110, false, var111);
                        }
                    }
                }
            }
        }
        field1305 += (int) (Math.random() * 5.0D) - 2;
        if (field1305 < -8) {
            field1305 = -8;
        }
        if (field1305 > 8) {
            field1305 = 8;
        }
        field1322 += (int) (Math.random() * 5.0D) - 2;
        if (field1322 < -16) {
            field1322 = -16;
        }
        if (field1322 > 16) {
            field1322 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1323[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1319 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1318 - 1; var101++) {
                    int var102 = this.field1309[var5][var101 + 1][var56] - this.field1309[var5][var101 - 1][var56];
                    int var103 = this.field1309[var5][var101][var56 + 1] - this.field1309[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1298[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1319; var57++) {
                this.field1310[var57] = 0;
                this.field1311[var57] = 0;
                this.field1312[var57] = 0;
                this.field1313[var57] = 0;
                this.field1314[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1318 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1319; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1318) {
                        int var96 = this.field1307[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class19 var97 = class19.field850[var96 - 1];
                            this.field1310[var61] += var97.field859;
                            this.field1311[var61] += var97.field857;
                            this.field1312[var61] += var97.field858;
                            this.field1313[var61] += var97.field860;
                            var10002 = this.field1314[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1318) {
                        int var99 = this.field1307[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class19 var100 = class19.field850[var99 - 1];
                            this.field1310[var61] -= var100.field859;
                            this.field1311[var61] -= var100.field857;
                            this.field1312[var61] -= var100.field858;
                            this.field1313[var61] -= var100.field860;
                            var10002 = this.field1314[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1318 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1319 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1319) {
                            var62 += this.field1310[var68];
                            var63 += this.field1311[var68];
                            var64 += this.field1312[var68];
                            var65 += this.field1313[var68];
                            var66 += this.field1314[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1319) {
                            var62 -= this.field1310[var69];
                            var63 -= this.field1311[var69];
                            var64 -= this.field1312[var69];
                            var65 -= this.field1313[var69];
                            var66 -= this.field1314[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1319 - 1 && (!field1295 || (this.field1315[0][var58][var67] & 0x2) != 0 || (this.field1315[var5][var58][var67] & 0x10) == 0 && this.method481(var67, var5, var58, -42028) == field1296)) {
                            if (var5 < field1317) {
                                field1317 = var5;
                            }
                            int var70 = this.field1307[var5][var58][var67] & 0xFF;
                            int var71 = this.field1306[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1309[var5][var58][var67];
                                int var73 = this.field1309[var5][var58 + 1][var67];
                                int var74 = this.field1309[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1309[var5][var58][var67 + 1];
                                int var76 = this.field1298[var58][var67];
                                int var77 = this.field1298[var58 + 1][var67];
                                int var78 = this.field1298[var58 + 1][var67 + 1];
                                int var79 = this.field1298[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method482(var82, var83, var84);
                                    int var85 = field1305 + var82 & 0xFF;
                                    int var86 = field1322 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method482(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1308[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class19.field850[var71 - 1].field855) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1316[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class42.field1222[method471(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method378(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method471(var80, var76), method471(var80, var77), method471(var80, var78), method471(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1308[var5][var58][var67] + 1;
                                    byte var90 = this.field1321[var5][var58][var67];
                                    class19 var91 = class19.field850[var71 - 1];
                                    int var92 = var91.field853;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class42.method430(var92, (byte) 9);
                                        var94 = -1;
                                    } else if (var91.field852 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class42.field1222[this.method477(var91.field861, 96)];
                                    } else {
                                        var94 = this.method482(var91.field856, var91.field857, var91.field858);
                                        var93 = class42.field1222[this.method477(var91.field861, 96)];
                                    }
                                    arg0.method378(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method471(var80, var76), method471(var80, var77), method471(var80, var78), method471(var80, var79), this.method477(var94, var76), this.method477(var94, var77), this.method477(var94, var78), this.method477(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1319 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1318 - 1; var60++) {
                    arg0.method377(var5, var60, var59, this.method481(var59, var5, var60, -42028));
                }
            }
        }
        arg0.method404(-50, -50, (byte) 0, -10);
        for (int var6 = 0; var6 < this.field1318; var6++) {
            for (int var47 = 0; var47 < this.field1319; var47++) {
                if ((this.field1315[1][var6][var47] & 0x2) == 2) {
                    arg0.method375(var47, this.field1324, var6);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        if (arg2 != 0) {
            return;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field1319; var12++) {
                    for (int var13 = 0; var13 <= this.field1318; var13++) {
                        if ((this.field1316[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1316[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1319 && (this.field1316[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1316[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1316[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1309[var17][var13][var14] - var21;
                                int var23 = this.field1309[var16][var13][var14];
                                class41.method376(var13 * 128, var15 * 128 + 128, var14 * 128, var22, var23, var13 * 128, false, var10, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1316[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1316[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1316[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1318 && (this.field1316[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1316[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1316[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1309[var29][var26][var12] - var33;
                                int var35 = this.field1309[var28][var26][var12];
                                class41.method376(var26 * 128, var12 * 128, var12 * 128, var34, var35, var27 * 128 + 128, false, var10, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1316[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1316[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1316[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1319 && (this.field1316[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1316[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1318) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1316[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field1309[var11][var38][var40];
                                class41.method376(var38 * 128, var41 * 128 + 128, var40 * 128, var44, var44, var39 * 128 + 128, false, var10, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1316[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(LBPHGILGU;LBFQIDHPO;I)V")
    public static final void method475(class7 arg0, class3 arg1, int arg2) {
        if (arg2 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = -1;
        while (true) {
            int var5 = arg1.method68();
            if (var5 == 0) {
                return;
            }
            var4 += var5;
            class68 var6 = class68.method575(var4);
            var6.method581(arg0, true);
            while (true) {
                int var7 = arg1.method68();
                if (var7 == 0) {
                    break;
                }
                arg1.method54();
            }
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(IIBLPJTXDRVG;II[LRUPQNTVM;I[BII)V")
    public final void method476(int arg0, int arg1, byte arg2, class41 arg3, int arg4, int arg5, class47[] arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        class3 var12 = new class3(arg8, -990);
        int var13 = -1;
        if (arg2 != 8) {
            this.field1303 = !this.field1303;
        }
        while (true) {
            int var14 = var12.method68();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method68();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method54();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg9 == var19 && var18 >= arg7 && var18 < arg7 + 8 && var17 >= arg0 && var17 < arg0 + 8) {
                    class68 var23 = class68.method575(var13);
                    int var24 = arg10 + class35.method346(var17 & 0x7, var23.field1707, true, arg4, var23.field1715, var22, var18 & 0x7);
                    int var25 = arg1 + class35.method347(var23.field1707, var18 & 0x7, (byte) 8, arg4, var22, var17 & 0x7, var23.field1715);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg5;
                        if ((this.field1315[1][var24][var25] & 0x2) == 2) {
                            var26 = arg5 - 1;
                        }
                        class47 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg6[var26];
                        }
                        this.method478(false, arg5, var24, arg3, var13, var25, arg4 + var22 & 0x3, var27, var21);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "d", descriptor = "(II)I")
    private final int method477(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!RQCEQFSS", name = "a", descriptor = "(ZIILPJTXDRVG;IIILRUPQNTVM;I)V")
    private final void method478(boolean arg0, int arg1, int arg2, class41 arg3, int arg4, int arg5, int arg6, class47 arg7, int arg8) {
        if (field1295 && (this.field1315[0][arg2][arg5] & 0x2) == 0) {
            if ((this.field1315[arg1][arg2][arg5] & 0x10) != 0) {
                return;
            }
            if (this.method481(arg5, arg1, arg2, -42028) != field1296) {
                return;
            }
        }
        if (arg1 < field1317) {
            field1317 = arg1;
        }
        int var10 = this.field1309[arg1][arg2][arg5];
        int var11 = this.field1309[arg1][arg2 + 1][arg5];
        int var12 = this.field1309[arg1][arg2 + 1][arg5 + 1];
        int var13 = this.field1309[arg1][arg2][arg5 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class68 var15 = class68.method575(arg4);
        int var16 = (arg4 << 14) + (arg5 << 7) + arg2 + 1073741824;
        if (arg0) {
            return;
        }
        if (!var15.field1700) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg6 << 6) + arg8);
        if (arg8 == 22) {
            if (!field1295 || var15.field1700 || var15.field1719) {
                class31 var18;
                if (var15.field1737 == -1 && var15.field1695 == null) {
                    var18 = var15.method580(22, arg6, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class62(var13, arg4, field1304, true, var10, arg6, var11, var12, 22, var15.field1737);
                }
                arg3.method379(11875, var18, var17, var14, arg5, arg2, arg1, var16);
                if (var15.field1735 && var15.field1700 && arg7 != null) {
                    arg7.method486(arg2, false, arg5);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class31 var38;
            if (var15.field1737 == -1 && var15.field1695 == null) {
                var38 = var15.method580(10, arg6, var10, var11, var12, var13, -1);
            } else {
                var38 = new class62(var13, arg4, field1304, true, var10, arg6, var11, var12, 10, var15.field1737);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg8 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg6 == 1 || arg6 == 3) {
                    var40 = var15.field1715;
                    var41 = var15.field1707;
                } else {
                    var40 = var15.field1707;
                    var41 = var15.field1715;
                }
                if (arg3.method383(arg2, var39, 999, arg1, var17, var41, var40, var16, var14, arg5, var38) && var15.field1697) {
                    class65 var42;
                    if (var38 instanceof class65) {
                        var42 = (class65) var38;
                    } else {
                        var42 = var15.method580(10, arg6, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1619 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1323[arg1][arg2 + var43][arg5 + var44]) {
                                    this.field1323[arg1][arg2 + var43][arg5 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1735 && arg7 != null) {
                arg7.method485(arg2, var15.field1707, var15.field1704, arg6, var15.field1715, arg5, 0);
            }
        } else if (arg8 >= 12) {
            class31 var19;
            if (var15.field1737 == -1 && var15.field1695 == null) {
                var19 = var15.method580(arg8, arg6, var10, var11, var12, var13, -1);
            } else {
                var19 = new class62(var13, arg4, field1304, true, var10, arg6, var11, var12, arg8, var15.field1737);
            }
            arg3.method383(arg2, 0, 999, arg1, var17, 1, 1, var16, var14, arg5, var19);
            if (arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg1 > 0) {
                this.field1316[arg1][arg2][arg5] |= 0x924;
            }
            if (var15.field1735 && arg7 != null) {
                arg7.method485(arg2, var15.field1707, var15.field1704, arg6, var15.field1715, arg5, 0);
            }
        } else if (arg8 == 0) {
            class31 var20;
            if (var15.field1737 == -1 && var15.field1695 == null) {
                var20 = var15.method580(0, arg6, var10, var11, var12, var13, -1);
            } else {
                var20 = new class62(var13, arg4, field1304, true, var10, arg6, var11, var12, 0, var15.field1737);
            }
            arg3.method381(null, (byte) 33, var16, field1297[arg6], 0, var14, arg1, var20, arg2, var17, arg5);
            if (arg6 == 0) {
                if (var15.field1697) {
                    this.field1323[arg1][arg2][arg5] = 50;
                    this.field1323[arg1][arg2][arg5 + 1] = 50;
                }
                if (var15.field1706) {
                    this.field1316[arg1][arg2][arg5] |= 0x249;
                }
            } else if (arg6 == 1) {
                if (var15.field1697) {
                    this.field1323[arg1][arg2][arg5 + 1] = 50;
                    this.field1323[arg1][arg2 + 1][arg5 + 1] = 50;
                }
                if (var15.field1706) {
                    this.field1316[arg1][arg2][arg5 + 1] |= 0x492;
                }
            } else if (arg6 == 2) {
                if (var15.field1697) {
                    this.field1323[arg1][arg2 + 1][arg5] = 50;
                    this.field1323[arg1][arg2 + 1][arg5 + 1] = 50;
                }
                if (var15.field1706) {
                    this.field1316[arg1][arg2 + 1][arg5] |= 0x249;
                }
            } else if (arg6 == 3) {
                if (var15.field1697) {
                    this.field1323[arg1][arg2][arg5] = 50;
                    this.field1323[arg1][arg2 + 1][arg5] = 50;
                }
                if (var15.field1706) {
                    this.field1316[arg1][arg2][arg5] |= 0x492;
                }
            }
            if (var15.field1735 && arg7 != null) {
                arg7.method484(arg2, arg6, false, var15.field1704, arg8, arg5);
            }
            if (var15.field1724 != 16) {
                arg3.method389(arg1, var15.field1724, arg2, 7, arg5);
            }
        } else if (arg8 == 1) {
            class31 var21;
            if (var15.field1737 == -1 && var15.field1695 == null) {
                var21 = var15.method580(1, arg6, var10, var11, var12, var13, -1);
            } else {
                var21 = new class62(var13, arg4, field1304, true, var10, arg6, var11, var12, 1, var15.field1737);
            }
            arg3.method381(null, (byte) 33, var16, field1302[arg6], 0, var14, arg1, var21, arg2, var17, arg5);
            if (var15.field1697) {
                if (arg6 == 0) {
                    this.field1323[arg1][arg2][arg5 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field1323[arg1][arg2 + 1][arg5 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field1323[arg1][arg2 + 1][arg5] = 50;
                } else if (arg6 == 3) {
                    this.field1323[arg1][arg2][arg5] = 50;
                }
            }
            if (var15.field1735 && arg7 != null) {
                arg7.method484(arg2, arg6, false, var15.field1704, arg8, arg5);
            }
        } else if (arg8 == 2) {
            int var22 = arg6 + 1 & 0x3;
            class31 var23;
            class31 var24;
            if (var15.field1737 == -1 && var15.field1695 == null) {
                var23 = var15.method580(2, arg6 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method580(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class62(var13, arg4, field1304, true, var10, arg6 + 4, var11, var12, 2, var15.field1737);
                var24 = new class62(var13, arg4, field1304, true, var10, var22, var11, var12, 2, var15.field1737);
            }
            arg3.method381(var24, (byte) 33, var16, field1297[arg6], field1297[var22], var14, arg1, var23, arg2, var17, arg5);
            if (var15.field1706) {
                if (arg6 == 0) {
                    this.field1316[arg1][arg2][arg5] |= 0x249;
                    this.field1316[arg1][arg2][arg5 + 1] |= 0x492;
                } else if (arg6 == 1) {
                    this.field1316[arg1][arg2][arg5 + 1] |= 0x492;
                    this.field1316[arg1][arg2 + 1][arg5] |= 0x249;
                } else if (arg6 == 2) {
                    this.field1316[arg1][arg2 + 1][arg5] |= 0x249;
                    this.field1316[arg1][arg2][arg5] |= 0x492;
                } else if (arg6 == 3) {
                    this.field1316[arg1][arg2][arg5] |= 0x492;
                    this.field1316[arg1][arg2][arg5] |= 0x249;
                }
            }
            if (var15.field1735 && arg7 != null) {
                arg7.method484(arg2, arg6, false, var15.field1704, arg8, arg5);
            }
            if (var15.field1724 != 16) {
                arg3.method389(arg1, var15.field1724, arg2, 7, arg5);
            }
        } else if (arg8 == 3) {
            class31 var25;
            if (var15.field1737 == -1 && var15.field1695 == null) {
                var25 = var15.method580(3, arg6, var10, var11, var12, var13, -1);
            } else {
                var25 = new class62(var13, arg4, field1304, true, var10, arg6, var11, var12, 3, var15.field1737);
            }
            arg3.method381(null, (byte) 33, var16, field1302[arg6], 0, var14, arg1, var25, arg2, var17, arg5);
            if (var15.field1697) {
                if (arg6 == 0) {
                    this.field1323[arg1][arg2][arg5 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field1323[arg1][arg2 + 1][arg5 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field1323[arg1][arg2 + 1][arg5] = 50;
                } else if (arg6 == 3) {
                    this.field1323[arg1][arg2][arg5] = 50;
                }
            }
            if (var15.field1735 && arg7 != null) {
                arg7.method484(arg2, arg6, false, var15.field1704, arg8, arg5);
            }
        } else if (arg8 == 9) {
            class31 var26;
            if (var15.field1737 == -1 && var15.field1695 == null) {
                var26 = var15.method580(arg8, arg6, var10, var11, var12, var13, -1);
            } else {
                var26 = new class62(var13, arg4, field1304, true, var10, arg6, var11, var12, arg8, var15.field1737);
            }
            arg3.method383(arg2, 0, 999, arg1, var17, 1, 1, var16, var14, arg5, var26);
            if (var15.field1735 && arg7 != null) {
                arg7.method485(arg2, var15.field1707, var15.field1704, arg6, var15.field1715, arg5, 0);
            }
        } else {
            if (var15.field1694) {
                if (arg6 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg6 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg6 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg8 == 4) {
                class31 var31;
                if (var15.field1737 == -1 && var15.field1695 == null) {
                    var31 = var15.method580(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class62(var13, arg4, field1304, true, var10, 0, var11, var12, 4, var15.field1737);
                }
                arg3.method382(var14, var31, false, var16, arg1, var17, field1297[arg6], arg5, 0, arg6 * 512, 0, arg2);
            } else if (arg8 == 5) {
                int var32 = 16;
                int var33 = arg3.method399(arg1, arg2, arg5);
                if (var33 > 0) {
                    var32 = class68.method575(var33 >> 14 & 0x7FFF).field1724;
                }
                class31 var34;
                if (var15.field1737 == -1 && var15.field1695 == null) {
                    var34 = var15.method580(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class62(var13, arg4, field1304, true, var10, 0, var11, var12, 4, var15.field1737);
                }
                arg3.method382(var14, var34, false, var16, arg1, var17, field1297[arg6], arg5, field1320[arg6] * var32, arg6 * 512, field1300[arg6] * var32, arg2);
            } else if (arg8 == 6) {
                class31 var35;
                if (var15.field1737 == -1 && var15.field1695 == null) {
                    var35 = var15.method580(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class62(var13, arg4, field1304, true, var10, 0, var11, var12, 4, var15.field1737);
                }
                arg3.method382(var14, var35, false, var16, arg1, var17, 256, arg5, 0, arg6, 0, arg2);
            } else if (arg8 == 7) {
                class31 var36;
                if (var15.field1737 == -1 && var15.field1695 == null) {
                    var36 = var15.method580(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class62(var13, arg4, field1304, true, var10, 0, var11, var12, 4, var15.field1737);
                }
                arg3.method382(var14, var36, false, var16, arg1, var17, 512, arg5, 0, arg6, 0, arg2);
            } else if (arg8 == 8) {
                class31 var37;
                if (var15.field1737 == -1 && var15.field1695 == null) {
                    var37 = var15.method580(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class62(var13, arg4, field1304, true, var10, 0, var11, var12, 4, var15.field1737);
                }
                arg3.method382(var14, var37, false, var16, arg1, var17, 768, arg5, 0, arg6, 0, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "b", descriptor = "(IIII)I")
    private static final int method479(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class42.field1211[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "e", descriptor = "(II)I")
    private static final int method480(int arg0, int arg1) {
        int var2 = method473(arg0 - 1, arg1 - 1) + method473(arg0 + 1, arg1 - 1) + method473(arg0 - 1, arg1 + 1) + method473(arg0 + 1, arg1 + 1);
        int var3 = method473(arg0 - 1, arg1) + method473(arg0 + 1, arg1) + method473(arg0, arg1 - 1) + method473(arg0, arg1 + 1);
        int var4 = method473(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "c", descriptor = "(IIII)I")
    public int method481(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -42028) {
            this.field1299 = 54;
        }
        if ((this.field1315[arg1][arg2][arg0] & 0x8) == 0) {
            return arg1 <= 0 || (this.field1315[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!RQCEQFSS", name = "c", descriptor = "(III)I")
    private final int method482(int arg0, int arg1, int arg2) {
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
}
