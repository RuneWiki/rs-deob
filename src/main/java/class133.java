import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class133 {

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field1559 = method1144(method1143(";\rkEg"));

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "[Z")
    public static boolean[] field1558 = new boolean[8];

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public int field1557;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "Lhg;")
    public static class718 field1556;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "Z")
    public boolean field1552;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "Z")
    public boolean field1553;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V", line = 7)
    public static void method1142(byte arg0) {
        try {
            if (arg0 >= -112) {
                field1558 = null;
            }
            field1556 = null;
            field1558 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1559 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1143(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1144(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 4;
                    break;
                default:
                    var10005 = 79;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
