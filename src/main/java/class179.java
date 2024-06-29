import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class179 {

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2878 = new String[] { method1705(method1704("6\u0010w!u")), method1705(method1704("=\u000fhPn8R5")), method1705(method1704("#K5c")), method1705(method1704("*IwM ")), method1705(method1704("/\u000fkPn8R5")), method1705(method1704("=\u000fkPn8R5")), method1705(method1704("*IwN ")) };

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field2877 = 1406;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "Lvn;")
    public static class330 field2876 = new class330(28, 4);

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "Leka;")
    public static class492 field2874;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1702(boolean arg0) {
        try {
            field2874 = null;
            if (arg0) {
                method1703(null, 81);
            }
            field2876 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2878[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lgda;I)V", line = 22)
    public static final void method1703(class58 arg0, int arg1) {
        try {
            class45.field506 = arg0.method585(-1, field2878[1]);
            field2875++;
            class685.field9908 = arg0.method585(-1, field2878[5]);
            if (arg1 != 24682) {
                method1703(null, 23);
            }
            class103.field1519 = arg0.method585(-1, field2878[4]);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field2878[3] + (arg0 == null ? field2878[2] : field2878[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1704(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1705(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 77;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 89;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
