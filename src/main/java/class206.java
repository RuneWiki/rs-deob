import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class206 extends class119 {

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3322;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)Z", line = 6)
    public final boolean method858(byte arg0) {
        if (arg0 != -18) {
            this.field3322 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 17)
    public final Object method863(byte arg0) {
        int var2 = 125 % ((arg0 + 39) / 41);
        return this.field3322.get();
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lvh;Ljava/lang/Object;)V", line = 24)
    public class206(class200 arg0, Object arg1) {
        super(arg0);
        this.field3322 = new SoftReference(arg1);
    }
}
