import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class40 {

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "Z")
    public static boolean field546 = false;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lqt;I)I")
    public static final int method308(class637 arg0, int arg1) {
        if (arg1 != -14135) {
            field546 = true;
        }
        field547++;
        if (class454.field6199 == arg0) {
            return 5890;
        } else if (class92.field1112 == arg0) {
            return 34167;
        } else if (class227.field3230 == arg0) {
            return 34168;
        } else if (class362.field5101 == arg0) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }
}
