import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class99 {

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field1440 = 0;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1434 = 50;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "[I")
    public static int[] field1441 = new int[field1434];

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "[I")
    public static int[] field1437 = new int[field1434];

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1435 = "M";

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1430 = new String[field1434];

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "[I")
    public static int[] field1442 = new int[field1434];

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[I")
    public static int[] field1432 = new int[field1434];

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[I")
    public static int[] field1444 = new int[field1434];

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1439 = " from your ignore list first.";

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "[I")
    public static int[] field1445 = new int[field1434];

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "[I")
    public static int[] field1446 = new int[field1434];

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "Lah;")
    public static class176 field1447;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Lnm;")
    public static class221 field1433;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lnm;")
    public static class221 field1438;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILfh;I)V", line = 37)
    public static final void method653(int arg0, class313 arg1, int arg2) {
        field1429++;
        if (arg0 >= -124) {
            field1446 = (int[]) null;
        }
        if (class163.field2584 == null) {
            return;
        }
        try {
            class163.field2584.method1756(0, 0L);
            class163.field2584.method1755(arg2, arg1.field5124, 24, 100);
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([[BI[Lni;[[F[[F[[B[[BIB[[B[[I[[F)V", line = 82)
    public static final void method654(byte[][] arg0, int arg1, class241[] arg2, float[][] arg3, float[][] arg4, byte[][] arg5, byte[][] arg6, int arg7, byte arg8, byte[][] arg9, int[][] arg10, float[][] arg11) {
        if (arg8 != -18) {
            field1432 = (int[]) null;
        }
        for (int var12 = 0; var12 < arg1; var12++) {
            class241 var13 = arg2[var12];
            if (var13.field3784 == arg7) {
                class330 var14 = new class330();
                int var15 = 0;
                int var16 = (var13.field3783 >> 7) - var13.field3806;
                int var17 = (var13.field3807 >> 7) - var13.field3806;
                if (var17 < 0) {
                    var15 -= var17;
                    var17 = 0;
                }
                int var18 = (var13.field3807 >> 7) + var13.field3806;
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field3804[var15];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg9[var23][var19] & 0xFF;
                        int var25 = arg0[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class266 var31 = class52.method382(-115, var25 - 1);
                            if (var31.field4372 == -1) {
                                continue;
                            }
                            if (arg5[var23][var19] != 0) {
                                int[] var55 = class146.field2357[arg5[var23][var19]];
                                var14.field5395 += (var55.length >> 1) * 3 - 6;
                                var14.field5398 += var55.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class266 var27 = class52.method382(-109, var25 - 1);
                            if (var27.field4372 == -1) {
                                byte var28 = arg5[var23][var19];
                                if (var28 != 0) {
                                    int[] var29 = class16.field211[var28];
                                    var14.field5395 += ((var29.length >> 1) - 2) * 3;
                                    var14.field5398 += var29.length >> 1;
                                }
                                continue;
                            }
                            byte var30 = arg5[var23][var19];
                            if (var30 != 0) {
                                var26 = true;
                            }
                        }
                        class258 var32 = class161.method1139(arg7, var23, var19);
                        if (var32 != null) {
                            int var33 = (int) (var32.field4076 >> 14) & 0x3F;
                            if (var33 == 9) {
                                int[] var34 = null;
                                int var35 = (int) (var32.field4076 >> 20) & 0x3;
                                if ((var35 & 0x1) == 0) {
                                    boolean var36 = var21 <= (var23 - 1);
                                    if (!var36 && var18 >= (var19 + 1)) {
                                        short var37 = var13.field3804[var15 + 1];
                                        int var38 = var16 + (var37 >> 8);
                                        int var39 = (var37 & 0xFF) + var38;
                                        var36 = var38 < var23 && var23 < var39;
                                    }
                                    boolean var40 = var22 >= var23 + 1;
                                    if (!var40 && var19 - 1 >= var17) {
                                        short var41 = var13.field3804[var15 - 1];
                                        int var42 = (var41 >> 8) + var16;
                                        int var43 = (var41 & 0xFF) + var42;
                                        var40 = var42 < var23 && var23 < var43;
                                    }
                                    if (var36 && var40) {
                                        var34 = class146.field2357[0];
                                    } else if (var36) {
                                        var34 = class146.field2357[1];
                                    } else if (var40) {
                                        var34 = class146.field2357[1];
                                    }
                                } else {
                                    boolean var44 = var22 >= var23 + 1;
                                    boolean var45 = var21 <= var23 - 1;
                                    if (!var45 && var17 <= (var19 - 1)) {
                                        short var46 = var13.field3804[var15 - 1];
                                        int var47 = (var46 >> 8) + var16;
                                        int var48 = (var46 & 0xFF) + var47;
                                        var45 = var47 < var23 && var48 > var23;
                                    }
                                    if (!var44 && var18 >= (var19 + 1)) {
                                        short var49 = var13.field3804[var15 + 1];
                                        int var50 = (var49 >> 8) + var16;
                                        int var51 = (var49 & 0xFF) + var50;
                                        var44 = var23 > var50 && var51 > var23;
                                    }
                                    if (var45 && var44) {
                                        var34 = class146.field2357[0];
                                    } else if (var45) {
                                        var34 = class146.field2357[1];
                                    } else if (var44) {
                                        var34 = class146.field2357[1];
                                    }
                                }
                                if (var34 != null) {
                                    var14.field5395 += ((var34.length >> 1) - 2) * 3;
                                    var14.field5398 += var34.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var53 = class146.field2357[arg5[var23][var19]];
                            int[] var54 = class16.field211[arg5[var23][var19]];
                            var14.field5395 += (var53.length >> 1) * 3 - 6;
                            var14.field5395 += ((var54.length >> 1) - 2) * 3;
                            var14.field5398 += var53.length >> 1;
                            var14.field5398 += var54.length >> 1;
                        } else {
                            int[] var52 = class146.field2357[0];
                            var14.field5395 += (var52.length >> 1) * 3 - 6;
                            var14.field5398 += var52.length >> 1;
                        }
                    }
                    var15++;
                }
                int var56 = 0;
                var14.method2355();
                if (((var13.field3807 >> 7) - var13.field3806) < 0) {
                    var56 -= (var13.field3807 >> 7) - var13.field3806;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field3804[var56];
                    int var59 = var16 + (var58 >> 8);
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        int var62 = arg0[var61][var57] & 0xFF;
                        int var63 = arg9[var61][var57] & 0xFF;
                        boolean var64 = false;
                        byte var65 = arg6[var61][var57];
                        if (var63 == 0) {
                            if (var62 == 0) {
                                continue;
                            }
                            class266 var68 = class52.method382(-116, var62 - 1);
                            if (var68.field4372 == -1) {
                                continue;
                            }
                            if (arg5[var61][var57] != 0) {
                                class307.method2145(var61, arg10, class146.field2357[arg5[var61][var57]], arg11, arg6[var61][var57], var14, var57, arg3, var13, -1, arg4);
                                continue;
                            }
                        } else if (var62 != 0) {
                            class266 var66 = class52.method382(arg8 ^ 0x73, var62 - 1);
                            if (var66.field4372 == -1) {
                                class307.method2145(var61, arg10, class16.field211[arg5[var61][var57]], arg11, arg6[var61][var57], var14, var57, arg3, var13, -1, arg4);
                                continue;
                            }
                            byte var67 = arg5[var61][var57];
                            if (var67 != 0) {
                                var64 = true;
                            }
                        }
                        class258 var69 = class161.method1139(arg7, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field4076 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int[] var71 = null;
                                int var72 = (int) (var69.field4076 >> 20) & 0x3;
                                if ((var72 & 0x1) == 0) {
                                    boolean var73 = var59 <= var61 - 1;
                                    boolean var74 = var60 >= (var61 + 1);
                                    if (!var73 && (var57 + 1) <= var18) {
                                        short var75 = var13.field3804[var56 + 1];
                                        int var76 = (var75 >> 8) + var16;
                                        int var77 = (var75 & 0xFF) + var76;
                                        var73 = var61 > var76 && var77 > var61;
                                    }
                                    if (!var74 && var17 <= var57 - 1) {
                                        short var78 = var13.field3804[var56 - 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var74 = var79 < var61 && var80 > var61;
                                    }
                                    if (var73 && var74) {
                                        var71 = class146.field2357[0];
                                    } else if (var73) {
                                        var71 = class146.field2357[1];
                                        var65 = 1;
                                    } else if (var74) {
                                        var65 = 3;
                                        var71 = class146.field2357[1];
                                    }
                                } else {
                                    boolean var81 = var59 <= (var61 - 1);
                                    boolean var82 = var61 + 1 <= var60;
                                    if (!var81 && var57 - 1 >= var17) {
                                        short var83 = var13.field3804[var56 - 1];
                                        int var84 = (var83 >> 8) + var16;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var61 > var84 && var85 > var61;
                                    }
                                    if (!var82 && var18 >= var57 + 1) {
                                        short var86 = var13.field3804[var56 + 1];
                                        int var87 = var16 + (var86 >> 8);
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var61 > var87 && var88 > var61;
                                    }
                                    if (var81 && var82) {
                                        var71 = class146.field2357[0];
                                    } else if (var81) {
                                        var65 = 0;
                                        var71 = class146.field2357[1];
                                    } else if (var82) {
                                        var71 = class146.field2357[1];
                                        var65 = 2;
                                    }
                                }
                                if (var71 != null) {
                                    class307.method2145(var61, arg10, var71, arg11, var65, var14, var57, arg3, var13, -1, arg4);
                                }
                                continue;
                            }
                        }
                        if (var64) {
                            class307.method2145(var61, arg10, class16.field211[arg5[var61][var57]], arg11, arg6[var61][var57], var14, var57, arg3, var13, -1, arg4);
                            class307.method2145(var61, arg10, class146.field2357[arg5[var61][var57]], arg11, arg6[var61][var57], var14, var57, arg3, var13, -1, arg4);
                        } else {
                            class307.method2145(var61, arg10, class146.field2357[0], arg11, var65, var14, var57, arg3, var13, -1, arg4);
                        }
                    }
                    var56++;
                }
                if (var14.field5394 > 0 && var14.field5400 > 0) {
                    var14.method2354();
                    var13.field3792 = var14;
                }
            }
        }
        field1436++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V", line = 606)
    public static void method655(int arg0) {
        field1446 = null;
        if (arg0 != 2) {
            return;
        }
        field1439 = null;
        field1435 = null;
        field1432 = null;
        field1430 = null;
        field1444 = null;
        field1433 = null;
        field1437 = null;
        field1447 = null;
        field1438 = null;
        field1445 = null;
        field1442 = null;
        field1441 = null;
    }
}
