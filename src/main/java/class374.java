import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class374 {

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field5642 = 0;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5646 = "Loaded defaults";

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "[I")
    public static int[] field5647 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field5639 = 0;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "F")
    public static float field5640;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field5649;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tq", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field5650;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2390(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2384(int arg0) {
        while (true) {
            class63 var1 = (class63) class126.field1940.method248(-24951);
            if (var1 == null) {
                int var22 = -7 % ((arg0 + 15) / 56);
                field5643++;
                return;
            }
            if (class423.field6252 != null) {
                class124 var3;
                if (var1.field819 >= 0) {
                    int var2 = var1.field819 - 1;
                    var3 = class39.field499[var2];
                } else {
                    int var4 = -var1.field819 - 1;
                    if (class39.field500 == var4) {
                        var3 = class261.field4201;
                    } else {
                        var3 = class216.field3517[var4];
                    }
                }
                if (var3 != null) {
                    class127 var5 = class137.method1003(var1.field824, -30796);
                    int var6;
                    int var7;
                    if (var1.field834 == 1 || var1.field834 == 3) {
                        var6 = var5.field2014;
                        var7 = var5.field1944;
                    } else {
                        var6 = var5.field1944;
                        var7 = var5.field2014;
                    }
                    int var8 = var1.field821 + (var7 >> 1);
                    int var9 = (var7 + 1 >> 1) + var1.field821;
                    int var10 = (var6 >> 1) + var1.field830;
                    int var11 = (var6 + 1 >> 1) + var1.field830;
                    class129 var12 = class275.field4396[var3.field714];
                    int var13 = var12.method779(var8, var10) + var12.method779(var9, var10) + var12.method779(var8, var11) + var12.method779(var9, var11) >> 2;
                    class149 var14 = null;
                    int var15 = class81.field1005[var1.field831];
                    if (var15 == 0) {
                        var14 = (class149) class139.method1016(var3.field714, var1.field821, var1.field830);
                    } else if (var15 == 1) {
                        var14 = (class149) class238.method1684(var3.field714, var1.field821, var1.field830);
                    } else if (var15 == 2) {
                        var14 = (class149) class12.method117(var3.field714, var1.field821, var1.field830, field5650 == null ? (field5650 = method2390("up")) : field5650);
                    } else if (var15 == 3) {
                        var14 = (class149) class316.method2107(var3.field714, var1.field821, var1.field830);
                    }
                    if (var14 != null) {
                        class256.method1768(-1, var1.field829, var3.field714, 0, var1.field821, var15, var1.field825 + 1, 0, 0, var1.field830);
                        var3.field1902 = var1.field821 * 128 + var7 * 64;
                        var3.field1904 = var14;
                        var3.field1900 = class183.field2987 + var1.field829;
                        var3.field1910 = var1.field830 * 128 + var6 * 64;
                        var3.field1901 = var13;
                        var3.field1908 = class183.field2987 + var1.field825;
                        int var16 = var1.field832;
                        int var17 = var1.field826;
                        int var18 = var1.field818;
                        int var19 = var1.field820;
                        if (var16 > var17) {
                            int var20 = var16;
                            var16 = var17;
                            var17 = var20;
                        }
                        var3.field1905 = var1.field821 + var16;
                        if (var19 < var18) {
                            int var21 = var18;
                            var18 = var19;
                            var19 = var21;
                        }
                        var3.field1913 = var1.field821 + var17;
                        var3.field1899 = var1.field830 + var19;
                        var3.field1915 = var1.field830 + var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V", line = 138)
    public static final void method2385(boolean arg0) {
        field5648++;
        for (int var1 = 0; var1 < class397.field5940; var1++) {
            int var2 = class423.field6253[var1];
            class50 var3 = class39.field499[var2];
            if (var3 != null) {
                class415.method2594(var3.field615.field3779, var3, false);
            }
        }
        if (!arg0) {
            field5642 = 85;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)V", line = 170)
    public static final void method2386(int arg0, byte arg1) {
        field5644++;
        class301.field4769 = arg0;
        class52 var2 = class30.field373;
        synchronized (class30.field373) {
            class30.field373.method335((byte) 73);
        }
        class52 var3 = class86.field1081;
        synchronized (class86.field1081) {
            class86.field1081.method335((byte) 108);
        }
        if (arg1 >= -9) {
            method2388(79, 58);
        }
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V", line = 193)
    public static void method2387(int arg0) {
        if (arg0 != 1960899489) {
            method2384(11);
        }
        field5647 = null;
        field5646 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)[[[B", line = 206)
    public static final byte[][][] method2388(int arg0, int arg1) {
        field5641++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
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
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var130 >= var13) {
                    var12[var11] = -1;
                }
                var11++;
            }
        }
        var2[0][2] = var12;
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
                if ((var19 >> 1) >= var128) {
                    var17[var18] = -1;
                }
                var18++;
            }
        }
        var2[1][0] = var17;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var21.length > var20) {
                    if (var127 >= (var22 << 1)) {
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
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= var25 >> 1) {
                    var24[var23] = -1;
                }
                var23++;
            }
        }
        var2[1][2] = var24;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var28 << 1 <= var125) {
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
                if (var124 <= var31 >> 1) {
                    var29[var30] = -1;
                }
                var30++;
            }
        }
        var2[2][0] = var29;
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
                if (var37 >> 1 >= var122) {
                    var35[var36] = -1;
                }
                var36++;
            }
        }
        var2[2][2] = var35;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if (var121 >= (var40 << 1)) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
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
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if (var46 << 1 >= var119) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if ((var49 >> 1) <= var118) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var52 << 1) >= var117) {
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
                if (var115 <= (var58 << 1)) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var61 >> 1 <= var114) {
                    var59[var60] = -1;
                }
                var60++;
            }
        }
        var2[4][2] = var59;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if ((var64 << 1) >= var113) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
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
                if (var70 <= var4 / 2) {
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
                if ((var4 / 2) <= var76) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if (var79 - (var4 / 2) >= var108) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = arg1 + var4; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var107 <= (var82 - var4 / 2)) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        int var83 = 0;
        byte[] var84 = new byte[var3 * var4];
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if ((var85 - (var4 / 2)) >= var106) {
                    var84[var83] = -1;
                }
                var83++;
            }
        }
        var2[6][2] = var84;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var88 - (var4 / 2) >= var105) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        var2[6][3] = var87;
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
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var102 >= var97 - (var4 / 2)) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var101 >= var100 - (var4 / 2)) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V", line = 983)
    public static final void method2389(int arg0) {
        class296.field4710.method714(((float) class394.field5905 * 0.1F + 0.7F) * 1.1523438F);
        field5645++;
        class296.field4710.method683(class121.field1691, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class296.field4710.method692(class82.field1011, -1);
        int var1 = 46 / ((30 - arg0) / 33);
        class296.field4710.method694(class318.field4974);
    }
}
