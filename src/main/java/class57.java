import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class57 {

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "Lnb;")
    public class137 field955 = new class137();

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Ljava/lang/String;")
    public static String field946 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Ljava/lang/String;")
    public static String field947 = "cyan:";

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "Lqd;")
    public static class173 field954 = new class173(50);

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
    public static int field957 = 1;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "Lnb;")
    private class137 field958;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[[B")
    public static byte[][] field956;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lka;")
    public static final class277 method387(int arg0, int arg1) {
        if (arg0 <= 63) {
            field956 = null;
        }
        field951++;
        class277 var2 = (class277) class206.field3273.method1261(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field566.method1680(arg1, 30, -121);
        class277 var4 = new class277();
        if (var3 != null) {
            var4.method1862(new class162(var3), arg1, 127);
        }
        class206.field3273.method1264(-1, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Loj;III)V")
    public static final void method388(class246 arg0, int arg1, int arg2, int arg3) {
        field945++;
        class94.field1523.method1650((byte) -119);
        if (class116.field1860) {
            return;
        }
        class269 var4 = (class269) arg0.method1643((byte) 125);
        int var5 = -76 / ((-arg1 - 42) / 61);
        while (var4 != null) {
            class50 var6 = class49.method346(var4.field4333, (byte) 55);
            if (class25.method141(true, var6)) {
                class272.method1821(var4, var6, arg2, arg3, -75);
                if (var4.field4331) {
                    class306.method2047(var6, var4, 92);
                }
            }
            var4 = (class269) arg0.method1642((byte) 119);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lnb;")
    public final class137 method389(int arg0) {
        field944++;
        class137 var2 = this.field955.field2173;
        if (arg0 != 0) {
            method388((class246) null, -52, 73, -46);
        }
        if (this.field955 == var2) {
            this.field958 = null;
            return null;
        } else {
            this.field958 = var2.field2173;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Lnb;")
    public final class137 method390(int arg0) {
        if (arg0 >= -10) {
            method388((class246) null, 62, -69, -76);
        }
        field948++;
        class137 var2 = this.field955.field2173;
        if (this.field955 == var2) {
            return null;
        } else {
            var2.method956(256);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZLwf;Ljh;Led;III)V")
    public static final void method391(int arg0, boolean arg1, class18 arg2, class269 arg3, class50 arg4, int arg5, int arg6, int arg7) {
        field953++;
        if (arg6 > -43) {
            field946 = null;
        }
        class140 var8 = null;
        if (arg4.field847 == 0) {
            if ((double) class275.field4418 == 3.0D) {
                var8 = class148.field2315;
            }
            if ((double) class275.field4418 == 4.0D) {
                var8 = class73.field1233;
            }
            if ((double) class275.field4418 == 6.0D) {
                var8 = class59.field968;
            }
            if ((double) class275.field4418 >= 8.0D) {
                var8 = class229.field3699;
            }
        } else if (arg4.field847 == 1) {
            if ((double) class275.field4418 == 3.0D) {
                var8 = class59.field968;
            }
            if ((double) class275.field4418 == 4.0D) {
                var8 = class229.field3699;
            }
            if ((double) class275.field4418 == 6.0D) {
                var8 = class149.field2325;
            }
            if ((double) class275.field4418 >= 8.0D) {
                var8 = class108.field1733;
            }
        } else if (arg4.field847 == 2) {
            if ((double) class275.field4418 == 3.0D) {
                var8 = class149.field2325;
            }
            if ((double) class275.field4418 == 4.0D) {
                var8 = class108.field1733;
            }
            if ((double) class275.field4418 == 6.0D) {
                var8 = class60.field983;
            }
            if ((double) class275.field4418 >= 8.0D) {
                var8 = class291.field4677;
            }
        }
        if (var8 == null) {
            return;
        }
        int var9 = arg4.field821;
        if (arg3.field4326 && arg4.field840 != -1) {
            var9 = arg4.field840;
        }
        int var10 = 0;
        int var11 = class78.field1311.method633(arg4.field819, (int[]) null, class72.field1216);
        int var12 = arg3.field4335;
        int var13;
        if (arg1) {
            var13 = var12 - var11 * var8.method982() / 2;
        } else {
            var13 = var12 - (arg0 + (var8.method989() * (var11 - 1)) + (var8.method982() / 2));
        }
        int var14 = var13 - var8.method982();
        int var15 = var13 + var8.method982() / 2;
        for (int var16 = 0; var16 < var11; var16++) {
            String var22 = class72.field1216[var16];
            if ((var11 - 1) > var16) {
                var22 = var22.substring(0, var22.length() - 4);
            }
            int var23 = var8.method983(var22);
            if (var10 < var23) {
                var10 = var23;
            }
        }
        arg2.field224 = arg3.field4327 + arg7 - (var10 / 2);
        arg2.field221 = var14 + arg5;
        arg2.field211 = var10 / 2 + arg3.field4327 + arg7;
        int var17 = var14 + 2;
        arg2.field223 = arg5 + (var14 + (var11 * var8.method989()));
        int var18 = arg3.field4327 - (var10 / 2) - 5;
        if (arg4.field827 != 0) {
            class127.method881(var18, var17, var10 + 10, var14 + 1 - -(var11 * var8.method989()) + -var17, arg4.field827, arg4.field827 >>> 24);
        }
        if (arg4.field846 != 0) {
            class127.method895(var18, var17, var10 + 10, -var17 + 1 + (var14 - -(var11 * var8.method989())), arg4.field846, arg4.field846 >>> 24);
        }
        for (int var19 = 0; var19 < var11; var19++) {
            String var20 = class72.field1216[var19];
            if (var11 - 1 > var19) {
                var20 = var20.substring(0, var20.length() - 4);
            }
            int var21 = var8.method983(var20);
            if (var21 > var10) {
                var10 = var21;
            }
            var8.method981(var20, arg3.field4327, var15, var9, true);
            var15 += var8.method989();
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V")
    public final void method392(int arg0) {
        field949++;
        if (arg0 != 1) {
            this.field958 = null;
        }
        while (true) {
            class137 var2 = this.field955.field2173;
            if (this.field955 == var2) {
                this.field958 = null;
                return;
            }
            var2.method956(256);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class108 var20 = new class108(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class218.field3584[var21][arg1][arg2] == null) {
                    class218.field3584[var21][arg1][arg2] = new class151(var21, arg1, arg2);
                }
            }
            class218.field3584[arg0][arg1][arg2].field2367 = var20;
        } else if (arg3 == 1) {
            class108 var22 = new class108(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class218.field3584[var23][arg1][arg2] == null) {
                    class218.field3584[var23][arg1][arg2] = new class151(var23, arg1, arg2);
                }
            }
            class218.field3584[arg0][arg1][arg2].field2367 = var22;
        } else {
            class154 var24 = new class154(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class218.field3584[var25][arg1][arg2] == null) {
                    class218.field3584[var25][arg1][arg2] = new class151(var25, arg1, arg2);
                }
            }
            class218.field3584[arg0][arg1][arg2].field2356 = var24;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method394(boolean arg0) {
        field956 = null;
        if (arg0) {
            method387(124, -74);
        }
        field947 = null;
        field954 = null;
        field946 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILnb;)V")
    public final void method395(int arg0, class137 arg1) {
        if (arg1.field2163 != null) {
            arg1.method956(256);
        }
        field950++;
        if (arg0 == 30985) {
            arg1.field2163 = this.field955.field2163;
            arg1.field2173 = this.field955;
            arg1.field2163.field2173 = arg1;
            arg1.field2173.field2163 = arg1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "(I)Lnb;")
    public final class137 method396(int arg0) {
        class137 var2 = this.field958;
        field952++;
        if (this.field955 == var2) {
            this.field958 = null;
            return null;
        }
        if (arg0 != 0) {
            field954 = null;
        }
        this.field958 = var2.field2173;
        return var2;
    }

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "(I)I")
    public final int method397(int arg0) {
        field943++;
        class137 var2 = this.field955.field2173;
        if (arg0 < 103) {
            return 20;
        }
        int var3 = 0;
        while (this.field955 != var2) {
            var3++;
            var2 = var2.field2173;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class57() {
        this.field955.field2163 = this.field955;
        this.field955.field2173 = this.field955;
    }
}
