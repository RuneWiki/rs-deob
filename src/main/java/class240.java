import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class240 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public int field3453;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public int field3455;

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class240() {
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ltg;)V")
    public class240(class240 arg0) {
        this.field3454 = arg0.field3454;
        this.field3453 = arg0.field3453;
        this.field3455 = arg0.field3455;
    }
}
