import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class43 {

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "I")
    public static int field592 = 0;

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "I")
    public static int field593 = 0;

    @OriginalMember(owner = "client!pja", name = "c", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!pja", name = "d", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(II)Lem;", line = 4)
    public static final class239 method351(int arg0, int arg1) {
        field594++;
        return arg0 <= arg1 && arg1 < 100 ? class704.field9914[arg1] : null;
    }
}
