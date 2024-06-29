import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class166 {

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "Lel;")
    public static class3 field2734 = new class3();

    @OriginalMember(owner = "client!tn", name = "e", descriptor = "[I")
    public static int[] field2737 = new int[3];

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!tn", name = "c", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!tn", name = "d", descriptor = "I")
    public static int field2736;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tn", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field2738;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1259(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1256(int arg0) {
        field2733++;
        try {
            Method var1 = (field2738 == null ? (field2738 = method1259("java.lang.Runtime")) : field2738).getMethod("availableProcessors");
            if (arg0 == -13024 && var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class144.field2488 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(III)V", line = 31)
    public static final void method1257(int arg0, int arg1, int arg2) {
        class405.field5814++;
        field2735++;
        class699 var3 = class452.method2630(class699.field9897, class114.field1822, (byte) 122);
        var3.field9908.method2735(arg0, 15015);
        var3.field9908.method2739((byte) -86, arg1);
        if (arg2 >= -70) {
            method1256(-1);
        }
        class149.method1134(var3, true);
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(B)V", line = 54)
    public static void method1258(byte arg0) {
        field2734 = null;
        field2737 = null;
        if (arg0 > -40) {
            method1258((byte) -102);
        }
    }

    @OriginalMember(owner = "client!tn", name = "toString", descriptor = "()Ljava/lang/String;", line = 65)
    public final String toString() {
        field2736++;
        throw new IllegalStateException();
    }
}
