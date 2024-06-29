import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class553 {

    @OriginalMember(owner = "client!il", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field185;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method117(int arg0) {
        if (arg0 != 6390) {
            this.method118(35);
        }
        return this.field185.get();
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lhg;Ljava/lang/Object;I)V", line = 14)
    public class7(class648 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field185 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Z", line = 23)
    public final boolean method118(int arg0) {
        return arg0 == 2396;
    }
}
