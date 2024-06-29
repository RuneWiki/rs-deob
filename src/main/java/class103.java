import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class103 extends class40 {

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1584;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)Z", line = 5)
    public final boolean method361(byte arg0) {
        if (arg0 != 35) {
            this.method361((byte) -54);
        }
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 15)
    public final Object method358(int arg0) {
        return arg0 == 0 ? this.field1584.get() : (Object) null;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class103(Object arg0) {
        this.field1584 = new SoftReference(arg0);
    }
}
