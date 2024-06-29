import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class215 {

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "Z")
    public boolean field3502 = true;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public int field3494;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public int field3503;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public int field3499;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public int field3500;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "[I")
    public static int[] field3495 = new int[5];

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "Lwm;")
    public static class152 field3498 = class157.method1048("headicons_prayer", 125);

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "Lwm;")
    public static class152 field3504 = class157.method1048("<img=0>", 125);

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "[[Loe;")
    public static class127[][] field3501;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIII)V", line = 14)
    public static final void method1444(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3496++;
        for (class172 var5 = (class172) class94.field1334.method1221((byte) 95); var5 != null; var5 = (class172) class94.field1334.method1223(71)) {
            class307.method2139(false, var5, arg4, arg1, arg3, arg2);
        }
        for (class172 var6 = (class172) class17.field240.method1221((byte) 67); var6 != null; var6 = (class172) class17.field240.method1223(arg0 + 111)) {
            byte var7 = 1;
            class251 var8 = var6.field2742.method1706((byte) -45);
            if (var6.field2742.field4224 == var8.field4310) {
                var7 = 0;
            } else if (var6.field2742.field4224 == var8.field4286 || var6.field2742.field4224 == var8.field4301 || var6.field2742.field4224 == var8.field4296 || var6.field2742.field4224 == var8.field4303) {
                var7 = 2;
            } else if (var6.field2742.field4224 == var8.field4280 || var6.field2742.field4224 == var8.field4307 || var6.field2742.field4224 == var8.field4282 || var6.field2742.field4224 == var8.field4318) {
                var7 = 3;
            }
            if (var6.field2753 != var7) {
                int var9 = class162.method1085(false, var6.field2742);
                if (var6.field2729 != var9) {
                    if (var6.field2746 != null) {
                        class290.field4916.method1495(var6.field2746);
                        var6.field2746 = null;
                    }
                    var6.field2729 = var9;
                }
                var6.field2753 = var7;
            }
            var6.field2730 = var6.field2742.field4162;
            var6.field2728 = var6.field2742.field4162 + var6.field2742.method67(-4391) * 64;
            var6.field2735 = var6.field2742.field4231;
            var6.field2734 = var6.field2742.field4231 + (var6.field2742.method67(arg0 - 4392) * 64);
            class307.method2139(false, var6, arg4, arg1, arg3, arg2);
        }
        if (arg0 != 1) {
            field3501 = (class127[][]) ((class127[][]) null);
        }
        for (class172 var10 = (class172) class57.field877.method1585(-1506054736); var10 != null; var10 = (class172) class57.field877.method1581((byte) 99)) {
            byte var11 = 1;
            class251 var12 = var10.field2736.method1706((byte) 116);
            if (var10.field2736.field4224 == var12.field4310) {
                var11 = 0;
            } else if (var10.field2736.field4224 == var12.field4286 || var10.field2736.field4224 == var12.field4301 || var10.field2736.field4224 == var12.field4296 || var10.field2736.field4224 == var12.field4303) {
                var11 = 2;
            } else if (var10.field2736.field4224 == var12.field4280 || var10.field2736.field4224 == var12.field4307 || var10.field2736.field4224 == var12.field4282 || var10.field2736.field4224 == var12.field4318) {
                var11 = 3;
            }
            if (var10.field2753 != var11) {
                int var13 = class117.method774(var10.field2736, true);
                if (var10.field2729 != var13) {
                    if (var10.field2746 != null) {
                        class290.field4916.method1495(var10.field2746);
                        var10.field2746 = null;
                    }
                    var10.field2729 = var13;
                }
                var10.field2753 = var11;
            }
            var10.field2730 = var10.field2736.field4162;
            var10.field2728 = var10.field2736.field4162 + (var10.field2736.method67(-4391) * 64);
            var10.field2735 = var10.field2736.field4231;
            var10.field2734 = var10.field2736.field4231 + var10.field2736.method67(-4391) * 64;
            class307.method2139(false, var10, arg4, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 126)
    public static void method1445(int arg0) {
        field3495 = null;
        if (arg0 != 0) {
            method1446((byte) 71);
        }
        field3498 = null;
        field3504 = null;
        field3501 = (class127[][]) null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 141)
    public static final void method1446(byte arg0) {
        field3490++;
        if (class294.field5034 == 13) {
            int var1 = class73.field1058.method1976((byte) 86);
            int var2 = class73.field1058.method2011(-103);
            int var3 = (var2 & 0x7) + class325.field5672;
            int var4 = ((var2 & 0x7A) >> 4) + class70.field1019;
            int var5 = class73.field1058.method1976((byte) 86);
            int var6 = class73.field1058.method2021((byte) 74);
            if (var4 >= 0 && var3 >= 0 && var4 < 104 && var3 < 104 && class27.field466 != var1) {
                class135 var7 = new class135();
                var7.field2071 = var6;
                var7.field2074 = var5;
                if (class205.field3353[class23.field400][var4][var3] == null) {
                    class205.field3353[class23.field400][var4][var3] = new class183();
                }
                class205.field3353[class23.field400][var4][var3].method1214(false, new class230(var7));
                class268.method1833(var4, var3, (byte) 127);
            }
        } else if (class294.field5034 == 148) {
            int var8 = class73.field1058.method1997(22720);
            int var9 = var8 >> 2;
            int var10 = var8 & 0x3;
            int var11 = class69.field1008[var9];
            int var12 = class73.field1058.method2021((byte) 74);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class73.field1058.method1990((byte) 86);
            int var14 = ((var13 & 0x79) >> 4) + class70.field1019;
            int var15 = class325.field5672 + (var13 & 0x7);
            class57.method376(var11, var9, 3491, var15, var10, var14, var12, class23.field400);
        } else if (class294.field5034 == 251) {
            int var147 = class73.field1058.method1979(0);
            int var148 = class73.field1058.method1979(0);
            int var149 = class73.field1058.method1997(22720);
            int var150 = (var149 >> 4 & 0x7) + class70.field1019;
            int var151 = class325.field5672 + (var149 & 0x7);
            if (var150 >= 0 && var151 >= 0 && var150 < 104 && var151 < 104) {
                class135 var152 = new class135();
                var152.field2074 = var148;
                var152.field2071 = var147;
                if (class205.field3353[class23.field400][var150][var151] == null) {
                    class205.field3353[class23.field400][var150][var151] = new class183();
                }
                class205.field3353[class23.field400][var150][var151].method1214(false, new class230(var152));
                class268.method1833(var150, var151, (byte) 12);
            }
        } else if (class294.field5034 == 175) {
            int var129 = class73.field1058.method2011(-72);
            int var130 = (var129 >> 4 & 0xF) + class70.field1019 * 2;
            int var131 = (var129 & 0xF) + class325.field5672 * 2;
            int var132 = var130 + class73.field1058.method1962(false);
            int var133 = class73.field1058.method1962(false) + var131;
            int var134 = class73.field1058.method1986(true);
            int var135 = class73.field1058.method2021((byte) 74);
            int var136 = class73.field1058.method2011(-115) * 4;
            int var137 = class73.field1058.method2011(-55) * 4;
            int var138 = class73.field1058.method2021((byte) 74);
            int var139 = class73.field1058.method2021((byte) 74);
            int var140 = class73.field1058.method2011(-121);
            if (var140 == 255) {
                var140 = -1;
            }
            int var141 = class73.field1058.method2011(-122);
            if (var130 >= 0 && var131 >= 0 && var130 < 208 && var131 < 208 && var132 >= 0 && var133 >= 0 && var132 < 208 && var133 < 208 && var135 != 65535) {
                int var142 = var133 * 64;
                int var143 = var132 * 64;
                int var144 = var130 * 64;
                int var145 = var131 * 64;
                class245 var146 = new class245(var135, class23.field400, var144, var145, class154.method1031(117, var144, class23.field400, var145) - var136, class142.field2187 + var138, var139 + class142.field2187, var140, var141, var134, var137);
                var146.method1691(var142, class154.method1031(73, var143, class23.field400, var142) - var137, 7390, class142.field2187 + var138, var143);
                class185.field2944.method1214(false, new class208(var146));
            }
        } else if (class294.field5034 == 10) {
            int var120 = class73.field1058.method2011(arg0 - 136);
            int var121 = ((var120 & 0x7C) >> 4) + class70.field1019;
            int var122 = (var120 & 0x7) + class325.field5672;
            int var123 = class73.field1058.method2021((byte) 74);
            int var124 = class73.field1058.method2011(arg0 ^ 0xFFFFFFC5);
            if (var123 == 65535) {
                var123 = -1;
            }
            int var125 = var124 >> 4 & 0xF;
            int var126 = var124 & 0x7;
            int var127 = class73.field1058.method2011(arg0 ^ 0xFFFFFFF4);
            if (var121 >= 0 && var122 >= 0 && var121 < 104 && var122 < 104) {
                int var128 = var125 + 1;
                if ((var121 - var128) <= class85.field1176.field4188[0] && var121 + var128 >= class85.field1176.field4188[0] && (var122 - var128) <= class85.field1176.field4245[0] && (var122 + var128) >= class85.field1176.field4245[0] && class72.field1048 != 0 && var126 > 0 && class150.field2329 < 50 && var123 != -1) {
                    class77.field1098[class150.field2329] = var123;
                    class192.field3040[class150.field2329] = var126;
                    class281.field4795[class150.field2329] = var127;
                    class169.field2656[class150.field2329] = null;
                    class106.field1516[class150.field2329] = (var121 << 16) + ((var122 << 8) + var125);
                    class150.field2329++;
                }
            }
        } else if (arg0 == 118) {
            if (class294.field5034 == 28) {
                int var102 = class73.field1058.method2011(-73);
                int var103 = ((var102 & 0x75) >> 4) + class70.field1019;
                int var104 = (var102 & 0x7) + class325.field5672;
                int var105 = var103 + class73.field1058.method1962(false);
                int var106 = var104 + class73.field1058.method1962(false);
                int var107 = class73.field1058.method1986(true);
                int var108 = class73.field1058.method2021((byte) 74);
                int var109 = class73.field1058.method2011(arg0 - 202) * 4;
                int var110 = class73.field1058.method2011(arg0 - 177) * 4;
                int var111 = class73.field1058.method2021((byte) 74);
                int var112 = class73.field1058.method2021((byte) 74);
                int var113 = class73.field1058.method2011(arg0 - 173);
                if (var113 == 255) {
                    var113 = -1;
                }
                int var114 = class73.field1058.method2011(-17);
                if (var103 >= 0 && var104 >= 0 && var103 < 104 && var104 < 104 && var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var108 != 65535) {
                    int var115 = var105 * 128 + 64;
                    int var116 = var104 * 128 + 64;
                    int var117 = var103 * 128 + 64;
                    int var118 = var106 * 128 + 64;
                    class245 var119 = new class245(var108, class23.field400, var117, var116, class154.method1031(93, var117, class23.field400, var116) - var109, class142.field2187 + var111, var112 + class142.field2187, var113, var114, var107, var110);
                    var119.method1691(var118, class154.method1031(arg0 - 3, var115, class23.field400, var118) - var110, 7390, class142.field2187 + var111, var115);
                    class185.field2944.method1214(false, new class208(var119));
                }
            } else if (class294.field5034 == 53) {
                int var93 = class73.field1058.method2011(-54);
                int var94 = (var93 & 0x7) + class325.field5672;
                int var95 = (var93 >> 4 & 0x7) + class70.field1019;
                int var96 = class73.field1058.method2021((byte) 74);
                int var97 = class73.field1058.method2011(-40);
                int var98 = class73.field1058.method2021((byte) 74);
                if (var95 >= 0 && var94 >= 0 && var95 < 104 && var94 < 104) {
                    int var99 = var94 * 128 + 64;
                    int var100 = var95 * 128 + 64;
                    class289 var101 = new class289(var96, class23.field400, var100, var99, class154.method1031(105, var100, class23.field400, var99) - var97, var98, class142.field2187);
                    class146.field2234.method1214(false, new class314(var101));
                }
            } else if (class294.field5034 == 7) {
                int var60 = class73.field1058.method2011(arg0 - 207);
                int var61 = ((var60 & 0xF1) >> 4) + class70.field1019 * 2;
                int var62 = (var60 & 0xF) + class325.field5672 * 2;
                int var63 = var61 + class73.field1058.method1962(false);
                int var64 = var62 + class73.field1058.method1962(false);
                int var65 = class73.field1058.method1986(true);
                int var66 = class73.field1058.method1986(true);
                int var67 = class73.field1058.method2021((byte) 74);
                int var68 = class73.field1058.method1962(false);
                int var69 = class73.field1058.method2011(-81) * 4;
                int var70 = class73.field1058.method2021((byte) 74);
                int var71 = class73.field1058.method2021((byte) 74);
                int var72 = class73.field1058.method2011(-30);
                if (var72 == 255) {
                    var72 = -1;
                }
                int var73 = class73.field1058.method2011(-26);
                if (var61 >= 0 && var62 >= 0 && var61 < 208 && var62 < 208 && var63 >= 0 && var64 >= 0 && var63 < 208 && var64 < 208 && var67 != 65535) {
                    int var74 = var61 * 64;
                    int var75 = var63 * 64;
                    int var76 = var64 * 64;
                    int var77 = var62 * 64;
                    if (var65 != 0) {
                        int var79;
                        class249 var81;
                        if (var65 < 0) {
                            int var78 = -var65 - 1;
                            var79 = var78 >> 11 & 0xF;
                            int var80 = var78 & 0x7FF;
                            if (class27.field466 == var80) {
                                var81 = class85.field1176;
                            } else {
                                var81 = class22.field380[var80];
                            }
                        } else {
                            int var82 = var65 - 1;
                            int var83 = var82 & 0x7FF;
                            var81 = class40.field649[var83];
                            var79 = var82 >> 11 & 0xF;
                        }
                        if (var81 != null) {
                            class251 var84 = var81.method1706((byte) 100);
                            if (var84.field4284 != null && var84.field4284[var79] != null) {
                                var68 -= var84.field4284[var79][1];
                                int var85 = var84.field4284[var79][2];
                                int var86 = class181.field2884[var81.field4161];
                                int var87 = var84.field4284[var79][0];
                                int var88 = class181.field2886[var81.field4161];
                                int var89 = var85 * var86 + var87 * var88 >> 16;
                                int var90 = var85 * var88 - var86 * var87 >> 16;
                                var77 += var90;
                                var74 += var89;
                            }
                        }
                    }
                    class245 var92 = new class245(var67, class23.field400, var74, var77, class154.method1031(111, var74, class23.field400, var77) - var68, var70 - -class142.field2187, class142.field2187 + var71, var72, var73, var66, var69);
                    var92.method1691(var76, class154.method1031(arg0 ^ 0x5D, var75, class23.field400, var76) - var69, 7390, class142.field2187 + var70, var75);
                    class185.field2944.method1214(false, new class208(var92));
                }
            } else {
                if (class294.field5034 == 71) {
                    byte var16 = class73.field1058.method2014(128);
                    int var17 = class73.field1058.method2007((byte) 101);
                    int var18 = class73.field1058.method1979(arg0 ^ 0x76);
                    byte var19 = class73.field1058.method1962(false);
                    int var20 = class73.field1058.method1957(arg0 ^ 0x3056449E);
                    int var21 = class73.field1058.method1990((byte) 106);
                    int var22 = var21 >> 2;
                    int var23 = var21 & 0x3;
                    byte var24 = class73.field1058.method1962(false);
                    int var25 = class73.field1058.method1990((byte) 96);
                    int var26 = (var25 >> 4 & 0x7) + class70.field1019;
                    int var27 = (var25 & 0x7) + class325.field5672;
                    int var28 = class73.field1058.method1976((byte) 86);
                    byte var29 = class73.field1058.method1962(false);
                    if (!class217.field3516) {
                        class294.method2030(var20, var26, var22, var19, var16, arg0 - 119, var24, var17, var28, var18, var29, var23, var27);
                    }
                }
                if (class294.field5034 == 80) {
                    int var53 = class73.field1058.method1990((byte) 87);
                    int var54 = var53 & 0x3;
                    int var55 = var53 >> 2;
                    int var56 = class69.field1008[var55];
                    int var57 = class73.field1058.method1990((byte) 107);
                    int var58 = class70.field1019 + ((var57 & 0x7A) >> 4);
                    int var59 = (var57 & 0x7) + class325.field5672;
                    if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                        class275.method1886(-1, var55, (byte) -107, var59, var54, var58, 0, var56, class23.field400, -1);
                    }
                } else if (class294.field5034 == 171) {
                    int var30 = class73.field1058.method2011(arg0 ^ 0xFFFFFFE1);
                    int var31 = ((var30 & 0x79) >> 4) + class70.field1019;
                    int var32 = (var30 & 0x7) + class325.field5672;
                    int var33 = class73.field1058.method2021((byte) 74);
                    int var34 = class73.field1058.method2021((byte) 74);
                    int var35 = class73.field1058.method2021((byte) 74);
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class183 var36 = class205.field3353[class23.field400][var31][var32];
                        if (var36 != null) {
                            for (class230 var37 = (class230) var36.method1221((byte) 80); var37 != null; var37 = (class230) var36.method1223(57)) {
                                class135 var38 = var37.field3756;
                                if ((var33 & 0x7FFF) == var38.field2071 && var38.field2074 == var34) {
                                    var38.field2074 = var35;
                                    break;
                                }
                            }
                            class268.method1833(var31, var32, (byte) 103);
                        }
                    }
                } else if (class294.field5034 == 147) {
                    int var39 = class73.field1058.method2011(-20);
                    int var40 = class70.field1019 + (var39 >> 4 & 0x7);
                    int var41 = (var39 & 0x7) + class325.field5672;
                    int var42 = class73.field1058.method1957(810960104);
                    int var43 = class73.field1058.method2011(arg0 ^ 0xFFFFFFA3);
                    int var44 = var43 & 0x3;
                    int var45 = var43 >> 2;
                    int var46 = class69.field1008[var45];
                    if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                        class275.method1886(var42, var45, (byte) 127, var41, var44, var40, 0, var46, class23.field400, -1);
                    }
                } else if (class294.field5034 == 134) {
                    int var47 = class73.field1058.method1979(0);
                    int var48 = class73.field1058.method1997(arg0 ^ 0x58B6);
                    int var49 = class70.field1019 + ((var48 & 0x73) >> 4);
                    int var50 = (var48 & 0x7) + class325.field5672;
                    if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                        class183 var51 = class205.field3353[class23.field400][var49][var50];
                        if (var51 != null) {
                            for (class230 var52 = (class230) var51.method1221((byte) 114); var52 != null; var52 = (class230) var51.method1223(arg0 - 56)) {
                                if ((var47 & 0x7FFF) == var52.field3756.field2071) {
                                    var52.method1880(-25368);
                                    break;
                                }
                            }
                            if (var51.method1221((byte) 125) == null) {
                                class205.field3353[class23.field400][var49][var50] = null;
                            }
                            class268.method1833(var49, var50, (byte) -10);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIIIII)V", line = 729)
    public static final void method1447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -105) {
            return;
        }
        field3497++;
        int var8 = arg6;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg5 - arg4;
        int var12 = arg6 - arg4;
        int var13 = var11 * var11;
        int var14 = arg5 * arg5;
        int var15 = arg6 * arg6;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var15 << 1;
        int var19 = var16 << 1;
        int var20 = var13 << 1;
        int var21 = var12 << 1;
        int var22 = arg6 << 1;
        int var23 = (1 - var22) * var14 + var18;
        int var24 = var15 - ((var22 - 1) * var17);
        int var25 = (1 - var21) * var13 + var19;
        int var26 = var15 << 2;
        int var27 = var14 << 2;
        int var28 = var16 - ((var21 - 1) * var20);
        int var29 = var13 << 2;
        int var30 = var16 << 2;
        int var31 = var18 * 3;
        int var32 = (var22 - 3) * var17;
        int var33 = var19 * 3;
        int var34 = (var21 - 3) * var20;
        int var35 = var26;
        int var36 = (arg6 - 1) * var27;
        int var37 = var30;
        int[] var38 = class179.field2843[arg7];
        class275.method1885(arg2, var38, arg1 - arg5, -var11 + arg1, -2611);
        int var39 = (var12 - 1) * var29;
        class275.method1885(arg3, var38, arg1 - var11, arg1 - -var11, -2611);
        class275.method1885(arg2, var38, arg1 + var11, arg1 + arg5, -2611);
        while (var8 > 0) {
            boolean var40 = var12 >= var8;
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var10++;
                    var31 += var26;
                    var24 += var35;
                    var35 += var26;
                }
            }
            var8--;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var28 += var37;
                        var37 += var30;
                        var25 += var33;
                        var9++;
                        var33 += var30;
                    }
                }
                if (var28 < 0) {
                    var25 += var33;
                    var33 += var30;
                    var28 += var37;
                    var37 += var30;
                    var9++;
                }
                var28 += -var34;
                var25 += -var39;
                var34 -= var29;
                var39 -= var29;
            }
            int var41 = arg7 + var8;
            if (var24 < 0) {
                var10++;
                var24 += var35;
                var35 += var26;
                var23 += var31;
                var31 += var26;
            }
            int var42 = arg7 - var8;
            var23 += -var36;
            var36 -= var27;
            int var43 = arg1 - var10;
            int var44 = arg1 + var10;
            if (var40) {
                int var45 = arg1 + var9;
                int var46 = arg1 - var9;
                class275.method1885(arg2, class179.field2843[var42], var43, var46, -2611);
                class275.method1885(arg3, class179.field2843[var42], var46, var45, arg0 - 2506);
                class275.method1885(arg2, class179.field2843[var42], var45, var44, -2611);
                class275.method1885(arg2, class179.field2843[var41], var43, var46, -2611);
                class275.method1885(arg3, class179.field2843[var41], var46, var45, -2611);
                class275.method1885(arg2, class179.field2843[var41], var45, var44, -2611);
            } else {
                class275.method1885(arg2, class179.field2843[var42], var43, var44, arg0 - 2506);
                class275.method1885(arg2, class179.field2843[var41], var43, var44, -2611);
            }
            var24 += -var32;
            var32 -= var27;
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(IIIIIIZ)V", line = 922)
    public class215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3494 = arg0;
        this.field3503 = arg3;
        this.field3499 = arg5;
        this.field3491 = arg1;
        this.field3502 = arg6;
        this.field3500 = arg2;
        this.field3492 = arg4;
    }
}
