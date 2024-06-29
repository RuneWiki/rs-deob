import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class568 extends class534 {

    @OriginalMember(owner = "client!og", name = "R", descriptor = "[Ljava/lang/String;")
    private static final String[] field8264 = new String[] { method4240(method4239("3~CJm")), method4240(method4239("3~CIm")) };

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "[I")
    public static int[] field8263;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)I", line = 5)
    public static final int method4237(int arg0, byte arg1) {
        try {
            if (arg1 > -17) {
                return -3;
            } else {
                field8262++;
                return arg0 >> 11 & 0x7F;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8264[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 20)
    public static void method4238(byte arg0) {
        try {
            field8263 = null;
            if (arg0 >= -48) {
                method4237(-73, (byte) -75);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8264[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!og", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4239(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!og", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4240(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 92;
                    break;
                case 1:
                    var10005 = 25;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
