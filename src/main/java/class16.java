import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 extends class88 {

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public int field317 = 0;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public int field320 = -1;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "Ltd;")
    public static class136 field321 = class145.method1172("sl_arrows", 45);

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Ltd;")
    private static class136 field314 = class145.method1172("Starting game engine)3)3)3", 45);

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "Ltd;")
    private static class136 field326 = class145.method1172("Loaded fonts", 45);

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "Ltd;")
    public static class136 field327 = field314;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "I")
    public static int field333 = 0;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "Ltd;")
    public static class136 field332 = field326;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "Ltd;")
    public static class136 field330 = class145.method1172("<col=ffffff>", 45);

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "Ltd;")
    public static class136 field331 = class145.method1172("sl_stars", 45);

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public int field323;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public int field324;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public int field328;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "I")
    public int field329;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "[[[I")
    public static int[][][] field322;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V")
    public static void method114(boolean arg0) {
        field322 = null;
        field332 = null;
        field321 = null;
        field314 = null;
        field326 = null;
        if (!arg0) {
            method115(-86);
        }
        field331 = null;
        field327 = null;
        field330 = null;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public static final void method115(int arg0) {
        field319++;
        if (class49.field1094 == 41) {
            int var1 = class4.field70.method1034(-33);
            int var2 = var1 & 0x3;
            int var3 = var1 >> 2;
            int var4 = class141.field3287[var3];
            int var5 = class4.field70.method992(arg0 ^ 0xFFFFA0BE);
            int var6 = class118.field2683 + (var5 >> 4 & 0x7);
            int var7 = (var5 & 0x7) + class120.field2733;
            if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                class24.method215(0, var7, class62.field1331, var3, var2, var4, -1, var6, 0, -1);
            }
        } else if (arg0 == 128) {
            if (class49.field1094 == 127) {
                int var8 = class4.field70.method1011(122);
                int var9 = (var8 & 0x7) + class120.field2733;
                int var10 = (var8 >> 4 & 0x7) + class118.field2683;
                int var11 = class4.field70.method1020(false);
                int var12 = class4.field70.method1011(87);
                int var13 = var12 >> 4 & 0xF;
                int var14 = var12 & 0x7;
                int var15 = class4.field70.method1011(27);
                if (var10 >= 0 && var9 >= 0 && var10 < 104 && var9 < 104) {
                    int var16 = var13 + 1;
                    if (class24.field555.field3560[0] >= var10 - var16 && var10 + var16 >= class24.field555.field3560[0] && var9 - var16 <= class24.field555.field3581[0] && class24.field555.field3581[0] <= var9 + var16 && class83.field1968 != 0 && var14 > 0 && class139.field3224 < 50) {
                        class11.field191[class139.field3224] = var11;
                        class139.field3230[class139.field3224] = var14;
                        class19.field383[class139.field3224] = var15;
                        class153.field3498[class139.field3224] = null;
                        class93.field2182[class139.field3224] = (var10 << 16) + (var9 << 8) + var13;
                        class139.field3224++;
                    }
                }
            }
            if (class49.field1094 == 16) {
                int var17 = class4.field70.method1020(false);
                int var18 = class4.field70.method1019((byte) -39);
                int var19 = class4.field70.method1007(6119);
                int var20 = class4.field70.method1011(82);
                int var21 = (var20 >> 4 & 0x7) + class118.field2683;
                int var22 = (var20 & 0x7) + class120.field2733;
                if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && class113.field2618 != var19) {
                    class106 var23 = new class106();
                    var23.field2495 = var17;
                    var23.field2499 = var18;
                    if (class93.field2197[class62.field1331][var21][var22] == null) {
                        class93.field2197[class62.field1331][var21][var22] = new class69();
                    }
                    class93.field2197[class62.field1331][var21][var22].method509(1, var23);
                    class4.method25(6012, var21, var22);
                }
            } else if (class49.field1094 == 122) {
                int var24 = class4.field70.method1011(77);
                int var25 = (var24 & 0x7) + class120.field2733;
                int var26 = (var24 >> 4 & 0x7) + class118.field2683;
                int var27 = class4.field70.method1020(false);
                int var28 = class4.field70.method1011(arg0 ^ 0x9A);
                int var29 = var28 >> 2;
                int var30 = var28 & 0x3;
                int var31 = class141.field3287[var29];
                if (var26 >= 0 && var25 >= 0 && var26 < 104 && var25 < 104) {
                    class24.method215(0, var25, class62.field1331, var29, var30, var31, var27, var26, 0, -1);
                }
            } else if (class49.field1094 == 96) {
                int var32 = class4.field70.method1011(19);
                int var33 = (var32 >> 4 & 0x7) + class118.field2683;
                int var34 = (var32 & 0x7) + class120.field2733;
                int var35 = class4.field70.method1004((byte) -80);
                int var36 = class4.field70.method1004((byte) -83);
                if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                    class106 var37 = new class106();
                    var37.field2495 = var36;
                    var37.field2499 = var35;
                    if (class93.field2197[class62.field1331][var33][var34] == null) {
                        class93.field2197[class62.field1331][var33][var34] = new class69();
                    }
                    class93.field2197[class62.field1331][var33][var34].method509(arg0 - 127, var37);
                    class4.method25(6012, var33, var34);
                }
            } else if (class49.field1094 == 193) {
                int var38 = class4.field70.method1011(127);
                int var39 = class118.field2683 + (var38 >> 4 & 0x7);
                int var40 = (var38 & 0x7) + class120.field2733;
                int var41 = class4.field70.method1020(false);
                int var42 = class4.field70.method1020(false);
                int var43 = class4.field70.method1020(false);
                if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                    class69 var44 = class93.field2197[class62.field1331][var39][var40];
                    if (var44 != null) {
                        for (class106 var45 = (class106) var44.method512(arg0 ^ 0x80); var45 != null; var45 = (class106) var44.method520((byte) 40)) {
                            if ((var41 & 0x7FFF) == var45.field2499 && var45.field2495 == var42) {
                                var45.field2495 = var43;
                                break;
                            }
                        }
                        class4.method25(6012, var39, var40);
                    }
                }
            } else if (class49.field1094 == 67) {
                int var46 = class4.field70.method994((byte) 124);
                int var47 = (var46 >> 4 & 0x7) + class118.field2683;
                int var48 = (var46 & 0x7) + class120.field2733;
                int var49 = class4.field70.method1020(false);
                if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                    class69 var50 = class93.field2197[class62.field1331][var47][var48];
                    if (var50 != null) {
                        for (class106 var51 = (class106) var50.method512(arg0 ^ 0x80); var51 != null; var51 = (class106) var50.method520((byte) 52)) {
                            if ((var49 & 0x7FFF) == var51.field2499) {
                                var51.method674(arg0 ^ 0xA0);
                                break;
                            }
                        }
                        if (var50.method512(arg0 ^ 0x80) == null) {
                            class93.field2197[class62.field1331][var47][var48] = null;
                        }
                        class4.method25(6012, var47, var48);
                    }
                }
            } else if (class49.field1094 == 241) {
                int var52 = class4.field70.method1011(98);
                int var53 = (var52 >> 4 & 0x7) + class118.field2683;
                int var54 = (var52 & 0x7) + class120.field2733;
                int var55 = class4.field70.method996(arg0 - 124) + var53;
                int var56 = var54 + class4.field70.method996(arg0 - 124);
                int var57 = class4.field70.method1028((byte) 99);
                int var58 = class4.field70.method1020(false);
                int var59 = class4.field70.method1011(70) * 4;
                int var60 = class4.field70.method1011(83) * 4;
                int var61 = class4.field70.method1020(false);
                int var62 = class4.field70.method1020(false);
                int var63 = class4.field70.method1011(68);
                int var64 = class4.field70.method1011(99);
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104 && var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104 && var58 != 65535) {
                    int var65 = var56 * 128 + 64;
                    int var66 = var53 * 128 + 64;
                    int var67 = var54 * 128 + 64;
                    class55 var68 = new class55(var58, class62.field1331, var66, var67, class65.method486(class62.field1331, (byte) -42, var67, var66) - var59, class44.field1013 + var61, class44.field1013 + var62, var63, var64, var57, var60);
                    int var69 = var55 * 128 + 64;
                    var68.method441(class65.method486(class62.field1331, (byte) -42, var65, var69) - var60, class44.field1013 + var61, false, var69, var65);
                    class142.field3305.method509(1, var68);
                }
            } else {
                if (class49.field1094 == 33) {
                    int var70 = class4.field70.method1020(false);
                    byte var71 = class4.field70.method1036(arg0 ^ 0x93);
                    int var72 = class4.field70.method994((byte) 120);
                    int var73 = var72 & 0x3;
                    int var74 = var72 >> 2;
                    int var75 = class141.field3287[var74];
                    int var76 = class4.field70.method1007(6119);
                    int var77 = class4.field70.method1019((byte) -82);
                    byte var78 = class4.field70.method1024(arg0 - 131);
                    byte var79 = class4.field70.method996(arg0 - 124);
                    byte var80 = class4.field70.method1036(41);
                    int var81 = class4.field70.method1020(false);
                    int var82 = class4.field70.method1011(99);
                    class13 var83;
                    if (class113.field2618 == var70) {
                        var83 = class24.field555;
                    } else {
                        var83 = class154.field3518[var70];
                    }
                    int var84 = (var82 & 0x7) + class120.field2733;
                    int var85 = class118.field2683 + (var82 >> 4 & 0x7);
                    if (var83 != null) {
                        class128 var86 = class142.method1154(var77, 105);
                        int var87 = class78.field1804[class62.field1331][var85 + 1][var84];
                        int var88 = class78.field1804[class62.field1331][var85][var84];
                        int var89 = class78.field1804[class62.field1331][var85][var84 + 1];
                        int var90 = class78.field1804[class62.field1331][var85 + 1][var84 + 1];
                        class23 var91 = var86.method1051(var90, var89, var87, (byte) 87, var73, var88, var74);
                        if (var91 != null) {
                            if (var80 > var79) {
                                byte var92 = var80;
                                var80 = var79;
                                var79 = var92;
                            }
                            if (var78 < var71) {
                                byte var93 = var71;
                                var71 = var78;
                                var78 = var93;
                            }
                            class24.method215(var76 + 1, var84, class62.field1331, 0, 0, var75, -1, var85, 0, var81 + 1);
                            var83.field260 = class44.field1013 + var76;
                            var83.field254 = var91;
                            int var94 = var86.field3076;
                            int var95 = var86.field3071;
                            var83.field246 = var81 + class44.field1013;
                            if (var73 == 1 || var73 == 3) {
                                var94 = var86.field3071;
                                var95 = var86.field3076;
                            }
                            var83.field257 = var85 * 128 + var94 * 64;
                            var83.field256 = var84 * 128 + var95 * 64;
                            var83.field244 = class65.method486(class62.field1331, (byte) -42, var83.field256, var83.field257);
                            var83.field233 = var80 + var85;
                            var83.field265 = var79 + var85;
                            var83.field236 = var78 + var84;
                            var83.field245 = var71 + var84;
                        }
                    }
                }
                if (class49.field1094 == 72) {
                    int var96 = class4.field70.method1011(109);
                    int var97 = (var96 >> 4 & 0x7) + class118.field2683;
                    int var98 = class120.field2733 + (var96 & 0x7);
                    int var99 = class4.field70.method992(-24514);
                    int var100 = var99 >> 2;
                    int var101 = var99 & 0x3;
                    int var102 = class141.field3287[var100];
                    int var103 = class4.field70.method1019((byte) -60);
                    if (var97 >= 0 && var98 >= 0 && var97 < 103 && var98 < 103) {
                        int var104 = class78.field1804[class62.field1331][var97 + 1][var98];
                        int var105 = class78.field1804[class62.field1331][var97 + 1][var98 + 1];
                        int var106 = class78.field1804[class62.field1331][var97][var98 + 1];
                        int var107 = class78.field1804[class62.field1331][var97][var98];
                        if (var102 == 0) {
                            class120 var108 = class146.field3366.method738(class62.field1331, var97, var98);
                            if (var108 != null) {
                                int var109 = var108.field2736 >> 14 & 0x7FFF;
                                if (var100 == 2) {
                                    var108.field2738 = new class47(var109, 2, var101 + 4, var107, var104, var105, var106, var103, false, var108.field2738);
                                    var108.field2739 = new class47(var109, 2, var101 + 1 & 0x3, var107, var104, var105, var106, var103, false, var108.field2739);
                                } else {
                                    var108.field2738 = new class47(var109, var100, var101, var107, var104, var105, var106, var103, false, var108.field2738);
                                }
                            }
                        }
                        if (var102 == 1) {
                            class51 var110 = class146.field3366.method772(class62.field1331, var97, var98);
                            if (var110 != null) {
                                var110.field1143 = new class47(var110.field1153 >> 14 & 0x7FFF, 4, 0, var107, var104, var105, var106, var103, false, var110.field1143);
                            }
                        }
                        if (var102 == 2) {
                            if (var100 == 11) {
                                var100 = 10;
                            }
                            class33 var111 = class146.field3366.method750(class62.field1331, var97, var98);
                            if (var111 != null) {
                                var111.field752 = new class47(var111.field740 >> 14 & 0x7FFF, var100, var101, var107, var104, var105, var106, var103, false, var111.field752);
                            }
                        }
                        if (var102 == 3) {
                            class107 var112 = class146.field3366.method749(class62.field1331, var97, var98);
                            if (var112 != null) {
                                var112.field2524 = new class47(var112.field2521 >> 14 & 0x7FFF, 22, var101, var107, var104, var105, var106, var103, false, var112.field2524);
                            }
                        }
                    }
                } else if (class49.field1094 == 222) {
                    int var113 = class4.field70.method1011(43);
                    int var114 = (var113 >> 4 & 0x7) + class118.field2683;
                    int var115 = (var113 & 0x7) + class120.field2733;
                    int var116 = class4.field70.method1020(false);
                    int var117 = class4.field70.method1011(arg0 - 99);
                    int var118 = class4.field70.method1020(false);
                    if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                        int var119 = var115 * 128 + 64;
                        int var120 = var114 * 128 + 64;
                        class151 var121 = new class151(var116, class62.field1331, var120, var119, class65.method486(class62.field1331, (byte) -42, var119, var120) - var117, var118, class44.field1013);
                        class86.field2022.method509(1, var121);
                    }
                }
            }
        }
    }
}
