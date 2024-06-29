import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class456 {

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field6387 = -1;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lmq;")
    public static class78 field6386 = new class78(104, 10);

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Lrq;")
    public class451 field6384;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Lof;")
    public class456 field6389;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lkha;")
    public static class687 field6388;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "Lkha;")
    public static class687 field6390;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 3)
    public final void method2673(int arg0) {
        field6385++;
        if (arg0 < ~class213.field2711) {
            this.field6389 = class236.field3055;
            this.field6384 = null;
            class213.field2711++;
            class236.field3055 = this;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 28)
    public static void method2674(boolean arg0) {
        field6390 = null;
        field6388 = null;
        if (arg0) {
            field6387 = -80;
        }
        field6386 = null;
    }
}
