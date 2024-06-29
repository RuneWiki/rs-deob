import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class331 extends class53 {

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field4287;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "(B)Z", line = 6)
    public final boolean method267(byte arg0) {
        return arg0 > -116 ? true : true;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 16)
    public final Object method266(byte arg0) {
        if (arg0 != 13) {
            this.method266((byte) 67);
        }
        return this.field4287.get();
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 25)
    public class331(Object arg0, int arg1) {
        super(arg1);
        this.field4287 = new SoftReference(arg0);
    }
}
