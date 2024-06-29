import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class323 {

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lwj;")
    public static class270 field4398 = new class270(47, -2);

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "Lal;")
    public static class66 field4400 = null;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lwj;")
    public static class270 field4399 = new class270(106, 16);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1867(boolean arg0, int arg1) {
        field4397++;
        if (arg1 != 3) {
            method1867(true, -37);
        }
        boolean var2 = class269.field3721.method261();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class269.field3721.method320();
        } else if (!class269.field3721.method297()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class20.field269.field7656 = arg0;
            class20.field269.method1715((byte) -120, class202.field2840);
            return true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILem;IB)V")
    public static final void method1868(int arg0, class150 arg1, int arg2, byte arg3) {
        if (class59.field720) {
            class177 var9 = class292.field4043 == -1 ? null : class177.field2622.method2033((byte) 78, class292.field4043);
            if (client.method1228(arg1).method1179(799487809) && (class13.field199 & 0x20) != 0 && (var9 == null || arg1.method996((byte) 81, class292.field4043, var9.field2615) != var9.field2615)) {
                class407.method2438(57, class352.field5167, true, 0L, class78.field1131, arg1.field2248, class253.field3513 + " -> " + arg1.field2203, arg1.field2237, 500, false, arg1.field2277);
                class149.field2159++;
            }
        } else {
            for (int var4 = 9; var4 >= 5; var4--) {
                String var8 = class271.method1617(arg1, var4, 114);
                if (var8 != null) {
                    class407.method2438(1003, class106.method780(var4, arg1, (byte) 126), true, (long) (var4 + 1), var8, arg1.field2248, arg1.field2203, arg1.field2237, arg3 + 527, false, arg1.field2277);
                    class458.field6714++;
                }
            }
            String var5 = class339.method2017(arg1, 16776960);
            if (var5 != null) {
                class314.field4281++;
                class407.method2438(15, arg1.field2313, true, 0L, var5, arg1.field2248, arg1.field2203, arg1.field2237, 500, false, arg1.field2277);
            }
            for (int var6 = 4; var6 >= 0; var6--) {
                String var7 = class271.method1617(arg1, var6, arg3 ^ 0xFFFFFF9E);
                if (var7 != null) {
                    class407.method2438(9, class106.method780(var6, arg1, (byte) -57), true, (long) (var6 + 1), var7, arg1.field2248, arg1.field2203, arg1.field2237, 500, false, arg1.field2277);
                    class458.field6714++;
                }
            }
            if (client.method1228(arg1).method1184(arg3 + 26)) {
                class220.field3067++;
                if (arg1.field2303 == null) {
                    class407.method2438(4, -1, true, 0L, class512.field7597.method2731(62, class372.field5455), arg1.field2248, "", arg1.field2237, 500, false, arg1.field2277);
                } else {
                    class407.method2438(4, -1, true, 0L, arg1.field2303, arg1.field2248, "", arg1.field2237, 500, false, arg1.field2277);
                }
            }
        }
        if (arg3 == -27) {
            field4394++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1869(int arg0) {
        field4400 = null;
        field4398 = null;
        int var1 = 78 % ((arg0 + 51) / 58);
        field4399 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIZ)V")
    public static final void method1870(int arg0, int arg1, boolean arg2) {
        field4395++;
        int var3 = class407.field5952.method2867(class391.field5725.method2731(62, class372.field5455), (byte) -70);
        for (class82 var4 = (class82) class526.field7778.method2818((byte) 100); var4 != null; var4 = (class82) class526.field7778.method2820((byte) -58)) {
            int var8 = class187.method1175(-1007, var4);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class274.field3764 * 16 + 21;
        if (arg2) {
            method1868(14, null, -83, (byte) -31);
        }
        int var6 = arg1 - (var3 / 2);
        if (class117.field1754 < (var3 + var6)) {
            var6 = class117.field1754 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg0;
        if (class27.field359 < var5 + arg0) {
            var7 = class27.field359 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class88.field1290 = var6;
        class181.field2659 = true;
        class464.field6821 = var3;
        class142.field2034 = (class476.field6942 ? 26 : 22) + class274.field3764 * 16;
        class263.field3634 = var7;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[[[B")
    public static final byte[][][] method1871(int arg0, int arg1) {
        field4396++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var7 >= var132) {
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
        if (arg0 != 8132) {
            method1867(false, -88);
        }
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
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
                if (var128 <= (var19 >> 1)) {
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
                if (var21 >= 0 && var21 < var20.length) {
                    if ((var22 << 1) <= var127) {
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
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= var25 >> 1) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var28 << 1 <= var125) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var124 <= var31 >> 1) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if ((var34 << 1) <= var123) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if ((var37 >> 1) >= var122) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= (var40 << 1)) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= var43 >> 1) {
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
                if (var119 <= var46 << 1) {
                    var45[var44] = -1;
                }
                var44++;
            }
        }
        var2[3][1] = var45;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var49 >> 1 <= var118) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 <= (var52 << 1)) {
                    var51[var50] = -1;
                }
                var50++;
            }
        }
        var2[3][3] = var51;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var116 >= (var55 >> 1)) {
                    var54[var53] = -1;
                }
                var53++;
            }
        }
        var2[4][0] = var54;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= var58 << 1) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        var2[4][1] = var57;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var114 >= (var61 >> 1)) {
                    var59[var60] = -1;
                }
                var60++;
            }
        }
        var2[4][2] = var59;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= var64 << 1) {
                    var63[var62] = -1;
                }
                var62++;
            }
        }
        var2[4][3] = var63;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var112 <= var3 / 2) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= (var4 / 2)) {
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
                if (var110 >= var3 / 2) {
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
                if (var4 / 2 <= var76) {
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
                if (var108 <= (var79 - (var4 / 2))) {
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
                if (var107 <= (var82 - (var4 / 2))) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= var85 - (var4 / 2)) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if ((var88 - var4 / 2) >= var105) {
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
                if (var91 - var4 / 2 <= var104) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var103 >= var94 - (var4 / 2)) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if ((var97 - (var4 / 2)) <= var102) {
                    var96[var95] = -1;
                }
                var95++;
            }
        }
        var2[7][2] = var96;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if ((var100 - (var4 / 2)) <= var101) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }
}
