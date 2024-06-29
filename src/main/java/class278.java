import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class278 extends InputStream {

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "Lli;")
    public static class194 field4325 = null;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4319 = "Loaded sprites";

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Z")
    public static boolean field4323;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
    public static int[] field4322;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "[[Z")
    public static boolean[][] field4320;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 17)
    public static void method1926(byte arg0) {
        field4319 = null;
        field4322 = null;
        field4320 = (boolean[][]) null;
        if (arg0 <= 32) {
            method1929(-21);
        }
        field4325 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIBII)V", line = 33)
    public static final void method1927(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -90) {
            field4325 = (class194) null;
        }
        for (int var5 = 0; var5 < class184.field2913; var5++) {
            if ((class41.field602[var5] + class174.field2803[var5]) > arg1 && arg1 + arg4 > class41.field602[var5] && arg3 < class97.field1400[var5] + class120.field1850[var5] && class120.field1850[var5] < arg0 + arg3) {
                class121.field1861[var5] = true;
            }
        }
        field4318++;
    }

    @OriginalMember(owner = "client!ji", name = "read", descriptor = "()I", line = 56)
    public final int read() {
        field4324++;
        class324.method2252(-24861, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZLf;ZIIIIIII)V", line = 65)
    public static final void method1928(int arg0, boolean arg1, class345 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field4316++;
        if (arg1 && !class110.method841((byte) 88) && (class324.field5005[0][arg0][arg10] & 0x2) == 0) {
            if ((class324.field5005[arg8][arg0][arg10] & 0x10) != 0) {
                return;
            }
            if (class99.method743(arg8, arg10, 103, arg0) != class170.field2749) {
                return;
            }
        }
        if (arg8 < class174.field2811) {
            class174.field2811 = arg8;
        }
        class32 var11 = class226.method1607(4, arg9);
        if (class73.field1058 && var11.field467) {
            return;
        }
        int var12;
        int var13;
        if (arg5 == 1 || arg5 == 3) {
            var13 = var11.field413;
            var12 = var11.field416;
        } else {
            var12 = var11.field413;
            var13 = var11.field416;
        }
        int var14;
        int var15;
        if ((arg0 + var13) > 104) {
            var14 = arg0;
            var15 = arg0 + 1;
        } else {
            var15 = (var13 + 1 >> 1) + arg0;
            var14 = (var13 >> 1) + arg0;
        }
        int[][] var16 = class203.field3111[arg7];
        int var17;
        int var18;
        if ((arg10 + var12) <= 104) {
            var17 = (var12 >> 1) + arg10;
            var18 = (var12 + 1 >> 1) + arg10;
        } else {
            var18 = arg10 + 1;
            var17 = arg10;
        }
        int var19 = var16[var14][var17] + var16[var15][var18] - (-var16[var15][var17] - var16[var14][var18]) >> 2;
        int var20 = (arg0 << 7) + (var13 << 6);
        int var21 = 0;
        int var22 = (arg10 << 7) + (var12 << 6);
        if (class73.field1058 && arg7 != 0) {
            int[][] var23 = class203.field3111[0];
            var21 = var19 - (var23[var14][var17] + var23[var15][var17] + var23[var14][var18] + var23[var15][var18] >> 2);
        }
        long var24 = (long) (arg10 | 0x800000 << 7 | arg0 | arg4 << 14 | arg5 << 20);
        if (var11.field407 == 0 || arg3) {
            var24 |= Long.MIN_VALUE;
        }
        int[][] var26 = (int[][]) null;
        if (var11.field425 == 1) {
            var24 |= 0x400000L;
        }
        if (arg3) {
            var26 = class79.field1151[0];
        } else if (arg7 < 3) {
            var26 = class203.field3111[arg7 + 1];
        }
        if (var11.field453) {
            var24 |= 0x80000000L;
        }
        if (var11.method255((byte) 93)) {
            class83.method635((class76) null, arg0, (class270) null, -89, arg5, arg8, var11, arg10);
        }
        long var27 = var24 | (long) arg9 << 32;
        boolean var29 = !arg3 & var11.field402;
        if (arg4 == 22) {
            if (class320.field4958 || var11.field407 != 0 || var11.field466 == 1 || var11.field478) {
                class110 var77;
                if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                    class214 var76 = var11.method257((class42) null, var26, 22, var22, arg1, 103, var19, var29, arg5, var16, var20);
                    if (class73.field1058 && var29) {
                        class125.method938(var76.field3289, var20, var21, var22);
                    }
                    var77 = var76.field3287;
                } else {
                    var77 = new class264(arg9, 22, arg5, arg7, arg0, arg10, -1, var11.field441, (class110) null);
                }
                class62.method427(arg8, arg0, arg10, var19, var77, var27, var11.field423);
                if (var11.field466 == 1 && arg2 != null) {
                    arg2.method2395(arg10, -110, arg0);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class110 var71;
            if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                class214 var70 = var11.method257((class42) null, var26, 10, var22, arg1, 96, var19, var29, arg4 == 11 ? arg5 + 4 : arg5, var16, var20);
                if (class73.field1058 && var29) {
                    class125.method938(var70.field3289, var20, var21, var22);
                }
                var71 = var70.field3287;
            } else {
                var71 = new class264(arg9, 10, arg4 == 11 ? arg5 + 4 : arg5, arg7, arg0, arg10, -1, var11.field441, (class110) null);
            }
            if (var71 != null) {
                boolean var72 = class189.method1402(arg8, arg0, arg10, var19, var13, var12, var71, 0, var27);
                if (var11.field399 && var72 && arg1) {
                    int var73 = 15;
                    if (var71 instanceof class74) {
                        var73 = ((class74) var71).method562() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var13; var74++) {
                        for (int var75 = 0; var75 <= var12; var75++) {
                            if (class13.field179[arg8][arg0 + var74][arg10 + var75] < var73) {
                                class13.field179[arg8][arg0 + var74][arg10 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field466 != 0 && arg2 != null) {
                arg2.method2396(!var11.field437, var13, -16161, arg0, arg10, var12, var11.field405);
            }
        } else if (arg4 >= 12) {
            class110 var31;
            if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                class214 var30 = var11.method257((class42) null, var26, arg4, var22, arg1, 112, var19, var29, arg5, var16, var20);
                if (class73.field1058 && var29) {
                    class125.method938(var30.field3289, var20, var21, var22);
                }
                var31 = var30.field3287;
            } else {
                var31 = new class264(arg9, arg4, arg5, arg7, arg0, arg10, -1, var11.field441, (class110) null);
            }
            class189.method1402(arg8, arg0, arg10, var19, 1, 1, var31, 0, var27);
            if (arg1 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg8 > 0 && var11.field430 != 0) {
                class283.field4396[arg8][arg0][arg10] = class261.method1835(class283.field4396[arg8][arg0][arg10], 4);
            }
            if (var11.field466 != 0 && arg2 != null) {
                arg2.method2396(!var11.field437, var13, -16161, arg0, arg10, var12, var11.field405);
            }
        } else if (arg4 == 0) {
            class110 var33;
            if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                class214 var32 = var11.method257((class42) null, var26, 0, var22, arg1, 56, var19, var29, arg5, var16, var20);
                if (class73.field1058 && var29) {
                    class125.method938(var32.field3289, var20, var21, var22);
                }
                var33 = var32.field3287;
            } else {
                var33 = new class264(arg9, 0, arg5, arg7, arg0, arg10, -1, var11.field441, (class110) null);
            }
            class43.method331(arg8, arg0, arg10, var19, var33, (class110) null, class207.field3167[arg5], 0, var27);
            if (arg1) {
                if (arg5 == 0) {
                    if (var11.field399) {
                        class13.field179[arg8][arg0][arg10] = 50;
                        class13.field179[arg8][arg0][arg10 + 1] = 50;
                    }
                    if (var11.field430 == 1) {
                        class283.field4396[arg8][arg0][arg10] = class261.method1835(class283.field4396[arg8][arg0][arg10], 1);
                    }
                } else if (arg5 == 1) {
                    if (var11.field399) {
                        class13.field179[arg8][arg0][arg10 + 1] = 50;
                        class13.field179[arg8][arg0 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field430 == 1) {
                        class283.field4396[arg8][arg0][arg10 + 1] = class261.method1835(class283.field4396[arg8][arg0][arg10 + 1], 2);
                    }
                } else if (arg5 == 2) {
                    if (var11.field399) {
                        class13.field179[arg8][arg0 + 1][arg10] = 50;
                        class13.field179[arg8][arg0 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field430 == 1) {
                        class283.field4396[arg8][arg0 + 1][arg10] = class261.method1835(class283.field4396[arg8][arg0 + 1][arg10], 1);
                    }
                } else if (arg5 == 3) {
                    if (var11.field399) {
                        class13.field179[arg8][arg0][arg10] = 50;
                        class13.field179[arg8][arg0 + 1][arg10] = 50;
                    }
                    if (var11.field430 == 1) {
                        class283.field4396[arg8][arg0][arg10] = class261.method1835(class283.field4396[arg8][arg0][arg10], 2);
                    }
                }
            }
            if (var11.field466 != 0 && arg2 != null) {
                arg2.method2394(arg10, var11.field405, arg4, 17530, arg0, arg5, !var11.field437);
            }
            if (var11.field426 != 16) {
                class300.method2065(arg8, arg0, arg10, var11.field426);
            }
        } else if (arg4 == 1) {
            class110 var69;
            if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                class214 var68 = var11.method257((class42) null, var26, 1, var22, arg1, -64, var19, var29, arg5, var16, var20);
                if (class73.field1058 && var29) {
                    class125.method938(var68.field3289, var20, var21, var22);
                }
                var69 = var68.field3287;
            } else {
                var69 = new class264(arg9, 1, arg5, arg7, arg0, arg10, -1, var11.field441, (class110) null);
            }
            class43.method331(arg8, arg0, arg10, var19, var69, (class110) null, class144.field2203[arg5], 0, var27);
            if (var11.field399 && arg1) {
                if (arg5 == 0) {
                    class13.field179[arg8][arg0][arg10 + 1] = 50;
                } else if (arg5 == 1) {
                    class13.field179[arg8][arg0 + 1][arg10 + 1] = 50;
                } else if (arg5 == 2) {
                    class13.field179[arg8][arg0 + 1][arg10] = 50;
                } else if (arg5 == 3) {
                    class13.field179[arg8][arg0][arg10] = 50;
                }
            }
            if (var11.field466 != 0 && arg2 != null) {
                arg2.method2394(arg10, var11.field405, arg4, 17530, arg0, arg5, !var11.field437);
            }
        } else if (arg6 <= -47) {
            if (arg4 == 2) {
                int var34 = arg5 + 1 & 0x3;
                class110 var36;
                class110 var38;
                if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                    class214 var35 = var11.method257((class42) null, var26, 2, var22, arg1, 73, var19, var29, arg5 + 4, var16, var20);
                    if (class73.field1058 && var29) {
                        class125.method938(var35.field3289, var20, var21, var22);
                    }
                    var36 = var35.field3287;
                    class214 var37 = var11.method257((class42) null, var26, 2, var22, arg1, -82, var19, var29, var34, var16, var20);
                    if (class73.field1058 && var29) {
                        class125.method938(var37.field3289, var20, var21, var22);
                    }
                    var38 = var37.field3287;
                } else {
                    var36 = new class264(arg9, 2, arg5 + 4, arg7, arg0, arg10, -1, var11.field441, (class110) null);
                    var38 = new class264(arg9, 2, var34, arg7, arg0, arg10, -1, var11.field441, (class110) null);
                }
                class43.method331(arg8, arg0, arg10, var19, var36, var38, class207.field3167[arg5], class207.field3167[var34], var27);
                if (var11.field430 == 1 && arg1) {
                    if (arg5 == 0) {
                        class283.field4396[arg8][arg0][arg10] = class261.method1835(class283.field4396[arg8][arg0][arg10], 1);
                        class283.field4396[arg8][arg0][arg10 + 1] = class261.method1835(class283.field4396[arg8][arg0][arg10 + 1], 2);
                    } else if (arg5 == 1) {
                        class283.field4396[arg8][arg0][arg10 + 1] = class261.method1835(class283.field4396[arg8][arg0][arg10 + 1], 2);
                        class283.field4396[arg8][arg0 + 1][arg10] = class261.method1835(class283.field4396[arg8][arg0 + 1][arg10], 1);
                    } else if (arg5 == 2) {
                        class283.field4396[arg8][arg0 + 1][arg10] = class261.method1835(class283.field4396[arg8][arg0 + 1][arg10], 1);
                        class283.field4396[arg8][arg0][arg10] = class261.method1835(class283.field4396[arg8][arg0][arg10], 2);
                    } else if (arg5 == 3) {
                        class283.field4396[arg8][arg0][arg10] = class261.method1835(class283.field4396[arg8][arg0][arg10], 2);
                        class283.field4396[arg8][arg0][arg10] = class261.method1835(class283.field4396[arg8][arg0][arg10], 1);
                    }
                }
                if (var11.field466 != 0 && arg2 != null) {
                    arg2.method2394(arg10, var11.field405, arg4, 17530, arg0, arg5, !var11.field437);
                }
                if (var11.field426 != 16) {
                    class300.method2065(arg8, arg0, arg10, var11.field426);
                }
            } else if (arg4 == 3) {
                class110 var40;
                if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                    class214 var39 = var11.method257((class42) null, var26, 3, var22, arg1, -113, var19, var29, arg5, var16, var20);
                    if (class73.field1058 && var29) {
                        class125.method938(var39.field3289, var20, var21, var22);
                    }
                    var40 = var39.field3287;
                } else {
                    var40 = new class264(arg9, 3, arg5, arg7, arg0, arg10, -1, var11.field441, (class110) null);
                }
                class43.method331(arg8, arg0, arg10, var19, var40, (class110) null, class144.field2203[arg5], 0, var27);
                if (var11.field399 && arg1) {
                    if (arg5 == 0) {
                        class13.field179[arg8][arg0][arg10 + 1] = 50;
                    } else if (arg5 == 1) {
                        class13.field179[arg8][arg0 + 1][arg10 + 1] = 50;
                    } else if (arg5 == 2) {
                        class13.field179[arg8][arg0 + 1][arg10] = 50;
                    } else if (arg5 == 3) {
                        class13.field179[arg8][arg0][arg10] = 50;
                    }
                }
                if (var11.field466 != 0 && arg2 != null) {
                    arg2.method2394(arg10, var11.field405, arg4, 17530, arg0, arg5, !var11.field437);
                }
            } else if (arg4 == 9) {
                class110 var42;
                if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                    class214 var41 = var11.method257((class42) null, var26, arg4, var22, arg1, -82, var19, var29, arg5, var16, var20);
                    if (class73.field1058 && var29) {
                        class125.method938(var41.field3289, var20, var21, var22);
                    }
                    var42 = var41.field3287;
                } else {
                    var42 = new class264(arg9, arg4, arg5, arg7, arg0, arg10, -1, var11.field441, (class110) null);
                }
                class189.method1402(arg8, arg0, arg10, var19, 1, 1, var42, 0, var27);
                if (var11.field466 != 0 && arg2 != null) {
                    arg2.method2396(!var11.field437, var13, -16161, arg0, arg10, var12, var11.field405);
                }
                if (var11.field426 != 16) {
                    class300.method2065(arg8, arg0, arg10, var11.field426);
                }
            } else if (arg4 == 4) {
                class110 var67;
                if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                    class214 var66 = var11.method257((class42) null, var26, 4, var22, arg1, 101, var19, var29, arg5, var16, var20);
                    if (class73.field1058 && var29) {
                        class125.method938(var66.field3289, var20, var21, var22);
                    }
                    var67 = var66.field3287;
                } else {
                    var67 = new class264(arg9, 4, arg5, arg7, arg0, arg10, -1, var11.field441, (class110) null);
                }
                class283.method1964(arg8, arg0, arg10, var19, var67, (class110) null, class207.field3167[arg5], 0, 0, 0, var27);
            } else if (arg4 == 5) {
                int var43 = 16;
                long var44 = class205.method1478(arg8, arg0, arg10);
                if (var44 != 0L) {
                    var43 = class226.method1607(-120, (int) (var44 >>> 32) & Integer.MAX_VALUE).field426;
                }
                class110 var47;
                if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                    class214 var46 = var11.method257((class42) null, var26, 4, var22, arg1, -89, var19, var29, arg5, var16, var20);
                    if (class73.field1058 && var29) {
                        class125.method938(var46.field3289, var20 - (class207.field3180[arg5] * 8), var21, var22 - (class218.field3341[arg5] * 8));
                    }
                    var47 = var46.field3287;
                } else {
                    var47 = new class264(arg9, 4, arg5, arg7, arg0, arg10, -1, var11.field441, (class110) null);
                }
                class283.method1964(arg8, arg0, arg10, var19, var47, (class110) null, class207.field3167[arg5], 0, class207.field3180[arg5] * var43, class218.field3341[arg5] * var43, var27);
            } else if (arg4 == 6) {
                int var61 = 8;
                long var62 = class205.method1478(arg8, arg0, arg10);
                if (var62 != 0L) {
                    var61 = class226.method1607(-5, Integer.MAX_VALUE & (int) (var62 >>> 32)).field426 / 2;
                }
                class110 var65;
                if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                    class214 var64 = var11.method257((class42) null, var26, 4, var22, arg1, -104, var19, var29, arg5 + 4, var16, var20);
                    if (class73.field1058 && var29) {
                        class125.method938(var64.field3289, var20 - (class170.field2745[arg5] * 8), var21, var22 - (class174.field2797[arg5] * 8));
                    }
                    var65 = var64.field3287;
                } else {
                    var65 = new class264(arg9, 4, arg5 + 4, arg7, arg0, arg10, -1, var11.field441, (class110) null);
                }
                class283.method1964(arg8, arg0, arg10, var19, var65, (class110) null, 256, arg5, class170.field2745[arg5] * var61, class174.field2797[arg5] * var61, var27);
            } else if (arg4 == 7) {
                int var58 = arg5 + 2 & 0x3;
                class110 var60;
                if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                    class214 var59 = var11.method257((class42) null, var26, 4, var22, arg1, -82, var19, var29, var58 + 4, var16, var20);
                    if (class73.field1058 && var29) {
                        class125.method938(var59.field3289, var20, var21, var22);
                    }
                    var60 = var59.field3287;
                } else {
                    var60 = new class264(arg9, 4, var58 + 4, arg7, arg0, arg10, -1, var11.field441, (class110) null);
                }
                class283.method1964(arg8, arg0, arg10, var19, var60, (class110) null, 256, var58, 0, 0, var27);
            } else if (arg4 == 8) {
                long var48 = class205.method1478(arg8, arg0, arg10);
                int var50 = 8;
                if (var48 != 0L) {
                    var50 = class226.method1607(-126, (int) (var48 >>> 32) & Integer.MAX_VALUE).field426 / 2;
                }
                int var51 = arg5 + 2 & 0x3;
                class110 var55;
                class110 var57;
                if (var11.field475 == -1 && var11.field446 == null && var11.field450 == null && !var11.field418) {
                    int var52 = class174.field2797[arg5] * 8;
                    int var53 = class170.field2745[arg5] * 8;
                    class214 var54 = var11.method257((class42) null, var26, 4, var22, arg1, -78, var19, var29, arg5 + 4, var16, var20);
                    if (class73.field1058 && var29) {
                        class125.method938(var54.field3289, var20 - var53, var21, var22 - var52);
                    }
                    var55 = var54.field3287;
                    class214 var56 = var11.method257((class42) null, var26, 4, var22, arg1, 91, var19, var29, var51 + 4, var16, var20);
                    if (class73.field1058 && var29) {
                        class125.method938(var56.field3289, var20 - var53, var21, var22 - var52);
                    }
                    var57 = var56.field3287;
                } else {
                    var55 = new class264(arg9, 4, arg5 + 4, arg7, arg0, arg10, -1, var11.field441, (class110) null);
                    var57 = new class264(arg9, 4, var51 + 4, arg7, arg0, arg10, -1, var11.field441, (class110) null);
                }
                class283.method1964(arg8, arg0, arg10, var19, var55, var57, 256, arg5, class170.field2745[arg5] * var50, class174.field2797[arg5] * var50, var27);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 714)
    public static final void method1929(int arg0) {
        field4321++;
        int var1 = -33 / ((arg0 - 38) / 36);
        class94.field1330.method752(false);
        class94.field1331.method752(false);
        class320.field4941.method752(false);
        class251.field3785.method752(false);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLjava/lang/String;Z)V", line = 734)
    public static final void method1930(boolean arg0, String arg1, boolean arg2) {
        field4317++;
        short[] var3 = new short[16];
        String var4 = arg1.toLowerCase();
        int var5 = 0;
        for (int var6 = 0; var6 < class12.field153; var6++) {
            class108 var7 = class222.method1576(var6, (byte) 92);
            if ((!arg2 || var7.field1581) && var7.field1571 == -1 && var7.field1636 == -1 && var7.field1627 == 0 && var7.field1630.toLowerCase().indexOf(var4) != -1) {
                if (var5 >= 250) {
                    class191.field2985 = -1;
                    class23.field257 = null;
                    return;
                }
                if (var3.length <= var5) {
                    short[] var8 = new short[var3.length * 2];
                    for (int var9 = 0; var9 < var5; var9++) {
                        var8[var9] = var3[var9];
                    }
                    var3 = var8;
                }
                var3[var5++] = (short) var6;
            }
        }
        if (arg0) {
            method1929(95);
        }
        class191.field2985 = var5;
        class43.field622 = 0;
        class23.field257 = var3;
        String[] var10 = new String[class191.field2985];
        for (int var11 = 0; var11 < class191.field2985; var11++) {
            var10[var11] = class222.method1576(var3[var11], (byte) 92).field1630;
        }
        class325.method2256(0, class23.field257, var10);
    }
}
