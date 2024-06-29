import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class524 {

    @OriginalMember(owner = "client!po", name = "b", descriptor = "Lmga;")
    private class666 field6985 = new class666(64);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "Lbi;")
    private class449 field6984;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public int field6986;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!po", name = "e", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!po", name = "i", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!po", name = "j", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!po", name = "k", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)I")
    public static final int method2927(int arg0, int arg1) {
        if (arg0 != 2) {
            field6992 = -118;
        }
        field6990++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BI)V")
    public final void method2928(byte arg0, int arg1) {
        class666 var3 = this.field6985;
        synchronized (this.field6985) {
            if (arg0 != -107) {
                return;
            }
            this.field6985.method3740((byte) 60, arg1);
        }
        field6995++;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)Lhc;")
    public final class129 method2929(int arg0, byte arg1) {
        field6989++;
        if (arg1 <= 15) {
            field6992 = 10;
        }
        class666 var3 = this.field6985;
        class129 var4;
        synchronized (this.field6985) {
            var4 = (class129) this.field6985.method3750((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field6984;
        byte[] var6;
        synchronized (this.field6984) {
            var6 = this.field6984.method2537(false, 16, arg0);
        }
        class129 var7 = new class129();
        if (var6 != null) {
            var7.method986(new class335(var6), false);
        }
        class666 var8 = this.field6985;
        synchronized (this.field6985) {
            this.field6985.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V")
    public final void method2930(byte arg0) {
        field6994++;
        class666 var2 = this.field6985;
        synchronized (this.field6985) {
            this.field6985.method3739(0);
        }
        if (arg0 != 112) {
            method2933((byte) -113, 119);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lqw;I)V")
    public static final void method2931(class71 arg0, int arg1) {
        field6991++;
        if (class690.field9709 == arg0) {
            int var2 = class439.field6039.method1996(false);
            int var3 = class439.field6039.method2034(255);
            int var4 = (var3 & 0x7) + class139.field2249;
            int var5 = class233.field3269 + var4;
            int var6 = class618.field8194 + ((var3 & 0x70) >> 4);
            int var7 = class473.field6334 + var6;
            int var8 = class439.field6039.method1996(false);
            boolean var9 = var6 >= 0 && var4 >= 0 && var6 < class34.field530 && class34.field531 > var4;
            if (var9 || class412.method2364(class409.field5528, false)) {
                class701.method3880(var7, (byte) 119, var5, class417.field5712, new class418(var8, var2));
                if (var9) {
                    class454.method2593(var6, var4, 114, class417.field5712);
                }
            }
        } else if (class305.field4228 == arg0) {
            int var10 = class439.field6039.method2034(255);
            int var11 = ((var10 & 0xF1) >> 4) + class618.field8194 * 2;
            int var12 = class139.field2249 * 2 + (var10 & 0xF);
            boolean var13 = class439.field6039.method2034(255) != 0;
            int var14 = var11 + class439.field6039.method2040(-76);
            int var15 = class439.field6039.method2040(-44) + var12;
            int var16 = class439.field6039.method2022(-29089);
            int var17 = class439.field6039.method2001((byte) -83);
            int var18 = class439.field6039.method2034(255) * 4;
            int var19 = class439.field6039.method2034(255) * 4;
            int var20 = class439.field6039.method2001((byte) -83);
            int var21 = class439.field6039.method2001((byte) -83);
            int var22 = class439.field6039.method2034(255);
            if (var22 == 255) {
                var22 = -1;
            }
            int var23 = class439.field6039.method2001((byte) -83);
            if (var11 >= 0 && var12 >= 0 && var11 < (class34.field530 * 2) && class34.field530 * 2 > var12 && var14 >= 0 && var15 >= 0 && (class34.field531 * 2) > var14 && class34.field531 * 2 > var15 && var17 != 65535) {
                int var24 = var11 * 256;
                int var25 = var18 << 2;
                int var26 = var12 * 256;
                int var27 = var14 * 256;
                int var28 = var23 << 2;
                int var29 = var15 * 256;
                int var30 = var19 << 2;
                class699 var31 = new class699(var17, class417.field5712, var24, var26, var25, class642.field8626 + var20, class642.field8626 + var21, var22, var28, var16, var30, var13);
                var31.method3867(class642.field8626 + var20, var27, var29, class315.method1878(var27, 2921, class417.field5712, var29) - var30, -18574);
                class356.field4832.method3265(new class389(var31), (byte) -92);
            }
        } else if (class308.field4241 == arg0) {
            int var32 = class439.field6039.method1996(false);
            int var33 = class439.field6039.method2033(5051);
            int var34 = (var33 & 0x7) + class139.field2249;
            int var35 = class233.field3269 + var34;
            int var36 = ((var33 & 0x76) >> 4) + class618.field8194;
            int var37 = class473.field6334 + var36;
            class354 var38 = (class354) class262.field3643.method2918((long) (var37 | class417.field5712 << 28 | var35 << 14), (byte) 97);
            if (var38 != null) {
                for (class418 var39 = (class418) var38.field4816.method3257(-114); var39 != null; var39 = (class418) var38.field4816.method3263((byte) -84)) {
                    if ((var32 & 0x7FFF) == var39.field5719) {
                        var39.method2797(-103);
                        break;
                    }
                }
                if (var38.field4816.method3254((byte) 32)) {
                    var38.method2797(37);
                }
                if (var36 >= 0 && var34 >= 0 && var36 < class34.field530 && class34.field531 > var34) {
                    class454.method2593(var36, var34, 100, class417.field5712);
                }
            }
        } else if (class516.field6891 == arg0) {
            class439.field6039.method2034(255);
            int var40 = class439.field6039.method2034(255);
            int var41 = ((var40 & 0x7D) >> 4) + class618.field8194;
            int var42 = (var40 & 0x7) + class139.field2249;
            int var43 = class439.field6039.method2001((byte) -83);
            int var44 = class439.field6039.method2034(255);
            int var45 = class439.field6039.method2042((byte) 53);
            String var46 = class439.field6039.method2029((byte) -80);
            class540.method2984(var43, var42, var45, var46, class417.field5712, var44, (byte) -106, var41);
        } else if (class326.field4504 == arg0) {
            int var47 = class439.field6039.method2034(255);
            int var48 = ((var47 & 0x7D) >> 4) + class618.field8194;
            int var49 = (var47 & 0x7) + class139.field2249;
            int var50 = class439.field6039.method2001((byte) -83);
            int var51 = class439.field6039.method2034(255);
            int var52 = class439.field6039.method2001((byte) -83);
            int var53 = class439.field6039.method2034(255);
            if (var48 >= 0 && var49 >= 0 && class34.field530 > var48 && class34.field531 > var49) {
                int var54 = var48 * 512 + 256;
                int var55 = var49 * 512 + 256;
                int var56 = class417.field5712;
                if (var56 < 3 && class69.method541(0, var49, var48)) {
                    var56++;
                }
                class236 var57 = new class236(var50, var52, class642.field8626, class417.field5712, var56, var54, class315.method1878(var54, 2921, class417.field5712, var55) - var51, var55, var48, var48, var49, var49, var53);
                class666.field9449.method3265(new class99(var57), (byte) -111);
            }
        } else if (class72.field1128 == arg0) {
            int var58 = class439.field6039.method2034(255);
            int var59 = ((var58 & 0x79) >> 4) + class618.field8194;
            int var60 = (var58 & 0x7) + class139.field2249;
            int var61 = class439.field6039.method2001((byte) -83);
            if (var61 == 65535) {
                var61 = -1;
            }
            int var62 = class439.field6039.method2034(255);
            int var63 = (var62 & 0xFA) >> 4;
            int var64 = var62 & 0x7;
            int var65 = class439.field6039.method2034(255);
            int var66 = class439.field6039.method2034(255);
            if (var59 >= 0 && var60 >= 0 && var59 < class34.field530 && var60 < class34.field531) {
                int var67 = var63 + 1;
                if (var59 - var67 <= class199.field2897.field5643[0] && class199.field2897.field5643[0] <= var59 + var67 && class199.field2897.field5649[0] >= (var60 - var67) && class199.field2897.field5649[0] <= var60 + var67) {
                    class526.method2936(var64, (var60 << 8) + ((class417.field5712 << 24) + (var59 << 16)) + var63, var61, false, var65, var66);
                }
            }
        } else if (class307.field4237 == arg0) {
            int var68 = class439.field6039.method2034(255);
            boolean var69 = (var68 & 0x80) != 0;
            int var70 = ((var68 & 0x3D) >> 3) + class618.field8194;
            int var71 = (var68 & 0x7) + class139.field2249;
            int var72 = var70 + class439.field6039.method2040(-113);
            int var73 = var71 + class439.field6039.method2040(-75);
            int var74 = class439.field6039.method2022(-29089);
            int var75 = class439.field6039.method2001((byte) -83);
            int var76 = class439.field6039.method2034(255) * 4;
            int var77 = class439.field6039.method2034(255) * 4;
            int var78 = class439.field6039.method2001((byte) -83);
            int var79 = class439.field6039.method2001((byte) -83);
            int var80 = class439.field6039.method2034(255);
            int var81 = class439.field6039.method2001((byte) -83);
            if (var80 == 255) {
                var80 = -1;
            }
            if (var70 >= 0 && var71 >= 0 && class34.field530 > var70 && var71 < class34.field531 && var72 >= 0 && var73 >= 0 && class34.field530 > var72 && class34.field531 > var73 && var75 != 65535) {
                int var82 = var81 << 2;
                int var83 = var77 << 2;
                int var84 = var73 * 512 + 256;
                int var85 = var76 << 2;
                int var86 = var71 * 512 + 256;
                int var87 = var72 * 512 + 256;
                int var88 = var70 * 512 + 256;
                class699 var89 = new class699(var75, class417.field5712, var88, var86, var85, class642.field8626 + var78, class642.field8626 + var79, var80, var82, var74, var83, var69);
                var89.method3867(var78 + class642.field8626, var87, var84, class315.method1878(var87, 2921, class417.field5712, var84) - var83, -18574);
                class356.field4832.method3265(new class389(var89), (byte) -61);
            }
        } else if (class314.field4310 == arg0) {
            int var90 = class439.field6039.method2001((byte) -83);
            int var91 = class439.field6039.method2013(-9);
            int var92 = class439.field6039.method1999((byte) -3);
            byte var93 = class439.field6039.method2044(79);
            int var94 = class439.field6039.method1996(false);
            byte var95 = class439.field6039.method2023((byte) 46);
            byte var96 = class439.field6039.method2044(-43);
            int var97 = class439.field6039.method2034(255);
            int var98 = class618.field8194 + ((var97 & 0x71) >> 4);
            int var99 = (var97 & 0x7) + class139.field2249;
            int var100 = class439.field6039.method2046((byte) 62);
            int var101 = var100 >> 2;
            int var102 = var100 & 0x3;
            byte var103 = class439.field6039.method2040(-54);
            if (!class10.field197.method396()) {
                class254.method1555(var102, class417.field5712, var99, var94, var91, var92, -2, var90, var96, var98, var101, var103, var95, var93);
            }
        } else if (class252.field3466 == arg0) {
            int var104 = class439.field6039.method2034(255);
            int var105 = ((var104 & 0x72) >> 4) + class618.field8194;
            int var106 = class139.field2249 + (var104 & 0x7);
            int var107 = class439.field6039.method2001((byte) -83);
            if (var107 == 65535) {
                var107 = -1;
            }
            int var108 = class439.field6039.method2034(255);
            int var109 = var108 >> 4 & 0xF;
            int var110 = var108 & 0x7;
            int var111 = class439.field6039.method2034(255);
            int var112 = class439.field6039.method2034(255);
            if (var105 >= 0 && var106 >= 0 && var105 < class34.field530 && var106 < class34.field531) {
                int var113 = var109 + 1;
                if (class199.field2897.field5643[0] >= (var105 - var113) && var105 + var113 >= class199.field2897.field5643[0] && class199.field2897.field5649[0] >= (var106 - var113) && class199.field2897.field5649[0] <= (var106 + var113)) {
                    class265.method1617(var107, var110, false, (var105 << 16) + ((class417.field5712 << 24) + (var106 << 8)) + var109, var111, var112, 112);
                }
            }
        } else if (class266.field3698 == arg0) {
            int var114 = class439.field6039.method2034(255);
            int var115 = ((var114 & 0xF5) >> 4) + class618.field8194 * 2;
            int var116 = class139.field2249 * 2 + (var114 & 0xF);
            int var117 = class439.field6039.method2034(255);
            boolean var118 = (var117 & 0x1) != 0;
            int var119 = var117 >> 1;
            int var120 = class439.field6039.method2040(-73) + var115;
            int var121 = class439.field6039.method2040(-61) + var116;
            int var122 = class439.field6039.method2022(-29089);
            int var123 = class439.field6039.method2022(-29089);
            int var124 = class439.field6039.method2001((byte) -83);
            byte var125 = class439.field6039.method2040(-118);
            int var126 = class439.field6039.method2034(255) * 4;
            int var127 = class439.field6039.method2001((byte) -83);
            int var128 = class439.field6039.method2001((byte) -83);
            int var129 = class439.field6039.method2034(255);
            int var130 = class439.field6039.method2001((byte) -83);
            if (var129 == 255) {
                var129 = -1;
            }
            if (var115 >= 0 && var116 >= 0 && var115 < (class34.field530 * 2) && var116 < class34.field530 * 2 && var120 >= 0 && var121 >= 0 && var120 < class34.field531 * 2 && var121 < (class34.field531 * 2) && var124 != 65535) {
                int var131 = var130 << 2;
                int var132 = var116 * 256;
                int var133 = var115 * 256;
                int var134 = var121 * 256;
                int var135 = var120 * 256;
                int var136 = var125 << 2;
                int var137 = var126 << 2;
                if (var122 != 0) {
                    class411 var138 = null;
                    if (var122 >= 0) {
                        int var139 = var122 - 1;
                        class280 var140 = (class280) class616.field8143.method2918((long) var139, (byte) 126);
                        if (var140 != null) {
                            var138 = var140.field3983;
                        }
                    } else {
                        int var141 = -var122 - 1;
                        if (class416.field5693 == var141) {
                            var138 = class199.field2897;
                        } else {
                            var138 = class572.field7601[var141];
                        }
                    }
                    if (var138 != null) {
                        class543 var142 = var138.method2353(-1);
                        if (var142.field7142 != null && var142.field7142[var119] != null) {
                            int var143 = var142.field7142[var119][0];
                            int var144 = var142.field7142[var119][2];
                            int var145 = var138.field5574.method3585(127);
                            int var146 = class126.field2116[var145];
                            int var147 = class126.field2105[var145];
                            int var148 = var144 * var146 + (var143 * var147) >> 14;
                            int var149 = var144 * var147 - (var143 * var146) >> 14;
                            var132 += var149;
                            var136 -= var142.field7142[var119][1];
                            var133 += var148;
                        }
                    }
                }
                class699 var151 = new class699(var124, class417.field5712, var133, var132, var136, class642.field8626 + var127, class642.field8626 + var128, var129, var131, var123, var137, var118);
                var151.method3867(class642.field8626 + var127, var135, var134, class315.method1878(var135, 2921, class417.field5712, var134) - var137, -18574);
                class356.field4832.method3265(new class389(var151), (byte) -79);
            }
        } else if (class418.field5722 == arg0) {
            int var152 = class439.field6039.method2001((byte) -83);
            int var153 = class439.field6039.method2034(255);
            class470.field6288.method1258(var152, (byte) -38).method482(var153, (byte) -61);
        } else if (class326.field4503 == arg0) {
            int var154 = class439.field6039.method2034(255);
            int var155 = class139.field2249 + (var154 & 0x7);
            int var156 = class233.field3269 + var155;
            int var157 = (var154 >> 4 & 0x7) + class618.field8194;
            int var158 = class473.field6334 + var157;
            int var159 = class439.field6039.method2001((byte) -83);
            int var160 = class439.field6039.method2001((byte) -83);
            int var161 = class439.field6039.method2001((byte) -83);
            if (class262.field3643 != null) {
                class354 var162 = (class354) class262.field3643.method2918((long) (var158 | var156 << 14 | class417.field5712 << 28), (byte) -126);
                if (var162 != null) {
                    for (class418 var163 = (class418) var162.field4816.method3257(-50); var163 != null; var163 = (class418) var162.field4816.method3263((byte) -91)) {
                        if ((var159 & 0x7FFF) == var163.field5719 && var163.field5720 == var160) {
                            var163.method2797(53);
                            var163.field5720 = var161;
                            class701.method3880(var158, (byte) 71, var156, class417.field5712, var163);
                            break;
                        }
                    }
                    if (var157 >= 0 && var155 >= 0 && class34.field530 > var157 && var155 < class34.field531) {
                        class454.method2593(var157, var155, 106, class417.field5712);
                    }
                }
            }
        } else {
            if (arg1 > -18) {
                field6992 = 42;
            }
            if (class522.field6978 == arg0) {
                int var164 = class439.field6039.method2034(255);
                int var165 = var164 >> 2;
                int var166 = var164 & 0x3;
                int var167 = class216.field3088[var165];
                int var168 = class439.field6039.method2046((byte) 89);
                int var169 = class618.field8194 + (var168 >> 4 & 0x7);
                int var170 = (var168 & 0x7) + class139.field2249;
                if (class412.method2364(class409.field5528, false) || var169 >= 0 && var170 >= 0 && var169 < class34.field530 && class34.field531 > var170) {
                    class217.method1382(-1, 0, -1, var165, class417.field5712, var170, var167, var166, var169, -128);
                }
            } else if (class140.field2257 == arg0) {
                int var171 = class439.field6039.method2046((byte) -110);
                int var172 = var171 >> 2;
                int var173 = var171 & 0x3;
                int var174 = class216.field3088[var172];
                int var175 = class439.field6039.method2034(255);
                int var176 = (var175 >> 4 & 0x7) + class618.field8194;
                int var177 = (var175 & 0x7) + class139.field2249;
                int var178 = class439.field6039.method1996(false);
                if (var178 == 65535) {
                    var178 = -1;
                }
                class378.method2218(var172, var174, var178, 123, var173, var177, class417.field5712, var176);
            } else if (class425.field5846 == arg0) {
                int var179 = class439.field6039.method2033(5051);
                int var180 = (var179 >> 4 & 0x7) + class618.field8194;
                int var181 = (var179 & 0x7) + class139.field2249;
                int var182 = class439.field6039.method2013(-96);
                int var183 = class439.field6039.method2033(5051);
                int var184 = var183 >> 2;
                int var185 = var183 & 0x3;
                int var186 = class216.field3088[var184];
                if (class412.method2364(class409.field5528, false) || var180 >= 0 && var181 >= 0 && var180 < class34.field530 && class34.field531 > var181) {
                    class217.method1382(-1, 0, var182, var184, class417.field5712, var181, var186, var185, var180, -128);
                }
            } else if (class502.field6716 == arg0) {
                int var187 = class439.field6039.method2001((byte) -83);
                int var188 = class439.field6039.method2024((byte) 121);
                int var189 = class439.field6039.method2013(101);
                int var190 = class439.field6039.method2046((byte) -121);
                int var191 = class139.field2249 + (var190 & 0x7);
                int var192 = var191 + class233.field3269;
                int var193 = (var190 >> 4 & 0x7) + class618.field8194;
                int var194 = class473.field6334 + var193;
                if (class416.field5693 != var187) {
                    boolean var195 = var193 >= 0 && var191 >= 0 && class34.field530 > var193 && class34.field531 > var191;
                    if (var195 || class412.method2364(class409.field5528, false)) {
                        class701.method3880(var194, (byte) 80, var192, class417.field5712, new class418(var188, var189));
                        if (var195) {
                            class454.method2593(var193, var191, 113, class417.field5712);
                        }
                    }
                }
            } else {
                class259.method1586(null, "T3 - " + arg0, (byte) 8);
                class55.method365((byte) -85, false);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V")
    public final void method2932(int arg0) {
        class666 var2 = this.field6985;
        synchronized (this.field6985) {
            this.field6985.method3748(6);
        }
        field6987++;
        int var3 = -108 % ((arg0 - 77) / 41);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(BI)V")
    public static final void method2933(byte arg0, int arg1) {
        class318.field4366 = arg1;
        field6993++;
        class48.field690.method3739(0);
        if (arg0 != 106) {
            method2927(50, -85);
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lpca;ILbi;)V")
    public class524(class671 arg0, int arg1, class449 arg2) {
        this.field6984 = arg2;
        if (this.field6984 == null) {
            this.field6986 = 0;
        } else {
            this.field6986 = this.field6984.method2527(0, 16);
        }
    }
}
