import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class86 extends Canvas {

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field2068;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "Lja;")
    public static class62 field2057 = class30.method243(43, "<col=ffb000>");

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lhe;")
    public static class54 field2059 = null;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "[Lja;")
    public static class62[] field2061 = new class62[1000];

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static volatile int field2062 = 0;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field2060 = 0;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "Lja;")
    public static class62 field2071 = class30.method243(43, "(Y<)4col>");

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Lpd;")
    public static class108 field2055;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Lmf;")
    public static class89 field2067;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)Lmf;")
    public static final class89 method664(int arg0) {
        int var1 = 117 / ((39 - arg0) / 42);
        field2065++;
        class89 var2 = new class89(class143.field3335, class23.field539, class17.field395, class136.field3146, class82.field1986);
        class142.method1125(2157);
        return var2;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lpd;II)Lnd;")
    public static final class94 method665(class108 arg0, int arg1, int arg2) {
        field2064++;
        if (arg2 != -508) {
            method668(-103);
        }
        byte[] var3 = arg0.method878(-1, arg1);
        return var3 == null ? null : new class94(var3);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III[Lhe;IIIIII)V")
    public static final void method666(int arg0, int arg1, int arg2, class54[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2058++;
        class19.method141(arg6, arg5, arg9, arg8);
        class66.method525();
        if (arg2 != -1) {
            method668(-123);
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class54 var11 = arg3[var10];
            if (var11 != null && (var11.field1234 == arg7 || arg7 == -1412584499 && class150.field3540 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class13.field313[class102.field2371] = var11.field1317 + arg0;
                    class34.field824[class102.field2371] = var11.field1237 + arg1;
                    class130.field2979[class102.field2371] = var11.field1316;
                    class111.field2558[class102.field2371] = var11.field1345;
                    var12 = class102.field2371++;
                } else {
                    var12 = arg4;
                }
                var11.field1327 = field2060;
                var11.field1268 = var12;
                if (!var11.field1322 || !method667((byte) -40, var11)) {
                    if (var11.field1311 > 0) {
                        class17.method119(true, var11);
                    }
                    int var13 = var11.field1237 + arg1;
                    int var14 = var11.field1317 + arg0;
                    int var15 = var11.field1245;
                    if (class150.field3540 == var11) {
                        if (arg7 != -1412584499 && !var11.field1288) {
                            class113.field2611 = arg3;
                            class102.field2376 = arg0;
                            class30.field740 = arg1;
                            continue;
                        }
                        if (!var11.field1288) {
                            var15 = 128;
                        }
                        if (class15.field339 && class70.field1786) {
                            int var16 = class103.field2398;
                            int var17 = var16 - class67.field1666;
                            int var18 = class84.field2032;
                            if (class137.field3166 > var17) {
                                var17 = class137.field3166;
                            }
                            if (class137.field3166 + field2059.field1316 < var11.field1316 + var17) {
                                var17 = class137.field3166 + field2059.field1316 - var11.field1316;
                            }
                            var14 = var17;
                            int var19 = var18 - class93.field2175;
                            if (class1.field1 > var19) {
                                var19 = class1.field1;
                            }
                            if (var11.field1345 + var19 > class1.field1 + field2059.field1345) {
                                var19 = field2059.field1345 + class1.field1 - var11.field1345;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field1279 == 2) {
                        var20 = arg6;
                        var21 = arg9;
                        var22 = arg8;
                        var23 = arg5;
                    } else if (var11.field1279 == 9) {
                        int var26 = var14;
                        int var27 = var13;
                        int var28 = var11.field1316 + var14;
                        int var29 = var11.field1345 + var13;
                        if (var14 > var28) {
                            var26 = var28;
                            var28 = var14;
                        }
                        var20 = var26 <= arg6 ? arg6 : var26;
                        var28++;
                        var21 = var28 < arg9 ? var28 : arg9;
                        if (var29 < var13) {
                            var27 = var29;
                            var29 = var13;
                        }
                        var29++;
                        var22 = var29 < arg8 ? var29 : arg8;
                        var23 = var27 > arg5 ? var27 : arg5;
                    } else {
                        var20 = var14 > arg6 ? var14 : arg6;
                        var23 = arg5 < var13 ? var13 : arg5;
                        int var24 = var11.field1316 + var14;
                        int var25 = var11.field1345 + var13;
                        var22 = arg8 > var25 ? var25 : arg8;
                        var21 = var24 < arg9 ? var24 : arg9;
                    }
                    if (!var11.field1322 || var21 > var20 && var23 < var22) {
                        if (var11.field1311 != 0) {
                            if (var11.field1311 == 1337) {
                                class26.field614 = var13;
                                class120.field2741 = var14;
                                class120.method960(var14, var11.field1316, true, var11.field1345, var13);
                                class19.method141(arg6, arg5, arg9, arg8);
                                continue;
                            }
                            if (var11.field1311 == 1338) {
                                class80.method631(var14, var12, -128, var13);
                                class19.method141(arg6, arg5, arg9, arg8);
                                continue;
                            }
                        }
                        int var32 = class103.field2398;
                        int var33 = class84.field2032;
                        if (!class119.field2709 && var20 <= var32 && var23 <= var33 && var32 < var21 && var22 > var33) {
                            class131.method1057((byte) 126, var11, var32 - var14, var33 - var13);
                        }
                        if (var11.field1279 == 0) {
                            if (!var11.field1322 && method667((byte) -55, var11) && class100.field2323 != var11) {
                                continue;
                            }
                            if (!var11.field1322) {
                                if (var11.field1328 - var11.field1345 < var11.field1262) {
                                    var11.field1262 = var11.field1328 - var11.field1345;
                                }
                                if (var11.field1262 < 0) {
                                    var11.field1262 = 0;
                                }
                            }
                            method666(var14 - var11.field1303, -var11.field1262 + var13, -1, arg3, var12, var23, var20, var11.field1291, var22, var21);
                            if (var11.field1325 != null) {
                                method666(var14 - var11.field1303, var13 - var11.field1262, -1, var11.field1325, var12, var23, var20, var11.field1291, var22, var21);
                            }
                            class81 var34 = (class81) class16.field372.method537(arg2, (long) var11.field1291);
                            if (var34 != null) {
                                if (var34.field1955 == 0 && var20 <= class103.field2398 && class84.field2032 >= var23 && class103.field2398 < var21 && var22 > class84.field2032 && !class119.field2709 && !class77.field1900) {
                                    class146.field3437[0] = 1007;
                                    class128.field2889 = 1;
                                    class53.field1226[0] = class70.field1782;
                                    class60.field1479[0] = class83.field1991;
                                }
                                class27.method213(-127, var22, var23, var12, var20, var21, var14, var13, var34.field1963);
                            }
                            class19.method141(arg6, arg5, arg9, arg8);
                            class66.method525();
                        }
                        if (class121.field2769[var12] || class1.field11 > 1) {
                            if (var11.field1279 == 0 && !var11.field1322 && var11.field1328 > var11.field1345) {
                                class18.method124(var13, var11.field1262, var11.field1345, var11.field1328, var14 + var11.field1316, true);
                            }
                            if (var11.field1279 != 1) {
                                if (var11.field1279 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var11.field1345; var36++) {
                                        for (int var37 = 0; var37 < var11.field1316; var37++) {
                                            int var38 = (var11.field1240 + 32) * var37 + var14;
                                            int var39 = (var11.field1228 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var39 += var11.field1296[var35];
                                                var38 += var11.field1360[var35];
                                            }
                                            if (var11.field1304[var35] > 0) {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var11.field1304[var35] - 1;
                                                if (var38 + 32 > arg6 && arg9 > var38 && arg5 < var39 + 32 && arg8 > var39 || class71.field1812 == var11 && class148.field3496 == var35) {
                                                    class58 var44;
                                                    if (class68.field1692 == 1 && class40.field932 == var35 && class35.field842 == var11.field1291) {
                                                        var44 = class120.method956(var11.field1365[var35], 0, 2, false, false, var43);
                                                    } else {
                                                        var44 = class120.method956(var11.field1365[var35], 3153952, 1, false, false, var43);
                                                    }
                                                    if (var44 == null) {
                                                        client.method163(var11, -75);
                                                    } else if (class71.field1812 == var11 && class148.field3496 == var35) {
                                                        int var45 = class84.field2032 - class52.field1196;
                                                        int var46 = class103.field2398 - class130.field2964;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (class26.field620 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method400(var38 + var46, var39 + var45, 128);
                                                        if (arg7 != -1) {
                                                            class54 var47 = arg3[arg7 & 0xFFFF];
                                                            if (var39 + var45 < class19.field425 && var47.field1262 > 0) {
                                                                int var48 = (class19.field425 - var39 - var45) * class45.field1024 / 3;
                                                                if (class45.field1024 * 10 < var48) {
                                                                    var48 = class45.field1024 * 10;
                                                                }
                                                                if (var48 > var47.field1262) {
                                                                    var48 = var47.field1262;
                                                                }
                                                                var47.field1262 -= var48;
                                                                class52.field1196 += var48;
                                                                client.method163(var47, -74);
                                                            }
                                                            if (class19.field426 < var39 + var45 + 32 && var47.field1328 - var47.field1345 > var47.field1262) {
                                                                int var49 = (var39 + var45 + 32 - class19.field426) * class45.field1024 / 3;
                                                                if (class45.field1024 * 10 < var49) {
                                                                    var49 = class45.field1024 * 10;
                                                                }
                                                                if (var49 > var47.field1328 - var47.field1345 - var47.field1262) {
                                                                    var49 = var47.field1328 - var47.field1345 - var47.field1262;
                                                                }
                                                                class52.field1196 -= var49;
                                                                var47.field1262 += var49;
                                                                client.method163(var47, -71);
                                                            }
                                                        }
                                                    } else if (class28.field693 == var11 && class142.field3323 == var35) {
                                                        var44.method400(var38, var39, 128);
                                                    } else {
                                                        var44.method417(var38, var39);
                                                    }
                                                }
                                            } else if (var11.field1340 != null && var35 < 20) {
                                                class58 var40 = var11.method371(var35, 108);
                                                if (var40 != null) {
                                                    var40.method417(var38, var39);
                                                } else if (client.field494) {
                                                    client.method163(var11, -83);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var11.field1279 == 3) {
                                    int var50;
                                    if (class68.method529((byte) 109, var11)) {
                                        var50 = var11.field1253;
                                        if (class100.field2323 == var11 && var11.field1361 != 0) {
                                            var50 = var11.field1361;
                                        }
                                    } else {
                                        var50 = var11.field1254;
                                        if (class100.field2323 == var11 && var11.field1330 != 0) {
                                            var50 = var11.field1330;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1318) {
                                            class19.method143(var14, var13, var11.field1316, var11.field1345, var50);
                                        } else {
                                            class19.method144(var14, var13, var11.field1316, var11.field1345, var50);
                                        }
                                    } else if (var11.field1318) {
                                        class19.method137(var14, var13, var11.field1316, var11.field1345, var50, 256 - (var15 & 0xFF));
                                    } else {
                                        class19.method131(var14, var13, var11.field1316, var11.field1345, var50, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1279 == 4) {
                                    class89 var51 = var11.method374(arg2 - 49);
                                    if (var51 != null) {
                                        class62 var52 = var11.field1284;
                                        int var53;
                                        if (class68.method529((byte) 108, var11)) {
                                            var53 = var11.field1253;
                                            if (class100.field2323 == var11 && var11.field1361 != 0) {
                                                var53 = var11.field1361;
                                            }
                                            if (var11.field1295.method460((byte) 38) > 0) {
                                                var52 = var11.field1295;
                                            }
                                        } else {
                                            var53 = var11.field1254;
                                            if (class100.field2323 == var11 && var11.field1330 != 0) {
                                                var53 = var11.field1330;
                                            }
                                        }
                                        if (var11.field1322 && var11.field1250 != -1) {
                                            class23 var54 = class140.method1114(var11.field1250, false);
                                            var52 = var54.field571;
                                            if (var52 == null) {
                                                var52 = class121.field2781;
                                            }
                                            if ((var54.field547 == 1 || var11.field1270 != 1) && var11.field1270 != -1) {
                                                var52 = class70.method594(new class62[] { class124.field2833, var52, class83.field2012, class148.method1174(var11.field1270, (byte) 100) }, 1229);
                                            }
                                        }
                                        if (class119.field2724 == var11) {
                                            var52 = class134.field3084;
                                            var53 = var11.field1254;
                                        }
                                        if (!var11.field1322) {
                                            var52 = class83.method649(arg2 ^ 0xFFFFFFFB, var52, var11);
                                        }
                                        var51.method677(var52, var14, var13, var11.field1316, var11.field1345, var53, var11.field1271 ? 0 : -1, var11.field1310, var11.field1305, var11.field1230);
                                    } else if (client.field494) {
                                        client.method163(var11, -73);
                                    }
                                } else if (var11.field1279 == 5) {
                                    if (var11.field1322) {
                                        class58 var56;
                                        if (var11.field1250 == -1) {
                                            var56 = var11.method364(false, (byte) -109);
                                        } else {
                                            var56 = class120.method956(var11.field1270, var11.field1363, var11.field1339, false, false, var11.field1250);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field1437;
                                            int var58 = var56.field1434;
                                            if (var11.field1263) {
                                                class19.method139(var14, var13, var11.field1316 + var14, var11.field1345 + var13);
                                                int var59 = (var11.field1316 + var57 - 1) / var57;
                                                int var60 = (var58 + var11.field1345 - 1) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var11.field1287 != 0) {
                                                            var56.method402(var57 / 2 + var57 * var61 + var14, var58 / 2 + var58 * var62 + var13, var11.field1287, 4096);
                                                        } else if (var15 == 0) {
                                                            var56.method417(var57 * var61 + var14, var58 * var62 + var13);
                                                        } else {
                                                            var56.method400(var14 + var57 * var61, var13 - -(var58 * var62), 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class19.method141(arg6, arg5, arg9, arg8);
                                            } else {
                                                int var63 = var11.field1316 * 4096 / var57;
                                                if (var11.field1287 != 0) {
                                                    var56.method402(var11.field1316 / 2 + var14, var11.field1345 / 2 + var13, var11.field1287, var63);
                                                } else if (var15 != 0) {
                                                    var56.method414(var14, var13, var11.field1316, var11.field1345, 256 - (var15 & 0xFF));
                                                } else if (var11.field1316 == var57 && var11.field1345 == var58) {
                                                    var56.method417(var14, var13);
                                                } else {
                                                    var56.method415(var14, var13, var11.field1316, var11.field1345);
                                                }
                                            }
                                        } else if (client.field494) {
                                            client.method163(var11, -92);
                                        }
                                    } else {
                                        class58 var55 = var11.method364(class68.method529((byte) -63, var11), (byte) -109);
                                        if (var55 != null) {
                                            var55.method417(var14, var13);
                                        } else if (client.field494) {
                                            client.method163(var11, arg2 - 104);
                                        }
                                    }
                                } else if (var11.field1279 == 6) {
                                    class145 var64 = null;
                                    int var65 = 0;
                                    boolean var66 = class68.method529((byte) -39, var11);
                                    int var67;
                                    if (var66) {
                                        var67 = var11.field1335;
                                    } else {
                                        var67 = var11.field1247;
                                    }
                                    if (var11.field1250 != -1) {
                                        class23 var69 = class140.method1114(var11.field1250, false);
                                        if (var69 != null) {
                                            class23 var70 = var69.method190(-54, var11.field1270);
                                            var64 = var70.method187(1, (byte) -5);
                                            if (var64 == null) {
                                                client.method163(var11, -99);
                                            } else {
                                                var64.method1163();
                                                var65 = var64.field3265 / 2;
                                            }
                                        }
                                    } else if (var11.field1235 == 5) {
                                        if (var11.field1324 == 0) {
                                            var64 = class67.field1670.method898((byte) -112, null, null, -1, -1);
                                        } else {
                                            var64 = class40.field936.method321((byte) 3);
                                        }
                                    } else if (var67 == -1) {
                                        var64 = var11.method368(var66, 97, null, -1, class40.field936.field2626);
                                        if (var64 == null && client.field494) {
                                            client.method163(var11, arg2 - 71);
                                        }
                                    } else {
                                        class12 var68 = class141.method1121(var67, -24732);
                                        var64 = var11.method368(var66, 119, var68, var11.field1348, class40.field936.field2626);
                                        if (var64 == null && client.field494) {
                                            client.method163(var11, -97);
                                        }
                                    }
                                    class66.method515(var11.field1316 / 2 + var14, var11.field1345 / 2 + var13);
                                    int var71 = class66.field1647[var11.field1267] * var11.field1312 >> 16;
                                    int var72 = class66.field1658[var11.field1267] * var11.field1312 >> 16;
                                    if (var64 != null) {
                                        if (var11.field1322) {
                                            var64.method1163();
                                            if (var11.field1315) {
                                                var64.method1144(0, var11.field1282, var11.field1266, var11.field1267, var11.field1313, var71 + var65 + var11.field1261, var72 - -var11.field1261, var11.field1312);
                                            } else {
                                                var64.method1158(0, var11.field1282, var11.field1266, var11.field1267, var11.field1313, var11.field1261 + var65 + var71, var11.field1261 + var72);
                                            }
                                        } else {
                                            var64.method1158(0, var11.field1282, 0, var11.field1267, 0, var71, var72);
                                        }
                                    }
                                    class66.method520();
                                } else {
                                    if (var11.field1279 == 7) {
                                        class89 var73 = var11.method374(-50);
                                        if (var73 == null) {
                                            if (client.field494) {
                                                client.method163(var11, -116);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var11.field1345; var75++) {
                                            for (int var76 = 0; var76 < var11.field1316; var76++) {
                                                if (var11.field1304[var74] > 0) {
                                                    class23 var77 = class140.method1114(var11.field1304[var74] - 1, false);
                                                    class62 var78 = var77.field571;
                                                    if (var78 == null) {
                                                        var78 = class121.field2781;
                                                    }
                                                    if (var77.field547 == 1 || var11.field1365[var74] != 1) {
                                                        var78 = class70.method594(new class62[] { class124.field2833, var78, class83.field2012, class148.method1174(var11.field1365[var74], (byte) 116) }, 1229);
                                                    }
                                                    int var79 = (var11.field1240 + 115) * var76 + var14;
                                                    int var80 = (var11.field1228 + 12) * var75 + var13;
                                                    if (var11.field1310 == 0) {
                                                        var73.method688(var78, var79, var80, var11.field1254, var11.field1271 ? 0 : -1);
                                                    } else if (var11.field1310 == 1) {
                                                        var73.method696(var78, var11.field1316 / 2 + var79, var80, var11.field1254, var11.field1271 ? 0 : -1);
                                                    } else {
                                                        var73.method699(var78, var11.field1316 + var79 - 1, var80, var11.field1254, var11.field1271 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var11.field1279 == 8 && class38.field882 == var11 && client.field508 == class60.field1477) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class62 var83 = var11.field1284;
                                        class89 var84 = field2067;
                                        class62 var85 = class83.method649(4, var83, var11);
                                        while (var85.method460((byte) 38) > 0) {
                                            int var93 = var85.method467(class79.field1931, (byte) -54);
                                            class62 var94;
                                            if (var93 == -1) {
                                                var94 = var85;
                                                var85 = class83.field1991;
                                            } else {
                                                var94 = var85.method445(var93, (byte) 36, 0);
                                                var85 = var85.method471((byte) -110, var93 + 4);
                                            }
                                            int var95 = var84.method681(var94);
                                            if (var81 < var95) {
                                                var81 = var95;
                                            }
                                            var82 += var84.field2122 + 1;
                                        }
                                        var82 += 7;
                                        var81 += 6;
                                        int var86 = var14 + var11.field1316 - var81 - 5;
                                        if (var86 < var14 + 5) {
                                            var86 = var14 + 5;
                                        }
                                        int var87 = var11.field1345 + var13 + 5;
                                        if (arg8 < var82 + var87) {
                                            var87 = arg8 - var82;
                                        }
                                        if (arg9 < var81 + var86) {
                                            var86 = arg9 - var81;
                                        }
                                        class19.method143(var86, var87, var81, var82, 16777120);
                                        class19.method144(var86, var87, var81, var82, 0);
                                        class62 var88 = var11.field1284;
                                        int var89 = var87 + var84.field2122 + 2;
                                        class62 var90 = class83.method649(4, var88, var11);
                                        while (var90.method460((byte) 38) > 0) {
                                            int var91 = var90.method467(class79.field1931, (byte) -77);
                                            class62 var92;
                                            if (var91 == -1) {
                                                var92 = var90;
                                                var90 = class83.field1991;
                                            } else {
                                                var92 = var90.method445(var91, (byte) -54, 0);
                                                var90 = var90.method471((byte) -110, var91 + 4);
                                            }
                                            var84.method688(var92, var86 + 3, var89, 0, -1);
                                            var89 += var84.field2122 + 1;
                                        }
                                    }
                                    if (var11.field1279 == 9) {
                                        if (var11.field1331 == 1) {
                                            class19.method132(var14, var13, var11.field1316 + var14, var11.field1345 + var13, var11.field1254);
                                        } else {
                                            int var96 = var11.field1316 < 0 ? -var11.field1316 : var11.field1316;
                                            int var97 = var11.field1345 >= 0 ? var11.field1345 : -var11.field1345;
                                            int var98 = var96;
                                            if (var96 < var97) {
                                                var98 = var97;
                                            }
                                            if (var98 != 0) {
                                                int var99 = (var11.field1316 << 16) / var98;
                                                int var100 = (var11.field1345 << 16) / var98;
                                                if (var100 > var99) {
                                                    var100 = -var100;
                                                } else {
                                                    var99 = -var99;
                                                }
                                                int var101 = var11.field1331 * var99 + 1 >> 17;
                                                int var102 = var11.field1331 * var99 >> 17;
                                                int var103 = var11.field1331 * var100 + 1 >> 17;
                                                int var104 = var13 + var102;
                                                int var105 = var13 - var101;
                                                int var106 = var11.field1331 * var100 >> 17;
                                                int var107 = var14 + var11.field1316 - var103;
                                                int var108 = var14 - var103;
                                                int var109 = var14 + var106;
                                                int var110 = var11.field1316 + var14 + var106;
                                                int var111 = var13 + var11.field1345 - var101;
                                                int var112 = var13 + var102 + var11.field1345;
                                                class66.method526(var109, var108, var107);
                                                class66.method517(var104, var105, var111, var109, var108, var107, var11.field1254);
                                                class66.method526(var109, var107, var110);
                                                class66.method517(var104, var111, var112, var109, var107, var110, var11.field1254);
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
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLhe;)Z")
    public static final boolean method667(byte arg0, class54 arg1) {
        field2063++;
        if (class77.field1900) {
            if (class22.method171(arg1, (byte) -106) != 0) {
                return false;
            }
            if (arg1.field1279 == 0) {
                return false;
            }
        }
        if (arg0 >= -39) {
            field2062 = 49;
        }
        return arg1.field1265;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
    public static void method668(int arg0) {
        if (arg0 <= 25) {
            field2060 = 92;
        }
        field2055 = null;
        field2059 = null;
        field2057 = null;
        field2071 = null;
        field2067 = null;
        field2061 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)I")
    public static final int method669(boolean arg0) {
        if (arg0) {
            field2059 = null;
        }
        field2072++;
        return 6;
    }

    @OriginalMember(owner = "client!m", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2068.paint(arg0);
        field2069++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)Lja;")
    public static final class62 method670(int arg0, int arg1) {
        field2054++;
        if (arg0 != 0) {
            field2071 = null;
        }
        return class70.method594(new class62[] { class31.method249(true, arg1 >> 24 & 0xFF), class48.field1121, class31.method249(true, arg1 >> 16 & 0xFF), class48.field1121, class31.method249(true, arg1 >> 8 & 0xFF), class48.field1121, class31.method249(true, arg1 & 0xFF) }, arg0 + 1229);
    }

    @OriginalMember(owner = "client!m", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2068.update(arg0);
        field2070++;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class86(Component arg0) {
        this.field2068 = arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method671(byte[] arg0, int arg1, boolean arg2) {
        field2056++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -13771) {
            method671(null, -54, true);
        }
        if (arg0.length > 136 && !class82.field1984) {
            try {
                class102 var3 = (class102) Class.forName("pc").getDeclaredConstructor().newInstance();
                var3.method823((byte) 103, arg0);
                return var3;
            } catch (Throwable var4) {
                class82.field1984 = true;
            }
        }
        return arg2 ? class102.method816(arg0, 59) : arg0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIB)I")
    public static final int method672(int arg0, int arg1, byte arg2) {
        if (arg2 <= 76) {
            field2061 = null;
        }
        field2053++;
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg1 - var3;
    }
}
