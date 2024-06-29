import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class100 {

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lih;")
    public static class32 field1610 = new class32();

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lna;")
    public static class26 field1613 = class69.method505("::serverjs5drop", (byte) -120);

    @OriginalMember(owner = "client!p", name = "g", descriptor = "F")
    public static float field1614;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 29)
    public static final void method737(int arg0) {
        field1608++;
        if (class230.field3647 == 5) {
            if (arg0 != -1) {
                field1613 = (class26) null;
            }
            class230.field3647 = 6;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 46)
    public static void method738(int arg0) {
        field1613 = null;
        field1610 = null;
        if (arg0 >= -65) {
            method737(-121);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IZIZLmj;IIIBII)V", line = 58)
    public static final void method739(int arg0, boolean arg1, int arg2, boolean arg3, class228 arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10) {
        field1609++;
        if (arg1 && !class324.method2250(103) && (class92.field1492[0][arg7][arg9] & 0x2) == 0) {
            if ((class92.field1492[arg2][arg7][arg9] & 0x10) != 0) {
                return;
            }
            if (class163.method1110(arg9, arg7, arg8 ^ 0xFFFFFF81, arg2) != class109.field1737) {
                return;
            }
        }
        if (arg2 < class123.field1922) {
            class123.field1922 = arg2;
        }
        class78 var11 = class104.method750(4, arg5);
        if (class255.field4184 && var11.field1230) {
            return;
        }
        int var12;
        int var13;
        if (arg10 == 1 || arg10 == 3) {
            var13 = var11.field1171;
            var12 = var11.field1178;
        } else {
            var12 = var11.field1171;
            var13 = var11.field1178;
        }
        int var14;
        int var15;
        if (arg7 + var12 <= 104) {
            var14 = (var12 >> 1) + arg7;
            var15 = arg7 + (var12 + 1 >> 1);
        } else {
            var15 = arg7 + 1;
            var14 = arg7;
        }
        int var16;
        int var17;
        if ((arg9 + var13) > 104) {
            var16 = arg9;
            var17 = arg9 + 1;
        } else {
            var16 = (var13 >> 1) + arg9;
            var17 = (var13 + 1 >> 1) + arg9;
        }
        int[][] var18 = class229.field3635[arg0];
        if (arg8 != 50) {
            return;
        }
        int var19 = (arg7 << 7) + (var12 << 6);
        int var20 = (arg9 << 7) + (var13 << 6);
        int var21 = var18[var14][var16] + var18[var15][var16] + var18[var15][var17] + var18[var14][var17] >> 2;
        int var22 = 0;
        if (class255.field4184 && arg0 != 0) {
            int[][] var23 = class229.field3635[0];
            var22 = var21 - (var23[var14][var16] + var23[var15][var16] + var23[var15][var17] + var23[var14][var17] >> 2);
        }
        int[][] var24 = (int[][]) null;
        long var25 = (long) (arg7 | 0x40000000 | arg9 << 7 | arg6 << 14 | arg10 << 20);
        if (arg3) {
            var24 = class258.field4209[0];
        } else if (arg0 < 3) {
            var24 = class229.field3635[arg0 + 1];
        }
        if (var11.field1229 == 0 || arg3) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field1243 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field1201) {
            var25 |= 0x80000000L;
        }
        if (var11.method557(28933)) {
            class267.method1903(arg9, false, var11, arg10, (class324) null, arg7, arg2, (class159) null);
        }
        boolean var27 = var11.field1196 & !arg3;
        long var28 = var25 | (long) arg5 << 32;
        if (arg6 == 22) {
            if (class22.field307 || var11.field1229 != 0 || var11.field1239 == 1 || var11.field1175) {
                class86 var77;
                if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                    class157 var76 = var11.method563(arg10, var19, var18, 22, var21, var24, arg1, (class183) null, (byte) -126, var27, var20);
                    if (class255.field4184 && var27) {
                        class179.method1248(var76.field2445, var19, var22, var20);
                    }
                    var77 = var76.field2454;
                } else {
                    var77 = new class109(arg5, 22, arg10, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
                }
                class115.method798(arg2, arg7, arg9, var21, var77, var28, var11.field1195);
                if (var11.field1239 == 1 && arg4 != null) {
                    arg4.method1538(arg7, arg9, arg8 - 55);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class86 var71;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                class157 var70 = var11.method563(arg6 == 11 ? arg10 + 4 : arg10, var19, var18, 10, var21, var24, arg1, (class183) null, (byte) -26, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var70.field2445, var19, var22, var20);
                }
                var71 = var70.field2454;
            } else {
                var71 = new class109(arg5, 10, arg6 == 11 ? arg10 + 4 : arg10, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            if (var71 != null) {
                boolean var72 = class178.method1230(arg2, arg7, arg9, var21, var12, var13, var71, 0, var28);
                if (var11.field1224 && var72 && arg1) {
                    int var73 = 15;
                    if (var71 instanceof class311) {
                        var73 = ((class311) var71).method1636() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var12; var74++) {
                        for (int var75 = 0; var75 <= var13; var75++) {
                            if (class140.field2133[arg2][arg7 + var74][arg9 + var75] < var73) {
                                class140.field2133[arg2][arg7 + var74][arg9 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field1239 != 0 && arg4 != null) {
                arg4.method1524(arg7, var11.field1179, (byte) 96, arg9, var12, var13);
            }
        } else if (arg6 >= 12) {
            class86 var31;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                class157 var30 = var11.method563(arg10, var19, var18, arg6, var21, var24, arg1, (class183) null, (byte) -82, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var30.field2445, var19, var22, var20);
                }
                var31 = var30.field2454;
            } else {
                var31 = new class109(arg5, arg6, arg10, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            class178.method1230(arg2, arg7, arg9, var21, 1, 1, var31, 0, var28);
            if (arg1 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg2 > 0) {
                class11.field147[arg2][arg7][arg9] = class240.method1652(class11.field147[arg2][arg7][arg9], 4);
            }
            if (var11.field1239 != 0 && arg4 != null) {
                arg4.method1524(arg7, var11.field1179, (byte) 73, arg9, var12, var13);
            }
        } else if (arg6 == 0) {
            class86 var33;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                class157 var32 = var11.method563(arg10, var19, var18, 0, var21, var24, arg1, (class183) null, (byte) -74, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var32.field2445, var19, var22, var20);
                }
                var33 = var32.field2454;
            } else {
                var33 = new class109(arg5, 0, arg10, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            class307.method2148(arg2, arg7, arg9, var21, var33, (class86) null, class80.field1256[arg10], 0, var28);
            if (arg1) {
                if (arg10 == 0) {
                    if (var11.field1224) {
                        class140.field2133[arg2][arg7][arg9] = 50;
                        class140.field2133[arg2][arg7][arg9 + 1] = 50;
                    }
                    if (var11.field1245) {
                        class11.field147[arg2][arg7][arg9] = class240.method1652(class11.field147[arg2][arg7][arg9], 1);
                    }
                } else if (arg10 == 1) {
                    if (var11.field1224) {
                        class140.field2133[arg2][arg7][arg9 + 1] = 50;
                        class140.field2133[arg2][arg7 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field1245) {
                        class11.field147[arg2][arg7][arg9 + 1] = class240.method1652(class11.field147[arg2][arg7][arg9 + 1], 2);
                    }
                } else if (arg10 == 2) {
                    if (var11.field1224) {
                        class140.field2133[arg2][arg7 + 1][arg9] = 50;
                        class140.field2133[arg2][arg7 + 1][arg9 + 1] = 50;
                    }
                    if (var11.field1245) {
                        class11.field147[arg2][arg7 + 1][arg9] = class240.method1652(class11.field147[arg2][arg7 + 1][arg9], 1);
                    }
                } else if (arg10 == 3) {
                    if (var11.field1224) {
                        class140.field2133[arg2][arg7][arg9] = 50;
                        class140.field2133[arg2][arg7 + 1][arg9] = 50;
                    }
                    if (var11.field1245) {
                        class11.field147[arg2][arg7][arg9] = class240.method1652(class11.field147[arg2][arg7][arg9], 2);
                    }
                }
            }
            if (var11.field1239 != 0 && arg4 != null) {
                arg4.method1521(arg10, 2, arg6, var11.field1179, arg9, arg7);
            }
            if (var11.field1228 != 16) {
                class272.method1934(arg2, arg7, arg9, var11.field1228);
            }
        } else if (arg6 == 1) {
            class86 var35;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                class157 var34 = var11.method563(arg10, var19, var18, 1, var21, var24, arg1, (class183) null, (byte) -83, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var34.field2445, var19, var22, var20);
                }
                var35 = var34.field2454;
            } else {
                var35 = new class109(arg5, 1, arg10, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            class307.method2148(arg2, arg7, arg9, var21, var35, (class86) null, class308.field5302[arg10], 0, var28);
            if (var11.field1224 && arg1) {
                if (arg10 == 0) {
                    class140.field2133[arg2][arg7][arg9 + 1] = 50;
                } else if (arg10 == 1) {
                    class140.field2133[arg2][arg7 + 1][arg9 + 1] = 50;
                } else if (arg10 == 2) {
                    class140.field2133[arg2][arg7 + 1][arg9] = 50;
                } else if (arg10 == 3) {
                    class140.field2133[arg2][arg7][arg9] = 50;
                }
            }
            if (var11.field1239 != 0 && arg4 != null) {
                arg4.method1521(arg10, 2, arg6, var11.field1179, arg9, arg7);
            }
        } else if (arg6 == 2) {
            int var36 = arg10 + 1 & 0x3;
            class86 var38;
            class86 var40;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                class157 var37 = var11.method563(arg10 + 4, var19, var18, 2, var21, var24, arg1, (class183) null, (byte) -108, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var37.field2445, var19, var22, var20);
                }
                var38 = var37.field2454;
                class157 var39 = var11.method563(var36, var19, var18, 2, var21, var24, arg1, (class183) null, (byte) -69, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var39.field2445, var19, var22, var20);
                }
                var40 = var39.field2454;
            } else {
                var38 = new class109(arg5, 2, arg10 + 4, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
                var40 = new class109(arg5, 2, var36, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            class307.method2148(arg2, arg7, arg9, var21, var38, var40, class80.field1256[arg10], class80.field1256[var36], var28);
            if (var11.field1245 && arg1) {
                if (arg10 == 0) {
                    class11.field147[arg2][arg7][arg9] = class240.method1652(class11.field147[arg2][arg7][arg9], 1);
                    class11.field147[arg2][arg7][arg9 + 1] = class240.method1652(class11.field147[arg2][arg7][arg9 + 1], 2);
                } else if (arg10 == 1) {
                    class11.field147[arg2][arg7][arg9 + 1] = class240.method1652(class11.field147[arg2][arg7][arg9 + 1], 2);
                    class11.field147[arg2][arg7 + 1][arg9] = class240.method1652(class11.field147[arg2][arg7 + 1][arg9], 1);
                } else if (arg10 == 2) {
                    class11.field147[arg2][arg7 + 1][arg9] = class240.method1652(class11.field147[arg2][arg7 + 1][arg9], 1);
                    class11.field147[arg2][arg7][arg9] = class240.method1652(class11.field147[arg2][arg7][arg9], 2);
                } else if (arg10 == 3) {
                    class11.field147[arg2][arg7][arg9] = class240.method1652(class11.field147[arg2][arg7][arg9], 2);
                    class11.field147[arg2][arg7][arg9] = class240.method1652(class11.field147[arg2][arg7][arg9], 1);
                }
            }
            if (var11.field1239 != 0 && arg4 != null) {
                arg4.method1521(arg10, 2, arg6, var11.field1179, arg9, arg7);
            }
            if (var11.field1228 != 16) {
                class272.method1934(arg2, arg7, arg9, var11.field1228);
            }
        } else if (arg6 == 3) {
            class86 var42;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                class157 var41 = var11.method563(arg10, var19, var18, 3, var21, var24, arg1, (class183) null, (byte) -54, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var41.field2445, var19, var22, var20);
                }
                var42 = var41.field2454;
            } else {
                var42 = new class109(arg5, 3, arg10, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            class307.method2148(arg2, arg7, arg9, var21, var42, (class86) null, class308.field5302[arg10], 0, var28);
            if (var11.field1224 && arg1) {
                if (arg10 == 0) {
                    class140.field2133[arg2][arg7][arg9 + 1] = 50;
                } else if (arg10 == 1) {
                    class140.field2133[arg2][arg7 + 1][arg9 + 1] = 50;
                } else if (arg10 == 2) {
                    class140.field2133[arg2][arg7 + 1][arg9] = 50;
                } else if (arg10 == 3) {
                    class140.field2133[arg2][arg7][arg9] = 50;
                }
            }
            if (var11.field1239 != 0 && arg4 != null) {
                arg4.method1521(arg10, 2, arg6, var11.field1179, arg9, arg7);
            }
        } else if (arg6 == 9) {
            class86 var69;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                class157 var68 = var11.method563(arg10, var19, var18, arg6, var21, var24, arg1, (class183) null, (byte) -30, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var68.field2445, var19, var22, var20);
                }
                var69 = var68.field2454;
            } else {
                var69 = new class109(arg5, arg6, arg10, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            class178.method1230(arg2, arg7, arg9, var21, 1, 1, var69, 0, var28);
            if (var11.field1239 != 0 && arg4 != null) {
                arg4.method1524(arg7, var11.field1179, (byte) 127, arg9, var12, var13);
            }
            if (var11.field1228 != 16) {
                class272.method1934(arg2, arg7, arg9, var11.field1228);
            }
        } else if (arg6 == 4) {
            class86 var67;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                class157 var66 = var11.method563(arg10, var19, var18, 4, var21, var24, arg1, (class183) null, (byte) -103, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var66.field2445, var19, var22, var20);
                }
                var67 = var66.field2454;
            } else {
                var67 = new class109(arg5, 4, arg10, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            class173.method1191(arg2, arg7, arg9, var21, var67, (class86) null, class80.field1256[arg10], 0, 0, 0, var28);
        } else if (arg6 == 5) {
            int var61 = 16;
            long var62 = class107.method760(arg2, arg7, arg9);
            if (var62 != 0L) {
                var61 = class104.method750(4, Integer.MAX_VALUE & (int) (var62 >>> 32)).field1228;
            }
            class86 var65;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                class157 var64 = var11.method563(arg10, var19, var18, 4, var21, var24, arg1, (class183) null, (byte) -125, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var64.field2445, var19 - (class236.field3738[arg10] * 8), var22, var20 - (class293.field4879[arg10] * 8));
                }
                var65 = var64.field2454;
            } else {
                var65 = new class109(arg5, 4, arg10, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            class173.method1191(arg2, arg7, arg9, var21, var65, (class86) null, class80.field1256[arg10], 0, class236.field3738[arg10] * var61, class293.field4879[arg10] * var61, var28);
        } else if (arg6 == 6) {
            int var56 = 8;
            long var57 = class107.method760(arg2, arg7, arg9);
            if (var57 != 0L) {
                var56 = class104.method750(4, Integer.MAX_VALUE & (int) (var57 >>> 32)).field1228 / 2;
            }
            class86 var60;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                class157 var59 = var11.method563(arg10 + 4, var19, var18, 4, var21, var24, arg1, (class183) null, (byte) -65, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var59.field2445, var19 - (class283.field4740[arg10] * 8), var22, var20 - (class59.field964[arg10] * 8));
                }
                var60 = var59.field2454;
            } else {
                var60 = new class109(arg5, 4, arg10 + 4, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            class173.method1191(arg2, arg7, arg9, var21, var60, (class86) null, 256, arg10, class283.field4740[arg10] * var56, class59.field964[arg10] * var56, var28);
        } else if (arg6 == 7) {
            int var53 = arg10 + 2 & 0x3;
            class86 var55;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                class157 var54 = var11.method563(var53 + 4, var19, var18, 4, var21, var24, arg1, (class183) null, (byte) -39, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var54.field2445, var19, var22, var20);
                }
                var55 = var54.field2454;
            } else {
                var55 = new class109(arg5, 4, var53 + 4, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            class173.method1191(arg2, arg7, arg9, var21, var55, (class86) null, 256, var53, 0, 0, var28);
        } else if (arg6 == 8) {
            int var43 = 8;
            long var44 = class107.method760(arg2, arg7, arg9);
            if (var44 != 0L) {
                var43 = class104.method750(4, Integer.MAX_VALUE & (int) (var44 >>> 32)).field1228 / 2;
            }
            int var46 = arg10 + 2 & 0x3;
            class86 var50;
            class86 var52;
            if (var11.field1231 == -1 && var11.field1222 == null && !var11.field1204) {
                int var47 = class59.field964[arg10] * 8;
                int var48 = class283.field4740[arg10] * 8;
                class157 var49 = var11.method563(arg10 + 4, var19, var18, 4, var21, var24, arg1, (class183) null, (byte) -25, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var49.field2445, var19 - var48, var22, var20 - var47);
                }
                var50 = var49.field2454;
                class157 var51 = var11.method563(var46 + 4, var19, var18, 4, var21, var24, arg1, (class183) null, (byte) -101, var27, var20);
                if (class255.field4184 && var27) {
                    class179.method1248(var51.field2445, var19 - var48, var22, var20 - var47);
                }
                var52 = var51.field2454;
            } else {
                var50 = new class109(arg5, 4, arg10 + 4, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
                var52 = new class109(arg5, 4, var46 + 4, arg0, arg7, arg9, var11.field1231, var11.field1185, (class86) null);
            }
            class173.method1191(arg2, arg7, arg9, var21, var50, var52, 256, arg10, class283.field4740[arg10] * var43, class59.field964[arg10] * var43, var28);
        }
    }
}
