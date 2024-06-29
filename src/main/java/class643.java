import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class643 extends class472 {

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field9057;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 6)
    public final Object method2777(int arg0) {
        return arg0 == 14 ? this.field9057.get() : (Object) null;
    }

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "(B)Z", line = 16)
    public final boolean method2776(byte arg0) {
        if (arg0 != -76) {
            this.field9057 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ev", name = "<init>", descriptor = "(Lqt;Ljava/lang/Object;I)V", line = 25)
    public class643(class589 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field9057 = new SoftReference(arg1);
    }
}
