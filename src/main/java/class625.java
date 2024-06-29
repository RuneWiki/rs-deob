import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class625 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field8884;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lla;")
    public static class423 field8883;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field8885;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vh", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field8886;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3609(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V", line = 5)
    public static final synchronized void method3606(int arg0) {
        field8884++;
        if (class284.field3964 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            int var2 = 51 % ((arg0 - 31) / 43);
            Method var3 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var4 = var3.invoke(null, (Object[]) null);
            Method var5 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field8885 == null ? (field8885 = method3609("java.lang.String")) : field8885, field8886 == null ? (field8886 = method3609("java.lang.Class")) : field8886);
            class284.field3964 = var5.invoke(null, var4, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var7) {
            System.out.println("HeapDump setup error:");
            var7.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V", line = 33)
    public static void method3607(int arg0) {
        field8883 = null;
        if (arg0 != -4332) {
            field8881 = 39;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IB)V", line = 48)
    public static final void method3608(int arg0, byte arg1) {
        if (class464.field6623 == null || class464.field6623.length < arg0) {
            class464.field6623 = new int[arg0];
        }
        if (arg1 < 94) {
            field8883 = null;
        }
        field8882++;
    }
}
