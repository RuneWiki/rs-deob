import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class283 extends class448 {

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3857;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method350(int arg0) {
        if (arg0 != 29265) {
            this.method350(111);
        }
        return this.field3857.get();
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lm;Ljava/lang/Object;)V")
    public class283(class181 arg0, Object arg1) {
        super(arg0);
        this.field3857 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)Z")
    public final boolean method352(byte arg0) {
        if (arg0 != 90) {
            this.field3857 = (SoftReference) null;
        }
        return true;
    }
}
