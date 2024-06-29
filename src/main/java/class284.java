import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class class284 {

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Lhj;")
    public class338 field3917;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public abstract void method697(int arg0);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
    public abstract void method696(boolean arg0);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(Z)V")
    public abstract void method695(boolean arg0);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "()V")
    public abstract void method699();

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lhj;)V")
    public class284(class338 arg0) {
        this.field3917 = arg0;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lnj;)V")
    public abstract void method693(class133 arg0);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "()Z")
    public abstract boolean method694();
}
