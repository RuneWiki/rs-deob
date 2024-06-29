import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class480 {

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field7074 = method3715(method3714("8v\u0000}~"));

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "[I")
    public static int[] field7073 = new int[50];

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "Lsb;")
    public static class261 field7072 = new class261(140, 10);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public int field7068;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public int field7069;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
    public int field7070;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "I")
    public int field7071;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V", line = 9)
    public static void method3713(boolean arg0) {
        try {
            field7072 = null;
            field7073 = null;
            if (arg0) {
                field7072 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7074 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3714(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x56);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3715(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 5;
                    break;
                case 2:
                    var10005 = 46;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
