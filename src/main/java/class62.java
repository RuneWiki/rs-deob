import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class62 extends class96 {

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field736;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method382(int arg0) {
        if (arg0 != -14117) {
            this.field736 = (SoftReference) null;
        }
        return this.field736.get();
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class62(Object arg0) {
        this.field736 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)Z")
    public final boolean method383(int arg0) {
        if (arg0 != 0) {
            this.field736 = (SoftReference) null;
        }
        return true;
    }
}
