import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class203 extends class305 {

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "Ljava/lang/String;")
    public static String field3306 = "Discard";

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public int field3302;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public int field3305;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public int field3310;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public int field3311;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "Ljava/lang/String;")
    public String field3307;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "[I")
    public int[] field3300;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "[I")
    public static int[] field3303;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "[I")
    public int[] field3304;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "[Lsl;")
    public class39[] field3299;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "[Ljava/lang/String;")
    public String[] field3309;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([Lkl;IIIIIZIII)V", line = 22)
    public static final void method1360(class68[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        if (class249.field3893) {
            class115.method757(arg3, arg2, arg9, arg4);
        } else {
            class270.method1806(arg3, arg2, arg9, arg4);
            class284.method1909();
        }
        field3301++;
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class68 var11 = arg0[var10];
            if (var11 != null && (var11.field1308 == arg5 || arg5 == -1412584499 && class289.field4445 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class263.field4086[class147.field2401] = var11.field1324 + arg1;
                    class215.field3444[class147.field2401] = var11.field1340 + arg8;
                    class77.field1541[class147.field2401] = var11.field1416;
                    class186.field3029[class147.field2401] = var11.field1414;
                    var12 = class147.field2401++;
                } else {
                    var12 = arg7;
                }
                var11.field1344 = class25.field494;
                var11.field1385 = var12;
                if (!var11.field1429 || !client.method355(var11)) {
                    if (var11.field1438 > 0) {
                        class321.method2235((byte) 117, var11);
                    }
                    int var13 = var11.field1324 + arg1;
                    int var14 = var11.field1340 + arg8;
                    int var15 = var11.field1455;
                    if (class29.field551 && (client.method359(var11).field4125 != 0 || var11.field1358 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class289.field4445 == var11) {
                        if (arg5 != -1412584499 && !var11.field1396) {
                            class15.field274 = arg8;
                            class327.field5004 = arg1;
                            class194.field3130 = arg0;
                            continue;
                        }
                        if (class136.field2289 && class313.field4754) {
                            int var16 = class120.field2083;
                            int var17 = var16 - class21.field451;
                            int var18 = class9.field196;
                            int var19 = var18 - class159.field2603;
                            if (var17 < class302.field4579) {
                                var17 = class302.field4579;
                            }
                            if (class342.field5316 > var19) {
                                var19 = class342.field5316;
                            }
                            if (class302.field4579 + class1.field26.field1416 < var11.field1416 + var17) {
                                var17 = class302.field4579 + class1.field26.field1416 - var11.field1416;
                            }
                            var13 = var17;
                            if ((var11.field1414 + var19) > (class342.field5316 + class1.field26.field1414)) {
                                var19 = class342.field5316 + class1.field26.field1414 - var11.field1414;
                            }
                            var14 = var19;
                        }
                        if (!var11.field1396) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field1358 == 2) {
                        var22 = arg2;
                        var24 = arg9;
                        var25 = arg4;
                        var20 = arg3;
                    } else {
                        var20 = var13 <= arg3 ? arg3 : var13;
                        int var21 = var13 + var11.field1416;
                        var22 = var14 > arg2 ? var14 : arg2;
                        int var23 = var11.field1414 + var14;
                        if (var11.field1358 == 9) {
                            var21++;
                            var23++;
                        }
                        var24 = arg9 > var21 ? var21 : arg9;
                        var25 = arg4 > var23 ? var23 : arg4;
                    }
                    if (!var11.field1429 || var24 > var20 && var22 < var25) {
                        if (var11.field1438 != 0) {
                            if (var11.field1438 == 1337 || var11.field1438 == 1403) {
                                client.field908 = var11;
                                class23.field470 = var13;
                                class285.field4413 = var14;
                                class279.method1875(var13, var11.field1414, 2, var11.field1416, var11.field1438 == 1403, var14);
                                class337.field5220[var12] = true;
                                if (class249.field3893) {
                                    class115.method757(arg3, arg2, arg9, arg4);
                                } else {
                                    class270.method1806(arg3, arg2, arg9, arg4);
                                }
                                continue;
                            }
                            if (var11.field1438 == 1338) {
                                if (!var11.method529((byte) -92)) {
                                    continue;
                                }
                                class146.method949(var11, var13, 32, var12, var14);
                                if (class249.field3893) {
                                    class115.method757(arg3, arg2, arg9, arg4);
                                } else {
                                    class270.method1806(arg3, arg2, arg9, arg4);
                                }
                                if (class313.field4757 != 0 && class313.field4757 != 3 || class290.field4459 || var20 > class189.field3058 || var22 > class75.field1529 || var24 <= class189.field3058 || var25 <= class75.field1529) {
                                    continue;
                                }
                                int var26 = class189.field3058 - var13;
                                int var27 = class75.field1529 - var14;
                                int var28 = var11.field1403[var27];
                                if (var28 > var26 || var11.field1317[var27] + var28 < var26) {
                                    continue;
                                }
                                int var29 = var27 - var11.field1414 / 2;
                                int var30 = var26 - var11.field1416 / 2;
                                int var31 = (int) class95.field1709 + class41.field798 & 0x7FF;
                                int var32 = class284.field4398[var31];
                                int var33 = class284.field4395[var31];
                                int var34 = (class4.field101 + 256) * var32 >> 8;
                                int var35 = (class4.field101 + 256) * var33 >> 8;
                                int var36 = var29 * var34 - (var30 * var35) >> 11;
                                int var37 = var29 * var35 + var30 * var34 >> 11;
                                int var38 = class66.field1265.field1869 + var37 - (class66.field1265.method710(-1) * 64 + -64) >> 7;
                                int var39 = class66.field1265.field1872 + 64 - var36 - class66.field1265.method710(-1) * 64 >> 7;
                                if (class86.field1617 && (class81.field1581 & 0x40) != 0) {
                                    class68 var40 = class233.method1548((byte) 121, class333.field5113, class6.field135);
                                    if (var40 == null) {
                                        class174.method1098(-1);
                                    } else {
                                        class6.method62(var39, (short) 58, class183.field2934, 1L, -1, class281.field4323, var38, " ->");
                                    }
                                    continue;
                                }
                                if (class324.field4954 == 1) {
                                    class6.method62(var39, (short) 43, -1, 1L, -1, class171.field2763, var38, "");
                                }
                                class6.method62(var39, (short) 48, -1, 1L, -1, class319.field4878, var38, "");
                                continue;
                            }
                            if (var11.field1438 == 1339) {
                                if (var11.method529((byte) -92)) {
                                    class122.method794(var11, var12, var13, var14, 0);
                                    if (class249.field3893) {
                                        class115.method757(arg3, arg2, arg9, arg4);
                                    } else {
                                        class270.method1806(arg3, arg2, arg9, arg4);
                                    }
                                }
                                continue;
                            }
                            if (var11.field1438 == 1400) {
                                class247.method1639(var11.field1416, var14, var11.field1414, var13, 9591);
                                class337.field5220[var12] = true;
                                class220.field3490[var12] = true;
                                if (class249.field3893) {
                                    class115.method757(arg3, arg2, arg9, arg4);
                                } else {
                                    class270.method1806(arg3, arg2, arg9, arg4);
                                }
                                continue;
                            }
                            if (var11.field1438 == 1401) {
                                class25.method210(var14, !arg6, var13, var11.field1416, var11.field1414);
                                class337.field5220[var12] = true;
                                class220.field3490[var12] = true;
                                if (class249.field3893) {
                                    class115.method757(arg3, arg2, arg9, arg4);
                                } else {
                                    class270.method1806(arg3, arg2, arg9, arg4);
                                }
                                continue;
                            }
                            if (var11.field1438 == 1402) {
                                if (!class249.field3893) {
                                    class302.method2007(0, var13, var14);
                                    class337.field5220[var12] = true;
                                    class220.field3490[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field1438 == 1405) {
                                if (!class95.field1705) {
                                    continue;
                                }
                                int var41 = var11.field1416 + var13;
                                int var42 = var14 + 15;
                                int var43 = 16776960;
                                class33.field674.method2116("Fps:" + class188.field3043, var41, var42, 16776960, -1);
                                int var142 = var42 + 15;
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                if (var45 > 65536) {
                                    var43 = 16711680;
                                }
                                class33.field674.method2116("Mem:" + var45 + "k", var41, var142, var43, -1);
                                var42 = var142 + 15;
                                if (class249.field3893) {
                                    int var46 = 16776960;
                                    int var47 = (class258.field4011 + class258.field4010 + class258.field4014) / 1024;
                                    if (var47 > 65536) {
                                        var46 = 16711680;
                                    }
                                    class33.field674.method2116("Card:" + var47 + "k", var41, var42, var46, -1);
                                    var42 += 15;
                                }
                                int var48 = 16776960;
                                int var49 = 0;
                                int var50 = 0;
                                int var51 = 0;
                                for (int var52 = 0; var52 < 29; var52++) {
                                    var49 += class61.field1172[var52].method1068(false);
                                    var51 += class61.field1172[var52].method1073(16178);
                                    var50 += class61.field1172[var52].method1080(1);
                                }
                                int var53 = var50 * 100 / var49;
                                int var54 = var51 * 10000 / var49;
                                String var55 = "Cache:" + class240.method1591(0, true, 2, -126, (long) var54) + "% (" + var53 + "%)";
                                class71.field1494.method2116(var55, var41, var42, var48, -1);
                                class337.field5220[var12] = true;
                                var42 += 12;
                                class220.field3490[var12] = true;
                                continue;
                            }
                            if (var11.field1438 == 1406) {
                                class34.field693 = var13;
                                class334.field5119 = var14;
                                class197.field3168 = var11;
                                continue;
                            }
                        }
                        if (!class290.field4459) {
                            if (var11.field1358 == 0 && var11.field1456 && class189.field3058 >= var20 && class75.field1529 >= var22 && var24 > class189.field3058 && var25 > class75.field1529 && !class29.field551) {
                                class48.field999 = 1;
                                class169.field2715[0] = class268.field4140;
                                class256.field3998[0] = class103.field1780;
                                class296.field4515[0] = "";
                                class120.field2088[0] = 1003;
                            }
                            if (class189.field3058 >= var20 && var22 <= class75.field1529 && var24 > class189.field3058 && var25 > class75.field1529) {
                                class196.method1257(class75.field1529 - var14, -var13 + class189.field3058, var11, (byte) 22);
                            }
                        }
                        if (var11.field1358 == 0) {
                            if (!var11.field1429 && client.method355(var11) && class61.field1174 != var11) {
                                continue;
                            }
                            if (!var11.field1429) {
                                if (var11.field1401 - var11.field1414 < var11.field1419) {
                                    var11.field1419 = var11.field1401 - var11.field1414;
                                }
                                if (var11.field1419 < 0) {
                                    var11.field1419 = 0;
                                }
                            }
                            if (class249.field3893 && var11.field1438 == 1407) {
                                class195.method1244(var13, var14, var11.field1416, var11.field1414);
                            }
                            method1360(arg0, var13 - var11.field1288, var22, var20, var25, var11.field1284, false, var12, var14 - var11.field1419, var24);
                            if (var11.field1372 != null) {
                                method1360(var11.field1372, var13 - var11.field1288, var22, var20, var25, var11.field1284, arg6, var12, var14 - var11.field1419, var24);
                            }
                            class222 var56 = (class222) class185.field3013.method303((long) var11.field1284, (byte) 108);
                            if (var56 != null) {
                                if (var56.field3511 == 0 && !class290.field4459 && class189.field3058 >= var20 && var22 <= class75.field1529 && class189.field3058 < var24 && class75.field1529 < var25 && !class29.field551) {
                                    class169.field2715[0] = class268.field4140;
                                    class48.field999 = 1;
                                    class256.field3998[0] = class103.field1780;
                                    class296.field4515[0] = "";
                                    class120.field2088[0] = 1003;
                                }
                                class327.method2261(var12, var25, var14, var56.field3514, var13, var20, var24, false, var22);
                            }
                            if (class249.field3893 && var11.field1438 == 1407) {
                                class195.method1247();
                            }
                            if (class249.field3893) {
                                class115.method757(arg3, arg2, arg9, arg4);
                            } else {
                                class270.method1806(arg3, arg2, arg9, arg4);
                                class284.method1909();
                            }
                        }
                        if (class290.field4453[var12] || class79.field1567 > 1) {
                            if (var11.field1358 == 0 && !var11.field1429 && var11.field1414 < var11.field1401) {
                                class174.method1096(var11.field1414, var11.field1401, var11.field1419, var14, -3061, var11.field1416 + var13);
                            }
                            if (var11.field1358 != 1) {
                                if (var11.field1358 == 2) {
                                    int var57 = 0;
                                    for (int var58 = 0; var58 < var11.field1386; var58++) {
                                        for (int var59 = 0; var59 < var11.field1381; var59++) {
                                            int var60 = (var11.field1389 + 32) * var58 + var14;
                                            int var61 = (var11.field1318 + 32) * var59 + var13;
                                            if (var57 < 20) {
                                                var60 += var11.field1371[var57];
                                                var61 += var11.field1422[var57];
                                            }
                                            if (var11.field1341[var57] > 0) {
                                                boolean var62 = false;
                                                boolean var63 = false;
                                                int var64 = var11.field1341[var57] - 1;
                                                if ((var61 + 32) > arg3 && arg9 > var61 && var60 + 32 > arg2 && var60 < arg4 || class288.field4434 == var11 && class86.field1616 == var57) {
                                                    class283 var65;
                                                    if (class21.field447 == 1 && class224.field3530 == var57 && class109.field1881 == var11.field1284) {
                                                        var65 = class136.method888(0, var64, var11.field1460, 2, -31868, (class230) null, var11.field1327[var57]);
                                                    } else {
                                                        var65 = class136.method888(3153952, var64, var11.field1460, 1, -31868, (class230) null, var11.field1327[var57]);
                                                    }
                                                    if (class284.field4389) {
                                                        class337.field5220[var12] = true;
                                                    }
                                                    if (var65 == null) {
                                                        class317.method2183((byte) -7, var11);
                                                    } else if (class288.field4434 == var11 && class86.field1616 == var57) {
                                                        int var66 = class9.field196 - class289.field4448;
                                                        int var67 = class120.field2083 - class228.field3603;
                                                        if (var67 < 5 && var67 > -5) {
                                                            var67 = 0;
                                                        }
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (class278.field4286 < 5) {
                                                            var66 = 0;
                                                            var67 = 0;
                                                        }
                                                        var65.method903(var61 + var67, var60 + var66, 128);
                                                        if (arg5 != -1) {
                                                            class68 var68 = arg0[arg5 & 0xFFFF];
                                                            int var69;
                                                            int var70;
                                                            if (class249.field3893) {
                                                                var69 = class115.field2033;
                                                                var70 = class115.field2031;
                                                            } else {
                                                                var69 = class270.field4165;
                                                                var70 = class270.field4168;
                                                            }
                                                            if (var69 > var60 + var66 && var68.field1419 > 0) {
                                                                int var71 = (var69 - var60 - var66) * class176.field2836 / 3;
                                                                if ((class176.field2836 * 10) < var71) {
                                                                    var71 = class176.field2836 * 10;
                                                                }
                                                                if (var71 > var68.field1419) {
                                                                    var71 = var68.field1419;
                                                                }
                                                                class289.field4448 += var71;
                                                                var68.field1419 -= var71;
                                                                class317.method2183((byte) -7, var68);
                                                            }
                                                            if (var60 + var66 + 32 > var70 && (var68.field1401 - var68.field1414) > var68.field1419) {
                                                                int var72 = (var66 + var60 + 32 - var70) * class176.field2836 / 3;
                                                                if (var72 > class176.field2836 * 10) {
                                                                    var72 = class176.field2836 * 10;
                                                                }
                                                                if (var72 > (var68.field1401 - var68.field1414 - var68.field1419)) {
                                                                    var72 = var68.field1401 - var68.field1414 - var68.field1419;
                                                                }
                                                                var68.field1419 += var72;
                                                                class289.field4448 -= var72;
                                                                class317.method2183((byte) -7, var68);
                                                            }
                                                        }
                                                    } else if (class4.field103 == var11 && class26.field516 == var57) {
                                                        var65.method903(var61, var60, 128);
                                                    } else {
                                                        var65.method901(var61, var60);
                                                    }
                                                }
                                            } else if (var11.field1425 != null && var57 < 20) {
                                                class283 var73 = var11.method526((byte) 18, var57);
                                                if (var73 != null) {
                                                    var73.method901(var61, var60);
                                                } else if (class165.field2658) {
                                                    class317.method2183((byte) -7, var11);
                                                }
                                            }
                                            var57++;
                                        }
                                    }
                                } else if (var11.field1358 == 3) {
                                    int var141;
                                    if (class199.method1273(7140, var11)) {
                                        var141 = var11.field1402;
                                        if (class61.field1174 == var11 && var11.field1424 != 0) {
                                            var141 = var11.field1424;
                                        }
                                    } else {
                                        var141 = var11.field1355;
                                        if (class61.field1174 == var11 && var11.field1301 != 0) {
                                            var141 = var11.field1301;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1320) {
                                            if (class249.field3893) {
                                                class115.method755(var13, var14, var11.field1416, var11.field1414, var141);
                                            } else {
                                                class270.method1811(var13, var14, var11.field1416, var11.field1414, var141);
                                            }
                                        } else if (class249.field3893) {
                                            class115.method756(var13, var14, var11.field1416, var11.field1414, var141);
                                        } else {
                                            class270.method1802(var13, var14, var11.field1416, var11.field1414, var141);
                                        }
                                    } else if (var11.field1320) {
                                        if (class249.field3893) {
                                            class115.method763(var13, var14, var11.field1416, var11.field1414, var141, 256 - (var15 & 0xFF));
                                        } else {
                                            class270.method1801(var13, var14, var11.field1416, var11.field1414, var141, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class249.field3893) {
                                        class115.method748(var13, var14, var11.field1416, var11.field1414, var141, 256 - (var15 & 0xFF));
                                    } else {
                                        class270.method1818(var13, var14, var11.field1416, var11.field1414, var141, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1358 == 4) {
                                    class312 var137 = var11.method527(class344.field5343, -1);
                                    if (var137 != null) {
                                        String var138 = var11.field1295;
                                        int var139;
                                        if (class199.method1273(7140, var11)) {
                                            var139 = var11.field1402;
                                            if (class61.field1174 == var11 && var11.field1424 != 0) {
                                                var139 = var11.field1424;
                                            }
                                            if (var11.field1326.length() > 0) {
                                                var138 = var11.field1326;
                                            }
                                        } else {
                                            var139 = var11.field1355;
                                            if (class61.field1174 == var11 && var11.field1301 != 0) {
                                                var139 = var11.field1301;
                                            }
                                        }
                                        if (var11.field1429 && var11.field1290 != -1) {
                                            class337 var140 = class95.method636(22111, var11.field1290);
                                            var138 = var140.field5227;
                                            if (var138 == null) {
                                                var138 = "null";
                                            }
                                            if ((var140.field5200 == 1 || var11.field1392 != 1) && var11.field1392 != -1) {
                                                var138 = "<col=ff9040>" + var138 + "</col> x" + class345.method2388(-1, var11.field1392);
                                            }
                                        }
                                        if (class317.field4795 == var11) {
                                            var139 = var11.field1355;
                                            var138 = class307.field4646;
                                        }
                                        if (!var11.field1429) {
                                            var138 = class200.method1278(var138, 8, var11);
                                        }
                                        var137.method2110(var138, var13, var14, var11.field1416, var11.field1414, var139, var11.field1282 ? 0 : -1, var11.field1446, var11.field1397, var11.field1319);
                                    } else if (class165.field2658) {
                                        class317.method2183((byte) -7, var11);
                                    }
                                } else if (var11.field1358 == 5) {
                                    if (!var11.field1429) {
                                        class283 var136 = var11.method528((byte) 78, class199.method1273(7140, var11));
                                        if (var136 != null) {
                                            var136.method901(var13, var14);
                                        } else if (class165.field2658) {
                                            class317.method2183((byte) -7, var11);
                                        }
                                    } else if (var11.field1453 >= 0) {
                                        class145 var135 = var11.method531((byte) 32);
                                        if (class249.field3893) {
                                            var135.method938(0, var13, var14, var11.field1416, var11.field1414, var11.field1368, var11.field1390, 0);
                                        } else {
                                            var135.method939(0, var13, var14, var11.field1416, var11.field1414, var11.field1368, var11.field1390, 0);
                                        }
                                    } else {
                                        class283 var120;
                                        if (var11.field1290 == -1) {
                                            var120 = var11.method528((byte) 124, false);
                                        } else if (var11.field1447 && class66.field1265.field4281 != null) {
                                            var120 = class136.method888(var11.field1299, var11.field1290, var11.field1460, var11.field1357, -31868, class66.field1265.field4281, var11.field1392);
                                        } else {
                                            var120 = class136.method888(var11.field1299, var11.field1290, var11.field1460, var11.field1357, -31868, (class230) null, var11.field1392);
                                        }
                                        if (var120 != null) {
                                            int var121 = var120.field4375;
                                            int var122 = var120.field4373;
                                            if (var11.field1412) {
                                                int var124 = (var11.field1416 + var121 - 1) / var121;
                                                int var125 = (var122 + var11.field1414 - 1) / var122;
                                                if (class249.field3893) {
                                                    class115.method762(var13, var14, var13 + var11.field1416, var11.field1414 + var14);
                                                    class137 var128 = (class137) var120;
                                                    boolean var129 = class134.method879(var120.field4377, -27468);
                                                    boolean var130 = class134.method879(var120.field4383, -27468);
                                                    if (var129 && var130) {
                                                        if (var15 == 0) {
                                                            var128.method893(var13, var14, var124, var125);
                                                        } else {
                                                            var128.method894(var13, var14, 256 - (var15 & 0xFF), var124, var125);
                                                        }
                                                    } else if (var129) {
                                                        for (int var131 = 0; var131 < var125; var131++) {
                                                            if (var15 == 0) {
                                                                var128.method893(var13, var14 + (var122 * var131), var124, 1);
                                                            } else {
                                                                var128.method894(var13, var14 + (var122 * var131), -(var15 & 0xFF) + 256, var124, 1);
                                                            }
                                                        }
                                                    } else if (var130) {
                                                        for (int var134 = 0; var134 < var124; var134++) {
                                                            if (var15 == 0) {
                                                                var128.method893(var13 + (var121 * var134), var14, 1, var125);
                                                            } else {
                                                                var128.method894(var121 * var134 + var13, var14, 256 - (var15 & 0xFF), 1, var125);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var132 = 0; var132 < var124; var132++) {
                                                            for (int var133 = 0; var133 < var125; var133++) {
                                                                if (var15 == 0) {
                                                                    var120.method901(var121 * var132 + var13, var122 * var133 + var14);
                                                                } else {
                                                                    var120.method903(var121 * var132 + var13, var122 * var133 + var14, 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class115.method757(arg3, arg2, arg9, arg4);
                                                } else {
                                                    class270.method1813(var13, var14, var13 + var11.field1416, var14 - -var11.field1414);
                                                    for (int var126 = 0; var126 < var124; var126++) {
                                                        for (int var127 = 0; var127 < var125; var127++) {
                                                            if (var11.field1337 != 0) {
                                                                var120.method1901(var122 / 2 + var122 * var127 + var14, 15, var11.field1337, 4096, var121 * var126 + var121 / 2 + var13);
                                                            } else if (var15 == 0) {
                                                                var120.method901(var121 * var126 + var13, var14 - -(var122 * var127));
                                                            } else {
                                                                var120.method903(var13 + (var121 * var126), var14 - -(var122 * var127), 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class270.method1806(arg3, arg2, arg9, arg4);
                                                }
                                            } else {
                                                int var123 = var11.field1416 * 4096 / var121;
                                                if (var11.field1337 != 0) {
                                                    var120.method1901(var11.field1414 / 2 + var14, 15, var11.field1337, var123, var11.field1416 / 2 + var13);
                                                } else if (var15 != 0) {
                                                    var120.method904(var13, var14, var11.field1416, var11.field1414, 256 - (var15 & 0xFF));
                                                } else if (var11.field1416 == var121 && var11.field1414 == var122) {
                                                    var120.method901(var13, var14);
                                                } else {
                                                    var120.method905(var13, var14, var11.field1416, var11.field1414);
                                                }
                                            }
                                        } else if (class165.field2658) {
                                            class317.method2183((byte) -7, var11);
                                        }
                                    }
                                } else if (var11.field1358 == 6) {
                                    boolean var101 = class199.method1273(7140, var11);
                                    int var102;
                                    if (var101) {
                                        var102 = var11.field1354;
                                    } else {
                                        var102 = var11.field1439;
                                    }
                                    class309 var103 = null;
                                    int var104 = 0;
                                    if (var11.field1290 != -1) {
                                        class337 var109 = class95.method636(22111, var11.field1290);
                                        if (var109 != null) {
                                            class337 var110 = var109.method2323((byte) 110, var11.field1392);
                                            class260 var111 = var102 == -1 ? null : class279.method1882(25397, var102);
                                            if (var11.field1447 && class66.field1265.field4281 != null) {
                                                var103 = var110.method2327(var11.field1437, 5, var111, var11.field1433, 1, var11.field1338, class66.field1265.field4281);
                                            } else {
                                                var103 = var110.method2327(var11.field1437, 5, var111, var11.field1433, 1, var11.field1338, (class230) null);
                                            }
                                            if (var103 == null) {
                                                class317.method2183((byte) -7, var11);
                                            } else {
                                                var104 = -var103.method39() / 2;
                                            }
                                        }
                                    } else if (var11.field1423 == 5) {
                                        if (var11.field1431 == -1) {
                                            var103 = class168.field2689.method1521(0, -1, 0, (class260) null, -1, (byte) 112, (class260) null, true, (class341[]) null, -1, -1);
                                        } else {
                                            int var106 = var11.field1431 & 0x7FF;
                                            if (class100.field1758 == var106) {
                                                var106 = 2047;
                                            }
                                            class278 var107 = class97.field1715[var106];
                                            class260 var108 = var102 == -1 ? null : class279.method1882(25397, var102);
                                            if (var107 != null && (int) class116.method767(-128, var107.field4269) << 11 == (var11.field1431 & 0xFFFFF800)) {
                                                var103 = var107.field4281.method1521(0, -1, 0, (class260) null, 0, (byte) 108, var108, true, (class341[]) null, var11.field1433, -1);
                                            }
                                        }
                                    } else if (var102 == -1) {
                                        var103 = var11.method530(class66.field1265.field4281, -1, var101, 0, (class260) null, -1, (byte) 79);
                                        if (var103 == null && class165.field2658) {
                                            class317.method2183((byte) -7, var11);
                                        }
                                    } else {
                                        class260 var105 = class279.method1882(25397, var102);
                                        var103 = var11.method530(class66.field1265.field4281, var11.field1433, var101, var11.field1437, var105, var11.field1338, (byte) 82);
                                        if (var103 == null && class165.field2658) {
                                            class317.method2183((byte) -7, var11);
                                        }
                                    }
                                    if (var103 != null) {
                                        int var112;
                                        if (var11.field1399 <= 0) {
                                            var112 = 256;
                                        } else {
                                            var112 = (var11.field1414 << 8) / var11.field1399;
                                        }
                                        int var113 = (var11.field1380 * var112 >> 8) + var11.field1414 / 2 + var14;
                                        int var114;
                                        if (var11.field1430 > 0) {
                                            var114 = (var11.field1416 << 8) / var11.field1430;
                                        } else {
                                            var114 = 256;
                                        }
                                        int var115 = (var11.field1370 * var114 >> 8) + var11.field1416 / 2 + var13;
                                        if (class249.field3893) {
                                            if (var11.field1286) {
                                                class249.method1670(var115, var113, var11.field1294, var11.field1296, var114, var112);
                                            } else {
                                                class249.method1674(var115, var113, var114, var112);
                                                class249.method1688((float) var11.field1293, (float) var11.field1296 * 1.5F);
                                            }
                                            class249.method1666();
                                            class249.method1677(true);
                                            class249.method1661(false);
                                            class190.method1214(class331.field5068, (byte) 113);
                                            if (class33.field660) {
                                                class115.method753();
                                                class249.method1656();
                                                class115.method757(arg3, arg2, arg9, arg4);
                                                class33.field660 = false;
                                            }
                                            if (var11.field1375) {
                                                class249.method1650();
                                            }
                                            int var118 = class284.field4398[var11.field1342] * var11.field1294 >> 16;
                                            int var119 = class284.field4395[var11.field1342] * var11.field1294 >> 16;
                                            if (var11.field1429) {
                                                var103.method150(0, var11.field1400, var11.field1336, var11.field1342, var11.field1300, var104 + var119 + var11.field1335, var11.field1335 + var118, -1L);
                                            } else {
                                                var103.method150(0, var11.field1400, 0, var11.field1342, 0, var119, var118, -1L);
                                            }
                                            if (var11.field1375) {
                                                class249.method1659();
                                            }
                                        } else {
                                            class284.method1922(var115, var113);
                                            int var116 = class284.field4398[var11.field1342] * var11.field1294 >> 16;
                                            int var117 = class284.field4395[var11.field1342] * var11.field1294 >> 16;
                                            if (!var11.field1429) {
                                                var103.method150(0, var11.field1400, 0, var11.field1342, 0, var117, var116, -1L);
                                            } else if (var11.field1286) {
                                                ((class20) var103).method138(0, var11.field1400, var11.field1336, var11.field1342, var11.field1300, var104 + var117 + var11.field1335, var11.field1335 + var116, var11.field1294);
                                            } else {
                                                var103.method150(0, var11.field1400, var11.field1336, var11.field1342, var11.field1300, var117 + var11.field1335 + var104, var11.field1335 + var116, -1L);
                                            }
                                            class284.method1905();
                                        }
                                    }
                                } else {
                                    if (var11.field1358 == 7) {
                                        class312 var74 = var11.method527(class344.field5343, -1);
                                        if (var74 == null) {
                                            if (class165.field2658) {
                                                class317.method2183((byte) -7, var11);
                                            }
                                            continue;
                                        }
                                        int var75 = 0;
                                        for (int var76 = 0; var76 < var11.field1386; var76++) {
                                            for (int var77 = 0; var77 < var11.field1381; var77++) {
                                                if (var11.field1341[var75] > 0) {
                                                    class337 var78 = class95.method636(22111, var11.field1341[var75] - 1);
                                                    String var79;
                                                    if (var78.field5200 != 1 && var11.field1327[var75] == 1) {
                                                        var79 = "<col=ff9040>" + var78.field5227 + "</col>";
                                                    } else {
                                                        var79 = "<col=ff9040>" + var78.field5227 + "</col> x" + class345.method2388(-1, var11.field1327[var75]);
                                                    }
                                                    int var80 = (var11.field1318 + 115) * var77 + var13;
                                                    int var81 = var14 + ((var11.field1389 + 12) * var76);
                                                    if (var11.field1446 == 0) {
                                                        var74.method2120(var79, var80, var81, var11.field1355, var11.field1282 ? 0 : -1);
                                                    } else if (var11.field1446 == 1) {
                                                        var74.method2105(var79, var80 + 57, var81, var11.field1355, var11.field1282 ? 0 : -1);
                                                    } else {
                                                        var74.method2116(var79, var80 + 115 - 1, var81, var11.field1355, var11.field1282 ? 0 : -1);
                                                    }
                                                }
                                                var75++;
                                            }
                                        }
                                    }
                                    if (var11.field1358 == 8 && class24.field484 == var11 && class280.field4310 == class267.field4118) {
                                        class312 var82 = class33.field674;
                                        String var83 = var11.field1295;
                                        String var84 = class200.method1278(var83, 8, var11);
                                        int var85 = 0;
                                        int var86 = 0;
                                        while (var84.length() > 0) {
                                            int var87 = var84.indexOf("<br>");
                                            String var88;
                                            if (var87 == -1) {
                                                var88 = var84;
                                                var84 = "";
                                            } else {
                                                var88 = var84.substring(0, var87);
                                                var84 = var84.substring(var87 + 4);
                                            }
                                            int var89 = var82.method2118(var88);
                                            if (var89 > var85) {
                                                var85 = var89;
                                            }
                                            var86 += var82.field4733 + 1;
                                        }
                                        var86 += 7;
                                        var85 += 6;
                                        int var90 = var13 + var11.field1416 - var85 - 5;
                                        if (var13 + 5 > var90) {
                                            var90 = var13 + 5;
                                        }
                                        if (arg9 < var90 + var85) {
                                            var90 = arg9 - var85;
                                        }
                                        int var91 = var11.field1414 + var14 + 5;
                                        if (arg4 < (var86 + var91)) {
                                            var91 = arg4 - var86;
                                        }
                                        if (class249.field3893) {
                                            class115.method755(var90, var91, var85, var86, 16777120);
                                            class115.method756(var90, var91, var85, var86, 0);
                                        } else {
                                            class270.method1811(var90, var91, var85, var86, 16777120);
                                            class270.method1802(var90, var91, var85, var86, 0);
                                        }
                                        String var92 = var11.field1295;
                                        int var93 = var82.field4733 + var91 + 2;
                                        String var94 = class200.method1278(var92, 8, var11);
                                        while (var94.length() > 0) {
                                            int var95 = var94.indexOf("<br>");
                                            String var96;
                                            if (var95 == -1) {
                                                var96 = var94;
                                                var94 = "";
                                            } else {
                                                var96 = var94.substring(0, var95);
                                                var94 = var94.substring(var95 + 4);
                                            }
                                            var82.method2120(var96, var90 + 3, var93, 0, -1);
                                            var93 += var82.field4733 + 1;
                                        }
                                    }
                                    if (var11.field1358 == 9) {
                                        int var97;
                                        int var98;
                                        int var99;
                                        int var100;
                                        if (var11.field1332) {
                                            var98 = var11.field1414 + var14;
                                            var100 = var13 + var11.field1416;
                                            var97 = var13;
                                            var99 = var14;
                                        } else {
                                            var97 = var13;
                                            var98 = var14;
                                            var99 = var11.field1414 + var14;
                                            var100 = var11.field1416 + var13;
                                        }
                                        if (var11.field1394 == 1) {
                                            if (class249.field3893) {
                                                class115.method758(var97, var98, var100, var99, var11.field1355);
                                            } else {
                                                class270.method1815(var97, var98, var100, var99, var11.field1355);
                                            }
                                        } else if (class249.field3893) {
                                            class115.method752(var97, var98, var100, var99, var11.field1355, var11.field1394);
                                        } else {
                                            class270.method1803(var97, var98, var100, var99, var11.field1355, var11.field1394);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg6) {
            method1362((byte) 5);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lbm;I)V", line = 1333)
    public static final void method1361(class307 arg0, int arg1) {
        int var2 = 50 % ((-arg1 - 61) / 37);
        class63.field1205 = arg0;
        field3308++;
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)V", line = 1342)
    public static void method1362(byte arg0) {
        field3306 = null;
        if (arg0 < -11) {
            field3303 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BZLgh;)V", line = 1359)
    public static final void method1363(byte arg0, boolean arg1, class222 arg2) {
        int var3 = arg2.field3514;
        field3312++;
        int var4 = (int) arg2.field702;
        arg2.method278((byte) -105);
        if (arg1) {
            class200.method1276(false, var3);
        }
        class29.method238(0, var3);
        class68 var5 = class319.method2196(-1351736944, var4);
        if (arg0 < 117) {
            return;
        }
        if (var5 != null) {
            class317.method2183((byte) -7, var5);
        }
        int var6 = class48.field999;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class172.method1088(39, class120.field2088[var7])) {
                class14.method111((byte) -89, var7);
            }
        }
        if (class48.field999 == 1) {
            class290.field4459 = false;
            class25.method204((byte) 86, class343.field5328, class112.field1966, class42.field813, class187.field3033);
        } else {
            class25.method204((byte) 96, class343.field5328, class112.field1966, class42.field813, class187.field3033);
            int var8 = class214.field3428.method2118(class330.field5059);
            for (int var9 = 0; var9 < class48.field999; var9++) {
                int var10 = class214.field3428.method2118(class50.method377(-17414, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class42.field813 = var8 + 8;
            class187.field3033 = class48.field999 * 15 + (class267.field4117 ? 26 : 22);
        }
        if (class158.field2580 != -1) {
            class127.method839(1, class158.field2580, (byte) -109);
        }
    }
}
