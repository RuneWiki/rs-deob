import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class290 extends class205 {

    @OriginalMember(owner = "client!li", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4582;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1416(byte arg0) {
        int var2 = 126 % ((arg0 + 44) / 50);
        return this.field4582.get();
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(Z)Z")
    public final boolean method1415(boolean arg0) {
        if (!arg0) {
            this.field4582 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class290(Object arg0) {
        this.field4582 = new SoftReference(arg0);
    }
}
