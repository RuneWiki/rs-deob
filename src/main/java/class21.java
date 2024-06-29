import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class21 extends class317 {

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "Z")
    private boolean field271 = true;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    private int field276 = 4096;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "Ljava/lang/String;")
    public static String field267 = "Members object";

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "[I")
    public static int[] field275 = new int[200];

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
    public static int field278 = 0;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    public static int field273 = -1;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "[I")
    public static int[] field277 = new int[2];

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "Lin;")
    public static class344 field281 = null;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "[Ljava/lang/String;")
    public static String[] field268;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "[[[I")
    public static int[][][] field266;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "[[[I")
    public static int[][][] field279;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V", line = 5)
    public static final void method130(byte arg0) {
        field274++;
        if (class159.field2179 == 7) {
            int var1 = class157.field2165.method2219(16448);
            int var2 = ((var1 & 0x72) >> 4) + class286.field4251;
            int var3 = (var1 & 0x7) + class44.field540;
            int var4 = class157.field2165.method2220((byte) 46);
            int var5 = class157.field2165.method2219(16448);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var6 = var5 >> 4 & 0xF;
            int var7 = class157.field2165.method2219(16448);
            int var8 = class157.field2165.method2219(16448);
            int var9 = var5 & 0x7;
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                int var10 = var6 + 1;
                if (class173.field2356.field3706[0] >= (var2 - var10) && class173.field2356.field3706[0] <= var2 + var10 && class173.field2356.field3768[0] >= var3 - var10 && var3 + var10 >= class173.field2356.field3768[0] && class224.field3233 != 0 && var9 > 0 && class48.field591 < 50 && var4 != -1) {
                    class309.field4660[class48.field591] = var4;
                    class316.field4764[class48.field591] = var9;
                    class125.field1699[class48.field591] = var7;
                    class290.field4339[class48.field591] = null;
                    class211.field3058[class48.field591] = (var2 << 16) - (-(var3 << 8) - var6);
                    class185.field2547[class48.field591] = var8;
                    class48.field591++;
                }
            }
        } else if (class159.field2179 == 247) {
            int var11 = class157.field2165.method2190((byte) 114);
            int var12 = class157.field2165.method2183(-101);
            int var13 = (var12 >> 4 & 0x7) + class286.field4251;
            int var14 = class44.field540 + (var12 & 0x7);
            int var15 = class157.field2165.method2220((byte) 43);
            int var16 = class157.field2165.method2168((byte) -125);
            if (var13 >= 0 && var14 >= 0 && var13 < 104 && var14 < 104 && class306.field4593 != var15) {
                class224 var17 = new class224();
                var17.field3227 = var16;
                var17.field3226 = var11;
                if (class246.field3544[class251.field3603][var13][var14] == null) {
                    class246.field3544[class251.field3603][var13][var14] = new class192();
                }
                class246.field3544[class251.field3603][var13][var14].method1339((byte) 108, new class168(var17));
                class153.method1104(var13, -99999999, var14);
            }
        } else if (class159.field2179 == 101) {
            int var18 = class157.field2165.method2183(-109);
            int var19 = (var18 & 0x7) + class44.field540;
            int var20 = ((var18 & 0x77) >> 4) + class286.field4251;
            int var21 = class157.field2165.method2220((byte) 111);
            if (var20 >= 0 && var19 >= 0 && var20 < 104 && var19 < 104) {
                class192 var22 = class246.field3544[class251.field3603][var20][var19];
                if (var22 != null) {
                    for (class168 var23 = (class168) var22.method1335(1); var23 != null; var23 = (class168) var22.method1336(3)) {
                        if ((var21 & 0x7FFF) == var23.field2288.field3227) {
                            var23.method1274((byte) -26);
                            break;
                        }
                    }
                    if (var22.method1335(1) == null) {
                        class246.field3544[class251.field3603][var20][var19] = null;
                    }
                    class153.method1104(var20, -99999999, var19);
                }
            }
        } else if (class159.field2179 == 70) {
            int var24 = class157.field2165.method2219(16448);
            int var25 = (var24 >> 4 & 0x7) + class286.field4251;
            int var26 = (var24 & 0x7) + class44.field540;
            int var27 = class157.field2165.method2220((byte) 86);
            int var28 = class157.field2165.method2219(16448);
            int var29 = class157.field2165.method2220((byte) 98);
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104) {
                int var30 = var26 * 128 + 64;
                int var31 = var25 * 128 + 64;
                class245 var32 = new class245(var27, class251.field3603, var31, var30, class135.method985(var30, class251.field3603, var31, (byte) -118) - var28, var29, class329.field4966);
                class332.field4994.method1339((byte) 83, new class199(var32));
            }
        } else if (class159.field2179 == 215) {
            int var148 = class157.field2165.method2176(9639);
            int var149 = var148 >> 2;
            int var150 = var148 & 0x3;
            int var151 = class185.field2557[var149];
            int var152 = class157.field2165.method2183(-116);
            int var153 = (var152 & 0x7) + class44.field540;
            int var154 = (var152 >> 4 & 0x7) + class286.field4251;
            int var155 = class157.field2165.method2220((byte) 87);
            if (var154 >= 0 && var153 >= 0 && var154 < 104 && var153 < 104) {
                class252.method1720(var151, var153, 0, var154, var150, var149, -1, (byte) 115, class251.field3603, var155);
            }
        } else if (class159.field2179 == 140) {
            int var33 = class157.field2165.method2219(16448);
            int var34 = class286.field4251 * 2 + ((var33 & 0xF9) >> 4);
            int var35 = (var33 & 0xF) + class44.field540 * 2;
            int var36 = class157.field2165.method2192(3) + var34;
            int var37 = class157.field2165.method2192(3) + var35;
            int var38 = class157.field2165.method2161(28984);
            int var39 = class157.field2165.method2220((byte) 124);
            int var40 = class157.field2165.method2219(16448) * 4;
            int var41 = class157.field2165.method2219(16448) * 4;
            int var42 = class157.field2165.method2220((byte) 123);
            int var43 = class157.field2165.method2220((byte) 71);
            int var44 = class157.field2165.method2219(16448);
            int var45 = class157.field2165.method2219(16448);
            if (var44 == 255) {
                var44 = -1;
            }
            if (var34 >= 0 && var35 >= 0 && var34 < 208 && var35 < 208 && var36 >= 0 && var37 >= 0 && var36 < 208 && var37 < 208 && var39 != 65535) {
                int var46 = var35 * 64;
                int var47 = var34 * 64;
                class16 var48 = new class16(var39, class251.field3603, var47, var46, class135.method985(var46, class251.field3603, var47, (byte) -96) - var40, class329.field4966 + var42, class329.field4966 + var43, var44, var45, var38, var41);
                int var49 = var37 * 64;
                int var50 = var36 * 64;
                var48.method103(class135.method985(var49, class251.field3603, var50, (byte) -101) - var41, var49, var50, 2, class329.field4966 + var42);
                class159.field2178.method1339((byte) -114, new class134(var48));
            }
        } else if (class159.field2179 == 136) {
            int var51 = class157.field2165.method2220((byte) 121);
            int var52 = class157.field2165.method2219(16448);
            class153.method1106(var51, (byte) -59).method2062(-101, var52);
        } else if (class159.field2179 == 197) {
            int var53 = class157.field2165.method2204(68);
            int var54 = var53 & 0x3;
            int var55 = var53 >> 2;
            int var56 = class185.field2557[var55];
            int var57 = class157.field2165.method2183(-107);
            int var58 = ((var57 & 0x7C) >> 4) + class286.field4251;
            int var59 = (var57 & 0x7) + class44.field540;
            if (var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104) {
                class252.method1720(var56, var59, 0, var58, var54, var55, -1, (byte) 127, class251.field3603, -1);
            }
        } else if (class159.field2179 == 159) {
            int var142 = class157.field2165.method2220((byte) 120);
            int var143 = class157.field2165.method2204(69);
            int var144 = (var143 & 0x7) + class44.field540;
            int var145 = (var143 >> 4 & 0x7) + class286.field4251;
            int var146 = class157.field2165.method2190((byte) 116);
            if (var145 >= 0 && var144 >= 0 && var145 < 104 && var144 < 104) {
                class224 var147 = new class224();
                var147.field3227 = var146;
                var147.field3226 = var142;
                if (class246.field3544[class251.field3603][var145][var144] == null) {
                    class246.field3544[class251.field3603][var145][var144] = new class192();
                }
                class246.field3544[class251.field3603][var145][var144].method1339((byte) -106, new class168(var147));
                class153.method1104(var145, -99999999, var144);
            }
        } else if (arg0 < -85) {
            if (class159.field2179 == 111) {
                int var60 = class157.field2165.method2219(16448);
                int var61 = class44.field540 + (var60 & 0x7);
                int var62 = class286.field4251 + ((var60 & 0x74) >> 4);
                int var63 = class157.field2165.method2220((byte) 119);
                int var64 = class157.field2165.method2220((byte) 108);
                int var65 = class157.field2165.method2220((byte) 110);
                if (var62 >= 0 && var61 >= 0 && var62 < 104 && var61 < 104) {
                    class192 var66 = class246.field3544[class251.field3603][var62][var61];
                    if (var66 != null) {
                        for (class168 var67 = (class168) var66.method1335(1); var67 != null; var67 = (class168) var66.method1336(3)) {
                            class224 var68 = var67.field2288;
                            if ((var63 & 0x7FFF) == var68.field3227 && var68.field3226 == var64) {
                                var68.field3226 = var65;
                                break;
                            }
                        }
                        class153.method1104(var62, -99999999, var61);
                    }
                }
            } else {
                if (class159.field2179 == 133) {
                    byte var69 = class157.field2165.method2192(3);
                    byte var70 = class157.field2165.method2195(128);
                    int var71 = class157.field2165.method2190((byte) 125);
                    int var72 = class157.field2165.method2204(111);
                    int var73 = (var72 >> 4 & 0x7) + class286.field4251;
                    int var74 = (var72 & 0x7) + class44.field540;
                    int var75 = class157.field2165.method2168((byte) -108);
                    int var76 = class157.field2165.method2183(30);
                    int var77 = var76 & 0x3;
                    int var78 = var76 >> 2;
                    byte var79 = class157.field2165.method2192(3);
                    byte var80 = class157.field2165.method2196((byte) -102);
                    int var81 = class157.field2165.method2190((byte) 120);
                    int var82 = class157.field2165.method2186(116);
                    if (!class67.field908) {
                        class234.method1611(var75, false, var71, var73, var70, var78, var82, var80, var74, var69, var77, var81, var79);
                    }
                }
                if (class159.field2179 == 46) {
                    int var83 = class157.field2165.method2219(16448);
                    int var84 = ((var83 & 0xF6) >> 4) + class286.field4251 * 2;
                    int var85 = class44.field540 * 2 + (var83 & 0xF);
                    int var86 = var84 + class157.field2165.method2192(3);
                    int var87 = var85 + class157.field2165.method2192(3);
                    int var88 = class157.field2165.method2161(28984);
                    int var89 = class157.field2165.method2161(28984);
                    int var90 = class157.field2165.method2220((byte) 74);
                    int var91 = class157.field2165.method2192(3);
                    int var92 = class157.field2165.method2219(16448) * 4;
                    int var93 = class157.field2165.method2220((byte) 96);
                    int var94 = class157.field2165.method2220((byte) 72);
                    int var95 = class157.field2165.method2219(16448);
                    int var96 = class157.field2165.method2219(16448);
                    if (var95 == 255) {
                        var95 = -1;
                    }
                    if (var84 >= 0 && var85 >= 0 && var84 < 208 && var85 < 208 && var86 >= 0 && var87 >= 0 && var86 < 208 && var87 < 208 && var90 != 65535) {
                        int var97 = var85 * 64;
                        int var98 = var87 * 64;
                        int var99 = var86 * 64;
                        int var100 = var84 * 64;
                        if (var88 != 0) {
                            int var103;
                            class256 var104;
                            if (var88 >= 0) {
                                int var101 = var88 - 1;
                                int var102 = var101 & 0x7FF;
                                var103 = (var101 & 0x7DFD) >> 11;
                                var104 = class42.field484[var102];
                            } else {
                                int var105 = -var88 - 1;
                                var103 = var105 >> 11 & 0xF;
                                int var106 = var105 & 0x7FF;
                                if (class306.field4593 == var106) {
                                    var104 = class173.field2356;
                                } else {
                                    var104 = class169.field2306[var106];
                                }
                            }
                            if (var104 != null) {
                                class194 var107 = var104.method1753(-1);
                                if (var107.field2697 != null && var107.field2697[var103] != null) {
                                    int var108 = var107.field2697[var103][0];
                                    var91 -= var107.field2697[var103][1];
                                    int var109 = var107.field2697[var103][2];
                                    int var110 = class184.field2538[var104.field3746];
                                    int var111 = class184.field2532[var104.field3746];
                                    int var112 = var109 * var110 + (var108 * var111) >> 16;
                                    int var113 = var109 * var111 - (var108 * var110) >> 16;
                                    var100 += var112;
                                    var97 += var113;
                                }
                            }
                        }
                        class16 var115 = new class16(var90, class251.field3603, var100, var97, class135.method985(var97, class251.field3603, var100, (byte) -119) - var91, class329.field4966 + var93, var94 + class329.field4966, var95, var96, var89, var92);
                        var115.method103(class135.method985(var98, class251.field3603, var99, (byte) -124) - var92, var98, var99, 2, class329.field4966 + var93);
                        class159.field2178.method1339((byte) 59, new class134(var115));
                    }
                } else if (class159.field2179 == 41) {
                    int var116 = class157.field2165.method2219(16448);
                    int var117 = (var116 >> 4 & 0x7) + class286.field4251;
                    int var118 = (var116 & 0x7) + class44.field540;
                    int var119 = var117 + class157.field2165.method2192(3);
                    int var120 = class157.field2165.method2192(3) + var118;
                    int var121 = class157.field2165.method2161(28984);
                    int var122 = class157.field2165.method2220((byte) 83);
                    int var123 = class157.field2165.method2219(16448) * 4;
                    int var124 = class157.field2165.method2219(16448) * 4;
                    int var125 = class157.field2165.method2220((byte) 72);
                    int var126 = class157.field2165.method2220((byte) 92);
                    int var127 = class157.field2165.method2219(16448);
                    if (var127 == 255) {
                        var127 = -1;
                    }
                    int var128 = class157.field2165.method2219(16448);
                    if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104 && var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104 && var122 != 65535) {
                        int var129 = var117 * 128 + 64;
                        int var130 = var118 * 128 + 64;
                        class16 var131 = new class16(var122, class251.field3603, var129, var130, class135.method985(var130, class251.field3603, var129, (byte) -127) - var123, var125 - -class329.field4966, class329.field4966 + var126, var127, var128, var121, var124);
                        int var132 = var119 * 128 + 64;
                        int var133 = var120 * 128 + 64;
                        var131.method103(class135.method985(var133, class251.field3603, var132, (byte) -90) - var124, var133, var132, 2, var125 + class329.field4966);
                        class159.field2178.method1339((byte) -105, new class134(var131));
                    }
                } else if (class159.field2179 == 193) {
                    int var134 = class157.field2165.method2204(77);
                    int var135 = var134 >> 2;
                    int var136 = var134 & 0x3;
                    int var137 = class185.field2557[var135];
                    int var138 = class157.field2165.method2176(9639);
                    int var139 = (var138 & 0x7) + class44.field540;
                    int var140 = (var138 >> 4 & 0x7) + class286.field4251;
                    int var141 = class157.field2165.method2168((byte) -112);
                    if (var141 == 65535) {
                        var141 = -1;
                    }
                    class192.method1342(class251.field3603, var137, var140, var139, var135, var141, var136, (byte) -8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[[I", line = 595)
    public final int[][] method53(int arg0, int arg1) {
        field269++;
        int[][] var3 = this.field4840.method1625(arg1, -13241);
        if (this.field4840.field3352) {
            int[] var4 = this.method2225((byte) 66, 0, class202.field2889 & arg1 - 1);
            int[] var5 = this.method2225((byte) 66, 0, arg1);
            int[] var6 = this.method2225((byte) 66, 0, arg1 + 1 & class202.field2889);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class326.field4933; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field276;
                int var12 = (var5[var10 + 1 & class246.field3548] - var5[class246.field3548 & var10 - 1]) * this.field276;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                } else {
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                    var20 = var11 / var17;
                }
                if (this.field271) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        int var21 = 52 % ((-arg0 - 31) / 37);
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 678)
    public class21() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)V", line = 686)
    public static void method131(int arg0) {
        field267 = null;
        field275 = null;
        field277 = null;
        field266 = (int[][][]) null;
        if (arg0 == 7) {
            field268 = null;
            field279 = (int[][][]) null;
            field281 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lcg;II)V", line = 719)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field272++;
        int var4 = -33 / ((arg1 + 17) / 40);
        if (arg2 == 0) {
            this.field276 = arg0.method2220((byte) 67);
        } else if (arg2 == 1) {
            this.field271 = arg0.method2219(16448) == 1;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[BII)Ljava/lang/String;", line = 779)
    public static final String method132(int arg0, byte[] arg1, int arg2, int arg3) {
        field280++;
        char[] var4 = new char[arg0];
        int var5 = 0;
        if (arg2 != -1) {
            return (String) null;
        }
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg1[arg3 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class304.field4570[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}
