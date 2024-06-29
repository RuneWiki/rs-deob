import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class308 extends class122 {

    @OriginalMember(owner = "client!bj", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4822;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)Z")
    public final boolean method769(int arg0) {
        return arg0 <= 75 ? true : true;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method768(byte arg0) {
        if (arg0 > -56) {
            this.field4822 = null;
        }
        return this.field4822.get();
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class308(Object arg0, int arg1) {
        super(arg1);
        this.field4822 = new SoftReference(arg0);
    }
}
