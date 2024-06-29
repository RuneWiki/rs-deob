import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class492 extends class258 {

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field7129 = 0;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field7133 = new String[200];

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field7128 = 4;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public static int field7131;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V", line = 14)
    public static final void method2992(int arg0, int arg1) {
        field7131++;
        class118 var2 = class86.method755(true, 11, arg1);
        var2.method936(0);
        if (arg0 > -18) {
            method2993(-71, -115);
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)Z", line = 45)
    public static final boolean method2993(int arg0, int arg1) {
        field7132++;
        if (arg0 != -2) {
            field7129 = 110;
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lwk;B)V", line = 56)
    public static final void method2994(class430 arg0, byte arg1) {
        field7130++;
        if (class756.field10533 == arg0) {
            int var2 = class624.field8742.method1987(-33);
            int var3 = ((var2 & 0x72) >> 4) + class112.field1730;
            int var4 = (var2 & 0x7) + class734.field10336;
            int var5 = class624.field8742.method1924(5970);
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = class611.field8620[var6];
            if (class432.method2681(97, class157.field2437) || var3 >= 0 && var4 >= 0 && var3 < class191.field3229 && var4 < class314.field4720) {
                class363.method2328(-1, var7, -1, var3, var6, class470.field6824, var8, -1, 0, var4);
            }
        } else if (class100.field1475 == arg0) {
            int var9 = class624.field8742.method1987(-127);
            int var10 = ((var9 & 0x70) >> 4) + class112.field1730;
            int var11 = (var9 & 0x7) + class734.field10336;
            int var12 = class624.field8742.method1989((byte) -109);
            if (var12 == 65535) {
                var12 = -1;
            }
            int var13 = class624.field8742.method1987(-113);
            int var14 = (var13 & 0xF6) >> 4;
            int var15 = var13 & 0x7;
            int var16 = class624.field8742.method1987(-71);
            int var17 = class624.field8742.method1987(-69);
            int var18 = class624.field8742.method1989((byte) -41);
            if (var10 >= 0 && var11 >= 0 && var10 < class191.field3229 && var11 < class314.field4720) {
                int var19 = var14 + 1;
                if (class145.field2251.field1702[0] >= (var10 - var19) && var10 + var19 >= class145.field2251.field1702[0] && class145.field2251.field1704[0] >= (var11 - var19) && var11 + var19 >= class145.field2251.field1704[0]) {
                    class625.method3534((class470.field6824 << 24) + (var10 << 16) + (var11 << 8) + var14, var15, var16, (byte) -81, false, var12, var17, var18);
                }
            }
        } else {
            if (arg1 < 52) {
                field7129 = -88;
            }
            if (class474.field6883 == arg0) {
                int var20 = class624.field8742.method1987(-35);
                int var21 = (var20 & 0x7) + class734.field10336;
                int var22 = class723.field10155 + var21;
                int var23 = (var20 >> 4 & 0x7) + class112.field1730;
                int var24 = class265.field4123 + var23;
                int var25 = class624.field8742.method1989((byte) -123);
                int var26 = class624.field8742.method1989((byte) -128);
                int var27 = class624.field8742.method1989((byte) -102);
                if (class665.field9441 != null) {
                    class477 var28 = (class477) class665.field9441.method3512(true, (long) (var24 | var22 << 14 | class470.field6824 << 28));
                    if (var28 != null) {
                        for (class51 var29 = (class51) var28.field6929.method3463((byte) -50); var29 != null; var29 = (class51) var28.field6929.method3469((byte) 107)) {
                            if ((var25 & 0x7FFF) == var29.field823 && var29.field819 == var26) {
                                var29.method636((byte) 97);
                                var29.field819 = var27;
                                class452.method2771(class470.field6824, var22, true, var24, var29);
                                break;
                            }
                        }
                        if (var23 >= 0 && var21 >= 0 && var23 < class191.field3229 && var21 < class314.field4720) {
                            class7.method30(var23, var21, class470.field6824, (byte) -126);
                        }
                    }
                }
            } else if (class379.field5698 == arg0) {
                int var30 = class624.field8742.method1987(-27);
                boolean var31 = (var30 & 0x80) != 0;
                int var32 = ((var30 & 0x3B) >> 3) + class112.field1730;
                int var33 = (var30 & 0x7) + class734.field10336;
                int var34 = class624.field8742.method1984(4) + var32;
                int var35 = class624.field8742.method1984(4) + var33;
                int var36 = class624.field8742.method1977((byte) -127);
                int var37 = class624.field8742.method1989((byte) -61);
                int var38 = class624.field8742.method1987(-67) * 4;
                int var39 = class624.field8742.method1987(-56) * 4;
                int var40 = class624.field8742.method1989((byte) -74);
                int var41 = class624.field8742.method1989((byte) -60);
                int var42 = class624.field8742.method1987(-87);
                if (var42 == 255) {
                    var42 = -1;
                }
                int var43 = class624.field8742.method1989((byte) -32);
                if (var32 >= 0 && var33 >= 0 && class191.field3229 > var32 && var33 < class314.field4720 && var34 >= 0 && var35 >= 0 && class191.field3229 > var34 && class314.field4720 > var35 && var37 != 65535) {
                    int var44 = var38 << 2;
                    int var45 = var35 * 512 + 256;
                    int var46 = var39 << 2;
                    int var47 = var33 * 512 + 256;
                    int var48 = var34 * 512 + 256;
                    int var49 = var32 * 512 + 256;
                    int var50 = var43 << 2;
                    class188 var51 = new class188(var37, class470.field6824, class470.field6824, var49, var47, var44, class199.field3403 + var40, var41 - -class199.field3403, var42, var50, 0, var36, var46, var31, -1);
                    var51.method1433(class199.field3403 + var40, var45, (byte) -106, var48, class232.method1611(var45, var48, class470.field6824, (byte) -102) - var46);
                    class645.field9194.method3472(126, new class748(var51));
                }
            } else if (class466.field6797 == arg0) {
                int var52 = class624.field8742.method1987(-25);
                int var53 = ((var52 & 0xF3) >> 4) + class112.field1730 * 2;
                int var54 = (var52 & 0xF) + class734.field10336 * 2;
                int var55 = class624.field8742.method1987(-55);
                boolean var56 = (var55 & 0x1) != 0;
                boolean var57 = (var55 & 0x2) != 0;
                int var58 = var57 ? var55 >> 2 : -1;
                int var59 = class624.field8742.method1984(4) + var53;
                int var60 = class624.field8742.method1984(4) + var54;
                int var61 = class624.field8742.method1977((byte) 41);
                int var62 = class624.field8742.method1977((byte) -126);
                int var63 = class624.field8742.method1989((byte) -38);
                int var64 = class624.field8742.method1987(-106);
                int var65;
                if (var57) {
                    var65 = (byte) var64;
                } else {
                    var65 = var64 * 4;
                }
                int var66 = class624.field8742.method1987(-21) * 4;
                int var67 = class624.field8742.method1989((byte) -88);
                int var68 = class624.field8742.method1989((byte) -113);
                int var69 = class624.field8742.method1987(-55);
                if (var69 == 255) {
                    var69 = -1;
                }
                int var70 = class624.field8742.method1989((byte) -107);
                if (var53 >= 0 && var54 >= 0 && var53 < class191.field3229 * 2 && class191.field3229 * 2 > var54 && var59 >= 0 && var60 >= 0 && class314.field4720 * 2 > var59 && (class314.field4720 * 2) > var60 && var63 != 65535) {
                    int var71 = var60 * 256;
                    int var72 = var65 << 2;
                    int var73 = var70 << 2;
                    int var74 = var53 * 256;
                    int var75 = var66 << 2;
                    int var76 = var59 * 256;
                    int var77 = var54 * 256;
                    if (var61 != 0 && var58 != -1) {
                        class109 var78 = null;
                        if (var61 >= 0) {
                            int var79 = var61 - 1;
                            class53 var80 = (class53) class332.field4881.method3512(true, (long) var79);
                            if (var80 != null) {
                                var78 = var80.field847;
                            }
                        } else {
                            int var81 = -var61 - 1;
                            if (class673.field9516 == var81) {
                                var78 = class145.field2251;
                            } else {
                                var78 = class279.field4271[var81];
                            }
                        }
                        if (var78 != null) {
                            class228 var82 = var78.method885(-30);
                            if (var82.field3646 != null && var82.field3646[var58] != null) {
                                var72 -= var82.field3646[var58][1];
                            }
                            if (var82.field3684 != null && var82.field3684[var58] != null) {
                                var72 -= var82.field3684[var58][1];
                            }
                        }
                    }
                    class188 var83 = new class188(var63, class470.field6824, class470.field6824, var74, var77, var72, class199.field3403 + var67, class199.field3403 + var68, var69, var73, var61, var62, var75, var56, var58);
                    var83.method1433(class199.field3403 + var67, var71, (byte) -99, var76, class232.method1611(var71, var76, class470.field6824, (byte) 93) - var75);
                    class645.field9194.method3472(106, new class748(var83));
                }
            } else if (class97.field1427 == arg0) {
                int var84 = class624.field8742.method1987(-64);
                int var85 = ((var84 & 0x78) >> 4) + class112.field1730;
                int var86 = (var84 & 0x7) + class734.field10336;
                int var87 = class624.field8742.method1989((byte) -68);
                int var88 = class624.field8742.method1987(-127);
                int var89 = class624.field8742.method1989((byte) -94);
                int var90 = class624.field8742.method1987(-49);
                if (var85 >= 0 && var86 >= 0 && class191.field3229 > var85 && class314.field4720 > var86) {
                    int var91 = var85 * 512 + 256;
                    int var92 = var86 * 512 + 256;
                    int var93 = class470.field6824;
                    if (var93 < 3 && class584.method3365(false, var85, var86)) {
                        var93++;
                    }
                    class758 var94 = new class758(var87, var89, class199.field3403, class470.field6824, var93, var91, class232.method1611(var92, var91, class470.field6824, (byte) 53) - var88, var92, var85, var85, var86, var86, var90);
                    class85.field1253.method3472(96, new class548(var94));
                }
            } else if (class229.field3701 == arg0) {
                int var95 = class624.field8742.method1987(-31);
                int var96 = (var95 >> 4 & 0x7) + class112.field1730;
                int var97 = (var95 & 0x7) + class734.field10336;
                int var98 = class624.field8742.method1938(-1);
                if (var98 == 65535) {
                    var98 = -1;
                }
                int var99 = class624.field8742.method1987(-31);
                int var100 = var99 >> 2;
                int var101 = var99 & 0x3;
                int var102 = class611.field8620[var100];
                class308.method2039(var96, (byte) 88, class470.field6824, var97, var100, var102, var98, var101);
            } else if (class53.field845 == arg0) {
                int var103 = class624.field8742.method1987(-97);
                int var104 = class112.field1730 + ((var103 & 0x74) >> 4);
                int var105 = (var103 & 0x7) + class734.field10336;
                int var106 = class624.field8742.method1989((byte) -94);
                if (var106 == 65535) {
                    var106 = -1;
                }
                int var107 = class624.field8742.method1987(-89);
                int var108 = var107 >> 4 & 0xF;
                int var109 = var107 & 0x7;
                int var110 = class624.field8742.method1987(-33);
                int var111 = class624.field8742.method1987(-114);
                int var112 = class624.field8742.method1989((byte) -49);
                if (var104 >= 0 && var105 >= 0 && class191.field3229 > var104 && class314.field4720 > var105) {
                    int var113 = var108 + 1;
                    if (class145.field2251.field1702[0] >= (var104 - var113) && (var104 + var113) >= class145.field2251.field1702[0] && (var105 - var113) <= class145.field2251.field1704[0] && (var105 + var113) >= class145.field2251.field1704[0]) {
                        class689.method3847(var110, (class470.field6824 << 24) + (var105 << 8) + (var104 << 16) + var108, var112, var111, var106, 64, var109);
                    }
                }
            } else if (class398.field5913 == arg0) {
                int var114 = class624.field8742.method1961(true);
                int var115 = class624.field8742.method1988(91);
                int var116 = (var115 & 0x7) + class734.field10336;
                int var117 = class723.field10155 + var116;
                int var118 = class112.field1730 + (var115 >> 4 & 0x7);
                int var119 = class265.field4123 + var118;
                class477 var120 = (class477) class665.field9441.method3512(true, (long) (var119 | var117 << 14 | class470.field6824 << 28));
                if (var120 != null) {
                    for (class51 var121 = (class51) var120.field6929.method3463((byte) -50); var121 != null; var121 = (class51) var120.field6929.method3469((byte) 107)) {
                        if ((var114 & 0x7FFF) == var121.field823) {
                            var121.method636((byte) 97);
                            break;
                        }
                    }
                    if (var120.field6929.method3473(false)) {
                        var120.method636((byte) 97);
                    }
                    if (var118 >= 0 && var116 >= 0 && class191.field3229 > var118 && var116 < class314.field4720) {
                        class7.method30(var118, var116, class470.field6824, (byte) -39);
                    }
                }
            } else if (class32.field302 == arg0) {
                int var122 = class624.field8742.method1938(-1);
                int var123 = class624.field8742.method1938(-1);
                int var124 = class624.field8742.method1924(5970);
                int var125 = (var124 & 0x7) + class734.field10336;
                int var126 = class723.field10155 + var125;
                int var127 = class112.field1730 + ((var124 & 0x72) >> 4);
                int var128 = class265.field4123 + var127;
                boolean var129 = var127 >= 0 && var125 >= 0 && class191.field3229 > var127 && class314.field4720 > var125;
                if (var129 || class432.method2681(97, class157.field2437)) {
                    class452.method2771(class470.field6824, var126, true, var128, new class51(var122, var123));
                    if (var129) {
                        class7.method30(var127, var125, class470.field6824, (byte) -115);
                    }
                }
            } else if (class539.field7701 == arg0) {
                int var130 = class624.field8742.method1924(5970);
                int var131 = var130 >> 2;
                int var132 = var130 & 0x3;
                int var133 = class611.field8620[var131];
                int var134 = class624.field8742.method1987(-80);
                int var135 = class112.field1730 + ((var134 & 0x79) >> 4);
                int var136 = class734.field10336 + (var134 & 0x7);
                int var137 = class624.field8742.method1961(true);
                if (class432.method2681(97, class157.field2437) || var135 >= 0 && var136 >= 0 && var135 < class191.field3229 && var136 < class314.field4720) {
                    class363.method2328(var137, var132, -1, var135, var131, class470.field6824, var133, -1, 0, var136);
                }
            } else if (class475.field6900 == arg0) {
                class624.field8742.method1987(-78);
                int var138 = class624.field8742.method1987(-88);
                int var139 = class112.field1730 + (var138 >> 4 & 0x7);
                int var140 = class734.field10336 + (var138 & 0x7);
                int var141 = class624.field8742.method1989((byte) -58);
                int var142 = class624.field8742.method1987(-108);
                int var143 = class624.field8742.method1952(22085);
                String var144 = class624.field8742.method1958(-3438);
                class708.method3925(var140, class470.field6824, (byte) 60, var139, var144, var142, var143, var141);
            } else if (class98.field1456 == arg0) {
                int var145 = class624.field8742.method1961(true);
                int var146 = class624.field8742.method1989((byte) -70);
                int var147 = class624.field8742.method1988(126);
                int var148 = class734.field10336 + (var147 & 0x7);
                int var149 = var148 + class723.field10155;
                int var150 = ((var147 & 0x7A) >> 4) + class112.field1730;
                int var151 = class265.field4123 + var150;
                int var152 = class624.field8742.method1972(-128);
                if (class673.field9516 != var152) {
                    boolean var153 = var150 >= 0 && var148 >= 0 && class191.field3229 > var150 && class314.field4720 > var148;
                    if (var153 || class432.method2681(97, class157.field2437)) {
                        class452.method2771(class470.field6824, var149, true, var151, new class51(var146, var145));
                        if (var153) {
                            class7.method30(var150, var148, class470.field6824, (byte) -75);
                        }
                    }
                }
            } else if (class515.field7468 == arg0) {
                int var154 = class624.field8742.method1989((byte) -79);
                int var155 = class624.field8742.method1987(-26);
                class576.field8167.method3074(0, var154).method3410(var155, -119);
            } else {
                class333.method2135(null, "T3 - " + arg0, -93);
                class694.method3874(false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 645)
    public static void method2995(int arg0) {
        field7133 = null;
        if (arg0 != 0) {
            field7128 = 49;
        }
    }
}
