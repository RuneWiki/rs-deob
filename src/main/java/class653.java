import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class653 extends class175 {

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field8960;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)Z")
    public final boolean method1118(byte arg0) {
        if (arg0 <= 97) {
            this.method1116(99);
        }
        return true;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class653(Object arg0, int arg1) {
        super(arg1);
        this.field8960 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1116(int arg0) {
        return arg0 <= 43 ? (Object) null : this.field8960.get();
    }
}
