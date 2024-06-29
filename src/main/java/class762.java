import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class762 extends class325 {

    @OriginalMember(owner = "client!ww", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field10531;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method1934(int arg0) {
        return arg0 == 648 ? this.field10531.get() : (Object) null;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 15)
    public class762(Object arg0, int arg1) {
        super(arg1);
        this.field10531 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)Z", line = 24)
    public final boolean method1932(byte arg0) {
        return arg0 > 11;
    }
}
