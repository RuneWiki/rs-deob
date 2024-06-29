import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class491 extends class335 {

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "Z")
    public static boolean field6789 = false;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    public static int field6790;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZI)[I", line = 3)
    public final int[] method3(boolean arg0, int arg1) {
        field6790++;
        return arg0 ? class376.field4981 : null;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V", line = 17)
    public class491() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)I", line = 22)
    public static final int method2808(byte arg0, int arg1) {
        if (arg0 < 81) {
            field6791 = -53;
        }
        field6792++;
        return arg1 >>> 8;
    }
}
