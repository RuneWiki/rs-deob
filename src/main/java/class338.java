import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class338 {

    @OriginalMember(owner = "client!fda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5514 = new String[] { method2853(method2852("\u0003\u0000oCZM")), method2853(method2852("\u001eJ Cf")), method2853(method2852("\u000b\u0011b\u0001")), method2853(method2852("\u0003\u0000oCYM")), method2853(method2852("\u0001\u000bm\u0018v\u0000\nzCx\n\u000be\u0004~XF")), method2853(method2852("^Dx\bi\u0016\ra\u0003&T_.\u001dz\u0011\f3B E\u0000a\u0000z\f\n3")), method2853(method2852("\u0006\u000ba\u0006r\u0000\fa\u001eo")), method2853(method2852("\u0003\u0000oCXM")), method2853(method2852("\u0010\u0017|\tt\u0007Y")) };

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public static int field5507 = -1;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5506 = new String[8];

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "[F")
    public static float[] field5510 = new float[4];

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public static int field5512 = -1;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "[C")
    private static char[] field5508 = new char[64];

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "Lhk;")
    public static class107 field5513;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "Lde;")
    public static class559 field5509;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field5508[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field5508[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field5508[var2] = (char) (var2 + 48 - 52);
        }
        field5508[62] = '+';
        field5508[63] = '/';
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2849(boolean arg0) {
        try {
            field5511++;
            if (class476.field7255 != null) {
                try {
                    String var1 = class476.field7255.getParameter(field5514[6]);
                    if (arg0) {
                        method2849(true);
                    }
                    int var2 = (int) (class712.method5167(-2334) / 86400000L) - 11745;
                    String var3 = field5514[8] + var2 + field5514[5] + var1;
                    class470.method3618(field5514[4] + var3 + "\"", 14868, class476.field7255);
                } catch (Throwable var5) {
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5514[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V", line = 41)
    public static void method2850(int arg0) {
        try {
            field5513 = null;
            if (arg0 == -563) {
                field5510 = null;
                field5508 = null;
                field5509 = null;
                field5506 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5514[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lmj;B)V", line = 59)
    public static final void method2851(class683 arg0, byte arg1) {
        try {
            field5505++;
            if (class501.field7499) {
                class12.field143++;
                if (arg0.field9818 != null) {
                    class683 var2 = class454.method3528(arg1 + 7, class671.field9527, class626.field9017);
                    if (var2 != null) {
                        class730 var3 = new class730();
                        var3.field10690 = var2;
                        var3.field10692 = arg0.field9818;
                        var3.field10693 = arg0;
                        class598.method4378(var3);
                    }
                }
                if (arg1 != -7) {
                    field5512 = -2;
                }
                class487 var4 = class618.method4519(108, class764.field11204, class185.field2948.field2659);
                var4.field7362.method1641((byte) -108, arg0.field9774);
                var4.field7362.method1650((byte) -95, arg0.field9807);
                var4.field7362.method1639(class671.field9527, 128);
                var4.field7362.method1639(arg0.field9799, 128);
                var4.field7362.method1650((byte) -95, class167.field2708);
                var4.field7362.method1641((byte) -108, class626.field9017);
                class185.field2948.method1546(var4, arg1 + 8);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field5514[0] + (arg0 == null ? field5514[2] : field5514[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2852(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2853(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 101;
                    break;
                case 1:
                    var10005 = 100;
                    break;
                case 2:
                    var10005 = 14;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
