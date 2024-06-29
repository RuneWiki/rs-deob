import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class75 {

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public int field775;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class75() {
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lcl;)V")
    public class75(class75 arg0) {
        this.field775 = arg0.field775;
        this.field778 = arg0.field778;
        this.field777 = arg0.field777;
        this.field776 = arg0.field776;
    }
}
