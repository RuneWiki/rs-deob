import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class273 {

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3878 = new String[] { method2242(method2241("{\u0000f)c")), method2242(method2241("`\u0019$\u0004")), method2242(method2241("uBfF6")), method2242(method2241("{\u0000f+c")), method2242(method2241("{\u0000f*c")) };

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field3873 = 0;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Z")
    public static boolean field3872 = false;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field3875 = 0;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3877 = "";

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2238(boolean arg0) {
        try {
            if (arg0) {
                field3872 = false;
            }
            field3877 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3878[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;", line = 17)
    public static final Class method2239(String arg0, byte arg1) throws ClassNotFoundException {
        try {
            field3874++;
            if (arg0.equals("B")) {
                return Byte.TYPE;
            } else if (arg0.equals("I")) {
                return Integer.TYPE;
            } else {
                if (arg1 < 46) {
                    method2238(true);
                }
                if (arg0.equals("S")) {
                    return Short.TYPE;
                } else if (arg0.equals("J")) {
                    return Long.TYPE;
                } else if (arg0.equals("Z")) {
                    return Boolean.TYPE;
                } else if (arg0.equals("F")) {
                    return Float.TYPE;
                } else if (arg0.equals("D")) {
                    return Double.TYPE;
                } else if (arg0.equals("C")) {
                    return Character.TYPE;
                } else {
                    return Class.forName(arg0);
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3878[0] + (arg0 == null ? field3878[1] : field3878[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V", line = 57)
    public static final void method2240(int arg0, boolean arg1) {
        try {
            if (arg0 != 16664) {
                method2238(false);
            }
            class705.method5058(class391.field5700, arg1, class711.field9998, class572.field8291, (byte) -85);
            field3876++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3878[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2241(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2242(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
