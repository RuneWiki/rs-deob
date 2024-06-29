import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class589 {

    @OriginalMember(owner = "client!via", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8665 = new String[] { method4388(method4387("\u0010Y7+ N")), method4388(method4387("\u0010Y7+#N")), method4388(method4387("\u001d\u001ex+\u001f")), method4388(method4387("\bE:i")) };

    @OriginalMember(owner = "client!via", name = "c", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!via", name = "b", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!via", name = "d", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "Lla;")
    public static class476 field8661;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IILcn;)I")
    public static final int method4385(int arg0, int arg1, class541 arg2) {
        try {
            field8662++;
            if (arg0 != -1) {
                field8663 = 125;
            }
            if (!client.method2670(arg2).method3558(true, arg1) && arg2.field8095 == null) {
                return -1;
            } else if (arg2.field8024 == null || arg2.field8024.length <= arg1) {
                return -1;
            } else {
                return arg2.field8024[arg1];
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8665[1] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8665[3] : field8665[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Z)V")
    public static void method4386(boolean arg0) {
        try {
            field8661 = null;
            if (arg0) {
                field8661 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8665[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!via", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4387(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x62);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!via", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4388(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 102;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 98;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
