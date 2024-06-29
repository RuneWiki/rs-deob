import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class151 extends class434 {

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2495;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1252(int arg0) {
        if (arg0 != 30659) {
            this.field2495 = null;
        }
        return this.field2495.get();
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class151(Object arg0, int arg1) {
        super(arg1);
        this.field2495 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)Z")
    public final boolean method1253(int arg0) {
        int var2 = -29 / ((arg0 + 20) / 51);
        return true;
    }
}
