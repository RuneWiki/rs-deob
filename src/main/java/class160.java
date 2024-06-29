import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public abstract class class160 {

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
    public int field2050;

    @OriginalMember(owner = "client!gha", name = "g", descriptor = "I")
    public int field2051;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
    public int field2049;

    @OriginalMember(owner = "client!gha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2056 = new String[] { method1353(method1352("t)\u0004\u0019,z/\fC.;")), method1353(method1352("t)\u0004\u0019Q;")) };

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field2052 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "[I")
    public static int[] field2054 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(III)V", line = 9)
    public class160(int arg0, int arg1, int arg2) {
        try {
            this.field2050 = arg0;
            this.field2051 = arg2;
            this.field2049 = arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field2056[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)V", line = 23)
    public static void method1351(int arg0) {
        try {
            field2054 = null;
            if (arg0 > -28) {
                field2053 = 79;
            }
            field2052 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2056[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(IIB)V")
    public abstract void method1348(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(III)V")
    public abstract void method1349(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(III)V")
    public abstract void method1350(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1352(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1353(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 19;
                    break;
                case 1:
                    var10005 = 65;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 55;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
