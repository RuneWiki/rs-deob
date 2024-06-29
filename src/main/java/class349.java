import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class349 extends class441 {

    @OriginalMember(owner = "client!og", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5468;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)Z", line = 6)
    public final boolean method1959(int arg0) {
        return arg0 == 6 ? true : true;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 16)
    public final Object method1960(int arg0) {
        if (arg0 != 50) {
            this.field5468 = null;
        }
        return this.field5468.get();
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 25)
    public class349(Object arg0, int arg1) {
        super(arg1);
        this.field5468 = new SoftReference(arg0);
    }
}
