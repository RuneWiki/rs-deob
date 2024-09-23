import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LVLPWFEX")
public class class43 {

    @OriginalMember(owner = "LVLPWFEX", name = "i", descriptor = "I")
    private int field1274 = -5592;

    @OriginalMember(owner = "LVLPWFEX", name = "z", descriptor = "I")
    private int field1291 = -13936;

    @OriginalMember(owner = "LVLPWFEX", name = "A", descriptor = "I")
    private int field1292 = 293;

    @OriginalMember(owner = "LVLPWFEX", name = "o", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "LVLPWFEX", name = "p", descriptor = "I")
    private int field1281;

    @OriginalMember(owner = "LVLPWFEX", name = "j", descriptor = "[[[I")
    private int[][][] field1275;

    @OriginalMember(owner = "LVLPWFEX", name = "c", descriptor = "[[[B")
    private byte[][][] field1268;

    @OriginalMember(owner = "LVLPWFEX", name = "b", descriptor = "[[[B")
    private byte[][][] field1267;

    @OriginalMember(owner = "LVLPWFEX", name = "m", descriptor = "[[[B")
    private byte[][][] field1278;

    @OriginalMember(owner = "LVLPWFEX", name = "w", descriptor = "[[[B")
    private byte[][][] field1288;

    @OriginalMember(owner = "LVLPWFEX", name = "B", descriptor = "[[[B")
    private byte[][][] field1293;

    @OriginalMember(owner = "LVLPWFEX", name = "C", descriptor = "[[[I")
    private int[][][] field1294;

    @OriginalMember(owner = "LVLPWFEX", name = "l", descriptor = "[[[B")
    private byte[][][] field1277;

    @OriginalMember(owner = "LVLPWFEX", name = "D", descriptor = "[[I")
    private int[][] field1295;

    @OriginalMember(owner = "LVLPWFEX", name = "r", descriptor = "[I")
    private int[] field1283;

    @OriginalMember(owner = "LVLPWFEX", name = "s", descriptor = "[I")
    private int[] field1284;

    @OriginalMember(owner = "LVLPWFEX", name = "t", descriptor = "[I")
    private int[] field1285;

    @OriginalMember(owner = "LVLPWFEX", name = "u", descriptor = "[I")
    private int[] field1286;

    @OriginalMember(owner = "LVLPWFEX", name = "v", descriptor = "[I")
    private int[] field1287;

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "I")
    private static int field1266 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "LVLPWFEX", name = "e", descriptor = "[I")
    private static final int[] field1270 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "LVLPWFEX", name = "f", descriptor = "Z")
    public static boolean field1271 = true;

    @OriginalMember(owner = "LVLPWFEX", name = "g", descriptor = "I")
    private static int field1272 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "LVLPWFEX", name = "h", descriptor = "I")
    private static int field1273 = 317;

    @OriginalMember(owner = "LVLPWFEX", name = "k", descriptor = "[I")
    private static final int[] field1276 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "LVLPWFEX", name = "n", descriptor = "I")
    public static int field1279 = 99;

    @OriginalMember(owner = "LVLPWFEX", name = "x", descriptor = "[I")
    private static final int[] field1289 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "LVLPWFEX", name = "y", descriptor = "[I")
    private static final int[] field1290 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "LVLPWFEX", name = "d", descriptor = "I")
    private static int field1269;

    @OriginalMember(owner = "LVLPWFEX", name = "q", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(II)I")
    private static final int method479(int arg0, int arg1) {
        int var2 = method492(arg0 + 45365, arg1 + 91923, 4) + (method492(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method492(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "([B[LBXNXROZD;IIIIILKYNTOGBR;III)V")
    public final void method480(byte[] arg0, class3[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class39 arg7, int arg8, int arg9, int arg10) {
        class15 var12 = new class15(arg0, false);
        if (arg10 != 13580) {
            field1273 = -247;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method275();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method275();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method261();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg9 == var19 && var18 >= arg6 && var18 < arg6 + 8 && var17 >= arg2 && var17 < arg2 + 8) {
                    class27 var23 = class27.method326(var13);
                    int var24 = arg3 + class66.method572(var23.field832, var22, var23.field851, arg4, var17 & 0x7, this.field1291, var18 & 0x7);
                    int var25 = arg8 + class66.method573(var18 & 0x7, 350, var17 & 0x7, var23.field832, var23.field851, arg4, var22);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg5;
                        if ((this.field1268[1][var24][var25] & 0x2) == 2) {
                            var26 = arg5 - 1;
                        }
                        class3 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg1[var26];
                        }
                        this.method498(var13, arg7, var27, var25, var21, arg5, (byte) 57, arg4 + var22 & 0x3, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "LVLPWFEX", name = "b", descriptor = "(II)I")
    private static final int method481(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(IIIIIIILEGCCHUZS;)V")
    private final void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class15 arg7) {
        if (this.field1274 != arg3) {
            return;
        }
        if (arg5 < 0 || arg5 >= 104 || arg1 < 0 || arg1 >= 104) {
            while (true) {
                int var11 = arg7.method261();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg7.method261();
                    return;
                }
                if (var11 <= 49) {
                    arg7.method261();
                }
            }
        }
        this.field1268[arg0][arg5][arg1] = 0;
        while (true) {
            int var9 = arg7.method261();
            if (var9 == 0) {
                if (arg0 == 0) {
                    this.field1275[0][arg5][arg1] = -method479(arg5 + arg4 + 932731, arg1 + 556238 + arg2) * 8;
                    return;
                } else {
                    this.field1275[arg0][arg5][arg1] = this.field1275[arg0 - 1][arg5][arg1] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg7.method261();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg0 == 0) {
                    this.field1275[0][arg5][arg1] = -var10 * 8;
                    return;
                }
                this.field1275[arg0][arg5][arg1] = this.field1275[arg0 - 1][arg5][arg1] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1278[arg0][arg5][arg1] = arg7.method262();
                this.field1288[arg0][arg5][arg1] = (byte) ((var9 - 2) / 4);
                this.field1293[arg0][arg5][arg1] = (byte) (var9 + arg6 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1268[arg0][arg5][arg1] = (byte) (var9 - 49);
            } else {
                this.field1267[arg0][arg5][arg1] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(IIIII)V")
    public final void method483(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg4; var6 <= arg2 + arg4; var6++) {
            for (int var8 = arg0; var8 <= arg0 + arg1; var8++) {
                if (var8 >= 0 && var8 < this.field1280 && var6 >= 0 && var6 < this.field1281) {
                    this.field1277[0][var8][var6] = 127;
                    if (arg0 == var8 && var8 > 0) {
                        this.field1275[0][var8][var6] = this.field1275[0][var8 - 1][var6];
                    }
                    if (arg0 + arg1 == var8 && var8 < this.field1280 - 1) {
                        this.field1275[0][var8][var6] = this.field1275[0][var8 + 1][var6];
                    }
                    if (arg4 == var6 && var6 > 0) {
                        this.field1275[0][var8][var6] = this.field1275[0][var8][var6 - 1];
                    }
                    if (arg2 + arg4 == var6 && var6 < this.field1281 - 1) {
                        this.field1275[0][var8][var6] = this.field1275[0][var8][var6 + 1];
                    }
                }
            }
        }
        while (arg3 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(IIII)I")
    private static final int method484(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class49.field1362[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "LVLPWFEX", name = "c", descriptor = "(II)I")
    private static final int method485(int arg0, int arg1) {
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

    @OriginalMember(owner = "LVLPWFEX", name = "b", descriptor = "(IIII)I")
    public int method486(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 32242) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field1268[arg0][arg3][arg1] & 0x8) == 0) {
            return arg0 <= 0 || (this.field1268[1][arg3][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "LVLPWFEX", name = "d", descriptor = "(II)I")
    private final int method487(int arg0, int arg1) {
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

    @OriginalMember(owner = "LVLPWFEX", name = "e", descriptor = "(II)I")
    private static final int method488(int arg0, int arg1) {
        int var2 = method481(arg0 - 1, arg1 - 1) + method481(arg0 + 1, arg1 - 1) + method481(arg0 - 1, arg1 + 1) + method481(arg0 + 1, arg1 + 1);
        int var3 = method481(arg0 - 1, arg1) + method481(arg0 + 1, arg1) + method481(arg0, arg1 - 1) + method481(arg0, arg1 + 1);
        int var4 = method481(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(III)I")
    private final int method489(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(IIIIII[B[LBXNXROZD;II)V")
    public final void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class3[] arg7, int arg8, int arg9) {
        int var11 = 4 / arg3;
        for (int var12 = 0; var12 < 8; var12++) {
            for (int var17 = 0; var17 < 8; var17++) {
                if (arg4 + var12 > 0 && arg4 + var12 < 103 && arg0 + var17 > 0 && arg0 + var17 < 103) {
                    arg7[arg8].field61[arg4 + var12][arg0 + var17] &= 0xFEFFFFFF;
                }
            }
        }
        class15 var13 = new class15(arg6, false);
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 64; var15++) {
                for (int var16 = 0; var16 < 64; var16++) {
                    if (arg1 == var14 && var15 >= arg9 && var15 < arg9 + 8 && var16 >= arg2 && var16 < arg2 + 8) {
                        this.method482(arg8, arg0 + class66.method571(arg5, var16 & 0x7, 6, var15 & 0x7), 0, -5592, 0, arg4 + class66.method570(var16 & 0x7, var15 & 0x7, true, arg5), arg5, var13);
                    } else {
                        this.method482(0, -1, 0, -5592, 0, -1, 0, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(Z[BII)Z")
    public static final boolean method491(boolean arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0) {
            throw new NullPointerException();
        }
        boolean var4 = true;
        class15 var5 = new class15(arg1, false);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method275();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method275();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method261() >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class27 var17 = class27.method326(var6);
                        if (var14 != 22 || !field1271 || var17.field841 || var17.field818) {
                            var4 &= var17.method322(false);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method275();
                if (var10 == 0) {
                    break;
                }
                var5.method261();
            }
        }
    }

    @OriginalMember(owner = "LVLPWFEX", name = "b", descriptor = "(III)I")
    private static final int method492(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method488(var3, var5);
        int var8 = method488(var3 + 1, var5);
        int var9 = method488(var3, var5 + 1);
        int var10 = method488(var3 + 1, var5 + 1);
        int var11 = method484(var7, var8, var4, arg2);
        int var12 = method484(var9, var10, var4, arg2);
        return method484(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "([LBXNXROZD;BII[BII)V")
    public final void method493(class3[] arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg2 + var13 > 0 && arg2 + var13 < 103 && arg3 + var14 > 0 && arg3 + var14 < 103) {
                        arg0[var8].field61[arg2 + var13][arg3 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class15 var9 = new class15(arg4, false);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method482(var10, arg3 + var12, arg5, -5592, arg6, arg2 + var11, 0, var9);
                }
            }
        }
        if (arg1 == -78) {
            ;
        }
    }

    @OriginalMember(owner = "LVLPWFEX", name = "<init>", descriptor = "([[[IIII[[[B)V")
    public class43(int[][][] arg0, int arg1, int arg2, int arg3, byte[][][] arg4) {
        field1279 = 99;
        this.field1280 = arg3;
        this.field1281 = arg2;
        this.field1275 = arg0;
        this.field1268 = arg4;
        this.field1267 = new byte[4][this.field1280][this.field1281];
        this.field1278 = new byte[4][this.field1280][this.field1281];
        this.field1288 = new byte[4][this.field1280][this.field1281];
        this.field1293 = new byte[4][this.field1280][this.field1281];
        this.field1294 = new int[4][this.field1280 + 1][this.field1281 + 1];
        this.field1277 = new byte[4][this.field1280 + 1][this.field1281 + 1];
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        this.field1295 = new int[this.field1280 + 1][this.field1281 + 1];
        this.field1283 = new int[this.field1281];
        this.field1284 = new int[this.field1281];
        this.field1285 = new int[this.field1281];
        this.field1286 = new int[this.field1281];
        this.field1287 = new int[this.field1281];
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "([LBXNXROZD;LKYNTOGBR;Z)V")
    public final void method494(class3[] arg0, class39 arg1, boolean arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var111 = 0; var111 < 104; var111++) {
                for (int var112 = 0; var112 < 104; var112++) {
                    if ((this.field1268[var4][var111][var112] & 0x1) == 1) {
                        int var113 = var4;
                        if ((this.field1268[1][var111][var112] & 0x2) == 2) {
                            var113 = var4 - 1;
                        }
                        if (var113 >= 0) {
                            arg0[var113].method15(8, var111, var112);
                        }
                    }
                }
            }
        }
        field1266 += (int) (Math.random() * 5.0D) - 2;
        if (field1266 < -8) {
            field1266 = -8;
        }
        if (field1266 > 8) {
            field1266 = 8;
        }
        field1272 += (int) (Math.random() * 5.0D) - 2;
        if (field1272 < -16) {
            field1272 = -16;
        }
        if (field1272 > 16) {
            field1272 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var49 = this.field1277[var5];
            byte var50 = 96;
            short var51 = 768;
            byte var52 = -50;
            byte var53 = -10;
            byte var54 = -50;
            int var55 = (int) Math.sqrt((double) (var54 * var54 + var52 * var52 + var53 * var53));
            int var56 = var51 * var55 >> 8;
            for (int var57 = 1; var57 < this.field1281 - 1; var57++) {
                for (int var102 = 1; var102 < this.field1280 - 1; var102++) {
                    int var103 = this.field1275[var5][var102 + 1][var57] - this.field1275[var5][var102 - 1][var57];
                    int var104 = this.field1275[var5][var102][var57 + 1] - this.field1275[var5][var102][var57 - 1];
                    int var105 = (int) Math.sqrt((double) (var104 * var104 + var103 * var103 + 65536));
                    int var106 = (var103 << 8) / var105;
                    int var107 = 65536 / var105;
                    int var108 = (var104 << 8) / var105;
                    int var109 = (var54 * var108 + var52 * var106 + var53 * var107) / var56 + var50;
                    int var110 = (var49[var102][var57] >> 1) + (var49[var102][var57 + 1] >> 3) + (var49[var102][var57 - 1] >> 2) + (var49[var102 - 1][var57] >> 2) + (var49[var102 + 1][var57] >> 3);
                    this.field1295[var102][var57] = var109 - var110;
                }
            }
            for (int var58 = 0; var58 < this.field1281; var58++) {
                this.field1283[var58] = 0;
                this.field1284[var58] = 0;
                this.field1285[var58] = 0;
                this.field1286[var58] = 0;
                this.field1287[var58] = 0;
            }
            for (int var59 = -5; var59 < this.field1280 + 5; var59++) {
                for (int var62 = 0; var62 < this.field1281; var62++) {
                    int var96 = var59 + 5;
                    int var10002;
                    if (var96 >= 0 && var96 < this.field1280) {
                        int var97 = this.field1267[var5][var96][var62] & 0xFF;
                        if (var97 > 0) {
                            class24 var98 = class24.field802[var97 - 1];
                            this.field1283[var62] += var98.field811;
                            this.field1284[var62] += var98.field809;
                            this.field1285[var62] += var98.field810;
                            this.field1286[var62] += var98.field812;
                            var10002 = this.field1287[var62]++;
                        }
                    }
                    int var99 = var59 - 5;
                    if (var99 >= 0 && var99 < this.field1280) {
                        int var100 = this.field1267[var5][var99][var62] & 0xFF;
                        if (var100 > 0) {
                            class24 var101 = class24.field802[var100 - 1];
                            this.field1283[var62] -= var101.field811;
                            this.field1284[var62] -= var101.field809;
                            this.field1285[var62] -= var101.field810;
                            this.field1286[var62] -= var101.field812;
                            var10002 = this.field1287[var62]--;
                        }
                    }
                }
                if (var59 >= 1 && var59 < this.field1280 - 1) {
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    int var67 = 0;
                    for (int var68 = -5; var68 < this.field1281 + 5; var68++) {
                        int var69 = var68 + 5;
                        if (var69 >= 0 && var69 < this.field1281) {
                            var63 += this.field1283[var69];
                            var64 += this.field1284[var69];
                            var65 += this.field1285[var69];
                            var66 += this.field1286[var69];
                            var67 += this.field1287[var69];
                        }
                        int var70 = var68 - 5;
                        if (var70 >= 0 && var70 < this.field1281) {
                            var63 -= this.field1283[var70];
                            var64 -= this.field1284[var70];
                            var65 -= this.field1285[var70];
                            var66 -= this.field1286[var70];
                            var67 -= this.field1287[var70];
                        }
                        if (var68 >= 1 && var68 < this.field1281 - 1 && (!field1271 || (this.field1268[0][var59][var68] & 0x2) != 0 || (this.field1268[var5][var59][var68] & 0x10) == 0 && this.method486(var5, var68, 32242, var59) == field1282)) {
                            if (var5 < field1279) {
                                field1279 = var5;
                            }
                            int var71 = this.field1267[var5][var59][var68] & 0xFF;
                            int var72 = this.field1278[var5][var59][var68] & 0xFF;
                            if (var71 > 0 || var72 > 0) {
                                int var73 = this.field1275[var5][var59][var68];
                                int var74 = this.field1275[var5][var59 + 1][var68];
                                int var75 = this.field1275[var5][var59 + 1][var68 + 1];
                                int var76 = this.field1275[var5][var59][var68 + 1];
                                int var77 = this.field1295[var59][var68];
                                int var78 = this.field1295[var59 + 1][var68];
                                int var79 = this.field1295[var59 + 1][var68 + 1];
                                int var80 = this.field1295[var59][var68 + 1];
                                int var81 = -1;
                                int var82 = -1;
                                if (var71 > 0) {
                                    int var83 = var63 * 256 / var66;
                                    int var84 = var64 / var67;
                                    int var85 = var65 / var67;
                                    var81 = this.method489(var83, var84, var85);
                                    int var86 = field1266 + var83 & 0xFF;
                                    int var87 = field1272 + var85;
                                    if (var87 < 0) {
                                        var87 = 0;
                                    } else if (var87 > 255) {
                                        var87 = 255;
                                    }
                                    var82 = this.method489(var86, var84, var87);
                                }
                                if (var5 > 0) {
                                    boolean var88 = true;
                                    if (var71 == 0 && this.field1288[var5][var59][var68] != 0) {
                                        var88 = false;
                                    }
                                    if (var72 > 0 && !class24.field802[var72 - 1].field807) {
                                        var88 = false;
                                    }
                                    if (var88 && var73 == var74 && var73 == var75 && var73 == var76) {
                                        this.field1294[var5][var59][var68] |= 0x924;
                                    }
                                }
                                int var89 = 0;
                                if (var81 != -1) {
                                    var89 = class49.field1373[method485(var82, 96)];
                                }
                                if (var72 == 0) {
                                    arg1.method419(var5, var59, var68, 0, 0, -1, var73, var74, var75, var76, method485(var81, var77), method485(var81, var78), method485(var81, var79), method485(var81, var80), 0, 0, 0, 0, var89, 0);
                                } else {
                                    int var90 = this.field1288[var5][var59][var68] + 1;
                                    byte var91 = this.field1293[var5][var59][var68];
                                    class24 var92 = class24.field802[var72 - 1];
                                    int var93 = var92.field805;
                                    int var94;
                                    int var95;
                                    if (var93 >= 0) {
                                        var94 = class49.method508(var93, (byte) 45);
                                        var95 = -1;
                                    } else if (var92.field804 == 16711935) {
                                        var94 = 0;
                                        var95 = -2;
                                        var93 = -1;
                                    } else {
                                        var95 = this.method489(var92.field808, var92.field809, var92.field810);
                                        var94 = class49.field1373[this.method487(var92.field813, 96)];
                                    }
                                    arg1.method419(var5, var59, var68, var90, var91, var93, var73, var74, var75, var76, method485(var81, var77), method485(var81, var78), method485(var81, var79), method485(var81, var80), this.method487(var95, var77), this.method487(var95, var78), this.method487(var95, var79), this.method487(var95, var80), var89, var94);
                                }
                            }
                        }
                    }
                }
            }
            for (int var60 = 1; var60 < this.field1281 - 1; var60++) {
                for (int var61 = 1; var61 < this.field1280 - 1; var61++) {
                    arg1.method418(var5, var61, var60, this.method486(var5, var60, 32242, var61));
                }
            }
        }
        arg1.method445(768, -50, 64, -50, -10, 798);
        if (!arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        for (int var7 = 0; var7 < this.field1280; var7++) {
            for (int var48 = 0; var48 < this.field1281; var48++) {
                if ((this.field1268[1][var7][var48] & 0x2) == 2) {
                    arg1.method416(-5641, var48, var7);
                }
            }
        }
        int var8 = 1;
        int var9 = 2;
        int var10 = 4;
        for (int var11 = 0; var11 < 4; var11++) {
            if (var11 > 0) {
                var8 <<= 0x3;
                var9 <<= 0x3;
                var10 <<= 0x3;
            }
            for (int var12 = 0; var12 <= var11; var12++) {
                for (int var13 = 0; var13 <= this.field1281; var13++) {
                    for (int var14 = 0; var14 <= this.field1280; var14++) {
                        if ((this.field1294[var12][var14][var13] & var8) != 0) {
                            int var15 = var13;
                            int var16 = var13;
                            int var17 = var12;
                            int var18 = var12;
                            while (var15 > 0 && (this.field1294[var12][var14][var15 - 1] & var8) != 0) {
                                var15--;
                            }
                            while (var16 < this.field1281 && (this.field1294[var12][var14][var16 + 1] & var8) != 0) {
                                var16++;
                            }
                            label331: while (var17 > 0) {
                                for (int var19 = var15; var19 <= var16; var19++) {
                                    if ((this.field1294[var17 - 1][var14][var19] & var8) == 0) {
                                        break label331;
                                    }
                                }
                                var17--;
                            }
                            label320: while (var18 < var11) {
                                for (int var20 = var15; var20 <= var16; var20++) {
                                    if ((this.field1294[var18 + 1][var14][var20] & var8) == 0) {
                                        break label320;
                                    }
                                }
                                var18++;
                            }
                            int var21 = (var18 + 1 - var17) * (var16 + 1 - var15);
                            if (var21 >= 8) {
                                short var22 = 240;
                                int var23 = this.field1275[var18][var14][var15] - var22;
                                int var24 = this.field1275[var17][var14][var15];
                                class39.method417(var23, 834, 1, var11, var14 * 128, var16 * 128 + 128, var15 * 128, var24, var14 * 128);
                                for (int var25 = var17; var25 <= var18; var25++) {
                                    for (int var26 = var15; var26 <= var16; var26++) {
                                        this.field1294[var25][var14][var26] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1294[var12][var14][var13] & var9) != 0) {
                            int var27 = var14;
                            int var28 = var14;
                            int var29 = var12;
                            int var30 = var12;
                            while (var27 > 0 && (this.field1294[var12][var27 - 1][var13] & var9) != 0) {
                                var27--;
                            }
                            while (var28 < this.field1280 && (this.field1294[var12][var28 + 1][var13] & var9) != 0) {
                                var28++;
                            }
                            label384: while (var29 > 0) {
                                for (int var31 = var27; var31 <= var28; var31++) {
                                    if ((this.field1294[var29 - 1][var31][var13] & var9) == 0) {
                                        break label384;
                                    }
                                }
                                var29--;
                            }
                            label373: while (var30 < var11) {
                                for (int var32 = var27; var32 <= var28; var32++) {
                                    if ((this.field1294[var30 + 1][var32][var13] & var9) == 0) {
                                        break label373;
                                    }
                                }
                                var30++;
                            }
                            int var33 = (var30 + 1 - var29) * (var28 + 1 - var27);
                            if (var33 >= 8) {
                                short var34 = 240;
                                int var35 = this.field1275[var30][var27][var13] - var34;
                                int var36 = this.field1275[var29][var27][var13];
                                class39.method417(var35, 834, 2, var11, var27 * 128, var13 * 128, var13 * 128, var36, var28 * 128 + 128);
                                for (int var37 = var29; var37 <= var30; var37++) {
                                    for (int var38 = var27; var38 <= var28; var38++) {
                                        this.field1294[var37][var38][var13] &= ~var9;
                                    }
                                }
                            }
                        }
                        if ((this.field1294[var12][var14][var13] & var10) != 0) {
                            int var39 = var14;
                            int var40 = var14;
                            int var41 = var13;
                            int var42 = var13;
                            while (var41 > 0 && (this.field1294[var12][var14][var41 - 1] & var10) != 0) {
                                var41--;
                            }
                            while (var42 < this.field1281 && (this.field1294[var12][var14][var42 + 1] & var10) != 0) {
                                var42++;
                            }
                            label437: while (var39 > 0) {
                                for (int var43 = var41; var43 <= var42; var43++) {
                                    if ((this.field1294[var12][var39 - 1][var43] & var10) == 0) {
                                        break label437;
                                    }
                                }
                                var39--;
                            }
                            label426: while (var40 < this.field1280) {
                                for (int var44 = var41; var44 <= var42; var44++) {
                                    if ((this.field1294[var12][var40 + 1][var44] & var10) == 0) {
                                        break label426;
                                    }
                                }
                                var40++;
                            }
                            if ((var40 + 1 - var39) * (var42 + 1 - var41) >= 4) {
                                int var45 = this.field1275[var12][var39][var41];
                                class39.method417(var45, 834, 4, var11, var39 * 128, var42 * 128 + 128, var41 * 128, var45, var40 * 128 + 128);
                                for (int var46 = var39; var46 <= var40; var46++) {
                                    for (int var47 = var41; var47 <= var42; var47++) {
                                        this.field1294[var12][var46][var47] &= ~var10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(LEGCCHUZS;LDHNAQSHE;I)V")
    public static final void method495(class15 arg0, class13 arg1, int arg2) {
        int var3 = -1;
        if (arg2 != -41384) {
            field1273 = -293;
        }
        while (true) {
            int var4 = arg0.method275();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class27 var5 = class27.method326(var3);
            var5.method320(296, arg1);
            while (true) {
                int var6 = arg0.method275();
                if (var6 == 0) {
                    break;
                }
                arg0.method261();
            }
        }
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(LKYNTOGBR;[[[IIIILBXNXROZD;IIIII)V")
    public static final void method496(class39 arg0, int[][][] arg1, int arg2, int arg3, int arg4, class3 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg1[arg2][arg6][arg7];
        int var12 = arg1[arg2][arg6 + 1][arg7];
        int var13 = arg1[arg2][arg6 + 1][arg7 + 1];
        int var14 = arg1[arg2][arg6][arg7 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class27 var16 = class27.method326(arg4);
        int var17 = (arg4 << 14) + (arg7 << 7) + arg6 + 1073741824;
        if (arg9 != 0) {
            field1273 = -1;
        }
        if (!var16.field841) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg10 << 6) + arg3);
        if (arg3 == 22) {
            class4 var19;
            if (var16.field844 == -1 && var16.field825 == null) {
                var19 = var16.method321(22, arg10, var11, var12, var13, var14, -1);
            } else {
                var19 = new class64(var16.field844, var11, arg10, var12, arg4, 22, true, var13, 18451, var14);
            }
            arg0.method420(arg8, false, var18, var15, arg7, var17, arg6, var19);
            if (var16.field855 && var16.field841) {
                arg5.method15(8, arg6, arg7);
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class4 var39;
            if (var16.field844 == -1 && var16.field825 == null) {
                var39 = var16.method321(10, arg10, var11, var12, var13, var14, -1);
            } else {
                var39 = new class64(var16.field844, var11, arg10, var12, arg4, 10, true, var13, 18451, var14);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg3 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg10 == 1 || arg10 == 3) {
                    var41 = var16.field832;
                    var42 = var16.field851;
                } else {
                    var41 = var16.field851;
                    var42 = var16.field832;
                }
                arg0.method424(var15, var39, arg6, var41, arg8, var42, var40, var18, arg7, 768, var17);
            }
            if (var16.field855) {
                arg5.method14(arg10, var16.field851, arg7, arg6, false, var16.field863, var16.field832);
            }
        } else if (arg3 >= 12) {
            class4 var20;
            if (var16.field844 == -1 && var16.field825 == null) {
                var20 = var16.method321(arg3, arg10, var11, var12, var13, var14, -1);
            } else {
                var20 = new class64(var16.field844, var11, arg10, var12, arg4, arg3, true, var13, 18451, var14);
            }
            arg0.method424(var15, var20, arg6, 1, arg8, 1, 0, var18, arg7, 768, var17);
            if (var16.field855) {
                arg5.method14(arg10, var16.field851, arg7, arg6, false, var16.field863, var16.field832);
            }
        } else if (arg3 == 0) {
            class4 var21;
            if (var16.field844 == -1 && var16.field825 == null) {
                var21 = var16.method321(0, arg10, var11, var12, var13, var14, -1);
            } else {
                var21 = new class64(var16.field844, var11, arg10, var12, arg4, 0, true, var13, 18451, var14);
            }
            arg0.method422(0, arg8, null, var17, field1269, var15, arg6, field1289[arg10], var21, arg7, var18);
            if (var16.field855) {
                arg5.method13(-4390, arg3, arg10, var16.field863, arg6, arg7);
            }
        } else if (arg3 == 1) {
            class4 var22;
            if (var16.field844 == -1 && var16.field825 == null) {
                var22 = var16.method321(1, arg10, var11, var12, var13, var14, -1);
            } else {
                var22 = new class64(var16.field844, var11, arg10, var12, arg4, 1, true, var13, 18451, var14);
            }
            arg0.method422(0, arg8, null, var17, field1269, var15, arg6, field1290[arg10], var22, arg7, var18);
            if (var16.field855) {
                arg5.method13(-4390, arg3, arg10, var16.field863, arg6, arg7);
            }
        } else if (arg3 == 2) {
            int var23 = arg10 + 1 & 0x3;
            class4 var24;
            class4 var25;
            if (var16.field844 == -1 && var16.field825 == null) {
                var24 = var16.method321(2, arg10 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method321(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class64(var16.field844, var11, arg10 + 4, var12, arg4, 2, true, var13, 18451, var14);
                var25 = new class64(var16.field844, var11, var23, var12, arg4, 2, true, var13, 18451, var14);
            }
            arg0.method422(field1289[var23], arg8, var25, var17, field1269, var15, arg6, field1289[arg10], var24, arg7, var18);
            if (var16.field855) {
                arg5.method13(-4390, arg3, arg10, var16.field863, arg6, arg7);
            }
        } else if (arg3 == 3) {
            class4 var26;
            if (var16.field844 == -1 && var16.field825 == null) {
                var26 = var16.method321(3, arg10, var11, var12, var13, var14, -1);
            } else {
                var26 = new class64(var16.field844, var11, arg10, var12, arg4, 3, true, var13, 18451, var14);
            }
            arg0.method422(0, arg8, null, var17, field1269, var15, arg6, field1290[arg10], var26, arg7, var18);
            if (var16.field855) {
                arg5.method13(-4390, arg3, arg10, var16.field863, arg6, arg7);
            }
        } else if (arg3 == 9) {
            class4 var27;
            if (var16.field844 == -1 && var16.field825 == null) {
                var27 = var16.method321(arg3, arg10, var11, var12, var13, var14, -1);
            } else {
                var27 = new class64(var16.field844, var11, arg10, var12, arg4, arg3, true, var13, 18451, var14);
            }
            arg0.method424(var15, var27, arg6, 1, arg8, 1, 0, var18, arg7, 768, var17);
            if (var16.field855) {
                arg5.method14(arg10, var16.field851, arg7, arg6, false, var16.field863, var16.field832);
            }
        } else {
            if (var16.field868) {
                if (arg10 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg10 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg10 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg3 == 4) {
                class4 var32;
                if (var16.field844 == -1 && var16.field825 == null) {
                    var32 = var16.method321(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class64(var16.field844, var11, 0, var12, arg4, 4, true, var13, 18451, var14);
                }
                arg0.method423(var15, 0, var32, field1289[arg10], arg6, 0, arg10 * 512, 0, arg8, arg7, var18, var17);
            } else if (arg3 == 5) {
                int var33 = 16;
                int var34 = arg0.method440(arg8, arg6, arg7);
                if (var34 > 0) {
                    var33 = class27.method326(var34 >> 14 & 0x7FFF).field860;
                }
                class4 var35;
                if (var16.field844 == -1 && var16.field825 == null) {
                    var35 = var16.method321(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class64(var16.field844, var11, 0, var12, arg4, 4, true, var13, 18451, var14);
                }
                arg0.method423(var15, field1276[arg10] * var33, var35, field1289[arg10], arg6, field1270[arg10] * var33, arg10 * 512, 0, arg8, arg7, var18, var17);
            } else if (arg3 == 6) {
                class4 var36;
                if (var16.field844 == -1 && var16.field825 == null) {
                    var36 = var16.method321(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class64(var16.field844, var11, 0, var12, arg4, 4, true, var13, 18451, var14);
                }
                arg0.method423(var15, 0, var36, 256, arg6, 0, arg10, 0, arg8, arg7, var18, var17);
            } else if (arg3 == 7) {
                class4 var37;
                if (var16.field844 == -1 && var16.field825 == null) {
                    var37 = var16.method321(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class64(var16.field844, var11, 0, var12, arg4, 4, true, var13, 18451, var14);
                }
                arg0.method423(var15, 0, var37, 512, arg6, 0, arg10, 0, arg8, arg7, var18, var17);
            } else if (arg3 == 8) {
                class4 var38;
                if (var16.field844 == -1 && var16.field825 == null) {
                    var38 = var16.method321(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class64(var16.field844, var11, 0, var12, arg4, 4, true, var13, 18451, var14);
                }
                arg0.method423(var15, 0, var38, 768, arg6, 0, arg10, 0, arg8, arg7, var18, var17);
            }
        }
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method497(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field1269 = 200;
        }
        class27 var3 = class27.method326(arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method328(arg0, -333);
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(ILKYNTOGBR;LBXNXROZD;IIIBII)V")
    private final void method498(int arg0, class39 arg1, class3 arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (field1271 && (this.field1268[0][arg8][arg3] & 0x2) == 0) {
            if ((this.field1268[arg5][arg8][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method486(arg5, arg3, 32242, arg8) != field1282) {
                return;
            }
        }
        if (arg5 < field1279) {
            field1279 = arg5;
        }
        int var10 = this.field1275[arg5][arg8][arg3];
        int var11 = this.field1275[arg5][arg8 + 1][arg3];
        int var12 = this.field1275[arg5][arg8 + 1][arg3 + 1];
        int var13 = this.field1275[arg5][arg8][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class27 var15 = class27.method326(arg0);
        int var16 = (arg0 << 14) + (arg3 << 7) + arg8 + 1073741824;
        if (!var15.field841) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg7 << 6) + arg4);
        if (arg6 != 57) {
            field1273 = -174;
        }
        if (arg4 == 22) {
            if (!field1271 || var15.field841 || var15.field818) {
                class4 var18;
                if (var15.field844 == -1 && var15.field825 == null) {
                    var18 = var15.method321(22, arg7, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class64(var15.field844, var10, arg7, var11, arg0, 22, true, var12, 18451, var13);
                }
                arg1.method420(arg5, false, var17, var14, arg3, var16, arg8, var18);
                if (var15.field855 && var15.field841 && arg2 != null) {
                    arg2.method15(8, arg8, arg3);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class4 var38;
            if (var15.field844 == -1 && var15.field825 == null) {
                var38 = var15.method321(10, arg7, var10, var11, var12, var13, -1);
            } else {
                var38 = new class64(var15.field844, var10, arg7, var11, arg0, 10, true, var12, 18451, var13);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg4 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg7 == 1 || arg7 == 3) {
                    var40 = var15.field832;
                    var41 = var15.field851;
                } else {
                    var40 = var15.field851;
                    var41 = var15.field832;
                }
                if (arg1.method424(var14, var38, arg8, var40, arg5, var41, var39, var17, arg3, 768, var16) && var15.field836) {
                    class32 var42;
                    if (var38 instanceof class32) {
                        var42 = (class32) var38;
                    } else {
                        var42 = var15.method321(10, arg7, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field962 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1277[arg5][arg8 + var43][arg3 + var44]) {
                                    this.field1277[arg5][arg8 + var43][arg3 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field855 && arg2 != null) {
                arg2.method14(arg7, var15.field851, arg3, arg8, false, var15.field863, var15.field832);
            }
        } else if (arg4 >= 12) {
            class4 var19;
            if (var15.field844 == -1 && var15.field825 == null) {
                var19 = var15.method321(arg4, arg7, var10, var11, var12, var13, -1);
            } else {
                var19 = new class64(var15.field844, var10, arg7, var11, arg0, arg4, true, var12, 18451, var13);
            }
            arg1.method424(var14, var19, arg8, 1, arg5, 1, 0, var17, arg3, 768, var16);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg5 > 0) {
                this.field1294[arg5][arg8][arg3] |= 0x924;
            }
            if (var15.field855 && arg2 != null) {
                arg2.method14(arg7, var15.field851, arg3, arg8, false, var15.field863, var15.field832);
            }
        } else if (arg4 == 0) {
            class4 var20;
            if (var15.field844 == -1 && var15.field825 == null) {
                var20 = var15.method321(0, arg7, var10, var11, var12, var13, -1);
            } else {
                var20 = new class64(var15.field844, var10, arg7, var11, arg0, 0, true, var12, 18451, var13);
            }
            arg1.method422(0, arg5, null, var16, field1269, var14, arg8, field1289[arg7], var20, arg3, var17);
            if (arg7 == 0) {
                if (var15.field836) {
                    this.field1277[arg5][arg8][arg3] = 50;
                    this.field1277[arg5][arg8][arg3 + 1] = 50;
                }
                if (var15.field849) {
                    this.field1294[arg5][arg8][arg3] |= 0x249;
                }
            } else if (arg7 == 1) {
                if (var15.field836) {
                    this.field1277[arg5][arg8][arg3 + 1] = 50;
                    this.field1277[arg5][arg8 + 1][arg3 + 1] = 50;
                }
                if (var15.field849) {
                    this.field1294[arg5][arg8][arg3 + 1] |= 0x492;
                }
            } else if (arg7 == 2) {
                if (var15.field836) {
                    this.field1277[arg5][arg8 + 1][arg3] = 50;
                    this.field1277[arg5][arg8 + 1][arg3 + 1] = 50;
                }
                if (var15.field849) {
                    this.field1294[arg5][arg8 + 1][arg3] |= 0x249;
                }
            } else if (arg7 == 3) {
                if (var15.field836) {
                    this.field1277[arg5][arg8][arg3] = 50;
                    this.field1277[arg5][arg8 + 1][arg3] = 50;
                }
                if (var15.field849) {
                    this.field1294[arg5][arg8][arg3] |= 0x492;
                }
            }
            if (var15.field855 && arg2 != null) {
                arg2.method13(-4390, arg4, arg7, var15.field863, arg8, arg3);
            }
            if (var15.field860 != 16) {
                arg1.method430(arg8, var15.field860, 193, arg5, arg3);
            }
        } else if (arg4 == 1) {
            class4 var21;
            if (var15.field844 == -1 && var15.field825 == null) {
                var21 = var15.method321(1, arg7, var10, var11, var12, var13, -1);
            } else {
                var21 = new class64(var15.field844, var10, arg7, var11, arg0, 1, true, var12, 18451, var13);
            }
            arg1.method422(0, arg5, null, var16, field1269, var14, arg8, field1290[arg7], var21, arg3, var17);
            if (var15.field836) {
                if (arg7 == 0) {
                    this.field1277[arg5][arg8][arg3 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field1277[arg5][arg8 + 1][arg3 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field1277[arg5][arg8 + 1][arg3] = 50;
                } else if (arg7 == 3) {
                    this.field1277[arg5][arg8][arg3] = 50;
                }
            }
            if (var15.field855 && arg2 != null) {
                arg2.method13(-4390, arg4, arg7, var15.field863, arg8, arg3);
            }
        } else if (arg4 == 2) {
            int var22 = arg7 + 1 & 0x3;
            class4 var23;
            class4 var24;
            if (var15.field844 == -1 && var15.field825 == null) {
                var23 = var15.method321(2, arg7 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method321(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class64(var15.field844, var10, arg7 + 4, var11, arg0, 2, true, var12, 18451, var13);
                var24 = new class64(var15.field844, var10, var22, var11, arg0, 2, true, var12, 18451, var13);
            }
            arg1.method422(field1289[var22], arg5, var24, var16, field1269, var14, arg8, field1289[arg7], var23, arg3, var17);
            if (var15.field849) {
                if (arg7 == 0) {
                    this.field1294[arg5][arg8][arg3] |= 0x249;
                    this.field1294[arg5][arg8][arg3 + 1] |= 0x492;
                } else if (arg7 == 1) {
                    this.field1294[arg5][arg8][arg3 + 1] |= 0x492;
                    this.field1294[arg5][arg8 + 1][arg3] |= 0x249;
                } else if (arg7 == 2) {
                    this.field1294[arg5][arg8 + 1][arg3] |= 0x249;
                    this.field1294[arg5][arg8][arg3] |= 0x492;
                } else if (arg7 == 3) {
                    this.field1294[arg5][arg8][arg3] |= 0x492;
                    this.field1294[arg5][arg8][arg3] |= 0x249;
                }
            }
            if (var15.field855 && arg2 != null) {
                arg2.method13(-4390, arg4, arg7, var15.field863, arg8, arg3);
            }
            if (var15.field860 != 16) {
                arg1.method430(arg8, var15.field860, 193, arg5, arg3);
            }
        } else if (arg4 == 3) {
            class4 var25;
            if (var15.field844 == -1 && var15.field825 == null) {
                var25 = var15.method321(3, arg7, var10, var11, var12, var13, -1);
            } else {
                var25 = new class64(var15.field844, var10, arg7, var11, arg0, 3, true, var12, 18451, var13);
            }
            arg1.method422(0, arg5, null, var16, field1269, var14, arg8, field1290[arg7], var25, arg3, var17);
            if (var15.field836) {
                if (arg7 == 0) {
                    this.field1277[arg5][arg8][arg3 + 1] = 50;
                } else if (arg7 == 1) {
                    this.field1277[arg5][arg8 + 1][arg3 + 1] = 50;
                } else if (arg7 == 2) {
                    this.field1277[arg5][arg8 + 1][arg3] = 50;
                } else if (arg7 == 3) {
                    this.field1277[arg5][arg8][arg3] = 50;
                }
            }
            if (var15.field855 && arg2 != null) {
                arg2.method13(-4390, arg4, arg7, var15.field863, arg8, arg3);
            }
        } else if (arg4 == 9) {
            class4 var26;
            if (var15.field844 == -1 && var15.field825 == null) {
                var26 = var15.method321(arg4, arg7, var10, var11, var12, var13, -1);
            } else {
                var26 = new class64(var15.field844, var10, arg7, var11, arg0, arg4, true, var12, 18451, var13);
            }
            arg1.method424(var14, var26, arg8, 1, arg5, 1, 0, var17, arg3, 768, var16);
            if (var15.field855 && arg2 != null) {
                arg2.method14(arg7, var15.field851, arg3, arg8, false, var15.field863, var15.field832);
            }
        } else {
            if (var15.field868) {
                if (arg7 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg7 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg7 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg4 == 4) {
                class4 var31;
                if (var15.field844 == -1 && var15.field825 == null) {
                    var31 = var15.method321(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class64(var15.field844, var10, 0, var11, arg0, 4, true, var12, 18451, var13);
                }
                arg1.method423(var14, 0, var31, field1289[arg7], arg8, 0, arg7 * 512, 0, arg5, arg3, var17, var16);
            } else if (arg4 == 5) {
                int var32 = 16;
                int var33 = arg1.method440(arg5, arg8, arg3);
                if (var33 > 0) {
                    var32 = class27.method326(var33 >> 14 & 0x7FFF).field860;
                }
                class4 var34;
                if (var15.field844 == -1 && var15.field825 == null) {
                    var34 = var15.method321(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class64(var15.field844, var10, 0, var11, arg0, 4, true, var12, 18451, var13);
                }
                arg1.method423(var14, field1276[arg7] * var32, var34, field1289[arg7], arg8, field1270[arg7] * var32, arg7 * 512, 0, arg5, arg3, var17, var16);
            } else if (arg4 == 6) {
                class4 var35;
                if (var15.field844 == -1 && var15.field825 == null) {
                    var35 = var15.method321(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class64(var15.field844, var10, 0, var11, arg0, 4, true, var12, 18451, var13);
                }
                arg1.method423(var14, 0, var35, 256, arg8, 0, arg7, 0, arg5, arg3, var17, var16);
            } else if (arg4 == 7) {
                class4 var36;
                if (var15.field844 == -1 && var15.field825 == null) {
                    var36 = var15.method321(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class64(var15.field844, var10, 0, var11, arg0, 4, true, var12, 18451, var13);
                }
                arg1.method423(var14, 0, var36, 512, arg8, 0, arg7, 0, arg5, arg3, var17, var16);
            } else if (arg4 == 8) {
                class4 var37;
                if (var15.field844 == -1 && var15.field825 == null) {
                    var37 = var15.method321(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class64(var15.field844, var10, 0, var11, arg0, 4, true, var12, 18451, var13);
                }
                arg1.method423(var14, 0, var37, 768, arg8, 0, arg7, 0, arg5, arg3, var17, var16);
            }
        }
    }

    @OriginalMember(owner = "LVLPWFEX", name = "a", descriptor = "(ILKYNTOGBR;I[B[LBXNXROZD;I)V")
    public final void method499(int arg0, class39 arg1, int arg2, byte[] arg3, class3[] arg4, int arg5) {
        class15 var7 = new class15(arg3, false);
        if (arg2 < 7 || arg2 > 7) {
            field1273 = -89;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method275();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method275();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method261();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg5 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1268[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class3 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg4[var20];
                    }
                    this.method498(var8, arg1, var21, var19, var16, var14, (byte) 57, var17, var18);
                }
            }
        }
    }
}
