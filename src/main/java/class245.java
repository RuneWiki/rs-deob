import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class245 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field4325 = 0;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field4324 = 0;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lhh;")
    private static class163 field4323 = class137.method1065(" from your friend list first)3", 17);

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "Lhh;")
    public static class163 field4330 = field4323;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
    public static final void method1686(int arg0, int arg1) {
        if (arg0 == -1) {
            field4329++;
            class192.field3512.method112(arg1, 113);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lpg;B)Lcb;")
    public static final class28 method1687(class81 arg0, byte arg1) {
        if (arg1 != 121) {
            field4325 = -59;
        }
        field4331++;
        return new class28(arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method647(true), arg0.method615(-127), arg0.method615(-111), arg0.method622(true));
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)Z")
    public static final boolean method1688(int arg0) {
        field4327++;
        return ~class157.field2919 == arg0 ? class115.field2191.method713(arg0 ^ 0x60CE0D57) : true;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)Z")
    public static final boolean method1689(int arg0, byte arg1) {
        field4328++;
        if (arg1 >= -101) {
            method1688(17);
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public static void method1690(byte arg0) {
        field4330 = null;
        field4323 = null;
        if (arg0 > -120) {
            method1686(10, 105);
        }
    }
}
