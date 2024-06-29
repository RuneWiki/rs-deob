import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class140 extends class134 {

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "J")
    public long field2085;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Lag;")
    public static class192 field2087 = new class192(64);

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "Z")
    public static boolean field2089 = true;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public static void method1024(int arg0) {
        field2087 = null;
        if (arg0 != 104) {
            field2089 = false;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V")
    public static final void method1025(int arg0, int arg1) {
        field2086++;
        class69 var2 = class255.method1723((byte) 32, arg1, arg0);
        var2.method554(2009563296);
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class140() {
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(J)V")
    public class140(long arg0) {
        this.field2085 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(B)V")
    public static final void method1026(byte arg0) {
        field2088++;
        if (class215.field3302 == 149) {
            int var1 = class183.field2900.method265(-116);
            int var2 = ((var1 & 0x7B) >> 4) + class229.field3643;
            int var3 = (var1 & 0x7) + class222.field3483;
            int var4 = class183.field2900.method260((byte) -67);
            int var5 = class183.field2900.method265(-120);
            int var6 = (var5 & 0xF4) >> 4;
            if (var4 == 65535) {
                var4 = -1;
            }
            int var7 = var5 & 0x7;
            int var8 = class183.field2900.method265(-114);
            int var9 = class183.field2900.method265(-114);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                int var10 = var6 + 1;
                if (class263.field4168.field4749[0] >= var2 - var10 && (var2 + var10) >= class263.field4168.field4749[0] && var3 - var10 <= class263.field4168.field4673[0] && (var3 + var10) >= class263.field4168.field4673[0] && class70.field1106 != 0 && var7 > 0 && class274.field4367 < 50 && var4 != -1) {
                    class181.field2842[class274.field4367] = var4;
                    class98.field1567[class274.field4367] = var7;
                    class48.field792[class274.field4367] = var8;
                    class164.field2488[class274.field4367] = null;
                    class63.field994[class274.field4367] = (var2 << 16) + (var3 << 8) + var6;
                    class303.field4868[class274.field4367] = var9;
                    class274.field4367++;
                }
            }
        } else if (class215.field3302 == 199) {
            int var11 = class183.field2900.method277((byte) -103);
            int var12 = class229.field3643 + ((var11 & 0x7C) >> 4);
            int var13 = (var11 & 0x7) + class222.field3483;
            int var14 = class183.field2900.method260((byte) -67);
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                class2 var15 = class110.field1695[class130.field1941][var12][var13];
                if (var15 != null) {
                    for (class57 var16 = (class57) var15.method6(-128); var16 != null; var16 = (class57) var15.method11((byte) 56)) {
                        if ((var14 & 0x7FFF) == var16.field898.field3900) {
                            var16.method995((byte) -126);
                            break;
                        }
                    }
                    if (var15.method6(-111) == null) {
                        class110.field1695[class130.field1941][var12][var13] = null;
                    }
                    class220.method1507(var12, var13, (byte) 115);
                }
            }
        } else if (class215.field3302 == 224) {
            int var17 = class183.field2900.method265(-124);
            int var18 = (var17 & 0xF) + class222.field3483 * 2;
            int var19 = class229.field3643 * 2 + (var17 >> 4 & 0xF);
            int var20 = class183.field2900.method266(-129) + var19;
            int var21 = class183.field2900.method266(-129) + var18;
            int var22 = class183.field2900.method308((byte) 9);
            int var23 = class183.field2900.method260((byte) -67);
            int var24 = class183.field2900.method265(-92) * 4;
            int var25 = class183.field2900.method265(-104) * 4;
            int var26 = class183.field2900.method260((byte) -67);
            int var27 = class183.field2900.method260((byte) -67);
            int var28 = class183.field2900.method265(-92);
            if (var28 == 255) {
                var28 = -1;
            }
            int var29 = class183.field2900.method265(-91);
            if (var19 >= 0 && var18 >= 0 && var19 < 208 && var18 < 208 && var20 >= 0 && var21 >= 0 && var20 < 208 && var21 < 208 && var23 != 65535) {
                int var30 = var20 * 64;
                int var31 = var18 * 64;
                int var32 = var19 * 64;
                int var33 = var21 * 64;
                class240 var34 = new class240(var23, class130.field1941, var32, var31, class254.method1721(-580808345, class130.field1941, var31, var32) - var24, class41.field686 + var26, var27 + class41.field686, var28, var29, var22, var25);
                var34.method1637(var33, class41.field686 + var26, var30, 0, class254.method1721(-580808345, class130.field1941, var33, var30) - var25);
                class22.field350.method12(new class282(var34), 12);
            }
        } else if (class215.field3302 == 228) {
            int var35 = class183.field2900.method260((byte) -67);
            int var36 = class183.field2900.method265(-111);
            class166.method1209(109, var35).method1968(var36, (byte) 89);
        } else {
            int var37 = -10 / ((arg0 + 13) / 56);
            if (class215.field3302 == 17) {
                int var38 = class183.field2900.method315((byte) 26);
                int var39 = var38 >> 2;
                int var40 = var38 & 0x3;
                int var41 = class280.field4431[var39];
                int var42 = class183.field2900.method315((byte) 15);
                int var43 = ((var42 & 0x75) >> 4) + class229.field3643;
                int var44 = (var42 & 0x7) + class222.field3483;
                if (var43 >= 0 && var44 >= 0 && var43 < 104 && var44 < 104) {
                    class125.method937(var43, 0, (byte) -128, var44, class130.field1941, var40, -1, var39, -1, var41);
                }
            } else if (class215.field3302 == 191) {
                int var45 = class183.field2900.method260((byte) -67);
                int var46 = class183.field2900.method265(-107);
                int var47 = (var46 >> 4 & 0x7) + class229.field3643;
                int var48 = class222.field3483 + (var46 & 0x7);
                int var49 = class183.field2900.method267(-7803);
                int var50 = class183.field2900.method256(-1);
                if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104 && class107.field1677 != var45) {
                    class244 var51 = new class244();
                    var51.field3900 = var49;
                    var51.field3899 = var50;
                    if (class110.field1695[class130.field1941][var47][var48] == null) {
                        class110.field1695[class130.field1941][var47][var48] = new class2();
                    }
                    class110.field1695[class130.field1941][var47][var48].method12(new class57(var51), 12);
                    class220.method1507(var47, var48, (byte) 61);
                }
            } else if (class215.field3302 == 122) {
                int var52 = class183.field2900.method295((byte) -87);
                int var53 = class229.field3643 + ((var52 & 0x7F) >> 4);
                int var54 = (var52 & 0x7) + class222.field3483;
                int var55 = class183.field2900.method282((byte) 109);
                int var56 = class183.field2900.method256(-1);
                if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                    class244 var57 = new class244();
                    var57.field3899 = var56;
                    var57.field3900 = var55;
                    if (class110.field1695[class130.field1941][var53][var54] == null) {
                        class110.field1695[class130.field1941][var53][var54] = new class2();
                    }
                    class110.field1695[class130.field1941][var53][var54].method12(new class57(var57), 12);
                    class220.method1507(var53, var54, (byte) 22);
                }
            } else {
                if (class215.field3302 == 138) {
                    int var58 = class183.field2900.method316(120);
                    int var59 = class183.field2900.method265(-94);
                    int var60 = var59 >> 2;
                    int var61 = var59 & 0x3;
                    byte var62 = class183.field2900.method272((byte) -58);
                    int var63 = class183.field2900.method282((byte) 121);
                    int var64 = class183.field2900.method315((byte) 114);
                    int var65 = ((var64 & 0x7E) >> 4) + class229.field3643;
                    int var66 = class222.field3483 + (var64 & 0x7);
                    int var67 = class183.field2900.method282((byte) 118);
                    byte var68 = class183.field2900.method272((byte) -108);
                    byte var69 = class183.field2900.method263(false);
                    int var70 = class183.field2900.method256(-1);
                    byte var71 = class183.field2900.method266(-129);
                    class286.method1922(var61, var60, var66, var65, var67, var62, var68, var71, var70, var63, 31923, var58, var69);
                }
                if (class215.field3302 == 109) {
                    int var72 = class183.field2900.method265(-97);
                    int var73 = class229.field3643 + (var72 >> 4 & 0x7);
                    int var74 = (var72 & 0x7) + class222.field3483;
                    int var75 = class183.field2900.method266(-129) + var73;
                    int var76 = var74 + class183.field2900.method266(-129);
                    int var77 = class183.field2900.method308((byte) -114);
                    int var78 = class183.field2900.method260((byte) -67);
                    int var79 = class183.field2900.method265(-103) * 4;
                    int var80 = class183.field2900.method265(-117) * 4;
                    int var81 = class183.field2900.method260((byte) -67);
                    int var82 = class183.field2900.method260((byte) -67);
                    int var83 = class183.field2900.method265(-105);
                    int var84 = class183.field2900.method265(-83);
                    if (var83 == 255) {
                        var83 = -1;
                    }
                    if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104 && var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && var78 != 65535) {
                        int var85 = var76 * 128 + 64;
                        int var86 = var73 * 128 + 64;
                        int var87 = var74 * 128 + 64;
                        class240 var88 = new class240(var78, class130.field1941, var86, var87, class254.method1721(-580808345, class130.field1941, var87, var86) - var79, class41.field686 + var81, var82 + class41.field686, var83, var84, var77, var80);
                        int var89 = var75 * 128 + 64;
                        var88.method1637(var85, class41.field686 + var81, var89, 0, class254.method1721(-580808345, class130.field1941, var85, var89) - var80);
                        class22.field350.method12(new class282(var88), 12);
                    }
                } else if (class215.field3302 == 73) {
                    int var90 = class183.field2900.method265(-89);
                    int var91 = (var90 & 0xF) + class222.field3483 * 2;
                    int var92 = ((var90 & 0xF0) >> 4) + class229.field3643 * 2;
                    int var93 = var92 + class183.field2900.method266(-129);
                    int var94 = var91 + class183.field2900.method266(-129);
                    int var95 = class183.field2900.method308((byte) -126);
                    int var96 = class183.field2900.method308((byte) -121);
                    int var97 = class183.field2900.method260((byte) -67);
                    int var98 = class183.field2900.method266(-129);
                    int var99 = class183.field2900.method265(-83) * 4;
                    int var100 = class183.field2900.method260((byte) -67);
                    int var101 = class183.field2900.method260((byte) -67);
                    int var102 = class183.field2900.method265(-92);
                    if (var102 == 255) {
                        var102 = -1;
                    }
                    int var103 = class183.field2900.method265(-92);
                    if (var92 >= 0 && var91 >= 0 && var92 < 208 && var91 < 208 && var93 >= 0 && var94 >= 0 && var93 < 208 && var94 < 208 && var97 != 65535) {
                        int var104 = var93 * 64;
                        int var105 = var92 * 64;
                        int var106 = var91 * 64;
                        int var107 = var94 * 64;
                        if (var95 != 0) {
                            class296 var110;
                            int var111;
                            if (var95 >= 0) {
                                int var108 = var95 - 1;
                                int var109 = var108 & 0x7FF;
                                var110 = class116.field1781[var109];
                                var111 = (var108 & 0x7AA1) >> 11;
                            } else {
                                int var112 = -var95 - 1;
                                int var113 = var112 & 0x7FF;
                                if (class107.field1677 == var113) {
                                    var110 = class263.field4168;
                                } else {
                                    var110 = class233.field3682[var113];
                                }
                                var111 = (var112 & 0x7EFF) >> 11;
                            }
                            if (var110 != null) {
                                class241 var114 = var110.method1982((byte) -54);
                                if (var114.field3849 != null && var114.field3849[var111] != null) {
                                    var98 -= var114.field3849[var111][1];
                                    int var115 = var114.field3849[var111][0];
                                    int var116 = var114.field3849[var111][2];
                                    int var117 = class224.field3597[var110.field4719];
                                    int var118 = class224.field3601[var110.field4719];
                                    int var119 = var116 * var118 + (var115 * var117) >> 16;
                                    int var120 = var116 * var117 - (var115 * var118) >> 16;
                                    var106 += var120;
                                    var105 += var119;
                                }
                            }
                        }
                        class240 var122 = new class240(var97, class130.field1941, var105, var106, class254.method1721(-580808345, class130.field1941, var106, var105) - var98, class41.field686 + var100, class41.field686 + var101, var102, var103, var96, var99);
                        var122.method1637(var107, class41.field686 + var100, var104, 0, class254.method1721(-580808345, class130.field1941, var107, var104) - var99);
                        class22.field350.method12(new class282(var122), 12);
                    }
                } else if (class215.field3302 == 78) {
                    int var123 = class183.field2900.method315((byte) 45);
                    int var124 = var123 >> 2;
                    int var125 = var123 & 0x3;
                    int var126 = class280.field4431[var124];
                    int var127 = class183.field2900.method277((byte) -103);
                    int var128 = class229.field3643 + ((var127 & 0x7E) >> 4);
                    int var129 = class222.field3483 + (var127 & 0x7);
                    int var130 = class183.field2900.method260((byte) -67);
                    if (var128 >= 0 && var129 >= 0 && var128 < 104 && var129 < 104) {
                        class125.method937(var128, 0, (byte) -128, var129, class130.field1941, var125, var130, var124, -1, var126);
                    }
                } else if (class215.field3302 == 225) {
                    int var131 = class183.field2900.method265(-112);
                    int var132 = class229.field3643 + ((var131 & 0x79) >> 4);
                    int var133 = (var131 & 0x7) + class222.field3483;
                    int var134 = class183.field2900.method260((byte) -67);
                    int var135 = class183.field2900.method260((byte) -67);
                    int var136 = class183.field2900.method260((byte) -67);
                    if (var132 >= 0 && var133 >= 0 && var132 < 104 && var133 < 104) {
                        class2 var137 = class110.field1695[class130.field1941][var132][var133];
                        if (var137 != null) {
                            for (class57 var138 = (class57) var137.method6(-119); var138 != null; var138 = (class57) var137.method11((byte) 116)) {
                                class244 var139 = var138.field898;
                                if ((var134 & 0x7FFF) == var139.field3900 && var139.field3899 == var135) {
                                    var139.field3899 = var136;
                                    break;
                                }
                            }
                            class220.method1507(var132, var133, (byte) 88);
                        }
                    }
                } else if (class215.field3302 == 30) {
                    int var140 = class183.field2900.method256(-1);
                    if (var140 == 65535) {
                        var140 = -1;
                    }
                    int var141 = class183.field2900.method277((byte) -103);
                    int var142 = class229.field3643 + (var141 >> 4 & 0x7);
                    int var143 = class222.field3483 + (var141 & 0x7);
                    int var144 = class183.field2900.method315((byte) 124);
                    int var145 = var144 & 0x3;
                    int var146 = var144 >> 2;
                    int var147 = class280.field4431[var146];
                    class24.method211(var147, var145, var142, var143, var140, (byte) 117, var146, class130.field1941);
                } else if (class215.field3302 == 81) {
                    int var148 = class183.field2900.method265(-100);
                    int var149 = (var148 >> 4 & 0x7) + class229.field3643;
                    int var150 = (var148 & 0x7) + class222.field3483;
                    int var151 = class183.field2900.method260((byte) -67);
                    int var152 = class183.field2900.method265(-116);
                    int var153 = class183.field2900.method260((byte) -67);
                    if (var149 >= 0 && var150 >= 0 && var149 < 104 && var150 < 104) {
                        int var154 = var149 * 128 + 64;
                        int var155 = var150 * 128 + 64;
                        class37 var156 = new class37(var151, class130.field1941, var154, var155, class254.method1721(-580808345, class130.field1941, var155, var154) - var152, var153, class41.field686);
                        class241.field3841.method12(new class307(var156), 12);
                    }
                }
            }
        }
    }
}
