import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class254 {

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "J")
    public long field3633;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "Ljava/lang/String;")
    public String field3638;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "Ljava/lang/String;")
    public String field3636;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public int field3635;

    @OriginalMember(owner = "client!cba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3639 = new String[] { method2133(method2132("1F\u0016;~z")), method2133(method2132("<Q\u001by")), method2133(method2132("1F\u0016;\u0003;J\u001ea\u0001z")), method2133(method2132(")\nY;B")) };

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "[Ljava/lang/Object;")
    public static Object[] field3637;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)Lvea;", line = 8)
    public static final class122 method2130(int arg0, int arg1, int arg2) {
        class621 var3 = class608.field8715[arg0][arg1][arg2];
        return var3 == null || var3.field8850 == null ? null : var3.field8850;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V", line = 19)
    public static void method2131(int arg0) {
        try {
            if (arg0 <= 52) {
                field3637 = null;
            }
            field3637 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3639[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 30)
    public class254(int arg0, String arg1, int arg2, String arg3, long arg4) {
        try {
            this.field3633 = arg4;
            this.field3638 = arg1;
            this.field3636 = arg3;
            this.field3632 = arg0;
            this.field3635 = arg2;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3639[2] + arg0 + ',' + (arg1 == null ? field3639[1] : field3639[3]) + ',' + arg2 + ',' + (arg3 == null ? field3639[1] : field3639[3]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!cba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2132(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2133(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 119;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 63;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
