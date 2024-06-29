import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class370 extends class472 {

    @OriginalMember(owner = "client!to", name = "m", descriptor = "Ljava/util/Calendar;")
    public static Calendar field5235 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!to", name = "r", descriptor = "Z")
    public static boolean field5240 = false;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public int field5231;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public int field5238;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public int field5239;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "Lkj;")
    public class280 field5232;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "Lfc;")
    public static class343 field5237;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "[Lbm;")
    public class219[] field5233;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IZLkm;I)Z", line = 4)
    public final boolean method2220(int arg0, boolean arg1, class487 arg2, int arg3) {
        field5234++;
        if (!arg1) {
            field5237 = null;
        }
        if (this.field5233 != null) {
            for (int var5 = 0; var5 < this.field5233.length; var5++) {
                if (this.field5233[var5].method1389(arg3, arg0) && this.field5232.method199(arg2, (byte) 124, arg0, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIIIIII)V", line = 32)
    public static final void method2221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 == arg3 && arg6 == arg9 && arg0 == arg2 && arg4 == arg5) {
            class41.method338(arg9, (byte) -104, arg3, arg2, arg7, arg5);
        } else {
            int var10 = arg3;
            int var11 = arg9;
            int var12 = arg3 * 3;
            int var13 = arg9 * 3;
            int var14 = arg1 * 3;
            int var15 = arg6 * 3;
            int var16 = arg0 * 3;
            int var17 = arg4 * 3;
            int var18 = arg2 + var14 - var16 - arg3;
            int var19 = var15 + arg5 - var17 - arg9;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var29 + var31 >> 12) + arg3;
                int var34 = (var28 + var32 + var30 >> 12) + arg9;
                class41.method338(var11, (byte) -115, var10, var33, arg7, var34);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg8 != 488754572) {
            field5237 = null;
        }
        field5241++;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)[[[B", line = 107)
    public static final byte[][][] method2222(int arg0, int arg1) {
        field5236++;
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
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var132 = 0; var132 < var4; var132++) {
                if (var10 >= var132) {
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
                if (var13 <= var131) {
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
                if (var130 >= var16) {
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
                if (var129 <= var19 >> 1) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        int var22 = 0;
        int var23 = -31 / ((arg0 - 57) / 42);
        while (var4 > var22) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var20 >= 0 && var20 < var21.length) {
                    if (var128 >= (var22 << 1)) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
            var22++;
        }
        var2[1][1] = var21;
        int var24 = 0;
        byte[] var25 = new byte[var3 * var4];
        for (int var26 = 0; var26 < var4; var26++) {
            for (int var127 = var3 - 1; var127 >= 0; var127--) {
                if ((var26 >> 1) >= var127) {
                    var25[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var25;
        int var27 = 0;
        byte[] var28 = new byte[var3 * var4];
        for (int var29 = var4 - 1; var29 >= 0; var29--) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 >= var29 << 1) {
                    var28[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var28;
        byte[] var30 = new byte[var3 * var4];
        int var31 = 0;
        for (int var32 = var4 - 1; var32 >= 0; var32--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var125 <= (var32 >> 1)) {
                    var30[var31] = -1;
                }
                var31++;
            }
        }
        var2[2][0] = var30;
        int var33 = 0;
        byte[] var34 = new byte[var3 * var4];
        for (int var35 = var4 - 1; var35 >= 0; var35--) {
            for (int var124 = 0; var124 < var3; var124++) {
                if ((var35 << 1) <= var124) {
                    var34[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var34;
        int var36 = 0;
        byte[] var37 = new byte[var3 * var4];
        for (int var38 = 0; var38 < var4; var38++) {
            for (int var123 = 0; var123 < var3; var123++) {
                if ((var38 >> 1) >= var123) {
                    var37[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var37;
        byte[] var39 = new byte[var3 * var4];
        int var40 = 0;
        for (int var41 = 0; var41 < var4; var41++) {
            for (int var122 = var3 - 1; var122 >= 0; var122--) {
                if (var122 >= (var41 << 1)) {
                    var39[var40] = -1;
                }
                var40++;
            }
        }
        var2[2][3] = var39;
        int var42 = 0;
        byte[] var43 = new byte[var3 * var4];
        for (int var44 = var4 - 1; var44 >= 0; var44--) {
            for (int var121 = 0; var121 < var3; var121++) {
                if (var121 >= var44 >> 1) {
                    var43[var42] = -1;
                }
                var42++;
            }
        }
        var2[3][0] = var43;
        byte[] var45 = new byte[var3 * var4];
        int var46 = 0;
        for (int var47 = 0; var47 < var4; var47++) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 <= (var47 << 1)) {
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
        byte[] var51 = new byte[var3 * var4];
        int var52 = 0;
        for (int var53 = var4 - 1; var53 >= 0; var53--) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if ((var53 << 1) >= var118) {
                    var51[var52] = -1;
                }
                var52++;
            }
        }
        var2[3][3] = var51;
        int var54 = 0;
        byte[] var55 = new byte[var3 * var4];
        for (int var56 = var4 - 1; var56 >= 0; var56--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var56 >> 1) <= var117) {
                    var55[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var55;
        int var57 = 0;
        byte[] var58 = new byte[var3 * var4];
        for (int var59 = var4 - 1; var59 >= 0; var59--) {
            for (int var116 = 0; var116 < var3; var116++) {
                if (var116 <= (var59 << 1)) {
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
                if (var62 >> 1 <= var115) {
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
                if (var65 << 1 >= var114) {
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
                if (var3 / 2 >= var113) {
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
                if (var71 <= (var4 / 2)) {
                    var70[var69] = -1;
                }
                var69++;
            }
        }
        var2[5][1] = var70;
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
        byte[] var75 = new byte[var3 * var4];
        int var76 = 0;
        for (int var77 = 0; var77 < var4; var77++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var77 >= var4 / 2) {
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
                if (var80 - (var4 / 2) >= var109) {
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
                if (var108 <= (var83 - var4 / 2)) {
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
                if ((var86 - (var4 / 2)) >= var107) {
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
                if (var106 <= var89 - (var4 / 2)) {
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
                if (var103 >= (var98 - (var4 / 2))) {
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
                if (var101 - var4 / 2 <= var102) {
                    var100[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var100;
        return var2;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V", line = 887)
    public static void method2223(int arg0) {
        if (arg0 != 0) {
            field5235 = null;
        }
        field5237 = null;
        field5235 = null;
    }
}
