import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 extends class568 {

    @OriginalMember(owner = "client!bu", name = "m", descriptor = "Lns;")
    public class426 field194;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field196 = new String[] { method131(method130("c\u0011\u001a/no\r@-/")), method131(method130("o\u0011X\u007f")), method131(method130("zJ\u001a=z")) };

    @OriginalMember(owner = "client!bu", name = "l", descriptor = "Z")
    public static boolean field195 = false;

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lns;)V", line = 7)
    public class19(class426 arg0) {
        try {
            this.field194 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field196[0] + (arg0 == null ? field196[1] : field196[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method130(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method131(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 19;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
