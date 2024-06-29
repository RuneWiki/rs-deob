import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class49 extends class31 {

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field748;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Z")
    public final boolean method245(int arg0) {
        return arg0 >= -1 ? true : true;
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method246(byte arg0) {
        int var2 = -24 % ((arg0 + 35) / 38);
        return this.field748.get();
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class49(Object arg0) {
        this.field748 = new SoftReference(arg0);
    }
}
