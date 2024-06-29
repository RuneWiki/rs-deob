import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class225 {

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "F")
    public static float field2632;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIII)V")
    public static final void method1384(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class68.field940 != null) {
            class68.field940[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class316.field3876 != null) {
            class316.field3876[arg0][arg1] = (short) arg3;
        }
        if (class406.field5335 != null) {
            class406.field5335[arg0][arg1] = (byte) arg4;
        }
    }
}
