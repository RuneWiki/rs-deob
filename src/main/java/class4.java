import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class4 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lvk;")
    public static class208 field38 = new class208();

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[J")
    public static long[] field40 = new long[100];

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field41 = 0;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field42 = 0;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lln;")
    public static class117 field39;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Z")
    public static boolean field43;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V", line = 6)
    public static void method17(boolean arg0) {
        if (arg0) {
            field40 = null;
            field39 = null;
            field38 = null;
        }
    }
}
