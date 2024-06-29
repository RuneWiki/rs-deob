import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class285 {

    @OriginalMember(owner = "client!oha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4017 = new String[] { method2307(method2306("5l#|fr")), method2307(method2306("5l#|gr")), method2307(method2306("5l#|dr")), method2307(method2306("4q.>")), method2307(method2306("!*l|X")) };

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "[I")
    public static int[] field4008 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "S")
    public static short field4011 = 32767;

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "[[B")
    public static byte[][] field4005 = new byte[250][];

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "D")
    public static double field4013;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "I")
    public int field4007;

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!oha", name = "i", descriptor = "I")
    public int field4012;

    @OriginalMember(owner = "client!oha", name = "g", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!oha", name = "h", descriptor = "I")
    public int field4015;

    @OriginalMember(owner = "client!oha", name = "k", descriptor = "I")
    public int field4016;

    @OriginalMember(owner = "client!oha", name = "l", descriptor = "Llga;")
    public static class47 field4006;

    @OriginalMember(owner = "client!oha", name = "j", descriptor = "[I")
    public static int[] field4010;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZI)I")
    public static final int method2303(boolean arg0, int arg1) {
        try {
            field4014++;
            if (class15.field198 == null) {
                return 0;
            } else if (arg0 || class467.field6810 == null) {
                int var2 = 0;
                for (int var3 = 0; var3 < class15.field198.length; var3++) {
                    int var4 = class15.field198[var3];
                    if (class796.field11569.method530(false, var4)) {
                        var2++;
                    }
                    if (class234.field3383.method530(false, var4)) {
                        var2++;
                    }
                }
                if (arg1 != -17827) {
                    method2303(false, 106);
                }
                return var2;
            } else {
                return class15.field198.length * 2;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4017[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method2304(boolean arg0, String arg1) {
        try {
            field4009++;
            if (!arg1.equals("")) {
                class353.field5109++;
                class779 var2 = class85.method851(arg0);
                class274 var3 = class375.method2969((byte) 1, class367.field5330, var2.field11100);
                var3.field3885.method5114(255, class101.method986(arg1, 6743));
                var3.field3885.method5089(arg1, (byte) 25);
                var2.method5608(var3, 29867);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4017[2] + arg0 + ',' + (arg1 == null ? field4017[3] : field4017[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)V")
    public static void method2305(byte arg0) {
        try {
            field4010 = null;
            field4006 = null;
            field4005 = null;
            if (arg0 == 44) {
                field4008 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4017[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2306(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2307(char[] arg0) {
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
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
