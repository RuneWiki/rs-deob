import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class479 extends class365 {

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field6793;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "(I)Z", line = 5)
    public final boolean method39(int arg0) {
        if (arg0 != 30712) {
            this.field6793 = (SoftReference) null;
        }
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 14)
    public class479(Object arg0, int arg1) {
        super(arg1);
        this.field6793 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method42(int arg0) {
        if (arg0 != 5) {
            this.method42(-51);
        }
        return this.field6793.get();
    }
}
