import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class46 extends class101 {

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field648;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method246(int arg0) {
        if (arg0 > -16) {
            this.field648 = null;
        }
        return this.field648.get();
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)Z")
    public final boolean method247(int arg0) {
        if (arg0 != 1) {
            this.field648 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class46(Object arg0, int arg1) {
        super(arg1);
        this.field648 = new SoftReference(arg0);
    }
}
