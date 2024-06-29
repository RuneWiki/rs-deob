import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public abstract class class300 {

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "Lge;")
    public class104 field4409;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "()Z")
    public abstract boolean method4();

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lmo;)V")
    public abstract void method9(class195 arg0);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public abstract void method6(boolean arg0);

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "()V")
    public abstract void method5();

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lge;)V")
    public class300(class104 arg0) {
        this.field4409 = arg0;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(Z)V")
    public abstract void method7(boolean arg0);

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public abstract void method8(int arg0);
}
