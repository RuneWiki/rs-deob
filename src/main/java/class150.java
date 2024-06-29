import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class150 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lqi;")
    public class458 field2107;

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lqi;)V", line = 9)
    public class150(class458 arg0) {
        this.field2107 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public abstract void method3(boolean arg0);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()Z")
    public abstract boolean method7();

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "()V")
    public abstract void method2();

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Let;)V")
    public abstract void method6(class179 arg0);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public abstract void method1(int arg0);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
    public abstract void method5(boolean arg0);
}
