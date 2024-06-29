import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class12 {

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field170 = new String[] { method85(method84("i+g\u0012Ih8t\u0011@y")), method85(method84("l+r")), method85(method84("v#\u007f")), method85(method84("i+g\u0012Fd|")), method85(method84("zd?YR")), method85(method84("d+pYn)")), method85(method84("o?}\u001b")), method85(method84("d+pYm)")), method85(method84("d+pYl)")) };

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "Lcb;")
    public static class700 field163 = new class700();

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "[I")
    public static int[] field164 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "Lmv;")
    public static class125 field169 = new class125(2, 7);

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "Llga;")
    public static class47 field167;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "[I")
    public static int[] field166;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lft;ZLjava/lang/String;IZLjava/lang/String;)V", line = 6)
    public static final void method81(class188 arg0, boolean arg1, String arg2, int arg3, boolean arg4, String arg5) {
        try {
            field162++;
            int var6 = 28 / ((arg3 + 45) / 35);
            if (arg1) {
                if (class188.field2485.startsWith(field170[2]) && arg0.field2479) {
                    String var7 = null;
                    if (class290.field4091 != null) {
                        var7 = class290.field4091.getParameter(field170[3]);
                    }
                    if (var7 == null || !var7.equals("1")) {
                        class328 var8 = class524.method3985(arg0, 0, 105, arg5);
                        class584.field8432 = arg0;
                        class268.field3798 = arg5;
                        class363.field5269 = var8;
                        return;
                    }
                }
                if (class188.field2485.startsWith(field170[1])) {
                    String var9 = null;
                    if (class290.field4091 != null) {
                        var9 = class290.field4091.getParameter(field170[0]);
                    }
                    if (var9 != null && var9.equals("1") && arg4) {
                        class599.method4417(arg5, 1, (byte) 106, arg2, arg0);
                        return;
                    }
                }
                class524.method3985(arg0, 2, 116, arg5);
            } else {
                class524.method3985(arg0, 3, 120, arg5);
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field170[5] + (arg0 == null ? field170[6] : field170[4]) + ',' + arg1 + ',' + (arg2 == null ? field170[6] : field170[4]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field170[6] : field170[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 72)
    public static void method82(int arg0) {
        try {
            field166 = null;
            field163 = null;
            field164 = null;
            field167 = null;
            field169 = null;
            if (arg0 != 3) {
                method81(null, true, null, 29, true, null);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field170[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(JB)I", line = 87)
    public static final int method83(long arg0, byte arg1) {
        try {
            field161++;
            class635.method4635(true, arg0);
            int var3 = -70 % ((arg1 - 43) / 51);
            return class267.field3785.get(1);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field170[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method84(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!eaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method85(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 47;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
