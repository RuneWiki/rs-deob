import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class16 {

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field182 = new String[] { method116(method115("_F\u0011\tY")), method116(method115("@XS$")), method116(method115("U\u0003\u0011f\f")), method116(method115("_F\u0011\nY")) };

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Z")
    public static boolean field177 = false;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Lhl;")
    public static class556 field178 = new class556(6, 10);

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Z")
    public static boolean field181 = false;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILip;II)V", line = 5)
    public static final void method113(int arg0, class738 arg1, int arg2, int arg3) {
        try {
            field180++;
            int[] var4 = new int[4];
            class405.method3257(var4, arg0, var4.length, arg2);
            class292.method2487(var4, arg1, (byte) 17, arg3);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field182[3] + arg0 + ',' + (arg1 == null ? field182[1] : field182[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 20)
    public static void method114(int arg0) {
        try {
            field178 = null;
            int var1 = -77 % ((8 - arg0) / 44);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field182[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method115(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method116(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 46;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 72;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
