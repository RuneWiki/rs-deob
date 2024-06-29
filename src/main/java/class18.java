import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class18 extends class691 {

    @OriginalMember(owner = "client!saa", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field136;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "(I)Z", line = 6)
    public final boolean method76(int arg0) {
        return arg0 == 5890;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 16)
    public final Object method77(int arg0) {
        if (arg0 != 34168) {
            this.method76(21);
        }
        return this.field136.get();
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 25)
    public class18(Object arg0, int arg1) {
        super(arg1);
        this.field136 = new SoftReference(arg0);
    }
}
