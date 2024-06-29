import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EOQVVIAH")
public class class15 extends class20 {

    @OriginalMember(owner = "client!EOQVVIAH", name = "k", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "client!EOQVVIAH", name = "l", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!EOQVVIAH", name = "a", descriptor = "(I)LIRLTEWJP;")
    public final class26 method168(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        class50 var2 = class50.method475(this.field665);
        return var2.method469(this.field664);
    }
}
