import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class131 extends class254 {

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2316;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Z)Z")
    public final boolean method789(boolean arg0) {
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method790(int arg0) {
        if (arg0 != 383) {
            this.method789(true);
        }
        return this.field2316.get();
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class131(Object arg0) {
        this.field2316 = new SoftReference(arg0);
    }
}
