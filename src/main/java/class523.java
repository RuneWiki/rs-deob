import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class523 {

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "[Lkga;")
    public static class555[] field7401 = new class555[14];

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public static int field7400;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public static int field7402;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sda", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field7403;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sda", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field7404;

    // $FF: synthetic method
    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3008(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V", line = 6)
    public static final synchronized void method3005(int arg0) {
        field7400++;
        if (class132.field1572 != null) {
            return;
        }
        try {
            if (arg0 == 2048) {
                Class var1 = Class.forName("java.lang.management.ManagementFactory");
                Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
                Object var3 = var2.invoke(null, (Object[]) null);
                Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field7403 == null ? (field7403 = method3008("java.lang.String")) : field7403, field7404 == null ? (field7404 = method3008("java.lang.Class")) : field7404);
                class132.field1572 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(BII)Z", line = 38)
    public static final boolean method3006(byte arg0, int arg1, int arg2) {
        int var3 = -121 / ((-arg0 - 19) / 45);
        field7402++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V", line = 51)
    public static void method3007(int arg0) {
        int var1 = 92 % ((-arg0 - 68) / 40);
        field7401 = null;
    }
}
