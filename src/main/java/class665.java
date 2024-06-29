import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class665 extends class54 {

    @OriginalMember(owner = "client!av", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9682 = new String[] { method4906(method4905("WKK\nq")), method4906(method4905("WKK\tq")), method4906(method4905("WKK\bq")), method4906(method4905("WKK\u000bq")), method4906(method4905("WKK\u000fq")) };

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field9677;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "I")
    public static int field9678;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public static int field9679;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "I")
    public static int field9680;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "(Z)I")
    public final int method4904(boolean arg0) {
        try {
            if (arg0) {
                return 4;
            } else {
                ++field9677;
                return super.field593;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9682[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(Z)I")
    public final int method111(boolean arg0) {
        try {
            ++field9680;
            return arg0 ? 15 : 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9682[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(IB)I")
    public final int method109(int arg0, byte arg1) {
        try {
            ++field9678;
            return arg1 > -106 ? -116 : 1;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9682[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Z)V")
    public final void method115(boolean arg0) {
        try {
            if (arg0) {
                ++field9679;
                if (~super.field593 > -1 || ~super.field593 < -5) {
                    super.field593 = this.method111(false);
                }
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field9682[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)V")
    public final void method113(int arg0, int arg1) {
        try {
            super.field593 = arg1;
            ++field9681;
            if (arg0 != 0) {
                this.method4904(true);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9682[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(ILhia;)V")
    public class665(int arg0, class73 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lhia;)V")
    public class665(class73 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!av", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4905(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 89);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!av", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4906(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
