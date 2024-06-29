import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class585 extends class216 {

    @OriginalMember(owner = "client!saa", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field8561;

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ler;Ljava/lang/Object;I)V")
    public class585(class209 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8561 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Z")
    public final boolean method61(int arg0) {
        if (arg0 < 120) {
            this.field8561 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method59(int arg0) {
        if (arg0 != -26235) {
            this.field8561 = null;
        }
        return this.field8561.get();
    }
}
