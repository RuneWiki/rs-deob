import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class485 {

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field7123 = method3744(method3743("]\u007f||[\u001d"));

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "Z")
    public static volatile boolean field7121 = true;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "Z")
    public static boolean field7119 = false;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(ZZI)V", line = 13)
    public static final void method3742(boolean arg0, boolean arg1, int arg2) {
        try {
            field7120++;
            if (arg2 != -18448) {
                method3742(true, true, -90);
            }
            if (arg1) {
                class301.field4184--;
                if (class301.field4184 == 0) {
                    class360.field5233 = null;
                }
            }
            if (arg0) {
                class73.field1060--;
                if (class73.field1060 == 0) {
                    class552.field8055 = null;
                    return;
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7123 + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3743(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3744(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 53;
                    break;
                case 1:
                    var10005 = 27;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 82;
                    break;
                default:
                    var10005 = 26;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
