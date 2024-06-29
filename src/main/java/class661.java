import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class661 extends class77 {

    @OriginalMember(owner = "client!qs", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field9206;

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class661(Object arg0, int arg1) {
        super(arg1);
        this.field9206 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "(I)Z")
    public final boolean method621(int arg0) {
        if (arg0 >= -116) {
            this.field9206 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "(I)Ljava/lang/Object;")
    public final Object method622(int arg0) {
        return arg0 == 24910 ? this.field9206.get() : (Object) null;
    }
}
