import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class149 extends class45 {

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "[I")
    private int[] field2154 = new int[this.field550];

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field2144 = 0;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "[Lsi;")
    public static class391[] field2152 = new class391[2048];

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
    public static int field2156 = 0;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field2155 = 0;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    private int field2151;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Lmg;")
    public static class101 field2161;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "[B")
    private byte[] field2150;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lri;I)V", line = 3)
    public static final void method993(class74 arg0, int arg1) {
        ++field2157;
        if (class409.field5972 == arg0) {
            int var2 = class179.field2631.method2348(-2);
            int var3 = ((120 & var2) >> 4) + class393.field5742;
            int var4 = (7 & var2) + class511.field7576;
            int var5 = class179.field2631.method2353((byte) 107);
            if (~var5 == -65536) {
                var5 = -1;
            }
            int var6 = class179.field2631.method2348(-2);
            int var7 = (var6 & 254) >> 4;
            int var8 = var6 & 7;
            int var9 = class179.field2631.method2348(-2);
            int var10 = class179.field2631.method2348(-2);
            if (var3 >= 0 && var4 >= 0 && var3 < class527.field7799 && class422.field6182 > var4) {
                int var11 = var7 - -1;
                if (~(-var11 + var3) >= ~class316.field4324.field1127[0] && class316.field4324.field1127[0] <= var3 + var11 && ~class316.field4324.field1117[0] <= ~(-var11 + var4) && ~(var4 + var11) <= ~class316.field4324.field1117[0]) {
                    class380.method2254(var9, var10, var8, -1, var5, (var3 << 16) + (class521.field7730 << 24) + (var4 << 8) + var7);
                }
            }
        } else if (class292.field4044 == arg0) {
            int var12 = class179.field2631.method2348(-2);
            int var13 = class393.field5742 - -(var12 >> 4 & 7);
            int var14 = (var12 & 7) + class511.field7576;
            int var15 = class179.field2631.method2353((byte) 94);
            int var16 = class179.field2631.method2353((byte) 68);
            int var17 = class179.field2631.method2353((byte) 72);
            if (class36.field457 != null && ~var13 <= -1 && var14 >= 0 && var13 < class527.field7799 && ~class422.field6182 < ~var14) {
                class135 var18 = (class135) class36.field457.method1492((long) (var13 | var14 << 14 | class521.field7730 << 28), 6340);
                if (var18 != null) {
                    for (class440 var19 = (class440) var18.field1950.method2818((byte) 124); var19 != null; var19 = (class440) var18.field1950.method2820((byte) -58)) {
                        if (~(32767 & var15) == ~var19.field6509 && ~var19.field6507 == ~var16) {
                            var19.method1565(arg1 + 1520864244);
                            var19.field6507 = var17;
                            class356.method2133(var14, var19, var13, -68, class521.field7730);
                            break;
                        }
                    }
                    class224.method1392((byte) -84, class521.field7730, var14, var13);
                }
            }
        } else if (class315.field4320 == arg0) {
            int var20 = class179.field2631.method2348(arg1 + 1520864242);
            int var21 = class393.field5742 - -(var20 >> 4 & 7);
            int var22 = class511.field7576 - -(var20 & 7);
            int var23 = class179.field2631.method2353((byte) 120);
            int var24 = class179.field2631.method2348(-2);
            int var25 = class179.field2631.method2353((byte) 85);
            int var26 = class179.field2631.method2348(-2);
            if (var21 >= 0 && ~var22 <= -1 && class527.field7799 > var21 && var22 < class422.field6182) {
                int var27 = var21 * 128 + 64;
                int var28 = var22 * 128 + 64;
                int var29 = class521.field7730;
                if (var29 < 3 && class360.method2159(var22, false, var21)) {
                    ++var29;
                }
                class108 var30 = new class108(var23, var25, class441.field6516, class521.field7730, var29, var27, -var24 + class242.method1465(99, class521.field7730, var28, var27), var28, var21, var21, var22, var22, var26);
                class511.field7570.method2809(new class258(var30), arg1 ^ -1520864242);
            }
        } else if (class349.field5093 == arg0) {
            int var31 = class179.field2631.method2345(2);
            int var32 = class179.field2631.method2305(arg1 ^ 1520864137);
            int var33 = class393.field5742 - -(7 & var32 >> 4);
            int var34 = (var32 & 7) + class511.field7576;
            int var35 = class179.field2631.method2348(arg1 + 1520864242);
            int var36 = var35 >> 2;
            int var37 = var35 & 3;
            int var38 = class258.field3594[var36];
            if (class380.method2253(class403.field5918, -1) || ~var33 <= -1 && var34 >= 0 && ~var33 > ~class527.field7799 && ~var34 > ~class422.field6182) {
                class173.method1125(var37, var31, 0, var38, var36, -1, true, var34, var33, class521.field7730);
            }
        } else if (class404.field5931 == arg0) {
            int var39 = class179.field2631.method2305(-126);
            int var40 = (7 & var39 >> 4) + class393.field5742;
            int var41 = class511.field7576 - -(var39 & 7);
            int var42 = class179.field2631.method2345(2);
            if (var40 >= 0 && var41 >= 0 && ~var40 > ~class527.field7799 && class422.field6182 > var41) {
                class135 var43 = (class135) class36.field457.method1492((long) (class521.field7730 << 28 | var41 << 14 | var40), 6340);
                if (var43 != null) {
                    for (class440 var44 = (class440) var43.field1950.method2818((byte) 126); var44 != null; var44 = (class440) var43.field1950.method2820((byte) -58)) {
                        if (~(var42 & 32767) == ~var44.field6509) {
                            var44.method1565(0);
                            break;
                        }
                    }
                    if (var43.field1950.method2807(120)) {
                        var43.method1565(arg1 + 1520864244);
                    }
                    class224.method1392((byte) -81, class521.field7730, var41, var40);
                }
            }
        } else {
            if (arg1 != -1520864244) {
                method993((class74) null, 7);
            }
            if (class439.field6491 == arg0) {
                int var45 = class179.field2631.method2348(arg1 ^ 1520864242);
                int var46 = class393.field5742 * 2 - -(var45 >> 4 & 15);
                int var47 = class511.field7576 * 2 - -(var45 & 15);
                boolean var48 = class179.field2631.method2348(-2) != 0;
                int var49 = class179.field2631.method2337(-1) + var46;
                int var50 = var47 + class179.field2631.method2337(-1);
                int var51 = class179.field2631.method2311((byte) -92);
                int var52 = class179.field2631.method2353((byte) 83);
                int var53 = class179.field2631.method2348(arg1 + 1520864242) * 4;
                int var54 = class179.field2631.method2348(-2) * 4;
                int var55 = class179.field2631.method2353((byte) 112);
                int var56 = class179.field2631.method2353((byte) 110);
                int var57 = class179.field2631.method2348(arg1 + 1520864242);
                int var58 = class179.field2631.method2348(-2);
                if (~var57 == -256) {
                    var57 = -1;
                }
                if (var46 >= 0 && ~var47 <= -1 && class527.field7799 * 2 > var46 && class527.field7799 * 2 > var47 && ~var49 <= -1 && ~var50 <= -1 && ~var49 > ~(class422.field6182 * 2) && ~(class422.field6182 * 2) < ~var50 && ~var52 != -65536) {
                    int var59 = var47 * 64;
                    int var60 = var49 * 64;
                    int var61 = var53 << 0;
                    int var62 = var50 * 64;
                    int var63 = var54 << 0;
                    int var64 = var46 * 64;
                    class285 var65 = new class285(var52, class521.field7730, var64, var59, var61, var55 - -class441.field6516, var56 - -class441.field6516, var57, var58, var51, var63, var48);
                    var65.method1696(var60, var62, (byte) 115, class441.field6516 + var55, -var63 + class242.method1465(111, class521.field7730, var62, var60));
                    class53.field641.method2809(new class434(var65), 2);
                }
            } else if (class67.field919 == arg0) {
                int var66 = class179.field2631.method2348(arg1 ^ 1520864242);
                boolean var67 = (128 & var66) != 0;
                int var68 = ((var66 & 57) >> 3) + class393.field5742;
                int var69 = (var66 & 7) + class511.field7576;
                int var70 = class179.field2631.method2337(-1) + var68;
                int var71 = class179.field2631.method2337(arg1 + 1520864243) + var69;
                int var72 = class179.field2631.method2311((byte) 123);
                int var73 = class179.field2631.method2353((byte) 106);
                int var74 = 4 * class179.field2631.method2348(arg1 + 1520864242);
                int var75 = class179.field2631.method2348(-2) * 4;
                int var76 = class179.field2631.method2353((byte) 116);
                int var77 = class179.field2631.method2353((byte) 69);
                int var78 = class179.field2631.method2348(-2);
                int var79 = class179.field2631.method2348(arg1 + 1520864242);
                if (var78 == 255) {
                    var78 = -1;
                }
                if (~var68 <= -1 && var69 >= 0 && ~class527.field7799 < ~var68 && class422.field6182 > var69 && var70 >= 0 && ~var71 <= -1 && ~var70 > ~class527.field7799 && var71 < class422.field6182 && var73 != 65535) {
                    int var80 = var68 * 128 + 64;
                    int var81 = var74 << 0;
                    int var82 = var69 * 128 + 64;
                    int var83 = var75 << 0;
                    int var84 = var70 * 128 + 64;
                    int var85 = var71 * 128 + 64;
                    class285 var86 = new class285(var73, class521.field7730, var80, var82, var81, class441.field6516 + var76, class441.field6516 + var77, var78, var79, var72, var83, var67);
                    var86.method1696(var84, var85, (byte) 112, class441.field6516 + var76, -var83 + class242.method1465(107, class521.field7730, var85, var84));
                    class53.field641.method2809(new class434(var86), 2);
                }
            } else if (class128.field1896 == arg0) {
                int var87 = class179.field2631.method2348(-2);
                int var88 = ((var87 & 116) >> 4) + class393.field5742;
                int var89 = class511.field7576 - -(var87 & 7);
                int var90 = class179.field2631.method2346((byte) 43);
                byte var91 = class179.field2631.method2350((byte) -89);
                byte var92 = class179.field2631.method2350((byte) -14);
                byte var93 = class179.field2631.method2324(arg1 + 1520877730);
                byte var94 = class179.field2631.method2350((byte) -30);
                int var95 = class179.field2631.method2311((byte) 127);
                int var96 = class179.field2631.method2348(-2);
                int var97 = var96 >> 2;
                int var98 = 3 & var96;
                int var99 = class179.field2631.method2345(2);
                int var100 = class179.field2631.method2346((byte) 43);
                if (!class269.field3721.method308()) {
                    class210.method1301(var100, var97, var89, var90, var91, var92, var95, var98, var94, var99, var93, class521.field7730, var88, true);
                }
            } else if (class53.field646 == arg0) {
                class179.field2631.method2348(arg1 ^ 1520864242);
                int var101 = class179.field2631.method2348(-2);
                int var102 = class393.field5742 - -((127 & var101) >> 4);
                int var103 = (7 & var101) + class511.field7576;
                int var104 = class179.field2631.method2353((byte) 67);
                int var105 = class179.field2631.method2348(arg1 + 1520864242);
                int var106 = class179.field2631.method2338(true);
                String var107 = class179.field2631.method2347((byte) 49);
                class401.method2418(var102, var105, var104, 13150, class521.field7730, var107, var103, var106);
            } else if (class403.field5922 == arg0) {
                int var108 = class179.field2631.method2348(arg1 + 1520864242);
                int var109 = ((var108 & 243) >> 4) + class393.field5742 * 2;
                int var110 = (var108 & 15) + class511.field7576 * 2;
                boolean var111 = class179.field2631.method2348(arg1 ^ 1520864242) != 0;
                int var112 = class179.field2631.method2337(-1) + var109;
                int var113 = var110 - -class179.field2631.method2337(arg1 + 1520864243);
                int var114 = class179.field2631.method2311((byte) -100);
                int var115 = class179.field2631.method2311((byte) 127);
                int var116 = class179.field2631.method2353((byte) 90);
                byte var117 = class179.field2631.method2337(-1);
                int var118 = class179.field2631.method2348(-2) * 4;
                int var119 = class179.field2631.method2353((byte) 122);
                int var120 = class179.field2631.method2353((byte) 114);
                int var121 = class179.field2631.method2348(-2);
                if (var121 == 255) {
                    var121 = -1;
                }
                int var122 = class179.field2631.method2348(-2);
                if (~var109 <= -1 && ~var110 <= -1 && ~(class527.field7799 * 2) < ~var109 && ~(class527.field7799 * 2) < ~var110 && var112 >= 0 && ~var113 <= -1 && var112 < class422.field6182 * 2 && ~(class422.field6182 * 2) < ~var113 && ~var116 != -65536) {
                    int var123 = var109 * 64;
                    int var124 = var117 << 0;
                    int var125 = var113 * 64;
                    int var126 = var110 * 64;
                    int var127 = var118 << 0;
                    int var128 = var112 * 64;
                    if (~var114 != -1) {
                        int var130;
                        class77 var132;
                        if (var114 < 0) {
                            int var129 = -var114 + -1;
                            var130 = (32479 & var129) >> 11;
                            int var131 = var129 & 2047;
                            if (class152.field2335 != var131) {
                                var132 = class12.field182[var131];
                            } else {
                                var132 = class316.field4324;
                            }
                        } else {
                            int var133 = var114 + -1;
                            var130 = (31891 & var133) >> 11;
                            int var134 = 2047 & var133;
                            var132 = class378.field5533[var134];
                        }
                        if (var132 != null) {
                            class93 var135 = var132.method616((byte) -83);
                            if (var135.field1356 != null && var135.field1356[var130] != null) {
                                int var136 = var135.field1356[var130][0];
                                int var137 = var135.field1356[var130][2];
                                int var138 = var132.field1085.method701((byte) 17);
                                int var139 = class183.field2684[var138];
                                int var140 = class183.field2678[var138];
                                int var141 = var136 * var140 + var137 * var139 >> 15;
                                int var142 = var137 * var140 + -(var136 * var139) >> 15;
                                var123 += var141;
                                var126 += var142;
                                var124 -= var135.field1356[var130][1];
                            }
                        }
                    }
                    class285 var144 = new class285(var116, class521.field7730, var123, var126, var124, class441.field6516 + var119, class441.field6516 + var120, var121, var122, var115, var127, var111);
                    var144.method1696(var128, var125, (byte) 112, class441.field6516 + var119, class242.method1465(arg1 ^ -1520864142, class521.field7730, var125, var128) - var127);
                    class53.field641.method2809(new class434(var144), 2);
                }
            } else if (class531.field7816 == arg0) {
                int var145 = class179.field2631.method2346((byte) 43);
                if (var145 == 65535) {
                    var145 = -1;
                }
                int var146 = class179.field2631.method2352((byte) 8);
                int var147 = var146 >> 2;
                int var148 = var146 & 3;
                int var149 = class258.field3594[var147];
                int var150 = class179.field2631.method2348(-2);
                int var151 = ((121 & var150) >> 4) + class393.field5742;
                int var152 = (7 & var150) + class511.field7576;
                class227.method1410(var147, var145, var148, true, var151, var152, var149, class521.field7730);
            } else if (class402.field5894 == arg0) {
                int var153 = class179.field2631.method2353((byte) 75);
                int var154 = class179.field2631.method2348(-2);
                class78.field1141.method2103(var153, true).method1370(var154, 0);
            } else if (class30.field398 != arg0) {
                if (class435.field6368 == arg0) {
                    int var162 = class179.field2631.method2353((byte) 72);
                    int var163 = class179.field2631.method2353((byte) 77);
                    int var164 = class179.field2631.method2348(-2);
                    int var165 = class393.field5742 - -((116 & var164) >> 4);
                    int var166 = class511.field7576 - -(var164 & 7);
                    int var167 = class179.field2631.method2345(2);
                    if (var165 >= 0 && var166 >= 0 && var165 < class527.field7799 && ~class422.field6182 < ~var166 && class152.field2335 != var167) {
                        class356.method2133(var166, new class440(var163, var162), var165, 92, class521.field7730);
                        class224.method1392((byte) -50, class521.field7730, var166, var165);
                    }
                } else if (class120.field1774 == arg0) {
                    int var168 = class179.field2631.method2305(arg1 + 1520864127);
                    int var169 = ((126 & var168) >> 4) + class393.field5742;
                    int var170 = (var168 & 7) + class511.field7576;
                    int var171 = class179.field2631.method2313(255);
                    int var172 = class179.field2631.method2346((byte) 43);
                    if (~var169 <= -1 && var170 >= 0 && ~class527.field7799 < ~var169 && ~var170 > ~class422.field6182) {
                        class356.method2133(var170, new class440(var171, var172), var169, arg1 ^ -1520864158, class521.field7730);
                        class224.method1392((byte) -101, class521.field7730, var170, var169);
                    }
                } else {
                    class320.method1861((Throwable) null, (byte) -104, "T3 - " + arg0);
                    class285.method1701(-24827);
                }
            } else {
                int var155 = class179.field2631.method2348(-2);
                int var156 = var155 >> 2;
                int var157 = 3 & var155;
                int var158 = class258.field3594[var156];
                int var159 = class179.field2631.method2352((byte) 8);
                int var160 = class393.field5742 - -((var159 & 123) >> 4);
                int var161 = (var159 & 7) + class511.field7576;
                if (class380.method2253(class403.field5918, arg1 + 1520864243) || ~var160 <= -1 && ~var161 <= -1 && class527.field7799 > var160 && ~var161 > ~class422.field6182) {
                    class173.method1125(var157, -1, 0, var158, var156, -1, true, var161, var160, class521.field7730);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V", line = 618)
    public final void method417(int arg0, int arg1, int arg2) {
        this.field2151 += this.field2154[arg0] * arg2 >> 12;
        ++field2149;
        if (arg1 != 0) {
            this.method419(46);
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V", line = 631)
    public static void method994(byte arg0) {
        field2152 = null;
        field2161 = null;
        int var1 = 49 / ((arg0 - -24) / 45);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)V", line = 642)
    public final void method422(boolean arg0) {
        this.field2160 = 0;
        ++field2146;
        if (!arg0) {
            this.method422(false);
        }
        this.field2151 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIF)V", line = 665)
    public class149(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field550 < ~var7; ++var7) {
            this.field2154[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V", line = 690)
    public static final void method995(byte arg0) {
        for (class365 var1 = (class365) class490.field7151.method2818((byte) -4); var1 != null; var1 = (class365) class490.field7151.method2820((byte) -58)) {
            if (var1.field5349) {
                var1.method2199((byte) 65);
            }
        }
        ++field2147;
        for (class365 var2 = (class365) class281.field3860.method2818((byte) 118); var2 != null; var2 = (class365) class281.field3860.method2820((byte) -58)) {
            if (var2.field5349) {
                var2.method2199((byte) 65);
            }
        }
        int var3 = -16 % ((arg0 - 63) / 44);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBZ)V", line = 722)
    public void method892(int arg0, byte arg1, boolean arg2) {
        ++field2145;
        if (arg2) {
            method995((byte) -86);
        }
        this.field2150[this.field2160++] = (byte) (127 + class251.method1501(127, arg1 >> 1));
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 735)
    public final void method419(int arg0) {
        this.field2151 = Math.abs(this.field2151);
        ++field2148;
        if (this.field2151 >= 4096) {
            this.field2151 = 4095;
        }
        this.method892(this.field2160++, (byte) (this.field2151 >> 4), false);
        if (arg0 == -24137) {
            this.field2151 = 0;
        }
    }
}
