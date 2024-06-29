import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class213 extends class59 {

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "[I")
    private int[] field3509 = new int[3];

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "I")
    private int field3506 = 4096;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    private int field3507 = 4096;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    private int field3504 = 409;

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "I")
    private int field3516 = 4096;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!vk", name = "P", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "Lmf;")
    public static class31 field3517;

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "Lsi;")
    public static class66 field3518;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(BILhb;)V", line = 29)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        if (arg1 == 0) {
            this.field3504 = arg2.method1161(true);
        } else if (arg1 == 1) {
            this.field3506 = arg2.method1161(true);
        } else if (arg1 == 2) {
            this.field3516 = arg2.method1161(true);
        } else if (arg1 == 3) {
            this.field3507 = arg2.method1161(true);
        } else if (arg1 == 4) {
            int var5 = arg2.method1176(1048115912);
            this.field3509[1] = class243.method1696(4080, var5 >> 4);
            this.field3509[2] = class243.method1696(0, var5 >> 12);
            this.field3509[0] = class243.method1696(16711680, var5) << 4;
        }
        if (arg0 != 115) {
            this.method116(-34, 8);
        }
        field3505++;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(IB)V", line = 78)
    public static final void method1506(int arg0, byte arg1) {
        field3513++;
        int var2 = 43 / ((arg1 - 54) / 45);
        if (class69.method542(arg0, -1)) {
            class332.method2272(class37.field604[arg0], -1, -111);
        }
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 142)
    public class213() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 104)
    public static void method1507(boolean arg0) {
        field3517 = null;
        field3518 = null;
        if (!arg0) {
            field3518 = (class66) null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILri;I)V", line = 120)
    public static final void method1508(int arg0, int arg1, class301 arg2, int arg3) {
        field3515++;
        if (class233.field3851 != null || class186.field3027 || arg2 == null || class225.method1566(-126, arg2) == null) {
            return;
        }
        class233.field3851 = arg2;
        class126.field2098 = class225.method1566(-127, arg2);
        class185.field2999 = false;
        class138.field2235 = arg1;
        class302.field5058 = arg0;
        class105.field1790 = arg3;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZZIIIZIILoi;I)V", line = 153)
    public static final void method1509(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, class108 arg9, int arg10) {
        field3510++;
        if (arg6 && !class61.method415((byte) 68) && (class245.field4050[0][arg3][arg4] & 0x2) == 0) {
            if ((class245.field4050[arg8][arg3][arg4] & 0x10) != 0) {
                return;
            }
            if (class276.method1907(-25107, arg4, arg8, arg3) != class102.field1742) {
                return;
            }
        }
        if (class229.field3796 > arg8) {
            class229.field3796 = arg8;
        }
        class83 var11 = class260.method1807(arg2, arg10);
        if (class99.field1675 && var11.field1439) {
            return;
        }
        int var12;
        int var13;
        if (arg0 == 1 || arg0 == 3) {
            var12 = var11.field1424;
            var13 = var11.field1434;
        } else {
            var12 = var11.field1434;
            var13 = var11.field1424;
        }
        int var14;
        int var15;
        if (arg4 + var13 > 104) {
            var14 = arg4 + 1;
            var15 = arg4;
        } else {
            var14 = (var13 + 1 >> 1) + arg4;
            var15 = (var13 >> 1) + arg4;
        }
        int var16;
        int var17;
        if (arg3 + var12 > 104) {
            var16 = arg3 + 1;
            var17 = arg3;
        } else {
            var16 = (var12 + 1 >> 1) + arg3;
            var17 = arg3 + (var12 >> 1);
        }
        int[][] var18 = class192.field3174[arg7];
        int var19 = var18[var17][var14] + var18[var17][var15] + var18[var16][var15] + var18[var16][var14] >> 2;
        int var20 = (arg3 << 7) + (var12 << 6);
        int var21 = (arg4 << 7) + (var13 << 6);
        int var22 = 0;
        if (class99.field1675 && arg7 != 0) {
            int[][] var23 = class192.field3174[0];
            var22 = var19 - (var23[var17][var15] - (-var23[var16][var15] - var23[var17][var14] - var23[var16][var14]) >> 2);
        }
        long var24 = (long) (arg4 | 0x800000 << 7 | arg3 | arg5 << 14 | arg0 << 20);
        if (var11.field1390 == 0 || arg1) {
            var24 |= Long.MIN_VALUE;
        }
        int[][] var26 = (int[][]) null;
        if (var11.field1413 == 1) {
            var24 |= 0x400000L;
        }
        if (arg1) {
            var26 = class103.field1753[0];
        } else if (arg7 < 3) {
            var26 = class192.field3174[arg7 + 1];
        }
        if (var11.field1420) {
            var24 |= 0x80000000L;
        }
        long var27 = var24 | (long) arg10 << 32;
        if (var11.method606((byte) -122)) {
            class250.method1756(arg3, arg8, false, arg0, (class209) null, var11, arg4, (class217) null);
        }
        boolean var29 = var11.field1388 & !arg1;
        if (arg2) {
            method1507(true);
        }
        if (arg5 == 22) {
            if (class120.field2017 || var11.field1390 != 0 || var11.field1378 == 1 || var11.field1381) {
                class216 var77;
                if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                    class58 var76 = var11.method618((byte) -85, var20, var26, var29, var18, var19, 22, arg0, arg6, var21, (class32) null);
                    if (class99.field1675 && var29) {
                        class137.method977(var76.field821, var20, var22, var21);
                    }
                    var77 = var76.field826;
                } else {
                    var77 = new class27(arg10, 22, arg0, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
                }
                class208.method1451(arg8, arg3, arg4, var19, var77, var27, var11.field1384);
                if (var11.field1378 == 1 && arg9 != null) {
                    arg9.method821((byte) 16, arg3, arg4);
                }
            }
        } else if (arg5 == 10 || arg5 == 11) {
            class216 var71;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                class58 var70 = var11.method618((byte) -82, var20, var26, var29, var18, var19, 10, arg5 == 11 ? arg0 + 4 : arg0, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var70.field821, var20, var22, var21);
                }
                var71 = var70.field826;
            } else {
                var71 = new class27(arg10, 10, arg5 == 11 ? arg0 + 4 : arg0, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            if (var71 != null) {
                boolean var72 = class68.method536(arg8, arg3, arg4, var19, var12, var13, var71, 0, var27);
                if (var11.field1438 && var72 && arg6) {
                    int var73 = 15;
                    if (var71 instanceof class286) {
                        var73 = ((class286) var71).method1717() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var12; var74++) {
                        for (int var75 = 0; var75 <= var13; var75++) {
                            if (var73 > class16.field190[arg8][arg3 + var74][arg4 + var75]) {
                                class16.field190[arg8][arg3 + var74][arg4 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field1378 != 0 && arg9 != null) {
                arg9.method810(27204, var11.field1430, arg3, var12, var13, arg4);
            }
        } else if (arg5 >= 12) {
            class216 var69;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                class58 var68 = var11.method618((byte) -112, var20, var26, var29, var18, var19, arg5, arg0, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var68.field821, var20, var22, var21);
                }
                var69 = var68.field826;
            } else {
                var69 = new class27(arg10, arg5, arg0, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            class68.method536(arg8, arg3, arg4, var19, 1, 1, var69, 0, var27);
            if (arg6 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg8 > 0) {
                class1.field10[arg8][arg3][arg4] = class201.method1410(class1.field10[arg8][arg3][arg4], 4);
            }
            if (var11.field1378 != 0 && arg9 != null) {
                arg9.method810(27204, var11.field1430, arg3, var12, var13, arg4);
            }
        } else if (arg5 == 0) {
            class216 var31;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                class58 var30 = var11.method618((byte) -123, var20, var26, var29, var18, var19, 0, arg0, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var30.field821, var20, var22, var21);
                }
                var31 = var30.field826;
            } else {
                var31 = new class27(arg10, 0, arg0, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            class211.method1484(arg8, arg3, arg4, var19, var31, (class216) null, class17.field225[arg0], 0, var27);
            if (arg6) {
                if (arg0 == 0) {
                    if (var11.field1438) {
                        class16.field190[arg8][arg3][arg4] = 50;
                        class16.field190[arg8][arg3][arg4 + 1] = 50;
                    }
                    if (var11.field1375) {
                        class1.field10[arg8][arg3][arg4] = class201.method1410(class1.field10[arg8][arg3][arg4], 1);
                    }
                } else if (arg0 == 1) {
                    if (var11.field1438) {
                        class16.field190[arg8][arg3][arg4 + 1] = 50;
                        class16.field190[arg8][arg3 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field1375) {
                        class1.field10[arg8][arg3][arg4 + 1] = class201.method1410(class1.field10[arg8][arg3][arg4 + 1], 2);
                    }
                } else if (arg0 == 2) {
                    if (var11.field1438) {
                        class16.field190[arg8][arg3 + 1][arg4] = 50;
                        class16.field190[arg8][arg3 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field1375) {
                        class1.field10[arg8][arg3 + 1][arg4] = class201.method1410(class1.field10[arg8][arg3 + 1][arg4], 1);
                    }
                } else if (arg0 == 3) {
                    if (var11.field1438) {
                        class16.field190[arg8][arg3][arg4] = 50;
                        class16.field190[arg8][arg3 + 1][arg4] = 50;
                    }
                    if (var11.field1375) {
                        class1.field10[arg8][arg3][arg4] = class201.method1410(class1.field10[arg8][arg3][arg4], 2);
                    }
                }
            }
            if (var11.field1378 != 0 && arg9 != null) {
                arg9.method814(var11.field1430, arg0, arg4, (byte) 77, arg3, arg5);
            }
            if (var11.field1374 != 16) {
                class122.method905(arg8, arg3, arg4, var11.field1374);
            }
        } else if (arg5 == 1) {
            class216 var33;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                class58 var32 = var11.method618((byte) -119, var20, var26, var29, var18, var19, 1, arg0, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var32.field821, var20, var22, var21);
                }
                var33 = var32.field826;
            } else {
                var33 = new class27(arg10, 1, arg0, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            class211.method1484(arg8, arg3, arg4, var19, var33, (class216) null, class135.field2190[arg0], 0, var27);
            if (var11.field1438 && arg6) {
                if (arg0 == 0) {
                    class16.field190[arg8][arg3][arg4 + 1] = 50;
                } else if (arg0 == 1) {
                    class16.field190[arg8][arg3 + 1][arg4 + 1] = 50;
                } else if (arg0 == 2) {
                    class16.field190[arg8][arg3 + 1][arg4] = 50;
                } else if (arg0 == 3) {
                    class16.field190[arg8][arg3][arg4] = 50;
                }
            }
            if (var11.field1378 != 0 && arg9 != null) {
                arg9.method814(var11.field1430, arg0, arg4, (byte) 79, arg3, arg5);
            }
        } else if (arg5 == 2) {
            int var63 = arg0 + 1 & 0x3;
            class216 var65;
            class216 var67;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                class58 var64 = var11.method618((byte) -102, var20, var26, var29, var18, var19, 2, arg0 + 4, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var64.field821, var20, var22, var21);
                }
                var65 = var64.field826;
                class58 var66 = var11.method618((byte) -93, var20, var26, var29, var18, var19, 2, var63, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var66.field821, var20, var22, var21);
                }
                var67 = var66.field826;
            } else {
                var65 = new class27(arg10, 2, arg0 + 4, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
                var67 = new class27(arg10, 2, var63, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            class211.method1484(arg8, arg3, arg4, var19, var65, var67, class17.field225[arg0], class17.field225[var63], var27);
            if (var11.field1375 && arg6) {
                if (arg0 == 0) {
                    class1.field10[arg8][arg3][arg4] = class201.method1410(class1.field10[arg8][arg3][arg4], 1);
                    class1.field10[arg8][arg3][arg4 + 1] = class201.method1410(class1.field10[arg8][arg3][arg4 + 1], 2);
                } else if (arg0 == 1) {
                    class1.field10[arg8][arg3][arg4 + 1] = class201.method1410(class1.field10[arg8][arg3][arg4 + 1], 2);
                    class1.field10[arg8][arg3 + 1][arg4] = class201.method1410(class1.field10[arg8][arg3 + 1][arg4], 1);
                } else if (arg0 == 2) {
                    class1.field10[arg8][arg3 + 1][arg4] = class201.method1410(class1.field10[arg8][arg3 + 1][arg4], 1);
                    class1.field10[arg8][arg3][arg4] = class201.method1410(class1.field10[arg8][arg3][arg4], 2);
                } else if (arg0 == 3) {
                    class1.field10[arg8][arg3][arg4] = class201.method1410(class1.field10[arg8][arg3][arg4], 2);
                    class1.field10[arg8][arg3][arg4] = class201.method1410(class1.field10[arg8][arg3][arg4], 1);
                }
            }
            if (var11.field1378 != 0 && arg9 != null) {
                arg9.method814(var11.field1430, arg0, arg4, (byte) 43, arg3, arg5);
            }
            if (var11.field1374 != 16) {
                class122.method905(arg8, arg3, arg4, var11.field1374);
            }
        } else if (arg5 == 3) {
            class216 var35;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                class58 var34 = var11.method618((byte) -104, var20, var26, var29, var18, var19, 3, arg0, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var34.field821, var20, var22, var21);
                }
                var35 = var34.field826;
            } else {
                var35 = new class27(arg10, 3, arg0, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            class211.method1484(arg8, arg3, arg4, var19, var35, (class216) null, class135.field2190[arg0], 0, var27);
            if (var11.field1438 && arg6) {
                if (arg0 == 0) {
                    class16.field190[arg8][arg3][arg4 + 1] = 50;
                } else if (arg0 == 1) {
                    class16.field190[arg8][arg3 + 1][arg4 + 1] = 50;
                } else if (arg0 == 2) {
                    class16.field190[arg8][arg3 + 1][arg4] = 50;
                } else if (arg0 == 3) {
                    class16.field190[arg8][arg3][arg4] = 50;
                }
            }
            if (var11.field1378 != 0 && arg9 != null) {
                arg9.method814(var11.field1430, arg0, arg4, (byte) 53, arg3, arg5);
            }
        } else if (arg5 == 9) {
            class216 var37;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                class58 var36 = var11.method618((byte) -119, var20, var26, var29, var18, var19, arg5, arg0, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var36.field821, var20, var22, var21);
                }
                var37 = var36.field826;
            } else {
                var37 = new class27(arg10, arg5, arg0, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            class68.method536(arg8, arg3, arg4, var19, 1, 1, var37, 0, var27);
            if (var11.field1378 != 0 && arg9 != null) {
                arg9.method810(27204, var11.field1430, arg3, var12, var13, arg4);
            }
            if (var11.field1374 != 16) {
                class122.method905(arg8, arg3, arg4, var11.field1374);
            }
        } else if (arg5 == 4) {
            class216 var62;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                class58 var61 = var11.method618((byte) -110, var20, var26, var29, var18, var19, 4, arg0, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var61.field821, var20, var22, var21);
                }
                var62 = var61.field826;
            } else {
                var62 = new class27(arg10, 4, arg0, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            class248.method1743(arg8, arg3, arg4, var19, var62, (class216) null, class17.field225[arg0], 0, 0, 0, var27);
        } else if (arg5 == 5) {
            int var56 = 16;
            long var57 = class321.method2178(arg8, arg3, arg4);
            if (var57 != 0L) {
                var56 = class260.method1807(arg2, Integer.MAX_VALUE & (int) (var57 >>> 32)).field1374;
            }
            class216 var60;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                class58 var59 = var11.method618((byte) -113, var20, var26, var29, var18, var19, 4, arg0, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var59.field821, var20 - (class266.field4488[arg0] * 8), var22, var21 - (class113.field1926[arg0] * 8));
                }
                var60 = var59.field826;
            } else {
                var60 = new class27(arg10, 4, arg0, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            class248.method1743(arg8, arg3, arg4, var19, var60, (class216) null, class17.field225[arg0], 0, class266.field4488[arg0] * var56, class113.field1926[arg0] * var56, var27);
        } else if (arg5 == 6) {
            long var38 = class321.method2178(arg8, arg3, arg4);
            int var40 = 8;
            if (var38 != 0L) {
                var40 = class260.method1807(false, Integer.MAX_VALUE & (int) (var38 >>> 32)).field1374 / 2;
            }
            class216 var42;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                class58 var41 = var11.method618((byte) -117, var20, var26, var29, var18, var19, 4, arg0 + 4, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var41.field821, var20 - (class259.field4314[arg0] * 8), var22, var21 - (class323.field5508[arg0] * 8));
                }
                var42 = var41.field826;
            } else {
                var42 = new class27(arg10, 4, arg0 + 4, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            class248.method1743(arg8, arg3, arg4, var19, var42, (class216) null, 256, arg0, class259.field4314[arg0] * var40, class323.field5508[arg0] * var40, var27);
        } else if (arg5 == 7) {
            int var43 = arg0 + 2 & 0x3;
            class216 var45;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                class58 var44 = var11.method618((byte) -104, var20, var26, var29, var18, var19, 4, var43 + 4, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var44.field821, var20, var22, var21);
                }
                var45 = var44.field826;
            } else {
                var45 = new class27(arg10, 4, var43 + 4, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            class248.method1743(arg8, arg3, arg4, var19, var45, (class216) null, 256, var43, 0, 0, var27);
        } else if (arg5 == 8) {
            long var46 = class321.method2178(arg8, arg3, arg4);
            int var48 = arg0 + 2 & 0x3;
            int var49 = 8;
            if (var46 != 0L) {
                var49 = class260.method1807(false, (int) (var46 >>> 32) & Integer.MAX_VALUE).field1374 / 2;
            }
            class216 var53;
            class216 var55;
            if (var11.field1371 == -1 && var11.field1373 == null && !var11.field1432) {
                int var50 = class259.field4314[arg0] * 8;
                int var51 = class323.field5508[arg0] * 8;
                class58 var52 = var11.method618((byte) -86, var20, var26, var29, var18, var19, 4, arg0 + 4, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var52.field821, var20 - var50, var22, var21 - var51);
                }
                var53 = var52.field826;
                class58 var54 = var11.method618((byte) -92, var20, var26, var29, var18, var19, 4, var48 + 4, arg6, var21, (class32) null);
                if (class99.field1675 && var29) {
                    class137.method977(var54.field821, var20 - var50, var22, var21 - var51);
                }
                var55 = var54.field826;
            } else {
                var53 = new class27(arg10, 4, arg0 + 4, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
                var55 = new class27(arg10, 4, var48 + 4, arg7, arg3, arg4, var11.field1371, var11.field1401, (class216) null);
            }
            class248.method1743(arg8, arg3, arg4, var19, var53, var55, 256, arg0, class259.field4314[arg0] * var49, class323.field5508[arg0] * var49, var27);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V", line = 807)
    public static final void method1510(int arg0, boolean arg1) {
        field3514++;
        if (arg0 != 16) {
            field3518 = (class66) null;
        }
        if (arg1 != class124.field2084) {
            class124.field2084 = arg1;
            class115.method873(-23965);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lsi;Z)V", line = 822)
    public static final void method1511(class66 arg0, boolean arg1) {
        field3511++;
        if (arg1) {
            class178.field2929 = arg0;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIII)V", line = 834)
    public static final void method1512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3508++;
        class58.field820[0].method271(arg3, arg1);
        if (arg2 < 87) {
            return;
        }
        class58.field820[1].method271(arg3, arg1 + arg4 - 16);
        int var6 = (arg4 - 32) * arg4 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg0 / (arg5 - arg4);
        if (!class99.field1675) {
            class210.method1465(arg3, arg1 + 16, 16, arg4 - 32, class27.field406);
            class210.method1465(arg3, arg1 + var7 + 16, 16, var6, class7.field94);
            class210.method1477(arg3, arg1 + var7 + 16, var6, class315.field5355);
            class210.method1477(arg3 + 1, arg1 + 16 + var7, var6, class315.field5355);
            class210.method1474(arg3, arg1 + var7 + 16, 16, class315.field5355);
            class210.method1474(arg3, arg1 + var7 + 17, 16, class315.field5355);
            class210.method1477(arg3 + 15, arg1 + 16 + var7, var6, class254.field4239);
            class210.method1477(arg3 + 14, arg1 + 17 - -var7, var6 - 1, class254.field4239);
            class210.method1474(arg3, var7 + arg1 + var6 + 15, 16, class254.field4239);
            class210.method1474(arg3 + 1, arg1 + var7 - -var6 + 14, 15, class254.field4239);
            return;
        }
        class212.method1494(arg3, arg1 + 16, 16, arg4 - 32, class27.field406);
        class212.method1494(arg3, arg1 + var7 + 16, 16, var6, class7.field94);
        class212.method1492(arg3, var7 + arg1 + 16, var6, class315.field5355);
        class212.method1492(arg3 + 1, arg1 + var7 + 16, var6, class315.field5355);
        class212.method1496(arg3, arg1 - (-var7 - 16), 16, class315.field5355);
        class212.method1496(arg3, arg1 + var7 + 17, 16, class315.field5355);
        class212.method1492(arg3 + 15, arg1 + 16 + var7, var6, class254.field4239);
        class212.method1492(arg3 + 14, arg1 + var7 + 17, var6 - 1, class254.field4239);
        class212.method1496(arg3, arg1 + var7 + var6 + 15, 16, class254.field4239);
        class212.method1496(arg3 + 1, arg1 + 14 - -var6 + var7, 15, class254.field4239);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)[[I", line = 884)
    public final int[][] method116(int arg0, int arg1) {
        int[][] var3 = this.field838.method1796(true, arg0);
        field3512++;
        if (this.field838.field4334) {
            int[][] var4 = this.method397(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class293.field4789; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3509[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field3504 >= var13) {
                    int var14 = var7[var11];
                    int var15 = var14 - this.field3509[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field3504 < var15) {
                        var8[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var6[var11];
                    } else {
                        int var16 = var6[var11];
                        int var17 = var16 - this.field3509[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field3504 < var17) {
                            var8[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var8[var11] = this.field3507 * var12 >> 12;
                            var10[var11] = this.field3516 * var14 >> 12;
                            var9[var11] = this.field3506 * var16 >> 12;
                        }
                    }
                } else {
                    var8[var11] = var12;
                    var10[var11] = var7[var11];
                    var9[var11] = var6[var11];
                }
            }
        }
        if (arg1 != 4588) {
            this.method67((byte) 44, 127, (class164) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)V", line = 978)
    public static final void method1513(byte arg0) {
        field3503++;
        int var1 = class324.field5540;
        int var2 = class253.field4224;
        int var3 = class15.field177 - class273.field4567 - var2;
        int var4 = class53.field754 - class266.field4484 - var1;
        int var5 = -28 % ((arg0 + 1) / 61);
        if (var2 <= 0 && var3 <= 0 && var1 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var6;
            if (class325.field5569 != null) {
                var6 = class325.field5569;
            } else if (class160.field2590 == null) {
                var6 = class249.field4143.field1561;
            } else {
                var6 = class160.field2590;
            }
            int var7 = 0;
            int var8 = 0;
            if (class160.field2590 == var6) {
                Insets var9 = class160.field2590.getInsets();
                var7 = var9.left;
                var8 = var9.top;
            }
            Graphics var10 = var6.getGraphics();
            var10.setColor(Color.black);
            if (var2 > 0) {
                var10.fillRect(var7, var8, var2, class53.field754);
            }
            if (var1 > 0) {
                var10.fillRect(var7, var8, class15.field177, var1);
            }
            if (var3 > 0) {
                var10.fillRect(var7 + class15.field177 - var3, var8, var3, class53.field754);
            }
            if (var4 > 0) {
                var10.fillRect(var7, class53.field754 + var8 - var4, class15.field177, var4);
            }
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)Z", line = 1042)
    public static final boolean method1514(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class93.field1576 * arg3 + class93.field1570 * arg0 >> 16;
        int var6 = class93.field1570 * arg3 - class93.field1576 * arg0 >> 16;
        int var7 = class53.field750 * var6 + class132.field2148 * arg1 >> 16;
        int var8 = class53.field750 * arg1 - class132.field2148 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class53.field750 * var6 + class132.field2148 * arg2 >> 16;
        int var12 = class53.field750 * arg2 - class132.field2148 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class26.field340 && var13 < class26.field340) {
            return false;
        } else if (var9 > class208.field3433 && var13 > class208.field3433) {
            return false;
        } else if (var10 < class111.field1884 && var14 < class111.field1884) {
            return false;
        } else {
            return var10 <= class175.field2874 || var14 <= class175.field2874;
        }
    }
}
