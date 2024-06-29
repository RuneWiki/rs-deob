import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class429 {

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Z")
    public static boolean field6099 = true;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field6100 = 0;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "[I")
    public static int[] field6108 = new int[100];

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Lfs;")
    public static class331 field6097;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "[I")
    public static int[] field6101;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method2671(int arg0, int arg1) {
        field6107++;
        if (arg0 == 100 && class52.field673 > 0) {
            byte[] var2 = class284.field4137[--class52.field673];
            class284.field4137[class52.field673] = null;
            return var2;
        } else if (arg0 == 5000 && class229.field3400 > 0) {
            byte[] var3 = class267.field3913[--class229.field3400];
            class267.field3913[class229.field3400] = null;
            return var3;
        } else if (arg0 == 30000 && class206.field2957 > 0) {
            byte[] var4 = class325.field4723[--class206.field2957];
            class325.field4723[class206.field2957] = null;
            return var4;
        } else {
            if (arg1 != 64) {
                field6097 = null;
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
    public static void method2672(byte arg0) {
        int var1 = -52 / ((arg0 + 53) / 62);
        field6097 = null;
        field6108 = null;
        field6101 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public static final void method2673(int arg0) {
        field6098++;
        if (class213.field3012 == 188) {
            int var1 = class352.field5114.method837(true);
            int var2 = class407.field5750 + (var1 >> 4 & 0x7);
            int var3 = (var1 & 0x7) + field6106;
            int var4 = class352.field5114.method798(false);
            int var5 = class352.field5114.method837(true);
            int var6 = class352.field5114.method798(false);
            if (var2 >= 0 && var3 >= 0 && class80.field1034 > var2 && var3 < class381.field5414) {
                int var7 = var2 * 128 + 64;
                int var8 = var3 * 128 + 64;
                class216 var9 = new class216(var4, var6, class34.field434, class158.field2302, var7, class452.method2820(class158.field2302, var8, false, var7) - var5, var8, var2, var2, var3, var3);
                class319.field4666.method2756(-80, new class86(var9));
            }
        } else if (class213.field3012 == 165) {
            int var10 = class352.field5114.method850(false);
            int var11 = class407.field5750 + ((var10 & 0x73) >> 4);
            int var12 = field6106 + (var10 & 0x7);
            int var13 = class352.field5114.method810((byte) -6);
            int var14 = var13 >> 2;
            int var15 = var13 & 0x3;
            int var16 = class278.field4002[var14];
            int var17 = class352.field5114.method857(arg0 + 191);
            if (var11 >= 0 && var12 >= 0 && var11 < class80.field1034 && class381.field5414 > var12) {
                class399.method2503(var15, var16, -1, var11, var17, 0, var14, var12, arg0 - 183, class158.field2302);
            }
        } else if (class213.field3012 == 13) {
            int var18 = class352.field5114.method812(3);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = class352.field5114.method848(255);
            int var20 = (var19 >> 4 & 0x7) + class407.field5750;
            int var21 = (var19 & 0x7) + field6106;
            int var22 = class352.field5114.method850(false);
            int var23 = var22 >> 2;
            int var24 = var22 & 0x3;
            int var25 = class278.field4002[var23];
            class371.method2384(false, var21, var23, var24, class158.field2302, var18, var25, var20);
        } else if (class213.field3012 == 139) {
            class352.field5114.method837(true);
            int var26 = class352.field5114.method837(true);
            int var27 = (var26 >> 4 & 0x7) + class407.field5750;
            int var28 = field6106 + (var26 & 0x7);
            int var29 = class352.field5114.method798(false);
            int var30 = class352.field5114.method837(true);
            int var31 = class352.field5114.method839((byte) -92);
            String var32 = class352.field5114.method843(-111);
            class284.method1951(-126, var32, var30, var27, var29, var28, var31);
        } else if (class213.field3012 == 62) {
            int var33 = class352.field5114.method810((byte) -6);
            int var34 = class407.field5750 + ((var33 & 0x7E) >> 4);
            int var35 = (var33 & 0x7) + field6106;
            int var36 = class352.field5114.method809(false);
            if (var34 >= 0 && var35 >= 0 && class80.field1034 > var34 && class381.field5414 > var35) {
                class413 var37 = (class413) class338.field4904.method1373((long) (var34 | var35 << 14 | class158.field2302 << 28), 116);
                if (var37 != null) {
                    for (class122 var38 = (class122) var37.field5907.method2752(arg0 ^ 0xFFFFFFE3); var38 != null; var38 = (class122) var37.field5907.method2754(-1)) {
                        if ((var36 & 0x7FFF) == var38.field1633) {
                            var38.method2660((byte) 119);
                            break;
                        }
                    }
                    if (var37.field5907.method2759(-1)) {
                        var37.method2660((byte) 125);
                    }
                    class122.method738(class158.field2302, var34, var35, (byte) 99);
                }
            }
        } else if (class213.field3012 == 160) {
            int var39 = class352.field5114.method848(255);
            int var40 = ((var39 & 0x7B) >> 4) + class407.field5750;
            int var41 = (var39 & 0x7) + field6106;
            int var42 = class352.field5114.method812(3);
            int var43 = class352.field5114.method798(false);
            if (var40 >= 0 && var41 >= 0 && class80.field1034 > var40 && class381.field5414 > var41) {
                class319.method2120(var40, var41, new class122(var43, var42), 123, class158.field2302);
                class122.method738(class158.field2302, var40, var41, (byte) 26);
            }
        } else if (class213.field3012 == 111) {
            int var44 = class352.field5114.method837(true);
            int var45 = var44 >> 2;
            int var46 = var44 & 0x3;
            int var47 = class278.field4002[var45];
            int var48 = class352.field5114.method837(true);
            int var49 = (var48 >> 4 & 0x7) + class407.field5750;
            int var50 = (var48 & 0x7) + field6106;
            if (var49 >= 0 && var50 >= 0 && class80.field1034 > var49 && class381.field5414 > var50) {
                class399.method2503(var46, var47, -1, var49, -1, 0, var45, var50, -126, class158.field2302);
            }
        } else if (class213.field3012 == 177) {
            int var51 = class352.field5114.method837(true);
            int var52 = ((var51 & 0xFF) >> 4) + class407.field5750 * 2;
            int var53 = (var51 & 0xF) + field6106 * 2;
            int var54 = class352.field5114.method823((byte) -35) + var52;
            int var55 = var53 + class352.field5114.method823((byte) -117);
            int var56 = class352.field5114.method844(698527688);
            int var57 = class352.field5114.method844(698527688);
            int var58 = class352.field5114.method798(false);
            int var59 = class352.field5114.method823((byte) -54);
            int var60 = class352.field5114.method837(true) * 4;
            int var61 = class352.field5114.method798(false);
            int var62 = class352.field5114.method798(false);
            int var63 = class352.field5114.method837(true);
            if (var63 == 255) {
                var63 = -1;
            }
            int var64 = class352.field5114.method837(true);
            if (var52 >= 0 && var53 >= 0 && var52 < (class80.field1034 * 2) && var53 < (class80.field1034 * 2) && var54 >= 0 && var55 >= 0 && class381.field5414 * 2 > var54 && var55 < class381.field5414 * 2 && var58 != 65535) {
                int var65 = var53 * 64;
                int var66 = var55 * 64;
                int var67 = var54 * 64;
                int var68 = var52 * 64;
                if (var56 != 0) {
                    int var71;
                    class311 var72;
                    if (var56 < 0) {
                        int var69 = -var56 - 1;
                        int var70 = var69 & 0x7FF;
                        var71 = var69 >> 11 & 0xF;
                        if (class302.field4417 == var70) {
                            var72 = class181.field2555;
                        } else {
                            var72 = class243.field3596[var70];
                        }
                    } else {
                        int var73 = var56 - 1;
                        var71 = (var73 & 0x7B7A) >> 11;
                        int var74 = var73 & 0x7FF;
                        var72 = class442.field6317[var74];
                    }
                    if (var72 != null) {
                        class3 var75 = var72.method2093(-1498200479);
                        if (var75.field39 != null && var75.field39[var71] != null) {
                            int var76 = var75.field39[var71][0];
                            int var77 = var75.field39[var71][2];
                            int var78 = var72.field4570.method2426(-120);
                            int var79 = class447.field6381[var78];
                            int var80 = class447.field6390[var78];
                            int var81 = var76 * var80 + var77 * var79 >> 15;
                            int var82 = var77 * var80 - (var76 * var79) >> 15;
                            var68 += var81;
                            var65 += var82;
                            var59 -= var75.field39[var71][1];
                        }
                    }
                }
                class431 var84 = new class431(var58, class158.field2302, var68, var65, class452.method2820(class158.field2302, var65, false, var68) - var59, class34.field434 + var61, var62 + class34.field434, var63, var64, var57, var60);
                var84.method2688(var66, var67, class452.method2820(class158.field2302, var66, false, var67) - var60, class34.field434 + var61, arg0 + 51);
                class335.field4860.method2756(-92, new class359(var84));
            }
        } else if (class213.field3012 == 106) {
            int var85 = class352.field5114.method798(false);
            int var86 = class352.field5114.method837(true);
            class398.method2496(-115, var85).method1946(var86, 65535);
        } else if (class213.field3012 == 155) {
            int var87 = class352.field5114.method837(true);
            int var88 = ((var87 & 0x7D) >> 4) + class407.field5750;
            int var89 = (var87 & 0x7) + field6106;
            int var90 = class352.field5114.method798(false);
            int var91 = class352.field5114.method798(false);
            int var92 = class352.field5114.method798(false);
            if (class338.field4904 != null && var88 >= 0 && var89 >= 0 && class80.field1034 > var88 && class381.field5414 > var89) {
                class413 var93 = (class413) class338.field4904.method1373((long) (var88 | var89 << 14 | class158.field2302 << 28), 117);
                if (var93 != null) {
                    for (class122 var94 = (class122) var93.field5907.method2752(-123); var94 != null; var94 = (class122) var93.field5907.method2754(-1)) {
                        if ((var90 & 0x7FFF) == var94.field1633 && var94.field1638 == var91) {
                            var94.method2660((byte) 121);
                            var94.field1638 = var92;
                            class319.method2120(var88, var89, var94, 126, class158.field2302);
                            break;
                        }
                    }
                    class122.method738(class158.field2302, var88, var89, (byte) 86);
                }
            }
        } else if (class213.field3012 == 214) {
            int var95 = class352.field5114.method837(true);
            int var96 = (var95 >> 4 & 0xF) + class407.field5750 * 2;
            int var97 = (var95 & 0xF) + field6106 * 2;
            int var98 = var96 + class352.field5114.method823((byte) -27);
            int var99 = var97 + class352.field5114.method823((byte) -63);
            int var100 = class352.field5114.method844(arg0 ^ 0x29A2AF88);
            int var101 = class352.field5114.method798(false);
            int var102 = class352.field5114.method837(true) * 4;
            int var103 = class352.field5114.method837(true) * 4;
            int var104 = class352.field5114.method798(false);
            int var105 = class352.field5114.method798(false);
            int var106 = class352.field5114.method837(true);
            if (var106 == 255) {
                var106 = -1;
            }
            int var107 = class352.field5114.method837(true);
            if (var96 >= 0 && var97 >= 0 && var96 < (class80.field1034 * 2) && (class80.field1034 * 2) > var97 && var98 >= 0 && var99 >= 0 && class381.field5414 * 2 > var98 && var99 < class381.field5414 * 2 && var101 != 65535) {
                int var108 = var96 * 64;
                int var109 = var99 * 64;
                int var110 = var97 * 64;
                int var111 = var98 * 64;
                class431 var112 = new class431(var101, class158.field2302, var108, var110, class452.method2820(class158.field2302, var110, false, var108) - var102, var104 - -class34.field434, var105 + class34.field434, var106, var107, var100, var103);
                var112.method2688(var109, var111, class452.method2820(class158.field2302, var109, false, var111) - var103, var104 - -class34.field434, 88);
                class335.field4860.method2756(72, new class359(var112));
            }
        } else {
            if (class213.field3012 == 67) {
                int var113 = class352.field5114.method848(255);
                int var114 = var113 >> 2;
                int var115 = var113 & 0x3;
                int var116 = class352.field5114.method857(255);
                byte var117 = class352.field5114.method825(98);
                byte var118 = class352.field5114.method806(-128);
                int var119 = class352.field5114.method798(false);
                int var120 = class352.field5114.method800(arg0 - 17160);
                byte var121 = class352.field5114.method825(98);
                int var122 = class352.field5114.method850(false);
                int var123 = (var122 >> 4 & 0x7) + class407.field5750;
                int var124 = (var122 & 0x7) + field6106;
                byte var125 = class352.field5114.method802(true);
                int var126 = class352.field5114.method812(3);
                if (!class59.field786.method864()) {
                    class370.method2377(var121, var120, (byte) 118, var123, var124, var116, var118, var126, var115, var125, var119, var117, var114);
                }
            }
            if (arg0 == 64) {
                if (class213.field3012 == 55) {
                    int var127 = class352.field5114.method837(true);
                    int var128 = (var127 >> 4 & 0x7) + class407.field5750;
                    int var129 = (var127 & 0x7) + field6106;
                    int var130 = class352.field5114.method798(false);
                    if (var130 == 65535) {
                        var130 = -1;
                    }
                    int var131 = class352.field5114.method837(true);
                    int var132 = (var131 & 0xF7) >> 4;
                    int var133 = var131 & 0x7;
                    int var134 = class352.field5114.method837(true);
                    int var135 = class352.field5114.method837(true);
                    if (var128 >= 0 && var129 >= 0 && class80.field1034 > var128 && var129 < class381.field5414) {
                        int var136 = var132 + 1;
                        if ((var128 - var136) <= class181.field2555.field4595[0] && class181.field2555.field4595[0] <= (var128 + var136) && class181.field2555.field4601[0] >= var129 - var136 && (var129 + var136) >= class181.field2555.field4601[0] && class170.field2398 != 0 && var133 > 0 && class221.field3176 < 50 && var130 != -1) {
                            class23.field293[class221.field3176] = var130;
                            class265.field3892[class221.field3176] = var133;
                            class32.field411[class221.field3176] = var134;
                            class259.field3830[class221.field3176] = null;
                            class430.field6122[class221.field3176] = (var128 << 16) - (-(var129 << 8) - var132);
                            class168.field2384[class221.field3176] = var135;
                            class221.field3176++;
                        }
                    }
                } else if (class213.field3012 == 225) {
                    int var137 = class352.field5114.method837(true);
                    int var138 = (var137 >> 4 & 0x7) + class407.field5750;
                    int var139 = (var137 & 0x7) + field6106;
                    int var140 = var138 + class352.field5114.method823((byte) -35);
                    int var141 = class352.field5114.method823((byte) 125) + var139;
                    int var142 = class352.field5114.method844(arg0 ^ 0x29A2AF88);
                    int var143 = class352.field5114.method798(false);
                    int var144 = class352.field5114.method837(true) * 4;
                    int var145 = class352.field5114.method837(true) * 4;
                    int var146 = class352.field5114.method798(false);
                    int var147 = class352.field5114.method798(false);
                    int var148 = class352.field5114.method837(true);
                    if (var148 == 255) {
                        var148 = -1;
                    }
                    int var149 = class352.field5114.method837(true);
                    if (var138 >= 0 && var139 >= 0 && var138 < class80.field1034 && var139 < class381.field5414 && var140 >= 0 && var141 >= 0 && class80.field1034 > var140 && var141 < class381.field5414 && var143 != 65535) {
                        int var150 = var139 * 128 + 64;
                        int var151 = var138 * 128 + 64;
                        int var152 = var141 * 128 + 64;
                        int var153 = var140 * 128 + 64;
                        class431 var154 = new class431(var143, class158.field2302, var151, var150, class452.method2820(class158.field2302, var150, false, var151) - var144, var146 - -class34.field434, class34.field434 + var147, var148, var149, var142, var145);
                        var154.method2688(var152, var153, class452.method2820(class158.field2302, var152, false, var153) - var145, class34.field434 + var146, arg0 ^ 0x13);
                        class335.field4860.method2756(-94, new class359(var154));
                    }
                } else if (class213.field3012 == 130) {
                    int var155 = class352.field5114.method809(false);
                    int var156 = class352.field5114.method809(false);
                    int var157 = class352.field5114.method848(255);
                    int var158 = (var157 >> 4 & 0x7) + class407.field5750;
                    int var159 = field6106 + (var157 & 0x7);
                    int var160 = class352.field5114.method812(arg0 ^ 0x43);
                    if (var158 >= 0 && var159 >= 0 && var158 < class80.field1034 && class381.field5414 > var159 && class302.field4417 != var156) {
                        class319.method2120(var158, var159, new class122(var155, var160), -39, class158.field2302);
                        class122.method738(class158.field2302, var158, var159, (byte) 59);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
    public static final void method2674(int arg0) {
        if (class56.field746 && class16.field247.method1758(-501, 81) && class381.field5412 > 2) {
            class80.method475((byte) -6, (class382) class228.field3392.field6329.field6072.field6072);
        } else {
            class80.method475((byte) -6, (class382) class228.field3392.field6329.field6072);
        }
        field6104++;
        if (arg0 != 65535) {
            field6097 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
    public static final void method2675(int arg0) {
        class349.field5079.method98(0);
        if (arg0 != 7) {
            method2673(-84);
        }
        field6102++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZII)V")
    public static final void method2676(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field6103++;
            class276 var3 = class264.method1816((byte) -126, arg1, 7);
            var3.method1876((byte) -123);
            var3.field3986 = arg2;
        }
    }
}
