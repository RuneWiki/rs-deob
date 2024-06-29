import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class312 extends class95 {

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "Z")
    public static boolean field5394 = true;

    @OriginalMember(owner = "client!vf", name = "S", descriptor = "I")
    public static volatile int field5398 = -1;

    @OriginalMember(owner = "client!vf", name = "U", descriptor = "I")
    public static int field5400 = 0;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!vf", name = "V", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!vf", name = "W", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!vf", name = "X", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!vf", name = "T", descriptor = "Lsf;")
    public class108 field5399;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "[I")
    public int[] field5388;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "[I")
    public int[] field5390;

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "[I")
    public int[] field5393;

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "[I")
    public int[] field5397;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(II)I", line = 6)
    public final int method2172(int arg0, int arg1) {
        field5401++;
        if (arg1 != -1) {
            this.field5393 = (int[]) null;
        }
        if (this.field5393 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5393.length; var3++) {
            if (this.field5388[var3] == arg0) {
                return this.field5393[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILoj;IIIZZIII)V", line = 31)
    public static final void method2173(int arg0, int arg1, class328 arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field5403++;
        if (arg7 && !class251.method1774(arg9 + 903) && (class166.field2980[0][arg10][arg5] & 0x2) == 0) {
            if ((class166.field2980[arg3][arg10][arg5] & 0x10) != 0) {
                return;
            }
            if (class237.method1638(arg10, arg3, 113, arg5) != class90.field1416) {
                return;
            }
        }
        if (arg3 < class315.field5430) {
            class315.field5430 = arg3;
        }
        class60 var11 = class201.method1424(arg0, (byte) 100);
        if (class231.field4051 && var11.field964) {
            return;
        }
        int var12;
        int var13;
        if (arg1 == 1 || arg1 == 3) {
            var13 = var11.field899;
            var12 = var11.field939;
        } else {
            var12 = var11.field899;
            var13 = var11.field939;
        }
        int var14;
        int var15;
        if (arg10 + var13 > 104) {
            var14 = arg10;
            var15 = arg10 + 1;
        } else {
            var15 = (var13 + 1 >> 1) + arg10;
            var14 = arg10 + (var13 >> 1);
        }
        int var16;
        int var17;
        if ((arg5 + var12) <= 104) {
            var16 = (var12 >> 1) + arg5;
            var17 = (var12 + 1 >> 1) + arg5;
        } else {
            var17 = arg5 + 1;
            var16 = arg5;
        }
        int var18 = (arg10 << 7) + (var13 << 6);
        int[][] var19 = class278.field4883[arg4];
        int var20 = (arg5 << 7) + (var12 << 6);
        int var21 = 0;
        int var22 = var19[var15][var16] + var19[var15][var17] + var19[var14][var16] + var19[var14][var17] >> 2;
        if (class231.field4051 && arg4 != 0) {
            int[][] var23 = class278.field4883[0];
            var21 = var22 - (var23[var14][var17] + var23[var15][var16] + var23[var14][var16] + var23[var15][var17] >> 2);
        }
        int[][] var24 = (int[][]) null;
        long var25 = (long) (arg8 << 14 | arg10 | arg5 << 7 | arg1 << 20 | 0x40000000);
        if (arg6) {
            var24 = class104.field1809[0];
        } else if (arg4 < 3) {
            var24 = class278.field4883[arg4 + 1];
        }
        if (var11.field928 == 0 || arg6) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field891 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field930) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg0 << 32;
        if (var11.method408((byte) -29)) {
            class290.method2072(arg5, arg1, var11, arg3, (class51) null, 128, arg10, (class45) null);
        }
        boolean var29 = !arg6 & var11.field921;
        if (arg8 == 22) {
            if (class137.field2427 || var11.field928 != 0 || var11.field946 == 1 || var11.field937) {
                class290 var77;
                if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                    class155 var76 = var11.method410(var24, arg1, arg7, (byte) -99, 22, (class257) null, var29, var20, var19, var22, var18);
                    if (class231.field4051 && var29) {
                        class238.method1640(var76.field2781, var18, var21, var20);
                    }
                    var77 = var76.field2788;
                } else {
                    var77 = new class114(arg0, 22, arg1, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
                }
                class39.method265(arg3, arg10, arg5, var22, var77, var27, var11.field963);
                if (var11.field946 == 1 && arg2 != null) {
                    arg2.method2251(arg10, arg5, (byte) 70);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class290 var71;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                class155 var70 = var11.method410(var24, arg8 == 11 ? arg1 + 4 : arg1, arg7, (byte) -107, 10, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var70.field2781, var18, var21, var20);
                }
                var71 = var70.field2788;
            } else {
                var71 = new class114(arg0, 10, arg8 == 11 ? arg1 + 4 : arg1, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            if (var71 != null) {
                boolean var72 = class258.method1835(arg3, arg10, arg5, var22, var13, var12, var71, 0, var27);
                if (var11.field896 && var72 && arg7) {
                    int var73 = 15;
                    if (var71 instanceof class113) {
                        var73 = ((class113) var71).method302() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var13; var74++) {
                        for (int var75 = 0; var75 <= var12; var75++) {
                            if (class182.field3357[arg3][arg10 + var74][arg5 + var75] < var73) {
                                class182.field3357[arg3][arg10 + var74][arg5 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field946 != 0 && arg2 != null) {
                arg2.method2242(var11.field959, false, arg10, arg5, var12, var13);
            }
        } else if (arg8 >= 12) {
            class290 var69;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                class155 var68 = var11.method410(var24, arg1, arg7, (byte) -89, arg8, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var68.field2781, var18, var21, var20);
                }
                var69 = var68.field2788;
            } else {
                var69 = new class114(arg0, arg8, arg1, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            class258.method1835(arg3, arg10, arg5, var22, 1, 1, var69, 0, var27);
            if (arg7 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg3 > 0) {
                class149.field2719[arg3][arg10][arg5] = class242.method1674(class149.field2719[arg3][arg10][arg5], 4);
            }
            if (var11.field946 != 0 && arg2 != null) {
                arg2.method2242(var11.field959, false, arg10, arg5, var12, var13);
            }
        } else if (arg8 == arg9) {
            class290 var67;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                class155 var66 = var11.method410(var24, arg1, arg7, (byte) -108, 0, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var66.field2781, var18, var21, var20);
                }
                var67 = var66.field2788;
            } else {
                var67 = new class114(arg0, 0, arg1, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            class261.method1852(arg3, arg10, arg5, var22, var67, (class290) null, class174.field3174[arg1], 0, var27);
            if (arg7) {
                if (arg1 == 0) {
                    if (var11.field896) {
                        class182.field3357[arg3][arg10][arg5] = 50;
                        class182.field3357[arg3][arg10][arg5 + 1] = 50;
                    }
                    if (var11.field953) {
                        class149.field2719[arg3][arg10][arg5] = class242.method1674(class149.field2719[arg3][arg10][arg5], 1);
                    }
                } else if (arg1 == 1) {
                    if (var11.field896) {
                        class182.field3357[arg3][arg10][arg5 + 1] = 50;
                        class182.field3357[arg3][arg10 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field953) {
                        class149.field2719[arg3][arg10][arg5 + 1] = class242.method1674(class149.field2719[arg3][arg10][arg5 + 1], 2);
                    }
                } else if (arg1 == 2) {
                    if (var11.field896) {
                        class182.field3357[arg3][arg10 + 1][arg5] = 50;
                        class182.field3357[arg3][arg10 + 1][arg5 + 1] = 50;
                    }
                    if (var11.field953) {
                        class149.field2719[arg3][arg10 + 1][arg5] = class242.method1674(class149.field2719[arg3][arg10 + 1][arg5], 1);
                    }
                } else if (arg1 == 3) {
                    if (var11.field896) {
                        class182.field3357[arg3][arg10][arg5] = 50;
                        class182.field3357[arg3][arg10 + 1][arg5] = 50;
                    }
                    if (var11.field953) {
                        class149.field2719[arg3][arg10][arg5] = class242.method1674(class149.field2719[arg3][arg10][arg5], 2);
                    }
                }
            }
            if (var11.field946 != 0 && arg2 != null) {
                arg2.method2240(var11.field959, arg1, arg5, arg10, arg8, 99);
            }
            if (var11.field927 != 16) {
                class199.method1410(arg3, arg10, arg5, var11.field927);
            }
        } else if (arg8 == 1) {
            class290 var65;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                class155 var64 = var11.method410(var24, arg1, arg7, (byte) -105, 1, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var64.field2781, var18, var21, var20);
                }
                var65 = var64.field2788;
            } else {
                var65 = new class114(arg0, 1, arg1, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            class261.method1852(arg3, arg10, arg5, var22, var65, (class290) null, class182.field3346[arg1], 0, var27);
            if (var11.field896 && arg7) {
                if (arg1 == 0) {
                    class182.field3357[arg3][arg10][arg5 + 1] = 50;
                } else if (arg1 == 1) {
                    class182.field3357[arg3][arg10 + 1][arg5 + 1] = 50;
                } else if (arg1 == 2) {
                    class182.field3357[arg3][arg10 + 1][arg5] = 50;
                } else if (arg1 == 3) {
                    class182.field3357[arg3][arg10][arg5] = 50;
                }
            }
            if (var11.field946 != 0 && arg2 != null) {
                arg2.method2240(var11.field959, arg1, arg5, arg10, arg8, -61);
            }
        } else if (arg8 == 2) {
            int var59 = arg1 + 1 & 0x3;
            class290 var61;
            class290 var63;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                class155 var60 = var11.method410(var24, arg1 + 4, arg7, (byte) -103, 2, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var60.field2781, var18, var21, var20);
                }
                var61 = var60.field2788;
                class155 var62 = var11.method410(var24, var59, arg7, (byte) -122, 2, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var62.field2781, var18, var21, var20);
                }
                var63 = var62.field2788;
            } else {
                var61 = new class114(arg0, 2, arg1 + 4, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
                var63 = new class114(arg0, 2, var59, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            class261.method1852(arg3, arg10, arg5, var22, var61, var63, class174.field3174[arg1], class174.field3174[var59], var27);
            if (var11.field953 && arg7) {
                if (arg1 == 0) {
                    class149.field2719[arg3][arg10][arg5] = class242.method1674(class149.field2719[arg3][arg10][arg5], 1);
                    class149.field2719[arg3][arg10][arg5 + 1] = class242.method1674(class149.field2719[arg3][arg10][arg5 + 1], 2);
                } else if (arg1 == 1) {
                    class149.field2719[arg3][arg10][arg5 + 1] = class242.method1674(class149.field2719[arg3][arg10][arg5 + 1], 2);
                    class149.field2719[arg3][arg10 + 1][arg5] = class242.method1674(class149.field2719[arg3][arg10 + 1][arg5], 1);
                } else if (arg1 == 2) {
                    class149.field2719[arg3][arg10 + 1][arg5] = class242.method1674(class149.field2719[arg3][arg10 + 1][arg5], 1);
                    class149.field2719[arg3][arg10][arg5] = class242.method1674(class149.field2719[arg3][arg10][arg5], 2);
                } else if (arg1 == 3) {
                    class149.field2719[arg3][arg10][arg5] = class242.method1674(class149.field2719[arg3][arg10][arg5], 2);
                    class149.field2719[arg3][arg10][arg5] = class242.method1674(class149.field2719[arg3][arg10][arg5], 1);
                }
            }
            if (var11.field946 != 0 && arg2 != null) {
                arg2.method2240(var11.field959, arg1, arg5, arg10, arg8, -52);
            }
            if (var11.field927 != 16) {
                class199.method1410(arg3, arg10, arg5, var11.field927);
            }
        } else if (arg8 == 3) {
            class290 var58;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                class155 var57 = var11.method410(var24, arg1, arg7, (byte) -94, 3, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var57.field2781, var18, var21, var20);
                }
                var58 = var57.field2788;
            } else {
                var58 = new class114(arg0, 3, arg1, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            class261.method1852(arg3, arg10, arg5, var22, var58, (class290) null, class182.field3346[arg1], 0, var27);
            if (var11.field896 && arg7) {
                if (arg1 == 0) {
                    class182.field3357[arg3][arg10][arg5 + 1] = 50;
                } else if (arg1 == 1) {
                    class182.field3357[arg3][arg10 + 1][arg5 + 1] = 50;
                } else if (arg1 == 2) {
                    class182.field3357[arg3][arg10 + 1][arg5] = 50;
                } else if (arg1 == 3) {
                    class182.field3357[arg3][arg10][arg5] = 50;
                }
            }
            if (var11.field946 != 0 && arg2 != null) {
                arg2.method2240(var11.field959, arg1, arg5, arg10, arg8, 116);
            }
        } else if (arg8 == 9) {
            class290 var31;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                class155 var30 = var11.method410(var24, arg1, arg7, (byte) -105, arg8, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var30.field2781, var18, var21, var20);
                }
                var31 = var30.field2788;
            } else {
                var31 = new class114(arg0, arg8, arg1, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            class258.method1835(arg3, arg10, arg5, var22, 1, 1, var31, 0, var27);
            if (var11.field946 != 0 && arg2 != null) {
                arg2.method2242(var11.field959, false, arg10, arg5, var12, var13);
            }
            if (var11.field927 != 16) {
                class199.method1410(arg3, arg10, arg5, var11.field927);
            }
        } else if (arg8 == 4) {
            class290 var33;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                class155 var32 = var11.method410(var24, arg1, arg7, (byte) -94, 4, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var32.field2781, var18, var21, var20);
                }
                var33 = var32.field2788;
            } else {
                var33 = new class114(arg0, 4, arg1, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            class276.method1991(arg3, arg10, arg5, var22, var33, (class290) null, class174.field3174[arg1], 0, 0, 0, var27);
        } else if (arg8 == 5) {
            int var34 = 16;
            long var35 = class282.method2031(arg3, arg10, arg5);
            if (var35 != 0L) {
                var34 = class201.method1424((int) (var35 >>> 32) & Integer.MAX_VALUE, (byte) 110).field927;
            }
            class290 var38;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                class155 var37 = var11.method410(var24, arg1, arg7, (byte) -109, 4, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var37.field2781, var18 - (class68.field1047[arg1] * 8), var21, var20 - (class142.field2504[arg1] * 8));
                }
                var38 = var37.field2788;
            } else {
                var38 = new class114(arg0, 4, arg1, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            class276.method1991(arg3, arg10, arg5, var22, var38, (class290) null, class174.field3174[arg1], 0, class68.field1047[arg1] * var34, class142.field2504[arg1] * var34, var27);
        } else if (arg8 == 6) {
            int var52 = 8;
            long var53 = class282.method2031(arg3, arg10, arg5);
            if (var53 != 0L) {
                var52 = class201.method1424((int) (var53 >>> 32) & Integer.MAX_VALUE, (byte) 124).field927 / 2;
            }
            class290 var56;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                class155 var55 = var11.method410(var24, arg1 + 4, arg7, (byte) -104, 4, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var55.field2781, var18 - class90.field1414[arg1] * 8, var21, var20 - (class69.field1077[arg1] * 8));
                }
                var56 = var55.field2788;
            } else {
                var56 = new class114(arg0, 4, arg1 + 4, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            class276.method1991(arg3, arg10, arg5, var22, var56, (class290) null, 256, arg1, class90.field1414[arg1] * var52, class69.field1077[arg1] * var52, var27);
        } else if (arg8 == 7) {
            int var49 = arg1 + 2 & 0x3;
            class290 var51;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                class155 var50 = var11.method410(var24, var49 + 4, arg7, (byte) -89, 4, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var50.field2781, var18, var21, var20);
                }
                var51 = var50.field2788;
            } else {
                var51 = new class114(arg0, 4, var49 + 4, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            class276.method1991(arg3, arg10, arg5, var22, var51, (class290) null, 256, var49, 0, 0, var27);
        } else if (arg8 == 8) {
            int var39 = 8;
            long var40 = class282.method2031(arg3, arg10, arg5);
            if (var40 != 0L) {
                var39 = class201.method1424((int) (var40 >>> 32) & Integer.MAX_VALUE, (byte) 91).field927 / 2;
            }
            int var42 = arg1 + 2 & 0x3;
            class290 var46;
            class290 var48;
            if (var11.field938 == -1 && var11.field912 == null && !var11.field958) {
                int var43 = class90.field1414[arg1] * 8;
                int var44 = class69.field1077[arg1] * 8;
                class155 var45 = var11.method410(var24, arg1 + 4, arg7, (byte) -110, 4, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var45.field2781, var18 - var43, var21, var20 - var44);
                }
                var46 = var45.field2788;
                class155 var47 = var11.method410(var24, var42 + 4, arg7, (byte) -95, 4, (class257) null, var29, var20, var19, var22, var18);
                if (class231.field4051 && var29) {
                    class238.method1640(var47.field2781, var18 - var43, var21, var20 - var44);
                }
                var48 = var47.field2788;
            } else {
                var46 = new class114(arg0, 4, arg1 + 4, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
                var48 = new class114(arg0, 4, var42 + 4, arg4, arg10, arg5, var11.field938, var11.field915, (class290) null);
            }
            class276.method1991(arg3, arg10, arg5, var22, var46, var48, 256, arg1, class90.field1414[arg1] * var39, class69.field1077[arg1] * var39, var27);
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(II)I", line = 696)
    public final int method2174(int arg0, int arg1) {
        field5396++;
        if (this.field5390 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field5390.length; var3++) {
            if (this.field5397[var3] == arg1) {
                return this.field5390[var3];
            }
        }
        if (arg0 < 75) {
            this.method2178((byte) -3);
        }
        return -1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)J", line = 720)
    public static final long method2175(int arg0, int arg1, int arg2) {
        class74 var3 = class99.field1759[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field1119; var4++) {
            class326 var5 = var3.field1118[var4];
            if ((var5.field5563 >> 29 & 0x3L) == 2L && var5.field5575 == arg1 && var5.field5576 == arg2) {
                return var5.field5563;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lrm;I)V", line = 753)
    public final void method2176(class249 arg0, int arg1) {
        field5402++;
        if (arg1 != 11560) {
            this.method2178((byte) 35);
        }
        while (true) {
            int var3 = arg0.method1731(true);
            if (var3 == 0) {
                return;
            }
            this.method2179(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)V", line = 773)
    public static final void method2177(int arg0, byte arg1) {
        field5395++;
        if (class203.field3658 == arg0) {
            return;
        }
        if (class203.field3658 == 0) {
            class103.method708(true);
        }
        if (arg0 == 40) {
            class134.method919(-1);
        }
        if (arg1 > -100) {
            field5400 = -7;
        }
        if (arg0 != 40 && class137.field2419 != null) {
            class137.field2419.method1487(13881);
            class137.field2419 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class155.field2793 = 0;
            class190.field3454 = 0;
            class281.field4926 = 1;
            class58.field861 = 1;
            class105.field1817 = 0;
            class68.method456((byte) -73, true);
        }
        boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (arg0 == 25 || arg0 == 10) {
            class203.method1426(32214);
        }
        if (arg0 == 5) {
            class329.method2253(124, class215.field3801);
        } else {
            class20.method136(1);
        }
        boolean var3 = class203.field3658 == 5 || class203.field3658 == 10 || class203.field3658 == 28;
        if (var2 != var3) {
            if (var2) {
                class155.field2797 = class198.field3568;
                if (class203.field3671 == 0) {
                    class128.method883((byte) 123, 2);
                } else {
                    class3.method24((byte) -79, 255, class198.field3568, 0, false, class96.field1535, 2);
                }
                class302.field5252.method1611(false, -19043);
            } else {
                class128.method883((byte) 123, 2);
                class302.field5252.method1611(true, -19043);
            }
        }
        if (class231.field4051 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class231.method1599();
        }
        class203.field3658 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)V", line = 860)
    public final void method2178(byte arg0) {
        field5391++;
        if (this.field5393 != null) {
            for (int var2 = 0; var2 < this.field5393.length; var2++) {
                this.field5393[var2] = class242.method1674(this.field5393[var2], 32768);
            }
        }
        if (this.field5390 != null) {
            for (int var3 = 0; var3 < this.field5390.length; var3++) {
                this.field5390[var3] = class242.method1674(this.field5390[var3], 32768);
            }
        }
        if (arg0 < 37) {
            this.method2179(-56, false, (class249) null);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZLrm;)V", line = 890)
    private final void method2179(int arg0, boolean arg1, class249 arg2) {
        field5392++;
        if (arg1) {
            method2175(-76, 127, -16);
        }
        if (arg0 == 1) {
            this.field5399 = arg2.method1740(true);
        } else if (arg0 == 2) {
            int var4 = arg2.method1731(true);
            this.field5397 = new int[var4];
            this.field5390 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5390[var5] = arg2.method1712(-1);
                int var6 = arg2.method1731(true);
                if (var6 == 0) {
                    this.field5397[var5] = -1;
                } else {
                    this.field5397[var5] = var6;
                }
            }
        } else if (arg0 == 3) {
            int var7 = arg2.method1731(!arg1);
            this.field5388 = new int[var7];
            this.field5393 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field5393[var8] = arg2.method1712(-1);
                int var9 = arg2.method1731(true);
                if (var9 == 0) {
                    this.field5388[var8] = -1;
                } else {
                    this.field5388[var8] = var9;
                }
            }
        } else if (arg0 == 4) {
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(IB)I", line = 983)
    public static final int method2180(int arg0, byte arg1) {
        int var2 = -58 / ((arg1 - 31) / 54);
        field5389++;
        return arg0 & 0x3FF;
    }
}
