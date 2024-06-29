import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 extends class196 {

    @OriginalMember(owner = "client!db", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field230;

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class17(Object arg0) {
        this.field230 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method79(int arg0) {
        if (arg0 != -2) {
            this.field230 = (SoftReference) null;
        }
        return this.field230.get();
    }

    @OriginalMember(owner = "client!db", name = "d", descriptor = "(B)Z")
    public final boolean method80(byte arg0) {
        return arg0 == 47;
    }
}
