import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class37 {

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public static int field575 = 1;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field579 = 0;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "Leu;")
    public static class508 field576;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wv", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field581;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wv", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field582;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IZ)I")
    public static final int method261(int arg0, boolean arg1) {
        if (arg1) {
            method263(false);
        }
        field580++;
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
    public static void method262(int arg0) {
        field576 = null;
        if (arg0 < 95) {
            field576 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Z)V")
    public static final synchronized void method263(boolean arg0) {
        field578++;
        if (class130.field1935 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field581 == null ? (field581 = method265("java.lang.String")) : field581, field582 == null ? (field582 = method265("java.lang.Class")) : field582);
            class130.field1935 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            if (arg0) {
                field575 = -42;
            }
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(JI)V")
    public static final void method264(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
            int var3 = 106 % ((arg1 + 57) / 60);
        } catch (InterruptedException var4) {
        }
        field577++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method265(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
