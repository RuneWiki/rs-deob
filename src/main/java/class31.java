import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bja")
public class class31 {

    @OriginalMember(owner = "client!bja", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field369 = method331(method330("2\u0000\u001cj\u001cx"));

    @OriginalMember(owner = "client!bja", name = "f", descriptor = "F")
    public static float field363 = 1.0F;

    @OriginalMember(owner = "client!bja", name = "d", descriptor = "[I")
    public static int[] field365 = new int[5];

    @OriginalMember(owner = "client!bja", name = "e", descriptor = "Llt;")
    public static class706 field364 = new class706(7, -1);

    @OriginalMember(owner = "client!bja", name = "b", descriptor = "F")
    public static float field368;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!bja", name = "c", descriptor = "[Lnh;")
    public static class781[] field367;

    @OriginalMember(owner = "client!bja", name = "a", descriptor = "(Z)V", line = 6)
    public static void method329(boolean arg0) {
        try {
            field364 = null;
            if (arg0) {
                method329(false);
            }
            field367 = null;
            field365 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field369 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method330(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method331(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 80;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 125;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
