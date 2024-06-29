import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class246 extends class23 {

    @OriginalMember(owner = "client!rp", name = "K", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3382;

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(B)Z", line = 5)
    public final boolean method287(byte arg0) {
        return arg0 >= -69 ? true : true;
    }

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 15)
    public final Object method289(int arg0) {
        if (arg0 != -14795) {
            this.field3382 = (SoftReference) null;
        }
        return this.field3382.get();
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lpc;Ljava/lang/Object;)V", line = 25)
    public class246(class34 arg0, Object arg1) {
        super(arg0);
        this.field3382 = new SoftReference(arg1);
    }
}
