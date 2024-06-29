import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class173 {

    @OriginalMember(owner = "client!ada", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field2409 = method1535(method1534("g\u00053-j."));

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1533(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        try {
            field2408++;
            int var7 = arg5 - arg4;
            int var8 = arg1 + arg4;
            for (int var9 = arg1; var9 < var8; var9++) {
                class319.method2702(class243.field3731[var9], arg6, arg2, true, arg0);
            }
            int var10 = arg4 + arg6;
            int var11 = arg2 - arg4;
            for (int var12 = arg5; var12 > var7; var12--) {
                class319.method2702(class243.field3731[var12], arg6, arg2, true, arg0);
            }
            for (int var13 = var8; var13 <= var7; var13++) {
                int[] var14 = class243.field3731[var13];
                class319.method2702(var14, arg6, var10, true, arg0);
                class319.method2702(var14, var11, arg2, true, arg0);
            }
            if (arg3 < 53) {
                method1533(72, 21, 30, (byte) -80, -67, -89, -82);
            }
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field2409 + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ada", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1534(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ada", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1535(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 6;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 43;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
