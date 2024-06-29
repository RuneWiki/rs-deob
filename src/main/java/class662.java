import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class662 {

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9572 = new String[] { method4859(method4858("s}\u0012nj")), method4859(method4858("s}\u0012mj")), method4859(method4858("s}\u0012lj")) };

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "Lel;")
    public static class573 field9567 = null;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "B")
    public byte field9568;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field9565;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public int field9569;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "I")
    public static int field9570;

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Ljava/lang/String;")
    public String field9571;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)V", line = 5)
    public static final void method4855(int arg0, int arg1) {
        try {
            field9565++;
            class313 var2 = class196.method1670((long) arg0, 12, -86);
            var2.method2635(true);
            if (arg1 != -29990) {
                field9567 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field9572[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIZIIIII)V", line = 19)
    public static final void method4856(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            if (arg4 > 88) {
                field9566++;
                if ((arg2 ? class289.field4305.field841.method4492(false) : class289.field4305.field838.method4492(false)) != 0 && arg5 != 0 && class86.field958 < 50 && arg1 != -1) {
                    class534.field7826[class86.field958++] = new class305((byte) (arg2 ? 3 : 2), arg1, arg5, arg6, arg7, arg3, arg0, null);
                }
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9572[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)V", line = 37)
    public static void method4857(boolean arg0) {
        try {
            if (arg0) {
                method4855(-14, -49);
            }
            field9567 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9572[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4858(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4859(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
