import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class125 extends class447 {

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public int field1752 = -1;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "I")
    public int field1749 = 12800;

    @OriginalMember(owner = "client!jd", name = "J", descriptor = "I")
    public int field1759 = 0;

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
    public int field1751 = 12800;

    @OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
    public int field1756 = 0;

    @OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
    public int field1747 = -1;

    @OriginalMember(owner = "client!jd", name = "G", descriptor = "Z")
    public boolean field1757 = true;

    @OriginalMember(owner = "client!jd", name = "I", descriptor = "Ljava/lang/String;")
    public String field1758;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public int field1763;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "Ljava/lang/String;")
    public String field1766;

    @OriginalMember(owner = "client!jd", name = "K", descriptor = "Ltc;")
    public class196 field1760;

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "[I")
    public static int[] field1750 = new int[500];

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "Ljava/lang/String;")
    public static String field1770 = null;

    @OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!jd", name = "L", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "Ljd;")
    public static class125 field1755;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "Lle;")
    public static class167 field1746;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Lqj;")
    public static class296 field1745;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(B)V", line = 3)
    public static void method832(byte arg0) {
        field1745 = null;
        field1746 = null;
        field1770 = null;
        field1755 = null;
        if (arg0 != -1) {
            method835(-109, (class296) null);
        }
        field1750 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[IIZI)Z", line = 26)
    public final boolean method833(int arg0, int[] arg1, int arg2, boolean arg3, int arg4) {
        field1748++;
        class129 var6 = (class129) this.field1760.method1312((byte) 25);
        if (arg3) {
            return false;
        }
        while (var6 != null) {
            if (var6.method862(arg4, arg0, arg2, (byte) 116)) {
                var6.method863(arg0, -103, arg1, arg4);
                return true;
            }
            var6 = (class129) this.field1760.method1304(98);
        }
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILrg;)V", line = 53)
    public static final void method834(int arg0, class383 arg1) {
        field1754++;
        class383 var2 = class231.method1445(arg0 ^ 0xFFFF9908, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class194.field2696;
            var4 = class243.field3359;
        } else {
            var3 = var2.field5431;
            var4 = var2.field5491;
        }
        class254.method1567(var3, var4, arg1, (byte) -128, false);
        class190.method1245(var3, (byte) -86, arg1, var4);
        if (arg0 != 0) {
            field1746 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILqj;)V", line = 81)
    public static final void method835(int arg0, class296 arg1) {
        field1745 = arg1;
        if (arg0 != -22496) {
            method835(-33, (class296) null);
        }
        field1762++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z", line = 92)
    public final boolean method836(int arg0, int arg1, int arg2) {
        field1769++;
        if (arg0 != 3) {
            this.field1747 = -102;
        }
        for (class129 var4 = (class129) this.field1760.method1312((byte) 25); var4 != null; var4 = (class129) this.field1760.method1304(87)) {
            if (var4.method864((byte) -92, arg2, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 1026)
    public class125(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field1757 = arg5;
        this.field1747 = arg4;
        this.field1758 = arg2;
        this.field1764 = arg3;
        this.field1763 = arg0;
        this.field1752 = arg6;
        this.field1766 = arg1;
        if (this.field1752 == 255) {
            this.field1752 = 0;
        }
        this.field1760 = new class196();
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 126)
    public final void method837(boolean arg0) {
        if (!arg0) {
            return;
        }
        this.field1751 = 12800;
        field1765++;
        this.field1749 = 12800;
        this.field1759 = 0;
        this.field1756 = 0;
        for (class129 var2 = (class129) this.field1760.method1312((byte) 25); var2 != null; var2 = (class129) this.field1760.method1304(-35)) {
            if (this.field1756 < var2.field1797) {
                this.field1756 = var2.field1797;
            }
            if (this.field1749 > var2.field1806) {
                this.field1749 = var2.field1806;
            }
            if (this.field1751 > var2.field1812) {
                this.field1751 = var2.field1812;
            }
            if (this.field1759 < var2.field1811) {
                this.field1759 = var2.field1811;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III[I)Z", line = 175)
    public final boolean method838(int arg0, int arg1, int arg2, int[] arg3) {
        field1753++;
        if (arg0 >= -78) {
            this.field1758 = null;
        }
        for (class129 var5 = (class129) this.field1760.method1312((byte) 25); var5 != null; var5 = (class129) this.field1760.method1304(-34)) {
            if (var5.method861(arg2, arg1, (byte) 119)) {
                var5.method859(arg1, true, arg2, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZII[I)Z", line = 205)
    public final boolean method839(boolean arg0, int arg1, int arg2, int[] arg3) {
        field1761++;
        if (!arg0) {
            this.field1756 = 51;
        }
        for (class129 var5 = (class129) this.field1760.method1312((byte) 25); var5 != null; var5 = (class129) this.field1760.method1304(126)) {
            if (var5.method864((byte) 110, arg2, arg1)) {
                var5.method863(arg2, 100, arg3, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)[[[B", line = 247)
    public static final byte[][][] method840(int arg0, byte arg1) {
        field1768++;
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
                if (var20 >= 0 && var20 < var21.length) {
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
                if (var125 <= (var31 >> 1)) {
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
                if ((var34 << 1) <= var124) {
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
                if (var123 <= (var37 >> 1)) {
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
                if ((var40 << 1) <= var122) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var121 = 0; var121 < var3; var121++) {
                if ((var43 >> 1) <= var121) {
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
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var119 = var3 - 1; var119 >= 0; var119--) {
                if (var119 >= (var49 >> 1)) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 <= (var52 << 1)) {
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
                if (var64 << 1 >= var114) {
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
                if (var111 >= (var3 / 2)) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
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
                if (var109 <= var79 - (var4 / 2)) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var108 = 0; var108 < var3; var108++) {
                if ((var82 - (var4 / 2)) >= var108) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var107 = var3 - 1; var107 >= 0; var107--) {
                if (var85 - (var4 / 2) >= var107) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var106 <= (var88 - var4 / 2)) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        var2[6][3] = var87;
        byte[] var89 = new byte[var3 * var4];
        int var90 = 0;
        int var91 = -36 % ((-arg1 - 20) / 36);
        for (int var92 = 0; var92 < var4; var92++) {
            for (int var105 = 0; var105 < var3; var105++) {
                if ((var92 - (var4 / 2)) <= var105) {
                    var89[var90] = -1;
                }
                var90++;
            }
        }
        var2[7][0] = var89;
        byte[] var93 = new byte[var3 * var4];
        int var94 = 0;
        for (int var95 = var4 - 1; var95 >= 0; var95--) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= (var95 - (var4 / 2))) {
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
                if (var103 >= var98 - (var4 / 2)) {
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
                if (var101 - (var4 / 2) <= var102) {
                    var99[var100] = -1;
                }
                var100++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }
}
