import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class63 extends class139 {

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "I")
    public static int field826 = 0;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "Lus;")
    public static class1 field829 = new class1(1, 3);

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Lcj;")
    public static class451 field831;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public static void method392(int arg0) {
        field831 = null;
        field829 = null;
        if (arg0 != 7) {
            field829 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field828;
        int[] var3 = super.field1844.method2176(arg0, arg1 + -27782);
        if (arg1 != 27782) {
            method394((class311) null, 78);
        }
        if (super.field1844.field5045) {
            int[][] var4 = this.method882(0, arg0, arg1 + -27781);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~class356.field5147 < ~var8; ++var8) {
                var3[var8] = (var6[var8] - -var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)V")
    public static final void method393(int arg0, int arg1) {
        if (arg0 >= -34) {
            field826 = -88;
        }
        ++field830;
        if (~arg1 != 0) {
            if (class481.field6780[arg1]) {
                class229.field3449.method1238((byte) 125, arg1);
                class112.field1421[arg1] = null;
                class77.field945[arg1] = null;
                class481.field6780[arg1] = false;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lef;I)V")
    public static final void method394(class311 arg0, int arg1) {
        ++field827;
        if (class469.field6604 == arg0) {
            int var2 = class345.field5016.method1697((byte) 12);
            int var3 = client.field2622 - -(7 & var2 >> 4);
            int var4 = (7 & var2) + class306.field4357;
            int var5 = class345.field5016.method1709(arg1 + 256);
            if (~var3 <= -1 && var4 >= 0 && var3 < class58.field758 && ~class287.field4181 < ~var4) {
                class442 var6 = (class442) class269.field3928.method2761((long) (var4 << 14 | class338.field4928 << 28 | var3), (byte) -112);
                if (var6 != null) {
                    for (class71 var7 = (class71) var6.field6126.method2843(arg1 + 1123227613); var7 != null; var7 = (class71) var6.field6126.method2842(arg1 ^ -1673506447)) {
                        if ((var5 & 32767) == var7.field885) {
                            var7.method1510((byte) -13);
                            break;
                        }
                    }
                    if (var6.field6126.method2851(false)) {
                        var6.method1510((byte) -13);
                    }
                    class486.method2848(var3, class338.field4928, -25665, var4);
                }
            }
        } else if (class329.field4764 == arg0) {
            int var8 = class345.field5016.method1735(120);
            int var9 = var8 >> 2;
            int var10 = 3 & var8;
            int var11 = class339.field4951[var9];
            int var12 = class345.field5016.method1746(17037);
            int var13 = (7 & var12 >> 4) + client.field2622;
            int var14 = class306.field4357 - -(7 & var12);
            if (~var13 <= -1 && var14 >= 0 && var13 < class58.field758 && var14 < class287.field4181) {
                class2.method8(var13, -1, class338.field4928, var14, -69, -1, var10, var11, 0, var9);
            }
        } else if (client.field2608 == arg0) {
            int var15 = class345.field5016.method1740((byte) 69);
            int var16 = class345.field5016.method1709(255);
            int var17 = class345.field5016.method1735(47);
            int var18 = (var17 >> 4 & 7) + client.field2622;
            int var19 = (var17 & 7) + class306.field4357;
            if (~var18 <= -1 && ~var19 <= -1 && class58.field758 > var18 && class287.field4181 > var19) {
                class7.method27(12727, var18, new class71(var15, var16), class338.field4928, var19);
                class486.method2848(var18, class338.field4928, -25665, var19);
            }
        } else if (class185.field2743 == arg0) {
            int var20 = class345.field5016.method1701(arg1 + -23120);
            int var21 = ((var20 & 250) >> 4) + client.field2622 * 2;
            int var22 = class306.field4357 * 2 - -(15 & var20);
            int var23 = var21 + class345.field5016.method1715((byte) 77);
            int var24 = var22 + class345.field5016.method1715((byte) -68);
            int var25 = class345.field5016.method1702(-52);
            int var26 = class345.field5016.method1729(65280);
            int var27 = class345.field5016.method1701(-23121) * 4;
            int var28 = class345.field5016.method1701(-23121) * 4;
            int var29 = class345.field5016.method1729(65280);
            int var30 = class345.field5016.method1729(65280);
            int var31 = class345.field5016.method1701(arg1 + -23120);
            int var32 = class345.field5016.method1701(arg1 ^ 23120);
            if (var31 == 255) {
                var31 = -1;
            }
            if (~var21 <= -1 && var22 >= 0 && class58.field758 * 2 > var21 && ~(class58.field758 * 2) < ~var22 && ~var23 <= -1 && var24 >= 0 && class287.field4181 * 2 > var23 && class287.field4181 * 2 > var24 && ~var26 != -65536) {
                int var33 = var21 * 64;
                int var34 = var24 * 64;
                int var35 = var22 * 64;
                int var36 = var23 * 64;
                class389 var37 = new class389(var26, class338.field4928, var33, var35, class132.method835(var35, class338.field4928, var33, 2002) - var27, class353.field5090 + var29, class353.field5090 + var30, var31, var32, var25, var28);
                var37.method2341(var36, var34, class353.field5090 + var29, (byte) 81, -var28 + class132.method835(var34, class338.field4928, var36, arg1 ^ -2003));
                class170.field2480.method2845(new class257(var37), (byte) 37);
            }
        } else if (class247.field3655 == arg0) {
            int var38 = class345.field5016.method1701(-23121);
            int var39 = ((var38 & 125) >> 4) + client.field2622;
            int var40 = class306.field4357 - -(7 & var38);
            int var41 = var39 + class345.field5016.method1715((byte) 86);
            int var42 = class345.field5016.method1715((byte) -88) + var40;
            int var43 = class345.field5016.method1702(-59);
            int var44 = class345.field5016.method1729(65280);
            int var45 = class345.field5016.method1701(-23121) * 4;
            int var46 = class345.field5016.method1701(-23121) * 4;
            int var47 = class345.field5016.method1729(65280);
            int var48 = class345.field5016.method1729(arg1 ^ -65281);
            int var49 = class345.field5016.method1701(-23121);
            int var50 = class345.field5016.method1701(-23121);
            if (~var49 == -256) {
                var49 = -1;
            }
            if (var39 >= 0 && var40 >= 0 && ~var39 > ~class58.field758 && ~var40 > ~class287.field4181 && var41 >= 0 && ~var42 <= -1 && ~var41 > ~class58.field758 && class287.field4181 > var42 && ~var44 != -65536) {
                int var51 = var42 * 128 + 64;
                int var52 = var39 * 128 + 64;
                int var53 = var40 * 128 + 64;
                int var54 = var41 * 128 + 64;
                class389 var55 = new class389(var44, class338.field4928, var52, var53, -var45 + class132.method835(var53, class338.field4928, var52, 2002), var47 - -class353.field5090, var48 - -class353.field5090, var49, var50, var43, var46);
                var55.method2341(var54, var51, class353.field5090 + var47, (byte) 81, class132.method835(var51, class338.field4928, var54, 2002) + -var46);
                class170.field2480.method2845(new class257(var55), (byte) 37);
            }
        } else if (class94.field1216 == arg0) {
            int var56 = class345.field5016.method1740((byte) -23);
            byte var57 = class345.field5016.method1738(false);
            int var58 = class345.field5016.method1729(65280);
            byte var59 = class345.field5016.method1696((byte) -98);
            byte var60 = class345.field5016.method1715((byte) -128);
            int var61 = class345.field5016.method1747((byte) 84);
            int var62 = class345.field5016.method1701(-23121);
            int var63 = var62 >> 2;
            int var64 = 3 & var62;
            int var65 = class345.field5016.method1729(arg1 ^ -65281);
            byte var66 = class345.field5016.method1700(32767);
            int var67 = class345.field5016.method1735(arg1 + 103);
            int var68 = (7 & var67 >> 4) + client.field2622;
            int var69 = (7 & var67) + class306.field4357;
            if (!class141.field1878.method655()) {
                class242.method1531(var64, var57, var60, var68, var56, false, var59, var61, var65, class338.field4928, var66, var69, var63, var58);
            }
        } else if (class460.field6442 == arg0) {
            int var70 = class345.field5016.method1697((byte) 12);
            int var71 = var70 >> 2;
            int var72 = var70 & 3;
            int var73 = class339.field4951[var71];
            int var74 = class345.field5016.method1697((byte) 12);
            int var75 = (7 & var74 >> 4) + client.field2622;
            int var76 = class306.field4357 - -(7 & var74);
            int var77 = class345.field5016.method1729(65280);
            if (~var75 <= -1 && ~var76 <= -1 && ~class58.field758 < ~var75 && ~var76 > ~class287.field4181) {
                class2.method8(var75, var77, class338.field4928, var76, arg1 ^ 116, -1, var72, var73, 0, var71);
            }
        } else if (class113.field1429 == arg0) {
            int var78 = class345.field5016.method1701(-23121);
            int var79 = (var78 >> 4 & 7) + client.field2622;
            int var80 = (7 & var78) + class306.field4357;
            int var81 = class345.field5016.method1749((byte) -75);
            if (var81 == 65535) {
                var81 = -1;
            }
            int var82 = class345.field5016.method1697((byte) 12);
            int var83 = var82 >> 2;
            int var84 = var82 & 3;
            int var85 = class339.field4951[var83];
            class29.method211(var81, class338.field4928, var84, var85, 5, var79, var83, var80);
        } else if (class138.field1821 == arg0) {
            int var86 = class345.field5016.method1729(65280);
            int var87 = class345.field5016.method1701(-23121);
            class156.field2325.method808(var86, 0).method2656(var87, 94);
        } else if (class311.field4398 == arg0) {
            int var88 = class345.field5016.method1701(arg1 + -23120);
            int var89 = (7 & var88 >> 4) + client.field2622;
            int var90 = (7 & var88) + class306.field4357;
            int var91 = class345.field5016.method1729(65280);
            if (~var91 == -65536) {
                var91 = -1;
            }
            int var92 = class345.field5016.method1701(-23121);
            int var93 = (247 & var92) >> 4;
            int var94 = 7 & var92;
            int var95 = class345.field5016.method1701(arg1 ^ 23120);
            int var96 = class345.field5016.method1701(arg1 + -23120);
            if (~var89 <= -1 && ~var90 <= -1 && ~var89 > ~class58.field758 && var90 < class287.field4181) {
                int var97 = var93 + 1;
                if (class492.field6935.field2163[0] >= -var97 + var89 && ~(var89 - -var97) <= ~class492.field6935.field2163[0] && ~(var90 - var97) >= ~class492.field6935.field2159[0] && ~(var90 + var97) <= ~class492.field6935.field2159[0] && class314.field4438.field5771 != 0 && ~var94 < -1 && ~class442.field6125 > -51 && ~var91 != 0) {
                    class40.field532[class442.field6125] = var91;
                    class339.field4952[class442.field6125] = var94;
                    class242.field3621[class442.field6125] = var95;
                    class318.field4614[class442.field6125] = null;
                    class235.field3545[class442.field6125] = (class338.field4928 << 24) - -(var89 << 16) - (-(var90 << 8) - var93);
                    class306.field4360[class442.field6125] = var96;
                    ++class442.field6125;
                }
            }
        } else if (class111.field1408 == arg0) {
            class345.field5016.method1701(arg1 ^ 23120);
            int var98 = class345.field5016.method1701(-23121);
            int var99 = (var98 >> 4 & 7) + client.field2622;
            int var100 = (7 & var98) + class306.field4357;
            int var101 = class345.field5016.method1729(65280);
            int var102 = class345.field5016.method1701(arg1 ^ 23120);
            int var103 = class345.field5016.method1748(false);
            String var104 = class345.field5016.method1750(-125);
            class305.method1888(var103, var104, class338.field4928, var102, var100, var99, 7524, var101);
        } else if (class353.field5099 != arg0) {
            if (arg1 != -1) {
                field826 = 104;
            }
            if (class361.field5196 == arg0) {
                int var113 = class345.field5016.method1701(arg1 ^ 23120);
                int var114 = (15 & var113 >> 4) + client.field2622 * 2;
                int var115 = class306.field4357 * 2 - -(15 & var113);
                int var116 = class345.field5016.method1715((byte) -71) + var114;
                int var117 = var115 - -class345.field5016.method1715((byte) 102);
                int var118 = class345.field5016.method1702(-50);
                int var119 = class345.field5016.method1702(-83);
                int var120 = class345.field5016.method1729(arg1 + 65281);
                int var121 = class345.field5016.method1715((byte) -80);
                int var122 = 4 * class345.field5016.method1701(arg1 + -23120);
                int var123 = class345.field5016.method1729(65280);
                int var124 = class345.field5016.method1729(arg1 ^ -65281);
                int var125 = class345.field5016.method1701(-23121);
                if (var125 == 255) {
                    var125 = -1;
                }
                int var126 = class345.field5016.method1701(-23121);
                if (~var114 <= -1 && var115 >= 0 && class58.field758 * 2 > var114 && ~(class58.field758 * 2) < ~var115 && var116 >= 0 && var117 >= 0 && ~var116 > ~(class287.field4181 * 2) && ~var117 > ~(class287.field4181 * 2) && var120 != 65535) {
                    int var127 = var117 * 64;
                    int var128 = var115 * 64;
                    int var129 = var114 * 64;
                    int var130 = var116 * 64;
                    if (~var118 != -1) {
                        int var133;
                        class146 var134;
                        if (~var118 <= -1) {
                            int var131 = var118 - 1;
                            int var132 = 2047 & var131;
                            var133 = (32443 & var131) >> 11;
                            var134 = class139.field1851[var132];
                        } else {
                            int var135 = -var118 + -1;
                            var133 = (31259 & var135) >> 11;
                            int var136 = var135 & 2047;
                            if (class295.field4273 == var136) {
                                var134 = class492.field6935;
                            } else {
                                var134 = class124.field1559[var136];
                            }
                        }
                        if (var134 != null) {
                            class332 var137 = var134.method924((byte) -32);
                            if (var137.field4805 != null && var137.field4805[var133] != null) {
                                int var138 = var137.field4805[var133][0];
                                int var139 = var137.field4805[var133][2];
                                int var140 = var134.field2153.method583((byte) 127);
                                int var141 = class53.field727[var140];
                                int var142 = class53.field726[var140];
                                int var143 = var139 * var141 - -(var138 * var142) >> 15;
                                int var144 = var139 * var142 + -(var138 * var141) >> 15;
                                var121 -= var137.field4805[var133][1];
                                var129 += var143;
                                var128 += var144;
                            }
                        }
                    }
                    class389 var146 = new class389(var120, class338.field4928, var129, var128, -var121 + class132.method835(var128, class338.field4928, var129, 2002), var123 - -class353.field5090, class353.field5090 + var124, var125, var126, var119, var122);
                    var146.method2341(var130, var127, class353.field5090 + var123, (byte) 81, -var122 + class132.method835(var127, class338.field4928, var130, 2002));
                    class170.field2480.method2845(new class257(var146), (byte) 37);
                }
            } else if (class394.field5587 == arg0) {
                int var147 = class345.field5016.method1701(-23121);
                int var148 = ((123 & var147) >> 4) + client.field2622;
                int var149 = (var147 & 7) + class306.field4357;
                int var150 = class345.field5016.method1729(65280);
                int var151 = class345.field5016.method1701(-23121);
                int var152 = class345.field5016.method1729(65280);
                if (~var148 <= -1 && var149 >= 0 && var148 < class58.field758 && ~var149 > ~class287.field4181) {
                    int var153 = var148 * 128 - -64;
                    int var154 = var149 * 128 + 64;
                    class428 var155 = new class428(var150, var152, class353.field5090, class338.field4928, var153, class132.method835(var154, class338.field4928, var153, arg1 + 2003) + -var151, var154, var148, var148, var149, var149);
                    class387.field5504.method2845(new class273(var155), (byte) 37);
                }
            } else if (class359.field5168 == arg0) {
                int var156 = class345.field5016.method1709(255);
                int var157 = class345.field5016.method1729(65280);
                int var158 = class345.field5016.method1746(arg1 ^ -17038);
                int var159 = (var158 >> 4 & 7) + client.field2622;
                int var160 = class306.field4357 - -(7 & var158);
                int var161 = class345.field5016.method1729(65280);
                if (~var159 <= -1 && var160 >= 0 && ~var159 > ~class58.field758 && ~class287.field4181 < ~var160 && ~class295.field4273 != ~var156) {
                    class7.method27(12727, var159, new class71(var161, var157), class338.field4928, var160);
                    class486.method2848(var159, class338.field4928, -25665, var160);
                }
            } else {
                class267.method1641("T3 - " + arg0, (Throwable) null, (byte) -87);
                class207.method1357((byte) -104);
            }
        } else {
            int var105 = class345.field5016.method1701(-23121);
            int var106 = ((125 & var105) >> 4) + client.field2622;
            int var107 = (7 & var105) + class306.field4357;
            int var108 = class345.field5016.method1729(65280);
            int var109 = class345.field5016.method1729(65280);
            int var110 = class345.field5016.method1729(65280);
            if (class269.field3928 != null && ~var106 <= -1 && ~var107 <= -1 && ~var106 > ~class58.field758 && ~class287.field4181 < ~var107) {
                class442 var111 = (class442) class269.field3928.method2761((long) (var107 << 14 | class338.field4928 << 28 | var106), (byte) -112);
                if (var111 != null) {
                    for (class71 var112 = (class71) var111.field6126.method2843(arg1 ^ -1123227613); var112 != null; var112 = (class71) var111.field6126.method2842(1673506446)) {
                        if (~(var108 & 32767) == ~var112.field885 && var112.field887 == var109) {
                            var112.method1510((byte) -13);
                            var112.field887 = var110;
                            class7.method27(12727, var106, var112, class338.field4928, var107);
                            break;
                        }
                    }
                    class486.method2848(var106, class338.field4928, -25665, var107);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
    public class63() {
        super(1, true);
    }
}
