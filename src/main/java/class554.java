import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class554 {

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8110 = new String[] { method4105(method4104(":\u001b\u0004\u0005*")), method4105(method4104(":\u001b\u0004\u0006*")) };

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "[I")
    public static int[] field8107 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "Z")
    public static boolean field8108 = false;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V")
    public static final void method4102(byte arg0, int arg1) {
        try {
            if (arg1 < 0 || arg1 > 2) {
                arg1 = 0;
            }
            field8106++;
            if (arg0 <= -120) {
                class395.field6272 = arg1;
                class640.field9186 = new class92[class350.field5665[class395.field6272] + 1];
                class164.field2654 = 0;
                class497.field7453 = 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8110[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method4103(int arg0) {
        try {
            if (arg0 == 4687) {
                field8107 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8110[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4104(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4105(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 86;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 42;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
