import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class108 extends class178 {

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1854;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method695(int arg0) {
        if (arg0 != 0) {
            this.field1854 = (SoftReference) null;
        }
        return this.field1854.get();
    }

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)Z", line = 16)
    public final boolean method696(int arg0) {
        if (arg0 != 0) {
            this.method695(127);
        }
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class108(Object arg0) {
        this.field1854 = new SoftReference(arg0);
    }
}
