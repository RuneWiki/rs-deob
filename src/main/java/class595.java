import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class595 extends class704 {

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field8076;

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method2597(int arg0) {
        return arg0 == 0 ? this.field8076.get() : (Object) null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)Z", line = 15)
    public final boolean method2598(boolean arg0) {
        if (!arg0) {
            this.field8076 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lcr;Ljava/lang/Object;I)V", line = 25)
    public class595(class294 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8076 = new SoftReference(arg1);
    }
}
