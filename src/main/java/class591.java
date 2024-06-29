import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class591 extends class95 {

    @OriginalMember(owner = "client!tda", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field8289;

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 5)
    public class591(Object arg0, int arg1) {
        super(arg1);
        this.field8289 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "(B)Z", line = 14)
    public final boolean method696(byte arg0) {
        return arg0 < 72 ? true : true;
    }

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 25)
    public final Object method692(int arg0) {
        int var2 = -12 % ((arg0 + 10) / 33);
        return this.field8289.get();
    }
}
