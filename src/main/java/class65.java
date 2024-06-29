import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class65 {

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "Ljava/lang/String;")
    public String field933;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "[I")
    public static int[] field932 = new int[6];

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field934;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iv", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field935;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public static void method464(boolean arg0) {
        if (arg0) {
            field932 = null;
        }
        field932 = null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
    public static final void method465(byte arg0, String arg1, String arg2) {
        class445.field6688 = 1;
        class67.field955 = -1;
        field934++;
        class340.method2196(arg2, arg1, true);
        if (arg0 <= 59) {
            field932 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class65(String arg0, int arg1) {
        this.field933 = arg0;
        this.field930 = arg1;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(Z)V")
    public static final void method466(boolean arg0) {
        if (class500.field7379 == 2) {
            class230.field3289 = 96;
        } else {
            try {
                Method var1 = (field935 == null ? (field935 = method467("java.lang.Runtime")) : field935).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class230.field3289 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0) {
            method464(true);
        }
        field929++;
    }

    @OriginalMember(owner = "client!iv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field931++;
        throw new IllegalStateException();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method467(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
