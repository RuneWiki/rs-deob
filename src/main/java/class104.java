import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class104 extends class443 {

    @OriginalMember(owner = "client!il", name = "C", descriptor = "Z")
    public boolean field1350 = true;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "Lls;")
    public static class53 field1353 = new class53(0, 0);

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field1359 = 0;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "[S")
    public static short[] field1361 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!il", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1358 = "level: ";

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field1349;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "Z")
    public static boolean field1363;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "[I")
    private int[] field1343;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "[I")
    public int[] field1348;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "[Ljava/lang/String;")
    private String[] field1342;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "[[I")
    private int[][] field1354;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lfb;I)V")
    public final void method783(class341 arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field1355++;
        while (true) {
            int var3 = arg0.method2233((byte) 104);
            if (var3 == 0) {
                return;
            }
            this.method794(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(B)V")
    public static final void method784(byte arg0) {
        field1360++;
        if (class8.field112 == 167) {
            int var1 = class27.field471.method2239(arg0 ^ 0x4025EF3E);
            int var2 = class27.field471.method2233((byte) 104);
            class372.method2447(var1, (byte) -119).method1393(var2, true);
        } else if (class8.field112 == 182) {
            class27.field471.method2233((byte) 104);
            int var3 = class27.field471.method2233((byte) 104);
            int var4 = ((var3 & 0x7F) >> 4) + class238.field3333;
            int var5 = (var3 & 0x7) + class233.field3230;
            int var6 = class27.field471.method2239(-1076227960);
            int var7 = class27.field471.method2233((byte) 104);
            int var8 = class27.field471.method2249(arg0 + 32841);
            String var9 = class27.field471.method2261((byte) 92);
            class9.method72(var6, var5, var8, var4, var9, var7, -19007);
        } else if (class8.field112 == 122) {
            int var10 = class27.field471.method2233((byte) 104);
            int var11 = ((var10 & 0x77) >> 4) + class238.field3333;
            int var12 = (var10 & 0x7) + class233.field3230;
            int var13 = class27.field471.method2239(-1076227960);
            int var14 = class27.field471.method2233((byte) 104);
            int var15 = class27.field471.method2239(-1076227960);
            if (var11 >= 0 && var12 >= 0 && class351.field5217 > var11 && class143.field1815 > var12) {
                int var16 = var11 * 128 + 64;
                int var17 = var12 * 128 + 64;
                class258 var18 = new class258(var13, var15, class231.field3179, class268.field3973, var16, class248.method1621(var16, var17, -13853, class268.field3973) - var14, var17, var11, var11, var12, var12);
                class176.field2383.method1560(-126, new class110(var18));
            }
        } else if (class8.field112 == 172) {
            int var19 = class27.field471.method2233((byte) 104);
            int var20 = class238.field3333 + ((var19 & 0x78) >> 4);
            int var21 = (var19 & 0x7) + class233.field3230;
            int var22 = class27.field471.method2239(-1076227960);
            if (var20 >= 0 && var21 >= 0 && class351.field5217 > var20 && var21 < class143.field1815) {
                class171 var23 = (class171) class267.field3962.method2826(false, (long) (var20 | class268.field3973 << 28 | var21 << 14));
                if (var23 != null) {
                    for (class223 var24 = (class223) var23.field2345.method1575(0); var24 != null; var24 = (class223) var23.field2345.method1573((byte) -128)) {
                        if ((var22 & 0x7FFF) == var24.field3072) {
                            var24.method2632(true);
                            break;
                        }
                    }
                    if (var23.field2345.method1563(11395)) {
                        var23.method2632(true);
                    }
                    class11.method90(class268.field3973, var20, var21, (byte) 97);
                }
            }
        } else if (class8.field112 == 196) {
            int var25 = class27.field471.method2262(true);
            int var26 = var25 >> 2;
            int var27 = var25 & 0x3;
            int var28 = class162.field2141[var26];
            int var29 = class27.field471.method2262(true);
            int var30 = (var29 >> 4 & 0x7) + class238.field3333;
            int var31 = class233.field3230 + (var29 & 0x7);
            if (var30 >= 0 && var31 >= 0 && var30 < class351.field5217 && var31 < class143.field1815) {
                class349.method2307(var26, var27, 0, -1, var30, var31, var28, (byte) -121, class268.field3973, -1);
            }
        } else if (class8.field112 == 233) {
            int var32 = class27.field471.method2233((byte) 104);
            int var33 = class238.field3333 + ((var32 & 0x79) >> 4);
            int var34 = class233.field3230 + (var32 & 0x7);
            int var35 = class27.field471.method2239(-1076227960);
            if (var35 == 65535) {
                var35 = -1;
            }
            int var36 = class27.field471.method2233((byte) 104);
            int var37 = (var36 & 0xFF) >> 4;
            int var38 = var36 & 0x7;
            int var39 = class27.field471.method2233((byte) 104);
            int var40 = class27.field471.method2233((byte) 104);
            if (var33 >= 0 && var34 >= 0 && var33 < class351.field5217 && var34 < class143.field1815) {
                int var41 = var37 + 1;
                if (var33 - var41 <= class383.field5609.field2190[0] && class383.field5609.field2190[0] <= (var33 + var41) && (var34 - var41) <= class383.field5609.field2189[0] && var34 + var41 >= class383.field5609.field2189[0] && class389.field5692 != 0 && var38 > 0 && class236.field3301 < 50 && var35 != -1) {
                    class195.field2704[class236.field3301] = var35;
                    class388.field5674[class236.field3301] = var38;
                    class329.field4850[class236.field3301] = var39;
                    class337.field4985[class236.field3301] = null;
                    class163.field2224[class236.field3301] = (var33 << 16) + (var34 << 8) + var37;
                    class129.field1683[class236.field3301] = var40;
                    class236.field3301++;
                }
            }
        } else if (class8.field112 == 200) {
            int var42 = class27.field471.method2238(76);
            int var43 = var42 >> 2;
            int var44 = var42 & 0x3;
            int var45 = class162.field2141[var43];
            int var46 = class27.field471.method2233((byte) 104);
            int var47 = ((var46 & 0x78) >> 4) + class238.field3333;
            int var48 = (var46 & 0x7) + class233.field3230;
            int var49 = class27.field471.method2230(1939718792);
            if (var47 >= 0 && var48 >= 0 && var47 < class351.field5217 && var48 < class143.field1815) {
                class349.method2307(var43, var44, 0, -1, var47, var48, var45, (byte) -63, class268.field3973, var49);
            }
        } else if (class8.field112 == 24) {
            int var50 = class27.field471.method2233((byte) 104);
            int var51 = ((var50 & 0x7A) >> 4) + class238.field3333;
            int var52 = (var50 & 0x7) + class233.field3230;
            int var53 = class27.field471.method2239(-1076227960);
            int var54 = class27.field471.method2239(arg0 - 1076227886);
            int var55 = class27.field471.method2239(arg0 - 1076227886);
            if (class267.field3962 != null && var51 >= 0 && var52 >= 0 && var51 < class351.field5217 && class143.field1815 > var52) {
                class171 var56 = (class171) class267.field3962.method2826(false, (long) (var51 | var52 << 14 | class268.field3973 << 28));
                if (var56 != null) {
                    for (class223 var57 = (class223) var56.field2345.method1575(0); var57 != null; var57 = (class223) var56.field2345.method1573((byte) -128)) {
                        if ((var53 & 0x7FFF) == var57.field3072 && var57.field3069 == var54) {
                            var57.method2632(true);
                            var57.field3069 = var55;
                            class331.method2170(var51, (byte) 63, var52, class268.field3973, var57);
                            break;
                        }
                    }
                    class11.method90(class268.field3973, var51, var52, (byte) 97);
                }
            }
        } else {
            if (class8.field112 == 5) {
                int var58 = class27.field471.method2207(-27);
                int var59 = class238.field3333 + (var58 >> 4 & 0x7);
                int var60 = (var58 & 0x7) + class233.field3230;
                byte var61 = class27.field471.method2209(false);
                int var62 = class27.field471.method2230(1939718792);
                int var63 = class27.field471.method2228(-128);
                byte var64 = class27.field471.method2209(false);
                byte var65 = class27.field471.method2229((byte) 112);
                int var66 = class27.field471.method2228(-128);
                int var67 = class27.field471.method2212(arg0 + 72);
                byte var68 = class27.field471.method2215(-21934);
                int var69 = class27.field471.method2207(109);
                int var70 = var69 >> 2;
                int var71 = var69 & 0x3;
                if (!class126.field1647.method479()) {
                    class126.method889(var59, var63, var66, var65, 4096, var71, var67, var62, var68, var64, var70, var61, var60);
                }
            }
            if (class8.field112 == 164) {
                int var72 = class27.field471.method2233((byte) 104);
                int var73 = (var72 >> 4 & 0xF) + class238.field3333 * 2;
                int var74 = (var72 & 0xF) + class233.field3230 * 2;
                int var75 = var73 + class27.field471.method2211(255);
                int var76 = var74 + class27.field471.method2211(255);
                int var77 = class27.field471.method2212(arg0 + 72);
                int var78 = class27.field471.method2239(-1076227960);
                int var79 = class27.field471.method2233((byte) 104) * 4;
                int var80 = class27.field471.method2233((byte) 104) * 4;
                int var81 = class27.field471.method2239(arg0 ^ 0x4025EF3E);
                int var82 = class27.field471.method2239(arg0 ^ 0x4025EF3E);
                int var83 = class27.field471.method2233((byte) 104);
                int var84 = class27.field471.method2233((byte) 104);
                if (var83 == 255) {
                    var83 = -1;
                }
                if (var73 >= 0 && var74 >= 0 && var73 < 208 && var74 < 208 && var75 >= 0 && var76 >= 0 && var75 < 208 && var76 < 208 && var78 != 65535) {
                    int var85 = var73 * 64;
                    int var86 = var76 * 64;
                    int var87 = var75 * 64;
                    int var88 = var74 * 64;
                    class81 var89 = new class81(var78, class268.field3973, var85, var88, class248.method1621(var85, var88, arg0 ^ 0x3655, class268.field3973) - var79, class231.field3179 + var81, class231.field3179 + var82, var83, var84, var77, var80);
                    var89.method638(class231.field3179 + var81, var86, var87, (byte) -57, class248.method1621(var87, var86, -13853, class268.field3973) - var80);
                    class331.field4873.method1560(arg0 ^ 0x3E, new class166(var89));
                }
            } else if (class8.field112 == 7) {
                int var90 = class27.field471.method2233((byte) 104);
                int var91 = ((var90 & 0x7A) >> 4) + class238.field3333;
                int var92 = class233.field3230 + (var90 & 0x7);
                int var93 = class27.field471.method2211(255) + var91;
                int var94 = var92 + class27.field471.method2211(255);
                int var95 = class27.field471.method2212(-2);
                int var96 = class27.field471.method2239(-1076227960);
                int var97 = class27.field471.method2233((byte) 104) * 4;
                int var98 = class27.field471.method2233((byte) 104) * 4;
                int var99 = class27.field471.method2239(arg0 ^ 0x4025EF3E);
                int var100 = class27.field471.method2239(-1076227960);
                int var101 = class27.field471.method2233((byte) 104);
                if (var101 == 255) {
                    var101 = -1;
                }
                int var102 = class27.field471.method2233((byte) 104);
                if (var91 >= 0 && var92 >= 0 && var91 < class351.field5217 && class143.field1815 > var92 && var93 >= 0 && var94 >= 0 && var93 < class351.field5217 && var94 < class143.field1815 && var96 != 65535) {
                    int var103 = var92 * 128 + 64;
                    int var104 = var93 * 128 + 64;
                    int var105 = var91 * 128 + 64;
                    int var106 = var94 * 128 + 64;
                    class81 var107 = new class81(var96, class268.field3973, var105, var103, class248.method1621(var105, var103, -13853, class268.field3973) - var97, class231.field3179 + var99, class231.field3179 + var100, var101, var102, var95, var98);
                    var107.method638(class231.field3179 + var99, var106, var104, (byte) -65, class248.method1621(var104, var106, -13853, class268.field3973) - var98);
                    class331.field4873.method1560(arg0 ^ 0x3B, new class166(var107));
                }
            } else if (class8.field112 == 204) {
                int var108 = class27.field471.method2228(-128);
                int var109 = class27.field471.method2239(arg0 - 1076227886);
                int var110 = class27.field471.method2207(114);
                int var111 = (var110 >> 4 & 0x7) + class238.field3333;
                int var112 = class233.field3230 + (var110 & 0x7);
                if (var111 >= 0 && var112 >= 0 && var111 < class351.field5217 && var112 < class143.field1815) {
                    class331.method2170(var111, (byte) 61, var112, class268.field3973, new class223(var109, var108));
                    class11.method90(class268.field3973, var111, var112, (byte) 97);
                }
            } else {
                if (arg0 != -74) {
                    field1353 = null;
                }
                if (class8.field112 == 227) {
                    int var113 = class27.field471.method2238(83);
                    int var114 = ((var113 & 0x72) >> 4) + class238.field3333;
                    int var115 = (var113 & 0x7) + class233.field3230;
                    int var116 = class27.field471.method2262(true);
                    int var117 = var116 >> 2;
                    int var118 = var116 & 0x3;
                    int var119 = class162.field2141[var117];
                    int var120 = class27.field471.method2228(-128);
                    if (var120 == 65535) {
                        var120 = -1;
                    }
                    class100.method769(var119, class268.field3973, var118, var120, var114, (byte) 45, var117, var115);
                } else if (class8.field112 == 184) {
                    int var121 = class27.field471.method2233((byte) 104);
                    int var122 = (var121 >> 4 & 0xF) + class238.field3333 * 2;
                    int var123 = (var121 & 0xF) + class233.field3230 * 2;
                    int var124 = class27.field471.method2211(255) + var122;
                    int var125 = var123 + class27.field471.method2211(255);
                    int var126 = class27.field471.method2212(arg0 + 72);
                    int var127 = class27.field471.method2212(-2);
                    int var128 = class27.field471.method2239(arg0 ^ 0x4025EF3E);
                    int var129 = class27.field471.method2211(255);
                    int var130 = class27.field471.method2233((byte) 104) * 4;
                    int var131 = class27.field471.method2239(arg0 - 1076227886);
                    int var132 = class27.field471.method2239(arg0 ^ 0x4025EF3E);
                    int var133 = class27.field471.method2233((byte) 104);
                    int var134 = class27.field471.method2233((byte) 104);
                    if (var133 == 255) {
                        var133 = -1;
                    }
                    if (var122 >= 0 && var123 >= 0 && var122 < 208 && var123 < 208 && var124 >= 0 && var125 >= 0 && var124 < 208 && var125 < 208 && var128 != 65535) {
                        int var135 = var124 * 64;
                        int var136 = var122 * 64;
                        int var137 = var123 * 64;
                        int var138 = var125 * 64;
                        if (var126 != 0) {
                            int var141;
                            class162 var142;
                            if (var126 >= 0) {
                                int var139 = var126 - 1;
                                int var140 = var139 & 0x7FF;
                                var141 = (var139 & 0x7B52) >> 11;
                                var142 = class388.field5670[var140];
                            } else {
                                int var143 = -var126 - 1;
                                int var144 = var143 & 0x7FF;
                                var141 = (var143 & 0x7915) >> 11;
                                if (class400.field5853 == var144) {
                                    var142 = class383.field5609;
                                } else {
                                    var142 = class176.field2382[var144];
                                }
                            }
                            if (var142 != null) {
                                class290 var145 = var142.method1084(-24211);
                                if (var145.field4369 != null && var145.field4369[var141] != null) {
                                    int var146 = var145.field4369[var141][0];
                                    int var147 = var145.field4369[var141][2];
                                    int var148 = var142.field2164.method698((byte) 94);
                                    int var149 = class240.field3364[var148];
                                    int var150 = class240.field3365[var148];
                                    int var151 = var146 * var150 + var147 * var149 >> 15;
                                    int var152 = var147 * var150 - (var146 * var149) >> 15;
                                    var137 += var152;
                                    var129 -= var145.field4369[var141][1];
                                    var136 += var151;
                                }
                            }
                        }
                        class81 var154 = new class81(var128, class268.field3973, var136, var137, class248.method1621(var136, var137, -13853, class268.field3973) - var129, class231.field3179 + var131, class231.field3179 + var132, var133, var134, var127, var130);
                        var154.method638(class231.field3179 + var131, var138, var135, (byte) -56, class248.method1621(var135, var138, -13853, class268.field3973) - var130);
                        class331.field4873.method1560(-128, new class166(var154));
                    }
                } else if (class8.field112 == 81) {
                    int var155 = class27.field471.method2262(true);
                    int var156 = ((var155 & 0x77) >> 4) + class238.field3333;
                    int var157 = (var155 & 0x7) + class233.field3230;
                    int var158 = class27.field471.method2228(-128);
                    int var159 = class27.field471.method2230(1939718792);
                    int var160 = class27.field471.method2228(-128);
                    if (var156 >= 0 && var157 >= 0 && var156 < class351.field5217 && var157 < class143.field1815 && class400.field5853 != var159) {
                        class331.method2170(var156, (byte) 43, var157, class268.field3973, new class223(var158, var160));
                        class11.method90(class268.field3973, var156, var157, (byte) 97);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
    public static void method785(int arg0) {
        field1361 = null;
        int var1 = 15 % ((-arg0 - 63) / 37);
        field1353 = null;
        field1358 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)I")
    public final int method786(byte arg0, int arg1) {
        field1344++;
        int var3 = 27 / ((-arg0 - 40) / 47);
        return this.field1343 == null || arg1 < 0 || this.field1343.length < arg1 ? -1 : this.field1343[arg1];
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lps;I)V")
    public static final void method787(class162 arg0, int arg1) {
        field1347++;
        int var2 = arg0.field2172 - class231.field3179;
        int var3 = arg0.field2134 * 128 + arg0.method1091((byte) -128) * 64;
        int var4 = arg0.field2180 * 128 + (arg0.method1091((byte) 57) * 64);
        arg0.field5921 += (var3 - arg0.field5921) / var2;
        arg0.field2200 = arg1;
        arg0.field5930 += (var4 - arg0.field5930) / var2;
        if (arg0.field2149 == 0) {
            arg0.method1083(8192, -23640);
        }
        if (arg0.field2149 == 1) {
            arg0.method1083(12288, -23640);
        }
        if (arg0.field2149 == 2) {
            arg0.method1083(0, -23640);
        }
        if (arg0.field2149 == 3) {
            arg0.method1083(4096, -23640);
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(B)I")
    public final int method788(byte arg0) {
        int var2 = -108 % ((8 - arg0) / 59);
        field1346++;
        return this.field1343 == null ? 0 : this.field1343.length;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)I")
    public final int method789(int arg0, int arg1, int arg2) {
        if (arg1 > -106) {
            method795(true);
        }
        field1362++;
        if (this.field1343 == null || arg2 < 0 || this.field1343.length < arg2) {
            return -1;
        } else if (this.field1354[arg2] == null || arg0 < 0 || this.field1354[arg2].length < arg0) {
            return -1;
        } else {
            return this.field1354[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)Ljava/lang/String;")
    public final String method790(int arg0) {
        if (arg0 != 27196) {
            return null;
        }
        field1356++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field1342 == null) {
            return "";
        }
        var2.append(this.field1342[0]);
        for (int var3 = 1; var3 < this.field1342.length; var3++) {
            var2.append("...");
            var2.append(this.field1342[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
    public final void method791(int arg0) {
        if (arg0 != 1440919019) {
            this.field1348 = null;
        }
        if (this.field1348 != null) {
            for (int var2 = 0; var2 < this.field1348.length; var2++) {
                this.field1348[var2] = class258.method1708(this.field1348[var2], 32768);
            }
        }
        field1349++;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(III)Lon;")
    public static final class441 method792(int arg0, int arg1, int arg2) {
        class77 var3 = class106.field1405[arg0][arg1][arg2];
        return var3 == null || var3.field1079 == null ? null : var3.field1079;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILfb;[I)V")
    public final void method793(int arg0, class341 arg1, int[] arg2) {
        field1351++;
        if (arg0 > -25 || this.field1343 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1343.length; var4++) {
            if (arg2.length <= var4) {
                return;
            }
            int var5 = class67.field984[this.method786((byte) -107, var4)];
            if (var5 > 0) {
                arg1.method2218(var5, 83, (long) arg2[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZILfb;)V")
    private final void method794(boolean arg0, int arg1, class341 arg2) {
        if (!arg0) {
            return;
        }
        field1364++;
        if (arg1 == 1) {
            this.field1342 = class33.method260(-2892, '<', arg2.method2261((byte) 69));
        } else if (arg1 == 2) {
            int var8 = arg2.method2233((byte) 104);
            this.field1348 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1348[var9] = arg2.method2239(-1076227960);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method2233((byte) 104);
            this.field1343 = new int[var4];
            this.field1354 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2239(-1076227960);
                this.field1343[var5] = var6;
                this.field1354[var5] = new int[class407.field5934[var6]];
                for (int var7 = 0; var7 < class407.field5934[var6]; var7++) {
                    this.field1354[var5][var7] = arg2.method2239(-1076227960);
                }
            }
            return;
        } else if (arg1 == 4) {
            this.field1350 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(Z)V")
    public static final void method795(boolean arg0) {
        class366.field5400 = true;
        if (arg0) {
            method795(true);
        }
        field1352++;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Lfb;I)Ljava/lang/String;")
    public final String method796(class341 arg0, int arg1) {
        field1345++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1343 != null) {
            for (int var4 = 0; var4 < this.field1343.length; var4++) {
                var3.append(this.field1342[var4]);
                var3.append(class264.method1769(this.field1343[var4], this.field1354[var4], -68, arg0.method2237(class71.field1012[this.field1343[var4]], (byte) 76)));
            }
        }
        if (arg1 != -16981) {
            field1359 = 97;
        }
        var3.append(this.field1342[this.field1342.length - 1]);
        return var3.toString();
    }
}
