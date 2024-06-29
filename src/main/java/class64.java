import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class64 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field926;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dl", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field927;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field928;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method529(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V", line = 3)
    public static final void method525(int arg0, int arg1, int arg2) {
        field925++;
        class449 var3 = class611.method3463(arg0, (byte) -116, 12);
        if (arg2 != 105112724) {
            method527((byte) -69);
        }
        var3.method2615((byte) -97);
        var3.field6472 = arg1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIII)V", line = 17)
    public static final void method526(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 > arg0) {
            for (int var5 = arg0; var5 < arg1; var5++) {
                class657.field9275[var5][arg4] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg0; var6++) {
                class657.field9275[var6][arg4] = arg2;
            }
        }
        field926++;
        if (arg3 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 52)
    public static final synchronized void method527(byte arg0) {
        field924++;
        if (class102.field1673 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            if (arg0 > 8) {
                Object var3 = var2.invoke(null, (Object[]) null);
                Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field927 == null ? (field927 = method529("java.lang.String")) : field927, field928 == null ? (field928 = method529("java.lang.Class")) : field928);
                class102.field1673 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILsw;II)J", line = 84)
    public static final long method528(int arg0, class394 arg1, int arg2, int arg3) {
        field923++;
        long var4 = 4194304L;
        long var6 = Long.MIN_VALUE;
        class119 var8 = class14.field224.method2834(0, arg1.method903(120));
        long var9 = (long) (arg3 << 7 | arg2 | arg1.method907(false) << 14 | arg1.method904(-15140) << 20 | 0x40000000);
        if (var8.field1903 == 0) {
            var9 |= var6;
        }
        if (var8.field1955 == 1) {
            var9 |= var4;
        }
        long var11 = var9 | (long) arg1.method903(121) << 32;
        int var13 = 125 / ((-arg0 - 15) / 43);
        return var11;
    }
}
