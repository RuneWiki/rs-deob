import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class379 {

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6118 = new String[] { method3112(method3111("*\u0000b<e")), method3112(method3111("*\u0000b?e")) };

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "[I")
    public static int[] field6114 = new int[4];

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lr;")
    public class192 field6115;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lka;")
    public class499 field6116;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
    public static final void method3109(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg4 != 4) {
                field6114 = null;
            }
            if (class310.field5088 <= arg0 && arg0 <= class478.field7264) {
                int var7 = class694.method5039(class779.field11374, class546.field8030, 0, arg1);
                int var8 = class694.method5039(class779.field11374, class546.field8030, 0, arg2);
                class212.method1914(var8, var7, true, arg0, arg3);
            }
            field6117++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6118[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
    public static void method3110(int arg0) {
        try {
            field6114 = null;
            if (arg0 != 4) {
                method3110(117);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6118[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3111(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3112(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 92;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 126;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
