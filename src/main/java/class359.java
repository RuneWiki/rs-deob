import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class359 extends class731 {

    @OriginalMember(owner = "client!cs", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field5805 = new String[] { method2974(method2973("!\u000e}cM")), method2974(method2973("!\u000e}`M")), method2974(method2973("!\u000e}aM")) };

    @OriginalMember(owner = "client!cs", name = "F", descriptor = "I")
    public static int field5799 = 0;

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "I")
    public static int field5803 = 1409;

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!cs", name = "E", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!cs", name = "G", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!cs", name = "B", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIII)V")
    public final void method1254(int arg0, int arg1, int arg2, int arg3) {
        try {
            super.field10706 = arg2;
            super.field10712 = arg3;
            super.field10709 = arg0;
            if (arg1 == 64) {
                ++field5802;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5805[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(III)Z")
    public static final boolean method2972(int arg0, int arg1, int arg2) {
        try {
            ++field5804;
            if (arg2 != -1298) {
                method2972(-59, 21, 12);
            }
            return (class319.method2736((byte) 114, arg0, arg1) | ~(arg0 & 8192) != -1 | class481.method3670(arg0, false, arg1)) & class525.method3925(arg1, arg0, (byte) -4);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5805[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BF)V")
    public final void method1257(byte arg0, float arg1) {
        try {
            if (arg0 != 86) {
                field5803 = 103;
            }
            super.field10714 = arg1;
            ++field5800;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5805[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(IIIIIF)V")
    public class359(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2973(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 101);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2974(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 66;
                    break;
                case 1:
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 83;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 101;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
