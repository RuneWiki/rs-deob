import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class60 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "[I")
    public static int[] field735 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[F")
    public static float[] field737 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Ldt;")
    public static class252 field734 = null;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field738;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vg", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field739;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field740;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLjava/lang/String;IZLtd;Ljava/lang/String;)V")
    public static final void method402(boolean arg0, String arg1, int arg2, boolean arg3, class477 arg4, String arg5) {
        field736++;
        if (arg0) {
            if (class477.field6690.startsWith("win") && arg4.field6674) {
                String var6 = null;
                if (class319.field4527 != null) {
                    var6 = class319.field4527.getParameter("haveie6");
                }
                if (var6 == null || !var6.equals("1")) {
                    class141 var7 = class433.method2591(arg5, 0, arg4, -83);
                    class210.field3249 = arg4;
                    class370.field5131 = arg5;
                    class776.field10667 = var7;
                    return;
                }
            }
            if (class477.field6690.startsWith("mac")) {
                String var8 = null;
                if (class319.field4527 != null) {
                    var8 = class319.field4527.getParameter("havefirefox");
                }
                if (var8 != null && var8.equals("1") && arg3) {
                    class514.method3099(arg4, true, arg1, arg5, 1);
                    return;
                }
            }
            class433.method2591(arg5, 2, arg4, -47);
        } else {
            class433.method2591(arg5, 3, arg4, arg2 - 13712);
        }
        if (arg2 != 13687) {
            field737 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I")
    public static final int method403(int arg0, int arg1) {
        return class721.field9985 == null ? 0 : class721.field9985[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static final synchronized void method404(byte arg0) {
        field738++;
        if (class777.field10678 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            if (arg0 != -125) {
                field737 = null;
            }
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field739 == null ? (field739 = method406("java.lang.String")) : field739, field740 == null ? (field740 = method406("java.lang.Class")) : field740);
            class777.field10678 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public static void method405(byte arg0) {
        field734 = null;
        field737 = null;
        if (arg0 != -40) {
            field734 = null;
        }
        field735 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method406(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
