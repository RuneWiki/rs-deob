import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class455 {

    @OriginalMember(owner = "client!it", name = "a", descriptor = "I")
    public static int field6739;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!it", name = "c", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "Lcv;")
    public static class398 field6742;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Z")
    public static final boolean method2733(int arg0, int arg1) {
        field6740++;
        if (arg1 != 9025) {
            field6739 = -61;
        }
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
    public static void method2734(int arg0) {
        field6742 = null;
        if (arg0 != 4) {
            field6739 = -11;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method2735(int arg0, String arg1, int arg2, String arg3) {
        class310.field4453 = arg2;
        class69.field1050 = arg1;
        class474.field6983 = arg3;
        field6741++;
        if (class474.field6983.equals("") || class69.field1050.equals("")) {
            class80.field1217 = 3;
        } else if (class102.field1474 == -1) {
            class251.field3731 = 0;
            class80.field1217 = -3;
            class107.field1540 = 0;
            class34.field357 = 1;
            class209 var4 = new class209(128);
            var4.method1410(10, arg0 - 27645);
            var4.method1415((int) (Math.random() * 9.9999999E7D), (byte) -63);
            var4.method1411(2144512464, class439.method2649((byte) -121, class474.field6983));
            var4.method1415((int) (Math.random() * 9.9999999E7D), (byte) -115);
            var4.method1418(true, class69.field1050);
            var4.method1415((int) (Math.random() * 9.9999999E7D), (byte) -107);
            var4.method1420(class244.field3600, class338.field4759, 127);
            class356.field5471.field3037 = arg0;
            class356.field5471.method1410(class46.field743.field4730, arg0 ^ 0xFFFF9403);
            class356.field5471.method1410(var4.field3037 + 2, -27645);
            class356.field5471.method1413(-120, 589);
            class356.field5471.method1445(var4.field3036, var4.field3037, (byte) 93, 0);
        } else {
            class104.method642(arg0 + 1);
        }
    }
}
