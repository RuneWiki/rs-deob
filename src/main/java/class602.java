import java.awt.Container;
import java.awt.Insets;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class602 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "[I")
    public static int[] field8511 = new int[256];

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Lqe;")
    public static class469 field8517;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "[I")
    public static int[] field8518;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field8514;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field8516;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field8519;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field8520;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static final void method3495(boolean arg0) {
        field8516++;
        for (class345 var1 = (class345) class299.field4241.method1195(0); var1 != null; var1 = (class345) class299.field4241.method1201(2)) {
            class93 var2 = var1.field4995;
            if (var2.field1331 < class357.field5189) {
                var1.method1304((byte) 7);
                var2.method730(16383);
            } else if (var2.field1322 <= class357.field5189) {
                var2.method740(1210318848);
                if (var2.field1311 > 0) {
                    class432 var3 = (class432) class497.field7067.method2287((long) (var2.field1311 - 1), (byte) -117);
                    if (var3 != null) {
                        class282 var4 = var3.field6439;
                        if (var4.field8423 >= 0 && (class194.field2946 * 512) > var4.field8423 && var4.field8428 >= 0 && var4.field8428 < (class255.field3656 * 512)) {
                            var2.method735(-1, class384.method2468(arg0, var4.field8423, var2.field8429, var4.field8428) - var2.field1305, class357.field5189, var4.field8423, var4.field8428);
                        }
                    }
                }
                if (var2.field1311 < 0) {
                    int var5 = -var2.field1311 - 1;
                    class689 var6;
                    if (class701.field9775 == var5) {
                        var6 = class130.field1749;
                    } else {
                        var6 = class314.field4456[var5];
                    }
                    if (var6 != null && var6.field8423 >= 0 && class194.field2946 * 512 > var6.field8423 && var6.field8428 >= 0 && var6.field8428 < (class255.field3656 * 512)) {
                        var2.method735(-1, class384.method2468(true, var6.field8423, var2.field8429, var6.field8428) - var2.field1305, class357.field5189, var6.field8423, var6.field8428);
                    }
                }
                var2.method729(class12.field171, (byte) -124);
                class9.method57(var2, true);
            }
        }
        if (!arg0) {
            field8511 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static final synchronized void method3496(int arg0) {
        field8513++;
        if (class700.field9652 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field8519 == null ? (field8519 = method3501("java.lang.String")) : field8519, field8520 == null ? (field8520 = method3501("java.lang.Class")) : field8520);
            class700.field9652 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
        if (arg0 != -1) {
            method3497(false);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)V")
    public static void method3497(boolean arg0) {
        if (!arg0) {
            field8518 = null;
            field8517 = null;
            field8511 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method3498(boolean arg0, String arg1) {
        field8512++;
        if (class329.field4678.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class329.field4678.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class329.field4678.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            if (arg0) {
                method3498(true, null);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public static final void method3499(int arg0) {
        class490.method2933(16776960);
        field8514++;
        if (arg0 != -16805) {
            field8518 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method3500(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field8515++;
        if (class183.field2801 != null && (arg3 != 3 || class185.field2824 != arg4 || class701.field9754 != arg0)) {
            class295.method1869(class183.field2801, (byte) -34, class179.field2759);
            class183.field2801 = null;
        }
        if (arg3 == 3 && class183.field2801 == null) {
            class183.field2801 = class15.method95(0, class179.field2759, 0, 0, arg4, arg0);
            if (class183.field2801 != null) {
                class701.field9754 = arg0;
                class185.field2824 = arg4;
                class585.method3384(-81);
            }
        }
        if (arg3 == 3 && class183.field2801 == null) {
            method3500(-1, arg1, 106, class63.field916.field10172.method953(17503), -1, true);
            return;
        }
        Container var6;
        if (class183.field2801 != null) {
            class455.field6702 = arg0;
            var6 = class183.field2801;
            class153.field2475 = arg4;
        } else if (class169.field2648 == null) {
            if (class466.field6830 == null) {
                var6 = class176.field2729;
            } else {
                var6 = class466.field6830;
            }
            class153.field2475 = var6.getSize().width;
            class455.field6702 = var6.getSize().height;
        } else {
            Insets var7 = class169.field2648.getInsets();
            int var10001 = var7.right + var7.left;
            class153.field2475 = class169.field2648.getSize().width - var10001;
            int var10 = var7.top + var7.bottom;
            class455.field6702 = class169.field2648.getSize().height - var10;
            var6 = class169.field2648;
        }
        if (arg3 == 1) {
            class510.field7263 = class344.field4988;
            class37.field381 = 0;
            class501.field7123 = class291.field4165;
            class238.field3466 = (class153.field2475 - class291.field4165) / 2;
        } else {
            class195.method1356((byte) -23);
        }
        if (class607.field8585 != class206.field3043) {
            boolean var10000;
            if (class501.field7123 < 1024 && class510.field7263 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg5) {
            class72.method617((byte) -64);
        } else {
            class106.field1476.setSize(class501.field7123, class510.field7263);
            if (class419.field6265) {
                class396.method2527(1, class106.field1476);
            } else {
                class736.field10316.method417(class106.field1476, class501.field7123, class510.field7263);
            }
            if (class169.field2648 == var6) {
                Insets var8 = class169.field2648.getInsets();
                class106.field1476.setLocation(class238.field3466 + var8.left, class37.field381 + var8.top);
            } else {
                class106.field1476.setLocation(class238.field3466, class37.field381);
            }
        }
        if (arg3 >= 2) {
            class127.field1684 = true;
        } else {
            class127.field1684 = false;
        }
        if (class87.field1249 != -1) {
            class483.method2891(true, false);
        }
        if (class533.field7668 != null && class239.method1585(class87.field1246, (byte) 86)) {
            class175.method1245(false);
        }
        if (arg2 >= 38) {
            for (int var9 = 0; var9 < 100; var9++) {
                class228.field3352[var9] = true;
            }
            class72.field1017 = true;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3501(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field8511[var0] = var1;
        }
        field8517 = new class469(9, -1);
        field8518 = new int[5];
    }
}
