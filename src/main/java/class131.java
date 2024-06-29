import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class131 extends class206 {

    @OriginalMember(owner = "client!co", name = "k", descriptor = "Z")
    public boolean field1528 = false;

    @OriginalMember(owner = "client!co", name = "q", descriptor = "I")
    public int field1532 = -1;

    @OriginalMember(owner = "client!co", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1537 = new String[] { method1136(method1135("j;\u00152Y")), method1136(method1135("j;\u0015O\u0018g=OMY")) };

    @OriginalMember(owner = "client!co", name = "j", descriptor = "Lel;")
    public static class573 field1530 = new class573(108, 2);

    @OriginalMember(owner = "client!co", name = "m", descriptor = "Lwia;")
    public static class790 field1533 = new class790(20, -1);

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!co", name = "r", descriptor = "I")
    public int field1531;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!co", name = "p", descriptor = "I")
    public int field1536;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public static void method1134(int arg0) {
        try {
            field1530 = null;
            int var1 = -5 % ((33 - arg0) / 53);
            field1533 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1537[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I)V")
    public class131(int arg0) {
        try {
            this.field1532 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1537[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!co", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1135(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!co", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1136(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 9;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 115;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
