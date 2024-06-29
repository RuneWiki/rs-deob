import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class282 extends class2 {

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4453;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)Z")
    public final boolean method8(int arg0) {
        if (arg0 != 1) {
            this.field4453 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class282(Object arg0) {
        this.field4453 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method7(byte arg0) {
        if (arg0 != -118) {
            this.method7((byte) 118);
        }
        return this.field4453.get();
    }
}
