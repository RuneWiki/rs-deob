import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class511 extends class54 {

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7359 = new String[] { method3856(method3855("QWM0C\u0015")), method3856(method3855("QWM0@\u0015")), method3856(method3855("QWM0D\u0015")), method3856(method3855("QWM0F\u0015")), method3856(method3855("QWM0E\u0015")), method3856(method3855("QWM0A\u0015")), method3856(method3855("QWM0B\u0015")) };

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "Lwia;")
    public static class790 field7356 = new class790(16, 12);

    @OriginalMember(owner = "client!lda", name = "t", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!lda", name = "s", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "Lfs;")
    public static class581 field7358;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(II)Z")
    public static final boolean method3852(int arg0, int arg1) {
        try {
            if (arg1 != 12) {
                method3852(89, -76);
            }
            ++field7355;
            return ~arg0 == -4 || arg0 == 7 || arg0 == 10;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7359[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Lhia;)V")
    public class511(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            ++field7354;
            if (arg1 >= -106) {
                this.method111(true);
            }
            return 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7359[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)V")
    public static void method3853(byte arg0) {
        try {
            field7356 = null;
            if (arg0 <= 2) {
                field7356 = null;
            }
            field7358 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7359[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            if (arg0) {
                return -33;
            } else {
                ++field7357;
                return 1;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7359[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            if (super.field589.method653(24915) == class239.field3624) {
                super.field593 = 2;
            }
            ++field7353;
            if (super.field593 < 0 || super.field593 > 2) {
                super.field593 = this.method111(!arg0);
            }
            if (!arg0) {
                field7358 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7359[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                method3853((byte) 20);
            }
            super.field593 = arg1;
            ++field7351;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7359[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(Z)I")
    public final int method3854(boolean arg0) {
        try {
            ++field7352;
            if (arg0) {
                field7356 = null;
            }
            return super.field593;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7359[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(ILhia;)V")
    public class511(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3855(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3856(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 44;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
