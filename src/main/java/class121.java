import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class121 extends class528 {

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1433 = new String[] { method1055(method1054("\u000e/5pe")), method1055(method1054("\u000e/5}e")) };

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "[I")
    public static int[] field1428 = new int[8];

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "Lwia;")
    public static class790 field1429 = new class790(58, -1);

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1430 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "[Lkl;")
    public static class87[] field1432 = new class87[14];

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "Z")
    public static boolean field1431;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    public static final void method1052(int arg0) {
        try {
            if (class104.field1209 == 1 || class104.field1209 == 3 || class490.field7035 != class104.field1209 && (class104.field1209 == 0 || class490.field7035 == 0)) {
                class6.field60 = 0;
                class750.field10912 = 0;
                class207.field3184.method970(-95);
            }
            if (arg0 != 0) {
                method1052(-84);
            }
            field1427++;
            class490.field7035 = class104.field1209;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1433[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V")
    public static void method1053(byte arg0) {
        try {
            field1430 = null;
            field1429 = null;
            if (arg0 == 30) {
                field1432 = null;
                field1428 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1433[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1054(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1055(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 124;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
