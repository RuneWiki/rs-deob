import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class388 {

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "I")
    private int field5751 = 0;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    private int field5753 = -1;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Lsf;")
    private class398 field5739 = new class398();

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "Z")
    public boolean field5756 = false;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    private int field5738;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    private int field5734;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "[[I")
    private int[][] field5749;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "[Llh;")
    private class91[] field5745;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field5732 = 0;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field5733 = 0;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Lwl;")
    public static class452 field5752 = new class452(92, 6);

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field5736;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field5737;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "Liq;")
    public static class134 field5754;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZI)V")
    public static final void method2392(boolean arg0, int arg1) {
        field5743++;
        int var2 = 82 % ((-arg1 - 56) / 62);
        if (class97.field1340 != arg0) {
            class97.field1340 = arg0;
            class442.method2705(21);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIBIII)V")
    public static final void method2393(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field5744++;
        class251.method1531(arg6, false);
        int var7 = 0;
        int var8 = arg6 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class292.field4448[arg4];
        int var16 = arg5 - var8;
        int var17 = arg5 + var8;
        class379.method2285(125, var15, var16, arg0, arg5 - arg6);
        if (arg3 > -66) {
            method2401(-40, (byte) 127);
        }
        class379.method2285(125, var15, var17, arg2, var16);
        class379.method2285(127, var15, arg5 + arg6, arg0, var17);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class207.field3095[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class292.field4448[arg4 + var9];
                    int[] var19 = class292.field4448[arg4 - var9];
                    int var20 = class207.field3095[var9];
                    int var21 = arg5 + var7;
                    int var22 = arg5 - var7;
                    int var23 = arg5 + var20;
                    int var24 = arg5 - var20;
                    class379.method2285(126, var18, var24, arg0, var22);
                    class379.method2285(127, var18, var23, arg2, var24);
                    class379.method2285(126, var18, var21, arg0, var23);
                    class379.method2285(125, var19, var24, arg0, var22);
                    class379.method2285(127, var19, var23, arg2, var24);
                    class379.method2285(126, var19, var21, arg0, var23);
                } else {
                    int[] var25 = class292.field4448[arg4 + var9];
                    int[] var26 = class292.field4448[arg4 - var9];
                    int var27 = arg5 + var7;
                    int var28 = arg5 - var7;
                    class379.method2285(124, var25, var27, arg0, var28);
                    class379.method2285(125, var26, var27, arg0, var28);
                }
            }
            int[] var29 = class292.field4448[arg4 + var7];
            int[] var30 = class292.field4448[arg4 - var7];
            int var31 = arg5 + var9;
            int var32 = arg5 - var9;
            if (var8 > var7) {
                int var33 = var7 > var11 ? class207.field3095[var7] : var11;
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class379.method2285(127, var29, var35, arg0, var32);
                class379.method2285(124, var29, var34, arg2, var35);
                class379.method2285(124, var29, var31, arg0, var34);
                class379.method2285(126, var30, var35, arg0, var32);
                class379.method2285(124, var30, var34, arg2, var35);
                class379.method2285(127, var30, var31, arg0, var34);
            } else {
                class379.method2285(125, var29, var31, arg0, var32);
                class379.method2285(125, var30, var31, arg0, var32);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)[[I")
    public final int[][] method2394(int arg0) {
        field5735++;
        if (this.field5738 != this.field5734) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field5738; var2++) {
            this.field5745[var2] = class238.field3567;
        }
        return this.field5749;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
    public final int[] method2395(int arg0, int arg1) {
        if (arg0 != 30963) {
            return null;
        }
        field5747++;
        if (this.field5738 == this.field5734) {
            this.field5756 = this.field5745[arg1] == null;
            this.field5745[arg1] = class238.field3567;
            return this.field5749[arg1];
        } else if (this.field5738 == 1) {
            this.field5756 = this.field5753 != arg1;
            this.field5753 = arg1;
            return this.field5749[0];
        } else {
            class91 var3 = this.field5745[arg1];
            if (var3 == null) {
                this.field5756 = true;
                if (this.field5738 > this.field5751) {
                    var3 = new class91(arg1, this.field5751);
                    this.field5751++;
                } else {
                    class91 var4 = (class91) this.field5739.method2515(63);
                    var3 = new class91(arg1, var4.field1280);
                    this.field5745[var4.field1282] = null;
                    var4.method625((byte) -50);
                }
                this.field5745[arg1] = var3;
            } else {
                this.field5756 = false;
            }
            this.field5739.method2513((byte) 89, var3);
            return this.field5749[var3.field1280];
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(ZI)[[[B")
    public static final byte[][][] method2396(boolean arg0, int arg1) {
        field5740++;
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
        int var11 = 0;
        byte[] var12 = new byte[var3 * var4];
        if (!arg0) {
            method2403(7);
        }
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        var2[0][2] = var12;
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var16 <= var129) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[0][3] = var14;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= (var19 >> 1)) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
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
                if (var126 <= (var25 >> 1)) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var125 >= var28 << 1) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var124 <= (var31 >> 1)) {
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
                if ((var34 << 1) <= var123) {
                    var33[var32] = -1;
                }
                var32++;
            }
        }
        var2[2][1] = var33;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if (var122 <= var37 >> 1) {
                    var36[var35] = -1;
                }
                var35++;
            }
        }
        var2[2][2] = var36;
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var40 << 1 <= var121) {
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
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if ((var46 << 1) >= var119) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
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
                if (var52 << 1 >= var117) {
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
                if (var116 >= (var55 >> 1)) {
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
                if (var58 << 1 >= var115) {
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
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if (var113 <= (var64 << 1)) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        byte[] var65 = new byte[var3 * var4];
        int var66 = 0;
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var112 <= (var3 / 2)) {
                    var65[var66] = -1;
                }
                var66++;
            }
        }
        var2[5][0] = var65;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= (var4 / 2)) {
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
                if (var110 >= (var3 / 2)) {
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
                if (var108 <= var79 - var4 / 2) {
                    var77[var78] = -1;
                }
                var78++;
            }
        }
        var2[6][0] = var77;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if ((var82 - var4 / 2) >= var107) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var85 - (var4 / 2) >= var106) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var105 <= (var88 - var4 / 2)) {
                    var86[var87] = -1;
                }
                var87++;
            }
        }
        var2[6][3] = var86;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var104 >= var91 - var4 / 2) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
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

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)V")
    public static final void method2397(String arg0, int arg1, String arg2, int arg3) {
        class427.field6297 = arg3;
        class212.field3187 = arg0;
        class116.field1526 = arg2;
        field5736++;
        if (class116.field1526.equals("") || class212.field3187.equals("")) {
            class298.field4511 = 3;
        } else if (class414.field6149 == -1) {
            class187.field2808 = 0;
            class298.field4511 = -3;
            class74.field998 = 1;
            class154.field2113 = 0;
            class385 var4 = new class385(128);
            var4.method2366(10, true);
            var4.method2381((int) (Math.random() * 9.9999999E7D), arg1);
            var4.method2349(class55.method317(class116.field1526, (byte) 51), (byte) -36);
            var4.method2381((int) (Math.random() * 9.9999999E7D), arg1);
            var4.method2375(arg1 - 115, class212.field3187);
            var4.method2381((int) (Math.random() * 9.9999999E7D), 0);
            var4.method2358(class358.field5279, arg1 + 60, class230.field3518);
            class189.field2840.field5666 = arg1;
            class189.field2840.method2366(class386.field5699.field6435, true);
            class189.field2840.method2366(var4.field5666 + 2, true);
            class189.field2840.method2377(570, -81);
            class189.field2840.method2325((byte) 54, 0, var4.field5685, var4.field5666);
        } else {
            class292.method1812(-83);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
    public static final void method2398(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            field5754 = null;
        }
        if (arg2 > arg0) {
            class379.method2285(127, class292.field4448[arg3], arg2, arg1, arg0);
        } else {
            class379.method2285(124, class292.field4448[arg3], arg0, arg1, arg2);
        }
        field5746++;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(ZI)V")
    public static final void method2399(boolean arg0, int arg1) {
        field5748++;
        class458.method2841((byte) -76);
        class440.method2694(-1);
        class227.method1377(arg0, 42, arg1);
        class245.method1502(class430.field6321, (byte) -106, class427.field6274, class196.field2965);
        class267.method1656(class196.field2965, (byte) -127, class427.field6274);
        class426.method2623((byte) -77, class107.field1426);
        class453.method2818(-1);
        class141.method887((byte) -85);
        if (class19.field263 == 10) {
            class378.method2275(false, 115);
        } else if (class19.field263 == 30) {
            class316.method1929(false, 25);
        } else if (class19.field263 == 5) {
            class6.method51((byte) -101, class427.field6274, class196.field2965);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
    public final void method2400(int arg0) {
        for (int var2 = 0; var2 < this.field5738; var2++) {
            this.field5749[var2] = null;
        }
        field5737++;
        this.field5749 = null;
        this.field5745 = null;
        this.field5739.method2512((byte) 4);
        if (arg0 == 3) {
            this.field5739 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)I")
    public static final int method2401(int arg0, byte arg1) {
        field5741++;
        double var2 = (double) ((arg0 & 0xFF700D) >> 16) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var4 < var2) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        if (arg1 != -28) {
            method2399(true, -60);
        }
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 & 0xFF) >> 2 << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)I")
    public static final int method2402(int arg0, int arg1) {
        if (arg1 > -57) {
            field5754 = null;
        }
        field5750++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public static void method2403(int arg0) {
        if (arg0 == 255) {
            field5754 = null;
            field5752 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(III)V")
    public class388(int arg0, int arg1, int arg2) {
        this.field5738 = arg0;
        this.field5734 = arg1;
        this.field5749 = new int[this.field5738][arg2];
        this.field5745 = new class91[this.field5734];
    }
}
