import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class141 extends class86 {

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2303;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(Z)Z")
    public final boolean method612(boolean arg0) {
        if (!arg0) {
            this.field2303 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public final Object method613(int arg0) {
        int var2 = 13 % ((arg0 - 7) / 37);
        return this.field2303.get();
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class141(Object arg0) {
        this.field2303 = new SoftReference(arg0);
    }
}
