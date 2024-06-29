import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class609 {

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "J")
    public static long field8565 = 0L;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "Lqp;")
    public class609 field8562;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "Lqp;")
    public class609 field8563;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)V", line = 7)
    public final void method3414(int arg0) {
        field8564++;
        if (this.field8563 != null && arg0 == 0) {
            this.field8563.field8562 = this.field8562;
            this.field8562.field8563 = this.field8563;
            this.field8563 = null;
            this.field8562 = null;
        }
    }
}
