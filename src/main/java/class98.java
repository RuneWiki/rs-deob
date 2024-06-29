import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class98 {

    @OriginalMember(owner = "client!eha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1103 = new String[] { method821(method820("4\rjxOy")), method821(method820("4\rjxLy")) };

    @OriginalMember(owner = "client!eha", name = "b", descriptor = "F")
    public static float field1099 = 1024.0F;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!eha", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field1101;

    @OriginalMember(owner = "client!eha", name = "d", descriptor = "[[B")
    public static byte[][] field1100;

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(IC)C", line = 7)
    public static final char method818(int arg0, char arg1) {
        try {
            field1102++;
            if (arg1 == 'Æ') {
                return 'E';
            } else if (arg1 == 'æ') {
                return 'e';
            } else if (arg1 == 'ß') {
                return 's';
            } else if (arg1 == 'Œ') {
                return 'E';
            } else if (arg1 == 'œ') {
                return 'e';
            } else {
                if (arg0 != -761) {
                    field1101 = null;
                }
                return '\u0000';
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1103[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "a", descriptor = "(I)V", line = 37)
    public static void method819(int arg0) {
        try {
            field1100 = null;
            field1101 = null;
            if (arg0 >= -16) {
                field1101 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1103[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method820(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xD);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method821(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 101;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 86;
                    break;
                default:
                    var10005 = 13;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
