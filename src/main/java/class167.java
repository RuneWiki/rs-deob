import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class167 extends class477 {

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1873;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)Z", line = 5)
    public final boolean method808(int arg0) {
        return arg0 == 20712;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lso;Ljava/lang/Object;I)V", line = 15)
    public class167(class276 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1873 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method807(int arg0) {
        if (arg0 != 44) {
            this.field1873 = null;
        }
        return this.field1873.get();
    }
}
