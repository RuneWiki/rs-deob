import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class class331 {

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Lmi;")
    public class315 field4787;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lbl;)V")
    public abstract void method817(class425 arg0);

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lmi;)V")
    public class331(class315 arg0) {
        this.field4787 = arg0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "()Z")
    public abstract boolean method812();

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public abstract void method815(int arg0);

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
    public abstract void method811(boolean arg0);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "()V")
    public abstract void method816();

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Z)V")
    public abstract void method813(boolean arg0);
}
