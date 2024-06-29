import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class540 {

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "Lhj;")
    public static class596 field7594 = new class596(35, 0);

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
    public int field7593;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public int field7596;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
    public int field7597;

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
    public int field7599;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
    public static void method3200(int arg0) {
        if (arg0 > 84) {
            field7594 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(I)I")
    public static final int method3201(int arg0) {
        if (arg0 < 14) {
            field7594 = null;
        }
        field7595++;
        return class446.field6009;
    }
}
