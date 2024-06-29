import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class67 extends class9 {

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1046;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 6)
    public final Object method52(int arg0) {
        if (arg0 != 5736) {
            this.field1046 = (SoftReference) null;
        }
        return this.field1046.get();
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)Z", line = 16)
    public final boolean method50(int arg0) {
        return arg0 == -61 ? true : true;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class67(Object arg0) {
        this.field1046 = new SoftReference(arg0);
    }
}
