import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class756 extends class333 {

    @OriginalMember(owner = "client!aca", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field10446;

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lpha;Ljava/lang/Object;I)V", line = 4)
    public class756(class172 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field10446 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)Z", line = 13)
    public final boolean method2156(int arg0) {
        if (arg0 != 21635) {
            this.field10446 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method2157(int arg0) {
        return arg0 == 32768 ? this.field10446.get() : (Object) null;
    }
}
