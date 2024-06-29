import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class153 {

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2140 = new String[] { method1390(method1389("\u0003/)\nj")), method1390(method1389("\u0003/)\tj")) };

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "Lhl;")
    public static class556 field2138 = new class556(93, 0);

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "Lgda;")
    public static class58 field2139;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)Z")
    public static final boolean method1387(int arg0, int arg1, int arg2) {
        try {
            field2135++;
            if (arg0 != 0) {
                method1388(-117);
            }
            return (arg2 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2140[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public static void method1388(int arg0) {
        try {
            field2138 = null;
            if (arg0 < -65) {
                field2139 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2140[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1389(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1390(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 7;
                    break;
                case 3:
                    var10005 = 72;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
