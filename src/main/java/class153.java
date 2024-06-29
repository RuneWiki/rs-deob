import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class153 extends class133 {

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2433;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)Z", line = 5)
    public final boolean method848(int arg0) {
        if (arg0 != 13063) {
            this.field2433 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 15)
    public final Object method853(int arg0) {
        if (arg0 < 2) {
            this.field2433 = (SoftReference) null;
        }
        return this.field2433.get();
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class153(Object arg0) {
        this.field2433 = new SoftReference(arg0);
    }
}
