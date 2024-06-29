import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class169 extends class68 {

    @OriginalMember(owner = "client!se", name = "o", descriptor = "[I")
    public static int[] field2168 = new int[1000];

    @OriginalMember(owner = "client!se", name = "n", descriptor = "[S")
    public static short[] field2167 = new short[256];

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lse;")
    public class169 field2165;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Lse;")
    public class169 field2169;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V", line = 3)
    public final void method1083(boolean arg0) {
        field2166++;
        if (this.field2169 == null) {
            return;
        }
        this.field2169.field2165 = this.field2165;
        this.field2165.field2169 = this.field2169;
        this.field2165 = null;
        this.field2169 = null;
        if (arg0) {
            field2168 = null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V", line = 39)
    public static void method1084(byte arg0) {
        field2168 = null;
        field2167 = null;
        int var1 = -46 / ((-arg0 - 62) / 59);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lfh;I)Lrg;", line = 49)
    public static final class456 method1085(class463 arg0, int arg1) {
        if (arg1 != 256) {
            method1085(null, -42);
        }
        field2164++;
        return new class456(arg0.method2791(true), arg0.method2791(true), arg0.method2791(true), arg0.method2791(true), arg0.method2738(-118), arg0.method2737(false));
    }
}
