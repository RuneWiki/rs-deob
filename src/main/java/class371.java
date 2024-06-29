import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class371 {

    @OriginalMember(owner = "client!qba", name = "e", descriptor = "Lvh;")
    private class328 field5282 = new class328(64);

    @OriginalMember(owner = "client!qba", name = "g", descriptor = "Lpj;")
    private class132 field5284;

    @OriginalMember(owner = "client!qba", name = "i", descriptor = "Lfc;")
    public static class235 field5286 = new class235(81, -2);

    @OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
    public static int field5290 = 0;

    @OriginalMember(owner = "client!qba", name = "n", descriptor = "Lsu;")
    public static class192 field5291 = new class192();

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!qba", name = "d", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!qba", name = "f", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!qba", name = "h", descriptor = "I")
    public static int field5285;

    @OriginalMember(owner = "client!qba", name = "j", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!qba", name = "k", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!qba", name = "l", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field5278;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(I)V")
    public final void method2168(int arg0) {
        field5285++;
        class328 var2 = this.field5282;
        synchronized (this.field5282) {
            this.field5282.method1987(-31085);
        }
        if (arg0 > -57) {
            method2170(63, -11, null, true, null, false, 61, 54, -83, 93, null, -77, 80, -75, 36);
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(I)V")
    public static void method2169(int arg0) {
        field5291 = null;
        field5278 = null;
        field5286 = null;
        if (arg0 >= -18) {
            method2169(106);
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(IILiaa;Z[IZIIII[IIIII)I")
    public static final int method2170(int arg0, int arg1, class455 arg2, boolean arg3, int[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int[] arg10, int arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class134.field1900[var15][var35] = 0;
                class247.field3509[var15][var35] = 99999999;
            }
        }
        field5281++;
        boolean var16;
        if (arg13 == 1) {
            var16 = class645.method3595(arg2, arg1, arg12, arg9, arg7, arg11, arg6, arg0, arg14, arg8, -21812);
        } else if (arg13 == 2) {
            var16 = class196.method1324(arg8, -16457, arg0, arg1, arg14, arg9, arg7, arg6, arg11, arg2, arg12);
        } else {
            var16 = class561.method3108(arg6, arg0, arg11, arg12, arg9, arg14, arg13, arg8, 1, arg1, arg2, arg7);
        }
        int var17 = arg11 - 64;
        int var18 = arg8 - 64;
        int var19 = class588.field8206;
        int var20 = class63.field838;
        if (!var16) {
            if (!arg3) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg6 - var23; var24 <= arg6 + var23; var24++) {
                for (int var25 = arg1 - var23; var25 <= arg1 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class247.field3509[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg6 > var24) {
                            var28 = arg6 - var24;
                        } else if (var24 > arg6 + arg9 - 1) {
                            var28 = var24 + 1 - arg6 - arg9;
                        }
                        int var29 = 0;
                        if (arg1 > var25) {
                            var29 = arg1 - var25;
                        } else if ((arg7 + arg1 - 1) < var25) {
                            var29 = var25 + 1 - arg1 - arg7;
                        }
                        int var30 = var28 * var28 + (var29 * var29);
                        if (var21 > var30 || var21 == var30 && var22 > class247.field3509[var26][var27]) {
                            var21 = var30;
                            var20 = var25;
                            var19 = var24;
                            var22 = class247.field3509[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg11 == var19 && arg8 == var20) {
            return 0;
        }
        byte var31 = 0;
        if (arg5) {
            return -39;
        }
        class450.field6289[var31] = var19;
        int var37 = var31 + 1;
        class29.field360[var31] = var20;
        int var32;
        int var33 = var32 = class134.field1900[var19 - var17][var20 - var18];
        while (arg11 != var19 || arg8 != var20) {
            if (var32 != var33) {
                class450.field6289[var37] = var19;
                var32 = var33;
                class29.field360[var37++] = var20;
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
            var33 = class134.field1900[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg10[var34] = class450.field6289[var37];
            arg4[var34++] = class29.field360[var37];
            if (arg10.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(BI)Lwl;")
    public final class374 method2171(byte arg0, int arg1) {
        field5280++;
        if (arg0 != -80) {
            field5290 = -77;
        }
        class328 var3 = this.field5282;
        class374 var4;
        synchronized (this.field5282) {
            var4 = (class374) this.field5282.method1986((byte) -111, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field5284;
        byte[] var6;
        synchronized (this.field5284) {
            var6 = this.field5284.method940(11, arg1, arg0 + 80);
        }
        class374 var7 = new class374();
        if (var6 != null) {
            var7.method2181(new class96(var6), -14230);
        }
        class328 var8 = this.field5282;
        synchronized (this.field5282) {
            this.field5282.method1985(var7, (long) arg1, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)V")
    public final void method2172(int arg0, int arg1) {
        class328 var3 = this.field5282;
        synchronized (this.field5282) {
            this.field5282.method1989(arg0, (byte) 104);
        }
        if (arg1 == -16333) {
            field5289++;
        }
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(B)I")
    public static final int method2173(byte arg0) {
        field5279++;
        if (arg0 <= 111) {
            field5290 = -38;
        }
        return class351.method2084(0, false);
    }

    @OriginalMember(owner = "client!qba", name = "c", descriptor = "(I)V")
    public final void method2174(int arg0) {
        field5288++;
        class328 var2 = this.field5282;
        synchronized (this.field5282) {
            int var3 = -52 % ((-arg0 - 32) / 55);
            this.field5282.method1997(1);
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "(Ldd;ILpj;)V")
    public class371(class647 arg0, int arg1, class132 arg2) {
        this.field5284 = arg2;
        if (this.field5284 != null) {
            this.field5284.method936(11, -128);
        }
    }
}
