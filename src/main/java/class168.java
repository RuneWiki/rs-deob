import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class168 {

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "I")
    public int field2461;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lmm;")
    public class168 field2450;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "Los;")
    public class282 field2453;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field2449 = 0;

    @OriginalMember(owner = "client!mm", name = "l", descriptor = "[I")
    public static int[] field2458 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "Ldt;")
    public static class145 field2462 = null;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[[I")
    public static int[][] field2448 = new int[128][128];

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field2451;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public int field2455;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Lwp;")
    public static class109 field2454;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method1036(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2460++;
        if (arg0 == arg2 && arg3 == arg6 && arg8 == arg9 && arg4 == arg7) {
            class167.method1034(arg2, arg1 ^ 0xFFFFFFFE, arg3, arg4, arg5, arg8);
        } else {
            int var10 = arg2;
            int var11 = arg3;
            int var12 = arg2 * 3;
            int var13 = arg3 * 3;
            int var14 = arg0 * 3;
            int var15 = arg6 * 3;
            int var16 = arg9 * 3;
            int var17 = arg7 * 3;
            int var18 = arg8 + var14 - arg2 - var16;
            int var19 = arg4 + var15 - var17 - arg3;
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
                int var33 = (var27 + var29 + var31 >> 12) + arg2;
                int var34 = (var28 + var32 + var30 >> 12) + arg3;
                class167.method1034(var10, 1, var11, var34, arg5, var33);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg1 != -1) {
            field2462 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lee;IIIIIIIIII)Z")
    public static final boolean method1037(class441 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2447++;
        if (arg6 != -1) {
            field2454 = null;
        }
        int var11 = arg5;
        int var12 = arg9;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg5 - var13;
        field2448[var13][var14] = 99;
        int var16 = arg9 - var14;
        class258.field3784[var13][var14] = 0;
        byte var17 = 0;
        class368.field5326[var17] = arg5;
        int var18 = 0;
        int var26 = var17 + 1;
        class89.field1098[var17] = arg9;
        int[][] var19 = arg0.field6121;
        while (var26 != var18) {
            var12 = class89.field1098[var18];
            var11 = class368.field5326[var18];
            int var20 = var12 - arg0.field6101;
            var18 = var18 + 1 & 0xFFF;
            int var21 = var11 - arg0.field6099;
            int var22 = var11 - var15;
            int var23 = var12 - var16;
            if (arg4 == -4) {
                if (arg2 == var11 && arg10 == var12) {
                    class245.field3646 = var11;
                    class411.field5763 = var12;
                    return true;
                }
            } else if (arg4 == -3) {
                if (class172.method1061(arg3, arg8, 1, arg2, var11, arg10, var12, 1, -113)) {
                    class411.field5763 = var12;
                    class245.field3646 = var11;
                    return true;
                }
            } else if (arg4 == -2) {
                if (arg0.method2583(arg10, arg2, arg8, 1, var11, arg3, 2883968, var12, 1, arg7)) {
                    class245.field3646 = var11;
                    class411.field5763 = var12;
                    return true;
                }
            } else if (arg4 == -1) {
                if (arg0.method2599(var11, arg10, 1, true, var12, arg3, arg8, arg2, arg7)) {
                    class411.field5763 = var12;
                    class245.field3646 = var11;
                    return true;
                }
            } else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
                if (arg0.method2591(arg1, var12, arg10, var11, 3981, arg2, 1, arg4)) {
                    class411.field5763 = var12;
                    class245.field3646 = var11;
                    return true;
                }
            } else if (arg0.method2586(arg4, var11, var12, arg1, 1, -19527, arg2, arg10)) {
                class245.field3646 = var11;
                class411.field5763 = var12;
                return true;
            }
            int var25 = class258.field3784[var22][var23] + 1;
            if (var22 > 0 && field2448[var22 - 1][var23] == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0) {
                class368.field5326[var26] = var11 - 1;
                class89.field1098[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                field2448[var22 - 1][var23] = 2;
                class258.field3784[var22 - 1][var23] = var25;
            }
            if (var22 < 127 && field2448[var22 + 1][var23] == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0) {
                class368.field5326[var26] = var11 + 1;
                class89.field1098[var26] = var12;
                field2448[var22 + 1][var23] = 8;
                var26 = var26 + 1 & 0xFFF;
                class258.field3784[var22 + 1][var23] = var25;
            }
            if (var23 > 0 && field2448[var22][var23 - 1] == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class368.field5326[var26] = var11;
                class89.field1098[var26] = var12 - 1;
                field2448[var22][var23 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class258.field3784[var22][var23 - 1] = var25;
            }
            if (var23 < 127 && field2448[var22][var23 + 1] == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class368.field5326[var26] = var11;
                class89.field1098[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                field2448[var22][var23 + 1] = 4;
                class258.field3784[var22][var23 + 1] = var25;
            }
            if (var22 > 0 && var23 > 0 && field2448[var22 - 1][var23 - 1] == 0 && (var19[var21 - 1][var20 - 1] & 0x43A40000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class368.field5326[var26] = var11 - 1;
                class89.field1098[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                field2448[var22 - 1][var23 - 1] = 3;
                class258.field3784[var22 - 1][var23 - 1] = var25;
            }
            if (var22 < 127 && var23 > 0 && field2448[var22 + 1][var23 - 1] == 0 && (var19[var21 + 1][var20 - 1] & 0x60E40000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 - 1] & 0x40A40000) == 0) {
                class368.field5326[var26] = var11 + 1;
                class89.field1098[var26] = var12 - 1;
                field2448[var22 + 1][var23 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class258.field3784[var22 + 1][var23 - 1] = var25;
            }
            if (var22 > 0 && var23 < 127 && field2448[var22 - 1][var23 + 1] == 0 && (var19[var21 - 1][var20 + 1] & 0x4E240000) == 0 && (var19[var21 - 1][var20] & 0x42240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class368.field5326[var26] = var11 - 1;
                class89.field1098[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                field2448[var22 - 1][var23 + 1] = 6;
                class258.field3784[var22 - 1][var23 + 1] = var25;
            }
            if (var22 < 127 && var23 < 127 && field2448[var22 + 1][var23 + 1] == 0 && (var19[var21 + 1][var20 + 1] & 0x78240000) == 0 && (var19[var21 + 1][var20] & 0x60240000) == 0 && (var19[var21][var20 + 1] & 0x48240000) == 0) {
                class368.field5326[var26] = var11 + 1;
                class89.field1098[var26] = var12 + 1;
                field2448[var22 + 1][var23 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class258.field3784[var22 + 1][var23 + 1] = var25;
            }
        }
        class245.field3646 = var11;
        class411.field5763 = var12;
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public static void method1038(byte arg0) {
        field2448 = null;
        field2458 = null;
        field2454 = null;
        if (arg0 != -104) {
            field2454 = null;
        }
        field2462 = null;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)Z")
    public static final boolean method1039(byte arg0) {
        int var1 = -99 / ((-arg0 - 36) / 55);
        field2451++;
        return class103.field1318;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIZBI)V")
    public static final void method1040(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        if (class437.field6083 == 0) {
            class363.method2247((byte) 68, false);
        } else {
            class470.field6626 = class437.field6083;
            class51.method330(0, (byte) -46);
        }
        field2464++;
        class398.field5649 = arg2;
        class459.field6432 = arg4;
        if (arg3 < -9) {
            class7.field67 = arg1;
            class395.method2371(arg0);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)[[[B")
    public static final byte[][][] method1041(int arg0, int arg1) {
        field2463++;
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
        byte[] var14 = new byte[var3 * var4];
        int var15 = 0;
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
                    var14[var15] = -1;
                }
                var15++;
            }
        }
        var2[0][3] = var14;
        byte[] var17 = new byte[var3 * var4];
        int var18 = 0;
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var19 >> 1 >= var128) {
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
                if ((var25 >> 1) >= var126) {
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
                if (var28 << 1 <= var125) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if (var124 <= (var31 >> 1)) {
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
                if ((var34 << 1) <= var123) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
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
                if (var120 >= (var43 >> 1)) {
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
                if (var119 <= var46 << 1) {
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
                if (var118 >= var49 >> 1) {
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
                if (var52 << 1 >= var117) {
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
                if (var116 >= (var55 >> 1)) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
        int var56 = 0;
        byte[] var57 = new byte[var3 * var4];
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if (var115 <= (var58 << 1)) {
                    var57[var56] = -1;
                }
                var56++;
            }
        }
        var2[4][1] = var57;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if (var114 >= var61 >> 1) {
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
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if (var112 <= (var3 / 2)) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= var4 / 2) {
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
                if ((var79 - var4 / 2) >= var108) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if ((var82 - (var4 / 2)) >= var107) {
                    var81[var80] = -1;
                }
                var80++;
            }
        }
        var2[6][1] = var81;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if ((var85 - var4 / 2) >= var106) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var88 - var4 / 2 >= var105) {
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
        if (arg1 != 3) {
            return null;
        }
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var94 - (var4 / 2) <= var103) {
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
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var100 - (var4 / 2) <= var101) {
                    var98[var99] = -1;
                }
                var99++;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(CI)C")
    public static final char method1042(char arg0, int arg1) {
        field2459++;
        if (arg0 == 'Æ') {
            return 'E';
        }
        if (arg1 != -17426) {
            field2462 = null;
        }
        if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(II)V")
    public class168(int arg0, int arg1) {
        this.field2456 = arg0;
        this.field2461 = arg1;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lmm;I)V")
    public class168(class168 arg0, int arg1) {
        this.field2450 = arg0;
        this.field2453 = this.field2450.field2453;
        this.field2456 = this.field2450.field2456;
        this.field2461 = this.field2450.field2461 + arg1;
    }
}
