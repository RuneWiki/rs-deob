import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class class402 {

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "Lo;")
    public static class332 field5868 = new class332("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!tn", name = "g", descriptor = "Lre;")
    public static class446 field5871 = new class446(new byte[5000]);

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "[I")
    public static int[] field5874;

    @OriginalMember(owner = "client!tn", name = "h", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "F")
    public static float field5873;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public int field5865;

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "I")
    public int field5866;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field5867;

    @OriginalMember(owner = "client!tn", name = "f", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
    public int[] field5869;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
    public abstract void method2358(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V")
    public static void method2406(byte arg0) {
        field5871 = null;
        field5874 = null;
        int var1 = 46 / ((arg0 + 65) / 61);
        field5868 = null;
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method2356(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public abstract void method2360(int arg0, int arg1, byte arg2, Graphics arg3);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(II)[[[B")
    public static final byte[][][] method2407(int arg0, int arg1) {
        field5867++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
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
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 <= (var19 >> 1)) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var21 >= 0 && var20.length > var21) {
                    if (var128 >= var22 << 1) {
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
            for (int var127 = var3 - 1; var127 >= 0; var127--) {
                if ((var25 >> 1) >= var127) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var28 << 1 <= var126) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
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
                if (var34 << 1 <= var124) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
        byte[] var35 = new byte[var3 * var4];
        int var36 = 0;
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var37 >> 1 >= var123) {
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
                if ((var43 >> 1) <= var121) {
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
                if (var118 <= (var52 << 1)) {
                    var51[var50] = -1;
                }
                var50++;
            }
        }
        var2[3][3] = var51;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var117 >= var55 >> 1) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        int var56 = 34 / ((-arg1 - 78) / 41);
        var2[4][0] = var53;
        int var57 = 0;
        byte[] var58 = new byte[var3 * var4];
        for (int var59 = var4 - 1; var59 >= 0; var59--) {
            for (int var116 = 0; var116 < var3; var116++) {
                if ((var59 << 1) >= var116) {
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
                if ((var62 >> 1) <= var115) {
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
                if (var113 <= var3 / 2) {
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
                if ((var4 / 2) >= var71) {
                    var69[var70] = -1;
                }
                var70++;
            }
        }
        var2[5][1] = var69;
        int var72 = 0;
        byte[] var73 = new byte[var3 * var4];
        for (int var74 = 0; var74 < var4; var74++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var111 >= var3 / 2) {
                    var73[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var73;
        byte[] var75 = new byte[var3 * var4];
        int var76 = 0;
        for (int var77 = 0; var77 < var4; var77++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if ((var4 / 2) <= var77) {
                    var75[var76] = -1;
                }
                var76++;
            }
        }
        var2[5][3] = var75;
        int var78 = 0;
        byte[] var79 = new byte[var3 * var4];
        for (int var80 = 0; var80 < var4; var80++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var109 <= (var80 - var4 / 2)) {
                    var79[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var79;
        byte[] var81 = new byte[var3 * var4];
        int var82 = 0;
        for (int var83 = var4 - 1; var83 >= 0; var83--) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var108 <= var83 - var4 / 2) {
                    var81[var82] = -1;
                }
                var82++;
            }
        }
        var2[6][1] = var81;
        byte[] var84 = new byte[var3 * var4];
        int var85 = 0;
        for (int var86 = var4 - 1; var86 >= 0; var86--) {
            for (int var107 = var3 - 1; var107 >= 0; var107--) {
                if (var107 <= var86 - (var4 / 2)) {
                    var84[var85] = -1;
                }
                var85++;
            }
        }
        var2[6][2] = var84;
        byte[] var87 = new byte[var3 * var4];
        int var88 = 0;
        for (int var89 = 0; var89 < var4; var89++) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if ((var89 - (var4 / 2)) >= var106) {
                    var87[var88] = -1;
                }
                var88++;
            }
        }
        var2[6][3] = var87;
        int var90 = 0;
        byte[] var91 = new byte[var3 * var4];
        for (int var92 = 0; var92 < var4; var92++) {
            for (int var105 = 0; var105 < var3; var105++) {
                if (var105 >= var92 - (var4 / 2)) {
                    var91[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var91;
        byte[] var93 = new byte[var3 * var4];
        int var94 = 0;
        for (int var95 = var4 - 1; var95 >= 0; var95--) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= var95 - (var4 / 2)) {
                    var93[var94] = -1;
                }
                var94++;
            }
        }
        var2[7][1] = var93;
        byte[] var96 = new byte[var3 * var4];
        int var97 = 0;
        for (int var98 = var4 - 1; var98 >= 0; var98--) {
            for (int var103 = var3 - 1; var103 >= 0; var103--) {
                if (var103 >= (var98 - (var4 / 2))) {
                    var96[var97] = -1;
                }
                var97++;
            }
        }
        var2[7][2] = var96;
        int var99 = 0;
        byte[] var100 = new byte[var3 * var4];
        for (int var101 = 0; var101 < var4; var101++) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if ((var101 - (var4 / 2)) <= var102) {
                    var100[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var100;
        return var2;
    }

    static {
        new class332("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field5874 = new int[1000];
        field5872 = 0;
    }
}
