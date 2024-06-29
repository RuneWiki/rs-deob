import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class183 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field3263 = 0;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Ljd;")
    public static class86 field3265 = class122.method868("<img=1>", true);

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lwb;")
    public static class26 field3266;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZIIIZILig;IIIZ)V")
    public static final void method1267(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, class9 arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field3264++;
        if (arg0 && !class171.method1225(-123) && (class86.field1693[0][arg5][arg1] & 0x2) == 0) {
            if ((class86.field1693[arg3][arg5][arg1] & 0x10) != 0) {
                return;
            }
            if (class66.method470(arg1, -81, arg3, arg5) != class6.field235) {
                return;
            }
        }
        if (class86.field1703 > arg3) {
            class86.field1703 = arg3;
        }
        class117 var11 = class268.method1845(arg8, (byte) -45);
        int var12;
        int var13;
        if (arg9 == 1 || arg9 == 3) {
            var12 = var11.field2273;
            var13 = var11.field2307;
        } else {
            var12 = var11.field2307;
            var13 = var11.field2273;
        }
        int var14;
        int var15;
        if (arg5 + var12 > 104) {
            var14 = arg5 + 1;
            var15 = arg5;
        } else {
            var15 = (var12 >> 1) + arg5;
            var14 = (var12 + 1 >> 1) + arg5;
        }
        int var16;
        int var17;
        if (arg1 + var13 > 104) {
            var16 = arg1 + 1;
            var17 = arg1;
        } else {
            var17 = (var13 >> 1) + arg1;
            var16 = arg1 + (var13 + 1 >> 1);
        }
        int[][] var18 = class35.field796[arg2];
        int var19 = (arg5 << 7) + (var12 << 6);
        int var20 = var18[var14][var17] + var18[var15][var17] + var18[var14][var16] + var18[var15][var16] >> 2;
        int var21 = (arg1 << 7) + (var13 << 6);
        long var22 = (long) (arg9 << 20 | arg7 << 14 | arg1 << 7 | arg5 | 0x40000000);
        if (var11.field2301 == 0 || arg10) {
            var22 |= Long.MIN_VALUE;
        }
        if (var11.field2264 == 1) {
            var22 |= 0x400000L;
        }
        if (var11.field2251) {
            var22 |= 0x80000000L;
        }
        int[][] var24 = null;
        if (arg10) {
            var24 = class78.field1536[0];
        } else if (arg2 < 3) {
            var24 = class35.field796[arg2 + 1];
        }
        long var25 = var22 | (long) arg8 << 32;
        if (var11.method832(93)) {
            class14.method105(var11, arg1, arg9, (class224) null, arg3, false, (class170) null, arg5);
        }
        boolean var27 = !arg10 & var11.field2270;
        if (arg7 == 22) {
            if (class116.field2224 || var11.field2301 != 0 || var11.field2288 == 1 || var11.field2244) {
                class80 var29;
                if (var11.field2277 == -1 && var11.field2295 == null) {
                    class244 var28 = var11.method828(var19, var18, var27, arg0, var21, var20, 22, var24, -117, arg9, (class101) null);
                    var29 = var28.field4358;
                } else {
                    var29 = new class215(arg8, 22, arg9, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                }
                class82.method574(arg3, arg5, arg1, var20, var29, var25, var11.field2268);
                if (var11.field2288 == 1 && arg6 != null) {
                    arg6.method69(8192, arg1, arg5);
                }
            }
        } else if (arg7 == 10 || arg7 == 11) {
            class80 var69;
            if (var11.field2277 == -1 && var11.field2295 == null) {
                class244 var68 = var11.method828(var19, var18, var27, arg0, var21, var20, 10, var24, -101, ~arg7 == -12 ? arg9 + 4 : arg9, (class101) null);
                var69 = var68.field4358;
            } else {
                var69 = new class215(arg8, 10, arg7 == 11 ? arg9 + 4 : arg9, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
            }
            if (var69 != null) {
                boolean var70 = class46.method363(arg3, arg5, arg1, var20, var12, var13, var69, 0, var25);
                if (var11.field2283 && var70 && arg0) {
                    int var71 = 15;
                    if (var69 instanceof class32) {
                        var71 = ((class32) var69).method217() / 4;
                        if (var71 > 30) {
                            var71 = 30;
                        }
                    }
                    for (int var72 = 0; var72 <= var12; var72++) {
                        for (int var73 = 0; var73 <= var13; var73++) {
                            if (var71 > class144.field2732[arg3][arg5 + var72][arg1 + var73]) {
                                class144.field2732[arg3][arg5 + var72][arg1 + var73] = (byte) var71;
                            }
                        }
                    }
                }
            }
            if (var11.field2288 != 0 && arg6 != null) {
                arg6.method64(var11.field2281, var12, arg5, arg1, var13, -1);
            }
        } else if (arg7 >= 12) {
            class80 var31;
            if (var11.field2277 == -1 && var11.field2295 == null) {
                class244 var30 = var11.method828(var19, var18, var27, arg0, var21, var20, arg7, var24, -32, arg9, (class101) null);
                var31 = var30.field4358;
            } else {
                var31 = new class215(arg8, arg7, arg9, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
            }
            class46.method363(arg3, arg5, arg1, var20, 1, 1, var31, 0, var25);
            if (arg0 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg3 > 0) {
                class180.field3250[arg3][arg5][arg1] = class49.method377(class180.field3250[arg3][arg5][arg1], 4);
            }
            if (var11.field2288 != 0 && arg6 != null) {
                arg6.method64(var11.field2281, var12, arg5, arg1, var13, -1);
            }
        } else if (arg7 == 0) {
            class80 var33;
            if (var11.field2277 == -1 && var11.field2295 == null) {
                class244 var32 = var11.method828(var19, var18, var27, arg0, var21, var20, 0, var24, -105, arg9, (class101) null);
                var33 = var32.field4358;
            } else {
                var33 = new class215(arg8, 0, arg9, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
            }
            class144.method1023(arg3, arg5, arg1, var20, var33, (class80) null, class218.field3921[arg9], 0, var25);
            if (arg0) {
                if (arg9 == 0) {
                    if (var11.field2283) {
                        class144.field2732[arg3][arg5][arg1] = 50;
                        class144.field2732[arg3][arg5][arg1 + 1] = 50;
                    }
                    if (var11.field2239) {
                        class180.field3250[arg3][arg5][arg1] = class49.method377(class180.field3250[arg3][arg5][arg1], 1);
                    }
                } else if (arg9 == 1) {
                    if (var11.field2283) {
                        class144.field2732[arg3][arg5][arg1 + 1] = 50;
                        class144.field2732[arg3][arg5 + 1][arg1 + 1] = 50;
                    }
                    if (var11.field2239) {
                        class180.field3250[arg3][arg5][arg1 + 1] = class49.method377(class180.field3250[arg3][arg5][arg1 + 1], 2);
                    }
                } else if (arg9 == 2) {
                    if (var11.field2283) {
                        class144.field2732[arg3][arg5 + 1][arg1] = 50;
                        class144.field2732[arg3][arg5 + 1][arg1 + 1] = 50;
                    }
                    if (var11.field2239) {
                        class180.field3250[arg3][arg5 + 1][arg1] = class49.method377(class180.field3250[arg3][arg5 + 1][arg1], 1);
                    }
                } else if (arg9 == 3) {
                    if (var11.field2283) {
                        class144.field2732[arg3][arg5][arg1] = 50;
                        class144.field2732[arg3][arg5 + 1][arg1] = 50;
                    }
                    if (var11.field2239) {
                        class180.field3250[arg3][arg5][arg1] = class49.method377(class180.field3250[arg3][arg5][arg1], 2);
                    }
                }
            }
            if (var11.field2288 != 0 && arg6 != null) {
                arg6.method56(arg7, 10, var11.field2281, arg5, arg1, arg9);
            }
            if (var11.field2253 != 16) {
                class5.method35(arg3, arg5, arg1, var11.field2253);
            }
        } else if (!arg4) {
            if (arg7 == 1) {
                class80 var35;
                if (var11.field2277 == -1 && var11.field2295 == null) {
                    class244 var34 = var11.method828(var19, var18, var27, arg0, var21, var20, 1, var24, -114, arg9, (class101) null);
                    var35 = var34.field4358;
                } else {
                    var35 = new class215(arg8, 1, arg9, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                }
                class144.method1023(arg3, arg5, arg1, var20, var35, (class80) null, class69.field1418[arg9], 0, var25);
                if (var11.field2283 && arg0) {
                    if (arg9 == 0) {
                        class144.field2732[arg3][arg5][arg1 + 1] = 50;
                    } else if (arg9 == 1) {
                        class144.field2732[arg3][arg5 + 1][arg1 + 1] = 50;
                    } else if (arg9 == 2) {
                        class144.field2732[arg3][arg5 + 1][arg1] = 50;
                    } else if (arg9 == 3) {
                        class144.field2732[arg3][arg5][arg1] = 50;
                    }
                }
                if (var11.field2288 != 0 && arg6 != null) {
                    arg6.method56(arg7, 10, var11.field2281, arg5, arg1, arg9);
                }
            } else if (arg7 == 2) {
                int var36 = arg9 + 1 & 0x3;
                class80 var38;
                class80 var40;
                if (var11.field2277 == -1 && var11.field2295 == null) {
                    class244 var37 = var11.method828(var19, var18, var27, arg0, var21, var20, 2, var24, -85, arg9 + 4, (class101) null);
                    var38 = var37.field4358;
                    class244 var39 = var11.method828(var19, var18, var27, arg0, var21, var20, 2, var24, -93, var36, (class101) null);
                    var40 = var39.field4358;
                } else {
                    var38 = new class215(arg8, 2, arg9 + 4, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                    var40 = new class215(arg8, 2, var36, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                }
                class144.method1023(arg3, arg5, arg1, var20, var38, var40, class218.field3921[arg9], class218.field3921[var36], var25);
                if (var11.field2239 && arg0) {
                    if (arg9 == 0) {
                        class180.field3250[arg3][arg5][arg1] = class49.method377(class180.field3250[arg3][arg5][arg1], 1);
                        class180.field3250[arg3][arg5][arg1 + 1] = class49.method377(class180.field3250[arg3][arg5][arg1 + 1], 2);
                    } else if (arg9 == 1) {
                        class180.field3250[arg3][arg5][arg1 + 1] = class49.method377(class180.field3250[arg3][arg5][arg1 + 1], 2);
                        class180.field3250[arg3][arg5 + 1][arg1] = class49.method377(class180.field3250[arg3][arg5 + 1][arg1], 1);
                    } else if (arg9 == 2) {
                        class180.field3250[arg3][arg5 + 1][arg1] = class49.method377(class180.field3250[arg3][arg5 + 1][arg1], 1);
                        class180.field3250[arg3][arg5][arg1] = class49.method377(class180.field3250[arg3][arg5][arg1], 2);
                    } else if (arg9 == 3) {
                        class180.field3250[arg3][arg5][arg1] = class49.method377(class180.field3250[arg3][arg5][arg1], 2);
                        class180.field3250[arg3][arg5][arg1] = class49.method377(class180.field3250[arg3][arg5][arg1], 1);
                    }
                }
                if (var11.field2288 != 0 && arg6 != null) {
                    arg6.method56(arg7, 10, var11.field2281, arg5, arg1, arg9);
                }
                if (var11.field2253 != 16) {
                    class5.method35(arg3, arg5, arg1, var11.field2253);
                }
            } else if (arg7 == 3) {
                class80 var42;
                if (var11.field2277 == -1 && var11.field2295 == null) {
                    class244 var41 = var11.method828(var19, var18, var27, arg0, var21, var20, 3, var24, -59, arg9, (class101) null);
                    var42 = var41.field4358;
                } else {
                    var42 = new class215(arg8, 3, arg9, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                }
                class144.method1023(arg3, arg5, arg1, var20, var42, (class80) null, class69.field1418[arg9], 0, var25);
                if (var11.field2283 && arg0) {
                    if (arg9 == 0) {
                        class144.field2732[arg3][arg5][arg1 + 1] = 50;
                    } else if (arg9 == 1) {
                        class144.field2732[arg3][arg5 + 1][arg1 + 1] = 50;
                    } else if (arg9 == 2) {
                        class144.field2732[arg3][arg5 + 1][arg1] = 50;
                    } else if (arg9 == 3) {
                        class144.field2732[arg3][arg5][arg1] = 50;
                    }
                }
                if (var11.field2288 != 0 && arg6 != null) {
                    arg6.method56(arg7, 10, var11.field2281, arg5, arg1, arg9);
                }
            } else if (arg7 == 9) {
                class80 var44;
                if (var11.field2277 == -1 && var11.field2295 == null) {
                    class244 var43 = var11.method828(var19, var18, var27, arg0, var21, var20, arg7, var24, -76, arg9, (class101) null);
                    var44 = var43.field4358;
                } else {
                    var44 = new class215(arg8, arg7, arg9, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                }
                class46.method363(arg3, arg5, arg1, var20, 1, 1, var44, 0, var25);
                if (var11.field2288 != 0 && arg6 != null) {
                    arg6.method64(var11.field2281, var12, arg5, arg1, var13, -1);
                }
                if (var11.field2253 != 16) {
                    class5.method35(arg3, arg5, arg1, var11.field2253);
                }
            } else if (arg7 == 4) {
                class80 var46;
                if (var11.field2277 == -1 && var11.field2295 == null) {
                    class244 var45 = var11.method828(var19, var18, var27, arg0, var21, var20, 4, var24, -51, arg9, (class101) null);
                    var46 = var45.field4358;
                } else {
                    var46 = new class215(arg8, 4, arg9, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                }
                class34.method261(arg3, arg5, arg1, var20, var46, (class80) null, class218.field3921[arg9], 0, 0, 0, var25);
            } else if (arg7 == 5) {
                int var47 = 16;
                long var48 = class5.method30(arg3, arg5, arg1);
                if (var48 != 0L) {
                    var47 = class268.method1845((int) (var48 >>> 32) & Integer.MAX_VALUE, (byte) -80).field2253;
                }
                class80 var51;
                if (var11.field2277 == -1 && var11.field2295 == null) {
                    class244 var50 = var11.method828(var19, var18, var27, arg0, var21, var20, 4, var24, -62, arg9, (class101) null);
                    var51 = var50.field4358;
                } else {
                    var51 = new class215(arg8, 4, arg9, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                }
                class34.method261(arg3, arg5, arg1, var20, var51, (class80) null, class218.field3921[arg9], 0, class185.field3281[arg9] * var47, class263.field4670[arg9] * var47, var25);
            } else if (arg7 == 6) {
                int var52 = 8;
                long var53 = class5.method30(arg3, arg5, arg1);
                if (var53 != 0L) {
                    var52 = class268.method1845((int) (var53 >>> 32) & Integer.MAX_VALUE, (byte) -43).field2253 / 2;
                }
                class80 var56;
                if (var11.field2277 == -1 && var11.field2295 == null) {
                    class244 var55 = var11.method828(var19, var18, var27, arg0, var21, var20, 4, var24, -82, arg9 + 4, (class101) null);
                    var56 = var55.field4358;
                } else {
                    var56 = new class215(arg8, 4, arg9 + 4, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                }
                class34.method261(arg3, arg5, arg1, var20, var56, (class80) null, 256, arg9, class76.field1512[arg9] * var52, class208.field3772[arg9] * var52, var25);
            } else if (arg7 == 7) {
                int var57 = arg9 + 2 & 0x3;
                class80 var59;
                if (var11.field2277 == -1 && var11.field2295 == null) {
                    class244 var58 = var11.method828(var19, var18, var27, arg0, var21, var20, 4, var24, -80, var57 + 4, (class101) null);
                    var59 = var58.field4358;
                } else {
                    var59 = new class215(arg8, 4, var57 + 4, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                }
                class34.method261(arg3, arg5, arg1, var20, var59, (class80) null, 256, var57, 0, 0, var25);
            } else if (arg7 == 8) {
                int var60 = 8;
                long var61 = class5.method30(arg3, arg5, arg1);
                if (var61 != 0L) {
                    var60 = class268.method1845(Integer.MAX_VALUE & (int) (var61 >>> 32), (byte) -71).field2253 / 2;
                }
                int var63 = arg9 + 2 & 0x3;
                class80 var65;
                class80 var67;
                if (var11.field2277 == -1 && var11.field2295 == null) {
                    class244 var64 = var11.method828(var19, var18, var27, arg0, var21, var20, 4, var24, -90, arg9 + 4, (class101) null);
                    var65 = var64.field4358;
                    class244 var66 = var11.method828(var19, var18, var27, arg0, var21, var20, 4, var24, -48, var63 + 4, (class101) null);
                    var67 = var66.field4358;
                } else {
                    var65 = new class215(arg8, 4, arg9 + 4, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                    var67 = new class215(arg8, 4, var63 + 4, arg2, arg5, arg1, var11.field2277, var11.field2237, (class80) null);
                }
                class34.method261(arg3, arg5, arg1, var20, var65, var67, 256, arg9, class76.field1512[arg9] * var60, class208.field3772[arg9] * var60, var25);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method1268(byte arg0) {
        if (arg0 == 103) {
            field3266 = null;
            field3265 = null;
        }
    }
}
