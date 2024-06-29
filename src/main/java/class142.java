import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class142 extends Exception {

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1844 = new String[] { method1231(method1230("\nHr\bH")), method1231(method1230("\nHr\u000bH")) };

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "[I")
    public static int[] field1843 = new int[1000];

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Lhi;")
    public static class606 field1840;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "[Ltb;")
    public static class392[] field1842;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZII)I")
    public static final int method1228(boolean arg0, int arg1, int arg2) {
        try {
            if (arg0) {
                return 111;
            } else {
                field1839++;
                return arg1 == 1 || arg1 == 3 ? class157.field2004[arg2 & 0x3] : class9.field108[arg2 & 0x3];
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1844[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method1229(int arg0) {
        try {
            field1842 = null;
            if (arg0 != 3) {
                method1229(-49);
            }
            field1840 = null;
            field1843 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1844[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1230(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1231(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 42;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
