import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class93 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method902(int arg0, Random arg1, int arg2) {
        field1481++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class416.method2649(arg2, true)) {
            return (int) ((long) arg2 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            if (arg0 != 8047) {
                method902(-79, null, -34);
            }
            return class361.method2410(var4, 125, arg2);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lws;Z)V")
    public static final void method903(class328 arg0, boolean arg1) {
        field1482++;
        if (class72.field914 == arg0) {
            int var2 = class558.field8066.method75(-115);
            int var3 = var2 >> 2;
            int var4 = var2 & 0x3;
            int var5 = class150.field2487[var3];
            int var6 = class558.field8066.method33((byte) 99);
            int var7 = ((var6 & 0x7F) >> 4) + class618.field8748;
            int var8 = (var6 & 0x7) + class211.field3512;
            if (class429.method2717(255, class265.field4319) || var7 >= 0 && var8 >= 0 && var7 < class275.field4426 && var8 < class417.field6374) {
                class52.method586(var5, var3, 0, -1, var7, class371.field5822, (byte) -73, var4, -1, var8);
            }
        } else if (class499.field7320 == arg0) {
            int var9 = class558.field8066.method70(-9059);
            int var10 = ((var9 & 0x76) >> 4) + class618.field8748;
            int var11 = (var9 & 0x7) + class211.field3512;
            int var12 = class558.field8066.method67(12021);
            int var13 = class558.field8066.method70(-9059);
            int var14 = class558.field8066.method67(12021);
            int var15 = class558.field8066.method70(-9059);
            if (var10 >= 0 && var11 >= 0 && class275.field4426 > var10 && var11 < class417.field6374) {
                int var16 = var10 * 512 + 256;
                int var17 = var11 * 512 + 256;
                int var18 = class371.field5822;
                if (var18 < 3 && class437.method2774(true, var10, var11)) {
                    var18++;
                }
                class370 var19 = new class370(var12, var14, class562.field8084, class371.field5822, var18, var16, class202.method1568(var16, class371.field5822, var17, 2) - var13, var17, var10, var10, var11, var11, var15);
                class597.field8462.method3463((byte) -87, new class327(var19));
            }
        } else if (class70.field891 == arg0) {
            int var20 = class558.field8066.method78(true);
            int var21 = class558.field8066.method67(12021);
            int var22 = class558.field8066.method67(12021);
            int var23 = class558.field8066.method77((byte) -109);
            int var24 = (var23 & 0x7) + class211.field3512;
            int var25 = class626.field8855 + var24;
            int var26 = (var23 >> 4 & 0x7) + class618.field8748;
            int var27 = class612.field8702 + var26;
            if (class114.field1793 != var21) {
                boolean var28 = var26 >= 0 && var24 >= 0 && class275.field4426 > var26 && var24 < class417.field6374;
                if (var28 || class429.method2717(255, class265.field4319)) {
                    class105.method1001(new class559(var22, var20), var25, (byte) 8, class371.field5822, var27);
                    if (var28) {
                        class399.method2569(class371.field5822, false, var26, var24);
                    }
                }
            }
        } else if (class216.field3558 == arg0) {
            int var29 = class558.field8066.method70(-9059);
            boolean var30 = (var29 & 0x80) != 0;
            int var31 = class618.field8748 + (var29 >> 3 & 0x7);
            int var32 = (var29 & 0x7) + class211.field3512;
            int var33 = var31 + class558.field8066.method81(true);
            int var34 = class558.field8066.method81(true) + var32;
            int var35 = class558.field8066.method45(-8652);
            int var36 = class558.field8066.method67(12021);
            int var37 = class558.field8066.method70(-9059) * 4;
            int var38 = class558.field8066.method70(-9059) * 4;
            int var39 = class558.field8066.method67(12021);
            int var40 = class558.field8066.method67(12021);
            int var41 = class558.field8066.method70(-9059);
            int var42 = class558.field8066.method67(12021);
            if (var41 == 255) {
                var41 = -1;
            }
            if (var31 >= 0 && var32 >= 0 && var31 < class275.field4426 && var32 < class417.field6374 && var33 >= 0 && var34 >= 0 && class275.field4426 > var33 && class417.field6374 > var34 && var36 != 65535) {
                int var43 = var38 << 2;
                int var44 = var32 * 512 + 256;
                int var45 = var42 << 2;
                int var46 = var34 * 512 + 256;
                int var47 = var33 * 512 + 256;
                int var48 = var37 << 2;
                int var49 = var31 * 512 + 256;
                class99 var50 = new class99(var36, class371.field5822, class371.field5822, var49, var44, var48, class562.field8084 + var39, class562.field8084 + var40, var41, var45, var35, var43, var30);
                var50.method964(var39 + class562.field8084, 110, class202.method1568(var47, class371.field5822, var46, 2) - var43, var47, var46);
                class463.field6919.method3463((byte) -87, new class232(var50));
            }
        } else if (class126.field2058 == arg0) {
            int var51 = class558.field8066.method39((byte) 127);
            int var52 = class558.field8066.method33((byte) 99);
            int var53 = (var52 & 0x7) + class211.field3512;
            int var54 = class626.field8855 + var53;
            int var55 = (var52 >> 4 & 0x7) + class618.field8748;
            int var56 = class612.field8702 + var55;
            int var57 = class558.field8066.method39((byte) 124);
            boolean var58 = var55 >= 0 && var53 >= 0 && class275.field4426 > var55 && var53 < class417.field6374;
            if (var58 || class429.method2717(255, class265.field4319)) {
                class105.method1001(new class559(var51, var57), var54, (byte) 8, class371.field5822, var56);
                if (var58) {
                    class399.method2569(class371.field5822, false, var55, var53);
                }
            }
        } else if (class589.field8363 == arg0) {
            int var59 = class558.field8066.method68(12513);
            int var60 = class558.field8066.method77((byte) -77);
            int var61 = var60 >> 2;
            int var62 = var60 & 0x3;
            int var63 = class150.field2487[var61];
            int var64 = class558.field8066.method33((byte) 99);
            int var65 = class618.field8748 + (var64 >> 4 & 0x7);
            int var66 = (var64 & 0x7) + class211.field3512;
            if (class429.method2717(255, class265.field4319) || var65 >= 0 && var66 >= 0 && var65 < class275.field4426 && class417.field6374 > var66) {
                class52.method586(var63, var61, 0, var59, var65, class371.field5822, (byte) -73, var62, -1, var66);
            }
        } else if (class429.field6542 == arg0) {
            int var67 = class558.field8066.method70(-9059);
            int var68 = class618.field8748 + ((var67 & 0x78) >> 4);
            int var69 = class211.field3512 + (var67 & 0x7);
            int var70 = class558.field8066.method67(12021);
            if (var70 == 65535) {
                var70 = -1;
            }
            int var71 = class558.field8066.method70(-9059);
            int var72 = (var71 & 0xF5) >> 4;
            int var73 = var71 & 0x7;
            int var74 = class558.field8066.method70(-9059);
            int var75 = class558.field8066.method70(-9059);
            int var76 = class558.field8066.method67(12021);
            if (var68 >= 0 && var69 >= 0 && var68 < class275.field4426 && var69 < class417.field6374) {
                int var77 = var72 + 1;
                if (class567.field8141.field4264[0] >= var68 - var77 && class567.field8141.field4264[0] <= var68 + var77 && class567.field8141.field4265[0] >= var69 - var77 && class567.field8141.field4265[0] <= (var69 + var77)) {
                    class295.method2063(var74, var73, 0, (class371.field5822 << 24) + (var68 << 16) + (var69 << 8) + var72, var76, var70, var75);
                }
            }
        } else if (class588.field8350 == arg0) {
            int var78 = class558.field8066.method70(-9059);
            int var79 = (var78 >> 4 & 0xF) + class618.field8748 * 2;
            int var80 = class211.field3512 * 2 + (var78 & 0xF);
            boolean var81 = class558.field8066.method70(-9059) != 0;
            int var82 = class558.field8066.method81(true) + var79;
            int var83 = var80 + class558.field8066.method81(true);
            int var84 = class558.field8066.method45(-8652);
            int var85 = class558.field8066.method67(12021);
            int var86 = class558.field8066.method70(-9059) * 4;
            int var87 = class558.field8066.method70(-9059) * 4;
            int var88 = class558.field8066.method67(12021);
            int var89 = class558.field8066.method67(12021);
            int var90 = class558.field8066.method70(-9059);
            if (var90 == 255) {
                var90 = -1;
            }
            int var91 = class558.field8066.method67(12021);
            if (var79 >= 0 && var80 >= 0 && var79 < (class275.field4426 * 2) && (class275.field4426 * 2) > var80 && var82 >= 0 && var83 >= 0 && class417.field6374 * 2 > var82 && var83 < (class417.field6374 * 2) && var85 != 65535) {
                int var92 = var87 << 2;
                int var93 = var83 * 256;
                int var94 = var91 << 2;
                int var95 = var82 * 256;
                int var96 = var86 << 2;
                int var97 = var80 * 256;
                int var98 = var79 * 256;
                class99 var99 = new class99(var85, class371.field5822, class371.field5822, var98, var97, var96, var88 + class562.field8084, var89 - -class562.field8084, var90, var94, var84, var92, var81);
                var99.method964(class562.field8084 + var88, 117, class202.method1568(var95, class371.field5822, var93, 2) - var92, var95, var93);
                class463.field6919.method3463((byte) -87, new class232(var99));
            }
        } else if (class147.field2458 == arg0) {
            class558.field8066.method70(-9059);
            int var100 = class558.field8066.method70(-9059);
            int var101 = (var100 >> 4 & 0x7) + class618.field8748;
            int var102 = class211.field3512 + (var100 & 0x7);
            int var103 = class558.field8066.method67(12021);
            int var104 = class558.field8066.method70(-9059);
            int var105 = class558.field8066.method86(-111);
            String var106 = class558.field8066.method42((byte) -72);
            class413.method2632(-29801, class371.field5822, var102, var105, var101, var106, var103, var104);
        } else if (class180.field3030 == arg0) {
            int var107 = class558.field8066.method67(12021);
            int var108 = class558.field8066.method77((byte) -44);
            int var109 = (var108 & 0x7) + class211.field3512;
            int var110 = class626.field8855 + var109;
            int var111 = (var108 >> 4 & 0x7) + class618.field8748;
            int var112 = class612.field8702 + var111;
            class138 var113 = (class138) class290.field4590.method1558((long) (var112 | var110 << 14 | class371.field5822 << 28), (byte) -93);
            if (var113 != null) {
                for (class559 var114 = (class559) var113.field2332.method3465((byte) -75); var114 != null; var114 = (class559) var113.field2332.method3469(0)) {
                    if ((var107 & 0x7FFF) == var114.field8072) {
                        var114.method707((byte) -82);
                        break;
                    }
                }
                if (var113.field2332.method3464(0)) {
                    var113.method707((byte) -52);
                }
                if (var111 >= 0 && var109 >= 0 && var111 < class275.field4426 && var109 < class417.field6374) {
                    class399.method2569(class371.field5822, false, var111, var109);
                }
            }
        } else if (class458.field6851 == arg0) {
            int var115 = class558.field8066.method70(-9059);
            int var116 = (var115 >> 4 & 0x7) + class618.field8748;
            int var117 = class211.field3512 + (var115 & 0x7);
            int var118 = class558.field8066.method67(12021);
            if (var118 == 65535) {
                var118 = -1;
            }
            int var119 = class558.field8066.method70(-9059);
            int var120 = (var119 & 0xFD) >> 4;
            int var121 = var119 & 0x7;
            int var122 = class558.field8066.method70(-9059);
            int var123 = class558.field8066.method70(-9059);
            int var124 = class558.field8066.method67(12021);
            if (var116 >= 0 && var117 >= 0 && var116 < class275.field4426 && var117 < class417.field6374) {
                int var125 = var120 + 1;
                if ((var116 - var125) <= class567.field8141.field4264[0] && class567.field8141.field4264[0] <= (var116 + var125) && class567.field8141.field4265[0] >= var117 - var125 && class567.field8141.field4265[0] <= var117 + var125) {
                    class9.method192(var118, (var117 << 8) + (class371.field5822 << 24) + (var116 << 16) + var120, false, var121, var122, var124, -111, var123);
                }
            }
        } else if (class161.field2739 == arg0) {
            int var126 = class558.field8066.method78(true);
            if (var126 == 65535) {
                var126 = -1;
            }
            int var127 = class558.field8066.method33((byte) 99);
            int var128 = var127 >> 2;
            int var129 = var127 & 0x3;
            int var130 = class150.field2487[var128];
            int var131 = class558.field8066.method33((byte) 99);
            int var132 = (var131 >> 4 & 0x7) + class618.field8748;
            int var133 = (var131 & 0x7) + class211.field3512;
            class165.method1335(var132, var128, var126, var133, (byte) 75, var130, class371.field5822, var129);
        } else if (class606.field8605 == arg0) {
            int var134 = class558.field8066.method70(-9059);
            int var135 = (var134 & 0x7) + class211.field3512;
            int var136 = var135 + class626.field8855;
            int var137 = (var134 >> 4 & 0x7) + class618.field8748;
            int var138 = class612.field8702 + var137;
            int var139 = class558.field8066.method67(12021);
            int var140 = class558.field8066.method67(12021);
            int var141 = class558.field8066.method67(12021);
            if (class290.field4590 != null) {
                class138 var142 = (class138) class290.field4590.method1558((long) (class371.field5822 << 28 | var136 << 14 | var138), (byte) -93);
                if (var142 != null) {
                    for (class559 var143 = (class559) var142.field2332.method3465((byte) -90); var143 != null; var143 = (class559) var142.field2332.method3469(0)) {
                        if ((var139 & 0x7FFF) == var143.field8072 && var143.field8071 == var140) {
                            var143.method707((byte) -93);
                            var143.field8071 = var141;
                            class105.method1001(var143, var136, (byte) 8, class371.field5822, var138);
                            break;
                        }
                    }
                    if (var137 >= 0 && var135 >= 0 && var137 < class275.field4426 && class417.field6374 > var135) {
                        class399.method2569(class371.field5822, false, var137, var135);
                    }
                }
            }
        } else if (class39.field528 == arg0) {
            int var144 = class558.field8066.method70(-9059);
            int var145 = (var144 >> 4 & 0xF) + class618.field8748 * 2;
            int var146 = (var144 & 0xF) + class211.field3512 * 2;
            int var147 = class558.field8066.method70(-9059);
            boolean var148 = (var147 & 0x1) != 0;
            int var149 = var147 >> 1;
            int var150 = var145 + class558.field8066.method81(true);
            int var151 = var146 + class558.field8066.method81(true);
            int var152 = class558.field8066.method45(-8652);
            int var153 = class558.field8066.method45(-8652);
            int var154 = class558.field8066.method67(12021);
            byte var155 = class558.field8066.method81(true);
            int var156 = class558.field8066.method70(-9059) * 4;
            int var157 = class558.field8066.method67(12021);
            int var158 = class558.field8066.method67(12021);
            int var159 = class558.field8066.method70(-9059);
            int var160 = class558.field8066.method67(12021);
            if (var159 == 255) {
                var159 = -1;
            }
            if (var145 >= 0 && var146 >= 0 && (class275.field4426 * 2) > var145 && var146 < class275.field4426 * 2 && var150 >= 0 && var151 >= 0 && var150 < class417.field6374 * 2 && var151 < (class417.field6374 * 2) && var154 != 65535) {
                int var161 = var150 * 256;
                int var162 = var160 << 2;
                int var163 = var146 * 256;
                int var164 = var151 * 256;
                int var165 = var145 * 256;
                int var166 = var156 << 2;
                int var167 = var155 << 2;
                if (var152 != 0) {
                    class260 var168 = null;
                    if (var152 < 0) {
                        int var169 = -var152 - 1;
                        if (class114.field1793 == var169) {
                            var168 = class567.field8141;
                        } else {
                            var168 = class597.field8465[var169];
                        }
                    } else {
                        int var170 = var152 - 1;
                        class348 var171 = (class348) class592.field8395.method1558((long) var170, (byte) -93);
                        if (var171 != null) {
                            var168 = var171.field5577;
                        }
                    }
                    if (var168 != null) {
                        class642 var172 = var168.method1856(1208);
                        if (var172.field9047 != null && var172.field9047[var149] != null) {
                            int var173 = var172.field9047[var149][0];
                            int var174 = var172.field9047[var149][2];
                            int var175 = var168.field4244.method1707(-61);
                            int var176 = class567.field8139[var175];
                            int var177 = class567.field8138[var175];
                            int var178 = var174 * var176 + (var173 * var177) >> 14;
                            int var179 = var174 * var177 - (var173 * var176) >> 14;
                            var165 += var178;
                            var163 += var179;
                            var167 -= var172.field9047[var149][1];
                        }
                    }
                }
                class99 var181 = new class99(var154, class371.field5822, class371.field5822, var165, var163, var167, class562.field8084 + var157, var158 - -class562.field8084, var159, var162, var153, var166, var148);
                var181.method964(var157 + class562.field8084, 118, class202.method1568(var161, class371.field5822, var164, 2) - var166, var161, var164);
                class463.field6919.method3463((byte) -87, new class232(var181));
            }
        } else if (class644.field9058 == arg0) {
            int var182 = class558.field8066.method67(12021);
            int var183 = class558.field8066.method70(-9059);
            class213.field3537.method94(var182, (byte) -42).method3946(var183, -86);
        } else {
            class660.method3790(10216, null, "T3 - " + arg0);
            class6.method63(0, arg1);
        }
    }
}
