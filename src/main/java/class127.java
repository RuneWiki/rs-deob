import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class127 extends class61 {

    @OriginalMember(owner = "client!eq", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1659;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(B)Ljava/lang/Object;")
    public final Object method381(byte arg0) {
        return arg0 > -4 ? (Object) null : this.field1659.get();
    }

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(B)Z")
    public final boolean method380(byte arg0) {
        int var2 = 73 / ((-arg0 - 26) / 63);
        return true;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class127(Object arg0, int arg1) {
        super(arg1);
        this.field1659 = new SoftReference(arg0);
    }
}
