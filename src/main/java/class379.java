import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class379 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Lpl;")
    public static class616 field5696 = new class616(32);

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field5700 = new String[8];

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field5697 = new String[100];

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lwk;")
    public static class430 field5698 = new class430(5, 16);

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field5702;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field5703;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field5704;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2391(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Llh;ILlh;)V", line = 7)
    public static final void method2388(class205 arg0, int arg1, class205 arg2) {
        if (arg0.field3450 != null) {
            arg0.method1507(1);
        }
        field5695++;
        arg0.field3450 = arg2;
        arg0.field3449 = arg2.field3449;
        arg0.field3450.field3449 = arg0;
        if (arg1 != 100) {
            field5700 = null;
        }
        arg0.field3449.field3450 = arg0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 25)
    public static final synchronized void method2389(int arg0) {
        field5701++;
        if (class553.field7892 != null) {
            return;
        }
        try {
            if (arg0 != -20943) {
                field5698 = null;
            }
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field5703 == null ? (field5703 = method2391("java.lang.String")) : field5703, field5704 == null ? (field5704 = method2391("java.lang.Class")) : field5704);
            class553.field7892 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V", line = 64)
    public static void method2390(boolean arg0) {
        if (arg0) {
            field5700 = null;
            field5698 = null;
            field5697 = null;
            field5696 = null;
        }
    }
}
