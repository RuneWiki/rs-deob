import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class306 {

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field4251 = method2455(method2454("\u001aTfy!"));

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "[J")
    public static long[] field4250 = new long[10];

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lft;")
    public static class188 field4249;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2453(boolean arg0) {
        try {
            field4249 = null;
            field4250 = null;
            if (arg0) {
                method2453(true);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4251 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2454(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2455(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
