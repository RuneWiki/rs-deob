import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!AGPNOIRK")
public class class2 {

    @OriginalMember(owner = "client!AGPNOIRK", name = "j", descriptor = "I")
    private int field10 = 488;

    @OriginalMember(owner = "client!AGPNOIRK", name = "l", descriptor = "I")
    private int field12 = 33636;

    @OriginalMember(owner = "client!AGPNOIRK", name = "v", descriptor = "Z")
    private boolean field22 = false;

    @OriginalMember(owner = "client!AGPNOIRK", name = "b", descriptor = "I")
    private int field2;

    @OriginalMember(owner = "client!AGPNOIRK", name = "c", descriptor = "I")
    private int field3;

    @OriginalMember(owner = "client!AGPNOIRK", name = "C", descriptor = "[[[I")
    private int[][][] field29;

    @OriginalMember(owner = "client!AGPNOIRK", name = "g", descriptor = "[[[B")
    private byte[][][] field7;

    @OriginalMember(owner = "client!AGPNOIRK", name = "i", descriptor = "[[[B")
    private byte[][][] field9;

    @OriginalMember(owner = "client!AGPNOIRK", name = "u", descriptor = "[[[B")
    private byte[][][] field21;

    @OriginalMember(owner = "client!AGPNOIRK", name = "D", descriptor = "[[[B")
    private byte[][][] field30;

    @OriginalMember(owner = "client!AGPNOIRK", name = "r", descriptor = "[[[B")
    private byte[][][] field18;

    @OriginalMember(owner = "client!AGPNOIRK", name = "h", descriptor = "[[[I")
    private int[][][] field8;

    @OriginalMember(owner = "client!AGPNOIRK", name = "t", descriptor = "[[[B")
    private byte[][][] field20;

    @OriginalMember(owner = "client!AGPNOIRK", name = "s", descriptor = "[[I")
    private int[][] field19;

    @OriginalMember(owner = "client!AGPNOIRK", name = "w", descriptor = "[I")
    private int[] field23;

    @OriginalMember(owner = "client!AGPNOIRK", name = "x", descriptor = "[I")
    private int[] field24;

    @OriginalMember(owner = "client!AGPNOIRK", name = "y", descriptor = "[I")
    private int[] field25;

    @OriginalMember(owner = "client!AGPNOIRK", name = "z", descriptor = "[I")
    private int[] field26;

    @OriginalMember(owner = "client!AGPNOIRK", name = "A", descriptor = "[I")
    private int[] field27;

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "I")
    public static int field1 = 99;

    @OriginalMember(owner = "client!AGPNOIRK", name = "d", descriptor = "Z")
    private static boolean field4 = true;

    @OriginalMember(owner = "client!AGPNOIRK", name = "e", descriptor = "[I")
    private static final int[] field5 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!AGPNOIRK", name = "k", descriptor = "[I")
    private static final int[] field11 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!AGPNOIRK", name = "m", descriptor = "Z")
    private static boolean field13 = true;

    @OriginalMember(owner = "client!AGPNOIRK", name = "n", descriptor = "I")
    private static int field14 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!AGPNOIRK", name = "o", descriptor = "[I")
    private static final int[] field15 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!AGPNOIRK", name = "p", descriptor = "Z")
    public static boolean field16 = true;

    @OriginalMember(owner = "client!AGPNOIRK", name = "q", descriptor = "[I")
    private static final int[] field17 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!AGPNOIRK", name = "B", descriptor = "I")
    private static int field28 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!AGPNOIRK", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(II)I")
    private static final int method2(int arg0, int arg1) {
        int var2 = method12(arg0 + 45365, arg1 + 91923, 4) + (method12(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method12(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "b", descriptor = "(II)I")
    private final int method3(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIZI)V")
    public final void method4(int arg0, int arg1, boolean arg2, int arg3) {
        if (!arg2) {
            field4 = !field4;
        }
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field29[arg1][arg0 + var5][arg3 + var8] = 0;
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field29[arg1][arg0][arg3 + var6] = this.field29[arg1][arg0 - 1][arg3 + var6];
            }
        }
        if (arg3 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field29[arg1][arg0 + var7][arg3] = this.field29[arg1][arg0 + var7][arg3 - 1];
            }
        }
        if (arg0 > 0 && this.field29[arg1][arg0 - 1][arg3] != 0) {
            this.field29[arg1][arg0][arg3] = this.field29[arg1][arg0 - 1][arg3];
        } else if (arg3 > 0 && this.field29[arg1][arg0][arg3 - 1] != 0) {
            this.field29[arg1][arg0][arg3] = this.field29[arg1][arg0][arg3 - 1];
        } else if (arg0 > 0 && arg3 > 0 && this.field29[arg1][arg0 - 1][arg3 - 1] != 0) {
            this.field29[arg1][arg0][arg3] = this.field29[arg1][arg0 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(III)I")
    private final int method5(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIII)I")
    private static final int method6(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class49.field1384[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "c", descriptor = "(II)I")
    private static final int method7(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "<init>", descriptor = "([[[BI[[[IIZ)V")
    public class2(byte[][][] arg0, int arg1, int[][][] arg2, int arg3, boolean arg4) {
        field1 = 99;
        this.field2 = arg3;
        this.field3 = arg1;
        this.field29 = arg2;
        this.field7 = arg0;
        this.field9 = new byte[4][this.field2][this.field3];
        this.field21 = new byte[4][this.field2][this.field3];
        this.field30 = new byte[4][this.field2][this.field3];
        this.field18 = new byte[4][this.field2][this.field3];
        this.field8 = new int[4][this.field2 + 1][this.field3 + 1];
        this.field20 = new byte[4][this.field2 + 1][this.field3 + 1];
        this.field19 = new int[this.field2 + 1][this.field3 + 1];
        this.field23 = new int[this.field3];
        if (!arg4) {
            this.field12 = 303;
        }
        this.field24 = new int[this.field3];
        this.field25 = new int[this.field3];
        this.field26 = new int[this.field3];
        this.field27 = new int[this.field3];
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIIII)V")
    public final void method8(int arg0, int arg1, int arg2, int arg3, int arg4) {
        label64: while (true) {
            if (arg3 >= 0) {
                int var8 = 1;
                while (true) {
                    if (var8 <= 0) {
                        continue label64;
                    }
                    var8++;
                }
            }
            for (int var6 = arg4; var6 <= arg0 + arg4; var6++) {
                for (int var7 = arg2; var7 <= arg1 + arg2; var7++) {
                    if (var7 >= 0 && var7 < this.field2 && var6 >= 0 && var6 < this.field3) {
                        this.field20[0][var7][var6] = 127;
                        if (arg2 == var7 && var7 > 0) {
                            this.field29[0][var7][var6] = this.field29[0][var7 - 1][var6];
                        }
                        if (arg1 + arg2 == var7 && var7 < this.field2 - 1) {
                            this.field29[0][var7][var6] = this.field29[0][var7 + 1][var6];
                        }
                        if (arg4 == var6 && var6 > 0) {
                            this.field29[0][var7][var6] = this.field29[0][var7][var6 - 1];
                        }
                        if (arg0 + arg4 == var6 && var6 < this.field3 - 1) {
                            this.field29[0][var7][var6] = this.field29[0][var7][var6 + 1];
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(LMPMWDRAA;[LUDXVXGJJ;I)V")
    public final void method9(class32 arg0, class55[] arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field7[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field7[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method518(var111, var110, 989);
                        }
                    }
                }
            }
        }
        field14 += (int) (Math.random() * 5.0D) - 2;
        if (arg2 < 1 || arg2 > 1) {
            this.field10 = 344;
        }
        if (field14 < -8) {
            field14 = -8;
        }
        if (field14 > 8) {
            field14 = 8;
        }
        field28 += (int) (Math.random() * 5.0D) - 2;
        if (field28 < -16) {
            field28 = -16;
        }
        if (field28 > 16) {
            field28 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field20[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field3 - 1; var56++) {
                for (int var101 = 1; var101 < this.field2 - 1; var101++) {
                    int var102 = this.field29[var5][var101 + 1][var56] - this.field29[var5][var101 - 1][var56];
                    int var103 = this.field29[var5][var101][var56 + 1] - this.field29[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field19[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field3; var57++) {
                this.field23[var57] = 0;
                this.field24[var57] = 0;
                this.field25[var57] = 0;
                this.field26[var57] = 0;
                this.field27[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field2 + 5; var58++) {
                for (int var61 = 0; var61 < this.field3; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field2) {
                        int var96 = this.field9[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class24 var97 = class24.field852[var96 - 1];
                            this.field23[var61] += var97.field861;
                            this.field24[var61] += var97.field859;
                            this.field25[var61] += var97.field860;
                            this.field26[var61] += var97.field862;
                            var10002 = this.field27[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field2) {
                        int var99 = this.field9[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class24 var100 = class24.field852[var99 - 1];
                            this.field23[var61] -= var100.field861;
                            this.field24[var61] -= var100.field859;
                            this.field25[var61] -= var100.field860;
                            this.field26[var61] -= var100.field862;
                            var10002 = this.field27[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field2 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field3 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field3) {
                            var62 += this.field23[var68];
                            var63 += this.field24[var68];
                            var64 += this.field25[var68];
                            var65 += this.field26[var68];
                            var66 += this.field27[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field3) {
                            var62 -= this.field23[var69];
                            var63 -= this.field24[var69];
                            var64 -= this.field25[var69];
                            var65 -= this.field26[var69];
                            var66 -= this.field27[var69];
                        }
                        if (var67 >= 1 && var67 < this.field3 - 1 && (!field16 || (this.field7[0][var58][var67] & 0x2) != 0 || (this.field7[var5][var58][var67] & 0x10) == 0 && this.method17(var58, var5, var67, (byte) 78) == field6)) {
                            if (var5 < field1) {
                                field1 = var5;
                            }
                            int var70 = this.field9[var5][var58][var67] & 0xFF;
                            int var71 = this.field21[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field29[var5][var58][var67];
                                int var73 = this.field29[var5][var58 + 1][var67];
                                int var74 = this.field29[var5][var58 + 1][var67 + 1];
                                int var75 = this.field29[var5][var58][var67 + 1];
                                int var76 = this.field19[var58][var67];
                                int var77 = this.field19[var58 + 1][var67];
                                int var78 = this.field19[var58 + 1][var67 + 1];
                                int var79 = this.field19[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method5(var82, var83, var84);
                                    int var85 = field14 + var82 & 0xFF;
                                    int var86 = field28 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method5(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field30[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class24.field852[var71 - 1].field857) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field8[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class49.field1395[method22(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method289(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method22(var80, var76), method22(var80, var77), method22(var80, var78), method22(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field30[var5][var58][var67] + 1;
                                    byte var90 = this.field18[var5][var58][var67];
                                    class24 var91 = class24.field852[var71 - 1];
                                    int var92 = var91.field855;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class49.method430(var92, (byte) 5);
                                        var94 = -1;
                                    } else if (var91.field854 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class49.field1395[this.method3(var91.field863, 96)];
                                    } else {
                                        var94 = this.method5(var91.field858, var91.field859, var91.field860);
                                        var93 = class49.field1395[this.method3(var91.field863, 96)];
                                    }
                                    arg0.method289(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method22(var80, var76), method22(var80, var77), method22(var80, var78), method22(var80, var79), this.method3(var94, var76), this.method3(var94, var77), this.method3(var94, var78), this.method3(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field3 - 1; var59++) {
                for (int var60 = 1; var60 < this.field2 - 1; var60++) {
                    arg0.method288(var5, var60, var59, this.method17(var60, var5, var59, (byte) 78));
                }
            }
        }
        arg0.method315(-50, 23, -10, -50);
        for (int var6 = 0; var6 < this.field2; var6++) {
            for (int var47 = 0; var47 < this.field3; var47++) {
                if ((this.field7[1][var6][var47] & 0x2) == 2) {
                    arg0.method286(var47, -11335, var6);
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
                for (int var12 = 0; var12 <= this.field3; var12++) {
                    for (int var13 = 0; var13 <= this.field2; var13++) {
                        if ((this.field8[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field8[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field3 && (this.field8[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label329: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field8[var16 - 1][var13][var18] & var7) == 0) {
                                        break label329;
                                    }
                                }
                                var16--;
                            }
                            label318: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field8[var17 + 1][var13][var19] & var7) == 0) {
                                        break label318;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field29[var17][var13][var14] - var21;
                                int var23 = this.field29[var16][var13][var14];
                                class32.method287(var14 * 128, var15 * 128 + 128, var13 * 128, 1, var23, var10, (byte) 6, var13 * 128, var22);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field8[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field8[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field8[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field2 && (this.field8[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label382: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field8[var28 - 1][var30][var12] & var8) == 0) {
                                        break label382;
                                    }
                                }
                                var28--;
                            }
                            label371: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field8[var29 + 1][var31][var12] & var8) == 0) {
                                        break label371;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field29[var29][var26][var12] - var33;
                                int var35 = this.field29[var28][var26][var12];
                                class32.method287(var12 * 128, var12 * 128, var26 * 128, 2, var35, var10, (byte) 6, var27 * 128 + 128, var34);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field8[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field8[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field8[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field3 && (this.field8[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label435: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field8[var11][var38 - 1][var42] & var9) == 0) {
                                        break label435;
                                    }
                                }
                                var38--;
                            }
                            label424: while (var39 < this.field2) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field8[var11][var39 + 1][var43] & var9) == 0) {
                                        break label424;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field29[var11][var38][var40];
                                class32.method287(var40 * 128, var41 * 128 + 128, var38 * 128, 4, var44, var10, (byte) 6, var39 * 128 + 128, var44);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field8[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIIIILTQYMAXSO;II)V")
    private final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, class53 arg5, int arg6, int arg7) {
        if (arg2 != 0) {
            return;
        }
        if (arg7 < 0 || arg7 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var11 = arg5.method468();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg5.method468();
                    return;
                }
                if (var11 <= 49) {
                    arg5.method468();
                }
            }
        }
        this.field7[arg3][arg7][arg0] = 0;
        while (true) {
            int var9 = arg5.method468();
            if (var9 == 0) {
                if (arg3 == 0) {
                    this.field29[0][arg7][arg0] = -method2(arg7 + arg6 + 932731, arg0 + 556238 + arg1) * 8;
                    return;
                } else {
                    this.field29[arg3][arg7][arg0] = this.field29[arg3 - 1][arg7][arg0] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg5.method468();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg3 == 0) {
                    this.field29[0][arg7][arg0] = -var10 * 8;
                    return;
                }
                this.field29[arg3][arg7][arg0] = this.field29[arg3 - 1][arg7][arg0] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field21[arg3][arg7][arg0] = arg5.method469();
                this.field30[arg3][arg7][arg0] = (byte) ((var9 - 2) / 4);
                this.field18[arg3][arg7][arg0] = (byte) (var9 + arg4 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field7[arg3][arg7][arg0] = (byte) (var9 - 49);
            } else {
                this.field9[arg3][arg7][arg0] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "d", descriptor = "(II)I")
    private static final int method11(int arg0, int arg1) {
        int var2 = method7(arg0 - 1, arg1 - 1) + method7(arg0 + 1, arg1 - 1) + method7(arg0 - 1, arg1 + 1) + method7(arg0 + 1, arg1 + 1);
        int var3 = method7(arg0 - 1, arg1) + method7(arg0 + 1, arg1) + method7(arg0, arg1 - 1) + method7(arg0, arg1 + 1);
        int var4 = method7(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "b", descriptor = "(III)I")
    private static final int method12(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method11(var3, var5);
        int var8 = method11(var3 + 1, var5);
        int var9 = method11(var3, var5 + 1);
        int var10 = method11(var3 + 1, var5 + 1);
        int var11 = method6(var7, var8, var4, arg2);
        int var12 = method6(var9, var10, var4, arg2);
        return method6(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(III[BIIILMPMWDRAA;I[LUDXVXGJJ;I)V")
    public final void method13(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, class32 arg7, int arg8, class55[] arg9, int arg10) {
        class53 var12 = new class53(arg3, -631);
        int var13 = -1;
        if (arg5 != 0) {
            field13 = !field13;
        }
        while (true) {
            int var14 = var12.method482();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method482();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method468();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg6 == var19 && var18 >= arg10 && var18 < arg10 + 8 && var17 >= arg4 && var17 < arg4 + 8) {
                    class63 var23 = class63.method555(var13);
                    int var24 = arg2 + class39.method365(var18 & 0x7, var23.field1605, 0, var17 & 0x7, var22, arg0, var23.field1566);
                    int var25 = arg8 + class39.method366(var23.field1605, arg0, var18 & 0x7, var23.field1566, var22, true, var17 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg1;
                        if ((this.field7[1][var24][var25] & 0x2) == 2) {
                            var26 = arg1 - 1;
                        }
                        class55 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg9[var26];
                        }
                        this.method20(40895, var27, var24, arg1, var13, var25, arg7, var21, arg0 + var22 & 0x3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(LHJOZCGZH;LTQYMAXSO;I)V")
    public static final void method14(class16 arg0, class53 arg1, int arg2) {
        if (arg2 >= 0) {
            field13 = !field13;
        }
        int var3 = -1;
        while (true) {
            int var4 = arg1.method482();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class63 var5 = class63.method555(var3);
            var5.method552(arg0, false);
            while (true) {
                int var6 = arg1.method482();
                if (var6 == 0) {
                    break;
                }
                arg1.method468();
            }
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IZI[B)Z")
    public static final boolean method15(int arg0, boolean arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        class53 var5 = new class53(arg3, -631);
        if (!arg1) {
            throw new NullPointerException();
        }
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method482();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method482();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method468() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class63 var17 = class63.method555(var6);
                        if (var14 != 22 || !field16 || var17.field1599 || var17.field1577) {
                            var4 &= var17.method554(field13);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method482();
                if (var10 == 0) {
                    break;
                }
                var5.method468();
            }
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIILUDXVXGJJ;IIILMPMWDRAA;II[[[I)V")
    public static final void method16(int arg0, int arg1, int arg2, class55 arg3, int arg4, int arg5, int arg6, class32 arg7, int arg8, int arg9, int[][][] arg10) {
        int var11 = arg10[arg5][arg0][arg6];
        int var12 = arg10[arg5][arg0 + 1][arg6];
        int var13 = arg10[arg5][arg0 + 1][arg6 + 1];
        int var14 = arg10[arg5][arg0][arg6 + 1];
        if (arg8 != 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        int var16 = var11 + var12 + var13 + var14 >> 2;
        class63 var17 = class63.method555(arg2);
        int var18 = (arg2 << 14) + (arg6 << 7) + arg0 + 1073741824;
        if (!var17.field1599) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg4 << 6) + arg9);
        if (arg9 == 22) {
            class17 var20;
            if (var17.field1582 == -1 && var17.field1573 == null) {
                var20 = var17.method556(22, arg4, var11, var12, var13, var14, -1);
            } else {
                var20 = new class36(var14, arg2, var12, true, arg4, 22, var13, var17.field1582, (byte) -108, var11);
            }
            arg7.method290(var20, arg6, arg1, var18, var16, var19, 9, arg0);
            if (var17.field1559 && var17.field1599) {
                arg3.method518(arg6, arg0, 989);
            }
        } else if (arg9 == 10 || arg9 == 11) {
            class17 var40;
            if (var17.field1582 == -1 && var17.field1573 == null) {
                var40 = var17.method556(10, arg4, var11, var12, var13, var14, -1);
            } else {
                var40 = new class36(var14, arg2, var12, true, arg4, 10, var13, var17.field1582, (byte) -108, var11);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg9 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg4 == 1 || arg4 == 3) {
                    var42 = var17.field1605;
                    var43 = var17.field1566;
                } else {
                    var42 = var17.field1566;
                    var43 = var17.field1605;
                }
                arg7.method294(arg6, var18, var42, var41, arg0, arg1, var19, var40, var43, var16, (byte) 4);
            }
            if (var17.field1559) {
                arg3.method517(arg6, var17.field1605, arg4, var17.field1566, var17.field1604, 8, arg0);
            }
        } else if (arg9 >= 12) {
            class17 var21;
            if (var17.field1582 == -1 && var17.field1573 == null) {
                var21 = var17.method556(arg9, arg4, var11, var12, var13, var14, -1);
            } else {
                var21 = new class36(var14, arg2, var12, true, arg4, arg9, var13, var17.field1582, (byte) -108, var11);
            }
            arg7.method294(arg6, var18, 1, 0, arg0, arg1, var19, var21, 1, var16, (byte) 4);
            if (var17.field1559) {
                arg3.method517(arg6, var17.field1605, arg4, var17.field1566, var17.field1604, 8, arg0);
            }
        } else if (arg9 == 0) {
            class17 var22;
            if (var17.field1582 == -1 && var17.field1573 == null) {
                var22 = var17.method556(0, arg4, var11, var12, var13, var14, -1);
            } else {
                var22 = new class36(var14, arg2, var12, true, arg4, 0, var13, var17.field1582, (byte) -108, var11);
            }
            arg7.method292(0, arg1, arg6, null, var19, field17[arg4], arg0, 0, var16, var18, var22);
            if (var17.field1559) {
                arg3.method516(var17.field1604, arg9, arg4, false, arg0, arg6);
            }
        } else if (arg9 == 1) {
            class17 var23;
            if (var17.field1582 == -1 && var17.field1573 == null) {
                var23 = var17.method556(1, arg4, var11, var12, var13, var14, -1);
            } else {
                var23 = new class36(var14, arg2, var12, true, arg4, 1, var13, var17.field1582, (byte) -108, var11);
            }
            arg7.method292(0, arg1, arg6, null, var19, field11[arg4], arg0, 0, var16, var18, var23);
            if (var17.field1559) {
                arg3.method516(var17.field1604, arg9, arg4, false, arg0, arg6);
            }
        } else if (arg9 == 2) {
            int var24 = arg4 + 1 & 0x3;
            class17 var25;
            class17 var26;
            if (var17.field1582 == -1 && var17.field1573 == null) {
                var25 = var17.method556(2, arg4 + 4, var11, var12, var13, var14, -1);
                var26 = var17.method556(2, var24, var11, var12, var13, var14, -1);
            } else {
                var25 = new class36(var14, arg2, var12, true, arg4 + 4, 2, var13, var17.field1582, (byte) -108, var11);
                var26 = new class36(var14, arg2, var12, true, var24, 2, var13, var17.field1582, (byte) -108, var11);
            }
            arg7.method292(0, arg1, arg6, var26, var19, field17[arg4], arg0, field17[var24], var16, var18, var25);
            if (var17.field1559) {
                arg3.method516(var17.field1604, arg9, arg4, false, arg0, arg6);
            }
        } else if (arg9 == 3) {
            class17 var27;
            if (var17.field1582 == -1 && var17.field1573 == null) {
                var27 = var17.method556(3, arg4, var11, var12, var13, var14, -1);
            } else {
                var27 = new class36(var14, arg2, var12, true, arg4, 3, var13, var17.field1582, (byte) -108, var11);
            }
            arg7.method292(0, arg1, arg6, null, var19, field11[arg4], arg0, 0, var16, var18, var27);
            if (var17.field1559) {
                arg3.method516(var17.field1604, arg9, arg4, false, arg0, arg6);
            }
        } else if (arg9 == 9) {
            class17 var28;
            if (var17.field1582 == -1 && var17.field1573 == null) {
                var28 = var17.method556(arg9, arg4, var11, var12, var13, var14, -1);
            } else {
                var28 = new class36(var14, arg2, var12, true, arg4, arg9, var13, var17.field1582, (byte) -108, var11);
            }
            arg7.method294(arg6, var18, 1, 0, arg0, arg1, var19, var28, 1, var16, (byte) 4);
            if (var17.field1559) {
                arg3.method517(arg6, var17.field1605, arg4, var17.field1566, var17.field1604, 8, arg0);
            }
        } else {
            if (var17.field1558) {
                if (arg4 == 1) {
                    int var29 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg4 == 2) {
                    int var30 = var14;
                    var14 = var12;
                    var12 = var30;
                    int var31 = var13;
                    var13 = var11;
                    var11 = var31;
                } else if (arg4 == 3) {
                    int var32 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var32;
                }
            }
            if (arg9 == 4) {
                class17 var33;
                if (var17.field1582 == -1 && var17.field1573 == null) {
                    var33 = var17.method556(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var33 = new class36(var14, arg2, var12, true, 0, 4, var13, var17.field1582, (byte) -108, var11);
                }
                arg7.method293(var16, var33, arg0, arg1, false, var19, field17[arg4], 0, var18, 0, arg4 * 512, arg6);
            } else if (arg9 == 5) {
                int var34 = 16;
                int var35 = arg7.method310(arg1, arg0, arg6);
                if (var35 > 0) {
                    var34 = class63.method555(var35 >> 14 & 0x7FFF).field1567;
                }
                class17 var36;
                if (var17.field1582 == -1 && var17.field1573 == null) {
                    var36 = var17.method556(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class36(var14, arg2, var12, true, 0, 4, var13, var17.field1582, (byte) -108, var11);
                }
                arg7.method293(var16, var36, arg0, arg1, false, var19, field17[arg4], field5[arg4] * var34, var18, field15[arg4] * var34, arg4 * 512, arg6);
            } else if (arg9 == 6) {
                class17 var37;
                if (var17.field1582 == -1 && var17.field1573 == null) {
                    var37 = var17.method556(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class36(var14, arg2, var12, true, 0, 4, var13, var17.field1582, (byte) -108, var11);
                }
                arg7.method293(var16, var37, arg0, arg1, false, var19, 256, 0, var18, 0, arg4, arg6);
            } else if (arg9 == 7) {
                class17 var38;
                if (var17.field1582 == -1 && var17.field1573 == null) {
                    var38 = var17.method556(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class36(var14, arg2, var12, true, 0, 4, var13, var17.field1582, (byte) -108, var11);
                }
                arg7.method293(var16, var38, arg0, arg1, false, var19, 512, 0, var18, 0, arg4, arg6);
            } else if (arg9 == 8) {
                class17 var39;
                if (var17.field1582 == -1 && var17.field1573 == null) {
                    var39 = var17.method556(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var39 = new class36(var14, arg2, var12, true, 0, 4, var13, var17.field1582, (byte) -108, var11);
                }
                arg7.method293(var16, var39, arg0, arg1, false, var19, 768, 0, var18, 0, arg4, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IIIB)I")
    public int method17(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 78) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field7[arg1][arg0][arg2] & 0x8) == 0) {
            return arg1 <= 0 || (this.field7[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "c", descriptor = "(III)Z")
    public static final boolean method18(int arg0, int arg1, int arg2) {
        class63 var3 = class63.method555(arg0);
        if (arg1 != -41002) {
            field4 = !field4;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method550(-213, arg2);
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "([BIZIIIII[LUDXVXGJJ;I)V")
    public final void method19(byte[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class55[] arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg5 + var11 > 0 && arg5 + var11 < 103 && arg1 + var16 > 0 && arg1 + var16 < 103) {
                    arg8[arg4].field1480[arg5 + var11][arg1 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class53 var12 = new class53(arg0, -631);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg6 == var13 && var14 >= arg7 && var14 < arg7 + 8 && var15 >= arg3 && var15 < arg3 + 8) {
                        this.method10(arg1 + class39.method364(var14 & 0x7, arg9, false, var15 & 0x7), 0, 0, arg4, arg9, var12, 0, arg5 + class39.method363(var14 & 0x7, 242, arg9, var15 & 0x7));
                    } else {
                        this.method10(-1, 0, 0, 0, 0, var12, 0, -1);
                    }
                }
            }
        }
        if (arg2) {
            this.field22 = !this.field22;
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(ILUDXVXGJJ;IIIILMPMWDRAA;II)V")
    private final void method20(int arg0, class55 arg1, int arg2, int arg3, int arg4, int arg5, class32 arg6, int arg7, int arg8) {
        if (field16 && (this.field7[0][arg2][arg5] & 0x2) == 0) {
            if ((this.field7[arg3][arg2][arg5] & 0x10) != 0) {
                return;
            }
            if (this.method17(arg2, arg3, arg5, (byte) 78) != field6) {
                return;
            }
        }
        if (arg3 < field1) {
            field1 = arg3;
        }
        int var10 = this.field29[arg3][arg2][arg5];
        int var11 = this.field29[arg3][arg2 + 1][arg5];
        int var12 = this.field29[arg3][arg2 + 1][arg5 + 1];
        int var13 = this.field29[arg3][arg2][arg5 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class63 var15 = class63.method555(arg4);
        if (arg0 != 40895) {
            for (int var16 = 1; var16 > 0; var16++) {
            }
        }
        int var17 = (arg4 << 14) + (arg5 << 7) + arg2 + 1073741824;
        if (!var15.field1599) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg8 << 6) + arg7);
        if (arg7 == 22) {
            if (!field16 || var15.field1599 || var15.field1577) {
                class17 var19;
                if (var15.field1582 == -1 && var15.field1573 == null) {
                    var19 = var15.method556(22, arg8, var10, var11, var12, var13, -1);
                } else {
                    var19 = new class36(var13, arg4, var11, true, arg8, 22, var12, var15.field1582, (byte) -108, var10);
                }
                arg6.method290(var19, arg5, arg3, var17, var14, var18, 9, arg2);
                if (var15.field1559 && var15.field1599 && arg1 != null) {
                    arg1.method518(arg5, arg2, 989);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class17 var39;
            if (var15.field1582 == -1 && var15.field1573 == null) {
                var39 = var15.method556(10, arg8, var10, var11, var12, var13, -1);
            } else {
                var39 = new class36(var13, arg4, var11, true, arg8, 10, var12, var15.field1582, (byte) -108, var10);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg7 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg8 == 1 || arg8 == 3) {
                    var41 = var15.field1605;
                    var42 = var15.field1566;
                } else {
                    var41 = var15.field1566;
                    var42 = var15.field1605;
                }
                if (arg6.method294(arg5, var17, var41, var40, arg2, arg3, var18, var39, var42, var14, (byte) 4) && var15.field1595) {
                    class25 var43;
                    if (var39 instanceof class25) {
                        var43 = (class25) var39;
                    } else {
                        var43 = var15.method556(10, arg8, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field899 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field20[arg3][arg2 + var44][arg5 + var45]) {
                                    this.field20[arg3][arg2 + var44][arg5 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1559 && arg1 != null) {
                arg1.method517(arg5, var15.field1605, arg8, var15.field1566, var15.field1604, 8, arg2);
            }
        } else if (arg7 >= 12) {
            class17 var20;
            if (var15.field1582 == -1 && var15.field1573 == null) {
                var20 = var15.method556(arg7, arg8, var10, var11, var12, var13, -1);
            } else {
                var20 = new class36(var13, arg4, var11, true, arg8, arg7, var12, var15.field1582, (byte) -108, var10);
            }
            arg6.method294(arg5, var17, 1, 0, arg2, arg3, var18, var20, 1, var14, (byte) 4);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0) {
                this.field8[arg3][arg2][arg5] |= 0x924;
            }
            if (var15.field1559 && arg1 != null) {
                arg1.method517(arg5, var15.field1605, arg8, var15.field1566, var15.field1604, 8, arg2);
            }
        } else if (arg7 == 0) {
            class17 var21;
            if (var15.field1582 == -1 && var15.field1573 == null) {
                var21 = var15.method556(0, arg8, var10, var11, var12, var13, -1);
            } else {
                var21 = new class36(var13, arg4, var11, true, arg8, 0, var12, var15.field1582, (byte) -108, var10);
            }
            arg6.method292(0, arg3, arg5, null, var18, field17[arg8], arg2, 0, var14, var17, var21);
            if (arg8 == 0) {
                if (var15.field1595) {
                    this.field20[arg3][arg2][arg5] = 50;
                    this.field20[arg3][arg2][arg5 + 1] = 50;
                }
                if (var15.field1580) {
                    this.field8[arg3][arg2][arg5] |= 0x249;
                }
            } else if (arg8 == 1) {
                if (var15.field1595) {
                    this.field20[arg3][arg2][arg5 + 1] = 50;
                    this.field20[arg3][arg2 + 1][arg5 + 1] = 50;
                }
                if (var15.field1580) {
                    this.field8[arg3][arg2][arg5 + 1] |= 0x492;
                }
            } else if (arg8 == 2) {
                if (var15.field1595) {
                    this.field20[arg3][arg2 + 1][arg5] = 50;
                    this.field20[arg3][arg2 + 1][arg5 + 1] = 50;
                }
                if (var15.field1580) {
                    this.field8[arg3][arg2 + 1][arg5] |= 0x249;
                }
            } else if (arg8 == 3) {
                if (var15.field1595) {
                    this.field20[arg3][arg2][arg5] = 50;
                    this.field20[arg3][arg2 + 1][arg5] = 50;
                }
                if (var15.field1580) {
                    this.field8[arg3][arg2][arg5] |= 0x492;
                }
            }
            if (var15.field1559 && arg1 != null) {
                arg1.method516(var15.field1604, arg7, arg8, false, arg2, arg5);
            }
            if (var15.field1567 != 16) {
                arg6.method300(arg2, (byte) 8, var15.field1567, arg5, arg3);
            }
        } else if (arg7 == 1) {
            class17 var22;
            if (var15.field1582 == -1 && var15.field1573 == null) {
                var22 = var15.method556(1, arg8, var10, var11, var12, var13, -1);
            } else {
                var22 = new class36(var13, arg4, var11, true, arg8, 1, var12, var15.field1582, (byte) -108, var10);
            }
            arg6.method292(0, arg3, arg5, null, var18, field11[arg8], arg2, 0, var14, var17, var22);
            if (var15.field1595) {
                if (arg8 == 0) {
                    this.field20[arg3][arg2][arg5 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field20[arg3][arg2 + 1][arg5 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field20[arg3][arg2 + 1][arg5] = 50;
                } else if (arg8 == 3) {
                    this.field20[arg3][arg2][arg5] = 50;
                }
            }
            if (var15.field1559 && arg1 != null) {
                arg1.method516(var15.field1604, arg7, arg8, false, arg2, arg5);
            }
        } else if (arg7 == 2) {
            int var23 = arg8 + 1 & 0x3;
            class17 var24;
            class17 var25;
            if (var15.field1582 == -1 && var15.field1573 == null) {
                var24 = var15.method556(2, arg8 + 4, var10, var11, var12, var13, -1);
                var25 = var15.method556(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new class36(var13, arg4, var11, true, arg8 + 4, 2, var12, var15.field1582, (byte) -108, var10);
                var25 = new class36(var13, arg4, var11, true, var23, 2, var12, var15.field1582, (byte) -108, var10);
            }
            arg6.method292(0, arg3, arg5, var25, var18, field17[arg8], arg2, field17[var23], var14, var17, var24);
            if (var15.field1580) {
                if (arg8 == 0) {
                    this.field8[arg3][arg2][arg5] |= 0x249;
                    this.field8[arg3][arg2][arg5 + 1] |= 0x492;
                } else if (arg8 == 1) {
                    this.field8[arg3][arg2][arg5 + 1] |= 0x492;
                    this.field8[arg3][arg2 + 1][arg5] |= 0x249;
                } else if (arg8 == 2) {
                    this.field8[arg3][arg2 + 1][arg5] |= 0x249;
                    this.field8[arg3][arg2][arg5] |= 0x492;
                } else if (arg8 == 3) {
                    this.field8[arg3][arg2][arg5] |= 0x492;
                    this.field8[arg3][arg2][arg5] |= 0x249;
                }
            }
            if (var15.field1559 && arg1 != null) {
                arg1.method516(var15.field1604, arg7, arg8, false, arg2, arg5);
            }
            if (var15.field1567 != 16) {
                arg6.method300(arg2, (byte) 8, var15.field1567, arg5, arg3);
            }
        } else if (arg7 == 3) {
            class17 var26;
            if (var15.field1582 == -1 && var15.field1573 == null) {
                var26 = var15.method556(3, arg8, var10, var11, var12, var13, -1);
            } else {
                var26 = new class36(var13, arg4, var11, true, arg8, 3, var12, var15.field1582, (byte) -108, var10);
            }
            arg6.method292(0, arg3, arg5, null, var18, field11[arg8], arg2, 0, var14, var17, var26);
            if (var15.field1595) {
                if (arg8 == 0) {
                    this.field20[arg3][arg2][arg5 + 1] = 50;
                } else if (arg8 == 1) {
                    this.field20[arg3][arg2 + 1][arg5 + 1] = 50;
                } else if (arg8 == 2) {
                    this.field20[arg3][arg2 + 1][arg5] = 50;
                } else if (arg8 == 3) {
                    this.field20[arg3][arg2][arg5] = 50;
                }
            }
            if (var15.field1559 && arg1 != null) {
                arg1.method516(var15.field1604, arg7, arg8, false, arg2, arg5);
            }
        } else if (arg7 == 9) {
            class17 var27;
            if (var15.field1582 == -1 && var15.field1573 == null) {
                var27 = var15.method556(arg7, arg8, var10, var11, var12, var13, -1);
            } else {
                var27 = new class36(var13, arg4, var11, true, arg8, arg7, var12, var15.field1582, (byte) -108, var10);
            }
            arg6.method294(arg5, var17, 1, 0, arg2, arg3, var18, var27, 1, var14, (byte) 4);
            if (var15.field1559 && arg1 != null) {
                arg1.method517(arg5, var15.field1605, arg8, var15.field1566, var15.field1604, 8, arg2);
            }
        } else {
            if (var15.field1558) {
                if (arg8 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg8 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg8 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg7 == 4) {
                class17 var32;
                if (var15.field1582 == -1 && var15.field1573 == null) {
                    var32 = var15.method556(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new class36(var13, arg4, var11, true, 0, 4, var12, var15.field1582, (byte) -108, var10);
                }
                arg6.method293(var14, var32, arg2, arg3, false, var18, field17[arg8], 0, var17, 0, arg8 * 512, arg5);
            } else if (arg7 == 5) {
                int var33 = 16;
                int var34 = arg6.method310(arg3, arg2, arg5);
                if (var34 > 0) {
                    var33 = class63.method555(var34 >> 14 & 0x7FFF).field1567;
                }
                class17 var35;
                if (var15.field1582 == -1 && var15.field1573 == null) {
                    var35 = var15.method556(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class36(var13, arg4, var11, true, 0, 4, var12, var15.field1582, (byte) -108, var10);
                }
                arg6.method293(var14, var35, arg2, arg3, false, var18, field17[arg8], field5[arg8] * var33, var17, field15[arg8] * var33, arg8 * 512, arg5);
            } else if (arg7 == 6) {
                class17 var36;
                if (var15.field1582 == -1 && var15.field1573 == null) {
                    var36 = var15.method556(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class36(var13, arg4, var11, true, 0, 4, var12, var15.field1582, (byte) -108, var10);
                }
                arg6.method293(var14, var36, arg2, arg3, false, var18, 256, 0, var17, 0, arg8, arg5);
            } else if (arg7 == 7) {
                class17 var37;
                if (var15.field1582 == -1 && var15.field1573 == null) {
                    var37 = var15.method556(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class36(var13, arg4, var11, true, 0, 4, var12, var15.field1582, (byte) -108, var10);
                }
                arg6.method293(var14, var37, arg2, arg3, false, var18, 512, 0, var17, 0, arg8, arg5);
            } else if (arg7 == 8) {
                class17 var38;
                if (var15.field1582 == -1 && var15.field1573 == null) {
                    var38 = var15.method556(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new class36(var13, arg4, var11, true, 0, 4, var12, var15.field1582, (byte) -108, var10);
                }
                arg6.method293(var14, var38, arg2, arg3, false, var18, 768, 0, var17, 0, arg8, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(IILMPMWDRAA;[LUDXVXGJJ;I[B)V")
    public final void method21(int arg0, int arg1, class32 arg2, class55[] arg3, int arg4, byte[] arg5) {
        class53 var7 = new class53(arg5, -631);
        int var8 = -1;
        int var9 = 12 / arg1;
        while (true) {
            int var10 = var7.method482();
            if (var10 == 0) {
                return;
            }
            var8 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var7.method482();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var7.method468();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg0 + var14;
                int var20 = arg4 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field7[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class55 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg3[var21];
                    }
                    this.method20(40895, var22, var19, var15, var8, var20, arg2, var17, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!AGPNOIRK", name = "e", descriptor = "(II)I")
    private static final int method22(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!AGPNOIRK", name = "a", descriptor = "(I[LUDXVXGJJ;I[BIII)V")
    public final void method23(int arg0, class55[] arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg0 + var13 > 0 && arg0 + var13 < 103 && arg6 + var14 > 0 && arg6 + var14 < 103) {
                        arg1[var8].field1480[arg0 + var13][arg6 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class53 var9 = new class53(arg3, -631);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method10(arg6 + var12, arg4, 0, var10, 0, var9, arg2, arg0 + var11);
                }
            }
        }
        if (arg5 == 9) {
            ;
        }
    }
}
