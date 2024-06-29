import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public abstract class class698 {

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
    public int field10051;

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "I")
    public int field10052;

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "I")
    public int field10050;

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field10054 = method5071(method5070("M\"&9iC..ck\u0002"));

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "Z")
    public static boolean field10048 = false;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ZII)V")
    public abstract void method965(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIB)V")
    public abstract void method964(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(III)V")
    public abstract void method967(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(III)V")
    public class698(int arg0, int arg1, int arg2) {
        try {
            this.field10051 = arg0;
            this.field10052 = arg1;
            this.field10050 = arg2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10054 + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5070(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5071(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 71;
                    break;
                case 3:
                    var10005 = 23;
                    break;
                default:
                    var10005 = 85;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
