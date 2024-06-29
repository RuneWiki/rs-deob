import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class433 {

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field6368 = method3317(method3316("2-:eE"));

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field6361 = 0;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field6365 = 0;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lr;")
    public class194 field6364;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lla;")
    public static class476 field6362;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Lka;")
    public class497 field6363;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 18)
    public static void method3315(boolean arg0) {
        try {
            if (!arg0) {
                field6367 = -79;
            }
            field6362 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6368 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3316(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3317(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
