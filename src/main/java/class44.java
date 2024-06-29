import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class44 extends class467 {

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Ljava/lang/String;")
    public String field652;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field654 = 0;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field656 = 0;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Lps;")
    public static final class5 method338(int arg0) {
        field657++;
        if (class135.field1967 == null || class266.field3711 == null) {
            return null;
        }
        int var1 = 28 / ((50 - arg0) / 38);
        class266.field3711.method73((byte) 48, class135.field1967);
        class5 var2 = (class5) class266.field3711.method72((byte) -33);
        if (var2 == null) {
            return null;
        } else {
            class24 var3 = class135.field1953.method356(-1, var2.field65);
            return var3 != null && var3.field374 && var3.method194((byte) 40, class135.field1954) ? var2 : class254.method1655(64);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method339(int arg0, byte[] arg1) {
        field653++;
        if (arg0 != -6145) {
            method339(-34, null);
        }
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class361.method2281(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILap;II)V")
    public static final void method340(int arg0, int arg1, class337 arg2, int arg3, int arg4) {
        field655++;
        if (arg3 != -3) {
            method338(23);
        }
        class219 var5 = arg2.method2181(0);
        int var6 = arg2.field5273 - arg2.field5319.field4989 & 0x3FFF;
        if (arg0 == -1) {
            if (var6 != 0 || arg2.field5305 > 25) {
                arg2.field5294 = false;
                if (arg1 < 0 && var5.field3067 != -1) {
                    arg2.field5253 = var5.field3067;
                } else if (arg1 <= 0 || var5.field3049 == -1) {
                    arg2.field5253 = var5.field3050;
                } else {
                    arg2.field5253 = var5.field3049;
                }
            } else if (!arg2.field5294 || !var5.method1482(arg2.field5253, 5)) {
                arg2.field5253 = var5.method1480((byte) -10);
                arg2.field5294 = arg2.field5253 != -1;
            }
        } else if (arg2.field5257 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class345.field5407[arg4] - arg2.field5319.field4989 & 0x3FFF;
            if (arg0 == 2 && var5.field3054 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3056 != -1) {
                    arg2.field5253 = var5.field3056;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3063 != -1) {
                    arg2.field5253 = var5.field3063;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3036 == -1) {
                    arg2.field5253 = var5.field3054;
                } else {
                    arg2.field5253 = var5.field3036;
                }
            } else if (arg0 == 0 && var5.field3052 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field3037 != -1) {
                    arg2.field5253 = var5.field3037;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field3044 != -1) {
                    arg2.field5253 = var5.field3044;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field3042 == -1) {
                    arg2.field5253 = var5.field3052;
                } else {
                    arg2.field5253 = var5.field3042;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field3060 != -1) {
                arg2.field5253 = var5.field3060;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field3070 != -1) {
                arg2.field5253 = var5.field3070;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field3072 == -1) {
                arg2.field5253 = var5.field3050;
            } else {
                arg2.field5253 = var5.field3072;
            }
            arg2.field5294 = false;
        } else if (var6 == 0 && arg2.field5305 <= 25) {
            if (arg0 == 2 && var5.field3054 != -1) {
                arg2.field5253 = var5.field3054;
            } else if (arg0 == 0 && var5.field3052 != -1) {
                arg2.field5253 = var5.field3052;
            } else {
                arg2.field5253 = var5.field3050;
            }
            arg2.field5294 = false;
        } else {
            if (arg0 == 2 && var5.field3054 != -1) {
                if (arg1 < 0 && var5.field3035 != -1) {
                    arg2.field5253 = var5.field3035;
                } else if (arg1 <= 0 || var5.field3053 == -1) {
                    arg2.field5253 = var5.field3054;
                } else {
                    arg2.field5253 = var5.field3053;
                }
            } else if (arg0 == 0 && var5.field3052 != -1) {
                if (arg1 < 0 && var5.field3066 != -1) {
                    arg2.field5253 = var5.field3066;
                } else if (arg1 <= 0 || var5.field3026 == -1) {
                    arg2.field5253 = var5.field3052;
                } else {
                    arg2.field5253 = var5.field3026;
                }
            } else if (arg1 < 0 && var5.field3075 != -1) {
                arg2.field5253 = var5.field3075;
            } else if (arg1 <= 0 || var5.field3028 == -1) {
                arg2.field5253 = var5.field3050;
            } else {
                arg2.field5253 = var5.field3028;
            }
            arg2.field5294 = false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class44() {
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class44(String arg0) {
        this.field652 = arg0;
    }
}
