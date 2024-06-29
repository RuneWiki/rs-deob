import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class172 extends class95 {

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2208;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 5)
    public final Object method531(byte arg0) {
        if (arg0 != 26) {
            this.method532(127);
        }
        return this.field2208.get();
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lfr;Ljava/lang/Object;I)V", line = 14)
    public class172(class284 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2208 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)Z", line = 23)
    public final boolean method532(int arg0) {
        if (arg0 != 0) {
            this.field2208 = null;
        }
        return true;
    }
}
