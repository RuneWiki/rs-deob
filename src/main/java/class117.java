import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class117 extends class274 {

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1982;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)Z")
    public final boolean method136(byte arg0) {
        return arg0 < 83 ? true : true;
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method138(byte arg0) {
        if (arg0 >= -29) {
            this.method136((byte) 86);
        }
        return this.field1982.get();
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class117(Object arg0) {
        this.field1982 = new SoftReference(arg0);
    }
}
