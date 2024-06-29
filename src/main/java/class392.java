import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class392 {

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "Lcs;")
    public static class351 field5518 = new class351(26, 6);

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field5517;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field5519;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ep", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field5520;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)V")
    public static void method2341(byte arg0) {
        if (arg0 < 50) {
            field5518 = null;
        }
        field5518 = null;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZI)V")
    public static final void method2342(boolean arg0, int arg1) {
        field5517++;
        if (!arg0) {
            field5518 = null;
        }
        class265 var2 = class440.method2554(arg1, 2, 10);
        var2.method1677(21748);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public static final void method2343(int arg0) {
        if (arg0 >= -31) {
            field5518 = null;
        }
        field5519++;
        if (class14.field222 == 2) {
            class154.field2227 = 96;
            return;
        }
        try {
            Method var1 = (field5520 == null ? (field5520 = method2344("java.lang.Runtime")) : field5520).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class154.field2227 = (int) (var3 / 1048576L) + 1;
                    return;
                } catch (Throwable var4) {
                    return;
                }
            }
        } catch (Exception var5) {
            return;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2344(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class112("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
    }
}
