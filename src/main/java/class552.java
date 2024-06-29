import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class552 {

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8057 = new String[] { method4132(method4131("\u001cS{`")), method4132(method4131("\u0017Bv\"dZ")), method4132(method4131("\t\b9\"X")), method4132(method4131("\u0017Bv\"gZ")) };

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "Z")
    public static boolean field8054 = false;

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "F")
    public static float field8056;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "Lsh;")
    public static class207 field8052;

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "[I")
    public static int[] field8055;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZLha;)V")
    public static final void method4129(boolean arg0, class18 arg1) {
        try {
            for (class464 var2 = (class464) class21.field262.method3617(arg0); var2 != null; var2 = (class464) class21.field262.method3612(3)) {
                if (var2.field6776) {
                    var2.method3566(arg1);
                }
            }
            field8053++;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field8057[1] + arg0 + ',' + (arg1 == null ? field8057[0] : field8057[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
    public static void method4130(int arg0) {
        try {
            field8052 = null;
            if (arg0 == -32283) {
                field8055 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8057[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4131(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4132(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 12;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
