import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class303 extends class568 {

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4889 = new String[] { method2607(method2606("/\u0003n#\\m")), method2607(method2606("/\u0003n#_m")) };

    @OriginalMember(owner = "client!jfa", name = "m", descriptor = "Liha;")
    public static class29 field4880 = new class29(8);

    @OriginalMember(owner = "client!jfa", name = "n", descriptor = "I")
    public int field4883;

    @OriginalMember(owner = "client!jfa", name = "r", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!jfa", name = "s", descriptor = "I")
    public int field4888;

    @OriginalMember(owner = "client!jfa", name = "p", descriptor = "Lgda;")
    public static class58 field4882;

    @OriginalMember(owner = "client!jfa", name = "l", descriptor = "[I")
    public int[] field4878;

    @OriginalMember(owner = "client!jfa", name = "o", descriptor = "[I")
    public int[] field4879;

    @OriginalMember(owner = "client!jfa", name = "u", descriptor = "[I")
    public int[] field4885;

    @OriginalMember(owner = "client!jfa", name = "q", descriptor = "[Luga;")
    public class218[] field4884;

    @OriginalMember(owner = "client!jfa", name = "v", descriptor = "[Luga;")
    public class218[] field4886;

    @OriginalMember(owner = "client!jfa", name = "t", descriptor = "[[[B")
    public byte[][][] field4881;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IZI)V")
    public static final void method2604(int arg0, boolean arg1, int arg2) {
        try {
            field4887++;
            if (arg2 != 8) {
                method2604(88, false, 43);
            }
            if (arg1) {
                class487 var3 = class618.method4519(23, class632.field9084, class185.field2948.field2659);
                var3.field7362.method1650((byte) -95, arg0);
                class185.field2948.method1546(var3, 1);
            } else {
                class598.method4382(class310.field5080, arg0, -1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4889[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(B)V")
    public static void method2605(byte arg0) {
        try {
            if (arg0 < 26) {
                field4882 = null;
            }
            field4882 = null;
            field4880 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4889[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2606(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2607(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 101;
                    break;
                case 2:
                    var10005 = 15;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
