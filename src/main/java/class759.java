import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class759 {

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11008 = new String[] { method5502(method5501("N;;b{")), method5502(method5501("N;;`{")) };

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "Lvaa;")
    public static class494 field11002 = new class494(8, 1);

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "[I")
    public static int[] field11006 = new int[1];

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field11003;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field11004;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field11005;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field11007;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwea;", line = 3)
    public static final class166 method5498(Throwable arg0, String arg1) {
        field11005++;
        class166 var2;
        if (arg0 instanceof class166) {
            var2 = (class166) arg0;
            var2.field2286 = var2.field2286 + ' ' + arg1;
        } else {
            var2 = new class166(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)V", line = 22)
    public static void method5499(boolean arg0) {
        try {
            if (!arg0) {
                field11002 = null;
            }
            field11002 = null;
            field11006 = null;
        } catch (RuntimeException var2) {
            throw method5498(var2, field11008[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)I", line = 35)
    public static final int method5500(int arg0, int arg1) {
        try {
            field11003++;
            if (arg0 != 32) {
                method5499(false);
            }
            int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
            int var3 = arg1 * 6 - 61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } catch (RuntimeException var6) {
            throw method5498(var6, field11008[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5501(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5502(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 44;
                    break;
                case 1:
                    var10005 = 84;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
