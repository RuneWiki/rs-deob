import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class612 {

    @OriginalMember(owner = "client!taa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8763 = new String[] { method4523(method4522("\u0012e3\u0015 N")), method4523(method4522("\u000be*v\u0004\u000bk B")), method4523(method4522("\fe$ZO\ne<\\O4q<O\b\u000ba")) };

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    public static int field8761;

    // $FF: synthetic field
    @OriginalMember(owner = "client!taa", name = "a", descriptor = "Ljava/lang/Class;")
    public static Class field8762;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Z)V")
    public static final void method4520(boolean arg0) {
        try {
            if (class651.field9249.field2483) {
                class342.field4980 = 96;
            } else {
                try {
                    Method var1 = (field8762 == null ? (field8762 = method4521(field8763[2])) : field8762).getMethod(field8763[1]);
                    if (var1 != null) {
                        try {
                            Runtime var2 = Runtime.getRuntime();
                            Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                            class342.field4980 = (int) (var3 / 1048576L) + 1;
                        } catch (Throwable var5) {
                        }
                    }
                } catch (Exception var6) {
                }
            }
            if (arg0) {
                field8760++;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field8763[0] + arg0 + ')');
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method4521(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!taa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4522(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x61);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!taa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4523(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 102;
                    break;
                case 1:
                    var10005 = 4;
                    break;
                case 2:
                    var10005 = 82;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
