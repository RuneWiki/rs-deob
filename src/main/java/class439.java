import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class439 extends class317 {

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "Ljava/lang/Object;")
    private Object field6398;

    @OriginalMember(owner = "client!jd", name = "y", descriptor = "[I")
    public static int[] field6396 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "Ltm;")
    public static class334 field6397 = new class334(16, 8);

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)Z", line = 4)
    public final boolean method2080(int arg0) {
        if (arg0 == 1) {
            field6399++;
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 15)
    public class439(Object arg0, int arg1) {
        super(arg1);
        this.field6398 = arg0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILraa;I)V", line = 24)
    public static final void method2702(int arg0, int arg1, class353 arg2, int arg3) {
        field6402++;
        if (class146.field2298 != null || class32.field304 || arg2 == null || class328.method2122(123, arg2) == null) {
            return;
        }
        class146.field2298 = arg2;
        class23.field236 = class328.method2122(106, arg2);
        if (arg0 <= -15) {
            class717.field10056 = 0;
            class189.field3190 = arg3;
            class233.field3749 = false;
            class752.field10476 = arg1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 46)
    public final Object method2078(int arg0) {
        field6400++;
        return arg0 == 1 ? this.field6398 : null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(Z)V", line = 65)
    public static void method2703(boolean arg0) {
        field6396 = null;
        field6397 = null;
        if (!arg0) {
            method2702(116, -3, null, 84);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lofa;I)Lcj;", line = 76)
    public static final class442 method2704(class301 arg0, int arg1) {
        if (arg1 == 15543) {
            field6401++;
            return new class442(arg0.method1977((byte) 24), arg0.method1977((byte) -32), arg0.method1977((byte) 37), arg0.method1977((byte) -117), arg0.method1952(22085), arg0.method1952(22085), arg0.method1987(-63));
        } else {
            return null;
        }
    }
}
