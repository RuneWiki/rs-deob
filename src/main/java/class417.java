import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class417 extends class459 {

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    public int field6597;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "[Ljava/lang/String;")
    private static final String[] field6599 = new String[] { method3327(method3326("%B>\u0004[")), method3327(method3326("%B>\u0006[")), method3327(method3326("%B>y\u001a<Ad{[")) };

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "[F")
    public static float[] field6592 = new float[4];

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "[B")
    public static byte[] field6595 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public static int field6594 = 0;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public static int field6593 = -1;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "Lmp;")
    public static class796 field6596;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)Z", line = 4)
    public static final boolean method3324(int arg0, byte arg1) {
        try {
            field6591++;
            if (arg1 == -25) {
                return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6599[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V", line = 26)
    public static void method3325(int arg0) {
        try {
            int var1 = -21 / ((arg0 - 53) / 59);
            field6595 = null;
            field6596 = null;
            field6592 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6599[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(I)V", line = 46)
    public class417(int arg0) {
        try {
            this.field6597 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6599[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method3154(int arg0);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)Z")
    public abstract boolean method3155(int arg0);

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3326(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x73);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3327(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 40;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 115;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
