import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class225 {

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field3153 = 0;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "Lvh;")
    public static class627 field3151;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field3156;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field3157;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method1458(int arg0) {
        if (arg0 < 114) {
            field3151 = null;
        }
        field3151 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static final synchronized void method1459(byte arg0) {
        field3152++;
        if (class603.field8617 != null || arg0 != 49) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field3156 == null ? (field3156 = method1462("java.lang.String")) : field3156, field3157 == null ? (field3157 = method1462("java.lang.Class")) : field3157);
            class603.field8617 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lha;I)V")
    public static final void method1460(class545 arg0, int arg1) {
        if (arg1 != 8735) {
            return;
        }
        for (class198 var2 = (class198) class335.field4303.method1945(false); var2 != null; var2 = (class198) class335.field4303.method1944(9408)) {
            if (var2.field2876) {
                var2.method1334(arg0);
            }
        }
        field3154++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLjava/lang/String;ILjava/lang/String;)V")
    public static final void method1461(boolean arg0, String arg1, int arg2, String arg3) {
        class93.field1268 = 2;
        field3155++;
        if (!arg0) {
            method1458(-102);
        }
        class33.field488 = arg2;
        class308.method1810(false, arg3, arg1, 0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1462(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
