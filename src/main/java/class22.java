import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IJMWYKME")
public class class22 {

    @OriginalMember(owner = "IJMWYKME", name = "d", descriptor = "I")
    private int field781 = 7;

    @OriginalMember(owner = "IJMWYKME", name = "i", descriptor = "Z")
    private boolean field786 = false;

    @OriginalMember(owner = "IJMWYKME", name = "l", descriptor = "Z")
    private boolean field789 = false;

    @OriginalMember(owner = "IJMWYKME", name = "m", descriptor = "I")
    private int field790 = -833;

    @OriginalMember(owner = "IJMWYKME", name = "r", descriptor = "I")
    private int field795 = -27691;

    @OriginalMember(owner = "IJMWYKME", name = "w", descriptor = "I")
    private int field800 = 3;

    @OriginalMember(owner = "IJMWYKME", name = "F", descriptor = "Z")
    private boolean field809 = false;

    @OriginalMember(owner = "IJMWYKME", name = "g", descriptor = "I")
    private int field784;

    @OriginalMember(owner = "IJMWYKME", name = "h", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "IJMWYKME", name = "t", descriptor = "[[[I")
    private int[][][] field797;

    @OriginalMember(owner = "IJMWYKME", name = "c", descriptor = "[[[B")
    private byte[][][] field780;

    @OriginalMember(owner = "IJMWYKME", name = "b", descriptor = "[[[B")
    private byte[][][] field779;

    @OriginalMember(owner = "IJMWYKME", name = "G", descriptor = "[[[B")
    private byte[][][] field810;

    @OriginalMember(owner = "IJMWYKME", name = "k", descriptor = "[[[B")
    private byte[][][] field788;

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "[[[B")
    private byte[][][] field778;

    @OriginalMember(owner = "IJMWYKME", name = "C", descriptor = "[[[I")
    private int[][][] field806;

    @OriginalMember(owner = "IJMWYKME", name = "s", descriptor = "[[[B")
    private byte[][][] field796;

    @OriginalMember(owner = "IJMWYKME", name = "e", descriptor = "[[I")
    private int[][] field782;

    @OriginalMember(owner = "IJMWYKME", name = "x", descriptor = "[I")
    private int[] field801;

    @OriginalMember(owner = "IJMWYKME", name = "y", descriptor = "[I")
    private int[] field802;

    @OriginalMember(owner = "IJMWYKME", name = "z", descriptor = "[I")
    private int[] field803;

    @OriginalMember(owner = "IJMWYKME", name = "A", descriptor = "[I")
    private int[] field804;

    @OriginalMember(owner = "IJMWYKME", name = "B", descriptor = "[I")
    private int[] field805;

    @OriginalMember(owner = "IJMWYKME", name = "f", descriptor = "I")
    public static int field783 = 99;

    @OriginalMember(owner = "IJMWYKME", name = "j", descriptor = "[I")
    private static final int[] field787 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "IJMWYKME", name = "n", descriptor = "[I")
    private static final int[] field791 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "IJMWYKME", name = "o", descriptor = "I")
    private static int field792 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "IJMWYKME", name = "p", descriptor = "I")
    private static int field793 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "IJMWYKME", name = "q", descriptor = "Z")
    public static boolean field794 = true;

    @OriginalMember(owner = "IJMWYKME", name = "u", descriptor = "I")
    private static int field798 = 205;

    @OriginalMember(owner = "IJMWYKME", name = "v", descriptor = "[I")
    private static final int[] field799 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "IJMWYKME", name = "D", descriptor = "[I")
    private static final int[] field807 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "IJMWYKME", name = "E", descriptor = "I")
    private static int field808 = 7;

    @OriginalMember(owner = "IJMWYKME", name = "H", descriptor = "I")
    private static int field811 = 7;

    @OriginalMember(owner = "IJMWYKME", name = "I", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(BIIII)V")
    public final void method256(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
            for (int var7 = arg1; var7 <= arg1 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field784 && var6 >= 0 && var6 < this.field785) {
                    this.field796[0][var7][var6] = 127;
                    if (arg1 == var7 && var7 > 0) {
                        this.field797[0][var7][var6] = this.field797[0][var7 - 1][var6];
                    }
                    if (arg1 + arg4 == var7 && var7 < this.field784 - 1) {
                        this.field797[0][var7][var6] = this.field797[0][var7 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field797[0][var7][var6] = this.field797[0][var7][var6 - 1];
                    }
                    if (arg2 + arg3 == var6 && var6 < this.field785 - 1) {
                        this.field797[0][var7][var6] = this.field797[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg0 != -11) {
            this.field789 = !this.field789;
        }
    }

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(II)I")
    private static final int method257(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(II[B[LCGGBZSOS;IIIIII)V")
    public final void method258(int arg0, int arg1, byte[] arg2, class5[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg4 + var11 > 0 && arg4 + var11 < 103 && arg1 + var16 > 0 && arg1 + var16 < 103) {
                    arg3[arg9].field102[arg4 + var11][arg1 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        if (arg5 <= 0) {
            return;
        }
        class55 var12 = new class55(741, arg2);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg6 == var13 && var14 >= arg8 && var14 < arg8 + 8 && var15 >= arg7 && var15 < arg7 + 8) {
                        this.method268(arg4 + class14.method210(var15 & 0x7, -195, arg0, var14 & 0x7), arg0, 0, 4, 0, arg1 + class14.method211(var15 & 0x7, var14 & 0x7, arg0, 3), var12, arg9);
                    } else {
                        this.method268(-1, 0, 0, 4, 0, -1, var12, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method259(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            throw new NullPointerException();
        }
        class4 var3 = class4.method24(arg1);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method19((byte) 6, arg0);
    }

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(I[LCGGBZSOS;LOBOSMEDX;)V")
    public final void method260(int arg0, class5[] arg1, class38 arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field780[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field780[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method28(var110, 43364, var111);
                        }
                    }
                }
            }
        }
        field793 += (int) (Math.random() * 5.0D) - 2;
        if (field793 < -8) {
            field793 = -8;
        }
        if (field793 > 8) {
            field793 = 8;
        }
        field792 += (int) (Math.random() * 5.0D) - 2;
        if (field792 < -16) {
            field792 = -16;
        }
        if (field792 > 16) {
            field792 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field796[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field785 - 1; var56++) {
                for (int var101 = 1; var101 < this.field784 - 1; var101++) {
                    int var102 = this.field797[var5][var101 + 1][var56] - this.field797[var5][var101 - 1][var56];
                    int var103 = this.field797[var5][var101][var56 + 1] - this.field797[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field782[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field785; var57++) {
                this.field801[var57] = 0;
                this.field802[var57] = 0;
                this.field803[var57] = 0;
                this.field804[var57] = 0;
                this.field805[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field784 + 5; var58++) {
                for (int var61 = 0; var61 < this.field785; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field784) {
                        int var96 = this.field779[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class10 var97 = class10.field642[var96 - 1];
                            this.field801[var61] += var97.field651;
                            this.field802[var61] += var97.field649;
                            this.field803[var61] += var97.field650;
                            this.field804[var61] += var97.field652;
                            var10002 = this.field805[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field784) {
                        int var99 = this.field779[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class10 var100 = class10.field642[var99 - 1];
                            this.field801[var61] -= var100.field651;
                            this.field802[var61] -= var100.field649;
                            this.field803[var61] -= var100.field650;
                            this.field804[var61] -= var100.field652;
                            var10002 = this.field805[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field784 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field785 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field785) {
                            var62 += this.field801[var68];
                            var63 += this.field802[var68];
                            var64 += this.field803[var68];
                            var65 += this.field804[var68];
                            var66 += this.field805[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field785) {
                            var62 -= this.field801[var69];
                            var63 -= this.field802[var69];
                            var64 -= this.field803[var69];
                            var65 -= this.field804[var69];
                            var66 -= this.field805[var69];
                        }
                        if (var67 >= 1 && var67 < this.field785 - 1 && (!field794 || (this.field780[0][var58][var67] & 0x2) != 0 || (this.field780[var5][var58][var67] & 0x10) == 0 && this.method272(var67, var5, 966, var58) == field812)) {
                            if (var5 < field783) {
                                field783 = var5;
                            }
                            int var70 = this.field779[var5][var58][var67] & 0xFF;
                            int var71 = this.field810[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field797[var5][var58][var67];
                                int var73 = this.field797[var5][var58 + 1][var67];
                                int var74 = this.field797[var5][var58 + 1][var67 + 1];
                                int var75 = this.field797[var5][var58][var67 + 1];
                                int var76 = this.field782[var58][var67];
                                int var77 = this.field782[var58 + 1][var67];
                                int var78 = this.field782[var58 + 1][var67 + 1];
                                int var79 = this.field782[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method266(var82, var83, var84);
                                    int var85 = field793 + var82 & 0xFF;
                                    int var86 = field792 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method266(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field788[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class10.field642[var71 - 1].field647) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field806[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class26.field894[method269(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg2.method347(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method269(var80, var76), method269(var80, var77), method269(var80, var78), method269(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field788[var5][var58][var67] + 1;
                                    byte var90 = this.field778[var5][var58][var67];
                                    class10 var91 = class10.field642[var71 - 1];
                                    int var92 = var91.field645;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class26.method294(true, var92);
                                        var94 = -1;
                                    } else if (var91.field644 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method266(var91.field648, var91.field649, var91.field650);
                                        var93 = class26.field894[this.method262(var91.field653, 96)];
                                    }
                                    arg2.method347(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method269(var80, var76), method269(var80, var77), method269(var80, var78), method269(var80, var79), this.method262(var94, var76), this.method262(var94, var77), this.method262(var94, var78), this.method262(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field785 - 1; var59++) {
                for (int var60 = 1; var60 < this.field784 - 1; var60++) {
                    arg2.method346(var5, var60, var59, this.method272(var59, var5, 966, var60));
                }
            }
        }
        arg2.method373(64, -50, -10, false, -50, 768);
        if (arg0 <= 0) {
            this.field809 = !this.field809;
        }
        for (int var6 = 0; var6 < this.field784; var6++) {
            for (int var47 = 0; var47 < this.field785; var47++) {
                if ((this.field780[1][var6][var47] & 0x2) == 2) {
                    arg2.method344(var6, var47, false);
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
                for (int var12 = 0; var12 <= this.field785; var12++) {
                    for (int var13 = 0; var13 <= this.field784; var13++) {
                        if ((this.field806[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field806[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field785 && (this.field806[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label335: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field806[var16 - 1][var13][var18] & var7) == 0) {
                                        break label335;
                                    }
                                }
                                var16--;
                            }
                            label324: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field806[var17 + 1][var13][var19] & var7) == 0) {
                                        break label324;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field797[var17][var13][var14] - var21;
                                int var23 = this.field797[var16][var13][var14];
                                class38.method345(var10, var15 * 128 + 128, var13 * 128, var22, var14 * 128, this.field786, var23, var13 * 128, 1);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field806[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field806[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field806[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field784 && (this.field806[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label388: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field806[var28 - 1][var30][var12] & var8) == 0) {
                                        break label388;
                                    }
                                }
                                var28--;
                            }
                            label377: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field806[var29 + 1][var31][var12] & var8) == 0) {
                                        break label377;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field797[var29][var26][var12] - var33;
                                int var35 = this.field797[var28][var26][var12];
                                class38.method345(var10, var12 * 128, var27 * 128 + 128, var34, var12 * 128, this.field786, var35, var26 * 128, 2);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field806[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field806[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field806[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field785 && (this.field806[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label441: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field806[var11][var38 - 1][var42] & var9) == 0) {
                                        break label441;
                                    }
                                }
                                var38--;
                            }
                            label430: while (var39 < this.field784) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field806[var11][var39 + 1][var43] & var9) == 0) {
                                        break label430;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field797[var11][var38][var40];
                                class38.method345(var10, var41 * 128 + 128, var39 * 128 + 128, var44, var40 * 128, this.field786, var44, var38 * 128, 4);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field806[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "IJMWYKME", name = "<init>", descriptor = "(II[[[IB[[[B)V")
    public class22(int arg0, int arg1, int[][][] arg2, byte arg3, byte[][][] arg4) {
        field783 = 99;
        this.field784 = arg1;
        this.field785 = arg0;
        this.field797 = arg2;
        this.field780 = arg4;
        this.field779 = new byte[4][this.field784][this.field785];
        if (arg3 != -35) {
            this.field809 = !this.field809;
        }
        this.field810 = new byte[4][this.field784][this.field785];
        this.field788 = new byte[4][this.field784][this.field785];
        this.field778 = new byte[4][this.field784][this.field785];
        this.field806 = new int[4][this.field784 + 1][this.field785 + 1];
        this.field796 = new byte[4][this.field784 + 1][this.field785 + 1];
        this.field782 = new int[this.field784 + 1][this.field785 + 1];
        this.field801 = new int[this.field785];
        this.field802 = new int[this.field785];
        this.field803 = new int[this.field785];
        this.field804 = new int[this.field785];
        this.field805 = new int[this.field785];
    }

    @OriginalMember(owner = "IJMWYKME", name = "b", descriptor = "(II)I")
    private static final int method261(int arg0, int arg1) {
        int var2 = method257(arg0 - 1, arg1 - 1) + method257(arg0 + 1, arg1 - 1) + method257(arg0 - 1, arg1 + 1) + method257(arg0 + 1, arg1 + 1);
        int var3 = method257(arg0 - 1, arg1) + method257(arg0 + 1, arg1) + method257(arg0, arg1 - 1) + method257(arg0, arg1 + 1);
        int var4 = method257(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "IJMWYKME", name = "c", descriptor = "(II)I")
    private final int method262(int arg0, int arg1) {
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

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(IIILCGGBZSOS;ILOBOSMEDX;III)V")
    private final void method263(int arg0, int arg1, int arg2, class5 arg3, int arg4, class38 arg5, int arg6, int arg7, int arg8) {
        if (field794 && (this.field780[0][arg1][arg7] & 0x2) == 0) {
            if ((this.field780[arg8][arg1][arg7] & 0x10) != 0) {
                return;
            }
            if (this.method272(arg7, arg8, 966, arg1) != field812) {
                return;
            }
        }
        if (arg8 < field783) {
            field783 = arg8;
        }
        int var10 = this.field797[arg8][arg1][arg7];
        int var11 = this.field797[arg8][arg1 + 1][arg7];
        if (arg0 < 7 || arg0 > 7) {
            for (int var12 = 1; var12 > 0; var12++) {
            }
        }
        int var13 = this.field797[arg8][arg1 + 1][arg7 + 1];
        int var14 = this.field797[arg8][arg1][arg7 + 1];
        int var15 = var10 + var11 + var13 + var14 >> 2;
        class4 var16 = class4.method24(arg4);
        int var17 = (arg4 << 14) + (arg7 << 7) + arg1 + 1073741824;
        if (!var16.field40) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg6 << 6) + arg2);
        if (arg2 == 22) {
            if (!field794 || var16.field40 || var16.field46) {
                class34 var19;
                if (var16.field58 == -1 && var16.field41 == null) {
                    var19 = var16.method20(22, arg6, var10, var11, var13, var14, -1);
                } else {
                    var19 = new class23(var11, var16.field58, var14, arg4, var13, 22, arg6, var10, true, true);
                }
                arg5.method348(arg7, false, var19, var17, var18, var15, arg8, arg1);
                if (var16.field79 && var16.field40 && arg3 != null) {
                    arg3.method28(arg1, 43364, arg7);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class34 var39;
            if (var16.field58 == -1 && var16.field41 == null) {
                var39 = var16.method20(10, arg6, var10, var11, var13, var14, -1);
            } else {
                var39 = new class23(var11, var16.field58, var14, arg4, var13, 10, arg6, var10, true, true);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg2 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg6 == 1 || arg6 == 3) {
                    var41 = var16.field57;
                    var42 = var16.field72;
                } else {
                    var41 = var16.field72;
                    var42 = var16.field57;
                }
                if (arg5.method352(var39, var17, var18, var40, arg1, arg8, var41, arg7, field811, var42, var15) && var16.field88) {
                    class66 var43;
                    if (var39 instanceof class66) {
                        var43 = (class66) var39;
                    } else {
                        var43 = var16.method20(10, arg6, var10, var11, var13, var14, -1);
                    }
                    if (var43 != null) {
                        for (int var44 = 0; var44 <= var41; var44++) {
                            for (int var45 = 0; var45 <= var42; var45++) {
                                int var46 = var43.field1610 / 4;
                                if (var46 > 30) {
                                    var46 = 30;
                                }
                                if (var46 > this.field796[arg8][arg1 + var44][arg7 + var45]) {
                                    this.field796[arg8][arg1 + var44][arg7 + var45] = (byte) var46;
                                }
                            }
                        }
                    }
                }
            }
            if (var16.field79 && arg3 != null) {
                arg3.method27(arg7, arg6, var16.field57, false, var16.field49, var16.field72, arg1);
            }
        } else if (arg2 >= 12) {
            class34 var20;
            if (var16.field58 == -1 && var16.field41 == null) {
                var20 = var16.method20(arg2, arg6, var10, var11, var13, var14, -1);
            } else {
                var20 = new class23(var11, var16.field58, var14, arg4, var13, arg2, arg6, var10, true, true);
            }
            arg5.method352(var20, var17, var18, 0, arg1, arg8, 1, arg7, field811, 1, var15);
            if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg8 > 0) {
                this.field806[arg8][arg1][arg7] |= 0x924;
            }
            if (var16.field79 && arg3 != null) {
                arg3.method27(arg7, arg6, var16.field57, false, var16.field49, var16.field72, arg1);
            }
        } else if (arg2 == 0) {
            class34 var21;
            if (var16.field58 == -1 && var16.field41 == null) {
                var21 = var16.method20(0, arg6, var10, var11, var13, var14, -1);
            } else {
                var21 = new class23(var11, var16.field58, var14, arg4, var13, 0, arg6, var10, true, true);
            }
            arg5.method350(var18, var21, var15, arg8, arg7, null, true, arg1, 0, var17, field799[arg6]);
            if (arg6 == 0) {
                if (var16.field88) {
                    this.field796[arg8][arg1][arg7] = 50;
                    this.field796[arg8][arg1][arg7 + 1] = 50;
                }
                if (var16.field39) {
                    this.field806[arg8][arg1][arg7] |= 0x249;
                }
            } else if (arg6 == 1) {
                if (var16.field88) {
                    this.field796[arg8][arg1][arg7 + 1] = 50;
                    this.field796[arg8][arg1 + 1][arg7 + 1] = 50;
                }
                if (var16.field39) {
                    this.field806[arg8][arg1][arg7 + 1] |= 0x492;
                }
            } else if (arg6 == 2) {
                if (var16.field88) {
                    this.field796[arg8][arg1 + 1][arg7] = 50;
                    this.field796[arg8][arg1 + 1][arg7 + 1] = 50;
                }
                if (var16.field39) {
                    this.field806[arg8][arg1 + 1][arg7] |= 0x249;
                }
            } else if (arg6 == 3) {
                if (var16.field88) {
                    this.field796[arg8][arg1][arg7] = 50;
                    this.field796[arg8][arg1 + 1][arg7] = 50;
                }
                if (var16.field39) {
                    this.field806[arg8][arg1][arg7] |= 0x492;
                }
            }
            if (var16.field79 && arg3 != null) {
                arg3.method26((byte) 86, arg7, arg2, var16.field49, arg1, arg6);
            }
            if (var16.field75 != 16) {
                arg5.method358(arg7, arg8, arg1, -42233, var16.field75);
            }
        } else if (arg2 == 1) {
            class34 var22;
            if (var16.field58 == -1 && var16.field41 == null) {
                var22 = var16.method20(1, arg6, var10, var11, var13, var14, -1);
            } else {
                var22 = new class23(var11, var16.field58, var14, arg4, var13, 1, arg6, var10, true, true);
            }
            arg5.method350(var18, var22, var15, arg8, arg7, null, true, arg1, 0, var17, field791[arg6]);
            if (var16.field88) {
                if (arg6 == 0) {
                    this.field796[arg8][arg1][arg7 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field796[arg8][arg1 + 1][arg7 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field796[arg8][arg1 + 1][arg7] = 50;
                } else if (arg6 == 3) {
                    this.field796[arg8][arg1][arg7] = 50;
                }
            }
            if (var16.field79 && arg3 != null) {
                arg3.method26((byte) 86, arg7, arg2, var16.field49, arg1, arg6);
            }
        } else if (arg2 == 2) {
            int var23 = arg6 + 1 & 0x3;
            class34 var24;
            class34 var25;
            if (var16.field58 == -1 && var16.field41 == null) {
                var24 = var16.method20(2, arg6 + 4, var10, var11, var13, var14, -1);
                var25 = var16.method20(2, var23, var10, var11, var13, var14, -1);
            } else {
                var24 = new class23(var11, var16.field58, var14, arg4, var13, 2, arg6 + 4, var10, true, true);
                var25 = new class23(var11, var16.field58, var14, arg4, var13, 2, var23, var10, true, true);
            }
            arg5.method350(var18, var24, var15, arg8, arg7, var25, true, arg1, field799[var23], var17, field799[arg6]);
            if (var16.field39) {
                if (arg6 == 0) {
                    this.field806[arg8][arg1][arg7] |= 0x249;
                    this.field806[arg8][arg1][arg7 + 1] |= 0x492;
                } else if (arg6 == 1) {
                    this.field806[arg8][arg1][arg7 + 1] |= 0x492;
                    this.field806[arg8][arg1 + 1][arg7] |= 0x249;
                } else if (arg6 == 2) {
                    this.field806[arg8][arg1 + 1][arg7] |= 0x249;
                    this.field806[arg8][arg1][arg7] |= 0x492;
                } else if (arg6 == 3) {
                    this.field806[arg8][arg1][arg7] |= 0x492;
                    this.field806[arg8][arg1][arg7] |= 0x249;
                }
            }
            if (var16.field79 && arg3 != null) {
                arg3.method26((byte) 86, arg7, arg2, var16.field49, arg1, arg6);
            }
            if (var16.field75 != 16) {
                arg5.method358(arg7, arg8, arg1, -42233, var16.field75);
            }
        } else if (arg2 == 3) {
            class34 var26;
            if (var16.field58 == -1 && var16.field41 == null) {
                var26 = var16.method20(3, arg6, var10, var11, var13, var14, -1);
            } else {
                var26 = new class23(var11, var16.field58, var14, arg4, var13, 3, arg6, var10, true, true);
            }
            arg5.method350(var18, var26, var15, arg8, arg7, null, true, arg1, 0, var17, field791[arg6]);
            if (var16.field88) {
                if (arg6 == 0) {
                    this.field796[arg8][arg1][arg7 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field796[arg8][arg1 + 1][arg7 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field796[arg8][arg1 + 1][arg7] = 50;
                } else if (arg6 == 3) {
                    this.field796[arg8][arg1][arg7] = 50;
                }
            }
            if (var16.field79 && arg3 != null) {
                arg3.method26((byte) 86, arg7, arg2, var16.field49, arg1, arg6);
            }
        } else if (arg2 == 9) {
            class34 var27;
            if (var16.field58 == -1 && var16.field41 == null) {
                var27 = var16.method20(arg2, arg6, var10, var11, var13, var14, -1);
            } else {
                var27 = new class23(var11, var16.field58, var14, arg4, var13, arg2, arg6, var10, true, true);
            }
            arg5.method352(var27, var17, var18, 0, arg1, arg8, 1, arg7, field811, 1, var15);
            if (var16.field79 && arg3 != null) {
                arg3.method27(arg7, arg6, var16.field57, false, var16.field49, var16.field72, arg1);
            }
        } else {
            if (var16.field42) {
                if (arg6 == 1) {
                    int var28 = var14;
                    var14 = var13;
                    var13 = var11;
                    var11 = var10;
                    var10 = var28;
                } else if (arg6 == 2) {
                    int var29 = var14;
                    var14 = var11;
                    var11 = var29;
                    int var30 = var13;
                    var13 = var10;
                    var10 = var30;
                } else if (arg6 == 3) {
                    int var31 = var14;
                    var14 = var10;
                    var10 = var11;
                    var11 = var13;
                    var13 = var31;
                }
            }
            if (arg2 == 4) {
                class34 var32;
                if (var16.field58 == -1 && var16.field41 == null) {
                    var32 = var16.method20(4, 0, var10, var11, var13, var14, -1);
                } else {
                    var32 = new class23(var11, var16.field58, var14, arg4, var13, 4, 0, var10, true, true);
                }
                arg5.method351(0, arg6 * 512, var32, field808, var15, 0, field799[arg6], arg7, arg1, arg8, var18, var17);
            } else if (arg2 == 5) {
                int var33 = 16;
                int var34 = arg5.method368(arg8, arg1, arg7);
                if (var34 > 0) {
                    var33 = class4.method24(var34 >> 14 & 0x7FFF).field75;
                }
                class34 var35;
                if (var16.field58 == -1 && var16.field41 == null) {
                    var35 = var16.method20(4, 0, var10, var11, var13, var14, -1);
                } else {
                    var35 = new class23(var11, var16.field58, var14, arg4, var13, 4, 0, var10, true, true);
                }
                arg5.method351(field807[arg6] * var33, arg6 * 512, var35, field808, var15, field787[arg6] * var33, field799[arg6], arg7, arg1, arg8, var18, var17);
            } else if (arg2 == 6) {
                class34 var36;
                if (var16.field58 == -1 && var16.field41 == null) {
                    var36 = var16.method20(4, 0, var10, var11, var13, var14, -1);
                } else {
                    var36 = new class23(var11, var16.field58, var14, arg4, var13, 4, 0, var10, true, true);
                }
                arg5.method351(0, arg6, var36, field808, var15, 0, 256, arg7, arg1, arg8, var18, var17);
            } else if (arg2 == 7) {
                class34 var37;
                if (var16.field58 == -1 && var16.field41 == null) {
                    var37 = var16.method20(4, 0, var10, var11, var13, var14, -1);
                } else {
                    var37 = new class23(var11, var16.field58, var14, arg4, var13, 4, 0, var10, true, true);
                }
                arg5.method351(0, arg6, var37, field808, var15, 0, 512, arg7, arg1, arg8, var18, var17);
            } else if (arg2 == 8) {
                class34 var38;
                if (var16.field58 == -1 && var16.field41 == null) {
                    var38 = var16.method20(4, 0, var10, var11, var13, var14, -1);
                } else {
                    var38 = new class23(var11, var16.field58, var14, arg4, var13, 4, 0, var10, true, true);
                }
                arg5.method351(0, arg6, var38, field808, var15, 0, 768, arg7, arg1, arg8, var18, var17);
            }
        }
    }

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(ZI[B[LCGGBZSOS;LOBOSMEDX;I)V")
    public final void method264(boolean arg0, int arg1, byte[] arg2, class5[] arg3, class38 arg4, int arg5) {
        if (arg0) {
            this.field789 = !this.field789;
        }
        class55 var7 = new class55(741, arg2);
        int var8 = -1;
        while (true) {
            int var9 = var7.method469();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method469();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method455();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg5 + var13;
                int var19 = arg1 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field780[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class5 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg3[var20];
                    }
                    this.method263(this.field781, var18, var16, var21, var8, arg4, var17, var19, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(LELICEBAH;ILUAWAYCTK;)V")
    public static final void method265(class11 arg0, int arg1, class55 arg2) {
        int var3 = -1;
        if (arg1 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (true) {
            int var5 = arg2.method469();
            if (var5 == 0) {
                return;
            }
            var3 += var5;
            class4 var6 = class4.method24(var3);
            var6.method22(arg0, (byte) 5);
            while (true) {
                int var7 = arg2.method469();
                if (var7 == 0) {
                    break;
                }
                arg2.method455();
            }
        }
    }

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(III)I")
    private final int method266(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(IIII)I")
    private static final int method267(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class26.field883[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(IIIIIILUAWAYCTK;I)V")
    private final void method268(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class55 arg6, int arg7) {
        if (arg3 != 4) {
            this.field790 = -29;
        }
        if (arg0 < 0 || arg0 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var11 = arg6.method455();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg6.method455();
                    return;
                }
                if (var11 <= 49) {
                    arg6.method455();
                }
            }
        }
        this.field780[arg7][arg0][arg5] = 0;
        while (true) {
            int var9 = arg6.method455();
            if (var9 == 0) {
                if (arg7 == 0) {
                    this.field797[0][arg0][arg5] = -method271(arg0 + arg2 + 932731, arg5 + 556238 + arg4) * 8;
                    return;
                } else {
                    this.field797[arg7][arg0][arg5] = this.field797[arg7 - 1][arg0][arg5] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg6.method455();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg7 == 0) {
                    this.field797[0][arg0][arg5] = -var10 * 8;
                    return;
                }
                this.field797[arg7][arg0][arg5] = this.field797[arg7 - 1][arg0][arg5] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field810[arg7][arg0][arg5] = arg6.method456();
                this.field788[arg7][arg0][arg5] = (byte) ((var9 - 2) / 4);
                this.field778[arg7][arg0][arg5] = (byte) (var9 + arg1 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field780[arg7][arg0][arg5] = (byte) (var9 - 49);
            } else {
                this.field779[arg7][arg0][arg5] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "IJMWYKME", name = "d", descriptor = "(II)I")
    private static final int method269(int arg0, int arg1) {
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

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(IB[BI)Z")
    public static final boolean method270(int arg0, byte arg1, byte[] arg2, int arg3) {
        boolean var4 = true;
        if (arg1 != -32) {
            throw new NullPointerException();
        }
        class55 var5 = new class55(741, arg2);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method469();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method469();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method455() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg3 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class4 var17 = class4.method24(var6);
                        if (var14 != 22 || !field794 || var17.field40 || var17.field46) {
                            var4 &= var17.method16(field798);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method469();
                if (var10 == 0) {
                    break;
                }
                var5.method455();
            }
        }
    }

    @OriginalMember(owner = "IJMWYKME", name = "e", descriptor = "(II)I")
    private static final int method271(int arg0, int arg1) {
        int var2 = method275(arg0 + 45365, arg1 + 91923, 4) + (method275(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method275(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "IJMWYKME", name = "b", descriptor = "(IIII)I")
    public int method272(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field780[arg1][arg3][arg0] & 0x8) == 0) {
            return arg1 <= 0 || (this.field780[1][arg3][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(III[BIILOBOSMEDX;IBI[LCGGBZSOS;)V")
    public final void method273(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, class38 arg6, int arg7, byte arg8, int arg9, class5[] arg10) {
        class55 var12 = new class55(741, arg3);
        if (arg8 != 2) {
            this.field795 = 145;
        }
        int var13 = -1;
        while (true) {
            int var14 = var12.method469();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method469();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method455();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg9 == var19 && var18 >= arg0 && var18 < arg0 + 8 && var17 >= arg7 && var17 < arg7 + 8) {
                    class4 var23 = class4.method24(var13);
                    int var24 = arg1 + class14.method212(var23.field72, var22, var23.field57, arg4, var18 & 0x7, this.field800, var17 & 0x7);
                    int var25 = arg2 + class14.method213(var22, var23.field57, arg4, var18 & 0x7, var17 & 0x7, var23.field72, -588);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg5;
                        if ((this.field780[1][var24][var25] & 0x2) == 2) {
                            var26 = arg5 - 1;
                        }
                        class5 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg10[var26];
                        }
                        this.method263(this.field781, var24, var21, var27, var13, arg6, arg4 + var22 & 0x3, var25, arg5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(IIIIILOBOSMEDX;ILCGGBZSOS;I[[[II)V")
    public static final void method274(int arg0, int arg1, int arg2, int arg3, int arg4, class38 arg5, int arg6, class5 arg7, int arg8, int[][][] arg9, int arg10) {
        int var11 = arg9[arg6][arg2][arg10];
        int var12 = arg9[arg6][arg2 + 1][arg10];
        int var13 = arg9[arg6][arg2 + 1][arg10 + 1];
        int var14 = arg9[arg6][arg2][arg10 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        if (arg1 <= 0) {
            return;
        }
        class4 var16 = class4.method24(arg0);
        int var17 = (arg0 << 14) + (arg10 << 7) + arg2 + 1073741824;
        if (!var16.field40) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg3 << 6) + arg4);
        if (arg4 == 22) {
            class34 var19;
            if (var16.field58 == -1 && var16.field41 == null) {
                var19 = var16.method20(22, arg3, var11, var12, var13, var14, -1);
            } else {
                var19 = new class23(var12, var16.field58, var14, arg0, var13, 22, arg3, var11, true, true);
            }
            arg5.method348(arg10, false, var19, var17, var18, var15, arg8, arg2);
            if (var16.field79 && var16.field40) {
                arg7.method28(arg2, 43364, arg10);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class34 var39;
            if (var16.field58 == -1 && var16.field41 == null) {
                var39 = var16.method20(10, arg3, var11, var12, var13, var14, -1);
            } else {
                var39 = new class23(var12, var16.field58, var14, arg0, var13, 10, arg3, var11, true, true);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg4 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg3 == 1 || arg3 == 3) {
                    var41 = var16.field57;
                    var42 = var16.field72;
                } else {
                    var41 = var16.field72;
                    var42 = var16.field57;
                }
                arg5.method352(var39, var17, var18, var40, arg2, arg8, var41, arg10, field811, var42, var15);
            }
            if (var16.field79) {
                arg7.method27(arg10, arg3, var16.field57, false, var16.field49, var16.field72, arg2);
            }
        } else if (arg4 >= 12) {
            class34 var20;
            if (var16.field58 == -1 && var16.field41 == null) {
                var20 = var16.method20(arg4, arg3, var11, var12, var13, var14, -1);
            } else {
                var20 = new class23(var12, var16.field58, var14, arg0, var13, arg4, arg3, var11, true, true);
            }
            arg5.method352(var20, var17, var18, 0, arg2, arg8, 1, arg10, field811, 1, var15);
            if (var16.field79) {
                arg7.method27(arg10, arg3, var16.field57, false, var16.field49, var16.field72, arg2);
            }
        } else if (arg4 == 0) {
            class34 var21;
            if (var16.field58 == -1 && var16.field41 == null) {
                var21 = var16.method20(0, arg3, var11, var12, var13, var14, -1);
            } else {
                var21 = new class23(var12, var16.field58, var14, arg0, var13, 0, arg3, var11, true, true);
            }
            arg5.method350(var18, var21, var15, arg8, arg10, null, true, arg2, 0, var17, field799[arg3]);
            if (var16.field79) {
                arg7.method26((byte) 86, arg10, arg4, var16.field49, arg2, arg3);
            }
        } else if (arg4 == 1) {
            class34 var22;
            if (var16.field58 == -1 && var16.field41 == null) {
                var22 = var16.method20(1, arg3, var11, var12, var13, var14, -1);
            } else {
                var22 = new class23(var12, var16.field58, var14, arg0, var13, 1, arg3, var11, true, true);
            }
            arg5.method350(var18, var22, var15, arg8, arg10, null, true, arg2, 0, var17, field791[arg3]);
            if (var16.field79) {
                arg7.method26((byte) 86, arg10, arg4, var16.field49, arg2, arg3);
            }
        } else if (arg4 == 2) {
            int var23 = arg3 + 1 & 0x3;
            class34 var24;
            class34 var25;
            if (var16.field58 == -1 && var16.field41 == null) {
                var24 = var16.method20(2, arg3 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method20(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class23(var12, var16.field58, var14, arg0, var13, 2, arg3 + 4, var11, true, true);
                var25 = new class23(var12, var16.field58, var14, arg0, var13, 2, var23, var11, true, true);
            }
            arg5.method350(var18, var24, var15, arg8, arg10, var25, true, arg2, field799[var23], var17, field799[arg3]);
            if (var16.field79) {
                arg7.method26((byte) 86, arg10, arg4, var16.field49, arg2, arg3);
            }
        } else if (arg4 == 3) {
            class34 var26;
            if (var16.field58 == -1 && var16.field41 == null) {
                var26 = var16.method20(3, arg3, var11, var12, var13, var14, -1);
            } else {
                var26 = new class23(var12, var16.field58, var14, arg0, var13, 3, arg3, var11, true, true);
            }
            arg5.method350(var18, var26, var15, arg8, arg10, null, true, arg2, 0, var17, field791[arg3]);
            if (var16.field79) {
                arg7.method26((byte) 86, arg10, arg4, var16.field49, arg2, arg3);
            }
        } else if (arg4 == 9) {
            class34 var27;
            if (var16.field58 == -1 && var16.field41 == null) {
                var27 = var16.method20(arg4, arg3, var11, var12, var13, var14, -1);
            } else {
                var27 = new class23(var12, var16.field58, var14, arg0, var13, arg4, arg3, var11, true, true);
            }
            arg5.method352(var27, var17, var18, 0, arg2, arg8, 1, arg10, field811, 1, var15);
            if (var16.field79) {
                arg7.method27(arg10, arg3, var16.field57, false, var16.field49, var16.field72, arg2);
            }
        } else {
            if (var16.field42) {
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
            if (arg4 == 4) {
                class34 var32;
                if (var16.field58 == -1 && var16.field41 == null) {
                    var32 = var16.method20(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class23(var12, var16.field58, var14, arg0, var13, 4, 0, var11, true, true);
                }
                arg5.method351(0, arg3 * 512, var32, field808, var15, 0, field799[arg3], arg10, arg2, arg8, var18, var17);
            } else if (arg4 == 5) {
                int var33 = 16;
                int var34 = arg5.method368(arg8, arg2, arg10);
                if (var34 > 0) {
                    var33 = class4.method24(var34 >> 14 & 0x7FFF).field75;
                }
                class34 var35;
                if (var16.field58 == -1 && var16.field41 == null) {
                    var35 = var16.method20(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class23(var12, var16.field58, var14, arg0, var13, 4, 0, var11, true, true);
                }
                arg5.method351(field807[arg3] * var33, arg3 * 512, var35, field808, var15, field787[arg3] * var33, field799[arg3], arg10, arg2, arg8, var18, var17);
            } else if (arg4 == 6) {
                class34 var36;
                if (var16.field58 == -1 && var16.field41 == null) {
                    var36 = var16.method20(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class23(var12, var16.field58, var14, arg0, var13, 4, 0, var11, true, true);
                }
                arg5.method351(0, arg3, var36, field808, var15, 0, 256, arg10, arg2, arg8, var18, var17);
            } else if (arg4 == 7) {
                class34 var37;
                if (var16.field58 == -1 && var16.field41 == null) {
                    var37 = var16.method20(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class23(var12, var16.field58, var14, arg0, var13, 4, 0, var11, true, true);
                }
                arg5.method351(0, arg3, var37, field808, var15, 0, 512, arg10, arg2, arg8, var18, var17);
            } else if (arg4 == 8) {
                class34 var38;
                if (var16.field58 == -1 && var16.field41 == null) {
                    var38 = var16.method20(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class23(var12, var16.field58, var14, arg0, var13, 4, 0, var11, true, true);
                }
                arg5.method351(0, arg3, var38, field808, var15, 0, 768, arg10, arg2, arg8, var18, var17);
            }
        }
    }

    @OriginalMember(owner = "IJMWYKME", name = "b", descriptor = "(III)I")
    private static final int method275(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method261(var3, var5);
        int var8 = method261(var3 + 1, var5);
        int var9 = method261(var3, var5 + 1);
        int var10 = method261(var3 + 1, var5 + 1);
        int var11 = method267(var7, var8, var4, arg2);
        int var12 = method267(var9, var10, var4, arg2);
        return method267(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "IJMWYKME", name = "a", descriptor = "(IIII[LCGGBZSOS;[BI)V")
    public final void method276(int arg0, int arg1, int arg2, int arg3, class5[] arg4, byte[] arg5, int arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg0 + var14 > 0 && arg0 + var14 < 103 && arg6 + var15 > 0 && arg6 + var15 < 103) {
                        arg4[var8].field102[arg0 + var14][arg6 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class55 var9 = new class55(741, arg5);
        if (arg1 < 2 || arg1 > 2) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method268(arg0 + var12, 0, arg3, 4, arg2, arg6 + var13, var9, var11);
                }
            }
        }
    }
}
