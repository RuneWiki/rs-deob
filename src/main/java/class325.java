import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Color;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class325 {

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "I")
    public static int field4611 = -1;

    @OriginalMember(owner = "client!dja", name = "c", descriptor = "Lg;")
    public static class166 field4613 = new class166(1);

    @OriginalMember(owner = "client!dja", name = "i", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4619 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

    @OriginalMember(owner = "client!dja", name = "j", descriptor = "Lsaa;")
    public static class345 field4620 = new class345();

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!dja", name = "e", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!dja", name = "f", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!dja", name = "g", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!dja", name = "h", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!dja", name = "k", descriptor = "Lpf;")
    public static class607 field4621;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dja", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field4622;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dja", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field4623;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2106(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)V", line = 3)
    public static void method2101(int arg0) {
        field4619 = null;
        field4613 = null;
        field4620 = null;
        if (arg0 == 1) {
            field4621 = null;
        }
    }

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "(I)V", line = 16)
    public static final synchronized void method2102(int arg0) {
        field4615++;
        if (arg0 > -15 || class196.field2545 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field4622 == null ? (field4622 = method2106("java.lang.String")) : field4622, field4623 == null ? (field4623 = method2106("java.lang.Class")) : field4623);
            class196.field2545 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!dja", name = "c", descriptor = "(I)V", line = 43)
    public static final void method2103(int arg0) {
        field4616++;
        class521.method3032(-105);
        class789.field10841 = null;
        class593.field8098 = null;
        class388.field5625 = null;
        class171.field2240 = null;
        if (arg0 != 24) {
            field4620 = null;
        }
        class638.field8599 = null;
    }

    @OriginalMember(owner = "client!dja", name = "d", descriptor = "(I)V", line = 60)
    public static final void method2104(int arg0) {
        field4617++;
        if (class180.field2361 != null) {
            class180.field2361.method1011(true);
        }
        if (class791.field10862 != null) {
            while (true) {
                try {
                    class791.field10862.join();
                    break;
                } catch (InterruptedException var2) {
                }
            }
        }
        int var1 = 15 / ((arg0 - 3) / 36);
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(Ld;BLjava/awt/Canvas;Luq;I)Lha;", line = 97)
    public static final class66 method2105(class161 arg0, byte arg1, Canvas arg2, class172 arg3, int arg4) {
        field4612++;
        if (arg1 < 14) {
            method2105(null, (byte) 15, null, null, 93);
        }
        if (!class512.method2990((byte) 118)) {
            throw new RuntimeException("");
        } else if (class289.method1854((byte) -118, "jaggl")) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg2, 8, 8, 8, 24, 0, arg4);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class757 var8 = new class757(var5, arg2, var6, arg0, arg3, arg4);
            var8.method3874(19178);
            return var8;
        } else {
            throw new RuntimeException("");
        }
    }
}
