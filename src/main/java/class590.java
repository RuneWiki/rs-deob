import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class590 {

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
    public static int field8286 = 0;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "I")
    public static int field8285;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field8287;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qt", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field8288;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3351(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)V", line = 6)
    public static final synchronized void method3350(byte arg0) {
        field8285++;
        if (arg0 != -82) {
            field8286 = -22;
        }
        if (class419.field5916 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field8287 == null ? (field8287 = method3351("java.lang.String")) : field8287, field8288 == null ? (field8288 = method3351("java.lang.Class")) : field8288);
            class419.field5916 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }
}
