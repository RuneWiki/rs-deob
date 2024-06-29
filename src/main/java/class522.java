import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class522 extends class759 {

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7616 = new String[] { method3970(method3969("d9\u0011gI")), method3970(method3969("d9\u0011eI")) };

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "I")
    public static int field7612 = 1;

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "Lsb;")
    public static class261 field7613 = new class261(141, 4);

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "[I")
    public static int[] field7615 = new int[1000];

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "I")
    public static int field7614;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)Llq;")
    public static final class728 method3966(int arg0) {
        try {
            field7614++;
            if (class390.field5689.length > class656.field9307) {
                return class390.field5689[class656.field9307++];
            } else if (arg0 == 1000) {
                return null;
            } else {
                return null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7616[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "c", descriptor = "(I)V")
    public static final void method3967(int arg0) {
        class440.field6487 = arg0;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
    public static void method3968(byte arg0) {
        try {
            field7613 = null;
            field7615 = null;
            if (arg0 <= 28) {
                method3966(-70);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7616[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3969(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x61);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3970(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
