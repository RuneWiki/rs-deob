import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class160 extends class239 {

    @OriginalMember(owner = "client!aba", name = "C", descriptor = "Ljava/lang/Object;")
    private Object field2712;

    @OriginalMember(owner = "client!aba", name = "F", descriptor = "I")
    public static int field2715 = -2;

    @OriginalMember(owner = "client!aba", name = "B", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!aba", name = "D", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!aba", name = "E", descriptor = "I")
    public static int field2714;

    @OriginalMember(owner = "client!aba", name = "G", descriptor = "I")
    public static int field2716;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aba", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field2717;

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1236(int arg0) {
        if (arg0 == -5346) {
            field2713++;
            return this.field2712;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1237(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class307.field4544 = arg3;
        class542.field7567 = arg2;
        if (arg4) {
            field2715 = 25;
        }
        class571.field8304 = arg6;
        class277.field4149 = arg5;
        field2714++;
        class70.field1486 = arg1;
        class613.field8923 = arg0;
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class160(Object arg0, int arg1) {
        super(arg1);
        this.field2712 = arg0;
    }

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "(I)V")
    public static final void method1238(int arg0) {
        field2711++;
        try {
            Method var1 = (field2717 == null ? (field2717 = method1240("java.lang.Runtime")) : field2717).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class114.field2051 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(Z)Z")
    public final boolean method1239(boolean arg0) {
        field2716++;
        return !arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1240(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
