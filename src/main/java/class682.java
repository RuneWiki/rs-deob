import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class682 {

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "[J")
    public static long[] field9622 = new long[100];

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field9623 = 7000;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V", line = 3)
    public static void method3786(int arg0) {
        field9622 = null;
        if (arg0 != 37) {
            field9622 = null;
        }
    }
}
