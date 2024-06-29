import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class562 {

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8357 = new String[] { method4201(method4200("\u001a\u001c}]")), method4201(method4200("\u000fG?\u001f\u001b")), method4201(method4200("\u0016\u000f?pN")), method4201(method4200("\u0016\u000f?sN")), method4201(method4200("\u0016\u000f?rN")) };

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Lel;")
    public static class573 field8350 = new class573(79, 17);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field8355 = 0;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lwia;")
    public static class790 field8354 = new class790(56, -1);

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Lda;")
    public static class67 field8349;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 5)
    public static void method4197(byte arg0) {
        try {
            field8350 = null;
            field8349 = null;
            field8354 = null;
            if (arg0 < 73) {
                field8349 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8357[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Z", line = 17)
    public static final boolean method4198(int arg0) {
        try {
            field8353++;
            return class84.field940 == arg0 ? class396.field5927.method4555(88) : true;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8357[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([BII)[B", line = 33)
    public static final byte[] method4199(byte[] arg0, int arg1, int arg2) {
        try {
            field8352++;
            if (arg2 > -113) {
                field8350 = null;
            }
            byte[] var3 = new byte[arg1];
            class467.method3556(arg0, 0, var3, 0, arg1);
            return var3;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8357[2] + (arg0 == null ? field8357[0] : field8357[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4200(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x66);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4201(char[] arg0) {
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
                    var10005 = 105;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 49;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
