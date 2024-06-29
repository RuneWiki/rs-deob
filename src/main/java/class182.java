import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class182 {

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field2702 = 0;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "Z")
    public static boolean field2717 = false;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "I")
    public int field2697;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    public int field2698;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public int field2699;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public int field2701;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
    public int field2703;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public int field2704;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    public int field2707;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public int field2708;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    public int field2709;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public int field2711;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public int field2713;

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public int field2714;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public int field2715;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public int field2716;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bf", name = "w", descriptor = "Ljava/lang/Class;")
    public static Class field2718;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1238(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V", line = 9)
    public static final void method1236(boolean arg0, int arg1) {
        class133.field2022.method2779(14896, arg1);
        if (arg0) {
            field2717 = true;
        }
        field2696++;
        class445.field6549.method2779(14896, arg1);
        class121.field1882.method2779(14896, arg1);
        class399.field5721.method2779(14896, arg1);
        class365.field5248.method2779(14896, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V", line = 31)
    public static final void method1237(byte arg0) {
        field2706++;
        if (class173.field2628 == 2) {
            class20.field294 = 96;
        } else {
            try {
                Method var1 = (field2718 == null ? (field2718 = method1238("java.lang.Runtime")) : field2718).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class20.field294 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        if (arg0 != -80) {
            field2702 = -5;
        }
    }
}
