import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class676 extends class646 {

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field9224;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)Z")
    public final boolean method2112(int arg0) {
        if (arg0 != 0) {
            this.field9224 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lsea;Ljava/lang/Object;I)V")
    public class676(class652 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field9224 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2115(byte arg0) {
        if (arg0 <= 103) {
            this.method2112(-111);
        }
        return this.field9224.get();
    }
}
