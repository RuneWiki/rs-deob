import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class15 {

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
    private int field207 = 0;

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "Ltn;")
    private class109 field204;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "[Ldl;")
    public static class201[] field206 = new class201[50];

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "Lvi;")
    private class311 field203;

    @OriginalMember(owner = "client!qr", name = "j", descriptor = "Lij;")
    public static class316 field210;

    @OriginalMember(owner = "client!qr", name = "i", descriptor = "[I")
    public static int[] field209;

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)Lvi;", line = 4)
    public final class311 method89(byte arg0) {
        this.field207 = 0;
        field201++;
        if (arg0 < 115) {
            field206 = null;
        }
        return this.method93(false);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ICI)C", line = 16)
    public static final char method90(int arg0, char arg1, int arg2) {
        field208++;
        int var3 = 97 % ((arg2 - 28) / 53);
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)[[[B", line = 105)
    public static final byte[][][] method91(int arg0, int arg1) {
        field202++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var133 = 0; var133 < var3; var133++) {
                if (var7 >= var133) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var132 = 0; var132 < var4; var132++) {
                if (var10 >= var132) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
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
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var130 >= var16) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var19 >> 1 >= var129) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var20 >= 0 && var20 < var21.length) {
                    if (var22 << 1 <= var128) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
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
        int var28 = 101 / ((-arg0 - 60) / 49);
        for (int var29 = var4 - 1; var29 >= 0; var29--) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var29 << 1 <= var126) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        int var30 = 0;
        byte[] var31 = new byte[var3 * var4];
        for (int var32 = var4 - 1; var32 >= 0; var32--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var32 >> 1 >= var125) {
                    var31[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var31;
        int var33 = 0;
        byte[] var34 = new byte[var3 * var4];
        for (int var35 = var4 - 1; var35 >= 0; var35--) {
            for (int var124 = 0; var124 < var3; var124++) {
                if (var35 << 1 <= var124) {
                    var34[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var34;
        byte[] var36 = new byte[var3 * var4];
        int var37 = 0;
        for (int var38 = 0; var38 < var4; var38++) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var38 >> 1 >= var123) {
                    var36[var37] = -1;
                }
                var37++;
            }
        }
        var2[2][2] = var36;
        int var39 = 0;
        byte[] var40 = new byte[var3 * var4];
        for (int var41 = 0; var41 < var4; var41++) {
            for (int var122 = var3 - 1; var122 >= 0; var122--) {
                if (var41 << 1 <= var122) {
                    var40[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var40;
        byte[] var42 = new byte[var3 * var4];
        int var43 = 0;
        for (int var44 = var4 - 1; var44 >= 0; var44--) {
            for (int var121 = 0; var121 < var3; var121++) {
                if (var121 >= (var44 >> 1)) {
                    var42[var43] = -1;
                }
                var43++;
            }
        }
        var2[3][0] = var42;
        byte[] var45 = new byte[var3 * var4];
        int var46 = 0;
        for (int var47 = 0; var47 < var4; var47++) {
            for (int var120 = 0; var120 < var3; var120++) {
                if ((var47 << 1) >= var120) {
                    var45[var46] = -1;
                }
                var46++;
            }
        }
        var2[3][1] = var45;
        int var48 = 0;
        byte[] var49 = new byte[var3 * var4];
        for (int var50 = 0; var50 < var4; var50++) {
            for (int var119 = var3 - 1; var119 >= 0; var119--) {
                if (var119 >= (var50 >> 1)) {
                    var49[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var49;
        int var51 = 0;
        byte[] var52 = new byte[var3 * var4];
        for (int var53 = var4 - 1; var53 >= 0; var53--) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if ((var53 << 1) >= var118) {
                    var52[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var52;
        byte[] var54 = new byte[var3 * var4];
        int var55 = 0;
        for (int var56 = var4 - 1; var56 >= 0; var56--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var56 >> 1 <= var117) {
                    var54[var55] = -1;
                }
                var55++;
            }
        }
        var2[4][0] = var54;
        int var57 = 0;
        byte[] var58 = new byte[var3 * var4];
        for (int var59 = var4 - 1; var59 >= 0; var59--) {
            for (int var116 = 0; var116 < var3; var116++) {
                if (var59 << 1 >= var116) {
                    var58[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var58;
        int var60 = 0;
        byte[] var61 = new byte[var3 * var4];
        for (int var62 = 0; var62 < var4; var62++) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 >= (var62 >> 1)) {
                    var61[var60] = -1;
                }
                var60++;
            }
        }
        var2[4][2] = var61;
        int var63 = 0;
        byte[] var64 = new byte[var3 * var4];
        for (int var65 = 0; var65 < var4; var65++) {
            for (int var114 = var3 - 1; var114 >= 0; var114--) {
                if (var65 << 1 >= var114) {
                    var64[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var64;
        byte[] var66 = new byte[var3 * var4];
        int var67 = 0;
        for (int var68 = 0; var68 < var4; var68++) {
            for (int var113 = 0; var113 < var3; var113++) {
                if (var113 <= (var3 / 2)) {
                    var66[var67] = -1;
                }
                var67++;
            }
        }
        var2[5][0] = var66;
        byte[] var69 = new byte[var3 * var4];
        int var70 = 0;
        for (int var71 = 0; var71 < var4; var71++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var71 <= var4 / 2) {
                    var69[var70] = -1;
                }
                var70++;
            }
        }
        var2[5][1] = var69;
        byte[] var72 = new byte[var3 * var4];
        int var73 = 0;
        for (int var74 = 0; var74 < var4; var74++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var111 >= var3 / 2) {
                    var72[var73] = -1;
                }
                var73++;
            }
        }
        var2[5][2] = var72;
        int var75 = 0;
        byte[] var76 = new byte[var3 * var4];
        for (int var77 = 0; var77 < var4; var77++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var4 / 2 <= var77) {
                    var76[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var76;
        byte[] var78 = new byte[var3 * var4];
        int var79 = 0;
        for (int var80 = 0; var80 < var4; var80++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var109 <= (var80 - (var4 / 2))) {
                    var78[var79] = -1;
                }
                var79++;
            }
        }
        var2[6][0] = var78;
        int var81 = 0;
        byte[] var82 = new byte[var3 * var4];
        for (int var83 = var4 - 1; var83 >= 0; var83--) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= var83 - var4 / 2) {
                    var82[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var82;
        byte[] var84 = new byte[var3 * var4];
        int var85 = 0;
        for (int var86 = var4 - 1; var86 >= 0; var86--) {
            for (int var107 = var3 - 1; var107 >= 0; var107--) {
                if (var86 - (var4 / 2) >= var107) {
                    var84[var85] = -1;
                }
                var85++;
            }
        }
        var2[6][2] = var84;
        int var87 = 0;
        byte[] var88 = new byte[var3 * var4];
        for (int var89 = 0; var89 < var4; var89++) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var89 - (var4 / 2) >= var106) {
                    var88[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var88;
        byte[] var90 = new byte[var3 * var4];
        int var91 = 0;
        for (int var92 = 0; var92 < var4; var92++) {
            for (int var105 = 0; var105 < var3; var105++) {
                if (var92 - (var4 / 2) <= var105) {
                    var90[var91] = -1;
                }
                var91++;
            }
        }
        var2[7][0] = var90;
        int var93 = 0;
        byte[] var94 = new byte[var3 * var4];
        for (int var95 = var4 - 1; var95 >= 0; var95--) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= (var95 - (var4 / 2))) {
                    var94[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var94;
        int var96 = 0;
        byte[] var97 = new byte[var3 * var4];
        for (int var98 = var4 - 1; var98 >= 0; var98--) {
            for (int var103 = var3 - 1; var103 >= 0; var103--) {
                if ((var98 - (var4 / 2)) <= var103) {
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
                if ((var101 - var4 / 2) <= var102) {
                    var100[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var100;
        return var2;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 890)
    public static void method92(int arg0) {
        field206 = null;
        if (arg0 != 0) {
            field210 = null;
        }
        field210 = null;
        field209 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)Lvi;", line = 903)
    public final class311 method93(boolean arg0) {
        field205++;
        if (arg0) {
            this.method89((byte) 35);
        }
        if (this.field207 > 0 && this.field204.field1695[this.field207 - 1] != this.field203) {
            class311 var2 = this.field203;
            this.field203 = var2.field4223;
            return var2;
        }
        while (this.field207 < this.field204.field1682) {
            class311 var3 = this.field204.field1695[this.field207++].field4223;
            if (this.field204.field1695[this.field207 - 1] != var3) {
                this.field203 = var3.field4223;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Ltn;)V", line = 941)
    public class15(class109 arg0) {
        this.field204 = arg0;
    }
}
