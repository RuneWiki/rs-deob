import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class229 extends class310 {

    @OriginalMember(owner = "client!go", name = "U", descriptor = "I")
    private int field3814 = 585;

    @OriginalMember(owner = "client!go", name = "S", descriptor = "I")
    public static int field3812 = 0;

    @OriginalMember(owner = "client!go", name = "K", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!go", name = "N", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!go", name = "O", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!go", name = "P", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!go", name = "Q", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!go", name = "T", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!go", name = "V", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!go", name = "R", descriptor = "Lvi;")
    public static class143 field3811;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method77(int arg0, int arg1) {
        field3810++;
        if (arg1 != -13093) {
            field3812 = -128;
        }
        int[] var3 = this.field4950.method930(arg0, arg1 + 13093);
        if (this.field4950.field2001) {
            int var4 = class230.field3818[arg0];
            for (int var5 = 0; var5 < class261.field4405; var5++) {
                int var6 = class293.field4737[var5];
                if (var6 > this.field3814 && var6 < (4096 - this.field3814) && var4 > (2048 - this.field3814) && var4 < (this.field3814 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3814);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field3814 && this.field3814 + 2048 > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field3814;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field3814);
                } else if (var4 < this.field3814 || var4 > (4096 - this.field3814)) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field3814;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3814);
                } else if (this.field3814 <= var6 && (4096 - this.field3814) >= var6) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field3814);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(B)V", line = 87)
    public static final void method1774(byte arg0) {
        class169.field2691.method2327(1);
        if (arg0 != -13) {
            method1777(-31);
        }
        class46.field745.method2327(1);
        field3805++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 106)
    public static final void method1775(String arg0, int arg1, byte arg2) {
        field3815++;
        class321 var3 = class46.method370(3, (byte) -106, arg1);
        var3.method2265(false);
        var3.field5099 = arg0;
        if (arg2 < 51) {
            field3812 = -5;
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)V", line = 124)
    public static void method1776(int arg0) {
        field3811 = null;
        if (arg0 <= 2) {
            field3811 = (class143) null;
        }
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)V", line = 134)
    public static final void method1777(int arg0) {
        field3804++;
        if (class220.field3497 == 244) {
            int var1 = class29.field383.method1750(17852);
            int var2 = var1 >> 2;
            int var3 = var1 & 0x3;
            int var4 = class285.field4651[var2];
            int var5 = class29.field383.method1748(3);
            int var6 = (var5 >> 4 & 0x7) + class336.field5308;
            int var7 = (var5 & 0x7) + class103.field1675;
            int var8 = class29.field383.method1764(arg0 ^ 0x80);
            if (var8 == 65535) {
                var8 = -1;
            }
            class334.method2337(var6, var3, (byte) 123, var4, class186.field2991, var7, var2, var8);
        } else if (class220.field3497 == 88) {
            int var150 = class29.field383.method1763((byte) 43);
            int var151 = class29.field383.method1764(128);
            int var152 = class29.field383.method1750(arg0 + 17852);
            int var153 = (var152 & 0x7) + class103.field1675;
            int var154 = ((var152 & 0x75) >> 4) + class336.field5308;
            if (var154 >= 0 && var153 >= 0 && var154 < 104 && var153 < 104) {
                class230 var155 = new class230();
                var155.field3829 = var151;
                var155.field3826 = var150;
                if (class211.field3372[class186.field2991][var154][var153] == null) {
                    class211.field3372[class186.field2991][var154][var153] = new class327();
                }
                class211.field3372[class186.field2991][var154][var153].method2302((byte) -43, new class103(var155));
                class352.method2483(var154, var153, (byte) -80);
            }
        } else if (class220.field3497 == 236) {
            int var9 = class29.field383.method1720((byte) -71);
            int var10 = (var9 & 0x7) + class103.field1675;
            int var11 = ((var9 & 0x7B) >> 4) + class336.field5308;
            int var12 = class29.field383.method1765(true);
            int var13 = class29.field383.method1765(true);
            int var14 = class29.field383.method1765(true);
            if (var11 >= 0 && var10 >= 0 && var11 < 104 && var10 < 104) {
                class327 var15 = class211.field3372[class186.field2991][var11][var10];
                if (var15 != null) {
                    for (class103 var16 = (class103) var15.method2300((byte) 109); var16 != null; var16 = (class103) var15.method2306(-23)) {
                        class230 var17 = var16.field1672;
                        if ((var12 & 0x7FFF) == var17.field3829 && var17.field3826 == var13) {
                            var17.field3826 = var14;
                            break;
                        }
                    }
                    class352.method2483(var11, var10, (byte) -106);
                }
            }
        } else {
            if (class220.field3497 == 168) {
                int var18 = class29.field383.method1764(128);
                int var19 = class29.field383.method1720((byte) -75);
                int var20 = (var19 & 0x7) + class103.field1675;
                int var21 = class336.field5308 + (var19 >> 4 & 0x7);
                byte var22 = class29.field383.method1760(arg0 ^ 0xFFFFC870);
                int var23 = class29.field383.method1762((byte) 17);
                int var24 = var23 >> 2;
                int var25 = var23 & 0x3;
                int var26 = class29.field383.method1768((byte) 111);
                int var27 = class29.field383.method1763((byte) 100);
                int var28 = class29.field383.method1765(true);
                byte var29 = class29.field383.method1740(-24104);
                byte var30 = class29.field383.method1740(arg0 - 24104);
                byte var31 = class29.field383.method1740(-24104);
                if (!class42.field607) {
                    class320.method2260(var31, var28, var29, var21, var30, var18, var24, arg0 ^ 0xFFFFD234, var22, var25, var20, var26, var27);
                }
            }
            if (class220.field3497 == 7) {
                int var132 = class29.field383.method1720((byte) -59);
                int var133 = class103.field1675 + (var132 & 0x7);
                int var134 = (var132 >> 4 & 0x7) + class336.field5308;
                int var135 = class29.field383.method1733(arg0) + var134;
                int var136 = class29.field383.method1733(arg0 ^ 0x0) + var133;
                int var137 = class29.field383.method1769(-30726);
                int var138 = class29.field383.method1765(true);
                int var139 = class29.field383.method1720((byte) -7) * 4;
                int var140 = class29.field383.method1720((byte) -87) * 4;
                int var141 = class29.field383.method1765(true);
                int var142 = class29.field383.method1765(true);
                int var143 = class29.field383.method1720((byte) -121);
                int var144 = class29.field383.method1720((byte) -29);
                if (var143 == 255) {
                    var143 = -1;
                }
                if (var134 >= 0 && var133 >= 0 && var134 < 104 && var133 < 104 && var135 >= 0 && var136 >= 0 && var135 < 104 && var136 < 104 && var138 != 65535) {
                    int var145 = var135 * 128 + 64;
                    int var146 = var134 * 128 + 64;
                    int var147 = var136 * 128 + 64;
                    int var148 = var133 * 128 + 64;
                    class181 var149 = new class181(var138, class186.field2991, var146, var148, class271.method2034(arg0 - 1, var148, var146, class186.field2991) - var139, class332.field5261 + var141, class332.field5261 + var142, var143, var144, var137, var140);
                    var149.method1419(var145, class332.field5261 + var141, -var140 + class271.method2034(-1, var147, var145, class186.field2991), var147, (byte) 126);
                    class206.field3254.method2302((byte) -75, new class291(var149));
                }
            } else if (class220.field3497 == 38) {
                int var32 = class29.field383.method1720((byte) -116);
                int var33 = ((var32 & 0x72) >> 4) + class336.field5308;
                int var34 = (var32 & 0x7) + class103.field1675;
                int var35 = class29.field383.method1765(true);
                int var36 = class29.field383.method1720((byte) -124);
                if (var35 == 65535) {
                    var35 = -1;
                }
                int var37 = var36 >> 4 & 0xF;
                int var38 = var36 & 0x7;
                int var39 = class29.field383.method1720((byte) -100);
                int var40 = class29.field383.method1720((byte) -128);
                if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                    int var41 = var37 + 1;
                    if (class6.field55.field3519[0] >= var33 - var41 && class6.field55.field3519[0] <= (var33 + var41) && var34 - var41 <= class6.field55.field3553[0] && class6.field55.field3553[0] <= var34 + var41 && class272.field4520 != 0 && var38 > 0 && class213.field3398 < 50 && var35 != -1) {
                        class252.field4269[class213.field3398] = var35;
                        class76.field1323[class213.field3398] = var38;
                        class240.field3962[class213.field3398] = var39;
                        class94.field1584[class213.field3398] = null;
                        class43.field662[class213.field3398] = (var33 << 16) + var37 + (var34 << 8);
                        class230.field3830[class213.field3398] = var40;
                        class213.field3398++;
                    }
                }
            } else if (class220.field3497 == 208) {
                int var42 = class29.field383.method1720((byte) -92);
                int var43 = var42 >> 2;
                int var44 = var42 & 0x3;
                int var45 = class285.field4651[var43];
                int var46 = class29.field383.method1762((byte) 17);
                int var47 = (var46 >> 4 & 0x7) + class336.field5308;
                int var48 = class103.field1675 + (var46 & 0x7);
                if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                    class186.method1461(var43, 0, var48, var45, -1, class186.field2991, 0, -1, var47, var44);
                }
            } else if (class220.field3497 == 54) {
                int var114 = class29.field383.method1720((byte) -60);
                int var115 = class336.field5308 * 2 + ((var114 & 0xF6) >> 4);
                int var116 = (var114 & 0xF) + class103.field1675 * 2;
                int var117 = var115 + class29.field383.method1733(0);
                int var118 = class29.field383.method1733(arg0 ^ 0x0) + var116;
                int var119 = class29.field383.method1769(-30726);
                int var120 = class29.field383.method1765(true);
                int var121 = class29.field383.method1720((byte) -39) * 4;
                int var122 = class29.field383.method1720((byte) -44) * 4;
                int var123 = class29.field383.method1765(true);
                int var124 = class29.field383.method1765(true);
                int var125 = class29.field383.method1720((byte) -15);
                int var126 = class29.field383.method1720((byte) -125);
                if (var125 == 255) {
                    var125 = -1;
                }
                if (var115 >= 0 && var116 >= 0 && var115 < 208 && var116 < 208 && var117 >= 0 && var118 >= 0 && var117 < 208 && var118 < 208 && var120 != 65535) {
                    int var127 = var117 * 64;
                    int var128 = var115 * 64;
                    int var129 = var118 * 64;
                    int var130 = var116 * 64;
                    class181 var131 = new class181(var120, class186.field2991, var128, var130, class271.method2034(-1, var130, var128, class186.field2991) - var121, class332.field5261 + var123, class332.field5261 + var124, var125, var126, var119, var122);
                    var131.method1419(var127, class332.field5261 + var123, -var122 + class271.method2034(-1, var129, var127, class186.field2991), var129, (byte) 94);
                    class206.field3254.method2302((byte) -48, new class291(var131));
                }
            } else if (class220.field3497 == 36) {
                int var107 = class29.field383.method1764(128);
                int var108 = class29.field383.method1720((byte) -20);
                int var109 = (var108 >> 4 & 0x7) + class336.field5308;
                int var110 = (var108 & 0x7) + class103.field1675;
                int var111 = class29.field383.method1763((byte) 84);
                int var112 = class29.field383.method1759(arg0 - 26608);
                if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104 && class261.field4399 != var107) {
                    class230 var113 = new class230();
                    var113.field3826 = var111;
                    var113.field3829 = var112;
                    if (class211.field3372[class186.field2991][var109][var110] == null) {
                        class211.field3372[class186.field2991][var109][var110] = new class327();
                    }
                    class211.field3372[class186.field2991][var109][var110].method2302((byte) -92, new class103(var113));
                    class352.method2483(var109, var110, (byte) -92);
                }
            } else if (class220.field3497 == 173) {
                int var49 = class29.field383.method1720((byte) -100);
                int var50 = (var49 >> 4 & 0xF) + class336.field5308 * 2;
                int var51 = (var49 & 0xF) + class103.field1675 * 2;
                int var52 = var50 + class29.field383.method1733(0);
                int var53 = class29.field383.method1733(0) + var51;
                int var54 = class29.field383.method1769(-30726);
                int var55 = class29.field383.method1769(-30726);
                int var56 = class29.field383.method1765(true);
                int var57 = class29.field383.method1733(0);
                int var58 = class29.field383.method1720((byte) -63) * 4;
                int var59 = class29.field383.method1765(true);
                int var60 = class29.field383.method1765(true);
                int var61 = class29.field383.method1720((byte) -68);
                int var62 = class29.field383.method1720((byte) -55);
                if (var61 == 255) {
                    var61 = -1;
                }
                if (var50 >= 0 && var51 >= 0 && var50 < 208 && var51 < 208 && var52 >= 0 && var53 >= 0 && var52 < 208 && var53 < 208 && var56 != 65535) {
                    int var63 = var52 * 64;
                    int var64 = var51 * 64;
                    int var65 = var50 * 64;
                    int var66 = var53 * 64;
                    if (var54 != 0) {
                        class220 var69;
                        int var70;
                        if (var54 < 0) {
                            int var67 = -var54 - 1;
                            int var68 = var67 & 0x7FF;
                            if (class261.field4399 == var68) {
                                var69 = class6.field55;
                            } else {
                                var69 = class56.field924[var68];
                            }
                            var70 = var67 >> 11 & 0xF;
                        } else {
                            int var71 = var54 - 1;
                            var70 = var71 >> 11 & 0xF;
                            int var72 = var71 & 0x7FF;
                            var69 = class165.field2621[var72];
                        }
                        if (var69 != null) {
                            class106 var73 = var69.method1641(0);
                            if (var73.field1727 != null && var73.field1727[var70] != null) {
                                int var74 = var73.field1727[var70][0];
                                var57 -= var73.field1727[var70][1];
                                int var75 = class153.field2445[var69.field3477];
                                int var76 = class153.field2438[var69.field3477];
                                int var77 = var73.field1727[var70][2];
                                int var78 = var74 * var75 + var76 * var77 >> 16;
                                int var79 = var75 * var77 - (var74 * var76) >> 16;
                                var64 += var79;
                                var65 += var78;
                            }
                        }
                    }
                    class181 var81 = new class181(var56, class186.field2991, var65, var64, class271.method2034(arg0 - 1, var64, var65, class186.field2991) - var57, class332.field5261 + var59, class332.field5261 + var60, var61, var62, var55, var58);
                    var81.method1419(var63, class332.field5261 + var59, -var58 + class271.method2034(-1, var66, var63, class186.field2991), var66, (byte) 95);
                    class206.field3254.method2302((byte) -65, new class291(var81));
                }
            } else if (class220.field3497 == 81) {
                int var99 = class29.field383.method1764(128);
                int var100 = class29.field383.method1750(arg0 + 17852);
                int var101 = class336.field5308 + ((var100 & 0x73) >> 4);
                int var102 = (var100 & 0x7) + class103.field1675;
                int var103 = class29.field383.method1762((byte) 17);
                int var104 = var103 & 0x3;
                int var105 = var103 >> 2;
                int var106 = class285.field4651[var105];
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                    class186.method1461(var105, 0, var102, var106, -1, class186.field2991, 0, var99, var101, var104);
                }
            } else if (class220.field3497 == 237) {
                int var82 = class29.field383.method1765(true);
                int var83 = class29.field383.method1720((byte) -80);
                class166.method1292(arg0 ^ 0x0, var82).method191(var83, 0);
            } else {
                if (arg0 != 0) {
                    field3812 = -94;
                }
                if (class220.field3497 == 209) {
                    int var84 = class29.field383.method1720((byte) -44);
                    int var85 = class336.field5308 + (var84 >> 4 & 0x7);
                    int var86 = class103.field1675 + (var84 & 0x7);
                    int var87 = class29.field383.method1765(true);
                    int var88 = class29.field383.method1720((byte) -58);
                    int var89 = class29.field383.method1765(true);
                    if (var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104) {
                        int var90 = var85 * 128 + 64;
                        int var91 = var86 * 128 + 64;
                        class83 var92 = new class83(var87, class186.field2991, var90, var91, class271.method2034(arg0 - 1, var91, var90, class186.field2991) - var88, var89, class332.field5261);
                        class189.field3039.method2302((byte) -45, new class231(var92));
                    }
                } else if (class220.field3497 == 97) {
                    int var93 = class29.field383.method1759(-26608);
                    int var94 = class29.field383.method1750(arg0 + 17852);
                    int var95 = (var94 & 0x7) + class103.field1675;
                    int var96 = (var94 >> 4 & 0x7) + class336.field5308;
                    if (var96 >= 0 && var95 >= 0 && var96 < 104 && var95 < 104) {
                        class327 var97 = class211.field3372[class186.field2991][var96][var95];
                        if (var97 != null) {
                            for (class103 var98 = (class103) var97.method2300((byte) 112); var98 != null; var98 = (class103) var97.method2306(arg0 ^ 0xFFFFFFE9)) {
                                if ((var93 & 0x7FFF) == var98.field1672.field3829) {
                                    var98.method330(15);
                                    break;
                                }
                            }
                            if (var97.method2300((byte) 98) == null) {
                                class211.field3372[class186.field2991][var96][var95] = null;
                            }
                            class352.method2483(var96, var95, (byte) 119);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZLjava/lang/String;ZI)Z", line = 727)
    public static final boolean method1778(boolean arg0, String arg1, boolean arg2, int arg3) {
        field3808++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        if (!arg2) {
            method1776(-122);
        }
        int var5 = 0;
        boolean var6 = false;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg3) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var5 + var11;
            if ((var10 / arg3) != var5) {
                return false;
            }
            var6 = true;
            var5 = var10;
        }
        return var6;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lqm;II)V", line = 809)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field3814 = arg0.method1765(true);
        }
        if (arg1 == -2470) {
            field3809++;
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 829)
    public class229() {
        super(0, true);
    }

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(I)V", line = 836)
    public static final void method1779(int arg0) {
        class292.field4729.method2326(-4);
        field3806++;
        if (arg0 != 2048) {
            field3812 = -31;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)Lmj;", line = 849)
    public static final class48 method1780(boolean arg0, int arg1) {
        class48 var2 = (class48) class308.field4913.method2147((byte) 102, (long) arg1);
        field3813++;
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method1775((String) null, 9, (byte) -22);
        }
        byte[] var3 = class340.field5440.method472(class300.method2145(23, arg1), 83, class168.method1307(arg1, 9427));
        class48 var4 = new class48();
        if (var3 != null) {
            var4.method379(0, new class227(var3));
        }
        class308.field4913.method2149(var4, -32563, (long) arg1);
        return var4;
    }
}
