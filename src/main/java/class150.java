import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class150 {

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1859 = new String[] { method1268(method1267("A[Z\f")), method1268(method1267("I@\u0018!z")), method1268(method1267("T\u0000\u0018N/")), method1268(method1267("I@\u0018\"z")) };

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lwia;")
    public static class790 field1856 = new class790(78, 7);

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "[I")
    public static int[] field1858;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
    public static final void method1265(String arg0, String arg1, int arg2, String arg3, int arg4, int arg5, String arg6) {
        try {
            field1857++;
            class726.method5297(-127, arg3, arg4, null, arg2, arg0, arg6, arg1, arg5);
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field1859[1] + (arg0 == null ? field1859[0] : field1859[2]) + ',' + (arg1 == null ? field1859[0] : field1859[2]) + ',' + arg2 + ',' + (arg3 == null ? field1859[0] : field1859[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field1859[0] : field1859[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method1266(int arg0) {
        try {
            if (arg0 == 2) {
                field1858 = null;
                field1856 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1859[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1267(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1268(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 46;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
