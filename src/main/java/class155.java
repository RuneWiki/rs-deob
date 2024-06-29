import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class155 extends class1 {

    @OriginalMember(owner = "client!og", name = "nb", descriptor = "[I")
    private int[] field2807 = new int[257];

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "[I")
    public static int[] field2800 = new int[50];

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "Loc;")
    public static class151 field2802 = class137.method873(2, "sl_flags");

    @OriginalMember(owner = "client!og", name = "tb", descriptor = "Loh;")
    public static class156 field2813 = new class156(50);

    @OriginalMember(owner = "client!og", name = "xb", descriptor = "Loc;")
    public static class151 field2817 = class137.method873(2, "welle:");

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!og", name = "jb", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!og", name = "kb", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!og", name = "lb", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!og", name = "mb", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!og", name = "ob", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!og", name = "pb", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!og", name = "rb", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!og", name = "sb", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!og", name = "ub", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!og", name = "wb", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!og", name = "qb", descriptor = "Lnd;")
    public static class142 field2810;

    @OriginalMember(owner = "client!og", name = "vb", descriptor = "[[I")
    private int[][] field2815;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class155() {
        super(1, false);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
    public static final void method1015(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2816;
        if (arg2 == 29138) {
            for (int var5 = 0; ~var5 > ~class147.field2628; ++var5) {
                if (~(class222.field3858[var5] + class121.field2176[var5]) < ~arg0 && ~(arg0 + arg1) < ~class222.field3858[var5] && ~arg3 > ~(class210.field3679[var5] + class192.field3407[var5]) && class192.field3407[var5] < arg3 + arg4) {
                    class63.field1234[var5] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IJ)Loc;")
    public static final class151 method1016(int arg0, long arg1) {
        ++field2812;
        if (arg1 > (long) arg0 && ~arg1 > -6582952005840035282L) {
            if (arg1 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (var4 != 0L) {
                    var4 /= 37L;
                    ++var3;
                }
                byte[] var6 = new byte[var3];
                while (arg1 != 0L) {
                    long var8 = arg1;
                    arg1 /= 37L;
                    --var3;
                    var6[var3] = class168.field3069[(int) (-(arg1 * 37L) + var8)];
                }
                class151 var7 = new class151();
                var7.field2736 = var6;
                var7.field2690 = var6.length;
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIZLn;IIZIZ)V")
    public static final void method1017(int arg0, int arg1, int arg2, int arg3, boolean arg4, class138 arg5, int arg6, int arg7, boolean arg8, int arg9, boolean arg10) {
        ++field2811;
        if (arg8 && ~(2 & class122.field2191[0][arg2][arg7]) == -1) {
            if (~(16 & class122.field2191[arg6][arg2][arg7]) != -1) {
                return;
            }
            if (~class229.method1449(2, arg6, arg7, arg2) != ~class40.field817) {
                return;
            }
        }
        if (~class53.field1067 < ~arg6) {
            class53.field1067 = arg6;
        }
        class93 var11 = class5.method32((byte) 29, arg0);
        if (arg10) {
            method1016(70, 32L);
        }
        int var12;
        int var13;
        if (~arg1 != -2 && ~arg1 != -4) {
            var12 = var11.field1715;
            var13 = var11.field1697;
        } else {
            var13 = var11.field1715;
            var12 = var11.field1697;
        }
        int var14;
        int var15;
        if (arg2 + var13 <= 104) {
            var14 = arg2 - -(var13 >> 1);
            var15 = (var13 + 1 >> 1) + arg2;
        } else {
            var14 = arg2;
            var15 = arg2 - -1;
        }
        int[][] var16 = class104.field1872[arg3];
        int var17;
        int var18;
        if (~(arg7 + var12) < -105) {
            var17 = arg7;
            var18 = arg7 + 1;
        } else {
            var18 = (var12 + 1 >> 1) + arg7;
            var17 = (var12 >> 1) + arg7;
        }
        int var19 = (arg7 << 7) + (var12 << 6);
        int var20 = var16[var14][var17] + var16[var15][var18] - -var16[var15][var17] - -var16[var14][var18] >> 2;
        Object var21 = null;
        int var22 = (arg2 << 7) + (var13 << 6);
        long var23 = (long) (arg1 << 20 | arg9 << 14 | arg7 << 7 | arg2 | 1073741824);
        if (~var11.field1689 == -1) {
            var23 |= Long.MIN_VALUE;
        }
        if (~var11.field1704 == -2) {
            var23 |= 4194304L;
        }
        long var25 = var23 | (long) arg0 << 32;
        if (arg4 && var11.method584(1)) {
            class83.method527(arg6, arg2, arg7, -9926, var11, arg1);
        }
        if (~arg9 == -23) {
            if (!arg8 || var11.field1689 != 0 || var11.field1719 == 1 || var11.field1722) {
                class235 var28;
                if (~var11.field1727 == 0 && var11.field1746 == null) {
                    class159 var27 = var11.method595(27, var22, 22, var20, arg1, var19, var16, arg4);
                    var28 = var27.field2865;
                } else {
                    var28 = new class15(arg0, 22, arg1, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class120.method728(arg6, arg2, arg7, var20, var28, var25, var11.field1731);
                if (~var11.field1719 == -2 && arg5 != null) {
                    arg5.method884(arg7, 54, arg2);
                }
            }
        } else if (~arg9 != -11 && arg9 != 11) {
            if (~arg9 <= -13) {
                class235 var30;
                if (var11.field1727 == -1 && var11.field1746 == null) {
                    class159 var29 = var11.method595(27, var22, arg9, var20, arg1, var19, var16, arg4);
                    var30 = var29.field2865;
                } else {
                    var30 = new class15(arg0, arg9, arg1, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class154.method1010(arg6, arg2, arg7, var20, 1, 1, var30, 0, var25);
                if (arg4 && arg9 >= 12 && ~arg9 >= -18 && ~arg9 != -14 && arg6 > 0) {
                    class231.field4122[arg6][arg2][arg7] = class73.method479(class231.field4122[arg6][arg2][arg7], 2340);
                }
                if (~var11.field1719 != -1 && arg5 != null) {
                    arg5.method889(arg7, var11.field1714, arg2, var12, var13, 127);
                }
            } else if (arg9 == 0) {
                class235 var32;
                if (~var11.field1727 == 0 && var11.field1746 == null) {
                    class159 var31 = var11.method595(27, var22, 0, var20, arg1, var19, var16, arg4);
                    var32 = var31.field2865;
                } else {
                    var32 = new class15(arg0, 0, arg1, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class66.method439(arg6, arg2, arg7, var20, var32, (class235) null, class222.field3850[arg1], 0, var25);
                if (arg4) {
                    if (arg1 != 0) {
                        if (~arg1 == -2) {
                            if (var11.field1735) {
                                class78.field1508[arg6][arg2][arg7 + 1] = 50;
                                class78.field1508[arg6][arg2 + 1][arg7 + 1] = 50;
                            }
                            if (var11.field1740) {
                                class231.field4122[arg6][arg2][arg7 + 1] = class73.method479(class231.field4122[arg6][arg2][arg7 + 1], 1170);
                            }
                        } else if (arg1 == 2) {
                            if (var11.field1735) {
                                class78.field1508[arg6][arg2 + 1][arg7] = 50;
                                class78.field1508[arg6][arg2 + 1][arg7 + 1] = 50;
                            }
                            if (var11.field1740) {
                                class231.field4122[arg6][arg2 + 1][arg7] = class73.method479(class231.field4122[arg6][arg2 + 1][arg7], 585);
                            }
                        } else if (arg1 == 3) {
                            if (var11.field1735) {
                                class78.field1508[arg6][arg2][arg7] = 50;
                                class78.field1508[arg6][arg2 + 1][arg7] = 50;
                            }
                            if (var11.field1740) {
                                class231.field4122[arg6][arg2][arg7] = class73.method479(class231.field4122[arg6][arg2][arg7], 1170);
                            }
                        }
                    } else {
                        if (var11.field1735) {
                            class78.field1508[arg6][arg2][arg7] = 50;
                            class78.field1508[arg6][arg2][arg7 + 1] = 50;
                        }
                        if (var11.field1740) {
                            class231.field4122[arg6][arg2][arg7] = class73.method479(class231.field4122[arg6][arg2][arg7], 585);
                        }
                    }
                }
                if (var11.field1719 != 0 && arg5 != null) {
                    arg5.method894(arg1, arg2, arg9, (byte) -76, var11.field1714, arg7);
                }
                if (~var11.field1726 != -17) {
                    class218.method1364(arg6, arg2, arg7, var11.field1726);
                }
            } else if (arg9 == 1) {
                class235 var34;
                if (~var11.field1727 == 0 && var11.field1746 == null) {
                    class159 var33 = var11.method595(27, var22, 1, var20, arg1, var19, var16, arg4);
                    var34 = var33.field2865;
                } else {
                    var34 = new class15(arg0, 1, arg1, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class66.method439(arg6, arg2, arg7, var20, var34, (class235) null, class38.field785[arg1], 0, var25);
                if (var11.field1735 && arg4) {
                    if (arg1 == 0) {
                        class78.field1508[arg6][arg2][arg7 + 1] = 50;
                    } else if (arg1 == 1) {
                        class78.field1508[arg6][arg2 + 1][arg7 + 1] = 50;
                    } else if (arg1 != 2) {
                        if (~arg1 == -4) {
                            class78.field1508[arg6][arg2][arg7] = 50;
                        }
                    } else {
                        class78.field1508[arg6][arg2 - -1][arg7] = 50;
                    }
                }
                if (~var11.field1719 != -1 && arg5 != null) {
                    arg5.method894(arg1, arg2, arg9, (byte) -76, var11.field1714, arg7);
                }
            } else if (~arg9 == -3) {
                int var35 = 3 & arg1 + 1;
                class235 var37;
                class235 var39;
                if (~var11.field1727 == 0 && var11.field1746 == null) {
                    class159 var36 = var11.method595(27, var22, 2, var20, arg1 + 4, var19, var16, arg4);
                    var37 = var36.field2865;
                    class159 var38 = var11.method595(27, var22, 2, var20, var35, var19, var16, arg4);
                    var39 = var38.field2865;
                } else {
                    var37 = new class15(arg0, 2, arg1 + 4, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                    var39 = new class15(arg0, 2, var35, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class66.method439(arg6, arg2, arg7, var20, var37, var39, class222.field3850[arg1], class222.field3850[var35], var25);
                if (var11.field1740 && arg4) {
                    if (arg1 != 0) {
                        if (~arg1 == -2) {
                            class231.field4122[arg6][arg2][arg7 - -1] = class73.method479(class231.field4122[arg6][arg2][arg7 - -1], 1170);
                            class231.field4122[arg6][arg2 + 1][arg7] = class73.method479(class231.field4122[arg6][arg2 + 1][arg7], 585);
                        } else if (~arg1 != -3) {
                            if (arg1 == 3) {
                                class231.field4122[arg6][arg2][arg7] = class73.method479(class231.field4122[arg6][arg2][arg7], 1170);
                                class231.field4122[arg6][arg2][arg7] = class73.method479(class231.field4122[arg6][arg2][arg7], 585);
                            }
                        } else {
                            class231.field4122[arg6][arg2 + 1][arg7] = class73.method479(class231.field4122[arg6][arg2 + 1][arg7], 585);
                            class231.field4122[arg6][arg2][arg7] = class73.method479(class231.field4122[arg6][arg2][arg7], 1170);
                        }
                    } else {
                        class231.field4122[arg6][arg2][arg7] = class73.method479(class231.field4122[arg6][arg2][arg7], 585);
                        class231.field4122[arg6][arg2][arg7 + 1] = class73.method479(class231.field4122[arg6][arg2][arg7 + 1], 1170);
                    }
                }
                if (~var11.field1719 != -1 && arg5 != null) {
                    arg5.method894(arg1, arg2, arg9, (byte) -76, var11.field1714, arg7);
                }
                if (~var11.field1726 != -17) {
                    class218.method1364(arg6, arg2, arg7, var11.field1726);
                }
            } else if (~arg9 == -4) {
                class235 var41;
                if (var11.field1727 == -1 && var11.field1746 == null) {
                    class159 var40 = var11.method595(27, var22, 3, var20, arg1, var19, var16, arg4);
                    var41 = var40.field2865;
                } else {
                    var41 = new class15(arg0, 3, arg1, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class66.method439(arg6, arg2, arg7, var20, var41, (class235) null, class38.field785[arg1], 0, var25);
                if (var11.field1735 && arg4) {
                    if (~arg1 == -1) {
                        class78.field1508[arg6][arg2][arg7 - -1] = 50;
                    } else if (~arg1 == -2) {
                        class78.field1508[arg6][arg2 + 1][arg7 + 1] = 50;
                    } else if (~arg1 != -3) {
                        if (~arg1 == -4) {
                            class78.field1508[arg6][arg2][arg7] = 50;
                        }
                    } else {
                        class78.field1508[arg6][arg2 + 1][arg7] = 50;
                    }
                }
                if (~var11.field1719 != -1 && arg5 != null) {
                    arg5.method894(arg1, arg2, arg9, (byte) -76, var11.field1714, arg7);
                }
            } else if (~arg9 == -10) {
                class235 var43;
                if (~var11.field1727 == 0 && var11.field1746 == null) {
                    class159 var42 = var11.method595(27, var22, arg9, var20, arg1, var19, var16, arg4);
                    var43 = var42.field2865;
                } else {
                    var43 = new class15(arg0, arg9, arg1, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class154.method1010(arg6, arg2, arg7, var20, 1, 1, var43, 0, var25);
                if (var11.field1719 != 0 && arg5 != null) {
                    arg5.method889(arg7, var11.field1714, arg2, var12, var13, 113);
                }
                if (var11.field1726 != 16) {
                    class218.method1364(arg6, arg2, arg7, var11.field1726);
                }
            } else if (~arg9 == -5) {
                class235 var45;
                if (~var11.field1727 == 0 && var11.field1746 == null) {
                    class159 var44 = var11.method595(27, var22, 4, var20, arg1, var19, var16, arg4);
                    var45 = var44.field2865;
                } else {
                    var45 = new class15(arg0, 4, arg1, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class63.method426(arg6, arg2, arg7, var20, var45, (class235) null, class222.field3850[arg1], 0, 0, 0, var25, (class4) var21);
            } else if (arg9 == 5) {
                long var46 = class225.method1413(arg6, arg2, arg7);
                int var48 = 16;
                if (var46 != 0L) {
                    var48 = class5.method32((byte) 92, Integer.MAX_VALUE & (int) (var46 >>> 32)).field1726;
                }
                class235 var50;
                if (~var11.field1727 == 0 && var11.field1746 == null) {
                    class159 var49 = var11.method595(27, var22, 4, var20, arg1, var19, var16, arg4);
                    var50 = var49.field2865;
                } else {
                    var50 = new class15(arg0, 4, arg1, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class63.method426(arg6, arg2, arg7, var20, var50, (class235) null, class222.field3850[arg1], 0, class204.field3614[arg1] * var48, class191.field3386[arg1] * var48, var25, (class4) var21);
            } else if (arg9 == 6) {
                int var51 = 8;
                long var52 = class225.method1413(arg6, arg2, arg7);
                if (var52 != 0L) {
                    var51 = class5.method32((byte) 86, (int) (var52 >>> 32) & Integer.MAX_VALUE).field1726 / 2;
                }
                class235 var55;
                if (~var11.field1727 == 0 && var11.field1746 == null) {
                    class159 var54 = var11.method595(27, var22, 4, var20, arg1 + 4, var19, var16, arg4);
                    var55 = var54.field2865;
                } else {
                    var55 = new class15(arg0, 4, arg1 + 4, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class63.method426(arg6, arg2, arg7, var20, var55, (class235) null, 256, arg1, class90.field1651[arg1] * var51, class217.field3780[arg1] * var51, var25, (class4) var21);
            } else if (~arg9 == -8) {
                int var56 = arg1 + 2 & 3;
                class235 var58;
                if (var11.field1727 == -1 && var11.field1746 == null) {
                    class159 var57 = var11.method595(27, var22, 4, var20, var56 + 4, var19, var16, arg4);
                    var58 = var57.field2865;
                } else {
                    var58 = new class15(arg0, 4, var56 - -4, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class63.method426(arg6, arg2, arg7, var20, var58, (class235) null, 256, var56, 0, 0, var25, (class4) var21);
            } else if (arg9 == 8) {
                int var59 = 8;
                long var60 = class225.method1413(arg6, arg2, arg7);
                if (~var60 != -1L) {
                    var59 = class5.method32((byte) 88, Integer.MAX_VALUE & (int) (var60 >>> 32)).field1726 / 2;
                }
                int var62 = 3 & arg1 + 2;
                class235 var64;
                class235 var66;
                if (~var11.field1727 == 0 && var11.field1746 == null) {
                    class159 var63 = var11.method595(27, var22, 4, var20, arg1 - -4, var19, var16, arg4);
                    var64 = var63.field2865;
                    class159 var65 = var11.method595(27, var22, 4, var20, var62 + 4, var19, var16, arg4);
                    var66 = var65.field2865;
                } else {
                    var64 = new class15(arg0, 4, arg1 - -4, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                    var66 = new class15(arg0, 4, var62 + 4, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
                }
                class63.method426(arg6, arg2, arg7, var20, var64, var66, 256, arg1, class90.field1651[arg1] * var59, class217.field3780[arg1] * var59, var25, (class4) var21);
            }
        } else {
            class235 var68;
            if (~var11.field1727 == 0 && var11.field1746 == null) {
                class159 var67 = var11.method595(27, var22, 10, var20, arg1, var19, var16, arg4);
                var68 = var67.field2865;
            } else {
                var68 = new class15(arg0, 10, arg1, arg3, arg2, arg7, var11.field1727, var11.field1687, (class235) null);
            }
            if (var68 != null) {
                boolean var69 = class154.method1010(arg6, arg2, arg7, var20, var13, var12, var68, ~arg9 == -12 ? 256 : 0, var25);
                if (var11.field1735 && var69 && arg4) {
                    int var70 = 15;
                    if (var68 instanceof class18) {
                        var70 = ((class18) var68).method148() / 4;
                        if (~var70 < -31) {
                            var70 = 30;
                        }
                    }
                    for (int var71 = 0; var71 <= var13; ++var71) {
                        for (int var72 = 0; ~var12 <= ~var72; ++var72) {
                            if (~var70 < ~class78.field1508[arg6][arg2 + var71][arg7 + var72]) {
                                class78.field1508[arg6][arg2 + var71][arg7 + var72] = (byte) var70;
                            }
                        }
                    }
                }
            }
            if (~var11.field1719 != -1 && arg5 != null) {
                arg5.method889(arg7, var11.field1714, arg2, var12, var13, 113);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(JB)Loc;")
    public static final class151 method1018(long arg0, byte arg1) {
        ++field2803;
        int var3 = 28 % ((-5 - arg1) / 42);
        return class133.method819(arg0, -37, false, 10);
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
    public static void method1019(int arg0) {
        field2800 = null;
        if (arg0 <= 94) {
            method1017(-104, 106, 80, 126, false, (class138) null, -40, -78, true, 70, true);
        }
        field2813 = null;
        field2802 = null;
        field2810 = null;
        field2817 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public final void method2(int arg0) {
        ++field2806;
        if (arg0 != 3) {
            this.field2807 = null;
        }
        if (this.field2815 == null) {
            this.method1020(1, 81);
        }
        this.method1021((byte) -118);
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)V")
    private final void method1020(int arg0, int arg1) {
        ++field2801;
        if (arg1 < 59) {
            field2810 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field2815 = new int[4][4];
                                    this.field2815[0][0] = 2048;
                                    this.field2815[0][2] = 4096;
                                    this.field2815[0][3] = 0;
                                    this.field2815[1][2] = 4096;
                                    this.field2815[1][0] = 2867;
                                    this.field2815[2][2] = 4096;
                                    this.field2815[3][2] = 0;
                                    this.field2815[2][0] = 3276;
                                    this.field2815[1][3] = 0;
                                    this.field2815[2][3] = 0;
                                    this.field2815[0][1] = 0;
                                    this.field2815[3][0] = 4096;
                                    this.field2815[1][1] = 4096;
                                    this.field2815[2][1] = 4096;
                                    this.field2815[3][3] = 0;
                                    this.field2815[3][1] = 4096;
                                } else {
                                    throw new RuntimeException("Invalid gradient preset");
                                }
                            } else {
                                this.field2815 = new int[16][4];
                                this.field2815[0][0] = 0;
                                this.field2815[0][3] = 321;
                                this.field2815[1][3] = 562;
                                this.field2815[0][1] = 80;
                                this.field2815[1][1] = 321;
                                this.field2815[0][2] = 192;
                                this.field2815[1][2] = 449;
                                this.field2815[2][3] = 803;
                                this.field2815[3][3] = 1140;
                                this.field2815[4][3] = 1509;
                                this.field2815[5][3] = 1413;
                                this.field2815[1][0] = 155;
                                this.field2815[2][1] = 578;
                                this.field2815[3][1] = 947;
                                this.field2815[2][2] = 690;
                                this.field2815[4][1] = 1285;
                                this.field2815[6][3] = 1333;
                                this.field2815[5][1] = 1525;
                                this.field2815[7][3] = 1702;
                                this.field2815[2][0] = 389;
                                this.field2815[6][1] = 1734;
                                this.field2815[3][0] = 671;
                                this.field2815[8][3] = 2056;
                                this.field2815[3][2] = 995;
                                this.field2815[7][1] = 1413;
                                this.field2815[9][3] = 2666;
                                this.field2815[10][3] = 3276;
                                this.field2815[8][1] = 1108;
                                this.field2815[11][3] = 3228;
                                this.field2815[12][3] = 3196;
                                this.field2815[4][2] = 1397;
                                this.field2815[13][3] = 3019;
                                this.field2815[9][1] = 1766;
                                this.field2815[5][2] = 1429;
                                this.field2815[14][3] = 3228;
                                this.field2815[10][1] = 2409;
                                this.field2815[15][3] = 2746;
                                this.field2815[6][2] = 1461;
                                this.field2815[7][2] = 1525;
                                this.field2815[8][2] = 1590;
                                this.field2815[11][1] = 3116;
                                this.field2815[12][1] = 3806;
                                this.field2815[9][2] = 2056;
                                this.field2815[10][2] = 2586;
                                this.field2815[11][2] = 3148;
                                this.field2815[12][2] = 3710;
                                this.field2815[13][1] = 3437;
                                this.field2815[13][2] = 3421;
                                this.field2815[4][0] = 897;
                                this.field2815[14][1] = 3116;
                                this.field2815[14][2] = 3148;
                                this.field2815[15][2] = 2505;
                                this.field2815[5][0] = 1175;
                                this.field2815[15][1] = 2377;
                                this.field2815[6][0] = 1368;
                                this.field2815[7][0] = 1507;
                                this.field2815[8][0] = 1736;
                                this.field2815[9][0] = 2088;
                                this.field2815[10][0] = 2355;
                                this.field2815[11][0] = 2691;
                                this.field2815[12][0] = 3031;
                                this.field2815[13][0] = 3522;
                                this.field2815[14][0] = 3727;
                                this.field2815[15][0] = 4096;
                            }
                        } else {
                            this.field2815 = new int[6][4];
                            this.field2815[0][2] = 0;
                            this.field2815[1][2] = 0;
                            this.field2815[2][2] = 0;
                            this.field2815[0][3] = 0;
                            this.field2815[3][2] = 1124;
                            this.field2815[1][3] = 1493;
                            this.field2815[4][2] = 3084;
                            this.field2815[0][1] = 0;
                            this.field2815[2][3] = 2939;
                            this.field2815[0][0] = 0;
                            this.field2815[1][0] = 1843;
                            this.field2815[2][0] = 2457;
                            this.field2815[5][2] = 4096;
                            this.field2815[3][3] = 3565;
                            this.field2815[3][0] = 2781;
                            this.field2815[4][0] = 3481;
                            this.field2815[5][0] = 4096;
                            this.field2815[1][1] = 0;
                            this.field2815[4][3] = 4031;
                            this.field2815[2][1] = 0;
                            this.field2815[3][1] = 0;
                            this.field2815[5][3] = 4096;
                            this.field2815[4][1] = 546;
                            this.field2815[5][1] = 4096;
                        }
                    } else {
                        this.field2815 = new int[7][4];
                        this.field2815[0][2] = 0;
                        this.field2815[0][3] = 4096;
                        this.field2815[1][3] = 4096;
                        this.field2815[2][3] = 0;
                        this.field2815[0][0] = 0;
                        this.field2815[0][1] = 0;
                        this.field2815[1][1] = 0;
                        this.field2815[1][2] = 4096;
                        this.field2815[1][0] = 663;
                        this.field2815[2][0] = 1363;
                        this.field2815[3][0] = 2048;
                        this.field2815[2][1] = 0;
                        this.field2815[3][3] = 0;
                        this.field2815[4][3] = 0;
                        this.field2815[5][3] = 4096;
                        this.field2815[4][0] = 2727;
                        this.field2815[5][0] = 3411;
                        this.field2815[2][2] = 4096;
                        this.field2815[6][0] = 4096;
                        this.field2815[6][3] = 4096;
                        this.field2815[3][1] = 4096;
                        this.field2815[3][2] = 4096;
                        this.field2815[4][2] = 0;
                        this.field2815[4][1] = 4096;
                        this.field2815[5][2] = 0;
                        this.field2815[6][2] = 0;
                        this.field2815[5][1] = 4096;
                        this.field2815[6][1] = 0;
                    }
                } else {
                    this.field2815 = new int[8][4];
                    this.field2815[0][1] = 2650;
                    this.field2815[0][3] = 2361;
                    this.field2815[1][3] = 1558;
                    this.field2815[0][2] = 2602;
                    this.field2815[0][0] = 0;
                    this.field2815[1][1] = 2313;
                    this.field2815[1][0] = 2867;
                    this.field2815[2][1] = 2618;
                    this.field2815[2][0] = 3072;
                    this.field2815[2][3] = 1413;
                    this.field2815[3][1] = 2296;
                    this.field2815[1][2] = 1799;
                    this.field2815[4][1] = 2072;
                    this.field2815[5][1] = 2730;
                    this.field2815[3][3] = 947;
                    this.field2815[2][2] = 1734;
                    this.field2815[3][2] = 1220;
                    this.field2815[4][3] = 722;
                    this.field2815[6][1] = 2232;
                    this.field2815[3][0] = 3276;
                    this.field2815[4][2] = 963;
                    this.field2815[5][2] = 2152;
                    this.field2815[7][1] = 1686;
                    this.field2815[6][2] = 1060;
                    this.field2815[4][0] = 3481;
                    this.field2815[5][3] = 1766;
                    this.field2815[7][2] = 1413;
                    this.field2815[5][0] = 3686;
                    this.field2815[6][3] = 915;
                    this.field2815[7][3] = 1140;
                    this.field2815[6][0] = 3891;
                    this.field2815[7][0] = 4096;
                }
            } else {
                this.field2815 = new int[2][4];
                this.field2815[0][0] = 0;
                this.field2815[0][2] = 0;
                this.field2815[1][0] = 4096;
                this.field2815[0][1] = 0;
                this.field2815[0][3] = 0;
                this.field2815[1][1] = 4096;
                this.field2815[1][3] = 4096;
                this.field2815[1][2] = 4096;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        int[][] var3 = super.field13.method578(arg0, arg1 + 80);
        ++field2814;
        if (super.field13.field1658) {
            int[] var4 = this.method4(arg0, -125, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; class202.field3603 > var8; ++var8) {
                int var9 = var4[var8] >> 4;
                if (~var9 > -1) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2807[var9];
                var5[var8] = class26.method206(var10 >> 12, 4080);
                var6[var8] = class26.method206(var10 >> 4, 4080);
                var7[var8] = class26.method206(255, var10) << 4;
            }
        }
        return arg1 != -81 ? null : var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILwa;)V")
    public final void method13(int arg0, int arg1, class229 arg2) {
        if (~arg1 == -1) {
            int var4 = arg2.method1475(255);
            if (~var4 == -1) {
                this.field2815 = new int[arg2.method1475(255)][4];
                for (int var5 = 0; ~var5 > ~this.field2815.length; ++var5) {
                    this.field2815[var5][0] = arg2.method1490((byte) 73);
                    this.field2815[var5][1] = arg2.method1475(class112.method675(arg0, 255)) << 4;
                    this.field2815[var5][2] = arg2.method1475(255) << 4;
                    this.field2815[var5][3] = arg2.method1475(255) << 4;
                }
            } else {
                this.method1020(var4, 73);
            }
        }
        if (arg0 != 0) {
            field2804 = 39;
        }
        ++field2808;
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(B)V")
    private final void method1021(byte arg0) {
        ++field2809;
        if (arg0 != -118) {
            method1018(91L, (byte) 77);
        }
        int var2 = this.field2815.length;
        if (~var2 < -1) {
            for (int var3 = 0; ~var3 > -258; ++var3) {
                int var4 = 0;
                int var5 = var3 << 4;
                for (int var6 = 0; var2 > var6 && var5 >= this.field2815[var6][0]; ++var6) {
                    ++var4;
                }
                int var8;
                int var9;
                int var10;
                if (var4 < var2) {
                    int[] var7 = this.field2815[var4];
                    if (~var4 >= -1) {
                        var8 = var7[1];
                        var9 = var7[2];
                        var10 = var7[3];
                    } else {
                        int[] var11 = this.field2815[var4 + -1];
                        int var12 = (-var11[0] + var5 << 12) / (var7[0] + -var11[0]);
                        int var13 = -var12 + 4096;
                        var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                        var9 = var7[2] * var12 - -(var11[2] * var13) >> 12;
                        var10 = var7[3] * var12 - -(var11[3] * var13) >> 12;
                    }
                } else {
                    int[] var14 = this.field2815[var2 + -1];
                    var8 = var14[1];
                    var10 = var14[3];
                    var9 = var14[2];
                }
                int var15 = var9 >> 4;
                int var16 = var8 >> 4;
                if (~var15 <= -1) {
                    if (var15 > 255) {
                        var15 = 255;
                    }
                } else {
                    var15 = 0;
                }
                int var17 = var10 >> 4;
                if (~var16 > -1) {
                    var16 = 0;
                } else if (~var16 < -256) {
                    var16 = 255;
                }
                if (var17 < 0) {
                    var17 = 0;
                } else if (~var17 < -256) {
                    var17 = 255;
                }
                this.field2807[var3] = class73.method479(var17, class73.method479(var16 << 16, var15 << 8));
            }
        }
    }
}
