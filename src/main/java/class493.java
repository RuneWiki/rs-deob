import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class493 extends class409 {

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6935;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)Z", line = 5)
    public final boolean method2495(byte arg0) {
        if (arg0 != 65) {
            this.method2495((byte) -5);
        }
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 15)
    public class493(Object arg0, int arg1) {
        super(arg1);
        this.field6935 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method2496(int arg0) {
        if (arg0 != 4) {
            this.field6935 = null;
        }
        return this.field6935.get();
    }
}
