import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class333 extends class152 {

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4916;

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 4)
    public class333(Object arg0, int arg1) {
        super(arg1);
        this.field4916 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)Z", line = 14)
    public final boolean method887(byte arg0) {
        int var2 = -120 / ((arg0 - 75) / 51);
        return true;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 22)
    public final Object method892(boolean arg0) {
        return arg0 ? (Object) null : this.field4916.get();
    }
}
