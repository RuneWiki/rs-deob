import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class290 {

    @OriginalMember(owner = "client!up", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4316 = new String[] { method2357(method2356("5\u0004Ha9")), method2357(method2356("5\u0004HT~\u0013\u0000\u0014I\u007f'\\")), method2357(method2356("5\u0004Hc9")), method2357(method2356("5\u0004Hb9")) };

    @OriginalMember(owner = "client!up", name = "c", descriptor = "D")
    public static double field4309;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!up", name = "f", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!up", name = "g", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!up", name = "e", descriptor = "Lsg;")
    public static class417 field4311;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "Lqq;")
    public static class501 field4310;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(II)Z")
    public static final boolean method2353(int arg0, int arg1) {
        try {
            field4312++;
            if (arg1 == -5) {
                return arg0 == 3 || arg0 == 4;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4316[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
    public static final void method2354(byte arg0) {
        try {
            class178 var1 = class514.field7406;
            synchronized (class514.field7406) {
                class514.field7406.method1569(10574);
            }
            field4315++;
            class178 var2 = class548.field8184;
            synchronized (class548.field8184) {
                if (arg0 < 82) {
                    method2354((byte) 43);
                }
                class548.field8184.method1569(10574);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field4316[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(I)V")
    public static void method2355(int arg0) {
        try {
            field4311 = null;
            field4310 = null;
            if (arg0 != 3) {
                method2355(-95);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4316[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!up", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field4314++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4316[1] + ')');
        }
    }

    @OriginalMember(owner = "client!up", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2356(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x11);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!up", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2357(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 116;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 17;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
