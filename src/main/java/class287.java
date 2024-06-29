import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class287 extends class276 {

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4212;

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lur;Ljava/lang/Object;I)V")
    public class287(class95 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field4212 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)Z")
    public final boolean method1882(boolean arg0) {
        return arg0;
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1881(int arg0) {
        if (arg0 != 0) {
            this.method1881(109);
        }
        return this.field4212.get();
    }
}
