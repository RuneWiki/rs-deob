import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public abstract class class313 {

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5125 = new String[] { method2688(method2687("=.R\u000f?r")), method2688(method2687("=.R\u000f<r")), method2688(method2687("=.R\u000f:r")), method2688(method2687("4:_M")), method2688(method2687("!a\u001d\u000f\u0003")), method2688(method2687("=.R\u000f=r")) };

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "I")
    public static int field5119 = 0;

    @OriginalMember(owner = "client!gaa", name = "d", descriptor = "Lua;")
    public static class696 field5120 = new class696(4);

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "I")
    public static int field5122 = -1;

    @OriginalMember(owner = "client!gaa", name = "g", descriptor = "S")
    public static short field5121 = 1;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field5123 = 0;

    @OriginalMember(owner = "client!gaa", name = "h", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!gaa", name = "c", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(II)I", line = 12)
    public static final int method2683(int arg0, int arg1) {
        try {
            field5118++;
            if (arg1 != 255) {
                field5123 = 63;
            }
            return arg0 & 0xFF;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5125[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V", line = 23)
    public static void method2684(byte arg0) {
        try {
            field5120 = null;
            if (arg0 != -93) {
                field5119 = 30;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5125[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BLjava/lang/String;)I", line = 34)
    public static final int method2685(byte arg0, String arg1) {
        try {
            field5124++;
            if (arg0 != -40) {
                field5122 = 84;
            }
            return arg1.length() + 2;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5125[2] + arg0 + ',' + (arg1 == null ? field5125[3] : field5125[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(BZLsja;)V", line = 57)
    public static final void method2686(byte arg0, boolean arg1, class10 arg2) {
        try {
            if (arg0 != 32) {
                field5120 = null;
            }
            if (arg2.field117) {
                if (arg2.field124 < 0 || class97.method934((byte) 118, arg2.field111, arg2.field124)) {
                    if (arg1) {
                        class771.method5567(true, arg2.field116, null, arg2.field110, arg2.field120, arg2.field114);
                    } else {
                        class370.method3046(arg2.field114, arg2.field120, arg2.field111, arg2.field110, arg2.field116, arg2.field124, -1, arg2.field112, 82);
                    }
                    arg2.method4173(-1);
                }
            } else if (arg2.field122 && arg2.field114 >= 1 && arg2.field116 >= 1 && arg2.field114 <= (class126.field1823 - 2) && class169.field2725 - 2 >= arg2.field116 && (arg2.field123 < 0 || class97.method934((byte) 118, arg2.field119, arg2.field123))) {
                if (arg1) {
                    class771.method5567(true, arg2.field116, arg2.field118, arg2.field110, arg2.field120, arg2.field114);
                } else {
                    class370.method3046(arg2.field114, arg2.field120, arg2.field119, arg2.field110, arg2.field116, arg2.field123, -1, arg2.field125, 87);
                }
                arg2.field122 = false;
                if (!arg1 && arg2.field124 == arg2.field123 && arg2.field124 == -1) {
                    arg2.method4173(-1);
                } else if (!arg1 && arg2.field124 == arg2.field123 && arg2.field125 == arg2.field112 && arg2.field119 == arg2.field111) {
                    arg2.method4173(-1);
                }
            }
            field5117++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5125[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5125[3] : field5125[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2687(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2688(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
