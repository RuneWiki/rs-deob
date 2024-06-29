import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public abstract class class189 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Lbf;")
    public class344 field2580;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lkq;)V")
    public abstract void method492(class386 arg0);

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lbf;)V")
    public class189(class344 arg0) {
        this.field2580 = arg0;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()Z")
    public abstract boolean method487();

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public abstract void method490(int arg0);

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V")
    public abstract void method488(boolean arg0);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V")
    public abstract void method486(boolean arg0);

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()V")
    public abstract void method491();
}
