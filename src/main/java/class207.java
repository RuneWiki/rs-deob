import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class207 extends class137 {

    @OriginalMember(owner = "client!og", name = "R", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3604;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method604(int arg0) {
        if (arg0 < 11) {
            this.field3604 = (SoftReference) null;
        }
        return this.field3604.get();
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Z", line = 15)
    public final boolean method605(int arg0) {
        return arg0 == 0;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class207(Object arg0) {
        this.field3604 = new SoftReference(arg0);
    }
}
