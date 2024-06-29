import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public abstract class class436 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Lnf;")
    public class256 field6402;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lme;)V")
    public abstract void method160(class360 arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V")
    public abstract void method158(boolean arg0);

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(Z)V")
    public abstract void method161(boolean arg0);

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()Z")
    public abstract boolean method159();

    @OriginalMember(owner = "client!km", name = "b", descriptor = "()V")
    public abstract void method157();

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lnf;)V")
    public class436(class256 arg0) {
        this.field6402 = arg0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public abstract void method162(int arg0);
}
