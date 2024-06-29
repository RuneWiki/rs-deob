import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class534 {

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7827 = new String[] { method4035(method4034("\u0001\u0010Fyb")), method4035(method4034("\u0001\u0010Fzb")) };

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Z")
    public static boolean field7820 = false;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "S")
    public static short field7822 = 256;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field7821 = 0;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "[I")
    public static int[] field7824 = new int[2048];

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "[I")
    public static int[] field7825 = new int[32];

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "[Lbq;")
    public static class305[] field7826 = new class305[50];

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    public static int field7823;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V", line = 16)
    public static void method4032(int arg0) {
        try {
            if (arg0 == 0) {
                field7824 = null;
                field7825 = null;
                field7826 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7827[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V", line = 45)
    public static final void method4033(int arg0) {
        try {
            class489.field7027 = "";
            class122.field1439 = "";
            if (arg0 >= -53) {
                field7825 = null;
            }
            field7823++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7827[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4034(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4035(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 104;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 74;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
