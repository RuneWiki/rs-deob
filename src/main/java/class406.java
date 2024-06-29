import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class406 extends class99 {

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5353;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 5)
    public final Object method561(boolean arg0) {
        if (arg0) {
            this.method561(true);
        }
        return this.field5353.get();
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Z", line = 16)
    public final boolean method560(int arg0) {
        return arg0 < -112;
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 25)
    public class406(Object arg0, int arg1) {
        super(arg1);
        this.field5353 = new SoftReference(arg0);
    }
}
