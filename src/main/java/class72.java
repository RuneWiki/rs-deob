import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class72 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[I")
    public static int[] field943;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Ltj;")
    public static class108 field942;

    static {
        new class349("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field944 = -1;
        field943 = new int[] { 104, 120, 136, 168 };
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 18)
    public static void method436(int arg0) {
        field942 = null;
        if (arg0 > -50) {
            method436(-54);
        }
        field943 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([[BZ[[IIILuh;[[B[[BILvq;Luh;[[BI)V", line = 31)
    public static final void method437(byte[][] arg0, boolean arg1, int[][] arg2, int arg3, int arg4, class92 arg5, byte[][] arg6, byte[][] arg7, int arg8, class269 arg9, class92 arg10, byte[][] arg11, int arg12) {
        for (int var13 = arg12; var13 < arg3; var13++) {
            int var14 = arg3 - 1 > var13 ? var13 + 1 : var13;
            for (int var15 = 0; var15 < arg4; var15++) {
                int var16 = var15 >= arg4 - 1 ? var15 : var15 + 1;
                if (class296.method2000((byte) -67) || class173.method1232(arg8, var15, var13, 126, class40.field558)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = arg7[var13][var15];
                    int var21 = arg6[var13][var15];
                    int var22 = arg11[var13][var15] & 0xFF;
                    int var23 = arg0[var13][var15] & 0xFF;
                    int var24 = arg0[var13][var16] & 0xFF;
                    int var25 = arg0[var14][var16] & 0xFF;
                    int var26 = arg0[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class247 var27 = var22 == 0 ? null : class377.method2408((byte) 67, var22 - 1);
                        class386 var28 = var23 == 0 ? null : class204.method1422(1, var23 - 1);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class247 var29 = var27;
                        if (var27 != null) {
                            if (var27.field3688 == -1 && var27.field3685 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field3680;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && arg3 > var13 && var15 < arg4) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var30 + (arg0[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var31 + (arg0[var14][var15 - 1] == var23 ? 1 : -1);
                            int var36 = var32 + (arg0[var14][var16] == var23 ? 1 : -1);
                            if (arg0[var13][var15 - 1] == var23) {
                                var33++;
                                var35++;
                            } else {
                                var33--;
                                var35--;
                            }
                            int var37 = var34 + (arg0[var13 - 1][var16] == var23 ? 1 : -1);
                            if (arg0[var14][var15] == var23) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            if (arg0[var13][var16] == var23) {
                                var36++;
                                var37++;
                            } else {
                                var36--;
                                var37--;
                            }
                            if (arg0[var13 - 1][var15] == var23) {
                                var33++;
                                var37++;
                            } else {
                                var33--;
                                var37--;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var35 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg5.method359(var13, var15) - arg5.method359(var14, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                var39 = arg5.method359(var14, var15) - arg5.method359(var13, var16);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var38 < var39 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class347.field5051[var40] = -1;
                            class423.field6037[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field3680 ? class284.field4124[var20] : class58.field780[var20];
                        class247.method1720(var19, arg11, arg4, var13, var15, arg6, var27, arg3, var20, arg7, var21, var28, (byte) 113, arg9);
                        boolean var42 = var27 != null && var27.field3688 != var27.field3685;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class347.field5051[var43] >= 0 && class93.field1192[var43] != class102.field1290[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class411.method2600(var19[1], class209.method1483(class423.field6037[4], class423.field6037[2]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class411.method2600(var19[3], class209.method1483(class423.field6037[0], class423.field6037[6]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class411.method2600(var19[0], class209.method1483(class423.field6037[0], class423.field6037[2]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class411.method2600(var19[2], class209.method1483(class423.field6037[6], class423.field6037[4]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[3] = false;
                                var21 = 0;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var21 = 3;
                                var19[0] = var19[1] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[1] = var19[2] = false;
                                var21 = 2;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[2] = var19[3] = false;
                                var21 = 1;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        int[] var50;
                        if (var44) {
                            var46 = var27 == null ? 0 : class450.field6453[var20];
                            var48 = class231.field3422[var20];
                            var49 = var28 == null ? 0 : class122.field1637[var20];
                            var47 = class295.field4270[var20];
                            var50 = class126.field1722[var20];
                        } else if (var18) {
                            var46 = var27 == null ? 0 : class301.field4385[var20];
                            var47 = class10.field127[var20];
                            var48 = class153.field2275[var20];
                            var49 = var28 == null ? 0 : class87.field1134[var20];
                            var50 = class441.field6300[var20];
                            var45 = class229.field3398[var20];
                        } else {
                            var45 = class270.field3953[var20];
                            var47 = class289.field4202[var20];
                            var46 = var27 == null ? 0 : class122.field1640[var20];
                            var48 = class334.field4852[var20];
                            var49 = var28 == null ? 0 : class91.field1175[var20];
                            var50 = class358.field5170[var20];
                        }
                        int var51 = var46 + var49;
                        if (var51 <= 0) {
                            class197.method1400(arg8, var13, var15);
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
                            int[] var55 = arg1 ? new int[var54] : null;
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
                                var62 = var27.field3688;
                                var63 = arg9.method864() ? var27.field3682 : var27.field3687;
                                var64 = var27.field3692;
                                int var65 = class150.method1113(var27, arg9, (byte) 55);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var92 = false;
                                    byte var93;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class317.field4657[0] = var48[var52];
                                        class317.field4657[1] = 1;
                                        class317.field4657[2] = var47[var52];
                                        class317.field4657[3] = 1;
                                        class317.field4657[4] = var50[var52];
                                        var93 = 6;
                                        class317.field4657[5] = var47[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class317.field4657[0] = var48[var52];
                                        class317.field4657[1] = 5;
                                        class317.field4657[2] = var47[var52];
                                        class317.field4657[3] = 5;
                                        class317.field4657[4] = var50[var52];
                                        class317.field4657[5] = var47[var52];
                                        var93 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class317.field4657[0] = var48[var52];
                                        class317.field4657[1] = 3;
                                        class317.field4657[2] = var47[var52];
                                        class317.field4657[3] = 3;
                                        class317.field4657[4] = var50[var52];
                                        class317.field4657[5] = var47[var52];
                                        var93 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class317.field4657[0] = var48[var52];
                                        class317.field4657[1] = 7;
                                        class317.field4657[2] = var47[var52];
                                        class317.field4657[3] = 7;
                                        class317.field4657[4] = var50[var52];
                                        var93 = 6;
                                        class317.field4657[5] = var47[var52];
                                    } else {
                                        class317.field4657[0] = var48[var52];
                                        class317.field4657[1] = var50[var52];
                                        var93 = 3;
                                        class317.field4657[2] = var47[var52];
                                    }
                                    var52++;
                                    for (int var94 = 0; var94 < var93; var94++) {
                                        int var95 = class317.field4657[var94];
                                        int var96 = var95 - (var21 * 2) & 0x7;
                                        int var97 = class361.field5201[var95];
                                        int var98 = class54.field699[var95];
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
                                        if (arg1 && class297.field4325[var20][var95]) {
                                            int var99 = (var13 << 7) + var57[var53];
                                            int var100 = (var15 << 7) + var58[var53];
                                            var55[var53] = arg10.method360(var99, var100) - arg5.method360(var99, var100);
                                        }
                                        if (var95 < 8 && class347.field5051[var96] > var27.field3693) {
                                            if (var56 != null) {
                                                var56[var53] = class102.field1290[var96];
                                            }
                                            var61[var53] = class138.field2119[var96];
                                            var60[var53] = class305.field4450[var96];
                                            var59[var53] = class93.field1192[var96];
                                        } else {
                                            if (var56 != null) {
                                                var56[var53] = var65;
                                            }
                                            var60[var53] = arg9.method864() ? var27.field3682 : var27.field3687;
                                            var61[var53] = var27.field3692;
                                            var59[var53] = var62;
                                        }
                                        var53++;
                                    }
                                }
                                if (!arg1 && arg8 == 0) {
                                    class304.method2052(var13, var15, var27.field3681, var27.field3683 * 8);
                                }
                                if (var20 != 12 && var27.field3688 != -1 && var27.field3694) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class450.field6453[var20];
                            } else if (var18) {
                                var52 += class301.field4385[var20];
                            } else {
                                var52 += class122.field1640[var20];
                            }
                            if (var28 != null) {
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                class386 var67 = class204.method1422(arg12 ^ 0x1, var23 - 1);
                                class386 var68 = class204.method1422(1, var24 - 1);
                                class386 var69 = class204.method1422(1, var25 - 1);
                                class386 var70 = class204.method1422(1, var26 - 1);
                                for (int var71 = 0; var71 < var49; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class317.field4657[0] = var48[var52];
                                        class317.field4657[1] = 1;
                                        class317.field4657[2] = var47[var52];
                                        class317.field4657[3] = 1;
                                        class317.field4657[4] = var50[var52];
                                        var73 = 6;
                                        class317.field4657[5] = var47[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class317.field4657[0] = var48[var52];
                                        class317.field4657[1] = 5;
                                        class317.field4657[2] = var47[var52];
                                        class317.field4657[3] = 5;
                                        class317.field4657[4] = var50[var52];
                                        class317.field4657[5] = var47[var52];
                                        var73 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class317.field4657[0] = var48[var52];
                                        class317.field4657[1] = 3;
                                        class317.field4657[2] = var47[var52];
                                        class317.field4657[3] = 3;
                                        class317.field4657[4] = var50[var52];
                                        class317.field4657[5] = var47[var52];
                                        var73 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class317.field4657[0] = var48[var52];
                                        class317.field4657[1] = 7;
                                        class317.field4657[2] = var47[var52];
                                        class317.field4657[3] = 7;
                                        class317.field4657[4] = var50[var52];
                                        var73 = 6;
                                        class317.field4657[5] = var47[var52];
                                    } else {
                                        class317.field4657[0] = var48[var52];
                                        class317.field4657[1] = var50[var52];
                                        class317.field4657[2] = var47[var52];
                                        var73 = 3;
                                    }
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class317.field4657[var74];
                                        int var76 = var75 - var21 * 2 & 0x7;
                                        int var77 = class361.field5201[var75];
                                        int var78 = class54.field699[var75];
                                        int var79;
                                        int var80;
                                        if (var21 == 1) {
                                            var79 = var78;
                                            var80 = 128 - var77;
                                        } else if (var21 == 2) {
                                            var79 = 128 - var77;
                                            var80 = 128 - var78;
                                        } else if (var21 == 3) {
                                            var80 = var77;
                                            var79 = 128 - var78;
                                        } else {
                                            var79 = var77;
                                            var80 = var78;
                                        }
                                        var57[var53] = var79;
                                        var58[var53] = var80;
                                        if (arg1 && class297.field4325[var20][var75]) {
                                            int var81 = (var13 << 7) + var79;
                                            int var82 = (var15 << 7) + var80;
                                            var55[var53] = arg10.method360(var81, var82) - arg5.method360(var81, var82);
                                        }
                                        if (var75 < 8 && class347.field5051[var76] >= 0) {
                                            if (var56 != null) {
                                                var56[var53] = class102.field1290[var76];
                                            }
                                            var61[var53] = class138.field2119[var76];
                                            var60[var53] = class305.field4450[var76];
                                            var59[var53] = class93.field1192[var76];
                                        } else {
                                            if (var18 && class297.field4325[var20][var75]) {
                                                var60[var53] = var63;
                                                var61[var53] = var64;
                                                var59[var53] = var62;
                                            } else if (var79 == 0 && var80 == 0) {
                                                var59[var53] = arg2[var13][var15];
                                                var60[var53] = var67.field5464;
                                                var61[var53] = var67.field5457;
                                            } else if (var79 == 0 && var80 == 128) {
                                                var59[var53] = arg2[var13][var16];
                                                var60[var53] = var68.field5464;
                                                var61[var53] = var68.field5457;
                                            } else if (var79 == 128 && var80 == 128) {
                                                var59[var53] = arg2[var14][var16];
                                                var60[var53] = var69.field5464;
                                                var61[var53] = var69.field5457;
                                            } else if (var79 == 128 && var80 == 0) {
                                                var59[var53] = arg2[var14][var15];
                                                var60[var53] = var70.field5464;
                                                var61[var53] = var70.field5457;
                                            } else {
                                                if (var79 >= 64) {
                                                    if (var80 >= 64) {
                                                        var60[var53] = var69.field5464;
                                                        var61[var53] = var69.field5457;
                                                    } else {
                                                        var60[var53] = var70.field5464;
                                                        var61[var53] = var70.field5457;
                                                    }
                                                } else if (var80 < 64) {
                                                    var60[var53] = var67.field5464;
                                                    var61[var53] = var67.field5457;
                                                } else {
                                                    var60[var53] = var68.field5464;
                                                    var61[var53] = var68.field5457;
                                                }
                                                int var83 = class182.method1311(127, var79 << 7 >> 7, arg2[var14][var15], arg2[var13][var15]);
                                                int var84 = class182.method1311(127, var79 << 7 >> 7, arg2[var14][var16], arg2[var13][var16]);
                                                var59[var53] = class182.method1311(127, var80 << 7 >> 7, var84, var83);
                                            }
                                            if (var56 != null) {
                                                var56[var53] = var59[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (var20 != 0 && var28.field5460) {
                                    var17 = true;
                                }
                            }
                            int var85 = arg5.method359(var13, var15);
                            int var86 = arg5.method359(var14, var15);
                            int var87 = arg5.method359(var14, var16);
                            int var88 = arg5.method359(var13, var16);
                            if (arg8 > 0) {
                                boolean var89 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var89 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field3695) {
                                    var89 = false;
                                }
                                if (var89 && var85 == var86 && var85 == var87 && var85 == var88) {
                                    class284.field4138[arg8][var13][var15] = (byte) class332.method2176(class284.field4138[arg8][var13][var15], 4);
                                }
                            }
                            int var90 = 0;
                            int var91 = 0;
                            if (arg1) {
                                var90 = class420.method2642(var13, var15);
                                var91 = class166.method1195(var13, var15);
                            }
                            arg5.method350(var13, var15, var57, var55, var58, var59, var56, var60, var61, var90, var91, var17);
                            class197.method1400(arg8, var13, var15);
                        }
                    }
                }
            }
        }
        field941++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIB)V", line = 831)
    public static final void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field939++;
        if (arg6 >= -57) {
            field942 = null;
        }
        class223 var7 = class299.method2016(arg1, arg0, (byte) 121);
        if (var7 != null && var7.field3232 != null) {
            class79 var8 = new class79();
            var8.field1028 = var7.field3232;
            var8.field1018 = var7;
            class424.method2655(var8);
        }
        class128.field1814 = arg0;
        class385.field5451 = arg3;
        class269.field3935 = true;
        class34.field433 = arg2;
        class432.field6182 = arg4;
        if (var7 != null) {
            class324.field4715 = var7.field3304;
        }
        class261.field3855 = arg1;
        class442.field6319 = arg5;
        class245.method1701(var7, (byte) -94);
    }
}
