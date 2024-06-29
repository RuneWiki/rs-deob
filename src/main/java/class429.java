import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class429 {

    @OriginalMember(owner = "client!hja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6758 = new String[] { method3400(method3399("yYmt~9")), method3400(method3399("yYmt}9")) };

    @OriginalMember(owner = "client!hja", name = "c", descriptor = "Lvn;")
    public static class330 field6754 = new class330(29, 6);

    @OriginalMember(owner = "client!hja", name = "b", descriptor = "[I")
    public static int[] field6756 = new int[8];

    @OriginalMember(owner = "client!hja", name = "d", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "[Lhk;")
    public static class107[] field6757;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(I)V", line = 11)
    public static void method3397(int arg0) {
        try {
            field6756 = null;
            field6757 = null;
            field6754 = null;
            if (arg0 != -31828) {
                field6756 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6758[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(IIZ)Z", line = 24)
    public static final boolean method3398(int arg0, int arg1, boolean arg2) {
        try {
            field6755++;
            if (arg2) {
                return false;
            } else {
                return (arg0 & 0xC580) != 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6758[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3399(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3400(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 17;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 90;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
