import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class66 extends class382 {

    @OriginalMember(owner = "client!iv", name = "Q", descriptor = "Z")
    public static boolean field1114 = false;

    @OriginalMember(owner = "client!iv", name = "P", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!iv", name = "R", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!iv", name = "S", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!iv", name = "T", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!iv", name = "U", descriptor = "Led;")
    public static class507 field1118;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
    public static void method529(int arg0) {
        field1118 = null;
        if (arg0 != -1566) {
            method530(null, -75);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ldh;I)V")
    public static final void method530(class216 arg0, int arg1) {
        field1113++;
        if (class190.field2781 == arg0) {
            int var2 = class336.field4966.method3018(566990904);
            if (var2 == 65535) {
                var2 = -1;
            }
            int var3 = class336.field4966.method3075(100);
            int var4 = class444.field6328 + (var3 >> 4 & 0x7);
            int var5 = (var3 & 0x7) + class146.field2264;
            int var6 = class336.field4966.method3075(89);
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = class71.field1155[var7];
            class311.method1982(class470.field6819, var7, var9, var8, var2, var4, 97, var5);
        } else if (class195.field2819 == arg0) {
            int var10 = class336.field4966.method3075(98);
            int var11 = var10 >> 2;
            int var12 = var10 & 0x3;
            int var13 = class71.field1155[var11];
            int var14 = class336.field4966.method3075(-27);
            int var15 = class444.field6328 + ((var14 & 0x77) >> 4);
            int var16 = (var14 & 0x7) + class146.field2264;
            if (class327.method2070(class251.field3738, true) || var15 >= 0 && var16 >= 0 && var15 < class69.field1139 && class255.field3763 > var16) {
                class544.method3195(class470.field6819, -1, var16, 0, var15, var12, (byte) 81, -1, var13, var11);
            }
        } else if (class159.field2439 == arg0) {
            int var17 = class336.field4966.method3072((byte) -124);
            int var18 = (var17 & 0x7) + class146.field2264;
            int var19 = class501.field7240 + var18;
            int var20 = (var17 >> 4 & 0x7) + class444.field6328;
            int var21 = class82.field1315 + var20;
            int var22 = class336.field4966.method3018(566990904);
            int var23 = class336.field4966.method3018(566990904);
            int var24 = class336.field4966.method3018(566990904);
            if (class191.field2787 != null) {
                class203 var25 = (class203) class191.field2787.method2284(true, (long) (var21 | var19 << 14 | class470.field6819 << 28));
                if (var25 != null) {
                    for (class413 var26 = (class413) var25.field3128.method863(-1); var26 != null; var26 = (class413) var25.field3128.method865(-1)) {
                        if ((var22 & 0x7FFF) == var26.field5843 && var26.field5841 == var23) {
                            var26.method421(22071);
                            var26.field5841 = var24;
                            class452.method2692(var21, var26, var19, class470.field6819, 0);
                            break;
                        }
                    }
                    if (var20 >= 0 && var18 >= 0 && var20 < class69.field1139 && class255.field3763 > var18) {
                        class543.method3186(var20, class470.field6819, false, var18);
                    }
                }
            }
        } else if (class216.field3241 == arg0) {
            int var27 = class336.field4966.method3072((byte) -128);
            int var28 = class444.field6328 + (var27 >> 4 & 0x7);
            int var29 = (var27 & 0x7) + class146.field2264;
            int var30 = class336.field4966.method3075(15);
            int var31 = var30 >> 2;
            int var32 = var30 & 0x3;
            int var33 = class71.field1155[var31];
            int var34 = class336.field4966.method3018(566990904);
            if (class327.method2070(class251.field3738, true) || var28 >= 0 && var29 >= 0 && class69.field1139 > var28 && class255.field3763 > var29) {
                class544.method3195(class470.field6819, -1, var29, 0, var28, var32, (byte) 106, var34, var33, var31);
            }
        } else if (class393.field5592 == arg0) {
            int var35 = class336.field4966.method3072((byte) -122);
            int var36 = class444.field6328 + ((var35 & 0x7E) >> 4);
            int var37 = (var35 & 0x7) + class146.field2264;
            int var38 = class336.field4966.method3018(566990904);
            int var39 = class336.field4966.method3072((byte) -119);
            int var40 = class336.field4966.method3018(566990904);
            int var41 = class336.field4966.method3072((byte) -120);
            if (var36 >= 0 && var37 >= 0 && var36 < class69.field1139 && var37 < class255.field3763) {
                int var42 = var36 * 128 + 64;
                int var43 = var37 * 128 + 64;
                int var44 = class470.field6819;
                if (var44 < 3 && class195.method1322(var36, var37, 28946)) {
                    var44++;
                }
                class359 var45 = new class359(var38, var40, class24.field349, class470.field6819, var44, var42, class224.method1515(var42, var43, class470.field6819, -631749433) - var39, var43, var36, var36, var37, var37, var41);
                class533.field7867.method866((byte) 10, new class107(var45));
            }
        } else if (class166.field2494 == arg0) {
            int var46 = class336.field4966.method3065((byte) -125);
            int var47 = class336.field4966.method3065((byte) -127);
            int var48 = class336.field4966.method3081(24083);
            int var49 = class336.field4966.method3072((byte) -126);
            int var50 = (var49 & 0x7) + class146.field2264;
            int var51 = var50 + class501.field7240;
            int var52 = ((var49 & 0x75) >> 4) + class444.field6328;
            int var53 = class82.field1315 + var52;
            if (class497.field7188 != var47) {
                boolean var54 = var52 >= 0 && var50 >= 0 && class69.field1139 > var52 && class255.field3763 > var50;
                if (var54 || class327.method2070(class251.field3738, true)) {
                    class452.method2692(var53, new class413(var46, var48), var51, class470.field6819, 0);
                    if (var54) {
                        class543.method3186(var52, class470.field6819, false, var50);
                    }
                }
            }
        } else if (class475.field6930 == arg0) {
            int var55 = class336.field4966.method3072((byte) -122);
            boolean var56 = (var55 & 0x80) != 0;
            int var57 = (var55 >> 3 & 0x7) + class444.field6328;
            int var58 = class146.field2264 + (var55 & 0x7);
            int var59 = var57 + class336.field4966.method3034((byte) -79);
            int var60 = class336.field4966.method3034((byte) 102) + var58;
            int var61 = class336.field4966.method3044((byte) -116);
            int var62 = class336.field4966.method3018(566990904);
            int var63 = class336.field4966.method3072((byte) -125) * 4;
            int var64 = class336.field4966.method3072((byte) -121) * 4;
            int var65 = class336.field4966.method3018(566990904);
            int var66 = class336.field4966.method3018(566990904);
            int var67 = class336.field4966.method3072((byte) -122);
            int var68 = class336.field4966.method3018(566990904);
            if (var67 == 255) {
                var67 = -1;
            }
            if (var57 >= 0 && var58 >= 0 && class69.field1139 > var57 && var58 < class255.field3763 && var59 >= 0 && var60 >= 0 && var59 < class69.field1139 && var60 < class255.field3763 && var62 != 65535) {
                int var69 = var68 << 0;
                int var70 = var64 << 0;
                int var71 = var63 << 0;
                int var72 = var59 * 128 + 64;
                int var73 = var60 * 128 + 64;
                int var74 = var57 * 128 + 64;
                int var75 = var58 * 128 + 64;
                class492 var76 = new class492(var62, class470.field6819, var74, var75, var71, class24.field349 + var65, class24.field349 + var66, var67, var69, var61, var70, var56);
                var76.method2890(var73, (byte) -122, class224.method1515(var72, var73, class470.field6819, -631749433) - var70, var72, class24.field349 + var65);
                class518.field7503.method866((byte) 10, new class241(var76));
            }
        } else if (class24.field351 == arg0) {
            class336.field4966.method3072((byte) -128);
            int var77 = class336.field4966.method3072((byte) -125);
            int var78 = (var77 >> 4 & 0x7) + class444.field6328;
            int var79 = (var77 & 0x7) + class146.field2264;
            int var80 = class336.field4966.method3018(566990904);
            int var81 = class336.field4966.method3072((byte) -122);
            int var82 = class336.field4966.method3040((byte) -3);
            String var83 = class336.field4966.method3082((byte) 87);
            class76.method589(var79, var82, var83, (byte) -100, var81, class470.field6819, var78, var80);
        } else {
            int var84 = 5 / ((63 - arg1) / 57);
            if (class369.field5325 == arg0) {
                int var85 = class336.field4966.method3072((byte) -120);
                int var86 = (var85 >> 4 & 0x7) + class444.field6328;
                int var87 = class146.field2264 + (var85 & 0x7);
                int var88 = class336.field4966.method3018(566990904);
                if (var88 == 65535) {
                    var88 = -1;
                }
                int var89 = class336.field4966.method3072((byte) -125);
                int var90 = var89 >> 4 & 0xF;
                int var91 = var89 & 0x7;
                int var92 = class336.field4966.method3072((byte) -124);
                int var93 = class336.field4966.method3072((byte) -123);
                if (var86 >= 0 && var87 >= 0 && class69.field1139 > var86 && class255.field3763 > var87) {
                    int var94 = var90 + 1;
                    if (class364.field5293.field343[0] >= (var86 - var94) && (var86 + var94) >= class364.field5293.field343[0] && class364.field5293.field344[0] >= (var87 - var94) && class364.field5293.field344[0] <= (var87 + var94)) {
                        class453.method2700(var93, var91, (var87 << 8) + (class470.field6819 << 24) + (var86 << 16) + var90, var88, 16730, var92);
                    }
                }
            } else if (class368.field5309 == arg0) {
                int var95 = class336.field4966.method3072((byte) -119);
                int var96 = class444.field6328 * 2 + (var95 >> 4 & 0xF);
                int var97 = class146.field2264 * 2 + (var95 & 0xF);
                boolean var98 = class336.field4966.method3072((byte) -128) != 0;
                int var99 = class336.field4966.method3034((byte) 125) + var96;
                int var100 = class336.field4966.method3034((byte) -109) + var97;
                int var101 = class336.field4966.method3044((byte) -94);
                int var102 = class336.field4966.method3018(566990904);
                int var103 = class336.field4966.method3072((byte) -128) * 4;
                int var104 = class336.field4966.method3072((byte) -127) * 4;
                int var105 = class336.field4966.method3018(566990904);
                int var106 = class336.field4966.method3018(566990904);
                int var107 = class336.field4966.method3072((byte) -122);
                if (var107 == 255) {
                    var107 = -1;
                }
                int var108 = class336.field4966.method3018(566990904);
                if (var96 >= 0 && var97 >= 0 && var96 < (class69.field1139 * 2) && var97 < class69.field1139 * 2 && var99 >= 0 && var100 >= 0 && class255.field3763 * 2 > var99 && var100 < class255.field3763 * 2 && var102 != 65535) {
                    int var109 = var97 * 64;
                    int var110 = var104 << 0;
                    int var111 = var96 * 64;
                    int var112 = var108 << 0;
                    int var113 = var103 << 0;
                    int var114 = var100 * 64;
                    int var115 = var99 * 64;
                    class492 var116 = new class492(var102, class470.field6819, var111, var109, var113, class24.field349 + var105, class24.field349 + var106, var107, var112, var101, var110, var98);
                    var116.method2890(var114, (byte) -124, class224.method1515(var115, var114, class470.field6819, -631749433) - var110, var115, class24.field349 + var105);
                    class518.field7503.method866((byte) 10, new class241(var116));
                }
            } else if (class258.field3830 == arg0) {
                int var117 = class336.field4966.method3018(566990904);
                int var118 = class336.field4966.method3072((byte) -120);
                class277.field4139.method569((byte) 70, var117).method1690(0, var118);
            } else if (class512.field7448 == arg0) {
                int var119 = class336.field4966.method3072((byte) -122);
                int var120 = (var119 >> 4 & 0xF) + class444.field6328 * 2;
                int var121 = (var119 & 0xF) + class146.field2264 * 2;
                boolean var122 = class336.field4966.method3072((byte) -125) != 0;
                int var123 = var120 + class336.field4966.method3034((byte) -108);
                int var124 = var121 + class336.field4966.method3034((byte) 106);
                int var125 = class336.field4966.method3044((byte) -95);
                int var126 = class336.field4966.method3044((byte) -83);
                int var127 = class336.field4966.method3018(566990904);
                byte var128 = class336.field4966.method3034((byte) 85);
                int var129 = class336.field4966.method3072((byte) -120) * 4;
                int var130 = class336.field4966.method3018(566990904);
                int var131 = class336.field4966.method3018(566990904);
                int var132 = class336.field4966.method3072((byte) -126);
                int var133 = class336.field4966.method3018(566990904);
                if (var132 == 255) {
                    var132 = -1;
                }
                if (var120 >= 0 && var121 >= 0 && var120 < (class69.field1139 * 2) && class69.field1139 * 2 > var121 && var123 >= 0 && var124 >= 0 && class255.field3763 * 2 > var123 && var124 < (class255.field3763 * 2) && var127 != 65535) {
                    int var134 = var133 << 0;
                    int var135 = var121 * 64;
                    int var136 = var129 << 0;
                    int var137 = var128 << 0;
                    int var138 = var120 * 64;
                    int var139 = var124 * 64;
                    int var140 = var123 * 64;
                    if (var125 != 0) {
                        class23 var141 = null;
                        int var144;
                        if (var125 < 0) {
                            int var142 = -var125 - 1;
                            int var143 = var142 & 0x7FF;
                            var144 = (var142 & 0x7986) >> 11;
                            if (class497.field7188 == var143) {
                                var141 = class364.field5293;
                            } else {
                                var141 = class494.field7143[var143];
                            }
                        } else {
                            int var145 = var125 - 1;
                            var144 = var145 >> 11 & 0xF;
                            int var146 = var145 & 0x7FF;
                            class193 var147 = (class193) class390.field5539.method2284(true, (long) var146);
                            if (var147 != null) {
                                var141 = var147.field2805;
                            }
                        }
                        if (var141 != null) {
                            class236 var148 = var141.method139((byte) -67);
                            if (var148.field3529 != null && var148.field3529[var144] != null) {
                                int var149 = var148.field3529[var144][0];
                                int var150 = var148.field3529[var144][2];
                                int var151 = var141.field318.method650((byte) -6);
                                int var152 = class358.field5204[var151];
                                int var153 = class358.field5203[var151];
                                int var154 = var149 * var153 + var150 * var152 >> 15;
                                int var155 = var150 * var153 - var149 * var152 >> 15;
                                var138 += var154;
                                var135 += var155;
                                var137 -= var148.field3529[var144][1];
                            }
                        }
                    }
                    class492 var157 = new class492(var127, class470.field6819, var138, var135, var137, class24.field349 + var130, var131 - -class24.field349, var132, var134, var126, var136, var122);
                    var157.method2890(var139, (byte) -123, class224.method1515(var140, var139, class470.field6819, -631749433) - var136, var140, class24.field349 + var130);
                    class518.field7503.method866((byte) 10, new class241(var157));
                }
            } else if (class448.field6437 == arg0) {
                int var158 = class336.field4966.method3075(-89);
                int var159 = (var158 & 0x7) + class146.field2264;
                int var160 = class501.field7240 + var159;
                int var161 = ((var158 & 0x70) >> 4) + class444.field6328;
                int var162 = class82.field1315 + var161;
                int var163 = class336.field4966.method3064(-2);
                int var164 = class336.field4966.method3065((byte) -127);
                boolean var165 = var161 >= 0 && var159 >= 0 && class69.field1139 > var161 && class255.field3763 > var159;
                if (var165 || class327.method2070(class251.field3738, true)) {
                    class452.method2692(var162, new class413(var164, var163), var160, class470.field6819, 0);
                    if (var165) {
                        class543.method3186(var161, class470.field6819, false, var159);
                    }
                }
            } else if (class69.field1145 == arg0) {
                int var166 = class336.field4966.method3018(566990904);
                byte var167 = class336.field4966.method3026(-125);
                int var168 = class336.field4966.method3080(43);
                int var169 = class336.field4966.method3064(-2);
                int var170 = class336.field4966.method3060(-23438);
                int var171 = var170 >> 2;
                int var172 = var170 & 0x3;
                byte var173 = class336.field4966.method3026(-121);
                byte var174 = class336.field4966.method3026(-112);
                byte var175 = class336.field4966.method3026(-124);
                int var176 = class336.field4966.method3075(96);
                int var177 = class444.field6328 + (var176 >> 4 & 0x7);
                int var178 = (var176 & 0x7) + class146.field2264;
                int var179 = class336.field4966.method3081(24083);
                if (!class76.field1256.method189()) {
                    class486.method2862(var169, var172, var168, var166, var167, var174, var178, var177, class470.field6819, var175, var171, 57, var173, var179);
                }
            } else if (class356.field5181 == arg0) {
                int var180 = class336.field4966.method3018(566990904);
                int var181 = class336.field4966.method3075(125);
                int var182 = class146.field2264 + (var181 & 0x7);
                int var183 = class501.field7240 + var182;
                int var184 = class444.field6328 + (var181 >> 4 & 0x7);
                int var185 = class82.field1315 + var184;
                class203 var186 = (class203) class191.field2787.method2284(true, (long) (var185 | class470.field6819 << 28 | var183 << 14));
                if (var186 != null) {
                    for (class413 var187 = (class413) var186.field3128.method863(-1); var187 != null; var187 = (class413) var186.field3128.method865(-1)) {
                        if ((var180 & 0x7FFF) == var187.field5843) {
                            var187.method421(22071);
                            break;
                        }
                    }
                    if (var186.field3128.method854(33)) {
                        var186.method421(22071);
                    }
                    if (var184 >= 0 && var182 >= 0 && var184 < class69.field1139 && class255.field3763 > var182) {
                        class543.method3186(var184, class470.field6819, false, var182);
                    }
                }
            } else {
                class266.method1710((byte) 81, null, "T3 - " + arg0);
                class391.method2358(false, 90);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public static final void method531(boolean arg0) {
        class122[] var1 = class522.field7633;
        synchronized (class522.field7633) {
            int var2 = 0;
            if (arg0) {
                return;
            }
            while (true) {
                if (class522.field7633.length <= var2) {
                    break;
                }
                class522.field7633[var2] = new class122();
                class71.field1158[var2] = 0;
                var2++;
            }
        }
        field1117++;
    }
}
