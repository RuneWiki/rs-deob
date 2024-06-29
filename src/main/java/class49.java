import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class49 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Z")
    public boolean field668 = false;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field676 = 0;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field674 = 0;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Z")
    public static boolean field678 = false;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "J")
    public long field677;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Lea;")
    public static class217 field669;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Lh;")
    public class232 field667;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Lkb;")
    public static class39 field671;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "Lkb;")
    public static class39 field684;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "[S")
    public static short[] field673;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIILde;IIZZIII)V", line = 20)
    public static final void method341(int arg0, int arg1, int arg2, class68 arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field683++;
        if (arg6 && !class152.method1062(120) && (class81.field1229[0][arg5][arg10] & 0x2) == 0) {
            if ((class81.field1229[arg1][arg5][arg10] & 0x10) != 0) {
                return;
            }
            if (class175.method1200(arg5, arg1, -16437, arg10) != class146.field2190) {
                return;
            }
        }
        if (class8.field94 > arg1) {
            class8.field94 = arg1;
        }
        class149 var11 = class291.method2043(arg9, 23006);
        if (class186.field2991 && var11.field2239) {
            return;
        }
        int var12;
        int var13;
        if (arg4 == 1 || arg4 == 3) {
            var12 = var11.field2253;
            var13 = var11.field2278;
        } else {
            var12 = var11.field2278;
            var13 = var11.field2253;
        }
        int var14;
        int var15;
        if (arg5 + var13 <= 104) {
            var14 = (var13 >> 1) + arg5;
            var15 = (var13 + 1 >> 1) + arg5;
        } else {
            var14 = arg5;
            var15 = arg5 + 1;
        }
        int[][] var16 = class84.field1282[arg2];
        int var17;
        int var18;
        if ((arg10 + var12) <= 104) {
            var17 = arg10 + (var12 >> 1);
            var18 = (var12 + 1 >> 1) + arg10;
        } else {
            var17 = arg10;
            var18 = arg10 + 1;
        }
        int var19 = var16[var14][var17] - (-var16[var15][var17] - var16[var14][var18] - var16[var15][var18]) >> 2;
        int var20 = (arg10 << 7) + (var12 << 6);
        int var21 = 0;
        if (class186.field2991 && arg2 != 0) {
            int[][] var22 = class84.field1282[0];
            var21 = var19 - (var22[var14][var17] + var22[var14][var18] + var22[var15][var17] + var22[var15][var18] >> 2);
        }
        int var23 = (arg5 << 7) + (var13 << 6);
        int[][] var24 = (int[][]) null;
        long var25 = (long) (arg4 << 20 | arg5 | arg10 << 7 | arg8 << 14 | 0x40000000);
        if (arg7) {
            var24 = class94.field1450[0];
        } else if (arg2 < 3) {
            var24 = class84.field1282[arg2 + 1];
        }
        if (~var11.field2305 == arg0 || arg7) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field2306 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field2219) {
            var25 |= 0x80000000L;
        }
        if (var11.method1054((byte) 93)) {
            class7.method51(arg5, arg0 - 22957, (class320) null, arg1, var11, arg10, arg4, (class196) null);
        }
        boolean var27 = var11.field2267 & !arg7;
        long var28 = var25 | (long) arg9 << 32;
        if (arg8 == 22) {
            if (class39.field548 || var11.field2305 != 0 || var11.field2257 == 1 || var11.field2283) {
                class232 var31;
                if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                    class266 var30 = var11.method1046((class123) null, var16, var24, arg4, var20, arg6, var23, -16, var19, var27, 22);
                    if (class186.field2991 && var27) {
                        class32.method205(var30.field4198, var23, var21, var20);
                    }
                    var31 = var30.field4194;
                } else {
                    var31 = new class240(arg9, 22, arg4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
                }
                class58.method408(arg1, arg5, arg10, var19, var31, var28, var11.field2298);
                if (var11.field2257 == 1 && arg3 != null) {
                    arg3.method443(102, arg10, arg5);
                }
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class232 var73;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                class266 var72 = var11.method1046((class123) null, var16, var24, arg8 == 11 ? arg4 + 4 : arg4, var20, arg6, var23, -93, var19, var27, 10);
                if (class186.field2991 && var27) {
                    class32.method205(var72.field4198, var23, var21, var20);
                }
                var73 = var72.field4194;
            } else {
                var73 = new class240(arg9, 10, arg8 == 11 ? arg4 + 4 : arg4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            if (var73 != null) {
                boolean var74 = class19.method122(arg1, arg5, arg10, var19, var13, var12, var73, 0, var28);
                if (var11.field2235 && var74 && arg6) {
                    int var75 = 15;
                    if (var73 instanceof class134) {
                        var75 = ((class134) var73).method538() / 4;
                        if (var75 > 30) {
                            var75 = 30;
                        }
                    }
                    for (int var76 = 0; var76 <= var13; var76++) {
                        for (int var77 = 0; var77 <= var12; var77++) {
                            if (var75 > class100.field1520[arg1][arg5 + var76][arg10 + var77]) {
                                class100.field1520[arg1][arg5 + var76][arg10 + var77] = (byte) var75;
                            }
                        }
                    }
                }
            }
            if (var11.field2257 != 0 && arg3 != null) {
                arg3.method452(var12, arg5, (byte) 73, var11.field2281, arg10, !var11.field2216, var13);
            }
        } else if (arg8 >= 12) {
            class232 var71;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                class266 var70 = var11.method1046((class123) null, var16, var24, arg4, var20, arg6, var23, 125, var19, var27, arg8);
                if (class186.field2991 && var27) {
                    class32.method205(var70.field4198, var23, var21, var20);
                }
                var71 = var70.field4194;
            } else {
                var71 = new class240(arg9, arg8, arg4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            class19.method122(arg1, arg5, arg10, var19, 1, 1, var71, 0, var28);
            if (arg6 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg1 > 0 && var11.field2246 != 0) {
                class196.field3220[arg1][arg5][arg10] = class24.method149(class196.field3220[arg1][arg5][arg10], 4);
            }
            if (var11.field2257 != 0 && arg3 != null) {
                arg3.method452(var12, arg5, (byte) 122, var11.field2281, arg10, !var11.field2216, var13);
            }
        } else if (arg8 == 0) {
            class232 var69;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                class266 var68 = var11.method1046((class123) null, var16, var24, arg4, var20, arg6, var23, 113, var19, var27, 0);
                if (class186.field2991 && var27) {
                    class32.method205(var68.field4198, var23, var21, var20);
                }
                var69 = var68.field4194;
            } else {
                var69 = new class240(arg9, 0, arg4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            class162.method1128(arg1, arg5, arg10, var19, var69, (class232) null, class284.field4482[arg4], 0, var28);
            if (arg6) {
                if (arg4 == 0) {
                    if (var11.field2235) {
                        class100.field1520[arg1][arg5][arg10] = 50;
                        class100.field1520[arg1][arg5][arg10 + 1] = 50;
                    }
                    if (var11.field2246 == 1) {
                        class196.field3220[arg1][arg5][arg10] = class24.method149(class196.field3220[arg1][arg5][arg10], 1);
                    }
                } else if (arg4 == 1) {
                    if (var11.field2235) {
                        class100.field1520[arg1][arg5][arg10 + 1] = 50;
                        class100.field1520[arg1][arg5 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field2246 == 1) {
                        class196.field3220[arg1][arg5][arg10 + 1] = class24.method149(class196.field3220[arg1][arg5][arg10 + 1], 2);
                    }
                } else if (arg4 == 2) {
                    if (var11.field2235) {
                        class100.field1520[arg1][arg5 + 1][arg10] = 50;
                        class100.field1520[arg1][arg5 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field2246 == 1) {
                        class196.field3220[arg1][arg5 + 1][arg10] = class24.method149(class196.field3220[arg1][arg5 + 1][arg10], 1);
                    }
                } else if (arg4 == 3) {
                    if (var11.field2235) {
                        class100.field1520[arg1][arg5][arg10] = 50;
                        class100.field1520[arg1][arg5 + 1][arg10] = 50;
                    }
                    if (var11.field2246 == 1) {
                        class196.field3220[arg1][arg5][arg10] = class24.method149(class196.field3220[arg1][arg5][arg10], 2);
                    }
                }
            }
            if (var11.field2257 != 0 && arg3 != null) {
                arg3.method441(var11.field2281, arg4, arg10, arg8, !var11.field2216, true, arg5);
            }
            if (var11.field2217 != 16) {
                class191.method1343(arg1, arg5, arg10, var11.field2217);
            }
        } else if (arg8 == 1) {
            class232 var33;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                class266 var32 = var11.method1046((class123) null, var16, var24, arg4, var20, arg6, var23, 100, var19, var27, 1);
                if (class186.field2991 && var27) {
                    class32.method205(var32.field4198, var23, var21, var20);
                }
                var33 = var32.field4194;
            } else {
                var33 = new class240(arg9, 1, arg4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            class162.method1128(arg1, arg5, arg10, var19, var33, (class232) null, class264.field4182[arg4], 0, var28);
            if (var11.field2235 && arg6) {
                if (arg4 == 0) {
                    class100.field1520[arg1][arg5][arg10 + 1] = 50;
                } else if (arg4 == 1) {
                    class100.field1520[arg1][arg5 + 1][arg10 + 1] = 50;
                } else if (arg4 == 2) {
                    class100.field1520[arg1][arg5 + 1][arg10] = 50;
                } else if (arg4 == 3) {
                    class100.field1520[arg1][arg5][arg10] = 50;
                }
            }
            if (var11.field2257 != 0 && arg3 != null) {
                arg3.method441(var11.field2281, arg4, arg10, arg8, !var11.field2216, true, arg5);
            }
        } else if (arg8 == 2) {
            int var63 = arg4 + 1 & 0x3;
            class232 var65;
            class232 var67;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                class266 var64 = var11.method1046((class123) null, var16, var24, arg4 + 4, var20, arg6, var23, 7, var19, var27, 2);
                if (class186.field2991 && var27) {
                    class32.method205(var64.field4198, var23, var21, var20);
                }
                var65 = var64.field4194;
                class266 var66 = var11.method1046((class123) null, var16, var24, var63, var20, arg6, var23, 115, var19, var27, 2);
                if (class186.field2991 && var27) {
                    class32.method205(var66.field4198, var23, var21, var20);
                }
                var67 = var66.field4194;
            } else {
                var65 = new class240(arg9, 2, arg4 + 4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
                var67 = new class240(arg9, 2, var63, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            class162.method1128(arg1, arg5, arg10, var19, var65, var67, class284.field4482[arg4], class284.field4482[var63], var28);
            if (var11.field2246 == 1 && arg6) {
                if (arg4 == 0) {
                    class196.field3220[arg1][arg5][arg10] = class24.method149(class196.field3220[arg1][arg5][arg10], 1);
                    class196.field3220[arg1][arg5][arg10 + 1] = class24.method149(class196.field3220[arg1][arg5][arg10 + 1], 2);
                } else if (arg4 == 1) {
                    class196.field3220[arg1][arg5][arg10 + 1] = class24.method149(class196.field3220[arg1][arg5][arg10 + 1], 2);
                    class196.field3220[arg1][arg5 + 1][arg10] = class24.method149(class196.field3220[arg1][arg5 + 1][arg10], 1);
                } else if (arg4 == 2) {
                    class196.field3220[arg1][arg5 + 1][arg10] = class24.method149(class196.field3220[arg1][arg5 + 1][arg10], 1);
                    class196.field3220[arg1][arg5][arg10] = class24.method149(class196.field3220[arg1][arg5][arg10], 2);
                } else if (arg4 == 3) {
                    class196.field3220[arg1][arg5][arg10] = class24.method149(class196.field3220[arg1][arg5][arg10], 2);
                    class196.field3220[arg1][arg5][arg10] = class24.method149(class196.field3220[arg1][arg5][arg10], 1);
                }
            }
            if (var11.field2257 != 0 && arg3 != null) {
                arg3.method441(var11.field2281, arg4, arg10, arg8, !var11.field2216, true, arg5);
            }
            if (var11.field2217 != 16) {
                class191.method1343(arg1, arg5, arg10, var11.field2217);
            }
        } else if (arg8 == 3) {
            class232 var62;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                class266 var61 = var11.method1046((class123) null, var16, var24, arg4, var20, arg6, var23, 110, var19, var27, 3);
                if (class186.field2991 && var27) {
                    class32.method205(var61.field4198, var23, var21, var20);
                }
                var62 = var61.field4194;
            } else {
                var62 = new class240(arg9, 3, arg4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            class162.method1128(arg1, arg5, arg10, var19, var62, (class232) null, class264.field4182[arg4], 0, var28);
            if (var11.field2235 && arg6) {
                if (arg4 == 0) {
                    class100.field1520[arg1][arg5][arg10 + 1] = 50;
                } else if (arg4 == 1) {
                    class100.field1520[arg1][arg5 + 1][arg10 + 1] = 50;
                } else if (arg4 == 2) {
                    class100.field1520[arg1][arg5 + 1][arg10] = 50;
                } else if (arg4 == 3) {
                    class100.field1520[arg1][arg5][arg10] = 50;
                }
            }
            if (var11.field2257 != 0 && arg3 != null) {
                arg3.method441(var11.field2281, arg4, arg10, arg8, !var11.field2216, true, arg5);
            }
        } else if (arg8 == 9) {
            class232 var60;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                class266 var59 = var11.method1046((class123) null, var16, var24, arg4, var20, arg6, var23, 115, var19, var27, arg8);
                if (class186.field2991 && var27) {
                    class32.method205(var59.field4198, var23, var21, var20);
                }
                var60 = var59.field4194;
            } else {
                var60 = new class240(arg9, arg8, arg4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            class19.method122(arg1, arg5, arg10, var19, 1, 1, var60, 0, var28);
            if (var11.field2257 != 0 && arg3 != null) {
                arg3.method452(var12, arg5, (byte) 78, var11.field2281, arg10, !var11.field2216, var13);
            }
            if (var11.field2217 != 16) {
                class191.method1343(arg1, arg5, arg10, var11.field2217);
            }
        } else if (arg8 == 4) {
            class232 var35;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                class266 var34 = var11.method1046((class123) null, var16, var24, arg4, var20, arg6, var23, -40, var19, var27, 4);
                if (class186.field2991 && var27) {
                    class32.method205(var34.field4198, var23, var21, var20);
                }
                var35 = var34.field4194;
            } else {
                var35 = new class240(arg9, 4, arg4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            class218.method1596(arg1, arg5, arg10, var19, var35, (class232) null, class284.field4482[arg4], 0, 0, 0, var28);
        } else if (arg8 == 5) {
            int var36 = 16;
            long var37 = class155.method1079(arg1, arg5, arg10);
            if (var37 != 0L) {
                var36 = class291.method2043((int) (var37 >>> 32) & Integer.MAX_VALUE, 23006).field2217;
            }
            class232 var40;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                class266 var39 = var11.method1046((class123) null, var16, var24, arg4, var20, arg6, var23, -5, var19, var27, 4);
                if (class186.field2991 && var27) {
                    class32.method205(var39.field4198, var23 - (class71.field924[arg4] * 8), var21, var20 - (class201.field3296[arg4] * 8));
                }
                var40 = var39.field4194;
            } else {
                var40 = new class240(arg9, 4, arg4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            class218.method1596(arg1, arg5, arg10, var19, var40, (class232) null, class284.field4482[arg4], 0, class71.field924[arg4] * var36, class201.field3296[arg4] * var36, var28);
        } else if (arg8 == 6) {
            long var54 = class155.method1079(arg1, arg5, arg10);
            int var56 = 8;
            if (var54 != 0L) {
                var56 = class291.method2043((int) (var54 >>> 32) & Integer.MAX_VALUE, arg0 ^ 0xFFFFA621).field2217 / 2;
            }
            class232 var58;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                class266 var57 = var11.method1046((class123) null, var16, var24, arg4 + 4, var20, arg6, var23, 104, var19, var27, 4);
                if (class186.field2991 && var27) {
                    class32.method205(var57.field4198, var23 - (class329.field5121[arg4] * 8), var21, var20 - (class342.field5333[arg4] * 8));
                }
                var58 = var57.field4194;
            } else {
                var58 = new class240(arg9, 4, arg4 + 4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            class218.method1596(arg1, arg5, arg10, var19, var58, (class232) null, 256, arg4, class329.field5121[arg4] * var56, class342.field5333[arg4] * var56, var28);
        } else if (arg8 == 7) {
            int var51 = arg4 + 2 & 0x3;
            class232 var53;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                class266 var52 = var11.method1046((class123) null, var16, var24, var51 + 4, var20, arg6, var23, 112, var19, var27, 4);
                if (class186.field2991 && var27) {
                    class32.method205(var52.field4198, var23, var21, var20);
                }
                var53 = var52.field4194;
            } else {
                var53 = new class240(arg9, 4, var51 + 4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            class218.method1596(arg1, arg5, arg10, var19, var53, (class232) null, 256, var51, 0, 0, var28);
        } else if (arg8 == 8) {
            int var41 = 8;
            long var42 = class155.method1079(arg1, arg5, arg10);
            if (var42 != 0L) {
                var41 = class291.method2043((int) (var42 >>> 32) & Integer.MAX_VALUE, arg0 ^ 0xFFFFA621).field2217 / 2;
            }
            int var44 = arg4 + 2 & 0x3;
            class232 var48;
            class232 var50;
            if (var11.field2304 == -1 && var11.field2237 == null && var11.field2223 == null && !var11.field2295) {
                int var45 = class329.field5121[arg4] * 8;
                int var46 = class342.field5333[arg4] * 8;
                class266 var47 = var11.method1046((class123) null, var16, var24, arg4 + 4, var20, arg6, var23, 15, var19, var27, 4);
                if (class186.field2991 && var27) {
                    class32.method205(var47.field4198, var23 - var45, var21, var20 - var46);
                }
                var48 = var47.field4194;
                class266 var49 = var11.method1046((class123) null, var16, var24, var44 + 4, var20, arg6, var23, arg0 + 116, var19, var27, 4);
                if (class186.field2991 && var27) {
                    class32.method205(var49.field4198, var23 - var45, var21, var20 - var46);
                }
                var50 = var49.field4194;
            } else {
                var48 = new class240(arg9, 4, arg4 + 4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
                var50 = new class240(arg9, 4, var44 + 4, arg2, arg5, arg10, -1, var11.field2236, (class232) null);
            }
            class218.method1596(arg1, arg5, arg10, var19, var48, var50, 256, arg4, class329.field5121[arg4] * var41, class342.field5333[arg4] * var41, var28);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IB)V", line = 673)
    private static final void method342(int arg0, byte arg1) {
        short var2 = 256;
        if (var2 < arg0) {
            arg0 = var2;
        }
        field681++;
        if (arg1 < 9) {
            method344(61);
        }
        if (arg0 > 10) {
            arg0 = 10;
        }
        class339.field5260 += arg0 * 128;
        if (class339.field5258.length < class339.field5260) {
            int var3 = (int) (Math.random() * 12.0D);
            class339.field5260 -= class339.field5258.length;
            class292.method2045(client.field4229[var3], 0);
        }
        int var4 = 0;
        int var5 = arg0 * 128;
        int var6 = (var2 - arg0) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class237.field3749[var4 + var5] - class339.field5258[var4 + class339.field5260 & class339.field5258.length + -1] * arg0 / 6;
            if (var8 < 0) {
                var8 = 0;
            }
            class237.field3749[var4++] = var8;
        }
        for (int var9 = var2 - arg0; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class237.field3749[var10 + var11] = 255;
                } else {
                    class237.field3749[var11 + var10] = 0;
                }
            }
        }
        for (int var13 = 0; var13 < var2 - arg0; var13++) {
            class329.field5130[var13] = class329.field5130[arg0 + var13];
        }
        for (int var14 = var2 - arg0; var14 < var2; var14++) {
            class329.field5130[var14] = (int) (Math.sin((double) class237.field3746 / 14.0D) * 16.0D + Math.sin((double) class237.field3746 / 15.0D) * 14.0D + Math.sin((double) class237.field3746 / 16.0D) * 12.0D);
            class237.field3746++;
        }
        int var15 = ((class48.field648 & 0x1) + arg0) / 2;
        class56.field742 += arg0;
        if (var15 <= 0) {
            return;
        }
        for (int var16 = 0; var16 < class56.field742; var16++) {
            int var17 = (int) (Math.random() * 124.0D) + 2;
            int var18 = (int) (Math.random() * 128.0D) + 128;
            class237.field3749[(var18 << 7) + var17] = 192;
        }
        class56.field742 = 0;
        for (int var19 = 0; var19 < var2; var19++) {
            int var20 = 0;
            int var21 = var19 * 128;
            for (int var22 = -var15; var22 < 128; var22++) {
                if (var15 + var22 < 128) {
                    var20 += class237.field3749[var21 + var22 + var15];
                }
                if ((var22 - var15 - 1) >= 0) {
                    var20 -= class237.field3749[var21 + var22 - var15 - 1];
                }
                if (var22 >= 0) {
                    class163.field2655[var21 + var22] = var20 / (var15 * 2 + 1);
                }
            }
        }
        for (int var23 = 0; var23 < 128; var23++) {
            int var24 = 0;
            for (int var25 = -var15; var25 < var2; var25++) {
                int var26 = var25 * 128;
                if (var2 > var15 + var25) {
                    var24 += class163.field2655[var23 + var26 + (var15 * 128)];
                }
                if ((-(var15 - var25) - 1) >= 0) {
                    var24 -= class163.field2655[var23 + var26 - (var15 * 128) - 128];
                }
                if (var25 >= 0) {
                    class237.field3749[var23 + var26] = var24 / (var15 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)I", line = 845)
    public static final int method343(boolean arg0, int arg1) {
        field675++;
        if (class69.field901 != null) {
            class69.field901.method2095(8737);
            class69.field901 = null;
        }
        if (arg0) {
            field673 = (short[]) null;
        }
        class324.field5066++;
        if (class324.field5066 > 4) {
            class238.field3764 = 0;
            class324.field5066 = 0;
            return arg1;
        }
        if (class326.field5089 == class124.field1858) {
            class326.field5089 = class329.field5119;
        } else {
            class326.field5089 = class124.field1858;
        }
        class238.field3764 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 899)
    public static void method344(int arg0) {
        field669 = null;
        field671 = null;
        field684 = null;
        field673 = null;
        if (arg0 > -122) {
            method341(14, -79, 16, (class68) null, -4, 11, true, true, -44, -23, 7);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)V", line = 912)
    public static final void method345(byte arg0, int arg1, int arg2) {
        field672++;
        if (class271.field4298 > 0) {
            method342(class271.field4298, (byte) 37);
            class271.field4298 = 0;
        }
        int var3 = 0;
        int var4 = 0;
        int var5 = class216.field3482 * arg2;
        short var6 = 256;
        if (arg0 != 5) {
            method342(87, (byte) -65);
        }
        for (int var7 = 1; var7 < (var6 - 1); var7++) {
            int var8 = (var6 - var7) * class329.field5130[var7] / var6;
            if (var8 < 0) {
                var8 = 0;
            }
            var3 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class237.field3749[var3++];
                int var11 = class216.field3480[var5++ + arg1];
                if (var10 == 0) {
                    class89.field1365.field4659[var4++] = var11;
                } else {
                    int var12 = var10 + 18;
                    int var13 = 256 - (var10 + 18);
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class121.field1845[var10];
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    class89.field1365.field4659[var4++] = class200.method1465(var13 * class200.method1465(var11, 65280) + class200.method1465(65280, var14) * var12, 16711680) + class200.method1465(var12 * class200.method1465(16711935, var14) + class200.method1465(16711935, var11) * var13, -16711936) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class89.field1365.field4659[var4++] = class216.field3480[var5++ + arg1];
            }
            var5 += class216.field3482 - 128;
        }
        if (class186.field2991) {
            class344.method2381(class89.field1365.field4659, arg1, arg2, class89.field1365.field5040, class89.field1365.field5030);
        } else {
            class89.field1365.method78(arg1, arg2);
        }
    }
}
