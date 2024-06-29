import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class130 {

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "Z")
    public static boolean field1838 = false;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field1841;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qea", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field1843;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qea", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field1844;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "[[B")
    public static byte[][] field1842;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Z)V")
    public static void method965(boolean arg0) {
        if (arg0) {
            field1842 = null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public static final void method966(int arg0) {
        if (arg0 < 3) {
            field1837 = 21;
        }
        class701.method3946(false);
        field1841++;
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
    public static final void method967(int arg0) {
        class518.field7267 = class697.field9708.field3434 + class697.field9708.field3432 + 2;
        class404.field5114 = new String[500];
        field1839++;
        class560.field7906 = class270.field3406.field3432 + arg0 + class270.field3406.field3434;
        for (int var1 = 0; var1 < class404.field5114.length; var1++) {
            class404.field5114[var1] = "";
        }
        class320.method1883((byte) -60, class454.field6003.method2547(arg0 - 74, class243.field3143));
    }

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)V")
    public static final synchronized void method968(int arg0) {
        field1840++;
        if (class9.field128 != null) {
            return;
        }
        try {
            if (arg0 == 21442) {
                Class var1 = Class.forName("java.lang.management.ManagementFactory");
                Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
                Object var3 = var2.invoke(null, (Object[]) null);
                Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field1843 == null ? (field1843 = method969("java.lang.String")) : field1843, field1844 == null ? (field1844 = method969("java.lang.Class")) : field1844);
                class9.field128 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method969(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
