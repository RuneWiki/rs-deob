import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class class30 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lnm;")
    public class254 field405;

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lnm;)V", line = 9)
    public class30(class254 arg0) {
        this.field405 = arg0;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()V")
    public abstract void method261();

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()Z")
    public abstract boolean method262();

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V")
    public abstract void method263(boolean arg0);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public abstract void method264(int arg0);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V")
    public abstract void method265(boolean arg0);

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lap;)V")
    public abstract void method266(class26 arg0);
}
