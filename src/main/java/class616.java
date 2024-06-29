import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class616 extends class674 {

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field8324;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lpj;Ljava/lang/Object;I)V")
    public class616(class157 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8324 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
    public final boolean method834(int arg0) {
        if (arg0 <= 101) {
            this.method835(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method835(boolean arg0) {
        return arg0 ? this.field8324.get() : (Object) null;
    }
}
