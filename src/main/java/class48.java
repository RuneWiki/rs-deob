import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!SSYGWTYM")
public class class48 {

    @OriginalMember(owner = "client!SSYGWTYM", name = "i", descriptor = "I")
    private int field1297 = -396;

    @OriginalMember(owner = "client!SSYGWTYM", name = "m", descriptor = "I")
    private int field1301 = -28345;

    @OriginalMember(owner = "client!SSYGWTYM", name = "n", descriptor = "I")
    private int field1302 = 906;

    @OriginalMember(owner = "client!SSYGWTYM", name = "u", descriptor = "Z")
    private boolean field1309 = false;

    @OriginalMember(owner = "client!SSYGWTYM", name = "v", descriptor = "B")
    private byte field1310 = 2;

    @OriginalMember(owner = "client!SSYGWTYM", name = "w", descriptor = "Z")
    private boolean field1311 = false;

    @OriginalMember(owner = "client!SSYGWTYM", name = "C", descriptor = "I")
    private int field1317;

    @OriginalMember(owner = "client!SSYGWTYM", name = "D", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!SSYGWTYM", name = "f", descriptor = "[[[I")
    private int[][][] field1294;

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "[[[B")
    private byte[][][] field1289;

    @OriginalMember(owner = "client!SSYGWTYM", name = "E", descriptor = "[[[B")
    private byte[][][] field1319;

    @OriginalMember(owner = "client!SSYGWTYM", name = "x", descriptor = "[[[B")
    private byte[][][] field1312;

    @OriginalMember(owner = "client!SSYGWTYM", name = "y", descriptor = "[[[B")
    private byte[][][] field1313;

    @OriginalMember(owner = "client!SSYGWTYM", name = "o", descriptor = "[[[B")
    private byte[][][] field1303;

    @OriginalMember(owner = "client!SSYGWTYM", name = "k", descriptor = "[[[I")
    private int[][][] field1299;

    @OriginalMember(owner = "client!SSYGWTYM", name = "e", descriptor = "[[[B")
    private byte[][][] field1293;

    @OriginalMember(owner = "client!SSYGWTYM", name = "z", descriptor = "[[I")
    private int[][] field1314;

    @OriginalMember(owner = "client!SSYGWTYM", name = "p", descriptor = "[I")
    private int[] field1304;

    @OriginalMember(owner = "client!SSYGWTYM", name = "q", descriptor = "[I")
    private int[] field1305;

    @OriginalMember(owner = "client!SSYGWTYM", name = "r", descriptor = "[I")
    private int[] field1306;

    @OriginalMember(owner = "client!SSYGWTYM", name = "s", descriptor = "[I")
    private int[] field1307;

    @OriginalMember(owner = "client!SSYGWTYM", name = "t", descriptor = "[I")
    private int[] field1308;

    @OriginalMember(owner = "client!SSYGWTYM", name = "b", descriptor = "Z")
    public static boolean field1290 = true;

    @OriginalMember(owner = "client!SSYGWTYM", name = "c", descriptor = "[I")
    private static final int[] field1291 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!SSYGWTYM", name = "d", descriptor = "[I")
    private static final int[] field1292 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!SSYGWTYM", name = "g", descriptor = "I")
    private static int field1295 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!SSYGWTYM", name = "h", descriptor = "I")
    private static int field1296 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!SSYGWTYM", name = "l", descriptor = "[I")
    private static final int[] field1300 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!SSYGWTYM", name = "A", descriptor = "[I")
    private static final int[] field1315 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!SSYGWTYM", name = "B", descriptor = "I")
    public static int field1316 = 99;

    @OriginalMember(owner = "client!SSYGWTYM", name = "j", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!SSYGWTYM", name = "F", descriptor = "Z")
    private static boolean field1320;

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(II)I")
    private static final int method397(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIIII)V")
    public final void method398(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 2 / arg1;
        for (int var7 = arg0; var7 <= arg0 + arg3; var7++) {
            for (int var8 = arg4; var8 <= arg2 + arg4; var8++) {
                if (var8 >= 0 && var8 < this.field1317 && var7 >= 0 && var7 < this.field1318) {
                    this.field1293[0][var8][var7] = 127;
                    if (arg4 == var8 && var8 > 0) {
                        this.field1294[0][var8][var7] = this.field1294[0][var8 - 1][var7];
                    }
                    if (arg2 + arg4 == var8 && var8 < this.field1317 - 1) {
                        this.field1294[0][var8][var7] = this.field1294[0][var8 + 1][var7];
                    }
                    if (arg0 == var7 && var7 > 0) {
                        this.field1294[0][var8][var7] = this.field1294[0][var8][var7 - 1];
                    }
                    if (arg0 + arg3 == var7 && var7 < this.field1318 - 1) {
                        this.field1294[0][var8][var7] = this.field1294[0][var8][var7 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "b", descriptor = "(II)I")
    private static final int method399(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIII)I")
    private static final int method400(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class39.field1116[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "<init>", descriptor = "([[[IIII[[[B)V")
    public class48(int[][][] arg0, int arg1, int arg2, int arg3, byte[][][] arg4) {
        field1316 = 99;
        this.field1317 = arg1;
        this.field1318 = arg2;
        this.field1294 = arg0;
        this.field1289 = arg4;
        this.field1319 = new byte[4][this.field1317][this.field1318];
        this.field1312 = new byte[4][this.field1317][this.field1318];
        this.field1313 = new byte[4][this.field1317][this.field1318];
        this.field1303 = new byte[4][this.field1317][this.field1318];
        this.field1299 = new int[4][this.field1317 + 1][this.field1318 + 1];
        this.field1293 = new byte[4][this.field1317 + 1][this.field1318 + 1];
        this.field1314 = new int[this.field1317 + 1][this.field1318 + 1];
        this.field1304 = new int[this.field1318];
        if (arg3 != 0) {
            throw new NullPointerException();
        }
        this.field1305 = new int[this.field1318];
        this.field1306 = new int[this.field1318];
        this.field1307 = new int[this.field1318];
        this.field1308 = new int[this.field1318];
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IBII)V")
    public final void method401(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 5) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        for (int var6 = 0; var6 < 8; var6++) {
            for (int var9 = 0; var9 < 8; var9++) {
                this.field1294[arg0][arg3 + var6][arg2 + var9] = 0;
            }
        }
        if (arg3 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1294[arg0][arg3][arg2 + var7] = this.field1294[arg0][arg3 - 1][arg2 + var7];
            }
        }
        if (arg2 > 0) {
            for (int var8 = 1; var8 < 8; var8++) {
                this.field1294[arg0][arg3 + var8][arg2] = this.field1294[arg0][arg3 + var8][arg2 - 1];
            }
        }
        if (arg3 > 0 && this.field1294[arg0][arg3 - 1][arg2] != 0) {
            this.field1294[arg0][arg3][arg2] = this.field1294[arg0][arg3 - 1][arg2];
        } else if (arg2 > 0 && this.field1294[arg0][arg3][arg2 - 1] != 0) {
            this.field1294[arg0][arg3][arg2] = this.field1294[arg0][arg3][arg2 - 1];
        } else if (arg3 > 0 && arg2 > 0 && this.field1294[arg0][arg3 - 1][arg2 - 1] != 0) {
            this.field1294[arg0][arg3][arg2] = this.field1294[arg0][arg3 - 1][arg2 - 1];
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIIILEMWAMCXW;III)V")
    private final void method402(int arg0, int arg1, int arg2, int arg3, class14 arg4, int arg5, int arg6, int arg7) {
        if (arg3 != -28345) {
            this.field1309 = !this.field1309;
        }
        if (arg5 < 0 || arg5 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var11 = arg4.method217();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg4.method217();
                    return;
                }
                if (var11 <= 49) {
                    arg4.method217();
                }
            }
        }
        this.field1289[arg7][arg5][arg0] = 0;
        while (true) {
            int var9 = arg4.method217();
            if (var9 == 0) {
                if (arg7 == 0) {
                    this.field1294[0][arg5][arg0] = -method414(arg5 + arg1 + 932731, arg0 + 556238 + arg6) * 8;
                    return;
                } else {
                    this.field1294[arg7][arg5][arg0] = this.field1294[arg7 - 1][arg5][arg0] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg4.method217();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg7 == 0) {
                    this.field1294[0][arg5][arg0] = -var10 * 8;
                    return;
                }
                this.field1294[arg7][arg5][arg0] = this.field1294[arg7 - 1][arg5][arg0] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1312[arg7][arg5][arg0] = arg4.method218();
                this.field1313[arg7][arg5][arg0] = (byte) ((var9 - 2) / 4);
                this.field1303[arg7][arg5][arg0] = (byte) (var9 + arg2 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1289[arg7][arg5][arg0] = (byte) (var9 - 49);
            } else {
                this.field1319[arg7][arg5][arg0] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "c", descriptor = "(II)I")
    private static final int method403(int arg0, int arg1) {
        int var2 = method399(arg0 - 1, arg1 - 1) + method399(arg0 + 1, arg1 - 1) + method399(arg0 - 1, arg1 + 1) + method399(arg0 + 1, arg1 + 1);
        int var3 = method399(arg0 - 1, arg1) + method399(arg0 + 1, arg1) + method399(arg0, arg1 - 1) + method399(arg0, arg1 + 1);
        int var4 = method399(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "([LCAMRNFMB;IIII[BZ)V")
    public final void method404(class6[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, boolean arg6) {
        if (arg6) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg3 + var13 > 0 && arg3 + var13 < 103 && arg1 + var14 > 0 && arg1 + var14 < 103) {
                        arg0[var8].field138[arg3 + var13][arg1 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class14 var9 = new class14(arg5, true);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method402(arg1 + var12, arg2, 0, this.field1301, var9, arg3 + var11, arg4, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIIZ)I")
    public int method405(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.field1309 = !this.field1309;
        }
        if ((this.field1289[arg1][arg2][arg0] & 0x8) == 0) {
            return arg1 <= 0 || (this.field1289[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(LEMWAMCXW;ILKMIIMWED;)V")
    public static final void method406(class14 arg0, int arg1, class26 arg2) {
        if (arg1 != 5) {
            return;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg0.method231();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class1 var5 = class1.method4(var3);
            var5.method7(true, arg2);
            while (true) {
                int var6 = arg0.method231();
                if (var6 == 0) {
                    break;
                }
                arg0.method217();
            }
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IZI[LCAMRNFMB;[BLZPFBNGWW;)V")
    public final void method407(int arg0, boolean arg1, int arg2, class6[] arg3, byte[] arg4, class68 arg5) {
        if (!arg1) {
            return;
        }
        class14 var7 = new class14(arg4, true);
        int var8 = -1;
        while (true) {
            int var9 = var7.method231();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method231();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method217();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg0 + var13;
                int var19 = arg2 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1289[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class6 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg3[var20];
                    }
                    this.method416(var16, 1, var17, var19, var14, var18, var8, arg5, var21);
                }
            }
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "([LCAMRNFMB;LZPFBNGWW;B)V")
    public final void method408(class6[] arg0, class68 arg1, byte arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1289[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1289[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg0[var112].method31(104, var111, var110);
                        }
                    }
                }
            }
        }
        field1295 += (int) (Math.random() * 5.0D) - 2;
        if (arg2 != 2) {
            return;
        }
        if (field1295 < -8) {
            field1295 = -8;
        }
        if (field1295 > 8) {
            field1295 = 8;
        }
        field1296 += (int) (Math.random() * 5.0D) - 2;
        if (field1296 < -16) {
            field1296 = -16;
        }
        if (field1296 > 16) {
            field1296 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1293[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1318 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1317 - 1; var101++) {
                    int var102 = this.field1294[var5][var101 + 1][var56] - this.field1294[var5][var101 - 1][var56];
                    int var103 = this.field1294[var5][var101][var56 + 1] - this.field1294[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1314[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1318; var57++) {
                this.field1304[var57] = 0;
                this.field1305[var57] = 0;
                this.field1306[var57] = 0;
                this.field1307[var57] = 0;
                this.field1308[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1317 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1318; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1317) {
                        int var96 = this.field1319[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class46 var97 = class46.field1262[var96 - 1];
                            this.field1304[var61] += var97.field1271;
                            this.field1305[var61] += var97.field1269;
                            this.field1306[var61] += var97.field1270;
                            this.field1307[var61] += var97.field1272;
                            var10002 = this.field1308[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1317) {
                        int var99 = this.field1319[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class46 var100 = class46.field1262[var99 - 1];
                            this.field1304[var61] -= var100.field1271;
                            this.field1305[var61] -= var100.field1269;
                            this.field1306[var61] -= var100.field1270;
                            this.field1307[var61] -= var100.field1272;
                            var10002 = this.field1308[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1317 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1318 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1318) {
                            var62 += this.field1304[var68];
                            var63 += this.field1305[var68];
                            var64 += this.field1306[var68];
                            var65 += this.field1307[var68];
                            var66 += this.field1308[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1318) {
                            var62 -= this.field1304[var69];
                            var63 -= this.field1305[var69];
                            var64 -= this.field1306[var69];
                            var65 -= this.field1307[var69];
                            var66 -= this.field1308[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1318 - 1 && (!field1290 || (this.field1289[0][var58][var67] & 0x2) != 0 || (this.field1289[var5][var58][var67] & 0x10) == 0 && this.method405(var67, var5, var58, true) == field1298)) {
                            if (var5 < field1316) {
                                field1316 = var5;
                            }
                            int var70 = this.field1319[var5][var58][var67] & 0xFF;
                            int var71 = this.field1312[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1294[var5][var58][var67];
                                int var73 = this.field1294[var5][var58 + 1][var67];
                                int var74 = this.field1294[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1294[var5][var58][var67 + 1];
                                int var76 = this.field1314[var58][var67];
                                int var77 = this.field1314[var58 + 1][var67];
                                int var78 = this.field1314[var58 + 1][var67 + 1];
                                int var79 = this.field1314[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method412(var82, var83, var84);
                                    int var85 = field1295 + var82 & 0xFF;
                                    int var86 = field1296 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method412(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1313[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class46.field1262[var71 - 1].field1267) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1299[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class39.field1127[method397(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method521(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method397(var80, var76), method397(var80, var77), method397(var80, var78), method397(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1313[var5][var58][var67] + 1;
                                    byte var90 = this.field1303[var5][var58][var67];
                                    class46 var91 = class46.field1262[var71 - 1];
                                    int var92 = var91.field1265;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class39.method355((byte) 117, var92);
                                        var94 = -1;
                                    } else if (var91.field1264 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class39.field1127[this.method411(var91.field1273, 96)];
                                    } else {
                                        var94 = this.method412(var91.field1268, var91.field1269, var91.field1270);
                                        var93 = class39.field1127[this.method411(var91.field1273, 96)];
                                    }
                                    arg1.method521(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method397(var80, var76), method397(var80, var77), method397(var80, var78), method397(var80, var79), this.method411(var94, var76), this.method411(var94, var77), this.method411(var94, var78), this.method411(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1318 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1317 - 1; var60++) {
                    arg1.method520(var5, var60, var59, this.method405(var59, var5, var60, true));
                }
            }
        }
        arg1.method547(this.field1310, -10, -50, -50);
        for (int var6 = 0; var6 < this.field1317; var6++) {
            for (int var47 = 0; var47 < this.field1318; var47++) {
                if ((this.field1289[1][var6][var47] & 0x2) == 2) {
                    arg1.method518(this.field1297, var47, var6);
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
                for (int var12 = 0; var12 <= this.field1318; var12++) {
                    for (int var13 = 0; var13 <= this.field1317; var13++) {
                        if ((this.field1299[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1299[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1318 && (this.field1299[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1299[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1299[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1294[var17][var13][var14] - var21;
                                int var23 = this.field1294[var16][var13][var14];
                                class68.method519(var22, var15 * 128 + 128, var14 * 128, var13 * 128, var13 * 128, true, 1, var10, var23);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1299[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1299[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1299[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1317 && (this.field1299[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1299[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1299[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1294[var29][var26][var12] - var33;
                                int var35 = this.field1294[var28][var26][var12];
                                class68.method519(var34, var12 * 128, var12 * 128, var26 * 128, var27 * 128 + 128, true, 2, var10, var35);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1299[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1299[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1299[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1318 && (this.field1299[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1299[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1317) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1299[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field1294[var11][var38][var40];
                                class68.method519(var44, var41 * 128 + 128, var40 * 128, var38 * 128, var39 * 128 + 128, true, 4, var10, var44);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1299[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(II[LCAMRNFMB;I[BLZPFBNGWW;IIIII)V")
    public final void method409(int arg0, int arg1, class6[] arg2, int arg3, byte[] arg4, class68 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class14 var12 = new class14(arg4, true);
        if (arg8 >= 0) {
            this.field1311 = !this.field1311;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method231();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method231();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method217();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg10 == var19 && var18 >= arg1 && var18 < arg1 + 8 && var17 >= arg6 && var17 < arg6 + 8) {
                    class1 var23 = class1.method4(var13);
                    int var24 = arg7 + class16.method261(var22, arg0, var23.field22, var18 & 0x7, var17 & 0x7, false, var23.field32);
                    int var25 = arg3 + class16.method262(var18 & 0x7, var17 & 0x7, arg0, var22, (byte) 15, var23.field32, var23.field22);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg9;
                        if ((this.field1289[1][var24][var25] & 0x2) == 2) {
                            var26 = arg9 - 1;
                        }
                        class6 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg2[var26];
                        }
                        this.method416(var21, 1, arg0 + var22 & 0x3, var25, arg9, var24, var13, arg5, var27);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(III)I")
    private static final int method410(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method403(var3, var5);
        int var8 = method403(var3 + 1, var5);
        int var9 = method403(var3, var5 + 1);
        int var10 = method403(var3 + 1, var5 + 1);
        int var11 = method400(var7, var8, var4, arg2);
        int var12 = method400(var9, var10, var4, arg2);
        return method400(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "d", descriptor = "(II)I")
    private final int method411(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!SSYGWTYM", name = "b", descriptor = "(III)I")
    private final int method412(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!SSYGWTYM", name = "c", descriptor = "(III)Z")
    public static final boolean method413(int arg0, int arg1, int arg2) {
        if (arg0 >= 0) {
            field1320 = !field1320;
        }
        class1 var3 = class1.method4(arg1);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method9(-938, arg2);
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "e", descriptor = "(II)I")
    private static final int method414(int arg0, int arg1) {
        int var2 = method410(arg0 + 45365, arg1 + 91923, 4) + (method410(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method410(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIII[BIIII[LCAMRNFMB;)V")
    public final void method415(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8, class6[] arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg2 + var11 > 0 && arg2 + var11 < 103 && arg8 + var16 > 0 && arg8 + var16 < 103) {
                    arg9[arg5].field138[arg2 + var11][arg8 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class14 var12 = new class14(arg4, true);
        if (arg7 != 7) {
            return;
        }
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg3 == var13 && var14 >= arg0 && var14 < arg0 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
                        this.method402(arg8 + class16.method260(var14 & 0x7, -750, arg6, var15 & 0x7), 0, arg6, this.field1301, var12, arg2 + class16.method259(var14 & 0x7, (byte) 9, arg6, var15 & 0x7), 0, arg5);
                    } else {
                        this.method402(-1, 0, 0, this.field1301, var12, -1, 0, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(IIIIIIILZPFBNGWW;LCAMRNFMB;)V")
    private final void method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class68 arg7, class6 arg8) {
        if (field1290 && (this.field1289[0][arg5][arg3] & 0x2) == 0) {
            if ((this.field1289[arg4][arg5][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method405(arg3, arg4, arg5, true) != field1298) {
                return;
            }
        }
        if (arg4 < field1316) {
            field1316 = arg4;
        }
        int var10 = this.field1294[arg4][arg5][arg3];
        int var11 = this.field1294[arg4][arg5 + 1][arg3];
        int var12 = this.field1294[arg4][arg5 + 1][arg3 + 1];
        int var13 = this.field1294[arg4][arg5][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        if (arg1 != 1) {
            this.field1302 = -251;
        }
        class1 var15 = class1.method4(arg6);
        int var16 = (arg6 << 14) + (arg3 << 7) + arg5 + 1073741824;
        if (!var15.field5) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg2 << 6) + arg0);
        if (arg0 == 22) {
            if (!field1290 || var15.field5 || var15.field11) {
                class12 var18;
                if (var15.field21 == -1 && var15.field18 == null) {
                    var18 = var15.method5(22, arg2, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class40(var12, var13, arg2, 22, var10, arg6, var11, var15.field21, (byte) 5, true);
                }
                arg7.method522(arg3, (byte) 9, arg5, var16, var14, var17, var18, arg4);
                if (var15.field26 && var15.field5 && arg8 != null) {
                    arg8.method31(104, arg3, arg5);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class12 var38;
            if (var15.field21 == -1 && var15.field18 == null) {
                var38 = var15.method5(10, arg2, var10, var11, var12, var13, -1);
            } else {
                var38 = new class40(var12, var13, arg2, 10, var10, arg6, var11, var15.field21, (byte) 5, true);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg0 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg2 == 1 || arg2 == 3) {
                    var40 = var15.field32;
                    var41 = var15.field22;
                } else {
                    var40 = var15.field22;
                    var41 = var15.field32;
                }
                if (arg7.method526(var14, var17, 0, arg3, var39, var38, var40, var41, arg4, arg5, var16) && var15.field8) {
                    class18 var42;
                    if (var38 instanceof class18) {
                        var42 = (class18) var38;
                    } else {
                        var42 = var15.method5(10, arg2, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field790 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1293[arg4][arg5 + var43][arg3 + var44]) {
                                    this.field1293[arg4][arg5 + var43][arg3 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field26 && arg8 != null) {
                arg8.method30(var15.field32, var15.field23, 5, arg3, arg5, var15.field22, arg2);
            }
        } else if (arg0 >= 12) {
            class12 var19;
            if (var15.field21 == -1 && var15.field18 == null) {
                var19 = var15.method5(arg0, arg2, var10, var11, var12, var13, -1);
            } else {
                var19 = new class40(var12, var13, arg2, arg0, var10, arg6, var11, var15.field21, (byte) 5, true);
            }
            arg7.method526(var14, var17, 0, arg3, 0, var19, 1, 1, arg4, arg5, var16);
            if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg4 > 0) {
                this.field1299[arg4][arg5][arg3] |= 0x924;
            }
            if (var15.field26 && arg8 != null) {
                arg8.method30(var15.field32, var15.field23, 5, arg3, arg5, var15.field22, arg2);
            }
        } else if (arg0 == 0) {
            class12 var20;
            if (var15.field21 == -1 && var15.field18 == null) {
                var20 = var15.method5(0, arg2, var10, var11, var12, var13, -1);
            } else {
                var20 = new class40(var12, var13, arg2, 0, var10, arg6, var11, var15.field21, (byte) 5, true);
            }
            arg7.method524(arg4, 0, var14, var16, var20, arg3, null, var17, field1315[arg2], arg5, 49);
            if (arg2 == 0) {
                if (var15.field8) {
                    this.field1293[arg4][arg5][arg3] = 50;
                    this.field1293[arg4][arg5][arg3 + 1] = 50;
                }
                if (var15.field31) {
                    this.field1299[arg4][arg5][arg3] |= 0x249;
                }
            } else if (arg2 == 1) {
                if (var15.field8) {
                    this.field1293[arg4][arg5][arg3 + 1] = 50;
                    this.field1293[arg4][arg5 + 1][arg3 + 1] = 50;
                }
                if (var15.field31) {
                    this.field1299[arg4][arg5][arg3 + 1] |= 0x492;
                }
            } else if (arg2 == 2) {
                if (var15.field8) {
                    this.field1293[arg4][arg5 + 1][arg3] = 50;
                    this.field1293[arg4][arg5 + 1][arg3 + 1] = 50;
                }
                if (var15.field31) {
                    this.field1299[arg4][arg5 + 1][arg3] |= 0x249;
                }
            } else if (arg2 == 3) {
                if (var15.field8) {
                    this.field1293[arg4][arg5][arg3] = 50;
                    this.field1293[arg4][arg5 + 1][arg3] = 50;
                }
                if (var15.field31) {
                    this.field1299[arg4][arg5][arg3] |= 0x492;
                }
            }
            if (var15.field26 && arg8 != null) {
                arg8.method29(-245, arg5, arg3, arg0, var15.field23, arg2);
            }
            if (var15.field38 != 16) {
                arg7.method532(8, var15.field38, arg3, arg5, arg4);
            }
        } else if (arg0 == 1) {
            class12 var21;
            if (var15.field21 == -1 && var15.field18 == null) {
                var21 = var15.method5(1, arg2, var10, var11, var12, var13, -1);
            } else {
                var21 = new class40(var12, var13, arg2, 1, var10, arg6, var11, var15.field21, (byte) 5, true);
            }
            arg7.method524(arg4, 0, var14, var16, var21, arg3, null, var17, field1291[arg2], arg5, 49);
            if (var15.field8) {
                if (arg2 == 0) {
                    this.field1293[arg4][arg5][arg3 + 1] = 50;
                } else if (arg2 == 1) {
                    this.field1293[arg4][arg5 + 1][arg3 + 1] = 50;
                } else if (arg2 == 2) {
                    this.field1293[arg4][arg5 + 1][arg3] = 50;
                } else if (arg2 == 3) {
                    this.field1293[arg4][arg5][arg3] = 50;
                }
            }
            if (var15.field26 && arg8 != null) {
                arg8.method29(-245, arg5, arg3, arg0, var15.field23, arg2);
            }
        } else if (arg0 == 2) {
            int var22 = arg2 + 1 & 0x3;
            class12 var23;
            class12 var24;
            if (var15.field21 == -1 && var15.field18 == null) {
                var23 = var15.method5(2, arg2 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method5(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class40(var12, var13, arg2 + 4, 2, var10, arg6, var11, var15.field21, (byte) 5, true);
                var24 = new class40(var12, var13, var22, 2, var10, arg6, var11, var15.field21, (byte) 5, true);
            }
            arg7.method524(arg4, field1315[var22], var14, var16, var23, arg3, var24, var17, field1315[arg2], arg5, 49);
            if (var15.field31) {
                if (arg2 == 0) {
                    this.field1299[arg4][arg5][arg3] |= 0x249;
                    this.field1299[arg4][arg5][arg3 + 1] |= 0x492;
                } else if (arg2 == 1) {
                    this.field1299[arg4][arg5][arg3 + 1] |= 0x492;
                    this.field1299[arg4][arg5 + 1][arg3] |= 0x249;
                } else if (arg2 == 2) {
                    this.field1299[arg4][arg5 + 1][arg3] |= 0x249;
                    this.field1299[arg4][arg5][arg3] |= 0x492;
                } else if (arg2 == 3) {
                    this.field1299[arg4][arg5][arg3] |= 0x492;
                    this.field1299[arg4][arg5][arg3] |= 0x249;
                }
            }
            if (var15.field26 && arg8 != null) {
                arg8.method29(-245, arg5, arg3, arg0, var15.field23, arg2);
            }
            if (var15.field38 != 16) {
                arg7.method532(8, var15.field38, arg3, arg5, arg4);
            }
        } else if (arg0 == 3) {
            class12 var25;
            if (var15.field21 == -1 && var15.field18 == null) {
                var25 = var15.method5(3, arg2, var10, var11, var12, var13, -1);
            } else {
                var25 = new class40(var12, var13, arg2, 3, var10, arg6, var11, var15.field21, (byte) 5, true);
            }
            arg7.method524(arg4, 0, var14, var16, var25, arg3, null, var17, field1291[arg2], arg5, 49);
            if (var15.field8) {
                if (arg2 == 0) {
                    this.field1293[arg4][arg5][arg3 + 1] = 50;
                } else if (arg2 == 1) {
                    this.field1293[arg4][arg5 + 1][arg3 + 1] = 50;
                } else if (arg2 == 2) {
                    this.field1293[arg4][arg5 + 1][arg3] = 50;
                } else if (arg2 == 3) {
                    this.field1293[arg4][arg5][arg3] = 50;
                }
            }
            if (var15.field26 && arg8 != null) {
                arg8.method29(-245, arg5, arg3, arg0, var15.field23, arg2);
            }
        } else if (arg0 == 9) {
            class12 var26;
            if (var15.field21 == -1 && var15.field18 == null) {
                var26 = var15.method5(arg0, arg2, var10, var11, var12, var13, -1);
            } else {
                var26 = new class40(var12, var13, arg2, arg0, var10, arg6, var11, var15.field21, (byte) 5, true);
            }
            arg7.method526(var14, var17, 0, arg3, 0, var26, 1, 1, arg4, arg5, var16);
            if (var15.field26 && arg8 != null) {
                arg8.method30(var15.field32, var15.field23, 5, arg3, arg5, var15.field22, arg2);
            }
        } else {
            if (var15.field52) {
                if (arg2 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg2 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg2 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg0 == 4) {
                class12 var31;
                if (var15.field21 == -1 && var15.field18 == null) {
                    var31 = var15.method5(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class40(var12, var13, 0, 4, var10, arg6, var11, var15.field21, (byte) 5, true);
                }
                arg7.method525(var31, arg4, var16, arg5, false, 0, 0, var17, var14, arg2 * 512, field1315[arg2], arg3);
            } else if (arg0 == 5) {
                int var32 = 16;
                int var33 = arg7.method542(arg4, arg5, arg3);
                if (var33 > 0) {
                    var32 = class1.method4(var33 >> 14 & 0x7FFF).field38;
                }
                class12 var34;
                if (var15.field21 == -1 && var15.field18 == null) {
                    var34 = var15.method5(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class40(var12, var13, 0, 4, var10, arg6, var11, var15.field21, (byte) 5, true);
                }
                arg7.method525(var34, arg4, var16, arg5, false, field1292[arg2] * var32, field1300[arg2] * var32, var17, var14, arg2 * 512, field1315[arg2], arg3);
            } else if (arg0 == 6) {
                class12 var35;
                if (var15.field21 == -1 && var15.field18 == null) {
                    var35 = var15.method5(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class40(var12, var13, 0, 4, var10, arg6, var11, var15.field21, (byte) 5, true);
                }
                arg7.method525(var35, arg4, var16, arg5, false, 0, 0, var17, var14, arg2, 256, arg3);
            } else if (arg0 == 7) {
                class12 var36;
                if (var15.field21 == -1 && var15.field18 == null) {
                    var36 = var15.method5(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class40(var12, var13, 0, 4, var10, arg6, var11, var15.field21, (byte) 5, true);
                }
                arg7.method525(var36, arg4, var16, arg5, false, 0, 0, var17, var14, arg2, 512, arg3);
            } else if (arg0 == 8) {
                class12 var37;
                if (var15.field21 == -1 && var15.field18 == null) {
                    var37 = var15.method5(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class40(var12, var13, 0, 4, var10, arg6, var11, var15.field21, (byte) 5, true);
                }
                arg7.method525(var37, arg4, var16, arg5, false, 0, 0, var17, var14, arg2, 768, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(I[[[ILZPFBNGWW;IILCAMRNFMB;IIIII)V")
    public static final void method417(int arg0, int[][][] arg1, class68 arg2, int arg3, int arg4, class6 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg1[arg10][arg0][arg9];
        int var12 = arg1[arg10][arg0 + 1][arg9];
        if (arg6 != 0) {
            return;
        }
        int var13 = arg1[arg10][arg0 + 1][arg9 + 1];
        int var14 = arg1[arg10][arg0][arg9 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class1 var16 = class1.method4(arg7);
        int var17 = (arg7 << 14) + (arg9 << 7) + arg0 + 1073741824;
        if (!var16.field5) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg3 << 6) + arg8);
        if (arg8 == 22) {
            class12 var19;
            if (var16.field21 == -1 && var16.field18 == null) {
                var19 = var16.method5(22, arg3, var11, var12, var13, var14, -1);
            } else {
                var19 = new class40(var13, var14, arg3, 22, var11, arg7, var12, var16.field21, (byte) 5, true);
            }
            arg2.method522(arg9, (byte) 9, arg0, var17, var15, var18, var19, arg4);
            if (var16.field26 && var16.field5) {
                arg5.method31(104, arg9, arg0);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class12 var39;
            if (var16.field21 == -1 && var16.field18 == null) {
                var39 = var16.method5(10, arg3, var11, var12, var13, var14, -1);
            } else {
                var39 = new class40(var13, var14, arg3, 10, var11, arg7, var12, var16.field21, (byte) 5, true);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg8 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg3 == 1 || arg3 == 3) {
                    var41 = var16.field32;
                    var42 = var16.field22;
                } else {
                    var41 = var16.field22;
                    var42 = var16.field32;
                }
                arg2.method526(var15, var18, 0, arg9, var40, var39, var41, var42, arg4, arg0, var17);
            }
            if (var16.field26) {
                arg5.method30(var16.field32, var16.field23, 5, arg9, arg0, var16.field22, arg3);
            }
        } else if (arg8 >= 12) {
            class12 var20;
            if (var16.field21 == -1 && var16.field18 == null) {
                var20 = var16.method5(arg8, arg3, var11, var12, var13, var14, -1);
            } else {
                var20 = new class40(var13, var14, arg3, arg8, var11, arg7, var12, var16.field21, (byte) 5, true);
            }
            arg2.method526(var15, var18, 0, arg9, 0, var20, 1, 1, arg4, arg0, var17);
            if (var16.field26) {
                arg5.method30(var16.field32, var16.field23, 5, arg9, arg0, var16.field22, arg3);
            }
        } else if (arg8 == 0) {
            class12 var21;
            if (var16.field21 == -1 && var16.field18 == null) {
                var21 = var16.method5(0, arg3, var11, var12, var13, var14, -1);
            } else {
                var21 = new class40(var13, var14, arg3, 0, var11, arg7, var12, var16.field21, (byte) 5, true);
            }
            arg2.method524(arg4, 0, var15, var17, var21, arg9, null, var18, field1315[arg3], arg0, 49);
            if (var16.field26) {
                arg5.method29(-245, arg0, arg9, arg8, var16.field23, arg3);
            }
        } else if (arg8 == 1) {
            class12 var22;
            if (var16.field21 == -1 && var16.field18 == null) {
                var22 = var16.method5(1, arg3, var11, var12, var13, var14, -1);
            } else {
                var22 = new class40(var13, var14, arg3, 1, var11, arg7, var12, var16.field21, (byte) 5, true);
            }
            arg2.method524(arg4, 0, var15, var17, var22, arg9, null, var18, field1291[arg3], arg0, 49);
            if (var16.field26) {
                arg5.method29(-245, arg0, arg9, arg8, var16.field23, arg3);
            }
        } else if (arg8 == 2) {
            int var23 = arg3 + 1 & 0x3;
            class12 var24;
            class12 var25;
            if (var16.field21 == -1 && var16.field18 == null) {
                var24 = var16.method5(2, arg3 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method5(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class40(var13, var14, arg3 + 4, 2, var11, arg7, var12, var16.field21, (byte) 5, true);
                var25 = new class40(var13, var14, var23, 2, var11, arg7, var12, var16.field21, (byte) 5, true);
            }
            arg2.method524(arg4, field1315[var23], var15, var17, var24, arg9, var25, var18, field1315[arg3], arg0, 49);
            if (var16.field26) {
                arg5.method29(-245, arg0, arg9, arg8, var16.field23, arg3);
            }
        } else if (arg8 == 3) {
            class12 var26;
            if (var16.field21 == -1 && var16.field18 == null) {
                var26 = var16.method5(3, arg3, var11, var12, var13, var14, -1);
            } else {
                var26 = new class40(var13, var14, arg3, 3, var11, arg7, var12, var16.field21, (byte) 5, true);
            }
            arg2.method524(arg4, 0, var15, var17, var26, arg9, null, var18, field1291[arg3], arg0, 49);
            if (var16.field26) {
                arg5.method29(-245, arg0, arg9, arg8, var16.field23, arg3);
            }
        } else if (arg8 == 9) {
            class12 var27;
            if (var16.field21 == -1 && var16.field18 == null) {
                var27 = var16.method5(arg8, arg3, var11, var12, var13, var14, -1);
            } else {
                var27 = new class40(var13, var14, arg3, arg8, var11, arg7, var12, var16.field21, (byte) 5, true);
            }
            arg2.method526(var15, var18, 0, arg9, 0, var27, 1, 1, arg4, arg0, var17);
            if (var16.field26) {
                arg5.method30(var16.field32, var16.field23, 5, arg9, arg0, var16.field22, arg3);
            }
        } else {
            if (var16.field52) {
                if (arg3 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg3 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg3 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg8 == 4) {
                class12 var32;
                if (var16.field21 == -1 && var16.field18 == null) {
                    var32 = var16.method5(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class40(var13, var14, 0, 4, var11, arg7, var12, var16.field21, (byte) 5, true);
                }
                arg2.method525(var32, arg4, var17, arg0, false, 0, 0, var18, var15, arg3 * 512, field1315[arg3], arg9);
            } else if (arg8 == 5) {
                int var33 = 16;
                int var34 = arg2.method542(arg4, arg0, arg9);
                if (var34 > 0) {
                    var33 = class1.method4(var34 >> 14 & 0x7FFF).field38;
                }
                class12 var35;
                if (var16.field21 == -1 && var16.field18 == null) {
                    var35 = var16.method5(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class40(var13, var14, 0, 4, var11, arg7, var12, var16.field21, (byte) 5, true);
                }
                arg2.method525(var35, arg4, var17, arg0, false, field1292[arg3] * var33, field1300[arg3] * var33, var18, var15, arg3 * 512, field1315[arg3], arg9);
            } else if (arg8 == 6) {
                class12 var36;
                if (var16.field21 == -1 && var16.field18 == null) {
                    var36 = var16.method5(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class40(var13, var14, 0, 4, var11, arg7, var12, var16.field21, (byte) 5, true);
                }
                arg2.method525(var36, arg4, var17, arg0, false, 0, 0, var18, var15, arg3, 256, arg9);
            } else if (arg8 == 7) {
                class12 var37;
                if (var16.field21 == -1 && var16.field18 == null) {
                    var37 = var16.method5(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class40(var13, var14, 0, 4, var11, arg7, var12, var16.field21, (byte) 5, true);
                }
                arg2.method525(var37, arg4, var17, arg0, false, 0, 0, var18, var15, arg3, 512, arg9);
            } else if (arg8 == 8) {
                class12 var38;
                if (var16.field21 == -1 && var16.field18 == null) {
                    var38 = var16.method5(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class40(var13, var14, 0, 4, var11, arg7, var12, var16.field21, (byte) 5, true);
                }
                arg2.method525(var38, arg4, var17, arg0, false, 0, 0, var18, var15, arg3, 768, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!SSYGWTYM", name = "a", descriptor = "(I[BIZ)Z")
    public static final boolean method418(int arg0, byte[] arg1, int arg2, boolean arg3) {
        boolean var4 = true;
        class14 var5 = new class14(arg1, true);
        int var6 = -1;
        if (!arg3) {
            field1320 = !field1320;
        }
        label57: while (true) {
            int var7 = var5.method231();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method231();
                    if (var11 == 0) {
                        continue label57;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method217() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class1 var17 = class1.method4(var6);
                        if (var14 != 22 || !field1290 || var17.field5 || var17.field11) {
                            var4 &= var17.method6(false);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method231();
                if (var10 == 0) {
                    break;
                }
                var5.method217();
            }
        }
    }
}
