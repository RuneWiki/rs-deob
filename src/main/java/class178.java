import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class178 extends class475 {

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2832;

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 4)
    public class178(Object arg0, int arg1) {
        super(arg1);
        this.field2832 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 13)
    public final Object method373(boolean arg0) {
        if (!arg0) {
            this.method374(-8);
        }
        return this.field2832.get();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method374(int arg0) {
        if (arg0 != 0) {
            this.field2832 = null;
        }
        return true;
    }
}
