import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class208 extends class90 {

    @OriginalMember(owner = "client!en", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2987;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(B)Z", line = 6)
    public final boolean method733(byte arg0) {
        int var2 = -78 / ((arg0 - 55) / 46);
        return true;
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 14)
    public final Object method731(int arg0) {
        return arg0 == 174 ? this.field2987.get() : (Object) null;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 24)
    public class208(Object arg0, int arg1) {
        super(arg1);
        this.field2987 = new SoftReference(arg0);
    }
}
