import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class104 extends class795 {

    @OriginalMember(owner = "client!qfa", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field1527 = new String[] { method988(method987("~g\u0001- '")), method988(method987("~g\u0001-!'")) };

    @OriginalMember(owner = "client!qfa", name = "F", descriptor = "Liha;")
    public static class29 field1524 = new class29(50);

    @OriginalMember(owner = "client!qfa", name = "H", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!qfa", name = "E", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!qfa", name = "G", descriptor = "Lgda;")
    public static class58 field1526;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "(I)V", line = 3)
    public static void method985(int arg0) {
        try {
            field1524 = null;
            field1526 = null;
            if (arg0 != 27615) {
                field1524 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1527[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(IIIIB)V", line = 15)
    public final void method986(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            ++field1525;
            int var6 = super.field11616.method26();
            if (arg4 != -7) {
                method985(116);
            }
            int var7 = ((class443) super.field3648).field6911 * class300.method2584((byte) -56) / 10 % var6;
            super.field11616.method1002(-var6 + var7 + arg3, arg2, arg0 + var6 - var7, arg1);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1527[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lgda;Lgda;Lmja;)V", line = 37)
    public class104(class58 arg0, class58 arg1, class443 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method987(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 107);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method988(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 15;
                    break;
                case 1:
                    var10005 = 1;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
