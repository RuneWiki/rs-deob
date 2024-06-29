import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class class309 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "Lic;")
    public class246 field4530;

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lic;)V", line = 7)
    public class309(class246 arg0) {
        this.field4530 = arg0;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Lvd;)V")
    public abstract void method51(class5 arg0);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public abstract void method53(int arg0);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(Z)V")
    public abstract void method55(boolean arg0);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "()Z")
    public abstract boolean method56();

    @OriginalMember(owner = "client!io", name = "b", descriptor = "()V")
    public abstract void method54();

    @OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
    public abstract void method57(boolean arg0);
}
