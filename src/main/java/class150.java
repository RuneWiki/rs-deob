import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class150 extends class774 {

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1976;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method857(int arg0) {
        if (arg0 != -5446) {
            this.method855(17);
        }
        return this.field1976.get();
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class150(Object arg0, int arg1) {
        super(arg1);
        this.field1976 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)Z")
    public final boolean method855(int arg0) {
        if (arg0 != -16309) {
            this.field1976 = null;
        }
        return true;
    }
}
