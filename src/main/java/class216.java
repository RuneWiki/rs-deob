import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class216 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3710 = 0;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lsc;")
    public static class181 field3709 = class149.method967(255, "");

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Lng;")
    public static class46 field3713;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "[I")
    public static int[] field3712;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static void method1432(int arg0) {
        int var1 = 75 % ((41 - arg0) / 40);
        field3713 = null;
        field3712 = null;
        field3709 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
    public static final void method1433(int arg0, int arg1) {
        field3714++;
        if (class97.field1575 == 0) {
            class247.field4317.method1266((byte) 65, arg0);
        } else {
            class255.field4466 = arg0;
        }
        if (arg1 != 0) {
            method1433(91, -12);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public static final void method1434(int arg0) {
        if (arg0 == 11567) {
            field3711++;
            class115.field1871.method1790(0);
            class194.field3391.method1790(0);
        }
    }
}
