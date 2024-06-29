import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class197 extends class54 {

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field3152;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 6)
    public final Object method430(byte arg0) {
        int var2 = -125 / ((12 - arg0) / 61);
        return this.field3152.get();
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)Z", line = 15)
    public final boolean method424(int arg0) {
        return arg0 == 0;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 23)
    public class197(Object arg0) {
        this.field3152 = new SoftReference(arg0);
    }
}
