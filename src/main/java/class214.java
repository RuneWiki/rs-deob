import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class214 extends class155 {

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3413;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1150(int arg0) {
        if (arg0 != 256) {
            this.field3413 = (SoftReference) null;
        }
        return this.field3413.get();
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)Z")
    public final boolean method1147(byte arg0) {
        return arg0 < 68 ? true : true;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class214(Object arg0) {
        this.field3413 = new SoftReference(arg0);
    }
}
