import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class493 {

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field7421 = method3735(method3734("R]()\""));

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[I")
    public static int[] field7418 = new int[1000];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lhl;")
    public static class556 field7419 = new class556(75, 6);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[Ls;")
    public static class293[] field7420;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)Lom;")
    public abstract class394 method1193(int arg0);

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
    public abstract void method1197(int arg0);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public abstract void method1195(int arg0);

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public static void method3733(int arg0) {
        try {
            field7418 = null;
            if (arg0 == 75) {
                field7419 = null;
                field7420 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7421 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)Z")
    public abstract boolean method1189(int arg0, int arg1);

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3734(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xA);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3735(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 52;
                    break;
                case 2:
                    var10005 = 6;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 10;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
