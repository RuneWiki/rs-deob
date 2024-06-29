import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class227 {

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3476 = new String[] { method1966(method1965(":f")), method1966(method1965("1kr@\u000b")), method1966(method1965(" #r/^")), method1966(method1965("5x0m")), method1966(method1965("1krE\u000b")), method1966(method1965("1krB\u000b")) };

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field3469 = 0;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lum;")
    public static class550 field3475 = new class550("", 16);

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "F")
    public static float field3472;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lla;")
    public static class476 field3474;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLjava/lang/String;I)I")
    public static final int method1961(boolean arg0, String arg1, int arg2) {
        try {
            field3470++;
            return arg0 ? class297.method2508((byte) -52, arg1, true, arg2) : 40;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3476[5] + arg0 + ',' + (arg1 == null ? field3476[3] : field3476[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static void method1962(byte arg0) {
        try {
            if (arg0 != -79) {
                method1962((byte) -121);
            }
            field3475 = null;
            field3474 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3476[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;BI)Ltha;")
    public static final class308 method1963(String arg0, byte arg1, int arg2) {
        try {
            field3471++;
            class308 var3;
            try {
                if (arg1 > -76) {
                    return null;
                }
                var3 = (class308) Class.forName(field3476[0]).getDeclaredConstructor().newInstance();
            } catch (Throwable var5) {
                var3 = new class468();
            }
            var3.field4837 = arg0;
            var3.field4841 = arg2;
            return var3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3476[1] + (arg0 == null ? field3476[3] : field3476[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(FFIIIIIFI[FF)V")
    public abstract void method1964(float arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float arg7, int arg8, float[] arg9, float arg10);

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1965(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1966(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 91;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
