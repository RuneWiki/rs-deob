import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class155 {

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)Ljava/lang/String;", line = 6)
    public static final String method857(int arg0) {
        field1893++;
        if (class473.field6634 || class605.field8726 == null) {
            return "";
        } else {
            if (arg0 != -1) {
                method857(43);
            }
            return class605.field8726.field1228;
        }
    }
}
