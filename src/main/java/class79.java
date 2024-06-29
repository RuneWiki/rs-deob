import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class79 extends class97 {

    @OriginalMember(owner = "client!cj", name = "E", descriptor = "I")
    public static int field1094 = -1;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!cj", name = "F", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
    public static final void method505(int arg0, int arg1, int arg2) {
        class108.field1545 = true;
        class69.field992 = arg0;
        class295.field4705 = arg1;
        class89.field1287 = arg2;
        class275.field4360 = -1;
        class249.field3889 = -1;
    }

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "(II)V")
    public static final void method506(int arg0, int arg1) {
        field1093++;
        class179.field2721--;
        if (class179.field2721 == arg1) {
            return;
        }
        int var2 = 90 % (arg0 / 56);
        class285.method1879(class205.field3062, arg1 + 1, class205.field3062, arg1, class179.field2721 - arg1);
        class285.method1879(class137.field1877, arg1 + 1, class137.field1877, arg1, class179.field2721 - arg1);
        class285.method1878(class84.field1186, arg1 + 1, class84.field1186, arg1, class179.field2721 - arg1);
        class285.method1876(class151.field2101, arg1 + 1, class151.field2101, arg1, class179.field2721 - arg1);
        class285.method1875(class51.field717, arg1 + 1, class51.field717, arg1, class179.field2721 - arg1);
        class285.method1878(class228.field3567, arg1 + 1, class228.field3567, arg1, class179.field2721 - arg1);
        class285.method1878(class250.field3910, arg1 + 1, class250.field3910, arg1, class179.field2721 - arg1);
    }
}
