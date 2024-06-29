import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class626 {

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field8992 = 100;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "[I")
    public static int[] field8993 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public static int field8995;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "J")
    public long field8991;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "Ltq;")
    public class626 field8989;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "Ltq;")
    public class626 field8990;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "(I)V", line = 9)
    public final void method3617(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field8995++;
        if (this.field8989 != null) {
            this.field8989.field8990 = this.field8990;
            this.field8990.field8989 = this.field8989;
            this.field8990 = null;
            this.field8989 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "(I)Z", line = 31)
    public final boolean method3618(int arg0) {
        if (arg0 >= -104) {
            field8993 = null;
        }
        field8994++;
        return this.field8989 != null;
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)V", line = 50)
    public static void method3619(int arg0) {
        field8993 = null;
        if (arg0 > -46) {
            method3619(121);
        }
    }
}
