import java.io.File;
import java.lang.reflect.Method;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class670 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field9189 = new Hashtable();

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field9190;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field9192;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field9193;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static final void method3757(int arg0) {
        field9191++;
        class707.field9936 = 0;
        class415.field5422 = new class228[50];
        if (arg0 != 16680) {
            method3758(83);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static void method3758(int arg0) {
        field9189 = null;
        if (arg0 != 50) {
            field9189 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZZLjava/io/File;)V")
    public static final void method3759(boolean arg0, boolean arg1, File arg2) {
        if (class635.field8665 == null) {
            class716.method4049(-71);
        }
        field9192++;
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field9193 == null ? (field9193 = method3761("java.lang.String")) : field9193, Boolean.TYPE);
            if (!arg0) {
                method3759(true, true, null);
            }
            var4.invoke(class635.field8665, arg2.getAbsolutePath(), Boolean.valueOf(arg1));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILhc;Lhc;)V")
    public static final void method3760(int arg0, class152 arg1, class152 arg2) {
        if (arg2.field1893 != null) {
            arg2.method1088(4);
        }
        field9190++;
        arg2.field1893 = arg1;
        arg2.field1903 = arg1.field1903;
        arg2.field1893.field1903 = arg2;
        arg2.field1903.field1893 = arg2;
        if (arg0 != 50) {
            method3758(-100);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3761(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
