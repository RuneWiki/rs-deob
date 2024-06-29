import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class144 {

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "I")
    private int field2384 = 0;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "[Lhb;")
    public class146[] field2380;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "[I")
    public static int[] field2366 = new int[5];

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    public static int field2375 = 0;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Lic;")
    public static class160 field2383 = new class160(64);

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    public static int field2386 = 0;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "J")
    private long field2365;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "Lsb;")
    public static class124 field2385;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "Lhb;")
    private class146 field2364;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "Lhb;")
    private class146 field2382;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)I")
    public final int method1058(boolean arg0) {
        if (arg0) {
            this.method1066(72);
        }
        int var2 = 0;
        field2376++;
        for (int var3 = 0; var3 < this.field2370; var3++) {
            class146 var4 = this.field2380[var3];
            class146 var5 = var4.field2407;
            while (var4 != var5) {
                var5 = var5.field2407;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Lhb;")
    public final class146 method1059(int arg0) {
        field2371++;
        if (this.field2384 > 0 && this.field2380[this.field2384 - 1] != this.field2382) {
            class146 var2 = this.field2382;
            this.field2382 = var2.field2407;
            return var2;
        }
        if (arg0 != -14608) {
            field2378 = -62;
        }
        while (this.field2370 > this.field2384) {
            class146 var3 = this.field2380[this.field2384++].field2407;
            if (this.field2380[this.field2384 - 1] != var3) {
                this.field2382 = var3.field2407;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
    public final void method1060(int arg0) {
        for (int var2 = 0; var2 < this.field2370; var2++) {
            class146 var4 = this.field2380[var2];
            while (true) {
                class146 var5 = var4.field2407;
                if (var4 == var5) {
                    break;
                }
                var5.method1074((byte) -13);
            }
        }
        this.field2364 = null;
        int var3 = 15 / ((-arg0 - 32) / 63);
        field2372++;
        this.field2382 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)I")
    public static final int method1061(byte arg0, int arg1) {
        field2363++;
        if (arg0 < 99) {
            method1065(-105);
        }
        return (arg1 & 0x3FF04) >> 11;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)Lhb;")
    public final class146 method1062(int arg0) {
        field2377++;
        int var2 = -100 / ((-arg0 - 23) / 45);
        this.field2384 = 0;
        return this.method1059(-14608);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BJ)Lhb;")
    public final class146 method1063(byte arg0, long arg1) {
        field2368++;
        this.field2365 = arg1;
        class146 var4 = this.field2380[(int) ((long) (this.field2370 - 1) & arg1)];
        this.field2364 = var4.field2407;
        if (arg0 >= -8) {
            return null;
        }
        while (this.field2364 != var4) {
            if (this.field2364.field2406 == arg1) {
                class146 var5 = this.field2364;
                this.field2364 = this.field2364.field2407;
                return var5;
            }
            this.field2364 = this.field2364.field2407;
        }
        this.field2364 = null;
        return null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lhb;JB)V")
    public final void method1064(class146 arg0, long arg1, byte arg2) {
        field2369++;
        if (arg0.field2405 != null) {
            arg0.method1074((byte) 4);
        }
        class146 var5 = this.field2380[(int) (arg1 & (long) (this.field2370 - 1))];
        arg0.field2407 = var5;
        arg0.field2406 = arg1;
        arg0.field2405 = var5.field2405;
        arg0.field2405.field2407 = arg0;
        arg0.field2407.field2405 = arg0;
        if (arg2 > -121) {
            field2378 = 0;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
    public static final void method1065(int arg0) {
        field2379++;
        if (client.field4578 == 193) {
            int var1 = class143.field2360.method1011((byte) 67);
            int var2 = class143.field2360.method1015((byte) 100);
            int var3 = (var2 & 0x7) + class165.field2735;
            int var4 = (var2 >> 4 & 0x7) + class149.field2449;
            if (var4 >= 0 && var3 >= 0 && var4 < 104 && var3 < 104) {
                class266 var5 = class2.field23[class92.field1448][var4][var3];
                if (var5 != null) {
                    for (class101 var6 = (class101) var5.method1807(-102); var6 != null; var6 = (class101) var5.method1808((byte) 116)) {
                        if ((var1 & 0x7FFF) == var6.field1553.field3329) {
                            var6.method1074((byte) -122);
                            break;
                        }
                    }
                    if (var5.method1807(-103) == null) {
                        class2.field23[class92.field1448][var4][var3] = null;
                    }
                    class269.method1833(var4, arg0 ^ 0x270D, var3);
                }
            }
        } else if (client.field4578 == 171) {
            int var7 = class143.field2360.method1012(arg0 - 18128);
            int var8 = (var7 >> 4 & 0x7) + class149.field2449;
            int var9 = (var7 & 0x7) + class165.field2735;
            int var10 = class143.field2360.method996(65280);
            int var11 = class143.field2360.method1012(4);
            int var12 = class143.field2360.method996(65280);
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                int var13 = var9 * 128 + 64;
                int var14 = var8 * 128 + 64;
                class50 var15 = new class50(var10, class92.field1448, var14, var13, class218.method1450(var13, var14, true, class92.field1448) - var11, var12, class207.field3336);
                class229.field3655.method1809(arg0 - 18127, new class197(var15));
            }
        } else if (arg0 == 18132) {
            if (client.field4578 == 109) {
                int var16 = class143.field2360.method1012(4);
                int var17 = (var16 & 0xF) + class165.field2735 * 2;
                int var18 = ((var16 & 0xFE) >> 4) + class149.field2449 * 2;
                int var19 = var18 + class143.field2360.method981(false);
                int var20 = class143.field2360.method981(false) + var17;
                int var21 = class143.field2360.method1027((byte) 64);
                int var22 = class143.field2360.method1027((byte) 64);
                int var23 = class143.field2360.method996(65280);
                int var24 = class143.field2360.method981(false);
                int var25 = class143.field2360.method1012(arg0 - 18128) * 4;
                int var26 = class143.field2360.method996(65280);
                int var27 = class143.field2360.method996(65280);
                int var28 = class143.field2360.method1012(4);
                int var29 = class143.field2360.method1012(4);
                if (var28 == 255) {
                    var28 = -1;
                }
                if (var18 >= 0 && var17 >= 0 && var18 < 208 && var17 < 208 && var19 >= 0 && var20 >= 0 && var19 < 208 && var20 < 208 && var23 != 65535) {
                    int var30 = var18 * 64;
                    int var31 = var19 * 64;
                    int var32 = var20 * 64;
                    int var33 = var17 * 64;
                    if (var21 != 0) {
                        class171 var36;
                        int var37;
                        if (var21 >= 0) {
                            int var34 = var21 - 1;
                            int var35 = var34 & 0x7FF;
                            var36 = class3.field45[var35];
                            var37 = (var34 & 0x7B89) >> 11;
                        } else {
                            int var38 = -var21 - 1;
                            int var39 = var38 & 0x7FF;
                            var37 = var38 >> 11 & 0xF;
                            if (class288.field4607 == var39) {
                                var36 = class48.field878;
                            } else {
                                var36 = class191.field3129[var39];
                            }
                        }
                        if (var36 != null) {
                            class38 var40 = var36.method1224(-1);
                            if (var40.field669 != null && var40.field669[var37] != null) {
                                int var41 = var40.field669[var37][0];
                                var24 -= var40.field669[var37][1];
                                int var42 = var40.field669[var37][2];
                                int var43 = class95.field1482[var36.field2831];
                                int var44 = class95.field1475[var36.field2831];
                                int var45 = var41 * var44 + var42 * var43 >> 16;
                                int var46 = var42 * var44 - (var41 * var43) >> 16;
                                var33 += var46;
                                var30 += var45;
                            }
                        }
                    }
                    class14 var48 = new class14(var23, class92.field1448, var30, var33, class218.method1450(var33, var30, true, class92.field1448) - var24, class207.field3336 + var26, class207.field3336 + var27, var28, var29, var22, var25);
                    var48.method93(var32, class218.method1450(var32, var31, true, class92.field1448) - var25, var26 - -class207.field3336, var31, false);
                    class140.field2335.method1809(5, new class71(var48));
                }
            } else if (client.field4578 == 183) {
                int var49 = class143.field2360.method1012(4);
                int var50 = class149.field2449 + (var49 >> 4 & 0x7);
                int var51 = (var49 & 0x7) + class165.field2735;
                int var52 = class143.field2360.method996(65280);
                if (var52 == 65535) {
                    var52 = -1;
                }
                int var53 = class143.field2360.method1012(4);
                int var54 = class143.field2360.method1012(4);
                int var55 = var53 & 0x7;
                int var56 = class143.field2360.method1012(4);
                int var57 = var53 >> 4 & 0xF;
                if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                    int var58 = var57 + 1;
                    if (class48.field878.field2844[0] >= (var50 - var58) && var50 + var58 >= class48.field878.field2844[0] && var51 - var58 <= class48.field878.field2813[0] && var51 + var58 >= class48.field878.field2813[0] && class111.field1719 != 0 && var55 > 0 && class153.field2497 < 50 && var52 != -1) {
                        class286.field4555[class153.field2497] = var52;
                        class4.field60[class153.field2497] = var55;
                        class194.field3171[class153.field2497] = var54;
                        class92.field1447[class153.field2497] = null;
                        class116.field1959[class153.field2497] = (var50 << 16) + var57 + (var51 << 8);
                        class70.field1175[class153.field2497] = var56;
                        class153.field2497++;
                    }
                }
            } else if (client.field4578 == 57) {
                int var59 = class143.field2360.method1012(arg0 - 18128);
                int var60 = (var59 >> 4 & 0xF) + class149.field2449 * 2;
                int var61 = (var59 & 0xF) + class165.field2735 * 2;
                int var62 = var60 + class143.field2360.method981(false);
                int var63 = var61 + class143.field2360.method981(false);
                int var64 = class143.field2360.method1027((byte) 64);
                int var65 = class143.field2360.method996(65280);
                int var66 = class143.field2360.method1012(arg0 - 18128) * 4;
                int var67 = class143.field2360.method1012(arg0 ^ 0x46D0) * 4;
                int var68 = class143.field2360.method996(65280);
                int var69 = class143.field2360.method996(65280);
                int var70 = class143.field2360.method1012(4);
                if (var70 == 255) {
                    var70 = -1;
                }
                int var71 = class143.field2360.method1012(4);
                if (var60 >= 0 && var61 >= 0 && var60 < 208 && var61 < 208 && var62 >= 0 && var63 >= 0 && var62 < 208 && var63 < 208 && var65 != 65535) {
                    int var72 = var60 * 64;
                    int var73 = var61 * 64;
                    class14 var74 = new class14(var65, class92.field1448, var72, var73, class218.method1450(var73, var72, true, class92.field1448) - var66, var68 - -class207.field3336, var69 + class207.field3336, var70, var71, var64, var67);
                    int var75 = var63 * 64;
                    int var76 = var62 * 64;
                    var74.method93(var75, class218.method1450(var75, var76, true, class92.field1448) - var67, class207.field3336 + var68, var76, false);
                    class140.field2335.method1809(5, new class71(var74));
                }
            } else if (client.field4578 == 151) {
                int var77 = class143.field2360.method1011((byte) 97);
                int var78 = class143.field2360.method976((byte) -113);
                int var79 = class165.field2735 + (var78 & 0x7);
                int var80 = ((var78 & 0x7D) >> 4) + class149.field2449;
                int var81 = class143.field2360.method996(65280);
                if (var80 >= 0 && var79 >= 0 && var80 < 104 && var79 < 104) {
                    class207 var82 = new class207();
                    var82.field3329 = var77;
                    var82.field3333 = var81;
                    if (class2.field23[class92.field1448][var80][var79] == null) {
                        class2.field23[class92.field1448][var80][var79] = new class266();
                    }
                    class2.field23[class92.field1448][var80][var79].method1809(5, new class101(var82));
                    class269.method1833(var80, 25049, var79);
                }
            } else if (client.field4578 == 24) {
                int var83 = class143.field2360.method1012(arg0 - 18128);
                int var84 = class149.field2449 + (var83 >> 4 & 0x7);
                int var85 = (var83 & 0x7) + class165.field2735;
                int var86 = class143.field2360.method988(744911448);
                int var87 = class143.field2360.method1025((byte) 42);
                int var88 = class143.field2360.method1025((byte) 60);
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && class288.field4607 != var88) {
                    class207 var89 = new class207();
                    var89.field3333 = var87;
                    var89.field3329 = var86;
                    if (class2.field23[class92.field1448][var84][var85] == null) {
                        class2.field23[class92.field1448][var84][var85] = new class266();
                    }
                    class2.field23[class92.field1448][var84][var85].method1809(arg0 ^ 0x46D1, new class101(var89));
                    class269.method1833(var84, 25049, var85);
                }
            } else if (client.field4578 == 176) {
                int var90 = class143.field2360.method996(65280);
                int var91 = class143.field2360.method1012(4);
                class46.method396(var90, (byte) 63).method1654(var91, 0);
            } else if (client.field4578 == 99) {
                int var92 = class143.field2360.method1012(arg0 ^ 0x46D0);
                int var93 = (var92 >> 4 & 0x7) + class149.field2449;
                int var94 = (var92 & 0x7) + class165.field2735;
                int var95 = class143.field2360.method976((byte) -103);
                int var96 = var95 >> 2;
                int var97 = class260.field4139[var96];
                int var98 = var95 & 0x3;
                int var99 = class143.field2360.method1011((byte) 67);
                if (var93 >= 0 && var94 >= 0 && var93 < 104 && var94 < 104) {
                    class131.method947(var96, var93, var98, var94, var97, -1, 0, class92.field1448, -128, var99);
                }
            } else if (client.field4578 == 53) {
                int var100 = class143.field2360.method1015((byte) -66);
                int var101 = var100 & 0x3;
                int var102 = var100 >> 2;
                int var103 = class260.field4139[var102];
                int var104 = class143.field2360.method1025((byte) 110);
                int var105 = class143.field2360.method1015((byte) 101);
                int var106 = ((var105 & 0x7E) >> 4) + class149.field2449;
                if (var104 == 65535) {
                    var104 = -1;
                }
                int var107 = (var105 & 0x7) + class165.field2735;
                class282.method1895(var104, var103, var107, var101, class92.field1448, var106, var102, arg0 - 18211);
            } else if (client.field4578 == 7) {
                int var108 = class143.field2360.method1012(arg0 - 18128);
                int var109 = ((var108 & 0x79) >> 4) + class149.field2449;
                int var110 = (var108 & 0x7) + class165.field2735;
                int var111 = var109 + class143.field2360.method981(false);
                int var112 = class143.field2360.method981(false) + var110;
                int var113 = class143.field2360.method1027((byte) 64);
                int var114 = class143.field2360.method996(65280);
                int var115 = class143.field2360.method1012(4) * 4;
                int var116 = class143.field2360.method1012(4) * 4;
                int var117 = class143.field2360.method996(65280);
                int var118 = class143.field2360.method996(arg0 + 47148);
                int var119 = class143.field2360.method1012(arg0 ^ 0x46D0);
                int var120 = class143.field2360.method1012(arg0 ^ 0x46D0);
                if (var119 == 255) {
                    var119 = -1;
                }
                if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104 && var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104 && var114 != 65535) {
                    int var121 = var110 * 128 + 64;
                    int var122 = var109 * 128 + 64;
                    int var123 = var112 * 128 + 64;
                    int var124 = var111 * 128 + 64;
                    class14 var125 = new class14(var114, class92.field1448, var122, var121, class218.method1450(var121, var122, true, class92.field1448) - var115, class207.field3336 + var117, class207.field3336 + var118, var119, var120, var113, var116);
                    var125.method93(var123, class218.method1450(var123, var124, true, class92.field1448) - var116, class207.field3336 + var117, var124, false);
                    class140.field2335.method1809(arg0 ^ 0x46D1, new class71(var125));
                }
            } else if (client.field4578 == 34) {
                int var126 = class143.field2360.method1012(4);
                int var127 = class149.field2449 + (var126 >> 4 & 0x7);
                int var128 = (var126 & 0x7) + class165.field2735;
                int var129 = class143.field2360.method996(65280);
                int var130 = class143.field2360.method996(65280);
                int var131 = class143.field2360.method996(arg0 + 47148);
                if (var127 >= 0 && var128 >= 0 && var127 < 104 && var128 < 104) {
                    class266 var132 = class2.field23[class92.field1448][var127][var128];
                    if (var132 != null) {
                        for (class101 var133 = (class101) var132.method1807(-123); var133 != null; var133 = (class101) var132.method1808((byte) 73)) {
                            class207 var134 = var133.field1553;
                            if ((var129 & 0x7FFF) == var134.field3329 && var134.field3333 == var130) {
                                var134.field3333 = var131;
                                break;
                            }
                        }
                        class269.method1833(var127, 25049, var128);
                    }
                }
            } else if (client.field4578 == 82) {
                int var135 = class143.field2360.method976((byte) -110);
                int var136 = var135 & 0x3;
                int var137 = var135 >> 2;
                int var138 = class260.field4139[var137];
                int var139 = class143.field2360.method1003(arg0 - 18260);
                int var140 = (var139 >> 4 & 0x7) + class149.field2449;
                int var141 = (var139 & 0x7) + class165.field2735;
                if (var140 >= 0 && var141 >= 0 && var140 < 104 && var141 < 104) {
                    class131.method947(var137, var140, var136, var141, var138, -1, 0, class92.field1448, arg0 - 18231, -1);
                }
            } else if (client.field4578 == 29) {
                int var142 = class143.field2360.method996(65280);
                byte var143 = class143.field2360.method977(55);
                int var144 = class143.field2360.method1012(4);
                int var145 = var144 >> 2;
                int var146 = var144 & 0x3;
                int var147 = class143.field2360.method988(744911448);
                int var148 = class143.field2360.method976((byte) -104);
                int var149 = (var148 >> 4 & 0x7) + class149.field2449;
                int var150 = (var148 & 0x7) + class165.field2735;
                byte var151 = class143.field2360.method993((byte) 18);
                byte var152 = class143.field2360.method1007(false);
                byte var153 = class143.field2360.method993((byte) 18);
                int var154 = class143.field2360.method988(744911448);
                int var155 = class143.field2360.method1002((byte) 106);
                class157.method1132(var145, var155, var143, var149, var151, var153, var152, var142, var146, 0, var147, var150, var154);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)I")
    public final int method1066(int arg0) {
        if (arg0 == -24662) {
            field2367++;
            return this.field2370;
        } else {
            return 72;
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V")
    public static final void method1067(int arg0) {
        class61.field1037.method1157(760);
        field2374++;
        if (arg0 != -15600) {
            method1067(-58);
        }
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)Lhb;")
    public final class146 method1068(int arg0) {
        field2373++;
        if (this.field2364 == null) {
            return null;
        }
        class146 var2 = this.field2380[(int) (this.field2365 & (long) (this.field2370 + arg0))];
        while (this.field2364 != var2) {
            if (this.field2364.field2406 == this.field2365) {
                class146 var3 = this.field2364;
                this.field2364 = this.field2364.field2407;
                return var3;
            }
            this.field2364 = this.field2364.field2407;
        }
        this.field2364 = null;
        return null;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(I)V")
    public class144(int arg0) {
        this.field2370 = arg0;
        this.field2380 = new class146[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class146 var3 = this.field2380[var2] = new class146();
            var3.field2405 = var3;
            var3.field2407 = var3;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method1069(byte arg0) {
        field2385 = null;
        if (arg0 == -63) {
            field2366 = null;
            field2383 = null;
        }
    }
}
