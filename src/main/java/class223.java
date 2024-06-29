import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class223 {

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3547 = "Loading fonts - ";

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "[I")
    public static int[] field3549 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3545 = Calendar.getInstance();

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Ljj;")
    public static class134 field3543;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "Ljj;")
    public static class134 field3548;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static final void method1476(int arg0) {
        field3544++;
        class233.field3706++;
        int var1 = 86 % ((arg0 + 3) / 37);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I")
    public static int method1477(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V")
    public static void method1478(int arg0) {
        if (arg0 <= 83) {
            return;
        }
        field3543 = null;
        field3549 = null;
        field3548 = null;
        field3545 = null;
        field3547 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static final void method1479(boolean arg0) {
        field3550++;
        if (!arg0) {
            method1478(-57);
        }
        if (class51.field719 == 218) {
            int var1 = class166.field2709.method1779(-86);
            int var2 = (var1 >> 4 & 0x7) + class105.field1808;
            int var3 = (var1 & 0x7) + class129.field2159;
            int var4 = class166.field2709.method1730((byte) -106);
            int var5 = class166.field2709.method1779(-79);
            int var6 = var5 >> 2;
            if (var4 == 65535) {
                var4 = -1;
            }
            int var7 = class207.field3340[var6];
            int var8 = var5 & 0x3;
            class156.method1047(var2, var7, 22, var6, var3, class28.field336, var4, var8);
        } else if (class51.field719 == 142) {
            int var9 = class166.field2709.method1779(-125);
            int var10 = (var9 >> 4 & 0xF) + class105.field1808 * 2;
            int var11 = class129.field2159 * 2 + (var9 & 0xF);
            int var12 = class166.field2709.method1767(16711680) + var10;
            int var13 = class166.field2709.method1767(16711680) + var11;
            int var14 = class166.field2709.method1756(-122);
            int var15 = class166.field2709.method1777(-81);
            int var16 = class166.field2709.method1779(-76) * 4;
            int var17 = class166.field2709.method1779(-76) * 4;
            int var18 = class166.field2709.method1777(-43);
            int var19 = class166.field2709.method1777(-55);
            int var20 = class166.field2709.method1779(-118);
            if (var20 == 255) {
                var20 = -1;
            }
            int var21 = class166.field2709.method1779(-55);
            if (var10 >= 0 && var11 >= 0 && var10 < 208 && var11 < 208 && var12 >= 0 && var13 >= 0 && var12 < 208 && var13 < 208 && var15 != 65535) {
                int var22 = var11 * 64;
                int var23 = var12 * 64;
                int var24 = var13 * 64;
                int var25 = var10 * 64;
                class193 var26 = new class193(var15, class28.field336, var25, var22, class220.method1461(var25, class28.field336, var22, 65) - var16, var18 - -class9.field141, class9.field141 + var19, var20, var21, var14, var17);
                var26.method1305(var24, true, class9.field141 + var18, -var17 + class220.method1461(var23, class28.field336, var24, 18), var23);
                class58.field814.method363(-108, new class70(var26));
            }
        } else if (class51.field719 == 194) {
            int var27 = class166.field2709.method1779(-49);
            int var28 = class129.field2159 + (var27 & 0x7);
            int var29 = ((var27 & 0x7E) >> 4) + class105.field1808;
            int var30 = class166.field2709.method1777(-128);
            int var31 = class166.field2709.method1779(-106);
            int var32 = (var31 & 0xFE) >> 4;
            if (var30 == 65535) {
                var30 = -1;
            }
            int var33 = class166.field2709.method1779(-73);
            int var34 = var31 & 0x7;
            int var35 = class166.field2709.method1779(-127);
            if (var29 >= 0 && var28 >= 0 && var29 < 104 && var28 < 104) {
                int var36 = var32 + 1;
                if (class197.field3179.field610[0] >= (var29 - var36) && class197.field3179.field610[0] <= (var29 + var36) && (var28 - var36) <= class197.field3179.field692[0] && class197.field3179.field692[0] <= (var28 + var36) && class45.field548 != 0 && var34 > 0 && class104.field1750 < 50 && var30 != -1) {
                    class97.field1467[class104.field1750] = var30;
                    class54.field772[class104.field1750] = var34;
                    class116.field1982[class104.field1750] = var33;
                    class275.field4435[class104.field1750] = null;
                    class164.field2665[class104.field1750] = (var28 << 8) + ((var29 << 16) + var32);
                    class197.field3181[class104.field1750] = var35;
                    class104.field1750++;
                }
            }
        } else if (class51.field719 == 147) {
            int var37 = class166.field2709.method1730((byte) -102);
            int var38 = class166.field2709.method1743((byte) 21);
            int var39 = class105.field1808 + ((var38 & 0x7B) >> 4);
            int var40 = (var38 & 0x7) + class129.field2159;
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                class48 var41 = class244.field3913[class28.field336][var39][var40];
                if (var41 != null) {
                    for (class266 var42 = (class266) var41.method365(3); var42 != null; var42 = (class266) var41.method372((byte) 7)) {
                        if ((var37 & 0x7FFF) == var42.field4312.field3250) {
                            var42.method544(-23);
                            break;
                        }
                    }
                    if (var41.method365(3) == null) {
                        class244.field3913[class28.field336][var39][var40] = null;
                    }
                    class294.method1966(var39, var40, (byte) -120);
                }
            }
        } else if (class51.field719 == 78) {
            int var43 = class166.field2709.method1774(115);
            int var44 = var43 >> 2;
            int var45 = var43 & 0x3;
            int var46 = class207.field3340[var44];
            int var47 = class166.field2709.method1779(-95);
            int var48 = ((var47 & 0x77) >> 4) + class105.field1808;
            int var49 = class129.field2159 + (var47 & 0x7);
            int var50 = class166.field2709.method1730((byte) -116);
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                class168.method1181(-1, var48, var44, var46, 128, var45, 0, var50, class28.field336, var49);
            }
        } else if (class51.field719 == 233) {
            int var51 = class166.field2709.method1779(-125);
            int var52 = ((var51 & 0x7C) >> 4) + class105.field1808;
            int var53 = (var51 & 0x7) + class129.field2159;
            int var54 = class166.field2709.method1777(-75);
            int var55 = class166.field2709.method1779(-64);
            int var56 = class166.field2709.method1777(-94);
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104) {
                int var57 = var52 * 128 + 64;
                int var58 = var53 * 128 + 64;
                class241 var59 = new class241(var54, class28.field336, var57, var58, class220.method1461(var57, class28.field336, var58, 123) - var55, var56, class9.field141);
                class228.field3626.method363(94, new class150(var59));
            }
        } else if (class51.field719 == 47) {
            int var60 = class166.field2709.method1777(-40);
            int var61 = class166.field2709.method1777(-104);
            int var62 = class166.field2709.method1774(120);
            int var63 = (var62 & 0x7) + class129.field2159;
            int var64 = (var62 >> 4 & 0x7) + class105.field1808;
            int var65 = class166.field2709.method1777(-58);
            if (var64 >= 0 && var63 >= 0 && var64 < 104 && var63 < 104 && class80.field1121 != var65) {
                class202 var66 = new class202();
                var66.field3245 = var61;
                var66.field3250 = var60;
                if (class244.field3913[class28.field336][var64][var63] == null) {
                    class244.field3913[class28.field336][var64][var63] = new class48();
                }
                class244.field3913[class28.field336][var64][var63].method363(75, new class266(var66));
                class294.method1966(var64, var63, (byte) -125);
            }
        } else {
            if (class51.field719 == 36) {
                int var67 = class166.field2709.method1738(!arg0);
                int var68 = class166.field2709.method1777(-80);
                byte var69 = class166.field2709.method1773(false);
                int var70 = class166.field2709.method1743((byte) 21);
                int var71 = (var70 >> 4 & 0x7) + class105.field1808;
                int var72 = (var70 & 0x7) + class129.field2159;
                int var73 = class166.field2709.method1777(-55);
                int var74 = class166.field2709.method1743((byte) 21);
                int var75 = var74 & 0x3;
                int var76 = var74 >> 2;
                int var77 = class166.field2709.method1730((byte) -112);
                byte var78 = class166.field2709.method1767(16711680);
                byte var79 = class166.field2709.method1773(!arg0);
                byte var80 = class166.field2709.method1747(!arg0);
                class230.method1527(3177, var72, var71, var76, var78, var69, var67, var77, var75, var79, var73, var68, var80);
            }
            if (class51.field719 == 64) {
                int var81 = class166.field2709.method1743((byte) 21);
                int var82 = (var81 & 0x7) + class129.field2159;
                int var83 = ((var81 & 0x7A) >> 4) + class105.field1808;
                int var84 = class166.field2709.method1777(-116);
                int var85 = class166.field2709.method1786(1233508208);
                if (var83 >= 0 && var82 >= 0 && var83 < 104 && var82 < 104) {
                    class202 var86 = new class202();
                    var86.field3245 = var84;
                    var86.field3250 = var85;
                    if (class244.field3913[class28.field336][var83][var82] == null) {
                        class244.field3913[class28.field336][var83][var82] = new class48();
                    }
                    class244.field3913[class28.field336][var83][var82].method363(102, new class266(var86));
                    class294.method1966(var83, var82, (byte) -127);
                }
            } else if (class51.field719 == 46) {
                int var87 = class166.field2709.method1779(-126);
                int var88 = class105.field1808 * 2 + ((var87 & 0xF1) >> 4);
                int var89 = class129.field2159 * 2 + (var87 & 0xF);
                int var90 = var88 + class166.field2709.method1767(16711680);
                int var91 = class166.field2709.method1767(16711680) + var89;
                int var92 = class166.field2709.method1756(-115);
                int var93 = class166.field2709.method1756(-111);
                int var94 = class166.field2709.method1777(-87);
                int var95 = class166.field2709.method1767(16711680);
                int var96 = class166.field2709.method1779(-86) * 4;
                int var97 = class166.field2709.method1777(-122);
                int var98 = class166.field2709.method1777(-43);
                int var99 = class166.field2709.method1779(-89);
                int var100 = class166.field2709.method1779(-127);
                if (var99 == 255) {
                    var99 = -1;
                }
                if (var88 >= 0 && var89 >= 0 && var88 < 208 && var89 < 208 && var90 >= 0 && var91 >= 0 && var90 < 208 && var91 < 208 && var94 != 65535) {
                    int var101 = var88 * 64;
                    int var102 = var90 * 64;
                    int var103 = var91 * 64;
                    int var104 = var89 * 64;
                    if (var92 != 0) {
                        int var107;
                        class49 var108;
                        if (var92 < 0) {
                            int var105 = -var92 - 1;
                            int var106 = var105 & 0x7FF;
                            var107 = (var105 & 0x7955) >> 11;
                            if (class80.field1121 == var106) {
                                var108 = class197.field3179;
                            } else {
                                var108 = class260.field4141[var106];
                            }
                        } else {
                            int var109 = var92 - 1;
                            var107 = var109 >> 11 & 0xF;
                            int var110 = var109 & 0x7FF;
                            var108 = class198.field3193[var110];
                        }
                        if (var108 != null) {
                            class177 var111 = var108.method375(0);
                            if (var111.field2859 != null && var111.field2859[var107] != null) {
                                var95 -= var111.field2859[var107][1];
                                int var112 = var111.field2859[var107][0];
                                int var113 = var111.field2859[var107][2];
                                int var114 = class145.field2338[var108.field657];
                                int var115 = class145.field2348[var108.field657];
                                int var116 = var112 * var115 + var113 * var114 >> 16;
                                int var117 = var113 * var115 - (var112 * var114) >> 16;
                                var104 += var117;
                                var101 += var116;
                            }
                        }
                    }
                    class193 var119 = new class193(var94, class28.field336, var101, var104, class220.method1461(var101, class28.field336, var104, 65) - var95, class9.field141 + var97, class9.field141 + var98, var99, var100, var93, var96);
                    var119.method1305(var103, true, class9.field141 + var97, class220.method1461(var102, class28.field336, var103, 103) + -var96, var102);
                    class58.field814.method363(-115, new class70(var119));
                }
            } else if (class51.field719 == 207) {
                int var120 = class166.field2709.method1779(-123);
                int var121 = (var120 & 0x7) + class129.field2159;
                int var122 = (var120 >> 4 & 0x7) + class105.field1808;
                int var123 = class166.field2709.method1767(16711680) + var122;
                int var124 = class166.field2709.method1767(16711680) + var121;
                int var125 = class166.field2709.method1756(-106);
                int var126 = class166.field2709.method1777(-94);
                int var127 = class166.field2709.method1779(-104) * 4;
                int var128 = class166.field2709.method1779(-52) * 4;
                int var129 = class166.field2709.method1777(-123);
                int var130 = class166.field2709.method1777(-53);
                int var131 = class166.field2709.method1779(-87);
                if (var131 == 255) {
                    var131 = -1;
                }
                int var132 = class166.field2709.method1779(-50);
                if (var122 >= 0 && var121 >= 0 && var122 < 104 && var121 < 104 && var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104 && var126 != 65535) {
                    int var133 = var124 * 128 + 64;
                    int var134 = var123 * 128 + 64;
                    int var135 = var122 * 128 + 64;
                    int var136 = var121 * 128 + 64;
                    class193 var137 = new class193(var126, class28.field336, var135, var136, class220.method1461(var135, class28.field336, var136, 120) - var127, class9.field141 + var129, class9.field141 + var130, var131, var132, var125, var128);
                    var137.method1305(var133, arg0, var129 + class9.field141, -var128 + class220.method1461(var134, class28.field336, var133, 109), var134);
                    class58.field814.method363(32, new class70(var137));
                }
            } else if (class51.field719 == 250) {
                int var138 = class166.field2709.method1779(-128);
                int var139 = class105.field1808 + ((var138 & 0x79) >> 4);
                int var140 = (var138 & 0x7) + class129.field2159;
                int var141 = class166.field2709.method1731(-86);
                int var142 = var141 & 0x3;
                int var143 = var141 >> 2;
                int var144 = class207.field3340[var143];
                if (var139 >= 0 && var140 >= 0 && var139 < 104 && var140 < 104) {
                    class168.method1181(-1, var139, var143, var144, 128, var142, 0, -1, class28.field336, var140);
                }
            } else if (class51.field719 == 153) {
                int var145 = class166.field2709.method1777(-61);
                int var146 = class166.field2709.method1779(-76);
                class119.method842(119, var145).method654(true, var146);
            } else if (class51.field719 == 117) {
                int var147 = class166.field2709.method1779(-115);
                int var148 = (var147 >> 4 & 0x7) + class105.field1808;
                int var149 = (var147 & 0x7) + class129.field2159;
                int var150 = class166.field2709.method1777(-52);
                int var151 = class166.field2709.method1777(-41);
                int var152 = class166.field2709.method1777(-60);
                if (var148 >= 0 && var149 >= 0 && var148 < 104 && var149 < 104) {
                    class48 var153 = class244.field3913[class28.field336][var148][var149];
                    if (var153 != null) {
                        for (class266 var154 = (class266) var153.method365(3); var154 != null; var154 = (class266) var153.method372((byte) 7)) {
                            class202 var155 = var154.field4312;
                            if ((var150 & 0x7FFF) == var155.field3250 && var155.field3245 == var151) {
                                var155.field3245 = var152;
                                break;
                            }
                        }
                        class294.method1966(var148, var149, (byte) -125);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILpl;)V")
    public static final void method1480(int arg0, class173 arg1) {
        field3542++;
        class152.method1029(200000, 32, arg1);
        if (arg0 != 8170) {
            field3543 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)I")
    public static final int method1481(int arg0, int arg1) {
        field3551++;
        return arg1 == 255 ? arg0 & 0xFF : -4;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public static final void method1482(int arg0) {
        class171.field2763++;
        field3540++;
        class83.field1148.method1238(190, -136478397);
        if (arg0 >= -64) {
            return;
        }
        for (class128 var1 = (class128) class294.field4656.method465((byte) -106); var1 != null; var1 = (class128) class294.field4656.method461((byte) -13)) {
            if (var1.field2137 == 0) {
                class290.method1943(var1, true, 117);
            }
        }
        if (class247.field3969 != null) {
            class45.method346((byte) 76, class247.field3969);
            class247.field3969 = null;
        }
    }
}
