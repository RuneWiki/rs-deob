import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class520 extends class321 {

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public static int field7638 = 0;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "Lrb;")
    public static class283 field7636 = new class283(25, -1);

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "Lrb;")
    public static class283 field7639 = new class283(49, -2);

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "Z")
    public static boolean field7640 = false;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field7637;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cp", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field7641;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V")
    public static final void method3098(boolean arg0) {
        if (!arg0) {
            method3098(true);
        }
        field7637++;
        try {
            Method var1 = (field7641 == null ? (field7641 = method3100("java.lang.Runtime")) : field7641).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class309.field4208 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public static void method3099(int arg0) {
        field7639 = null;
        if (arg0 != -1) {
            method3099(-97);
        }
        field7636 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3100(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
