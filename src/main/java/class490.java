import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class490 {

    @OriginalMember(owner = "client!eka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7036 = new String[] { method3710(method3709("XQ|^2\u0015")), method3710(method3709("XQ|^1\u0015")) };

    @OriginalMember(owner = "client!eka", name = "d", descriptor = "Lel;")
    public static class573 field7032 = new class573(66, 4);

    @OriginalMember(owner = "client!eka", name = "b", descriptor = "I")
    public static int field7035 = 0;

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!eka", name = "c", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(III)Z", line = 9)
    public static final boolean method3707(int arg0, int arg1, int arg2) {
        try {
            if (arg1 != 66) {
                field7033 = -60;
            }
            field7034++;
            return (arg0 & 0x8000) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7036[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)V", line = 21)
    public static void method3708(int arg0) {
        try {
            if (arg0 != 16384) {
                method3708(-107);
            }
            field7032 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7036[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3709(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3710(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 58;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 112;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
