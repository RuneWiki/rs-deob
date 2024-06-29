import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class48 {

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "[F")
    public float[] field658 = new float[4];

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "Z")
    public boolean field661 = false;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "Z")
    public boolean field684;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "Z")
    public boolean field651;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
    public int field678;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!hm", name = "I", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "[S")
    public short[] field674;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    private int field649;

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field654 = 0;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "F")
    public float field656;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "F")
    public float field664;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    private int field653;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    private int field655;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!hm", name = "y", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "I")
    private int field679;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "Lfn;")
    public class19 field650;

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "Lq;")
    public static class345 field667;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "[I")
    public static int[] field669;

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "[Lbf;")
    public static class58[] field675;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILog;I)Ljava/lang/String;", line = 7)
    public static final String method303(int arg0, class157 arg1, int arg2) {
        field677++;
        if (!client.method766(arg1).method2028((byte) 106, arg0) && arg1.field2564 == null) {
            return null;
        } else if (arg1.field2552 == null || arg1.field2552.length <= arg0 || arg1.field2552[arg0] == null || arg1.field2552[arg0].trim().length() == 0) {
            return class301.field4727 ? "Hidden-" + arg0 : null;
        } else {
            if (arg2 != -14575) {
                method310(-19, 27);
            }
            return arg1.field2552[arg0];
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 32)
    public static final void method304(int arg0) {
        field683++;
        if (class343.field5331 == 229) {
            int var149 = class247.field3898.method263(true);
            int var150 = (var149 & 0x7) + class49.field696;
            int var151 = ((var149 & 0x7B) >> 4) + class130.field2060;
            int var152 = class247.field3898.method226(-16384);
            int var153 = class247.field3898.method271(21081);
            int var154 = class247.field3898.method271(arg0 ^ 0xFAA4A1BD);
            if (var151 >= 0 && var150 >= 0 && var151 < 104 && var150 < 104 && class234.field3758 != var152) {
                class129 var155 = new class129();
                var155.field2021 = var154;
                var155.field2020 = var153;
                if (class108.field1593[class49.field698][var151][var150] == null) {
                    class108.field1593[class49.field698][var151][var150] = new class169();
                }
                class108.field1593[class49.field698][var151][var150].method1232(arg0 ^ 0xFAA4F3BD, new class185(var155));
                class240.method1723(1610612736, var150, var151);
            }
        } else if (class343.field5331 == 145) {
            int var147 = class247.field3898.method271(21081);
            int var148 = class247.field3898.method286((byte) -127);
            class69.method454(false, var147).method658(var148, false);
        } else if (class343.field5331 == 8) {
            int var138 = class247.field3898.method286((byte) -105);
            int var139 = (var138 >> 4 & 0x7) + class130.field2060;
            int var140 = (var138 & 0x7) + class49.field696;
            int var141 = class247.field3898.method271(21081);
            int var142 = class247.field3898.method271(21081);
            int var143 = class247.field3898.method271(arg0 ^ 0xFAA4A1BD);
            if (var139 >= 0 && var140 >= 0 && var139 < 104 && var140 < 104) {
                class169 var144 = class108.field1593[class49.field698][var139][var140];
                if (var144 != null) {
                    for (class185 var145 = (class185) var144.method1240(3); var145 != null; var145 = (class185) var144.method1235(false)) {
                        class129 var146 = var145.field3064;
                        if ((var141 & 0x7FFF) == var146.field2020 && var146.field2021 == var142) {
                            var146.field2021 = var143;
                            break;
                        }
                    }
                    class240.method1723(arg0 ^ 0x9AA4F3E4, var140, var139);
                }
            }
        } else if (class343.field5331 == 44) {
            int var120 = class247.field3898.method286((byte) -115);
            int var121 = (var120 >> 4 & 0x7) + class130.field2060;
            int var122 = (var120 & 0x7) + class49.field696;
            int var123 = var121 + class247.field3898.method246((byte) -43);
            int var124 = class247.field3898.method246((byte) -50) + var122;
            int var125 = class247.field3898.method228(true);
            int var126 = class247.field3898.method271(21081);
            int var127 = class247.field3898.method286((byte) -87) * 4;
            int var128 = class247.field3898.method286((byte) -86) * 4;
            int var129 = class247.field3898.method271(21081);
            int var130 = class247.field3898.method271(21081);
            int var131 = class247.field3898.method286((byte) -93);
            if (var131 == 255) {
                var131 = -1;
            }
            int var132 = class247.field3898.method286((byte) -74);
            if (var121 >= 0 && var122 >= 0 && var121 < 104 && var122 < 104 && var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104 && var126 != 65535) {
                int var133 = var123 * 128 + 64;
                int var134 = var124 * 128 + 64;
                int var135 = var122 * 128 + 64;
                int var136 = var121 * 128 + 64;
                class112 var137 = new class112(var126, class49.field698, var136, var135, class123.method889(1, class49.field698, var136, var135) - var127, class240.field3818 + var129, var130 + class240.field3818, var131, var132, var125, var128);
                var137.method781(class123.method889(1, class49.field698, var133, var134) - var128, -47, class240.field3818 + var129, var133, var134);
                class201.field3267.method1232(118, new class340(var137));
            }
        } else if (class343.field5331 == 82) {
            int var111 = class247.field3898.method286((byte) -80);
            int var112 = (var111 >> 4 & 0x7) + class130.field2060;
            int var113 = (var111 & 0x7) + class49.field696;
            int var114 = class247.field3898.method271(21081);
            int var115 = class247.field3898.method286((byte) -68);
            int var116 = class247.field3898.method271(arg0 + 89874037);
            if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                int var117 = var113 * 128 + 64;
                int var118 = var112 * 128 + 64;
                class81 var119 = new class81(var114, class49.field698, var118, var117, class123.method889(1, class49.field698, var118, var117) - var115, var116, class240.field3818);
                class45.field639.method1232(arg0 + 89853050, new class54(var119));
            }
        } else if (class343.field5331 == 254) {
            int var78 = class247.field3898.method286((byte) -84);
            int var79 = (var78 & 0xF) + class49.field696 * 2;
            int var80 = (var78 >> 4 & 0xF) + class130.field2060 * 2;
            int var81 = var80 + class247.field3898.method246((byte) -28);
            int var82 = var79 + class247.field3898.method246((byte) -22);
            int var83 = class247.field3898.method228(true);
            int var84 = class247.field3898.method228(true);
            int var85 = class247.field3898.method271(21081);
            int var86 = class247.field3898.method246((byte) -74);
            int var87 = class247.field3898.method286((byte) -77) * 4;
            int var88 = class247.field3898.method271(arg0 ^ 0xFAA4A1BD);
            int var89 = class247.field3898.method271(21081);
            int var90 = class247.field3898.method286((byte) -128);
            int var91 = class247.field3898.method286((byte) -100);
            if (var90 == 255) {
                var90 = -1;
            }
            if (var80 >= 0 && var79 >= 0 && var80 < 208 && var79 < 208 && var81 >= 0 && var82 >= 0 && var81 < 208 && var82 < 208 && var85 != 65535) {
                int var92 = var81 * 64;
                int var93 = var80 * 64;
                int var94 = var82 * 64;
                int var95 = var79 * 64;
                if (var83 != 0) {
                    int var98;
                    class263 var99;
                    if (var83 >= 0) {
                        int var96 = var83 - 1;
                        int var97 = var96 & 0x7FF;
                        var98 = var96 >> 11 & 0xF;
                        var99 = class99.field1445[var97];
                    } else {
                        int var100 = -var83 - 1;
                        int var101 = var100 & 0x7FF;
                        if (class234.field3758 == var101) {
                            var99 = class191.field3129;
                        } else {
                            var99 = class74.field1049[var101];
                        }
                        var98 = (var100 & 0x7D92) >> 11;
                    }
                    if (var99 != null) {
                        class17 var102 = var99.method1876((byte) 125);
                        if (var102.field225 != null && var102.field225[var98] != null) {
                            int var103 = var102.field225[var98][0];
                            int var104 = class170.field2801[var99.field4196];
                            int var105 = var102.field225[var98][2];
                            var86 -= var102.field225[var98][1];
                            int var106 = class170.field2810[var99.field4196];
                            int var107 = var103 * var106 + var104 * var105 >> 16;
                            int var108 = var105 * var106 - (var103 * var104) >> 16;
                            var95 += var108;
                            var93 += var107;
                        }
                    }
                }
                class112 var110 = new class112(var85, class49.field698, var93, var95, class123.method889(1, class49.field698, var93, var95) - var86, class240.field3818 + var88, class240.field3818 + var89, var90, var91, var84, var87);
                var110.method781(class123.method889(1, class49.field698, var92, var94) - var87, 47, var88 + class240.field3818, var92, var94);
                class201.field3267.method1232(99, new class340(var110));
            }
        } else if (class343.field5331 == 250) {
            int var1 = class247.field3898.method286((byte) -108);
            int var2 = var1 >> 2;
            int var3 = var1 & 0x3;
            int var4 = class209.field3437[var2];
            int var5 = class247.field3898.method286((byte) -122);
            int var6 = (var5 & 0x7) + class49.field696;
            int var7 = ((var5 & 0x78) >> 4) + class130.field2060;
            int var8 = class247.field3898.method271(21081);
            if (var7 >= 0 && var6 >= 0 && var7 < 104 && var6 < 104) {
                class76.method521(var4, -1, class49.field698, var6, var3, var7, var2, (byte) 89, 0, var8);
            }
        } else {
            if (class343.field5331 == 14) {
                int var9 = class247.field3898.method282((byte) -97);
                byte var10 = class247.field3898.method243(0);
                int var11 = class247.field3898.method271(21081);
                byte var12 = class247.field3898.method243(0);
                byte var13 = class247.field3898.method247((byte) -122);
                int var14 = class247.field3898.method263(true);
                int var15 = (var14 >> 4 & 0x7) + class130.field2060;
                int var16 = (var14 & 0x7) + class49.field696;
                byte var17 = class247.field3898.method247((byte) -122);
                int var18 = class247.field3898.method221((byte) -78);
                int var19 = var18 >> 2;
                int var20 = var18 & 0x3;
                int var21 = class247.field3898.method267((byte) -117);
                int var22 = class247.field3898.method228(true);
                if (!class232.field3690) {
                    class112.method782(var16, var9, var10, var20, var22, var13, var17, var21, var19, var11, var15, var12, (byte) -82);
                }
            }
            if (class343.field5331 == 88) {
                int var71 = class247.field3898.method263(true);
                int var72 = (var71 & 0x7) + class49.field696;
                int var73 = class130.field2060 + (var71 >> 4 & 0x7);
                int var74 = class247.field3898.method221((byte) -78);
                int var75 = var74 & 0x3;
                int var76 = var74 >> 2;
                int var77 = class209.field3437[var76];
                if (var73 >= 0 && var72 >= 0 && var73 < 104 && var72 < 104) {
                    class76.method521(var77, -1, class49.field698, var72, var75, var73, var76, (byte) 89, 0, -1);
                }
            } else if (class343.field5331 == 222) {
                int var61 = class247.field3898.method286((byte) -79);
                int var62 = (var61 >> 4 & 0x7) + class130.field2060;
                int var63 = (var61 & 0x7) + class49.field696;
                int var64 = class247.field3898.method271(arg0 ^ 0xFAA4A1BD);
                if (var64 == 65535) {
                    var64 = -1;
                }
                int var65 = class247.field3898.method286((byte) -97);
                int var66 = var65 & 0x7;
                int var67 = (var65 & 0xFD) >> 4;
                int var68 = class247.field3898.method286((byte) -95);
                int var69 = class247.field3898.method286((byte) -119);
                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                    int var70 = var67 + 1;
                    if (class191.field3129.field4248[0] >= (var62 - var70) && class191.field3129.field4248[0] <= var62 + var70 && class191.field3129.field4184[0] >= (var63 - var70) && class191.field3129.field4184[0] <= (var63 + var70) && class174.field2883 != 0 && var66 > 0 && class135.field2148 < 50 && var64 != -1) {
                        class193.field3153[class135.field2148] = var64;
                        class265.field4285[class135.field2148] = var66;
                        class105.field1541[class135.field2148] = var68;
                        class343.field5333[class135.field2148] = null;
                        class111.field1651[class135.field2148] = (var62 << 16) + (var63 << 8) + var67;
                        class8.field116[class135.field2148] = var69;
                        class135.field2148++;
                    }
                }
            } else {
                if (arg0 != -89852956) {
                    method309((byte) 99);
                }
                if (class343.field5331 == 101) {
                    int var55 = class247.field3898.method286((byte) -81);
                    int var56 = class49.field696 + (var55 & 0x7);
                    int var57 = class130.field2060 + (var55 >> 4 & 0x7);
                    int var58 = class247.field3898.method282((byte) -97);
                    int var59 = class247.field3898.method282((byte) -97);
                    if (var57 >= 0 && var56 >= 0 && var57 < 104 && var56 < 104) {
                        class129 var60 = new class129();
                        var60.field2021 = var59;
                        var60.field2020 = var58;
                        if (class108.field1593[class49.field698][var57][var56] == null) {
                            class108.field1593[class49.field698][var57][var56] = new class169();
                        }
                        class108.field1593[class49.field698][var57][var56].method1232(arg0 + 89853054, new class185(var60));
                        class240.method1723(1610612736, var56, var57);
                    }
                } else if (class343.field5331 == 225) {
                    int var23 = class247.field3898.method286((byte) -108);
                    int var24 = ((var23 & 0xF5) >> 4) + class130.field2060 * 2;
                    int var25 = (var23 & 0xF) + class49.field696 * 2;
                    int var26 = var24 + class247.field3898.method246((byte) -9);
                    int var27 = var25 + class247.field3898.method246((byte) -99);
                    int var28 = class247.field3898.method228(true);
                    int var29 = class247.field3898.method271(21081);
                    int var30 = class247.field3898.method286((byte) -70) * 4;
                    int var31 = class247.field3898.method286((byte) -91) * 4;
                    int var32 = class247.field3898.method271(21081);
                    int var33 = class247.field3898.method271(arg0 ^ 0xFAA4A1BD);
                    int var34 = class247.field3898.method286((byte) -109);
                    int var35 = class247.field3898.method286((byte) -116);
                    if (var34 == 255) {
                        var34 = -1;
                    }
                    if (var24 >= 0 && var25 >= 0 && var24 < 208 && var25 < 208 && var26 >= 0 && var27 >= 0 && var26 < 208 && var27 < 208 && var29 != 65535) {
                        int var36 = var27 * 64;
                        int var37 = var25 * 64;
                        int var38 = var26 * 64;
                        int var39 = var24 * 64;
                        class112 var40 = new class112(var29, class49.field698, var39, var37, class123.method889(1, class49.field698, var39, var37) - var30, class240.field3818 + var32, class240.field3818 + var33, var34, var35, var28, var31);
                        var40.method781(class123.method889(1, class49.field698, var38, var36) - var31, -109, class240.field3818 + var32, var38, var36);
                        class201.field3267.method1232(117, new class340(var40));
                    }
                } else if (class343.field5331 == 133) {
                    int var49 = class247.field3898.method286((byte) -84);
                    int var50 = (var49 >> 4 & 0x7) + class130.field2060;
                    int var51 = (var49 & 0x7) + class49.field696;
                    int var52 = class247.field3898.method271(arg0 + 89874037);
                    if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                        class169 var53 = class108.field1593[class49.field698][var50][var51];
                        if (var53 != null) {
                            for (class185 var54 = (class185) var53.method1240(3); var54 != null; var54 = (class185) var53.method1235(false)) {
                                if ((var52 & 0x7FFF) == var54.field3064.field2020) {
                                    var54.method1212((byte) 108);
                                    break;
                                }
                            }
                            if (var53.method1240(3) == null) {
                                class108.field1593[class49.field698][var50][var51] = null;
                            }
                            class240.method1723(1610612736, var51, var50);
                        }
                    }
                } else if (class343.field5331 == 218) {
                    int var41 = class247.field3898.method226(arg0 + 89836572);
                    if (var41 == 65535) {
                        var41 = -1;
                    }
                    int var42 = class247.field3898.method263(true);
                    int var43 = var42 >> 2;
                    int var44 = var42 & 0x3;
                    int var45 = class209.field3437[var43];
                    int var46 = class247.field3898.method263(true);
                    int var47 = (var46 >> 4 & 0x7) + class130.field2060;
                    int var48 = (var46 & 0x7) + class49.field696;
                    class78.method535(var47, var43, var48, var41, var44, class49.field698, (byte) -97, var45);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZC)Z", line = 630)
    public static final boolean method305(boolean arg0, char arg1) {
        field685++;
        if (!arg0) {
            field680 = -7;
        }
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)V", line = 641)
    private final void method306(int arg0) {
        field670++;
        if (arg0 != 2048) {
            method304(72);
        }
        int var2 = this.field681;
        if (var2 == 2) {
            this.field655 = 0;
            this.field679 = 2048;
            this.field653 = 2048;
            this.field652 = 1;
        } else if (var2 == 3) {
            this.field652 = 1;
            this.field653 = 4096;
            this.field679 = 2048;
            this.field655 = 0;
        } else if (var2 == 4) {
            this.field655 = 0;
            this.field679 = 2048;
            this.field652 = 4;
            this.field653 = 2048;
        } else if (var2 == 5) {
            this.field655 = 0;
            this.field653 = 8192;
            this.field679 = 2048;
            this.field652 = 4;
        } else if (var2 == 12) {
            this.field653 = 2048;
            this.field679 = 2048;
            this.field652 = 2;
            this.field655 = 0;
        } else if (var2 == 13) {
            this.field679 = 2048;
            this.field653 = 8192;
            this.field652 = 2;
            this.field655 = 0;
        } else if (var2 == 10) {
            this.field653 = 2048;
            this.field652 = 3;
            this.field655 = 1536;
            this.field679 = 512;
        } else if (var2 == 11) {
            this.field653 = 4096;
            this.field652 = 3;
            this.field655 = 1536;
            this.field679 = 512;
        } else if (var2 == 6) {
            this.field653 = 2048;
            this.field679 = 768;
            this.field652 = 3;
            this.field655 = 1280;
        } else if (var2 == 7) {
            this.field652 = 3;
            this.field653 = 4096;
            this.field655 = 1280;
            this.field679 = 768;
        } else if (var2 == 8) {
            this.field655 = 1024;
            this.field679 = 1024;
            this.field652 = 3;
            this.field653 = 2048;
        } else if (var2 == 9) {
            this.field652 = 3;
            this.field679 = 1024;
            this.field653 = 4096;
            this.field655 = 1024;
        } else if (var2 == 14) {
            this.field653 = 2048;
            this.field655 = 1280;
            this.field652 = 1;
            this.field679 = 768;
        } else if (var2 == 15) {
            this.field679 = 512;
            this.field652 = 1;
            this.field653 = 4096;
            this.field655 = 1536;
        } else if (var2 == 16) {
            this.field652 = 1;
            this.field655 = 1792;
            this.field653 = 8192;
            this.field679 = 256;
        } else {
            this.field653 = 2048;
            this.field655 = 0;
            this.field679 = 2048;
            this.field652 = 0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZII)V", line = 847)
    public final void method307(boolean arg0, int arg1, int arg2) {
        int var4 = this.field649 + (this.field653 * arg1 / 50) & 0x7FF;
        field672++;
        int var5 = this.field652;
        int var6;
        if (var5 == 1) {
            var6 = (class170.field2801[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class62.field913[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 >= 1024 ? 2048 - var4 : var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field664 = (float) ((this.field679 * var6 >> 11) + this.field655) / 2048.0F;
        float var7 = this.field664 / 255.0F;
        if (arg2 >= -40) {
            method309((byte) 93);
        }
        this.field658[1] = (float) client.method767(255, this.field662 >> 8) * var7;
        this.field658[2] = (float) client.method767(255, this.field662) * var7;
        this.field658[0] = var7 * (float) (client.method767(16724567, this.field662) >> 16);
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 927)
    public static final void method308(int arg0) {
        if (class44.field585 > 1) {
            class44.field585--;
            class201.field3266 = class186.field3074;
        }
        field660++;
        if (class103.field1511 > 0) {
            class103.field1511--;
        }
        if (class296.field4689) {
            class296.field4689 = false;
            class113.method787(500);
            return;
        }
        for (int var1 = 0; var1 < 100 && class18.method99((byte) -98); var1++) {
        }
        if (class5.field75 != 30) {
            return;
        }
        class325.method2277((byte) 2, 107, class194.field3175);
        Object var2 = class181.field3002.field3085;
        synchronized (class181.field3002.field3085) {
            if (!class126.field1970) {
                class181.field3002.field3087 = 0;
            } else if (class160.field2642 != 0 || class181.field3002.field3087 >= 40) {
                class115.field1743++;
                class194.field3175.method2375(93, 0);
                class194.field3175.method257(-2, 0);
                int var3 = class194.field3175.field586;
                int var4 = 0;
                for (int var5 = 0; var5 < class181.field3002.field3087 && (class194.field3175.field586 - var3) < 240; var5++) {
                    var4++;
                    int var6 = class181.field3002.field3089[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class181.field3002.field3088[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class181.field3002.field3089[var5] == -1 && class181.field3002.field3088[var5] == -1) {
                        var6 = -1;
                        var7 = true;
                        var8 = -1;
                    }
                    if (class7.field104 != var8 || class260.field4162 != var6) {
                        int var9 = var8 - class7.field104;
                        int var10 = var6 - class260.field4162;
                        class7.field104 = var8;
                        class260.field4162 = var6;
                        if (class15.field177 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class194.field3175.method287(0, (class15.field177 << 12) + (var9 << 6) + var10);
                            class15.field177 = 0;
                        } else if (class15.field177 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class194.field3175.method257(-2, class15.field177 + 128);
                            var10 += 128;
                            var9 += 128;
                            class194.field3175.method287(arg0, (var9 << 8) + var10);
                            class15.field177 = 0;
                        } else if (class15.field177 >= 32) {
                            class194.field3175.method287(0, class15.field177 + 57344);
                            if (var7) {
                                class194.field3175.method283((byte) -51, Integer.MIN_VALUE);
                            } else {
                                class194.field3175.method283((byte) -51, var6 << 16 | var8);
                            }
                            class15.field177 = 0;
                        } else {
                            class194.field3175.method257(-2, class15.field177 + 192);
                            if (var7) {
                                class194.field3175.method283((byte) -51, Integer.MIN_VALUE);
                            } else {
                                class194.field3175.method283((byte) -51, var8 | var6 << 16);
                            }
                            class15.field177 = 0;
                        }
                    } else if (class15.field177 < 2047) {
                        class15.field177++;
                    }
                }
                class194.field3175.method251(class194.field3175.field586 - var3, false);
                if (class181.field3002.field3087 > var4) {
                    class181.field3002.field3087 -= var4;
                    for (int var11 = 0; var11 < class181.field3002.field3087; var11++) {
                        class181.field3002.field3088[var11] = class181.field3002.field3088[var4 + var11];
                        class181.field3002.field3089[var11] = class181.field3002.field3089[var4 + var11];
                    }
                } else {
                    class181.field3002.field3087 = 0;
                }
            }
        }
        if (class160.field2642 != 0) {
            long var13 = (class226.field3608 - class137.field2161) / 50L;
            class137.field2161 = class226.field3608;
            field673++;
            int var15 = class105.field1542;
            int var16 = class198.field3221;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            if (var13 > 32767L) {
                var13 = 32767L;
            }
            byte var17 = 0;
            if (class160.field2642 == 2) {
                var17 = 1;
            }
            class194.field3175.method2375(167, 0);
            class194.field3175.method284(var15 | var16 << 16, -128);
            int var18 = (int) var13;
            class194.field3175.method264(var17 << 15 | var18, true);
        }
        if (class53.field747 > 0) {
            class53.field747--;
        }
        if (class33.field444 && class53.field747 <= 0) {
            class60.field841++;
            class33.field444 = false;
            class53.field747 = 20;
            class194.field3175.method2375(119, arg0);
            class194.field3175.method264((int) class330.field5090, true);
            class194.field3175.method253((int) class97.field1386, 108);
        }
        if (class101.field1469 && !class191.field3121) {
            class185.field3069++;
            class191.field3121 = true;
            class194.field3175.method2375(39, 0);
            class194.field3175.method257(-2, 1);
        }
        if (!class101.field1469 && class191.field3121) {
            class185.field3069++;
            class191.field3121 = false;
            class194.field3175.method2375(39, 0);
            class194.field3175.method257(arg0 - 2, 0);
        }
        if (!class316.field4888) {
            class194.field3175.method2375(208, arg0);
            class229.field3633++;
            class194.field3175.method284(class24.method131(-1287809744), -126);
            class316.field4888 = true;
        }
        if (class303.field4756) {
            class303.field4756 = false;
        } else {
            class201.field3276 /= 2.0F;
        }
        if (class8.field124) {
            class8.field124 = false;
        } else {
            class64.field931 /= 2.0F;
        }
        class281.method2034(arg0 ^ 0x0);
        if (class5.field75 != 30) {
            return;
        }
        class78.method534(15141);
        class116.method798(arg0 ^ 0x2D90);
        class142.method1049((byte) 71);
        class321.field4975++;
        if (class321.field4975 > 750) {
            class113.method787(arg0 ^ 0x1F4);
            return;
        }
        class29.method165((byte) 34);
        class286.method2056(arg0 ^ 0xFFFFFFAC);
        class338.method2354(arg0 ^ 0x7FF);
        if (class127.field1989 != null) {
            class166.method1220(false);
        }
        for (int var19 = class323.method2261(true, 111); var19 != -1; var19 = class323.method2261(false, arg0 ^ 0x66)) {
            class233.method1690(var19, (byte) 118);
            class273.field4411[client.method767(class281.field4528++, 31)] = var19;
        }
        for (class344 var20 = class147.method1082(0); var20 != null; var20 = class147.method1082(0)) {
            int var21 = var20.method2385(-38);
            int var22 = var20.method2382(0);
            if (var21 == 1) {
                class76.field1066[var22] = var20.field5354;
                class34.field468[client.method767(class335.field5243++, 31)] = var22;
            } else if (var21 == 2) {
                class335.field5236[var22] = var20.field5352;
                class256.field4072[client.method767(31, class265.field4286++)] = var22;
            } else if (var21 == 3) {
                class157 var43 = class142.method1053(var22, 65535);
                if (!var20.field5352.equals(var43.field2493)) {
                    var43.field2493 = var20.field5352;
                    class320.method2252(var43, 0);
                }
            } else if (var21 == 4) {
                class157 var39 = class142.method1053(var22, 65535);
                int var40 = var20.field5354;
                int var41 = var20.field5344;
                int var42 = var20.field5349;
                if (var39.field2516 != var40 || var39.field2455 != var42 || var39.field2465 != var41) {
                    var39.field2465 = var41;
                    var39.field2516 = var40;
                    var39.field2455 = var42;
                    class320.method2252(var39, 0);
                }
            } else if (var21 == 5) {
                class157 var38 = class142.method1053(var22, arg0 ^ 0xFFFF);
                if (var20.field5354 != var38.field2581 || var20.field5354 == -1) {
                    var38.field2497 = 0;
                    var38.field2584 = 1;
                    var38.field2476 = 0;
                    var38.field2581 = var20.field5354;
                    class320.method2252(var38, 0);
                }
            } else if (var21 == 6) {
                int var23 = var20.field5354;
                int var24 = (var23 & 0x3FA) >> 5;
                int var25 = (var23 & 0x7CDA) >> 10;
                int var26 = var23 & 0x1F;
                int var27 = (var26 << 3) + ((var25 << 19) + (var24 << 11));
                class157 var28 = class142.method1053(var22, arg0 ^ 0xFFFF);
                if (var28.field2436 != var27) {
                    var28.field2436 = var27;
                    class320.method2252(var28, 0);
                }
            } else if (var21 == 7) {
                class157 var36 = class142.method1053(var22, 65535);
                boolean var37 = var20.field5354 == 1;
                if (var37 != var36.field2592) {
                    var36.field2592 = var37;
                    class320.method2252(var36, arg0 ^ 0x0);
                }
            } else if (var21 == 8) {
                class157 var35 = class142.method1053(var22, 65535);
                if (var20.field5354 != var35.field2492 || var20.field5349 != var35.field2574 || var20.field5344 != var35.field2449) {
                    var35.field2492 = var20.field5354;
                    var35.field2449 = var20.field5344;
                    if (var35.field2487 != -1) {
                        if (var35.field2464 > 0) {
                            var35.field2449 = var35.field2449 * 32 / var35.field2464;
                        } else if (var35.field2428 > 0) {
                            var35.field2449 = var35.field2449 * 32 / var35.field2428;
                        }
                    }
                    var35.field2574 = var20.field5349;
                    class320.method2252(var35, 0);
                }
            } else if (var21 == 9) {
                class157 var34 = class142.method1053(var22, 65535);
                if (var20.field5354 != var34.field2487 || var20.field5349 != var34.field2593) {
                    var34.field2487 = var20.field5354;
                    var34.field2593 = var20.field5349;
                    class320.method2252(var34, 0);
                }
            } else if (var21 == 10) {
                class157 var33 = class142.method1053(var22, arg0 + 65535);
                if (var20.field5354 != var33.field2578 || var20.field5349 != var33.field2435 || var20.field5344 != var33.field2602) {
                    var33.field2602 = var20.field5344;
                    var33.field2578 = var20.field5354;
                    var33.field2435 = var20.field5349;
                    class320.method2252(var33, 0);
                }
            } else if (var21 == 11) {
                class157 var29 = class142.method1053(var22, arg0 ^ 0xFFFF);
                var29.field2517 = var29.field2469 = var20.field5349;
                var29.field2519 = var29.field2461 = var20.field5354;
                var29.field2431 = 0;
                var29.field2560 = 0;
                class320.method2252(var29, 0);
            } else if (var21 == 12) {
                class157 var31 = class142.method1053(var22, 65535);
                int var32 = var20.field5354;
                if (var31 != null && var31.field2478 == 0) {
                    if ((var31.field2528 - var31.field2520) < var32) {
                        var32 = var31.field2528 - var31.field2520;
                    }
                    if (var32 < 0) {
                        var32 = 0;
                    }
                    if (var31.field2591 != var32) {
                        var31.field2591 = var32;
                        class320.method2252(var31, 0);
                    }
                }
            } else if (var21 == 13) {
                class157 var30 = class142.method1053(var22, 65535);
                var30.field2604 = var20.field5354;
            }
        }
        if (class179.field2976 != 0) {
            class247.field3900 += 20;
            if (class247.field3900 >= 400) {
                class179.field2976 = 0;
            }
        }
        class36.field477++;
        if (class103.field1498 != null) {
            class146.field2273++;
            if (class146.field2273 >= 15) {
                class320.method2252(class103.field1498, 0);
                class103.field1498 = null;
            }
        }
        if (class279.field4504 != null) {
            class320.method2252(class279.field4504, 0);
            if (class70.field995 > class208.field3415 + 5 || class208.field3415 - 5 > class70.field995 || class233.field3738 > class113.field1718 + 5 || class233.field3738 < (class113.field1718 - 5)) {
                class256.field4122 = true;
            }
            class335.field5247++;
            if (class99.field1446 == 0) {
                if (class256.field4122 && class335.field5247 >= 5) {
                    if (class279.field4504 == class211.field3461 && class284.field4548 != class175.field2909) {
                        class54.field763++;
                        class157 var44 = class279.field4504;
                        byte var45 = 0;
                        if (class105.field1547 == 1 && var44.field2467 == 206) {
                            var45 = 1;
                        }
                        if (var44.field2483[class284.field4548] <= 0) {
                            var45 = 0;
                        }
                        if (client.method766(var44).method2018(17065)) {
                            int var48 = class175.field2909;
                            int var49 = class284.field4548;
                            var44.field2483[var49] = var44.field2483[var48];
                            var44.field2542[var49] = var44.field2542[var48];
                            var44.field2483[var48] = -1;
                            var44.field2542[var48] = 0;
                        } else if (var45 == 1) {
                            int var46 = class284.field4548;
                            int var47 = class175.field2909;
                            while (var46 != var47) {
                                if (var47 > var46) {
                                    var44.method1125(var47 - 1, var47, 19009);
                                    var47--;
                                } else if (var46 > var47) {
                                    var44.method1125(var47 + 1, var47, 19009);
                                    var47++;
                                }
                            }
                        } else {
                            var44.method1125(class284.field4548, class175.field2909, 19009);
                        }
                        class194.field3175.method2375(203, 0);
                        class194.field3175.method274(var45, arg0 ^ 0x64);
                        class194.field3175.method264(class284.field4548, true);
                        class194.field3175.method253(class175.field2909, 45);
                        class194.field3175.method270(arg0 ^ 0x8, class279.field4504.field2486);
                    }
                } else if ((class113.field1731 == 1 || class207.method1501(-1, class185.field3070 - 1)) && class185.field3070 > 2) {
                    class116.method797(15);
                } else if (class185.field3070 > 0) {
                    class198.method1457(0);
                }
                class160.field2642 = 0;
                class279.field4504 = null;
                class146.field2273 = 10;
            }
        }
        class240.field3805 = null;
        class157 var50 = class256.field4101;
        class31.field424 = false;
        class210.field3446 = false;
        class256.field4101 = null;
        class157 var51 = class52.field742;
        class52.field742 = null;
        for (class43.field545 = 0; class212.method1531((byte) -81) && class43.field545 < 128; class43.field545++) {
            class26.field360[class43.field545] = class176.field2933;
            class246.field3887[class43.field545] = class54.field767;
        }
        class127.field1989 = null;
        if (~class147.field2287 != arg0) {
            class97.method651(class133.field2095, 0, 0, 0, 0, (byte) -7, class20.field276, class147.field2287);
        }
        class186.field3074++;
        while (true) {
            class39 var52;
            class157 var53;
            class157 var54;
            do {
                var52 = (class39) class98.field1392.method1234((byte) 75);
                if (var52 == null) {
                    while (true) {
                        class39 var55;
                        class157 var56;
                        class157 var57;
                        do {
                            var55 = (class39) class271.field4375.method1234((byte) 127);
                            if (var55 == null) {
                                while (true) {
                                    class39 var58;
                                    class157 var59;
                                    class157 var60;
                                    do {
                                        var58 = (class39) class126.field1957.method1234((byte) 44);
                                        if (var58 == null) {
                                            if (class127.field1989 == null) {
                                                class91.field1260 = 0;
                                            }
                                            if (class307.field4783 != null) {
                                                class105.method717((byte) -106);
                                            }
                                            if (class341.field5311 > 0 && class117.field1770[82] && class117.field1770[81] && class34.field452 != 0) {
                                                int var61 = class49.field698 - class34.field452;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class11.method58(var61, class191.field3129.field4248[0] + class70.field989, class191.field3129.field4184[0] + class205.field3367, -32586);
                                            }
                                            if (class341.field5311 > 0 && class117.field1770[82] && class117.field1770[81]) {
                                                if (class291.field4650 != -1) {
                                                    class11.method58(class49.field698, class70.field989 + class291.field4650, class205.field3367 - -class263.field4213, -32586);
                                                }
                                                class129.field2015 = 0;
                                                class147.field2289 = 0;
                                            } else if (class147.field2289 == 2) {
                                                if (class291.field4650 != -1) {
                                                    class194.field3175.method2375(135, arg0 ^ 0x0);
                                                    class194.field3175.method266(class70.field989 + class291.field4650, false);
                                                    class194.field3175.method253(class182.field3013, 76);
                                                    class194.field3175.method283((byte) -51, class311.field4851);
                                                    class176.field2935++;
                                                    class194.field3175.method253(class263.field4213 + class205.field3367, 45);
                                                    class247.field3900 = 0;
                                                    class179.field2976 = 1;
                                                    class334.field5195 = class198.field3221;
                                                    class21.field304 = class105.field1542;
                                                }
                                                class147.field2289 = 0;
                                            } else if (class129.field2015 == 2) {
                                                if (class291.field4650 != -1) {
                                                    class194.field3175.method2375(166, 0);
                                                    class212.field3465++;
                                                    class194.field3175.method253(class263.field4213 + class205.field3367, arg0 ^ 0x60);
                                                    class194.field3175.method266(class70.field989 + class291.field4650, false);
                                                    class334.field5195 = class198.field3221;
                                                    class21.field304 = class105.field1542;
                                                    class179.field2976 = 1;
                                                    class247.field3900 = 0;
                                                }
                                                class129.field2015 = 0;
                                            } else if (class291.field4650 != -1 && class147.field2289 == 0 && class129.field2015 == 0) {
                                                class112.method779(0, (class291.field4650 << 1) - (class191.field3129.method1881(-20395) - 1) >> 1, (class263.field4213 << 1) + 1 - class191.field3129.method1881(-20395) >> 1, (byte) -119);
                                                class247.field3900 = 0;
                                                class21.field304 = class105.field1542;
                                                class334.field5195 = class198.field3221;
                                                class179.field2976 = 1;
                                            }
                                            class291.field4650 = -1;
                                            class131.method966(-128);
                                            if (class256.field4101 != var50) {
                                                if (var50 != null) {
                                                    class320.method2252(var50, 0);
                                                }
                                                if (class256.field4101 != null) {
                                                    class320.method2252(class256.field4101, arg0);
                                                }
                                            }
                                            if (class52.field742 != var51 && class7.field108 == class131.field2072) {
                                                if (var51 != null) {
                                                    class320.method2252(var51, 0);
                                                }
                                                if (class52.field742 != null) {
                                                    class320.method2252(class52.field742, arg0);
                                                }
                                            }
                                            if (class52.field742 == null) {
                                                if (class131.field2072 > 0) {
                                                    class131.field2072--;
                                                }
                                            } else if (class131.field2072 < class7.field108) {
                                                class131.field2072++;
                                                if (class7.field108 == class131.field2072) {
                                                    class320.method2252(class52.field742, 0);
                                                }
                                            }
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class270.field4357[var62]++;
                                            }
                                            int var63 = class174.method1308(1);
                                            int var64 = class319.method2246(arg0 ^ 0x2);
                                            if (var63 > 15000 && var64 > 15000) {
                                                class103.field1511 = 250;
                                                class150.method1096(14500, -1264641594);
                                                class23.field323++;
                                                class194.field3175.method2375(60, 0);
                                            }
                                            if (class4.field72 != null && class4.field72.field2661 == 1) {
                                                if (class4.field72.field2664 != null) {
                                                    class110.method763(class315.field4873, -20206, class208.field3419);
                                                }
                                                class315.field4873 = null;
                                                class4.field72 = null;
                                                class208.field3419 = false;
                                            }
                                            class298.field4700++;
                                            class106.field1574++;
                                            class17.field216++;
                                            if (class17.field216 > 500) {
                                                class17.field216 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x2) == 2) {
                                                    class103.field1508 += class252.field4027;
                                                }
                                                if ((var65 & 0x4) == 4) {
                                                    class150.field2324 += class23.field318;
                                                }
                                                if ((var65 & 0x1) == 1) {
                                                    class113.field1732 += class278.field4472;
                                                }
                                            }
                                            if (class113.field1732 < -50) {
                                                class278.field4472 = 2;
                                            }
                                            if (class150.field2324 < -40) {
                                                class23.field318 = 1;
                                            }
                                            if (class106.field1574 > 500) {
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x1) == 1) {
                                                    class69.field983 += class252.field4026;
                                                }
                                                class106.field1574 = 0;
                                                if ((var66 & 0x2) == 2) {
                                                    class320.field4963 += class93.field1271;
                                                }
                                            }
                                            if (class113.field1732 > 50) {
                                                class278.field4472 = -2;
                                            }
                                            if (class150.field2324 > 40) {
                                                class23.field318 = -1;
                                            }
                                            if (class69.field983 < -60) {
                                                class252.field4026 = 2;
                                            }
                                            if (class69.field983 > 60) {
                                                class252.field4026 = -2;
                                            }
                                            if (class103.field1508 < -55) {
                                                class252.field4027 = 2;
                                            }
                                            if (class103.field1508 > 55) {
                                                class252.field4027 = -2;
                                            }
                                            if (class320.field4963 < -20) {
                                                class93.field1271 = 1;
                                            }
                                            if (class320.field4963 > 10) {
                                                class93.field1271 = -1;
                                            }
                                            if (class298.field4700 > 50) {
                                                class194.field3175.method2375(183, 0);
                                                class322.field4997++;
                                            }
                                            if (class236.field3767) {
                                                class338.method2356(85);
                                                class236.field3767 = false;
                                            }
                                            try {
                                                if (class320.field4966 != null && class194.field3175.field586 > 0) {
                                                    class320.field4966.method85((byte) -101, class194.field3175.field586, class194.field3175.field573, 0);
                                                    class194.field3175.field586 = 0;
                                                    class298.field4700 = 0;
                                                }
                                            } catch (IOException var68) {
                                                class113.method787(arg0 + 500);
                                            }
                                            return;
                                        }
                                        var59 = var58.field500;
                                        if (var59.field2482 < 0) {
                                            break;
                                        }
                                        var60 = class142.method1053(var59.field2463, 65535);
                                    } while (var60 == null || var60.field2472 == null || var59.field2482 >= var60.field2472.length || var60.field2472[var59.field2482] != var59);
                                    class144.method1065(var58, (byte) 67);
                                }
                            }
                            var56 = var55.field500;
                            if (var56.field2482 < 0) {
                                break;
                            }
                            var57 = class142.method1053(var56.field2463, 65535);
                        } while (var57 == null || var57.field2472 == null || var57.field2472.length <= var56.field2482 || var57.field2472[var56.field2482] != var56);
                        class144.method1065(var55, (byte) 67);
                    }
                }
                var53 = var52.field500;
                if (var53.field2482 < 0) {
                    break;
                }
                var54 = class142.method1053(var53.field2463, arg0 + 65535);
            } while (var54 == null || var54.field2472 == null || var54.field2472.length <= var53.field2482 || var54.field2472[var53.field2482] != var53);
            class144.method1065(var52, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 1923)
    public static void method309(byte arg0) {
        field669 = null;
        field675 = null;
        field667 = null;
        if (arg0 > -120) {
            field654 = 68;
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V", line = 2087)
    protected class48() {
        if (class62.field913 == null) {
            class85.method576(-117);
        }
        this.method306(2048);
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Ljj;)V", line = 2102)
    public class48(class44 arg0) {
        if (class62.field913 == null) {
            class85.method576(-93);
        }
        this.field666 = arg0.method286((byte) -76);
        this.field684 = (this.field666 & 0x8) != 0;
        this.field651 = (this.field666 & 0x10) != 0;
        this.field666 &= 0x7;
        this.field678 = arg0.method271(21081);
        this.field657 = arg0.method271(21081);
        this.field682 = arg0.method271(21081);
        this.field665 = arg0.method286((byte) -113);
        this.method313((byte) 7);
        this.field674 = new short[this.field665 * 2 + 1];
        for (int var2 = 0; var2 < this.field674.length; var2++) {
            this.field674[var2] = (short) arg0.method271(21081);
        }
        this.field662 = class170.field2812[arg0.method271(21081)];
        int var3 = arg0.method286((byte) -64);
        this.field649 = (var3 & 0xE0) << 3;
        this.field681 = var3 & 0x1F;
        if (this.field681 != 31) {
            this.method306(2048);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V", line = 1947)
    public static final void method310(int arg0, int arg1) {
        class303.field4754.method708(arg1, true);
        field663++;
        if (arg0 >= 97) {
            class83.field1170.method708(arg1, true);
            class195.field3188.method708(arg1, true);
            class169.field2799.method708(arg1, true);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZ)V", line = 1964)
    public static final void method311(int arg0, boolean arg1) {
        int var2 = -38 % ((67 - arg0) / 47);
        for (class155 var3 = (class155) class240.field3813.method1240(3); var3 != null; var3 = (class155) class240.field3813.method1235(false)) {
            if (var3.field2375 != null) {
                class191.field3127.method118(var3.field2375);
                var3.field2375 = null;
            }
            if (var3.field2399 != null) {
                class191.field3127.method118(var3.field2399);
                var3.field2399 = null;
            }
            var3.method1212((byte) 123);
        }
        field659++;
        if (!arg1) {
            return;
        }
        for (class155 var4 = (class155) class229.field3636.method1240(3); var4 != null; var4 = (class155) class229.field3636.method1235(false)) {
            if (var4.field2375 != null) {
                class191.field3127.method118(var4.field2375);
                var4.field2375 = null;
            }
            var4.method1212((byte) 77);
        }
        for (class155 var5 = (class155) class77.field1091.method458((byte) -16); var5 != null; var5 = (class155) class77.field1091.method455((byte) -82)) {
            if (var5.field2375 != null) {
                class191.field3127.method118(var5.field2375);
                var5.field2375 = null;
            }
            var5.method1212((byte) 81);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLjj;)Lph;", line = 2032)
    public static final class159 method312(byte arg0, class44 arg1) {
        if (arg0 >= -85) {
            method310(102, 77);
        }
        field676++;
        return new class159(arg1.method228(true), arg1.method228(true), arg1.method228(true), arg1.method228(true), arg1.method228(true), arg1.method228(true), arg1.method228(true), arg1.method228(true), arg1.method273(-867673064), arg1.method286((byte) -64));
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V", line = 2045)
    private final void method313(byte arg0) {
        if (arg0 == 7) {
            int var2 = (this.field665 << 7) + 64;
            this.field656 = 1.0F / (float) (var2 * var2);
            field668++;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIII)V", line = 2059)
    public final void method314(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field652 = arg3;
        this.field653 = arg4;
        field671++;
        this.field655 = arg1;
        if (arg0 != 222) {
            this.field661 = false;
        }
        this.field679 = arg2;
    }
}
