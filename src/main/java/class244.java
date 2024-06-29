import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class244 extends class321 {

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3648;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 5)
    public final Object method421(int arg0) {
        if (arg0 != -15306) {
            this.method425((byte) 69);
        }
        return this.field3648.get();
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)Z", line = 17)
    public final boolean method425(byte arg0) {
        int var2 = 60 / ((arg0 - 35) / 63);
        return true;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 23)
    public class244(Object arg0) {
        this.field3648 = new SoftReference(arg0);
    }
}
