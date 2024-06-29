import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public abstract class class394 extends class206 {

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5912 = new String[] { method3123(method3122("~\u001bZH6")), method3123(method3122("~\u001bZO6")) };

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field5908 = -1;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "[I")
    public static int[] field5910 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)J")
    public abstract long method2176(int arg0);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)I")
    public abstract int method2178(boolean arg0);

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)I")
    public abstract int method2177(byte arg0);

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
    public static final void method3120(byte arg0) {
        try {
            field5909++;
            if (arg0 != 77) {
                method3121((byte) -123);
            }
            class618.field9078.method1569(10574);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5912[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)I")
    public abstract int method2182(byte arg0);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V")
    public static void method3121(byte arg0) {
        try {
            field5910 = null;
            if (arg0 != -126) {
                field5910 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5912[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
    public abstract int method2181(int arg0);

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3122(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3123(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
