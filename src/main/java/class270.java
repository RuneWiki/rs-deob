import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class270 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "[I")
    public static int[] field4353 = new int[100];

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field4357 = 0;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static final void method1794(int arg0) {
        class242.field3838 = 0;
        if (arg0 != -20745) {
            method1796((byte) -124);
        }
        class309.field5003 = 0;
        class191.field3120 = -3;
        field4355++;
        class246.field3873 = false;
        class250.field4111 = 0;
        class163.field2650 = -1;
        class199.field3195 = 1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V")
    public static final void method1795(int arg0, int arg1) {
        field4356++;
        if (arg1 >= -112) {
            field4354 = 25;
        }
        class242.field3801.method1880(-77, arg0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method1796(byte arg0) {
        field4353 = null;
        if (arg0 != -82) {
            field4357 = 80;
        }
    }
}
