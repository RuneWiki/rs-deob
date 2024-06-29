import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class746 {

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Z")
    public static boolean field10063 = false;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field10062;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public static int field10064;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method4087(String arg0, int arg1) {
        field10064++;
        for (int var2 = arg1; var2 < class95.field1368.length; var2++) {
            if (class95.field1368[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)[Log;")
    public static final class673[] method4088(byte arg0) {
        if (arg0 < 98) {
            field10063 = true;
        }
        field10062++;
        return new class673[] { class193.field2513, class760.field10443, class375.field5487 };
    }
}
