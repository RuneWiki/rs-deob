import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class419 extends class509 {

    @OriginalMember(owner = "client!ew", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5900;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)Z")
    public final boolean method997(int arg0) {
        return arg0 == 2000 ? true : true;
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lfw;Ljava/lang/Object;I)V")
    public class419(class50 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5900 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method991(int arg0) {
        return arg0 <= 25 ? (Object) null : this.field5900.get();
    }
}
