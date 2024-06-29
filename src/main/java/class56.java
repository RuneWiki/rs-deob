import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class56 {

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field567 = 1;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Lsb;")
    public static class305 field565 = new class305(24, 6);

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "[Lej;")
    public static class479[] field568 = new class479[14];

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field566;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field569;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fi", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field570;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "[Lno;")
    public static class525[] field560;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method298(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 9)
    public static void method293(byte arg0) {
        int var1 = 116 % ((arg0 - 24) / 62);
        field568 = null;
        field565 = null;
        field560 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILr;)V", line = 20)
    public static final void method294(int arg0, int arg1, class564 arg2) {
        field562++;
        if (!class321.field3945) {
            class108.field1173 = 0;
            return;
        }
        if (class458.field6506) {
            class306.field3789 = class539.field7588.method320((byte) 56);
        }
        class602.field8471 = 0;
        class676.field9402 = 0;
        class302.field3751 = 0;
        int[] var3 = arg2.method938();
        class73.field765 = (int) ((float) var3[3] / 3.0F);
        class701.field9830 = (int) ((float) var3[2] / 3.0F);
        arg2.method996(class373.field5077);
        if (((int) ((float) class373.field5077[0] / 3.0F)) != class148.field1637 || (int) ((float) class373.field5077[1] / 3.0F) != class303.field3755) {
            class148.field1637 = (int) ((float) class373.field5077[0] / 3.0F);
            class303.field3755 = (int) ((float) class373.field5077[1] / 3.0F);
            class14.field122 = class148.field1637 >> 1;
            class412.field5530 = class303.field3755 >> 1;
            class560.field7990 = new int[class303.field3755 * class148.field1637];
        }
        class414.field5560 = arg2.method983();
        class108.field1173 = 0;
        for (int var4 = 0; var4 < class581.field8265; var4++) {
            class518.method2943(arg2, arg1, class334.field4188[var4], (byte) -65);
        }
        for (int var5 = 0; var5 < class394.field5341; var5++) {
            class518.method2943(arg2, arg1, class651.field9147[var5], (byte) -88);
        }
        for (int var6 = 0; var6 < class120.field1341; var6++) {
            class518.method2943(arg2, arg1, class389.field5262[var6], (byte) -125);
        }
        if (arg0 != Integer.MAX_VALUE) {
            field568 = null;
        }
        class697.field9783 = 0;
        if (class108.field1173 > 0) {
            int var7 = class560.field7990.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class560.field7990[var9++] = Integer.MAX_VALUE;
                class560.field7990[var9++] = Integer.MAX_VALUE;
                class560.field7990[var9++] = Integer.MAX_VALUE;
                class560.field7990[var9++] = Integer.MAX_VALUE;
                class560.field7990[var9++] = Integer.MAX_VALUE;
                class560.field7990[var9++] = Integer.MAX_VALUE;
                class560.field7990[var9++] = Integer.MAX_VALUE;
                class560.field7990[var9++] = Integer.MAX_VALUE;
            }
            while (var7 > var9) {
                class560.field7990[var9++] = Integer.MAX_VALUE;
            }
            class371.field5067 = 1;
            for (int var10 = 0; var10 < class108.field1173; var10++) {
                class603 var11 = class246.field3033[var10];
                class410.method2294(var11.field8475[0], var11.field8480[3], arg0 - 2147483524, var11.field8475[1], var11.field8480[1], var11.field8481[0], var11.field8481[1], var11.field8481[3], var11.field8475[3], var11.field8480[0]);
                class410.method2294(var11.field8475[1], var11.field8480[3], arg0 ^ 0x7FFFFFC8, var11.field8475[2], var11.field8480[2], var11.field8481[1], var11.field8481[2], var11.field8481[3], var11.field8475[3], var11.field8480[1]);
            }
            class371.field5067 = 2;
        }
        if (class458.field6506) {
            class530.field7455 = class539.field7588.method320((byte) 56) - class306.field3789;
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V", line = 125)
    public static final void method295(byte arg0) {
        field563++;
        for (class237 var1 = (class237) class474.field6833.method1665(-10300); var1 != null; var1 = (class237) class474.field6833.method1665(-10300)) {
            class617.method3441(var1, true);
        }
        int var2;
        int var3;
        if (class639.field9075.method2641(class430.field6109, (byte) 34)) {
            var2 = 0;
            var3 = 3;
        } else {
            var3 = class652.field9150;
            var2 = class652.field9150;
        }
        client.method3758();
        for (int var4 = var2; var4 <= var3; var4++) {
            client.method3755();
            client.method3754(var4);
            client.method3762(var4);
        }
        client.method3759();
        if (arg0 >= 55) {
            client.method3761();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[Ljava/lang/String;B)Ljava/lang/String;", line = 169)
    public static final String method296(int arg0, int arg1, String[] arg2, byte arg3) {
        field564++;
        if (arg3 != 33) {
            return null;
        } else if (arg1 == 0) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg2[arg0];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg0;
            int var6 = 0;
            for (int var7 = arg0; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg0; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V", line = 231)
    public static final synchronized void method297(byte arg0) {
        field566++;
        if (class553.field7900 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            if (arg0 != 12) {
                field560 = null;
            }
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field569 == null ? (field569 = method298("java.lang.String")) : field569, field570 == null ? (field570 = method298("java.lang.Class")) : field570);
            class553.field7900 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }
}
