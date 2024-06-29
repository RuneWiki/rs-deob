import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class229 {

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3323 = new String[] { method1907(method1906("ht:A\u0006")), method1907(method1906("ht:B\u0006")) };

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Lop;")
    public static class574 field3315 = new class574("", 13);

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Lsb;")
    public static class261 field3316 = new class261(35, 7);

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Ljo;")
    public static class101 field3319 = class10.method69(-59);

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "[I")
    public static int[] field3322 = new int[3];

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lui;")
    public static class251 field3321 = new class251(4);

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "[Ltb;")
    public static class392[] field3318;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
    public static final void method1904(int arg0) {
        try {
            field3317++;
            class349.field5060.method204(class742.field10549);
            class349.field5060.method233(class788.field11372, class132.field1632, class126.field1583, class44.field640);
            int var1 = -58 / ((-arg0 - 4) / 53);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3323[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public static void method1905(boolean arg0) {
        try {
            if (!arg0) {
                field3321 = null;
            }
            field3316 = null;
            field3321 = null;
            field3319 = null;
            field3322 = null;
            field3318 = null;
            field3315 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3323[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1906(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1907(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 10;
                    break;
                case 1:
                    var10005 = 29;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
