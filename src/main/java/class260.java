import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public abstract class class260 {

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public int field3778;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public int field3783;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field3781;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sn", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field3785;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "[B")
    public static byte[] field3784;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIII)V")
    public static final void method1649(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            method1650(false);
        }
        if (arg0 == 1001) {
            class30.method283(class47.field652, arg3, arg1);
        } else if (arg0 == 1011) {
            class30.method283(class476.field6808, arg3, arg1);
        } else if (arg0 == 1009) {
            class30.method283(class358.field5087, arg3, arg1);
        } else if (arg0 == 1008) {
            class30.method283(class433.field6374, arg3, arg1);
        } else if (arg0 == 1002) {
            class30.method283(class44.field603, arg3, arg1);
        }
        field3781++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)V")
    public abstract void method32(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
    public static void method1650(boolean arg0) {
        field3784 = null;
        if (arg0) {
            method1650(false);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)V")
    public static final void method1651(boolean arg0) {
        class115[] var1 = class616.field8718;
        synchronized (class616.field8718) {
            if (!arg0) {
                method1650(false);
            }
            int var2 = 0;
            while (true) {
                if (class616.field8718.length <= var2) {
                    break;
                }
                class616.field8718[var2] = new class115();
                class79.field1426[var2] = 0;
                var2++;
            }
        }
        field3780++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(III)V")
    public abstract void method30(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V")
    public static final void method1652(int arg0) {
        if (arg0 != 1009) {
            method1649(43, -10, -30, -101);
        }
        field3779++;
        try {
            Method var1 = (field3785 == null ? (field3785 = method1653("java.lang.Runtime")) : field3785).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class605.field8613 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(III)V")
    public class260(int arg0, int arg1, int arg2) {
        this.field3778 = arg0;
        this.field3782 = arg2;
        this.field3783 = arg1;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZII)V")
    public abstract void method33(boolean arg0, int arg1, int arg2);

    // $FF: synthetic method
    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1653(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
