import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class222 {

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[I")
    public static int[] field3655 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lph;")
    public static class229 field3652 = class266.method1858(")2", 0);

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "[I")
    public static int[] field3659 = new int[2];

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lph;")
    private static class229 field3651 = class266.method1858("flash2:", 0);

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Lph;")
    public static class229 field3660 = field3651;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field3661 = 0;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "Lph;")
    public static class229 field3662 = field3651;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Lsi;")
    public static class66 field3656;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Z")
    public static boolean field3657;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 64)
    public static final void method1550(int arg0) {
        field3654++;
        if (class296.field4837 == 115) {
            int var1 = class88.field1497.method1178(8);
            int var2 = (var1 & 0x7) + class38.field607;
            int var3 = class152.field2465 + ((var1 & 0x70) >> 4);
            int var4 = class88.field1497.method1161(true);
            int var5 = class88.field1497.method1178(8);
            int var6 = var5 & 0x7;
            int var7 = var5 >> 4 & 0xF;
            if (var4 == 65535) {
                var4 = -1;
            }
            int var8 = class88.field1497.method1178(arg0 - 29974);
            if (var3 >= 0 && var2 >= 0 && var3 < 104 && var2 < 104) {
                int var9 = var7 + 1;
                if (var3 - var9 <= class230.field3820.field5104[0] && (var3 + var9) >= class230.field3820.field5104[0] && (var2 - var9) <= class230.field3820.field5159[0] && (var2 + var9) >= class230.field3820.field5159[0] && class184.field2996 != 0 && var6 > 0 && class189.field3063 < 50 && var4 != -1) {
                    class262.field4376[class189.field3063] = var4;
                    class219.field3597[class189.field3063] = var6;
                    class153.field2484[class189.field3063] = var8;
                    class275.field4597[class189.field3063] = null;
                    class165.field2700[class189.field3063] = (var2 << 8) + (var3 << 16) + var7;
                    class189.field3063++;
                }
            }
        } else if (class296.field4837 == 22) {
            int var10 = class88.field1497.method1178(8);
            int var11 = var10 & 0x3;
            int var12 = var10 >> 2;
            int var13 = field3655[var12];
            int var14 = class88.field1497.method1199(false);
            int var15 = class152.field2465 + (var14 >> 4 & 0x7);
            int var16 = (var14 & 0x7) + class38.field607;
            int var17 = class88.field1497.method1162(2);
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                class323.method2219(class298.field4849, var17, var13, var12, 0, (byte) -33, var16, -1, var15, var11);
            }
        } else if (class296.field4837 == 31) {
            int var18 = class88.field1497.method1178(8);
            int var19 = class152.field2465 + ((var18 & 0x7C) >> 4);
            int var20 = (var18 & 0x7) + class38.field607;
            int var21 = class88.field1497.method1163(864348104) + var19;
            int var22 = class88.field1497.method1163(864348104) + var20;
            int var23 = class88.field1497.method1179((byte) -74);
            int var24 = class88.field1497.method1161(true);
            int var25 = class88.field1497.method1178(8) * 4;
            int var26 = class88.field1497.method1178(8) * 4;
            int var27 = class88.field1497.method1161(true);
            int var28 = class88.field1497.method1161(true);
            int var29 = class88.field1497.method1178(arg0 - 29974);
            int var30 = class88.field1497.method1178(8);
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104 && var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && var24 != 65535) {
                int var31 = var22 * 128 + 64;
                int var32 = var19 * 128 + 64;
                int var33 = var21 * 128 + 64;
                int var34 = var20 * 128 + 64;
                class251 var35 = new class251(var24, class298.field4849, var32, var34, class259.method1801(var34, -20428, class298.field4849, var32) - var25, class319.field5393 + var27, class319.field5393 + var28, var29, var30, var23, var26);
                var35.method1761((byte) -122, class319.field5393 + var27, -var26 + class259.method1801(var31, -20428, class298.field4849, var33), var33, var31);
                class226.field3712.method1582(new class201(var35), arg0 - 29978);
            }
        } else if (class296.field4837 == 73) {
            int var128 = class88.field1497.method1178(8);
            int var129 = (var128 >> 4 & 0x7) + class152.field2465;
            int var130 = (var128 & 0x7) + class38.field607;
            int var131 = class88.field1497.method1161(true);
            int var132 = class88.field1497.method1161(true);
            int var133 = class88.field1497.method1161(true);
            if (var129 >= 0 && var130 >= 0 && var129 < 104 && var130 < 104) {
                class227 var134 = class8.field108[class298.field4849][var129][var130];
                if (var134 != null) {
                    for (class37 var135 = (class37) var134.method1580((byte) -39); var135 != null; var135 = (class37) var134.method1579((byte) 28)) {
                        class154 var136 = var135.field605;
                        if ((var131 & 0x7FFF) == var136.field2505 && var136.field2511 == var132) {
                            var136.field2511 = var133;
                            break;
                        }
                    }
                    class69.method543(128, var130, var129);
                }
            }
        } else {
            if (class296.field4837 == 9) {
                int var36 = class88.field1497.method1178(8);
                int var37 = var36 >> 2;
                int var38 = var36 & 0x3;
                int var39 = field3655[var37];
                int var40 = class88.field1497.method1161(true);
                int var41 = class88.field1497.method1162(2);
                byte var42 = class88.field1497.method1163(864348104);
                int var43 = class88.field1497.method1187((byte) -99);
                byte var44 = class88.field1497.method1196((byte) 109);
                byte var45 = class88.field1497.method1163(arg0 + 864318122);
                byte var46 = class88.field1497.method1163(864348104);
                int var47 = class88.field1497.method1183(2);
                int var48 = class88.field1497.method1193((byte) 85);
                int var49 = class38.field607 + (var48 & 0x7);
                int var50 = (var48 >> 4 & 0x7) + class152.field2465;
                class209 var51;
                if (class145.field2354 == var40) {
                    var51 = class230.field3820;
                } else {
                    var51 = class114.field1931[var40];
                }
                if (!class99.field1675 && var51 != null) {
                    class83 var52 = class260.method1807(false, var43);
                    int var53;
                    int var54;
                    if (var38 == 1 || var38 == 3) {
                        var54 = var52.field1434;
                        var53 = var52.field1424;
                    } else {
                        var53 = var52.field1434;
                        var54 = var52.field1424;
                    }
                    int var55 = (var53 >> 1) + var50;
                    int var56 = (var53 + 1 >> 1) + var50;
                    int var57 = var49 + (var54 >> 1);
                    int[][] var58 = class192.field3174[class298.field4849];
                    int[][] var59 = (int[][]) null;
                    if (class298.field4849 < 3) {
                        var59 = class192.field3174[class298.field4849 + 1];
                    }
                    int var60 = (var54 + 1 >> 1) + var49;
                    int var61 = (var50 << 7) + (var53 << 6);
                    int var62 = var58[var55][var57] + var58[var55][var60] + var58[var56][var57] + var58[var56][var60] >> 2;
                    int var63 = (var49 << 7) + (var54 << 6);
                    class58 var64 = var52.method618((byte) -128, var61, var59, var52.field1388, var58, var62, var37, var38, false, var63, (class32) null);
                    if (var64 != null) {
                        class323.method2219(class298.field4849, -1, var39, 0, var47 + 1, (byte) -33, var49, var41 + 1, var50, 0);
                        var51.field3450 = var50 * 128 + var53 * 64;
                        var51.field3440 = var41 + class319.field5393;
                        var51.field3461 = var47 + class319.field5393;
                        var51.field3474 = var62;
                        var51.field3449 = (class286) var64.field826;
                        if (var42 > var46) {
                            byte var65 = var42;
                            var42 = var46;
                            var46 = var65;
                        }
                        var51.field3445 = var49 * 128 + var54 * 64;
                        var51.field3451 = var50 + var42;
                        var51.field3437 = var46 + var50;
                        if (var44 < var45) {
                            byte var66 = var45;
                            var45 = var44;
                            var44 = var66;
                        }
                        var51.field3467 = var45 + var49;
                        var51.field3477 = var49 + var44;
                    }
                }
            }
            if (arg0 != 29982) {
                field3661 = -77;
            }
            if (class296.field4837 == 110) {
                int var122 = class88.field1497.method1199(false);
                int var123 = ((var122 & 0x73) >> 4) + class152.field2465;
                int var124 = (var122 & 0x7) + class38.field607;
                int var125 = class88.field1497.method1161(true);
                if (var123 >= 0 && var124 >= 0 && var123 < 104 && var124 < 104) {
                    class227 var126 = class8.field108[class298.field4849][var123][var124];
                    if (var126 != null) {
                        for (class37 var127 = (class37) var126.method1580((byte) -39); var127 != null; var127 = (class37) var126.method1579((byte) 28)) {
                            if ((var125 & 0x7FFF) == var127.field605.field2505) {
                                var127.method598(arg0 - 29920);
                                break;
                            }
                        }
                        if (var126.method1580((byte) -39) == null) {
                            class8.field108[class298.field4849][var123][var124] = null;
                        }
                        class69.method543(128, var124, var123);
                    }
                }
            } else if (class296.field4837 == 60) {
                int var104 = class88.field1497.method1178(arg0 - 29974);
                int var105 = (var104 & 0xF) + class38.field607 * 2;
                int var106 = (var104 >> 4 & 0xF) + class152.field2465 * 2;
                int var107 = class88.field1497.method1163(864348104) + var106;
                int var108 = var105 + class88.field1497.method1163(arg0 ^ 0x338492D6);
                int var109 = class88.field1497.method1179((byte) -74);
                int var110 = class88.field1497.method1161(true);
                int var111 = class88.field1497.method1178(8) * 4;
                int var112 = class88.field1497.method1178(8) * 4;
                int var113 = class88.field1497.method1161(true);
                int var114 = class88.field1497.method1161(true);
                int var115 = class88.field1497.method1178(8);
                int var116 = class88.field1497.method1178(8);
                if (var106 >= 0 && var105 >= 0 && var106 < 208 && var105 < 208 && var107 >= 0 && var108 >= 0 && var107 < 208 && var108 < 208 && var110 != 65535) {
                    int var117 = var108 * 64;
                    int var118 = var107 * 64;
                    int var119 = var105 * 64;
                    int var120 = var106 * 64;
                    class251 var121 = new class251(var110, class298.field4849, var120, var119, class259.method1801(var119, -20428, class298.field4849, var120) - var111, var113 - -class319.field5393, var114 + class319.field5393, var115, var116, var109, var112);
                    var121.method1761((byte) -119, var113 + class319.field5393, class259.method1801(var117, -20428, class298.field4849, var118) - var112, var118, var117);
                    class226.field3712.method1582(new class201(var121), 4);
                }
            } else if (class296.field4837 == 189) {
                int var67 = class88.field1497.method1199(false);
                int var68 = (var67 >> 4 & 0x7) + class152.field2465;
                int var69 = (var67 & 0x7) + class38.field607;
                int var70 = class88.field1497.method1161(true);
                int var71 = class88.field1497.method1187((byte) -99);
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                    class154 var72 = new class154();
                    var72.field2511 = var70;
                    var72.field2505 = var71;
                    if (class8.field108[class298.field4849][var68][var69] == null) {
                        class8.field108[class298.field4849][var68][var69] = new class227();
                    }
                    class8.field108[class298.field4849][var68][var69].method1582(new class37(var72), 4);
                    class69.method543(arg0 - 29854, var69, var68);
                }
            } else if (class296.field4837 == 156) {
                int var73 = class88.field1497.method1187((byte) -99);
                int var74 = class88.field1497.method1178(8);
                int var75 = ((var74 & 0x73) >> 4) + class152.field2465;
                int var76 = class38.field607 + (var74 & 0x7);
                int var77 = class88.field1497.method1187((byte) -99);
                int var78 = class88.field1497.method1183(2);
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && class145.field2354 != var78) {
                    class154 var79 = new class154();
                    var79.field2505 = var73;
                    var79.field2511 = var77;
                    if (class8.field108[class298.field4849][var75][var76] == null) {
                        class8.field108[class298.field4849][var75][var76] = new class227();
                    }
                    class8.field108[class298.field4849][var75][var76].method1582(new class37(var79), arg0 - 29978);
                    class69.method543(arg0 ^ 0x759E, var76, var75);
                }
            } else if (class296.field4837 == 215) {
                int var97 = class88.field1497.method1198(false);
                int var98 = var97 >> 2;
                int var99 = var97 & 0x3;
                int var100 = field3655[var98];
                int var101 = class88.field1497.method1198(false);
                int var102 = class152.field2465 + (var101 >> 4 & 0x7);
                int var103 = (var101 & 0x7) + class38.field607;
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    class323.method2219(class298.field4849, -1, var100, var98, 0, (byte) -33, var103, -1, var102, var99);
                }
            } else if (class296.field4837 == 192) {
                int var80 = class88.field1497.method1183(2);
                if (var80 == 65535) {
                    var80 = -1;
                }
                int var81 = class88.field1497.method1198(false);
                int var82 = var81 >> 2;
                int var83 = var81 & 0x3;
                int var84 = field3655[var82];
                int var85 = class88.field1497.method1178(8);
                int var86 = (var85 & 0x7) + class38.field607;
                int var87 = (var85 >> 4 & 0x7) + class152.field2465;
                class204.method1429((byte) 24, var83, var87, var84, var86, class298.field4849, var82, var80);
            } else if (class296.field4837 == 34) {
                int var88 = class88.field1497.method1178(8);
                int var89 = class38.field607 + (var88 & 0x7);
                int var90 = class152.field2465 + (var88 >> 4 & 0x7);
                int var91 = class88.field1497.method1161(true);
                int var92 = class88.field1497.method1178(arg0 ^ 0x7516);
                int var93 = class88.field1497.method1161(true);
                if (var90 >= 0 && var89 >= 0 && var90 < 104 && var89 < 104) {
                    int var94 = var90 * 128 + 64;
                    int var95 = var89 * 128 + 64;
                    class256 var96 = new class256(var91, class298.field4849, var94, var95, class259.method1801(var95, arg0 ^ 0xFFFFC52A, class298.field4849, var94) - var92, var93, class319.field5393);
                    class186.field3023.method1582(new class123(var96), 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V", line = 647)
    public static final void method1551() {
        class207.field3412 = 0;
        label194: for (int var0 = 0; var0 < class103.field1755; var0++) {
            class149 var1 = class75.field1268[var0];
            if (class178.field2939 != null) {
                for (int var2 = 0; var2 < class178.field2939.length; var2++) {
                    if (class178.field2939[var2] != -1000000 && (var1.field2409 <= class178.field2939[var2] || var1.field2419 <= class178.field2939[var2]) && (var1.field2410 <= class251.field4209[var2] || var1.field2405 <= class251.field4209[var2]) && (var1.field2410 >= class66.field1044[var2] || var1.field2405 >= class66.field1044[var2]) && (var1.field2403 <= class217.field3564[var2] || var1.field2413 <= class217.field3564[var2]) && (var1.field2403 >= class250.field4158[var2] || var1.field2413 >= class250.field4158[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field2422 == 1) {
                int var3 = var1.field2401 + class202.field3339 - class254.field4249;
                if (var3 >= 0 && var3 <= class202.field3339 + class202.field3339) {
                    int var4 = var1.field2420 + class202.field3339 - class102.field1745;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2411 + class202.field3339 - class102.field1745;
                    if (var5 > class202.field3339 + class202.field3339) {
                        var5 = class202.field3339 + class202.field3339;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class119.field2000[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class244.field4035 - var1.field2410;
                        if (var7 > 32) {
                            var1.field2416 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2416 = 2;
                            var7 = -var7;
                        }
                        var1.field2423 = (var1.field2403 - class255.field4266 << 8) / var7;
                        var1.field2412 = (var1.field2413 - class255.field4266 << 8) / var7;
                        var1.field2407 = (var1.field2409 - class129.field2111 << 8) / var7;
                        var1.field2408 = (var1.field2419 - class129.field2111 << 8) / var7;
                        class68.field1084[class207.field3412++] = var1;
                    }
                }
            } else if (var1.field2422 == 2) {
                int var8 = var1.field2420 + class202.field3339 - class102.field1745;
                if (var8 >= 0 && var8 <= class202.field3339 + class202.field3339) {
                    int var9 = var1.field2401 + class202.field3339 - class254.field4249;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2402 + class202.field3339 - class254.field4249;
                    if (var10 > class202.field3339 + class202.field3339) {
                        var10 = class202.field3339 + class202.field3339;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class119.field2000[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class255.field4266 - var1.field2403;
                        if (var12 > 32) {
                            var1.field2416 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2416 = 4;
                            var12 = -var12;
                        }
                        var1.field2421 = (var1.field2410 - class244.field4035 << 8) / var12;
                        var1.field2404 = (var1.field2405 - class244.field4035 << 8) / var12;
                        var1.field2407 = (var1.field2409 - class129.field2111 << 8) / var12;
                        var1.field2408 = (var1.field2419 - class129.field2111 << 8) / var12;
                        class68.field1084[class207.field3412++] = var1;
                    }
                }
            } else if (var1.field2422 == 4) {
                int var13 = var1.field2409 - class129.field2111;
                if (var13 > 128) {
                    int var14 = var1.field2420 + class202.field3339 - class102.field1745;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2411 + class202.field3339 - class102.field1745;
                    if (var15 > class202.field3339 + class202.field3339) {
                        var15 = class202.field3339 + class202.field3339;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2401 + class202.field3339 - class254.field4249;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2402 + class202.field3339 - class254.field4249;
                        if (var17 > class202.field3339 + class202.field3339) {
                            var17 = class202.field3339 + class202.field3339;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class119.field2000[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2416 = 5;
                            var1.field2421 = (var1.field2410 - class244.field4035 << 8) / var13;
                            var1.field2404 = (var1.field2405 - class244.field4035 << 8) / var13;
                            var1.field2423 = (var1.field2403 - class255.field4266 << 8) / var13;
                            var1.field2412 = (var1.field2413 - class255.field4266 << 8) / var13;
                            class68.field1084[class207.field3412++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[Lph;)[Lph;", line = 916)
    public static final class229[] method1552(byte arg0, class229[] arg1) {
        class229[] var2 = new class229[5];
        field3658++;
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class248.method1746(arg0 + 8544, new class229[] { class50.method354(class101.method775(arg0, -16), var3), class69.field1109 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class248.method1746(8528, new class229[] { var2[var3], arg1[var3] });
            }
        }
        if (arg0 == -16) {
            return var2;
        } else {
            return (class229[]) null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V", line = 941)
    public static void method1553(boolean arg0) {
        field3660 = null;
        field3651 = null;
        field3652 = null;
        field3655 = null;
        field3656 = null;
        field3659 = null;
        if (arg0) {
            method1554(-90, (byte) -112);
        }
        field3662 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)V", line = 959)
    public static final void method1554(int arg0, byte arg1) {
        field3663++;
        class166.field2713.method1418((byte) -17, arg0);
        if (arg1 <= -9) {
            class142.field2298.method1418((byte) -17, arg0);
            class107.field1806.method1418((byte) -17, arg0);
            class168.field2756.method1418((byte) -17, arg0);
        }
    }
}
