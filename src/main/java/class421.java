import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class421 {

    @OriginalMember(owner = "client!iea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6039 = new String[] { method3280(method3279("Dicp~B_v,cCk*")), method3280(method3279("DicpK\u0005")) };

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public static int field6036 = 0;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!iea", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        try {
            field6038++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6039[0] + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(IBI)Z", line = 15)
    public static final boolean method3278(int arg0, byte arg1, int arg2) {
        try {
            if (arg1 < 54) {
                return true;
            } else {
                field6037++;
                return (arg2 & 0x800) != 0;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6039[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3279(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xA);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3280(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 94;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
