import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class303 {

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field5101 = 0;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Lma;")
    public static class5 field5103 = class12.method119("leuchten1:", (byte) 108);

    @OriginalMember(owner = "client!f", name = "h", descriptor = "I")
    public static int field5106 = 0;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field5107 = 1;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "[I")
    public static int[] field5114 = new int[128];

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field5115 = 0;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Lma;")
    private static class5 field5109 = class12.method119("Connection lost)3", (byte) 117);

    @OriginalMember(owner = "client!f", name = "o", descriptor = "Lma;")
    public static class5 field5113 = field5109;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field5100;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field5102;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public int field5110;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public int field5112;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public int field5118;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "J")
    public static long field5111;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "Lma;")
    public class5 field5105;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Z")
    public boolean field5117;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)Lcj;", line = 5)
    public static final class282 method2053(int arg0, byte arg1) {
        field5102++;
        class282 var2 = (class282) class192.field2986.method521((long) arg0, (byte) 80);
        if (var2 != null) {
            return var2;
        }
        class282 var3 = class156.method1002(arg0, false, 18495, class206.field3286, class294.field4964);
        if (arg1 < 92) {
            method2054((class50) null, -65, 25, -76, false, 108, 90, -79, 125, false, -6);
        }
        if (var3 != null) {
            class192.field2986.method519((byte) -95, var3, (long) arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lmc;IIIZIIIIZI)V", line = 28)
    public static final void method2054(class50 arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field5104++;
        if (arg9 && !class152.method956((byte) -83) && (class18.field321[0][arg3][arg10] & 0x2) == 0) {
            if ((class18.field321[arg5][arg3][arg10] & 0x10) != 0) {
                return;
            }
            if (class255.method1784(arg10, arg3, 255, arg5) != class276.field4709) {
                return;
            }
        }
        if (class24.field415 > arg5) {
            class24.field415 = arg5;
        }
        class185 var11 = class77.method536(arg2, 125);
        if (var11.field2867 || arg7 != 426775073) {
            return;
        }
        int var12;
        int var13;
        if (arg8 == 1 || arg8 == 3) {
            var12 = var11.field2859;
            var13 = var11.field2840;
        } else {
            var12 = var11.field2840;
            var13 = var11.field2859;
        }
        int var14;
        int var15;
        if (arg3 + var12 <= 104) {
            var14 = (var12 >> 1) + arg3;
            var15 = (var12 + 1 >> 1) + arg3;
        } else {
            var14 = arg3;
            var15 = arg3 + 1;
        }
        int[][] var16 = class208.field3304[arg6];
        int var17;
        int var18;
        if (arg10 + var13 > 104) {
            var17 = arg10 + 1;
            var18 = arg10;
        } else {
            var18 = (var13 >> 1) + arg10;
            var17 = (var13 + 1 >> 1) + arg10;
        }
        int var19 = var16[var15][var17] + var16[var15][var18] + var16[var14][var18] + var16[var14][var17] >> 2;
        int var20 = (arg3 << 7) + (var12 << 6);
        int var21 = 0;
        if (arg6 != 0) {
            int[][] var22 = class208.field3304[0];
            var21 = var19 - (var22[var14][var18] + var22[var15][var18] - (-var22[var14][var17] - var22[var15][var17]) >> 2);
        }
        int var23 = (arg10 << 7) + (var13 << 6);
        int[][] var24 = (int[][]) null;
        if (arg4) {
            var24 = class88.field1318[0];
        } else if (arg6 < 3) {
            var24 = class208.field3304[arg6 + 1];
        }
        long var25 = (long) (arg8 | 0x400 << 20 | arg10 << 7 | arg3 | arg1 << 14);
        if (var11.field2868 == 0 || arg4) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field2913 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field2854) {
            var25 |= 0x80000000L;
        }
        if (var11.method1224(0)) {
            class230.method1642(arg10, (class177) null, arg5, (class91) null, 0, arg8, arg3, var11);
        }
        long var27 = var25 | (long) arg2 << 32;
        boolean var29 = var11.field2898 & !arg4;
        if (arg1 == 22) {
            if (class112.field1663 || var11.field2868 != 0 || var11.field2911 == 1 || var11.field2896) {
                class280 var31;
                if (var11.field2895 == -1 && var11.field2843 == null) {
                    class286 var30 = var11.method1214(var24, arg8, (byte) 119, var23, 22, var29, arg9, var20, (class178) null, var19, var16);
                    if (var29) {
                        class134.method877(var30.field4825, var20, var21, var23);
                    }
                    var31 = var30.field4823;
                } else {
                    var31 = new class68(arg2, 22, arg8, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
                }
                class43.method299(arg5, arg3, arg10, var19, var31, var27, var11.field2907);
                if (var11.field2911 == 1 && arg0 != null) {
                    arg0.method383(arg10, arg3, 16);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class280 var73;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                class286 var72 = var11.method1214(var24, arg1 == 11 ? arg8 + 4 : arg8, (byte) 100, var23, 10, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var72.field4825, var20, var21, var23);
                }
                var73 = var72.field4823;
            } else {
                var73 = new class68(arg2, 10, arg1 == 11 ? arg8 + 4 : arg8, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            if (var73 != null) {
                boolean var74 = class194.method1275(arg5, arg3, arg10, var19, var12, var13, var73, 0, var27);
                if (var11.field2861 && var74 && arg9) {
                    int var75 = 15;
                    if (var73 instanceof class34) {
                        var75 = ((class34) var73).method231() / 4;
                        if (var75 > 30) {
                            var75 = 30;
                        }
                    }
                    for (int var76 = 0; var76 <= var12; var76++) {
                        for (int var77 = 0; var77 <= var13; var77++) {
                            if (var75 > class37.field583[arg5][arg3 + var76][arg10 + var77]) {
                                class37.field583[arg5][arg3 + var76][arg10 + var77] = (byte) var75;
                            }
                        }
                    }
                }
            }
            if (var11.field2911 != 0 && arg0 != null) {
                arg0.method376(arg3, (byte) 117, var13, arg10, var11.field2858, var12);
            }
        } else if (arg1 >= 12) {
            class280 var33;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                class286 var32 = var11.method1214(var24, arg8, (byte) -77, var23, arg1, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var32.field4825, var20, var21, var23);
                }
                var33 = var32.field4823;
            } else {
                var33 = new class68(arg2, arg1, arg8, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            class194.method1275(arg5, arg3, arg10, var19, 1, 1, var33, 0, var27);
            if (arg9 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg5 > 0) {
                class278.field4718[arg5][arg3][arg10] = class264.method1820(class278.field4718[arg5][arg3][arg10], 4);
            }
            if (var11.field2911 != 0 && arg0 != null) {
                arg0.method376(arg3, (byte) 100, var13, arg10, var11.field2858, var12);
            }
        } else if (arg1 == 0) {
            class280 var35;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                class286 var34 = var11.method1214(var24, arg8, (byte) 123, var23, 0, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var34.field4825, var20, var21, var23);
                }
                var35 = var34.field4823;
            } else {
                var35 = new class68(arg2, 0, arg8, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            class123.method813(arg5, arg3, arg10, var19, var35, (class280) null, class141.field2072[arg8], 0, var27);
            if (arg9) {
                if (arg8 == 0) {
                    if (var11.field2861) {
                        class37.field583[arg5][arg3][arg10] = 50;
                        class37.field583[arg5][arg3][arg10 + 1] = 50;
                    }
                    if (var11.field2891) {
                        class278.field4718[arg5][arg3][arg10] = class264.method1820(class278.field4718[arg5][arg3][arg10], 1);
                    }
                } else if (arg8 == 1) {
                    if (var11.field2861) {
                        class37.field583[arg5][arg3][arg10 + 1] = 50;
                        class37.field583[arg5][arg3 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field2891) {
                        class278.field4718[arg5][arg3][arg10 + 1] = class264.method1820(class278.field4718[arg5][arg3][arg10 + 1], 2);
                    }
                } else if (arg8 == 2) {
                    if (var11.field2861) {
                        class37.field583[arg5][arg3 + 1][arg10] = 50;
                        class37.field583[arg5][arg3 + 1][arg10 + 1] = 50;
                    }
                    if (var11.field2891) {
                        class278.field4718[arg5][arg3 + 1][arg10] = class264.method1820(class278.field4718[arg5][arg3 + 1][arg10], 1);
                    }
                } else if (arg8 == 3) {
                    if (var11.field2861) {
                        class37.field583[arg5][arg3][arg10] = 50;
                        class37.field583[arg5][arg3 + 1][arg10] = 50;
                    }
                    if (var11.field2891) {
                        class278.field4718[arg5][arg3][arg10] = class264.method1820(class278.field4718[arg5][arg3][arg10], 2);
                    }
                }
            }
            if (var11.field2911 != 0 && arg0 != null) {
                arg0.method385(arg10, var11.field2858, false, arg8, arg3, arg1);
            }
            if (var11.field2862 != 16) {
                class62.method454(arg5, arg3, arg10, var11.field2862);
            }
        } else if (arg1 == 1) {
            class280 var71;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                class286 var70 = var11.method1214(var24, arg8, (byte) 79, var23, 1, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var70.field4825, var20, var21, var23);
                }
                var71 = var70.field4823;
            } else {
                var71 = new class68(arg2, 1, arg8, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            class123.method813(arg5, arg3, arg10, var19, var71, (class280) null, class261.field4458[arg8], 0, var27);
            if (var11.field2861 && arg9) {
                if (arg8 == 0) {
                    class37.field583[arg5][arg3][arg10 + 1] = 50;
                } else if (arg8 == 1) {
                    class37.field583[arg5][arg3 + 1][arg10 + 1] = 50;
                } else if (arg8 == 2) {
                    class37.field583[arg5][arg3 + 1][arg10] = 50;
                } else if (arg8 == 3) {
                    class37.field583[arg5][arg3][arg10] = 50;
                }
            }
            if (var11.field2911 != 0 && arg0 != null) {
                arg0.method385(arg10, var11.field2858, false, arg8, arg3, arg1);
            }
        } else if (arg1 == 2) {
            int var65 = arg8 + 1 & 0x3;
            class280 var67;
            class280 var69;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                class286 var66 = var11.method1214(var24, arg8 + 4, (byte) -108, var23, 2, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var66.field4825, var20, var21, var23);
                }
                var67 = var66.field4823;
                class286 var68 = var11.method1214(var24, var65, (byte) -115, var23, 2, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var68.field4825, var20, var21, var23);
                }
                var69 = var68.field4823;
            } else {
                var67 = new class68(arg2, 2, arg8 + 4, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
                var69 = new class68(arg2, 2, var65, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            class123.method813(arg5, arg3, arg10, var19, var67, var69, class141.field2072[arg8], class141.field2072[var65], var27);
            if (var11.field2891 && arg9) {
                if (arg8 == 0) {
                    class278.field4718[arg5][arg3][arg10] = class264.method1820(class278.field4718[arg5][arg3][arg10], 1);
                    class278.field4718[arg5][arg3][arg10 + 1] = class264.method1820(class278.field4718[arg5][arg3][arg10 + 1], 2);
                } else if (arg8 == 1) {
                    class278.field4718[arg5][arg3][arg10 + 1] = class264.method1820(class278.field4718[arg5][arg3][arg10 + 1], 2);
                    class278.field4718[arg5][arg3 + 1][arg10] = class264.method1820(class278.field4718[arg5][arg3 + 1][arg10], 1);
                } else if (arg8 == 2) {
                    class278.field4718[arg5][arg3 + 1][arg10] = class264.method1820(class278.field4718[arg5][arg3 + 1][arg10], 1);
                    class278.field4718[arg5][arg3][arg10] = class264.method1820(class278.field4718[arg5][arg3][arg10], 2);
                } else if (arg8 == 3) {
                    class278.field4718[arg5][arg3][arg10] = class264.method1820(class278.field4718[arg5][arg3][arg10], 2);
                    class278.field4718[arg5][arg3][arg10] = class264.method1820(class278.field4718[arg5][arg3][arg10], 1);
                }
            }
            if (var11.field2911 != 0 && arg0 != null) {
                arg0.method385(arg10, var11.field2858, false, arg8, arg3, arg1);
            }
            if (var11.field2862 != 16) {
                class62.method454(arg5, arg3, arg10, var11.field2862);
            }
        } else if (arg1 == 3) {
            class280 var64;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                class286 var63 = var11.method1214(var24, arg8, (byte) 127, var23, 3, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var63.field4825, var20, var21, var23);
                }
                var64 = var63.field4823;
            } else {
                var64 = new class68(arg2, 3, arg8, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            class123.method813(arg5, arg3, arg10, var19, var64, (class280) null, class261.field4458[arg8], 0, var27);
            if (var11.field2861 && arg9) {
                if (arg8 == 0) {
                    class37.field583[arg5][arg3][arg10 + 1] = 50;
                } else if (arg8 == 1) {
                    class37.field583[arg5][arg3 + 1][arg10 + 1] = 50;
                } else if (arg8 == 2) {
                    class37.field583[arg5][arg3 + 1][arg10] = 50;
                } else if (arg8 == 3) {
                    class37.field583[arg5][arg3][arg10] = 50;
                }
            }
            if (var11.field2911 != 0 && arg0 != null) {
                arg0.method385(arg10, var11.field2858, false, arg8, arg3, arg1);
            }
        } else if (arg1 == 9) {
            class280 var37;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                class286 var36 = var11.method1214(var24, arg8, (byte) 103, var23, arg1, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var36.field4825, var20, var21, var23);
                }
                var37 = var36.field4823;
            } else {
                var37 = new class68(arg2, arg1, arg8, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            class194.method1275(arg5, arg3, arg10, var19, 1, 1, var37, 0, var27);
            if (var11.field2911 != 0 && arg0 != null) {
                arg0.method376(arg3, (byte) 123, var13, arg10, var11.field2858, var12);
            }
            if (var11.field2862 != 16) {
                class62.method454(arg5, arg3, arg10, var11.field2862);
            }
        } else if (arg1 == 4) {
            class280 var39;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                class286 var38 = var11.method1214(var24, arg8, (byte) -120, var23, 4, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var38.field4825, var20, var21, var23);
                }
                var39 = var38.field4823;
            } else {
                var39 = new class68(arg2, 4, arg8, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            class282.method1913(arg5, arg3, arg10, var19, var39, (class280) null, class141.field2072[arg8], 0, 0, 0, var27);
        } else if (arg1 == 5) {
            long var58 = class223.method1576(arg5, arg3, arg10);
            int var60 = 16;
            if (var58 != 0L) {
                var60 = class77.method536((int) (var58 >>> 32) & Integer.MAX_VALUE, arg7 ^ 0x1970125A).field2862;
            }
            class280 var62;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                class286 var61 = var11.method1214(var24, arg8, (byte) 126, var23, 4, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var61.field4825, var20 - class81.field1266[arg8] * 8, var21, var23 - (class250.field4150[arg8] * 8));
                }
                var62 = var61.field4823;
            } else {
                var62 = new class68(arg2, 4, arg8, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            class282.method1913(arg5, arg3, arg10, var19, var62, (class280) null, class141.field2072[arg8], 0, class81.field1266[arg8] * var60, class250.field4150[arg8] * var60, var27);
        } else if (arg1 == 6) {
            int var40 = 8;
            long var41 = class223.method1576(arg5, arg3, arg10);
            if (var41 != 0L) {
                var40 = class77.method536((int) (var41 >>> 32) & Integer.MAX_VALUE, 125).field2862 / 2;
            }
            class280 var44;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                class286 var43 = var11.method1214(var24, arg8 + 4, (byte) -84, var23, 4, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var43.field4825, var20 - class142.field2091[arg8] * 8, var21, var23 - (class286.field4816[arg8] * 8));
                }
                var44 = var43.field4823;
            } else {
                var44 = new class68(arg2, 4, arg8 + 4, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            class282.method1913(arg5, arg3, arg10, var19, var44, (class280) null, 256, arg8, class142.field2091[arg8] * var40, class286.field4816[arg8] * var40, var27);
        } else if (arg1 == 7) {
            int var45 = arg8 + 2 & 0x3;
            class280 var47;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                class286 var46 = var11.method1214(var24, var45 + 4, (byte) 99, var23, 4, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var46.field4825, var20, var21, var23);
                }
                var47 = var46.field4823;
            } else {
                var47 = new class68(arg2, 4, var45 + 4, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            class282.method1913(arg5, arg3, arg10, var19, var47, (class280) null, 256, var45, 0, 0, var27);
        } else if (arg1 == 8) {
            long var48 = class223.method1576(arg5, arg3, arg10);
            int var50 = 8;
            if (var48 != 0L) {
                var50 = class77.method536((int) (var48 >>> 32) & Integer.MAX_VALUE, 120).field2862 / 2;
            }
            int var51 = arg8 + 2 & 0x3;
            class280 var55;
            class280 var57;
            if (var11.field2895 == -1 && var11.field2843 == null) {
                int var52 = class142.field2091[arg8] * 8;
                int var53 = class286.field4816[arg8] * 8;
                class286 var54 = var11.method1214(var24, arg8 + 4, (byte) 110, var23, 4, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var54.field4825, var20 - var52, var21, var23 - var53);
                }
                var55 = var54.field4823;
                class286 var56 = var11.method1214(var24, var51 + 4, (byte) -62, var23, 4, var29, arg9, var20, (class178) null, var19, var16);
                if (var29) {
                    class134.method877(var56.field4825, var20 - var52, var21, var23 - var53);
                }
                var57 = var56.field4823;
            } else {
                var55 = new class68(arg2, 4, arg8 + 4, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
                var57 = new class68(arg2, 4, var51 + 4, arg6, arg3, arg10, var11.field2895, var11.field2879, (class280) null);
            }
            class282.method1913(arg5, arg3, arg10, var19, var55, var57, 256, arg8, class142.field2091[arg8] * var50, class286.field4816[arg8] * var50, var27);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIILni;)Lla;", line = 688)
    public static final class178 method2055(int arg0, int arg1, int arg2, class202 arg3) {
        field5116++;
        if (arg1 != -1) {
            field5101 = 84;
        }
        return class180.method1171(arg2, arg0, arg3, (byte) -128) ? class127.method851(false) : null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V", line = 707)
    public static void method2056(boolean arg0) {
        field5109 = null;
        field5114 = null;
        if (arg0) {
            field5109 = (class5) null;
        }
        field5103 = null;
        field5113 = null;
    }
}
