import java.io.InputStream;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class341 extends InputStream {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field4280;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field4282;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "Z")
    public static boolean field4281;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2028(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2026(int arg0) {
        field4279++;
        try {
            Method var1 = (field4282 == null ? (field4282 = method2028("java.lang.Runtime")) : field4282).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class635.field8667 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!dh", name = "read", descriptor = "()I", line = 32)
    public final int read() {
        class594.method3405(30000L, 16711680);
        field4278++;
        return -1;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 44)
    public static final void method2027(byte arg0) {
        field4280++;
        class786.field10838 = new class75(class637.field8679.method3584(class770.field10592, true), "", class680.field9309, 1008, -1, 0L, 0, 0, true, false, 0L, true);
        if (arg0 < 55) {
            field4281 = true;
        }
    }
}
