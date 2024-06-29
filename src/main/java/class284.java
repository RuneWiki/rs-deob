import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class284 {

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4609 = new String[] { method2421(method2420("H5b-|")), method2421(method2420("X|bB)")), method2421(method2420("H5b.|")), method2421(method2420("M' \u0000")), method2421(method2420("H5b/|")) };

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[B")
    public static byte[] field4605 = new byte[2048];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "Lhl;")
    public static class556 field4607 = new class556(58, 2);

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "F")
    public static float field4604;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZB)V")
    public static final void method2417(boolean arg0, byte arg1) {
        try {
            if (class355.field5711 == null) {
                class410.method3291(0);
            }
            field4608++;
            if (arg1 <= -100 && arg0) {
                class355.field5711.method4930(1);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4609[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lua;I)I")
    public static final int method2418(class696 arg0, int arg1) {
        try {
            if (arg1 != 6410) {
                field4605 = null;
            }
            field4606++;
            if (class556.field8116 == arg0) {
                return 6407;
            } else if (class313.field5120 == arg0) {
                return 6408;
            } else if (class335.field5466 == arg0) {
                return 6406;
            } else if (class411.field6564 == arg0) {
                return 6409;
            } else if (class225.field3529 == arg0) {
                return 6410;
            } else if (class9.field106 == arg0) {
                return 6145;
            } else {
                throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4609[2] + (arg0 == null ? field4609[3] : field4609[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V")
    public static void method2419(byte arg0) {
        try {
            field4605 = null;
            if (arg0 != 25) {
                field4605 = null;
            }
            field4607 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4609[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2420(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x54);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2421(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 82;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
