import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class745 {

    @OriginalMember(owner = "client!bia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10575 = new String[] { method5396(method5395("BN<Ay\b")), method5396(method5395("BN<Az\b")) };

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
    public static int field10570;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
    public int field10574;

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "Llga;")
    public static class47 field10573;

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "Lud;")
    public class714 field10571;

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "[I")
    public int[] field10572;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(Z)V", line = 9)
    public static void method5393(boolean arg0) {
        try {
            if (arg0) {
                field10573 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10575[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIIIIZIIII)Z", line = 21)
    public static final boolean method5394(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field10570++;
            if (!class169.method1424(arg0, 0, arg1, arg3)) {
                return false;
            }
            int var12 = class305.field4247[0];
            int var15 = class305.field4247[2];
            int var13 = class305.field4247[1];
            if (!class169.method1424(arg9, 0, arg2, arg7)) {
                return false;
            }
            int var18 = class305.field4247[2];
            int var14 = class305.field4247[1];
            if (arg5) {
                field10573 = null;
            }
            int var20 = class305.field4247[0];
            if (class169.method1424(arg4, 0, arg6, arg8)) {
                int var17 = class305.field4247[1];
                int var16 = class305.field4247[0];
                int var19 = class305.field4247[2];
                return class358.method2863(false, var19, var15, var13, var17, var16, var14, var18, var20, var12);
            } else {
                return false;
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field10575[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!bia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5395(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5396(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 111;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
