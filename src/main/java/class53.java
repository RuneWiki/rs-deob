import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class53 {

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public int field633;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
    public int field635;

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "()V")
    public class53() {
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lgp;)V")
    public class53(class53 arg0) {
        this.field634 = arg0.field634;
        this.field633 = arg0.field633;
        this.field635 = arg0.field635;
    }
}
