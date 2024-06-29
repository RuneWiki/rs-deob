import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public abstract class class48 {

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "Lsq;")
    public class96 field591;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Z)V")
    public abstract void method303(boolean arg0);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "()Z")
    public abstract boolean method304();

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "()V")
    public abstract void method305();

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public abstract void method306(int arg0);

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(Z)V")
    public abstract void method307(boolean arg0);

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(Lod;)V")
    public abstract void method308(class293 arg0);

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(Lsq;)V")
    public class48(class96 arg0) {
        this.field591 = arg0;
    }
}
