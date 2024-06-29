import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class399 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lpo;")
    public class332 field5798;

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lpo;)V", line = 5)
    public class399(class332 arg0) {
        this.field5798 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public abstract void method379();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lfl;)V")
    public abstract void method376(class439 arg0);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()Z")
    public abstract boolean method375();

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public abstract void method377(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    public abstract void method378(boolean arg0);

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(Z)V")
    public abstract void method374(boolean arg0);
}
