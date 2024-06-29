import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class276 {

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "I")
    public int field4183;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "I")
    public int field4184;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public int field4186;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method1807(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class161.field2313 != null) {
            class161.field2313[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class386.field5441 != null) {
            class386.field5441[arg0][arg1] = (short) arg3;
        }
        if (class252.field3889 != null) {
            class252.field3889[arg0][arg1] = (byte) arg4;
        }
    }
}
