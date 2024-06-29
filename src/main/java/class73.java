import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class73 extends class113 {

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1210;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method690(int arg0) {
        return arg0 < 66 ? (Object) null : this.field1210.get();
    }

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)Z", line = 15)
    public final boolean method691(int arg0) {
        if (arg0 != -9) {
            this.method690(39);
        }
        return true;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class73(Object arg0) {
        this.field1210 = new SoftReference(arg0);
    }
}
