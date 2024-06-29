import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class504 {

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field7349 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field7348 = 0;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "S")
    public static short field7351 = 256;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field7350;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field7352;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static final void method2973(int arg0) {
        try {
            if (arg0 != 0) {
                method2973(-77);
            }
            Method var1 = (field7352 == null ? (field7352 = method2974("java.lang.Runtime")) : field7352).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class291.field4730 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field7347++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2974(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
