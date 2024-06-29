import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public abstract class class155 {

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1972 = new String[] { method1307(method1306("9{@:\u0000")), method1307(method1306("9{@9\u0000")), method1307(method1306("9{@=\u0000")), method1307(method1306("9{@;\u0000")) };

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "Lsb;")
    public static class261 field1971 = new class261(136, -2);

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field1968;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "Ljava/lang/String;")
    public String field1969;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(B)V")
    public static void method1302(byte arg0) {
        try {
            field1971 = null;
            if (arg0 < 85) {
                field1971 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1972[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method447(byte arg0) throws IOException;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)I")
    public static final int method1303(int arg0, int arg1) {
        try {
            field1970++;
            if (arg0 != 12345678) {
                field1971 = null;
            }
            return arg1 & 0xFF;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1972[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public final Socket method1304(byte arg0) throws IOException {
        try {
            if (arg0 > -117) {
                field1971 = null;
            }
            field1967++;
            return new Socket(this.field1969, this.field1966);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1972[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)I")
    public static final int method1305(int arg0, int arg1, int arg2) {
        try {
            field1968++;
            if (arg1 == -1) {
                return 12345678;
            }
            arg2 = (arg1 & 0x7F) * arg2 >> 7;
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            if (arg0 != 14626) {
                method1302((byte) 24);
            }
            return (arg1 & 0xFF80) + arg2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1972[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1306(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1307(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
