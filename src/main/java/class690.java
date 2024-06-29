import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class690 extends class113 {

    @OriginalMember(owner = "client!ica", name = "x", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field9216;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 6)
    public final Object method834(int arg0) {
        if (arg0 != 6) {
            this.field9216 = null;
        }
        return this.field9216.get();
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 15)
    public class690(Object arg0, int arg1) {
        super(arg1);
        this.field9216 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "(I)Z", line = 24)
    public final boolean method837(int arg0) {
        return arg0 == 9614 ? true : true;
    }
}
