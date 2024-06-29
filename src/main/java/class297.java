import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class297 extends class513 {

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "J")
    public long field3998;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "[I")
    public static int[] field3996 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "J")
    public static long field3997 = 0L;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "[B")
    public static byte[] field3999 = new byte[] { 31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0 };

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1763(String arg0, byte arg1) {
        field4000++;
        StringBuffer var2 = new StringBuffer();
        int var3 = arg0.length();
        int var4 = 0;
        if (arg1 != 14) {
            field3997 = 82L;
        }
        while (var3 > var4) {
            char var5 = arg0.charAt(var4);
            if (var5 == '%' && var3 > (var4 + 2)) {
                label94: {
                    char var6 = arg0.charAt(var4 + 1);
                    boolean var7 = false;
                    int var8;
                    if (var6 >= '0' && var6 <= '9') {
                        var8 = var6 - '0';
                    } else if (var6 >= 'a' && var6 <= 'f') {
                        var8 = var6 - 87;
                    } else {
                        if (var6 < 'A' || var6 > 'F') {
                            var2.append('%');
                            break label94;
                        }
                        var8 = var6 + 10 - 65;
                    }
                    char var9 = arg0.charAt(var4 + 2);
                    int var10 = var8 * 16;
                    int var11;
                    if (var9 >= '0' && var9 <= '9') {
                        var11 = var9 + var10 - '0';
                    } else if (var9 >= 'a' && var9 <= 'f') {
                        var11 = var9 + var10 + '\n' - 97;
                    } else {
                        if (var9 < 'A' || var9 > 'F') {
                            var2.append('%');
                            break label94;
                        }
                        var11 = var9 + var10 - 55;
                    }
                    if (var11 != 0 && class36.method418((byte) var11, true)) {
                        var2.append(class507.method3016((byte) -88, (byte) var11));
                    }
                    var4 += 2;
                }
            } else if (var5 == '+') {
                var2.append(' ');
            } else {
                var2.append(var5);
            }
            var4++;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
    public class297() {
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lvda;BLvda;)V")
    public static final void method1764(class164 arg0, byte arg1, class164 arg2) {
        if (arg0.field2002 != null) {
            arg0.method1037(-127);
        }
        field4001++;
        int var3 = 40 / ((47 - arg1) / 37);
        arg0.field2002 = arg2;
        arg0.field2003 = arg2.field2003;
        arg0.field2002.field2003 = arg0;
        arg0.field2003.field2002 = arg0;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(J)V")
    public class297(long arg0) {
        this.field3998 = arg0;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public static void method1765(byte arg0) {
        if (arg0 > 58) {
            field3996 = null;
            field3999 = null;
        }
    }
}
