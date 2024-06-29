import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class500 extends class16 {

    @OriginalMember(owner = "client!le", name = "w", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field7061;

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 5)
    public class500(Object arg0, int arg1) {
        super(arg1);
        this.field7061 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)Z", line = 15)
    public final boolean method203(int arg0) {
        int var2 = 56 % ((arg0 - 51) / 62);
        return true;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method202(int arg0) {
        int var2 = 38 / ((-arg0 - 7) / 41);
        return this.field7061.get();
    }
}
