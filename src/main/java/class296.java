import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class296 extends class84 {

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    private int field4677 = 4096;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field4680 = 0;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    public static int field4686 = 0;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public static int field4679 = 0;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!ml", name = "Y", descriptor = "Lek;")
    public static class167 field4688;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "Llc;")
    public static class86 field4676;

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    public class296() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "(I)V")
    public static final void method1990(int arg0) {
        ++field4683;
        if (~class102.field1501 == -54) {
            int var1 = class50.field732.method1111(255);
            int var2 = (15 & var1 >> 4) + class254.field4189 * 2;
            int var3 = class61.field860 * 2 - -(15 & var1);
            int var4 = class50.field732.method1092((byte) -62) + var2;
            int var5 = var3 + class50.field732.method1092((byte) -62);
            int var6 = class50.field732.method1090(arg0 ^ 3925);
            int var7 = class50.field732.method1126(false);
            int var8 = class50.field732.method1111(255) * 4;
            int var9 = class50.field732.method1111(255) * 4;
            int var10 = class50.field732.method1126(false);
            int var11 = class50.field732.method1126(false);
            int var12 = class50.field732.method1111(arg0 ^ 8417);
            if (var12 == 255) {
                var12 = -1;
            }
            int var13 = class50.field732.method1111(255);
            if (~var2 <= -1 && var3 >= 0 && ~var2 > -209 && var3 < 208 && ~var4 <= -1 && var5 >= 0 && var4 < 208 && ~var5 > -209 && var7 != 65535) {
                int var14 = var4 * 64;
                int var15 = var3 * 64;
                int var16 = var5 * 64;
                int var17 = var2 * 64;
                class195 var18 = new class195(var7, class58.field826, var17, var15, class129.method930(var15, var17, 98, class58.field826) + -var8, var10 - -class264.field4290, class264.field4290 + var11, var12, var13, var6, var9);
                var18.method1449(var14, class129.method930(var16, var14, 122, class58.field826) + -var9, class264.field4290 + var10, arg0 ^ 8222, var16);
                class11.field130.method1385(new class53(var18), true);
            }
        } else if (arg0 == 8222) {
            if (class102.field1501 == 153) {
                int var19 = class50.field732.method1111(arg0 ^ 8417);
                int var20 = (7 & var19) + class61.field860;
                int var21 = (var19 >> 4 & 7) + class254.field4189;
                int var22 = class50.field732.method1096((byte) -40);
                int var23 = var22 >> 2;
                int var24 = 3 & var22;
                int var25 = class247.field4123[var23];
                int var26 = class50.field732.method1126(false);
                if (var21 >= 0 && ~var20 <= -1 && var21 < 104 && var20 < 104) {
                    class287.method1947(var24, var20, true, 0, -1, class58.field826, var26, var25, var21, var23);
                }
            } else {
                if (class102.field1501 == 104) {
                    int var27 = class50.field732.method1113(arg0 ^ 27396);
                    int var28 = class50.field732.method1111(255);
                    int var29 = 3 & var28;
                    int var30 = var28 >> 2;
                    byte var31 = class50.field732.method1098(arg0 + -15473);
                    byte var32 = class50.field732.method1092((byte) -62);
                    int var33 = class50.field732.method1085(-71);
                    int var34 = (7 & var33) + class61.field860;
                    int var35 = ((123 & var33) >> 4) + class254.field4189;
                    byte var36 = class50.field732.method1121(0);
                    int var37 = class50.field732.method1090(12107);
                    int var38 = class50.field732.method1113(19226);
                    int var39 = class50.field732.method1071((byte) 46);
                    byte var40 = class50.field732.method1121(0);
                    class112.method822(var34, var30, var38, var31, var35, var40, var37, var27, var36, 10413, var32, var39, var29);
                }
                if (~class102.field1501 == -166) {
                    int var41 = class50.field732.method1111(255);
                    int var42 = (7 & var41) + class61.field860;
                    int var43 = ((var41 & 113) >> 4) + class254.field4189;
                    int var44 = class50.field732.method1126(false);
                    int var45 = class50.field732.method1111(255);
                    int var46 = class50.field732.method1126(false);
                    if (~var43 <= -1 && var42 >= 0 && ~var43 > -105 && var42 < 104) {
                        int var47 = var43 * 128 + 64;
                        int var48 = var42 * 128 + 64;
                        class2 var49 = new class2(var44, class58.field826, var47, var48, class129.method930(var48, var47, 74, class58.field826) + -var45, var46, class264.field4290);
                        class143.field2309.method1385(new class138(var49), true);
                    }
                } else if (~class102.field1501 == -76) {
                    int var50 = class50.field732.method1126(false);
                    int var51 = class50.field732.method1126(false);
                    int var52 = class50.field732.method1113(19226);
                    int var53 = class50.field732.method1085(-76);
                    int var54 = (var53 >> 4 & 7) + class254.field4189;
                    int var55 = (var53 & 7) + class61.field860;
                    if (~var54 <= -1 && var55 >= 0 && ~var54 > -105 && ~var55 > -105 && ~class40.field569 != ~var50) {
                        class253 var56 = new class253();
                        var56.field4175 = var52;
                        var56.field4172 = var51;
                        if (class43.field627[class58.field826][var54][var55] == null) {
                            class43.field627[class58.field826][var54][var55] = new class187();
                        }
                        class43.field627[class58.field826][var54][var55].method1385(new class109(var56), true);
                        class111.method816(var55, 0, var54);
                    }
                } else if (~class102.field1501 == -41) {
                    int var57 = class50.field732.method1111(arg0 ^ 8417);
                    int var58 = (7 & var57) + class61.field860;
                    int var59 = ((112 & var57) >> 4) + class254.field4189;
                    int var60 = class50.field732.method1126(false);
                    int var61 = class50.field732.method1126(false);
                    int var62 = class50.field732.method1126(false);
                    if (var59 >= 0 && ~var58 <= -1 && var59 < 104 && ~var58 > -105) {
                        class187 var63 = class43.field627[class58.field826][var59][var58];
                        if (var63 != null) {
                            for (class109 var64 = (class109) var63.method1384(2); var64 != null; var64 = (class109) var63.method1388((byte) 127)) {
                                class253 var65 = var64.field1578;
                                if ((var60 & 32767) == var65.field4172 && ~var65.field4175 == ~var61) {
                                    var65.field4175 = var62;
                                    break;
                                }
                            }
                            class111.method816(var58, 0, var59);
                        }
                    }
                } else if (class102.field1501 == 168) {
                    int var66 = class50.field732.method1071((byte) 93);
                    if (var66 == 65535) {
                        var66 = -1;
                    }
                    int var67 = class50.field732.method1111(255);
                    int var68 = (7 & var67) + class61.field860;
                    int var69 = ((124 & var67) >> 4) + class254.field4189;
                    int var70 = class50.field732.method1096((byte) -62);
                    int var71 = var70 >> 2;
                    int var72 = 3 & var70;
                    int var73 = class247.field4123[var71];
                    class282.method1928(var73, var68, var72, var69, var66, var71, class58.field826, 4);
                } else if (class102.field1501 == 201) {
                    int var74 = class50.field732.method1126(false);
                    int var75 = class50.field732.method1111(255);
                    class134.method970(var74, 0).method275(0, var75);
                } else if (class102.field1501 == 60) {
                    int var76 = class50.field732.method1072(95);
                    int var77 = class50.field732.method1116((byte) 94);
                    int var78 = ((var77 & 127) >> 4) + class254.field4189;
                    int var79 = (var77 & 7) + class61.field860;
                    int var80 = class50.field732.method1113(arg0 + 11004);
                    if (~var78 <= -1 && var79 >= 0 && var78 < 104 && var79 < 104) {
                        class253 var81 = new class253();
                        var81.field4175 = var76;
                        var81.field4172 = var80;
                        if (class43.field627[class58.field826][var78][var79] == null) {
                            class43.field627[class58.field826][var78][var79] = new class187();
                        }
                        class43.field627[class58.field826][var78][var79].method1385(new class109(var81), true);
                        class111.method816(var79, 0, var78);
                    }
                } else if (class102.field1501 != 229) {
                    if (~class102.field1501 == -100) {
                        int var88 = class50.field732.method1116((byte) 91);
                        int var89 = 3 & var88;
                        int var90 = var88 >> 2;
                        int var91 = class247.field4123[var90];
                        int var92 = class50.field732.method1085(-122);
                        int var93 = class254.field4189 - -(7 & var92 >> 4);
                        int var94 = (7 & var92) + class61.field860;
                        if (~var93 <= -1 && ~var94 <= -1 && ~var93 > -105 && var94 < 104) {
                            class287.method1947(var89, var94, true, 0, -1, class58.field826, -1, var91, var93, var90);
                        }
                    } else if (~class102.field1501 == -240) {
                        int var95 = class50.field732.method1111(255);
                        int var96 = (var95 & 7) + class61.field860;
                        int var97 = class254.field4189 - -(7 & var95 >> 4);
                        int var98 = var97 - -class50.field732.method1092((byte) -62);
                        int var99 = class50.field732.method1092((byte) -62) + var96;
                        int var100 = class50.field732.method1090(12107);
                        int var101 = class50.field732.method1126(false);
                        int var102 = class50.field732.method1111(255) * 4;
                        int var103 = 4 * class50.field732.method1111(255);
                        int var104 = class50.field732.method1126(false);
                        int var105 = class50.field732.method1126(false);
                        int var106 = class50.field732.method1111(255);
                        if (var106 == 255) {
                            var106 = -1;
                        }
                        int var107 = class50.field732.method1111(255);
                        if (var97 >= 0 && ~var96 <= -1 && ~var97 > -105 && var96 < 104 && ~var98 <= -1 && ~var99 <= -1 && ~var98 > -105 && ~var99 > -105 && var101 != 65535) {
                            int var108 = var99 * 128 - -64;
                            int var109 = var98 * 128 - -64;
                            int var110 = var97 * 128 + 64;
                            int var111 = var96 * 128 + 64;
                            class195 var112 = new class195(var101, class58.field826, var110, var111, class129.method930(var111, var110, 63, class58.field826) - var102, class264.field4290 + var104, var105 - -class264.field4290, var106, var107, var100, var103);
                            var112.method1449(var109, class129.method930(var108, var109, 101, class58.field826) + -var103, class264.field4290 + var104, arg0 ^ 8222, var108);
                            class11.field130.method1385(new class53(var112), true);
                        }
                    } else if (class102.field1501 == 134) {
                        int var113 = class50.field732.method1111(arg0 ^ 8417);
                        int var114 = ((var113 & 243) >> 4) + class254.field4189 * 2;
                        int var115 = (15 & var113) + class61.field860 * 2;
                        int var116 = var114 - -class50.field732.method1092((byte) -62);
                        int var117 = class50.field732.method1092((byte) -62) + var115;
                        int var118 = class50.field732.method1090(arg0 ^ 3925);
                        int var119 = class50.field732.method1090(12107);
                        int var120 = class50.field732.method1126(false);
                        int var121 = class50.field732.method1092((byte) -62);
                        int var122 = class50.field732.method1111(255) * 4;
                        int var123 = class50.field732.method1126(false);
                        int var124 = class50.field732.method1126(false);
                        int var125 = class50.field732.method1111(255);
                        if (~var125 == -256) {
                            var125 = -1;
                        }
                        int var126 = class50.field732.method1111(255);
                        if (var114 >= 0 && var115 >= 0 && ~var114 > -209 && ~var115 > -209 && ~var116 <= -1 && var117 >= 0 && var116 < 208 && ~var117 > -209 && var120 != 65535) {
                            int var127 = var115 * 64;
                            int var128 = var116 * 64;
                            int var129 = var114 * 64;
                            if (~var118 != -1) {
                                int var131;
                                class128 var133;
                                if (var118 < 0) {
                                    int var130 = -var118 + -1;
                                    var131 = (32198 & var130) >> 11;
                                    int var132 = var130 & 2047;
                                    if (class40.field569 == var132) {
                                        var133 = class186.field2993;
                                    } else {
                                        var133 = class92.field1374[var132];
                                    }
                                } else {
                                    int var134 = var118 + -1;
                                    var131 = var134 >> 11 & 15;
                                    int var135 = 2047 & var134;
                                    var133 = class169.field2730[var135];
                                }
                                if (var133 != null) {
                                    class235 var136 = var133.method917((byte) 121);
                                    if (var136.field3799 != null && var136.field3799[var131] != null) {
                                        var121 -= var136.field3799[var131][1];
                                        int var137 = var136.field3799[var131][2];
                                        int var138 = var136.field3799[var131][0];
                                        int var139 = class47.field679[var133.field1893];
                                        int var140 = class47.field695[var133.field1893];
                                        int var141 = var137 * var139 + var138 * var140 >> 16;
                                        int var142 = var137 * var140 + -(var138 * var139) >> 16;
                                        var129 += var141;
                                        var127 += var142;
                                    }
                                }
                            }
                            int var144 = var117 * 64;
                            class195 var145 = new class195(var120, class58.field826, var129, var127, -var121 + class129.method930(var127, var129, 124, class58.field826), class264.field4290 + var123, class264.field4290 + var124, var125, var126, var119, var122);
                            var145.method1449(var128, class129.method930(var144, var128, arg0 ^ 8224, class58.field826) + -var122, class264.field4290 + var123, 0, var144);
                            class11.field130.method1385(new class53(var145), true);
                        }
                    } else if (~class102.field1501 == -221) {
                        int var146 = class50.field732.method1111(255);
                        int var147 = (var146 & 7) + class61.field860;
                        int var148 = class254.field4189 - -(var146 >> 4 & 7);
                        int var149 = class50.field732.method1126(false);
                        if (var149 == 65535) {
                            var149 = -1;
                        }
                        int var150 = class50.field732.method1111(255);
                        int var151 = class50.field732.method1111(255);
                        int var152 = var150 & 7;
                        int var153 = (var150 & 254) >> 4;
                        int var154 = class50.field732.method1111(255);
                        if (var148 >= 0 && var147 >= 0 && var148 < 104 && ~var147 > -105) {
                            int var155 = var153 + 1;
                            if (-var155 + var148 <= class186.field2993.field1917[0] && ~class186.field2993.field1917[0] >= ~(var148 + var155) && class186.field2993.field1974[0] >= -var155 + var147 && var147 + var155 >= class186.field2993.field1974[0] && ~class212.field3402 != -1 && var152 > 0 && ~class133.field2191 > -51 && var149 != -1) {
                                class32.field403[class133.field2191] = var149;
                                class209.field3357[class133.field2191] = var152;
                                class39.field554[class133.field2191] = var151;
                                class83.field1202[class133.field2191] = null;
                                class234.field3752[class133.field2191] = (var148 << 16) + (var147 << 8) + var153;
                                class291.field4611[class133.field2191] = var154;
                                ++class133.field2191;
                            }
                        }
                    }
                } else {
                    int var82 = class50.field732.method1126(false);
                    int var83 = class50.field732.method1116((byte) 91);
                    int var84 = (7 & var83) + class61.field860;
                    int var85 = ((var83 & 120) >> 4) + class254.field4189;
                    if (~var85 <= -1 && var84 >= 0 && var85 < 104 && ~var84 > -105) {
                        class187 var86 = class43.field627[class58.field826][var85][var84];
                        if (var86 != null) {
                            for (class109 var87 = (class109) var86.method1384(2); var87 != null; var87 = (class109) var86.method1388((byte) 79)) {
                                if (~(var82 & 32767) == ~var87.field1578.field4172) {
                                    var87.method1922(arg0 + -8223);
                                    break;
                                }
                            }
                            if (var86.method1384(arg0 ^ 8220) == null) {
                                class43.field627[class58.field826][var85][var84] = null;
                            }
                            class111.method816(var84, 0, var85);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(JZ)V")
    public static final void method1991(long arg0, boolean arg1) {
        ++field4678;
        if (class176.field2853 != 1 && class176.field2853 != 5) {
            if (~class176.field2853 != -3) {
                class111.method814((byte) -102);
            } else {
                class10.method86(-120);
            }
        } else {
            class61.method433(300, arg0);
        }
        if (!class206.field3315) {
            class226.field3632[0] = class269.field4341;
            class207.field3318[0] = 1001;
            class243.field3927[0] = "";
            if (~class46.field675 != -1) {
                class272.field4378 = class289.field4587;
                class52.field767 = class281.field4471;
            } else if (class118.field1714 != 0) {
                class272.field4378 = class126.field1850;
                class52.field767 = class101.field1497;
            } else {
                class52.field767 = field4680;
                class272.field4378 = class169.field2731;
            }
            class82.field1186[0] = class221.field3536;
            class243.field3890 = 1;
        }
        if (class211.field3384 != -1) {
            class75.method547(-1, class211.field3384);
        }
        for (int var3 = 0; ~class115.field1664 < ~var3; ++var3) {
            if (class190.field3070[var3]) {
                class294.field4673[var3] = true;
            }
            class225.field3616[var3] = class190.field3070[var3];
            class190.field3070[var3] = false;
        }
        class250.field4152 = null;
        class105.field1535 = -1;
        class195.field3137 = null;
        class97.field1432 = -1;
        class59.field837 = class264.field4290;
        if (class211.field3384 != -1) {
            class115.field1664 = 0;
            class161.method1201(0);
        }
        class70.method512();
        if (arg1) {
            class133.method965((byte) -29);
            if (!class206.field3315) {
                if (class195.field3137 == null) {
                    if (~class105.field1535 != 0) {
                        class83.method603(-116, (class131) null, class105.field1535, class97.field1432);
                    }
                } else {
                    class83.method603(-120, class195.field3137, class109.field1571, class286.field4543);
                }
            } else if (class202.field3232) {
                class288.method1960(18263);
            } else {
                class275.method1907((byte) 100);
            }
            int var4 = !class206.field3315 ? class210.method1532(-11711) : -1;
            if (var4 == -1) {
                var4 = class185.field2987;
            }
            class257.method1817(!arg1, var4);
            if (class119.field1724 == 1) {
                class119.field1724 = 2;
            }
            if (class262.field4265 == 1) {
                class262.field4265 = 2;
            }
            if (~class93.field1389 == -4) {
                for (int var5 = 0; ~class115.field1664 < ~var5; ++var5) {
                    if (class225.field3616[var5]) {
                        class70.method515(class10.field93[var5], class188.field3047[var5], class55.field783[var5], class138.field2240[var5], 16711935, 128);
                    } else if (class294.field4673[var5]) {
                        class70.method515(class10.field93[var5], class188.field3047[var5], class55.field783[var5], class138.field2240[var5], 16711680, 128);
                    }
                }
            }
            class118.method870(false, class161.field2628, class186.field2993.field1910, class186.field2993.field1979, class58.field826);
            class161.field2628 = 0;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
    public static void method1992(byte arg0) {
        if (arg0 == -83) {
            field4688 = null;
            field4676 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg1 < 87) {
            field4688 = null;
        }
        ++field4681;
        if (arg2 == 0) {
            this.field4677 = arg0.method1126(false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        if (arg0 > -125) {
            method1994((String) null, true);
        }
        ++field4684;
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int[] var4 = this.method612(0, class58.field822 & arg1 + -1, false);
            int[] var5 = this.method612(0, arg1, false);
            int[] var6 = this.method612(0, class58.field822 & arg1 - -1, false);
            for (int var7 = 0; class20.field221 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4677;
                int var9 = var8 >> 12;
                int var10 = (var5[var7 - -1 & class36.field497] + -var5[var7 + -1 & class36.field497]) * this.field4677;
                int var11 = var10 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var9 * var9 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(Z)V")
    public static final void method1993(boolean arg0) {
        ++field4687;
        if (class82.field1187 == null) {
            if (class16.field184 == null) {
                if (!arg0) {
                    method1991(-101L, false);
                }
                int var1 = class118.field1714;
                if (class206.field3315) {
                    if (var1 != 1) {
                        int var7 = class169.field2731;
                        int var8 = field4680;
                        if (~(class192.field3096 + -10) < ~var7 || ~(class192.field3096 + class101.field1500 + 10) > ~var7 || ~(class116.field1670 + -10) < ~var8 || ~var8 < ~(class98.field1440 + 10 + class116.field1670)) {
                            class206.field3315 = false;
                            class194.method1440(class98.field1440, class116.field1670, class192.field3096, -115, class101.field1500);
                        }
                    }
                    if (~var1 != -2) {
                        return;
                    }
                    int var9 = class192.field3096;
                    int var10 = class116.field1670;
                    int var11 = class126.field1850;
                    int var12 = class101.field1500;
                    int var13 = class101.field1497;
                    int var14 = -1;
                    for (int var15 = 0; class243.field3890 > var15; ++var15) {
                        if (!class202.field3232) {
                            int var16 = (-var15 + class243.field3890 + -1) * 15 + 31 + var10;
                            if (var9 < var11 && var11 < var9 + var12 && var13 > var16 + -13 && var13 < var16 + 3) {
                                var14 = var15;
                            }
                        } else {
                            int var17 = (-var15 + -1 + class243.field3890) * 15 + 33 + var10;
                            if (var11 > var9 && var9 + var12 > var11 && ~(var17 + -13) > ~var13 && ~var13 > ~(var17 + 3)) {
                                var14 = var15;
                            }
                        }
                    }
                    if (var14 != -1) {
                        class49.method378(var14, 108);
                    }
                    class206.field3315 = false;
                    class194.method1440(class98.field1440, class116.field1670, class192.field3096, -59, class101.field1500);
                } else {
                    if (var1 == 1 && ~class243.field3890 < -1) {
                        short var2 = class207.field3318[class243.field3890 + -1];
                        if (var2 == 32 || var2 == 11 || ~var2 == -47 || var2 == 5 || ~var2 == -13 || var2 == 40 || ~var2 == -4 || ~var2 == -61 || ~var2 == -25 || var2 == 29 || ~var2 == -3 || var2 == 1005) {
                            int var3 = class276.field4425[class243.field3890 + -1];
                            int var4 = class77.field1108[class243.field3890 + -1];
                            class131 var5 = class122.method891(var4, (byte) -124);
                            class73 var6 = client.method1168(var5);
                            if (var6.method537(false) || var6.method529(1)) {
                                class76.field1096 = false;
                                class259.field4249 = 0;
                                if (class82.field1187 != null) {
                                    class274.method1896(class82.field1187, 10);
                                }
                                class82.field1187 = class122.method891(var4, (byte) -126);
                                class10.field109 = class126.field1850;
                                class280.field4468 = class101.field1497;
                                class2.field21 = var3;
                                class274.method1896(class82.field1187, 10);
                                return;
                            }
                        }
                    }
                    if (~var1 == -2 && (class247.field4125 == 1 && class243.field3890 > 2 || class253.method1793(122, class243.field3890 + -1))) {
                        var1 = 2;
                    }
                    if (var1 == 2 && ~class243.field3890 < -1 || class46.field675 == 1) {
                        class43.method330((byte) -32);
                    }
                    if (var1 == 1 && class243.field3890 > 0 || ~class46.field675 == -3) {
                        class49.method375(29353);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
    public static final byte[] method1994(String arg0, boolean arg1) {
        ++field4685;
        int var2 = arg0.length();
        if (arg1) {
            return null;
        } else {
            byte[] var3 = new byte[var2];
            for (int var4 = 0; ~var2 < ~var4; ++var4) {
                char var5 = arg0.charAt(var4);
                if (var5 > 0 && ~var5 > -129 || ~var5 <= -161 && var5 <= 255) {
                    var3[var4] = (byte) var5;
                } else if (var5 != 8364) {
                    if (~var5 != -8219) {
                        if (var5 == 402) {
                            var3[var4] = -125;
                        } else if (var5 != 8222) {
                            if (var5 == 8230) {
                                var3[var4] = -123;
                            } else if (~var5 != -8225) {
                                if (~var5 == -8226) {
                                    var3[var4] = -121;
                                } else if (~var5 != -711) {
                                    if (~var5 == -8241) {
                                        var3[var4] = -119;
                                    } else if (var5 != 352) {
                                        if (~var5 != -8250) {
                                            if (var5 == 338) {
                                                var3[var4] = -116;
                                            } else if (var5 == 381) {
                                                var3[var4] = -114;
                                            } else if (~var5 != -8217) {
                                                if (var5 != 8217) {
                                                    if (~var5 != -8221) {
                                                        if (~var5 != -8222) {
                                                            if (var5 != 8226) {
                                                                if (var5 == 8211) {
                                                                    var3[var4] = -106;
                                                                } else if (~var5 == -8213) {
                                                                    var3[var4] = -105;
                                                                } else if (~var5 != -733) {
                                                                    if (~var5 != -8483) {
                                                                        if (var5 == 353) {
                                                                            var3[var4] = -102;
                                                                        } else if (~var5 == -8251) {
                                                                            var3[var4] = -101;
                                                                        } else if (var5 == 339) {
                                                                            var3[var4] = -100;
                                                                        } else if (~var5 != -383) {
                                                                            if (~var5 == -377) {
                                                                                var3[var4] = -97;
                                                                            } else {
                                                                                var3[var4] = 63;
                                                                            }
                                                                        } else {
                                                                            var3[var4] = -98;
                                                                        }
                                                                    } else {
                                                                        var3[var4] = -103;
                                                                    }
                                                                } else {
                                                                    var3[var4] = -104;
                                                                }
                                                            } else {
                                                                var3[var4] = -107;
                                                            }
                                                        } else {
                                                            var3[var4] = -108;
                                                        }
                                                    } else {
                                                        var3[var4] = -109;
                                                    }
                                                } else {
                                                    var3[var4] = -110;
                                                }
                                            } else {
                                                var3[var4] = -111;
                                            }
                                        } else {
                                            var3[var4] = -117;
                                        }
                                    } else {
                                        var3[var4] = -118;
                                    }
                                } else {
                                    var3[var4] = -120;
                                }
                            } else {
                                var3[var4] = -122;
                            }
                        } else {
                            var3[var4] = -124;
                        }
                    } else {
                        var3[var4] = -126;
                    }
                } else {
                    var3[var4] = -128;
                }
            }
            return var3;
        }
    }
}
