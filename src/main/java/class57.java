import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class57 {

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Z")
    public boolean field830 = false;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field821 = 0;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field827 = -1;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLil;I)V", line = 16)
    public final void method383(byte arg0, class265 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1697(83);
            if (var4 == 0) {
                field824++;
                if (arg0 < 52) {
                    this.method383((byte) -88, (class265) null, -121);
                    return;
                }
                return;
            }
            this.method390(var4, arg2, (byte) 76, arg1);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 41)
    public static final String method384(int arg0, long arg1) {
        field818++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class17.field205[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            if (arg0 <= 121) {
                return null;
            } else {
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lji;", line = 94)
    public static final class64 method385(int arg0, int arg1) {
        field823++;
        class64 var2 = (class64) class345.field5074.method2319(-12, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class234.field3296.method1472(arg0, 19, 0);
        class64 var4 = new class64();
        int var5 = -21 / ((arg1 - 52) / 61);
        if (var3 != null) {
            var4.method423(new class265(var3), -1);
        }
        class345.field5074.method2318(var4, false, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IBI)B", line = 119)
    public static final byte method386(int arg0, byte arg1, int arg2) {
        field822++;
        if (arg1 != -75) {
            return 79;
        } else if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIILnr;)Lqa;", line = 144)
    public final class243 method387(boolean arg0, int arg1, int arg2, class437 arg3) {
        field828++;
        long var5 = (long) (arg3.field6424 << 19 | (arg0 ? 262144 : 0) | arg1 << 16 | this.field816);
        class243 var7 = (class243) class16.field177.method209(124, var5);
        if (var7 != null) {
            return var7;
        } else if (class158.field2077.method1451(-122, this.field816)) {
            class25 var8 = class25.method225(class158.field2077, this.field816, 0);
            if (var8 != null) {
                var8.field440 = var8.field444 = var8.field439 = var8.field437 = 0;
                if (arg0) {
                    var8.method218();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method224();
                }
            }
            class243 var10 = arg3.method2166(var8, true);
            if (var10 != null) {
                class16.field177.method202(true, var10, var5);
            }
            if (arg2 != -31318) {
                this.field816 = 78;
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z", line = 191)
    public final boolean method388(int arg0) {
        if (arg0 != -7748) {
            this.method387(true, -86, 44, (class437) null);
        }
        field819++;
        return class158.field2077.method1451(-118, this.field816);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)[[[B", line = 202)
    public static final byte[][][] method389(int arg0, int arg1) {
        field825++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var130 >= var13) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if ((var19 >> 1) >= var128) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var20.length > var21) {
                    if (var22 << 1 <= var127) {
                        var20[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var20;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= (var25 >> 1)) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var125 >= (var28 << 1)) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = arg1 + var4; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if ((var31 >> 1) >= var124) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= (var34 << 1)) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var37 >> 1 >= var122) {
                    var36[var35] = -1;
                }
                var35++;
            }
        }
        var2[2][2] = var36;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= (var40 << 1)) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= (var43 >> 1)) {
                    var41[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var41;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var119 <= (var46 << 1)) {
                    var45[var44] = -1;
                }
                var44++;
            }
        }
        var2[3][1] = var45;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 >= (var49 >> 1)) {
                    var48[var47] = -1;
                }
                var47++;
            }
        }
        var2[3][2] = var48;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var52 << 1) >= var117) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if ((var55 >> 1) <= var116) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if ((var58 << 1) >= var115) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        var2[4][1] = var57;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var114 >= var61 >> 1) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= (var64 << 1)) {
                    var63[var62] = -1;
                }
                var62++;
            }
        }
        var2[4][3] = var63;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var3 / 2) >= var112) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= var4 / 2) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        int var71 = 0;
        byte[] var72 = new byte[var3 * var4];
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if ((var3 / 2) <= var110) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
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
            for (int var108 = 0; var108 < var3; var108++) {
                if ((var79 - var4 / 2) >= var108) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var107 <= var82 - (var4 / 2)) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if ((var85 - (var4 / 2)) >= var106) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var88 - var4 / 2 >= var105) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var91 - (var4 / 2) <= var104) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if ((var94 - (var4 / 2)) <= var103) {
                    var92[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var92;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= (var97 - (var4 / 2))) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var100 - (var4 / 2) <= var101) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIBLil;)V", line = 974)
    private final void method390(int arg0, int arg1, byte arg2, class265 arg3) {
        field829++;
        if (arg0 == 1) {
            this.field816 = arg3.method1685(8104);
        } else if (arg0 == 2) {
            this.field820 = arg3.method1691(false);
        } else if (arg0 == 3) {
            this.field830 = true;
        } else if (arg0 == 4) {
            this.field816 = -1;
        }
        int var5 = -24 / ((arg2 - 4) / 60);
    }
}
