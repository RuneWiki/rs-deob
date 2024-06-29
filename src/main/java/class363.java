import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class363 extends class46 {

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5112;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)Z", line = 5)
    public final boolean method214(int arg0) {
        if (arg0 > -72) {
            this.field5112 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lwa;Ljava/lang/Object;)V", line = 15)
    public class363(class407 arg0, Object arg1) {
        super(arg0);
        this.field5112 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)Ljava/lang/Object;", line = 24)
    public final Object method215(byte arg0) {
        if (arg0 != -123) {
            this.field5112 = (SoftReference) null;
        }
        return this.field5112.get();
    }
}
