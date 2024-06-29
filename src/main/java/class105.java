import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class105 extends class283 {

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1546;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method693(byte arg0) {
        if (arg0 != -109) {
            this.field1546 = (SoftReference) null;
        }
        return this.field1546.get();
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class105(Object arg0) {
        this.field1546 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Z")
    public final boolean method694(byte arg0) {
        if (arg0 >= -32) {
            this.field1546 = (SoftReference) null;
        }
        return true;
    }
}
