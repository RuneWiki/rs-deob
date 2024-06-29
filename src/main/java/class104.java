import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class104 extends class39 {

    @OriginalMember(owner = "client!ho", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1487;

    @OriginalMember(owner = "client!ho", name = "j", descriptor = "(I)Z", line = 6)
    public final boolean method377(int arg0) {
        return arg0 == 100 ? true : true;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 16)
    public final Object method374(int arg0) {
        return arg0 >= -41 ? (Object) null : this.field1487.get();
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 25)
    public class104(Object arg0, int arg1) {
        super(arg1);
        this.field1487 = new SoftReference(arg0);
    }
}
