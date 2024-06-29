import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class74 extends class95 {

    @OriginalMember(owner = "client!ej", name = "N", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!ej", name = "O", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ej", name = "Z", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "Lan;")
    public class377 field1112;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "[B")
    public byte[] field1113;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lca;I)V", line = 3)
    public static final void method638(class415 arg0, int arg1) {
        ++field1105;
        arg0.field5807 = null;
        int var2 = arg0.field5799.length;
        for (int var3 = 0; var2 > var3; ++var3) {
            arg0.field5799[var3].field2808 = false;
        }
        if (arg1 != 18614) {
            field1103 = 105;
        }
        class107[] var4 = class89.field1325;
        synchronized (class89.field1325) {
            if (~var2 > ~class89.field1325.length && class385.field5428[var2] < 200) {
                class89.field1325[var2].method901(false, arg0);
                int var10002 = class385.field5428[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(B)V", line = 32)
    public static final void method639(byte arg0) {
        ++field1108;
        int var1 = class19.field375.method2060(class148.field2266, (byte) 31);
        for (class63 var2 = (class63) class268.field3613.method1240((byte) -90); var2 != null; var2 = (class63) class268.field3613.method1245(1)) {
            int var6 = class314.method2004(var2, 11139);
            if (var6 > var1) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = class415.field5808 * 16 - -21;
        int var4 = -(var1 / 2) + class391.field5490;
        if (arg0 != -4) {
            method644(112, (byte) 118, -31);
        }
        if (~(var4 - -var1) < ~class249.field3414) {
            var4 = -var1 + class249.field3414;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class312.field4220;
        if (~class258.field3488 > ~(var5 - -var3)) {
            var5 = -var3 + class258.field3488;
        }
        if (~var5 > -1) {
            var5 = 0;
        }
        class381.field5345 = var4;
        class236.field3264 = (class427.field6056 ? 26 : 22) + class415.field5808 * 16;
        class127.field1791 = var5;
        class94.field1369 = true;
        class277.field3735 = var1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BI)[[[B", line = 82)
    public static final byte[][][] method640(byte arg0, int arg1) {
        ++field1109;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg1;
        int var4 = arg1;
        byte[] var5 = new byte[arg1 * arg1];
        int var6 = 0;
        for (int var7 = 0; var7 < var4; ++var7) {
            for (int var132 = 0; ~var3 < ~var132; ++var132) {
                if (~var132 >= ~var7) {
                    var5[var6] = -1;
                }
                ++var6;
            }
        }
        var2[0][0] = var5;
        byte[] var8 = new byte[var3 * var4];
        int var9 = 0;
        for (int var10 = var4 + -1; var10 >= 0; --var10) {
            for (int var131 = 0; var131 < var4; ++var131) {
                if (~var10 <= ~var131) {
                    var8[var9] = -1;
                }
                ++var9;
            }
        }
        var2[0][1] = var8;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var4 > var13; ++var13) {
            for (int var130 = 0; ~var3 < ~var130; ++var130) {
                if (~var130 <= ~var13) {
                    var11[var12] = -1;
                }
                ++var12;
            }
        }
        var2[0][2] = var11;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; ~var16 <= -1; --var16) {
            for (int var129 = 0; var129 < var3; ++var129) {
                if (var16 <= var129) {
                    var15[var14] = -1;
                }
                ++var14;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 + -1; var19 >= 0; --var19) {
            for (int var128 = 0; var128 < var3; ++var128) {
                if (~(var19 >> 1) <= ~var128) {
                    var18[var17] = -1;
                }
                ++var17;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; ~var22 > ~var4; ++var22) {
            for (int var127 = 0; ~var3 < ~var127; ++var127) {
                if (var20 >= 0 && var20 < var21.length) {
                    if (~var127 <= ~(var22 << 1)) {
                        var21[var20] = -1;
                    }
                    ++var20;
                } else {
                    ++var20;
                }
            }
        }
        var2[1][1] = var21;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; ++var25) {
            for (int var126 = var3 - 1; ~var126 <= -1; --var126) {
                if (~(var25 >> 1) <= ~var126) {
                    var23[var24] = -1;
                }
                ++var24;
            }
        }
        var2[1][2] = var23;
        int var26 = 0;
        byte[] var27 = new byte[var3 * var4];
        for (int var28 = var4 + -1; var28 >= 0; --var28) {
            for (int var125 = var3 + -1; ~var125 <= -1; --var125) {
                if (~(var28 << 1) >= ~var125) {
                    var27[var26] = -1;
                }
                ++var26;
            }
        }
        var2[1][3] = var27;
        byte[] var29 = new byte[var3 * var4];
        int var30 = 0;
        for (int var31 = var4 + -1; ~var31 <= -1; --var31) {
            for (int var124 = var3 + -1; ~var124 <= -1; --var124) {
                if (~(var31 >> 1) <= ~var124) {
                    var29[var30] = -1;
                }
                ++var30;
            }
        }
        var2[2][0] = var29;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 + -1; ~var34 <= -1; --var34) {
            for (int var123 = 0; ~var123 > ~var3; ++var123) {
                if (~(var34 << 1) >= ~var123) {
                    var32[var33] = -1;
                }
                ++var33;
            }
        }
        var2[2][1] = var32;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; ~var37 > ~var4; ++var37) {
            for (int var122 = 0; ~var122 > ~var3; ++var122) {
                if (~var122 >= ~(var37 >> 1)) {
                    var36[var35] = -1;
                }
                ++var35;
            }
        }
        var2[2][2] = var36;
        if (arg0 != 77) {
            field1103 = -109;
        }
        byte[] var38 = new byte[var3 * var4];
        int var39 = 0;
        for (int var40 = 0; var4 > var40; ++var40) {
            for (int var121 = var3 + -1; ~var121 <= -1; --var121) {
                if (var121 >= var40 << 1) {
                    var38[var39] = -1;
                }
                ++var39;
            }
        }
        var2[2][3] = var38;
        byte[] var41 = new byte[var3 * var4];
        int var42 = 0;
        for (int var43 = var4 + -1; ~var43 <= -1; --var43) {
            for (int var120 = 0; var120 < var3; ++var120) {
                if (var120 >= var43 >> 1) {
                    var41[var42] = -1;
                }
                ++var42;
            }
        }
        var2[3][0] = var41;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var4 > var46; ++var46) {
            for (int var119 = 0; ~var3 < ~var119; ++var119) {
                if (~(var46 << 1) <= ~var119) {
                    var44[var45] = -1;
                }
                ++var45;
            }
        }
        var2[3][1] = var44;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; ~var49 > ~var4; ++var49) {
            for (int var118 = var3 + -1; ~var118 <= -1; --var118) {
                if (var49 >> 1 <= var118) {
                    var47[var48] = -1;
                }
                ++var48;
            }
        }
        var2[3][2] = var47;
        int var50 = 0;
        byte[] var51 = new byte[var3 * var4];
        for (int var52 = var4 + -1; var52 >= 0; --var52) {
            for (int var117 = var3 - 1; ~var117 <= -1; --var117) {
                if (~var117 >= ~(var52 << 1)) {
                    var51[var50] = -1;
                }
                ++var50;
            }
        }
        var2[3][3] = var51;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; ~var55 <= -1; --var55) {
            for (int var116 = var3 + -1; ~var116 <= -1; --var116) {
                if (~(var55 >> 1) >= ~var116) {
                    var53[var54] = -1;
                }
                ++var54;
            }
        }
        var2[4][0] = var53;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 + -1; ~var58 <= -1; --var58) {
            for (int var115 = 0; ~var3 < ~var115; ++var115) {
                if (var115 <= var58 << 1) {
                    var56[var57] = -1;
                }
                ++var57;
            }
        }
        var2[4][1] = var56;
        byte[] var59 = new byte[var3 * var4];
        int var60 = 0;
        for (int var61 = 0; ~var4 < ~var61; ++var61) {
            for (int var114 = 0; var114 < var3; ++var114) {
                if (var61 >> 1 <= var114) {
                    var59[var60] = -1;
                }
                ++var60;
            }
        }
        var2[4][2] = var59;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; ~var64 > ~var4; ++var64) {
            for (int var113 = var3 + -1; var113 >= 0; --var113) {
                if (~(var64 << 1) <= ~var113) {
                    var62[var63] = -1;
                }
                ++var63;
            }
        }
        var2[4][3] = var62;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; ~var4 < ~var67; ++var67) {
            for (int var112 = 0; var112 < var3; ++var112) {
                if (~(var3 / 2) <= ~var112) {
                    var66[var65] = -1;
                }
                ++var65;
            }
        }
        var2[5][0] = var66;
        byte[] var68 = new byte[var3 * var4];
        int var69 = 0;
        for (int var70 = 0; var70 < var4; ++var70) {
            for (int var111 = 0; var111 < var3; ++var111) {
                if (~(var4 / 2) <= ~var70) {
                    var68[var69] = -1;
                }
                ++var69;
            }
        }
        var2[5][1] = var68;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; var73 < var4; ++var73) {
            for (int var110 = 0; ~var3 < ~var110; ++var110) {
                if (~var110 <= ~(var3 / 2)) {
                    var71[var72] = -1;
                }
                ++var72;
            }
        }
        var2[5][2] = var71;
        int var74 = 0;
        byte[] var75 = new byte[var3 * var4];
        for (int var76 = 0; var76 < var4; ++var76) {
            for (int var109 = 0; var3 > var109; ++var109) {
                if (~var76 <= ~(var4 / 2)) {
                    var75[var74] = -1;
                }
                ++var74;
            }
        }
        var2[5][3] = var75;
        byte[] var77 = new byte[var3 * var4];
        int var78 = 0;
        for (int var79 = 0; var79 < var4; ++var79) {
            for (int var108 = 0; var3 > var108; ++var108) {
                if (-(var4 / 2) + var79 >= var108) {
                    var77[var78] = -1;
                }
                ++var78;
            }
        }
        var2[6][0] = var77;
        int var80 = 0;
        byte[] var81 = new byte[var3 * var4];
        for (int var82 = var4 + -1; var82 >= 0; --var82) {
            for (int var107 = 0; var3 > var107; ++var107) {
                if (~(-(var4 / 2) + var82) <= ~var107) {
                    var81[var80] = -1;
                }
                ++var80;
            }
        }
        var2[6][1] = var81;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 + -1; ~var85 <= -1; --var85) {
            for (int var106 = var3 - 1; ~var106 <= -1; --var106) {
                if (~(-(var4 / 2) + var85) <= ~var106) {
                    var83[var84] = -1;
                }
                ++var84;
            }
        }
        var2[6][2] = var83;
        byte[] var86 = new byte[var3 * var4];
        int var87 = 0;
        for (int var88 = 0; ~var4 < ~var88; ++var88) {
            for (int var105 = var3 + -1; var105 >= 0; --var105) {
                if (-(var4 / 2) + var88 >= var105) {
                    var86[var87] = -1;
                }
                ++var87;
            }
        }
        var2[6][3] = var86;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; ~var91 > ~var4; ++var91) {
            for (int var104 = 0; ~var104 > ~var3; ++var104) {
                if (~(var91 - var4 / 2) >= ~var104) {
                    var90[var89] = -1;
                }
                ++var89;
            }
        }
        var2[7][0] = var90;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 + -1; ~var94 <= -1; --var94) {
            for (int var103 = 0; var3 > var103; ++var103) {
                if (~var103 <= ~(-(var4 / 2) + var94)) {
                    var93[var92] = -1;
                }
                ++var92;
            }
        }
        var2[7][1] = var93;
        int var95 = 0;
        byte[] var96 = new byte[var3 * var4];
        for (int var97 = var4 + -1; ~var97 <= -1; --var97) {
            for (int var102 = var3 + -1; ~var102 <= -1; --var102) {
                if (~var102 <= ~(var97 - var4 / 2)) {
                    var96[var95] = -1;
                }
                ++var95;
            }
        }
        var2[7][2] = var96;
        byte[] var98 = new byte[var3 * var4];
        int var99 = 0;
        for (int var100 = 0; ~var4 < ~var100; ++var100) {
            for (int var101 = var3 + -1; var101 >= 0; --var101) {
                if (-(var4 / 2) + var100 <= var101) {
                    var98[var99] = -1;
                }
                ++var99;
            }
        }
        var2[7][3] = var98;
        return var2;
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(Z)V", line = 864)
    public static final void method641(boolean arg0) {
        ++field1104;
        for (int var1 = -1; var1 < class174.field2579; ++var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class134.field1921[var1];
            }
            class338 var3 = class220.field3044[var2];
            if (var3 != null) {
                class21.method278(var3.method2146(119), var3, (byte) 26);
            }
        }
        if (!arg0) {
            field1103 = 31;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIII)V", line = 895)
    public static final void method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 >= class433.field6144 && arg0 <= class69.field1047 && class39.field595 <= arg4 && ~arg2 >= ~class134.field1917) {
            if (arg3 != 1) {
                class39.method389(arg3, arg4, arg2, -128, arg6, arg5, arg0);
            } else {
                class433.method2685(arg6, arg1 ^ -12384, arg0, arg5, arg2, arg4);
            }
        } else if (~arg3 != -2) {
            class55.method519(5, arg4, arg5, arg2, arg0, arg6, arg3);
        } else {
            class118.method937(arg1 ^ -16724036, arg0, arg4, arg6, arg5, arg2);
        }
        ++field1111;
        if (arg1 != -12356) {
            method639((byte) -4);
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)[B", line = 927)
    public final byte[] method643(boolean arg0) {
        ++field1102;
        if (arg0) {
            this.method643(false);
        }
        if (super.field1384) {
            throw new RuntimeException();
        } else {
            return this.field1113;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IBI)Z", line = 948)
    public static final boolean method644(int arg0, byte arg1, int arg2) {
        ++field1110;
        if (!class94.field1369) {
            return false;
        } else {
            int var3 = arg0 >> 16;
            int var4 = 65535 & arg0;
            if (class291.field3949[var3] != null && class291.field3949[var3][var4] != null) {
                if (arg1 <= 46) {
                    field1103 = -82;
                }
                class139 var5 = class291.field3949[var3][var4];
                if (arg2 == -1 && ~var5.field2023 == -1) {
                    for (class63 var6 = (class63) class268.field3613.method1240((byte) -67); var6 != null; var6 = (class63) class268.field3613.method1245(1)) {
                        if (~var6.field966 == -51 || var6.field966 == 1011 || ~var6.field966 == -43 || ~var6.field966 == -16 || ~var6.field966 == -61) {
                            for (class139 var7 = class10.method57(65535, var6.field958); var7 != null; var7 = class301.method1933(var7, (byte) -66)) {
                                if (~var5.field1968 == ~var7.field1968) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class63 var8 = (class63) class268.field3613.method1240((byte) -118); var8 != null; var8 = (class63) class268.field3613.method1245(1)) {
                        if (var8.field961 == arg2 && ~var5.field1968 == ~var8.field958 && (var8.field966 == 50 || var8.field966 == 1011 || ~var8.field966 == -43 || ~var8.field966 == -16 || ~var8.field966 == -61)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(IIIIIII)V", line = 1017)
    public static final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class436.method2701(arg4, arg5 + -14696);
        ++field1114;
        int var7 = 0;
        int var8 = -arg2 + arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        if (arg5 != 8741) {
            field1103 = -23;
        }
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (~class39.field595 >= ~arg1 && arg1 <= class134.field1917) {
            int[] var15 = class186.field2697[arg1];
            int var16 = class359.method2251(class69.field1047, arg6 - arg4, -95, class433.field6144);
            int var17 = class359.method2251(class69.field1047, arg4 + arg6, -54, class433.field6144);
            int var18 = class359.method2251(class69.field1047, -var8 + arg6, 48, class433.field6144);
            int var19 = class359.method2251(class69.field1047, arg6 - -var8, 97, class433.field6144);
            class396.method2436(-1070, arg0, var16, var15, var18);
            class396.method2436(arg5 + -9811, arg3, var18, var15, var19);
            class396.method2436(-1070, arg0, var19, var15, var17);
        }
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (~var12 <= -1 && ~var11 <= -2) {
                --var11;
                var12 -= var11 << 1;
                class375.field5283[var11] = var7;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg1;
                int var21 = arg1 + var9;
                if (var21 >= class39.field595 && ~var20 >= ~class134.field1917) {
                    if (~var9 > ~var8) {
                        int var22 = class375.field5283[var9];
                        int var23 = class359.method2251(class69.field1047, arg6 + var7, -93, class433.field6144);
                        int var24 = class359.method2251(class69.field1047, -var7 + arg6, 119, class433.field6144);
                        int var25 = class359.method2251(class69.field1047, arg6 + var22, -106, class433.field6144);
                        int var26 = class359.method2251(class69.field1047, -var22 + arg6, 108, class433.field6144);
                        if (~class134.field1917 <= ~var21) {
                            int[] var27 = class186.field2697[var21];
                            class396.method2436(-1070, arg0, var24, var27, var26);
                            class396.method2436(-1070, arg3, var26, var27, var25);
                            class396.method2436(arg5 + -9811, arg0, var25, var27, var23);
                        }
                        if (~var20 <= ~class39.field595) {
                            int[] var28 = class186.field2697[var20];
                            class396.method2436(-1070, arg0, var24, var28, var26);
                            class396.method2436(-1070, arg3, var26, var28, var25);
                            class396.method2436(-1070, arg0, var25, var28, var23);
                        }
                    } else {
                        int var29 = class359.method2251(class69.field1047, arg6 + var7, 96, class433.field6144);
                        int var30 = class359.method2251(class69.field1047, -var7 + arg6, arg5 ^ 8829, class433.field6144);
                        if (~var21 >= ~class134.field1917) {
                            class396.method2436(-1070, arg0, var30, class186.field2697[var21], var29);
                        }
                        if (~class39.field595 >= ~var20) {
                            class396.method2436(-1070, arg0, var30, class186.field2697[var20], var29);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (var32 >= class39.field595 && ~var31 >= ~class134.field1917) {
                int var33 = arg6 + var9;
                int var34 = -var9 + arg6;
                if (~var33 <= ~class433.field6144 && var34 <= class69.field1047) {
                    int var35 = class359.method2251(class69.field1047, var33, 85, class433.field6144);
                    int var36 = class359.method2251(class69.field1047, var34, -77, class433.field6144);
                    if (var8 > var7) {
                        int var37 = var11 >= var7 ? var11 : class375.field5283[var7];
                        int var38 = class359.method2251(class69.field1047, arg6 + var37, -62, class433.field6144);
                        int var39 = class359.method2251(class69.field1047, -var37 + arg6, arg5 + -8624, class433.field6144);
                        if (var32 <= class134.field1917) {
                            int[] var40 = class186.field2697[var32];
                            class396.method2436(arg5 + -9811, arg0, var36, var40, var39);
                            class396.method2436(-1070, arg3, var39, var40, var38);
                            class396.method2436(-1070, arg0, var38, var40, var35);
                        }
                        if (class39.field595 <= var31) {
                            int[] var41 = class186.field2697[var31];
                            class396.method2436(arg5 + -9811, arg0, var36, var41, var39);
                            class396.method2436(arg5 ^ -9737, arg3, var39, var41, var38);
                            class396.method2436(-1070, arg0, var38, var41, var35);
                        }
                    } else {
                        if (~var32 >= ~class134.field1917) {
                            class396.method2436(-1070, arg0, var36, class186.field2697[var32], var35);
                        }
                        if (var31 >= class39.field595) {
                            class396.method2436(-1070, arg0, var36, class186.field2697[var31], var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)I", line = 1203)
    public final int method646(int arg0) {
        ++field1107;
        if (super.field1384) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.field1106 = 49;
            }
            return 100;
        }
    }
}
