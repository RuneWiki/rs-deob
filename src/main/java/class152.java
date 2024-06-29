import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class152 extends class158 {

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2786;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "(B)Z")
    public final boolean method349(byte arg0) {
        if (arg0 != -122) {
            this.method351(false);
        }
        return true;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method351(boolean arg0) {
        if (arg0) {
            this.method349((byte) 29);
        }
        return this.field2786.get();
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class152(Object arg0) {
        this.field2786 = new SoftReference(arg0);
    }
}
