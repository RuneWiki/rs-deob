import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class716 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Z")
    public static boolean field10027 = false;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "[I")
    public static int[] field10030 = new int[50];

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Z")
    public static volatile boolean field10032 = true;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field10028;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field10029;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field10031;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field10033;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vm", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field10034;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vm", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field10035;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4051(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)[Lft;", line = 8)
    public static final class4[] method4046(byte arg0) {
        int var1 = 82 / ((arg0 - 79) / 47);
        field10033++;
        return new class4[] { class209.field2476, class219.field2571, class120.field1539 };
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 18)
    public static void method4047(int arg0) {
        if (arg0 == -2) {
            field10030 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V", line = 32)
    public static final void method4048(int arg0) {
        field10028++;
        class274.field3218 = 0;
        class358.field4430 = 0;
        class537.field7557++;
        class661.method3714(-111);
        class165.method1150(arg0 ^ 0x7D);
        class438.method2583(false);
        boolean var1 = false;
        for (int var2 = 0; var2 < class274.field3218; var2++) {
            int var5 = class728.field10197[var2];
            class273 var6 = (class273) class30.field444.method2121(63, (long) var5);
            class388 var7 = var6.field3210;
            if (class672.field9218 && class662.method3717(1, var5)) {
                class149.method1076((byte) 116);
            }
            if (class537.field7557 != var7.field3422) {
                if (var7.field5003.method2845(false)) {
                    class382.method2253(var7, true);
                }
                var7.method2275(null, (byte) -124);
                var1 = true;
                var6.method2219(13630);
            }
        }
        if (var1) {
            class370.field4599 = class30.field444.method2117(true);
            class30.field444.method2113(class616.field8293, -127);
        }
        if (class647.field8807 != class583.field7964.field5262) {
            throw new RuntimeException("gnp1 pos:" + class583.field7964.field5262 + " psize:" + class647.field8807);
        }
        for (int var3 = 0; var3 < class3.field42; var3++) {
            if (class30.field444.method2121(107, (long) class2.field29[var3]) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class3.field42);
            }
        }
        if (class370.field4599 - class3.field42 != arg0) {
            throw new RuntimeException("gnp3 mis:" + (class370.field4599 - class3.field42));
        }
        for (int var4 = 0; var4 < class370.field4599; var4++) {
            if (class537.field7557 != class616.field8293[var4].field3210.field3422) {
                throw new RuntimeException("gnp4 uk:" + class616.field8293[var4].field3210.field3393);
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V", line = 113)
    public static final synchronized void method4049(int arg0) {
        field10031++;
        if (class635.field8665 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            int var2 = 120 % ((3 - arg0) / 44);
            Method var3 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var4 = var3.invoke(null, (Object[]) null);
            Method var5 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field10034 == null ? (field10034 = method4051("java.lang.String")) : field10034, field10035 == null ? (field10035 = method4051("java.lang.Class")) : field10035);
            class635.field8665 = var5.invoke(null, var4, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var7) {
            System.out.println("HeapDump setup error:");
            var7.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[Ljava/lang/String;)V", line = 140)
    public static final void method4050(int arg0, String[] arg1) {
        if (arg0 != 0) {
            field10032 = true;
        }
        field10029++;
        if (arg1.length <= 1) {
            class569.field7802 = class569.field7802 + arg1[0];
            class163.field1993 += arg1[0].length();
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2].startsWith("pause")) {
                int var3 = 5;
                try {
                    var3 = Integer.parseInt(arg1[var2].substring(6));
                } catch (Exception var4) {
                }
                class793.method4374(0, "Pausing for " + var3 + " seconds...");
                class478.field6628 = arg1;
                class202.field2427 = var2 + 1;
                class385.field4947 = (long) (var3 * 1000) + class349.method2069(true);
                return;
            }
            class569.field7802 = arg1[var2];
            class752.method4202(false, (byte) 120);
        }
    }
}
