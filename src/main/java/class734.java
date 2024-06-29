import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class734 {

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10461 = new String[] { method5338(method5337("\u0015l\u0015-F")), method5338(method5337("\u0015l\u0015.F")) };

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field10460;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lcga;")
    public static class490 field10459;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static void method5335(byte arg0) {
        try {
            if (arg0 <= 86) {
                field10459 = null;
            }
            field10459 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10461[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([FIIFIIFFFII)V")
    public abstract void method4556(float[] arg0, int arg1, int arg2, float arg3, int arg4, int arg5, float arg6, float arg7, float arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lpf;")
    public static final class424 method5336(int arg0, int arg1) {
        try {
            field10460++;
            class424 var2 = (class424) class278.field3926.method2053(0, (long) arg1);
            if (var2 != null) {
                return var2;
            }
            byte[] var3 = class314.field4307.method512(arg1, arg0, (byte) -93);
            class424 var4 = new class424();
            if (var3 != null) {
                var4.method3293(new class711(var3), arg0 - 1);
            }
            var4.method3291(-17388);
            class278.field3926.method2051((long) arg1, var4, 93);
            return var4;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10461[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5337(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5338(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 126;
                    break;
                case 1:
                    var10005 = 15;
                    break;
                case 2:
                    var10005 = 59;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 110;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
