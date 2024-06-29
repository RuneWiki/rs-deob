import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class139 {

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "[I")
    public static int[] field1907 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Ljn;")
    public static class409 field1908;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "Lvq;")
    public static class24 field1910;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V")
    public static void method919(boolean arg0) {
        if (arg0) {
            field1910 = null;
        }
        field1907 = null;
        field1910 = null;
        field1908 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([Lkg;IZIBI)V")
    public static final void method920(class223[] arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 102) {
            field1908 = null;
        }
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class223 var7 = arg0[var6];
            if (var7 != null && var7.field3319 == arg1) {
                class187.method1278((byte) 120, arg5, arg3, arg2, var7);
                class227.method1558((byte) -104, var7, arg5, arg3);
                if (var7.field3214 > (var7.field3218 - var7.field3233)) {
                    var7.field3214 = var7.field3218 - var7.field3233;
                }
                if (var7.field3318 - var7.field3352 < var7.field3307) {
                    var7.field3307 = var7.field3318 - var7.field3352;
                }
                if (var7.field3214 < 0) {
                    var7.field3214 = 0;
                }
                if (var7.field3307 < 0) {
                    var7.field3307 = 0;
                }
                if (var7.field3216 == 0) {
                    class86.method581(arg2, arg4 - 207, var7);
                }
            }
        }
        field1906++;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIILds;Lds;)V")
    public static final void method921(int arg0, int arg1, int arg2, class233 arg3, class233 arg4) {
        class369 var5 = class186.method1275(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5327 = arg3;
            var5.field5334 = arg4;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)V")
    public static final void method922(boolean arg0, int arg1) {
        field1909++;
        if (class403.field5827 != arg0) {
            class403.field5827 = arg0;
            class248.method1650((byte) 93);
            int var2 = 63 % ((arg1 - 38) / 48);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
    public static final void method923(byte arg0) {
        if (arg0 >= -14) {
            return;
        }
        class363 var1 = class148.field2000;
        synchronized (class148.field2000) {
            class148.field2000.method2313(96);
        }
        field1905++;
        class363 var2 = class141.field1914;
        synchronized (class141.field1914) {
            class141.field1914.method2313(92);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIZIIII[ILth;IIII[I)I")
    public static final int method924(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, class175 arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14) {
        field1904++;
        if (arg13 != 2) {
            field1911 = 104;
        }
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class157.field2117[var15][var35] = 0;
                class443.field6448[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg12 == 1) {
            var16 = class136.method909(arg0, arg9, arg7, arg1, arg6, arg2, arg11, (byte) -119, arg10, arg4, arg5);
        } else if (arg12 == 2) {
            var16 = class131.method883(arg4, arg11, arg2, arg9, arg0, 111, arg10, arg5, arg1, arg7, arg6);
        } else {
            var16 = class79.method543(arg1, arg12, arg4, arg5, arg6, arg10, arg11, arg9, arg7, true, arg0, arg2);
        }
        int var17 = arg7 - 64;
        int var18 = arg10 - 64;
        int var19 = class106.field1431;
        int var20 = class369.field5349;
        if (!var16) {
            if (!arg3) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg4 - var23; var24 <= arg4 + var23; var24++) {
                for (int var25 = arg11 - var23; var25 <= (arg11 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class443.field6448[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg4 > var24) {
                            var28 = arg4 - var24;
                        } else if (var24 > arg4 + arg1 - 1) {
                            var28 = var24 + 1 - arg1 - arg4;
                        }
                        int var29 = 0;
                        if (arg11 > var25) {
                            var29 = arg11 - var25;
                        } else if ((arg11 + arg5 - 1) < var25) {
                            var29 = var25 - (arg11 - (1 - arg5));
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && class443.field6448[var26][var27] < var22) {
                            var21 = var30;
                            var22 = class443.field6448[var26][var27];
                            var20 = var25;
                            var19 = var24;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg7 == var19 && arg10 == var20) {
            return 0;
        }
        byte var31 = 0;
        class464.field6840[var31] = var19;
        int var37 = var31 + 1;
        class147.field1990[var31] = var20;
        int var32;
        int var33 = var32 = class157.field2117[var19 - var17][var20 - var18];
        while (arg7 != var19 || arg10 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class464.field6840[var37] = var19;
                class147.field1990[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class157.field2117[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg8[var34] = class464.field6840[var37];
            arg14[var34++] = class147.field1990[var37];
            if (var34 >= arg8.length) {
                break;
            }
        }
        return var34;
    }

    static {
        new class409((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field1908 = new class409("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");
        field1910 = new class24(86, 12);
    }
}
