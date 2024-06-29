import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class172 extends class295 {

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "Lbi;")
    public static class139 field2517 = null;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "I")
    public static int field2520 = 0;

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field2523 = new String[200];

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "[I")
    public static int[] field2522;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(B)I")
    public static final int method1281(byte arg0) {
        if (arg0 != 4) {
            field2520 = 40;
        }
        field2518++;
        return 6;
    }

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "(B)Z")
    public abstract boolean method1081(byte arg0);

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "(B)V")
    public static void method1282(byte arg0) {
        field2522 = null;
        field2517 = null;
        field2523 = null;
        if (arg0 != 93) {
            field2517 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1080(int arg0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lsa;Lpe;[[II[[BB[[BIZ[[B[[BLsa;I)V")
    public static final void method1283(class411 arg0, class391 arg1, int[][] arg2, int arg3, byte[][] arg4, byte arg5, byte[][] arg6, int arg7, boolean arg8, byte[][] arg9, byte[][] arg10, class411 arg11, int arg12) {
        for (int var13 = 0; var13 < arg12; var13++) {
            int var14 = (arg12 - 1) > var13 ? var13 + 1 : var13;
            for (int var15 = 0; var15 < arg3; var15++) {
                int var16 = var15 < (arg3 - 1) ? var15 + 1 : var15;
                if (class339.method2153(9) || class113.method921(var13, var15, arg7, class329.field4471, false)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = arg6[var13][var15];
                    int var21 = arg4[var13][var15];
                    int var22 = arg9[var13][var15] & 0xFF;
                    int var23 = arg10[var13][var15] & 0xFF;
                    int var24 = arg10[var13][var16] & 0xFF;
                    int var25 = arg10[var14][var16] & 0xFF;
                    int var26 = arg10[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class36 var27 = var22 == 0 ? null : class382.method2374(var22 - 1, -103);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class101 var28 = var23 == 0 ? null : class447.method2790(var23 - 1, arg5 ^ 0xFFFFFFF0);
                        class36 var29 = var27;
                        if (var27 != null) {
                            if (var27.field550 == -1 && var27.field564 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field559;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && var13 < arg12 && var15 < arg3) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var31 + (arg10[var14][var15 - 1] == var23 ? 1 : -1);
                            int var34 = var32 + (arg10[var14][var16] == var23 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var30 + (arg10[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            if (arg10[var13][var15 - 1] == var23) {
                                var36++;
                                var33++;
                            } else {
                                var36--;
                                var33--;
                            }
                            int var37 = var35 + (arg10[var13 - 1][var16] == var23 ? 1 : -1);
                            if (arg10[var14][var15] == var23) {
                                var34++;
                                var33++;
                            } else {
                                var33--;
                                var34--;
                            }
                            if (arg10[var13][var16] == var23) {
                                var37++;
                                var34++;
                            } else {
                                var37--;
                                var34--;
                            }
                            if (arg10[var13 - 1][var15] == var23) {
                                var36++;
                                var37++;
                            } else {
                                var37--;
                                var36--;
                            }
                            int var38 = var36 - var34;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var33 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg0.method1509(var13, var15) - arg0.method1509(var14, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                var39 = arg0.method1509(var14, var15) - arg0.method1509(var13, var16);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var39 > var38 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class23.field416[var40] = -1;
                            class416.field5827[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field559 ? class450.field6510[var20] : class408.field5719[var20];
                        class295.method1901(arg12, arg6, var27, var13, var20, arg9, arg3, (byte) -22, var21, arg1, var19, var15, arg4, var28);
                        boolean var42 = var27 != null && var27.field564 != var27.field550;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class23.field416[var43] >= 0 && class75.field1124[var43] != class27.field479[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class185.method1348(var19[1], class323.method2059(class416.field5827[4], class416.field5827[2]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class185.method1348(var19[3], class323.method2059(class416.field5827[0], class416.field5827[6]) == 0);
                        }
                        if (!var41[-(-var21) & 0x3]) {
                            var19[0] = class185.method1348(var19[0], class323.method2059(class416.field5827[0], class416.field5827[2]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class185.method1348(var19[2], class323.method2059(class416.field5827[6], class416.field5827[4]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var19[0] = var19[3] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 0;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var21 = 3;
                                var19[0] = var19[1] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var19[1] = var19[2] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 2;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var21 = 1;
                                var19[2] = var19[3] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        int var50;
                        if (var44) {
                            var48 = var28 == null ? 0 : class442.field6368[var20];
                            var46 = class209.field2898[var20];
                            var49 = class417.field5845[var20];
                            var50 = var27 == null ? 0 : class126.field1757[var20];
                            var47 = class334.field4528[var20];
                        } else if (var18) {
                            var46 = class277.field3736[var20];
                            var47 = class356.field4849[var20];
                            var45 = class29.field494[var20];
                            var48 = var28 == null ? 0 : class381.field5344[var20];
                            var49 = class189.field2724[var20];
                            var50 = var27 == null ? 0 : class35.field534[var20];
                        } else {
                            var49 = class148.field2267[var20];
                            var45 = class135.field1929[var20];
                            var47 = class170.field2510[var20];
                            var48 = var28 == null ? 0 : class60.field942[var20];
                            var50 = var27 == null ? 0 : class200.field2855[var20];
                            var46 = class430.field6125[var20];
                        }
                        int var51 = var48 + var50;
                        if (var51 <= 0) {
                            class263.method1695(arg7, var13, var15);
                        } else {
                            if (var19[0]) {
                                var51++;
                            }
                            if (var19[2]) {
                                var51++;
                            }
                            if (var19[1]) {
                                var51++;
                            }
                            if (var19[3]) {
                                var51++;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = arg8 ? new int[var54] : null;
                            int[] var56 = var42 ? new int[var54] : null;
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = new int[var54];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var27 != null) {
                                var62 = var27.field550;
                                var63 = arg1.method172() ? var27.field546 : var27.field549;
                                var64 = var27.field555;
                                int var65 = class156.method1194(var27, 110, arg1);
                                for (int var66 = 0; var66 < var50; var66++) {
                                    boolean var92 = false;
                                    byte var93;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class372.field5160[0] = var47[var52];
                                        class372.field5160[1] = 1;
                                        class372.field5160[2] = var46[var52];
                                        class372.field5160[3] = 1;
                                        class372.field5160[4] = var49[var52];
                                        class372.field5160[5] = var46[var52];
                                        var93 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class372.field5160[0] = var47[var52];
                                        class372.field5160[1] = 5;
                                        class372.field5160[2] = var46[var52];
                                        class372.field5160[3] = 5;
                                        class372.field5160[4] = var49[var52];
                                        var93 = 6;
                                        class372.field5160[5] = var46[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class372.field5160[0] = var47[var52];
                                        class372.field5160[1] = 3;
                                        class372.field5160[2] = var46[var52];
                                        class372.field5160[3] = 3;
                                        class372.field5160[4] = var49[var52];
                                        var93 = 6;
                                        class372.field5160[5] = var46[var52];
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class372.field5160[0] = var47[var52];
                                        class372.field5160[1] = 7;
                                        class372.field5160[2] = var46[var52];
                                        class372.field5160[3] = 7;
                                        class372.field5160[4] = var49[var52];
                                        class372.field5160[5] = var46[var52];
                                        var93 = 6;
                                    } else {
                                        class372.field5160[0] = var47[var52];
                                        class372.field5160[1] = var49[var52];
                                        class372.field5160[2] = var46[var52];
                                        var93 = 3;
                                    }
                                    for (int var94 = 0; var94 < var93; var94++) {
                                        int var95 = class372.field5160[var94];
                                        int var96 = var95 - (var21 * 2) & 0x7;
                                        int var97 = class438.field6279[var95];
                                        int var98 = class68.field1027[var95];
                                        if (var21 == 1) {
                                            var57[var53] = var98;
                                            var58[var53] = 128 - var97;
                                        } else if (var21 == 2) {
                                            var57[var53] = 128 - var97;
                                            var58[var53] = 128 - var98;
                                        } else if (var21 == 3) {
                                            var57[var53] = 128 - var98;
                                            var58[var53] = var97;
                                        } else {
                                            var57[var53] = var97;
                                            var58[var53] = var98;
                                        }
                                        if (arg8 && class291.field3947[var20][var95]) {
                                            int var99 = (var13 << 7) + var57[var53];
                                            int var100 = (var15 << 7) + var58[var53];
                                            var55[var53] = arg11.method1515(var99, var100) - arg0.method1515(var99, var100);
                                        }
                                        if (var95 < 8 && class23.field416[var96] > var27.field560) {
                                            if (var56 != null) {
                                                var56[var53] = class27.field479[var96];
                                            }
                                            var61[var53] = class283.field3784[var96];
                                            var60[var53] = class224.field3105[var96];
                                            var59[var53] = class75.field1124[var96];
                                        } else {
                                            if (var56 != null) {
                                                var56[var53] = var65;
                                            }
                                            var60[var53] = arg1.method172() ? var27.field546 : var27.field549;
                                            var61[var53] = var27.field555;
                                            var59[var53] = var62;
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (!arg8 && arg7 == 0) {
                                    class150.method1147(var13, var15, var27.field563, var27.field554 * 8);
                                }
                                if (var20 != 12 && var27.field550 != -1 && var27.field545) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class126.field1757[var20];
                            } else if (var18) {
                                var52 += class35.field534[var20];
                            } else {
                                var52 += class200.field2855[var20];
                            }
                            if (var28 != null) {
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                class101 var67 = class447.method2790(var23 - 1, -126);
                                class101 var68 = class447.method2790(var24 - 1, -122);
                                class101 var69 = class447.method2790(var25 - 1, -124);
                                class101 var70 = class447.method2790(var26 - 1, -109);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class372.field5160[0] = var47[var52];
                                        class372.field5160[1] = 1;
                                        class372.field5160[2] = var46[var52];
                                        class372.field5160[3] = 1;
                                        class372.field5160[4] = var49[var52];
                                        class372.field5160[5] = var46[var52];
                                        var73 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class372.field5160[0] = var47[var52];
                                        class372.field5160[1] = 5;
                                        class372.field5160[2] = var46[var52];
                                        class372.field5160[3] = 5;
                                        class372.field5160[4] = var49[var52];
                                        var73 = 6;
                                        class372.field5160[5] = var46[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class372.field5160[0] = var47[var52];
                                        class372.field5160[1] = 3;
                                        class372.field5160[2] = var46[var52];
                                        class372.field5160[3] = 3;
                                        class372.field5160[4] = var49[var52];
                                        class372.field5160[5] = var46[var52];
                                        var73 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class372.field5160[0] = var47[var52];
                                        class372.field5160[1] = 7;
                                        class372.field5160[2] = var46[var52];
                                        class372.field5160[3] = 7;
                                        class372.field5160[4] = var49[var52];
                                        class372.field5160[5] = var46[var52];
                                        var73 = 6;
                                    } else {
                                        class372.field5160[0] = var47[var52];
                                        class372.field5160[1] = var49[var52];
                                        class372.field5160[2] = var46[var52];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class372.field5160[var74];
                                        int var76 = var75 - (var21 * 2) & 0x7;
                                        int var77 = class438.field6279[var75];
                                        int var78 = class68.field1027[var75];
                                        int var79;
                                        int var80;
                                        if (var21 == 1) {
                                            var79 = var78;
                                            var80 = 128 - var77;
                                        } else if (var21 == 2) {
                                            var79 = 128 - var77;
                                            var80 = 128 - var78;
                                        } else if (var21 == 3) {
                                            var79 = 128 - var78;
                                            var80 = var77;
                                        } else {
                                            var79 = var77;
                                            var80 = var78;
                                        }
                                        var57[var53] = var79;
                                        var58[var53] = var80;
                                        if (arg8 && class291.field3947[var20][var75]) {
                                            int var81 = (var13 << 7) + var79;
                                            int var82 = (var15 << 7) + var80;
                                            var55[var53] = arg11.method1515(var81, var82) - arg0.method1515(var81, var82);
                                        }
                                        if (var75 < 8 && class23.field416[var76] >= 0) {
                                            if (var56 != null) {
                                                var56[var53] = class27.field479[var76];
                                            }
                                            var61[var53] = class283.field3784[var76];
                                            var60[var53] = class224.field3105[var76];
                                            var59[var53] = class75.field1124[var76];
                                        } else {
                                            if (var18 && class291.field3947[var20][var75]) {
                                                var60[var53] = var63;
                                                var61[var53] = var64;
                                                var59[var53] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var59[var53] = arg2[var13][var15];
                                                var60[var53] = var67.field1503;
                                                var61[var53] = var67.field1495;
                                            } else if (var79 == 0 && var80 == 128) {
                                                var59[var53] = arg2[var13][var16];
                                                var60[var53] = var68.field1503;
                                                var61[var53] = var68.field1495;
                                            } else if (var79 == 128 && var80 == 128) {
                                                var59[var53] = arg2[var14][var16];
                                                var60[var53] = var69.field1503;
                                                var61[var53] = var69.field1495;
                                            } else if (var79 == 128 && var80 == 0) {
                                                var59[var53] = arg2[var14][var15];
                                                var60[var53] = var70.field1503;
                                                var61[var53] = var70.field1495;
                                            } else {
                                                if (var79 >= 64) {
                                                    if (var80 >= 64) {
                                                        var60[var53] = var69.field1503;
                                                        var61[var53] = var69.field1495;
                                                    } else {
                                                        var60[var53] = var70.field1503;
                                                        var61[var53] = var70.field1495;
                                                    }
                                                } else if (var80 < 64) {
                                                    var60[var53] = var67.field1503;
                                                    var61[var53] = var67.field1495;
                                                } else {
                                                    var60[var53] = var68.field1503;
                                                    var61[var53] = var68.field1495;
                                                }
                                                int var83 = class377.method2350(var79 << 7 >> 7, 32419, arg2[var13][var15], arg2[var14][var15]);
                                                int var84 = class377.method2350(var79 << 7 >> 7, 32419, arg2[var13][var16], arg2[var14][var16]);
                                                var59[var53] = class377.method2350(var80 << 7 >> 7, 32419, var83, var84);
                                            }
                                            if (var56 != null) {
                                                var56[var53] = var59[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (var20 != 0 && var28.field1496) {
                                    var17 = true;
                                }
                            }
                            int var85 = arg0.method1509(var13, var15);
                            int var86 = arg0.method1509(var14, var15);
                            int var87 = arg0.method1509(var14, var16);
                            int var88 = arg0.method1509(var13, var16);
                            if (arg7 > 0) {
                                boolean var89 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var89 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field553) {
                                    var89 = false;
                                }
                                if (var89 && var85 == var86 && var85 == var87 && var85 == var88) {
                                    class277.field3734[arg7][var13][var15] = (byte) class260.method1678(class277.field3734[arg7][var13][var15], 4);
                                }
                            }
                            int var90 = 0;
                            int var91 = 0;
                            if (arg8) {
                                var90 = class276.method1768(var13, var15);
                                var91 = class68.method591(var13, var15);
                            }
                            arg0.method1505(var13, var15, var57, var55, var58, var59, var56, var60, var61, var90, var91, var17);
                            class263.method1695(arg7, var13, var15);
                        }
                    }
                }
            }
        }
        if (arg5 == 96) {
            field2521++;
        }
    }
}
