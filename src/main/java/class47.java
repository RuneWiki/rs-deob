import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class47 extends class174 {

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field740;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)Z", line = 6)
    public final boolean method463(int arg0) {
        if (arg0 != 1) {
            this.method464((byte) 41);
        }
        return true;
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 16)
    public final Object method464(byte arg0) {
        return arg0 == -55 ? this.field740.get() : (Object) null;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class47(Object arg0) {
        this.field740 = new SoftReference(arg0);
    }
}
