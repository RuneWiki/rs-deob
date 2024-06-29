import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class116 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field1958 = 0;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Z")
    public static volatile boolean field1957 = true;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "F")
    public static float field1956;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)[Lhi;")
    public static final class131[] method827(int arg0) {
        field1954++;
        if (arg0 != 0) {
            method827(110);
        }
        return new class131[] { class67.field1084, class82.field1407, class168.field2600, class443.field6844, class484.field7397, class306.field4641, class102.field1821, class330.field4939, class474.field7241, class51.field776, class156.field2458, class508.field7687, class479.field7312, class213.field3304 };
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)Lkn;")
    public static final class500 method828(int arg0, byte arg1) {
        field1955++;
        class500 var2 = (class500) class254.field3880.method1752(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class146.field2370.method2715(arg0, 0, false);
        class500 var4 = new class500();
        if (var3 != null) {
            var4.method3004(new class40(var3), (byte) 127, arg0);
        }
        class254.field3880.method1758(1, var4, (long) arg0);
        if (arg1 <= 75) {
            method828(-49, (byte) -113);
        }
        return var4;
    }

    static {
        new class423("Ok", "Okay", "OK", "Ok");
        field1960 = 0;
    }
}
