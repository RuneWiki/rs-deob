import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class425 {

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Lub;")
    public static class15 field6069 = new class15(16);

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "Lpm;")
    public static class349 field6077;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Lpm;")
    public static class349 field6081;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "J")
    public long field6070;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lge;")
    public class425 field6072;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "Lge;")
    public class425 field6074;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "[Lvj;")
    public static class256[] field6080;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "[[I")
    public static int[][] field6079;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
    public static void method2659(byte arg0) {
        field6080 = null;
        field6069 = null;
        if (arg0 == 83) {
            field6081 = null;
            field6077 = null;
            field6079 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)V")
    public final void method2660(byte arg0) {
        field6075++;
        if (this.field6072 == null) {
            return;
        }
        if (arg0 <= 111) {
            field6077 = null;
        }
        this.field6072.field6074 = this.field6074;
        this.field6074.field6072 = this.field6072;
        this.field6074 = null;
        this.field6072 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)[[[B")
    public static final byte[][][] method2661(int arg0, byte arg1) {
        field6076++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var133 = 0; var133 < var3; var133++) {
                if (var133 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var132 = 0; var132 < var4; var132++) {
                if (var132 <= var10) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var131 = 0; var131 < var3; var131++) {
                if (var131 >= var13) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var16 <= var130) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 <= var19 >> 1) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var21 >= 0 && var21 < var20.length) {
                    if (var128 >= (var22 << 1)) {
                        var20[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var20;
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var127 = var3 - 1; var127 >= 0; var127--) {
                if (var127 <= (var25 >> 1)) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 >= (var28 << 1)) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var31 >> 1 >= var125) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var124 = 0; var124 < var3; var124++) {
                if (var124 >= (var34 << 1)) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var123 = 0; var123 < var3; var123++) {
                if ((var37 >> 1) >= var123) {
                    var36[var35] = -1;
                }
                var35++;
            }
        }
        var2[2][2] = var36;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var122 = var3 - 1; var122 >= 0; var122--) {
                if (var122 >= (var40 << 1)) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var121 = 0; var121 < var3; var121++) {
                if ((var43 >> 1) <= var121) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var46 << 1 >= var120) {
                    var45[var44] = -1;
                }
                var44++;
            }
        }
        var2[3][1] = var45;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var119 = var3 - 1; var119 >= 0; var119--) {
                if (var119 >= var49 >> 1) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 <= var52 << 1) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var55 >> 1 <= var117) {
                    var54[var53] = -1;
                }
                var53++;
            }
        }
        var2[4][0] = var54;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var116 = 0; var116 < var3; var116++) {
                if ((var58 << 1) >= var116) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        var2[4][1] = var57;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 >= (var61 >> 1)) {
                    var59[var60] = -1;
                }
                var60++;
            }
        }
        var2[4][2] = var59;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var114 = var3 - 1; var114 >= 0; var114--) {
                if (var114 <= (var64 << 1)) {
                    var63[var62] = -1;
                }
                var62++;
            }
        }
        var2[4][3] = var63;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var113 = 0; var113 < var3; var113++) {
                if (var113 <= (var3 / 2)) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var4 / 2) >= var70) {
                    var69[var68] = -1;
                }
                var68++;
            }
        }
        var2[5][1] = var69;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var3 / 2 <= var111) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var76 >= var4 / 2) {
                    var75[var74] = -1;
                }
                var74++;
            }
        }
        var2[5][3] = var75;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var79 - var4 / 2 >= var109) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= (var82 - (var4 / 2))) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var107 = var3 - 1; var107 >= 0; var107--) {
                if ((var85 - (var4 / 2)) >= var107) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= var88 - (var4 / 2)) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var105 = 0; var105 < var3; var105++) {
                if (var105 >= (var91 - var4 / 2)) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= (var94 - (var4 / 2))) {
                    var92[var93] = -1;
                }
                var93++;
            }
        }
        int var95 = 113 % ((arg1 + 65) / 35);
        var2[7][1] = var92;
        int var96 = 0;
        byte[] var97 = new byte[var3 * var4];
        for (int var98 = var4 - 1; var98 >= 0; var98--) {
            for (int var103 = var3 - 1; var103 >= 0; var103--) {
                if (var103 >= var98 - var4 / 2) {
                    var97[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var97;
        int var99 = 0;
        byte[] var100 = new byte[var3 * var4];
        for (int var101 = 0; var101 < var4; var101++) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= (var101 - (var4 / 2))) {
                    var100[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var100;
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)Z")
    public final boolean method2662(byte arg0) {
        field6073++;
        if (this.field6072 == null) {
            return false;
        } else {
            if (arg0 != 116) {
                field6077 = null;
            }
            return true;
        }
    }

    static {
        new class349("Use", "Benutzen", "Utiliser", "Usar");
        field6078 = -1;
        field6077 = new class349("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");
        field6081 = new class349(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");
        field6082 = -1;
    }
}
