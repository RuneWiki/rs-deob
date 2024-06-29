import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class23 {

    @OriginalMember(owner = "client!qia", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field274 = method164(method163("\u0000\u001czK[Y"));

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
    public static int field272 = 0;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "[S")
    public static short[] field273 = new short[256];

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Z)V")
    public static void method162(boolean arg0) {
        try {
            if (!arg0) {
                field273 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field274 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method163(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method164(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 113;
                    break;
                case 1:
                    var10005 = 117;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 26;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
