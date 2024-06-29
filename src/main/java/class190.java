import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public abstract class class190 {

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
    public static int field2300 = 0;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "Lkfa;")
    public static class549 field2299 = new class549(32, 16);

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
    public static int field2301 = -1;

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V", line = 9)
    public static void method1101(byte arg0) {
        if (arg0 <= 101) {
            field2299 = null;
        }
        field2299 = null;
    }
}
