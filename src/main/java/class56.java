import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class56 {

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "Ljava/lang/String;")
    public static String field656 = null;

    @OriginalMember(owner = "client!lu", name = "f", descriptor = "Lke;")
    public static class276 field661 = new class276(16);

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "Lqk;")
    public static class1 field662 = new class1(63, 3);

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "Ljava/lang/String;")
    public static String field663 = null;

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!lu", name = "e", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
    public static int field664;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lu", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field665;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lu", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field666;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method467(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method469((byte) -52);
        }
        field659++;
        return class2.method9(arg0, arg1, true) || class171.method1100(arg1, 353, arg0);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lgga;I)Lhga;")
    public static final class195 method468(class511 arg0, int arg1) {
        field660++;
        if (arg1 >= -51) {
            return null;
        } else {
            class195 var2 = new class195();
            var2.field2768 = arg0.method3002(-1);
            var2.field2764 = class475.field6591.method2375((byte) -126, var2.field2768);
            return var2;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
    public static final synchronized void method469(byte arg0) {
        field657++;
        if (class313.field4500 != null) {
            return;
        }
        try {
            int var1 = 62 / ((4 - arg0) / 55);
            Class var2 = Class.forName("java.lang.management.ManagementFactory");
            Method var3 = var2.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var4 = var3.invoke(null, (Object[]) null);
            Method var5 = var2.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field665 == null ? (field665 = method472("java.lang.String")) : field665, field666 == null ? (field666 = method472("java.lang.Class")) : field666);
            class313.field4500 = var5.invoke(null, var4, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var7) {
            System.out.println("HeapDump setup error:");
            var7.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public static final void method470(int arg0) {
        field658++;
        if (arg0 != 11192) {
            return;
        }
        if (class760.method4198(class664.field9331, 2) || class232.method1593((byte) -126, class664.field9331)) {
            class636.method3656(6806, 5000, class412.field5779 >> 12, class497.field6818 >> 12);
        } else {
            int var1 = class724.field10031.field9219[0] >> 3;
            int var2 = class724.field10031.field9214[0] >> 3;
            if (var1 >= 0 && (class741.field10208 >> 3) > var1 && var2 >= 0 && var2 < (class525.field7224 >> 3)) {
                class636.method3656(6806, 5000, var2, var1);
            } else {
                class636.method3656(6806, 0, class525.field7224 >> 4, class741.field10208 >> 4);
            }
        }
        class2.method8(-16711936);
        class457.method2753(false);
        class1.method6(27828);
        class436.method2615(119);
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
    public static void method471(int arg0) {
        if (arg0 != 63) {
            field664 = 7;
        }
        field656 = null;
        field661 = null;
        field663 = null;
        field662 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method472(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
