import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class325 {

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field5131 = method2760(method2759("\"P0\u0004H"));

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field5130 = -2;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)[Llk;")
    public static final class613[] method2758(int arg0) {
        try {
            int var1 = -90 / ((14 - arg0) / 55);
            field5129++;
            return new class613[] { class614.field8965, class11.field131, class41.field494 };
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5131 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2759(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2760(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 53;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
