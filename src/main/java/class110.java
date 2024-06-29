import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class110 {

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "Lkh;")
    private class13 field1532 = new class13(16);

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "Lul;")
    private class406 field1535;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "Lul;")
    public static class406 field1539;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V", line = 4)
    public final void method837(byte arg0) {
        field1541++;
        class13 var2 = this.field1532;
        synchronized (this.field1532) {
            this.field1532.method93((byte) 92);
        }
        if (arg0 <= 92) {
            this.method839(34, (byte) -1);
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)V", line = 17)
    public final void method838(byte arg0) {
        field1540++;
        class13 var2 = this.field1532;
        synchronized (this.field1532) {
            if (arg0 == 29) {
                this.field1532.method88(arg0 + 83);
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IB)V", line = 30)
    public final void method839(int arg0, byte arg1) {
        field1537++;
        int var3 = 16 / ((30 - arg1) / 47);
        class13 var4 = this.field1532;
        synchronized (this.field1532) {
            this.field1532.method91(89, arg0);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(CZ)Z", line = 48)
    public static final boolean method840(char arg0, boolean arg1) {
        if (arg1) {
            field1538++;
            return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(IB)Lpe;", line = 61)
    public final class435 method841(int arg0, byte arg1) {
        if (arg1 != 118) {
            return null;
        }
        field1536++;
        class13 var3 = this.field1532;
        class435 var4;
        synchronized (this.field1532) {
            var4 = (class435) this.field1532.method87((long) arg0, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field1535;
        byte[] var6;
        synchronized (this.field1535) {
            var6 = this.field1535.method2536(30, arg1 ^ 0x76, arg0);
        }
        class435 var7 = new class435();
        if (var6 != null) {
            var7.method2693(new class217(var6), arg1 ^ 0xFFFFFF89);
        }
        class13 var8 = this.field1532;
        synchronized (this.field1532) {
            this.field1532.method84((long) arg0, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(IB)[[[B", line = 94)
    public static final byte[][][] method842(int arg0, byte arg1) {
        field1533++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
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
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var10 >= var131) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var130 >= var13) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        var2[0][2] = var12;
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
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= var19 >> 1) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var20 < var21.length) {
                    if (var22 << 1 <= var127) {
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
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= (var25 >> 1)) {
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
                if (var125 >= var28 << 1) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var124 <= (var31 >> 1)) {
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
                if (var34 << 1 <= var123) {
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
                if ((var37 >> 1) >= var122) {
                    var36[var35] = -1;
                }
                var35++;
            }
        }
        var2[2][2] = var36;
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
                if ((var46 << 1) >= var119) {
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
                if (var49 >> 1 <= var118) {
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
                if (var117 <= (var52 << 1)) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var55 >> 1 <= var116) {
                    var54[var53] = -1;
                }
                var53++;
            }
        }
        var2[4][0] = var54;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        if (arg1 != -1) {
            method844(-64, -96, null, 20, -1.7338358F, 85, 0.06452833F, -1.700541F, 99, null, -36, 0.1832454F, 0.13104665F);
        }
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= var58 << 1) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var61 >> 1 <= var114) {
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
                if (var64 << 1 >= var113) {
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
                if (var3 / 2 >= var112) {
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
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var79 - var4 / 2 >= var108) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var107 <= var82 - (var4 / 2)) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
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
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var105 <= var88 - var4 / 2) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        var2[6][3] = var87;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if ((var91 - (var4 / 2)) <= var104) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
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
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= (var97 - (var4 / 2))) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var100 - var4 / 2 <= var101) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(B)V", line = 873)
    public static void method843(byte arg0) {
        field1539 = null;
        if (arg0 != -55) {
            field1539 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lee;ILul;)V", line = 910)
    public class110(class480 arg0, int arg1, class406 arg2) {
        this.field1535 = arg2;
        this.field1535.method2551(30, -26070);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILhj;IFIFFI[BIFF)V", line = 891)
    public static final void method844(int arg0, int arg1, class403 arg2, int arg3, float arg4, int arg5, float arg6, float arg7, int arg8, byte[] arg9, int arg10, float arg11, float arg12) {
        if (arg10 > -71) {
            method844(-89, -87, null, 24, 0.41899112F, 25, -0.10131625F, -0.6992804F, -98, null, -89, -0.45732728F, -1.3476185F);
        }
        for (int var13 = 0; var13 < arg5; var13++) {
            class231.method1625(arg8, arg1, var13, arg6, arg3, arg5, arg2, arg9, arg12, arg11, arg0, arg7, arg4, true);
            arg1 += arg0 * arg8;
        }
        field1534++;
    }
}
