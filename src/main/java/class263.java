import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class263 {

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field4042 = method2208(method2207("1\u0014\u0019j\u0007~"));

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "[Lhs;")
    public static class344[] field4039 = new class344[14];

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public int field4041;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "Lbe;")
    public class41 field4040;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "[I")
    public int[] field4038;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 3)
    public static void method2205(byte arg0) {
        try {
            field4039 = null;
            int var1 = -30 / ((-arg0 - 53) / 53);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4042 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILs;)V", line = 12)
    public static final void method2206(int arg0, class294 arg1) {
        class555.field8261[arg0] = arg1;
    }

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2207(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2208(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 86;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
