import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class636 {

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public int field8958;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public int field8954;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public int field8951;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public int field8957;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "Lbs;")
    public static class215 field8953 = new class215();

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field8952;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field8956;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jv", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field8959;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3578(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 8)
    public static void method3574(int arg0) {
        if (arg0 != -2200) {
            field8953 = null;
        }
        field8953 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IB)Ljv;", line = 20)
    public final class636 method3575(int arg0, byte arg1) {
        if (arg1 < 79) {
            this.field8951 = 102;
        }
        field8955++;
        return new class636(this.field8954, arg0, this.field8958, this.field8957);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V", line = 31)
    public static final void method3576(byte arg0) {
        if (arg0 < 92) {
            return;
        }
        class19 var1 = class593.field8375;
        synchronized (class593.field8375) {
            class593.field8375.method88(58);
        }
        field8952++;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILjava/io/File;Z)V", line = 44)
    public static final void method3577(int arg0, File arg1, boolean arg2) {
        field8956++;
        if (class553.field7900 == null) {
            class56.method297((byte) 12);
        }
        try {
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field8959 == null ? (field8959 = method3578("java.lang.String")) : field8959, Boolean.TYPE);
            var4.invoke(class553.field7900, arg1.getAbsolutePath(), Boolean.valueOf(arg2));
            if (arg0 < 43) {
                field8953 = null;
            }
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(IIII)V", line = 74)
    public class636(int arg0, int arg1, int arg2, int arg3) {
        this.field8958 = arg2;
        this.field8954 = arg0;
        this.field8951 = arg1;
        this.field8957 = arg3;
    }
}
