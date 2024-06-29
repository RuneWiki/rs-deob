import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class325 extends class3 {

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5670;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)Ljava/lang/Object;", line = 5)
    public final Object method21(byte arg0) {
        if (arg0 != 37) {
            this.field5670 = (SoftReference) null;
        }
        return this.field5670.get();
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)Z", line = 16)
    public final boolean method22(int arg0) {
        return arg0 == 0 ? true : true;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class325(Object arg0) {
        this.field5670 = new SoftReference(arg0);
    }
}
