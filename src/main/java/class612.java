import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class612 {

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "Lhga;")
    public static class158 field8699 = new class158(105, 3);

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "Lji;")
    public static class567 field8700;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIII)Z", line = 5)
    public static final boolean method3563(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8701++;
        if (arg0 >= -119) {
            method3564((byte) -77);
        }
        if ((class690.field9676[0][arg4][arg1] & 0x2) != 0) {
            return true;
        } else if ((class690.field9676[arg3][arg4][arg1] & 0x10) == 0) {
            return class4.method20(-106, arg3, arg4, arg1) == arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V", line = 36)
    public static void method3564(byte arg0) {
        if (arg0 <= -43) {
            field8699 = null;
            field8700 = null;
        }
    }
}
