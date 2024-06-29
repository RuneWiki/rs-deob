import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class304 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Lse;")
    public class282 field4557;

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lse;)V", line = 5)
    public class304(class282 arg0) {
        this.field4557 = arg0;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public abstract void method625(int arg0);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
    public abstract void method627();

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()Z")
    public abstract boolean method628();

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public abstract void method624(boolean arg0);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lgd;)V")
    public abstract void method629(class344 arg0);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Z)V")
    public abstract void method630(boolean arg0);
}
