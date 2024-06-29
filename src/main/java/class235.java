import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class235 {

    @OriginalMember(owner = "client!em", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3627 = new String[] { method2041(method2040("1|\u0015\u000e8")), method2041(method2040("1|\u0015\u000f8")), method2041(method2040("1|\u0015\f8")), method2041(method2040(":dW!")), method2041(method2040("/?\u0015cm")) };

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Z")
    public static boolean field3625 = false;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "Lfg;")
    public static class136 field3624 = new class136();

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method2037(int arg0) {
        try {
            if (arg0 == -1) {
                field3624 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3627[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Ldja;")
    public static final class324 method2038(int arg0, int arg1) {
        try {
            int var2 = 4 % ((arg1 + 26) / 32);
            field3623++;
            return new class324(arg0, false);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3627[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method2039(Random arg0, int arg1, int arg2) {
        try {
            field3626++;
            if (arg1 <= 0) {
                throw new IllegalArgumentException();
            } else if (class46.method469(arg1, 1010)) {
                return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
            } else {
                if (arg2 >= -71) {
                    field3624 = null;
                }
                int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
                int var4;
                do {
                    var4 = arg0.nextInt();
                } while (var3 <= var4);
                return class207.method1870(arg1, 55, var4);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3627[2] + (arg0 == null ? field3627[3] : field3627[4]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!em", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2040(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!em", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2041(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
