import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class48 {

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field816 = -2;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lmq;")
    public static class472 field814 = new class472(8);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field819;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field820;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dm", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field821;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method544(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)Z", line = 5)
    public static final boolean method539(boolean arg0) {
        field817++;
        if (!arg0) {
            method539(false);
        }
        try {
            return class513.method3044((byte) 118);
        } catch (IOException var4) {
            class589.method3415((byte) 73);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class523.field7670 == null ? -1 : class523.field7670.method3903(true)) + "," + (class681.field9744 == null ? -1 : class681.field9744.method3903(arg0)) + "," + (class268.field3674 == null ? -1 : class268.field3674.method3903(true)) + " - " + class283.field3848 + "," + (class206.field2472.field2689[0] + class36.field689) + "," + (class206.field2472.field2686[0] + class88.field1239) + " - ";
            for (int var3 = 0; class283.field3848 > var3 && var3 < 50; var3++) {
                var2 = var2 + class29.field617.field5205[var3] + ",";
            }
            class544.method3184(23383, var2, var5);
            class168.method1061((byte) 70, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[Lf;)V", line = 40)
    public static final void method540(int arg0, class701[] arg1) {
        class502.field7013 = arg1.length;
        field813++;
        class634.field9106 = new int[class502.field7013 + 10];
        class420.field5955 = new class701[class502.field7013 + 10];
        class252.method1540(arg1, 0, class420.field5955, 0, class502.field7013);
        for (int var2 = 0; var2 < class502.field7013; var2++) {
            class634.field9106[var2] = class420.field5955[var2].method901();
        }
        for (int var3 = class502.field7013; var3 < class420.field5955.length; var3++) {
            class634.field9106[var3] = 12;
        }
        if (arg0 > -80) {
            method542(-67);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 78)
    public static final synchronized void method541(int arg0) {
        field815++;
        if (class228.field2974 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field820 == null ? (field820 = method544("java.lang.String")) : field820, field821 == null ? (field821 = method544("java.lang.Class")) : field821);
            class228.field2974 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            int var5 = 1 / ((18 - arg0) / 52);
        } catch (Exception var7) {
            System.out.println("HeapDump setup error:");
            var7.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)I", line = 105)
    public static final int method542(int arg0) {
        field819++;
        int var1 = -107 % ((arg0 + 45) / 46);
        return class91.field1282.method3287(100);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)V", line = 115)
    public static void method543(boolean arg0) {
        field814 = null;
        if (!arg0) {
            field814 = null;
        }
    }
}
