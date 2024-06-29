import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class199 {

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field3288 = 0;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field3287 = 0;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Luf;")
    private static class168 field3290 = class148.method1019(-1720, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Luf;")
    public static class168 field3279 = field3290;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Luf;")
    private static class168 field3294 = class148.method1019(-1720, "Allocated memory");

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Luf;")
    public static class168 field3282 = field3294;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lgl;")
    public class279 field3281;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    public int[] field3284;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1399(byte arg0) {
        class226.field3666.method500(0);
        class28.field359.method1883(arg0 ^ 0x4B);
        class50.field609.method1883(5);
        if (arg0 == 78) {
            field3286++;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIB)V", line = 23)
    public static final void method1400(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3285++;
        int var6 = arg4;
        int var7 = 0;
        int var8 = arg3 * arg3;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = var9 - ((var12 - 1) * var11);
        int var14 = var8 << 2;
        int var15 = (1 - var12) * var8 + var10;
        int var16 = var9 << 2;
        int var17 = 21 % ((arg5 - 40) / 32);
        int var18 = (var7 + 1) * var16;
        int var19 = ((var7 << 1) + 3) * var10;
        int var20 = ((arg4 << 1) - 3) * var11;
        if (class9.field112 <= arg1 && class44.field538 >= arg1) {
            int var21 = class54.method301(class65.field874, arg0 + arg3, class150.field2331, -40);
            int var22 = class54.method301(class65.field874, arg0 - arg3, class150.field2331, 89);
            class133.method925(14678, var22, arg2, var21, class284.field4810[arg1]);
        }
        int var23 = (arg4 - 1) * var14;
        while (var6 > 0) {
            var6--;
            if (var15 < 0) {
                while (var15 < 0) {
                    var13 += var18;
                    var7++;
                    var15 += var19;
                    var18 += var16;
                    var19 += var16;
                }
            }
            int var24 = arg1 - var6;
            if (var13 < 0) {
                var7++;
                var15 += var19;
                var19 += var16;
                var13 += var18;
                var18 += var16;
            }
            var15 += -var23;
            int var25 = arg1 + var6;
            var23 -= var14;
            if (class9.field112 <= var25 && var24 <= class44.field538) {
                int var26 = class54.method301(class65.field874, arg0 + var7, class150.field2331, 73);
                int var27 = class54.method301(class65.field874, arg0 - var7, class150.field2331, 90);
                if (var24 >= class9.field112) {
                    class133.method925(14678, var27, arg2, var26, class284.field4810[var24]);
                }
                if (var25 <= class44.field538) {
                    class133.method925(14678, var27, arg2, var26, class284.field4810[var25]);
                }
            }
            var13 += -var20;
            var20 -= var14;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 132)
    public static void method1401(int arg0) {
        field3282 = null;
        if (arg0 != 1) {
            method1402((byte) -42);
        }
        field3290 = null;
        field3294 = null;
        field3279 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V", line = 149)
    public static final void method1402(byte arg0) {
        field3283++;
        if (arg0 != -122) {
            method1400(93, -34, 84, 9, -30, (byte) 0);
        }
        class156.field2465.method1429((byte) 120);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILg;ZIZ)V", line = 161)
    public static final void method1403(int arg0, class242 arg1, boolean arg2, int arg3, boolean arg4) {
        field3293++;
        int var5 = arg1.field3989;
        if (!arg4) {
            method1400(-18, 33, -34, 53, -118, (byte) 89);
        }
        int var6 = arg1.field4057;
        if (arg1.field3991 == 0) {
            arg1.field3989 = arg1.field4036;
        } else if (arg1.field3991 == 1) {
            arg1.field3989 = arg0 - arg1.field4036;
        } else if (arg1.field3991 == 2) {
            arg1.field3989 = arg1.field4036 * arg0 >> 14;
        } else if (arg1.field3991 == 3) {
            if (arg1.field4073 == 2) {
                arg1.field3989 = (arg1.field4036 - 1) * arg1.field3983 + arg1.field4036 * 32;
            } else if (arg1.field4073 == 7) {
                arg1.field3989 = (arg1.field4036 - 1) * arg1.field3983 + arg1.field4036 * 115;
            }
        }
        if (arg1.field4029 == 0) {
            arg1.field4057 = arg1.field4005;
        } else if (arg1.field4029 == 1) {
            arg1.field4057 = arg3 - arg1.field4005;
        } else if (arg1.field4029 == 2) {
            arg1.field4057 = arg1.field4005 * arg3 >> 14;
        } else if (arg1.field4029 == 3) {
            if (arg1.field4073 == 2) {
                arg1.field4057 = (arg1.field4005 - 1) * arg1.field3990 + arg1.field4005 * 32;
            } else if (arg1.field4073 == 7) {
                arg1.field4057 = (arg1.field4005 - 1) * arg1.field3990 + arg1.field4005 * 12;
            }
        }
        if (arg1.field3991 == 4) {
            arg1.field3989 = arg1.field4057 * arg1.field4050 / arg1.field3998;
        }
        if (arg1.field4029 == 4) {
            arg1.field4057 = arg1.field3998 * arg1.field3989 / arg1.field4050;
        }
        if (class245.field4165 && (client.method2015(arg1) != 0 || arg1.field4073 == 0)) {
            if (arg1.field4057 < 5 && arg1.field3989 < 5) {
                arg1.field3989 = 5;
                arg1.field4057 = 5;
            } else {
                if (arg1.field3989 <= 0) {
                    arg1.field3989 = 5;
                }
                if (arg1.field4057 <= 0) {
                    arg1.field4057 = 5;
                }
            }
        }
        if (arg1.field4115 == 1337) {
            class143.field2206 = arg1;
        }
        if (arg2 && arg1.field4000 != null && (arg1.field3989 != var5 || arg1.field4057 != var6)) {
            class182 var7 = new class182();
            var7.field2928 = arg1;
            var7.field2919 = arg1.field4000;
            class266.field4478.method451(-91453648, var7);
        }
    }
}
