import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class203 extends class95 {

    @OriginalMember(owner = "client!le", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3265;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method854(int arg0) {
        if (arg0 != 0) {
            this.method855(-33);
        }
        return this.field3265.get();
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)Z", line = 15)
    public final boolean method855(int arg0) {
        return arg0 == 8639 ? true : true;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lws;Ljava/lang/Object;I)V", line = 25)
    public class203(class241 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field3265 = new SoftReference(arg1);
    }
}
