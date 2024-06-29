import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!XTTZZRNP")
public class class65 {

    @OriginalMember(owner = "client!XTTZZRNP", name = "l", descriptor = "B")
    private byte field1655 = 82;

    @OriginalMember(owner = "client!XTTZZRNP", name = "z", descriptor = "I")
    private int field1669 = 1;

    @OriginalMember(owner = "client!XTTZZRNP", name = "C", descriptor = "Z")
    private boolean field1672 = true;

    @OriginalMember(owner = "client!XTTZZRNP", name = "t", descriptor = "I")
    private int field1663;

    @OriginalMember(owner = "client!XTTZZRNP", name = "u", descriptor = "I")
    private int field1664;

    @OriginalMember(owner = "client!XTTZZRNP", name = "j", descriptor = "[[[I")
    private int[][][] field1653;

    @OriginalMember(owner = "client!XTTZZRNP", name = "c", descriptor = "[[[B")
    private byte[][][] field1646;

    @OriginalMember(owner = "client!XTTZZRNP", name = "b", descriptor = "[[[B")
    private byte[][][] field1645;

    @OriginalMember(owner = "client!XTTZZRNP", name = "B", descriptor = "[[[B")
    private byte[][][] field1671;

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "[[[B")
    private byte[][][] field1644;

    @OriginalMember(owner = "client!XTTZZRNP", name = "A", descriptor = "[[[B")
    private byte[][][] field1670;

    @OriginalMember(owner = "client!XTTZZRNP", name = "k", descriptor = "[[[I")
    private int[][][] field1654;

    @OriginalMember(owner = "client!XTTZZRNP", name = "x", descriptor = "[[[B")
    private byte[][][] field1667;

    @OriginalMember(owner = "client!XTTZZRNP", name = "f", descriptor = "[[I")
    private int[][] field1649;

    @OriginalMember(owner = "client!XTTZZRNP", name = "n", descriptor = "[I")
    private int[] field1657;

    @OriginalMember(owner = "client!XTTZZRNP", name = "o", descriptor = "[I")
    private int[] field1658;

    @OriginalMember(owner = "client!XTTZZRNP", name = "p", descriptor = "[I")
    private int[] field1659;

    @OriginalMember(owner = "client!XTTZZRNP", name = "q", descriptor = "[I")
    private int[] field1660;

    @OriginalMember(owner = "client!XTTZZRNP", name = "r", descriptor = "[I")
    private int[] field1661;

    @OriginalMember(owner = "client!XTTZZRNP", name = "d", descriptor = "I")
    private static int field1647 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!XTTZZRNP", name = "e", descriptor = "Z")
    public static boolean field1648 = true;

    @OriginalMember(owner = "client!XTTZZRNP", name = "g", descriptor = "[I")
    private static final int[] field1650 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!XTTZZRNP", name = "h", descriptor = "[I")
    private static final int[] field1651 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!XTTZZRNP", name = "m", descriptor = "[I")
    private static final int[] field1656 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!XTTZZRNP", name = "s", descriptor = "I")
    public static int field1662 = 99;

    @OriginalMember(owner = "client!XTTZZRNP", name = "v", descriptor = "B")
    private static byte field1665 = 44;

    @OriginalMember(owner = "client!XTTZZRNP", name = "w", descriptor = "[I")
    private static final int[] field1666 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!XTTZZRNP", name = "y", descriptor = "I")
    private static int field1668 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!XTTZZRNP", name = "i", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIIB)I")
    public int method562(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 8) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if ((this.field1646[arg2][arg0][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (this.field1646[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIIII)V")
    public final void method563(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var6 = arg0; var6 <= arg0 + arg2; var6++) {
            for (int var7 = arg3; var7 <= arg3 + arg4; var7++) {
                if (var7 >= 0 && var7 < this.field1663 && var6 >= 0 && var6 < this.field1664) {
                    this.field1667[0][var7][var6] = 127;
                    if (arg3 == var7 && var7 > 0) {
                        this.field1653[0][var7][var6] = this.field1653[0][var7 - 1][var6];
                    }
                    if (arg3 + arg4 == var7 && var7 < this.field1663 - 1) {
                        this.field1653[0][var7][var6] = this.field1653[0][var7 + 1][var6];
                    }
                    if (arg0 == var6 && var6 > 0) {
                        this.field1653[0][var7][var6] = this.field1653[0][var7][var6 - 1];
                    }
                    if (arg0 + arg2 == var6 && var6 < this.field1664 - 1) {
                        this.field1653[0][var7][var6] = this.field1653[0][var7][var6 + 1];
                    }
                }
            }
        }
        if (arg1 != 33376) {
            this.field1672 = !this.field1672;
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(I[BZLHFSXIPFN;[LEKHWFCYP;I)V")
    public final void method564(int arg0, byte[] arg1, boolean arg2, class23 arg3, class14[] arg4, int arg5) {
        if (!arg2) {
            this.field1672 = !this.field1672;
        }
        class37 var7 = new class37(arg1, -670);
        int var8 = -1;
        while (true) {
            int var9 = var7.method400();
            if (var9 == 0) {
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method400();
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method386();
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg5 + var13;
                int var19 = arg0 + var12;
                if (var18 > 0 && var19 > 0 && var18 < 103 && var19 < 103) {
                    int var20 = var14;
                    if ((this.field1646[1][var18][var19] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    class14 var21 = null;
                    if (var20 >= 0) {
                        var21 = arg4[var20];
                    }
                    this.method569(-194, var8, var16, var19, var21, var18, var17, arg3, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(II[B[LEKHWFCYP;III)V")
    public final void method565(int arg0, int arg1, byte[] arg2, class14[] arg3, int arg4, int arg5, int arg6) {
        if (arg4 < 1 || arg4 > 1) {
            this.field1672 = !this.field1672;
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var13 = 0; var13 < 64; var13++) {
                for (int var14 = 0; var14 < 64; var14++) {
                    if (arg0 + var13 > 0 && arg0 + var13 < 103 && arg6 + var14 > 0 && arg6 + var14 < 103) {
                        arg3[var8].field663[arg0 + var13][arg6 + var14] &= 0xFEFFFFFF;
                    }
                }
            }
        }
        class37 var9 = new class37(arg2, -670);
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var11 = 0; var11 < 64; var11++) {
                for (int var12 = 0; var12 < 64; var12++) {
                    this.method566(var10, arg1, false, arg6 + var12, 0, arg5, var9, arg0 + var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIZIIILMNKDCXXG;I)V")
    private final void method566(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class37 arg6, int arg7) {
        if (arg2) {
            this.field1672 = !this.field1672;
        }
        if (arg7 < 0 || arg7 >= 104 || arg3 < 0 || arg3 >= 104) {
            while (true) {
                int var11 = arg6.method386();
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg6.method386();
                    return;
                }
                if (var11 <= 49) {
                    arg6.method386();
                }
            }
        }
        this.field1646[arg0][arg7][arg3] = 0;
        while (true) {
            int var9 = arg6.method386();
            if (var9 == 0) {
                if (arg0 == 0) {
                    this.field1653[0][arg7][arg3] = -method583(arg7 + arg1 + 932731, arg3 + 556238 + arg5) * 8;
                    return;
                } else {
                    this.field1653[arg0][arg7][arg3] = this.field1653[arg0 - 1][arg7][arg3] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg6.method386();
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg0 == 0) {
                    this.field1653[0][arg7][arg3] = -var10 * 8;
                    return;
                }
                this.field1653[arg0][arg7][arg3] = this.field1653[arg0 - 1][arg7][arg3] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                this.field1671[arg0][arg7][arg3] = arg6.method387();
                this.field1644[arg0][arg7][arg3] = (byte) ((var9 - 2) / 4);
                this.field1670[arg0][arg7][arg3] = (byte) (var9 + arg4 - 2 & 0x3);
            } else if (var9 <= 81) {
                this.field1646[arg0][arg7][arg3] = (byte) (var9 - 49);
            } else {
                this.field1645[arg0][arg7][arg3] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(LHFSXIPFN;I[LEKHWFCYP;)V")
    public final void method567(class23 arg0, int arg1, class14[] arg2) {
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var110 = 0; var110 < 104; var110++) {
                for (int var111 = 0; var111 < 104; var111++) {
                    if ((this.field1646[var4][var110][var111] & 0x1) == 1) {
                        int var112 = var4;
                        if ((this.field1646[1][var110][var111] & 0x2) == 2) {
                            var112 = var4 - 1;
                        }
                        if (var112 >= 0) {
                            arg2[var112].method194(var111, var110, 32151);
                        }
                    }
                }
            }
        }
        field1647 += (int) (Math.random() * 5.0D) - 2;
        if (field1647 < -8) {
            field1647 = -8;
        }
        if (field1647 > 8) {
            field1647 = 8;
        }
        field1668 += (int) (Math.random() * 5.0D) - 2;
        if (field1668 < -16) {
            field1668 = -16;
        }
        if (field1668 > 16) {
            field1668 = 16;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            byte[][] var48 = this.field1667[var5];
            byte var49 = 96;
            short var50 = 768;
            byte var51 = -50;
            byte var52 = -10;
            byte var53 = -50;
            int var54 = (int) Math.sqrt((double) (var53 * var53 + var51 * var51 + var52 * var52));
            int var55 = var50 * var54 >> 8;
            for (int var56 = 1; var56 < this.field1664 - 1; var56++) {
                for (int var101 = 1; var101 < this.field1663 - 1; var101++) {
                    int var102 = this.field1653[var5][var101 + 1][var56] - this.field1653[var5][var101 - 1][var56];
                    int var103 = this.field1653[var5][var101][var56 + 1] - this.field1653[var5][var101][var56 - 1];
                    int var104 = (int) Math.sqrt((double) (var103 * var103 + var102 * var102 + 65536));
                    int var105 = (var102 << 8) / var104;
                    int var106 = 65536 / var104;
                    int var107 = (var103 << 8) / var104;
                    int var108 = (var53 * var107 + var51 * var105 + var52 * var106) / var55 + var49;
                    int var109 = (var48[var101][var56] >> 1) + (var48[var101][var56 + 1] >> 3) + (var48[var101][var56 - 1] >> 2) + (var48[var101 - 1][var56] >> 2) + (var48[var101 + 1][var56] >> 3);
                    this.field1649[var101][var56] = var108 - var109;
                }
            }
            for (int var57 = 0; var57 < this.field1664; var57++) {
                this.field1657[var57] = 0;
                this.field1658[var57] = 0;
                this.field1659[var57] = 0;
                this.field1660[var57] = 0;
                this.field1661[var57] = 0;
            }
            for (int var58 = -5; var58 < this.field1663 + 5; var58++) {
                for (int var61 = 0; var61 < this.field1664; var61++) {
                    int var95 = var58 + 5;
                    int var10002;
                    if (var95 >= 0 && var95 < this.field1663) {
                        int var96 = this.field1645[var5][var95][var61] & 0xFF;
                        if (var96 > 0) {
                            class13 var97 = class13.field641[var96 - 1];
                            this.field1657[var61] += var97.field650;
                            this.field1658[var61] += var97.field648;
                            this.field1659[var61] += var97.field649;
                            this.field1660[var61] += var97.field651;
                            var10002 = this.field1661[var61]++;
                        }
                    }
                    int var98 = var58 - 5;
                    if (var98 >= 0 && var98 < this.field1663) {
                        int var99 = this.field1645[var5][var98][var61] & 0xFF;
                        if (var99 > 0) {
                            class13 var100 = class13.field641[var99 - 1];
                            this.field1657[var61] -= var100.field650;
                            this.field1658[var61] -= var100.field648;
                            this.field1659[var61] -= var100.field649;
                            this.field1660[var61] -= var100.field651;
                            var10002 = this.field1661[var61]--;
                        }
                    }
                }
                if (var58 >= 1 && var58 < this.field1663 - 1) {
                    int var62 = 0;
                    int var63 = 0;
                    int var64 = 0;
                    int var65 = 0;
                    int var66 = 0;
                    for (int var67 = -5; var67 < this.field1664 + 5; var67++) {
                        int var68 = var67 + 5;
                        if (var68 >= 0 && var68 < this.field1664) {
                            var62 += this.field1657[var68];
                            var63 += this.field1658[var68];
                            var64 += this.field1659[var68];
                            var65 += this.field1660[var68];
                            var66 += this.field1661[var68];
                        }
                        int var69 = var67 - 5;
                        if (var69 >= 0 && var69 < this.field1664) {
                            var62 -= this.field1657[var69];
                            var63 -= this.field1658[var69];
                            var64 -= this.field1659[var69];
                            var65 -= this.field1660[var69];
                            var66 -= this.field1661[var69];
                        }
                        if (var67 >= 1 && var67 < this.field1664 - 1 && (!field1648 || (this.field1646[0][var58][var67] & 0x2) != 0 || (this.field1646[var5][var58][var67] & 0x10) == 0 && this.method562(var58, var67, var5, (byte) 8) == field1652)) {
                            if (var5 < field1662) {
                                field1662 = var5;
                            }
                            int var70 = this.field1645[var5][var58][var67] & 0xFF;
                            int var71 = this.field1671[var5][var58][var67] & 0xFF;
                            if (var70 > 0 || var71 > 0) {
                                int var72 = this.field1653[var5][var58][var67];
                                int var73 = this.field1653[var5][var58 + 1][var67];
                                int var74 = this.field1653[var5][var58 + 1][var67 + 1];
                                int var75 = this.field1653[var5][var58][var67 + 1];
                                int var76 = this.field1649[var58][var67];
                                int var77 = this.field1649[var58 + 1][var67];
                                int var78 = this.field1649[var58 + 1][var67 + 1];
                                int var79 = this.field1649[var58][var67 + 1];
                                int var80 = -1;
                                int var81 = -1;
                                if (var70 > 0) {
                                    int var82 = var62 * 256 / var65;
                                    int var83 = var63 / var66;
                                    int var84 = var64 / var66;
                                    var80 = this.method580(var82, var83, var84);
                                    int var85 = field1647 + var82 & 0xFF;
                                    int var86 = field1668 + var84;
                                    if (var86 < 0) {
                                        var86 = 0;
                                    } else if (var86 > 255) {
                                        var86 = 255;
                                    }
                                    var81 = this.method580(var85, var83, var86);
                                }
                                if (var5 > 0) {
                                    boolean var87 = true;
                                    if (var70 == 0 && this.field1644[var5][var58][var67] != 0) {
                                        var87 = false;
                                    }
                                    if (var71 > 0 && !class13.field641[var71 - 1].field646) {
                                        var87 = false;
                                    }
                                    if (var87 && var72 == var73 && var72 == var74 && var72 == var75) {
                                        this.field1654[var5][var58][var67] |= 0x924;
                                    }
                                }
                                int var88 = 0;
                                if (var80 != -1) {
                                    var88 = class54.field1484[method571(var81, 96)];
                                }
                                if (var71 == 0) {
                                    arg0.method221(var5, var58, var67, 0, 0, -1, var72, var73, var74, var75, method571(var80, var76), method571(var80, var77), method571(var80, var78), method571(var80, var79), 0, 0, 0, 0, var88, 0);
                                } else {
                                    int var89 = this.field1644[var5][var58][var67] + 1;
                                    byte var90 = this.field1670[var5][var58][var67];
                                    class13 var91 = class13.field641[var71 - 1];
                                    int var92 = var91.field644;
                                    int var93;
                                    int var94;
                                    if (var92 >= 0) {
                                        var93 = class54.method503(var92, this.field1655);
                                        var94 = -1;
                                    } else if (var91.field643 == 16711935) {
                                        var94 = -2;
                                        var92 = -1;
                                        var93 = class54.field1484[this.method573(var91.field652, 96)];
                                    } else {
                                        var94 = this.method580(var91.field647, var91.field648, var91.field649);
                                        var93 = class54.field1484[this.method573(var91.field652, 96)];
                                    }
                                    arg0.method221(var5, var58, var67, var89, var90, var92, var72, var73, var74, var75, method571(var80, var76), method571(var80, var77), method571(var80, var78), method571(var80, var79), this.method573(var94, var76), this.method573(var94, var77), this.method573(var94, var78), this.method573(var94, var79), var88, var93);
                                }
                            }
                        }
                    }
                }
            }
            for (int var59 = 1; var59 < this.field1664 - 1; var59++) {
                for (int var60 = 1; var60 < this.field1663 - 1; var60++) {
                    arg0.method220(var5, var60, var59, this.method562(var60, var59, var5, (byte) 8));
                }
            }
        }
        arg0.method247(-10, -50, true, -50);
        for (int var6 = 0; var6 < this.field1663; var6++) {
            for (int var47 = 0; var47 < this.field1664; var47++) {
                if ((this.field1646[1][var6][var47] & 0x2) == 2) {
                    arg0.method218(5, var47, var6);
                }
            }
        }
        int var7 = 1;
        int var8 = 2;
        int var9 = 4;
        if (arg1 < 7 || arg1 > 7) {
            this.field1669 = 369;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            if (var10 > 0) {
                var7 <<= 0x3;
                var8 <<= 0x3;
                var9 <<= 0x3;
            }
            for (int var11 = 0; var11 <= var10; var11++) {
                for (int var12 = 0; var12 <= this.field1664; var12++) {
                    for (int var13 = 0; var13 <= this.field1663; var13++) {
                        if ((this.field1654[var11][var13][var12] & var7) != 0) {
                            int var14 = var12;
                            int var15 = var12;
                            int var16 = var11;
                            int var17 = var11;
                            while (var14 > 0 && (this.field1654[var11][var13][var14 - 1] & var7) != 0) {
                                var14--;
                            }
                            while (var15 < this.field1664 && (this.field1654[var11][var13][var15 + 1] & var7) != 0) {
                                var15++;
                            }
                            label329: while (var16 > 0) {
                                for (int var18 = var14; var18 <= var15; var18++) {
                                    if ((this.field1654[var16 - 1][var13][var18] & var7) == 0) {
                                        break label329;
                                    }
                                }
                                var16--;
                            }
                            label318: while (var17 < var10) {
                                for (int var19 = var14; var19 <= var15; var19++) {
                                    if ((this.field1654[var17 + 1][var13][var19] & var7) == 0) {
                                        break label318;
                                    }
                                }
                                var17++;
                            }
                            int var20 = (var17 + 1 - var16) * (var15 + 1 - var14);
                            if (var20 >= 8) {
                                short var21 = 240;
                                int var22 = this.field1653[var17][var13][var14] - var21;
                                int var23 = this.field1653[var16][var13][var14];
                                class23.method219(1, var14 * 128, var23, 9, var22, var15 * 128 + 128, var10, var13 * 128, var13 * 128);
                                for (int var24 = var16; var24 <= var17; var24++) {
                                    for (int var25 = var14; var25 <= var15; var25++) {
                                        this.field1654[var24][var13][var25] &= ~var7;
                                    }
                                }
                            }
                        }
                        if ((this.field1654[var11][var13][var12] & var8) != 0) {
                            int var26 = var13;
                            int var27 = var13;
                            int var28 = var11;
                            int var29 = var11;
                            while (var26 > 0 && (this.field1654[var11][var26 - 1][var12] & var8) != 0) {
                                var26--;
                            }
                            while (var27 < this.field1663 && (this.field1654[var11][var27 + 1][var12] & var8) != 0) {
                                var27++;
                            }
                            label382: while (var28 > 0) {
                                for (int var30 = var26; var30 <= var27; var30++) {
                                    if ((this.field1654[var28 - 1][var30][var12] & var8) == 0) {
                                        break label382;
                                    }
                                }
                                var28--;
                            }
                            label371: while (var29 < var10) {
                                for (int var31 = var26; var31 <= var27; var31++) {
                                    if ((this.field1654[var29 + 1][var31][var12] & var8) == 0) {
                                        break label371;
                                    }
                                }
                                var29++;
                            }
                            int var32 = (var29 + 1 - var28) * (var27 + 1 - var26);
                            if (var32 >= 8) {
                                short var33 = 240;
                                int var34 = this.field1653[var29][var26][var12] - var33;
                                int var35 = this.field1653[var28][var26][var12];
                                class23.method219(2, var12 * 128, var35, 9, var34, var12 * 128, var10, var27 * 128 + 128, var26 * 128);
                                for (int var36 = var28; var36 <= var29; var36++) {
                                    for (int var37 = var26; var37 <= var27; var37++) {
                                        this.field1654[var36][var37][var12] &= ~var8;
                                    }
                                }
                            }
                        }
                        if ((this.field1654[var11][var13][var12] & var9) != 0) {
                            int var38 = var13;
                            int var39 = var13;
                            int var40 = var12;
                            int var41 = var12;
                            while (var40 > 0 && (this.field1654[var11][var13][var40 - 1] & var9) != 0) {
                                var40--;
                            }
                            while (var41 < this.field1664 && (this.field1654[var11][var13][var41 + 1] & var9) != 0) {
                                var41++;
                            }
                            label435: while (var38 > 0) {
                                for (int var42 = var40; var42 <= var41; var42++) {
                                    if ((this.field1654[var11][var38 - 1][var42] & var9) == 0) {
                                        break label435;
                                    }
                                }
                                var38--;
                            }
                            label424: while (var39 < this.field1663) {
                                for (int var43 = var40; var43 <= var41; var43++) {
                                    if ((this.field1654[var11][var39 + 1][var43] & var9) == 0) {
                                        break label424;
                                    }
                                }
                                var39++;
                            }
                            if ((var39 + 1 - var38) * (var41 + 1 - var40) >= 4) {
                                int var44 = this.field1653[var11][var38][var40];
                                class23.method219(4, var40 * 128, var44, 9, var44, var41 * 128 + 128, var10, var39 * 128 + 128, var38 * 128);
                                for (int var45 = var38; var45 <= var39; var45++) {
                                    for (int var46 = var40; var46 <= var41; var46++) {
                                        this.field1654[var11][var45][var46] &= ~var9;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIIIIIILEKHWFCYP;LHFSXIPFN;[[[II)V")
    public static final void method568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class14 arg7, class23 arg8, int[][][] arg9, int arg10) {
        int var11 = arg9[arg1][arg0][arg10];
        int var12 = arg9[arg1][arg0 + 1][arg10];
        if (arg2 >= 0) {
            return;
        }
        int var13 = arg9[arg1][arg0 + 1][arg10 + 1];
        int var14 = arg9[arg1][arg0][arg10 + 1];
        int var15 = var11 + var12 + var13 + var14 >> 2;
        class36 var16 = class36.method363(arg4);
        int var17 = (arg4 << 14) + (arg10 << 7) + arg0 + 1073741824;
        if (!var16.field1155) {
            var17 += Integer.MIN_VALUE;
        }
        byte var18 = (byte) ((arg5 << 6) + arg6);
        if (arg6 == 22) {
            class20 var19;
            if (var16.field1191 == -1 && var16.field1148 == null) {
                var19 = var16.method365(22, arg5, var11, var12, var13, var14, -1);
            } else {
                var19 = new class71(22, var12, var16.field1191, arg5, (byte) 116, var11, var13, arg4, var14, true);
            }
            arg8.method222(arg0, var15, var17, arg3, var18, var19, field1665, arg10);
            if (var16.field1185 && var16.field1155) {
                arg7.method194(arg10, arg0, 32151);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class20 var39;
            if (var16.field1191 == -1 && var16.field1148 == null) {
                var39 = var16.method365(10, arg5, var11, var12, var13, var14, -1);
            } else {
                var39 = new class71(10, var12, var16.field1191, arg5, (byte) 116, var11, var13, arg4, var14, true);
            }
            if (var39 != null) {
                int var40 = 0;
                if (arg6 == 11) {
                    var40 += 256;
                }
                int var41;
                int var42;
                if (arg5 == 1 || arg5 == 3) {
                    var41 = var16.field1160;
                    var42 = var16.field1157;
                } else {
                    var41 = var16.field1157;
                    var42 = var16.field1160;
                }
                arg8.method226(arg10, -36734, var41, var17, arg3, var18, var42, var39, var40, arg0, var15);
            }
            if (var16.field1185) {
                arg7.method193(arg0, var16.field1157, var16.field1160, 0, arg10, var16.field1147, arg5);
            }
        } else if (arg6 >= 12) {
            class20 var20;
            if (var16.field1191 == -1 && var16.field1148 == null) {
                var20 = var16.method365(arg6, arg5, var11, var12, var13, var14, -1);
            } else {
                var20 = new class71(arg6, var12, var16.field1191, arg5, (byte) 116, var11, var13, arg4, var14, true);
            }
            arg8.method226(arg10, -36734, 1, var17, arg3, var18, 1, var20, 0, arg0, var15);
            if (var16.field1185) {
                arg7.method193(arg0, var16.field1157, var16.field1160, 0, arg10, var16.field1147, arg5);
            }
        } else if (arg6 == 0) {
            class20 var21;
            if (var16.field1191 == -1 && var16.field1148 == null) {
                var21 = var16.method365(0, arg5, var11, var12, var13, var14, -1);
            } else {
                var21 = new class71(0, var12, var16.field1191, arg5, (byte) 116, var11, var13, arg4, var14, true);
            }
            arg8.method224(var18, var17, var15, field1650[arg5], 0, 0, arg3, arg10, var21, arg0, null);
            if (var16.field1185) {
                arg7.method192(arg0, arg6, var16.field1147, arg10, 339, arg5);
            }
        } else if (arg6 == 1) {
            class20 var22;
            if (var16.field1191 == -1 && var16.field1148 == null) {
                var22 = var16.method365(1, arg5, var11, var12, var13, var14, -1);
            } else {
                var22 = new class71(1, var12, var16.field1191, arg5, (byte) 116, var11, var13, arg4, var14, true);
            }
            arg8.method224(var18, var17, var15, field1656[arg5], 0, 0, arg3, arg10, var22, arg0, null);
            if (var16.field1185) {
                arg7.method192(arg0, arg6, var16.field1147, arg10, 339, arg5);
            }
        } else if (arg6 == 2) {
            int var23 = arg5 + 1 & 0x3;
            class20 var24;
            class20 var25;
            if (var16.field1191 == -1 && var16.field1148 == null) {
                var24 = var16.method365(2, arg5 + 4, var11, var12, var13, var14, -1);
                var25 = var16.method365(2, var23, var11, var12, var13, var14, -1);
            } else {
                var24 = new class71(2, var12, var16.field1191, arg5 + 4, (byte) 116, var11, var13, arg4, var14, true);
                var25 = new class71(2, var12, var16.field1191, var23, (byte) 116, var11, var13, arg4, var14, true);
            }
            arg8.method224(var18, var17, var15, field1650[arg5], 0, field1650[var23], arg3, arg10, var24, arg0, var25);
            if (var16.field1185) {
                arg7.method192(arg0, arg6, var16.field1147, arg10, 339, arg5);
            }
        } else if (arg6 == 3) {
            class20 var26;
            if (var16.field1191 == -1 && var16.field1148 == null) {
                var26 = var16.method365(3, arg5, var11, var12, var13, var14, -1);
            } else {
                var26 = new class71(3, var12, var16.field1191, arg5, (byte) 116, var11, var13, arg4, var14, true);
            }
            arg8.method224(var18, var17, var15, field1656[arg5], 0, 0, arg3, arg10, var26, arg0, null);
            if (var16.field1185) {
                arg7.method192(arg0, arg6, var16.field1147, arg10, 339, arg5);
            }
        } else if (arg6 == 9) {
            class20 var27;
            if (var16.field1191 == -1 && var16.field1148 == null) {
                var27 = var16.method365(arg6, arg5, var11, var12, var13, var14, -1);
            } else {
                var27 = new class71(arg6, var12, var16.field1191, arg5, (byte) 116, var11, var13, arg4, var14, true);
            }
            arg8.method226(arg10, -36734, 1, var17, arg3, var18, 1, var27, 0, arg0, var15);
            if (var16.field1185) {
                arg7.method193(arg0, var16.field1157, var16.field1160, 0, arg10, var16.field1147, arg5);
            }
        } else {
            if (var16.field1167) {
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
            if (arg6 == 4) {
                class20 var32;
                if (var16.field1191 == -1 && var16.field1148 == null) {
                    var32 = var16.method365(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var32 = new class71(4, var12, var16.field1191, 0, (byte) 116, var11, var13, arg4, var14, true);
                }
                arg8.method225(arg5 * 512, var15, var17, var18, field1650[arg5], arg10, arg0, arg3, 0, 0, (byte) 6, var32);
            } else if (arg6 == 5) {
                int var33 = 16;
                int var34 = arg8.method242(arg3, arg0, arg10);
                if (var34 > 0) {
                    var33 = class36.method363(var34 >> 14 & 0x7FFF).field1170;
                }
                class20 var35;
                if (var16.field1191 == -1 && var16.field1148 == null) {
                    var35 = var16.method365(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var35 = new class71(4, var12, var16.field1191, 0, (byte) 116, var11, var13, arg4, var14, true);
                }
                arg8.method225(arg5 * 512, var15, var17, var18, field1650[arg5], arg10, arg0, arg3, field1651[arg5] * var33, field1666[arg5] * var33, (byte) 6, var35);
            } else if (arg6 == 6) {
                class20 var36;
                if (var16.field1191 == -1 && var16.field1148 == null) {
                    var36 = var16.method365(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var36 = new class71(4, var12, var16.field1191, 0, (byte) 116, var11, var13, arg4, var14, true);
                }
                arg8.method225(arg5, var15, var17, var18, 256, arg10, arg0, arg3, 0, 0, (byte) 6, var36);
            } else if (arg6 == 7) {
                class20 var37;
                if (var16.field1191 == -1 && var16.field1148 == null) {
                    var37 = var16.method365(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var37 = new class71(4, var12, var16.field1191, 0, (byte) 116, var11, var13, arg4, var14, true);
                }
                arg8.method225(arg5, var15, var17, var18, 512, arg10, arg0, arg3, 0, 0, (byte) 6, var37);
            } else if (arg6 == 8) {
                class20 var38;
                if (var16.field1191 == -1 && var16.field1148 == null) {
                    var38 = var16.method365(4, 0, var11, var12, var13, var14, -1);
                } else {
                    var38 = new class71(4, var12, var16.field1191, 0, (byte) 116, var11, var13, arg4, var14, true);
                }
                arg8.method225(arg5, var15, var17, var18, 768, arg10, arg0, arg3, 0, 0, (byte) 6, var38);
            }
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIIILEKHWFCYP;IILHFSXIPFN;I)V")
    private final void method569(int arg0, int arg1, int arg2, int arg3, class14 arg4, int arg5, int arg6, class23 arg7, int arg8) {
        if (field1648 && (this.field1646[0][arg5][arg3] & 0x2) == 0) {
            if ((this.field1646[arg8][arg5][arg3] & 0x10) != 0) {
                return;
            }
            if (this.method562(arg5, arg3, arg8, (byte) 8) != field1652) {
                return;
            }
        }
        if (arg8 < field1662) {
            field1662 = arg8;
        }
        int var10 = this.field1653[arg8][arg5][arg3];
        int var11 = this.field1653[arg8][arg5 + 1][arg3];
        int var12 = this.field1653[arg8][arg5 + 1][arg3 + 1];
        int var13 = this.field1653[arg8][arg5][arg3 + 1];
        int var14 = var10 + var11 + var12 + var13 >> 2;
        class36 var15 = class36.method363(arg1);
        int var16 = (arg1 << 14) + (arg3 << 7) + arg5 + 1073741824;
        if (!var15.field1155) {
            var16 += Integer.MIN_VALUE;
        }
        byte var17 = (byte) ((arg6 << 6) + arg2);
        if (arg0 >= 0) {
            return;
        }
        if (arg2 == 22) {
            if (!field1648 || var15.field1155 || var15.field1172) {
                class20 var18;
                if (var15.field1191 == -1 && var15.field1148 == null) {
                    var18 = var15.method365(22, arg6, var10, var11, var12, var13, -1);
                } else {
                    var18 = new class71(22, var11, var15.field1191, arg6, (byte) 116, var10, var12, arg1, var13, true);
                }
                arg7.method222(arg5, var14, var16, arg8, var17, var18, field1665, arg3);
                if (var15.field1185 && var15.field1155 && arg4 != null) {
                    arg4.method194(arg3, arg5, 32151);
                }
            }
        } else if (arg2 == 10 || arg2 == 11) {
            class20 var38;
            if (var15.field1191 == -1 && var15.field1148 == null) {
                var38 = var15.method365(10, arg6, var10, var11, var12, var13, -1);
            } else {
                var38 = new class71(10, var11, var15.field1191, arg6, (byte) 116, var10, var12, arg1, var13, true);
            }
            if (var38 != null) {
                int var39 = 0;
                if (arg2 == 11) {
                    var39 += 256;
                }
                int var40;
                int var41;
                if (arg6 == 1 || arg6 == 3) {
                    var40 = var15.field1160;
                    var41 = var15.field1157;
                } else {
                    var40 = var15.field1157;
                    var41 = var15.field1160;
                }
                if (arg7.method226(arg3, -36734, var40, var16, arg8, var17, var41, var38, var39, arg5, var14) && var15.field1154) {
                    class26 var42;
                    if (var38 instanceof class26) {
                        var42 = (class26) var38;
                    } else {
                        var42 = var15.method365(10, arg6, var10, var11, var12, var13, -1);
                    }
                    if (var42 != null) {
                        for (int var43 = 0; var43 <= var40; var43++) {
                            for (int var44 = 0; var44 <= var41; var44++) {
                                int var45 = var42.field1015 / 4;
                                if (var45 > 30) {
                                    var45 = 30;
                                }
                                if (var45 > this.field1667[arg8][arg5 + var43][arg3 + var44]) {
                                    this.field1667[arg8][arg5 + var43][arg3 + var44] = (byte) var45;
                                }
                            }
                        }
                    }
                }
            }
            if (var15.field1185 && arg4 != null) {
                arg4.method193(arg5, var15.field1157, var15.field1160, 0, arg3, var15.field1147, arg6);
            }
        } else if (arg2 >= 12) {
            class20 var19;
            if (var15.field1191 == -1 && var15.field1148 == null) {
                var19 = var15.method365(arg2, arg6, var10, var11, var12, var13, -1);
            } else {
                var19 = new class71(arg2, var11, var15.field1191, arg6, (byte) 116, var10, var12, arg1, var13, true);
            }
            arg7.method226(arg3, -36734, 1, var16, arg8, var17, 1, var19, 0, arg5, var14);
            if (arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg8 > 0) {
                this.field1654[arg8][arg5][arg3] |= 0x924;
            }
            if (var15.field1185 && arg4 != null) {
                arg4.method193(arg5, var15.field1157, var15.field1160, 0, arg3, var15.field1147, arg6);
            }
        } else if (arg2 == 0) {
            class20 var20;
            if (var15.field1191 == -1 && var15.field1148 == null) {
                var20 = var15.method365(0, arg6, var10, var11, var12, var13, -1);
            } else {
                var20 = new class71(0, var11, var15.field1191, arg6, (byte) 116, var10, var12, arg1, var13, true);
            }
            arg7.method224(var17, var16, var14, field1650[arg6], 0, 0, arg8, arg3, var20, arg5, null);
            if (arg6 == 0) {
                if (var15.field1154) {
                    this.field1667[arg8][arg5][arg3] = 50;
                    this.field1667[arg8][arg5][arg3 + 1] = 50;
                }
                if (var15.field1150) {
                    this.field1654[arg8][arg5][arg3] |= 0x249;
                }
            } else if (arg6 == 1) {
                if (var15.field1154) {
                    this.field1667[arg8][arg5][arg3 + 1] = 50;
                    this.field1667[arg8][arg5 + 1][arg3 + 1] = 50;
                }
                if (var15.field1150) {
                    this.field1654[arg8][arg5][arg3 + 1] |= 0x492;
                }
            } else if (arg6 == 2) {
                if (var15.field1154) {
                    this.field1667[arg8][arg5 + 1][arg3] = 50;
                    this.field1667[arg8][arg5 + 1][arg3 + 1] = 50;
                }
                if (var15.field1150) {
                    this.field1654[arg8][arg5 + 1][arg3] |= 0x249;
                }
            } else if (arg6 == 3) {
                if (var15.field1154) {
                    this.field1667[arg8][arg5][arg3] = 50;
                    this.field1667[arg8][arg5 + 1][arg3] = 50;
                }
                if (var15.field1150) {
                    this.field1654[arg8][arg5][arg3] |= 0x492;
                }
            }
            if (var15.field1185 && arg4 != null) {
                arg4.method192(arg5, arg2, var15.field1147, arg3, 339, arg6);
            }
            if (var15.field1170 != 16) {
                arg7.method232(false, arg8, var15.field1170, arg5, arg3);
            }
        } else if (arg2 == 1) {
            class20 var21;
            if (var15.field1191 == -1 && var15.field1148 == null) {
                var21 = var15.method365(1, arg6, var10, var11, var12, var13, -1);
            } else {
                var21 = new class71(1, var11, var15.field1191, arg6, (byte) 116, var10, var12, arg1, var13, true);
            }
            arg7.method224(var17, var16, var14, field1656[arg6], 0, 0, arg8, arg3, var21, arg5, null);
            if (var15.field1154) {
                if (arg6 == 0) {
                    this.field1667[arg8][arg5][arg3 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field1667[arg8][arg5 + 1][arg3 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field1667[arg8][arg5 + 1][arg3] = 50;
                } else if (arg6 == 3) {
                    this.field1667[arg8][arg5][arg3] = 50;
                }
            }
            if (var15.field1185 && arg4 != null) {
                arg4.method192(arg5, arg2, var15.field1147, arg3, 339, arg6);
            }
        } else if (arg2 == 2) {
            int var22 = arg6 + 1 & 0x3;
            class20 var23;
            class20 var24;
            if (var15.field1191 == -1 && var15.field1148 == null) {
                var23 = var15.method365(2, arg6 + 4, var10, var11, var12, var13, -1);
                var24 = var15.method365(2, var22, var10, var11, var12, var13, -1);
            } else {
                var23 = new class71(2, var11, var15.field1191, arg6 + 4, (byte) 116, var10, var12, arg1, var13, true);
                var24 = new class71(2, var11, var15.field1191, var22, (byte) 116, var10, var12, arg1, var13, true);
            }
            arg7.method224(var17, var16, var14, field1650[arg6], 0, field1650[var22], arg8, arg3, var23, arg5, var24);
            if (var15.field1150) {
                if (arg6 == 0) {
                    this.field1654[arg8][arg5][arg3] |= 0x249;
                    this.field1654[arg8][arg5][arg3 + 1] |= 0x492;
                } else if (arg6 == 1) {
                    this.field1654[arg8][arg5][arg3 + 1] |= 0x492;
                    this.field1654[arg8][arg5 + 1][arg3] |= 0x249;
                } else if (arg6 == 2) {
                    this.field1654[arg8][arg5 + 1][arg3] |= 0x249;
                    this.field1654[arg8][arg5][arg3] |= 0x492;
                } else if (arg6 == 3) {
                    this.field1654[arg8][arg5][arg3] |= 0x492;
                    this.field1654[arg8][arg5][arg3] |= 0x249;
                }
            }
            if (var15.field1185 && arg4 != null) {
                arg4.method192(arg5, arg2, var15.field1147, arg3, 339, arg6);
            }
            if (var15.field1170 != 16) {
                arg7.method232(false, arg8, var15.field1170, arg5, arg3);
            }
        } else if (arg2 == 3) {
            class20 var25;
            if (var15.field1191 == -1 && var15.field1148 == null) {
                var25 = var15.method365(3, arg6, var10, var11, var12, var13, -1);
            } else {
                var25 = new class71(3, var11, var15.field1191, arg6, (byte) 116, var10, var12, arg1, var13, true);
            }
            arg7.method224(var17, var16, var14, field1656[arg6], 0, 0, arg8, arg3, var25, arg5, null);
            if (var15.field1154) {
                if (arg6 == 0) {
                    this.field1667[arg8][arg5][arg3 + 1] = 50;
                } else if (arg6 == 1) {
                    this.field1667[arg8][arg5 + 1][arg3 + 1] = 50;
                } else if (arg6 == 2) {
                    this.field1667[arg8][arg5 + 1][arg3] = 50;
                } else if (arg6 == 3) {
                    this.field1667[arg8][arg5][arg3] = 50;
                }
            }
            if (var15.field1185 && arg4 != null) {
                arg4.method192(arg5, arg2, var15.field1147, arg3, 339, arg6);
            }
        } else if (arg2 == 9) {
            class20 var26;
            if (var15.field1191 == -1 && var15.field1148 == null) {
                var26 = var15.method365(arg2, arg6, var10, var11, var12, var13, -1);
            } else {
                var26 = new class71(arg2, var11, var15.field1191, arg6, (byte) 116, var10, var12, arg1, var13, true);
            }
            arg7.method226(arg3, -36734, 1, var16, arg8, var17, 1, var26, 0, arg5, var14);
            if (var15.field1185 && arg4 != null) {
                arg4.method193(arg5, var15.field1157, var15.field1160, 0, arg3, var15.field1147, arg6);
            }
        } else {
            if (var15.field1167) {
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
            if (arg2 == 4) {
                class20 var31;
                if (var15.field1191 == -1 && var15.field1148 == null) {
                    var31 = var15.method365(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var31 = new class71(4, var11, var15.field1191, 0, (byte) 116, var10, var12, arg1, var13, true);
                }
                arg7.method225(arg6 * 512, var14, var16, var17, field1650[arg6], arg3, arg5, arg8, 0, 0, (byte) 6, var31);
            } else if (arg2 == 5) {
                int var32 = 16;
                int var33 = arg7.method242(arg8, arg5, arg3);
                if (var33 > 0) {
                    var32 = class36.method363(var33 >> 14 & 0x7FFF).field1170;
                }
                class20 var34;
                if (var15.field1191 == -1 && var15.field1148 == null) {
                    var34 = var15.method365(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var34 = new class71(4, var11, var15.field1191, 0, (byte) 116, var10, var12, arg1, var13, true);
                }
                arg7.method225(arg6 * 512, var14, var16, var17, field1650[arg6], arg3, arg5, arg8, field1651[arg6] * var32, field1666[arg6] * var32, (byte) 6, var34);
            } else if (arg2 == 6) {
                class20 var35;
                if (var15.field1191 == -1 && var15.field1148 == null) {
                    var35 = var15.method365(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var35 = new class71(4, var11, var15.field1191, 0, (byte) 116, var10, var12, arg1, var13, true);
                }
                arg7.method225(arg6, var14, var16, var17, 256, arg3, arg5, arg8, 0, 0, (byte) 6, var35);
            } else if (arg2 == 7) {
                class20 var36;
                if (var15.field1191 == -1 && var15.field1148 == null) {
                    var36 = var15.method365(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var36 = new class71(4, var11, var15.field1191, 0, (byte) 116, var10, var12, arg1, var13, true);
                }
                arg7.method225(arg6, var14, var16, var17, 512, arg3, arg5, arg8, 0, 0, (byte) 6, var36);
            } else if (arg2 == 8) {
                class20 var37;
                if (var15.field1191 == -1 && var15.field1148 == null) {
                    var37 = var15.method365(4, 0, var10, var11, var12, var13, -1);
                } else {
                    var37 = new class71(4, var11, var15.field1191, 0, (byte) 116, var10, var12, arg1, var13, true);
                }
                arg7.method225(arg6, var14, var16, var17, 768, arg3, arg5, arg8, 0, 0, (byte) 6, var37);
            }
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method570(int arg0, byte[] arg1, int arg2, int arg3) {
        boolean var4 = true;
        if (arg2 >= 0) {
            throw new NullPointerException();
        }
        class37 var5 = new class37(arg1, -670);
        int var6 = -1;
        label54: while (true) {
            int var7 = var5.method400();
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method400();
                    if (var11 == 0) {
                        continue label54;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method386() >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg0 + var12;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class36 var17 = class36.method363(var6);
                        if (var14 != 22 || !field1648 || var17.field1155 || var17.field1172) {
                            var4 &= var17.method367(545);
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method400();
                if (var10 == 0) {
                    break;
                }
                var5.method386();
            }
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(II)I")
    private static final int method571(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(II[LEKHWFCYP;[BIIIIII)V")
    public final void method572(int arg0, int arg1, class14[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var11 = 0; var11 < 8; var11++) {
            for (int var16 = 0; var16 < 8; var16++) {
                if (arg7 + var11 > 0 && arg7 + var11 < 103 && arg1 + var16 > 0 && arg1 + var16 < 103) {
                    arg2[arg0].field663[arg7 + var11][arg1 + var16] &= 0xFEFFFFFF;
                }
            }
        }
        class37 var12 = new class37(arg3, -670);
        if (arg9 != 8) {
            this.field1669 = -379;
        }
        for (int var13 = 0; var13 < 4; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    if (arg4 == var13 && var14 >= arg6 && var14 < arg6 + 8 && var15 >= arg5 && var15 < arg5 + 8) {
                        this.method566(arg0, 0, false, arg1 + class29.method313(var15 & 0x7, true, arg8, var14 & 0x7), arg8, 0, var12, arg7 + class29.method312(var15 & 0x7, -13, var14 & 0x7, arg8));
                    } else {
                        this.method566(0, 0, false, -1, 0, 0, var12, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "b", descriptor = "(II)I")
    private final int method573(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(III)Z")
    public static final boolean method574(int arg0, int arg1, int arg2) {
        class36 var3 = class36.method363(arg0);
        int var4 = 3 / arg2;
        if (arg1 == 11) {
            arg1 = 10;
        }
        if (arg1 >= 5 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method372(arg1, 1);
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "b", descriptor = "(III)I")
    private static final int method575(int arg0, int arg1, int arg2) {
        int var3 = arg0 / arg2;
        int var4 = arg0 & arg2 - 1;
        int var5 = arg1 / arg2;
        int var6 = arg1 & arg2 - 1;
        int var7 = method576(var3, var5);
        int var8 = method576(var3 + 1, var5);
        int var9 = method576(var3, var5 + 1);
        int var10 = method576(var3 + 1, var5 + 1);
        int var11 = method578(var7, var8, var4, arg2);
        int var12 = method578(var9, var10, var4, arg2);
        return method578(var11, var12, var6, arg2);
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "c", descriptor = "(II)I")
    private static final int method576(int arg0, int arg1) {
        int var2 = method581(arg0 - 1, arg1 - 1) + method581(arg0 + 1, arg1 - 1) + method581(arg0 - 1, arg1 + 1) + method581(arg0 + 1, arg1 + 1);
        int var3 = method581(arg0 - 1, arg1) + method581(arg0 + 1, arg1) + method581(arg0, arg1 - 1) + method581(arg0, arg1 + 1);
        int var4 = method581(arg0, arg1);
        return var4 / 4 + var2 / 16 + var3 / 8;
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(I[LEKHWFCYP;IIIII[BZLHFSXIPFN;I)V")
    public final void method577(int arg0, class14[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, boolean arg8, class23 arg9, int arg10) {
        class37 var12 = new class37(arg7, -670);
        if (arg8) {
            for (int var13 = 1; var13 > 0; var13++) {
            }
        }
        int var14 = -1;
        while (true) {
            int var15 = var12.method400();
            if (var15 == 0) {
                return;
            }
            var14 += var15;
            int var16 = 0;
            while (true) {
                int var17 = var12.method400();
                if (var17 == 0) {
                    break;
                }
                var16 += var17 - 1;
                int var18 = var16 & 0x3F;
                int var19 = var16 >> 6 & 0x3F;
                int var20 = var16 >> 12;
                int var21 = var12.method386();
                int var22 = var21 >> 2;
                int var23 = var21 & 0x3;
                if (arg5 == var20 && var19 >= arg3 && var19 < arg3 + 8 && var18 >= arg6 && var18 < arg6 + 8) {
                    class36 var24 = class36.method363(var14);
                    int var25 = arg2 + class29.method314(var23, var19 & 0x7, var24.field1157, var18 & 0x7, arg10, (byte) -106, var24.field1160);
                    int var26 = arg0 + class29.method315(var18 & 0x7, 4, var23, arg10, var24.field1160, var19 & 0x7, var24.field1157);
                    if (var25 > 0 && var26 > 0 && var25 < 103 && var26 < 103) {
                        int var27 = arg4;
                        if ((this.field1646[1][var25][var26] & 0x2) == 2) {
                            var27 = arg4 - 1;
                        }
                        class14 var28 = null;
                        if (var27 >= 0) {
                            var28 = arg1[var27];
                        }
                        this.method569(-194, var14, var22, var26, var28, var25, arg10 + var23 & 0x3, arg9, arg4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(IIII)I")
    private static final int method578(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 65536 - class54.field1473[arg2 * 1024 / arg3] >> 1;
        return ((65536 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "a", descriptor = "(LMNKDCXXG;ILUWINSVPX;)V")
    public static final void method579(class37 arg0, int arg1, class56 arg2) {
        int var3 = -1;
        if (arg1 != 0) {
            return;
        }
        while (true) {
            int var4 = arg0.method400();
            if (var4 == 0) {
                return;
            }
            var3 += var4;
            class36 var5 = class36.method363(var3);
            var5.method366(-36396, arg2);
            while (true) {
                int var6 = arg0.method400();
                if (var6 == 0) {
                    break;
                }
                arg0.method386();
            }
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "<init>", descriptor = "([[[II[[[BIZ)V")
    public class65(int[][][] arg0, int arg1, byte[][][] arg2, int arg3, boolean arg4) {
        field1662 = 99;
        this.field1663 = arg3;
        this.field1664 = arg1;
        this.field1653 = arg0;
        this.field1646 = arg2;
        this.field1645 = new byte[4][this.field1663][this.field1664];
        this.field1671 = new byte[4][this.field1663][this.field1664];
        if (!arg4) {
            throw new NullPointerException();
        }
        this.field1644 = new byte[4][this.field1663][this.field1664];
        this.field1670 = new byte[4][this.field1663][this.field1664];
        this.field1654 = new int[4][this.field1663 + 1][this.field1664 + 1];
        this.field1667 = new byte[4][this.field1663 + 1][this.field1664 + 1];
        this.field1649 = new int[this.field1663 + 1][this.field1664 + 1];
        this.field1657 = new int[this.field1664];
        this.field1658 = new int[this.field1664];
        this.field1659 = new int[this.field1664];
        this.field1660 = new int[this.field1664];
        this.field1661 = new int[this.field1664];
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "c", descriptor = "(III)I")
    private final int method580(int arg0, int arg1, int arg2) {
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

    @OriginalMember(owner = "client!XTTZZRNP", name = "d", descriptor = "(II)I")
    private static final int method581(int arg0, int arg1) {
        int var2 = arg1 * 57 + arg0;
        int var3 = var2 << 13 ^ var2;
        int var4 = (var3 * var3 * 15731 + 789221) * var3 + 1376312589 & Integer.MAX_VALUE;
        return var4 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "b", descriptor = "(IIII)V")
    public final void method582(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 8; var5++) {
            for (int var8 = 0; var8 < 8; var8++) {
                this.field1653[arg1][arg0 + var5][arg3 + var8] = 0;
            }
        }
        if (arg2 < 2 || arg2 > 2) {
            this.field1672 = !this.field1672;
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                this.field1653[arg1][arg0][arg3 + var6] = this.field1653[arg1][arg0 - 1][arg3 + var6];
            }
        }
        if (arg3 > 0) {
            for (int var7 = 1; var7 < 8; var7++) {
                this.field1653[arg1][arg0 + var7][arg3] = this.field1653[arg1][arg0 + var7][arg3 - 1];
            }
        }
        if (arg0 > 0 && this.field1653[arg1][arg0 - 1][arg3] != 0) {
            this.field1653[arg1][arg0][arg3] = this.field1653[arg1][arg0 - 1][arg3];
        } else if (arg3 > 0 && this.field1653[arg1][arg0][arg3 - 1] != 0) {
            this.field1653[arg1][arg0][arg3] = this.field1653[arg1][arg0][arg3 - 1];
        } else if (arg0 > 0 && arg3 > 0 && this.field1653[arg1][arg0 - 1][arg3 - 1] != 0) {
            this.field1653[arg1][arg0][arg3] = this.field1653[arg1][arg0 - 1][arg3 - 1];
        }
    }

    @OriginalMember(owner = "client!XTTZZRNP", name = "e", descriptor = "(II)I")
    private static final int method583(int arg0, int arg1) {
        int var2 = method575(arg0 + 45365, arg1 + 91923, 4) + (method575(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method575(arg0, arg1, 1) - 128 >> 2) - 128;
        int var3 = (int) ((double) var2 * 0.3D) + 35;
        if (var3 < 10) {
            var3 = 10;
        } else if (var3 > 60) {
            var3 = 60;
        }
        return var3;
    }
}
