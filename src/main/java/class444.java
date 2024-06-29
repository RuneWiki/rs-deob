import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class444 extends class376 {

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "Lbq;")
    public class190 field6579;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public int field6574;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public static int field6577 = 0;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "F")
    public static float field6576;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)Z")
    public abstract boolean method719(byte arg0);

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
    public static final void method2705(boolean arg0) {
        field6573++;
        class4.field60 = class131.method1003(8, arg0, 35, -69, 8, 0.4F, 2048, 4);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2706(int arg0, String arg1, int arg2) {
        field6580++;
        class215 var3 = class171.method1208(arg2, (byte) 127, 2);
        var3.method1465(-25852);
        var3.field3080 = arg1;
        int var4 = 89 % ((-arg0 - 7) / 42);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)I")
    public static final int method2707(int arg0, int arg1, int arg2) {
        field6578++;
        if (arg0 == 1 || arg0 == 3) {
            return class20.field227[arg1 & 0x3];
        } else if (arg2 == 31654) {
            return class265.field3913[arg1 & 0x3];
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method718(byte arg0);

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lbq;I)V")
    public class444(class190 arg0, int arg1) {
        this.field6579 = arg0;
        this.field6574 = arg1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILbf;)V")
    public static final void method2708(int arg0, class372 arg1) {
        field6575++;
        if (class213.field3065 == arg1) {
            int var2 = class85.field1163.method623((byte) 97);
            int var3 = class85.field1163.method577(255);
            class384.field5645.method786(var2, 0).method1515((byte) -126, var3);
        } else if (class354.field4946 == arg1) {
            int var4 = class85.field1163.method625(116);
            int var5 = class85.field1163.method635(952968608);
            int var6 = class85.field1163.method577(255);
            int var7 = class109.field1550 + ((var6 & 0x70) >> 4);
            int var8 = (var6 & 0x7) + class436.field6395;
            if (var7 >= 0 && var8 >= 0 && var7 < class397.field5828 && class457.field6713 > var8) {
                class324.method2002(new class203(var5, var4), var7, var8, (byte) 116, class92.field1271);
                class325.method2012(class92.field1271, 1546660647, var7, var8);
            }
        } else if (class182.field2578 == arg1) {
            class85.field1163.method577(255);
            int var9 = class85.field1163.method577(255);
            int var10 = class109.field1550 + ((var9 & 0x72) >> 4);
            int var11 = (var9 & 0x7) + class436.field6395;
            int var12 = class85.field1163.method623((byte) 109);
            int var13 = class85.field1163.method577(255);
            int var14 = class85.field1163.method580((byte) 29);
            String var15 = class85.field1163.method624((byte) -40);
            class347.method2099(var14, var12, class92.field1271, var10, false, var11, var13, var15);
        } else if (class306.field4342 == arg1) {
            int var16 = class85.field1163.method577(255);
            boolean var17 = (var16 & 0x80) != 0;
            int var18 = ((var16 & 0x3E) >> 3) + class109.field1550;
            int var19 = (var16 & 0x7) + class436.field6395;
            int var20 = class85.field1163.method629(false) + var18;
            int var21 = var19 + class85.field1163.method629(false);
            int var22 = class85.field1163.method599((byte) 1);
            int var23 = class85.field1163.method623((byte) 120);
            int var24 = class85.field1163.method577(255) * 4;
            int var25 = class85.field1163.method577(255) * 4;
            int var26 = class85.field1163.method623((byte) 111);
            int var27 = class85.field1163.method623((byte) 91);
            int var28 = class85.field1163.method577(255);
            if (var28 == 255) {
                var28 = -1;
            }
            int var29 = class85.field1163.method577(255);
            if (var18 >= 0 && var19 >= 0 && class397.field5828 > var18 && class457.field6713 > var19 && var20 >= 0 && var21 >= 0 && class397.field5828 > var20 && var21 < class457.field6713 && var23 != 65535) {
                int var30 = var18 * 128 + 64;
                int var31 = var21 * 128 + 64;
                int var32 = var24 << 0;
                int var33 = var19 * 128 + 64;
                int var34 = var20 * 128 + 64;
                int var35 = var25 << 0;
                class107 var36 = new class107(var23, class92.field1271, var30, var33, var32, class263.field3867 + var26, class263.field3867 + var27, var28, var29, var22, var35, var17);
                var36.method888(class263.field3867 + var26, var34, class66.method643(var34, 62, class92.field1271, var31) - var35, var31, 98);
                class372.field5532.method1015(false, new class289(var36));
            }
        } else if (class104.field1446 == arg1) {
            int var37 = class85.field1163.method602((byte) 55);
            int var38 = class85.field1163.method610(-101);
            int var39 = (var38 >> 4 & 0x7) + class109.field1550;
            int var40 = class436.field6395 + (var38 & 0x7);
            if (var39 >= 0 && var40 >= 0 && class397.field5828 > var39 && var40 < class457.field6713) {
                class518 var41 = (class518) class89.field1216.method875((long) (class92.field1271 << 28 | var40 << 14 | var39), 125);
                if (var41 != null) {
                    for (class203 var42 = (class203) var41.field7628.method1018(37); var42 != null; var42 = (class203) var41.field7628.method1022((byte) -112)) {
                        if ((var37 & 0x7FFF) == var42.field2939) {
                            var42.method1525((byte) -121);
                            break;
                        }
                    }
                    if (var41.field7628.method1025((byte) -124)) {
                        var41.method1525((byte) 89);
                    }
                    class325.method2012(class92.field1271, 1546660647, var39, var40);
                }
            }
        } else if (class276.field4068 == arg1) {
            int var43 = class85.field1163.method635(952968608);
            byte var44 = class85.field1163.method594(0);
            int var45 = class85.field1163.method610(-99);
            int var46 = var45 >> 2;
            int var47 = var45 & 0x3;
            int var48 = class85.field1163.method607(27574);
            int var49 = class109.field1550 + ((var48 & 0x77) >> 4);
            int var50 = (var48 & 0x7) + class436.field6395;
            byte var51 = class85.field1163.method636(-113);
            int var52 = class85.field1163.method590((byte) -53);
            byte var53 = class85.field1163.method594(0);
            int var54 = class85.field1163.method602((byte) 55);
            int var55 = class85.field1163.method602((byte) 55);
            byte var56 = class85.field1163.method594(0);
            if (!class225.field3300.method298()) {
                class126.method987(var49, var43, var47, -81, var53, var44, var52, var56, class92.field1271, var51, var50, var55, var54, var46);
            }
        } else if (class171.field2437 == arg1) {
            int var57 = class85.field1163.method607(27574);
            int var58 = var57 >> 2;
            int var59 = var57 & 0x3;
            int var60 = class185.field2596[var58];
            int var61 = class85.field1163.method576((byte) 126);
            int var62 = class109.field1550 + (var61 >> 4 & 0x7);
            int var63 = (var61 & 0x7) + class436.field6395;
            if (class377.method2314(class507.field7494, -105) || var62 >= 0 && var63 >= 0 && class397.field5828 > var62 && var63 < class457.field6713) {
                class486.method2923(var62, -1, var58, -1, var60, var63, -110, class92.field1271, var59, 0);
            }
        } else if (class482.field7087 == arg1) {
            int var64 = class85.field1163.method577(255);
            int var65 = class109.field1550 * 2 + (var64 >> 4 & 0xF);
            int var66 = (var64 & 0xF) + class436.field6395 * 2;
            boolean var67 = class85.field1163.method577(255) != 0;
            int var68 = class85.field1163.method629(false) + var65;
            int var69 = var66 + class85.field1163.method629(false);
            int var70 = class85.field1163.method599((byte) 1);
            int var71 = class85.field1163.method599((byte) 1);
            int var72 = class85.field1163.method623((byte) -52);
            byte var73 = class85.field1163.method629(false);
            int var74 = class85.field1163.method577(255) * 4;
            int var75 = class85.field1163.method623((byte) 89);
            int var76 = class85.field1163.method623((byte) -128);
            int var77 = class85.field1163.method577(255);
            if (var77 == 255) {
                var77 = -1;
            }
            int var78 = class85.field1163.method577(255);
            if (var65 >= 0 && var66 >= 0 && var65 < (class397.field5828 * 2) && class397.field5828 * 2 > var66 && var68 >= 0 && var69 >= 0 && var68 < class457.field6713 * 2 && class457.field6713 * 2 > var69 && var72 != 65535) {
                int var79 = var68 * 64;
                int var80 = var66 * 64;
                int var81 = var69 * 64;
                int var82 = var73 << 0;
                int var83 = var74 << 0;
                int var84 = var65 * 64;
                if (var70 != 0) {
                    int var87;
                    class121 var88;
                    if (var70 < 0) {
                        int var85 = -var70 - 1;
                        int var86 = var85 & 0x7FF;
                        var87 = var85 >> 11 & 0xF;
                        if (class396.field5815 == var86) {
                            var88 = class435.field6375;
                        } else {
                            var88 = class384.field5647[var86];
                        }
                    } else {
                        int var89 = var70 - 1;
                        var87 = var89 >> 11 & 0xF;
                        int var90 = var89 & 0x7FF;
                        var88 = class250.field3690[var90];
                    }
                    if (var88 != null) {
                        class531 var91 = var88.method969(-1);
                        if (var91.field7796 != null && var91.field7796[var87] != null) {
                            int var92 = var91.field7796[var87][0];
                            int var93 = var91.field7796[var87][2];
                            int var94 = var88.field1718.method1994(-105);
                            int var95 = class340.field4724[var94];
                            int var96 = class340.field4715[var94];
                            int var97 = var92 * var96 + var93 * var95 >> 15;
                            int var98 = var93 * var96 - var92 * var95 >> 15;
                            var84 += var97;
                            var82 -= var91.field7796[var87][1];
                            var80 += var98;
                        }
                    }
                }
                class107 var100 = new class107(var72, class92.field1271, var84, var80, var82, class263.field3867 + var75, var76 - -class263.field3867, var77, var78, var71, var83, var67);
                var100.method888(var75 + class263.field3867, var79, class66.method643(var79, 57, class92.field1271, var81) - var83, var81, 70);
                class372.field5532.method1015(false, new class289(var100));
            }
        } else if (class102.field1431 == arg1) {
            int var101 = class85.field1163.method577(255);
            int var102 = ((var101 & 0x73) >> 4) + class109.field1550;
            int var103 = (var101 & 0x7) + class436.field6395;
            int var104 = class85.field1163.method623((byte) -42);
            if (var104 == 65535) {
                var104 = -1;
            }
            int var105 = class85.field1163.method577(255);
            int var106 = var105 >> 4 & 0xF;
            int var107 = var105 & 0x7;
            int var108 = class85.field1163.method577(255);
            int var109 = class85.field1163.method577(255);
            if (var102 >= 0 && var103 >= 0 && var102 < class397.field5828 && class457.field6713 > var103) {
                int var110 = var106 + 1;
                if (class435.field6375.field1777[0] >= (var102 - var110) && var102 + var110 >= class435.field6375.field1777[0] && (var103 - var110) <= class435.field6375.field1778[0] && (var103 + var110) >= class435.field6375.field1778[0]) {
                    class81.method732(var109, var104, var108, -27348, var107, (class92.field1271 << 24) + (var103 << 8) + (var102 << 16) + var106);
                }
            }
        } else if (class276.field4069 == arg1) {
            int var111 = class85.field1163.method577(255);
            int var112 = (var111 >> 4 & 0x7) + class109.field1550;
            int var113 = (var111 & 0x7) + class436.field6395;
            int var114 = class85.field1163.method623((byte) -34);
            int var115 = class85.field1163.method577(255);
            int var116 = class85.field1163.method623((byte) 91);
            int var117 = class85.field1163.method577(255);
            if (var112 >= 0 && var113 >= 0 && class397.field5828 > var112 && class457.field6713 > var113) {
                int var118 = var112 * 128 + 64;
                int var119 = var113 * 128 + 64;
                int var120 = class92.field1271;
                if (var120 < 3 && class274.method1765(var112, -29792, var113)) {
                    var120++;
                }
                class495 var121 = new class495(var114, var116, class263.field3867, class92.field1271, var120, var118, class66.method643(var118, 64, class92.field1271, var119) - var115, var119, var112, var112, var113, var113, var117);
                class125.field1824.method1015(false, new class138(var121));
            }
        } else if (class9.field113 == arg1) {
            int var122 = class85.field1163.method577(255);
            int var123 = ((var122 & 0x74) >> 4) + class109.field1550;
            int var124 = class436.field6395 + (var122 & 0x7);
            int var125 = class85.field1163.method623((byte) -29);
            int var126 = class85.field1163.method623((byte) 113);
            int var127 = class85.field1163.method623((byte) 110);
            if (class89.field1216 != null && var123 >= 0 && var124 >= 0 && class397.field5828 > var123 && var124 < class457.field6713) {
                class518 var128 = (class518) class89.field1216.method875((long) (var123 | var124 << 14 | class92.field1271 << 28), 125);
                if (var128 != null) {
                    for (class203 var129 = (class203) var128.field7628.method1018(88); var129 != null; var129 = (class203) var128.field7628.method1022((byte) -112)) {
                        if ((var125 & 0x7FFF) == var129.field2939 && var129.field2940 == var126) {
                            var129.method1525((byte) 72);
                            var129.field2940 = var127;
                            class324.method2002(var129, var123, var124, (byte) 116, class92.field1271);
                            break;
                        }
                    }
                    class325.method2012(class92.field1271, 1546660647, var123, var124);
                }
            }
        } else if (class85.field1157 == arg1) {
            int var130 = class85.field1163.method576((byte) 19);
            int var131 = var130 >> 2;
            int var132 = var130 & 0x3;
            int var133 = class185.field2596[var131];
            int var134 = class85.field1163.method635(952968608);
            int var135 = class85.field1163.method607(27574);
            int var136 = (var135 >> 4 & 0x7) + class109.field1550;
            int var137 = (var135 & 0x7) + class436.field6395;
            if (class377.method2314(class507.field7494, -103) || var136 >= 0 && var137 >= 0 && class397.field5828 > var136 && var137 < class457.field6713) {
                class486.method2923(var136, -1, var131, var134, var133, var137, -119, class92.field1271, var132, 0);
            }
        } else if (class511.field7546 == arg1) {
            int var138 = class85.field1163.method623((byte) -74);
            if (var138 == 65535) {
                var138 = -1;
            }
            int var139 = class85.field1163.method610(-125);
            int var140 = (var139 >> 4 & 0x7) + class109.field1550;
            int var141 = (var139 & 0x7) + class436.field6395;
            int var142 = class85.field1163.method610(-127);
            int var143 = var142 >> 2;
            int var144 = var142 & 0x3;
            int var145 = class185.field2596[var143];
            class123.method975(class92.field1271, var144, (byte) -89, var138, var145, var143, var140, var141);
        } else if (class112.field1579 == arg1) {
            int var146 = class85.field1163.method623((byte) -27);
            int var147 = class85.field1163.method623((byte) -113);
            int var148 = class85.field1163.method576((byte) 124);
            int var149 = (var148 >> 4 & 0x7) + class109.field1550;
            int var150 = (var148 & 0x7) + class436.field6395;
            int var151 = class85.field1163.method625(123);
            if (var149 >= 0 && var150 >= 0 && class397.field5828 > var149 && class457.field6713 > var150 && class396.field5815 != var147) {
                class324.method2002(new class203(var146, var151), var149, var150, (byte) 125, class92.field1271);
                class325.method2012(class92.field1271, 1546660647, var149, var150);
            }
        } else {
            if (arg0 < 35) {
                method2705(false);
            }
            if (class523.field7689 == arg1) {
                int var152 = class85.field1163.method577(255);
                int var153 = (var152 >> 4 & 0xF) + class109.field1550 * 2;
                int var154 = (var152 & 0xF) + class436.field6395 * 2;
                boolean var155 = class85.field1163.method577(255) != 0;
                int var156 = class85.field1163.method629(false) + var153;
                int var157 = class85.field1163.method629(false) + var154;
                int var158 = class85.field1163.method599((byte) 1);
                int var159 = class85.field1163.method623((byte) 118);
                int var160 = class85.field1163.method577(255) * 4;
                int var161 = class85.field1163.method577(255) * 4;
                int var162 = class85.field1163.method623((byte) 106);
                int var163 = class85.field1163.method623((byte) 101);
                int var164 = class85.field1163.method577(255);
                if (var164 == 255) {
                    var164 = -1;
                }
                int var165 = class85.field1163.method577(255);
                if (var153 >= 0 && var154 >= 0 && var153 < class397.field5828 * 2 && var154 < (class397.field5828 * 2) && var156 >= 0 && var157 >= 0 && var156 < (class457.field6713 * 2) && var157 < class457.field6713 * 2 && var159 != 65535) {
                    int var166 = var157 * 64;
                    int var167 = var161 << 0;
                    int var168 = var154 * 64;
                    int var169 = var153 * 64;
                    int var170 = var156 * 64;
                    int var171 = var160 << 0;
                    class107 var172 = new class107(var159, class92.field1271, var169, var168, var171, class263.field3867 + var162, var163 - -class263.field3867, var164, var165, var158, var167, var155);
                    var172.method888(class263.field3867 + var162, var170, class66.method643(var170, -96, class92.field1271, var166) - var167, var166, 52);
                    class372.field5532.method1015(false, new class289(var172));
                }
            } else {
                class194.method1362(null, "T3 - " + arg1, 74);
                class531.method3135(2700);
            }
        }
    }
}
