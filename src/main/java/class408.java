import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class408 {

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public int field5468;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public int field5464;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public int field5469;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public int field5465;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "J")
    public static long field5462 = 0L;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lhb;")
    public static class250 field5463 = new class250(54, -1);

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
    public static int[] field5467 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field5470;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jd", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field5471;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2424(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)Z", line = 4)
    public static final boolean method2420(int arg0) {
        field5461++;
        if (arg0 != 9896) {
            field5467 = null;
        }
        return class458.field6395;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V", line = 22)
    public static void method2421(boolean arg0) {
        field5463 = null;
        if (!arg0) {
            field5467 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIZI)V", line = 36)
    public static final void method2422(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            return;
        }
        field5460++;
        if (arg3 == arg5) {
            class194.method1254(arg1, arg5, arg2, arg0, (byte) 45);
        } else if (class65.field827 <= arg1 - arg5 && class281.field3589 >= (arg1 + arg5) && class418.field5559 <= arg2 - arg3 && class456.field6365 >= (arg2 + arg3)) {
            class448.method2659(true, arg1, arg2, arg0, arg5, arg3);
        } else {
            class183.method1210((byte) 86, arg5, arg2, arg3, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V", line = 60)
    public static final void method2423(int arg0) {
        if (arg0 != -457) {
            field5463 = null;
        }
        if (class441.field6150 == 2) {
            class472.field6899 = 96;
        } else {
            try {
                Method var1 = (field5471 == null ? (field5471 = method2424("java.lang.Runtime")) : field5471).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class472.field6899 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field5466++;
    }

    @OriginalMember(owner = "client!jd", name = "toString", descriptor = "()Ljava/lang/String;", line = 93)
    public final String toString() {
        field5470++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIII)V", line = 113)
    public class408(int arg0, int arg1, int arg2, int arg3) {
        this.field5468 = arg0;
        this.field5464 = arg3;
        this.field5469 = arg2;
        this.field5465 = arg1;
    }
}
