import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class401 {

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field6336 = method3238(method3237("Q\"`*'"));

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Z")
    public static boolean field6333 = false;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BB)Z")
    public static final boolean method3236(byte arg0, byte arg1) {
        try {
            if (arg0 > -89) {
                method3236((byte) 126, (byte) 48);
            }
            field6332++;
            int var2 = arg1 & 0xFF;
            if (var2 == 0) {
                return false;
            } else {
                return var2 < 128 || var2 >= 160 || class64.field875[var2 - 128] != '\u0000';
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6336 + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3237(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3238(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 72;
                    break;
                case 2:
                    var10005 = 78;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
