import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class68 extends class74 {

    @OriginalMember(owner = "client!td", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1106;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method476(boolean arg0) {
        if (!arg0) {
            this.field1106 = (SoftReference) null;
        }
        return this.field1106.get();
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class68(Object arg0) {
        this.field1106 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)Z")
    public final boolean method477(boolean arg0) {
        if (arg0) {
            this.method477(false);
        }
        return true;
    }
}
