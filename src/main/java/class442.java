import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class442 extends class308 {

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5952;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)Z", line = 6)
    public final boolean method962(byte arg0) {
        return arg0 == -120 ? true : true;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 15)
    public class442(Object arg0, int arg1) {
        super(arg1);
        this.field5952 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 24)
    public final Object method961(byte arg0) {
        return arg0 <= 96 ? (Object) null : this.field5952.get();
    }
}
