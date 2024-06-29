import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class439 {

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "Lju;")
    public static class102 field6021 = new class102(52, 4);

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "Lju;")
    public static class102 field6023 = new class102(12, 8);

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "F")
    public static float field6022;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)V")
    public static void method2629(int arg0) {
        if (arg0 >= -121) {
            method2630(-86, (byte) 10);
        }
        field6021 = null;
        field6023 = null;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(IB)Z")
    public static final boolean method2630(int arg0, byte arg1) {
        if (arg1 != -78) {
            method2630(107, (byte) 40);
        }
        field6020++;
        return arg0 == 10 || arg0 == 11 || arg0 == 12;
    }
}
