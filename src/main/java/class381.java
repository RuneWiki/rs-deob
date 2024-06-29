import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class381 {

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5558 = new String[] { method3010(method3009("\u001e6b}#")), method3010(method3009("\u001e6b~#")) };

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
    public static boolean field5555 = false;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field5556 = -2;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "F")
    public static float field5552;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Liv;")
    public static class204 field5554;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)Z", line = 7)
    public static final boolean method3007(int arg0, byte arg1) {
        try {
            if (arg1 == -126) {
                field5557++;
                return arg0 == 3 || arg0 == 7 || arg0 == 9 || arg0 == 11;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5558[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 28)
    public static void method3008(int arg0) {
        try {
            field5554 = null;
            if (arg0 != 29861) {
                method3008(100);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5558[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3009(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3010(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
