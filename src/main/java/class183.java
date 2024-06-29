import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class183 extends class408 {

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Ljava/awt/Frame;")
    public static Frame field2801;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "[[Lqj;")
    public static class511[][] field2805;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1293(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (class432.field6446 >= arg1 && arg2 >= class166.field2622) {
            boolean var6;
            if (arg3 < class497.field7073) {
                arg3 = class497.field7073;
                var6 = false;
            } else if (arg3 <= class391.field5895) {
                var6 = true;
            } else {
                arg3 = class391.field5895;
                var6 = false;
            }
            boolean var7;
            if (arg0 < class497.field7073) {
                var7 = false;
                arg0 = class497.field7073;
            } else if (class391.field5895 < arg0) {
                arg0 = class391.field5895;
                var7 = false;
            } else {
                var7 = true;
            }
            if (arg1 < class166.field2622) {
                arg1 = class166.field2622;
            } else {
                class238.method1577(arg5, class664.field9322[arg1++], arg0, arg3, (byte) -88);
            }
            if (class432.field6446 < arg2) {
                arg2 = class432.field6446;
            } else {
                class238.method1577(arg5, class664.field9322[arg2--], arg0, arg3, (byte) 121);
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg2; var8++) {
                    int[] var9 = class664.field9322[var8];
                    var9[arg3] = var9[arg0] = arg5;
                }
            } else if (var6) {
                for (int var10 = arg1; var10 <= arg2; var10++) {
                    class664.field9322[var10][arg3] = arg5;
                }
            } else if (var7) {
                for (int var11 = arg1; var11 <= arg2; var11++) {
                    class664.field9322[var11][arg0] = arg5;
                }
            }
        }
        field2804++;
        if (arg4 > -17) {
            method1298(102, -23);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([II[ILwu;IB)Lqp;")
    public static final class660 method1294(int[] arg0, int arg1, int[] arg2, class373 arg3, int arg4, byte arg5) {
        if (arg5 != -1) {
            return null;
        }
        field2806++;
        if (!arg3.method2311((byte) -13, class256.field3677, class39.field413)) {
            int[] var10 = new int[arg1 * arg4];
            for (int var11 = 0; var11 < arg1; var11++) {
                int var12 = arg4 * var11 + arg2[var11];
                for (int var13 = 0; var13 < arg0[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class660(arg3, arg4, arg1, var10);
        }
        byte[] var6 = new byte[arg1 * arg4];
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg4 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class660(arg3, arg4, arg1, var6);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(FZFF)F")
    public static final float method1295(float arg0, boolean arg1, float arg2, float arg3) {
        field2807++;
        return arg1 ? 0.69380397F : (arg2 - arg0) * arg3 + arg0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public static void method1296(boolean arg0) {
        field2801 = null;
        if (arg0) {
            field2805 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)[[[B")
    public static final byte[][][] method1297(byte arg0, int arg1) {
        field2808++;
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
                    if ((var22 << 1) <= var128) {
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
                if ((var25 >> 1) >= var127) {
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
                if (var121 >= var43 >> 1) {
                    var41[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var41;
        int var44 = 0;
        byte[] var45 = new byte[var3 * var4];
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 <= (var46 << 1)) {
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
                if ((var49 >> 1) <= var119) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
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
                if (var116 <= var58 << 1) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        int var59 = -9 / ((arg0 + 34) / 40);
        var2[4][1] = var57;
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
        byte[] var63 = new byte[var3 * var4];
        int var64 = 0;
        for (int var65 = 0; var65 < var4; var65++) {
            for (int var114 = var3 - 1; var114 >= 0; var114--) {
                if (var114 <= (var65 << 1)) {
                    var63[var64] = -1;
                }
                var64++;
            }
        }
        var2[4][3] = var63;
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
        int var69 = 0;
        byte[] var70 = new byte[var3 * var4];
        for (int var71 = 0; var71 < var4; var71++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var4 / 2) >= var71) {
                    var70[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var70;
        int var72 = 0;
        byte[] var73 = new byte[var3 * var4];
        for (int var74 = 0; var74 < var4; var74++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var111 >= (var3 / 2)) {
                    var73[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var73;
        int var75 = 0;
        byte[] var76 = new byte[var3 * var4];
        for (int var77 = 0; var77 < var4; var77++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var77 >= var4 / 2) {
                    var76[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var76;
        int var78 = 0;
        byte[] var79 = new byte[var3 * var4];
        for (int var80 = 0; var80 < var4; var80++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if ((var80 - (var4 / 2)) >= var109) {
                    var79[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var79;
        int var81 = 0;
        byte[] var82 = new byte[var3 * var4];
        for (int var83 = var4 - 1; var83 >= 0; var83--) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var83 - var4 / 2 >= var108) {
                    var82[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var82;
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
        byte[] var87 = new byte[var3 * var4];
        int var88 = 0;
        for (int var89 = 0; var89 < var4; var89++) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= (var89 - (var4 / 2))) {
                    var87[var88] = -1;
                }
                var88++;
            }
        }
        var2[6][3] = var87;
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
        byte[] var93 = new byte[var3 * var4];
        int var94 = 0;
        for (int var95 = var4 - 1; var95 >= 0; var95--) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= (var95 - var4 / 2)) {
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
                if (var98 - (var4 / 2) <= var103) {
                    var96[var97] = -1;
                }
                var97++;
            }
        }
        var2[7][2] = var96;
        byte[] var99 = new byte[var3 * var4];
        int var100 = 0;
        for (int var101 = 0; var101 < var4; var101++) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= (var101 - (var4 / 2))) {
                    var99[var100] = -1;
                }
                var100++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
    public static final void method1298(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        if (class152.field2350 == 0) {
            class520.field7449.method2127(arg1, true);
        } else {
            class758.field10600 = arg1;
        }
        field2802++;
    }
}
