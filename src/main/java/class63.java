import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class63 extends class283 {

    @OriginalMember(owner = "client!fw", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field654;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method449(int arg0) {
        return arg0 == -8192;
    }

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 16)
    public final Object method450(int arg0) {
        return arg0 == 18 ? this.field654.get() : (Object) null;
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lpt;Ljava/lang/Object;I)V", line = 25)
    public class63(class556 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field654 = new SoftReference(arg1);
    }
}
