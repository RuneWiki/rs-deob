import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class419 extends class704 {

    @OriginalMember(owner = "client!bt", name = "x", descriptor = "Ljava/lang/Object;")
    private Object field5905;

    @OriginalMember(owner = "client!bt", name = "y", descriptor = "Lst;")
    public static class335 field5906 = new class335(83, 7);

    @OriginalMember(owner = "client!bt", name = "A", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!bt", name = "B", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!bt", name = "z", descriptor = "Loia;")
    public static class52 field5907;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 3)
    public final Object method2597(int arg0) {
        field5909++;
        if (arg0 != 0) {
            field5906 = null;
        }
        return this.field5905;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Lcr;Ljava/lang/Object;I)V", line = 14)
    public class419(class294 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5905 = arg1;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)Z", line = 33)
    public final boolean method2598(boolean arg0) {
        if (!arg0) {
            this.method2597(61);
        }
        field5908++;
        return false;
    }

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "(I)V", line = 44)
    public static void method2599(int arg0) {
        field5906 = null;
        if (arg0 != 7) {
            method2599(26);
        }
        field5907 = null;
    }
}
