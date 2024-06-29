import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class333 extends class498 {

    @OriginalMember(owner = "client!b", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4307;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Z", line = 5)
    public final boolean method1989(int arg0) {
        return arg0 == 393216;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)Ljava/lang/Object;", line = 16)
    public final Object method1990(byte arg0) {
        if (arg0 != -102) {
            this.field4307 = null;
        }
        return this.field4307.get();
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 25)
    public class333(Object arg0, int arg1) {
        super(arg1);
        this.field4307 = new SoftReference(arg0);
    }
}
