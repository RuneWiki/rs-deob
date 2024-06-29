import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public abstract class class682 extends class578 {

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field9577 = method4894(method4893("Pr\u0003TF\u000e"));

    @OriginalMember(owner = "client!vha", name = "k", descriptor = "[I")
    public static int[] field9574 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!vha", name = "j", descriptor = "[I")
    public static int[] field9573 = new int[13];

    @OriginalMember(owner = "client!vha", name = "i", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!vha", name = "l", descriptor = "Lgd;")
    public static class133 field9576;

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "(I)I")
    public abstract int method1087(int arg0);

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)I")
    public abstract int method1086(byte arg0);

    @OriginalMember(owner = "client!vha", name = "g", descriptor = "(I)J")
    public abstract long method1085(int arg0);

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)I")
    public abstract int method1088(int arg0);

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(I)I")
    public abstract int method1084(int arg0);

    @OriginalMember(owner = "client!vha", name = "f", descriptor = "(I)V")
    public static void method4892(int arg0) {
        try {
            field9573 = null;
            field9576 = null;
            if (arg0 != -6) {
                field9574 = null;
            }
            field9574 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field9577 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4893(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xE);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4894(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 98;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
