import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class202 extends class365 {

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field2796;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method1342(int arg0) {
        if (arg0 != 16034) {
            this.method1343((byte) 54);
        }
        return this.field2796.get();
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lbc;Ljava/lang/Object;)V")
    public class202(class103 arg0, Object arg1) {
        super(arg0);
        this.field2796 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)Z")
    public final boolean method1343(byte arg0) {
        int var2 = -44 % ((45 - arg0) / 36);
        return true;
    }
}
