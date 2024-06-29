import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class687 {

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "J")
    public static long field9711 = 1L;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "Lhk;")
    public static class153 field9712 = new class153(2, 4, 4, 0);

    @OriginalMember(owner = "client!gha", name = "h", descriptor = "Lin;")
    public static class380 field9716 = new class380(25, -2);

    @OriginalMember(owner = "client!gha", name = "i", descriptor = "Z")
    public static boolean field9717 = true;

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "I")
    public static int field9709;

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!gha", name = "e", descriptor = "I")
    public static int field9713;

    @OriginalMember(owner = "client!gha", name = "f", descriptor = "I")
    public static int field9714;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gha", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field9718;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gha", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field9719;

    @OriginalMember(owner = "client!gha", name = "g", descriptor = "[I")
    public static int[] field9715;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3881(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 3)
    public static final String method3876(byte arg0, int arg1) {
        field9713++;
        String var2 = Integer.toString(arg1);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class563.field7831.method3281(class423.field5892, -1) + " (" + var2 + ")</col>";
        } else {
            int var4 = -74 % ((arg0 + 38) / 40);
            return var2.length() > 6 ? " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class563.field7833.method3281(class423.field5892, -1) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)V", line = 30)
    public static void method3877(int arg0) {
        field9715 = null;
        if (arg0 <= -48) {
            field9712 = null;
            field9716 = null;
        }
    }

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "(I)V", line = 44)
    public static final void method3878(int arg0) {
        class263.field3717 = -1;
        if (arg0 != -32041) {
            method3876((byte) 122, 115);
        }
        class198.field2985 = 0;
        class104.field1516 = -1;
        field9714++;
        class286.field4207 = -1;
    }

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "(I)V", line = 58)
    public static final void method3879(int arg0) {
        class112.method931(-58);
        field9709++;
        class255.method1679((byte) -120, class420.field5820.field9480.method1896(17539) == 1, 2, 22050);
        class646.field9183 = class259.method1687(22050, arg0, class336.field4775, class213.field3128, (byte) 121);
        class222.method1526(-32672, true, class645.method3654(-18547, null));
        class500.field6868 = class259.method1687(2048, 1, class336.field4775, class213.field3128, (byte) 105);
        class500.field6868.method3615((byte) 126, class234.field3399);
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(Z)V", line = 73)
    public static final synchronized void method3880(boolean arg0) {
        field9710++;
        if (class595.field8509 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field9718 == null ? (field9718 = method3881("java.lang.String")) : field9718, field9719 == null ? (field9719 = method3881("java.lang.Class")) : field9719);
            class595.field8509 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
        if (!arg0) {
            field9716 = null;
        }
    }
}
