import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class267 extends class331 {

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "Lma;")
    public class8 field3802;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "Lva;")
    public static class288 field3804 = new class288(16);

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "[I")
    public static int[] field3806 = new int[1000];

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "(B)V", line = 3)
    public static void method1778(byte arg0) {
        field3804 = null;
        field3806 = null;
        if (arg0 >= -46) {
            field3806 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(Z)V", line = 18)
    public static final void method1779(boolean arg0) {
        if (arg0) {
            field3804 = null;
        }
        if (class185.field2681.toLowerCase().indexOf("microsoft") == -1) {
            class65.field749[45] = 26;
            class65.field749[44] = 71;
            class65.field749[61] = 27;
            class65.field749[93] = 43;
            if (class185.field2691 == null) {
                class65.field749[192] = 58;
                class65.field749[222] = 59;
            } else {
                class65.field749[520] = 59;
                class65.field749[222] = 58;
                class65.field749[192] = 28;
            }
            class65.field749[91] = 42;
            class65.field749[92] = 74;
            class65.field749[47] = 73;
            class65.field749[59] = 57;
            class65.field749[46] = 72;
        } else {
            class65.field749[189] = 26;
            class65.field749[187] = 27;
            class65.field749[192] = 58;
            class65.field749[190] = 72;
            class65.field749[221] = 43;
            class65.field749[219] = 42;
            class65.field749[191] = 73;
            class65.field749[186] = 57;
            class65.field749[223] = 28;
            class65.field749[188] = 71;
            class65.field749[220] = 74;
            class65.field749[222] = 59;
        }
        field3803++;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lma;)V", line = 74)
    public class267(class8 arg0) {
        this.field3802 = arg0;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "([[BLae;[[BLgh;Lgh;Z[[IIBII[[B[[B)V", line = 83)
    public static final void method1780(byte[][] arg0, class134 arg1, byte[][] arg2, class327 arg3, class327 arg4, boolean arg5, int[][] arg6, int arg7, byte arg8, int arg9, int arg10, byte[][] arg11, byte[][] arg12) {
        if (arg8 < 19) {
            field3806 = null;
        }
        for (int var13 = 0; var13 < arg10; var13++) {
            int var14 = var13 >= arg10 - 1 ? var13 : var13 + 1;
            for (int var15 = 0; var15 < arg7; var15++) {
                int var16 = var15 < arg7 - 1 ? var15 + 1 : var15;
                if (class12.method93(1) || class310.method2050(arg9, (byte) -77, var15, class422.field6035, var13)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = arg12[var13][var15];
                    int var21 = arg2[var13][var15];
                    int var22 = arg11[var13][var15] & 0xFF;
                    int var23 = arg0[var13][var15] & 0xFF;
                    int var24 = arg0[var13][var16] & 0xFF;
                    int var25 = arg0[var14][var16] & 0xFF;
                    int var26 = arg0[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class383 var27 = var22 == 0 ? null : class181.method1222(var22 - 1, 15610);
                        class36 var28 = var23 == 0 ? null : class258.method1729(-114, var23 - 1);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class383 var29 = var27;
                        if (var27 != null) {
                            if (var27.field5400 == -1 && var27.field5404 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field5399;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && arg10 > var13 && arg7 > var15) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var32 + (arg0[var14][var16] == var23 ? 1 : -1);
                            int var34 = var30 + (arg0[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var31 + (arg0[var14][var15 - 1] == var23 ? 1 : -1);
                            int var37 = var35 + (arg0[var13 - 1][var16] == var23 ? 1 : -1);
                            if (arg0[var13][var15 - 1] == var23) {
                                var36++;
                                var34++;
                            } else {
                                var36--;
                                var34--;
                            }
                            if (arg0[var14][var15] == var23) {
                                var33++;
                                var36++;
                            } else {
                                var33--;
                                var36--;
                            }
                            if (arg0[var13][var16] == var23) {
                                var37++;
                                var33++;
                            } else {
                                var33--;
                                var37--;
                            }
                            if (arg0[var13 - 1][var15] == var23) {
                                var34++;
                                var37++;
                            } else {
                                var34--;
                                var37--;
                            }
                            int var38 = var34 - var33;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var36 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg4.method328(var13, var15) - arg4.method328(var14, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                var39 = arg4.method328(var14, var15) - arg4.method328(var13, var16);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var39 > var38 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class322.field4585[var40] = -1;
                            class158.field2065[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field5399 ? class152.field1876[var20] : class26.field326[var20];
                        class370.method2357(arg7, var20, arg10, 123, var15, arg2, var28, arg11, var13, var27, var21, arg12, arg1, var19);
                        boolean var42 = var27 != null && var27.field5404 != var27.field5400;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class322.field4585[var43] >= 0 && class93.field1124[var43] != class146.field1790[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class233.method1543(var19[1], class33.method210(class158.field2065[2], class158.field2065[4]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class233.method1543(var19[3], class33.method210(class158.field2065[0], class158.field2065[6]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class233.method1543(var19[0], class33.method210(class158.field2065[2], class158.field2065[0]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class233.method1543(var19[2], class33.method210(class158.field2065[4], class158.field2065[6]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 0;
                                var19[0] = var19[3] = false;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[0] = var19[1] = false;
                                var21 = 3;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[1] = var19[2] = false;
                                var21 = 2;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 1;
                                var19[2] = var19[3] = false;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        int[] var50;
                        if (var44) {
                            var47 = class86.field982[var20];
                            var49 = class113.field1396[var20];
                            var48 = var28 == null ? 0 : class8.field126[var20];
                            var46 = var27 == null ? 0 : class35.field400[var20];
                            var50 = class99.field1210[var20];
                        } else if (var18) {
                            var49 = class75.field891[var20];
                            var47 = class183.field2511[var20];
                            var48 = var28 == null ? 0 : class401.field5732[var20];
                            var46 = var27 == null ? 0 : class20.field267[var20];
                            var50 = class118.field1446[var20];
                            var45 = class366.field5197[var20];
                        } else {
                            var46 = var27 == null ? 0 : class26.field331[var20];
                            var47 = class109.field1345[var20];
                            var45 = class406.field5868[var20];
                            var48 = var28 == null ? 0 : class161.field2133[var20];
                            var49 = class441.field6326[var20];
                            var50 = class389.field5495[var20];
                        }
                        int var51 = var46 + var48;
                        if (var51 <= 0) {
                            class313.method2069(arg9, var13, var15);
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
                            int[] var55 = arg5 ? new int[var54] : null;
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
                                var62 = var27.field5400;
                                var63 = arg1.method609() ? var27.field5412 : var27.field5398;
                                var64 = var27.field5401;
                                int var65 = class162.method1054(arg1, var27, false);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class138.field1721[0] = var47[var52];
                                        class138.field1721[1] = 1;
                                        class138.field1721[2] = var49[var52];
                                        class138.field1721[3] = 1;
                                        class138.field1721[4] = var50[var52];
                                        var68 = 6;
                                        class138.field1721[5] = var49[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class138.field1721[0] = var47[var52];
                                        class138.field1721[1] = 5;
                                        class138.field1721[2] = var49[var52];
                                        class138.field1721[3] = 5;
                                        class138.field1721[4] = var50[var52];
                                        class138.field1721[5] = var49[var52];
                                        var68 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class138.field1721[0] = var47[var52];
                                        class138.field1721[1] = 3;
                                        class138.field1721[2] = var49[var52];
                                        class138.field1721[3] = 3;
                                        class138.field1721[4] = var50[var52];
                                        class138.field1721[5] = var49[var52];
                                        var68 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class138.field1721[0] = var47[var52];
                                        class138.field1721[1] = 7;
                                        class138.field1721[2] = var49[var52];
                                        class138.field1721[3] = 7;
                                        class138.field1721[4] = var50[var52];
                                        var68 = 6;
                                        class138.field1721[5] = var49[var52];
                                    } else {
                                        class138.field1721[0] = var47[var52];
                                        class138.field1721[1] = var50[var52];
                                        var68 = 3;
                                        class138.field1721[2] = var49[var52];
                                    }
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class138.field1721[var69];
                                        int var71 = var70 - (var21 * 2) & 0x7;
                                        int var72 = class302.field4251[var70];
                                        int var73 = class91.field1100[var70];
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
                                        if (arg5 && class302.field4252[var20][var70]) {
                                            int var74 = (var13 << 7) + var57[var53];
                                            int var75 = (var15 << 7) + var58[var53];
                                            var55[var53] = arg3.method342(var74, var75) - arg4.method342(var74, var75);
                                        }
                                        if (var70 < 8 && class322.field4585[var71] > var27.field5410) {
                                            if (var56 != null) {
                                                var56[var53] = class146.field1790[var71];
                                            }
                                            var61[var53] = class261.field3735[var71];
                                            var60[var53] = class164.field2322[var71];
                                            var59[var53] = class93.field1124[var71];
                                        } else {
                                            if (var56 != null) {
                                                var56[var53] = var65;
                                            }
                                            var60[var53] = arg1.method609() ? var27.field5412 : var27.field5398;
                                            var61[var53] = var27.field5401;
                                            var59[var53] = var62;
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (!arg5 && arg9 == 0) {
                                    class191.method1294(var13, var15, var27.field5394, var27.field5397 * 8);
                                }
                                if (var20 != 12 && var27.field5400 != -1 && var27.field5409) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class35.field400[var20];
                            } else if (var18) {
                                var52 += class20.field267[var20];
                            } else {
                                var52 += class26.field331[var20];
                            }
                            if (var28 != null) {
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                class36 var76 = class258.method1729(-71, var23 - 1);
                                class36 var77 = class258.method1729(-76, var24 - 1);
                                class36 var78 = class258.method1729(-73, var25 - 1);
                                class36 var79 = class258.method1729(-89, var26 - 1);
                                for (int var80 = 0; var80 < var48; var80++) {
                                    boolean var81 = false;
                                    byte var82;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class138.field1721[0] = var47[var52];
                                        class138.field1721[1] = 1;
                                        class138.field1721[2] = var49[var52];
                                        class138.field1721[3] = 1;
                                        class138.field1721[4] = var50[var52];
                                        var82 = 6;
                                        class138.field1721[5] = var49[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class138.field1721[0] = var47[var52];
                                        class138.field1721[1] = 5;
                                        class138.field1721[2] = var49[var52];
                                        class138.field1721[3] = 5;
                                        class138.field1721[4] = var50[var52];
                                        class138.field1721[5] = var49[var52];
                                        var82 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class138.field1721[0] = var47[var52];
                                        class138.field1721[1] = 3;
                                        class138.field1721[2] = var49[var52];
                                        class138.field1721[3] = 3;
                                        class138.field1721[4] = var50[var52];
                                        class138.field1721[5] = var49[var52];
                                        var82 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class138.field1721[0] = var47[var52];
                                        class138.field1721[1] = 7;
                                        class138.field1721[2] = var49[var52];
                                        class138.field1721[3] = 7;
                                        class138.field1721[4] = var50[var52];
                                        var82 = 6;
                                        class138.field1721[5] = var49[var52];
                                    } else {
                                        class138.field1721[0] = var47[var52];
                                        class138.field1721[1] = var50[var52];
                                        class138.field1721[2] = var49[var52];
                                        var82 = 3;
                                    }
                                    for (int var83 = 0; var83 < var82; var83++) {
                                        int var84 = class138.field1721[var83];
                                        int var85 = var84 - var21 * 2 & 0x7;
                                        int var86 = class302.field4251[var84];
                                        int var87 = class91.field1100[var84];
                                        int var88;
                                        int var89;
                                        if (var21 == 1) {
                                            var88 = 128 - var86;
                                            var89 = var87;
                                        } else if (var21 == 2) {
                                            var88 = 128 - var87;
                                            var89 = 128 - var86;
                                        } else if (var21 == 3) {
                                            var89 = 128 - var87;
                                            var88 = var86;
                                        } else {
                                            var88 = var87;
                                            var89 = var86;
                                        }
                                        var57[var53] = var89;
                                        var58[var53] = var88;
                                        if (arg5 && class302.field4252[var20][var84]) {
                                            int var90 = (var13 << 7) + var89;
                                            int var91 = (var15 << 7) + var88;
                                            var55[var53] = arg3.method342(var90, var91) - arg4.method342(var90, var91);
                                        }
                                        if (var84 < 8 && class322.field4585[var85] >= 0) {
                                            if (var56 != null) {
                                                var56[var53] = class146.field1790[var85];
                                            }
                                            var61[var53] = class261.field3735[var85];
                                            var60[var53] = class164.field2322[var85];
                                            var59[var53] = class93.field1124[var85];
                                        } else {
                                            if (var18 && class302.field4252[var20][var84]) {
                                                var60[var53] = var63;
                                                var61[var53] = var64;
                                                var59[var53] = var62;
                                            } else if (var89 == 0 && var88 == 0) {
                                                var59[var53] = arg6[var13][var15];
                                                var60[var53] = var76.field421;
                                                var61[var53] = var76.field411;
                                            } else if (var89 == 0 && var88 == 128) {
                                                var59[var53] = arg6[var13][var16];
                                                var60[var53] = var77.field421;
                                                var61[var53] = var77.field411;
                                            } else if (var89 == 128 && var88 == 128) {
                                                var59[var53] = arg6[var14][var16];
                                                var60[var53] = var78.field421;
                                                var61[var53] = var78.field411;
                                            } else if (var89 == 128 && var88 == 0) {
                                                var59[var53] = arg6[var14][var15];
                                                var60[var53] = var79.field421;
                                                var61[var53] = var79.field411;
                                            } else {
                                                if (var89 < 64) {
                                                    if (var88 < 64) {
                                                        var60[var53] = var76.field421;
                                                        var61[var53] = var76.field411;
                                                    } else {
                                                        var60[var53] = var77.field421;
                                                        var61[var53] = var77.field411;
                                                    }
                                                } else if (var88 >= 64) {
                                                    var60[var53] = var78.field421;
                                                    var61[var53] = var78.field411;
                                                } else {
                                                    var60[var53] = var79.field421;
                                                    var61[var53] = var79.field411;
                                                }
                                                int var92 = class246.method1675(var89 << 7 >> 7, true, arg6[var13][var15], arg6[var14][var15]);
                                                int var93 = class246.method1675(var89 << 7 >> 7, true, arg6[var13][var16], arg6[var14][var16]);
                                                var59[var53] = class246.method1675(var88 << 7 >> 7, true, var92, var93);
                                            }
                                            if (var56 != null) {
                                                var56[var53] = var59[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (var20 != 0 && var28.field419) {
                                    var17 = true;
                                }
                            }
                            int var94 = arg4.method328(var13, var15);
                            int var95 = arg4.method328(var14, var15);
                            int var96 = arg4.method328(var14, var16);
                            int var97 = arg4.method328(var13, var16);
                            if (arg9 > 0) {
                                boolean var98 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var98 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field5396) {
                                    var98 = false;
                                }
                                if (var98 && var94 == var95 && var94 == var96 && var94 == var97) {
                                    class143.field1767[arg9][var13][var15] = (byte) class429.method2704(class143.field1767[arg9][var13][var15], 4);
                                }
                            }
                            int var99 = 0;
                            int var100 = 0;
                            if (arg5) {
                                var99 = class247.method1682(var13, var15);
                                var100 = class306.method2012(var13, var15);
                            }
                            arg4.method346(var13, var15, var57, var55, var58, var59, var56, var60, var61, var99, var100, var17);
                            class313.method2069(arg9, var13, var15);
                        }
                    }
                }
            }
        }
        field3805++;
    }
}
