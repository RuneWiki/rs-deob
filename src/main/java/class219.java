import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class219 extends class320 {

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3220;

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 4)
    public class219(Object arg0, int arg1) {
        super(arg1);
        this.field3220 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z", line = 13)
    public final boolean method1511(int arg0) {
        return arg0 == 32404 ? true : true;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 24)
    public final Object method1512(byte arg0) {
        int var2 = -42 / ((arg0 + 62) / 51);
        return this.field3220.get();
    }
}
