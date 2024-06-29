import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class269 {

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field4266 = 52;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "F")
    public static float field4268;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field4267;

    // $FF: synthetic field
    @OriginalMember(owner = "client!om", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field4269;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public static final void method1861(int arg0) {
        field4267++;
        try {
            Method var1 = (field4269 == null ? (field4269 = method1863("java.lang.Runtime")) : field4269).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class482.field7069 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        if (arg0 != 540800) {
            field4266 = -84;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)Z")
    public static final boolean method1862(int arg0, int arg1, int arg2) {
        field4265++;
        if (arg0 != -24050) {
            field4268 = -1.2711319F;
        }
        return (arg2 & 0x84080) != 0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1863(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
