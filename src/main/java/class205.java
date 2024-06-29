import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public abstract class class205 {

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field3173 = method1822(method1821("oL\u0004vH"));

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "Lwq;")
    public static class178 field3171 = new class178(64);

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3172 = null;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
    public static void method1820(int arg0) {
        try {
            if (arg0 < 37) {
                field3172 = null;
            }
            field3171 = null;
            field3172 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3173 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILkv;)Lkv;")
    public abstract class283 method204(int arg0, class283 arg1);

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1821(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1822(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 31;
                    break;
                case 1:
                    var10005 = 61;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
