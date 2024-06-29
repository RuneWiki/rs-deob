import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class60 extends class157 {

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field966;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method447(int arg0) {
        if (arg0 != 1) {
            this.field966 = (SoftReference) null;
        }
        return this.field966.get();
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 14)
    public class60(Object arg0) {
        this.field966 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)Z", line = 23)
    public final boolean method448(byte arg0) {
        if (arg0 != 104) {
            this.field966 = (SoftReference) null;
        }
        return true;
    }
}
