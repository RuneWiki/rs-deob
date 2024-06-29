import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class579 {

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "[I")
    public static int[] field7760;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3230(int arg0) {
        field7762++;
        if (class589.field7912) {
            return;
        }
        class757.field10501 = true;
        class281.field4142 += (-12.0F - class281.field4142) / 2.0F;
        class589.field7912 = true;
        if (arg0 <= 53) {
            field7761 = 111;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 25)
    public static void method3231(int arg0) {
        field7760 = null;
        if (arg0 < 118) {
            field7761 = 108;
        }
    }
}
