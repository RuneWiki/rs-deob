import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class463 extends class407 {

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "[I")
    private int[] field6407 = new int[512];

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "Lcu;")
    public static class145 field6409 = new class145(14, -1);

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(FIF[FIFIIIIF)V")
    public final void method2368(float arg0, int arg1, float arg2, float[] arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, float arg10) {
        field6405++;
        int var12 = (int) ((float) arg9 * arg0 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg1 * arg5 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg4 * arg10 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg7 * arg10;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        float var24 = class196.method1276(20365, var21);
        int var25 = var19 & var17;
        int var26 = this.field6407[var25];
        int var27 = this.field6407[var23];
        for (int var28 = arg8; var28 < arg1; var28++) {
            float var29 = (float) var28 * arg5;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            int var35 = var31 & var15;
            float var36 = class196.method1276(20365, var32);
            int var37 = this.field6407[var26 + var34];
            int var38 = this.field6407[var26 + var35];
            int var39 = this.field6407[var27 + var34];
            int var40 = this.field6407[var27 + var35];
            for (int var41 = 0; var41 < arg9; var41++) {
                float var42 = (float) var41 * arg0;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                float var48 = class196.method1276(20365, var45);
                int var49 = var44 & var13;
                arg3[arg6++] = class135.method952(class135.method952(class135.method952(class280.method1671((byte) 54, var46, var22, class494.method2839(7, this.field6407[var37 + var47]), var33), arg8 + 520, class280.method1671((byte) 38, var45, var22, class494.method2839(7, this.field6407[var37 + var49]), var33), var48), 520, class135.method952(class280.method1671((byte) 119, var46, var22, class494.method2839(7, this.field6407[var38 + var47]), var32), 520, class280.method1671((byte) 94, var45, var22, class494.method2839(7, this.field6407[var49 + var38]), var32), var48), var36), 520, class135.method952(class135.method952(class280.method1671((byte) 65, var46, var21, class494.method2839(7, this.field6407[var39 + var47]), var33), 520, class280.method1671((byte) 119, var45, var21, class494.method2839(this.field6407[var39 + var49], 7), var33), var48), 520, class135.method952(class280.method1671((byte) 100, var46, var21, class494.method2839(7, this.field6407[var40 + var47]), var32), 520, class280.method1671((byte) 95, var45, var21, class494.method2839(7, this.field6407[var40 + var49]), var32), var48), var36), var24) * arg2;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)[[[B")
    public static final byte[][][] method2640(byte arg0, int arg1) {
        field6406++;
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
        int var8 = -34 / ((arg0 - 49) / 35);
        var2[0][0] = var5;
        byte[] var9 = new byte[var3 * var4];
        int var10 = 0;
        for (int var11 = var4 - 1; var11 >= 0; var11--) {
            for (int var132 = 0; var132 < var4; var132++) {
                if (var11 >= var132) {
                    var9[var10] = -1;
                }
                var10++;
            }
        }
        var2[0][1] = var9;
        byte[] var12 = new byte[var3 * var4];
        int var13 = 0;
        for (int var14 = 0; var14 < var4; var14++) {
            for (int var131 = 0; var131 < var3; var131++) {
                if (var131 >= var14) {
                    var12[var13] = -1;
                }
                var13++;
            }
        }
        var2[0][2] = var12;
        byte[] var15 = new byte[var3 * var4];
        int var16 = 0;
        for (int var17 = var4 - 1; var17 >= 0; var17--) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var130 >= var17) {
                    var15[var16] = -1;
                }
                var16++;
            }
        }
        var2[0][3] = var15;
        byte[] var18 = new byte[var3 * var4];
        int var19 = 0;
        for (int var20 = var4 - 1; var20 >= 0; var20--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var20 >> 1 >= var129) {
                    var18[var19] = -1;
                }
                var19++;
            }
        }
        var2[1][0] = var18;
        int var21 = 0;
        byte[] var22 = new byte[var3 * var4];
        for (int var23 = 0; var23 < var4; var23++) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var21 >= 0 && var21 < var22.length) {
                    if ((var23 << 1) <= var128) {
                        var22[var21] = -1;
                    }
                    var21++;
                } else {
                    var21++;
                }
            }
        }
        var2[1][1] = var22;
        int var24 = 0;
        byte[] var25 = new byte[var3 * var4];
        for (int var26 = 0; var26 < var4; var26++) {
            for (int var127 = var3 - 1; var127 >= 0; var127--) {
                if (var127 <= (var26 >> 1)) {
                    var25[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var25;
        byte[] var27 = new byte[var3 * var4];
        int var28 = 0;
        for (int var29 = var4 - 1; var29 >= 0; var29--) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 >= var29 << 1) {
                    var27[var28] = -1;
                }
                var28++;
            }
        }
        var2[1][3] = var27;
        int var30 = 0;
        byte[] var31 = new byte[var3 * var4];
        for (int var32 = var4 - 1; var32 >= 0; var32--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var125 <= var32 >> 1) {
                    var31[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var31;
        int var33 = 0;
        byte[] var34 = new byte[var3 * var4];
        for (int var35 = var4 - 1; var35 >= 0; var35--) {
            for (int var124 = 0; var124 < var3; var124++) {
                if (var124 >= var35 << 1) {
                    var34[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var34;
        byte[] var36 = new byte[var3 * var4];
        int var37 = 0;
        for (int var38 = 0; var38 < var4; var38++) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 <= var38 >> 1) {
                    var36[var37] = -1;
                }
                var37++;
            }
        }
        var2[2][2] = var36;
        int var39 = 0;
        byte[] var40 = new byte[var3 * var4];
        for (int var41 = 0; var41 < var4; var41++) {
            for (int var122 = var3 - 1; var122 >= 0; var122--) {
                if (var122 >= var41 << 1) {
                    var40[var39] = -1;
                }
                var39++;
            }
        }
        var2[2][3] = var40;
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
        int var45 = 0;
        byte[] var46 = new byte[var3 * var4];
        for (int var47 = 0; var47 < var4; var47++) {
            for (int var120 = 0; var120 < var3; var120++) {
                if ((var47 << 1) >= var120) {
                    var46[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var46;
        byte[] var48 = new byte[var3 * var4];
        int var49 = 0;
        for (int var50 = 0; var50 < var4; var50++) {
            for (int var119 = var3 - 1; var119 >= 0; var119--) {
                if (var50 >> 1 <= var119) {
                    var48[var49] = -1;
                }
                var49++;
            }
        }
        var2[3][2] = var48;
        int var51 = 0;
        byte[] var52 = new byte[var3 * var4];
        for (int var53 = var4 - 1; var53 >= 0; var53--) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 <= var53 << 1) {
                    var52[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var52;
        byte[] var54 = new byte[var3 * var4];
        int var55 = 0;
        for (int var56 = var4 - 1; var56 >= 0; var56--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if (var56 >> 1 <= var117) {
                    var54[var55] = -1;
                }
                var55++;
            }
        }
        var2[4][0] = var54;
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
        byte[] var60 = new byte[var3 * var4];
        int var61 = 0;
        for (int var62 = 0; var62 < var4; var62++) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 >= (var62 >> 1)) {
                    var60[var61] = -1;
                }
                var61++;
            }
        }
        var2[4][2] = var60;
        int var63 = 0;
        byte[] var64 = new byte[var3 * var4];
        for (int var65 = 0; var65 < var4; var65++) {
            for (int var114 = var3 - 1; var114 >= 0; var114--) {
                if (var114 <= (var65 << 1)) {
                    var64[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var64;
        int var66 = 0;
        byte[] var67 = new byte[var3 * var4];
        for (int var68 = 0; var68 < var4; var68++) {
            for (int var113 = 0; var113 < var3; var113++) {
                if (var3 / 2 >= var113) {
                    var67[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var67;
        int var69 = 0;
        byte[] var70 = new byte[var3 * var4];
        for (int var71 = 0; var71 < var4; var71++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var71 <= var4 / 2) {
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
                if (var3 / 2 <= var111) {
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
                if (var4 / 2 <= var77) {
                    var75[var76] = -1;
                }
                var76++;
            }
        }
        var2[5][3] = var75;
        byte[] var78 = new byte[var3 * var4];
        int var79 = 0;
        for (int var80 = 0; var80 < var4; var80++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var109 <= var80 - (var4 / 2)) {
                    var78[var79] = -1;
                }
                var79++;
            }
        }
        var2[6][0] = var78;
        int var81 = 0;
        byte[] var82 = new byte[var3 * var4];
        for (int var83 = var4 - 1; var83 >= 0; var83--) {
            for (int var108 = 0; var108 < var3; var108++) {
                if ((var83 - (var4 / 2)) >= var108) {
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
                if (var107 <= var86 - var4 / 2) {
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
                if (var89 - (var4 / 2) >= var106) {
                    var88[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var88;
        int var90 = 0;
        byte[] var91 = new byte[var3 * var4];
        for (int var92 = 0; var92 < var4; var92++) {
            for (int var105 = 0; var105 < var3; var105++) {
                if (var105 >= (var92 - (var4 / 2))) {
                    var91[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var91;
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
                if (var102 >= (var101 - var4 / 2)) {
                    var99[var100] = -1;
                }
                var100++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method2641(byte arg0) {
        if (arg0 != 102) {
            field6409 = null;
        }
        field6409 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)Lvl;")
    public static final class11 method2642(int arg0, int arg1, int arg2) {
        class409 var3 = class497.field6886[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5625;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
    public class463(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field6407[var3] = this.field6407[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field6407[var5];
            this.field6407[var5] = this.field6407[var5 + 256] = this.field6407[var4];
            this.field6407[var4] = this.field6407[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIBI)V")
    public static final void method2643(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = class154.field2244.field7775 * arg1 >> 8;
        field6408++;
        if (arg2 < 68) {
            return;
        }
        if (arg3 == -1 && !class21.field380) {
            class271.method1619((byte) 117);
        } else if (arg3 != -1 && (class153.field2234 != arg3 || !class422.method2429(117)) && var4 != 0 && !class21.field380) {
            class300.method1748((byte) -64, 0, var4, arg0, arg3, false, class449.field6118);
        }
        class153.field2234 = arg3;
    }
}
