import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class303 extends class412 {

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4489;

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 5)
    public class303(Object arg0, int arg1) {
        super(arg1);
        this.field4489 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(B)Z", line = 15)
    public final boolean method338(byte arg0) {
        int var2 = 126 % ((arg0 + 36) / 45);
        return true;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 23)
    public final Object method342(int arg0) {
        if (arg0 > -59) {
            this.method342(126);
        }
        return this.field4489.get();
    }
}
