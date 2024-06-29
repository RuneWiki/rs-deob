import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class111 extends class125 {

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1833;

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class111(Object arg0) {
        this.field1833 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "(I)Z")
    public final boolean method776(int arg0) {
        if (arg0 >= -95) {
            this.method776(10);
        }
        return true;
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method777(int arg0) {
        if (arg0 != 4) {
            this.method776(-103);
        }
        return this.field1833.get();
    }
}
