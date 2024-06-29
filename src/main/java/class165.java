import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class165 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field2269;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Ljava/lang/Class;")
    public static Class field2271;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field2272;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "[I")
    public static int[] field2270;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V")
    public static final synchronized void method1022(boolean arg0) {
        field2269++;
        if (class465.field6471 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            if (arg0) {
                method1023(113);
            }
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field2271 == null ? (field2271 = method1024("java.lang.String")) : field2271, field2272 == null ? (field2272 = method1024("java.lang.Class")) : field2272);
            class465.field6471 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method1023(int arg0) {
        int var1 = -116 % ((38 - arg0) / 37);
        field2270 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1024(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
