import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class35 {

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Lsd;")
    public static class63 field356 = new class63(7, 0, 1, 1);

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Z")
    public static boolean field357 = true;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lfo;")
    public static class361 field351;

    // $FF: synthetic field
    @OriginalMember(owner = "client!na", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field358;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[[[J")
    public static long[][][] field354;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public static void method191(boolean arg0) {
        if (!arg0) {
            field354 = null;
        }
        field354 = null;
        field351 = null;
        field356 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static final void method192(byte arg0) {
        try {
            Method var1 = (field358 == null ? (field358 = method193("java.lang.Runtime")) : field358).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class334.field4429 = var3;
                } catch (Throwable var4) {
                }
            }
            if (arg0 != -35) {
                method191(true);
            }
        } catch (Exception var5) {
        }
        field355++;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method193(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
