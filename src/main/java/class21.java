import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class21 {

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
    public class21() {
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Lcw;)V")
    public class21(class21 arg0) {
        this.field203 = arg0.field203;
        this.field204 = arg0.field204;
        this.field202 = arg0.field202;
    }
}
