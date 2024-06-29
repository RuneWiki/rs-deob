import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class628 extends class568 {

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public int field9043;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "I")
    public int field9041;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9048 = new String[] { method4580(method4579("c=Ovp\u007f1\u0015t1")), method4580(method4579("c=O\u000b1")) };

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Lhl;")
    public static class556 field9040 = new class556(134, -2);

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Lpe;")
    public static class636 field9044 = new class636(9, 0, 4, 1);

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Ljk;")
    public static class662 field9046 = new class662();

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lhl;")
    public static class556 field9047 = new class556(46, 2);

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Lvb;")
    public static class205 field9045;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "Llia;")
    public static class505 field9042;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method4578(byte arg0) {
        try {
            field9046 = null;
            field9040 = null;
            field9042 = null;
            field9044 = null;
            field9045 = null;
            if (arg0 > -57) {
                field9047 = null;
            }
            field9047 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9048[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(II)V")
    public class628(int arg0, int arg1) {
        try {
            this.field9043 = arg1;
            this.field9041 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9048[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!re", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4579(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x19);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!re", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4580(char[] arg0) {
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
                    var10005 = 88;
                    break;
                case 2:
                    var10005 = 97;
                    break;
                case 3:
                    var10005 = 74;
                    break;
                default:
                    var10005 = 25;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
