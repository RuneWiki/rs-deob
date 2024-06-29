import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class712 {

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field10302 = method5169(method5168("\u001a\u00170_r"));

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Z")
    public static boolean field10300 = false;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field10299;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)J")
    public static final synchronized long method5167(int arg0) {
        try {
            if (arg0 != -2334) {
                return 98L;
            }
            field10301++;
            long var1 = System.currentTimeMillis();
            if (class187.field2974 > var1) {
                class211.field3349 += class187.field2974 - var1;
            }
            class187.field2974 = var1;
            return class211.field3349 + var1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10302 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5168(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5169(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 107;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
