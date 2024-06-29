import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class424 {

    @OriginalMember(owner = "client!je", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6686 = new String[] { method3369(method3368("\u000b7}_\u0010")), method3369(method3368("\t%`z")), method3369(method3368("\u000b7}\\\u0010")), method3369(method3368("\u000b30rQ\u0003")) };

    @OriginalMember(owner = "client!je", name = "i", descriptor = "[B")
    public static byte[] field6682 = new byte[2048];

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lhl;")
    public static class556 field6684 = new class556(85, 8);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "B")
    public byte field6680;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public int field6681;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lgda;")
    public static class58 field6685;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "Ljava/lang/String;")
    public String field6676;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Ljava/lang/String;")
    public String field6677;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Ljava/lang/String;")
    public String field6678;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Ljava/lang/String;")
    public String field6679;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 5)
    public static void method3366(int arg0) {
        try {
            if (arg0 != 9539) {
                method3367((byte) 20);
            }
            field6684 = null;
            field6682 = null;
            field6685 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6686[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)Z", line = 25)
    public static final boolean method3367(byte arg0) {
        try {
            field6683++;
            int var1 = 3 % ((6 - arg0) / 61);
            return class259.method2177((byte) -72, field6686[3]) ? class259.method2177((byte) -72, field6686[1]) : false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6686[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!je", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3368(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!je", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3369(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 97;
                    break;
                case 1:
                    var10005 = 82;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
