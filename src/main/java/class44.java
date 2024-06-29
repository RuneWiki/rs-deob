import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class44 extends class403 {

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field832;

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 5)
    public class44(Object arg0, int arg1) {
        super(arg1);
        this.field832 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 14)
    public final Object method431(byte arg0) {
        if (arg0 != -34) {
            this.field832 = null;
        }
        return this.field832.get();
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)Z", line = 24)
    public final boolean method432(int arg0) {
        if (arg0 != 28015) {
            this.field832 = null;
        }
        return true;
    }
}
