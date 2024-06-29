import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class328 {

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "Llf;")
    public static class238 field4670 = new class238();

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "Lmia;")
    public static class63 field4673 = new class63(63, 6);

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)V", line = 5)
    public static void method2075(int arg0) {
        int var1 = 24 % ((-arg0 - 1) / 61);
        field4670 = null;
        field4673 = null;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IB)Z", line = 19)
    public static final boolean method2076(int arg0, byte arg1) {
        if (arg1 == -121) {
            field4669++;
            return arg0 >= 12 && arg0 <= 17;
        } else {
            return true;
        }
    }
}
