import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class759 {

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10835 = new String[] { method5504(method5503("N{Ht=")), method5504(method5503("N{Hw=")) };

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "[Lfv;")
    public static class441[] field10834 = new class441[50];

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
    public static int field10833;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V", line = 4)
    public static final void method5501(int arg0) {
        try {
            if (arg0 < 74) {
                field10834 = null;
            }
            field10833++;
            if (class513.field7523 != null) {
                try {
                    class513.field7523.close();
                } catch (IOException var2) {
                }
            }
            class513.field7523 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10835[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 31)
    public static void method5502(byte arg0) {
        try {
            field10834 = null;
            int var1 = 107 / ((26 - arg0) / 41);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10835[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5503(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5504(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 20;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
