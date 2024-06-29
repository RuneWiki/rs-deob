import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class301 {

    @OriginalMember(owner = "client!du", name = "b", descriptor = "Lhb;")
    public static class629 field4426 = new class629(1, 2);

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public static int field4428 = -1;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field4431 = 1400;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1998(int arg0) {
        field4427++;
        if (class191.field2426) {
            return;
        }
        class315.method2073(-8644, class326.field4699);
        if (class327.field4722 != null) {
            class315.method2073(-8644, class327.field4722);
        }
        class191.field2426 = true;
        if (arg0 != 16384) {
            method2001(-113);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)Leba;", line = 33)
    public static final class511 method1999(byte arg0) {
        field4429++;
        if (class257.field3662.length > class592.field8500) {
            return class257.field3662[class592.field8500++];
        } else {
            if (arg0 != -128) {
                field4428 = 59;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(B)V", line = 53)
    public static void method2000(byte arg0) {
        field4426 = null;
        if (arg0 != 80) {
            field4428 = 38;
        }
    }

    @OriginalMember(owner = "client!du", name = "b", descriptor = "(I)I", line = 63)
    public static final int method2001(int arg0) {
        field4430++;
        if (arg0 != -32586) {
            field4431 = -110;
        }
        return 45;
    }
}
