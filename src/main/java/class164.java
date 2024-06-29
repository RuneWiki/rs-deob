import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class164 extends class163 {

    @OriginalMember(owner = "client!sr", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2466;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method800(byte arg0) {
        if (arg0 != 36) {
            this.field2466 = null;
        }
        return this.field2466.get();
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Lqo;Ljava/lang/Object;I)V")
    public class164(class19 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2466 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)Z")
    public final boolean method801(int arg0) {
        if (arg0 != -3201) {
            this.field2466 = null;
        }
        return true;
    }
}
