import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class408 extends InputStream {

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5909 = new String[] { method3212(method3211("\u007fbW:<")), method3212(method3211("\u007fbW\nqrqQ")), method3212(method3211("=q\u0015\u0014")), method3212(method3211("d|\u0017")), method3212(method3211("\u007fbW9<")), method3212(method3211("h;WVi")), method3212(method3211("\u007f|\u0017\rl")), method3212(method3211("=f\u0016")), method3212(method3211("\u007f|\u001b")), method3212(method3211("=q\u0000\u0014}q")), method3212(method3211("}`\u0015\u0014")), method3212(method3211("~t\u001a")) };

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "Z")
    public static boolean field5907 = false;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "J")
    public static long field5905;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
    public static final void method3209(byte arg0) {
        try {
            if (arg0 < -33) {
                field5904++;
                class737.field10497.method2043(false);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5909[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lw", name = "read", descriptor = "()I")
    public final int read() {
        try {
            field5906++;
            class449.method3474(20817, 30000L);
            return -1;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5909[1] + ')');
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3210(int arg0, String arg1) {
        try {
            if (arg0 != 30000) {
                field5907 = true;
            }
            field5908++;
            if (class447.field6571.startsWith(field5909[3])) {
                return arg1 + field5909[2];
            } else if (class447.field6571.startsWith(field5909[6])) {
                return field5909[8] + arg1 + field5909[7];
            } else if (class447.field6571.startsWith(field5909[11])) {
                return field5909[8] + arg1 + field5909[9];
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5909[4] + arg0 + ',' + (arg1 == null ? field5909[10] : field5909[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3211(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3212(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 19;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 121;
                    break;
                case 3:
                    var10005 = 120;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
