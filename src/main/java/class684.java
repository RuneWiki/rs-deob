import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class684 {

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9900 = new String[] { method4989(method4988("E\u001f\u0016T")), method4989(method4988("PDT\u0016u")), method4989(method4988("[\bTy ")) };

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[FI)[F")
    public static final float[] method4987(int arg0, float[] arg1, int arg2) {
        try {
            if (arg0 != -1396) {
                method4987(-76, null, -13);
            }
            field9898++;
            float[] var3 = new float[arg2];
            class405.method3258(arg1, 0, var3, 0, arg2);
            return var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9900[2] + arg0 + ',' + (arg1 == null ? field9900[0] : field9900[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4988(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x8);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4989(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 43;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 122;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 8;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
