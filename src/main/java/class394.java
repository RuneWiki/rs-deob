import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class394 extends class112 {

    @OriginalMember(owner = "client!mea", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5463;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "(I)Z")
    public final boolean method340(int arg0) {
        if (arg0 != -32365) {
            this.method339((byte) 77);
        }
        return true;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lqj;Ljava/lang/Object;I)V")
    public class394(class572 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field5463 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method339(byte arg0) {
        if (arg0 != -94) {
            this.method340(59);
        }
        return this.field5463.get();
    }
}
