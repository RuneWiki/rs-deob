import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class562 {

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "Lmga;")
    public static class739 field7544 = new class739(72, 16);

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "Lmga;")
    public static class739 field7546 = new class739(19, -1);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field7545;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ts", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field7547;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
    public static void method3152(boolean arg0) {
        field7546 = null;
        field7544 = null;
        if (!arg0) {
            method3153(48);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static final void method3153(int arg0) {
        if (arg0 < 11) {
            field7546 = null;
        }
        if (class730.field10124.field977) {
            class396.field5817 = 96;
        } else {
            try {
                Method var1 = (field7547 == null ? (field7547 = method3154("java.lang.Runtime")) : field7547).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class396.field5817 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field7543++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3154(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
