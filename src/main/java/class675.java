import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class675 extends class49 {

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "F")
    public static float field9457 = 1.0F;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "[[I")
    public static int[][] field9467 = new int[6][];

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "Lqk;")
    public static class1 field9466 = new class1(80, 2);

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "I")
    public static int field9458;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    public static int field9465;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public static int field9471;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "Ljava/lang/String;")
    public String field9460;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "[C")
    public char[] field9464;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "[C")
    public char[] field9470;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "[I")
    public int[] field9461;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "[I")
    public int[] field9469;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IC)I", line = 10)
    public final int method3842(int arg0, char arg1) {
        field9463++;
        if (this.field9469 == null) {
            return -1;
        } else if (arg0 <= 61) {
            return -51;
        } else {
            for (int var3 = 0; var3 < this.field9469.length; var3++) {
                if (this.field9470[var3] == arg1) {
                    return this.field9469[var3];
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V", line = 34)
    public static final void method3843(int arg0) {
        if (arg0 < 91) {
            field9457 = -0.6657134F;
        }
        field9471++;
        for (class171 var1 = (class171) class646.field9038.method1041(1048832); var1 != null; var1 = (class171) class646.field9038.method1033(-1)) {
            if (class529.method3140(-31534, var1.field2174)) {
                class475.method2830(-27864, var1);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZII[Lsha;IIIIII)V", line = 57)
    public static final void method3844(int arg0, boolean arg1, int arg2, int arg3, class115[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class111.field1332.method225(arg9, arg10, arg3, arg2);
        field9468++;
        for (int var11 = arg8; var11 < arg4.length; var11++) {
            class115 var12 = arg4[var11];
            if (var12 != null && (var12.field1436 == arg0 || arg0 == -1412584499 && class81.field906 == var12)) {
                int var13 = var12.field1408 + arg6;
                int var14 = var12.field1503 + arg7;
                int var15 = var13 + var12.field1560 + 1;
                int var16 = var14 + var12.field1517 + 1;
                int var17;
                if (arg5 == -1) {
                    class185.field2308[class187.field2331].setBounds(var12.field1408 + arg6, var12.field1503 + arg7, var12.field1560, var12.field1517);
                    var17 = class187.field2331++;
                } else {
                    var17 = arg5;
                }
                var12.field1452 = var17;
                var12.field1541 = class533.field7336;
                if (!client.method788(var12)) {
                    if (var12.field1553 != 0) {
                        class55.method465(var12, 0);
                    }
                    int var18 = var12.field1408 + arg6;
                    int var19 = var12.field1503 + arg7;
                    int var20 = 0;
                    int var21 = 0;
                    if (class55.field651) {
                        var20 = class236.method1611(arg8 ^ 0xFFFFEC0A);
                        var21 = class339.method2149((byte) -113);
                    }
                    int var22 = var12.field1431;
                    if (class635.field8860 && (client.method779(var12).field2201 != 0 || var12.field1564 == 0) && var22 > 127) {
                        var22 = 127;
                    }
                    if (class81.field906 == var12) {
                        if (arg0 != -1412584499 && (class722.field9961 == var12.field1481 || class76.field854 == var12.field1481)) {
                            class334.field4776 = arg7;
                            class182.field2293 = arg6;
                            class578.field8118 = arg4;
                            continue;
                        }
                        if (class653.field9112 && class475.field6583) {
                            int var23 = class205.field2881.method354((byte) -20) + var20;
                            int var24 = class205.field2881.method351(-25269) + var21;
                            int var25 = var23 - class539.field7463;
                            int var26 = var24 - class189.field2371;
                            if (var25 < class518.field7144) {
                                var25 = class518.field7144;
                            }
                            if (var25 + var12.field1560 > class518.field7144 + class434.field6028.field1560) {
                                var25 = class518.field7144 + class434.field6028.field1560 - var12.field1560;
                            }
                            if (var26 < class474.field6579) {
                                var26 = class474.field6579;
                            }
                            var18 = var25;
                            if ((var12.field1517 + var26) > (class474.field6579 + class434.field6028.field1517)) {
                                var26 = class474.field6579 + class434.field6028.field1517 - var12.field1517;
                            }
                            var19 = var26;
                        }
                        if (class76.field854 == var12.field1481) {
                            var22 = 128;
                        }
                    }
                    int var27;
                    int var28;
                    int var29;
                    int var30;
                    if (var12.field1564 == 2) {
                        var27 = arg2;
                        var28 = arg9;
                        var29 = arg10;
                        var30 = arg3;
                    } else {
                        int var31 = var12.field1560 + var18;
                        int var32 = var12.field1517 + var19;
                        var29 = var19 <= arg10 ? arg10 : var19;
                        if (var12.field1564 == 9) {
                            var32++;
                            var31++;
                        }
                        var28 = arg9 >= var18 ? arg9 : var18;
                        var30 = arg3 <= var31 ? arg3 : var31;
                        var27 = arg2 > var32 ? var32 : arg2;
                    }
                    if (var30 > var28 && var29 < var27) {
                        if (var12.field1553 != 0) {
                            if (class166.field2124 == var12.field1553 || class234.field3514 == var12.field1553) {
                                class88.method655(var12, var19, var18, arg8 ^ 0xFFFFFFA4);
                                if (!class55.field651) {
                                    class578.method3384(arg8 ^ 0x54, var19, class234.field3514 == var12.field1553, var12.field1560, var12.field1517, var18);
                                    class111.field1332.method225(arg9, arg10, arg3, arg2);
                                }
                                class363.field5240[var17] = true;
                                continue;
                            }
                            if (class526.field7241 == var12.field1553) {
                                if (var12.method843(class111.field1332, 1531777828) != null) {
                                    class482.method2865(23105);
                                    class158.method1018((byte) 121, var12, var19, class111.field1332, var18);
                                    class585.field8271[var17] = true;
                                    class111.field1332.method225(arg9, arg10, arg3, arg2);
                                    if (class55.field651) {
                                        if (arg1) {
                                            class338.method2144((byte) -117, var15, var14, var16, var13);
                                        } else {
                                            class610.method3534(var14, var16, var15, -2, var13);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class470.field6518 == var12.field1553) {
                                class289.method1917(var12, class111.field1332, var19, 63, var18);
                                continue;
                            }
                            if (class144.field1849 == var12.field1553) {
                                class319.method2038(var12.field1548 % 64, var19, class111.field1332, false, var18, var12);
                                continue;
                            }
                            if (class327.field4599 == var12.field1553) {
                                if (var12.method843(class111.field1332, 1531777828) != null) {
                                    class525.method3128((byte) -128, var12, var18, var19);
                                    class585.field8271[var17] = true;
                                    class111.field1332.method225(arg9, arg10, arg3, arg2);
                                    if (class55.field651) {
                                        if (arg1) {
                                            class338.method2144((byte) -76, var15, var14, var16, var13);
                                        } else {
                                            class610.method3534(var14, var16, var15, -2, var13);
                                        }
                                    }
                                }
                                continue;
                            }
                            if (class459.field6417 == var12.field1553) {
                                class534.method3175(-123, var12.field1517, var19, class753.field10382, class111.field1332, var12.field1560, var18);
                                class363.field5240[var17] = true;
                                class111.field1332.method225(arg9, arg10, arg3, arg2);
                                continue;
                            }
                            if (class691.field9649 == var12.field1553) {
                                class112.method814(var12.field1560, class111.field1332, var18, var19, 1381, var12.field1517);
                                class363.field5240[var17] = true;
                                class111.field1332.method225(arg9, arg10, arg3, arg2);
                                continue;
                            }
                            if (class673.field9451 == var12.field1553) {
                                if (!class493.field6792 && !class248.field3698) {
                                    continue;
                                }
                                int var33 = var18 + var12.field1560;
                                int var34 = var19 + 15;
                                if (class55.field651) {
                                    if (arg1) {
                                        class338.method2144((byte) -99, var15, var14, var16, var13);
                                    } else {
                                        class610.method3534(var14, var16, var15, arg8 - 2, var13);
                                    }
                                }
                                if (class493.field6792) {
                                    int var35 = -256;
                                    if (class744.field10277 < 20) {
                                        var35 = -65536;
                                    }
                                    class559.field7865.method2636(var34, var35, "Fps:" + class744.field10277, var33, 0, -1);
                                    var34 += 15;
                                    Runtime var36 = Runtime.getRuntime();
                                    int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                    int var38 = -256;
                                    if (var37 > 98304) {
                                        var38 = -65536;
                                        if (class638.field8971) {
                                            class167.method1048((byte) -117);
                                            for (int var39 = 0; var39 < 10; var39++) {
                                                System.gc();
                                            }
                                            var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            if (var37 > 65536) {
                                                class128.method876(4, (byte) 112, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                    }
                                    class559.field7865.method2636(var34, var38, "Mem:" + var37 + "k", var33, 0, -1);
                                    var34 += 15;
                                    class559.field7865.method2636(var34, -256, "In:" + class277.field3992 + "B/s Out:" + class59.field685 + "B/s", var33, 0, -1);
                                    var34 += 15;
                                    int var40 = class111.field1332.method181() / 1024;
                                    class559.field7865.method2636(var34, var40 > 65536 ? -65536 : -256, "Offheap:" + var40 + "k", var33, 0, -1);
                                    var34 += 15;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = 0;
                                    for (int var44 = 0; var44 < 37; var44++) {
                                        if (class570.field8021[var44] != null) {
                                            var41 += class570.field8021[var44].method1654(-121);
                                            var42 += class570.field8021[var44].method1658(arg8 ^ 0xFFFF9698);
                                            var43 += class570.field8021[var44].method1650(-127);
                                        }
                                    }
                                    int var45 = var43 * 100 / var41;
                                    int var46 = var42 * 10000 / var41;
                                    String var47 = "Cache:" + class84.method640(103, true, 2, 0, (long) var46) + "% (" + var45 + "%)";
                                    class78.field878.method2636(var34, -256, var47, var33, 0, -1);
                                    var34 += 12;
                                }
                                if (class55.field653 > 0) {
                                    class78.field878.method2636(var34, -256, "Particles: " + class156.field2034 + " / " + class55.field653, var33, arg8, -1);
                                }
                                var34 += 12;
                                if (class248.field3698) {
                                    class78.field878.method2636(var34, -256, "Polys: " + class111.field1332.method136() + " Models: " + class111.field1332.method214(), var33, 0, -1);
                                    var34 += 12;
                                    class78.field878.method2636(var34, -256, "Ls: " + class653.field9116 + " La: " + class530.field7304 + " NPC: " + class791.field10846 + " Pl: " + class432.field6002, var33, 0, -1);
                                    var34 += 12;
                                    class273.method1778(false);
                                }
                                class363.field5240[var17] = true;
                                continue;
                            }
                        }
                        if (var12.field1564 == 0) {
                            if (class136.field1750 == var12.field1553 && class111.field1332.method147()) {
                                class111.field1332.method197(var18, var19, var12.field1560, var12.field1517);
                            }
                            method3844(var12.field1446, arg1, var27, var30, arg4, var17, var18 - var12.field1559, -var12.field1495 + var19, 0, var28, var29);
                            if (var12.field1394 != null) {
                                method3844(var12.field1446, arg1, var27, var30, var12.field1394, var17, var18 - var12.field1559, -var12.field1495 + var19, 0, var28, var29);
                            }
                            class610 var48 = (class610) class278.field3993.method3669(false, (long) var12.field1446);
                            if (var48 != null) {
                                class577.method3377(var17, var18, var28, var48.field8600, var19, var27, arg8, var30, var29);
                            }
                            if (class136.field1750 == var12.field1553 && class111.field1332.method147()) {
                                class111.field1332.method145();
                            }
                            class111.field1332.method225(arg9, arg10, arg3, arg2);
                        }
                        if (class435.field6034[var17] || class122.field1620 > 1) {
                            if (var12.field1564 == 3) {
                                if (var22 == 0) {
                                    if (var12.field1474) {
                                        class111.field1332.method233(var18, var19, var12.field1560, var12.field1517, var12.field1548, 0);
                                    } else {
                                        class111.field1332.method171(var18, var19, var12.field1560, var12.field1517, var12.field1548, 0);
                                    }
                                } else if (var12.field1474) {
                                    class111.field1332.method233(var18, var19, var12.field1560, var12.field1517, 255 - (var22 & 0xFF) << 24 | var12.field1548 & 0xFFFFFF, 1);
                                } else {
                                    class111.field1332.method171(var18, var19, var12.field1560, var12.field1517, 255 - (var22 & 0xFF) << 24 | var12.field1548 & 0xFFFFFF, 1);
                                }
                                if (class55.field651) {
                                    if (arg1) {
                                        class338.method2144((byte) -38, var15, var14, var16, var13);
                                    } else {
                                        class610.method3534(var14, var16, var15, -2, var13);
                                    }
                                }
                            } else if (var12.field1564 == 4) {
                                class442 var49 = var12.method821((byte) 88, class111.field1332);
                                if (var49 != null) {
                                    int var50 = var12.field1548;
                                    String var51 = var12.field1546;
                                    if (var12.field1458 != -1) {
                                        class581 var52 = class35.field367.method3051((byte) -20, var12.field1458);
                                        var51 = var52.field8230;
                                        if (var51 == null) {
                                            var51 = "null";
                                        }
                                        if ((var52.field8156 == 1 || var12.field1435 != 1) && var12.field1435 != -1) {
                                            var51 = "<col=ff9040>" + var51 + "</col> x" + class70.method530((byte) 16, var12.field1435);
                                        }
                                    }
                                    if (var12.field1455 != -1) {
                                        var51 = class788.method4325(27586, var12.field1455);
                                        if (var51 == null) {
                                            var51 = "";
                                        }
                                    }
                                    if (class330.field4635 == var12) {
                                        var51 = class712.field9884.method3999(class553.field7667, (byte) -64);
                                        var50 = var12.field1548;
                                    }
                                    if (class746.field10295) {
                                        class111.field1332.method252(var18, var19, var12.field1560 + var18, var12.field1517 + var19);
                                    }
                                    var49.method2647((byte) 43, var12.field1448, var12.field1434, null, var51, class475.field6585, 0, var12.field1505, var19, 0, null, var12.field1555 ? 255 - (var22 & 0xFF) << 24 : -1, var12.field1560, 255 - (var22 & 0xFF) << 24 | var50, var12.field1517, var12.field1459, var18);
                                    if (class746.field10295) {
                                        class111.field1332.method225(arg9, arg10, arg3, arg2);
                                    }
                                    if (var51.trim().length() > 0) {
                                        if (!class746.field10295) {
                                            class300 var53 = class171.method1098(var12.field1480, 120, class111.field1332);
                                            int var54 = var53.method1957(arg8, var12.field1560, class475.field6585, var51);
                                            int var55 = var53.method1954(false, var51, var12.field1560, var12.field1459, class475.field6585);
                                            if (class55.field651) {
                                                if (arg1) {
                                                    class338.method2144((byte) -82, var18 + var54, var19, var19 + var55, var18);
                                                } else {
                                                    class610.method3534(var19, var19 + var55, var18 + var54, -2, var18);
                                                }
                                            }
                                        } else if (class55.field651) {
                                            if (arg1) {
                                                class338.method2144((byte) -75, var15, var14, var16, var13);
                                            } else {
                                                class610.method3534(var14, var16, var15, -2, var13);
                                            }
                                        }
                                    }
                                } else if (class742.field10219) {
                                    class43.method336(-1, var12);
                                }
                            } else if (var12.field1564 == 5) {
                                if (var12.field1502 >= 0) {
                                    var12.method829(class72.field790, class651.field9101, (byte) -120).method2305(-1, var18, var19, var12.field1560, 0, class111.field1332, var12.field1490 << 3, var12.field1517, var12.field1424 << 3, 0);
                                } else {
                                    class318 var56;
                                    if (var12.field1458 != -1) {
                                        class247 var57 = var12.field1539 ? class724.field10031.field9993 : null;
                                        var56 = class35.field367.method3050(var12.field1557, var57, var12.field1458, var12.field1435, var12.field1496, var12.field1497 | 0xFF000000, class111.field1332, -127);
                                    } else if (var12.field1455 == -1) {
                                        var56 = var12.method825(class111.field1332, 12933);
                                    } else {
                                        var56 = class752.method4158(var12.field1455, class111.field1332, 0);
                                    }
                                    if (var56 != null) {
                                        int var58 = var56.method749();
                                        int var59 = var56.method736();
                                        int var60 = 255 - (var22 & 0xFF) << 24 | (var12.field1548 == 0 ? 16777215 : var12.field1548 & 0xFFFFFF);
                                        if (var12.field1468) {
                                            class111.field1332.method252(var18, var19, var12.field1560 + var18, var12.field1517 + var19);
                                            if (var12.field1457 != 0) {
                                                int var61 = (var12.field1560 + var58 - 1) / var58;
                                                int var62 = (var12.field1517 - (1 - var59)) / var59;
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var12.field1548 == 0) {
                                                            var56.method2024((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field1457);
                                                        } else {
                                                            var56.method2030((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field1457, 0, var60, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var12.field1548 == 0 && var22 == 0) {
                                                var56.method2031(var18, var19, var12.field1560, var12.field1517);
                                            } else {
                                                var56.method748(var18, var19, var12.field1560, var12.field1517, 0, var60, 1);
                                            }
                                            class111.field1332.method225(arg9, arg10, arg3, arg2);
                                        } else if (var12.field1548 == 0 && var22 == 0) {
                                            if (var12.field1457 != 0) {
                                                var56.method2024((float) var12.field1560 / 2.0F + (float) var18, (float) var12.field1517 / 2.0F + (float) var19, var12.field1560 * 4096 / var58, var12.field1457);
                                            } else if (var12.field1560 == var58 && var12.field1517 == var59) {
                                                var56.method2025(var18, var19);
                                            } else {
                                                var56.method2033(var18, var19, var12.field1560, var12.field1517);
                                            }
                                        } else if (var12.field1457 != 0) {
                                            var56.method2030((float) var12.field1560 / 2.0F + (float) var18, (float) var12.field1517 / 2.0F + (float) var19, var12.field1560 * 4096 / var58, var12.field1457, 0, var60, 1);
                                        } else if (var12.field1560 == var58 && var12.field1517 == var59) {
                                            var56.method746(var18, var19, 0, var60, 1);
                                        } else {
                                            var56.method2028(var18, var19, var12.field1560, var12.field1517, 0, var60, 1);
                                        }
                                    } else if (class742.field10219) {
                                        class43.method336(-1, var12);
                                    }
                                }
                                if (class55.field651) {
                                    if (arg1) {
                                        class338.method2144((byte) -68, var15, var14, var16, var13);
                                    } else {
                                        class610.method3534(var14, var16, var15, arg8 - 2, var13);
                                    }
                                }
                            } else if (var12.field1564 == 6) {
                                class778.method4285((byte) 69);
                                Object var65 = null;
                                class231 var66 = null;
                                int var67 = 0;
                                if (var12.field1458 != -1) {
                                    class581 var75 = class35.field367.method3051((byte) -20, var12.field1458);
                                    if (var75 != null) {
                                        class581 var76 = var75.method3404(var12.field1435, -18698);
                                        class73 var77 = var12.field1411 == -1 ? null : class571.field8029.method3695(var12.field1411, (byte) -108);
                                        class247 var78 = var12.field1539 ? class724.field10031.field9993 : null;
                                        var66 = var76.method3419(var12.field1392, 1, arg8 ^ 0xFFFFFFAA, var12.field1390, class111.field1332, 2048, var12.field1554, var77, var78);
                                        if (var66 == null) {
                                            class43.method336(-1, var12);
                                        } else {
                                            var67 = -var66.method1576() >> 1;
                                        }
                                    }
                                } else if (var12.field1479 == 5) {
                                    int var68 = var12.field1404;
                                    if (var68 >= 0 && var68 < 2048) {
                                        class723 var69 = class413.field5787[var68];
                                        class73 var70 = var12.field1411 == -1 ? null : class571.field8029.method3695(var12.field1411, (byte) -114);
                                        if (var69 != null && (class173.field2193 == var68 || class727.method4043(var69.field9965, (byte) -84) == var12.field1456)) {
                                            var66 = var69.field9993.method1660(2048, -15591, 0, var12.field1392, class173.field2192, var70, null, true, null, class571.field8029, class35.field367, -1, class111.field1332, class104.field1201, var12.field1554, class671.field9419, 0, class15.field91, null, 0, var12.field1390);
                                        }
                                    }
                                } else if (var12.field1479 == 8 || var12.field1479 == 9) {
                                    class717 var72 = class159.method1020(false, false, var12.field1404);
                                    class73 var73 = var12.field1411 == -1 ? null : class571.field8029.method3695(var12.field1411, (byte) -109);
                                    if (var72 != null) {
                                        class247 var74 = var12.field1539 ? class724.field10031.field9993 : null;
                                        var66 = var72.method4008((byte) 82, var74, var12.field1392, var73, var12.field1479 == 9, var12.field1456, var12.field1554, var12.field1390, class111.field1332, 2048);
                                    }
                                } else if (var12.field1411 == -1) {
                                    var66 = var12.method836(0, class571.field8029, class111.field1332, 0, class104.field1201, class173.field2192, null, class671.field9419, -1, class15.field91, 2048, class35.field367, -1, (class201) var65, class724.field10031.field9993);
                                    if (var66 == null && class742.field10219) {
                                        class43.method336(-1, var12);
                                    }
                                } else {
                                    class73 var71 = class571.field8029.method3695(var12.field1411, (byte) -116);
                                    var66 = var12.method836(0, class571.field8029, class111.field1332, var12.field1390, class104.field1201, class173.field2192, var71, class671.field9419, var12.field1554, class15.field91, 2048, class35.field367, var12.field1392, (class201) var65, class724.field10031.field9993);
                                    if (var66 == null && class742.field10219) {
                                        class43.method336(-1, var12);
                                    }
                                }
                                if (var66 != null) {
                                    int var79;
                                    if (var12.field1508 > 0) {
                                        var79 = (var12.field1560 << 9) / var12.field1508;
                                    } else {
                                        var79 = 512;
                                    }
                                    int var80;
                                    if (var12.field1566 <= 0) {
                                        var80 = 512;
                                    } else {
                                        var80 = (var12.field1517 << 9) / var12.field1566;
                                    }
                                    int var81 = var12.field1560 / 2 + var18;
                                    int var82 = var12.field1517 / 2 + var19;
                                    if (!var12.field1563) {
                                        var81 += var12.field1516 * var79 >> 9;
                                        var82 += var12.field1561 * var80 >> 9;
                                    }
                                    class732.field10111.method42();
                                    class111.field1332.method194(class732.field10111);
                                    class111.field1332.method242(var81, var82, var79, var80);
                                    class111.field1332.method226();
                                    if (var12.field1398) {
                                        class111.field1332.method211(false);
                                    }
                                    if (var12.field1563) {
                                        class49.field592.method40(var12.field1469);
                                        class49.field592.method51(var12.field1449);
                                        class49.field592.method45(var12.field1535);
                                        class49.field592.method47(var12.field1516, var12.field1561, var12.field1531);
                                    } else {
                                        int var83 = (var12.field1536 << 2) * class448.field6265[var12.field1469 << 3] >> 14;
                                        int var84 = (var12.field1536 << 2) * class448.field6270[var12.field1469 << 3] >> 14;
                                        class49.field592.method46(-var12.field1535 << 3);
                                        class49.field592.method51(var12.field1449 << 3);
                                        class49.field592.method47(var12.field1417 << 2, (var12.field1483 << 2) + var67 + var83, (var12.field1483 << 2) + var84);
                                        class49.field592.method52(var12.field1469 << 3);
                                    }
                                    var12.method830(true, var66, class49.field592, class533.field7336, class111.field1332);
                                    if (class746.field10295) {
                                        class111.field1332.method252(var18, var19, var12.field1560 + var18, var12.field1517 + var19);
                                    }
                                    if (var12.field1563) {
                                        if (var12.field1501) {
                                            var66.method1580(class49.field592, null, var12.field1536, 1);
                                        } else {
                                            var66.method1586(class49.field592, null, 1);
                                            if (var12.field1527 != null) {
                                                class111.field1332.method253(var12.field1527.method2404());
                                            }
                                        }
                                    } else if (var12.field1501) {
                                        var66.method1580(class49.field592, null, var12.field1536 << 2, 1);
                                    } else {
                                        var66.method1586(class49.field592, null, 1);
                                        if (var12.field1527 != null) {
                                            class111.field1332.method253(var12.field1527.method2404());
                                        }
                                    }
                                    if (class746.field10295) {
                                        class111.field1332.method225(arg9, arg10, arg3, arg2);
                                    }
                                    if (var12.field1398) {
                                        class111.field1332.method211(true);
                                    }
                                }
                                if (class55.field651) {
                                    if (arg1) {
                                        class338.method2144((byte) -82, var15, var14, var16, var13);
                                    } else {
                                        class610.method3534(var14, var16, var15, -2, var13);
                                    }
                                }
                            } else if (var12.field1564 == 9) {
                                int var85;
                                int var86;
                                int var87;
                                int var88;
                                if (var12.field1389) {
                                    var88 = var19;
                                    var85 = var18 + var12.field1560;
                                    var86 = var18;
                                    var87 = var12.field1517 + var19;
                                } else {
                                    var85 = var12.field1560 + var18;
                                    var86 = var18;
                                    var87 = var19;
                                    var88 = var19 + var12.field1517;
                                }
                                if (var12.field1544 == 1) {
                                    class111.field1332.method139(var86, var87, var85, var88, var12.field1548, 0);
                                } else {
                                    class111.field1332.method141(var86, var87, var85, var88, var12.field1548, var12.field1544, 0);
                                }
                                if (class55.field651) {
                                    if (arg1) {
                                        class338.method2144((byte) -42, var15, var14, var16, var13);
                                    } else {
                                        class610.method3534(var14, var16, var15, -2, var13);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "(I)V", line = 923)
    public final void method3845(int arg0) {
        if (arg0 != 24473) {
            method3843(-109);
        }
        if (this.field9469 != null) {
            for (int var2 = 0; var2 < this.field9469.length; var2++) {
                this.field9469[var2] = class613.method3544(this.field9469[var2], 32768);
            }
        }
        field9462++;
        if (this.field9461 != null) {
            for (int var3 = 0; var3 < this.field9461.length; var3++) {
                this.field9461[var3] = class613.method3544(this.field9461[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLgga;)V", line = 954)
    public final void method3846(byte arg0, class511 arg1) {
        while (true) {
            int var3 = arg1.method3013(26);
            if (var3 == 0) {
                field9459++;
                if (arg0 >= -127) {
                    method3848(-94);
                    return;
                }
                return;
            }
            this.method3849(arg1, var3, 24796);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BC)I", line = 981)
    public final int method3847(byte arg0, char arg1) {
        field9458++;
        if (this.field9461 == null) {
            return -1;
        }
        int var3 = 0;
        if (arg0 < 99) {
            this.method3847((byte) 82, 'd');
        }
        while (this.field9461.length > var3) {
            if (this.field9464[var3] == arg1) {
                return this.field9461[var3];
            }
            var3++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "(I)V", line = 1006)
    public static void method3848(int arg0) {
        if (arg0 == 6) {
            field9466 = null;
            field9467 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lgga;II)V", line = 1017)
    private final void method3849(class511 arg0, int arg1, int arg2) {
        if (arg2 != 24796) {
            return;
        }
        field9465++;
        if (arg1 == 1) {
            this.field9460 = arg0.method2993((byte) -91);
        } else if (arg1 == 2) {
            int var4 = arg0.method3013(14);
            this.field9461 = new int[var4];
            this.field9464 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9461[var5] = arg0.method3002(-1);
                byte var6 = arg0.method3030(-25984);
                this.field9464[var5] = var6 == 0 ? 0 : class395.method2438(var6, -128);
            }
        } else if (arg1 == 3) {
            int var7 = arg0.method3013(26);
            this.field9469 = new int[var7];
            this.field9470 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field9469[var8] = arg0.method3002(-1);
                byte var9 = arg0.method3030(-25984);
                this.field9470[var8] = var9 == 0 ? 0 : class395.method2438(var9, -128);
            }
        }
    }
}
