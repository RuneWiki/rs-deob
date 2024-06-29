import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class472 {

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public int field6849;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public int field6855;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public int field6850;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public int field6847;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field6844 = -1;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field6851 = 0;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "Lcb;")
    public static class631 field6853 = new class631(69, 3);

    @OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
    public static int field6857 = 0;

    @OriginalMember(owner = "client!ln", name = "o", descriptor = "[Lfa;")
    public static class564[] field6858 = new class564[5];

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field6845;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field6846;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field6848;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field6854;

    @OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
    public static int field6856;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "[I")
    public static int[] field6852;

    static {
        for (int var0 = 0; var0 < field6858.length; var0++) {
            field6858[var0] = new class564();
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lla;BLla;Lla;Len;Lul;)Z", line = 3)
    public static final boolean method2875(class422 arg0, byte arg1, class422 arg2, class422 arg3, class107 arg4, class363 arg5) {
        field6856++;
        class556.field7918 = arg4;
        class104.field1539 = new int[16];
        class208.field3480 = arg5;
        class412.field6072 = arg0;
        class274.field4188 = arg3;
        class476.field6912 = arg2;
        int var6 = 0;
        if (arg1 <= 98) {
            method2878(true, null, 58);
        }
        while (var6 < 16) {
            class104.field1539[var6] = 255;
            var6++;
        }
        return true;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(BI)[[[B", line = 38)
    public static final byte[][][] method2876(byte arg0, int arg1) {
        field6848++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
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
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var132 = 0; var132 < var4; var132++) {
                if (var132 <= var10) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var131 = 0; var131 < var3; var131++) {
                if (var131 >= var13) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        var2[0][2] = var12;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var16 <= var130) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var19 >> 1 >= var129) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var20 >= 0 && var21.length > var20) {
                    if (var128 >= var22 << 1) {
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
                if (var127 <= var25 >> 1) {
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
                if ((var28 << 1) <= var126) {
                    var27[var26] = -1;
                }
                var26++;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var125 <= (var31 >> 1)) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var124 = 0; var124 < var3; var124++) {
                if ((var34 << 1) <= var124) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 <= var37 >> 1) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var122 = var3 - 1; var122 >= 0; var122--) {
                if (var122 >= (var40 << 1)) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var121 = 0; var121 < var3; var121++) {
                if (var43 >> 1 <= var121) {
                    var41[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var41;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var46 << 1 >= var120) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        int var47 = 0;
        byte[] var48 = new byte[var3 * var4];
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var119 = var3 - 1; var119 >= 0; var119--) {
                if (var119 >= (var49 >> 1)) {
                    var48[var47] = -1;
                }
                var47++;
            }
        }
        var2[3][2] = var48;
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if ((var52 << 1) >= var118) {
                    var51[var50] = -1;
                }
                var50++;
            }
        }
        var2[3][3] = var51;
        int var53 = 0;
        byte[] var54 = new byte[var3 * var4];
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var55 >> 1) <= var117) {
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
                if (var116 <= (var58 << 1)) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        var2[4][1] = var57;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 >= var61 >> 1) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var114 = var3 - 1; var114 >= 0; var114--) {
                if ((var64 << 1) >= var114) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var113 = 0; var113 < var3; var113++) {
                if (var113 <= var3 / 2) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var4 / 2) >= var70) {
                    var68[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var68;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if ((var3 / 2) <= var111) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var76 >= var4 / 2) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        int var79 = -51 % ((-arg0 - 72) / 38);
        for (int var80 = 0; var80 < var4; var80++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var80 - (var4 / 2) >= var109) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        byte[] var81 = new byte[var3 * var4];
        int var82 = 0;
        for (int var83 = var4 - 1; var83 >= 0; var83--) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= (var83 - (var4 / 2))) {
                    var81[var82] = -1;
                }
                var82++;
            }
        }
        var2[6][1] = var81;
        int var84 = 0;
        byte[] var85 = new byte[var3 * var4];
        for (int var86 = var4 - 1; var86 >= 0; var86--) {
            for (int var107 = var3 - 1; var107 >= 0; var107--) {
                if (var107 <= (var86 - (var4 / 2))) {
                    var85[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var85;
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
                if ((var92 - (var4 / 2)) <= var105) {
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
                if ((var95 - (var4 / 2)) <= var104) {
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
        byte[] var99 = new byte[var3 * var4];
        int var100 = 0;
        for (int var101 = 0; var101 < var4; var101++) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if ((var101 - (var4 / 2)) <= var102) {
                    var99[var100] = -1;
                }
                var100++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!ln", name = "toString", descriptor = "()Ljava/lang/String;", line = 814)
    public final String toString() {
        field6854++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V", line = 826)
    public static void method2877(int arg0) {
        field6858 = null;
        field6852 = null;
        field6853 = null;
        if (arg0 != -7662) {
            method2877(-35);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z[Lraa;I)V", line = 843)
    public static final void method2878(boolean arg0, class353[] arg1, int arg2) {
        field6846++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class353 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field5306 == 0) {
                    if (var4.field5335 != null) {
                        method2878(arg0, var4.field5335, arg2);
                    }
                    class520 var5 = (class520) class36.field340.method3512(true, (long) var4.field5349);
                    if (var5 != null) {
                        class101.method834(false, arg2, var5.field7511);
                    }
                }
                if (arg2 == 0 && var4.field5223 != null) {
                    class700 var6 = new class700();
                    var6.field9902 = var4;
                    var6.field9891 = var4.field5223;
                    class464.method2838(var6);
                }
                if (arg2 == 1 && var4.field5208 != null) {
                    if (var4.field5352 >= 0) {
                        class353 var7 = class65.method638(var4.field5349, 1668949296);
                        if (var7 == null || var7.field5335 == null || var7.field5335.length <= var4.field5352 || var7.field5335[var4.field5352] != var4) {
                            continue;
                        }
                    }
                    class700 var8 = new class700();
                    var8.field9891 = var4.field5208;
                    var8.field9902 = var4;
                    class464.method2838(var8);
                }
            }
        }
        if (!arg0) {
            field6852 = null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(IIII)V", line = 914)
    public class472(int arg0, int arg1, int arg2, int arg3) {
        this.field6849 = arg1;
        this.field6855 = arg3;
        this.field6850 = arg2;
        this.field6847 = arg0;
    }
}
