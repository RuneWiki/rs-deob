import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class55 {

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field697 = method563(method562("_\f\f\n,"));

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lvn;")
    public static class330 field696 = new class330(90, -1);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "Llia;")
    public static class505 field695;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V", line = 9)
    public static void method561(byte arg0) {
        try {
            field696 = null;
            field695 = null;
            if (arg0 != 31) {
                field695 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field697 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method562(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method563(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 4;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
