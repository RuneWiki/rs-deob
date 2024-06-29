import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class585 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "[I")
    public static int[] field7990 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field7992 = 0;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3344(int arg0) {
        class587.field8002 = true;
        if (arg0 != 2) {
            method3345(84);
        }
        field7991++;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 14)
    public static void method3345(int arg0) {
        field7990 = null;
        if (arg0 != 4297) {
            field7992 = -9;
        }
    }
}
