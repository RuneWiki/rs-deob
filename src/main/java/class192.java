import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class192 extends class459 {

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field3022 = method1781(method1780("C\u001cJx"));

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field3021 = -1;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "[[I")
    public static int[][] field3020;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method1779(int arg0) {
        try {
            field3020 = null;
            if (arg0 < 59) {
                method1779(-114);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3022 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!r", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1780(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x78);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!r", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1781(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 13;
                    break;
                case 3:
                    var10005 = 80;
                    break;
                default:
                    var10005 = 120;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
