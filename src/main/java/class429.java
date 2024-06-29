import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class429 extends class438 {

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6380;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "(I)Z")
    public final boolean method2368(int arg0) {
        return arg0 <= 120 ? true : true;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lrb;Ljava/lang/Object;I)V")
    public class429(class284 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6380 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2365(int arg0) {
        if (arg0 != 0) {
            this.method2365(-26);
        }
        return this.field6380.get();
    }
}
