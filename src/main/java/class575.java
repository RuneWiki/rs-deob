import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public abstract class class575 {

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field8150 = 1;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "Lmp;")
    public static class758 field8148 = new class758(16);

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field8149;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field8151;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field8152;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iu", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field8153;

    // $FF: synthetic method
    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3340(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLjava/io/File;Z)V", line = 4)
    public static final void method3336(byte arg0, File arg1, boolean arg2) {
        if (arg0 >= -88) {
            return;
        }
        if (class200.field2872 == null) {
            class478.method2875(2);
        }
        field8151++;
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field8153 == null ? (field8153 = method3340("java.lang.String")) : field8153, Boolean.TYPE);
            var4.invoke(class200.field2872, arg1.getAbsolutePath(), Boolean.valueOf(arg2));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IB)Z", line = 28)
    public static final boolean method3337(int arg0, byte arg1) {
        field8147++;
        int var2 = -12 % ((3 - arg1) / 41);
        return arg0 == 0 || arg0 == 2;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V", line = 38)
    public static void method3338(int arg0) {
        if (arg0 >= -110) {
            method3338(-96);
        }
        field8148 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(JZ)V", line = 58)
    public static final void method3339(long arg0, boolean arg1) {
        field8152++;
        if (arg1) {
            return;
        }
        int var3 = class218.field3100;
        int var4 = class211.field3044;
        if (class701.field9841 != var3) {
            int var5 = var3 - class701.field9841;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class701.field9841 += var6;
        }
        class432.field6035 += (float) arg0 * class15.field190 / 40.0F * 8.0F;
        class321.field4568 += (float) arg0 * class390.field5450 / 40.0F * 8.0F;
        if (class246.field3437 != var4) {
            int var7 = var4 - class246.field3437;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class246.field3437 += var8;
        }
        class181.method1295(100);
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(I)Lsv;")
    public abstract class656 method1381(int arg0);

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)I")
    public abstract int method1382(int arg0, int arg1);

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(IB)[B")
    public abstract byte[] method1375(int arg0, byte arg1);

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(II)V")
    public abstract void method1376(int arg0, int arg1);
}
