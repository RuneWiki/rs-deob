import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class241 {

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field3647 = method2062(method2061("\u0011\u001a?o\u001c"));

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "[I")
    public static int[] field3646 = new int[14];

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "B")
    public byte field3645;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "Ljava/lang/String;")
    public String field3639;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Ljava/lang/String;")
    public String field3641;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Ljava/lang/String;")
    public String field3643;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Ljava/lang/String;")
    public String field3644;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 4)
    public static void method2060(int arg0) {
        try {
            field3646 = null;
            if (arg0 <= 10) {
                field3642 = -6;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3647 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2061(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2062(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 100;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
