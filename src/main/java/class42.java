import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public abstract class class42 extends class505 {

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field478 = method442(method441(">vACx`"));

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "Z")
    public static boolean field475 = false;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "Lhl;")
    public static class556 field474 = new class556(51, 3);

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    public static int field477 = -1;

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "Lgda;")
    public static class58 field473;

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "[Lrda;")
    public static class693[] field476;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Z)V", line = 10)
    public static void method440(boolean arg0) {
        try {
            if (arg0) {
                field475 = true;
            }
            field473 = null;
            field474 = null;
            field476 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field478 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(I)Ldka;")
    public abstract class12 method439(int arg0);

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method441(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method442(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 20;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 48;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
