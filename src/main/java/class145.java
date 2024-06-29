import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class145 {

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public int field2100 = -1;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "[I")
    private int[] field2103 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!df", name = "v", descriptor = "Z")
    public boolean field2113 = false;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field2097 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2092 = 0;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2095 = 1;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[I")
    private int[] field2098;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[S")
    private short[] field2096;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "[S")
    private short[] field2102;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "[S")
    private short[] field2105;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "[S")
    private short[] field2111;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)Z")
    public static final boolean method988(int arg0) {
        field2107++;
        if (class287.field4391 == 0) {
            if (arg0 <= 117) {
                method988(39);
            }
            return class148.field2151.method1397((byte) 97);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)Z")
    public final boolean method989(byte arg0) {
        field2093++;
        if (this.field2098 == null) {
            return true;
        }
        if (arg0 < 73) {
            method992(-45, 124, -57, -25, -47);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2098.length; var3++) {
            if (!class199.field2994.method1609(false, this.field2098[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lca;II)V")
    private final void method990(class54 arg0, int arg1, int arg2) {
        field2106++;
        if (arg1 != 1359773444) {
            this.field2105 = null;
        }
        if (arg2 == 1) {
            this.field2100 = arg0.method407(arg1 ^ 0x510C7FFB);
        } else if (arg2 == 2) {
            int var8 = arg0.method407(255);
            this.field2098 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2098[var9] = arg0.method423(60);
            }
        } else if (arg2 == 3) {
            this.field2113 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method407(255);
            this.field2105 = new short[var4];
            this.field2102 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2102[var5] = (short) arg0.method423(-110);
                this.field2105[var5] = (short) arg0.method423(-127);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method407(255);
            this.field2096 = new short[var6];
            this.field2111 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2111[var7] = (short) arg0.method423(-118);
                this.field2096[var7] = (short) arg0.method423(class226.method1551(arg1, -1359773531));
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2103[arg2 - 60] = arg0.method423(118);
            return;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Z")
    public final boolean method991(int arg0) {
        boolean var2 = true;
        field2094++;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field2103[var3] != -1 && !class199.field2994.method1609(false, this.field2103[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIII)I")
    public static final int method992(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2104++;
        if (arg2 >= -41) {
            field2097 = 12;
        }
        int var5 = 65536 - class119.field1776[arg0 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg4 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V")
    public static final void method993(byte arg0) {
        field2114++;
        if (class199.field3000 == 254) {
            int var1 = class173.field2543.method407(255);
            int var2 = (var1 & 0xF) + class272.field4225 * 2;
            int var3 = ((var1 & 0xF2) >> 4) + class29.field537 * 2;
            int var4 = var3 + class173.field2543.method459(false);
            int var5 = class173.field2543.method459(false) + var2;
            int var6 = class173.field2543.method457((byte) 80);
            int var7 = class173.field2543.method457((byte) 50);
            int var8 = class173.field2543.method423(arg0 - 19);
            int var9 = class173.field2543.method459(false);
            int var10 = class173.field2543.method407(arg0 ^ 0xC1) * 4;
            int var11 = class173.field2543.method423(126);
            int var12 = class173.field2543.method423(arg0 ^ 0xFFFFFF8E);
            int var13 = class173.field2543.method407(255);
            if (var13 == 255) {
                var13 = -1;
            }
            int var14 = class173.field2543.method407(255);
            if (var3 >= 0 && var2 >= 0 && var3 < 208 && var2 < 208 && var4 >= 0 && var5 >= 0 && var4 < 208 && var5 < 208 && var8 != 65535) {
                int var15 = var4 * 64;
                int var16 = var3 * 64;
                int var17 = var5 * 64;
                int var18 = var2 * 64;
                if (var6 != 0) {
                    int var21;
                    class25 var22;
                    if (var6 >= 0) {
                        int var19 = var6 - 1;
                        int var20 = var19 & 0x7FF;
                        var21 = var19 >> 11 & 0xF;
                        var22 = class243.field3762[var20];
                    } else {
                        int var23 = -var6 - 1;
                        var21 = var23 >> 11 & 0xF;
                        int var24 = var23 & 0x7FF;
                        if (class138.field1996 == var24) {
                            var22 = class185.field2687;
                        } else {
                            var22 = class166.field2438[var24];
                        }
                    }
                    if (var22 != null) {
                        class110 var25 = var22.method165((byte) -118);
                        if (var25.field1659 != null && var25.field1659[var21] != null) {
                            int var26 = var25.field1659[var21][0];
                            var9 -= var25.field1659[var21][1];
                            int var27 = var25.field1659[var21][2];
                            int var28 = class119.field1774[var22.field471];
                            int var29 = class119.field1776[var22.field471];
                            int var30 = var26 * var29 + var27 * var28 >> 16;
                            int var31 = var27 * var29 - (var26 * var28) >> 16;
                            var18 += var31;
                            var16 += var30;
                        }
                    }
                }
                class239 var33 = new class239(var8, class260.field3986, var16, var18, class268.method1810(class260.field3986, var16, (byte) 118, var18) - var9, class120.field1794 + var11, class120.field1794 + var12, var13, var14, var7, var10);
                var33.method1639(class268.method1810(class260.field3986, var15, (byte) 118, var17) - var10, class120.field1794 + var11, var15, -896147582, var17);
                class21.field349.method1881(new class92(var33), (byte) -56);
            }
        } else if (class199.field3000 == 101) {
            int var34 = class173.field2543.method407(255);
            int var35 = (var34 >> 4 & 0x7) + class29.field537;
            int var36 = (var34 & 0x7) + class272.field4225;
            int var37 = class173.field2543.method421(255);
            int var38 = class173.field2543.method421(255);
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                class190 var39 = new class190();
                var39.field2878 = var37;
                var39.field2886 = var38;
                if (class235.field3614[class260.field3986][var35][var36] == null) {
                    class235.field3614[class260.field3986][var35][var36] = new class284();
                }
                class235.field3614[class260.field3986][var35][var36].method1881(new class4(var39), (byte) -56);
                class213.method1440(var36, var35, 42);
            }
        } else {
            if (arg0 != 62) {
                method996(-98, -126, 101);
            }
            if (class199.field3000 == 14) {
                int var40 = class173.field2543.method421(255);
                byte var41 = class173.field2543.method458(60);
                int var42 = class173.field2543.method423(118);
                byte var43 = class173.field2543.method458(114);
                byte var44 = class173.field2543.method430((byte) 114);
                int var45 = class173.field2543.method448(arg0 ^ 0xBE);
                int var46 = ((var45 & 0x7F) >> 4) + class29.field537;
                int var47 = (var45 & 0x7) + class272.field4225;
                byte var48 = class173.field2543.method430((byte) 61);
                int var49 = class173.field2543.method450(arg0 ^ 0xFFFFFFBF);
                int var50 = var49 >> 2;
                int var51 = class173.field2543.method397(94);
                int var52 = class173.field2543.method457((byte) 98);
                int var53 = var49 & 0x3;
                class253.method1719(var41, var47, var52, var43, var46, arg0 - 62, var53, var50, var48, var44, var40, var42, var51);
            }
            if (class199.field3000 == 218) {
                int var54 = class173.field2543.method447(30925);
                int var55 = class173.field2543.method448(128);
                int var56 = var55 >> 2;
                if (var54 == 65535) {
                    var54 = -1;
                }
                int var57 = class211.field3183[var56];
                int var58 = class173.field2543.method448(128);
                int var59 = (var58 >> 4 & 0x7) + class29.field537;
                int var60 = (var58 & 0x7) + class272.field4225;
                int var61 = var55 & 0x3;
                class142.method962(var59, class260.field3986, (byte) -82, var54, var61, var56, var60, var57);
            } else if (class199.field3000 == 229) {
                int var62 = class173.field2543.method448(128);
                int var63 = (var62 >> 4 & 0x7) + class29.field537;
                int var64 = class272.field4225 + (var62 & 0x7);
                int var65 = class173.field2543.method447(arg0 ^ 0x78F3);
                int var66 = class173.field2543.method423(arg0 + 58);
                int var67 = class173.field2543.method423(arg0 ^ 0x76);
                if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104 && class138.field1996 != var65) {
                    class190 var68 = new class190();
                    var68.field2886 = var67;
                    var68.field2878 = var66;
                    if (class235.field3614[class260.field3986][var63][var64] == null) {
                        class235.field3614[class260.field3986][var63][var64] = new class284();
                    }
                    class235.field3614[class260.field3986][var63][var64].method1881(new class4(var68), (byte) -56);
                    class213.method1440(var64, var63, arg0 ^ 0x5B);
                }
            } else if (class199.field3000 == 250) {
                int var69 = class173.field2543.method407(arg0 ^ 0xC1);
                int var70 = var69 & 0x3;
                int var71 = var69 >> 2;
                int var72 = class211.field3183[var71];
                int var73 = class173.field2543.method407(255);
                int var74 = class272.field4225 + (var73 & 0x7);
                int var75 = ((var73 & 0x74) >> 4) + class29.field537;
                int var76 = class173.field2543.method423(arg0 ^ 0x71);
                if (var75 >= 0 && var74 >= 0 && var75 < 104 && var74 < 104) {
                    class14.method96(var74, 0, class260.field3986, var75, -1, var71, var72, arg0 ^ 0x3E, var70, var76);
                }
            } else if (class199.field3000 == 44) {
                int var77 = class173.field2543.method407(255);
                int var78 = ((var77 & 0x7E) >> 4) + class29.field537;
                int var79 = (var77 & 0x7) + class272.field4225;
                int var80 = class173.field2543.method459(false) + var78;
                int var81 = var79 + class173.field2543.method459(false);
                int var82 = class173.field2543.method457((byte) 37);
                int var83 = class173.field2543.method423(-99);
                int var84 = class173.field2543.method407(255) * 4;
                int var85 = class173.field2543.method407(arg0 + 193) * 4;
                int var86 = class173.field2543.method423(91);
                int var87 = class173.field2543.method423(119);
                int var88 = class173.field2543.method407(255);
                int var89 = class173.field2543.method407(arg0 + 193);
                if (var88 == 255) {
                    var88 = -1;
                }
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104 && var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104 && var83 != 65535) {
                    int var90 = var81 * 128 + 64;
                    int var91 = var79 * 128 + 64;
                    int var92 = var78 * 128 + 64;
                    int var93 = var80 * 128 + 64;
                    class239 var94 = new class239(var83, class260.field3986, var92, var91, class268.method1810(class260.field3986, var92, (byte) 118, var91) - var84, class120.field1794 + var86, class120.field1794 + var87, var88, var89, var82, var85);
                    var94.method1639(class268.method1810(class260.field3986, var93, (byte) 118, var90) - var85, var86 - -class120.field1794, var93, -896147582, var90);
                    class21.field349.method1881(new class92(var94), (byte) -56);
                }
            } else if (class199.field3000 == 145) {
                int var95 = class173.field2543.method423(-101);
                int var96 = class173.field2543.method407(255);
                class3.method42(-37, var95).method1239((byte) 69, var96);
            } else if (class199.field3000 == 222) {
                int var97 = class173.field2543.method407(255);
                int var98 = ((var97 & 0x75) >> 4) + class29.field537;
                int var99 = (var97 & 0x7) + class272.field4225;
                int var100 = class173.field2543.method423(45);
                if (var100 == 65535) {
                    var100 = -1;
                }
                int var101 = class173.field2543.method407(255);
                int var102 = var101 >> 4 & 0xF;
                int var103 = class173.field2543.method407(255);
                int var104 = var101 & 0x7;
                int var105 = class173.field2543.method407(255);
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                    int var106 = var102 + 1;
                    if (var98 - var106 <= class185.field2687.field449[0] && (var98 + var106) >= class185.field2687.field449[0] && class185.field2687.field493[0] >= (var99 - var106) && class185.field2687.field493[0] <= var99 + var106 && class194.field2934 != 0 && var104 > 0 && class284.field4353 < 50 && var100 != -1) {
                        class49.field810[class284.field4353] = var100;
                        class60.field987[class284.field4353] = var104;
                        class173.field2539[class284.field4353] = var103;
                        class295.field4492[class284.field4353] = null;
                        class163.field2364[class284.field4353] = (var98 << 16) + (var99 << 8) + var102;
                        class10.field155[class284.field4353] = var105;
                        class284.field4353++;
                    }
                }
            } else if (class199.field3000 == 225) {
                int var107 = class173.field2543.method407(255);
                int var108 = (var107 >> 4 & 0xF) + class29.field537 * 2;
                int var109 = (var107 & 0xF) + class272.field4225 * 2;
                int var110 = class173.field2543.method459(false) + var108;
                int var111 = var109 + class173.field2543.method459(false);
                int var112 = class173.field2543.method457((byte) 46);
                int var113 = class173.field2543.method423(83);
                int var114 = class173.field2543.method407(255) * 4;
                int var115 = class173.field2543.method407(arg0 + 193) * 4;
                int var116 = class173.field2543.method423(-122);
                int var117 = class173.field2543.method423(57);
                int var118 = class173.field2543.method407(255);
                int var119 = class173.field2543.method407(255);
                if (var118 == 255) {
                    var118 = -1;
                }
                if (var108 >= 0 && var109 >= 0 && var108 < 208 && var109 < 208 && var110 >= 0 && var111 >= 0 && var110 < 208 && var111 < 208 && var113 != 65535) {
                    int var120 = var111 * 64;
                    int var121 = var108 * 64;
                    int var122 = var110 * 64;
                    int var123 = var109 * 64;
                    class239 var124 = new class239(var113, class260.field3986, var121, var123, class268.method1810(class260.field3986, var121, (byte) 118, var123) - var114, class120.field1794 + var116, class120.field1794 + var117, var118, var119, var112, var115);
                    var124.method1639(class268.method1810(class260.field3986, var122, (byte) 118, var120) - var115, class120.field1794 + var116, var122, -896147582, var120);
                    class21.field349.method1881(new class92(var124), (byte) -56);
                }
            } else if (class199.field3000 == 82) {
                int var125 = class173.field2543.method407(255);
                int var126 = class29.field537 + (var125 >> 4 & 0x7);
                int var127 = (var125 & 0x7) + class272.field4225;
                int var128 = class173.field2543.method423(-85);
                int var129 = class173.field2543.method407(255);
                int var130 = class173.field2543.method423(116);
                if (var126 >= 0 && var127 >= 0 && var126 < 104 && var127 < 104) {
                    int var131 = var127 * 128 + 64;
                    int var132 = var126 * 128 + 64;
                    class63 var133 = new class63(var128, class260.field3986, var132, var131, class268.method1810(class260.field3986, var132, (byte) 118, var131) - var129, var130, class120.field1794);
                    class73.field1187.method1881(new class174(var133), (byte) -56);
                }
            } else if (class199.field3000 == 133) {
                int var134 = class173.field2543.method407(arg0 + 193);
                int var135 = class29.field537 + ((var134 & 0x75) >> 4);
                int var136 = (var134 & 0x7) + class272.field4225;
                int var137 = class173.field2543.method423(81);
                if (var135 >= 0 && var136 >= 0 && var135 < 104 && var136 < 104) {
                    class284 var138 = class235.field3614[class260.field3986][var135][var136];
                    if (var138 != null) {
                        for (class4 var139 = (class4) var138.method1894((byte) -90); var139 != null; var139 = (class4) var138.method1886(arg0 ^ 0xFFFFFFE5)) {
                            if ((var137 & 0x7FFF) == var139.field54.field2878) {
                                var139.method1193(arg0 + 52);
                                break;
                            }
                        }
                        if (var138.method1894((byte) -90) == null) {
                            class235.field3614[class260.field3986][var135][var136] = null;
                        }
                        class213.method1440(var136, var135, 100);
                    }
                }
            } else if (class199.field3000 == 8) {
                int var140 = class173.field2543.method407(255);
                int var141 = (var140 & 0x7) + class272.field4225;
                int var142 = (var140 >> 4 & 0x7) + class29.field537;
                int var143 = class173.field2543.method423(-123);
                int var144 = class173.field2543.method423(arg0 + 35);
                int var145 = class173.field2543.method423(arg0 ^ 0xFFFFFFA3);
                if (var142 >= 0 && var141 >= 0 && var142 < 104 && var141 < 104) {
                    class284 var146 = class235.field3614[class260.field3986][var142][var141];
                    if (var146 != null) {
                        for (class4 var147 = (class4) var146.method1894((byte) -90); var147 != null; var147 = (class4) var146.method1886(-120)) {
                            class190 var148 = var147.field54;
                            if ((var143 & 0x7FFF) == var148.field2878 && var148.field2886 == var144) {
                                var148.field2886 = var145;
                                break;
                            }
                        }
                        class213.method1440(var141, var142, 30);
                    }
                }
            } else if (class199.field3000 == 88) {
                int var149 = class173.field2543.method448(arg0 ^ 0xBE);
                int var150 = (var149 & 0x7) + class272.field4225;
                int var151 = (var149 >> 4 & 0x7) + class29.field537;
                int var152 = class173.field2543.method450(-95);
                int var153 = var152 >> 2;
                int var154 = class211.field3183[var153];
                int var155 = var152 & 0x3;
                if (var151 >= 0 && var150 >= 0 && var151 < 104 && var150 < 104) {
                    class14.method96(var150, 0, class260.field3986, var151, -1, var153, var154, arg0 ^ 0x3E, var155, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lca;Z)V")
    public final void method994(class54 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method407(255);
            if (var3 == 0) {
                if (arg1) {
                    return;
                }
                field2108++;
                return;
            }
            this.method990(arg0, 1359773444, var3);
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)Lwb;")
    public final class219 method995(int arg0) {
        field2110++;
        class219[] var2 = new class219[5];
        if (arg0 <= 113) {
            return null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2103[var4] != -1) {
                var2[var3++] = class219.method1502(class199.field2994, this.field2103[var4], 0);
            }
        }
        class219 var5 = new class219(var2, var3);
        if (this.field2102 != null) {
            for (int var6 = 0; var6 < this.field2102.length; var6++) {
                var5.method1476(this.field2102[var6], this.field2105[var6]);
            }
        }
        if (this.field2111 != null) {
            for (int var7 = 0; var7 < this.field2111.length; var7++) {
                var5.method1477(this.field2111[var7], this.field2096[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
    public static final void method996(int arg0, int arg1, int arg2) {
        field2101++;
        class66.field1087 = arg0 - class141.field2029;
        if (arg1 != 32160) {
            field2095 = 0;
        }
        class244.field3784 = class67.field1114 + class235.field3619 - arg2 - 1;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)Lwb;")
    public final class219 method997(int arg0) {
        field2112++;
        if (this.field2098 == null) {
            return null;
        }
        class219[] var2 = new class219[this.field2098.length];
        for (int var3 = 0; var3 < this.field2098.length; var3++) {
            var2[var3] = class219.method1502(class199.field2994, this.field2098[var3], 0);
        }
        class219 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class219(var2, var2.length);
        }
        if (arg0 <= 6) {
            method992(117, -92, 22, 39, -65);
        }
        if (this.field2102 != null) {
            for (int var5 = 0; var5 < this.field2102.length; var5++) {
                var4.method1476(this.field2102[var5], this.field2105[var5]);
            }
        }
        if (this.field2111 != null) {
            for (int var6 = 0; var6 < this.field2111.length; var6++) {
                var4.method1477(this.field2111[var6], this.field2096[var6]);
            }
        }
        return var4;
    }
}
