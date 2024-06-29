import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class431 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lwl;")
    public static class452 field6328 = new class452(51, 12);

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field6331 = 1338;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lsf;")
    public static class398 field6330 = new class398();

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Z")
    public static boolean field6332 = true;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method2648(int arg0) {
        field6330 = null;
        int var1 = -3 / ((arg0 + 7) / 44);
        field6328 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ls;ILs;I[[BII[[BLdr;[[I[[BZ[[B)V")
    public static final void method2649(class143 arg0, int arg1, class143 arg2, int arg3, byte[][] arg4, int arg5, int arg6, byte[][] arg7, class261 arg8, int[][] arg9, byte[][] arg10, boolean arg11, byte[][] arg12) {
        if (arg5 <= 14) {
            method2648(26);
        }
        field6327++;
        for (int var13 = 0; var13 < arg1; var13++) {
            int var14 = var13 < arg1 - 1 ? var13 + 1 : var13;
            for (int var15 = 0; var15 < arg6; var15++) {
                int var16 = (arg6 - 1) <= var15 ? var15 : var15 + 1;
                if (class360.method2172(64) || class56.method319(var13, var15, class88.field1263, (byte) 37, arg3)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = arg4[var13][var15];
                    int var21 = arg12[var13][var15];
                    int var22 = arg7[var13][var15] & 0xFF;
                    int var23 = arg10[var13][var15] & 0xFF;
                    int var24 = arg10[var13][var16] & 0xFF;
                    int var25 = arg10[var14][var16] & 0xFF;
                    int var26 = arg10[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class446 var27 = var22 == 0 ? null : class292.method1815(-118, var22 - 1);
                        class87 var28 = var23 == 0 ? null : class90.method590(var23 - 1, 1);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class446 var29 = var27;
                        if (var27 != null) {
                            if (var27.field6564 == -1 && var27.field6576 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field6557;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && arg1 > var13 && var15 < arg6) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var31 + (arg10[var14][var15 - 1] == var23 ? 1 : -1);
                            int var34 = var30 + (arg10[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var32 + (arg10[var14][var16] == var23 ? 1 : -1);
                            if (arg10[var13][var15 - 1] == var23) {
                                var33++;
                                var34++;
                            } else {
                                var34--;
                                var33--;
                            }
                            int var37 = var35 + (arg10[var13 - 1][var16] == var23 ? 1 : -1);
                            if (arg10[var14][var15] == var23) {
                                var36++;
                                var33++;
                            } else {
                                var33--;
                                var36--;
                            }
                            if (arg10[var13][var16] == var23) {
                                var37++;
                                var36++;
                            } else {
                                var37--;
                                var36--;
                            }
                            if (arg10[var13 - 1][var15] == var23) {
                                var37++;
                                var34++;
                            } else {
                                var34--;
                                var37--;
                            }
                            int var38 = var34 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var33 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg2.method92(var13, var15) - arg2.method92(var14, var16);
                                var39 = arg2.method92(var14, var15) - arg2.method92(var13, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var39 > var38 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class455.field6762[var40] = -1;
                            class221.field3370[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field6557 ? class343.field5139[var20] : class26.field345[var20];
                        class114.method691(arg4, var15, var20, arg12, -96, var28, var21, arg6, arg1, arg7, var27, var13, var19, arg8);
                        boolean var42 = var27 != null && var27.field6576 != var27.field6564;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class455.field6762[var43] >= 0 && class90.field1278[var43] != class148.field2050[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class456.method2835(var19[1], class406.method2552(class221.field3370[2], class221.field3370[4]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class456.method2835(var19[3], class406.method2552(class221.field3370[0], class221.field3370[6]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class456.method2835(var19[0], class406.method2552(class221.field3370[0], class221.field3370[2]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class456.method2835(var19[2], class406.method2552(class221.field3370[4], class221.field3370[6]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var21 = 0;
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[3] = false;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var19[0] = var19[1] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 3;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var19[1] = var19[2] = false;
                                var21 = 2;
                                var20 = var20 == 0 ? 13 : 14;
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
                            var46 = class3.field40[var20];
                            var47 = class81.field1080[var20];
                            var48 = var28 == null ? 0 : class294.field4474[var20];
                            var49 = class355.field5240[var20];
                            var50 = var27 == null ? 0 : class55.field743[var20];
                        } else if (var18) {
                            var50 = var27 == null ? 0 : class374.field5447[var20];
                            var49 = class57.field752[var20];
                            var48 = var28 == null ? 0 : class106.field1419[var20];
                            var45 = class402.field6010[var20];
                            var46 = class31.field397[var20];
                            var47 = class379.field5542[var20];
                        } else {
                            var48 = var28 == null ? 0 : class425.field6244[var20];
                            var47 = class410.field6109[var20];
                            var49 = class187.field2803[var20];
                            var50 = var27 == null ? 0 : class435.field6401[var20];
                            var45 = class261.field3981[var20];
                            var46 = class79.field1046[var20];
                        }
                        int var51 = var50 + var48;
                        if (var51 <= 0) {
                            class344.method2097(arg3, var13, var15);
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
                            int[] var55 = arg11 ? new int[var54] : null;
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
                                var62 = var27.field6564;
                                var63 = arg8.method398() ? var27.field6562 : var27.field6577;
                                var64 = var27.field6561;
                                int var65 = class136.method855(0, var27, arg8);
                                for (int var66 = 0; var66 < var50; var66++) {
                                    boolean var92 = false;
                                    byte var93;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class450.field6625[0] = var47[var52];
                                        class450.field6625[1] = 1;
                                        class450.field6625[2] = var49[var52];
                                        class450.field6625[3] = 1;
                                        class450.field6625[4] = var46[var52];
                                        var93 = 6;
                                        class450.field6625[5] = var49[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class450.field6625[0] = var47[var52];
                                        class450.field6625[1] = 5;
                                        class450.field6625[2] = var49[var52];
                                        class450.field6625[3] = 5;
                                        class450.field6625[4] = var46[var52];
                                        var93 = 6;
                                        class450.field6625[5] = var49[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class450.field6625[0] = var47[var52];
                                        class450.field6625[1] = 3;
                                        class450.field6625[2] = var49[var52];
                                        class450.field6625[3] = 3;
                                        class450.field6625[4] = var46[var52];
                                        var93 = 6;
                                        class450.field6625[5] = var49[var52];
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class450.field6625[0] = var47[var52];
                                        class450.field6625[1] = 7;
                                        class450.field6625[2] = var49[var52];
                                        class450.field6625[3] = 7;
                                        class450.field6625[4] = var46[var52];
                                        class450.field6625[5] = var49[var52];
                                        var93 = 6;
                                    } else {
                                        class450.field6625[0] = var47[var52];
                                        class450.field6625[1] = var46[var52];
                                        var93 = 3;
                                        class450.field6625[2] = var49[var52];
                                    }
                                    var52++;
                                    for (int var94 = 0; var94 < var93; var94++) {
                                        int var95 = class450.field6625[var94];
                                        int var96 = var95 - (var21 * 2) & 0x7;
                                        int var97 = class140.field1882[var95];
                                        int var98 = class87.field1237[var95];
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
                                        if (arg11 && class255.field3933[var20][var95]) {
                                            int var99 = (var13 << 7) + var57[var53];
                                            int var100 = (var15 << 7) + var58[var53];
                                            var55[var53] = arg0.method100(var99, var100) - arg2.method100(var99, var100);
                                        }
                                        if (var95 < 8 && class455.field6762[var96] > var27.field6559) {
                                            if (var56 != null) {
                                                var56[var53] = class148.field2050[var96];
                                            }
                                            var61[var53] = class230.field3520[var96];
                                            var60[var53] = class440.field6475[var96];
                                            var59[var53] = class90.field1278[var96];
                                        } else {
                                            if (var56 != null) {
                                                var56[var53] = var65;
                                            }
                                            var60[var53] = arg8.method398() ? var27.field6562 : var27.field6577;
                                            var61[var53] = var27.field6561;
                                            var59[var53] = var62;
                                        }
                                        var53++;
                                    }
                                }
                                if (!arg11 && arg3 == 0) {
                                    class284.method1751(var13, var15, var27.field6569, var27.field6570 * 8);
                                }
                                if (var20 != 12 && var27.field6564 != -1 && var27.field6567) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class55.field743[var20];
                            } else if (var18) {
                                var52 += class374.field5447[var20];
                            } else {
                                var52 += class435.field6401[var20];
                            }
                            if (var28 != null) {
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                class87 var67 = class90.method590(var23 - 1, 1);
                                class87 var68 = class90.method590(var24 - 1, 1);
                                class87 var69 = class90.method590(var25 - 1, 1);
                                class87 var70 = class90.method590(var26 - 1, 1);
                                for (int var71 = 0; var71 < var48; var71++) {
                                    boolean var72 = false;
                                    byte var73;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class450.field6625[0] = var47[var52];
                                        class450.field6625[1] = 1;
                                        class450.field6625[2] = var49[var52];
                                        class450.field6625[3] = 1;
                                        class450.field6625[4] = var46[var52];
                                        class450.field6625[5] = var49[var52];
                                        var73 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class450.field6625[0] = var47[var52];
                                        class450.field6625[1] = 5;
                                        class450.field6625[2] = var49[var52];
                                        class450.field6625[3] = 5;
                                        class450.field6625[4] = var46[var52];
                                        var73 = 6;
                                        class450.field6625[5] = var49[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class450.field6625[0] = var47[var52];
                                        class450.field6625[1] = 3;
                                        class450.field6625[2] = var49[var52];
                                        class450.field6625[3] = 3;
                                        class450.field6625[4] = var46[var52];
                                        var73 = 6;
                                        class450.field6625[5] = var49[var52];
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class450.field6625[0] = var47[var52];
                                        class450.field6625[1] = 7;
                                        class450.field6625[2] = var49[var52];
                                        class450.field6625[3] = 7;
                                        class450.field6625[4] = var46[var52];
                                        class450.field6625[5] = var49[var52];
                                        var73 = 6;
                                    } else {
                                        class450.field6625[0] = var47[var52];
                                        class450.field6625[1] = var46[var52];
                                        var73 = 3;
                                        class450.field6625[2] = var49[var52];
                                    }
                                    var52++;
                                    for (int var74 = 0; var74 < var73; var74++) {
                                        int var75 = class450.field6625[var74];
                                        int var76 = var75 - var21 * 2 & 0x7;
                                        int var77 = class140.field1882[var75];
                                        int var78 = class87.field1237[var75];
                                        int var79;
                                        int var80;
                                        if (var21 == 1) {
                                            var79 = 128 - var77;
                                            var80 = var78;
                                        } else if (var21 == 2) {
                                            var79 = 128 - var78;
                                            var80 = 128 - var77;
                                        } else if (var21 == 3) {
                                            var80 = 128 - var78;
                                            var79 = var77;
                                        } else {
                                            var80 = var77;
                                            var79 = var78;
                                        }
                                        var57[var53] = var80;
                                        var58[var53] = var79;
                                        if (arg11 && class255.field3933[var20][var75]) {
                                            int var81 = (var13 << 7) + var80;
                                            int var82 = (var15 << 7) + var79;
                                            var55[var53] = arg0.method100(var81, var82) - arg2.method100(var81, var82);
                                        }
                                        if (var75 < 8 && class455.field6762[var76] >= 0) {
                                            if (var56 != null) {
                                                var56[var53] = class148.field2050[var76];
                                            }
                                            var61[var53] = class230.field3520[var76];
                                            var60[var53] = class440.field6475[var76];
                                            var59[var53] = class90.field1278[var76];
                                        } else {
                                            if (var18 && class255.field3933[var20][var75]) {
                                                var60[var53] = var63;
                                                var61[var53] = var64;
                                                var59[var53] = var62;
                                            } else if (var80 == 0 && var79 == 0) {
                                                var59[var53] = arg9[var13][var15];
                                                var60[var53] = var67.field1217;
                                                var61[var53] = var67.field1229;
                                            } else if (var80 == 0 && var79 == 128) {
                                                var59[var53] = arg9[var13][var16];
                                                var60[var53] = var68.field1217;
                                                var61[var53] = var68.field1229;
                                            } else if (var80 == 128 && var79 == 128) {
                                                var59[var53] = arg9[var14][var16];
                                                var60[var53] = var69.field1217;
                                                var61[var53] = var69.field1229;
                                            } else if (var80 == 128 && var79 == 0) {
                                                var59[var53] = arg9[var14][var15];
                                                var60[var53] = var70.field1217;
                                                var61[var53] = var70.field1229;
                                            } else {
                                                if (var80 < 64) {
                                                    if (var79 < 64) {
                                                        var60[var53] = var67.field1217;
                                                        var61[var53] = var67.field1229;
                                                    } else {
                                                        var60[var53] = var68.field1217;
                                                        var61[var53] = var68.field1229;
                                                    }
                                                } else if (var79 < 64) {
                                                    var60[var53] = var70.field1217;
                                                    var61[var53] = var70.field1229;
                                                } else {
                                                    var60[var53] = var69.field1217;
                                                    var61[var53] = var69.field1229;
                                                }
                                                int var83 = class405.method2547(var80 << 7 >> 7, arg9[var13][var15], 128, arg9[var14][var15]);
                                                int var84 = class405.method2547(var80 << 7 >> 7, arg9[var13][var16], 128, arg9[var14][var16]);
                                                var59[var53] = class405.method2547(var79 << 7 >> 7, var83, 128, var84);
                                            }
                                            if (var56 != null) {
                                                var56[var53] = var59[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                }
                                if (var20 != 0 && var28.field1223) {
                                    var17 = true;
                                }
                            }
                            int var85 = arg2.method92(var13, var15);
                            int var86 = arg2.method92(var14, var15);
                            int var87 = arg2.method92(var14, var16);
                            int var88 = arg2.method92(var13, var16);
                            if (arg3 > 0) {
                                boolean var89 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var89 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field6563) {
                                    var89 = false;
                                }
                                if (var89 && var85 == var86 && var85 == var87 && var85 == var88) {
                                    class354.field5235[arg3][var13][var15] = (byte) class276.method1712(class354.field5235[arg3][var13][var15], 4);
                                }
                            }
                            int var90 = 0;
                            int var91 = 0;
                            if (arg11) {
                                var90 = class462.method2850(var13, var15);
                                var91 = class424.method2615(var13, var15);
                            }
                            arg2.method97(var13, var15, var57, var55, var58, var59, var56, var60, var61, var90, var91, var17);
                            class344.method2097(arg3, var13, var15);
                        }
                    }
                }
            }
        }
    }
}
