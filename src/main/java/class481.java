import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class481 extends class113 {

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6858;

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Lqq;Ljava/lang/Object;I)V", line = 5)
    public class481(class75 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6858 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 15)
    public final Object method764(int arg0) {
        int var2 = 89 % ((arg0 - 52) / 63);
        return this.field6858.get();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)Z", line = 23)
    public final boolean method767(boolean arg0) {
        return arg0 ? true : true;
    }
}
