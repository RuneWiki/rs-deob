import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class346 extends class687 {

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "[[S")
    public short[][] field5035;

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "D")
    public double field5036;

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field5039 = new String[] { method2777(method2776("X\u0004lW\u0019")), method2777(method2776("X\u0004lT\u0019")), method2777(method2776("X\u0004l)XQ\u00196+\u0019")), method2777(method2776("Q\u0005.y")), method2777(method2776("D^l;L")), method2777(method2776("X\u0004lV\u0019")) };

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
    public static int field5032 = -1;

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    public static int field5038 = 100;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V", line = 5)
    public static final void method2773(byte arg0) {
        try {
            field5037++;
            int[] var1 = new int[class153.field1955.field5971];
            if (arg0 >= 121) {
                int var2 = 0;
                for (int var3 = 0; var3 < class153.field1955.field5971; var3++) {
                    class371 var4 = class153.field1955.method3237(var3, 0);
                    if (var4.field5398 >= 0 || var4.field5408 >= 0) {
                        var1[var2++] = var3;
                    }
                }
                class12.field166 = new int[var2];
                for (int var5 = 0; var5 < var2; var5++) {
                    class12.field166[var5] = var1[var5];
                }
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5039[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)J", line = 40)
    public final long method2774(int arg0) {
        try {
            field5034++;
            return arg0 == 0 ? (long) (this.field5035[0].length | this.field5035.length << 0) : -34L;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5039[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BII)Z", line = 55)
    public static final boolean method2775(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 != 125) {
                method2775((byte) -113, 125, 34);
            }
            field5033++;
            return (arg1 & 0x180) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5039[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "([[SD)V", line = 73)
    public class346(short[][] arg0, double arg1) {
        try {
            this.field5035 = arg0;
            this.field5036 = arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field5039[2] + (arg0 == null ? field5039[3] : field5039[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2776(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2777(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
