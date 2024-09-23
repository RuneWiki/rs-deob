import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("HTMZBQHM")
public class class28 {

    @OriginalMember(owner = "HTMZBQHM", name = "q", descriptor = "Z")
    private boolean field933 = false;

    @OriginalMember(owner = "HTMZBQHM", name = "E", descriptor = "Z")
    private boolean field947 = true;

    @OriginalMember(owner = "HTMZBQHM", name = "H", descriptor = "Z")
    private boolean field950 = true;

    @OriginalMember(owner = "HTMZBQHM", name = "t", descriptor = "I")
    private int field936;

    @OriginalMember(owner = "HTMZBQHM", name = "u", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "HTMZBQHM", name = "k", descriptor = "[[[I")
    private int[][][] field927;

    @OriginalMember(owner = "HTMZBQHM", name = "g", descriptor = "[[[B")
    private byte[][][] field923;

    @OriginalMember(owner = "HTMZBQHM", name = "n", descriptor = "[[[B")
    private byte[][][] field930;

    @OriginalMember(owner = "HTMZBQHM", name = "f", descriptor = "[[[B")
    private byte[][][] field922;

    @OriginalMember(owner = "HTMZBQHM", name = "i", descriptor = "[[[B")
    private byte[][][] field925;

    @OriginalMember(owner = "HTMZBQHM", name = "G", descriptor = "[[[B")
    private byte[][][] field949;

    @OriginalMember(owner = "HTMZBQHM", name = "y", descriptor = "[[[I")
    private int[][][] field941;

    @OriginalMember(owner = "HTMZBQHM", name = "F", descriptor = "[[[B")
    private byte[][][] field948;

    @OriginalMember(owner = "HTMZBQHM", name = "B", descriptor = "[[I")
    private int[][] field944;

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "[I")
    private int[] field917;

    @OriginalMember(owner = "HTMZBQHM", name = "b", descriptor = "[I")
    private int[] field918;

    @OriginalMember(owner = "HTMZBQHM", name = "c", descriptor = "[I")
    private int[] field919;

    @OriginalMember(owner = "HTMZBQHM", name = "d", descriptor = "[I")
    private int[] field920;

    @OriginalMember(owner = "HTMZBQHM", name = "e", descriptor = "[I")
    private int[] field921;

    @OriginalMember(owner = "HTMZBQHM", name = "h", descriptor = "Z")
    public static boolean field924 = true;

    @OriginalMember(owner = "HTMZBQHM", name = "j", descriptor = "I")
    private static int field926 = 9776;

    @OriginalMember(owner = "HTMZBQHM", name = "l", descriptor = "[I")
    private static final int[] field928 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "HTMZBQHM", name = "o", descriptor = "B")
    private static byte field931 = 3;

    @OriginalMember(owner = "HTMZBQHM", name = "p", descriptor = "[I")
    private static final int[] field932 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "HTMZBQHM", name = "r", descriptor = "I")
    private static int field934 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "HTMZBQHM", name = "s", descriptor = "I")
    public static int field935 = 99;

    @OriginalMember(owner = "HTMZBQHM", name = "v", descriptor = "[I")
    private static final int[] field938 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "HTMZBQHM", name = "w", descriptor = "I")
    private static int field939 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "HTMZBQHM", name = "x", descriptor = "I")
    private static int field940 = -677;

    @OriginalMember(owner = "HTMZBQHM", name = "A", descriptor = "[I")
    private static final int[] field943 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "HTMZBQHM", name = "D", descriptor = "B")
    private static byte field946 = 8;

    @OriginalMember(owner = "HTMZBQHM", name = "m", descriptor = "I")
    private static int field929;

    @OriginalMember(owner = "HTMZBQHM", name = "z", descriptor = "I")
    private int field942;

    @OriginalMember(owner = "HTMZBQHM", name = "C", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "(ILDLDGGHZP;[BI[LEXLGBZBR;I)V")
    public final void method347(int arg0, class7 arg1, byte[] arg2, int arg3, class18[] arg4, int arg5) {
        if (arg3 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        class34 var8 = new class34(arg2, field929);
        int var9 = -1;
        while (true) {
            int var10 = var8.method416();
            if (var10 == 0) {
                return;
            }
            var9 += var10;
            int var11 = 0;
            while (true) {
                int var12 = var8.method416();
                if (var12 == 0) {
                    break;
                }
                var11 += var12 - 1;
                int var13 = var11 & 0x3F;
                int var14 = var11 >> 6 & 0x3F;
                int var15 = var11 >> 12;
                int var16 = var8.method402();
                int var17 = var16 >> 2;
                int var18 = var16 & 0x3;
                int var19 = arg0 + var14;
                int var20 = arg5 + var13;
                if (var19 > 0 && var20 > 0 && var19 < 103 && var20 < 103) {
                    int var21 = var15;
                    if ((this.field923[1][var19][var20] & 0x2) == 2) {
                        var21 = var15 - 1;
                    }
                    class18 var22 = null;
                    if (var21 >= 0) {
                        var22 = arg4[var21];
                    }
                    this.method359(var18, -35, var15, var17, var19, arg1, var9, var20, var22);
                }
            }
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "(ZLDLDGGHZP;[LEXLGBZBR;)V")
    public final void method348(boolean arg0, class7 arg1, class18[] arg2) {
        if (arg0) {
            field929 = 8;
        }
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field923[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field923[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method243(var110, var111, (byte) -28);
                        }
                    }
                }
            }
        }
        field934 += (int) (Math.random() * 5.0D) - 2;
        if (field934 < -8) {
            field934 = -8;
        }
        if (field934 > 8) {
            field934 = 8;
        }
        field939 += (int) (Math.random() * 5.0D) - 2;
        if (field939 < -16) {
            field939 = -16;
        }
        if (field939 > 16) {
            field939 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field948[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field937 - 1; var56++) {
                for (int var101 = 1; var101 < this.field936 - 1; var101++) {
                    int var102 = this.field927[var5][var101 + 1][var56] - this.field927[var5][var101 - 1][var56];
                    int var103 = this.field927[var5][var101][var56 + 1] - this.field927[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field944[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field937; var57++) {
                this.field917[var57] = 0;
                this.field918[var57] = 0;
                this.field919[var57] = 0;
                this.field920[var57] = 0;
                this.field921[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field936 + 5; var58++) {
                for (int var61 = 0; var61 < this.field937; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field936) {
                        int var96 = this.field930[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class63 var97 = class63.field1576[var96 - 1];
                            this.field917[var61] += var97.field1585;
                            this.field918[var61] += var97.field1583;
                            this.field919[var61] += var97.field1584;
                            this.field920[var61] += var97.field1586;
                            var10002 = this.field921[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field936) {
                        int var99 = this.field930[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class63 var100 = class63.field1576[var99 - 1];
                            this.field917[var61] -= var100.field1585;
                            this.field918[var61] -= var100.field1583;
                            this.field919[var61] -= var100.field1584;
                            this.field920[var61] -= var100.field1586;
                            var10002 = this.field921[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field936 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field937 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field937) {
                            var62 += this.field917[var68];
                            var63 += this.field918[var68];
                            var64 += this.field919[var68];
                            var65 += this.field920[var68];
                            var66 += this.field921[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field937) {
                            var62 -= this.field917[var69];
                            var63 -= this.field918[var69];
                            var64 -= this.field919[var69];
                            var65 -= this.field920[var69];
                            var66 -= this.field921[var69];
                        }
                        if (var67 >= 1 && var67 < this.field937 - 1 && (!field924 || (this.field923[0][var58][var67] & 0x2) != 0 || (this.field923[var5][var58][var67] & 0x10) == 0 && this.method352(-439, var58, var67, var5) == field945)) {
                            if (var5 < field935) {
                                field935 = var5;
                            }
                            int var70 = this.field930[var5][var58][var67] & 0xFF;
                            int var71 = this.field922[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field927[var5][var58][var67];
                                int var73 = this.field927[var5][var58 + 1][var67];
                                int var74 = this.field927[var5][var58 + 1][var67 + 1];
                                int var75 = this.field927[var5][var58][var67 + 1];
                                int var76 = this.field944[var58][var67];
                                int var77 = this.field944[var58 + 1][var67];
                                int var78 = this.field944[var58 + 1][var67 + 1];
                                int var79 = this.field944[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method366(var82, var83, var84);
                                    int var85 = field934 + var82 & 0xFF;
                                    int var86 = field939 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method366(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field925[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class63.field1576[var71 - 1].field1581) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field941[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class25.field831[method349(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg1.method163(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method349(var80, var76), method349(var80, var77), method349(var80, var78), method349(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field925[var5][var58][var67] + 1;
                                    byte var90 = this.field949[var5][var58][var67];
                                    class63 var91 = class63.field1576[var71 - 1];
                                    int var92 = var91.field1579;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class25.method304(5, var92);
                                        var94 = -1;
                                    } else if (var91.field1578 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method366(var91.field1582, var91.field1583, var91.field1584);
                                        var93 = class25.field831[this.method357(var91.field1587, 96)];
                                    }
                                    arg1.method163(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method349(var80, var76), method349(var80, var77), method349(var80, var78), method349(var80, var79), this.method357(var94, var76), this.method357(var94, var77), this.method357(var94, var78), this.method357(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field937 - 1; var59++) {
                for (int var60 = 1; var60 < this.field936 - 1; var60++) {
                    arg1.method162(var5, var60, var59, this.method352(-439, var60, var59, var5));
                }
            }
        }
        arg1.method189(6, -50, -50, 768, 64, -10);
        for (int var6 = 0; var6 < this.field936; var6++) {
            for (int var47 = 0; var47 < this.field937; var47++) {
                if ((this.field923[1][var6][var47] & 0x2) == 2) {
                    arg1.method160(var6, var47, true);
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
                for (int var12 = 0; var12 <= this.field937; var12++) {
                    for (int var13 = 0; var13 <= this.field936; var13++) {
                        if ((this.field941[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field941[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field937 && (this.field941[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field941[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field941[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field927[var17][var13][var14] - var21;
                                int var23 = this.field927[var16][var13][var14];
                                class7.method161(var13 * 128, var10, 67, var22, var14 * 128, var13 * 128, var15 * 128 + 128, 1, var23);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field941[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field941[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field941[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field936 && (this.field941[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field941[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field941[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field927[var29][var26][var12] - var33;
                                int var35 = this.field927[var28][var26][var12];
                                class7.method161(var27 * 128 + 128, var10, 67, var34, var12 * 128, var26 * 128, var12 * 128, 2, var35);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field941[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field941[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field941[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field937 && (this.field941[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field941[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field936) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field941[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field927[var11][var38][var40];
                                class7.method161(var39 * 128 + 128, var10, 67, var44, var40 * 128, var38 * 128, var41 * 128 + 128, 4, var44);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field941[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "(II)I")
    private static final int method349(int arg0, int arg1) {
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

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "([[[IIIIIILDLDGGHZP;IIILEXLGBZBR;)V")
    public static final void method350(int[][][] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class7 arg6, int arg7, int arg8, int arg9, class18 arg10) {
        int var11 = arg0[arg3][arg9][arg2];
        int var12 = arg0[arg3][arg9 + 1][arg2];
        int var13 = arg0[arg3][arg9 + 1][arg2 + 1];
        int var14 = arg0[arg3][arg9][arg2 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class59 var16 = class59.method555(arg8);
        int var17 = (arg8 << 14) + (arg2 << 7) + arg9 + 1073741824;
        if (!var16.field1478) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg7 << 6) + arg4);
        if (field926 != arg5) {
            for (int var19 = 1; var19 > 0; var19++) {
            }
        }
        if (arg4 == 22) {
            class21 var20;
            if (var16.field1487 == -1 && var16.field1502 == null) {
                var20 = var16.method548(22, arg7, var11, var12, var13, var14, -1);
            } else {
                var20 = new class22(arg7, var12, true, var16.field1487, arg8, 22, var11, (byte) 5, var13, var14);
            }
            arg6.method164(var18, var15, arg9, arg1, var17, arg2, var20, field931);
            if (var16.field1480 && var16.field1478) {
                arg10.method243(arg9, arg2, (byte) -28);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class21 var40;
            if (var16.field1487 == -1 && var16.field1502 == null) {
                var40 = var16.method548(10, arg7, var11, var12, var13, var14, -1);
            } else {
                var40 = new class22(arg7, var12, true, var16.field1487, arg8, 10, var11, (byte) 5, var13, var14);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg4 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg7 == 1 || arg7 == 3) {
                    var42 = var16.field1472;
                    var43 = var16.field1506;
                } else {
                    var42 = var16.field1506;
                    var43 = var16.field1472;
                }
                arg6.method168(var42, var41, arg9, var40, var17, 3, arg1, arg2, var18, var43, var15);
            }
            if (var16.field1480) {
                arg10.method242(var16.field1472, arg2, arg7, arg9, var16.field1506, (byte) 7, var16.field1489);
            }
        } else if (arg4 >= 12) {
            class21 var21;
            if (var16.field1487 == -1 && var16.field1502 == null) {
                var21 = var16.method548(arg4, arg7, var11, var12, var13, var14, -1);
            } else {
                var21 = new class22(arg7, var12, true, var16.field1487, arg8, arg4, var11, (byte) 5, var13, var14);
            }
            arg6.method168(1, 0, arg9, var21, var17, 3, arg1, arg2, var18, 1, var15);
            if (var16.field1480) {
                arg10.method242(var16.field1472, arg2, arg7, arg9, var16.field1506, (byte) 7, var16.field1489);
            }
        } else if (arg4 == 0) {
            class21 var22;
            if (var16.field1487 == -1 && var16.field1502 == null) {
                var22 = var16.method548(0, arg7, var11, var12, var13, var14, -1);
            } else {
                var22 = new class22(arg7, var12, true, var16.field1487, arg8, 0, var11, (byte) 5, var13, var14);
            }
            arg6.method166(arg1, var18, arg9, field928[arg7], arg2, null, var15, var22, 0, var17, 49685);
            if (var16.field1480) {
                arg10.method241(var16.field1489, arg2, arg7, false, arg9, arg4);
            }
        } else if (arg4 == 1) {
            class21 var23;
            if (var16.field1487 == -1 && var16.field1502 == null) {
                var23 = var16.method548(1, arg7, var11, var12, var13, var14, -1);
            } else {
                var23 = new class22(arg7, var12, true, var16.field1487, arg8, 1, var11, (byte) 5, var13, var14);
            }
            arg6.method166(arg1, var18, arg9, field938[arg7], arg2, null, var15, var23, 0, var17, 49685);
            if (var16.field1480) {
                arg10.method241(var16.field1489, arg2, arg7, false, arg9, arg4);
            }
        } else if (arg4 == 2) {
            int var24 = arg7 + 1 & 0x3;
            class21 var25;
            class21 var26;
            if (var16.field1487 == -1 && var16.field1502 == null) {
                var25 = var16.method548(2, arg7 + 4, var11, var12, var13, var14, -1);
                var26 = var16.method548(2, var24, var11, var12, var13, var14, -1);
            } else {
                var25 = new class22(arg7 + 4, var12, true, var16.field1487, arg8, 2, var11, (byte) 5, var13, var14);
                var26 = new class22(var24, var12, true, var16.field1487, arg8, 2, var11, (byte) 5, var13, var14);
            }
            arg6.method166(arg1, var18, arg9, field928[arg7], arg2, var26, var15, var25, field928[var24], var17, 49685);
            if (var16.field1480) {
                arg10.method241(var16.field1489, arg2, arg7, false, arg9, arg4);
            }
        } else if (arg4 == 3) {
            class21 var27;
            if (var16.field1487 == -1 && var16.field1502 == null) {
                var27 = var16.method548(3, arg7, var11, var12, var13, var14, -1);
            } else {
                var27 = new class22(arg7, var12, true, var16.field1487, arg8, 3, var11, (byte) 5, var13, var14);
            }
            arg6.method166(arg1, var18, arg9, field938[arg7], arg2, null, var15, var27, 0, var17, 49685);
            if (var16.field1480) {
                arg10.method241(var16.field1489, arg2, arg7, false, arg9, arg4);
            }
        } else if (arg4 == 9) {
            class21 var28;
            if (var16.field1487 == -1 && var16.field1502 == null) {
                var28 = var16.method548(arg4, arg7, var11, var12, var13, var14, -1);
            } else {
                var28 = new class22(arg7, var12, true, var16.field1487, arg8, arg4, var11, (byte) 5, var13, var14);
            }
            arg6.method168(1, 0, arg9, var28, var17, 3, arg1, arg2, var18, 1, var15);
            if (var16.field1480) {
                arg10.method242(var16.field1472, arg2, arg7, arg9, var16.field1506, (byte) 7, var16.field1489);
            }
        } else {
            if (var16.field1476) {
                if (arg7 == 1) {
                    int var29 = var14;
                    var14 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg7 == 2) {
                    int var30 = var14;
                    var14 = var12;
                    var12 = var30;
                    int var31 = var13;
                    var13 = var11;
                    var11 = var31;
                } else if (arg7 == 3) {
                    int var32 = var14;
                    var14 = var11;
                    var11 = var12;
                    var12 = var13;
                    var13 = var32;
                }
            }
            if (arg4 == 4) {
                class21 var33;
                if (var16.field1487 == -1 && var16.field1502 == null) {
                    var33 = var16.method548(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var33 = new class22(0, var12, true, var16.field1487, arg8, 4, var11, (byte) 5, var13, var14);
                }
                arg6.method167(field928[arg7], var17, var33, 0, var18, arg2, var15, arg9, 0, arg1, arg7 * 512, (byte) 2);
            } else if (arg4 == 5) {
                int var34 = 16;
                int var35 = arg6.method184(arg1, arg9, arg2);
                if (var35 > 0) {
                    var34 = class59.method555(var35 >> 14 & 0x7FFF).field1498;
                }
                class21 var36;
                if (var16.field1487 == -1 && var16.field1502 == null) {
                    var36 = var16.method548(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class22(0, var12, true, var16.field1487, arg8, 4, var11, (byte) 5, var13, var14);
                }
                arg6.method167(field928[arg7], var17, var36, field932[arg7] * var34, var18, arg2, var15, arg9, field943[arg7] * var34, arg1, arg7 * 512, (byte) 2);
            } else if (arg4 == 6) {
                class21 var37;
                if (var16.field1487 == -1 && var16.field1502 == null) {
                    var37 = var16.method548(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class22(0, var12, true, var16.field1487, arg8, 4, var11, (byte) 5, var13, var14);
                }
                arg6.method167(256, var17, var37, 0, var18, arg2, var15, arg9, 0, arg1, arg7, (byte) 2);
            } else if (arg4 == 7) {
                class21 var38;
                if (var16.field1487 == -1 && var16.field1502 == null) {
                    var38 = var16.method548(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class22(0, var12, true, var16.field1487, arg8, 4, var11, (byte) 5, var13, var14);
                }
                arg6.method167(512, var17, var38, 0, var18, arg2, var15, arg9, 0, arg1, arg7, (byte) 2);
            } else if (arg4 == 8) {
                class21 var39;
                if (var16.field1487 == -1 && var16.field1502 == null) {
                    var39 = var16.method548(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var39 = new class22(0, var12, true, var16.field1487, arg8, 4, var11, (byte) 5, var13, var14);
                }
                arg6.method167(768, var17, var39, 0, var18, arg2, var15, arg9, 0, arg1, arg7, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "(IIII)I")
    private static final int method351(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class25.field820[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "HTMZBQHM", name = "b", descriptor = "(IIII)I")
    public int method352(int arg0, int arg1, int arg2, int arg3) {
        while (arg0 >= 0) {
            this.field933 = !this.field933;
        }
        if ((this.field923[arg3][arg1][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (this.field923[1][arg1][arg2] & 0x2) == 0) {
            return arg3;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "b", descriptor = "(II)I")
    private static final int method353(int arg0, int arg1) {
        int var2 = method363(arg0 + 45365, arg1 + 91923, 4) + (method363(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method363(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "([BIBI)Z")
    public static final boolean method354(byte[] arg0, int arg1, byte arg2, int arg3) {
        boolean var4 = true;
        class34 var5 = new class34(arg0, field929);
        int var6 = -1;
        if (arg2 != -102) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        label54: while (true) {
            int var8 = var5.method416();
            if (var8 == 0) {
                return var4;
            }
            var6 += var8;
            int var9 = 0;
            boolean var10 = false;
            while (true) {
                while (!var10) {
                    int var12 = var5.method416();
                    if (var12 == 0) {
                        continue label54;
                    }
                    var9 += var12 - 1;
                    int var13 = var9 & 0x3F;
                    int var14 = var9 >> 6 & 0x3F;
                    int var15 = var5.method402() >> 2;
                    int var16 = arg1 + var14;
                    int var17 = arg3 + var13;
                    if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
                        class59 var18 = class59.method555(var6);
                        if (var15 != 22 || !field924 || var18.field1478 || var18.field1512) {
                            var4 &= var18.method550(field946);
                            var10 = true;
                        }
                    }
                }
                int var11 = var5.method416();
                if (var11 == 0) {
                    break;
                }
                var5.method402();
            }
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "c", descriptor = "(II)I")
    private static final int method355(int arg0, int arg1) {
        int var2 = method365(arg0 - 1, arg1 - 1) + method365(arg0 + 1, arg1 - 1) + method365(arg0 - 1, arg1 + 1) + method365(arg0 + 1, arg1 + 1);
        int var3 = method365(arg0 - 1, arg1) + method365(arg0 + 1, arg1) + method365(arg0, arg1 - 1) + method365(arg0, arg1 + 1);
        int var4 = method365(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "(ILLDILQFVA;LGLPUEKVZ;)V")
    public static final void method356(int arg0, class34 arg1, class23 arg2) {
        int var3 = -1;
        while (arg0 >= 0) {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
        while (true) {
            int var4 = arg1.method416();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class59 var5 = class59.method555(var3);
            var5.method552(true, arg2);
            while (true) {
                int var6 = arg1.method416();
                if (var6 == 0) {
                    break;
                }
                arg1.method402();
            }
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "d", descriptor = "(II)I")
    private final int method357(int arg0, int arg1) {
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

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "(I[LEXLGBZBR;IILDLDGGHZP;IZI[BII)V")
    public final void method358(int arg0, class18[] arg1, int arg2, int arg3, class7 arg4, int arg5, boolean arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        class34 var12 = new class34(arg8, field929);
        int var13 = -1;
        if (arg6) {
            this.field950 = !this.field950;
        }
        while (true) {
            int var14 = var12.method416();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method416();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method402();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg10 == var19 && var18 >= arg0 && var18 < arg0 + 8 && var17 >= arg5 && var17 < arg5 + 8) {
                    class59 var23 = class59.method555(var13);
                    int var24 = arg7 + class3.method8(var23.field1506, var23.field1472, var18 & 0x7, arg2, -794, var17 & 0x7);
                    int var25 = arg9 + class3.method9(var23.field1472, var17 & 0x7, (byte) 7, var23.field1506, arg2, var18 & 0x7);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = arg3;
                        if ((this.field923[1][var24][var25] & 0x2) == 2) {
                            var26 = arg3 - 1;
                        }
                        class18 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg1[var26];
                        }
                        this.method359(arg2 + var22 & 0x3, -35, arg3, var21, var24, arg4, var13, var25, var27);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "(IIIIILDLDGGHZP;IILEXLGBZBR;)V")
    private final void method359(int arg0, int arg1, int arg2, int arg3, int arg4, class7 arg5, int arg6, int arg7, class18 arg8) {
        if (field924 && (this.field923[0][arg4][arg7] & 0x2) == 0) {
            if ((this.field923[arg2][arg4][arg7] & 0x10) != 0) {
                return;
            }
            if (this.method352(-439, arg4, arg7, arg2) != field945) {
                return;
            }
        }
        if (arg2 < field935) {
            field935 = arg2;
        }
        int var10 = this.field927[arg2][arg4][arg7];
        int var11 = this.field927[arg2][arg4 + 1][arg7];
        while (arg1 >= 0) {
            for (int var46 = 1; var46 > 0; var46++) {
            }
        }
        int var12 = this.field927[arg2][arg4 + 1][arg7 + 1];
        int var13 = this.field927[arg2][arg4][arg7 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class59 var15 = class59.method555(arg6);
        int var16 = (arg6 << 14) + (arg7 << 7) + arg4 + 1073741824;
        if (!var15.field1478) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg0 << 6) + arg3);
        if (arg3 == 22) {
            if (!field924 || var15.field1478 || var15.field1512) {
                class21 var18;
                if (var15.field1487 == -1 && var15.field1502 == null) {
                    var18 = var15.method548(22, arg0, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class22(arg0, var11, true, var15.field1487, arg6, 22, var10, (byte) 5, var12, var13);
                }
                arg5.method164(var17, var14, arg4, arg2, var16, arg7, var18, field931);
                if (var15.field1480 && var15.field1478 && arg8 != null) {
                    arg8.method243(arg4, arg7, (byte) -28);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class21 var38;
            if (var15.field1487 == -1 && var15.field1502 == null) {
                var38 = var15.method548(10, arg0, var10, var11, var12, var13, -1);
            } else {
                var38 = new class22(arg0, var11, true, var15.field1487, arg6, 10, var10, (byte) 5, var12, var13);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg3 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg0 == 1 || arg0 == 3) {
                    var40 = var15.field1472;
                    var41 = var15.field1506;
                } else {
                    var40 = var15.field1506;
                    var41 = var15.field1472;
                }
                if (arg5.method168(var40, var39, arg4, var38, var16, 3, arg2, arg7, var17, var41, var14) && var15.field1483) {
                    class27 var42;
                    if (var38 instanceof class27) {
                        var42 = (class27) var38;
                    } else {
                        var42 = var15.method548(10, arg0, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field874 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field948[arg2][arg4 + var43][arg7 + var44]) {
                                    this.field948[arg2][arg4 + var43][arg7 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1480 && arg8 != null) {
                arg8.method242(var15.field1472, arg7, arg0, arg4, var15.field1506, (byte) 7, var15.field1489);
            }
        } else if (arg3 >= 12) {
            class21 var19;
            if (var15.field1487 == -1 && var15.field1502 == null) {
                var19 = var15.method548(arg3, arg0, var10, var11, var12, var13, -1);
            } else {
                var19 = new class22(arg0, var11, true, var15.field1487, arg6, arg3, var10, (byte) 5, var12, var13);
            }
            arg5.method168(1, 0, arg4, var19, var16, 3, arg2, arg7, var17, 1, var14);
            if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg2 > 0) {
                this.field941[arg2][arg4][arg7] |= 0x924;
            }
            if (var15.field1480 && arg8 != null) {
                arg8.method242(var15.field1472, arg7, arg0, arg4, var15.field1506, (byte) 7, var15.field1489);
            }
        } else if (arg3 == 0) {
            class21 var20;
            if (var15.field1487 == -1 && var15.field1502 == null) {
                var20 = var15.method548(0, arg0, var10, var11, var12, var13, -1);
            } else {
                var20 = new class22(arg0, var11, true, var15.field1487, arg6, 0, var10, (byte) 5, var12, var13);
            }
            arg5.method166(arg2, var17, arg4, field928[arg0], arg7, null, var14, var20, 0, var16, 49685);
            if (arg0 == 0) {
                if (var15.field1483) {
                    this.field948[arg2][arg4][arg7] = 50;
                    this.field948[arg2][arg4][arg7 + 1] = 50;
                }
                if (var15.field1495) {
                    this.field941[arg2][arg4][arg7] |= 0x249;
                }
            } else if (arg0 == 1) {
                if (var15.field1483) {
                    this.field948[arg2][arg4][arg7 + 1] = 50;
                    this.field948[arg2][arg4 + 1][arg7 + 1] = 50;
                }
                if (var15.field1495) {
                    this.field941[arg2][arg4][arg7 + 1] |= 0x492;
                }
            } else if (arg0 == 2) {
                if (var15.field1483) {
                    this.field948[arg2][arg4 + 1][arg7] = 50;
                    this.field948[arg2][arg4 + 1][arg7 + 1] = 50;
                }
                if (var15.field1495) {
                    this.field941[arg2][arg4 + 1][arg7] |= 0x249;
                }
            } else if (arg0 == 3) {
                if (var15.field1483) {
                    this.field948[arg2][arg4][arg7] = 50;
                    this.field948[arg2][arg4 + 1][arg7] = 50;
                }
                if (var15.field1495) {
                    this.field941[arg2][arg4][arg7] |= 0x492;
                }
            }
            if (var15.field1480 && arg8 != null) {
                arg8.method241(var15.field1489, arg7, arg0, false, arg4, arg3);
            }
            if (var15.field1498 != 16) {
                arg5.method174(arg4, arg2, -212, arg7, var15.field1498);
            }
        } else if (arg3 == 1) {
            class21 var21;
            if (var15.field1487 == -1 && var15.field1502 == null) {
                var21 = var15.method548(1, arg0, var10, var11, var12, var13, -1);
            } else {
                var21 = new class22(arg0, var11, true, var15.field1487, arg6, 1, var10, (byte) 5, var12, var13);
            }
            arg5.method166(arg2, var17, arg4, field938[arg0], arg7, null, var14, var21, 0, var16, 49685);
            if (var15.field1483) {
                if (arg0 == 0) {
                    this.field948[arg2][arg4][arg7 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field948[arg2][arg4 + 1][arg7 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field948[arg2][arg4 + 1][arg7] = 50;
                } else if (arg0 == 3) {
                    this.field948[arg2][arg4][arg7] = 50;
                }
            }
            if (var15.field1480 && arg8 != null) {
                arg8.method241(var15.field1489, arg7, arg0, false, arg4, arg3);
            }
        } else if (arg3 == 2) {
            int var22 = arg0 + 1 & 0x3;
            class21 var23;
            class21 var24;
            if (var15.field1487 == -1 && var15.field1502 == null) {
                var23 = var15.method548(2, arg0 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method548(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class22(arg0 + 4, var11, true, var15.field1487, arg6, 2, var10, (byte) 5, var12, var13);
                var24 = new class22(var22, var11, true, var15.field1487, arg6, 2, var10, (byte) 5, var12, var13);
            }
            arg5.method166(arg2, var17, arg4, field928[arg0], arg7, var24, var14, var23, field928[var22], var16, 49685);
            if (var15.field1495) {
                if (arg0 == 0) {
                    this.field941[arg2][arg4][arg7] |= 0x249;
                    this.field941[arg2][arg4][arg7 + 1] |= 0x492;
                } else if (arg0 == 1) {
                    this.field941[arg2][arg4][arg7 + 1] |= 0x492;
                    this.field941[arg2][arg4 + 1][arg7] |= 0x249;
                } else if (arg0 == 2) {
                    this.field941[arg2][arg4 + 1][arg7] |= 0x249;
                    this.field941[arg2][arg4][arg7] |= 0x492;
                } else if (arg0 == 3) {
                    this.field941[arg2][arg4][arg7] |= 0x492;
                    this.field941[arg2][arg4][arg7] |= 0x249;
                }
            }
            if (var15.field1480 && arg8 != null) {
                arg8.method241(var15.field1489, arg7, arg0, false, arg4, arg3);
            }
            if (var15.field1498 != 16) {
                arg5.method174(arg4, arg2, -212, arg7, var15.field1498);
            }
        } else if (arg3 == 3) {
            class21 var25;
            if (var15.field1487 == -1 && var15.field1502 == null) {
                var25 = var15.method548(3, arg0, var10, var11, var12, var13, -1);
            } else {
                var25 = new class22(arg0, var11, true, var15.field1487, arg6, 3, var10, (byte) 5, var12, var13);
            }
            arg5.method166(arg2, var17, arg4, field938[arg0], arg7, null, var14, var25, 0, var16, 49685);
            if (var15.field1483) {
                if (arg0 == 0) {
                    this.field948[arg2][arg4][arg7 + 1] = 50;
                } else if (arg0 == 1) {
                    this.field948[arg2][arg4 + 1][arg7 + 1] = 50;
                } else if (arg0 == 2) {
                    this.field948[arg2][arg4 + 1][arg7] = 50;
                } else if (arg0 == 3) {
                    this.field948[arg2][arg4][arg7] = 50;
                }
            }
            if (var15.field1480 && arg8 != null) {
                arg8.method241(var15.field1489, arg7, arg0, false, arg4, arg3);
            }
        } else if (arg3 == 9) {
            class21 var26;
            if (var15.field1487 == -1 && var15.field1502 == null) {
                var26 = var15.method548(arg3, arg0, var10, var11, var12, var13, -1);
            } else {
                var26 = new class22(arg0, var11, true, var15.field1487, arg6, arg3, var10, (byte) 5, var12, var13);
            }
            arg5.method168(1, 0, arg4, var26, var16, 3, arg2, arg7, var17, 1, var14);
            if (var15.field1480 && arg8 != null) {
                arg8.method242(var15.field1472, arg7, arg0, arg4, var15.field1506, (byte) 7, var15.field1489);
            }
        } else {
            if (var15.field1476) {
                if (arg0 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg0 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg0 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg3 == 4) {
                class21 var31;
                if (var15.field1487 == -1 && var15.field1502 == null) {
                    var31 = var15.method548(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class22(0, var11, true, var15.field1487, arg6, 4, var10, (byte) 5, var12, var13);
                }
                arg5.method167(field928[arg0], var16, var31, 0, var17, arg7, var14, arg4, 0, arg2, arg0 * 512, (byte) 2);
            } else if (arg3 == 5) {
                int var32 = 16;
                int var33 = arg5.method184(arg2, arg4, arg7);
                if (var33 > 0) {
                    var32 = class59.method555(var33 >> 14 & 0x7FFF).field1498;
                }
                class21 var34;
                if (var15.field1487 == -1 && var15.field1502 == null) {
                    var34 = var15.method548(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class22(0, var11, true, var15.field1487, arg6, 4, var10, (byte) 5, var12, var13);
                }
                arg5.method167(field928[arg0], var16, var34, field932[arg0] * var32, var17, arg7, var14, arg4, field943[arg0] * var32, arg2, arg0 * 512, (byte) 2);
            } else if (arg3 == 6) {
                class21 var35;
                if (var15.field1487 == -1 && var15.field1502 == null) {
                    var35 = var15.method548(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class22(0, var11, true, var15.field1487, arg6, 4, var10, (byte) 5, var12, var13);
                }
                arg5.method167(256, var16, var35, 0, var17, arg7, var14, arg4, 0, arg2, arg0, (byte) 2);
            } else if (arg3 == 7) {
                class21 var36;
                if (var15.field1487 == -1 && var15.field1502 == null) {
                    var36 = var15.method548(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class22(0, var11, true, var15.field1487, arg6, 4, var10, (byte) 5, var12, var13);
                }
                arg5.method167(512, var16, var36, 0, var17, arg7, var14, arg4, 0, arg2, arg0, (byte) 2);
            } else if (arg3 == 8) {
                class21 var37;
                if (var15.field1487 == -1 && var15.field1502 == null) {
                    var37 = var15.method548(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class22(0, var11, true, var15.field1487, arg6, 4, var10, (byte) 5, var12, var13);
                }
                arg5.method167(768, var16, var37, 0, var17, arg7, var14, arg4, 0, arg2, arg0, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "(III)Z")
    public static final boolean method360(int arg0, int arg1, int arg2) {
        if (arg0 <= 0) {
            field940 = -442;
        }
        class59 var3 = class59.method555(arg2);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method554(0, arg1);
    }

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "(IIIIILLDILQFVA;II)V")
    private final void method361(int arg0, int arg1, int arg2, int arg3, int arg4, class34 arg5, int arg6, int arg7) {
        if (arg0 != 17053) {
            this.field947 = !this.field947;
        }
        if (arg1 < 0 || arg1 >= 104 || arg7 < 0 || arg7 >= 104) {
            while (true) {
                int var11 = arg5.method402();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg5.method402();
                    return;
                }
                if (var11 <= 49) {
                    arg5.method402();
                }
            }
        }
        this.field923[arg2][arg1][arg7] = 0;
        while (true) {
            int var9 = arg5.method402();
            if (var9 == 0) {
                if (arg2 == 0) {
                    this.field927[0][arg1][arg7] = -method353(arg1 + arg6 + 932731, arg7 + 556238 + arg4) * 8;
                    return;
                } else {
                    this.field927[arg2][arg1][arg7] = this.field927[arg2 - 1][arg1][arg7] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg5.method402();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg2 == 0) {
                    this.field927[0][arg1][arg7] = -var10 * 8;
                    return;
                }
                this.field927[arg2][arg1][arg7] = this.field927[arg2 - 1][arg1][arg7] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field922[arg2][arg1][arg7] = arg5.method403();
                this.field925[arg2][arg1][arg7] = (byte) ((var9 - 2) / 4);
                this.field949[arg2][arg1][arg7] = (byte) (var9 + arg3 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field923[arg2][arg1][arg7] = (byte) (var9 - 49);
            } else {
                this.field930[arg2][arg1][arg7] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "<init>", descriptor = "([[[BBI[[[II)V")
    public class28(byte[][][] arg0, byte arg1, int arg2, int[][][] arg3, int arg4) {
        field935 = 99;
        this.field936 = arg2;
        this.field937 = arg4;
        this.field927 = arg3;
        this.field923 = arg0;
        this.field930 = new byte[4][this.field936][this.field937];
        this.field922 = new byte[4][this.field936][this.field937];
        this.field925 = new byte[4][this.field936][this.field937];
        this.field949 = new byte[4][this.field936][this.field937];
        this.field941 = new int[4][this.field936 + 1][this.field937 + 1];
        this.field948 = new byte[4][this.field936 + 1][this.field937 + 1];
        this.field944 = new int[this.field936 + 1][this.field937 + 1];
        this.field917 = new int[this.field937];
        this.field918 = new int[this.field937];
        this.field919 = new int[this.field937];
        this.field920 = new int[this.field937];
        this.field921 = new int[this.field937];
        if (arg1 == 3) {
            boolean var6 = false;
        } else {
            for (int var7 = 1; var7 > 0; var7++) {
            }
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "(IIIII)V")
    public final void method362(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg3; var6 <= arg1 + arg3; var6++) {
            for (int var7 = arg4; var7 <= arg2 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field936 && var6 >= 0 && var6 < this.field937) {
                    this.field948[0][var7][var6] = 127;
                    if (arg4 == var7 && var7 > 0) {
                        this.field927[0][var7][var6] = this.field927[0][var7 - 1][var6];
                    }
                    if (arg2 + arg4 == var7 && var7 < this.field936 - 1) {
                        this.field927[0][var7][var6] = this.field927[0][var7 + 1][var6];
                    }
                    if (arg3 == var6 && var6 > 0) {
                        this.field927[0][var7][var6] = this.field927[0][var7][var6 - 1];
                    }
                    if (arg1 + arg3 == var6 && var6 < this.field937 - 1) {
                        this.field927[0][var7][var6] = this.field927[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg0 >= 0) {
            this.field942 = 38;
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "b", descriptor = "(III)I")
    private static final int method363(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method355(var3, var5);
        int var8 = method355(var3 + 1, var5);
        int var9 = method355(var3, var5 + 1);
        int var10 = method355(var3 + 1, var5 + 1);
        int var11 = method351(var7, var8, var4, arg2);
        int var12 = method351(var9, var10, var4, arg2);
        return method351(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "([LEXLGBZBR;[BIIIIZ)V")
    public final void method364(class18[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!arg6) {
            return;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg2 + var13 > 0 && arg2 + var13 < 103 && arg5 + var14 > 0 && arg5 + var14 < 103) {
                        arg0[var8].field717[arg2 + var13][arg5 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class34 var9 = new class34(arg1, field929);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method361(17053, arg2 + var11, var10, 0, arg3, var9, arg4, arg5 + var12);
                }
            }
        }
    }

    @OriginalMember(owner = "HTMZBQHM", name = "e", descriptor = "(II)I")
    private static final int method365(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "HTMZBQHM", name = "c", descriptor = "(III)I")
    private final int method366(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "HTMZBQHM", name = "a", descriptor = "([LEXLGBZBR;[BIIIIIIIB)V")
    public final void method367(class18[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg3 + var11 > 0 && arg3 + var11 < 103 && arg2 + var16 > 0 && arg2 + var16 < 103) {
                    arg0[arg4].field717[arg3 + var11][arg2 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class34 var12 = new class34(arg1, field929);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg5 == var13 && var14 >= arg8 && var14 < arg8 + 8 && var15 >= arg6 && var15 < arg6 + 8) {
                        this.method361(17053, arg3 + class3.method6(arg7, var15 & 0x7, var14 & 0x7, (byte) 5), arg4, arg7, 0, var12, 0, arg2 + class3.method7(var14 & 0x7, arg7, var15 & 0x7, -443));
                    } else {
                        this.method361(17053, -1, 0, 0, 0, var12, 0, -1);
                    }
                }
            }
        }
        if (arg9 != -119) {
            this.field947 = !this.field947;
        }
    }
}
