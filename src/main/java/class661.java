import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class661 extends class374 {

    @OriginalMember(owner = "client!jk", name = "F", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field9131;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(B)Ljava/lang/Object;", line = 6)
    public final Object method2321(byte arg0) {
        if (arg0 != 20) {
            this.field9131 = null;
        }
        return this.field9131.get();
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 15)
    public class661(Object arg0, int arg1) {
        super(arg1);
        this.field9131 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)Z", line = 24)
    public final boolean method2324(int arg0) {
        if (arg0 != 14391) {
            this.field9131 = null;
        }
        return true;
    }
}
