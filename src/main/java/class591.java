import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class591 extends class127 {

    @OriginalMember(owner = "client!k", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8687 = new String[] { method4407(method4406("d]}uvb]esv\\Ie`1cY")), method4407(method4406("oJj}4o^gq\b|Shq+}Syg")), method4407(method4406("e\u0012I<")), method4407(method4406("e\u0012J<")) };

    @OriginalMember(owner = "client!k", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field8685 = new String[100];

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field8684 = -1;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field8683;

    // $FF: synthetic field
    @OriginalMember(owner = "client!k", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field8686;

    // $FF: synthetic method
    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4405(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V", line = 5)
    public static final void method4403(int arg0) {
        try {
            try {
                Method var1 = (field8686 == null ? (field8686 = method4405(field8687[0])) : field8686).getMethod(field8687[1]);
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                        class396.field5930 = var3;
                    } catch (Throwable var5) {
                    }
                }
            } catch (Exception var6) {
            }
            field8683++;
            if (arg0 >= -94) {
                field8685 = null;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field8687[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 32)
    public static void method4404(int arg0) {
        try {
            field8685 = null;
            if (arg0 != -23473) {
                method4404(97);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8687[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!k", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4406(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!k", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4407(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 14;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 20;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
