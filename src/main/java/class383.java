import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class383 {

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "[I")
    public static int[] field5197 = new int[3];

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "Lvl;")
    public static class15 field5198 = new class15(89, 2);

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field5201;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rr", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field5202;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rr", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field5203;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2327(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V", line = 7)
    public static final synchronized void method2324(byte arg0) {
        field5201++;
        if (arg0 <= 98) {
            method2326(-2);
        }
        if (class662.field9195 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field5202 == null ? (field5202 = method2327("java.lang.String")) : field5202, field5203 == null ? (field5203 = method2327("java.lang.Class")) : field5203);
            class662.field9195 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLso;)I", line = 38)
    public static final int method2325(boolean arg0, class497 arg1) {
        if (!arg0) {
            method2326(44);
        }
        field5196++;
        if (class497.field6793 == arg1) {
            return 5120;
        } else if (class497.field6797 == arg1) {
            return 5122;
        } else if (class497.field6798 == arg1) {
            return 5124;
        } else if (class497.field6799 == arg1) {
            return 5121;
        } else if (class497.field6800 == arg1) {
            return 5123;
        } else if (class497.field6801 == arg1) {
            return 5125;
        } else if (class497.field6802 == arg1) {
            return 5131;
        } else if (class497.field6803 == arg1) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 90)
    public static void method2326(int arg0) {
        field5198 = null;
        if (arg0 != 5120) {
            field5200 = -113;
        }
        field5197 = null;
    }
}
