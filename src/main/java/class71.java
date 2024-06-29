import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class71 extends class95 {

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Lvf;")
    public static class265 field1364 = class87.method582(-46, "(U (X");

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field1366 = -1;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method500(int arg0) {
        if (arg0 <= -56) {
            field1364 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(ZI)V")
    public static final void method501(boolean arg0, int arg1) {
        field1365++;
        class178 var2 = class188.method1282(arg1, 1, 261360480);
        if (!arg0) {
            var2.method1160(119);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method502(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class68.field1296++;
        class25.field694 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class237.field4134; var12 < class64.field1244; var12++) {
            class137[][] var38 = class200.field3577[var12];
            for (int var39 = class164.field2984; var39 < class243.field4249; var39++) {
                for (int var40 = class118.field2084; var40 < class267.field4701; var40++) {
                    class137 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class210.field3776[var39 + class168.field3045 - class233.field4110][var40 + class168.field3045 - class281.field4961] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field2507 = true;
                            var41.field2517 = true;
                            if (var41.field2502 > 0) {
                                var41.field2503 = true;
                            } else {
                                var41.field2503 = false;
                            }
                            class25.field694++;
                        } else {
                            var41.field2507 = false;
                            var41.field2517 = false;
                            var41.field2515 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field2518 != null) {
                                    class144 var42 = var41.field2518;
                                    var42.field2682.method173(0, var12, var42.field2692, var42.field2697, var42.field2691);
                                    if (var42.field2694 != null) {
                                        var42.field2694.method173(0, var12, var42.field2692, var42.field2697, var42.field2691);
                                    }
                                }
                                if (var41.field2510 != null) {
                                    class200 var43 = var41.field2510;
                                    var43.field3572.method173(var43.field3574, var12, var43.field3576, var43.field3581, var43.field3578);
                                    if (var43.field3567 != null) {
                                        var43.field3567.method173(var43.field3574, var12, var43.field3576, var43.field3581, var43.field3578);
                                    }
                                }
                                if (var41.field2501 != null) {
                                    class8 var44 = var41.field2501;
                                    var44.field270.method173(0, var12, var44.field269, var44.field280, var44.field277);
                                }
                                if (var41.field2506 != null) {
                                    for (int var45 = 0; var45 < var41.field2502; var45++) {
                                        class146 var46 = var41.field2506[var45];
                                        var46.field2737.method173(var46.field2724, var12, var46.field2725, var46.field2738, var46.field2739);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class279.field4936 == class141.field2619;
        for (int var14 = class237.field4134; var14 < class64.field1244; var14++) {
            class137[][] var27 = class200.field3577[var14];
            for (int var28 = -class168.field3045; var28 <= 0; var28++) {
                int var29 = class233.field4110 + var28;
                int var30 = class233.field4110 - var28;
                if (var29 >= class164.field2984 || var30 < class243.field4249) {
                    for (int var31 = -class168.field3045; var31 <= 0; var31++) {
                        int var32 = class281.field4961 + var31;
                        int var33 = class281.field4961 - var31;
                        if (var29 >= class164.field2984) {
                            if (var32 >= class118.field2084) {
                                class137 var34 = var27[var29][var32];
                                if (var34 != null && var34.field2507) {
                                    class110.method730(var34, true);
                                }
                            }
                            if (var33 < class267.field4701) {
                                class137 var35 = var27[var29][var33];
                                if (var35 != null && var35.field2507) {
                                    class110.method730(var35, true);
                                }
                            }
                        }
                        if (var30 < class243.field4249) {
                            if (var32 >= class118.field2084) {
                                class137 var36 = var27[var30][var32];
                                if (var36 != null && var36.field2507) {
                                    class110.method730(var36, true);
                                }
                            }
                            if (var33 < class267.field4701) {
                                class137 var37 = var27[var30][var33];
                                if (var37 != null && var37.field2507) {
                                    class110.method730(var37, true);
                                }
                            }
                        }
                        if (class25.field694 == 0) {
                            if (!var13) {
                                class193.field3478 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class237.field4134; var15 < class64.field1244; var15++) {
            class137[][] var16 = class200.field3577[var15];
            for (int var17 = -class168.field3045; var17 <= 0; var17++) {
                int var18 = class233.field4110 + var17;
                int var19 = class233.field4110 - var17;
                if (var18 >= class164.field2984 || var19 < class243.field4249) {
                    for (int var20 = -class168.field3045; var20 <= 0; var20++) {
                        int var21 = class281.field4961 + var20;
                        int var22 = class281.field4961 - var20;
                        if (var18 >= class164.field2984) {
                            if (var21 >= class118.field2084) {
                                class137 var23 = var16[var18][var21];
                                if (var23 != null && var23.field2507) {
                                    class110.method730(var23, false);
                                }
                            }
                            if (var22 < class267.field4701) {
                                class137 var24 = var16[var18][var22];
                                if (var24 != null && var24.field2507) {
                                    class110.method730(var24, false);
                                }
                            }
                        }
                        if (var19 < class243.field4249) {
                            if (var21 >= class118.field2084) {
                                class137 var25 = var16[var19][var21];
                                if (var25 != null && var25.field2507) {
                                    class110.method730(var25, false);
                                }
                            }
                            if (var22 < class267.field4701) {
                                class137 var26 = var16[var19][var22];
                                if (var26 != null && var26.field2507) {
                                    class110.method730(var26, false);
                                }
                            }
                        }
                        if (class25.field694 == 0) {
                            if (!var13) {
                                class193.field3478 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class193.field3478 = false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)J")
    public static final long method503(int arg0, int arg1, int arg2) {
        class137 var3 = class200.field3577[arg0][arg1][arg2];
        return var3 == null || var3.field2510 == null ? 0L : var3.field2510.field3565;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIILnc;)V")
    public static final void method504(int arg0, int arg1, int arg2, int arg3, class122 arg4) {
        field1368++;
        if (class214.field3827 == arg4 || class120.field2129 >= 400) {
            return;
        }
        if (arg2 != 19645) {
            field1367 = 49;
        }
        class265 var11;
        if (arg4.field2201 == 0) {
            boolean var5 = true;
            if (class214.field3827.field2160 != -1 && arg4.field2160 != -1) {
                int var6 = class214.field3827.field2177 - arg4.field2177;
                if (var6 < 0) {
                    var6 = -var6;
                }
                int var7 = arg4.field2160 <= class214.field3827.field2160 ? arg4.field2160 : class214.field3827.field2160;
                int var8 = class214.field3827.field2177 > arg4.field2177 ? class214.field3827.field2177 : arg4.field2177;
                int var9 = var8 * 10 / 100 + var7 + 5;
                if (var6 > var9) {
                    var5 = false;
                }
            }
            class265 var10 = class229.field4051 == 1 ? class8.field276 : class237.field4144;
            if (arg4.field2169 <= arg4.field2177) {
                var11 = class148.method1022(arg2 ^ 0x4CB7, new class265[] { arg4.method824((byte) 92), var5 ? class45.method379(arg4.field2177, class214.field3827.field2177, 16777215) : class269.field4792, class163.field2974, var10, class241.method1609(true, arg4.field2177), class176.field3142 });
            } else {
                var11 = class148.method1022(10, new class265[] { arg4.method824((byte) 92), var5 ? class45.method379(arg4.field2177, class214.field3827.field2177, 16777215) : class269.field4792, class163.field2974, var10, class241.method1609(true, arg4.field2177), class217.field3905, class241.method1609(true, arg4.field2169 - arg4.field2177), class176.field3142 });
            }
        } else {
            var11 = class148.method1022(10, new class265[] { arg4.method824((byte) 109), class163.field2974, class111.field1934, class241.method1609(true, arg4.field2201), class176.field3142 });
        }
        if (class282.field4969 == 1) {
            class160.field2924++;
            class182.method1213(false, class205.field3694, (short) 33, class148.method1022(arg2 - 19635, new class265[] { class9.field305, class264.field4605, var11 }), class104.field1846, arg1, (long) arg0, arg3);
        } else if (!class25.field695) {
            for (int var12 = 7; var12 >= 0; var12--) {
                if (class143.field2660[var12] != null) {
                    class7.field258++;
                    short var13 = 0;
                    boolean var14 = false;
                    if (class229.field4051 == 0 && class143.field2660[var12].method1791(class171.field3093, (byte) -98)) {
                        if (class214.field3827.field2177 < arg4.field2177) {
                            var13 = 2000;
                        }
                        if (class214.field3827.field2185 != 0 && arg4.field2185 != 0) {
                            if (class214.field3827.field2185 == arg4.field2185) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class79.field1496[var12]) {
                        var13 = 2000;
                    }
                    short var15 = class166.field2996[var12];
                    short var16 = (short) (var13 + var15);
                    class182.method1213(false, class143.field2660[var12], var16, class148.method1022(10, new class265[] { class269.field4792, var11 }), class27.field719[var12], arg1, (long) arg0, arg3);
                }
            }
        } else if ((class38.field874 & 0x8) == 8) {
            class171.field3085++;
            class182.method1213(false, class239.field4170, (short) 12, class148.method1022(10, new class265[] { class130.field2286, class264.field4605, var11 }), -1, arg1, (long) arg0, arg3);
        }
        for (int var17 = 0; var17 < class120.field2129; var17++) {
            if (class118.field2079[var17] == 6) {
                class40.field924[var17] = class148.method1022(arg2 - 19635, new class265[] { class269.field4792, var11 });
                return;
            }
        }
    }
}
