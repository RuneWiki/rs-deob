import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class439 extends class336 {

    @OriginalMember(owner = "client!le", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5827;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1006(int arg0) {
        if (arg0 != 14) {
            this.method1009(true);
        }
        return this.field5827.get();
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ldc;Ljava/lang/Object;I)V")
    public class439(class23 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5827 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Z")
    public final boolean method1009(boolean arg0) {
        return !arg0;
    }
}
