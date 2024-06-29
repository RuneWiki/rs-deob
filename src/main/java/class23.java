import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class23 extends class156 {

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field306;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method103(int arg0) {
        return arg0 >= -49 ? (Object) null : this.field306.get();
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)Z")
    public final boolean method104(int arg0) {
        int var2 = 30 % ((arg0 + 43) / 62);
        return true;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class23(Object arg0) {
        this.field306 = new SoftReference(arg0);
    }
}
