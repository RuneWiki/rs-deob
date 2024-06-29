import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class165 extends class172 {

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2930;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1229(int arg0) {
        return arg0 < 48 ? (Object) null : this.field2930.get();
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)Z")
    public final boolean method1227(boolean arg0) {
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class165(Object arg0) {
        this.field2930 = new SoftReference(arg0);
    }
}
