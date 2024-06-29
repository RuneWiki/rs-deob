import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class604 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field8446;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lwia;")
    public static class791 field8447;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V", line = 7)
    public static void method3501(boolean arg0) {
        field8447 = null;
        if (arg0) {
            field8447 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I", line = 20)
    public static final int method3502(int arg0, int arg1, int arg2) {
        field8446++;
        if (arg0 == 1 || arg0 == 3) {
            return class263.field3858[arg1 & 0x3];
        } else if (arg2 == 3) {
            return class138.field2062[arg1 & 0x3];
        } else {
            return 116;
        }
    }
}
