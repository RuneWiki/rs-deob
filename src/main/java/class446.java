import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class446 {

    @OriginalMember(owner = "client!en", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6566 = new String[] { method3467(method3466("$ +k%")), method3467(method3466("$ +h%")) };

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Lsb;")
    public static class261 field6564 = new class261(79, -2);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)Z")
    public static final boolean method3464(int arg0, int arg1) {
        try {
            field6562++;
            if (arg0 != -49) {
                field6565 = 102;
            }
            return arg1 == 44 || arg1 == 3 || arg1 == 19 || arg1 == 47 || arg1 == 48 || arg1 == 21 || arg1 == 45;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6566[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static void method3465(int arg0) {
        try {
            if (arg0 != 79) {
                method3464(-103, 13);
            }
            field6564 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6566[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!en", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3466(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!en", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3467(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
