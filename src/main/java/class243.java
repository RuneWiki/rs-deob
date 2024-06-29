import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class243 extends class32 {

    @OriginalMember(owner = "client!dt", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field3397;

    @OriginalMember(owner = "client!dt", name = "I", descriptor = "Lhda;")
    public static class752 field3402 = new class752(90, -2);

    @OriginalMember(owner = "client!dt", name = "J", descriptor = "I")
    public static int field3403 = 0;

    @OriginalMember(owner = "client!dt", name = "C", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!dt", name = "E", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!dt", name = "G", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!dt", name = "H", descriptor = "Lclient;")
    public static client field3401;

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class243(Object arg0, int arg1) {
        super(arg1);
        this.field3397 = arg0;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
    public static final void method1515(int arg0, int arg1, int arg2) {
        field3399++;
        class127 var3 = class760.method4231(arg1, -874792672, 14);
        var3.method1010(614);
        var3.field2099 = arg0;
        if (arg2 != -2) {
            field3401 = null;
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
    public static void method1516(int arg0) {
        field3401 = null;
        if (arg0 <= 67) {
            method1516(96);
        }
        field3402 = null;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method273(int arg0) {
        field3400++;
        if (arg0 != 75) {
            this.method273(-114);
        }
        return this.field3397;
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)Z")
    public final boolean method274(byte arg0) {
        field3398++;
        if (arg0 < 7) {
            field3401 = null;
        }
        return false;
    }
}
