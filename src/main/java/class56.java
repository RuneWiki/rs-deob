import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class56 extends class80 {

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Lr;")
    public static class66 field953 = class93.method641(43, " (X");

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Z")
    public static boolean field957 = false;

    @OriginalMember(owner = "client!oi", name = "z", descriptor = "B")
    public byte field962;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public int field954;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!oi", name = "y", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!oi", name = "D", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!oi", name = "x", descriptor = "Lr;")
    public class66 field960;

    @OriginalMember(owner = "client!oi", name = "A", descriptor = "Lr;")
    public class66 field963;

    @OriginalMember(owner = "client!oi", name = "C", descriptor = "[I")
    public static int[] field964;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "[Ldh;")
    public static class265[] field956;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILlh;)Lr;")
    public static final class66 method369(int arg0, class249 arg1) {
        field961++;
        int var2 = 19 % ((-arg0 - 21) / 37);
        return class84.method583(0, arg1, 32767);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)I")
    public static final int method370(int arg0, int arg1, int arg2) {
        if (arg2 < 65) {
            return 23;
        }
        int var3 = 1;
        field965++;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public static void method371(boolean arg0) {
        field956 = null;
        field953 = null;
        if (arg0) {
            field964 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III[Lha;IIIIII)V")
    public static final void method372(int arg0, int arg1, int arg2, class63[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class235.method1546(arg6, arg2, arg4, arg0);
        class123.method845();
        if (arg1 != -21644) {
            return;
        }
        field952++;
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class63 var11 = arg3[var10];
            if (var11 != null && (var11.field1122 == arg8 || arg8 == -1412584499 && class241.field4187 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class246.field4293[class87.field1701] = var11.field1138 + arg9;
                    class181.field3167[class87.field1701] = var11.field1226 + arg7;
                    class157.field2827[class87.field1701] = var11.field1215;
                    class45.field831[class87.field1701] = var11.field1196;
                    var12 = class87.field1701++;
                } else {
                    var12 = arg5;
                }
                var11.field1183 = class75.field1501;
                var11.field1225 = var12;
                if (!var11.field1186 || !client.method596(var11)) {
                    if (var11.field1131 > 0) {
                        class114.method763(30341, var11);
                    }
                    int var13 = var11.field1138 + arg9;
                    int var14 = var11.field1098;
                    int var15 = var11.field1226 + arg7;
                    if (class102.field1999 && (client.method592(var11) != 0 || var11.field1219 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class241.field4187 == var11) {
                        if (arg8 != -1412584499 && !var11.field1089) {
                            class255.field4483 = arg7;
                            class17.field234 = arg9;
                            class89.field1722 = arg3;
                            continue;
                        }
                        if (class109.field2115 && class217.field3740) {
                            int var16 = class50.field896;
                            int var17 = var16 - class183.field3199;
                            if (var17 < class215.field3691) {
                                var17 = class215.field3691;
                            }
                            int var18 = class170.field3021;
                            int var19 = var18 - class164.field2934;
                            if (class188.field3270 > var19) {
                                var19 = class188.field3270;
                            }
                            if (class188.field3270 + class135.field2502.field1215 < var11.field1215 + var19) {
                                var19 = class188.field3270 + class135.field2502.field1215 - var11.field1215;
                            }
                            var13 = var19;
                            if ((class215.field3691 + class135.field2502.field1196) < (var11.field1196 + var17)) {
                                var17 = class135.field2502.field1196 + class215.field3691 - var11.field1196;
                            }
                            var15 = var17;
                        }
                        if (!var11.field1089) {
                            var14 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1219 == 2) {
                        var20 = arg6;
                        var21 = arg0;
                        var22 = arg2;
                        var23 = arg4;
                    } else {
                        var20 = var13 <= arg6 ? arg6 : var13;
                        var22 = var15 <= arg2 ? arg2 : var15;
                        int var24 = var11.field1215 + var13;
                        int var25 = var15 + var11.field1196;
                        if (var11.field1219 == 9) {
                            var25++;
                            var24++;
                        }
                        var21 = arg0 <= var25 ? arg0 : var25;
                        var23 = var24 < arg4 ? var24 : arg4;
                    }
                    if (!var11.field1186 || var20 < var23 && var22 < var21) {
                        if (var11.field1131 != 0) {
                            if (var11.field1131 == 1337) {
                                class14.field182 = var13;
                                class125.field2368 = var15;
                                class154.field2751 = var11;
                                class180.method1199(var15, var11.field1215, false, var13, var11.field1131 == 1403, var11.field1196);
                                class235.method1546(arg6, arg2, arg4, arg0);
                                continue;
                            }
                            if (var11.field1131 == 1338) {
                                if (var11.method419(2663)) {
                                    class253.method1703(var11, var13, var15, var12, (byte) -101);
                                    class235.method1546(arg6, arg2, arg4, arg0);
                                }
                                continue;
                            }
                            if (var11.field1131 == 1339) {
                                if (var11.method419(2663)) {
                                    class97.method668(var15, var12, (byte) -123, var11, var13);
                                    class235.method1546(arg6, arg2, arg4, arg0);
                                }
                                continue;
                            }
                            if (var11.field1131 == 1400) {
                                class62.method405(var15, (byte) 51, var11.field1196, var11.field1215, var13);
                                class255.field4485[var12] = true;
                                class142.field2607[var12] = true;
                                class235.method1546(arg6, arg2, arg4, arg0);
                                continue;
                            }
                            if (var11.field1131 == 1401) {
                                class241.method1585(var15, var11.field1196, var11.field1215, var13, true);
                                class255.field4485[var12] = true;
                                class142.field2607[var12] = true;
                                class235.method1546(arg6, arg2, arg4, arg0);
                                continue;
                            }
                            if (var11.field1131 == 1402) {
                                class181.method1204(var15, var13, 95);
                                class255.field4485[var12] = true;
                                class142.field2607[var12] = true;
                                continue;
                            }
                            if (var11.field1131 == 1404) {
                                class68.method499((byte) -38, var15, class59.field1016, class176.field3103, var11.field1215, var11.field1196, var13, var11);
                                class255.field4485[var12] = true;
                                class142.field2607[var12] = true;
                                continue;
                            }
                            if (var11.field1131 == 1405) {
                                if (class15.field185) {
                                    int var26 = var11.field1215 + var13;
                                    int var27 = var15 + 15;
                                    class33.field501.method225(class212.method1372(2, new class66[] { class157.field2847, class144.method989(class194.field3357, 0) }), var26, var27, 16776960, -1);
                                    int var107 = var27 + 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = 16776960;
                                    if (var29 > 65536) {
                                        var30 = 16711680;
                                    }
                                    class33.field501.method225(class212.method1372(2, new class66[] { class87.field1706, class144.method989(var29, arg1 ^ 0xFFFFAB74), class51.field899 }), var26, var107, var30, -1);
                                    class255.field4485[var12] = true;
                                    var27 = var107 + 15;
                                    class142.field2607[var12] = true;
                                }
                                continue;
                            }
                        }
                        if (!class115.field2177) {
                            if (var11.field1219 == 0 && var11.field1239 && var20 <= class147.field2683 && var22 <= class29.field429 && var23 > class147.field2683 && var21 > class29.field429 && !class102.field1999) {
                                class43.field710[0] = 1004;
                                class25.field325[0] = class194.field3358;
                                class176.field3105 = 1;
                                class9.field96[0] = class85.field1679;
                            }
                            if (class147.field2683 >= var20 && class29.field429 >= var22 && var23 > class147.field2683 && class29.field429 < var21) {
                                class255.method1712(class147.field2683 - var13, var11, true, class29.field429 - var15);
                            }
                        }
                        if (var11.field1219 == 0) {
                            if (!var11.field1186 && client.method596(var11) && class158.field2850 != var11) {
                                continue;
                            }
                            if (!var11.field1186) {
                                if ((var11.field1117 - var11.field1196) < var11.field1141) {
                                    var11.field1141 = var11.field1117 - var11.field1196;
                                }
                                if (var11.field1141 < 0) {
                                    var11.field1141 = 0;
                                }
                            }
                            method372(var21, -21644, var22, arg3, var23, var12, var20, var15 - var11.field1141, var11.field1115, var13 - var11.field1170);
                            if (var11.field1092 != null) {
                                method372(var21, -21644, var22, var11.field1092, var23, var12, var20, var15 - var11.field1141, var11.field1115, var13 - var11.field1170);
                            }
                            class75 var31 = (class75) class230.field3981.method1381((long) var11.field1115, arg1 + 21602);
                            if (var31 != null) {
                                if (var31.field1489 == 0 && !class115.field2177 && var20 <= class147.field2683 && class29.field429 >= var22 && class147.field2683 < var23 && var21 > class29.field429 && !class102.field1999) {
                                    class43.field710[0] = 1004;
                                    class25.field325[0] = class194.field3358;
                                    class176.field3105 = 1;
                                    class9.field96[0] = class85.field1679;
                                }
                                class102.method703(var20, var22, var21, var15, var31.field1492, var12, var13, var23, (byte) -112);
                            }
                            class235.method1546(arg6, arg2, arg4, arg0);
                            class123.method845();
                        }
                        if (class36.field540[var12] || class26.field335 > 1) {
                            if (var11.field1219 == 0 && !var11.field1186 && var11.field1117 > var11.field1196) {
                                class8.method29(var15, var11.field1141, var11.field1117, var11.field1215 + var13, var11.field1196, (byte) -62);
                            }
                            if (var11.field1219 != 1) {
                                if (var11.field1219 == 2) {
                                    int var32 = 0;
                                    for (int var33 = 0; var33 < var11.field1222; var33++) {
                                        for (int var34 = 0; var34 < var11.field1096; var34++) {
                                            int var35 = (var11.field1169 + 32) * var33 + var15;
                                            int var36 = (var11.field1208 + 32) * var34 + var13;
                                            if (var32 < 20) {
                                                var36 += var11.field1149[var32];
                                                var35 += var11.field1090[var32];
                                            }
                                            if (var11.field1118[var32] > 0) {
                                                boolean var38 = false;
                                                boolean var39 = false;
                                                int var40 = var11.field1118[var32] - 1;
                                                if (arg6 < (var36 + 32) && var36 < arg4 && (var35 + 32) > arg2 && var35 < arg0 || class51.field902 == var11 && class198.field3422 == var32) {
                                                    class256 var41;
                                                    if (class188.field3259 == 1 && class45.field800 == var32 && class85.field1676 == var11.field1115) {
                                                        var41 = class103.method715(2, var11.field1097[var32], false, var40, 0, var11.field1108);
                                                    } else {
                                                        var41 = class103.method715(1, var11.field1097[var32], false, var40, 3153952, var11.field1108);
                                                    }
                                                    if (class123.field2311) {
                                                        class255.field4485[var12] = true;
                                                    }
                                                    if (var41 == null) {
                                                        class215.method1385(var11, -119);
                                                    } else if (class51.field902 == var11 && class198.field3422 == var32) {
                                                        int var42 = class170.field3021 - class78.field1541;
                                                        if (var42 < 5 && var42 > -5) {
                                                            var42 = 0;
                                                        }
                                                        int var43 = class50.field896 - class217.field3728;
                                                        if (var43 < 5 && var43 > -5) {
                                                            var43 = 0;
                                                        }
                                                        if (class68.field1360 < 5) {
                                                            var43 = 0;
                                                            var42 = 0;
                                                        }
                                                        var41.method981(var36 + var42, var35 + var43, 128);
                                                        if (arg8 != -1) {
                                                            class63 var44 = arg3[arg8 & 0xFFFF];
                                                            int var45 = class235.field4107;
                                                            int var46 = class235.field4106;
                                                            if (var46 > (var35 + var43) && var44.field1141 > 0) {
                                                                int var47 = (var46 - var35 - var43) * class193.field3347 / 3;
                                                                if (var47 > (class193.field3347 * 10)) {
                                                                    var47 = class193.field3347 * 10;
                                                                }
                                                                if (var44.field1141 < var47) {
                                                                    var47 = var44.field1141;
                                                                }
                                                                class217.field3728 += var47;
                                                                var44.field1141 -= var47;
                                                                class215.method1385(var44, -116);
                                                            }
                                                            if (var45 < (var43 + var35 + 32) && var44.field1141 < (var44.field1117 - var44.field1196)) {
                                                                int var48 = (var35 + var43 + 32 - var45) * class193.field3347 / 3;
                                                                if (var48 > (class193.field3347 * 10)) {
                                                                    var48 = class193.field3347 * 10;
                                                                }
                                                                if ((var44.field1117 - var44.field1141 - var44.field1196) < var48) {
                                                                    var48 = var44.field1117 - var44.field1196 - var44.field1141;
                                                                }
                                                                var44.field1141 += var48;
                                                                class217.field3728 -= var48;
                                                                class215.method1385(var44, -117);
                                                            }
                                                        }
                                                    } else if (class52.field927 == var11 && class251.field4419 == var32) {
                                                        var41.method981(var36, var35, 128);
                                                    } else {
                                                        var41.method980(var36, var35);
                                                    }
                                                }
                                            } else if (var11.field1164 != null && var32 < 20) {
                                                class256 var37 = var11.method421((byte) -40, var32);
                                                if (var37 != null) {
                                                    var37.method980(var36, var35);
                                                } else if (class200.field3455) {
                                                    class215.method1385(var11, arg1 + 21530);
                                                }
                                            }
                                            var32++;
                                        }
                                    }
                                } else if (var11.field1219 == 3) {
                                    int var49;
                                    if (method373(arg1 + 21644, var11)) {
                                        var49 = var11.field1185;
                                        if (class158.field2850 == var11 && var11.field1099 != 0) {
                                            var49 = var11.field1099;
                                        }
                                    } else {
                                        var49 = var11.field1155;
                                        if (class158.field2850 == var11 && var11.field1151 != 0) {
                                            var49 = var11.field1151;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field1189) {
                                            class235.method1558(var13, var15, var11.field1215, var11.field1196, var49);
                                        } else {
                                            class235.method1534(var13, var15, var11.field1215, var11.field1196, var49);
                                        }
                                    } else if (var11.field1189) {
                                        class235.method1554(var13, var15, var11.field1215, var11.field1196, var49, 256 - (var14 & 0xFF));
                                    } else {
                                        class235.method1552(var13, var15, var11.field1215, var11.field1196, var49, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field1219 == 4) {
                                    class39 var50 = var11.method427(-103, class249.field4400);
                                    if (var50 != null) {
                                        class66 var51 = var11.field1204;
                                        int var52;
                                        if (method373(arg1 ^ 0xFFFFAB74, var11)) {
                                            var52 = var11.field1185;
                                            if (class158.field2850 == var11 && var11.field1099 != 0) {
                                                var52 = var11.field1099;
                                            }
                                            if (var11.field1203.method460((byte) -111) > 0) {
                                                var51 = var11.field1203;
                                            }
                                        } else {
                                            var52 = var11.field1155;
                                            if (class158.field2850 == var11 && var11.field1151 != 0) {
                                                var52 = var11.field1151;
                                            }
                                        }
                                        if (var11.field1186 && var11.field1121 != -1) {
                                            class157 var53 = class40.method242(-25672, var11.field1121);
                                            var51 = var53.field2813;
                                            if (var51 == null) {
                                                var51 = class220.field3772;
                                            }
                                            if ((var53.field2832 == 1 || var11.field1238 != 1) && var11.field1238 != -1) {
                                                var51 = class212.method1372(2, new class66[] { class150.field2695, var51, class150.field2700, class188.method1239(var11.field1238, arg1 ^ 0x4054) });
                                            }
                                        }
                                        if (class264.field4629 == var11) {
                                            var52 = var11.field1155;
                                            var51 = class139.field2554;
                                        }
                                        if (!var11.field1186) {
                                            var51 = class153.method1045(var51, 27757, var11);
                                        }
                                        var50.method222(var51, var13, var15, var11.field1215, var11.field1196, var52, var11.field1084 ? 0 : -1, var11.field1100, var11.field1153, var11.field1112);
                                    } else if (class200.field3455) {
                                        class215.method1385(var11, -117);
                                    }
                                } else if (var11.field1219 == 5) {
                                    if (var11.field1186) {
                                        class256 var54;
                                        if (var11.field1121 == -1) {
                                            var54 = var11.method429(false, 20503);
                                        } else {
                                            var54 = class103.method715(var11.field1182, var11.field1238, false, var11.field1121, var11.field1229, var11.field1108);
                                        }
                                        if (var54 != null) {
                                            int var55 = var54.field4490;
                                            int var56 = var54.field4498;
                                            if (var11.field1150) {
                                                int var57 = (var11.field1215 + var55 - 1) / var55;
                                                int var58 = (var56 + var11.field1196 - 1) / var56;
                                                class235.method1545(var13, var15, var13 + var11.field1215, var11.field1196 + var15);
                                                for (int var59 = 0; var59 < var57; var59++) {
                                                    for (int var60 = 0; var60 < var58; var60++) {
                                                        if (var11.field1168 != 0) {
                                                            var54.method1713(var11.field1168, var56 * var60 + var15 + (var56 / 2), var55 / 2 + var55 * var59 + var13, 4096, (byte) 106);
                                                        } else if (var14 == 0) {
                                                            var54.method980(var55 * var59 + var13, var56 * var60 + var15);
                                                        } else {
                                                            var54.method981(var55 * var59 + var13, var56 * var60 + var15, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class235.method1546(arg6, arg2, arg4, arg0);
                                            } else {
                                                int var61 = var11.field1215 * 4096 / var55;
                                                if (var11.field1168 != 0) {
                                                    var54.method1713(var11.field1168, var11.field1196 / 2 + var15, var11.field1215 / 2 + var13, var61, (byte) 118);
                                                } else if (var14 != 0) {
                                                    var54.method978(var13, var15, var11.field1215, var11.field1196, 256 - (var14 & 0xFF));
                                                } else if (var11.field1215 == var55 && var11.field1196 == var56) {
                                                    var54.method980(var13, var15);
                                                } else {
                                                    var54.method1157(var13, var15, var11.field1215, var11.field1196);
                                                }
                                            }
                                        } else if (class200.field3455) {
                                            class215.method1385(var11, -127);
                                        }
                                    } else {
                                        class256 var62 = var11.method429(method373(0, var11), arg1 + 42147);
                                        if (var62 != null) {
                                            var62.method980(var13, var15);
                                        } else if (class200.field3455) {
                                            class215.method1385(var11, -121);
                                        }
                                    }
                                } else if (var11.field1219 == 6) {
                                    boolean var63 = method373(arg1 + 21644, var11);
                                    class262 var64 = null;
                                    int var65;
                                    if (var63) {
                                        var65 = var11.field1192;
                                    } else {
                                        var65 = var11.field1154;
                                    }
                                    int var66 = 0;
                                    if (var11.field1121 != -1) {
                                        class157 var71 = class40.method242(-25672, var11.field1121);
                                        if (var71 != null) {
                                            class157 var72 = var71.method1076(var11.field1238, -126);
                                            class224 var73 = var65 == -1 ? null : class47.method335((byte) -36, var65);
                                            var64 = var72.method1077(1, var73, var11.field1079, 13895);
                                            if (var64 == null) {
                                                class215.method1385(var11, -128);
                                            } else {
                                                var66 = -var64.method28() / 2;
                                            }
                                        }
                                    } else if (var11.field1188 == 5) {
                                        if (var11.field1126 == -1) {
                                            var64 = class120.field2270.method693(-1, (class224) null, -1, (class224) null, (byte) 99);
                                        } else {
                                            int var67 = var11.field1126 & 0x7FF;
                                            if (class49.field882 == var67) {
                                                var67 = 2047;
                                            }
                                            class45 var68 = class59.field988[var67];
                                            class224 var69 = var65 == -1 ? null : class47.method335((byte) -36, var65);
                                            if (var68 != null && ((int) var68.field815.method479(10908) << 11) == (var11.field1126 & 0xFFFFF800)) {
                                                var64 = var68.field811.method693(var11.field1079, var69, 0, (class224) null, (byte) 46);
                                            }
                                        }
                                    } else if (var65 == -1) {
                                        var64 = var11.method428(-1, var63, (byte) -27, class207.field3595.field811, (class224) null);
                                        if (var64 == null && class200.field3455) {
                                            class215.method1385(var11, -128);
                                        }
                                    } else {
                                        class224 var70 = class47.method335((byte) -36, var65);
                                        var64 = var11.method428(var11.field1079, var63, (byte) -27, class207.field3595.field811, var70);
                                        if (var64 == null && class200.field3455) {
                                            class215.method1385(var11, -115);
                                        }
                                    }
                                    if (var64 != null) {
                                        int var74;
                                        if (var11.field1116 <= 0) {
                                            var74 = 256;
                                        } else {
                                            var74 = (var11.field1215 << 8) / var11.field1116;
                                        }
                                        int var75;
                                        if (var11.field1206 > 0) {
                                            var75 = (var11.field1196 << 8) / var11.field1206;
                                        } else {
                                            var75 = 256;
                                        }
                                        int var76 = (var11.field1139 * var75 >> 8) + var11.field1196 / 2 + var15;
                                        int var77 = (var11.field1180 * var74 >> 8) + var11.field1215 / 2 + var13;
                                        class123.method836(var77, var76);
                                        int var78 = class123.field2314[var11.field1187] * var11.field1085 >> 16;
                                        int var79 = class123.field2326[var11.field1187] * var11.field1085 >> 16;
                                        if (!var11.field1186) {
                                            var64.method1462(0, var11.field1137, 0, var11.field1187, 0, var78, var79);
                                        } else if (var11.field1136) {
                                            ((class229) var64).method1465(0, var11.field1137, var11.field1176, var11.field1187, var11.field1104, var66 + var11.field1165 + var78, var11.field1165 + var79, var11.field1085);
                                        } else {
                                            var64.method1462(0, var11.field1137, var11.field1176, var11.field1187, var11.field1104, var11.field1165 + var78 + var66, var79 - -var11.field1165);
                                        }
                                        class123.method853();
                                    }
                                } else {
                                    if (var11.field1219 == 7) {
                                        class39 var80 = var11.method427(-92, class249.field4400);
                                        if (var80 == null) {
                                            if (class200.field3455) {
                                                class215.method1385(var11, -116);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var11.field1222; var82++) {
                                            for (int var83 = 0; var83 < var11.field1096; var83++) {
                                                if (var11.field1118[var81] > 0) {
                                                    class157 var84 = class40.method242(arg1 - 4028, var11.field1118[var81] - 1);
                                                    class66 var85;
                                                    if (var84.field2832 != 1 && var11.field1097[var81] == 1) {
                                                        var85 = class212.method1372(2, new class66[] { class150.field2695, var84.field2813, class66.field1320 });
                                                    } else {
                                                        var85 = class212.method1372(2, new class66[] { class150.field2695, var84.field2813, class150.field2700, class188.method1239(var11.field1097[var81], -5344) });
                                                    }
                                                    int var86 = (var11.field1208 + 115) * var83 + var13;
                                                    int var87 = var15 + ((var11.field1169 + 12) * var82);
                                                    if (var11.field1100 == 0) {
                                                        var80.method233(var85, var86, var87, var11.field1155, var11.field1084 ? 0 : -1);
                                                    } else if (var11.field1100 == 1) {
                                                        var80.method235(var85, var86 + 57, var87, var11.field1155, var11.field1084 ? 0 : -1);
                                                    } else {
                                                        var80.method225(var85, var86 + 115 - 1, var87, var11.field1155, var11.field1084 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var11.field1219 == 8 && class255.field4484 == var11 && class78.field1548 == class172.field3042) {
                                        int var88 = 0;
                                        int var89 = 0;
                                        class39 var90 = class33.field501;
                                        class66 var91 = var11.field1204;
                                        class66 var92 = class153.method1045(var91, arg1 + 49401, var11);
                                        while (var92.method460((byte) -117) > 0) {
                                            int var100 = var92.method465(61, class143.field2616);
                                            class66 var101;
                                            if (var100 == -1) {
                                                var101 = var92;
                                                var92 = class85.field1679;
                                            } else {
                                                var101 = var92.method477(0, (byte) -74, var100);
                                                var92 = var92.method485(var100 + 4, true);
                                            }
                                            int var102 = var90.method232(var101);
                                            if (var102 > var88) {
                                                var88 = var102;
                                            }
                                            var89 += var90.field579 + 1;
                                        }
                                        var88 += 6;
                                        var89 += 7;
                                        int var93 = var13 + var11.field1215 - var88 - 5;
                                        int var94 = var15 - (-var11.field1196 - 5);
                                        if (arg0 < (var89 + var94)) {
                                            var94 = arg0 - var89;
                                        }
                                        if (var93 < var13 + 5) {
                                            var93 = var13 + 5;
                                        }
                                        if ((var88 + var93) > arg4) {
                                            var93 = arg4 - var88;
                                        }
                                        class235.method1558(var93, var94, var88, var89, 16777120);
                                        class235.method1534(var93, var94, var88, var89, 0);
                                        class66 var95 = var11.field1204;
                                        int var96 = var94 + var90.field579 + 2;
                                        class66 var97 = class153.method1045(var95, 27757, var11);
                                        while (var97.method460((byte) -102) > 0) {
                                            int var98 = var97.method465(92, class143.field2616);
                                            class66 var99;
                                            if (var98 == -1) {
                                                var99 = var97;
                                                var97 = class85.field1679;
                                            } else {
                                                var99 = var97.method477(0, (byte) -74, var98);
                                                var97 = var97.method485(var98 + 4, true);
                                            }
                                            var90.method233(var99, var93 + 3, var96, 0, -1);
                                            var96 += var90.field579 + 1;
                                        }
                                    }
                                    if (var11.field1219 == 9) {
                                        int var103;
                                        int var104;
                                        int var105;
                                        int var106;
                                        if (var11.field1217) {
                                            var103 = var15;
                                            var104 = var13;
                                            var105 = var13 + var11.field1215;
                                            var106 = var11.field1196 + var15;
                                        } else {
                                            var104 = var13;
                                            var103 = var11.field1196 + var15;
                                            var106 = var15;
                                            var105 = var11.field1215 + var13;
                                        }
                                        if (var11.field1145 == 1) {
                                            class235.method1536(var104, var106, var105, var103, var11.field1155);
                                        } else {
                                            class235.method1548(var104, var106, var105, var103, var11.field1155, var11.field1145);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILha;)Z")
    public static final boolean method373(int arg0, class63 arg1) {
        field955++;
        if (arg1.field1119 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < arg1.field1119.length; var2++) {
            int var3 = class175.method1178(var2, arg0 + 20, arg1);
            int var4 = arg1.field1114[var2];
            if (arg1.field1119[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field1119[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field1119[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public static final void method374(byte arg0) {
        field958++;
        class63.field1241.method1613((byte) 94);
        if (arg0 >= -45) {
            method370(7, 117, -119);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(III)I")
    public static final int method375(int arg0, int arg1, int arg2) {
        if (arg2 != 16) {
            method370(124, 106, 95);
        }
        field959++;
        int var3 = class93.method644(133988164, arg1 - 1, arg0 + -1) + class93.method644(133988164, arg1 - 1, arg0 + 1) - (-class93.method644(133988164, arg1 - -1, arg0 + -1) - class93.method644(133988164, arg1 + 1, arg0 - -1));
        int var4 = class93.method644(133988164, arg1, arg0 - 1) + class93.method644(133988164, arg1, arg0 + 1) + (class93.method644(133988164, arg1 + -1, arg0) - -class93.method644(arg2 ^ 0x7FC7F54, arg1 + 1, arg0));
        int var5 = class93.method644(133988164, arg1, arg0);
        return var4 / 8 + (var3 / 16 + (var5 / 4));
    }
}
