import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class189 {

    @OriginalMember(owner = "client!sha", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field2521 = method1589(method1588("\u0007\u0003\u0015\u0000@\\"));

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "[S")
    private static short[] field2508 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!sha", name = "m", descriptor = "I")
    public static int field2510 = 1337;

    @OriginalMember(owner = "client!sha", name = "k", descriptor = "I")
    public static int field2516 = 0;

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "[S")
    private static short[] field2506 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "[S")
    private static short[] field2513 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "[S")
    private static short[] field2520 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!sha", name = "l", descriptor = "[[S")
    public static short[][] field2515 = new short[][] { field2506, field2520, field2508, field2513 };

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!sha", name = "h", descriptor = "I")
    public int field2511;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "I")
    public int field2514;

    @OriginalMember(owner = "client!sha", name = "n", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!sha", name = "o", descriptor = "I")
    public int field2519;

    @OriginalMember(owner = "client!sha", name = "i", descriptor = "Loc;")
    public static class760 field2507;

    @OriginalMember(owner = "client!sha", name = "f", descriptor = "Z")
    public static boolean field2517;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)V")
    public static void method1587(byte arg0) {
        try {
            field2508 = null;
            field2515 = null;
            field2520 = null;
            field2506 = null;
            field2513 = null;
            if (arg0 != -36) {
                field2510 = 46;
            }
            field2507 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field2521 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1588(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1589(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 107;
                    break;
                case 2:
                    var10005 = 116;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
