import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class203 {

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public int field3272 = 0;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public int field3275 = 0;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "Z")
    private boolean field3269 = false;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field3262 = 2;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field3260 = 0;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "S")
    public static short field3264 = 32767;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field3256 = 0;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field3268 = 0;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "I")
    public static int field3276 = 0;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "Lbn;")
    public static class256 field3267 = new class256(16);

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    public static int field3277 = 0;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public int field3249;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    private int field3253;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public int field3257;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
    public int field3258;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "J")
    public long field3274;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ll", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field3278;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "[[Lne;")
    public static class172[][] field3266;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public final void method1442(int arg0) {
        if (arg0 != -1) {
            return;
        }
        this.field3265 = class258.field4173[this.field3253 << 3];
        field3255++;
        this.field3251 = (int) Math.sqrt((double) (this.field3249 * this.field3249 + this.field3259 * this.field3259 + this.field3257 * this.field3257));
        if (this.field3254 == 0) {
            this.field3254 = 1;
        }
        if (this.field3273 == 0) {
            this.field3274 = 2147483647L;
        } else if (this.field3273 == 1) {
            this.field3274 = (long) (this.field3251 * 8 / this.field3254);
            this.field3274 *= this.field3274;
        } else if (this.field3273 == 2) {
            this.field3274 = (long) (this.field3251 * 8 / this.field3254);
        }
        if (this.field3269) {
            this.field3251 *= -1;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)Lum;")
    public static final class306 method1443(int arg0, int arg1) {
        field3252++;
        class385[] var2 = class104.field1457;
        synchronized (class104.field1457) {
            class306 var3;
            if (arg1 >= class104.field1457.length || class104.field1457[arg1].method2437((byte) -100)) {
                var3 = new class306();
                var3.field4856 = new class170[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field4856[var4] = new class170();
                }
            } else {
                var3 = (class306) class104.field1457[arg1].method2440((byte) -98);
                var3.method2100(-106);
                int var10002 = class51.field630[arg1]--;
            }
            if (arg0 >= -31) {
                method1447(true);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLjg;)V")
    public final void method1444(byte arg0, class186 arg1) {
        field3261++;
        while (true) {
            int var3 = arg1.method1322(false);
            if (var3 == 0) {
                if (arg0 > -64) {
                    this.method1448(-49, (class186) null, -11);
                    return;
                } else {
                    return;
                }
            }
            this.method1448(-5, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lfn;ILe;IIIII)V")
    public static final void method1445(class72 arg0, int arg1, class312 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3271++;
        if (arg5 != -24909) {
            method1447(true);
        }
        class149 var8 = null;
        if (arg7 == 0) {
            var8 = (class149) class139.method1016(arg6, arg1, arg4);
        }
        if (arg7 == 1) {
            var8 = (class149) class238.method1684(arg6, arg1, arg4);
        }
        if (arg7 == 2) {
            var8 = (class149) class12.method117(arg6, arg1, arg4, field3278 == null ? (field3278 = method1449("up")) : field3278);
        }
        if (arg7 == 3) {
            var8 = (class149) class316.method2107(arg6, arg1, arg4);
        }
        if (var8 == null) {
            return;
        }
        int var9 = var8.method195(3076);
        int var10 = var8.method183((byte) -113);
        class127 var11 = class137.method1003(var8.method197(true), -30796);
        if (var11.method940(2)) {
            class222.method1588(arg4, arg1, arg6, var11, (byte) 1);
        }
        if (var8.method190((byte) -127)) {
            var8.method199(arg2, (byte) -22);
        }
        if (arg7 != 0) {
            if (arg7 == 1) {
                class281.method1915(arg6, arg1, arg4);
                return;
            }
            if (arg7 != 2) {
                if (arg7 == 3) {
                    class11.method105(arg6, arg1, arg4);
                    if (var11.field2027 == 1) {
                        arg0.method464(-262145, arg1, arg4);
                        return;
                    }
                }
                return;
            }
            class330.method2186(arg6, arg1, arg4, field3278 == null ? (field3278 = method1449("up")) : field3278);
            if (var11.field2027 != 0 && var11.field2014 + arg1 < class80.field1003 && class380.field5751 > var11.field2014 + arg4 && class80.field1003 > (var11.field1944 + arg1) && class380.field5751 > (arg4 + var11.field1944)) {
                arg0.method449(var11.field1993, arg5 + 17887, arg1, var11.field1944, var11.field2014, arg4, !var11.field1989, var10);
                return;
            }
            return;
        }
        class290.method1952(arg6, arg1, arg4);
        if (var11.field2027 != 0) {
            arg0.method458(arg5 ^ 0xFFFF9EB3, arg1, arg4, var10, var9, var11.field1993, !var11.field1989);
            return;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V")
    public static void method1446(byte arg0) {
        field3266 = null;
        field3267 = null;
        if (arg0 < 20) {
            method1445((class72) null, -38, (class312) null, -125, -125, 96, -77, 64);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)Lbr;")
    public static final class222 method1447(boolean arg0) {
        if (arg0) {
            return null;
        }
        field3250++;
        if (class400.field5952 == null || class36.field437 == null) {
            return null;
        }
        class36.field437.method2455(class400.field5952, 1);
        class222 var1 = (class222) class36.field437.method2458(true);
        if (var1 == null) {
            return null;
        } else {
            class324 var2 = class288.method1944(36, var1.field3684);
            return var2 != null && var2.field5084 && var2.method2144((byte) -105) ? var1 : class313.method2098(-273);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjg;I)V")
    private final void method1448(int arg0, class186 arg1, int arg2) {
        if (arg0 != -5) {
            this.field3275 = -80;
        }
        field3263++;
        if (arg2 == 1) {
            this.field3253 = arg1.method1272((byte) -83);
        } else if (arg2 == 2) {
            arg1.method1322(false);
        } else if (arg2 == 3) {
            this.field3257 = arg1.method1284(8388607);
            this.field3259 = arg1.method1284(8388607);
            this.field3249 = arg1.method1284(8388607);
        } else if (arg2 == 4) {
            this.field3273 = arg1.method1322(false);
            this.field3254 = arg1.method1284(8388607);
        } else if (arg2 == 6) {
            this.field3258 = arg1.method1322(false);
        } else if (arg2 == 8) {
            this.field3275 = 1;
        } else if (arg2 == 9) {
            this.field3272 = 1;
            return;
        } else if (arg2 == 10) {
            this.field3269 = true;
            return;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1449(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
