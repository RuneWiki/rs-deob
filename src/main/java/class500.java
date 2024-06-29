import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class500 {

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "F")
    public static float field7089;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field7090;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public static int field7091;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ap", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field7093;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ap", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field7094;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "[S")
    public static short[] field7092;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V")
    public static void method2908(byte arg0) {
        field7092 = null;
        if (arg0 != 102) {
            method2909((byte) 122);
        }
    }

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(B)V")
    public static final synchronized void method2909(byte arg0) {
        field7090++;
        if (class415.field5870 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            if (arg0 <= -74) {
                Object var3 = var2.invoke(null, (Object[]) null);
                Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field7093 == null ? (field7093 = method2910("java.lang.String")) : field7093, field7094 == null ? (field7094 = method2910("java.lang.Class")) : field7094);
                class415.field5870 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2910(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
