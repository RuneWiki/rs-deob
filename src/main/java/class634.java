import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class634 {

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "I")
    public static int field8854 = 0;

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "Lmga;")
    public static class739 field8853 = new class739(61, -1);

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
    public static int field8856;

    // $FF: synthetic field
    @OriginalMember(owner = "client!raa", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field8857;

    @OriginalMember(owner = "client!raa", name = "d", descriptor = "[Z")
    public static boolean[] field8855;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(I)V")
    public static void method3551(int arg0) {
        if (arg0 != 6320) {
            method3552(21, true, null);
        }
        field8853 = null;
        field8855 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IZLjava/io/File;)V")
    public static final void method3552(int arg0, boolean arg1, File arg2) {
        int var3 = -59 / ((arg0 + 69) / 36);
        field8852++;
        if (class130.field1935 == null) {
            class37.method263(false);
        }
        try {
            Class var4 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var5 = var4.getDeclaredMethod("dumpHeap", field8857 == null ? (field8857 = method3553("java.lang.String")) : field8857, Boolean.TYPE);
            var5.invoke(class130.field1935, arg2.getAbsolutePath(), Boolean.valueOf(arg1));
        } catch (Exception var7) {
            System.out.println("HeapDump error:");
            var7.printStackTrace();
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3553(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
