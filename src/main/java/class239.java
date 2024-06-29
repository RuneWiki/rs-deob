import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class239 {

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "Lfh;")
    public static class653 field3101 = new class653();

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "Lkg;")
    public static class275 field3103 = new class275(102, 16);

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "Lvj;")
    public static class444 field3102;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ida", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field3104;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lav;)V")
    public static final void method1494(class641 arg0) {
        class386.field4924 = arg0;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZLjava/io/File;I)V")
    public static final void method1495(boolean arg0, File arg1, int arg2) {
        if (class9.field128 == null) {
            class130.method968(21442);
        }
        field3099++;
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field3104 == null ? (field3104 = method1497("java.lang.String")) : field3104, Boolean.TYPE);
            var4.invoke(class9.field128, arg1.getAbsolutePath(), Boolean.valueOf(arg0));
            if (arg2 >= -93) {
                method1494(null);
            }
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
    public static void method1496(int arg0) {
        field3102 = null;
        field3103 = null;
        field3101 = null;
        if (arg0 != 16) {
            field3101 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1497(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
