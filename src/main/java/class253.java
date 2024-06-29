import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class253 {

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4047 = "Allocated memory";

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Z")
    public static boolean field4051 = false;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field4046 = 0;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)Lsh;")
    public static final class260 method1656(int arg0) {
        int var1 = 87 % ((arg0 + 55) / 35);
        field4048++;
        try {
            return (class260) Class.forName("hf").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V")
    public static final void method1657(boolean arg0) {
        if (arg0) {
            field4046 = -16;
        }
        if (class9.field128 != null) {
            class172 var1 = class9.field128;
            synchronized (class9.field128) {
                class9.field128 = null;
            }
        }
        field4050++;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
    public static void method1658(int arg0) {
        field4047 = null;
        if (arg0 != 0) {
            field4051 = true;
        }
    }
}
