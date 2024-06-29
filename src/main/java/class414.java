import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class414 extends class324 {

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5968;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1946(int arg0) {
        if (arg0 < 107) {
            this.method1946(63);
        }
        return this.field5968.get();
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lgl;Ljava/lang/Object;)V")
    public class414(class357 arg0, Object arg1) {
        super(arg0);
        this.field5968 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "(I)Z")
    public final boolean method1945(int arg0) {
        if (arg0 > -111) {
            this.method1945(64);
        }
        return true;
    }
}
