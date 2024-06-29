import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class215 extends class240 {

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2994;

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lt;Ljava/lang/Object;)V")
    public class215(class400 arg0, Object arg1) {
        super(arg0);
        this.field2994 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)Z")
    public final boolean method393(boolean arg0) {
        if (arg0) {
            this.field2994 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method395(boolean arg0) {
        if (!arg0) {
            this.field2994 = (SoftReference) null;
        }
        return this.field2994.get();
    }
}
