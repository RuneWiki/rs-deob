import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class662 extends class431 {

    @OriginalMember(owner = "client!ot", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field9423;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "(I)Z")
    public final boolean method40(int arg0) {
        if (arg0 <= 11) {
            this.field9423 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class662(Object arg0, int arg1) {
        super(arg1);
        this.field9423 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method38(int arg0) {
        return arg0 == 4 ? this.field9423.get() : (Object) null;
    }
}
