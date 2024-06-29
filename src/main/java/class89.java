import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public int field2093 = 0;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public int field2104 = 0;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lne;")
    public static class95 field2102 = new class95(8);

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "Lv;")
    public static class146 field2114 = class159.method1226((byte) -37, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "Lv;")
    private static class146 field2118 = class159.method1226((byte) -37, "Connection lost");

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "Lv;")
    public static class146 field2117 = field2118;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "[I")
    public static int[] field2119 = new int[4000];

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public int field2096;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public int field2098;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public int field2101;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public int field2103;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
    public int field2106;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public int field2108;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public int field2110;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "Lab;")
    public static class3 field2113;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "Ljd;")
    public class66 field2094;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "[Lue;")
    public static class144[] field2116;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "[S")
    public static short[] field2111;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)Z")
    public static final boolean method704(boolean arg0, int arg1) {
        field2105++;
        if (arg1 < 32) {
            return false;
        }
        if (!arg0) {
            method705(null, -121, 78, 63, (byte) 80, -34, 85, -3, -26, null);
        }
        if (arg1 == 127) {
            return false;
        } else {
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lna;IIIBIIIILwc;)V")
    public static final void method705(class91 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, class156 arg9) {
        field2115++;
        class69 var10 = class124.method928(-1, arg3);
        int var11;
        int var12;
        if (arg2 == 1 || arg2 == 3) {
            var11 = var10.field1597;
            var12 = var10.field1584;
        } else {
            var11 = var10.field1584;
            var12 = var10.field1597;
        }
        int var13;
        int var14;
        if (arg8 + var11 <= 104) {
            var13 = (var11 >> 1) + arg8;
            var14 = (var11 + 1 >> 1) + arg8;
        } else {
            var14 = arg8 + 1;
            var13 = arg8;
        }
        int[][] var15 = class78.field1891[arg5];
        int var16;
        int var17;
        if (arg6 + var12 > 104) {
            var16 = arg6 + 1;
            var17 = arg6;
        } else {
            var16 = (var12 + 1 >> 1) + arg6;
            var17 = (var12 >> 1) + arg6;
        }
        int var18 = var15[var13][var16] + var15[var14][var16] + var15[var13][var17] + var15[var14][var17] >> 2;
        int var19 = (arg8 << 7) + (var11 << 6);
        int var20 = (arg2 << 6) + arg1;
        int var21 = (arg3 << 14) + (arg6 << 7) + arg8 + 1073741824;
        if (var10.field1605 == 0) {
            var21 += Integer.MIN_VALUE;
        }
        if (var10.field1618 == 1) {
            var20 += 256;
        }
        int var22 = (arg6 << 7) + (var12 << 6);
        if (arg1 == 22) {
            class66 var23;
            if (var10.field1567 == -1 && var10.field1598 == null) {
                var23 = var10.method499(var19, -50, var15, arg2, var22, 22, var18);
            } else {
                var23 = new class138(arg3, 22, arg2, arg5, arg8, arg6, var10.field1567, true, null);
            }
            arg9.method1207(arg7, arg8, arg6, var18, var23, var21, var20);
            if (var10.field1589 == 1) {
                arg0.method726(262144, arg6, arg8);
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class66 var46;
            if (var10.field1567 == -1 && var10.field1598 == null) {
                var46 = var10.method499(var19, -50, var15, arg2, var22, 10, var18);
            } else {
                var46 = new class138(arg3, 10, arg2, arg5, arg8, arg6, var10.field1567, true, null);
            }
            if (var46 != null) {
                arg9.method1173(arg7, arg8, arg6, var18, var11, var12, var46, arg1 == 11 ? 256 : 0, var21, var20);
            }
            if (var10.field1589 != 0) {
                arg0.method713(var11, var10.field1580, 91, arg6, arg8, var12);
            }
        } else if (arg4 > 64) {
            if (arg1 >= 12) {
                class66 var24;
                if (var10.field1567 == -1 && var10.field1598 == null) {
                    var24 = var10.method499(var19, -50, var15, arg2, var22, arg1, var18);
                } else {
                    var24 = new class138(arg3, arg1, arg2, arg5, arg8, arg6, var10.field1567, true, null);
                }
                arg9.method1173(arg7, arg8, arg6, var18, 1, 1, var24, 0, var21, var20);
                if (var10.field1589 != 0) {
                    arg0.method713(var11, var10.field1580, -93, arg6, arg8, var12);
                }
            } else if (arg1 == 0) {
                class66 var25;
                if (var10.field1567 == -1 && var10.field1598 == null) {
                    var25 = var10.method499(var19, -50, var15, arg2, var22, 0, var18);
                } else {
                    var25 = new class138(arg3, 0, arg2, arg5, arg8, arg6, var10.field1567, true, null);
                }
                arg9.method1209(arg7, arg8, arg6, var18, var25, null, class82.field1995[arg2], 0, var21, var20);
                if (var10.field1589 != 0) {
                    arg0.method715(arg8, var10.field1580, arg6, 22997, arg2, arg1);
                }
            } else if (arg1 == 1) {
                class66 var26;
                if (var10.field1567 == -1 && var10.field1598 == null) {
                    var26 = var10.method499(var19, -50, var15, arg2, var22, 1, var18);
                } else {
                    var26 = new class138(arg3, 1, arg2, arg5, arg8, arg6, var10.field1567, true, null);
                }
                arg9.method1209(arg7, arg8, arg6, var18, var26, null, class48.field1097[arg2], 0, var21, var20);
                if (var10.field1589 != 0) {
                    arg0.method715(arg8, var10.field1580, arg6, 22997, arg2, arg1);
                }
            } else if (arg1 == 2) {
                int var27 = arg2 + 1 & 0x3;
                class66 var28;
                class66 var29;
                if (var10.field1567 == -1 && var10.field1598 == null) {
                    var28 = var10.method499(var19, -50, var15, arg2 + 4, var22, 2, var18);
                    var29 = var10.method499(var19, -50, var15, var27, var22, 2, var18);
                } else {
                    var28 = new class138(arg3, 2, arg2 + 4, arg5, arg8, arg6, var10.field1567, true, null);
                    var29 = new class138(arg3, 2, var27, arg5, arg8, arg6, var10.field1567, true, null);
                }
                arg9.method1209(arg7, arg8, arg6, var18, var28, var29, class82.field1995[arg2], class82.field1995[var27], var21, var20);
                if (var10.field1589 != 0) {
                    arg0.method715(arg8, var10.field1580, arg6, 22997, arg2, arg1);
                }
            } else if (arg1 == 3) {
                class66 var30;
                if (var10.field1567 == -1 && var10.field1598 == null) {
                    var30 = var10.method499(var19, -50, var15, arg2, var22, 3, var18);
                } else {
                    var30 = new class138(arg3, 3, arg2, arg5, arg8, arg6, var10.field1567, true, null);
                }
                arg9.method1209(arg7, arg8, arg6, var18, var30, null, class48.field1097[arg2], 0, var21, var20);
                if (var10.field1589 != 0) {
                    arg0.method715(arg8, var10.field1580, arg6, 22997, arg2, arg1);
                }
            } else if (arg1 == 9) {
                class66 var31;
                if (var10.field1567 == -1 && var10.field1598 == null) {
                    var31 = var10.method499(var19, -50, var15, arg2, var22, arg1, var18);
                } else {
                    var31 = new class138(arg3, arg1, arg2, arg5, arg8, arg6, var10.field1567, true, null);
                }
                arg9.method1173(arg7, arg8, arg6, var18, 1, 1, var31, 0, var21, var20);
                if (var10.field1589 != 0) {
                    arg0.method713(var11, var10.field1580, 125, arg6, arg8, var12);
                }
            } else if (arg1 == 4) {
                class66 var32;
                if (var10.field1567 == -1 && var10.field1598 == null) {
                    var32 = var10.method499(var19, -50, var15, arg2, var22, 4, var18);
                } else {
                    var32 = new class138(arg3, 4, arg2, arg5, arg8, arg6, var10.field1567, true, null);
                }
                arg9.method1183(arg7, arg8, arg6, var18, var32, null, class82.field1995[arg2], 0, 0, 0, var21, var20);
            } else if (arg1 == 5) {
                int var33 = 16;
                int var34 = arg9.method1168(arg7, arg8, arg6);
                if (var34 != 0) {
                    var33 = class124.method928(-1, var34 >> 14 & 0x7FFF).field1593;
                }
                class66 var35;
                if (var10.field1567 == -1 && var10.field1598 == null) {
                    var35 = var10.method499(var19, -50, var15, arg2, var22, 4, var18);
                } else {
                    var35 = new class138(arg3, 4, arg2, arg5, arg8, arg6, var10.field1567, true, null);
                }
                arg9.method1183(arg7, arg8, arg6, var18, var35, null, class82.field1995[arg2], 0, class2.field43[arg2] * var33, class78.field1897[arg2] * var33, var21, var20);
            } else if (arg1 == 6) {
                int var36 = 8;
                int var37 = arg9.method1168(arg7, arg8, arg6);
                if (var37 != 0) {
                    var36 = class124.method928(-1, var37 >> 14 & 0x7FFF).field1593 / 2;
                }
                class66 var38;
                if (var10.field1567 == -1 && var10.field1598 == null) {
                    var38 = var10.method499(var19, -50, var15, arg2 + 4, var22, 4, var18);
                } else {
                    var38 = new class138(arg3, 4, arg2 + 4, arg5, arg8, arg6, var10.field1567, true, null);
                }
                arg9.method1183(arg7, arg8, arg6, var18, var38, null, 256, arg2, class22.field369[arg2] * var36, class92.field2214[arg2] * var36, var21, var20);
            } else if (arg1 == 7) {
                int var39 = arg2 + 2 & 0x3;
                class66 var40;
                if (var10.field1567 == -1 && var10.field1598 == null) {
                    var40 = var10.method499(var19, -50, var15, var39 + 4, var22, 4, var18);
                } else {
                    var40 = new class138(arg3, 4, var39 + 4, arg5, arg8, arg6, var10.field1567, true, null);
                }
                arg9.method1183(arg7, arg8, arg6, var18, var40, null, 256, var39, 0, 0, var21, var20);
            } else if (arg1 == 8) {
                int var41 = 8;
                int var42 = arg9.method1168(arg7, arg8, arg6);
                if (var42 != 0) {
                    var41 = class124.method928(-1, var42 >> 14 & 0x7FFF).field1593 / 2;
                }
                int var43 = arg2 + 2 & 0x3;
                class66 var44;
                class66 var45;
                if (var10.field1567 == -1 && var10.field1598 == null) {
                    var44 = var10.method499(var19, -50, var15, arg2 + 4, var22, 4, var18);
                    var45 = var10.method499(var19, -50, var15, var43 + 4, var22, 4, var18);
                } else {
                    var44 = new class138(arg3, 4, arg2 + 4, arg5, arg8, arg6, var10.field1567, true, null);
                    var45 = new class138(arg3, 4, var43 + 4, arg5, arg8, arg6, var10.field1567, true, null);
                }
                arg9.method1183(arg7, arg8, arg6, var18, var44, var45, 256, arg2, class22.field369[arg2] * var41, class92.field2214[arg2] * var41, var21, var20);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
    public static final void method706(int arg0, int arg1) {
        field2112++;
        class125 var2 = (class125) class124.field2868.method332((byte) -79, (long) arg0);
        if (arg1 != 3) {
            field2119 = null;
        }
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field2899.length; var3++) {
                var2.field2899[var3] = -1;
                var2.field2900[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)I")
    public static final int method707(int arg0, int arg1) {
        field2107++;
        int var7 = arg1 - 1;
        if (arg0 <= 99) {
            method705(null, -121, 47, -24, (byte) 72, -119, 45, 8, -74, null);
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method708(int arg0) {
        field2111 = null;
        field2117 = null;
        if (arg0 != 0) {
            field2114 = null;
        }
        field2102 = null;
        field2118 = null;
        field2113 = null;
        field2114 = null;
        field2116 = null;
        field2119 = null;
    }
}
