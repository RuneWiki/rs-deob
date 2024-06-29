import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class520 {

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field7622 = method3956(method3955("o6/sQ."));

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "Z")
    public static boolean field7617 = false;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "Lel;")
    public static class573 field7620 = new class573(112, 6);

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
    public static int field7618;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "J")
    public static long field7619;

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "[[[B")
    public static byte[][][] field7621;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(I)V")
    public static void method3954(int arg0) {
        try {
            field7620 = null;
            if (arg0 == 112) {
                field7621 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7622 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3955(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3956(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 6;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 78;
                    break;
                case 3:
                    var10005 = 93;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
