import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class605 {

    @OriginalMember(owner = "client!v", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field8871 = method4485(method4484("Ox\fW"));

    @OriginalMember(owner = "client!v", name = "b", descriptor = "[[I")
    public static int[][] field8863 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!v", name = "d", descriptor = "D")
    public static double field8865;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public int field8866;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field8867;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public int field8869;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "Lika;")
    public static class447 field8870;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "[I")
    public static int[] field8868;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method4483(int arg0) {
        try {
            field8863 = null;
            if (arg0 != 7) {
                method4483(-123);
            }
            field8868 = null;
            field8870 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8871 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!v", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4484(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xF);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!v", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4485(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 86;
                    break;
                case 2:
                    var10005 = 77;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 15;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
