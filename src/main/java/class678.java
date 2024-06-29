import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class678 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Lmga;")
    public static class739 field9484 = new class739(40, 7);

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "[I")
    public static int[] field9485 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field9486;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 3)
    public static void method3751(int arg0) {
        if (arg0 == 5390) {
            field9484 = null;
            field9485 = null;
        }
    }
}
