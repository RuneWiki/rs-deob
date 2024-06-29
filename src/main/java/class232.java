import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class232 extends class640 {

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "I")
    public int field3502;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3508 = new String[] { method1988(method1987("^;h\u001b+")), method1988(method1987("^;hejX?2g+")), method1988(method1987("^;h\u0018+")) };

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    public static int field3504 = 1338;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "Lla;")
    public static class476 field3503;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "Lha;")
    public static class66 field3505;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "[J")
    public static long[] field3507;

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(I)V", line = 3)
    public class232(int arg0) {
        try {
            this.field3502 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3508[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V", line = 14)
    public static final void method1985(boolean arg0) {
        try {
            field3506++;
            if (class280.field4199 != -1) {
                class655.method4804(class280.field4199, false, -1, -1, -22781);
                class280.field4199 = -1;
            }
            if (arg0) {
                method1985(true);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3508[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 38)
    public static void method1986(int arg0) {
        try {
            field3505 = null;
            field3503 = null;
            field3507 = null;
            if (arg0 != -1) {
                field3504 = 18;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3508[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1987(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1988(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 54;
                    break;
                case 1:
                    var10005 = 86;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 3;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
