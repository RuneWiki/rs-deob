import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public abstract class class547 {

    @OriginalMember(owner = "client!hha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8043 = new String[] { method4065(method4064("\n\u000b[F\u0015J")), method4065(method4064("\n\u000b[F\u0013J")), method4065(method4064("\n\u000b[F\u0016J")), method4065(method4064("\n\u000b[F\u0014J")) };

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "I")
    public static int field8034 = 0;

    @OriginalMember(owner = "client!hha", name = "i", descriptor = "I")
    public static int field8037 = 7000;

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "I")
    public static int field8042 = field8037;

    @OriginalMember(owner = "client!hha", name = "h", descriptor = "Lv;")
    public static class606 field8036 = new class606(16);

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
    public int field8038;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
    public static int field8040;

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!hha", name = "e", descriptor = "Ljava/lang/String;")
    public String field8039;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(BII)Z")
    public static final boolean method4059(byte arg0, int arg1, int arg2) {
        try {
            if (arg0 > -98) {
                method4060(-123);
            }
            field8041++;
            return (arg1 & 0x60000) != 0 | class332.method2805(arg1, (byte) -42, arg2) || class531.method3968(arg1, (byte) 2, arg2);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field8043[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "(I)V")
    public static final void method4060(int arg0) {
        try {
            if (arg0 == 0) {
                field8040++;
                class285.field4613.method730(true);
                class497.field7458.method730(true);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8043[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method4061(int arg0) throws IOException;

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method4062(int arg0) throws IOException {
        try {
            if (arg0 <= 34) {
                method4060(-29);
            }
            field8035++;
            return new Socket(this.field8039, this.field8038);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8043[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "(I)V")
    public static void method4063(int arg0) {
        try {
            if (arg0 != 393216) {
                field8034 = -6;
            }
            field8036 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8043[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4064(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4065(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 99;
                    break;
                case 2:
                    var10005 = 58;
                    break;
                case 3:
                    var10005 = 104;
                    break;
                default:
                    var10005 = 80;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
