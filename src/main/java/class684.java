import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class684 {

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "F")
    public static float field9593;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public int field9588;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public int field9590;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public int field9591;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public int field9592;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field9594;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public int field9595;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public int field9596;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(BLjava/lang/String;)I", line = 7)
    public static final int method3889(byte arg0, String arg1) {
        field9594++;
        if (arg0 != 112) {
            field9593 = -0.46706942F;
        }
        for (int var2 = 0; var2 < class301.field4708.length; var2++) {
            if (class301.field4708[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
