import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class119 extends class216 {

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1679;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Z")
    public final boolean method854(byte arg0) {
        if (arg0 != 125) {
            this.method854((byte) -94);
        }
        return true;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method855(int arg0) {
        if (arg0 >= -46) {
            this.method854((byte) -109);
        }
        return this.field1679.get();
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class119(Object arg0, int arg1) {
        super(arg1);
        this.field1679 = new SoftReference(arg0);
    }
}
