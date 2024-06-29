import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class507 {

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "Ldc;")
    public static class302 field7162;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field7167;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gm", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field7168;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public static void method2880(int arg0) {
        field7162 = null;
        if (arg0 != -2000) {
            field7162 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lrg;B)V")
    public static final void method2881(class523 arg0, byte arg1) {
        field7166++;
        int var2 = arg0.field7359 - class45.field685;
        int var3 = arg0.field7343 * 512 + (arg0.method422((byte) -99) * 256);
        int var4 = arg0.field7345 * 512 + (arg0.method422((byte) -114) * 256);
        if (arg1 >= -13) {
            method2883(93L, 49);
        }
        arg0.field7895 += (var3 - arg0.field7895) / var2;
        arg0.field7432 = 0;
        arg0.field7896 += (var4 - arg0.field7896) / var2;
        if (arg0.field7425 == 0) {
            arg0.method2954((byte) 47, 8192);
        }
        if (arg0.field7425 == 1) {
            arg0.method2954((byte) -118, 12288);
        }
        if (arg0.field7425 == 2) {
            arg0.method2954((byte) 96, 0);
        }
        if (arg0.field7425 == 3) {
            arg0.method2954((byte) -107, 4096);
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public static final synchronized void method2882(byte arg0) {
        field7165++;
        if (class488.field6929 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            if (arg0 != 100) {
                field7162 = null;
            }
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field7167 == null ? (field7167 = method2885("java.lang.String")) : field7167, field7168 == null ? (field7168 = method2885("java.lang.Class")) : field7168);
            class488.field6929 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(JI)V")
    public static final void method2883(long arg0, int arg1) {
        field7163++;
        int var3 = class623.field9011 + class321.field4681.field7895;
        int var4 = class49.field772 + class321.field4681.field7896;
        if (class677.field9587 - var3 < -2000 || (class677.field9587 - var3) > 2000 || class502.field7101 - var4 < -2000 || (class502.field7101 - var4) > 2000) {
            class502.field7101 = var4;
            class677.field9587 = var3;
        }
        if (class677.field9587 != var3) {
            int var5 = var3 - class677.field9587;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class677.field9587 += var6;
        }
        if (class502.field7101 != var4) {
            int var7 = var4 - class502.field7101;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class502.field7101 += var8;
        }
        if (arg1 != -1) {
            field7162 = null;
        }
        if (!class335.field4872.field9499) {
            class528.field7602 += (float) arg0 * class457.field6595 / 6.0F;
            class311.field4589 += (float) arg0 * class682.field9632 / 6.0F;
        }
        class375.method2316((byte) 122);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lfn;IZ)V")
    public static final void method2884(class617 arg0, int arg1, boolean arg2) {
        class128.field1846.method153((byte) 76, arg0);
        if (arg1 == -1) {
            field7161++;
            if (arg2) {
                class200.method1302(arg0, class128.field1846, class674.field9509, class148.field2100, 20711, class657.field9379);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2885(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
