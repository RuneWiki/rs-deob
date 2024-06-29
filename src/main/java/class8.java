import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 extends class169 {

    @OriginalMember(owner = "client!to", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field63;

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lada;Ljava/lang/Object;I)V", line = 4)
    public class8(class142 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field63 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!to", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 13)
    public final Object method43(int arg0) {
        if (arg0 != -401) {
            this.method44(-82);
        }
        return this.field63.get();
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)Z", line = 24)
    public final boolean method44(int arg0) {
        if (arg0 >= -16) {
            this.field63 = null;
        }
        return true;
    }
}
