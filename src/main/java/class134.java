import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class134 extends class102 {

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2002;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(B)Ljava/lang/Object;", line = 6)
    public final Object method649(byte arg0) {
        if (arg0 != 104) {
            this.method649((byte) -42);
        }
        return this.field2002.get();
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)Z", line = 16)
    public final boolean method646(byte arg0) {
        return arg0 > -106 ? true : true;
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class134(Object arg0) {
        this.field2002 = new SoftReference(arg0);
    }
}
