import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class131 extends class253 {

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
    public static int field2283 = 0;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Ljd;")
    public static class85 field2286 = class221.method1499("T", (byte) -57);

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static volatile int field2293 = 0;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "Ljd;")
    public static class85 field2294 = class221.method1499("(U5", (byte) 111);

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Ljd;")
    public static class85 field2295 = class221.method1499("Bitte entfernen Sie ", (byte) 123);

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "Lve;")
    public static class184 field2289 = new class184(32);

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
    public int field2292;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public int field2300;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "[I")
    public int[] field2285;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "[I")
    public int[] field2291;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "[I")
    public int[] field2297;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "[Lhj;")
    public class69[] field2287;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "[Lhj;")
    public class69[] field2296;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "[[[B")
    public byte[][][] field2290;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBIIIIIIIII)V")
    public static final void method877(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field2284++;
        int var11 = arg7 - arg3;
        int var12 = arg9 - arg2;
        if (arg7 < class100.field1793) {
            var11++;
        }
        if (class79.field1458 > arg9) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var11; var13++) {
            int var44 = arg10 + (arg6 * var13) >> 16;
            int var45 = (var13 + 1) * arg6 + arg10 >> 16;
            int var46 = var45 - var44;
            if (var46 > 0) {
                int var47 = arg3 + var13 >> 6;
                if (var47 >= 0 && var47 <= (class100.field1794.length - 1)) {
                    int var48 = arg5 + var45;
                    int var49 = arg5 + var44;
                    int[][] var50 = class100.field1794[var47];
                    byte[][] var51 = class134.field2341[var47];
                    byte[][] var52 = class127.field2216[var47];
                    byte[][] var53 = class239.field4121[var47];
                    byte[][] var54 = class70.field1308[var47];
                    byte[][] var55 = class8.field109[var47];
                    for (int var56 = 0; var56 < var12; var56++) {
                        int var57 = arg4 * var56 + arg0 >> 16;
                        int var58 = (var56 + 1) * arg4 + arg0 >> 16;
                        int var59 = var58 - var57;
                        if (var59 > 0) {
                            int var60 = arg8 + var57;
                            int var61 = arg8 + var58;
                            int var62 = arg2 + var56 >> 6;
                            int var63 = var13 + arg3 & 0x3F;
                            int var64 = arg2 + var56 & 0x3F;
                            int var65 = (var64 << 6) + var63;
                            int var66;
                            if (var62 < 0 || var50.length - 1 < var62 || var50[var62] == null) {
                                if (class227.field3945.field1500 != -1) {
                                    var66 = class227.field3945.field1500;
                                } else if ((arg2 + var56 & 0x4) == (arg3 + var13 & 0x4)) {
                                    var66 = class154.field2666[class232.field4017 + 1];
                                } else {
                                    var66 = 4936552;
                                }
                                if (var62 < 0 || var62 > (var50.length - 1)) {
                                    if (var66 == 0) {
                                        var66 = 1;
                                    }
                                    class179.method1222(var49, var60, var46, var59, var66);
                                    continue;
                                }
                            } else {
                                var66 = var50[var62][var65];
                            }
                            int var67 = var51[var62] == null ? 0 : class154.field2666[var51[var62][var65] & 0xFF];
                            int var68 = var53[var62] == null ? 0 : class154.field2666[var53[var62][var65] & 0xFF];
                            if (var66 == 0) {
                                var66 = 1;
                            }
                            if (var67 == 0 && var68 == 0) {
                                class179.method1222(var49, var60, var46, var59, var66);
                            } else {
                                if (var67 != 0) {
                                    if (var67 == -1) {
                                        var67 = 1;
                                    }
                                    byte var69 = var52[var62] == null ? 0 : var52[var62][var65];
                                    int var70 = var69 & 0xFC;
                                    if (var70 == 0 || var46 <= 1 || var59 <= 1) {
                                        class179.method1222(var49, var60, var46, var59, var67);
                                    } else {
                                        class195.method1324(var59, var49, var60, var67, class179.field3068, var69 & 0x3, var70 >> 2, var46, var66, true, 7571);
                                    }
                                }
                                if (var68 != 0) {
                                    byte var71 = var55[var62][var65];
                                    int var72 = var71 & 0xFC;
                                    if (var68 == -1) {
                                        var68 = var66;
                                    }
                                    if (var72 == 0 || var46 <= 1 || var59 <= 1) {
                                        class179.method1222(var49, var60, var46, var59, var68);
                                    }
                                    class195.method1324(var59, var49, var60, var68, class179.field3068, var71 & 0x3, var72 >> 2, var46, 0, var67 == 0, 7571);
                                }
                            }
                            if (var54[var62] != null) {
                                int var73 = var54[var62][var65] & 0xFF;
                                if (var73 != 0) {
                                    int var74;
                                    if (var59 == 1) {
                                        var74 = var60;
                                    } else {
                                        var74 = var61 - 1;
                                    }
                                    int var75;
                                    if (var46 == 1) {
                                        var75 = var49;
                                    } else {
                                        var75 = var48 - 1;
                                    }
                                    int var76 = 13421772;
                                    if (var73 >= 5 && var73 <= 8 || var73 >= 13 && var73 <= 16 || var73 >= 21 && var73 <= 24 || var73 == 27 || var73 == 28) {
                                        var73 -= 4;
                                        var76 = 13369344;
                                    }
                                    if (var73 == 1) {
                                        class179.method1220(var49, var60, var59, var76);
                                    } else if (var73 == 2) {
                                        class179.method1214(var49, var60, var46, var76);
                                    } else if (var73 == 3) {
                                        class179.method1220(var75, var60, var59, var76);
                                    } else if (var73 == 4) {
                                        class179.method1214(var49, var74, var46, var76);
                                    } else if (var73 == 9) {
                                        class179.method1220(var49, var60, var59, 16777215);
                                        class179.method1214(var49, var60, var46, var76);
                                    } else if (var73 == 10) {
                                        class179.method1220(var75, var60, var59, 16777215);
                                        class179.method1214(var49, var60, var46, var76);
                                    } else if (var73 == 11) {
                                        class179.method1220(var75, var60, var59, 16777215);
                                        class179.method1214(var49, var74, var46, var76);
                                    } else if (var73 == 12) {
                                        class179.method1220(var49, var60, var59, 16777215);
                                        class179.method1214(var49, var74, var46, var76);
                                    } else if (var73 == 17) {
                                        class179.method1214(var49, var60, 1, var76);
                                    } else if (var73 == 18) {
                                        class179.method1214(var75, var60, 1, var76);
                                    } else if (var73 == 19) {
                                        class179.method1214(var75, var74, 1, var76);
                                    } else if (var73 == 20) {
                                        class179.method1214(var49, var74, 1, var76);
                                    } else if (var73 == 25) {
                                        for (int var78 = 0; var78 < var59; var78++) {
                                            class179.method1214(var49 + var78, var74 - var78, 1, var76);
                                        }
                                    } else if (var73 == 26) {
                                        for (int var77 = 0; var77 < var59; var77++) {
                                            class179.method1214(var49 + var77, var60 + var77, 1, var76);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var79 = arg5 + var44;
                    for (int var80 = 0; var80 < var12; var80++) {
                        int var82 = (arg4 * var80 + arg0 >> 16) + arg8;
                        int var83;
                        if (class227.field3945.field1500 != -1) {
                            var83 = class227.field3945.field1500;
                        } else if ((var13 + arg3 & 0x4) == (arg2 + var80 & 0x4)) {
                            var83 = class154.field2666[class232.field4017 + 1];
                        } else {
                            var83 = 4936552;
                        }
                        if (var83 == 0) {
                            var83 = 1;
                        }
                        int var84 = ((var80 + 1) * arg4 + arg0 >> 16) + arg8;
                        int var85 = var84 - var82;
                        class179.method1222(var79, var82, var46, var85, var83);
                    }
                    var10000 = arg5 + var45;
                }
            }
        }
        if (arg1 != 54) {
            field2293 = 37;
        }
        for (int var14 = -2; var14 < var11 + 2; var14++) {
            int var15 = arg10 + (arg6 * var14) >> 16;
            int var16 = (var14 + 1) * arg6 + arg10 >> 16;
            int var17 = var16 - var15;
            if (var17 > 0) {
                var10000 = arg5 + var16;
                int var19 = arg5 + var15;
                int var20 = var14 + arg3 >> 6;
                if (var20 >= 0 && (class35.field545.length - 1) >= var20) {
                    short[][] var21 = class35.field545[var20];
                    for (int var22 = -2; var22 < (var12 + 2); var22++) {
                        int var23 = arg4 * var22 + arg0 >> 16;
                        int var24 = (var22 + 1) * arg4 + arg0 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            int var26 = arg2 + var22 >> 6;
                            var10000 = arg8 + var24;
                            int var28 = arg8 + var23;
                            if (var26 >= 0 && (var21.length - 1) >= var26) {
                                int var29 = ((arg2 + var22 & 0x3F) << 6) + (arg3 + var14 & 0x3F);
                                if (var21[var26] != null) {
                                    int var30 = var21[var26][var29] & 0x3FFF;
                                    int var31 = var21[var26][var29] >> 14 & 0x3;
                                    if (var30 != 0) {
                                        if (var31 == 0) {
                                            int var32 = class236.field4074[var30 - 1].field4020 * var17 / 4;
                                            int var33 = class236.field4074[var30 - 1].field4012 * var25 / 4;
                                            int var34 = class236.field4074[var30 - 1].field3994 * var25 / 4;
                                            class236.field4074[var30 - 1].method716(var19, var28 - var34, var32, var33);
                                        } else if (var31 == 1) {
                                            int var35 = class118.field2105[var30 - 1].field4012 * var25 / 4;
                                            int var36 = class118.field2105[var30 - 1].field4020 * var17 / 4;
                                            int var37 = class118.field2105[var30 - 1].field3994 * var25 / 4;
                                            class118.field2105[var30 - 1].method716(var19, var28 - var37, var36, var35);
                                        } else if (var31 == 2) {
                                            int var41 = class28.field434[var30 - 1].field4012 * var25 / 4;
                                            int var42 = class28.field434[var30 - 1].field4020 * var17 / 4;
                                            int var43 = class28.field434[var30 - 1].field3994 * var25 / 4;
                                            class28.field434[var30 - 1].method716(var19, var28 - var43, var42, var41);
                                        } else if (var31 == 3) {
                                            int var38 = class255.field4427[var30 - 1].field4012 * var25 / 4;
                                            int var39 = class255.field4427[var30 - 1].field4020 * var17 / 4;
                                            int var40 = class255.field4427[var30 - 1].field3994 * var25 / 4;
                                            class255.field4427[var30 - 1].method716(var19, var28 - var40, var39, var38);
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

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIII)V")
    public static final void method878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2282++;
        if (arg4 != -25063) {
            return;
        }
        long var6 = class116.method818(arg2, arg3, arg0);
        if (var6 != 0L) {
            int var8 = (int) var6 >> 14 & 0x1F;
            int var9 = arg5;
            int var10 = ((int) var6 & 0x354017) >> 20;
            if (var6 > 0L) {
                var9 = arg1;
            }
            int[] var11 = class179.field3068;
            int var12 = (103 - arg0) * 512 * 4 + arg3 * 4 + 24624;
            int var13 = (int) (var6 >>> 32) & Integer.MAX_VALUE;
            class199 var14 = class110.method753(var13, (byte) 117);
            if (var14.field3424 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var10 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var10 == 1) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var10 == 2) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 512 + 3] = var9;
                        var11[var12 + 1027] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    } else if (var10 == 3) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1 + 1536] = var9;
                        var11[var12 + 1536 + 2] = var9;
                        var11[var12 + 1536 + 3] = var9;
                    }
                }
                if (var8 == 3) {
                    if (var10 == 0) {
                        var11[var12] = var9;
                    } else if (var10 == 1) {
                        var11[var12 + 3] = var9;
                    } else if (var10 == 2) {
                        var11[var12 + 1539] = var9;
                    } else if (var10 == 3) {
                        var11[var12 + 1536] = var9;
                    }
                }
                if (var8 == 2) {
                    if (var10 == 3) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var10 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var10 == 1) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 512 + 3] = var9;
                        var11[var12 + 3 + 1024] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    } else if (var10 == 2) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1537] = var9;
                        var11[var12 + 2 + 1536] = var9;
                        var11[var12 + 1536 + 3] = var9;
                    }
                }
            } else {
                class103 var15 = null;
                if (!var14.field3431) {
                    var15 = class212.field3720[var14.field3424];
                } else if (var10 == 0) {
                    var15 = class212.field3720[var14.field3424];
                } else if (var10 == 1) {
                    var15 = class159.field2707[var14.field3424];
                } else if (var10 == 2) {
                    var15 = class156.field2675[var14.field3424];
                } else if (var10 == 3) {
                    var15 = class97.field1751[var14.field3424];
                }
                if (var15 != null) {
                    int var16 = (var14.field3473 * 4 - var15.field4003) / 2;
                    int var17 = (var14.field3464 * 4 - var15.field3994) / 2;
                    var15.method713(arg3 * 4 + var16 + 48, (-var14.field3464 + -arg0 + 104) * 4 + 48 + var17);
                }
            }
        }
        long var18 = class67.method447(arg2, arg3, arg0);
        if (var18 != 0L) {
            int var20 = ((int) var18 & 0x334E36) >> 20;
            int var21 = ((int) var18 & 0x7E5C8) >> 14;
            int var22 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            class199 var23 = class110.method753(var22, (byte) 124);
            if (var23.field3424 != -1) {
                class103 var27 = null;
                if (!var23.field3431) {
                    var27 = class212.field3720[var23.field3424];
                } else if (var20 == 0) {
                    var27 = class212.field3720[var23.field3424];
                } else if (var20 == 1) {
                    var27 = class159.field2707[var23.field3424];
                } else if (var20 == 2) {
                    var27 = class156.field2675[var23.field3424];
                } else if (var20 == 3) {
                    var27 = class97.field1751[var23.field3424];
                }
                if (var27 != null) {
                    int var28 = (var23.field3473 * 4 - var27.field4003) / 2;
                    int var29 = (var23.field3464 * 4 - var27.field3994) / 2;
                    var27.method713(arg3 * 4 + var28 + 48, (-var23.field3464 + -arg0 + 104) * 4 + (48 - -var29));
                }
            } else if (var21 == 9) {
                int var24 = 15658734;
                int[] var25 = class179.field3068;
                if (var18 > 0L) {
                    var24 = 15597568;
                }
                int var26 = (103 - arg0) * 2048 + arg3 * 4 + 24624;
                if (var20 == 0 || var20 == 2) {
                    var25[var26 + 1536] = var24;
                    var25[var26 + 1025] = var24;
                    var25[var26 + 2 + 512] = var24;
                    var25[var26 + 3] = var24;
                } else {
                    var25[var26] = var24;
                    var25[var26 + 512 + 1] = var24;
                    var25[var26 + 1024 + 2] = var24;
                    var25[var26 + 3 + 1536] = var24;
                }
            }
        }
        long var30 = class95.method679(arg2, arg3, arg0);
        if (var30 == 0L) {
            return;
        }
        int var32 = ((int) var30 & 0x382D27) >> 20;
        int var33 = (int) (var30 >>> 32) & Integer.MAX_VALUE;
        class199 var34 = class110.method753(var33, (byte) 121);
        if (var34.field3424 == -1) {
            return;
        }
        class103 var35 = null;
        if (!var34.field3431) {
            var35 = class212.field3720[var34.field3424];
        } else if (var32 == 0) {
            var35 = class212.field3720[var34.field3424];
        } else if (var32 == 1) {
            var35 = class159.field2707[var34.field3424];
        } else if (var32 == 2) {
            var35 = class156.field2675[var34.field3424];
        } else if (var32 == 3) {
            var35 = class97.field1751[var34.field3424];
        }
        if (var35 != null) {
            int var36 = (var34.field3473 * 4 - var35.field4003) / 2;
            int var37 = (var34.field3464 * 4 - var35.field3994) / 2;
            var35.method713(arg3 * 4 + var36 + 48, 48 - -((-arg0 + 104 + -var34.field3464) * 4) - -var37);
            return;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
    public static void method879(int arg0) {
        field2295 = null;
        if (arg0 >= -43) {
            method880((class68) null, 95);
        }
        field2294 = null;
        field2286 = null;
        field2289 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lge;I)I")
    public static final int method880(class68 arg0, int arg1) {
        field2299++;
        int var2 = 0;
        if (arg1 != -25612) {
            method880((class68) null, 5);
        }
        if (arg0.method468(true, class203.field3540)) {
            var2++;
        }
        if (arg0.method468(true, class184.field3160)) {
            var2++;
        }
        if (arg0.method468(true, class244.field4178)) {
            var2++;
        }
        if (arg0.method468(true, class24.field340)) {
            var2++;
        }
        if (arg0.method468(true, class175.field3007)) {
            var2++;
        }
        if (arg0.method468(true, class119.field2122)) {
            var2++;
        }
        if (arg0.method468(true, class56.field981)) {
            var2++;
        }
        if (arg0.method468(true, class111.field1941)) {
            var2++;
        }
        if (arg0.method468(true, class183.field3137)) {
            var2++;
        }
        if (arg0.method468(true, class185.field3190)) {
            var2++;
        }
        if (arg0.method468(true, class70.field1306)) {
            var2++;
        }
        if (arg0.method468(true, class246.field4207)) {
            var2++;
        }
        if (arg0.method468(true, class56.field989)) {
            var2++;
        }
        var2++;
        if (arg0.method468(true, class197.field3386)) {
            var2++;
        }
        if (arg0.method468(true, class115.field2060)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)I")
    public static final int method881(byte arg0, int arg1) {
        field2281++;
        if (arg0 <= 116) {
            field2294 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method882(Component arg0, int arg1) {
        field2288++;
        arg0.addMouseListener(class168.field2886);
        if (arg1 == 48) {
            arg0.addMouseMotionListener(class168.field2886);
            arg0.addFocusListener(class168.field2886);
        }
    }
}
