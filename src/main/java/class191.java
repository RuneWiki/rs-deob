import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class191 {

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    private int field3314;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "[[I")
    private int[][] field3321;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    private int field3318;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field3311 = 0;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[S")
    public static short[] field3310 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lmh;")
    public static class128 field3309 = class22.method156(124, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3315 = 0;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I[B)[B", line = 4)
    public final byte[] method1279(int arg0, byte[] arg1) {
        field3316++;
        if (arg0 <= 25) {
            return (byte[]) null;
        }
        if (this.field3321 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field3314 / (long) this.field3318) + 14;
            int var4 = 0;
            int var5 = 0;
            int[] var6 = new int[var3];
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var8 = arg1[var7];
                int[] var9 = this.field3321[var4];
                for (int var10 = 0; var10 < 14; var10++) {
                    var6[var5 + var10] += var9[var10] * var8;
                }
                int var11 = this.field3314 + var4;
                int var12 = var11 / this.field3318;
                var5 += var12;
                var4 = var11 - this.field3318 * var12;
            }
            arg1 = new byte[var3];
            for (int var13 = 0; var13 < var3; var13++) {
                int var14 = var6[var13] + 32768 >> 16;
                if (var14 < -128) {
                    arg1[var13] = -128;
                } else if (var14 <= 127) {
                    arg1[var13] = (byte) var14;
                } else {
                    arg1[var13] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)I", line = 75)
    public static final int method1280(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 32 % ((37 - arg0) / 54);
        field3317++;
        int var5 = class141.field2413[class29.method188(arg1, arg2)];
        if (arg3 > 0) {
            int var6 = class141.field2419.method104(-99, arg3 & 0xFFFF);
            if (var6 != 0) {
                int var7;
                if (arg2 < 0) {
                    var7 = 0;
                } else if (arg2 > 127) {
                    var7 = 16777215;
                } else {
                    var7 = arg2 * 131586;
                }
                if (var6 == 256) {
                    var5 = var7;
                } else {
                    int var8 = 256 - var6;
                    var5 = ((var5 & 0xFF00) * var8 + (var7 & 0xFF00) * var6 & 0xFF0000) + ((var5 & 0xFF00FF) * var8 + (var7 & 0xFF00FF) * var6 & 0xFF00FF00) >> 8;
                }
            }
            int var10 = class141.field2419.method102(arg3 & 0xFFFF, -24769);
            if (var10 != 0) {
                var10 += 256;
                int var11 = (var5 >> 16 & 0xFF) * var10;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var5 & 0xFF) * var10;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((var5 & 0xFF00) >> 8) * var10;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                var5 = (var11 << 8 & 0xFF0012) + (var12 >> 8) + (var13 & 0xFF00);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)I", line = 147)
    public final int method1281(int arg0, int arg1) {
        if (this.field3321 != null) {
            arg0 = (int) ((long) this.field3314 * (long) arg0 / (long) this.field3318) + 6;
        }
        field3320++;
        if (arg1 != 0) {
            method1283(-112, 2, 87, 30, 62, -69, 104);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 168)
    public static final void method1282(byte arg0) {
        field3313++;
        if (class298.field5086 == 71) {
            int var1 = class54.field1051.method1325(7627);
            int var2 = class34.field731 + (var1 >> 4 & 0x7);
            int var3 = class58.field1115 + (var1 & 0x7);
            int var4 = class54.field1051.method1308(-78);
            int var5 = class54.field1051.method1308(-125);
            int var6 = class54.field1051.method1308(-119);
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class296 var7 = class221.field3888[class133.field2315][var2][var3];
                if (var7 != null) {
                    for (class89 var8 = (class89) var7.method2024(0); var8 != null; var8 = (class89) var7.method2027(1211754408)) {
                        class203 var9 = var8.field1520;
                        if ((var4 & 0x7FFF) == var9.field3586 && var9.field3590 == var5) {
                            var9.field3590 = var6;
                            break;
                        }
                    }
                    class155.method1029(var2, var3, -1);
                }
            }
        } else if (class298.field5086 == 229) {
            int var10 = class54.field1051.method1327(-77);
            int var11 = var10 >> 2;
            int var12 = class287.field4910[var11];
            int var13 = class54.field1051.method1325(7627);
            int var14 = (var13 >> 4 & 0x7) + class34.field731;
            int var15 = var10 & 0x3;
            int var16 = class58.field1115 + (var13 & 0x7);
            int var17 = class54.field1051.method1330(true);
            if (var14 >= 0 && var16 >= 0 && var14 < 104 && var16 < 104) {
                class129.method868(0, var11, class133.field2315, var16, var15, var12, var17, -1, -128, var14);
            }
        } else if (class298.field5086 == 62) {
            int var18 = class54.field1051.method1325(7627);
            int var19 = (var18 >> 4 & 0x7) + class34.field731;
            int var20 = (var18 & 0x7) + class58.field1115;
            int var21 = class54.field1051.method1326((byte) 114) + var19;
            int var22 = class54.field1051.method1326((byte) 114) + var20;
            int var23 = class54.field1051.method1354(2);
            int var24 = class54.field1051.method1308(-80);
            int var25 = class54.field1051.method1325(7627) * 4;
            int var26 = class54.field1051.method1325(7627) * 4;
            int var27 = class54.field1051.method1308(-94);
            int var28 = class54.field1051.method1308(-21);
            int var29 = class54.field1051.method1325(7627);
            int var30 = class54.field1051.method1325(7627);
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104 && var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && var24 != 65535) {
                int var31 = var20 * 128 + 64;
                int var32 = var22 * 128 + 64;
                int var33 = var19 * 128 + 64;
                int var34 = var21 * 128 + 64;
                class74 var35 = new class74(var24, class133.field2315, var33, var31, class64.method427(var33, var31, class133.field2315, (byte) 116) - var25, class293.field5011 + var27, class293.field5011 + var28, var29, var30, var23, var26);
                var35.method484(class64.method427(var34, var32, class133.field2315, (byte) 125) - var26, var34, var32, 1, class293.field5011 + var27);
                class132.field2284.method2029((byte) -34, new class238(var35));
            }
        } else if (class298.field5086 == 121) {
            int var36 = class54.field1051.method1335(8574);
            int var37 = class54.field1051.method1330(true);
            int var38 = class54.field1051.method1327(-85);
            int var39 = class58.field1115 + (var38 & 0x7);
            int var40 = ((var38 & 0x79) >> 4) + class34.field731;
            int var41 = class54.field1051.method1330(true);
            if (var40 >= 0 && var39 >= 0 && var40 < 104 && var39 < 104 && class104.field1780 != var41) {
                class203 var42 = new class203();
                var42.field3586 = var36;
                var42.field3590 = var37;
                if (class221.field3888[class133.field2315][var40][var39] == null) {
                    class221.field3888[class133.field2315][var40][var39] = new class296();
                }
                class221.field3888[class133.field2315][var40][var39].method2029((byte) -34, new class89(var42));
                class155.method1029(var40, var39, -1);
            }
        } else if (class298.field5086 == 252) {
            int var131 = class54.field1051.method1318(-112);
            int var132 = (var131 >> 4 & 0x7) + class34.field731;
            int var133 = class58.field1115 + (var131 & 0x7);
            int var134 = class54.field1051.method1325(7627);
            int var135 = var134 >> 2;
            int var136 = var134 & 0x3;
            int var137 = class287.field4910[var135];
            if (var132 >= 0 && var133 >= 0 && var132 < 104 && var133 < 104) {
                class129.method868(0, var135, class133.field2315, var133, var136, var137, -1, -1, -128, var132);
            }
        } else if (class298.field5086 == 35) {
            int var43 = class54.field1051.method1318(-128);
            int var44 = ((var43 & 0x77) >> 4) + class34.field731;
            int var45 = class58.field1115 + (var43 & 0x7);
            int var46 = class54.field1051.method1330(true);
            if (var44 >= 0 && var45 >= 0 && var44 < 104 && var45 < 104) {
                class296 var47 = class221.field3888[class133.field2315][var44][var45];
                if (var47 != null) {
                    for (class89 var48 = (class89) var47.method2024(0); var48 != null; var48 = (class89) var47.method2027(1211754408)) {
                        if ((var46 & 0x7FFF) == var48.field1520.field3586) {
                            var48.method1978((byte) 65);
                            break;
                        }
                    }
                    if (var47.method2024(0) == null) {
                        class221.field3888[class133.field2315][var44][var45] = null;
                    }
                    class155.method1029(var44, var45, -1);
                }
            }
        } else if (class298.field5086 == 57) {
            int var49 = class54.field1051.method1325(7627);
            int var50 = (var49 & 0x7) + class58.field1115;
            int var51 = ((var49 & 0x75) >> 4) + class34.field731;
            int var52 = class54.field1051.method1308(-30);
            int var53 = class54.field1051.method1325(7627);
            if (var52 == 65535) {
                var52 = -1;
            }
            int var54 = (var53 & 0xF5) >> 4;
            int var55 = var53 & 0x7;
            int var56 = class54.field1051.method1325(7627);
            if (var51 >= 0 && var50 >= 0 && var51 < 104 && var50 < 104) {
                int var57 = var54 + 1;
                if (class163.field2796.field450[0] >= var51 - var57 && var51 + var57 >= class163.field2796.field450[0] && (var50 - var57) <= class163.field2796.field422[0] && class163.field2796.field422[0] <= var50 + var57 && class158.field2699 != 0 && var55 > 0 && class295.field5039 < 50 && var52 != -1) {
                    class147.field2537[class295.field5039] = var52;
                    class176.field3102[class295.field5039] = var55;
                    class193.field3338[class295.field5039] = var56;
                    class254.field4375[class295.field5039] = null;
                    class255.field4396[class295.field5039] = (var50 << 8) + ((var51 << 16) + var54);
                    class295.field5039++;
                }
            }
        } else if (class298.field5086 == 207) {
            int var58 = class54.field1051.method1322(-31669);
            int var59 = var58 >> 2;
            int var60 = var58 & 0x3;
            int var61 = class287.field4910[var59];
            int var62 = class54.field1051.method1327(-118);
            int var63 = class58.field1115 + (var62 & 0x7);
            int var64 = ((var62 & 0x75) >> 4) + class34.field731;
            int var65 = class54.field1051.method1308(-96);
            if (var65 == 65535) {
                var65 = -1;
            }
            class248.method1724(var65, var60, class133.field2315, (byte) -123, var59, var64, var61, var63);
        } else {
            int var66 = -32 % ((arg0 + 18) / 54);
            if (class298.field5086 == 93) {
                int var67 = class54.field1051.method1322(-31669);
                int var68 = var67 & 0x3;
                int var69 = var67 >> 2;
                int var70 = class287.field4910[var69];
                byte var71 = class54.field1051.method1329(0);
                byte var72 = class54.field1051.method1326((byte) 112);
                int var73 = class54.field1051.method1330(true);
                int var74 = class54.field1051.method1330(true);
                int var75 = class54.field1051.method1335(8574);
                byte var76 = class54.field1051.method1304(-506079856);
                int var77 = class54.field1051.method1325(7627);
                int var78 = ((var77 & 0x79) >> 4) + class34.field731;
                int var79 = class58.field1115 + (var77 & 0x7);
                byte var80 = class54.field1051.method1329(0);
                int var81 = class54.field1051.method1308(-76);
                class123 var82;
                if (class104.field1780 == var73) {
                    var82 = class163.field2796;
                } else {
                    var82 = class140.field2405[var73];
                }
                if (!class247.field4247 && var82 != null) {
                    class38 var83 = class239.method1629((byte) -89, var74);
                    int var84;
                    int var85;
                    if (var68 == 1 || var68 == 3) {
                        var84 = var83.field778;
                        var85 = var83.field758;
                    } else {
                        var84 = var83.field758;
                        var85 = var83.field778;
                    }
                    int var86 = var78 + (var84 + 1 >> 1);
                    int var87 = (var85 >> 1) + var79;
                    int var88 = var78 + (var84 >> 1);
                    int[][] var89 = class250.field4334[class133.field2315];
                    int var90 = var79 + (var85 + 1 >> 1);
                    int[][] var91 = (int[][]) null;
                    if (class133.field2315 < 3) {
                        var91 = class250.field4334[class133.field2315 + 1];
                    }
                    int var92 = var89[var88][var87] - (-var89[var86][var90] - var89[var88][var90] - var89[var86][var87]) >> 2;
                    int var93 = (var78 << 7) + (var84 << 6);
                    int var94 = (var79 << 7) + (var85 << 6);
                    class285 var95 = var83.method262(var92, var68, (class127) null, var89, false, var69, var94, 125, var91, var93, var83.field806);
                    if (var95 != null) {
                        if (var80 > var71) {
                            byte var96 = var80;
                            var80 = var71;
                            var71 = var96;
                        }
                        if (var76 > var72) {
                            byte var97 = var76;
                            var76 = var72;
                            var72 = var97;
                        }
                        class129.method868(var75 + 1, 0, class133.field2315, var79, 0, var70, -1, var81 + 1, -128, var78);
                        var82.field2083 = var79 * 128 + var85 * 64;
                        var82.field2088 = class293.field5011 + var75;
                        var82.field2096 = var78 + var71;
                        var82.field2064 = var92;
                        var82.field2089 = var78 + var80;
                        var82.field2092 = var78 * 128 + var84 * 64;
                        var82.field2059 = var79 + var76;
                        var82.field2094 = class293.field5011 + var81;
                        var82.field2056 = (class60) var95.field4893;
                        var82.field2080 = var72 + var79;
                    }
                }
            }
            if (class298.field5086 == 237) {
                int var125 = class54.field1051.method1335(8574);
                int var126 = class54.field1051.method1331(28057);
                int var127 = class54.field1051.method1325(7627);
                int var128 = class34.field731 + (var127 >> 4 & 0x7);
                int var129 = class58.field1115 + (var127 & 0x7);
                if (var128 >= 0 && var129 >= 0 && var128 < 104 && var129 < 104) {
                    class203 var130 = new class203();
                    var130.field3590 = var125;
                    var130.field3586 = var126;
                    if (class221.field3888[class133.field2315][var128][var129] == null) {
                        class221.field3888[class133.field2315][var128][var129] = new class296();
                    }
                    class221.field3888[class133.field2315][var128][var129].method2029((byte) -34, new class89(var130));
                    class155.method1029(var128, var129, -1);
                }
            } else if (class298.field5086 == 209) {
                int var98 = class54.field1051.method1325(7627);
                int var99 = (var98 >> 4 & 0xF) + class34.field731 * 2;
                int var100 = (var98 & 0xF) + class58.field1115 * 2;
                int var101 = var99 + class54.field1051.method1326((byte) 103);
                int var102 = class54.field1051.method1326((byte) 104) + var100;
                int var103 = class54.field1051.method1354(2);
                int var104 = class54.field1051.method1308(-107);
                int var105 = class54.field1051.method1325(7627) * 4;
                int var106 = class54.field1051.method1325(7627) * 4;
                int var107 = class54.field1051.method1308(-100);
                int var108 = class54.field1051.method1308(-88);
                int var109 = class54.field1051.method1325(7627);
                int var110 = class54.field1051.method1325(7627);
                if (var99 >= 0 && var100 >= 0 && var99 < 208 && var100 < 208 && var101 >= 0 && var102 >= 0 && var101 < 208 && var102 < 208 && var104 != 65535) {
                    int var111 = var102 * 64;
                    int var112 = var101 * 64;
                    int var113 = var99 * 64;
                    int var114 = var100 * 64;
                    class74 var115 = new class74(var104, class133.field2315, var113, var114, class64.method427(var113, var114, class133.field2315, (byte) 103) - var105, class293.field5011 + var107, class293.field5011 + var108, var109, var110, var103, var106);
                    var115.method484(class64.method427(var112, var111, class133.field2315, (byte) 126) - var106, var112, var111, 1, class293.field5011 + var107);
                    class132.field2284.method2029((byte) -34, new class238(var115));
                }
            } else if (class298.field5086 == 254) {
                int var116 = class54.field1051.method1325(7627);
                int var117 = (var116 & 0x7) + class58.field1115;
                int var118 = class34.field731 + (var116 >> 4 & 0x7);
                int var119 = class54.field1051.method1308(-109);
                int var120 = class54.field1051.method1325(7627);
                int var121 = class54.field1051.method1308(-103);
                if (var118 >= 0 && var117 >= 0 && var118 < 104 && var117 < 104) {
                    int var122 = var118 * 128 + 64;
                    int var123 = var117 * 128 + 64;
                    class98 var124 = new class98(var119, class133.field2315, var122, var123, class64.method427(var122, var123, class133.field2315, (byte) 104) - var120, var121, class293.field5011);
                    class156.field2679.method2029((byte) -34, new class37(var124));
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIIII)V", line = 709)
    public static final void method1283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 128) {
            method1283(-86, 55, 3, 88, 87, -33, 5);
        }
        field3319++;
        if (arg2 - arg3 >= class193.field3335 && (arg2 + arg3) <= class43.field875 && (arg6 - arg3) >= class70.field1315 && arg6 + arg3 <= class181.field3173) {
            class303.method2062(arg4, arg2, arg6, arg1, (byte) -114, arg3, arg5);
        } else {
            class183.method1243(arg5, arg3, arg2, arg6, 0, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 728)
    public static void method1284(int arg0) {
        field3310 = null;
        field3309 = null;
        if (arg0 != -16711936) {
            field3311 = -80;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)I", line = 752)
    public final int method1285(int arg0, int arg1) {
        if (this.field3321 != null) {
            arg1 = (int) ((long) this.field3314 * (long) arg1 / (long) this.field3318);
        }
        if (arg0 != 18430) {
            field3309 = (class128) null;
        }
        field3312++;
        return arg1;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(II)V", line = 768)
    public class191(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class311.method2113(82, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field3314 = var4;
            this.field3321 = new int[var5][14];
            this.field3318 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3321[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (-1.0E-4D > var14 || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
