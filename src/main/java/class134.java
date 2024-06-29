import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class134 extends class568 {

    @OriginalMember(owner = "client!di", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1905 = new String[] { method1263(method1262("a0@\u0011K")), method1263(method1262("a0@\u0012K")) };

    @OriginalMember(owner = "client!di", name = "o", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1901 = new Hashtable();

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "[Lnh;")
    public static class781[] field1903;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 7)
    public static void method1260(int arg0) {
        try {
            field1903 = null;
            if (arg0 == -1) {
                field1901 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1905[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIIIIIII)V", line = 18)
    public static final void method1261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            field1904++;
            if (class504.method3798(127, arg2)) {
                if (class97.field1434[arg2] == null) {
                    client.method2710(class309.field5028[arg2], -1, arg8, arg1, arg6, arg0, arg4, arg7, arg3, arg11, arg5, arg10);
                } else {
                    client.method2710(class97.field1434[arg2], -1, arg8, arg1, arg6, arg0, arg4, arg7, arg3, arg11, arg5, arg10);
                }
                if (arg9 >= -89) {
                    method1261(-123, 119, 8, 120, 19, 61, 58, 123, -2, 90, 120, 91);
                }
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field1905[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILwq;)V")
    public abstract void method102(int arg0, class176 arg1);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lsca;I)V")
    public abstract void method100(class47 arg0, int arg1);

    @OriginalMember(owner = "client!di", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1262(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!di", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1263(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 5;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
