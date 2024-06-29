import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class213 {

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3129 = new String[] { method1795(method1794("N2fSe")), method1795(method1794("N2fPe")), method1795(method1794("N2fRe")) };

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "Lqp;")
    public static class277 field3127;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "[Ls;")
    public static class751[] field3124;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZII)Z", line = 5)
    public static final boolean method1791(boolean arg0, int arg1, int arg2) {
        try {
            field3125++;
            if (arg0) {
                field3124 = null;
            }
            return (arg1 & 0x37) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3129[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V", line = 17)
    public static void method1792(byte arg0) {
        try {
            field3127 = null;
            field3124 = null;
            if (arg0 != -116) {
                method1793(0.86714077F, -75, 1.0879734F, -1.0356377F);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3129[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(FIFF)I", line = 32)
    public static final int method1793(float arg0, int arg1, float arg2, float arg3) {
        try {
            field3126++;
            float var4 = (arg2 < 0.0F) ? -arg2 : arg2;
            float var5 = (arg0 < (float) arg1) ? -arg0 : arg0;
            float var6 = (arg3 < 0.0F) ? -arg3 : arg3;
            if (var4 < var5 && var5 > var6) {
                return arg0 > 0.0F ? 0 : 1;
            } else if (var6 > var4 && var5 < var6) {
                return (arg3 > 0.0F) ? 2 : 3;
            } else if ((arg2 > 0.0F)) {
                return 4;
            } else {
                return 5;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3129[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1794(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1795(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 90;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
