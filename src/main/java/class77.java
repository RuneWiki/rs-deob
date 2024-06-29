import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class77 extends class24 {

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "[I")
    public static int[] field1046 = new int[500];

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Lej;")
    public static class204 field1036 = new class204(50);

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Z")
    public static boolean field1056 = false;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public int field1034;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public int field1037;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public int field1040;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public int field1043;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public int field1049;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "Llg;")
    public class11 field1055;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "Lg;")
    public static class242 field1045;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Lv;")
    public class260 field1047;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "Lpl;")
    public class261 field1061;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lwl;")
    public class293 field1052;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)Ljj;", line = 5)
    public static final class26 method455(int arg0, int arg1, int arg2) {
        field1041++;
        int var3 = -98 % ((arg1 + 12) / 39);
        class26 var4 = (class26) class226.field3666.method493((long) arg2 | (long) arg0 << 32, 65);
        if (var4 == null) {
            var4 = new class26(arg0, arg2);
            class226.field3666.method490(var4, var4.field292, true);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 32)
    public static void method456(int arg0) {
        if (arg0 != -8818) {
            field1045 = (class242) null;
        }
        field1045 = null;
        field1046 = null;
        field1036 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIIIIII)V", line = 47)
    public static final void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1054++;
        class117 var10 = null;
        for (class117 var11 = (class117) class31.field369.method442(arg5 ^ 0xFFFF00F2); var11 != null; var11 = (class117) class31.field369.method440(3)) {
            if (var11.field1827 == arg6 && var11.field1828 == arg4 && var11.field1829 == arg2 && var11.field1826 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class117();
            var10.field1826 = arg9;
            var10.field1828 = arg4;
            var10.field1829 = arg2;
            var10.field1827 = arg6;
            class293.method2017(false, var10);
            class31.field369.method451(-91453648, var10);
        }
        var10.field1831 = arg8;
        var10.field1825 = arg1;
        var10.field1833 = arg3;
        var10.field1832 = arg7;
        var10.field1817 = arg0;
        if (arg5 != -1) {
            field1056 = false;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V", line = 103)
    public final void method458(int arg0) {
        if (arg0 != -105) {
            return;
        }
        this.field1061 = null;
        this.field1052 = null;
        this.field1047 = null;
        field1053++;
        this.field1055 = null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V", line = 124)
    public static final void method459(int arg0, int arg1, int arg2) {
        class72.field965 = true;
        class142.field2197 = arg0;
        class140.field2175 = arg1;
        class114.field1786 = arg2;
        class114.field1783 = -1;
        class261.field4433 = -1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIILcg;IZIZ)V", line = 144)
    public static final void method460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class253 arg6, int arg7, boolean arg8, int arg9, boolean arg10) {
        field1042++;
        if (arg10 && !class155.method1102(-69) && (class159.field2520[0][arg9][arg4] & 0x2) == 0) {
            if ((class159.field2520[arg3][arg9][arg4] & 0x10) != 0) {
                return;
            }
            if (class198.method1392(arg3, false, arg9, arg4) != class199.field3288) {
                return;
            }
        }
        if (arg3 < class20.field250) {
            class20.field250 = arg3;
        }
        class161 var11 = class15.method64(arg5, false);
        if (var11.field2560) {
            return;
        }
        int var12;
        int var13;
        if (arg7 == 1 || arg7 == 3) {
            var12 = var11.field2559;
            var13 = var11.field2558;
        } else {
            var12 = var11.field2558;
            var13 = var11.field2559;
        }
        int var14;
        int var15;
        if (arg4 + var13 <= 104) {
            var14 = (var13 >> 1) + arg4;
            var15 = (var13 + 1 >> 1) + arg4;
        } else {
            var15 = arg4 + 1;
            var14 = arg4;
        }
        int var16;
        int var17;
        if ((arg9 + var12) > 104) {
            var16 = arg9;
            var17 = arg9 + 1;
        } else {
            var17 = (var12 + 1 >> 1) + arg9;
            var16 = arg9 + (var12 >> 1);
        }
        int[][] var18 = class227.field3686[arg2];
        int var19 = (arg4 << 7) + (var13 << 6);
        int var20 = (arg9 << 7) + (var12 << 6);
        int var21 = var18[var16][var14] + var18[var17][var14] - (-var18[var16][var15] - var18[var17][var15]) >> 2;
        int var22 = arg1;
        if (arg2 != 0) {
            int[][] var23 = class227.field3686[0];
            var22 = var21 - (var23[var16][var14] + var23[var16][var15] + var23[var17][var15] + var23[var17][var14] >> 2);
        }
        int[][] var24 = (int[][]) null;
        long var25 = (long) (arg7 << 20 | arg9 | arg4 << 7 | arg0 << 14 | 0x40000000);
        if (var11.field2596 == 0 || arg8) {
            var25 |= Long.MIN_VALUE;
        }
        if (arg8) {
            var24 = class172.field2804[0];
        } else if (arg2 < 3) {
            var24 = class227.field3686[arg2 + 1];
        }
        if (var11.field2597 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field2616) {
            var25 |= 0x80000000L;
        }
        if (var11.method1132(0)) {
            class297.method2036(var11, arg3, arg7, arg9, (class22) null, (class54) null, arg4, true);
        }
        long var27 = var25 | (long) arg5 << 32;
        boolean var29 = !arg8 & var11.field2557;
        if (arg0 == 22) {
            if (class69.field914 || var11.field2596 != 0 || var11.field2571 == 1 || var11.field2554) {
                class231 var77;
                if (var11.field2590 == -1 && var11.field2553 == null) {
                    class12 var76 = var11.method1128(22, var20, var24, var21, var29, var19, arg7, arg10, true, var18, (class265) null);
                    if (var29) {
                        class100.method757(var76.field128, var20, var22, var19);
                    }
                    var77 = var76.field137;
                } else {
                    var77 = new class132(arg5, 22, arg7, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
                }
                class109.method809(arg3, arg9, arg4, var21, var77, var27, var11.field2561);
                if (var11.field2571 == 1 && arg6 != null) {
                    arg6.method1730(arg4, arg9, (byte) -105);
                }
            }
        } else if (arg0 == 10 || arg0 == 11) {
            class231 var71;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                class12 var70 = var11.method1128(10, var20, var24, var21, var29, var19, arg0 == 11 ? arg7 + 4 : arg7, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var70.field128, var20, var22, var19);
                }
                var71 = var70.field137;
            } else {
                var71 = new class132(arg5, 10, arg0 == 11 ? arg7 + 4 : arg7, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            if (var71 != null) {
                boolean var72 = class95.method721(arg3, arg9, arg4, var21, var12, var13, var71, 0, var27);
                if (var11.field2592 && var72 && arg10) {
                    int var73 = 15;
                    if (var71 instanceof class152) {
                        var73 = ((class152) var71).method672() / 4;
                        if (var73 > 30) {
                            var73 = 30;
                        }
                    }
                    for (int var74 = 0; var74 <= var12; var74++) {
                        for (int var75 = 0; var75 <= var13; var75++) {
                            if (class168.field2749[arg3][arg9 + var74][arg4 + var75] < var73) {
                                class168.field2749[arg3][arg9 + var74][arg4 + var75] = (byte) var73;
                            }
                        }
                    }
                }
            }
            if (var11.field2571 != 0 && arg6 != null) {
                arg6.method1731(arg4, arg9, (byte) -94, var12, var13, var11.field2568);
            }
        } else if (arg0 >= 12) {
            class231 var69;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                class12 var68 = var11.method1128(arg0, var20, var24, var21, var29, var19, arg7, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var68.field128, var20, var22, var19);
                }
                var69 = var68.field137;
            } else {
                var69 = new class132(arg5, arg0, arg7, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            class95.method721(arg3, arg9, arg4, var21, 1, 1, var69, 0, var27);
            if (arg10 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg3 > 0) {
                class58.field767[arg3][arg9][arg4] = class80.method492(class58.field767[arg3][arg9][arg4], 4);
            }
            if (var11.field2571 != 0 && arg6 != null) {
                arg6.method1731(arg4, arg9, (byte) -69, var12, var13, var11.field2568);
            }
        } else if (arg0 == 0) {
            class231 var31;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                class12 var30 = var11.method1128(0, var20, var24, var21, var29, var19, arg7, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var30.field128, var20, var22, var19);
                }
                var31 = var30.field137;
            } else {
                var31 = new class132(arg5, 0, arg7, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            class157.method1116(arg3, arg9, arg4, var21, var31, (class231) null, class140.field2158[arg7], 0, var27);
            if (arg10) {
                if (arg7 == 0) {
                    if (var11.field2592) {
                        class168.field2749[arg3][arg9][arg4] = 50;
                        class168.field2749[arg3][arg9][arg4 + 1] = 50;
                    }
                    if (var11.field2580) {
                        class58.field767[arg3][arg9][arg4] = class80.method492(class58.field767[arg3][arg9][arg4], 1);
                    }
                } else if (arg7 == 1) {
                    if (var11.field2592) {
                        class168.field2749[arg3][arg9][arg4 + 1] = 50;
                        class168.field2749[arg3][arg9 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field2580) {
                        class58.field767[arg3][arg9][arg4 + 1] = class80.method492(class58.field767[arg3][arg9][arg4 + 1], 2);
                    }
                } else if (arg7 == 2) {
                    if (var11.field2592) {
                        class168.field2749[arg3][arg9 + 1][arg4] = 50;
                        class168.field2749[arg3][arg9 + 1][arg4 + 1] = 50;
                    }
                    if (var11.field2580) {
                        class58.field767[arg3][arg9 + 1][arg4] = class80.method492(class58.field767[arg3][arg9 + 1][arg4], 1);
                    }
                } else if (arg7 == 3) {
                    if (var11.field2592) {
                        class168.field2749[arg3][arg9][arg4] = 50;
                        class168.field2749[arg3][arg9 + 1][arg4] = 50;
                    }
                    if (var11.field2580) {
                        class58.field767[arg3][arg9][arg4] = class80.method492(class58.field767[arg3][arg9][arg4], 2);
                    }
                }
            }
            if (var11.field2571 != 0 && arg6 != null) {
                arg6.method1732(var11.field2568, -2, arg0, arg9, arg7, arg4);
            }
            if (var11.field2564 != 16) {
                class64.method368(arg3, arg9, arg4, var11.field2564);
            }
        } else if (arg0 == 1) {
            class231 var67;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                class12 var66 = var11.method1128(1, var20, var24, var21, var29, var19, arg7, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var66.field128, var20, var22, var19);
                }
                var67 = var66.field137;
            } else {
                var67 = new class132(arg5, 1, arg7, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            class157.method1116(arg3, arg9, arg4, var21, var67, (class231) null, class240.field3897[arg7], 0, var27);
            if (var11.field2592 && arg10) {
                if (arg7 == 0) {
                    class168.field2749[arg3][arg9][arg4 + 1] = 50;
                } else if (arg7 == 1) {
                    class168.field2749[arg3][arg9 + 1][arg4 + 1] = 50;
                } else if (arg7 == 2) {
                    class168.field2749[arg3][arg9 + 1][arg4] = 50;
                } else if (arg7 == 3) {
                    class168.field2749[arg3][arg9][arg4] = 50;
                }
            }
            if (var11.field2571 != 0 && arg6 != null) {
                arg6.method1732(var11.field2568, -2, arg0, arg9, arg7, arg4);
            }
        } else if (arg0 == 2) {
            int var61 = arg7 + 1 & 0x3;
            class231 var63;
            class231 var65;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                class12 var62 = var11.method1128(2, var20, var24, var21, var29, var19, arg7 + 4, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var62.field128, var20, var22, var19);
                }
                var63 = var62.field137;
                class12 var64 = var11.method1128(2, var20, var24, var21, var29, var19, var61, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var64.field128, var20, var22, var19);
                }
                var65 = var64.field137;
            } else {
                var63 = new class132(arg5, 2, arg7 + 4, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
                var65 = new class132(arg5, 2, var61, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            class157.method1116(arg3, arg9, arg4, var21, var63, var65, class140.field2158[arg7], class140.field2158[var61], var27);
            if (var11.field2580 && arg10) {
                if (arg7 == 0) {
                    class58.field767[arg3][arg9][arg4] = class80.method492(class58.field767[arg3][arg9][arg4], 1);
                    class58.field767[arg3][arg9][arg4 + 1] = class80.method492(class58.field767[arg3][arg9][arg4 + 1], 2);
                } else if (arg7 == 1) {
                    class58.field767[arg3][arg9][arg4 + 1] = class80.method492(class58.field767[arg3][arg9][arg4 + 1], 2);
                    class58.field767[arg3][arg9 + 1][arg4] = class80.method492(class58.field767[arg3][arg9 + 1][arg4], 1);
                } else if (arg7 == 2) {
                    class58.field767[arg3][arg9 + 1][arg4] = class80.method492(class58.field767[arg3][arg9 + 1][arg4], 1);
                    class58.field767[arg3][arg9][arg4] = class80.method492(class58.field767[arg3][arg9][arg4], 2);
                } else if (arg7 == 3) {
                    class58.field767[arg3][arg9][arg4] = class80.method492(class58.field767[arg3][arg9][arg4], 2);
                    class58.field767[arg3][arg9][arg4] = class80.method492(class58.field767[arg3][arg9][arg4], 1);
                }
            }
            if (var11.field2571 != 0 && arg6 != null) {
                arg6.method1732(var11.field2568, -2, arg0, arg9, arg7, arg4);
            }
            if (var11.field2564 != 16) {
                class64.method368(arg3, arg9, arg4, var11.field2564);
            }
        } else if (arg0 == 3) {
            class231 var33;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                class12 var32 = var11.method1128(3, var20, var24, var21, var29, var19, arg7, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var32.field128, var20, var22, var19);
                }
                var33 = var32.field137;
            } else {
                var33 = new class132(arg5, 3, arg7, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            class157.method1116(arg3, arg9, arg4, var21, var33, (class231) null, class240.field3897[arg7], 0, var27);
            if (var11.field2592 && arg10) {
                if (arg7 == 0) {
                    class168.field2749[arg3][arg9][arg4 + 1] = 50;
                } else if (arg7 == 1) {
                    class168.field2749[arg3][arg9 + 1][arg4 + 1] = 50;
                } else if (arg7 == 2) {
                    class168.field2749[arg3][arg9 + 1][arg4] = 50;
                } else if (arg7 == 3) {
                    class168.field2749[arg3][arg9][arg4] = 50;
                }
            }
            if (var11.field2571 != 0 && arg6 != null) {
                arg6.method1732(var11.field2568, -2, arg0, arg9, arg7, arg4);
            }
        } else if (arg0 == 9) {
            class231 var35;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                class12 var34 = var11.method1128(arg0, var20, var24, var21, var29, var19, arg7, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var34.field128, var20, var22, var19);
                }
                var35 = var34.field137;
            } else {
                var35 = new class132(arg5, arg0, arg7, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            class95.method721(arg3, arg9, arg4, var21, 1, 1, var35, 0, var27);
            if (var11.field2571 != 0 && arg6 != null) {
                arg6.method1731(arg4, arg9, (byte) -89, var12, var13, var11.field2568);
            }
            if (var11.field2564 != 16) {
                class64.method368(arg3, arg9, arg4, var11.field2564);
            }
        } else if (arg0 == 4) {
            class231 var37;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                class12 var36 = var11.method1128(4, var20, var24, var21, var29, var19, arg7, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var36.field128, var20, var22, var19);
                }
                var37 = var36.field137;
            } else {
                var37 = new class132(arg5, 4, arg7, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            class43.method239(arg3, arg9, arg4, var21, var37, (class231) null, class140.field2158[arg7], 0, 0, 0, var27);
        } else if (arg0 == 5) {
            int var56 = 16;
            long var57 = class295.method2026(arg3, arg9, arg4);
            if (var57 != 0L) {
                var56 = class15.method64(Integer.MAX_VALUE & (int) (var57 >>> 32), false).field2564;
            }
            class231 var60;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                class12 var59 = var11.method1128(4, var20, var24, var21, var29, var19, arg7, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var59.field128, var20 - class289.field4862[arg7] * 8, var22, var19 - (class206.field3389[arg7] * 8));
                }
                var60 = var59.field137;
            } else {
                var60 = new class132(arg5, 4, arg7, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            class43.method239(arg3, arg9, arg4, var21, var60, (class231) null, class140.field2158[arg7], 0, class289.field4862[arg7] * var56, class206.field3389[arg7] * var56, var27);
        } else if (arg0 == 6) {
            long var51 = class295.method2026(arg3, arg9, arg4);
            int var53 = 8;
            if (var51 != 0L) {
                var53 = class15.method64(Integer.MAX_VALUE & (int) (var51 >>> 32), false).field2564 / 2;
            }
            class231 var55;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                class12 var54 = var11.method1128(4, var20, var24, var21, var29, var19, arg7 + 4, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var54.field128, var20 - (class139.field2143[arg7] * 8), var22, var19 - class262.field4454[arg7] * 8);
                }
                var55 = var54.field137;
            } else {
                var55 = new class132(arg5, 4, arg7 + 4, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            class43.method239(arg3, arg9, arg4, var21, var55, (class231) null, 256, arg7, class139.field2143[arg7] * var53, class262.field4454[arg7] * var53, var27);
        } else if (arg0 == 7) {
            int var48 = arg7 + 2 & 0x3;
            class231 var50;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                class12 var49 = var11.method1128(4, var20, var24, var21, var29, var19, var48 + 4, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var49.field128, var20, var22, var19);
                }
                var50 = var49.field137;
            } else {
                var50 = new class132(arg5, 4, var48 + 4, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            class43.method239(arg3, arg9, arg4, var21, var50, (class231) null, 256, var48, 0, 0, var27);
        } else if (arg0 == 8) {
            int var38 = 8;
            int var39 = arg7 + 2 & 0x3;
            long var40 = class295.method2026(arg3, arg9, arg4);
            if (var40 != 0L) {
                var38 = class15.method64((int) (var40 >>> 32) & Integer.MAX_VALUE, false).field2564 / 2;
            }
            class231 var45;
            class231 var47;
            if (var11.field2590 == -1 && var11.field2553 == null) {
                int var42 = class139.field2143[arg7] * 8;
                int var43 = class262.field4454[arg7] * 8;
                class12 var44 = var11.method1128(4, var20, var24, var21, var29, var19, arg7 + 4, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var44.field128, var20 - var42, var22, var19 - var43);
                }
                var45 = var44.field137;
                class12 var46 = var11.method1128(4, var20, var24, var21, var29, var19, var39 + 4, arg10, true, var18, (class265) null);
                if (var29) {
                    class100.method757(var46.field128, var20 - var42, var22, var19 - var43);
                }
                var47 = var46.field137;
            } else {
                var45 = new class132(arg5, 4, arg7 + 4, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
                var47 = new class132(arg5, 4, var39 + 4, arg2, arg9, arg4, var11.field2590, var11.field2606, (class231) null);
            }
            class43.method239(arg3, arg9, arg4, var21, var45, var47, 256, arg7, class139.field2143[arg7] * var38, class262.field4454[arg7] * var38, var27);
        }
    }
}
