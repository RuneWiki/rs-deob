import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class309 extends class166 {

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4545;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)Z", line = 5)
    public final boolean method1240(int arg0) {
        return arg0 == -1249071392;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 14)
    public class309(Object arg0) {
        this.field4545 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 23)
    public final Object method1239(boolean arg0) {
        if (arg0) {
            this.method1239(false);
        }
        return this.field4545.get();
    }
}
