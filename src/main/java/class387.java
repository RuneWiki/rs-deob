import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class387 extends class417 {

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6190;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method3154(int arg0) {
        if (arg0 != -4850) {
            this.field6190 = null;
        }
        return this.field6190.get();
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 14)
    public class387(Object arg0, int arg1) {
        super(arg1);
        this.field6190 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Z", line = 24)
    public final boolean method3155(int arg0) {
        if (arg0 < 121) {
            this.field6190 = null;
        }
        return true;
    }
}
