import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class440 extends class189 {

    @OriginalMember(owner = "client!kn", name = "A", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6377;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1242(int arg0) {
        int var2 = -83 / ((arg0 + 65) / 36);
        return this.field6377.get();
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)Z")
    public final boolean method1239(int arg0) {
        if (arg0 != -1) {
            this.method1242(64);
        }
        return true;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class440(Object arg0) {
        this.field6377 = new SoftReference(arg0);
    }
}
