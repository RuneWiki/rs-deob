import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class245 extends class311 {

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "Ljava/lang/String;")
    public String field3460;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "S")
    public static short field3459 = 256;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "Lka;")
    public static class408 field3457 = new class408(64);

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(CI)C")
    public static final char method1594(char arg0, int arg1) {
        int var2 = -30 / ((-arg1 - 84) / 39);
        field3455++;
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII[[[BIILea;II)V")
    public static final void method1595(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int arg8, int arg9, class58 arg10, int arg11, int arg12) {
        field3461++;
        if (arg3 == 0 || arg4 == 0) {
            return;
        }
        if (arg3 == 9) {
            arg3 = 1;
            arg1 = arg1 + 1 & 0x3;
        }
        if (arg3 == 10) {
            arg1 = arg1 + 3 & 0x3;
            arg3 = 1;
        }
        if (arg8 <= 92) {
            field3459 = -15;
        }
        if (arg3 == 11) {
            arg3 = 8;
            arg1 = arg1 + 3 & 0x3;
        }
        arg10.method170(arg6, arg2, arg11, arg0, arg5, arg12, arg7[arg3 - 1][arg1], arg4, arg9);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([[B[[BI[[B[[I[[BLea;IBZLdn;Ldn;I)V")
    public static final void method1596(byte[][] arg0, byte[][] arg1, int arg2, byte[][] arg3, int[][] arg4, byte[][] arg5, class58 arg6, int arg7, byte arg8, boolean arg9, class323 arg10, class323 arg11, int arg12) {
        field3458++;
        if (arg8 != 2) {
            method1596((byte[][]) null, (byte[][]) null, -76, (byte[][]) null, (int[][]) null, (byte[][]) null, (class58) null, -124, (byte) -18, false, (class323) null, (class323) null, 78);
        }
        for (int var13 = 0; var13 < arg2; var13++) {
            int var14 = var13 >= arg2 - 1 ? var13 : var13 + 1;
            for (int var15 = 0; var15 < arg7; var15++) {
                int var16 = var15 >= arg7 - 1 ? var15 : var15 + 1;
                if (class397.method2461(arg8 - 71) || class227.method1483(-21801, arg12, var13, class367.field5096, var15)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = arg3[var13][var15];
                    int var21 = arg5[var13][var15];
                    int var22 = arg0[var13][var15] & 0xFF;
                    int var23 = arg1[var13][var15] & 0xFF;
                    int var24 = arg1[var13][var16] & 0xFF;
                    int var25 = arg1[var14][var16] & 0xFF;
                    int var26 = arg1[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class71 var27 = var22 == 0 ? null : class52.method422(var22 - 1, 7513);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class290 var28 = var23 == 0 ? null : class415.method2565(-1730, var23 - 1);
                        class71 var29 = var27;
                        if (var27 != null) {
                            if (var27.field995 == -1 && var27.field1000 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field988;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && var13 < arg2 && arg7 > var15) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var30 + (arg1[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var32 + (arg1[var14][var16] == var23 ? 1 : -1);
                            int var36 = var31 + (arg1[var14][var15 - 1] == var23 ? 1 : -1);
                            int var37 = var34 + (arg1[var13 - 1][var16] == var23 ? 1 : -1);
                            if (arg1[var13][var15 - 1] == var23) {
                                var33++;
                                var36++;
                            } else {
                                var36--;
                                var33--;
                            }
                            if (arg1[var14][var15] == var23) {
                                var35++;
                                var36++;
                            } else {
                                var35--;
                                var36--;
                            }
                            if (arg1[var13][var16] == var23) {
                                var35++;
                                var37++;
                            } else {
                                var35--;
                                var37--;
                            }
                            if (arg1[var13 - 1][var15] == var23) {
                                var33++;
                                var37++;
                            } else {
                                var37--;
                                var33--;
                            }
                            int var38 = var33 - var35;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var36 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg11.method329(var13, var15) - arg11.method329(var14, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                var39 = arg11.method329(var14, var15) - arg11.method329(var13, var16);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var39 <= var38 ? 0 : 1;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class134.field1999[var40] = -1;
                            class29.field403[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field988 ? class203.field2890[var20] : class106.field1485[var20];
                        class194.method1345((byte) 49, var21, var13, arg0, arg3, var19, var28, arg5, var15, arg2, arg7, var20, var27, arg6);
                        boolean var42 = var27 != null && var27.field995 != var27.field1000;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class134.field1999[var43] >= 0 && class370.field5117[var43] != class344.field4643[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class225.method1477(var19[1], class187.method1301(class29.field403[2], class29.field403[4]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class225.method1477(var19[3], class187.method1301(class29.field403[0], class29.field403[6]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class225.method1477(var19[0], class187.method1301(class29.field403[2], class29.field403[0]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class225.method1477(var19[2], class187.method1301(class29.field403[4], class29.field403[6]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[3] = false;
                                var21 = 0;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var19[0] = var19[1] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 3;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 2;
                                var19[1] = var19[2] = false;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var21 = 1;
                                var19[2] = var19[3] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int var47;
                        int var48;
                        int[] var49;
                        int[] var50;
                        if (var44) {
                            var50 = class279.field3805[var20];
                            var48 = var27 == null ? 0 : class284.field3858[var20];
                            var49 = class196.field2850[var20];
                            var46 = class134.field2007[var20];
                            var47 = var28 == null ? 0 : class258.field3584[var20];
                        } else if (var18) {
                            var49 = class328.field4450[var20];
                            var47 = var28 == null ? 0 : class346.field4683[var20];
                            var50 = class46.field587[var20];
                            var45 = class429.field5981[var20];
                            var46 = class93.field1302[var20];
                            var48 = var27 == null ? 0 : class298.field4089[var20];
                        } else {
                            var46 = class436.field6150[var20];
                            var47 = var28 == null ? 0 : class345.field4669[var20];
                            var48 = var27 == null ? 0 : class343.field4633[var20];
                            var45 = class371.field5145[var20];
                            var49 = class191.field2752[var20];
                            var50 = class424.field5903[var20];
                        }
                        int var51 = var47 + var48;
                        if (var51 <= 0) {
                            class72.method567(arg12, var13, var15);
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
                            int[] var55 = arg9 ? new int[var54] : null;
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
                                var62 = var27.field995;
                                var63 = arg6.method166() ? var27.field997 : var27.field984;
                                var64 = var27.field992;
                                int var65 = class340.method2076(125, var27, arg6);
                                for (int var66 = 0; var66 < var48; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class271.field3709[0] = var49[var52];
                                        class271.field3709[1] = 1;
                                        class271.field3709[2] = var46[var52];
                                        class271.field3709[3] = 1;
                                        class271.field3709[4] = var50[var52];
                                        var68 = 6;
                                        class271.field3709[5] = var46[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class271.field3709[0] = var49[var52];
                                        class271.field3709[1] = 5;
                                        class271.field3709[2] = var46[var52];
                                        class271.field3709[3] = 5;
                                        class271.field3709[4] = var50[var52];
                                        class271.field3709[5] = var46[var52];
                                        var68 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class271.field3709[0] = var49[var52];
                                        class271.field3709[1] = 3;
                                        class271.field3709[2] = var46[var52];
                                        class271.field3709[3] = 3;
                                        class271.field3709[4] = var50[var52];
                                        class271.field3709[5] = var46[var52];
                                        var68 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class271.field3709[0] = var49[var52];
                                        class271.field3709[1] = 7;
                                        class271.field3709[2] = var46[var52];
                                        class271.field3709[3] = 7;
                                        class271.field3709[4] = var50[var52];
                                        var68 = 6;
                                        class271.field3709[5] = var46[var52];
                                    } else {
                                        class271.field3709[0] = var49[var52];
                                        class271.field3709[1] = var50[var52];
                                        class271.field3709[2] = var46[var52];
                                        var68 = 3;
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class271.field3709[var69];
                                        int var71 = var70 - (var21 * 2) & 0x7;
                                        int var72 = class246.field3468[var70];
                                        int var73 = class418.field5781[var70];
                                        if (var21 == 1) {
                                            var57[var53] = var73;
                                            var58[var53] = 128 - var72;
                                        } else if (var21 == 2) {
                                            var57[var53] = 128 - var72;
                                            var58[var53] = 128 - var73;
                                        } else if (var21 == 3) {
                                            var57[var53] = 128 - var73;
                                            var58[var53] = var72;
                                        } else {
                                            var57[var53] = var72;
                                            var58[var53] = var73;
                                        }
                                        if (arg9 && class111.field1720[var20][var70]) {
                                            int var74 = (var13 << 7) + var57[var53];
                                            int var75 = (var15 << 7) + var58[var53];
                                            var55[var53] = arg10.method331(var74, var75) - arg11.method331(var74, var75);
                                        }
                                        if (var70 < 8 && var27.field994 < class134.field1999[var71]) {
                                            if (var56 != null) {
                                                var56[var53] = class344.field4643[var71];
                                            }
                                            var61[var53] = class104.field1449[var71];
                                            var60[var53] = class41.field539[var71];
                                            var59[var53] = class370.field5117[var71];
                                        } else {
                                            if (var56 != null) {
                                                var56[var53] = var65;
                                            }
                                            var60[var53] = arg6.method166() ? var27.field997 : var27.field984;
                                            var61[var53] = var27.field992;
                                            var59[var53] = var62;
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (!arg9 && arg12 == 0) {
                                    class17.method104(var13, var15, var27.field987, var27.field985 * 8);
                                }
                                if (var20 != 12 && var27.field995 != -1 && var27.field983) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class284.field3858[var20];
                            } else if (var18) {
                                var52 += class298.field4089[var20];
                            } else {
                                var52 += class343.field4633[var20];
                            }
                            if (var28 != null) {
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                class290 var76 = class415.method2565(-1730, var23 - 1);
                                class290 var77 = class415.method2565(arg8 - 1732, var24 - 1);
                                class290 var78 = class415.method2565(arg8 - 1732, var25 - 1);
                                class290 var79 = class415.method2565(-1730, var26 - 1);
                                for (int var80 = 0; var80 < var47; var80++) {
                                    boolean var81 = false;
                                    byte var82;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class271.field3709[0] = var49[var52];
                                        class271.field3709[1] = 1;
                                        class271.field3709[2] = var46[var52];
                                        class271.field3709[3] = 1;
                                        class271.field3709[4] = var50[var52];
                                        class271.field3709[5] = var46[var52];
                                        var82 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class271.field3709[0] = var49[var52];
                                        class271.field3709[1] = 5;
                                        class271.field3709[2] = var46[var52];
                                        class271.field3709[3] = 5;
                                        class271.field3709[4] = var50[var52];
                                        class271.field3709[5] = var46[var52];
                                        var82 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class271.field3709[0] = var49[var52];
                                        class271.field3709[1] = 3;
                                        class271.field3709[2] = var46[var52];
                                        class271.field3709[3] = 3;
                                        class271.field3709[4] = var50[var52];
                                        class271.field3709[5] = var46[var52];
                                        var82 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class271.field3709[0] = var49[var52];
                                        class271.field3709[1] = 7;
                                        class271.field3709[2] = var46[var52];
                                        class271.field3709[3] = 7;
                                        class271.field3709[4] = var50[var52];
                                        var82 = 6;
                                        class271.field3709[5] = var46[var52];
                                    } else {
                                        class271.field3709[0] = var49[var52];
                                        class271.field3709[1] = var50[var52];
                                        var82 = 3;
                                        class271.field3709[2] = var46[var52];
                                    }
                                    var52++;
                                    for (int var83 = 0; var83 < var82; var83++) {
                                        int var84 = class271.field3709[var83];
                                        int var85 = var84 - var21 * 2 & 0x7;
                                        int var86 = class246.field3468[var84];
                                        int var87 = class418.field5781[var84];
                                        int var88;
                                        int var89;
                                        if (var21 == 1) {
                                            var89 = 128 - var86;
                                            var88 = var87;
                                        } else if (var21 == 2) {
                                            var88 = 128 - var86;
                                            var89 = 128 - var87;
                                        } else if (var21 == 3) {
                                            var89 = var86;
                                            var88 = 128 - var87;
                                        } else {
                                            var88 = var86;
                                            var89 = var87;
                                        }
                                        var57[var53] = var88;
                                        var58[var53] = var89;
                                        if (arg9 && class111.field1720[var20][var84]) {
                                            int var90 = (var13 << 7) + var88;
                                            int var91 = (var15 << 7) + var89;
                                            var55[var53] = arg10.method331(var90, var91) - arg11.method331(var90, var91);
                                        }
                                        if (var84 < 8 && class134.field1999[var85] >= 0) {
                                            if (var56 != null) {
                                                var56[var53] = class344.field4643[var85];
                                            }
                                            var61[var53] = class104.field1449[var85];
                                            var60[var53] = class41.field539[var85];
                                            var59[var53] = class370.field5117[var85];
                                        } else {
                                            if (var18 && class111.field1720[var20][var84]) {
                                                var60[var53] = var63;
                                                var61[var53] = var64;
                                                var59[var53] = var62;
                                            } else if (var88 == 0 && var89 == 0) {
                                                var59[var53] = arg4[var13][var15];
                                                var60[var53] = var76.field3941;
                                                var61[var53] = var76.field3942;
                                            } else if (var88 == 0 && var89 == 128) {
                                                var59[var53] = arg4[var13][var16];
                                                var60[var53] = var77.field3941;
                                                var61[var53] = var77.field3942;
                                            } else if (var88 == 128 && var89 == 128) {
                                                var59[var53] = arg4[var14][var16];
                                                var60[var53] = var78.field3941;
                                                var61[var53] = var78.field3942;
                                            } else if (var88 == 128 && var89 == 0) {
                                                var59[var53] = arg4[var14][var15];
                                                var60[var53] = var79.field3941;
                                                var61[var53] = var79.field3942;
                                            } else {
                                                if (var88 < 64) {
                                                    if (var89 >= 64) {
                                                        var60[var53] = var77.field3941;
                                                        var61[var53] = var77.field3942;
                                                    } else {
                                                        var60[var53] = var76.field3941;
                                                        var61[var53] = var76.field3942;
                                                    }
                                                } else if (var89 < 64) {
                                                    var60[var53] = var79.field3941;
                                                    var61[var53] = var79.field3942;
                                                } else {
                                                    var60[var53] = var78.field3941;
                                                    var61[var53] = var78.field3942;
                                                }
                                                int var92 = class157.method1141(arg4[var13][var15], var88 << 7 >> 7, -1, arg4[var14][var15]);
                                                int var93 = class157.method1141(arg4[var13][var16], var88 << 7 >> 7, -1, arg4[var14][var16]);
                                                var59[var53] = class157.method1141(var92, var89 << 7 >> 7, -1, var93);
                                            }
                                            if (var56 != null) {
                                                var56[var53] = var59[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                }
                                if (var20 != 0 && var28.field3938) {
                                    var17 = true;
                                }
                            }
                            int var94 = arg11.method329(var13, var15);
                            int var95 = arg11.method329(var14, var15);
                            int var96 = arg11.method329(var14, var16);
                            int var97 = arg11.method329(var13, var16);
                            if (arg12 > 0) {
                                boolean var98 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var98 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field982) {
                                    var98 = false;
                                }
                                if (var98 && var94 == var95 && var94 == var96 && var94 == var97) {
                                    class436.field6155[arg12][var13][var15] = (byte) class431.method2655(class436.field6155[arg12][var13][var15], 4);
                                }
                            }
                            int var99 = 0;
                            int var100 = 0;
                            if (arg9) {
                                var99 = class375.method2348(var13, var15);
                                var100 = class431.method2658(var13, var15);
                            }
                            arg11.method326(var13, var15, var57, var55, var58, var59, var56, var60, var61, var99, var100, var17);
                            class72.method567(arg12, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(Z)V")
    public static void method1597(boolean arg0) {
        field3457 = null;
        if (!arg0) {
            method1598(-76, (long[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[J[I)V")
    public static final void method1598(int arg0, long[] arg1, int[] arg2) {
        field3456++;
        if (arg0 == 4) {
            class37.method320(arg1.length - 1, 14407, arg1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)V")
    public static final void method1599(int arg0, boolean arg1) {
        field3462++;
        byte[][] var2;
        byte var3;
        if (arg1) {
            var3 = 1;
            var2 = class143.field2083;
        } else {
            var2 = class204.field2902;
            var3 = 4;
        }
        if (arg0 <= 66) {
            method1595(-35, -85, -44, -96, 45, -71, 34, (byte[][][]) null, 84, -110, (class58) null, -7, 11);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class140.method1025(255);
            for (int var5 = 0; var5 < class11.field107 >> 3; var5++) {
                for (int var6 = 0; var6 < class264.field3620 >> 3; var6++) {
                    int var7 = class22.field274[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFF580) >> 14;
                            int var11 = (var7 & 0x3FFB) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class171.field2413.length; var13++) {
                                if (class171.field2413[var13] == var12 && var2[var13] != null) {
                                    class47.method388(var8, class403.field5567, var4, var5 * 8, (var10 & 0x7) * 8, var6 * 8, class354.field4765, var2[var13], arg1, var9, (byte) 30, (var11 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
    public class245() {
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class245(String arg0) {
        this.field3460 = arg0;
    }
}
