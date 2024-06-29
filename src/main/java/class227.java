import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class227 extends class41 {

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2874;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Luk;Ljava/lang/Object;)V", line = 4)
    public class227(class309 arg0, Object arg1) {
        super(arg0);
        this.field2874 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)Z", line = 13)
    public final boolean method118(int arg0) {
        if (arg0 != 29257) {
            this.field2874 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method121(int arg0) {
        if (arg0 <= 92) {
            this.method121(37);
        }
        return this.field2874.get();
    }
}
