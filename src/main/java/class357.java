import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class357 extends class448 {

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5151;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)Z")
    public final boolean method862(byte arg0) {
        if (arg0 != 110) {
            this.method863(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lwt;Ljava/lang/Object;I)V")
    public class357(class186 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5151 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method863(boolean arg0) {
        return arg0 ? (Object) null : this.field5151.get();
    }
}
