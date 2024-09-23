import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PTERWXXU")
public class class46 {

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "I")
    private int field1259 = -744;

    @OriginalMember(owner = "PTERWXXU", name = "k", descriptor = "I")
    private int field1269 = 9;

    @OriginalMember(owner = "PTERWXXU", name = "r", descriptor = "I")
    private int field1276 = -768;

    @OriginalMember(owner = "PTERWXXU", name = "D", descriptor = "I")
    private int field1288 = 8;

    @OriginalMember(owner = "PTERWXXU", name = "e", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "PTERWXXU", name = "f", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "PTERWXXU", name = "B", descriptor = "[[[I")
    private int[][][] field1286;

    @OriginalMember(owner = "PTERWXXU", name = "t", descriptor = "[[[B")
    private byte[][][] field1278;

    @OriginalMember(owner = "PTERWXXU", name = "m", descriptor = "[[[B")
    private byte[][][] field1271;

    @OriginalMember(owner = "PTERWXXU", name = "b", descriptor = "[[[B")
    private byte[][][] field1260;

    @OriginalMember(owner = "PTERWXXU", name = "E", descriptor = "[[[B")
    private byte[][][] field1289;

    @OriginalMember(owner = "PTERWXXU", name = "h", descriptor = "[[[B")
    private byte[][][] field1266;

    @OriginalMember(owner = "PTERWXXU", name = "l", descriptor = "[[[I")
    private int[][][] field1270;

    @OriginalMember(owner = "PTERWXXU", name = "c", descriptor = "[[[B")
    private byte[][][] field1261;

    @OriginalMember(owner = "PTERWXXU", name = "i", descriptor = "[[I")
    private int[][] field1267;

    @OriginalMember(owner = "PTERWXXU", name = "w", descriptor = "[I")
    private int[] field1281;

    @OriginalMember(owner = "PTERWXXU", name = "x", descriptor = "[I")
    private int[] field1282;

    @OriginalMember(owner = "PTERWXXU", name = "y", descriptor = "[I")
    private int[] field1283;

    @OriginalMember(owner = "PTERWXXU", name = "z", descriptor = "[I")
    private int[] field1284;

    @OriginalMember(owner = "PTERWXXU", name = "A", descriptor = "[I")
    private int[] field1285;

    @OriginalMember(owner = "PTERWXXU", name = "d", descriptor = "I")
    public static int field1262 = 99;

    @OriginalMember(owner = "PTERWXXU", name = "g", descriptor = "I")
    private static int field1265 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "PTERWXXU", name = "j", descriptor = "Z")
    public static boolean field1268 = true;

    @OriginalMember(owner = "PTERWXXU", name = "n", descriptor = "[I")
    private static final int[] field1272 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "PTERWXXU", name = "o", descriptor = "[I")
    private static final int[] field1273 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "PTERWXXU", name = "p", descriptor = "[I")
    private static final int[] field1274 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "PTERWXXU", name = "s", descriptor = "B")
    private static byte field1277 = 1;

    @OriginalMember(owner = "PTERWXXU", name = "u", descriptor = "I")
    private static int field1279 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "PTERWXXU", name = "C", descriptor = "[I")
    private static final int[] field1287 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "PTERWXXU", name = "q", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "PTERWXXU", name = "v", descriptor = "Z")
    private static boolean field1280;

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(II[BILBGNYQYNO;[LDFJABDHX;)V")
    public final void method474(int arg0, int arg1, byte[] arg2, int arg3, class4 arg4, class5[] arg5) {
        if (arg1 >= 0) {
            this.field1259 = 71;
        }
        class30 var7 = new class30(arg2, -982);
        int var8 = -1;
        while (true) {
            int var9 = var7.method363();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method363();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method349();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg0 + var13;
                int var19 = arg3 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1278[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class5 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg5[var20];
                    }
                    this.method490(var14, var21, arg4, var19, var17, -29430, var18, var16, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(III[B)Z")
    public static final boolean method475(int arg0, int arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        while (arg1 >= 0) {
            for (int var18 = 1; var18 > 0; var18++) {
            }
        }
        class30 var5 = new class30(arg3, -982);
        int var6 = -1;
        label56: while (true) {
            int var7 = var5.method363();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method363();
                    if (var11 == 0) {
                        continue label56;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method349() >> 2;
                    int var15 = arg0 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class50 var17 = class50.method512(var6);
                        if (var14 != 22 || !field1268 || var17.field1347 || var17.field1362) {
                            var4 &= var17.method508((byte) 8);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method363();
                if (var10 == 0) {
                    break;
                }
                var5.method349();
            }
        }
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(LBGNYQYNO;II[BIIII[LDFJABDHX;II)V")
    public final void method476(class4 arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, class5[] arg8, int arg9, int arg10) {
        class30 var12 = new class30(arg3, -982);
        int var13 = -1;
        if (arg2 < 9 || arg2 > 9) {
            return;
        }
        while (true) {
            int var14 = var12.method363();
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method363();
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = var15 & 0x3F;
                int var18 = var15 >> 6 & 0x3F;
                int var19 = var15 >> 12;
                int var20 = var12.method349();
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg10 == var19 && var18 >= arg9 && var18 < arg9 + 8 && var17 >= arg1 && var17 < arg1 + 8) {
                    class50 var23 = class50.method512(var13);
                    int var24 = arg7 + class66.method590((byte) -85, var23.field1358, var23.field1365, arg4, var18 & 0x7, var17 & 0x7);
                    int var25 = arg6 + class66.method591(486, var23.field1358, var18 & 0x7, var23.field1365, var17 & 0x7, arg4);
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        int var26 = var19;
                        if ((this.field1278[1][var24][var25] & 0x2) == 2) {
                            var26 = var19 - 1;
                        }
                        class5 var27 = null;
                        if (var26 >= 0) {
                            var27 = arg8[var26];
                        }
                        this.method490(var19, var27, arg0, var25, arg4 + var22 & 0x3, -29430, var24, var21, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(LBGNYQYNO;[LDFJABDHX;I)V")
    public final void method477(class4 arg0, class5[] arg1, int arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1278[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1278[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg1[var112].method211((byte) 41, var110, var111);
                        }
                    }
                }
            }
        }
        field1279 += (int) (Math.random() * 5.0D) - 2;
        if (field1279 < -8) {
            field1279 = -8;
        }
        if (field1279 > 8) {
            field1279 = 8;
        }
        field1265 += (int) (Math.random() * 5.0D) - 2;
        if (field1265 < -16) {
            field1265 = -16;
        }
        if (field1265 > 16) {
            field1265 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1261[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1264 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1263 - 1; var101++) {
                    int var102 = this.field1286[var5][var101 + 1][var56] - this.field1286[var5][var101 - 1][var56];
                    int var103 = this.field1286[var5][var101][var56 + 1] - this.field1286[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1267[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1264; var57++) {
                this.field1281[var57] = 0;
                this.field1282[var57] = 0;
                this.field1283[var57] = 0;
                this.field1284[var57] = 0;
                this.field1285[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1263 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1264; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1263) {
                        int var96 = this.field1271[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class10 var97 = class10.field702[var96 - 1];
                            this.field1281[var61] += var97.field711;
                            this.field1282[var61] += var97.field709;
                            this.field1283[var61] += var97.field710;
                            this.field1284[var61] += var97.field712;
                            var10002 = this.field1285[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1263) {
                        int var99 = this.field1271[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class10 var100 = class10.field702[var99 - 1];
                            this.field1281[var61] -= var100.field711;
                            this.field1282[var61] -= var100.field709;
                            this.field1283[var61] -= var100.field710;
                            this.field1284[var61] -= var100.field712;
                            var10002 = this.field1285[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1263 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1264 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1264) {
                            var62 += this.field1281[var68];
                            var63 += this.field1282[var68];
                            var64 += this.field1283[var68];
                            var65 += this.field1284[var68];
                            var66 += this.field1285[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1264) {
                            var62 -= this.field1281[var69];
                            var63 -= this.field1282[var69];
                            var64 -= this.field1283[var69];
                            var65 -= this.field1284[var69];
                            var66 -= this.field1285[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1264 - 1 && (!field1268 || (this.field1278[0][var58][var67] & 0x2) != 0 || (this.field1278[var5][var58][var67] & 0x10) == 0 && this.method481(true, var5, var58, var67) == field1275)) {
                            if (var5 < field1262) {
                                field1262 = var5;
                            }
                            int var70 = this.field1271[var5][var58][var67] & 0xFF;
                            int var71 = this.field1260[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1286[var5][var58][var67];
                                int var73 = this.field1286[var5][var58 + 1][var67];
                                int var74 = this.field1286[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1286[var5][var58][var67 + 1];
                                int var76 = this.field1267[var58][var67];
                                int var77 = this.field1267[var58 + 1][var67];
                                int var78 = this.field1267[var58 + 1][var67 + 1];
                                int var79 = this.field1267[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method482(var82, var83, var84);
                                    int var85 = field1279 + var82 & 0xFF;
                                    int var86 = field1265 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method482(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1289[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class10.field702[var71 - 1].field707) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1270[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class8.field678[method493(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method20(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method493(var80, var76), method493(var80, var77), method493(var80, var78), method493(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1289[var5][var58][var67] + 1;
                                    byte var90 = this.field1266[var5][var58][var67];
                                    class10 var91 = class10.field702[var71 - 1];
                                    int var92 = var91.field705;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class8.method229(var92, 0);
                                        var94 = -1;
                                    } else if (var91.field704 == 16711935) {
                                        var93 = 0;
                                        var94 = -2;
                                        var92 = -1;
                                    } else {
                                        var94 = this.method482(var91.field708, var91.field709, var91.field710);
                                        var93 = class8.field678[this.method480(var91.field713, 96)];
                                    }
                                    arg0.method20(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method493(var80, var76), method493(var80, var77), method493(var80, var78), method493(var80, var79), this.method480(var94, var76), this.method480(var94, var77), this.method480(var94, var78), this.method480(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1264 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1263 - 1; var60++) {
                    arg0.method19(var5, var60, var59, this.method481(true, var5, var60, var59));
                }
            }
        }
        if (arg2 >= 0) {
            return;
        }
        arg0.method46(-50, -50, 64, -10, 0, 768);
        for (int var6 = 0; var6 < this.field1263; var6++) {
            for (int var47 = 0; var47 < this.field1264; var47++) {
                if ((this.field1278[1][var6][var47] & 0x2) == 2) {
                    arg0.method17(this.field1269, var47, var6);
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
                for (int var12 = 0; var12 <= this.field1264; var12++) {
                    for (int var13 = 0; var13 <= this.field1263; var13++) {
                        if ((this.field1270[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1270[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1264 && (this.field1270[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label330: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1270[var16 - 1][var13][var18] & var7) == 0) {
                                        break label330;
                                    }
                                }
                                var16--;
                            }
                            label319: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1270[var17 + 1][var13][var19] & var7) == 0) {
                                        break label319;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 - var14 + 1);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1286[var17][var13][var14] - var21;
                                int var23 = this.field1286[var16][var13][var14];
                                class4.method18(var15 * 128 + 128, var23, (byte) 22, var14 * 128, var13 * 128, 1, var22, var13 * 128, var10);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1270[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1270[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1270[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1263 && (this.field1270[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label383: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1270[var28 - 1][var30][var12] & var8) == 0) {
                                        break label383;
                                    }
                                }
                                var28--;
                            }
                            label372: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1270[var29 + 1][var31][var12] & var8) == 0) {
                                        break label372;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 - var26 + 1);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1286[var29][var26][var12] - var33;
                                int var35 = this.field1286[var28][var26][var12];
                                class4.method18(var12 * 128, var35, (byte) 22, var12 * 128, var26 * 128, 2, var34, var27 * 128 + 128, var10);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1270[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1270[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1270[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1264 && (this.field1270[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label436: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1270[var11][var38 - 1][var42] & var9) == 0) {
                                        break label436;
                                    }
                                }
                                var38--;
                            }
                            label425: while (var39 < this.field1263) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1270[var11][var39 + 1][var43] & var9) == 0) {
                                        break label425;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 - var40 + 1) >= 4) {
                                int var44 = this.field1286[var11][var38][var40];
                                class4.method18(var41 * 128 + 128, var44, (byte) 22, var40 * 128, var38 * 128, 4, var44, var39 * 128 + 128, var10);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1270[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(II)I")
    private static final int method478(int arg0, int arg1) {
        int var2 = method483(arg0 + 45365, arg1 + 91923, 4) + (method483(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method483(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }

    @OriginalMember(owner = "PTERWXXU", name = "<init>", descriptor = "(B[[[BII[[[I)V")
    public class46(byte arg0, byte[][][] arg1, int arg2, int arg3, int[][][] arg4) {
        field1262 = 99;
        this.field1263 = arg3;
        this.field1264 = arg2;
        this.field1286 = arg4;
        this.field1278 = arg1;
        this.field1271 = new byte[4][this.field1263][this.field1264];
        this.field1260 = new byte[4][this.field1263][this.field1264];
        this.field1289 = new byte[4][this.field1263][this.field1264];
        this.field1266 = new byte[4][this.field1263][this.field1264];
        this.field1270 = new int[4][this.field1263 + 1][this.field1264 + 1];
        this.field1261 = new byte[4][this.field1263 + 1][this.field1264 + 1];
        this.field1267 = new int[this.field1263 + 1][this.field1264 + 1];
        this.field1281 = new int[this.field1264];
        this.field1282 = new int[this.field1264];
        if (arg0 != 98) {
            this.field1288 = 120;
        }
        this.field1283 = new int[this.field1264];
        this.field1284 = new int[this.field1264];
        this.field1285 = new int[this.field1264];
    }

    @OriginalMember(owner = "PTERWXXU", name = "b", descriptor = "(II)I")
    private static final int method479(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "PTERWXXU", name = "c", descriptor = "(II)I")
    private final int method480(int arg0, int arg1) {
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

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(ZIII)I")
    public int method481(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field1280 = !field1280;
        }
        if ((this.field1278[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (this.field1278[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(III)I")
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

    @OriginalMember(owner = "PTERWXXU", name = "b", descriptor = "(III)I")
    private static final int method483(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method492(var3, var5);
        int var8 = method492(var3 + 1, var5);
        int var9 = method492(var3, var5 + 1);
        int var10 = method492(var3 + 1, var5 + 1);
        int var11 = method484(var7, var8, var4, arg2);
        int var12 = method484(var9, var10, var4, arg2);
        return method484(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(IIII)I")
    private static final int method484(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class8.field667[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(IILKHOMSBHW;IIIII)V")
    private final void method485(int arg0, int arg1, class30 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        while (arg6 >= 0) {
            field1280 = !field1280;
        }
        if (arg7 < 0 || arg7 >= 104 || arg5 < 0 || arg5 >= 104) {
            while (true) {
                int var11 = arg2.method349();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg2.method349();
                    return;
                }
                if (var11 <= 49) {
                    arg2.method349();
                }
            }
        }
        this.field1278[arg0][arg7][arg5] = 0;
        while (true) {
            int var9 = arg2.method349();
            if (var9 == 0) {
                if (arg0 == 0) {
                    this.field1286[0][arg7][arg5] = -method478(arg7 + arg1 + 932731, arg5 + 556238 + arg4) * 8;
                    return;
                } else {
                    this.field1286[arg0][arg7][arg5] = this.field1286[arg0 - 1][arg7][arg5] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg2.method349();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg0 == 0) {
                    this.field1286[0][arg7][arg5] = -var10 * 8;
                    return;
                }
                this.field1286[arg0][arg7][arg5] = this.field1286[arg0 - 1][arg7][arg5] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1260[arg0][arg7][arg5] = arg2.method350();
                this.field1289[arg0][arg7][arg5] = (byte) ((var9 - 2) / 4);
                this.field1266[arg0][arg7][arg5] = (byte) (var9 + arg3 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1278[arg0][arg7][arg5] = (byte) (var9 - 49);
            } else {
                this.field1271[arg0][arg7][arg5] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "([[[IZLDFJABDHX;IIILBGNYQYNO;IIII)V")
    public static final void method486(int[][][] arg0, boolean arg1, class5 arg2, int arg3, int arg4, int arg5, class4 arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg0[arg5][arg10][arg3];
        int var12 = arg0[arg5][arg10 + 1][arg3];
        if (!arg1) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = arg0[arg5][arg10 + 1][arg3 + 1];
        int var15 = arg0[arg5][arg10][arg3 + 1];
        int var16 = var11 + var12 + var14 + var15 >> 2;
        class50 var17 = class50.method512(arg4);
        int var18 = (arg4 << 14) + (arg3 << 7) + arg10 + 1073741824;
        if (!var17.field1347) {
            var18 += Integer.MIN_VALUE;
        }
        byte var19 = (byte) ((arg9 << 6) + arg7);
        if (arg7 == 22) {
            class6 var20;
            if (var17.field1346 == -1 && var17.field1352 == null) {
                var20 = var17.method505(22, arg9, var11, var12, var14, var15, -1);
            } else {
                var20 = new class56(arg4, 22, var11, var15, var14, var12, true, arg9, (byte) 6, var17.field1346);
            }
            arg6.method21(arg8, var18, var19, var20, arg3, var16, -100, arg10);
            if (var17.field1364 && var17.field1347) {
                arg2.method211((byte) 41, arg10, arg3);
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class6 var40;
            if (var17.field1346 == -1 && var17.field1352 == null) {
                var40 = var17.method505(10, arg9, var11, var12, var14, var15, -1);
            } else {
                var40 = new class56(arg4, 10, var11, var15, var14, var12, true, arg9, (byte) 6, var17.field1346);
            }
            if (var40 != null) {
                int var41 = 0;
                if (arg7 == 11) {
                    var41 += 256;
                }
                int var42;
                int var43;
                if (arg9 == 1 || arg9 == 3) {
                    var42 = var17.field1365;
                    var43 = var17.field1358;
                } else {
                    var42 = var17.field1358;
                    var43 = var17.field1365;
                }
                arg6.method25(var41, arg10, arg8, 1, var16, var42, var43, var40, arg3, var18, var19);
            }
            if (var17.field1364) {
                arg2.method210(arg3, var17.field1348, 0, arg10, arg9, var17.field1358, var17.field1365);
            }
        } else if (arg7 >= 12) {
            class6 var21;
            if (var17.field1346 == -1 && var17.field1352 == null) {
                var21 = var17.method505(arg7, arg9, var11, var12, var14, var15, -1);
            } else {
                var21 = new class56(arg4, arg7, var11, var15, var14, var12, true, arg9, (byte) 6, var17.field1346);
            }
            arg6.method25(0, arg10, arg8, 1, var16, 1, 1, var21, arg3, var18, var19);
            if (var17.field1364) {
                arg2.method210(arg3, var17.field1348, 0, arg10, arg9, var17.field1358, var17.field1365);
            }
        } else if (arg7 == 0) {
            class6 var22;
            if (var17.field1346 == -1 && var17.field1352 == null) {
                var22 = var17.method505(0, arg9, var11, var12, var14, var15, -1);
            } else {
                var22 = new class56(arg4, 0, var11, var15, var14, var12, true, arg9, (byte) 6, var17.field1346);
            }
            arg6.method23(0, arg3, 5834, var18, field1274[arg9], var19, arg10, arg8, null, var22, var16);
            if (var17.field1364) {
                arg2.method209(arg7, var17.field1348, arg9, false, arg3, arg10);
            }
        } else if (arg7 == 1) {
            class6 var23;
            if (var17.field1346 == -1 && var17.field1352 == null) {
                var23 = var17.method505(1, arg9, var11, var12, var14, var15, -1);
            } else {
                var23 = new class56(arg4, 1, var11, var15, var14, var12, true, arg9, (byte) 6, var17.field1346);
            }
            arg6.method23(0, arg3, 5834, var18, field1273[arg9], var19, arg10, arg8, null, var23, var16);
            if (var17.field1364) {
                arg2.method209(arg7, var17.field1348, arg9, false, arg3, arg10);
            }
        } else if (arg7 == 2) {
            int var24 = arg9 + 1 & 0x3;
            class6 var25;
            class6 var26;
            if (var17.field1346 == -1 && var17.field1352 == null) {
                var25 = var17.method505(2, arg9 + 4, var11, var12, var14, var15, -1);
                var26 = var17.method505(2, var24, var11, var12, var14, var15, -1);
            } else {
                var25 = new class56(arg4, 2, var11, var15, var14, var12, true, arg9 + 4, (byte) 6, var17.field1346);
                var26 = new class56(arg4, 2, var11, var15, var14, var12, true, var24, (byte) 6, var17.field1346);
            }
            arg6.method23(field1274[var24], arg3, 5834, var18, field1274[arg9], var19, arg10, arg8, var26, var25, var16);
            if (var17.field1364) {
                arg2.method209(arg7, var17.field1348, arg9, false, arg3, arg10);
            }
        } else if (arg7 == 3) {
            class6 var27;
            if (var17.field1346 == -1 && var17.field1352 == null) {
                var27 = var17.method505(3, arg9, var11, var12, var14, var15, -1);
            } else {
                var27 = new class56(arg4, 3, var11, var15, var14, var12, true, arg9, (byte) 6, var17.field1346);
            }
            arg6.method23(0, arg3, 5834, var18, field1273[arg9], var19, arg10, arg8, null, var27, var16);
            if (var17.field1364) {
                arg2.method209(arg7, var17.field1348, arg9, false, arg3, arg10);
            }
        } else if (arg7 == 9) {
            class6 var28;
            if (var17.field1346 == -1 && var17.field1352 == null) {
                var28 = var17.method505(arg7, arg9, var11, var12, var14, var15, -1);
            } else {
                var28 = new class56(arg4, arg7, var11, var15, var14, var12, true, arg9, (byte) 6, var17.field1346);
            }
            arg6.method25(0, arg10, arg8, 1, var16, 1, 1, var28, arg3, var18, var19);
            if (var17.field1364) {
                arg2.method210(arg3, var17.field1348, 0, arg10, arg9, var17.field1358, var17.field1365);
            }
        } else {
            if (var17.field1366) {
                if (arg9 == 1) {
                    int var29 = var15;
                    var15 = var14;
                    var14 = var12;
                    var12 = var11;
                    var11 = var29;
                } else if (arg9 == 2) {
                    int var30 = var15;
                    var15 = var12;
                    var12 = var30;
                    int var31 = var14;
                    var14 = var11;
                    var11 = var31;
                } else if (arg9 == 3) {
                    int var32 = var15;
                    var15 = var11;
                    var11 = var12;
                    var12 = var14;
                    var14 = var32;
                }
            }
            if (arg7 == 4) {
                class6 var33;
                if (var17.field1346 == -1 && var17.field1352 == null) {
                    var33 = var17.method505(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var33 = new class56(arg4, 4, var11, var15, var14, var12, true, 0, (byte) 6, var17.field1346);
                }
                arg6.method24(0, var18, var16, arg9 * 512, 0, var19, arg8, 39237, var33, arg3, field1274[arg9], arg10);
            } else if (arg7 == 5) {
                int var34 = 16;
                int var35 = arg6.method41(arg8, arg10, arg3);
                if (var35 > 0) {
                    var34 = class50.method512(var35 >> 14 & 0x7FFF).field1314;
                }
                class6 var36;
                if (var17.field1346 == -1 && var17.field1352 == null) {
                    var36 = var17.method505(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var36 = new class56(arg4, 4, var11, var15, var14, var12, true, 0, (byte) 6, var17.field1346);
                }
                arg6.method24(field1287[arg9] * var34, var18, var16, arg9 * 512, field1272[arg9] * var34, var19, arg8, 39237, var36, arg3, field1274[arg9], arg10);
            } else if (arg7 == 6) {
                class6 var37;
                if (var17.field1346 == -1 && var17.field1352 == null) {
                    var37 = var17.method505(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var37 = new class56(arg4, 4, var11, var15, var14, var12, true, 0, (byte) 6, var17.field1346);
                }
                arg6.method24(0, var18, var16, arg9, 0, var19, arg8, 39237, var37, arg3, 256, arg10);
            } else if (arg7 == 7) {
                class6 var38;
                if (var17.field1346 == -1 && var17.field1352 == null) {
                    var38 = var17.method505(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var38 = new class56(arg4, 4, var11, var15, var14, var12, true, 0, (byte) 6, var17.field1346);
                }
                arg6.method24(0, var18, var16, arg9, 0, var19, arg8, 39237, var38, arg3, 512, arg10);
            } else if (arg7 == 8) {
                class6 var39;
                if (var17.field1346 == -1 && var17.field1352 == null) {
                    var39 = var17.method505(4, 0, var11, var12, var14, var15, -1);
                } else {
                    var39 = new class56(arg4, 4, var11, var15, var14, var12, true, 0, (byte) 6, var17.field1346);
                }
                arg6.method24(0, var18, var16, arg9, 0, var19, arg8, 39237, var39, arg3, 768, arg10);
            }
        }
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(IZII[LDFJABDHX;I[B)V")
    public final void method487(int arg0, boolean arg1, int arg2, int arg3, class5[] arg4, int arg5, byte[] arg6) {
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg2 + var14 > 0 && arg2 + var14 < 103 && arg5 + var15 > 0 && arg5 + var15 < 103) {
                        arg4[var8].field636[arg2 + var14][arg5 + var15] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class30 var9 = new class30(arg6, -982);
        if (!arg1) {
            for (int var10 = 1; var10 > 0; var10++) {
            }
        }
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    this.method485(var11, arg3, var9, 0, arg0, arg5 + var13, this.field1276, arg2 + var12);
                }
            }
        }
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(BII)Z")
    public static final boolean method488(byte arg0, int arg1, int arg2) {
        if (field1277 != arg0) {
            field1280 = !field1280;
        }
        class50 var3 = class50.method512(arg2);
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method515((byte) 8, arg1);
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(IIIII)V")
    public final void method489(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg2; var6 <= arg0 + arg2; var6++) {
            for (int var8 = arg1; var8 <= arg1 + arg4; var8++) {
                if (var8 >= 0 && var8 < this.field1263 && var6 >= 0 && var6 < this.field1264) {
                    this.field1261[0][var8][var6] = 127;
                    if (arg1 == var8 && var8 > 0) {
                        this.field1286[0][var8][var6] = this.field1286[0][var8 - 1][var6];
                    }
                    if (arg1 + arg4 == var8 && var8 < this.field1263 - 1) {
                        this.field1286[0][var8][var6] = this.field1286[0][var8 + 1][var6];
                    }
                    if (arg2 == var6 && var6 > 0) {
                        this.field1286[0][var8][var6] = this.field1286[0][var8][var6 - 1];
                    }
                    if (arg0 + arg2 == var6 && var6 < this.field1264 - 1) {
                        this.field1286[0][var8][var6] = this.field1286[0][var8][var6 + 1];
                    }
                }
            }
        }
        int var7 = 64 / arg3;
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(ILDFJABDHX;LBGNYQYNO;IIIIII)V")
    private final void method490(int arg0, class5 arg1, class4 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (field1268 && (this.field1278[0][arg6][arg3] & 0x2) == 0) {
            if ((this.field1278[arg0][arg6][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method481(true, arg0, arg6, arg3) != field1275) {
                return;
            }
        }
        if (arg0 < field1262) {
            field1262 = arg0;
        }
        int var10 = this.field1286[arg0][arg6][arg3];
        int var11 = this.field1286[arg0][arg6 + 1][arg3];
        int var12 = this.field1286[arg0][arg6 + 1][arg3 + 1];
        int var13 = this.field1286[arg0][arg6][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        if (arg5 != -29430) {
            return;
        }
        class50 var15 = class50.method512(arg8);
        int var16 = (arg8 << 14) + (arg3 << 7) + arg6 + 1073741824;
        if (!var15.field1347) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg4 << 6) + arg7);
        if (arg7 == 22) {
            if (!field1268 || var15.field1347 || var15.field1362) {
                class6 var18;
                if (var15.field1346 == -1 && var15.field1352 == null) {
                    var18 = var15.method505(22, arg4, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class56(arg8, 22, var10, var13, var12, var11, true, arg4, (byte) 6, var15.field1346);
                }
                arg2.method21(arg0, var16, var17, var18, arg3, var14, -100, arg6);
                if (var15.field1364 && var15.field1347 && arg1 != null) {
                    arg1.method211((byte) 41, arg6, arg3);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class6 var38;
            if (var15.field1346 == -1 && var15.field1352 == null) {
                var38 = var15.method505(10, arg4, var10, var11, var12, var13, -1);
            } else {
                var38 = new class56(arg8, 10, var10, var13, var12, var11, true, arg4, (byte) 6, var15.field1346);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg7 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg4 == 1 || arg4 == 3) {
                    var40 = var15.field1365;
                    var41 = var15.field1358;
                } else {
                    var40 = var15.field1358;
                    var41 = var15.field1365;
                }
                if (arg2.method25(var39, arg6, arg0, 1, var14, var40, var41, var38, arg3, var16, var17) && var15.field1367) {
                    class17 var42;
                    if (var38 instanceof class17) {
                        var42 = (class17) var38;
                    } else {
                        var42 = var15.method505(10, arg4, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field836 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1261[arg0][arg6 + var43][arg3 + var44]) {
                                    this.field1261[arg0][arg6 + var43][arg3 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1364 && arg1 != null) {
                arg1.method210(arg3, var15.field1348, 0, arg6, arg4, var15.field1358, var15.field1365);
            }
        } else if (arg7 >= 12) {
            class6 var19;
            if (var15.field1346 == -1 && var15.field1352 == null) {
                var19 = var15.method505(arg7, arg4, var10, var11, var12, var13, -1);
            } else {
                var19 = new class56(arg8, arg7, var10, var13, var12, var11, true, arg4, (byte) 6, var15.field1346);
            }
            arg2.method25(0, arg6, arg0, 1, var14, 1, 1, var19, arg3, var16, var17);
            if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg0 > 0) {
                this.field1270[arg0][arg6][arg3] |= 0x924;
            }
            if (var15.field1364 && arg1 != null) {
                arg1.method210(arg3, var15.field1348, 0, arg6, arg4, var15.field1358, var15.field1365);
            }
        } else if (arg7 == 0) {
            class6 var20;
            if (var15.field1346 == -1 && var15.field1352 == null) {
                var20 = var15.method505(0, arg4, var10, var11, var12, var13, -1);
            } else {
                var20 = new class56(arg8, 0, var10, var13, var12, var11, true, arg4, (byte) 6, var15.field1346);
            }
            arg2.method23(0, arg3, 5834, var16, field1274[arg4], var17, arg6, arg0, null, var20, var14);
            if (arg4 == 0) {
                if (var15.field1367) {
                    this.field1261[arg0][arg6][arg3] = 50;
                    this.field1261[arg0][arg6][arg3 + 1] = 50;
                }
                if (var15.field1355) {
                    this.field1270[arg0][arg6][arg3] |= 0x249;
                }
            } else if (arg4 == 1) {
                if (var15.field1367) {
                    this.field1261[arg0][arg6][arg3 + 1] = 50;
                    this.field1261[arg0][arg6 + 1][arg3 + 1] = 50;
                }
                if (var15.field1355) {
                    this.field1270[arg0][arg6][arg3 + 1] |= 0x492;
                }
            } else if (arg4 == 2) {
                if (var15.field1367) {
                    this.field1261[arg0][arg6 + 1][arg3] = 50;
                    this.field1261[arg0][arg6 + 1][arg3 + 1] = 50;
                }
                if (var15.field1355) {
                    this.field1270[arg0][arg6 + 1][arg3] |= 0x249;
                }
            } else if (arg4 == 3) {
                if (var15.field1367) {
                    this.field1261[arg0][arg6][arg3] = 50;
                    this.field1261[arg0][arg6 + 1][arg3] = 50;
                }
                if (var15.field1355) {
                    this.field1270[arg0][arg6][arg3] |= 0x492;
                }
            }
            if (var15.field1364 && arg1 != null) {
                arg1.method209(arg7, var15.field1348, arg4, false, arg3, arg6);
            }
            if (var15.field1314 != 16) {
                arg2.method31(arg0, true, var15.field1314, arg3, arg6);
            }
        } else if (arg7 == 1) {
            class6 var21;
            if (var15.field1346 == -1 && var15.field1352 == null) {
                var21 = var15.method505(1, arg4, var10, var11, var12, var13, -1);
            } else {
                var21 = new class56(arg8, 1, var10, var13, var12, var11, true, arg4, (byte) 6, var15.field1346);
            }
            arg2.method23(0, arg3, 5834, var16, field1273[arg4], var17, arg6, arg0, null, var21, var14);
            if (var15.field1367) {
                if (arg4 == 0) {
                    this.field1261[arg0][arg6][arg3 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field1261[arg0][arg6 + 1][arg3 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field1261[arg0][arg6 + 1][arg3] = 50;
                } else if (arg4 == 3) {
                    this.field1261[arg0][arg6][arg3] = 50;
                }
            }
            if (var15.field1364 && arg1 != null) {
                arg1.method209(arg7, var15.field1348, arg4, false, arg3, arg6);
            }
        } else if (arg7 == 2) {
            int var22 = arg4 + 1 & 0x3;
            class6 var23;
            class6 var24;
            if (var15.field1346 == -1 && var15.field1352 == null) {
                var23 = var15.method505(2, arg4 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method505(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class56(arg8, 2, var10, var13, var12, var11, true, arg4 + 4, (byte) 6, var15.field1346);
                var24 = new class56(arg8, 2, var10, var13, var12, var11, true, var22, (byte) 6, var15.field1346);
            }
            arg2.method23(field1274[var22], arg3, 5834, var16, field1274[arg4], var17, arg6, arg0, var24, var23, var14);
            if (var15.field1355) {
                if (arg4 == 0) {
                    this.field1270[arg0][arg6][arg3] |= 0x249;
                    this.field1270[arg0][arg6][arg3 + 1] |= 0x492;
                } else if (arg4 == 1) {
                    this.field1270[arg0][arg6][arg3 + 1] |= 0x492;
                    this.field1270[arg0][arg6 + 1][arg3] |= 0x249;
                } else if (arg4 == 2) {
                    this.field1270[arg0][arg6 + 1][arg3] |= 0x249;
                    this.field1270[arg0][arg6][arg3] |= 0x492;
                } else if (arg4 == 3) {
                    this.field1270[arg0][arg6][arg3] |= 0x492;
                    this.field1270[arg0][arg6][arg3] |= 0x249;
                }
            }
            if (var15.field1364 && arg1 != null) {
                arg1.method209(arg7, var15.field1348, arg4, false, arg3, arg6);
            }
            if (var15.field1314 != 16) {
                arg2.method31(arg0, true, var15.field1314, arg3, arg6);
            }
        } else if (arg7 == 3) {
            class6 var25;
            if (var15.field1346 == -1 && var15.field1352 == null) {
                var25 = var15.method505(3, arg4, var10, var11, var12, var13, -1);
            } else {
                var25 = new class56(arg8, 3, var10, var13, var12, var11, true, arg4, (byte) 6, var15.field1346);
            }
            arg2.method23(0, arg3, 5834, var16, field1273[arg4], var17, arg6, arg0, null, var25, var14);
            if (var15.field1367) {
                if (arg4 == 0) {
                    this.field1261[arg0][arg6][arg3 + 1] = 50;
                } else if (arg4 == 1) {
                    this.field1261[arg0][arg6 + 1][arg3 + 1] = 50;
                } else if (arg4 == 2) {
                    this.field1261[arg0][arg6 + 1][arg3] = 50;
                } else if (arg4 == 3) {
                    this.field1261[arg0][arg6][arg3] = 50;
                }
            }
            if (var15.field1364 && arg1 != null) {
                arg1.method209(arg7, var15.field1348, arg4, false, arg3, arg6);
            }
        } else if (arg7 == 9) {
            class6 var26;
            if (var15.field1346 == -1 && var15.field1352 == null) {
                var26 = var15.method505(arg7, arg4, var10, var11, var12, var13, -1);
            } else {
                var26 = new class56(arg8, arg7, var10, var13, var12, var11, true, arg4, (byte) 6, var15.field1346);
            }
            arg2.method25(0, arg6, arg0, 1, var14, 1, 1, var26, arg3, var16, var17);
            if (var15.field1364 && arg1 != null) {
                arg1.method210(arg3, var15.field1348, 0, arg6, arg4, var15.field1358, var15.field1365);
            }
        } else {
            if (var15.field1366) {
                if (arg4 == 1) {
                    int var27 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var27;
                } else if (arg4 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg4 == 3) {
                    int var30 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var30;
                }
            }
            if (arg7 == 4) {
                class6 var31;
                if (var15.field1346 == -1 && var15.field1352 == null) {
                    var31 = var15.method505(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class56(arg8, 4, var10, var13, var12, var11, true, 0, (byte) 6, var15.field1346);
                }
                arg2.method24(0, var16, var14, arg4 * 512, 0, var17, arg0, 39237, var31, arg3, field1274[arg4], arg6);
            } else if (arg7 == 5) {
                int var32 = 16;
                int var33 = arg2.method41(arg0, arg6, arg3);
                if (var33 > 0) {
                    var32 = class50.method512(var33 >> 14 & 0x7FFF).field1314;
                }
                class6 var34;
                if (var15.field1346 == -1 && var15.field1352 == null) {
                    var34 = var15.method505(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class56(arg8, 4, var10, var13, var12, var11, true, 0, (byte) 6, var15.field1346);
                }
                arg2.method24(field1287[arg4] * var32, var16, var14, arg4 * 512, field1272[arg4] * var32, var17, arg0, 39237, var34, arg3, field1274[arg4], arg6);
            } else if (arg7 == 6) {
                class6 var35;
                if (var15.field1346 == -1 && var15.field1352 == null) {
                    var35 = var15.method505(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class56(arg8, 4, var10, var13, var12, var11, true, 0, (byte) 6, var15.field1346);
                }
                arg2.method24(0, var16, var14, arg4, 0, var17, arg0, 39237, var35, arg3, 256, arg6);
            } else if (arg7 == 7) {
                class6 var36;
                if (var15.field1346 == -1 && var15.field1352 == null) {
                    var36 = var15.method505(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class56(arg8, 4, var10, var13, var12, var11, true, 0, (byte) 6, var15.field1346);
                }
                arg2.method24(0, var16, var14, arg4, 0, var17, arg0, 39237, var36, arg3, 512, arg6);
            } else if (arg7 == 8) {
                class6 var37;
                if (var15.field1346 == -1 && var15.field1352 == null) {
                    var37 = var15.method505(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class56(arg8, 4, var10, var13, var12, var11, true, 0, (byte) 6, var15.field1346);
                }
                arg2.method24(0, var16, var14, arg4, 0, var17, arg0, 39237, var37, arg3, 768, arg6);
            }
        }
    }

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(IIIIIIII[LDFJABDHX;[B)V")
    public final void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class5[] arg8, byte[] arg9) {
        if (arg7 != 0) {
            this.field1276 = 487;
        }
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg4 + var11 > 0 && arg4 + var11 < 103 && arg1 + var16 > 0 && arg1 + var16 < 103) {
                    arg8[arg0].field636[arg4 + var11][arg1 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class30 var12 = new class30(arg9, -982);
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg5 == var13 && var14 >= arg6 && var14 < arg6 + 8 && var15 >= arg3 && var15 < arg3 + 8) {
                        this.method485(arg0, 0, var12, arg2, 0, arg1 + class66.method589(var15 & 0x7, var14 & 0x7, 575, arg2), this.field1276, arg4 + class66.method588(arg2, var15 & 0x7, var14 & 0x7, (byte) 7));
                    } else {
                        this.method485(0, 0, var12, 0, 0, -1, this.field1276, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "PTERWXXU", name = "d", descriptor = "(II)I")
    private static final int method492(int arg0, int arg1) {
        int var2 = method479(arg0 - 1, arg1 - 1) + method479(arg0 + 1, arg1 - 1) + method479(arg0 - 1, arg1 + 1) + method479(arg0 + 1, arg1 + 1);
        int var3 = method479(arg0 - 1, arg1) + method479(arg0 + 1, arg1) + method479(arg0, arg1 - 1) + method479(arg0, arg1 + 1);
        int var4 = method479(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "PTERWXXU", name = "e", descriptor = "(II)I")
    private static final int method493(int arg0, int arg1) {
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

    @OriginalMember(owner = "PTERWXXU", name = "a", descriptor = "(LKHOMSBHW;BLSSXXGGTR;)V")
    public static final void method494(class30 arg0, byte arg1, class54 arg2) {
        int var3 = -1;
        if (arg1 != 4) {
            field1280 = !field1280;
        }
        while (true) {
            int var4 = arg0.method363();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class50 var5 = class50.method512(var3);
            var5.method513(arg2, true);
            while (true) {
                int var6 = arg0.method363();
                if (var6 == 0) {
                    break;
                }
                arg0.method349();
            }
        }
    }
}
