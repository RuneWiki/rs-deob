import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public abstract class class114 extends class578 {

    @OriginalMember(owner = "client!su", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field1469 = method1055(method1054("4q\u0014\t\u001e"));

    @OriginalMember(owner = "client!su", name = "i", descriptor = "Lsb;")
    public static class261 field1468 = new class261(95, 6);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Z)V", line = 14)
    public static void method1053(boolean arg0) {
        try {
            if (!arg0) {
                method1053(true);
            }
            field1468 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1469 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILwfa;)V")
    public abstract void method115(int arg0, class286 arg1);

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Ljc;I)V")
    public abstract void method116(class711 arg0, int arg1);

    @OriginalMember(owner = "client!su", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1054(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!su", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1055(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
