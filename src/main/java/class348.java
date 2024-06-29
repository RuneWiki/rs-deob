import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class348 extends class578 {

    @OriginalMember(owner = "client!za", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field5052 = method2785(method2784("2U\u00019["));

    @OriginalMember(owner = "client!za", name = "j", descriptor = "I")
    public static int field5050 = 0;

    @OriginalMember(owner = "client!za", name = "i", descriptor = "[Ltb;")
    public static class392[] field5051;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2783(boolean arg0) {
        try {
            field5051 = null;
            if (!arg0) {
                method2783(true);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5052 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!za", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2784(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!za", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2785(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 52;
                    break;
                case 2:
                    var10005 = 47;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
