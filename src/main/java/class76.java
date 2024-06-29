import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class76 extends class307 {

    @OriginalMember(owner = "client!lea", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field954;

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class76(Object arg0, int arg1) {
        super(arg1);
        this.field954 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method434(int arg0) {
        return arg0 > -26 ? (Object) null : this.field954.get();
    }

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "(I)Z")
    public final boolean method435(int arg0) {
        return arg0 == -23828;
    }
}
