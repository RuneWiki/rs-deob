import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class673 {

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Leu;")
    public static class444 field9482 = new class444(4, 1);

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field9484 = 0;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "Ljava/lang/String;")
    public static String field9487 = null;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field9488;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Lrfa;")
    public static class184 field9483;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wn", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field9489;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wn", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field9490;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
    public static final synchronized void method3847(boolean arg0) {
        field9485++;
        if (class46.field633 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field9489 == null ? (field9489 = method3850("java.lang.String")) : field9489, field9490 == null ? (field9490 = method3850("java.lang.Class")) : field9490);
            class46.field633 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
            if (!arg0) {
                field9487 = null;
            }
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IZIIII)V")
    public static final void method3848(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        field9488++;
        if (arg5 < 1) {
            arg5 = 1;
        }
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class44.field613 - class265.field4308) * var6 / 100 + class265.field4308;
        if (var7 < class555.field8031) {
            var7 = class555.field8031;
        } else if (var7 > class235.field3742) {
            var7 = class235.field3742;
        }
        int var8 = var7 * 512 * arg5 / (arg2 * 334);
        if (var8 < class595.field8436) {
            short var9 = class595.field8436;
            var7 = arg2 * 334 * var9 / (arg5 * 512);
            if (class235.field3742 < var7) {
                var7 = class235.field3742;
                int var10 = arg5 * var7 * 512 / (var9 * 334);
                int var11 = (arg2 - var10) / 2;
                if (arg1) {
                    class627.field8857.method281();
                    class627.field8857.method1355(arg0, arg4, arg5, var11, -16777216, 1);
                    class627.field8857.method1355(arg0, arg2 + arg4 - var11, arg5, var11, -16777216, 1);
                }
                arg4 += var11;
                arg2 -= var11 * 2;
            }
        } else if (var8 > class659.field9187) {
            short var12 = class659.field9187;
            var7 = arg2 * var12 * 334 / (arg5 * 512);
            if (class555.field8031 > var7) {
                var7 = class555.field8031;
                int var13 = arg2 * var12 * 334 / (var7 * 512);
                int var14 = (arg5 - var13) / 2;
                if (arg1) {
                    class627.field8857.method281();
                    class627.field8857.method1355(arg0, arg4, var14, arg2, -16777216, 1);
                    class627.field8857.method1355(arg0 + arg5 - var14, arg4, var14, arg2, -16777216, 1);
                }
                arg0 += var14;
                arg5 -= var14 * 2;
            }
        }
        class682.field9560 = (short) arg5;
        class218.field3573 = arg0;
        int var15 = -121 % ((4 - arg3) / 42);
        class331.field5132 = arg5 * var7 / 334;
        class598.field8498 = (short) arg2;
        class304.field4769 = arg4;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static void method3849(int arg0) {
        field9483 = null;
        field9487 = null;
        if (arg0 == -20897) {
            field9482 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3850(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
