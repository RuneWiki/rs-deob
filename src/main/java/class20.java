import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class20 {

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field256 = new String[] { method256(method255("YBc:j")), method256(method255("YBc9j")) };

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "[[I")
    public static int[][] field255;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)I")
    public static final int method253(int arg0, int arg1, int arg2, int arg3) {
        try {
            int var6 = arg3 & 0x3;
            field253++;
            if (var6 == 0) {
                return arg2;
            } else if (arg0 >= -59) {
                return -57;
            } else if (var6 == 1) {
                return arg1;
            } else if (var6 == 2) {
                return 4095 - arg2;
            } else {
                return 4095 - arg1;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field256[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static void method254(byte arg0) {
        try {
            field255 = null;
            if (arg0 != 103) {
                field254 = -107;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field256[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method255(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method256(char[] arg0) {
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
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
