import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class89 extends class42 {

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1448;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method356(int arg0) {
        if (arg0 != 0) {
            this.method360(-55);
        }
        return this.field1448.get();
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)Z")
    public final boolean method360(int arg0) {
        if (arg0 != 0) {
            this.field1448 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class89(Object arg0) {
        this.field1448 = new SoftReference(arg0);
    }
}
