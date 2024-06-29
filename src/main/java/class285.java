import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class285 {

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "I")
    public static int field4038;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wha", name = "c", descriptor = "Ljava/lang/Class;")
    public static Class field4039;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wha", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field4040;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
    public static final synchronized void method1765(int arg0) {
        field4038++;
        if (class239.field3373 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            if (arg0 == 6143) {
                Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field4039 == null ? (field4039 = method1767("java.lang.String")) : field4039, field4040 == null ? (field4040 = method1767("java.lang.Class")) : field4040);
                class239.field3373 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IJII)V")
    public static final void method1766(int arg0, long arg1, int arg2, int arg3) {
        field4037++;
        int var5 = (int) arg1 >> 14 & 0x1F;
        if (arg3 != 0) {
            return;
        }
        int var6 = ((int) arg1 & 0x3D9526) >> 20;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class126.method1000(0, arg2, var6, 0, var5, 0, true, arg0, arg3 - 1);
            return;
        }
        class100 var8 = class462.field6333.method2008((byte) -107, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field1355;
            var9 = var8.field1323;
        } else {
            var9 = var8.field1355;
            var10 = var8.field1323;
        }
        int var11 = var8.field1305;
        if (var6 != 0) {
            var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
        }
        class126.method1000(var11, arg2, 0, var10, 0, var9, true, arg0, -1);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1767(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
