import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class249 extends class56 {

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4383;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)Z")
    public final boolean method398(byte arg0) {
        return arg0 == -79;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method392(int arg0) {
        if (arg0 != 4) {
            this.field4383 = (SoftReference) null;
        }
        return this.field4383.get();
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class249(Object arg0) {
        this.field4383 = new SoftReference(arg0);
    }
}
