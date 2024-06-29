import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public abstract class class679 {

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
    private int field9354 = 4;

    @OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
    private int field9359 = 4;

    @OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
    private int field9363 = 0;

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
    public int field9356 = 4;

    @OriginalMember(owner = "client!vca", name = "f", descriptor = "[S")
    private short[] field9358 = new short[512];

    @OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
    private int field9362 = 4;

    @OriginalMember(owner = "client!vca", name = "h", descriptor = "Lft;")
    public static class285 field9360 = new class285(14, 6);

    @OriginalMember(owner = "client!vca", name = "m", descriptor = "Lnj;")
    public static class415 field9365 = new class415(41, 3);

    @OriginalMember(owner = "client!vca", name = "n", descriptor = "Lra;")
    public static class361 field9366 = new class361(33, 6);

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
    public static int field9353;

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!vca", name = "i", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!vca", name = "l", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "[Lru;")
    public static class231[] field9367;

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "[S")
    private short[] field9357;

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
    public static void method3731(int arg0) {
        field9365 = null;
        field9367 = null;
        if (arg0 != 19119) {
            method3732(123, (byte) -26);
        }
        field9366 = null;
        field9360 = null;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IB)[[[B")
    public static final byte[][][] method3732(int arg0, byte arg1) {
        field9364++;
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
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if ((var19 >> 1) >= var129) {
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
                if (var20 >= 0 && var21.length > var20) {
                    if (var128 >= (var22 << 1)) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var127 = var3 - 1; var127 >= 0; var127--) {
                if (var127 <= var25 >> 1) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var28 << 1 <= var126) {
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
                if (var125 <= var31 >> 1) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        int var32 = 0;
        byte[] var33 = new byte[var3 * var4];
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var124 = 0; var124 < var3; var124++) {
                if (var34 << 1 <= var124) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 <= var37 >> 1) {
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
                if (var122 >= var40 << 1) {
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
                if (var121 >= var43 >> 1) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 <= (var46 << 1)) {
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
                if (var49 >> 1 <= var119) {
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
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var55 >> 1 <= var117) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
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
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 >= (var61 >> 1)) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        int var62 = 0;
        byte[] var63 = new byte[var3 * var4];
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var114 = var3 - 1; var114 >= 0; var114--) {
                if (var114 <= var64 << 1) {
                    var63[var62] = -1;
                }
                var62++;
            }
        }
        var2[4][3] = var63;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var113 = 0; var113 < var3; var113++) {
                if ((var3 / 2) >= var113) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var4 / 2 >= var70) {
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
                if (var109 <= (var79 - (var4 / 2))) {
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
                if (var82 - (var4 / 2) >= var108) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        int var83 = -53 % ((arg1 + 83) / 34);
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
        int var87 = 0;
        byte[] var88 = new byte[var3 * var4];
        for (int var89 = 0; var89 < var4; var89++) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if ((var89 - (var4 / 2)) >= var106) {
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
                if (var103 >= (var98 - (var4 / 2))) {
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
                if (var101 - (var4 / 2) <= var102) {
                    var99[var100] = -1;
                }
                var100++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V")
    public abstract void method2345(int arg0);

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
    public abstract void method2343(byte arg0);

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(B)V")
    private final void method3733(byte arg0) {
        this.field9357 = new short[this.field9356];
        field9355++;
        for (int var2 = 0; var2 < this.field9356; var2++) {
            this.field9357[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 <= 117) {
            this.field9359 = -5;
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIII)V")
    public final void method3734(int arg0, int arg1, int arg2, int arg3) {
        field9361++;
        if (arg2 != 255) {
            field9366 = null;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method2343((byte) -72);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field9356; var14++) {
                        int var15 = this.field9357[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = this.field9354 * var15 >> 12;
                        int var19 = this.field9362 * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = this.field9359 * var15 >> 12;
                        int var22 = this.field9354 * var17;
                        int var23 = this.field9362 * var20;
                        int var24 = this.field9359 * var16;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33;
                        if (var21 > var26) {
                            var33 = var26 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var24 & 0xFFF;
                        int var35 = var22 & 0xFFF;
                        int var36;
                        if (var29 < var19) {
                            var36 = var29 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        int var37 = var23 & 0xFFF;
                        int var38;
                        if (var32 >= var18) {
                            var38 = 0;
                        } else {
                            var38 = var32 & 0xFF;
                        }
                        int var39 = var30 & 0xFF;
                        int var40 = class322.field4163[var37];
                        short var41 = this.field9358[var38];
                        short var42 = this.field9358[var39];
                        int var43 = class322.field4163[var34];
                        int var44 = var37 - 4096;
                        int var45 = var34 - 4096;
                        int var46 = var35 - 4096;
                        int var47 = class322.field4163[var35];
                        short var48 = this.field9358[var36 + var42];
                        short var49 = this.field9358[var36 + var41];
                        short var50 = this.field9358[var31 + var42];
                        short var51 = this.field9358[var31 + var41];
                        int var52 = class52.method459(var35, var37, this.field9358[var28 + var50], var34, arg2 - 338);
                        int var53 = class52.method459(var35, var37, this.field9358[var33 + var50], var45, arg2 - 209);
                        int var54 = ((var53 - var52) * var43 >> 12) + var52;
                        int var55 = class52.method459(var35, var44, this.field9358[var28 + var48], var34, -103);
                        int var56 = class52.method459(var35, var44, this.field9358[var33 + var48], var45, -86);
                        int var57 = var55 + ((var56 - var55) * var43 >> 12);
                        int var58 = class52.method459(var46, var37, this.field9358[var28 + var51], var34, 108);
                        int var59 = ((var57 - var54) * var40 >> 12) + var54;
                        int var60 = class52.method459(var46, var37, this.field9358[var33 + var51], var45, -93);
                        int var61 = ((var60 - var58) * var43 >> 12) + var58;
                        int var62 = class52.method459(var46, var44, this.field9358[var28 + var49], var34, 68);
                        int var63 = class52.method459(var46, var44, this.field9358[var33 + var49], var45, -111);
                        int var64 = ((var63 - var62) * var43 >> 12) + var62;
                        int var65 = ((var64 - var61) * var40 >> 12) + var61;
                        this.method2344(var59 + ((var65 - var59) * var47 >> 12), var14, true);
                    }
                    this.method2345(-1810733887);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIZ)V")
    public abstract void method2344(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!vca", name = "c", descriptor = "(B)V")
    private final void method3735(byte arg0) {
        field9353++;
        Random var2 = new Random((long) this.field9363);
        int var3 = 0;
        if (arg0 < 16) {
            return;
        }
        while (var3 < 255) {
            this.field9358[var3] = (short) var3;
            var3++;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class562.method3002((byte) -14, var2, var5);
            short var7 = this.field9358[var6];
            this.field9358[var6] = this.field9358[var5];
            this.field9358[var5] = this.field9358[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(IIIII)V")
    public class679(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9362 = arg3;
        this.field9359 = arg2;
        this.field9356 = arg1;
        this.field9363 = arg0;
        this.field9354 = arg4;
        this.method3733((byte) 124);
        this.method3735((byte) 110);
    }
}
