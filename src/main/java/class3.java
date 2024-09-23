import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AIYLKTEB")
public class class3 {

    @OriginalMember(owner = "AIYLKTEB", name = "m", descriptor = "I")
    private int field26 = 5;

    @OriginalMember(owner = "AIYLKTEB", name = "u", descriptor = "B")
    private byte field34 = -78;

    @OriginalMember(owner = "AIYLKTEB", name = "x", descriptor = "Z")
    private boolean field37 = false;

    @OriginalMember(owner = "AIYLKTEB", name = "E", descriptor = "I")
    private int field44 = 2;

    @OriginalMember(owner = "AIYLKTEB", name = "F", descriptor = "I")
    private int field45 = -13196;

    @OriginalMember(owner = "AIYLKTEB", name = "A", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "AIYLKTEB", name = "B", descriptor = "I")
    private int field41;

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "[[[I")
    private int[][][] field14;

    @OriginalMember(owner = "AIYLKTEB", name = "o", descriptor = "[[[B")
    private byte[][][] field28;

    @OriginalMember(owner = "AIYLKTEB", name = "D", descriptor = "[[[B")
    private byte[][][] field43;

    @OriginalMember(owner = "AIYLKTEB", name = "q", descriptor = "[[[B")
    private byte[][][] field30;

    @OriginalMember(owner = "AIYLKTEB", name = "b", descriptor = "[[[B")
    private byte[][][] field15;

    @OriginalMember(owner = "AIYLKTEB", name = "t", descriptor = "[[[B")
    private byte[][][] field33;

    @OriginalMember(owner = "AIYLKTEB", name = "p", descriptor = "[[[I")
    private int[][][] field29;

    @OriginalMember(owner = "AIYLKTEB", name = "l", descriptor = "[[[B")
    private byte[][][] field25;

    @OriginalMember(owner = "AIYLKTEB", name = "h", descriptor = "[[I")
    private int[][] field21;

    @OriginalMember(owner = "AIYLKTEB", name = "c", descriptor = "[I")
    private int[] field16;

    @OriginalMember(owner = "AIYLKTEB", name = "d", descriptor = "[I")
    private int[] field17;

    @OriginalMember(owner = "AIYLKTEB", name = "e", descriptor = "[I")
    private int[] field18;

    @OriginalMember(owner = "AIYLKTEB", name = "f", descriptor = "[I")
    private int[] field19;

    @OriginalMember(owner = "AIYLKTEB", name = "g", descriptor = "[I")
    private int[] field20;

    @OriginalMember(owner = "AIYLKTEB", name = "i", descriptor = "I")
    private static int field22 = -304;

    @OriginalMember(owner = "AIYLKTEB", name = "j", descriptor = "[I")
    private static final int[] field23 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "AIYLKTEB", name = "k", descriptor = "[I")
    private static final int[] field24 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "AIYLKTEB", name = "n", descriptor = "[I")
    private static final int[] field27 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "AIYLKTEB", name = "r", descriptor = "I")
    private static int field31 = 43310;

    @OriginalMember(owner = "AIYLKTEB", name = "s", descriptor = "I")
    private static int field32 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "AIYLKTEB", name = "v", descriptor = "I")
    private static int field35 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "AIYLKTEB", name = "w", descriptor = "[I")
    private static final int[] field36 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "AIYLKTEB", name = "z", descriptor = "I")
    public static int field39 = 99;

    @OriginalMember(owner = "AIYLKTEB", name = "C", descriptor = "Z")
    public static boolean field42 = true;

    @OriginalMember(owner = "AIYLKTEB", name = "y", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "AIYLKTEB", name = "G", descriptor = "I")
    private int field46;

    @OriginalMember(owner = "AIYLKTEB", name = "H", descriptor = "I")
    private static int field47;

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(III)I")
    private static final int method4(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method20(var3, var5);
        int var8 = method20(var3 + 1, var5);
        int var9 = method20(var3, var5 + 1);
        int var10 = method20(var3 + 1, var5 + 1);
        int var11 = method10(var7, var8, var4, arg2);
        int var12 = method10(var9, var10, var4, arg2);
        return method10(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(II)I")
    private static final int method5(int arg0, int arg1) {
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

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(IIIBI)V")
    public final void method6(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 7) {
            return;
        }
        for (int var6 = arg0; var6 <= arg0 + arg4; var6++) {
            for (int var7 = arg1; var7 <= arg1 + arg2; var7++) {
                if (var7 >= 0 && var7 < this.field40 && var6 >= 0 && var6 < this.field41) {
                    this.field25[0][var7][var6] = 127;
                    if (arg1 == var7 && var7 > 0) {
                        this.field14[0][var7][var6] = this.field14[0][var7 - 1][var6];
                    }
                    if (arg1 + arg2 == var7 && var7 < this.field40 - 1) {
                        this.field14[0][var7][var6] = this.field14[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.field14[0][var7][var6] = this.field14[0][var7][var6 - 1];
                    }
                    if (arg0 + arg4 == var6 && var6 < this.field41 - 1) {
                        this.field14[0][var7][var6] = this.field14[0][var7][var6 + 1];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(Z[BII[LKFLNJHKB;II)V")
    public final void method7(boolean arg0, byte[] arg1, int arg2, int arg3, class33[] arg4, int arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg2 + var13 > 0 && arg2 + var13 < 103 && arg3 + var14 > 0 && arg3 + var14 < 103) {
                        arg4[var8].field942[arg2 + var13][arg3 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        if (!arg0) {
            return;
        }
        class31 var9 = new class31(arg1, 8);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method17(var9, arg2 + var11, arg3 + var12, 0, arg5, var10, arg6, 7);
                }
            }
        }
    }

    @OriginalMember(owner = "AIYLKTEB", name = "b", descriptor = "(III)Z")
    public static final boolean method8(int arg0, int arg1, int arg2) {
        class61 var3 = class61.method491(arg2);
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method485(field22, arg1);
    }

    @OriginalMember(owner = "AIYLKTEB", name = "b", descriptor = "(II)I")
    private final int method9(int arg0, int arg1) {
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

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(IIII)I")
    private static final int method10(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class5.field64[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(LJHKSAGUC;LVCPXACGS;B)V")
    public static final void method11(class31 arg0, class67 arg1, byte arg2) {
        int var3 = -1;
        if (arg2 != 36) {
            return;
        }
        while (true) {
            int var4 = arg0.method320();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class61 var5 = class61.method491(var3);
            var5.method492(arg1, (byte) 6);
            while (true) {
                int var6 = arg0.method320();
                if (var6 == 0) {
                    break;
                }
                arg0.method306();
            }
        }
    }

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(ILUMYAUCNU;[LKFLNJHKB;)V")
    public final void method12(int arg0, class65 arg1, class33[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field28[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field28[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method347(0, var110, var111);
                        }
                    }
                }
            }
        }
        field35 += (int) (Math.random() * 5.0D) - 2;
        if (field35 < -8) {
            field35 = -8;
        }
        if (field35 > 8) {
            field35 = 8;
        }
        field32 += (int) (Math.random() * 5.0D) - 2;
        if (arg0 != 27029) {
            return;
        }
        if (field32 < -16) {
            field32 = -16;
        }
        if (field32 > 16) {
            field32 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field25[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field41 - 1; var56++) {
                for (int var101 = 1; var101 < this.field40 - 1; var101++) {
                    int var102 = this.field14[var5][var101 + 1][var56] - this.field14[var5][var101 - 1][var56];
                    int var103 = this.field14[var5][var101][var56 + 1] - this.field14[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field21[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field41; var57++) {
                this.field16[var57] = 0;
                this.field17[var57] = 0;
                this.field18[var57] = 0;
                this.field19[var57] = 0;
                this.field20[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field40 + 5; var58++) {
                for (int var61 = 0; var61 < this.field41; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field40) {
                        int var96 = this.field43[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class43 var97 = class43.field1064[var96 - 1];
                            this.field16[var61] += var97.field1073;
                            this.field17[var61] += var97.field1071;
                            this.field18[var61] += var97.field1072;
                            this.field19[var61] += var97.field1074;
                            var10002 = this.field20[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field40) {
                        int var99 = this.field43[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class43 var100 = class43.field1064[var99 - 1];
                            this.field16[var61] -= var100.field1073;
                            this.field17[var61] -= var100.field1071;
                            this.field18[var61] -= var100.field1072;
                            this.field19[var61] -= var100.field1074;
                            var10002 = this.field20[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field40 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field41 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field41) {
                            var62 += this.field16[var68];
                            var63 += this.field17[var68];
                            var64 += this.field18[var68];
                            var65 += this.field19[var68];
                            var66 += this.field20[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field41) {
                            var62 -= this.field16[var69];
                            var63 -= this.field17[var69];
                            var64 -= this.field18[var69];
                            var65 -= this.field19[var69];
                            var66 -= this.field20[var69];
                        }
                        if (var67 >= 1 && var67 < this.field41 - 1 && (!field42 || (this.field28[0][var58][var67] & 0x2) != 0 || (this.field28[var5][var58][var67] & 0x10) == 0 && this.method22(false, var5, var58, var67) == field38)) {
                            if (var5 < field39) {
                                field39 = var5;
                            }
                            int var70 = this.field43[var5][var58][var67] & 0xFF;
                            int var71 = this.field30[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field14[var5][var58][var67];
                                int var73 = this.field14[var5][var58 + 1][var67];
                                int var74 = this.field14[var5][var58 + 1][var67 + 1];
                                int var75 = this.field14[var5][var58][var67 + 1];
                                int var76 = this.field21[var58][var67];
                                int var77 = this.field21[var58 + 1][var67];
                                int var78 = this.field21[var58 + 1][var67 + 1];
                                int var79 = this.field21[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method18(var82, var83, var84);
                                    int var85 = field35 + var82 & 0xFF;
                                    int var86 = field32 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method18(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field15[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class43.field1064[var71 - 1].field1069) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field29[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class5.field75[method5(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method509(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method5(var80, var76), method5(var80, var77), method5(var80, var78), method5(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field15[var5][var58][var67] + 1;
                                    byte var90 = this.field33[var5][var58][var67];
                                    class43 var91 = class43.field1064[var71 - 1];
                                    int var92 = var91.field1067;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class5.method31(false, var92);
                                        var94 = -1;
                                    } else if (var91.field1066 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method18(var91.field1070, var91.field1071, var91.field1072);
                                        var93 = class5.field75[this.method9(var91.field1075, 96)];
                                    }
                                    arg1.method509(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method5(var80, var76), method5(var80, var77), method5(var80, var78), method5(var80, var79), this.method9(var94, var76), this.method9(var94, var77), this.method9(var94, var78), this.method9(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field41 - 1; var59++) {
                for (int var60 = 1; var60 < this.field40 - 1; var60++) {
                    arg1.method508(var5, var60, var59, this.method22(false, var5, var60, var59));
                }
            }
        }
        arg1.method535(768, (byte) 46, -10, -50, -50, 64);
        for (int var6 = 0; var6 < this.field40; var6++) {
            for (int var47 = 0; var47 < this.field41; var47++) {
                if ((this.field28[1][var6][var47] & 0x2) == 2) {
                    arg1.method506(var47, var6, false);
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
                for (int var12 = 0; var12 <= this.field41; var12++) {
                    for (int var13 = 0; var13 <= this.field40; var13++) {
                        if ((this.field29[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field29[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field41 && (this.field29[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field29[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field29[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field14[var17][var13][var14] - var21;
                                int var23 = this.field14[var16][var13][var14];
                                class65.method507(var23, var13 * 128, var15 * 128 + 128, var22, 1, var10, (byte) -17, var13 * 128, var14 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field29[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field29[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field29[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field40 && (this.field29[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field29[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field29[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field14[var29][var26][var12] - var33;
                                int var35 = this.field14[var28][var26][var12];
                                class65.method507(var35, var26 * 128, var12 * 128, var34, 2, var10, (byte) -17, var27 * 128 + 128, var12 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field29[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field29[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field29[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field41 && (this.field29[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field29[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field40) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field29[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field14[var11][var38][var40];
                                class65.method507(var44, var38 * 128, var41 * 128 + 128, var44, 4, var10, (byte) -17, var39 * 128 + 128, var40 * 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field29[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(ZI[LKFLNJHKB;III[BIII)V")
    public final void method13(boolean arg0, int arg1, class33[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg8 + var11 > 0 && arg8 + var11 < 103 && arg3 + var16 > 0 && arg3 + var16 < 103) {
                    arg2[arg7].field942[arg8 + var11][arg3 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class31 var12 = new class31(arg6, 8);
        if (!arg0) {
            return;
        }
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg1 == var13 && var14 >= arg4 && var14 < arg4 + 8 && var15 >= arg9 && var15 < arg9 + 8) {
                        this.method17(var12, arg8 + class16.method219(var14 & 0x7, (byte) 6, arg5, var15 & 0x7), arg3 + class16.method220(var14 & 0x7, 0, var15 & 0x7, arg5), arg5, 0, arg7, 0, 7);
                    } else {
                        this.method17(var12, -1, -1, 0, 0, 0, 0, 7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "AIYLKTEB", name = "<init>", descriptor = "(I[[[IZ[[[BI)V")
    public class3(int arg0, int[][][] arg1, boolean arg2, byte[][][] arg3, int arg4) {
        if (arg2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        field39 = 99;
        this.field40 = arg0;
        this.field41 = arg4;
        this.field14 = arg1;
        this.field28 = arg3;
        this.field43 = new byte[4][this.field40][this.field41];
        this.field30 = new byte[4][this.field40][this.field41];
        this.field15 = new byte[4][this.field40][this.field41];
        this.field33 = new byte[4][this.field40][this.field41];
        this.field29 = new int[4][this.field40 + 1][this.field41 + 1];
        this.field25 = new byte[4][this.field40 + 1][this.field41 + 1];
        this.field21 = new int[this.field40 + 1][this.field41 + 1];
        this.field16 = new int[this.field41];
        this.field17 = new int[this.field41];
        this.field18 = new int[this.field41];
        this.field19 = new int[this.field41];
        this.field20 = new int[this.field41];
    }

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(LKFLNJHKB;ILUMYAUCNU;IIIIBI)V")
    private final void method14(class33 arg0, int arg1, class65 arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (field42 && (this.field28[0][arg8][arg5] & 0x2) == 0) {
            if ((this.field28[arg4][arg8][arg5] & 0x10) != 0) {
                return;
            }
            if (this.method22(false, arg4, arg8, arg5) != field38) {
                return;
            }
        }
        if (arg4 < field39) {
            field39 = arg4;
        }
        int var10 = this.field14[arg4][arg8][arg5];
        int var11 = this.field14[arg4][arg8 + 1][arg5];
        int var12 = this.field14[arg4][arg8 + 1][arg5 + 1];
        int var13 = this.field14[arg4][arg8][arg5 + 1];
        if (this.field34 != arg7) {
            for (int var14 = 1; var14 > 0; var14++) {
            }
        }
        int var15 = var10 + var11 + var12 + var13 >> 2;
        class61 var16 = class61.method491(arg6);
        int var17 = (arg6 << 14) + (arg5 << 7) + arg8 + 1073741824;
        if (!var16.field1412) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg1 << 6) + arg3);
        if (arg3 == 22) {
            if (!field42 || var16.field1412 || var16.field1391) {
                class20 var19;
                if (var16.field1422 == -1 && var16.field1395 == null) {
                    var19 = var16.method486(22, arg1, var10, var11, var12, var13, -1);
                } else {
                    var19 = new class23(22, arg1, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
                }
                arg2.method510(var18, var19, arg8, var17, var15, 6, arg5, arg4);
                if (var16.field1434 && var16.field1412 && arg0 != null) {
                    arg0.method347(0, arg8, arg5);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class20 var39;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var39 = var16.method486(10, arg1, var10, var11, var12, var13, -1);
            } else {
                var39 = new class23(10, arg1, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg3 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg1 == 1 || arg1 == 3) {
                    var41 = var16.field1394;
                    var42 = var16.field1418;
                } else {
                    var41 = var16.field1418;
                    var42 = var16.field1394;
                }
                if (arg2.method514(arg8, var42, var40, var15, var39, var41, arg5, var18, var17, arg4, true) && var16.field1389) {
                    class59 var43;
                    if (var39 instanceof class59) {
                        var43 = (class59) var39;
                    } else {
                        var43 = var16.method486(10, arg1, var10, var11, var12, var13, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field1328 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field25[arg4][arg8 + var44][arg5 + var45]) {
                                    this.field25[arg4][arg8 + var44][arg5 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var16.field1434 && arg0 != null) {
                arg0.method346(var16.field1386, arg5, var16.field1394, var16.field1418, arg1, arg8, (byte) 7);
            }
        } else if (arg3 >= 12) {
            class20 var20;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var20 = var16.method486(arg3, arg1, var10, var11, var12, var13, -1);
            } else {
                var20 = new class23(arg3, arg1, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
            }
            arg2.method514(arg8, 1, 0, var15, var20, 1, arg5, var18, var17, arg4, true);
            if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg4 > 0) {
                this.field29[arg4][arg8][arg5] |= 0x924;
            }
            if (var16.field1434 && arg0 != null) {
                arg0.method346(var16.field1386, arg5, var16.field1394, var16.field1418, arg1, arg8, (byte) 7);
            }
        } else if (arg3 == 0) {
            class20 var21;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var21 = var16.method486(0, arg1, var10, var11, var12, var13, -1);
            } else {
                var21 = new class23(0, arg1, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
            }
            arg2.method512(var21, arg4, var18, var17, arg5, 0, var15, arg8, null, true, field27[arg1]);
            if (arg1 == 0) {
                if (var16.field1389) {
                    this.field25[arg4][arg8][arg5] = 50;
                    this.field25[arg4][arg8][arg5 + 1] = 50;
                }
                if (var16.field1393) {
                    this.field29[arg4][arg8][arg5] |= 0x249;
                }
            } else if (arg1 == 1) {
                if (var16.field1389) {
                    this.field25[arg4][arg8][arg5 + 1] = 50;
                    this.field25[arg4][arg8 + 1][arg5 + 1] = 50;
                }
                if (var16.field1393) {
                    this.field29[arg4][arg8][arg5 + 1] |= 0x492;
                }
            } else if (arg1 == 2) {
                if (var16.field1389) {
                    this.field25[arg4][arg8 + 1][arg5] = 50;
                    this.field25[arg4][arg8 + 1][arg5 + 1] = 50;
                }
                if (var16.field1393) {
                    this.field29[arg4][arg8 + 1][arg5] |= 0x249;
                }
            } else if (arg1 == 3) {
                if (var16.field1389) {
                    this.field25[arg4][arg8][arg5] = 50;
                    this.field25[arg4][arg8 + 1][arg5] = 50;
                }
                if (var16.field1393) {
                    this.field29[arg4][arg8][arg5] |= 0x492;
                }
            }
            if (var16.field1434 && arg0 != null) {
                arg0.method345(arg3, arg1, var16.field1386, arg5, arg8, 861);
            }
            if (var16.field1415 != 16) {
                arg2.method520(var16.field1415, arg8, arg4, arg5, (byte) -74);
            }
        } else if (arg3 == 1) {
            class20 var22;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var22 = var16.method486(1, arg1, var10, var11, var12, var13, -1);
            } else {
                var22 = new class23(1, arg1, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
            }
            arg2.method512(var22, arg4, var18, var17, arg5, 0, var15, arg8, null, true, field24[arg1]);
            if (var16.field1389) {
                if (arg1 == 0) {
                    this.field25[arg4][arg8][arg5 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field25[arg4][arg8 + 1][arg5 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field25[arg4][arg8 + 1][arg5] = 50;
                } else if (arg1 == 3) {
                    this.field25[arg4][arg8][arg5] = 50;
                }
            }
            if (var16.field1434 && arg0 != null) {
                arg0.method345(arg3, arg1, var16.field1386, arg5, arg8, 861);
            }
        } else if (arg3 == 2) {
            int var23 = arg1 + 1 & 0x3;
            class20 var24;
            class20 var25;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var24 = var16.method486(2, arg1 + 4, var10, var11, var12, var13, -1);
                var25 = var16.method486(2, var23, var10, var11, var12, var13, -1);
            } else {
                var24 = new class23(2, arg1 + 4, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
                var25 = new class23(2, var23, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
            }
            arg2.method512(var24, arg4, var18, var17, arg5, field27[var23], var15, arg8, var25, true, field27[arg1]);
            if (var16.field1393) {
                if (arg1 == 0) {
                    this.field29[arg4][arg8][arg5] |= 0x249;
                    this.field29[arg4][arg8][arg5 + 1] |= 0x492;
                } else if (arg1 == 1) {
                    this.field29[arg4][arg8][arg5 + 1] |= 0x492;
                    this.field29[arg4][arg8 + 1][arg5] |= 0x249;
                } else if (arg1 == 2) {
                    this.field29[arg4][arg8 + 1][arg5] |= 0x249;
                    this.field29[arg4][arg8][arg5] |= 0x492;
                } else if (arg1 == 3) {
                    this.field29[arg4][arg8][arg5] |= 0x492;
                    this.field29[arg4][arg8][arg5] |= 0x249;
                }
            }
            if (var16.field1434 && arg0 != null) {
                arg0.method345(arg3, arg1, var16.field1386, arg5, arg8, 861);
            }
            if (var16.field1415 != 16) {
                arg2.method520(var16.field1415, arg8, arg4, arg5, (byte) -74);
            }
        } else if (arg3 == 3) {
            class20 var26;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var26 = var16.method486(3, arg1, var10, var11, var12, var13, -1);
            } else {
                var26 = new class23(3, arg1, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
            }
            arg2.method512(var26, arg4, var18, var17, arg5, 0, var15, arg8, null, true, field24[arg1]);
            if (var16.field1389) {
                if (arg1 == 0) {
                    this.field25[arg4][arg8][arg5 + 1] = 50;
                } else if (arg1 == 1) {
                    this.field25[arg4][arg8 + 1][arg5 + 1] = 50;
                } else if (arg1 == 2) {
                    this.field25[arg4][arg8 + 1][arg5] = 50;
                } else if (arg1 == 3) {
                    this.field25[arg4][arg8][arg5] = 50;
                }
            }
            if (var16.field1434 && arg0 != null) {
                arg0.method345(arg3, arg1, var16.field1386, arg5, arg8, 861);
            }
        } else if (arg3 == 9) {
            class20 var27;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var27 = var16.method486(arg3, arg1, var10, var11, var12, var13, -1);
            } else {
                var27 = new class23(arg3, arg1, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
            }
            arg2.method514(arg8, 1, 0, var15, var27, 1, arg5, var18, var17, arg4, true);
            if (var16.field1434 && arg0 != null) {
                arg0.method346(var16.field1386, arg5, var16.field1394, var16.field1418, arg1, arg8, (byte) 7);
            }
        } else {
            if (var16.field1401) {
                if (arg1 == 1) {
                    int var28 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg1 == 2) {
                    int var29 = var13;
                    var13 = var11;
                    var11 = var29;
                    int var30 = var12;
                    var12 = var10;
                    var10 = var30;
                } else if (arg1 == 3) {
                    int var31 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var31;
                }
            }
            if (arg3 == 4) {
                class20 var32;
                if (var16.field1422 == -1 && var16.field1395 == null) {
                    var32 = var16.method486(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var32 = new class23(4, 0, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
                }
                arg2.method513(arg5, arg1 * 512, var17, var32, 0, field27[arg1], arg4, var15, 0, var18, false, arg8);
            } else if (arg3 == 5) {
                int var33 = 16;
                int var34 = arg2.method530(arg4, arg8, arg5);
                if (var34 > 0) {
                    var33 = class61.method491(var34 >> 14 & 0x7FFF).field1415;
                }
                class20 var35;
                if (var16.field1422 == -1 && var16.field1395 == null) {
                    var35 = var16.method486(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class23(4, 0, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
                }
                arg2.method513(arg5, arg1 * 512, var17, var35, field36[arg1] * var33, field27[arg1], arg4, var15, field23[arg1] * var33, var18, false, arg8);
            } else if (arg3 == 6) {
                class20 var36;
                if (var16.field1422 == -1 && var16.field1395 == null) {
                    var36 = var16.method486(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class23(4, 0, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
                }
                arg2.method513(arg5, arg1, var17, var36, 0, 256, arg4, var15, 0, var18, false, arg8);
            } else if (arg3 == 7) {
                class20 var37;
                if (var16.field1422 == -1 && var16.field1395 == null) {
                    var37 = var16.method486(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class23(4, 0, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
                }
                arg2.method513(arg5, arg1, var17, var37, 0, 512, arg4, var15, 0, var18, false, arg8);
            } else if (arg3 == 8) {
                class20 var38;
                if (var16.field1422 == -1 && var16.field1395 == null) {
                    var38 = var16.method486(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var38 = new class23(4, 0, var11, arg6, -611, var16.field1422, var13, var12, true, var10);
                }
                arg2.method513(arg5, arg1, var17, var38, 0, 768, arg4, var15, 0, var18, false, arg8);
            }
        }
    }

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(II[B[LKFLNJHKB;IIIIILUMYAUCNU;I)V")
    public final void method15(int arg0, int arg1, byte[] arg2, class33[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9, int arg10) {
        class31 var12 = new class31(arg2, 8);
        int var13 = -1;
        if (arg1 != 0) {
            field47 = -219;
        }
        while (true) {
            int var14 = var12.method320();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method320();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method306();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg4 == var19 && var18 >= arg6 && var18 < arg6 + 8 && var17 >= arg10 && var17 < arg10 + 8) {
                    class61 var23 = class61.method491(var13);
                    int var24 = arg5 + class16.method221(arg8, var23.field1418, this.field26, var18 & 0x7, var23.field1394, var17 & 0x7);
                    int var25 = arg0 + class16.method222(var23.field1394, var18 & 0x7, true, arg8, var23.field1418, var17 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = var19;
                        if ((this.field28[1][var24][var25] & 0x2) == 2) {
                            var26 = var19 - 1;
                        }
                        class33 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg3[var26];
                        }
                        this.method14(var27, arg8 + var22 & 0x3, arg9, var21, arg7, var25, var13, (byte) -78, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(ILUMYAUCNU;II[LKFLNJHKB;[B)V")
    public final void method16(int arg0, class65 arg1, int arg2, int arg3, class33[] arg4, byte[] arg5) {
        class31 var7 = new class31(arg5, 8);
        if (this.field44 != arg3) {
            this.field45 = -40;
        }
        int var8 = -1;
        while (true) {
            int var9 = var7.method320();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method320();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method306();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg2 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field28[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class33 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg4[var20];
                    }
                    this.method14(var21, var17, arg1, var16, var14, var19, var8, (byte) -78, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(LJHKSAGUC;IIIIIII)V")
    private final void method17(class31 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 7) {
            this.field37 = !this.field37;
        }
        if (arg1 < 0 || arg1 >= 104 || arg2 < 0 || arg2 >= 104) {
            while (true) {
                int var11 = arg0.method306();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg0.method306();
                    return;
                }
                if (var11 <= 49) {
                    arg0.method306();
                }
            }
        }
        this.field28[arg5][arg1][arg2] = 0;
        while (true) {
            int var9 = arg0.method306();
            if (var9 == 0) {
                if (arg5 == 0) {
                    this.field14[0][arg1][arg2] = -method21(arg1 + arg6 + 932731, arg2 + 556238 + arg4) * 8;
                    return;
                } else {
                    this.field14[arg5][arg1][arg2] = this.field14[arg5 - 1][arg1][arg2] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg0.method306();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg5 == 0) {
                    this.field14[0][arg1][arg2] = -var10 * 8;
                    return;
                }
                this.field14[arg5][arg1][arg2] = this.field14[arg5 - 1][arg1][arg2] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field30[arg5][arg1][arg2] = arg0.method307();
                this.field15[arg5][arg1][arg2] = (byte) ((var9 - 2) / 4);
                this.field33[arg5][arg1][arg2] = (byte) (var9 + arg3 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field28[arg5][arg1][arg2] = (byte) (var9 - 49);
            } else {
                this.field43[arg5][arg1][arg2] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "AIYLKTEB", name = "c", descriptor = "(III)I")
    private final int method18(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(III[[[ILKFLNJHKB;IIIILUMYAUCNU;I)V")
    public static final void method19(int arg0, int arg1, int arg2, int[][][] arg3, class33 arg4, int arg5, int arg6, int arg7, int arg8, class65 arg9, int arg10) {
        int var11 = arg3[arg10][arg0][arg8];
        int var12 = arg3[arg10][arg0 + 1][arg8];
        int var13 = arg3[arg10][arg0 + 1][arg8 + 1];
        int var14 = arg3[arg10][arg0][arg8 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class61 var16 = class61.method491(arg5);
        if (field31 != arg1) {
            field47 = -396;
        }
        int var17 = (arg5 << 14) + (arg8 << 7) + arg0 + 1073741824;
        if (!var16.field1412) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg6 << 6) + arg7);
        if (arg7 == 22) {
            class20 var19;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var19 = var16.method486(22, arg6, var11, var12, var13, var14, -1);
            } else {
                var19 = new class23(22, arg6, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
            }
            arg9.method510(var18, var19, arg0, var17, var15, 6, arg8, arg2);
            if (var16.field1434 && var16.field1412) {
                arg4.method347(0, arg0, arg8);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class20 var39;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var39 = var16.method486(10, arg6, var11, var12, var13, var14, -1);
            } else {
                var39 = new class23(10, arg6, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg7 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg6 == 1 || arg6 == 3) {
                    var41 = var16.field1394;
                    var42 = var16.field1418;
                } else {
                    var41 = var16.field1418;
                    var42 = var16.field1394;
                }
                arg9.method514(arg0, var42, var40, var15, var39, var41, arg8, var18, var17, arg2, true);
            }
            if (var16.field1434) {
                arg4.method346(var16.field1386, arg8, var16.field1394, var16.field1418, arg6, arg0, (byte) 7);
            }
        } else if (arg7 >= 12) {
            class20 var20;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var20 = var16.method486(arg7, arg6, var11, var12, var13, var14, -1);
            } else {
                var20 = new class23(arg7, arg6, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
            }
            arg9.method514(arg0, 1, 0, var15, var20, 1, arg8, var18, var17, arg2, true);
            if (var16.field1434) {
                arg4.method346(var16.field1386, arg8, var16.field1394, var16.field1418, arg6, arg0, (byte) 7);
            }
        } else if (arg7 == 0) {
            class20 var21;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var21 = var16.method486(0, arg6, var11, var12, var13, var14, -1);
            } else {
                var21 = new class23(0, arg6, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
            }
            arg9.method512(var21, arg2, var18, var17, arg8, 0, var15, arg0, null, true, field27[arg6]);
            if (var16.field1434) {
                arg4.method345(arg7, arg6, var16.field1386, arg8, arg0, 861);
            }
        } else if (arg7 == 1) {
            class20 var22;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var22 = var16.method486(1, arg6, var11, var12, var13, var14, -1);
            } else {
                var22 = new class23(1, arg6, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
            }
            arg9.method512(var22, arg2, var18, var17, arg8, 0, var15, arg0, null, true, field24[arg6]);
            if (var16.field1434) {
                arg4.method345(arg7, arg6, var16.field1386, arg8, arg0, 861);
            }
        } else if (arg7 == 2) {
            int var23 = arg6 + 1 & 0x3;
            class20 var24;
            class20 var25;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var24 = var16.method486(2, arg6 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method486(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class23(2, arg6 + 4, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
                var25 = new class23(2, var23, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
            }
            arg9.method512(var24, arg2, var18, var17, arg8, field27[var23], var15, arg0, var25, true, field27[arg6]);
            if (var16.field1434) {
                arg4.method345(arg7, arg6, var16.field1386, arg8, arg0, 861);
            }
        } else if (arg7 == 3) {
            class20 var26;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var26 = var16.method486(3, arg6, var11, var12, var13, var14, -1);
            } else {
                var26 = new class23(3, arg6, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
            }
            arg9.method512(var26, arg2, var18, var17, arg8, 0, var15, arg0, null, true, field24[arg6]);
            if (var16.field1434) {
                arg4.method345(arg7, arg6, var16.field1386, arg8, arg0, 861);
            }
        } else if (arg7 == 9) {
            class20 var27;
            if (var16.field1422 == -1 && var16.field1395 == null) {
                var27 = var16.method486(arg7, arg6, var11, var12, var13, var14, -1);
            } else {
                var27 = new class23(arg7, arg6, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
            }
            arg9.method514(arg0, 1, 0, var15, var27, 1, arg8, var18, var17, arg2, true);
            if (var16.field1434) {
                arg4.method346(var16.field1386, arg8, var16.field1394, var16.field1418, arg6, arg0, (byte) 7);
            }
        } else {
            if (var16.field1401) {
                if (arg6 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var28;
                } else if (arg6 == 2) {
                    int var29 = var14;
                    var14 = var12;
                    var12 = var29;
                    int var30 = var13;
                    var13 = var11;
                    var11 = var30;
                } else if (arg6 == 3) {
                    int var31 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var31;
                }
            }
            if (arg7 == 4) {
                class20 var32;
                if (var16.field1422 == -1 && var16.field1395 == null) {
                    var32 = var16.method486(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class23(4, 0, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
                }
                arg9.method513(arg8, arg6 * 512, var17, var32, 0, field27[arg6], arg2, var15, 0, var18, false, arg0);
            } else if (arg7 == 5) {
                int var33 = 16;
                int var34 = arg9.method530(arg2, arg0, arg8);
                if (var34 > 0) {
                    var33 = class61.method491(var34 >> 14 & 0x7FFF).field1415;
                }
                class20 var35;
                if (var16.field1422 == -1 && var16.field1395 == null) {
                    var35 = var16.method486(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class23(4, 0, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
                }
                arg9.method513(arg8, arg6 * 512, var17, var35, field36[arg6] * var33, field27[arg6], arg2, var15, field23[arg6] * var33, var18, false, arg0);
            } else if (arg7 == 6) {
                class20 var36;
                if (var16.field1422 == -1 && var16.field1395 == null) {
                    var36 = var16.method486(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class23(4, 0, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
                }
                arg9.method513(arg8, arg6, var17, var36, 0, 256, arg2, var15, 0, var18, false, arg0);
            } else if (arg7 == 7) {
                class20 var37;
                if (var16.field1422 == -1 && var16.field1395 == null) {
                    var37 = var16.method486(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class23(4, 0, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
                }
                arg9.method513(arg8, arg6, var17, var37, 0, 512, arg2, var15, 0, var18, false, arg0);
            } else if (arg7 == 8) {
                class20 var38;
                if (var16.field1422 == -1 && var16.field1395 == null) {
                    var38 = var16.method486(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class23(4, 0, var12, arg5, -611, var16.field1422, var14, var13, true, var11);
                }
                arg9.method513(arg8, arg6, var17, var38, 0, 768, arg2, var15, 0, var18, false, arg0);
            }
        }
    }

    @OriginalMember(owner = "AIYLKTEB", name = "c", descriptor = "(II)I")
    private static final int method20(int arg0, int arg1) {
        int var2 = method23(arg0 - 1, arg1 - 1) + method23(arg0 + 1, arg1 - 1) + method23(arg0 - 1, arg1 + 1) + method23(arg0 + 1, arg1 + 1);
        int var3 = method23(arg0 - 1, arg1) + method23(arg0 + 1, arg1) + method23(arg0, arg1 - 1) + method23(arg0, arg1 + 1);
        int var4 = method23(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "AIYLKTEB", name = "d", descriptor = "(II)I")
    private static final int method21(int arg0, int arg1) {
        int var2 = method4(arg0 + 45365, arg1 + 91923, 4) + (method4(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method4(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(ZIII)I")
    public int method22(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg0) {
            return this.field46;
        } else if ((this.field28[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (this.field28[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "AIYLKTEB", name = "e", descriptor = "(II)I")
    private static final int method23(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "AIYLKTEB", name = "a", descriptor = "(IZ[BI)Z")
    public static final boolean method24(int arg0, boolean arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        class31 var5 = new class31(arg2, 8);
        int var6 = -1;
        if (arg1) {
            throw new NullPointerException();
        }
        label52: while (true) {
            int var7 = var5.method320();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method320();
                    if (var11 == 0) {
                        continue label52;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method306() >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class61 var17 = class61.method491(var6);
                        if (var14 != 22 || !field42 || var17.field1412 || var17.field1391) {
                            var4 &= var17.method488(-63);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method320();
                if (var10 == 0) {
                    break;
                }
                var5.method306();
            }
        }
    }
}
