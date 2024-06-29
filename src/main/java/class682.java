import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class682 extends class73 {

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field9491;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)Z", line = 5)
    public final boolean method20(int arg0) {
        return arg0 == 896 ? true : true;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lsn;Ljava/lang/Object;I)V", line = 14)
    public class682(class630 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field9491 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method19(int arg0) {
        int var2 = 76 % ((-arg0 - 54) / 41);
        return this.field9491.get();
    }
}
