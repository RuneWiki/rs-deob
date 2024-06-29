import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class687 {

    @OriginalMember(owner = "client!aaa", name = "c", descriptor = "I")
    public int field9715;

    @OriginalMember(owner = "client!aaa", name = "b", descriptor = "I")
    public int field9714;

    @OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
    public int field9713;

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "()V")
    public class687() {
    }

    @OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Laaa;)V")
    public class687(class687 arg0) {
        this.field9715 = arg0.field9715;
        this.field9714 = arg0.field9714;
        this.field9713 = arg0.field9713;
    }
}
