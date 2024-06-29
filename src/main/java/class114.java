import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class114 {

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "[I")
    private int[] field2185;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "[I")
    private int[] field2186;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "[B")
    private byte[] field2187;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field2184 = 0;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field2181 = 0;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "[I")
    public static int[] field2191 = new int[50];

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field2183;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field2188;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "[[[B")
    public static byte[][][] field2182;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static final void method844(byte arg0) {
        class133.field2479++;
        class48.field692.method301(103, -104);
        if (arg0 != -124) {
            field2182 = null;
        }
        field2183++;
        class48.field692.method918(0L, arg0 + 18944);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I[BIII[B)I")
    public final int method845(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field2190++;
        if (arg0 == arg4) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg2 + arg4;
        int var9 = arg3;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var7 = this.field2185[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field2185[var7]) < 0) {
                arg1[arg2++] = (byte) (~var11);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field2185[var7];
            }
            int var12;
            if ((var12 = this.field2185[var7]) < 0) {
                arg1[arg2++] = (byte) (~var12);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field2185[var7];
            }
            int var13;
            if ((var13 = this.field2185[var7]) < 0) {
                arg1[arg2++] = (byte) (~var13);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field2185[var7];
            }
            int var14;
            if ((var14 = this.field2185[var7]) < 0) {
                arg1[arg2++] = (byte) (~var14);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field2185[var7];
            }
            int var15;
            if ((var15 = this.field2185[var7]) < 0) {
                arg1[arg2++] = (byte) (~var15);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field2185[var7];
            }
            int var16;
            if ((var16 = this.field2185[var7]) < 0) {
                arg1[arg2++] = (byte) (~var16);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field2185[var7];
            }
            int var17;
            if ((var17 = this.field2185[var7]) < 0) {
                arg1[arg2++] = (byte) (~var17);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field2185[var7];
            }
            int var18;
            if ((var18 = this.field2185[var7]) < 0) {
                arg1[arg2++] = (byte) (~var18);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(B)V")
    public static final void method846(byte arg0) {
        field2179++;
        if (class13.field190 == 175) {
            int var1 = class199.field3595.method912(103);
            int var2 = class199.field3595.method937(false);
            int var3 = ((var2 & 0x79) >> 4) + class202.field3650;
            int var4 = (var2 & 0x7) + class58.field1058;
            int var5 = class199.field3595.method937(false);
            int var6 = var5 >> 2;
            int var7 = var5 & 0x3;
            int var8 = class108.field2033[var6];
            if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                class199.method1447(var3, var4, -1, var7, var6, (byte) 59, 0, class52.field927, var8, var1);
            }
        } else if (arg0 <= -59) {
            if (class13.field190 == 222) {
                int var9 = class199.field3595.method937(false);
                int var10 = (var9 & 0x7) + class58.field1058;
                int var11 = class202.field3650 + (var9 >> 4 & 0x7);
                int var12 = class199.field3595.method912(-127);
                int var13 = class199.field3595.method937(false);
                int var14 = class199.field3595.method912(-118);
                if (var11 >= 0 && var10 >= 0 && var11 < 104 && var10 < 104) {
                    int var15 = var11 * 128 + 64;
                    int var16 = var10 * 128 + 64;
                    class228 var17 = new class228(var12, class52.field927, var15, var16, class156.method1179(var15, var16, 20, class52.field927) - var13, var14, class180.field3272);
                    class262.field4668.method1727(-121, new class180(var17));
                }
            } else if (class13.field190 == 220) {
                int var18 = class199.field3595.method962((byte) -62);
                int var19 = class199.field3595.method930((byte) 52);
                int var20 = class199.field3595.method937(false);
                int var21 = class202.field3650 + (var20 >> 4 & 0x7);
                int var22 = (var20 & 0x7) + class58.field1058;
                if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                    class247 var23 = new class247();
                    var23.field4524 = var18;
                    var23.field4518 = var19;
                    if (class32.field437[class52.field927][var21][var22] == null) {
                        class32.field437[class52.field927][var21][var22] = new class243();
                    }
                    class32.field437[class52.field927][var21][var22].method1727(-109, new class41(var23));
                    class263.method1808(var21, var22, 64);
                }
            } else {
                if (class13.field190 == 32) {
                    int var24 = class199.field3595.method937(false);
                    int var25 = (var24 >> 4 & 0x7) + class202.field3650;
                    int var26 = class58.field1058 + (var24 & 0x7);
                    int var27 = class199.field3595.method962((byte) -105);
                    byte var28 = class199.field3595.method949((byte) 59);
                    byte var29 = class199.field3595.method935(65280);
                    int var30 = class199.field3595.method930((byte) 52);
                    int var31 = class199.field3595.method917(255);
                    int var32 = var31 >> 2;
                    int var33 = var31 & 0x3;
                    int var34 = class108.field2033[var32];
                    byte var35 = class199.field3595.method924(123);
                    int var36 = class199.field3595.method912(-125);
                    int var37 = class199.field3595.method961(-268435456);
                    byte var38 = class199.field3595.method949((byte) 59);
                    class108 var39;
                    if (class13.field191 == var27) {
                        var39 = class156.field2904;
                    } else {
                        var39 = class35.field491[var27];
                    }
                    if (var39 != null) {
                        class12 var40 = class145.method1102(var30, 0);
                        int var41;
                        int var42;
                        if (var33 == 1 || var33 == 3) {
                            var42 = var40.field153;
                            var41 = var40.field127;
                        } else {
                            var41 = var40.field153;
                            var42 = var40.field127;
                        }
                        int var43 = (var41 >> 1) + var25;
                        int var44 = (var41 + 1 >> 1) + var25;
                        int[][] var45 = class271.field4793[class52.field927];
                        int var46 = var26 + (var42 >> 1);
                        int var47 = (var42 + 1 >> 1) + var26;
                        int[][] var48 = null;
                        int var49 = var45[var43][var47] + var45[var44][var46] + var45[var43][var46] + var45[var44][var47] >> 2;
                        if (class52.field927 < 3) {
                            var48 = class271.field4793[class52.field927 + 1];
                        }
                        int var50 = (var26 << 7) + (var42 << 6);
                        int var51 = (var25 << 7) + (var41 << 6);
                        class9 var52 = var40.method61(var50, var45, var32, var48, (class121) null, false, var33, var51, var49, (byte) -92, var40.field163);
                        if (var52 != null) {
                            class199.method1447(var25, var26, var37 + 1, 0, 0, (byte) 70, var36 + 1, class52.field927, var34, -1);
                            var39.field2040 = var25 * 128 + var41 * 64;
                            var39.field2035 = var49;
                            var39.field2068 = class180.field3272 + var37;
                            var39.field2069 = class180.field3272 + var36;
                            if (var38 < var35) {
                                byte var53 = var35;
                                var35 = var38;
                                var38 = var53;
                            }
                            var39.field2034 = (class92) var52.field64;
                            var39.field2051 = var26 * 128 + var42 * 64;
                            var39.field2078 = var25 + var38;
                            if (var29 < var28) {
                                byte var54 = var28;
                                var28 = var29;
                                var29 = var54;
                            }
                            var39.field2049 = var25 + var35;
                            var39.field2053 = var26 + var28;
                            var39.field2065 = var26 + var29;
                        }
                    }
                }
                if (class13.field190 == 240) {
                    int var55 = class199.field3595.method937(false);
                    int var56 = ((var55 & 0x75) >> 4) + class202.field3650;
                    int var57 = (var55 & 0x7) + class58.field1058;
                    int var58 = class199.field3595.method950(1495791448) + var56;
                    int var59 = class199.field3595.method950(1495791448) + var57;
                    int var60 = class199.field3595.method955((byte) -71);
                    int var61 = class199.field3595.method912(48);
                    int var62 = class199.field3595.method937(false) * 4;
                    int var63 = class199.field3595.method937(false) * 4;
                    int var64 = class199.field3595.method912(-84);
                    int var65 = class199.field3595.method912(80);
                    int var66 = class199.field3595.method937(false);
                    int var67 = class199.field3595.method937(false);
                    if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104 && var58 >= 0 && var59 >= 0 && var58 < 104 && var59 < 104 && var61 != 65535) {
                        int var68 = var57 * 128 + 64;
                        int var69 = var56 * 128 + 64;
                        class112 var70 = new class112(var61, class52.field927, var69, var68, class156.method1179(var69, var68, 122, class52.field927) - var62, var64 - -class180.field3272, class180.field3272 + var65, var66, var67, var60, var63);
                        int var71 = var59 * 128 + 64;
                        int var72 = var58 * 128 + 64;
                        var70.method828(var72, class156.method1179(var72, var71, 126, class52.field927) - var63, var71, (byte) -85, class180.field3272 + var64);
                        class210.field3822.method1727(-118, new class170(var70));
                    }
                } else if (class13.field190 == 126) {
                    int var73 = class199.field3595.method937(false);
                    int var74 = (var73 & 0x7) + class58.field1058;
                    int var75 = (var73 >> 4 & 0x7) + class202.field3650;
                    int var76 = class199.field3595.method912(-103);
                    int var77 = class199.field3595.method937(false);
                    if (var76 == 65535) {
                        var76 = -1;
                    }
                    int var78 = (var77 & 0xF0) >> 4;
                    int var79 = class199.field3595.method937(false);
                    int var80 = var77 & 0x7;
                    if (var75 >= 0 && var74 >= 0 && var75 < 104 && var74 < 104) {
                        int var81 = var78 + 1;
                        if (var75 - var81 <= class156.field2904.field3998[0] && var75 + var81 >= class156.field2904.field3998[0] && class156.field2904.field4046[0] >= (var74 - var81) && (var74 + var81) >= class156.field2904.field4046[0] && class11.field105 != 0 && var80 > 0 && class229.field4200 < 50 && var76 != -1) {
                            class124.field2309[class229.field4200] = var76;
                            class220.field3956[class229.field4200] = var80;
                            class59.field1077[class229.field4200] = var79;
                            class83.field1592[class229.field4200] = null;
                            field2191[class229.field4200] = (var74 << 8) + (var75 << 16) + var78;
                            class229.field4200++;
                        }
                    }
                } else if (class13.field190 == 135) {
                    int var82 = class199.field3595.method937(false);
                    int var83 = ((var82 & 0x74) >> 4) + class202.field3650;
                    int var84 = class58.field1058 + (var82 & 0x7);
                    int var85 = class199.field3595.method912(-120);
                    int var86 = class199.field3595.method912(-105);
                    int var87 = class199.field3595.method912(-78);
                    if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                        class243 var88 = class32.field437[class52.field927][var83][var84];
                        if (var88 != null) {
                            for (class41 var89 = (class41) var88.method1724(255); var89 != null; var89 = (class41) var88.method1726(102)) {
                                class247 var90 = var89.field579;
                                if ((var85 & 0x7FFF) == var90.field4518 && var90.field4524 == var86) {
                                    var90.field4524 = var87;
                                    break;
                                }
                            }
                            class263.method1808(var83, var84, 64);
                        }
                    }
                } else if (class13.field190 == 244) {
                    int var91 = class199.field3595.method937(false);
                    int var92 = (var91 >> 4 & 0xF) + class202.field3650 * 2;
                    int var93 = (var91 & 0xF) + class58.field1058 * 2;
                    int var94 = class199.field3595.method950(1495791448) + var92;
                    int var95 = class199.field3595.method950(1495791448) + var93;
                    int var96 = class199.field3595.method955((byte) -69);
                    int var97 = class199.field3595.method912(-114);
                    int var98 = class199.field3595.method937(false) * 4;
                    int var99 = class199.field3595.method937(false) * 4;
                    int var100 = class199.field3595.method912(104);
                    int var101 = class199.field3595.method912(-108);
                    int var102 = class199.field3595.method937(false);
                    int var103 = class199.field3595.method937(false);
                    if (var92 >= 0 && var93 >= 0 && var92 < 208 && var93 < 208 && var94 >= 0 && var95 >= 0 && var94 < 208 && var95 < 208 && var97 != 65535) {
                        int var104 = var94 * 64;
                        int var105 = var95 * 64;
                        int var106 = var92 * 64;
                        int var107 = var93 * 64;
                        class112 var108 = new class112(var97, class52.field927, var106, var107, class156.method1179(var106, var107, 30, class52.field927) - var98, class180.field3272 + var100, class180.field3272 + var101, var102, var103, var96, var99);
                        var108.method828(var104, class156.method1179(var104, var105, 51, class52.field927) - var99, var105, (byte) -86, var100 + class180.field3272);
                        class210.field3822.method1727(-108, new class170(var108));
                    }
                } else if (class13.field190 == 88) {
                    int var109 = class199.field3595.method917(255);
                    int var110 = (var109 & 0x7) + class58.field1058;
                    int var111 = ((var109 & 0x75) >> 4) + class202.field3650;
                    int var112 = class199.field3595.method962((byte) -105);
                    if (var112 == 65535) {
                        var112 = -1;
                    }
                    int var113 = class199.field3595.method926((byte) -87);
                    int var114 = var113 >> 2;
                    int var115 = var113 & 0x3;
                    int var116 = class108.field2033[var114];
                    class130.method967((byte) 121, var110, class52.field927, var116, var111, var114, var112, var115);
                } else if (class13.field190 == 194) {
                    int var117 = class199.field3595.method962((byte) -44);
                    int var118 = class199.field3595.method937(false);
                    int var119 = class58.field1058 + (var118 & 0x7);
                    int var120 = ((var118 & 0x7C) >> 4) + class202.field3650;
                    if (var120 >= 0 && var119 >= 0 && var120 < 104 && var119 < 104) {
                        class243 var121 = class32.field437[class52.field927][var120][var119];
                        if (var121 != null) {
                            for (class41 var122 = (class41) var121.method1724(255); var122 != null; var122 = (class41) var121.method1726(124)) {
                                if ((var117 & 0x7FFF) == var122.field579.field4518) {
                                    var122.method632(-8296);
                                    break;
                                }
                            }
                            if (var121.method1724(255) == null) {
                                class32.field437[class52.field927][var120][var119] = null;
                            }
                            class263.method1808(var120, var119, 64);
                        }
                    }
                } else if (class13.field190 == 50) {
                    int var123 = class199.field3595.method962((byte) -111);
                    int var124 = class199.field3595.method930((byte) 52);
                    int var125 = class199.field3595.method926((byte) -113);
                    int var126 = (var125 & 0x7) + class58.field1058;
                    int var127 = (var125 >> 4 & 0x7) + class202.field3650;
                    int var128 = class199.field3595.method912(-85);
                    if (var127 >= 0 && var126 >= 0 && var127 < 104 && var126 < 104 && class13.field191 != var128) {
                        class247 var129 = new class247();
                        var129.field4524 = var123;
                        var129.field4518 = var124;
                        if (class32.field437[class52.field927][var127][var126] == null) {
                            class32.field437[class52.field927][var127][var126] = new class243();
                        }
                        class32.field437[class52.field927][var127][var126].method1727(-117, new class41(var129));
                        class263.method1808(var127, var126, 64);
                    }
                } else if (class13.field190 == 168) {
                    int var130 = class199.field3595.method926((byte) -106);
                    int var131 = (var130 & 0x7) + class58.field1058;
                    int var132 = ((var130 & 0x7F) >> 4) + class202.field3650;
                    int var133 = class199.field3595.method946(false);
                    int var134 = var133 >> 2;
                    int var135 = var133 & 0x3;
                    int var136 = class108.field2033[var134];
                    if (var132 >= 0 && var131 >= 0 && var132 < 104 && var131 < 104) {
                        class199.method1447(var132, var131, -1, var135, var134, (byte) 40, 0, class52.field927, var136, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B[B[BIII)I")
    public final int method847(byte arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        int var7 = arg4 + arg5;
        field2188++;
        if (arg0 <= 42) {
            return -3;
        }
        int var8 = 0;
        int var9 = arg3 << 3;
        while (arg5 < var7) {
            int var10 = arg2[arg5] & 0xFF;
            byte var11 = this.field2187[var10];
            int var12 = this.field2186[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var9 >> 3;
            int var15 = var8 & -var13 >> 31;
            int var16 = (var11 + var13 - 1 >> 3) + var14;
            int var17 = var13 + 24;
            arg1[var14] = (byte) (var8 = class230.method1644(var15, var12 >>> var17));
            if (var14 < var16) {
                var14++;
                var13 = var17 - 8;
                arg1[var14] = (byte) (var8 = var12 >>> var13);
                if (var16 > var14) {
                    var14++;
                    var13 -= 8;
                    arg1[var14] = (byte) (var8 = var12 >>> var13);
                    if (var16 > var14) {
                        var14++;
                        var13 -= 8;
                        arg1[var14] = (byte) (var8 = var12 >>> var13);
                        if (var16 > var14) {
                            var13 -= 8;
                            var14++;
                            arg1[var14] = (byte) (var8 = var12 << -var13);
                        }
                    }
                }
            }
            var9 += var11;
            arg5++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "([B)V")
    public class114(byte[] arg0) {
        int var2 = arg0.length;
        this.field2185 = new int[8];
        this.field2186 = new int[var2];
        this.field2187 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field2186[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class230.method1644(var11, var12);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field2185[var14] == 0) {
                            this.field2185[var14] = var3;
                        }
                        var14 = this.field2185[var14];
                    }
                    if (var14 >= this.field2185.length) {
                        int[] var17 = new int[this.field2185.length * 2];
                        for (int var18 = 0; var18 < this.field2185.length; var18++) {
                            var17[var18] = this.field2185[var18];
                        }
                        this.field2185 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field2185[var14] = ~var5;
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
    public static void method848(byte arg0) {
        field2182 = null;
        field2191 = null;
        if (arg0 <= 60) {
            method848((byte) 51);
        }
    }
}
