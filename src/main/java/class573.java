import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class573 {

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field8282 = method4217(method4216("\"\u007f.#ta"));

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)Z")
    public static final boolean method4215(int arg0, int arg1, int arg2) {
        try {
            field8281++;
            int var3 = -70 % ((-arg0 - 8) / 54);
            return class665.method4823(arg2, (byte) 43, arg1) | (arg2 & 0x70000) != 0 || class735.method5336(20889, arg1, arg2);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8282 + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4216(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4217(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 73;
                    break;
                case 1:
                    var10005 = 24;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
