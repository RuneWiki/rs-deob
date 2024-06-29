import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class66 extends class21 {

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
    private int field1250 = 3216;

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "I")
    private int field1254 = 3216;

    @OriginalMember(owner = "client!wl", name = "bb", descriptor = "[I")
    private int[] field1263 = new int[3];

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
    private int field1253 = 4096;

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "[I")
    public static int[] field1251 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!wl", name = "V", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!wl", name = "W", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!wl", name = "X", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!wl", name = "Y", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!wl", name = "Z", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!wl", name = "ab", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!wl", name = "cb", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!wl", name = "db", descriptor = "Lve;")
    public static class278 field1265;

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V", line = 7)
    public class66() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(I)V", line = 12)
    public static final void method505(int arg0) {
        field1256++;
        if (class301.field4559 == 239) {
            int var1 = class190.field3082.method1304(-126);
            int var2 = class190.field3082.method1302((byte) -52);
            int var3 = class50.field1010 + (var2 >> 4 & 0x7);
            int var4 = (var2 & 0x7) + class44.field840;
            int var5 = class190.field3082.method1322((byte) 98);
            int var6 = class190.field3082.method1322((byte) 98);
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && class100.field1758 != var6) {
                class140 var7 = new class140();
                var7.field2313 = var5;
                var7.field2323 = var1;
                if (class62.field1186[class289.field4438][var3][var4] == null) {
                    class62.field1186[class289.field4438][var3][var4] = new class55();
                }
                class62.field1186[class289.field4438][var3][var4].method427((byte) 78, new class173(var7));
                class240.method1592(var3, -124, var4);
            }
        } else if (class301.field4559 == 49) {
            int var148 = class190.field3082.method1304(-126);
            int var149 = class190.field3082.method1302((byte) -52);
            int var150 = var149 >> 2;
            int var151 = var149 & 0x3;
            int var152 = class255.field3975[var150];
            int var153 = class190.field3082.method1325((byte) -51);
            int var154 = class50.field1010 + (var153 >> 4 & 0x7);
            int var155 = class44.field840 + (var153 & 0x7);
            if (var154 >= 0 && var155 >= 0 && var154 < 104 && var155 < 104) {
                class317.method2187(var148, var154, var152, -1, var150, class289.field4438, var155, -128, var151, 0);
            }
        } else if (class301.field4559 == 170) {
            int var8 = class190.field3082.method1317((byte) -120);
            int var9 = (var8 & 0x7) + class44.field840;
            int var10 = (var8 >> 4 & 0x7) + class50.field1010;
            int var11 = class190.field3082.method1333(-127) + var10;
            int var12 = class190.field3082.method1333(-125) + var9;
            int var13 = class190.field3082.method1356(false);
            int var14 = class190.field3082.method1315(14289);
            int var15 = class190.field3082.method1317((byte) -109) * 4;
            int var16 = class190.field3082.method1317((byte) -98) * 4;
            int var17 = class190.field3082.method1315(14289);
            int var18 = class190.field3082.method1315(14289);
            int var19 = class190.field3082.method1317((byte) -123);
            int var20 = class190.field3082.method1317((byte) -77);
            if (var19 == 255) {
                var19 = -1;
            }
            if (var10 >= 0 && var9 >= 0 && var10 < 104 && var9 < 104 && var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104 && var14 != 65535) {
                int var21 = var9 * 128 + 64;
                int var22 = var12 * 128 + 64;
                int var23 = var10 * 128 + 64;
                class114 var24 = new class114(var14, class289.field4438, var23, var21, class325.method2250(var21, 22771, class289.field4438, var23) - var15, var17 - -class25.field494, class25.field494 + var18, var19, var20, var13, var16);
                int var25 = var11 * 128 + 64;
                var24.method736(var17 + class25.field494, -97, var25, var22, class325.method2250(var22, 22771, class289.field4438, var25) - var16);
                class48.field992.method427((byte) 92, new class253(var24));
            }
        } else {
            if (class301.field4559 == 69) {
                int var26 = class190.field3082.method1355((byte) 36);
                int var27 = class190.field3082.method1322((byte) 98);
                byte var28 = class190.field3082.method1316(105);
                int var29 = class190.field3082.method1325((byte) -51);
                int var30 = var29 >> 2;
                int var31 = class190.field3082.method1325((byte) -51);
                int var32 = var29 & 0x3;
                int var33 = (var31 >> 4 & 0x7) + class50.field1010;
                int var34 = class44.field840 + (var31 & 0x7);
                byte var35 = class190.field3082.method1345(false);
                byte var36 = class190.field3082.method1300(39);
                byte var37 = class190.field3082.method1316(95);
                int var38 = class190.field3082.method1315(14289);
                int var39 = class190.field3082.method1322((byte) 98);
                if (!class249.field3893) {
                    class64.method492(var38, var27, var28, var37, var39, var36, var33, var34, (byte) 125, var32, var35, var26, var30);
                }
            }
            if (class301.field4559 == 87) {
                int var142 = class190.field3082.method1322((byte) 98);
                int var143 = class190.field3082.method1302((byte) -52);
                int var144 = ((var143 & 0x73) >> 4) + class50.field1010;
                int var145 = (var143 & 0x7) + class44.field840;
                int var146 = class190.field3082.method1315(14289);
                if (var144 >= 0 && var145 >= 0 && var144 < 104 && var145 < 104) {
                    class140 var147 = new class140();
                    var147.field2323 = var142;
                    var147.field2313 = var146;
                    if (class62.field1186[class289.field4438][var144][var145] == null) {
                        class62.field1186[class289.field4438][var144][var145] = new class55();
                    }
                    class62.field1186[class289.field4438][var144][var145].method427((byte) 108, new class173(var147));
                    class240.method1592(var144, -124, var145);
                }
            } else if (class301.field4559 == 52) {
                int var134 = class190.field3082.method1304(-123);
                if (var134 == 65535) {
                    var134 = -1;
                }
                int var135 = class190.field3082.method1317((byte) -86);
                int var136 = var135 >> 2;
                int var137 = var135 & 0x3;
                int var138 = class255.field3975[var136];
                int var139 = class190.field3082.method1305(36);
                int var140 = (var139 & 0x7) + class44.field840;
                int var141 = ((var139 & 0x79) >> 4) + class50.field1010;
                class236.method1565(var134, var140, class289.field4438, var138, 125, var136, var141, var137);
            } else {
                if (arg0 > -22) {
                    method511(119);
                }
                if (class301.field4559 == 229) {
                    int var40 = class190.field3082.method1317((byte) -75);
                    int var41 = ((var40 & 0xF9) >> 4) + class50.field1010 * 2;
                    int var42 = class44.field840 * 2 + (var40 & 0xF);
                    int var43 = class190.field3082.method1333(-125) + var41;
                    int var44 = var42 + class190.field3082.method1333(-128);
                    int var45 = class190.field3082.method1356(false);
                    int var46 = class190.field3082.method1315(14289);
                    int var47 = class190.field3082.method1317((byte) -92) * 4;
                    int var48 = class190.field3082.method1317((byte) -102) * 4;
                    int var49 = class190.field3082.method1315(14289);
                    int var50 = class190.field3082.method1315(14289);
                    int var51 = class190.field3082.method1317((byte) -70);
                    if (var51 == 255) {
                        var51 = -1;
                    }
                    int var52 = class190.field3082.method1317((byte) -117);
                    if (var41 >= 0 && var42 >= 0 && var41 < 208 && var42 < 208 && var43 >= 0 && var44 >= 0 && var43 < 208 && var44 < 208 && var46 != 65535) {
                        int var53 = var42 * 64;
                        int var54 = var41 * 64;
                        int var55 = var43 * 64;
                        int var56 = var44 * 64;
                        class114 var57 = new class114(var46, class289.field4438, var54, var53, class325.method2250(var53, 22771, class289.field4438, var54) - var47, class25.field494 + var49, class25.field494 + var50, var51, var52, var45, var48);
                        var57.method736(class25.field494 + var49, 30, var55, var56, class325.method2250(var56, 22771, class289.field4438, var55) - var48);
                        class48.field992.method427((byte) -74, new class253(var57));
                    }
                } else if (class301.field4559 == 180) {
                    int var58 = class190.field3082.method1317((byte) -103);
                    int var59 = (var58 >> 4 & 0x7) + class50.field1010;
                    int var60 = (var58 & 0x7) + class44.field840;
                    int var61 = class190.field3082.method1315(14289);
                    if (var61 == 65535) {
                        var61 = -1;
                    }
                    int var62 = class190.field3082.method1317((byte) -107);
                    int var63 = class190.field3082.method1317((byte) -105);
                    int var64 = class190.field3082.method1317((byte) -128);
                    int var65 = var62 & 0x7;
                    int var66 = var62 >> 4 & 0xF;
                    if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                        int var67 = var66 + 1;
                        if (field1265.field1871[0] >= (var59 - var67) && field1265.field1871[0] <= (var59 + var67) && var60 - var67 <= field1265.field1899[0] && field1265.field1899[0] <= var60 + var67 && class80.field1573 != 0 && var65 > 0 && class48.field986 < 50 && var61 != -1) {
                            class135.field2266[class48.field986] = var61;
                            class202.field3283[class48.field986] = var65;
                            class328.field5034[class48.field986] = var63;
                            class278.field4262[class48.field986] = null;
                            class2.field35[class48.field986] = (var59 << 16) + (var60 << 8) + var66;
                            class72.field1500[class48.field986] = var64;
                            class48.field986++;
                        }
                    }
                } else if (class301.field4559 == 222) {
                    int var101 = class190.field3082.method1317((byte) -97);
                    int var102 = ((var101 & 0xFD) >> 4) + class50.field1010 * 2;
                    int var103 = (var101 & 0xF) + class44.field840 * 2;
                    int var104 = var102 + class190.field3082.method1333(-125);
                    int var105 = class190.field3082.method1333(-128) + var103;
                    int var106 = class190.field3082.method1356(false);
                    int var107 = class190.field3082.method1356(false);
                    int var108 = class190.field3082.method1315(14289);
                    int var109 = class190.field3082.method1333(-125);
                    int var110 = class190.field3082.method1317((byte) -96) * 4;
                    int var111 = class190.field3082.method1315(14289);
                    int var112 = class190.field3082.method1315(14289);
                    int var113 = class190.field3082.method1317((byte) -115);
                    int var114 = class190.field3082.method1317((byte) -111);
                    if (var113 == 255) {
                        var113 = -1;
                    }
                    if (var102 >= 0 && var103 >= 0 && var102 < 208 && var103 < 208 && var104 >= 0 && var105 >= 0 && var104 < 208 && var105 < 208 && var108 != 65535) {
                        int var115 = var105 * 64;
                        int var116 = var102 * 64;
                        int var117 = var104 * 64;
                        int var118 = var103 * 64;
                        if (var106 != 0) {
                            int var121;
                            class109 var122;
                            if (var106 >= 0) {
                                int var119 = var106 - 1;
                                int var120 = var119 & 0x7FF;
                                var121 = var119 >> 11 & 0xF;
                                var122 = class8.field179[var120];
                            } else {
                                int var123 = -var106 - 1;
                                int var124 = var123 & 0x7FF;
                                if (class100.field1758 == var124) {
                                    var122 = field1265;
                                } else {
                                    var122 = class97.field1715[var124];
                                }
                                var121 = var123 >> 11 & 0xF;
                            }
                            if (var122 != null) {
                                class322 var125 = var122.method698(109);
                                if (var125.field4912 != null && var125.field4912[var121] != null) {
                                    int var126 = var125.field4912[var121][0];
                                    int var127 = var125.field4912[var121][2];
                                    var109 -= var125.field4912[var121][1];
                                    int var128 = class284.field4395[var122.field1927];
                                    int var129 = class284.field4398[var122.field1927];
                                    int var130 = var126 * var129 + var127 * var128 >> 16;
                                    int var131 = var127 * var129 - (var126 * var128) >> 16;
                                    var118 += var131;
                                    var116 += var130;
                                }
                            }
                        }
                        class114 var133 = new class114(var108, class289.field4438, var116, var118, class325.method2250(var118, 22771, class289.field4438, var116) - var109, class25.field494 + var111, var112 + class25.field494, var113, var114, var107, var110);
                        var133.method736(class25.field494 + var111, 68, var117, var115, class325.method2250(var115, 22771, class289.field4438, var117) - var110);
                        class48.field992.method427((byte) 85, new class253(var133));
                    }
                } else if (class301.field4559 == 112) {
                    int var92 = class190.field3082.method1317((byte) -118);
                    int var93 = (var92 >> 4 & 0x7) + class50.field1010;
                    int var94 = class44.field840 + (var92 & 0x7);
                    int var95 = class190.field3082.method1315(14289);
                    int var96 = class190.field3082.method1315(14289);
                    int var97 = class190.field3082.method1315(14289);
                    if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                        class55 var98 = class62.field1186[class289.field4438][var93][var94];
                        if (var98 != null) {
                            for (class173 var99 = (class173) var98.method424(-53); var99 != null; var99 = (class173) var98.method425(-32547)) {
                                class140 var100 = var99.field2779;
                                if ((var95 & 0x7FFF) == var100.field2313 && var100.field2323 == var96) {
                                    var100.field2323 = var97;
                                    break;
                                }
                            }
                            class240.method1592(var93, -125, var94);
                        }
                    }
                } else if (class301.field4559 == 195) {
                    int var68 = class190.field3082.method1315(14289);
                    int var69 = class190.field3082.method1317((byte) -122);
                    class277.method1864(var68, 0).method246(var69, (byte) -122);
                } else if (class301.field4559 == 99) {
                    int var70 = class190.field3082.method1302((byte) -52);
                    int var71 = var70 & 0x3;
                    int var72 = var70 >> 2;
                    int var73 = class255.field3975[var72];
                    int var74 = class190.field3082.method1317((byte) -72);
                    int var75 = ((var74 & 0x72) >> 4) + class50.field1010;
                    int var76 = (var74 & 0x7) + class44.field840;
                    if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104) {
                        class317.method2187(-1, var75, var73, -1, var72, class289.field4438, var76, -117, var71, 0);
                    }
                } else if (class301.field4559 == 203) {
                    int var77 = class190.field3082.method1325((byte) -51);
                    int var78 = (var77 & 0x7) + class44.field840;
                    int var79 = ((var77 & 0x7E) >> 4) + class50.field1010;
                    int var80 = class190.field3082.method1315(14289);
                    if (var79 >= 0 && var78 >= 0 && var79 < 104 && var78 < 104) {
                        class55 var81 = class62.field1186[class289.field4438][var79][var78];
                        if (var81 != null) {
                            for (class173 var82 = (class173) var81.method424(-100); var82 != null; var82 = (class173) var81.method425(-32547)) {
                                if ((var80 & 0x7FFF) == var82.field2779.field2313) {
                                    var82.method278((byte) -105);
                                    break;
                                }
                            }
                            if (var81.method424(-96) == null) {
                                class62.field1186[class289.field4438][var79][var78] = null;
                            }
                            class240.method1592(var79, -123, var78);
                        }
                    }
                } else if (class301.field4559 == 246) {
                    int var83 = class190.field3082.method1317((byte) -75);
                    int var84 = class50.field1010 + (var83 >> 4 & 0x7);
                    int var85 = (var83 & 0x7) + class44.field840;
                    int var86 = class190.field3082.method1315(14289);
                    int var87 = class190.field3082.method1317((byte) -103);
                    int var88 = class190.field3082.method1315(14289);
                    if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                        int var89 = var84 * 128 + 64;
                        int var90 = var85 * 128 + 64;
                        class301 var91 = new class301(var86, class289.field4438, var89, var90, class325.method2250(var90, 22771, class289.field4438, var89) - var87, var88, class25.field494);
                        class136.field2276.method427((byte) -125, new class160(var91));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(IB)I", line = 611)
    public static final int method506(int arg0, byte arg1) {
        field1262++;
        if (arg0 < 0) {
            return 0;
        }
        class281 var2 = (class281) class21.field449.method303((long) arg0, (byte) 119);
        if (var2 == null) {
            return class280.method1887(true, arg0).field2662;
        }
        int var3 = 0;
        if (arg1 >= -39) {
            method506(117, (byte) -47);
        }
        for (int var4 = 0; var4 < var2.field4327.length; var4++) {
            if (var2.field4327[var4] == -1) {
                var3++;
            }
        }
        return var3 + class280.method1887(true, arg0).field2662 - var2.field4327.length;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)[I", line = 651)
    public final int[] method177(int arg0, int arg1) {
        int[] var3 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int var4 = class186.field3021 * this.field1253 >> 12;
            int[] var5 = this.method171(0, -68, class204.field3323 & arg1 - 1);
            int[] var6 = this.method171(0, 26, arg1);
            int[] var7 = this.method171(0, -125, arg1 + 1 & class204.field3323);
            for (int var8 = 0; var8 < class294.field4489; var8++) {
                int var9 = (var6[var8 - 1 & class4.field108] - var6[class4.field108 & var8 + 1]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var13 = class219.field3481[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field1263[2] * var16 >> 12;
                int var18 = this.field1263[1] * var14 >> 12;
                int var19 = this.field1263[0] * var15 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        int var20 = -13 % ((arg0 - 33) / 36);
        field1255++;
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "(I)V", line = 720)
    public static void method507(int arg0) {
        field1265 = null;
        field1251 = null;
        if (arg0 != 9712) {
            field1251 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(B)V", line = 735)
    public final void method183(byte arg0) {
        field1260++;
        this.method509(114);
        if (arg0 <= 82) {
            field1258 = 94;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILag;)V", line = 756)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg1 == 0) {
            this.field1253 = arg2.method1315(14289);
        } else if (arg1 == 1) {
            this.field1250 = arg2.method1315(14289);
        } else if (arg1 == 2) {
            this.field1254 = arg2.method1315(14289);
        }
        if (arg0 == -318) {
            field1252++;
        }
    }

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "(I)V", line = 791)
    private static final void method508(int arg0) {
        if (arg0 != 3216) {
            method511(79);
        }
        while (true) {
            class6 var1;
            class109 var3;
            do {
                var1 = (class6) class18.field329.method430(5);
                if (var1 == null) {
                    field1259++;
                    return;
                }
                if (var1.field131 < 0) {
                    int var2 = -var1.field131 - 1;
                    if (class100.field1758 == var2) {
                        var3 = field1265;
                    } else {
                        var3 = class97.field1715[var2];
                    }
                } else {
                    int var4 = var1.field131 - 1;
                    var3 = class8.field179[var4];
                }
            } while (var3 == null);
            class31 var5 = class277.method1864(var1.field120, arg0 ^ 0xC90);
            int var6;
            int var7;
            if (var1.field122 == 1 || var1.field122 == 3) {
                var7 = var5.field589;
                var6 = var5.field616;
            } else {
                var6 = var5.field589;
                var7 = var5.field616;
            }
            int var8 = (var6 >> 1) + var1.field119;
            if (class289.field4438 < 3) {
            }
            int var9 = (var7 >> 1) + var1.field118;
            int var10 = (var7 + 1 >> 1) + var1.field118;
            int var11 = (var6 + 1 >> 1) + var1.field119;
            int[][] var12 = class45.field923[class289.field4438];
            int var13 = var12[var8][var9] + var12[var11][var10] + var12[var11][var9] + var12[var8][var10] >> 2;
            int var14 = class255.field3975[var1.field132];
            class19 var15 = null;
            if (var14 == 0) {
                class41 var19 = class153.method995(class289.field4438, var1.field119, var1.field118);
                if (var19 != null) {
                    var15 = var19.field796;
                }
            } else if (var14 == 1) {
                class11 var16 = class162.method1036(class289.field4438, var1.field119, var1.field118);
                if (var16 != null) {
                    var15 = var16.field224;
                }
            } else if (var14 == 2) {
                class271 var17 = class177.method1112(class289.field4438, var1.field119, var1.field118);
                if (var17 != null) {
                    var15 = var17.field4182;
                }
            } else if (var14 == 3) {
                class289 var18 = class293.method1964(class289.field4438, var1.field119, var1.field118);
                if (var18 != null) {
                    var15 = var18.field4443;
                }
            }
            if (var15 != null) {
                class317.method2187(-1, var1.field119, var14, var1.field127 + 1, 0, class289.field4438, var1.field118, arg0 - 3342, 0, var1.field117 + 1);
                var3.field1885 = class25.field494 + var1.field127;
                int var20 = var1.field130;
                var3.field1864 = var1.field118 * 128 + var7 * 64;
                var3.field1938 = var13;
                var3.field1860 = class25.field494 + var1.field117;
                var3.field1904 = var15;
                int var21 = var1.field125;
                int var22 = var1.field128;
                if (var20 < var22) {
                    int var23 = var22;
                    var22 = var20;
                    var20 = var23;
                }
                int var24 = var1.field126;
                if (var21 < var24) {
                    int var25 = var24;
                    var24 = var21;
                    var21 = var25;
                }
                var3.field1956 = var1.field119 * 128 + var6 * 64;
                var3.field1868 = var1.field118 + var21;
                var3.field1946 = var1.field118 + var24;
                var3.field1931 = var1.field119 + var22;
                var3.field1874 = var1.field119 + var20;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)V", line = 963)
    private final void method509(int arg0) {
        field1257++;
        double var2 = Math.cos((double) ((float) this.field1254 / 4096.0F));
        this.field1263[0] = (int) (var2 * 4096.0D * Math.sin((double) ((float) this.field1250 / 4096.0F)));
        this.field1263[1] = (int) (var2 * Math.cos((double) ((float) this.field1250 / 4096.0F)) * 4096.0D);
        this.field1263[2] = (int) (Math.sin((double) ((float) this.field1254 / 4096.0F)) * 4096.0D);
        int var4 = this.field1263[0] * this.field1263[0] >> 12;
        int var5 = this.field1263[1] * this.field1263[1] >> 12;
        int var6 = this.field1263[2] * this.field1263[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (arg0 >= 53 && var7 != 0) {
            this.field1263[0] = (this.field1263[0] << 12) / var7;
            this.field1263[1] = (this.field1263[1] << 12) / var7;
            this.field1263[2] = (this.field1263[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lsc;IIIII)V", line = 998)
    public static final void method510(class19 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class164.field2638 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class306.field4629) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class39.field762 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class47 var14 = class326.field4975[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class45.field923[var11][var12 + 1][var13] + class45.field923[var11][var12][var13] + class45.field923[var11][var12][var13 + 1] + class45.field923[var11][var12 + 1][var13 + 1]) / 4 - (class45.field923[arg1][arg2 + 1][arg3] + class45.field923[arg1][arg2][arg3] + class45.field923[arg1][arg2][arg3 + 1] + class45.field923[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class41 var16 = var14.field965;
                                    if (var16 != null) {
                                        if (var16.field796.method34()) {
                                            arg0.method38(var16.field796, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field788 != null && var16.field788.method34()) {
                                            arg0.method38(var16.field788, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field969; var17++) {
                                        class271 var18 = var14.field974[var17];
                                        if (var18 != null && var18.field4182.method34() && (var18.field4180 == var12 || var7 == var12) && (var18.field4187 == var13 || var9 == var13)) {
                                            int var19 = var18.field4176 + 1 - var18.field4180;
                                            int var20 = var18.field4181 + 1 - var18.field4187;
                                            arg0.method38(var18.field4182, (var18.field4180 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4187 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "(I)V", line = 1094)
    public static final void method511(int arg0) {
        if (class15.field273 == 2) {
            if (class189.field3058 == class171.field2764 && class75.field1529 == class276.field4221) {
                class15.field273 = 0;
                if (class185.field3015 && class342.field5317[81] && class48.field999 > 2) {
                    class330.method2284(class48.field999 - 2, arg0 + -2);
                } else {
                    class330.method2284(class48.field999 - 1, 0);
                }
            }
        } else if (class215.field3441 == class189.field3058 && class75.field1529 == class72.field1510) {
            class15.field273 = 0;
            if (class185.field3015 && class342.field5317[81] && class48.field999 > 2) {
                class330.method2284(class48.field999 - 2, 0);
            } else {
                class330.method2284(class48.field999 - 1, arg0 + -2);
            }
        } else {
            class276.field4221 = class72.field1510;
            class171.field2764 = class215.field3441;
            class15.field273 = 2;
        }
        field1261++;
        if (arg0 != 2) {
            method512(false);
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(Z)V", line = 1149)
    public static final void method512(boolean arg0) {
        field1264++;
        if (class85.field1607 > 1) {
            class85.field1607--;
            class53.field1073 = class342.field5323;
        }
        if (class276.field4225 > 0) {
            class276.field4225--;
        }
        if (class264.field4098) {
            class264.field4098 = false;
            class142.method923(124);
            return;
        }
        for (int var1 = 0; var1 < 100 && class282.method1896(-121); var1++) {
        }
        if (class38.field730 != 30) {
            return;
        }
        class293.method1963(232, class14.field263, -126);
        Object var2 = class156.field2541.field1081;
        synchronized (class156.field2541.field1081) {
            if (!class101.field1778) {
                class156.field2541.field1086 = 0;
            } else if (class187.field3036 != 0 || class156.field2541.field1086 >= 40) {
                class190.field3088++;
                class14.field263.method80(45, (byte) 103);
                class14.field263.method1311(0, 10964);
                int var3 = class14.field263.field3249;
                int var4 = 0;
                for (int var5 = 0; var5 < class156.field2541.field1086 && (class14.field263.field3249 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class156.field2541.field1087[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class156.field2541.field1088[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class156.field2541.field1087[var5] == -1 && class156.field2541.field1088[var5] == -1) {
                        var6 = -1;
                        var7 = -1;
                        var8 = true;
                    }
                    if (class280.field4317 != var7 || class8.field170 != var6) {
                        int var9 = var7 - class280.field4317;
                        int var10 = var6 - class8.field170;
                        class8.field170 = var6;
                        class280.field4317 = var7;
                        if (class174.field2802 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class14.field263.method1313((class174.field2802 << 12) + (var9 << 6) + var10, -376480);
                            class174.field2802 = 0;
                        } else if (class174.field2802 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class14.field263.method1311(class174.field2802 + 128, 10964);
                            class14.field263.method1313((var9 << 8) + var10, -376480);
                            class174.field2802 = 0;
                        } else if (class174.field2802 < 32) {
                            class14.field263.method1311(class174.field2802 + 192, 10964);
                            if (var8) {
                                class14.field263.method1359(16705, Integer.MIN_VALUE);
                            } else {
                                class14.field263.method1359(16705, var7 | var6 << 16);
                            }
                            class174.field2802 = 0;
                        } else {
                            class14.field263.method1313(class174.field2802 + 57344, -376480);
                            if (var8) {
                                class14.field263.method1359(16705, Integer.MIN_VALUE);
                            } else {
                                class14.field263.method1359(16705, var7 | var6 << 16);
                            }
                            class174.field2802 = 0;
                        }
                    } else if (class174.field2802 < 2047) {
                        class174.field2802++;
                    }
                }
                class14.field263.method1318(class14.field263.field3249 - var3, (byte) -19);
                if (class156.field2541.field1086 > var4) {
                    class156.field2541.field1086 -= var4;
                    for (int var11 = 0; var11 < class156.field2541.field1086; var11++) {
                        class156.field2541.field1088[var11] = class156.field2541.field1088[var4 + var11];
                        class156.field2541.field1087[var11] = class156.field2541.field1087[var4 + var11];
                    }
                } else {
                    class156.field2541.field1086 = 0;
                }
            }
        }
        if (class187.field3036 != 0) {
            class87.field1646++;
            int var13 = class72.field1510;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            long var14 = (class70.field1481 - class32.field657) / 50L;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            class32.field657 = class70.field1481;
            int var16 = class215.field3441;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            byte var17 = 0;
            if (class187.field3036 == 2) {
                var17 = 1;
            }
            class14.field263.method80(114, (byte) 123);
            int var18 = (int) var14;
            class14.field263.method1320(var16 | var13 << 16, (byte) 104);
            class14.field263.method1313(var18 | var17 << 15, -376480);
        }
        if (class222.field3512 > 0) {
            class222.field3512--;
        }
        if (class35.field707 && class222.field3512 <= 0) {
            class86.field1622++;
            class222.field3512 = 20;
            class35.field707 = false;
            class14.field263.method80(216, (byte) 116);
            class14.field263.method1293((int) class95.field1709, (byte) -71);
            class14.field263.method1306(2120940680, (int) class120.field2090);
        }
        if (class106.field1827 && !class138.field2298) {
            class142.field2345++;
            class138.field2298 = true;
            class14.field263.method80(64, (byte) 112);
            class14.field263.method1311(1, 10964);
        }
        if (arg0 != class106.field1827 && class138.field2298) {
            class142.field2345++;
            class138.field2298 = false;
            class14.field263.method80(64, (byte) 116);
            class14.field263.method1311(0, 10964);
        }
        if (!class1.field13) {
            class303.field4599++;
            class14.field263.method80(220, (byte) 123);
            class14.field263.method1339(class180.method1131((byte) 21), (byte) 118);
            class1.field13 = true;
        }
        if (class344.field5349) {
            class344.field5349 = false;
        } else {
            class199.field3185 /= 2.0F;
        }
        if (class214.field3434) {
            class214.field3434 = false;
        } else {
            class69.field1467 /= 2.0F;
        }
        class176.method1107(106);
        if (class38.field730 != 30) {
            return;
        }
        class54.method417(-1);
        method508(3216);
        class278.method1869((byte) 47);
        class72.field1501++;
        if (class72.field1501 > 750) {
            class142.method923(-32);
            return;
        }
        class191.method1225(0);
        class286.method1932(0);
        class88.method618((byte) -115);
        if (class118.field2065 != null) {
            class216.method1449(4);
        }
        for (int var19 = class99.method648(true, -50); var19 != -1; var19 = class99.method648(false, -51)) {
            class170.method1082(var19, 21023);
            class327.field5010[class61.method475(class210.field3390++, 31)] = var19;
        }
        for (class2 var20 = class38.method296(-110); var20 != null; var20 = class38.method296(-112)) {
            int var21 = var20.method10((byte) 120);
            int var22 = var20.method15(-1);
            if (var21 == 1) {
                class61.field1176[var22] = var20.field39;
                class168.field2695[class61.method475(31, class205.field3348++)] = var22;
            } else if (var21 == 2) {
                class100.field1753[var22] = var20.field41;
                class118.field2056[class61.method475(31, class93.field1680++)] = var22;
            } else if (var21 == 3) {
                class68 var43 = class319.method2196(-1351736944, var22);
                if (!var20.field41.equals(var43.field1295)) {
                    var43.field1295 = var20.field41;
                    class317.method2183((byte) -7, var43);
                }
            } else if (var21 == 4) {
                class68 var39 = class319.method2196(-1351736944, var22);
                int var40 = var20.field39;
                int var41 = var20.field43;
                int var42 = var20.field32;
                if (var39.field1423 != var40 || var39.field1431 != var41 || var39.field1297 != var42) {
                    var39.field1297 = var42;
                    var39.field1423 = var40;
                    var39.field1431 = var41;
                    class317.method2183((byte) -7, var39);
                }
            } else if (var21 == 5) {
                class68 var38 = class319.method2196(-1351736944, var22);
                if (var20.field39 != var38.field1439 || var20.field39 == -1) {
                    var38.field1338 = 1;
                    var38.field1433 = 0;
                    var38.field1439 = var20.field39;
                    var38.field1437 = 0;
                    class317.method2183((byte) -7, var38);
                }
            } else if (var21 == 6) {
                int var32 = var20.field39;
                int var33 = (var32 & 0x7F80) >> 10;
                int var34 = var32 & 0x1F;
                int var35 = var32 >> 5 & 0x1F;
                int var36 = (var35 << 11) + (var33 << 19) + (var34 << 3);
                class68 var37 = class319.method2196(-1351736944, var22);
                if (var37.field1355 != var36) {
                    var37.field1355 = var36;
                    class317.method2183((byte) -7, var37);
                }
            } else if (var21 == 7) {
                class68 var23 = class319.method2196(-1351736944, var22);
                boolean var24 = var20.field39 == 1;
                if (var24 != var23.field1435) {
                    var23.field1435 = var24;
                    class317.method2183((byte) -7, var23);
                }
            } else if (var21 == 8) {
                class68 var31 = class319.method2196(-1351736944, var22);
                if (var20.field39 != var31.field1342 || var20.field43 != var31.field1400 || var20.field32 != var31.field1294) {
                    var31.field1400 = var20.field43;
                    var31.field1294 = var20.field32;
                    var31.field1342 = var20.field39;
                    if (var31.field1290 != -1) {
                        if (var31.field1430 > 0) {
                            var31.field1294 = var31.field1294 * 32 / var31.field1430;
                        } else if (var31.field1381 > 0) {
                            var31.field1294 = var31.field1294 * 32 / var31.field1381;
                        }
                    }
                    class317.method2183((byte) -7, var31);
                }
            } else if (var21 == 9) {
                class68 var25 = class319.method2196(-1351736944, var22);
                if (var20.field39 != var25.field1290 || var20.field43 != var25.field1392) {
                    var25.field1392 = var20.field43;
                    var25.field1290 = var20.field39;
                    class317.method2183((byte) -7, var25);
                }
            } else if (var21 == 10) {
                class68 var30 = class319.method2196(-1351736944, var22);
                if (var20.field39 != var30.field1300 || var20.field43 != var30.field1335 || var20.field32 != var30.field1336) {
                    var30.field1300 = var20.field39;
                    var30.field1335 = var20.field43;
                    var30.field1336 = var20.field32;
                    class317.method2183((byte) -7, var30);
                }
            } else if (var21 == 11) {
                class68 var26 = class319.method2196(-1351736944, var22);
                var26.field1324 = var26.field1350 = var20.field39;
                var26.field1309 = 0;
                var26.field1340 = var26.field1291 = var20.field43;
                var26.field1363 = 0;
                class317.method2183((byte) -7, var26);
            } else if (var21 == 12) {
                class68 var27 = class319.method2196(-1351736944, var22);
                int var28 = var20.field39;
                if (var27 != null && var27.field1358 == 0) {
                    if (var28 > var27.field1401 - var27.field1414) {
                        var28 = var27.field1401 - var27.field1414;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                    if (var27.field1419 != var28) {
                        var27.field1419 = var28;
                        class317.method2183((byte) -7, var27);
                    }
                }
            } else if (var21 == 13) {
                class68 var29 = class319.method2196(-1351736944, var22);
                var29.field1454 = var20.field39;
            }
        }
        if (class337.field5181 != 0) {
            class147.field2422 += 20;
            if (class147.field2422 >= 400) {
                class337.field5181 = 0;
            }
        }
        class176.field2836++;
        if (class4.field103 != null) {
            class228.field3599++;
            if (class228.field3599 >= 15) {
                class317.method2183((byte) -7, class4.field103);
                class4.field103 = null;
            }
        }
        if (class288.field4434 != null) {
            class317.method2183((byte) -7, class288.field4434);
            if ((class228.field3603 + 5) < class120.field2083 || class120.field2083 < (class228.field3603 - 5) || (class289.field4448 + 5) < class9.field196 || class9.field196 < (class289.field4448 - 5)) {
                class48.field1000 = true;
            }
            class278.field4286++;
            if (class335.field5140 == 0) {
                if (class48.field1000 && class278.field4286 >= 5) {
                    if (class288.field4434 == class227.field3595 && class86.field1616 != class268.field4127) {
                        class68 var44 = class288.field4434;
                        class9.field203++;
                        byte var45 = 0;
                        if (class55.field1094 == 1 && var44.field1438 == 206) {
                            var45 = 1;
                        }
                        if (var44.field1341[class268.field4127] <= 0) {
                            var45 = 0;
                        }
                        if (client.method359(var44).method1789(true)) {
                            int var46 = class86.field1616;
                            int var47 = class268.field4127;
                            var44.field1341[var47] = var44.field1341[var46];
                            var44.field1327[var47] = var44.field1327[var46];
                            var44.field1341[var46] = -1;
                            var44.field1327[var46] = 0;
                        } else if (var45 == 1) {
                            int var48 = class86.field1616;
                            int var49 = class268.field4127;
                            while (var48 != var49) {
                                if (var49 < var48) {
                                    var44.method525(-109, var48, var48 - 1);
                                    var48--;
                                } else if (var49 > var48) {
                                    var44.method525(-119, var48, var48 + 1);
                                    var48++;
                                }
                            }
                        } else {
                            var44.method525(-112, class86.field1616, class268.field4127);
                        }
                        class14.field263.method80(150, (byte) 115);
                        class14.field263.method1359(16705, class288.field4434.field1284);
                        class14.field263.method1303(var45, 92);
                        class14.field263.method1313(class268.field4127, -376480);
                        class14.field263.method1293(class86.field1616, (byte) -71);
                    }
                } else if ((class227.field3592 == 1 || class133.method870(!arg0, class48.field999 - 1)) && class48.field999 > 2) {
                    class324.method2245(0);
                } else if (class48.field999 > 0) {
                    method511(2);
                }
                class288.field4434 = null;
                class187.field3036 = 0;
                class228.field3599 = 10;
            }
        }
        class42.field812 = false;
        class179.field2874 = null;
        class313.field4754 = false;
        class68 var50 = class24.field484;
        class324.field4956 = 0;
        class24.field484 = null;
        class68 var51 = class61.field1174;
        class61.field1174 = null;
        while (class135.method882(1) && class324.field4956 < 128) {
            class232.field3641[class324.field4956] = class301.field4562;
            class286.field4430[class324.field4956] = class87.field1654;
            class324.field4956++;
        }
        class118.field2065 = null;
        if (class158.field2580 != -1) {
            class156.method1009(0, 0, 0, class158.field2580, 0, (byte) 90, class88.field1658, class134.field2257);
        }
        class342.field5323++;
        while (true) {
            class106 var52;
            class68 var53;
            class68 var54;
            do {
                var52 = (class106) class95.field1701.method430(5);
                if (var52 == null) {
                    while (true) {
                        class106 var55;
                        class68 var56;
                        class68 var57;
                        do {
                            var55 = (class106) class24.field482.method430(5);
                            if (var55 == null) {
                                while (true) {
                                    class106 var58;
                                    class68 var59;
                                    class68 var60;
                                    do {
                                        var58 = (class106) class12.field238.method430(5);
                                        if (var58 == null) {
                                            if (class118.field2065 == null) {
                                                class277.field4254 = 0;
                                            }
                                            if (class289.field4445 != null) {
                                                class41.method315(true);
                                            }
                                            if (class29.field545 > 0 && class342.field5317[82] && class342.field5317[81] && class157.field2567 != 0) {
                                                int var61 = class289.field4438 - class157.field2567;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class54.method420(true, field1265.field1871[0] + class246.field3818, class101.field1769 - -field1265.field1899[0], var61);
                                            }
                                            if (class29.field545 > 0 && class342.field5317[82] && class342.field5317[81]) {
                                                if (class305.field4619 != -1) {
                                                    class54.method420(arg0, class305.field4619 + class246.field3818, class4.field105 + class101.field1769, class289.field4438);
                                                }
                                                class225.field3555 = 0;
                                                class62.field1199 = 0;
                                            } else if (class62.field1199 == 2) {
                                                if (class305.field4619 != -1) {
                                                    class14.field263.method80(44, (byte) 126);
                                                    class14.field263.method1293(class305.field4619 + class246.field3818, (byte) -71);
                                                    class18.field323++;
                                                    class14.field263.method1324(class6.field135, 1734336648);
                                                    class14.field263.method1313(class4.field105 + class101.field1769, -376480);
                                                    class14.field263.method1320(class333.field5113, (byte) 97);
                                                    class190.field3080 = class72.field1510;
                                                    class337.field5181 = 1;
                                                    class147.field2422 = 0;
                                                    class232.field3638 = class215.field3441;
                                                }
                                                class62.field1199 = 0;
                                            } else if (class225.field3555 == 2) {
                                                if (class305.field4619 != -1) {
                                                    class322.field4913++;
                                                    class14.field263.method80(9, (byte) 118);
                                                    class14.field263.method1313(class305.field4619 + class246.field3818, -376480);
                                                    class14.field263.method1293(class4.field105 + class101.field1769, (byte) -71);
                                                    class190.field3080 = class72.field1510;
                                                    class337.field5181 = 1;
                                                    class232.field3638 = class215.field3441;
                                                    class147.field2422 = 0;
                                                }
                                                class225.field3555 = 0;
                                            } else if (class305.field4619 != -1 && class62.field1199 == 0 && class225.field3555 == 0) {
                                                class177.method1120((class4.field105 << 1) + 1 - field1265.method710(-1) >> 1, 0, (class305.field4619 << 1) + 1 - field1265.method710(-1) >> 1, (byte) -126);
                                                class190.field3080 = class72.field1510;
                                                class232.field3638 = class215.field3441;
                                                class147.field2422 = 0;
                                                class337.field5181 = 1;
                                            }
                                            class305.field4619 = -1;
                                            class220.method1468((byte) -111);
                                            if (class61.field1174 != var51) {
                                                if (var51 != null) {
                                                    class317.method2183((byte) -7, var51);
                                                }
                                                if (class61.field1174 != null) {
                                                    class317.method2183((byte) -7, class61.field1174);
                                                }
                                            }
                                            if (class24.field484 != var50 && class280.field4310 == class267.field4118) {
                                                if (var50 != null) {
                                                    class317.method2183((byte) -7, var50);
                                                }
                                                if (class24.field484 != null) {
                                                    class317.method2183((byte) -7, class24.field484);
                                                }
                                            }
                                            if (class24.field484 == null) {
                                                if (class267.field4118 > 0) {
                                                    class267.field4118--;
                                                }
                                            } else if (class280.field4310 > class267.field4118) {
                                                class267.field4118++;
                                                if (class280.field4310 == class267.field4118) {
                                                    class317.method2183((byte) -7, class24.field484);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class285.field4415[var62]++;
                                            }
                                            int var63 = class329.method2279(1881);
                                            int var64 = class19.method128(-1);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class276.field4225 = 250;
                                                class211.method1425(-81, 14500);
                                                class288.field4436++;
                                                class14.field263.method80(91, (byte) 102);
                                            }
                                            if (class306.field4628 != null && class306.field4628.field1852 == 1) {
                                                if (class306.field4628.field1853 != null) {
                                                    class173.method1092(true, class294.field4499, class45.field931);
                                                }
                                                class294.field4499 = false;
                                                class45.field931 = null;
                                                class306.field4628 = null;
                                            }
                                            class326.field4988++;
                                            class132.field2239++;
                                            class174.field2796++;
                                            if (class174.field2796 > 500) {
                                                class174.field2796 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x2) == 2) {
                                                    class26.field509 += class106.field1847;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class307.field4651 += class141.field2332;
                                                }
                                                if ((var65 & 0x4) == 4) {
                                                    class301.field4556 += class170.field2744;
                                                }
                                            }
                                            if (class307.field4651 < -50) {
                                                class141.field2332 = 2;
                                            }
                                            if (class26.field509 < -55) {
                                                class106.field1847 = 2;
                                            }
                                            if (class326.field4988 > 500) {
                                                class326.field4988 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x1) == 1) {
                                                    class41.field798 += class170.field2747;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class4.field101 += class78.field1547;
                                                }
                                            }
                                            if (class307.field4651 > 50) {
                                                class141.field2332 = -2;
                                            }
                                            if (class26.field509 > 55) {
                                                class106.field1847 = -2;
                                            }
                                            if (class301.field4556 < -40) {
                                                class170.field2744 = 1;
                                            }
                                            if (class301.field4556 > 40) {
                                                class170.field2744 = -1;
                                            }
                                            if (class41.field798 < -60) {
                                                class170.field2747 = 2;
                                            }
                                            if (class41.field798 > 60) {
                                                class170.field2747 = -2;
                                            }
                                            if (class4.field101 < -20) {
                                                class78.field1547 = 1;
                                            }
                                            if (class4.field101 > 10) {
                                                class78.field1547 = -1;
                                            }
                                            if (class132.field2239 > 50) {
                                                class63.field1211++;
                                                class14.field263.method80(81, (byte) 108);
                                            }
                                            if (class212.field3418) {
                                                class196.method1259(13);
                                                class212.field3418 = false;
                                            }
                                            try {
                                                if (class177.field2860 != null && class14.field263.field3249 > 0) {
                                                    class177.field2860.method611((byte) 60, 0, class14.field263.field3273, class14.field263.field3249);
                                                    class132.field2239 = 0;
                                                    class14.field263.field3249 = 0;
                                                }
                                            } catch (IOException var68) {
                                                class142.method923(-124);
                                            }
                                            return;
                                        }
                                        var59 = var58.field1823;
                                        if (var59.field1365 < 0) {
                                            break;
                                        }
                                        var60 = class319.method2196(-1351736944, var59.field1308);
                                    } while (var60 == null || var60.field1372 == null || var59.field1365 >= var60.field1372.length || var60.field1372[var59.field1365] != var59);
                                    class156.method1008(arg0, var58);
                                }
                            }
                            var56 = var55.field1823;
                            if (var56.field1365 < 0) {
                                break;
                            }
                            var57 = class319.method2196(-1351736944, var56.field1308);
                        } while (var57 == null || var57.field1372 == null || var57.field1372.length <= var56.field1365 || var57.field1372[var56.field1365] != var56);
                        class156.method1008(true, var55);
                    }
                }
                var53 = var52.field1823;
                if (var53.field1365 < 0) {
                    break;
                }
                var54 = class319.method2196(-1351736944, var53.field1308);
            } while (var54 == null || var54.field1372 == null || var54.field1372.length <= var53.field1365 || var54.field1372[var53.field1365] != var53);
            class156.method1008(true, var52);
        }
    }
}
