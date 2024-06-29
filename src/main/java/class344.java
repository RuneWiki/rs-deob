import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class344 {

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "Lof;")
    private class620 field4463 = new class620(128);

    @OriginalMember(owner = "client!afa", name = "p", descriptor = "Lof;")
    public class620 field4475 = new class620(64);

    @OriginalMember(owner = "client!afa", name = "h", descriptor = "Loh;")
    private class404 field4467;

    @OriginalMember(owner = "client!afa", name = "n", descriptor = "Loh;")
    public class404 field4473;

    @OriginalMember(owner = "client!afa", name = "m", descriptor = "[Z")
    public static boolean[] field4472 = new boolean[100];

    @OriginalMember(owner = "client!afa", name = "o", descriptor = "Ltp;")
    public static class532 field4474 = null;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!afa", name = "i", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!afa", name = "j", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!afa", name = "k", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "J")
    public static long field4461;

    @OriginalMember(owner = "client!afa", name = "l", descriptor = "Ldia;")
    public static class233 field4471;

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "Lsb;")
    public static class290 field4466;

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ILbda;III)V", line = 3)
    public static final void method2049(int arg0, class504 arg1, int arg2, int arg3, int arg4) {
        field4469++;
        if (arg2 != 1081) {
            method2050((byte) 110);
        }
        class255 var5 = arg1.method2992(-1);
        int var6 = arg1.field7177 - arg1.field7166.field10401 & 0x3FFF;
        if (arg0 == -1) {
            if (var6 != 0 || arg1.field7160 > 25) {
                if (arg4 < 0 && var5.field3118 != -1) {
                    arg1.field7122 = false;
                    arg1.field7147 = var5.field3118;
                } else if (arg4 <= 0 || var5.field3067 == -1) {
                    arg1.field7147 = var5.field3104;
                } else {
                    arg1.field7147 = var5.field3067;
                }
                arg1.field7122 = false;
            } else if (!arg1.field7122 || !var5.method1519(-1, arg1.field7147)) {
                arg1.field7147 = var5.method1522((byte) -63);
                arg1.field7122 = arg1.field7147 != -1;
            }
        } else if (arg1.field7148 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class682.field9651[arg3] - arg1.field7166.field10401 & 0x3FFF;
            if (arg0 == 2 && var5.field3081 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3105 != -1) {
                    arg1.field7147 = var5.field3105;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3090 != -1) {
                    arg1.field7147 = var5.field3090;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3094 == -1) {
                    arg1.field7147 = var5.field3081;
                } else {
                    arg1.field7147 = var5.field3094;
                }
            } else if (arg0 == 0 && var5.field3119 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3116 != -1) {
                    arg1.field7147 = var5.field3116;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3107 != -1) {
                    arg1.field7147 = var5.field3107;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3084 == -1) {
                    arg1.field7147 = var5.field3119;
                } else {
                    arg1.field7147 = var5.field3084;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field3087 != -1) {
                arg1.field7147 = var5.field3087;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field3109 != -1) {
                arg1.field7147 = var5.field3109;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field3098 == -1) {
                arg1.field7147 = var5.field3104;
            } else {
                arg1.field7147 = var5.field3098;
            }
            arg1.field7122 = false;
        } else if (var6 == 0 && arg1.field7160 <= 25) {
            if (arg0 == 2 && var5.field3081 != -1) {
                arg1.field7147 = var5.field3081;
            } else if (arg0 == 0 && var5.field3119 != -1) {
                arg1.field7147 = var5.field3119;
            } else {
                arg1.field7147 = var5.field3104;
            }
            arg1.field7122 = false;
        } else {
            arg1.field7122 = false;
            if (arg0 == 2 && var5.field3081 != -1) {
                if (arg4 < 0 && var5.field3101 != -1) {
                    arg1.field7147 = var5.field3101;
                } else if (arg4 <= 0 || var5.field3077 == -1) {
                    arg1.field7147 = var5.field3081;
                } else {
                    arg1.field7147 = var5.field3077;
                }
            } else if (arg0 == 0 && var5.field3119 != -1) {
                if (arg4 < 0 && var5.field3078 != -1) {
                    arg1.field7147 = var5.field3078;
                } else if (arg4 <= 0 || var5.field3079 == -1) {
                    arg1.field7147 = var5.field3119;
                } else {
                    arg1.field7147 = var5.field3079;
                }
            } else if (arg4 < 0 && var5.field3102 != -1) {
                arg1.field7147 = var5.field3102;
            } else if (arg4 <= 0 || var5.field3108 == -1) {
                arg1.field7147 = var5.field3104;
            } else {
                arg1.field7147 = var5.field3108;
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V", line = 168)
    public static void method2050(byte arg0) {
        field4466 = null;
        field4472 = null;
        field4474 = null;
        field4471 = null;
        if (arg0 != 80) {
            field4461 = -86L;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIIIIIII)V", line = 181)
    public static final void method2051(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4468++;
        class212.method1259(arg1, arg8, arg3, arg5, arg2, 0, (byte) 102, arg0, arg6, arg7);
        if (arg4 != -14870) {
            method2051(22, 69, 118, -82, -67, 50, 37, 37, -75);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(BI)V", line = 197)
    public final void method2052(byte arg0, int arg1) {
        class620 var3 = this.field4463;
        synchronized (this.field4463) {
            this.field4463.method3539((byte) 115, arg1);
        }
        if (arg0 >= -50) {
            field4472 = null;
        }
        field4470++;
        class620 var4 = this.field4475;
        synchronized (this.field4475) {
            this.field4475.method3539((byte) -61, arg1);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V", line = 214)
    public final void method2053(int arg0) {
        field4462++;
        class620 var2 = this.field4463;
        synchronized (this.field4463) {
            if (arg0 > -44) {
                return;
            }
            this.field4463.method3541(-647);
        }
        class620 var3 = this.field4475;
        synchronized (this.field4475) {
            this.field4475.method3541(-647);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(II)Laia;", line = 233)
    public final class228 method2054(int arg0, int arg1) {
        field4464++;
        class620 var3 = this.field4463;
        class228 var4;
        synchronized (this.field4463) {
            var4 = (class228) this.field4463.method3538((long) arg1, arg0 ^ arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field4467;
        byte[] var6;
        synchronized (this.field4467) {
            var6 = this.field4467.method2481(36, arg1, (byte) 119);
        }
        class228 var7 = new class228();
        var7.field2617 = this;
        var7.field2655 = arg1;
        if (var6 != null) {
            var7.method1314(new class244(var6), 20942);
        }
        var7.method1319(-2181);
        class620 var8 = this.field4463;
        synchronized (this.field4463) {
            this.field4463.method3537(-127, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V", line = 266)
    public final void method2055(int arg0) {
        int var2 = 39 / ((2 - arg0) / 54);
        class620 var3 = this.field4463;
        synchronized (this.field4463) {
            this.field4463.method3549(0);
        }
        field4465++;
        class620 var4 = this.field4475;
        synchronized (this.field4475) {
            this.field4475.method3549(0);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZII)V", line = 283)
    public final void method2056(boolean arg0, int arg1, int arg2) {
        field4460++;
        this.field4463 = new class620(arg2);
        if (arg0) {
            this.field4475 = new class620(arg1);
        }
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lnb;ILoh;Loh;)V", line = 313)
    public class344(class301 arg0, int arg1, class404 arg2, class404 arg3) {
        this.field4467 = arg2;
        this.field4473 = arg3;
        this.field4467.method2482(0, 36);
    }
}
