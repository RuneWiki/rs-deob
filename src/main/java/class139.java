import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class class139 {

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lcg;")
    public class393 field1876;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public abstract void method61(boolean arg0);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
    public abstract void method59(boolean arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lq;)V")
    public abstract void method56(class325 arg0);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "()V")
    public abstract void method58();

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lcg;)V")
    public class139(class393 arg0) {
        this.field1876 = arg0;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public abstract void method57(int arg0);

    @OriginalMember(owner = "client!se", name = "b", descriptor = "()Z")
    public abstract boolean method60();
}
