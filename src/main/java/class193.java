import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class193 {

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field2540 = method1605(method1604("SM7Qh"));

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "[I")
    public static int[] field2538 = new int[25];

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)V")
    public static void method1603(boolean arg0) {
        try {
            if (!arg0) {
                method1603(true);
            }
            field2538 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2540 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1604(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ew", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1605(char[] arg0) {
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
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 16;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
