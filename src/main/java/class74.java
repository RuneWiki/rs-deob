import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class74 extends class401 {

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field948;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)Z")
    public final boolean method645(byte arg0) {
        return arg0 == 6 ? true : true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method646(int arg0) {
        return arg0 == -17718 ? this.field948.get() : (Object) null;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class74(Object arg0, int arg1) {
        super(arg1);
        this.field948 = new SoftReference(arg0);
    }
}
