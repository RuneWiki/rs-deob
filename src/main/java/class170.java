import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class170 extends class141 {

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2780;

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)Z", line = 5)
    public final boolean method974(int arg0) {
        return arg0 == 0 ? true : true;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 14)
    public class170(Object arg0) {
        this.field2780 = new SoftReference(arg0);
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 23)
    public final Object method972(int arg0) {
        if (arg0 != -3490) {
            this.method974(46);
        }
        return this.field2780.get();
    }
}
