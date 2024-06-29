import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class390 {

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field6233 = method3178(method3177("\u001f\u0003*!;"));

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "[[S")
    private static short[][] field6228 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "[[S")
    private static short[][] field6229 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[I")
    public static int[] field6231 = new int[2];

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "[[S")
    private static short[][] field6232 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[[[S")
    public static short[][][] field6230 = new short[][][] { field6232, field6229, field6228 };

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "F")
    public static float field6225;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "J")
    public static long field6227;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lpj;")
    public static class154 field6226;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method3176(byte arg0) {
        try {
            int var1 = 53 / ((7 - arg0) / 57);
            field6229 = null;
            field6232 = null;
            field6226 = null;
            field6231 = null;
            field6230 = null;
            field6228 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6233 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3177(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x13);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3178(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 111;
                    break;
                case 1:
                    var10005 = 98;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 19;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
