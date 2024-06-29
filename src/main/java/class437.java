import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class437 {

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public int field6072;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "Lvv;")
    public class295 field6067;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    public int field6079;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public int field6085;

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    public int field6080;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "B")
    public byte field6083;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public int field6070;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    public int field6074;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "[Lac;")
    public static class501[] field6082 = new class501[2048];

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "Lvp;")
    public class172 field6078;

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "Lbu;")
    public class19 field6087;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "Loba;")
    public class237 field6075;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "Lsf;")
    public class484 field6086;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "[[I")
    public static int[][] field6073;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method2498(byte arg0) {
        if (arg0 == 2) {
            field6084++;
            return this.field6083 == 2 || this.field6083 == 3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILls;)I", line = 22)
    public static final int method2499(int arg0, class124 arg1) {
        field6081++;
        if (arg1.field1748 == 0) {
            return 0;
        }
        if (arg1.field1701 != -1) {
            class124 var2 = null;
            if (arg1.field1701 < 32768) {
                class393 var3 = (class393) class299.field4071.method970((byte) 89, (long) arg1.field1701);
                if (var3 != null) {
                    var2 = var3.field5552;
                }
            } else if (arg1.field1701 >= 32768) {
                var2 = class671.field9407[arg1.field1701 - 32768];
            }
            if (var2 != null) {
                int var4 = arg1.field4042 - var2.field4042;
                int var5 = arg1.field4047 - var2.field4047;
                if (var4 != 0 || var5 != 0) {
                    arg1.method886(0, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg1 instanceof class677) {
            class677 var6 = (class677) arg1;
            if (var6.field9684 != -1 && (var6.field1797 == 0 || var6.field1799 > 0)) {
                var6.method886(0, var6.field9684);
                var6.field9684 = -1;
            }
        } else if (arg1 instanceof class61) {
            class61 var7 = (class61) arg1;
            if (var7.field677 != -1 && (var7.field1797 == 0 || var7.field1799 > 0)) {
                int var8 = var7.field4042 - ((var7.field677 - class498.field6774 - class498.field6774) * 256);
                int var9 = var7.field4047 - ((var7.field686 - class613.field8555 - class613.field8555) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method886(0, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field677 = -1;
            }
        }
        return arg0 < 62 ? -118 : arg1.method885((byte) -111);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z", line = 102)
    public static final boolean method2500(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field6071++;
            return (arg1 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)[[[B", line = 113)
    public static final byte[][][] method2501(byte arg0, int arg1) {
        field6068++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
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
                if (var13 <= var130) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[0][3] = var14;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= (var19 >> 1)) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var21 >= 0 && var20.length > var21) {
                    if (var127 >= (var22 << 1)) {
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
                if (var25 >> 1 >= var126) {
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
                if ((var31 >> 1) >= var124) {
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
                if (var34 << 1 <= var123) {
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
                if (var122 <= (var37 >> 1)) {
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
                if (var121 >= var40 << 1) {
                    var38[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var38;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var43 >> 1 <= var120) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
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
                if (var117 <= (var52 << 1)) {
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
                if (var115 <= var58 << 1) {
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
                if (var61 >> 1 <= var114) {
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
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= var4 / 2) {
                    var69[var68] = -1;
                }
                var68++;
            }
        }
        var2[5][1] = var69;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if ((var3 / 2) <= var110) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if ((var4 / 2) <= var76) {
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
                if (var79 - (var4 / 2) >= var108) {
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
                if ((var82 - (var4 / 2)) >= var107) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var85 - (var4 / 2) >= var106) {
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
                if ((var88 - (var4 / 2)) >= var105) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= var91 - (var4 / 2)) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        byte[] var92 = new byte[var3 * var4];
        int var93 = 0;
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var103 >= (var94 - (var4 / 2))) {
                    var92[var93] = -1;
                }
                var93++;
            }
        }
        var2[7][1] = var92;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if ((var97 - (var4 / 2)) <= var102) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        if (arg0 != -1) {
            field6073 = null;
        }
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= (var100 - (var4 / 2))) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V", line = 893)
    public static void method2502(byte arg0) {
        int var1 = 109 / (arg0 / 63);
        field6073 = null;
        field6082 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 910)
    public static final void method2503(int arg0) {
        if (class540.field7304 == null) {
            class62 var1 = new class62();
            byte[] var2 = var1.method516(128, 128, 16, arg0 ^ 0x155A);
            class540.field7304 = class697.method3912(var2, 0, false);
        }
        if (arg0 != 5428) {
            field6073 = null;
        }
        field6077++;
        if (class703.field9950 == null) {
            class602 var3 = new class602();
            byte[] var4 = var3.method3391(128, 63, 16, 128);
            class703.field9950 = class697.method3912(var4, 0, false);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 946)
    public static final String method2504(String arg0, byte arg1) {
        field6076++;
        if (arg1 != -1) {
            field6082 = null;
        }
        String var2 = class171.method1210(-128, class664.method3757(-105, arg0));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(BIIIIIILvv;)V", line = 964)
    public class437(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class295 arg7) {
        this.field6072 = arg1;
        this.field6067 = arg7;
        this.field6079 = arg5;
        this.field6085 = arg6;
        this.field6080 = arg2;
        this.field6083 = arg0;
        this.field6070 = arg4;
        this.field6074 = arg3;
    }
}
