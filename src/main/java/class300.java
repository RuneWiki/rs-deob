import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ria")
public class class300 extends class129 {

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4719 = new String[] { method2528(method2527("C'5[o\u0019")), method2528(method2527("C'5[`\u0019")), method2528(method2527("C'5[a\u0019")), method2528(method2527("_;8\u0019")), method2528(method2527("J`z[[")), method2528(method2527("C'5[b\u0019")), method2528(method2527("C'5[n\u0019")), method2528(method2527("C'5[e\u0019")), method2528(method2527("C'5[g\u0019")) };

    @OriginalMember(owner = "client!ria", name = "s", descriptor = "[I")
    public static int[] field4714 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!ria", name = "r", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!ria", name = "p", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!ria", name = "q", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!ria", name = "o", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!ria", name = "n", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!ria", name = "t", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(I)V", line = 4)
    public final void method783(int arg0) {
        try {
            if (arg0 != 1) {
                this.method781(false, -36);
            }
            ++field4713;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4719[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IILrca;)V", line = 15)
    public final void method788(int arg0, int arg1, class479 arg2) {
        try {
            ++field4715;
            super.field1509.method2467(12, arg2);
            if (arg1 <= -3) {
                super.field1509.method2433(-16075, arg0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4719[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4719[4] : field4719[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(IIB)V", line = 27)
    public final void method786(int arg0, int arg1, byte arg2) {
        try {
            int var4 = 101 / ((arg2 - 21) / 56);
            ++field4712;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4719[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZB)V", line = 38)
    public final void method784(boolean arg0, byte arg1) {
        try {
            ++field4718;
            if (arg1 != -34) {
                this.method784(false, (byte) -40);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4719[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "f", descriptor = "(I)V", line = 50)
    public static void method2526(int arg0) {
        try {
            field4714 = null;
            if (arg0 != 47) {
                field4714 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4719[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZI)V", line = 60)
    public final void method781(boolean arg0, int arg1) {
        try {
            ++field4717;
            if (arg1 != 1) {
                field4714 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4719[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "a", descriptor = "(Z)Z", line = 70)
    public final boolean method790(boolean arg0) {
        try {
            ++field4716;
            if (arg0) {
                this.method783(-123);
            }
            return false;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4719[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ria", name = "<init>", descriptor = "(Lkd;)V", line = 85)
    public class300(class296 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2527(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ria", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2528(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 84;
                    break;
                case 3:
                    var10005 = 117;
                    break;
                default:
                    var10005 = 38;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
