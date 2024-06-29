import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class616 {

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "Z")
    public static boolean field8626 = false;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
    public static int field8624;

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)I", line = 4)
    public static final int method3566(int arg0) {
        field8625++;
        if (arg0 != 2) {
            field8624 = 8;
        }
        return class63.field756 == null ? 0 : class63.field756.length * 2;
    }
}
