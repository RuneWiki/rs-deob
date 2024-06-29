import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class380 {

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6123 = new String[] { method3116(method3115("\u0002KN[u")), method3116(method3115("\u0002KNXu")) };

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "[I")
    public static int[] field6121;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "[I")
    public static int[] field6122;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "[[B")
    public static byte[][] field6120;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IJI)Lsf;")
    public static final class551 method3113(int arg0, long arg1, int arg2) {
        try {
            field6119++;
            class551 var4 = (class551) class226.field3539.method737((byte) -39, arg1 | (long) arg2 << 56);
            if (var4 == null) {
                var4 = new class551(arg2, arg1);
                class226.field3539.method738(var4, var4.field8252, -12002);
            }
            int var5 = -4 % ((-arg0 - 61) / 51);
            return var4;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6123[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method3114(int arg0) {
        try {
            field6120 = null;
            if (arg0 <= -3) {
                field6122 = null;
                field6121 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6123[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3115(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3116(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 103;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
