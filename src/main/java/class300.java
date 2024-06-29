import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class300 {

    @OriginalMember(owner = "client!io", name = "e", descriptor = "Llh;")
    private class364 field4272 = new class364(64);

    @OriginalMember(owner = "client!io", name = "f", descriptor = "Lhh;")
    private class84 field4273;

    @OriginalMember(owner = "client!io", name = "l", descriptor = "Lhh;")
    public class84 field4279;

    @OriginalMember(owner = "client!io", name = "c", descriptor = "Lgf;")
    public static class180 field4270 = new class180("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!io", name = "a", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!io", name = "g", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!io", name = "h", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!io", name = "j", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!io", name = "k", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!io", name = "i", descriptor = "Lhh;")
    public static class84 field4276;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILti;)V", line = 3)
    public static final void method1850(int arg0, class303 arg1) {
        field4271++;
        byte[] var2 = new byte[24];
        if (class319.field4566 != null) {
            try {
                class319.field4566.method1755(0L, -1);
                class319.field4566.method1749(1, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1876(0, 4, var2, 24);
        if (arg0 > -57) {
            field4270 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 65)
    public final void method1851(int arg0) {
        field4278++;
        class364 var2 = this.field4272;
        synchronized (this.field4272) {
            this.field4272.method2349(arg0);
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(I)V", line = 76)
    public static void method1852(int arg0) {
        int var1 = -21 % ((4 - arg0) / 36);
        field4270 = null;
        field4276 = null;
    }

    @OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V", line = 86)
    public final void method1853(int arg0) {
        class364 var2 = this.field4272;
        synchronized (this.field4272) {
            this.field4272.method2350((byte) 112);
        }
        field4269++;
        int var3 = -36 / ((arg0 - 29) / 33);
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(II)Lbu;", line = 98)
    public final class17 method1854(int arg0, int arg1) {
        field4277++;
        class364 var3 = this.field4272;
        class17 var4;
        synchronized (this.field4272) {
            var4 = (class17) this.field4272.method2339(-102, (long) arg0);
            if (arg1 != 1471) {
                this.field4279 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4273.method683(3, arg0, 5);
        class17 var6 = new class17();
        var6.field264 = this;
        if (var5 != null) {
            var6.method160(new class303(var5), arg1 - 1535);
        }
        class364 var7 = this.field4272;
        synchronized (this.field4272) {
            this.field4272.method2342((long) arg0, var6, arg1 - 1371);
            return var6;
        }
    }

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(II)[[[B", line = 131)
    public static final byte[][][] method1855(int arg0, int arg1) {
        field4274++;
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
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var131 <= var10) {
                    var8[var9] = -1;
                }
                var9++;
            }
        }
        var2[0][1] = var8;
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
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
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
                if (var21 >= 0 && var21 < var20.length) {
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
        int var23 = 0;
        byte[] var24 = new byte[var3 * var4];
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if ((var25 >> 1) >= var126) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        int var26 = 0;
        if (arg0 != 32705) {
            field4270 = null;
        }
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
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var31 >> 1 >= var124) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= var34 << 1) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var122 <= var37 >> 1) {
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
                if ((var40 << 1) <= var121) {
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
                if ((var43 >> 1) <= var120) {
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
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var52 << 1) >= var117) {
                    var51[var50] = -1;
                }
                var50++;
            }
        }
        var2[3][3] = var51;
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
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= var58 << 1) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if ((var61 >> 1) <= var114) {
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
                if (var64 << 1 >= var113) {
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
                if (var4 / 2 >= var70) {
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
                if (var3 / 2 <= var110) {
                    var72[var71] = -1;
                }
                var71++;
            }
        }
        var2[5][2] = var72;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= (var4 / 2)) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if ((var79 - var4 / 2) >= var108) {
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
                if (var107 <= (var82 - (var4 / 2))) {
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
                if (var105 <= (var88 - (var4 / 2))) {
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
                if (var101 >= var100 - (var4 / 2)) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(BI)V", line = 904)
    public final void method1856(byte arg0, int arg1) {
        class364 var3 = this.field4272;
        synchronized (this.field4272) {
            if (arg0 > -42) {
                return;
            }
            this.field4272.method2348(arg1, -127);
        }
        field4268++;
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lmt;ILhh;Lhh;)V", line = 919)
    public class300(class271 arg0, int arg1, class84 arg2, class84 arg3) {
        this.field4273 = arg2;
        this.field4279 = arg3;
        this.field4273.method656((byte) 122, 3);
    }
}
