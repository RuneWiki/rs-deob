import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class44 {

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Lao;")
    public class157 field540;

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lao;)V", line = 4)
    public class44(class157 arg0) {
        this.field540 = arg0;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
    public abstract void method227(boolean arg0);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Llp;)V")
    public abstract void method231(class220 arg0);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "()V")
    public abstract void method229();

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public abstract void method228(int arg0);

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "()Z")
    public abstract boolean method232();

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)V")
    public abstract void method230(boolean arg0);
}
