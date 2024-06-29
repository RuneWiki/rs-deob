import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class52 extends class76 {

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1079;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)Z")
    public final boolean method391(boolean arg0) {
        if (!arg0) {
            this.method391(false);
        }
        return true;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method392(int arg0) {
        if (arg0 != 0) {
            this.field1079 = (SoftReference) null;
        }
        return this.field1079.get();
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class52(Object arg0) {
        this.field1079 = new SoftReference(arg0);
    }
}
