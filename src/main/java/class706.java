import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class706 {

    @OriginalMember(owner = "client!lt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10129 = new String[] { method5133(method5132("\u0010k$8|/kx%}\u001b7")), method5133(method5132("\u0010k$\r;")) };

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "F")
    public static float field10127;

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
    public static int field10128;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "[I")
    public static int[] field10126;

    @OriginalMember(owner = "client!lt", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        try {
            field10128++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10129[0] + ')');
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)V", line = 18)
    public static void method5131(byte arg0) {
        try {
            int var1 = -91 / ((arg0 - 72) / 39);
            field10126 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10129[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(II)V", line = 30)
    public class706(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!lt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5132(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5133(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 124;
                    break;
                case 1:
                    var10005 = 31;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
