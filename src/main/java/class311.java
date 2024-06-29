import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class311 {

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "Lco;")
    private class210 field4554 = new class210(64);

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "Lg;")
    private class470 field4555;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "[Z")
    public static boolean[] field4556 = new boolean[200];

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILss;)V")
    public static final void method1925(int arg0, class140 arg1) {
        field4551++;
        if (class2.field15 == arg1) {
            int var2 = class79.field939.method896(13089);
            int var3 = ((var2 & 0x74) >> 4) + class145.field1756;
            int var4 = class226.field3139 + (var2 & 0x7);
            int var5 = class79.field939.method940((byte) 71);
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = class270.field3870[var6];
            int var9 = class79.field939.method882((byte) -122);
            if (var3 >= 0 && var4 >= 0 && class159.field1895 > var3 && var4 < class289.field4316) {
                class323.method1971(var4, var7, var8, 0, -293447748, class147.field1781, var6, var3, var9, -1);
            }
        } else if (class340.field4884 == arg1) {
            int var10 = class79.field939.method895((byte) -108);
            int var11 = class145.field1756 + ((var10 & 0x76) >> 4);
            int var12 = (var10 & 0x7) + class226.field3139;
            int var13 = class79.field939.method916(21933);
            int var14 = class79.field939.method916(21933);
            int var15 = class79.field939.method916(21933);
            if (class76.field913 != null && var11 >= 0 && var12 >= 0 && var11 < class159.field1895 && var12 < class289.field4316) {
                class173 var16 = (class173) class76.field913.method233(-55, (long) (var12 << 14 | class147.field1781 << 28 | var11));
                if (var16 != null) {
                    for (class76 var17 = (class76) var16.field2080.method802((byte) 117); var17 != null; var17 = (class76) var16.field2080.method806((byte) 104)) {
                        if ((var13 & 0x7FFF) == var17.field914 && var17.field918 == var14) {
                            var17.method702((byte) -114);
                            var17.field918 = var15;
                            class66.method337(var11, (byte) -128, var17, class147.field1781, var12);
                            break;
                        }
                    }
                    class159.method768(class147.field1781, var12, var11, false);
                }
            }
        } else if (class210.field2920 == arg1) {
            int var18 = class79.field939.method895((byte) -83);
            int var19 = class145.field1756 + ((var18 & 0x72) >> 4);
            int var20 = (var18 & 0x7) + class226.field3139;
            int var21 = class79.field939.method916(21933);
            if (var21 == 65535) {
                var21 = -1;
            }
            int var22 = class79.field939.method895((byte) -101);
            int var23 = var22 >> 4 & 0xF;
            int var24 = var22 & 0x7;
            int var25 = class79.field939.method895((byte) -95);
            int var26 = class79.field939.method895((byte) -81);
            if (var19 >= 0 && var20 >= 0 && class159.field1895 > var19 && class289.field4316 > var20) {
                int var27 = var23 + 1;
                if (class19.field258.field2539[0] >= (var19 - var27) && class19.field258.field2539[0] <= var19 + var27 && (var20 - var27) <= class19.field258.field2536[0] && class19.field258.field2536[0] <= (var20 + var27) && class376.field5363 != 0 && var24 > 0 && class221.field3084 < 50 && var21 != -1) {
                    class342.field4898[class221.field3084] = var21;
                    class58.field729[class221.field3084] = var24;
                    class79.field943[class221.field3084] = var25;
                    class305.field4511[class221.field3084] = null;
                    class169.field2004[class221.field3084] = (class147.field1781 << 24) + (var20 << 8) + (var19 << 16) + var23;
                    class73.field881[class221.field3084] = var26;
                    class221.field3084++;
                }
            }
        } else if (class259.field3734 == arg1) {
            int var28 = class79.field939.method916(21933);
            int var29 = class79.field939.method895((byte) -111);
            class173.field2084.method2297(50, var28).method2470(115, var29);
        } else if (class239.field3297 == arg1) {
            int var30 = class79.field939.method895((byte) -103);
            int var31 = (var30 >> 4 & 0x7) + class145.field1756;
            int var32 = (var30 & 0x7) + class226.field3139;
            int var33 = class79.field939.method916(21933);
            int var34 = class79.field939.method895((byte) -98);
            int var35 = class79.field939.method916(21933);
            if (var31 >= 0 && var32 >= 0 && class159.field1895 > var31 && var32 < class289.field4316) {
                int var36 = var31 * 128 + 64;
                int var37 = var32 * 128 + 64;
                class459 var38 = new class459(var33, var35, class204.field2796, class147.field1781, var36, class375.method2264(-1547, var37, class147.field1781, var36) - var34, var37, var31, var31, var32, var32);
                class361.field5198.method803(new class371(var38), 50);
            }
        } else {
            if (arg0 < 57) {
                field4556 = null;
            }
            if (class409.field5797 == arg1) {
                int var39 = class79.field939.method895((byte) -90);
                int var40 = ((var39 & 0x7D) >> 4) + class145.field1756;
                int var41 = (var39 & 0x7) + class226.field3139;
                int var42 = var40 + class79.field939.method922(32429);
                int var43 = class79.field939.method922(32429) + var41;
                int var44 = class79.field939.method906(-73);
                int var45 = class79.field939.method916(21933);
                int var46 = class79.field939.method895((byte) -90) * 4;
                int var47 = class79.field939.method895((byte) -74) * 4;
                int var48 = class79.field939.method916(21933);
                int var49 = class79.field939.method916(21933);
                int var50 = class79.field939.method895((byte) -107);
                int var51 = class79.field939.method895((byte) -105);
                if (var50 == 255) {
                    var50 = -1;
                }
                if (var40 >= 0 && var41 >= 0 && class159.field1895 > var40 && var41 < class289.field4316 && var42 >= 0 && var43 >= 0 && class159.field1895 > var42 && class289.field4316 > var43 && var45 != 65535) {
                    int var52 = var40 * 128 + 64;
                    int var53 = var43 * 128 + 64;
                    int var54 = var41 * 128 + 64;
                    int var55 = var42 * 128 + 64;
                    class357 var56 = new class357(var45, class147.field1781, var52, var54, class375.method2264(-1547, var54, class147.field1781, var52) - var46, class204.field2796 + var48, class204.field2796 + var49, var50, var51, var44, var47);
                    var56.method2179(1, class204.field2796 + var48, var53, class375.method2264(-1547, var53, class147.field1781, var55) - var47, var55);
                    class270.field3868.method803(new class92(var56), 50);
                }
            } else if (class357.field5134 == arg1) {
                int var57 = class79.field939.method895((byte) -111);
                int var58 = (var57 >> 4 & 0xF) + class145.field1756 * 2;
                int var59 = (var57 & 0xF) + class226.field3139 * 2;
                int var60 = var58 + class79.field939.method922(32429);
                int var61 = var59 + class79.field939.method922(32429);
                int var62 = class79.field939.method906(-77);
                int var63 = class79.field939.method906(-49);
                int var64 = class79.field939.method916(21933);
                int var65 = class79.field939.method922(32429);
                int var66 = class79.field939.method895((byte) -97) * 4;
                int var67 = class79.field939.method916(21933);
                int var68 = class79.field939.method916(21933);
                int var69 = class79.field939.method895((byte) -83);
                int var70 = class79.field939.method895((byte) -116);
                if (var69 == 255) {
                    var69 = -1;
                }
                if (var58 >= 0 && var59 >= 0 && var58 < class159.field1895 * 2 && var59 < (class159.field1895 * 2) && var60 >= 0 && var61 >= 0 && (class289.field4316 * 2) > var60 && (class289.field4316 * 2) > var61 && var64 != 65535) {
                    int var71 = var59 * 64;
                    int var72 = var60 * 64;
                    int var73 = var61 * 64;
                    int var74 = var58 * 64;
                    if (var62 != 0) {
                        int var77;
                        class187 var78;
                        if (var62 < 0) {
                            int var75 = -var62 - 1;
                            int var76 = var75 & 0x7FF;
                            var77 = var75 >> 11 & 0xF;
                            if (class61.field760 == var76) {
                                var78 = class19.field258;
                            } else {
                                var78 = class46.field596[var76];
                            }
                        } else {
                            int var79 = var62 - 1;
                            int var80 = var79 & 0x7FF;
                            var77 = var79 >> 11 & 0xF;
                            var78 = class448.field6366[var80];
                        }
                        if (var78 != null) {
                            class349 var81 = var78.method1018(-117);
                            if (var81.field4965 != null && var81.field4965[var77] != null) {
                                int var82 = var81.field4965[var77][0];
                                int var83 = var81.field4965[var77][2];
                                int var84 = var78.field2470.method1116((byte) 119);
                                int var85 = class16.field212[var84];
                                int var86 = class16.field214[var84];
                                int var87 = var82 * var86 + var83 * var85 >> 15;
                                int var88 = var83 * var86 - (var82 * var85) >> 15;
                                var71 += var88;
                                var74 += var87;
                                var65 -= var81.field4965[var77][1];
                            }
                        }
                    }
                    class357 var90 = new class357(var64, class147.field1781, var74, var71, class375.method2264(-1547, var71, class147.field1781, var74) - var65, class204.field2796 + var67, class204.field2796 + var68, var69, var70, var63, var66);
                    var90.method2179(1, class204.field2796 + var67, var73, class375.method2264(-1547, var73, class147.field1781, var72) - var66, var72);
                    class270.field3868.method803(new class92(var90), 50);
                }
            } else if (class409.field5798 == arg1) {
                int var91 = class79.field939.method886((byte) -124);
                int var92 = var91 >> 2;
                int var93 = var91 & 0x3;
                int var94 = class270.field3870[var92];
                int var95 = class79.field939.method940((byte) 82);
                int var96 = class145.field1756 + (var95 >> 4 & 0x7);
                int var97 = (var95 & 0x7) + class226.field3139;
                if (var96 >= 0 && var97 >= 0 && var96 < class159.field1895 && var97 < class289.field4316) {
                    class323.method1971(var97, var93, var94, 0, -293447748, class147.field1781, var92, var96, -1, -1);
                }
            } else if (class406.field5768 == arg1) {
                class79.field939.method895((byte) -77);
                int var98 = class79.field939.method895((byte) -125);
                int var99 = ((var98 & 0x7C) >> 4) + class145.field1756;
                int var100 = (var98 & 0x7) + class226.field3139;
                int var101 = class79.field939.method916(21933);
                int var102 = class79.field939.method895((byte) -90);
                int var103 = class79.field939.method899((byte) -105);
                String var104 = class79.field939.method907(-27652);
                class189.method1035(var99, -20089, class147.field1781, var104, var103, var101, var100, var102);
            } else if (class67.field840 == arg1) {
                byte var105 = class79.field939.method905(true);
                int var106 = class79.field939.method940((byte) 51);
                int var107 = (var106 >> 4 & 0x7) + class145.field1756;
                int var108 = (var106 & 0x7) + class226.field3139;
                int var109 = class79.field939.method941(-1696097432);
                byte var110 = class79.field939.method893(94);
                byte var111 = class79.field939.method905(true);
                byte var112 = class79.field939.method922(32429);
                int var113 = class79.field939.method882((byte) -112);
                int var114 = class79.field939.method896(13089);
                int var115 = var114 >> 2;
                int var116 = var114 & 0x3;
                int var117 = class79.field939.method883(107);
                int var118 = class79.field939.method930(255);
                if (!class231.field3205.method1359()) {
                    class206.method1135(var111, var109, var110, var112, var115, var117, class147.field1781, var116, -4, var113, var108, var107, var118, var105);
                }
            } else if (class108.field1303 == arg1) {
                int var119 = class79.field939.method940((byte) 23);
                int var120 = (var119 >> 4 & 0x7) + class145.field1756;
                int var121 = class226.field3139 + (var119 & 0x7);
                int var122 = class79.field939.method930(255);
                if (var120 >= 0 && var121 >= 0 && class159.field1895 > var120 && var121 < class289.field4316) {
                    class173 var123 = (class173) class76.field913.method233(-80, (long) (var121 << 14 | class147.field1781 << 28 | var120));
                    if (var123 != null) {
                        for (class76 var124 = (class76) var123.field2080.method802((byte) 99); var124 != null; var124 = (class76) var123.field2080.method806((byte) 104)) {
                            if ((var122 & 0x7FFF) == var124.field914) {
                                var124.method702((byte) -114);
                                break;
                            }
                        }
                        if (var123.field2080.method812((byte) 109)) {
                            var123.method702((byte) -114);
                        }
                        class159.method768(class147.field1781, var121, var120, false);
                    }
                }
            } else if (class22.field303 == arg1) {
                int var125 = class79.field939.method896(13089);
                int var126 = (var125 >> 4 & 0x7) + class145.field1756;
                int var127 = (var125 & 0x7) + class226.field3139;
                int var128 = class79.field939.method883(104);
                if (var128 == 65535) {
                    var128 = -1;
                }
                int var129 = class79.field939.method940((byte) 79);
                int var130 = var129 >> 2;
                int var131 = var129 & 0x3;
                int var132 = class270.field3870[var130];
                class135.method640(var126, var128, var132, var131, class147.field1781, var130, var127, (byte) -97);
            } else if (class418.field6015 == arg1) {
                int var133 = class79.field939.method895((byte) -83);
                int var134 = (var133 >> 4 & 0xF) + class145.field1756 * 2;
                int var135 = (var133 & 0xF) + class226.field3139 * 2;
                int var136 = class79.field939.method922(32429) + var134;
                int var137 = class79.field939.method922(32429) + var135;
                int var138 = class79.field939.method906(-12);
                int var139 = class79.field939.method916(21933);
                int var140 = class79.field939.method895((byte) -124) * 4;
                int var141 = class79.field939.method895((byte) -125) * 4;
                int var142 = class79.field939.method916(21933);
                int var143 = class79.field939.method916(21933);
                int var144 = class79.field939.method895((byte) -87);
                int var145 = class79.field939.method895((byte) -122);
                if (var144 == 255) {
                    var144 = -1;
                }
                if (var134 >= 0 && var135 >= 0 && var134 < (class159.field1895 * 2) && class159.field1895 * 2 > var135 && var136 >= 0 && var137 >= 0 && var136 < (class289.field4316 * 2) && class289.field4316 * 2 > var137 && var139 != 65535) {
                    int var146 = var134 * 64;
                    int var147 = var136 * 64;
                    int var148 = var137 * 64;
                    int var149 = var135 * 64;
                    class357 var150 = new class357(var139, class147.field1781, var146, var149, class375.method2264(-1547, var149, class147.field1781, var146) - var140, var142 - -class204.field2796, class204.field2796 + var143, var144, var145, var138, var141);
                    var150.method2179(1, var142 + class204.field2796, var148, class375.method2264(-1547, var148, class147.field1781, var147) - var141, var147);
                    class270.field3868.method803(new class92(var150), 50);
                }
            } else if (class41.field496 == arg1) {
                int var151 = class79.field939.method886((byte) -73);
                int var152 = class145.field1756 + ((var151 & 0x7C) >> 4);
                int var153 = (var151 & 0x7) + class226.field3139;
                int var154 = class79.field939.method916(21933);
                int var155 = class79.field939.method882((byte) -116);
                if (var152 >= 0 && var153 >= 0 && class159.field1895 > var152 && var153 < class289.field4316) {
                    class66.method337(var152, (byte) -128, new class76(var154, var155), class147.field1781, var153);
                    class159.method768(class147.field1781, var153, var152, false);
                }
            } else if (class193.field2649 == arg1) {
                int var156 = class79.field939.method930(255);
                int var157 = class79.field939.method882((byte) -114);
                int var158 = class79.field939.method883(99);
                int var159 = class79.field939.method886((byte) -82);
                int var160 = class145.field1756 + ((var159 & 0x77) >> 4);
                int var161 = class226.field3139 + (var159 & 0x7);
                if (var160 >= 0 && var161 >= 0 && class159.field1895 > var160 && class289.field4316 > var161 && class61.field760 != var157) {
                    class66.method337(var160, (byte) -128, new class76(var158, var156), class147.field1781, var161);
                    class159.method768(class147.field1781, var161, var160, false);
                }
            } else {
                class144.method678((Throwable) null, true, "T3 - " + arg1);
                class100.method491((byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public static void method1926(int arg0) {
        int var1 = 53 % ((-arg0 - 18) / 62);
        field4556 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public final void method1927(byte arg0) {
        class210 var2 = this.field4554;
        synchronized (this.field4554) {
            this.field4554.method1165((byte) 118);
        }
        field4548++;
        if (arg0 != 83) {
            method1926(45);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
    public final void method1928(boolean arg0) {
        if (!arg0) {
            this.field4554 = null;
        }
        field4549++;
        class210 var2 = this.field4554;
        synchronized (this.field4554) {
            this.field4554.method1169(1076);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILg;Lg;)V")
    public static final void method1929(int arg0, class470 arg1, class470 arg2) {
        class223.field3098 = arg2;
        class244.field3332 = arg1;
        field4547++;
        if (arg0 != -256) {
            field4556 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Lug;")
    public final class349 method1930(int arg0, int arg1) {
        field4553++;
        class210 var3 = this.field4554;
        class349 var4;
        synchronized (this.field4554) {
            var4 = (class349) this.field4554.method1163((byte) -107, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4555.method2768(-20472, arg1, 32);
        class349 var6 = new class349();
        if (var5 != null) {
            var6.method2111(new class179(var5), -1);
        }
        class210 var7 = this.field4554;
        synchronized (this.field4554) {
            this.field4554.method1172((long) arg1, 1, var6);
        }
        if (arg0 != 982820868) {
            this.method1930(-67, 106);
        }
        return var6;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V")
    public final void method1931(int arg0, int arg1) {
        class210 var3 = this.field4554;
        synchronized (this.field4554) {
            this.field4554.method1166(arg1, (byte) -52);
            if (arg0 != 7) {
                this.field4555 = null;
            }
        }
        field4552++;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lci;ILg;)V")
    public class311(class421 arg0, int arg1, class470 arg2) {
        this.field4555 = arg2;
        this.field4555.method2755(-104, 32);
    }
}
