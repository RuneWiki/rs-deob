import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class194 {

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "Lbd;")
    public static class60 field2590 = new class60(1, 8);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)Z", line = 4)
    public static final boolean method1199(int arg0, byte arg1) {
        field2588++;
        int var2 = 54 / ((arg1 - 62) / 52);
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 19)
    public static void method1200(int arg0) {
        if (arg0 == 14006) {
            field2590 = null;
        }
    }
}
