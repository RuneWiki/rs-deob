import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class231 {

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3725 = "red:";

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3723 = "Members object";

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3726 = "skill: ";

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Lwf;")
    public static class306 field3728;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "[I")
    public static int[] field3724;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "[I")
    public static int[] field3730;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V", line = 8)
    public static final void method1583(int arg0, byte arg1) {
        field3729++;
        if (class304.field4758 == arg0) {
            return;
        }
        int var2 = -56 / ((68 - arg1) / 37);
        boolean var3 = arg0 == 5 || arg0 == 10 || arg0 == 28;
        if (class304.field4758 == 0) {
            class329.method2225(100);
        }
        if (arg0 == 40) {
            class268.method1776(0);
        }
        if (arg0 != 40 && class193.field2914 != null) {
            class193.field2914.method596(false);
            class193.field2914 = null;
        }
        if (arg0 == 25 || arg0 == 28) {
            class255.field3990 = 0;
            class19.field257 = 0;
            class183.field2796 = 0;
            class101.field1575 = 1;
            class27.field351 = 1;
            class43.method309(-8977, true);
        }
        if (arg0 == 25 || arg0 == 10) {
            class249.method1695(112);
        }
        if (arg0 == 5) {
            class164.method1123(2, class121.field1859);
        } else {
            class59.method404((byte) -65);
        }
        boolean var4 = class304.field4758 == 5 || class304.field4758 == 10 || class304.field4758 == 28;
        if (var4 != var3) {
            if (var3) {
                class146.field2306 = class18.field253;
                if (class334.field5199 == 0) {
                    class40.method293(2, false);
                } else {
                    class130.method879(0, class18.field253, (byte) -83, 2, 255, class211.field3353, false);
                }
                class124.field1938.method1668(121, false);
            } else {
                class40.method293(2, false);
                class124.field1938.method1668(127, true);
            }
        }
        if (class333.field5166 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
            class333.method2302();
        }
        class304.field4758 = arg0;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V", line = 89)
    public static void method1584(boolean arg0) {
        field3728 = null;
        if (arg0) {
            return;
        }
        field3724 = null;
        field3730 = null;
        field3726 = null;
        field3725 = null;
        field3723 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIZIZIIIIILwb;)V", line = 107)
    public static final void method1585(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class294 arg10) {
        field3731++;
        if (arg4 && !class148.method1042((byte) 54) && (class305.field4784[0][arg3][arg5] & 0x2) == 0) {
            if ((class305.field4784[arg9][arg3][arg5] & 0x10) != 0) {
                return;
            }
            if (class36.method259(98, arg9, arg3, arg5) != class230.field3720) {
                return;
            }
        }
        if (class174.field2662 > arg9) {
            class174.field2662 = arg9;
        }
        class17 var11 = class277.method1819((byte) -51, arg8);
        if (class333.field5166 && var11.field184) {
            return;
        }
        int var12;
        int var13;
        if (arg0 == 1 || arg0 == 3) {
            var13 = var11.field187;
            var12 = var11.field212;
        } else {
            var12 = var11.field187;
            var13 = var11.field212;
        }
        int var14;
        int var15;
        if (arg3 + var13 > 104) {
            var14 = arg3 + 1;
            var15 = arg3;
        } else {
            var15 = (var13 >> 1) + arg3;
            var14 = arg3 + (var13 + 1 >> 1);
        }
        int var16;
        int var17;
        if (arg5 + var12 > 104) {
            var16 = arg5 + 1;
            var17 = arg5;
        } else {
            var16 = (var12 + 1 >> 1) + arg5;
            var17 = arg5 + (var12 >> 1);
        }
        int var18 = (arg3 << 7) + (var13 << 6);
        int[][] var19 = client.field2034[arg6];
        int var20 = var19[var15][var16] + var19[var15][var17] - (-var19[var14][var16] + -var19[var14][var17]) >> 2;
        int var21 = (arg5 << 7) + (var12 << 6);
        int var22 = 0;
        if (class333.field5166 && arg6 != 0) {
            int[][] var23 = client.field2034[0];
            var22 = var20 - (var23[var15][var17] - (-var23[var14][var17] - var23[var15][var16] - var23[var14][var16]) >> 2);
        }
        long var24 = (long) (arg7 << 14 | arg5 << 7 | arg3 | arg0 << 20 | 0x40000000);
        int[][] var26 = (int[][]) null;
        if (arg2) {
            var26 = class193.field2911[0];
        } else if (arg6 < 3) {
            var26 = client.field2034[arg6 + 1];
        }
        if (var11.field214 == 0 || arg2) {
            var24 |= Long.MIN_VALUE;
        }
        if (var11.field162 == 1) {
            var24 |= 0x400000L;
        }
        if (var11.field170) {
            var24 |= 0x80000000L;
        }
        if (var11.method129(0)) {
            class270.method1785(arg3, var11, (class82) null, arg5, arg9, (class80) null, arg0, -108);
        }
        int var27 = var11.field201;
        boolean var28 = var11.field173 & !arg2;
        long var29 = var24 | (long) arg8 << 32;
        if (arg7 != 22) {
            if (arg1 >= -110) {
                field3724 = (int[]) null;
            }
            if (arg7 == 10 || arg7 == 11) {
                class94 var74;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    class118 var73 = var11.method123(10, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg7 == 11 ? arg0 + 4 : arg0, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var73.field1831, var18, var22, var21);
                    }
                    var74 = var73.field1830;
                } else {
                    var74 = new class218(arg8, 10, arg7 == 11 ? arg0 + 4 : arg0, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                if (var74 != null) {
                    boolean var75 = class236.method1611(arg9, arg3, arg5, var20, var13, var12, var74, 0, var29);
                    if (var11.field165 && var75 && arg4) {
                        int var76 = 15;
                        if (var74 instanceof class295) {
                            var76 = ((class295) var74).method975() / 4;
                            if (var76 > 30) {
                                var76 = 30;
                            }
                        }
                        for (int var77 = 0; var77 <= var13; var77++) {
                            for (int var78 = 0; var78 <= var12; var78++) {
                                if (var76 > class280.field4323[arg9][arg3 + var77][arg5 + var78]) {
                                    class280.field4323[arg9][arg3 + var77][arg5 + var78] = (byte) var76;
                                }
                            }
                        }
                    }
                }
                if (var11.field233 != 0 && arg10 != null) {
                    arg10.method1915(arg5, arg3, var11.field218, true, var13, var12, !var11.field213);
                }
            } else if (arg7 >= 12) {
                class94 var72;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    class118 var71 = var11.method123(arg7, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg0, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var71.field1831, var18, var22, var21);
                    }
                    var72 = var71.field1830;
                } else {
                    var72 = new class218(arg8, arg7, arg0, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                class236.method1611(arg9, arg3, arg5, var20, 1, 1, var72, 0, var29);
                if (arg4 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg9 > 0 && var11.field220 != 0) {
                    class274.field4218[arg9][arg3][arg5] = class276.method1810(class274.field4218[arg9][arg3][arg5], 4);
                }
                if (var11.field233 != 0 && arg10 != null) {
                    arg10.method1915(arg5, arg3, var11.field218, true, var13, var12, !var11.field213);
                }
            } else if (arg7 == 0) {
                class94 var70;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    class118 var69 = var11.method123(0, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg0, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var69.field1831, var18, var22, var21);
                    }
                    var70 = var69.field1830;
                } else {
                    var70 = new class218(arg8, 0, arg0, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                class215.method1438(arg9, arg3, arg5, var20, var70, (class94) null, class218.field3475[arg0], 0, var29);
                if (arg4) {
                    if (arg0 == 0) {
                        if (var11.field165) {
                            class280.field4323[arg9][arg3][arg5] = 50;
                            class280.field4323[arg9][arg3][arg5 + 1] = 50;
                        }
                        if (var11.field220 == 1) {
                            class274.field4218[arg9][arg3][arg5] = class276.method1810(class274.field4218[arg9][arg3][arg5], 1);
                        }
                    } else if (arg0 == 1) {
                        if (var11.field165) {
                            class280.field4323[arg9][arg3][arg5 + 1] = 50;
                            class280.field4323[arg9][arg3 + 1][arg5 + 1] = 50;
                        }
                        if (var11.field220 == 1) {
                            class274.field4218[arg9][arg3][arg5 + 1] = class276.method1810(class274.field4218[arg9][arg3][arg5 + 1], 2);
                        }
                    } else if (arg0 == 2) {
                        if (var11.field165) {
                            class280.field4323[arg9][arg3 + 1][arg5] = 50;
                            class280.field4323[arg9][arg3 + 1][arg5 + 1] = 50;
                        }
                        if (var11.field220 == 1) {
                            class274.field4218[arg9][arg3 + 1][arg5] = class276.method1810(class274.field4218[arg9][arg3 + 1][arg5], 1);
                        }
                    } else if (arg0 == 3) {
                        if (var11.field165) {
                            class280.field4323[arg9][arg3][arg5] = 50;
                            class280.field4323[arg9][arg3 + 1][arg5] = 50;
                        }
                        if (var11.field220 == 1) {
                            class274.field4218[arg9][arg3][arg5] = class276.method1810(class274.field4218[arg9][arg3][arg5], 2);
                        }
                    }
                }
                if (var11.field233 != 0 && arg10 != null) {
                    arg10.method1918(arg3, arg0, var11.field218, arg5, !var11.field213, arg7, -25630);
                }
                if (var11.field166 != 16) {
                    class276.method1815(arg9, arg3, arg5, var11.field166);
                }
            } else if (arg7 == 1) {
                class94 var68;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    class118 var67 = var11.method123(1, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg0, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var67.field1831, var18, var22, var21);
                    }
                    var68 = var67.field1830;
                } else {
                    var68 = new class218(arg8, 1, arg0, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                class215.method1438(arg9, arg3, arg5, var20, var68, (class94) null, class307.field4840[arg0], 0, var29);
                if (var11.field165 && arg4) {
                    if (arg0 == 0) {
                        class280.field4323[arg9][arg3][arg5 + 1] = 50;
                    } else if (arg0 == 1) {
                        class280.field4323[arg9][arg3 + 1][arg5 + 1] = 50;
                    } else if (arg0 == 2) {
                        class280.field4323[arg9][arg3 + 1][arg5] = 50;
                    } else if (arg0 == 3) {
                        class280.field4323[arg9][arg3][arg5] = 50;
                    }
                }
                if (var11.field233 != 0 && arg10 != null) {
                    arg10.method1918(arg3, arg0, var11.field218, arg5, !var11.field213, arg7, -25630);
                }
            } else if (arg7 == 2) {
                int var62 = arg0 + 1 & 0x3;
                class94 var64;
                class94 var66;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    class118 var63 = var11.method123(2, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg0 + 4, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var63.field1831, var18, var22, var21);
                    }
                    var64 = var63.field1830;
                    class118 var65 = var11.method123(2, var20, arg4, (class20) null, true, var26, var19, var28, var21, var62, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var65.field1831, var18, var22, var21);
                    }
                    var66 = var65.field1830;
                } else {
                    var64 = new class218(arg8, 2, arg0 + 4, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                    var66 = new class218(arg8, 2, var62, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                class215.method1438(arg9, arg3, arg5, var20, var64, var66, class218.field3475[arg0], class218.field3475[var62], var29);
                if (var11.field220 == 1 && arg4) {
                    if (arg0 == 0) {
                        class274.field4218[arg9][arg3][arg5] = class276.method1810(class274.field4218[arg9][arg3][arg5], 1);
                        class274.field4218[arg9][arg3][arg5 + 1] = class276.method1810(class274.field4218[arg9][arg3][arg5 + 1], 2);
                    } else if (arg0 == 1) {
                        class274.field4218[arg9][arg3][arg5 + 1] = class276.method1810(class274.field4218[arg9][arg3][arg5 + 1], 2);
                        class274.field4218[arg9][arg3 + 1][arg5] = class276.method1810(class274.field4218[arg9][arg3 + 1][arg5], 1);
                    } else if (arg0 == 2) {
                        class274.field4218[arg9][arg3 + 1][arg5] = class276.method1810(class274.field4218[arg9][arg3 + 1][arg5], 1);
                        class274.field4218[arg9][arg3][arg5] = class276.method1810(class274.field4218[arg9][arg3][arg5], 2);
                    } else if (arg0 == 3) {
                        class274.field4218[arg9][arg3][arg5] = class276.method1810(class274.field4218[arg9][arg3][arg5], 2);
                        class274.field4218[arg9][arg3][arg5] = class276.method1810(class274.field4218[arg9][arg3][arg5], 1);
                    }
                }
                if (var11.field233 != 0 && arg10 != null) {
                    arg10.method1918(arg3, arg0, var11.field218, arg5, !var11.field213, arg7, -25630);
                }
                if (var11.field166 != 16) {
                    class276.method1815(arg9, arg3, arg5, var11.field166);
                }
            } else if (arg7 == 3) {
                class94 var61;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    class118 var60 = var11.method123(3, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg0, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var60.field1831, var18, var22, var21);
                    }
                    var61 = var60.field1830;
                } else {
                    var61 = new class218(arg8, 3, arg0, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                class215.method1438(arg9, arg3, arg5, var20, var61, (class94) null, class307.field4840[arg0], 0, var29);
                if (var11.field165 && arg4) {
                    if (arg0 == 0) {
                        class280.field4323[arg9][arg3][arg5 + 1] = 50;
                    } else if (arg0 == 1) {
                        class280.field4323[arg9][arg3 + 1][arg5 + 1] = 50;
                    } else if (arg0 == 2) {
                        class280.field4323[arg9][arg3 + 1][arg5] = 50;
                    } else if (arg0 == 3) {
                        class280.field4323[arg9][arg3][arg5] = 50;
                    }
                }
                if (var11.field233 != 0 && arg10 != null) {
                    arg10.method1918(arg3, arg0, var11.field218, arg5, !var11.field213, arg7, -25630);
                }
            } else if (arg7 == 9) {
                class94 var34;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    class118 var33 = var11.method123(arg7, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg0, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var33.field1831, var18, var22, var21);
                    }
                    var34 = var33.field1830;
                } else {
                    var34 = new class218(arg8, arg7, arg0, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                class236.method1611(arg9, arg3, arg5, var20, 1, 1, var34, 0, var29);
                if (var11.field233 != 0 && arg10 != null) {
                    arg10.method1915(arg5, arg3, var11.field218, true, var13, var12, !var11.field213);
                }
                if (var11.field166 != 16) {
                    class276.method1815(arg9, arg3, arg5, var11.field166);
                }
            } else if (arg7 == 4) {
                class94 var59;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    class118 var58 = var11.method123(4, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg0, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var58.field1831, var18, var22, var21);
                    }
                    var59 = var58.field1830;
                } else {
                    var59 = new class218(arg8, 4, arg0, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                class246.method1666(arg9, arg3, arg5, var20, var59, (class94) null, class218.field3475[arg0], 0, 0, 0, var29);
            } else if (arg7 == 5) {
                long var35 = class126.method848(arg9, arg3, arg5);
                int var37 = 16;
                if (var35 != 0L) {
                    var37 = class277.method1819((byte) -17, Integer.MAX_VALUE & (int) (var35 >>> 32)).field166;
                }
                class94 var39;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    class118 var38 = var11.method123(4, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg0, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var38.field1831, var18 - class210.field3337[arg0] * 8, var22, var21 - (class151.field2385[arg0] * 8));
                    }
                    var39 = var38.field1830;
                } else {
                    var39 = new class218(arg8, 4, arg0, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                class246.method1666(arg9, arg3, arg5, var20, var39, (class94) null, class218.field3475[arg0], 0, class210.field3337[arg0] * var37, class151.field2385[arg0] * var37, var29);
            } else if (arg7 == 6) {
                int var40 = 8;
                long var41 = class126.method848(arg9, arg3, arg5);
                if (var41 != 0L) {
                    var40 = class277.method1819((byte) -106, (int) (var41 >>> 32) & Integer.MAX_VALUE).field166 / 2;
                }
                class94 var44;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    class118 var43 = var11.method123(4, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg0 + 4, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var43.field1831, var18 - (class151.field2387[arg0] * 8), var22, var21 - class200.field3014[arg0] * 8);
                    }
                    var44 = var43.field1830;
                } else {
                    var44 = new class218(arg8, 4, arg0 + 4, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                class246.method1666(arg9, arg3, arg5, var20, var44, (class94) null, 256, arg0, class151.field2387[arg0] * var40, class200.field3014[arg0] * var40, var29);
            } else if (arg7 == 7) {
                int var55 = arg0 + 2 & 0x3;
                class94 var57;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    class118 var56 = var11.method123(4, var20, arg4, (class20) null, true, var26, var19, var28, var21, var55 + 4, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var56.field1831, var18, var22, var21);
                    }
                    var57 = var56.field1830;
                } else {
                    var57 = new class218(arg8, 4, var55 + 4, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                class246.method1666(arg9, arg3, arg5, var20, var57, (class94) null, 256, var55, 0, 0, var29);
            } else if (arg7 == 8) {
                int var45 = 8;
                long var46 = class126.method848(arg9, arg3, arg5);
                if (var46 != 0L) {
                    var45 = class277.method1819((byte) 126, (int) (var46 >>> 32) & Integer.MAX_VALUE).field166 / 2;
                }
                int var48 = arg0 + 2 & 0x3;
                class94 var52;
                class94 var54;
                if (var27 == -1 && var11.field195 == null && !var11.field227) {
                    int var49 = class200.field3014[arg0] * 8;
                    int var50 = class151.field2387[arg0] * 8;
                    class118 var51 = var11.method123(4, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg0 + 4, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var51.field1831, var18 - var50, var22, var21 - var49);
                    }
                    var52 = var51.field1830;
                    class118 var53 = var11.method123(4, var20, arg4, (class20) null, true, var26, var19, var28, var21, var48 + 4, var18);
                    if (class333.field5166 && var28) {
                        class11.method84(var53.field1831, var18 - var50, var22, var21 - var49);
                    }
                    var54 = var53.field1830;
                } else {
                    var52 = new class218(arg8, 4, arg0 + 4, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                    var54 = new class218(arg8, 4, var48 + 4, arg6, arg3, arg5, var27, var11.field223, (class94) null);
                }
                class246.method1666(arg9, arg3, arg5, var20, var52, var54, 256, arg0, class151.field2387[arg0] * var45, class200.field3014[arg0] * var45, var29);
            }
        } else if (class317.field4985 || var11.field214 != 0 || var11.field233 == 1 || var11.field163) {
            class94 var32;
            if (var27 == -1 && var11.field195 == null && !var11.field227) {
                class118 var31 = var11.method123(22, var20, arg4, (class20) null, true, var26, var19, var28, var21, arg0, var18);
                if (class333.field5166 && var28) {
                    class11.method84(var31.field1831, var18, var22, var21);
                }
                var32 = var31.field1830;
            } else {
                var32 = new class218(arg8, 22, arg0, arg6, arg3, arg5, var27, var11.field223, (class94) null);
            }
            class85.method580(arg9, arg3, arg5, var20, var32, var29, var11.field224);
            if (var11.field233 == 1 && arg10 != null) {
                arg10.method1930(10300, arg3, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[I)[I", line = 765)
    public static final int[] method1586(int arg0, int[] arg1) {
        field3727++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == -24773) {
            int[] var2 = new int[arg1.length];
            class223.method1504(arg1, 0, var2, 0, arg1.length);
            return var2;
        } else {
            return (int[]) null;
        }
    }
}
