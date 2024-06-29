import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class267 {

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4086 = new String[] { method2225(method2224("qm~Q")), method2225(method2224("ps<|\u0018")), method2225(method2224("d6<\u0013M")), method2225(method2224("ps<\u007f\u0018")) };

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Lel;")
    public static class573 field4084 = new class573(26, 1);

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Low;")
    public static class365 field4085;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2222(boolean arg0) {
        try {
            if (!arg0) {
                field4084 = null;
            }
            field4084 = null;
            field4085 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4086[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lla;Z)V", line = 16)
    public static final void method2223(class476 arg0, boolean arg1) {
        try {
            field4083++;
            class396.field5931 = arg0;
            if (!arg1) {
                field4085 = null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4086[1] + (arg0 == null ? field4086[0] : field4086[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2224(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2225(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 61;
                    break;
                default:
                    var10005 = 48;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
