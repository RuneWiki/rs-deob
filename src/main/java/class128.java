import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class128 {

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1602 = new String[] { method1135(method1134("Z27>r")), method1135(method1134("Z27=r")) };

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "[I")
    public static int[] field1601 = null;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)Z")
    public static final boolean method1132(int arg0, int arg1, int arg2) {
        try {
            int var3 = -14 % ((-arg1 - 8) / 42);
            field1600++;
            return (arg0 & 0x800) != 0;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1602[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    public static void method1133(byte arg0) {
        try {
            field1601 = null;
            if (arg0 <= 48) {
                method1133((byte) 12);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1602[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1134(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1135(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 124;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
