import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class201 extends class123 {

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3048;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)Z")
    public final boolean method644(byte arg0) {
        if (arg0 != -19) {
            this.method645(-124);
        }
        return true;
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method645(int arg0) {
        if (arg0 != 0) {
            this.field3048 = (SoftReference) null;
        }
        return this.field3048.get();
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class201(Object arg0) {
        this.field3048 = new SoftReference(arg0);
    }
}
