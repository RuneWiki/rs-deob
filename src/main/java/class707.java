import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class707 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field9813;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field9814;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field9815;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field9817;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field9818;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lhaa;")
    public static class80 field9816;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field9821;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field9822;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3973(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 5)
    public static final void method3966(byte arg0) {
        if (arg0 < 63) {
            field9813 = 13;
        }
        class60.method514(false, 11);
        field9820++;
        class303.method1982(-1);
        System.gc();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lfp;ILem;Ljba;Lfp;Lfp;)Z", line = 18)
    public static final boolean method3967(class323 arg0, int arg1, class223 arg2, class398 arg3, class323 arg4, class323 arg5) {
        if (arg1 < 58) {
            field9816 = null;
        }
        class136.field1975 = arg3;
        class390.field5519 = arg4;
        class601.field8432 = new int[16];
        class636.field8762 = arg5;
        field9819++;
        class360.field5103 = arg0;
        class165.field2262 = arg2;
        for (int var6 = 0; var6 < 16; var6++) {
            class601.field8432[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIIII)V", line = 45)
    public static final void method3968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg8 >= class71.field960 && class549.field7665 >= arg8 && arg2 >= class71.field960 && class549.field7665 >= arg2 && class71.field960 <= arg1 && arg1 <= class549.field7665 && arg9 >= class71.field960 && class549.field7665 >= arg9 && arg7 >= class143.field2050 && arg7 <= class461.field6495 && class143.field2050 <= arg6 && class461.field6495 >= arg6 && arg5 >= class143.field2050 && class461.field6495 >= arg5 && class143.field2050 <= arg0 && arg0 <= class461.field6495) {
            class654.method3597(arg4 + 6, arg5, arg8, arg2, arg3, arg6, arg0, arg1, arg9, arg7);
        } else {
            class477.method2851(arg3, false, arg9, arg1, arg0, arg5, arg7, arg6, arg2, arg8);
        }
        if (arg4 == -3) {
            field9814++;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V", line = 63)
    public static final synchronized void method3969(byte arg0) {
        field9815++;
        if (class125.field1518 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            if (arg0 <= 120) {
                field9816 = null;
            }
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field9821 == null ? (field9821 = method3973("java.lang.String")) : field9821, field9822 == null ? (field9822 = method3973("java.lang.Class")) : field9822);
            class125.field1518 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 91)
    public static void method3970(int arg0) {
        if (arg0 >= -56) {
            method3967(null, 104, null, null, null, null);
        }
        field9816 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIII)I", line = 107)
    public static final int method3971(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        if (arg1 != 201) {
            field9813 = -34;
        }
        field9817++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 4095 - arg0;
        } else {
            return 4095 - arg3;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IZZ)V", line = 131)
    public static final void method3972(int arg0, boolean arg1, boolean arg2) {
        field9818++;
        if (!arg2) {
            return;
        }
        class95 var3 = class71.method589(arg1, -9854, arg0);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field1107.length; var4++) {
                var3.field1107[var4] = -1;
                var3.field1113[var4] = 0;
            }
        }
    }
}
