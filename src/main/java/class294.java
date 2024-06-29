import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class294 extends class253 {

    @OriginalMember(owner = "client!l", name = "P", descriptor = "Lud;")
    public static class279 field5246 = class130.method1024("brillant2:", 255);

    @OriginalMember(owner = "client!l", name = "nb", descriptor = "[Ldb;")
    public static class182[] field5253 = new class182[14];

    @OriginalMember(owner = "client!l", name = "jb", descriptor = "Lud;")
    public static class279 field5249 = class130.method1024("_labels", 255);

    @OriginalMember(owner = "client!l", name = "T", descriptor = "Lud;")
    public static class279 field5247 = class130.method1024("Angreifen", 255);

    @OriginalMember(owner = "client!l", name = "ib", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!l", name = "kb", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!l", name = "lb", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!l", name = "mb", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!l", name = "ob", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!l", name = "pb", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!l", name = "qb", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(B)V", line = 5)
    public static final void method2088(byte arg0) {
        field5252++;
        if (arg0 < 9) {
            return;
        }
        for (int var1 = -1; var1 < class103.field1931; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class252.field4503[var1];
            }
            class239 var3 = class96.field1780[var2];
            if (var3 != null) {
                class278.method1961(var3.method3((byte) -125), var3, -65);
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V", line = 39)
    public static final void method2089(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; var6 <= arg5; var6++) {
            class152.method1208(arg2, arg4, arg1, class182.field3348[var6], arg0 ^ 0xFFFFFFFE);
        }
        if (arg0 != 7) {
            method2090((byte) -4);
        }
        field5251++;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(B)[F", line = 56)
    public static final float[] method2090(byte arg0) {
        field5250++;
        float var1 = class219.method1607() + class219.method1603();
        if (arg0 > -50) {
            method2089(27, 120, 10, 74, -55, -15);
        }
        int var2 = class219.method1602();
        class41.field879[3] = 1.0F;
        float var3 = (float) ((var2 & 0xFFDC) >> 8) / 255.0F;
        float var4 = (float) ((var2 & 0xFF3FC8) >> 16) / 255.0F;
        float var5 = (float) (var2 & 0xFF) / 255.0F;
        float var6 = 0.58823526F;
        class41.field879[0] = class28.field678[0] * var4 * var6 * var1;
        class41.field879[2] = class28.field678[2] * var5 * var6 * var1;
        class41.field879[1] = class28.field678[1] * var3 * var6 * var1;
        return class41.field879;
    }

    @OriginalMember(owner = "client!l", name = "h", descriptor = "(I)V", line = 92)
    public static final void method2091(int arg0) {
        field5255++;
        if (class143.field2597 == 186) {
            int var144 = class287.field5106.method483(-124);
            int var145 = ((var144 & 0x7B) >> 4) + class122.field2198;
            int var146 = (var144 & 0x7) + class293.field5232;
            int var147 = class287.field5106.method468(28214);
            int var148 = class287.field5106.method483(-114);
            if (var147 == 65535) {
                var147 = -1;
            }
            int var149 = (var148 & 0xFA) >> 4;
            int var150 = class287.field5106.method483(-121);
            int var151 = var148 & 0x7;
            if (var145 >= 0 && var146 >= 0 && var145 < 104 && var146 < 104) {
                int var152 = var149 + 1;
                if (class72.field1420.field11[0] >= (var145 - var152) && var145 + var152 >= class72.field1420.field11[0] && var146 - var152 <= class72.field1420.field34[0] && class72.field1420.field34[0] <= var146 + var152 && class3.field105 != 0 && var151 > 0 && class260.field4620 < 50 && var147 != -1) {
                    class3.field104[class260.field4620] = var147;
                    class266.field4785[class260.field4620] = var151;
                    class232.field4057[class260.field4620] = var150;
                    class92.field1724[class260.field4620] = null;
                    class55.field1196[class260.field4620] = (var145 << 16) + (var146 << 8) + var149;
                    class260.field4620++;
                }
            }
        } else if (~class143.field2597 == arg0) {
            int var135 = class287.field5106.method483(arg0 ^ 0x16);
            int var136 = (var135 & 0x7) + class293.field5232;
            int var137 = class122.field2198 + (var135 >> 4 & 0x7);
            int var138 = class287.field5106.method468(28214);
            int var139 = class287.field5106.method468(28214);
            int var140 = class287.field5106.method468(28214);
            if (var137 >= 0 && var136 >= 0 && var137 < 104 && var136 < 104) {
                class317 var141 = class276.field4890[class287.field5134][var137][var136];
                if (var141 != null) {
                    for (class292 var142 = (class292) var141.method2248(arg0 ^ 0x8); var142 != null; var142 = (class292) var141.method2240(1138)) {
                        class99 var143 = var142.field5203;
                        if ((var138 & 0x7FFF) == var143.field1858 && var143.field1856 == var139) {
                            var143.field1856 = var140;
                            break;
                        }
                    }
                    class293.method2086(var136, var137, (byte) 86);
                }
            }
        } else if (class143.field2597 == 165) {
            int var1 = class287.field5106.method483(-103);
            int var2 = class122.field2198 * 2 + (var1 >> 4 & 0xF);
            int var3 = (var1 & 0xF) + class293.field5232 * 2;
            int var4 = var2 + class287.field5106.method494(false);
            int var5 = class287.field5106.method494(false) + var3;
            int var6 = class287.field5106.method495((byte) -83);
            int var7 = class287.field5106.method468(28214);
            int var8 = class287.field5106.method483(arg0 - 27) * 4;
            int var9 = class287.field5106.method483(-101) * 4;
            int var10 = class287.field5106.method468(28214);
            int var11 = class287.field5106.method468(arg0 + 28313);
            int var12 = class287.field5106.method483(-108);
            int var13 = class287.field5106.method483(-114);
            if (var12 == 255) {
                var12 = -1;
            }
            if (var2 >= 0 && var3 >= 0 && var2 < 208 && var3 < 208 && var4 >= 0 && var5 >= 0 && var4 < 208 && var5 < 208 && var7 != 65535) {
                int var14 = var4 * 64;
                int var15 = var5 * 64;
                int var16 = var2 * 64;
                int var17 = var3 * 64;
                class139 var18 = new class139(var7, class287.field5134, var16, var17, class130.method1025(var16, 1008652135, class287.field5134, var17) - var8, class8.field279 + var10, class8.field279 + var11, var12, var13, var6, var9);
                var18.method1079(var15, var14, class130.method1025(var14, 1008652135, class287.field5134, var15) - var9, arg0 ^ 0x1F, var10 + class8.field279);
                class32.field727.method2246(true, new class275(var18));
            }
        } else if (class143.field2597 == 60) {
            int var129 = class287.field5106.method475(-93);
            int var130 = class287.field5106.method466(255);
            int var131 = class287.field5106.method488((byte) 117);
            int var132 = (var131 >> 4 & 0x7) + class122.field2198;
            int var133 = (var131 & 0x7) + class293.field5232;
            if (var132 >= 0 && var133 >= 0 && var132 < 104 && var133 < 104) {
                class99 var134 = new class99();
                var134.field1858 = var129;
                var134.field1856 = var130;
                if (class276.field4890[class287.field5134][var132][var133] == null) {
                    class276.field4890[class287.field5134][var132][var133] = new class317();
                }
                class276.field4890[class287.field5134][var132][var133].method2246(true, new class292(var134));
                class293.method2086(var133, var132, (byte) 86);
            }
        } else if (class143.field2597 == 208) {
            int var19 = class287.field5106.method466(255);
            int var20 = class287.field5106.method477(-1);
            int var21 = (var20 & 0x7) + class293.field5232;
            int var22 = (var20 >> 4 & 0x7) + class122.field2198;
            if (var22 >= 0 && var21 >= 0 && var22 < 104 && var21 < 104) {
                class317 var23 = class276.field4890[class287.field5134][var22][var21];
                if (var23 != null) {
                    for (class292 var24 = (class292) var23.method2248(122); var24 != null; var24 = (class292) var23.method2240(1138)) {
                        if ((var19 & 0x7FFF) == var24.field5203.field1858) {
                            var24.method2221(true);
                            break;
                        }
                    }
                    if (var23.method2248(119) == null) {
                        class276.field4890[class287.field5134][var22][var21] = null;
                    }
                    class293.method2086(var21, var22, (byte) 86);
                }
            }
        } else if (class143.field2597 == 106) {
            int var25 = class287.field5106.method483(arg0 ^ 0x1D);
            int var26 = class122.field2198 * 2 + (var25 >> 4 & 0xF);
            int var27 = (var25 & 0xF) + class293.field5232 * 2;
            int var28 = class287.field5106.method494(false) + var26;
            int var29 = var27 + class287.field5106.method494(false);
            int var30 = class287.field5106.method495((byte) -105);
            int var31 = class287.field5106.method495((byte) -54);
            int var32 = class287.field5106.method468(28214);
            int var33 = class287.field5106.method494(false);
            int var34 = class287.field5106.method483(-104) * 4;
            int var35 = class287.field5106.method468(28214);
            int var36 = class287.field5106.method468(28214);
            int var37 = class287.field5106.method483(-117);
            if (var37 == 255) {
                var37 = -1;
            }
            int var38 = class287.field5106.method483(-101);
            if (var26 >= 0 && var27 >= 0 && var26 < 208 && var27 < 208 && var28 >= 0 && var29 >= 0 && var28 < 208 && var29 < 208 && var32 != 65535) {
                int var39 = var29 * 64;
                int var40 = var28 * 64;
                int var41 = var26 * 64;
                int var42 = var27 * 64;
                if (var30 != 0) {
                    int var44;
                    class1 var46;
                    if (var30 >= 0) {
                        int var43 = var30 - 1;
                        var44 = var43 >> 11 & 0xF;
                        int var45 = var43 & 0x7FF;
                        var46 = class122.field2196[var45];
                    } else {
                        int var47 = -var30 - 1;
                        int var48 = var47 & 0x7FF;
                        if (class79.field1506 == var48) {
                            var46 = class72.field1420;
                        } else {
                            var46 = class96.field1780[var48];
                        }
                        var44 = var47 >> 11 & 0xF;
                    }
                    if (var46 != null) {
                        class34 var49 = var46.method15(arg0 ^ 0xFFFFFFE9);
                        if (var49.field766 != null && var49.field766[var44] != null) {
                            var33 -= var49.field766[var44][1];
                            int var50 = var49.field766[var44][2];
                            int var51 = class27.field654[var46.field44];
                            int var52 = var49.field766[var44][0];
                            int var53 = class27.field642[var46.field44];
                            int var54 = var50 * var51 + var52 * var53 >> 16;
                            int var55 = var50 * var53 - (var51 * var52) >> 16;
                            var42 += var55;
                            var41 += var54;
                        }
                    }
                }
                class139 var57 = new class139(var32, class287.field5134, var41, var42, class130.method1025(var41, 1008652135, class287.field5134, var42) - var33, class8.field279 + var35, class8.field279 + var36, var37, var38, var31, var34);
                var57.method1079(var39, var40, class130.method1025(var40, 1008652135, class287.field5134, var39) - var34, -128, var35 + class8.field279);
                class32.field727.method2246(true, new class275(var57));
            }
        } else {
            if (class143.field2597 == 52) {
                int var58 = class287.field5106.method501((byte) 88);
                byte var59 = class287.field5106.method455(arg0 ^ 0xFFFFC8FB);
                int var60 = class287.field5106.method466(255);
                byte var61 = class287.field5106.method489(false);
                int var62 = class287.field5106.method468(28214);
                byte var63 = class287.field5106.method455(14182);
                int var64 = class287.field5106.method470((byte) -7);
                int var65 = var64 & 0x3;
                int var66 = class287.field5106.method477(-1);
                int var67 = class293.field5232 + (var66 & 0x7);
                int var68 = var64 >> 2;
                int var69 = ((var66 & 0x7A) >> 4) + class122.field2198;
                byte var70 = class287.field5106.method489(false);
                int var71 = class287.field5106.method491(-1268);
                if (!class97.field1824) {
                    class289.method2059(var65, var60, var69, var70, var61, var68, var59, var71, var67, var63, var58, var62, -1);
                }
            }
            if (class143.field2597 == 190) {
                int var72 = class287.field5106.method483(-121);
                int var73 = (var72 & 0x7) + class293.field5232;
                int var74 = (var72 >> 4 & 0x7) + class122.field2198;
                int var75 = class287.field5106.method468(28214);
                int var76 = class287.field5106.method483(-110);
                int var77 = class287.field5106.method468(28214);
                if (var74 >= 0 && var73 >= 0 && var74 < 104 && var73 < 104) {
                    int var78 = var74 * 128 + 64;
                    int var79 = var73 * 128 + 64;
                    class249 var80 = new class249(var75, class287.field5134, var78, var79, class130.method1025(var78, 1008652135, class287.field5134, var79) - var76, var77, class8.field279);
                    class107.field1996.method2246(true, new class121(var80));
                }
            } else if (class143.field2597 == 54) {
                int var111 = class287.field5106.method483(arg0 - 22);
                int var112 = (var111 & 0x7) + class293.field5232;
                int var113 = class122.field2198 + (var111 >> 4 & 0x7);
                int var114 = class287.field5106.method494(false) + var113;
                int var115 = class287.field5106.method494(false) + var112;
                int var116 = class287.field5106.method495((byte) -94);
                int var117 = class287.field5106.method468(28214);
                int var118 = class287.field5106.method483(-106) * 4;
                int var119 = class287.field5106.method483(-125) * 4;
                int var120 = class287.field5106.method468(28214);
                int var121 = class287.field5106.method468(arg0 + 28313);
                int var122 = class287.field5106.method483(-107);
                if (var122 == 255) {
                    var122 = -1;
                }
                int var123 = class287.field5106.method483(-117);
                if (var113 >= 0 && var112 >= 0 && var113 < 104 && var112 < 104 && var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104 && var117 != 65535) {
                    int var124 = var113 * 128 + 64;
                    int var125 = var112 * 128 + 64;
                    int var126 = var115 * 128 + 64;
                    int var127 = var114 * 128 + 64;
                    class139 var128 = new class139(var117, class287.field5134, var124, var125, class130.method1025(var124, arg0 ^ 0xC3E130FA, class287.field5134, var125) - var118, class8.field279 + var120, var121 + class8.field279, var122, var123, var116, var119);
                    var128.method1079(var126, var127, class130.method1025(var127, 1008652135, class287.field5134, var126) - var119, -128, class8.field279 + var120);
                    class32.field727.method2246(true, new class275(var128));
                }
            } else if (class143.field2597 == 194) {
                int var81 = class287.field5106.method488((byte) 111);
                int var82 = (var81 >> 4 & 0x7) + class122.field2198;
                int var83 = class293.field5232 + (var81 & 0x7);
                int var84 = class287.field5106.method483(arg0 - 2);
                int var85 = var84 >> 2;
                int var86 = class252.field4505[var85];
                int var87 = var84 & 0x3;
                if (var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104) {
                    class17.method148(var82, 0, -1, class287.field5134, var83, -1, var86, 0, var85, var87);
                }
            } else if (class143.field2597 == 79) {
                int var88 = class287.field5106.method477(-1);
                int var89 = var88 & 0x3;
                int var90 = var88 >> 2;
                int var91 = class252.field4505[var90];
                int var92 = class287.field5106.method468(28214);
                int var93 = class287.field5106.method488((byte) 127);
                int var94 = class122.field2198 + (var93 >> 4 & 0x7);
                if (var92 == 65535) {
                    var92 = -1;
                }
                int var95 = class293.field5232 + (var93 & 0x7);
                class262.method1878(class287.field5134, var92, false, var95, var94, var91, var89, var90);
            } else if (class143.field2597 == 231) {
                int var104 = class287.field5106.method466(255);
                int var105 = class287.field5106.method468(28214);
                int var106 = class287.field5106.method466(255);
                int var107 = class287.field5106.method488((byte) 117);
                int var108 = (var107 >> 4 & 0x7) + class122.field2198;
                int var109 = (var107 & 0x7) + class293.field5232;
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104 && class79.field1506 != var106) {
                    class99 var110 = new class99();
                    var110.field1858 = var105;
                    var110.field1856 = var104;
                    if (class276.field4890[class287.field5134][var108][var109] == null) {
                        class276.field4890[class287.field5134][var108][var109] = new class317();
                    }
                    class276.field4890[class287.field5134][var108][var109].method2246(true, new class292(var110));
                    class293.method2086(var109, var108, (byte) 86);
                }
            } else if (class143.field2597 == 147) {
                int var96 = class287.field5106.method475(-48);
                int var97 = class287.field5106.method477(-1);
                int var98 = var97 >> 2;
                int var99 = var97 & 0x3;
                int var100 = class252.field4505[var98];
                int var101 = class287.field5106.method483(-124);
                int var102 = (var101 >> 4 & 0x7) + class122.field2198;
                int var103 = (var101 & 0x7) + class293.field5232;
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    class17.method148(var102, 0, -1, class287.field5134, var103, var96, var100, 0, var98, var99);
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "i", descriptor = "(I)V", line = 660)
    public static void method2092(int arg0) {
        if (arg0 < 22) {
            method2089(-60, -55, -24, -98, -17, 24);
        }
        field5249 = null;
        field5247 = null;
        field5246 = null;
        field5253 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)[[I", line = 679)
    public final int[][] method86(int arg0, int arg1) {
        int[][] var3 = this.field1400.method1746((byte) -110, arg0);
        if (this.field1400.field4363 && this.method1815(false)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg0 % this.field4517 * this.field4517;
            for (int var8 = 0; var8 < class215.field3787; var8++) {
                int var9 = this.field4518[var8 % this.field4527 + var7];
                var5[var8] = class52.method442(255, var9) << 4;
                var6[var8] = class52.method442(4080, var9 >> 4);
                var4[var8] = class52.method442(16711680, var9) >> 12;
            }
        }
        field5254++;
        int var10 = -42 / ((arg1 + 70) / 54);
        return var3;
    }
}
