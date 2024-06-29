import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public abstract class class132 extends class187 {

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "Z")
    public volatile boolean field1708 = true;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1699 = null;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "Ljava/lang/String;")
    public static String field1702 = "white:";

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Lam;")
    public static class286 field1701;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "Lqb;")
    public static class85 field1705;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "Z")
    public boolean field1700;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "Z")
    public boolean field1707;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static void method712(byte arg0) {
        field1699 = null;
        field1702 = null;
        int var1 = 74 % ((arg0 - 60) / 49);
        field1701 = null;
        field1705 = null;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)I")
    public abstract int method335(int arg0);

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)[B")
    public abstract byte[] method337(int arg0);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZ)V")
    public static final void method713(int arg0, boolean arg1) {
        class200.field2684 = new class114(arg0);
        if (arg1) {
            field1698++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[[[B")
    public static final byte[][][] method714(int arg0, int arg1) {
        field1709++;
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
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var132 = 0; var132 < var4; var132++) {
                if (var10 >= var132) {
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
                if (var13 <= var131) {
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
                if ((var19 >> 1) >= var129) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        byte[] var20 = new byte[var3 * var4];
        int var21 = 0;
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var21 >= 0 && var20.length > var21) {
                    if (var128 >= (var22 << 1)) {
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
            for (int var127 = var3 - 1; var127 >= 0; var127--) {
                if ((var25 >> 1) >= var127) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if ((var28 << 1) <= var126) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var31 >> 1 >= var125) {
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
                if (var124 >= (var34 << 1)) {
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
                if (var37 >> 1 >= var123) {
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
                if ((var46 << 1) >= var120) {
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
                if ((var49 >> 1) <= var119) {
                    var48[var47] = -1;
                }
                var47++;
            }
        }
        var2[3][2] = var48;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var52 << 1 >= var118) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
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
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var114 = var3 - 1; var114 >= 0; var114--) {
                if (var114 <= (var64 << 1)) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var113 = 0; var113 < var3; var113++) {
                if (var3 / 2 >= var113) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var4 / 2) >= var70) {
                    var69[var68] = -1;
                }
                var68++;
            }
        }
        var2[5][1] = var69;
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
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if ((var79 - (var4 / 2)) >= var109) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
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
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var107 = var3 - 1; var107 >= 0; var107--) {
                if (var107 <= var85 - var4 / 2) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if ((var88 - (var4 / 2)) >= var106) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var105 = 0; var105 < var3; var105++) {
                if (var105 >= var91 - var4 / 2) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= (var94 - (var4 / 2))) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var103 = var3 - 1; var103 >= 0; var103--) {
                if (var103 >= (var97 - (var4 / 2))) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= (var100 - (var4 / 2))) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        int var101 = 80 / ((-arg1 - 70) / 37);
        if (class182.field2322) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(IZ)V")
    public static final void method715(int arg0, boolean arg1) {
        if (arg0 > -114) {
            method714(-122, 15);
        }
        field1704++;
        if (arg1 != class169.field2131) {
            class169.field2131 = arg1;
            class420.method2616(89);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
    public static final void method716(byte arg0) {
        field1706++;
        if (class171.field2153 != null) {
            return;
        }
        Container var1;
        if (class213.field2888 == null) {
            var1 = class159.field2055.field6532;
        } else {
            var1 = class213.field2888;
        }
        class154.field1947 = var1.getSize().width;
        class216.field2894 = var1.getSize().height;
        if (class213.field2888 == var1) {
            Insets var2 = class213.field2888.getInsets();
            class216.field2894 -= var2.top + var2.bottom;
            class154.field1947 -= var2.right + var2.left;
        }
        if (class219.method1184((byte) 122) == 1) {
            class373.field5207 = (class154.field1947 - 765) / 2;
            class337.field4496 = 503;
            class266.field3626 = 0;
            class333.field4423 = 765;
        } else if (class436.field6389 < 96 && class101.field1182 == 0) {
            int var3 = class154.field1947 <= 1024 ? class154.field1947 : 1024;
            class373.field5207 = (class154.field1947 - var3) / 2;
            int var4 = class216.field2894 <= 768 ? class216.field2894 : 768;
            class333.field4423 = var3;
            class266.field3626 = 0;
            class337.field4496 = var4;
        } else {
            class337.field4496 = class216.field2894;
            class266.field3626 = 0;
            class373.field5207 = 0;
            class333.field4423 = class154.field1947;
        }
        if (class429.field6292 != 0) {
            boolean var10000;
            if (class333.field4423 < 1024 && class337.field4496 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg0 < 27) {
            method714(126, -70);
        }
        class38.field391.setSize(class333.field4423, class337.field4496);
        if (class88.field1003 != null) {
            class88.field1003.method1638();
        }
        if (class213.field2888 == var1) {
            Insets var5 = class213.field2888.getInsets();
            class38.field391.setLocation(class373.field5207 + var5.left, var5.top - -class266.field3626);
        } else {
            class38.field391.setLocation(class373.field5207, class266.field3626);
        }
        if (class272.field3680 != -1) {
            class149.method798(true, false);
        }
        class279.method1543((byte) -65);
    }
}
