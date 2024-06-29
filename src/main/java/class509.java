import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class509 extends class578 {

    @OriginalMember(owner = "client!in", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field7475 = method3892(method3891("K9uW\u001c"));

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public int field7472;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public int field7473;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BF)F")
    public static final float method3890(byte arg0, float arg1) {
        try {
            if (arg0 < 79) {
                method3890((byte) 65, 0.916483F);
            }
            field7474++;
            return arg1 * arg1 * arg1 * ((arg1 * 6.0F - 15.0F) * arg1 + 10.0F);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7475 + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!in", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3891(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!in", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3892(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 34;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 22;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
