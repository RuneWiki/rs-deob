import java.lang.ref.SoftReference;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class132 extends class325 {

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "Ljava/lang/ref/SoftReference;")
    private SoftReference field1683;

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Lqa;Ljava/lang/Object;I)V", line = 4)
    public class132(class155 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1683 = new SoftReference(arg1);
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)Z", line = 14)
    public final boolean method728(int arg0) {
        int var2 = -124 % ((13 - arg0) / 58);
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)Ljava/lang/Object;", line = 24)
    public final Object method729(int arg0) {
        int var2 = -19 / ((arg0 + 32) / 46);
        return this.field1683.get();
    }
}
