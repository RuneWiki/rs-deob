import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class561 {

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "[[Z")
    public static boolean[][] field7898 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field7897;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field7900;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public static int field7901;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ou", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field7902;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ou", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field7903;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3204(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 4)
    public static void method3199(int arg0) {
        int var1 = 28 % ((-arg0 - 83) / 40);
        field7898 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZBI)Ljava/lang/String;", line = 13)
    public static final String method3200(boolean arg0, byte arg1, int arg2) {
        field7899++;
        if (arg0 && arg2 >= 0) {
            return arg1 >= -22 ? null : class64.method658((byte) 127, arg0, 10, arg2);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BIIIII)Z", line = 29)
    public static final boolean method3201(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7901++;
        if (arg0 != -40) {
            field7898 = null;
        }
        for (int var6 = arg1; var6 <= arg2; var6++) {
            for (int var7 = arg4; var7 <= arg5; var7++) {
                if (class671.field9492[var6][var7] == arg3 && class678.field9587[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(JB)V", line = 62)
    public static final void method3202(long arg0, byte arg1) {
        if (arg1 >= -16) {
            return;
        }
        field7900++;
        if (arg0 <= 0L) {
            return;
        }
        if ((arg0 % 10L) == 0L) {
            class138.method998(arg0 - 1L, true);
            class138.method998(1L, true);
        } else {
            class138.method998(arg0, true);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V", line = 84)
    public static final synchronized void method3203(byte arg0) {
        field7897++;
        if (class563.field7934 != null) {
            return;
        }
        try {
            if (arg0 == -15) {
                Class var1 = Class.forName("java.lang.management.ManagementFactory");
                Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
                Object var3 = var2.invoke(null, (Object[]) null);
                Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field7902 == null ? (field7902 = method3204("java.lang.String")) : field7902, field7903 == null ? (field7903 = method3204("java.lang.Class")) : field7903);
                class563.field7934 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }
}
