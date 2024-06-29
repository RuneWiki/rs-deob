import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class265 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public int field3630;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public int field3631;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public int field3632;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field3629;

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 6)
    public class265() {
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lrl;)V", line = 8)
    public class265(class265 arg0) {
        this.field3630 = arg0.field3630;
        this.field3631 = arg0.field3631;
        this.field3632 = arg0.field3632;
        this.field3629 = arg0.field3629;
    }
}
