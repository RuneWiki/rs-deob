import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class158 extends class53 {

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2975;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method521(int arg0) {
        if (arg0 < 82) {
            this.method517(false);
        }
        return this.field2975.get();
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(Z)Z")
    public final boolean method517(boolean arg0) {
        if (!arg0) {
            this.method521(100);
        }
        return true;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class158(Object arg0) {
        this.field2975 = new SoftReference(arg0);
    }
}
