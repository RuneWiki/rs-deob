import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class264 extends class191 {

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4608;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method138(int arg0) {
        if (arg0 != 50) {
            this.field4608 = (SoftReference) null;
        }
        return this.field4608.get();
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class264(Object arg0) {
        this.field4608 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)Z")
    public final boolean method136(byte arg0) {
        if (arg0 > -109) {
            this.field4608 = (SoftReference) null;
        }
        return true;
    }
}
