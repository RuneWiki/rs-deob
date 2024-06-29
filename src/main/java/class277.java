import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class277 {

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4463 = null;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field4469 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "Lak;")
    public static class172 field4465;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "[[I")
    public static int[][] field4466;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 9)
    public static final void method2004(int arg0) {
        field4462++;
        int var1 = 102 % ((-arg0 - 36) / 40);
        int var2 = class334.method2334((byte) -111);
        if (var2 == 0) {
            class7.field101 = (byte[][][]) null;
            class32.method177(false, 0);
        } else if (var2 == 1) {
            class193.method1429(-128, (byte) 0);
            class32.method177(false, 512);
            if (class129.field2025 != null) {
                class69.method456(true);
            }
        } else {
            class193.method1429(-128, (byte) (class97.field1385 - 4 & 0xFF));
            class32.method177(false, 2);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 47)
    public static final void method2005(int arg0, String arg1, int arg2) {
        if (arg2 < 105) {
            method2007(56);
        }
        field4470++;
        class344 var3 = class110.method759(3, arg0, false);
        var3.method2390((byte) -27);
        var3.field5352 = arg1;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V", line = 61)
    public static final void method2006(int arg0, byte arg1) {
        if (arg1 > -22) {
            field4465 = (class172) null;
        }
        field4468++;
        class344 var2 = class110.method759(11, arg0, false);
        var2.method2384(-27354);
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V", line = 75)
    public static void method2007(int arg0) {
        int var1 = -1 % ((arg0 - 35) / 43);
        field4466 = (int[][]) null;
        field4465 = null;
        field4463 = null;
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V", line = 90)
    public static final void method2008(int arg0) {
        if (arg0 != 0) {
            field4465 = (class172) null;
        }
        class279.field4492.method702((byte) 127);
        field4464++;
        class106.field1572.method702((byte) 120);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZIIIILac;ZBII)V", line = 111)
    public static final void method2009(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, class108 arg6, boolean arg7, byte arg8, int arg9, int arg10) {
        field4467++;
        if (arg1 && !class76.method518(-19076) && (class129.field2025[0][arg4][arg2] & 0x2) == 0) {
            if ((class129.field2025[arg5][arg4][arg2] & 0x10) != 0) {
                return;
            }
            if (class208.method1510(arg5, 0, arg4, arg2) != class236.field3781) {
                return;
            }
        }
        if (arg5 < class101.field1478) {
            class101.field1478 = arg5;
        }
        class97 var11 = class69.method454(false, arg0);
        if (class232.field3690 && var11.field1348) {
            return;
        }
        int var12;
        int var13;
        if (arg10 == 1 || arg10 == 3) {
            var13 = var11.field1343;
            var12 = var11.field1337;
        } else {
            var12 = var11.field1343;
            var13 = var11.field1337;
        }
        int var14;
        int var15;
        if (arg4 + var13 > 104) {
            var14 = arg4 + 1;
            var15 = arg4;
        } else {
            var14 = arg4 + (var13 + 1 >> 1);
            var15 = (var13 >> 1) + arg4;
        }
        int var16;
        int var17;
        if (arg2 + var12 <= 104) {
            var16 = (var12 + 1 >> 1) + arg2;
            var17 = (var12 >> 1) + arg2;
        } else {
            var16 = arg2 + 1;
            var17 = arg2;
        }
        int[][] var18 = class110.field1642[arg9];
        int var19 = (arg4 << 7) + (var13 << 6);
        int var20 = var18[var15][var16] + var18[var15][var17] + var18[var14][var17] + var18[var14][var16] >> 2;
        int var21 = (arg2 << 7) + (var12 << 6);
        int var22 = 0;
        if (class232.field3690 && arg9 != 0) {
            int[][] var23 = class110.field1642[0];
            var22 = var20 - (var23[var15][var17] + var23[var14][var17] + var23[var15][var16] + var23[var14][var16] >> 2);
        }
        int[][] var24 = (int[][]) null;
        long var25 = (long) (arg10 | 0x400 << 20 | arg3 << 14 | arg4 | arg2 << 7);
        if (arg7) {
            var24 = class97.field1380[0];
        } else if (arg9 < 3) {
            var24 = class110.field1642[arg9 + 1];
        }
        if (var11.field1321 == 0 || arg7) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field1354 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field1342) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg0 << 32;
        if (var11.method647(127)) {
            class215.method1546(var11, 128, (class334) null, arg5, (class234) null, arg4, arg2, arg10);
        }
        boolean var29 = var11.field1364 & !arg7;
        int var30 = var11.field1351;
        if (arg3 == 22) {
            if (class297.field4695 || var11.field1321 != 0 || var11.field1333 == 1 || var11.field1313) {
                class7 var32;
                if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                    class67 var31 = var11.method657(arg10, -97, (class326) null, var21, var19, var29, 22, var24, var18, var20, arg1);
                    if (class232.field3690 && var29) {
                        class241.method1724(var31.field959, var19, var22, var21);
                    }
                    var32 = var31.field964;
                } else {
                    var32 = new class175(arg0, 22, arg10, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
                }
                class143.method1056(arg5, arg4, arg2, var20, var32, var27, var11.field1377);
                if (var11.field1333 == 1 && arg6 != null) {
                    arg6.method742(268435456, arg4, arg2);
                }
            }
        } else if (arg3 == 10 || arg3 == 11) {
            class7 var74;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                class67 var73 = var11.method657(arg3 == 11 ? arg10 + 4 : arg10, 81, (class326) null, var21, var19, var29, 10, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var73.field959, var19, var22, var21);
                }
                var74 = var73.field964;
            } else {
                var74 = new class175(arg0, 10, arg3 == 11 ? arg10 + 4 : arg10, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            if (var74 != null) {
                boolean var75 = class64.method429(arg5, arg4, arg2, var20, var13, var12, var74, 0, var27);
                if (var11.field1306 && var75 && arg1) {
                    int var76 = 15;
                    if (var74 instanceof class262) {
                        var76 = ((class262) var74).method1184() / 4;
                        if (var76 > 30) {
                            var76 = 30;
                        }
                    }
                    for (int var77 = 0; var77 <= var13; var77++) {
                        for (int var78 = 0; var78 <= var12; var78++) {
                            if (var76 > class323.field5021[arg5][arg4 + var77][arg2 + var78]) {
                                class323.field5021[arg5][arg4 + var77][arg2 + var78] = (byte) var76;
                            }
                        }
                    }
                }
            }
            if (var11.field1333 != 0 && arg6 != null) {
                arg6.method745(var11.field1338, (byte) -60, var12, arg2, var13, arg4, !var11.field1349);
            }
        } else if (arg3 >= 12) {
            class7 var34;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                class67 var33 = var11.method657(arg10, 57, (class326) null, var21, var19, var29, arg3, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var33.field959, var19, var22, var21);
                }
                var34 = var33.field964;
            } else {
                var34 = new class175(arg0, arg3, arg10, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            class64.method429(arg5, arg4, arg2, var20, 1, 1, var34, 0, var27);
            if (arg1 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg5 > 0 && var11.field1353 != 0) {
                class309.field4799[arg5][arg4][arg2] = class122.method882(class309.field4799[arg5][arg4][arg2], 4);
            }
            if (var11.field1333 != 0 && arg6 != null) {
                arg6.method745(var11.field1338, (byte) -60, var12, arg2, var13, arg4, !var11.field1349);
            }
        } else if (arg3 == 0) {
            class7 var72;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                class67 var71 = var11.method657(arg10, -108, (class326) null, var21, var19, var29, 0, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var71.field959, var19, var22, var21);
                }
                var72 = var71.field964;
            } else {
                var72 = new class175(arg0, 0, arg10, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            class164.method1206(arg5, arg4, arg2, var20, var72, (class7) null, class246.field3883[arg10], 0, var27);
            if (arg1) {
                if (arg10 == 0) {
                    if (var11.field1306) {
                        class323.field5021[arg5][arg4][arg2] = 50;
                        class323.field5021[arg5][arg4][arg2 + 1] = 50;
                    }
                    if (var11.field1353 == 1) {
                        class309.field4799[arg5][arg4][arg2] = class122.method882(class309.field4799[arg5][arg4][arg2], 1);
                    }
                } else if (arg10 == 1) {
                    if (var11.field1306) {
                        class323.field5021[arg5][arg4][arg2 + 1] = 50;
                        class323.field5021[arg5][arg4 + 1][arg2 + 1] = 50;
                    }
                    if (var11.field1353 == 1) {
                        class309.field4799[arg5][arg4][arg2 + 1] = class122.method882(class309.field4799[arg5][arg4][arg2 + 1], 2);
                    }
                } else if (arg10 == 2) {
                    if (var11.field1306) {
                        class323.field5021[arg5][arg4 + 1][arg2] = 50;
                        class323.field5021[arg5][arg4 + 1][arg2 + 1] = 50;
                    }
                    if (var11.field1353 == 1) {
                        class309.field4799[arg5][arg4 + 1][arg2] = class122.method882(class309.field4799[arg5][arg4 + 1][arg2], 1);
                    }
                } else if (arg10 == 3) {
                    if (var11.field1306) {
                        class323.field5021[arg5][arg4][arg2] = 50;
                        class323.field5021[arg5][arg4 + 1][arg2] = 50;
                    }
                    if (var11.field1353 == 1) {
                        class309.field4799[arg5][arg4][arg2] = class122.method882(class309.field4799[arg5][arg4][arg2], 2);
                    }
                }
            }
            if (var11.field1333 != 0 && arg6 != null) {
                arg6.method734(-1, !var11.field1349, var11.field1338, arg3, arg4, arg10, arg2);
            }
            if (var11.field1332 != 16) {
                class74.method490(arg5, arg4, arg2, var11.field1332);
            }
        } else if (arg3 == 1) {
            class7 var36;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                class67 var35 = var11.method657(arg10, 117, (class326) null, var21, var19, var29, 1, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var35.field959, var19, var22, var21);
                }
                var36 = var35.field964;
            } else {
                var36 = new class175(arg0, 1, arg10, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            class164.method1206(arg5, arg4, arg2, var20, var36, (class7) null, class340.field5294[arg10], 0, var27);
            if (var11.field1306 && arg1) {
                if (arg10 == 0) {
                    class323.field5021[arg5][arg4][arg2 + 1] = 50;
                } else if (arg10 == 1) {
                    class323.field5021[arg5][arg4 + 1][arg2 + 1] = 50;
                } else if (arg10 == 2) {
                    class323.field5021[arg5][arg4 + 1][arg2] = 50;
                } else if (arg10 == 3) {
                    class323.field5021[arg5][arg4][arg2] = 50;
                }
            }
            if (var11.field1333 != 0 && arg6 != null) {
                arg6.method734(-1, !var11.field1349, var11.field1338, arg3, arg4, arg10, arg2);
            }
        } else if (arg3 == 2) {
            int var66 = arg10 + 1 & 0x3;
            class7 var68;
            class7 var70;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                class67 var67 = var11.method657(arg10 + 4, -108, (class326) null, var21, var19, var29, 2, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var67.field959, var19, var22, var21);
                }
                var68 = var67.field964;
                class67 var69 = var11.method657(var66, 67, (class326) null, var21, var19, var29, 2, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var69.field959, var19, var22, var21);
                }
                var70 = var69.field964;
            } else {
                var68 = new class175(arg0, 2, arg10 + 4, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
                var70 = new class175(arg0, 2, var66, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            class164.method1206(arg5, arg4, arg2, var20, var68, var70, class246.field3883[arg10], class246.field3883[var66], var27);
            if (var11.field1353 == 1 && arg1) {
                if (arg10 == 0) {
                    class309.field4799[arg5][arg4][arg2] = class122.method882(class309.field4799[arg5][arg4][arg2], 1);
                    class309.field4799[arg5][arg4][arg2 + 1] = class122.method882(class309.field4799[arg5][arg4][arg2 + 1], 2);
                } else if (arg10 == 1) {
                    class309.field4799[arg5][arg4][arg2 + 1] = class122.method882(class309.field4799[arg5][arg4][arg2 + 1], 2);
                    class309.field4799[arg5][arg4 + 1][arg2] = class122.method882(class309.field4799[arg5][arg4 + 1][arg2], 1);
                } else if (arg10 == 2) {
                    class309.field4799[arg5][arg4 + 1][arg2] = class122.method882(class309.field4799[arg5][arg4 + 1][arg2], 1);
                    class309.field4799[arg5][arg4][arg2] = class122.method882(class309.field4799[arg5][arg4][arg2], 2);
                } else if (arg10 == 3) {
                    class309.field4799[arg5][arg4][arg2] = class122.method882(class309.field4799[arg5][arg4][arg2], 2);
                    class309.field4799[arg5][arg4][arg2] = class122.method882(class309.field4799[arg5][arg4][arg2], 1);
                }
            }
            if (var11.field1333 != 0 && arg6 != null) {
                arg6.method734(-1, !var11.field1349, var11.field1338, arg3, arg4, arg10, arg2);
            }
            if (var11.field1332 != 16) {
                class74.method490(arg5, arg4, arg2, var11.field1332);
            }
        } else if (arg3 == 3) {
            class7 var38;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                class67 var37 = var11.method657(arg10, -114, (class326) null, var21, var19, var29, 3, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var37.field959, var19, var22, var21);
                }
                var38 = var37.field964;
            } else {
                var38 = new class175(arg0, 3, arg10, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            class164.method1206(arg5, arg4, arg2, var20, var38, (class7) null, class340.field5294[arg10], 0, var27);
            if (var11.field1306 && arg1) {
                if (arg10 == 0) {
                    class323.field5021[arg5][arg4][arg2 + 1] = 50;
                } else if (arg10 == 1) {
                    class323.field5021[arg5][arg4 + 1][arg2 + 1] = 50;
                } else if (arg10 == 2) {
                    class323.field5021[arg5][arg4 + 1][arg2] = 50;
                } else if (arg10 == 3) {
                    class323.field5021[arg5][arg4][arg2] = 50;
                }
            }
            if (var11.field1333 != 0 && arg6 != null) {
                arg6.method734(-1, !var11.field1349, var11.field1338, arg3, arg4, arg10, arg2);
            }
        } else if (arg3 == 9) {
            class7 var40;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                class67 var39 = var11.method657(arg10, 97, (class326) null, var21, var19, var29, arg3, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var39.field959, var19, var22, var21);
                }
                var40 = var39.field964;
            } else {
                var40 = new class175(arg0, arg3, arg10, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            class64.method429(arg5, arg4, arg2, var20, 1, 1, var40, 0, var27);
            if (var11.field1333 != 0 && arg6 != null) {
                arg6.method745(var11.field1338, (byte) -60, var12, arg2, var13, arg4, !var11.field1349);
            }
            if (var11.field1332 != 16) {
                class74.method490(arg5, arg4, arg2, var11.field1332);
            }
        } else if (arg3 == 4) {
            class7 var65;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                class67 var64 = var11.method657(arg10, 49, (class326) null, var21, var19, var29, 4, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var64.field959, var19, var22, var21);
                }
                var65 = var64.field964;
            } else {
                var65 = new class175(arg0, 4, arg10, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            class5.method30(arg5, arg4, arg2, var20, var65, (class7) null, class246.field3883[arg10], 0, 0, 0, var27);
        } else if (arg3 == 5) {
            int var59 = 16;
            long var60 = class156.method1119(arg5, arg4, arg2);
            if (var60 != 0L) {
                var59 = class69.method454(false, Integer.MAX_VALUE & (int) (var60 >>> 32)).field1332;
            }
            class7 var63;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                class67 var62 = var11.method657(arg10, 79, (class326) null, var21, var19, var29, 4, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var62.field959, var19 - class334.field5217[arg10] * 8, var22, var21 - (class106.field1578[arg10] * 8));
                }
                var63 = var62.field964;
            } else {
                var63 = new class175(arg0, 4, arg10, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            class5.method30(arg5, arg4, arg2, var20, var63, (class7) null, class246.field3883[arg10], 0, class334.field5217[arg10] * var59, class106.field1578[arg10] * var59, var27);
        } else if (arg3 == 6) {
            long var41 = class156.method1119(arg5, arg4, arg2);
            int var43 = 8;
            if (var41 != 0L) {
                var43 = class69.method454(false, Integer.MAX_VALUE & (int) (var41 >>> 32)).field1332 / 2;
            }
            class7 var45;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                class67 var44 = var11.method657(arg10 + 4, 34, (class326) null, var21, var19, var29, 4, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var44.field959, var19 - (class157.field2510[arg10] * 8), var22, var21 - class135.field2152[arg10] * 8);
                }
                var45 = var44.field964;
            } else {
                var45 = new class175(arg0, 4, arg10 + 4, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            class5.method30(arg5, arg4, arg2, var20, var45, (class7) null, 256, arg10, class157.field2510[arg10] * var43, class135.field2152[arg10] * var43, var27);
        } else if (arg3 == 7) {
            int var56 = arg10 + 2 & 0x3;
            class7 var58;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                class67 var57 = var11.method657(var56 + 4, -108, (class326) null, var21, var19, var29, 4, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var57.field959, var19, var22, var21);
                }
                var58 = var57.field964;
            } else {
                var58 = new class175(arg0, 4, var56 + 4, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            class5.method30(arg5, arg4, arg2, var20, var58, (class7) null, 256, var56, 0, 0, var27);
        } else if (arg3 == 8) {
            int var46 = 8;
            long var47 = class156.method1119(arg5, arg4, arg2);
            if (var47 != 0L) {
                var46 = class69.method454(false, Integer.MAX_VALUE & (int) (var47 >>> 32)).field1332 / 2;
            }
            int var49 = arg10 + 2 & 0x3;
            class7 var53;
            class7 var55;
            if (var30 == -1 && var11.field1387 == null && !var11.field1357) {
                int var50 = class157.field2510[arg10] * 8;
                int var51 = class135.field2152[arg10] * 8;
                class67 var52 = var11.method657(arg10 + 4, 69, (class326) null, var21, var19, var29, 4, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var52.field959, var19 - var50, var22, var21 - var51);
                }
                var53 = var52.field964;
                class67 var54 = var11.method657(var49 + 4, -100, (class326) null, var21, var19, var29, 4, var24, var18, var20, arg1);
                if (class232.field3690 && var29) {
                    class241.method1724(var54.field959, var19 - var50, var22, var21 - var51);
                }
                var55 = var54.field964;
            } else {
                var53 = new class175(arg0, 4, arg10 + 4, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
                var55 = new class175(arg0, 4, var49 + 4, arg9, arg4, arg2, var30, var11.field1329, (class7) null);
            }
            class5.method30(arg5, arg4, arg2, var20, var53, var55, 256, arg10, class157.field2510[arg10] * var46, class135.field2152[arg10] * var46, var27);
        } else if (arg8 >= -61) {
            field4469 = 34;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I")
    public abstract int method2000(int arg0, int arg1);

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
    public abstract void method1990(int arg0, int arg1);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)Lwm;")
    public abstract class89 method1991(boolean arg0);

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)[B")
    public abstract byte[] method1987(int arg0, int arg1);
}
