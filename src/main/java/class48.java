import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class48 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Lql;")
    public class346 field480;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public abstract void method72();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method70(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method73(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lna;)V")
    public abstract void method71(class50 arg0);

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lql;)V")
    public class48(class346 arg0) {
        this.field480 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method69(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method74();
}
