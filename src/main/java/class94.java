import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class94 {

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "I")
    public static int field1142 = 0;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "Leba;")
    public static class550 field1141 = new class550(39, 6);

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "J")
    public static long field1135;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "Lga;")
    public static class332 field1139;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rda", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field1143;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rda", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field1144;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method538(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V", line = 3)
    public static final void method533(int arg0) {
        field1138++;
        if (class228.field2962) {
            return;
        }
        if (arg0 >= -30) {
            method537(null, (byte) 42);
        }
        if (class602.field8408.field4332) {
            class475.field6610 = ((int) class475.field6610 - 17 & 0xFFFFFFF0);
        } else {
            class635.field8787 += (-12.0F - class635.field8787) / 2.0F;
        }
        class634.field8770 = true;
        class228.field2962 = true;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V", line = 28)
    public static final synchronized void method534(byte arg0) {
        field1136++;
        if (class582.field7961 != null) {
            return;
        }
        try {
            if (arg0 < -95) {
                Class var1 = Class.forName("java.lang.management.ManagementFactory");
                Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
                Object var3 = var2.invoke(null, (Object[]) null);
                Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field1143 == null ? (field1143 = method538("java.lang.String")) : field1143, field1144 == null ? (field1144 = method538("java.lang.Class")) : field1144);
                class582.field7961 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "(B)V", line = 57)
    public static void method535(byte arg0) {
        field1141 = null;
        field1139 = null;
        if (arg0 < 73) {
            method536((byte) 123, null);
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(BLio;)Lwea;", line = 79)
    public static final class257 method536(byte arg0, class157 arg1) {
        if (arg0 == -34) {
            field1140++;
            int var2 = arg1.method963(-118);
            return new class257(var2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lr;B)V", line = 95)
    public static final void method537(class562 arg0, byte arg1) {
        arg0.method1042(0, 0, class399.field5301, 350);
        field1137++;
        arg0.method1113(0, 0, class399.field5301, 350, class53.field696 << 24 | 0x332277, 1);
        int var2 = 350 / class86.field1053;
        if (class627.field8682 > 0) {
            int var3 = 342 - class86.field1053;
            int var4 = var2 * var3 / (class627.field8682 + var2 - 1);
            int var5 = 4;
            if (class627.field8682 > 1) {
                var5 += (class627.field8682 - class410.field5398 - 1) * (var3 - var4) / (class627.field8682 - 1);
            }
            arg0.method1113(class399.field5301 - 16, var5, 12, var4, class53.field696 << 24 | 0x332277, 2);
            for (int var6 = class410.field5398; var6 < class410.field5398 + var2 && class627.field8682 > var6; var6++) {
                String[] var7 = class87.method475('\b', class187.field2606[var6], false);
                int var8 = (class399.field5301 - 16 - 8) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = (var8 * var9) + 8;
                    arg0.method1042(var10, 0, var10 - (8 - var8), 350);
                    class401.field5319.method2316(var10, -1, 348 - ((var6 - class410.field5398) * class86.field1053) - class505.field6968 - class325.field4382.field9366, class229.method1422(var7[var9], 0), -16777216, arg1 + 18);
                }
            }
        }
        class399.field5300.method2324(-1, -16777216, (byte) 115, "Build: 619", 330, class399.field5301 - 25);
        arg0.method1042(0, 0, class399.field5301, 350);
        arg0.method3122(1, 0, 350 - class505.field6968, -1, class399.field5301);
        class622.field8625.method2316(10, -1, 350 - (class254.field3332.field9366 + 1), "--> " + class229.method1422(class519.field7203, 0), -16777216, 0);
        if (arg1 != -18 || !class327.field4400) {
            return;
        }
        int var11 = -1;
        if (class327.field4404 % 30 > 15) {
            var11 = 16777215;
        }
        arg0.method3123(12, var11, class254.field3332.method3765("--> " + class229.method1422(class519.field7203, 0).substring(0, class104.field1243), (byte) 6) + 10, 1, 339 - class254.field3332.field9366);
    }
}
