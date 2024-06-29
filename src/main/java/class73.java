import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class73 {

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field1062 = method764(method763("\u0006\u000bF?\bD"));

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "I")
    public static int field1060 = 0;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V", line = 5)
    public static final void method762(int arg0) {
        try {
            if (arg0 != 0) {
                method762(-2);
            }
            field1061++;
            if (class298.field4155 != null) {
                class298.field4155.method2233((byte) -2);
            }
            if (class28.field356 != null) {
                while (true) {
                    try {
                        class28.field356.join();
                        return;
                    } catch (InterruptedException var2) {
                    }
                }
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1062 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method763(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method764(char[] arg0) {
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
                    var10005 = 109;
                    break;
                case 2:
                    var10005 = 39;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
