import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class350 extends class317 {

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field5133;

    @OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 4)
    public class350(Object arg0, int arg1) {
        super(arg1);
        this.field5133 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 14)
    public final Object method2078(int arg0) {
        if (arg0 != 1) {
            this.field5133 = null;
        }
        return this.field5133.get();
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Z", line = 24)
    public final boolean method2080(int arg0) {
        if (arg0 != 1) {
            this.field5133 = null;
        }
        return true;
    }
}
