import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class257 extends class436 {

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3760;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)Z")
    public final boolean method1621(int arg0) {
        return arg0 > 118;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Lbp;Ljava/lang/Object;)V")
    public class257(class46 arg0, Object arg1) {
        super(arg0);
        this.field3760 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1622(byte arg0) {
        if (arg0 > -111) {
            this.field3760 = (SoftReference) null;
        }
        return this.field3760.get();
    }
}
