import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class90 extends class176 {

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "[I")
    public int[] field2099 = new int[1];

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "[I")
    public int[] field2102 = new int[] { -1 };

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "Lab;")
    public static class3 field2100 = new class3(8);

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "Lgg;")
    private static class63 field2105 = class116.method911(43, "Prepared sound engine");

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "Lgg;")
    public static class63 field2109 = class116.method911(43, "AUS");

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field2106 = 255;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field2108 = 0;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "Lgg;")
    public static class63 field2113 = field2105;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "Lgg;")
    public static class63 field2112 = class116.method911(43, "scape main");

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "Lgg;")
    public static class63 field2111 = class116.method911(43, "leuchten3:");

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field2116 = 0;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "I")
    public static int field2117 = 0;

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "Lgg;")
    private static class63 field2115 = class116.method911(43, "Please try again)3");

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "Lgg;")
    public static class63 field2107 = field2115;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "Ljc;")
    public static class85 field2104;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "Z")
    public static boolean field2110;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILhf;Lmc;Z)V")
    public static final void method774(int arg0, class71 arg1, class111 arg2, boolean arg3) {
        field2098++;
        class34 var4 = new class34();
        var4.field809 = arg2;
        if (!arg3) {
            field2105 = null;
        }
        var4.field812 = 1;
        var4.field3612 = arg0;
        var4.field808 = arg1;
        class148 var5 = class69.field1729;
        synchronized (class69.field1729) {
            class69.field1729.method1034(0, var4);
        }
        class74.method679(-25);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIILie;III)V")
    public static final void method775(int arg0, int arg1, int arg2, int arg3, int arg4, class79 arg5, int arg6, int arg7, int arg8) {
        field2103++;
        class37 var9 = class167.method1133(true, arg3);
        int var10;
        int var11;
        if (arg6 == 1 || arg6 == 3) {
            var11 = var9.field893;
            var10 = var9.field914;
        } else {
            var10 = var9.field893;
            var11 = var9.field914;
        }
        int var12 = (arg2 << 7) + (var11 << 6);
        int[][] var13 = class81.field1948[arg1];
        int var14;
        int var15;
        if (arg8 + var10 > 104) {
            var14 = arg8 + 1;
            var15 = arg8;
        } else {
            var14 = (var10 + 1 >> 1) + arg8;
            var15 = arg8 + (var10 >> 1);
        }
        int var16;
        int var17;
        if (arg2 + var11 <= 104) {
            var16 = (var11 + 1 >> 1) + arg2;
            var17 = (var11 >> 1) + arg2;
        } else {
            var17 = arg2;
            var16 = arg2 + 1;
        }
        int var18 = var13[var17][var15] + var13[var16][var15] + var13[var16][var14] + var13[var17][var14] >> 2;
        long var19 = (long) ((arg6 | 0x400) << 20 | arg8 << 7 | arg2 | arg4 << 14);
        if (var9.field915 == 0) {
            var19 |= Long.MIN_VALUE;
        }
        int var21 = (arg8 << 7) + (var10 << 6);
        if (var9.field912 == 1) {
            var19 |= 0x400000L;
        }
        long var22 = var19 | (long) arg3 << 32;
        if (arg4 == 22) {
            class30 var24;
            if (var9.field872 == -1 && var9.field897 == null) {
                var24 = var9.method355(var21, var13, 22, arg6, var12, var18, 61576003);
            } else {
                var24 = new class40(arg3, 22, arg6, arg1, arg2, arg8, var9.field872, true, null);
            }
            class167.method1132(arg0, arg2, arg8, var18, var24, var22);
            if (var9.field877 == 1) {
                arg5.method715(arg2, false, arg8);
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class30 var51;
            if (var9.field872 == -1 && var9.field897 == null) {
                var51 = var9.method355(var21, var13, 10, arg6, var12, var18, 61576003);
            } else {
                var51 = new class40(arg3, 10, arg6, arg1, arg2, arg8, var9.field872, true, null);
            }
            if (var51 != null) {
                class64.method608(arg0, arg2, arg8, var18, var11, var10, var51, arg4 == 11 ? 256 : 0, var22);
            }
            if (var9.field877 != 0) {
                arg5.method718(var9.field878, var10, arg2, arg8, var11, -20496);
            }
        } else if (arg4 >= 12) {
            class30 var25;
            if (var9.field872 == -1 && var9.field897 == null) {
                var25 = var9.method355(var21, var13, arg4, arg6, var12, var18, 61576003);
            } else {
                var25 = new class40(arg3, arg4, arg6, arg1, arg2, arg8, var9.field872, true, null);
            }
            class64.method608(arg0, arg2, arg8, var18, 1, 1, var25, 0, var22);
            if (var9.field877 != 0) {
                arg5.method718(var9.field878, var10, arg2, arg8, var11, -20496);
            }
        } else if (arg4 == 0) {
            class30 var26;
            if (var9.field872 == -1 && var9.field897 == null) {
                var26 = var9.method355(var21, var13, 0, arg6, var12, var18, 61576003);
            } else {
                var26 = new class40(arg3, 0, arg6, arg1, arg2, arg8, var9.field872, true, null);
            }
            class28.method278(arg0, arg2, arg8, var18, var26, null, class121.field2670[arg6], 0, var22);
            if (var9.field877 != 0) {
                arg5.method706(-26739, arg8, arg2, var9.field878, arg6, arg4);
            }
        } else if (arg4 == 1) {
            class30 var27;
            if (var9.field872 == -1 && var9.field897 == null) {
                var27 = var9.method355(var21, var13, 1, arg6, var12, var18, 61576003);
            } else {
                var27 = new class40(arg3, 1, arg6, arg1, arg2, arg8, var9.field872, true, null);
            }
            class28.method278(arg0, arg2, arg8, var18, var27, null, class139.field2979[arg6], 0, var22);
            if (var9.field877 != 0) {
                arg5.method706(-26739, arg8, arg2, var9.field878, arg6, arg4);
            }
        } else if (arg4 == 2) {
            int var28 = arg6 + 1 & 0x3;
            class30 var29;
            class30 var30;
            if (var9.field872 == -1 && var9.field897 == null) {
                var29 = var9.method355(var21, var13, 2, arg6 + 4, var12, var18, 61576003);
                var30 = var9.method355(var21, var13, 2, var28, var12, var18, 61576003);
            } else {
                var29 = new class40(arg3, 2, arg6 + 4, arg1, arg2, arg8, var9.field872, true, null);
                var30 = new class40(arg3, 2, var28, arg1, arg2, arg8, var9.field872, true, null);
            }
            class28.method278(arg0, arg2, arg8, var18, var29, var30, class121.field2670[arg6], class121.field2670[var28], var22);
            if (var9.field877 != 0) {
                arg5.method706(-26739, arg8, arg2, var9.field878, arg6, arg4);
            }
        } else if (arg4 == 3) {
            class30 var31;
            if (var9.field872 == -1 && var9.field897 == null) {
                var31 = var9.method355(var21, var13, 3, arg6, var12, var18, 61576003);
            } else {
                var31 = new class40(arg3, 3, arg6, arg1, arg2, arg8, var9.field872, true, null);
            }
            class28.method278(arg0, arg2, arg8, var18, var31, null, class139.field2979[arg6], 0, var22);
            if (var9.field877 != 0) {
                arg5.method706(-26739, arg8, arg2, var9.field878, arg6, arg4);
            }
        } else if (arg4 == 9) {
            class30 var32;
            if (var9.field872 == -1 && var9.field897 == null) {
                var32 = var9.method355(var21, var13, arg4, arg6, var12, var18, 61576003);
            } else {
                var32 = new class40(arg3, arg4, arg6, arg1, arg2, arg8, var9.field872, true, null);
            }
            class64.method608(arg0, arg2, arg8, var18, 1, 1, var32, 0, var22);
            if (var9.field877 != 0) {
                arg5.method718(var9.field878, var10, arg2, arg8, var11, -20496);
            }
        } else {
            int var33 = -106 % ((2 - arg7) / 37);
            if (arg4 == 4) {
                class30 var34;
                if (var9.field872 == -1 && var9.field897 == null) {
                    var34 = var9.method355(var21, var13, 4, arg6, var12, var18, 61576003);
                } else {
                    var34 = new class40(arg3, 4, arg6, arg1, arg2, arg8, var9.field872, true, null);
                }
                class71.method672(arg0, arg2, arg8, var18, var34, null, class121.field2670[arg6], 0, 0, 0, var22);
            } else if (arg4 == 5) {
                long var35 = class40.method366(arg0, arg2, arg8);
                int var37 = 16;
                if (var35 != 0L) {
                    var37 = class167.method1133(true, (int) (var35 >>> 32) & Integer.MAX_VALUE).field892;
                }
                class30 var38;
                if (var9.field872 == -1 && var9.field897 == null) {
                    var38 = var9.method355(var21, var13, 4, arg6, var12, var18, 61576003);
                } else {
                    var38 = new class40(arg3, 4, arg6, arg1, arg2, arg8, var9.field872, true, null);
                }
                class71.method672(arg0, arg2, arg8, var18, var38, null, class121.field2670[arg6], 0, class112.field2521[arg6] * var37, class135.field2923[arg6] * var37, var22);
            } else if (arg4 == 6) {
                int var39 = 8;
                long var40 = class40.method366(arg0, arg2, arg8);
                if (var40 != 0L) {
                    var39 = class167.method1133(true, (int) (var40 >>> 32) & Integer.MAX_VALUE).field892 / 2;
                }
                class30 var42;
                if (var9.field872 == -1 && var9.field897 == null) {
                    var42 = var9.method355(var21, var13, 4, arg6 + 4, var12, var18, 61576003);
                } else {
                    var42 = new class40(arg3, 4, arg6 + 4, arg1, arg2, arg8, var9.field872, true, null);
                }
                class71.method672(arg0, arg2, arg8, var18, var42, null, 256, arg6, class56.field1478[arg6] * var39, class202.field3998[arg6] * var39, var22);
            } else if (arg4 == 7) {
                int var43 = arg6 + 2 & 0x3;
                class30 var44;
                if (var9.field872 == -1 && var9.field897 == null) {
                    var44 = var9.method355(var21, var13, 4, var43 + 4, var12, var18, 61576003);
                } else {
                    var44 = new class40(arg3, 4, var43 + 4, arg1, arg2, arg8, var9.field872, true, null);
                }
                class71.method672(arg0, arg2, arg8, var18, var44, null, 256, var43, 0, 0, var22);
            } else if (arg4 == 8) {
                int var45 = 8;
                long var46 = class40.method366(arg0, arg2, arg8);
                if (var46 != 0L) {
                    var45 = class167.method1133(true, (int) (var46 >>> 32) & Integer.MAX_VALUE).field892 / 2;
                }
                int var48 = arg6 + 2 & 0x3;
                class30 var49;
                class30 var50;
                if (var9.field872 == -1 && var9.field897 == null) {
                    var49 = var9.method355(var21, var13, 4, arg6 + 4, var12, var18, 61576003);
                    var50 = var9.method355(var21, var13, 4, var48 + 4, var12, var18, 61576003);
                } else {
                    var49 = new class40(arg3, 4, arg6 + 4, arg1, arg2, arg8, var9.field872, true, null);
                    var50 = new class40(arg3, 4, var48 + 4, arg1, arg2, arg8, var9.field872, true, null);
                }
                class71.method672(arg0, arg2, arg8, var18, var49, var50, 256, arg6, class56.field1478[arg6] * var45, class202.field3998[arg6] * var45, var22);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
    public static void method776(int arg0) {
        field2105 = null;
        field2113 = null;
        field2100 = null;
        field2104 = null;
        field2115 = null;
        field2109 = null;
        field2107 = null;
        field2112 = null;
        field2111 = null;
        if (arg0 != 14285) {
            field2107 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)V")
    public static final void method777(boolean arg0) {
        field2101++;
        if (arg0) {
            method775(-7, 54, -1, 103, -27, null, -101, -127, -57);
        }
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(1);
    }
}
