import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class105 extends class256 {

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "[B")
    public static byte[] field2008 = new byte[520];

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "Ljd;")
    public static class86 field2004 = class122.method868("(U (X", true);

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "Ljd;")
    private static class86 field2009 = class122.method868(" more options", true);

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "Ljd;")
    public static class86 field2002 = field2009;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static volatile int field2014 = -1;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public int field2006;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "Lbj;")
    public static class151 field2011;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "Lre;")
    public static class212 field2018;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "Ljd;")
    public class86 field2007;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)I")
    public static final int method747(byte arg0, int arg1) {
        field2016++;
        return arg0 == 52 ? arg1 >>> 8 : 43;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V")
    public static final void method748(int arg0, int arg1, int arg2, int arg3) {
        class6 var4 = class229.method1596(arg1, arg2, (byte) -27);
        if (var4 != null && var4.field239 != null) {
            class55 var5 = new class55();
            var5.field1114 = var4;
            var5.field1128 = var4.field239;
            class59.method427(var5, 200000);
        }
        class8.field259 = arg0;
        if (arg3 != 1) {
            method750(true);
        }
        class11.field336 = true;
        class20.field526 = arg1;
        class226.field4095 = arg2;
        field2015++;
        class62.method441(arg3 ^ 0xFFFF8CD6, var4);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIZIIIIIIII)Z")
    public static final boolean method749(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class58.field1172[var12][var31] = 0;
                class133.field2533[var12][var31] = 99999999;
            }
        }
        int var13 = arg0;
        class58.field1172[arg0][arg8] = 99;
        class133.field2533[arg0][arg8] = 0;
        field2012++;
        int var14 = arg8;
        int var15 = 0;
        byte var16 = 0;
        boolean var17 = false;
        class111.field2124[var16] = arg0;
        int var32 = var16 + 1;
        class164.field3068[var16] = arg8;
        int[][] var18 = class122.field2388[class180.field3244].field300;
        while (var15 != var32) {
            var13 = class111.field2124[var15];
            var14 = class164.field3068[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg2 == var13 && arg4 == var14) {
                var17 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class122.field2388[class180.field3244].method66(var13, 2, arg6 - 1, arg7, true, arg4, arg2, var14)) {
                    var17 = true;
                    break;
                }
                if (arg6 < 10 && class122.field2388[class180.field3244].method70(2, (byte) 18, var14, arg7, var13, arg4, arg6 - 1, arg2)) {
                    var17 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg9 != 0 && class122.field2388[class180.field3244].method78(arg4, false, arg5, arg11, arg9, var14, arg2, 2, var13)) {
                var17 = true;
                break;
            }
            int var30 = class133.field2533[var13][var14] + 1;
            if (var13 > 0 && class58.field1172[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class111.field2124[var32] = var13 - 1;
                class164.field3068[var32] = var14;
                class58.field1172[var13 - 1][var14] = 2;
                var32 = var32 + 1 & 0xFFF;
                class133.field2533[var13 - 1][var14] = var30;
            }
            if (var13 < 102 && class58.field1172[var13 + 1][var14] == 0 && (var18[var13 + 2][var14] & 0x12C0183) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class111.field2124[var32] = var13 + 1;
                class164.field3068[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class58.field1172[var13 + 1][var14] = 8;
                class133.field2533[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class58.field1172[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class111.field2124[var32] = var13;
                class164.field3068[var32] = var14 - 1;
                class58.field1172[var13][var14 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class133.field2533[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && class58.field1172[var13][var14 + 1] == 0 && (var18[var13][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class111.field2124[var32] = var13;
                class164.field3068[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class58.field1172[var13][var14 + 1] = 4;
                class133.field2533[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class58.field1172[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14] & 0x12C0138) == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13][var14 - 1] & 0x12C0183) == 0) {
                class111.field2124[var32] = var13 - 1;
                class164.field3068[var32] = var14 - 1;
                class58.field1172[var13 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class133.field2533[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 102 && var14 > 0 && class58.field1172[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var14] & 0x12C01E0) == 0) {
                class111.field2124[var32] = var13 + 1;
                class164.field3068[var32] = var14 - 1;
                class58.field1172[var13 + 1][var14 - 1] = 9;
                class133.field2533[var13 + 1][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 > 0 && var14 < 102 && class58.field1172[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13][var14 + 2] & 0x12C01E0) == 0) {
                class111.field2124[var32] = var13 - 1;
                class164.field3068[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class58.field1172[var13 - 1][var14 + 1] = 6;
                class133.field2533[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class58.field1172[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class111.field2124[var32] = var13 + 1;
                class164.field3068[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class58.field1172[var13 + 1][var14 + 1] = 12;
                class133.field2533[var13 + 1][var14 + 1] = var30;
            }
        }
        class203.field3682 = 0;
        if (!var17) {
            if (!arg3) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg2 - var21; var22 <= arg2 + var21; var22++) {
                for (int var23 = arg4 - var21; var23 <= arg4 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class133.field2533[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var22 < arg2) {
                            var24 = arg2 - var22;
                        } else if (var22 > arg2 + arg11 - 1) {
                            var24 = var22 + 1 - arg2 - arg11;
                        }
                        if (var23 < arg4) {
                            var25 = arg4 - var23;
                        } else if (arg9 + arg4 - 1 < var23) {
                            var25 = var23 + 1 - arg9 - arg4;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var20 > var26 || var20 == var26 && var19 > class133.field2533[var22][var23]) {
                            var14 = var23;
                            var19 = class133.field2533[var22][var23];
                            var13 = var22;
                            var20 = var26;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg0 == var13 && arg8 == var14) {
                return false;
            }
            class203.field3682 = 1;
        }
        class111.field2124[arg1] = var13;
        int var27 = arg1 + 1;
        class164.field3068[arg1] = var14;
        int var28;
        int var29 = var28 = class58.field1172[var13][var14];
        while (arg0 != var13 || arg8 != var14) {
            if (var28 != var29) {
                class111.field2124[var27] = var13;
                var28 = var29;
                class164.field3068[var27++] = var14;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class58.field1172[var13][var14];
        }
        if (var27 > 0) {
            class118.method844(var27, -1, arg10);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public static void method750(boolean arg0) {
        field2009 = null;
        field2002 = null;
        field2008 = null;
        if (arg0) {
            field2011 = null;
            field2004 = null;
            field2018 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZLqk;)V")
    public final void method751(boolean arg0, class200 arg1) {
        if (arg0) {
            this.method754(-120);
        }
        field2013++;
        while (true) {
            int var3 = arg1.method1408((byte) -84);
            if (var3 == 0) {
                return;
            }
            this.method752(var3, -69, arg1);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILqk;)V")
    private final void method752(int arg0, int arg1, class200 arg2) {
        field2003++;
        if (arg1 > -36) {
            return;
        }
        if (arg0 == 1) {
            this.field2005 = arg2.method1408((byte) -118);
        } else if (arg0 == 2) {
            this.field2006 = arg2.method1386(-4603);
        } else if (arg0 == 5) {
            this.field2007 = arg2.method1376((byte) 24);
            return;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(IIII)Z")
    public static final boolean method753(int arg0, int arg1, int arg2, int arg3) {
        if (class230.method1600(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class55.method406(var4 + 1, class35.field796[arg0][arg1][arg2] + arg3, var5 + 1) && class55.method406(var4 + 128 - 1, class35.field796[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class55.method406(var4 + 128 - 1, class35.field796[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class55.method406(var4 + 1, class35.field796[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)Z")
    public final boolean method754(int arg0) {
        field2017++;
        if (arg0 != -116) {
            field2008 = null;
        }
        return this.field2005 == 115;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
    public static final void method755(int arg0, int arg1) {
        field2010++;
        if (arg0 >= -110) {
            field2004 = null;
        }
        if (class179.method1258(arg1, (byte) -36)) {
            class181.method1263(-1, class108.field2070[arg1], (byte) 113);
        }
    }
}
