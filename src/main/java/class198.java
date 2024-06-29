import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class198 extends class68 {

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3278;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(Z)Z")
    public final boolean method523(boolean arg0) {
        if (!arg0) {
            this.method525((byte) -48);
        }
        return true;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class198(Object arg0) {
        this.field3278 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method525(byte arg0) {
        return arg0 >= -32 ? (Object) null : this.field3278.get();
    }
}
